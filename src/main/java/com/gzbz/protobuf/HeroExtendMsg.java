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

public final class HeroExtendMsg {
   private static final Descriptors.Descriptor internal_static_heroExtend_com_gzbz_protobuf_HeroRankInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroExtend_com_gzbz_protobuf_HeroRankInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroExtend_com_gzbz_protobuf_C2S_OpenHeroRankUi_13201_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroExtend_com_gzbz_protobuf_C2S_OpenHeroRankUi_13201_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroExtend_com_gzbz_protobuf_S2C_OpenHeroRankUi_13202_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroExtend_com_gzbz_protobuf_S2C_OpenHeroRankUi_13202_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroExtend_com_gzbz_protobuf_C2S_OpenHeroBagUi_13203_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroExtend_com_gzbz_protobuf_C2S_OpenHeroBagUi_13203_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroExtend_com_gzbz_protobuf_S2C_OpenHeroBagUi_13204_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroExtend_com_gzbz_protobuf_S2C_OpenHeroBagUi_13204_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroState_13211_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroState_13211_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroState_13212_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroState_13212_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroNation_13213_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroNation_13213_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroNation_13214_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroNation_13214_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroExtend_com_gzbz_protobuf_C2S_HeroExchangeEquip_13215_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroExtend_com_gzbz_protobuf_C2S_HeroExchangeEquip_13215_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroExtend_com_gzbz_protobuf_S2C_HeroExchangeEquip_13216_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroExtend_com_gzbz_protobuf_S2C_HeroExchangeEquip_13216_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroExtend_com_gzbz_protobuf_C2S_HideArraying_13217_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroExtend_com_gzbz_protobuf_C2S_HideArraying_13217_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroExtend_com_gzbz_protobuf_S2C_HideArraying_13218_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroExtend_com_gzbz_protobuf_S2C_HideArraying_13218_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroExtend_com_gzbz_protobuf_C2S_SaveArraying_13219_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroExtend_com_gzbz_protobuf_C2S_SaveArraying_13219_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroExtend_com_gzbz_protobuf_S2C_SaveArraying_13220_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroExtend_com_gzbz_protobuf_S2C_SaveArraying_13220_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroExtend_com_gzbz_protobuf_HeroUpdateStarRequest_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroExtend_com_gzbz_protobuf_HeroUpdateStarRequest_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroExtend_com_gzbz_protobuf_C2S_OneKeyHeroUpdateStar_13221_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroExtend_com_gzbz_protobuf_C2S_OneKeyHeroUpdateStar_13221_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroExtend_com_gzbz_protobuf_S2C_OneKeyHeroUpdateStarResult_13222_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroExtend_com_gzbz_protobuf_S2C_OneKeyHeroUpdateStarResult_13222_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroJob_13223_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroJob_13223_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroJob_13224_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroJob_13224_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroExtend_com_gzbz_protobuf_C2S_HeroInfo_13225_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroExtend_com_gzbz_protobuf_C2S_HeroInfo_13225_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_heroExtend_com_gzbz_protobuf_S2C_HeroInfo_13226_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_heroExtend_com_gzbz_protobuf_S2C_HeroInfo_13226_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private HeroExtendMsg() {
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
      String[] descriptorData = new String[]{"\n\u0010HeroExtend.proto\u0012\u001cheroExtend.com.gzbz.protobuf\u001a\fcommon.proto\u001a\nHero.proto\"h\n\fHeroRankInfo\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012&\n\nplayerInfo\u0018\u0002 \u0002(\u000b2\u0012.common.PlayerInfo\u0012\"\n\bheroInfo\u0018\u0003 \u0002(\u000b2\u0010.common.HeroInfo\"*\n\u0018C2S_OpenHeroRankUi_13201\u0012\u000e\n\u0006heroId\u0018\u0001 \u0002(\u0005\"U\n\u0018S2C_OpenHeroRankUi_13202\u00129\n\u0005infos\u0018\u0001 \u0003(\u000b2*.heroExtend.com.gzbz.protobuf.HeroRankInfo\"\u0019\n\u0017C2S_OpenHeroBagUi_13203\";\n\u0017S2C_OpenHeroBagUi_13204\u0012 \n\u0005ranks\u0018\u0001 \u0003(\u000b2\u0011.common.MapDataII\"_\n\u001fC2S_UpdateFriendHeroState_13211\u0012'\n\farrayingType\u0018\u0001 \u0002(\u000e2\u0011.common.HeroState\u0012\u0013\n\u000bfriendState\u0018\u0002 \u0002(\u0005\"o\n\u001fS2C_UpdateFriendHeroState_13212\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012'\n\farrayingType\u0018\u0002 \u0002(\u000e2\u0011.common.HeroState\u0012\u0013\n\u000bfriendState\u0018\u0003 \u0002(\u0005\"a\n C2S_UpdateFriendHeroNation_13213\u0012'\n\farrayingType\u0018\u0001 \u0002(\u000e2\u0011.common.HeroState\u0012\u0014\n\ffriendNation\u0018\u0002 \u0002(\u0005\"q\n S2C_UpdateFriendHeroNation_13214\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012'\n\farrayingType\u0018\u0002 \u0002(\u000e2\u0011.common.HeroState\u0012\u0014\n\ffriendNation\u0018\u0003 \u0002(\u0005\"\\\n\u001bC2S_HeroExchangeEquip_13215\u0012\u0014\n\fmainHeroCode\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rslaveHeroCode\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bposition\u0018\u0003 \u0002(\u0005\"C\n\u001bS2C_HeroExchangeEquip_13216\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\u0014\n\fmainHeroCode\u0018\u0002 \u0002(\u0005\"Q\n\u0016C2S_HideArraying_13217\u0012'\n\farrayingType\u0018\u0001 \u0002(\u000e2\u0011.common.HeroState\u0012\u000e\n\u0006isHide\u0018\u0002 \u0002(\b\"Q\n\u0016S2C_HideArraying_13218\u0012'\n\farrayingType\u0018\u0001 \u0002(\u000e2\u0011.common.HeroState\u0012\u000e\n\u0006isHide\u0018\u0002 \u0002(\b\"u\n\u0016C2S_SaveArraying_13219\u0012\u0010\n\bsystemId\u0018\u0001 \u0002(\u0005\u0012:\n\farrayingInfo\u0018\u0002 \u0003(\u000b2$.hero.com.gzbz.protobuf.ArrayingList\u0012\r\n\u0005force\u0018\u0003 \u0001(\b\"u\n\u0016S2C_SaveArraying_13220\u0012\u0010\n\bsystemId\u0018\u0001 \u0002(\u0005\u0012:\n\farrayingInfo\u0018\u0002 \u0003(\u000b2$.hero.com.gzbz.protobuf.ArrayingList\u0012\r\n\u0005force\u0018\u0003 \u0001(\b\"M\n\u0015HeroUpdateStarRequest\u00124\n\u0005grids\u0018\u0001 \u0003(\u000b2%.hero.com.gzbz.protobuf.MaterHeroList\"m\n\u001eC2S_OneKeyHeroUpdateStar_13221\u0012K\n\u000eupStarRequests\u0018\u0001 \u0003(\u000b23.heroExtend.com.gzbz.protobuf.HeroUpdateStarRequest\"D\n$S2C_OneKeyHeroUpdateStarResult_13222\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004code\u0018\u0002 \u0003(\u0005\"[\n\u001dC2S_UpdateFriendHeroJob_13223\u0012'\n\farrayingType\u0018\u0001 \u0002(\u000e2\u0011.common.HeroState\u0012\u0011\n\tfriendJob\u0018\u0002 \u0002(\u0005\"[\n\u001dS2C_UpdateFriendHeroJob_13224\u0012'\n\farrayingType\u0018\u0001 \u0002(\u000e2\u0011.common.HeroState\u0012\u0011\n\tfriendJob\u0018\u0002 \u0002(\u0005\"F\n\u0012C2S_HeroInfo_13225\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004code\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bserverId\u0018\u0003 \u0002(\u0005\"8\n\u0012S2C_HeroInfo_13226\u0012\"\n\bheroInfo\u0018\u0001 \u0002(\u000b2\u0010.common.HeroInfoB$\n\u0011com.gzbz.protobufB\rHeroExtendMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), HeroMsg.getDescriptor()});
      internal_static_heroExtend_com_gzbz_protobuf_HeroRankInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_heroExtend_com_gzbz_protobuf_HeroRankInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroExtend_com_gzbz_protobuf_HeroRankInfo_descriptor, new String[]{"Rank", "PlayerInfo", "HeroInfo"});
      internal_static_heroExtend_com_gzbz_protobuf_C2S_OpenHeroRankUi_13201_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_heroExtend_com_gzbz_protobuf_C2S_OpenHeroRankUi_13201_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroExtend_com_gzbz_protobuf_C2S_OpenHeroRankUi_13201_descriptor, new String[]{"HeroId"});
      internal_static_heroExtend_com_gzbz_protobuf_S2C_OpenHeroRankUi_13202_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_heroExtend_com_gzbz_protobuf_S2C_OpenHeroRankUi_13202_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroExtend_com_gzbz_protobuf_S2C_OpenHeroRankUi_13202_descriptor, new String[]{"Infos"});
      internal_static_heroExtend_com_gzbz_protobuf_C2S_OpenHeroBagUi_13203_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_heroExtend_com_gzbz_protobuf_C2S_OpenHeroBagUi_13203_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroExtend_com_gzbz_protobuf_C2S_OpenHeroBagUi_13203_descriptor, new String[0]);
      internal_static_heroExtend_com_gzbz_protobuf_S2C_OpenHeroBagUi_13204_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_heroExtend_com_gzbz_protobuf_S2C_OpenHeroBagUi_13204_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroExtend_com_gzbz_protobuf_S2C_OpenHeroBagUi_13204_descriptor, new String[]{"Ranks"});
      internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroState_13211_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroState_13211_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroState_13211_descriptor, new String[]{"ArrayingType", "FriendState"});
      internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroState_13212_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroState_13212_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroState_13212_descriptor, new String[]{"Result", "ArrayingType", "FriendState"});
      internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroNation_13213_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroNation_13213_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroNation_13213_descriptor, new String[]{"ArrayingType", "FriendNation"});
      internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroNation_13214_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroNation_13214_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroNation_13214_descriptor, new String[]{"Result", "ArrayingType", "FriendNation"});
      internal_static_heroExtend_com_gzbz_protobuf_C2S_HeroExchangeEquip_13215_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_heroExtend_com_gzbz_protobuf_C2S_HeroExchangeEquip_13215_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroExtend_com_gzbz_protobuf_C2S_HeroExchangeEquip_13215_descriptor, new String[]{"MainHeroCode", "SlaveHeroCode", "Position"});
      internal_static_heroExtend_com_gzbz_protobuf_S2C_HeroExchangeEquip_13216_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_heroExtend_com_gzbz_protobuf_S2C_HeroExchangeEquip_13216_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroExtend_com_gzbz_protobuf_S2C_HeroExchangeEquip_13216_descriptor, new String[]{"Result", "MainHeroCode"});
      internal_static_heroExtend_com_gzbz_protobuf_C2S_HideArraying_13217_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_heroExtend_com_gzbz_protobuf_C2S_HideArraying_13217_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroExtend_com_gzbz_protobuf_C2S_HideArraying_13217_descriptor, new String[]{"ArrayingType", "IsHide"});
      internal_static_heroExtend_com_gzbz_protobuf_S2C_HideArraying_13218_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_heroExtend_com_gzbz_protobuf_S2C_HideArraying_13218_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroExtend_com_gzbz_protobuf_S2C_HideArraying_13218_descriptor, new String[]{"ArrayingType", "IsHide"});
      internal_static_heroExtend_com_gzbz_protobuf_C2S_SaveArraying_13219_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_heroExtend_com_gzbz_protobuf_C2S_SaveArraying_13219_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroExtend_com_gzbz_protobuf_C2S_SaveArraying_13219_descriptor, new String[]{"SystemId", "ArrayingInfo", "Force"});
      internal_static_heroExtend_com_gzbz_protobuf_S2C_SaveArraying_13220_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_heroExtend_com_gzbz_protobuf_S2C_SaveArraying_13220_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroExtend_com_gzbz_protobuf_S2C_SaveArraying_13220_descriptor, new String[]{"SystemId", "ArrayingInfo", "Force"});
      internal_static_heroExtend_com_gzbz_protobuf_HeroUpdateStarRequest_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_heroExtend_com_gzbz_protobuf_HeroUpdateStarRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroExtend_com_gzbz_protobuf_HeroUpdateStarRequest_descriptor, new String[]{"Grids"});
      internal_static_heroExtend_com_gzbz_protobuf_C2S_OneKeyHeroUpdateStar_13221_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_heroExtend_com_gzbz_protobuf_C2S_OneKeyHeroUpdateStar_13221_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroExtend_com_gzbz_protobuf_C2S_OneKeyHeroUpdateStar_13221_descriptor, new String[]{"UpStarRequests"});
      internal_static_heroExtend_com_gzbz_protobuf_S2C_OneKeyHeroUpdateStarResult_13222_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_heroExtend_com_gzbz_protobuf_S2C_OneKeyHeroUpdateStarResult_13222_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroExtend_com_gzbz_protobuf_S2C_OneKeyHeroUpdateStarResult_13222_descriptor, new String[]{"Result", "Code"});
      internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroJob_13223_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroJob_13223_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroJob_13223_descriptor, new String[]{"ArrayingType", "FriendJob"});
      internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroJob_13224_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroJob_13224_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroJob_13224_descriptor, new String[]{"ArrayingType", "FriendJob"});
      internal_static_heroExtend_com_gzbz_protobuf_C2S_HeroInfo_13225_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_heroExtend_com_gzbz_protobuf_C2S_HeroInfo_13225_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroExtend_com_gzbz_protobuf_C2S_HeroInfo_13225_descriptor, new String[]{"PlayerId", "Code", "ServerId"});
      internal_static_heroExtend_com_gzbz_protobuf_S2C_HeroInfo_13226_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_heroExtend_com_gzbz_protobuf_S2C_HeroInfo_13226_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_heroExtend_com_gzbz_protobuf_S2C_HeroInfo_13226_descriptor, new String[]{"HeroInfo"});
      CommonMsg.getDescriptor();
      HeroMsg.getDescriptor();
   }

   public static final class HeroRankInfo extends GeneratedMessageV3 implements HeroRankInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int PLAYERINFO_FIELD_NUMBER = 2;
      private CommonMsg.PlayerInfo playerInfo_;
      public static final int HEROINFO_FIELD_NUMBER = 3;
      private CommonMsg.HeroInfo heroInfo_;
      private byte memoizedIsInitialized;
      private static final HeroRankInfo DEFAULT_INSTANCE = new HeroRankInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<HeroRankInfo> PARSER = new AbstractParser<HeroRankInfo>() {
         public HeroRankInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new HeroRankInfo(input, extensionRegistry);
         }
      };

      private HeroRankInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private HeroRankInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new HeroRankInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private HeroRankInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.rank_ = input.readInt32();
                        break;
                     case 18:
                        CommonMsg.PlayerInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.playerInfo_.toBuilder();
                        }

                        this.playerInfo_ = (CommonMsg.PlayerInfo)input.readMessage(CommonMsg.PlayerInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.playerInfo_);
                           this.playerInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 26:
                        CommonMsg.HeroInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.heroInfo_.toBuilder();
                        }

                        this.heroInfo_ = (CommonMsg.HeroInfo)input.readMessage(CommonMsg.HeroInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.heroInfo_);
                           this.heroInfo_ = subBuilder.buildPartial();
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
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_HeroRankInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_HeroRankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(HeroRankInfo.class, Builder.class);
      }

      public boolean hasRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasPlayerInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.PlayerInfo getPlayerInfo() {
         return this.playerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.playerInfo_;
      }

      public CommonMsg.PlayerInfoOrBuilder getPlayerInfoOrBuilder() {
         return this.playerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.playerInfo_;
      }

      public boolean hasHeroInfo() {
         return (this.bitField0_ & 4) != 0;
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
         } else if (!this.hasRank()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getPlayerInfo().isInitialized()) {
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
            output.writeInt32(1, this.rank_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getPlayerInfo());
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(3, this.getHeroInfo());
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
               size += CodedOutputStream.computeInt32Size(1, this.rank_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getPlayerInfo());
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(3, this.getHeroInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof HeroRankInfo)) {
            return super.equals(obj);
         } else {
            HeroRankInfo other = (HeroRankInfo)obj;
            if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasPlayerInfo() != other.hasPlayerInfo()) {
               return false;
            } else if (this.hasPlayerInfo() && !this.getPlayerInfo().equals(other.getPlayerInfo())) {
               return false;
            } else if (this.hasHeroInfo() != other.hasHeroInfo()) {
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
            if (this.hasRank()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRank();
            }

            if (this.hasPlayerInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerInfo().hashCode();
            }

            if (this.hasHeroInfo()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHeroInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static HeroRankInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (HeroRankInfo)PARSER.parseFrom(data);
      }

      public static HeroRankInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroRankInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroRankInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (HeroRankInfo)PARSER.parseFrom(data);
      }

      public static HeroRankInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroRankInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroRankInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (HeroRankInfo)PARSER.parseFrom(data);
      }

      public static HeroRankInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroRankInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroRankInfo parseFrom(InputStream input) throws IOException {
         return (HeroRankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HeroRankInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroRankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static HeroRankInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (HeroRankInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static HeroRankInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroRankInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static HeroRankInfo parseFrom(CodedInputStream input) throws IOException {
         return (HeroRankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HeroRankInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroRankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(HeroRankInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static HeroRankInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<HeroRankInfo> parser() {
         return PARSER;
      }

      public Parser<HeroRankInfo> getParserForType() {
         return PARSER;
      }

      public HeroRankInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HeroRankInfoOrBuilder {
         private int bitField0_;
         private int rank_;
         private CommonMsg.PlayerInfo playerInfo_;
         private SingleFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> playerInfoBuilder_;
         private CommonMsg.HeroInfo heroInfo_;
         private SingleFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> heroInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_HeroRankInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_HeroRankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(HeroRankInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroExtendMsg.HeroRankInfo.alwaysUseFieldBuilders) {
               this.getPlayerInfoFieldBuilder();
               this.getHeroInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            if (this.playerInfoBuilder_ == null) {
               this.playerInfo_ = null;
            } else {
               this.playerInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = null;
            } else {
               this.heroInfoBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_HeroRankInfo_descriptor;
         }

         public HeroRankInfo getDefaultInstanceForType() {
            return HeroExtendMsg.HeroRankInfo.getDefaultInstance();
         }

         public HeroRankInfo build() {
            HeroRankInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public HeroRankInfo buildPartial() {
            HeroRankInfo result = new HeroRankInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.playerInfoBuilder_ == null) {
                  result.playerInfo_ = this.playerInfo_;
               } else {
                  result.playerInfo_ = (CommonMsg.PlayerInfo)this.playerInfoBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               if (this.heroInfoBuilder_ == null) {
                  result.heroInfo_ = this.heroInfo_;
               } else {
                  result.heroInfo_ = (CommonMsg.HeroInfo)this.heroInfoBuilder_.build();
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
            if (other instanceof HeroRankInfo) {
               return this.mergeFrom((HeroRankInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(HeroRankInfo other) {
            if (other == HeroExtendMsg.HeroRankInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasPlayerInfo()) {
                  this.mergePlayerInfo(other.getPlayerInfo());
               }

               if (other.hasHeroInfo()) {
                  this.mergeHeroInfo(other.getHeroInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRank()) {
               return false;
            } else if (!this.hasPlayerInfo()) {
               return false;
            } else if (!this.hasHeroInfo()) {
               return false;
            } else if (!this.getPlayerInfo().isInitialized()) {
               return false;
            } else {
               return this.getHeroInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            HeroRankInfo parsedMessage = null;

            try {
               parsedMessage = (HeroRankInfo)HeroExtendMsg.HeroRankInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (HeroRankInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRank() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRank() {
            return this.rank_;
         }

         public Builder setRank(int value) {
            this.bitField0_ |= 1;
            this.rank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRank() {
            this.bitField0_ &= -2;
            this.rank_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.PlayerInfo getPlayerInfo() {
            if (this.playerInfoBuilder_ == null) {
               return this.playerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.playerInfo_;
            } else {
               return (CommonMsg.PlayerInfo)this.playerInfoBuilder_.getMessage();
            }
         }

         public Builder setPlayerInfo(CommonMsg.PlayerInfo value) {
            if (this.playerInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.playerInfo_ = value;
               this.onChanged();
            } else {
               this.playerInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setPlayerInfo(CommonMsg.PlayerInfo.Builder builderForValue) {
            if (this.playerInfoBuilder_ == null) {
               this.playerInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.playerInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergePlayerInfo(CommonMsg.PlayerInfo value) {
            if (this.playerInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.playerInfo_ != null && this.playerInfo_ != CommonMsg.PlayerInfo.getDefaultInstance()) {
                  this.playerInfo_ = CommonMsg.PlayerInfo.newBuilder(this.playerInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.playerInfo_ = value;
               }

               this.onChanged();
            } else {
               this.playerInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearPlayerInfo() {
            if (this.playerInfoBuilder_ == null) {
               this.playerInfo_ = null;
               this.onChanged();
            } else {
               this.playerInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.PlayerInfo.Builder getPlayerInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.PlayerInfo.Builder)this.getPlayerInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.PlayerInfoOrBuilder getPlayerInfoOrBuilder() {
            if (this.playerInfoBuilder_ != null) {
               return (CommonMsg.PlayerInfoOrBuilder)this.playerInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.playerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.playerInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> getPlayerInfoFieldBuilder() {
            if (this.playerInfoBuilder_ == null) {
               this.playerInfoBuilder_ = new SingleFieldBuilderV3(this.getPlayerInfo(), this.getParentForChildren(), this.isClean());
               this.playerInfo_ = null;
            }

            return this.playerInfoBuilder_;
         }

         public boolean hasHeroInfo() {
            return (this.bitField0_ & 4) != 0;
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

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setHeroInfo(CommonMsg.HeroInfo.Builder builderForValue) {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.heroInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeHeroInfo(CommonMsg.HeroInfo value) {
            if (this.heroInfoBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.heroInfo_ != null && this.heroInfo_ != CommonMsg.HeroInfo.getDefaultInstance()) {
                  this.heroInfo_ = CommonMsg.HeroInfo.newBuilder(this.heroInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.heroInfo_ = value;
               }

               this.onChanged();
            } else {
               this.heroInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearHeroInfo() {
            if (this.heroInfoBuilder_ == null) {
               this.heroInfo_ = null;
               this.onChanged();
            } else {
               this.heroInfoBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public CommonMsg.HeroInfo.Builder getHeroInfoBuilder() {
            this.bitField0_ |= 4;
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

   public static final class C2S_OpenHeroRankUi_13201 extends GeneratedMessageV3 implements C2S_OpenHeroRankUi_13201OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROID_FIELD_NUMBER = 1;
      private int heroId_;
      private byte memoizedIsInitialized;
      private static final C2S_OpenHeroRankUi_13201 DEFAULT_INSTANCE = new C2S_OpenHeroRankUi_13201();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenHeroRankUi_13201> PARSER = new AbstractParser<C2S_OpenHeroRankUi_13201>() {
         public C2S_OpenHeroRankUi_13201 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenHeroRankUi_13201(input, extensionRegistry);
         }
      };

      private C2S_OpenHeroRankUi_13201(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenHeroRankUi_13201() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenHeroRankUi_13201();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenHeroRankUi_13201(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_OpenHeroRankUi_13201_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_OpenHeroRankUi_13201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenHeroRankUi_13201.class, Builder.class);
      }

      public boolean hasHeroId() {
         return (this.bitField0_ & 1) != 0;
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
         } else if (!this.hasHeroId()) {
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_OpenHeroRankUi_13201)) {
            return super.equals(obj);
         } else {
            C2S_OpenHeroRankUi_13201 other = (C2S_OpenHeroRankUi_13201)obj;
            if (this.hasHeroId() != other.hasHeroId()) {
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
            if (this.hasHeroId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_OpenHeroRankUi_13201 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenHeroRankUi_13201)PARSER.parseFrom(data);
      }

      public static C2S_OpenHeroRankUi_13201 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenHeroRankUi_13201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenHeroRankUi_13201 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenHeroRankUi_13201)PARSER.parseFrom(data);
      }

      public static C2S_OpenHeroRankUi_13201 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenHeroRankUi_13201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenHeroRankUi_13201 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenHeroRankUi_13201)PARSER.parseFrom(data);
      }

      public static C2S_OpenHeroRankUi_13201 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenHeroRankUi_13201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenHeroRankUi_13201 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenHeroRankUi_13201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenHeroRankUi_13201 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenHeroRankUi_13201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenHeroRankUi_13201 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenHeroRankUi_13201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenHeroRankUi_13201 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenHeroRankUi_13201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenHeroRankUi_13201 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenHeroRankUi_13201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenHeroRankUi_13201 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenHeroRankUi_13201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenHeroRankUi_13201 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenHeroRankUi_13201 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenHeroRankUi_13201> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenHeroRankUi_13201> getParserForType() {
         return PARSER;
      }

      public C2S_OpenHeroRankUi_13201 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenHeroRankUi_13201OrBuilder {
         private int bitField0_;
         private int heroId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_OpenHeroRankUi_13201_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_OpenHeroRankUi_13201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenHeroRankUi_13201.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroExtendMsg.C2S_OpenHeroRankUi_13201.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_OpenHeroRankUi_13201_descriptor;
         }

         public C2S_OpenHeroRankUi_13201 getDefaultInstanceForType() {
            return HeroExtendMsg.C2S_OpenHeroRankUi_13201.getDefaultInstance();
         }

         public C2S_OpenHeroRankUi_13201 build() {
            C2S_OpenHeroRankUi_13201 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenHeroRankUi_13201 buildPartial() {
            C2S_OpenHeroRankUi_13201 result = new C2S_OpenHeroRankUi_13201(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroId_ = this.heroId_;
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
            if (other instanceof C2S_OpenHeroRankUi_13201) {
               return this.mergeFrom((C2S_OpenHeroRankUi_13201)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenHeroRankUi_13201 other) {
            if (other == HeroExtendMsg.C2S_OpenHeroRankUi_13201.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroId()) {
                  this.setHeroId(other.getHeroId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasHeroId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_OpenHeroRankUi_13201 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenHeroRankUi_13201)HeroExtendMsg.C2S_OpenHeroRankUi_13201.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenHeroRankUi_13201)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_OpenHeroRankUi_13202 extends GeneratedMessageV3 implements S2C_OpenHeroRankUi_13202OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFOS_FIELD_NUMBER = 1;
      private List<HeroRankInfo> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenHeroRankUi_13202 DEFAULT_INSTANCE = new S2C_OpenHeroRankUi_13202();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenHeroRankUi_13202> PARSER = new AbstractParser<S2C_OpenHeroRankUi_13202>() {
         public S2C_OpenHeroRankUi_13202 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenHeroRankUi_13202(input, extensionRegistry);
         }
      };

      private S2C_OpenHeroRankUi_13202(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenHeroRankUi_13202() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenHeroRankUi_13202();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenHeroRankUi_13202(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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

                        this.infos_.add(input.readMessage(HeroExtendMsg.HeroRankInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_OpenHeroRankUi_13202_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_OpenHeroRankUi_13202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenHeroRankUi_13202.class, Builder.class);
      }

      public List<HeroRankInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends HeroRankInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public HeroRankInfo getInfos(int index) {
         return (HeroRankInfo)this.infos_.get(index);
      }

      public HeroRankInfoOrBuilder getInfosOrBuilder(int index) {
         return (HeroRankInfoOrBuilder)this.infos_.get(index);
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
         } else if (!(obj instanceof S2C_OpenHeroRankUi_13202)) {
            return super.equals(obj);
         } else {
            S2C_OpenHeroRankUi_13202 other = (S2C_OpenHeroRankUi_13202)obj;
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

      public static S2C_OpenHeroRankUi_13202 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenHeroRankUi_13202)PARSER.parseFrom(data);
      }

      public static S2C_OpenHeroRankUi_13202 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenHeroRankUi_13202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenHeroRankUi_13202 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenHeroRankUi_13202)PARSER.parseFrom(data);
      }

      public static S2C_OpenHeroRankUi_13202 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenHeroRankUi_13202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenHeroRankUi_13202 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenHeroRankUi_13202)PARSER.parseFrom(data);
      }

      public static S2C_OpenHeroRankUi_13202 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenHeroRankUi_13202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenHeroRankUi_13202 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenHeroRankUi_13202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenHeroRankUi_13202 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenHeroRankUi_13202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenHeroRankUi_13202 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenHeroRankUi_13202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenHeroRankUi_13202 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenHeroRankUi_13202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenHeroRankUi_13202 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenHeroRankUi_13202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenHeroRankUi_13202 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenHeroRankUi_13202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenHeroRankUi_13202 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenHeroRankUi_13202 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenHeroRankUi_13202> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenHeroRankUi_13202> getParserForType() {
         return PARSER;
      }

      public S2C_OpenHeroRankUi_13202 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenHeroRankUi_13202OrBuilder {
         private int bitField0_;
         private List<HeroRankInfo> infos_;
         private RepeatedFieldBuilderV3<HeroRankInfo, HeroRankInfo.Builder, HeroRankInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_OpenHeroRankUi_13202_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_OpenHeroRankUi_13202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenHeroRankUi_13202.class, Builder.class);
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
            if (HeroExtendMsg.S2C_OpenHeroRankUi_13202.alwaysUseFieldBuilders) {
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
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_OpenHeroRankUi_13202_descriptor;
         }

         public S2C_OpenHeroRankUi_13202 getDefaultInstanceForType() {
            return HeroExtendMsg.S2C_OpenHeroRankUi_13202.getDefaultInstance();
         }

         public S2C_OpenHeroRankUi_13202 build() {
            S2C_OpenHeroRankUi_13202 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenHeroRankUi_13202 buildPartial() {
            S2C_OpenHeroRankUi_13202 result = new S2C_OpenHeroRankUi_13202(this);
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
            if (other instanceof S2C_OpenHeroRankUi_13202) {
               return this.mergeFrom((S2C_OpenHeroRankUi_13202)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenHeroRankUi_13202 other) {
            if (other == HeroExtendMsg.S2C_OpenHeroRankUi_13202.getDefaultInstance()) {
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
                     this.infosBuilder_ = HeroExtendMsg.S2C_OpenHeroRankUi_13202.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
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
            S2C_OpenHeroRankUi_13202 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenHeroRankUi_13202)HeroExtendMsg.S2C_OpenHeroRankUi_13202.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenHeroRankUi_13202)e.getUnfinishedMessage();
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

         public List<HeroRankInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public HeroRankInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (HeroRankInfo)this.infos_.get(index) : (HeroRankInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, HeroRankInfo value) {
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

         public Builder setInfos(int index, HeroRankInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(HeroRankInfo value) {
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

         public Builder addInfos(int index, HeroRankInfo value) {
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

         public Builder addInfos(HeroRankInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, HeroRankInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends HeroRankInfo> values) {
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

         public HeroRankInfo.Builder getInfosBuilder(int index) {
            return (HeroRankInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public HeroRankInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (HeroRankInfoOrBuilder)this.infos_.get(index) : (HeroRankInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HeroRankInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public HeroRankInfo.Builder addInfosBuilder() {
            return (HeroRankInfo.Builder)this.getInfosFieldBuilder().addBuilder(HeroExtendMsg.HeroRankInfo.getDefaultInstance());
         }

         public HeroRankInfo.Builder addInfosBuilder(int index) {
            return (HeroRankInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, HeroExtendMsg.HeroRankInfo.getDefaultInstance());
         }

         public List<HeroRankInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HeroRankInfo, HeroRankInfo.Builder, HeroRankInfoOrBuilder> getInfosFieldBuilder() {
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

   public static final class C2S_OpenHeroBagUi_13203 extends GeneratedMessageV3 implements C2S_OpenHeroBagUi_13203OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OpenHeroBagUi_13203 DEFAULT_INSTANCE = new C2S_OpenHeroBagUi_13203();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenHeroBagUi_13203> PARSER = new AbstractParser<C2S_OpenHeroBagUi_13203>() {
         public C2S_OpenHeroBagUi_13203 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenHeroBagUi_13203(input, extensionRegistry);
         }
      };

      private C2S_OpenHeroBagUi_13203(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenHeroBagUi_13203() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenHeroBagUi_13203();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenHeroBagUi_13203(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_OpenHeroBagUi_13203_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_OpenHeroBagUi_13203_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenHeroBagUi_13203.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenHeroBagUi_13203)) {
            return super.equals(obj);
         } else {
            C2S_OpenHeroBagUi_13203 other = (C2S_OpenHeroBagUi_13203)obj;
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

      public static C2S_OpenHeroBagUi_13203 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenHeroBagUi_13203)PARSER.parseFrom(data);
      }

      public static C2S_OpenHeroBagUi_13203 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenHeroBagUi_13203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenHeroBagUi_13203 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenHeroBagUi_13203)PARSER.parseFrom(data);
      }

      public static C2S_OpenHeroBagUi_13203 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenHeroBagUi_13203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenHeroBagUi_13203 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenHeroBagUi_13203)PARSER.parseFrom(data);
      }

      public static C2S_OpenHeroBagUi_13203 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenHeroBagUi_13203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenHeroBagUi_13203 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenHeroBagUi_13203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenHeroBagUi_13203 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenHeroBagUi_13203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenHeroBagUi_13203 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenHeroBagUi_13203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenHeroBagUi_13203 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenHeroBagUi_13203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenHeroBagUi_13203 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenHeroBagUi_13203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenHeroBagUi_13203 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenHeroBagUi_13203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenHeroBagUi_13203 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenHeroBagUi_13203 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenHeroBagUi_13203> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenHeroBagUi_13203> getParserForType() {
         return PARSER;
      }

      public C2S_OpenHeroBagUi_13203 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenHeroBagUi_13203OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_OpenHeroBagUi_13203_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_OpenHeroBagUi_13203_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenHeroBagUi_13203.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroExtendMsg.C2S_OpenHeroBagUi_13203.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_OpenHeroBagUi_13203_descriptor;
         }

         public C2S_OpenHeroBagUi_13203 getDefaultInstanceForType() {
            return HeroExtendMsg.C2S_OpenHeroBagUi_13203.getDefaultInstance();
         }

         public C2S_OpenHeroBagUi_13203 build() {
            C2S_OpenHeroBagUi_13203 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenHeroBagUi_13203 buildPartial() {
            C2S_OpenHeroBagUi_13203 result = new C2S_OpenHeroBagUi_13203(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_OpenHeroBagUi_13203) {
               return this.mergeFrom((C2S_OpenHeroBagUi_13203)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenHeroBagUi_13203 other) {
            if (other == HeroExtendMsg.C2S_OpenHeroBagUi_13203.getDefaultInstance()) {
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
            C2S_OpenHeroBagUi_13203 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenHeroBagUi_13203)HeroExtendMsg.C2S_OpenHeroBagUi_13203.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenHeroBagUi_13203)e.getUnfinishedMessage();
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

   public static final class S2C_OpenHeroBagUi_13204 extends GeneratedMessageV3 implements S2C_OpenHeroBagUi_13204OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RANKS_FIELD_NUMBER = 1;
      private List<CommonMsg.MapDataII> ranks_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenHeroBagUi_13204 DEFAULT_INSTANCE = new S2C_OpenHeroBagUi_13204();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenHeroBagUi_13204> PARSER = new AbstractParser<S2C_OpenHeroBagUi_13204>() {
         public S2C_OpenHeroBagUi_13204 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenHeroBagUi_13204(input, extensionRegistry);
         }
      };

      private S2C_OpenHeroBagUi_13204(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenHeroBagUi_13204() {
         this.memoizedIsInitialized = -1;
         this.ranks_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenHeroBagUi_13204();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenHeroBagUi_13204(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.ranks_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.ranks_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_OpenHeroBagUi_13204_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_OpenHeroBagUi_13204_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenHeroBagUi_13204.class, Builder.class);
      }

      public List<CommonMsg.MapDataII> getRanksList() {
         return this.ranks_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getRanksOrBuilderList() {
         return this.ranks_;
      }

      public int getRanksCount() {
         return this.ranks_.size();
      }

      public CommonMsg.MapDataII getRanks(int index) {
         return (CommonMsg.MapDataII)this.ranks_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getRanksOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.ranks_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getRanksCount(); ++i) {
               if (!this.getRanks(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.ranks_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.ranks_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.ranks_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.ranks_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OpenHeroBagUi_13204)) {
            return super.equals(obj);
         } else {
            S2C_OpenHeroBagUi_13204 other = (S2C_OpenHeroBagUi_13204)obj;
            if (!this.getRanksList().equals(other.getRanksList())) {
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
            if (this.getRanksCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRanksList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OpenHeroBagUi_13204 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenHeroBagUi_13204)PARSER.parseFrom(data);
      }

      public static S2C_OpenHeroBagUi_13204 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenHeroBagUi_13204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenHeroBagUi_13204 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenHeroBagUi_13204)PARSER.parseFrom(data);
      }

      public static S2C_OpenHeroBagUi_13204 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenHeroBagUi_13204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenHeroBagUi_13204 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenHeroBagUi_13204)PARSER.parseFrom(data);
      }

      public static S2C_OpenHeroBagUi_13204 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenHeroBagUi_13204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenHeroBagUi_13204 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenHeroBagUi_13204)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenHeroBagUi_13204 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenHeroBagUi_13204)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenHeroBagUi_13204 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenHeroBagUi_13204)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenHeroBagUi_13204 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenHeroBagUi_13204)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenHeroBagUi_13204 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenHeroBagUi_13204)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenHeroBagUi_13204 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenHeroBagUi_13204)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenHeroBagUi_13204 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenHeroBagUi_13204 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenHeroBagUi_13204> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenHeroBagUi_13204> getParserForType() {
         return PARSER;
      }

      public S2C_OpenHeroBagUi_13204 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenHeroBagUi_13204OrBuilder {
         private int bitField0_;
         private List<CommonMsg.MapDataII> ranks_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> ranksBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_OpenHeroBagUi_13204_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_OpenHeroBagUi_13204_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenHeroBagUi_13204.class, Builder.class);
         }

         private Builder() {
            this.ranks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.ranks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroExtendMsg.S2C_OpenHeroBagUi_13204.alwaysUseFieldBuilders) {
               this.getRanksFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.ranksBuilder_ == null) {
               this.ranks_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.ranksBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_OpenHeroBagUi_13204_descriptor;
         }

         public S2C_OpenHeroBagUi_13204 getDefaultInstanceForType() {
            return HeroExtendMsg.S2C_OpenHeroBagUi_13204.getDefaultInstance();
         }

         public S2C_OpenHeroBagUi_13204 build() {
            S2C_OpenHeroBagUi_13204 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenHeroBagUi_13204 buildPartial() {
            S2C_OpenHeroBagUi_13204 result = new S2C_OpenHeroBagUi_13204(this);
            int from_bitField0_ = this.bitField0_;
            if (this.ranksBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
                  this.bitField0_ &= -2;
               }

               result.ranks_ = this.ranks_;
            } else {
               result.ranks_ = this.ranksBuilder_.build();
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
            if (other instanceof S2C_OpenHeroBagUi_13204) {
               return this.mergeFrom((S2C_OpenHeroBagUi_13204)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenHeroBagUi_13204 other) {
            if (other == HeroExtendMsg.S2C_OpenHeroBagUi_13204.getDefaultInstance()) {
               return this;
            } else {
               if (this.ranksBuilder_ == null) {
                  if (!other.ranks_.isEmpty()) {
                     if (this.ranks_.isEmpty()) {
                        this.ranks_ = other.ranks_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureRanksIsMutable();
                        this.ranks_.addAll(other.ranks_);
                     }

                     this.onChanged();
                  }
               } else if (!other.ranks_.isEmpty()) {
                  if (this.ranksBuilder_.isEmpty()) {
                     this.ranksBuilder_.dispose();
                     this.ranksBuilder_ = null;
                     this.ranks_ = other.ranks_;
                     this.bitField0_ &= -2;
                     this.ranksBuilder_ = HeroExtendMsg.S2C_OpenHeroBagUi_13204.alwaysUseFieldBuilders ? this.getRanksFieldBuilder() : null;
                  } else {
                     this.ranksBuilder_.addAllMessages(other.ranks_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getRanksCount(); ++i) {
               if (!this.getRanks(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OpenHeroBagUi_13204 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenHeroBagUi_13204)HeroExtendMsg.S2C_OpenHeroBagUi_13204.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenHeroBagUi_13204)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRanksIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.ranks_ = new ArrayList(this.ranks_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.MapDataII> getRanksList() {
            return this.ranksBuilder_ == null ? Collections.unmodifiableList(this.ranks_) : this.ranksBuilder_.getMessageList();
         }

         public int getRanksCount() {
            return this.ranksBuilder_ == null ? this.ranks_.size() : this.ranksBuilder_.getCount();
         }

         public CommonMsg.MapDataII getRanks(int index) {
            return this.ranksBuilder_ == null ? (CommonMsg.MapDataII)this.ranks_.get(index) : (CommonMsg.MapDataII)this.ranksBuilder_.getMessage(index);
         }

         public Builder setRanks(int index, CommonMsg.MapDataII value) {
            if (this.ranksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRanksIsMutable();
               this.ranks_.set(index, value);
               this.onChanged();
            } else {
               this.ranksBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRanks(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(CommonMsg.MapDataII value) {
            if (this.ranksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRanksIsMutable();
               this.ranks_.add(value);
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRanks(int index, CommonMsg.MapDataII value) {
            if (this.ranksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRanksIsMutable();
               this.ranks_.add(index, value);
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRanks(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRanks(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.ranks_);
               this.onChanged();
            } else {
               this.ranksBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRanks() {
            if (this.ranksBuilder_ == null) {
               this.ranks_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.ranksBuilder_.clear();
            }

            return this;
         }

         public Builder removeRanks(int index) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.remove(index);
               this.onChanged();
            } else {
               this.ranksBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getRanksBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getRanksFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getRanksOrBuilder(int index) {
            return this.ranksBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.ranks_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.ranksBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getRanksOrBuilderList() {
            return this.ranksBuilder_ != null ? this.ranksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.ranks_);
         }

         public CommonMsg.MapDataII.Builder addRanksBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getRanksFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addRanksBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getRanksFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getRanksBuilderList() {
            return this.getRanksFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getRanksFieldBuilder() {
            if (this.ranksBuilder_ == null) {
               this.ranksBuilder_ = new RepeatedFieldBuilderV3(this.ranks_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.ranks_ = null;
            }

            return this.ranksBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_UpdateFriendHeroState_13211 extends GeneratedMessageV3 implements C2S_UpdateFriendHeroState_13211OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ARRAYINGTYPE_FIELD_NUMBER = 1;
      private int arrayingType_;
      public static final int FRIENDSTATE_FIELD_NUMBER = 2;
      private int friendState_;
      private byte memoizedIsInitialized;
      private static final C2S_UpdateFriendHeroState_13211 DEFAULT_INSTANCE = new C2S_UpdateFriendHeroState_13211();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UpdateFriendHeroState_13211> PARSER = new AbstractParser<C2S_UpdateFriendHeroState_13211>() {
         public C2S_UpdateFriendHeroState_13211 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UpdateFriendHeroState_13211(input, extensionRegistry);
         }
      };

      private C2S_UpdateFriendHeroState_13211(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UpdateFriendHeroState_13211() {
         this.memoizedIsInitialized = -1;
         this.arrayingType_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UpdateFriendHeroState_13211();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UpdateFriendHeroState_13211(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CommonMsg.HeroState value = CommonMsg.HeroState.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.arrayingType_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.friendState_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroState_13211_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroState_13211_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UpdateFriendHeroState_13211.class, Builder.class);
      }

      public boolean hasArrayingType() {
         return (this.bitField0_ & 1) != 0;
      }

      public CommonMsg.HeroState getArrayingType() {
         CommonMsg.HeroState result = CommonMsg.HeroState.valueOf(this.arrayingType_);
         return result == null ? CommonMsg.HeroState.HERO_STATE_ARRAYING : result;
      }

      public boolean hasFriendState() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getFriendState() {
         return this.friendState_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasArrayingType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFriendState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.arrayingType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.friendState_);
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
               size += CodedOutputStream.computeEnumSize(1, this.arrayingType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.friendState_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_UpdateFriendHeroState_13211)) {
            return super.equals(obj);
         } else {
            C2S_UpdateFriendHeroState_13211 other = (C2S_UpdateFriendHeroState_13211)obj;
            if (this.hasArrayingType() != other.hasArrayingType()) {
               return false;
            } else if (this.hasArrayingType() && this.arrayingType_ != other.arrayingType_) {
               return false;
            } else if (this.hasFriendState() != other.hasFriendState()) {
               return false;
            } else if (this.hasFriendState() && this.getFriendState() != other.getFriendState()) {
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
            if (this.hasArrayingType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.arrayingType_;
            }

            if (this.hasFriendState()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getFriendState();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_UpdateFriendHeroState_13211 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UpdateFriendHeroState_13211)PARSER.parseFrom(data);
      }

      public static C2S_UpdateFriendHeroState_13211 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpdateFriendHeroState_13211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpdateFriendHeroState_13211 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UpdateFriendHeroState_13211)PARSER.parseFrom(data);
      }

      public static C2S_UpdateFriendHeroState_13211 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpdateFriendHeroState_13211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpdateFriendHeroState_13211 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UpdateFriendHeroState_13211)PARSER.parseFrom(data);
      }

      public static C2S_UpdateFriendHeroState_13211 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpdateFriendHeroState_13211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpdateFriendHeroState_13211 parseFrom(InputStream input) throws IOException {
         return (C2S_UpdateFriendHeroState_13211)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UpdateFriendHeroState_13211 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpdateFriendHeroState_13211)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UpdateFriendHeroState_13211 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UpdateFriendHeroState_13211)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UpdateFriendHeroState_13211 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpdateFriendHeroState_13211)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UpdateFriendHeroState_13211 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UpdateFriendHeroState_13211)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UpdateFriendHeroState_13211 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpdateFriendHeroState_13211)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UpdateFriendHeroState_13211 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UpdateFriendHeroState_13211 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UpdateFriendHeroState_13211> parser() {
         return PARSER;
      }

      public Parser<C2S_UpdateFriendHeroState_13211> getParserForType() {
         return PARSER;
      }

      public C2S_UpdateFriendHeroState_13211 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UpdateFriendHeroState_13211OrBuilder {
         private int bitField0_;
         private int arrayingType_;
         private int friendState_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroState_13211_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroState_13211_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UpdateFriendHeroState_13211.class, Builder.class);
         }

         private Builder() {
            this.arrayingType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.arrayingType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroExtendMsg.C2S_UpdateFriendHeroState_13211.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.arrayingType_ = 1;
            this.bitField0_ &= -2;
            this.friendState_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroState_13211_descriptor;
         }

         public C2S_UpdateFriendHeroState_13211 getDefaultInstanceForType() {
            return HeroExtendMsg.C2S_UpdateFriendHeroState_13211.getDefaultInstance();
         }

         public C2S_UpdateFriendHeroState_13211 build() {
            C2S_UpdateFriendHeroState_13211 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UpdateFriendHeroState_13211 buildPartial() {
            C2S_UpdateFriendHeroState_13211 result = new C2S_UpdateFriendHeroState_13211(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.arrayingType_ = this.arrayingType_;
            if ((from_bitField0_ & 2) != 0) {
               result.friendState_ = this.friendState_;
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
            if (other instanceof C2S_UpdateFriendHeroState_13211) {
               return this.mergeFrom((C2S_UpdateFriendHeroState_13211)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UpdateFriendHeroState_13211 other) {
            if (other == HeroExtendMsg.C2S_UpdateFriendHeroState_13211.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasArrayingType()) {
                  this.setArrayingType(other.getArrayingType());
               }

               if (other.hasFriendState()) {
                  this.setFriendState(other.getFriendState());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasArrayingType()) {
               return false;
            } else {
               return this.hasFriendState();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_UpdateFriendHeroState_13211 parsedMessage = null;

            try {
               parsedMessage = (C2S_UpdateFriendHeroState_13211)HeroExtendMsg.C2S_UpdateFriendHeroState_13211.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UpdateFriendHeroState_13211)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasArrayingType() {
            return (this.bitField0_ & 1) != 0;
         }

         public CommonMsg.HeroState getArrayingType() {
            CommonMsg.HeroState result = CommonMsg.HeroState.valueOf(this.arrayingType_);
            return result == null ? CommonMsg.HeroState.HERO_STATE_ARRAYING : result;
         }

         public Builder setArrayingType(CommonMsg.HeroState value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.arrayingType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearArrayingType() {
            this.bitField0_ &= -2;
            this.arrayingType_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasFriendState() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getFriendState() {
            return this.friendState_;
         }

         public Builder setFriendState(int value) {
            this.bitField0_ |= 2;
            this.friendState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFriendState() {
            this.bitField0_ &= -3;
            this.friendState_ = 0;
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

   public static final class S2C_UpdateFriendHeroState_13212 extends GeneratedMessageV3 implements S2C_UpdateFriendHeroState_13212OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int ARRAYINGTYPE_FIELD_NUMBER = 2;
      private int arrayingType_;
      public static final int FRIENDSTATE_FIELD_NUMBER = 3;
      private int friendState_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateFriendHeroState_13212 DEFAULT_INSTANCE = new S2C_UpdateFriendHeroState_13212();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateFriendHeroState_13212> PARSER = new AbstractParser<S2C_UpdateFriendHeroState_13212>() {
         public S2C_UpdateFriendHeroState_13212 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateFriendHeroState_13212(input, extensionRegistry);
         }
      };

      private S2C_UpdateFriendHeroState_13212(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateFriendHeroState_13212() {
         this.memoizedIsInitialized = -1;
         this.arrayingType_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateFriendHeroState_13212();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateFriendHeroState_13212(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CommonMsg.HeroState value = CommonMsg.HeroState.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.arrayingType_ = rawValue;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.friendState_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroState_13212_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroState_13212_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateFriendHeroState_13212.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasArrayingType() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.HeroState getArrayingType() {
         CommonMsg.HeroState result = CommonMsg.HeroState.valueOf(this.arrayingType_);
         return result == null ? CommonMsg.HeroState.HERO_STATE_ARRAYING : result;
      }

      public boolean hasFriendState() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getFriendState() {
         return this.friendState_;
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
         } else if (!this.hasArrayingType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFriendState()) {
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
            output.writeEnum(2, this.arrayingType_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.friendState_);
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
               size += CodedOutputStream.computeEnumSize(2, this.arrayingType_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.friendState_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpdateFriendHeroState_13212)) {
            return super.equals(obj);
         } else {
            S2C_UpdateFriendHeroState_13212 other = (S2C_UpdateFriendHeroState_13212)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasArrayingType() != other.hasArrayingType()) {
               return false;
            } else if (this.hasArrayingType() && this.arrayingType_ != other.arrayingType_) {
               return false;
            } else if (this.hasFriendState() != other.hasFriendState()) {
               return false;
            } else if (this.hasFriendState() && this.getFriendState() != other.getFriendState()) {
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

            if (this.hasArrayingType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.arrayingType_;
            }

            if (this.hasFriendState()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getFriendState();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpdateFriendHeroState_13212 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateFriendHeroState_13212)PARSER.parseFrom(data);
      }

      public static S2C_UpdateFriendHeroState_13212 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateFriendHeroState_13212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateFriendHeroState_13212 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateFriendHeroState_13212)PARSER.parseFrom(data);
      }

      public static S2C_UpdateFriendHeroState_13212 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateFriendHeroState_13212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateFriendHeroState_13212 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateFriendHeroState_13212)PARSER.parseFrom(data);
      }

      public static S2C_UpdateFriendHeroState_13212 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateFriendHeroState_13212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateFriendHeroState_13212 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateFriendHeroState_13212)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateFriendHeroState_13212 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateFriendHeroState_13212)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateFriendHeroState_13212 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateFriendHeroState_13212)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateFriendHeroState_13212 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateFriendHeroState_13212)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateFriendHeroState_13212 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateFriendHeroState_13212)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateFriendHeroState_13212 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateFriendHeroState_13212)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateFriendHeroState_13212 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateFriendHeroState_13212 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateFriendHeroState_13212> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateFriendHeroState_13212> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateFriendHeroState_13212 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateFriendHeroState_13212OrBuilder {
         private int bitField0_;
         private int result_;
         private int arrayingType_;
         private int friendState_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroState_13212_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroState_13212_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateFriendHeroState_13212.class, Builder.class);
         }

         private Builder() {
            this.arrayingType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.arrayingType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroExtendMsg.S2C_UpdateFriendHeroState_13212.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.arrayingType_ = 1;
            this.bitField0_ &= -3;
            this.friendState_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroState_13212_descriptor;
         }

         public S2C_UpdateFriendHeroState_13212 getDefaultInstanceForType() {
            return HeroExtendMsg.S2C_UpdateFriendHeroState_13212.getDefaultInstance();
         }

         public S2C_UpdateFriendHeroState_13212 build() {
            S2C_UpdateFriendHeroState_13212 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateFriendHeroState_13212 buildPartial() {
            S2C_UpdateFriendHeroState_13212 result = new S2C_UpdateFriendHeroState_13212(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.arrayingType_ = this.arrayingType_;
            if ((from_bitField0_ & 4) != 0) {
               result.friendState_ = this.friendState_;
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
            if (other instanceof S2C_UpdateFriendHeroState_13212) {
               return this.mergeFrom((S2C_UpdateFriendHeroState_13212)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateFriendHeroState_13212 other) {
            if (other == HeroExtendMsg.S2C_UpdateFriendHeroState_13212.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasArrayingType()) {
                  this.setArrayingType(other.getArrayingType());
               }

               if (other.hasFriendState()) {
                  this.setFriendState(other.getFriendState());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasArrayingType()) {
               return false;
            } else {
               return this.hasFriendState();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UpdateFriendHeroState_13212 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateFriendHeroState_13212)HeroExtendMsg.S2C_UpdateFriendHeroState_13212.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateFriendHeroState_13212)e.getUnfinishedMessage();
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

         public boolean hasArrayingType() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.HeroState getArrayingType() {
            CommonMsg.HeroState result = CommonMsg.HeroState.valueOf(this.arrayingType_);
            return result == null ? CommonMsg.HeroState.HERO_STATE_ARRAYING : result;
         }

         public Builder setArrayingType(CommonMsg.HeroState value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.arrayingType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearArrayingType() {
            this.bitField0_ &= -3;
            this.arrayingType_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasFriendState() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getFriendState() {
            return this.friendState_;
         }

         public Builder setFriendState(int value) {
            this.bitField0_ |= 4;
            this.friendState_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFriendState() {
            this.bitField0_ &= -5;
            this.friendState_ = 0;
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

   public static final class C2S_UpdateFriendHeroNation_13213 extends GeneratedMessageV3 implements C2S_UpdateFriendHeroNation_13213OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ARRAYINGTYPE_FIELD_NUMBER = 1;
      private int arrayingType_;
      public static final int FRIENDNATION_FIELD_NUMBER = 2;
      private int friendNation_;
      private byte memoizedIsInitialized;
      private static final C2S_UpdateFriendHeroNation_13213 DEFAULT_INSTANCE = new C2S_UpdateFriendHeroNation_13213();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UpdateFriendHeroNation_13213> PARSER = new AbstractParser<C2S_UpdateFriendHeroNation_13213>() {
         public C2S_UpdateFriendHeroNation_13213 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UpdateFriendHeroNation_13213(input, extensionRegistry);
         }
      };

      private C2S_UpdateFriendHeroNation_13213(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UpdateFriendHeroNation_13213() {
         this.memoizedIsInitialized = -1;
         this.arrayingType_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UpdateFriendHeroNation_13213();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UpdateFriendHeroNation_13213(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CommonMsg.HeroState value = CommonMsg.HeroState.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.arrayingType_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.friendNation_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroNation_13213_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroNation_13213_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UpdateFriendHeroNation_13213.class, Builder.class);
      }

      public boolean hasArrayingType() {
         return (this.bitField0_ & 1) != 0;
      }

      public CommonMsg.HeroState getArrayingType() {
         CommonMsg.HeroState result = CommonMsg.HeroState.valueOf(this.arrayingType_);
         return result == null ? CommonMsg.HeroState.HERO_STATE_ARRAYING : result;
      }

      public boolean hasFriendNation() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getFriendNation() {
         return this.friendNation_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasArrayingType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFriendNation()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.arrayingType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.friendNation_);
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
               size += CodedOutputStream.computeEnumSize(1, this.arrayingType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.friendNation_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_UpdateFriendHeroNation_13213)) {
            return super.equals(obj);
         } else {
            C2S_UpdateFriendHeroNation_13213 other = (C2S_UpdateFriendHeroNation_13213)obj;
            if (this.hasArrayingType() != other.hasArrayingType()) {
               return false;
            } else if (this.hasArrayingType() && this.arrayingType_ != other.arrayingType_) {
               return false;
            } else if (this.hasFriendNation() != other.hasFriendNation()) {
               return false;
            } else if (this.hasFriendNation() && this.getFriendNation() != other.getFriendNation()) {
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
            if (this.hasArrayingType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.arrayingType_;
            }

            if (this.hasFriendNation()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getFriendNation();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_UpdateFriendHeroNation_13213 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UpdateFriendHeroNation_13213)PARSER.parseFrom(data);
      }

      public static C2S_UpdateFriendHeroNation_13213 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpdateFriendHeroNation_13213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpdateFriendHeroNation_13213 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UpdateFriendHeroNation_13213)PARSER.parseFrom(data);
      }

      public static C2S_UpdateFriendHeroNation_13213 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpdateFriendHeroNation_13213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpdateFriendHeroNation_13213 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UpdateFriendHeroNation_13213)PARSER.parseFrom(data);
      }

      public static C2S_UpdateFriendHeroNation_13213 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpdateFriendHeroNation_13213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpdateFriendHeroNation_13213 parseFrom(InputStream input) throws IOException {
         return (C2S_UpdateFriendHeroNation_13213)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UpdateFriendHeroNation_13213 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpdateFriendHeroNation_13213)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UpdateFriendHeroNation_13213 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UpdateFriendHeroNation_13213)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UpdateFriendHeroNation_13213 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpdateFriendHeroNation_13213)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UpdateFriendHeroNation_13213 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UpdateFriendHeroNation_13213)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UpdateFriendHeroNation_13213 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpdateFriendHeroNation_13213)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UpdateFriendHeroNation_13213 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UpdateFriendHeroNation_13213 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UpdateFriendHeroNation_13213> parser() {
         return PARSER;
      }

      public Parser<C2S_UpdateFriendHeroNation_13213> getParserForType() {
         return PARSER;
      }

      public C2S_UpdateFriendHeroNation_13213 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UpdateFriendHeroNation_13213OrBuilder {
         private int bitField0_;
         private int arrayingType_;
         private int friendNation_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroNation_13213_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroNation_13213_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UpdateFriendHeroNation_13213.class, Builder.class);
         }

         private Builder() {
            this.arrayingType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.arrayingType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroExtendMsg.C2S_UpdateFriendHeroNation_13213.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.arrayingType_ = 1;
            this.bitField0_ &= -2;
            this.friendNation_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroNation_13213_descriptor;
         }

         public C2S_UpdateFriendHeroNation_13213 getDefaultInstanceForType() {
            return HeroExtendMsg.C2S_UpdateFriendHeroNation_13213.getDefaultInstance();
         }

         public C2S_UpdateFriendHeroNation_13213 build() {
            C2S_UpdateFriendHeroNation_13213 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UpdateFriendHeroNation_13213 buildPartial() {
            C2S_UpdateFriendHeroNation_13213 result = new C2S_UpdateFriendHeroNation_13213(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.arrayingType_ = this.arrayingType_;
            if ((from_bitField0_ & 2) != 0) {
               result.friendNation_ = this.friendNation_;
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
            if (other instanceof C2S_UpdateFriendHeroNation_13213) {
               return this.mergeFrom((C2S_UpdateFriendHeroNation_13213)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UpdateFriendHeroNation_13213 other) {
            if (other == HeroExtendMsg.C2S_UpdateFriendHeroNation_13213.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasArrayingType()) {
                  this.setArrayingType(other.getArrayingType());
               }

               if (other.hasFriendNation()) {
                  this.setFriendNation(other.getFriendNation());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasArrayingType()) {
               return false;
            } else {
               return this.hasFriendNation();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_UpdateFriendHeroNation_13213 parsedMessage = null;

            try {
               parsedMessage = (C2S_UpdateFriendHeroNation_13213)HeroExtendMsg.C2S_UpdateFriendHeroNation_13213.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UpdateFriendHeroNation_13213)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasArrayingType() {
            return (this.bitField0_ & 1) != 0;
         }

         public CommonMsg.HeroState getArrayingType() {
            CommonMsg.HeroState result = CommonMsg.HeroState.valueOf(this.arrayingType_);
            return result == null ? CommonMsg.HeroState.HERO_STATE_ARRAYING : result;
         }

         public Builder setArrayingType(CommonMsg.HeroState value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.arrayingType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearArrayingType() {
            this.bitField0_ &= -2;
            this.arrayingType_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasFriendNation() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getFriendNation() {
            return this.friendNation_;
         }

         public Builder setFriendNation(int value) {
            this.bitField0_ |= 2;
            this.friendNation_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFriendNation() {
            this.bitField0_ &= -3;
            this.friendNation_ = 0;
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

   public static final class S2C_UpdateFriendHeroNation_13214 extends GeneratedMessageV3 implements S2C_UpdateFriendHeroNation_13214OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int ARRAYINGTYPE_FIELD_NUMBER = 2;
      private int arrayingType_;
      public static final int FRIENDNATION_FIELD_NUMBER = 3;
      private int friendNation_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateFriendHeroNation_13214 DEFAULT_INSTANCE = new S2C_UpdateFriendHeroNation_13214();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateFriendHeroNation_13214> PARSER = new AbstractParser<S2C_UpdateFriendHeroNation_13214>() {
         public S2C_UpdateFriendHeroNation_13214 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateFriendHeroNation_13214(input, extensionRegistry);
         }
      };

      private S2C_UpdateFriendHeroNation_13214(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateFriendHeroNation_13214() {
         this.memoizedIsInitialized = -1;
         this.arrayingType_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateFriendHeroNation_13214();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateFriendHeroNation_13214(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CommonMsg.HeroState value = CommonMsg.HeroState.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.arrayingType_ = rawValue;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.friendNation_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroNation_13214_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroNation_13214_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateFriendHeroNation_13214.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasArrayingType() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.HeroState getArrayingType() {
         CommonMsg.HeroState result = CommonMsg.HeroState.valueOf(this.arrayingType_);
         return result == null ? CommonMsg.HeroState.HERO_STATE_ARRAYING : result;
      }

      public boolean hasFriendNation() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getFriendNation() {
         return this.friendNation_;
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
         } else if (!this.hasArrayingType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFriendNation()) {
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
            output.writeEnum(2, this.arrayingType_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.friendNation_);
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
               size += CodedOutputStream.computeEnumSize(2, this.arrayingType_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.friendNation_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpdateFriendHeroNation_13214)) {
            return super.equals(obj);
         } else {
            S2C_UpdateFriendHeroNation_13214 other = (S2C_UpdateFriendHeroNation_13214)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasArrayingType() != other.hasArrayingType()) {
               return false;
            } else if (this.hasArrayingType() && this.arrayingType_ != other.arrayingType_) {
               return false;
            } else if (this.hasFriendNation() != other.hasFriendNation()) {
               return false;
            } else if (this.hasFriendNation() && this.getFriendNation() != other.getFriendNation()) {
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

            if (this.hasArrayingType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.arrayingType_;
            }

            if (this.hasFriendNation()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getFriendNation();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpdateFriendHeroNation_13214 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateFriendHeroNation_13214)PARSER.parseFrom(data);
      }

      public static S2C_UpdateFriendHeroNation_13214 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateFriendHeroNation_13214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateFriendHeroNation_13214 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateFriendHeroNation_13214)PARSER.parseFrom(data);
      }

      public static S2C_UpdateFriendHeroNation_13214 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateFriendHeroNation_13214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateFriendHeroNation_13214 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateFriendHeroNation_13214)PARSER.parseFrom(data);
      }

      public static S2C_UpdateFriendHeroNation_13214 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateFriendHeroNation_13214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateFriendHeroNation_13214 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateFriendHeroNation_13214)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateFriendHeroNation_13214 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateFriendHeroNation_13214)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateFriendHeroNation_13214 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateFriendHeroNation_13214)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateFriendHeroNation_13214 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateFriendHeroNation_13214)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateFriendHeroNation_13214 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateFriendHeroNation_13214)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateFriendHeroNation_13214 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateFriendHeroNation_13214)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateFriendHeroNation_13214 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateFriendHeroNation_13214 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateFriendHeroNation_13214> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateFriendHeroNation_13214> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateFriendHeroNation_13214 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateFriendHeroNation_13214OrBuilder {
         private int bitField0_;
         private int result_;
         private int arrayingType_;
         private int friendNation_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroNation_13214_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroNation_13214_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateFriendHeroNation_13214.class, Builder.class);
         }

         private Builder() {
            this.arrayingType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.arrayingType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroExtendMsg.S2C_UpdateFriendHeroNation_13214.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.arrayingType_ = 1;
            this.bitField0_ &= -3;
            this.friendNation_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroNation_13214_descriptor;
         }

         public S2C_UpdateFriendHeroNation_13214 getDefaultInstanceForType() {
            return HeroExtendMsg.S2C_UpdateFriendHeroNation_13214.getDefaultInstance();
         }

         public S2C_UpdateFriendHeroNation_13214 build() {
            S2C_UpdateFriendHeroNation_13214 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateFriendHeroNation_13214 buildPartial() {
            S2C_UpdateFriendHeroNation_13214 result = new S2C_UpdateFriendHeroNation_13214(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.arrayingType_ = this.arrayingType_;
            if ((from_bitField0_ & 4) != 0) {
               result.friendNation_ = this.friendNation_;
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
            if (other instanceof S2C_UpdateFriendHeroNation_13214) {
               return this.mergeFrom((S2C_UpdateFriendHeroNation_13214)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateFriendHeroNation_13214 other) {
            if (other == HeroExtendMsg.S2C_UpdateFriendHeroNation_13214.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasArrayingType()) {
                  this.setArrayingType(other.getArrayingType());
               }

               if (other.hasFriendNation()) {
                  this.setFriendNation(other.getFriendNation());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasResult()) {
               return false;
            } else if (!this.hasArrayingType()) {
               return false;
            } else {
               return this.hasFriendNation();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UpdateFriendHeroNation_13214 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateFriendHeroNation_13214)HeroExtendMsg.S2C_UpdateFriendHeroNation_13214.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateFriendHeroNation_13214)e.getUnfinishedMessage();
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

         public boolean hasArrayingType() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.HeroState getArrayingType() {
            CommonMsg.HeroState result = CommonMsg.HeroState.valueOf(this.arrayingType_);
            return result == null ? CommonMsg.HeroState.HERO_STATE_ARRAYING : result;
         }

         public Builder setArrayingType(CommonMsg.HeroState value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.arrayingType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearArrayingType() {
            this.bitField0_ &= -3;
            this.arrayingType_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasFriendNation() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getFriendNation() {
            return this.friendNation_;
         }

         public Builder setFriendNation(int value) {
            this.bitField0_ |= 4;
            this.friendNation_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFriendNation() {
            this.bitField0_ &= -5;
            this.friendNation_ = 0;
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

   public static final class C2S_HeroExchangeEquip_13215 extends GeneratedMessageV3 implements C2S_HeroExchangeEquip_13215OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MAINHEROCODE_FIELD_NUMBER = 1;
      private int mainHeroCode_;
      public static final int SLAVEHEROCODE_FIELD_NUMBER = 2;
      private int slaveHeroCode_;
      public static final int POSITION_FIELD_NUMBER = 3;
      private int position_;
      private byte memoizedIsInitialized;
      private static final C2S_HeroExchangeEquip_13215 DEFAULT_INSTANCE = new C2S_HeroExchangeEquip_13215();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HeroExchangeEquip_13215> PARSER = new AbstractParser<C2S_HeroExchangeEquip_13215>() {
         public C2S_HeroExchangeEquip_13215 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HeroExchangeEquip_13215(input, extensionRegistry);
         }
      };

      private C2S_HeroExchangeEquip_13215(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HeroExchangeEquip_13215() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HeroExchangeEquip_13215();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HeroExchangeEquip_13215(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.mainHeroCode_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.slaveHeroCode_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.position_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_HeroExchangeEquip_13215_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_HeroExchangeEquip_13215_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroExchangeEquip_13215.class, Builder.class);
      }

      public boolean hasMainHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getMainHeroCode() {
         return this.mainHeroCode_;
      }

      public boolean hasSlaveHeroCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSlaveHeroCode() {
         return this.slaveHeroCode_;
      }

      public boolean hasPosition() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getPosition() {
         return this.position_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMainHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSlaveHeroCode()) {
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
            output.writeInt32(1, this.mainHeroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.slaveHeroCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.position_);
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
               size += CodedOutputStream.computeInt32Size(1, this.mainHeroCode_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.slaveHeroCode_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.position_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_HeroExchangeEquip_13215)) {
            return super.equals(obj);
         } else {
            C2S_HeroExchangeEquip_13215 other = (C2S_HeroExchangeEquip_13215)obj;
            if (this.hasMainHeroCode() != other.hasMainHeroCode()) {
               return false;
            } else if (this.hasMainHeroCode() && this.getMainHeroCode() != other.getMainHeroCode()) {
               return false;
            } else if (this.hasSlaveHeroCode() != other.hasSlaveHeroCode()) {
               return false;
            } else if (this.hasSlaveHeroCode() && this.getSlaveHeroCode() != other.getSlaveHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.getPosition() != other.getPosition()) {
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
            if (this.hasMainHeroCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMainHeroCode();
            }

            if (this.hasSlaveHeroCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSlaveHeroCode();
            }

            if (this.hasPosition()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPosition();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_HeroExchangeEquip_13215 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HeroExchangeEquip_13215)PARSER.parseFrom(data);
      }

      public static C2S_HeroExchangeEquip_13215 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroExchangeEquip_13215)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroExchangeEquip_13215 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HeroExchangeEquip_13215)PARSER.parseFrom(data);
      }

      public static C2S_HeroExchangeEquip_13215 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroExchangeEquip_13215)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroExchangeEquip_13215 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HeroExchangeEquip_13215)PARSER.parseFrom(data);
      }

      public static C2S_HeroExchangeEquip_13215 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroExchangeEquip_13215)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroExchangeEquip_13215 parseFrom(InputStream input) throws IOException {
         return (C2S_HeroExchangeEquip_13215)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroExchangeEquip_13215 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroExchangeEquip_13215)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroExchangeEquip_13215 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HeroExchangeEquip_13215)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HeroExchangeEquip_13215 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroExchangeEquip_13215)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroExchangeEquip_13215 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HeroExchangeEquip_13215)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroExchangeEquip_13215 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroExchangeEquip_13215)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HeroExchangeEquip_13215 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HeroExchangeEquip_13215 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HeroExchangeEquip_13215> parser() {
         return PARSER;
      }

      public Parser<C2S_HeroExchangeEquip_13215> getParserForType() {
         return PARSER;
      }

      public C2S_HeroExchangeEquip_13215 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HeroExchangeEquip_13215OrBuilder {
         private int bitField0_;
         private int mainHeroCode_;
         private int slaveHeroCode_;
         private int position_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_HeroExchangeEquip_13215_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_HeroExchangeEquip_13215_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroExchangeEquip_13215.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroExtendMsg.C2S_HeroExchangeEquip_13215.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.mainHeroCode_ = 0;
            this.bitField0_ &= -2;
            this.slaveHeroCode_ = 0;
            this.bitField0_ &= -3;
            this.position_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_HeroExchangeEquip_13215_descriptor;
         }

         public C2S_HeroExchangeEquip_13215 getDefaultInstanceForType() {
            return HeroExtendMsg.C2S_HeroExchangeEquip_13215.getDefaultInstance();
         }

         public C2S_HeroExchangeEquip_13215 build() {
            C2S_HeroExchangeEquip_13215 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HeroExchangeEquip_13215 buildPartial() {
            C2S_HeroExchangeEquip_13215 result = new C2S_HeroExchangeEquip_13215(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.mainHeroCode_ = this.mainHeroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.slaveHeroCode_ = this.slaveHeroCode_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.position_ = this.position_;
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
            if (other instanceof C2S_HeroExchangeEquip_13215) {
               return this.mergeFrom((C2S_HeroExchangeEquip_13215)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HeroExchangeEquip_13215 other) {
            if (other == HeroExtendMsg.C2S_HeroExchangeEquip_13215.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMainHeroCode()) {
                  this.setMainHeroCode(other.getMainHeroCode());
               }

               if (other.hasSlaveHeroCode()) {
                  this.setSlaveHeroCode(other.getSlaveHeroCode());
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
            if (!this.hasMainHeroCode()) {
               return false;
            } else if (!this.hasSlaveHeroCode()) {
               return false;
            } else {
               return this.hasPosition();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_HeroExchangeEquip_13215 parsedMessage = null;

            try {
               parsedMessage = (C2S_HeroExchangeEquip_13215)HeroExtendMsg.C2S_HeroExchangeEquip_13215.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HeroExchangeEquip_13215)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMainHeroCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getMainHeroCode() {
            return this.mainHeroCode_;
         }

         public Builder setMainHeroCode(int value) {
            this.bitField0_ |= 1;
            this.mainHeroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMainHeroCode() {
            this.bitField0_ &= -2;
            this.mainHeroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSlaveHeroCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSlaveHeroCode() {
            return this.slaveHeroCode_;
         }

         public Builder setSlaveHeroCode(int value) {
            this.bitField0_ |= 2;
            this.slaveHeroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSlaveHeroCode() {
            this.bitField0_ &= -3;
            this.slaveHeroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPosition() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getPosition() {
            return this.position_;
         }

         public Builder setPosition(int value) {
            this.bitField0_ |= 4;
            this.position_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPosition() {
            this.bitField0_ &= -5;
            this.position_ = 0;
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

   public static final class S2C_HeroExchangeEquip_13216 extends GeneratedMessageV3 implements S2C_HeroExchangeEquip_13216OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int MAINHEROCODE_FIELD_NUMBER = 2;
      private int mainHeroCode_;
      private byte memoizedIsInitialized;
      private static final S2C_HeroExchangeEquip_13216 DEFAULT_INSTANCE = new S2C_HeroExchangeEquip_13216();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HeroExchangeEquip_13216> PARSER = new AbstractParser<S2C_HeroExchangeEquip_13216>() {
         public S2C_HeroExchangeEquip_13216 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HeroExchangeEquip_13216(input, extensionRegistry);
         }
      };

      private S2C_HeroExchangeEquip_13216(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HeroExchangeEquip_13216() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HeroExchangeEquip_13216();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HeroExchangeEquip_13216(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.mainHeroCode_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_HeroExchangeEquip_13216_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_HeroExchangeEquip_13216_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroExchangeEquip_13216.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
      }

      public boolean hasMainHeroCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getMainHeroCode() {
         return this.mainHeroCode_;
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
         } else if (!this.hasMainHeroCode()) {
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
            output.writeInt32(2, this.mainHeroCode_);
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
               size += CodedOutputStream.computeInt32Size(2, this.mainHeroCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HeroExchangeEquip_13216)) {
            return super.equals(obj);
         } else {
            S2C_HeroExchangeEquip_13216 other = (S2C_HeroExchangeEquip_13216)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (this.hasMainHeroCode() != other.hasMainHeroCode()) {
               return false;
            } else if (this.hasMainHeroCode() && this.getMainHeroCode() != other.getMainHeroCode()) {
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

            if (this.hasMainHeroCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMainHeroCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HeroExchangeEquip_13216 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HeroExchangeEquip_13216)PARSER.parseFrom(data);
      }

      public static S2C_HeroExchangeEquip_13216 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroExchangeEquip_13216)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroExchangeEquip_13216 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HeroExchangeEquip_13216)PARSER.parseFrom(data);
      }

      public static S2C_HeroExchangeEquip_13216 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroExchangeEquip_13216)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroExchangeEquip_13216 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HeroExchangeEquip_13216)PARSER.parseFrom(data);
      }

      public static S2C_HeroExchangeEquip_13216 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroExchangeEquip_13216)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroExchangeEquip_13216 parseFrom(InputStream input) throws IOException {
         return (S2C_HeroExchangeEquip_13216)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroExchangeEquip_13216 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroExchangeEquip_13216)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroExchangeEquip_13216 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HeroExchangeEquip_13216)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HeroExchangeEquip_13216 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroExchangeEquip_13216)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroExchangeEquip_13216 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HeroExchangeEquip_13216)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroExchangeEquip_13216 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroExchangeEquip_13216)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HeroExchangeEquip_13216 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HeroExchangeEquip_13216 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HeroExchangeEquip_13216> parser() {
         return PARSER;
      }

      public Parser<S2C_HeroExchangeEquip_13216> getParserForType() {
         return PARSER;
      }

      public S2C_HeroExchangeEquip_13216 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HeroExchangeEquip_13216OrBuilder {
         private int bitField0_;
         private int result_;
         private int mainHeroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_HeroExchangeEquip_13216_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_HeroExchangeEquip_13216_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroExchangeEquip_13216.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroExtendMsg.S2C_HeroExchangeEquip_13216.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.mainHeroCode_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_HeroExchangeEquip_13216_descriptor;
         }

         public S2C_HeroExchangeEquip_13216 getDefaultInstanceForType() {
            return HeroExtendMsg.S2C_HeroExchangeEquip_13216.getDefaultInstance();
         }

         public S2C_HeroExchangeEquip_13216 build() {
            S2C_HeroExchangeEquip_13216 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HeroExchangeEquip_13216 buildPartial() {
            S2C_HeroExchangeEquip_13216 result = new S2C_HeroExchangeEquip_13216(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.mainHeroCode_ = this.mainHeroCode_;
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
            if (other instanceof S2C_HeroExchangeEquip_13216) {
               return this.mergeFrom((S2C_HeroExchangeEquip_13216)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HeroExchangeEquip_13216 other) {
            if (other == HeroExtendMsg.S2C_HeroExchangeEquip_13216.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (other.hasMainHeroCode()) {
                  this.setMainHeroCode(other.getMainHeroCode());
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
               return this.hasMainHeroCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_HeroExchangeEquip_13216 parsedMessage = null;

            try {
               parsedMessage = (S2C_HeroExchangeEquip_13216)HeroExtendMsg.S2C_HeroExchangeEquip_13216.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HeroExchangeEquip_13216)e.getUnfinishedMessage();
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

         public boolean hasMainHeroCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getMainHeroCode() {
            return this.mainHeroCode_;
         }

         public Builder setMainHeroCode(int value) {
            this.bitField0_ |= 2;
            this.mainHeroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMainHeroCode() {
            this.bitField0_ &= -3;
            this.mainHeroCode_ = 0;
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

   public static final class C2S_HideArraying_13217 extends GeneratedMessageV3 implements C2S_HideArraying_13217OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ARRAYINGTYPE_FIELD_NUMBER = 1;
      private int arrayingType_;
      public static final int ISHIDE_FIELD_NUMBER = 2;
      private boolean isHide_;
      private byte memoizedIsInitialized;
      private static final C2S_HideArraying_13217 DEFAULT_INSTANCE = new C2S_HideArraying_13217();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HideArraying_13217> PARSER = new AbstractParser<C2S_HideArraying_13217>() {
         public C2S_HideArraying_13217 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HideArraying_13217(input, extensionRegistry);
         }
      };

      private C2S_HideArraying_13217(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HideArraying_13217() {
         this.memoizedIsInitialized = -1;
         this.arrayingType_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HideArraying_13217();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HideArraying_13217(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CommonMsg.HeroState value = CommonMsg.HeroState.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.arrayingType_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.isHide_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_HideArraying_13217_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_HideArraying_13217_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HideArraying_13217.class, Builder.class);
      }

      public boolean hasArrayingType() {
         return (this.bitField0_ & 1) != 0;
      }

      public CommonMsg.HeroState getArrayingType() {
         CommonMsg.HeroState result = CommonMsg.HeroState.valueOf(this.arrayingType_);
         return result == null ? CommonMsg.HeroState.HERO_STATE_ARRAYING : result;
      }

      public boolean hasIsHide() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsHide() {
         return this.isHide_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasArrayingType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsHide()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.arrayingType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.isHide_);
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
               size += CodedOutputStream.computeEnumSize(1, this.arrayingType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.isHide_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_HideArraying_13217)) {
            return super.equals(obj);
         } else {
            C2S_HideArraying_13217 other = (C2S_HideArraying_13217)obj;
            if (this.hasArrayingType() != other.hasArrayingType()) {
               return false;
            } else if (this.hasArrayingType() && this.arrayingType_ != other.arrayingType_) {
               return false;
            } else if (this.hasIsHide() != other.hasIsHide()) {
               return false;
            } else if (this.hasIsHide() && this.getIsHide() != other.getIsHide()) {
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
            if (this.hasArrayingType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.arrayingType_;
            }

            if (this.hasIsHide()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsHide());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_HideArraying_13217 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HideArraying_13217)PARSER.parseFrom(data);
      }

      public static C2S_HideArraying_13217 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HideArraying_13217)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HideArraying_13217 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HideArraying_13217)PARSER.parseFrom(data);
      }

      public static C2S_HideArraying_13217 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HideArraying_13217)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HideArraying_13217 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HideArraying_13217)PARSER.parseFrom(data);
      }

      public static C2S_HideArraying_13217 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HideArraying_13217)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HideArraying_13217 parseFrom(InputStream input) throws IOException {
         return (C2S_HideArraying_13217)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HideArraying_13217 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HideArraying_13217)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HideArraying_13217 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HideArraying_13217)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HideArraying_13217 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HideArraying_13217)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HideArraying_13217 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HideArraying_13217)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HideArraying_13217 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HideArraying_13217)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HideArraying_13217 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HideArraying_13217 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HideArraying_13217> parser() {
         return PARSER;
      }

      public Parser<C2S_HideArraying_13217> getParserForType() {
         return PARSER;
      }

      public C2S_HideArraying_13217 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HideArraying_13217OrBuilder {
         private int bitField0_;
         private int arrayingType_;
         private boolean isHide_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_HideArraying_13217_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_HideArraying_13217_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HideArraying_13217.class, Builder.class);
         }

         private Builder() {
            this.arrayingType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.arrayingType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroExtendMsg.C2S_HideArraying_13217.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.arrayingType_ = 1;
            this.bitField0_ &= -2;
            this.isHide_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_HideArraying_13217_descriptor;
         }

         public C2S_HideArraying_13217 getDefaultInstanceForType() {
            return HeroExtendMsg.C2S_HideArraying_13217.getDefaultInstance();
         }

         public C2S_HideArraying_13217 build() {
            C2S_HideArraying_13217 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HideArraying_13217 buildPartial() {
            C2S_HideArraying_13217 result = new C2S_HideArraying_13217(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.arrayingType_ = this.arrayingType_;
            if ((from_bitField0_ & 2) != 0) {
               result.isHide_ = this.isHide_;
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
            if (other instanceof C2S_HideArraying_13217) {
               return this.mergeFrom((C2S_HideArraying_13217)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HideArraying_13217 other) {
            if (other == HeroExtendMsg.C2S_HideArraying_13217.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasArrayingType()) {
                  this.setArrayingType(other.getArrayingType());
               }

               if (other.hasIsHide()) {
                  this.setIsHide(other.getIsHide());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasArrayingType()) {
               return false;
            } else {
               return this.hasIsHide();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_HideArraying_13217 parsedMessage = null;

            try {
               parsedMessage = (C2S_HideArraying_13217)HeroExtendMsg.C2S_HideArraying_13217.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HideArraying_13217)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasArrayingType() {
            return (this.bitField0_ & 1) != 0;
         }

         public CommonMsg.HeroState getArrayingType() {
            CommonMsg.HeroState result = CommonMsg.HeroState.valueOf(this.arrayingType_);
            return result == null ? CommonMsg.HeroState.HERO_STATE_ARRAYING : result;
         }

         public Builder setArrayingType(CommonMsg.HeroState value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.arrayingType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearArrayingType() {
            this.bitField0_ &= -2;
            this.arrayingType_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasIsHide() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsHide() {
            return this.isHide_;
         }

         public Builder setIsHide(boolean value) {
            this.bitField0_ |= 2;
            this.isHide_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsHide() {
            this.bitField0_ &= -3;
            this.isHide_ = false;
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

   public static final class S2C_HideArraying_13218 extends GeneratedMessageV3 implements S2C_HideArraying_13218OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ARRAYINGTYPE_FIELD_NUMBER = 1;
      private int arrayingType_;
      public static final int ISHIDE_FIELD_NUMBER = 2;
      private boolean isHide_;
      private byte memoizedIsInitialized;
      private static final S2C_HideArraying_13218 DEFAULT_INSTANCE = new S2C_HideArraying_13218();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HideArraying_13218> PARSER = new AbstractParser<S2C_HideArraying_13218>() {
         public S2C_HideArraying_13218 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HideArraying_13218(input, extensionRegistry);
         }
      };

      private S2C_HideArraying_13218(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HideArraying_13218() {
         this.memoizedIsInitialized = -1;
         this.arrayingType_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HideArraying_13218();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HideArraying_13218(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CommonMsg.HeroState value = CommonMsg.HeroState.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.arrayingType_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.isHide_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_HideArraying_13218_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_HideArraying_13218_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HideArraying_13218.class, Builder.class);
      }

      public boolean hasArrayingType() {
         return (this.bitField0_ & 1) != 0;
      }

      public CommonMsg.HeroState getArrayingType() {
         CommonMsg.HeroState result = CommonMsg.HeroState.valueOf(this.arrayingType_);
         return result == null ? CommonMsg.HeroState.HERO_STATE_ARRAYING : result;
      }

      public boolean hasIsHide() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsHide() {
         return this.isHide_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasArrayingType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsHide()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.arrayingType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.isHide_);
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
               size += CodedOutputStream.computeEnumSize(1, this.arrayingType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.isHide_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_HideArraying_13218)) {
            return super.equals(obj);
         } else {
            S2C_HideArraying_13218 other = (S2C_HideArraying_13218)obj;
            if (this.hasArrayingType() != other.hasArrayingType()) {
               return false;
            } else if (this.hasArrayingType() && this.arrayingType_ != other.arrayingType_) {
               return false;
            } else if (this.hasIsHide() != other.hasIsHide()) {
               return false;
            } else if (this.hasIsHide() && this.getIsHide() != other.getIsHide()) {
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
            if (this.hasArrayingType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.arrayingType_;
            }

            if (this.hasIsHide()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsHide());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_HideArraying_13218 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HideArraying_13218)PARSER.parseFrom(data);
      }

      public static S2C_HideArraying_13218 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HideArraying_13218)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HideArraying_13218 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HideArraying_13218)PARSER.parseFrom(data);
      }

      public static S2C_HideArraying_13218 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HideArraying_13218)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HideArraying_13218 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HideArraying_13218)PARSER.parseFrom(data);
      }

      public static S2C_HideArraying_13218 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HideArraying_13218)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HideArraying_13218 parseFrom(InputStream input) throws IOException {
         return (S2C_HideArraying_13218)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HideArraying_13218 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HideArraying_13218)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HideArraying_13218 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HideArraying_13218)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HideArraying_13218 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HideArraying_13218)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HideArraying_13218 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HideArraying_13218)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HideArraying_13218 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HideArraying_13218)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HideArraying_13218 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HideArraying_13218 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HideArraying_13218> parser() {
         return PARSER;
      }

      public Parser<S2C_HideArraying_13218> getParserForType() {
         return PARSER;
      }

      public S2C_HideArraying_13218 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HideArraying_13218OrBuilder {
         private int bitField0_;
         private int arrayingType_;
         private boolean isHide_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_HideArraying_13218_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_HideArraying_13218_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HideArraying_13218.class, Builder.class);
         }

         private Builder() {
            this.arrayingType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.arrayingType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroExtendMsg.S2C_HideArraying_13218.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.arrayingType_ = 1;
            this.bitField0_ &= -2;
            this.isHide_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_HideArraying_13218_descriptor;
         }

         public S2C_HideArraying_13218 getDefaultInstanceForType() {
            return HeroExtendMsg.S2C_HideArraying_13218.getDefaultInstance();
         }

         public S2C_HideArraying_13218 build() {
            S2C_HideArraying_13218 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HideArraying_13218 buildPartial() {
            S2C_HideArraying_13218 result = new S2C_HideArraying_13218(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.arrayingType_ = this.arrayingType_;
            if ((from_bitField0_ & 2) != 0) {
               result.isHide_ = this.isHide_;
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
            if (other instanceof S2C_HideArraying_13218) {
               return this.mergeFrom((S2C_HideArraying_13218)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HideArraying_13218 other) {
            if (other == HeroExtendMsg.S2C_HideArraying_13218.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasArrayingType()) {
                  this.setArrayingType(other.getArrayingType());
               }

               if (other.hasIsHide()) {
                  this.setIsHide(other.getIsHide());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasArrayingType()) {
               return false;
            } else {
               return this.hasIsHide();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_HideArraying_13218 parsedMessage = null;

            try {
               parsedMessage = (S2C_HideArraying_13218)HeroExtendMsg.S2C_HideArraying_13218.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HideArraying_13218)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasArrayingType() {
            return (this.bitField0_ & 1) != 0;
         }

         public CommonMsg.HeroState getArrayingType() {
            CommonMsg.HeroState result = CommonMsg.HeroState.valueOf(this.arrayingType_);
            return result == null ? CommonMsg.HeroState.HERO_STATE_ARRAYING : result;
         }

         public Builder setArrayingType(CommonMsg.HeroState value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.arrayingType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearArrayingType() {
            this.bitField0_ &= -2;
            this.arrayingType_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasIsHide() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsHide() {
            return this.isHide_;
         }

         public Builder setIsHide(boolean value) {
            this.bitField0_ |= 2;
            this.isHide_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsHide() {
            this.bitField0_ &= -3;
            this.isHide_ = false;
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

   public static final class C2S_SaveArraying_13219 extends GeneratedMessageV3 implements C2S_SaveArraying_13219OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SYSTEMID_FIELD_NUMBER = 1;
      private int systemId_;
      public static final int ARRAYINGINFO_FIELD_NUMBER = 2;
      private List<HeroMsg.ArrayingList> arrayingInfo_;
      public static final int FORCE_FIELD_NUMBER = 3;
      private boolean force_;
      private byte memoizedIsInitialized;
      private static final C2S_SaveArraying_13219 DEFAULT_INSTANCE = new C2S_SaveArraying_13219();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SaveArraying_13219> PARSER = new AbstractParser<C2S_SaveArraying_13219>() {
         public C2S_SaveArraying_13219 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SaveArraying_13219(input, extensionRegistry);
         }
      };

      private C2S_SaveArraying_13219(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SaveArraying_13219() {
         this.memoizedIsInitialized = -1;
         this.arrayingInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SaveArraying_13219();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SaveArraying_13219(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.systemId_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.arrayingInfo_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.arrayingInfo_.add(input.readMessage(HeroMsg.ArrayingList.PARSER, extensionRegistry));
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.force_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.arrayingInfo_ = Collections.unmodifiableList(this.arrayingInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_SaveArraying_13219_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_SaveArraying_13219_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SaveArraying_13219.class, Builder.class);
      }

      public boolean hasSystemId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSystemId() {
         return this.systemId_;
      }

      public List<HeroMsg.ArrayingList> getArrayingInfoList() {
         return this.arrayingInfo_;
      }

      public List<? extends HeroMsg.ArrayingListOrBuilder> getArrayingInfoOrBuilderList() {
         return this.arrayingInfo_;
      }

      public int getArrayingInfoCount() {
         return this.arrayingInfo_.size();
      }

      public HeroMsg.ArrayingList getArrayingInfo(int index) {
         return (HeroMsg.ArrayingList)this.arrayingInfo_.get(index);
      }

      public HeroMsg.ArrayingListOrBuilder getArrayingInfoOrBuilder(int index) {
         return (HeroMsg.ArrayingListOrBuilder)this.arrayingInfo_.get(index);
      }

      public boolean hasForce() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getForce() {
         return this.force_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSystemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getArrayingInfoCount(); ++i) {
               if (!this.getArrayingInfo(i).isInitialized()) {
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
            output.writeInt32(1, this.systemId_);
         }

         for(int i = 0; i < this.arrayingInfo_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.arrayingInfo_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(3, this.force_);
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
               size += CodedOutputStream.computeInt32Size(1, this.systemId_);
            }

            for(int i = 0; i < this.arrayingInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.arrayingInfo_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.force_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_SaveArraying_13219)) {
            return super.equals(obj);
         } else {
            C2S_SaveArraying_13219 other = (C2S_SaveArraying_13219)obj;
            if (this.hasSystemId() != other.hasSystemId()) {
               return false;
            } else if (this.hasSystemId() && this.getSystemId() != other.getSystemId()) {
               return false;
            } else if (!this.getArrayingInfoList().equals(other.getArrayingInfoList())) {
               return false;
            } else if (this.hasForce() != other.hasForce()) {
               return false;
            } else if (this.hasForce() && this.getForce() != other.getForce()) {
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
            if (this.hasSystemId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSystemId();
            }

            if (this.getArrayingInfoCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getArrayingInfoList().hashCode();
            }

            if (this.hasForce()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getForce());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_SaveArraying_13219 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SaveArraying_13219)PARSER.parseFrom(data);
      }

      public static C2S_SaveArraying_13219 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SaveArraying_13219)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SaveArraying_13219 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SaveArraying_13219)PARSER.parseFrom(data);
      }

      public static C2S_SaveArraying_13219 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SaveArraying_13219)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SaveArraying_13219 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SaveArraying_13219)PARSER.parseFrom(data);
      }

      public static C2S_SaveArraying_13219 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SaveArraying_13219)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SaveArraying_13219 parseFrom(InputStream input) throws IOException {
         return (C2S_SaveArraying_13219)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SaveArraying_13219 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SaveArraying_13219)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SaveArraying_13219 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SaveArraying_13219)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SaveArraying_13219 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SaveArraying_13219)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SaveArraying_13219 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SaveArraying_13219)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SaveArraying_13219 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SaveArraying_13219)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SaveArraying_13219 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SaveArraying_13219 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SaveArraying_13219> parser() {
         return PARSER;
      }

      public Parser<C2S_SaveArraying_13219> getParserForType() {
         return PARSER;
      }

      public C2S_SaveArraying_13219 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SaveArraying_13219OrBuilder {
         private int bitField0_;
         private int systemId_;
         private List<HeroMsg.ArrayingList> arrayingInfo_;
         private RepeatedFieldBuilderV3<HeroMsg.ArrayingList, HeroMsg.ArrayingList.Builder, HeroMsg.ArrayingListOrBuilder> arrayingInfoBuilder_;
         private boolean force_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_SaveArraying_13219_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_SaveArraying_13219_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SaveArraying_13219.class, Builder.class);
         }

         private Builder() {
            this.arrayingInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.arrayingInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroExtendMsg.C2S_SaveArraying_13219.alwaysUseFieldBuilders) {
               this.getArrayingInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.systemId_ = 0;
            this.bitField0_ &= -2;
            if (this.arrayingInfoBuilder_ == null) {
               this.arrayingInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.arrayingInfoBuilder_.clear();
            }

            this.force_ = false;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_SaveArraying_13219_descriptor;
         }

         public C2S_SaveArraying_13219 getDefaultInstanceForType() {
            return HeroExtendMsg.C2S_SaveArraying_13219.getDefaultInstance();
         }

         public C2S_SaveArraying_13219 build() {
            C2S_SaveArraying_13219 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SaveArraying_13219 buildPartial() {
            C2S_SaveArraying_13219 result = new C2S_SaveArraying_13219(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.systemId_ = this.systemId_;
               to_bitField0_ |= 1;
            }

            if (this.arrayingInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.arrayingInfo_ = Collections.unmodifiableList(this.arrayingInfo_);
                  this.bitField0_ &= -3;
               }

               result.arrayingInfo_ = this.arrayingInfo_;
            } else {
               result.arrayingInfo_ = this.arrayingInfoBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.force_ = this.force_;
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
            if (other instanceof C2S_SaveArraying_13219) {
               return this.mergeFrom((C2S_SaveArraying_13219)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SaveArraying_13219 other) {
            if (other == HeroExtendMsg.C2S_SaveArraying_13219.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSystemId()) {
                  this.setSystemId(other.getSystemId());
               }

               if (this.arrayingInfoBuilder_ == null) {
                  if (!other.arrayingInfo_.isEmpty()) {
                     if (this.arrayingInfo_.isEmpty()) {
                        this.arrayingInfo_ = other.arrayingInfo_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureArrayingInfoIsMutable();
                        this.arrayingInfo_.addAll(other.arrayingInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.arrayingInfo_.isEmpty()) {
                  if (this.arrayingInfoBuilder_.isEmpty()) {
                     this.arrayingInfoBuilder_.dispose();
                     this.arrayingInfoBuilder_ = null;
                     this.arrayingInfo_ = other.arrayingInfo_;
                     this.bitField0_ &= -3;
                     this.arrayingInfoBuilder_ = HeroExtendMsg.C2S_SaveArraying_13219.alwaysUseFieldBuilders ? this.getArrayingInfoFieldBuilder() : null;
                  } else {
                     this.arrayingInfoBuilder_.addAllMessages(other.arrayingInfo_);
                  }
               }

               if (other.hasForce()) {
                  this.setForce(other.getForce());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasSystemId()) {
               return false;
            } else {
               for(int i = 0; i < this.getArrayingInfoCount(); ++i) {
                  if (!this.getArrayingInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_SaveArraying_13219 parsedMessage = null;

            try {
               parsedMessage = (C2S_SaveArraying_13219)HeroExtendMsg.C2S_SaveArraying_13219.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SaveArraying_13219)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSystemId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSystemId() {
            return this.systemId_;
         }

         public Builder setSystemId(int value) {
            this.bitField0_ |= 1;
            this.systemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSystemId() {
            this.bitField0_ &= -2;
            this.systemId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureArrayingInfoIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.arrayingInfo_ = new ArrayList(this.arrayingInfo_);
               this.bitField0_ |= 2;
            }

         }

         public List<HeroMsg.ArrayingList> getArrayingInfoList() {
            return this.arrayingInfoBuilder_ == null ? Collections.unmodifiableList(this.arrayingInfo_) : this.arrayingInfoBuilder_.getMessageList();
         }

         public int getArrayingInfoCount() {
            return this.arrayingInfoBuilder_ == null ? this.arrayingInfo_.size() : this.arrayingInfoBuilder_.getCount();
         }

         public HeroMsg.ArrayingList getArrayingInfo(int index) {
            return this.arrayingInfoBuilder_ == null ? (HeroMsg.ArrayingList)this.arrayingInfo_.get(index) : (HeroMsg.ArrayingList)this.arrayingInfoBuilder_.getMessage(index);
         }

         public Builder setArrayingInfo(int index, HeroMsg.ArrayingList value) {
            if (this.arrayingInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureArrayingInfoIsMutable();
               this.arrayingInfo_.set(index, value);
               this.onChanged();
            } else {
               this.arrayingInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setArrayingInfo(int index, HeroMsg.ArrayingList.Builder builderForValue) {
            if (this.arrayingInfoBuilder_ == null) {
               this.ensureArrayingInfoIsMutable();
               this.arrayingInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.arrayingInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addArrayingInfo(HeroMsg.ArrayingList value) {
            if (this.arrayingInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureArrayingInfoIsMutable();
               this.arrayingInfo_.add(value);
               this.onChanged();
            } else {
               this.arrayingInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addArrayingInfo(int index, HeroMsg.ArrayingList value) {
            if (this.arrayingInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureArrayingInfoIsMutable();
               this.arrayingInfo_.add(index, value);
               this.onChanged();
            } else {
               this.arrayingInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addArrayingInfo(HeroMsg.ArrayingList.Builder builderForValue) {
            if (this.arrayingInfoBuilder_ == null) {
               this.ensureArrayingInfoIsMutable();
               this.arrayingInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.arrayingInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addArrayingInfo(int index, HeroMsg.ArrayingList.Builder builderForValue) {
            if (this.arrayingInfoBuilder_ == null) {
               this.ensureArrayingInfoIsMutable();
               this.arrayingInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.arrayingInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllArrayingInfo(Iterable<? extends HeroMsg.ArrayingList> values) {
            if (this.arrayingInfoBuilder_ == null) {
               this.ensureArrayingInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.arrayingInfo_);
               this.onChanged();
            } else {
               this.arrayingInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearArrayingInfo() {
            if (this.arrayingInfoBuilder_ == null) {
               this.arrayingInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.arrayingInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeArrayingInfo(int index) {
            if (this.arrayingInfoBuilder_ == null) {
               this.ensureArrayingInfoIsMutable();
               this.arrayingInfo_.remove(index);
               this.onChanged();
            } else {
               this.arrayingInfoBuilder_.remove(index);
            }

            return this;
         }

         public HeroMsg.ArrayingList.Builder getArrayingInfoBuilder(int index) {
            return (HeroMsg.ArrayingList.Builder)this.getArrayingInfoFieldBuilder().getBuilder(index);
         }

         public HeroMsg.ArrayingListOrBuilder getArrayingInfoOrBuilder(int index) {
            return this.arrayingInfoBuilder_ == null ? (HeroMsg.ArrayingListOrBuilder)this.arrayingInfo_.get(index) : (HeroMsg.ArrayingListOrBuilder)this.arrayingInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HeroMsg.ArrayingListOrBuilder> getArrayingInfoOrBuilderList() {
            return this.arrayingInfoBuilder_ != null ? this.arrayingInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.arrayingInfo_);
         }

         public HeroMsg.ArrayingList.Builder addArrayingInfoBuilder() {
            return (HeroMsg.ArrayingList.Builder)this.getArrayingInfoFieldBuilder().addBuilder(HeroMsg.ArrayingList.getDefaultInstance());
         }

         public HeroMsg.ArrayingList.Builder addArrayingInfoBuilder(int index) {
            return (HeroMsg.ArrayingList.Builder)this.getArrayingInfoFieldBuilder().addBuilder(index, HeroMsg.ArrayingList.getDefaultInstance());
         }

         public List<HeroMsg.ArrayingList.Builder> getArrayingInfoBuilderList() {
            return this.getArrayingInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HeroMsg.ArrayingList, HeroMsg.ArrayingList.Builder, HeroMsg.ArrayingListOrBuilder> getArrayingInfoFieldBuilder() {
            if (this.arrayingInfoBuilder_ == null) {
               this.arrayingInfoBuilder_ = new RepeatedFieldBuilderV3(this.arrayingInfo_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.arrayingInfo_ = null;
            }

            return this.arrayingInfoBuilder_;
         }

         public boolean hasForce() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getForce() {
            return this.force_;
         }

         public Builder setForce(boolean value) {
            this.bitField0_ |= 4;
            this.force_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearForce() {
            this.bitField0_ &= -5;
            this.force_ = false;
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

   public static final class S2C_SaveArraying_13220 extends GeneratedMessageV3 implements S2C_SaveArraying_13220OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SYSTEMID_FIELD_NUMBER = 1;
      private int systemId_;
      public static final int ARRAYINGINFO_FIELD_NUMBER = 2;
      private List<HeroMsg.ArrayingList> arrayingInfo_;
      public static final int FORCE_FIELD_NUMBER = 3;
      private boolean force_;
      private byte memoizedIsInitialized;
      private static final S2C_SaveArraying_13220 DEFAULT_INSTANCE = new S2C_SaveArraying_13220();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SaveArraying_13220> PARSER = new AbstractParser<S2C_SaveArraying_13220>() {
         public S2C_SaveArraying_13220 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SaveArraying_13220(input, extensionRegistry);
         }
      };

      private S2C_SaveArraying_13220(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SaveArraying_13220() {
         this.memoizedIsInitialized = -1;
         this.arrayingInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SaveArraying_13220();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SaveArraying_13220(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.systemId_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.arrayingInfo_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.arrayingInfo_.add(input.readMessage(HeroMsg.ArrayingList.PARSER, extensionRegistry));
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.force_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.arrayingInfo_ = Collections.unmodifiableList(this.arrayingInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_SaveArraying_13220_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_SaveArraying_13220_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SaveArraying_13220.class, Builder.class);
      }

      public boolean hasSystemId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSystemId() {
         return this.systemId_;
      }

      public List<HeroMsg.ArrayingList> getArrayingInfoList() {
         return this.arrayingInfo_;
      }

      public List<? extends HeroMsg.ArrayingListOrBuilder> getArrayingInfoOrBuilderList() {
         return this.arrayingInfo_;
      }

      public int getArrayingInfoCount() {
         return this.arrayingInfo_.size();
      }

      public HeroMsg.ArrayingList getArrayingInfo(int index) {
         return (HeroMsg.ArrayingList)this.arrayingInfo_.get(index);
      }

      public HeroMsg.ArrayingListOrBuilder getArrayingInfoOrBuilder(int index) {
         return (HeroMsg.ArrayingListOrBuilder)this.arrayingInfo_.get(index);
      }

      public boolean hasForce() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getForce() {
         return this.force_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSystemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getArrayingInfoCount(); ++i) {
               if (!this.getArrayingInfo(i).isInitialized()) {
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
            output.writeInt32(1, this.systemId_);
         }

         for(int i = 0; i < this.arrayingInfo_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.arrayingInfo_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(3, this.force_);
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
               size += CodedOutputStream.computeInt32Size(1, this.systemId_);
            }

            for(int i = 0; i < this.arrayingInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.arrayingInfo_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.force_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SaveArraying_13220)) {
            return super.equals(obj);
         } else {
            S2C_SaveArraying_13220 other = (S2C_SaveArraying_13220)obj;
            if (this.hasSystemId() != other.hasSystemId()) {
               return false;
            } else if (this.hasSystemId() && this.getSystemId() != other.getSystemId()) {
               return false;
            } else if (!this.getArrayingInfoList().equals(other.getArrayingInfoList())) {
               return false;
            } else if (this.hasForce() != other.hasForce()) {
               return false;
            } else if (this.hasForce() && this.getForce() != other.getForce()) {
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
            if (this.hasSystemId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSystemId();
            }

            if (this.getArrayingInfoCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getArrayingInfoList().hashCode();
            }

            if (this.hasForce()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getForce());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SaveArraying_13220 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SaveArraying_13220)PARSER.parseFrom(data);
      }

      public static S2C_SaveArraying_13220 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SaveArraying_13220)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SaveArraying_13220 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SaveArraying_13220)PARSER.parseFrom(data);
      }

      public static S2C_SaveArraying_13220 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SaveArraying_13220)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SaveArraying_13220 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SaveArraying_13220)PARSER.parseFrom(data);
      }

      public static S2C_SaveArraying_13220 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SaveArraying_13220)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SaveArraying_13220 parseFrom(InputStream input) throws IOException {
         return (S2C_SaveArraying_13220)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SaveArraying_13220 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SaveArraying_13220)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SaveArraying_13220 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SaveArraying_13220)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SaveArraying_13220 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SaveArraying_13220)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SaveArraying_13220 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SaveArraying_13220)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SaveArraying_13220 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SaveArraying_13220)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SaveArraying_13220 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SaveArraying_13220 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SaveArraying_13220> parser() {
         return PARSER;
      }

      public Parser<S2C_SaveArraying_13220> getParserForType() {
         return PARSER;
      }

      public S2C_SaveArraying_13220 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SaveArraying_13220OrBuilder {
         private int bitField0_;
         private int systemId_;
         private List<HeroMsg.ArrayingList> arrayingInfo_;
         private RepeatedFieldBuilderV3<HeroMsg.ArrayingList, HeroMsg.ArrayingList.Builder, HeroMsg.ArrayingListOrBuilder> arrayingInfoBuilder_;
         private boolean force_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_SaveArraying_13220_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_SaveArraying_13220_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SaveArraying_13220.class, Builder.class);
         }

         private Builder() {
            this.arrayingInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.arrayingInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroExtendMsg.S2C_SaveArraying_13220.alwaysUseFieldBuilders) {
               this.getArrayingInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.systemId_ = 0;
            this.bitField0_ &= -2;
            if (this.arrayingInfoBuilder_ == null) {
               this.arrayingInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.arrayingInfoBuilder_.clear();
            }

            this.force_ = false;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_SaveArraying_13220_descriptor;
         }

         public S2C_SaveArraying_13220 getDefaultInstanceForType() {
            return HeroExtendMsg.S2C_SaveArraying_13220.getDefaultInstance();
         }

         public S2C_SaveArraying_13220 build() {
            S2C_SaveArraying_13220 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SaveArraying_13220 buildPartial() {
            S2C_SaveArraying_13220 result = new S2C_SaveArraying_13220(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.systemId_ = this.systemId_;
               to_bitField0_ |= 1;
            }

            if (this.arrayingInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.arrayingInfo_ = Collections.unmodifiableList(this.arrayingInfo_);
                  this.bitField0_ &= -3;
               }

               result.arrayingInfo_ = this.arrayingInfo_;
            } else {
               result.arrayingInfo_ = this.arrayingInfoBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.force_ = this.force_;
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
            if (other instanceof S2C_SaveArraying_13220) {
               return this.mergeFrom((S2C_SaveArraying_13220)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SaveArraying_13220 other) {
            if (other == HeroExtendMsg.S2C_SaveArraying_13220.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSystemId()) {
                  this.setSystemId(other.getSystemId());
               }

               if (this.arrayingInfoBuilder_ == null) {
                  if (!other.arrayingInfo_.isEmpty()) {
                     if (this.arrayingInfo_.isEmpty()) {
                        this.arrayingInfo_ = other.arrayingInfo_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureArrayingInfoIsMutable();
                        this.arrayingInfo_.addAll(other.arrayingInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.arrayingInfo_.isEmpty()) {
                  if (this.arrayingInfoBuilder_.isEmpty()) {
                     this.arrayingInfoBuilder_.dispose();
                     this.arrayingInfoBuilder_ = null;
                     this.arrayingInfo_ = other.arrayingInfo_;
                     this.bitField0_ &= -3;
                     this.arrayingInfoBuilder_ = HeroExtendMsg.S2C_SaveArraying_13220.alwaysUseFieldBuilders ? this.getArrayingInfoFieldBuilder() : null;
                  } else {
                     this.arrayingInfoBuilder_.addAllMessages(other.arrayingInfo_);
                  }
               }

               if (other.hasForce()) {
                  this.setForce(other.getForce());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasSystemId()) {
               return false;
            } else {
               for(int i = 0; i < this.getArrayingInfoCount(); ++i) {
                  if (!this.getArrayingInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SaveArraying_13220 parsedMessage = null;

            try {
               parsedMessage = (S2C_SaveArraying_13220)HeroExtendMsg.S2C_SaveArraying_13220.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SaveArraying_13220)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSystemId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSystemId() {
            return this.systemId_;
         }

         public Builder setSystemId(int value) {
            this.bitField0_ |= 1;
            this.systemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSystemId() {
            this.bitField0_ &= -2;
            this.systemId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureArrayingInfoIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.arrayingInfo_ = new ArrayList(this.arrayingInfo_);
               this.bitField0_ |= 2;
            }

         }

         public List<HeroMsg.ArrayingList> getArrayingInfoList() {
            return this.arrayingInfoBuilder_ == null ? Collections.unmodifiableList(this.arrayingInfo_) : this.arrayingInfoBuilder_.getMessageList();
         }

         public int getArrayingInfoCount() {
            return this.arrayingInfoBuilder_ == null ? this.arrayingInfo_.size() : this.arrayingInfoBuilder_.getCount();
         }

         public HeroMsg.ArrayingList getArrayingInfo(int index) {
            return this.arrayingInfoBuilder_ == null ? (HeroMsg.ArrayingList)this.arrayingInfo_.get(index) : (HeroMsg.ArrayingList)this.arrayingInfoBuilder_.getMessage(index);
         }

         public Builder setArrayingInfo(int index, HeroMsg.ArrayingList value) {
            if (this.arrayingInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureArrayingInfoIsMutable();
               this.arrayingInfo_.set(index, value);
               this.onChanged();
            } else {
               this.arrayingInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setArrayingInfo(int index, HeroMsg.ArrayingList.Builder builderForValue) {
            if (this.arrayingInfoBuilder_ == null) {
               this.ensureArrayingInfoIsMutable();
               this.arrayingInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.arrayingInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addArrayingInfo(HeroMsg.ArrayingList value) {
            if (this.arrayingInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureArrayingInfoIsMutable();
               this.arrayingInfo_.add(value);
               this.onChanged();
            } else {
               this.arrayingInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addArrayingInfo(int index, HeroMsg.ArrayingList value) {
            if (this.arrayingInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureArrayingInfoIsMutable();
               this.arrayingInfo_.add(index, value);
               this.onChanged();
            } else {
               this.arrayingInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addArrayingInfo(HeroMsg.ArrayingList.Builder builderForValue) {
            if (this.arrayingInfoBuilder_ == null) {
               this.ensureArrayingInfoIsMutable();
               this.arrayingInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.arrayingInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addArrayingInfo(int index, HeroMsg.ArrayingList.Builder builderForValue) {
            if (this.arrayingInfoBuilder_ == null) {
               this.ensureArrayingInfoIsMutable();
               this.arrayingInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.arrayingInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllArrayingInfo(Iterable<? extends HeroMsg.ArrayingList> values) {
            if (this.arrayingInfoBuilder_ == null) {
               this.ensureArrayingInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.arrayingInfo_);
               this.onChanged();
            } else {
               this.arrayingInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearArrayingInfo() {
            if (this.arrayingInfoBuilder_ == null) {
               this.arrayingInfo_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.arrayingInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeArrayingInfo(int index) {
            if (this.arrayingInfoBuilder_ == null) {
               this.ensureArrayingInfoIsMutable();
               this.arrayingInfo_.remove(index);
               this.onChanged();
            } else {
               this.arrayingInfoBuilder_.remove(index);
            }

            return this;
         }

         public HeroMsg.ArrayingList.Builder getArrayingInfoBuilder(int index) {
            return (HeroMsg.ArrayingList.Builder)this.getArrayingInfoFieldBuilder().getBuilder(index);
         }

         public HeroMsg.ArrayingListOrBuilder getArrayingInfoOrBuilder(int index) {
            return this.arrayingInfoBuilder_ == null ? (HeroMsg.ArrayingListOrBuilder)this.arrayingInfo_.get(index) : (HeroMsg.ArrayingListOrBuilder)this.arrayingInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HeroMsg.ArrayingListOrBuilder> getArrayingInfoOrBuilderList() {
            return this.arrayingInfoBuilder_ != null ? this.arrayingInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.arrayingInfo_);
         }

         public HeroMsg.ArrayingList.Builder addArrayingInfoBuilder() {
            return (HeroMsg.ArrayingList.Builder)this.getArrayingInfoFieldBuilder().addBuilder(HeroMsg.ArrayingList.getDefaultInstance());
         }

         public HeroMsg.ArrayingList.Builder addArrayingInfoBuilder(int index) {
            return (HeroMsg.ArrayingList.Builder)this.getArrayingInfoFieldBuilder().addBuilder(index, HeroMsg.ArrayingList.getDefaultInstance());
         }

         public List<HeroMsg.ArrayingList.Builder> getArrayingInfoBuilderList() {
            return this.getArrayingInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HeroMsg.ArrayingList, HeroMsg.ArrayingList.Builder, HeroMsg.ArrayingListOrBuilder> getArrayingInfoFieldBuilder() {
            if (this.arrayingInfoBuilder_ == null) {
               this.arrayingInfoBuilder_ = new RepeatedFieldBuilderV3(this.arrayingInfo_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.arrayingInfo_ = null;
            }

            return this.arrayingInfoBuilder_;
         }

         public boolean hasForce() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getForce() {
            return this.force_;
         }

         public Builder setForce(boolean value) {
            this.bitField0_ |= 4;
            this.force_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearForce() {
            this.bitField0_ &= -5;
            this.force_ = false;
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

   public static final class HeroUpdateStarRequest extends GeneratedMessageV3 implements HeroUpdateStarRequestOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int GRIDS_FIELD_NUMBER = 1;
      private List<HeroMsg.MaterHeroList> grids_;
      private byte memoizedIsInitialized;
      private static final HeroUpdateStarRequest DEFAULT_INSTANCE = new HeroUpdateStarRequest();
      /** @deprecated */
      @Deprecated
      public static final Parser<HeroUpdateStarRequest> PARSER = new AbstractParser<HeroUpdateStarRequest>() {
         public HeroUpdateStarRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new HeroUpdateStarRequest(input, extensionRegistry);
         }
      };

      private HeroUpdateStarRequest(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private HeroUpdateStarRequest() {
         this.memoizedIsInitialized = -1;
         this.grids_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new HeroUpdateStarRequest();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private HeroUpdateStarRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.grids_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.grids_.add(input.readMessage(HeroMsg.MaterHeroList.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.grids_ = Collections.unmodifiableList(this.grids_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_HeroUpdateStarRequest_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_HeroUpdateStarRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(HeroUpdateStarRequest.class, Builder.class);
      }

      public List<HeroMsg.MaterHeroList> getGridsList() {
         return this.grids_;
      }

      public List<? extends HeroMsg.MaterHeroListOrBuilder> getGridsOrBuilderList() {
         return this.grids_;
      }

      public int getGridsCount() {
         return this.grids_.size();
      }

      public HeroMsg.MaterHeroList getGrids(int index) {
         return (HeroMsg.MaterHeroList)this.grids_.get(index);
      }

      public HeroMsg.MaterHeroListOrBuilder getGridsOrBuilder(int index) {
         return (HeroMsg.MaterHeroListOrBuilder)this.grids_.get(index);
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
         for(int i = 0; i < this.grids_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.grids_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.grids_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.grids_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof HeroUpdateStarRequest)) {
            return super.equals(obj);
         } else {
            HeroUpdateStarRequest other = (HeroUpdateStarRequest)obj;
            if (!this.getGridsList().equals(other.getGridsList())) {
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
            if (this.getGridsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGridsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static HeroUpdateStarRequest parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (HeroUpdateStarRequest)PARSER.parseFrom(data);
      }

      public static HeroUpdateStarRequest parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroUpdateStarRequest)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroUpdateStarRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (HeroUpdateStarRequest)PARSER.parseFrom(data);
      }

      public static HeroUpdateStarRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroUpdateStarRequest)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroUpdateStarRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (HeroUpdateStarRequest)PARSER.parseFrom(data);
      }

      public static HeroUpdateStarRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroUpdateStarRequest)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroUpdateStarRequest parseFrom(InputStream input) throws IOException {
         return (HeroUpdateStarRequest)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HeroUpdateStarRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroUpdateStarRequest)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static HeroUpdateStarRequest parseDelimitedFrom(InputStream input) throws IOException {
         return (HeroUpdateStarRequest)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static HeroUpdateStarRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroUpdateStarRequest)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static HeroUpdateStarRequest parseFrom(CodedInputStream input) throws IOException {
         return (HeroUpdateStarRequest)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HeroUpdateStarRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroUpdateStarRequest)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(HeroUpdateStarRequest prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static HeroUpdateStarRequest getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<HeroUpdateStarRequest> parser() {
         return PARSER;
      }

      public Parser<HeroUpdateStarRequest> getParserForType() {
         return PARSER;
      }

      public HeroUpdateStarRequest getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HeroUpdateStarRequestOrBuilder {
         private int bitField0_;
         private List<HeroMsg.MaterHeroList> grids_;
         private RepeatedFieldBuilderV3<HeroMsg.MaterHeroList, HeroMsg.MaterHeroList.Builder, HeroMsg.MaterHeroListOrBuilder> gridsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_HeroUpdateStarRequest_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_HeroUpdateStarRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(HeroUpdateStarRequest.class, Builder.class);
         }

         private Builder() {
            this.grids_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.grids_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroExtendMsg.HeroUpdateStarRequest.alwaysUseFieldBuilders) {
               this.getGridsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.gridsBuilder_ == null) {
               this.grids_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.gridsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_HeroUpdateStarRequest_descriptor;
         }

         public HeroUpdateStarRequest getDefaultInstanceForType() {
            return HeroExtendMsg.HeroUpdateStarRequest.getDefaultInstance();
         }

         public HeroUpdateStarRequest build() {
            HeroUpdateStarRequest result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public HeroUpdateStarRequest buildPartial() {
            HeroUpdateStarRequest result = new HeroUpdateStarRequest(this);
            int from_bitField0_ = this.bitField0_;
            if (this.gridsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.grids_ = Collections.unmodifiableList(this.grids_);
                  this.bitField0_ &= -2;
               }

               result.grids_ = this.grids_;
            } else {
               result.grids_ = this.gridsBuilder_.build();
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
            if (other instanceof HeroUpdateStarRequest) {
               return this.mergeFrom((HeroUpdateStarRequest)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(HeroUpdateStarRequest other) {
            if (other == HeroExtendMsg.HeroUpdateStarRequest.getDefaultInstance()) {
               return this;
            } else {
               if (this.gridsBuilder_ == null) {
                  if (!other.grids_.isEmpty()) {
                     if (this.grids_.isEmpty()) {
                        this.grids_ = other.grids_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureGridsIsMutable();
                        this.grids_.addAll(other.grids_);
                     }

                     this.onChanged();
                  }
               } else if (!other.grids_.isEmpty()) {
                  if (this.gridsBuilder_.isEmpty()) {
                     this.gridsBuilder_.dispose();
                     this.gridsBuilder_ = null;
                     this.grids_ = other.grids_;
                     this.bitField0_ &= -2;
                     this.gridsBuilder_ = HeroExtendMsg.HeroUpdateStarRequest.alwaysUseFieldBuilders ? this.getGridsFieldBuilder() : null;
                  } else {
                     this.gridsBuilder_.addAllMessages(other.grids_);
                  }
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
            HeroUpdateStarRequest parsedMessage = null;

            try {
               parsedMessage = (HeroUpdateStarRequest)HeroExtendMsg.HeroUpdateStarRequest.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (HeroUpdateStarRequest)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureGridsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.grids_ = new ArrayList(this.grids_);
               this.bitField0_ |= 1;
            }

         }

         public List<HeroMsg.MaterHeroList> getGridsList() {
            return this.gridsBuilder_ == null ? Collections.unmodifiableList(this.grids_) : this.gridsBuilder_.getMessageList();
         }

         public int getGridsCount() {
            return this.gridsBuilder_ == null ? this.grids_.size() : this.gridsBuilder_.getCount();
         }

         public HeroMsg.MaterHeroList getGrids(int index) {
            return this.gridsBuilder_ == null ? (HeroMsg.MaterHeroList)this.grids_.get(index) : (HeroMsg.MaterHeroList)this.gridsBuilder_.getMessage(index);
         }

         public Builder setGrids(int index, HeroMsg.MaterHeroList value) {
            if (this.gridsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGridsIsMutable();
               this.grids_.set(index, value);
               this.onChanged();
            } else {
               this.gridsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setGrids(int index, HeroMsg.MaterHeroList.Builder builderForValue) {
            if (this.gridsBuilder_ == null) {
               this.ensureGridsIsMutable();
               this.grids_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.gridsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addGrids(HeroMsg.MaterHeroList value) {
            if (this.gridsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGridsIsMutable();
               this.grids_.add(value);
               this.onChanged();
            } else {
               this.gridsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addGrids(int index, HeroMsg.MaterHeroList value) {
            if (this.gridsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGridsIsMutable();
               this.grids_.add(index, value);
               this.onChanged();
            } else {
               this.gridsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addGrids(HeroMsg.MaterHeroList.Builder builderForValue) {
            if (this.gridsBuilder_ == null) {
               this.ensureGridsIsMutable();
               this.grids_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.gridsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addGrids(int index, HeroMsg.MaterHeroList.Builder builderForValue) {
            if (this.gridsBuilder_ == null) {
               this.ensureGridsIsMutable();
               this.grids_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.gridsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllGrids(Iterable<? extends HeroMsg.MaterHeroList> values) {
            if (this.gridsBuilder_ == null) {
               this.ensureGridsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.grids_);
               this.onChanged();
            } else {
               this.gridsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearGrids() {
            if (this.gridsBuilder_ == null) {
               this.grids_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.gridsBuilder_.clear();
            }

            return this;
         }

         public Builder removeGrids(int index) {
            if (this.gridsBuilder_ == null) {
               this.ensureGridsIsMutable();
               this.grids_.remove(index);
               this.onChanged();
            } else {
               this.gridsBuilder_.remove(index);
            }

            return this;
         }

         public HeroMsg.MaterHeroList.Builder getGridsBuilder(int index) {
            return (HeroMsg.MaterHeroList.Builder)this.getGridsFieldBuilder().getBuilder(index);
         }

         public HeroMsg.MaterHeroListOrBuilder getGridsOrBuilder(int index) {
            return this.gridsBuilder_ == null ? (HeroMsg.MaterHeroListOrBuilder)this.grids_.get(index) : (HeroMsg.MaterHeroListOrBuilder)this.gridsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HeroMsg.MaterHeroListOrBuilder> getGridsOrBuilderList() {
            return this.gridsBuilder_ != null ? this.gridsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.grids_);
         }

         public HeroMsg.MaterHeroList.Builder addGridsBuilder() {
            return (HeroMsg.MaterHeroList.Builder)this.getGridsFieldBuilder().addBuilder(HeroMsg.MaterHeroList.getDefaultInstance());
         }

         public HeroMsg.MaterHeroList.Builder addGridsBuilder(int index) {
            return (HeroMsg.MaterHeroList.Builder)this.getGridsFieldBuilder().addBuilder(index, HeroMsg.MaterHeroList.getDefaultInstance());
         }

         public List<HeroMsg.MaterHeroList.Builder> getGridsBuilderList() {
            return this.getGridsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HeroMsg.MaterHeroList, HeroMsg.MaterHeroList.Builder, HeroMsg.MaterHeroListOrBuilder> getGridsFieldBuilder() {
            if (this.gridsBuilder_ == null) {
               this.gridsBuilder_ = new RepeatedFieldBuilderV3(this.grids_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.grids_ = null;
            }

            return this.gridsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_OneKeyHeroUpdateStar_13221 extends GeneratedMessageV3 implements C2S_OneKeyHeroUpdateStar_13221OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int UPSTARREQUESTS_FIELD_NUMBER = 1;
      private List<HeroUpdateStarRequest> upStarRequests_;
      private byte memoizedIsInitialized;
      private static final C2S_OneKeyHeroUpdateStar_13221 DEFAULT_INSTANCE = new C2S_OneKeyHeroUpdateStar_13221();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OneKeyHeroUpdateStar_13221> PARSER = new AbstractParser<C2S_OneKeyHeroUpdateStar_13221>() {
         public C2S_OneKeyHeroUpdateStar_13221 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OneKeyHeroUpdateStar_13221(input, extensionRegistry);
         }
      };

      private C2S_OneKeyHeroUpdateStar_13221(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OneKeyHeroUpdateStar_13221() {
         this.memoizedIsInitialized = -1;
         this.upStarRequests_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OneKeyHeroUpdateStar_13221();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OneKeyHeroUpdateStar_13221(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.upStarRequests_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.upStarRequests_.add(input.readMessage(HeroExtendMsg.HeroUpdateStarRequest.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.upStarRequests_ = Collections.unmodifiableList(this.upStarRequests_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_OneKeyHeroUpdateStar_13221_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_OneKeyHeroUpdateStar_13221_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OneKeyHeroUpdateStar_13221.class, Builder.class);
      }

      public List<HeroUpdateStarRequest> getUpStarRequestsList() {
         return this.upStarRequests_;
      }

      public List<? extends HeroUpdateStarRequestOrBuilder> getUpStarRequestsOrBuilderList() {
         return this.upStarRequests_;
      }

      public int getUpStarRequestsCount() {
         return this.upStarRequests_.size();
      }

      public HeroUpdateStarRequest getUpStarRequests(int index) {
         return (HeroUpdateStarRequest)this.upStarRequests_.get(index);
      }

      public HeroUpdateStarRequestOrBuilder getUpStarRequestsOrBuilder(int index) {
         return (HeroUpdateStarRequestOrBuilder)this.upStarRequests_.get(index);
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
         for(int i = 0; i < this.upStarRequests_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.upStarRequests_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.upStarRequests_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.upStarRequests_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_OneKeyHeroUpdateStar_13221)) {
            return super.equals(obj);
         } else {
            C2S_OneKeyHeroUpdateStar_13221 other = (C2S_OneKeyHeroUpdateStar_13221)obj;
            if (!this.getUpStarRequestsList().equals(other.getUpStarRequestsList())) {
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
            if (this.getUpStarRequestsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getUpStarRequestsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_OneKeyHeroUpdateStar_13221 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OneKeyHeroUpdateStar_13221)PARSER.parseFrom(data);
      }

      public static C2S_OneKeyHeroUpdateStar_13221 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OneKeyHeroUpdateStar_13221)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OneKeyHeroUpdateStar_13221 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OneKeyHeroUpdateStar_13221)PARSER.parseFrom(data);
      }

      public static C2S_OneKeyHeroUpdateStar_13221 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OneKeyHeroUpdateStar_13221)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OneKeyHeroUpdateStar_13221 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OneKeyHeroUpdateStar_13221)PARSER.parseFrom(data);
      }

      public static C2S_OneKeyHeroUpdateStar_13221 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OneKeyHeroUpdateStar_13221)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OneKeyHeroUpdateStar_13221 parseFrom(InputStream input) throws IOException {
         return (C2S_OneKeyHeroUpdateStar_13221)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OneKeyHeroUpdateStar_13221 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OneKeyHeroUpdateStar_13221)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OneKeyHeroUpdateStar_13221 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OneKeyHeroUpdateStar_13221)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OneKeyHeroUpdateStar_13221 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OneKeyHeroUpdateStar_13221)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OneKeyHeroUpdateStar_13221 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OneKeyHeroUpdateStar_13221)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OneKeyHeroUpdateStar_13221 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OneKeyHeroUpdateStar_13221)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OneKeyHeroUpdateStar_13221 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OneKeyHeroUpdateStar_13221 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OneKeyHeroUpdateStar_13221> parser() {
         return PARSER;
      }

      public Parser<C2S_OneKeyHeroUpdateStar_13221> getParserForType() {
         return PARSER;
      }

      public C2S_OneKeyHeroUpdateStar_13221 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OneKeyHeroUpdateStar_13221OrBuilder {
         private int bitField0_;
         private List<HeroUpdateStarRequest> upStarRequests_;
         private RepeatedFieldBuilderV3<HeroUpdateStarRequest, HeroUpdateStarRequest.Builder, HeroUpdateStarRequestOrBuilder> upStarRequestsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_OneKeyHeroUpdateStar_13221_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_OneKeyHeroUpdateStar_13221_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OneKeyHeroUpdateStar_13221.class, Builder.class);
         }

         private Builder() {
            this.upStarRequests_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.upStarRequests_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroExtendMsg.C2S_OneKeyHeroUpdateStar_13221.alwaysUseFieldBuilders) {
               this.getUpStarRequestsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.upStarRequestsBuilder_ == null) {
               this.upStarRequests_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.upStarRequestsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_OneKeyHeroUpdateStar_13221_descriptor;
         }

         public C2S_OneKeyHeroUpdateStar_13221 getDefaultInstanceForType() {
            return HeroExtendMsg.C2S_OneKeyHeroUpdateStar_13221.getDefaultInstance();
         }

         public C2S_OneKeyHeroUpdateStar_13221 build() {
            C2S_OneKeyHeroUpdateStar_13221 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OneKeyHeroUpdateStar_13221 buildPartial() {
            C2S_OneKeyHeroUpdateStar_13221 result = new C2S_OneKeyHeroUpdateStar_13221(this);
            int from_bitField0_ = this.bitField0_;
            if (this.upStarRequestsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.upStarRequests_ = Collections.unmodifiableList(this.upStarRequests_);
                  this.bitField0_ &= -2;
               }

               result.upStarRequests_ = this.upStarRequests_;
            } else {
               result.upStarRequests_ = this.upStarRequestsBuilder_.build();
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
            if (other instanceof C2S_OneKeyHeroUpdateStar_13221) {
               return this.mergeFrom((C2S_OneKeyHeroUpdateStar_13221)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OneKeyHeroUpdateStar_13221 other) {
            if (other == HeroExtendMsg.C2S_OneKeyHeroUpdateStar_13221.getDefaultInstance()) {
               return this;
            } else {
               if (this.upStarRequestsBuilder_ == null) {
                  if (!other.upStarRequests_.isEmpty()) {
                     if (this.upStarRequests_.isEmpty()) {
                        this.upStarRequests_ = other.upStarRequests_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureUpStarRequestsIsMutable();
                        this.upStarRequests_.addAll(other.upStarRequests_);
                     }

                     this.onChanged();
                  }
               } else if (!other.upStarRequests_.isEmpty()) {
                  if (this.upStarRequestsBuilder_.isEmpty()) {
                     this.upStarRequestsBuilder_.dispose();
                     this.upStarRequestsBuilder_ = null;
                     this.upStarRequests_ = other.upStarRequests_;
                     this.bitField0_ &= -2;
                     this.upStarRequestsBuilder_ = HeroExtendMsg.C2S_OneKeyHeroUpdateStar_13221.alwaysUseFieldBuilders ? this.getUpStarRequestsFieldBuilder() : null;
                  } else {
                     this.upStarRequestsBuilder_.addAllMessages(other.upStarRequests_);
                  }
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
            C2S_OneKeyHeroUpdateStar_13221 parsedMessage = null;

            try {
               parsedMessage = (C2S_OneKeyHeroUpdateStar_13221)HeroExtendMsg.C2S_OneKeyHeroUpdateStar_13221.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OneKeyHeroUpdateStar_13221)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureUpStarRequestsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.upStarRequests_ = new ArrayList(this.upStarRequests_);
               this.bitField0_ |= 1;
            }

         }

         public List<HeroUpdateStarRequest> getUpStarRequestsList() {
            return this.upStarRequestsBuilder_ == null ? Collections.unmodifiableList(this.upStarRequests_) : this.upStarRequestsBuilder_.getMessageList();
         }

         public int getUpStarRequestsCount() {
            return this.upStarRequestsBuilder_ == null ? this.upStarRequests_.size() : this.upStarRequestsBuilder_.getCount();
         }

         public HeroUpdateStarRequest getUpStarRequests(int index) {
            return this.upStarRequestsBuilder_ == null ? (HeroUpdateStarRequest)this.upStarRequests_.get(index) : (HeroUpdateStarRequest)this.upStarRequestsBuilder_.getMessage(index);
         }

         public Builder setUpStarRequests(int index, HeroUpdateStarRequest value) {
            if (this.upStarRequestsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureUpStarRequestsIsMutable();
               this.upStarRequests_.set(index, value);
               this.onChanged();
            } else {
               this.upStarRequestsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setUpStarRequests(int index, HeroUpdateStarRequest.Builder builderForValue) {
            if (this.upStarRequestsBuilder_ == null) {
               this.ensureUpStarRequestsIsMutable();
               this.upStarRequests_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.upStarRequestsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addUpStarRequests(HeroUpdateStarRequest value) {
            if (this.upStarRequestsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureUpStarRequestsIsMutable();
               this.upStarRequests_.add(value);
               this.onChanged();
            } else {
               this.upStarRequestsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addUpStarRequests(int index, HeroUpdateStarRequest value) {
            if (this.upStarRequestsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureUpStarRequestsIsMutable();
               this.upStarRequests_.add(index, value);
               this.onChanged();
            } else {
               this.upStarRequestsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addUpStarRequests(HeroUpdateStarRequest.Builder builderForValue) {
            if (this.upStarRequestsBuilder_ == null) {
               this.ensureUpStarRequestsIsMutable();
               this.upStarRequests_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.upStarRequestsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addUpStarRequests(int index, HeroUpdateStarRequest.Builder builderForValue) {
            if (this.upStarRequestsBuilder_ == null) {
               this.ensureUpStarRequestsIsMutable();
               this.upStarRequests_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.upStarRequestsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllUpStarRequests(Iterable<? extends HeroUpdateStarRequest> values) {
            if (this.upStarRequestsBuilder_ == null) {
               this.ensureUpStarRequestsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.upStarRequests_);
               this.onChanged();
            } else {
               this.upStarRequestsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearUpStarRequests() {
            if (this.upStarRequestsBuilder_ == null) {
               this.upStarRequests_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.upStarRequestsBuilder_.clear();
            }

            return this;
         }

         public Builder removeUpStarRequests(int index) {
            if (this.upStarRequestsBuilder_ == null) {
               this.ensureUpStarRequestsIsMutable();
               this.upStarRequests_.remove(index);
               this.onChanged();
            } else {
               this.upStarRequestsBuilder_.remove(index);
            }

            return this;
         }

         public HeroUpdateStarRequest.Builder getUpStarRequestsBuilder(int index) {
            return (HeroUpdateStarRequest.Builder)this.getUpStarRequestsFieldBuilder().getBuilder(index);
         }

         public HeroUpdateStarRequestOrBuilder getUpStarRequestsOrBuilder(int index) {
            return this.upStarRequestsBuilder_ == null ? (HeroUpdateStarRequestOrBuilder)this.upStarRequests_.get(index) : (HeroUpdateStarRequestOrBuilder)this.upStarRequestsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HeroUpdateStarRequestOrBuilder> getUpStarRequestsOrBuilderList() {
            return this.upStarRequestsBuilder_ != null ? this.upStarRequestsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.upStarRequests_);
         }

         public HeroUpdateStarRequest.Builder addUpStarRequestsBuilder() {
            return (HeroUpdateStarRequest.Builder)this.getUpStarRequestsFieldBuilder().addBuilder(HeroExtendMsg.HeroUpdateStarRequest.getDefaultInstance());
         }

         public HeroUpdateStarRequest.Builder addUpStarRequestsBuilder(int index) {
            return (HeroUpdateStarRequest.Builder)this.getUpStarRequestsFieldBuilder().addBuilder(index, HeroExtendMsg.HeroUpdateStarRequest.getDefaultInstance());
         }

         public List<HeroUpdateStarRequest.Builder> getUpStarRequestsBuilderList() {
            return this.getUpStarRequestsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HeroUpdateStarRequest, HeroUpdateStarRequest.Builder, HeroUpdateStarRequestOrBuilder> getUpStarRequestsFieldBuilder() {
            if (this.upStarRequestsBuilder_ == null) {
               this.upStarRequestsBuilder_ = new RepeatedFieldBuilderV3(this.upStarRequests_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.upStarRequests_ = null;
            }

            return this.upStarRequestsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_OneKeyHeroUpdateStarResult_13222 extends GeneratedMessageV3 implements S2C_OneKeyHeroUpdateStarResult_13222OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      public static final int CODE_FIELD_NUMBER = 2;
      private Internal.IntList code_;
      private byte memoizedIsInitialized;
      private static final S2C_OneKeyHeroUpdateStarResult_13222 DEFAULT_INSTANCE = new S2C_OneKeyHeroUpdateStarResult_13222();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OneKeyHeroUpdateStarResult_13222> PARSER = new AbstractParser<S2C_OneKeyHeroUpdateStarResult_13222>() {
         public S2C_OneKeyHeroUpdateStarResult_13222 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OneKeyHeroUpdateStarResult_13222(input, extensionRegistry);
         }
      };

      private S2C_OneKeyHeroUpdateStarResult_13222(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OneKeyHeroUpdateStarResult_13222() {
         this.memoizedIsInitialized = -1;
         this.code_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OneKeyHeroUpdateStarResult_13222();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OneKeyHeroUpdateStarResult_13222(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.code_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.code_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.code_ = newIntList();
                           mutable_bitField0_ |= 2;
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
               if ((mutable_bitField0_ & 2) != 0) {
                  this.code_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_OneKeyHeroUpdateStarResult_13222_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_OneKeyHeroUpdateStarResult_13222_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OneKeyHeroUpdateStarResult_13222.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResult() {
         return this.result_;
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
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.result_);
            }

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
         } else if (!(obj instanceof S2C_OneKeyHeroUpdateStarResult_13222)) {
            return super.equals(obj);
         } else {
            S2C_OneKeyHeroUpdateStarResult_13222 other = (S2C_OneKeyHeroUpdateStarResult_13222)obj;
            if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.getResult() != other.getResult()) {
               return false;
            } else if (!this.getCodeList().equals(other.getCodeList())) {
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

            if (this.getCodeCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCodeList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OneKeyHeroUpdateStarResult_13222 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OneKeyHeroUpdateStarResult_13222)PARSER.parseFrom(data);
      }

      public static S2C_OneKeyHeroUpdateStarResult_13222 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OneKeyHeroUpdateStarResult_13222)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OneKeyHeroUpdateStarResult_13222 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OneKeyHeroUpdateStarResult_13222)PARSER.parseFrom(data);
      }

      public static S2C_OneKeyHeroUpdateStarResult_13222 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OneKeyHeroUpdateStarResult_13222)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OneKeyHeroUpdateStarResult_13222 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OneKeyHeroUpdateStarResult_13222)PARSER.parseFrom(data);
      }

      public static S2C_OneKeyHeroUpdateStarResult_13222 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OneKeyHeroUpdateStarResult_13222)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OneKeyHeroUpdateStarResult_13222 parseFrom(InputStream input) throws IOException {
         return (S2C_OneKeyHeroUpdateStarResult_13222)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OneKeyHeroUpdateStarResult_13222 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OneKeyHeroUpdateStarResult_13222)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OneKeyHeroUpdateStarResult_13222 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OneKeyHeroUpdateStarResult_13222)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OneKeyHeroUpdateStarResult_13222 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OneKeyHeroUpdateStarResult_13222)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OneKeyHeroUpdateStarResult_13222 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OneKeyHeroUpdateStarResult_13222)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OneKeyHeroUpdateStarResult_13222 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OneKeyHeroUpdateStarResult_13222)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OneKeyHeroUpdateStarResult_13222 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OneKeyHeroUpdateStarResult_13222 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OneKeyHeroUpdateStarResult_13222> parser() {
         return PARSER;
      }

      public Parser<S2C_OneKeyHeroUpdateStarResult_13222> getParserForType() {
         return PARSER;
      }

      public S2C_OneKeyHeroUpdateStarResult_13222 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OneKeyHeroUpdateStarResult_13222OrBuilder {
         private int bitField0_;
         private int result_;
         private Internal.IntList code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_OneKeyHeroUpdateStarResult_13222_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_OneKeyHeroUpdateStarResult_13222_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OneKeyHeroUpdateStarResult_13222.class, Builder.class);
         }

         private Builder() {
            this.code_ = HeroExtendMsg.S2C_OneKeyHeroUpdateStarResult_13222.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.code_ = HeroExtendMsg.S2C_OneKeyHeroUpdateStarResult_13222.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroExtendMsg.S2C_OneKeyHeroUpdateStarResult_13222.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            this.code_ = HeroExtendMsg.S2C_OneKeyHeroUpdateStarResult_13222.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_OneKeyHeroUpdateStarResult_13222_descriptor;
         }

         public S2C_OneKeyHeroUpdateStarResult_13222 getDefaultInstanceForType() {
            return HeroExtendMsg.S2C_OneKeyHeroUpdateStarResult_13222.getDefaultInstance();
         }

         public S2C_OneKeyHeroUpdateStarResult_13222 build() {
            S2C_OneKeyHeroUpdateStarResult_13222 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OneKeyHeroUpdateStarResult_13222 buildPartial() {
            S2C_OneKeyHeroUpdateStarResult_13222 result = new S2C_OneKeyHeroUpdateStarResult_13222(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.result_ = this.result_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.code_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.code_ = this.code_;
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
            if (other instanceof S2C_OneKeyHeroUpdateStarResult_13222) {
               return this.mergeFrom((S2C_OneKeyHeroUpdateStarResult_13222)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OneKeyHeroUpdateStarResult_13222 other) {
            if (other == HeroExtendMsg.S2C_OneKeyHeroUpdateStarResult_13222.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               if (!other.code_.isEmpty()) {
                  if (this.code_.isEmpty()) {
                     this.code_ = other.code_;
                     this.bitField0_ &= -3;
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
            return this.hasResult();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OneKeyHeroUpdateStarResult_13222 parsedMessage = null;

            try {
               parsedMessage = (S2C_OneKeyHeroUpdateStarResult_13222)HeroExtendMsg.S2C_OneKeyHeroUpdateStarResult_13222.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OneKeyHeroUpdateStarResult_13222)e.getUnfinishedMessage();
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

         private void ensureCodeIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.code_ = HeroExtendMsg.S2C_OneKeyHeroUpdateStarResult_13222.mutableCopy(this.code_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getCodeList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.code_) : this.code_);
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
            this.code_ = HeroExtendMsg.S2C_OneKeyHeroUpdateStarResult_13222.emptyIntList();
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

   public static final class C2S_UpdateFriendHeroJob_13223 extends GeneratedMessageV3 implements C2S_UpdateFriendHeroJob_13223OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ARRAYINGTYPE_FIELD_NUMBER = 1;
      private int arrayingType_;
      public static final int FRIENDJOB_FIELD_NUMBER = 2;
      private int friendJob_;
      private byte memoizedIsInitialized;
      private static final C2S_UpdateFriendHeroJob_13223 DEFAULT_INSTANCE = new C2S_UpdateFriendHeroJob_13223();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UpdateFriendHeroJob_13223> PARSER = new AbstractParser<C2S_UpdateFriendHeroJob_13223>() {
         public C2S_UpdateFriendHeroJob_13223 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UpdateFriendHeroJob_13223(input, extensionRegistry);
         }
      };

      private C2S_UpdateFriendHeroJob_13223(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UpdateFriendHeroJob_13223() {
         this.memoizedIsInitialized = -1;
         this.arrayingType_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UpdateFriendHeroJob_13223();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UpdateFriendHeroJob_13223(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CommonMsg.HeroState value = CommonMsg.HeroState.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.arrayingType_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.friendJob_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroJob_13223_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroJob_13223_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UpdateFriendHeroJob_13223.class, Builder.class);
      }

      public boolean hasArrayingType() {
         return (this.bitField0_ & 1) != 0;
      }

      public CommonMsg.HeroState getArrayingType() {
         CommonMsg.HeroState result = CommonMsg.HeroState.valueOf(this.arrayingType_);
         return result == null ? CommonMsg.HeroState.HERO_STATE_ARRAYING : result;
      }

      public boolean hasFriendJob() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getFriendJob() {
         return this.friendJob_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasArrayingType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFriendJob()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.arrayingType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.friendJob_);
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
               size += CodedOutputStream.computeEnumSize(1, this.arrayingType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.friendJob_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_UpdateFriendHeroJob_13223)) {
            return super.equals(obj);
         } else {
            C2S_UpdateFriendHeroJob_13223 other = (C2S_UpdateFriendHeroJob_13223)obj;
            if (this.hasArrayingType() != other.hasArrayingType()) {
               return false;
            } else if (this.hasArrayingType() && this.arrayingType_ != other.arrayingType_) {
               return false;
            } else if (this.hasFriendJob() != other.hasFriendJob()) {
               return false;
            } else if (this.hasFriendJob() && this.getFriendJob() != other.getFriendJob()) {
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
            if (this.hasArrayingType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.arrayingType_;
            }

            if (this.hasFriendJob()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getFriendJob();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_UpdateFriendHeroJob_13223 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UpdateFriendHeroJob_13223)PARSER.parseFrom(data);
      }

      public static C2S_UpdateFriendHeroJob_13223 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpdateFriendHeroJob_13223)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpdateFriendHeroJob_13223 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UpdateFriendHeroJob_13223)PARSER.parseFrom(data);
      }

      public static C2S_UpdateFriendHeroJob_13223 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpdateFriendHeroJob_13223)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpdateFriendHeroJob_13223 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UpdateFriendHeroJob_13223)PARSER.parseFrom(data);
      }

      public static C2S_UpdateFriendHeroJob_13223 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpdateFriendHeroJob_13223)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpdateFriendHeroJob_13223 parseFrom(InputStream input) throws IOException {
         return (C2S_UpdateFriendHeroJob_13223)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UpdateFriendHeroJob_13223 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpdateFriendHeroJob_13223)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UpdateFriendHeroJob_13223 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UpdateFriendHeroJob_13223)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UpdateFriendHeroJob_13223 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpdateFriendHeroJob_13223)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UpdateFriendHeroJob_13223 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UpdateFriendHeroJob_13223)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UpdateFriendHeroJob_13223 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpdateFriendHeroJob_13223)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UpdateFriendHeroJob_13223 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UpdateFriendHeroJob_13223 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UpdateFriendHeroJob_13223> parser() {
         return PARSER;
      }

      public Parser<C2S_UpdateFriendHeroJob_13223> getParserForType() {
         return PARSER;
      }

      public C2S_UpdateFriendHeroJob_13223 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UpdateFriendHeroJob_13223OrBuilder {
         private int bitField0_;
         private int arrayingType_;
         private int friendJob_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroJob_13223_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroJob_13223_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UpdateFriendHeroJob_13223.class, Builder.class);
         }

         private Builder() {
            this.arrayingType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.arrayingType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroExtendMsg.C2S_UpdateFriendHeroJob_13223.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.arrayingType_ = 1;
            this.bitField0_ &= -2;
            this.friendJob_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_UpdateFriendHeroJob_13223_descriptor;
         }

         public C2S_UpdateFriendHeroJob_13223 getDefaultInstanceForType() {
            return HeroExtendMsg.C2S_UpdateFriendHeroJob_13223.getDefaultInstance();
         }

         public C2S_UpdateFriendHeroJob_13223 build() {
            C2S_UpdateFriendHeroJob_13223 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UpdateFriendHeroJob_13223 buildPartial() {
            C2S_UpdateFriendHeroJob_13223 result = new C2S_UpdateFriendHeroJob_13223(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.arrayingType_ = this.arrayingType_;
            if ((from_bitField0_ & 2) != 0) {
               result.friendJob_ = this.friendJob_;
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
            if (other instanceof C2S_UpdateFriendHeroJob_13223) {
               return this.mergeFrom((C2S_UpdateFriendHeroJob_13223)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UpdateFriendHeroJob_13223 other) {
            if (other == HeroExtendMsg.C2S_UpdateFriendHeroJob_13223.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasArrayingType()) {
                  this.setArrayingType(other.getArrayingType());
               }

               if (other.hasFriendJob()) {
                  this.setFriendJob(other.getFriendJob());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasArrayingType()) {
               return false;
            } else {
               return this.hasFriendJob();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_UpdateFriendHeroJob_13223 parsedMessage = null;

            try {
               parsedMessage = (C2S_UpdateFriendHeroJob_13223)HeroExtendMsg.C2S_UpdateFriendHeroJob_13223.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UpdateFriendHeroJob_13223)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasArrayingType() {
            return (this.bitField0_ & 1) != 0;
         }

         public CommonMsg.HeroState getArrayingType() {
            CommonMsg.HeroState result = CommonMsg.HeroState.valueOf(this.arrayingType_);
            return result == null ? CommonMsg.HeroState.HERO_STATE_ARRAYING : result;
         }

         public Builder setArrayingType(CommonMsg.HeroState value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.arrayingType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearArrayingType() {
            this.bitField0_ &= -2;
            this.arrayingType_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasFriendJob() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getFriendJob() {
            return this.friendJob_;
         }

         public Builder setFriendJob(int value) {
            this.bitField0_ |= 2;
            this.friendJob_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFriendJob() {
            this.bitField0_ &= -3;
            this.friendJob_ = 0;
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

   public static final class S2C_UpdateFriendHeroJob_13224 extends GeneratedMessageV3 implements S2C_UpdateFriendHeroJob_13224OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ARRAYINGTYPE_FIELD_NUMBER = 1;
      private int arrayingType_;
      public static final int FRIENDJOB_FIELD_NUMBER = 2;
      private int friendJob_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateFriendHeroJob_13224 DEFAULT_INSTANCE = new S2C_UpdateFriendHeroJob_13224();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateFriendHeroJob_13224> PARSER = new AbstractParser<S2C_UpdateFriendHeroJob_13224>() {
         public S2C_UpdateFriendHeroJob_13224 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateFriendHeroJob_13224(input, extensionRegistry);
         }
      };

      private S2C_UpdateFriendHeroJob_13224(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateFriendHeroJob_13224() {
         this.memoizedIsInitialized = -1;
         this.arrayingType_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateFriendHeroJob_13224();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateFriendHeroJob_13224(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CommonMsg.HeroState value = CommonMsg.HeroState.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.arrayingType_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.friendJob_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroJob_13224_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroJob_13224_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateFriendHeroJob_13224.class, Builder.class);
      }

      public boolean hasArrayingType() {
         return (this.bitField0_ & 1) != 0;
      }

      public CommonMsg.HeroState getArrayingType() {
         CommonMsg.HeroState result = CommonMsg.HeroState.valueOf(this.arrayingType_);
         return result == null ? CommonMsg.HeroState.HERO_STATE_ARRAYING : result;
      }

      public boolean hasFriendJob() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getFriendJob() {
         return this.friendJob_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasArrayingType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFriendJob()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.arrayingType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.friendJob_);
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
               size += CodedOutputStream.computeEnumSize(1, this.arrayingType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.friendJob_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpdateFriendHeroJob_13224)) {
            return super.equals(obj);
         } else {
            S2C_UpdateFriendHeroJob_13224 other = (S2C_UpdateFriendHeroJob_13224)obj;
            if (this.hasArrayingType() != other.hasArrayingType()) {
               return false;
            } else if (this.hasArrayingType() && this.arrayingType_ != other.arrayingType_) {
               return false;
            } else if (this.hasFriendJob() != other.hasFriendJob()) {
               return false;
            } else if (this.hasFriendJob() && this.getFriendJob() != other.getFriendJob()) {
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
            if (this.hasArrayingType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.arrayingType_;
            }

            if (this.hasFriendJob()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getFriendJob();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpdateFriendHeroJob_13224 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateFriendHeroJob_13224)PARSER.parseFrom(data);
      }

      public static S2C_UpdateFriendHeroJob_13224 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateFriendHeroJob_13224)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateFriendHeroJob_13224 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateFriendHeroJob_13224)PARSER.parseFrom(data);
      }

      public static S2C_UpdateFriendHeroJob_13224 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateFriendHeroJob_13224)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateFriendHeroJob_13224 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateFriendHeroJob_13224)PARSER.parseFrom(data);
      }

      public static S2C_UpdateFriendHeroJob_13224 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateFriendHeroJob_13224)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateFriendHeroJob_13224 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateFriendHeroJob_13224)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateFriendHeroJob_13224 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateFriendHeroJob_13224)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateFriendHeroJob_13224 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateFriendHeroJob_13224)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateFriendHeroJob_13224 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateFriendHeroJob_13224)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateFriendHeroJob_13224 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateFriendHeroJob_13224)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateFriendHeroJob_13224 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateFriendHeroJob_13224)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateFriendHeroJob_13224 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateFriendHeroJob_13224 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateFriendHeroJob_13224> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateFriendHeroJob_13224> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateFriendHeroJob_13224 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateFriendHeroJob_13224OrBuilder {
         private int bitField0_;
         private int arrayingType_;
         private int friendJob_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroJob_13224_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroJob_13224_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateFriendHeroJob_13224.class, Builder.class);
         }

         private Builder() {
            this.arrayingType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.arrayingType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroExtendMsg.S2C_UpdateFriendHeroJob_13224.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.arrayingType_ = 1;
            this.bitField0_ &= -2;
            this.friendJob_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_UpdateFriendHeroJob_13224_descriptor;
         }

         public S2C_UpdateFriendHeroJob_13224 getDefaultInstanceForType() {
            return HeroExtendMsg.S2C_UpdateFriendHeroJob_13224.getDefaultInstance();
         }

         public S2C_UpdateFriendHeroJob_13224 build() {
            S2C_UpdateFriendHeroJob_13224 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateFriendHeroJob_13224 buildPartial() {
            S2C_UpdateFriendHeroJob_13224 result = new S2C_UpdateFriendHeroJob_13224(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.arrayingType_ = this.arrayingType_;
            if ((from_bitField0_ & 2) != 0) {
               result.friendJob_ = this.friendJob_;
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
            if (other instanceof S2C_UpdateFriendHeroJob_13224) {
               return this.mergeFrom((S2C_UpdateFriendHeroJob_13224)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateFriendHeroJob_13224 other) {
            if (other == HeroExtendMsg.S2C_UpdateFriendHeroJob_13224.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasArrayingType()) {
                  this.setArrayingType(other.getArrayingType());
               }

               if (other.hasFriendJob()) {
                  this.setFriendJob(other.getFriendJob());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasArrayingType()) {
               return false;
            } else {
               return this.hasFriendJob();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UpdateFriendHeroJob_13224 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateFriendHeroJob_13224)HeroExtendMsg.S2C_UpdateFriendHeroJob_13224.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateFriendHeroJob_13224)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasArrayingType() {
            return (this.bitField0_ & 1) != 0;
         }

         public CommonMsg.HeroState getArrayingType() {
            CommonMsg.HeroState result = CommonMsg.HeroState.valueOf(this.arrayingType_);
            return result == null ? CommonMsg.HeroState.HERO_STATE_ARRAYING : result;
         }

         public Builder setArrayingType(CommonMsg.HeroState value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.arrayingType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearArrayingType() {
            this.bitField0_ &= -2;
            this.arrayingType_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasFriendJob() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getFriendJob() {
            return this.friendJob_;
         }

         public Builder setFriendJob(int value) {
            this.bitField0_ |= 2;
            this.friendJob_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFriendJob() {
            this.bitField0_ &= -3;
            this.friendJob_ = 0;
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

   public static final class C2S_HeroInfo_13225 extends GeneratedMessageV3 implements C2S_HeroInfo_13225OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int CODE_FIELD_NUMBER = 2;
      private int code_;
      public static final int SERVERID_FIELD_NUMBER = 3;
      private int serverId_;
      private byte memoizedIsInitialized;
      private static final C2S_HeroInfo_13225 DEFAULT_INSTANCE = new C2S_HeroInfo_13225();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HeroInfo_13225> PARSER = new AbstractParser<C2S_HeroInfo_13225>() {
         public C2S_HeroInfo_13225 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HeroInfo_13225(input, extensionRegistry);
         }
      };

      private C2S_HeroInfo_13225(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HeroInfo_13225() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HeroInfo_13225();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HeroInfo_13225(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.code_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.serverId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_HeroInfo_13225_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_HeroInfo_13225_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroInfo_13225.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getServerId() {
         return this.serverId_;
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
         } else if (!this.hasCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasServerId()) {
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
            output.writeInt32(2, this.code_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.serverId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.code_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.serverId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_HeroInfo_13225)) {
            return super.equals(obj);
         } else {
            C2S_HeroInfo_13225 other = (C2S_HeroInfo_13225)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
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

            if (this.hasCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCode();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getServerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_HeroInfo_13225 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HeroInfo_13225)PARSER.parseFrom(data);
      }

      public static C2S_HeroInfo_13225 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroInfo_13225)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroInfo_13225 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HeroInfo_13225)PARSER.parseFrom(data);
      }

      public static C2S_HeroInfo_13225 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroInfo_13225)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroInfo_13225 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HeroInfo_13225)PARSER.parseFrom(data);
      }

      public static C2S_HeroInfo_13225 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroInfo_13225)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroInfo_13225 parseFrom(InputStream input) throws IOException {
         return (C2S_HeroInfo_13225)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroInfo_13225 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroInfo_13225)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroInfo_13225 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HeroInfo_13225)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HeroInfo_13225 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroInfo_13225)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroInfo_13225 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HeroInfo_13225)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroInfo_13225 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroInfo_13225)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HeroInfo_13225 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HeroInfo_13225 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HeroInfo_13225> parser() {
         return PARSER;
      }

      public Parser<C2S_HeroInfo_13225> getParserForType() {
         return PARSER;
      }

      public C2S_HeroInfo_13225 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HeroInfo_13225OrBuilder {
         private int bitField0_;
         private int playerId_;
         private int code_;
         private int serverId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_HeroInfo_13225_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_HeroInfo_13225_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroInfo_13225.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroExtendMsg.C2S_HeroInfo_13225.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.bitField0_ &= -3;
            this.serverId_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_C2S_HeroInfo_13225_descriptor;
         }

         public C2S_HeroInfo_13225 getDefaultInstanceForType() {
            return HeroExtendMsg.C2S_HeroInfo_13225.getDefaultInstance();
         }

         public C2S_HeroInfo_13225 build() {
            C2S_HeroInfo_13225 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HeroInfo_13225 buildPartial() {
            C2S_HeroInfo_13225 result = new C2S_HeroInfo_13225(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.serverId_ = this.serverId_;
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
            if (other instanceof C2S_HeroInfo_13225) {
               return this.mergeFrom((C2S_HeroInfo_13225)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HeroInfo_13225 other) {
            if (other == HeroExtendMsg.C2S_HeroInfo_13225.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasCode()) {
               return false;
            } else {
               return this.hasServerId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_HeroInfo_13225 parsedMessage = null;

            try {
               parsedMessage = (C2S_HeroInfo_13225)HeroExtendMsg.C2S_HeroInfo_13225.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HeroInfo_13225)e.getUnfinishedMessage();
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

         public boolean hasServerId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 4;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -5;
            this.serverId_ = 0;
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

   public static final class S2C_HeroInfo_13226 extends GeneratedMessageV3 implements S2C_HeroInfo_13226OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROINFO_FIELD_NUMBER = 1;
      private CommonMsg.HeroInfo heroInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_HeroInfo_13226 DEFAULT_INSTANCE = new S2C_HeroInfo_13226();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HeroInfo_13226> PARSER = new AbstractParser<S2C_HeroInfo_13226>() {
         public S2C_HeroInfo_13226 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HeroInfo_13226(input, extensionRegistry);
         }
      };

      private S2C_HeroInfo_13226(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HeroInfo_13226() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HeroInfo_13226();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HeroInfo_13226(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_HeroInfo_13226_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_HeroInfo_13226_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroInfo_13226.class, Builder.class);
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
         } else if (!(obj instanceof S2C_HeroInfo_13226)) {
            return super.equals(obj);
         } else {
            S2C_HeroInfo_13226 other = (S2C_HeroInfo_13226)obj;
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

      public static S2C_HeroInfo_13226 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HeroInfo_13226)PARSER.parseFrom(data);
      }

      public static S2C_HeroInfo_13226 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroInfo_13226)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroInfo_13226 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HeroInfo_13226)PARSER.parseFrom(data);
      }

      public static S2C_HeroInfo_13226 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroInfo_13226)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroInfo_13226 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HeroInfo_13226)PARSER.parseFrom(data);
      }

      public static S2C_HeroInfo_13226 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroInfo_13226)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroInfo_13226 parseFrom(InputStream input) throws IOException {
         return (S2C_HeroInfo_13226)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroInfo_13226 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroInfo_13226)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroInfo_13226 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HeroInfo_13226)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HeroInfo_13226 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroInfo_13226)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroInfo_13226 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HeroInfo_13226)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroInfo_13226 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroInfo_13226)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HeroInfo_13226 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HeroInfo_13226 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HeroInfo_13226> parser() {
         return PARSER;
      }

      public Parser<S2C_HeroInfo_13226> getParserForType() {
         return PARSER;
      }

      public S2C_HeroInfo_13226 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HeroInfo_13226OrBuilder {
         private int bitField0_;
         private CommonMsg.HeroInfo heroInfo_;
         private SingleFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> heroInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_HeroInfo_13226_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_HeroInfo_13226_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroInfo_13226.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (HeroExtendMsg.S2C_HeroInfo_13226.alwaysUseFieldBuilders) {
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
            return HeroExtendMsg.internal_static_heroExtend_com_gzbz_protobuf_S2C_HeroInfo_13226_descriptor;
         }

         public S2C_HeroInfo_13226 getDefaultInstanceForType() {
            return HeroExtendMsg.S2C_HeroInfo_13226.getDefaultInstance();
         }

         public S2C_HeroInfo_13226 build() {
            S2C_HeroInfo_13226 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HeroInfo_13226 buildPartial() {
            S2C_HeroInfo_13226 result = new S2C_HeroInfo_13226(this);
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
            if (other instanceof S2C_HeroInfo_13226) {
               return this.mergeFrom((S2C_HeroInfo_13226)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HeroInfo_13226 other) {
            if (other == HeroExtendMsg.S2C_HeroInfo_13226.getDefaultInstance()) {
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
            S2C_HeroInfo_13226 parsedMessage = null;

            try {
               parsedMessage = (S2C_HeroInfo_13226)HeroExtendMsg.S2C_HeroInfo_13226.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HeroInfo_13226)e.getUnfinishedMessage();
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

   public interface C2S_HeroExchangeEquip_13215OrBuilder extends MessageOrBuilder {
      boolean hasMainHeroCode();

      int getMainHeroCode();

      boolean hasSlaveHeroCode();

      int getSlaveHeroCode();

      boolean hasPosition();

      int getPosition();
   }

   public interface C2S_HeroInfo_13225OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasCode();

      int getCode();

      boolean hasServerId();

      int getServerId();
   }

   public interface C2S_HideArraying_13217OrBuilder extends MessageOrBuilder {
      boolean hasArrayingType();

      CommonMsg.HeroState getArrayingType();

      boolean hasIsHide();

      boolean getIsHide();
   }

   public interface C2S_OneKeyHeroUpdateStar_13221OrBuilder extends MessageOrBuilder {
      List<HeroUpdateStarRequest> getUpStarRequestsList();

      HeroUpdateStarRequest getUpStarRequests(int index);

      int getUpStarRequestsCount();

      List<? extends HeroUpdateStarRequestOrBuilder> getUpStarRequestsOrBuilderList();

      HeroUpdateStarRequestOrBuilder getUpStarRequestsOrBuilder(int index);
   }

   public interface C2S_OpenHeroBagUi_13203OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OpenHeroRankUi_13201OrBuilder extends MessageOrBuilder {
      boolean hasHeroId();

      int getHeroId();
   }

   public interface C2S_SaveArraying_13219OrBuilder extends MessageOrBuilder {
      boolean hasSystemId();

      int getSystemId();

      List<HeroMsg.ArrayingList> getArrayingInfoList();

      HeroMsg.ArrayingList getArrayingInfo(int index);

      int getArrayingInfoCount();

      List<? extends HeroMsg.ArrayingListOrBuilder> getArrayingInfoOrBuilderList();

      HeroMsg.ArrayingListOrBuilder getArrayingInfoOrBuilder(int index);

      boolean hasForce();

      boolean getForce();
   }

   public interface C2S_UpdateFriendHeroJob_13223OrBuilder extends MessageOrBuilder {
      boolean hasArrayingType();

      CommonMsg.HeroState getArrayingType();

      boolean hasFriendJob();

      int getFriendJob();
   }

   public interface C2S_UpdateFriendHeroNation_13213OrBuilder extends MessageOrBuilder {
      boolean hasArrayingType();

      CommonMsg.HeroState getArrayingType();

      boolean hasFriendNation();

      int getFriendNation();
   }

   public interface C2S_UpdateFriendHeroState_13211OrBuilder extends MessageOrBuilder {
      boolean hasArrayingType();

      CommonMsg.HeroState getArrayingType();

      boolean hasFriendState();

      int getFriendState();
   }

   public interface HeroRankInfoOrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasPlayerInfo();

      CommonMsg.PlayerInfo getPlayerInfo();

      CommonMsg.PlayerInfoOrBuilder getPlayerInfoOrBuilder();

      boolean hasHeroInfo();

      CommonMsg.HeroInfo getHeroInfo();

      CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder();
   }

   public interface HeroUpdateStarRequestOrBuilder extends MessageOrBuilder {
      List<HeroMsg.MaterHeroList> getGridsList();

      HeroMsg.MaterHeroList getGrids(int index);

      int getGridsCount();

      List<? extends HeroMsg.MaterHeroListOrBuilder> getGridsOrBuilderList();

      HeroMsg.MaterHeroListOrBuilder getGridsOrBuilder(int index);
   }

   public interface S2C_HeroExchangeEquip_13216OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasMainHeroCode();

      int getMainHeroCode();
   }

   public interface S2C_HeroInfo_13226OrBuilder extends MessageOrBuilder {
      boolean hasHeroInfo();

      CommonMsg.HeroInfo getHeroInfo();

      CommonMsg.HeroInfoOrBuilder getHeroInfoOrBuilder();
   }

   public interface S2C_HideArraying_13218OrBuilder extends MessageOrBuilder {
      boolean hasArrayingType();

      CommonMsg.HeroState getArrayingType();

      boolean hasIsHide();

      boolean getIsHide();
   }

   public interface S2C_OneKeyHeroUpdateStarResult_13222OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      List<Integer> getCodeList();

      int getCodeCount();

      int getCode(int index);
   }

   public interface S2C_OpenHeroBagUi_13204OrBuilder extends MessageOrBuilder {
      List<CommonMsg.MapDataII> getRanksList();

      CommonMsg.MapDataII getRanks(int index);

      int getRanksCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getRanksOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getRanksOrBuilder(int index);
   }

   public interface S2C_OpenHeroRankUi_13202OrBuilder extends MessageOrBuilder {
      List<HeroRankInfo> getInfosList();

      HeroRankInfo getInfos(int index);

      int getInfosCount();

      List<? extends HeroRankInfoOrBuilder> getInfosOrBuilderList();

      HeroRankInfoOrBuilder getInfosOrBuilder(int index);
   }

   public interface S2C_SaveArraying_13220OrBuilder extends MessageOrBuilder {
      boolean hasSystemId();

      int getSystemId();

      List<HeroMsg.ArrayingList> getArrayingInfoList();

      HeroMsg.ArrayingList getArrayingInfo(int index);

      int getArrayingInfoCount();

      List<? extends HeroMsg.ArrayingListOrBuilder> getArrayingInfoOrBuilderList();

      HeroMsg.ArrayingListOrBuilder getArrayingInfoOrBuilder(int index);

      boolean hasForce();

      boolean getForce();
   }

   public interface S2C_UpdateFriendHeroJob_13224OrBuilder extends MessageOrBuilder {
      boolean hasArrayingType();

      CommonMsg.HeroState getArrayingType();

      boolean hasFriendJob();

      int getFriendJob();
   }

   public interface S2C_UpdateFriendHeroNation_13214OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasArrayingType();

      CommonMsg.HeroState getArrayingType();

      boolean hasFriendNation();

      int getFriendNation();
   }

   public interface S2C_UpdateFriendHeroState_13212OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();

      boolean hasArrayingType();

      CommonMsg.HeroState getArrayingType();

      boolean hasFriendState();

      int getFriendState();
   }
}
