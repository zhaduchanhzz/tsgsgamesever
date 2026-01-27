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

public final class HeroPalaceMsg {
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_NoticeInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_NoticeInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_C2S_OpenMainUi_18401_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_C2S_OpenMainUi_18401_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_S2C_OpenMainUi_18402_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_S2C_OpenMainUi_18402_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_C2S_NoticeUi_18403_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_C2S_NoticeUi_18403_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_S2C_NoticeUi_18404_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_S2C_NoticeUi_18404_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_C2S_ShareHero_18405_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_C2S_ShareHero_18405_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_S2C_ShareHero_18406_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_S2C_ShareHero_18406_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_C2S_NoticePlay_18407_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_C2S_NoticePlay_18407_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_S2C_NoticePlay_18408_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_S2C_NoticePlay_18408_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_C2S_ShareHeroPreview_18409_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_C2S_ShareHeroPreview_18409_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_S2C_ShareHeroPreview_18410_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_S2C_ShareHeroPreview_18410_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_C2S_LearnHeroSkill_18411_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_C2S_LearnHeroSkill_18411_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_S2C_LearnHeroSkill_18412_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_S2C_LearnHeroSkill_18412_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockKingSkill_18413_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockKingSkill_18413_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockKingSkill_18414_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockKingSkill_18414_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockDestinySkill_18421_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockDestinySkill_18421_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockDestinySkill_18422_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockDestinySkill_18422_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradeDestinySkill_18423_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradeDestinySkill_18423_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradeDestinySkill_18424_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradeDestinySkill_18424_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_C2S_LearnDestinySkill_18425_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_C2S_LearnDestinySkill_18425_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_S2C_LearnDestinySkill_18426_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_S2C_LearnDestinySkill_18426_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_C2S_OpenHeroSkillUi_18431_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_C2S_OpenHeroSkillUi_18431_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_S2C_OpenHeroSkillUi_18432_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_S2C_OpenHeroSkillUi_18432_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockHeroSkill_18433_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockHeroSkill_18433_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockHeroSkill_18434_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockHeroSkill_18434_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradeHeroSkill_18435_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradeHeroSkill_18435_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradeHeroSkill_18436_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradeHeroSkill_18436_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_C2S_ResetHeroSkill_18437_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_C2S_ResetHeroSkill_18437_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_S2C_ResetHeroSkill_18438_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_S2C_ResetHeroSkill_18438_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_C2S_PalaceTitle_18441_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_C2S_PalaceTitle_18441_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_S2C_PalaceTitle_18442_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_S2C_PalaceTitle_18442_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradePalaceTitle_18443_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradePalaceTitle_18443_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradePalaceTitle_18444_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradePalaceTitle_18444_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockPlaceHeroDress_18445_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockPlaceHeroDress_18445_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockPlaceHeroDress_18446_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockPlaceHeroDress_18446_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_SoulHeroDictionary_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_SoulHeroDictionary_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_C2S_SoulPalace_18451_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_C2S_SoulPalace_18451_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_S2C_SoulPalace_18452_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_S2C_SoulPalace_18452_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_C2S_SoulPalaceActive_18453_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_C2S_SoulPalaceActive_18453_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroPalace_com_gzbz_protobuf_S2C_SoulPalaceActive_18454_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroPalace_com_gzbz_protobuf_S2C_SoulPalaceActive_18454_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private HeroPalaceMsg() {
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
      String[] descriptorData = new String[]{"\n\u0010HeroPalace.proto\u0012\u001cheroPalace.com.gzbz.protobuf\u001a\fcommon.proto\"V\n\nNoticeInfo\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012<\n\u0004type\u0018\u0002 \u0002(\u000e2..heroPalace.com.gzbz.protobuf.NoticeUnlockType\"\u0016\n\u0014C2S_OpenMainUi_18401\"Þ\u0001\n\u0014S2C_OpenMainUi_18402\u0012\u000f\n\u0007titleLv\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bheroCode\u0018\u0002 \u0002(\u0005\u0012\u0011\n\tshareCode\u0018\u0003 \u0002(\u0005\u0012!\n\u0006skills\u0018\u0004 \u0003(\u000b2\u0011.common.MapDataII\u0012\u0014\n\fheroSkillDir\u0018\u0005 \u0003(\u0005\u0012\u0017\n\u000fdestinySkillDir\u0018\u0006 \u0003(\u0005\u0012\u0014\n\fkingSkillDir\u0018\u0007 \u0003(\u0005\u0012(\n\rdestinySkills\u0018\b \u0003(\u000b2\u0011.common.MapDataII\"\u0014\n\u0012C2S_NoticeUi_18403\"M\n\u0012S2C_NoticeUi_18404\u00127\n\u0005infos\u0018\u0001 \u0003(\u000b2(.heroPalace.com.gzbz.protobuf.NoticeInfo\"^\n\u0013C2S_ShareHero_18405\u00125\n\u0004type\u0018\u0001 \u0002(\u000e2'.heroPalace.com.gzbz.protobuf.ShareType\u0012\u0010\n\bheroCode\u0018\u0002 \u0002(\u0005\"\u008f\u0001\n\u0013S2C_ShareHero_18406\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u00125\n\u0004type\u0018\u0002 \u0002(\u000e2'.heroPalace.com.gzbz.protobuf.ShareType\u0012\u0010\n\bheroCode\u0018\u0003 \u0002(\u0005\u0012\u001f\n\u0005items\u0018\u0004 \u0003(\u000b2\u0010.common.ItemInfo\"\"\n\u0014C2S_NoticePlay_18407\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"&\n\u0014S2C_NoticePlay_18408\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\".\n\u001aC2S_ShareHeroPreview_18409\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\"@\n\u001aS2C_ShareHeroPreview_18410\u0012\"\n\bheroInfo\u0018\u0001 \u0002(\u000b2\u0010.common.HeroInfo\"*\n\u0018C2S_LearnHeroSkill_18411\u0012\u000e\n\u0006skills\u0018\u0001 \u0003(\u0005\"*\n\u0018S2C_LearnHeroSkill_18412\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\":\n\u0019C2S_UnlockKingSkill_18413\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u0011\n\theroCodes\u0018\u0002 \u0003(\u0005\"M\n\u0019S2C_UnlockKingSkill_18414\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0002(\u0005\u0012\u0014\n\fkingSkillDir\u0018\u0003 \u0003(\u0005\"/\n\u001cC2S_UnlockDestinySkill_18421\u0012\u000f\n\u0007skillId\u0018\u0001 \u0002(\u0005\"X\n\u001cS2C_UnlockDestinySkill_18422\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007skillId\u0018\u0002 \u0002(\u0005\u0012\u0017\n\u000fdestinySkillDir\u0018\u0003 \u0003(\u0005\"0\n\u001dC2S_UpgradeDestinySkill_18423\u0012\u000f\n\u0007skillId\u0018\u0001 \u0002(\u0005\"Y\n\u001dS2C_UpgradeDestinySkill_18424\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007skillId\u0018\u0002 \u0002(\u0005\u0012\u0017\n\u000fdestinySkillDir\u0018\u0003 \u0003(\u0005\"-\n\u001bC2S_LearnDestinySkill_18425\u0012\u000e\n\u0006skills\u0018\u0001 \u0003(\u0005\"-\n\u001bS2C_LearnDestinySkill_18426\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"\u001b\n\u0019C2S_OpenHeroSkillUi_18431\"\u001b\n\u0019S2C_OpenHeroSkillUi_18432\"?\n\u0019C2S_UnlockHeroSkill_18433\u0012\u000f\n\u0007skillId\u0018\u0001 \u0002(\u0005\u0012\u0011\n\theroCodes\u0018\u0002 \u0003(\u0005\"R\n\u0019S2C_UnlockHeroSkill_18434\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007skillId\u0018\u0002 \u0002(\u0005\u0012\u0014\n\fheroSkillDir\u0018\u0003 \u0003(\u0005\"@\n\u001aC2S_UpgradeHeroSkill_18435\u0012\u000f\n\u0007skillId\u0018\u0001 \u0002(\u0005\u0012\u0011\n\theroCodes\u0018\u0002 \u0003(\u0005\"g\n\u001aS2C_UpgradeHeroSkill_18436\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007skillId\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nnewSkillId\u0018\u0003 \u0002(\u0005\u0012\u0014\n\fheroSkillDir\u0018\u0004 \u0003(\u0005\"+\n\u0018C2S_ResetHeroSkill_18437\u0012\u000f\n\u0007skillId\u0018\u0001 \u0002(\u0005\"e\n\u0018S2C_ResetHeroSkill_18438\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007skillId\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nnewSkillId\u0018\u0003 \u0002(\u0005\u0012\u0014\n\fheroSkillDir\u0018\u0004 \u0003(\u0005\"\u0017\n\u0015C2S_PalaceTitle_18441\"\u0017\n\u0015S2C_PalaceTitle_18442\"\u001e\n\u001cC2S_UpgradePalaceTitle_18443\"?\n\u001cS2C_UpgradePalaceTitle_18444\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007titleId\u0018\u0002 \u0002(\u0005\"5\n\u001eC2S_UnlockPlaceHeroDress_18445\u0012\u0013\n\u000bheroDressId\u0018\u0001 \u0002(\u0005\"5\n\u001eS2C_UnlockPlaceHeroDress_18446\u0012\u0013\n\u000bheroDressId\u0018\u0001 \u0002(\u0005\"D\n\u0012SoulHeroDictionary\u0012\u000e\n\u0006heroId\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007maxStar\u0018\u0003 \u0002(\u0005\"\u0016\n\u0014C2S_SoulPalace_18451\"\\\n\u0014S2C_SoulPalace_18452\u0012D\n\ndictionary\u0018\u0001 \u0003(\u000b20.heroPalace.com.gzbz.protobuf.SoulHeroDictionary\";\n\u001aC2S_SoulPalaceActive_18453\u0012\u000e\n\u0006heroId\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0002 \u0002(\u0005\";\n\u001aS2C_SoulPalaceActive_18454\u0012\u000e\n\u0006heroId\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0002 \u0002(\u0005*3\n\u0010NoticeUnlockType\u0012\u0010\n\fTYPE_NO_PLAY\u0010\u0000\u0012\r\n\tTYPE_PLAY\u0010\u0001*6\n\tShareType\u0012\u0013\n\u000fSHARETYPE_SHARE\u0010\u0001\u0012\u0014\n\u0010SHARETYPE_UPDATE\u0010\u0002B$\n\u0011com.gzbz.protobufB\rHeroPalaceMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_heroPalace_com_gzbz_protobuf_NoticeInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_heroPalace_com_gzbz_protobuf_NoticeInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_NoticeInfo_descriptor, new String[]{"Id", "Type"});
      internal_static_heroPalace_com_gzbz_protobuf_C2S_OpenMainUi_18401_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_heroPalace_com_gzbz_protobuf_C2S_OpenMainUi_18401_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_C2S_OpenMainUi_18401_descriptor, new String[0]);
      internal_static_heroPalace_com_gzbz_protobuf_S2C_OpenMainUi_18402_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_heroPalace_com_gzbz_protobuf_S2C_OpenMainUi_18402_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_S2C_OpenMainUi_18402_descriptor, new String[]{"TitleLv", "HeroCode", "ShareCode", "Skills", "HeroSkillDir", "DestinySkillDir", "KingSkillDir", "DestinySkills"});
      internal_static_heroPalace_com_gzbz_protobuf_C2S_NoticeUi_18403_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_heroPalace_com_gzbz_protobuf_C2S_NoticeUi_18403_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_C2S_NoticeUi_18403_descriptor, new String[0]);
      internal_static_heroPalace_com_gzbz_protobuf_S2C_NoticeUi_18404_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_heroPalace_com_gzbz_protobuf_S2C_NoticeUi_18404_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_S2C_NoticeUi_18404_descriptor, new String[]{"Infos"});
      internal_static_heroPalace_com_gzbz_protobuf_C2S_ShareHero_18405_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_heroPalace_com_gzbz_protobuf_C2S_ShareHero_18405_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_C2S_ShareHero_18405_descriptor, new String[]{"Type", "HeroCode"});
      internal_static_heroPalace_com_gzbz_protobuf_S2C_ShareHero_18406_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_heroPalace_com_gzbz_protobuf_S2C_ShareHero_18406_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_S2C_ShareHero_18406_descriptor, new String[]{"Result", "Type", "HeroCode", "Items"});
      internal_static_heroPalace_com_gzbz_protobuf_C2S_NoticePlay_18407_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_heroPalace_com_gzbz_protobuf_C2S_NoticePlay_18407_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_C2S_NoticePlay_18407_descriptor, new String[]{"Id"});
      internal_static_heroPalace_com_gzbz_protobuf_S2C_NoticePlay_18408_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_heroPalace_com_gzbz_protobuf_S2C_NoticePlay_18408_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_S2C_NoticePlay_18408_descriptor, new String[]{"Result"});
      internal_static_heroPalace_com_gzbz_protobuf_C2S_ShareHeroPreview_18409_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_heroPalace_com_gzbz_protobuf_C2S_ShareHeroPreview_18409_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_C2S_ShareHeroPreview_18409_descriptor, new String[]{"HeroCode"});
      internal_static_heroPalace_com_gzbz_protobuf_S2C_ShareHeroPreview_18410_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_heroPalace_com_gzbz_protobuf_S2C_ShareHeroPreview_18410_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_S2C_ShareHeroPreview_18410_descriptor, new String[]{"HeroInfo"});
      internal_static_heroPalace_com_gzbz_protobuf_C2S_LearnHeroSkill_18411_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_heroPalace_com_gzbz_protobuf_C2S_LearnHeroSkill_18411_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_C2S_LearnHeroSkill_18411_descriptor, new String[]{"Skills"});
      internal_static_heroPalace_com_gzbz_protobuf_S2C_LearnHeroSkill_18412_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_heroPalace_com_gzbz_protobuf_S2C_LearnHeroSkill_18412_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_S2C_LearnHeroSkill_18412_descriptor, new String[]{"Result"});
      internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockKingSkill_18413_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockKingSkill_18413_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockKingSkill_18413_descriptor, new String[]{"Id", "HeroCodes"});
      internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockKingSkill_18414_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockKingSkill_18414_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockKingSkill_18414_descriptor, new String[]{"Result", "Id", "KingSkillDir"});
      internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockDestinySkill_18421_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockDestinySkill_18421_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockDestinySkill_18421_descriptor, new String[]{"SkillId"});
      internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockDestinySkill_18422_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockDestinySkill_18422_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockDestinySkill_18422_descriptor, new String[]{"Result", "SkillId", "DestinySkillDir"});
      internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradeDestinySkill_18423_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradeDestinySkill_18423_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradeDestinySkill_18423_descriptor, new String[]{"SkillId"});
      internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradeDestinySkill_18424_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradeDestinySkill_18424_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradeDestinySkill_18424_descriptor, new String[]{"Result", "SkillId", "DestinySkillDir"});
      internal_static_heroPalace_com_gzbz_protobuf_C2S_LearnDestinySkill_18425_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_heroPalace_com_gzbz_protobuf_C2S_LearnDestinySkill_18425_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_C2S_LearnDestinySkill_18425_descriptor, new String[]{"Skills"});
      internal_static_heroPalace_com_gzbz_protobuf_S2C_LearnDestinySkill_18426_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_heroPalace_com_gzbz_protobuf_S2C_LearnDestinySkill_18426_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_S2C_LearnDestinySkill_18426_descriptor, new String[]{"Result"});
      internal_static_heroPalace_com_gzbz_protobuf_C2S_OpenHeroSkillUi_18431_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_heroPalace_com_gzbz_protobuf_C2S_OpenHeroSkillUi_18431_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_C2S_OpenHeroSkillUi_18431_descriptor, new String[0]);
      internal_static_heroPalace_com_gzbz_protobuf_S2C_OpenHeroSkillUi_18432_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_heroPalace_com_gzbz_protobuf_S2C_OpenHeroSkillUi_18432_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_S2C_OpenHeroSkillUi_18432_descriptor, new String[0]);
      internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockHeroSkill_18433_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockHeroSkill_18433_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockHeroSkill_18433_descriptor, new String[]{"SkillId", "HeroCodes"});
      internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockHeroSkill_18434_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockHeroSkill_18434_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockHeroSkill_18434_descriptor, new String[]{"Result", "SkillId", "HeroSkillDir"});
      internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradeHeroSkill_18435_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradeHeroSkill_18435_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradeHeroSkill_18435_descriptor, new String[]{"SkillId", "HeroCodes"});
      internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradeHeroSkill_18436_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradeHeroSkill_18436_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradeHeroSkill_18436_descriptor, new String[]{"Result", "SkillId", "NewSkillId", "HeroSkillDir"});
      internal_static_heroPalace_com_gzbz_protobuf_C2S_ResetHeroSkill_18437_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_heroPalace_com_gzbz_protobuf_C2S_ResetHeroSkill_18437_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_C2S_ResetHeroSkill_18437_descriptor, new String[]{"SkillId"});
      internal_static_heroPalace_com_gzbz_protobuf_S2C_ResetHeroSkill_18438_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_heroPalace_com_gzbz_protobuf_S2C_ResetHeroSkill_18438_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_S2C_ResetHeroSkill_18438_descriptor, new String[]{"Result", "SkillId", "NewSkillId", "HeroSkillDir"});
      internal_static_heroPalace_com_gzbz_protobuf_C2S_PalaceTitle_18441_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_heroPalace_com_gzbz_protobuf_C2S_PalaceTitle_18441_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_C2S_PalaceTitle_18441_descriptor, new String[0]);
      internal_static_heroPalace_com_gzbz_protobuf_S2C_PalaceTitle_18442_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_heroPalace_com_gzbz_protobuf_S2C_PalaceTitle_18442_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_S2C_PalaceTitle_18442_descriptor, new String[0]);
      internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradePalaceTitle_18443_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradePalaceTitle_18443_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradePalaceTitle_18443_descriptor, new String[0]);
      internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradePalaceTitle_18444_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradePalaceTitle_18444_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradePalaceTitle_18444_descriptor, new String[]{"Result", "TitleId"});
      internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockPlaceHeroDress_18445_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockPlaceHeroDress_18445_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockPlaceHeroDress_18445_descriptor, new String[]{"HeroDressId"});
      internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockPlaceHeroDress_18446_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockPlaceHeroDress_18446_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockPlaceHeroDress_18446_descriptor, new String[]{"HeroDressId"});
      internal_static_heroPalace_com_gzbz_protobuf_SoulHeroDictionary_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(35);
      internal_static_heroPalace_com_gzbz_protobuf_SoulHeroDictionary_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_SoulHeroDictionary_descriptor, new String[]{"HeroId", "Level", "MaxStar"});
      internal_static_heroPalace_com_gzbz_protobuf_C2S_SoulPalace_18451_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(36);
      internal_static_heroPalace_com_gzbz_protobuf_C2S_SoulPalace_18451_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_C2S_SoulPalace_18451_descriptor, new String[0]);
      internal_static_heroPalace_com_gzbz_protobuf_S2C_SoulPalace_18452_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(37);
      internal_static_heroPalace_com_gzbz_protobuf_S2C_SoulPalace_18452_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_S2C_SoulPalace_18452_descriptor, new String[]{"Dictionary"});
      internal_static_heroPalace_com_gzbz_protobuf_C2S_SoulPalaceActive_18453_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(38);
      internal_static_heroPalace_com_gzbz_protobuf_C2S_SoulPalaceActive_18453_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_C2S_SoulPalaceActive_18453_descriptor, new String[]{"HeroId", "Level"});
      internal_static_heroPalace_com_gzbz_protobuf_S2C_SoulPalaceActive_18454_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(39);
      internal_static_heroPalace_com_gzbz_protobuf_S2C_SoulPalaceActive_18454_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroPalace_com_gzbz_protobuf_S2C_SoulPalaceActive_18454_descriptor, new String[]{"HeroId", "Level"});
      CommonMsg.getDescriptor();
   }

   public static enum NoticeUnlockType implements ProtocolMessageEnum {
      TYPE_NO_PLAY(0),
      TYPE_PLAY(1);

      public static final int TYPE_NO_PLAY_VALUE = 0;
      public static final int TYPE_PLAY_VALUE = 1;
      private static final Internal.EnumLiteMap<NoticeUnlockType> internalValueMap = new Internal.EnumLiteMap<NoticeUnlockType>() {
         public NoticeUnlockType findValueByNumber(int number) {
            return HeroPalaceMsg.NoticeUnlockType.forNumber(number);
         }
      };
      private static final NoticeUnlockType[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static NoticeUnlockType valueOf(int value) {
         return forNumber(value);
      }

      public static NoticeUnlockType forNumber(int value) {
         switch (value) {
            case 0:
               return TYPE_NO_PLAY;
            case 1:
               return TYPE_PLAY;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<NoticeUnlockType> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)HeroPalaceMsg.getDescriptor().getEnumTypes().get(0);
      }

      public static NoticeUnlockType valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private NoticeUnlockType(int value) {
         this.value = value;
      }
   }

   public static enum ShareType implements ProtocolMessageEnum {
      SHARETYPE_SHARE(1),
      SHARETYPE_UPDATE(2);

      public static final int SHARETYPE_SHARE_VALUE = 1;
      public static final int SHARETYPE_UPDATE_VALUE = 2;
      private static final Internal.EnumLiteMap<ShareType> internalValueMap = new Internal.EnumLiteMap<ShareType>() {
         public ShareType findValueByNumber(int number) {
            return HeroPalaceMsg.ShareType.forNumber(number);
         }
      };
      private static final ShareType[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static ShareType valueOf(int value) {
         return forNumber(value);
      }

      public static ShareType forNumber(int value) {
         switch (value) {
            case 1:
               return SHARETYPE_SHARE;
            case 2:
               return SHARETYPE_UPDATE;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<ShareType> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)HeroPalaceMsg.getDescriptor().getEnumTypes().get(1);
      }

      public static ShareType valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private ShareType(int value) {
         this.value = value;
      }
   }

   public static final class NoticeInfo extends GeneratedMessageV3 implements NoticeInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      private byte memoizedIsInitialized;
      private static final NoticeInfo DEFAULT_INSTANCE = new NoticeInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<NoticeInfo> PARSER = new AbstractParser<NoticeInfo>() {
         public NoticeInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new NoticeInfo(input, extensionRegistry);
         }
      };

      private NoticeInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private NoticeInfo() {
         this.memoizedIsInitialized = -1;
         this.type_ = 0;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new NoticeInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private NoticeInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        int rawValue = input.readEnum();
                        NoticeUnlockType value = HeroPalaceMsg.NoticeUnlockType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.type_ = rawValue;
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
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_NoticeInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_NoticeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(NoticeInfo.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 2) != 0;
      }

      public NoticeUnlockType getType() {
         NoticeUnlockType result = HeroPalaceMsg.NoticeUnlockType.valueOf(this.type_);
         return result == null ? HeroPalaceMsg.NoticeUnlockType.TYPE_NO_PLAY : result;
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
            output.writeInt32(1, this.id_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.type_);
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
               size += CodedOutputStream.computeEnumSize(2, this.type_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof NoticeInfo)) {
            return super.equals(obj);
         } else {
            NoticeInfo other = (NoticeInfo)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.type_ != other.type_) {
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

            if (this.hasType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.type_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static NoticeInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (NoticeInfo)PARSER.parseFrom(data);
      }

      public static NoticeInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (NoticeInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static NoticeInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (NoticeInfo)PARSER.parseFrom(data);
      }

      public static NoticeInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (NoticeInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static NoticeInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (NoticeInfo)PARSER.parseFrom(data);
      }

      public static NoticeInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (NoticeInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static NoticeInfo parseFrom(InputStream input) throws IOException {
         return (NoticeInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static NoticeInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (NoticeInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static NoticeInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (NoticeInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static NoticeInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (NoticeInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static NoticeInfo parseFrom(CodedInputStream input) throws IOException {
         return (NoticeInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static NoticeInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (NoticeInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(NoticeInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static NoticeInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<NoticeInfo> parser() {
         return PARSER;
      }

      public Parser<NoticeInfo> getParserForType() {
         return PARSER;
      }

      public NoticeInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NoticeInfoOrBuilder {
         private int bitField0_;
         private int id_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_NoticeInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_NoticeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(NoticeInfo.class, Builder.class);
         }

         private Builder() {
            this.type_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.type_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.NoticeInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_NoticeInfo_descriptor;
         }

         public NoticeInfo getDefaultInstanceForType() {
            return HeroPalaceMsg.NoticeInfo.getDefaultInstance();
         }

         public NoticeInfo build() {
            NoticeInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public NoticeInfo buildPartial() {
            NoticeInfo result = new NoticeInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.type_ = this.type_;
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
            if (other instanceof NoticeInfo) {
               return this.mergeFrom((NoticeInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(NoticeInfo other) {
            if (other == HeroPalaceMsg.NoticeInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
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
            if (!this.hasId()) {
               return false;
            } else {
               return this.hasType();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            NoticeInfo parsedMessage = null;

            try {
               parsedMessage = (NoticeInfo)HeroPalaceMsg.NoticeInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (NoticeInfo)e.getUnfinishedMessage();
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

         public boolean hasType() {
            return (this.bitField0_ & 2) != 0;
         }

         public NoticeUnlockType getType() {
            NoticeUnlockType result = HeroPalaceMsg.NoticeUnlockType.valueOf(this.type_);
            return result == null ? HeroPalaceMsg.NoticeUnlockType.TYPE_NO_PLAY : result;
         }

         public Builder setType(NoticeUnlockType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.type_ = value.getNumber();
               this.onChanged();
               return this;
            }
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

   public static final class C2S_OpenMainUi_18401 extends GeneratedMessageV3 implements C2S_OpenMainUi_18401OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OpenMainUi_18401 DEFAULT_INSTANCE = new C2S_OpenMainUi_18401();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenMainUi_18401> PARSER = new AbstractParser<C2S_OpenMainUi_18401>() {
         public C2S_OpenMainUi_18401 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenMainUi_18401(input, extensionRegistry);
         }
      };

      private C2S_OpenMainUi_18401(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenMainUi_18401() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenMainUi_18401();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenMainUi_18401(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_OpenMainUi_18401_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_OpenMainUi_18401_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenMainUi_18401.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenMainUi_18401)) {
            return super.equals(obj);
         } else {
            C2S_OpenMainUi_18401 other = (C2S_OpenMainUi_18401)obj;
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

      public static C2S_OpenMainUi_18401 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenMainUi_18401)PARSER.parseFrom(data);
      }

      public static C2S_OpenMainUi_18401 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenMainUi_18401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenMainUi_18401 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenMainUi_18401)PARSER.parseFrom(data);
      }

      public static C2S_OpenMainUi_18401 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenMainUi_18401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenMainUi_18401 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenMainUi_18401)PARSER.parseFrom(data);
      }

      public static C2S_OpenMainUi_18401 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenMainUi_18401)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenMainUi_18401 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenMainUi_18401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenMainUi_18401 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenMainUi_18401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenMainUi_18401 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenMainUi_18401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenMainUi_18401 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenMainUi_18401)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenMainUi_18401 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenMainUi_18401)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenMainUi_18401 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenMainUi_18401)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenMainUi_18401 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenMainUi_18401 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenMainUi_18401> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenMainUi_18401> getParserForType() {
         return PARSER;
      }

      public C2S_OpenMainUi_18401 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenMainUi_18401OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_OpenMainUi_18401_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_OpenMainUi_18401_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenMainUi_18401.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.C2S_OpenMainUi_18401.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_OpenMainUi_18401_descriptor;
         }

         public C2S_OpenMainUi_18401 getDefaultInstanceForType() {
            return HeroPalaceMsg.C2S_OpenMainUi_18401.getDefaultInstance();
         }

         public C2S_OpenMainUi_18401 build() {
            C2S_OpenMainUi_18401 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenMainUi_18401 buildPartial() {
            C2S_OpenMainUi_18401 result = new C2S_OpenMainUi_18401(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_OpenMainUi_18401) {
               return this.mergeFrom((C2S_OpenMainUi_18401)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenMainUi_18401 other) {
            if (other == HeroPalaceMsg.C2S_OpenMainUi_18401.getDefaultInstance()) {
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
            C2S_OpenMainUi_18401 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenMainUi_18401)HeroPalaceMsg.C2S_OpenMainUi_18401.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenMainUi_18401)e.getUnfinishedMessage();
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

   public static final class S2C_OpenMainUi_18402 extends GeneratedMessageV3 implements S2C_OpenMainUi_18402OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TITLELV_FIELD_NUMBER = 1;
      private int titleLv_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private int heroCode_;
      public static final int SHARECODE_FIELD_NUMBER = 3;
      private int shareCode_;
      public static final int SKILLS_FIELD_NUMBER = 4;
      private List<CommonMsg.MapDataII> skills_;
      public static final int HEROSKILLDIR_FIELD_NUMBER = 5;
      private Internal.IntList heroSkillDir_;
      public static final int DESTINYSKILLDIR_FIELD_NUMBER = 6;
      private Internal.IntList destinySkillDir_;
      public static final int KINGSKILLDIR_FIELD_NUMBER = 7;
      private Internal.IntList kingSkillDir_;
      public static final int DESTINYSKILLS_FIELD_NUMBER = 8;
      private List<CommonMsg.MapDataII> destinySkills_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenMainUi_18402 DEFAULT_INSTANCE = new S2C_OpenMainUi_18402();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenMainUi_18402> PARSER = new AbstractParser<S2C_OpenMainUi_18402>() {
         public S2C_OpenMainUi_18402 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenMainUi_18402(input, extensionRegistry);
         }
      };

      private S2C_OpenMainUi_18402(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenMainUi_18402() {
         this.memoizedIsInitialized = -1;
         this.skills_ = Collections.emptyList();
         this.heroSkillDir_ = emptyIntList();
         this.destinySkillDir_ = emptyIntList();
         this.kingSkillDir_ = emptyIntList();
         this.destinySkills_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenMainUi_18402();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenMainUi_18402(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.titleLv_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.heroCode_ = input.readInt32();
                        continue;
                     case 24:
                        this.bitField0_ |= 4;
                        this.shareCode_ = input.readInt32();
                        continue;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.skills_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.skills_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        continue;
                     case 40:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.heroSkillDir_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }

                        this.heroSkillDir_.addInt(input.readInt32());
                        continue;
                     case 42:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 16) == 0 && input.getBytesUntilLimit() > 0) {
                           this.heroSkillDir_ = newIntList();
                           mutable_bitField0_ |= 16;
                        }
                        break;
                     case 48:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.destinySkillDir_ = newIntList();
                           mutable_bitField0_ |= 32;
                        }

                        this.destinySkillDir_.addInt(input.readInt32());
                        continue;
                     case 50:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 32) == 0 && input.getBytesUntilLimit() > 0) {
                           this.destinySkillDir_ = newIntList();
                           mutable_bitField0_ |= 32;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.destinySkillDir_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 56:
                        if ((mutable_bitField0_ & 64) == 0) {
                           this.kingSkillDir_ = newIntList();
                           mutable_bitField0_ |= 64;
                        }

                        this.kingSkillDir_.addInt(input.readInt32());
                        continue;
                     case 58:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 64) == 0 && input.getBytesUntilLimit() > 0) {
                           this.kingSkillDir_ = newIntList();
                           mutable_bitField0_ |= 64;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.kingSkillDir_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 66:
                        if ((mutable_bitField0_ & 128) == 0) {
                           this.destinySkills_ = new ArrayList();
                           mutable_bitField0_ |= 128;
                        }

                        this.destinySkills_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.heroSkillDir_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 8) != 0) {
                  this.skills_ = Collections.unmodifiableList(this.skills_);
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.heroSkillDir_.makeImmutable();
               }

               if ((mutable_bitField0_ & 32) != 0) {
                  this.destinySkillDir_.makeImmutable();
               }

               if ((mutable_bitField0_ & 64) != 0) {
                  this.kingSkillDir_.makeImmutable();
               }

               if ((mutable_bitField0_ & 128) != 0) {
                  this.destinySkills_ = Collections.unmodifiableList(this.destinySkills_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_OpenMainUi_18402_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_OpenMainUi_18402_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenMainUi_18402.class, Builder.class);
      }

      public boolean hasTitleLv() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTitleLv() {
         return this.titleLv_;
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasShareCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getShareCode() {
         return this.shareCode_;
      }

      public List<CommonMsg.MapDataII> getSkillsList() {
         return this.skills_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getSkillsOrBuilderList() {
         return this.skills_;
      }

      public int getSkillsCount() {
         return this.skills_.size();
      }

      public CommonMsg.MapDataII getSkills(int index) {
         return (CommonMsg.MapDataII)this.skills_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getSkillsOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.skills_.get(index);
      }

      public List<Integer> getHeroSkillDirList() {
         return this.heroSkillDir_;
      }

      public int getHeroSkillDirCount() {
         return this.heroSkillDir_.size();
      }

      public int getHeroSkillDir(int index) {
         return this.heroSkillDir_.getInt(index);
      }

      public List<Integer> getDestinySkillDirList() {
         return this.destinySkillDir_;
      }

      public int getDestinySkillDirCount() {
         return this.destinySkillDir_.size();
      }

      public int getDestinySkillDir(int index) {
         return this.destinySkillDir_.getInt(index);
      }

      public List<Integer> getKingSkillDirList() {
         return this.kingSkillDir_;
      }

      public int getKingSkillDirCount() {
         return this.kingSkillDir_.size();
      }

      public int getKingSkillDir(int index) {
         return this.kingSkillDir_.getInt(index);
      }

      public List<CommonMsg.MapDataII> getDestinySkillsList() {
         return this.destinySkills_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getDestinySkillsOrBuilderList() {
         return this.destinySkills_;
      }

      public int getDestinySkillsCount() {
         return this.destinySkills_.size();
      }

      public CommonMsg.MapDataII getDestinySkills(int index) {
         return (CommonMsg.MapDataII)this.destinySkills_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getDestinySkillsOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.destinySkills_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTitleLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasShareCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getSkillsCount(); ++i) {
               if (!this.getSkills(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getDestinySkillsCount(); ++i) {
               if (!this.getDestinySkills(i).isInitialized()) {
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
            output.writeInt32(1, this.titleLv_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.heroCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.shareCode_);
         }

         for(int i = 0; i < this.skills_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.skills_.get(i));
         }

         for(int i = 0; i < this.heroSkillDir_.size(); ++i) {
            output.writeInt32(5, this.heroSkillDir_.getInt(i));
         }

         for(int i = 0; i < this.destinySkillDir_.size(); ++i) {
            output.writeInt32(6, this.destinySkillDir_.getInt(i));
         }

         for(int i = 0; i < this.kingSkillDir_.size(); ++i) {
            output.writeInt32(7, this.kingSkillDir_.getInt(i));
         }

         for(int i = 0; i < this.destinySkills_.size(); ++i) {
            output.writeMessage(8, (MessageLite)this.destinySkills_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.titleLv_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.heroCode_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.shareCode_);
            }

            for(int i = 0; i < this.skills_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.skills_.get(i));
            }

            int dataSize = 0;

            for(int i = 0; i < this.heroSkillDir_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.heroSkillDir_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHeroSkillDirList().size();
            dataSize = 0;

            for(int i = 0; i < this.destinySkillDir_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.destinySkillDir_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getDestinySkillDirList().size();
            dataSize = 0;

            for(int i = 0; i < this.kingSkillDir_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.kingSkillDir_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getKingSkillDirList().size();

            for(int i = 0; i < this.destinySkills_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(8, (MessageLite)this.destinySkills_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OpenMainUi_18402)) {
            return super.equals(obj);
         } else {
            S2C_OpenMainUi_18402 other = (S2C_OpenMainUi_18402)obj;
            if (this.hasTitleLv() != other.hasTitleLv()) {
               return false;
            } else if (this.hasTitleLv() && this.getTitleLv() != other.getTitleLv()) {
               return false;
            } else if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasShareCode() != other.hasShareCode()) {
               return false;
            } else if (this.hasShareCode() && this.getShareCode() != other.getShareCode()) {
               return false;
            } else if (!this.getSkillsList().equals(other.getSkillsList())) {
               return false;
            } else if (!this.getHeroSkillDirList().equals(other.getHeroSkillDirList())) {
               return false;
            } else if (!this.getDestinySkillDirList().equals(other.getDestinySkillDirList())) {
               return false;
            } else if (!this.getKingSkillDirList().equals(other.getKingSkillDirList())) {
               return false;
            } else if (!this.getDestinySkillsList().equals(other.getDestinySkillsList())) {
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
            if (this.hasTitleLv()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTitleLv();
            }

            if (this.hasHeroCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.hasShareCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getShareCode();
            }

            if (this.getSkillsCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getSkillsList().hashCode();
            }

            if (this.getHeroSkillDirCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getHeroSkillDirList().hashCode();
            }

            if (this.getDestinySkillDirCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getDestinySkillDirList().hashCode();
            }

            if (this.getKingSkillDirCount() > 0) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getKingSkillDirList().hashCode();
            }

            if (this.getDestinySkillsCount() > 0) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getDestinySkillsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OpenMainUi_18402 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenMainUi_18402)PARSER.parseFrom(data);
      }

      public static S2C_OpenMainUi_18402 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenMainUi_18402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenMainUi_18402 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenMainUi_18402)PARSER.parseFrom(data);
      }

      public static S2C_OpenMainUi_18402 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenMainUi_18402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenMainUi_18402 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenMainUi_18402)PARSER.parseFrom(data);
      }

      public static S2C_OpenMainUi_18402 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenMainUi_18402)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenMainUi_18402 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenMainUi_18402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenMainUi_18402 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenMainUi_18402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenMainUi_18402 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenMainUi_18402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenMainUi_18402 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenMainUi_18402)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenMainUi_18402 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenMainUi_18402)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenMainUi_18402 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenMainUi_18402)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenMainUi_18402 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenMainUi_18402 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenMainUi_18402> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenMainUi_18402> getParserForType() {
         return PARSER;
      }

      public S2C_OpenMainUi_18402 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenMainUi_18402OrBuilder {
         private int bitField0_;
         private int titleLv_;
         private int heroCode_;
         private int shareCode_;
         private List<CommonMsg.MapDataII> skills_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> skillsBuilder_;
         private Internal.IntList heroSkillDir_;
         private Internal.IntList destinySkillDir_;
         private Internal.IntList kingSkillDir_;
         private List<CommonMsg.MapDataII> destinySkills_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> destinySkillsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_OpenMainUi_18402_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_OpenMainUi_18402_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenMainUi_18402.class, Builder.class);
         }

         private Builder() {
            this.skills_ = Collections.emptyList();
            this.heroSkillDir_ = HeroPalaceMsg.S2C_OpenMainUi_18402.emptyIntList();
            this.destinySkillDir_ = HeroPalaceMsg.S2C_OpenMainUi_18402.emptyIntList();
            this.kingSkillDir_ = HeroPalaceMsg.S2C_OpenMainUi_18402.emptyIntList();
            this.destinySkills_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.skills_ = Collections.emptyList();
            this.heroSkillDir_ = HeroPalaceMsg.S2C_OpenMainUi_18402.emptyIntList();
            this.destinySkillDir_ = HeroPalaceMsg.S2C_OpenMainUi_18402.emptyIntList();
            this.kingSkillDir_ = HeroPalaceMsg.S2C_OpenMainUi_18402.emptyIntList();
            this.destinySkills_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.S2C_OpenMainUi_18402.alwaysUseFieldBuilders) {
               this.getSkillsFieldBuilder();
               this.getDestinySkillsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.titleLv_ = 0;
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.bitField0_ &= -3;
            this.shareCode_ = 0;
            this.bitField0_ &= -5;
            if (this.skillsBuilder_ == null) {
               this.skills_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.skillsBuilder_.clear();
            }

            this.heroSkillDir_ = HeroPalaceMsg.S2C_OpenMainUi_18402.emptyIntList();
            this.bitField0_ &= -17;
            this.destinySkillDir_ = HeroPalaceMsg.S2C_OpenMainUi_18402.emptyIntList();
            this.bitField0_ &= -33;
            this.kingSkillDir_ = HeroPalaceMsg.S2C_OpenMainUi_18402.emptyIntList();
            this.bitField0_ &= -65;
            if (this.destinySkillsBuilder_ == null) {
               this.destinySkills_ = Collections.emptyList();
               this.bitField0_ &= -129;
            } else {
               this.destinySkillsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_OpenMainUi_18402_descriptor;
         }

         public S2C_OpenMainUi_18402 getDefaultInstanceForType() {
            return HeroPalaceMsg.S2C_OpenMainUi_18402.getDefaultInstance();
         }

         public S2C_OpenMainUi_18402 build() {
            S2C_OpenMainUi_18402 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenMainUi_18402 buildPartial() {
            S2C_OpenMainUi_18402 result = new S2C_OpenMainUi_18402(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.titleLv_ = this.titleLv_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.shareCode_ = this.shareCode_;
               to_bitField0_ |= 4;
            }

            if (this.skillsBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.skills_ = Collections.unmodifiableList(this.skills_);
                  this.bitField0_ &= -9;
               }

               result.skills_ = this.skills_;
            } else {
               result.skills_ = this.skillsBuilder_.build();
            }

            if ((this.bitField0_ & 16) != 0) {
               this.heroSkillDir_.makeImmutable();
               this.bitField0_ &= -17;
            }

            result.heroSkillDir_ = this.heroSkillDir_;
            if ((this.bitField0_ & 32) != 0) {
               this.destinySkillDir_.makeImmutable();
               this.bitField0_ &= -33;
            }

            result.destinySkillDir_ = this.destinySkillDir_;
            if ((this.bitField0_ & 64) != 0) {
               this.kingSkillDir_.makeImmutable();
               this.bitField0_ &= -65;
            }

            result.kingSkillDir_ = this.kingSkillDir_;
            if (this.destinySkillsBuilder_ == null) {
               if ((this.bitField0_ & 128) != 0) {
                  this.destinySkills_ = Collections.unmodifiableList(this.destinySkills_);
                  this.bitField0_ &= -129;
               }

               result.destinySkills_ = this.destinySkills_;
            } else {
               result.destinySkills_ = this.destinySkillsBuilder_.build();
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
            if (other instanceof S2C_OpenMainUi_18402) {
               return this.mergeFrom((S2C_OpenMainUi_18402)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenMainUi_18402 other) {
            if (other == HeroPalaceMsg.S2C_OpenMainUi_18402.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTitleLv()) {
                  this.setTitleLv(other.getTitleLv());
               }

               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasShareCode()) {
                  this.setShareCode(other.getShareCode());
               }

               if (this.skillsBuilder_ == null) {
                  if (!other.skills_.isEmpty()) {
                     if (this.skills_.isEmpty()) {
                        this.skills_ = other.skills_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureSkillsIsMutable();
                        this.skills_.addAll(other.skills_);
                     }

                     this.onChanged();
                  }
               } else if (!other.skills_.isEmpty()) {
                  if (this.skillsBuilder_.isEmpty()) {
                     this.skillsBuilder_.dispose();
                     this.skillsBuilder_ = null;
                     this.skills_ = other.skills_;
                     this.bitField0_ &= -9;
                     this.skillsBuilder_ = HeroPalaceMsg.S2C_OpenMainUi_18402.alwaysUseFieldBuilders ? this.getSkillsFieldBuilder() : null;
                  } else {
                     this.skillsBuilder_.addAllMessages(other.skills_);
                  }
               }

               if (!other.heroSkillDir_.isEmpty()) {
                  if (this.heroSkillDir_.isEmpty()) {
                     this.heroSkillDir_ = other.heroSkillDir_;
                     this.bitField0_ &= -17;
                  } else {
                     this.ensureHeroSkillDirIsMutable();
                     this.heroSkillDir_.addAll(other.heroSkillDir_);
                  }

                  this.onChanged();
               }

               if (!other.destinySkillDir_.isEmpty()) {
                  if (this.destinySkillDir_.isEmpty()) {
                     this.destinySkillDir_ = other.destinySkillDir_;
                     this.bitField0_ &= -33;
                  } else {
                     this.ensureDestinySkillDirIsMutable();
                     this.destinySkillDir_.addAll(other.destinySkillDir_);
                  }

                  this.onChanged();
               }

               if (!other.kingSkillDir_.isEmpty()) {
                  if (this.kingSkillDir_.isEmpty()) {
                     this.kingSkillDir_ = other.kingSkillDir_;
                     this.bitField0_ &= -65;
                  } else {
                     this.ensureKingSkillDirIsMutable();
                     this.kingSkillDir_.addAll(other.kingSkillDir_);
                  }

                  this.onChanged();
               }

               if (this.destinySkillsBuilder_ == null) {
                  if (!other.destinySkills_.isEmpty()) {
                     if (this.destinySkills_.isEmpty()) {
                        this.destinySkills_ = other.destinySkills_;
                        this.bitField0_ &= -129;
                     } else {
                        this.ensureDestinySkillsIsMutable();
                        this.destinySkills_.addAll(other.destinySkills_);
                     }

                     this.onChanged();
                  }
               } else if (!other.destinySkills_.isEmpty()) {
                  if (this.destinySkillsBuilder_.isEmpty()) {
                     this.destinySkillsBuilder_.dispose();
                     this.destinySkillsBuilder_ = null;
                     this.destinySkills_ = other.destinySkills_;
                     this.bitField0_ &= -129;
                     this.destinySkillsBuilder_ = HeroPalaceMsg.S2C_OpenMainUi_18402.alwaysUseFieldBuilders ? this.getDestinySkillsFieldBuilder() : null;
                  } else {
                     this.destinySkillsBuilder_.addAllMessages(other.destinySkills_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTitleLv()) {
               return false;
            } else if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasShareCode()) {
               return false;
            } else {
               for(int i = 0; i < this.getSkillsCount(); ++i) {
                  if (!this.getSkills(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getDestinySkillsCount(); ++i) {
                  if (!this.getDestinySkills(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OpenMainUi_18402 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenMainUi_18402)HeroPalaceMsg.S2C_OpenMainUi_18402.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenMainUi_18402)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTitleLv() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTitleLv() {
            return this.titleLv_;
         }

         public Builder setTitleLv(int value) {
            this.bitField0_ |= 1;
            this.titleLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTitleLv() {
            this.bitField0_ &= -2;
            this.titleLv_ = 0;
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

         public boolean hasShareCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getShareCode() {
            return this.shareCode_;
         }

         public Builder setShareCode(int value) {
            this.bitField0_ |= 4;
            this.shareCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShareCode() {
            this.bitField0_ &= -5;
            this.shareCode_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureSkillsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.skills_ = new ArrayList(this.skills_);
               this.bitField0_ |= 8;
            }

         }

         public List<CommonMsg.MapDataII> getSkillsList() {
            return this.skillsBuilder_ == null ? Collections.unmodifiableList(this.skills_) : this.skillsBuilder_.getMessageList();
         }

         public int getSkillsCount() {
            return this.skillsBuilder_ == null ? this.skills_.size() : this.skillsBuilder_.getCount();
         }

         public CommonMsg.MapDataII getSkills(int index) {
            return this.skillsBuilder_ == null ? (CommonMsg.MapDataII)this.skills_.get(index) : (CommonMsg.MapDataII)this.skillsBuilder_.getMessage(index);
         }

         public Builder setSkills(int index, CommonMsg.MapDataII value) {
            if (this.skillsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSkillsIsMutable();
               this.skills_.set(index, value);
               this.onChanged();
            } else {
               this.skillsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setSkills(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.skillsBuilder_ == null) {
               this.ensureSkillsIsMutable();
               this.skills_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.skillsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addSkills(CommonMsg.MapDataII value) {
            if (this.skillsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSkillsIsMutable();
               this.skills_.add(value);
               this.onChanged();
            } else {
               this.skillsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addSkills(int index, CommonMsg.MapDataII value) {
            if (this.skillsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSkillsIsMutable();
               this.skills_.add(index, value);
               this.onChanged();
            } else {
               this.skillsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addSkills(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.skillsBuilder_ == null) {
               this.ensureSkillsIsMutable();
               this.skills_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.skillsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addSkills(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.skillsBuilder_ == null) {
               this.ensureSkillsIsMutable();
               this.skills_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.skillsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllSkills(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.skillsBuilder_ == null) {
               this.ensureSkillsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.skills_);
               this.onChanged();
            } else {
               this.skillsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearSkills() {
            if (this.skillsBuilder_ == null) {
               this.skills_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.skillsBuilder_.clear();
            }

            return this;
         }

         public Builder removeSkills(int index) {
            if (this.skillsBuilder_ == null) {
               this.ensureSkillsIsMutable();
               this.skills_.remove(index);
               this.onChanged();
            } else {
               this.skillsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getSkillsBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getSkillsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getSkillsOrBuilder(int index) {
            return this.skillsBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.skills_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.skillsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getSkillsOrBuilderList() {
            return this.skillsBuilder_ != null ? this.skillsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.skills_);
         }

         public CommonMsg.MapDataII.Builder addSkillsBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getSkillsFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addSkillsBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getSkillsFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getSkillsBuilderList() {
            return this.getSkillsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getSkillsFieldBuilder() {
            if (this.skillsBuilder_ == null) {
               this.skillsBuilder_ = new RepeatedFieldBuilderV3(this.skills_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.skills_ = null;
            }

            return this.skillsBuilder_;
         }

         private void ensureHeroSkillDirIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.heroSkillDir_ = HeroPalaceMsg.S2C_OpenMainUi_18402.mutableCopy(this.heroSkillDir_);
               this.bitField0_ |= 16;
            }

         }

         public List<Integer> getHeroSkillDirList() {
            return (List<Integer>)((this.bitField0_ & 16) != 0 ? Collections.unmodifiableList(this.heroSkillDir_) : this.heroSkillDir_);
         }

         public int getHeroSkillDirCount() {
            return this.heroSkillDir_.size();
         }

         public int getHeroSkillDir(int index) {
            return this.heroSkillDir_.getInt(index);
         }

         public Builder setHeroSkillDir(int index, int value) {
            this.ensureHeroSkillDirIsMutable();
            this.heroSkillDir_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHeroSkillDir(int value) {
            this.ensureHeroSkillDirIsMutable();
            this.heroSkillDir_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHeroSkillDir(Iterable<? extends Integer> values) {
            this.ensureHeroSkillDirIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.heroSkillDir_);
            this.onChanged();
            return this;
         }

         public Builder clearHeroSkillDir() {
            this.heroSkillDir_ = HeroPalaceMsg.S2C_OpenMainUi_18402.emptyIntList();
            this.bitField0_ &= -17;
            this.onChanged();
            return this;
         }

         private void ensureDestinySkillDirIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.destinySkillDir_ = HeroPalaceMsg.S2C_OpenMainUi_18402.mutableCopy(this.destinySkillDir_);
               this.bitField0_ |= 32;
            }

         }

         public List<Integer> getDestinySkillDirList() {
            return (List<Integer>)((this.bitField0_ & 32) != 0 ? Collections.unmodifiableList(this.destinySkillDir_) : this.destinySkillDir_);
         }

         public int getDestinySkillDirCount() {
            return this.destinySkillDir_.size();
         }

         public int getDestinySkillDir(int index) {
            return this.destinySkillDir_.getInt(index);
         }

         public Builder setDestinySkillDir(int index, int value) {
            this.ensureDestinySkillDirIsMutable();
            this.destinySkillDir_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addDestinySkillDir(int value) {
            this.ensureDestinySkillDirIsMutable();
            this.destinySkillDir_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllDestinySkillDir(Iterable<? extends Integer> values) {
            this.ensureDestinySkillDirIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.destinySkillDir_);
            this.onChanged();
            return this;
         }

         public Builder clearDestinySkillDir() {
            this.destinySkillDir_ = HeroPalaceMsg.S2C_OpenMainUi_18402.emptyIntList();
            this.bitField0_ &= -33;
            this.onChanged();
            return this;
         }

         private void ensureKingSkillDirIsMutable() {
            if ((this.bitField0_ & 64) == 0) {
               this.kingSkillDir_ = HeroPalaceMsg.S2C_OpenMainUi_18402.mutableCopy(this.kingSkillDir_);
               this.bitField0_ |= 64;
            }

         }

         public List<Integer> getKingSkillDirList() {
            return (List<Integer>)((this.bitField0_ & 64) != 0 ? Collections.unmodifiableList(this.kingSkillDir_) : this.kingSkillDir_);
         }

         public int getKingSkillDirCount() {
            return this.kingSkillDir_.size();
         }

         public int getKingSkillDir(int index) {
            return this.kingSkillDir_.getInt(index);
         }

         public Builder setKingSkillDir(int index, int value) {
            this.ensureKingSkillDirIsMutable();
            this.kingSkillDir_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addKingSkillDir(int value) {
            this.ensureKingSkillDirIsMutable();
            this.kingSkillDir_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllKingSkillDir(Iterable<? extends Integer> values) {
            this.ensureKingSkillDirIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.kingSkillDir_);
            this.onChanged();
            return this;
         }

         public Builder clearKingSkillDir() {
            this.kingSkillDir_ = HeroPalaceMsg.S2C_OpenMainUi_18402.emptyIntList();
            this.bitField0_ &= -65;
            this.onChanged();
            return this;
         }

         private void ensureDestinySkillsIsMutable() {
            if ((this.bitField0_ & 128) == 0) {
               this.destinySkills_ = new ArrayList(this.destinySkills_);
               this.bitField0_ |= 128;
            }

         }

         public List<CommonMsg.MapDataII> getDestinySkillsList() {
            return this.destinySkillsBuilder_ == null ? Collections.unmodifiableList(this.destinySkills_) : this.destinySkillsBuilder_.getMessageList();
         }

         public int getDestinySkillsCount() {
            return this.destinySkillsBuilder_ == null ? this.destinySkills_.size() : this.destinySkillsBuilder_.getCount();
         }

         public CommonMsg.MapDataII getDestinySkills(int index) {
            return this.destinySkillsBuilder_ == null ? (CommonMsg.MapDataII)this.destinySkills_.get(index) : (CommonMsg.MapDataII)this.destinySkillsBuilder_.getMessage(index);
         }

         public Builder setDestinySkills(int index, CommonMsg.MapDataII value) {
            if (this.destinySkillsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDestinySkillsIsMutable();
               this.destinySkills_.set(index, value);
               this.onChanged();
            } else {
               this.destinySkillsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setDestinySkills(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.destinySkillsBuilder_ == null) {
               this.ensureDestinySkillsIsMutable();
               this.destinySkills_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.destinySkillsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addDestinySkills(CommonMsg.MapDataII value) {
            if (this.destinySkillsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDestinySkillsIsMutable();
               this.destinySkills_.add(value);
               this.onChanged();
            } else {
               this.destinySkillsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addDestinySkills(int index, CommonMsg.MapDataII value) {
            if (this.destinySkillsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDestinySkillsIsMutable();
               this.destinySkills_.add(index, value);
               this.onChanged();
            } else {
               this.destinySkillsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addDestinySkills(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.destinySkillsBuilder_ == null) {
               this.ensureDestinySkillsIsMutable();
               this.destinySkills_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.destinySkillsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addDestinySkills(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.destinySkillsBuilder_ == null) {
               this.ensureDestinySkillsIsMutable();
               this.destinySkills_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.destinySkillsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllDestinySkills(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.destinySkillsBuilder_ == null) {
               this.ensureDestinySkillsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.destinySkills_);
               this.onChanged();
            } else {
               this.destinySkillsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearDestinySkills() {
            if (this.destinySkillsBuilder_ == null) {
               this.destinySkills_ = Collections.emptyList();
               this.bitField0_ &= -129;
               this.onChanged();
            } else {
               this.destinySkillsBuilder_.clear();
            }

            return this;
         }

         public Builder removeDestinySkills(int index) {
            if (this.destinySkillsBuilder_ == null) {
               this.ensureDestinySkillsIsMutable();
               this.destinySkills_.remove(index);
               this.onChanged();
            } else {
               this.destinySkillsBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getDestinySkillsBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getDestinySkillsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getDestinySkillsOrBuilder(int index) {
            return this.destinySkillsBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.destinySkills_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.destinySkillsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getDestinySkillsOrBuilderList() {
            return this.destinySkillsBuilder_ != null ? this.destinySkillsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.destinySkills_);
         }

         public CommonMsg.MapDataII.Builder addDestinySkillsBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getDestinySkillsFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addDestinySkillsBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getDestinySkillsFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getDestinySkillsBuilderList() {
            return this.getDestinySkillsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getDestinySkillsFieldBuilder() {
            if (this.destinySkillsBuilder_ == null) {
               this.destinySkillsBuilder_ = new RepeatedFieldBuilderV3(this.destinySkills_, (this.bitField0_ & 128) != 0, this.getParentForChildren(), this.isClean());
               this.destinySkills_ = null;
            }

            return this.destinySkillsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_NoticeUi_18403 extends GeneratedMessageV3 implements C2S_NoticeUi_18403OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_NoticeUi_18403 DEFAULT_INSTANCE = new C2S_NoticeUi_18403();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_NoticeUi_18403> PARSER = new AbstractParser<C2S_NoticeUi_18403>() {
         public C2S_NoticeUi_18403 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_NoticeUi_18403(input, extensionRegistry);
         }
      };

      private C2S_NoticeUi_18403(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_NoticeUi_18403() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_NoticeUi_18403();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_NoticeUi_18403(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_NoticeUi_18403_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_NoticeUi_18403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NoticeUi_18403.class, Builder.class);
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
         } else if (!(obj instanceof C2S_NoticeUi_18403)) {
            return super.equals(obj);
         } else {
            C2S_NoticeUi_18403 other = (C2S_NoticeUi_18403)obj;
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

      public static C2S_NoticeUi_18403 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_NoticeUi_18403)PARSER.parseFrom(data);
      }

      public static C2S_NoticeUi_18403 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NoticeUi_18403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NoticeUi_18403 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_NoticeUi_18403)PARSER.parseFrom(data);
      }

      public static C2S_NoticeUi_18403 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NoticeUi_18403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NoticeUi_18403 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_NoticeUi_18403)PARSER.parseFrom(data);
      }

      public static C2S_NoticeUi_18403 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NoticeUi_18403)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NoticeUi_18403 parseFrom(InputStream input) throws IOException {
         return (C2S_NoticeUi_18403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NoticeUi_18403 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NoticeUi_18403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NoticeUi_18403 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_NoticeUi_18403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_NoticeUi_18403 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NoticeUi_18403)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NoticeUi_18403 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_NoticeUi_18403)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NoticeUi_18403 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NoticeUi_18403)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_NoticeUi_18403 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_NoticeUi_18403 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_NoticeUi_18403> parser() {
         return PARSER;
      }

      public Parser<C2S_NoticeUi_18403> getParserForType() {
         return PARSER;
      }

      public C2S_NoticeUi_18403 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_NoticeUi_18403OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_NoticeUi_18403_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_NoticeUi_18403_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NoticeUi_18403.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.C2S_NoticeUi_18403.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_NoticeUi_18403_descriptor;
         }

         public C2S_NoticeUi_18403 getDefaultInstanceForType() {
            return HeroPalaceMsg.C2S_NoticeUi_18403.getDefaultInstance();
         }

         public C2S_NoticeUi_18403 build() {
            C2S_NoticeUi_18403 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_NoticeUi_18403 buildPartial() {
            C2S_NoticeUi_18403 result = new C2S_NoticeUi_18403(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_NoticeUi_18403) {
               return this.mergeFrom((C2S_NoticeUi_18403)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_NoticeUi_18403 other) {
            if (other == HeroPalaceMsg.C2S_NoticeUi_18403.getDefaultInstance()) {
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
            C2S_NoticeUi_18403 parsedMessage = null;

            try {
               parsedMessage = (C2S_NoticeUi_18403)HeroPalaceMsg.C2S_NoticeUi_18403.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_NoticeUi_18403)e.getUnfinishedMessage();
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

   public static final class S2C_NoticeUi_18404 extends GeneratedMessageV3 implements S2C_NoticeUi_18404OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFOS_FIELD_NUMBER = 1;
      private List<NoticeInfo> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_NoticeUi_18404 DEFAULT_INSTANCE = new S2C_NoticeUi_18404();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NoticeUi_18404> PARSER = new AbstractParser<S2C_NoticeUi_18404>() {
         public S2C_NoticeUi_18404 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NoticeUi_18404(input, extensionRegistry);
         }
      };

      private S2C_NoticeUi_18404(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NoticeUi_18404() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NoticeUi_18404();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NoticeUi_18404(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.infos_.add(input.readMessage(HeroPalaceMsg.NoticeInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.infos_ = Collections.unmodifiableList(this.infos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_NoticeUi_18404_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_NoticeUi_18404_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NoticeUi_18404.class, Builder.class);
      }

      public List<NoticeInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends NoticeInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public NoticeInfo getInfos(int index) {
         return (NoticeInfo)this.infos_.get(index);
      }

      public NoticeInfoOrBuilder getInfosOrBuilder(int index) {
         return (NoticeInfoOrBuilder)this.infos_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getInfosCount(); ++i) {
               if (!this.getInfos(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.infos_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.infos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.infos_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_NoticeUi_18404)) {
            return super.equals(obj);
         } else {
            S2C_NoticeUi_18404 other = (S2C_NoticeUi_18404)obj;
            if (!this.getInfosList().equals(other.getInfosList())) {
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
            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_NoticeUi_18404 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NoticeUi_18404)PARSER.parseFrom(data);
      }

      public static S2C_NoticeUi_18404 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NoticeUi_18404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NoticeUi_18404 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NoticeUi_18404)PARSER.parseFrom(data);
      }

      public static S2C_NoticeUi_18404 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NoticeUi_18404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NoticeUi_18404 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NoticeUi_18404)PARSER.parseFrom(data);
      }

      public static S2C_NoticeUi_18404 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NoticeUi_18404)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NoticeUi_18404 parseFrom(InputStream input) throws IOException {
         return (S2C_NoticeUi_18404)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NoticeUi_18404 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NoticeUi_18404)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NoticeUi_18404 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NoticeUi_18404)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NoticeUi_18404 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NoticeUi_18404)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NoticeUi_18404 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NoticeUi_18404)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NoticeUi_18404 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NoticeUi_18404)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NoticeUi_18404 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NoticeUi_18404 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NoticeUi_18404> parser() {
         return PARSER;
      }

      public Parser<S2C_NoticeUi_18404> getParserForType() {
         return PARSER;
      }

      public S2C_NoticeUi_18404 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NoticeUi_18404OrBuilder {
         private int bitField0_;
         private List<NoticeInfo> infos_;
         private RepeatedFieldBuilderV3<NoticeInfo, NoticeInfo.Builder, NoticeInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_NoticeUi_18404_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_NoticeUi_18404_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NoticeUi_18404.class, Builder.class);
         }

         private Builder() {
            this.infos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.infos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.S2C_NoticeUi_18404.alwaysUseFieldBuilders) {
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_NoticeUi_18404_descriptor;
         }

         public S2C_NoticeUi_18404 getDefaultInstanceForType() {
            return HeroPalaceMsg.S2C_NoticeUi_18404.getDefaultInstance();
         }

         public S2C_NoticeUi_18404 build() {
            S2C_NoticeUi_18404 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NoticeUi_18404 buildPartial() {
            S2C_NoticeUi_18404 result = new S2C_NoticeUi_18404(this);
            int from_bitField0_ = this.bitField0_;
            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -2;
               }

               result.infos_ = this.infos_;
            } else {
               result.infos_ = this.infosBuilder_.build();
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
            if (other instanceof S2C_NoticeUi_18404) {
               return this.mergeFrom((S2C_NoticeUi_18404)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NoticeUi_18404 other) {
            if (other == HeroPalaceMsg.S2C_NoticeUi_18404.getDefaultInstance()) {
               return this;
            } else {
               if (this.infosBuilder_ == null) {
                  if (!other.infos_.isEmpty()) {
                     if (this.infos_.isEmpty()) {
                        this.infos_ = other.infos_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureInfosIsMutable();
                        this.infos_.addAll(other.infos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.infos_.isEmpty()) {
                  if (this.infosBuilder_.isEmpty()) {
                     this.infosBuilder_.dispose();
                     this.infosBuilder_ = null;
                     this.infos_ = other.infos_;
                     this.bitField0_ &= -2;
                     this.infosBuilder_ = HeroPalaceMsg.S2C_NoticeUi_18404.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
                  } else {
                     this.infosBuilder_.addAllMessages(other.infos_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getInfosCount(); ++i) {
               if (!this.getInfos(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_NoticeUi_18404 parsedMessage = null;

            try {
               parsedMessage = (S2C_NoticeUi_18404)HeroPalaceMsg.S2C_NoticeUi_18404.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NoticeUi_18404)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 1;
            }

         }

         public List<NoticeInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public NoticeInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (NoticeInfo)this.infos_.get(index) : (NoticeInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, NoticeInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.set(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setInfos(int index, NoticeInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(NoticeInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addInfos(int index, NoticeInfo value) {
            if (this.infosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfosIsMutable();
               this.infos_.add(index, value);
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addInfos(NoticeInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, NoticeInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends NoticeInfo> values) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.infos_);
               this.onChanged();
            } else {
               this.infosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearInfos() {
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Builder removeInfos(int index) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.remove(index);
               this.onChanged();
            } else {
               this.infosBuilder_.remove(index);
            }

            return this;
         }

         public NoticeInfo.Builder getInfosBuilder(int index) {
            return (NoticeInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public NoticeInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (NoticeInfoOrBuilder)this.infos_.get(index) : (NoticeInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends NoticeInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public NoticeInfo.Builder addInfosBuilder() {
            return (NoticeInfo.Builder)this.getInfosFieldBuilder().addBuilder(HeroPalaceMsg.NoticeInfo.getDefaultInstance());
         }

         public NoticeInfo.Builder addInfosBuilder(int index) {
            return (NoticeInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, HeroPalaceMsg.NoticeInfo.getDefaultInstance());
         }

         public List<NoticeInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<NoticeInfo, NoticeInfo.Builder, NoticeInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.infos_ = null;
            }

            return this.infosBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_ShareHero_18405 extends GeneratedMessageV3 implements C2S_ShareHero_18405OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int HEROCODE_FIELD_NUMBER = 2;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_ShareHero_18405 DEFAULT_INSTANCE = new C2S_ShareHero_18405();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ShareHero_18405> PARSER = new AbstractParser<C2S_ShareHero_18405>() {
         public C2S_ShareHero_18405 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ShareHero_18405(input, extensionRegistry);
         }
      };

      private C2S_ShareHero_18405(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ShareHero_18405() {
         this.memoizedIsInitialized = -1;
         this.type_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ShareHero_18405();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ShareHero_18405(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ShareType value = HeroPalaceMsg.ShareType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.type_ = rawValue;
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
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_ShareHero_18405_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_ShareHero_18405_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShareHero_18405.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public ShareType getType() {
         ShareType result = HeroPalaceMsg.ShareType.valueOf(this.type_);
         return result == null ? HeroPalaceMsg.ShareType.SHARETYPE_SHARE : result;
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
         } else if (!this.hasType()) {
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
            output.writeEnum(1, this.type_);
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
               size += CodedOutputStream.computeEnumSize(1, this.type_);
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
         } else if (!(obj instanceof C2S_ShareHero_18405)) {
            return super.equals(obj);
         } else {
            C2S_ShareHero_18405 other = (C2S_ShareHero_18405)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.type_ != other.type_) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.type_;
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

      public static C2S_ShareHero_18405 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ShareHero_18405)PARSER.parseFrom(data);
      }

      public static C2S_ShareHero_18405 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShareHero_18405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShareHero_18405 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ShareHero_18405)PARSER.parseFrom(data);
      }

      public static C2S_ShareHero_18405 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShareHero_18405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShareHero_18405 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ShareHero_18405)PARSER.parseFrom(data);
      }

      public static C2S_ShareHero_18405 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShareHero_18405)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShareHero_18405 parseFrom(InputStream input) throws IOException {
         return (C2S_ShareHero_18405)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShareHero_18405 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShareHero_18405)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShareHero_18405 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ShareHero_18405)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ShareHero_18405 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShareHero_18405)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShareHero_18405 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ShareHero_18405)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShareHero_18405 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShareHero_18405)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ShareHero_18405 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ShareHero_18405 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ShareHero_18405> parser() {
         return PARSER;
      }

      public Parser<C2S_ShareHero_18405> getParserForType() {
         return PARSER;
      }

      public C2S_ShareHero_18405 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ShareHero_18405OrBuilder {
         private int bitField0_;
         private int type_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_ShareHero_18405_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_ShareHero_18405_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShareHero_18405.class, Builder.class);
         }

         private Builder() {
            this.type_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.type_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.C2S_ShareHero_18405.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 1;
            this.bitField0_ &= -2;
            this.heroCode_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_ShareHero_18405_descriptor;
         }

         public C2S_ShareHero_18405 getDefaultInstanceForType() {
            return HeroPalaceMsg.C2S_ShareHero_18405.getDefaultInstance();
         }

         public C2S_ShareHero_18405 build() {
            C2S_ShareHero_18405 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ShareHero_18405 buildPartial() {
            C2S_ShareHero_18405 result = new C2S_ShareHero_18405(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.type_ = this.type_;
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
            if (other instanceof C2S_ShareHero_18405) {
               return this.mergeFrom((C2S_ShareHero_18405)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ShareHero_18405 other) {
            if (other == HeroPalaceMsg.C2S_ShareHero_18405.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
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
            if (!this.hasType()) {
               return false;
            } else {
               return this.hasHeroCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ShareHero_18405 parsedMessage = null;

            try {
               parsedMessage = (C2S_ShareHero_18405)HeroPalaceMsg.C2S_ShareHero_18405.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ShareHero_18405)e.getUnfinishedMessage();
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

         public ShareType getType() {
            ShareType result = HeroPalaceMsg.ShareType.valueOf(this.type_);
            return result == null ? HeroPalaceMsg.ShareType.SHARETYPE_SHARE : result;
         }

         public Builder setType(ShareType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.type_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearType() {
            this.bitField0_ &= -2;
            this.type_ = 1;
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

   public static final class S2C_ShareHero_18406 extends GeneratedMessageV3 implements S2C_ShareHero_18406OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      public static final int HEROCODE_FIELD_NUMBER = 3;
      private int heroCode_;
      public static final int ITEMS_FIELD_NUMBER = 4;
      private List<CommonMsg.ItemInfo> items_;
      private byte memoizedIsInitialized;
      private static final S2C_ShareHero_18406 DEFAULT_INSTANCE = new S2C_ShareHero_18406();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ShareHero_18406> PARSER = new AbstractParser<S2C_ShareHero_18406>() {
         public S2C_ShareHero_18406 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ShareHero_18406(input, extensionRegistry);
         }
      };

      private S2C_ShareHero_18406(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ShareHero_18406() {
         this.memoizedIsInitialized = -1;
         this.type_ = 1;
         this.items_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ShareHero_18406();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ShareHero_18406(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        int rawValue = input.readEnum();
                        ShareType value = HeroPalaceMsg.ShareType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.type_ = rawValue;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.heroCode_ = input.readInt32();
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.items_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.items_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 8) != 0) {
                  this.items_ = Collections.unmodifiableList(this.items_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_ShareHero_18406_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_ShareHero_18406_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShareHero_18406.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 2) != 0;
      }

      public ShareType getType() {
         ShareType result = HeroPalaceMsg.ShareType.valueOf(this.type_);
         return result == null ? HeroPalaceMsg.ShareType.SHARETYPE_SHARE : result;
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public List<CommonMsg.ItemInfo> getItemsList() {
         return this.items_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getItemsOrBuilderList() {
         return this.items_;
      }

      public int getItemsCount() {
         return this.items_.size();
      }

      public CommonMsg.ItemInfo getItems(int index) {
         return (CommonMsg.ItemInfo)this.items_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getItemsOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.items_.get(index);
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
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroCode()) {
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
            output.writeInt32(1, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.type_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.heroCode_);
         }

         for(int i = 0; i < this.items_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.items_.get(i));
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
               size += CodedOutputStream.computeEnumSize(2, this.type_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.heroCode_);
            }

            for(int i = 0; i < this.items_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.items_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ShareHero_18406)) {
            return super.equals(obj);
         } else {
            S2C_ShareHero_18406 other = (S2C_ShareHero_18406)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.type_ != other.type_) {
               return false;
            } else if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
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
            if (this.hasResult()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.type_;
            }

            if (this.hasHeroCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHeroCode();
            }

            if (this.getItemsCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getItemsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ShareHero_18406 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ShareHero_18406)PARSER.parseFrom(data);
      }

      public static S2C_ShareHero_18406 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShareHero_18406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShareHero_18406 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ShareHero_18406)PARSER.parseFrom(data);
      }

      public static S2C_ShareHero_18406 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShareHero_18406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShareHero_18406 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ShareHero_18406)PARSER.parseFrom(data);
      }

      public static S2C_ShareHero_18406 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShareHero_18406)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShareHero_18406 parseFrom(InputStream input) throws IOException {
         return (S2C_ShareHero_18406)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShareHero_18406 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShareHero_18406)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShareHero_18406 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ShareHero_18406)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ShareHero_18406 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShareHero_18406)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShareHero_18406 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ShareHero_18406)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShareHero_18406 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShareHero_18406)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ShareHero_18406 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ShareHero_18406 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ShareHero_18406> parser() {
         return PARSER;
      }

      public Parser<S2C_ShareHero_18406> getParserForType() {
         return PARSER;
      }

      public S2C_ShareHero_18406 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ShareHero_18406OrBuilder {
         private int bitField0_;
         private int result_;
         private int type_;
         private int heroCode_;
         private List<CommonMsg.ItemInfo> items_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> itemsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_ShareHero_18406_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_ShareHero_18406_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShareHero_18406.class, Builder.class);
         }

         private Builder() {
            this.type_ = 1;
            this.items_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.type_ = 1;
            this.items_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.S2C_ShareHero_18406.alwaysUseFieldBuilders) {
               this.getItemsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.type_ = 1;
            this.bitField0_ &= -3;
            this.heroCode_ = 0;
            this.bitField0_ &= -5;
            if (this.itemsBuilder_ == null) {
               this.items_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.itemsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_ShareHero_18406_descriptor;
         }

         public S2C_ShareHero_18406 getDefaultInstanceForType() {
            return HeroPalaceMsg.S2C_ShareHero_18406.getDefaultInstance();
         }

         public S2C_ShareHero_18406 build() {
            S2C_ShareHero_18406 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ShareHero_18406 buildPartial() {
            S2C_ShareHero_18406 result = new S2C_ShareHero_18406(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.type_ = this.type_;
            if ((from_bitField0_ & 4) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 4;
            }

            if (this.itemsBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.items_ = Collections.unmodifiableList(this.items_);
                  this.bitField0_ &= -9;
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
            if (other instanceof S2C_ShareHero_18406) {
               return this.mergeFrom((S2C_ShareHero_18406)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ShareHero_18406 other) {
            if (other == HeroPalaceMsg.S2C_ShareHero_18406.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (this.itemsBuilder_ == null) {
                  if (!other.items_.isEmpty()) {
                     if (this.items_.isEmpty()) {
                        this.items_ = other.items_;
                        this.bitField0_ &= -9;
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
                     this.bitField0_ &= -9;
                     this.itemsBuilder_ = HeroPalaceMsg.S2C_ShareHero_18406.alwaysUseFieldBuilders ? this.getItemsFieldBuilder() : null;
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
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasType()) {
               return false;
            } else if (!this.hasHeroCode()) {
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
            S2C_ShareHero_18406 parsedMessage = null;

            try {
               parsedMessage = (S2C_ShareHero_18406)HeroPalaceMsg.S2C_ShareHero_18406.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ShareHero_18406)e.getUnfinishedMessage();
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

         public boolean hasType() {
            return (this.bitField0_ & 2) != 0;
         }

         public ShareType getType() {
            ShareType result = HeroPalaceMsg.ShareType.valueOf(this.type_);
            return result == null ? HeroPalaceMsg.ShareType.SHARETYPE_SHARE : result;
         }

         public Builder setType(ShareType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.type_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearType() {
            this.bitField0_ &= -3;
            this.type_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasHeroCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getHeroCode() {
            return this.heroCode_;
         }

         public Builder setHeroCode(int value) {
            this.bitField0_ |= 4;
            this.heroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCode() {
            this.bitField0_ &= -5;
            this.heroCode_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureItemsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.items_ = new ArrayList(this.items_);
               this.bitField0_ |= 8;
            }

         }

         public List<CommonMsg.ItemInfo> getItemsList() {
            return this.itemsBuilder_ == null ? Collections.unmodifiableList(this.items_) : this.itemsBuilder_.getMessageList();
         }

         public int getItemsCount() {
            return this.itemsBuilder_ == null ? this.items_.size() : this.itemsBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getItems(int index) {
            return this.itemsBuilder_ == null ? (CommonMsg.ItemInfo)this.items_.get(index) : (CommonMsg.ItemInfo)this.itemsBuilder_.getMessage(index);
         }

         public Builder setItems(int index, CommonMsg.ItemInfo value) {
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

         public Builder setItems(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addItems(CommonMsg.ItemInfo value) {
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

         public Builder addItems(int index, CommonMsg.ItemInfo value) {
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

         public Builder addItems(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addItems(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemsBuilder_ == null) {
               this.ensureItemsIsMutable();
               this.items_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllItems(Iterable<? extends CommonMsg.ItemInfo> values) {
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
               this.bitField0_ &= -9;
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

         public CommonMsg.ItemInfo.Builder getItemsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemsFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getItemsOrBuilder(int index) {
            return this.itemsBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.items_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.itemsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getItemsOrBuilderList() {
            return this.itemsBuilder_ != null ? this.itemsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.items_);
         }

         public CommonMsg.ItemInfo.Builder addItemsBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getItemsFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addItemsBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemsFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getItemsBuilderList() {
            return this.getItemsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getItemsFieldBuilder() {
            if (this.itemsBuilder_ == null) {
               this.itemsBuilder_ = new RepeatedFieldBuilderV3(this.items_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class C2S_NoticePlay_18407 extends GeneratedMessageV3 implements C2S_NoticePlay_18407OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_NoticePlay_18407 DEFAULT_INSTANCE = new C2S_NoticePlay_18407();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_NoticePlay_18407> PARSER = new AbstractParser<C2S_NoticePlay_18407>() {
         public C2S_NoticePlay_18407 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_NoticePlay_18407(input, extensionRegistry);
         }
      };

      private C2S_NoticePlay_18407(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_NoticePlay_18407() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_NoticePlay_18407();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_NoticePlay_18407(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_NoticePlay_18407_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_NoticePlay_18407_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NoticePlay_18407.class, Builder.class);
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
         } else if (!(obj instanceof C2S_NoticePlay_18407)) {
            return super.equals(obj);
         } else {
            C2S_NoticePlay_18407 other = (C2S_NoticePlay_18407)obj;
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

      public static C2S_NoticePlay_18407 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_NoticePlay_18407)PARSER.parseFrom(data);
      }

      public static C2S_NoticePlay_18407 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NoticePlay_18407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NoticePlay_18407 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_NoticePlay_18407)PARSER.parseFrom(data);
      }

      public static C2S_NoticePlay_18407 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NoticePlay_18407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NoticePlay_18407 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_NoticePlay_18407)PARSER.parseFrom(data);
      }

      public static C2S_NoticePlay_18407 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_NoticePlay_18407)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_NoticePlay_18407 parseFrom(InputStream input) throws IOException {
         return (C2S_NoticePlay_18407)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NoticePlay_18407 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NoticePlay_18407)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NoticePlay_18407 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_NoticePlay_18407)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_NoticePlay_18407 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NoticePlay_18407)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_NoticePlay_18407 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_NoticePlay_18407)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_NoticePlay_18407 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_NoticePlay_18407)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_NoticePlay_18407 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_NoticePlay_18407 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_NoticePlay_18407> parser() {
         return PARSER;
      }

      public Parser<C2S_NoticePlay_18407> getParserForType() {
         return PARSER;
      }

      public C2S_NoticePlay_18407 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_NoticePlay_18407OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_NoticePlay_18407_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_NoticePlay_18407_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_NoticePlay_18407.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.C2S_NoticePlay_18407.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_NoticePlay_18407_descriptor;
         }

         public C2S_NoticePlay_18407 getDefaultInstanceForType() {
            return HeroPalaceMsg.C2S_NoticePlay_18407.getDefaultInstance();
         }

         public C2S_NoticePlay_18407 build() {
            C2S_NoticePlay_18407 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_NoticePlay_18407 buildPartial() {
            C2S_NoticePlay_18407 result = new C2S_NoticePlay_18407(this);
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
            if (other instanceof C2S_NoticePlay_18407) {
               return this.mergeFrom((C2S_NoticePlay_18407)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_NoticePlay_18407 other) {
            if (other == HeroPalaceMsg.C2S_NoticePlay_18407.getDefaultInstance()) {
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
            C2S_NoticePlay_18407 parsedMessage = null;

            try {
               parsedMessage = (C2S_NoticePlay_18407)HeroPalaceMsg.C2S_NoticePlay_18407.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_NoticePlay_18407)e.getUnfinishedMessage();
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

   public static final class S2C_NoticePlay_18408 extends GeneratedMessageV3 implements S2C_NoticePlay_18408OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_NoticePlay_18408 DEFAULT_INSTANCE = new S2C_NoticePlay_18408();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NoticePlay_18408> PARSER = new AbstractParser<S2C_NoticePlay_18408>() {
         public S2C_NoticePlay_18408 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NoticePlay_18408(input, extensionRegistry);
         }
      };

      private S2C_NoticePlay_18408(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NoticePlay_18408() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NoticePlay_18408();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NoticePlay_18408(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_NoticePlay_18408_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_NoticePlay_18408_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NoticePlay_18408.class, Builder.class);
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
         } else if (!(obj instanceof S2C_NoticePlay_18408)) {
            return super.equals(obj);
         } else {
            S2C_NoticePlay_18408 other = (S2C_NoticePlay_18408)obj;
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

      public static S2C_NoticePlay_18408 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NoticePlay_18408)PARSER.parseFrom(data);
      }

      public static S2C_NoticePlay_18408 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NoticePlay_18408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NoticePlay_18408 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NoticePlay_18408)PARSER.parseFrom(data);
      }

      public static S2C_NoticePlay_18408 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NoticePlay_18408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NoticePlay_18408 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NoticePlay_18408)PARSER.parseFrom(data);
      }

      public static S2C_NoticePlay_18408 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NoticePlay_18408)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NoticePlay_18408 parseFrom(InputStream input) throws IOException {
         return (S2C_NoticePlay_18408)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NoticePlay_18408 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NoticePlay_18408)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NoticePlay_18408 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NoticePlay_18408)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NoticePlay_18408 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NoticePlay_18408)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NoticePlay_18408 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NoticePlay_18408)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NoticePlay_18408 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NoticePlay_18408)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NoticePlay_18408 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NoticePlay_18408 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NoticePlay_18408> parser() {
         return PARSER;
      }

      public Parser<S2C_NoticePlay_18408> getParserForType() {
         return PARSER;
      }

      public S2C_NoticePlay_18408 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NoticePlay_18408OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_NoticePlay_18408_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_NoticePlay_18408_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NoticePlay_18408.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.S2C_NoticePlay_18408.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_NoticePlay_18408_descriptor;
         }

         public S2C_NoticePlay_18408 getDefaultInstanceForType() {
            return HeroPalaceMsg.S2C_NoticePlay_18408.getDefaultInstance();
         }

         public S2C_NoticePlay_18408 build() {
            S2C_NoticePlay_18408 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NoticePlay_18408 buildPartial() {
            S2C_NoticePlay_18408 result = new S2C_NoticePlay_18408(this);
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
            if (other instanceof S2C_NoticePlay_18408) {
               return this.mergeFrom((S2C_NoticePlay_18408)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NoticePlay_18408 other) {
            if (other == HeroPalaceMsg.S2C_NoticePlay_18408.getDefaultInstance()) {
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
            S2C_NoticePlay_18408 parsedMessage = null;

            try {
               parsedMessage = (S2C_NoticePlay_18408)HeroPalaceMsg.S2C_NoticePlay_18408.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NoticePlay_18408)e.getUnfinishedMessage();
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

   public static final class C2S_ShareHeroPreview_18409 extends GeneratedMessageV3 implements C2S_ShareHeroPreview_18409OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_ShareHeroPreview_18409 DEFAULT_INSTANCE = new C2S_ShareHeroPreview_18409();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ShareHeroPreview_18409> PARSER = new AbstractParser<C2S_ShareHeroPreview_18409>() {
         public C2S_ShareHeroPreview_18409 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ShareHeroPreview_18409(input, extensionRegistry);
         }
      };

      private C2S_ShareHeroPreview_18409(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ShareHeroPreview_18409() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ShareHeroPreview_18409();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ShareHeroPreview_18409(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_ShareHeroPreview_18409_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_ShareHeroPreview_18409_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShareHeroPreview_18409.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
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
            output.writeInt32(1, this.heroCode_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ShareHeroPreview_18409)) {
            return super.equals(obj);
         } else {
            C2S_ShareHeroPreview_18409 other = (C2S_ShareHeroPreview_18409)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
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
            if (this.hasHeroCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ShareHeroPreview_18409 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ShareHeroPreview_18409)PARSER.parseFrom(data);
      }

      public static C2S_ShareHeroPreview_18409 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShareHeroPreview_18409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShareHeroPreview_18409 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ShareHeroPreview_18409)PARSER.parseFrom(data);
      }

      public static C2S_ShareHeroPreview_18409 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShareHeroPreview_18409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShareHeroPreview_18409 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ShareHeroPreview_18409)PARSER.parseFrom(data);
      }

      public static C2S_ShareHeroPreview_18409 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShareHeroPreview_18409)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShareHeroPreview_18409 parseFrom(InputStream input) throws IOException {
         return (C2S_ShareHeroPreview_18409)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShareHeroPreview_18409 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShareHeroPreview_18409)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShareHeroPreview_18409 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ShareHeroPreview_18409)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ShareHeroPreview_18409 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShareHeroPreview_18409)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShareHeroPreview_18409 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ShareHeroPreview_18409)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShareHeroPreview_18409 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShareHeroPreview_18409)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ShareHeroPreview_18409 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ShareHeroPreview_18409 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ShareHeroPreview_18409> parser() {
         return PARSER;
      }

      public Parser<C2S_ShareHeroPreview_18409> getParserForType() {
         return PARSER;
      }

      public C2S_ShareHeroPreview_18409 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ShareHeroPreview_18409OrBuilder {
         private int bitField0_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_ShareHeroPreview_18409_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_ShareHeroPreview_18409_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShareHeroPreview_18409.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.C2S_ShareHeroPreview_18409.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_ShareHeroPreview_18409_descriptor;
         }

         public C2S_ShareHeroPreview_18409 getDefaultInstanceForType() {
            return HeroPalaceMsg.C2S_ShareHeroPreview_18409.getDefaultInstance();
         }

         public C2S_ShareHeroPreview_18409 build() {
            C2S_ShareHeroPreview_18409 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ShareHeroPreview_18409 buildPartial() {
            C2S_ShareHeroPreview_18409 result = new C2S_ShareHeroPreview_18409(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
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
            if (other instanceof C2S_ShareHeroPreview_18409) {
               return this.mergeFrom((C2S_ShareHeroPreview_18409)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ShareHeroPreview_18409 other) {
            if (other == HeroPalaceMsg.C2S_ShareHeroPreview_18409.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasHeroCode();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ShareHeroPreview_18409 parsedMessage = null;

            try {
               parsedMessage = (C2S_ShareHeroPreview_18409)HeroPalaceMsg.C2S_ShareHeroPreview_18409.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ShareHeroPreview_18409)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_ShareHeroPreview_18410 extends GeneratedMessageV3 implements S2C_ShareHeroPreview_18410OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROINFO_FIELD_NUMBER = 1;
      private CommonMsg.HeroInfo heroInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_ShareHeroPreview_18410 DEFAULT_INSTANCE = new S2C_ShareHeroPreview_18410();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ShareHeroPreview_18410> PARSER = new AbstractParser<S2C_ShareHeroPreview_18410>() {
         public S2C_ShareHeroPreview_18410 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ShareHeroPreview_18410(input, extensionRegistry);
         }
      };

      private S2C_ShareHeroPreview_18410(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ShareHeroPreview_18410() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ShareHeroPreview_18410();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ShareHeroPreview_18410(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CommonMsg.HeroInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.heroInfo_.toBuilder();
                        }

                        this.heroInfo_ = (CommonMsg.HeroInfo)input.readMessage(CommonMsg.HeroInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.heroInfo_);
                           this.heroInfo_ = subBuilder.buildPartial();
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
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_ShareHeroPreview_18410_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_ShareHeroPreview_18410_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShareHeroPreview_18410.class, Builder.class);
      }

      public boolean hasHeroInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public CommonMsg.HeroInfo getHeroInfo() {
         return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
      }

      public CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder() {
         return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getHeroInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getHeroInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getHeroInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ShareHeroPreview_18410)) {
            return super.equals(obj);
         } else {
            S2C_ShareHeroPreview_18410 other = (S2C_ShareHeroPreview_18410)obj;
            if (this.hasHeroInfo() != other.hasHeroInfo()) {
               return false;
            } else if (this.hasHeroInfo() && !this.getHeroInfo().equals(other.getHeroInfo())) {
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
            if (this.hasHeroInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ShareHeroPreview_18410 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ShareHeroPreview_18410)PARSER.parseFrom(data);
      }

      public static S2C_ShareHeroPreview_18410 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShareHeroPreview_18410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShareHeroPreview_18410 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ShareHeroPreview_18410)PARSER.parseFrom(data);
      }

      public static S2C_ShareHeroPreview_18410 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShareHeroPreview_18410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShareHeroPreview_18410 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ShareHeroPreview_18410)PARSER.parseFrom(data);
      }

      public static S2C_ShareHeroPreview_18410 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShareHeroPreview_18410)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShareHeroPreview_18410 parseFrom(InputStream input) throws IOException {
         return (S2C_ShareHeroPreview_18410)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShareHeroPreview_18410 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShareHeroPreview_18410)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShareHeroPreview_18410 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ShareHeroPreview_18410)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ShareHeroPreview_18410 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShareHeroPreview_18410)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShareHeroPreview_18410 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ShareHeroPreview_18410)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShareHeroPreview_18410 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShareHeroPreview_18410)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ShareHeroPreview_18410 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ShareHeroPreview_18410 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ShareHeroPreview_18410> parser() {
         return PARSER;
      }

      public Parser<S2C_ShareHeroPreview_18410> getParserForType() {
         return PARSER;
      }

      public S2C_ShareHeroPreview_18410 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ShareHeroPreview_18410OrBuilder {
         private int bitField0_;
         private CommonMsg.HeroInfo heroInfo_;
         private SingleFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> heroInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_ShareHeroPreview_18410_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_ShareHeroPreview_18410_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShareHeroPreview_18410.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.S2C_ShareHeroPreview_18410.alwaysUseFieldBuilders) {
               this.getHeroInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = null;
            } else {
               this.heroInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_ShareHeroPreview_18410_descriptor;
         }

         public S2C_ShareHeroPreview_18410 getDefaultInstanceForType() {
            return HeroPalaceMsg.S2C_ShareHeroPreview_18410.getDefaultInstance();
         }

         public S2C_ShareHeroPreview_18410 build() {
            S2C_ShareHeroPreview_18410 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ShareHeroPreview_18410 buildPartial() {
            S2C_ShareHeroPreview_18410 result = new S2C_ShareHeroPreview_18410(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.heroInfoBuilder_ == null) {
                  result.heroInfo_ = this.heroInfo_;
               } else {
                  result.heroInfo_ = (CommonMsg.HeroInfo)this.heroInfoBuilder_.build();
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
            if (other instanceof S2C_ShareHeroPreview_18410) {
               return this.mergeFrom((S2C_ShareHeroPreview_18410)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ShareHeroPreview_18410 other) {
            if (other == HeroPalaceMsg.S2C_ShareHeroPreview_18410.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroInfo()) {
                  this.mergeHeroInfo(other.getHeroInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroInfo()) {
               return false;
            } else {
               return this.getHeroInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ShareHeroPreview_18410 parsedMessage = null;

            try {
               parsedMessage = (S2C_ShareHeroPreview_18410)HeroPalaceMsg.S2C_ShareHeroPreview_18410.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ShareHeroPreview_18410)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public CommonMsg.HeroInfo getHeroInfo() {
            if (this.heroInfoBuilder_ == null) {
               return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
            } else {
               return (CommonMsg.HeroInfo)this.heroInfoBuilder_.getMessage();
            }
         }

         public Builder setHeroInfo(CommonMsg.HeroInfo value) {
            if (this.heroInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.heroInfo_ = value;
               this.onChanged();
            } else {
               this.heroInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setHeroInfo(CommonMsg.HeroInfo.Builder builderForValue) {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.heroInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeHeroInfo(CommonMsg.HeroInfo value) {
            if (this.heroInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.heroInfo_ != null && this.heroInfo_ != CommonMsg.HeroInfo.getDefaultInstance()) {
                  this.heroInfo_ = CommonMsg.HeroInfo.newBuilder(this.heroInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.heroInfo_ = value;
               }

               this.onChanged();
            } else {
               this.heroInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearHeroInfo() {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = null;
               this.onChanged();
            } else {
               this.heroInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public CommonMsg.HeroInfo.Builder getHeroInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (CommonMsg.HeroInfo.Builder)this.getHeroInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder() {
            if (this.heroInfoBuilder_ != null) {
               return (CommonMsg.HeroInfoOrBuilder)this.heroInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.heroInfo_ == null ? CommonMsg.HeroInfo.getDefaultInstance() : this.heroInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> getHeroInfoFieldBuilder() {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfoBuilder_ = new SingleFieldBuilderV3(this.getHeroInfo(), this.getParentForChildren(), this.isClean());
               this.heroInfo_ = null;
            }

            return this.heroInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_LearnHeroSkill_18411 extends GeneratedMessageV3 implements C2S_LearnHeroSkill_18411OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int SKILLS_FIELD_NUMBER = 1;
      private Internal.IntList skills_;
      private byte memoizedIsInitialized;
      private static final C2S_LearnHeroSkill_18411 DEFAULT_INSTANCE = new C2S_LearnHeroSkill_18411();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LearnHeroSkill_18411> PARSER = new AbstractParser<C2S_LearnHeroSkill_18411>() {
         public C2S_LearnHeroSkill_18411 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LearnHeroSkill_18411(input, extensionRegistry);
         }
      };

      private C2S_LearnHeroSkill_18411(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LearnHeroSkill_18411() {
         this.memoizedIsInitialized = -1;
         this.skills_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LearnHeroSkill_18411();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LearnHeroSkill_18411(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.skills_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.skills_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.skills_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.skills_.addInt(input.readInt32());
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
                  this.skills_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_LearnHeroSkill_18411_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_LearnHeroSkill_18411_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LearnHeroSkill_18411.class, Builder.class);
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
         for(int i = 0; i < this.skills_.size(); ++i) {
            output.writeInt32(1, this.skills_.getInt(i));
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

            for(int i = 0; i < this.skills_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.skills_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getSkillsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_LearnHeroSkill_18411)) {
            return super.equals(obj);
         } else {
            C2S_LearnHeroSkill_18411 other = (C2S_LearnHeroSkill_18411)obj;
            if (!this.getSkillsList().equals(other.getSkillsList())) {
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
            if (this.getSkillsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSkillsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_LearnHeroSkill_18411 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LearnHeroSkill_18411)PARSER.parseFrom(data);
      }

      public static C2S_LearnHeroSkill_18411 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LearnHeroSkill_18411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LearnHeroSkill_18411 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LearnHeroSkill_18411)PARSER.parseFrom(data);
      }

      public static C2S_LearnHeroSkill_18411 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LearnHeroSkill_18411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LearnHeroSkill_18411 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LearnHeroSkill_18411)PARSER.parseFrom(data);
      }

      public static C2S_LearnHeroSkill_18411 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LearnHeroSkill_18411)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LearnHeroSkill_18411 parseFrom(InputStream input) throws IOException {
         return (C2S_LearnHeroSkill_18411)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LearnHeroSkill_18411 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LearnHeroSkill_18411)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LearnHeroSkill_18411 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LearnHeroSkill_18411)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LearnHeroSkill_18411 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LearnHeroSkill_18411)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LearnHeroSkill_18411 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LearnHeroSkill_18411)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LearnHeroSkill_18411 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LearnHeroSkill_18411)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LearnHeroSkill_18411 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LearnHeroSkill_18411 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LearnHeroSkill_18411> parser() {
         return PARSER;
      }

      public Parser<C2S_LearnHeroSkill_18411> getParserForType() {
         return PARSER;
      }

      public C2S_LearnHeroSkill_18411 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LearnHeroSkill_18411OrBuilder {
         private int bitField0_;
         private Internal.IntList skills_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_LearnHeroSkill_18411_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_LearnHeroSkill_18411_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LearnHeroSkill_18411.class, Builder.class);
         }

         private Builder() {
            this.skills_ = HeroPalaceMsg.C2S_LearnHeroSkill_18411.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.skills_ = HeroPalaceMsg.C2S_LearnHeroSkill_18411.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.C2S_LearnHeroSkill_18411.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.skills_ = HeroPalaceMsg.C2S_LearnHeroSkill_18411.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_LearnHeroSkill_18411_descriptor;
         }

         public C2S_LearnHeroSkill_18411 getDefaultInstanceForType() {
            return HeroPalaceMsg.C2S_LearnHeroSkill_18411.getDefaultInstance();
         }

         public C2S_LearnHeroSkill_18411 build() {
            C2S_LearnHeroSkill_18411 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LearnHeroSkill_18411 buildPartial() {
            C2S_LearnHeroSkill_18411 result = new C2S_LearnHeroSkill_18411(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.skills_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.skills_ = this.skills_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LearnHeroSkill_18411) {
               return this.mergeFrom((C2S_LearnHeroSkill_18411)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LearnHeroSkill_18411 other) {
            if (other == HeroPalaceMsg.C2S_LearnHeroSkill_18411.getDefaultInstance()) {
               return this;
            } else {
               if (!other.skills_.isEmpty()) {
                  if (this.skills_.isEmpty()) {
                     this.skills_ = other.skills_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureSkillsIsMutable();
                     this.skills_.addAll(other.skills_);
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
            C2S_LearnHeroSkill_18411 parsedMessage = null;

            try {
               parsedMessage = (C2S_LearnHeroSkill_18411)HeroPalaceMsg.C2S_LearnHeroSkill_18411.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LearnHeroSkill_18411)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureSkillsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.skills_ = HeroPalaceMsg.C2S_LearnHeroSkill_18411.mutableCopy(this.skills_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getSkillsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.skills_) : this.skills_);
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
            this.skills_ = HeroPalaceMsg.C2S_LearnHeroSkill_18411.emptyIntList();
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

   public static final class S2C_LearnHeroSkill_18412 extends GeneratedMessageV3 implements S2C_LearnHeroSkill_18412OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_LearnHeroSkill_18412 DEFAULT_INSTANCE = new S2C_LearnHeroSkill_18412();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LearnHeroSkill_18412> PARSER = new AbstractParser<S2C_LearnHeroSkill_18412>() {
         public S2C_LearnHeroSkill_18412 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LearnHeroSkill_18412(input, extensionRegistry);
         }
      };

      private S2C_LearnHeroSkill_18412(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LearnHeroSkill_18412() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LearnHeroSkill_18412();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LearnHeroSkill_18412(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_LearnHeroSkill_18412_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_LearnHeroSkill_18412_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LearnHeroSkill_18412.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LearnHeroSkill_18412)) {
            return super.equals(obj);
         } else {
            S2C_LearnHeroSkill_18412 other = (S2C_LearnHeroSkill_18412)obj;
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

      public static S2C_LearnHeroSkill_18412 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LearnHeroSkill_18412)PARSER.parseFrom(data);
      }

      public static S2C_LearnHeroSkill_18412 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LearnHeroSkill_18412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LearnHeroSkill_18412 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LearnHeroSkill_18412)PARSER.parseFrom(data);
      }

      public static S2C_LearnHeroSkill_18412 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LearnHeroSkill_18412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LearnHeroSkill_18412 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LearnHeroSkill_18412)PARSER.parseFrom(data);
      }

      public static S2C_LearnHeroSkill_18412 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LearnHeroSkill_18412)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LearnHeroSkill_18412 parseFrom(InputStream input) throws IOException {
         return (S2C_LearnHeroSkill_18412)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LearnHeroSkill_18412 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LearnHeroSkill_18412)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LearnHeroSkill_18412 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LearnHeroSkill_18412)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LearnHeroSkill_18412 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LearnHeroSkill_18412)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LearnHeroSkill_18412 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LearnHeroSkill_18412)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LearnHeroSkill_18412 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LearnHeroSkill_18412)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LearnHeroSkill_18412 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LearnHeroSkill_18412 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LearnHeroSkill_18412> parser() {
         return PARSER;
      }

      public Parser<S2C_LearnHeroSkill_18412> getParserForType() {
         return PARSER;
      }

      public S2C_LearnHeroSkill_18412 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LearnHeroSkill_18412OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_LearnHeroSkill_18412_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_LearnHeroSkill_18412_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LearnHeroSkill_18412.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.S2C_LearnHeroSkill_18412.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_LearnHeroSkill_18412_descriptor;
         }

         public S2C_LearnHeroSkill_18412 getDefaultInstanceForType() {
            return HeroPalaceMsg.S2C_LearnHeroSkill_18412.getDefaultInstance();
         }

         public S2C_LearnHeroSkill_18412 build() {
            S2C_LearnHeroSkill_18412 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LearnHeroSkill_18412 buildPartial() {
            S2C_LearnHeroSkill_18412 result = new S2C_LearnHeroSkill_18412(this);
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
            if (other instanceof S2C_LearnHeroSkill_18412) {
               return this.mergeFrom((S2C_LearnHeroSkill_18412)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LearnHeroSkill_18412 other) {
            if (other == HeroPalaceMsg.S2C_LearnHeroSkill_18412.getDefaultInstance()) {
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
            S2C_LearnHeroSkill_18412 parsedMessage = null;

            try {
               parsedMessage = (S2C_LearnHeroSkill_18412)HeroPalaceMsg.S2C_LearnHeroSkill_18412.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LearnHeroSkill_18412)e.getUnfinishedMessage();
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

   public static final class C2S_UnlockKingSkill_18413 extends GeneratedMessageV3 implements C2S_UnlockKingSkill_18413OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int HEROCODES_FIELD_NUMBER = 2;
      private Internal.IntList heroCodes_;
      private byte memoizedIsInitialized;
      private static final C2S_UnlockKingSkill_18413 DEFAULT_INSTANCE = new C2S_UnlockKingSkill_18413();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UnlockKingSkill_18413> PARSER = new AbstractParser<C2S_UnlockKingSkill_18413>() {
         public C2S_UnlockKingSkill_18413 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UnlockKingSkill_18413(input, extensionRegistry);
         }
      };

      private C2S_UnlockKingSkill_18413(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UnlockKingSkill_18413() {
         this.memoizedIsInitialized = -1;
         this.heroCodes_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UnlockKingSkill_18413();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UnlockKingSkill_18413(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.heroCodes_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.heroCodes_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.heroCodes_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.heroCodes_.addInt(input.readInt32());
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
                  this.heroCodes_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockKingSkill_18413_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockKingSkill_18413_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnlockKingSkill_18413.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public List<Integer> getHeroCodesList() {
         return this.heroCodes_;
      }

      public int getHeroCodesCount() {
         return this.heroCodes_.size();
      }

      public int getHeroCodes(int index) {
         return this.heroCodes_.getInt(index);
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

         for(int i = 0; i < this.heroCodes_.size(); ++i) {
            output.writeInt32(2, this.heroCodes_.getInt(i));
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

            int dataSize = 0;

            for(int i = 0; i < this.heroCodes_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.heroCodes_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHeroCodesList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_UnlockKingSkill_18413)) {
            return super.equals(obj);
         } else {
            C2S_UnlockKingSkill_18413 other = (C2S_UnlockKingSkill_18413)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (!this.getHeroCodesList().equals(other.getHeroCodesList())) {
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

            if (this.getHeroCodesCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCodesList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_UnlockKingSkill_18413 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UnlockKingSkill_18413)PARSER.parseFrom(data);
      }

      public static C2S_UnlockKingSkill_18413 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnlockKingSkill_18413)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnlockKingSkill_18413 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UnlockKingSkill_18413)PARSER.parseFrom(data);
      }

      public static C2S_UnlockKingSkill_18413 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnlockKingSkill_18413)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnlockKingSkill_18413 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UnlockKingSkill_18413)PARSER.parseFrom(data);
      }

      public static C2S_UnlockKingSkill_18413 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnlockKingSkill_18413)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnlockKingSkill_18413 parseFrom(InputStream input) throws IOException {
         return (C2S_UnlockKingSkill_18413)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnlockKingSkill_18413 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnlockKingSkill_18413)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnlockKingSkill_18413 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UnlockKingSkill_18413)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UnlockKingSkill_18413 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnlockKingSkill_18413)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnlockKingSkill_18413 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UnlockKingSkill_18413)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnlockKingSkill_18413 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnlockKingSkill_18413)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UnlockKingSkill_18413 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UnlockKingSkill_18413 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UnlockKingSkill_18413> parser() {
         return PARSER;
      }

      public Parser<C2S_UnlockKingSkill_18413> getParserForType() {
         return PARSER;
      }

      public C2S_UnlockKingSkill_18413 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UnlockKingSkill_18413OrBuilder {
         private int bitField0_;
         private int id_;
         private Internal.IntList heroCodes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockKingSkill_18413_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockKingSkill_18413_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnlockKingSkill_18413.class, Builder.class);
         }

         private Builder() {
            this.heroCodes_ = HeroPalaceMsg.C2S_UnlockKingSkill_18413.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.heroCodes_ = HeroPalaceMsg.C2S_UnlockKingSkill_18413.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.C2S_UnlockKingSkill_18413.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.heroCodes_ = HeroPalaceMsg.C2S_UnlockKingSkill_18413.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockKingSkill_18413_descriptor;
         }

         public C2S_UnlockKingSkill_18413 getDefaultInstanceForType() {
            return HeroPalaceMsg.C2S_UnlockKingSkill_18413.getDefaultInstance();
         }

         public C2S_UnlockKingSkill_18413 build() {
            C2S_UnlockKingSkill_18413 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UnlockKingSkill_18413 buildPartial() {
            C2S_UnlockKingSkill_18413 result = new C2S_UnlockKingSkill_18413(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.heroCodes_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.heroCodes_ = this.heroCodes_;
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
            if (other instanceof C2S_UnlockKingSkill_18413) {
               return this.mergeFrom((C2S_UnlockKingSkill_18413)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UnlockKingSkill_18413 other) {
            if (other == HeroPalaceMsg.C2S_UnlockKingSkill_18413.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (!other.heroCodes_.isEmpty()) {
                  if (this.heroCodes_.isEmpty()) {
                     this.heroCodes_ = other.heroCodes_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureHeroCodesIsMutable();
                     this.heroCodes_.addAll(other.heroCodes_);
                  }

                  this.onChanged();
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
            C2S_UnlockKingSkill_18413 parsedMessage = null;

            try {
               parsedMessage = (C2S_UnlockKingSkill_18413)HeroPalaceMsg.C2S_UnlockKingSkill_18413.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UnlockKingSkill_18413)e.getUnfinishedMessage();
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

         private void ensureHeroCodesIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.heroCodes_ = HeroPalaceMsg.C2S_UnlockKingSkill_18413.mutableCopy(this.heroCodes_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getHeroCodesList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.heroCodes_) : this.heroCodes_);
         }

         public int getHeroCodesCount() {
            return this.heroCodes_.size();
         }

         public int getHeroCodes(int index) {
            return this.heroCodes_.getInt(index);
         }

         public Builder setHeroCodes(int index, int value) {
            this.ensureHeroCodesIsMutable();
            this.heroCodes_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHeroCodes(int value) {
            this.ensureHeroCodesIsMutable();
            this.heroCodes_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHeroCodes(Iterable<? extends Integer> values) {
            this.ensureHeroCodesIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.heroCodes_);
            this.onChanged();
            return this;
         }

         public Builder clearHeroCodes() {
            this.heroCodes_ = HeroPalaceMsg.C2S_UnlockKingSkill_18413.emptyIntList();
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

   public static final class S2C_UnlockKingSkill_18414 extends GeneratedMessageV3 implements S2C_UnlockKingSkill_18414OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int ID_FIELD_NUMBER = 2;
      private int id_;
      public static final int KINGSKILLDIR_FIELD_NUMBER = 3;
      private Internal.IntList kingSkillDir_;
      private byte memoizedIsInitialized;
      private static final S2C_UnlockKingSkill_18414 DEFAULT_INSTANCE = new S2C_UnlockKingSkill_18414();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UnlockKingSkill_18414> PARSER = new AbstractParser<S2C_UnlockKingSkill_18414>() {
         public S2C_UnlockKingSkill_18414 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UnlockKingSkill_18414(input, extensionRegistry);
         }
      };

      private S2C_UnlockKingSkill_18414(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UnlockKingSkill_18414() {
         this.memoizedIsInitialized = -1;
         this.kingSkillDir_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UnlockKingSkill_18414();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UnlockKingSkill_18414(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.id_ = input.readInt32();
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.kingSkillDir_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.kingSkillDir_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.kingSkillDir_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.kingSkillDir_.addInt(input.readInt32());
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
                  this.kingSkillDir_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockKingSkill_18414_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockKingSkill_18414_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnlockKingSkill_18414.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public List<Integer> getKingSkillDirList() {
         return this.kingSkillDir_;
      }

      public int getKingSkillDirCount() {
         return this.kingSkillDir_.size();
      }

      public int getKingSkillDir(int index) {
         return this.kingSkillDir_.getInt(index);
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
            output.writeInt32(1, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.id_);
         }

         for(int i = 0; i < this.kingSkillDir_.size(); ++i) {
            output.writeInt32(3, this.kingSkillDir_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(2, this.id_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.kingSkillDir_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.kingSkillDir_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getKingSkillDirList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UnlockKingSkill_18414)) {
            return super.equals(obj);
         } else {
            S2C_UnlockKingSkill_18414 other = (S2C_UnlockKingSkill_18414)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (!this.getKingSkillDirList().equals(other.getKingSkillDirList())) {
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

            if (this.hasId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getId();
            }

            if (this.getKingSkillDirCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getKingSkillDirList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UnlockKingSkill_18414 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UnlockKingSkill_18414)PARSER.parseFrom(data);
      }

      public static S2C_UnlockKingSkill_18414 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockKingSkill_18414)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockKingSkill_18414 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UnlockKingSkill_18414)PARSER.parseFrom(data);
      }

      public static S2C_UnlockKingSkill_18414 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockKingSkill_18414)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockKingSkill_18414 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UnlockKingSkill_18414)PARSER.parseFrom(data);
      }

      public static S2C_UnlockKingSkill_18414 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockKingSkill_18414)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockKingSkill_18414 parseFrom(InputStream input) throws IOException {
         return (S2C_UnlockKingSkill_18414)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnlockKingSkill_18414 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockKingSkill_18414)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnlockKingSkill_18414 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UnlockKingSkill_18414)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UnlockKingSkill_18414 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockKingSkill_18414)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnlockKingSkill_18414 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UnlockKingSkill_18414)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnlockKingSkill_18414 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockKingSkill_18414)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UnlockKingSkill_18414 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UnlockKingSkill_18414 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UnlockKingSkill_18414> parser() {
         return PARSER;
      }

      public Parser<S2C_UnlockKingSkill_18414> getParserForType() {
         return PARSER;
      }

      public S2C_UnlockKingSkill_18414 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UnlockKingSkill_18414OrBuilder {
         private int bitField0_;
         private int result_;
         private int id_;
         private Internal.IntList kingSkillDir_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockKingSkill_18414_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockKingSkill_18414_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnlockKingSkill_18414.class, Builder.class);
         }

         private Builder() {
            this.kingSkillDir_ = HeroPalaceMsg.S2C_UnlockKingSkill_18414.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.kingSkillDir_ = HeroPalaceMsg.S2C_UnlockKingSkill_18414.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.S2C_UnlockKingSkill_18414.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.id_ = 0;
            this.bitField0_ &= -3;
            this.kingSkillDir_ = HeroPalaceMsg.S2C_UnlockKingSkill_18414.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockKingSkill_18414_descriptor;
         }

         public S2C_UnlockKingSkill_18414 getDefaultInstanceForType() {
            return HeroPalaceMsg.S2C_UnlockKingSkill_18414.getDefaultInstance();
         }

         public S2C_UnlockKingSkill_18414 build() {
            S2C_UnlockKingSkill_18414 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UnlockKingSkill_18414 buildPartial() {
            S2C_UnlockKingSkill_18414 result = new S2C_UnlockKingSkill_18414(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.kingSkillDir_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.kingSkillDir_ = this.kingSkillDir_;
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
            if (other instanceof S2C_UnlockKingSkill_18414) {
               return this.mergeFrom((S2C_UnlockKingSkill_18414)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UnlockKingSkill_18414 other) {
            if (other == HeroPalaceMsg.S2C_UnlockKingSkill_18414.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (!other.kingSkillDir_.isEmpty()) {
                  if (this.kingSkillDir_.isEmpty()) {
                     this.kingSkillDir_ = other.kingSkillDir_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureKingSkillDirIsMutable();
                     this.kingSkillDir_.addAll(other.kingSkillDir_);
                  }

                  this.onChanged();
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
               return this.hasId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UnlockKingSkill_18414 parsedMessage = null;

            try {
               parsedMessage = (S2C_UnlockKingSkill_18414)HeroPalaceMsg.S2C_UnlockKingSkill_18414.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UnlockKingSkill_18414)e.getUnfinishedMessage();
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

         private void ensureKingSkillDirIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.kingSkillDir_ = HeroPalaceMsg.S2C_UnlockKingSkill_18414.mutableCopy(this.kingSkillDir_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getKingSkillDirList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.kingSkillDir_) : this.kingSkillDir_);
         }

         public int getKingSkillDirCount() {
            return this.kingSkillDir_.size();
         }

         public int getKingSkillDir(int index) {
            return this.kingSkillDir_.getInt(index);
         }

         public Builder setKingSkillDir(int index, int value) {
            this.ensureKingSkillDirIsMutable();
            this.kingSkillDir_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addKingSkillDir(int value) {
            this.ensureKingSkillDirIsMutable();
            this.kingSkillDir_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllKingSkillDir(Iterable<? extends Integer> values) {
            this.ensureKingSkillDirIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.kingSkillDir_);
            this.onChanged();
            return this;
         }

         public Builder clearKingSkillDir() {
            this.kingSkillDir_ = HeroPalaceMsg.S2C_UnlockKingSkill_18414.emptyIntList();
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

   public static final class C2S_UnlockDestinySkill_18421 extends GeneratedMessageV3 implements C2S_UnlockDestinySkill_18421OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SKILLID_FIELD_NUMBER = 1;
      private int skillId_;
      private byte memoizedIsInitialized;
      private static final C2S_UnlockDestinySkill_18421 DEFAULT_INSTANCE = new C2S_UnlockDestinySkill_18421();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UnlockDestinySkill_18421> PARSER = new AbstractParser<C2S_UnlockDestinySkill_18421>() {
         public C2S_UnlockDestinySkill_18421 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UnlockDestinySkill_18421(input, extensionRegistry);
         }
      };

      private C2S_UnlockDestinySkill_18421(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UnlockDestinySkill_18421() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UnlockDestinySkill_18421();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UnlockDestinySkill_18421(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockDestinySkill_18421_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockDestinySkill_18421_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnlockDestinySkill_18421.class, Builder.class);
      }

      public boolean hasSkillId() {
         return (this.bitField0_ & 1) != 0;
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
            output.writeInt32(1, this.skillId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.skillId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_UnlockDestinySkill_18421)) {
            return super.equals(obj);
         } else {
            C2S_UnlockDestinySkill_18421 other = (C2S_UnlockDestinySkill_18421)obj;
            if (this.hasSkillId() != other.hasSkillId()) {
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
            if (this.hasSkillId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSkillId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_UnlockDestinySkill_18421 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UnlockDestinySkill_18421)PARSER.parseFrom(data);
      }

      public static C2S_UnlockDestinySkill_18421 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnlockDestinySkill_18421)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnlockDestinySkill_18421 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UnlockDestinySkill_18421)PARSER.parseFrom(data);
      }

      public static C2S_UnlockDestinySkill_18421 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnlockDestinySkill_18421)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnlockDestinySkill_18421 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UnlockDestinySkill_18421)PARSER.parseFrom(data);
      }

      public static C2S_UnlockDestinySkill_18421 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnlockDestinySkill_18421)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnlockDestinySkill_18421 parseFrom(InputStream input) throws IOException {
         return (C2S_UnlockDestinySkill_18421)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnlockDestinySkill_18421 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnlockDestinySkill_18421)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnlockDestinySkill_18421 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UnlockDestinySkill_18421)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UnlockDestinySkill_18421 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnlockDestinySkill_18421)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnlockDestinySkill_18421 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UnlockDestinySkill_18421)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnlockDestinySkill_18421 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnlockDestinySkill_18421)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UnlockDestinySkill_18421 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UnlockDestinySkill_18421 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UnlockDestinySkill_18421> parser() {
         return PARSER;
      }

      public Parser<C2S_UnlockDestinySkill_18421> getParserForType() {
         return PARSER;
      }

      public C2S_UnlockDestinySkill_18421 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UnlockDestinySkill_18421OrBuilder {
         private int bitField0_;
         private int skillId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockDestinySkill_18421_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockDestinySkill_18421_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnlockDestinySkill_18421.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.C2S_UnlockDestinySkill_18421.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.skillId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockDestinySkill_18421_descriptor;
         }

         public C2S_UnlockDestinySkill_18421 getDefaultInstanceForType() {
            return HeroPalaceMsg.C2S_UnlockDestinySkill_18421.getDefaultInstance();
         }

         public C2S_UnlockDestinySkill_18421 build() {
            C2S_UnlockDestinySkill_18421 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UnlockDestinySkill_18421 buildPartial() {
            C2S_UnlockDestinySkill_18421 result = new C2S_UnlockDestinySkill_18421(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.skillId_ = this.skillId_;
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
            if (other instanceof C2S_UnlockDestinySkill_18421) {
               return this.mergeFrom((C2S_UnlockDestinySkill_18421)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UnlockDestinySkill_18421 other) {
            if (other == HeroPalaceMsg.C2S_UnlockDestinySkill_18421.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSkillId()) {
                  this.setSkillId(other.getSkillId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasSkillId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_UnlockDestinySkill_18421 parsedMessage = null;

            try {
               parsedMessage = (C2S_UnlockDestinySkill_18421)HeroPalaceMsg.C2S_UnlockDestinySkill_18421.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UnlockDestinySkill_18421)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSkillId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSkillId() {
            return this.skillId_;
         }

         public Builder setSkillId(int value) {
            this.bitField0_ |= 1;
            this.skillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSkillId() {
            this.bitField0_ &= -2;
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

   public static final class S2C_UnlockDestinySkill_18422 extends GeneratedMessageV3 implements S2C_UnlockDestinySkill_18422OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int SKILLID_FIELD_NUMBER = 2;
      private int skillId_;
      public static final int DESTINYSKILLDIR_FIELD_NUMBER = 3;
      private Internal.IntList destinySkillDir_;
      private byte memoizedIsInitialized;
      private static final S2C_UnlockDestinySkill_18422 DEFAULT_INSTANCE = new S2C_UnlockDestinySkill_18422();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UnlockDestinySkill_18422> PARSER = new AbstractParser<S2C_UnlockDestinySkill_18422>() {
         public S2C_UnlockDestinySkill_18422 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UnlockDestinySkill_18422(input, extensionRegistry);
         }
      };

      private S2C_UnlockDestinySkill_18422(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UnlockDestinySkill_18422() {
         this.memoizedIsInitialized = -1;
         this.destinySkillDir_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UnlockDestinySkill_18422();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UnlockDestinySkill_18422(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.skillId_ = input.readInt32();
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.destinySkillDir_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.destinySkillDir_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.destinySkillDir_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.destinySkillDir_.addInt(input.readInt32());
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
                  this.destinySkillDir_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockDestinySkill_18422_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockDestinySkill_18422_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnlockDestinySkill_18422.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasSkillId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSkillId() {
         return this.skillId_;
      }

      public List<Integer> getDestinySkillDirList() {
         return this.destinySkillDir_;
      }

      public int getDestinySkillDirCount() {
         return this.destinySkillDir_.size();
      }

      public int getDestinySkillDir(int index) {
         return this.destinySkillDir_.getInt(index);
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
            output.writeInt32(1, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.skillId_);
         }

         for(int i = 0; i < this.destinySkillDir_.size(); ++i) {
            output.writeInt32(3, this.destinySkillDir_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(2, this.skillId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.destinySkillDir_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.destinySkillDir_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getDestinySkillDirList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UnlockDestinySkill_18422)) {
            return super.equals(obj);
         } else {
            S2C_UnlockDestinySkill_18422 other = (S2C_UnlockDestinySkill_18422)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasSkillId() != other.hasSkillId()) {
               return false;
            } else if (this.hasSkillId() && this.getSkillId() != other.getSkillId()) {
               return false;
            } else if (!this.getDestinySkillDirList().equals(other.getDestinySkillDirList())) {
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

            if (this.hasSkillId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSkillId();
            }

            if (this.getDestinySkillDirCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getDestinySkillDirList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UnlockDestinySkill_18422 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UnlockDestinySkill_18422)PARSER.parseFrom(data);
      }

      public static S2C_UnlockDestinySkill_18422 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockDestinySkill_18422)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockDestinySkill_18422 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UnlockDestinySkill_18422)PARSER.parseFrom(data);
      }

      public static S2C_UnlockDestinySkill_18422 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockDestinySkill_18422)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockDestinySkill_18422 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UnlockDestinySkill_18422)PARSER.parseFrom(data);
      }

      public static S2C_UnlockDestinySkill_18422 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockDestinySkill_18422)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockDestinySkill_18422 parseFrom(InputStream input) throws IOException {
         return (S2C_UnlockDestinySkill_18422)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnlockDestinySkill_18422 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockDestinySkill_18422)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnlockDestinySkill_18422 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UnlockDestinySkill_18422)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UnlockDestinySkill_18422 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockDestinySkill_18422)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnlockDestinySkill_18422 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UnlockDestinySkill_18422)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnlockDestinySkill_18422 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockDestinySkill_18422)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UnlockDestinySkill_18422 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UnlockDestinySkill_18422 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UnlockDestinySkill_18422> parser() {
         return PARSER;
      }

      public Parser<S2C_UnlockDestinySkill_18422> getParserForType() {
         return PARSER;
      }

      public S2C_UnlockDestinySkill_18422 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UnlockDestinySkill_18422OrBuilder {
         private int bitField0_;
         private int result_;
         private int skillId_;
         private Internal.IntList destinySkillDir_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockDestinySkill_18422_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockDestinySkill_18422_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnlockDestinySkill_18422.class, Builder.class);
         }

         private Builder() {
            this.destinySkillDir_ = HeroPalaceMsg.S2C_UnlockDestinySkill_18422.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.destinySkillDir_ = HeroPalaceMsg.S2C_UnlockDestinySkill_18422.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.S2C_UnlockDestinySkill_18422.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.skillId_ = 0;
            this.bitField0_ &= -3;
            this.destinySkillDir_ = HeroPalaceMsg.S2C_UnlockDestinySkill_18422.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockDestinySkill_18422_descriptor;
         }

         public S2C_UnlockDestinySkill_18422 getDefaultInstanceForType() {
            return HeroPalaceMsg.S2C_UnlockDestinySkill_18422.getDefaultInstance();
         }

         public S2C_UnlockDestinySkill_18422 build() {
            S2C_UnlockDestinySkill_18422 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UnlockDestinySkill_18422 buildPartial() {
            S2C_UnlockDestinySkill_18422 result = new S2C_UnlockDestinySkill_18422(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.skillId_ = this.skillId_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.destinySkillDir_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.destinySkillDir_ = this.destinySkillDir_;
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
            if (other instanceof S2C_UnlockDestinySkill_18422) {
               return this.mergeFrom((S2C_UnlockDestinySkill_18422)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UnlockDestinySkill_18422 other) {
            if (other == HeroPalaceMsg.S2C_UnlockDestinySkill_18422.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasSkillId()) {
                  this.setSkillId(other.getSkillId());
               }

               if (!other.destinySkillDir_.isEmpty()) {
                  if (this.destinySkillDir_.isEmpty()) {
                     this.destinySkillDir_ = other.destinySkillDir_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureDestinySkillDirIsMutable();
                     this.destinySkillDir_.addAll(other.destinySkillDir_);
                  }

                  this.onChanged();
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
               return this.hasSkillId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UnlockDestinySkill_18422 parsedMessage = null;

            try {
               parsedMessage = (S2C_UnlockDestinySkill_18422)HeroPalaceMsg.S2C_UnlockDestinySkill_18422.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UnlockDestinySkill_18422)e.getUnfinishedMessage();
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

         public boolean hasSkillId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSkillId() {
            return this.skillId_;
         }

         public Builder setSkillId(int value) {
            this.bitField0_ |= 2;
            this.skillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSkillId() {
            this.bitField0_ &= -3;
            this.skillId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureDestinySkillDirIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.destinySkillDir_ = HeroPalaceMsg.S2C_UnlockDestinySkill_18422.mutableCopy(this.destinySkillDir_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getDestinySkillDirList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.destinySkillDir_) : this.destinySkillDir_);
         }

         public int getDestinySkillDirCount() {
            return this.destinySkillDir_.size();
         }

         public int getDestinySkillDir(int index) {
            return this.destinySkillDir_.getInt(index);
         }

         public Builder setDestinySkillDir(int index, int value) {
            this.ensureDestinySkillDirIsMutable();
            this.destinySkillDir_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addDestinySkillDir(int value) {
            this.ensureDestinySkillDirIsMutable();
            this.destinySkillDir_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllDestinySkillDir(Iterable<? extends Integer> values) {
            this.ensureDestinySkillDirIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.destinySkillDir_);
            this.onChanged();
            return this;
         }

         public Builder clearDestinySkillDir() {
            this.destinySkillDir_ = HeroPalaceMsg.S2C_UnlockDestinySkill_18422.emptyIntList();
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

   public static final class C2S_UpgradeDestinySkill_18423 extends GeneratedMessageV3 implements C2S_UpgradeDestinySkill_18423OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SKILLID_FIELD_NUMBER = 1;
      private int skillId_;
      private byte memoizedIsInitialized;
      private static final C2S_UpgradeDestinySkill_18423 DEFAULT_INSTANCE = new C2S_UpgradeDestinySkill_18423();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UpgradeDestinySkill_18423> PARSER = new AbstractParser<C2S_UpgradeDestinySkill_18423>() {
         public C2S_UpgradeDestinySkill_18423 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UpgradeDestinySkill_18423(input, extensionRegistry);
         }
      };

      private C2S_UpgradeDestinySkill_18423(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UpgradeDestinySkill_18423() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UpgradeDestinySkill_18423();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UpgradeDestinySkill_18423(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradeDestinySkill_18423_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradeDestinySkill_18423_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UpgradeDestinySkill_18423.class, Builder.class);
      }

      public boolean hasSkillId() {
         return (this.bitField0_ & 1) != 0;
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
            output.writeInt32(1, this.skillId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.skillId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_UpgradeDestinySkill_18423)) {
            return super.equals(obj);
         } else {
            C2S_UpgradeDestinySkill_18423 other = (C2S_UpgradeDestinySkill_18423)obj;
            if (this.hasSkillId() != other.hasSkillId()) {
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
            if (this.hasSkillId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSkillId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_UpgradeDestinySkill_18423 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UpgradeDestinySkill_18423)PARSER.parseFrom(data);
      }

      public static C2S_UpgradeDestinySkill_18423 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpgradeDestinySkill_18423)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpgradeDestinySkill_18423 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UpgradeDestinySkill_18423)PARSER.parseFrom(data);
      }

      public static C2S_UpgradeDestinySkill_18423 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpgradeDestinySkill_18423)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpgradeDestinySkill_18423 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UpgradeDestinySkill_18423)PARSER.parseFrom(data);
      }

      public static C2S_UpgradeDestinySkill_18423 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpgradeDestinySkill_18423)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpgradeDestinySkill_18423 parseFrom(InputStream input) throws IOException {
         return (C2S_UpgradeDestinySkill_18423)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UpgradeDestinySkill_18423 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpgradeDestinySkill_18423)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UpgradeDestinySkill_18423 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UpgradeDestinySkill_18423)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UpgradeDestinySkill_18423 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpgradeDestinySkill_18423)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UpgradeDestinySkill_18423 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UpgradeDestinySkill_18423)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UpgradeDestinySkill_18423 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpgradeDestinySkill_18423)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UpgradeDestinySkill_18423 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UpgradeDestinySkill_18423 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UpgradeDestinySkill_18423> parser() {
         return PARSER;
      }

      public Parser<C2S_UpgradeDestinySkill_18423> getParserForType() {
         return PARSER;
      }

      public C2S_UpgradeDestinySkill_18423 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UpgradeDestinySkill_18423OrBuilder {
         private int bitField0_;
         private int skillId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradeDestinySkill_18423_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradeDestinySkill_18423_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UpgradeDestinySkill_18423.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.C2S_UpgradeDestinySkill_18423.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.skillId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradeDestinySkill_18423_descriptor;
         }

         public C2S_UpgradeDestinySkill_18423 getDefaultInstanceForType() {
            return HeroPalaceMsg.C2S_UpgradeDestinySkill_18423.getDefaultInstance();
         }

         public C2S_UpgradeDestinySkill_18423 build() {
            C2S_UpgradeDestinySkill_18423 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UpgradeDestinySkill_18423 buildPartial() {
            C2S_UpgradeDestinySkill_18423 result = new C2S_UpgradeDestinySkill_18423(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.skillId_ = this.skillId_;
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
            if (other instanceof C2S_UpgradeDestinySkill_18423) {
               return this.mergeFrom((C2S_UpgradeDestinySkill_18423)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UpgradeDestinySkill_18423 other) {
            if (other == HeroPalaceMsg.C2S_UpgradeDestinySkill_18423.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSkillId()) {
                  this.setSkillId(other.getSkillId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasSkillId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_UpgradeDestinySkill_18423 parsedMessage = null;

            try {
               parsedMessage = (C2S_UpgradeDestinySkill_18423)HeroPalaceMsg.C2S_UpgradeDestinySkill_18423.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UpgradeDestinySkill_18423)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSkillId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSkillId() {
            return this.skillId_;
         }

         public Builder setSkillId(int value) {
            this.bitField0_ |= 1;
            this.skillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSkillId() {
            this.bitField0_ &= -2;
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

   public static final class S2C_UpgradeDestinySkill_18424 extends GeneratedMessageV3 implements S2C_UpgradeDestinySkill_18424OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int SKILLID_FIELD_NUMBER = 2;
      private int skillId_;
      public static final int DESTINYSKILLDIR_FIELD_NUMBER = 3;
      private Internal.IntList destinySkillDir_;
      private byte memoizedIsInitialized;
      private static final S2C_UpgradeDestinySkill_18424 DEFAULT_INSTANCE = new S2C_UpgradeDestinySkill_18424();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpgradeDestinySkill_18424> PARSER = new AbstractParser<S2C_UpgradeDestinySkill_18424>() {
         public S2C_UpgradeDestinySkill_18424 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpgradeDestinySkill_18424(input, extensionRegistry);
         }
      };

      private S2C_UpgradeDestinySkill_18424(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpgradeDestinySkill_18424() {
         this.memoizedIsInitialized = -1;
         this.destinySkillDir_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpgradeDestinySkill_18424();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpgradeDestinySkill_18424(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.skillId_ = input.readInt32();
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.destinySkillDir_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.destinySkillDir_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.destinySkillDir_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.destinySkillDir_.addInt(input.readInt32());
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
                  this.destinySkillDir_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradeDestinySkill_18424_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradeDestinySkill_18424_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpgradeDestinySkill_18424.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasSkillId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSkillId() {
         return this.skillId_;
      }

      public List<Integer> getDestinySkillDirList() {
         return this.destinySkillDir_;
      }

      public int getDestinySkillDirCount() {
         return this.destinySkillDir_.size();
      }

      public int getDestinySkillDir(int index) {
         return this.destinySkillDir_.getInt(index);
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
            output.writeInt32(1, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.skillId_);
         }

         for(int i = 0; i < this.destinySkillDir_.size(); ++i) {
            output.writeInt32(3, this.destinySkillDir_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(2, this.skillId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.destinySkillDir_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.destinySkillDir_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getDestinySkillDirList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpgradeDestinySkill_18424)) {
            return super.equals(obj);
         } else {
            S2C_UpgradeDestinySkill_18424 other = (S2C_UpgradeDestinySkill_18424)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasSkillId() != other.hasSkillId()) {
               return false;
            } else if (this.hasSkillId() && this.getSkillId() != other.getSkillId()) {
               return false;
            } else if (!this.getDestinySkillDirList().equals(other.getDestinySkillDirList())) {
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

            if (this.hasSkillId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSkillId();
            }

            if (this.getDestinySkillDirCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getDestinySkillDirList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpgradeDestinySkill_18424 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpgradeDestinySkill_18424)PARSER.parseFrom(data);
      }

      public static S2C_UpgradeDestinySkill_18424 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpgradeDestinySkill_18424)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpgradeDestinySkill_18424 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpgradeDestinySkill_18424)PARSER.parseFrom(data);
      }

      public static S2C_UpgradeDestinySkill_18424 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpgradeDestinySkill_18424)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpgradeDestinySkill_18424 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpgradeDestinySkill_18424)PARSER.parseFrom(data);
      }

      public static S2C_UpgradeDestinySkill_18424 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpgradeDestinySkill_18424)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpgradeDestinySkill_18424 parseFrom(InputStream input) throws IOException {
         return (S2C_UpgradeDestinySkill_18424)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpgradeDestinySkill_18424 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpgradeDestinySkill_18424)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpgradeDestinySkill_18424 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpgradeDestinySkill_18424)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpgradeDestinySkill_18424 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpgradeDestinySkill_18424)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpgradeDestinySkill_18424 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpgradeDestinySkill_18424)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpgradeDestinySkill_18424 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpgradeDestinySkill_18424)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpgradeDestinySkill_18424 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpgradeDestinySkill_18424 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpgradeDestinySkill_18424> parser() {
         return PARSER;
      }

      public Parser<S2C_UpgradeDestinySkill_18424> getParserForType() {
         return PARSER;
      }

      public S2C_UpgradeDestinySkill_18424 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpgradeDestinySkill_18424OrBuilder {
         private int bitField0_;
         private int result_;
         private int skillId_;
         private Internal.IntList destinySkillDir_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradeDestinySkill_18424_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradeDestinySkill_18424_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpgradeDestinySkill_18424.class, Builder.class);
         }

         private Builder() {
            this.destinySkillDir_ = HeroPalaceMsg.S2C_UpgradeDestinySkill_18424.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.destinySkillDir_ = HeroPalaceMsg.S2C_UpgradeDestinySkill_18424.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.S2C_UpgradeDestinySkill_18424.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.skillId_ = 0;
            this.bitField0_ &= -3;
            this.destinySkillDir_ = HeroPalaceMsg.S2C_UpgradeDestinySkill_18424.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradeDestinySkill_18424_descriptor;
         }

         public S2C_UpgradeDestinySkill_18424 getDefaultInstanceForType() {
            return HeroPalaceMsg.S2C_UpgradeDestinySkill_18424.getDefaultInstance();
         }

         public S2C_UpgradeDestinySkill_18424 build() {
            S2C_UpgradeDestinySkill_18424 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpgradeDestinySkill_18424 buildPartial() {
            S2C_UpgradeDestinySkill_18424 result = new S2C_UpgradeDestinySkill_18424(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.skillId_ = this.skillId_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.destinySkillDir_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.destinySkillDir_ = this.destinySkillDir_;
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
            if (other instanceof S2C_UpgradeDestinySkill_18424) {
               return this.mergeFrom((S2C_UpgradeDestinySkill_18424)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpgradeDestinySkill_18424 other) {
            if (other == HeroPalaceMsg.S2C_UpgradeDestinySkill_18424.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasSkillId()) {
                  this.setSkillId(other.getSkillId());
               }

               if (!other.destinySkillDir_.isEmpty()) {
                  if (this.destinySkillDir_.isEmpty()) {
                     this.destinySkillDir_ = other.destinySkillDir_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureDestinySkillDirIsMutable();
                     this.destinySkillDir_.addAll(other.destinySkillDir_);
                  }

                  this.onChanged();
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
               return this.hasSkillId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UpgradeDestinySkill_18424 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpgradeDestinySkill_18424)HeroPalaceMsg.S2C_UpgradeDestinySkill_18424.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpgradeDestinySkill_18424)e.getUnfinishedMessage();
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

         public boolean hasSkillId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSkillId() {
            return this.skillId_;
         }

         public Builder setSkillId(int value) {
            this.bitField0_ |= 2;
            this.skillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSkillId() {
            this.bitField0_ &= -3;
            this.skillId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureDestinySkillDirIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.destinySkillDir_ = HeroPalaceMsg.S2C_UpgradeDestinySkill_18424.mutableCopy(this.destinySkillDir_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getDestinySkillDirList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.destinySkillDir_) : this.destinySkillDir_);
         }

         public int getDestinySkillDirCount() {
            return this.destinySkillDir_.size();
         }

         public int getDestinySkillDir(int index) {
            return this.destinySkillDir_.getInt(index);
         }

         public Builder setDestinySkillDir(int index, int value) {
            this.ensureDestinySkillDirIsMutable();
            this.destinySkillDir_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addDestinySkillDir(int value) {
            this.ensureDestinySkillDirIsMutable();
            this.destinySkillDir_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllDestinySkillDir(Iterable<? extends Integer> values) {
            this.ensureDestinySkillDirIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.destinySkillDir_);
            this.onChanged();
            return this;
         }

         public Builder clearDestinySkillDir() {
            this.destinySkillDir_ = HeroPalaceMsg.S2C_UpgradeDestinySkill_18424.emptyIntList();
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

   public static final class C2S_LearnDestinySkill_18425 extends GeneratedMessageV3 implements C2S_LearnDestinySkill_18425OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int SKILLS_FIELD_NUMBER = 1;
      private Internal.IntList skills_;
      private byte memoizedIsInitialized;
      private static final C2S_LearnDestinySkill_18425 DEFAULT_INSTANCE = new C2S_LearnDestinySkill_18425();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LearnDestinySkill_18425> PARSER = new AbstractParser<C2S_LearnDestinySkill_18425>() {
         public C2S_LearnDestinySkill_18425 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LearnDestinySkill_18425(input, extensionRegistry);
         }
      };

      private C2S_LearnDestinySkill_18425(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LearnDestinySkill_18425() {
         this.memoizedIsInitialized = -1;
         this.skills_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LearnDestinySkill_18425();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LearnDestinySkill_18425(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.skills_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.skills_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.skills_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.skills_.addInt(input.readInt32());
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
                  this.skills_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_LearnDestinySkill_18425_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_LearnDestinySkill_18425_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LearnDestinySkill_18425.class, Builder.class);
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
         for(int i = 0; i < this.skills_.size(); ++i) {
            output.writeInt32(1, this.skills_.getInt(i));
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

            for(int i = 0; i < this.skills_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.skills_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getSkillsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_LearnDestinySkill_18425)) {
            return super.equals(obj);
         } else {
            C2S_LearnDestinySkill_18425 other = (C2S_LearnDestinySkill_18425)obj;
            if (!this.getSkillsList().equals(other.getSkillsList())) {
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
            if (this.getSkillsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSkillsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_LearnDestinySkill_18425 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LearnDestinySkill_18425)PARSER.parseFrom(data);
      }

      public static C2S_LearnDestinySkill_18425 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LearnDestinySkill_18425)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LearnDestinySkill_18425 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LearnDestinySkill_18425)PARSER.parseFrom(data);
      }

      public static C2S_LearnDestinySkill_18425 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LearnDestinySkill_18425)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LearnDestinySkill_18425 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LearnDestinySkill_18425)PARSER.parseFrom(data);
      }

      public static C2S_LearnDestinySkill_18425 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LearnDestinySkill_18425)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LearnDestinySkill_18425 parseFrom(InputStream input) throws IOException {
         return (C2S_LearnDestinySkill_18425)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LearnDestinySkill_18425 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LearnDestinySkill_18425)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LearnDestinySkill_18425 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LearnDestinySkill_18425)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LearnDestinySkill_18425 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LearnDestinySkill_18425)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LearnDestinySkill_18425 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LearnDestinySkill_18425)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LearnDestinySkill_18425 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LearnDestinySkill_18425)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LearnDestinySkill_18425 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LearnDestinySkill_18425 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LearnDestinySkill_18425> parser() {
         return PARSER;
      }

      public Parser<C2S_LearnDestinySkill_18425> getParserForType() {
         return PARSER;
      }

      public C2S_LearnDestinySkill_18425 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LearnDestinySkill_18425OrBuilder {
         private int bitField0_;
         private Internal.IntList skills_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_LearnDestinySkill_18425_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_LearnDestinySkill_18425_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LearnDestinySkill_18425.class, Builder.class);
         }

         private Builder() {
            this.skills_ = HeroPalaceMsg.C2S_LearnDestinySkill_18425.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.skills_ = HeroPalaceMsg.C2S_LearnDestinySkill_18425.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.C2S_LearnDestinySkill_18425.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.skills_ = HeroPalaceMsg.C2S_LearnDestinySkill_18425.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_LearnDestinySkill_18425_descriptor;
         }

         public C2S_LearnDestinySkill_18425 getDefaultInstanceForType() {
            return HeroPalaceMsg.C2S_LearnDestinySkill_18425.getDefaultInstance();
         }

         public C2S_LearnDestinySkill_18425 build() {
            C2S_LearnDestinySkill_18425 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LearnDestinySkill_18425 buildPartial() {
            C2S_LearnDestinySkill_18425 result = new C2S_LearnDestinySkill_18425(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.skills_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.skills_ = this.skills_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LearnDestinySkill_18425) {
               return this.mergeFrom((C2S_LearnDestinySkill_18425)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LearnDestinySkill_18425 other) {
            if (other == HeroPalaceMsg.C2S_LearnDestinySkill_18425.getDefaultInstance()) {
               return this;
            } else {
               if (!other.skills_.isEmpty()) {
                  if (this.skills_.isEmpty()) {
                     this.skills_ = other.skills_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureSkillsIsMutable();
                     this.skills_.addAll(other.skills_);
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
            C2S_LearnDestinySkill_18425 parsedMessage = null;

            try {
               parsedMessage = (C2S_LearnDestinySkill_18425)HeroPalaceMsg.C2S_LearnDestinySkill_18425.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LearnDestinySkill_18425)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureSkillsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.skills_ = HeroPalaceMsg.C2S_LearnDestinySkill_18425.mutableCopy(this.skills_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getSkillsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.skills_) : this.skills_);
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
            this.skills_ = HeroPalaceMsg.C2S_LearnDestinySkill_18425.emptyIntList();
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

   public static final class S2C_LearnDestinySkill_18426 extends GeneratedMessageV3 implements S2C_LearnDestinySkill_18426OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_LearnDestinySkill_18426 DEFAULT_INSTANCE = new S2C_LearnDestinySkill_18426();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LearnDestinySkill_18426> PARSER = new AbstractParser<S2C_LearnDestinySkill_18426>() {
         public S2C_LearnDestinySkill_18426 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LearnDestinySkill_18426(input, extensionRegistry);
         }
      };

      private S2C_LearnDestinySkill_18426(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LearnDestinySkill_18426() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LearnDestinySkill_18426();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LearnDestinySkill_18426(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_LearnDestinySkill_18426_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_LearnDestinySkill_18426_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LearnDestinySkill_18426.class, Builder.class);
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
         } else if (!(obj instanceof S2C_LearnDestinySkill_18426)) {
            return super.equals(obj);
         } else {
            S2C_LearnDestinySkill_18426 other = (S2C_LearnDestinySkill_18426)obj;
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

      public static S2C_LearnDestinySkill_18426 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LearnDestinySkill_18426)PARSER.parseFrom(data);
      }

      public static S2C_LearnDestinySkill_18426 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LearnDestinySkill_18426)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LearnDestinySkill_18426 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LearnDestinySkill_18426)PARSER.parseFrom(data);
      }

      public static S2C_LearnDestinySkill_18426 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LearnDestinySkill_18426)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LearnDestinySkill_18426 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LearnDestinySkill_18426)PARSER.parseFrom(data);
      }

      public static S2C_LearnDestinySkill_18426 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LearnDestinySkill_18426)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LearnDestinySkill_18426 parseFrom(InputStream input) throws IOException {
         return (S2C_LearnDestinySkill_18426)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LearnDestinySkill_18426 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LearnDestinySkill_18426)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LearnDestinySkill_18426 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LearnDestinySkill_18426)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LearnDestinySkill_18426 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LearnDestinySkill_18426)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LearnDestinySkill_18426 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LearnDestinySkill_18426)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LearnDestinySkill_18426 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LearnDestinySkill_18426)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LearnDestinySkill_18426 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LearnDestinySkill_18426 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LearnDestinySkill_18426> parser() {
         return PARSER;
      }

      public Parser<S2C_LearnDestinySkill_18426> getParserForType() {
         return PARSER;
      }

      public S2C_LearnDestinySkill_18426 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LearnDestinySkill_18426OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_LearnDestinySkill_18426_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_LearnDestinySkill_18426_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LearnDestinySkill_18426.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.S2C_LearnDestinySkill_18426.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_LearnDestinySkill_18426_descriptor;
         }

         public S2C_LearnDestinySkill_18426 getDefaultInstanceForType() {
            return HeroPalaceMsg.S2C_LearnDestinySkill_18426.getDefaultInstance();
         }

         public S2C_LearnDestinySkill_18426 build() {
            S2C_LearnDestinySkill_18426 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LearnDestinySkill_18426 buildPartial() {
            S2C_LearnDestinySkill_18426 result = new S2C_LearnDestinySkill_18426(this);
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
            if (other instanceof S2C_LearnDestinySkill_18426) {
               return this.mergeFrom((S2C_LearnDestinySkill_18426)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LearnDestinySkill_18426 other) {
            if (other == HeroPalaceMsg.S2C_LearnDestinySkill_18426.getDefaultInstance()) {
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
            S2C_LearnDestinySkill_18426 parsedMessage = null;

            try {
               parsedMessage = (S2C_LearnDestinySkill_18426)HeroPalaceMsg.S2C_LearnDestinySkill_18426.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LearnDestinySkill_18426)e.getUnfinishedMessage();
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

   public static final class C2S_OpenHeroSkillUi_18431 extends GeneratedMessageV3 implements C2S_OpenHeroSkillUi_18431OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OpenHeroSkillUi_18431 DEFAULT_INSTANCE = new C2S_OpenHeroSkillUi_18431();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenHeroSkillUi_18431> PARSER = new AbstractParser<C2S_OpenHeroSkillUi_18431>() {
         public C2S_OpenHeroSkillUi_18431 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenHeroSkillUi_18431(input, extensionRegistry);
         }
      };

      private C2S_OpenHeroSkillUi_18431(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenHeroSkillUi_18431() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenHeroSkillUi_18431();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenHeroSkillUi_18431(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_OpenHeroSkillUi_18431_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_OpenHeroSkillUi_18431_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenHeroSkillUi_18431.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenHeroSkillUi_18431)) {
            return super.equals(obj);
         } else {
            C2S_OpenHeroSkillUi_18431 other = (C2S_OpenHeroSkillUi_18431)obj;
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

      public static C2S_OpenHeroSkillUi_18431 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenHeroSkillUi_18431)PARSER.parseFrom(data);
      }

      public static C2S_OpenHeroSkillUi_18431 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenHeroSkillUi_18431)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenHeroSkillUi_18431 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenHeroSkillUi_18431)PARSER.parseFrom(data);
      }

      public static C2S_OpenHeroSkillUi_18431 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenHeroSkillUi_18431)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenHeroSkillUi_18431 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenHeroSkillUi_18431)PARSER.parseFrom(data);
      }

      public static C2S_OpenHeroSkillUi_18431 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenHeroSkillUi_18431)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenHeroSkillUi_18431 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenHeroSkillUi_18431)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenHeroSkillUi_18431 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenHeroSkillUi_18431)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenHeroSkillUi_18431 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenHeroSkillUi_18431)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenHeroSkillUi_18431 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenHeroSkillUi_18431)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenHeroSkillUi_18431 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenHeroSkillUi_18431)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenHeroSkillUi_18431 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenHeroSkillUi_18431)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenHeroSkillUi_18431 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenHeroSkillUi_18431 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenHeroSkillUi_18431> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenHeroSkillUi_18431> getParserForType() {
         return PARSER;
      }

      public C2S_OpenHeroSkillUi_18431 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenHeroSkillUi_18431OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_OpenHeroSkillUi_18431_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_OpenHeroSkillUi_18431_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenHeroSkillUi_18431.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.C2S_OpenHeroSkillUi_18431.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_OpenHeroSkillUi_18431_descriptor;
         }

         public C2S_OpenHeroSkillUi_18431 getDefaultInstanceForType() {
            return HeroPalaceMsg.C2S_OpenHeroSkillUi_18431.getDefaultInstance();
         }

         public C2S_OpenHeroSkillUi_18431 build() {
            C2S_OpenHeroSkillUi_18431 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenHeroSkillUi_18431 buildPartial() {
            C2S_OpenHeroSkillUi_18431 result = new C2S_OpenHeroSkillUi_18431(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_OpenHeroSkillUi_18431) {
               return this.mergeFrom((C2S_OpenHeroSkillUi_18431)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenHeroSkillUi_18431 other) {
            if (other == HeroPalaceMsg.C2S_OpenHeroSkillUi_18431.getDefaultInstance()) {
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
            C2S_OpenHeroSkillUi_18431 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenHeroSkillUi_18431)HeroPalaceMsg.C2S_OpenHeroSkillUi_18431.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenHeroSkillUi_18431)e.getUnfinishedMessage();
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

   public static final class S2C_OpenHeroSkillUi_18432 extends GeneratedMessageV3 implements S2C_OpenHeroSkillUi_18432OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_OpenHeroSkillUi_18432 DEFAULT_INSTANCE = new S2C_OpenHeroSkillUi_18432();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenHeroSkillUi_18432> PARSER = new AbstractParser<S2C_OpenHeroSkillUi_18432>() {
         public S2C_OpenHeroSkillUi_18432 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenHeroSkillUi_18432(input, extensionRegistry);
         }
      };

      private S2C_OpenHeroSkillUi_18432(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenHeroSkillUi_18432() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenHeroSkillUi_18432();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenHeroSkillUi_18432(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_OpenHeroSkillUi_18432_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_OpenHeroSkillUi_18432_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenHeroSkillUi_18432.class, Builder.class);
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
         } else if (!(obj instanceof S2C_OpenHeroSkillUi_18432)) {
            return super.equals(obj);
         } else {
            S2C_OpenHeroSkillUi_18432 other = (S2C_OpenHeroSkillUi_18432)obj;
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

      public static S2C_OpenHeroSkillUi_18432 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenHeroSkillUi_18432)PARSER.parseFrom(data);
      }

      public static S2C_OpenHeroSkillUi_18432 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenHeroSkillUi_18432)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenHeroSkillUi_18432 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenHeroSkillUi_18432)PARSER.parseFrom(data);
      }

      public static S2C_OpenHeroSkillUi_18432 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenHeroSkillUi_18432)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenHeroSkillUi_18432 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenHeroSkillUi_18432)PARSER.parseFrom(data);
      }

      public static S2C_OpenHeroSkillUi_18432 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenHeroSkillUi_18432)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenHeroSkillUi_18432 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenHeroSkillUi_18432)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenHeroSkillUi_18432 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenHeroSkillUi_18432)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenHeroSkillUi_18432 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenHeroSkillUi_18432)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenHeroSkillUi_18432 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenHeroSkillUi_18432)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenHeroSkillUi_18432 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenHeroSkillUi_18432)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenHeroSkillUi_18432 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenHeroSkillUi_18432)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenHeroSkillUi_18432 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenHeroSkillUi_18432 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenHeroSkillUi_18432> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenHeroSkillUi_18432> getParserForType() {
         return PARSER;
      }

      public S2C_OpenHeroSkillUi_18432 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenHeroSkillUi_18432OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_OpenHeroSkillUi_18432_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_OpenHeroSkillUi_18432_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenHeroSkillUi_18432.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.S2C_OpenHeroSkillUi_18432.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_OpenHeroSkillUi_18432_descriptor;
         }

         public S2C_OpenHeroSkillUi_18432 getDefaultInstanceForType() {
            return HeroPalaceMsg.S2C_OpenHeroSkillUi_18432.getDefaultInstance();
         }

         public S2C_OpenHeroSkillUi_18432 build() {
            S2C_OpenHeroSkillUi_18432 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenHeroSkillUi_18432 buildPartial() {
            S2C_OpenHeroSkillUi_18432 result = new S2C_OpenHeroSkillUi_18432(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_OpenHeroSkillUi_18432) {
               return this.mergeFrom((S2C_OpenHeroSkillUi_18432)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenHeroSkillUi_18432 other) {
            if (other == HeroPalaceMsg.S2C_OpenHeroSkillUi_18432.getDefaultInstance()) {
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
            S2C_OpenHeroSkillUi_18432 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenHeroSkillUi_18432)HeroPalaceMsg.S2C_OpenHeroSkillUi_18432.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenHeroSkillUi_18432)e.getUnfinishedMessage();
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

   public static final class C2S_UnlockHeroSkill_18433 extends GeneratedMessageV3 implements C2S_UnlockHeroSkill_18433OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SKILLID_FIELD_NUMBER = 1;
      private int skillId_;
      public static final int HEROCODES_FIELD_NUMBER = 2;
      private Internal.IntList heroCodes_;
      private byte memoizedIsInitialized;
      private static final C2S_UnlockHeroSkill_18433 DEFAULT_INSTANCE = new C2S_UnlockHeroSkill_18433();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UnlockHeroSkill_18433> PARSER = new AbstractParser<C2S_UnlockHeroSkill_18433>() {
         public C2S_UnlockHeroSkill_18433 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UnlockHeroSkill_18433(input, extensionRegistry);
         }
      };

      private C2S_UnlockHeroSkill_18433(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UnlockHeroSkill_18433() {
         this.memoizedIsInitialized = -1;
         this.heroCodes_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UnlockHeroSkill_18433();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UnlockHeroSkill_18433(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.skillId_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.heroCodes_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.heroCodes_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.heroCodes_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.heroCodes_.addInt(input.readInt32());
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
                  this.heroCodes_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockHeroSkill_18433_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockHeroSkill_18433_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnlockHeroSkill_18433.class, Builder.class);
      }

      public boolean hasSkillId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSkillId() {
         return this.skillId_;
      }

      public List<Integer> getHeroCodesList() {
         return this.heroCodes_;
      }

      public int getHeroCodesCount() {
         return this.heroCodes_.size();
      }

      public int getHeroCodes(int index) {
         return this.heroCodes_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
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
            output.writeInt32(1, this.skillId_);
         }

         for(int i = 0; i < this.heroCodes_.size(); ++i) {
            output.writeInt32(2, this.heroCodes_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.skillId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.heroCodes_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.heroCodes_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHeroCodesList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_UnlockHeroSkill_18433)) {
            return super.equals(obj);
         } else {
            C2S_UnlockHeroSkill_18433 other = (C2S_UnlockHeroSkill_18433)obj;
            if (this.hasSkillId() != other.hasSkillId()) {
               return false;
            } else if (this.hasSkillId() && this.getSkillId() != other.getSkillId()) {
               return false;
            } else if (!this.getHeroCodesList().equals(other.getHeroCodesList())) {
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
            if (this.hasSkillId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSkillId();
            }

            if (this.getHeroCodesCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCodesList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_UnlockHeroSkill_18433 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UnlockHeroSkill_18433)PARSER.parseFrom(data);
      }

      public static C2S_UnlockHeroSkill_18433 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnlockHeroSkill_18433)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnlockHeroSkill_18433 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UnlockHeroSkill_18433)PARSER.parseFrom(data);
      }

      public static C2S_UnlockHeroSkill_18433 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnlockHeroSkill_18433)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnlockHeroSkill_18433 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UnlockHeroSkill_18433)PARSER.parseFrom(data);
      }

      public static C2S_UnlockHeroSkill_18433 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnlockHeroSkill_18433)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnlockHeroSkill_18433 parseFrom(InputStream input) throws IOException {
         return (C2S_UnlockHeroSkill_18433)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnlockHeroSkill_18433 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnlockHeroSkill_18433)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnlockHeroSkill_18433 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UnlockHeroSkill_18433)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UnlockHeroSkill_18433 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnlockHeroSkill_18433)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnlockHeroSkill_18433 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UnlockHeroSkill_18433)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnlockHeroSkill_18433 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnlockHeroSkill_18433)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UnlockHeroSkill_18433 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UnlockHeroSkill_18433 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UnlockHeroSkill_18433> parser() {
         return PARSER;
      }

      public Parser<C2S_UnlockHeroSkill_18433> getParserForType() {
         return PARSER;
      }

      public C2S_UnlockHeroSkill_18433 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UnlockHeroSkill_18433OrBuilder {
         private int bitField0_;
         private int skillId_;
         private Internal.IntList heroCodes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockHeroSkill_18433_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockHeroSkill_18433_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnlockHeroSkill_18433.class, Builder.class);
         }

         private Builder() {
            this.heroCodes_ = HeroPalaceMsg.C2S_UnlockHeroSkill_18433.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.heroCodes_ = HeroPalaceMsg.C2S_UnlockHeroSkill_18433.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.C2S_UnlockHeroSkill_18433.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.skillId_ = 0;
            this.bitField0_ &= -2;
            this.heroCodes_ = HeroPalaceMsg.C2S_UnlockHeroSkill_18433.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockHeroSkill_18433_descriptor;
         }

         public C2S_UnlockHeroSkill_18433 getDefaultInstanceForType() {
            return HeroPalaceMsg.C2S_UnlockHeroSkill_18433.getDefaultInstance();
         }

         public C2S_UnlockHeroSkill_18433 build() {
            C2S_UnlockHeroSkill_18433 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UnlockHeroSkill_18433 buildPartial() {
            C2S_UnlockHeroSkill_18433 result = new C2S_UnlockHeroSkill_18433(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.skillId_ = this.skillId_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.heroCodes_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.heroCodes_ = this.heroCodes_;
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
            if (other instanceof C2S_UnlockHeroSkill_18433) {
               return this.mergeFrom((C2S_UnlockHeroSkill_18433)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UnlockHeroSkill_18433 other) {
            if (other == HeroPalaceMsg.C2S_UnlockHeroSkill_18433.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSkillId()) {
                  this.setSkillId(other.getSkillId());
               }

               if (!other.heroCodes_.isEmpty()) {
                  if (this.heroCodes_.isEmpty()) {
                     this.heroCodes_ = other.heroCodes_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureHeroCodesIsMutable();
                     this.heroCodes_.addAll(other.heroCodes_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasSkillId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_UnlockHeroSkill_18433 parsedMessage = null;

            try {
               parsedMessage = (C2S_UnlockHeroSkill_18433)HeroPalaceMsg.C2S_UnlockHeroSkill_18433.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UnlockHeroSkill_18433)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSkillId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSkillId() {
            return this.skillId_;
         }

         public Builder setSkillId(int value) {
            this.bitField0_ |= 1;
            this.skillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSkillId() {
            this.bitField0_ &= -2;
            this.skillId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureHeroCodesIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.heroCodes_ = HeroPalaceMsg.C2S_UnlockHeroSkill_18433.mutableCopy(this.heroCodes_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getHeroCodesList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.heroCodes_) : this.heroCodes_);
         }

         public int getHeroCodesCount() {
            return this.heroCodes_.size();
         }

         public int getHeroCodes(int index) {
            return this.heroCodes_.getInt(index);
         }

         public Builder setHeroCodes(int index, int value) {
            this.ensureHeroCodesIsMutable();
            this.heroCodes_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHeroCodes(int value) {
            this.ensureHeroCodesIsMutable();
            this.heroCodes_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHeroCodes(Iterable<? extends Integer> values) {
            this.ensureHeroCodesIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.heroCodes_);
            this.onChanged();
            return this;
         }

         public Builder clearHeroCodes() {
            this.heroCodes_ = HeroPalaceMsg.C2S_UnlockHeroSkill_18433.emptyIntList();
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

   public static final class S2C_UnlockHeroSkill_18434 extends GeneratedMessageV3 implements S2C_UnlockHeroSkill_18434OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int SKILLID_FIELD_NUMBER = 2;
      private int skillId_;
      public static final int HEROSKILLDIR_FIELD_NUMBER = 3;
      private Internal.IntList heroSkillDir_;
      private byte memoizedIsInitialized;
      private static final S2C_UnlockHeroSkill_18434 DEFAULT_INSTANCE = new S2C_UnlockHeroSkill_18434();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UnlockHeroSkill_18434> PARSER = new AbstractParser<S2C_UnlockHeroSkill_18434>() {
         public S2C_UnlockHeroSkill_18434 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UnlockHeroSkill_18434(input, extensionRegistry);
         }
      };

      private S2C_UnlockHeroSkill_18434(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UnlockHeroSkill_18434() {
         this.memoizedIsInitialized = -1;
         this.heroSkillDir_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UnlockHeroSkill_18434();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UnlockHeroSkill_18434(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.skillId_ = input.readInt32();
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.heroSkillDir_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.heroSkillDir_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.heroSkillDir_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.heroSkillDir_.addInt(input.readInt32());
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
                  this.heroSkillDir_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockHeroSkill_18434_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockHeroSkill_18434_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnlockHeroSkill_18434.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasSkillId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSkillId() {
         return this.skillId_;
      }

      public List<Integer> getHeroSkillDirList() {
         return this.heroSkillDir_;
      }

      public int getHeroSkillDirCount() {
         return this.heroSkillDir_.size();
      }

      public int getHeroSkillDir(int index) {
         return this.heroSkillDir_.getInt(index);
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
            output.writeInt32(1, this.result_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.skillId_);
         }

         for(int i = 0; i < this.heroSkillDir_.size(); ++i) {
            output.writeInt32(3, this.heroSkillDir_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(2, this.skillId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.heroSkillDir_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.heroSkillDir_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHeroSkillDirList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UnlockHeroSkill_18434)) {
            return super.equals(obj);
         } else {
            S2C_UnlockHeroSkill_18434 other = (S2C_UnlockHeroSkill_18434)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasSkillId() != other.hasSkillId()) {
               return false;
            } else if (this.hasSkillId() && this.getSkillId() != other.getSkillId()) {
               return false;
            } else if (!this.getHeroSkillDirList().equals(other.getHeroSkillDirList())) {
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

            if (this.hasSkillId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSkillId();
            }

            if (this.getHeroSkillDirCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHeroSkillDirList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UnlockHeroSkill_18434 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UnlockHeroSkill_18434)PARSER.parseFrom(data);
      }

      public static S2C_UnlockHeroSkill_18434 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockHeroSkill_18434)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockHeroSkill_18434 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UnlockHeroSkill_18434)PARSER.parseFrom(data);
      }

      public static S2C_UnlockHeroSkill_18434 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockHeroSkill_18434)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockHeroSkill_18434 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UnlockHeroSkill_18434)PARSER.parseFrom(data);
      }

      public static S2C_UnlockHeroSkill_18434 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockHeroSkill_18434)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockHeroSkill_18434 parseFrom(InputStream input) throws IOException {
         return (S2C_UnlockHeroSkill_18434)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnlockHeroSkill_18434 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockHeroSkill_18434)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnlockHeroSkill_18434 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UnlockHeroSkill_18434)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UnlockHeroSkill_18434 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockHeroSkill_18434)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnlockHeroSkill_18434 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UnlockHeroSkill_18434)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnlockHeroSkill_18434 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockHeroSkill_18434)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UnlockHeroSkill_18434 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UnlockHeroSkill_18434 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UnlockHeroSkill_18434> parser() {
         return PARSER;
      }

      public Parser<S2C_UnlockHeroSkill_18434> getParserForType() {
         return PARSER;
      }

      public S2C_UnlockHeroSkill_18434 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UnlockHeroSkill_18434OrBuilder {
         private int bitField0_;
         private int result_;
         private int skillId_;
         private Internal.IntList heroSkillDir_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockHeroSkill_18434_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockHeroSkill_18434_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnlockHeroSkill_18434.class, Builder.class);
         }

         private Builder() {
            this.heroSkillDir_ = HeroPalaceMsg.S2C_UnlockHeroSkill_18434.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.heroSkillDir_ = HeroPalaceMsg.S2C_UnlockHeroSkill_18434.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.S2C_UnlockHeroSkill_18434.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.skillId_ = 0;
            this.bitField0_ &= -3;
            this.heroSkillDir_ = HeroPalaceMsg.S2C_UnlockHeroSkill_18434.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockHeroSkill_18434_descriptor;
         }

         public S2C_UnlockHeroSkill_18434 getDefaultInstanceForType() {
            return HeroPalaceMsg.S2C_UnlockHeroSkill_18434.getDefaultInstance();
         }

         public S2C_UnlockHeroSkill_18434 build() {
            S2C_UnlockHeroSkill_18434 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UnlockHeroSkill_18434 buildPartial() {
            S2C_UnlockHeroSkill_18434 result = new S2C_UnlockHeroSkill_18434(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.skillId_ = this.skillId_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.heroSkillDir_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.heroSkillDir_ = this.heroSkillDir_;
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
            if (other instanceof S2C_UnlockHeroSkill_18434) {
               return this.mergeFrom((S2C_UnlockHeroSkill_18434)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UnlockHeroSkill_18434 other) {
            if (other == HeroPalaceMsg.S2C_UnlockHeroSkill_18434.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasSkillId()) {
                  this.setSkillId(other.getSkillId());
               }

               if (!other.heroSkillDir_.isEmpty()) {
                  if (this.heroSkillDir_.isEmpty()) {
                     this.heroSkillDir_ = other.heroSkillDir_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureHeroSkillDirIsMutable();
                     this.heroSkillDir_.addAll(other.heroSkillDir_);
                  }

                  this.onChanged();
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
               return this.hasSkillId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UnlockHeroSkill_18434 parsedMessage = null;

            try {
               parsedMessage = (S2C_UnlockHeroSkill_18434)HeroPalaceMsg.S2C_UnlockHeroSkill_18434.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UnlockHeroSkill_18434)e.getUnfinishedMessage();
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

         public boolean hasSkillId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSkillId() {
            return this.skillId_;
         }

         public Builder setSkillId(int value) {
            this.bitField0_ |= 2;
            this.skillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSkillId() {
            this.bitField0_ &= -3;
            this.skillId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureHeroSkillDirIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.heroSkillDir_ = HeroPalaceMsg.S2C_UnlockHeroSkill_18434.mutableCopy(this.heroSkillDir_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getHeroSkillDirList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.heroSkillDir_) : this.heroSkillDir_);
         }

         public int getHeroSkillDirCount() {
            return this.heroSkillDir_.size();
         }

         public int getHeroSkillDir(int index) {
            return this.heroSkillDir_.getInt(index);
         }

         public Builder setHeroSkillDir(int index, int value) {
            this.ensureHeroSkillDirIsMutable();
            this.heroSkillDir_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHeroSkillDir(int value) {
            this.ensureHeroSkillDirIsMutable();
            this.heroSkillDir_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHeroSkillDir(Iterable<? extends Integer> values) {
            this.ensureHeroSkillDirIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.heroSkillDir_);
            this.onChanged();
            return this;
         }

         public Builder clearHeroSkillDir() {
            this.heroSkillDir_ = HeroPalaceMsg.S2C_UnlockHeroSkill_18434.emptyIntList();
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

   public static final class C2S_UpgradeHeroSkill_18435 extends GeneratedMessageV3 implements C2S_UpgradeHeroSkill_18435OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SKILLID_FIELD_NUMBER = 1;
      private int skillId_;
      public static final int HEROCODES_FIELD_NUMBER = 2;
      private Internal.IntList heroCodes_;
      private byte memoizedIsInitialized;
      private static final C2S_UpgradeHeroSkill_18435 DEFAULT_INSTANCE = new C2S_UpgradeHeroSkill_18435();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UpgradeHeroSkill_18435> PARSER = new AbstractParser<C2S_UpgradeHeroSkill_18435>() {
         public C2S_UpgradeHeroSkill_18435 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UpgradeHeroSkill_18435(input, extensionRegistry);
         }
      };

      private C2S_UpgradeHeroSkill_18435(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UpgradeHeroSkill_18435() {
         this.memoizedIsInitialized = -1;
         this.heroCodes_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UpgradeHeroSkill_18435();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UpgradeHeroSkill_18435(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.skillId_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.heroCodes_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.heroCodes_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.heroCodes_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.heroCodes_.addInt(input.readInt32());
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
                  this.heroCodes_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradeHeroSkill_18435_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradeHeroSkill_18435_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UpgradeHeroSkill_18435.class, Builder.class);
      }

      public boolean hasSkillId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSkillId() {
         return this.skillId_;
      }

      public List<Integer> getHeroCodesList() {
         return this.heroCodes_;
      }

      public int getHeroCodesCount() {
         return this.heroCodes_.size();
      }

      public int getHeroCodes(int index) {
         return this.heroCodes_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
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
            output.writeInt32(1, this.skillId_);
         }

         for(int i = 0; i < this.heroCodes_.size(); ++i) {
            output.writeInt32(2, this.heroCodes_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.skillId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.heroCodes_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.heroCodes_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHeroCodesList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_UpgradeHeroSkill_18435)) {
            return super.equals(obj);
         } else {
            C2S_UpgradeHeroSkill_18435 other = (C2S_UpgradeHeroSkill_18435)obj;
            if (this.hasSkillId() != other.hasSkillId()) {
               return false;
            } else if (this.hasSkillId() && this.getSkillId() != other.getSkillId()) {
               return false;
            } else if (!this.getHeroCodesList().equals(other.getHeroCodesList())) {
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
            if (this.hasSkillId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSkillId();
            }

            if (this.getHeroCodesCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCodesList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_UpgradeHeroSkill_18435 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UpgradeHeroSkill_18435)PARSER.parseFrom(data);
      }

      public static C2S_UpgradeHeroSkill_18435 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpgradeHeroSkill_18435)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpgradeHeroSkill_18435 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UpgradeHeroSkill_18435)PARSER.parseFrom(data);
      }

      public static C2S_UpgradeHeroSkill_18435 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpgradeHeroSkill_18435)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpgradeHeroSkill_18435 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UpgradeHeroSkill_18435)PARSER.parseFrom(data);
      }

      public static C2S_UpgradeHeroSkill_18435 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpgradeHeroSkill_18435)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpgradeHeroSkill_18435 parseFrom(InputStream input) throws IOException {
         return (C2S_UpgradeHeroSkill_18435)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UpgradeHeroSkill_18435 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpgradeHeroSkill_18435)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UpgradeHeroSkill_18435 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UpgradeHeroSkill_18435)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UpgradeHeroSkill_18435 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpgradeHeroSkill_18435)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UpgradeHeroSkill_18435 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UpgradeHeroSkill_18435)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UpgradeHeroSkill_18435 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpgradeHeroSkill_18435)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UpgradeHeroSkill_18435 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UpgradeHeroSkill_18435 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UpgradeHeroSkill_18435> parser() {
         return PARSER;
      }

      public Parser<C2S_UpgradeHeroSkill_18435> getParserForType() {
         return PARSER;
      }

      public C2S_UpgradeHeroSkill_18435 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UpgradeHeroSkill_18435OrBuilder {
         private int bitField0_;
         private int skillId_;
         private Internal.IntList heroCodes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradeHeroSkill_18435_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradeHeroSkill_18435_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UpgradeHeroSkill_18435.class, Builder.class);
         }

         private Builder() {
            this.heroCodes_ = HeroPalaceMsg.C2S_UpgradeHeroSkill_18435.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.heroCodes_ = HeroPalaceMsg.C2S_UpgradeHeroSkill_18435.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.C2S_UpgradeHeroSkill_18435.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.skillId_ = 0;
            this.bitField0_ &= -2;
            this.heroCodes_ = HeroPalaceMsg.C2S_UpgradeHeroSkill_18435.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradeHeroSkill_18435_descriptor;
         }

         public C2S_UpgradeHeroSkill_18435 getDefaultInstanceForType() {
            return HeroPalaceMsg.C2S_UpgradeHeroSkill_18435.getDefaultInstance();
         }

         public C2S_UpgradeHeroSkill_18435 build() {
            C2S_UpgradeHeroSkill_18435 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UpgradeHeroSkill_18435 buildPartial() {
            C2S_UpgradeHeroSkill_18435 result = new C2S_UpgradeHeroSkill_18435(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.skillId_ = this.skillId_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.heroCodes_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.heroCodes_ = this.heroCodes_;
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
            if (other instanceof C2S_UpgradeHeroSkill_18435) {
               return this.mergeFrom((C2S_UpgradeHeroSkill_18435)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UpgradeHeroSkill_18435 other) {
            if (other == HeroPalaceMsg.C2S_UpgradeHeroSkill_18435.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSkillId()) {
                  this.setSkillId(other.getSkillId());
               }

               if (!other.heroCodes_.isEmpty()) {
                  if (this.heroCodes_.isEmpty()) {
                     this.heroCodes_ = other.heroCodes_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureHeroCodesIsMutable();
                     this.heroCodes_.addAll(other.heroCodes_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasSkillId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_UpgradeHeroSkill_18435 parsedMessage = null;

            try {
               parsedMessage = (C2S_UpgradeHeroSkill_18435)HeroPalaceMsg.C2S_UpgradeHeroSkill_18435.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UpgradeHeroSkill_18435)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSkillId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSkillId() {
            return this.skillId_;
         }

         public Builder setSkillId(int value) {
            this.bitField0_ |= 1;
            this.skillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSkillId() {
            this.bitField0_ &= -2;
            this.skillId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureHeroCodesIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.heroCodes_ = HeroPalaceMsg.C2S_UpgradeHeroSkill_18435.mutableCopy(this.heroCodes_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getHeroCodesList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.heroCodes_) : this.heroCodes_);
         }

         public int getHeroCodesCount() {
            return this.heroCodes_.size();
         }

         public int getHeroCodes(int index) {
            return this.heroCodes_.getInt(index);
         }

         public Builder setHeroCodes(int index, int value) {
            this.ensureHeroCodesIsMutable();
            this.heroCodes_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHeroCodes(int value) {
            this.ensureHeroCodesIsMutable();
            this.heroCodes_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHeroCodes(Iterable<? extends Integer> values) {
            this.ensureHeroCodesIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.heroCodes_);
            this.onChanged();
            return this;
         }

         public Builder clearHeroCodes() {
            this.heroCodes_ = HeroPalaceMsg.C2S_UpgradeHeroSkill_18435.emptyIntList();
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

   public static final class S2C_UpgradeHeroSkill_18436 extends GeneratedMessageV3 implements S2C_UpgradeHeroSkill_18436OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int SKILLID_FIELD_NUMBER = 2;
      private int skillId_;
      public static final int NEWSKILLID_FIELD_NUMBER = 3;
      private int newSkillId_;
      public static final int HEROSKILLDIR_FIELD_NUMBER = 4;
      private Internal.IntList heroSkillDir_;
      private byte memoizedIsInitialized;
      private static final S2C_UpgradeHeroSkill_18436 DEFAULT_INSTANCE = new S2C_UpgradeHeroSkill_18436();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpgradeHeroSkill_18436> PARSER = new AbstractParser<S2C_UpgradeHeroSkill_18436>() {
         public S2C_UpgradeHeroSkill_18436 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpgradeHeroSkill_18436(input, extensionRegistry);
         }
      };

      private S2C_UpgradeHeroSkill_18436(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpgradeHeroSkill_18436() {
         this.memoizedIsInitialized = -1;
         this.heroSkillDir_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpgradeHeroSkill_18436();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpgradeHeroSkill_18436(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.skillId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.newSkillId_ = input.readInt32();
                        break;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.heroSkillDir_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.heroSkillDir_.addInt(input.readInt32());
                        break;
                     case 34:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.heroSkillDir_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.heroSkillDir_.addInt(input.readInt32());
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
               if ((mutable_bitField0_ & 8) != 0) {
                  this.heroSkillDir_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradeHeroSkill_18436_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradeHeroSkill_18436_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpgradeHeroSkill_18436.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasSkillId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSkillId() {
         return this.skillId_;
      }

      public boolean hasNewSkillId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getNewSkillId() {
         return this.newSkillId_;
      }

      public List<Integer> getHeroSkillDirList() {
         return this.heroSkillDir_;
      }

      public int getHeroSkillDirCount() {
         return this.heroSkillDir_.size();
      }

      public int getHeroSkillDir(int index) {
         return this.heroSkillDir_.getInt(index);
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
         } else if (!this.hasSkillId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasNewSkillId()) {
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
            output.writeInt32(2, this.skillId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.newSkillId_);
         }

         for(int i = 0; i < this.heroSkillDir_.size(); ++i) {
            output.writeInt32(4, this.heroSkillDir_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(2, this.skillId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.newSkillId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.heroSkillDir_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.heroSkillDir_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHeroSkillDirList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpgradeHeroSkill_18436)) {
            return super.equals(obj);
         } else {
            S2C_UpgradeHeroSkill_18436 other = (S2C_UpgradeHeroSkill_18436)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasSkillId() != other.hasSkillId()) {
               return false;
            } else if (this.hasSkillId() && this.getSkillId() != other.getSkillId()) {
               return false;
            } else if (this.hasNewSkillId() != other.hasNewSkillId()) {
               return false;
            } else if (this.hasNewSkillId() && this.getNewSkillId() != other.getNewSkillId()) {
               return false;
            } else if (!this.getHeroSkillDirList().equals(other.getHeroSkillDirList())) {
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

            if (this.hasSkillId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSkillId();
            }

            if (this.hasNewSkillId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getNewSkillId();
            }

            if (this.getHeroSkillDirCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHeroSkillDirList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpgradeHeroSkill_18436 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpgradeHeroSkill_18436)PARSER.parseFrom(data);
      }

      public static S2C_UpgradeHeroSkill_18436 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpgradeHeroSkill_18436)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpgradeHeroSkill_18436 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpgradeHeroSkill_18436)PARSER.parseFrom(data);
      }

      public static S2C_UpgradeHeroSkill_18436 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpgradeHeroSkill_18436)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpgradeHeroSkill_18436 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpgradeHeroSkill_18436)PARSER.parseFrom(data);
      }

      public static S2C_UpgradeHeroSkill_18436 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpgradeHeroSkill_18436)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpgradeHeroSkill_18436 parseFrom(InputStream input) throws IOException {
         return (S2C_UpgradeHeroSkill_18436)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpgradeHeroSkill_18436 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpgradeHeroSkill_18436)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpgradeHeroSkill_18436 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpgradeHeroSkill_18436)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpgradeHeroSkill_18436 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpgradeHeroSkill_18436)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpgradeHeroSkill_18436 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpgradeHeroSkill_18436)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpgradeHeroSkill_18436 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpgradeHeroSkill_18436)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpgradeHeroSkill_18436 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpgradeHeroSkill_18436 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpgradeHeroSkill_18436> parser() {
         return PARSER;
      }

      public Parser<S2C_UpgradeHeroSkill_18436> getParserForType() {
         return PARSER;
      }

      public S2C_UpgradeHeroSkill_18436 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpgradeHeroSkill_18436OrBuilder {
         private int bitField0_;
         private int result_;
         private int skillId_;
         private int newSkillId_;
         private Internal.IntList heroSkillDir_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradeHeroSkill_18436_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradeHeroSkill_18436_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpgradeHeroSkill_18436.class, Builder.class);
         }

         private Builder() {
            this.heroSkillDir_ = HeroPalaceMsg.S2C_UpgradeHeroSkill_18436.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.heroSkillDir_ = HeroPalaceMsg.S2C_UpgradeHeroSkill_18436.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.S2C_UpgradeHeroSkill_18436.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.skillId_ = 0;
            this.bitField0_ &= -3;
            this.newSkillId_ = 0;
            this.bitField0_ &= -5;
            this.heroSkillDir_ = HeroPalaceMsg.S2C_UpgradeHeroSkill_18436.emptyIntList();
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradeHeroSkill_18436_descriptor;
         }

         public S2C_UpgradeHeroSkill_18436 getDefaultInstanceForType() {
            return HeroPalaceMsg.S2C_UpgradeHeroSkill_18436.getDefaultInstance();
         }

         public S2C_UpgradeHeroSkill_18436 build() {
            S2C_UpgradeHeroSkill_18436 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpgradeHeroSkill_18436 buildPartial() {
            S2C_UpgradeHeroSkill_18436 result = new S2C_UpgradeHeroSkill_18436(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.skillId_ = this.skillId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.newSkillId_ = this.newSkillId_;
               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 8) != 0) {
               this.heroSkillDir_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.heroSkillDir_ = this.heroSkillDir_;
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
            if (other instanceof S2C_UpgradeHeroSkill_18436) {
               return this.mergeFrom((S2C_UpgradeHeroSkill_18436)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpgradeHeroSkill_18436 other) {
            if (other == HeroPalaceMsg.S2C_UpgradeHeroSkill_18436.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasSkillId()) {
                  this.setSkillId(other.getSkillId());
               }

               if (other.hasNewSkillId()) {
                  this.setNewSkillId(other.getNewSkillId());
               }

               if (!other.heroSkillDir_.isEmpty()) {
                  if (this.heroSkillDir_.isEmpty()) {
                     this.heroSkillDir_ = other.heroSkillDir_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureHeroSkillDirIsMutable();
                     this.heroSkillDir_.addAll(other.heroSkillDir_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasSkillId()) {
               return false;
            } else {
               return this.hasNewSkillId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UpgradeHeroSkill_18436 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpgradeHeroSkill_18436)HeroPalaceMsg.S2C_UpgradeHeroSkill_18436.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpgradeHeroSkill_18436)e.getUnfinishedMessage();
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

         public boolean hasSkillId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSkillId() {
            return this.skillId_;
         }

         public Builder setSkillId(int value) {
            this.bitField0_ |= 2;
            this.skillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSkillId() {
            this.bitField0_ &= -3;
            this.skillId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasNewSkillId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getNewSkillId() {
            return this.newSkillId_;
         }

         public Builder setNewSkillId(int value) {
            this.bitField0_ |= 4;
            this.newSkillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNewSkillId() {
            this.bitField0_ &= -5;
            this.newSkillId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureHeroSkillDirIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.heroSkillDir_ = HeroPalaceMsg.S2C_UpgradeHeroSkill_18436.mutableCopy(this.heroSkillDir_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getHeroSkillDirList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.heroSkillDir_) : this.heroSkillDir_);
         }

         public int getHeroSkillDirCount() {
            return this.heroSkillDir_.size();
         }

         public int getHeroSkillDir(int index) {
            return this.heroSkillDir_.getInt(index);
         }

         public Builder setHeroSkillDir(int index, int value) {
            this.ensureHeroSkillDirIsMutable();
            this.heroSkillDir_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHeroSkillDir(int value) {
            this.ensureHeroSkillDirIsMutable();
            this.heroSkillDir_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHeroSkillDir(Iterable<? extends Integer> values) {
            this.ensureHeroSkillDirIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.heroSkillDir_);
            this.onChanged();
            return this;
         }

         public Builder clearHeroSkillDir() {
            this.heroSkillDir_ = HeroPalaceMsg.S2C_UpgradeHeroSkill_18436.emptyIntList();
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

   public static final class C2S_ResetHeroSkill_18437 extends GeneratedMessageV3 implements C2S_ResetHeroSkill_18437OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SKILLID_FIELD_NUMBER = 1;
      private int skillId_;
      private byte memoizedIsInitialized;
      private static final C2S_ResetHeroSkill_18437 DEFAULT_INSTANCE = new C2S_ResetHeroSkill_18437();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ResetHeroSkill_18437> PARSER = new AbstractParser<C2S_ResetHeroSkill_18437>() {
         public C2S_ResetHeroSkill_18437 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ResetHeroSkill_18437(input, extensionRegistry);
         }
      };

      private C2S_ResetHeroSkill_18437(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ResetHeroSkill_18437() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ResetHeroSkill_18437();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ResetHeroSkill_18437(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_ResetHeroSkill_18437_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_ResetHeroSkill_18437_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ResetHeroSkill_18437.class, Builder.class);
      }

      public boolean hasSkillId() {
         return (this.bitField0_ & 1) != 0;
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
            output.writeInt32(1, this.skillId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.skillId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ResetHeroSkill_18437)) {
            return super.equals(obj);
         } else {
            C2S_ResetHeroSkill_18437 other = (C2S_ResetHeroSkill_18437)obj;
            if (this.hasSkillId() != other.hasSkillId()) {
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
            if (this.hasSkillId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSkillId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ResetHeroSkill_18437 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ResetHeroSkill_18437)PARSER.parseFrom(data);
      }

      public static C2S_ResetHeroSkill_18437 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetHeroSkill_18437)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetHeroSkill_18437 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ResetHeroSkill_18437)PARSER.parseFrom(data);
      }

      public static C2S_ResetHeroSkill_18437 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetHeroSkill_18437)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetHeroSkill_18437 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ResetHeroSkill_18437)PARSER.parseFrom(data);
      }

      public static C2S_ResetHeroSkill_18437 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetHeroSkill_18437)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetHeroSkill_18437 parseFrom(InputStream input) throws IOException {
         return (C2S_ResetHeroSkill_18437)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ResetHeroSkill_18437 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetHeroSkill_18437)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ResetHeroSkill_18437 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ResetHeroSkill_18437)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ResetHeroSkill_18437 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetHeroSkill_18437)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ResetHeroSkill_18437 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ResetHeroSkill_18437)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ResetHeroSkill_18437 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetHeroSkill_18437)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ResetHeroSkill_18437 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ResetHeroSkill_18437 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ResetHeroSkill_18437> parser() {
         return PARSER;
      }

      public Parser<C2S_ResetHeroSkill_18437> getParserForType() {
         return PARSER;
      }

      public C2S_ResetHeroSkill_18437 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ResetHeroSkill_18437OrBuilder {
         private int bitField0_;
         private int skillId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_ResetHeroSkill_18437_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_ResetHeroSkill_18437_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ResetHeroSkill_18437.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.C2S_ResetHeroSkill_18437.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.skillId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_ResetHeroSkill_18437_descriptor;
         }

         public C2S_ResetHeroSkill_18437 getDefaultInstanceForType() {
            return HeroPalaceMsg.C2S_ResetHeroSkill_18437.getDefaultInstance();
         }

         public C2S_ResetHeroSkill_18437 build() {
            C2S_ResetHeroSkill_18437 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ResetHeroSkill_18437 buildPartial() {
            C2S_ResetHeroSkill_18437 result = new C2S_ResetHeroSkill_18437(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.skillId_ = this.skillId_;
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
            if (other instanceof C2S_ResetHeroSkill_18437) {
               return this.mergeFrom((C2S_ResetHeroSkill_18437)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ResetHeroSkill_18437 other) {
            if (other == HeroPalaceMsg.C2S_ResetHeroSkill_18437.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSkillId()) {
                  this.setSkillId(other.getSkillId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasSkillId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ResetHeroSkill_18437 parsedMessage = null;

            try {
               parsedMessage = (C2S_ResetHeroSkill_18437)HeroPalaceMsg.C2S_ResetHeroSkill_18437.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ResetHeroSkill_18437)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSkillId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSkillId() {
            return this.skillId_;
         }

         public Builder setSkillId(int value) {
            this.bitField0_ |= 1;
            this.skillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSkillId() {
            this.bitField0_ &= -2;
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

   public static final class S2C_ResetHeroSkill_18438 extends GeneratedMessageV3 implements S2C_ResetHeroSkill_18438OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int SKILLID_FIELD_NUMBER = 2;
      private int skillId_;
      public static final int NEWSKILLID_FIELD_NUMBER = 3;
      private int newSkillId_;
      public static final int HEROSKILLDIR_FIELD_NUMBER = 4;
      private Internal.IntList heroSkillDir_;
      private byte memoizedIsInitialized;
      private static final S2C_ResetHeroSkill_18438 DEFAULT_INSTANCE = new S2C_ResetHeroSkill_18438();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ResetHeroSkill_18438> PARSER = new AbstractParser<S2C_ResetHeroSkill_18438>() {
         public S2C_ResetHeroSkill_18438 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ResetHeroSkill_18438(input, extensionRegistry);
         }
      };

      private S2C_ResetHeroSkill_18438(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ResetHeroSkill_18438() {
         this.memoizedIsInitialized = -1;
         this.heroSkillDir_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ResetHeroSkill_18438();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ResetHeroSkill_18438(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.skillId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.newSkillId_ = input.readInt32();
                        break;
                     case 32:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.heroSkillDir_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        this.heroSkillDir_.addInt(input.readInt32());
                        break;
                     case 34:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 8) == 0 && input.getBytesUntilLimit() > 0) {
                           this.heroSkillDir_ = newIntList();
                           mutable_bitField0_ |= 8;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.heroSkillDir_.addInt(input.readInt32());
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
               if ((mutable_bitField0_ & 8) != 0) {
                  this.heroSkillDir_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_ResetHeroSkill_18438_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_ResetHeroSkill_18438_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ResetHeroSkill_18438.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasSkillId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSkillId() {
         return this.skillId_;
      }

      public boolean hasNewSkillId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getNewSkillId() {
         return this.newSkillId_;
      }

      public List<Integer> getHeroSkillDirList() {
         return this.heroSkillDir_;
      }

      public int getHeroSkillDirCount() {
         return this.heroSkillDir_.size();
      }

      public int getHeroSkillDir(int index) {
         return this.heroSkillDir_.getInt(index);
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
         } else if (!this.hasSkillId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasNewSkillId()) {
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
            output.writeInt32(2, this.skillId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.newSkillId_);
         }

         for(int i = 0; i < this.heroSkillDir_.size(); ++i) {
            output.writeInt32(4, this.heroSkillDir_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(2, this.skillId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.newSkillId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.heroSkillDir_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.heroSkillDir_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getHeroSkillDirList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ResetHeroSkill_18438)) {
            return super.equals(obj);
         } else {
            S2C_ResetHeroSkill_18438 other = (S2C_ResetHeroSkill_18438)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasSkillId() != other.hasSkillId()) {
               return false;
            } else if (this.hasSkillId() && this.getSkillId() != other.getSkillId()) {
               return false;
            } else if (this.hasNewSkillId() != other.hasNewSkillId()) {
               return false;
            } else if (this.hasNewSkillId() && this.getNewSkillId() != other.getNewSkillId()) {
               return false;
            } else if (!this.getHeroSkillDirList().equals(other.getHeroSkillDirList())) {
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

            if (this.hasSkillId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSkillId();
            }

            if (this.hasNewSkillId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getNewSkillId();
            }

            if (this.getHeroSkillDirCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHeroSkillDirList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ResetHeroSkill_18438 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ResetHeroSkill_18438)PARSER.parseFrom(data);
      }

      public static S2C_ResetHeroSkill_18438 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetHeroSkill_18438)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetHeroSkill_18438 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ResetHeroSkill_18438)PARSER.parseFrom(data);
      }

      public static S2C_ResetHeroSkill_18438 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetHeroSkill_18438)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetHeroSkill_18438 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ResetHeroSkill_18438)PARSER.parseFrom(data);
      }

      public static S2C_ResetHeroSkill_18438 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetHeroSkill_18438)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetHeroSkill_18438 parseFrom(InputStream input) throws IOException {
         return (S2C_ResetHeroSkill_18438)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ResetHeroSkill_18438 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetHeroSkill_18438)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ResetHeroSkill_18438 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ResetHeroSkill_18438)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ResetHeroSkill_18438 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetHeroSkill_18438)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ResetHeroSkill_18438 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ResetHeroSkill_18438)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ResetHeroSkill_18438 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetHeroSkill_18438)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ResetHeroSkill_18438 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ResetHeroSkill_18438 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ResetHeroSkill_18438> parser() {
         return PARSER;
      }

      public Parser<S2C_ResetHeroSkill_18438> getParserForType() {
         return PARSER;
      }

      public S2C_ResetHeroSkill_18438 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ResetHeroSkill_18438OrBuilder {
         private int bitField0_;
         private int result_;
         private int skillId_;
         private int newSkillId_;
         private Internal.IntList heroSkillDir_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_ResetHeroSkill_18438_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_ResetHeroSkill_18438_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ResetHeroSkill_18438.class, Builder.class);
         }

         private Builder() {
            this.heroSkillDir_ = HeroPalaceMsg.S2C_ResetHeroSkill_18438.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.heroSkillDir_ = HeroPalaceMsg.S2C_ResetHeroSkill_18438.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.S2C_ResetHeroSkill_18438.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.skillId_ = 0;
            this.bitField0_ &= -3;
            this.newSkillId_ = 0;
            this.bitField0_ &= -5;
            this.heroSkillDir_ = HeroPalaceMsg.S2C_ResetHeroSkill_18438.emptyIntList();
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_ResetHeroSkill_18438_descriptor;
         }

         public S2C_ResetHeroSkill_18438 getDefaultInstanceForType() {
            return HeroPalaceMsg.S2C_ResetHeroSkill_18438.getDefaultInstance();
         }

         public S2C_ResetHeroSkill_18438 build() {
            S2C_ResetHeroSkill_18438 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ResetHeroSkill_18438 buildPartial() {
            S2C_ResetHeroSkill_18438 result = new S2C_ResetHeroSkill_18438(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.skillId_ = this.skillId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.newSkillId_ = this.newSkillId_;
               to_bitField0_ |= 4;
            }

            if ((this.bitField0_ & 8) != 0) {
               this.heroSkillDir_.makeImmutable();
               this.bitField0_ &= -9;
            }

            result.heroSkillDir_ = this.heroSkillDir_;
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
            if (other instanceof S2C_ResetHeroSkill_18438) {
               return this.mergeFrom((S2C_ResetHeroSkill_18438)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ResetHeroSkill_18438 other) {
            if (other == HeroPalaceMsg.S2C_ResetHeroSkill_18438.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasSkillId()) {
                  this.setSkillId(other.getSkillId());
               }

               if (other.hasNewSkillId()) {
                  this.setNewSkillId(other.getNewSkillId());
               }

               if (!other.heroSkillDir_.isEmpty()) {
                  if (this.heroSkillDir_.isEmpty()) {
                     this.heroSkillDir_ = other.heroSkillDir_;
                     this.bitField0_ &= -9;
                  } else {
                     this.ensureHeroSkillDirIsMutable();
                     this.heroSkillDir_.addAll(other.heroSkillDir_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasSkillId()) {
               return false;
            } else {
               return this.hasNewSkillId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ResetHeroSkill_18438 parsedMessage = null;

            try {
               parsedMessage = (S2C_ResetHeroSkill_18438)HeroPalaceMsg.S2C_ResetHeroSkill_18438.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ResetHeroSkill_18438)e.getUnfinishedMessage();
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

         public boolean hasSkillId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSkillId() {
            return this.skillId_;
         }

         public Builder setSkillId(int value) {
            this.bitField0_ |= 2;
            this.skillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSkillId() {
            this.bitField0_ &= -3;
            this.skillId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasNewSkillId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getNewSkillId() {
            return this.newSkillId_;
         }

         public Builder setNewSkillId(int value) {
            this.bitField0_ |= 4;
            this.newSkillId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearNewSkillId() {
            this.bitField0_ &= -5;
            this.newSkillId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureHeroSkillDirIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.heroSkillDir_ = HeroPalaceMsg.S2C_ResetHeroSkill_18438.mutableCopy(this.heroSkillDir_);
               this.bitField0_ |= 8;
            }

         }

         public List<Integer> getHeroSkillDirList() {
            return (List<Integer>)((this.bitField0_ & 8) != 0 ? Collections.unmodifiableList(this.heroSkillDir_) : this.heroSkillDir_);
         }

         public int getHeroSkillDirCount() {
            return this.heroSkillDir_.size();
         }

         public int getHeroSkillDir(int index) {
            return this.heroSkillDir_.getInt(index);
         }

         public Builder setHeroSkillDir(int index, int value) {
            this.ensureHeroSkillDirIsMutable();
            this.heroSkillDir_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addHeroSkillDir(int value) {
            this.ensureHeroSkillDirIsMutable();
            this.heroSkillDir_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllHeroSkillDir(Iterable<? extends Integer> values) {
            this.ensureHeroSkillDirIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.heroSkillDir_);
            this.onChanged();
            return this;
         }

         public Builder clearHeroSkillDir() {
            this.heroSkillDir_ = HeroPalaceMsg.S2C_ResetHeroSkill_18438.emptyIntList();
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

   public static final class C2S_PalaceTitle_18441 extends GeneratedMessageV3 implements C2S_PalaceTitle_18441OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_PalaceTitle_18441 DEFAULT_INSTANCE = new C2S_PalaceTitle_18441();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PalaceTitle_18441> PARSER = new AbstractParser<C2S_PalaceTitle_18441>() {
         public C2S_PalaceTitle_18441 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PalaceTitle_18441(input, extensionRegistry);
         }
      };

      private C2S_PalaceTitle_18441(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PalaceTitle_18441() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PalaceTitle_18441();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PalaceTitle_18441(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_PalaceTitle_18441_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_PalaceTitle_18441_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PalaceTitle_18441.class, Builder.class);
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
         } else if (!(obj instanceof C2S_PalaceTitle_18441)) {
            return super.equals(obj);
         } else {
            C2S_PalaceTitle_18441 other = (C2S_PalaceTitle_18441)obj;
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

      public static C2S_PalaceTitle_18441 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PalaceTitle_18441)PARSER.parseFrom(data);
      }

      public static C2S_PalaceTitle_18441 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PalaceTitle_18441)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PalaceTitle_18441 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PalaceTitle_18441)PARSER.parseFrom(data);
      }

      public static C2S_PalaceTitle_18441 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PalaceTitle_18441)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PalaceTitle_18441 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PalaceTitle_18441)PARSER.parseFrom(data);
      }

      public static C2S_PalaceTitle_18441 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PalaceTitle_18441)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PalaceTitle_18441 parseFrom(InputStream input) throws IOException {
         return (C2S_PalaceTitle_18441)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PalaceTitle_18441 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PalaceTitle_18441)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PalaceTitle_18441 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PalaceTitle_18441)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PalaceTitle_18441 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PalaceTitle_18441)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PalaceTitle_18441 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PalaceTitle_18441)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PalaceTitle_18441 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PalaceTitle_18441)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PalaceTitle_18441 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PalaceTitle_18441 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PalaceTitle_18441> parser() {
         return PARSER;
      }

      public Parser<C2S_PalaceTitle_18441> getParserForType() {
         return PARSER;
      }

      public C2S_PalaceTitle_18441 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PalaceTitle_18441OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_PalaceTitle_18441_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_PalaceTitle_18441_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PalaceTitle_18441.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.C2S_PalaceTitle_18441.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_PalaceTitle_18441_descriptor;
         }

         public C2S_PalaceTitle_18441 getDefaultInstanceForType() {
            return HeroPalaceMsg.C2S_PalaceTitle_18441.getDefaultInstance();
         }

         public C2S_PalaceTitle_18441 build() {
            C2S_PalaceTitle_18441 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PalaceTitle_18441 buildPartial() {
            C2S_PalaceTitle_18441 result = new C2S_PalaceTitle_18441(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_PalaceTitle_18441) {
               return this.mergeFrom((C2S_PalaceTitle_18441)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PalaceTitle_18441 other) {
            if (other == HeroPalaceMsg.C2S_PalaceTitle_18441.getDefaultInstance()) {
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
            C2S_PalaceTitle_18441 parsedMessage = null;

            try {
               parsedMessage = (C2S_PalaceTitle_18441)HeroPalaceMsg.C2S_PalaceTitle_18441.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PalaceTitle_18441)e.getUnfinishedMessage();
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

   public static final class S2C_PalaceTitle_18442 extends GeneratedMessageV3 implements S2C_PalaceTitle_18442OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_PalaceTitle_18442 DEFAULT_INSTANCE = new S2C_PalaceTitle_18442();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PalaceTitle_18442> PARSER = new AbstractParser<S2C_PalaceTitle_18442>() {
         public S2C_PalaceTitle_18442 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PalaceTitle_18442(input, extensionRegistry);
         }
      };

      private S2C_PalaceTitle_18442(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PalaceTitle_18442() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PalaceTitle_18442();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PalaceTitle_18442(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_PalaceTitle_18442_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_PalaceTitle_18442_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PalaceTitle_18442.class, Builder.class);
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
         } else if (!(obj instanceof S2C_PalaceTitle_18442)) {
            return super.equals(obj);
         } else {
            S2C_PalaceTitle_18442 other = (S2C_PalaceTitle_18442)obj;
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

      public static S2C_PalaceTitle_18442 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PalaceTitle_18442)PARSER.parseFrom(data);
      }

      public static S2C_PalaceTitle_18442 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PalaceTitle_18442)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PalaceTitle_18442 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PalaceTitle_18442)PARSER.parseFrom(data);
      }

      public static S2C_PalaceTitle_18442 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PalaceTitle_18442)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PalaceTitle_18442 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PalaceTitle_18442)PARSER.parseFrom(data);
      }

      public static S2C_PalaceTitle_18442 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PalaceTitle_18442)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PalaceTitle_18442 parseFrom(InputStream input) throws IOException {
         return (S2C_PalaceTitle_18442)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PalaceTitle_18442 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PalaceTitle_18442)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PalaceTitle_18442 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PalaceTitle_18442)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PalaceTitle_18442 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PalaceTitle_18442)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PalaceTitle_18442 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PalaceTitle_18442)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PalaceTitle_18442 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PalaceTitle_18442)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PalaceTitle_18442 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PalaceTitle_18442 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PalaceTitle_18442> parser() {
         return PARSER;
      }

      public Parser<S2C_PalaceTitle_18442> getParserForType() {
         return PARSER;
      }

      public S2C_PalaceTitle_18442 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PalaceTitle_18442OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_PalaceTitle_18442_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_PalaceTitle_18442_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PalaceTitle_18442.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.S2C_PalaceTitle_18442.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_PalaceTitle_18442_descriptor;
         }

         public S2C_PalaceTitle_18442 getDefaultInstanceForType() {
            return HeroPalaceMsg.S2C_PalaceTitle_18442.getDefaultInstance();
         }

         public S2C_PalaceTitle_18442 build() {
            S2C_PalaceTitle_18442 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PalaceTitle_18442 buildPartial() {
            S2C_PalaceTitle_18442 result = new S2C_PalaceTitle_18442(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_PalaceTitle_18442) {
               return this.mergeFrom((S2C_PalaceTitle_18442)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PalaceTitle_18442 other) {
            if (other == HeroPalaceMsg.S2C_PalaceTitle_18442.getDefaultInstance()) {
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
            S2C_PalaceTitle_18442 parsedMessage = null;

            try {
               parsedMessage = (S2C_PalaceTitle_18442)HeroPalaceMsg.S2C_PalaceTitle_18442.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PalaceTitle_18442)e.getUnfinishedMessage();
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

   public static final class C2S_UpgradePalaceTitle_18443 extends GeneratedMessageV3 implements C2S_UpgradePalaceTitle_18443OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_UpgradePalaceTitle_18443 DEFAULT_INSTANCE = new C2S_UpgradePalaceTitle_18443();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UpgradePalaceTitle_18443> PARSER = new AbstractParser<C2S_UpgradePalaceTitle_18443>() {
         public C2S_UpgradePalaceTitle_18443 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UpgradePalaceTitle_18443(input, extensionRegistry);
         }
      };

      private C2S_UpgradePalaceTitle_18443(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UpgradePalaceTitle_18443() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UpgradePalaceTitle_18443();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UpgradePalaceTitle_18443(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradePalaceTitle_18443_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradePalaceTitle_18443_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UpgradePalaceTitle_18443.class, Builder.class);
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
         } else if (!(obj instanceof C2S_UpgradePalaceTitle_18443)) {
            return super.equals(obj);
         } else {
            C2S_UpgradePalaceTitle_18443 other = (C2S_UpgradePalaceTitle_18443)obj;
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

      public static C2S_UpgradePalaceTitle_18443 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UpgradePalaceTitle_18443)PARSER.parseFrom(data);
      }

      public static C2S_UpgradePalaceTitle_18443 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpgradePalaceTitle_18443)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpgradePalaceTitle_18443 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UpgradePalaceTitle_18443)PARSER.parseFrom(data);
      }

      public static C2S_UpgradePalaceTitle_18443 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpgradePalaceTitle_18443)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpgradePalaceTitle_18443 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UpgradePalaceTitle_18443)PARSER.parseFrom(data);
      }

      public static C2S_UpgradePalaceTitle_18443 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpgradePalaceTitle_18443)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpgradePalaceTitle_18443 parseFrom(InputStream input) throws IOException {
         return (C2S_UpgradePalaceTitle_18443)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UpgradePalaceTitle_18443 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpgradePalaceTitle_18443)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UpgradePalaceTitle_18443 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UpgradePalaceTitle_18443)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UpgradePalaceTitle_18443 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpgradePalaceTitle_18443)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UpgradePalaceTitle_18443 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UpgradePalaceTitle_18443)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UpgradePalaceTitle_18443 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpgradePalaceTitle_18443)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UpgradePalaceTitle_18443 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UpgradePalaceTitle_18443 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UpgradePalaceTitle_18443> parser() {
         return PARSER;
      }

      public Parser<C2S_UpgradePalaceTitle_18443> getParserForType() {
         return PARSER;
      }

      public C2S_UpgradePalaceTitle_18443 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UpgradePalaceTitle_18443OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradePalaceTitle_18443_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradePalaceTitle_18443_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UpgradePalaceTitle_18443.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.C2S_UpgradePalaceTitle_18443.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UpgradePalaceTitle_18443_descriptor;
         }

         public C2S_UpgradePalaceTitle_18443 getDefaultInstanceForType() {
            return HeroPalaceMsg.C2S_UpgradePalaceTitle_18443.getDefaultInstance();
         }

         public C2S_UpgradePalaceTitle_18443 build() {
            C2S_UpgradePalaceTitle_18443 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UpgradePalaceTitle_18443 buildPartial() {
            C2S_UpgradePalaceTitle_18443 result = new C2S_UpgradePalaceTitle_18443(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_UpgradePalaceTitle_18443) {
               return this.mergeFrom((C2S_UpgradePalaceTitle_18443)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UpgradePalaceTitle_18443 other) {
            if (other == HeroPalaceMsg.C2S_UpgradePalaceTitle_18443.getDefaultInstance()) {
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
            C2S_UpgradePalaceTitle_18443 parsedMessage = null;

            try {
               parsedMessage = (C2S_UpgradePalaceTitle_18443)HeroPalaceMsg.C2S_UpgradePalaceTitle_18443.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UpgradePalaceTitle_18443)e.getUnfinishedMessage();
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

   public static final class S2C_UpgradePalaceTitle_18444 extends GeneratedMessageV3 implements S2C_UpgradePalaceTitle_18444OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int TITLEID_FIELD_NUMBER = 2;
      private int titleId_;
      private byte memoizedIsInitialized;
      private static final S2C_UpgradePalaceTitle_18444 DEFAULT_INSTANCE = new S2C_UpgradePalaceTitle_18444();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpgradePalaceTitle_18444> PARSER = new AbstractParser<S2C_UpgradePalaceTitle_18444>() {
         public S2C_UpgradePalaceTitle_18444 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpgradePalaceTitle_18444(input, extensionRegistry);
         }
      };

      private S2C_UpgradePalaceTitle_18444(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpgradePalaceTitle_18444() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpgradePalaceTitle_18444();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpgradePalaceTitle_18444(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.titleId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradePalaceTitle_18444_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradePalaceTitle_18444_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpgradePalaceTitle_18444.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasTitleId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTitleId() {
         return this.titleId_;
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
         } else if (!this.hasTitleId()) {
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
            output.writeInt32(2, this.titleId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.titleId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpgradePalaceTitle_18444)) {
            return super.equals(obj);
         } else {
            S2C_UpgradePalaceTitle_18444 other = (S2C_UpgradePalaceTitle_18444)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasTitleId() != other.hasTitleId()) {
               return false;
            } else if (this.hasTitleId() && this.getTitleId() != other.getTitleId()) {
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

            if (this.hasTitleId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTitleId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpgradePalaceTitle_18444 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpgradePalaceTitle_18444)PARSER.parseFrom(data);
      }

      public static S2C_UpgradePalaceTitle_18444 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpgradePalaceTitle_18444)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpgradePalaceTitle_18444 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpgradePalaceTitle_18444)PARSER.parseFrom(data);
      }

      public static S2C_UpgradePalaceTitle_18444 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpgradePalaceTitle_18444)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpgradePalaceTitle_18444 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpgradePalaceTitle_18444)PARSER.parseFrom(data);
      }

      public static S2C_UpgradePalaceTitle_18444 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpgradePalaceTitle_18444)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpgradePalaceTitle_18444 parseFrom(InputStream input) throws IOException {
         return (S2C_UpgradePalaceTitle_18444)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpgradePalaceTitle_18444 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpgradePalaceTitle_18444)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpgradePalaceTitle_18444 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpgradePalaceTitle_18444)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpgradePalaceTitle_18444 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpgradePalaceTitle_18444)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpgradePalaceTitle_18444 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpgradePalaceTitle_18444)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpgradePalaceTitle_18444 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpgradePalaceTitle_18444)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpgradePalaceTitle_18444 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpgradePalaceTitle_18444 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpgradePalaceTitle_18444> parser() {
         return PARSER;
      }

      public Parser<S2C_UpgradePalaceTitle_18444> getParserForType() {
         return PARSER;
      }

      public S2C_UpgradePalaceTitle_18444 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpgradePalaceTitle_18444OrBuilder {
         private int bitField0_;
         private int result_;
         private int titleId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradePalaceTitle_18444_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradePalaceTitle_18444_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpgradePalaceTitle_18444.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.S2C_UpgradePalaceTitle_18444.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.titleId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UpgradePalaceTitle_18444_descriptor;
         }

         public S2C_UpgradePalaceTitle_18444 getDefaultInstanceForType() {
            return HeroPalaceMsg.S2C_UpgradePalaceTitle_18444.getDefaultInstance();
         }

         public S2C_UpgradePalaceTitle_18444 build() {
            S2C_UpgradePalaceTitle_18444 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpgradePalaceTitle_18444 buildPartial() {
            S2C_UpgradePalaceTitle_18444 result = new S2C_UpgradePalaceTitle_18444(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.titleId_ = this.titleId_;
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
            if (other instanceof S2C_UpgradePalaceTitle_18444) {
               return this.mergeFrom((S2C_UpgradePalaceTitle_18444)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpgradePalaceTitle_18444 other) {
            if (other == HeroPalaceMsg.S2C_UpgradePalaceTitle_18444.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasTitleId()) {
                  this.setTitleId(other.getTitleId());
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
               return this.hasTitleId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UpgradePalaceTitle_18444 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpgradePalaceTitle_18444)HeroPalaceMsg.S2C_UpgradePalaceTitle_18444.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpgradePalaceTitle_18444)e.getUnfinishedMessage();
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

         public boolean hasTitleId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTitleId() {
            return this.titleId_;
         }

         public Builder setTitleId(int value) {
            this.bitField0_ |= 2;
            this.titleId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTitleId() {
            this.bitField0_ &= -3;
            this.titleId_ = 0;
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

   public static final class C2S_UnlockPlaceHeroDress_18445 extends GeneratedMessageV3 implements C2S_UnlockPlaceHeroDress_18445OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HERODRESSID_FIELD_NUMBER = 1;
      private int heroDressId_;
      private byte memoizedIsInitialized;
      private static final C2S_UnlockPlaceHeroDress_18445 DEFAULT_INSTANCE = new C2S_UnlockPlaceHeroDress_18445();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UnlockPlaceHeroDress_18445> PARSER = new AbstractParser<C2S_UnlockPlaceHeroDress_18445>() {
         public C2S_UnlockPlaceHeroDress_18445 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UnlockPlaceHeroDress_18445(input, extensionRegistry);
         }
      };

      private C2S_UnlockPlaceHeroDress_18445(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UnlockPlaceHeroDress_18445() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UnlockPlaceHeroDress_18445();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UnlockPlaceHeroDress_18445(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroDressId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockPlaceHeroDress_18445_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockPlaceHeroDress_18445_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnlockPlaceHeroDress_18445.class, Builder.class);
      }

      public boolean hasHeroDressId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroDressId() {
         return this.heroDressId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroDressId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroDressId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroDressId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_UnlockPlaceHeroDress_18445)) {
            return super.equals(obj);
         } else {
            C2S_UnlockPlaceHeroDress_18445 other = (C2S_UnlockPlaceHeroDress_18445)obj;
            if (this.hasHeroDressId() != other.hasHeroDressId()) {
               return false;
            } else if (this.hasHeroDressId() && this.getHeroDressId() != other.getHeroDressId()) {
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
            if (this.hasHeroDressId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroDressId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_UnlockPlaceHeroDress_18445 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UnlockPlaceHeroDress_18445)PARSER.parseFrom(data);
      }

      public static C2S_UnlockPlaceHeroDress_18445 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnlockPlaceHeroDress_18445)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnlockPlaceHeroDress_18445 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UnlockPlaceHeroDress_18445)PARSER.parseFrom(data);
      }

      public static C2S_UnlockPlaceHeroDress_18445 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnlockPlaceHeroDress_18445)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnlockPlaceHeroDress_18445 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UnlockPlaceHeroDress_18445)PARSER.parseFrom(data);
      }

      public static C2S_UnlockPlaceHeroDress_18445 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UnlockPlaceHeroDress_18445)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UnlockPlaceHeroDress_18445 parseFrom(InputStream input) throws IOException {
         return (C2S_UnlockPlaceHeroDress_18445)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnlockPlaceHeroDress_18445 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnlockPlaceHeroDress_18445)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnlockPlaceHeroDress_18445 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UnlockPlaceHeroDress_18445)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UnlockPlaceHeroDress_18445 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnlockPlaceHeroDress_18445)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UnlockPlaceHeroDress_18445 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UnlockPlaceHeroDress_18445)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UnlockPlaceHeroDress_18445 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UnlockPlaceHeroDress_18445)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UnlockPlaceHeroDress_18445 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UnlockPlaceHeroDress_18445 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UnlockPlaceHeroDress_18445> parser() {
         return PARSER;
      }

      public Parser<C2S_UnlockPlaceHeroDress_18445> getParserForType() {
         return PARSER;
      }

      public C2S_UnlockPlaceHeroDress_18445 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UnlockPlaceHeroDress_18445OrBuilder {
         private int bitField0_;
         private int heroDressId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockPlaceHeroDress_18445_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockPlaceHeroDress_18445_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UnlockPlaceHeroDress_18445.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.C2S_UnlockPlaceHeroDress_18445.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroDressId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_UnlockPlaceHeroDress_18445_descriptor;
         }

         public C2S_UnlockPlaceHeroDress_18445 getDefaultInstanceForType() {
            return HeroPalaceMsg.C2S_UnlockPlaceHeroDress_18445.getDefaultInstance();
         }

         public C2S_UnlockPlaceHeroDress_18445 build() {
            C2S_UnlockPlaceHeroDress_18445 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UnlockPlaceHeroDress_18445 buildPartial() {
            C2S_UnlockPlaceHeroDress_18445 result = new C2S_UnlockPlaceHeroDress_18445(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroDressId_ = this.heroDressId_;
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
            if (other instanceof C2S_UnlockPlaceHeroDress_18445) {
               return this.mergeFrom((C2S_UnlockPlaceHeroDress_18445)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UnlockPlaceHeroDress_18445 other) {
            if (other == HeroPalaceMsg.C2S_UnlockPlaceHeroDress_18445.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroDressId()) {
                  this.setHeroDressId(other.getHeroDressId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasHeroDressId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_UnlockPlaceHeroDress_18445 parsedMessage = null;

            try {
               parsedMessage = (C2S_UnlockPlaceHeroDress_18445)HeroPalaceMsg.C2S_UnlockPlaceHeroDress_18445.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UnlockPlaceHeroDress_18445)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroDressId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroDressId() {
            return this.heroDressId_;
         }

         public Builder setHeroDressId(int value) {
            this.bitField0_ |= 1;
            this.heroDressId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroDressId() {
            this.bitField0_ &= -2;
            this.heroDressId_ = 0;
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

   public static final class S2C_UnlockPlaceHeroDress_18446 extends GeneratedMessageV3 implements S2C_UnlockPlaceHeroDress_18446OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HERODRESSID_FIELD_NUMBER = 1;
      private int heroDressId_;
      private byte memoizedIsInitialized;
      private static final S2C_UnlockPlaceHeroDress_18446 DEFAULT_INSTANCE = new S2C_UnlockPlaceHeroDress_18446();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UnlockPlaceHeroDress_18446> PARSER = new AbstractParser<S2C_UnlockPlaceHeroDress_18446>() {
         public S2C_UnlockPlaceHeroDress_18446 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UnlockPlaceHeroDress_18446(input, extensionRegistry);
         }
      };

      private S2C_UnlockPlaceHeroDress_18446(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UnlockPlaceHeroDress_18446() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UnlockPlaceHeroDress_18446();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UnlockPlaceHeroDress_18446(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroDressId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockPlaceHeroDress_18446_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockPlaceHeroDress_18446_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnlockPlaceHeroDress_18446.class, Builder.class);
      }

      public boolean hasHeroDressId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroDressId() {
         return this.heroDressId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroDressId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroDressId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroDressId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UnlockPlaceHeroDress_18446)) {
            return super.equals(obj);
         } else {
            S2C_UnlockPlaceHeroDress_18446 other = (S2C_UnlockPlaceHeroDress_18446)obj;
            if (this.hasHeroDressId() != other.hasHeroDressId()) {
               return false;
            } else if (this.hasHeroDressId() && this.getHeroDressId() != other.getHeroDressId()) {
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
            if (this.hasHeroDressId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroDressId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UnlockPlaceHeroDress_18446 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UnlockPlaceHeroDress_18446)PARSER.parseFrom(data);
      }

      public static S2C_UnlockPlaceHeroDress_18446 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockPlaceHeroDress_18446)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockPlaceHeroDress_18446 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UnlockPlaceHeroDress_18446)PARSER.parseFrom(data);
      }

      public static S2C_UnlockPlaceHeroDress_18446 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockPlaceHeroDress_18446)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockPlaceHeroDress_18446 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UnlockPlaceHeroDress_18446)PARSER.parseFrom(data);
      }

      public static S2C_UnlockPlaceHeroDress_18446 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UnlockPlaceHeroDress_18446)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UnlockPlaceHeroDress_18446 parseFrom(InputStream input) throws IOException {
         return (S2C_UnlockPlaceHeroDress_18446)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnlockPlaceHeroDress_18446 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockPlaceHeroDress_18446)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnlockPlaceHeroDress_18446 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UnlockPlaceHeroDress_18446)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UnlockPlaceHeroDress_18446 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockPlaceHeroDress_18446)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UnlockPlaceHeroDress_18446 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UnlockPlaceHeroDress_18446)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UnlockPlaceHeroDress_18446 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UnlockPlaceHeroDress_18446)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UnlockPlaceHeroDress_18446 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UnlockPlaceHeroDress_18446 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UnlockPlaceHeroDress_18446> parser() {
         return PARSER;
      }

      public Parser<S2C_UnlockPlaceHeroDress_18446> getParserForType() {
         return PARSER;
      }

      public S2C_UnlockPlaceHeroDress_18446 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UnlockPlaceHeroDress_18446OrBuilder {
         private int bitField0_;
         private int heroDressId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockPlaceHeroDress_18446_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockPlaceHeroDress_18446_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UnlockPlaceHeroDress_18446.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.S2C_UnlockPlaceHeroDress_18446.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroDressId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_UnlockPlaceHeroDress_18446_descriptor;
         }

         public S2C_UnlockPlaceHeroDress_18446 getDefaultInstanceForType() {
            return HeroPalaceMsg.S2C_UnlockPlaceHeroDress_18446.getDefaultInstance();
         }

         public S2C_UnlockPlaceHeroDress_18446 build() {
            S2C_UnlockPlaceHeroDress_18446 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UnlockPlaceHeroDress_18446 buildPartial() {
            S2C_UnlockPlaceHeroDress_18446 result = new S2C_UnlockPlaceHeroDress_18446(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroDressId_ = this.heroDressId_;
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
            if (other instanceof S2C_UnlockPlaceHeroDress_18446) {
               return this.mergeFrom((S2C_UnlockPlaceHeroDress_18446)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UnlockPlaceHeroDress_18446 other) {
            if (other == HeroPalaceMsg.S2C_UnlockPlaceHeroDress_18446.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroDressId()) {
                  this.setHeroDressId(other.getHeroDressId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasHeroDressId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UnlockPlaceHeroDress_18446 parsedMessage = null;

            try {
               parsedMessage = (S2C_UnlockPlaceHeroDress_18446)HeroPalaceMsg.S2C_UnlockPlaceHeroDress_18446.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UnlockPlaceHeroDress_18446)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroDressId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroDressId() {
            return this.heroDressId_;
         }

         public Builder setHeroDressId(int value) {
            this.bitField0_ |= 1;
            this.heroDressId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroDressId() {
            this.bitField0_ &= -2;
            this.heroDressId_ = 0;
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

   public static final class SoulHeroDictionary extends GeneratedMessageV3 implements SoulHeroDictionaryOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROID_FIELD_NUMBER = 1;
      private int heroId_;
      public static final int LEVEL_FIELD_NUMBER = 2;
      private int level_;
      public static final int MAXSTAR_FIELD_NUMBER = 3;
      private int maxStar_;
      private byte memoizedIsInitialized;
      private static final SoulHeroDictionary DEFAULT_INSTANCE = new SoulHeroDictionary();
      /** @deprecated */
      @Deprecated
      public static final Parser<SoulHeroDictionary> PARSER = new AbstractParser<SoulHeroDictionary>() {
         public SoulHeroDictionary parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new SoulHeroDictionary(input, extensionRegistry);
         }
      };

      private SoulHeroDictionary(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private SoulHeroDictionary() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new SoulHeroDictionary();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private SoulHeroDictionary(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.maxStar_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_SoulHeroDictionary_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_SoulHeroDictionary_fieldAccessorTable.ensureFieldAccessorsInitialized(SoulHeroDictionary.class, Builder.class);
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

      public boolean hasMaxStar() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getMaxStar() {
         return this.maxStar_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMaxStar()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(3, this.maxStar_);
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
               size += CodedOutputStream.computeInt32Size(3, this.maxStar_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof SoulHeroDictionary)) {
            return super.equals(obj);
         } else {
            SoulHeroDictionary other = (SoulHeroDictionary)obj;
            if (this.hasHeroId() != other.hasHeroId()) {
               return false;
            } else if (this.hasHeroId() && this.getHeroId() != other.getHeroId()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (this.hasMaxStar() != other.hasMaxStar()) {
               return false;
            } else if (this.hasMaxStar() && this.getMaxStar() != other.getMaxStar()) {
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

            if (this.hasMaxStar()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getMaxStar();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static SoulHeroDictionary parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (SoulHeroDictionary)PARSER.parseFrom(data);
      }

      public static SoulHeroDictionary parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SoulHeroDictionary)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SoulHeroDictionary parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (SoulHeroDictionary)PARSER.parseFrom(data);
      }

      public static SoulHeroDictionary parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SoulHeroDictionary)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SoulHeroDictionary parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (SoulHeroDictionary)PARSER.parseFrom(data);
      }

      public static SoulHeroDictionary parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (SoulHeroDictionary)PARSER.parseFrom(data, extensionRegistry);
      }

      public static SoulHeroDictionary parseFrom(InputStream input) throws IOException {
         return (SoulHeroDictionary)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SoulHeroDictionary parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SoulHeroDictionary)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static SoulHeroDictionary parseDelimitedFrom(InputStream input) throws IOException {
         return (SoulHeroDictionary)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static SoulHeroDictionary parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SoulHeroDictionary)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static SoulHeroDictionary parseFrom(CodedInputStream input) throws IOException {
         return (SoulHeroDictionary)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static SoulHeroDictionary parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (SoulHeroDictionary)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(SoulHeroDictionary prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static SoulHeroDictionary getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<SoulHeroDictionary> parser() {
         return PARSER;
      }

      public Parser<SoulHeroDictionary> getParserForType() {
         return PARSER;
      }

      public SoulHeroDictionary getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SoulHeroDictionaryOrBuilder {
         private int bitField0_;
         private int heroId_;
         private int level_;
         private int maxStar_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_SoulHeroDictionary_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_SoulHeroDictionary_fieldAccessorTable.ensureFieldAccessorsInitialized(SoulHeroDictionary.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.SoulHeroDictionary.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroId_ = 0;
            this.bitField0_ &= -2;
            this.level_ = 0;
            this.bitField0_ &= -3;
            this.maxStar_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_SoulHeroDictionary_descriptor;
         }

         public SoulHeroDictionary getDefaultInstanceForType() {
            return HeroPalaceMsg.SoulHeroDictionary.getDefaultInstance();
         }

         public SoulHeroDictionary build() {
            SoulHeroDictionary result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public SoulHeroDictionary buildPartial() {
            SoulHeroDictionary result = new SoulHeroDictionary(this);
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
               result.maxStar_ = this.maxStar_;
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
            if (other instanceof SoulHeroDictionary) {
               return this.mergeFrom((SoulHeroDictionary)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(SoulHeroDictionary other) {
            if (other == HeroPalaceMsg.SoulHeroDictionary.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroId()) {
                  this.setHeroId(other.getHeroId());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (other.hasMaxStar()) {
                  this.setMaxStar(other.getMaxStar());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroId()) {
               return false;
            } else if (!this.hasLevel()) {
               return false;
            } else {
               return this.hasMaxStar();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            SoulHeroDictionary parsedMessage = null;

            try {
               parsedMessage = (SoulHeroDictionary)HeroPalaceMsg.SoulHeroDictionary.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (SoulHeroDictionary)e.getUnfinishedMessage();
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

         public boolean hasMaxStar() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getMaxStar() {
            return this.maxStar_;
         }

         public Builder setMaxStar(int value) {
            this.bitField0_ |= 4;
            this.maxStar_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMaxStar() {
            this.bitField0_ &= -5;
            this.maxStar_ = 0;
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

   public static final class C2S_SoulPalace_18451 extends GeneratedMessageV3 implements C2S_SoulPalace_18451OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_SoulPalace_18451 DEFAULT_INSTANCE = new C2S_SoulPalace_18451();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SoulPalace_18451> PARSER = new AbstractParser<C2S_SoulPalace_18451>() {
         public C2S_SoulPalace_18451 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SoulPalace_18451(input, extensionRegistry);
         }
      };

      private C2S_SoulPalace_18451(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SoulPalace_18451() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SoulPalace_18451();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SoulPalace_18451(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_SoulPalace_18451_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_SoulPalace_18451_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SoulPalace_18451.class, Builder.class);
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
         } else if (!(obj instanceof C2S_SoulPalace_18451)) {
            return super.equals(obj);
         } else {
            C2S_SoulPalace_18451 other = (C2S_SoulPalace_18451)obj;
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

      public static C2S_SoulPalace_18451 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SoulPalace_18451)PARSER.parseFrom(data);
      }

      public static C2S_SoulPalace_18451 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SoulPalace_18451)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SoulPalace_18451 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SoulPalace_18451)PARSER.parseFrom(data);
      }

      public static C2S_SoulPalace_18451 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SoulPalace_18451)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SoulPalace_18451 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SoulPalace_18451)PARSER.parseFrom(data);
      }

      public static C2S_SoulPalace_18451 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SoulPalace_18451)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SoulPalace_18451 parseFrom(InputStream input) throws IOException {
         return (C2S_SoulPalace_18451)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SoulPalace_18451 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SoulPalace_18451)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SoulPalace_18451 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SoulPalace_18451)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SoulPalace_18451 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SoulPalace_18451)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SoulPalace_18451 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SoulPalace_18451)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SoulPalace_18451 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SoulPalace_18451)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SoulPalace_18451 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SoulPalace_18451 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SoulPalace_18451> parser() {
         return PARSER;
      }

      public Parser<C2S_SoulPalace_18451> getParserForType() {
         return PARSER;
      }

      public C2S_SoulPalace_18451 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SoulPalace_18451OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_SoulPalace_18451_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_SoulPalace_18451_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SoulPalace_18451.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.C2S_SoulPalace_18451.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_SoulPalace_18451_descriptor;
         }

         public C2S_SoulPalace_18451 getDefaultInstanceForType() {
            return HeroPalaceMsg.C2S_SoulPalace_18451.getDefaultInstance();
         }

         public C2S_SoulPalace_18451 build() {
            C2S_SoulPalace_18451 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SoulPalace_18451 buildPartial() {
            C2S_SoulPalace_18451 result = new C2S_SoulPalace_18451(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_SoulPalace_18451) {
               return this.mergeFrom((C2S_SoulPalace_18451)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SoulPalace_18451 other) {
            if (other == HeroPalaceMsg.C2S_SoulPalace_18451.getDefaultInstance()) {
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
            C2S_SoulPalace_18451 parsedMessage = null;

            try {
               parsedMessage = (C2S_SoulPalace_18451)HeroPalaceMsg.C2S_SoulPalace_18451.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SoulPalace_18451)e.getUnfinishedMessage();
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

   public static final class S2C_SoulPalace_18452 extends GeneratedMessageV3 implements S2C_SoulPalace_18452OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int DICTIONARY_FIELD_NUMBER = 1;
      private List<SoulHeroDictionary> dictionary_;
      private byte memoizedIsInitialized;
      private static final S2C_SoulPalace_18452 DEFAULT_INSTANCE = new S2C_SoulPalace_18452();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SoulPalace_18452> PARSER = new AbstractParser<S2C_SoulPalace_18452>() {
         public S2C_SoulPalace_18452 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SoulPalace_18452(input, extensionRegistry);
         }
      };

      private S2C_SoulPalace_18452(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SoulPalace_18452() {
         this.memoizedIsInitialized = -1;
         this.dictionary_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SoulPalace_18452();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SoulPalace_18452(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.dictionary_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.dictionary_.add(input.readMessage(HeroPalaceMsg.SoulHeroDictionary.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.dictionary_ = Collections.unmodifiableList(this.dictionary_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_SoulPalace_18452_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_SoulPalace_18452_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SoulPalace_18452.class, Builder.class);
      }

      public List<SoulHeroDictionary> getDictionaryList() {
         return this.dictionary_;
      }

      public List<? extends SoulHeroDictionaryOrBuilder> getDictionaryOrBuilderList() {
         return this.dictionary_;
      }

      public int getDictionaryCount() {
         return this.dictionary_.size();
      }

      public SoulHeroDictionary getDictionary(int index) {
         return (SoulHeroDictionary)this.dictionary_.get(index);
      }

      public SoulHeroDictionaryOrBuilder getDictionaryOrBuilder(int index) {
         return (SoulHeroDictionaryOrBuilder)this.dictionary_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getDictionaryCount(); ++i) {
               if (!this.getDictionary(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.dictionary_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.dictionary_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.dictionary_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.dictionary_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SoulPalace_18452)) {
            return super.equals(obj);
         } else {
            S2C_SoulPalace_18452 other = (S2C_SoulPalace_18452)obj;
            if (!this.getDictionaryList().equals(other.getDictionaryList())) {
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
            if (this.getDictionaryCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getDictionaryList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SoulPalace_18452 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SoulPalace_18452)PARSER.parseFrom(data);
      }

      public static S2C_SoulPalace_18452 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SoulPalace_18452)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SoulPalace_18452 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SoulPalace_18452)PARSER.parseFrom(data);
      }

      public static S2C_SoulPalace_18452 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SoulPalace_18452)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SoulPalace_18452 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SoulPalace_18452)PARSER.parseFrom(data);
      }

      public static S2C_SoulPalace_18452 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SoulPalace_18452)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SoulPalace_18452 parseFrom(InputStream input) throws IOException {
         return (S2C_SoulPalace_18452)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SoulPalace_18452 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SoulPalace_18452)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SoulPalace_18452 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SoulPalace_18452)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SoulPalace_18452 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SoulPalace_18452)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SoulPalace_18452 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SoulPalace_18452)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SoulPalace_18452 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SoulPalace_18452)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SoulPalace_18452 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SoulPalace_18452 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SoulPalace_18452> parser() {
         return PARSER;
      }

      public Parser<S2C_SoulPalace_18452> getParserForType() {
         return PARSER;
      }

      public S2C_SoulPalace_18452 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SoulPalace_18452OrBuilder {
         private int bitField0_;
         private List<SoulHeroDictionary> dictionary_;
         private RepeatedFieldBuilderV3<SoulHeroDictionary, SoulHeroDictionary.Builder, SoulHeroDictionaryOrBuilder> dictionaryBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_SoulPalace_18452_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_SoulPalace_18452_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SoulPalace_18452.class, Builder.class);
         }

         private Builder() {
            this.dictionary_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.dictionary_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.S2C_SoulPalace_18452.alwaysUseFieldBuilders) {
               this.getDictionaryFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.dictionaryBuilder_ == null) {
               this.dictionary_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.dictionaryBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_SoulPalace_18452_descriptor;
         }

         public S2C_SoulPalace_18452 getDefaultInstanceForType() {
            return HeroPalaceMsg.S2C_SoulPalace_18452.getDefaultInstance();
         }

         public S2C_SoulPalace_18452 build() {
            S2C_SoulPalace_18452 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SoulPalace_18452 buildPartial() {
            S2C_SoulPalace_18452 result = new S2C_SoulPalace_18452(this);
            int from_bitField0_ = this.bitField0_;
            if (this.dictionaryBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.dictionary_ = Collections.unmodifiableList(this.dictionary_);
                  this.bitField0_ &= -2;
               }

               result.dictionary_ = this.dictionary_;
            } else {
               result.dictionary_ = this.dictionaryBuilder_.build();
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
            if (other instanceof S2C_SoulPalace_18452) {
               return this.mergeFrom((S2C_SoulPalace_18452)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SoulPalace_18452 other) {
            if (other == HeroPalaceMsg.S2C_SoulPalace_18452.getDefaultInstance()) {
               return this;
            } else {
               if (this.dictionaryBuilder_ == null) {
                  if (!other.dictionary_.isEmpty()) {
                     if (this.dictionary_.isEmpty()) {
                        this.dictionary_ = other.dictionary_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureDictionaryIsMutable();
                        this.dictionary_.addAll(other.dictionary_);
                     }

                     this.onChanged();
                  }
               } else if (!other.dictionary_.isEmpty()) {
                  if (this.dictionaryBuilder_.isEmpty()) {
                     this.dictionaryBuilder_.dispose();
                     this.dictionaryBuilder_ = null;
                     this.dictionary_ = other.dictionary_;
                     this.bitField0_ &= -2;
                     this.dictionaryBuilder_ = HeroPalaceMsg.S2C_SoulPalace_18452.alwaysUseFieldBuilders ? this.getDictionaryFieldBuilder() : null;
                  } else {
                     this.dictionaryBuilder_.addAllMessages(other.dictionary_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getDictionaryCount(); ++i) {
               if (!this.getDictionary(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SoulPalace_18452 parsedMessage = null;

            try {
               parsedMessage = (S2C_SoulPalace_18452)HeroPalaceMsg.S2C_SoulPalace_18452.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SoulPalace_18452)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureDictionaryIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.dictionary_ = new ArrayList(this.dictionary_);
               this.bitField0_ |= 1;
            }

         }

         public List<SoulHeroDictionary> getDictionaryList() {
            return this.dictionaryBuilder_ == null ? Collections.unmodifiableList(this.dictionary_) : this.dictionaryBuilder_.getMessageList();
         }

         public int getDictionaryCount() {
            return this.dictionaryBuilder_ == null ? this.dictionary_.size() : this.dictionaryBuilder_.getCount();
         }

         public SoulHeroDictionary getDictionary(int index) {
            return this.dictionaryBuilder_ == null ? (SoulHeroDictionary)this.dictionary_.get(index) : (SoulHeroDictionary)this.dictionaryBuilder_.getMessage(index);
         }

         public Builder setDictionary(int index, SoulHeroDictionary value) {
            if (this.dictionaryBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDictionaryIsMutable();
               this.dictionary_.set(index, value);
               this.onChanged();
            } else {
               this.dictionaryBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setDictionary(int index, SoulHeroDictionary.Builder builderForValue) {
            if (this.dictionaryBuilder_ == null) {
               this.ensureDictionaryIsMutable();
               this.dictionary_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dictionaryBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addDictionary(SoulHeroDictionary value) {
            if (this.dictionaryBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDictionaryIsMutable();
               this.dictionary_.add(value);
               this.onChanged();
            } else {
               this.dictionaryBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addDictionary(int index, SoulHeroDictionary value) {
            if (this.dictionaryBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureDictionaryIsMutable();
               this.dictionary_.add(index, value);
               this.onChanged();
            } else {
               this.dictionaryBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addDictionary(SoulHeroDictionary.Builder builderForValue) {
            if (this.dictionaryBuilder_ == null) {
               this.ensureDictionaryIsMutable();
               this.dictionary_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.dictionaryBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addDictionary(int index, SoulHeroDictionary.Builder builderForValue) {
            if (this.dictionaryBuilder_ == null) {
               this.ensureDictionaryIsMutable();
               this.dictionary_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.dictionaryBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllDictionary(Iterable<? extends SoulHeroDictionary> values) {
            if (this.dictionaryBuilder_ == null) {
               this.ensureDictionaryIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.dictionary_);
               this.onChanged();
            } else {
               this.dictionaryBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearDictionary() {
            if (this.dictionaryBuilder_ == null) {
               this.dictionary_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.dictionaryBuilder_.clear();
            }

            return this;
         }

         public Builder removeDictionary(int index) {
            if (this.dictionaryBuilder_ == null) {
               this.ensureDictionaryIsMutable();
               this.dictionary_.remove(index);
               this.onChanged();
            } else {
               this.dictionaryBuilder_.remove(index);
            }

            return this;
         }

         public SoulHeroDictionary.Builder getDictionaryBuilder(int index) {
            return (SoulHeroDictionary.Builder)this.getDictionaryFieldBuilder().getBuilder(index);
         }

         public SoulHeroDictionaryOrBuilder getDictionaryOrBuilder(int index) {
            return this.dictionaryBuilder_ == null ? (SoulHeroDictionaryOrBuilder)this.dictionary_.get(index) : (SoulHeroDictionaryOrBuilder)this.dictionaryBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends SoulHeroDictionaryOrBuilder> getDictionaryOrBuilderList() {
            return this.dictionaryBuilder_ != null ? this.dictionaryBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.dictionary_);
         }

         public SoulHeroDictionary.Builder addDictionaryBuilder() {
            return (SoulHeroDictionary.Builder)this.getDictionaryFieldBuilder().addBuilder(HeroPalaceMsg.SoulHeroDictionary.getDefaultInstance());
         }

         public SoulHeroDictionary.Builder addDictionaryBuilder(int index) {
            return (SoulHeroDictionary.Builder)this.getDictionaryFieldBuilder().addBuilder(index, HeroPalaceMsg.SoulHeroDictionary.getDefaultInstance());
         }

         public List<SoulHeroDictionary.Builder> getDictionaryBuilderList() {
            return this.getDictionaryFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<SoulHeroDictionary, SoulHeroDictionary.Builder, SoulHeroDictionaryOrBuilder> getDictionaryFieldBuilder() {
            if (this.dictionaryBuilder_ == null) {
               this.dictionaryBuilder_ = new RepeatedFieldBuilderV3(this.dictionary_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.dictionary_ = null;
            }

            return this.dictionaryBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_SoulPalaceActive_18453 extends GeneratedMessageV3 implements C2S_SoulPalaceActive_18453OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROID_FIELD_NUMBER = 1;
      private int heroId_;
      public static final int LEVEL_FIELD_NUMBER = 2;
      private int level_;
      private byte memoizedIsInitialized;
      private static final C2S_SoulPalaceActive_18453 DEFAULT_INSTANCE = new C2S_SoulPalaceActive_18453();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SoulPalaceActive_18453> PARSER = new AbstractParser<C2S_SoulPalaceActive_18453>() {
         public C2S_SoulPalaceActive_18453 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SoulPalaceActive_18453(input, extensionRegistry);
         }
      };

      private C2S_SoulPalaceActive_18453(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SoulPalaceActive_18453() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SoulPalaceActive_18453();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SoulPalaceActive_18453(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_SoulPalaceActive_18453_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_SoulPalaceActive_18453_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SoulPalaceActive_18453.class, Builder.class);
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

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_SoulPalaceActive_18453)) {
            return super.equals(obj);
         } else {
            C2S_SoulPalaceActive_18453 other = (C2S_SoulPalaceActive_18453)obj;
            if (this.hasHeroId() != other.hasHeroId()) {
               return false;
            } else if (this.hasHeroId() && this.getHeroId() != other.getHeroId()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_SoulPalaceActive_18453 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SoulPalaceActive_18453)PARSER.parseFrom(data);
      }

      public static C2S_SoulPalaceActive_18453 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SoulPalaceActive_18453)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SoulPalaceActive_18453 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SoulPalaceActive_18453)PARSER.parseFrom(data);
      }

      public static C2S_SoulPalaceActive_18453 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SoulPalaceActive_18453)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SoulPalaceActive_18453 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SoulPalaceActive_18453)PARSER.parseFrom(data);
      }

      public static C2S_SoulPalaceActive_18453 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SoulPalaceActive_18453)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SoulPalaceActive_18453 parseFrom(InputStream input) throws IOException {
         return (C2S_SoulPalaceActive_18453)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SoulPalaceActive_18453 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SoulPalaceActive_18453)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SoulPalaceActive_18453 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SoulPalaceActive_18453)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SoulPalaceActive_18453 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SoulPalaceActive_18453)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SoulPalaceActive_18453 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SoulPalaceActive_18453)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SoulPalaceActive_18453 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SoulPalaceActive_18453)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SoulPalaceActive_18453 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SoulPalaceActive_18453 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SoulPalaceActive_18453> parser() {
         return PARSER;
      }

      public Parser<C2S_SoulPalaceActive_18453> getParserForType() {
         return PARSER;
      }

      public C2S_SoulPalaceActive_18453 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SoulPalaceActive_18453OrBuilder {
         private int bitField0_;
         private int heroId_;
         private int level_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_SoulPalaceActive_18453_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_SoulPalaceActive_18453_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SoulPalaceActive_18453.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.C2S_SoulPalaceActive_18453.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroId_ = 0;
            this.bitField0_ &= -2;
            this.level_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_C2S_SoulPalaceActive_18453_descriptor;
         }

         public C2S_SoulPalaceActive_18453 getDefaultInstanceForType() {
            return HeroPalaceMsg.C2S_SoulPalaceActive_18453.getDefaultInstance();
         }

         public C2S_SoulPalaceActive_18453 build() {
            C2S_SoulPalaceActive_18453 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SoulPalaceActive_18453 buildPartial() {
            C2S_SoulPalaceActive_18453 result = new C2S_SoulPalaceActive_18453(this);
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
            if (other instanceof C2S_SoulPalaceActive_18453) {
               return this.mergeFrom((C2S_SoulPalaceActive_18453)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SoulPalaceActive_18453 other) {
            if (other == HeroPalaceMsg.C2S_SoulPalaceActive_18453.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroId()) {
                  this.setHeroId(other.getHeroId());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroId()) {
               return false;
            } else {
               return this.hasLevel();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_SoulPalaceActive_18453 parsedMessage = null;

            try {
               parsedMessage = (C2S_SoulPalaceActive_18453)HeroPalaceMsg.C2S_SoulPalaceActive_18453.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SoulPalaceActive_18453)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_SoulPalaceActive_18454 extends GeneratedMessageV3 implements S2C_SoulPalaceActive_18454OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROID_FIELD_NUMBER = 1;
      private int heroId_;
      public static final int LEVEL_FIELD_NUMBER = 2;
      private int level_;
      private byte memoizedIsInitialized;
      private static final S2C_SoulPalaceActive_18454 DEFAULT_INSTANCE = new S2C_SoulPalaceActive_18454();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SoulPalaceActive_18454> PARSER = new AbstractParser<S2C_SoulPalaceActive_18454>() {
         public S2C_SoulPalaceActive_18454 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SoulPalaceActive_18454(input, extensionRegistry);
         }
      };

      private S2C_SoulPalaceActive_18454(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SoulPalaceActive_18454() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SoulPalaceActive_18454();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SoulPalaceActive_18454(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_SoulPalaceActive_18454_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_SoulPalaceActive_18454_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SoulPalaceActive_18454.class, Builder.class);
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

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SoulPalaceActive_18454)) {
            return super.equals(obj);
         } else {
            S2C_SoulPalaceActive_18454 other = (S2C_SoulPalaceActive_18454)obj;
            if (this.hasHeroId() != other.hasHeroId()) {
               return false;
            } else if (this.hasHeroId() && this.getHeroId() != other.getHeroId()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SoulPalaceActive_18454 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SoulPalaceActive_18454)PARSER.parseFrom(data);
      }

      public static S2C_SoulPalaceActive_18454 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SoulPalaceActive_18454)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SoulPalaceActive_18454 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SoulPalaceActive_18454)PARSER.parseFrom(data);
      }

      public static S2C_SoulPalaceActive_18454 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SoulPalaceActive_18454)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SoulPalaceActive_18454 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SoulPalaceActive_18454)PARSER.parseFrom(data);
      }

      public static S2C_SoulPalaceActive_18454 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SoulPalaceActive_18454)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SoulPalaceActive_18454 parseFrom(InputStream input) throws IOException {
         return (S2C_SoulPalaceActive_18454)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SoulPalaceActive_18454 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SoulPalaceActive_18454)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SoulPalaceActive_18454 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SoulPalaceActive_18454)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SoulPalaceActive_18454 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SoulPalaceActive_18454)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SoulPalaceActive_18454 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SoulPalaceActive_18454)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SoulPalaceActive_18454 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SoulPalaceActive_18454)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SoulPalaceActive_18454 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SoulPalaceActive_18454 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SoulPalaceActive_18454> parser() {
         return PARSER;
      }

      public Parser<S2C_SoulPalaceActive_18454> getParserForType() {
         return PARSER;
      }

      public S2C_SoulPalaceActive_18454 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SoulPalaceActive_18454OrBuilder {
         private int bitField0_;
         private int heroId_;
         private int level_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_SoulPalaceActive_18454_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_SoulPalaceActive_18454_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SoulPalaceActive_18454.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroPalaceMsg.S2C_SoulPalaceActive_18454.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroId_ = 0;
            this.bitField0_ &= -2;
            this.level_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroPalaceMsg.internal_static_heroPalace_com_gzbz_protobuf_S2C_SoulPalaceActive_18454_descriptor;
         }

         public S2C_SoulPalaceActive_18454 getDefaultInstanceForType() {
            return HeroPalaceMsg.S2C_SoulPalaceActive_18454.getDefaultInstance();
         }

         public S2C_SoulPalaceActive_18454 build() {
            S2C_SoulPalaceActive_18454 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SoulPalaceActive_18454 buildPartial() {
            S2C_SoulPalaceActive_18454 result = new S2C_SoulPalaceActive_18454(this);
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
            if (other instanceof S2C_SoulPalaceActive_18454) {
               return this.mergeFrom((S2C_SoulPalaceActive_18454)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SoulPalaceActive_18454 other) {
            if (other == HeroPalaceMsg.S2C_SoulPalaceActive_18454.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroId()) {
                  this.setHeroId(other.getHeroId());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroId()) {
               return false;
            } else {
               return this.hasLevel();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SoulPalaceActive_18454 parsedMessage = null;

            try {
               parsedMessage = (S2C_SoulPalaceActive_18454)HeroPalaceMsg.S2C_SoulPalaceActive_18454.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SoulPalaceActive_18454)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_LearnDestinySkill_18425OrBuilder extends MessageOrBuilder {
      List<Integer> getSkillsList();

      int getSkillsCount();

      int getSkills(int index);
   }

   public interface C2S_LearnHeroSkill_18411OrBuilder extends MessageOrBuilder {
      List<Integer> getSkillsList();

      int getSkillsCount();

      int getSkills(int index);
   }

   public interface C2S_NoticePlay_18407OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_NoticeUi_18403OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OpenHeroSkillUi_18431OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OpenMainUi_18401OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_PalaceTitle_18441OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ResetHeroSkill_18437OrBuilder extends MessageOrBuilder {
      boolean hasSkillId();

      int getSkillId();
   }

   public interface C2S_ShareHeroPreview_18409OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface C2S_ShareHero_18405OrBuilder extends MessageOrBuilder {
      boolean hasType();

      ShareType getType();

      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface C2S_SoulPalaceActive_18453OrBuilder extends MessageOrBuilder {
      boolean hasHeroId();

      int getHeroId();

      boolean hasLevel();

      int getLevel();
   }

   public interface C2S_SoulPalace_18451OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_UnlockDestinySkill_18421OrBuilder extends MessageOrBuilder {
      boolean hasSkillId();

      int getSkillId();
   }

   public interface C2S_UnlockHeroSkill_18433OrBuilder extends MessageOrBuilder {
      boolean hasSkillId();

      int getSkillId();

      List<Integer> getHeroCodesList();

      int getHeroCodesCount();

      int getHeroCodes(int index);
   }

   public interface C2S_UnlockKingSkill_18413OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      List<Integer> getHeroCodesList();

      int getHeroCodesCount();

      int getHeroCodes(int index);
   }

   public interface C2S_UnlockPlaceHeroDress_18445OrBuilder extends MessageOrBuilder {
      boolean hasHeroDressId();

      int getHeroDressId();
   }

   public interface C2S_UpgradeDestinySkill_18423OrBuilder extends MessageOrBuilder {
      boolean hasSkillId();

      int getSkillId();
   }

   public interface C2S_UpgradeHeroSkill_18435OrBuilder extends MessageOrBuilder {
      boolean hasSkillId();

      int getSkillId();

      List<Integer> getHeroCodesList();

      int getHeroCodesCount();

      int getHeroCodes(int index);
   }

   public interface C2S_UpgradePalaceTitle_18443OrBuilder extends MessageOrBuilder {
   }

   public interface NoticeInfoOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasType();

      NoticeUnlockType getType();
   }

   public interface S2C_LearnDestinySkill_18426OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_LearnHeroSkill_18412OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_NoticePlay_18408OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_NoticeUi_18404OrBuilder extends MessageOrBuilder {
      List<NoticeInfo> getInfosList();

      NoticeInfo getInfos(int index);

      int getInfosCount();

      List<? extends NoticeInfoOrBuilder> getInfosOrBuilderList();

      NoticeInfoOrBuilder getInfosOrBuilder(int index);
   }

   public interface S2C_OpenHeroSkillUi_18432OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_OpenMainUi_18402OrBuilder extends MessageOrBuilder {
      boolean hasTitleLv();

      int getTitleLv();

      boolean hasHeroCode();

      int getHeroCode();

      boolean hasShareCode();

      int getShareCode();

      List<CommonMsg.MapDataII> getSkillsList();

      CommonMsg.MapDataII getSkills(int index);

      int getSkillsCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getSkillsOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getSkillsOrBuilder(int index);

      List<Integer> getHeroSkillDirList();

      int getHeroSkillDirCount();

      int getHeroSkillDir(int index);

      List<Integer> getDestinySkillDirList();

      int getDestinySkillDirCount();

      int getDestinySkillDir(int index);

      List<Integer> getKingSkillDirList();

      int getKingSkillDirCount();

      int getKingSkillDir(int index);

      List<CommonMsg.MapDataII> getDestinySkillsList();

      CommonMsg.MapDataII getDestinySkills(int index);

      int getDestinySkillsCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getDestinySkillsOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getDestinySkillsOrBuilder(int index);
   }

   public interface S2C_PalaceTitle_18442OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_ResetHeroSkill_18438OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasSkillId();

      int getSkillId();

      boolean hasNewSkillId();

      int getNewSkillId();

      List<Integer> getHeroSkillDirList();

      int getHeroSkillDirCount();

      int getHeroSkillDir(int index);
   }

   public interface S2C_ShareHeroPreview_18410OrBuilder extends MessageOrBuilder {
      boolean hasHeroInfo();

      CommonMsg.HeroInfo getHeroInfo();

      CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder();
   }

   public interface S2C_ShareHero_18406OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasType();

      ShareType getType();

      boolean hasHeroCode();

      int getHeroCode();

      List<CommonMsg.ItemInfo> getItemsList();

      CommonMsg.ItemInfo getItems(int index);

      int getItemsCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getItemsOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getItemsOrBuilder(int index);
   }

   public interface S2C_SoulPalaceActive_18454OrBuilder extends MessageOrBuilder {
      boolean hasHeroId();

      int getHeroId();

      boolean hasLevel();

      int getLevel();
   }

   public interface S2C_SoulPalace_18452OrBuilder extends MessageOrBuilder {
      List<SoulHeroDictionary> getDictionaryList();

      SoulHeroDictionary getDictionary(int index);

      int getDictionaryCount();

      List<? extends SoulHeroDictionaryOrBuilder> getDictionaryOrBuilderList();

      SoulHeroDictionaryOrBuilder getDictionaryOrBuilder(int index);
   }

   public interface S2C_UnlockDestinySkill_18422OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasSkillId();

      int getSkillId();

      List<Integer> getDestinySkillDirList();

      int getDestinySkillDirCount();

      int getDestinySkillDir(int index);
   }

   public interface S2C_UnlockHeroSkill_18434OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasSkillId();

      int getSkillId();

      List<Integer> getHeroSkillDirList();

      int getHeroSkillDirCount();

      int getHeroSkillDir(int index);
   }

   public interface S2C_UnlockKingSkill_18414OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasId();

      int getId();

      List<Integer> getKingSkillDirList();

      int getKingSkillDirCount();

      int getKingSkillDir(int index);
   }

   public interface S2C_UnlockPlaceHeroDress_18446OrBuilder extends MessageOrBuilder {
      boolean hasHeroDressId();

      int getHeroDressId();
   }

   public interface S2C_UpgradeDestinySkill_18424OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasSkillId();

      int getSkillId();

      List<Integer> getDestinySkillDirList();

      int getDestinySkillDirCount();

      int getDestinySkillDir(int index);
   }

   public interface S2C_UpgradeHeroSkill_18436OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasSkillId();

      int getSkillId();

      boolean hasNewSkillId();

      int getNewSkillId();

      List<Integer> getHeroSkillDirList();

      int getHeroSkillDirCount();

      int getHeroSkillDir(int index);
   }

   public interface S2C_UpgradePalaceTitle_18444OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasTitleId();

      int getTitleId();
   }

   public interface SoulHeroDictionaryOrBuilder extends MessageOrBuilder {
      boolean hasHeroId();

      int getHeroId();

      boolean hasLevel();

      int getLevel();

      boolean hasMaxStar();

      int getMaxStar();
   }
}
