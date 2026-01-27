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
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class HeroCardMsg {
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_HeroCardData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_HeroCardData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_HeroTypeAttr_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_HeroTypeAttr_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_C2S_HeroCardInfo_28601_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_C2S_HeroCardInfo_28601_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_S2C_HeroCardInfo_28602_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_S2C_HeroCardInfo_28602_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_C2S_HeroCardLottery_28603_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_C2S_HeroCardLottery_28603_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_S2C_HeroCardLottery_28604_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_S2C_HeroCardLottery_28604_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_C2S_PresentHeroCard_28605_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_C2S_PresentHeroCard_28605_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_S2C_PresentHeroCard_28606_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_S2C_PresentHeroCard_28606_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_C2S_DismissHeroCard_28607_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_C2S_DismissHeroCard_28607_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_S2C_DismissHeroCard_28608_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_S2C_DismissHeroCard_28608_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_C2S_BoxLvUp_28609_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_C2S_BoxLvUp_28609_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_S2C_BoxLvUp_28610_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_S2C_BoxLvUp_28610_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_C2S_CutTime_28611_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_C2S_CutTime_28611_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_S2C_CutTime_28612_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_S2C_CutTime_28612_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_OptionVal_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_OptionVal_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_C2S_Option_28613_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_C2S_Option_28613_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_S2C_Option_28614_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_S2C_Option_28614_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_C2S_OptionInfo_28615_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_C2S_OptionInfo_28615_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_S2C_OptionInfo_28616_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_S2C_OptionInfo_28616_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_S2C_NoticePresentCard_28617_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_S2C_NoticePresentCard_28617_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_C2S_StopAutoLottery_28618_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_C2S_StopAutoLottery_28618_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_S2C_StopAutoLottery_28619_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_S2C_StopAutoLottery_28619_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouEquipLottery_28620_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouEquipLottery_28620_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouEquipLottery_28621_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouEquipLottery_28621_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_EquipData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_EquipData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_EquipTypeAttr_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_EquipTypeAttr_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouResolveEquip_28622_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouResolveEquip_28622_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouResolveEquip_28623_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouResolveEquip_28623_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouLevelUp_28624_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouLevelUp_28624_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouLevelUp_28625_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouLevelUp_28625_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouStampLvUp_28626_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouStampLvUp_28626_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouStampLvUp_28627_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouStampLvUp_28627_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouInfo_28628_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouInfo_28628_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouInfo_28629_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouInfo_28629_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouWearEquip_28630_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouWearEquip_28630_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouWearEquip_28631_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouWearEquip_28631_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouEquipInfo_28632_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouEquipInfo_28632_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHoubuyItem_28633_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHoubuyItem_28633_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private HeroCardMsg() {
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
      String[] descriptorData = new String[]{"\n\u000eHeroCard.proto\u0012\u001aheroCard.com.gzbz.protobuf\u001a\fcommon.proto\"z\n\fHeroCardData\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nheroCardId\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bbreachLv\u0018\u0003 \u0002(\u0005\u00126\n\u0004attr\u0018\u0004 \u0003(\u000b2(.heroCard.com.gzbz.protobuf.HeroTypeAttr\"H\n\fHeroTypeAttr\u0012\u0010\n\bheroType\u0018\u0001 \u0001(\u0005\u0012\f\n\u0004type\u0018\u0002 \u0002(\u0005\u0012\u000b\n\u0003way\u0018\u0003 \u0002(\u0005\u0012\u000b\n\u0003val\u0018\u0004 \u0002(\u0005\"\u0018\n\u0016C2S_HeroCardInfo_28601\"ö\u0001\n\u0016S2C_HeroCardInfo_28602\u0012A\n\u000fpresentHeroCard\u0018\u0001 \u0003(\u000b2(.heroCard.com.gzbz.protobuf.HeroCardData\u0012A\n\u000fsurplusHeroCard\u0018\u0002 \u0003(\u000b2(.heroCard.com.gzbz.protobuf.HeroCardData\u0012\u0010\n\bcurBoxLv\u0018\u0003 \u0002(\u0005\u0012\u0015\n\rboxNextLvTime\u0018\u0004 \u0001(\u0003\u0012\u0017\n\u000fdailyLotteryNum\u0018\u0005 \u0002(\u0005\u0012\u0014\n\flotteryCount\u0018\u0006 \u0002(\u0003\"?\n\u0019C2S_HeroCardLottery_28603\u0012\u000b\n\u0003num\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rcurMainTaskId\u0018\u0002 \u0002(\u0005\"é\u0001\n\u0019S2C_HeroCardLottery_28604\u0012:\n\bheroCard\u0018\u0001 \u0003(\u000b2(.heroCard.com.gzbz.protobuf.HeroCardData\u0012=\n\u000bresolveCard\u0018\u0002 \u0003(\u000b2(.heroCard.com.gzbz.protobuf.HeroCardData\u0012\u0017\n\u000fdailyLotteryNum\u0018\u0003 \u0002(\u0005\u0012\u000e\n\u0006result\u0018\u0004 \u0002(\u0005\u0012\u0014\n\flotteryCount\u0018\u0005 \u0002(\u0003\u0012\u0012\n\nisBackAuto\u0018\u0006 \u0002(\b\"<\n\u0019C2S_PresentHeroCard_28605\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tisResolve\u0018\u0002 \u0002(\b\"Â\u0001\n\u0019S2C_PresentHeroCard_28606\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tisResolve\u0018\u0002 \u0002(\b\u0012A\n\u000fpresentHeroCard\u0018\u0003 \u0003(\u000b2(.heroCard.com.gzbz.protobuf.HeroCardData\u0012A\n\u000fsurplusHeroCard\u0018\u0004 \u0003(\u000b2(.heroCard.com.gzbz.protobuf.HeroCardData\"?\n\u0019C2S_DismissHeroCard_28607\u0012\u0014\n\fheroCardType\u0018\u0001 \u0001(\u0005\u0012\f\n\u0004code\u0018\u0002 \u0001(\u0005\"¸\u0001\n\u0019S2C_DismissHeroCard_28608\u0012A\n\u000fpresentHeroCard\u0018\u0001 \u0003(\u000b2(.heroCard.com.gzbz.protobuf.HeroCardData\u0012A\n\u000fsurplusHeroCard\u0018\u0002 \u0003(\u000b2(.heroCard.com.gzbz.protobuf.HeroCardData\u0012\u0015\n\rresolveCardId\u0018\u0003 \u0002(\u0005\"\u0013\n\u0011C2S_BoxLvUp_28609\"<\n\u0011S2C_BoxLvUp_28610\u0012\u0010\n\bcurBoxLv\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rboxNextLvTime\u0018\u0002 \u0001(\u0003\"3\n\u0011C2S_CutTime_28611\u0012\u001e\n\u0004cost\u0018\u0001 \u0003(\u000b2\u0010.common.ItemInfo\"<\n\u0011S2C_CutTime_28612\u0012\u0010\n\bcurBoxLv\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rboxNextLvTime\u0018\u0002 \u0001(\u0003\"P\n\tOptionVal\u00126\n\u0006option\u0018\u0001 \u0002(\u000e2&.heroCard.com.gzbz.protobuf.OptionEnum\u0012\u000b\n\u0003val\u0018\u0002 \u0001(\u0005\"P\n\u0010C2S_Option_28613\u0012<\n\rlotteryOption\u0018\u0001 \u0003(\u000b2%.heroCard.com.gzbz.protobuf.OptionVal\"P\n\u0010S2C_Option_28614\u0012<\n\rlotteryOption\u0018\u0001 \u0003(\u000b2%.heroCard.com.gzbz.protobuf.OptionVal\"\u0016\n\u0014C2S_OptionInfo_28615\"T\n\u0014S2C_OptionInfo_28616\u0012<\n\rlotteryOption\u0018\u0001 \u0003(\u000b2%.heroCard.com.gzbz.protobuf.OptionVal\"`\n\u001bS2C_NoticePresentCard_28617\u0012A\n\u000fpresentHeroCard\u0018\u0001 \u0003(\u000b2(.heroCard.com.gzbz.protobuf.HeroCardData\"\u001b\n\u0019C2S_StopAutoLottery_28618\"\u001b\n\u0019S2C_StopAutoLottery_28619\"B\n\u001cC2S_ZhuHouEquipLottery_28620\u0012\u000b\n\u0003num\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rcurMainTaskId\u0018\u0002 \u0002(\u0005\"Ô\u0001\n\u001cS2C_ZhuHouEquipLottery_28621\u00128\n\tequipData\u0018\u0001 \u0003(\u000b2%.heroCard.com.gzbz.protobuf.EquipData\u0012\u0017\n\u000fdailyLotteryNum\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006result\u0018\u0003 \u0002(\u0005\u0012\u0014\n\flotteryCount\u0018\u0004 \u0002(\u0003\u0012;\n\fresolveEquip\u0018\u0005 \u0003(\u000b2%.heroCard.com.gzbz.protobuf.EquipData\"\u0082\u0001\n\tEquipData\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007equipId\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0003 \u0002(\u0005\u00127\n\u0004attr\u0018\u0004 \u0003(\u000b2).heroCard.com.gzbz.protobuf.EquipTypeAttr\u0012\u000e\n\u0006enable\u0018\u0005 \u0002(\b\"I\n\rEquipTypeAttr\u0012\u0010\n\bheroType\u0018\u0001 \u0001(\u0005\u0012\f\n\u0004type\u0018\u0002 \u0002(\u0005\u0012\u000b\n\u0003way\u0018\u0003 \u0002(\u0005\u0012\u000b\n\u0003val\u0018\u0004 \u0002(\u0005\"-\n\u001cC2S_ZhuHouResolveEquip_28622\u0012\r\n\u0005codes\u0018\u0002 \u0003(\u0005\"\u0080\u0001\n\u001cS2C_ZhuHouResolveEquip_28623\u00125\n\u0006equips\u0018\u0001 \u0003(\u000b2%.heroCard.com.gzbz.protobuf.EquipData\u0012\r\n\u0005codes\u0018\u0003 \u0003(\u0005\u0012\u000b\n\u0003exp\u0018\u0004 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0005 \u0002(\u0005\"\u0019\n\u0017C2S_ZhuHouLevelUp_28624\"5\n\u0017S2C_ZhuHouLevelUp_28625\u0012\r\n\u0005level\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003exp\u0018\u0002 \u0002(\u0003\"=\n\u0019C2S_ZhuHouStampLvUp_28626\u0012\r\n\u0005count\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tisLevelUp\u0018\u0002 \u0002(\b\"D\n\u0019S2C_ZhuHouStampLvUp_28627\u0012\u0010\n\bcurBoxLv\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rboxNextLvTime\u0018\u0002 \u0001(\u0003\"\u0016\n\u0014C2S_ZhuHouInfo_28628\"Å\u0001\n\u0014S2C_ZhuHouInfo_28629\u00125\n\u0006equips\u0018\u0001 \u0003(\u000b2%.heroCard.com.gzbz.protobuf.EquipData\u0012\r\n\u0005level\u0018\u0002 \u0002(\u0005\u0012\u0012\n\nstampLevel\u0018\u0003 \u0002(\u0005\u0012\u0017\n\u000fstampNextLvTime\u0018\u0004 \u0001(\u0003\u0012\u0017\n\u000fdailyLotteryNum\u0018\u0005 \u0002(\u0005\u0012\u0014\n\flotteryCount\u0018\u0006 \u0002(\u0003\u0012\u000b\n\u0003exp\u0018\u0007 \u0002(\u0005\"<\n\u0019C2S_ZhuHouWearEquip_28630\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tisResolve\u0018\u0002 \u0002(\b\"\u008f\u0001\n\u0019S2C_ZhuHouWearEquip_28631\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tisResolve\u0018\u0002 \u0002(\b\u00125\n\u0006equips\u0018\u0003 \u0003(\u000b2%.heroCard.com.gzbz.protobuf.EquipData\u0012\u000b\n\u0003exp\u0018\u0004 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0005 \u0002(\u0005\"R\n\u0019S2C_ZhuHouEquipInfo_28632\u00125\n\u0006equips\u0018\u0001 \u0003(\u000b2%.heroCard.com.gzbz.protobuf.EquipData\"(\n\u0017C2S_ZhuHoubuyItem_28633\u0012\r\n\u0005count\u0018\u0001 \u0002(\u0005*À\u0001\n\nOptionEnum\u0012\u000b\n\u0007QUALITY\u0010\u0001\u0012\u0010\n\fSCORE_BIGGER\u0010\u0002\u0012\u0011\n\rTASK_COMPLETE\u0010\u0003\u0012\r\n\tCONDITION\u0010\u0004\u0012\f\n\bSPEED_UP\u0010\u0005\u0012\u000e\n\nBACK_STATE\u0010\u0006\u0012\u0010\n\fATTACK_ATTR1\u0010\u0007\u0012\u0011\n\rDEFENCE_ATTR1\u0010\b\u0012\u0010\n\fATTACK_ATTR2\u0010\t\u0012\u0011\n\rDEFENCE_ATTR2\u0010\n\u0012\t\n\u0005QUICK\u0010\u000bB\"\n\u0011com.gzbz.protobufB\u000bHeroCardMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_heroCard_com_gzbz_protobuf_HeroCardData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_heroCard_com_gzbz_protobuf_HeroCardData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_HeroCardData_descriptor, new String[]{"Code", "HeroCardId", "BreachLv", "Attr"});
      internal_static_heroCard_com_gzbz_protobuf_HeroTypeAttr_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_heroCard_com_gzbz_protobuf_HeroTypeAttr_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_HeroTypeAttr_descriptor, new String[]{"HeroType", "Type", "Way", "Val"});
      internal_static_heroCard_com_gzbz_protobuf_C2S_HeroCardInfo_28601_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_heroCard_com_gzbz_protobuf_C2S_HeroCardInfo_28601_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_C2S_HeroCardInfo_28601_descriptor, new String[0]);
      internal_static_heroCard_com_gzbz_protobuf_S2C_HeroCardInfo_28602_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_heroCard_com_gzbz_protobuf_S2C_HeroCardInfo_28602_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_S2C_HeroCardInfo_28602_descriptor, new String[]{"PresentHeroCard", "SurplusHeroCard", "CurBoxLv", "BoxNextLvTime", "DailyLotteryNum", "LotteryCount"});
      internal_static_heroCard_com_gzbz_protobuf_C2S_HeroCardLottery_28603_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_heroCard_com_gzbz_protobuf_C2S_HeroCardLottery_28603_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_C2S_HeroCardLottery_28603_descriptor, new String[]{"Num", "CurMainTaskId"});
      internal_static_heroCard_com_gzbz_protobuf_S2C_HeroCardLottery_28604_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_heroCard_com_gzbz_protobuf_S2C_HeroCardLottery_28604_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_S2C_HeroCardLottery_28604_descriptor, new String[]{"HeroCard", "ResolveCard", "DailyLotteryNum", "Result", "LotteryCount", "IsBackAuto"});
      internal_static_heroCard_com_gzbz_protobuf_C2S_PresentHeroCard_28605_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_heroCard_com_gzbz_protobuf_C2S_PresentHeroCard_28605_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_C2S_PresentHeroCard_28605_descriptor, new String[]{"Code", "IsResolve"});
      internal_static_heroCard_com_gzbz_protobuf_S2C_PresentHeroCard_28606_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_heroCard_com_gzbz_protobuf_S2C_PresentHeroCard_28606_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_S2C_PresentHeroCard_28606_descriptor, new String[]{"Code", "IsResolve", "PresentHeroCard", "SurplusHeroCard"});
      internal_static_heroCard_com_gzbz_protobuf_C2S_DismissHeroCard_28607_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_heroCard_com_gzbz_protobuf_C2S_DismissHeroCard_28607_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_C2S_DismissHeroCard_28607_descriptor, new String[]{"HeroCardType", "Code"});
      internal_static_heroCard_com_gzbz_protobuf_S2C_DismissHeroCard_28608_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_heroCard_com_gzbz_protobuf_S2C_DismissHeroCard_28608_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_S2C_DismissHeroCard_28608_descriptor, new String[]{"PresentHeroCard", "SurplusHeroCard", "ResolveCardId"});
      internal_static_heroCard_com_gzbz_protobuf_C2S_BoxLvUp_28609_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_heroCard_com_gzbz_protobuf_C2S_BoxLvUp_28609_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_C2S_BoxLvUp_28609_descriptor, new String[0]);
      internal_static_heroCard_com_gzbz_protobuf_S2C_BoxLvUp_28610_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_heroCard_com_gzbz_protobuf_S2C_BoxLvUp_28610_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_S2C_BoxLvUp_28610_descriptor, new String[]{"CurBoxLv", "BoxNextLvTime"});
      internal_static_heroCard_com_gzbz_protobuf_C2S_CutTime_28611_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_heroCard_com_gzbz_protobuf_C2S_CutTime_28611_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_C2S_CutTime_28611_descriptor, new String[]{"Cost"});
      internal_static_heroCard_com_gzbz_protobuf_S2C_CutTime_28612_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_heroCard_com_gzbz_protobuf_S2C_CutTime_28612_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_S2C_CutTime_28612_descriptor, new String[]{"CurBoxLv", "BoxNextLvTime"});
      internal_static_heroCard_com_gzbz_protobuf_OptionVal_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_heroCard_com_gzbz_protobuf_OptionVal_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_OptionVal_descriptor, new String[]{"Option", "Val"});
      internal_static_heroCard_com_gzbz_protobuf_C2S_Option_28613_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_heroCard_com_gzbz_protobuf_C2S_Option_28613_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_C2S_Option_28613_descriptor, new String[]{"LotteryOption"});
      internal_static_heroCard_com_gzbz_protobuf_S2C_Option_28614_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_heroCard_com_gzbz_protobuf_S2C_Option_28614_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_S2C_Option_28614_descriptor, new String[]{"LotteryOption"});
      internal_static_heroCard_com_gzbz_protobuf_C2S_OptionInfo_28615_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_heroCard_com_gzbz_protobuf_C2S_OptionInfo_28615_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_C2S_OptionInfo_28615_descriptor, new String[0]);
      internal_static_heroCard_com_gzbz_protobuf_S2C_OptionInfo_28616_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_heroCard_com_gzbz_protobuf_S2C_OptionInfo_28616_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_S2C_OptionInfo_28616_descriptor, new String[]{"LotteryOption"});
      internal_static_heroCard_com_gzbz_protobuf_S2C_NoticePresentCard_28617_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_heroCard_com_gzbz_protobuf_S2C_NoticePresentCard_28617_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_S2C_NoticePresentCard_28617_descriptor, new String[]{"PresentHeroCard"});
      internal_static_heroCard_com_gzbz_protobuf_C2S_StopAutoLottery_28618_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_heroCard_com_gzbz_protobuf_C2S_StopAutoLottery_28618_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_C2S_StopAutoLottery_28618_descriptor, new String[0]);
      internal_static_heroCard_com_gzbz_protobuf_S2C_StopAutoLottery_28619_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_heroCard_com_gzbz_protobuf_S2C_StopAutoLottery_28619_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_S2C_StopAutoLottery_28619_descriptor, new String[0]);
      internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouEquipLottery_28620_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouEquipLottery_28620_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouEquipLottery_28620_descriptor, new String[]{"Num", "CurMainTaskId"});
      internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouEquipLottery_28621_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouEquipLottery_28621_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouEquipLottery_28621_descriptor, new String[]{"EquipData", "DailyLotteryNum", "Result", "LotteryCount", "ResolveEquip"});
      internal_static_heroCard_com_gzbz_protobuf_EquipData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_heroCard_com_gzbz_protobuf_EquipData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_EquipData_descriptor, new String[]{"Code", "EquipId", "Level", "Attr", "Enable"});
      internal_static_heroCard_com_gzbz_protobuf_EquipTypeAttr_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_heroCard_com_gzbz_protobuf_EquipTypeAttr_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_EquipTypeAttr_descriptor, new String[]{"HeroType", "Type", "Way", "Val"});
      internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouResolveEquip_28622_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouResolveEquip_28622_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouResolveEquip_28622_descriptor, new String[]{"Codes"});
      internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouResolveEquip_28623_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouResolveEquip_28623_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouResolveEquip_28623_descriptor, new String[]{"Equips", "Codes", "Exp", "Level"});
      internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouLevelUp_28624_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouLevelUp_28624_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouLevelUp_28624_descriptor, new String[0]);
      internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouLevelUp_28625_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouLevelUp_28625_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouLevelUp_28625_descriptor, new String[]{"Level", "Exp"});
      internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouStampLvUp_28626_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouStampLvUp_28626_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouStampLvUp_28626_descriptor, new String[]{"Count", "IsLevelUp"});
      internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouStampLvUp_28627_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouStampLvUp_28627_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouStampLvUp_28627_descriptor, new String[]{"CurBoxLv", "BoxNextLvTime"});
      internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouInfo_28628_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouInfo_28628_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouInfo_28628_descriptor, new String[0]);
      internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouInfo_28629_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouInfo_28629_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouInfo_28629_descriptor, new String[]{"Equips", "Level", "StampLevel", "StampNextLvTime", "DailyLotteryNum", "LotteryCount", "Exp"});
      internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouWearEquip_28630_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouWearEquip_28630_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouWearEquip_28630_descriptor, new String[]{"Code", "IsResolve"});
      internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouWearEquip_28631_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(35);
      internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouWearEquip_28631_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouWearEquip_28631_descriptor, new String[]{"Code", "IsResolve", "Equips", "Exp", "Level"});
      internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouEquipInfo_28632_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(36);
      internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouEquipInfo_28632_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouEquipInfo_28632_descriptor, new String[]{"Equips"});
      internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHoubuyItem_28633_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(37);
      internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHoubuyItem_28633_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHoubuyItem_28633_descriptor, new String[]{"Count"});
      CommonMsg.getDescriptor();
   }

   public static enum OptionEnum implements ProtocolMessageEnum {
      QUALITY(1),
      SCORE_BIGGER(2),
      TASK_COMPLETE(3),
      CONDITION(4),
      SPEED_UP(5),
      BACK_STATE(6),
      ATTACK_ATTR1(7),
      DEFENCE_ATTR1(8),
      ATTACK_ATTR2(9),
      DEFENCE_ATTR2(10),
      QUICK(11);

      public static final int QUALITY_VALUE = 1;
      public static final int SCORE_BIGGER_VALUE = 2;
      public static final int TASK_COMPLETE_VALUE = 3;
      public static final int CONDITION_VALUE = 4;
      public static final int SPEED_UP_VALUE = 5;
      public static final int BACK_STATE_VALUE = 6;
      public static final int ATTACK_ATTR1_VALUE = 7;
      public static final int DEFENCE_ATTR1_VALUE = 8;
      public static final int ATTACK_ATTR2_VALUE = 9;
      public static final int DEFENCE_ATTR2_VALUE = 10;
      public static final int QUICK_VALUE = 11;
      private static final Internal.EnumLiteMap<OptionEnum> internalValueMap = new Internal.EnumLiteMap<OptionEnum>() {
         public OptionEnum findValueByNumber(int number) {
            return HeroCardMsg.OptionEnum.forNumber(number);
         }
      };
      private static final OptionEnum[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static OptionEnum valueOf(int value) {
         return forNumber(value);
      }

      public static OptionEnum forNumber(int value) {
         switch (value) {
            case 1:
               return QUALITY;
            case 2:
               return SCORE_BIGGER;
            case 3:
               return TASK_COMPLETE;
            case 4:
               return CONDITION;
            case 5:
               return SPEED_UP;
            case 6:
               return BACK_STATE;
            case 7:
               return ATTACK_ATTR1;
            case 8:
               return DEFENCE_ATTR1;
            case 9:
               return ATTACK_ATTR2;
            case 10:
               return DEFENCE_ATTR2;
            case 11:
               return QUICK;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<OptionEnum> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)HeroCardMsg.getDescriptor().getEnumTypes().get(0);
      }

      public static OptionEnum valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private OptionEnum(int value) {
         this.value = value;
      }
   }

   public static final class HeroCardData extends GeneratedMessageV3 implements HeroCardDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int HEROCARDID_FIELD_NUMBER = 2;
      private int heroCardId_;
      public static final int BREACHLV_FIELD_NUMBER = 3;
      private int breachLv_;
      public static final int ATTR_FIELD_NUMBER = 4;
      private List<HeroTypeAttr> attr_;
      private byte memoizedIsInitialized;
      private static final HeroCardData DEFAULT_INSTANCE = new HeroCardData();
      /** @deprecated */
      @Deprecated
      public static final Parser<HeroCardData> PARSER = new AbstractParser<HeroCardData>() {
         public HeroCardData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new HeroCardData(input, extensionRegistry);
         }
      };

      private HeroCardData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private HeroCardData() {
         this.memoizedIsInitialized = -1;
         this.attr_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new HeroCardData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private HeroCardData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCardId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.breachLv_ = input.readInt32();
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.attr_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.attr_.add(input.readMessage(HeroCardMsg.HeroTypeAttr.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.attr_ = Collections.unmodifiableList(this.attr_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_HeroCardData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_HeroCardData_fieldAccessorTable.ensureFieldAccessorsInitialized(HeroCardData.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasHeroCardId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHeroCardId() {
         return this.heroCardId_;
      }

      public boolean hasBreachLv() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getBreachLv() {
         return this.breachLv_;
      }

      public List<HeroTypeAttr> getAttrList() {
         return this.attr_;
      }

      public List<? extends HeroTypeAttrOrBuilder> getAttrOrBuilderList() {
         return this.attr_;
      }

      public int getAttrCount() {
         return this.attr_.size();
      }

      public HeroTypeAttr getAttr(int index) {
         return (HeroTypeAttr)this.attr_.get(index);
      }

      public HeroTypeAttrOrBuilder getAttrOrBuilder(int index) {
         return (HeroTypeAttrOrBuilder)this.attr_.get(index);
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
         } else if (!this.hasHeroCardId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBreachLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getAttrCount(); ++i) {
               if (!this.getAttr(i).isInitialized()) {
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
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.heroCardId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.breachLv_);
         }

         for(int i = 0; i < this.attr_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.attr_.get(i));
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
               size += CodedOutputStream.computeInt32Size(2, this.heroCardId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.breachLv_);
            }

            for(int i = 0; i < this.attr_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.attr_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof HeroCardData)) {
            return super.equals(obj);
         } else {
            HeroCardData other = (HeroCardData)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasHeroCardId() != other.hasHeroCardId()) {
               return false;
            } else if (this.hasHeroCardId() && this.getHeroCardId() != other.getHeroCardId()) {
               return false;
            } else if (this.hasBreachLv() != other.hasBreachLv()) {
               return false;
            } else if (this.hasBreachLv() && this.getBreachLv() != other.getBreachLv()) {
               return false;
            } else if (!this.getAttrList().equals(other.getAttrList())) {
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

            if (this.hasHeroCardId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroCardId();
            }

            if (this.hasBreachLv()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBreachLv();
            }

            if (this.getAttrCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getAttrList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static HeroCardData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (HeroCardData)PARSER.parseFrom(data);
      }

      public static HeroCardData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroCardData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroCardData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (HeroCardData)PARSER.parseFrom(data);
      }

      public static HeroCardData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroCardData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroCardData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (HeroCardData)PARSER.parseFrom(data);
      }

      public static HeroCardData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroCardData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroCardData parseFrom(InputStream input) throws IOException {
         return (HeroCardData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HeroCardData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroCardData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static HeroCardData parseDelimitedFrom(InputStream input) throws IOException {
         return (HeroCardData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static HeroCardData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroCardData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static HeroCardData parseFrom(CodedInputStream input) throws IOException {
         return (HeroCardData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HeroCardData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroCardData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(HeroCardData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static HeroCardData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<HeroCardData> parser() {
         return PARSER;
      }

      public Parser<HeroCardData> getParserForType() {
         return PARSER;
      }

      public HeroCardData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HeroCardDataOrBuilder {
         private int bitField0_;
         private int code_;
         private int heroCardId_;
         private int breachLv_;
         private List<HeroTypeAttr> attr_;
         private RepeatedFieldBuilderV3<HeroTypeAttr, HeroTypeAttr.Builder, HeroTypeAttrOrBuilder> attrBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_HeroCardData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_HeroCardData_fieldAccessorTable.ensureFieldAccessorsInitialized(HeroCardData.class, Builder.class);
         }

         private Builder() {
            this.attr_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.attr_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.HeroCardData.alwaysUseFieldBuilders) {
               this.getAttrFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.heroCardId_ = 0;
            this.bitField0_ &= -3;
            this.breachLv_ = 0;
            this.bitField0_ &= -5;
            if (this.attrBuilder_ == null) {
               this.attr_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.attrBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_HeroCardData_descriptor;
         }

         public HeroCardData getDefaultInstanceForType() {
            return HeroCardMsg.HeroCardData.getDefaultInstance();
         }

         public HeroCardData build() {
            HeroCardData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public HeroCardData buildPartial() {
            HeroCardData result = new HeroCardData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.heroCardId_ = this.heroCardId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.breachLv_ = this.breachLv_;
               to_bitField0_ |= 4;
            }

            if (this.attrBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.attr_ = Collections.unmodifiableList(this.attr_);
                  this.bitField0_ &= -9;
               }

               result.attr_ = this.attr_;
            } else {
               result.attr_ = this.attrBuilder_.build();
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
            if (other instanceof HeroCardData) {
               return this.mergeFrom((HeroCardData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(HeroCardData other) {
            if (other == HeroCardMsg.HeroCardData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasHeroCardId()) {
                  this.setHeroCardId(other.getHeroCardId());
               }

               if (other.hasBreachLv()) {
                  this.setBreachLv(other.getBreachLv());
               }

               if (this.attrBuilder_ == null) {
                  if (!other.attr_.isEmpty()) {
                     if (this.attr_.isEmpty()) {
                        this.attr_ = other.attr_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureAttrIsMutable();
                        this.attr_.addAll(other.attr_);
                     }

                     this.onChanged();
                  }
               } else if (!other.attr_.isEmpty()) {
                  if (this.attrBuilder_.isEmpty()) {
                     this.attrBuilder_.dispose();
                     this.attrBuilder_ = null;
                     this.attr_ = other.attr_;
                     this.bitField0_ &= -9;
                     this.attrBuilder_ = HeroCardMsg.HeroCardData.alwaysUseFieldBuilders ? this.getAttrFieldBuilder() : null;
                  } else {
                     this.attrBuilder_.addAllMessages(other.attr_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else if (!this.hasHeroCardId()) {
               return false;
            } else if (!this.hasBreachLv()) {
               return false;
            } else {
               for(int i = 0; i < this.getAttrCount(); ++i) {
                  if (!this.getAttr(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            HeroCardData parsedMessage = null;

            try {
               parsedMessage = (HeroCardData)HeroCardMsg.HeroCardData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (HeroCardData)e.getUnfinishedMessage();
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

         public boolean hasHeroCardId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHeroCardId() {
            return this.heroCardId_;
         }

         public Builder setHeroCardId(int value) {
            this.bitField0_ |= 2;
            this.heroCardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCardId() {
            this.bitField0_ &= -3;
            this.heroCardId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBreachLv() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getBreachLv() {
            return this.breachLv_;
         }

         public Builder setBreachLv(int value) {
            this.bitField0_ |= 4;
            this.breachLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBreachLv() {
            this.bitField0_ &= -5;
            this.breachLv_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureAttrIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.attr_ = new ArrayList(this.attr_);
               this.bitField0_ |= 8;
            }

         }

         public List<HeroTypeAttr> getAttrList() {
            return this.attrBuilder_ == null ? Collections.unmodifiableList(this.attr_) : this.attrBuilder_.getMessageList();
         }

         public int getAttrCount() {
            return this.attrBuilder_ == null ? this.attr_.size() : this.attrBuilder_.getCount();
         }

         public HeroTypeAttr getAttr(int index) {
            return this.attrBuilder_ == null ? (HeroTypeAttr)this.attr_.get(index) : (HeroTypeAttr)this.attrBuilder_.getMessage(index);
         }

         public Builder setAttr(int index, HeroTypeAttr value) {
            if (this.attrBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAttrIsMutable();
               this.attr_.set(index, value);
               this.onChanged();
            } else {
               this.attrBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAttr(int index, HeroTypeAttr.Builder builderForValue) {
            if (this.attrBuilder_ == null) {
               this.ensureAttrIsMutable();
               this.attr_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.attrBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAttr(HeroTypeAttr value) {
            if (this.attrBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAttrIsMutable();
               this.attr_.add(value);
               this.onChanged();
            } else {
               this.attrBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAttr(int index, HeroTypeAttr value) {
            if (this.attrBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAttrIsMutable();
               this.attr_.add(index, value);
               this.onChanged();
            } else {
               this.attrBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAttr(HeroTypeAttr.Builder builderForValue) {
            if (this.attrBuilder_ == null) {
               this.ensureAttrIsMutable();
               this.attr_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.attrBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAttr(int index, HeroTypeAttr.Builder builderForValue) {
            if (this.attrBuilder_ == null) {
               this.ensureAttrIsMutable();
               this.attr_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.attrBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAttr(Iterable<? extends HeroTypeAttr> values) {
            if (this.attrBuilder_ == null) {
               this.ensureAttrIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.attr_);
               this.onChanged();
            } else {
               this.attrBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAttr() {
            if (this.attrBuilder_ == null) {
               this.attr_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.attrBuilder_.clear();
            }

            return this;
         }

         public Builder removeAttr(int index) {
            if (this.attrBuilder_ == null) {
               this.ensureAttrIsMutable();
               this.attr_.remove(index);
               this.onChanged();
            } else {
               this.attrBuilder_.remove(index);
            }

            return this;
         }

         public HeroTypeAttr.Builder getAttrBuilder(int index) {
            return (HeroTypeAttr.Builder)this.getAttrFieldBuilder().getBuilder(index);
         }

         public HeroTypeAttrOrBuilder getAttrOrBuilder(int index) {
            return this.attrBuilder_ == null ? (HeroTypeAttrOrBuilder)this.attr_.get(index) : (HeroTypeAttrOrBuilder)this.attrBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HeroTypeAttrOrBuilder> getAttrOrBuilderList() {
            return this.attrBuilder_ != null ? this.attrBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.attr_);
         }

         public HeroTypeAttr.Builder addAttrBuilder() {
            return (HeroTypeAttr.Builder)this.getAttrFieldBuilder().addBuilder(HeroCardMsg.HeroTypeAttr.getDefaultInstance());
         }

         public HeroTypeAttr.Builder addAttrBuilder(int index) {
            return (HeroTypeAttr.Builder)this.getAttrFieldBuilder().addBuilder(index, HeroCardMsg.HeroTypeAttr.getDefaultInstance());
         }

         public List<HeroTypeAttr.Builder> getAttrBuilderList() {
            return this.getAttrFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HeroTypeAttr, HeroTypeAttr.Builder, HeroTypeAttrOrBuilder> getAttrFieldBuilder() {
            if (this.attrBuilder_ == null) {
               this.attrBuilder_ = new RepeatedFieldBuilderV3(this.attr_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.attr_ = null;
            }

            return this.attrBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class HeroTypeAttr extends GeneratedMessageV3 implements HeroTypeAttrOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROTYPE_FIELD_NUMBER = 1;
      private int heroType_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      public static final int WAY_FIELD_NUMBER = 3;
      private int way_;
      public static final int VAL_FIELD_NUMBER = 4;
      private int val_;
      private byte memoizedIsInitialized;
      private static final HeroTypeAttr DEFAULT_INSTANCE = new HeroTypeAttr();
      /** @deprecated */
      @Deprecated
      public static final Parser<HeroTypeAttr> PARSER = new AbstractParser<HeroTypeAttr>() {
         public HeroTypeAttr parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new HeroTypeAttr(input, extensionRegistry);
         }
      };

      private HeroTypeAttr(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private HeroTypeAttr() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new HeroTypeAttr();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private HeroTypeAttr(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroType_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.type_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.way_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.val_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_HeroTypeAttr_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_HeroTypeAttr_fieldAccessorTable.ensureFieldAccessorsInitialized(HeroTypeAttr.class, Builder.class);
      }

      public boolean hasHeroType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroType() {
         return this.heroType_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasWay() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getWay() {
         return this.way_;
      }

      public boolean hasVal() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getVal() {
         return this.val_;
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
         } else if (!this.hasWay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasVal()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.type_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.way_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.val_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.type_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.way_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.val_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof HeroTypeAttr)) {
            return super.equals(obj);
         } else {
            HeroTypeAttr other = (HeroTypeAttr)obj;
            if (this.hasHeroType() != other.hasHeroType()) {
               return false;
            } else if (this.hasHeroType() && this.getHeroType() != other.getHeroType()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasWay() != other.hasWay()) {
               return false;
            } else if (this.hasWay() && this.getWay() != other.getWay()) {
               return false;
            } else if (this.hasVal() != other.hasVal()) {
               return false;
            } else if (this.hasVal() && this.getVal() != other.getVal()) {
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
            if (this.hasHeroType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroType();
            }

            if (this.hasType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getType();
            }

            if (this.hasWay()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getWay();
            }

            if (this.hasVal()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getVal();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static HeroTypeAttr parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (HeroTypeAttr)PARSER.parseFrom(data);
      }

      public static HeroTypeAttr parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroTypeAttr)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroTypeAttr parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (HeroTypeAttr)PARSER.parseFrom(data);
      }

      public static HeroTypeAttr parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroTypeAttr)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroTypeAttr parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (HeroTypeAttr)PARSER.parseFrom(data);
      }

      public static HeroTypeAttr parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroTypeAttr)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroTypeAttr parseFrom(InputStream input) throws IOException {
         return (HeroTypeAttr)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HeroTypeAttr parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroTypeAttr)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static HeroTypeAttr parseDelimitedFrom(InputStream input) throws IOException {
         return (HeroTypeAttr)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static HeroTypeAttr parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroTypeAttr)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static HeroTypeAttr parseFrom(CodedInputStream input) throws IOException {
         return (HeroTypeAttr)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HeroTypeAttr parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroTypeAttr)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(HeroTypeAttr prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static HeroTypeAttr getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<HeroTypeAttr> parser() {
         return PARSER;
      }

      public Parser<HeroTypeAttr> getParserForType() {
         return PARSER;
      }

      public HeroTypeAttr getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HeroTypeAttrOrBuilder {
         private int bitField0_;
         private int heroType_;
         private int type_;
         private int way_;
         private int val_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_HeroTypeAttr_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_HeroTypeAttr_fieldAccessorTable.ensureFieldAccessorsInitialized(HeroTypeAttr.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.HeroTypeAttr.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroType_ = 0;
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.bitField0_ &= -3;
            this.way_ = 0;
            this.bitField0_ &= -5;
            this.val_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_HeroTypeAttr_descriptor;
         }

         public HeroTypeAttr getDefaultInstanceForType() {
            return HeroCardMsg.HeroTypeAttr.getDefaultInstance();
         }

         public HeroTypeAttr build() {
            HeroTypeAttr result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public HeroTypeAttr buildPartial() {
            HeroTypeAttr result = new HeroTypeAttr(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroType_ = this.heroType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.way_ = this.way_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.val_ = this.val_;
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
            if (other instanceof HeroTypeAttr) {
               return this.mergeFrom((HeroTypeAttr)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(HeroTypeAttr other) {
            if (other == HeroCardMsg.HeroTypeAttr.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroType()) {
                  this.setHeroType(other.getHeroType());
               }

               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasWay()) {
                  this.setWay(other.getWay());
               }

               if (other.hasVal()) {
                  this.setVal(other.getVal());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else if (!this.hasWay()) {
               return false;
            } else {
               return this.hasVal();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            HeroTypeAttr parsedMessage = null;

            try {
               parsedMessage = (HeroTypeAttr)HeroCardMsg.HeroTypeAttr.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (HeroTypeAttr)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroType() {
            return this.heroType_;
         }

         public Builder setHeroType(int value) {
            this.bitField0_ |= 1;
            this.heroType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroType() {
            this.bitField0_ &= -2;
            this.heroType_ = 0;
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

         public boolean hasWay() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getWay() {
            return this.way_;
         }

         public Builder setWay(int value) {
            this.bitField0_ |= 4;
            this.way_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWay() {
            this.bitField0_ &= -5;
            this.way_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasVal() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getVal() {
            return this.val_;
         }

         public Builder setVal(int value) {
            this.bitField0_ |= 8;
            this.val_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearVal() {
            this.bitField0_ &= -9;
            this.val_ = 0;
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

   public static final class C2S_HeroCardInfo_28601 extends GeneratedMessageV3 implements C2S_HeroCardInfo_28601OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_HeroCardInfo_28601 DEFAULT_INSTANCE = new C2S_HeroCardInfo_28601();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HeroCardInfo_28601> PARSER = new AbstractParser<C2S_HeroCardInfo_28601>() {
         public C2S_HeroCardInfo_28601 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HeroCardInfo_28601(input, extensionRegistry);
         }
      };

      private C2S_HeroCardInfo_28601(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HeroCardInfo_28601() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HeroCardInfo_28601();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HeroCardInfo_28601(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_HeroCardInfo_28601_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_HeroCardInfo_28601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroCardInfo_28601.class, Builder.class);
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
         } else if (!(obj instanceof C2S_HeroCardInfo_28601)) {
            return super.equals(obj);
         } else {
            C2S_HeroCardInfo_28601 other = (C2S_HeroCardInfo_28601)obj;
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

      public static C2S_HeroCardInfo_28601 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HeroCardInfo_28601)PARSER.parseFrom(data);
      }

      public static C2S_HeroCardInfo_28601 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroCardInfo_28601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroCardInfo_28601 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HeroCardInfo_28601)PARSER.parseFrom(data);
      }

      public static C2S_HeroCardInfo_28601 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroCardInfo_28601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroCardInfo_28601 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HeroCardInfo_28601)PARSER.parseFrom(data);
      }

      public static C2S_HeroCardInfo_28601 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroCardInfo_28601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroCardInfo_28601 parseFrom(InputStream input) throws IOException {
         return (C2S_HeroCardInfo_28601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroCardInfo_28601 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroCardInfo_28601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroCardInfo_28601 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HeroCardInfo_28601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HeroCardInfo_28601 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroCardInfo_28601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroCardInfo_28601 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HeroCardInfo_28601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroCardInfo_28601 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroCardInfo_28601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HeroCardInfo_28601 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HeroCardInfo_28601 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HeroCardInfo_28601> parser() {
         return PARSER;
      }

      public Parser<C2S_HeroCardInfo_28601> getParserForType() {
         return PARSER;
      }

      public C2S_HeroCardInfo_28601 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HeroCardInfo_28601OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_HeroCardInfo_28601_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_HeroCardInfo_28601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroCardInfo_28601.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.C2S_HeroCardInfo_28601.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_HeroCardInfo_28601_descriptor;
         }

         public C2S_HeroCardInfo_28601 getDefaultInstanceForType() {
            return HeroCardMsg.C2S_HeroCardInfo_28601.getDefaultInstance();
         }

         public C2S_HeroCardInfo_28601 build() {
            C2S_HeroCardInfo_28601 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HeroCardInfo_28601 buildPartial() {
            C2S_HeroCardInfo_28601 result = new C2S_HeroCardInfo_28601(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_HeroCardInfo_28601) {
               return this.mergeFrom((C2S_HeroCardInfo_28601)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HeroCardInfo_28601 other) {
            if (other == HeroCardMsg.C2S_HeroCardInfo_28601.getDefaultInstance()) {
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
            C2S_HeroCardInfo_28601 parsedMessage = null;

            try {
               parsedMessage = (C2S_HeroCardInfo_28601)HeroCardMsg.C2S_HeroCardInfo_28601.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HeroCardInfo_28601)e.getUnfinishedMessage();
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

   public static final class S2C_HeroCardInfo_28602 extends GeneratedMessageV3 implements S2C_HeroCardInfo_28602OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PRESENTHEROCARD_FIELD_NUMBER = 1;
      private List<HeroCardData> presentHeroCard_;
      public static final int SURPLUSHEROCARD_FIELD_NUMBER = 2;
      private List<HeroCardData> surplusHeroCard_;
      public static final int CURBOXLV_FIELD_NUMBER = 3;
      private int curBoxLv_;
      public static final int BOXNEXTLVTIME_FIELD_NUMBER = 4;
      private long boxNextLvTime_;
      public static final int DAILYLOTTERYNUM_FIELD_NUMBER = 5;
      private int dailyLotteryNum_;
      public static final int LOTTERYCOUNT_FIELD_NUMBER = 6;
      private long lotteryCount_;
      private byte memoizedIsInitialized;
      private static final S2C_HeroCardInfo_28602 DEFAULT_INSTANCE = new S2C_HeroCardInfo_28602();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HeroCardInfo_28602> PARSER = new AbstractParser<S2C_HeroCardInfo_28602>() {
         public S2C_HeroCardInfo_28602 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HeroCardInfo_28602(input, extensionRegistry);
         }
      };

      private S2C_HeroCardInfo_28602(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HeroCardInfo_28602() {
         this.memoizedIsInitialized = -1;
         this.presentHeroCard_ = Collections.emptyList();
         this.surplusHeroCard_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HeroCardInfo_28602();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HeroCardInfo_28602(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.presentHeroCard_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.presentHeroCard_.add(input.readMessage(HeroCardMsg.HeroCardData.PARSER, extensionRegistry));
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.surplusHeroCard_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.surplusHeroCard_.add(input.readMessage(HeroCardMsg.HeroCardData.PARSER, extensionRegistry));
                        break;
                     case 24:
                        this.bitField0_ |= 1;
                        this.curBoxLv_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 2;
                        this.boxNextLvTime_ = input.readInt64();
                        break;
                     case 40:
                        this.bitField0_ |= 4;
                        this.dailyLotteryNum_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 8;
                        this.lotteryCount_ = input.readInt64();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.presentHeroCard_ = Collections.unmodifiableList(this.presentHeroCard_);
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.surplusHeroCard_ = Collections.unmodifiableList(this.surplusHeroCard_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_HeroCardInfo_28602_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_HeroCardInfo_28602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroCardInfo_28602.class, Builder.class);
      }

      public List<HeroCardData> getPresentHeroCardList() {
         return this.presentHeroCard_;
      }

      public List<? extends HeroCardDataOrBuilder> getPresentHeroCardOrBuilderList() {
         return this.presentHeroCard_;
      }

      public int getPresentHeroCardCount() {
         return this.presentHeroCard_.size();
      }

      public HeroCardData getPresentHeroCard(int index) {
         return (HeroCardData)this.presentHeroCard_.get(index);
      }

      public HeroCardDataOrBuilder getPresentHeroCardOrBuilder(int index) {
         return (HeroCardDataOrBuilder)this.presentHeroCard_.get(index);
      }

      public List<HeroCardData> getSurplusHeroCardList() {
         return this.surplusHeroCard_;
      }

      public List<? extends HeroCardDataOrBuilder> getSurplusHeroCardOrBuilderList() {
         return this.surplusHeroCard_;
      }

      public int getSurplusHeroCardCount() {
         return this.surplusHeroCard_.size();
      }

      public HeroCardData getSurplusHeroCard(int index) {
         return (HeroCardData)this.surplusHeroCard_.get(index);
      }

      public HeroCardDataOrBuilder getSurplusHeroCardOrBuilder(int index) {
         return (HeroCardDataOrBuilder)this.surplusHeroCard_.get(index);
      }

      public boolean hasCurBoxLv() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCurBoxLv() {
         return this.curBoxLv_;
      }

      public boolean hasBoxNextLvTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getBoxNextLvTime() {
         return this.boxNextLvTime_;
      }

      public boolean hasDailyLotteryNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getDailyLotteryNum() {
         return this.dailyLotteryNum_;
      }

      public boolean hasLotteryCount() {
         return (this.bitField0_ & 8) != 0;
      }

      public long getLotteryCount() {
         return this.lotteryCount_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCurBoxLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDailyLotteryNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLotteryCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getPresentHeroCardCount(); ++i) {
               if (!this.getPresentHeroCard(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getSurplusHeroCardCount(); ++i) {
               if (!this.getSurplusHeroCard(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.presentHeroCard_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.presentHeroCard_.get(i));
         }

         for(int i = 0; i < this.surplusHeroCard_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.surplusHeroCard_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(3, this.curBoxLv_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(4, this.boxNextLvTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(5, this.dailyLotteryNum_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt64(6, this.lotteryCount_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.presentHeroCard_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.presentHeroCard_.get(i));
            }

            for(int i = 0; i < this.surplusHeroCard_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.surplusHeroCard_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.curBoxLv_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(4, this.boxNextLvTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.dailyLotteryNum_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt64Size(6, this.lotteryCount_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HeroCardInfo_28602)) {
            return super.equals(obj);
         } else {
            S2C_HeroCardInfo_28602 other = (S2C_HeroCardInfo_28602)obj;
            if (!this.getPresentHeroCardList().equals(other.getPresentHeroCardList())) {
               return false;
            } else if (!this.getSurplusHeroCardList().equals(other.getSurplusHeroCardList())) {
               return false;
            } else if (this.hasCurBoxLv() != other.hasCurBoxLv()) {
               return false;
            } else if (this.hasCurBoxLv() && this.getCurBoxLv() != other.getCurBoxLv()) {
               return false;
            } else if (this.hasBoxNextLvTime() != other.hasBoxNextLvTime()) {
               return false;
            } else if (this.hasBoxNextLvTime() && this.getBoxNextLvTime() != other.getBoxNextLvTime()) {
               return false;
            } else if (this.hasDailyLotteryNum() != other.hasDailyLotteryNum()) {
               return false;
            } else if (this.hasDailyLotteryNum() && this.getDailyLotteryNum() != other.getDailyLotteryNum()) {
               return false;
            } else if (this.hasLotteryCount() != other.hasLotteryCount()) {
               return false;
            } else if (this.hasLotteryCount() && this.getLotteryCount() != other.getLotteryCount()) {
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
            if (this.getPresentHeroCardCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPresentHeroCardList().hashCode();
            }

            if (this.getSurplusHeroCardCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSurplusHeroCardList().hashCode();
            }

            if (this.hasCurBoxLv()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getCurBoxLv();
            }

            if (this.hasBoxNextLvTime()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashLong(this.getBoxNextLvTime());
            }

            if (this.hasDailyLotteryNum()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getDailyLotteryNum();
            }

            if (this.hasLotteryCount()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashLong(this.getLotteryCount());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HeroCardInfo_28602 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HeroCardInfo_28602)PARSER.parseFrom(data);
      }

      public static S2C_HeroCardInfo_28602 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroCardInfo_28602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroCardInfo_28602 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HeroCardInfo_28602)PARSER.parseFrom(data);
      }

      public static S2C_HeroCardInfo_28602 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroCardInfo_28602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroCardInfo_28602 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HeroCardInfo_28602)PARSER.parseFrom(data);
      }

      public static S2C_HeroCardInfo_28602 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroCardInfo_28602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroCardInfo_28602 parseFrom(InputStream input) throws IOException {
         return (S2C_HeroCardInfo_28602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroCardInfo_28602 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroCardInfo_28602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroCardInfo_28602 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HeroCardInfo_28602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HeroCardInfo_28602 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroCardInfo_28602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroCardInfo_28602 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HeroCardInfo_28602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroCardInfo_28602 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroCardInfo_28602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HeroCardInfo_28602 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HeroCardInfo_28602 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HeroCardInfo_28602> parser() {
         return PARSER;
      }

      public Parser<S2C_HeroCardInfo_28602> getParserForType() {
         return PARSER;
      }

      public S2C_HeroCardInfo_28602 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HeroCardInfo_28602OrBuilder {
         private int bitField0_;
         private List<HeroCardData> presentHeroCard_;
         private RepeatedFieldBuilderV3<HeroCardData, HeroCardData.Builder, HeroCardDataOrBuilder> presentHeroCardBuilder_;
         private List<HeroCardData> surplusHeroCard_;
         private RepeatedFieldBuilderV3<HeroCardData, HeroCardData.Builder, HeroCardDataOrBuilder> surplusHeroCardBuilder_;
         private int curBoxLv_;
         private long boxNextLvTime_;
         private int dailyLotteryNum_;
         private long lotteryCount_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_HeroCardInfo_28602_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_HeroCardInfo_28602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroCardInfo_28602.class, Builder.class);
         }

         private Builder() {
            this.presentHeroCard_ = Collections.emptyList();
            this.surplusHeroCard_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.presentHeroCard_ = Collections.emptyList();
            this.surplusHeroCard_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.S2C_HeroCardInfo_28602.alwaysUseFieldBuilders) {
               this.getPresentHeroCardFieldBuilder();
               this.getSurplusHeroCardFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.presentHeroCardBuilder_ == null) {
               this.presentHeroCard_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.presentHeroCardBuilder_.clear();
            }

            if (this.surplusHeroCardBuilder_ == null) {
               this.surplusHeroCard_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.surplusHeroCardBuilder_.clear();
            }

            this.curBoxLv_ = 0;
            this.bitField0_ &= -5;
            this.boxNextLvTime_ = 0L;
            this.bitField0_ &= -9;
            this.dailyLotteryNum_ = 0;
            this.bitField0_ &= -17;
            this.lotteryCount_ = 0L;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_HeroCardInfo_28602_descriptor;
         }

         public S2C_HeroCardInfo_28602 getDefaultInstanceForType() {
            return HeroCardMsg.S2C_HeroCardInfo_28602.getDefaultInstance();
         }

         public S2C_HeroCardInfo_28602 build() {
            S2C_HeroCardInfo_28602 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HeroCardInfo_28602 buildPartial() {
            S2C_HeroCardInfo_28602 result = new S2C_HeroCardInfo_28602(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.presentHeroCardBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.presentHeroCard_ = Collections.unmodifiableList(this.presentHeroCard_);
                  this.bitField0_ &= -2;
               }

               result.presentHeroCard_ = this.presentHeroCard_;
            } else {
               result.presentHeroCard_ = this.presentHeroCardBuilder_.build();
            }

            if (this.surplusHeroCardBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.surplusHeroCard_ = Collections.unmodifiableList(this.surplusHeroCard_);
                  this.bitField0_ &= -3;
               }

               result.surplusHeroCard_ = this.surplusHeroCard_;
            } else {
               result.surplusHeroCard_ = this.surplusHeroCardBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.curBoxLv_ = this.curBoxLv_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.boxNextLvTime_ = this.boxNextLvTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.dailyLotteryNum_ = this.dailyLotteryNum_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.lotteryCount_ = this.lotteryCount_;
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
            if (other instanceof S2C_HeroCardInfo_28602) {
               return this.mergeFrom((S2C_HeroCardInfo_28602)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HeroCardInfo_28602 other) {
            if (other == HeroCardMsg.S2C_HeroCardInfo_28602.getDefaultInstance()) {
               return this;
            } else {
               if (this.presentHeroCardBuilder_ == null) {
                  if (!other.presentHeroCard_.isEmpty()) {
                     if (this.presentHeroCard_.isEmpty()) {
                        this.presentHeroCard_ = other.presentHeroCard_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensurePresentHeroCardIsMutable();
                        this.presentHeroCard_.addAll(other.presentHeroCard_);
                     }

                     this.onChanged();
                  }
               } else if (!other.presentHeroCard_.isEmpty()) {
                  if (this.presentHeroCardBuilder_.isEmpty()) {
                     this.presentHeroCardBuilder_.dispose();
                     this.presentHeroCardBuilder_ = null;
                     this.presentHeroCard_ = other.presentHeroCard_;
                     this.bitField0_ &= -2;
                     this.presentHeroCardBuilder_ = HeroCardMsg.S2C_HeroCardInfo_28602.alwaysUseFieldBuilders ? this.getPresentHeroCardFieldBuilder() : null;
                  } else {
                     this.presentHeroCardBuilder_.addAllMessages(other.presentHeroCard_);
                  }
               }

               if (this.surplusHeroCardBuilder_ == null) {
                  if (!other.surplusHeroCard_.isEmpty()) {
                     if (this.surplusHeroCard_.isEmpty()) {
                        this.surplusHeroCard_ = other.surplusHeroCard_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureSurplusHeroCardIsMutable();
                        this.surplusHeroCard_.addAll(other.surplusHeroCard_);
                     }

                     this.onChanged();
                  }
               } else if (!other.surplusHeroCard_.isEmpty()) {
                  if (this.surplusHeroCardBuilder_.isEmpty()) {
                     this.surplusHeroCardBuilder_.dispose();
                     this.surplusHeroCardBuilder_ = null;
                     this.surplusHeroCard_ = other.surplusHeroCard_;
                     this.bitField0_ &= -3;
                     this.surplusHeroCardBuilder_ = HeroCardMsg.S2C_HeroCardInfo_28602.alwaysUseFieldBuilders ? this.getSurplusHeroCardFieldBuilder() : null;
                  } else {
                     this.surplusHeroCardBuilder_.addAllMessages(other.surplusHeroCard_);
                  }
               }

               if (other.hasCurBoxLv()) {
                  this.setCurBoxLv(other.getCurBoxLv());
               }

               if (other.hasBoxNextLvTime()) {
                  this.setBoxNextLvTime(other.getBoxNextLvTime());
               }

               if (other.hasDailyLotteryNum()) {
                  this.setDailyLotteryNum(other.getDailyLotteryNum());
               }

               if (other.hasLotteryCount()) {
                  this.setLotteryCount(other.getLotteryCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCurBoxLv()) {
               return false;
            } else if (!this.hasDailyLotteryNum()) {
               return false;
            } else if (!this.hasLotteryCount()) {
               return false;
            } else {
               for(int i = 0; i < this.getPresentHeroCardCount(); ++i) {
                  if (!this.getPresentHeroCard(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getSurplusHeroCardCount(); ++i) {
                  if (!this.getSurplusHeroCard(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_HeroCardInfo_28602 parsedMessage = null;

            try {
               parsedMessage = (S2C_HeroCardInfo_28602)HeroCardMsg.S2C_HeroCardInfo_28602.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HeroCardInfo_28602)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensurePresentHeroCardIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.presentHeroCard_ = new ArrayList(this.presentHeroCard_);
               this.bitField0_ |= 1;
            }

         }

         public List<HeroCardData> getPresentHeroCardList() {
            return this.presentHeroCardBuilder_ == null ? Collections.unmodifiableList(this.presentHeroCard_) : this.presentHeroCardBuilder_.getMessageList();
         }

         public int getPresentHeroCardCount() {
            return this.presentHeroCardBuilder_ == null ? this.presentHeroCard_.size() : this.presentHeroCardBuilder_.getCount();
         }

         public HeroCardData getPresentHeroCard(int index) {
            return this.presentHeroCardBuilder_ == null ? (HeroCardData)this.presentHeroCard_.get(index) : (HeroCardData)this.presentHeroCardBuilder_.getMessage(index);
         }

         public Builder setPresentHeroCard(int index, HeroCardData value) {
            if (this.presentHeroCardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.set(index, value);
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPresentHeroCard(int index, HeroCardData.Builder builderForValue) {
            if (this.presentHeroCardBuilder_ == null) {
               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPresentHeroCard(HeroCardData value) {
            if (this.presentHeroCardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.add(value);
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPresentHeroCard(int index, HeroCardData value) {
            if (this.presentHeroCardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.add(index, value);
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPresentHeroCard(HeroCardData.Builder builderForValue) {
            if (this.presentHeroCardBuilder_ == null) {
               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPresentHeroCard(int index, HeroCardData.Builder builderForValue) {
            if (this.presentHeroCardBuilder_ == null) {
               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPresentHeroCard(Iterable<? extends HeroCardData> values) {
            if (this.presentHeroCardBuilder_ == null) {
               this.ensurePresentHeroCardIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.presentHeroCard_);
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPresentHeroCard() {
            if (this.presentHeroCardBuilder_ == null) {
               this.presentHeroCard_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.clear();
            }

            return this;
         }

         public Builder removePresentHeroCard(int index) {
            if (this.presentHeroCardBuilder_ == null) {
               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.remove(index);
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.remove(index);
            }

            return this;
         }

         public HeroCardData.Builder getPresentHeroCardBuilder(int index) {
            return (HeroCardData.Builder)this.getPresentHeroCardFieldBuilder().getBuilder(index);
         }

         public HeroCardDataOrBuilder getPresentHeroCardOrBuilder(int index) {
            return this.presentHeroCardBuilder_ == null ? (HeroCardDataOrBuilder)this.presentHeroCard_.get(index) : (HeroCardDataOrBuilder)this.presentHeroCardBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HeroCardDataOrBuilder> getPresentHeroCardOrBuilderList() {
            return this.presentHeroCardBuilder_ != null ? this.presentHeroCardBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.presentHeroCard_);
         }

         public HeroCardData.Builder addPresentHeroCardBuilder() {
            return (HeroCardData.Builder)this.getPresentHeroCardFieldBuilder().addBuilder(HeroCardMsg.HeroCardData.getDefaultInstance());
         }

         public HeroCardData.Builder addPresentHeroCardBuilder(int index) {
            return (HeroCardData.Builder)this.getPresentHeroCardFieldBuilder().addBuilder(index, HeroCardMsg.HeroCardData.getDefaultInstance());
         }

         public List<HeroCardData.Builder> getPresentHeroCardBuilderList() {
            return this.getPresentHeroCardFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HeroCardData, HeroCardData.Builder, HeroCardDataOrBuilder> getPresentHeroCardFieldBuilder() {
            if (this.presentHeroCardBuilder_ == null) {
               this.presentHeroCardBuilder_ = new RepeatedFieldBuilderV3(this.presentHeroCard_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.presentHeroCard_ = null;
            }

            return this.presentHeroCardBuilder_;
         }

         private void ensureSurplusHeroCardIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.surplusHeroCard_ = new ArrayList(this.surplusHeroCard_);
               this.bitField0_ |= 2;
            }

         }

         public List<HeroCardData> getSurplusHeroCardList() {
            return this.surplusHeroCardBuilder_ == null ? Collections.unmodifiableList(this.surplusHeroCard_) : this.surplusHeroCardBuilder_.getMessageList();
         }

         public int getSurplusHeroCardCount() {
            return this.surplusHeroCardBuilder_ == null ? this.surplusHeroCard_.size() : this.surplusHeroCardBuilder_.getCount();
         }

         public HeroCardData getSurplusHeroCard(int index) {
            return this.surplusHeroCardBuilder_ == null ? (HeroCardData)this.surplusHeroCard_.get(index) : (HeroCardData)this.surplusHeroCardBuilder_.getMessage(index);
         }

         public Builder setSurplusHeroCard(int index, HeroCardData value) {
            if (this.surplusHeroCardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSurplusHeroCardIsMutable();
               this.surplusHeroCard_.set(index, value);
               this.onChanged();
            } else {
               this.surplusHeroCardBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setSurplusHeroCard(int index, HeroCardData.Builder builderForValue) {
            if (this.surplusHeroCardBuilder_ == null) {
               this.ensureSurplusHeroCardIsMutable();
               this.surplusHeroCard_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.surplusHeroCardBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addSurplusHeroCard(HeroCardData value) {
            if (this.surplusHeroCardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSurplusHeroCardIsMutable();
               this.surplusHeroCard_.add(value);
               this.onChanged();
            } else {
               this.surplusHeroCardBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addSurplusHeroCard(int index, HeroCardData value) {
            if (this.surplusHeroCardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSurplusHeroCardIsMutable();
               this.surplusHeroCard_.add(index, value);
               this.onChanged();
            } else {
               this.surplusHeroCardBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addSurplusHeroCard(HeroCardData.Builder builderForValue) {
            if (this.surplusHeroCardBuilder_ == null) {
               this.ensureSurplusHeroCardIsMutable();
               this.surplusHeroCard_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.surplusHeroCardBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addSurplusHeroCard(int index, HeroCardData.Builder builderForValue) {
            if (this.surplusHeroCardBuilder_ == null) {
               this.ensureSurplusHeroCardIsMutable();
               this.surplusHeroCard_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.surplusHeroCardBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllSurplusHeroCard(Iterable<? extends HeroCardData> values) {
            if (this.surplusHeroCardBuilder_ == null) {
               this.ensureSurplusHeroCardIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.surplusHeroCard_);
               this.onChanged();
            } else {
               this.surplusHeroCardBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearSurplusHeroCard() {
            if (this.surplusHeroCardBuilder_ == null) {
               this.surplusHeroCard_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.surplusHeroCardBuilder_.clear();
            }

            return this;
         }

         public Builder removeSurplusHeroCard(int index) {
            if (this.surplusHeroCardBuilder_ == null) {
               this.ensureSurplusHeroCardIsMutable();
               this.surplusHeroCard_.remove(index);
               this.onChanged();
            } else {
               this.surplusHeroCardBuilder_.remove(index);
            }

            return this;
         }

         public HeroCardData.Builder getSurplusHeroCardBuilder(int index) {
            return (HeroCardData.Builder)this.getSurplusHeroCardFieldBuilder().getBuilder(index);
         }

         public HeroCardDataOrBuilder getSurplusHeroCardOrBuilder(int index) {
            return this.surplusHeroCardBuilder_ == null ? (HeroCardDataOrBuilder)this.surplusHeroCard_.get(index) : (HeroCardDataOrBuilder)this.surplusHeroCardBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HeroCardDataOrBuilder> getSurplusHeroCardOrBuilderList() {
            return this.surplusHeroCardBuilder_ != null ? this.surplusHeroCardBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.surplusHeroCard_);
         }

         public HeroCardData.Builder addSurplusHeroCardBuilder() {
            return (HeroCardData.Builder)this.getSurplusHeroCardFieldBuilder().addBuilder(HeroCardMsg.HeroCardData.getDefaultInstance());
         }

         public HeroCardData.Builder addSurplusHeroCardBuilder(int index) {
            return (HeroCardData.Builder)this.getSurplusHeroCardFieldBuilder().addBuilder(index, HeroCardMsg.HeroCardData.getDefaultInstance());
         }

         public List<HeroCardData.Builder> getSurplusHeroCardBuilderList() {
            return this.getSurplusHeroCardFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HeroCardData, HeroCardData.Builder, HeroCardDataOrBuilder> getSurplusHeroCardFieldBuilder() {
            if (this.surplusHeroCardBuilder_ == null) {
               this.surplusHeroCardBuilder_ = new RepeatedFieldBuilderV3(this.surplusHeroCard_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.surplusHeroCard_ = null;
            }

            return this.surplusHeroCardBuilder_;
         }

         public boolean hasCurBoxLv() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getCurBoxLv() {
            return this.curBoxLv_;
         }

         public Builder setCurBoxLv(int value) {
            this.bitField0_ |= 4;
            this.curBoxLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCurBoxLv() {
            this.bitField0_ &= -5;
            this.curBoxLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBoxNextLvTime() {
            return (this.bitField0_ & 8) != 0;
         }

         public long getBoxNextLvTime() {
            return this.boxNextLvTime_;
         }

         public Builder setBoxNextLvTime(long value) {
            this.bitField0_ |= 8;
            this.boxNextLvTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBoxNextLvTime() {
            this.bitField0_ &= -9;
            this.boxNextLvTime_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasDailyLotteryNum() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getDailyLotteryNum() {
            return this.dailyLotteryNum_;
         }

         public Builder setDailyLotteryNum(int value) {
            this.bitField0_ |= 16;
            this.dailyLotteryNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailyLotteryNum() {
            this.bitField0_ &= -17;
            this.dailyLotteryNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLotteryCount() {
            return (this.bitField0_ & 32) != 0;
         }

         public long getLotteryCount() {
            return this.lotteryCount_;
         }

         public Builder setLotteryCount(long value) {
            this.bitField0_ |= 32;
            this.lotteryCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLotteryCount() {
            this.bitField0_ &= -33;
            this.lotteryCount_ = 0L;
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

   public static final class C2S_HeroCardLottery_28603 extends GeneratedMessageV3 implements C2S_HeroCardLottery_28603OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NUM_FIELD_NUMBER = 1;
      private int num_;
      public static final int CURMAINTASKID_FIELD_NUMBER = 2;
      private int curMainTaskId_;
      private byte memoizedIsInitialized;
      private static final C2S_HeroCardLottery_28603 DEFAULT_INSTANCE = new C2S_HeroCardLottery_28603();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HeroCardLottery_28603> PARSER = new AbstractParser<C2S_HeroCardLottery_28603>() {
         public C2S_HeroCardLottery_28603 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HeroCardLottery_28603(input, extensionRegistry);
         }
      };

      private C2S_HeroCardLottery_28603(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HeroCardLottery_28603() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HeroCardLottery_28603();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HeroCardLottery_28603(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.curMainTaskId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_HeroCardLottery_28603_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_HeroCardLottery_28603_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroCardLottery_28603.class, Builder.class);
      }

      public boolean hasNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getNum() {
         return this.num_;
      }

      public boolean hasCurMainTaskId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCurMainTaskId() {
         return this.curMainTaskId_;
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
         } else if (!this.hasCurMainTaskId()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.curMainTaskId_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.curMainTaskId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_HeroCardLottery_28603)) {
            return super.equals(obj);
         } else {
            C2S_HeroCardLottery_28603 other = (C2S_HeroCardLottery_28603)obj;
            if (this.hasNum() != other.hasNum()) {
               return false;
            } else if (this.hasNum() && this.getNum() != other.getNum()) {
               return false;
            } else if (this.hasCurMainTaskId() != other.hasCurMainTaskId()) {
               return false;
            } else if (this.hasCurMainTaskId() && this.getCurMainTaskId() != other.getCurMainTaskId()) {
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

            if (this.hasCurMainTaskId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCurMainTaskId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_HeroCardLottery_28603 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HeroCardLottery_28603)PARSER.parseFrom(data);
      }

      public static C2S_HeroCardLottery_28603 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroCardLottery_28603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroCardLottery_28603 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HeroCardLottery_28603)PARSER.parseFrom(data);
      }

      public static C2S_HeroCardLottery_28603 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroCardLottery_28603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroCardLottery_28603 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HeroCardLottery_28603)PARSER.parseFrom(data);
      }

      public static C2S_HeroCardLottery_28603 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroCardLottery_28603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroCardLottery_28603 parseFrom(InputStream input) throws IOException {
         return (C2S_HeroCardLottery_28603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroCardLottery_28603 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroCardLottery_28603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroCardLottery_28603 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HeroCardLottery_28603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HeroCardLottery_28603 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroCardLottery_28603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroCardLottery_28603 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HeroCardLottery_28603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroCardLottery_28603 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroCardLottery_28603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HeroCardLottery_28603 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HeroCardLottery_28603 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HeroCardLottery_28603> parser() {
         return PARSER;
      }

      public Parser<C2S_HeroCardLottery_28603> getParserForType() {
         return PARSER;
      }

      public C2S_HeroCardLottery_28603 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HeroCardLottery_28603OrBuilder {
         private int bitField0_;
         private int num_;
         private int curMainTaskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_HeroCardLottery_28603_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_HeroCardLottery_28603_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroCardLottery_28603.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.C2S_HeroCardLottery_28603.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.num_ = 0;
            this.bitField0_ &= -2;
            this.curMainTaskId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_HeroCardLottery_28603_descriptor;
         }

         public C2S_HeroCardLottery_28603 getDefaultInstanceForType() {
            return HeroCardMsg.C2S_HeroCardLottery_28603.getDefaultInstance();
         }

         public C2S_HeroCardLottery_28603 build() {
            C2S_HeroCardLottery_28603 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HeroCardLottery_28603 buildPartial() {
            C2S_HeroCardLottery_28603 result = new C2S_HeroCardLottery_28603(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.num_ = this.num_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.curMainTaskId_ = this.curMainTaskId_;
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
            if (other instanceof C2S_HeroCardLottery_28603) {
               return this.mergeFrom((C2S_HeroCardLottery_28603)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HeroCardLottery_28603 other) {
            if (other == HeroCardMsg.C2S_HeroCardLottery_28603.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               if (other.hasCurMainTaskId()) {
                  this.setCurMainTaskId(other.getCurMainTaskId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasNum()) {
               return false;
            } else {
               return this.hasCurMainTaskId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_HeroCardLottery_28603 parsedMessage = null;

            try {
               parsedMessage = (C2S_HeroCardLottery_28603)HeroCardMsg.C2S_HeroCardLottery_28603.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HeroCardLottery_28603)e.getUnfinishedMessage();
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

         public boolean hasCurMainTaskId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCurMainTaskId() {
            return this.curMainTaskId_;
         }

         public Builder setCurMainTaskId(int value) {
            this.bitField0_ |= 2;
            this.curMainTaskId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCurMainTaskId() {
            this.bitField0_ &= -3;
            this.curMainTaskId_ = 0;
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

   public static final class S2C_HeroCardLottery_28604 extends GeneratedMessageV3 implements S2C_HeroCardLottery_28604OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCARD_FIELD_NUMBER = 1;
      private List<HeroCardData> heroCard_;
      public static final int RESOLVECARD_FIELD_NUMBER = 2;
      private List<HeroCardData> resolveCard_;
      public static final int DAILYLOTTERYNUM_FIELD_NUMBER = 3;
      private int dailyLotteryNum_;
      public static final int RESULT_FIELD_NUMBER = 4;
      private int result_;
      public static final int LOTTERYCOUNT_FIELD_NUMBER = 5;
      private long lotteryCount_;
      public static final int ISBACKAUTO_FIELD_NUMBER = 6;
      private boolean isBackAuto_;
      private byte memoizedIsInitialized;
      private static final S2C_HeroCardLottery_28604 DEFAULT_INSTANCE = new S2C_HeroCardLottery_28604();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HeroCardLottery_28604> PARSER = new AbstractParser<S2C_HeroCardLottery_28604>() {
         public S2C_HeroCardLottery_28604 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HeroCardLottery_28604(input, extensionRegistry);
         }
      };

      private S2C_HeroCardLottery_28604(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HeroCardLottery_28604() {
         this.memoizedIsInitialized = -1;
         this.heroCard_ = Collections.emptyList();
         this.resolveCard_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HeroCardLottery_28604();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HeroCardLottery_28604(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.heroCard_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.heroCard_.add(input.readMessage(HeroCardMsg.HeroCardData.PARSER, extensionRegistry));
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.resolveCard_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.resolveCard_.add(input.readMessage(HeroCardMsg.HeroCardData.PARSER, extensionRegistry));
                        break;
                     case 24:
                        this.bitField0_ |= 1;
                        this.dailyLotteryNum_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 2;
                        this.result_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 4;
                        this.lotteryCount_ = input.readInt64();
                        break;
                     case 48:
                        this.bitField0_ |= 8;
                        this.isBackAuto_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.heroCard_ = Collections.unmodifiableList(this.heroCard_);
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.resolveCard_ = Collections.unmodifiableList(this.resolveCard_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_HeroCardLottery_28604_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_HeroCardLottery_28604_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroCardLottery_28604.class, Builder.class);
      }

      public List<HeroCardData> getHeroCardList() {
         return this.heroCard_;
      }

      public List<? extends HeroCardDataOrBuilder> getHeroCardOrBuilderList() {
         return this.heroCard_;
      }

      public int getHeroCardCount() {
         return this.heroCard_.size();
      }

      public HeroCardData getHeroCard(int index) {
         return (HeroCardData)this.heroCard_.get(index);
      }

      public HeroCardDataOrBuilder getHeroCardOrBuilder(int index) {
         return (HeroCardDataOrBuilder)this.heroCard_.get(index);
      }

      public List<HeroCardData> getResolveCardList() {
         return this.resolveCard_;
      }

      public List<? extends HeroCardDataOrBuilder> getResolveCardOrBuilderList() {
         return this.resolveCard_;
      }

      public int getResolveCardCount() {
         return this.resolveCard_.size();
      }

      public HeroCardData getResolveCard(int index) {
         return (HeroCardData)this.resolveCard_.get(index);
      }

      public HeroCardDataOrBuilder getResolveCardOrBuilder(int index) {
         return (HeroCardDataOrBuilder)this.resolveCard_.get(index);
      }

      public boolean hasDailyLotteryNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDailyLotteryNum() {
         return this.dailyLotteryNum_;
      }

      public boolean hasResult() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasLotteryCount() {
         return (this.bitField0_ & 4) != 0;
      }

      public long getLotteryCount() {
         return this.lotteryCount_;
      }

      public boolean hasIsBackAuto() {
         return (this.bitField0_ & 8) != 0;
      }

      public boolean getIsBackAuto() {
         return this.isBackAuto_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDailyLotteryNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLotteryCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsBackAuto()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getHeroCardCount(); ++i) {
               if (!this.getHeroCard(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getResolveCardCount(); ++i) {
               if (!this.getResolveCard(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.heroCard_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.heroCard_.get(i));
         }

         for(int i = 0; i < this.resolveCard_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.resolveCard_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(3, this.dailyLotteryNum_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(4, this.result_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt64(5, this.lotteryCount_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeBool(6, this.isBackAuto_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.heroCard_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.heroCard_.get(i));
            }

            for(int i = 0; i < this.resolveCard_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.resolveCard_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.dailyLotteryNum_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.result_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt64Size(5, this.lotteryCount_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeBoolSize(6, this.isBackAuto_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HeroCardLottery_28604)) {
            return super.equals(obj);
         } else {
            S2C_HeroCardLottery_28604 other = (S2C_HeroCardLottery_28604)obj;
            if (!this.getHeroCardList().equals(other.getHeroCardList())) {
               return false;
            } else if (!this.getResolveCardList().equals(other.getResolveCardList())) {
               return false;
            } else if (this.hasDailyLotteryNum() != other.hasDailyLotteryNum()) {
               return false;
            } else if (this.hasDailyLotteryNum() && this.getDailyLotteryNum() != other.getDailyLotteryNum()) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasLotteryCount() != other.hasLotteryCount()) {
               return false;
            } else if (this.hasLotteryCount() && this.getLotteryCount() != other.getLotteryCount()) {
               return false;
            } else if (this.hasIsBackAuto() != other.hasIsBackAuto()) {
               return false;
            } else if (this.hasIsBackAuto() && this.getIsBackAuto() != other.getIsBackAuto()) {
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
            if (this.getHeroCardCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCardList().hashCode();
            }

            if (this.getResolveCardCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getResolveCardList().hashCode();
            }

            if (this.hasDailyLotteryNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getDailyLotteryNum();
            }

            if (this.hasResult()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasLotteryCount()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashLong(this.getLotteryCount());
            }

            if (this.hasIsBackAuto()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashBoolean(this.getIsBackAuto());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HeroCardLottery_28604 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HeroCardLottery_28604)PARSER.parseFrom(data);
      }

      public static S2C_HeroCardLottery_28604 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroCardLottery_28604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroCardLottery_28604 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HeroCardLottery_28604)PARSER.parseFrom(data);
      }

      public static S2C_HeroCardLottery_28604 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroCardLottery_28604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroCardLottery_28604 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HeroCardLottery_28604)PARSER.parseFrom(data);
      }

      public static S2C_HeroCardLottery_28604 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroCardLottery_28604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroCardLottery_28604 parseFrom(InputStream input) throws IOException {
         return (S2C_HeroCardLottery_28604)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroCardLottery_28604 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroCardLottery_28604)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroCardLottery_28604 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HeroCardLottery_28604)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HeroCardLottery_28604 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroCardLottery_28604)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroCardLottery_28604 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HeroCardLottery_28604)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroCardLottery_28604 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroCardLottery_28604)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HeroCardLottery_28604 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HeroCardLottery_28604 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HeroCardLottery_28604> parser() {
         return PARSER;
      }

      public Parser<S2C_HeroCardLottery_28604> getParserForType() {
         return PARSER;
      }

      public S2C_HeroCardLottery_28604 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HeroCardLottery_28604OrBuilder {
         private int bitField0_;
         private List<HeroCardData> heroCard_;
         private RepeatedFieldBuilderV3<HeroCardData, HeroCardData.Builder, HeroCardDataOrBuilder> heroCardBuilder_;
         private List<HeroCardData> resolveCard_;
         private RepeatedFieldBuilderV3<HeroCardData, HeroCardData.Builder, HeroCardDataOrBuilder> resolveCardBuilder_;
         private int dailyLotteryNum_;
         private int result_;
         private long lotteryCount_;
         private boolean isBackAuto_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_HeroCardLottery_28604_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_HeroCardLottery_28604_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroCardLottery_28604.class, Builder.class);
         }

         private Builder() {
            this.heroCard_ = Collections.emptyList();
            this.resolveCard_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.heroCard_ = Collections.emptyList();
            this.resolveCard_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.S2C_HeroCardLottery_28604.alwaysUseFieldBuilders) {
               this.getHeroCardFieldBuilder();
               this.getResolveCardFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.heroCardBuilder_ == null) {
               this.heroCard_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.heroCardBuilder_.clear();
            }

            if (this.resolveCardBuilder_ == null) {
               this.resolveCard_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.resolveCardBuilder_.clear();
            }

            this.dailyLotteryNum_ = 0;
            this.bitField0_ &= -5;
            this.result_ = 0;
            this.bitField0_ &= -9;
            this.lotteryCount_ = 0L;
            this.bitField0_ &= -17;
            this.isBackAuto_ = false;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_HeroCardLottery_28604_descriptor;
         }

         public S2C_HeroCardLottery_28604 getDefaultInstanceForType() {
            return HeroCardMsg.S2C_HeroCardLottery_28604.getDefaultInstance();
         }

         public S2C_HeroCardLottery_28604 build() {
            S2C_HeroCardLottery_28604 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HeroCardLottery_28604 buildPartial() {
            S2C_HeroCardLottery_28604 result = new S2C_HeroCardLottery_28604(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.heroCardBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.heroCard_ = Collections.unmodifiableList(this.heroCard_);
                  this.bitField0_ &= -2;
               }

               result.heroCard_ = this.heroCard_;
            } else {
               result.heroCard_ = this.heroCardBuilder_.build();
            }

            if (this.resolveCardBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.resolveCard_ = Collections.unmodifiableList(this.resolveCard_);
                  this.bitField0_ &= -3;
               }

               result.resolveCard_ = this.resolveCard_;
            } else {
               result.resolveCard_ = this.resolveCardBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.dailyLotteryNum_ = this.dailyLotteryNum_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.lotteryCount_ = this.lotteryCount_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.isBackAuto_ = this.isBackAuto_;
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
            if (other instanceof S2C_HeroCardLottery_28604) {
               return this.mergeFrom((S2C_HeroCardLottery_28604)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HeroCardLottery_28604 other) {
            if (other == HeroCardMsg.S2C_HeroCardLottery_28604.getDefaultInstance()) {
               return this;
            } else {
               if (this.heroCardBuilder_ == null) {
                  if (!other.heroCard_.isEmpty()) {
                     if (this.heroCard_.isEmpty()) {
                        this.heroCard_ = other.heroCard_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureHeroCardIsMutable();
                        this.heroCard_.addAll(other.heroCard_);
                     }

                     this.onChanged();
                  }
               } else if (!other.heroCard_.isEmpty()) {
                  if (this.heroCardBuilder_.isEmpty()) {
                     this.heroCardBuilder_.dispose();
                     this.heroCardBuilder_ = null;
                     this.heroCard_ = other.heroCard_;
                     this.bitField0_ &= -2;
                     this.heroCardBuilder_ = HeroCardMsg.S2C_HeroCardLottery_28604.alwaysUseFieldBuilders ? this.getHeroCardFieldBuilder() : null;
                  } else {
                     this.heroCardBuilder_.addAllMessages(other.heroCard_);
                  }
               }

               if (this.resolveCardBuilder_ == null) {
                  if (!other.resolveCard_.isEmpty()) {
                     if (this.resolveCard_.isEmpty()) {
                        this.resolveCard_ = other.resolveCard_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureResolveCardIsMutable();
                        this.resolveCard_.addAll(other.resolveCard_);
                     }

                     this.onChanged();
                  }
               } else if (!other.resolveCard_.isEmpty()) {
                  if (this.resolveCardBuilder_.isEmpty()) {
                     this.resolveCardBuilder_.dispose();
                     this.resolveCardBuilder_ = null;
                     this.resolveCard_ = other.resolveCard_;
                     this.bitField0_ &= -3;
                     this.resolveCardBuilder_ = HeroCardMsg.S2C_HeroCardLottery_28604.alwaysUseFieldBuilders ? this.getResolveCardFieldBuilder() : null;
                  } else {
                     this.resolveCardBuilder_.addAllMessages(other.resolveCard_);
                  }
               }

               if (other.hasDailyLotteryNum()) {
                  this.setDailyLotteryNum(other.getDailyLotteryNum());
               }

               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasLotteryCount()) {
                  this.setLotteryCount(other.getLotteryCount());
               }

               if (other.hasIsBackAuto()) {
                  this.setIsBackAuto(other.getIsBackAuto());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDailyLotteryNum()) {
               return false;
            } else if (!this.hasResult()) {
               return false;
            } else if (!this.hasLotteryCount()) {
               return false;
            } else if (!this.hasIsBackAuto()) {
               return false;
            } else {
               for(int i = 0; i < this.getHeroCardCount(); ++i) {
                  if (!this.getHeroCard(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getResolveCardCount(); ++i) {
                  if (!this.getResolveCard(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_HeroCardLottery_28604 parsedMessage = null;

            try {
               parsedMessage = (S2C_HeroCardLottery_28604)HeroCardMsg.S2C_HeroCardLottery_28604.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HeroCardLottery_28604)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureHeroCardIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.heroCard_ = new ArrayList(this.heroCard_);
               this.bitField0_ |= 1;
            }

         }

         public List<HeroCardData> getHeroCardList() {
            return this.heroCardBuilder_ == null ? Collections.unmodifiableList(this.heroCard_) : this.heroCardBuilder_.getMessageList();
         }

         public int getHeroCardCount() {
            return this.heroCardBuilder_ == null ? this.heroCard_.size() : this.heroCardBuilder_.getCount();
         }

         public HeroCardData getHeroCard(int index) {
            return this.heroCardBuilder_ == null ? (HeroCardData)this.heroCard_.get(index) : (HeroCardData)this.heroCardBuilder_.getMessage(index);
         }

         public Builder setHeroCard(int index, HeroCardData value) {
            if (this.heroCardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroCardIsMutable();
               this.heroCard_.set(index, value);
               this.onChanged();
            } else {
               this.heroCardBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setHeroCard(int index, HeroCardData.Builder builderForValue) {
            if (this.heroCardBuilder_ == null) {
               this.ensureHeroCardIsMutable();
               this.heroCard_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroCardBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addHeroCard(HeroCardData value) {
            if (this.heroCardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroCardIsMutable();
               this.heroCard_.add(value);
               this.onChanged();
            } else {
               this.heroCardBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addHeroCard(int index, HeroCardData value) {
            if (this.heroCardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroCardIsMutable();
               this.heroCard_.add(index, value);
               this.onChanged();
            } else {
               this.heroCardBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addHeroCard(HeroCardData.Builder builderForValue) {
            if (this.heroCardBuilder_ == null) {
               this.ensureHeroCardIsMutable();
               this.heroCard_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.heroCardBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addHeroCard(int index, HeroCardData.Builder builderForValue) {
            if (this.heroCardBuilder_ == null) {
               this.ensureHeroCardIsMutable();
               this.heroCard_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroCardBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllHeroCard(Iterable<? extends HeroCardData> values) {
            if (this.heroCardBuilder_ == null) {
               this.ensureHeroCardIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.heroCard_);
               this.onChanged();
            } else {
               this.heroCardBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearHeroCard() {
            if (this.heroCardBuilder_ == null) {
               this.heroCard_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.heroCardBuilder_.clear();
            }

            return this;
         }

         public Builder removeHeroCard(int index) {
            if (this.heroCardBuilder_ == null) {
               this.ensureHeroCardIsMutable();
               this.heroCard_.remove(index);
               this.onChanged();
            } else {
               this.heroCardBuilder_.remove(index);
            }

            return this;
         }

         public HeroCardData.Builder getHeroCardBuilder(int index) {
            return (HeroCardData.Builder)this.getHeroCardFieldBuilder().getBuilder(index);
         }

         public HeroCardDataOrBuilder getHeroCardOrBuilder(int index) {
            return this.heroCardBuilder_ == null ? (HeroCardDataOrBuilder)this.heroCard_.get(index) : (HeroCardDataOrBuilder)this.heroCardBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HeroCardDataOrBuilder> getHeroCardOrBuilderList() {
            return this.heroCardBuilder_ != null ? this.heroCardBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.heroCard_);
         }

         public HeroCardData.Builder addHeroCardBuilder() {
            return (HeroCardData.Builder)this.getHeroCardFieldBuilder().addBuilder(HeroCardMsg.HeroCardData.getDefaultInstance());
         }

         public HeroCardData.Builder addHeroCardBuilder(int index) {
            return (HeroCardData.Builder)this.getHeroCardFieldBuilder().addBuilder(index, HeroCardMsg.HeroCardData.getDefaultInstance());
         }

         public List<HeroCardData.Builder> getHeroCardBuilderList() {
            return this.getHeroCardFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HeroCardData, HeroCardData.Builder, HeroCardDataOrBuilder> getHeroCardFieldBuilder() {
            if (this.heroCardBuilder_ == null) {
               this.heroCardBuilder_ = new RepeatedFieldBuilderV3(this.heroCard_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.heroCard_ = null;
            }

            return this.heroCardBuilder_;
         }

         private void ensureResolveCardIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.resolveCard_ = new ArrayList(this.resolveCard_);
               this.bitField0_ |= 2;
            }

         }

         public List<HeroCardData> getResolveCardList() {
            return this.resolveCardBuilder_ == null ? Collections.unmodifiableList(this.resolveCard_) : this.resolveCardBuilder_.getMessageList();
         }

         public int getResolveCardCount() {
            return this.resolveCardBuilder_ == null ? this.resolveCard_.size() : this.resolveCardBuilder_.getCount();
         }

         public HeroCardData getResolveCard(int index) {
            return this.resolveCardBuilder_ == null ? (HeroCardData)this.resolveCard_.get(index) : (HeroCardData)this.resolveCardBuilder_.getMessage(index);
         }

         public Builder setResolveCard(int index, HeroCardData value) {
            if (this.resolveCardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureResolveCardIsMutable();
               this.resolveCard_.set(index, value);
               this.onChanged();
            } else {
               this.resolveCardBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setResolveCard(int index, HeroCardData.Builder builderForValue) {
            if (this.resolveCardBuilder_ == null) {
               this.ensureResolveCardIsMutable();
               this.resolveCard_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.resolveCardBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addResolveCard(HeroCardData value) {
            if (this.resolveCardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureResolveCardIsMutable();
               this.resolveCard_.add(value);
               this.onChanged();
            } else {
               this.resolveCardBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addResolveCard(int index, HeroCardData value) {
            if (this.resolveCardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureResolveCardIsMutable();
               this.resolveCard_.add(index, value);
               this.onChanged();
            } else {
               this.resolveCardBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addResolveCard(HeroCardData.Builder builderForValue) {
            if (this.resolveCardBuilder_ == null) {
               this.ensureResolveCardIsMutable();
               this.resolveCard_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.resolveCardBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addResolveCard(int index, HeroCardData.Builder builderForValue) {
            if (this.resolveCardBuilder_ == null) {
               this.ensureResolveCardIsMutable();
               this.resolveCard_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.resolveCardBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllResolveCard(Iterable<? extends HeroCardData> values) {
            if (this.resolveCardBuilder_ == null) {
               this.ensureResolveCardIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.resolveCard_);
               this.onChanged();
            } else {
               this.resolveCardBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearResolveCard() {
            if (this.resolveCardBuilder_ == null) {
               this.resolveCard_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.resolveCardBuilder_.clear();
            }

            return this;
         }

         public Builder removeResolveCard(int index) {
            if (this.resolveCardBuilder_ == null) {
               this.ensureResolveCardIsMutable();
               this.resolveCard_.remove(index);
               this.onChanged();
            } else {
               this.resolveCardBuilder_.remove(index);
            }

            return this;
         }

         public HeroCardData.Builder getResolveCardBuilder(int index) {
            return (HeroCardData.Builder)this.getResolveCardFieldBuilder().getBuilder(index);
         }

         public HeroCardDataOrBuilder getResolveCardOrBuilder(int index) {
            return this.resolveCardBuilder_ == null ? (HeroCardDataOrBuilder)this.resolveCard_.get(index) : (HeroCardDataOrBuilder)this.resolveCardBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HeroCardDataOrBuilder> getResolveCardOrBuilderList() {
            return this.resolveCardBuilder_ != null ? this.resolveCardBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.resolveCard_);
         }

         public HeroCardData.Builder addResolveCardBuilder() {
            return (HeroCardData.Builder)this.getResolveCardFieldBuilder().addBuilder(HeroCardMsg.HeroCardData.getDefaultInstance());
         }

         public HeroCardData.Builder addResolveCardBuilder(int index) {
            return (HeroCardData.Builder)this.getResolveCardFieldBuilder().addBuilder(index, HeroCardMsg.HeroCardData.getDefaultInstance());
         }

         public List<HeroCardData.Builder> getResolveCardBuilderList() {
            return this.getResolveCardFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HeroCardData, HeroCardData.Builder, HeroCardDataOrBuilder> getResolveCardFieldBuilder() {
            if (this.resolveCardBuilder_ == null) {
               this.resolveCardBuilder_ = new RepeatedFieldBuilderV3(this.resolveCard_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.resolveCard_ = null;
            }

            return this.resolveCardBuilder_;
         }

         public boolean hasDailyLotteryNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getDailyLotteryNum() {
            return this.dailyLotteryNum_;
         }

         public Builder setDailyLotteryNum(int value) {
            this.bitField0_ |= 4;
            this.dailyLotteryNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailyLotteryNum() {
            this.bitField0_ &= -5;
            this.dailyLotteryNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getResult() {
            return this.result_;
         }

         public Builder setResult(int value) {
            this.bitField0_ |= 8;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -9;
            this.result_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLotteryCount() {
            return (this.bitField0_ & 16) != 0;
         }

         public long getLotteryCount() {
            return this.lotteryCount_;
         }

         public Builder setLotteryCount(long value) {
            this.bitField0_ |= 16;
            this.lotteryCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLotteryCount() {
            this.bitField0_ &= -17;
            this.lotteryCount_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasIsBackAuto() {
            return (this.bitField0_ & 32) != 0;
         }

         public boolean getIsBackAuto() {
            return this.isBackAuto_;
         }

         public Builder setIsBackAuto(boolean value) {
            this.bitField0_ |= 32;
            this.isBackAuto_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsBackAuto() {
            this.bitField0_ &= -33;
            this.isBackAuto_ = false;
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

   public static final class C2S_PresentHeroCard_28605 extends GeneratedMessageV3 implements C2S_PresentHeroCard_28605OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int ISRESOLVE_FIELD_NUMBER = 2;
      private boolean isResolve_;
      private byte memoizedIsInitialized;
      private static final C2S_PresentHeroCard_28605 DEFAULT_INSTANCE = new C2S_PresentHeroCard_28605();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PresentHeroCard_28605> PARSER = new AbstractParser<C2S_PresentHeroCard_28605>() {
         public C2S_PresentHeroCard_28605 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PresentHeroCard_28605(input, extensionRegistry);
         }
      };

      private C2S_PresentHeroCard_28605(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PresentHeroCard_28605() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PresentHeroCard_28605();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PresentHeroCard_28605(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.isResolve_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_PresentHeroCard_28605_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_PresentHeroCard_28605_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PresentHeroCard_28605.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasIsResolve() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsResolve() {
         return this.isResolve_;
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
         } else if (!this.hasIsResolve()) {
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
            output.writeBool(2, this.isResolve_);
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
               size += CodedOutputStream.computeBoolSize(2, this.isResolve_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_PresentHeroCard_28605)) {
            return super.equals(obj);
         } else {
            C2S_PresentHeroCard_28605 other = (C2S_PresentHeroCard_28605)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasIsResolve() != other.hasIsResolve()) {
               return false;
            } else if (this.hasIsResolve() && this.getIsResolve() != other.getIsResolve()) {
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

            if (this.hasIsResolve()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsResolve());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_PresentHeroCard_28605 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PresentHeroCard_28605)PARSER.parseFrom(data);
      }

      public static C2S_PresentHeroCard_28605 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PresentHeroCard_28605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PresentHeroCard_28605 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PresentHeroCard_28605)PARSER.parseFrom(data);
      }

      public static C2S_PresentHeroCard_28605 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PresentHeroCard_28605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PresentHeroCard_28605 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PresentHeroCard_28605)PARSER.parseFrom(data);
      }

      public static C2S_PresentHeroCard_28605 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PresentHeroCard_28605)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PresentHeroCard_28605 parseFrom(InputStream input) throws IOException {
         return (C2S_PresentHeroCard_28605)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PresentHeroCard_28605 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PresentHeroCard_28605)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PresentHeroCard_28605 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PresentHeroCard_28605)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PresentHeroCard_28605 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PresentHeroCard_28605)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PresentHeroCard_28605 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PresentHeroCard_28605)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PresentHeroCard_28605 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PresentHeroCard_28605)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PresentHeroCard_28605 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PresentHeroCard_28605 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PresentHeroCard_28605> parser() {
         return PARSER;
      }

      public Parser<C2S_PresentHeroCard_28605> getParserForType() {
         return PARSER;
      }

      public C2S_PresentHeroCard_28605 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PresentHeroCard_28605OrBuilder {
         private int bitField0_;
         private int code_;
         private boolean isResolve_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_PresentHeroCard_28605_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_PresentHeroCard_28605_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PresentHeroCard_28605.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.C2S_PresentHeroCard_28605.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.isResolve_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_PresentHeroCard_28605_descriptor;
         }

         public C2S_PresentHeroCard_28605 getDefaultInstanceForType() {
            return HeroCardMsg.C2S_PresentHeroCard_28605.getDefaultInstance();
         }

         public C2S_PresentHeroCard_28605 build() {
            C2S_PresentHeroCard_28605 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PresentHeroCard_28605 buildPartial() {
            C2S_PresentHeroCard_28605 result = new C2S_PresentHeroCard_28605(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.isResolve_ = this.isResolve_;
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
            if (other instanceof C2S_PresentHeroCard_28605) {
               return this.mergeFrom((C2S_PresentHeroCard_28605)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PresentHeroCard_28605 other) {
            if (other == HeroCardMsg.C2S_PresentHeroCard_28605.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasIsResolve()) {
                  this.setIsResolve(other.getIsResolve());
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
               return this.hasIsResolve();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_PresentHeroCard_28605 parsedMessage = null;

            try {
               parsedMessage = (C2S_PresentHeroCard_28605)HeroCardMsg.C2S_PresentHeroCard_28605.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PresentHeroCard_28605)e.getUnfinishedMessage();
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

         public boolean hasIsResolve() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsResolve() {
            return this.isResolve_;
         }

         public Builder setIsResolve(boolean value) {
            this.bitField0_ |= 2;
            this.isResolve_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsResolve() {
            this.bitField0_ &= -3;
            this.isResolve_ = false;
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

   public static final class S2C_PresentHeroCard_28606 extends GeneratedMessageV3 implements S2C_PresentHeroCard_28606OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int ISRESOLVE_FIELD_NUMBER = 2;
      private boolean isResolve_;
      public static final int PRESENTHEROCARD_FIELD_NUMBER = 3;
      private List<HeroCardData> presentHeroCard_;
      public static final int SURPLUSHEROCARD_FIELD_NUMBER = 4;
      private List<HeroCardData> surplusHeroCard_;
      private byte memoizedIsInitialized;
      private static final S2C_PresentHeroCard_28606 DEFAULT_INSTANCE = new S2C_PresentHeroCard_28606();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PresentHeroCard_28606> PARSER = new AbstractParser<S2C_PresentHeroCard_28606>() {
         public S2C_PresentHeroCard_28606 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PresentHeroCard_28606(input, extensionRegistry);
         }
      };

      private S2C_PresentHeroCard_28606(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PresentHeroCard_28606() {
         this.memoizedIsInitialized = -1;
         this.presentHeroCard_ = Collections.emptyList();
         this.surplusHeroCard_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PresentHeroCard_28606();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PresentHeroCard_28606(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.isResolve_ = input.readBool();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.presentHeroCard_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.presentHeroCard_.add(input.readMessage(HeroCardMsg.HeroCardData.PARSER, extensionRegistry));
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.surplusHeroCard_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.surplusHeroCard_.add(input.readMessage(HeroCardMsg.HeroCardData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.presentHeroCard_ = Collections.unmodifiableList(this.presentHeroCard_);
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.surplusHeroCard_ = Collections.unmodifiableList(this.surplusHeroCard_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_PresentHeroCard_28606_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_PresentHeroCard_28606_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PresentHeroCard_28606.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasIsResolve() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsResolve() {
         return this.isResolve_;
      }

      public List<HeroCardData> getPresentHeroCardList() {
         return this.presentHeroCard_;
      }

      public List<? extends HeroCardDataOrBuilder> getPresentHeroCardOrBuilderList() {
         return this.presentHeroCard_;
      }

      public int getPresentHeroCardCount() {
         return this.presentHeroCard_.size();
      }

      public HeroCardData getPresentHeroCard(int index) {
         return (HeroCardData)this.presentHeroCard_.get(index);
      }

      public HeroCardDataOrBuilder getPresentHeroCardOrBuilder(int index) {
         return (HeroCardDataOrBuilder)this.presentHeroCard_.get(index);
      }

      public List<HeroCardData> getSurplusHeroCardList() {
         return this.surplusHeroCard_;
      }

      public List<? extends HeroCardDataOrBuilder> getSurplusHeroCardOrBuilderList() {
         return this.surplusHeroCard_;
      }

      public int getSurplusHeroCardCount() {
         return this.surplusHeroCard_.size();
      }

      public HeroCardData getSurplusHeroCard(int index) {
         return (HeroCardData)this.surplusHeroCard_.get(index);
      }

      public HeroCardDataOrBuilder getSurplusHeroCardOrBuilder(int index) {
         return (HeroCardDataOrBuilder)this.surplusHeroCard_.get(index);
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
         } else if (!this.hasIsResolve()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getPresentHeroCardCount(); ++i) {
               if (!this.getPresentHeroCard(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getSurplusHeroCardCount(); ++i) {
               if (!this.getSurplusHeroCard(i).isInitialized()) {
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
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.isResolve_);
         }

         for(int i = 0; i < this.presentHeroCard_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.presentHeroCard_.get(i));
         }

         for(int i = 0; i < this.surplusHeroCard_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.surplusHeroCard_.get(i));
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
               size += CodedOutputStream.computeBoolSize(2, this.isResolve_);
            }

            for(int i = 0; i < this.presentHeroCard_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.presentHeroCard_.get(i));
            }

            for(int i = 0; i < this.surplusHeroCard_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.surplusHeroCard_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PresentHeroCard_28606)) {
            return super.equals(obj);
         } else {
            S2C_PresentHeroCard_28606 other = (S2C_PresentHeroCard_28606)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasIsResolve() != other.hasIsResolve()) {
               return false;
            } else if (this.hasIsResolve() && this.getIsResolve() != other.getIsResolve()) {
               return false;
            } else if (!this.getPresentHeroCardList().equals(other.getPresentHeroCardList())) {
               return false;
            } else if (!this.getSurplusHeroCardList().equals(other.getSurplusHeroCardList())) {
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

            if (this.hasIsResolve()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsResolve());
            }

            if (this.getPresentHeroCardCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPresentHeroCardList().hashCode();
            }

            if (this.getSurplusHeroCardCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getSurplusHeroCardList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PresentHeroCard_28606 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PresentHeroCard_28606)PARSER.parseFrom(data);
      }

      public static S2C_PresentHeroCard_28606 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PresentHeroCard_28606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PresentHeroCard_28606 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PresentHeroCard_28606)PARSER.parseFrom(data);
      }

      public static S2C_PresentHeroCard_28606 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PresentHeroCard_28606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PresentHeroCard_28606 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PresentHeroCard_28606)PARSER.parseFrom(data);
      }

      public static S2C_PresentHeroCard_28606 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PresentHeroCard_28606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PresentHeroCard_28606 parseFrom(InputStream input) throws IOException {
         return (S2C_PresentHeroCard_28606)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PresentHeroCard_28606 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PresentHeroCard_28606)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PresentHeroCard_28606 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PresentHeroCard_28606)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PresentHeroCard_28606 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PresentHeroCard_28606)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PresentHeroCard_28606 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PresentHeroCard_28606)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PresentHeroCard_28606 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PresentHeroCard_28606)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PresentHeroCard_28606 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PresentHeroCard_28606 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PresentHeroCard_28606> parser() {
         return PARSER;
      }

      public Parser<S2C_PresentHeroCard_28606> getParserForType() {
         return PARSER;
      }

      public S2C_PresentHeroCard_28606 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PresentHeroCard_28606OrBuilder {
         private int bitField0_;
         private int code_;
         private boolean isResolve_;
         private List<HeroCardData> presentHeroCard_;
         private RepeatedFieldBuilderV3<HeroCardData, HeroCardData.Builder, HeroCardDataOrBuilder> presentHeroCardBuilder_;
         private List<HeroCardData> surplusHeroCard_;
         private RepeatedFieldBuilderV3<HeroCardData, HeroCardData.Builder, HeroCardDataOrBuilder> surplusHeroCardBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_PresentHeroCard_28606_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_PresentHeroCard_28606_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PresentHeroCard_28606.class, Builder.class);
         }

         private Builder() {
            this.presentHeroCard_ = Collections.emptyList();
            this.surplusHeroCard_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.presentHeroCard_ = Collections.emptyList();
            this.surplusHeroCard_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.S2C_PresentHeroCard_28606.alwaysUseFieldBuilders) {
               this.getPresentHeroCardFieldBuilder();
               this.getSurplusHeroCardFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.isResolve_ = false;
            this.bitField0_ &= -3;
            if (this.presentHeroCardBuilder_ == null) {
               this.presentHeroCard_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.presentHeroCardBuilder_.clear();
            }

            if (this.surplusHeroCardBuilder_ == null) {
               this.surplusHeroCard_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.surplusHeroCardBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_PresentHeroCard_28606_descriptor;
         }

         public S2C_PresentHeroCard_28606 getDefaultInstanceForType() {
            return HeroCardMsg.S2C_PresentHeroCard_28606.getDefaultInstance();
         }

         public S2C_PresentHeroCard_28606 build() {
            S2C_PresentHeroCard_28606 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PresentHeroCard_28606 buildPartial() {
            S2C_PresentHeroCard_28606 result = new S2C_PresentHeroCard_28606(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.isResolve_ = this.isResolve_;
               to_bitField0_ |= 2;
            }

            if (this.presentHeroCardBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.presentHeroCard_ = Collections.unmodifiableList(this.presentHeroCard_);
                  this.bitField0_ &= -5;
               }

               result.presentHeroCard_ = this.presentHeroCard_;
            } else {
               result.presentHeroCard_ = this.presentHeroCardBuilder_.build();
            }

            if (this.surplusHeroCardBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.surplusHeroCard_ = Collections.unmodifiableList(this.surplusHeroCard_);
                  this.bitField0_ &= -9;
               }

               result.surplusHeroCard_ = this.surplusHeroCard_;
            } else {
               result.surplusHeroCard_ = this.surplusHeroCardBuilder_.build();
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
            if (other instanceof S2C_PresentHeroCard_28606) {
               return this.mergeFrom((S2C_PresentHeroCard_28606)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PresentHeroCard_28606 other) {
            if (other == HeroCardMsg.S2C_PresentHeroCard_28606.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasIsResolve()) {
                  this.setIsResolve(other.getIsResolve());
               }

               if (this.presentHeroCardBuilder_ == null) {
                  if (!other.presentHeroCard_.isEmpty()) {
                     if (this.presentHeroCard_.isEmpty()) {
                        this.presentHeroCard_ = other.presentHeroCard_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensurePresentHeroCardIsMutable();
                        this.presentHeroCard_.addAll(other.presentHeroCard_);
                     }

                     this.onChanged();
                  }
               } else if (!other.presentHeroCard_.isEmpty()) {
                  if (this.presentHeroCardBuilder_.isEmpty()) {
                     this.presentHeroCardBuilder_.dispose();
                     this.presentHeroCardBuilder_ = null;
                     this.presentHeroCard_ = other.presentHeroCard_;
                     this.bitField0_ &= -5;
                     this.presentHeroCardBuilder_ = HeroCardMsg.S2C_PresentHeroCard_28606.alwaysUseFieldBuilders ? this.getPresentHeroCardFieldBuilder() : null;
                  } else {
                     this.presentHeroCardBuilder_.addAllMessages(other.presentHeroCard_);
                  }
               }

               if (this.surplusHeroCardBuilder_ == null) {
                  if (!other.surplusHeroCard_.isEmpty()) {
                     if (this.surplusHeroCard_.isEmpty()) {
                        this.surplusHeroCard_ = other.surplusHeroCard_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureSurplusHeroCardIsMutable();
                        this.surplusHeroCard_.addAll(other.surplusHeroCard_);
                     }

                     this.onChanged();
                  }
               } else if (!other.surplusHeroCard_.isEmpty()) {
                  if (this.surplusHeroCardBuilder_.isEmpty()) {
                     this.surplusHeroCardBuilder_.dispose();
                     this.surplusHeroCardBuilder_ = null;
                     this.surplusHeroCard_ = other.surplusHeroCard_;
                     this.bitField0_ &= -9;
                     this.surplusHeroCardBuilder_ = HeroCardMsg.S2C_PresentHeroCard_28606.alwaysUseFieldBuilders ? this.getSurplusHeroCardFieldBuilder() : null;
                  } else {
                     this.surplusHeroCardBuilder_.addAllMessages(other.surplusHeroCard_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else if (!this.hasIsResolve()) {
               return false;
            } else {
               for(int i = 0; i < this.getPresentHeroCardCount(); ++i) {
                  if (!this.getPresentHeroCard(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getSurplusHeroCardCount(); ++i) {
                  if (!this.getSurplusHeroCard(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PresentHeroCard_28606 parsedMessage = null;

            try {
               parsedMessage = (S2C_PresentHeroCard_28606)HeroCardMsg.S2C_PresentHeroCard_28606.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PresentHeroCard_28606)e.getUnfinishedMessage();
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

         public boolean hasIsResolve() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsResolve() {
            return this.isResolve_;
         }

         public Builder setIsResolve(boolean value) {
            this.bitField0_ |= 2;
            this.isResolve_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsResolve() {
            this.bitField0_ &= -3;
            this.isResolve_ = false;
            this.onChanged();
            return this;
         }

         private void ensurePresentHeroCardIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.presentHeroCard_ = new ArrayList(this.presentHeroCard_);
               this.bitField0_ |= 4;
            }

         }

         public List<HeroCardData> getPresentHeroCardList() {
            return this.presentHeroCardBuilder_ == null ? Collections.unmodifiableList(this.presentHeroCard_) : this.presentHeroCardBuilder_.getMessageList();
         }

         public int getPresentHeroCardCount() {
            return this.presentHeroCardBuilder_ == null ? this.presentHeroCard_.size() : this.presentHeroCardBuilder_.getCount();
         }

         public HeroCardData getPresentHeroCard(int index) {
            return this.presentHeroCardBuilder_ == null ? (HeroCardData)this.presentHeroCard_.get(index) : (HeroCardData)this.presentHeroCardBuilder_.getMessage(index);
         }

         public Builder setPresentHeroCard(int index, HeroCardData value) {
            if (this.presentHeroCardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.set(index, value);
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPresentHeroCard(int index, HeroCardData.Builder builderForValue) {
            if (this.presentHeroCardBuilder_ == null) {
               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPresentHeroCard(HeroCardData value) {
            if (this.presentHeroCardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.add(value);
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPresentHeroCard(int index, HeroCardData value) {
            if (this.presentHeroCardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.add(index, value);
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPresentHeroCard(HeroCardData.Builder builderForValue) {
            if (this.presentHeroCardBuilder_ == null) {
               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPresentHeroCard(int index, HeroCardData.Builder builderForValue) {
            if (this.presentHeroCardBuilder_ == null) {
               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPresentHeroCard(Iterable<? extends HeroCardData> values) {
            if (this.presentHeroCardBuilder_ == null) {
               this.ensurePresentHeroCardIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.presentHeroCard_);
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPresentHeroCard() {
            if (this.presentHeroCardBuilder_ == null) {
               this.presentHeroCard_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.clear();
            }

            return this;
         }

         public Builder removePresentHeroCard(int index) {
            if (this.presentHeroCardBuilder_ == null) {
               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.remove(index);
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.remove(index);
            }

            return this;
         }

         public HeroCardData.Builder getPresentHeroCardBuilder(int index) {
            return (HeroCardData.Builder)this.getPresentHeroCardFieldBuilder().getBuilder(index);
         }

         public HeroCardDataOrBuilder getPresentHeroCardOrBuilder(int index) {
            return this.presentHeroCardBuilder_ == null ? (HeroCardDataOrBuilder)this.presentHeroCard_.get(index) : (HeroCardDataOrBuilder)this.presentHeroCardBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HeroCardDataOrBuilder> getPresentHeroCardOrBuilderList() {
            return this.presentHeroCardBuilder_ != null ? this.presentHeroCardBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.presentHeroCard_);
         }

         public HeroCardData.Builder addPresentHeroCardBuilder() {
            return (HeroCardData.Builder)this.getPresentHeroCardFieldBuilder().addBuilder(HeroCardMsg.HeroCardData.getDefaultInstance());
         }

         public HeroCardData.Builder addPresentHeroCardBuilder(int index) {
            return (HeroCardData.Builder)this.getPresentHeroCardFieldBuilder().addBuilder(index, HeroCardMsg.HeroCardData.getDefaultInstance());
         }

         public List<HeroCardData.Builder> getPresentHeroCardBuilderList() {
            return this.getPresentHeroCardFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HeroCardData, HeroCardData.Builder, HeroCardDataOrBuilder> getPresentHeroCardFieldBuilder() {
            if (this.presentHeroCardBuilder_ == null) {
               this.presentHeroCardBuilder_ = new RepeatedFieldBuilderV3(this.presentHeroCard_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.presentHeroCard_ = null;
            }

            return this.presentHeroCardBuilder_;
         }

         private void ensureSurplusHeroCardIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.surplusHeroCard_ = new ArrayList(this.surplusHeroCard_);
               this.bitField0_ |= 8;
            }

         }

         public List<HeroCardData> getSurplusHeroCardList() {
            return this.surplusHeroCardBuilder_ == null ? Collections.unmodifiableList(this.surplusHeroCard_) : this.surplusHeroCardBuilder_.getMessageList();
         }

         public int getSurplusHeroCardCount() {
            return this.surplusHeroCardBuilder_ == null ? this.surplusHeroCard_.size() : this.surplusHeroCardBuilder_.getCount();
         }

         public HeroCardData getSurplusHeroCard(int index) {
            return this.surplusHeroCardBuilder_ == null ? (HeroCardData)this.surplusHeroCard_.get(index) : (HeroCardData)this.surplusHeroCardBuilder_.getMessage(index);
         }

         public Builder setSurplusHeroCard(int index, HeroCardData value) {
            if (this.surplusHeroCardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSurplusHeroCardIsMutable();
               this.surplusHeroCard_.set(index, value);
               this.onChanged();
            } else {
               this.surplusHeroCardBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setSurplusHeroCard(int index, HeroCardData.Builder builderForValue) {
            if (this.surplusHeroCardBuilder_ == null) {
               this.ensureSurplusHeroCardIsMutable();
               this.surplusHeroCard_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.surplusHeroCardBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addSurplusHeroCard(HeroCardData value) {
            if (this.surplusHeroCardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSurplusHeroCardIsMutable();
               this.surplusHeroCard_.add(value);
               this.onChanged();
            } else {
               this.surplusHeroCardBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addSurplusHeroCard(int index, HeroCardData value) {
            if (this.surplusHeroCardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSurplusHeroCardIsMutable();
               this.surplusHeroCard_.add(index, value);
               this.onChanged();
            } else {
               this.surplusHeroCardBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addSurplusHeroCard(HeroCardData.Builder builderForValue) {
            if (this.surplusHeroCardBuilder_ == null) {
               this.ensureSurplusHeroCardIsMutable();
               this.surplusHeroCard_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.surplusHeroCardBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addSurplusHeroCard(int index, HeroCardData.Builder builderForValue) {
            if (this.surplusHeroCardBuilder_ == null) {
               this.ensureSurplusHeroCardIsMutable();
               this.surplusHeroCard_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.surplusHeroCardBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllSurplusHeroCard(Iterable<? extends HeroCardData> values) {
            if (this.surplusHeroCardBuilder_ == null) {
               this.ensureSurplusHeroCardIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.surplusHeroCard_);
               this.onChanged();
            } else {
               this.surplusHeroCardBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearSurplusHeroCard() {
            if (this.surplusHeroCardBuilder_ == null) {
               this.surplusHeroCard_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.surplusHeroCardBuilder_.clear();
            }

            return this;
         }

         public Builder removeSurplusHeroCard(int index) {
            if (this.surplusHeroCardBuilder_ == null) {
               this.ensureSurplusHeroCardIsMutable();
               this.surplusHeroCard_.remove(index);
               this.onChanged();
            } else {
               this.surplusHeroCardBuilder_.remove(index);
            }

            return this;
         }

         public HeroCardData.Builder getSurplusHeroCardBuilder(int index) {
            return (HeroCardData.Builder)this.getSurplusHeroCardFieldBuilder().getBuilder(index);
         }

         public HeroCardDataOrBuilder getSurplusHeroCardOrBuilder(int index) {
            return this.surplusHeroCardBuilder_ == null ? (HeroCardDataOrBuilder)this.surplusHeroCard_.get(index) : (HeroCardDataOrBuilder)this.surplusHeroCardBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HeroCardDataOrBuilder> getSurplusHeroCardOrBuilderList() {
            return this.surplusHeroCardBuilder_ != null ? this.surplusHeroCardBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.surplusHeroCard_);
         }

         public HeroCardData.Builder addSurplusHeroCardBuilder() {
            return (HeroCardData.Builder)this.getSurplusHeroCardFieldBuilder().addBuilder(HeroCardMsg.HeroCardData.getDefaultInstance());
         }

         public HeroCardData.Builder addSurplusHeroCardBuilder(int index) {
            return (HeroCardData.Builder)this.getSurplusHeroCardFieldBuilder().addBuilder(index, HeroCardMsg.HeroCardData.getDefaultInstance());
         }

         public List<HeroCardData.Builder> getSurplusHeroCardBuilderList() {
            return this.getSurplusHeroCardFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HeroCardData, HeroCardData.Builder, HeroCardDataOrBuilder> getSurplusHeroCardFieldBuilder() {
            if (this.surplusHeroCardBuilder_ == null) {
               this.surplusHeroCardBuilder_ = new RepeatedFieldBuilderV3(this.surplusHeroCard_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.surplusHeroCard_ = null;
            }

            return this.surplusHeroCardBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_DismissHeroCard_28607 extends GeneratedMessageV3 implements C2S_DismissHeroCard_28607OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCARDTYPE_FIELD_NUMBER = 1;
      private int heroCardType_;
      public static final int CODE_FIELD_NUMBER = 2;
      private int code_;
      private byte memoizedIsInitialized;
      private static final C2S_DismissHeroCard_28607 DEFAULT_INSTANCE = new C2S_DismissHeroCard_28607();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DismissHeroCard_28607> PARSER = new AbstractParser<C2S_DismissHeroCard_28607>() {
         public C2S_DismissHeroCard_28607 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DismissHeroCard_28607(input, extensionRegistry);
         }
      };

      private C2S_DismissHeroCard_28607(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DismissHeroCard_28607() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DismissHeroCard_28607();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DismissHeroCard_28607(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroCardType_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
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
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_DismissHeroCard_28607_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_DismissHeroCard_28607_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DismissHeroCard_28607.class, Builder.class);
      }

      public boolean hasHeroCardType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCardType() {
         return this.heroCardType_;
      }

      public boolean hasCode() {
         return (this.bitField0_ & 2) != 0;
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroCardType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.code_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroCardType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.code_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_DismissHeroCard_28607)) {
            return super.equals(obj);
         } else {
            C2S_DismissHeroCard_28607 other = (C2S_DismissHeroCard_28607)obj;
            if (this.hasHeroCardType() != other.hasHeroCardType()) {
               return false;
            } else if (this.hasHeroCardType() && this.getHeroCardType() != other.getHeroCardType()) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
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
            if (this.hasHeroCardType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroCardType();
            }

            if (this.hasCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_DismissHeroCard_28607 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DismissHeroCard_28607)PARSER.parseFrom(data);
      }

      public static C2S_DismissHeroCard_28607 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DismissHeroCard_28607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DismissHeroCard_28607 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DismissHeroCard_28607)PARSER.parseFrom(data);
      }

      public static C2S_DismissHeroCard_28607 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DismissHeroCard_28607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DismissHeroCard_28607 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DismissHeroCard_28607)PARSER.parseFrom(data);
      }

      public static C2S_DismissHeroCard_28607 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DismissHeroCard_28607)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DismissHeroCard_28607 parseFrom(InputStream input) throws IOException {
         return (C2S_DismissHeroCard_28607)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DismissHeroCard_28607 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DismissHeroCard_28607)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DismissHeroCard_28607 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DismissHeroCard_28607)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DismissHeroCard_28607 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DismissHeroCard_28607)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DismissHeroCard_28607 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DismissHeroCard_28607)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DismissHeroCard_28607 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DismissHeroCard_28607)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DismissHeroCard_28607 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DismissHeroCard_28607 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DismissHeroCard_28607> parser() {
         return PARSER;
      }

      public Parser<C2S_DismissHeroCard_28607> getParserForType() {
         return PARSER;
      }

      public C2S_DismissHeroCard_28607 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DismissHeroCard_28607OrBuilder {
         private int bitField0_;
         private int heroCardType_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_DismissHeroCard_28607_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_DismissHeroCard_28607_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DismissHeroCard_28607.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.C2S_DismissHeroCard_28607.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCardType_ = 0;
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_DismissHeroCard_28607_descriptor;
         }

         public C2S_DismissHeroCard_28607 getDefaultInstanceForType() {
            return HeroCardMsg.C2S_DismissHeroCard_28607.getDefaultInstance();
         }

         public C2S_DismissHeroCard_28607 build() {
            C2S_DismissHeroCard_28607 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DismissHeroCard_28607 buildPartial() {
            C2S_DismissHeroCard_28607 result = new C2S_DismissHeroCard_28607(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCardType_ = this.heroCardType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.code_ = this.code_;
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
            if (other instanceof C2S_DismissHeroCard_28607) {
               return this.mergeFrom((C2S_DismissHeroCard_28607)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DismissHeroCard_28607 other) {
            if (other == HeroCardMsg.C2S_DismissHeroCard_28607.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCardType()) {
                  this.setHeroCardType(other.getHeroCardType());
               }

               if (other.hasCode()) {
                  this.setCode(other.getCode());
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
            C2S_DismissHeroCard_28607 parsedMessage = null;

            try {
               parsedMessage = (C2S_DismissHeroCard_28607)HeroCardMsg.C2S_DismissHeroCard_28607.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DismissHeroCard_28607)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroCardType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroCardType() {
            return this.heroCardType_;
         }

         public Builder setHeroCardType(int value) {
            this.bitField0_ |= 1;
            this.heroCardType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroCardType() {
            this.bitField0_ &= -2;
            this.heroCardType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCode() {
            return this.code_;
         }

         public Builder setCode(int value) {
            this.bitField0_ |= 2;
            this.code_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCode() {
            this.bitField0_ &= -3;
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

   public static final class S2C_DismissHeroCard_28608 extends GeneratedMessageV3 implements S2C_DismissHeroCard_28608OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PRESENTHEROCARD_FIELD_NUMBER = 1;
      private List<HeroCardData> presentHeroCard_;
      public static final int SURPLUSHEROCARD_FIELD_NUMBER = 2;
      private List<HeroCardData> surplusHeroCard_;
      public static final int RESOLVECARDID_FIELD_NUMBER = 3;
      private int resolveCardId_;
      private byte memoizedIsInitialized;
      private static final S2C_DismissHeroCard_28608 DEFAULT_INSTANCE = new S2C_DismissHeroCard_28608();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DismissHeroCard_28608> PARSER = new AbstractParser<S2C_DismissHeroCard_28608>() {
         public S2C_DismissHeroCard_28608 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DismissHeroCard_28608(input, extensionRegistry);
         }
      };

      private S2C_DismissHeroCard_28608(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DismissHeroCard_28608() {
         this.memoizedIsInitialized = -1;
         this.presentHeroCard_ = Collections.emptyList();
         this.surplusHeroCard_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DismissHeroCard_28608();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DismissHeroCard_28608(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.presentHeroCard_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.presentHeroCard_.add(input.readMessage(HeroCardMsg.HeroCardData.PARSER, extensionRegistry));
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.surplusHeroCard_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.surplusHeroCard_.add(input.readMessage(HeroCardMsg.HeroCardData.PARSER, extensionRegistry));
                        break;
                     case 24:
                        this.bitField0_ |= 1;
                        this.resolveCardId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.presentHeroCard_ = Collections.unmodifiableList(this.presentHeroCard_);
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.surplusHeroCard_ = Collections.unmodifiableList(this.surplusHeroCard_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_DismissHeroCard_28608_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_DismissHeroCard_28608_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DismissHeroCard_28608.class, Builder.class);
      }

      public List<HeroCardData> getPresentHeroCardList() {
         return this.presentHeroCard_;
      }

      public List<? extends HeroCardDataOrBuilder> getPresentHeroCardOrBuilderList() {
         return this.presentHeroCard_;
      }

      public int getPresentHeroCardCount() {
         return this.presentHeroCard_.size();
      }

      public HeroCardData getPresentHeroCard(int index) {
         return (HeroCardData)this.presentHeroCard_.get(index);
      }

      public HeroCardDataOrBuilder getPresentHeroCardOrBuilder(int index) {
         return (HeroCardDataOrBuilder)this.presentHeroCard_.get(index);
      }

      public List<HeroCardData> getSurplusHeroCardList() {
         return this.surplusHeroCard_;
      }

      public List<? extends HeroCardDataOrBuilder> getSurplusHeroCardOrBuilderList() {
         return this.surplusHeroCard_;
      }

      public int getSurplusHeroCardCount() {
         return this.surplusHeroCard_.size();
      }

      public HeroCardData getSurplusHeroCard(int index) {
         return (HeroCardData)this.surplusHeroCard_.get(index);
      }

      public HeroCardDataOrBuilder getSurplusHeroCardOrBuilder(int index) {
         return (HeroCardDataOrBuilder)this.surplusHeroCard_.get(index);
      }

      public boolean hasResolveCardId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResolveCardId() {
         return this.resolveCardId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasResolveCardId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getPresentHeroCardCount(); ++i) {
               if (!this.getPresentHeroCard(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getSurplusHeroCardCount(); ++i) {
               if (!this.getSurplusHeroCard(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.presentHeroCard_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.presentHeroCard_.get(i));
         }

         for(int i = 0; i < this.surplusHeroCard_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.surplusHeroCard_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(3, this.resolveCardId_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.presentHeroCard_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.presentHeroCard_.get(i));
            }

            for(int i = 0; i < this.surplusHeroCard_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.surplusHeroCard_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.resolveCardId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DismissHeroCard_28608)) {
            return super.equals(obj);
         } else {
            S2C_DismissHeroCard_28608 other = (S2C_DismissHeroCard_28608)obj;
            if (!this.getPresentHeroCardList().equals(other.getPresentHeroCardList())) {
               return false;
            } else if (!this.getSurplusHeroCardList().equals(other.getSurplusHeroCardList())) {
               return false;
            } else if (this.hasResolveCardId() != other.hasResolveCardId()) {
               return false;
            } else if (this.hasResolveCardId() && this.getResolveCardId() != other.getResolveCardId()) {
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
            if (this.getPresentHeroCardCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPresentHeroCardList().hashCode();
            }

            if (this.getSurplusHeroCardCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSurplusHeroCardList().hashCode();
            }

            if (this.hasResolveCardId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getResolveCardId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DismissHeroCard_28608 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DismissHeroCard_28608)PARSER.parseFrom(data);
      }

      public static S2C_DismissHeroCard_28608 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DismissHeroCard_28608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DismissHeroCard_28608 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DismissHeroCard_28608)PARSER.parseFrom(data);
      }

      public static S2C_DismissHeroCard_28608 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DismissHeroCard_28608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DismissHeroCard_28608 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DismissHeroCard_28608)PARSER.parseFrom(data);
      }

      public static S2C_DismissHeroCard_28608 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DismissHeroCard_28608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DismissHeroCard_28608 parseFrom(InputStream input) throws IOException {
         return (S2C_DismissHeroCard_28608)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DismissHeroCard_28608 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DismissHeroCard_28608)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DismissHeroCard_28608 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DismissHeroCard_28608)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DismissHeroCard_28608 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DismissHeroCard_28608)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DismissHeroCard_28608 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DismissHeroCard_28608)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DismissHeroCard_28608 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DismissHeroCard_28608)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DismissHeroCard_28608 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DismissHeroCard_28608 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DismissHeroCard_28608> parser() {
         return PARSER;
      }

      public Parser<S2C_DismissHeroCard_28608> getParserForType() {
         return PARSER;
      }

      public S2C_DismissHeroCard_28608 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DismissHeroCard_28608OrBuilder {
         private int bitField0_;
         private List<HeroCardData> presentHeroCard_;
         private RepeatedFieldBuilderV3<HeroCardData, HeroCardData.Builder, HeroCardDataOrBuilder> presentHeroCardBuilder_;
         private List<HeroCardData> surplusHeroCard_;
         private RepeatedFieldBuilderV3<HeroCardData, HeroCardData.Builder, HeroCardDataOrBuilder> surplusHeroCardBuilder_;
         private int resolveCardId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_DismissHeroCard_28608_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_DismissHeroCard_28608_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DismissHeroCard_28608.class, Builder.class);
         }

         private Builder() {
            this.presentHeroCard_ = Collections.emptyList();
            this.surplusHeroCard_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.presentHeroCard_ = Collections.emptyList();
            this.surplusHeroCard_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.S2C_DismissHeroCard_28608.alwaysUseFieldBuilders) {
               this.getPresentHeroCardFieldBuilder();
               this.getSurplusHeroCardFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.presentHeroCardBuilder_ == null) {
               this.presentHeroCard_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.presentHeroCardBuilder_.clear();
            }

            if (this.surplusHeroCardBuilder_ == null) {
               this.surplusHeroCard_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.surplusHeroCardBuilder_.clear();
            }

            this.resolveCardId_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_DismissHeroCard_28608_descriptor;
         }

         public S2C_DismissHeroCard_28608 getDefaultInstanceForType() {
            return HeroCardMsg.S2C_DismissHeroCard_28608.getDefaultInstance();
         }

         public S2C_DismissHeroCard_28608 build() {
            S2C_DismissHeroCard_28608 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DismissHeroCard_28608 buildPartial() {
            S2C_DismissHeroCard_28608 result = new S2C_DismissHeroCard_28608(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.presentHeroCardBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.presentHeroCard_ = Collections.unmodifiableList(this.presentHeroCard_);
                  this.bitField0_ &= -2;
               }

               result.presentHeroCard_ = this.presentHeroCard_;
            } else {
               result.presentHeroCard_ = this.presentHeroCardBuilder_.build();
            }

            if (this.surplusHeroCardBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.surplusHeroCard_ = Collections.unmodifiableList(this.surplusHeroCard_);
                  this.bitField0_ &= -3;
               }

               result.surplusHeroCard_ = this.surplusHeroCard_;
            } else {
               result.surplusHeroCard_ = this.surplusHeroCardBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.resolveCardId_ = this.resolveCardId_;
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
            if (other instanceof S2C_DismissHeroCard_28608) {
               return this.mergeFrom((S2C_DismissHeroCard_28608)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DismissHeroCard_28608 other) {
            if (other == HeroCardMsg.S2C_DismissHeroCard_28608.getDefaultInstance()) {
               return this;
            } else {
               if (this.presentHeroCardBuilder_ == null) {
                  if (!other.presentHeroCard_.isEmpty()) {
                     if (this.presentHeroCard_.isEmpty()) {
                        this.presentHeroCard_ = other.presentHeroCard_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensurePresentHeroCardIsMutable();
                        this.presentHeroCard_.addAll(other.presentHeroCard_);
                     }

                     this.onChanged();
                  }
               } else if (!other.presentHeroCard_.isEmpty()) {
                  if (this.presentHeroCardBuilder_.isEmpty()) {
                     this.presentHeroCardBuilder_.dispose();
                     this.presentHeroCardBuilder_ = null;
                     this.presentHeroCard_ = other.presentHeroCard_;
                     this.bitField0_ &= -2;
                     this.presentHeroCardBuilder_ = HeroCardMsg.S2C_DismissHeroCard_28608.alwaysUseFieldBuilders ? this.getPresentHeroCardFieldBuilder() : null;
                  } else {
                     this.presentHeroCardBuilder_.addAllMessages(other.presentHeroCard_);
                  }
               }

               if (this.surplusHeroCardBuilder_ == null) {
                  if (!other.surplusHeroCard_.isEmpty()) {
                     if (this.surplusHeroCard_.isEmpty()) {
                        this.surplusHeroCard_ = other.surplusHeroCard_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureSurplusHeroCardIsMutable();
                        this.surplusHeroCard_.addAll(other.surplusHeroCard_);
                     }

                     this.onChanged();
                  }
               } else if (!other.surplusHeroCard_.isEmpty()) {
                  if (this.surplusHeroCardBuilder_.isEmpty()) {
                     this.surplusHeroCardBuilder_.dispose();
                     this.surplusHeroCardBuilder_ = null;
                     this.surplusHeroCard_ = other.surplusHeroCard_;
                     this.bitField0_ &= -3;
                     this.surplusHeroCardBuilder_ = HeroCardMsg.S2C_DismissHeroCard_28608.alwaysUseFieldBuilders ? this.getSurplusHeroCardFieldBuilder() : null;
                  } else {
                     this.surplusHeroCardBuilder_.addAllMessages(other.surplusHeroCard_);
                  }
               }

               if (other.hasResolveCardId()) {
                  this.setResolveCardId(other.getResolveCardId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResolveCardId()) {
               return false;
            } else {
               for(int i = 0; i < this.getPresentHeroCardCount(); ++i) {
                  if (!this.getPresentHeroCard(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getSurplusHeroCardCount(); ++i) {
                  if (!this.getSurplusHeroCard(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DismissHeroCard_28608 parsedMessage = null;

            try {
               parsedMessage = (S2C_DismissHeroCard_28608)HeroCardMsg.S2C_DismissHeroCard_28608.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DismissHeroCard_28608)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensurePresentHeroCardIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.presentHeroCard_ = new ArrayList(this.presentHeroCard_);
               this.bitField0_ |= 1;
            }

         }

         public List<HeroCardData> getPresentHeroCardList() {
            return this.presentHeroCardBuilder_ == null ? Collections.unmodifiableList(this.presentHeroCard_) : this.presentHeroCardBuilder_.getMessageList();
         }

         public int getPresentHeroCardCount() {
            return this.presentHeroCardBuilder_ == null ? this.presentHeroCard_.size() : this.presentHeroCardBuilder_.getCount();
         }

         public HeroCardData getPresentHeroCard(int index) {
            return this.presentHeroCardBuilder_ == null ? (HeroCardData)this.presentHeroCard_.get(index) : (HeroCardData)this.presentHeroCardBuilder_.getMessage(index);
         }

         public Builder setPresentHeroCard(int index, HeroCardData value) {
            if (this.presentHeroCardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.set(index, value);
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPresentHeroCard(int index, HeroCardData.Builder builderForValue) {
            if (this.presentHeroCardBuilder_ == null) {
               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPresentHeroCard(HeroCardData value) {
            if (this.presentHeroCardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.add(value);
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPresentHeroCard(int index, HeroCardData value) {
            if (this.presentHeroCardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.add(index, value);
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPresentHeroCard(HeroCardData.Builder builderForValue) {
            if (this.presentHeroCardBuilder_ == null) {
               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPresentHeroCard(int index, HeroCardData.Builder builderForValue) {
            if (this.presentHeroCardBuilder_ == null) {
               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPresentHeroCard(Iterable<? extends HeroCardData> values) {
            if (this.presentHeroCardBuilder_ == null) {
               this.ensurePresentHeroCardIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.presentHeroCard_);
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPresentHeroCard() {
            if (this.presentHeroCardBuilder_ == null) {
               this.presentHeroCard_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.clear();
            }

            return this;
         }

         public Builder removePresentHeroCard(int index) {
            if (this.presentHeroCardBuilder_ == null) {
               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.remove(index);
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.remove(index);
            }

            return this;
         }

         public HeroCardData.Builder getPresentHeroCardBuilder(int index) {
            return (HeroCardData.Builder)this.getPresentHeroCardFieldBuilder().getBuilder(index);
         }

         public HeroCardDataOrBuilder getPresentHeroCardOrBuilder(int index) {
            return this.presentHeroCardBuilder_ == null ? (HeroCardDataOrBuilder)this.presentHeroCard_.get(index) : (HeroCardDataOrBuilder)this.presentHeroCardBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HeroCardDataOrBuilder> getPresentHeroCardOrBuilderList() {
            return this.presentHeroCardBuilder_ != null ? this.presentHeroCardBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.presentHeroCard_);
         }

         public HeroCardData.Builder addPresentHeroCardBuilder() {
            return (HeroCardData.Builder)this.getPresentHeroCardFieldBuilder().addBuilder(HeroCardMsg.HeroCardData.getDefaultInstance());
         }

         public HeroCardData.Builder addPresentHeroCardBuilder(int index) {
            return (HeroCardData.Builder)this.getPresentHeroCardFieldBuilder().addBuilder(index, HeroCardMsg.HeroCardData.getDefaultInstance());
         }

         public List<HeroCardData.Builder> getPresentHeroCardBuilderList() {
            return this.getPresentHeroCardFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HeroCardData, HeroCardData.Builder, HeroCardDataOrBuilder> getPresentHeroCardFieldBuilder() {
            if (this.presentHeroCardBuilder_ == null) {
               this.presentHeroCardBuilder_ = new RepeatedFieldBuilderV3(this.presentHeroCard_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.presentHeroCard_ = null;
            }

            return this.presentHeroCardBuilder_;
         }

         private void ensureSurplusHeroCardIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.surplusHeroCard_ = new ArrayList(this.surplusHeroCard_);
               this.bitField0_ |= 2;
            }

         }

         public List<HeroCardData> getSurplusHeroCardList() {
            return this.surplusHeroCardBuilder_ == null ? Collections.unmodifiableList(this.surplusHeroCard_) : this.surplusHeroCardBuilder_.getMessageList();
         }

         public int getSurplusHeroCardCount() {
            return this.surplusHeroCardBuilder_ == null ? this.surplusHeroCard_.size() : this.surplusHeroCardBuilder_.getCount();
         }

         public HeroCardData getSurplusHeroCard(int index) {
            return this.surplusHeroCardBuilder_ == null ? (HeroCardData)this.surplusHeroCard_.get(index) : (HeroCardData)this.surplusHeroCardBuilder_.getMessage(index);
         }

         public Builder setSurplusHeroCard(int index, HeroCardData value) {
            if (this.surplusHeroCardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSurplusHeroCardIsMutable();
               this.surplusHeroCard_.set(index, value);
               this.onChanged();
            } else {
               this.surplusHeroCardBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setSurplusHeroCard(int index, HeroCardData.Builder builderForValue) {
            if (this.surplusHeroCardBuilder_ == null) {
               this.ensureSurplusHeroCardIsMutable();
               this.surplusHeroCard_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.surplusHeroCardBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addSurplusHeroCard(HeroCardData value) {
            if (this.surplusHeroCardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSurplusHeroCardIsMutable();
               this.surplusHeroCard_.add(value);
               this.onChanged();
            } else {
               this.surplusHeroCardBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addSurplusHeroCard(int index, HeroCardData value) {
            if (this.surplusHeroCardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureSurplusHeroCardIsMutable();
               this.surplusHeroCard_.add(index, value);
               this.onChanged();
            } else {
               this.surplusHeroCardBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addSurplusHeroCard(HeroCardData.Builder builderForValue) {
            if (this.surplusHeroCardBuilder_ == null) {
               this.ensureSurplusHeroCardIsMutable();
               this.surplusHeroCard_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.surplusHeroCardBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addSurplusHeroCard(int index, HeroCardData.Builder builderForValue) {
            if (this.surplusHeroCardBuilder_ == null) {
               this.ensureSurplusHeroCardIsMutable();
               this.surplusHeroCard_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.surplusHeroCardBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllSurplusHeroCard(Iterable<? extends HeroCardData> values) {
            if (this.surplusHeroCardBuilder_ == null) {
               this.ensureSurplusHeroCardIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.surplusHeroCard_);
               this.onChanged();
            } else {
               this.surplusHeroCardBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearSurplusHeroCard() {
            if (this.surplusHeroCardBuilder_ == null) {
               this.surplusHeroCard_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.surplusHeroCardBuilder_.clear();
            }

            return this;
         }

         public Builder removeSurplusHeroCard(int index) {
            if (this.surplusHeroCardBuilder_ == null) {
               this.ensureSurplusHeroCardIsMutable();
               this.surplusHeroCard_.remove(index);
               this.onChanged();
            } else {
               this.surplusHeroCardBuilder_.remove(index);
            }

            return this;
         }

         public HeroCardData.Builder getSurplusHeroCardBuilder(int index) {
            return (HeroCardData.Builder)this.getSurplusHeroCardFieldBuilder().getBuilder(index);
         }

         public HeroCardDataOrBuilder getSurplusHeroCardOrBuilder(int index) {
            return this.surplusHeroCardBuilder_ == null ? (HeroCardDataOrBuilder)this.surplusHeroCard_.get(index) : (HeroCardDataOrBuilder)this.surplusHeroCardBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HeroCardDataOrBuilder> getSurplusHeroCardOrBuilderList() {
            return this.surplusHeroCardBuilder_ != null ? this.surplusHeroCardBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.surplusHeroCard_);
         }

         public HeroCardData.Builder addSurplusHeroCardBuilder() {
            return (HeroCardData.Builder)this.getSurplusHeroCardFieldBuilder().addBuilder(HeroCardMsg.HeroCardData.getDefaultInstance());
         }

         public HeroCardData.Builder addSurplusHeroCardBuilder(int index) {
            return (HeroCardData.Builder)this.getSurplusHeroCardFieldBuilder().addBuilder(index, HeroCardMsg.HeroCardData.getDefaultInstance());
         }

         public List<HeroCardData.Builder> getSurplusHeroCardBuilderList() {
            return this.getSurplusHeroCardFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HeroCardData, HeroCardData.Builder, HeroCardDataOrBuilder> getSurplusHeroCardFieldBuilder() {
            if (this.surplusHeroCardBuilder_ == null) {
               this.surplusHeroCardBuilder_ = new RepeatedFieldBuilderV3(this.surplusHeroCard_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.surplusHeroCard_ = null;
            }

            return this.surplusHeroCardBuilder_;
         }

         public boolean hasResolveCardId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getResolveCardId() {
            return this.resolveCardId_;
         }

         public Builder setResolveCardId(int value) {
            this.bitField0_ |= 4;
            this.resolveCardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResolveCardId() {
            this.bitField0_ &= -5;
            this.resolveCardId_ = 0;
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

   public static final class C2S_BoxLvUp_28609 extends GeneratedMessageV3 implements C2S_BoxLvUp_28609OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_BoxLvUp_28609 DEFAULT_INSTANCE = new C2S_BoxLvUp_28609();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BoxLvUp_28609> PARSER = new AbstractParser<C2S_BoxLvUp_28609>() {
         public C2S_BoxLvUp_28609 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BoxLvUp_28609(input, extensionRegistry);
         }
      };

      private C2S_BoxLvUp_28609(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BoxLvUp_28609() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BoxLvUp_28609();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BoxLvUp_28609(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_BoxLvUp_28609_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_BoxLvUp_28609_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BoxLvUp_28609.class, Builder.class);
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
         } else if (!(obj instanceof C2S_BoxLvUp_28609)) {
            return super.equals(obj);
         } else {
            C2S_BoxLvUp_28609 other = (C2S_BoxLvUp_28609)obj;
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

      public static C2S_BoxLvUp_28609 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BoxLvUp_28609)PARSER.parseFrom(data);
      }

      public static C2S_BoxLvUp_28609 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BoxLvUp_28609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BoxLvUp_28609 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BoxLvUp_28609)PARSER.parseFrom(data);
      }

      public static C2S_BoxLvUp_28609 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BoxLvUp_28609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BoxLvUp_28609 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BoxLvUp_28609)PARSER.parseFrom(data);
      }

      public static C2S_BoxLvUp_28609 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BoxLvUp_28609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BoxLvUp_28609 parseFrom(InputStream input) throws IOException {
         return (C2S_BoxLvUp_28609)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BoxLvUp_28609 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BoxLvUp_28609)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BoxLvUp_28609 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BoxLvUp_28609)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BoxLvUp_28609 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BoxLvUp_28609)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BoxLvUp_28609 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BoxLvUp_28609)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BoxLvUp_28609 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BoxLvUp_28609)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BoxLvUp_28609 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BoxLvUp_28609 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BoxLvUp_28609> parser() {
         return PARSER;
      }

      public Parser<C2S_BoxLvUp_28609> getParserForType() {
         return PARSER;
      }

      public C2S_BoxLvUp_28609 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BoxLvUp_28609OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_BoxLvUp_28609_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_BoxLvUp_28609_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BoxLvUp_28609.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.C2S_BoxLvUp_28609.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_BoxLvUp_28609_descriptor;
         }

         public C2S_BoxLvUp_28609 getDefaultInstanceForType() {
            return HeroCardMsg.C2S_BoxLvUp_28609.getDefaultInstance();
         }

         public C2S_BoxLvUp_28609 build() {
            C2S_BoxLvUp_28609 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BoxLvUp_28609 buildPartial() {
            C2S_BoxLvUp_28609 result = new C2S_BoxLvUp_28609(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_BoxLvUp_28609) {
               return this.mergeFrom((C2S_BoxLvUp_28609)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BoxLvUp_28609 other) {
            if (other == HeroCardMsg.C2S_BoxLvUp_28609.getDefaultInstance()) {
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
            C2S_BoxLvUp_28609 parsedMessage = null;

            try {
               parsedMessage = (C2S_BoxLvUp_28609)HeroCardMsg.C2S_BoxLvUp_28609.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BoxLvUp_28609)e.getUnfinishedMessage();
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

   public static final class S2C_BoxLvUp_28610 extends GeneratedMessageV3 implements S2C_BoxLvUp_28610OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CURBOXLV_FIELD_NUMBER = 1;
      private int curBoxLv_;
      public static final int BOXNEXTLVTIME_FIELD_NUMBER = 2;
      private long boxNextLvTime_;
      private byte memoizedIsInitialized;
      private static final S2C_BoxLvUp_28610 DEFAULT_INSTANCE = new S2C_BoxLvUp_28610();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BoxLvUp_28610> PARSER = new AbstractParser<S2C_BoxLvUp_28610>() {
         public S2C_BoxLvUp_28610 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BoxLvUp_28610(input, extensionRegistry);
         }
      };

      private S2C_BoxLvUp_28610(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BoxLvUp_28610() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BoxLvUp_28610();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BoxLvUp_28610(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.curBoxLv_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.boxNextLvTime_ = input.readInt64();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_BoxLvUp_28610_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_BoxLvUp_28610_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BoxLvUp_28610.class, Builder.class);
      }

      public boolean hasCurBoxLv() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCurBoxLv() {
         return this.curBoxLv_;
      }

      public boolean hasBoxNextLvTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getBoxNextLvTime() {
         return this.boxNextLvTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCurBoxLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.curBoxLv_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(2, this.boxNextLvTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.curBoxLv_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(2, this.boxNextLvTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BoxLvUp_28610)) {
            return super.equals(obj);
         } else {
            S2C_BoxLvUp_28610 other = (S2C_BoxLvUp_28610)obj;
            if (this.hasCurBoxLv() != other.hasCurBoxLv()) {
               return false;
            } else if (this.hasCurBoxLv() && this.getCurBoxLv() != other.getCurBoxLv()) {
               return false;
            } else if (this.hasBoxNextLvTime() != other.hasBoxNextLvTime()) {
               return false;
            } else if (this.hasBoxNextLvTime() && this.getBoxNextLvTime() != other.getBoxNextLvTime()) {
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
            if (this.hasCurBoxLv()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCurBoxLv();
            }

            if (this.hasBoxNextLvTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getBoxNextLvTime());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BoxLvUp_28610 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BoxLvUp_28610)PARSER.parseFrom(data);
      }

      public static S2C_BoxLvUp_28610 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BoxLvUp_28610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BoxLvUp_28610 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BoxLvUp_28610)PARSER.parseFrom(data);
      }

      public static S2C_BoxLvUp_28610 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BoxLvUp_28610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BoxLvUp_28610 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BoxLvUp_28610)PARSER.parseFrom(data);
      }

      public static S2C_BoxLvUp_28610 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BoxLvUp_28610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BoxLvUp_28610 parseFrom(InputStream input) throws IOException {
         return (S2C_BoxLvUp_28610)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BoxLvUp_28610 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BoxLvUp_28610)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BoxLvUp_28610 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BoxLvUp_28610)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BoxLvUp_28610 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BoxLvUp_28610)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BoxLvUp_28610 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BoxLvUp_28610)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BoxLvUp_28610 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BoxLvUp_28610)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BoxLvUp_28610 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BoxLvUp_28610 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BoxLvUp_28610> parser() {
         return PARSER;
      }

      public Parser<S2C_BoxLvUp_28610> getParserForType() {
         return PARSER;
      }

      public S2C_BoxLvUp_28610 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BoxLvUp_28610OrBuilder {
         private int bitField0_;
         private int curBoxLv_;
         private long boxNextLvTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_BoxLvUp_28610_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_BoxLvUp_28610_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BoxLvUp_28610.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.S2C_BoxLvUp_28610.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.curBoxLv_ = 0;
            this.bitField0_ &= -2;
            this.boxNextLvTime_ = 0L;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_BoxLvUp_28610_descriptor;
         }

         public S2C_BoxLvUp_28610 getDefaultInstanceForType() {
            return HeroCardMsg.S2C_BoxLvUp_28610.getDefaultInstance();
         }

         public S2C_BoxLvUp_28610 build() {
            S2C_BoxLvUp_28610 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BoxLvUp_28610 buildPartial() {
            S2C_BoxLvUp_28610 result = new S2C_BoxLvUp_28610(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.curBoxLv_ = this.curBoxLv_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.boxNextLvTime_ = this.boxNextLvTime_;
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
            if (other instanceof S2C_BoxLvUp_28610) {
               return this.mergeFrom((S2C_BoxLvUp_28610)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BoxLvUp_28610 other) {
            if (other == HeroCardMsg.S2C_BoxLvUp_28610.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCurBoxLv()) {
                  this.setCurBoxLv(other.getCurBoxLv());
               }

               if (other.hasBoxNextLvTime()) {
                  this.setBoxNextLvTime(other.getBoxNextLvTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCurBoxLv();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BoxLvUp_28610 parsedMessage = null;

            try {
               parsedMessage = (S2C_BoxLvUp_28610)HeroCardMsg.S2C_BoxLvUp_28610.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BoxLvUp_28610)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCurBoxLv() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCurBoxLv() {
            return this.curBoxLv_;
         }

         public Builder setCurBoxLv(int value) {
            this.bitField0_ |= 1;
            this.curBoxLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCurBoxLv() {
            this.bitField0_ &= -2;
            this.curBoxLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBoxNextLvTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getBoxNextLvTime() {
            return this.boxNextLvTime_;
         }

         public Builder setBoxNextLvTime(long value) {
            this.bitField0_ |= 2;
            this.boxNextLvTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBoxNextLvTime() {
            this.bitField0_ &= -3;
            this.boxNextLvTime_ = 0L;
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

   public static final class C2S_CutTime_28611 extends GeneratedMessageV3 implements C2S_CutTime_28611OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int COST_FIELD_NUMBER = 1;
      private List<CommonMsg.ItemInfo> cost_;
      private byte memoizedIsInitialized;
      private static final C2S_CutTime_28611 DEFAULT_INSTANCE = new C2S_CutTime_28611();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CutTime_28611> PARSER = new AbstractParser<C2S_CutTime_28611>() {
         public C2S_CutTime_28611 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CutTime_28611(input, extensionRegistry);
         }
      };

      private C2S_CutTime_28611(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CutTime_28611() {
         this.memoizedIsInitialized = -1;
         this.cost_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CutTime_28611();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CutTime_28611(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.cost_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.cost_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.cost_ = Collections.unmodifiableList(this.cost_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_CutTime_28611_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_CutTime_28611_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CutTime_28611.class, Builder.class);
      }

      public List<CommonMsg.ItemInfo> getCostList() {
         return this.cost_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getCostOrBuilderList() {
         return this.cost_;
      }

      public int getCostCount() {
         return this.cost_.size();
      }

      public CommonMsg.ItemInfo getCost(int index) {
         return (CommonMsg.ItemInfo)this.cost_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getCostOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.cost_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getCostCount(); ++i) {
               if (!this.getCost(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.cost_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.cost_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.cost_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.cost_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_CutTime_28611)) {
            return super.equals(obj);
         } else {
            C2S_CutTime_28611 other = (C2S_CutTime_28611)obj;
            if (!this.getCostList().equals(other.getCostList())) {
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
            if (this.getCostCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCostList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_CutTime_28611 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CutTime_28611)PARSER.parseFrom(data);
      }

      public static C2S_CutTime_28611 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CutTime_28611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CutTime_28611 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CutTime_28611)PARSER.parseFrom(data);
      }

      public static C2S_CutTime_28611 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CutTime_28611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CutTime_28611 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CutTime_28611)PARSER.parseFrom(data);
      }

      public static C2S_CutTime_28611 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CutTime_28611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CutTime_28611 parseFrom(InputStream input) throws IOException {
         return (C2S_CutTime_28611)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CutTime_28611 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CutTime_28611)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CutTime_28611 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CutTime_28611)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CutTime_28611 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CutTime_28611)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CutTime_28611 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CutTime_28611)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CutTime_28611 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CutTime_28611)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CutTime_28611 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CutTime_28611 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CutTime_28611> parser() {
         return PARSER;
      }

      public Parser<C2S_CutTime_28611> getParserForType() {
         return PARSER;
      }

      public C2S_CutTime_28611 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CutTime_28611OrBuilder {
         private int bitField0_;
         private List<CommonMsg.ItemInfo> cost_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> costBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_CutTime_28611_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_CutTime_28611_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CutTime_28611.class, Builder.class);
         }

         private Builder() {
            this.cost_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.cost_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.C2S_CutTime_28611.alwaysUseFieldBuilders) {
               this.getCostFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.costBuilder_ == null) {
               this.cost_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.costBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_CutTime_28611_descriptor;
         }

         public C2S_CutTime_28611 getDefaultInstanceForType() {
            return HeroCardMsg.C2S_CutTime_28611.getDefaultInstance();
         }

         public C2S_CutTime_28611 build() {
            C2S_CutTime_28611 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CutTime_28611 buildPartial() {
            C2S_CutTime_28611 result = new C2S_CutTime_28611(this);
            int from_bitField0_ = this.bitField0_;
            if (this.costBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.cost_ = Collections.unmodifiableList(this.cost_);
                  this.bitField0_ &= -2;
               }

               result.cost_ = this.cost_;
            } else {
               result.cost_ = this.costBuilder_.build();
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
            if (other instanceof C2S_CutTime_28611) {
               return this.mergeFrom((C2S_CutTime_28611)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CutTime_28611 other) {
            if (other == HeroCardMsg.C2S_CutTime_28611.getDefaultInstance()) {
               return this;
            } else {
               if (this.costBuilder_ == null) {
                  if (!other.cost_.isEmpty()) {
                     if (this.cost_.isEmpty()) {
                        this.cost_ = other.cost_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureCostIsMutable();
                        this.cost_.addAll(other.cost_);
                     }

                     this.onChanged();
                  }
               } else if (!other.cost_.isEmpty()) {
                  if (this.costBuilder_.isEmpty()) {
                     this.costBuilder_.dispose();
                     this.costBuilder_ = null;
                     this.cost_ = other.cost_;
                     this.bitField0_ &= -2;
                     this.costBuilder_ = HeroCardMsg.C2S_CutTime_28611.alwaysUseFieldBuilders ? this.getCostFieldBuilder() : null;
                  } else {
                     this.costBuilder_.addAllMessages(other.cost_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getCostCount(); ++i) {
               if (!this.getCost(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_CutTime_28611 parsedMessage = null;

            try {
               parsedMessage = (C2S_CutTime_28611)HeroCardMsg.C2S_CutTime_28611.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CutTime_28611)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureCostIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.cost_ = new ArrayList(this.cost_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.ItemInfo> getCostList() {
            return this.costBuilder_ == null ? Collections.unmodifiableList(this.cost_) : this.costBuilder_.getMessageList();
         }

         public int getCostCount() {
            return this.costBuilder_ == null ? this.cost_.size() : this.costBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getCost(int index) {
            return this.costBuilder_ == null ? (CommonMsg.ItemInfo)this.cost_.get(index) : (CommonMsg.ItemInfo)this.costBuilder_.getMessage(index);
         }

         public Builder setCost(int index, CommonMsg.ItemInfo value) {
            if (this.costBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCostIsMutable();
               this.cost_.set(index, value);
               this.onChanged();
            } else {
               this.costBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setCost(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.costBuilder_ == null) {
               this.ensureCostIsMutable();
               this.cost_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.costBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addCost(CommonMsg.ItemInfo value) {
            if (this.costBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCostIsMutable();
               this.cost_.add(value);
               this.onChanged();
            } else {
               this.costBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addCost(int index, CommonMsg.ItemInfo value) {
            if (this.costBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCostIsMutable();
               this.cost_.add(index, value);
               this.onChanged();
            } else {
               this.costBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addCost(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.costBuilder_ == null) {
               this.ensureCostIsMutable();
               this.cost_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.costBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addCost(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.costBuilder_ == null) {
               this.ensureCostIsMutable();
               this.cost_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.costBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllCost(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.costBuilder_ == null) {
               this.ensureCostIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.cost_);
               this.onChanged();
            } else {
               this.costBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearCost() {
            if (this.costBuilder_ == null) {
               this.cost_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.costBuilder_.clear();
            }

            return this;
         }

         public Builder removeCost(int index) {
            if (this.costBuilder_ == null) {
               this.ensureCostIsMutable();
               this.cost_.remove(index);
               this.onChanged();
            } else {
               this.costBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getCostBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getCostFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getCostOrBuilder(int index) {
            return this.costBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.cost_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.costBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getCostOrBuilderList() {
            return this.costBuilder_ != null ? this.costBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.cost_);
         }

         public CommonMsg.ItemInfo.Builder addCostBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getCostFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addCostBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getCostFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getCostBuilderList() {
            return this.getCostFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getCostFieldBuilder() {
            if (this.costBuilder_ == null) {
               this.costBuilder_ = new RepeatedFieldBuilderV3(this.cost_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.cost_ = null;
            }

            return this.costBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_CutTime_28612 extends GeneratedMessageV3 implements S2C_CutTime_28612OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CURBOXLV_FIELD_NUMBER = 1;
      private int curBoxLv_;
      public static final int BOXNEXTLVTIME_FIELD_NUMBER = 2;
      private long boxNextLvTime_;
      private byte memoizedIsInitialized;
      private static final S2C_CutTime_28612 DEFAULT_INSTANCE = new S2C_CutTime_28612();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CutTime_28612> PARSER = new AbstractParser<S2C_CutTime_28612>() {
         public S2C_CutTime_28612 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CutTime_28612(input, extensionRegistry);
         }
      };

      private S2C_CutTime_28612(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CutTime_28612() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CutTime_28612();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CutTime_28612(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.curBoxLv_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.boxNextLvTime_ = input.readInt64();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_CutTime_28612_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_CutTime_28612_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CutTime_28612.class, Builder.class);
      }

      public boolean hasCurBoxLv() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCurBoxLv() {
         return this.curBoxLv_;
      }

      public boolean hasBoxNextLvTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getBoxNextLvTime() {
         return this.boxNextLvTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCurBoxLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.curBoxLv_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(2, this.boxNextLvTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.curBoxLv_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(2, this.boxNextLvTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CutTime_28612)) {
            return super.equals(obj);
         } else {
            S2C_CutTime_28612 other = (S2C_CutTime_28612)obj;
            if (this.hasCurBoxLv() != other.hasCurBoxLv()) {
               return false;
            } else if (this.hasCurBoxLv() && this.getCurBoxLv() != other.getCurBoxLv()) {
               return false;
            } else if (this.hasBoxNextLvTime() != other.hasBoxNextLvTime()) {
               return false;
            } else if (this.hasBoxNextLvTime() && this.getBoxNextLvTime() != other.getBoxNextLvTime()) {
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
            if (this.hasCurBoxLv()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCurBoxLv();
            }

            if (this.hasBoxNextLvTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getBoxNextLvTime());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CutTime_28612 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CutTime_28612)PARSER.parseFrom(data);
      }

      public static S2C_CutTime_28612 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CutTime_28612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CutTime_28612 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CutTime_28612)PARSER.parseFrom(data);
      }

      public static S2C_CutTime_28612 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CutTime_28612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CutTime_28612 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CutTime_28612)PARSER.parseFrom(data);
      }

      public static S2C_CutTime_28612 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CutTime_28612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CutTime_28612 parseFrom(InputStream input) throws IOException {
         return (S2C_CutTime_28612)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CutTime_28612 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CutTime_28612)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CutTime_28612 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CutTime_28612)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CutTime_28612 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CutTime_28612)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CutTime_28612 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CutTime_28612)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CutTime_28612 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CutTime_28612)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CutTime_28612 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CutTime_28612 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CutTime_28612> parser() {
         return PARSER;
      }

      public Parser<S2C_CutTime_28612> getParserForType() {
         return PARSER;
      }

      public S2C_CutTime_28612 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CutTime_28612OrBuilder {
         private int bitField0_;
         private int curBoxLv_;
         private long boxNextLvTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_CutTime_28612_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_CutTime_28612_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CutTime_28612.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.S2C_CutTime_28612.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.curBoxLv_ = 0;
            this.bitField0_ &= -2;
            this.boxNextLvTime_ = 0L;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_CutTime_28612_descriptor;
         }

         public S2C_CutTime_28612 getDefaultInstanceForType() {
            return HeroCardMsg.S2C_CutTime_28612.getDefaultInstance();
         }

         public S2C_CutTime_28612 build() {
            S2C_CutTime_28612 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CutTime_28612 buildPartial() {
            S2C_CutTime_28612 result = new S2C_CutTime_28612(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.curBoxLv_ = this.curBoxLv_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.boxNextLvTime_ = this.boxNextLvTime_;
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
            if (other instanceof S2C_CutTime_28612) {
               return this.mergeFrom((S2C_CutTime_28612)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CutTime_28612 other) {
            if (other == HeroCardMsg.S2C_CutTime_28612.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCurBoxLv()) {
                  this.setCurBoxLv(other.getCurBoxLv());
               }

               if (other.hasBoxNextLvTime()) {
                  this.setBoxNextLvTime(other.getBoxNextLvTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCurBoxLv();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_CutTime_28612 parsedMessage = null;

            try {
               parsedMessage = (S2C_CutTime_28612)HeroCardMsg.S2C_CutTime_28612.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CutTime_28612)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCurBoxLv() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCurBoxLv() {
            return this.curBoxLv_;
         }

         public Builder setCurBoxLv(int value) {
            this.bitField0_ |= 1;
            this.curBoxLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCurBoxLv() {
            this.bitField0_ &= -2;
            this.curBoxLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBoxNextLvTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getBoxNextLvTime() {
            return this.boxNextLvTime_;
         }

         public Builder setBoxNextLvTime(long value) {
            this.bitField0_ |= 2;
            this.boxNextLvTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBoxNextLvTime() {
            this.bitField0_ &= -3;
            this.boxNextLvTime_ = 0L;
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

   public static final class OptionVal extends GeneratedMessageV3 implements OptionValOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int OPTION_FIELD_NUMBER = 1;
      private int option_;
      public static final int VAL_FIELD_NUMBER = 2;
      private int val_;
      private byte memoizedIsInitialized;
      private static final OptionVal DEFAULT_INSTANCE = new OptionVal();
      /** @deprecated */
      @Deprecated
      public static final Parser<OptionVal> PARSER = new AbstractParser<OptionVal>() {
         public OptionVal parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new OptionVal(input, extensionRegistry);
         }
      };

      private OptionVal(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private OptionVal() {
         this.memoizedIsInitialized = -1;
         this.option_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new OptionVal();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private OptionVal(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        OptionEnum value = HeroCardMsg.OptionEnum.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.option_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.val_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_OptionVal_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_OptionVal_fieldAccessorTable.ensureFieldAccessorsInitialized(OptionVal.class, Builder.class);
      }

      public boolean hasOption() {
         return (this.bitField0_ & 1) != 0;
      }

      public OptionEnum getOption() {
         OptionEnum result = HeroCardMsg.OptionEnum.valueOf(this.option_);
         return result == null ? HeroCardMsg.OptionEnum.QUALITY : result;
      }

      public boolean hasVal() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getVal() {
         return this.val_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasOption()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.option_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.val_);
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
               size += CodedOutputStream.computeEnumSize(1, this.option_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.val_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof OptionVal)) {
            return super.equals(obj);
         } else {
            OptionVal other = (OptionVal)obj;
            if (this.hasOption() != other.hasOption()) {
               return false;
            } else if (this.hasOption() && this.option_ != other.option_) {
               return false;
            } else if (this.hasVal() != other.hasVal()) {
               return false;
            } else if (this.hasVal() && this.getVal() != other.getVal()) {
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
            if (this.hasOption()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.option_;
            }

            if (this.hasVal()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getVal();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static OptionVal parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (OptionVal)PARSER.parseFrom(data);
      }

      public static OptionVal parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (OptionVal)PARSER.parseFrom(data, extensionRegistry);
      }

      public static OptionVal parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (OptionVal)PARSER.parseFrom(data);
      }

      public static OptionVal parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (OptionVal)PARSER.parseFrom(data, extensionRegistry);
      }

      public static OptionVal parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (OptionVal)PARSER.parseFrom(data);
      }

      public static OptionVal parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (OptionVal)PARSER.parseFrom(data, extensionRegistry);
      }

      public static OptionVal parseFrom(InputStream input) throws IOException {
         return (OptionVal)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static OptionVal parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (OptionVal)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static OptionVal parseDelimitedFrom(InputStream input) throws IOException {
         return (OptionVal)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static OptionVal parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (OptionVal)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static OptionVal parseFrom(CodedInputStream input) throws IOException {
         return (OptionVal)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static OptionVal parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (OptionVal)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(OptionVal prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static OptionVal getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<OptionVal> parser() {
         return PARSER;
      }

      public Parser<OptionVal> getParserForType() {
         return PARSER;
      }

      public OptionVal getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OptionValOrBuilder {
         private int bitField0_;
         private int option_;
         private int val_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_OptionVal_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_OptionVal_fieldAccessorTable.ensureFieldAccessorsInitialized(OptionVal.class, Builder.class);
         }

         private Builder() {
            this.option_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.option_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.OptionVal.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.option_ = 1;
            this.bitField0_ &= -2;
            this.val_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_OptionVal_descriptor;
         }

         public OptionVal getDefaultInstanceForType() {
            return HeroCardMsg.OptionVal.getDefaultInstance();
         }

         public OptionVal build() {
            OptionVal result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public OptionVal buildPartial() {
            OptionVal result = new OptionVal(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.option_ = this.option_;
            if ((from_bitField0_ & 2) != 0) {
               result.val_ = this.val_;
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
            if (other instanceof OptionVal) {
               return this.mergeFrom((OptionVal)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(OptionVal other) {
            if (other == HeroCardMsg.OptionVal.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOption()) {
                  this.setOption(other.getOption());
               }

               if (other.hasVal()) {
                  this.setVal(other.getVal());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasOption();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            OptionVal parsedMessage = null;

            try {
               parsedMessage = (OptionVal)HeroCardMsg.OptionVal.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (OptionVal)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasOption() {
            return (this.bitField0_ & 1) != 0;
         }

         public OptionEnum getOption() {
            OptionEnum result = HeroCardMsg.OptionEnum.valueOf(this.option_);
            return result == null ? HeroCardMsg.OptionEnum.QUALITY : result;
         }

         public Builder setOption(OptionEnum value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.option_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearOption() {
            this.bitField0_ &= -2;
            this.option_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasVal() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getVal() {
            return this.val_;
         }

         public Builder setVal(int value) {
            this.bitField0_ |= 2;
            this.val_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearVal() {
            this.bitField0_ &= -3;
            this.val_ = 0;
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

   public static final class C2S_Option_28613 extends GeneratedMessageV3 implements C2S_Option_28613OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int LOTTERYOPTION_FIELD_NUMBER = 1;
      private List<OptionVal> lotteryOption_;
      private byte memoizedIsInitialized;
      private static final C2S_Option_28613 DEFAULT_INSTANCE = new C2S_Option_28613();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Option_28613> PARSER = new AbstractParser<C2S_Option_28613>() {
         public C2S_Option_28613 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Option_28613(input, extensionRegistry);
         }
      };

      private C2S_Option_28613(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Option_28613() {
         this.memoizedIsInitialized = -1;
         this.lotteryOption_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Option_28613();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Option_28613(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.lotteryOption_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.lotteryOption_.add(input.readMessage(HeroCardMsg.OptionVal.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.lotteryOption_ = Collections.unmodifiableList(this.lotteryOption_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_Option_28613_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_Option_28613_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Option_28613.class, Builder.class);
      }

      public List<OptionVal> getLotteryOptionList() {
         return this.lotteryOption_;
      }

      public List<? extends OptionValOrBuilder> getLotteryOptionOrBuilderList() {
         return this.lotteryOption_;
      }

      public int getLotteryOptionCount() {
         return this.lotteryOption_.size();
      }

      public OptionVal getLotteryOption(int index) {
         return (OptionVal)this.lotteryOption_.get(index);
      }

      public OptionValOrBuilder getLotteryOptionOrBuilder(int index) {
         return (OptionValOrBuilder)this.lotteryOption_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getLotteryOptionCount(); ++i) {
               if (!this.getLotteryOption(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.lotteryOption_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.lotteryOption_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.lotteryOption_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.lotteryOption_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Option_28613)) {
            return super.equals(obj);
         } else {
            C2S_Option_28613 other = (C2S_Option_28613)obj;
            if (!this.getLotteryOptionList().equals(other.getLotteryOptionList())) {
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
            if (this.getLotteryOptionCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLotteryOptionList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Option_28613 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Option_28613)PARSER.parseFrom(data);
      }

      public static C2S_Option_28613 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Option_28613)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Option_28613 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Option_28613)PARSER.parseFrom(data);
      }

      public static C2S_Option_28613 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Option_28613)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Option_28613 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Option_28613)PARSER.parseFrom(data);
      }

      public static C2S_Option_28613 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Option_28613)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Option_28613 parseFrom(InputStream input) throws IOException {
         return (C2S_Option_28613)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Option_28613 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Option_28613)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Option_28613 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Option_28613)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Option_28613 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Option_28613)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Option_28613 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Option_28613)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Option_28613 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Option_28613)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Option_28613 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Option_28613 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Option_28613> parser() {
         return PARSER;
      }

      public Parser<C2S_Option_28613> getParserForType() {
         return PARSER;
      }

      public C2S_Option_28613 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Option_28613OrBuilder {
         private int bitField0_;
         private List<OptionVal> lotteryOption_;
         private RepeatedFieldBuilderV3<OptionVal, OptionVal.Builder, OptionValOrBuilder> lotteryOptionBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_Option_28613_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_Option_28613_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Option_28613.class, Builder.class);
         }

         private Builder() {
            this.lotteryOption_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.lotteryOption_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.C2S_Option_28613.alwaysUseFieldBuilders) {
               this.getLotteryOptionFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.lotteryOptionBuilder_ == null) {
               this.lotteryOption_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.lotteryOptionBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_Option_28613_descriptor;
         }

         public C2S_Option_28613 getDefaultInstanceForType() {
            return HeroCardMsg.C2S_Option_28613.getDefaultInstance();
         }

         public C2S_Option_28613 build() {
            C2S_Option_28613 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Option_28613 buildPartial() {
            C2S_Option_28613 result = new C2S_Option_28613(this);
            int from_bitField0_ = this.bitField0_;
            if (this.lotteryOptionBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.lotteryOption_ = Collections.unmodifiableList(this.lotteryOption_);
                  this.bitField0_ &= -2;
               }

               result.lotteryOption_ = this.lotteryOption_;
            } else {
               result.lotteryOption_ = this.lotteryOptionBuilder_.build();
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
            if (other instanceof C2S_Option_28613) {
               return this.mergeFrom((C2S_Option_28613)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Option_28613 other) {
            if (other == HeroCardMsg.C2S_Option_28613.getDefaultInstance()) {
               return this;
            } else {
               if (this.lotteryOptionBuilder_ == null) {
                  if (!other.lotteryOption_.isEmpty()) {
                     if (this.lotteryOption_.isEmpty()) {
                        this.lotteryOption_ = other.lotteryOption_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureLotteryOptionIsMutable();
                        this.lotteryOption_.addAll(other.lotteryOption_);
                     }

                     this.onChanged();
                  }
               } else if (!other.lotteryOption_.isEmpty()) {
                  if (this.lotteryOptionBuilder_.isEmpty()) {
                     this.lotteryOptionBuilder_.dispose();
                     this.lotteryOptionBuilder_ = null;
                     this.lotteryOption_ = other.lotteryOption_;
                     this.bitField0_ &= -2;
                     this.lotteryOptionBuilder_ = HeroCardMsg.C2S_Option_28613.alwaysUseFieldBuilders ? this.getLotteryOptionFieldBuilder() : null;
                  } else {
                     this.lotteryOptionBuilder_.addAllMessages(other.lotteryOption_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getLotteryOptionCount(); ++i) {
               if (!this.getLotteryOption(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Option_28613 parsedMessage = null;

            try {
               parsedMessage = (C2S_Option_28613)HeroCardMsg.C2S_Option_28613.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Option_28613)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureLotteryOptionIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.lotteryOption_ = new ArrayList(this.lotteryOption_);
               this.bitField0_ |= 1;
            }

         }

         public List<OptionVal> getLotteryOptionList() {
            return this.lotteryOptionBuilder_ == null ? Collections.unmodifiableList(this.lotteryOption_) : this.lotteryOptionBuilder_.getMessageList();
         }

         public int getLotteryOptionCount() {
            return this.lotteryOptionBuilder_ == null ? this.lotteryOption_.size() : this.lotteryOptionBuilder_.getCount();
         }

         public OptionVal getLotteryOption(int index) {
            return this.lotteryOptionBuilder_ == null ? (OptionVal)this.lotteryOption_.get(index) : (OptionVal)this.lotteryOptionBuilder_.getMessage(index);
         }

         public Builder setLotteryOption(int index, OptionVal value) {
            if (this.lotteryOptionBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLotteryOptionIsMutable();
               this.lotteryOption_.set(index, value);
               this.onChanged();
            } else {
               this.lotteryOptionBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setLotteryOption(int index, OptionVal.Builder builderForValue) {
            if (this.lotteryOptionBuilder_ == null) {
               this.ensureLotteryOptionIsMutable();
               this.lotteryOption_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.lotteryOptionBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addLotteryOption(OptionVal value) {
            if (this.lotteryOptionBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLotteryOptionIsMutable();
               this.lotteryOption_.add(value);
               this.onChanged();
            } else {
               this.lotteryOptionBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addLotteryOption(int index, OptionVal value) {
            if (this.lotteryOptionBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLotteryOptionIsMutable();
               this.lotteryOption_.add(index, value);
               this.onChanged();
            } else {
               this.lotteryOptionBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addLotteryOption(OptionVal.Builder builderForValue) {
            if (this.lotteryOptionBuilder_ == null) {
               this.ensureLotteryOptionIsMutable();
               this.lotteryOption_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.lotteryOptionBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addLotteryOption(int index, OptionVal.Builder builderForValue) {
            if (this.lotteryOptionBuilder_ == null) {
               this.ensureLotteryOptionIsMutable();
               this.lotteryOption_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.lotteryOptionBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllLotteryOption(Iterable<? extends OptionVal> values) {
            if (this.lotteryOptionBuilder_ == null) {
               this.ensureLotteryOptionIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.lotteryOption_);
               this.onChanged();
            } else {
               this.lotteryOptionBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearLotteryOption() {
            if (this.lotteryOptionBuilder_ == null) {
               this.lotteryOption_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.lotteryOptionBuilder_.clear();
            }

            return this;
         }

         public Builder removeLotteryOption(int index) {
            if (this.lotteryOptionBuilder_ == null) {
               this.ensureLotteryOptionIsMutable();
               this.lotteryOption_.remove(index);
               this.onChanged();
            } else {
               this.lotteryOptionBuilder_.remove(index);
            }

            return this;
         }

         public OptionVal.Builder getLotteryOptionBuilder(int index) {
            return (OptionVal.Builder)this.getLotteryOptionFieldBuilder().getBuilder(index);
         }

         public OptionValOrBuilder getLotteryOptionOrBuilder(int index) {
            return this.lotteryOptionBuilder_ == null ? (OptionValOrBuilder)this.lotteryOption_.get(index) : (OptionValOrBuilder)this.lotteryOptionBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends OptionValOrBuilder> getLotteryOptionOrBuilderList() {
            return this.lotteryOptionBuilder_ != null ? this.lotteryOptionBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.lotteryOption_);
         }

         public OptionVal.Builder addLotteryOptionBuilder() {
            return (OptionVal.Builder)this.getLotteryOptionFieldBuilder().addBuilder(HeroCardMsg.OptionVal.getDefaultInstance());
         }

         public OptionVal.Builder addLotteryOptionBuilder(int index) {
            return (OptionVal.Builder)this.getLotteryOptionFieldBuilder().addBuilder(index, HeroCardMsg.OptionVal.getDefaultInstance());
         }

         public List<OptionVal.Builder> getLotteryOptionBuilderList() {
            return this.getLotteryOptionFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<OptionVal, OptionVal.Builder, OptionValOrBuilder> getLotteryOptionFieldBuilder() {
            if (this.lotteryOptionBuilder_ == null) {
               this.lotteryOptionBuilder_ = new RepeatedFieldBuilderV3(this.lotteryOption_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.lotteryOption_ = null;
            }

            return this.lotteryOptionBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_Option_28614 extends GeneratedMessageV3 implements S2C_Option_28614OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int LOTTERYOPTION_FIELD_NUMBER = 1;
      private List<OptionVal> lotteryOption_;
      private byte memoizedIsInitialized;
      private static final S2C_Option_28614 DEFAULT_INSTANCE = new S2C_Option_28614();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Option_28614> PARSER = new AbstractParser<S2C_Option_28614>() {
         public S2C_Option_28614 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Option_28614(input, extensionRegistry);
         }
      };

      private S2C_Option_28614(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Option_28614() {
         this.memoizedIsInitialized = -1;
         this.lotteryOption_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Option_28614();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Option_28614(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.lotteryOption_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.lotteryOption_.add(input.readMessage(HeroCardMsg.OptionVal.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.lotteryOption_ = Collections.unmodifiableList(this.lotteryOption_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_Option_28614_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_Option_28614_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Option_28614.class, Builder.class);
      }

      public List<OptionVal> getLotteryOptionList() {
         return this.lotteryOption_;
      }

      public List<? extends OptionValOrBuilder> getLotteryOptionOrBuilderList() {
         return this.lotteryOption_;
      }

      public int getLotteryOptionCount() {
         return this.lotteryOption_.size();
      }

      public OptionVal getLotteryOption(int index) {
         return (OptionVal)this.lotteryOption_.get(index);
      }

      public OptionValOrBuilder getLotteryOptionOrBuilder(int index) {
         return (OptionValOrBuilder)this.lotteryOption_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getLotteryOptionCount(); ++i) {
               if (!this.getLotteryOption(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.lotteryOption_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.lotteryOption_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.lotteryOption_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.lotteryOption_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Option_28614)) {
            return super.equals(obj);
         } else {
            S2C_Option_28614 other = (S2C_Option_28614)obj;
            if (!this.getLotteryOptionList().equals(other.getLotteryOptionList())) {
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
            if (this.getLotteryOptionCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLotteryOptionList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Option_28614 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Option_28614)PARSER.parseFrom(data);
      }

      public static S2C_Option_28614 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Option_28614)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Option_28614 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Option_28614)PARSER.parseFrom(data);
      }

      public static S2C_Option_28614 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Option_28614)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Option_28614 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Option_28614)PARSER.parseFrom(data);
      }

      public static S2C_Option_28614 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Option_28614)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Option_28614 parseFrom(InputStream input) throws IOException {
         return (S2C_Option_28614)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Option_28614 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Option_28614)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Option_28614 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Option_28614)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Option_28614 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Option_28614)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Option_28614 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Option_28614)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Option_28614 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Option_28614)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Option_28614 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Option_28614 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Option_28614> parser() {
         return PARSER;
      }

      public Parser<S2C_Option_28614> getParserForType() {
         return PARSER;
      }

      public S2C_Option_28614 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Option_28614OrBuilder {
         private int bitField0_;
         private List<OptionVal> lotteryOption_;
         private RepeatedFieldBuilderV3<OptionVal, OptionVal.Builder, OptionValOrBuilder> lotteryOptionBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_Option_28614_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_Option_28614_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Option_28614.class, Builder.class);
         }

         private Builder() {
            this.lotteryOption_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.lotteryOption_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.S2C_Option_28614.alwaysUseFieldBuilders) {
               this.getLotteryOptionFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.lotteryOptionBuilder_ == null) {
               this.lotteryOption_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.lotteryOptionBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_Option_28614_descriptor;
         }

         public S2C_Option_28614 getDefaultInstanceForType() {
            return HeroCardMsg.S2C_Option_28614.getDefaultInstance();
         }

         public S2C_Option_28614 build() {
            S2C_Option_28614 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Option_28614 buildPartial() {
            S2C_Option_28614 result = new S2C_Option_28614(this);
            int from_bitField0_ = this.bitField0_;
            if (this.lotteryOptionBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.lotteryOption_ = Collections.unmodifiableList(this.lotteryOption_);
                  this.bitField0_ &= -2;
               }

               result.lotteryOption_ = this.lotteryOption_;
            } else {
               result.lotteryOption_ = this.lotteryOptionBuilder_.build();
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
            if (other instanceof S2C_Option_28614) {
               return this.mergeFrom((S2C_Option_28614)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Option_28614 other) {
            if (other == HeroCardMsg.S2C_Option_28614.getDefaultInstance()) {
               return this;
            } else {
               if (this.lotteryOptionBuilder_ == null) {
                  if (!other.lotteryOption_.isEmpty()) {
                     if (this.lotteryOption_.isEmpty()) {
                        this.lotteryOption_ = other.lotteryOption_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureLotteryOptionIsMutable();
                        this.lotteryOption_.addAll(other.lotteryOption_);
                     }

                     this.onChanged();
                  }
               } else if (!other.lotteryOption_.isEmpty()) {
                  if (this.lotteryOptionBuilder_.isEmpty()) {
                     this.lotteryOptionBuilder_.dispose();
                     this.lotteryOptionBuilder_ = null;
                     this.lotteryOption_ = other.lotteryOption_;
                     this.bitField0_ &= -2;
                     this.lotteryOptionBuilder_ = HeroCardMsg.S2C_Option_28614.alwaysUseFieldBuilders ? this.getLotteryOptionFieldBuilder() : null;
                  } else {
                     this.lotteryOptionBuilder_.addAllMessages(other.lotteryOption_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getLotteryOptionCount(); ++i) {
               if (!this.getLotteryOption(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Option_28614 parsedMessage = null;

            try {
               parsedMessage = (S2C_Option_28614)HeroCardMsg.S2C_Option_28614.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Option_28614)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureLotteryOptionIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.lotteryOption_ = new ArrayList(this.lotteryOption_);
               this.bitField0_ |= 1;
            }

         }

         public List<OptionVal> getLotteryOptionList() {
            return this.lotteryOptionBuilder_ == null ? Collections.unmodifiableList(this.lotteryOption_) : this.lotteryOptionBuilder_.getMessageList();
         }

         public int getLotteryOptionCount() {
            return this.lotteryOptionBuilder_ == null ? this.lotteryOption_.size() : this.lotteryOptionBuilder_.getCount();
         }

         public OptionVal getLotteryOption(int index) {
            return this.lotteryOptionBuilder_ == null ? (OptionVal)this.lotteryOption_.get(index) : (OptionVal)this.lotteryOptionBuilder_.getMessage(index);
         }

         public Builder setLotteryOption(int index, OptionVal value) {
            if (this.lotteryOptionBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLotteryOptionIsMutable();
               this.lotteryOption_.set(index, value);
               this.onChanged();
            } else {
               this.lotteryOptionBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setLotteryOption(int index, OptionVal.Builder builderForValue) {
            if (this.lotteryOptionBuilder_ == null) {
               this.ensureLotteryOptionIsMutable();
               this.lotteryOption_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.lotteryOptionBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addLotteryOption(OptionVal value) {
            if (this.lotteryOptionBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLotteryOptionIsMutable();
               this.lotteryOption_.add(value);
               this.onChanged();
            } else {
               this.lotteryOptionBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addLotteryOption(int index, OptionVal value) {
            if (this.lotteryOptionBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLotteryOptionIsMutable();
               this.lotteryOption_.add(index, value);
               this.onChanged();
            } else {
               this.lotteryOptionBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addLotteryOption(OptionVal.Builder builderForValue) {
            if (this.lotteryOptionBuilder_ == null) {
               this.ensureLotteryOptionIsMutable();
               this.lotteryOption_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.lotteryOptionBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addLotteryOption(int index, OptionVal.Builder builderForValue) {
            if (this.lotteryOptionBuilder_ == null) {
               this.ensureLotteryOptionIsMutable();
               this.lotteryOption_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.lotteryOptionBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllLotteryOption(Iterable<? extends OptionVal> values) {
            if (this.lotteryOptionBuilder_ == null) {
               this.ensureLotteryOptionIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.lotteryOption_);
               this.onChanged();
            } else {
               this.lotteryOptionBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearLotteryOption() {
            if (this.lotteryOptionBuilder_ == null) {
               this.lotteryOption_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.lotteryOptionBuilder_.clear();
            }

            return this;
         }

         public Builder removeLotteryOption(int index) {
            if (this.lotteryOptionBuilder_ == null) {
               this.ensureLotteryOptionIsMutable();
               this.lotteryOption_.remove(index);
               this.onChanged();
            } else {
               this.lotteryOptionBuilder_.remove(index);
            }

            return this;
         }

         public OptionVal.Builder getLotteryOptionBuilder(int index) {
            return (OptionVal.Builder)this.getLotteryOptionFieldBuilder().getBuilder(index);
         }

         public OptionValOrBuilder getLotteryOptionOrBuilder(int index) {
            return this.lotteryOptionBuilder_ == null ? (OptionValOrBuilder)this.lotteryOption_.get(index) : (OptionValOrBuilder)this.lotteryOptionBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends OptionValOrBuilder> getLotteryOptionOrBuilderList() {
            return this.lotteryOptionBuilder_ != null ? this.lotteryOptionBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.lotteryOption_);
         }

         public OptionVal.Builder addLotteryOptionBuilder() {
            return (OptionVal.Builder)this.getLotteryOptionFieldBuilder().addBuilder(HeroCardMsg.OptionVal.getDefaultInstance());
         }

         public OptionVal.Builder addLotteryOptionBuilder(int index) {
            return (OptionVal.Builder)this.getLotteryOptionFieldBuilder().addBuilder(index, HeroCardMsg.OptionVal.getDefaultInstance());
         }

         public List<OptionVal.Builder> getLotteryOptionBuilderList() {
            return this.getLotteryOptionFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<OptionVal, OptionVal.Builder, OptionValOrBuilder> getLotteryOptionFieldBuilder() {
            if (this.lotteryOptionBuilder_ == null) {
               this.lotteryOptionBuilder_ = new RepeatedFieldBuilderV3(this.lotteryOption_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.lotteryOption_ = null;
            }

            return this.lotteryOptionBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_OptionInfo_28615 extends GeneratedMessageV3 implements C2S_OptionInfo_28615OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OptionInfo_28615 DEFAULT_INSTANCE = new C2S_OptionInfo_28615();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OptionInfo_28615> PARSER = new AbstractParser<C2S_OptionInfo_28615>() {
         public C2S_OptionInfo_28615 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OptionInfo_28615(input, extensionRegistry);
         }
      };

      private C2S_OptionInfo_28615(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OptionInfo_28615() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OptionInfo_28615();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OptionInfo_28615(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_OptionInfo_28615_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_OptionInfo_28615_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OptionInfo_28615.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OptionInfo_28615)) {
            return super.equals(obj);
         } else {
            C2S_OptionInfo_28615 other = (C2S_OptionInfo_28615)obj;
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

      public static C2S_OptionInfo_28615 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OptionInfo_28615)PARSER.parseFrom(data);
      }

      public static C2S_OptionInfo_28615 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionInfo_28615)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionInfo_28615 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OptionInfo_28615)PARSER.parseFrom(data);
      }

      public static C2S_OptionInfo_28615 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionInfo_28615)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionInfo_28615 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OptionInfo_28615)PARSER.parseFrom(data);
      }

      public static C2S_OptionInfo_28615 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OptionInfo_28615)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OptionInfo_28615 parseFrom(InputStream input) throws IOException {
         return (C2S_OptionInfo_28615)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OptionInfo_28615 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionInfo_28615)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OptionInfo_28615 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OptionInfo_28615)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OptionInfo_28615 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionInfo_28615)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OptionInfo_28615 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OptionInfo_28615)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OptionInfo_28615 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OptionInfo_28615)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OptionInfo_28615 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OptionInfo_28615 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OptionInfo_28615> parser() {
         return PARSER;
      }

      public Parser<C2S_OptionInfo_28615> getParserForType() {
         return PARSER;
      }

      public C2S_OptionInfo_28615 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OptionInfo_28615OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_OptionInfo_28615_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_OptionInfo_28615_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OptionInfo_28615.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.C2S_OptionInfo_28615.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_OptionInfo_28615_descriptor;
         }

         public C2S_OptionInfo_28615 getDefaultInstanceForType() {
            return HeroCardMsg.C2S_OptionInfo_28615.getDefaultInstance();
         }

         public C2S_OptionInfo_28615 build() {
            C2S_OptionInfo_28615 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OptionInfo_28615 buildPartial() {
            C2S_OptionInfo_28615 result = new C2S_OptionInfo_28615(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_OptionInfo_28615) {
               return this.mergeFrom((C2S_OptionInfo_28615)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OptionInfo_28615 other) {
            if (other == HeroCardMsg.C2S_OptionInfo_28615.getDefaultInstance()) {
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
            C2S_OptionInfo_28615 parsedMessage = null;

            try {
               parsedMessage = (C2S_OptionInfo_28615)HeroCardMsg.C2S_OptionInfo_28615.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OptionInfo_28615)e.getUnfinishedMessage();
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

   public static final class S2C_OptionInfo_28616 extends GeneratedMessageV3 implements S2C_OptionInfo_28616OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int LOTTERYOPTION_FIELD_NUMBER = 1;
      private List<OptionVal> lotteryOption_;
      private byte memoizedIsInitialized;
      private static final S2C_OptionInfo_28616 DEFAULT_INSTANCE = new S2C_OptionInfo_28616();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OptionInfo_28616> PARSER = new AbstractParser<S2C_OptionInfo_28616>() {
         public S2C_OptionInfo_28616 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OptionInfo_28616(input, extensionRegistry);
         }
      };

      private S2C_OptionInfo_28616(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OptionInfo_28616() {
         this.memoizedIsInitialized = -1;
         this.lotteryOption_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OptionInfo_28616();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OptionInfo_28616(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.lotteryOption_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.lotteryOption_.add(input.readMessage(HeroCardMsg.OptionVal.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.lotteryOption_ = Collections.unmodifiableList(this.lotteryOption_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_OptionInfo_28616_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_OptionInfo_28616_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OptionInfo_28616.class, Builder.class);
      }

      public List<OptionVal> getLotteryOptionList() {
         return this.lotteryOption_;
      }

      public List<? extends OptionValOrBuilder> getLotteryOptionOrBuilderList() {
         return this.lotteryOption_;
      }

      public int getLotteryOptionCount() {
         return this.lotteryOption_.size();
      }

      public OptionVal getLotteryOption(int index) {
         return (OptionVal)this.lotteryOption_.get(index);
      }

      public OptionValOrBuilder getLotteryOptionOrBuilder(int index) {
         return (OptionValOrBuilder)this.lotteryOption_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getLotteryOptionCount(); ++i) {
               if (!this.getLotteryOption(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.lotteryOption_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.lotteryOption_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.lotteryOption_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.lotteryOption_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OptionInfo_28616)) {
            return super.equals(obj);
         } else {
            S2C_OptionInfo_28616 other = (S2C_OptionInfo_28616)obj;
            if (!this.getLotteryOptionList().equals(other.getLotteryOptionList())) {
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
            if (this.getLotteryOptionCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLotteryOptionList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OptionInfo_28616 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OptionInfo_28616)PARSER.parseFrom(data);
      }

      public static S2C_OptionInfo_28616 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionInfo_28616)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionInfo_28616 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OptionInfo_28616)PARSER.parseFrom(data);
      }

      public static S2C_OptionInfo_28616 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionInfo_28616)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionInfo_28616 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OptionInfo_28616)PARSER.parseFrom(data);
      }

      public static S2C_OptionInfo_28616 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OptionInfo_28616)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OptionInfo_28616 parseFrom(InputStream input) throws IOException {
         return (S2C_OptionInfo_28616)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OptionInfo_28616 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionInfo_28616)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OptionInfo_28616 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OptionInfo_28616)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OptionInfo_28616 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionInfo_28616)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OptionInfo_28616 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OptionInfo_28616)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OptionInfo_28616 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OptionInfo_28616)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OptionInfo_28616 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OptionInfo_28616 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OptionInfo_28616> parser() {
         return PARSER;
      }

      public Parser<S2C_OptionInfo_28616> getParserForType() {
         return PARSER;
      }

      public S2C_OptionInfo_28616 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OptionInfo_28616OrBuilder {
         private int bitField0_;
         private List<OptionVal> lotteryOption_;
         private RepeatedFieldBuilderV3<OptionVal, OptionVal.Builder, OptionValOrBuilder> lotteryOptionBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_OptionInfo_28616_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_OptionInfo_28616_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OptionInfo_28616.class, Builder.class);
         }

         private Builder() {
            this.lotteryOption_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.lotteryOption_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.S2C_OptionInfo_28616.alwaysUseFieldBuilders) {
               this.getLotteryOptionFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.lotteryOptionBuilder_ == null) {
               this.lotteryOption_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.lotteryOptionBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_OptionInfo_28616_descriptor;
         }

         public S2C_OptionInfo_28616 getDefaultInstanceForType() {
            return HeroCardMsg.S2C_OptionInfo_28616.getDefaultInstance();
         }

         public S2C_OptionInfo_28616 build() {
            S2C_OptionInfo_28616 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OptionInfo_28616 buildPartial() {
            S2C_OptionInfo_28616 result = new S2C_OptionInfo_28616(this);
            int from_bitField0_ = this.bitField0_;
            if (this.lotteryOptionBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.lotteryOption_ = Collections.unmodifiableList(this.lotteryOption_);
                  this.bitField0_ &= -2;
               }

               result.lotteryOption_ = this.lotteryOption_;
            } else {
               result.lotteryOption_ = this.lotteryOptionBuilder_.build();
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
            if (other instanceof S2C_OptionInfo_28616) {
               return this.mergeFrom((S2C_OptionInfo_28616)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OptionInfo_28616 other) {
            if (other == HeroCardMsg.S2C_OptionInfo_28616.getDefaultInstance()) {
               return this;
            } else {
               if (this.lotteryOptionBuilder_ == null) {
                  if (!other.lotteryOption_.isEmpty()) {
                     if (this.lotteryOption_.isEmpty()) {
                        this.lotteryOption_ = other.lotteryOption_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureLotteryOptionIsMutable();
                        this.lotteryOption_.addAll(other.lotteryOption_);
                     }

                     this.onChanged();
                  }
               } else if (!other.lotteryOption_.isEmpty()) {
                  if (this.lotteryOptionBuilder_.isEmpty()) {
                     this.lotteryOptionBuilder_.dispose();
                     this.lotteryOptionBuilder_ = null;
                     this.lotteryOption_ = other.lotteryOption_;
                     this.bitField0_ &= -2;
                     this.lotteryOptionBuilder_ = HeroCardMsg.S2C_OptionInfo_28616.alwaysUseFieldBuilders ? this.getLotteryOptionFieldBuilder() : null;
                  } else {
                     this.lotteryOptionBuilder_.addAllMessages(other.lotteryOption_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getLotteryOptionCount(); ++i) {
               if (!this.getLotteryOption(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OptionInfo_28616 parsedMessage = null;

            try {
               parsedMessage = (S2C_OptionInfo_28616)HeroCardMsg.S2C_OptionInfo_28616.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OptionInfo_28616)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureLotteryOptionIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.lotteryOption_ = new ArrayList(this.lotteryOption_);
               this.bitField0_ |= 1;
            }

         }

         public List<OptionVal> getLotteryOptionList() {
            return this.lotteryOptionBuilder_ == null ? Collections.unmodifiableList(this.lotteryOption_) : this.lotteryOptionBuilder_.getMessageList();
         }

         public int getLotteryOptionCount() {
            return this.lotteryOptionBuilder_ == null ? this.lotteryOption_.size() : this.lotteryOptionBuilder_.getCount();
         }

         public OptionVal getLotteryOption(int index) {
            return this.lotteryOptionBuilder_ == null ? (OptionVal)this.lotteryOption_.get(index) : (OptionVal)this.lotteryOptionBuilder_.getMessage(index);
         }

         public Builder setLotteryOption(int index, OptionVal value) {
            if (this.lotteryOptionBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLotteryOptionIsMutable();
               this.lotteryOption_.set(index, value);
               this.onChanged();
            } else {
               this.lotteryOptionBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setLotteryOption(int index, OptionVal.Builder builderForValue) {
            if (this.lotteryOptionBuilder_ == null) {
               this.ensureLotteryOptionIsMutable();
               this.lotteryOption_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.lotteryOptionBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addLotteryOption(OptionVal value) {
            if (this.lotteryOptionBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLotteryOptionIsMutable();
               this.lotteryOption_.add(value);
               this.onChanged();
            } else {
               this.lotteryOptionBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addLotteryOption(int index, OptionVal value) {
            if (this.lotteryOptionBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLotteryOptionIsMutable();
               this.lotteryOption_.add(index, value);
               this.onChanged();
            } else {
               this.lotteryOptionBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addLotteryOption(OptionVal.Builder builderForValue) {
            if (this.lotteryOptionBuilder_ == null) {
               this.ensureLotteryOptionIsMutable();
               this.lotteryOption_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.lotteryOptionBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addLotteryOption(int index, OptionVal.Builder builderForValue) {
            if (this.lotteryOptionBuilder_ == null) {
               this.ensureLotteryOptionIsMutable();
               this.lotteryOption_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.lotteryOptionBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllLotteryOption(Iterable<? extends OptionVal> values) {
            if (this.lotteryOptionBuilder_ == null) {
               this.ensureLotteryOptionIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.lotteryOption_);
               this.onChanged();
            } else {
               this.lotteryOptionBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearLotteryOption() {
            if (this.lotteryOptionBuilder_ == null) {
               this.lotteryOption_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.lotteryOptionBuilder_.clear();
            }

            return this;
         }

         public Builder removeLotteryOption(int index) {
            if (this.lotteryOptionBuilder_ == null) {
               this.ensureLotteryOptionIsMutable();
               this.lotteryOption_.remove(index);
               this.onChanged();
            } else {
               this.lotteryOptionBuilder_.remove(index);
            }

            return this;
         }

         public OptionVal.Builder getLotteryOptionBuilder(int index) {
            return (OptionVal.Builder)this.getLotteryOptionFieldBuilder().getBuilder(index);
         }

         public OptionValOrBuilder getLotteryOptionOrBuilder(int index) {
            return this.lotteryOptionBuilder_ == null ? (OptionValOrBuilder)this.lotteryOption_.get(index) : (OptionValOrBuilder)this.lotteryOptionBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends OptionValOrBuilder> getLotteryOptionOrBuilderList() {
            return this.lotteryOptionBuilder_ != null ? this.lotteryOptionBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.lotteryOption_);
         }

         public OptionVal.Builder addLotteryOptionBuilder() {
            return (OptionVal.Builder)this.getLotteryOptionFieldBuilder().addBuilder(HeroCardMsg.OptionVal.getDefaultInstance());
         }

         public OptionVal.Builder addLotteryOptionBuilder(int index) {
            return (OptionVal.Builder)this.getLotteryOptionFieldBuilder().addBuilder(index, HeroCardMsg.OptionVal.getDefaultInstance());
         }

         public List<OptionVal.Builder> getLotteryOptionBuilderList() {
            return this.getLotteryOptionFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<OptionVal, OptionVal.Builder, OptionValOrBuilder> getLotteryOptionFieldBuilder() {
            if (this.lotteryOptionBuilder_ == null) {
               this.lotteryOptionBuilder_ = new RepeatedFieldBuilderV3(this.lotteryOption_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.lotteryOption_ = null;
            }

            return this.lotteryOptionBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_NoticePresentCard_28617 extends GeneratedMessageV3 implements S2C_NoticePresentCard_28617OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int PRESENTHEROCARD_FIELD_NUMBER = 1;
      private List<HeroCardData> presentHeroCard_;
      private byte memoizedIsInitialized;
      private static final S2C_NoticePresentCard_28617 DEFAULT_INSTANCE = new S2C_NoticePresentCard_28617();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NoticePresentCard_28617> PARSER = new AbstractParser<S2C_NoticePresentCard_28617>() {
         public S2C_NoticePresentCard_28617 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NoticePresentCard_28617(input, extensionRegistry);
         }
      };

      private S2C_NoticePresentCard_28617(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NoticePresentCard_28617() {
         this.memoizedIsInitialized = -1;
         this.presentHeroCard_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NoticePresentCard_28617();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NoticePresentCard_28617(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.presentHeroCard_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.presentHeroCard_.add(input.readMessage(HeroCardMsg.HeroCardData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.presentHeroCard_ = Collections.unmodifiableList(this.presentHeroCard_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_NoticePresentCard_28617_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_NoticePresentCard_28617_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NoticePresentCard_28617.class, Builder.class);
      }

      public List<HeroCardData> getPresentHeroCardList() {
         return this.presentHeroCard_;
      }

      public List<? extends HeroCardDataOrBuilder> getPresentHeroCardOrBuilderList() {
         return this.presentHeroCard_;
      }

      public int getPresentHeroCardCount() {
         return this.presentHeroCard_.size();
      }

      public HeroCardData getPresentHeroCard(int index) {
         return (HeroCardData)this.presentHeroCard_.get(index);
      }

      public HeroCardDataOrBuilder getPresentHeroCardOrBuilder(int index) {
         return (HeroCardDataOrBuilder)this.presentHeroCard_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getPresentHeroCardCount(); ++i) {
               if (!this.getPresentHeroCard(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.presentHeroCard_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.presentHeroCard_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.presentHeroCard_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.presentHeroCard_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_NoticePresentCard_28617)) {
            return super.equals(obj);
         } else {
            S2C_NoticePresentCard_28617 other = (S2C_NoticePresentCard_28617)obj;
            if (!this.getPresentHeroCardList().equals(other.getPresentHeroCardList())) {
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
            if (this.getPresentHeroCardCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPresentHeroCardList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_NoticePresentCard_28617 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NoticePresentCard_28617)PARSER.parseFrom(data);
      }

      public static S2C_NoticePresentCard_28617 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NoticePresentCard_28617)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NoticePresentCard_28617 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NoticePresentCard_28617)PARSER.parseFrom(data);
      }

      public static S2C_NoticePresentCard_28617 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NoticePresentCard_28617)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NoticePresentCard_28617 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NoticePresentCard_28617)PARSER.parseFrom(data);
      }

      public static S2C_NoticePresentCard_28617 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NoticePresentCard_28617)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NoticePresentCard_28617 parseFrom(InputStream input) throws IOException {
         return (S2C_NoticePresentCard_28617)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NoticePresentCard_28617 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NoticePresentCard_28617)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NoticePresentCard_28617 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NoticePresentCard_28617)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NoticePresentCard_28617 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NoticePresentCard_28617)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NoticePresentCard_28617 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NoticePresentCard_28617)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NoticePresentCard_28617 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NoticePresentCard_28617)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NoticePresentCard_28617 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NoticePresentCard_28617 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NoticePresentCard_28617> parser() {
         return PARSER;
      }

      public Parser<S2C_NoticePresentCard_28617> getParserForType() {
         return PARSER;
      }

      public S2C_NoticePresentCard_28617 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NoticePresentCard_28617OrBuilder {
         private int bitField0_;
         private List<HeroCardData> presentHeroCard_;
         private RepeatedFieldBuilderV3<HeroCardData, HeroCardData.Builder, HeroCardDataOrBuilder> presentHeroCardBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_NoticePresentCard_28617_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_NoticePresentCard_28617_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NoticePresentCard_28617.class, Builder.class);
         }

         private Builder() {
            this.presentHeroCard_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.presentHeroCard_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.S2C_NoticePresentCard_28617.alwaysUseFieldBuilders) {
               this.getPresentHeroCardFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.presentHeroCardBuilder_ == null) {
               this.presentHeroCard_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.presentHeroCardBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_NoticePresentCard_28617_descriptor;
         }

         public S2C_NoticePresentCard_28617 getDefaultInstanceForType() {
            return HeroCardMsg.S2C_NoticePresentCard_28617.getDefaultInstance();
         }

         public S2C_NoticePresentCard_28617 build() {
            S2C_NoticePresentCard_28617 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NoticePresentCard_28617 buildPartial() {
            S2C_NoticePresentCard_28617 result = new S2C_NoticePresentCard_28617(this);
            int from_bitField0_ = this.bitField0_;
            if (this.presentHeroCardBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.presentHeroCard_ = Collections.unmodifiableList(this.presentHeroCard_);
                  this.bitField0_ &= -2;
               }

               result.presentHeroCard_ = this.presentHeroCard_;
            } else {
               result.presentHeroCard_ = this.presentHeroCardBuilder_.build();
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
            if (other instanceof S2C_NoticePresentCard_28617) {
               return this.mergeFrom((S2C_NoticePresentCard_28617)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NoticePresentCard_28617 other) {
            if (other == HeroCardMsg.S2C_NoticePresentCard_28617.getDefaultInstance()) {
               return this;
            } else {
               if (this.presentHeroCardBuilder_ == null) {
                  if (!other.presentHeroCard_.isEmpty()) {
                     if (this.presentHeroCard_.isEmpty()) {
                        this.presentHeroCard_ = other.presentHeroCard_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensurePresentHeroCardIsMutable();
                        this.presentHeroCard_.addAll(other.presentHeroCard_);
                     }

                     this.onChanged();
                  }
               } else if (!other.presentHeroCard_.isEmpty()) {
                  if (this.presentHeroCardBuilder_.isEmpty()) {
                     this.presentHeroCardBuilder_.dispose();
                     this.presentHeroCardBuilder_ = null;
                     this.presentHeroCard_ = other.presentHeroCard_;
                     this.bitField0_ &= -2;
                     this.presentHeroCardBuilder_ = HeroCardMsg.S2C_NoticePresentCard_28617.alwaysUseFieldBuilders ? this.getPresentHeroCardFieldBuilder() : null;
                  } else {
                     this.presentHeroCardBuilder_.addAllMessages(other.presentHeroCard_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getPresentHeroCardCount(); ++i) {
               if (!this.getPresentHeroCard(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_NoticePresentCard_28617 parsedMessage = null;

            try {
               parsedMessage = (S2C_NoticePresentCard_28617)HeroCardMsg.S2C_NoticePresentCard_28617.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NoticePresentCard_28617)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensurePresentHeroCardIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.presentHeroCard_ = new ArrayList(this.presentHeroCard_);
               this.bitField0_ |= 1;
            }

         }

         public List<HeroCardData> getPresentHeroCardList() {
            return this.presentHeroCardBuilder_ == null ? Collections.unmodifiableList(this.presentHeroCard_) : this.presentHeroCardBuilder_.getMessageList();
         }

         public int getPresentHeroCardCount() {
            return this.presentHeroCardBuilder_ == null ? this.presentHeroCard_.size() : this.presentHeroCardBuilder_.getCount();
         }

         public HeroCardData getPresentHeroCard(int index) {
            return this.presentHeroCardBuilder_ == null ? (HeroCardData)this.presentHeroCard_.get(index) : (HeroCardData)this.presentHeroCardBuilder_.getMessage(index);
         }

         public Builder setPresentHeroCard(int index, HeroCardData value) {
            if (this.presentHeroCardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.set(index, value);
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setPresentHeroCard(int index, HeroCardData.Builder builderForValue) {
            if (this.presentHeroCardBuilder_ == null) {
               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addPresentHeroCard(HeroCardData value) {
            if (this.presentHeroCardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.add(value);
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addPresentHeroCard(int index, HeroCardData value) {
            if (this.presentHeroCardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.add(index, value);
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addPresentHeroCard(HeroCardData.Builder builderForValue) {
            if (this.presentHeroCardBuilder_ == null) {
               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addPresentHeroCard(int index, HeroCardData.Builder builderForValue) {
            if (this.presentHeroCardBuilder_ == null) {
               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllPresentHeroCard(Iterable<? extends HeroCardData> values) {
            if (this.presentHeroCardBuilder_ == null) {
               this.ensurePresentHeroCardIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.presentHeroCard_);
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearPresentHeroCard() {
            if (this.presentHeroCardBuilder_ == null) {
               this.presentHeroCard_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.clear();
            }

            return this;
         }

         public Builder removePresentHeroCard(int index) {
            if (this.presentHeroCardBuilder_ == null) {
               this.ensurePresentHeroCardIsMutable();
               this.presentHeroCard_.remove(index);
               this.onChanged();
            } else {
               this.presentHeroCardBuilder_.remove(index);
            }

            return this;
         }

         public HeroCardData.Builder getPresentHeroCardBuilder(int index) {
            return (HeroCardData.Builder)this.getPresentHeroCardFieldBuilder().getBuilder(index);
         }

         public HeroCardDataOrBuilder getPresentHeroCardOrBuilder(int index) {
            return this.presentHeroCardBuilder_ == null ? (HeroCardDataOrBuilder)this.presentHeroCard_.get(index) : (HeroCardDataOrBuilder)this.presentHeroCardBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HeroCardDataOrBuilder> getPresentHeroCardOrBuilderList() {
            return this.presentHeroCardBuilder_ != null ? this.presentHeroCardBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.presentHeroCard_);
         }

         public HeroCardData.Builder addPresentHeroCardBuilder() {
            return (HeroCardData.Builder)this.getPresentHeroCardFieldBuilder().addBuilder(HeroCardMsg.HeroCardData.getDefaultInstance());
         }

         public HeroCardData.Builder addPresentHeroCardBuilder(int index) {
            return (HeroCardData.Builder)this.getPresentHeroCardFieldBuilder().addBuilder(index, HeroCardMsg.HeroCardData.getDefaultInstance());
         }

         public List<HeroCardData.Builder> getPresentHeroCardBuilderList() {
            return this.getPresentHeroCardFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HeroCardData, HeroCardData.Builder, HeroCardDataOrBuilder> getPresentHeroCardFieldBuilder() {
            if (this.presentHeroCardBuilder_ == null) {
               this.presentHeroCardBuilder_ = new RepeatedFieldBuilderV3(this.presentHeroCard_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.presentHeroCard_ = null;
            }

            return this.presentHeroCardBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_StopAutoLottery_28618 extends GeneratedMessageV3 implements C2S_StopAutoLottery_28618OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_StopAutoLottery_28618 DEFAULT_INSTANCE = new C2S_StopAutoLottery_28618();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_StopAutoLottery_28618> PARSER = new AbstractParser<C2S_StopAutoLottery_28618>() {
         public C2S_StopAutoLottery_28618 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_StopAutoLottery_28618(input, extensionRegistry);
         }
      };

      private C2S_StopAutoLottery_28618(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_StopAutoLottery_28618() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_StopAutoLottery_28618();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_StopAutoLottery_28618(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_StopAutoLottery_28618_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_StopAutoLottery_28618_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StopAutoLottery_28618.class, Builder.class);
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
         } else if (!(obj instanceof C2S_StopAutoLottery_28618)) {
            return super.equals(obj);
         } else {
            C2S_StopAutoLottery_28618 other = (C2S_StopAutoLottery_28618)obj;
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

      public static C2S_StopAutoLottery_28618 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_StopAutoLottery_28618)PARSER.parseFrom(data);
      }

      public static C2S_StopAutoLottery_28618 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StopAutoLottery_28618)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StopAutoLottery_28618 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_StopAutoLottery_28618)PARSER.parseFrom(data);
      }

      public static C2S_StopAutoLottery_28618 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StopAutoLottery_28618)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StopAutoLottery_28618 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_StopAutoLottery_28618)PARSER.parseFrom(data);
      }

      public static C2S_StopAutoLottery_28618 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StopAutoLottery_28618)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StopAutoLottery_28618 parseFrom(InputStream input) throws IOException {
         return (C2S_StopAutoLottery_28618)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StopAutoLottery_28618 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StopAutoLottery_28618)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StopAutoLottery_28618 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_StopAutoLottery_28618)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_StopAutoLottery_28618 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StopAutoLottery_28618)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StopAutoLottery_28618 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_StopAutoLottery_28618)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StopAutoLottery_28618 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StopAutoLottery_28618)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_StopAutoLottery_28618 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_StopAutoLottery_28618 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_StopAutoLottery_28618> parser() {
         return PARSER;
      }

      public Parser<C2S_StopAutoLottery_28618> getParserForType() {
         return PARSER;
      }

      public C2S_StopAutoLottery_28618 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_StopAutoLottery_28618OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_StopAutoLottery_28618_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_StopAutoLottery_28618_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StopAutoLottery_28618.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.C2S_StopAutoLottery_28618.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_StopAutoLottery_28618_descriptor;
         }

         public C2S_StopAutoLottery_28618 getDefaultInstanceForType() {
            return HeroCardMsg.C2S_StopAutoLottery_28618.getDefaultInstance();
         }

         public C2S_StopAutoLottery_28618 build() {
            C2S_StopAutoLottery_28618 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_StopAutoLottery_28618 buildPartial() {
            C2S_StopAutoLottery_28618 result = new C2S_StopAutoLottery_28618(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_StopAutoLottery_28618) {
               return this.mergeFrom((C2S_StopAutoLottery_28618)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_StopAutoLottery_28618 other) {
            if (other == HeroCardMsg.C2S_StopAutoLottery_28618.getDefaultInstance()) {
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
            C2S_StopAutoLottery_28618 parsedMessage = null;

            try {
               parsedMessage = (C2S_StopAutoLottery_28618)HeroCardMsg.C2S_StopAutoLottery_28618.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_StopAutoLottery_28618)e.getUnfinishedMessage();
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

   public static final class S2C_StopAutoLottery_28619 extends GeneratedMessageV3 implements S2C_StopAutoLottery_28619OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_StopAutoLottery_28619 DEFAULT_INSTANCE = new S2C_StopAutoLottery_28619();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_StopAutoLottery_28619> PARSER = new AbstractParser<S2C_StopAutoLottery_28619>() {
         public S2C_StopAutoLottery_28619 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_StopAutoLottery_28619(input, extensionRegistry);
         }
      };

      private S2C_StopAutoLottery_28619(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_StopAutoLottery_28619() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_StopAutoLottery_28619();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_StopAutoLottery_28619(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_StopAutoLottery_28619_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_StopAutoLottery_28619_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StopAutoLottery_28619.class, Builder.class);
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
         } else if (!(obj instanceof S2C_StopAutoLottery_28619)) {
            return super.equals(obj);
         } else {
            S2C_StopAutoLottery_28619 other = (S2C_StopAutoLottery_28619)obj;
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

      public static S2C_StopAutoLottery_28619 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_StopAutoLottery_28619)PARSER.parseFrom(data);
      }

      public static S2C_StopAutoLottery_28619 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StopAutoLottery_28619)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StopAutoLottery_28619 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_StopAutoLottery_28619)PARSER.parseFrom(data);
      }

      public static S2C_StopAutoLottery_28619 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StopAutoLottery_28619)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StopAutoLottery_28619 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_StopAutoLottery_28619)PARSER.parseFrom(data);
      }

      public static S2C_StopAutoLottery_28619 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StopAutoLottery_28619)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StopAutoLottery_28619 parseFrom(InputStream input) throws IOException {
         return (S2C_StopAutoLottery_28619)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StopAutoLottery_28619 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StopAutoLottery_28619)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StopAutoLottery_28619 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_StopAutoLottery_28619)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_StopAutoLottery_28619 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StopAutoLottery_28619)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StopAutoLottery_28619 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_StopAutoLottery_28619)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StopAutoLottery_28619 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StopAutoLottery_28619)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_StopAutoLottery_28619 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_StopAutoLottery_28619 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_StopAutoLottery_28619> parser() {
         return PARSER;
      }

      public Parser<S2C_StopAutoLottery_28619> getParserForType() {
         return PARSER;
      }

      public S2C_StopAutoLottery_28619 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_StopAutoLottery_28619OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_StopAutoLottery_28619_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_StopAutoLottery_28619_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StopAutoLottery_28619.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.S2C_StopAutoLottery_28619.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_StopAutoLottery_28619_descriptor;
         }

         public S2C_StopAutoLottery_28619 getDefaultInstanceForType() {
            return HeroCardMsg.S2C_StopAutoLottery_28619.getDefaultInstance();
         }

         public S2C_StopAutoLottery_28619 build() {
            S2C_StopAutoLottery_28619 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_StopAutoLottery_28619 buildPartial() {
            S2C_StopAutoLottery_28619 result = new S2C_StopAutoLottery_28619(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_StopAutoLottery_28619) {
               return this.mergeFrom((S2C_StopAutoLottery_28619)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_StopAutoLottery_28619 other) {
            if (other == HeroCardMsg.S2C_StopAutoLottery_28619.getDefaultInstance()) {
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
            S2C_StopAutoLottery_28619 parsedMessage = null;

            try {
               parsedMessage = (S2C_StopAutoLottery_28619)HeroCardMsg.S2C_StopAutoLottery_28619.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_StopAutoLottery_28619)e.getUnfinishedMessage();
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

   public static final class C2S_ZhuHouEquipLottery_28620 extends GeneratedMessageV3 implements C2S_ZhuHouEquipLottery_28620OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NUM_FIELD_NUMBER = 1;
      private int num_;
      public static final int CURMAINTASKID_FIELD_NUMBER = 2;
      private int curMainTaskId_;
      private byte memoizedIsInitialized;
      private static final C2S_ZhuHouEquipLottery_28620 DEFAULT_INSTANCE = new C2S_ZhuHouEquipLottery_28620();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ZhuHouEquipLottery_28620> PARSER = new AbstractParser<C2S_ZhuHouEquipLottery_28620>() {
         public C2S_ZhuHouEquipLottery_28620 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ZhuHouEquipLottery_28620(input, extensionRegistry);
         }
      };

      private C2S_ZhuHouEquipLottery_28620(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ZhuHouEquipLottery_28620() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ZhuHouEquipLottery_28620();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ZhuHouEquipLottery_28620(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.curMainTaskId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouEquipLottery_28620_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouEquipLottery_28620_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ZhuHouEquipLottery_28620.class, Builder.class);
      }

      public boolean hasNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getNum() {
         return this.num_;
      }

      public boolean hasCurMainTaskId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCurMainTaskId() {
         return this.curMainTaskId_;
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
         } else if (!this.hasCurMainTaskId()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.curMainTaskId_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.curMainTaskId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ZhuHouEquipLottery_28620)) {
            return super.equals(obj);
         } else {
            C2S_ZhuHouEquipLottery_28620 other = (C2S_ZhuHouEquipLottery_28620)obj;
            if (this.hasNum() != other.hasNum()) {
               return false;
            } else if (this.hasNum() && this.getNum() != other.getNum()) {
               return false;
            } else if (this.hasCurMainTaskId() != other.hasCurMainTaskId()) {
               return false;
            } else if (this.hasCurMainTaskId() && this.getCurMainTaskId() != other.getCurMainTaskId()) {
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

            if (this.hasCurMainTaskId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCurMainTaskId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ZhuHouEquipLottery_28620 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouEquipLottery_28620)PARSER.parseFrom(data);
      }

      public static C2S_ZhuHouEquipLottery_28620 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouEquipLottery_28620)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ZhuHouEquipLottery_28620 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouEquipLottery_28620)PARSER.parseFrom(data);
      }

      public static C2S_ZhuHouEquipLottery_28620 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouEquipLottery_28620)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ZhuHouEquipLottery_28620 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouEquipLottery_28620)PARSER.parseFrom(data);
      }

      public static C2S_ZhuHouEquipLottery_28620 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouEquipLottery_28620)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ZhuHouEquipLottery_28620 parseFrom(InputStream input) throws IOException {
         return (C2S_ZhuHouEquipLottery_28620)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ZhuHouEquipLottery_28620 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ZhuHouEquipLottery_28620)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ZhuHouEquipLottery_28620 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ZhuHouEquipLottery_28620)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ZhuHouEquipLottery_28620 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ZhuHouEquipLottery_28620)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ZhuHouEquipLottery_28620 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ZhuHouEquipLottery_28620)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ZhuHouEquipLottery_28620 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ZhuHouEquipLottery_28620)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ZhuHouEquipLottery_28620 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ZhuHouEquipLottery_28620 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ZhuHouEquipLottery_28620> parser() {
         return PARSER;
      }

      public Parser<C2S_ZhuHouEquipLottery_28620> getParserForType() {
         return PARSER;
      }

      public C2S_ZhuHouEquipLottery_28620 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ZhuHouEquipLottery_28620OrBuilder {
         private int bitField0_;
         private int num_;
         private int curMainTaskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouEquipLottery_28620_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouEquipLottery_28620_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ZhuHouEquipLottery_28620.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.C2S_ZhuHouEquipLottery_28620.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.num_ = 0;
            this.bitField0_ &= -2;
            this.curMainTaskId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouEquipLottery_28620_descriptor;
         }

         public C2S_ZhuHouEquipLottery_28620 getDefaultInstanceForType() {
            return HeroCardMsg.C2S_ZhuHouEquipLottery_28620.getDefaultInstance();
         }

         public C2S_ZhuHouEquipLottery_28620 build() {
            C2S_ZhuHouEquipLottery_28620 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ZhuHouEquipLottery_28620 buildPartial() {
            C2S_ZhuHouEquipLottery_28620 result = new C2S_ZhuHouEquipLottery_28620(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.num_ = this.num_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.curMainTaskId_ = this.curMainTaskId_;
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
            if (other instanceof C2S_ZhuHouEquipLottery_28620) {
               return this.mergeFrom((C2S_ZhuHouEquipLottery_28620)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ZhuHouEquipLottery_28620 other) {
            if (other == HeroCardMsg.C2S_ZhuHouEquipLottery_28620.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               if (other.hasCurMainTaskId()) {
                  this.setCurMainTaskId(other.getCurMainTaskId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasNum()) {
               return false;
            } else {
               return this.hasCurMainTaskId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ZhuHouEquipLottery_28620 parsedMessage = null;

            try {
               parsedMessage = (C2S_ZhuHouEquipLottery_28620)HeroCardMsg.C2S_ZhuHouEquipLottery_28620.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ZhuHouEquipLottery_28620)e.getUnfinishedMessage();
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

         public boolean hasCurMainTaskId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCurMainTaskId() {
            return this.curMainTaskId_;
         }

         public Builder setCurMainTaskId(int value) {
            this.bitField0_ |= 2;
            this.curMainTaskId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCurMainTaskId() {
            this.bitField0_ &= -3;
            this.curMainTaskId_ = 0;
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

   public static final class S2C_ZhuHouEquipLottery_28621 extends GeneratedMessageV3 implements S2C_ZhuHouEquipLottery_28621OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int EQUIPDATA_FIELD_NUMBER = 1;
      private List<EquipData> equipData_;
      public static final int DAILYLOTTERYNUM_FIELD_NUMBER = 2;
      private int dailyLotteryNum_;
      public static final int RESULT_FIELD_NUMBER = 3;
      private int result_;
      public static final int LOTTERYCOUNT_FIELD_NUMBER = 4;
      private long lotteryCount_;
      public static final int RESOLVEEQUIP_FIELD_NUMBER = 5;
      private List<EquipData> resolveEquip_;
      private byte memoizedIsInitialized;
      private static final S2C_ZhuHouEquipLottery_28621 DEFAULT_INSTANCE = new S2C_ZhuHouEquipLottery_28621();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ZhuHouEquipLottery_28621> PARSER = new AbstractParser<S2C_ZhuHouEquipLottery_28621>() {
         public S2C_ZhuHouEquipLottery_28621 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ZhuHouEquipLottery_28621(input, extensionRegistry);
         }
      };

      private S2C_ZhuHouEquipLottery_28621(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ZhuHouEquipLottery_28621() {
         this.memoizedIsInitialized = -1;
         this.equipData_ = Collections.emptyList();
         this.resolveEquip_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ZhuHouEquipLottery_28621();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ZhuHouEquipLottery_28621(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.equipData_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.equipData_.add(input.readMessage(HeroCardMsg.EquipData.PARSER, extensionRegistry));
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.dailyLotteryNum_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.result_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.lotteryCount_ = input.readInt64();
                        break;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.resolveEquip_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.resolveEquip_.add(input.readMessage(HeroCardMsg.EquipData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.equipData_ = Collections.unmodifiableList(this.equipData_);
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.resolveEquip_ = Collections.unmodifiableList(this.resolveEquip_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouEquipLottery_28621_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouEquipLottery_28621_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ZhuHouEquipLottery_28621.class, Builder.class);
      }

      public List<EquipData> getEquipDataList() {
         return this.equipData_;
      }

      public List<? extends EquipDataOrBuilder> getEquipDataOrBuilderList() {
         return this.equipData_;
      }

      public int getEquipDataCount() {
         return this.equipData_.size();
      }

      public EquipData getEquipData(int index) {
         return (EquipData)this.equipData_.get(index);
      }

      public EquipDataOrBuilder getEquipDataOrBuilder(int index) {
         return (EquipDataOrBuilder)this.equipData_.get(index);
      }

      public boolean hasDailyLotteryNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getDailyLotteryNum() {
         return this.dailyLotteryNum_;
      }

      public boolean hasResult() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasLotteryCount() {
         return (this.bitField0_ & 4) != 0;
      }

      public long getLotteryCount() {
         return this.lotteryCount_;
      }

      public List<EquipData> getResolveEquipList() {
         return this.resolveEquip_;
      }

      public List<? extends EquipDataOrBuilder> getResolveEquipOrBuilderList() {
         return this.resolveEquip_;
      }

      public int getResolveEquipCount() {
         return this.resolveEquip_.size();
      }

      public EquipData getResolveEquip(int index) {
         return (EquipData)this.resolveEquip_.get(index);
      }

      public EquipDataOrBuilder getResolveEquipOrBuilder(int index) {
         return (EquipDataOrBuilder)this.resolveEquip_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDailyLotteryNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasResult()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLotteryCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getEquipDataCount(); ++i) {
               if (!this.getEquipData(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getResolveEquipCount(); ++i) {
               if (!this.getResolveEquip(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.equipData_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.equipData_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.dailyLotteryNum_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.result_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt64(4, this.lotteryCount_);
         }

         for(int i = 0; i < this.resolveEquip_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.resolveEquip_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.equipData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.equipData_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.dailyLotteryNum_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.result_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt64Size(4, this.lotteryCount_);
            }

            for(int i = 0; i < this.resolveEquip_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.resolveEquip_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ZhuHouEquipLottery_28621)) {
            return super.equals(obj);
         } else {
            S2C_ZhuHouEquipLottery_28621 other = (S2C_ZhuHouEquipLottery_28621)obj;
            if (!this.getEquipDataList().equals(other.getEquipDataList())) {
               return false;
            } else if (this.hasDailyLotteryNum() != other.hasDailyLotteryNum()) {
               return false;
            } else if (this.hasDailyLotteryNum() && this.getDailyLotteryNum() != other.getDailyLotteryNum()) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasLotteryCount() != other.hasLotteryCount()) {
               return false;
            } else if (this.hasLotteryCount() && this.getLotteryCount() != other.getLotteryCount()) {
               return false;
            } else if (!this.getResolveEquipList().equals(other.getResolveEquipList())) {
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
            if (this.getEquipDataCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getEquipDataList().hashCode();
            }

            if (this.hasDailyLotteryNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDailyLotteryNum();
            }

            if (this.hasResult()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getResult();
            }

            if (this.hasLotteryCount()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashLong(this.getLotteryCount());
            }

            if (this.getResolveEquipCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getResolveEquipList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ZhuHouEquipLottery_28621 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouEquipLottery_28621)PARSER.parseFrom(data);
      }

      public static S2C_ZhuHouEquipLottery_28621 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouEquipLottery_28621)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ZhuHouEquipLottery_28621 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouEquipLottery_28621)PARSER.parseFrom(data);
      }

      public static S2C_ZhuHouEquipLottery_28621 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouEquipLottery_28621)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ZhuHouEquipLottery_28621 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouEquipLottery_28621)PARSER.parseFrom(data);
      }

      public static S2C_ZhuHouEquipLottery_28621 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouEquipLottery_28621)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ZhuHouEquipLottery_28621 parseFrom(InputStream input) throws IOException {
         return (S2C_ZhuHouEquipLottery_28621)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ZhuHouEquipLottery_28621 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ZhuHouEquipLottery_28621)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ZhuHouEquipLottery_28621 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ZhuHouEquipLottery_28621)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ZhuHouEquipLottery_28621 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ZhuHouEquipLottery_28621)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ZhuHouEquipLottery_28621 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ZhuHouEquipLottery_28621)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ZhuHouEquipLottery_28621 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ZhuHouEquipLottery_28621)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ZhuHouEquipLottery_28621 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ZhuHouEquipLottery_28621 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ZhuHouEquipLottery_28621> parser() {
         return PARSER;
      }

      public Parser<S2C_ZhuHouEquipLottery_28621> getParserForType() {
         return PARSER;
      }

      public S2C_ZhuHouEquipLottery_28621 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ZhuHouEquipLottery_28621OrBuilder {
         private int bitField0_;
         private List<EquipData> equipData_;
         private RepeatedFieldBuilderV3<EquipData, EquipData.Builder, EquipDataOrBuilder> equipDataBuilder_;
         private int dailyLotteryNum_;
         private int result_;
         private long lotteryCount_;
         private List<EquipData> resolveEquip_;
         private RepeatedFieldBuilderV3<EquipData, EquipData.Builder, EquipDataOrBuilder> resolveEquipBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouEquipLottery_28621_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouEquipLottery_28621_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ZhuHouEquipLottery_28621.class, Builder.class);
         }

         private Builder() {
            this.equipData_ = Collections.emptyList();
            this.resolveEquip_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.equipData_ = Collections.emptyList();
            this.resolveEquip_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.S2C_ZhuHouEquipLottery_28621.alwaysUseFieldBuilders) {
               this.getEquipDataFieldBuilder();
               this.getResolveEquipFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.equipDataBuilder_ == null) {
               this.equipData_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.equipDataBuilder_.clear();
            }

            this.dailyLotteryNum_ = 0;
            this.bitField0_ &= -3;
            this.result_ = 0;
            this.bitField0_ &= -5;
            this.lotteryCount_ = 0L;
            this.bitField0_ &= -9;
            if (this.resolveEquipBuilder_ == null) {
               this.resolveEquip_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.resolveEquipBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouEquipLottery_28621_descriptor;
         }

         public S2C_ZhuHouEquipLottery_28621 getDefaultInstanceForType() {
            return HeroCardMsg.S2C_ZhuHouEquipLottery_28621.getDefaultInstance();
         }

         public S2C_ZhuHouEquipLottery_28621 build() {
            S2C_ZhuHouEquipLottery_28621 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ZhuHouEquipLottery_28621 buildPartial() {
            S2C_ZhuHouEquipLottery_28621 result = new S2C_ZhuHouEquipLottery_28621(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.equipDataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.equipData_ = Collections.unmodifiableList(this.equipData_);
                  this.bitField0_ &= -2;
               }

               result.equipData_ = this.equipData_;
            } else {
               result.equipData_ = this.equipDataBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               result.dailyLotteryNum_ = this.dailyLotteryNum_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.lotteryCount_ = this.lotteryCount_;
               to_bitField0_ |= 4;
            }

            if (this.resolveEquipBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.resolveEquip_ = Collections.unmodifiableList(this.resolveEquip_);
                  this.bitField0_ &= -17;
               }

               result.resolveEquip_ = this.resolveEquip_;
            } else {
               result.resolveEquip_ = this.resolveEquipBuilder_.build();
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
            if (other instanceof S2C_ZhuHouEquipLottery_28621) {
               return this.mergeFrom((S2C_ZhuHouEquipLottery_28621)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ZhuHouEquipLottery_28621 other) {
            if (other == HeroCardMsg.S2C_ZhuHouEquipLottery_28621.getDefaultInstance()) {
               return this;
            } else {
               if (this.equipDataBuilder_ == null) {
                  if (!other.equipData_.isEmpty()) {
                     if (this.equipData_.isEmpty()) {
                        this.equipData_ = other.equipData_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureEquipDataIsMutable();
                        this.equipData_.addAll(other.equipData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.equipData_.isEmpty()) {
                  if (this.equipDataBuilder_.isEmpty()) {
                     this.equipDataBuilder_.dispose();
                     this.equipDataBuilder_ = null;
                     this.equipData_ = other.equipData_;
                     this.bitField0_ &= -2;
                     this.equipDataBuilder_ = HeroCardMsg.S2C_ZhuHouEquipLottery_28621.alwaysUseFieldBuilders ? this.getEquipDataFieldBuilder() : null;
                  } else {
                     this.equipDataBuilder_.addAllMessages(other.equipData_);
                  }
               }

               if (other.hasDailyLotteryNum()) {
                  this.setDailyLotteryNum(other.getDailyLotteryNum());
               }

               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasLotteryCount()) {
                  this.setLotteryCount(other.getLotteryCount());
               }

               if (this.resolveEquipBuilder_ == null) {
                  if (!other.resolveEquip_.isEmpty()) {
                     if (this.resolveEquip_.isEmpty()) {
                        this.resolveEquip_ = other.resolveEquip_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensureResolveEquipIsMutable();
                        this.resolveEquip_.addAll(other.resolveEquip_);
                     }

                     this.onChanged();
                  }
               } else if (!other.resolveEquip_.isEmpty()) {
                  if (this.resolveEquipBuilder_.isEmpty()) {
                     this.resolveEquipBuilder_.dispose();
                     this.resolveEquipBuilder_ = null;
                     this.resolveEquip_ = other.resolveEquip_;
                     this.bitField0_ &= -17;
                     this.resolveEquipBuilder_ = HeroCardMsg.S2C_ZhuHouEquipLottery_28621.alwaysUseFieldBuilders ? this.getResolveEquipFieldBuilder() : null;
                  } else {
                     this.resolveEquipBuilder_.addAllMessages(other.resolveEquip_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDailyLotteryNum()) {
               return false;
            } else if (!this.hasResult()) {
               return false;
            } else if (!this.hasLotteryCount()) {
               return false;
            } else {
               for(int i = 0; i < this.getEquipDataCount(); ++i) {
                  if (!this.getEquipData(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getResolveEquipCount(); ++i) {
                  if (!this.getResolveEquip(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ZhuHouEquipLottery_28621 parsedMessage = null;

            try {
               parsedMessage = (S2C_ZhuHouEquipLottery_28621)HeroCardMsg.S2C_ZhuHouEquipLottery_28621.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ZhuHouEquipLottery_28621)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureEquipDataIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.equipData_ = new ArrayList(this.equipData_);
               this.bitField0_ |= 1;
            }

         }

         public List<EquipData> getEquipDataList() {
            return this.equipDataBuilder_ == null ? Collections.unmodifiableList(this.equipData_) : this.equipDataBuilder_.getMessageList();
         }

         public int getEquipDataCount() {
            return this.equipDataBuilder_ == null ? this.equipData_.size() : this.equipDataBuilder_.getCount();
         }

         public EquipData getEquipData(int index) {
            return this.equipDataBuilder_ == null ? (EquipData)this.equipData_.get(index) : (EquipData)this.equipDataBuilder_.getMessage(index);
         }

         public Builder setEquipData(int index, EquipData value) {
            if (this.equipDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEquipDataIsMutable();
               this.equipData_.set(index, value);
               this.onChanged();
            } else {
               this.equipDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setEquipData(int index, EquipData.Builder builderForValue) {
            if (this.equipDataBuilder_ == null) {
               this.ensureEquipDataIsMutable();
               this.equipData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.equipDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addEquipData(EquipData value) {
            if (this.equipDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEquipDataIsMutable();
               this.equipData_.add(value);
               this.onChanged();
            } else {
               this.equipDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addEquipData(int index, EquipData value) {
            if (this.equipDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEquipDataIsMutable();
               this.equipData_.add(index, value);
               this.onChanged();
            } else {
               this.equipDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addEquipData(EquipData.Builder builderForValue) {
            if (this.equipDataBuilder_ == null) {
               this.ensureEquipDataIsMutable();
               this.equipData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.equipDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addEquipData(int index, EquipData.Builder builderForValue) {
            if (this.equipDataBuilder_ == null) {
               this.ensureEquipDataIsMutable();
               this.equipData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.equipDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllEquipData(Iterable<? extends EquipData> values) {
            if (this.equipDataBuilder_ == null) {
               this.ensureEquipDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.equipData_);
               this.onChanged();
            } else {
               this.equipDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearEquipData() {
            if (this.equipDataBuilder_ == null) {
               this.equipData_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.equipDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeEquipData(int index) {
            if (this.equipDataBuilder_ == null) {
               this.ensureEquipDataIsMutable();
               this.equipData_.remove(index);
               this.onChanged();
            } else {
               this.equipDataBuilder_.remove(index);
            }

            return this;
         }

         public EquipData.Builder getEquipDataBuilder(int index) {
            return (EquipData.Builder)this.getEquipDataFieldBuilder().getBuilder(index);
         }

         public EquipDataOrBuilder getEquipDataOrBuilder(int index) {
            return this.equipDataBuilder_ == null ? (EquipDataOrBuilder)this.equipData_.get(index) : (EquipDataOrBuilder)this.equipDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends EquipDataOrBuilder> getEquipDataOrBuilderList() {
            return this.equipDataBuilder_ != null ? this.equipDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.equipData_);
         }

         public EquipData.Builder addEquipDataBuilder() {
            return (EquipData.Builder)this.getEquipDataFieldBuilder().addBuilder(HeroCardMsg.EquipData.getDefaultInstance());
         }

         public EquipData.Builder addEquipDataBuilder(int index) {
            return (EquipData.Builder)this.getEquipDataFieldBuilder().addBuilder(index, HeroCardMsg.EquipData.getDefaultInstance());
         }

         public List<EquipData.Builder> getEquipDataBuilderList() {
            return this.getEquipDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<EquipData, EquipData.Builder, EquipDataOrBuilder> getEquipDataFieldBuilder() {
            if (this.equipDataBuilder_ == null) {
               this.equipDataBuilder_ = new RepeatedFieldBuilderV3(this.equipData_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.equipData_ = null;
            }

            return this.equipDataBuilder_;
         }

         public boolean hasDailyLotteryNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDailyLotteryNum() {
            return this.dailyLotteryNum_;
         }

         public Builder setDailyLotteryNum(int value) {
            this.bitField0_ |= 2;
            this.dailyLotteryNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailyLotteryNum() {
            this.bitField0_ &= -3;
            this.dailyLotteryNum_ = 0;
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

         public boolean hasLotteryCount() {
            return (this.bitField0_ & 8) != 0;
         }

         public long getLotteryCount() {
            return this.lotteryCount_;
         }

         public Builder setLotteryCount(long value) {
            this.bitField0_ |= 8;
            this.lotteryCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLotteryCount() {
            this.bitField0_ &= -9;
            this.lotteryCount_ = 0L;
            this.onChanged();
            return this;
         }

         private void ensureResolveEquipIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.resolveEquip_ = new ArrayList(this.resolveEquip_);
               this.bitField0_ |= 16;
            }

         }

         public List<EquipData> getResolveEquipList() {
            return this.resolveEquipBuilder_ == null ? Collections.unmodifiableList(this.resolveEquip_) : this.resolveEquipBuilder_.getMessageList();
         }

         public int getResolveEquipCount() {
            return this.resolveEquipBuilder_ == null ? this.resolveEquip_.size() : this.resolveEquipBuilder_.getCount();
         }

         public EquipData getResolveEquip(int index) {
            return this.resolveEquipBuilder_ == null ? (EquipData)this.resolveEquip_.get(index) : (EquipData)this.resolveEquipBuilder_.getMessage(index);
         }

         public Builder setResolveEquip(int index, EquipData value) {
            if (this.resolveEquipBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureResolveEquipIsMutable();
               this.resolveEquip_.set(index, value);
               this.onChanged();
            } else {
               this.resolveEquipBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setResolveEquip(int index, EquipData.Builder builderForValue) {
            if (this.resolveEquipBuilder_ == null) {
               this.ensureResolveEquipIsMutable();
               this.resolveEquip_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.resolveEquipBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addResolveEquip(EquipData value) {
            if (this.resolveEquipBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureResolveEquipIsMutable();
               this.resolveEquip_.add(value);
               this.onChanged();
            } else {
               this.resolveEquipBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addResolveEquip(int index, EquipData value) {
            if (this.resolveEquipBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureResolveEquipIsMutable();
               this.resolveEquip_.add(index, value);
               this.onChanged();
            } else {
               this.resolveEquipBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addResolveEquip(EquipData.Builder builderForValue) {
            if (this.resolveEquipBuilder_ == null) {
               this.ensureResolveEquipIsMutable();
               this.resolveEquip_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.resolveEquipBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addResolveEquip(int index, EquipData.Builder builderForValue) {
            if (this.resolveEquipBuilder_ == null) {
               this.ensureResolveEquipIsMutable();
               this.resolveEquip_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.resolveEquipBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllResolveEquip(Iterable<? extends EquipData> values) {
            if (this.resolveEquipBuilder_ == null) {
               this.ensureResolveEquipIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.resolveEquip_);
               this.onChanged();
            } else {
               this.resolveEquipBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearResolveEquip() {
            if (this.resolveEquipBuilder_ == null) {
               this.resolveEquip_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.resolveEquipBuilder_.clear();
            }

            return this;
         }

         public Builder removeResolveEquip(int index) {
            if (this.resolveEquipBuilder_ == null) {
               this.ensureResolveEquipIsMutable();
               this.resolveEquip_.remove(index);
               this.onChanged();
            } else {
               this.resolveEquipBuilder_.remove(index);
            }

            return this;
         }

         public EquipData.Builder getResolveEquipBuilder(int index) {
            return (EquipData.Builder)this.getResolveEquipFieldBuilder().getBuilder(index);
         }

         public EquipDataOrBuilder getResolveEquipOrBuilder(int index) {
            return this.resolveEquipBuilder_ == null ? (EquipDataOrBuilder)this.resolveEquip_.get(index) : (EquipDataOrBuilder)this.resolveEquipBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends EquipDataOrBuilder> getResolveEquipOrBuilderList() {
            return this.resolveEquipBuilder_ != null ? this.resolveEquipBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.resolveEquip_);
         }

         public EquipData.Builder addResolveEquipBuilder() {
            return (EquipData.Builder)this.getResolveEquipFieldBuilder().addBuilder(HeroCardMsg.EquipData.getDefaultInstance());
         }

         public EquipData.Builder addResolveEquipBuilder(int index) {
            return (EquipData.Builder)this.getResolveEquipFieldBuilder().addBuilder(index, HeroCardMsg.EquipData.getDefaultInstance());
         }

         public List<EquipData.Builder> getResolveEquipBuilderList() {
            return this.getResolveEquipFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<EquipData, EquipData.Builder, EquipDataOrBuilder> getResolveEquipFieldBuilder() {
            if (this.resolveEquipBuilder_ == null) {
               this.resolveEquipBuilder_ = new RepeatedFieldBuilderV3(this.resolveEquip_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.resolveEquip_ = null;
            }

            return this.resolveEquipBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class EquipData extends GeneratedMessageV3 implements EquipDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int EQUIPID_FIELD_NUMBER = 2;
      private int equipId_;
      public static final int LEVEL_FIELD_NUMBER = 3;
      private int level_;
      public static final int ATTR_FIELD_NUMBER = 4;
      private List<EquipTypeAttr> attr_;
      public static final int ENABLE_FIELD_NUMBER = 5;
      private boolean enable_;
      private byte memoizedIsInitialized;
      private static final EquipData DEFAULT_INSTANCE = new EquipData();
      /** @deprecated */
      @Deprecated
      public static final Parser<EquipData> PARSER = new AbstractParser<EquipData>() {
         public EquipData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new EquipData(input, extensionRegistry);
         }
      };

      private EquipData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private EquipData() {
         this.memoizedIsInitialized = -1;
         this.attr_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new EquipData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private EquipData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.equipId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.level_ = input.readInt32();
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.attr_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.attr_.add(input.readMessage(HeroCardMsg.EquipTypeAttr.PARSER, extensionRegistry));
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.enable_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.attr_ = Collections.unmodifiableList(this.attr_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_EquipData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_EquipData_fieldAccessorTable.ensureFieldAccessorsInitialized(EquipData.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasEquipId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEquipId() {
         return this.equipId_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public List<EquipTypeAttr> getAttrList() {
         return this.attr_;
      }

      public List<? extends EquipTypeAttrOrBuilder> getAttrOrBuilderList() {
         return this.attr_;
      }

      public int getAttrCount() {
         return this.attr_.size();
      }

      public EquipTypeAttr getAttr(int index) {
         return (EquipTypeAttr)this.attr_.get(index);
      }

      public EquipTypeAttrOrBuilder getAttrOrBuilder(int index) {
         return (EquipTypeAttrOrBuilder)this.attr_.get(index);
      }

      public boolean hasEnable() {
         return (this.bitField0_ & 8) != 0;
      }

      public boolean getEnable() {
         return this.enable_;
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
         } else if (!this.hasEquipId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEnable()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getAttrCount(); ++i) {
               if (!this.getAttr(i).isInitialized()) {
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
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.equipId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.level_);
         }

         for(int i = 0; i < this.attr_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.attr_.get(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeBool(5, this.enable_);
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
               size += CodedOutputStream.computeInt32Size(2, this.equipId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.level_);
            }

            for(int i = 0; i < this.attr_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.attr_.get(i));
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeBoolSize(5, this.enable_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof EquipData)) {
            return super.equals(obj);
         } else {
            EquipData other = (EquipData)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasEquipId() != other.hasEquipId()) {
               return false;
            } else if (this.hasEquipId() && this.getEquipId() != other.getEquipId()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (!this.getAttrList().equals(other.getAttrList())) {
               return false;
            } else if (this.hasEnable() != other.hasEnable()) {
               return false;
            } else if (this.hasEnable() && this.getEnable() != other.getEnable()) {
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

            if (this.hasEquipId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEquipId();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLevel();
            }

            if (this.getAttrCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getAttrList().hashCode();
            }

            if (this.hasEnable()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashBoolean(this.getEnable());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static EquipData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (EquipData)PARSER.parseFrom(data);
      }

      public static EquipData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (EquipData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static EquipData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (EquipData)PARSER.parseFrom(data);
      }

      public static EquipData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (EquipData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static EquipData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (EquipData)PARSER.parseFrom(data);
      }

      public static EquipData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (EquipData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static EquipData parseFrom(InputStream input) throws IOException {
         return (EquipData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static EquipData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (EquipData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static EquipData parseDelimitedFrom(InputStream input) throws IOException {
         return (EquipData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static EquipData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (EquipData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static EquipData parseFrom(CodedInputStream input) throws IOException {
         return (EquipData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static EquipData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (EquipData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(EquipData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static EquipData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<EquipData> parser() {
         return PARSER;
      }

      public Parser<EquipData> getParserForType() {
         return PARSER;
      }

      public EquipData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EquipDataOrBuilder {
         private int bitField0_;
         private int code_;
         private int equipId_;
         private int level_;
         private List<EquipTypeAttr> attr_;
         private RepeatedFieldBuilderV3<EquipTypeAttr, EquipTypeAttr.Builder, EquipTypeAttrOrBuilder> attrBuilder_;
         private boolean enable_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_EquipData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_EquipData_fieldAccessorTable.ensureFieldAccessorsInitialized(EquipData.class, Builder.class);
         }

         private Builder() {
            this.attr_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.attr_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.EquipData.alwaysUseFieldBuilders) {
               this.getAttrFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.equipId_ = 0;
            this.bitField0_ &= -3;
            this.level_ = 0;
            this.bitField0_ &= -5;
            if (this.attrBuilder_ == null) {
               this.attr_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.attrBuilder_.clear();
            }

            this.enable_ = false;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_EquipData_descriptor;
         }

         public EquipData getDefaultInstanceForType() {
            return HeroCardMsg.EquipData.getDefaultInstance();
         }

         public EquipData build() {
            EquipData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public EquipData buildPartial() {
            EquipData result = new EquipData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.equipId_ = this.equipId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 4;
            }

            if (this.attrBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.attr_ = Collections.unmodifiableList(this.attr_);
                  this.bitField0_ &= -9;
               }

               result.attr_ = this.attr_;
            } else {
               result.attr_ = this.attrBuilder_.build();
            }

            if ((from_bitField0_ & 16) != 0) {
               result.enable_ = this.enable_;
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
            if (other instanceof EquipData) {
               return this.mergeFrom((EquipData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(EquipData other) {
            if (other == HeroCardMsg.EquipData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasEquipId()) {
                  this.setEquipId(other.getEquipId());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (this.attrBuilder_ == null) {
                  if (!other.attr_.isEmpty()) {
                     if (this.attr_.isEmpty()) {
                        this.attr_ = other.attr_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureAttrIsMutable();
                        this.attr_.addAll(other.attr_);
                     }

                     this.onChanged();
                  }
               } else if (!other.attr_.isEmpty()) {
                  if (this.attrBuilder_.isEmpty()) {
                     this.attrBuilder_.dispose();
                     this.attrBuilder_ = null;
                     this.attr_ = other.attr_;
                     this.bitField0_ &= -9;
                     this.attrBuilder_ = HeroCardMsg.EquipData.alwaysUseFieldBuilders ? this.getAttrFieldBuilder() : null;
                  } else {
                     this.attrBuilder_.addAllMessages(other.attr_);
                  }
               }

               if (other.hasEnable()) {
                  this.setEnable(other.getEnable());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else if (!this.hasEquipId()) {
               return false;
            } else if (!this.hasLevel()) {
               return false;
            } else if (!this.hasEnable()) {
               return false;
            } else {
               for(int i = 0; i < this.getAttrCount(); ++i) {
                  if (!this.getAttr(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            EquipData parsedMessage = null;

            try {
               parsedMessage = (EquipData)HeroCardMsg.EquipData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (EquipData)e.getUnfinishedMessage();
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

         public boolean hasEquipId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getEquipId() {
            return this.equipId_;
         }

         public Builder setEquipId(int value) {
            this.bitField0_ |= 2;
            this.equipId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEquipId() {
            this.bitField0_ &= -3;
            this.equipId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 4;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -5;
            this.level_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureAttrIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.attr_ = new ArrayList(this.attr_);
               this.bitField0_ |= 8;
            }

         }

         public List<EquipTypeAttr> getAttrList() {
            return this.attrBuilder_ == null ? Collections.unmodifiableList(this.attr_) : this.attrBuilder_.getMessageList();
         }

         public int getAttrCount() {
            return this.attrBuilder_ == null ? this.attr_.size() : this.attrBuilder_.getCount();
         }

         public EquipTypeAttr getAttr(int index) {
            return this.attrBuilder_ == null ? (EquipTypeAttr)this.attr_.get(index) : (EquipTypeAttr)this.attrBuilder_.getMessage(index);
         }

         public Builder setAttr(int index, EquipTypeAttr value) {
            if (this.attrBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAttrIsMutable();
               this.attr_.set(index, value);
               this.onChanged();
            } else {
               this.attrBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setAttr(int index, EquipTypeAttr.Builder builderForValue) {
            if (this.attrBuilder_ == null) {
               this.ensureAttrIsMutable();
               this.attr_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.attrBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAttr(EquipTypeAttr value) {
            if (this.attrBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAttrIsMutable();
               this.attr_.add(value);
               this.onChanged();
            } else {
               this.attrBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addAttr(int index, EquipTypeAttr value) {
            if (this.attrBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureAttrIsMutable();
               this.attr_.add(index, value);
               this.onChanged();
            } else {
               this.attrBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addAttr(EquipTypeAttr.Builder builderForValue) {
            if (this.attrBuilder_ == null) {
               this.ensureAttrIsMutable();
               this.attr_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.attrBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addAttr(int index, EquipTypeAttr.Builder builderForValue) {
            if (this.attrBuilder_ == null) {
               this.ensureAttrIsMutable();
               this.attr_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.attrBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllAttr(Iterable<? extends EquipTypeAttr> values) {
            if (this.attrBuilder_ == null) {
               this.ensureAttrIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.attr_);
               this.onChanged();
            } else {
               this.attrBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearAttr() {
            if (this.attrBuilder_ == null) {
               this.attr_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.attrBuilder_.clear();
            }

            return this;
         }

         public Builder removeAttr(int index) {
            if (this.attrBuilder_ == null) {
               this.ensureAttrIsMutable();
               this.attr_.remove(index);
               this.onChanged();
            } else {
               this.attrBuilder_.remove(index);
            }

            return this;
         }

         public EquipTypeAttr.Builder getAttrBuilder(int index) {
            return (EquipTypeAttr.Builder)this.getAttrFieldBuilder().getBuilder(index);
         }

         public EquipTypeAttrOrBuilder getAttrOrBuilder(int index) {
            return this.attrBuilder_ == null ? (EquipTypeAttrOrBuilder)this.attr_.get(index) : (EquipTypeAttrOrBuilder)this.attrBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends EquipTypeAttrOrBuilder> getAttrOrBuilderList() {
            return this.attrBuilder_ != null ? this.attrBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.attr_);
         }

         public EquipTypeAttr.Builder addAttrBuilder() {
            return (EquipTypeAttr.Builder)this.getAttrFieldBuilder().addBuilder(HeroCardMsg.EquipTypeAttr.getDefaultInstance());
         }

         public EquipTypeAttr.Builder addAttrBuilder(int index) {
            return (EquipTypeAttr.Builder)this.getAttrFieldBuilder().addBuilder(index, HeroCardMsg.EquipTypeAttr.getDefaultInstance());
         }

         public List<EquipTypeAttr.Builder> getAttrBuilderList() {
            return this.getAttrFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<EquipTypeAttr, EquipTypeAttr.Builder, EquipTypeAttrOrBuilder> getAttrFieldBuilder() {
            if (this.attrBuilder_ == null) {
               this.attrBuilder_ = new RepeatedFieldBuilderV3(this.attr_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.attr_ = null;
            }

            return this.attrBuilder_;
         }

         public boolean hasEnable() {
            return (this.bitField0_ & 16) != 0;
         }

         public boolean getEnable() {
            return this.enable_;
         }

         public Builder setEnable(boolean value) {
            this.bitField0_ |= 16;
            this.enable_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEnable() {
            this.bitField0_ &= -17;
            this.enable_ = false;
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

   public static final class EquipTypeAttr extends GeneratedMessageV3 implements EquipTypeAttrOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROTYPE_FIELD_NUMBER = 1;
      private int heroType_;
      public static final int TYPE_FIELD_NUMBER = 2;
      private int type_;
      public static final int WAY_FIELD_NUMBER = 3;
      private int way_;
      public static final int VAL_FIELD_NUMBER = 4;
      private int val_;
      private byte memoizedIsInitialized;
      private static final EquipTypeAttr DEFAULT_INSTANCE = new EquipTypeAttr();
      /** @deprecated */
      @Deprecated
      public static final Parser<EquipTypeAttr> PARSER = new AbstractParser<EquipTypeAttr>() {
         public EquipTypeAttr parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new EquipTypeAttr(input, extensionRegistry);
         }
      };

      private EquipTypeAttr(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private EquipTypeAttr() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new EquipTypeAttr();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private EquipTypeAttr(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroType_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.type_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.way_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.val_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_EquipTypeAttr_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_EquipTypeAttr_fieldAccessorTable.ensureFieldAccessorsInitialized(EquipTypeAttr.class, Builder.class);
      }

      public boolean hasHeroType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroType() {
         return this.heroType_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasWay() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getWay() {
         return this.way_;
      }

      public boolean hasVal() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getVal() {
         return this.val_;
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
         } else if (!this.hasWay()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasVal()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.type_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.way_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.val_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.type_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.way_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.val_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof EquipTypeAttr)) {
            return super.equals(obj);
         } else {
            EquipTypeAttr other = (EquipTypeAttr)obj;
            if (this.hasHeroType() != other.hasHeroType()) {
               return false;
            } else if (this.hasHeroType() && this.getHeroType() != other.getHeroType()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasWay() != other.hasWay()) {
               return false;
            } else if (this.hasWay() && this.getWay() != other.getWay()) {
               return false;
            } else if (this.hasVal() != other.hasVal()) {
               return false;
            } else if (this.hasVal() && this.getVal() != other.getVal()) {
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
            if (this.hasHeroType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroType();
            }

            if (this.hasType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getType();
            }

            if (this.hasWay()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getWay();
            }

            if (this.hasVal()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getVal();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static EquipTypeAttr parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (EquipTypeAttr)PARSER.parseFrom(data);
      }

      public static EquipTypeAttr parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (EquipTypeAttr)PARSER.parseFrom(data, extensionRegistry);
      }

      public static EquipTypeAttr parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (EquipTypeAttr)PARSER.parseFrom(data);
      }

      public static EquipTypeAttr parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (EquipTypeAttr)PARSER.parseFrom(data, extensionRegistry);
      }

      public static EquipTypeAttr parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (EquipTypeAttr)PARSER.parseFrom(data);
      }

      public static EquipTypeAttr parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (EquipTypeAttr)PARSER.parseFrom(data, extensionRegistry);
      }

      public static EquipTypeAttr parseFrom(InputStream input) throws IOException {
         return (EquipTypeAttr)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static EquipTypeAttr parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (EquipTypeAttr)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static EquipTypeAttr parseDelimitedFrom(InputStream input) throws IOException {
         return (EquipTypeAttr)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static EquipTypeAttr parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (EquipTypeAttr)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static EquipTypeAttr parseFrom(CodedInputStream input) throws IOException {
         return (EquipTypeAttr)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static EquipTypeAttr parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (EquipTypeAttr)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(EquipTypeAttr prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static EquipTypeAttr getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<EquipTypeAttr> parser() {
         return PARSER;
      }

      public Parser<EquipTypeAttr> getParserForType() {
         return PARSER;
      }

      public EquipTypeAttr getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EquipTypeAttrOrBuilder {
         private int bitField0_;
         private int heroType_;
         private int type_;
         private int way_;
         private int val_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_EquipTypeAttr_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_EquipTypeAttr_fieldAccessorTable.ensureFieldAccessorsInitialized(EquipTypeAttr.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.EquipTypeAttr.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroType_ = 0;
            this.bitField0_ &= -2;
            this.type_ = 0;
            this.bitField0_ &= -3;
            this.way_ = 0;
            this.bitField0_ &= -5;
            this.val_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_EquipTypeAttr_descriptor;
         }

         public EquipTypeAttr getDefaultInstanceForType() {
            return HeroCardMsg.EquipTypeAttr.getDefaultInstance();
         }

         public EquipTypeAttr build() {
            EquipTypeAttr result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public EquipTypeAttr buildPartial() {
            EquipTypeAttr result = new EquipTypeAttr(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroType_ = this.heroType_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.way_ = this.way_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.val_ = this.val_;
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
            if (other instanceof EquipTypeAttr) {
               return this.mergeFrom((EquipTypeAttr)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(EquipTypeAttr other) {
            if (other == HeroCardMsg.EquipTypeAttr.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroType()) {
                  this.setHeroType(other.getHeroType());
               }

               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasWay()) {
                  this.setWay(other.getWay());
               }

               if (other.hasVal()) {
                  this.setVal(other.getVal());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else if (!this.hasWay()) {
               return false;
            } else {
               return this.hasVal();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            EquipTypeAttr parsedMessage = null;

            try {
               parsedMessage = (EquipTypeAttr)HeroCardMsg.EquipTypeAttr.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (EquipTypeAttr)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroType() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroType() {
            return this.heroType_;
         }

         public Builder setHeroType(int value) {
            this.bitField0_ |= 1;
            this.heroType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroType() {
            this.bitField0_ &= -2;
            this.heroType_ = 0;
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

         public boolean hasWay() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getWay() {
            return this.way_;
         }

         public Builder setWay(int value) {
            this.bitField0_ |= 4;
            this.way_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWay() {
            this.bitField0_ &= -5;
            this.way_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasVal() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getVal() {
            return this.val_;
         }

         public Builder setVal(int value) {
            this.bitField0_ |= 8;
            this.val_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearVal() {
            this.bitField0_ &= -9;
            this.val_ = 0;
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

   public static final class C2S_ZhuHouResolveEquip_28622 extends GeneratedMessageV3 implements C2S_ZhuHouResolveEquip_28622OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int CODES_FIELD_NUMBER = 2;
      private Internal.IntList codes_;
      private byte memoizedIsInitialized;
      private static final C2S_ZhuHouResolveEquip_28622 DEFAULT_INSTANCE = new C2S_ZhuHouResolveEquip_28622();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ZhuHouResolveEquip_28622> PARSER = new AbstractParser<C2S_ZhuHouResolveEquip_28622>() {
         public C2S_ZhuHouResolveEquip_28622 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ZhuHouResolveEquip_28622(input, extensionRegistry);
         }
      };

      private C2S_ZhuHouResolveEquip_28622(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ZhuHouResolveEquip_28622() {
         this.memoizedIsInitialized = -1;
         this.codes_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ZhuHouResolveEquip_28622();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ZhuHouResolveEquip_28622(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.codes_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.codes_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.codes_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.codes_.addInt(input.readInt32());
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
                  this.codes_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouResolveEquip_28622_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouResolveEquip_28622_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ZhuHouResolveEquip_28622.class, Builder.class);
      }

      public List<Integer> getCodesList() {
         return this.codes_;
      }

      public int getCodesCount() {
         return this.codes_.size();
      }

      public int getCodes(int index) {
         return this.codes_.getInt(index);
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
         for(int i = 0; i < this.codes_.size(); ++i) {
            output.writeInt32(2, this.codes_.getInt(i));
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

            for(int i = 0; i < this.codes_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.codes_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getCodesList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ZhuHouResolveEquip_28622)) {
            return super.equals(obj);
         } else {
            C2S_ZhuHouResolveEquip_28622 other = (C2S_ZhuHouResolveEquip_28622)obj;
            if (!this.getCodesList().equals(other.getCodesList())) {
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
            if (this.getCodesCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCodesList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ZhuHouResolveEquip_28622 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouResolveEquip_28622)PARSER.parseFrom(data);
      }

      public static C2S_ZhuHouResolveEquip_28622 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouResolveEquip_28622)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ZhuHouResolveEquip_28622 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouResolveEquip_28622)PARSER.parseFrom(data);
      }

      public static C2S_ZhuHouResolveEquip_28622 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouResolveEquip_28622)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ZhuHouResolveEquip_28622 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouResolveEquip_28622)PARSER.parseFrom(data);
      }

      public static C2S_ZhuHouResolveEquip_28622 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouResolveEquip_28622)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ZhuHouResolveEquip_28622 parseFrom(InputStream input) throws IOException {
         return (C2S_ZhuHouResolveEquip_28622)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ZhuHouResolveEquip_28622 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ZhuHouResolveEquip_28622)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ZhuHouResolveEquip_28622 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ZhuHouResolveEquip_28622)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ZhuHouResolveEquip_28622 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ZhuHouResolveEquip_28622)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ZhuHouResolveEquip_28622 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ZhuHouResolveEquip_28622)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ZhuHouResolveEquip_28622 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ZhuHouResolveEquip_28622)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ZhuHouResolveEquip_28622 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ZhuHouResolveEquip_28622 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ZhuHouResolveEquip_28622> parser() {
         return PARSER;
      }

      public Parser<C2S_ZhuHouResolveEquip_28622> getParserForType() {
         return PARSER;
      }

      public C2S_ZhuHouResolveEquip_28622 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ZhuHouResolveEquip_28622OrBuilder {
         private int bitField0_;
         private Internal.IntList codes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouResolveEquip_28622_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouResolveEquip_28622_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ZhuHouResolveEquip_28622.class, Builder.class);
         }

         private Builder() {
            this.codes_ = HeroCardMsg.C2S_ZhuHouResolveEquip_28622.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.codes_ = HeroCardMsg.C2S_ZhuHouResolveEquip_28622.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.C2S_ZhuHouResolveEquip_28622.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.codes_ = HeroCardMsg.C2S_ZhuHouResolveEquip_28622.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouResolveEquip_28622_descriptor;
         }

         public C2S_ZhuHouResolveEquip_28622 getDefaultInstanceForType() {
            return HeroCardMsg.C2S_ZhuHouResolveEquip_28622.getDefaultInstance();
         }

         public C2S_ZhuHouResolveEquip_28622 build() {
            C2S_ZhuHouResolveEquip_28622 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ZhuHouResolveEquip_28622 buildPartial() {
            C2S_ZhuHouResolveEquip_28622 result = new C2S_ZhuHouResolveEquip_28622(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.codes_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.codes_ = this.codes_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ZhuHouResolveEquip_28622) {
               return this.mergeFrom((C2S_ZhuHouResolveEquip_28622)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ZhuHouResolveEquip_28622 other) {
            if (other == HeroCardMsg.C2S_ZhuHouResolveEquip_28622.getDefaultInstance()) {
               return this;
            } else {
               if (!other.codes_.isEmpty()) {
                  if (this.codes_.isEmpty()) {
                     this.codes_ = other.codes_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureCodesIsMutable();
                     this.codes_.addAll(other.codes_);
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
            C2S_ZhuHouResolveEquip_28622 parsedMessage = null;

            try {
               parsedMessage = (C2S_ZhuHouResolveEquip_28622)HeroCardMsg.C2S_ZhuHouResolveEquip_28622.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ZhuHouResolveEquip_28622)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureCodesIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.codes_ = HeroCardMsg.C2S_ZhuHouResolveEquip_28622.mutableCopy(this.codes_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getCodesList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.codes_) : this.codes_);
         }

         public int getCodesCount() {
            return this.codes_.size();
         }

         public int getCodes(int index) {
            return this.codes_.getInt(index);
         }

         public Builder setCodes(int index, int value) {
            this.ensureCodesIsMutable();
            this.codes_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addCodes(int value) {
            this.ensureCodesIsMutable();
            this.codes_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllCodes(Iterable<? extends Integer> values) {
            this.ensureCodesIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.codes_);
            this.onChanged();
            return this;
         }

         public Builder clearCodes() {
            this.codes_ = HeroCardMsg.C2S_ZhuHouResolveEquip_28622.emptyIntList();
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

   public static final class S2C_ZhuHouResolveEquip_28623 extends GeneratedMessageV3 implements S2C_ZhuHouResolveEquip_28623OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int EQUIPS_FIELD_NUMBER = 1;
      private List<EquipData> equips_;
      public static final int CODES_FIELD_NUMBER = 3;
      private Internal.IntList codes_;
      public static final int EXP_FIELD_NUMBER = 4;
      private int exp_;
      public static final int LEVEL_FIELD_NUMBER = 5;
      private int level_;
      private byte memoizedIsInitialized;
      private static final S2C_ZhuHouResolveEquip_28623 DEFAULT_INSTANCE = new S2C_ZhuHouResolveEquip_28623();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ZhuHouResolveEquip_28623> PARSER = new AbstractParser<S2C_ZhuHouResolveEquip_28623>() {
         public S2C_ZhuHouResolveEquip_28623 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ZhuHouResolveEquip_28623(input, extensionRegistry);
         }
      };

      private S2C_ZhuHouResolveEquip_28623(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ZhuHouResolveEquip_28623() {
         this.memoizedIsInitialized = -1;
         this.equips_ = Collections.emptyList();
         this.codes_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ZhuHouResolveEquip_28623();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ZhuHouResolveEquip_28623(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.equips_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.equips_.add(input.readMessage(HeroCardMsg.EquipData.PARSER, extensionRegistry));
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.codes_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.codes_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.codes_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 32:
                        this.bitField0_ |= 1;
                        this.exp_ = input.readInt32();
                        continue;
                     case 40:
                        this.bitField0_ |= 2;
                        this.level_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.codes_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 1) != 0) {
                  this.equips_ = Collections.unmodifiableList(this.equips_);
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.codes_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouResolveEquip_28623_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouResolveEquip_28623_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ZhuHouResolveEquip_28623.class, Builder.class);
      }

      public List<EquipData> getEquipsList() {
         return this.equips_;
      }

      public List<? extends EquipDataOrBuilder> getEquipsOrBuilderList() {
         return this.equips_;
      }

      public int getEquipsCount() {
         return this.equips_.size();
      }

      public EquipData getEquips(int index) {
         return (EquipData)this.equips_.get(index);
      }

      public EquipDataOrBuilder getEquipsOrBuilder(int index) {
         return (EquipDataOrBuilder)this.equips_.get(index);
      }

      public List<Integer> getCodesList() {
         return this.codes_;
      }

      public int getCodesCount() {
         return this.codes_.size();
      }

      public int getCodes(int index) {
         return this.codes_.getInt(index);
      }

      public boolean hasExp() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getExp() {
         return this.exp_;
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
         } else if (!this.hasExp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getEquipsCount(); ++i) {
               if (!this.getEquips(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.equips_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.equips_.get(i));
         }

         for(int i = 0; i < this.codes_.size(); ++i) {
            output.writeInt32(3, this.codes_.getInt(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(4, this.exp_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(5, this.level_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.equips_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.equips_.get(i));
            }

            int dataSize = 0;

            for(int i = 0; i < this.codes_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.codes_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getCodesList().size();
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.exp_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.level_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ZhuHouResolveEquip_28623)) {
            return super.equals(obj);
         } else {
            S2C_ZhuHouResolveEquip_28623 other = (S2C_ZhuHouResolveEquip_28623)obj;
            if (!this.getEquipsList().equals(other.getEquipsList())) {
               return false;
            } else if (!this.getCodesList().equals(other.getCodesList())) {
               return false;
            } else if (this.hasExp() != other.hasExp()) {
               return false;
            } else if (this.hasExp() && this.getExp() != other.getExp()) {
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
            if (this.getEquipsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getEquipsList().hashCode();
            }

            if (this.getCodesCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getCodesList().hashCode();
            }

            if (this.hasExp()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getExp();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getLevel();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ZhuHouResolveEquip_28623 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouResolveEquip_28623)PARSER.parseFrom(data);
      }

      public static S2C_ZhuHouResolveEquip_28623 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouResolveEquip_28623)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ZhuHouResolveEquip_28623 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouResolveEquip_28623)PARSER.parseFrom(data);
      }

      public static S2C_ZhuHouResolveEquip_28623 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouResolveEquip_28623)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ZhuHouResolveEquip_28623 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouResolveEquip_28623)PARSER.parseFrom(data);
      }

      public static S2C_ZhuHouResolveEquip_28623 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouResolveEquip_28623)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ZhuHouResolveEquip_28623 parseFrom(InputStream input) throws IOException {
         return (S2C_ZhuHouResolveEquip_28623)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ZhuHouResolveEquip_28623 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ZhuHouResolveEquip_28623)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ZhuHouResolveEquip_28623 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ZhuHouResolveEquip_28623)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ZhuHouResolveEquip_28623 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ZhuHouResolveEquip_28623)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ZhuHouResolveEquip_28623 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ZhuHouResolveEquip_28623)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ZhuHouResolveEquip_28623 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ZhuHouResolveEquip_28623)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ZhuHouResolveEquip_28623 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ZhuHouResolveEquip_28623 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ZhuHouResolveEquip_28623> parser() {
         return PARSER;
      }

      public Parser<S2C_ZhuHouResolveEquip_28623> getParserForType() {
         return PARSER;
      }

      public S2C_ZhuHouResolveEquip_28623 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ZhuHouResolveEquip_28623OrBuilder {
         private int bitField0_;
         private List<EquipData> equips_;
         private RepeatedFieldBuilderV3<EquipData, EquipData.Builder, EquipDataOrBuilder> equipsBuilder_;
         private Internal.IntList codes_;
         private int exp_;
         private int level_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouResolveEquip_28623_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouResolveEquip_28623_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ZhuHouResolveEquip_28623.class, Builder.class);
         }

         private Builder() {
            this.equips_ = Collections.emptyList();
            this.codes_ = HeroCardMsg.S2C_ZhuHouResolveEquip_28623.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.equips_ = Collections.emptyList();
            this.codes_ = HeroCardMsg.S2C_ZhuHouResolveEquip_28623.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.S2C_ZhuHouResolveEquip_28623.alwaysUseFieldBuilders) {
               this.getEquipsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.equipsBuilder_ == null) {
               this.equips_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.equipsBuilder_.clear();
            }

            this.codes_ = HeroCardMsg.S2C_ZhuHouResolveEquip_28623.emptyIntList();
            this.bitField0_ &= -3;
            this.exp_ = 0;
            this.bitField0_ &= -5;
            this.level_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouResolveEquip_28623_descriptor;
         }

         public S2C_ZhuHouResolveEquip_28623 getDefaultInstanceForType() {
            return HeroCardMsg.S2C_ZhuHouResolveEquip_28623.getDefaultInstance();
         }

         public S2C_ZhuHouResolveEquip_28623 build() {
            S2C_ZhuHouResolveEquip_28623 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ZhuHouResolveEquip_28623 buildPartial() {
            S2C_ZhuHouResolveEquip_28623 result = new S2C_ZhuHouResolveEquip_28623(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.equipsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.equips_ = Collections.unmodifiableList(this.equips_);
                  this.bitField0_ &= -2;
               }

               result.equips_ = this.equips_;
            } else {
               result.equips_ = this.equipsBuilder_.build();
            }

            if ((this.bitField0_ & 2) != 0) {
               this.codes_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.codes_ = this.codes_;
            if ((from_bitField0_ & 4) != 0) {
               result.exp_ = this.exp_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 8) != 0) {
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
            if (other instanceof S2C_ZhuHouResolveEquip_28623) {
               return this.mergeFrom((S2C_ZhuHouResolveEquip_28623)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ZhuHouResolveEquip_28623 other) {
            if (other == HeroCardMsg.S2C_ZhuHouResolveEquip_28623.getDefaultInstance()) {
               return this;
            } else {
               if (this.equipsBuilder_ == null) {
                  if (!other.equips_.isEmpty()) {
                     if (this.equips_.isEmpty()) {
                        this.equips_ = other.equips_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureEquipsIsMutable();
                        this.equips_.addAll(other.equips_);
                     }

                     this.onChanged();
                  }
               } else if (!other.equips_.isEmpty()) {
                  if (this.equipsBuilder_.isEmpty()) {
                     this.equipsBuilder_.dispose();
                     this.equipsBuilder_ = null;
                     this.equips_ = other.equips_;
                     this.bitField0_ &= -2;
                     this.equipsBuilder_ = HeroCardMsg.S2C_ZhuHouResolveEquip_28623.alwaysUseFieldBuilders ? this.getEquipsFieldBuilder() : null;
                  } else {
                     this.equipsBuilder_.addAllMessages(other.equips_);
                  }
               }

               if (!other.codes_.isEmpty()) {
                  if (this.codes_.isEmpty()) {
                     this.codes_ = other.codes_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureCodesIsMutable();
                     this.codes_.addAll(other.codes_);
                  }

                  this.onChanged();
               }

               if (other.hasExp()) {
                  this.setExp(other.getExp());
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
            if (!this.hasExp()) {
               return false;
            } else if (!this.hasLevel()) {
               return false;
            } else {
               for(int i = 0; i < this.getEquipsCount(); ++i) {
                  if (!this.getEquips(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ZhuHouResolveEquip_28623 parsedMessage = null;

            try {
               parsedMessage = (S2C_ZhuHouResolveEquip_28623)HeroCardMsg.S2C_ZhuHouResolveEquip_28623.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ZhuHouResolveEquip_28623)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureEquipsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.equips_ = new ArrayList(this.equips_);
               this.bitField0_ |= 1;
            }

         }

         public List<EquipData> getEquipsList() {
            return this.equipsBuilder_ == null ? Collections.unmodifiableList(this.equips_) : this.equipsBuilder_.getMessageList();
         }

         public int getEquipsCount() {
            return this.equipsBuilder_ == null ? this.equips_.size() : this.equipsBuilder_.getCount();
         }

         public EquipData getEquips(int index) {
            return this.equipsBuilder_ == null ? (EquipData)this.equips_.get(index) : (EquipData)this.equipsBuilder_.getMessage(index);
         }

         public Builder setEquips(int index, EquipData value) {
            if (this.equipsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEquipsIsMutable();
               this.equips_.set(index, value);
               this.onChanged();
            } else {
               this.equipsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setEquips(int index, EquipData.Builder builderForValue) {
            if (this.equipsBuilder_ == null) {
               this.ensureEquipsIsMutable();
               this.equips_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.equipsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addEquips(EquipData value) {
            if (this.equipsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEquipsIsMutable();
               this.equips_.add(value);
               this.onChanged();
            } else {
               this.equipsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addEquips(int index, EquipData value) {
            if (this.equipsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEquipsIsMutable();
               this.equips_.add(index, value);
               this.onChanged();
            } else {
               this.equipsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addEquips(EquipData.Builder builderForValue) {
            if (this.equipsBuilder_ == null) {
               this.ensureEquipsIsMutable();
               this.equips_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.equipsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addEquips(int index, EquipData.Builder builderForValue) {
            if (this.equipsBuilder_ == null) {
               this.ensureEquipsIsMutable();
               this.equips_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.equipsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllEquips(Iterable<? extends EquipData> values) {
            if (this.equipsBuilder_ == null) {
               this.ensureEquipsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.equips_);
               this.onChanged();
            } else {
               this.equipsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearEquips() {
            if (this.equipsBuilder_ == null) {
               this.equips_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.equipsBuilder_.clear();
            }

            return this;
         }

         public Builder removeEquips(int index) {
            if (this.equipsBuilder_ == null) {
               this.ensureEquipsIsMutable();
               this.equips_.remove(index);
               this.onChanged();
            } else {
               this.equipsBuilder_.remove(index);
            }

            return this;
         }

         public EquipData.Builder getEquipsBuilder(int index) {
            return (EquipData.Builder)this.getEquipsFieldBuilder().getBuilder(index);
         }

         public EquipDataOrBuilder getEquipsOrBuilder(int index) {
            return this.equipsBuilder_ == null ? (EquipDataOrBuilder)this.equips_.get(index) : (EquipDataOrBuilder)this.equipsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends EquipDataOrBuilder> getEquipsOrBuilderList() {
            return this.equipsBuilder_ != null ? this.equipsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.equips_);
         }

         public EquipData.Builder addEquipsBuilder() {
            return (EquipData.Builder)this.getEquipsFieldBuilder().addBuilder(HeroCardMsg.EquipData.getDefaultInstance());
         }

         public EquipData.Builder addEquipsBuilder(int index) {
            return (EquipData.Builder)this.getEquipsFieldBuilder().addBuilder(index, HeroCardMsg.EquipData.getDefaultInstance());
         }

         public List<EquipData.Builder> getEquipsBuilderList() {
            return this.getEquipsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<EquipData, EquipData.Builder, EquipDataOrBuilder> getEquipsFieldBuilder() {
            if (this.equipsBuilder_ == null) {
               this.equipsBuilder_ = new RepeatedFieldBuilderV3(this.equips_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.equips_ = null;
            }

            return this.equipsBuilder_;
         }

         private void ensureCodesIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.codes_ = HeroCardMsg.S2C_ZhuHouResolveEquip_28623.mutableCopy(this.codes_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getCodesList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.codes_) : this.codes_);
         }

         public int getCodesCount() {
            return this.codes_.size();
         }

         public int getCodes(int index) {
            return this.codes_.getInt(index);
         }

         public Builder setCodes(int index, int value) {
            this.ensureCodesIsMutable();
            this.codes_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addCodes(int value) {
            this.ensureCodesIsMutable();
            this.codes_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllCodes(Iterable<? extends Integer> values) {
            this.ensureCodesIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.codes_);
            this.onChanged();
            return this;
         }

         public Builder clearCodes() {
            this.codes_ = HeroCardMsg.S2C_ZhuHouResolveEquip_28623.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public boolean hasExp() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getExp() {
            return this.exp_;
         }

         public Builder setExp(int value) {
            this.bitField0_ |= 4;
            this.exp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearExp() {
            this.bitField0_ &= -5;
            this.exp_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 8;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -9;
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

   public static final class C2S_ZhuHouLevelUp_28624 extends GeneratedMessageV3 implements C2S_ZhuHouLevelUp_28624OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ZhuHouLevelUp_28624 DEFAULT_INSTANCE = new C2S_ZhuHouLevelUp_28624();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ZhuHouLevelUp_28624> PARSER = new AbstractParser<C2S_ZhuHouLevelUp_28624>() {
         public C2S_ZhuHouLevelUp_28624 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ZhuHouLevelUp_28624(input, extensionRegistry);
         }
      };

      private C2S_ZhuHouLevelUp_28624(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ZhuHouLevelUp_28624() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ZhuHouLevelUp_28624();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ZhuHouLevelUp_28624(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouLevelUp_28624_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouLevelUp_28624_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ZhuHouLevelUp_28624.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ZhuHouLevelUp_28624)) {
            return super.equals(obj);
         } else {
            C2S_ZhuHouLevelUp_28624 other = (C2S_ZhuHouLevelUp_28624)obj;
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

      public static C2S_ZhuHouLevelUp_28624 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouLevelUp_28624)PARSER.parseFrom(data);
      }

      public static C2S_ZhuHouLevelUp_28624 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouLevelUp_28624)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ZhuHouLevelUp_28624 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouLevelUp_28624)PARSER.parseFrom(data);
      }

      public static C2S_ZhuHouLevelUp_28624 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouLevelUp_28624)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ZhuHouLevelUp_28624 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouLevelUp_28624)PARSER.parseFrom(data);
      }

      public static C2S_ZhuHouLevelUp_28624 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouLevelUp_28624)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ZhuHouLevelUp_28624 parseFrom(InputStream input) throws IOException {
         return (C2S_ZhuHouLevelUp_28624)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ZhuHouLevelUp_28624 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ZhuHouLevelUp_28624)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ZhuHouLevelUp_28624 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ZhuHouLevelUp_28624)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ZhuHouLevelUp_28624 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ZhuHouLevelUp_28624)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ZhuHouLevelUp_28624 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ZhuHouLevelUp_28624)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ZhuHouLevelUp_28624 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ZhuHouLevelUp_28624)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ZhuHouLevelUp_28624 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ZhuHouLevelUp_28624 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ZhuHouLevelUp_28624> parser() {
         return PARSER;
      }

      public Parser<C2S_ZhuHouLevelUp_28624> getParserForType() {
         return PARSER;
      }

      public C2S_ZhuHouLevelUp_28624 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ZhuHouLevelUp_28624OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouLevelUp_28624_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouLevelUp_28624_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ZhuHouLevelUp_28624.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.C2S_ZhuHouLevelUp_28624.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouLevelUp_28624_descriptor;
         }

         public C2S_ZhuHouLevelUp_28624 getDefaultInstanceForType() {
            return HeroCardMsg.C2S_ZhuHouLevelUp_28624.getDefaultInstance();
         }

         public C2S_ZhuHouLevelUp_28624 build() {
            C2S_ZhuHouLevelUp_28624 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ZhuHouLevelUp_28624 buildPartial() {
            C2S_ZhuHouLevelUp_28624 result = new C2S_ZhuHouLevelUp_28624(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ZhuHouLevelUp_28624) {
               return this.mergeFrom((C2S_ZhuHouLevelUp_28624)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ZhuHouLevelUp_28624 other) {
            if (other == HeroCardMsg.C2S_ZhuHouLevelUp_28624.getDefaultInstance()) {
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
            C2S_ZhuHouLevelUp_28624 parsedMessage = null;

            try {
               parsedMessage = (C2S_ZhuHouLevelUp_28624)HeroCardMsg.C2S_ZhuHouLevelUp_28624.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ZhuHouLevelUp_28624)e.getUnfinishedMessage();
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

   public static final class S2C_ZhuHouLevelUp_28625 extends GeneratedMessageV3 implements S2C_ZhuHouLevelUp_28625OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LEVEL_FIELD_NUMBER = 1;
      private int level_;
      public static final int EXP_FIELD_NUMBER = 2;
      private long exp_;
      private byte memoizedIsInitialized;
      private static final S2C_ZhuHouLevelUp_28625 DEFAULT_INSTANCE = new S2C_ZhuHouLevelUp_28625();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ZhuHouLevelUp_28625> PARSER = new AbstractParser<S2C_ZhuHouLevelUp_28625>() {
         public S2C_ZhuHouLevelUp_28625 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ZhuHouLevelUp_28625(input, extensionRegistry);
         }
      };

      private S2C_ZhuHouLevelUp_28625(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ZhuHouLevelUp_28625() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ZhuHouLevelUp_28625();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ZhuHouLevelUp_28625(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.level_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.exp_ = input.readInt64();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouLevelUp_28625_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouLevelUp_28625_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ZhuHouLevelUp_28625.class, Builder.class);
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public boolean hasExp() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getExp() {
         return this.exp_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasExp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.level_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(2, this.exp_);
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
               size += CodedOutputStream.computeInt32Size(1, this.level_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(2, this.exp_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ZhuHouLevelUp_28625)) {
            return super.equals(obj);
         } else {
            S2C_ZhuHouLevelUp_28625 other = (S2C_ZhuHouLevelUp_28625)obj;
            if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (this.hasExp() != other.hasExp()) {
               return false;
            } else if (this.hasExp() && this.getExp() != other.getExp()) {
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
            if (this.hasLevel()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLevel();
            }

            if (this.hasExp()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getExp());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ZhuHouLevelUp_28625 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouLevelUp_28625)PARSER.parseFrom(data);
      }

      public static S2C_ZhuHouLevelUp_28625 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouLevelUp_28625)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ZhuHouLevelUp_28625 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouLevelUp_28625)PARSER.parseFrom(data);
      }

      public static S2C_ZhuHouLevelUp_28625 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouLevelUp_28625)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ZhuHouLevelUp_28625 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouLevelUp_28625)PARSER.parseFrom(data);
      }

      public static S2C_ZhuHouLevelUp_28625 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouLevelUp_28625)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ZhuHouLevelUp_28625 parseFrom(InputStream input) throws IOException {
         return (S2C_ZhuHouLevelUp_28625)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ZhuHouLevelUp_28625 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ZhuHouLevelUp_28625)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ZhuHouLevelUp_28625 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ZhuHouLevelUp_28625)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ZhuHouLevelUp_28625 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ZhuHouLevelUp_28625)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ZhuHouLevelUp_28625 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ZhuHouLevelUp_28625)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ZhuHouLevelUp_28625 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ZhuHouLevelUp_28625)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ZhuHouLevelUp_28625 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ZhuHouLevelUp_28625 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ZhuHouLevelUp_28625> parser() {
         return PARSER;
      }

      public Parser<S2C_ZhuHouLevelUp_28625> getParserForType() {
         return PARSER;
      }

      public S2C_ZhuHouLevelUp_28625 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ZhuHouLevelUp_28625OrBuilder {
         private int bitField0_;
         private int level_;
         private long exp_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouLevelUp_28625_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouLevelUp_28625_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ZhuHouLevelUp_28625.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.S2C_ZhuHouLevelUp_28625.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.level_ = 0;
            this.bitField0_ &= -2;
            this.exp_ = 0L;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouLevelUp_28625_descriptor;
         }

         public S2C_ZhuHouLevelUp_28625 getDefaultInstanceForType() {
            return HeroCardMsg.S2C_ZhuHouLevelUp_28625.getDefaultInstance();
         }

         public S2C_ZhuHouLevelUp_28625 build() {
            S2C_ZhuHouLevelUp_28625 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ZhuHouLevelUp_28625 buildPartial() {
            S2C_ZhuHouLevelUp_28625 result = new S2C_ZhuHouLevelUp_28625(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.exp_ = this.exp_;
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
            if (other instanceof S2C_ZhuHouLevelUp_28625) {
               return this.mergeFrom((S2C_ZhuHouLevelUp_28625)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ZhuHouLevelUp_28625 other) {
            if (other == HeroCardMsg.S2C_ZhuHouLevelUp_28625.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (other.hasExp()) {
                  this.setExp(other.getExp());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasLevel()) {
               return false;
            } else {
               return this.hasExp();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ZhuHouLevelUp_28625 parsedMessage = null;

            try {
               parsedMessage = (S2C_ZhuHouLevelUp_28625)HeroCardMsg.S2C_ZhuHouLevelUp_28625.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ZhuHouLevelUp_28625)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 1;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -2;
            this.level_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasExp() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getExp() {
            return this.exp_;
         }

         public Builder setExp(long value) {
            this.bitField0_ |= 2;
            this.exp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearExp() {
            this.bitField0_ &= -3;
            this.exp_ = 0L;
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

   public static final class C2S_ZhuHouStampLvUp_28626 extends GeneratedMessageV3 implements C2S_ZhuHouStampLvUp_28626OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int COUNT_FIELD_NUMBER = 1;
      private int count_;
      public static final int ISLEVELUP_FIELD_NUMBER = 2;
      private boolean isLevelUp_;
      private byte memoizedIsInitialized;
      private static final C2S_ZhuHouStampLvUp_28626 DEFAULT_INSTANCE = new C2S_ZhuHouStampLvUp_28626();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ZhuHouStampLvUp_28626> PARSER = new AbstractParser<C2S_ZhuHouStampLvUp_28626>() {
         public C2S_ZhuHouStampLvUp_28626 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ZhuHouStampLvUp_28626(input, extensionRegistry);
         }
      };

      private C2S_ZhuHouStampLvUp_28626(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ZhuHouStampLvUp_28626() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ZhuHouStampLvUp_28626();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ZhuHouStampLvUp_28626(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.count_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.isLevelUp_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouStampLvUp_28626_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouStampLvUp_28626_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ZhuHouStampLvUp_28626.class, Builder.class);
      }

      public boolean hasCount() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCount() {
         return this.count_;
      }

      public boolean hasIsLevelUp() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsLevelUp() {
         return this.isLevelUp_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIsLevelUp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.count_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.isLevelUp_);
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
               size += CodedOutputStream.computeInt32Size(1, this.count_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.isLevelUp_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ZhuHouStampLvUp_28626)) {
            return super.equals(obj);
         } else {
            C2S_ZhuHouStampLvUp_28626 other = (C2S_ZhuHouStampLvUp_28626)obj;
            if (this.hasCount() != other.hasCount()) {
               return false;
            } else if (this.hasCount() && this.getCount() != other.getCount()) {
               return false;
            } else if (this.hasIsLevelUp() != other.hasIsLevelUp()) {
               return false;
            } else if (this.hasIsLevelUp() && this.getIsLevelUp() != other.getIsLevelUp()) {
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
            if (this.hasCount()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCount();
            }

            if (this.hasIsLevelUp()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsLevelUp());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ZhuHouStampLvUp_28626 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouStampLvUp_28626)PARSER.parseFrom(data);
      }

      public static C2S_ZhuHouStampLvUp_28626 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouStampLvUp_28626)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ZhuHouStampLvUp_28626 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouStampLvUp_28626)PARSER.parseFrom(data);
      }

      public static C2S_ZhuHouStampLvUp_28626 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouStampLvUp_28626)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ZhuHouStampLvUp_28626 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouStampLvUp_28626)PARSER.parseFrom(data);
      }

      public static C2S_ZhuHouStampLvUp_28626 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouStampLvUp_28626)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ZhuHouStampLvUp_28626 parseFrom(InputStream input) throws IOException {
         return (C2S_ZhuHouStampLvUp_28626)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ZhuHouStampLvUp_28626 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ZhuHouStampLvUp_28626)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ZhuHouStampLvUp_28626 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ZhuHouStampLvUp_28626)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ZhuHouStampLvUp_28626 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ZhuHouStampLvUp_28626)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ZhuHouStampLvUp_28626 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ZhuHouStampLvUp_28626)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ZhuHouStampLvUp_28626 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ZhuHouStampLvUp_28626)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ZhuHouStampLvUp_28626 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ZhuHouStampLvUp_28626 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ZhuHouStampLvUp_28626> parser() {
         return PARSER;
      }

      public Parser<C2S_ZhuHouStampLvUp_28626> getParserForType() {
         return PARSER;
      }

      public C2S_ZhuHouStampLvUp_28626 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ZhuHouStampLvUp_28626OrBuilder {
         private int bitField0_;
         private int count_;
         private boolean isLevelUp_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouStampLvUp_28626_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouStampLvUp_28626_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ZhuHouStampLvUp_28626.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.C2S_ZhuHouStampLvUp_28626.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.count_ = 0;
            this.bitField0_ &= -2;
            this.isLevelUp_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouStampLvUp_28626_descriptor;
         }

         public C2S_ZhuHouStampLvUp_28626 getDefaultInstanceForType() {
            return HeroCardMsg.C2S_ZhuHouStampLvUp_28626.getDefaultInstance();
         }

         public C2S_ZhuHouStampLvUp_28626 build() {
            C2S_ZhuHouStampLvUp_28626 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ZhuHouStampLvUp_28626 buildPartial() {
            C2S_ZhuHouStampLvUp_28626 result = new C2S_ZhuHouStampLvUp_28626(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.count_ = this.count_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.isLevelUp_ = this.isLevelUp_;
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
            if (other instanceof C2S_ZhuHouStampLvUp_28626) {
               return this.mergeFrom((C2S_ZhuHouStampLvUp_28626)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ZhuHouStampLvUp_28626 other) {
            if (other == HeroCardMsg.C2S_ZhuHouStampLvUp_28626.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCount()) {
                  this.setCount(other.getCount());
               }

               if (other.hasIsLevelUp()) {
                  this.setIsLevelUp(other.getIsLevelUp());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasIsLevelUp();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ZhuHouStampLvUp_28626 parsedMessage = null;

            try {
               parsedMessage = (C2S_ZhuHouStampLvUp_28626)HeroCardMsg.C2S_ZhuHouStampLvUp_28626.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ZhuHouStampLvUp_28626)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCount() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCount() {
            return this.count_;
         }

         public Builder setCount(int value) {
            this.bitField0_ |= 1;
            this.count_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCount() {
            this.bitField0_ &= -2;
            this.count_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsLevelUp() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsLevelUp() {
            return this.isLevelUp_;
         }

         public Builder setIsLevelUp(boolean value) {
            this.bitField0_ |= 2;
            this.isLevelUp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsLevelUp() {
            this.bitField0_ &= -3;
            this.isLevelUp_ = false;
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

   public static final class S2C_ZhuHouStampLvUp_28627 extends GeneratedMessageV3 implements S2C_ZhuHouStampLvUp_28627OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CURBOXLV_FIELD_NUMBER = 1;
      private int curBoxLv_;
      public static final int BOXNEXTLVTIME_FIELD_NUMBER = 2;
      private long boxNextLvTime_;
      private byte memoizedIsInitialized;
      private static final S2C_ZhuHouStampLvUp_28627 DEFAULT_INSTANCE = new S2C_ZhuHouStampLvUp_28627();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ZhuHouStampLvUp_28627> PARSER = new AbstractParser<S2C_ZhuHouStampLvUp_28627>() {
         public S2C_ZhuHouStampLvUp_28627 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ZhuHouStampLvUp_28627(input, extensionRegistry);
         }
      };

      private S2C_ZhuHouStampLvUp_28627(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ZhuHouStampLvUp_28627() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ZhuHouStampLvUp_28627();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ZhuHouStampLvUp_28627(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.curBoxLv_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.boxNextLvTime_ = input.readInt64();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouStampLvUp_28627_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouStampLvUp_28627_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ZhuHouStampLvUp_28627.class, Builder.class);
      }

      public boolean hasCurBoxLv() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCurBoxLv() {
         return this.curBoxLv_;
      }

      public boolean hasBoxNextLvTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getBoxNextLvTime() {
         return this.boxNextLvTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCurBoxLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.curBoxLv_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(2, this.boxNextLvTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.curBoxLv_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(2, this.boxNextLvTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ZhuHouStampLvUp_28627)) {
            return super.equals(obj);
         } else {
            S2C_ZhuHouStampLvUp_28627 other = (S2C_ZhuHouStampLvUp_28627)obj;
            if (this.hasCurBoxLv() != other.hasCurBoxLv()) {
               return false;
            } else if (this.hasCurBoxLv() && this.getCurBoxLv() != other.getCurBoxLv()) {
               return false;
            } else if (this.hasBoxNextLvTime() != other.hasBoxNextLvTime()) {
               return false;
            } else if (this.hasBoxNextLvTime() && this.getBoxNextLvTime() != other.getBoxNextLvTime()) {
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
            if (this.hasCurBoxLv()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCurBoxLv();
            }

            if (this.hasBoxNextLvTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getBoxNextLvTime());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ZhuHouStampLvUp_28627 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouStampLvUp_28627)PARSER.parseFrom(data);
      }

      public static S2C_ZhuHouStampLvUp_28627 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouStampLvUp_28627)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ZhuHouStampLvUp_28627 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouStampLvUp_28627)PARSER.parseFrom(data);
      }

      public static S2C_ZhuHouStampLvUp_28627 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouStampLvUp_28627)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ZhuHouStampLvUp_28627 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouStampLvUp_28627)PARSER.parseFrom(data);
      }

      public static S2C_ZhuHouStampLvUp_28627 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouStampLvUp_28627)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ZhuHouStampLvUp_28627 parseFrom(InputStream input) throws IOException {
         return (S2C_ZhuHouStampLvUp_28627)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ZhuHouStampLvUp_28627 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ZhuHouStampLvUp_28627)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ZhuHouStampLvUp_28627 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ZhuHouStampLvUp_28627)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ZhuHouStampLvUp_28627 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ZhuHouStampLvUp_28627)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ZhuHouStampLvUp_28627 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ZhuHouStampLvUp_28627)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ZhuHouStampLvUp_28627 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ZhuHouStampLvUp_28627)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ZhuHouStampLvUp_28627 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ZhuHouStampLvUp_28627 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ZhuHouStampLvUp_28627> parser() {
         return PARSER;
      }

      public Parser<S2C_ZhuHouStampLvUp_28627> getParserForType() {
         return PARSER;
      }

      public S2C_ZhuHouStampLvUp_28627 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ZhuHouStampLvUp_28627OrBuilder {
         private int bitField0_;
         private int curBoxLv_;
         private long boxNextLvTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouStampLvUp_28627_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouStampLvUp_28627_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ZhuHouStampLvUp_28627.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.S2C_ZhuHouStampLvUp_28627.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.curBoxLv_ = 0;
            this.bitField0_ &= -2;
            this.boxNextLvTime_ = 0L;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouStampLvUp_28627_descriptor;
         }

         public S2C_ZhuHouStampLvUp_28627 getDefaultInstanceForType() {
            return HeroCardMsg.S2C_ZhuHouStampLvUp_28627.getDefaultInstance();
         }

         public S2C_ZhuHouStampLvUp_28627 build() {
            S2C_ZhuHouStampLvUp_28627 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ZhuHouStampLvUp_28627 buildPartial() {
            S2C_ZhuHouStampLvUp_28627 result = new S2C_ZhuHouStampLvUp_28627(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.curBoxLv_ = this.curBoxLv_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.boxNextLvTime_ = this.boxNextLvTime_;
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
            if (other instanceof S2C_ZhuHouStampLvUp_28627) {
               return this.mergeFrom((S2C_ZhuHouStampLvUp_28627)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ZhuHouStampLvUp_28627 other) {
            if (other == HeroCardMsg.S2C_ZhuHouStampLvUp_28627.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCurBoxLv()) {
                  this.setCurBoxLv(other.getCurBoxLv());
               }

               if (other.hasBoxNextLvTime()) {
                  this.setBoxNextLvTime(other.getBoxNextLvTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCurBoxLv();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ZhuHouStampLvUp_28627 parsedMessage = null;

            try {
               parsedMessage = (S2C_ZhuHouStampLvUp_28627)HeroCardMsg.S2C_ZhuHouStampLvUp_28627.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ZhuHouStampLvUp_28627)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCurBoxLv() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCurBoxLv() {
            return this.curBoxLv_;
         }

         public Builder setCurBoxLv(int value) {
            this.bitField0_ |= 1;
            this.curBoxLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCurBoxLv() {
            this.bitField0_ &= -2;
            this.curBoxLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBoxNextLvTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getBoxNextLvTime() {
            return this.boxNextLvTime_;
         }

         public Builder setBoxNextLvTime(long value) {
            this.bitField0_ |= 2;
            this.boxNextLvTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBoxNextLvTime() {
            this.bitField0_ &= -3;
            this.boxNextLvTime_ = 0L;
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

   public static final class C2S_ZhuHouInfo_28628 extends GeneratedMessageV3 implements C2S_ZhuHouInfo_28628OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ZhuHouInfo_28628 DEFAULT_INSTANCE = new C2S_ZhuHouInfo_28628();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ZhuHouInfo_28628> PARSER = new AbstractParser<C2S_ZhuHouInfo_28628>() {
         public C2S_ZhuHouInfo_28628 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ZhuHouInfo_28628(input, extensionRegistry);
         }
      };

      private C2S_ZhuHouInfo_28628(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ZhuHouInfo_28628() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ZhuHouInfo_28628();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ZhuHouInfo_28628(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouInfo_28628_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouInfo_28628_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ZhuHouInfo_28628.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ZhuHouInfo_28628)) {
            return super.equals(obj);
         } else {
            C2S_ZhuHouInfo_28628 other = (C2S_ZhuHouInfo_28628)obj;
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

      public static C2S_ZhuHouInfo_28628 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouInfo_28628)PARSER.parseFrom(data);
      }

      public static C2S_ZhuHouInfo_28628 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouInfo_28628)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ZhuHouInfo_28628 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouInfo_28628)PARSER.parseFrom(data);
      }

      public static C2S_ZhuHouInfo_28628 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouInfo_28628)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ZhuHouInfo_28628 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouInfo_28628)PARSER.parseFrom(data);
      }

      public static C2S_ZhuHouInfo_28628 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouInfo_28628)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ZhuHouInfo_28628 parseFrom(InputStream input) throws IOException {
         return (C2S_ZhuHouInfo_28628)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ZhuHouInfo_28628 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ZhuHouInfo_28628)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ZhuHouInfo_28628 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ZhuHouInfo_28628)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ZhuHouInfo_28628 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ZhuHouInfo_28628)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ZhuHouInfo_28628 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ZhuHouInfo_28628)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ZhuHouInfo_28628 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ZhuHouInfo_28628)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ZhuHouInfo_28628 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ZhuHouInfo_28628 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ZhuHouInfo_28628> parser() {
         return PARSER;
      }

      public Parser<C2S_ZhuHouInfo_28628> getParserForType() {
         return PARSER;
      }

      public C2S_ZhuHouInfo_28628 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ZhuHouInfo_28628OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouInfo_28628_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouInfo_28628_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ZhuHouInfo_28628.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.C2S_ZhuHouInfo_28628.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouInfo_28628_descriptor;
         }

         public C2S_ZhuHouInfo_28628 getDefaultInstanceForType() {
            return HeroCardMsg.C2S_ZhuHouInfo_28628.getDefaultInstance();
         }

         public C2S_ZhuHouInfo_28628 build() {
            C2S_ZhuHouInfo_28628 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ZhuHouInfo_28628 buildPartial() {
            C2S_ZhuHouInfo_28628 result = new C2S_ZhuHouInfo_28628(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ZhuHouInfo_28628) {
               return this.mergeFrom((C2S_ZhuHouInfo_28628)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ZhuHouInfo_28628 other) {
            if (other == HeroCardMsg.C2S_ZhuHouInfo_28628.getDefaultInstance()) {
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
            C2S_ZhuHouInfo_28628 parsedMessage = null;

            try {
               parsedMessage = (C2S_ZhuHouInfo_28628)HeroCardMsg.C2S_ZhuHouInfo_28628.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ZhuHouInfo_28628)e.getUnfinishedMessage();
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

   public static final class S2C_ZhuHouInfo_28629 extends GeneratedMessageV3 implements S2C_ZhuHouInfo_28629OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int EQUIPS_FIELD_NUMBER = 1;
      private List<EquipData> equips_;
      public static final int LEVEL_FIELD_NUMBER = 2;
      private int level_;
      public static final int STAMPLEVEL_FIELD_NUMBER = 3;
      private int stampLevel_;
      public static final int STAMPNEXTLVTIME_FIELD_NUMBER = 4;
      private long stampNextLvTime_;
      public static final int DAILYLOTTERYNUM_FIELD_NUMBER = 5;
      private int dailyLotteryNum_;
      public static final int LOTTERYCOUNT_FIELD_NUMBER = 6;
      private long lotteryCount_;
      public static final int EXP_FIELD_NUMBER = 7;
      private int exp_;
      private byte memoizedIsInitialized;
      private static final S2C_ZhuHouInfo_28629 DEFAULT_INSTANCE = new S2C_ZhuHouInfo_28629();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ZhuHouInfo_28629> PARSER = new AbstractParser<S2C_ZhuHouInfo_28629>() {
         public S2C_ZhuHouInfo_28629 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ZhuHouInfo_28629(input, extensionRegistry);
         }
      };

      private S2C_ZhuHouInfo_28629(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ZhuHouInfo_28629() {
         this.memoizedIsInitialized = -1;
         this.equips_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ZhuHouInfo_28629();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ZhuHouInfo_28629(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.equips_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.equips_.add(input.readMessage(HeroCardMsg.EquipData.PARSER, extensionRegistry));
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.level_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.stampLevel_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.stampNextLvTime_ = input.readInt64();
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.dailyLotteryNum_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 16;
                        this.lotteryCount_ = input.readInt64();
                        break;
                     case 56:
                        this.bitField0_ |= 32;
                        this.exp_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.equips_ = Collections.unmodifiableList(this.equips_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouInfo_28629_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouInfo_28629_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ZhuHouInfo_28629.class, Builder.class);
      }

      public List<EquipData> getEquipsList() {
         return this.equips_;
      }

      public List<? extends EquipDataOrBuilder> getEquipsOrBuilderList() {
         return this.equips_;
      }

      public int getEquipsCount() {
         return this.equips_.size();
      }

      public EquipData getEquips(int index) {
         return (EquipData)this.equips_.get(index);
      }

      public EquipDataOrBuilder getEquipsOrBuilder(int index) {
         return (EquipDataOrBuilder)this.equips_.get(index);
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public boolean hasStampLevel() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStampLevel() {
         return this.stampLevel_;
      }

      public boolean hasStampNextLvTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public long getStampNextLvTime() {
         return this.stampNextLvTime_;
      }

      public boolean hasDailyLotteryNum() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getDailyLotteryNum() {
         return this.dailyLotteryNum_;
      }

      public boolean hasLotteryCount() {
         return (this.bitField0_ & 16) != 0;
      }

      public long getLotteryCount() {
         return this.lotteryCount_;
      }

      public boolean hasExp() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getExp() {
         return this.exp_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStampLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDailyLotteryNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLotteryCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasExp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getEquipsCount(); ++i) {
               if (!this.getEquips(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.equips_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.equips_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.level_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.stampLevel_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt64(4, this.stampNextLvTime_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.dailyLotteryNum_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt64(6, this.lotteryCount_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(7, this.exp_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.equips_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.equips_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.level_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.stampLevel_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt64Size(4, this.stampNextLvTime_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.dailyLotteryNum_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt64Size(6, this.lotteryCount_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.exp_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ZhuHouInfo_28629)) {
            return super.equals(obj);
         } else {
            S2C_ZhuHouInfo_28629 other = (S2C_ZhuHouInfo_28629)obj;
            if (!this.getEquipsList().equals(other.getEquipsList())) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (this.hasStampLevel() != other.hasStampLevel()) {
               return false;
            } else if (this.hasStampLevel() && this.getStampLevel() != other.getStampLevel()) {
               return false;
            } else if (this.hasStampNextLvTime() != other.hasStampNextLvTime()) {
               return false;
            } else if (this.hasStampNextLvTime() && this.getStampNextLvTime() != other.getStampNextLvTime()) {
               return false;
            } else if (this.hasDailyLotteryNum() != other.hasDailyLotteryNum()) {
               return false;
            } else if (this.hasDailyLotteryNum() && this.getDailyLotteryNum() != other.getDailyLotteryNum()) {
               return false;
            } else if (this.hasLotteryCount() != other.hasLotteryCount()) {
               return false;
            } else if (this.hasLotteryCount() && this.getLotteryCount() != other.getLotteryCount()) {
               return false;
            } else if (this.hasExp() != other.hasExp()) {
               return false;
            } else if (this.hasExp() && this.getExp() != other.getExp()) {
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
            if (this.getEquipsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getEquipsList().hashCode();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLevel();
            }

            if (this.hasStampLevel()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getStampLevel();
            }

            if (this.hasStampNextLvTime()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashLong(this.getStampNextLvTime());
            }

            if (this.hasDailyLotteryNum()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getDailyLotteryNum();
            }

            if (this.hasLotteryCount()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashLong(this.getLotteryCount());
            }

            if (this.hasExp()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getExp();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ZhuHouInfo_28629 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouInfo_28629)PARSER.parseFrom(data);
      }

      public static S2C_ZhuHouInfo_28629 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouInfo_28629)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ZhuHouInfo_28629 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouInfo_28629)PARSER.parseFrom(data);
      }

      public static S2C_ZhuHouInfo_28629 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouInfo_28629)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ZhuHouInfo_28629 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouInfo_28629)PARSER.parseFrom(data);
      }

      public static S2C_ZhuHouInfo_28629 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouInfo_28629)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ZhuHouInfo_28629 parseFrom(InputStream input) throws IOException {
         return (S2C_ZhuHouInfo_28629)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ZhuHouInfo_28629 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ZhuHouInfo_28629)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ZhuHouInfo_28629 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ZhuHouInfo_28629)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ZhuHouInfo_28629 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ZhuHouInfo_28629)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ZhuHouInfo_28629 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ZhuHouInfo_28629)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ZhuHouInfo_28629 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ZhuHouInfo_28629)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ZhuHouInfo_28629 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ZhuHouInfo_28629 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ZhuHouInfo_28629> parser() {
         return PARSER;
      }

      public Parser<S2C_ZhuHouInfo_28629> getParserForType() {
         return PARSER;
      }

      public S2C_ZhuHouInfo_28629 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ZhuHouInfo_28629OrBuilder {
         private int bitField0_;
         private List<EquipData> equips_;
         private RepeatedFieldBuilderV3<EquipData, EquipData.Builder, EquipDataOrBuilder> equipsBuilder_;
         private int level_;
         private int stampLevel_;
         private long stampNextLvTime_;
         private int dailyLotteryNum_;
         private long lotteryCount_;
         private int exp_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouInfo_28629_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouInfo_28629_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ZhuHouInfo_28629.class, Builder.class);
         }

         private Builder() {
            this.equips_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.equips_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.S2C_ZhuHouInfo_28629.alwaysUseFieldBuilders) {
               this.getEquipsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.equipsBuilder_ == null) {
               this.equips_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.equipsBuilder_.clear();
            }

            this.level_ = 0;
            this.bitField0_ &= -3;
            this.stampLevel_ = 0;
            this.bitField0_ &= -5;
            this.stampNextLvTime_ = 0L;
            this.bitField0_ &= -9;
            this.dailyLotteryNum_ = 0;
            this.bitField0_ &= -17;
            this.lotteryCount_ = 0L;
            this.bitField0_ &= -33;
            this.exp_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouInfo_28629_descriptor;
         }

         public S2C_ZhuHouInfo_28629 getDefaultInstanceForType() {
            return HeroCardMsg.S2C_ZhuHouInfo_28629.getDefaultInstance();
         }

         public S2C_ZhuHouInfo_28629 build() {
            S2C_ZhuHouInfo_28629 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ZhuHouInfo_28629 buildPartial() {
            S2C_ZhuHouInfo_28629 result = new S2C_ZhuHouInfo_28629(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.equipsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.equips_ = Collections.unmodifiableList(this.equips_);
                  this.bitField0_ &= -2;
               }

               result.equips_ = this.equips_;
            } else {
               result.equips_ = this.equipsBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.stampLevel_ = this.stampLevel_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.stampNextLvTime_ = this.stampNextLvTime_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.dailyLotteryNum_ = this.dailyLotteryNum_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.lotteryCount_ = this.lotteryCount_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.exp_ = this.exp_;
               to_bitField0_ |= 32;
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
            if (other instanceof S2C_ZhuHouInfo_28629) {
               return this.mergeFrom((S2C_ZhuHouInfo_28629)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ZhuHouInfo_28629 other) {
            if (other == HeroCardMsg.S2C_ZhuHouInfo_28629.getDefaultInstance()) {
               return this;
            } else {
               if (this.equipsBuilder_ == null) {
                  if (!other.equips_.isEmpty()) {
                     if (this.equips_.isEmpty()) {
                        this.equips_ = other.equips_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureEquipsIsMutable();
                        this.equips_.addAll(other.equips_);
                     }

                     this.onChanged();
                  }
               } else if (!other.equips_.isEmpty()) {
                  if (this.equipsBuilder_.isEmpty()) {
                     this.equipsBuilder_.dispose();
                     this.equipsBuilder_ = null;
                     this.equips_ = other.equips_;
                     this.bitField0_ &= -2;
                     this.equipsBuilder_ = HeroCardMsg.S2C_ZhuHouInfo_28629.alwaysUseFieldBuilders ? this.getEquipsFieldBuilder() : null;
                  } else {
                     this.equipsBuilder_.addAllMessages(other.equips_);
                  }
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (other.hasStampLevel()) {
                  this.setStampLevel(other.getStampLevel());
               }

               if (other.hasStampNextLvTime()) {
                  this.setStampNextLvTime(other.getStampNextLvTime());
               }

               if (other.hasDailyLotteryNum()) {
                  this.setDailyLotteryNum(other.getDailyLotteryNum());
               }

               if (other.hasLotteryCount()) {
                  this.setLotteryCount(other.getLotteryCount());
               }

               if (other.hasExp()) {
                  this.setExp(other.getExp());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasLevel()) {
               return false;
            } else if (!this.hasStampLevel()) {
               return false;
            } else if (!this.hasDailyLotteryNum()) {
               return false;
            } else if (!this.hasLotteryCount()) {
               return false;
            } else if (!this.hasExp()) {
               return false;
            } else {
               for(int i = 0; i < this.getEquipsCount(); ++i) {
                  if (!this.getEquips(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ZhuHouInfo_28629 parsedMessage = null;

            try {
               parsedMessage = (S2C_ZhuHouInfo_28629)HeroCardMsg.S2C_ZhuHouInfo_28629.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ZhuHouInfo_28629)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureEquipsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.equips_ = new ArrayList(this.equips_);
               this.bitField0_ |= 1;
            }

         }

         public List<EquipData> getEquipsList() {
            return this.equipsBuilder_ == null ? Collections.unmodifiableList(this.equips_) : this.equipsBuilder_.getMessageList();
         }

         public int getEquipsCount() {
            return this.equipsBuilder_ == null ? this.equips_.size() : this.equipsBuilder_.getCount();
         }

         public EquipData getEquips(int index) {
            return this.equipsBuilder_ == null ? (EquipData)this.equips_.get(index) : (EquipData)this.equipsBuilder_.getMessage(index);
         }

         public Builder setEquips(int index, EquipData value) {
            if (this.equipsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEquipsIsMutable();
               this.equips_.set(index, value);
               this.onChanged();
            } else {
               this.equipsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setEquips(int index, EquipData.Builder builderForValue) {
            if (this.equipsBuilder_ == null) {
               this.ensureEquipsIsMutable();
               this.equips_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.equipsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addEquips(EquipData value) {
            if (this.equipsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEquipsIsMutable();
               this.equips_.add(value);
               this.onChanged();
            } else {
               this.equipsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addEquips(int index, EquipData value) {
            if (this.equipsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEquipsIsMutable();
               this.equips_.add(index, value);
               this.onChanged();
            } else {
               this.equipsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addEquips(EquipData.Builder builderForValue) {
            if (this.equipsBuilder_ == null) {
               this.ensureEquipsIsMutable();
               this.equips_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.equipsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addEquips(int index, EquipData.Builder builderForValue) {
            if (this.equipsBuilder_ == null) {
               this.ensureEquipsIsMutable();
               this.equips_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.equipsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllEquips(Iterable<? extends EquipData> values) {
            if (this.equipsBuilder_ == null) {
               this.ensureEquipsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.equips_);
               this.onChanged();
            } else {
               this.equipsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearEquips() {
            if (this.equipsBuilder_ == null) {
               this.equips_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.equipsBuilder_.clear();
            }

            return this;
         }

         public Builder removeEquips(int index) {
            if (this.equipsBuilder_ == null) {
               this.ensureEquipsIsMutable();
               this.equips_.remove(index);
               this.onChanged();
            } else {
               this.equipsBuilder_.remove(index);
            }

            return this;
         }

         public EquipData.Builder getEquipsBuilder(int index) {
            return (EquipData.Builder)this.getEquipsFieldBuilder().getBuilder(index);
         }

         public EquipDataOrBuilder getEquipsOrBuilder(int index) {
            return this.equipsBuilder_ == null ? (EquipDataOrBuilder)this.equips_.get(index) : (EquipDataOrBuilder)this.equipsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends EquipDataOrBuilder> getEquipsOrBuilderList() {
            return this.equipsBuilder_ != null ? this.equipsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.equips_);
         }

         public EquipData.Builder addEquipsBuilder() {
            return (EquipData.Builder)this.getEquipsFieldBuilder().addBuilder(HeroCardMsg.EquipData.getDefaultInstance());
         }

         public EquipData.Builder addEquipsBuilder(int index) {
            return (EquipData.Builder)this.getEquipsFieldBuilder().addBuilder(index, HeroCardMsg.EquipData.getDefaultInstance());
         }

         public List<EquipData.Builder> getEquipsBuilderList() {
            return this.getEquipsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<EquipData, EquipData.Builder, EquipDataOrBuilder> getEquipsFieldBuilder() {
            if (this.equipsBuilder_ == null) {
               this.equipsBuilder_ = new RepeatedFieldBuilderV3(this.equips_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.equips_ = null;
            }

            return this.equipsBuilder_;
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

         public boolean hasStampLevel() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getStampLevel() {
            return this.stampLevel_;
         }

         public Builder setStampLevel(int value) {
            this.bitField0_ |= 4;
            this.stampLevel_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStampLevel() {
            this.bitField0_ &= -5;
            this.stampLevel_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStampNextLvTime() {
            return (this.bitField0_ & 8) != 0;
         }

         public long getStampNextLvTime() {
            return this.stampNextLvTime_;
         }

         public Builder setStampNextLvTime(long value) {
            this.bitField0_ |= 8;
            this.stampNextLvTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStampNextLvTime() {
            this.bitField0_ &= -9;
            this.stampNextLvTime_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasDailyLotteryNum() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getDailyLotteryNum() {
            return this.dailyLotteryNum_;
         }

         public Builder setDailyLotteryNum(int value) {
            this.bitField0_ |= 16;
            this.dailyLotteryNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDailyLotteryNum() {
            this.bitField0_ &= -17;
            this.dailyLotteryNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLotteryCount() {
            return (this.bitField0_ & 32) != 0;
         }

         public long getLotteryCount() {
            return this.lotteryCount_;
         }

         public Builder setLotteryCount(long value) {
            this.bitField0_ |= 32;
            this.lotteryCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLotteryCount() {
            this.bitField0_ &= -33;
            this.lotteryCount_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasExp() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getExp() {
            return this.exp_;
         }

         public Builder setExp(int value) {
            this.bitField0_ |= 64;
            this.exp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearExp() {
            this.bitField0_ &= -65;
            this.exp_ = 0;
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

   public static final class C2S_ZhuHouWearEquip_28630 extends GeneratedMessageV3 implements C2S_ZhuHouWearEquip_28630OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int ISRESOLVE_FIELD_NUMBER = 2;
      private boolean isResolve_;
      private byte memoizedIsInitialized;
      private static final C2S_ZhuHouWearEquip_28630 DEFAULT_INSTANCE = new C2S_ZhuHouWearEquip_28630();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ZhuHouWearEquip_28630> PARSER = new AbstractParser<C2S_ZhuHouWearEquip_28630>() {
         public C2S_ZhuHouWearEquip_28630 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ZhuHouWearEquip_28630(input, extensionRegistry);
         }
      };

      private C2S_ZhuHouWearEquip_28630(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ZhuHouWearEquip_28630() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ZhuHouWearEquip_28630();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ZhuHouWearEquip_28630(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.isResolve_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouWearEquip_28630_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouWearEquip_28630_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ZhuHouWearEquip_28630.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasIsResolve() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsResolve() {
         return this.isResolve_;
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
         } else if (!this.hasIsResolve()) {
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
            output.writeBool(2, this.isResolve_);
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
               size += CodedOutputStream.computeBoolSize(2, this.isResolve_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ZhuHouWearEquip_28630)) {
            return super.equals(obj);
         } else {
            C2S_ZhuHouWearEquip_28630 other = (C2S_ZhuHouWearEquip_28630)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasIsResolve() != other.hasIsResolve()) {
               return false;
            } else if (this.hasIsResolve() && this.getIsResolve() != other.getIsResolve()) {
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

            if (this.hasIsResolve()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsResolve());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ZhuHouWearEquip_28630 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouWearEquip_28630)PARSER.parseFrom(data);
      }

      public static C2S_ZhuHouWearEquip_28630 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouWearEquip_28630)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ZhuHouWearEquip_28630 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouWearEquip_28630)PARSER.parseFrom(data);
      }

      public static C2S_ZhuHouWearEquip_28630 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouWearEquip_28630)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ZhuHouWearEquip_28630 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouWearEquip_28630)PARSER.parseFrom(data);
      }

      public static C2S_ZhuHouWearEquip_28630 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ZhuHouWearEquip_28630)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ZhuHouWearEquip_28630 parseFrom(InputStream input) throws IOException {
         return (C2S_ZhuHouWearEquip_28630)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ZhuHouWearEquip_28630 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ZhuHouWearEquip_28630)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ZhuHouWearEquip_28630 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ZhuHouWearEquip_28630)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ZhuHouWearEquip_28630 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ZhuHouWearEquip_28630)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ZhuHouWearEquip_28630 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ZhuHouWearEquip_28630)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ZhuHouWearEquip_28630 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ZhuHouWearEquip_28630)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ZhuHouWearEquip_28630 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ZhuHouWearEquip_28630 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ZhuHouWearEquip_28630> parser() {
         return PARSER;
      }

      public Parser<C2S_ZhuHouWearEquip_28630> getParserForType() {
         return PARSER;
      }

      public C2S_ZhuHouWearEquip_28630 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ZhuHouWearEquip_28630OrBuilder {
         private int bitField0_;
         private int code_;
         private boolean isResolve_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouWearEquip_28630_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouWearEquip_28630_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ZhuHouWearEquip_28630.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.C2S_ZhuHouWearEquip_28630.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.isResolve_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHouWearEquip_28630_descriptor;
         }

         public C2S_ZhuHouWearEquip_28630 getDefaultInstanceForType() {
            return HeroCardMsg.C2S_ZhuHouWearEquip_28630.getDefaultInstance();
         }

         public C2S_ZhuHouWearEquip_28630 build() {
            C2S_ZhuHouWearEquip_28630 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ZhuHouWearEquip_28630 buildPartial() {
            C2S_ZhuHouWearEquip_28630 result = new C2S_ZhuHouWearEquip_28630(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.isResolve_ = this.isResolve_;
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
            if (other instanceof C2S_ZhuHouWearEquip_28630) {
               return this.mergeFrom((C2S_ZhuHouWearEquip_28630)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ZhuHouWearEquip_28630 other) {
            if (other == HeroCardMsg.C2S_ZhuHouWearEquip_28630.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasIsResolve()) {
                  this.setIsResolve(other.getIsResolve());
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
               return this.hasIsResolve();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ZhuHouWearEquip_28630 parsedMessage = null;

            try {
               parsedMessage = (C2S_ZhuHouWearEquip_28630)HeroCardMsg.C2S_ZhuHouWearEquip_28630.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ZhuHouWearEquip_28630)e.getUnfinishedMessage();
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

         public boolean hasIsResolve() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsResolve() {
            return this.isResolve_;
         }

         public Builder setIsResolve(boolean value) {
            this.bitField0_ |= 2;
            this.isResolve_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsResolve() {
            this.bitField0_ &= -3;
            this.isResolve_ = false;
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

   public static final class S2C_ZhuHouWearEquip_28631 extends GeneratedMessageV3 implements S2C_ZhuHouWearEquip_28631OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int ISRESOLVE_FIELD_NUMBER = 2;
      private boolean isResolve_;
      public static final int EQUIPS_FIELD_NUMBER = 3;
      private List<EquipData> equips_;
      public static final int EXP_FIELD_NUMBER = 4;
      private int exp_;
      public static final int LEVEL_FIELD_NUMBER = 5;
      private int level_;
      private byte memoizedIsInitialized;
      private static final S2C_ZhuHouWearEquip_28631 DEFAULT_INSTANCE = new S2C_ZhuHouWearEquip_28631();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ZhuHouWearEquip_28631> PARSER = new AbstractParser<S2C_ZhuHouWearEquip_28631>() {
         public S2C_ZhuHouWearEquip_28631 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ZhuHouWearEquip_28631(input, extensionRegistry);
         }
      };

      private S2C_ZhuHouWearEquip_28631(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ZhuHouWearEquip_28631() {
         this.memoizedIsInitialized = -1;
         this.equips_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ZhuHouWearEquip_28631();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ZhuHouWearEquip_28631(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.isResolve_ = input.readBool();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.equips_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.equips_.add(input.readMessage(HeroCardMsg.EquipData.PARSER, extensionRegistry));
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.exp_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 8;
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
               if ((mutable_bitField0_ & 4) != 0) {
                  this.equips_ = Collections.unmodifiableList(this.equips_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouWearEquip_28631_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouWearEquip_28631_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ZhuHouWearEquip_28631.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasIsResolve() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsResolve() {
         return this.isResolve_;
      }

      public List<EquipData> getEquipsList() {
         return this.equips_;
      }

      public List<? extends EquipDataOrBuilder> getEquipsOrBuilderList() {
         return this.equips_;
      }

      public int getEquipsCount() {
         return this.equips_.size();
      }

      public EquipData getEquips(int index) {
         return (EquipData)this.equips_.get(index);
      }

      public EquipDataOrBuilder getEquipsOrBuilder(int index) {
         return (EquipDataOrBuilder)this.equips_.get(index);
      }

      public boolean hasExp() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getExp() {
         return this.exp_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 8) != 0;
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
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsResolve()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasExp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getEquipsCount(); ++i) {
               if (!this.getEquips(i).isInitialized()) {
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
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.isResolve_);
         }

         for(int i = 0; i < this.equips_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.equips_.get(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.exp_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.level_);
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
               size += CodedOutputStream.computeBoolSize(2, this.isResolve_);
            }

            for(int i = 0; i < this.equips_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.equips_.get(i));
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.exp_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.level_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ZhuHouWearEquip_28631)) {
            return super.equals(obj);
         } else {
            S2C_ZhuHouWearEquip_28631 other = (S2C_ZhuHouWearEquip_28631)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasIsResolve() != other.hasIsResolve()) {
               return false;
            } else if (this.hasIsResolve() && this.getIsResolve() != other.getIsResolve()) {
               return false;
            } else if (!this.getEquipsList().equals(other.getEquipsList())) {
               return false;
            } else if (this.hasExp() != other.hasExp()) {
               return false;
            } else if (this.hasExp() && this.getExp() != other.getExp()) {
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
            if (this.hasCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasIsResolve()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsResolve());
            }

            if (this.getEquipsCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getEquipsList().hashCode();
            }

            if (this.hasExp()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getExp();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getLevel();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ZhuHouWearEquip_28631 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouWearEquip_28631)PARSER.parseFrom(data);
      }

      public static S2C_ZhuHouWearEquip_28631 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouWearEquip_28631)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ZhuHouWearEquip_28631 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouWearEquip_28631)PARSER.parseFrom(data);
      }

      public static S2C_ZhuHouWearEquip_28631 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouWearEquip_28631)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ZhuHouWearEquip_28631 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouWearEquip_28631)PARSER.parseFrom(data);
      }

      public static S2C_ZhuHouWearEquip_28631 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouWearEquip_28631)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ZhuHouWearEquip_28631 parseFrom(InputStream input) throws IOException {
         return (S2C_ZhuHouWearEquip_28631)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ZhuHouWearEquip_28631 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ZhuHouWearEquip_28631)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ZhuHouWearEquip_28631 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ZhuHouWearEquip_28631)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ZhuHouWearEquip_28631 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ZhuHouWearEquip_28631)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ZhuHouWearEquip_28631 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ZhuHouWearEquip_28631)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ZhuHouWearEquip_28631 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ZhuHouWearEquip_28631)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ZhuHouWearEquip_28631 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ZhuHouWearEquip_28631 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ZhuHouWearEquip_28631> parser() {
         return PARSER;
      }

      public Parser<S2C_ZhuHouWearEquip_28631> getParserForType() {
         return PARSER;
      }

      public S2C_ZhuHouWearEquip_28631 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ZhuHouWearEquip_28631OrBuilder {
         private int bitField0_;
         private int code_;
         private boolean isResolve_;
         private List<EquipData> equips_;
         private RepeatedFieldBuilderV3<EquipData, EquipData.Builder, EquipDataOrBuilder> equipsBuilder_;
         private int exp_;
         private int level_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouWearEquip_28631_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouWearEquip_28631_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ZhuHouWearEquip_28631.class, Builder.class);
         }

         private Builder() {
            this.equips_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.equips_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.S2C_ZhuHouWearEquip_28631.alwaysUseFieldBuilders) {
               this.getEquipsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.isResolve_ = false;
            this.bitField0_ &= -3;
            if (this.equipsBuilder_ == null) {
               this.equips_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.equipsBuilder_.clear();
            }

            this.exp_ = 0;
            this.bitField0_ &= -9;
            this.level_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouWearEquip_28631_descriptor;
         }

         public S2C_ZhuHouWearEquip_28631 getDefaultInstanceForType() {
            return HeroCardMsg.S2C_ZhuHouWearEquip_28631.getDefaultInstance();
         }

         public S2C_ZhuHouWearEquip_28631 build() {
            S2C_ZhuHouWearEquip_28631 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ZhuHouWearEquip_28631 buildPartial() {
            S2C_ZhuHouWearEquip_28631 result = new S2C_ZhuHouWearEquip_28631(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.isResolve_ = this.isResolve_;
               to_bitField0_ |= 2;
            }

            if (this.equipsBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.equips_ = Collections.unmodifiableList(this.equips_);
                  this.bitField0_ &= -5;
               }

               result.equips_ = this.equips_;
            } else {
               result.equips_ = this.equipsBuilder_.build();
            }

            if ((from_bitField0_ & 8) != 0) {
               result.exp_ = this.exp_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.level_ = this.level_;
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
            if (other instanceof S2C_ZhuHouWearEquip_28631) {
               return this.mergeFrom((S2C_ZhuHouWearEquip_28631)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ZhuHouWearEquip_28631 other) {
            if (other == HeroCardMsg.S2C_ZhuHouWearEquip_28631.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasIsResolve()) {
                  this.setIsResolve(other.getIsResolve());
               }

               if (this.equipsBuilder_ == null) {
                  if (!other.equips_.isEmpty()) {
                     if (this.equips_.isEmpty()) {
                        this.equips_ = other.equips_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureEquipsIsMutable();
                        this.equips_.addAll(other.equips_);
                     }

                     this.onChanged();
                  }
               } else if (!other.equips_.isEmpty()) {
                  if (this.equipsBuilder_.isEmpty()) {
                     this.equipsBuilder_.dispose();
                     this.equipsBuilder_ = null;
                     this.equips_ = other.equips_;
                     this.bitField0_ &= -5;
                     this.equipsBuilder_ = HeroCardMsg.S2C_ZhuHouWearEquip_28631.alwaysUseFieldBuilders ? this.getEquipsFieldBuilder() : null;
                  } else {
                     this.equipsBuilder_.addAllMessages(other.equips_);
                  }
               }

               if (other.hasExp()) {
                  this.setExp(other.getExp());
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
            if (!this.hasCode()) {
               return false;
            } else if (!this.hasIsResolve()) {
               return false;
            } else if (!this.hasExp()) {
               return false;
            } else if (!this.hasLevel()) {
               return false;
            } else {
               for(int i = 0; i < this.getEquipsCount(); ++i) {
                  if (!this.getEquips(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ZhuHouWearEquip_28631 parsedMessage = null;

            try {
               parsedMessage = (S2C_ZhuHouWearEquip_28631)HeroCardMsg.S2C_ZhuHouWearEquip_28631.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ZhuHouWearEquip_28631)e.getUnfinishedMessage();
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

         public boolean hasIsResolve() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsResolve() {
            return this.isResolve_;
         }

         public Builder setIsResolve(boolean value) {
            this.bitField0_ |= 2;
            this.isResolve_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsResolve() {
            this.bitField0_ &= -3;
            this.isResolve_ = false;
            this.onChanged();
            return this;
         }

         private void ensureEquipsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.equips_ = new ArrayList(this.equips_);
               this.bitField0_ |= 4;
            }

         }

         public List<EquipData> getEquipsList() {
            return this.equipsBuilder_ == null ? Collections.unmodifiableList(this.equips_) : this.equipsBuilder_.getMessageList();
         }

         public int getEquipsCount() {
            return this.equipsBuilder_ == null ? this.equips_.size() : this.equipsBuilder_.getCount();
         }

         public EquipData getEquips(int index) {
            return this.equipsBuilder_ == null ? (EquipData)this.equips_.get(index) : (EquipData)this.equipsBuilder_.getMessage(index);
         }

         public Builder setEquips(int index, EquipData value) {
            if (this.equipsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEquipsIsMutable();
               this.equips_.set(index, value);
               this.onChanged();
            } else {
               this.equipsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setEquips(int index, EquipData.Builder builderForValue) {
            if (this.equipsBuilder_ == null) {
               this.ensureEquipsIsMutable();
               this.equips_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.equipsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addEquips(EquipData value) {
            if (this.equipsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEquipsIsMutable();
               this.equips_.add(value);
               this.onChanged();
            } else {
               this.equipsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addEquips(int index, EquipData value) {
            if (this.equipsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEquipsIsMutable();
               this.equips_.add(index, value);
               this.onChanged();
            } else {
               this.equipsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addEquips(EquipData.Builder builderForValue) {
            if (this.equipsBuilder_ == null) {
               this.ensureEquipsIsMutable();
               this.equips_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.equipsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addEquips(int index, EquipData.Builder builderForValue) {
            if (this.equipsBuilder_ == null) {
               this.ensureEquipsIsMutable();
               this.equips_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.equipsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllEquips(Iterable<? extends EquipData> values) {
            if (this.equipsBuilder_ == null) {
               this.ensureEquipsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.equips_);
               this.onChanged();
            } else {
               this.equipsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearEquips() {
            if (this.equipsBuilder_ == null) {
               this.equips_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.equipsBuilder_.clear();
            }

            return this;
         }

         public Builder removeEquips(int index) {
            if (this.equipsBuilder_ == null) {
               this.ensureEquipsIsMutable();
               this.equips_.remove(index);
               this.onChanged();
            } else {
               this.equipsBuilder_.remove(index);
            }

            return this;
         }

         public EquipData.Builder getEquipsBuilder(int index) {
            return (EquipData.Builder)this.getEquipsFieldBuilder().getBuilder(index);
         }

         public EquipDataOrBuilder getEquipsOrBuilder(int index) {
            return this.equipsBuilder_ == null ? (EquipDataOrBuilder)this.equips_.get(index) : (EquipDataOrBuilder)this.equipsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends EquipDataOrBuilder> getEquipsOrBuilderList() {
            return this.equipsBuilder_ != null ? this.equipsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.equips_);
         }

         public EquipData.Builder addEquipsBuilder() {
            return (EquipData.Builder)this.getEquipsFieldBuilder().addBuilder(HeroCardMsg.EquipData.getDefaultInstance());
         }

         public EquipData.Builder addEquipsBuilder(int index) {
            return (EquipData.Builder)this.getEquipsFieldBuilder().addBuilder(index, HeroCardMsg.EquipData.getDefaultInstance());
         }

         public List<EquipData.Builder> getEquipsBuilderList() {
            return this.getEquipsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<EquipData, EquipData.Builder, EquipDataOrBuilder> getEquipsFieldBuilder() {
            if (this.equipsBuilder_ == null) {
               this.equipsBuilder_ = new RepeatedFieldBuilderV3(this.equips_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.equips_ = null;
            }

            return this.equipsBuilder_;
         }

         public boolean hasExp() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getExp() {
            return this.exp_;
         }

         public Builder setExp(int value) {
            this.bitField0_ |= 8;
            this.exp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearExp() {
            this.bitField0_ &= -9;
            this.exp_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 16;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -17;
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

   public static final class S2C_ZhuHouEquipInfo_28632 extends GeneratedMessageV3 implements S2C_ZhuHouEquipInfo_28632OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int EQUIPS_FIELD_NUMBER = 1;
      private List<EquipData> equips_;
      private byte memoizedIsInitialized;
      private static final S2C_ZhuHouEquipInfo_28632 DEFAULT_INSTANCE = new S2C_ZhuHouEquipInfo_28632();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ZhuHouEquipInfo_28632> PARSER = new AbstractParser<S2C_ZhuHouEquipInfo_28632>() {
         public S2C_ZhuHouEquipInfo_28632 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ZhuHouEquipInfo_28632(input, extensionRegistry);
         }
      };

      private S2C_ZhuHouEquipInfo_28632(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ZhuHouEquipInfo_28632() {
         this.memoizedIsInitialized = -1;
         this.equips_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ZhuHouEquipInfo_28632();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ZhuHouEquipInfo_28632(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.equips_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.equips_.add(input.readMessage(HeroCardMsg.EquipData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.equips_ = Collections.unmodifiableList(this.equips_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouEquipInfo_28632_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouEquipInfo_28632_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ZhuHouEquipInfo_28632.class, Builder.class);
      }

      public List<EquipData> getEquipsList() {
         return this.equips_;
      }

      public List<? extends EquipDataOrBuilder> getEquipsOrBuilderList() {
         return this.equips_;
      }

      public int getEquipsCount() {
         return this.equips_.size();
      }

      public EquipData getEquips(int index) {
         return (EquipData)this.equips_.get(index);
      }

      public EquipDataOrBuilder getEquipsOrBuilder(int index) {
         return (EquipDataOrBuilder)this.equips_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getEquipsCount(); ++i) {
               if (!this.getEquips(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.equips_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.equips_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.equips_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.equips_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ZhuHouEquipInfo_28632)) {
            return super.equals(obj);
         } else {
            S2C_ZhuHouEquipInfo_28632 other = (S2C_ZhuHouEquipInfo_28632)obj;
            if (!this.getEquipsList().equals(other.getEquipsList())) {
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
            if (this.getEquipsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getEquipsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ZhuHouEquipInfo_28632 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouEquipInfo_28632)PARSER.parseFrom(data);
      }

      public static S2C_ZhuHouEquipInfo_28632 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouEquipInfo_28632)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ZhuHouEquipInfo_28632 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouEquipInfo_28632)PARSER.parseFrom(data);
      }

      public static S2C_ZhuHouEquipInfo_28632 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouEquipInfo_28632)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ZhuHouEquipInfo_28632 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouEquipInfo_28632)PARSER.parseFrom(data);
      }

      public static S2C_ZhuHouEquipInfo_28632 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ZhuHouEquipInfo_28632)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ZhuHouEquipInfo_28632 parseFrom(InputStream input) throws IOException {
         return (S2C_ZhuHouEquipInfo_28632)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ZhuHouEquipInfo_28632 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ZhuHouEquipInfo_28632)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ZhuHouEquipInfo_28632 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ZhuHouEquipInfo_28632)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ZhuHouEquipInfo_28632 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ZhuHouEquipInfo_28632)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ZhuHouEquipInfo_28632 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ZhuHouEquipInfo_28632)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ZhuHouEquipInfo_28632 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ZhuHouEquipInfo_28632)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ZhuHouEquipInfo_28632 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ZhuHouEquipInfo_28632 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ZhuHouEquipInfo_28632> parser() {
         return PARSER;
      }

      public Parser<S2C_ZhuHouEquipInfo_28632> getParserForType() {
         return PARSER;
      }

      public S2C_ZhuHouEquipInfo_28632 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ZhuHouEquipInfo_28632OrBuilder {
         private int bitField0_;
         private List<EquipData> equips_;
         private RepeatedFieldBuilderV3<EquipData, EquipData.Builder, EquipDataOrBuilder> equipsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouEquipInfo_28632_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouEquipInfo_28632_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ZhuHouEquipInfo_28632.class, Builder.class);
         }

         private Builder() {
            this.equips_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.equips_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.S2C_ZhuHouEquipInfo_28632.alwaysUseFieldBuilders) {
               this.getEquipsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.equipsBuilder_ == null) {
               this.equips_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.equipsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_S2C_ZhuHouEquipInfo_28632_descriptor;
         }

         public S2C_ZhuHouEquipInfo_28632 getDefaultInstanceForType() {
            return HeroCardMsg.S2C_ZhuHouEquipInfo_28632.getDefaultInstance();
         }

         public S2C_ZhuHouEquipInfo_28632 build() {
            S2C_ZhuHouEquipInfo_28632 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ZhuHouEquipInfo_28632 buildPartial() {
            S2C_ZhuHouEquipInfo_28632 result = new S2C_ZhuHouEquipInfo_28632(this);
            int from_bitField0_ = this.bitField0_;
            if (this.equipsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.equips_ = Collections.unmodifiableList(this.equips_);
                  this.bitField0_ &= -2;
               }

               result.equips_ = this.equips_;
            } else {
               result.equips_ = this.equipsBuilder_.build();
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
            if (other instanceof S2C_ZhuHouEquipInfo_28632) {
               return this.mergeFrom((S2C_ZhuHouEquipInfo_28632)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ZhuHouEquipInfo_28632 other) {
            if (other == HeroCardMsg.S2C_ZhuHouEquipInfo_28632.getDefaultInstance()) {
               return this;
            } else {
               if (this.equipsBuilder_ == null) {
                  if (!other.equips_.isEmpty()) {
                     if (this.equips_.isEmpty()) {
                        this.equips_ = other.equips_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureEquipsIsMutable();
                        this.equips_.addAll(other.equips_);
                     }

                     this.onChanged();
                  }
               } else if (!other.equips_.isEmpty()) {
                  if (this.equipsBuilder_.isEmpty()) {
                     this.equipsBuilder_.dispose();
                     this.equipsBuilder_ = null;
                     this.equips_ = other.equips_;
                     this.bitField0_ &= -2;
                     this.equipsBuilder_ = HeroCardMsg.S2C_ZhuHouEquipInfo_28632.alwaysUseFieldBuilders ? this.getEquipsFieldBuilder() : null;
                  } else {
                     this.equipsBuilder_.addAllMessages(other.equips_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getEquipsCount(); ++i) {
               if (!this.getEquips(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ZhuHouEquipInfo_28632 parsedMessage = null;

            try {
               parsedMessage = (S2C_ZhuHouEquipInfo_28632)HeroCardMsg.S2C_ZhuHouEquipInfo_28632.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ZhuHouEquipInfo_28632)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureEquipsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.equips_ = new ArrayList(this.equips_);
               this.bitField0_ |= 1;
            }

         }

         public List<EquipData> getEquipsList() {
            return this.equipsBuilder_ == null ? Collections.unmodifiableList(this.equips_) : this.equipsBuilder_.getMessageList();
         }

         public int getEquipsCount() {
            return this.equipsBuilder_ == null ? this.equips_.size() : this.equipsBuilder_.getCount();
         }

         public EquipData getEquips(int index) {
            return this.equipsBuilder_ == null ? (EquipData)this.equips_.get(index) : (EquipData)this.equipsBuilder_.getMessage(index);
         }

         public Builder setEquips(int index, EquipData value) {
            if (this.equipsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEquipsIsMutable();
               this.equips_.set(index, value);
               this.onChanged();
            } else {
               this.equipsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setEquips(int index, EquipData.Builder builderForValue) {
            if (this.equipsBuilder_ == null) {
               this.ensureEquipsIsMutable();
               this.equips_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.equipsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addEquips(EquipData value) {
            if (this.equipsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEquipsIsMutable();
               this.equips_.add(value);
               this.onChanged();
            } else {
               this.equipsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addEquips(int index, EquipData value) {
            if (this.equipsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEquipsIsMutable();
               this.equips_.add(index, value);
               this.onChanged();
            } else {
               this.equipsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addEquips(EquipData.Builder builderForValue) {
            if (this.equipsBuilder_ == null) {
               this.ensureEquipsIsMutable();
               this.equips_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.equipsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addEquips(int index, EquipData.Builder builderForValue) {
            if (this.equipsBuilder_ == null) {
               this.ensureEquipsIsMutable();
               this.equips_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.equipsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllEquips(Iterable<? extends EquipData> values) {
            if (this.equipsBuilder_ == null) {
               this.ensureEquipsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.equips_);
               this.onChanged();
            } else {
               this.equipsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearEquips() {
            if (this.equipsBuilder_ == null) {
               this.equips_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.equipsBuilder_.clear();
            }

            return this;
         }

         public Builder removeEquips(int index) {
            if (this.equipsBuilder_ == null) {
               this.ensureEquipsIsMutable();
               this.equips_.remove(index);
               this.onChanged();
            } else {
               this.equipsBuilder_.remove(index);
            }

            return this;
         }

         public EquipData.Builder getEquipsBuilder(int index) {
            return (EquipData.Builder)this.getEquipsFieldBuilder().getBuilder(index);
         }

         public EquipDataOrBuilder getEquipsOrBuilder(int index) {
            return this.equipsBuilder_ == null ? (EquipDataOrBuilder)this.equips_.get(index) : (EquipDataOrBuilder)this.equipsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends EquipDataOrBuilder> getEquipsOrBuilderList() {
            return this.equipsBuilder_ != null ? this.equipsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.equips_);
         }

         public EquipData.Builder addEquipsBuilder() {
            return (EquipData.Builder)this.getEquipsFieldBuilder().addBuilder(HeroCardMsg.EquipData.getDefaultInstance());
         }

         public EquipData.Builder addEquipsBuilder(int index) {
            return (EquipData.Builder)this.getEquipsFieldBuilder().addBuilder(index, HeroCardMsg.EquipData.getDefaultInstance());
         }

         public List<EquipData.Builder> getEquipsBuilderList() {
            return this.getEquipsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<EquipData, EquipData.Builder, EquipDataOrBuilder> getEquipsFieldBuilder() {
            if (this.equipsBuilder_ == null) {
               this.equipsBuilder_ = new RepeatedFieldBuilderV3(this.equips_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.equips_ = null;
            }

            return this.equipsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_ZhuHoubuyItem_28633 extends GeneratedMessageV3 implements C2S_ZhuHoubuyItem_28633OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int COUNT_FIELD_NUMBER = 1;
      private int count_;
      private byte memoizedIsInitialized;
      private static final C2S_ZhuHoubuyItem_28633 DEFAULT_INSTANCE = new C2S_ZhuHoubuyItem_28633();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ZhuHoubuyItem_28633> PARSER = new AbstractParser<C2S_ZhuHoubuyItem_28633>() {
         public C2S_ZhuHoubuyItem_28633 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ZhuHoubuyItem_28633(input, extensionRegistry);
         }
      };

      private C2S_ZhuHoubuyItem_28633(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ZhuHoubuyItem_28633() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ZhuHoubuyItem_28633();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ZhuHoubuyItem_28633(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHoubuyItem_28633_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHoubuyItem_28633_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ZhuHoubuyItem_28633.class, Builder.class);
      }

      public boolean hasCount() {
         return (this.bitField0_ & 1) != 0;
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
            output.writeInt32(1, this.count_);
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
               size += CodedOutputStream.computeInt32Size(1, this.count_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ZhuHoubuyItem_28633)) {
            return super.equals(obj);
         } else {
            C2S_ZhuHoubuyItem_28633 other = (C2S_ZhuHoubuyItem_28633)obj;
            if (this.hasCount() != other.hasCount()) {
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
            if (this.hasCount()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ZhuHoubuyItem_28633 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ZhuHoubuyItem_28633)PARSER.parseFrom(data);
      }

      public static C2S_ZhuHoubuyItem_28633 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ZhuHoubuyItem_28633)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ZhuHoubuyItem_28633 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ZhuHoubuyItem_28633)PARSER.parseFrom(data);
      }

      public static C2S_ZhuHoubuyItem_28633 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ZhuHoubuyItem_28633)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ZhuHoubuyItem_28633 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ZhuHoubuyItem_28633)PARSER.parseFrom(data);
      }

      public static C2S_ZhuHoubuyItem_28633 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ZhuHoubuyItem_28633)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ZhuHoubuyItem_28633 parseFrom(InputStream input) throws IOException {
         return (C2S_ZhuHoubuyItem_28633)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ZhuHoubuyItem_28633 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ZhuHoubuyItem_28633)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ZhuHoubuyItem_28633 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ZhuHoubuyItem_28633)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ZhuHoubuyItem_28633 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ZhuHoubuyItem_28633)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ZhuHoubuyItem_28633 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ZhuHoubuyItem_28633)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ZhuHoubuyItem_28633 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ZhuHoubuyItem_28633)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ZhuHoubuyItem_28633 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ZhuHoubuyItem_28633 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ZhuHoubuyItem_28633> parser() {
         return PARSER;
      }

      public Parser<C2S_ZhuHoubuyItem_28633> getParserForType() {
         return PARSER;
      }

      public C2S_ZhuHoubuyItem_28633 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ZhuHoubuyItem_28633OrBuilder {
         private int bitField0_;
         private int count_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHoubuyItem_28633_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHoubuyItem_28633_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ZhuHoubuyItem_28633.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroCardMsg.C2S_ZhuHoubuyItem_28633.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.count_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroCardMsg.internal_static_heroCard_com_gzbz_protobuf_C2S_ZhuHoubuyItem_28633_descriptor;
         }

         public C2S_ZhuHoubuyItem_28633 getDefaultInstanceForType() {
            return HeroCardMsg.C2S_ZhuHoubuyItem_28633.getDefaultInstance();
         }

         public C2S_ZhuHoubuyItem_28633 build() {
            C2S_ZhuHoubuyItem_28633 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ZhuHoubuyItem_28633 buildPartial() {
            C2S_ZhuHoubuyItem_28633 result = new C2S_ZhuHoubuyItem_28633(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.count_ = this.count_;
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
            if (other instanceof C2S_ZhuHoubuyItem_28633) {
               return this.mergeFrom((C2S_ZhuHoubuyItem_28633)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ZhuHoubuyItem_28633 other) {
            if (other == HeroCardMsg.C2S_ZhuHoubuyItem_28633.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCount()) {
                  this.setCount(other.getCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCount();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ZhuHoubuyItem_28633 parsedMessage = null;

            try {
               parsedMessage = (C2S_ZhuHoubuyItem_28633)HeroCardMsg.C2S_ZhuHoubuyItem_28633.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ZhuHoubuyItem_28633)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCount() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCount() {
            return this.count_;
         }

         public Builder setCount(int value) {
            this.bitField0_ |= 1;
            this.count_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCount() {
            this.bitField0_ &= -2;
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

   public interface C2S_BoxLvUp_28609OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_CutTime_28611OrBuilder extends MessageOrBuilder {
      List<CommonMsg.ItemInfo> getCostList();

      CommonMsg.ItemInfo getCost(int index);

      int getCostCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getCostOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getCostOrBuilder(int index);
   }

   public interface C2S_DismissHeroCard_28607OrBuilder extends MessageOrBuilder {
      boolean hasHeroCardType();

      int getHeroCardType();

      boolean hasCode();

      int getCode();
   }

   public interface C2S_HeroCardInfo_28601OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_HeroCardLottery_28603OrBuilder extends MessageOrBuilder {
      boolean hasNum();

      int getNum();

      boolean hasCurMainTaskId();

      int getCurMainTaskId();
   }

   public interface C2S_OptionInfo_28615OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Option_28613OrBuilder extends MessageOrBuilder {
      List<OptionVal> getLotteryOptionList();

      OptionVal getLotteryOption(int index);

      int getLotteryOptionCount();

      List<? extends OptionValOrBuilder> getLotteryOptionOrBuilderList();

      OptionValOrBuilder getLotteryOptionOrBuilder(int index);
   }

   public interface C2S_PresentHeroCard_28605OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasIsResolve();

      boolean getIsResolve();
   }

   public interface C2S_StopAutoLottery_28618OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ZhuHouEquipLottery_28620OrBuilder extends MessageOrBuilder {
      boolean hasNum();

      int getNum();

      boolean hasCurMainTaskId();

      int getCurMainTaskId();
   }

   public interface C2S_ZhuHouInfo_28628OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ZhuHouLevelUp_28624OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ZhuHouResolveEquip_28622OrBuilder extends MessageOrBuilder {
      List<Integer> getCodesList();

      int getCodesCount();

      int getCodes(int index);
   }

   public interface C2S_ZhuHouStampLvUp_28626OrBuilder extends MessageOrBuilder {
      boolean hasCount();

      int getCount();

      boolean hasIsLevelUp();

      boolean getIsLevelUp();
   }

   public interface C2S_ZhuHouWearEquip_28630OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasIsResolve();

      boolean getIsResolve();
   }

   public interface C2S_ZhuHoubuyItem_28633OrBuilder extends MessageOrBuilder {
      boolean hasCount();

      int getCount();
   }

   public interface EquipDataOrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasEquipId();

      int getEquipId();

      boolean hasLevel();

      int getLevel();

      List<EquipTypeAttr> getAttrList();

      EquipTypeAttr getAttr(int index);

      int getAttrCount();

      List<? extends EquipTypeAttrOrBuilder> getAttrOrBuilderList();

      EquipTypeAttrOrBuilder getAttrOrBuilder(int index);

      boolean hasEnable();

      boolean getEnable();
   }

   public interface EquipTypeAttrOrBuilder extends MessageOrBuilder {
      boolean hasHeroType();

      int getHeroType();

      boolean hasType();

      int getType();

      boolean hasWay();

      int getWay();

      boolean hasVal();

      int getVal();
   }

   public interface HeroCardDataOrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasHeroCardId();

      int getHeroCardId();

      boolean hasBreachLv();

      int getBreachLv();

      List<HeroTypeAttr> getAttrList();

      HeroTypeAttr getAttr(int index);

      int getAttrCount();

      List<? extends HeroTypeAttrOrBuilder> getAttrOrBuilderList();

      HeroTypeAttrOrBuilder getAttrOrBuilder(int index);
   }

   public interface HeroTypeAttrOrBuilder extends MessageOrBuilder {
      boolean hasHeroType();

      int getHeroType();

      boolean hasType();

      int getType();

      boolean hasWay();

      int getWay();

      boolean hasVal();

      int getVal();
   }

   public interface OptionValOrBuilder extends MessageOrBuilder {
      boolean hasOption();

      OptionEnum getOption();

      boolean hasVal();

      int getVal();
   }

   public interface S2C_BoxLvUp_28610OrBuilder extends MessageOrBuilder {
      boolean hasCurBoxLv();

      int getCurBoxLv();

      boolean hasBoxNextLvTime();

      long getBoxNextLvTime();
   }

   public interface S2C_CutTime_28612OrBuilder extends MessageOrBuilder {
      boolean hasCurBoxLv();

      int getCurBoxLv();

      boolean hasBoxNextLvTime();

      long getBoxNextLvTime();
   }

   public interface S2C_DismissHeroCard_28608OrBuilder extends MessageOrBuilder {
      List<HeroCardData> getPresentHeroCardList();

      HeroCardData getPresentHeroCard(int index);

      int getPresentHeroCardCount();

      List<? extends HeroCardDataOrBuilder> getPresentHeroCardOrBuilderList();

      HeroCardDataOrBuilder getPresentHeroCardOrBuilder(int index);

      List<HeroCardData> getSurplusHeroCardList();

      HeroCardData getSurplusHeroCard(int index);

      int getSurplusHeroCardCount();

      List<? extends HeroCardDataOrBuilder> getSurplusHeroCardOrBuilderList();

      HeroCardDataOrBuilder getSurplusHeroCardOrBuilder(int index);

      boolean hasResolveCardId();

      int getResolveCardId();
   }

   public interface S2C_HeroCardInfo_28602OrBuilder extends MessageOrBuilder {
      List<HeroCardData> getPresentHeroCardList();

      HeroCardData getPresentHeroCard(int index);

      int getPresentHeroCardCount();

      List<? extends HeroCardDataOrBuilder> getPresentHeroCardOrBuilderList();

      HeroCardDataOrBuilder getPresentHeroCardOrBuilder(int index);

      List<HeroCardData> getSurplusHeroCardList();

      HeroCardData getSurplusHeroCard(int index);

      int getSurplusHeroCardCount();

      List<? extends HeroCardDataOrBuilder> getSurplusHeroCardOrBuilderList();

      HeroCardDataOrBuilder getSurplusHeroCardOrBuilder(int index);

      boolean hasCurBoxLv();

      int getCurBoxLv();

      boolean hasBoxNextLvTime();

      long getBoxNextLvTime();

      boolean hasDailyLotteryNum();

      int getDailyLotteryNum();

      boolean hasLotteryCount();

      long getLotteryCount();
   }

   public interface S2C_HeroCardLottery_28604OrBuilder extends MessageOrBuilder {
      List<HeroCardData> getHeroCardList();

      HeroCardData getHeroCard(int index);

      int getHeroCardCount();

      List<? extends HeroCardDataOrBuilder> getHeroCardOrBuilderList();

      HeroCardDataOrBuilder getHeroCardOrBuilder(int index);

      List<HeroCardData> getResolveCardList();

      HeroCardData getResolveCard(int index);

      int getResolveCardCount();

      List<? extends HeroCardDataOrBuilder> getResolveCardOrBuilderList();

      HeroCardDataOrBuilder getResolveCardOrBuilder(int index);

      boolean hasDailyLotteryNum();

      int getDailyLotteryNum();

      boolean hasResult();

      int getResult();

      boolean hasLotteryCount();

      long getLotteryCount();

      boolean hasIsBackAuto();

      boolean getIsBackAuto();
   }

   public interface S2C_NoticePresentCard_28617OrBuilder extends MessageOrBuilder {
      List<HeroCardData> getPresentHeroCardList();

      HeroCardData getPresentHeroCard(int index);

      int getPresentHeroCardCount();

      List<? extends HeroCardDataOrBuilder> getPresentHeroCardOrBuilderList();

      HeroCardDataOrBuilder getPresentHeroCardOrBuilder(int index);
   }

   public interface S2C_OptionInfo_28616OrBuilder extends MessageOrBuilder {
      List<OptionVal> getLotteryOptionList();

      OptionVal getLotteryOption(int index);

      int getLotteryOptionCount();

      List<? extends OptionValOrBuilder> getLotteryOptionOrBuilderList();

      OptionValOrBuilder getLotteryOptionOrBuilder(int index);
   }

   public interface S2C_Option_28614OrBuilder extends MessageOrBuilder {
      List<OptionVal> getLotteryOptionList();

      OptionVal getLotteryOption(int index);

      int getLotteryOptionCount();

      List<? extends OptionValOrBuilder> getLotteryOptionOrBuilderList();

      OptionValOrBuilder getLotteryOptionOrBuilder(int index);
   }

   public interface S2C_PresentHeroCard_28606OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasIsResolve();

      boolean getIsResolve();

      List<HeroCardData> getPresentHeroCardList();

      HeroCardData getPresentHeroCard(int index);

      int getPresentHeroCardCount();

      List<? extends HeroCardDataOrBuilder> getPresentHeroCardOrBuilderList();

      HeroCardDataOrBuilder getPresentHeroCardOrBuilder(int index);

      List<HeroCardData> getSurplusHeroCardList();

      HeroCardData getSurplusHeroCard(int index);

      int getSurplusHeroCardCount();

      List<? extends HeroCardDataOrBuilder> getSurplusHeroCardOrBuilderList();

      HeroCardDataOrBuilder getSurplusHeroCardOrBuilder(int index);
   }

   public interface S2C_StopAutoLottery_28619OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_ZhuHouEquipInfo_28632OrBuilder extends MessageOrBuilder {
      List<EquipData> getEquipsList();

      EquipData getEquips(int index);

      int getEquipsCount();

      List<? extends EquipDataOrBuilder> getEquipsOrBuilderList();

      EquipDataOrBuilder getEquipsOrBuilder(int index);
   }

   public interface S2C_ZhuHouEquipLottery_28621OrBuilder extends MessageOrBuilder {
      List<EquipData> getEquipDataList();

      EquipData getEquipData(int index);

      int getEquipDataCount();

      List<? extends EquipDataOrBuilder> getEquipDataOrBuilderList();

      EquipDataOrBuilder getEquipDataOrBuilder(int index);

      boolean hasDailyLotteryNum();

      int getDailyLotteryNum();

      boolean hasResult();

      int getResult();

      boolean hasLotteryCount();

      long getLotteryCount();

      List<EquipData> getResolveEquipList();

      EquipData getResolveEquip(int index);

      int getResolveEquipCount();

      List<? extends EquipDataOrBuilder> getResolveEquipOrBuilderList();

      EquipDataOrBuilder getResolveEquipOrBuilder(int index);
   }

   public interface S2C_ZhuHouInfo_28629OrBuilder extends MessageOrBuilder {
      List<EquipData> getEquipsList();

      EquipData getEquips(int index);

      int getEquipsCount();

      List<? extends EquipDataOrBuilder> getEquipsOrBuilderList();

      EquipDataOrBuilder getEquipsOrBuilder(int index);

      boolean hasLevel();

      int getLevel();

      boolean hasStampLevel();

      int getStampLevel();

      boolean hasStampNextLvTime();

      long getStampNextLvTime();

      boolean hasDailyLotteryNum();

      int getDailyLotteryNum();

      boolean hasLotteryCount();

      long getLotteryCount();

      boolean hasExp();

      int getExp();
   }

   public interface S2C_ZhuHouLevelUp_28625OrBuilder extends MessageOrBuilder {
      boolean hasLevel();

      int getLevel();

      boolean hasExp();

      long getExp();
   }

   public interface S2C_ZhuHouResolveEquip_28623OrBuilder extends MessageOrBuilder {
      List<EquipData> getEquipsList();

      EquipData getEquips(int index);

      int getEquipsCount();

      List<? extends EquipDataOrBuilder> getEquipsOrBuilderList();

      EquipDataOrBuilder getEquipsOrBuilder(int index);

      List<Integer> getCodesList();

      int getCodesCount();

      int getCodes(int index);

      boolean hasExp();

      int getExp();

      boolean hasLevel();

      int getLevel();
   }

   public interface S2C_ZhuHouStampLvUp_28627OrBuilder extends MessageOrBuilder {
      boolean hasCurBoxLv();

      int getCurBoxLv();

      boolean hasBoxNextLvTime();

      long getBoxNextLvTime();
   }

   public interface S2C_ZhuHouWearEquip_28631OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasIsResolve();

      boolean getIsResolve();

      List<EquipData> getEquipsList();

      EquipData getEquips(int index);

      int getEquipsCount();

      List<? extends EquipDataOrBuilder> getEquipsOrBuilderList();

      EquipDataOrBuilder getEquipsOrBuilder(int index);

      boolean hasExp();

      int getExp();

      boolean hasLevel();

      int getLevel();
   }
}
