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

public final class ExclusiveTreasureMsg {
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_TreasureInfo_5500_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_TreasureInfo_5500_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_ActivationTreasure_5501_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_ActivationTreasure_5501_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_ActivationTreasure_5502_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_ActivationTreasure_5502_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_ExclusiveTreasureInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_ExclusiveTreasureInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_RecastTreasure_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_RecastTreasure_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UndressTreasureStone_5503_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UndressTreasureStone_5503_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UndressTreasureStone_5504_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UndressTreasureStone_5504_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_WearTreasureStone_5505_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_WearTreasureStone_5505_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_WearTreasureStone_5506_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_WearTreasureStone_5506_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_RecastTreasure_5507_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_RecastTreasure_5507_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_RecastTreasure_5508_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_RecastTreasure_5508_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_SaveRecast_5509_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_SaveRecast_5509_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_SaveRecast_5510_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_SaveRecast_5510_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UpLev_5511_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UpLev_5511_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UpLev_5512_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UpLev_5512_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UpStar_5513_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UpStar_5513_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UpStar_5514_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UpStar_5514_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_ComposeStone_5515_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_ComposeStone_5515_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_ComposeStone_5516_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_ComposeStone_5516_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_TreasureStoneInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_TreasureStoneInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneSell_5517_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneSell_5517_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneSell_5518_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneSell_5518_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_Reset_5519_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_Reset_5519_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_Reset_5520_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_Reset_5520_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneExchange_5521_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneExchange_5521_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneExchange_5522_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneExchange_5522_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StrengthStone_5523_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StrengthStone_5523_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StrengthStone_5524_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StrengthStone_5524_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StrengthHeroStone_5525_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StrengthHeroStone_5525_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StrengthHeroStone_5526_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StrengthHeroStone_5526_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneHeroExchange_5527_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneHeroExchange_5527_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneHeroExchange_5528_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneHeroExchange_5528_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private ExclusiveTreasureMsg() {
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
      String[] descriptorData = new String[]{"\n\u0017ExclusiveTreasure.proto\u0012#ExclusiveTreasure.com.gzbz.protobuf\u001a\fcommon.proto\")\n\u0015C2S_TreasureInfo_5500\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\"]\n\u001bC2S_ActivationTreasure_5501\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012\u0014\n\fsameHeroCode\u0018\u0002 \u0002(\u0005\u0012\u0016\n\u000esameNationCode\u0018\u0003 \u0002(\u0005\"\u0081\u0001\n\u001bS2C_ActivationTreasure_5502\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012P\n\ftreasureInfo\u0018\u0002 \u0001(\u000b2:.ExclusiveTreasure.com.gzbz.protobuf.ExclusiveTreasureInfo\"þ\u0001\n\u0015ExclusiveTreasureInfo\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003lev\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004star\u0018\u0003 \u0002(\u0005\u0012I\n\fbaseTreasure\u0018\u0005 \u0002(\u000b23.ExclusiveTreasure.com.gzbz.protobuf.RecastTreasure\u0012C\n\u0006recast\u0018\u0006 \u0001(\u000b23.ExclusiveTreasure.com.gzbz.protobuf.RecastTreasure\u0012(\n\tstoneInfo\u0018\u0007 \u0003(\u000b2\u0015.common.TreasureStone\"]\n\u000eRecastTreasure\u0012\u0012\n\nextraProId\u0018\u0001 \u0002(\u0005\u0012\u0012\n\ncondition1\u0018\u0002 \u0002(\u0005\u0012\u0012\n\ncondition2\u0018\u0003 \u0002(\u0005\u0012\u000f\n\u0007extraId\u0018\u0004 \u0002(\u0005\"Z\n\u001dC2S_UndressTreasureStone_5503\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012'\n\bposition\u0018\u0002 \u0002(\u000e2\u0015.common.StonePosition\"¬\u0001\n\u001dS2C_UndressTreasureStone_5504\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012'\n\bposition\u0018\u0002 \u0002(\u000e2\u0015.common.StonePosition\u0012P\n\ftreasureInfo\u0018\u0003 \u0002(\u000b2:.ExclusiveTreasure.com.gzbz.protobuf.ExclusiveTreasureInfo\"i\n\u001aC2S_WearTreasureStone_5505\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012'\n\bposition\u0018\u0002 \u0002(\u000e2\u0015.common.StonePosition\u0012\u0010\n\bitemCode\u0018\u0003 \u0002(\u0005\"©\u0001\n\u001aS2C_WearTreasureStone_5506\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012'\n\bposition\u0018\u0002 \u0002(\u000e2\u0015.common.StonePosition\u0012P\n\ftreasureInfo\u0018\u0003 \u0002(\u000b2:.ExclusiveTreasure.com.gzbz.protobuf.ExclusiveTreasureInfo\";\n\u0017C2S_RecastTreasure_5507\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006unLock\u0018\u0002 \u0002(\u0005\"\u0080\u0001\n\u0017S2C_RecastTreasure_5508\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006unLock\u0018\u0002 \u0002(\u0005\u0012C\n\u0006recast\u0018\u0003 \u0001(\u000b23.ExclusiveTreasure.com.gzbz.protobuf.RecastTreasure\"'\n\u0013C2S_SaveRecast_5509\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\"·\u0001\n\u0013S2C_SaveRecast_5510\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012I\n\fbaseTreasure\u0018\u0002 \u0002(\u000b23.ExclusiveTreasure.com.gzbz.protobuf.RecastTreasure\u0012C\n\u0006recast\u0018\u0003 \u0001(\u000b23.ExclusiveTreasure.com.gzbz.protobuf.RecastTreasure\"\"\n\u000eC2S_UpLev_5511\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\"t\n\u000eS2C_UpLev_5512\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012P\n\ftreasureInfo\u0018\u0003 \u0002(\u000b2:.ExclusiveTreasure.com.gzbz.protobuf.ExclusiveTreasureInfo\"#\n\u000fC2S_UpStar_5513\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\"u\n\u000fS2C_UpStar_5514\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012P\n\ftreasureInfo\u0018\u0003 \u0002(\u000b2:.ExclusiveTreasure.com.gzbz.protobuf.ExclusiveTreasureInfo\";\n\u0015C2S_ComposeStone_5515\u0012\u0010\n\bitemCode\u0018\u0001 \u0003(\u0005\u0012\u0010\n\btargetId\u0018\u0002 \u0002(\u0005\"'\n\u0015S2C_ComposeStone_5516\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"-\n\u0011TreasureStoneInfo\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004code\u0018\u0003 \u0002(\u0005\"&\n\u0012C2S_StoneSell_5517\u0012\u0010\n\bitemCode\u0018\u0001 \u0003(\u0005\"$\n\u0012S2C_StoneSell_5518\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"\"\n\u000eC2S_Reset_5519\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\" \n\u000eS2C_Reset_5520\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"<\n\u0016C2S_StoneExchange_5521\u0012\u0010\n\bitemCode\u0018\u0001 \u0003(\u0005\u0012\u0010\n\btargetId\u0018\u0002 \u0002(\u0005\"(\n\u0016S2C_StoneExchange_5522\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"<\n\u0016C2S_StrengthStone_5523\u0012\u0010\n\bitemCode\u0018\u0001 \u0002(\u0005\u0012\u0010\n\btargetId\u0018\u0002 \u0002(\u0005\"(\n\u0016S2C_StrengthStone_5524\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"i\n\u001aC2S_StrengthHeroStone_5525\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012'\n\bposition\u0018\u0002 \u0002(\u000e2\u0015.common.StonePosition\u0012\u0010\n\btargetId\u0018\u0003 \u0002(\u0005\"X\n\u001aS2C_StrengthHeroStone_5526\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012(\n\tstoneInfo\u0018\u0007 \u0002(\u000b2\u0015.common.TreasureStone\"i\n\u001aC2S_StoneHeroExchange_5527\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012'\n\bposition\u0018\u0002 \u0002(\u000e2\u0015.common.StonePosition\u0012\u0010\n\btargetId\u0018\u0003 \u0002(\u0005\"X\n\u001aS2C_StoneHeroExchange_5528\u0012\u0010\n\bheroCode\u0018\u0001 \u0002(\u0005\u0012(\n\tstoneInfo\u0018\u0007 \u0002(\u000b2\u0015.common.TreasureStoneB+\n\u0011com.gzbz.protobufB\u0014ExclusiveTreasureMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_TreasureInfo_5500_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_TreasureInfo_5500_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_TreasureInfo_5500_descriptor, new String[]{"HeroCode"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_ActivationTreasure_5501_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_ActivationTreasure_5501_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_ActivationTreasure_5501_descriptor, new String[]{"HeroCode", "SameHeroCode", "SameNationCode"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_ActivationTreasure_5502_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_ActivationTreasure_5502_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_ActivationTreasure_5502_descriptor, new String[]{"HeroCode", "TreasureInfo"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_ExclusiveTreasureInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_ExclusiveTreasureInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_ExclusiveTreasureInfo_descriptor, new String[]{"HeroCode", "Lev", "Star", "BaseTreasure", "Recast", "StoneInfo"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_RecastTreasure_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_RecastTreasure_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_RecastTreasure_descriptor, new String[]{"ExtraProId", "Condition1", "Condition2", "ExtraId"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UndressTreasureStone_5503_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UndressTreasureStone_5503_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UndressTreasureStone_5503_descriptor, new String[]{"HeroCode", "Position"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UndressTreasureStone_5504_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UndressTreasureStone_5504_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UndressTreasureStone_5504_descriptor, new String[]{"HeroCode", "Position", "TreasureInfo"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_WearTreasureStone_5505_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_WearTreasureStone_5505_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_WearTreasureStone_5505_descriptor, new String[]{"HeroCode", "Position", "ItemCode"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_WearTreasureStone_5506_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_WearTreasureStone_5506_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_WearTreasureStone_5506_descriptor, new String[]{"HeroCode", "Position", "TreasureInfo"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_RecastTreasure_5507_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_RecastTreasure_5507_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_RecastTreasure_5507_descriptor, new String[]{"HeroCode", "UnLock"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_RecastTreasure_5508_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_RecastTreasure_5508_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_RecastTreasure_5508_descriptor, new String[]{"HeroCode", "UnLock", "Recast"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_SaveRecast_5509_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_SaveRecast_5509_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_SaveRecast_5509_descriptor, new String[]{"HeroCode"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_SaveRecast_5510_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_SaveRecast_5510_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_SaveRecast_5510_descriptor, new String[]{"HeroCode", "BaseTreasure", "Recast"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UpLev_5511_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UpLev_5511_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UpLev_5511_descriptor, new String[]{"HeroCode"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UpLev_5512_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UpLev_5512_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UpLev_5512_descriptor, new String[]{"HeroCode", "TreasureInfo"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UpStar_5513_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UpStar_5513_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UpStar_5513_descriptor, new String[]{"HeroCode"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UpStar_5514_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UpStar_5514_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UpStar_5514_descriptor, new String[]{"HeroCode", "TreasureInfo"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_ComposeStone_5515_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_ComposeStone_5515_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_ComposeStone_5515_descriptor, new String[]{"ItemCode", "TargetId"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_ComposeStone_5516_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_ComposeStone_5516_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_ComposeStone_5516_descriptor, new String[]{"Result"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_TreasureStoneInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_TreasureStoneInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_TreasureStoneInfo_descriptor, new String[]{"Id", "Code"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneSell_5517_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneSell_5517_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneSell_5517_descriptor, new String[]{"ItemCode"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneSell_5518_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneSell_5518_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneSell_5518_descriptor, new String[]{"Result"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_Reset_5519_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_Reset_5519_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_Reset_5519_descriptor, new String[]{"HeroCode"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_Reset_5520_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_Reset_5520_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_Reset_5520_descriptor, new String[]{"Result"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneExchange_5521_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneExchange_5521_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneExchange_5521_descriptor, new String[]{"ItemCode", "TargetId"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneExchange_5522_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneExchange_5522_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneExchange_5522_descriptor, new String[]{"Result"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StrengthStone_5523_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StrengthStone_5523_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StrengthStone_5523_descriptor, new String[]{"ItemCode", "TargetId"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StrengthStone_5524_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StrengthStone_5524_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StrengthStone_5524_descriptor, new String[]{"Result"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StrengthHeroStone_5525_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StrengthHeroStone_5525_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StrengthHeroStone_5525_descriptor, new String[]{"HeroCode", "Position", "TargetId"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StrengthHeroStone_5526_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StrengthHeroStone_5526_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StrengthHeroStone_5526_descriptor, new String[]{"HeroCode", "StoneInfo"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneHeroExchange_5527_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneHeroExchange_5527_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneHeroExchange_5527_descriptor, new String[]{"HeroCode", "Position", "TargetId"});
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneHeroExchange_5528_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneHeroExchange_5528_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneHeroExchange_5528_descriptor, new String[]{"HeroCode", "StoneInfo"});
      CommonMsg.getDescriptor();
   }

   public static final class C2S_TreasureInfo_5500 extends GeneratedMessageV3 implements C2S_TreasureInfo_5500OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_TreasureInfo_5500 DEFAULT_INSTANCE = new C2S_TreasureInfo_5500();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TreasureInfo_5500> PARSER = new AbstractParser<C2S_TreasureInfo_5500>() {
         public C2S_TreasureInfo_5500 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TreasureInfo_5500(input, extensionRegistry);
         }
      };

      private C2S_TreasureInfo_5500(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TreasureInfo_5500() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TreasureInfo_5500();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TreasureInfo_5500(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_TreasureInfo_5500_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_TreasureInfo_5500_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureInfo_5500.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TreasureInfo_5500)) {
            return super.equals(obj);
         } else {
            C2S_TreasureInfo_5500 other = (C2S_TreasureInfo_5500)obj;
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

      public static C2S_TreasureInfo_5500 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TreasureInfo_5500)PARSER.parseFrom(data);
      }

      public static C2S_TreasureInfo_5500 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureInfo_5500)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureInfo_5500 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TreasureInfo_5500)PARSER.parseFrom(data);
      }

      public static C2S_TreasureInfo_5500 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureInfo_5500)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureInfo_5500 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TreasureInfo_5500)PARSER.parseFrom(data);
      }

      public static C2S_TreasureInfo_5500 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TreasureInfo_5500)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TreasureInfo_5500 parseFrom(InputStream input) throws IOException {
         return (C2S_TreasureInfo_5500)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureInfo_5500 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureInfo_5500)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureInfo_5500 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TreasureInfo_5500)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TreasureInfo_5500 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureInfo_5500)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TreasureInfo_5500 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TreasureInfo_5500)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TreasureInfo_5500 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TreasureInfo_5500)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TreasureInfo_5500 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TreasureInfo_5500 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TreasureInfo_5500> parser() {
         return PARSER;
      }

      public Parser<C2S_TreasureInfo_5500> getParserForType() {
         return PARSER;
      }

      public C2S_TreasureInfo_5500 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TreasureInfo_5500OrBuilder {
         private int bitField0_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_TreasureInfo_5500_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_TreasureInfo_5500_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TreasureInfo_5500.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveTreasureMsg.C2S_TreasureInfo_5500.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_TreasureInfo_5500_descriptor;
         }

         public C2S_TreasureInfo_5500 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.C2S_TreasureInfo_5500.getDefaultInstance();
         }

         public C2S_TreasureInfo_5500 build() {
            C2S_TreasureInfo_5500 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TreasureInfo_5500 buildPartial() {
            C2S_TreasureInfo_5500 result = new C2S_TreasureInfo_5500(this);
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
            if (other instanceof C2S_TreasureInfo_5500) {
               return this.mergeFrom((C2S_TreasureInfo_5500)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TreasureInfo_5500 other) {
            if (other == ExclusiveTreasureMsg.C2S_TreasureInfo_5500.getDefaultInstance()) {
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
            C2S_TreasureInfo_5500 parsedMessage = null;

            try {
               parsedMessage = (C2S_TreasureInfo_5500)ExclusiveTreasureMsg.C2S_TreasureInfo_5500.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TreasureInfo_5500)e.getUnfinishedMessage();
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

   public static final class C2S_ActivationTreasure_5501 extends GeneratedMessageV3 implements C2S_ActivationTreasure_5501OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int SAMEHEROCODE_FIELD_NUMBER = 2;
      private int sameHeroCode_;
      public static final int SAMENATIONCODE_FIELD_NUMBER = 3;
      private int sameNationCode_;
      private byte memoizedIsInitialized;
      private static final C2S_ActivationTreasure_5501 DEFAULT_INSTANCE = new C2S_ActivationTreasure_5501();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ActivationTreasure_5501> PARSER = new AbstractParser<C2S_ActivationTreasure_5501>() {
         public C2S_ActivationTreasure_5501 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ActivationTreasure_5501(input, extensionRegistry);
         }
      };

      private C2S_ActivationTreasure_5501(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ActivationTreasure_5501() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ActivationTreasure_5501();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ActivationTreasure_5501(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.sameHeroCode_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.sameNationCode_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_ActivationTreasure_5501_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_ActivationTreasure_5501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivationTreasure_5501.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasSameHeroCode() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSameHeroCode() {
         return this.sameHeroCode_;
      }

      public boolean hasSameNationCode() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getSameNationCode() {
         return this.sameNationCode_;
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
         } else if (!this.hasSameHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSameNationCode()) {
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
            output.writeInt32(2, this.sameHeroCode_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.sameNationCode_);
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
               size += CodedOutputStream.computeInt32Size(2, this.sameHeroCode_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.sameNationCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ActivationTreasure_5501)) {
            return super.equals(obj);
         } else {
            C2S_ActivationTreasure_5501 other = (C2S_ActivationTreasure_5501)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasSameHeroCode() != other.hasSameHeroCode()) {
               return false;
            } else if (this.hasSameHeroCode() && this.getSameHeroCode() != other.getSameHeroCode()) {
               return false;
            } else if (this.hasSameNationCode() != other.hasSameNationCode()) {
               return false;
            } else if (this.hasSameNationCode() && this.getSameNationCode() != other.getSameNationCode()) {
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

            if (this.hasSameHeroCode()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSameHeroCode();
            }

            if (this.hasSameNationCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSameNationCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ActivationTreasure_5501 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ActivationTreasure_5501)PARSER.parseFrom(data);
      }

      public static C2S_ActivationTreasure_5501 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivationTreasure_5501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivationTreasure_5501 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ActivationTreasure_5501)PARSER.parseFrom(data);
      }

      public static C2S_ActivationTreasure_5501 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivationTreasure_5501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivationTreasure_5501 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ActivationTreasure_5501)PARSER.parseFrom(data);
      }

      public static C2S_ActivationTreasure_5501 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ActivationTreasure_5501)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ActivationTreasure_5501 parseFrom(InputStream input) throws IOException {
         return (C2S_ActivationTreasure_5501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivationTreasure_5501 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivationTreasure_5501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivationTreasure_5501 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ActivationTreasure_5501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ActivationTreasure_5501 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivationTreasure_5501)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ActivationTreasure_5501 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ActivationTreasure_5501)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ActivationTreasure_5501 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ActivationTreasure_5501)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ActivationTreasure_5501 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ActivationTreasure_5501 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ActivationTreasure_5501> parser() {
         return PARSER;
      }

      public Parser<C2S_ActivationTreasure_5501> getParserForType() {
         return PARSER;
      }

      public C2S_ActivationTreasure_5501 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ActivationTreasure_5501OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int sameHeroCode_;
         private int sameNationCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_ActivationTreasure_5501_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_ActivationTreasure_5501_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ActivationTreasure_5501.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveTreasureMsg.C2S_ActivationTreasure_5501.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.sameHeroCode_ = 0;
            this.bitField0_ &= -3;
            this.sameNationCode_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_ActivationTreasure_5501_descriptor;
         }

         public C2S_ActivationTreasure_5501 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.C2S_ActivationTreasure_5501.getDefaultInstance();
         }

         public C2S_ActivationTreasure_5501 build() {
            C2S_ActivationTreasure_5501 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ActivationTreasure_5501 buildPartial() {
            C2S_ActivationTreasure_5501 result = new C2S_ActivationTreasure_5501(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.sameHeroCode_ = this.sameHeroCode_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.sameNationCode_ = this.sameNationCode_;
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
            if (other instanceof C2S_ActivationTreasure_5501) {
               return this.mergeFrom((C2S_ActivationTreasure_5501)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ActivationTreasure_5501 other) {
            if (other == ExclusiveTreasureMsg.C2S_ActivationTreasure_5501.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasSameHeroCode()) {
                  this.setSameHeroCode(other.getSameHeroCode());
               }

               if (other.hasSameNationCode()) {
                  this.setSameNationCode(other.getSameNationCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasSameHeroCode()) {
               return false;
            } else {
               return this.hasSameNationCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ActivationTreasure_5501 parsedMessage = null;

            try {
               parsedMessage = (C2S_ActivationTreasure_5501)ExclusiveTreasureMsg.C2S_ActivationTreasure_5501.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ActivationTreasure_5501)e.getUnfinishedMessage();
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

         public boolean hasSameHeroCode() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSameHeroCode() {
            return this.sameHeroCode_;
         }

         public Builder setSameHeroCode(int value) {
            this.bitField0_ |= 2;
            this.sameHeroCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSameHeroCode() {
            this.bitField0_ &= -3;
            this.sameHeroCode_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSameNationCode() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSameNationCode() {
            return this.sameNationCode_;
         }

         public Builder setSameNationCode(int value) {
            this.bitField0_ |= 4;
            this.sameNationCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSameNationCode() {
            this.bitField0_ &= -5;
            this.sameNationCode_ = 0;
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

   public static final class S2C_ActivationTreasure_5502 extends GeneratedMessageV3 implements S2C_ActivationTreasure_5502OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int TREASUREINFO_FIELD_NUMBER = 2;
      private ExclusiveTreasureInfo treasureInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_ActivationTreasure_5502 DEFAULT_INSTANCE = new S2C_ActivationTreasure_5502();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ActivationTreasure_5502> PARSER = new AbstractParser<S2C_ActivationTreasure_5502>() {
         public S2C_ActivationTreasure_5502 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ActivationTreasure_5502(input, extensionRegistry);
         }
      };

      private S2C_ActivationTreasure_5502(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ActivationTreasure_5502() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ActivationTreasure_5502();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ActivationTreasure_5502(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        ExclusiveTreasureInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.treasureInfo_.toBuilder();
                        }

                        this.treasureInfo_ = (ExclusiveTreasureInfo)input.readMessage(ExclusiveTreasureMsg.ExclusiveTreasureInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.treasureInfo_);
                           this.treasureInfo_ = subBuilder.buildPartial();
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_ActivationTreasure_5502_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_ActivationTreasure_5502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivationTreasure_5502.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasTreasureInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public ExclusiveTreasureInfo getTreasureInfo() {
         return this.treasureInfo_ == null ? ExclusiveTreasureMsg.ExclusiveTreasureInfo.getDefaultInstance() : this.treasureInfo_;
      }

      public ExclusiveTreasureInfoOrBuilder getTreasureInfoOrBuilder() {
         return this.treasureInfo_ == null ? ExclusiveTreasureMsg.ExclusiveTreasureInfo.getDefaultInstance() : this.treasureInfo_;
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
         } else if (this.hasTreasureInfo() && !this.getTreasureInfo().isInitialized()) {
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
            output.writeMessage(2, this.getTreasureInfo());
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
               size += CodedOutputStream.computeMessageSize(2, this.getTreasureInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ActivationTreasure_5502)) {
            return super.equals(obj);
         } else {
            S2C_ActivationTreasure_5502 other = (S2C_ActivationTreasure_5502)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasTreasureInfo() != other.hasTreasureInfo()) {
               return false;
            } else if (this.hasTreasureInfo() && !this.getTreasureInfo().equals(other.getTreasureInfo())) {
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

            if (this.hasTreasureInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTreasureInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ActivationTreasure_5502 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ActivationTreasure_5502)PARSER.parseFrom(data);
      }

      public static S2C_ActivationTreasure_5502 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivationTreasure_5502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivationTreasure_5502 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ActivationTreasure_5502)PARSER.parseFrom(data);
      }

      public static S2C_ActivationTreasure_5502 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivationTreasure_5502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivationTreasure_5502 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ActivationTreasure_5502)PARSER.parseFrom(data);
      }

      public static S2C_ActivationTreasure_5502 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ActivationTreasure_5502)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ActivationTreasure_5502 parseFrom(InputStream input) throws IOException {
         return (S2C_ActivationTreasure_5502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivationTreasure_5502 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivationTreasure_5502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivationTreasure_5502 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ActivationTreasure_5502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ActivationTreasure_5502 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivationTreasure_5502)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ActivationTreasure_5502 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ActivationTreasure_5502)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ActivationTreasure_5502 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ActivationTreasure_5502)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ActivationTreasure_5502 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ActivationTreasure_5502 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ActivationTreasure_5502> parser() {
         return PARSER;
      }

      public Parser<S2C_ActivationTreasure_5502> getParserForType() {
         return PARSER;
      }

      public S2C_ActivationTreasure_5502 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ActivationTreasure_5502OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private ExclusiveTreasureInfo treasureInfo_;
         private SingleFieldBuilderV3<ExclusiveTreasureInfo, ExclusiveTreasureInfo.Builder, ExclusiveTreasureInfoOrBuilder> treasureInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_ActivationTreasure_5502_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_ActivationTreasure_5502_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ActivationTreasure_5502.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveTreasureMsg.S2C_ActivationTreasure_5502.alwaysUseFieldBuilders) {
               this.getTreasureInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            if (this.treasureInfoBuilder_ == null) {
               this.treasureInfo_ = null;
            } else {
               this.treasureInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_ActivationTreasure_5502_descriptor;
         }

         public S2C_ActivationTreasure_5502 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.S2C_ActivationTreasure_5502.getDefaultInstance();
         }

         public S2C_ActivationTreasure_5502 build() {
            S2C_ActivationTreasure_5502 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ActivationTreasure_5502 buildPartial() {
            S2C_ActivationTreasure_5502 result = new S2C_ActivationTreasure_5502(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.treasureInfoBuilder_ == null) {
                  result.treasureInfo_ = this.treasureInfo_;
               } else {
                  result.treasureInfo_ = (ExclusiveTreasureInfo)this.treasureInfoBuilder_.build();
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
            if (other instanceof S2C_ActivationTreasure_5502) {
               return this.mergeFrom((S2C_ActivationTreasure_5502)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ActivationTreasure_5502 other) {
            if (other == ExclusiveTreasureMsg.S2C_ActivationTreasure_5502.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasTreasureInfo()) {
                  this.mergeTreasureInfo(other.getTreasureInfo());
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
               return !this.hasTreasureInfo() || this.getTreasureInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ActivationTreasure_5502 parsedMessage = null;

            try {
               parsedMessage = (S2C_ActivationTreasure_5502)ExclusiveTreasureMsg.S2C_ActivationTreasure_5502.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ActivationTreasure_5502)e.getUnfinishedMessage();
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

         public boolean hasTreasureInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public ExclusiveTreasureInfo getTreasureInfo() {
            if (this.treasureInfoBuilder_ == null) {
               return this.treasureInfo_ == null ? ExclusiveTreasureMsg.ExclusiveTreasureInfo.getDefaultInstance() : this.treasureInfo_;
            } else {
               return (ExclusiveTreasureInfo)this.treasureInfoBuilder_.getMessage();
            }
         }

         public Builder setTreasureInfo(ExclusiveTreasureInfo value) {
            if (this.treasureInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.treasureInfo_ = value;
               this.onChanged();
            } else {
               this.treasureInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setTreasureInfo(ExclusiveTreasureInfo.Builder builderForValue) {
            if (this.treasureInfoBuilder_ == null) {
               this.treasureInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.treasureInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeTreasureInfo(ExclusiveTreasureInfo value) {
            if (this.treasureInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.treasureInfo_ != null && this.treasureInfo_ != ExclusiveTreasureMsg.ExclusiveTreasureInfo.getDefaultInstance()) {
                  this.treasureInfo_ = ExclusiveTreasureMsg.ExclusiveTreasureInfo.newBuilder(this.treasureInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.treasureInfo_ = value;
               }

               this.onChanged();
            } else {
               this.treasureInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearTreasureInfo() {
            if (this.treasureInfoBuilder_ == null) {
               this.treasureInfo_ = null;
               this.onChanged();
            } else {
               this.treasureInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public ExclusiveTreasureInfo.Builder getTreasureInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (ExclusiveTreasureInfo.Builder)this.getTreasureInfoFieldBuilder().getBuilder();
         }

         public ExclusiveTreasureInfoOrBuilder getTreasureInfoOrBuilder() {
            if (this.treasureInfoBuilder_ != null) {
               return (ExclusiveTreasureInfoOrBuilder)this.treasureInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.treasureInfo_ == null ? ExclusiveTreasureMsg.ExclusiveTreasureInfo.getDefaultInstance() : this.treasureInfo_;
            }
         }

         private SingleFieldBuilderV3<ExclusiveTreasureInfo, ExclusiveTreasureInfo.Builder, ExclusiveTreasureInfoOrBuilder> getTreasureInfoFieldBuilder() {
            if (this.treasureInfoBuilder_ == null) {
               this.treasureInfoBuilder_ = new SingleFieldBuilderV3(this.getTreasureInfo(), this.getParentForChildren(), this.isClean());
               this.treasureInfo_ = null;
            }

            return this.treasureInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class ExclusiveTreasureInfo extends GeneratedMessageV3 implements ExclusiveTreasureInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int LEV_FIELD_NUMBER = 2;
      private int lev_;
      public static final int STAR_FIELD_NUMBER = 3;
      private int star_;
      public static final int BASETREASURE_FIELD_NUMBER = 5;
      private RecastTreasure baseTreasure_;
      public static final int RECAST_FIELD_NUMBER = 6;
      private RecastTreasure recast_;
      public static final int STONEINFO_FIELD_NUMBER = 7;
      private List<CommonMsg.TreasureStone> stoneInfo_;
      private byte memoizedIsInitialized;
      private static final ExclusiveTreasureInfo DEFAULT_INSTANCE = new ExclusiveTreasureInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<ExclusiveTreasureInfo> PARSER = new AbstractParser<ExclusiveTreasureInfo>() {
         public ExclusiveTreasureInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new ExclusiveTreasureInfo(input, extensionRegistry);
         }
      };

      private ExclusiveTreasureInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private ExclusiveTreasureInfo() {
         this.memoizedIsInitialized = -1;
         this.stoneInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new ExclusiveTreasureInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private ExclusiveTreasureInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.lev_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.star_ = input.readInt32();
                        break;
                     case 42:
                        RecastTreasure.Builder subBuilder = null;
                        if ((this.bitField0_ & 8) != 0) {
                           subBuilder = this.baseTreasure_.toBuilder();
                        }

                        this.baseTreasure_ = (RecastTreasure)input.readMessage(ExclusiveTreasureMsg.RecastTreasure.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.baseTreasure_);
                           this.baseTreasure_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 8;
                        break;
                     case 50:
                        RecastTreasure.Builder subBuilder = null;
                        if ((this.bitField0_ & 16) != 0) {
                           subBuilder = this.recast_.toBuilder();
                        }

                        this.recast_ = (RecastTreasure)input.readMessage(ExclusiveTreasureMsg.RecastTreasure.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.recast_);
                           this.recast_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 16;
                        break;
                     case 58:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.stoneInfo_ = new ArrayList();
                           mutable_bitField0_ |= 32;
                        }

                        this.stoneInfo_.add(input.readMessage(CommonMsg.TreasureStone.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 32) != 0) {
                  this.stoneInfo_ = Collections.unmodifiableList(this.stoneInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_ExclusiveTreasureInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_ExclusiveTreasureInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ExclusiveTreasureInfo.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasLev() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLev() {
         return this.lev_;
      }

      public boolean hasStar() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getStar() {
         return this.star_;
      }

      public boolean hasBaseTreasure() {
         return (this.bitField0_ & 8) != 0;
      }

      public RecastTreasure getBaseTreasure() {
         return this.baseTreasure_ == null ? ExclusiveTreasureMsg.RecastTreasure.getDefaultInstance() : this.baseTreasure_;
      }

      public RecastTreasureOrBuilder getBaseTreasureOrBuilder() {
         return this.baseTreasure_ == null ? ExclusiveTreasureMsg.RecastTreasure.getDefaultInstance() : this.baseTreasure_;
      }

      public boolean hasRecast() {
         return (this.bitField0_ & 16) != 0;
      }

      public RecastTreasure getRecast() {
         return this.recast_ == null ? ExclusiveTreasureMsg.RecastTreasure.getDefaultInstance() : this.recast_;
      }

      public RecastTreasureOrBuilder getRecastOrBuilder() {
         return this.recast_ == null ? ExclusiveTreasureMsg.RecastTreasure.getDefaultInstance() : this.recast_;
      }

      public List<CommonMsg.TreasureStone> getStoneInfoList() {
         return this.stoneInfo_;
      }

      public List<? extends CommonMsg.TreasureStoneOrBuilder> getStoneInfoOrBuilderList() {
         return this.stoneInfo_;
      }

      public int getStoneInfoCount() {
         return this.stoneInfo_.size();
      }

      public CommonMsg.TreasureStone getStoneInfo(int index) {
         return (CommonMsg.TreasureStone)this.stoneInfo_.get(index);
      }

      public CommonMsg.TreasureStoneOrBuilder getStoneInfoOrBuilder(int index) {
         return (CommonMsg.TreasureStoneOrBuilder)this.stoneInfo_.get(index);
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
         } else if (!this.hasLev()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStar()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBaseTreasure()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getBaseTreasure().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasRecast() && !this.getRecast().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getStoneInfoCount(); ++i) {
               if (!this.getStoneInfo(i).isInitialized()) {
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
            output.writeInt32(2, this.lev_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.star_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeMessage(5, this.getBaseTreasure());
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeMessage(6, this.getRecast());
         }

         for(int i = 0; i < this.stoneInfo_.size(); ++i) {
            output.writeMessage(7, (MessageLite)this.stoneInfo_.get(i));
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
               size += CodedOutputStream.computeInt32Size(2, this.lev_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.star_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeMessageSize(5, this.getBaseTreasure());
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeMessageSize(6, this.getRecast());
            }

            for(int i = 0; i < this.stoneInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(7, (MessageLite)this.stoneInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof ExclusiveTreasureInfo)) {
            return super.equals(obj);
         } else {
            ExclusiveTreasureInfo other = (ExclusiveTreasureInfo)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasLev() != other.hasLev()) {
               return false;
            } else if (this.hasLev() && this.getLev() != other.getLev()) {
               return false;
            } else if (this.hasStar() != other.hasStar()) {
               return false;
            } else if (this.hasStar() && this.getStar() != other.getStar()) {
               return false;
            } else if (this.hasBaseTreasure() != other.hasBaseTreasure()) {
               return false;
            } else if (this.hasBaseTreasure() && !this.getBaseTreasure().equals(other.getBaseTreasure())) {
               return false;
            } else if (this.hasRecast() != other.hasRecast()) {
               return false;
            } else if (this.hasRecast() && !this.getRecast().equals(other.getRecast())) {
               return false;
            } else if (!this.getStoneInfoList().equals(other.getStoneInfoList())) {
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

            if (this.hasLev()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLev();
            }

            if (this.hasStar()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getStar();
            }

            if (this.hasBaseTreasure()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getBaseTreasure().hashCode();
            }

            if (this.hasRecast()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getRecast().hashCode();
            }

            if (this.getStoneInfoCount() > 0) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getStoneInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static ExclusiveTreasureInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (ExclusiveTreasureInfo)PARSER.parseFrom(data);
      }

      public static ExclusiveTreasureInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ExclusiveTreasureInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ExclusiveTreasureInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (ExclusiveTreasureInfo)PARSER.parseFrom(data);
      }

      public static ExclusiveTreasureInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ExclusiveTreasureInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ExclusiveTreasureInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (ExclusiveTreasureInfo)PARSER.parseFrom(data);
      }

      public static ExclusiveTreasureInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ExclusiveTreasureInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ExclusiveTreasureInfo parseFrom(InputStream input) throws IOException {
         return (ExclusiveTreasureInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ExclusiveTreasureInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ExclusiveTreasureInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static ExclusiveTreasureInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (ExclusiveTreasureInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static ExclusiveTreasureInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ExclusiveTreasureInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static ExclusiveTreasureInfo parseFrom(CodedInputStream input) throws IOException {
         return (ExclusiveTreasureInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ExclusiveTreasureInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ExclusiveTreasureInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(ExclusiveTreasureInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static ExclusiveTreasureInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<ExclusiveTreasureInfo> parser() {
         return PARSER;
      }

      public Parser<ExclusiveTreasureInfo> getParserForType() {
         return PARSER;
      }

      public ExclusiveTreasureInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ExclusiveTreasureInfoOrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int lev_;
         private int star_;
         private RecastTreasure baseTreasure_;
         private SingleFieldBuilderV3<RecastTreasure, RecastTreasure.Builder, RecastTreasureOrBuilder> baseTreasureBuilder_;
         private RecastTreasure recast_;
         private SingleFieldBuilderV3<RecastTreasure, RecastTreasure.Builder, RecastTreasureOrBuilder> recastBuilder_;
         private List<CommonMsg.TreasureStone> stoneInfo_;
         private RepeatedFieldBuilderV3<CommonMsg.TreasureStone, CommonMsg.TreasureStone.Builder, CommonMsg.TreasureStoneOrBuilder> stoneInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_ExclusiveTreasureInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_ExclusiveTreasureInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ExclusiveTreasureInfo.class, Builder.class);
         }

         private Builder() {
            this.stoneInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.stoneInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveTreasureMsg.ExclusiveTreasureInfo.alwaysUseFieldBuilders) {
               this.getBaseTreasureFieldBuilder();
               this.getRecastFieldBuilder();
               this.getStoneInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.lev_ = 0;
            this.bitField0_ &= -3;
            this.star_ = 0;
            this.bitField0_ &= -5;
            if (this.baseTreasureBuilder_ == null) {
               this.baseTreasure_ = null;
            } else {
               this.baseTreasureBuilder_.clear();
            }

            this.bitField0_ &= -9;
            if (this.recastBuilder_ == null) {
               this.recast_ = null;
            } else {
               this.recastBuilder_.clear();
            }

            this.bitField0_ &= -17;
            if (this.stoneInfoBuilder_ == null) {
               this.stoneInfo_ = Collections.emptyList();
               this.bitField0_ &= -33;
            } else {
               this.stoneInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_ExclusiveTreasureInfo_descriptor;
         }

         public ExclusiveTreasureInfo getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.ExclusiveTreasureInfo.getDefaultInstance();
         }

         public ExclusiveTreasureInfo build() {
            ExclusiveTreasureInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public ExclusiveTreasureInfo buildPartial() {
            ExclusiveTreasureInfo result = new ExclusiveTreasureInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.lev_ = this.lev_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.star_ = this.star_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               if (this.baseTreasureBuilder_ == null) {
                  result.baseTreasure_ = this.baseTreasure_;
               } else {
                  result.baseTreasure_ = (RecastTreasure)this.baseTreasureBuilder_.build();
               }

               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               if (this.recastBuilder_ == null) {
                  result.recast_ = this.recast_;
               } else {
                  result.recast_ = (RecastTreasure)this.recastBuilder_.build();
               }

               to_bitField0_ |= 16;
            }

            if (this.stoneInfoBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0) {
                  this.stoneInfo_ = Collections.unmodifiableList(this.stoneInfo_);
                  this.bitField0_ &= -33;
               }

               result.stoneInfo_ = this.stoneInfo_;
            } else {
               result.stoneInfo_ = this.stoneInfoBuilder_.build();
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
            if (other instanceof ExclusiveTreasureInfo) {
               return this.mergeFrom((ExclusiveTreasureInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(ExclusiveTreasureInfo other) {
            if (other == ExclusiveTreasureMsg.ExclusiveTreasureInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasLev()) {
                  this.setLev(other.getLev());
               }

               if (other.hasStar()) {
                  this.setStar(other.getStar());
               }

               if (other.hasBaseTreasure()) {
                  this.mergeBaseTreasure(other.getBaseTreasure());
               }

               if (other.hasRecast()) {
                  this.mergeRecast(other.getRecast());
               }

               if (this.stoneInfoBuilder_ == null) {
                  if (!other.stoneInfo_.isEmpty()) {
                     if (this.stoneInfo_.isEmpty()) {
                        this.stoneInfo_ = other.stoneInfo_;
                        this.bitField0_ &= -33;
                     } else {
                        this.ensureStoneInfoIsMutable();
                        this.stoneInfo_.addAll(other.stoneInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.stoneInfo_.isEmpty()) {
                  if (this.stoneInfoBuilder_.isEmpty()) {
                     this.stoneInfoBuilder_.dispose();
                     this.stoneInfoBuilder_ = null;
                     this.stoneInfo_ = other.stoneInfo_;
                     this.bitField0_ &= -33;
                     this.stoneInfoBuilder_ = ExclusiveTreasureMsg.ExclusiveTreasureInfo.alwaysUseFieldBuilders ? this.getStoneInfoFieldBuilder() : null;
                  } else {
                     this.stoneInfoBuilder_.addAllMessages(other.stoneInfo_);
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
            } else if (!this.hasLev()) {
               return false;
            } else if (!this.hasStar()) {
               return false;
            } else if (!this.hasBaseTreasure()) {
               return false;
            } else if (!this.getBaseTreasure().isInitialized()) {
               return false;
            } else if (this.hasRecast() && !this.getRecast().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getStoneInfoCount(); ++i) {
                  if (!this.getStoneInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            ExclusiveTreasureInfo parsedMessage = null;

            try {
               parsedMessage = (ExclusiveTreasureInfo)ExclusiveTreasureMsg.ExclusiveTreasureInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (ExclusiveTreasureInfo)e.getUnfinishedMessage();
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

         public boolean hasLev() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLev() {
            return this.lev_;
         }

         public Builder setLev(int value) {
            this.bitField0_ |= 2;
            this.lev_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLev() {
            this.bitField0_ &= -3;
            this.lev_ = 0;
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

         public boolean hasBaseTreasure() {
            return (this.bitField0_ & 8) != 0;
         }

         public RecastTreasure getBaseTreasure() {
            if (this.baseTreasureBuilder_ == null) {
               return this.baseTreasure_ == null ? ExclusiveTreasureMsg.RecastTreasure.getDefaultInstance() : this.baseTreasure_;
            } else {
               return (RecastTreasure)this.baseTreasureBuilder_.getMessage();
            }
         }

         public Builder setBaseTreasure(RecastTreasure value) {
            if (this.baseTreasureBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.baseTreasure_ = value;
               this.onChanged();
            } else {
               this.baseTreasureBuilder_.setMessage(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder setBaseTreasure(RecastTreasure.Builder builderForValue) {
            if (this.baseTreasureBuilder_ == null) {
               this.baseTreasure_ = builderForValue.build();
               this.onChanged();
            } else {
               this.baseTreasureBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder mergeBaseTreasure(RecastTreasure value) {
            if (this.baseTreasureBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0 && this.baseTreasure_ != null && this.baseTreasure_ != ExclusiveTreasureMsg.RecastTreasure.getDefaultInstance()) {
                  this.baseTreasure_ = ExclusiveTreasureMsg.RecastTreasure.newBuilder(this.baseTreasure_).mergeFrom(value).buildPartial();
               } else {
                  this.baseTreasure_ = value;
               }

               this.onChanged();
            } else {
               this.baseTreasureBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder clearBaseTreasure() {
            if (this.baseTreasureBuilder_ == null) {
               this.baseTreasure_ = null;
               this.onChanged();
            } else {
               this.baseTreasureBuilder_.clear();
            }

            this.bitField0_ &= -9;
            return this;
         }

         public RecastTreasure.Builder getBaseTreasureBuilder() {
            this.bitField0_ |= 8;
            this.onChanged();
            return (RecastTreasure.Builder)this.getBaseTreasureFieldBuilder().getBuilder();
         }

         public RecastTreasureOrBuilder getBaseTreasureOrBuilder() {
            if (this.baseTreasureBuilder_ != null) {
               return (RecastTreasureOrBuilder)this.baseTreasureBuilder_.getMessageOrBuilder();
            } else {
               return this.baseTreasure_ == null ? ExclusiveTreasureMsg.RecastTreasure.getDefaultInstance() : this.baseTreasure_;
            }
         }

         private SingleFieldBuilderV3<RecastTreasure, RecastTreasure.Builder, RecastTreasureOrBuilder> getBaseTreasureFieldBuilder() {
            if (this.baseTreasureBuilder_ == null) {
               this.baseTreasureBuilder_ = new SingleFieldBuilderV3(this.getBaseTreasure(), this.getParentForChildren(), this.isClean());
               this.baseTreasure_ = null;
            }

            return this.baseTreasureBuilder_;
         }

         public boolean hasRecast() {
            return (this.bitField0_ & 16) != 0;
         }

         public RecastTreasure getRecast() {
            if (this.recastBuilder_ == null) {
               return this.recast_ == null ? ExclusiveTreasureMsg.RecastTreasure.getDefaultInstance() : this.recast_;
            } else {
               return (RecastTreasure)this.recastBuilder_.getMessage();
            }
         }

         public Builder setRecast(RecastTreasure value) {
            if (this.recastBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.recast_ = value;
               this.onChanged();
            } else {
               this.recastBuilder_.setMessage(value);
            }

            this.bitField0_ |= 16;
            return this;
         }

         public Builder setRecast(RecastTreasure.Builder builderForValue) {
            if (this.recastBuilder_ == null) {
               this.recast_ = builderForValue.build();
               this.onChanged();
            } else {
               this.recastBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 16;
            return this;
         }

         public Builder mergeRecast(RecastTreasure value) {
            if (this.recastBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0 && this.recast_ != null && this.recast_ != ExclusiveTreasureMsg.RecastTreasure.getDefaultInstance()) {
                  this.recast_ = ExclusiveTreasureMsg.RecastTreasure.newBuilder(this.recast_).mergeFrom(value).buildPartial();
               } else {
                  this.recast_ = value;
               }

               this.onChanged();
            } else {
               this.recastBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 16;
            return this;
         }

         public Builder clearRecast() {
            if (this.recastBuilder_ == null) {
               this.recast_ = null;
               this.onChanged();
            } else {
               this.recastBuilder_.clear();
            }

            this.bitField0_ &= -17;
            return this;
         }

         public RecastTreasure.Builder getRecastBuilder() {
            this.bitField0_ |= 16;
            this.onChanged();
            return (RecastTreasure.Builder)this.getRecastFieldBuilder().getBuilder();
         }

         public RecastTreasureOrBuilder getRecastOrBuilder() {
            if (this.recastBuilder_ != null) {
               return (RecastTreasureOrBuilder)this.recastBuilder_.getMessageOrBuilder();
            } else {
               return this.recast_ == null ? ExclusiveTreasureMsg.RecastTreasure.getDefaultInstance() : this.recast_;
            }
         }

         private SingleFieldBuilderV3<RecastTreasure, RecastTreasure.Builder, RecastTreasureOrBuilder> getRecastFieldBuilder() {
            if (this.recastBuilder_ == null) {
               this.recastBuilder_ = new SingleFieldBuilderV3(this.getRecast(), this.getParentForChildren(), this.isClean());
               this.recast_ = null;
            }

            return this.recastBuilder_;
         }

         private void ensureStoneInfoIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.stoneInfo_ = new ArrayList(this.stoneInfo_);
               this.bitField0_ |= 32;
            }

         }

         public List<CommonMsg.TreasureStone> getStoneInfoList() {
            return this.stoneInfoBuilder_ == null ? Collections.unmodifiableList(this.stoneInfo_) : this.stoneInfoBuilder_.getMessageList();
         }

         public int getStoneInfoCount() {
            return this.stoneInfoBuilder_ == null ? this.stoneInfo_.size() : this.stoneInfoBuilder_.getCount();
         }

         public CommonMsg.TreasureStone getStoneInfo(int index) {
            return this.stoneInfoBuilder_ == null ? (CommonMsg.TreasureStone)this.stoneInfo_.get(index) : (CommonMsg.TreasureStone)this.stoneInfoBuilder_.getMessage(index);
         }

         public Builder setStoneInfo(int index, CommonMsg.TreasureStone value) {
            if (this.stoneInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureStoneInfoIsMutable();
               this.stoneInfo_.set(index, value);
               this.onChanged();
            } else {
               this.stoneInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setStoneInfo(int index, CommonMsg.TreasureStone.Builder builderForValue) {
            if (this.stoneInfoBuilder_ == null) {
               this.ensureStoneInfoIsMutable();
               this.stoneInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.stoneInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addStoneInfo(CommonMsg.TreasureStone value) {
            if (this.stoneInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureStoneInfoIsMutable();
               this.stoneInfo_.add(value);
               this.onChanged();
            } else {
               this.stoneInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addStoneInfo(int index, CommonMsg.TreasureStone value) {
            if (this.stoneInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureStoneInfoIsMutable();
               this.stoneInfo_.add(index, value);
               this.onChanged();
            } else {
               this.stoneInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addStoneInfo(CommonMsg.TreasureStone.Builder builderForValue) {
            if (this.stoneInfoBuilder_ == null) {
               this.ensureStoneInfoIsMutable();
               this.stoneInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.stoneInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addStoneInfo(int index, CommonMsg.TreasureStone.Builder builderForValue) {
            if (this.stoneInfoBuilder_ == null) {
               this.ensureStoneInfoIsMutable();
               this.stoneInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.stoneInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllStoneInfo(Iterable<? extends CommonMsg.TreasureStone> values) {
            if (this.stoneInfoBuilder_ == null) {
               this.ensureStoneInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.stoneInfo_);
               this.onChanged();
            } else {
               this.stoneInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearStoneInfo() {
            if (this.stoneInfoBuilder_ == null) {
               this.stoneInfo_ = Collections.emptyList();
               this.bitField0_ &= -33;
               this.onChanged();
            } else {
               this.stoneInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeStoneInfo(int index) {
            if (this.stoneInfoBuilder_ == null) {
               this.ensureStoneInfoIsMutable();
               this.stoneInfo_.remove(index);
               this.onChanged();
            } else {
               this.stoneInfoBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.TreasureStone.Builder getStoneInfoBuilder(int index) {
            return (CommonMsg.TreasureStone.Builder)this.getStoneInfoFieldBuilder().getBuilder(index);
         }

         public CommonMsg.TreasureStoneOrBuilder getStoneInfoOrBuilder(int index) {
            return this.stoneInfoBuilder_ == null ? (CommonMsg.TreasureStoneOrBuilder)this.stoneInfo_.get(index) : (CommonMsg.TreasureStoneOrBuilder)this.stoneInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.TreasureStoneOrBuilder> getStoneInfoOrBuilderList() {
            return this.stoneInfoBuilder_ != null ? this.stoneInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.stoneInfo_);
         }

         public CommonMsg.TreasureStone.Builder addStoneInfoBuilder() {
            return (CommonMsg.TreasureStone.Builder)this.getStoneInfoFieldBuilder().addBuilder(CommonMsg.TreasureStone.getDefaultInstance());
         }

         public CommonMsg.TreasureStone.Builder addStoneInfoBuilder(int index) {
            return (CommonMsg.TreasureStone.Builder)this.getStoneInfoFieldBuilder().addBuilder(index, CommonMsg.TreasureStone.getDefaultInstance());
         }

         public List<CommonMsg.TreasureStone.Builder> getStoneInfoBuilderList() {
            return this.getStoneInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.TreasureStone, CommonMsg.TreasureStone.Builder, CommonMsg.TreasureStoneOrBuilder> getStoneInfoFieldBuilder() {
            if (this.stoneInfoBuilder_ == null) {
               this.stoneInfoBuilder_ = new RepeatedFieldBuilderV3(this.stoneInfo_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean());
               this.stoneInfo_ = null;
            }

            return this.stoneInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class RecastTreasure extends GeneratedMessageV3 implements RecastTreasureOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int EXTRAPROID_FIELD_NUMBER = 1;
      private int extraProId_;
      public static final int CONDITION1_FIELD_NUMBER = 2;
      private int condition1_;
      public static final int CONDITION2_FIELD_NUMBER = 3;
      private int condition2_;
      public static final int EXTRAID_FIELD_NUMBER = 4;
      private int extraId_;
      private byte memoizedIsInitialized;
      private static final RecastTreasure DEFAULT_INSTANCE = new RecastTreasure();
      /** @deprecated */
      @Deprecated
      public static final Parser<RecastTreasure> PARSER = new AbstractParser<RecastTreasure>() {
         public RecastTreasure parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RecastTreasure(input, extensionRegistry);
         }
      };

      private RecastTreasure(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RecastTreasure() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RecastTreasure();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RecastTreasure(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.extraProId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.condition1_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.condition2_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.extraId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_RecastTreasure_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_RecastTreasure_fieldAccessorTable.ensureFieldAccessorsInitialized(RecastTreasure.class, Builder.class);
      }

      public boolean hasExtraProId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getExtraProId() {
         return this.extraProId_;
      }

      public boolean hasCondition1() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCondition1() {
         return this.condition1_;
      }

      public boolean hasCondition2() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getCondition2() {
         return this.condition2_;
      }

      public boolean hasExtraId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getExtraId() {
         return this.extraId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasExtraProId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCondition1()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCondition2()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasExtraId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.extraProId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.condition1_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.condition2_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.extraId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.extraProId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.condition1_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.condition2_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.extraId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RecastTreasure)) {
            return super.equals(obj);
         } else {
            RecastTreasure other = (RecastTreasure)obj;
            if (this.hasExtraProId() != other.hasExtraProId()) {
               return false;
            } else if (this.hasExtraProId() && this.getExtraProId() != other.getExtraProId()) {
               return false;
            } else if (this.hasCondition1() != other.hasCondition1()) {
               return false;
            } else if (this.hasCondition1() && this.getCondition1() != other.getCondition1()) {
               return false;
            } else if (this.hasCondition2() != other.hasCondition2()) {
               return false;
            } else if (this.hasCondition2() && this.getCondition2() != other.getCondition2()) {
               return false;
            } else if (this.hasExtraId() != other.hasExtraId()) {
               return false;
            } else if (this.hasExtraId() && this.getExtraId() != other.getExtraId()) {
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
            if (this.hasExtraProId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getExtraProId();
            }

            if (this.hasCondition1()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCondition1();
            }

            if (this.hasCondition2()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getCondition2();
            }

            if (this.hasExtraId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getExtraId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RecastTreasure parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RecastTreasure)PARSER.parseFrom(data);
      }

      public static RecastTreasure parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecastTreasure)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecastTreasure parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RecastTreasure)PARSER.parseFrom(data);
      }

      public static RecastTreasure parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecastTreasure)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecastTreasure parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RecastTreasure)PARSER.parseFrom(data);
      }

      public static RecastTreasure parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecastTreasure)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecastTreasure parseFrom(InputStream input) throws IOException {
         return (RecastTreasure)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RecastTreasure parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecastTreasure)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RecastTreasure parseDelimitedFrom(InputStream input) throws IOException {
         return (RecastTreasure)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RecastTreasure parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecastTreasure)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RecastTreasure parseFrom(CodedInputStream input) throws IOException {
         return (RecastTreasure)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RecastTreasure parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecastTreasure)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RecastTreasure prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RecastTreasure getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RecastTreasure> parser() {
         return PARSER;
      }

      public Parser<RecastTreasure> getParserForType() {
         return PARSER;
      }

      public RecastTreasure getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RecastTreasureOrBuilder {
         private int bitField0_;
         private int extraProId_;
         private int condition1_;
         private int condition2_;
         private int extraId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_RecastTreasure_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_RecastTreasure_fieldAccessorTable.ensureFieldAccessorsInitialized(RecastTreasure.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveTreasureMsg.RecastTreasure.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.extraProId_ = 0;
            this.bitField0_ &= -2;
            this.condition1_ = 0;
            this.bitField0_ &= -3;
            this.condition2_ = 0;
            this.bitField0_ &= -5;
            this.extraId_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_RecastTreasure_descriptor;
         }

         public RecastTreasure getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.RecastTreasure.getDefaultInstance();
         }

         public RecastTreasure build() {
            RecastTreasure result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RecastTreasure buildPartial() {
            RecastTreasure result = new RecastTreasure(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.extraProId_ = this.extraProId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.condition1_ = this.condition1_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.condition2_ = this.condition2_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.extraId_ = this.extraId_;
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
            if (other instanceof RecastTreasure) {
               return this.mergeFrom((RecastTreasure)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RecastTreasure other) {
            if (other == ExclusiveTreasureMsg.RecastTreasure.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasExtraProId()) {
                  this.setExtraProId(other.getExtraProId());
               }

               if (other.hasCondition1()) {
                  this.setCondition1(other.getCondition1());
               }

               if (other.hasCondition2()) {
                  this.setCondition2(other.getCondition2());
               }

               if (other.hasExtraId()) {
                  this.setExtraId(other.getExtraId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasExtraProId()) {
               return false;
            } else if (!this.hasCondition1()) {
               return false;
            } else if (!this.hasCondition2()) {
               return false;
            } else {
               return this.hasExtraId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RecastTreasure parsedMessage = null;

            try {
               parsedMessage = (RecastTreasure)ExclusiveTreasureMsg.RecastTreasure.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RecastTreasure)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasExtraProId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getExtraProId() {
            return this.extraProId_;
         }

         public Builder setExtraProId(int value) {
            this.bitField0_ |= 1;
            this.extraProId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearExtraProId() {
            this.bitField0_ &= -2;
            this.extraProId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCondition1() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCondition1() {
            return this.condition1_;
         }

         public Builder setCondition1(int value) {
            this.bitField0_ |= 2;
            this.condition1_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCondition1() {
            this.bitField0_ &= -3;
            this.condition1_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCondition2() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getCondition2() {
            return this.condition2_;
         }

         public Builder setCondition2(int value) {
            this.bitField0_ |= 4;
            this.condition2_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCondition2() {
            this.bitField0_ &= -5;
            this.condition2_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasExtraId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getExtraId() {
            return this.extraId_;
         }

         public Builder setExtraId(int value) {
            this.bitField0_ |= 8;
            this.extraId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearExtraId() {
            this.bitField0_ &= -9;
            this.extraId_ = 0;
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

   public static final class C2S_UndressTreasureStone_5503 extends GeneratedMessageV3 implements C2S_UndressTreasureStone_5503OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      private byte memoizedIsInitialized;
      private static final C2S_UndressTreasureStone_5503 DEFAULT_INSTANCE = new C2S_UndressTreasureStone_5503();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UndressTreasureStone_5503> PARSER = new AbstractParser<C2S_UndressTreasureStone_5503>() {
         public C2S_UndressTreasureStone_5503 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UndressTreasureStone_5503(input, extensionRegistry);
         }
      };

      private C2S_UndressTreasureStone_5503(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UndressTreasureStone_5503() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UndressTreasureStone_5503();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UndressTreasureStone_5503(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CommonMsg.StonePosition value = CommonMsg.StonePosition.valueOf(rawValue);
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UndressTreasureStone_5503_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UndressTreasureStone_5503_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UndressTreasureStone_5503.class, Builder.class);
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

      public CommonMsg.StonePosition getPosition() {
         CommonMsg.StonePosition result = CommonMsg.StonePosition.valueOf(this.position_);
         return result == null ? CommonMsg.StonePosition.WEAR_STONE_1 : result;
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
         } else if (!(obj instanceof C2S_UndressTreasureStone_5503)) {
            return super.equals(obj);
         } else {
            C2S_UndressTreasureStone_5503 other = (C2S_UndressTreasureStone_5503)obj;
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

      public static C2S_UndressTreasureStone_5503 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UndressTreasureStone_5503)PARSER.parseFrom(data);
      }

      public static C2S_UndressTreasureStone_5503 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UndressTreasureStone_5503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UndressTreasureStone_5503 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UndressTreasureStone_5503)PARSER.parseFrom(data);
      }

      public static C2S_UndressTreasureStone_5503 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UndressTreasureStone_5503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UndressTreasureStone_5503 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UndressTreasureStone_5503)PARSER.parseFrom(data);
      }

      public static C2S_UndressTreasureStone_5503 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UndressTreasureStone_5503)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UndressTreasureStone_5503 parseFrom(InputStream input) throws IOException {
         return (C2S_UndressTreasureStone_5503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UndressTreasureStone_5503 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UndressTreasureStone_5503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UndressTreasureStone_5503 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UndressTreasureStone_5503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UndressTreasureStone_5503 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UndressTreasureStone_5503)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UndressTreasureStone_5503 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UndressTreasureStone_5503)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UndressTreasureStone_5503 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UndressTreasureStone_5503)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UndressTreasureStone_5503 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UndressTreasureStone_5503 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UndressTreasureStone_5503> parser() {
         return PARSER;
      }

      public Parser<C2S_UndressTreasureStone_5503> getParserForType() {
         return PARSER;
      }

      public C2S_UndressTreasureStone_5503 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UndressTreasureStone_5503OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UndressTreasureStone_5503_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UndressTreasureStone_5503_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UndressTreasureStone_5503.class, Builder.class);
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
            if (ExclusiveTreasureMsg.C2S_UndressTreasureStone_5503.alwaysUseFieldBuilders) {
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
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UndressTreasureStone_5503_descriptor;
         }

         public C2S_UndressTreasureStone_5503 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.C2S_UndressTreasureStone_5503.getDefaultInstance();
         }

         public C2S_UndressTreasureStone_5503 build() {
            C2S_UndressTreasureStone_5503 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UndressTreasureStone_5503 buildPartial() {
            C2S_UndressTreasureStone_5503 result = new C2S_UndressTreasureStone_5503(this);
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
            if (other instanceof C2S_UndressTreasureStone_5503) {
               return this.mergeFrom((C2S_UndressTreasureStone_5503)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UndressTreasureStone_5503 other) {
            if (other == ExclusiveTreasureMsg.C2S_UndressTreasureStone_5503.getDefaultInstance()) {
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
            C2S_UndressTreasureStone_5503 parsedMessage = null;

            try {
               parsedMessage = (C2S_UndressTreasureStone_5503)ExclusiveTreasureMsg.C2S_UndressTreasureStone_5503.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UndressTreasureStone_5503)e.getUnfinishedMessage();
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

         public CommonMsg.StonePosition getPosition() {
            CommonMsg.StonePosition result = CommonMsg.StonePosition.valueOf(this.position_);
            return result == null ? CommonMsg.StonePosition.WEAR_STONE_1 : result;
         }

         public Builder setPosition(CommonMsg.StonePosition value) {
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

   public static final class S2C_UndressTreasureStone_5504 extends GeneratedMessageV3 implements S2C_UndressTreasureStone_5504OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      public static final int TREASUREINFO_FIELD_NUMBER = 3;
      private ExclusiveTreasureInfo treasureInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_UndressTreasureStone_5504 DEFAULT_INSTANCE = new S2C_UndressTreasureStone_5504();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UndressTreasureStone_5504> PARSER = new AbstractParser<S2C_UndressTreasureStone_5504>() {
         public S2C_UndressTreasureStone_5504 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UndressTreasureStone_5504(input, extensionRegistry);
         }
      };

      private S2C_UndressTreasureStone_5504(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UndressTreasureStone_5504() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UndressTreasureStone_5504();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UndressTreasureStone_5504(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CommonMsg.StonePosition value = CommonMsg.StonePosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.position_ = rawValue;
                        }
                        break;
                     case 26:
                        ExclusiveTreasureInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.treasureInfo_.toBuilder();
                        }

                        this.treasureInfo_ = (ExclusiveTreasureInfo)input.readMessage(ExclusiveTreasureMsg.ExclusiveTreasureInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.treasureInfo_);
                           this.treasureInfo_ = subBuilder.buildPartial();
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UndressTreasureStone_5504_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UndressTreasureStone_5504_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UndressTreasureStone_5504.class, Builder.class);
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

      public CommonMsg.StonePosition getPosition() {
         CommonMsg.StonePosition result = CommonMsg.StonePosition.valueOf(this.position_);
         return result == null ? CommonMsg.StonePosition.WEAR_STONE_1 : result;
      }

      public boolean hasTreasureInfo() {
         return (this.bitField0_ & 4) != 0;
      }

      public ExclusiveTreasureInfo getTreasureInfo() {
         return this.treasureInfo_ == null ? ExclusiveTreasureMsg.ExclusiveTreasureInfo.getDefaultInstance() : this.treasureInfo_;
      }

      public ExclusiveTreasureInfoOrBuilder getTreasureInfoOrBuilder() {
         return this.treasureInfo_ == null ? ExclusiveTreasureMsg.ExclusiveTreasureInfo.getDefaultInstance() : this.treasureInfo_;
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
         } else if (!this.hasTreasureInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getTreasureInfo().isInitialized()) {
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
            output.writeMessage(3, this.getTreasureInfo());
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
               size += CodedOutputStream.computeMessageSize(3, this.getTreasureInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UndressTreasureStone_5504)) {
            return super.equals(obj);
         } else {
            S2C_UndressTreasureStone_5504 other = (S2C_UndressTreasureStone_5504)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (this.hasTreasureInfo() != other.hasTreasureInfo()) {
               return false;
            } else if (this.hasTreasureInfo() && !this.getTreasureInfo().equals(other.getTreasureInfo())) {
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

            if (this.hasTreasureInfo()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTreasureInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UndressTreasureStone_5504 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UndressTreasureStone_5504)PARSER.parseFrom(data);
      }

      public static S2C_UndressTreasureStone_5504 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UndressTreasureStone_5504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UndressTreasureStone_5504 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UndressTreasureStone_5504)PARSER.parseFrom(data);
      }

      public static S2C_UndressTreasureStone_5504 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UndressTreasureStone_5504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UndressTreasureStone_5504 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UndressTreasureStone_5504)PARSER.parseFrom(data);
      }

      public static S2C_UndressTreasureStone_5504 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UndressTreasureStone_5504)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UndressTreasureStone_5504 parseFrom(InputStream input) throws IOException {
         return (S2C_UndressTreasureStone_5504)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UndressTreasureStone_5504 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UndressTreasureStone_5504)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UndressTreasureStone_5504 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UndressTreasureStone_5504)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UndressTreasureStone_5504 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UndressTreasureStone_5504)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UndressTreasureStone_5504 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UndressTreasureStone_5504)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UndressTreasureStone_5504 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UndressTreasureStone_5504)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UndressTreasureStone_5504 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UndressTreasureStone_5504 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UndressTreasureStone_5504> parser() {
         return PARSER;
      }

      public Parser<S2C_UndressTreasureStone_5504> getParserForType() {
         return PARSER;
      }

      public S2C_UndressTreasureStone_5504 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UndressTreasureStone_5504OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;
         private ExclusiveTreasureInfo treasureInfo_;
         private SingleFieldBuilderV3<ExclusiveTreasureInfo, ExclusiveTreasureInfo.Builder, ExclusiveTreasureInfoOrBuilder> treasureInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UndressTreasureStone_5504_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UndressTreasureStone_5504_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UndressTreasureStone_5504.class, Builder.class);
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
            if (ExclusiveTreasureMsg.S2C_UndressTreasureStone_5504.alwaysUseFieldBuilders) {
               this.getTreasureInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.bitField0_ &= -3;
            if (this.treasureInfoBuilder_ == null) {
               this.treasureInfo_ = null;
            } else {
               this.treasureInfoBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UndressTreasureStone_5504_descriptor;
         }

         public S2C_UndressTreasureStone_5504 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.S2C_UndressTreasureStone_5504.getDefaultInstance();
         }

         public S2C_UndressTreasureStone_5504 build() {
            S2C_UndressTreasureStone_5504 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UndressTreasureStone_5504 buildPartial() {
            S2C_UndressTreasureStone_5504 result = new S2C_UndressTreasureStone_5504(this);
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
               if (this.treasureInfoBuilder_ == null) {
                  result.treasureInfo_ = this.treasureInfo_;
               } else {
                  result.treasureInfo_ = (ExclusiveTreasureInfo)this.treasureInfoBuilder_.build();
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
            if (other instanceof S2C_UndressTreasureStone_5504) {
               return this.mergeFrom((S2C_UndressTreasureStone_5504)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UndressTreasureStone_5504 other) {
            if (other == ExclusiveTreasureMsg.S2C_UndressTreasureStone_5504.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasTreasureInfo()) {
                  this.mergeTreasureInfo(other.getTreasureInfo());
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
            } else if (!this.hasTreasureInfo()) {
               return false;
            } else {
               return this.getTreasureInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UndressTreasureStone_5504 parsedMessage = null;

            try {
               parsedMessage = (S2C_UndressTreasureStone_5504)ExclusiveTreasureMsg.S2C_UndressTreasureStone_5504.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UndressTreasureStone_5504)e.getUnfinishedMessage();
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

         public CommonMsg.StonePosition getPosition() {
            CommonMsg.StonePosition result = CommonMsg.StonePosition.valueOf(this.position_);
            return result == null ? CommonMsg.StonePosition.WEAR_STONE_1 : result;
         }

         public Builder setPosition(CommonMsg.StonePosition value) {
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

         public boolean hasTreasureInfo() {
            return (this.bitField0_ & 4) != 0;
         }

         public ExclusiveTreasureInfo getTreasureInfo() {
            if (this.treasureInfoBuilder_ == null) {
               return this.treasureInfo_ == null ? ExclusiveTreasureMsg.ExclusiveTreasureInfo.getDefaultInstance() : this.treasureInfo_;
            } else {
               return (ExclusiveTreasureInfo)this.treasureInfoBuilder_.getMessage();
            }
         }

         public Builder setTreasureInfo(ExclusiveTreasureInfo value) {
            if (this.treasureInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.treasureInfo_ = value;
               this.onChanged();
            } else {
               this.treasureInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setTreasureInfo(ExclusiveTreasureInfo.Builder builderForValue) {
            if (this.treasureInfoBuilder_ == null) {
               this.treasureInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.treasureInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeTreasureInfo(ExclusiveTreasureInfo value) {
            if (this.treasureInfoBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.treasureInfo_ != null && this.treasureInfo_ != ExclusiveTreasureMsg.ExclusiveTreasureInfo.getDefaultInstance()) {
                  this.treasureInfo_ = ExclusiveTreasureMsg.ExclusiveTreasureInfo.newBuilder(this.treasureInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.treasureInfo_ = value;
               }

               this.onChanged();
            } else {
               this.treasureInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearTreasureInfo() {
            if (this.treasureInfoBuilder_ == null) {
               this.treasureInfo_ = null;
               this.onChanged();
            } else {
               this.treasureInfoBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public ExclusiveTreasureInfo.Builder getTreasureInfoBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (ExclusiveTreasureInfo.Builder)this.getTreasureInfoFieldBuilder().getBuilder();
         }

         public ExclusiveTreasureInfoOrBuilder getTreasureInfoOrBuilder() {
            if (this.treasureInfoBuilder_ != null) {
               return (ExclusiveTreasureInfoOrBuilder)this.treasureInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.treasureInfo_ == null ? ExclusiveTreasureMsg.ExclusiveTreasureInfo.getDefaultInstance() : this.treasureInfo_;
            }
         }

         private SingleFieldBuilderV3<ExclusiveTreasureInfo, ExclusiveTreasureInfo.Builder, ExclusiveTreasureInfoOrBuilder> getTreasureInfoFieldBuilder() {
            if (this.treasureInfoBuilder_ == null) {
               this.treasureInfoBuilder_ = new SingleFieldBuilderV3(this.getTreasureInfo(), this.getParentForChildren(), this.isClean());
               this.treasureInfo_ = null;
            }

            return this.treasureInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_WearTreasureStone_5505 extends GeneratedMessageV3 implements C2S_WearTreasureStone_5505OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      public static final int ITEMCODE_FIELD_NUMBER = 3;
      private int itemCode_;
      private byte memoizedIsInitialized;
      private static final C2S_WearTreasureStone_5505 DEFAULT_INSTANCE = new C2S_WearTreasureStone_5505();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WearTreasureStone_5505> PARSER = new AbstractParser<C2S_WearTreasureStone_5505>() {
         public C2S_WearTreasureStone_5505 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WearTreasureStone_5505(input, extensionRegistry);
         }
      };

      private C2S_WearTreasureStone_5505(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WearTreasureStone_5505() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WearTreasureStone_5505();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WearTreasureStone_5505(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CommonMsg.StonePosition value = CommonMsg.StonePosition.valueOf(rawValue);
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_WearTreasureStone_5505_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_WearTreasureStone_5505_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WearTreasureStone_5505.class, Builder.class);
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

      public CommonMsg.StonePosition getPosition() {
         CommonMsg.StonePosition result = CommonMsg.StonePosition.valueOf(this.position_);
         return result == null ? CommonMsg.StonePosition.WEAR_STONE_1 : result;
      }

      public boolean hasItemCode() {
         return (this.bitField0_ & 4) != 0;
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
         } else if (!this.hasHeroCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPosition()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.heroCode_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeEnum(2, this.position_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.itemCode_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_WearTreasureStone_5505)) {
            return super.equals(obj);
         } else {
            C2S_WearTreasureStone_5505 other = (C2S_WearTreasureStone_5505)obj;
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_WearTreasureStone_5505 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WearTreasureStone_5505)PARSER.parseFrom(data);
      }

      public static C2S_WearTreasureStone_5505 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WearTreasureStone_5505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WearTreasureStone_5505 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WearTreasureStone_5505)PARSER.parseFrom(data);
      }

      public static C2S_WearTreasureStone_5505 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WearTreasureStone_5505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WearTreasureStone_5505 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WearTreasureStone_5505)PARSER.parseFrom(data);
      }

      public static C2S_WearTreasureStone_5505 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WearTreasureStone_5505)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WearTreasureStone_5505 parseFrom(InputStream input) throws IOException {
         return (C2S_WearTreasureStone_5505)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WearTreasureStone_5505 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WearTreasureStone_5505)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WearTreasureStone_5505 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WearTreasureStone_5505)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WearTreasureStone_5505 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WearTreasureStone_5505)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WearTreasureStone_5505 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WearTreasureStone_5505)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WearTreasureStone_5505 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WearTreasureStone_5505)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WearTreasureStone_5505 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WearTreasureStone_5505 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WearTreasureStone_5505> parser() {
         return PARSER;
      }

      public Parser<C2S_WearTreasureStone_5505> getParserForType() {
         return PARSER;
      }

      public C2S_WearTreasureStone_5505 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WearTreasureStone_5505OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;
         private int itemCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_WearTreasureStone_5505_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_WearTreasureStone_5505_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WearTreasureStone_5505.class, Builder.class);
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
            if (ExclusiveTreasureMsg.C2S_WearTreasureStone_5505.alwaysUseFieldBuilders) {
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
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_WearTreasureStone_5505_descriptor;
         }

         public C2S_WearTreasureStone_5505 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.C2S_WearTreasureStone_5505.getDefaultInstance();
         }

         public C2S_WearTreasureStone_5505 build() {
            C2S_WearTreasureStone_5505 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WearTreasureStone_5505 buildPartial() {
            C2S_WearTreasureStone_5505 result = new C2S_WearTreasureStone_5505(this);
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
            if (other instanceof C2S_WearTreasureStone_5505) {
               return this.mergeFrom((C2S_WearTreasureStone_5505)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WearTreasureStone_5505 other) {
            if (other == ExclusiveTreasureMsg.C2S_WearTreasureStone_5505.getDefaultInstance()) {
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
               return this.hasItemCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_WearTreasureStone_5505 parsedMessage = null;

            try {
               parsedMessage = (C2S_WearTreasureStone_5505)ExclusiveTreasureMsg.C2S_WearTreasureStone_5505.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WearTreasureStone_5505)e.getUnfinishedMessage();
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

         public CommonMsg.StonePosition getPosition() {
            CommonMsg.StonePosition result = CommonMsg.StonePosition.valueOf(this.position_);
            return result == null ? CommonMsg.StonePosition.WEAR_STONE_1 : result;
         }

         public Builder setPosition(CommonMsg.StonePosition value) {
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_WearTreasureStone_5506 extends GeneratedMessageV3 implements S2C_WearTreasureStone_5506OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      public static final int TREASUREINFO_FIELD_NUMBER = 3;
      private ExclusiveTreasureInfo treasureInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_WearTreasureStone_5506 DEFAULT_INSTANCE = new S2C_WearTreasureStone_5506();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WearTreasureStone_5506> PARSER = new AbstractParser<S2C_WearTreasureStone_5506>() {
         public S2C_WearTreasureStone_5506 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WearTreasureStone_5506(input, extensionRegistry);
         }
      };

      private S2C_WearTreasureStone_5506(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WearTreasureStone_5506() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WearTreasureStone_5506();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WearTreasureStone_5506(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CommonMsg.StonePosition value = CommonMsg.StonePosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.position_ = rawValue;
                        }
                        break;
                     case 26:
                        ExclusiveTreasureInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.treasureInfo_.toBuilder();
                        }

                        this.treasureInfo_ = (ExclusiveTreasureInfo)input.readMessage(ExclusiveTreasureMsg.ExclusiveTreasureInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.treasureInfo_);
                           this.treasureInfo_ = subBuilder.buildPartial();
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_WearTreasureStone_5506_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_WearTreasureStone_5506_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WearTreasureStone_5506.class, Builder.class);
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

      public CommonMsg.StonePosition getPosition() {
         CommonMsg.StonePosition result = CommonMsg.StonePosition.valueOf(this.position_);
         return result == null ? CommonMsg.StonePosition.WEAR_STONE_1 : result;
      }

      public boolean hasTreasureInfo() {
         return (this.bitField0_ & 4) != 0;
      }

      public ExclusiveTreasureInfo getTreasureInfo() {
         return this.treasureInfo_ == null ? ExclusiveTreasureMsg.ExclusiveTreasureInfo.getDefaultInstance() : this.treasureInfo_;
      }

      public ExclusiveTreasureInfoOrBuilder getTreasureInfoOrBuilder() {
         return this.treasureInfo_ == null ? ExclusiveTreasureMsg.ExclusiveTreasureInfo.getDefaultInstance() : this.treasureInfo_;
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
         } else if (!this.hasTreasureInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getTreasureInfo().isInitialized()) {
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
            output.writeMessage(3, this.getTreasureInfo());
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
               size += CodedOutputStream.computeMessageSize(3, this.getTreasureInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WearTreasureStone_5506)) {
            return super.equals(obj);
         } else {
            S2C_WearTreasureStone_5506 other = (S2C_WearTreasureStone_5506)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (this.hasTreasureInfo() != other.hasTreasureInfo()) {
               return false;
            } else if (this.hasTreasureInfo() && !this.getTreasureInfo().equals(other.getTreasureInfo())) {
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

            if (this.hasTreasureInfo()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTreasureInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WearTreasureStone_5506 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WearTreasureStone_5506)PARSER.parseFrom(data);
      }

      public static S2C_WearTreasureStone_5506 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WearTreasureStone_5506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WearTreasureStone_5506 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WearTreasureStone_5506)PARSER.parseFrom(data);
      }

      public static S2C_WearTreasureStone_5506 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WearTreasureStone_5506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WearTreasureStone_5506 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WearTreasureStone_5506)PARSER.parseFrom(data);
      }

      public static S2C_WearTreasureStone_5506 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WearTreasureStone_5506)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WearTreasureStone_5506 parseFrom(InputStream input) throws IOException {
         return (S2C_WearTreasureStone_5506)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WearTreasureStone_5506 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WearTreasureStone_5506)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WearTreasureStone_5506 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WearTreasureStone_5506)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WearTreasureStone_5506 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WearTreasureStone_5506)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WearTreasureStone_5506 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WearTreasureStone_5506)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WearTreasureStone_5506 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WearTreasureStone_5506)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WearTreasureStone_5506 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WearTreasureStone_5506 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WearTreasureStone_5506> parser() {
         return PARSER;
      }

      public Parser<S2C_WearTreasureStone_5506> getParserForType() {
         return PARSER;
      }

      public S2C_WearTreasureStone_5506 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WearTreasureStone_5506OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;
         private ExclusiveTreasureInfo treasureInfo_;
         private SingleFieldBuilderV3<ExclusiveTreasureInfo, ExclusiveTreasureInfo.Builder, ExclusiveTreasureInfoOrBuilder> treasureInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_WearTreasureStone_5506_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_WearTreasureStone_5506_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WearTreasureStone_5506.class, Builder.class);
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
            if (ExclusiveTreasureMsg.S2C_WearTreasureStone_5506.alwaysUseFieldBuilders) {
               this.getTreasureInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.bitField0_ &= -3;
            if (this.treasureInfoBuilder_ == null) {
               this.treasureInfo_ = null;
            } else {
               this.treasureInfoBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_WearTreasureStone_5506_descriptor;
         }

         public S2C_WearTreasureStone_5506 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.S2C_WearTreasureStone_5506.getDefaultInstance();
         }

         public S2C_WearTreasureStone_5506 build() {
            S2C_WearTreasureStone_5506 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WearTreasureStone_5506 buildPartial() {
            S2C_WearTreasureStone_5506 result = new S2C_WearTreasureStone_5506(this);
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
               if (this.treasureInfoBuilder_ == null) {
                  result.treasureInfo_ = this.treasureInfo_;
               } else {
                  result.treasureInfo_ = (ExclusiveTreasureInfo)this.treasureInfoBuilder_.build();
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
            if (other instanceof S2C_WearTreasureStone_5506) {
               return this.mergeFrom((S2C_WearTreasureStone_5506)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WearTreasureStone_5506 other) {
            if (other == ExclusiveTreasureMsg.S2C_WearTreasureStone_5506.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasTreasureInfo()) {
                  this.mergeTreasureInfo(other.getTreasureInfo());
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
            } else if (!this.hasTreasureInfo()) {
               return false;
            } else {
               return this.getTreasureInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WearTreasureStone_5506 parsedMessage = null;

            try {
               parsedMessage = (S2C_WearTreasureStone_5506)ExclusiveTreasureMsg.S2C_WearTreasureStone_5506.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WearTreasureStone_5506)e.getUnfinishedMessage();
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

         public CommonMsg.StonePosition getPosition() {
            CommonMsg.StonePosition result = CommonMsg.StonePosition.valueOf(this.position_);
            return result == null ? CommonMsg.StonePosition.WEAR_STONE_1 : result;
         }

         public Builder setPosition(CommonMsg.StonePosition value) {
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

         public boolean hasTreasureInfo() {
            return (this.bitField0_ & 4) != 0;
         }

         public ExclusiveTreasureInfo getTreasureInfo() {
            if (this.treasureInfoBuilder_ == null) {
               return this.treasureInfo_ == null ? ExclusiveTreasureMsg.ExclusiveTreasureInfo.getDefaultInstance() : this.treasureInfo_;
            } else {
               return (ExclusiveTreasureInfo)this.treasureInfoBuilder_.getMessage();
            }
         }

         public Builder setTreasureInfo(ExclusiveTreasureInfo value) {
            if (this.treasureInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.treasureInfo_ = value;
               this.onChanged();
            } else {
               this.treasureInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setTreasureInfo(ExclusiveTreasureInfo.Builder builderForValue) {
            if (this.treasureInfoBuilder_ == null) {
               this.treasureInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.treasureInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeTreasureInfo(ExclusiveTreasureInfo value) {
            if (this.treasureInfoBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.treasureInfo_ != null && this.treasureInfo_ != ExclusiveTreasureMsg.ExclusiveTreasureInfo.getDefaultInstance()) {
                  this.treasureInfo_ = ExclusiveTreasureMsg.ExclusiveTreasureInfo.newBuilder(this.treasureInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.treasureInfo_ = value;
               }

               this.onChanged();
            } else {
               this.treasureInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearTreasureInfo() {
            if (this.treasureInfoBuilder_ == null) {
               this.treasureInfo_ = null;
               this.onChanged();
            } else {
               this.treasureInfoBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public ExclusiveTreasureInfo.Builder getTreasureInfoBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (ExclusiveTreasureInfo.Builder)this.getTreasureInfoFieldBuilder().getBuilder();
         }

         public ExclusiveTreasureInfoOrBuilder getTreasureInfoOrBuilder() {
            if (this.treasureInfoBuilder_ != null) {
               return (ExclusiveTreasureInfoOrBuilder)this.treasureInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.treasureInfo_ == null ? ExclusiveTreasureMsg.ExclusiveTreasureInfo.getDefaultInstance() : this.treasureInfo_;
            }
         }

         private SingleFieldBuilderV3<ExclusiveTreasureInfo, ExclusiveTreasureInfo.Builder, ExclusiveTreasureInfoOrBuilder> getTreasureInfoFieldBuilder() {
            if (this.treasureInfoBuilder_ == null) {
               this.treasureInfoBuilder_ = new SingleFieldBuilderV3(this.getTreasureInfo(), this.getParentForChildren(), this.isClean());
               this.treasureInfo_ = null;
            }

            return this.treasureInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_RecastTreasure_5507 extends GeneratedMessageV3 implements C2S_RecastTreasure_5507OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int UNLOCK_FIELD_NUMBER = 2;
      private int unLock_;
      private byte memoizedIsInitialized;
      private static final C2S_RecastTreasure_5507 DEFAULT_INSTANCE = new C2S_RecastTreasure_5507();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_RecastTreasure_5507> PARSER = new AbstractParser<C2S_RecastTreasure_5507>() {
         public C2S_RecastTreasure_5507 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_RecastTreasure_5507(input, extensionRegistry);
         }
      };

      private C2S_RecastTreasure_5507(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_RecastTreasure_5507() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_RecastTreasure_5507();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_RecastTreasure_5507(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.unLock_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_RecastTreasure_5507_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_RecastTreasure_5507_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecastTreasure_5507.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasUnLock() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getUnLock() {
         return this.unLock_;
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
         } else if (!this.hasUnLock()) {
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
            output.writeInt32(2, this.unLock_);
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
               size += CodedOutputStream.computeInt32Size(2, this.unLock_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_RecastTreasure_5507)) {
            return super.equals(obj);
         } else {
            C2S_RecastTreasure_5507 other = (C2S_RecastTreasure_5507)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasUnLock() != other.hasUnLock()) {
               return false;
            } else if (this.hasUnLock() && this.getUnLock() != other.getUnLock()) {
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

            if (this.hasUnLock()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getUnLock();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_RecastTreasure_5507 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_RecastTreasure_5507)PARSER.parseFrom(data);
      }

      public static C2S_RecastTreasure_5507 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecastTreasure_5507)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecastTreasure_5507 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_RecastTreasure_5507)PARSER.parseFrom(data);
      }

      public static C2S_RecastTreasure_5507 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecastTreasure_5507)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecastTreasure_5507 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_RecastTreasure_5507)PARSER.parseFrom(data);
      }

      public static C2S_RecastTreasure_5507 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_RecastTreasure_5507)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_RecastTreasure_5507 parseFrom(InputStream input) throws IOException {
         return (C2S_RecastTreasure_5507)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecastTreasure_5507 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecastTreasure_5507)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecastTreasure_5507 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_RecastTreasure_5507)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_RecastTreasure_5507 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecastTreasure_5507)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_RecastTreasure_5507 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_RecastTreasure_5507)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_RecastTreasure_5507 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_RecastTreasure_5507)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_RecastTreasure_5507 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_RecastTreasure_5507 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_RecastTreasure_5507> parser() {
         return PARSER;
      }

      public Parser<C2S_RecastTreasure_5507> getParserForType() {
         return PARSER;
      }

      public C2S_RecastTreasure_5507 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_RecastTreasure_5507OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int unLock_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_RecastTreasure_5507_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_RecastTreasure_5507_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_RecastTreasure_5507.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveTreasureMsg.C2S_RecastTreasure_5507.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.unLock_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_RecastTreasure_5507_descriptor;
         }

         public C2S_RecastTreasure_5507 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.C2S_RecastTreasure_5507.getDefaultInstance();
         }

         public C2S_RecastTreasure_5507 build() {
            C2S_RecastTreasure_5507 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_RecastTreasure_5507 buildPartial() {
            C2S_RecastTreasure_5507 result = new C2S_RecastTreasure_5507(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.unLock_ = this.unLock_;
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
            if (other instanceof C2S_RecastTreasure_5507) {
               return this.mergeFrom((C2S_RecastTreasure_5507)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_RecastTreasure_5507 other) {
            if (other == ExclusiveTreasureMsg.C2S_RecastTreasure_5507.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasUnLock()) {
                  this.setUnLock(other.getUnLock());
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
               return this.hasUnLock();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_RecastTreasure_5507 parsedMessage = null;

            try {
               parsedMessage = (C2S_RecastTreasure_5507)ExclusiveTreasureMsg.C2S_RecastTreasure_5507.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_RecastTreasure_5507)e.getUnfinishedMessage();
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

         public boolean hasUnLock() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getUnLock() {
            return this.unLock_;
         }

         public Builder setUnLock(int value) {
            this.bitField0_ |= 2;
            this.unLock_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnLock() {
            this.bitField0_ &= -3;
            this.unLock_ = 0;
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

   public static final class S2C_RecastTreasure_5508 extends GeneratedMessageV3 implements S2C_RecastTreasure_5508OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int UNLOCK_FIELD_NUMBER = 2;
      private int unLock_;
      public static final int RECAST_FIELD_NUMBER = 3;
      private RecastTreasure recast_;
      private byte memoizedIsInitialized;
      private static final S2C_RecastTreasure_5508 DEFAULT_INSTANCE = new S2C_RecastTreasure_5508();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RecastTreasure_5508> PARSER = new AbstractParser<S2C_RecastTreasure_5508>() {
         public S2C_RecastTreasure_5508 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RecastTreasure_5508(input, extensionRegistry);
         }
      };

      private S2C_RecastTreasure_5508(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RecastTreasure_5508() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RecastTreasure_5508();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RecastTreasure_5508(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.unLock_ = input.readInt32();
                        break;
                     case 26:
                        RecastTreasure.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.recast_.toBuilder();
                        }

                        this.recast_ = (RecastTreasure)input.readMessage(ExclusiveTreasureMsg.RecastTreasure.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.recast_);
                           this.recast_ = subBuilder.buildPartial();
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_RecastTreasure_5508_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_RecastTreasure_5508_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecastTreasure_5508.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasUnLock() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getUnLock() {
         return this.unLock_;
      }

      public boolean hasRecast() {
         return (this.bitField0_ & 4) != 0;
      }

      public RecastTreasure getRecast() {
         return this.recast_ == null ? ExclusiveTreasureMsg.RecastTreasure.getDefaultInstance() : this.recast_;
      }

      public RecastTreasureOrBuilder getRecastOrBuilder() {
         return this.recast_ == null ? ExclusiveTreasureMsg.RecastTreasure.getDefaultInstance() : this.recast_;
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
         } else if (!this.hasUnLock()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasRecast() && !this.getRecast().isInitialized()) {
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
            output.writeInt32(2, this.unLock_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(3, this.getRecast());
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
               size += CodedOutputStream.computeInt32Size(2, this.unLock_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(3, this.getRecast());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RecastTreasure_5508)) {
            return super.equals(obj);
         } else {
            S2C_RecastTreasure_5508 other = (S2C_RecastTreasure_5508)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasUnLock() != other.hasUnLock()) {
               return false;
            } else if (this.hasUnLock() && this.getUnLock() != other.getUnLock()) {
               return false;
            } else if (this.hasRecast() != other.hasRecast()) {
               return false;
            } else if (this.hasRecast() && !this.getRecast().equals(other.getRecast())) {
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

            if (this.hasUnLock()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getUnLock();
            }

            if (this.hasRecast()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRecast().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RecastTreasure_5508 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RecastTreasure_5508)PARSER.parseFrom(data);
      }

      public static S2C_RecastTreasure_5508 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecastTreasure_5508)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecastTreasure_5508 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RecastTreasure_5508)PARSER.parseFrom(data);
      }

      public static S2C_RecastTreasure_5508 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecastTreasure_5508)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecastTreasure_5508 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RecastTreasure_5508)PARSER.parseFrom(data);
      }

      public static S2C_RecastTreasure_5508 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RecastTreasure_5508)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RecastTreasure_5508 parseFrom(InputStream input) throws IOException {
         return (S2C_RecastTreasure_5508)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecastTreasure_5508 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecastTreasure_5508)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecastTreasure_5508 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RecastTreasure_5508)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RecastTreasure_5508 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecastTreasure_5508)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RecastTreasure_5508 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RecastTreasure_5508)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RecastTreasure_5508 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RecastTreasure_5508)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RecastTreasure_5508 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RecastTreasure_5508 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RecastTreasure_5508> parser() {
         return PARSER;
      }

      public Parser<S2C_RecastTreasure_5508> getParserForType() {
         return PARSER;
      }

      public S2C_RecastTreasure_5508 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RecastTreasure_5508OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int unLock_;
         private RecastTreasure recast_;
         private SingleFieldBuilderV3<RecastTreasure, RecastTreasure.Builder, RecastTreasureOrBuilder> recastBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_RecastTreasure_5508_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_RecastTreasure_5508_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RecastTreasure_5508.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveTreasureMsg.S2C_RecastTreasure_5508.alwaysUseFieldBuilders) {
               this.getRecastFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.unLock_ = 0;
            this.bitField0_ &= -3;
            if (this.recastBuilder_ == null) {
               this.recast_ = null;
            } else {
               this.recastBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_RecastTreasure_5508_descriptor;
         }

         public S2C_RecastTreasure_5508 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.S2C_RecastTreasure_5508.getDefaultInstance();
         }

         public S2C_RecastTreasure_5508 build() {
            S2C_RecastTreasure_5508 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RecastTreasure_5508 buildPartial() {
            S2C_RecastTreasure_5508 result = new S2C_RecastTreasure_5508(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.unLock_ = this.unLock_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               if (this.recastBuilder_ == null) {
                  result.recast_ = this.recast_;
               } else {
                  result.recast_ = (RecastTreasure)this.recastBuilder_.build();
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
            if (other instanceof S2C_RecastTreasure_5508) {
               return this.mergeFrom((S2C_RecastTreasure_5508)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RecastTreasure_5508 other) {
            if (other == ExclusiveTreasureMsg.S2C_RecastTreasure_5508.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasUnLock()) {
                  this.setUnLock(other.getUnLock());
               }

               if (other.hasRecast()) {
                  this.mergeRecast(other.getRecast());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasUnLock()) {
               return false;
            } else {
               return !this.hasRecast() || this.getRecast().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RecastTreasure_5508 parsedMessage = null;

            try {
               parsedMessage = (S2C_RecastTreasure_5508)ExclusiveTreasureMsg.S2C_RecastTreasure_5508.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RecastTreasure_5508)e.getUnfinishedMessage();
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

         public boolean hasUnLock() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getUnLock() {
            return this.unLock_;
         }

         public Builder setUnLock(int value) {
            this.bitField0_ |= 2;
            this.unLock_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnLock() {
            this.bitField0_ &= -3;
            this.unLock_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRecast() {
            return (this.bitField0_ & 4) != 0;
         }

         public RecastTreasure getRecast() {
            if (this.recastBuilder_ == null) {
               return this.recast_ == null ? ExclusiveTreasureMsg.RecastTreasure.getDefaultInstance() : this.recast_;
            } else {
               return (RecastTreasure)this.recastBuilder_.getMessage();
            }
         }

         public Builder setRecast(RecastTreasure value) {
            if (this.recastBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.recast_ = value;
               this.onChanged();
            } else {
               this.recastBuilder_.setMessage(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setRecast(RecastTreasure.Builder builderForValue) {
            if (this.recastBuilder_ == null) {
               this.recast_ = builderForValue.build();
               this.onChanged();
            } else {
               this.recastBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeRecast(RecastTreasure value) {
            if (this.recastBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.recast_ != null && this.recast_ != ExclusiveTreasureMsg.RecastTreasure.getDefaultInstance()) {
                  this.recast_ = ExclusiveTreasureMsg.RecastTreasure.newBuilder(this.recast_).mergeFrom(value).buildPartial();
               } else {
                  this.recast_ = value;
               }

               this.onChanged();
            } else {
               this.recastBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearRecast() {
            if (this.recastBuilder_ == null) {
               this.recast_ = null;
               this.onChanged();
            } else {
               this.recastBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public RecastTreasure.Builder getRecastBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (RecastTreasure.Builder)this.getRecastFieldBuilder().getBuilder();
         }

         public RecastTreasureOrBuilder getRecastOrBuilder() {
            if (this.recastBuilder_ != null) {
               return (RecastTreasureOrBuilder)this.recastBuilder_.getMessageOrBuilder();
            } else {
               return this.recast_ == null ? ExclusiveTreasureMsg.RecastTreasure.getDefaultInstance() : this.recast_;
            }
         }

         private SingleFieldBuilderV3<RecastTreasure, RecastTreasure.Builder, RecastTreasureOrBuilder> getRecastFieldBuilder() {
            if (this.recastBuilder_ == null) {
               this.recastBuilder_ = new SingleFieldBuilderV3(this.getRecast(), this.getParentForChildren(), this.isClean());
               this.recast_ = null;
            }

            return this.recastBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_SaveRecast_5509 extends GeneratedMessageV3 implements C2S_SaveRecast_5509OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_SaveRecast_5509 DEFAULT_INSTANCE = new C2S_SaveRecast_5509();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SaveRecast_5509> PARSER = new AbstractParser<C2S_SaveRecast_5509>() {
         public C2S_SaveRecast_5509 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SaveRecast_5509(input, extensionRegistry);
         }
      };

      private C2S_SaveRecast_5509(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SaveRecast_5509() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SaveRecast_5509();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SaveRecast_5509(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_SaveRecast_5509_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_SaveRecast_5509_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SaveRecast_5509.class, Builder.class);
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
         } else if (!(obj instanceof C2S_SaveRecast_5509)) {
            return super.equals(obj);
         } else {
            C2S_SaveRecast_5509 other = (C2S_SaveRecast_5509)obj;
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

      public static C2S_SaveRecast_5509 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SaveRecast_5509)PARSER.parseFrom(data);
      }

      public static C2S_SaveRecast_5509 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SaveRecast_5509)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SaveRecast_5509 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SaveRecast_5509)PARSER.parseFrom(data);
      }

      public static C2S_SaveRecast_5509 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SaveRecast_5509)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SaveRecast_5509 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SaveRecast_5509)PARSER.parseFrom(data);
      }

      public static C2S_SaveRecast_5509 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SaveRecast_5509)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SaveRecast_5509 parseFrom(InputStream input) throws IOException {
         return (C2S_SaveRecast_5509)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SaveRecast_5509 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SaveRecast_5509)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SaveRecast_5509 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SaveRecast_5509)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SaveRecast_5509 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SaveRecast_5509)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SaveRecast_5509 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SaveRecast_5509)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SaveRecast_5509 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SaveRecast_5509)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SaveRecast_5509 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SaveRecast_5509 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SaveRecast_5509> parser() {
         return PARSER;
      }

      public Parser<C2S_SaveRecast_5509> getParserForType() {
         return PARSER;
      }

      public C2S_SaveRecast_5509 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SaveRecast_5509OrBuilder {
         private int bitField0_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_SaveRecast_5509_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_SaveRecast_5509_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SaveRecast_5509.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveTreasureMsg.C2S_SaveRecast_5509.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_SaveRecast_5509_descriptor;
         }

         public C2S_SaveRecast_5509 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.C2S_SaveRecast_5509.getDefaultInstance();
         }

         public C2S_SaveRecast_5509 build() {
            C2S_SaveRecast_5509 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SaveRecast_5509 buildPartial() {
            C2S_SaveRecast_5509 result = new C2S_SaveRecast_5509(this);
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
            if (other instanceof C2S_SaveRecast_5509) {
               return this.mergeFrom((C2S_SaveRecast_5509)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SaveRecast_5509 other) {
            if (other == ExclusiveTreasureMsg.C2S_SaveRecast_5509.getDefaultInstance()) {
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
            C2S_SaveRecast_5509 parsedMessage = null;

            try {
               parsedMessage = (C2S_SaveRecast_5509)ExclusiveTreasureMsg.C2S_SaveRecast_5509.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SaveRecast_5509)e.getUnfinishedMessage();
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

   public static final class S2C_SaveRecast_5510 extends GeneratedMessageV3 implements S2C_SaveRecast_5510OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int BASETREASURE_FIELD_NUMBER = 2;
      private RecastTreasure baseTreasure_;
      public static final int RECAST_FIELD_NUMBER = 3;
      private RecastTreasure recast_;
      private byte memoizedIsInitialized;
      private static final S2C_SaveRecast_5510 DEFAULT_INSTANCE = new S2C_SaveRecast_5510();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SaveRecast_5510> PARSER = new AbstractParser<S2C_SaveRecast_5510>() {
         public S2C_SaveRecast_5510 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SaveRecast_5510(input, extensionRegistry);
         }
      };

      private S2C_SaveRecast_5510(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SaveRecast_5510() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SaveRecast_5510();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SaveRecast_5510(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        RecastTreasure.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.baseTreasure_.toBuilder();
                        }

                        this.baseTreasure_ = (RecastTreasure)input.readMessage(ExclusiveTreasureMsg.RecastTreasure.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.baseTreasure_);
                           this.baseTreasure_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 26:
                        RecastTreasure.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.recast_.toBuilder();
                        }

                        this.recast_ = (RecastTreasure)input.readMessage(ExclusiveTreasureMsg.RecastTreasure.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.recast_);
                           this.recast_ = subBuilder.buildPartial();
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_SaveRecast_5510_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_SaveRecast_5510_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SaveRecast_5510.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasBaseTreasure() {
         return (this.bitField0_ & 2) != 0;
      }

      public RecastTreasure getBaseTreasure() {
         return this.baseTreasure_ == null ? ExclusiveTreasureMsg.RecastTreasure.getDefaultInstance() : this.baseTreasure_;
      }

      public RecastTreasureOrBuilder getBaseTreasureOrBuilder() {
         return this.baseTreasure_ == null ? ExclusiveTreasureMsg.RecastTreasure.getDefaultInstance() : this.baseTreasure_;
      }

      public boolean hasRecast() {
         return (this.bitField0_ & 4) != 0;
      }

      public RecastTreasure getRecast() {
         return this.recast_ == null ? ExclusiveTreasureMsg.RecastTreasure.getDefaultInstance() : this.recast_;
      }

      public RecastTreasureOrBuilder getRecastOrBuilder() {
         return this.recast_ == null ? ExclusiveTreasureMsg.RecastTreasure.getDefaultInstance() : this.recast_;
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
         } else if (!this.hasBaseTreasure()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getBaseTreasure().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasRecast() && !this.getRecast().isInitialized()) {
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
            output.writeMessage(2, this.getBaseTreasure());
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(3, this.getRecast());
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
               size += CodedOutputStream.computeMessageSize(2, this.getBaseTreasure());
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(3, this.getRecast());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SaveRecast_5510)) {
            return super.equals(obj);
         } else {
            S2C_SaveRecast_5510 other = (S2C_SaveRecast_5510)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasBaseTreasure() != other.hasBaseTreasure()) {
               return false;
            } else if (this.hasBaseTreasure() && !this.getBaseTreasure().equals(other.getBaseTreasure())) {
               return false;
            } else if (this.hasRecast() != other.hasRecast()) {
               return false;
            } else if (this.hasRecast() && !this.getRecast().equals(other.getRecast())) {
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

            if (this.hasBaseTreasure()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBaseTreasure().hashCode();
            }

            if (this.hasRecast()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRecast().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SaveRecast_5510 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SaveRecast_5510)PARSER.parseFrom(data);
      }

      public static S2C_SaveRecast_5510 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SaveRecast_5510)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SaveRecast_5510 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SaveRecast_5510)PARSER.parseFrom(data);
      }

      public static S2C_SaveRecast_5510 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SaveRecast_5510)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SaveRecast_5510 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SaveRecast_5510)PARSER.parseFrom(data);
      }

      public static S2C_SaveRecast_5510 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SaveRecast_5510)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SaveRecast_5510 parseFrom(InputStream input) throws IOException {
         return (S2C_SaveRecast_5510)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SaveRecast_5510 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SaveRecast_5510)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SaveRecast_5510 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SaveRecast_5510)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SaveRecast_5510 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SaveRecast_5510)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SaveRecast_5510 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SaveRecast_5510)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SaveRecast_5510 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SaveRecast_5510)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SaveRecast_5510 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SaveRecast_5510 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SaveRecast_5510> parser() {
         return PARSER;
      }

      public Parser<S2C_SaveRecast_5510> getParserForType() {
         return PARSER;
      }

      public S2C_SaveRecast_5510 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SaveRecast_5510OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private RecastTreasure baseTreasure_;
         private SingleFieldBuilderV3<RecastTreasure, RecastTreasure.Builder, RecastTreasureOrBuilder> baseTreasureBuilder_;
         private RecastTreasure recast_;
         private SingleFieldBuilderV3<RecastTreasure, RecastTreasure.Builder, RecastTreasureOrBuilder> recastBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_SaveRecast_5510_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_SaveRecast_5510_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SaveRecast_5510.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveTreasureMsg.S2C_SaveRecast_5510.alwaysUseFieldBuilders) {
               this.getBaseTreasureFieldBuilder();
               this.getRecastFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            if (this.baseTreasureBuilder_ == null) {
               this.baseTreasure_ = null;
            } else {
               this.baseTreasureBuilder_.clear();
            }

            this.bitField0_ &= -3;
            if (this.recastBuilder_ == null) {
               this.recast_ = null;
            } else {
               this.recastBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_SaveRecast_5510_descriptor;
         }

         public S2C_SaveRecast_5510 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.S2C_SaveRecast_5510.getDefaultInstance();
         }

         public S2C_SaveRecast_5510 build() {
            S2C_SaveRecast_5510 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SaveRecast_5510 buildPartial() {
            S2C_SaveRecast_5510 result = new S2C_SaveRecast_5510(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.baseTreasureBuilder_ == null) {
                  result.baseTreasure_ = this.baseTreasure_;
               } else {
                  result.baseTreasure_ = (RecastTreasure)this.baseTreasureBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               if (this.recastBuilder_ == null) {
                  result.recast_ = this.recast_;
               } else {
                  result.recast_ = (RecastTreasure)this.recastBuilder_.build();
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
            if (other instanceof S2C_SaveRecast_5510) {
               return this.mergeFrom((S2C_SaveRecast_5510)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SaveRecast_5510 other) {
            if (other == ExclusiveTreasureMsg.S2C_SaveRecast_5510.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasBaseTreasure()) {
                  this.mergeBaseTreasure(other.getBaseTreasure());
               }

               if (other.hasRecast()) {
                  this.mergeRecast(other.getRecast());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasBaseTreasure()) {
               return false;
            } else if (!this.getBaseTreasure().isInitialized()) {
               return false;
            } else {
               return !this.hasRecast() || this.getRecast().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SaveRecast_5510 parsedMessage = null;

            try {
               parsedMessage = (S2C_SaveRecast_5510)ExclusiveTreasureMsg.S2C_SaveRecast_5510.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SaveRecast_5510)e.getUnfinishedMessage();
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

         public boolean hasBaseTreasure() {
            return (this.bitField0_ & 2) != 0;
         }

         public RecastTreasure getBaseTreasure() {
            if (this.baseTreasureBuilder_ == null) {
               return this.baseTreasure_ == null ? ExclusiveTreasureMsg.RecastTreasure.getDefaultInstance() : this.baseTreasure_;
            } else {
               return (RecastTreasure)this.baseTreasureBuilder_.getMessage();
            }
         }

         public Builder setBaseTreasure(RecastTreasure value) {
            if (this.baseTreasureBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.baseTreasure_ = value;
               this.onChanged();
            } else {
               this.baseTreasureBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setBaseTreasure(RecastTreasure.Builder builderForValue) {
            if (this.baseTreasureBuilder_ == null) {
               this.baseTreasure_ = builderForValue.build();
               this.onChanged();
            } else {
               this.baseTreasureBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeBaseTreasure(RecastTreasure value) {
            if (this.baseTreasureBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.baseTreasure_ != null && this.baseTreasure_ != ExclusiveTreasureMsg.RecastTreasure.getDefaultInstance()) {
                  this.baseTreasure_ = ExclusiveTreasureMsg.RecastTreasure.newBuilder(this.baseTreasure_).mergeFrom(value).buildPartial();
               } else {
                  this.baseTreasure_ = value;
               }

               this.onChanged();
            } else {
               this.baseTreasureBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearBaseTreasure() {
            if (this.baseTreasureBuilder_ == null) {
               this.baseTreasure_ = null;
               this.onChanged();
            } else {
               this.baseTreasureBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public RecastTreasure.Builder getBaseTreasureBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (RecastTreasure.Builder)this.getBaseTreasureFieldBuilder().getBuilder();
         }

         public RecastTreasureOrBuilder getBaseTreasureOrBuilder() {
            if (this.baseTreasureBuilder_ != null) {
               return (RecastTreasureOrBuilder)this.baseTreasureBuilder_.getMessageOrBuilder();
            } else {
               return this.baseTreasure_ == null ? ExclusiveTreasureMsg.RecastTreasure.getDefaultInstance() : this.baseTreasure_;
            }
         }

         private SingleFieldBuilderV3<RecastTreasure, RecastTreasure.Builder, RecastTreasureOrBuilder> getBaseTreasureFieldBuilder() {
            if (this.baseTreasureBuilder_ == null) {
               this.baseTreasureBuilder_ = new SingleFieldBuilderV3(this.getBaseTreasure(), this.getParentForChildren(), this.isClean());
               this.baseTreasure_ = null;
            }

            return this.baseTreasureBuilder_;
         }

         public boolean hasRecast() {
            return (this.bitField0_ & 4) != 0;
         }

         public RecastTreasure getRecast() {
            if (this.recastBuilder_ == null) {
               return this.recast_ == null ? ExclusiveTreasureMsg.RecastTreasure.getDefaultInstance() : this.recast_;
            } else {
               return (RecastTreasure)this.recastBuilder_.getMessage();
            }
         }

         public Builder setRecast(RecastTreasure value) {
            if (this.recastBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.recast_ = value;
               this.onChanged();
            } else {
               this.recastBuilder_.setMessage(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setRecast(RecastTreasure.Builder builderForValue) {
            if (this.recastBuilder_ == null) {
               this.recast_ = builderForValue.build();
               this.onChanged();
            } else {
               this.recastBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeRecast(RecastTreasure value) {
            if (this.recastBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.recast_ != null && this.recast_ != ExclusiveTreasureMsg.RecastTreasure.getDefaultInstance()) {
                  this.recast_ = ExclusiveTreasureMsg.RecastTreasure.newBuilder(this.recast_).mergeFrom(value).buildPartial();
               } else {
                  this.recast_ = value;
               }

               this.onChanged();
            } else {
               this.recastBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearRecast() {
            if (this.recastBuilder_ == null) {
               this.recast_ = null;
               this.onChanged();
            } else {
               this.recastBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public RecastTreasure.Builder getRecastBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (RecastTreasure.Builder)this.getRecastFieldBuilder().getBuilder();
         }

         public RecastTreasureOrBuilder getRecastOrBuilder() {
            if (this.recastBuilder_ != null) {
               return (RecastTreasureOrBuilder)this.recastBuilder_.getMessageOrBuilder();
            } else {
               return this.recast_ == null ? ExclusiveTreasureMsg.RecastTreasure.getDefaultInstance() : this.recast_;
            }
         }

         private SingleFieldBuilderV3<RecastTreasure, RecastTreasure.Builder, RecastTreasureOrBuilder> getRecastFieldBuilder() {
            if (this.recastBuilder_ == null) {
               this.recastBuilder_ = new SingleFieldBuilderV3(this.getRecast(), this.getParentForChildren(), this.isClean());
               this.recast_ = null;
            }

            return this.recastBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_UpLev_5511 extends GeneratedMessageV3 implements C2S_UpLev_5511OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_UpLev_5511 DEFAULT_INSTANCE = new C2S_UpLev_5511();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UpLev_5511> PARSER = new AbstractParser<C2S_UpLev_5511>() {
         public C2S_UpLev_5511 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UpLev_5511(input, extensionRegistry);
         }
      };

      private C2S_UpLev_5511(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UpLev_5511() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UpLev_5511();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UpLev_5511(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UpLev_5511_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UpLev_5511_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UpLev_5511.class, Builder.class);
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
         } else if (!(obj instanceof C2S_UpLev_5511)) {
            return super.equals(obj);
         } else {
            C2S_UpLev_5511 other = (C2S_UpLev_5511)obj;
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

      public static C2S_UpLev_5511 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UpLev_5511)PARSER.parseFrom(data);
      }

      public static C2S_UpLev_5511 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpLev_5511)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpLev_5511 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UpLev_5511)PARSER.parseFrom(data);
      }

      public static C2S_UpLev_5511 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpLev_5511)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpLev_5511 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UpLev_5511)PARSER.parseFrom(data);
      }

      public static C2S_UpLev_5511 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpLev_5511)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpLev_5511 parseFrom(InputStream input) throws IOException {
         return (C2S_UpLev_5511)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UpLev_5511 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpLev_5511)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UpLev_5511 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UpLev_5511)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UpLev_5511 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpLev_5511)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UpLev_5511 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UpLev_5511)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UpLev_5511 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpLev_5511)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UpLev_5511 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UpLev_5511 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UpLev_5511> parser() {
         return PARSER;
      }

      public Parser<C2S_UpLev_5511> getParserForType() {
         return PARSER;
      }

      public C2S_UpLev_5511 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UpLev_5511OrBuilder {
         private int bitField0_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UpLev_5511_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UpLev_5511_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UpLev_5511.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveTreasureMsg.C2S_UpLev_5511.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UpLev_5511_descriptor;
         }

         public C2S_UpLev_5511 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.C2S_UpLev_5511.getDefaultInstance();
         }

         public C2S_UpLev_5511 build() {
            C2S_UpLev_5511 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UpLev_5511 buildPartial() {
            C2S_UpLev_5511 result = new C2S_UpLev_5511(this);
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
            if (other instanceof C2S_UpLev_5511) {
               return this.mergeFrom((C2S_UpLev_5511)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UpLev_5511 other) {
            if (other == ExclusiveTreasureMsg.C2S_UpLev_5511.getDefaultInstance()) {
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
            C2S_UpLev_5511 parsedMessage = null;

            try {
               parsedMessage = (C2S_UpLev_5511)ExclusiveTreasureMsg.C2S_UpLev_5511.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UpLev_5511)e.getUnfinishedMessage();
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

   public static final class S2C_UpLev_5512 extends GeneratedMessageV3 implements S2C_UpLev_5512OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int TREASUREINFO_FIELD_NUMBER = 3;
      private ExclusiveTreasureInfo treasureInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_UpLev_5512 DEFAULT_INSTANCE = new S2C_UpLev_5512();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpLev_5512> PARSER = new AbstractParser<S2C_UpLev_5512>() {
         public S2C_UpLev_5512 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpLev_5512(input, extensionRegistry);
         }
      };

      private S2C_UpLev_5512(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpLev_5512() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpLev_5512();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpLev_5512(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 26:
                        ExclusiveTreasureInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.treasureInfo_.toBuilder();
                        }

                        this.treasureInfo_ = (ExclusiveTreasureInfo)input.readMessage(ExclusiveTreasureMsg.ExclusiveTreasureInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.treasureInfo_);
                           this.treasureInfo_ = subBuilder.buildPartial();
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UpLev_5512_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UpLev_5512_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpLev_5512.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasTreasureInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public ExclusiveTreasureInfo getTreasureInfo() {
         return this.treasureInfo_ == null ? ExclusiveTreasureMsg.ExclusiveTreasureInfo.getDefaultInstance() : this.treasureInfo_;
      }

      public ExclusiveTreasureInfoOrBuilder getTreasureInfoOrBuilder() {
         return this.treasureInfo_ == null ? ExclusiveTreasureMsg.ExclusiveTreasureInfo.getDefaultInstance() : this.treasureInfo_;
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
         } else if (!this.hasTreasureInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getTreasureInfo().isInitialized()) {
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
            output.writeMessage(3, this.getTreasureInfo());
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
               size += CodedOutputStream.computeMessageSize(3, this.getTreasureInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpLev_5512)) {
            return super.equals(obj);
         } else {
            S2C_UpLev_5512 other = (S2C_UpLev_5512)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasTreasureInfo() != other.hasTreasureInfo()) {
               return false;
            } else if (this.hasTreasureInfo() && !this.getTreasureInfo().equals(other.getTreasureInfo())) {
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

            if (this.hasTreasureInfo()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTreasureInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpLev_5512 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpLev_5512)PARSER.parseFrom(data);
      }

      public static S2C_UpLev_5512 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpLev_5512)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpLev_5512 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpLev_5512)PARSER.parseFrom(data);
      }

      public static S2C_UpLev_5512 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpLev_5512)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpLev_5512 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpLev_5512)PARSER.parseFrom(data);
      }

      public static S2C_UpLev_5512 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpLev_5512)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpLev_5512 parseFrom(InputStream input) throws IOException {
         return (S2C_UpLev_5512)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpLev_5512 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpLev_5512)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpLev_5512 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpLev_5512)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpLev_5512 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpLev_5512)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpLev_5512 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpLev_5512)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpLev_5512 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpLev_5512)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpLev_5512 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpLev_5512 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpLev_5512> parser() {
         return PARSER;
      }

      public Parser<S2C_UpLev_5512> getParserForType() {
         return PARSER;
      }

      public S2C_UpLev_5512 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpLev_5512OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private ExclusiveTreasureInfo treasureInfo_;
         private SingleFieldBuilderV3<ExclusiveTreasureInfo, ExclusiveTreasureInfo.Builder, ExclusiveTreasureInfoOrBuilder> treasureInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UpLev_5512_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UpLev_5512_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpLev_5512.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveTreasureMsg.S2C_UpLev_5512.alwaysUseFieldBuilders) {
               this.getTreasureInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            if (this.treasureInfoBuilder_ == null) {
               this.treasureInfo_ = null;
            } else {
               this.treasureInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UpLev_5512_descriptor;
         }

         public S2C_UpLev_5512 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.S2C_UpLev_5512.getDefaultInstance();
         }

         public S2C_UpLev_5512 build() {
            S2C_UpLev_5512 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpLev_5512 buildPartial() {
            S2C_UpLev_5512 result = new S2C_UpLev_5512(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.treasureInfoBuilder_ == null) {
                  result.treasureInfo_ = this.treasureInfo_;
               } else {
                  result.treasureInfo_ = (ExclusiveTreasureInfo)this.treasureInfoBuilder_.build();
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
            if (other instanceof S2C_UpLev_5512) {
               return this.mergeFrom((S2C_UpLev_5512)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpLev_5512 other) {
            if (other == ExclusiveTreasureMsg.S2C_UpLev_5512.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasTreasureInfo()) {
                  this.mergeTreasureInfo(other.getTreasureInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasTreasureInfo()) {
               return false;
            } else {
               return this.getTreasureInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UpLev_5512 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpLev_5512)ExclusiveTreasureMsg.S2C_UpLev_5512.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpLev_5512)e.getUnfinishedMessage();
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

         public boolean hasTreasureInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public ExclusiveTreasureInfo getTreasureInfo() {
            if (this.treasureInfoBuilder_ == null) {
               return this.treasureInfo_ == null ? ExclusiveTreasureMsg.ExclusiveTreasureInfo.getDefaultInstance() : this.treasureInfo_;
            } else {
               return (ExclusiveTreasureInfo)this.treasureInfoBuilder_.getMessage();
            }
         }

         public Builder setTreasureInfo(ExclusiveTreasureInfo value) {
            if (this.treasureInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.treasureInfo_ = value;
               this.onChanged();
            } else {
               this.treasureInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setTreasureInfo(ExclusiveTreasureInfo.Builder builderForValue) {
            if (this.treasureInfoBuilder_ == null) {
               this.treasureInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.treasureInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeTreasureInfo(ExclusiveTreasureInfo value) {
            if (this.treasureInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.treasureInfo_ != null && this.treasureInfo_ != ExclusiveTreasureMsg.ExclusiveTreasureInfo.getDefaultInstance()) {
                  this.treasureInfo_ = ExclusiveTreasureMsg.ExclusiveTreasureInfo.newBuilder(this.treasureInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.treasureInfo_ = value;
               }

               this.onChanged();
            } else {
               this.treasureInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearTreasureInfo() {
            if (this.treasureInfoBuilder_ == null) {
               this.treasureInfo_ = null;
               this.onChanged();
            } else {
               this.treasureInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public ExclusiveTreasureInfo.Builder getTreasureInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (ExclusiveTreasureInfo.Builder)this.getTreasureInfoFieldBuilder().getBuilder();
         }

         public ExclusiveTreasureInfoOrBuilder getTreasureInfoOrBuilder() {
            if (this.treasureInfoBuilder_ != null) {
               return (ExclusiveTreasureInfoOrBuilder)this.treasureInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.treasureInfo_ == null ? ExclusiveTreasureMsg.ExclusiveTreasureInfo.getDefaultInstance() : this.treasureInfo_;
            }
         }

         private SingleFieldBuilderV3<ExclusiveTreasureInfo, ExclusiveTreasureInfo.Builder, ExclusiveTreasureInfoOrBuilder> getTreasureInfoFieldBuilder() {
            if (this.treasureInfoBuilder_ == null) {
               this.treasureInfoBuilder_ = new SingleFieldBuilderV3(this.getTreasureInfo(), this.getParentForChildren(), this.isClean());
               this.treasureInfo_ = null;
            }

            return this.treasureInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_UpStar_5513 extends GeneratedMessageV3 implements C2S_UpStar_5513OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_UpStar_5513 DEFAULT_INSTANCE = new C2S_UpStar_5513();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UpStar_5513> PARSER = new AbstractParser<C2S_UpStar_5513>() {
         public C2S_UpStar_5513 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UpStar_5513(input, extensionRegistry);
         }
      };

      private C2S_UpStar_5513(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UpStar_5513() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UpStar_5513();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UpStar_5513(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UpStar_5513_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UpStar_5513_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UpStar_5513.class, Builder.class);
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
         } else if (!(obj instanceof C2S_UpStar_5513)) {
            return super.equals(obj);
         } else {
            C2S_UpStar_5513 other = (C2S_UpStar_5513)obj;
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

      public static C2S_UpStar_5513 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UpStar_5513)PARSER.parseFrom(data);
      }

      public static C2S_UpStar_5513 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpStar_5513)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpStar_5513 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UpStar_5513)PARSER.parseFrom(data);
      }

      public static C2S_UpStar_5513 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpStar_5513)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpStar_5513 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UpStar_5513)PARSER.parseFrom(data);
      }

      public static C2S_UpStar_5513 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UpStar_5513)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UpStar_5513 parseFrom(InputStream input) throws IOException {
         return (C2S_UpStar_5513)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UpStar_5513 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpStar_5513)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UpStar_5513 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UpStar_5513)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UpStar_5513 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpStar_5513)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UpStar_5513 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UpStar_5513)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UpStar_5513 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UpStar_5513)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UpStar_5513 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UpStar_5513 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UpStar_5513> parser() {
         return PARSER;
      }

      public Parser<C2S_UpStar_5513> getParserForType() {
         return PARSER;
      }

      public C2S_UpStar_5513 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UpStar_5513OrBuilder {
         private int bitField0_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UpStar_5513_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UpStar_5513_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UpStar_5513.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveTreasureMsg.C2S_UpStar_5513.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_UpStar_5513_descriptor;
         }

         public C2S_UpStar_5513 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.C2S_UpStar_5513.getDefaultInstance();
         }

         public C2S_UpStar_5513 build() {
            C2S_UpStar_5513 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UpStar_5513 buildPartial() {
            C2S_UpStar_5513 result = new C2S_UpStar_5513(this);
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
            if (other instanceof C2S_UpStar_5513) {
               return this.mergeFrom((C2S_UpStar_5513)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UpStar_5513 other) {
            if (other == ExclusiveTreasureMsg.C2S_UpStar_5513.getDefaultInstance()) {
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
            C2S_UpStar_5513 parsedMessage = null;

            try {
               parsedMessage = (C2S_UpStar_5513)ExclusiveTreasureMsg.C2S_UpStar_5513.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UpStar_5513)e.getUnfinishedMessage();
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

   public static final class S2C_UpStar_5514 extends GeneratedMessageV3 implements S2C_UpStar_5514OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int TREASUREINFO_FIELD_NUMBER = 3;
      private ExclusiveTreasureInfo treasureInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_UpStar_5514 DEFAULT_INSTANCE = new S2C_UpStar_5514();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpStar_5514> PARSER = new AbstractParser<S2C_UpStar_5514>() {
         public S2C_UpStar_5514 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpStar_5514(input, extensionRegistry);
         }
      };

      private S2C_UpStar_5514(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpStar_5514() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpStar_5514();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpStar_5514(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 26:
                        ExclusiveTreasureInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.treasureInfo_.toBuilder();
                        }

                        this.treasureInfo_ = (ExclusiveTreasureInfo)input.readMessage(ExclusiveTreasureMsg.ExclusiveTreasureInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.treasureInfo_);
                           this.treasureInfo_ = subBuilder.buildPartial();
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UpStar_5514_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UpStar_5514_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpStar_5514.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasTreasureInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public ExclusiveTreasureInfo getTreasureInfo() {
         return this.treasureInfo_ == null ? ExclusiveTreasureMsg.ExclusiveTreasureInfo.getDefaultInstance() : this.treasureInfo_;
      }

      public ExclusiveTreasureInfoOrBuilder getTreasureInfoOrBuilder() {
         return this.treasureInfo_ == null ? ExclusiveTreasureMsg.ExclusiveTreasureInfo.getDefaultInstance() : this.treasureInfo_;
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
         } else if (!this.hasTreasureInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getTreasureInfo().isInitialized()) {
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
            output.writeMessage(3, this.getTreasureInfo());
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
               size += CodedOutputStream.computeMessageSize(3, this.getTreasureInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpStar_5514)) {
            return super.equals(obj);
         } else {
            S2C_UpStar_5514 other = (S2C_UpStar_5514)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasTreasureInfo() != other.hasTreasureInfo()) {
               return false;
            } else if (this.hasTreasureInfo() && !this.getTreasureInfo().equals(other.getTreasureInfo())) {
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

            if (this.hasTreasureInfo()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTreasureInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpStar_5514 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpStar_5514)PARSER.parseFrom(data);
      }

      public static S2C_UpStar_5514 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpStar_5514)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpStar_5514 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpStar_5514)PARSER.parseFrom(data);
      }

      public static S2C_UpStar_5514 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpStar_5514)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpStar_5514 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpStar_5514)PARSER.parseFrom(data);
      }

      public static S2C_UpStar_5514 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpStar_5514)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpStar_5514 parseFrom(InputStream input) throws IOException {
         return (S2C_UpStar_5514)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpStar_5514 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpStar_5514)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpStar_5514 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpStar_5514)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpStar_5514 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpStar_5514)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpStar_5514 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpStar_5514)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpStar_5514 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpStar_5514)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpStar_5514 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpStar_5514 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpStar_5514> parser() {
         return PARSER;
      }

      public Parser<S2C_UpStar_5514> getParserForType() {
         return PARSER;
      }

      public S2C_UpStar_5514 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpStar_5514OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private ExclusiveTreasureInfo treasureInfo_;
         private SingleFieldBuilderV3<ExclusiveTreasureInfo, ExclusiveTreasureInfo.Builder, ExclusiveTreasureInfoOrBuilder> treasureInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UpStar_5514_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UpStar_5514_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpStar_5514.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveTreasureMsg.S2C_UpStar_5514.alwaysUseFieldBuilders) {
               this.getTreasureInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            if (this.treasureInfoBuilder_ == null) {
               this.treasureInfo_ = null;
            } else {
               this.treasureInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_UpStar_5514_descriptor;
         }

         public S2C_UpStar_5514 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.S2C_UpStar_5514.getDefaultInstance();
         }

         public S2C_UpStar_5514 build() {
            S2C_UpStar_5514 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpStar_5514 buildPartial() {
            S2C_UpStar_5514 result = new S2C_UpStar_5514(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.treasureInfoBuilder_ == null) {
                  result.treasureInfo_ = this.treasureInfo_;
               } else {
                  result.treasureInfo_ = (ExclusiveTreasureInfo)this.treasureInfoBuilder_.build();
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
            if (other instanceof S2C_UpStar_5514) {
               return this.mergeFrom((S2C_UpStar_5514)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpStar_5514 other) {
            if (other == ExclusiveTreasureMsg.S2C_UpStar_5514.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasTreasureInfo()) {
                  this.mergeTreasureInfo(other.getTreasureInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasTreasureInfo()) {
               return false;
            } else {
               return this.getTreasureInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UpStar_5514 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpStar_5514)ExclusiveTreasureMsg.S2C_UpStar_5514.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpStar_5514)e.getUnfinishedMessage();
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

         public boolean hasTreasureInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public ExclusiveTreasureInfo getTreasureInfo() {
            if (this.treasureInfoBuilder_ == null) {
               return this.treasureInfo_ == null ? ExclusiveTreasureMsg.ExclusiveTreasureInfo.getDefaultInstance() : this.treasureInfo_;
            } else {
               return (ExclusiveTreasureInfo)this.treasureInfoBuilder_.getMessage();
            }
         }

         public Builder setTreasureInfo(ExclusiveTreasureInfo value) {
            if (this.treasureInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.treasureInfo_ = value;
               this.onChanged();
            } else {
               this.treasureInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setTreasureInfo(ExclusiveTreasureInfo.Builder builderForValue) {
            if (this.treasureInfoBuilder_ == null) {
               this.treasureInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.treasureInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeTreasureInfo(ExclusiveTreasureInfo value) {
            if (this.treasureInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.treasureInfo_ != null && this.treasureInfo_ != ExclusiveTreasureMsg.ExclusiveTreasureInfo.getDefaultInstance()) {
                  this.treasureInfo_ = ExclusiveTreasureMsg.ExclusiveTreasureInfo.newBuilder(this.treasureInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.treasureInfo_ = value;
               }

               this.onChanged();
            } else {
               this.treasureInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearTreasureInfo() {
            if (this.treasureInfoBuilder_ == null) {
               this.treasureInfo_ = null;
               this.onChanged();
            } else {
               this.treasureInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public ExclusiveTreasureInfo.Builder getTreasureInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (ExclusiveTreasureInfo.Builder)this.getTreasureInfoFieldBuilder().getBuilder();
         }

         public ExclusiveTreasureInfoOrBuilder getTreasureInfoOrBuilder() {
            if (this.treasureInfoBuilder_ != null) {
               return (ExclusiveTreasureInfoOrBuilder)this.treasureInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.treasureInfo_ == null ? ExclusiveTreasureMsg.ExclusiveTreasureInfo.getDefaultInstance() : this.treasureInfo_;
            }
         }

         private SingleFieldBuilderV3<ExclusiveTreasureInfo, ExclusiveTreasureInfo.Builder, ExclusiveTreasureInfoOrBuilder> getTreasureInfoFieldBuilder() {
            if (this.treasureInfoBuilder_ == null) {
               this.treasureInfoBuilder_ = new SingleFieldBuilderV3(this.getTreasureInfo(), this.getParentForChildren(), this.isClean());
               this.treasureInfo_ = null;
            }

            return this.treasureInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_ComposeStone_5515 extends GeneratedMessageV3 implements C2S_ComposeStone_5515OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEMCODE_FIELD_NUMBER = 1;
      private Internal.IntList itemCode_;
      public static final int TARGETID_FIELD_NUMBER = 2;
      private int targetId_;
      private byte memoizedIsInitialized;
      private static final C2S_ComposeStone_5515 DEFAULT_INSTANCE = new C2S_ComposeStone_5515();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ComposeStone_5515> PARSER = new AbstractParser<C2S_ComposeStone_5515>() {
         public C2S_ComposeStone_5515 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ComposeStone_5515(input, extensionRegistry);
         }
      };

      private C2S_ComposeStone_5515(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ComposeStone_5515() {
         this.memoizedIsInitialized = -1;
         this.itemCode_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ComposeStone_5515();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ComposeStone_5515(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bitField0_ |= 1;
                        this.targetId_ = input.readInt32();
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

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_ComposeStone_5515_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_ComposeStone_5515_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ComposeStone_5515.class, Builder.class);
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

      public boolean hasTargetId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTargetId() {
         return this.targetId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTargetId()) {
            this.memoizedIsInitialized = 0;
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

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.targetId_);
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
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.targetId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ComposeStone_5515)) {
            return super.equals(obj);
         } else {
            C2S_ComposeStone_5515 other = (C2S_ComposeStone_5515)obj;
            if (!this.getItemCodeList().equals(other.getItemCodeList())) {
               return false;
            } else if (this.hasTargetId() != other.hasTargetId()) {
               return false;
            } else if (this.hasTargetId() && this.getTargetId() != other.getTargetId()) {
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

            if (this.hasTargetId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTargetId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ComposeStone_5515 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ComposeStone_5515)PARSER.parseFrom(data);
      }

      public static C2S_ComposeStone_5515 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ComposeStone_5515)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ComposeStone_5515 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ComposeStone_5515)PARSER.parseFrom(data);
      }

      public static C2S_ComposeStone_5515 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ComposeStone_5515)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ComposeStone_5515 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ComposeStone_5515)PARSER.parseFrom(data);
      }

      public static C2S_ComposeStone_5515 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ComposeStone_5515)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ComposeStone_5515 parseFrom(InputStream input) throws IOException {
         return (C2S_ComposeStone_5515)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ComposeStone_5515 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ComposeStone_5515)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ComposeStone_5515 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ComposeStone_5515)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ComposeStone_5515 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ComposeStone_5515)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ComposeStone_5515 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ComposeStone_5515)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ComposeStone_5515 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ComposeStone_5515)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ComposeStone_5515 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ComposeStone_5515 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ComposeStone_5515> parser() {
         return PARSER;
      }

      public Parser<C2S_ComposeStone_5515> getParserForType() {
         return PARSER;
      }

      public C2S_ComposeStone_5515 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ComposeStone_5515OrBuilder {
         private int bitField0_;
         private Internal.IntList itemCode_;
         private int targetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_ComposeStone_5515_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_ComposeStone_5515_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ComposeStone_5515.class, Builder.class);
         }

         private Builder() {
            this.itemCode_ = ExclusiveTreasureMsg.C2S_ComposeStone_5515.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.itemCode_ = ExclusiveTreasureMsg.C2S_ComposeStone_5515.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveTreasureMsg.C2S_ComposeStone_5515.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemCode_ = ExclusiveTreasureMsg.C2S_ComposeStone_5515.emptyIntList();
            this.bitField0_ &= -2;
            this.targetId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_ComposeStone_5515_descriptor;
         }

         public C2S_ComposeStone_5515 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.C2S_ComposeStone_5515.getDefaultInstance();
         }

         public C2S_ComposeStone_5515 build() {
            C2S_ComposeStone_5515 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ComposeStone_5515 buildPartial() {
            C2S_ComposeStone_5515 result = new C2S_ComposeStone_5515(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((this.bitField0_ & 1) != 0) {
               this.itemCode_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.itemCode_ = this.itemCode_;
            if ((from_bitField0_ & 2) != 0) {
               result.targetId_ = this.targetId_;
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
            if (other instanceof C2S_ComposeStone_5515) {
               return this.mergeFrom((C2S_ComposeStone_5515)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ComposeStone_5515 other) {
            if (other == ExclusiveTreasureMsg.C2S_ComposeStone_5515.getDefaultInstance()) {
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

               if (other.hasTargetId()) {
                  this.setTargetId(other.getTargetId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTargetId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ComposeStone_5515 parsedMessage = null;

            try {
               parsedMessage = (C2S_ComposeStone_5515)ExclusiveTreasureMsg.C2S_ComposeStone_5515.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ComposeStone_5515)e.getUnfinishedMessage();
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
               this.itemCode_ = ExclusiveTreasureMsg.C2S_ComposeStone_5515.mutableCopy(this.itemCode_);
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
            this.itemCode_ = ExclusiveTreasureMsg.C2S_ComposeStone_5515.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public boolean hasTargetId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTargetId() {
            return this.targetId_;
         }

         public Builder setTargetId(int value) {
            this.bitField0_ |= 2;
            this.targetId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTargetId() {
            this.bitField0_ &= -3;
            this.targetId_ = 0;
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

   public static final class S2C_ComposeStone_5516 extends GeneratedMessageV3 implements S2C_ComposeStone_5516OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_ComposeStone_5516 DEFAULT_INSTANCE = new S2C_ComposeStone_5516();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ComposeStone_5516> PARSER = new AbstractParser<S2C_ComposeStone_5516>() {
         public S2C_ComposeStone_5516 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ComposeStone_5516(input, extensionRegistry);
         }
      };

      private S2C_ComposeStone_5516(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ComposeStone_5516() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ComposeStone_5516();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ComposeStone_5516(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_ComposeStone_5516_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_ComposeStone_5516_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ComposeStone_5516.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ComposeStone_5516)) {
            return super.equals(obj);
         } else {
            S2C_ComposeStone_5516 other = (S2C_ComposeStone_5516)obj;
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

      public static S2C_ComposeStone_5516 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ComposeStone_5516)PARSER.parseFrom(data);
      }

      public static S2C_ComposeStone_5516 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ComposeStone_5516)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ComposeStone_5516 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ComposeStone_5516)PARSER.parseFrom(data);
      }

      public static S2C_ComposeStone_5516 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ComposeStone_5516)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ComposeStone_5516 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ComposeStone_5516)PARSER.parseFrom(data);
      }

      public static S2C_ComposeStone_5516 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ComposeStone_5516)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ComposeStone_5516 parseFrom(InputStream input) throws IOException {
         return (S2C_ComposeStone_5516)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ComposeStone_5516 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ComposeStone_5516)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ComposeStone_5516 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ComposeStone_5516)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ComposeStone_5516 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ComposeStone_5516)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ComposeStone_5516 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ComposeStone_5516)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ComposeStone_5516 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ComposeStone_5516)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ComposeStone_5516 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ComposeStone_5516 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ComposeStone_5516> parser() {
         return PARSER;
      }

      public Parser<S2C_ComposeStone_5516> getParserForType() {
         return PARSER;
      }

      public S2C_ComposeStone_5516 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ComposeStone_5516OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_ComposeStone_5516_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_ComposeStone_5516_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ComposeStone_5516.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveTreasureMsg.S2C_ComposeStone_5516.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_ComposeStone_5516_descriptor;
         }

         public S2C_ComposeStone_5516 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.S2C_ComposeStone_5516.getDefaultInstance();
         }

         public S2C_ComposeStone_5516 build() {
            S2C_ComposeStone_5516 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ComposeStone_5516 buildPartial() {
            S2C_ComposeStone_5516 result = new S2C_ComposeStone_5516(this);
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
            if (other instanceof S2C_ComposeStone_5516) {
               return this.mergeFrom((S2C_ComposeStone_5516)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ComposeStone_5516 other) {
            if (other == ExclusiveTreasureMsg.S2C_ComposeStone_5516.getDefaultInstance()) {
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
            S2C_ComposeStone_5516 parsedMessage = null;

            try {
               parsedMessage = (S2C_ComposeStone_5516)ExclusiveTreasureMsg.S2C_ComposeStone_5516.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ComposeStone_5516)e.getUnfinishedMessage();
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

   public static final class TreasureStoneInfo extends GeneratedMessageV3 implements TreasureStoneInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int CODE_FIELD_NUMBER = 3;
      private int code_;
      private byte memoizedIsInitialized;
      private static final TreasureStoneInfo DEFAULT_INSTANCE = new TreasureStoneInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<TreasureStoneInfo> PARSER = new AbstractParser<TreasureStoneInfo>() {
         public TreasureStoneInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new TreasureStoneInfo(input, extensionRegistry);
         }
      };

      private TreasureStoneInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private TreasureStoneInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new TreasureStoneInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private TreasureStoneInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 24:
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_TreasureStoneInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_TreasureStoneInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TreasureStoneInfo.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
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
         } else if (!this.hasId()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.id_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.code_);
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
               size += CodedOutputStream.computeInt32Size(3, this.code_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof TreasureStoneInfo)) {
            return super.equals(obj);
         } else {
            TreasureStoneInfo other = (TreasureStoneInfo)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
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
            if (this.hasId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getId();
            }

            if (this.hasCode()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static TreasureStoneInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (TreasureStoneInfo)PARSER.parseFrom(data);
      }

      public static TreasureStoneInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TreasureStoneInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TreasureStoneInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (TreasureStoneInfo)PARSER.parseFrom(data);
      }

      public static TreasureStoneInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TreasureStoneInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TreasureStoneInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (TreasureStoneInfo)PARSER.parseFrom(data);
      }

      public static TreasureStoneInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TreasureStoneInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TreasureStoneInfo parseFrom(InputStream input) throws IOException {
         return (TreasureStoneInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TreasureStoneInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TreasureStoneInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static TreasureStoneInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (TreasureStoneInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static TreasureStoneInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TreasureStoneInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static TreasureStoneInfo parseFrom(CodedInputStream input) throws IOException {
         return (TreasureStoneInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TreasureStoneInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TreasureStoneInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(TreasureStoneInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static TreasureStoneInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<TreasureStoneInfo> parser() {
         return PARSER;
      }

      public Parser<TreasureStoneInfo> getParserForType() {
         return PARSER;
      }

      public TreasureStoneInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TreasureStoneInfoOrBuilder {
         private int bitField0_;
         private int id_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_TreasureStoneInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_TreasureStoneInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TreasureStoneInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveTreasureMsg.TreasureStoneInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.code_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_TreasureStoneInfo_descriptor;
         }

         public TreasureStoneInfo getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.TreasureStoneInfo.getDefaultInstance();
         }

         public TreasureStoneInfo build() {
            TreasureStoneInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public TreasureStoneInfo buildPartial() {
            TreasureStoneInfo result = new TreasureStoneInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
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
            if (other instanceof TreasureStoneInfo) {
               return this.mergeFrom((TreasureStoneInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(TreasureStoneInfo other) {
            if (other == ExclusiveTreasureMsg.TreasureStoneInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
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
            if (!this.hasId()) {
               return false;
            } else {
               return this.hasCode();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            TreasureStoneInfo parsedMessage = null;

            try {
               parsedMessage = (TreasureStoneInfo)ExclusiveTreasureMsg.TreasureStoneInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (TreasureStoneInfo)e.getUnfinishedMessage();
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

   public static final class C2S_StoneSell_5517 extends GeneratedMessageV3 implements C2S_StoneSell_5517OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ITEMCODE_FIELD_NUMBER = 1;
      private Internal.IntList itemCode_;
      private byte memoizedIsInitialized;
      private static final C2S_StoneSell_5517 DEFAULT_INSTANCE = new C2S_StoneSell_5517();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_StoneSell_5517> PARSER = new AbstractParser<C2S_StoneSell_5517>() {
         public C2S_StoneSell_5517 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_StoneSell_5517(input, extensionRegistry);
         }
      };

      private C2S_StoneSell_5517(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_StoneSell_5517() {
         this.memoizedIsInitialized = -1;
         this.itemCode_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_StoneSell_5517();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_StoneSell_5517(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneSell_5517_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneSell_5517_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StoneSell_5517.class, Builder.class);
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
         } else if (!(obj instanceof C2S_StoneSell_5517)) {
            return super.equals(obj);
         } else {
            C2S_StoneSell_5517 other = (C2S_StoneSell_5517)obj;
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

      public static C2S_StoneSell_5517 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_StoneSell_5517)PARSER.parseFrom(data);
      }

      public static C2S_StoneSell_5517 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StoneSell_5517)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StoneSell_5517 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_StoneSell_5517)PARSER.parseFrom(data);
      }

      public static C2S_StoneSell_5517 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StoneSell_5517)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StoneSell_5517 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_StoneSell_5517)PARSER.parseFrom(data);
      }

      public static C2S_StoneSell_5517 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StoneSell_5517)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StoneSell_5517 parseFrom(InputStream input) throws IOException {
         return (C2S_StoneSell_5517)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StoneSell_5517 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StoneSell_5517)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StoneSell_5517 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_StoneSell_5517)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_StoneSell_5517 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StoneSell_5517)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StoneSell_5517 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_StoneSell_5517)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StoneSell_5517 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StoneSell_5517)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_StoneSell_5517 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_StoneSell_5517 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_StoneSell_5517> parser() {
         return PARSER;
      }

      public Parser<C2S_StoneSell_5517> getParserForType() {
         return PARSER;
      }

      public C2S_StoneSell_5517 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_StoneSell_5517OrBuilder {
         private int bitField0_;
         private Internal.IntList itemCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneSell_5517_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneSell_5517_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StoneSell_5517.class, Builder.class);
         }

         private Builder() {
            this.itemCode_ = ExclusiveTreasureMsg.C2S_StoneSell_5517.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.itemCode_ = ExclusiveTreasureMsg.C2S_StoneSell_5517.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveTreasureMsg.C2S_StoneSell_5517.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemCode_ = ExclusiveTreasureMsg.C2S_StoneSell_5517.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneSell_5517_descriptor;
         }

         public C2S_StoneSell_5517 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.C2S_StoneSell_5517.getDefaultInstance();
         }

         public C2S_StoneSell_5517 build() {
            C2S_StoneSell_5517 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_StoneSell_5517 buildPartial() {
            C2S_StoneSell_5517 result = new C2S_StoneSell_5517(this);
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
            if (other instanceof C2S_StoneSell_5517) {
               return this.mergeFrom((C2S_StoneSell_5517)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_StoneSell_5517 other) {
            if (other == ExclusiveTreasureMsg.C2S_StoneSell_5517.getDefaultInstance()) {
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
            C2S_StoneSell_5517 parsedMessage = null;

            try {
               parsedMessage = (C2S_StoneSell_5517)ExclusiveTreasureMsg.C2S_StoneSell_5517.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_StoneSell_5517)e.getUnfinishedMessage();
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
               this.itemCode_ = ExclusiveTreasureMsg.C2S_StoneSell_5517.mutableCopy(this.itemCode_);
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
            this.itemCode_ = ExclusiveTreasureMsg.C2S_StoneSell_5517.emptyIntList();
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

   public static final class S2C_StoneSell_5518 extends GeneratedMessageV3 implements S2C_StoneSell_5518OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_StoneSell_5518 DEFAULT_INSTANCE = new S2C_StoneSell_5518();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_StoneSell_5518> PARSER = new AbstractParser<S2C_StoneSell_5518>() {
         public S2C_StoneSell_5518 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_StoneSell_5518(input, extensionRegistry);
         }
      };

      private S2C_StoneSell_5518(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_StoneSell_5518() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_StoneSell_5518();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_StoneSell_5518(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneSell_5518_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneSell_5518_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StoneSell_5518.class, Builder.class);
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
         } else if (!(obj instanceof S2C_StoneSell_5518)) {
            return super.equals(obj);
         } else {
            S2C_StoneSell_5518 other = (S2C_StoneSell_5518)obj;
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

      public static S2C_StoneSell_5518 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_StoneSell_5518)PARSER.parseFrom(data);
      }

      public static S2C_StoneSell_5518 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StoneSell_5518)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StoneSell_5518 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_StoneSell_5518)PARSER.parseFrom(data);
      }

      public static S2C_StoneSell_5518 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StoneSell_5518)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StoneSell_5518 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_StoneSell_5518)PARSER.parseFrom(data);
      }

      public static S2C_StoneSell_5518 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StoneSell_5518)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StoneSell_5518 parseFrom(InputStream input) throws IOException {
         return (S2C_StoneSell_5518)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StoneSell_5518 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StoneSell_5518)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StoneSell_5518 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_StoneSell_5518)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_StoneSell_5518 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StoneSell_5518)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StoneSell_5518 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_StoneSell_5518)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StoneSell_5518 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StoneSell_5518)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_StoneSell_5518 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_StoneSell_5518 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_StoneSell_5518> parser() {
         return PARSER;
      }

      public Parser<S2C_StoneSell_5518> getParserForType() {
         return PARSER;
      }

      public S2C_StoneSell_5518 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_StoneSell_5518OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneSell_5518_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneSell_5518_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StoneSell_5518.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveTreasureMsg.S2C_StoneSell_5518.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneSell_5518_descriptor;
         }

         public S2C_StoneSell_5518 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.S2C_StoneSell_5518.getDefaultInstance();
         }

         public S2C_StoneSell_5518 build() {
            S2C_StoneSell_5518 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_StoneSell_5518 buildPartial() {
            S2C_StoneSell_5518 result = new S2C_StoneSell_5518(this);
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
            if (other instanceof S2C_StoneSell_5518) {
               return this.mergeFrom((S2C_StoneSell_5518)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_StoneSell_5518 other) {
            if (other == ExclusiveTreasureMsg.S2C_StoneSell_5518.getDefaultInstance()) {
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
            S2C_StoneSell_5518 parsedMessage = null;

            try {
               parsedMessage = (S2C_StoneSell_5518)ExclusiveTreasureMsg.S2C_StoneSell_5518.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_StoneSell_5518)e.getUnfinishedMessage();
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

   public static final class C2S_Reset_5519 extends GeneratedMessageV3 implements C2S_Reset_5519OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      private byte memoizedIsInitialized;
      private static final C2S_Reset_5519 DEFAULT_INSTANCE = new C2S_Reset_5519();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Reset_5519> PARSER = new AbstractParser<C2S_Reset_5519>() {
         public C2S_Reset_5519 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Reset_5519(input, extensionRegistry);
         }
      };

      private C2S_Reset_5519(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Reset_5519() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Reset_5519();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Reset_5519(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_Reset_5519_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_Reset_5519_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Reset_5519.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Reset_5519)) {
            return super.equals(obj);
         } else {
            C2S_Reset_5519 other = (C2S_Reset_5519)obj;
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

      public static C2S_Reset_5519 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Reset_5519)PARSER.parseFrom(data);
      }

      public static C2S_Reset_5519 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Reset_5519)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Reset_5519 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Reset_5519)PARSER.parseFrom(data);
      }

      public static C2S_Reset_5519 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Reset_5519)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Reset_5519 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Reset_5519)PARSER.parseFrom(data);
      }

      public static C2S_Reset_5519 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Reset_5519)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Reset_5519 parseFrom(InputStream input) throws IOException {
         return (C2S_Reset_5519)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Reset_5519 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Reset_5519)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Reset_5519 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Reset_5519)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Reset_5519 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Reset_5519)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Reset_5519 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Reset_5519)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Reset_5519 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Reset_5519)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Reset_5519 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Reset_5519 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Reset_5519> parser() {
         return PARSER;
      }

      public Parser<C2S_Reset_5519> getParserForType() {
         return PARSER;
      }

      public C2S_Reset_5519 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Reset_5519OrBuilder {
         private int bitField0_;
         private int heroCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_Reset_5519_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_Reset_5519_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Reset_5519.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveTreasureMsg.C2S_Reset_5519.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_Reset_5519_descriptor;
         }

         public C2S_Reset_5519 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.C2S_Reset_5519.getDefaultInstance();
         }

         public C2S_Reset_5519 build() {
            C2S_Reset_5519 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Reset_5519 buildPartial() {
            C2S_Reset_5519 result = new C2S_Reset_5519(this);
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
            if (other instanceof C2S_Reset_5519) {
               return this.mergeFrom((C2S_Reset_5519)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Reset_5519 other) {
            if (other == ExclusiveTreasureMsg.C2S_Reset_5519.getDefaultInstance()) {
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
            C2S_Reset_5519 parsedMessage = null;

            try {
               parsedMessage = (C2S_Reset_5519)ExclusiveTreasureMsg.C2S_Reset_5519.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Reset_5519)e.getUnfinishedMessage();
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

   public static final class S2C_Reset_5520 extends GeneratedMessageV3 implements S2C_Reset_5520OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_Reset_5520 DEFAULT_INSTANCE = new S2C_Reset_5520();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Reset_5520> PARSER = new AbstractParser<S2C_Reset_5520>() {
         public S2C_Reset_5520 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Reset_5520(input, extensionRegistry);
         }
      };

      private S2C_Reset_5520(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Reset_5520() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Reset_5520();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Reset_5520(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_Reset_5520_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_Reset_5520_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Reset_5520.class, Builder.class);
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
         } else if (!(obj instanceof S2C_Reset_5520)) {
            return super.equals(obj);
         } else {
            S2C_Reset_5520 other = (S2C_Reset_5520)obj;
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

      public static S2C_Reset_5520 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Reset_5520)PARSER.parseFrom(data);
      }

      public static S2C_Reset_5520 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Reset_5520)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Reset_5520 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Reset_5520)PARSER.parseFrom(data);
      }

      public static S2C_Reset_5520 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Reset_5520)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Reset_5520 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Reset_5520)PARSER.parseFrom(data);
      }

      public static S2C_Reset_5520 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Reset_5520)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Reset_5520 parseFrom(InputStream input) throws IOException {
         return (S2C_Reset_5520)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Reset_5520 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Reset_5520)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Reset_5520 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Reset_5520)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Reset_5520 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Reset_5520)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Reset_5520 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Reset_5520)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Reset_5520 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Reset_5520)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Reset_5520 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Reset_5520 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Reset_5520> parser() {
         return PARSER;
      }

      public Parser<S2C_Reset_5520> getParserForType() {
         return PARSER;
      }

      public S2C_Reset_5520 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Reset_5520OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_Reset_5520_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_Reset_5520_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Reset_5520.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveTreasureMsg.S2C_Reset_5520.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_Reset_5520_descriptor;
         }

         public S2C_Reset_5520 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.S2C_Reset_5520.getDefaultInstance();
         }

         public S2C_Reset_5520 build() {
            S2C_Reset_5520 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Reset_5520 buildPartial() {
            S2C_Reset_5520 result = new S2C_Reset_5520(this);
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
            if (other instanceof S2C_Reset_5520) {
               return this.mergeFrom((S2C_Reset_5520)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Reset_5520 other) {
            if (other == ExclusiveTreasureMsg.S2C_Reset_5520.getDefaultInstance()) {
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
            S2C_Reset_5520 parsedMessage = null;

            try {
               parsedMessage = (S2C_Reset_5520)ExclusiveTreasureMsg.S2C_Reset_5520.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Reset_5520)e.getUnfinishedMessage();
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

   public static final class C2S_StoneExchange_5521 extends GeneratedMessageV3 implements C2S_StoneExchange_5521OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEMCODE_FIELD_NUMBER = 1;
      private Internal.IntList itemCode_;
      public static final int TARGETID_FIELD_NUMBER = 2;
      private int targetId_;
      private byte memoizedIsInitialized;
      private static final C2S_StoneExchange_5521 DEFAULT_INSTANCE = new C2S_StoneExchange_5521();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_StoneExchange_5521> PARSER = new AbstractParser<C2S_StoneExchange_5521>() {
         public C2S_StoneExchange_5521 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_StoneExchange_5521(input, extensionRegistry);
         }
      };

      private C2S_StoneExchange_5521(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_StoneExchange_5521() {
         this.memoizedIsInitialized = -1;
         this.itemCode_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_StoneExchange_5521();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_StoneExchange_5521(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.bitField0_ |= 1;
                        this.targetId_ = input.readInt32();
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

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneExchange_5521_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneExchange_5521_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StoneExchange_5521.class, Builder.class);
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

      public boolean hasTargetId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTargetId() {
         return this.targetId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTargetId()) {
            this.memoizedIsInitialized = 0;
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

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.targetId_);
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
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.targetId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_StoneExchange_5521)) {
            return super.equals(obj);
         } else {
            C2S_StoneExchange_5521 other = (C2S_StoneExchange_5521)obj;
            if (!this.getItemCodeList().equals(other.getItemCodeList())) {
               return false;
            } else if (this.hasTargetId() != other.hasTargetId()) {
               return false;
            } else if (this.hasTargetId() && this.getTargetId() != other.getTargetId()) {
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

            if (this.hasTargetId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTargetId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_StoneExchange_5521 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_StoneExchange_5521)PARSER.parseFrom(data);
      }

      public static C2S_StoneExchange_5521 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StoneExchange_5521)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StoneExchange_5521 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_StoneExchange_5521)PARSER.parseFrom(data);
      }

      public static C2S_StoneExchange_5521 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StoneExchange_5521)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StoneExchange_5521 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_StoneExchange_5521)PARSER.parseFrom(data);
      }

      public static C2S_StoneExchange_5521 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StoneExchange_5521)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StoneExchange_5521 parseFrom(InputStream input) throws IOException {
         return (C2S_StoneExchange_5521)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StoneExchange_5521 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StoneExchange_5521)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StoneExchange_5521 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_StoneExchange_5521)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_StoneExchange_5521 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StoneExchange_5521)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StoneExchange_5521 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_StoneExchange_5521)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StoneExchange_5521 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StoneExchange_5521)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_StoneExchange_5521 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_StoneExchange_5521 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_StoneExchange_5521> parser() {
         return PARSER;
      }

      public Parser<C2S_StoneExchange_5521> getParserForType() {
         return PARSER;
      }

      public C2S_StoneExchange_5521 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_StoneExchange_5521OrBuilder {
         private int bitField0_;
         private Internal.IntList itemCode_;
         private int targetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneExchange_5521_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneExchange_5521_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StoneExchange_5521.class, Builder.class);
         }

         private Builder() {
            this.itemCode_ = ExclusiveTreasureMsg.C2S_StoneExchange_5521.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.itemCode_ = ExclusiveTreasureMsg.C2S_StoneExchange_5521.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveTreasureMsg.C2S_StoneExchange_5521.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemCode_ = ExclusiveTreasureMsg.C2S_StoneExchange_5521.emptyIntList();
            this.bitField0_ &= -2;
            this.targetId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneExchange_5521_descriptor;
         }

         public C2S_StoneExchange_5521 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.C2S_StoneExchange_5521.getDefaultInstance();
         }

         public C2S_StoneExchange_5521 build() {
            C2S_StoneExchange_5521 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_StoneExchange_5521 buildPartial() {
            C2S_StoneExchange_5521 result = new C2S_StoneExchange_5521(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((this.bitField0_ & 1) != 0) {
               this.itemCode_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.itemCode_ = this.itemCode_;
            if ((from_bitField0_ & 2) != 0) {
               result.targetId_ = this.targetId_;
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
            if (other instanceof C2S_StoneExchange_5521) {
               return this.mergeFrom((C2S_StoneExchange_5521)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_StoneExchange_5521 other) {
            if (other == ExclusiveTreasureMsg.C2S_StoneExchange_5521.getDefaultInstance()) {
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

               if (other.hasTargetId()) {
                  this.setTargetId(other.getTargetId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTargetId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_StoneExchange_5521 parsedMessage = null;

            try {
               parsedMessage = (C2S_StoneExchange_5521)ExclusiveTreasureMsg.C2S_StoneExchange_5521.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_StoneExchange_5521)e.getUnfinishedMessage();
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
               this.itemCode_ = ExclusiveTreasureMsg.C2S_StoneExchange_5521.mutableCopy(this.itemCode_);
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
            this.itemCode_ = ExclusiveTreasureMsg.C2S_StoneExchange_5521.emptyIntList();
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public boolean hasTargetId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTargetId() {
            return this.targetId_;
         }

         public Builder setTargetId(int value) {
            this.bitField0_ |= 2;
            this.targetId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTargetId() {
            this.bitField0_ &= -3;
            this.targetId_ = 0;
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

   public static final class S2C_StoneExchange_5522 extends GeneratedMessageV3 implements S2C_StoneExchange_5522OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_StoneExchange_5522 DEFAULT_INSTANCE = new S2C_StoneExchange_5522();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_StoneExchange_5522> PARSER = new AbstractParser<S2C_StoneExchange_5522>() {
         public S2C_StoneExchange_5522 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_StoneExchange_5522(input, extensionRegistry);
         }
      };

      private S2C_StoneExchange_5522(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_StoneExchange_5522() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_StoneExchange_5522();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_StoneExchange_5522(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneExchange_5522_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneExchange_5522_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StoneExchange_5522.class, Builder.class);
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
         } else if (!(obj instanceof S2C_StoneExchange_5522)) {
            return super.equals(obj);
         } else {
            S2C_StoneExchange_5522 other = (S2C_StoneExchange_5522)obj;
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

      public static S2C_StoneExchange_5522 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_StoneExchange_5522)PARSER.parseFrom(data);
      }

      public static S2C_StoneExchange_5522 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StoneExchange_5522)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StoneExchange_5522 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_StoneExchange_5522)PARSER.parseFrom(data);
      }

      public static S2C_StoneExchange_5522 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StoneExchange_5522)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StoneExchange_5522 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_StoneExchange_5522)PARSER.parseFrom(data);
      }

      public static S2C_StoneExchange_5522 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StoneExchange_5522)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StoneExchange_5522 parseFrom(InputStream input) throws IOException {
         return (S2C_StoneExchange_5522)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StoneExchange_5522 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StoneExchange_5522)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StoneExchange_5522 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_StoneExchange_5522)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_StoneExchange_5522 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StoneExchange_5522)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StoneExchange_5522 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_StoneExchange_5522)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StoneExchange_5522 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StoneExchange_5522)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_StoneExchange_5522 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_StoneExchange_5522 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_StoneExchange_5522> parser() {
         return PARSER;
      }

      public Parser<S2C_StoneExchange_5522> getParserForType() {
         return PARSER;
      }

      public S2C_StoneExchange_5522 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_StoneExchange_5522OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneExchange_5522_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneExchange_5522_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StoneExchange_5522.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveTreasureMsg.S2C_StoneExchange_5522.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneExchange_5522_descriptor;
         }

         public S2C_StoneExchange_5522 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.S2C_StoneExchange_5522.getDefaultInstance();
         }

         public S2C_StoneExchange_5522 build() {
            S2C_StoneExchange_5522 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_StoneExchange_5522 buildPartial() {
            S2C_StoneExchange_5522 result = new S2C_StoneExchange_5522(this);
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
            if (other instanceof S2C_StoneExchange_5522) {
               return this.mergeFrom((S2C_StoneExchange_5522)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_StoneExchange_5522 other) {
            if (other == ExclusiveTreasureMsg.S2C_StoneExchange_5522.getDefaultInstance()) {
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
            S2C_StoneExchange_5522 parsedMessage = null;

            try {
               parsedMessage = (S2C_StoneExchange_5522)ExclusiveTreasureMsg.S2C_StoneExchange_5522.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_StoneExchange_5522)e.getUnfinishedMessage();
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

   public static final class C2S_StrengthStone_5523 extends GeneratedMessageV3 implements C2S_StrengthStone_5523OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ITEMCODE_FIELD_NUMBER = 1;
      private int itemCode_;
      public static final int TARGETID_FIELD_NUMBER = 2;
      private int targetId_;
      private byte memoizedIsInitialized;
      private static final C2S_StrengthStone_5523 DEFAULT_INSTANCE = new C2S_StrengthStone_5523();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_StrengthStone_5523> PARSER = new AbstractParser<C2S_StrengthStone_5523>() {
         public C2S_StrengthStone_5523 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_StrengthStone_5523(input, extensionRegistry);
         }
      };

      private C2S_StrengthStone_5523(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_StrengthStone_5523() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_StrengthStone_5523();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_StrengthStone_5523(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.targetId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StrengthStone_5523_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StrengthStone_5523_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StrengthStone_5523.class, Builder.class);
      }

      public boolean hasItemCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getItemCode() {
         return this.itemCode_;
      }

      public boolean hasTargetId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTargetId() {
         return this.targetId_;
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
         } else if (!this.hasTargetId()) {
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
            output.writeInt32(2, this.targetId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.targetId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_StrengthStone_5523)) {
            return super.equals(obj);
         } else {
            C2S_StrengthStone_5523 other = (C2S_StrengthStone_5523)obj;
            if (this.hasItemCode() != other.hasItemCode()) {
               return false;
            } else if (this.hasItemCode() && this.getItemCode() != other.getItemCode()) {
               return false;
            } else if (this.hasTargetId() != other.hasTargetId()) {
               return false;
            } else if (this.hasTargetId() && this.getTargetId() != other.getTargetId()) {
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

            if (this.hasTargetId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTargetId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_StrengthStone_5523 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_StrengthStone_5523)PARSER.parseFrom(data);
      }

      public static C2S_StrengthStone_5523 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StrengthStone_5523)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StrengthStone_5523 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_StrengthStone_5523)PARSER.parseFrom(data);
      }

      public static C2S_StrengthStone_5523 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StrengthStone_5523)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StrengthStone_5523 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_StrengthStone_5523)PARSER.parseFrom(data);
      }

      public static C2S_StrengthStone_5523 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StrengthStone_5523)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StrengthStone_5523 parseFrom(InputStream input) throws IOException {
         return (C2S_StrengthStone_5523)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StrengthStone_5523 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StrengthStone_5523)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StrengthStone_5523 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_StrengthStone_5523)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_StrengthStone_5523 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StrengthStone_5523)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StrengthStone_5523 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_StrengthStone_5523)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StrengthStone_5523 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StrengthStone_5523)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_StrengthStone_5523 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_StrengthStone_5523 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_StrengthStone_5523> parser() {
         return PARSER;
      }

      public Parser<C2S_StrengthStone_5523> getParserForType() {
         return PARSER;
      }

      public C2S_StrengthStone_5523 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_StrengthStone_5523OrBuilder {
         private int bitField0_;
         private int itemCode_;
         private int targetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StrengthStone_5523_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StrengthStone_5523_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StrengthStone_5523.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveTreasureMsg.C2S_StrengthStone_5523.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.itemCode_ = 0;
            this.bitField0_ &= -2;
            this.targetId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StrengthStone_5523_descriptor;
         }

         public C2S_StrengthStone_5523 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.C2S_StrengthStone_5523.getDefaultInstance();
         }

         public C2S_StrengthStone_5523 build() {
            C2S_StrengthStone_5523 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_StrengthStone_5523 buildPartial() {
            C2S_StrengthStone_5523 result = new C2S_StrengthStone_5523(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.itemCode_ = this.itemCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.targetId_ = this.targetId_;
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
            if (other instanceof C2S_StrengthStone_5523) {
               return this.mergeFrom((C2S_StrengthStone_5523)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_StrengthStone_5523 other) {
            if (other == ExclusiveTreasureMsg.C2S_StrengthStone_5523.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasItemCode()) {
                  this.setItemCode(other.getItemCode());
               }

               if (other.hasTargetId()) {
                  this.setTargetId(other.getTargetId());
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
               return this.hasTargetId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_StrengthStone_5523 parsedMessage = null;

            try {
               parsedMessage = (C2S_StrengthStone_5523)ExclusiveTreasureMsg.C2S_StrengthStone_5523.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_StrengthStone_5523)e.getUnfinishedMessage();
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

         public boolean hasTargetId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTargetId() {
            return this.targetId_;
         }

         public Builder setTargetId(int value) {
            this.bitField0_ |= 2;
            this.targetId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTargetId() {
            this.bitField0_ &= -3;
            this.targetId_ = 0;
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

   public static final class S2C_StrengthStone_5524 extends GeneratedMessageV3 implements S2C_StrengthStone_5524OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_StrengthStone_5524 DEFAULT_INSTANCE = new S2C_StrengthStone_5524();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_StrengthStone_5524> PARSER = new AbstractParser<S2C_StrengthStone_5524>() {
         public S2C_StrengthStone_5524 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_StrengthStone_5524(input, extensionRegistry);
         }
      };

      private S2C_StrengthStone_5524(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_StrengthStone_5524() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_StrengthStone_5524();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_StrengthStone_5524(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StrengthStone_5524_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StrengthStone_5524_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StrengthStone_5524.class, Builder.class);
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
         } else if (!(obj instanceof S2C_StrengthStone_5524)) {
            return super.equals(obj);
         } else {
            S2C_StrengthStone_5524 other = (S2C_StrengthStone_5524)obj;
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

      public static S2C_StrengthStone_5524 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_StrengthStone_5524)PARSER.parseFrom(data);
      }

      public static S2C_StrengthStone_5524 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StrengthStone_5524)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StrengthStone_5524 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_StrengthStone_5524)PARSER.parseFrom(data);
      }

      public static S2C_StrengthStone_5524 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StrengthStone_5524)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StrengthStone_5524 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_StrengthStone_5524)PARSER.parseFrom(data);
      }

      public static S2C_StrengthStone_5524 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StrengthStone_5524)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StrengthStone_5524 parseFrom(InputStream input) throws IOException {
         return (S2C_StrengthStone_5524)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StrengthStone_5524 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StrengthStone_5524)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StrengthStone_5524 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_StrengthStone_5524)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_StrengthStone_5524 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StrengthStone_5524)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StrengthStone_5524 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_StrengthStone_5524)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StrengthStone_5524 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StrengthStone_5524)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_StrengthStone_5524 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_StrengthStone_5524 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_StrengthStone_5524> parser() {
         return PARSER;
      }

      public Parser<S2C_StrengthStone_5524> getParserForType() {
         return PARSER;
      }

      public S2C_StrengthStone_5524 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_StrengthStone_5524OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StrengthStone_5524_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StrengthStone_5524_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StrengthStone_5524.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveTreasureMsg.S2C_StrengthStone_5524.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StrengthStone_5524_descriptor;
         }

         public S2C_StrengthStone_5524 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.S2C_StrengthStone_5524.getDefaultInstance();
         }

         public S2C_StrengthStone_5524 build() {
            S2C_StrengthStone_5524 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_StrengthStone_5524 buildPartial() {
            S2C_StrengthStone_5524 result = new S2C_StrengthStone_5524(this);
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
            if (other instanceof S2C_StrengthStone_5524) {
               return this.mergeFrom((S2C_StrengthStone_5524)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_StrengthStone_5524 other) {
            if (other == ExclusiveTreasureMsg.S2C_StrengthStone_5524.getDefaultInstance()) {
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
            S2C_StrengthStone_5524 parsedMessage = null;

            try {
               parsedMessage = (S2C_StrengthStone_5524)ExclusiveTreasureMsg.S2C_StrengthStone_5524.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_StrengthStone_5524)e.getUnfinishedMessage();
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

   public static final class C2S_StrengthHeroStone_5525 extends GeneratedMessageV3 implements C2S_StrengthHeroStone_5525OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      public static final int TARGETID_FIELD_NUMBER = 3;
      private int targetId_;
      private byte memoizedIsInitialized;
      private static final C2S_StrengthHeroStone_5525 DEFAULT_INSTANCE = new C2S_StrengthHeroStone_5525();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_StrengthHeroStone_5525> PARSER = new AbstractParser<C2S_StrengthHeroStone_5525>() {
         public C2S_StrengthHeroStone_5525 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_StrengthHeroStone_5525(input, extensionRegistry);
         }
      };

      private C2S_StrengthHeroStone_5525(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_StrengthHeroStone_5525() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_StrengthHeroStone_5525();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_StrengthHeroStone_5525(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CommonMsg.StonePosition value = CommonMsg.StonePosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.position_ = rawValue;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.targetId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StrengthHeroStone_5525_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StrengthHeroStone_5525_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StrengthHeroStone_5525.class, Builder.class);
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

      public CommonMsg.StonePosition getPosition() {
         CommonMsg.StonePosition result = CommonMsg.StonePosition.valueOf(this.position_);
         return result == null ? CommonMsg.StonePosition.WEAR_STONE_1 : result;
      }

      public boolean hasTargetId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getTargetId() {
         return this.targetId_;
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
         } else if (!this.hasTargetId()) {
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
            output.writeInt32(3, this.targetId_);
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
               size += CodedOutputStream.computeInt32Size(3, this.targetId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_StrengthHeroStone_5525)) {
            return super.equals(obj);
         } else {
            C2S_StrengthHeroStone_5525 other = (C2S_StrengthHeroStone_5525)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (this.hasTargetId() != other.hasTargetId()) {
               return false;
            } else if (this.hasTargetId() && this.getTargetId() != other.getTargetId()) {
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

            if (this.hasTargetId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTargetId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_StrengthHeroStone_5525 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_StrengthHeroStone_5525)PARSER.parseFrom(data);
      }

      public static C2S_StrengthHeroStone_5525 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StrengthHeroStone_5525)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StrengthHeroStone_5525 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_StrengthHeroStone_5525)PARSER.parseFrom(data);
      }

      public static C2S_StrengthHeroStone_5525 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StrengthHeroStone_5525)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StrengthHeroStone_5525 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_StrengthHeroStone_5525)PARSER.parseFrom(data);
      }

      public static C2S_StrengthHeroStone_5525 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StrengthHeroStone_5525)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StrengthHeroStone_5525 parseFrom(InputStream input) throws IOException {
         return (C2S_StrengthHeroStone_5525)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StrengthHeroStone_5525 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StrengthHeroStone_5525)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StrengthHeroStone_5525 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_StrengthHeroStone_5525)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_StrengthHeroStone_5525 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StrengthHeroStone_5525)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StrengthHeroStone_5525 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_StrengthHeroStone_5525)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StrengthHeroStone_5525 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StrengthHeroStone_5525)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_StrengthHeroStone_5525 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_StrengthHeroStone_5525 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_StrengthHeroStone_5525> parser() {
         return PARSER;
      }

      public Parser<C2S_StrengthHeroStone_5525> getParserForType() {
         return PARSER;
      }

      public C2S_StrengthHeroStone_5525 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_StrengthHeroStone_5525OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;
         private int targetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StrengthHeroStone_5525_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StrengthHeroStone_5525_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StrengthHeroStone_5525.class, Builder.class);
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
            if (ExclusiveTreasureMsg.C2S_StrengthHeroStone_5525.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.bitField0_ &= -3;
            this.targetId_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StrengthHeroStone_5525_descriptor;
         }

         public C2S_StrengthHeroStone_5525 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.C2S_StrengthHeroStone_5525.getDefaultInstance();
         }

         public C2S_StrengthHeroStone_5525 build() {
            C2S_StrengthHeroStone_5525 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_StrengthHeroStone_5525 buildPartial() {
            C2S_StrengthHeroStone_5525 result = new C2S_StrengthHeroStone_5525(this);
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
               result.targetId_ = this.targetId_;
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
            if (other instanceof C2S_StrengthHeroStone_5525) {
               return this.mergeFrom((C2S_StrengthHeroStone_5525)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_StrengthHeroStone_5525 other) {
            if (other == ExclusiveTreasureMsg.C2S_StrengthHeroStone_5525.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasTargetId()) {
                  this.setTargetId(other.getTargetId());
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
               return this.hasTargetId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_StrengthHeroStone_5525 parsedMessage = null;

            try {
               parsedMessage = (C2S_StrengthHeroStone_5525)ExclusiveTreasureMsg.C2S_StrengthHeroStone_5525.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_StrengthHeroStone_5525)e.getUnfinishedMessage();
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

         public CommonMsg.StonePosition getPosition() {
            CommonMsg.StonePosition result = CommonMsg.StonePosition.valueOf(this.position_);
            return result == null ? CommonMsg.StonePosition.WEAR_STONE_1 : result;
         }

         public Builder setPosition(CommonMsg.StonePosition value) {
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

         public boolean hasTargetId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getTargetId() {
            return this.targetId_;
         }

         public Builder setTargetId(int value) {
            this.bitField0_ |= 4;
            this.targetId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTargetId() {
            this.bitField0_ &= -5;
            this.targetId_ = 0;
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

   public static final class S2C_StrengthHeroStone_5526 extends GeneratedMessageV3 implements S2C_StrengthHeroStone_5526OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int STONEINFO_FIELD_NUMBER = 7;
      private CommonMsg.TreasureStone stoneInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_StrengthHeroStone_5526 DEFAULT_INSTANCE = new S2C_StrengthHeroStone_5526();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_StrengthHeroStone_5526> PARSER = new AbstractParser<S2C_StrengthHeroStone_5526>() {
         public S2C_StrengthHeroStone_5526 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_StrengthHeroStone_5526(input, extensionRegistry);
         }
      };

      private S2C_StrengthHeroStone_5526(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_StrengthHeroStone_5526() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_StrengthHeroStone_5526();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_StrengthHeroStone_5526(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 58:
                        CommonMsg.TreasureStone.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.stoneInfo_.toBuilder();
                        }

                        this.stoneInfo_ = (CommonMsg.TreasureStone)input.readMessage(CommonMsg.TreasureStone.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.stoneInfo_);
                           this.stoneInfo_ = subBuilder.buildPartial();
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StrengthHeroStone_5526_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StrengthHeroStone_5526_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StrengthHeroStone_5526.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasStoneInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.TreasureStone getStoneInfo() {
         return this.stoneInfo_ == null ? CommonMsg.TreasureStone.getDefaultInstance() : this.stoneInfo_;
      }

      public CommonMsg.TreasureStoneOrBuilder getStoneInfoOrBuilder() {
         return this.stoneInfo_ == null ? CommonMsg.TreasureStone.getDefaultInstance() : this.stoneInfo_;
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
         } else if (!this.hasStoneInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getStoneInfo().isInitialized()) {
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
            output.writeMessage(7, this.getStoneInfo());
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
               size += CodedOutputStream.computeMessageSize(7, this.getStoneInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_StrengthHeroStone_5526)) {
            return super.equals(obj);
         } else {
            S2C_StrengthHeroStone_5526 other = (S2C_StrengthHeroStone_5526)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasStoneInfo() != other.hasStoneInfo()) {
               return false;
            } else if (this.hasStoneInfo() && !this.getStoneInfo().equals(other.getStoneInfo())) {
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

            if (this.hasStoneInfo()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getStoneInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_StrengthHeroStone_5526 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_StrengthHeroStone_5526)PARSER.parseFrom(data);
      }

      public static S2C_StrengthHeroStone_5526 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StrengthHeroStone_5526)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StrengthHeroStone_5526 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_StrengthHeroStone_5526)PARSER.parseFrom(data);
      }

      public static S2C_StrengthHeroStone_5526 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StrengthHeroStone_5526)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StrengthHeroStone_5526 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_StrengthHeroStone_5526)PARSER.parseFrom(data);
      }

      public static S2C_StrengthHeroStone_5526 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StrengthHeroStone_5526)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StrengthHeroStone_5526 parseFrom(InputStream input) throws IOException {
         return (S2C_StrengthHeroStone_5526)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StrengthHeroStone_5526 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StrengthHeroStone_5526)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StrengthHeroStone_5526 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_StrengthHeroStone_5526)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_StrengthHeroStone_5526 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StrengthHeroStone_5526)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StrengthHeroStone_5526 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_StrengthHeroStone_5526)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StrengthHeroStone_5526 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StrengthHeroStone_5526)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_StrengthHeroStone_5526 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_StrengthHeroStone_5526 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_StrengthHeroStone_5526> parser() {
         return PARSER;
      }

      public Parser<S2C_StrengthHeroStone_5526> getParserForType() {
         return PARSER;
      }

      public S2C_StrengthHeroStone_5526 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_StrengthHeroStone_5526OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private CommonMsg.TreasureStone stoneInfo_;
         private SingleFieldBuilderV3<CommonMsg.TreasureStone, CommonMsg.TreasureStone.Builder, CommonMsg.TreasureStoneOrBuilder> stoneInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StrengthHeroStone_5526_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StrengthHeroStone_5526_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StrengthHeroStone_5526.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveTreasureMsg.S2C_StrengthHeroStone_5526.alwaysUseFieldBuilders) {
               this.getStoneInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            if (this.stoneInfoBuilder_ == null) {
               this.stoneInfo_ = null;
            } else {
               this.stoneInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StrengthHeroStone_5526_descriptor;
         }

         public S2C_StrengthHeroStone_5526 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.S2C_StrengthHeroStone_5526.getDefaultInstance();
         }

         public S2C_StrengthHeroStone_5526 build() {
            S2C_StrengthHeroStone_5526 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_StrengthHeroStone_5526 buildPartial() {
            S2C_StrengthHeroStone_5526 result = new S2C_StrengthHeroStone_5526(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.stoneInfoBuilder_ == null) {
                  result.stoneInfo_ = this.stoneInfo_;
               } else {
                  result.stoneInfo_ = (CommonMsg.TreasureStone)this.stoneInfoBuilder_.build();
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
            if (other instanceof S2C_StrengthHeroStone_5526) {
               return this.mergeFrom((S2C_StrengthHeroStone_5526)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_StrengthHeroStone_5526 other) {
            if (other == ExclusiveTreasureMsg.S2C_StrengthHeroStone_5526.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasStoneInfo()) {
                  this.mergeStoneInfo(other.getStoneInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasStoneInfo()) {
               return false;
            } else {
               return this.getStoneInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_StrengthHeroStone_5526 parsedMessage = null;

            try {
               parsedMessage = (S2C_StrengthHeroStone_5526)ExclusiveTreasureMsg.S2C_StrengthHeroStone_5526.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_StrengthHeroStone_5526)e.getUnfinishedMessage();
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

         public boolean hasStoneInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.TreasureStone getStoneInfo() {
            if (this.stoneInfoBuilder_ == null) {
               return this.stoneInfo_ == null ? CommonMsg.TreasureStone.getDefaultInstance() : this.stoneInfo_;
            } else {
               return (CommonMsg.TreasureStone)this.stoneInfoBuilder_.getMessage();
            }
         }

         public Builder setStoneInfo(CommonMsg.TreasureStone value) {
            if (this.stoneInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.stoneInfo_ = value;
               this.onChanged();
            } else {
               this.stoneInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setStoneInfo(CommonMsg.TreasureStone.Builder builderForValue) {
            if (this.stoneInfoBuilder_ == null) {
               this.stoneInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.stoneInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeStoneInfo(CommonMsg.TreasureStone value) {
            if (this.stoneInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.stoneInfo_ != null && this.stoneInfo_ != CommonMsg.TreasureStone.getDefaultInstance()) {
                  this.stoneInfo_ = CommonMsg.TreasureStone.newBuilder(this.stoneInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.stoneInfo_ = value;
               }

               this.onChanged();
            } else {
               this.stoneInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearStoneInfo() {
            if (this.stoneInfoBuilder_ == null) {
               this.stoneInfo_ = null;
               this.onChanged();
            } else {
               this.stoneInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.TreasureStone.Builder getStoneInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.TreasureStone.Builder)this.getStoneInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.TreasureStoneOrBuilder getStoneInfoOrBuilder() {
            if (this.stoneInfoBuilder_ != null) {
               return (CommonMsg.TreasureStoneOrBuilder)this.stoneInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.stoneInfo_ == null ? CommonMsg.TreasureStone.getDefaultInstance() : this.stoneInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.TreasureStone, CommonMsg.TreasureStone.Builder, CommonMsg.TreasureStoneOrBuilder> getStoneInfoFieldBuilder() {
            if (this.stoneInfoBuilder_ == null) {
               this.stoneInfoBuilder_ = new SingleFieldBuilderV3(this.getStoneInfo(), this.getParentForChildren(), this.isClean());
               this.stoneInfo_ = null;
            }

            return this.stoneInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_StoneHeroExchange_5527 extends GeneratedMessageV3 implements C2S_StoneHeroExchange_5527OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int POSITION_FIELD_NUMBER = 2;
      private int position_;
      public static final int TARGETID_FIELD_NUMBER = 3;
      private int targetId_;
      private byte memoizedIsInitialized;
      private static final C2S_StoneHeroExchange_5527 DEFAULT_INSTANCE = new C2S_StoneHeroExchange_5527();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_StoneHeroExchange_5527> PARSER = new AbstractParser<C2S_StoneHeroExchange_5527>() {
         public C2S_StoneHeroExchange_5527 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_StoneHeroExchange_5527(input, extensionRegistry);
         }
      };

      private C2S_StoneHeroExchange_5527(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_StoneHeroExchange_5527() {
         this.memoizedIsInitialized = -1;
         this.position_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_StoneHeroExchange_5527();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_StoneHeroExchange_5527(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        CommonMsg.StonePosition value = CommonMsg.StonePosition.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(2, rawValue);
                        } else {
                           this.bitField0_ |= 2;
                           this.position_ = rawValue;
                        }
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.targetId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneHeroExchange_5527_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneHeroExchange_5527_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StoneHeroExchange_5527.class, Builder.class);
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

      public CommonMsg.StonePosition getPosition() {
         CommonMsg.StonePosition result = CommonMsg.StonePosition.valueOf(this.position_);
         return result == null ? CommonMsg.StonePosition.WEAR_STONE_1 : result;
      }

      public boolean hasTargetId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getTargetId() {
         return this.targetId_;
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
         } else if (!this.hasTargetId()) {
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
            output.writeInt32(3, this.targetId_);
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
               size += CodedOutputStream.computeInt32Size(3, this.targetId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_StoneHeroExchange_5527)) {
            return super.equals(obj);
         } else {
            C2S_StoneHeroExchange_5527 other = (C2S_StoneHeroExchange_5527)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasPosition() != other.hasPosition()) {
               return false;
            } else if (this.hasPosition() && this.position_ != other.position_) {
               return false;
            } else if (this.hasTargetId() != other.hasTargetId()) {
               return false;
            } else if (this.hasTargetId() && this.getTargetId() != other.getTargetId()) {
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

            if (this.hasTargetId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTargetId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_StoneHeroExchange_5527 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_StoneHeroExchange_5527)PARSER.parseFrom(data);
      }

      public static C2S_StoneHeroExchange_5527 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StoneHeroExchange_5527)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StoneHeroExchange_5527 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_StoneHeroExchange_5527)PARSER.parseFrom(data);
      }

      public static C2S_StoneHeroExchange_5527 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StoneHeroExchange_5527)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StoneHeroExchange_5527 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_StoneHeroExchange_5527)PARSER.parseFrom(data);
      }

      public static C2S_StoneHeroExchange_5527 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_StoneHeroExchange_5527)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_StoneHeroExchange_5527 parseFrom(InputStream input) throws IOException {
         return (C2S_StoneHeroExchange_5527)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StoneHeroExchange_5527 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StoneHeroExchange_5527)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StoneHeroExchange_5527 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_StoneHeroExchange_5527)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_StoneHeroExchange_5527 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StoneHeroExchange_5527)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_StoneHeroExchange_5527 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_StoneHeroExchange_5527)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_StoneHeroExchange_5527 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_StoneHeroExchange_5527)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_StoneHeroExchange_5527 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_StoneHeroExchange_5527 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_StoneHeroExchange_5527> parser() {
         return PARSER;
      }

      public Parser<C2S_StoneHeroExchange_5527> getParserForType() {
         return PARSER;
      }

      public C2S_StoneHeroExchange_5527 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_StoneHeroExchange_5527OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private int position_;
         private int targetId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneHeroExchange_5527_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneHeroExchange_5527_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_StoneHeroExchange_5527.class, Builder.class);
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
            if (ExclusiveTreasureMsg.C2S_StoneHeroExchange_5527.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            this.position_ = 1;
            this.bitField0_ &= -3;
            this.targetId_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_C2S_StoneHeroExchange_5527_descriptor;
         }

         public C2S_StoneHeroExchange_5527 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.C2S_StoneHeroExchange_5527.getDefaultInstance();
         }

         public C2S_StoneHeroExchange_5527 build() {
            C2S_StoneHeroExchange_5527 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_StoneHeroExchange_5527 buildPartial() {
            C2S_StoneHeroExchange_5527 result = new C2S_StoneHeroExchange_5527(this);
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
               result.targetId_ = this.targetId_;
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
            if (other instanceof C2S_StoneHeroExchange_5527) {
               return this.mergeFrom((C2S_StoneHeroExchange_5527)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_StoneHeroExchange_5527 other) {
            if (other == ExclusiveTreasureMsg.C2S_StoneHeroExchange_5527.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasPosition()) {
                  this.setPosition(other.getPosition());
               }

               if (other.hasTargetId()) {
                  this.setTargetId(other.getTargetId());
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
               return this.hasTargetId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_StoneHeroExchange_5527 parsedMessage = null;

            try {
               parsedMessage = (C2S_StoneHeroExchange_5527)ExclusiveTreasureMsg.C2S_StoneHeroExchange_5527.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_StoneHeroExchange_5527)e.getUnfinishedMessage();
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

         public CommonMsg.StonePosition getPosition() {
            CommonMsg.StonePosition result = CommonMsg.StonePosition.valueOf(this.position_);
            return result == null ? CommonMsg.StonePosition.WEAR_STONE_1 : result;
         }

         public Builder setPosition(CommonMsg.StonePosition value) {
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

         public boolean hasTargetId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getTargetId() {
            return this.targetId_;
         }

         public Builder setTargetId(int value) {
            this.bitField0_ |= 4;
            this.targetId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTargetId() {
            this.bitField0_ &= -5;
            this.targetId_ = 0;
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

   public static final class S2C_StoneHeroExchange_5528 extends GeneratedMessageV3 implements S2C_StoneHeroExchange_5528OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROCODE_FIELD_NUMBER = 1;
      private int heroCode_;
      public static final int STONEINFO_FIELD_NUMBER = 7;
      private CommonMsg.TreasureStone stoneInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_StoneHeroExchange_5528 DEFAULT_INSTANCE = new S2C_StoneHeroExchange_5528();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_StoneHeroExchange_5528> PARSER = new AbstractParser<S2C_StoneHeroExchange_5528>() {
         public S2C_StoneHeroExchange_5528 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_StoneHeroExchange_5528(input, extensionRegistry);
         }
      };

      private S2C_StoneHeroExchange_5528(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_StoneHeroExchange_5528() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_StoneHeroExchange_5528();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_StoneHeroExchange_5528(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 58:
                        CommonMsg.TreasureStone.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.stoneInfo_.toBuilder();
                        }

                        this.stoneInfo_ = (CommonMsg.TreasureStone)input.readMessage(CommonMsg.TreasureStone.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.stoneInfo_);
                           this.stoneInfo_ = subBuilder.buildPartial();
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
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneHeroExchange_5528_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneHeroExchange_5528_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StoneHeroExchange_5528.class, Builder.class);
      }

      public boolean hasHeroCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroCode() {
         return this.heroCode_;
      }

      public boolean hasStoneInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.TreasureStone getStoneInfo() {
         return this.stoneInfo_ == null ? CommonMsg.TreasureStone.getDefaultInstance() : this.stoneInfo_;
      }

      public CommonMsg.TreasureStoneOrBuilder getStoneInfoOrBuilder() {
         return this.stoneInfo_ == null ? CommonMsg.TreasureStone.getDefaultInstance() : this.stoneInfo_;
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
         } else if (!this.hasStoneInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getStoneInfo().isInitialized()) {
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
            output.writeMessage(7, this.getStoneInfo());
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
               size += CodedOutputStream.computeMessageSize(7, this.getStoneInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_StoneHeroExchange_5528)) {
            return super.equals(obj);
         } else {
            S2C_StoneHeroExchange_5528 other = (S2C_StoneHeroExchange_5528)obj;
            if (this.hasHeroCode() != other.hasHeroCode()) {
               return false;
            } else if (this.hasHeroCode() && this.getHeroCode() != other.getHeroCode()) {
               return false;
            } else if (this.hasStoneInfo() != other.hasStoneInfo()) {
               return false;
            } else if (this.hasStoneInfo() && !this.getStoneInfo().equals(other.getStoneInfo())) {
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

            if (this.hasStoneInfo()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getStoneInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_StoneHeroExchange_5528 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_StoneHeroExchange_5528)PARSER.parseFrom(data);
      }

      public static S2C_StoneHeroExchange_5528 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StoneHeroExchange_5528)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StoneHeroExchange_5528 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_StoneHeroExchange_5528)PARSER.parseFrom(data);
      }

      public static S2C_StoneHeroExchange_5528 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StoneHeroExchange_5528)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StoneHeroExchange_5528 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_StoneHeroExchange_5528)PARSER.parseFrom(data);
      }

      public static S2C_StoneHeroExchange_5528 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_StoneHeroExchange_5528)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_StoneHeroExchange_5528 parseFrom(InputStream input) throws IOException {
         return (S2C_StoneHeroExchange_5528)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StoneHeroExchange_5528 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StoneHeroExchange_5528)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StoneHeroExchange_5528 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_StoneHeroExchange_5528)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_StoneHeroExchange_5528 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StoneHeroExchange_5528)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_StoneHeroExchange_5528 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_StoneHeroExchange_5528)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_StoneHeroExchange_5528 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_StoneHeroExchange_5528)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_StoneHeroExchange_5528 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_StoneHeroExchange_5528 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_StoneHeroExchange_5528> parser() {
         return PARSER;
      }

      public Parser<S2C_StoneHeroExchange_5528> getParserForType() {
         return PARSER;
      }

      public S2C_StoneHeroExchange_5528 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_StoneHeroExchange_5528OrBuilder {
         private int bitField0_;
         private int heroCode_;
         private CommonMsg.TreasureStone stoneInfo_;
         private SingleFieldBuilderV3<CommonMsg.TreasureStone, CommonMsg.TreasureStone.Builder, CommonMsg.TreasureStoneOrBuilder> stoneInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneHeroExchange_5528_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneHeroExchange_5528_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_StoneHeroExchange_5528.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (ExclusiveTreasureMsg.S2C_StoneHeroExchange_5528.alwaysUseFieldBuilders) {
               this.getStoneInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.heroCode_ = 0;
            this.bitField0_ &= -2;
            if (this.stoneInfoBuilder_ == null) {
               this.stoneInfo_ = null;
            } else {
               this.stoneInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return ExclusiveTreasureMsg.internal_static_ExclusiveTreasure_com_gzbz_protobuf_S2C_StoneHeroExchange_5528_descriptor;
         }

         public S2C_StoneHeroExchange_5528 getDefaultInstanceForType() {
            return ExclusiveTreasureMsg.S2C_StoneHeroExchange_5528.getDefaultInstance();
         }

         public S2C_StoneHeroExchange_5528 build() {
            S2C_StoneHeroExchange_5528 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_StoneHeroExchange_5528 buildPartial() {
            S2C_StoneHeroExchange_5528 result = new S2C_StoneHeroExchange_5528(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroCode_ = this.heroCode_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.stoneInfoBuilder_ == null) {
                  result.stoneInfo_ = this.stoneInfo_;
               } else {
                  result.stoneInfo_ = (CommonMsg.TreasureStone)this.stoneInfoBuilder_.build();
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
            if (other instanceof S2C_StoneHeroExchange_5528) {
               return this.mergeFrom((S2C_StoneHeroExchange_5528)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_StoneHeroExchange_5528 other) {
            if (other == ExclusiveTreasureMsg.S2C_StoneHeroExchange_5528.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroCode()) {
                  this.setHeroCode(other.getHeroCode());
               }

               if (other.hasStoneInfo()) {
                  this.mergeStoneInfo(other.getStoneInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroCode()) {
               return false;
            } else if (!this.hasStoneInfo()) {
               return false;
            } else {
               return this.getStoneInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_StoneHeroExchange_5528 parsedMessage = null;

            try {
               parsedMessage = (S2C_StoneHeroExchange_5528)ExclusiveTreasureMsg.S2C_StoneHeroExchange_5528.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_StoneHeroExchange_5528)e.getUnfinishedMessage();
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

         public boolean hasStoneInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.TreasureStone getStoneInfo() {
            if (this.stoneInfoBuilder_ == null) {
               return this.stoneInfo_ == null ? CommonMsg.TreasureStone.getDefaultInstance() : this.stoneInfo_;
            } else {
               return (CommonMsg.TreasureStone)this.stoneInfoBuilder_.getMessage();
            }
         }

         public Builder setStoneInfo(CommonMsg.TreasureStone value) {
            if (this.stoneInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.stoneInfo_ = value;
               this.onChanged();
            } else {
               this.stoneInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setStoneInfo(CommonMsg.TreasureStone.Builder builderForValue) {
            if (this.stoneInfoBuilder_ == null) {
               this.stoneInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.stoneInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeStoneInfo(CommonMsg.TreasureStone value) {
            if (this.stoneInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.stoneInfo_ != null && this.stoneInfo_ != CommonMsg.TreasureStone.getDefaultInstance()) {
                  this.stoneInfo_ = CommonMsg.TreasureStone.newBuilder(this.stoneInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.stoneInfo_ = value;
               }

               this.onChanged();
            } else {
               this.stoneInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearStoneInfo() {
            if (this.stoneInfoBuilder_ == null) {
               this.stoneInfo_ = null;
               this.onChanged();
            } else {
               this.stoneInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.TreasureStone.Builder getStoneInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.TreasureStone.Builder)this.getStoneInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.TreasureStoneOrBuilder getStoneInfoOrBuilder() {
            if (this.stoneInfoBuilder_ != null) {
               return (CommonMsg.TreasureStoneOrBuilder)this.stoneInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.stoneInfo_ == null ? CommonMsg.TreasureStone.getDefaultInstance() : this.stoneInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.TreasureStone, CommonMsg.TreasureStone.Builder, CommonMsg.TreasureStoneOrBuilder> getStoneInfoFieldBuilder() {
            if (this.stoneInfoBuilder_ == null) {
               this.stoneInfoBuilder_ = new SingleFieldBuilderV3(this.getStoneInfo(), this.getParentForChildren(), this.isClean());
               this.stoneInfo_ = null;
            }

            return this.stoneInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_ActivationTreasure_5501OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasSameHeroCode();

      int getSameHeroCode();

      boolean hasSameNationCode();

      int getSameNationCode();
   }

   public interface C2S_ComposeStone_5515OrBuilder extends MessageOrBuilder {
      List<Integer> getItemCodeList();

      int getItemCodeCount();

      int getItemCode(int index);

      boolean hasTargetId();

      int getTargetId();
   }

   public interface C2S_RecastTreasure_5507OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasUnLock();

      int getUnLock();
   }

   public interface C2S_Reset_5519OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface C2S_SaveRecast_5509OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface C2S_StoneExchange_5521OrBuilder extends MessageOrBuilder {
      List<Integer> getItemCodeList();

      int getItemCodeCount();

      int getItemCode(int index);

      boolean hasTargetId();

      int getTargetId();
   }

   public interface C2S_StoneHeroExchange_5527OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.StonePosition getPosition();

      boolean hasTargetId();

      int getTargetId();
   }

   public interface C2S_StoneSell_5517OrBuilder extends MessageOrBuilder {
      List<Integer> getItemCodeList();

      int getItemCodeCount();

      int getItemCode(int index);
   }

   public interface C2S_StrengthHeroStone_5525OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.StonePosition getPosition();

      boolean hasTargetId();

      int getTargetId();
   }

   public interface C2S_StrengthStone_5523OrBuilder extends MessageOrBuilder {
      boolean hasItemCode();

      int getItemCode();

      boolean hasTargetId();

      int getTargetId();
   }

   public interface C2S_TreasureInfo_5500OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface C2S_UndressTreasureStone_5503OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.StonePosition getPosition();
   }

   public interface C2S_UpLev_5511OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface C2S_UpStar_5513OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();
   }

   public interface C2S_WearTreasureStone_5505OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.StonePosition getPosition();

      boolean hasItemCode();

      int getItemCode();
   }

   public interface ExclusiveTreasureInfoOrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasLev();

      int getLev();

      boolean hasStar();

      int getStar();

      boolean hasBaseTreasure();

      RecastTreasure getBaseTreasure();

      RecastTreasureOrBuilder getBaseTreasureOrBuilder();

      boolean hasRecast();

      RecastTreasure getRecast();

      RecastTreasureOrBuilder getRecastOrBuilder();

      List<CommonMsg.TreasureStone> getStoneInfoList();

      CommonMsg.TreasureStone getStoneInfo(int index);

      int getStoneInfoCount();

      List<? extends CommonMsg.TreasureStoneOrBuilder> getStoneInfoOrBuilderList();

      CommonMsg.TreasureStoneOrBuilder getStoneInfoOrBuilder(int index);
   }

   public interface RecastTreasureOrBuilder extends MessageOrBuilder {
      boolean hasExtraProId();

      int getExtraProId();

      boolean hasCondition1();

      int getCondition1();

      boolean hasCondition2();

      int getCondition2();

      boolean hasExtraId();

      int getExtraId();
   }

   public interface S2C_ActivationTreasure_5502OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasTreasureInfo();

      ExclusiveTreasureInfo getTreasureInfo();

      ExclusiveTreasureInfoOrBuilder getTreasureInfoOrBuilder();
   }

   public interface S2C_ComposeStone_5516OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_RecastTreasure_5508OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasUnLock();

      int getUnLock();

      boolean hasRecast();

      RecastTreasure getRecast();

      RecastTreasureOrBuilder getRecastOrBuilder();
   }

   public interface S2C_Reset_5520OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_SaveRecast_5510OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasBaseTreasure();

      RecastTreasure getBaseTreasure();

      RecastTreasureOrBuilder getBaseTreasureOrBuilder();

      boolean hasRecast();

      RecastTreasure getRecast();

      RecastTreasureOrBuilder getRecastOrBuilder();
   }

   public interface S2C_StoneExchange_5522OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_StoneHeroExchange_5528OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasStoneInfo();

      CommonMsg.TreasureStone getStoneInfo();

      CommonMsg.TreasureStoneOrBuilder getStoneInfoOrBuilder();
   }

   public interface S2C_StoneSell_5518OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_StrengthHeroStone_5526OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasStoneInfo();

      CommonMsg.TreasureStone getStoneInfo();

      CommonMsg.TreasureStoneOrBuilder getStoneInfoOrBuilder();
   }

   public interface S2C_StrengthStone_5524OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_UndressTreasureStone_5504OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.StonePosition getPosition();

      boolean hasTreasureInfo();

      ExclusiveTreasureInfo getTreasureInfo();

      ExclusiveTreasureInfoOrBuilder getTreasureInfoOrBuilder();
   }

   public interface S2C_UpLev_5512OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasTreasureInfo();

      ExclusiveTreasureInfo getTreasureInfo();

      ExclusiveTreasureInfoOrBuilder getTreasureInfoOrBuilder();
   }

   public interface S2C_UpStar_5514OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasTreasureInfo();

      ExclusiveTreasureInfo getTreasureInfo();

      ExclusiveTreasureInfoOrBuilder getTreasureInfoOrBuilder();
   }

   public interface S2C_WearTreasureStone_5506OrBuilder extends MessageOrBuilder {
      boolean hasHeroCode();

      int getHeroCode();

      boolean hasPosition();

      CommonMsg.StonePosition getPosition();

      boolean hasTreasureInfo();

      ExclusiveTreasureInfo getTreasureInfo();

      ExclusiveTreasureInfoOrBuilder getTreasureInfoOrBuilder();
   }

   public interface TreasureStoneInfoOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasCode();

      int getCode();
   }
}
