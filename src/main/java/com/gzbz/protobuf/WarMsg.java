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

public final class WarMsg {
   private static final Descriptors.Descriptor internal_static_War_C2S_GetWarHLInfo_8001_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_C2S_GetWarHLInfo_8001_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_S2C_GetWarHLInfo_8002_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_S2C_GetWarHLInfo_8002_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_C2S_EnterHLBattle_8003_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_C2S_EnterHLBattle_8003_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_S2C_EnterHLBattle_8004_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_S2C_EnterHLBattle_8004_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_C2S_Answer_8005_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_C2S_Answer_8005_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_HLBuff_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_HLBuff_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_S2C_EventInfo_8006_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_S2C_EventInfo_8006_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_HLGoods_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_HLGoods_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_HLMarchShop_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_HLMarchShop_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_S2C_SpecialItem_8007_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_S2C_SpecialItem_8007_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_C2S_UseSpecialItemCure_8008_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_C2S_UseSpecialItemCure_8008_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_S2C_UseSpecialItemCure_8009_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_S2C_UseSpecialItemCure_8009_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_C2S_UseSpecialItemPoison_8010_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_C2S_UseSpecialItemPoison_8010_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_C2S_UseSpecialItemShopMan_8011_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_C2S_UseSpecialItemShopMan_8011_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_S2C_NewGoods_8012_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_S2C_NewGoods_8012_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_C2S_BuyMarchShopGoods_8013_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_C2S_BuyMarchShopGoods_8013_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_S2C_BuyMarchShopGoods_8014_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_S2C_BuyMarchShopGoods_8014_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_C2S_BuyPoison_8015_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_C2S_BuyPoison_8015_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_C2S_GetPassReward_8016_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_C2S_GetPassReward_8016_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_S2C_TargetReward_8017_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_S2C_TargetReward_8017_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_C2S_OpenBox_8018_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_C2S_OpenBox_8018_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_C2S_EnterNextFloor_8019_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_C2S_EnterNextFloor_8019_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_S2C_AllRewards_8020_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_S2C_AllRewards_8020_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_C2S_ChangePlayedHero_8021_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_C2S_ChangePlayedHero_8021_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_S2C_ChangePlayedHero_8022_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_S2C_ChangePlayedHero_8022_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_C2S_LuckyGambling_8023_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_C2S_LuckyGambling_8023_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_S2C_LuckyGambling_8024_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_S2C_LuckyGambling_8024_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_C2S_WarHLRank_8025_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_C2S_WarHLRank_8025_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_S2C_WarHLRankResult_8026_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_S2C_WarHLRankResult_8026_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_RankInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_RankInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_C2S_ReceiveBoxKey_8027_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_C2S_ReceiveBoxKey_8027_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_S2C_ReceiveBoxKey_8028_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_S2C_ReceiveBoxKey_8028_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_S2C_UsePoisonResult_8029_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_S2C_UsePoisonResult_8029_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_S2C_OpenBoxResult_8030_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_S2C_OpenBoxResult_8030_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_C2S_SweepStage_8031_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_C2S_SweepStage_8031_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_C2S_ResetTime_8033_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_C2S_ResetTime_8033_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_War_S2C_ResetTime_8034_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_War_S2C_ResetTime_8034_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private WarMsg() {
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
      String[] descriptorData = new String[]{"\n\tWar.proto\u0012\u0003War\u001a\fcommon.proto\"+\n\u0015C2S_GetWarHLInfo_8001\u0012\u0012\n\nplayerCode\u0018\u0001 \u0002(\u0005\"Ò\u0003\n\u0015S2C_GetWarHLInfo_8002\u0012\u0013\n\u000bbattleFloor\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bpassFort\u0018\u0002 \u0003(\u0005\u0012'\n\u0004item\u0018\u0003 \u0002(\u000b2\u0019.War.S2C_SpecialItem_8007\u00120\n\u0006heroHp\u0018\u0004 \u0002(\u000b2 .War.S2C_UseSpecialItemCure_8009\u0012'\n\u0006events\u0018\u0005 \u0003(\u000b2\u0017.War.S2C_EventInfo_8006\u0012\u0019\n\u0004buff\u0018\u0006 \u0002(\u000b2\u000b.War.HLBuff\u0012#\n\tmarchShop\u0018\u0007 \u0002(\u000b2\u0010.War.HLMarchShop\u00120\n\ftargetReward\u0018\b \u0002(\u000b2\u001a.War.S2C_TargetReward_8017\u0012\u000f\n\u0007heroPos\u0018\t \u0002(\u0005\u0012\"\n\u0007enemyHp\u0018\n \u0003(\u000b2\u0011.common.MapDataIF\u0012\u0011\n\tcrossFort\u0018\u000b \u0003(\u0005\u0012\u000f\n\u0007fortSum\u0018\f \u0002(\u0005\u0012\u0011\n\tresetTime\u0018\r \u0002(\u0005\u0012\u001e\n\u0004hero\u0018\u000f \u0003(\u000b2\u0010.common.HeroInfo\u0012\u0010\n\bmaxFloor\u0018\u0010 \u0002(\u0005\"7\n\u0016C2S_EnterHLBattle_8003\u0012\u000f\n\u0007heroPos\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004fort\u0018\u0002 \u0002(\u0005\"ú\u0001\n\u0016S2C_EnterHLBattle_8004\u0012\u0013\n\u000bbattleFloor\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bpassFort\u0018\u0002 \u0003(\u0005\u0012!\n\u0006heroHp\u0018\u0003 \u0002(\u000b2\u0011.common.MapDataIF\u0012\"\n\u0007enemyHp\u0018\u0004 \u0002(\u000b2\u0011.common.MapDataIF\u0012'\n\u0006events\u0018\u0005 \u0003(\u000b2\u0017.War.S2C_EventInfo_8006\u0012\u000f\n\u0007heroPos\u0018\u0006 \u0002(\u0005\u0012'\n\u0004item\u0018\u0007 \u0002(\u000b2\u0019.War.S2C_SpecialItem_8007\u0012\u000f\n\u0007fortSum\u0018\b \u0002(\u0005\"E\n\u000fC2S_Answer_8005\u0012\u0010\n\beventPos\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bquestion\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006answer\u0018\u0003 \u0002(\u0005\",\n\u0006HLBuff\u0012\"\n\u0004buff\u0018\u0001 \u0003(\u000b2\u0014.common.PropertyInfo\"\u0096\u0001\n\u0012S2C_EventInfo_8006\u0012\u0010\n\beventPos\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007eventId\u0018\u0002 \u0002(\u0005\u0012#\n\bquestion\u0018\u0003 \u0003(\u000b2\u0011.common.MapDataII\u0012\u001b\n\u0005goods\u0018\u0004 \u0003(\u000b2\f.War.HLGoods\u0012\u000e\n\u0006buffId\u0018\u0005 \u0001(\u0005\u0012\u000b\n\u0003end\u0018\u0006 \u0002(\b\"z\n\u0007HLGoods\u0012\r\n\u0005index\u0018\u0001 \u0002(\u0005\u0012\u001e\n\u0004item\u0018\u0002 \u0002(\u000b2\u0010.common.ItemInfo\u0012\u001e\n\u0004cost\u0018\u0003 \u0002(\u000b2\u0010.common.ItemInfo\u0012\u0010\n\bdiscount\u0018\u0004 \u0002(\u0005\u0012\u000e\n\u0006bought\u0018\u0005 \u0002(\b\"*\n\u000bHLMarchShop\u0012\u001b\n\u0005goods\u0018\u0001 \u0003(\u000b2\f.War.HLGoods\":\n\u0014S2C_SpecialItem_8007\u0012\u0011\n\tusePoison\u0018\u0004 \u0002(\u0005\u0012\u000f\n\u0007useCure\u0018\u0005 \u0002(\u0005\".\n\u001bC2S_UseSpecialItemCure_8008\u0012\u000f\n\u0007heroPos\u0018\u0001 \u0002(\u0005\"Q\n\u001bS2C_UseSpecialItemCure_8009\u0012!\n\u0006heroHp\u0018\u0001 \u0003(\u000b2\u0011.common.MapDataIF\u0012\u000f\n\u0007useCure\u0018\u0002 \u0002(\u0005\"A\n\u001dC2S_UseSpecialItemPoison_8010\u0012\f\n\u0004fort\u0018\u0001 \u0002(\u0005\u0012\u0012\n\nautoFinish\u0018\u0002 \u0001(\b\"2\n\u001eC2S_UseSpecialItemShopMan_8011\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\"0\n\u0011S2C_NewGoods_8012\u0012\u001b\n\u0005goods\u0018\u0001 \u0002(\u000b2\f.War.HLGoods\"+\n\u001aC2S_BuyMarchShopGoods_8013\u0012\r\n\u0005index\u0018\u0001 \u0002(\u0005\"9\n\u001aS2C_BuyMarchShopGoods_8014\u0012\u001b\n\u0005goods\u0018\u0001 \u0002(\u000b2\f.War.HLGoods\"!\n\u0012C2S_BuyPoison_8015\u0012\u000b\n\u0003num\u0018\u0001 \u0002(\u0005\"$\n\u0016C2S_GetPassReward_8016\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"*\n\u0015S2C_TargetReward_8017\u0012\u0011\n\tcrossFort\u0018\u0001 \u0003(\u0005\"\u001f\n\u0010C2S_OpenBox_8018\u0012\u000b\n\u0003pos\u0018\u0001 \u0002(\u0005\"+\n\u0017C2S_EnterNextFloor_8019\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\"7\n\u0013S2C_AllRewards_8020\u0012 \n\u0006reward\u0018\u0001 \u0003(\u000b2\u0010.common.ItemInfo\",\n\u0019C2S_ChangePlayedHero_8021\u0012\u000f\n\u0007heroPos\u0018\u0001 \u0002(\u0005\",\n\u0019S2C_ChangePlayedHero_8022\u0012\u000f\n\u0007heroPos\u0018\u0001 \u0002(\u0005\";\n\u0016C2S_LuckyGambling_8023\u0012\u000f\n\u0007luckyId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\beventPos\u0018\u0002 \u0002(\u0005\"N\n\u0016S2C_LuckyGambling_8024\u0012\u0012\n\nrewardRate\u0018\u0001 \u0002(\u0005\u0012\u0010\n\beventPos\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006luckId\u0018\u0003 \u0002(\u0005\"\u0014\n\u0012C2S_WarHLRank_8025\"W\n\u0018S2C_WarHLRankResult_8026\u0012\u001d\n\u0006myRank\u0018\u0001 \u0002(\u000b2\r.War.RankInfo\u0012\u001c\n\u0005infos\u0018\u0002 \u0003(\u000b2\r.War.RankInfo\"\u0085\u0001\n\bRankInfo\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\u0012\n\n\u0002lv\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004head\u0018\u0004 \u0002(\u0005\u0012\f\n\u0004name\u0018\u0005 \u0002(\t\u0012\u0010\n\bmaxFloor\u0018\u0006 \u0002(\u0005\u0012\r\n\u0005point\u0018\u0007 \u0002(\u0005\u0012\u0010\n\bserverId\u0018\t \u0002(\u0005\"*\n\u0016C2S_ReceiveBoxKey_8027\u0012\u0010\n\beventPos\u0018\u0001 \u0002(\u0005\"*\n\u0016S2C_ReceiveBoxKey_8028\u0012\u0010\n\beventPos\u0018\u0001 \u0002(\u0005\"*\n\u0018S2C_UsePoisonResult_8029\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\u0005\"L\n\u0016S2C_OpenBoxResult_8030\u0012\u0010\n\beventPos\u0018\u0001 \u0002(\u0005\u0012 \n\u0006reward\u0018\u0002 \u0002(\u000b2\u0010.common.ItemInfo\")\n\u0013C2S_SweepStage_8031\u0012\u0012\n\nautoFinish\u0018\u0001 \u0001(\b\"\u0014\n\u0012C2S_ResetTime_8033\"'\n\u0012S2C_ResetTime_8034\u0012\u0011\n\tresetTime\u0018\u0001 \u0002(\u0005B\u001d\n\u0011com.gzbz.protobufB\u0006WarMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_War_C2S_GetWarHLInfo_8001_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_War_C2S_GetWarHLInfo_8001_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_C2S_GetWarHLInfo_8001_descriptor, new String[]{"PlayerCode"});
      internal_static_War_S2C_GetWarHLInfo_8002_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_War_S2C_GetWarHLInfo_8002_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_S2C_GetWarHLInfo_8002_descriptor, new String[]{"BattleFloor", "PassFort", "Item", "HeroHp", "Events", "Buff", "MarchShop", "TargetReward", "HeroPos", "EnemyHp", "CrossFort", "FortSum", "ResetTime", "Hero", "MaxFloor"});
      internal_static_War_C2S_EnterHLBattle_8003_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_War_C2S_EnterHLBattle_8003_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_C2S_EnterHLBattle_8003_descriptor, new String[]{"HeroPos", "Fort"});
      internal_static_War_S2C_EnterHLBattle_8004_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_War_S2C_EnterHLBattle_8004_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_S2C_EnterHLBattle_8004_descriptor, new String[]{"BattleFloor", "PassFort", "HeroHp", "EnemyHp", "Events", "HeroPos", "Item", "FortSum"});
      internal_static_War_C2S_Answer_8005_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_War_C2S_Answer_8005_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_C2S_Answer_8005_descriptor, new String[]{"EventPos", "Question", "Answer"});
      internal_static_War_HLBuff_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_War_HLBuff_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_HLBuff_descriptor, new String[]{"Buff"});
      internal_static_War_S2C_EventInfo_8006_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_War_S2C_EventInfo_8006_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_S2C_EventInfo_8006_descriptor, new String[]{"EventPos", "EventId", "Question", "Goods", "BuffId", "End"});
      internal_static_War_HLGoods_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_War_HLGoods_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_HLGoods_descriptor, new String[]{"Index", "Item", "Cost", "Discount", "Bought"});
      internal_static_War_HLMarchShop_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_War_HLMarchShop_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_HLMarchShop_descriptor, new String[]{"Goods"});
      internal_static_War_S2C_SpecialItem_8007_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_War_S2C_SpecialItem_8007_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_S2C_SpecialItem_8007_descriptor, new String[]{"UsePoison", "UseCure"});
      internal_static_War_C2S_UseSpecialItemCure_8008_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_War_C2S_UseSpecialItemCure_8008_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_C2S_UseSpecialItemCure_8008_descriptor, new String[]{"HeroPos"});
      internal_static_War_S2C_UseSpecialItemCure_8009_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_War_S2C_UseSpecialItemCure_8009_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_S2C_UseSpecialItemCure_8009_descriptor, new String[]{"HeroHp", "UseCure"});
      internal_static_War_C2S_UseSpecialItemPoison_8010_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_War_C2S_UseSpecialItemPoison_8010_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_C2S_UseSpecialItemPoison_8010_descriptor, new String[]{"Fort", "AutoFinish"});
      internal_static_War_C2S_UseSpecialItemShopMan_8011_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_War_C2S_UseSpecialItemShopMan_8011_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_C2S_UseSpecialItemShopMan_8011_descriptor, new String[]{"PlayerId"});
      internal_static_War_S2C_NewGoods_8012_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_War_S2C_NewGoods_8012_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_S2C_NewGoods_8012_descriptor, new String[]{"Goods"});
      internal_static_War_C2S_BuyMarchShopGoods_8013_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_War_C2S_BuyMarchShopGoods_8013_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_C2S_BuyMarchShopGoods_8013_descriptor, new String[]{"Index"});
      internal_static_War_S2C_BuyMarchShopGoods_8014_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_War_S2C_BuyMarchShopGoods_8014_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_S2C_BuyMarchShopGoods_8014_descriptor, new String[]{"Goods"});
      internal_static_War_C2S_BuyPoison_8015_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_War_C2S_BuyPoison_8015_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_C2S_BuyPoison_8015_descriptor, new String[]{"Num"});
      internal_static_War_C2S_GetPassReward_8016_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_War_C2S_GetPassReward_8016_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_C2S_GetPassReward_8016_descriptor, new String[]{"Id"});
      internal_static_War_S2C_TargetReward_8017_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_War_S2C_TargetReward_8017_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_S2C_TargetReward_8017_descriptor, new String[]{"CrossFort"});
      internal_static_War_C2S_OpenBox_8018_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_War_C2S_OpenBox_8018_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_C2S_OpenBox_8018_descriptor, new String[]{"Pos"});
      internal_static_War_C2S_EnterNextFloor_8019_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_War_C2S_EnterNextFloor_8019_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_C2S_EnterNextFloor_8019_descriptor, new String[]{"PlayerId"});
      internal_static_War_S2C_AllRewards_8020_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_War_S2C_AllRewards_8020_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_S2C_AllRewards_8020_descriptor, new String[]{"Reward"});
      internal_static_War_C2S_ChangePlayedHero_8021_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_War_C2S_ChangePlayedHero_8021_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_C2S_ChangePlayedHero_8021_descriptor, new String[]{"HeroPos"});
      internal_static_War_S2C_ChangePlayedHero_8022_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_War_S2C_ChangePlayedHero_8022_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_S2C_ChangePlayedHero_8022_descriptor, new String[]{"HeroPos"});
      internal_static_War_C2S_LuckyGambling_8023_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_War_C2S_LuckyGambling_8023_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_C2S_LuckyGambling_8023_descriptor, new String[]{"LuckyId", "EventPos"});
      internal_static_War_S2C_LuckyGambling_8024_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_War_S2C_LuckyGambling_8024_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_S2C_LuckyGambling_8024_descriptor, new String[]{"RewardRate", "EventPos", "LuckId"});
      internal_static_War_C2S_WarHLRank_8025_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_War_C2S_WarHLRank_8025_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_C2S_WarHLRank_8025_descriptor, new String[0]);
      internal_static_War_S2C_WarHLRankResult_8026_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_War_S2C_WarHLRankResult_8026_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_S2C_WarHLRankResult_8026_descriptor, new String[]{"MyRank", "Infos"});
      internal_static_War_RankInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_War_RankInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_RankInfo_descriptor, new String[]{"Rank", "PlayerId", "Lv", "Head", "Name", "MaxFloor", "Point", "ServerId"});
      internal_static_War_C2S_ReceiveBoxKey_8027_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_War_C2S_ReceiveBoxKey_8027_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_C2S_ReceiveBoxKey_8027_descriptor, new String[]{"EventPos"});
      internal_static_War_S2C_ReceiveBoxKey_8028_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_War_S2C_ReceiveBoxKey_8028_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_S2C_ReceiveBoxKey_8028_descriptor, new String[]{"EventPos"});
      internal_static_War_S2C_UsePoisonResult_8029_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_War_S2C_UsePoisonResult_8029_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_S2C_UsePoisonResult_8029_descriptor, new String[]{"Result"});
      internal_static_War_S2C_OpenBoxResult_8030_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_War_S2C_OpenBoxResult_8030_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_S2C_OpenBoxResult_8030_descriptor, new String[]{"EventPos", "Reward"});
      internal_static_War_C2S_SweepStage_8031_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_War_C2S_SweepStage_8031_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_C2S_SweepStage_8031_descriptor, new String[]{"AutoFinish"});
      internal_static_War_C2S_ResetTime_8033_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(35);
      internal_static_War_C2S_ResetTime_8033_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_C2S_ResetTime_8033_descriptor, new String[0]);
      internal_static_War_S2C_ResetTime_8034_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(36);
      internal_static_War_S2C_ResetTime_8034_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_War_S2C_ResetTime_8034_descriptor, new String[]{"ResetTime"});
      CommonMsg.getDescriptor();
   }

   public static final class C2S_GetWarHLInfo_8001 extends GeneratedMessageV3 implements C2S_GetWarHLInfo_8001OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERCODE_FIELD_NUMBER = 1;
      private int playerCode_;
      private byte memoizedIsInitialized;
      private static final C2S_GetWarHLInfo_8001 DEFAULT_INSTANCE = new C2S_GetWarHLInfo_8001();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GetWarHLInfo_8001> PARSER = new AbstractParser<C2S_GetWarHLInfo_8001>() {
         public C2S_GetWarHLInfo_8001 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GetWarHLInfo_8001(input, extensionRegistry);
         }
      };

      private C2S_GetWarHLInfo_8001(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GetWarHLInfo_8001() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GetWarHLInfo_8001();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GetWarHLInfo_8001(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.playerCode_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WarMsg.internal_static_War_C2S_GetWarHLInfo_8001_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_C2S_GetWarHLInfo_8001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetWarHLInfo_8001.class, Builder.class);
      }

      public boolean hasPlayerCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerCode() {
         return this.playerCode_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerCode()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.playerCode_);
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
               size += CodedOutputStream.computeInt32Size(1, this.playerCode_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_GetWarHLInfo_8001)) {
            return super.equals(obj);
         } else {
            C2S_GetWarHLInfo_8001 other = (C2S_GetWarHLInfo_8001)obj;
            if (this.hasPlayerCode() != other.hasPlayerCode()) {
               return false;
            } else if (this.hasPlayerCode() && this.getPlayerCode() != other.getPlayerCode()) {
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
            if (this.hasPlayerCode()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_GetWarHLInfo_8001 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GetWarHLInfo_8001)PARSER.parseFrom(data);
      }

      public static C2S_GetWarHLInfo_8001 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetWarHLInfo_8001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetWarHLInfo_8001 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GetWarHLInfo_8001)PARSER.parseFrom(data);
      }

      public static C2S_GetWarHLInfo_8001 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetWarHLInfo_8001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetWarHLInfo_8001 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GetWarHLInfo_8001)PARSER.parseFrom(data);
      }

      public static C2S_GetWarHLInfo_8001 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetWarHLInfo_8001)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetWarHLInfo_8001 parseFrom(InputStream input) throws IOException {
         return (C2S_GetWarHLInfo_8001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetWarHLInfo_8001 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetWarHLInfo_8001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetWarHLInfo_8001 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GetWarHLInfo_8001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GetWarHLInfo_8001 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetWarHLInfo_8001)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetWarHLInfo_8001 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GetWarHLInfo_8001)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetWarHLInfo_8001 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetWarHLInfo_8001)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GetWarHLInfo_8001 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GetWarHLInfo_8001 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GetWarHLInfo_8001> parser() {
         return PARSER;
      }

      public Parser<C2S_GetWarHLInfo_8001> getParserForType() {
         return PARSER;
      }

      public C2S_GetWarHLInfo_8001 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GetWarHLInfo_8001OrBuilder {
         private int bitField0_;
         private int playerCode_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_C2S_GetWarHLInfo_8001_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_C2S_GetWarHLInfo_8001_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetWarHLInfo_8001.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.C2S_GetWarHLInfo_8001.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerCode_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_C2S_GetWarHLInfo_8001_descriptor;
         }

         public C2S_GetWarHLInfo_8001 getDefaultInstanceForType() {
            return WarMsg.C2S_GetWarHLInfo_8001.getDefaultInstance();
         }

         public C2S_GetWarHLInfo_8001 build() {
            C2S_GetWarHLInfo_8001 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GetWarHLInfo_8001 buildPartial() {
            C2S_GetWarHLInfo_8001 result = new C2S_GetWarHLInfo_8001(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerCode_ = this.playerCode_;
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
            if (other instanceof C2S_GetWarHLInfo_8001) {
               return this.mergeFrom((C2S_GetWarHLInfo_8001)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GetWarHLInfo_8001 other) {
            if (other == WarMsg.C2S_GetWarHLInfo_8001.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerCode()) {
                  this.setPlayerCode(other.getPlayerCode());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPlayerCode();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_GetWarHLInfo_8001 parsedMessage = null;

            try {
               parsedMessage = (C2S_GetWarHLInfo_8001)WarMsg.C2S_GetWarHLInfo_8001.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GetWarHLInfo_8001)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerCode() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPlayerCode() {
            return this.playerCode_;
         }

         public Builder setPlayerCode(int value) {
            this.bitField0_ |= 1;
            this.playerCode_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerCode() {
            this.bitField0_ &= -2;
            this.playerCode_ = 0;
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

   public static final class S2C_GetWarHLInfo_8002 extends GeneratedMessageV3 implements S2C_GetWarHLInfo_8002OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BATTLEFLOOR_FIELD_NUMBER = 1;
      private int battleFloor_;
      public static final int PASSFORT_FIELD_NUMBER = 2;
      private Internal.IntList passFort_;
      public static final int ITEM_FIELD_NUMBER = 3;
      private S2C_SpecialItem_8007 item_;
      public static final int HEROHP_FIELD_NUMBER = 4;
      private S2C_UseSpecialItemCure_8009 heroHp_;
      public static final int EVENTS_FIELD_NUMBER = 5;
      private List<S2C_EventInfo_8006> events_;
      public static final int BUFF_FIELD_NUMBER = 6;
      private HLBuff buff_;
      public static final int MARCHSHOP_FIELD_NUMBER = 7;
      private HLMarchShop marchShop_;
      public static final int TARGETREWARD_FIELD_NUMBER = 8;
      private S2C_TargetReward_8017 targetReward_;
      public static final int HEROPOS_FIELD_NUMBER = 9;
      private int heroPos_;
      public static final int ENEMYHP_FIELD_NUMBER = 10;
      private List<CommonMsg.MapDataIF> enemyHp_;
      public static final int CROSSFORT_FIELD_NUMBER = 11;
      private Internal.IntList crossFort_;
      public static final int FORTSUM_FIELD_NUMBER = 12;
      private int fortSum_;
      public static final int RESETTIME_FIELD_NUMBER = 13;
      private int resetTime_;
      public static final int HERO_FIELD_NUMBER = 15;
      private List<CommonMsg.HeroInfo> hero_;
      public static final int MAXFLOOR_FIELD_NUMBER = 16;
      private int maxFloor_;
      private byte memoizedIsInitialized;
      private static final S2C_GetWarHLInfo_8002 DEFAULT_INSTANCE = new S2C_GetWarHLInfo_8002();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_GetWarHLInfo_8002> PARSER = new AbstractParser<S2C_GetWarHLInfo_8002>() {
         public S2C_GetWarHLInfo_8002 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_GetWarHLInfo_8002(input, extensionRegistry);
         }
      };

      private S2C_GetWarHLInfo_8002(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_GetWarHLInfo_8002() {
         this.memoizedIsInitialized = -1;
         this.passFort_ = emptyIntList();
         this.events_ = Collections.emptyList();
         this.enemyHp_ = Collections.emptyList();
         this.crossFort_ = emptyIntList();
         this.hero_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_GetWarHLInfo_8002();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_GetWarHLInfo_8002(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.battleFloor_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.passFort_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.passFort_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.passFort_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 26:
                        S2C_SpecialItem_8007.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.item_.toBuilder();
                        }

                        this.item_ = (S2C_SpecialItem_8007)input.readMessage(WarMsg.S2C_SpecialItem_8007.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.item_);
                           this.item_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        continue;
                     case 34:
                        S2C_UseSpecialItemCure_8009.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.heroHp_.toBuilder();
                        }

                        this.heroHp_ = (S2C_UseSpecialItemCure_8009)input.readMessage(WarMsg.S2C_UseSpecialItemCure_8009.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.heroHp_);
                           this.heroHp_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 4;
                        continue;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.events_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.events_.add(input.readMessage(WarMsg.S2C_EventInfo_8006.PARSER, extensionRegistry));
                        continue;
                     case 50:
                        HLBuff.Builder subBuilder = null;
                        if ((this.bitField0_ & 8) != 0) {
                           subBuilder = this.buff_.toBuilder();
                        }

                        this.buff_ = (HLBuff)input.readMessage(WarMsg.HLBuff.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.buff_);
                           this.buff_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 8;
                        continue;
                     case 58:
                        HLMarchShop.Builder subBuilder = null;
                        if ((this.bitField0_ & 16) != 0) {
                           subBuilder = this.marchShop_.toBuilder();
                        }

                        this.marchShop_ = (HLMarchShop)input.readMessage(WarMsg.HLMarchShop.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.marchShop_);
                           this.marchShop_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 16;
                        continue;
                     case 66:
                        S2C_TargetReward_8017.Builder subBuilder = null;
                        if ((this.bitField0_ & 32) != 0) {
                           subBuilder = this.targetReward_.toBuilder();
                        }

                        this.targetReward_ = (S2C_TargetReward_8017)input.readMessage(WarMsg.S2C_TargetReward_8017.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.targetReward_);
                           this.targetReward_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 32;
                        continue;
                     case 72:
                        this.bitField0_ |= 64;
                        this.heroPos_ = input.readInt32();
                        continue;
                     case 82:
                        if ((mutable_bitField0_ & 512) == 0) {
                           this.enemyHp_ = new ArrayList();
                           mutable_bitField0_ |= 512;
                        }

                        this.enemyHp_.add(input.readMessage(CommonMsg.MapDataIF.PARSER, extensionRegistry));
                        continue;
                     case 88:
                        if ((mutable_bitField0_ & 1024) == 0) {
                           this.crossFort_ = newIntList();
                           mutable_bitField0_ |= 1024;
                        }

                        this.crossFort_.addInt(input.readInt32());
                        continue;
                     case 90:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1024) == 0 && input.getBytesUntilLimit() > 0) {
                           this.crossFort_ = newIntList();
                           mutable_bitField0_ |= 1024;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.crossFort_.addInt(input.readInt32());
                        }

                        input.popLimit(limit);
                        continue;
                     case 96:
                        this.bitField0_ |= 128;
                        this.fortSum_ = input.readInt32();
                        continue;
                     case 104:
                        this.bitField0_ |= 256;
                        this.resetTime_ = input.readInt32();
                        continue;
                     case 122:
                        if ((mutable_bitField0_ & 8192) == 0) {
                           this.hero_ = new ArrayList();
                           mutable_bitField0_ |= 8192;
                        }

                        this.hero_.add(input.readMessage(CommonMsg.HeroInfo.PARSER, extensionRegistry));
                        continue;
                     case 128:
                        this.bitField0_ |= 512;
                        this.maxFloor_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.passFort_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.passFort_.makeImmutable();
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.events_ = Collections.unmodifiableList(this.events_);
               }

               if ((mutable_bitField0_ & 512) != 0) {
                  this.enemyHp_ = Collections.unmodifiableList(this.enemyHp_);
               }

               if ((mutable_bitField0_ & 1024) != 0) {
                  this.crossFort_.makeImmutable();
               }

               if ((mutable_bitField0_ & 8192) != 0) {
                  this.hero_ = Collections.unmodifiableList(this.hero_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WarMsg.internal_static_War_S2C_GetWarHLInfo_8002_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_S2C_GetWarHLInfo_8002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetWarHLInfo_8002.class, Builder.class);
      }

      public boolean hasBattleFloor() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBattleFloor() {
         return this.battleFloor_;
      }

      public List<Integer> getPassFortList() {
         return this.passFort_;
      }

      public int getPassFortCount() {
         return this.passFort_.size();
      }

      public int getPassFort(int index) {
         return this.passFort_.getInt(index);
      }

      public boolean hasItem() {
         return (this.bitField0_ & 2) != 0;
      }

      public S2C_SpecialItem_8007 getItem() {
         return this.item_ == null ? WarMsg.S2C_SpecialItem_8007.getDefaultInstance() : this.item_;
      }

      public S2C_SpecialItem_8007OrBuilder getItemOrBuilder() {
         return this.item_ == null ? WarMsg.S2C_SpecialItem_8007.getDefaultInstance() : this.item_;
      }

      public boolean hasHeroHp() {
         return (this.bitField0_ & 4) != 0;
      }

      public S2C_UseSpecialItemCure_8009 getHeroHp() {
         return this.heroHp_ == null ? WarMsg.S2C_UseSpecialItemCure_8009.getDefaultInstance() : this.heroHp_;
      }

      public S2C_UseSpecialItemCure_8009OrBuilder getHeroHpOrBuilder() {
         return this.heroHp_ == null ? WarMsg.S2C_UseSpecialItemCure_8009.getDefaultInstance() : this.heroHp_;
      }

      public List<S2C_EventInfo_8006> getEventsList() {
         return this.events_;
      }

      public List<? extends S2C_EventInfo_8006OrBuilder> getEventsOrBuilderList() {
         return this.events_;
      }

      public int getEventsCount() {
         return this.events_.size();
      }

      public S2C_EventInfo_8006 getEvents(int index) {
         return (S2C_EventInfo_8006)this.events_.get(index);
      }

      public S2C_EventInfo_8006OrBuilder getEventsOrBuilder(int index) {
         return (S2C_EventInfo_8006OrBuilder)this.events_.get(index);
      }

      public boolean hasBuff() {
         return (this.bitField0_ & 8) != 0;
      }

      public HLBuff getBuff() {
         return this.buff_ == null ? WarMsg.HLBuff.getDefaultInstance() : this.buff_;
      }

      public HLBuffOrBuilder getBuffOrBuilder() {
         return this.buff_ == null ? WarMsg.HLBuff.getDefaultInstance() : this.buff_;
      }

      public boolean hasMarchShop() {
         return (this.bitField0_ & 16) != 0;
      }

      public HLMarchShop getMarchShop() {
         return this.marchShop_ == null ? WarMsg.HLMarchShop.getDefaultInstance() : this.marchShop_;
      }

      public HLMarchShopOrBuilder getMarchShopOrBuilder() {
         return this.marchShop_ == null ? WarMsg.HLMarchShop.getDefaultInstance() : this.marchShop_;
      }

      public boolean hasTargetReward() {
         return (this.bitField0_ & 32) != 0;
      }

      public S2C_TargetReward_8017 getTargetReward() {
         return this.targetReward_ == null ? WarMsg.S2C_TargetReward_8017.getDefaultInstance() : this.targetReward_;
      }

      public S2C_TargetReward_8017OrBuilder getTargetRewardOrBuilder() {
         return this.targetReward_ == null ? WarMsg.S2C_TargetReward_8017.getDefaultInstance() : this.targetReward_;
      }

      public boolean hasHeroPos() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getHeroPos() {
         return this.heroPos_;
      }

      public List<CommonMsg.MapDataIF> getEnemyHpList() {
         return this.enemyHp_;
      }

      public List<? extends CommonMsg.MapDataIFOrBuilder> getEnemyHpOrBuilderList() {
         return this.enemyHp_;
      }

      public int getEnemyHpCount() {
         return this.enemyHp_.size();
      }

      public CommonMsg.MapDataIF getEnemyHp(int index) {
         return (CommonMsg.MapDataIF)this.enemyHp_.get(index);
      }

      public CommonMsg.MapDataIFOrBuilder getEnemyHpOrBuilder(int index) {
         return (CommonMsg.MapDataIFOrBuilder)this.enemyHp_.get(index);
      }

      public List<Integer> getCrossFortList() {
         return this.crossFort_;
      }

      public int getCrossFortCount() {
         return this.crossFort_.size();
      }

      public int getCrossFort(int index) {
         return this.crossFort_.getInt(index);
      }

      public boolean hasFortSum() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getFortSum() {
         return this.fortSum_;
      }

      public boolean hasResetTime() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getResetTime() {
         return this.resetTime_;
      }

      public List<CommonMsg.HeroInfo> getHeroList() {
         return this.hero_;
      }

      public List<? extends CommonMsg.HeroInfoOrBuilder> getHeroOrBuilderList() {
         return this.hero_;
      }

      public int getHeroCount() {
         return this.hero_.size();
      }

      public CommonMsg.HeroInfo getHero(int index) {
         return (CommonMsg.HeroInfo)this.hero_.get(index);
      }

      public CommonMsg.HeroInfoOrBuilder getHeroOrBuilder(int index) {
         return (CommonMsg.HeroInfoOrBuilder)this.hero_.get(index);
      }

      public boolean hasMaxFloor() {
         return (this.bitField0_ & 512) != 0;
      }

      public int getMaxFloor() {
         return this.maxFloor_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBattleFloor()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasItem()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroHp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuff()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMarchShop()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTargetReward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroPos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFortSum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasResetTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMaxFloor()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getItem().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getHeroHp().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getEventsCount(); ++i) {
               if (!this.getEvents(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            if (!this.getBuff().isInitialized()) {
               this.memoizedIsInitialized = 0;
               return false;
            } else if (!this.getMarchShop().isInitialized()) {
               this.memoizedIsInitialized = 0;
               return false;
            } else {
               for(int i = 0; i < this.getEnemyHpCount(); ++i) {
                  if (!this.getEnemyHp(i).isInitialized()) {
                     this.memoizedIsInitialized = 0;
                     return false;
                  }
               }

               for(int i = 0; i < this.getHeroCount(); ++i) {
                  if (!this.getHero(i).isInitialized()) {
                     this.memoizedIsInitialized = 0;
                     return false;
                  }
               }

               this.memoizedIsInitialized = 1;
               return true;
            }
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.battleFloor_);
         }

         for(int i = 0; i < this.passFort_.size(); ++i) {
            output.writeInt32(2, this.passFort_.getInt(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(3, this.getItem());
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(4, this.getHeroHp());
         }

         for(int i = 0; i < this.events_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.events_.get(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeMessage(6, this.getBuff());
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeMessage(7, this.getMarchShop());
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeMessage(8, this.getTargetReward());
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(9, this.heroPos_);
         }

         for(int i = 0; i < this.enemyHp_.size(); ++i) {
            output.writeMessage(10, (MessageLite)this.enemyHp_.get(i));
         }

         for(int i = 0; i < this.crossFort_.size(); ++i) {
            output.writeInt32(11, this.crossFort_.getInt(i));
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(12, this.fortSum_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(13, this.resetTime_);
         }

         for(int i = 0; i < this.hero_.size(); ++i) {
            output.writeMessage(15, (MessageLite)this.hero_.get(i));
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(16, this.maxFloor_);
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
               size += CodedOutputStream.computeInt32Size(1, this.battleFloor_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.passFort_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.passFort_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getPassFortList().size();
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(3, this.getItem());
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(4, this.getHeroHp());
            }

            for(int i = 0; i < this.events_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.events_.get(i));
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeMessageSize(6, this.getBuff());
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeMessageSize(7, this.getMarchShop());
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeMessageSize(8, this.getTargetReward());
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.heroPos_);
            }

            for(int i = 0; i < this.enemyHp_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(10, (MessageLite)this.enemyHp_.get(i));
            }

            dataSize = 0;

            for(int i = 0; i < this.crossFort_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.crossFort_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getCrossFortList().size();
            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(12, this.fortSum_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(13, this.resetTime_);
            }

            for(int i = 0; i < this.hero_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(15, (MessageLite)this.hero_.get(i));
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(16, this.maxFloor_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_GetWarHLInfo_8002)) {
            return super.equals(obj);
         } else {
            S2C_GetWarHLInfo_8002 other = (S2C_GetWarHLInfo_8002)obj;
            if (this.hasBattleFloor() != other.hasBattleFloor()) {
               return false;
            } else if (this.hasBattleFloor() && this.getBattleFloor() != other.getBattleFloor()) {
               return false;
            } else if (!this.getPassFortList().equals(other.getPassFortList())) {
               return false;
            } else if (this.hasItem() != other.hasItem()) {
               return false;
            } else if (this.hasItem() && !this.getItem().equals(other.getItem())) {
               return false;
            } else if (this.hasHeroHp() != other.hasHeroHp()) {
               return false;
            } else if (this.hasHeroHp() && !this.getHeroHp().equals(other.getHeroHp())) {
               return false;
            } else if (!this.getEventsList().equals(other.getEventsList())) {
               return false;
            } else if (this.hasBuff() != other.hasBuff()) {
               return false;
            } else if (this.hasBuff() && !this.getBuff().equals(other.getBuff())) {
               return false;
            } else if (this.hasMarchShop() != other.hasMarchShop()) {
               return false;
            } else if (this.hasMarchShop() && !this.getMarchShop().equals(other.getMarchShop())) {
               return false;
            } else if (this.hasTargetReward() != other.hasTargetReward()) {
               return false;
            } else if (this.hasTargetReward() && !this.getTargetReward().equals(other.getTargetReward())) {
               return false;
            } else if (this.hasHeroPos() != other.hasHeroPos()) {
               return false;
            } else if (this.hasHeroPos() && this.getHeroPos() != other.getHeroPos()) {
               return false;
            } else if (!this.getEnemyHpList().equals(other.getEnemyHpList())) {
               return false;
            } else if (!this.getCrossFortList().equals(other.getCrossFortList())) {
               return false;
            } else if (this.hasFortSum() != other.hasFortSum()) {
               return false;
            } else if (this.hasFortSum() && this.getFortSum() != other.getFortSum()) {
               return false;
            } else if (this.hasResetTime() != other.hasResetTime()) {
               return false;
            } else if (this.hasResetTime() && this.getResetTime() != other.getResetTime()) {
               return false;
            } else if (!this.getHeroList().equals(other.getHeroList())) {
               return false;
            } else if (this.hasMaxFloor() != other.hasMaxFloor()) {
               return false;
            } else if (this.hasMaxFloor() && this.getMaxFloor() != other.getMaxFloor()) {
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
            if (this.hasBattleFloor()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBattleFloor();
            }

            if (this.getPassFortCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPassFortList().hashCode();
            }

            if (this.hasItem()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getItem().hashCode();
            }

            if (this.hasHeroHp()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHeroHp().hashCode();
            }

            if (this.getEventsCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getEventsList().hashCode();
            }

            if (this.hasBuff()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getBuff().hashCode();
            }

            if (this.hasMarchShop()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getMarchShop().hashCode();
            }

            if (this.hasTargetReward()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getTargetReward().hashCode();
            }

            if (this.hasHeroPos()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getHeroPos();
            }

            if (this.getEnemyHpCount() > 0) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getEnemyHpList().hashCode();
            }

            if (this.getCrossFortCount() > 0) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getCrossFortList().hashCode();
            }

            if (this.hasFortSum()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getFortSum();
            }

            if (this.hasResetTime()) {
               hash = 37 * hash + 13;
               hash = 53 * hash + this.getResetTime();
            }

            if (this.getHeroCount() > 0) {
               hash = 37 * hash + 15;
               hash = 53 * hash + this.getHeroList().hashCode();
            }

            if (this.hasMaxFloor()) {
               hash = 37 * hash + 16;
               hash = 53 * hash + this.getMaxFloor();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_GetWarHLInfo_8002 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_GetWarHLInfo_8002)PARSER.parseFrom(data);
      }

      public static S2C_GetWarHLInfo_8002 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetWarHLInfo_8002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetWarHLInfo_8002 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_GetWarHLInfo_8002)PARSER.parseFrom(data);
      }

      public static S2C_GetWarHLInfo_8002 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetWarHLInfo_8002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetWarHLInfo_8002 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_GetWarHLInfo_8002)PARSER.parseFrom(data);
      }

      public static S2C_GetWarHLInfo_8002 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_GetWarHLInfo_8002)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_GetWarHLInfo_8002 parseFrom(InputStream input) throws IOException {
         return (S2C_GetWarHLInfo_8002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetWarHLInfo_8002 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetWarHLInfo_8002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetWarHLInfo_8002 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_GetWarHLInfo_8002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_GetWarHLInfo_8002 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetWarHLInfo_8002)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_GetWarHLInfo_8002 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_GetWarHLInfo_8002)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_GetWarHLInfo_8002 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_GetWarHLInfo_8002)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_GetWarHLInfo_8002 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_GetWarHLInfo_8002 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_GetWarHLInfo_8002> parser() {
         return PARSER;
      }

      public Parser<S2C_GetWarHLInfo_8002> getParserForType() {
         return PARSER;
      }

      public S2C_GetWarHLInfo_8002 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_GetWarHLInfo_8002OrBuilder {
         private int bitField0_;
         private int battleFloor_;
         private Internal.IntList passFort_;
         private S2C_SpecialItem_8007 item_;
         private SingleFieldBuilderV3<S2C_SpecialItem_8007, S2C_SpecialItem_8007.Builder, S2C_SpecialItem_8007OrBuilder> itemBuilder_;
         private S2C_UseSpecialItemCure_8009 heroHp_;
         private SingleFieldBuilderV3<S2C_UseSpecialItemCure_8009, S2C_UseSpecialItemCure_8009.Builder, S2C_UseSpecialItemCure_8009OrBuilder> heroHpBuilder_;
         private List<S2C_EventInfo_8006> events_;
         private RepeatedFieldBuilderV3<S2C_EventInfo_8006, S2C_EventInfo_8006.Builder, S2C_EventInfo_8006OrBuilder> eventsBuilder_;
         private HLBuff buff_;
         private SingleFieldBuilderV3<HLBuff, HLBuff.Builder, HLBuffOrBuilder> buffBuilder_;
         private HLMarchShop marchShop_;
         private SingleFieldBuilderV3<HLMarchShop, HLMarchShop.Builder, HLMarchShopOrBuilder> marchShopBuilder_;
         private S2C_TargetReward_8017 targetReward_;
         private SingleFieldBuilderV3<S2C_TargetReward_8017, S2C_TargetReward_8017.Builder, S2C_TargetReward_8017OrBuilder> targetRewardBuilder_;
         private int heroPos_;
         private List<CommonMsg.MapDataIF> enemyHp_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataIF, CommonMsg.MapDataIF.Builder, CommonMsg.MapDataIFOrBuilder> enemyHpBuilder_;
         private Internal.IntList crossFort_;
         private int fortSum_;
         private int resetTime_;
         private List<CommonMsg.HeroInfo> hero_;
         private RepeatedFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> heroBuilder_;
         private int maxFloor_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_S2C_GetWarHLInfo_8002_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_S2C_GetWarHLInfo_8002_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_GetWarHLInfo_8002.class, Builder.class);
         }

         private Builder() {
            this.passFort_ = WarMsg.S2C_GetWarHLInfo_8002.emptyIntList();
            this.events_ = Collections.emptyList();
            this.enemyHp_ = Collections.emptyList();
            this.crossFort_ = WarMsg.S2C_GetWarHLInfo_8002.emptyIntList();
            this.hero_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.passFort_ = WarMsg.S2C_GetWarHLInfo_8002.emptyIntList();
            this.events_ = Collections.emptyList();
            this.enemyHp_ = Collections.emptyList();
            this.crossFort_ = WarMsg.S2C_GetWarHLInfo_8002.emptyIntList();
            this.hero_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.S2C_GetWarHLInfo_8002.alwaysUseFieldBuilders) {
               this.getItemFieldBuilder();
               this.getHeroHpFieldBuilder();
               this.getEventsFieldBuilder();
               this.getBuffFieldBuilder();
               this.getMarchShopFieldBuilder();
               this.getTargetRewardFieldBuilder();
               this.getEnemyHpFieldBuilder();
               this.getHeroFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.battleFloor_ = 0;
            this.bitField0_ &= -2;
            this.passFort_ = WarMsg.S2C_GetWarHLInfo_8002.emptyIntList();
            this.bitField0_ &= -3;
            if (this.itemBuilder_ == null) {
               this.item_ = null;
            } else {
               this.itemBuilder_.clear();
            }

            this.bitField0_ &= -5;
            if (this.heroHpBuilder_ == null) {
               this.heroHp_ = null;
            } else {
               this.heroHpBuilder_.clear();
            }

            this.bitField0_ &= -9;
            if (this.eventsBuilder_ == null) {
               this.events_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.eventsBuilder_.clear();
            }

            if (this.buffBuilder_ == null) {
               this.buff_ = null;
            } else {
               this.buffBuilder_.clear();
            }

            this.bitField0_ &= -33;
            if (this.marchShopBuilder_ == null) {
               this.marchShop_ = null;
            } else {
               this.marchShopBuilder_.clear();
            }

            this.bitField0_ &= -65;
            if (this.targetRewardBuilder_ == null) {
               this.targetReward_ = null;
            } else {
               this.targetRewardBuilder_.clear();
            }

            this.bitField0_ &= -129;
            this.heroPos_ = 0;
            this.bitField0_ &= -257;
            if (this.enemyHpBuilder_ == null) {
               this.enemyHp_ = Collections.emptyList();
               this.bitField0_ &= -513;
            } else {
               this.enemyHpBuilder_.clear();
            }

            this.crossFort_ = WarMsg.S2C_GetWarHLInfo_8002.emptyIntList();
            this.bitField0_ &= -1025;
            this.fortSum_ = 0;
            this.bitField0_ &= -2049;
            this.resetTime_ = 0;
            this.bitField0_ &= -4097;
            if (this.heroBuilder_ == null) {
               this.hero_ = Collections.emptyList();
               this.bitField0_ &= -8193;
            } else {
               this.heroBuilder_.clear();
            }

            this.maxFloor_ = 0;
            this.bitField0_ &= -16385;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_S2C_GetWarHLInfo_8002_descriptor;
         }

         public S2C_GetWarHLInfo_8002 getDefaultInstanceForType() {
            return WarMsg.S2C_GetWarHLInfo_8002.getDefaultInstance();
         }

         public S2C_GetWarHLInfo_8002 build() {
            S2C_GetWarHLInfo_8002 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_GetWarHLInfo_8002 buildPartial() {
            S2C_GetWarHLInfo_8002 result = new S2C_GetWarHLInfo_8002(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.battleFloor_ = this.battleFloor_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.passFort_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.passFort_ = this.passFort_;
            if ((from_bitField0_ & 4) != 0) {
               if (this.itemBuilder_ == null) {
                  result.item_ = this.item_;
               } else {
                  result.item_ = (S2C_SpecialItem_8007)this.itemBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               if (this.heroHpBuilder_ == null) {
                  result.heroHp_ = this.heroHp_;
               } else {
                  result.heroHp_ = (S2C_UseSpecialItemCure_8009)this.heroHpBuilder_.build();
               }

               to_bitField0_ |= 4;
            }

            if (this.eventsBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.events_ = Collections.unmodifiableList(this.events_);
                  this.bitField0_ &= -17;
               }

               result.events_ = this.events_;
            } else {
               result.events_ = this.eventsBuilder_.build();
            }

            if ((from_bitField0_ & 32) != 0) {
               if (this.buffBuilder_ == null) {
                  result.buff_ = this.buff_;
               } else {
                  result.buff_ = (HLBuff)this.buffBuilder_.build();
               }

               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 64) != 0) {
               if (this.marchShopBuilder_ == null) {
                  result.marchShop_ = this.marchShop_;
               } else {
                  result.marchShop_ = (HLMarchShop)this.marchShopBuilder_.build();
               }

               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 128) != 0) {
               if (this.targetRewardBuilder_ == null) {
                  result.targetReward_ = this.targetReward_;
               } else {
                  result.targetReward_ = (S2C_TargetReward_8017)this.targetRewardBuilder_.build();
               }

               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.heroPos_ = this.heroPos_;
               to_bitField0_ |= 64;
            }

            if (this.enemyHpBuilder_ == null) {
               if ((this.bitField0_ & 512) != 0) {
                  this.enemyHp_ = Collections.unmodifiableList(this.enemyHp_);
                  this.bitField0_ &= -513;
               }

               result.enemyHp_ = this.enemyHp_;
            } else {
               result.enemyHp_ = this.enemyHpBuilder_.build();
            }

            if ((this.bitField0_ & 1024) != 0) {
               this.crossFort_.makeImmutable();
               this.bitField0_ &= -1025;
            }

            result.crossFort_ = this.crossFort_;
            if ((from_bitField0_ & 2048) != 0) {
               result.fortSum_ = this.fortSum_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 4096) != 0) {
               result.resetTime_ = this.resetTime_;
               to_bitField0_ |= 256;
            }

            if (this.heroBuilder_ == null) {
               if ((this.bitField0_ & 8192) != 0) {
                  this.hero_ = Collections.unmodifiableList(this.hero_);
                  this.bitField0_ &= -8193;
               }

               result.hero_ = this.hero_;
            } else {
               result.hero_ = this.heroBuilder_.build();
            }

            if ((from_bitField0_ & 16384) != 0) {
               result.maxFloor_ = this.maxFloor_;
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
            if (other instanceof S2C_GetWarHLInfo_8002) {
               return this.mergeFrom((S2C_GetWarHLInfo_8002)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_GetWarHLInfo_8002 other) {
            if (other == WarMsg.S2C_GetWarHLInfo_8002.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBattleFloor()) {
                  this.setBattleFloor(other.getBattleFloor());
               }

               if (!other.passFort_.isEmpty()) {
                  if (this.passFort_.isEmpty()) {
                     this.passFort_ = other.passFort_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensurePassFortIsMutable();
                     this.passFort_.addAll(other.passFort_);
                  }

                  this.onChanged();
               }

               if (other.hasItem()) {
                  this.mergeItem(other.getItem());
               }

               if (other.hasHeroHp()) {
                  this.mergeHeroHp(other.getHeroHp());
               }

               if (this.eventsBuilder_ == null) {
                  if (!other.events_.isEmpty()) {
                     if (this.events_.isEmpty()) {
                        this.events_ = other.events_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensureEventsIsMutable();
                        this.events_.addAll(other.events_);
                     }

                     this.onChanged();
                  }
               } else if (!other.events_.isEmpty()) {
                  if (this.eventsBuilder_.isEmpty()) {
                     this.eventsBuilder_.dispose();
                     this.eventsBuilder_ = null;
                     this.events_ = other.events_;
                     this.bitField0_ &= -17;
                     this.eventsBuilder_ = WarMsg.S2C_GetWarHLInfo_8002.alwaysUseFieldBuilders ? this.getEventsFieldBuilder() : null;
                  } else {
                     this.eventsBuilder_.addAllMessages(other.events_);
                  }
               }

               if (other.hasBuff()) {
                  this.mergeBuff(other.getBuff());
               }

               if (other.hasMarchShop()) {
                  this.mergeMarchShop(other.getMarchShop());
               }

               if (other.hasTargetReward()) {
                  this.mergeTargetReward(other.getTargetReward());
               }

               if (other.hasHeroPos()) {
                  this.setHeroPos(other.getHeroPos());
               }

               if (this.enemyHpBuilder_ == null) {
                  if (!other.enemyHp_.isEmpty()) {
                     if (this.enemyHp_.isEmpty()) {
                        this.enemyHp_ = other.enemyHp_;
                        this.bitField0_ &= -513;
                     } else {
                        this.ensureEnemyHpIsMutable();
                        this.enemyHp_.addAll(other.enemyHp_);
                     }

                     this.onChanged();
                  }
               } else if (!other.enemyHp_.isEmpty()) {
                  if (this.enemyHpBuilder_.isEmpty()) {
                     this.enemyHpBuilder_.dispose();
                     this.enemyHpBuilder_ = null;
                     this.enemyHp_ = other.enemyHp_;
                     this.bitField0_ &= -513;
                     this.enemyHpBuilder_ = WarMsg.S2C_GetWarHLInfo_8002.alwaysUseFieldBuilders ? this.getEnemyHpFieldBuilder() : null;
                  } else {
                     this.enemyHpBuilder_.addAllMessages(other.enemyHp_);
                  }
               }

               if (!other.crossFort_.isEmpty()) {
                  if (this.crossFort_.isEmpty()) {
                     this.crossFort_ = other.crossFort_;
                     this.bitField0_ &= -1025;
                  } else {
                     this.ensureCrossFortIsMutable();
                     this.crossFort_.addAll(other.crossFort_);
                  }

                  this.onChanged();
               }

               if (other.hasFortSum()) {
                  this.setFortSum(other.getFortSum());
               }

               if (other.hasResetTime()) {
                  this.setResetTime(other.getResetTime());
               }

               if (this.heroBuilder_ == null) {
                  if (!other.hero_.isEmpty()) {
                     if (this.hero_.isEmpty()) {
                        this.hero_ = other.hero_;
                        this.bitField0_ &= -8193;
                     } else {
                        this.ensureHeroIsMutable();
                        this.hero_.addAll(other.hero_);
                     }

                     this.onChanged();
                  }
               } else if (!other.hero_.isEmpty()) {
                  if (this.heroBuilder_.isEmpty()) {
                     this.heroBuilder_.dispose();
                     this.heroBuilder_ = null;
                     this.hero_ = other.hero_;
                     this.bitField0_ &= -8193;
                     this.heroBuilder_ = WarMsg.S2C_GetWarHLInfo_8002.alwaysUseFieldBuilders ? this.getHeroFieldBuilder() : null;
                  } else {
                     this.heroBuilder_.addAllMessages(other.hero_);
                  }
               }

               if (other.hasMaxFloor()) {
                  this.setMaxFloor(other.getMaxFloor());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBattleFloor()) {
               return false;
            } else if (!this.hasItem()) {
               return false;
            } else if (!this.hasHeroHp()) {
               return false;
            } else if (!this.hasBuff()) {
               return false;
            } else if (!this.hasMarchShop()) {
               return false;
            } else if (!this.hasTargetReward()) {
               return false;
            } else if (!this.hasHeroPos()) {
               return false;
            } else if (!this.hasFortSum()) {
               return false;
            } else if (!this.hasResetTime()) {
               return false;
            } else if (!this.hasMaxFloor()) {
               return false;
            } else if (!this.getItem().isInitialized()) {
               return false;
            } else if (!this.getHeroHp().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getEventsCount(); ++i) {
                  if (!this.getEvents(i).isInitialized()) {
                     return false;
                  }
               }

               if (!this.getBuff().isInitialized()) {
                  return false;
               } else if (!this.getMarchShop().isInitialized()) {
                  return false;
               } else {
                  for(int i = 0; i < this.getEnemyHpCount(); ++i) {
                     if (!this.getEnemyHp(i).isInitialized()) {
                        return false;
                     }
                  }

                  for(int i = 0; i < this.getHeroCount(); ++i) {
                     if (!this.getHero(i).isInitialized()) {
                        return false;
                     }
                  }

                  return true;
               }
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_GetWarHLInfo_8002 parsedMessage = null;

            try {
               parsedMessage = (S2C_GetWarHLInfo_8002)WarMsg.S2C_GetWarHLInfo_8002.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_GetWarHLInfo_8002)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBattleFloor() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBattleFloor() {
            return this.battleFloor_;
         }

         public Builder setBattleFloor(int value) {
            this.bitField0_ |= 1;
            this.battleFloor_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBattleFloor() {
            this.bitField0_ &= -2;
            this.battleFloor_ = 0;
            this.onChanged();
            return this;
         }

         private void ensurePassFortIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.passFort_ = WarMsg.S2C_GetWarHLInfo_8002.mutableCopy(this.passFort_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getPassFortList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.passFort_) : this.passFort_);
         }

         public int getPassFortCount() {
            return this.passFort_.size();
         }

         public int getPassFort(int index) {
            return this.passFort_.getInt(index);
         }

         public Builder setPassFort(int index, int value) {
            this.ensurePassFortIsMutable();
            this.passFort_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addPassFort(int value) {
            this.ensurePassFortIsMutable();
            this.passFort_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllPassFort(Iterable<? extends Integer> values) {
            this.ensurePassFortIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.passFort_);
            this.onChanged();
            return this;
         }

         public Builder clearPassFort() {
            this.passFort_ = WarMsg.S2C_GetWarHLInfo_8002.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public boolean hasItem() {
            return (this.bitField0_ & 4) != 0;
         }

         public S2C_SpecialItem_8007 getItem() {
            if (this.itemBuilder_ == null) {
               return this.item_ == null ? WarMsg.S2C_SpecialItem_8007.getDefaultInstance() : this.item_;
            } else {
               return (S2C_SpecialItem_8007)this.itemBuilder_.getMessage();
            }
         }

         public Builder setItem(S2C_SpecialItem_8007 value) {
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

         public Builder setItem(S2C_SpecialItem_8007.Builder builderForValue) {
            if (this.itemBuilder_ == null) {
               this.item_ = builderForValue.build();
               this.onChanged();
            } else {
               this.itemBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeItem(S2C_SpecialItem_8007 value) {
            if (this.itemBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.item_ != null && this.item_ != WarMsg.S2C_SpecialItem_8007.getDefaultInstance()) {
                  this.item_ = WarMsg.S2C_SpecialItem_8007.newBuilder(this.item_).mergeFrom(value).buildPartial();
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

         public S2C_SpecialItem_8007.Builder getItemBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (S2C_SpecialItem_8007.Builder)this.getItemFieldBuilder().getBuilder();
         }

         public S2C_SpecialItem_8007OrBuilder getItemOrBuilder() {
            if (this.itemBuilder_ != null) {
               return (S2C_SpecialItem_8007OrBuilder)this.itemBuilder_.getMessageOrBuilder();
            } else {
               return this.item_ == null ? WarMsg.S2C_SpecialItem_8007.getDefaultInstance() : this.item_;
            }
         }

         private SingleFieldBuilderV3<S2C_SpecialItem_8007, S2C_SpecialItem_8007.Builder, S2C_SpecialItem_8007OrBuilder> getItemFieldBuilder() {
            if (this.itemBuilder_ == null) {
               this.itemBuilder_ = new SingleFieldBuilderV3(this.getItem(), this.getParentForChildren(), this.isClean());
               this.item_ = null;
            }

            return this.itemBuilder_;
         }

         public boolean hasHeroHp() {
            return (this.bitField0_ & 8) != 0;
         }

         public S2C_UseSpecialItemCure_8009 getHeroHp() {
            if (this.heroHpBuilder_ == null) {
               return this.heroHp_ == null ? WarMsg.S2C_UseSpecialItemCure_8009.getDefaultInstance() : this.heroHp_;
            } else {
               return (S2C_UseSpecialItemCure_8009)this.heroHpBuilder_.getMessage();
            }
         }

         public Builder setHeroHp(S2C_UseSpecialItemCure_8009 value) {
            if (this.heroHpBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.heroHp_ = value;
               this.onChanged();
            } else {
               this.heroHpBuilder_.setMessage(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder setHeroHp(S2C_UseSpecialItemCure_8009.Builder builderForValue) {
            if (this.heroHpBuilder_ == null) {
               this.heroHp_ = builderForValue.build();
               this.onChanged();
            } else {
               this.heroHpBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder mergeHeroHp(S2C_UseSpecialItemCure_8009 value) {
            if (this.heroHpBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0 && this.heroHp_ != null && this.heroHp_ != WarMsg.S2C_UseSpecialItemCure_8009.getDefaultInstance()) {
                  this.heroHp_ = WarMsg.S2C_UseSpecialItemCure_8009.newBuilder(this.heroHp_).mergeFrom(value).buildPartial();
               } else {
                  this.heroHp_ = value;
               }

               this.onChanged();
            } else {
               this.heroHpBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder clearHeroHp() {
            if (this.heroHpBuilder_ == null) {
               this.heroHp_ = null;
               this.onChanged();
            } else {
               this.heroHpBuilder_.clear();
            }

            this.bitField0_ &= -9;
            return this;
         }

         public S2C_UseSpecialItemCure_8009.Builder getHeroHpBuilder() {
            this.bitField0_ |= 8;
            this.onChanged();
            return (S2C_UseSpecialItemCure_8009.Builder)this.getHeroHpFieldBuilder().getBuilder();
         }

         public S2C_UseSpecialItemCure_8009OrBuilder getHeroHpOrBuilder() {
            if (this.heroHpBuilder_ != null) {
               return (S2C_UseSpecialItemCure_8009OrBuilder)this.heroHpBuilder_.getMessageOrBuilder();
            } else {
               return this.heroHp_ == null ? WarMsg.S2C_UseSpecialItemCure_8009.getDefaultInstance() : this.heroHp_;
            }
         }

         private SingleFieldBuilderV3<S2C_UseSpecialItemCure_8009, S2C_UseSpecialItemCure_8009.Builder, S2C_UseSpecialItemCure_8009OrBuilder> getHeroHpFieldBuilder() {
            if (this.heroHpBuilder_ == null) {
               this.heroHpBuilder_ = new SingleFieldBuilderV3(this.getHeroHp(), this.getParentForChildren(), this.isClean());
               this.heroHp_ = null;
            }

            return this.heroHpBuilder_;
         }

         private void ensureEventsIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.events_ = new ArrayList(this.events_);
               this.bitField0_ |= 16;
            }

         }

         public List<S2C_EventInfo_8006> getEventsList() {
            return this.eventsBuilder_ == null ? Collections.unmodifiableList(this.events_) : this.eventsBuilder_.getMessageList();
         }

         public int getEventsCount() {
            return this.eventsBuilder_ == null ? this.events_.size() : this.eventsBuilder_.getCount();
         }

         public S2C_EventInfo_8006 getEvents(int index) {
            return this.eventsBuilder_ == null ? (S2C_EventInfo_8006)this.events_.get(index) : (S2C_EventInfo_8006)this.eventsBuilder_.getMessage(index);
         }

         public Builder setEvents(int index, S2C_EventInfo_8006 value) {
            if (this.eventsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEventsIsMutable();
               this.events_.set(index, value);
               this.onChanged();
            } else {
               this.eventsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setEvents(int index, S2C_EventInfo_8006.Builder builderForValue) {
            if (this.eventsBuilder_ == null) {
               this.ensureEventsIsMutable();
               this.events_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.eventsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addEvents(S2C_EventInfo_8006 value) {
            if (this.eventsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEventsIsMutable();
               this.events_.add(value);
               this.onChanged();
            } else {
               this.eventsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addEvents(int index, S2C_EventInfo_8006 value) {
            if (this.eventsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEventsIsMutable();
               this.events_.add(index, value);
               this.onChanged();
            } else {
               this.eventsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addEvents(S2C_EventInfo_8006.Builder builderForValue) {
            if (this.eventsBuilder_ == null) {
               this.ensureEventsIsMutable();
               this.events_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.eventsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addEvents(int index, S2C_EventInfo_8006.Builder builderForValue) {
            if (this.eventsBuilder_ == null) {
               this.ensureEventsIsMutable();
               this.events_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.eventsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllEvents(Iterable<? extends S2C_EventInfo_8006> values) {
            if (this.eventsBuilder_ == null) {
               this.ensureEventsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.events_);
               this.onChanged();
            } else {
               this.eventsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearEvents() {
            if (this.eventsBuilder_ == null) {
               this.events_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.eventsBuilder_.clear();
            }

            return this;
         }

         public Builder removeEvents(int index) {
            if (this.eventsBuilder_ == null) {
               this.ensureEventsIsMutable();
               this.events_.remove(index);
               this.onChanged();
            } else {
               this.eventsBuilder_.remove(index);
            }

            return this;
         }

         public S2C_EventInfo_8006.Builder getEventsBuilder(int index) {
            return (S2C_EventInfo_8006.Builder)this.getEventsFieldBuilder().getBuilder(index);
         }

         public S2C_EventInfo_8006OrBuilder getEventsOrBuilder(int index) {
            return this.eventsBuilder_ == null ? (S2C_EventInfo_8006OrBuilder)this.events_.get(index) : (S2C_EventInfo_8006OrBuilder)this.eventsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends S2C_EventInfo_8006OrBuilder> getEventsOrBuilderList() {
            return this.eventsBuilder_ != null ? this.eventsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.events_);
         }

         public S2C_EventInfo_8006.Builder addEventsBuilder() {
            return (S2C_EventInfo_8006.Builder)this.getEventsFieldBuilder().addBuilder(WarMsg.S2C_EventInfo_8006.getDefaultInstance());
         }

         public S2C_EventInfo_8006.Builder addEventsBuilder(int index) {
            return (S2C_EventInfo_8006.Builder)this.getEventsFieldBuilder().addBuilder(index, WarMsg.S2C_EventInfo_8006.getDefaultInstance());
         }

         public List<S2C_EventInfo_8006.Builder> getEventsBuilderList() {
            return this.getEventsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<S2C_EventInfo_8006, S2C_EventInfo_8006.Builder, S2C_EventInfo_8006OrBuilder> getEventsFieldBuilder() {
            if (this.eventsBuilder_ == null) {
               this.eventsBuilder_ = new RepeatedFieldBuilderV3(this.events_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.events_ = null;
            }

            return this.eventsBuilder_;
         }

         public boolean hasBuff() {
            return (this.bitField0_ & 32) != 0;
         }

         public HLBuff getBuff() {
            if (this.buffBuilder_ == null) {
               return this.buff_ == null ? WarMsg.HLBuff.getDefaultInstance() : this.buff_;
            } else {
               return (HLBuff)this.buffBuilder_.getMessage();
            }
         }

         public Builder setBuff(HLBuff value) {
            if (this.buffBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.buff_ = value;
               this.onChanged();
            } else {
               this.buffBuilder_.setMessage(value);
            }

            this.bitField0_ |= 32;
            return this;
         }

         public Builder setBuff(HLBuff.Builder builderForValue) {
            if (this.buffBuilder_ == null) {
               this.buff_ = builderForValue.build();
               this.onChanged();
            } else {
               this.buffBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 32;
            return this;
         }

         public Builder mergeBuff(HLBuff value) {
            if (this.buffBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0 && this.buff_ != null && this.buff_ != WarMsg.HLBuff.getDefaultInstance()) {
                  this.buff_ = WarMsg.HLBuff.newBuilder(this.buff_).mergeFrom(value).buildPartial();
               } else {
                  this.buff_ = value;
               }

               this.onChanged();
            } else {
               this.buffBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 32;
            return this;
         }

         public Builder clearBuff() {
            if (this.buffBuilder_ == null) {
               this.buff_ = null;
               this.onChanged();
            } else {
               this.buffBuilder_.clear();
            }

            this.bitField0_ &= -33;
            return this;
         }

         public HLBuff.Builder getBuffBuilder() {
            this.bitField0_ |= 32;
            this.onChanged();
            return (HLBuff.Builder)this.getBuffFieldBuilder().getBuilder();
         }

         public HLBuffOrBuilder getBuffOrBuilder() {
            if (this.buffBuilder_ != null) {
               return (HLBuffOrBuilder)this.buffBuilder_.getMessageOrBuilder();
            } else {
               return this.buff_ == null ? WarMsg.HLBuff.getDefaultInstance() : this.buff_;
            }
         }

         private SingleFieldBuilderV3<HLBuff, HLBuff.Builder, HLBuffOrBuilder> getBuffFieldBuilder() {
            if (this.buffBuilder_ == null) {
               this.buffBuilder_ = new SingleFieldBuilderV3(this.getBuff(), this.getParentForChildren(), this.isClean());
               this.buff_ = null;
            }

            return this.buffBuilder_;
         }

         public boolean hasMarchShop() {
            return (this.bitField0_ & 64) != 0;
         }

         public HLMarchShop getMarchShop() {
            if (this.marchShopBuilder_ == null) {
               return this.marchShop_ == null ? WarMsg.HLMarchShop.getDefaultInstance() : this.marchShop_;
            } else {
               return (HLMarchShop)this.marchShopBuilder_.getMessage();
            }
         }

         public Builder setMarchShop(HLMarchShop value) {
            if (this.marchShopBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.marchShop_ = value;
               this.onChanged();
            } else {
               this.marchShopBuilder_.setMessage(value);
            }

            this.bitField0_ |= 64;
            return this;
         }

         public Builder setMarchShop(HLMarchShop.Builder builderForValue) {
            if (this.marchShopBuilder_ == null) {
               this.marchShop_ = builderForValue.build();
               this.onChanged();
            } else {
               this.marchShopBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 64;
            return this;
         }

         public Builder mergeMarchShop(HLMarchShop value) {
            if (this.marchShopBuilder_ == null) {
               if ((this.bitField0_ & 64) != 0 && this.marchShop_ != null && this.marchShop_ != WarMsg.HLMarchShop.getDefaultInstance()) {
                  this.marchShop_ = WarMsg.HLMarchShop.newBuilder(this.marchShop_).mergeFrom(value).buildPartial();
               } else {
                  this.marchShop_ = value;
               }

               this.onChanged();
            } else {
               this.marchShopBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 64;
            return this;
         }

         public Builder clearMarchShop() {
            if (this.marchShopBuilder_ == null) {
               this.marchShop_ = null;
               this.onChanged();
            } else {
               this.marchShopBuilder_.clear();
            }

            this.bitField0_ &= -65;
            return this;
         }

         public HLMarchShop.Builder getMarchShopBuilder() {
            this.bitField0_ |= 64;
            this.onChanged();
            return (HLMarchShop.Builder)this.getMarchShopFieldBuilder().getBuilder();
         }

         public HLMarchShopOrBuilder getMarchShopOrBuilder() {
            if (this.marchShopBuilder_ != null) {
               return (HLMarchShopOrBuilder)this.marchShopBuilder_.getMessageOrBuilder();
            } else {
               return this.marchShop_ == null ? WarMsg.HLMarchShop.getDefaultInstance() : this.marchShop_;
            }
         }

         private SingleFieldBuilderV3<HLMarchShop, HLMarchShop.Builder, HLMarchShopOrBuilder> getMarchShopFieldBuilder() {
            if (this.marchShopBuilder_ == null) {
               this.marchShopBuilder_ = new SingleFieldBuilderV3(this.getMarchShop(), this.getParentForChildren(), this.isClean());
               this.marchShop_ = null;
            }

            return this.marchShopBuilder_;
         }

         public boolean hasTargetReward() {
            return (this.bitField0_ & 128) != 0;
         }

         public S2C_TargetReward_8017 getTargetReward() {
            if (this.targetRewardBuilder_ == null) {
               return this.targetReward_ == null ? WarMsg.S2C_TargetReward_8017.getDefaultInstance() : this.targetReward_;
            } else {
               return (S2C_TargetReward_8017)this.targetRewardBuilder_.getMessage();
            }
         }

         public Builder setTargetReward(S2C_TargetReward_8017 value) {
            if (this.targetRewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.targetReward_ = value;
               this.onChanged();
            } else {
               this.targetRewardBuilder_.setMessage(value);
            }

            this.bitField0_ |= 128;
            return this;
         }

         public Builder setTargetReward(S2C_TargetReward_8017.Builder builderForValue) {
            if (this.targetRewardBuilder_ == null) {
               this.targetReward_ = builderForValue.build();
               this.onChanged();
            } else {
               this.targetRewardBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 128;
            return this;
         }

         public Builder mergeTargetReward(S2C_TargetReward_8017 value) {
            if (this.targetRewardBuilder_ == null) {
               if ((this.bitField0_ & 128) != 0 && this.targetReward_ != null && this.targetReward_ != WarMsg.S2C_TargetReward_8017.getDefaultInstance()) {
                  this.targetReward_ = WarMsg.S2C_TargetReward_8017.newBuilder(this.targetReward_).mergeFrom(value).buildPartial();
               } else {
                  this.targetReward_ = value;
               }

               this.onChanged();
            } else {
               this.targetRewardBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 128;
            return this;
         }

         public Builder clearTargetReward() {
            if (this.targetRewardBuilder_ == null) {
               this.targetReward_ = null;
               this.onChanged();
            } else {
               this.targetRewardBuilder_.clear();
            }

            this.bitField0_ &= -129;
            return this;
         }

         public S2C_TargetReward_8017.Builder getTargetRewardBuilder() {
            this.bitField0_ |= 128;
            this.onChanged();
            return (S2C_TargetReward_8017.Builder)this.getTargetRewardFieldBuilder().getBuilder();
         }

         public S2C_TargetReward_8017OrBuilder getTargetRewardOrBuilder() {
            if (this.targetRewardBuilder_ != null) {
               return (S2C_TargetReward_8017OrBuilder)this.targetRewardBuilder_.getMessageOrBuilder();
            } else {
               return this.targetReward_ == null ? WarMsg.S2C_TargetReward_8017.getDefaultInstance() : this.targetReward_;
            }
         }

         private SingleFieldBuilderV3<S2C_TargetReward_8017, S2C_TargetReward_8017.Builder, S2C_TargetReward_8017OrBuilder> getTargetRewardFieldBuilder() {
            if (this.targetRewardBuilder_ == null) {
               this.targetRewardBuilder_ = new SingleFieldBuilderV3(this.getTargetReward(), this.getParentForChildren(), this.isClean());
               this.targetReward_ = null;
            }

            return this.targetRewardBuilder_;
         }

         public boolean hasHeroPos() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getHeroPos() {
            return this.heroPos_;
         }

         public Builder setHeroPos(int value) {
            this.bitField0_ |= 256;
            this.heroPos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroPos() {
            this.bitField0_ &= -257;
            this.heroPos_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureEnemyHpIsMutable() {
            if ((this.bitField0_ & 512) == 0) {
               this.enemyHp_ = new ArrayList(this.enemyHp_);
               this.bitField0_ |= 512;
            }

         }

         public List<CommonMsg.MapDataIF> getEnemyHpList() {
            return this.enemyHpBuilder_ == null ? Collections.unmodifiableList(this.enemyHp_) : this.enemyHpBuilder_.getMessageList();
         }

         public int getEnemyHpCount() {
            return this.enemyHpBuilder_ == null ? this.enemyHp_.size() : this.enemyHpBuilder_.getCount();
         }

         public CommonMsg.MapDataIF getEnemyHp(int index) {
            return this.enemyHpBuilder_ == null ? (CommonMsg.MapDataIF)this.enemyHp_.get(index) : (CommonMsg.MapDataIF)this.enemyHpBuilder_.getMessage(index);
         }

         public Builder setEnemyHp(int index, CommonMsg.MapDataIF value) {
            if (this.enemyHpBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEnemyHpIsMutable();
               this.enemyHp_.set(index, value);
               this.onChanged();
            } else {
               this.enemyHpBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setEnemyHp(int index, CommonMsg.MapDataIF.Builder builderForValue) {
            if (this.enemyHpBuilder_ == null) {
               this.ensureEnemyHpIsMutable();
               this.enemyHp_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.enemyHpBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addEnemyHp(CommonMsg.MapDataIF value) {
            if (this.enemyHpBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEnemyHpIsMutable();
               this.enemyHp_.add(value);
               this.onChanged();
            } else {
               this.enemyHpBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addEnemyHp(int index, CommonMsg.MapDataIF value) {
            if (this.enemyHpBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEnemyHpIsMutable();
               this.enemyHp_.add(index, value);
               this.onChanged();
            } else {
               this.enemyHpBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addEnemyHp(CommonMsg.MapDataIF.Builder builderForValue) {
            if (this.enemyHpBuilder_ == null) {
               this.ensureEnemyHpIsMutable();
               this.enemyHp_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.enemyHpBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addEnemyHp(int index, CommonMsg.MapDataIF.Builder builderForValue) {
            if (this.enemyHpBuilder_ == null) {
               this.ensureEnemyHpIsMutable();
               this.enemyHp_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.enemyHpBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllEnemyHp(Iterable<? extends CommonMsg.MapDataIF> values) {
            if (this.enemyHpBuilder_ == null) {
               this.ensureEnemyHpIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.enemyHp_);
               this.onChanged();
            } else {
               this.enemyHpBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearEnemyHp() {
            if (this.enemyHpBuilder_ == null) {
               this.enemyHp_ = Collections.emptyList();
               this.bitField0_ &= -513;
               this.onChanged();
            } else {
               this.enemyHpBuilder_.clear();
            }

            return this;
         }

         public Builder removeEnemyHp(int index) {
            if (this.enemyHpBuilder_ == null) {
               this.ensureEnemyHpIsMutable();
               this.enemyHp_.remove(index);
               this.onChanged();
            } else {
               this.enemyHpBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataIF.Builder getEnemyHpBuilder(int index) {
            return (CommonMsg.MapDataIF.Builder)this.getEnemyHpFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIFOrBuilder getEnemyHpOrBuilder(int index) {
            return this.enemyHpBuilder_ == null ? (CommonMsg.MapDataIFOrBuilder)this.enemyHp_.get(index) : (CommonMsg.MapDataIFOrBuilder)this.enemyHpBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIFOrBuilder> getEnemyHpOrBuilderList() {
            return this.enemyHpBuilder_ != null ? this.enemyHpBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.enemyHp_);
         }

         public CommonMsg.MapDataIF.Builder addEnemyHpBuilder() {
            return (CommonMsg.MapDataIF.Builder)this.getEnemyHpFieldBuilder().addBuilder(CommonMsg.MapDataIF.getDefaultInstance());
         }

         public CommonMsg.MapDataIF.Builder addEnemyHpBuilder(int index) {
            return (CommonMsg.MapDataIF.Builder)this.getEnemyHpFieldBuilder().addBuilder(index, CommonMsg.MapDataIF.getDefaultInstance());
         }

         public List<CommonMsg.MapDataIF.Builder> getEnemyHpBuilderList() {
            return this.getEnemyHpFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataIF, CommonMsg.MapDataIF.Builder, CommonMsg.MapDataIFOrBuilder> getEnemyHpFieldBuilder() {
            if (this.enemyHpBuilder_ == null) {
               this.enemyHpBuilder_ = new RepeatedFieldBuilderV3(this.enemyHp_, (this.bitField0_ & 512) != 0, this.getParentForChildren(), this.isClean());
               this.enemyHp_ = null;
            }

            return this.enemyHpBuilder_;
         }

         private void ensureCrossFortIsMutable() {
            if ((this.bitField0_ & 1024) == 0) {
               this.crossFort_ = WarMsg.S2C_GetWarHLInfo_8002.mutableCopy(this.crossFort_);
               this.bitField0_ |= 1024;
            }

         }

         public List<Integer> getCrossFortList() {
            return (List<Integer>)((this.bitField0_ & 1024) != 0 ? Collections.unmodifiableList(this.crossFort_) : this.crossFort_);
         }

         public int getCrossFortCount() {
            return this.crossFort_.size();
         }

         public int getCrossFort(int index) {
            return this.crossFort_.getInt(index);
         }

         public Builder setCrossFort(int index, int value) {
            this.ensureCrossFortIsMutable();
            this.crossFort_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addCrossFort(int value) {
            this.ensureCrossFortIsMutable();
            this.crossFort_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllCrossFort(Iterable<? extends Integer> values) {
            this.ensureCrossFortIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.crossFort_);
            this.onChanged();
            return this;
         }

         public Builder clearCrossFort() {
            this.crossFort_ = WarMsg.S2C_GetWarHLInfo_8002.emptyIntList();
            this.bitField0_ &= -1025;
            this.onChanged();
            return this;
         }

         public boolean hasFortSum() {
            return (this.bitField0_ & 2048) != 0;
         }

         public int getFortSum() {
            return this.fortSum_;
         }

         public Builder setFortSum(int value) {
            this.bitField0_ |= 2048;
            this.fortSum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFortSum() {
            this.bitField0_ &= -2049;
            this.fortSum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasResetTime() {
            return (this.bitField0_ & 4096) != 0;
         }

         public int getResetTime() {
            return this.resetTime_;
         }

         public Builder setResetTime(int value) {
            this.bitField0_ |= 4096;
            this.resetTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResetTime() {
            this.bitField0_ &= -4097;
            this.resetTime_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureHeroIsMutable() {
            if ((this.bitField0_ & 8192) == 0) {
               this.hero_ = new ArrayList(this.hero_);
               this.bitField0_ |= 8192;
            }

         }

         public List<CommonMsg.HeroInfo> getHeroList() {
            return this.heroBuilder_ == null ? Collections.unmodifiableList(this.hero_) : this.heroBuilder_.getMessageList();
         }

         public int getHeroCount() {
            return this.heroBuilder_ == null ? this.hero_.size() : this.heroBuilder_.getCount();
         }

         public CommonMsg.HeroInfo getHero(int index) {
            return this.heroBuilder_ == null ? (CommonMsg.HeroInfo)this.hero_.get(index) : (CommonMsg.HeroInfo)this.heroBuilder_.getMessage(index);
         }

         public Builder setHero(int index, CommonMsg.HeroInfo value) {
            if (this.heroBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroIsMutable();
               this.hero_.set(index, value);
               this.onChanged();
            } else {
               this.heroBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setHero(int index, CommonMsg.HeroInfo.Builder builderForValue) {
            if (this.heroBuilder_ == null) {
               this.ensureHeroIsMutable();
               this.hero_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addHero(CommonMsg.HeroInfo value) {
            if (this.heroBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroIsMutable();
               this.hero_.add(value);
               this.onChanged();
            } else {
               this.heroBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addHero(int index, CommonMsg.HeroInfo value) {
            if (this.heroBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroIsMutable();
               this.hero_.add(index, value);
               this.onChanged();
            } else {
               this.heroBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addHero(CommonMsg.HeroInfo.Builder builderForValue) {
            if (this.heroBuilder_ == null) {
               this.ensureHeroIsMutable();
               this.hero_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.heroBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addHero(int index, CommonMsg.HeroInfo.Builder builderForValue) {
            if (this.heroBuilder_ == null) {
               this.ensureHeroIsMutable();
               this.hero_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllHero(Iterable<? extends CommonMsg.HeroInfo> values) {
            if (this.heroBuilder_ == null) {
               this.ensureHeroIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.hero_);
               this.onChanged();
            } else {
               this.heroBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearHero() {
            if (this.heroBuilder_ == null) {
               this.hero_ = Collections.emptyList();
               this.bitField0_ &= -8193;
               this.onChanged();
            } else {
               this.heroBuilder_.clear();
            }

            return this;
         }

         public Builder removeHero(int index) {
            if (this.heroBuilder_ == null) {
               this.ensureHeroIsMutable();
               this.hero_.remove(index);
               this.onChanged();
            } else {
               this.heroBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.HeroInfo.Builder getHeroBuilder(int index) {
            return (CommonMsg.HeroInfo.Builder)this.getHeroFieldBuilder().getBuilder(index);
         }

         public CommonMsg.HeroInfoOrBuilder getHeroOrBuilder(int index) {
            return this.heroBuilder_ == null ? (CommonMsg.HeroInfoOrBuilder)this.hero_.get(index) : (CommonMsg.HeroInfoOrBuilder)this.heroBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.HeroInfoOrBuilder> getHeroOrBuilderList() {
            return this.heroBuilder_ != null ? this.heroBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.hero_);
         }

         public CommonMsg.HeroInfo.Builder addHeroBuilder() {
            return (CommonMsg.HeroInfo.Builder)this.getHeroFieldBuilder().addBuilder(CommonMsg.HeroInfo.getDefaultInstance());
         }

         public CommonMsg.HeroInfo.Builder addHeroBuilder(int index) {
            return (CommonMsg.HeroInfo.Builder)this.getHeroFieldBuilder().addBuilder(index, CommonMsg.HeroInfo.getDefaultInstance());
         }

         public List<CommonMsg.HeroInfo.Builder> getHeroBuilderList() {
            return this.getHeroFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.HeroInfo, CommonMsg.HeroInfo.Builder, CommonMsg.HeroInfoOrBuilder> getHeroFieldBuilder() {
            if (this.heroBuilder_ == null) {
               this.heroBuilder_ = new RepeatedFieldBuilderV3(this.hero_, (this.bitField0_ & 8192) != 0, this.getParentForChildren(), this.isClean());
               this.hero_ = null;
            }

            return this.heroBuilder_;
         }

         public boolean hasMaxFloor() {
            return (this.bitField0_ & 16384) != 0;
         }

         public int getMaxFloor() {
            return this.maxFloor_;
         }

         public Builder setMaxFloor(int value) {
            this.bitField0_ |= 16384;
            this.maxFloor_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMaxFloor() {
            this.bitField0_ &= -16385;
            this.maxFloor_ = 0;
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

   public static final class C2S_EnterHLBattle_8003 extends GeneratedMessageV3 implements C2S_EnterHLBattle_8003OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROPOS_FIELD_NUMBER = 1;
      private int heroPos_;
      public static final int FORT_FIELD_NUMBER = 2;
      private int fort_;
      private byte memoizedIsInitialized;
      private static final C2S_EnterHLBattle_8003 DEFAULT_INSTANCE = new C2S_EnterHLBattle_8003();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_EnterHLBattle_8003> PARSER = new AbstractParser<C2S_EnterHLBattle_8003>() {
         public C2S_EnterHLBattle_8003 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_EnterHLBattle_8003(input, extensionRegistry);
         }
      };

      private C2S_EnterHLBattle_8003(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_EnterHLBattle_8003() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_EnterHLBattle_8003();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_EnterHLBattle_8003(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroPos_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.fort_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WarMsg.internal_static_War_C2S_EnterHLBattle_8003_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_C2S_EnterHLBattle_8003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnterHLBattle_8003.class, Builder.class);
      }

      public boolean hasHeroPos() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroPos() {
         return this.heroPos_;
      }

      public boolean hasFort() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getFort() {
         return this.fort_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroPos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFort()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroPos_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.fort_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroPos_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.fort_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_EnterHLBattle_8003)) {
            return super.equals(obj);
         } else {
            C2S_EnterHLBattle_8003 other = (C2S_EnterHLBattle_8003)obj;
            if (this.hasHeroPos() != other.hasHeroPos()) {
               return false;
            } else if (this.hasHeroPos() && this.getHeroPos() != other.getHeroPos()) {
               return false;
            } else if (this.hasFort() != other.hasFort()) {
               return false;
            } else if (this.hasFort() && this.getFort() != other.getFort()) {
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
            if (this.hasHeroPos()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroPos();
            }

            if (this.hasFort()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getFort();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_EnterHLBattle_8003 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_EnterHLBattle_8003)PARSER.parseFrom(data);
      }

      public static C2S_EnterHLBattle_8003 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnterHLBattle_8003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnterHLBattle_8003 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_EnterHLBattle_8003)PARSER.parseFrom(data);
      }

      public static C2S_EnterHLBattle_8003 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnterHLBattle_8003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnterHLBattle_8003 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_EnterHLBattle_8003)PARSER.parseFrom(data);
      }

      public static C2S_EnterHLBattle_8003 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnterHLBattle_8003)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnterHLBattle_8003 parseFrom(InputStream input) throws IOException {
         return (C2S_EnterHLBattle_8003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnterHLBattle_8003 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnterHLBattle_8003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnterHLBattle_8003 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_EnterHLBattle_8003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_EnterHLBattle_8003 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnterHLBattle_8003)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnterHLBattle_8003 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_EnterHLBattle_8003)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnterHLBattle_8003 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnterHLBattle_8003)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_EnterHLBattle_8003 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_EnterHLBattle_8003 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_EnterHLBattle_8003> parser() {
         return PARSER;
      }

      public Parser<C2S_EnterHLBattle_8003> getParserForType() {
         return PARSER;
      }

      public C2S_EnterHLBattle_8003 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_EnterHLBattle_8003OrBuilder {
         private int bitField0_;
         private int heroPos_;
         private int fort_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_C2S_EnterHLBattle_8003_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_C2S_EnterHLBattle_8003_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnterHLBattle_8003.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.C2S_EnterHLBattle_8003.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroPos_ = 0;
            this.bitField0_ &= -2;
            this.fort_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_C2S_EnterHLBattle_8003_descriptor;
         }

         public C2S_EnterHLBattle_8003 getDefaultInstanceForType() {
            return WarMsg.C2S_EnterHLBattle_8003.getDefaultInstance();
         }

         public C2S_EnterHLBattle_8003 build() {
            C2S_EnterHLBattle_8003 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_EnterHLBattle_8003 buildPartial() {
            C2S_EnterHLBattle_8003 result = new C2S_EnterHLBattle_8003(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroPos_ = this.heroPos_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.fort_ = this.fort_;
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
            if (other instanceof C2S_EnterHLBattle_8003) {
               return this.mergeFrom((C2S_EnterHLBattle_8003)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_EnterHLBattle_8003 other) {
            if (other == WarMsg.C2S_EnterHLBattle_8003.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroPos()) {
                  this.setHeroPos(other.getHeroPos());
               }

               if (other.hasFort()) {
                  this.setFort(other.getFort());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroPos()) {
               return false;
            } else {
               return this.hasFort();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_EnterHLBattle_8003 parsedMessage = null;

            try {
               parsedMessage = (C2S_EnterHLBattle_8003)WarMsg.C2S_EnterHLBattle_8003.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_EnterHLBattle_8003)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroPos() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroPos() {
            return this.heroPos_;
         }

         public Builder setHeroPos(int value) {
            this.bitField0_ |= 1;
            this.heroPos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroPos() {
            this.bitField0_ &= -2;
            this.heroPos_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFort() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getFort() {
            return this.fort_;
         }

         public Builder setFort(int value) {
            this.bitField0_ |= 2;
            this.fort_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFort() {
            this.bitField0_ &= -3;
            this.fort_ = 0;
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

   public static final class S2C_EnterHLBattle_8004 extends GeneratedMessageV3 implements S2C_EnterHLBattle_8004OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BATTLEFLOOR_FIELD_NUMBER = 1;
      private int battleFloor_;
      public static final int PASSFORT_FIELD_NUMBER = 2;
      private Internal.IntList passFort_;
      public static final int HEROHP_FIELD_NUMBER = 3;
      private CommonMsg.MapDataIF heroHp_;
      public static final int ENEMYHP_FIELD_NUMBER = 4;
      private CommonMsg.MapDataIF enemyHp_;
      public static final int EVENTS_FIELD_NUMBER = 5;
      private List<S2C_EventInfo_8006> events_;
      public static final int HEROPOS_FIELD_NUMBER = 6;
      private int heroPos_;
      public static final int ITEM_FIELD_NUMBER = 7;
      private S2C_SpecialItem_8007 item_;
      public static final int FORTSUM_FIELD_NUMBER = 8;
      private int fortSum_;
      private byte memoizedIsInitialized;
      private static final S2C_EnterHLBattle_8004 DEFAULT_INSTANCE = new S2C_EnterHLBattle_8004();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_EnterHLBattle_8004> PARSER = new AbstractParser<S2C_EnterHLBattle_8004>() {
         public S2C_EnterHLBattle_8004 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_EnterHLBattle_8004(input, extensionRegistry);
         }
      };

      private S2C_EnterHLBattle_8004(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_EnterHLBattle_8004() {
         this.memoizedIsInitialized = -1;
         this.passFort_ = emptyIntList();
         this.events_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_EnterHLBattle_8004();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_EnterHLBattle_8004(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.battleFloor_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.passFort_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.passFort_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.passFort_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 26:
                        CommonMsg.MapDataIF.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.heroHp_.toBuilder();
                        }

                        this.heroHp_ = (CommonMsg.MapDataIF)input.readMessage(CommonMsg.MapDataIF.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.heroHp_);
                           this.heroHp_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        continue;
                     case 34:
                        CommonMsg.MapDataIF.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.enemyHp_.toBuilder();
                        }

                        this.enemyHp_ = (CommonMsg.MapDataIF)input.readMessage(CommonMsg.MapDataIF.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.enemyHp_);
                           this.enemyHp_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 4;
                        continue;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.events_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.events_.add(input.readMessage(WarMsg.S2C_EventInfo_8006.PARSER, extensionRegistry));
                        continue;
                     case 48:
                        this.bitField0_ |= 8;
                        this.heroPos_ = input.readInt32();
                        continue;
                     case 58:
                        S2C_SpecialItem_8007.Builder subBuilder = null;
                        if ((this.bitField0_ & 16) != 0) {
                           subBuilder = this.item_.toBuilder();
                        }

                        this.item_ = (S2C_SpecialItem_8007)input.readMessage(WarMsg.S2C_SpecialItem_8007.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.item_);
                           this.item_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 16;
                        continue;
                     case 64:
                        this.bitField0_ |= 32;
                        this.fortSum_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.passFort_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.passFort_.makeImmutable();
               }

               if ((mutable_bitField0_ & 16) != 0) {
                  this.events_ = Collections.unmodifiableList(this.events_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WarMsg.internal_static_War_S2C_EnterHLBattle_8004_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_S2C_EnterHLBattle_8004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EnterHLBattle_8004.class, Builder.class);
      }

      public boolean hasBattleFloor() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBattleFloor() {
         return this.battleFloor_;
      }

      public List<Integer> getPassFortList() {
         return this.passFort_;
      }

      public int getPassFortCount() {
         return this.passFort_.size();
      }

      public int getPassFort(int index) {
         return this.passFort_.getInt(index);
      }

      public boolean hasHeroHp() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.MapDataIF getHeroHp() {
         return this.heroHp_ == null ? CommonMsg.MapDataIF.getDefaultInstance() : this.heroHp_;
      }

      public CommonMsg.MapDataIFOrBuilder getHeroHpOrBuilder() {
         return this.heroHp_ == null ? CommonMsg.MapDataIF.getDefaultInstance() : this.heroHp_;
      }

      public boolean hasEnemyHp() {
         return (this.bitField0_ & 4) != 0;
      }

      public CommonMsg.MapDataIF getEnemyHp() {
         return this.enemyHp_ == null ? CommonMsg.MapDataIF.getDefaultInstance() : this.enemyHp_;
      }

      public CommonMsg.MapDataIFOrBuilder getEnemyHpOrBuilder() {
         return this.enemyHp_ == null ? CommonMsg.MapDataIF.getDefaultInstance() : this.enemyHp_;
      }

      public List<S2C_EventInfo_8006> getEventsList() {
         return this.events_;
      }

      public List<? extends S2C_EventInfo_8006OrBuilder> getEventsOrBuilderList() {
         return this.events_;
      }

      public int getEventsCount() {
         return this.events_.size();
      }

      public S2C_EventInfo_8006 getEvents(int index) {
         return (S2C_EventInfo_8006)this.events_.get(index);
      }

      public S2C_EventInfo_8006OrBuilder getEventsOrBuilder(int index) {
         return (S2C_EventInfo_8006OrBuilder)this.events_.get(index);
      }

      public boolean hasHeroPos() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getHeroPos() {
         return this.heroPos_;
      }

      public boolean hasItem() {
         return (this.bitField0_ & 16) != 0;
      }

      public S2C_SpecialItem_8007 getItem() {
         return this.item_ == null ? WarMsg.S2C_SpecialItem_8007.getDefaultInstance() : this.item_;
      }

      public S2C_SpecialItem_8007OrBuilder getItemOrBuilder() {
         return this.item_ == null ? WarMsg.S2C_SpecialItem_8007.getDefaultInstance() : this.item_;
      }

      public boolean hasFortSum() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getFortSum() {
         return this.fortSum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBattleFloor()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroHp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEnemyHp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroPos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasItem()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFortSum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getHeroHp().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getEnemyHp().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getEventsCount(); ++i) {
               if (!this.getEvents(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            if (!this.getItem().isInitialized()) {
               this.memoizedIsInitialized = 0;
               return false;
            } else {
               this.memoizedIsInitialized = 1;
               return true;
            }
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.battleFloor_);
         }

         for(int i = 0; i < this.passFort_.size(); ++i) {
            output.writeInt32(2, this.passFort_.getInt(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(3, this.getHeroHp());
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(4, this.getEnemyHp());
         }

         for(int i = 0; i < this.events_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.events_.get(i));
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(6, this.heroPos_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeMessage(7, this.getItem());
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(8, this.fortSum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.battleFloor_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.passFort_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.passFort_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getPassFortList().size();
            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(3, this.getHeroHp());
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(4, this.getEnemyHp());
            }

            for(int i = 0; i < this.events_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.events_.get(i));
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.heroPos_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeMessageSize(7, this.getItem());
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.fortSum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_EnterHLBattle_8004)) {
            return super.equals(obj);
         } else {
            S2C_EnterHLBattle_8004 other = (S2C_EnterHLBattle_8004)obj;
            if (this.hasBattleFloor() != other.hasBattleFloor()) {
               return false;
            } else if (this.hasBattleFloor() && this.getBattleFloor() != other.getBattleFloor()) {
               return false;
            } else if (!this.getPassFortList().equals(other.getPassFortList())) {
               return false;
            } else if (this.hasHeroHp() != other.hasHeroHp()) {
               return false;
            } else if (this.hasHeroHp() && !this.getHeroHp().equals(other.getHeroHp())) {
               return false;
            } else if (this.hasEnemyHp() != other.hasEnemyHp()) {
               return false;
            } else if (this.hasEnemyHp() && !this.getEnemyHp().equals(other.getEnemyHp())) {
               return false;
            } else if (!this.getEventsList().equals(other.getEventsList())) {
               return false;
            } else if (this.hasHeroPos() != other.hasHeroPos()) {
               return false;
            } else if (this.hasHeroPos() && this.getHeroPos() != other.getHeroPos()) {
               return false;
            } else if (this.hasItem() != other.hasItem()) {
               return false;
            } else if (this.hasItem() && !this.getItem().equals(other.getItem())) {
               return false;
            } else if (this.hasFortSum() != other.hasFortSum()) {
               return false;
            } else if (this.hasFortSum() && this.getFortSum() != other.getFortSum()) {
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
            if (this.hasBattleFloor()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBattleFloor();
            }

            if (this.getPassFortCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPassFortList().hashCode();
            }

            if (this.hasHeroHp()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHeroHp().hashCode();
            }

            if (this.hasEnemyHp()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getEnemyHp().hashCode();
            }

            if (this.getEventsCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getEventsList().hashCode();
            }

            if (this.hasHeroPos()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getHeroPos();
            }

            if (this.hasItem()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getItem().hashCode();
            }

            if (this.hasFortSum()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getFortSum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_EnterHLBattle_8004 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_EnterHLBattle_8004)PARSER.parseFrom(data);
      }

      public static S2C_EnterHLBattle_8004 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnterHLBattle_8004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnterHLBattle_8004 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_EnterHLBattle_8004)PARSER.parseFrom(data);
      }

      public static S2C_EnterHLBattle_8004 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnterHLBattle_8004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnterHLBattle_8004 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_EnterHLBattle_8004)PARSER.parseFrom(data);
      }

      public static S2C_EnterHLBattle_8004 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnterHLBattle_8004)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnterHLBattle_8004 parseFrom(InputStream input) throws IOException {
         return (S2C_EnterHLBattle_8004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EnterHLBattle_8004 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnterHLBattle_8004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EnterHLBattle_8004 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_EnterHLBattle_8004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_EnterHLBattle_8004 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnterHLBattle_8004)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EnterHLBattle_8004 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_EnterHLBattle_8004)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EnterHLBattle_8004 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnterHLBattle_8004)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_EnterHLBattle_8004 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_EnterHLBattle_8004 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_EnterHLBattle_8004> parser() {
         return PARSER;
      }

      public Parser<S2C_EnterHLBattle_8004> getParserForType() {
         return PARSER;
      }

      public S2C_EnterHLBattle_8004 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_EnterHLBattle_8004OrBuilder {
         private int bitField0_;
         private int battleFloor_;
         private Internal.IntList passFort_;
         private CommonMsg.MapDataIF heroHp_;
         private SingleFieldBuilderV3<CommonMsg.MapDataIF, CommonMsg.MapDataIF.Builder, CommonMsg.MapDataIFOrBuilder> heroHpBuilder_;
         private CommonMsg.MapDataIF enemyHp_;
         private SingleFieldBuilderV3<CommonMsg.MapDataIF, CommonMsg.MapDataIF.Builder, CommonMsg.MapDataIFOrBuilder> enemyHpBuilder_;
         private List<S2C_EventInfo_8006> events_;
         private RepeatedFieldBuilderV3<S2C_EventInfo_8006, S2C_EventInfo_8006.Builder, S2C_EventInfo_8006OrBuilder> eventsBuilder_;
         private int heroPos_;
         private S2C_SpecialItem_8007 item_;
         private SingleFieldBuilderV3<S2C_SpecialItem_8007, S2C_SpecialItem_8007.Builder, S2C_SpecialItem_8007OrBuilder> itemBuilder_;
         private int fortSum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_S2C_EnterHLBattle_8004_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_S2C_EnterHLBattle_8004_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EnterHLBattle_8004.class, Builder.class);
         }

         private Builder() {
            this.passFort_ = WarMsg.S2C_EnterHLBattle_8004.emptyIntList();
            this.events_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.passFort_ = WarMsg.S2C_EnterHLBattle_8004.emptyIntList();
            this.events_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.S2C_EnterHLBattle_8004.alwaysUseFieldBuilders) {
               this.getHeroHpFieldBuilder();
               this.getEnemyHpFieldBuilder();
               this.getEventsFieldBuilder();
               this.getItemFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.battleFloor_ = 0;
            this.bitField0_ &= -2;
            this.passFort_ = WarMsg.S2C_EnterHLBattle_8004.emptyIntList();
            this.bitField0_ &= -3;
            if (this.heroHpBuilder_ == null) {
               this.heroHp_ = null;
            } else {
               this.heroHpBuilder_.clear();
            }

            this.bitField0_ &= -5;
            if (this.enemyHpBuilder_ == null) {
               this.enemyHp_ = null;
            } else {
               this.enemyHpBuilder_.clear();
            }

            this.bitField0_ &= -9;
            if (this.eventsBuilder_ == null) {
               this.events_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.eventsBuilder_.clear();
            }

            this.heroPos_ = 0;
            this.bitField0_ &= -33;
            if (this.itemBuilder_ == null) {
               this.item_ = null;
            } else {
               this.itemBuilder_.clear();
            }

            this.bitField0_ &= -65;
            this.fortSum_ = 0;
            this.bitField0_ &= -129;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_S2C_EnterHLBattle_8004_descriptor;
         }

         public S2C_EnterHLBattle_8004 getDefaultInstanceForType() {
            return WarMsg.S2C_EnterHLBattle_8004.getDefaultInstance();
         }

         public S2C_EnterHLBattle_8004 build() {
            S2C_EnterHLBattle_8004 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_EnterHLBattle_8004 buildPartial() {
            S2C_EnterHLBattle_8004 result = new S2C_EnterHLBattle_8004(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.battleFloor_ = this.battleFloor_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.passFort_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.passFort_ = this.passFort_;
            if ((from_bitField0_ & 4) != 0) {
               if (this.heroHpBuilder_ == null) {
                  result.heroHp_ = this.heroHp_;
               } else {
                  result.heroHp_ = (CommonMsg.MapDataIF)this.heroHpBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               if (this.enemyHpBuilder_ == null) {
                  result.enemyHp_ = this.enemyHp_;
               } else {
                  result.enemyHp_ = (CommonMsg.MapDataIF)this.enemyHpBuilder_.build();
               }

               to_bitField0_ |= 4;
            }

            if (this.eventsBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.events_ = Collections.unmodifiableList(this.events_);
                  this.bitField0_ &= -17;
               }

               result.events_ = this.events_;
            } else {
               result.events_ = this.eventsBuilder_.build();
            }

            if ((from_bitField0_ & 32) != 0) {
               result.heroPos_ = this.heroPos_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 64) != 0) {
               if (this.itemBuilder_ == null) {
                  result.item_ = this.item_;
               } else {
                  result.item_ = (S2C_SpecialItem_8007)this.itemBuilder_.build();
               }

               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.fortSum_ = this.fortSum_;
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
            if (other instanceof S2C_EnterHLBattle_8004) {
               return this.mergeFrom((S2C_EnterHLBattle_8004)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_EnterHLBattle_8004 other) {
            if (other == WarMsg.S2C_EnterHLBattle_8004.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBattleFloor()) {
                  this.setBattleFloor(other.getBattleFloor());
               }

               if (!other.passFort_.isEmpty()) {
                  if (this.passFort_.isEmpty()) {
                     this.passFort_ = other.passFort_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensurePassFortIsMutable();
                     this.passFort_.addAll(other.passFort_);
                  }

                  this.onChanged();
               }

               if (other.hasHeroHp()) {
                  this.mergeHeroHp(other.getHeroHp());
               }

               if (other.hasEnemyHp()) {
                  this.mergeEnemyHp(other.getEnemyHp());
               }

               if (this.eventsBuilder_ == null) {
                  if (!other.events_.isEmpty()) {
                     if (this.events_.isEmpty()) {
                        this.events_ = other.events_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensureEventsIsMutable();
                        this.events_.addAll(other.events_);
                     }

                     this.onChanged();
                  }
               } else if (!other.events_.isEmpty()) {
                  if (this.eventsBuilder_.isEmpty()) {
                     this.eventsBuilder_.dispose();
                     this.eventsBuilder_ = null;
                     this.events_ = other.events_;
                     this.bitField0_ &= -17;
                     this.eventsBuilder_ = WarMsg.S2C_EnterHLBattle_8004.alwaysUseFieldBuilders ? this.getEventsFieldBuilder() : null;
                  } else {
                     this.eventsBuilder_.addAllMessages(other.events_);
                  }
               }

               if (other.hasHeroPos()) {
                  this.setHeroPos(other.getHeroPos());
               }

               if (other.hasItem()) {
                  this.mergeItem(other.getItem());
               }

               if (other.hasFortSum()) {
                  this.setFortSum(other.getFortSum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasBattleFloor()) {
               return false;
            } else if (!this.hasHeroHp()) {
               return false;
            } else if (!this.hasEnemyHp()) {
               return false;
            } else if (!this.hasHeroPos()) {
               return false;
            } else if (!this.hasItem()) {
               return false;
            } else if (!this.hasFortSum()) {
               return false;
            } else if (!this.getHeroHp().isInitialized()) {
               return false;
            } else if (!this.getEnemyHp().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getEventsCount(); ++i) {
                  if (!this.getEvents(i).isInitialized()) {
                     return false;
                  }
               }

               if (!this.getItem().isInitialized()) {
                  return false;
               } else {
                  return true;
               }
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_EnterHLBattle_8004 parsedMessage = null;

            try {
               parsedMessage = (S2C_EnterHLBattle_8004)WarMsg.S2C_EnterHLBattle_8004.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_EnterHLBattle_8004)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBattleFloor() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBattleFloor() {
            return this.battleFloor_;
         }

         public Builder setBattleFloor(int value) {
            this.bitField0_ |= 1;
            this.battleFloor_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBattleFloor() {
            this.bitField0_ &= -2;
            this.battleFloor_ = 0;
            this.onChanged();
            return this;
         }

         private void ensurePassFortIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.passFort_ = WarMsg.S2C_EnterHLBattle_8004.mutableCopy(this.passFort_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getPassFortList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.passFort_) : this.passFort_);
         }

         public int getPassFortCount() {
            return this.passFort_.size();
         }

         public int getPassFort(int index) {
            return this.passFort_.getInt(index);
         }

         public Builder setPassFort(int index, int value) {
            this.ensurePassFortIsMutable();
            this.passFort_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addPassFort(int value) {
            this.ensurePassFortIsMutable();
            this.passFort_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllPassFort(Iterable<? extends Integer> values) {
            this.ensurePassFortIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.passFort_);
            this.onChanged();
            return this;
         }

         public Builder clearPassFort() {
            this.passFort_ = WarMsg.S2C_EnterHLBattle_8004.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public boolean hasHeroHp() {
            return (this.bitField0_ & 4) != 0;
         }

         public CommonMsg.MapDataIF getHeroHp() {
            if (this.heroHpBuilder_ == null) {
               return this.heroHp_ == null ? CommonMsg.MapDataIF.getDefaultInstance() : this.heroHp_;
            } else {
               return (CommonMsg.MapDataIF)this.heroHpBuilder_.getMessage();
            }
         }

         public Builder setHeroHp(CommonMsg.MapDataIF value) {
            if (this.heroHpBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.heroHp_ = value;
               this.onChanged();
            } else {
               this.heroHpBuilder_.setMessage(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setHeroHp(CommonMsg.MapDataIF.Builder builderForValue) {
            if (this.heroHpBuilder_ == null) {
               this.heroHp_ = builderForValue.build();
               this.onChanged();
            } else {
               this.heroHpBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeHeroHp(CommonMsg.MapDataIF value) {
            if (this.heroHpBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.heroHp_ != null && this.heroHp_ != CommonMsg.MapDataIF.getDefaultInstance()) {
                  this.heroHp_ = CommonMsg.MapDataIF.newBuilder(this.heroHp_).mergeFrom(value).buildPartial();
               } else {
                  this.heroHp_ = value;
               }

               this.onChanged();
            } else {
               this.heroHpBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearHeroHp() {
            if (this.heroHpBuilder_ == null) {
               this.heroHp_ = null;
               this.onChanged();
            } else {
               this.heroHpBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public CommonMsg.MapDataIF.Builder getHeroHpBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (CommonMsg.MapDataIF.Builder)this.getHeroHpFieldBuilder().getBuilder();
         }

         public CommonMsg.MapDataIFOrBuilder getHeroHpOrBuilder() {
            if (this.heroHpBuilder_ != null) {
               return (CommonMsg.MapDataIFOrBuilder)this.heroHpBuilder_.getMessageOrBuilder();
            } else {
               return this.heroHp_ == null ? CommonMsg.MapDataIF.getDefaultInstance() : this.heroHp_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.MapDataIF, CommonMsg.MapDataIF.Builder, CommonMsg.MapDataIFOrBuilder> getHeroHpFieldBuilder() {
            if (this.heroHpBuilder_ == null) {
               this.heroHpBuilder_ = new SingleFieldBuilderV3(this.getHeroHp(), this.getParentForChildren(), this.isClean());
               this.heroHp_ = null;
            }

            return this.heroHpBuilder_;
         }

         public boolean hasEnemyHp() {
            return (this.bitField0_ & 8) != 0;
         }

         public CommonMsg.MapDataIF getEnemyHp() {
            if (this.enemyHpBuilder_ == null) {
               return this.enemyHp_ == null ? CommonMsg.MapDataIF.getDefaultInstance() : this.enemyHp_;
            } else {
               return (CommonMsg.MapDataIF)this.enemyHpBuilder_.getMessage();
            }
         }

         public Builder setEnemyHp(CommonMsg.MapDataIF value) {
            if (this.enemyHpBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.enemyHp_ = value;
               this.onChanged();
            } else {
               this.enemyHpBuilder_.setMessage(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder setEnemyHp(CommonMsg.MapDataIF.Builder builderForValue) {
            if (this.enemyHpBuilder_ == null) {
               this.enemyHp_ = builderForValue.build();
               this.onChanged();
            } else {
               this.enemyHpBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder mergeEnemyHp(CommonMsg.MapDataIF value) {
            if (this.enemyHpBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0 && this.enemyHp_ != null && this.enemyHp_ != CommonMsg.MapDataIF.getDefaultInstance()) {
                  this.enemyHp_ = CommonMsg.MapDataIF.newBuilder(this.enemyHp_).mergeFrom(value).buildPartial();
               } else {
                  this.enemyHp_ = value;
               }

               this.onChanged();
            } else {
               this.enemyHpBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder clearEnemyHp() {
            if (this.enemyHpBuilder_ == null) {
               this.enemyHp_ = null;
               this.onChanged();
            } else {
               this.enemyHpBuilder_.clear();
            }

            this.bitField0_ &= -9;
            return this;
         }

         public CommonMsg.MapDataIF.Builder getEnemyHpBuilder() {
            this.bitField0_ |= 8;
            this.onChanged();
            return (CommonMsg.MapDataIF.Builder)this.getEnemyHpFieldBuilder().getBuilder();
         }

         public CommonMsg.MapDataIFOrBuilder getEnemyHpOrBuilder() {
            if (this.enemyHpBuilder_ != null) {
               return (CommonMsg.MapDataIFOrBuilder)this.enemyHpBuilder_.getMessageOrBuilder();
            } else {
               return this.enemyHp_ == null ? CommonMsg.MapDataIF.getDefaultInstance() : this.enemyHp_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.MapDataIF, CommonMsg.MapDataIF.Builder, CommonMsg.MapDataIFOrBuilder> getEnemyHpFieldBuilder() {
            if (this.enemyHpBuilder_ == null) {
               this.enemyHpBuilder_ = new SingleFieldBuilderV3(this.getEnemyHp(), this.getParentForChildren(), this.isClean());
               this.enemyHp_ = null;
            }

            return this.enemyHpBuilder_;
         }

         private void ensureEventsIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.events_ = new ArrayList(this.events_);
               this.bitField0_ |= 16;
            }

         }

         public List<S2C_EventInfo_8006> getEventsList() {
            return this.eventsBuilder_ == null ? Collections.unmodifiableList(this.events_) : this.eventsBuilder_.getMessageList();
         }

         public int getEventsCount() {
            return this.eventsBuilder_ == null ? this.events_.size() : this.eventsBuilder_.getCount();
         }

         public S2C_EventInfo_8006 getEvents(int index) {
            return this.eventsBuilder_ == null ? (S2C_EventInfo_8006)this.events_.get(index) : (S2C_EventInfo_8006)this.eventsBuilder_.getMessage(index);
         }

         public Builder setEvents(int index, S2C_EventInfo_8006 value) {
            if (this.eventsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEventsIsMutable();
               this.events_.set(index, value);
               this.onChanged();
            } else {
               this.eventsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setEvents(int index, S2C_EventInfo_8006.Builder builderForValue) {
            if (this.eventsBuilder_ == null) {
               this.ensureEventsIsMutable();
               this.events_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.eventsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addEvents(S2C_EventInfo_8006 value) {
            if (this.eventsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEventsIsMutable();
               this.events_.add(value);
               this.onChanged();
            } else {
               this.eventsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addEvents(int index, S2C_EventInfo_8006 value) {
            if (this.eventsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureEventsIsMutable();
               this.events_.add(index, value);
               this.onChanged();
            } else {
               this.eventsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addEvents(S2C_EventInfo_8006.Builder builderForValue) {
            if (this.eventsBuilder_ == null) {
               this.ensureEventsIsMutable();
               this.events_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.eventsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addEvents(int index, S2C_EventInfo_8006.Builder builderForValue) {
            if (this.eventsBuilder_ == null) {
               this.ensureEventsIsMutable();
               this.events_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.eventsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllEvents(Iterable<? extends S2C_EventInfo_8006> values) {
            if (this.eventsBuilder_ == null) {
               this.ensureEventsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.events_);
               this.onChanged();
            } else {
               this.eventsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearEvents() {
            if (this.eventsBuilder_ == null) {
               this.events_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.eventsBuilder_.clear();
            }

            return this;
         }

         public Builder removeEvents(int index) {
            if (this.eventsBuilder_ == null) {
               this.ensureEventsIsMutable();
               this.events_.remove(index);
               this.onChanged();
            } else {
               this.eventsBuilder_.remove(index);
            }

            return this;
         }

         public S2C_EventInfo_8006.Builder getEventsBuilder(int index) {
            return (S2C_EventInfo_8006.Builder)this.getEventsFieldBuilder().getBuilder(index);
         }

         public S2C_EventInfo_8006OrBuilder getEventsOrBuilder(int index) {
            return this.eventsBuilder_ == null ? (S2C_EventInfo_8006OrBuilder)this.events_.get(index) : (S2C_EventInfo_8006OrBuilder)this.eventsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends S2C_EventInfo_8006OrBuilder> getEventsOrBuilderList() {
            return this.eventsBuilder_ != null ? this.eventsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.events_);
         }

         public S2C_EventInfo_8006.Builder addEventsBuilder() {
            return (S2C_EventInfo_8006.Builder)this.getEventsFieldBuilder().addBuilder(WarMsg.S2C_EventInfo_8006.getDefaultInstance());
         }

         public S2C_EventInfo_8006.Builder addEventsBuilder(int index) {
            return (S2C_EventInfo_8006.Builder)this.getEventsFieldBuilder().addBuilder(index, WarMsg.S2C_EventInfo_8006.getDefaultInstance());
         }

         public List<S2C_EventInfo_8006.Builder> getEventsBuilderList() {
            return this.getEventsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<S2C_EventInfo_8006, S2C_EventInfo_8006.Builder, S2C_EventInfo_8006OrBuilder> getEventsFieldBuilder() {
            if (this.eventsBuilder_ == null) {
               this.eventsBuilder_ = new RepeatedFieldBuilderV3(this.events_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.events_ = null;
            }

            return this.eventsBuilder_;
         }

         public boolean hasHeroPos() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getHeroPos() {
            return this.heroPos_;
         }

         public Builder setHeroPos(int value) {
            this.bitField0_ |= 32;
            this.heroPos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroPos() {
            this.bitField0_ &= -33;
            this.heroPos_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasItem() {
            return (this.bitField0_ & 64) != 0;
         }

         public S2C_SpecialItem_8007 getItem() {
            if (this.itemBuilder_ == null) {
               return this.item_ == null ? WarMsg.S2C_SpecialItem_8007.getDefaultInstance() : this.item_;
            } else {
               return (S2C_SpecialItem_8007)this.itemBuilder_.getMessage();
            }
         }

         public Builder setItem(S2C_SpecialItem_8007 value) {
            if (this.itemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.item_ = value;
               this.onChanged();
            } else {
               this.itemBuilder_.setMessage(value);
            }

            this.bitField0_ |= 64;
            return this;
         }

         public Builder setItem(S2C_SpecialItem_8007.Builder builderForValue) {
            if (this.itemBuilder_ == null) {
               this.item_ = builderForValue.build();
               this.onChanged();
            } else {
               this.itemBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 64;
            return this;
         }

         public Builder mergeItem(S2C_SpecialItem_8007 value) {
            if (this.itemBuilder_ == null) {
               if ((this.bitField0_ & 64) != 0 && this.item_ != null && this.item_ != WarMsg.S2C_SpecialItem_8007.getDefaultInstance()) {
                  this.item_ = WarMsg.S2C_SpecialItem_8007.newBuilder(this.item_).mergeFrom(value).buildPartial();
               } else {
                  this.item_ = value;
               }

               this.onChanged();
            } else {
               this.itemBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 64;
            return this;
         }

         public Builder clearItem() {
            if (this.itemBuilder_ == null) {
               this.item_ = null;
               this.onChanged();
            } else {
               this.itemBuilder_.clear();
            }

            this.bitField0_ &= -65;
            return this;
         }

         public S2C_SpecialItem_8007.Builder getItemBuilder() {
            this.bitField0_ |= 64;
            this.onChanged();
            return (S2C_SpecialItem_8007.Builder)this.getItemFieldBuilder().getBuilder();
         }

         public S2C_SpecialItem_8007OrBuilder getItemOrBuilder() {
            if (this.itemBuilder_ != null) {
               return (S2C_SpecialItem_8007OrBuilder)this.itemBuilder_.getMessageOrBuilder();
            } else {
               return this.item_ == null ? WarMsg.S2C_SpecialItem_8007.getDefaultInstance() : this.item_;
            }
         }

         private SingleFieldBuilderV3<S2C_SpecialItem_8007, S2C_SpecialItem_8007.Builder, S2C_SpecialItem_8007OrBuilder> getItemFieldBuilder() {
            if (this.itemBuilder_ == null) {
               this.itemBuilder_ = new SingleFieldBuilderV3(this.getItem(), this.getParentForChildren(), this.isClean());
               this.item_ = null;
            }

            return this.itemBuilder_;
         }

         public boolean hasFortSum() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getFortSum() {
            return this.fortSum_;
         }

         public Builder setFortSum(int value) {
            this.bitField0_ |= 128;
            this.fortSum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFortSum() {
            this.bitField0_ &= -129;
            this.fortSum_ = 0;
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

   public static final class C2S_Answer_8005 extends GeneratedMessageV3 implements C2S_Answer_8005OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int EVENTPOS_FIELD_NUMBER = 1;
      private int eventPos_;
      public static final int QUESTION_FIELD_NUMBER = 2;
      private int question_;
      public static final int ANSWER_FIELD_NUMBER = 3;
      private int answer_;
      private byte memoizedIsInitialized;
      private static final C2S_Answer_8005 DEFAULT_INSTANCE = new C2S_Answer_8005();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Answer_8005> PARSER = new AbstractParser<C2S_Answer_8005>() {
         public C2S_Answer_8005 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Answer_8005(input, extensionRegistry);
         }
      };

      private C2S_Answer_8005(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Answer_8005() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Answer_8005();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Answer_8005(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.eventPos_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.question_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.answer_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WarMsg.internal_static_War_C2S_Answer_8005_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_C2S_Answer_8005_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Answer_8005.class, Builder.class);
      }

      public boolean hasEventPos() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getEventPos() {
         return this.eventPos_;
      }

      public boolean hasQuestion() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getQuestion() {
         return this.question_;
      }

      public boolean hasAnswer() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getAnswer() {
         return this.answer_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasEventPos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasQuestion()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAnswer()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.eventPos_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.question_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.answer_);
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
               size += CodedOutputStream.computeInt32Size(1, this.eventPos_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.question_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.answer_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Answer_8005)) {
            return super.equals(obj);
         } else {
            C2S_Answer_8005 other = (C2S_Answer_8005)obj;
            if (this.hasEventPos() != other.hasEventPos()) {
               return false;
            } else if (this.hasEventPos() && this.getEventPos() != other.getEventPos()) {
               return false;
            } else if (this.hasQuestion() != other.hasQuestion()) {
               return false;
            } else if (this.hasQuestion() && this.getQuestion() != other.getQuestion()) {
               return false;
            } else if (this.hasAnswer() != other.hasAnswer()) {
               return false;
            } else if (this.hasAnswer() && this.getAnswer() != other.getAnswer()) {
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
            if (this.hasEventPos()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getEventPos();
            }

            if (this.hasQuestion()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getQuestion();
            }

            if (this.hasAnswer()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getAnswer();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Answer_8005 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Answer_8005)PARSER.parseFrom(data);
      }

      public static C2S_Answer_8005 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Answer_8005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Answer_8005 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Answer_8005)PARSER.parseFrom(data);
      }

      public static C2S_Answer_8005 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Answer_8005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Answer_8005 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Answer_8005)PARSER.parseFrom(data);
      }

      public static C2S_Answer_8005 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Answer_8005)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Answer_8005 parseFrom(InputStream input) throws IOException {
         return (C2S_Answer_8005)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Answer_8005 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Answer_8005)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Answer_8005 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Answer_8005)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Answer_8005 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Answer_8005)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Answer_8005 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Answer_8005)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Answer_8005 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Answer_8005)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Answer_8005 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Answer_8005 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Answer_8005> parser() {
         return PARSER;
      }

      public Parser<C2S_Answer_8005> getParserForType() {
         return PARSER;
      }

      public C2S_Answer_8005 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Answer_8005OrBuilder {
         private int bitField0_;
         private int eventPos_;
         private int question_;
         private int answer_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_C2S_Answer_8005_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_C2S_Answer_8005_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Answer_8005.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.C2S_Answer_8005.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.eventPos_ = 0;
            this.bitField0_ &= -2;
            this.question_ = 0;
            this.bitField0_ &= -3;
            this.answer_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_C2S_Answer_8005_descriptor;
         }

         public C2S_Answer_8005 getDefaultInstanceForType() {
            return WarMsg.C2S_Answer_8005.getDefaultInstance();
         }

         public C2S_Answer_8005 build() {
            C2S_Answer_8005 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Answer_8005 buildPartial() {
            C2S_Answer_8005 result = new C2S_Answer_8005(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.eventPos_ = this.eventPos_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.question_ = this.question_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.answer_ = this.answer_;
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
            if (other instanceof C2S_Answer_8005) {
               return this.mergeFrom((C2S_Answer_8005)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Answer_8005 other) {
            if (other == WarMsg.C2S_Answer_8005.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasEventPos()) {
                  this.setEventPos(other.getEventPos());
               }

               if (other.hasQuestion()) {
                  this.setQuestion(other.getQuestion());
               }

               if (other.hasAnswer()) {
                  this.setAnswer(other.getAnswer());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasEventPos()) {
               return false;
            } else if (!this.hasQuestion()) {
               return false;
            } else {
               return this.hasAnswer();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Answer_8005 parsedMessage = null;

            try {
               parsedMessage = (C2S_Answer_8005)WarMsg.C2S_Answer_8005.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Answer_8005)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasEventPos() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getEventPos() {
            return this.eventPos_;
         }

         public Builder setEventPos(int value) {
            this.bitField0_ |= 1;
            this.eventPos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEventPos() {
            this.bitField0_ &= -2;
            this.eventPos_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasQuestion() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getQuestion() {
            return this.question_;
         }

         public Builder setQuestion(int value) {
            this.bitField0_ |= 2;
            this.question_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearQuestion() {
            this.bitField0_ &= -3;
            this.question_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAnswer() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getAnswer() {
            return this.answer_;
         }

         public Builder setAnswer(int value) {
            this.bitField0_ |= 4;
            this.answer_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAnswer() {
            this.bitField0_ &= -5;
            this.answer_ = 0;
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

   public static final class HLBuff extends GeneratedMessageV3 implements HLBuffOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int BUFF_FIELD_NUMBER = 1;
      private List<CommonMsg.PropertyInfo> buff_;
      private byte memoizedIsInitialized;
      private static final HLBuff DEFAULT_INSTANCE = new HLBuff();
      /** @deprecated */
      @Deprecated
      public static final Parser<HLBuff> PARSER = new AbstractParser<HLBuff>() {
         public HLBuff parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new HLBuff(input, extensionRegistry);
         }
      };

      private HLBuff(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private HLBuff() {
         this.memoizedIsInitialized = -1;
         this.buff_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new HLBuff();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private HLBuff(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.buff_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.buff_.add(input.readMessage(CommonMsg.PropertyInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.buff_ = Collections.unmodifiableList(this.buff_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WarMsg.internal_static_War_HLBuff_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_HLBuff_fieldAccessorTable.ensureFieldAccessorsInitialized(HLBuff.class, Builder.class);
      }

      public List<CommonMsg.PropertyInfo> getBuffList() {
         return this.buff_;
      }

      public List<? extends CommonMsg.PropertyInfoOrBuilder> getBuffOrBuilderList() {
         return this.buff_;
      }

      public int getBuffCount() {
         return this.buff_.size();
      }

      public CommonMsg.PropertyInfo getBuff(int index) {
         return (CommonMsg.PropertyInfo)this.buff_.get(index);
      }

      public CommonMsg.PropertyInfoOrBuilder getBuffOrBuilder(int index) {
         return (CommonMsg.PropertyInfoOrBuilder)this.buff_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getBuffCount(); ++i) {
               if (!this.getBuff(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.buff_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.buff_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.buff_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.buff_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof HLBuff)) {
            return super.equals(obj);
         } else {
            HLBuff other = (HLBuff)obj;
            if (!this.getBuffList().equals(other.getBuffList())) {
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
            if (this.getBuffCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuffList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static HLBuff parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (HLBuff)PARSER.parseFrom(data);
      }

      public static HLBuff parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HLBuff)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HLBuff parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (HLBuff)PARSER.parseFrom(data);
      }

      public static HLBuff parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HLBuff)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HLBuff parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (HLBuff)PARSER.parseFrom(data);
      }

      public static HLBuff parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HLBuff)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HLBuff parseFrom(InputStream input) throws IOException {
         return (HLBuff)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HLBuff parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HLBuff)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static HLBuff parseDelimitedFrom(InputStream input) throws IOException {
         return (HLBuff)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static HLBuff parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HLBuff)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static HLBuff parseFrom(CodedInputStream input) throws IOException {
         return (HLBuff)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HLBuff parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HLBuff)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(HLBuff prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static HLBuff getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<HLBuff> parser() {
         return PARSER;
      }

      public Parser<HLBuff> getParserForType() {
         return PARSER;
      }

      public HLBuff getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HLBuffOrBuilder {
         private int bitField0_;
         private List<CommonMsg.PropertyInfo> buff_;
         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> buffBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_HLBuff_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_HLBuff_fieldAccessorTable.ensureFieldAccessorsInitialized(HLBuff.class, Builder.class);
         }

         private Builder() {
            this.buff_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.buff_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.HLBuff.alwaysUseFieldBuilders) {
               this.getBuffFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.buffBuilder_ == null) {
               this.buff_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.buffBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_HLBuff_descriptor;
         }

         public HLBuff getDefaultInstanceForType() {
            return WarMsg.HLBuff.getDefaultInstance();
         }

         public HLBuff build() {
            HLBuff result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public HLBuff buildPartial() {
            HLBuff result = new HLBuff(this);
            int from_bitField0_ = this.bitField0_;
            if (this.buffBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.buff_ = Collections.unmodifiableList(this.buff_);
                  this.bitField0_ &= -2;
               }

               result.buff_ = this.buff_;
            } else {
               result.buff_ = this.buffBuilder_.build();
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
            if (other instanceof HLBuff) {
               return this.mergeFrom((HLBuff)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(HLBuff other) {
            if (other == WarMsg.HLBuff.getDefaultInstance()) {
               return this;
            } else {
               if (this.buffBuilder_ == null) {
                  if (!other.buff_.isEmpty()) {
                     if (this.buff_.isEmpty()) {
                        this.buff_ = other.buff_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureBuffIsMutable();
                        this.buff_.addAll(other.buff_);
                     }

                     this.onChanged();
                  }
               } else if (!other.buff_.isEmpty()) {
                  if (this.buffBuilder_.isEmpty()) {
                     this.buffBuilder_.dispose();
                     this.buffBuilder_ = null;
                     this.buff_ = other.buff_;
                     this.bitField0_ &= -2;
                     this.buffBuilder_ = WarMsg.HLBuff.alwaysUseFieldBuilders ? this.getBuffFieldBuilder() : null;
                  } else {
                     this.buffBuilder_.addAllMessages(other.buff_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getBuffCount(); ++i) {
               if (!this.getBuff(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            HLBuff parsedMessage = null;

            try {
               parsedMessage = (HLBuff)WarMsg.HLBuff.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (HLBuff)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureBuffIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.buff_ = new ArrayList(this.buff_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.PropertyInfo> getBuffList() {
            return this.buffBuilder_ == null ? Collections.unmodifiableList(this.buff_) : this.buffBuilder_.getMessageList();
         }

         public int getBuffCount() {
            return this.buffBuilder_ == null ? this.buff_.size() : this.buffBuilder_.getCount();
         }

         public CommonMsg.PropertyInfo getBuff(int index) {
            return this.buffBuilder_ == null ? (CommonMsg.PropertyInfo)this.buff_.get(index) : (CommonMsg.PropertyInfo)this.buffBuilder_.getMessage(index);
         }

         public Builder setBuff(int index, CommonMsg.PropertyInfo value) {
            if (this.buffBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBuffIsMutable();
               this.buff_.set(index, value);
               this.onChanged();
            } else {
               this.buffBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setBuff(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.buffBuilder_ == null) {
               this.ensureBuffIsMutable();
               this.buff_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.buffBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addBuff(CommonMsg.PropertyInfo value) {
            if (this.buffBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBuffIsMutable();
               this.buff_.add(value);
               this.onChanged();
            } else {
               this.buffBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addBuff(int index, CommonMsg.PropertyInfo value) {
            if (this.buffBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureBuffIsMutable();
               this.buff_.add(index, value);
               this.onChanged();
            } else {
               this.buffBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addBuff(CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.buffBuilder_ == null) {
               this.ensureBuffIsMutable();
               this.buff_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.buffBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addBuff(int index, CommonMsg.PropertyInfo.Builder builderForValue) {
            if (this.buffBuilder_ == null) {
               this.ensureBuffIsMutable();
               this.buff_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.buffBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllBuff(Iterable<? extends CommonMsg.PropertyInfo> values) {
            if (this.buffBuilder_ == null) {
               this.ensureBuffIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.buff_);
               this.onChanged();
            } else {
               this.buffBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearBuff() {
            if (this.buffBuilder_ == null) {
               this.buff_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.buffBuilder_.clear();
            }

            return this;
         }

         public Builder removeBuff(int index) {
            if (this.buffBuilder_ == null) {
               this.ensureBuffIsMutable();
               this.buff_.remove(index);
               this.onChanged();
            } else {
               this.buffBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.PropertyInfo.Builder getBuffBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getBuffFieldBuilder().getBuilder(index);
         }

         public CommonMsg.PropertyInfoOrBuilder getBuffOrBuilder(int index) {
            return this.buffBuilder_ == null ? (CommonMsg.PropertyInfoOrBuilder)this.buff_.get(index) : (CommonMsg.PropertyInfoOrBuilder)this.buffBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.PropertyInfoOrBuilder> getBuffOrBuilderList() {
            return this.buffBuilder_ != null ? this.buffBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.buff_);
         }

         public CommonMsg.PropertyInfo.Builder addBuffBuilder() {
            return (CommonMsg.PropertyInfo.Builder)this.getBuffFieldBuilder().addBuilder(CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public CommonMsg.PropertyInfo.Builder addBuffBuilder(int index) {
            return (CommonMsg.PropertyInfo.Builder)this.getBuffFieldBuilder().addBuilder(index, CommonMsg.PropertyInfo.getDefaultInstance());
         }

         public List<CommonMsg.PropertyInfo.Builder> getBuffBuilderList() {
            return this.getBuffFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.PropertyInfo, CommonMsg.PropertyInfo.Builder, CommonMsg.PropertyInfoOrBuilder> getBuffFieldBuilder() {
            if (this.buffBuilder_ == null) {
               this.buffBuilder_ = new RepeatedFieldBuilderV3(this.buff_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.buff_ = null;
            }

            return this.buffBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_EventInfo_8006 extends GeneratedMessageV3 implements S2C_EventInfo_8006OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int EVENTPOS_FIELD_NUMBER = 1;
      private int eventPos_;
      public static final int EVENTID_FIELD_NUMBER = 2;
      private int eventId_;
      public static final int QUESTION_FIELD_NUMBER = 3;
      private List<CommonMsg.MapDataII> question_;
      public static final int GOODS_FIELD_NUMBER = 4;
      private List<HLGoods> goods_;
      public static final int BUFFID_FIELD_NUMBER = 5;
      private int buffId_;
      public static final int END_FIELD_NUMBER = 6;
      private boolean end_;
      private byte memoizedIsInitialized;
      private static final S2C_EventInfo_8006 DEFAULT_INSTANCE = new S2C_EventInfo_8006();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_EventInfo_8006> PARSER = new AbstractParser<S2C_EventInfo_8006>() {
         public S2C_EventInfo_8006 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_EventInfo_8006(input, extensionRegistry);
         }
      };

      private S2C_EventInfo_8006(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_EventInfo_8006() {
         this.memoizedIsInitialized = -1;
         this.question_ = Collections.emptyList();
         this.goods_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_EventInfo_8006();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_EventInfo_8006(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.eventPos_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.eventId_ = input.readInt32();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.question_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.question_.add(input.readMessage(CommonMsg.MapDataII.PARSER, extensionRegistry));
                        break;
                     case 34:
                        if ((mutable_bitField0_ & 8) == 0) {
                           this.goods_ = new ArrayList();
                           mutable_bitField0_ |= 8;
                        }

                        this.goods_.add(input.readMessage(WarMsg.HLGoods.PARSER, extensionRegistry));
                        break;
                     case 40:
                        this.bitField0_ |= 4;
                        this.buffId_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 8;
                        this.end_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.question_ = Collections.unmodifiableList(this.question_);
               }

               if ((mutable_bitField0_ & 8) != 0) {
                  this.goods_ = Collections.unmodifiableList(this.goods_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WarMsg.internal_static_War_S2C_EventInfo_8006_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_S2C_EventInfo_8006_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EventInfo_8006.class, Builder.class);
      }

      public boolean hasEventPos() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getEventPos() {
         return this.eventPos_;
      }

      public boolean hasEventId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEventId() {
         return this.eventId_;
      }

      public List<CommonMsg.MapDataII> getQuestionList() {
         return this.question_;
      }

      public List<? extends CommonMsg.MapDataIIOrBuilder> getQuestionOrBuilderList() {
         return this.question_;
      }

      public int getQuestionCount() {
         return this.question_.size();
      }

      public CommonMsg.MapDataII getQuestion(int index) {
         return (CommonMsg.MapDataII)this.question_.get(index);
      }

      public CommonMsg.MapDataIIOrBuilder getQuestionOrBuilder(int index) {
         return (CommonMsg.MapDataIIOrBuilder)this.question_.get(index);
      }

      public List<HLGoods> getGoodsList() {
         return this.goods_;
      }

      public List<? extends HLGoodsOrBuilder> getGoodsOrBuilderList() {
         return this.goods_;
      }

      public int getGoodsCount() {
         return this.goods_.size();
      }

      public HLGoods getGoods(int index) {
         return (HLGoods)this.goods_.get(index);
      }

      public HLGoodsOrBuilder getGoodsOrBuilder(int index) {
         return (HLGoodsOrBuilder)this.goods_.get(index);
      }

      public boolean hasBuffId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getBuffId() {
         return this.buffId_;
      }

      public boolean hasEnd() {
         return (this.bitField0_ & 8) != 0;
      }

      public boolean getEnd() {
         return this.end_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasEventPos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEventId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEnd()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getQuestionCount(); ++i) {
               if (!this.getQuestion(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getGoodsCount(); ++i) {
               if (!this.getGoods(i).isInitialized()) {
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
            output.writeInt32(1, this.eventPos_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.eventId_);
         }

         for(int i = 0; i < this.question_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.question_.get(i));
         }

         for(int i = 0; i < this.goods_.size(); ++i) {
            output.writeMessage(4, (MessageLite)this.goods_.get(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(5, this.buffId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeBool(6, this.end_);
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
               size += CodedOutputStream.computeInt32Size(1, this.eventPos_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.eventId_);
            }

            for(int i = 0; i < this.question_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.question_.get(i));
            }

            for(int i = 0; i < this.goods_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(4, (MessageLite)this.goods_.get(i));
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.buffId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeBoolSize(6, this.end_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_EventInfo_8006)) {
            return super.equals(obj);
         } else {
            S2C_EventInfo_8006 other = (S2C_EventInfo_8006)obj;
            if (this.hasEventPos() != other.hasEventPos()) {
               return false;
            } else if (this.hasEventPos() && this.getEventPos() != other.getEventPos()) {
               return false;
            } else if (this.hasEventId() != other.hasEventId()) {
               return false;
            } else if (this.hasEventId() && this.getEventId() != other.getEventId()) {
               return false;
            } else if (!this.getQuestionList().equals(other.getQuestionList())) {
               return false;
            } else if (!this.getGoodsList().equals(other.getGoodsList())) {
               return false;
            } else if (this.hasBuffId() != other.hasBuffId()) {
               return false;
            } else if (this.hasBuffId() && this.getBuffId() != other.getBuffId()) {
               return false;
            } else if (this.hasEnd() != other.hasEnd()) {
               return false;
            } else if (this.hasEnd() && this.getEnd() != other.getEnd()) {
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
            if (this.hasEventPos()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getEventPos();
            }

            if (this.hasEventId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEventId();
            }

            if (this.getQuestionCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getQuestionList().hashCode();
            }

            if (this.getGoodsCount() > 0) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getGoodsList().hashCode();
            }

            if (this.hasBuffId()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getBuffId();
            }

            if (this.hasEnd()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashBoolean(this.getEnd());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_EventInfo_8006 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_EventInfo_8006)PARSER.parseFrom(data);
      }

      public static S2C_EventInfo_8006 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EventInfo_8006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EventInfo_8006 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_EventInfo_8006)PARSER.parseFrom(data);
      }

      public static S2C_EventInfo_8006 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EventInfo_8006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EventInfo_8006 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_EventInfo_8006)PARSER.parseFrom(data);
      }

      public static S2C_EventInfo_8006 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EventInfo_8006)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EventInfo_8006 parseFrom(InputStream input) throws IOException {
         return (S2C_EventInfo_8006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EventInfo_8006 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EventInfo_8006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EventInfo_8006 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_EventInfo_8006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_EventInfo_8006 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EventInfo_8006)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EventInfo_8006 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_EventInfo_8006)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EventInfo_8006 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EventInfo_8006)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_EventInfo_8006 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_EventInfo_8006 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_EventInfo_8006> parser() {
         return PARSER;
      }

      public Parser<S2C_EventInfo_8006> getParserForType() {
         return PARSER;
      }

      public S2C_EventInfo_8006 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_EventInfo_8006OrBuilder {
         private int bitField0_;
         private int eventPos_;
         private int eventId_;
         private List<CommonMsg.MapDataII> question_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> questionBuilder_;
         private List<HLGoods> goods_;
         private RepeatedFieldBuilderV3<HLGoods, HLGoods.Builder, HLGoodsOrBuilder> goodsBuilder_;
         private int buffId_;
         private boolean end_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_S2C_EventInfo_8006_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_S2C_EventInfo_8006_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EventInfo_8006.class, Builder.class);
         }

         private Builder() {
            this.question_ = Collections.emptyList();
            this.goods_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.question_ = Collections.emptyList();
            this.goods_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.S2C_EventInfo_8006.alwaysUseFieldBuilders) {
               this.getQuestionFieldBuilder();
               this.getGoodsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.eventPos_ = 0;
            this.bitField0_ &= -2;
            this.eventId_ = 0;
            this.bitField0_ &= -3;
            if (this.questionBuilder_ == null) {
               this.question_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.questionBuilder_.clear();
            }

            if (this.goodsBuilder_ == null) {
               this.goods_ = Collections.emptyList();
               this.bitField0_ &= -9;
            } else {
               this.goodsBuilder_.clear();
            }

            this.buffId_ = 0;
            this.bitField0_ &= -17;
            this.end_ = false;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_S2C_EventInfo_8006_descriptor;
         }

         public S2C_EventInfo_8006 getDefaultInstanceForType() {
            return WarMsg.S2C_EventInfo_8006.getDefaultInstance();
         }

         public S2C_EventInfo_8006 build() {
            S2C_EventInfo_8006 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_EventInfo_8006 buildPartial() {
            S2C_EventInfo_8006 result = new S2C_EventInfo_8006(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.eventPos_ = this.eventPos_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.eventId_ = this.eventId_;
               to_bitField0_ |= 2;
            }

            if (this.questionBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.question_ = Collections.unmodifiableList(this.question_);
                  this.bitField0_ &= -5;
               }

               result.question_ = this.question_;
            } else {
               result.question_ = this.questionBuilder_.build();
            }

            if (this.goodsBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0) {
                  this.goods_ = Collections.unmodifiableList(this.goods_);
                  this.bitField0_ &= -9;
               }

               result.goods_ = this.goods_;
            } else {
               result.goods_ = this.goodsBuilder_.build();
            }

            if ((from_bitField0_ & 16) != 0) {
               result.buffId_ = this.buffId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.end_ = this.end_;
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
            if (other instanceof S2C_EventInfo_8006) {
               return this.mergeFrom((S2C_EventInfo_8006)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_EventInfo_8006 other) {
            if (other == WarMsg.S2C_EventInfo_8006.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasEventPos()) {
                  this.setEventPos(other.getEventPos());
               }

               if (other.hasEventId()) {
                  this.setEventId(other.getEventId());
               }

               if (this.questionBuilder_ == null) {
                  if (!other.question_.isEmpty()) {
                     if (this.question_.isEmpty()) {
                        this.question_ = other.question_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureQuestionIsMutable();
                        this.question_.addAll(other.question_);
                     }

                     this.onChanged();
                  }
               } else if (!other.question_.isEmpty()) {
                  if (this.questionBuilder_.isEmpty()) {
                     this.questionBuilder_.dispose();
                     this.questionBuilder_ = null;
                     this.question_ = other.question_;
                     this.bitField0_ &= -5;
                     this.questionBuilder_ = WarMsg.S2C_EventInfo_8006.alwaysUseFieldBuilders ? this.getQuestionFieldBuilder() : null;
                  } else {
                     this.questionBuilder_.addAllMessages(other.question_);
                  }
               }

               if (this.goodsBuilder_ == null) {
                  if (!other.goods_.isEmpty()) {
                     if (this.goods_.isEmpty()) {
                        this.goods_ = other.goods_;
                        this.bitField0_ &= -9;
                     } else {
                        this.ensureGoodsIsMutable();
                        this.goods_.addAll(other.goods_);
                     }

                     this.onChanged();
                  }
               } else if (!other.goods_.isEmpty()) {
                  if (this.goodsBuilder_.isEmpty()) {
                     this.goodsBuilder_.dispose();
                     this.goodsBuilder_ = null;
                     this.goods_ = other.goods_;
                     this.bitField0_ &= -9;
                     this.goodsBuilder_ = WarMsg.S2C_EventInfo_8006.alwaysUseFieldBuilders ? this.getGoodsFieldBuilder() : null;
                  } else {
                     this.goodsBuilder_.addAllMessages(other.goods_);
                  }
               }

               if (other.hasBuffId()) {
                  this.setBuffId(other.getBuffId());
               }

               if (other.hasEnd()) {
                  this.setEnd(other.getEnd());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasEventPos()) {
               return false;
            } else if (!this.hasEventId()) {
               return false;
            } else if (!this.hasEnd()) {
               return false;
            } else {
               for(int i = 0; i < this.getQuestionCount(); ++i) {
                  if (!this.getQuestion(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getGoodsCount(); ++i) {
                  if (!this.getGoods(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_EventInfo_8006 parsedMessage = null;

            try {
               parsedMessage = (S2C_EventInfo_8006)WarMsg.S2C_EventInfo_8006.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_EventInfo_8006)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasEventPos() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getEventPos() {
            return this.eventPos_;
         }

         public Builder setEventPos(int value) {
            this.bitField0_ |= 1;
            this.eventPos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEventPos() {
            this.bitField0_ &= -2;
            this.eventPos_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEventId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getEventId() {
            return this.eventId_;
         }

         public Builder setEventId(int value) {
            this.bitField0_ |= 2;
            this.eventId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEventId() {
            this.bitField0_ &= -3;
            this.eventId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureQuestionIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.question_ = new ArrayList(this.question_);
               this.bitField0_ |= 4;
            }

         }

         public List<CommonMsg.MapDataII> getQuestionList() {
            return this.questionBuilder_ == null ? Collections.unmodifiableList(this.question_) : this.questionBuilder_.getMessageList();
         }

         public int getQuestionCount() {
            return this.questionBuilder_ == null ? this.question_.size() : this.questionBuilder_.getCount();
         }

         public CommonMsg.MapDataII getQuestion(int index) {
            return this.questionBuilder_ == null ? (CommonMsg.MapDataII)this.question_.get(index) : (CommonMsg.MapDataII)this.questionBuilder_.getMessage(index);
         }

         public Builder setQuestion(int index, CommonMsg.MapDataII value) {
            if (this.questionBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureQuestionIsMutable();
               this.question_.set(index, value);
               this.onChanged();
            } else {
               this.questionBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setQuestion(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.questionBuilder_ == null) {
               this.ensureQuestionIsMutable();
               this.question_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.questionBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addQuestion(CommonMsg.MapDataII value) {
            if (this.questionBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureQuestionIsMutable();
               this.question_.add(value);
               this.onChanged();
            } else {
               this.questionBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addQuestion(int index, CommonMsg.MapDataII value) {
            if (this.questionBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureQuestionIsMutable();
               this.question_.add(index, value);
               this.onChanged();
            } else {
               this.questionBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addQuestion(CommonMsg.MapDataII.Builder builderForValue) {
            if (this.questionBuilder_ == null) {
               this.ensureQuestionIsMutable();
               this.question_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.questionBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addQuestion(int index, CommonMsg.MapDataII.Builder builderForValue) {
            if (this.questionBuilder_ == null) {
               this.ensureQuestionIsMutable();
               this.question_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.questionBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllQuestion(Iterable<? extends CommonMsg.MapDataII> values) {
            if (this.questionBuilder_ == null) {
               this.ensureQuestionIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.question_);
               this.onChanged();
            } else {
               this.questionBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearQuestion() {
            if (this.questionBuilder_ == null) {
               this.question_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.questionBuilder_.clear();
            }

            return this;
         }

         public Builder removeQuestion(int index) {
            if (this.questionBuilder_ == null) {
               this.ensureQuestionIsMutable();
               this.question_.remove(index);
               this.onChanged();
            } else {
               this.questionBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataII.Builder getQuestionBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getQuestionFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIIOrBuilder getQuestionOrBuilder(int index) {
            return this.questionBuilder_ == null ? (CommonMsg.MapDataIIOrBuilder)this.question_.get(index) : (CommonMsg.MapDataIIOrBuilder)this.questionBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIIOrBuilder> getQuestionOrBuilderList() {
            return this.questionBuilder_ != null ? this.questionBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.question_);
         }

         public CommonMsg.MapDataII.Builder addQuestionBuilder() {
            return (CommonMsg.MapDataII.Builder)this.getQuestionFieldBuilder().addBuilder(CommonMsg.MapDataII.getDefaultInstance());
         }

         public CommonMsg.MapDataII.Builder addQuestionBuilder(int index) {
            return (CommonMsg.MapDataII.Builder)this.getQuestionFieldBuilder().addBuilder(index, CommonMsg.MapDataII.getDefaultInstance());
         }

         public List<CommonMsg.MapDataII.Builder> getQuestionBuilderList() {
            return this.getQuestionFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataII, CommonMsg.MapDataII.Builder, CommonMsg.MapDataIIOrBuilder> getQuestionFieldBuilder() {
            if (this.questionBuilder_ == null) {
               this.questionBuilder_ = new RepeatedFieldBuilderV3(this.question_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.question_ = null;
            }

            return this.questionBuilder_;
         }

         private void ensureGoodsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
               this.goods_ = new ArrayList(this.goods_);
               this.bitField0_ |= 8;
            }

         }

         public List<HLGoods> getGoodsList() {
            return this.goodsBuilder_ == null ? Collections.unmodifiableList(this.goods_) : this.goodsBuilder_.getMessageList();
         }

         public int getGoodsCount() {
            return this.goodsBuilder_ == null ? this.goods_.size() : this.goodsBuilder_.getCount();
         }

         public HLGoods getGoods(int index) {
            return this.goodsBuilder_ == null ? (HLGoods)this.goods_.get(index) : (HLGoods)this.goodsBuilder_.getMessage(index);
         }

         public Builder setGoods(int index, HLGoods value) {
            if (this.goodsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGoodsIsMutable();
               this.goods_.set(index, value);
               this.onChanged();
            } else {
               this.goodsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setGoods(int index, HLGoods.Builder builderForValue) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               this.goods_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.goodsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addGoods(HLGoods value) {
            if (this.goodsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGoodsIsMutable();
               this.goods_.add(value);
               this.onChanged();
            } else {
               this.goodsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addGoods(int index, HLGoods value) {
            if (this.goodsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGoodsIsMutable();
               this.goods_.add(index, value);
               this.onChanged();
            } else {
               this.goodsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addGoods(HLGoods.Builder builderForValue) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               this.goods_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.goodsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addGoods(int index, HLGoods.Builder builderForValue) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               this.goods_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.goodsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllGoods(Iterable<? extends HLGoods> values) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.goods_);
               this.onChanged();
            } else {
               this.goodsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearGoods() {
            if (this.goodsBuilder_ == null) {
               this.goods_ = Collections.emptyList();
               this.bitField0_ &= -9;
               this.onChanged();
            } else {
               this.goodsBuilder_.clear();
            }

            return this;
         }

         public Builder removeGoods(int index) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               this.goods_.remove(index);
               this.onChanged();
            } else {
               this.goodsBuilder_.remove(index);
            }

            return this;
         }

         public HLGoods.Builder getGoodsBuilder(int index) {
            return (HLGoods.Builder)this.getGoodsFieldBuilder().getBuilder(index);
         }

         public HLGoodsOrBuilder getGoodsOrBuilder(int index) {
            return this.goodsBuilder_ == null ? (HLGoodsOrBuilder)this.goods_.get(index) : (HLGoodsOrBuilder)this.goodsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HLGoodsOrBuilder> getGoodsOrBuilderList() {
            return this.goodsBuilder_ != null ? this.goodsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.goods_);
         }

         public HLGoods.Builder addGoodsBuilder() {
            return (HLGoods.Builder)this.getGoodsFieldBuilder().addBuilder(WarMsg.HLGoods.getDefaultInstance());
         }

         public HLGoods.Builder addGoodsBuilder(int index) {
            return (HLGoods.Builder)this.getGoodsFieldBuilder().addBuilder(index, WarMsg.HLGoods.getDefaultInstance());
         }

         public List<HLGoods.Builder> getGoodsBuilderList() {
            return this.getGoodsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HLGoods, HLGoods.Builder, HLGoodsOrBuilder> getGoodsFieldBuilder() {
            if (this.goodsBuilder_ == null) {
               this.goodsBuilder_ = new RepeatedFieldBuilderV3(this.goods_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
               this.goods_ = null;
            }

            return this.goodsBuilder_;
         }

         public boolean hasBuffId() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getBuffId() {
            return this.buffId_;
         }

         public Builder setBuffId(int value) {
            this.bitField0_ |= 16;
            this.buffId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuffId() {
            this.bitField0_ &= -17;
            this.buffId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEnd() {
            return (this.bitField0_ & 32) != 0;
         }

         public boolean getEnd() {
            return this.end_;
         }

         public Builder setEnd(boolean value) {
            this.bitField0_ |= 32;
            this.end_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEnd() {
            this.bitField0_ &= -33;
            this.end_ = false;
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

   public static final class HLGoods extends GeneratedMessageV3 implements HLGoodsOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INDEX_FIELD_NUMBER = 1;
      private int index_;
      public static final int ITEM_FIELD_NUMBER = 2;
      private CommonMsg.ItemInfo item_;
      public static final int COST_FIELD_NUMBER = 3;
      private CommonMsg.ItemInfo cost_;
      public static final int DISCOUNT_FIELD_NUMBER = 4;
      private int discount_;
      public static final int BOUGHT_FIELD_NUMBER = 5;
      private boolean bought_;
      private byte memoizedIsInitialized;
      private static final HLGoods DEFAULT_INSTANCE = new HLGoods();
      /** @deprecated */
      @Deprecated
      public static final Parser<HLGoods> PARSER = new AbstractParser<HLGoods>() {
         public HLGoods parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new HLGoods(input, extensionRegistry);
         }
      };

      private HLGoods(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private HLGoods() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new HLGoods();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private HLGoods(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.index_ = input.readInt32();
                        break;
                     case 18:
                        CommonMsg.ItemInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.item_.toBuilder();
                        }

                        this.item_ = (CommonMsg.ItemInfo)input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.item_);
                           this.item_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 26:
                        CommonMsg.ItemInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.cost_.toBuilder();
                        }

                        this.cost_ = (CommonMsg.ItemInfo)input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.cost_);
                           this.cost_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 4;
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.discount_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.bought_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WarMsg.internal_static_War_HLGoods_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_HLGoods_fieldAccessorTable.ensureFieldAccessorsInitialized(HLGoods.class, Builder.class);
      }

      public boolean hasIndex() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getIndex() {
         return this.index_;
      }

      public boolean hasItem() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.ItemInfo getItem() {
         return this.item_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.item_;
      }

      public CommonMsg.ItemInfoOrBuilder getItemOrBuilder() {
         return this.item_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.item_;
      }

      public boolean hasCost() {
         return (this.bitField0_ & 4) != 0;
      }

      public CommonMsg.ItemInfo getCost() {
         return this.cost_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.cost_;
      }

      public CommonMsg.ItemInfoOrBuilder getCostOrBuilder() {
         return this.cost_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.cost_;
      }

      public boolean hasDiscount() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getDiscount() {
         return this.discount_;
      }

      public boolean hasBought() {
         return (this.bitField0_ & 16) != 0;
      }

      public boolean getBought() {
         return this.bought_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIndex()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasItem()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCost()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDiscount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBought()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getItem().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getCost().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.index_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getItem());
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(3, this.getCost());
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.discount_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeBool(5, this.bought_);
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
               size += CodedOutputStream.computeInt32Size(1, this.index_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getItem());
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(3, this.getCost());
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.discount_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeBoolSize(5, this.bought_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof HLGoods)) {
            return super.equals(obj);
         } else {
            HLGoods other = (HLGoods)obj;
            if (this.hasIndex() != other.hasIndex()) {
               return false;
            } else if (this.hasIndex() && this.getIndex() != other.getIndex()) {
               return false;
            } else if (this.hasItem() != other.hasItem()) {
               return false;
            } else if (this.hasItem() && !this.getItem().equals(other.getItem())) {
               return false;
            } else if (this.hasCost() != other.hasCost()) {
               return false;
            } else if (this.hasCost() && !this.getCost().equals(other.getCost())) {
               return false;
            } else if (this.hasDiscount() != other.hasDiscount()) {
               return false;
            } else if (this.hasDiscount() && this.getDiscount() != other.getDiscount()) {
               return false;
            } else if (this.hasBought() != other.hasBought()) {
               return false;
            } else if (this.hasBought() && this.getBought() != other.getBought()) {
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
            if (this.hasIndex()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIndex();
            }

            if (this.hasItem()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getItem().hashCode();
            }

            if (this.hasCost()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getCost().hashCode();
            }

            if (this.hasDiscount()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getDiscount();
            }

            if (this.hasBought()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashBoolean(this.getBought());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static HLGoods parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (HLGoods)PARSER.parseFrom(data);
      }

      public static HLGoods parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HLGoods)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HLGoods parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (HLGoods)PARSER.parseFrom(data);
      }

      public static HLGoods parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HLGoods)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HLGoods parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (HLGoods)PARSER.parseFrom(data);
      }

      public static HLGoods parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HLGoods)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HLGoods parseFrom(InputStream input) throws IOException {
         return (HLGoods)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HLGoods parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HLGoods)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static HLGoods parseDelimitedFrom(InputStream input) throws IOException {
         return (HLGoods)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static HLGoods parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HLGoods)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static HLGoods parseFrom(CodedInputStream input) throws IOException {
         return (HLGoods)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HLGoods parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HLGoods)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(HLGoods prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static HLGoods getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<HLGoods> parser() {
         return PARSER;
      }

      public Parser<HLGoods> getParserForType() {
         return PARSER;
      }

      public HLGoods getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HLGoodsOrBuilder {
         private int bitField0_;
         private int index_;
         private CommonMsg.ItemInfo item_;
         private SingleFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> itemBuilder_;
         private CommonMsg.ItemInfo cost_;
         private SingleFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> costBuilder_;
         private int discount_;
         private boolean bought_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_HLGoods_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_HLGoods_fieldAccessorTable.ensureFieldAccessorsInitialized(HLGoods.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.HLGoods.alwaysUseFieldBuilders) {
               this.getItemFieldBuilder();
               this.getCostFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.index_ = 0;
            this.bitField0_ &= -2;
            if (this.itemBuilder_ == null) {
               this.item_ = null;
            } else {
               this.itemBuilder_.clear();
            }

            this.bitField0_ &= -3;
            if (this.costBuilder_ == null) {
               this.cost_ = null;
            } else {
               this.costBuilder_.clear();
            }

            this.bitField0_ &= -5;
            this.discount_ = 0;
            this.bitField0_ &= -9;
            this.bought_ = false;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_HLGoods_descriptor;
         }

         public HLGoods getDefaultInstanceForType() {
            return WarMsg.HLGoods.getDefaultInstance();
         }

         public HLGoods build() {
            HLGoods result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public HLGoods buildPartial() {
            HLGoods result = new HLGoods(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.index_ = this.index_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.itemBuilder_ == null) {
                  result.item_ = this.item_;
               } else {
                  result.item_ = (CommonMsg.ItemInfo)this.itemBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               if (this.costBuilder_ == null) {
                  result.cost_ = this.cost_;
               } else {
                  result.cost_ = (CommonMsg.ItemInfo)this.costBuilder_.build();
               }

               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.discount_ = this.discount_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.bought_ = this.bought_;
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
            if (other instanceof HLGoods) {
               return this.mergeFrom((HLGoods)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(HLGoods other) {
            if (other == WarMsg.HLGoods.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIndex()) {
                  this.setIndex(other.getIndex());
               }

               if (other.hasItem()) {
                  this.mergeItem(other.getItem());
               }

               if (other.hasCost()) {
                  this.mergeCost(other.getCost());
               }

               if (other.hasDiscount()) {
                  this.setDiscount(other.getDiscount());
               }

               if (other.hasBought()) {
                  this.setBought(other.getBought());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasIndex()) {
               return false;
            } else if (!this.hasItem()) {
               return false;
            } else if (!this.hasCost()) {
               return false;
            } else if (!this.hasDiscount()) {
               return false;
            } else if (!this.hasBought()) {
               return false;
            } else if (!this.getItem().isInitialized()) {
               return false;
            } else {
               return this.getCost().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            HLGoods parsedMessage = null;

            try {
               parsedMessage = (HLGoods)WarMsg.HLGoods.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (HLGoods)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIndex() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getIndex() {
            return this.index_;
         }

         public Builder setIndex(int value) {
            this.bitField0_ |= 1;
            this.index_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIndex() {
            this.bitField0_ &= -2;
            this.index_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasItem() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.ItemInfo getItem() {
            if (this.itemBuilder_ == null) {
               return this.item_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.item_;
            } else {
               return (CommonMsg.ItemInfo)this.itemBuilder_.getMessage();
            }
         }

         public Builder setItem(CommonMsg.ItemInfo value) {
            if (this.itemBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.item_ = value;
               this.onChanged();
            } else {
               this.itemBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setItem(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemBuilder_ == null) {
               this.item_ = builderForValue.build();
               this.onChanged();
            } else {
               this.itemBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeItem(CommonMsg.ItemInfo value) {
            if (this.itemBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.item_ != null && this.item_ != CommonMsg.ItemInfo.getDefaultInstance()) {
                  this.item_ = CommonMsg.ItemInfo.newBuilder(this.item_).mergeFrom(value).buildPartial();
               } else {
                  this.item_ = value;
               }

               this.onChanged();
            } else {
               this.itemBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearItem() {
            if (this.itemBuilder_ == null) {
               this.item_ = null;
               this.onChanged();
            } else {
               this.itemBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.ItemInfo.Builder getItemBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.ItemInfo.Builder)this.getItemFieldBuilder().getBuilder();
         }

         public CommonMsg.ItemInfoOrBuilder getItemOrBuilder() {
            if (this.itemBuilder_ != null) {
               return (CommonMsg.ItemInfoOrBuilder)this.itemBuilder_.getMessageOrBuilder();
            } else {
               return this.item_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.item_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getItemFieldBuilder() {
            if (this.itemBuilder_ == null) {
               this.itemBuilder_ = new SingleFieldBuilderV3(this.getItem(), this.getParentForChildren(), this.isClean());
               this.item_ = null;
            }

            return this.itemBuilder_;
         }

         public boolean hasCost() {
            return (this.bitField0_ & 4) != 0;
         }

         public CommonMsg.ItemInfo getCost() {
            if (this.costBuilder_ == null) {
               return this.cost_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.cost_;
            } else {
               return (CommonMsg.ItemInfo)this.costBuilder_.getMessage();
            }
         }

         public Builder setCost(CommonMsg.ItemInfo value) {
            if (this.costBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.cost_ = value;
               this.onChanged();
            } else {
               this.costBuilder_.setMessage(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setCost(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.costBuilder_ == null) {
               this.cost_ = builderForValue.build();
               this.onChanged();
            } else {
               this.costBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeCost(CommonMsg.ItemInfo value) {
            if (this.costBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.cost_ != null && this.cost_ != CommonMsg.ItemInfo.getDefaultInstance()) {
                  this.cost_ = CommonMsg.ItemInfo.newBuilder(this.cost_).mergeFrom(value).buildPartial();
               } else {
                  this.cost_ = value;
               }

               this.onChanged();
            } else {
               this.costBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearCost() {
            if (this.costBuilder_ == null) {
               this.cost_ = null;
               this.onChanged();
            } else {
               this.costBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public CommonMsg.ItemInfo.Builder getCostBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (CommonMsg.ItemInfo.Builder)this.getCostFieldBuilder().getBuilder();
         }

         public CommonMsg.ItemInfoOrBuilder getCostOrBuilder() {
            if (this.costBuilder_ != null) {
               return (CommonMsg.ItemInfoOrBuilder)this.costBuilder_.getMessageOrBuilder();
            } else {
               return this.cost_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.cost_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getCostFieldBuilder() {
            if (this.costBuilder_ == null) {
               this.costBuilder_ = new SingleFieldBuilderV3(this.getCost(), this.getParentForChildren(), this.isClean());
               this.cost_ = null;
            }

            return this.costBuilder_;
         }

         public boolean hasDiscount() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getDiscount() {
            return this.discount_;
         }

         public Builder setDiscount(int value) {
            this.bitField0_ |= 8;
            this.discount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDiscount() {
            this.bitField0_ &= -9;
            this.discount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBought() {
            return (this.bitField0_ & 16) != 0;
         }

         public boolean getBought() {
            return this.bought_;
         }

         public Builder setBought(boolean value) {
            this.bitField0_ |= 16;
            this.bought_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBought() {
            this.bitField0_ &= -17;
            this.bought_ = false;
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

   public static final class HLMarchShop extends GeneratedMessageV3 implements HLMarchShopOrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int GOODS_FIELD_NUMBER = 1;
      private List<HLGoods> goods_;
      private byte memoizedIsInitialized;
      private static final HLMarchShop DEFAULT_INSTANCE = new HLMarchShop();
      /** @deprecated */
      @Deprecated
      public static final Parser<HLMarchShop> PARSER = new AbstractParser<HLMarchShop>() {
         public HLMarchShop parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new HLMarchShop(input, extensionRegistry);
         }
      };

      private HLMarchShop(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private HLMarchShop() {
         this.memoizedIsInitialized = -1;
         this.goods_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new HLMarchShop();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private HLMarchShop(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.goods_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.goods_.add(input.readMessage(WarMsg.HLGoods.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.goods_ = Collections.unmodifiableList(this.goods_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WarMsg.internal_static_War_HLMarchShop_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_HLMarchShop_fieldAccessorTable.ensureFieldAccessorsInitialized(HLMarchShop.class, Builder.class);
      }

      public List<HLGoods> getGoodsList() {
         return this.goods_;
      }

      public List<? extends HLGoodsOrBuilder> getGoodsOrBuilderList() {
         return this.goods_;
      }

      public int getGoodsCount() {
         return this.goods_.size();
      }

      public HLGoods getGoods(int index) {
         return (HLGoods)this.goods_.get(index);
      }

      public HLGoodsOrBuilder getGoodsOrBuilder(int index) {
         return (HLGoodsOrBuilder)this.goods_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getGoodsCount(); ++i) {
               if (!this.getGoods(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.goods_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.goods_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.goods_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.goods_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof HLMarchShop)) {
            return super.equals(obj);
         } else {
            HLMarchShop other = (HLMarchShop)obj;
            if (!this.getGoodsList().equals(other.getGoodsList())) {
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
            if (this.getGoodsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGoodsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static HLMarchShop parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (HLMarchShop)PARSER.parseFrom(data);
      }

      public static HLMarchShop parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HLMarchShop)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HLMarchShop parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (HLMarchShop)PARSER.parseFrom(data);
      }

      public static HLMarchShop parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HLMarchShop)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HLMarchShop parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (HLMarchShop)PARSER.parseFrom(data);
      }

      public static HLMarchShop parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HLMarchShop)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HLMarchShop parseFrom(InputStream input) throws IOException {
         return (HLMarchShop)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HLMarchShop parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HLMarchShop)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static HLMarchShop parseDelimitedFrom(InputStream input) throws IOException {
         return (HLMarchShop)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static HLMarchShop parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HLMarchShop)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static HLMarchShop parseFrom(CodedInputStream input) throws IOException {
         return (HLMarchShop)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HLMarchShop parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HLMarchShop)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(HLMarchShop prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static HLMarchShop getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<HLMarchShop> parser() {
         return PARSER;
      }

      public Parser<HLMarchShop> getParserForType() {
         return PARSER;
      }

      public HLMarchShop getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HLMarchShopOrBuilder {
         private int bitField0_;
         private List<HLGoods> goods_;
         private RepeatedFieldBuilderV3<HLGoods, HLGoods.Builder, HLGoodsOrBuilder> goodsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_HLMarchShop_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_HLMarchShop_fieldAccessorTable.ensureFieldAccessorsInitialized(HLMarchShop.class, Builder.class);
         }

         private Builder() {
            this.goods_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.goods_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.HLMarchShop.alwaysUseFieldBuilders) {
               this.getGoodsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.goodsBuilder_ == null) {
               this.goods_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.goodsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_HLMarchShop_descriptor;
         }

         public HLMarchShop getDefaultInstanceForType() {
            return WarMsg.HLMarchShop.getDefaultInstance();
         }

         public HLMarchShop build() {
            HLMarchShop result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public HLMarchShop buildPartial() {
            HLMarchShop result = new HLMarchShop(this);
            int from_bitField0_ = this.bitField0_;
            if (this.goodsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.goods_ = Collections.unmodifiableList(this.goods_);
                  this.bitField0_ &= -2;
               }

               result.goods_ = this.goods_;
            } else {
               result.goods_ = this.goodsBuilder_.build();
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
            if (other instanceof HLMarchShop) {
               return this.mergeFrom((HLMarchShop)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(HLMarchShop other) {
            if (other == WarMsg.HLMarchShop.getDefaultInstance()) {
               return this;
            } else {
               if (this.goodsBuilder_ == null) {
                  if (!other.goods_.isEmpty()) {
                     if (this.goods_.isEmpty()) {
                        this.goods_ = other.goods_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureGoodsIsMutable();
                        this.goods_.addAll(other.goods_);
                     }

                     this.onChanged();
                  }
               } else if (!other.goods_.isEmpty()) {
                  if (this.goodsBuilder_.isEmpty()) {
                     this.goodsBuilder_.dispose();
                     this.goodsBuilder_ = null;
                     this.goods_ = other.goods_;
                     this.bitField0_ &= -2;
                     this.goodsBuilder_ = WarMsg.HLMarchShop.alwaysUseFieldBuilders ? this.getGoodsFieldBuilder() : null;
                  } else {
                     this.goodsBuilder_.addAllMessages(other.goods_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getGoodsCount(); ++i) {
               if (!this.getGoods(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            HLMarchShop parsedMessage = null;

            try {
               parsedMessage = (HLMarchShop)WarMsg.HLMarchShop.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (HLMarchShop)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureGoodsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.goods_ = new ArrayList(this.goods_);
               this.bitField0_ |= 1;
            }

         }

         public List<HLGoods> getGoodsList() {
            return this.goodsBuilder_ == null ? Collections.unmodifiableList(this.goods_) : this.goodsBuilder_.getMessageList();
         }

         public int getGoodsCount() {
            return this.goodsBuilder_ == null ? this.goods_.size() : this.goodsBuilder_.getCount();
         }

         public HLGoods getGoods(int index) {
            return this.goodsBuilder_ == null ? (HLGoods)this.goods_.get(index) : (HLGoods)this.goodsBuilder_.getMessage(index);
         }

         public Builder setGoods(int index, HLGoods value) {
            if (this.goodsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGoodsIsMutable();
               this.goods_.set(index, value);
               this.onChanged();
            } else {
               this.goodsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setGoods(int index, HLGoods.Builder builderForValue) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               this.goods_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.goodsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addGoods(HLGoods value) {
            if (this.goodsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGoodsIsMutable();
               this.goods_.add(value);
               this.onChanged();
            } else {
               this.goodsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addGoods(int index, HLGoods value) {
            if (this.goodsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGoodsIsMutable();
               this.goods_.add(index, value);
               this.onChanged();
            } else {
               this.goodsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addGoods(HLGoods.Builder builderForValue) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               this.goods_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.goodsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addGoods(int index, HLGoods.Builder builderForValue) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               this.goods_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.goodsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllGoods(Iterable<? extends HLGoods> values) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.goods_);
               this.onChanged();
            } else {
               this.goodsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearGoods() {
            if (this.goodsBuilder_ == null) {
               this.goods_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.goodsBuilder_.clear();
            }

            return this;
         }

         public Builder removeGoods(int index) {
            if (this.goodsBuilder_ == null) {
               this.ensureGoodsIsMutable();
               this.goods_.remove(index);
               this.onChanged();
            } else {
               this.goodsBuilder_.remove(index);
            }

            return this;
         }

         public HLGoods.Builder getGoodsBuilder(int index) {
            return (HLGoods.Builder)this.getGoodsFieldBuilder().getBuilder(index);
         }

         public HLGoodsOrBuilder getGoodsOrBuilder(int index) {
            return this.goodsBuilder_ == null ? (HLGoodsOrBuilder)this.goods_.get(index) : (HLGoodsOrBuilder)this.goodsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HLGoodsOrBuilder> getGoodsOrBuilderList() {
            return this.goodsBuilder_ != null ? this.goodsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.goods_);
         }

         public HLGoods.Builder addGoodsBuilder() {
            return (HLGoods.Builder)this.getGoodsFieldBuilder().addBuilder(WarMsg.HLGoods.getDefaultInstance());
         }

         public HLGoods.Builder addGoodsBuilder(int index) {
            return (HLGoods.Builder)this.getGoodsFieldBuilder().addBuilder(index, WarMsg.HLGoods.getDefaultInstance());
         }

         public List<HLGoods.Builder> getGoodsBuilderList() {
            return this.getGoodsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HLGoods, HLGoods.Builder, HLGoodsOrBuilder> getGoodsFieldBuilder() {
            if (this.goodsBuilder_ == null) {
               this.goodsBuilder_ = new RepeatedFieldBuilderV3(this.goods_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.goods_ = null;
            }

            return this.goodsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_SpecialItem_8007 extends GeneratedMessageV3 implements S2C_SpecialItem_8007OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int USEPOISON_FIELD_NUMBER = 4;
      private int usePoison_;
      public static final int USECURE_FIELD_NUMBER = 5;
      private int useCure_;
      private byte memoizedIsInitialized;
      private static final S2C_SpecialItem_8007 DEFAULT_INSTANCE = new S2C_SpecialItem_8007();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_SpecialItem_8007> PARSER = new AbstractParser<S2C_SpecialItem_8007>() {
         public S2C_SpecialItem_8007 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_SpecialItem_8007(input, extensionRegistry);
         }
      };

      private S2C_SpecialItem_8007(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_SpecialItem_8007() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_SpecialItem_8007();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_SpecialItem_8007(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 32:
                        this.bitField0_ |= 1;
                        this.usePoison_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 2;
                        this.useCure_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WarMsg.internal_static_War_S2C_SpecialItem_8007_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_S2C_SpecialItem_8007_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SpecialItem_8007.class, Builder.class);
      }

      public boolean hasUsePoison() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getUsePoison() {
         return this.usePoison_;
      }

      public boolean hasUseCure() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getUseCure() {
         return this.useCure_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasUsePoison()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasUseCure()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(4, this.usePoison_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(5, this.useCure_);
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
               size += CodedOutputStream.computeInt32Size(4, this.usePoison_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.useCure_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_SpecialItem_8007)) {
            return super.equals(obj);
         } else {
            S2C_SpecialItem_8007 other = (S2C_SpecialItem_8007)obj;
            if (this.hasUsePoison() != other.hasUsePoison()) {
               return false;
            } else if (this.hasUsePoison() && this.getUsePoison() != other.getUsePoison()) {
               return false;
            } else if (this.hasUseCure() != other.hasUseCure()) {
               return false;
            } else if (this.hasUseCure() && this.getUseCure() != other.getUseCure()) {
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
            if (this.hasUsePoison()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getUsePoison();
            }

            if (this.hasUseCure()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getUseCure();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_SpecialItem_8007 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_SpecialItem_8007)PARSER.parseFrom(data);
      }

      public static S2C_SpecialItem_8007 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SpecialItem_8007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SpecialItem_8007 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_SpecialItem_8007)PARSER.parseFrom(data);
      }

      public static S2C_SpecialItem_8007 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SpecialItem_8007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SpecialItem_8007 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_SpecialItem_8007)PARSER.parseFrom(data);
      }

      public static S2C_SpecialItem_8007 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_SpecialItem_8007)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_SpecialItem_8007 parseFrom(InputStream input) throws IOException {
         return (S2C_SpecialItem_8007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SpecialItem_8007 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SpecialItem_8007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SpecialItem_8007 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_SpecialItem_8007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_SpecialItem_8007 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SpecialItem_8007)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_SpecialItem_8007 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_SpecialItem_8007)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_SpecialItem_8007 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_SpecialItem_8007)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_SpecialItem_8007 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_SpecialItem_8007 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_SpecialItem_8007> parser() {
         return PARSER;
      }

      public Parser<S2C_SpecialItem_8007> getParserForType() {
         return PARSER;
      }

      public S2C_SpecialItem_8007 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_SpecialItem_8007OrBuilder {
         private int bitField0_;
         private int usePoison_;
         private int useCure_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_S2C_SpecialItem_8007_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_S2C_SpecialItem_8007_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_SpecialItem_8007.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.S2C_SpecialItem_8007.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.usePoison_ = 0;
            this.bitField0_ &= -2;
            this.useCure_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_S2C_SpecialItem_8007_descriptor;
         }

         public S2C_SpecialItem_8007 getDefaultInstanceForType() {
            return WarMsg.S2C_SpecialItem_8007.getDefaultInstance();
         }

         public S2C_SpecialItem_8007 build() {
            S2C_SpecialItem_8007 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_SpecialItem_8007 buildPartial() {
            S2C_SpecialItem_8007 result = new S2C_SpecialItem_8007(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.usePoison_ = this.usePoison_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.useCure_ = this.useCure_;
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
            if (other instanceof S2C_SpecialItem_8007) {
               return this.mergeFrom((S2C_SpecialItem_8007)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_SpecialItem_8007 other) {
            if (other == WarMsg.S2C_SpecialItem_8007.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasUsePoison()) {
                  this.setUsePoison(other.getUsePoison());
               }

               if (other.hasUseCure()) {
                  this.setUseCure(other.getUseCure());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasUsePoison()) {
               return false;
            } else {
               return this.hasUseCure();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_SpecialItem_8007 parsedMessage = null;

            try {
               parsedMessage = (S2C_SpecialItem_8007)WarMsg.S2C_SpecialItem_8007.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_SpecialItem_8007)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasUsePoison() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getUsePoison() {
            return this.usePoison_;
         }

         public Builder setUsePoison(int value) {
            this.bitField0_ |= 1;
            this.usePoison_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUsePoison() {
            this.bitField0_ &= -2;
            this.usePoison_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUseCure() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getUseCure() {
            return this.useCure_;
         }

         public Builder setUseCure(int value) {
            this.bitField0_ |= 2;
            this.useCure_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUseCure() {
            this.bitField0_ &= -3;
            this.useCure_ = 0;
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

   public static final class C2S_UseSpecialItemCure_8008 extends GeneratedMessageV3 implements C2S_UseSpecialItemCure_8008OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROPOS_FIELD_NUMBER = 1;
      private int heroPos_;
      private byte memoizedIsInitialized;
      private static final C2S_UseSpecialItemCure_8008 DEFAULT_INSTANCE = new C2S_UseSpecialItemCure_8008();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UseSpecialItemCure_8008> PARSER = new AbstractParser<C2S_UseSpecialItemCure_8008>() {
         public C2S_UseSpecialItemCure_8008 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UseSpecialItemCure_8008(input, extensionRegistry);
         }
      };

      private C2S_UseSpecialItemCure_8008(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UseSpecialItemCure_8008() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UseSpecialItemCure_8008();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UseSpecialItemCure_8008(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroPos_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WarMsg.internal_static_War_C2S_UseSpecialItemCure_8008_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_C2S_UseSpecialItemCure_8008_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UseSpecialItemCure_8008.class, Builder.class);
      }

      public boolean hasHeroPos() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroPos() {
         return this.heroPos_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroPos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroPos_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroPos_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_UseSpecialItemCure_8008)) {
            return super.equals(obj);
         } else {
            C2S_UseSpecialItemCure_8008 other = (C2S_UseSpecialItemCure_8008)obj;
            if (this.hasHeroPos() != other.hasHeroPos()) {
               return false;
            } else if (this.hasHeroPos() && this.getHeroPos() != other.getHeroPos()) {
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
            if (this.hasHeroPos()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroPos();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_UseSpecialItemCure_8008 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UseSpecialItemCure_8008)PARSER.parseFrom(data);
      }

      public static C2S_UseSpecialItemCure_8008 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UseSpecialItemCure_8008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UseSpecialItemCure_8008 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UseSpecialItemCure_8008)PARSER.parseFrom(data);
      }

      public static C2S_UseSpecialItemCure_8008 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UseSpecialItemCure_8008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UseSpecialItemCure_8008 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UseSpecialItemCure_8008)PARSER.parseFrom(data);
      }

      public static C2S_UseSpecialItemCure_8008 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UseSpecialItemCure_8008)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UseSpecialItemCure_8008 parseFrom(InputStream input) throws IOException {
         return (C2S_UseSpecialItemCure_8008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UseSpecialItemCure_8008 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UseSpecialItemCure_8008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UseSpecialItemCure_8008 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UseSpecialItemCure_8008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UseSpecialItemCure_8008 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UseSpecialItemCure_8008)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UseSpecialItemCure_8008 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UseSpecialItemCure_8008)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UseSpecialItemCure_8008 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UseSpecialItemCure_8008)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UseSpecialItemCure_8008 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UseSpecialItemCure_8008 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UseSpecialItemCure_8008> parser() {
         return PARSER;
      }

      public Parser<C2S_UseSpecialItemCure_8008> getParserForType() {
         return PARSER;
      }

      public C2S_UseSpecialItemCure_8008 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UseSpecialItemCure_8008OrBuilder {
         private int bitField0_;
         private int heroPos_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_C2S_UseSpecialItemCure_8008_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_C2S_UseSpecialItemCure_8008_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UseSpecialItemCure_8008.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.C2S_UseSpecialItemCure_8008.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroPos_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_C2S_UseSpecialItemCure_8008_descriptor;
         }

         public C2S_UseSpecialItemCure_8008 getDefaultInstanceForType() {
            return WarMsg.C2S_UseSpecialItemCure_8008.getDefaultInstance();
         }

         public C2S_UseSpecialItemCure_8008 build() {
            C2S_UseSpecialItemCure_8008 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UseSpecialItemCure_8008 buildPartial() {
            C2S_UseSpecialItemCure_8008 result = new C2S_UseSpecialItemCure_8008(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroPos_ = this.heroPos_;
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
            if (other instanceof C2S_UseSpecialItemCure_8008) {
               return this.mergeFrom((C2S_UseSpecialItemCure_8008)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UseSpecialItemCure_8008 other) {
            if (other == WarMsg.C2S_UseSpecialItemCure_8008.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroPos()) {
                  this.setHeroPos(other.getHeroPos());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasHeroPos();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_UseSpecialItemCure_8008 parsedMessage = null;

            try {
               parsedMessage = (C2S_UseSpecialItemCure_8008)WarMsg.C2S_UseSpecialItemCure_8008.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UseSpecialItemCure_8008)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroPos() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroPos() {
            return this.heroPos_;
         }

         public Builder setHeroPos(int value) {
            this.bitField0_ |= 1;
            this.heroPos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroPos() {
            this.bitField0_ &= -2;
            this.heroPos_ = 0;
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

   public static final class S2C_UseSpecialItemCure_8009 extends GeneratedMessageV3 implements S2C_UseSpecialItemCure_8009OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROHP_FIELD_NUMBER = 1;
      private List<CommonMsg.MapDataIF> heroHp_;
      public static final int USECURE_FIELD_NUMBER = 2;
      private int useCure_;
      private byte memoizedIsInitialized;
      private static final S2C_UseSpecialItemCure_8009 DEFAULT_INSTANCE = new S2C_UseSpecialItemCure_8009();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UseSpecialItemCure_8009> PARSER = new AbstractParser<S2C_UseSpecialItemCure_8009>() {
         public S2C_UseSpecialItemCure_8009 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UseSpecialItemCure_8009(input, extensionRegistry);
         }
      };

      private S2C_UseSpecialItemCure_8009(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UseSpecialItemCure_8009() {
         this.memoizedIsInitialized = -1;
         this.heroHp_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UseSpecialItemCure_8009();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UseSpecialItemCure_8009(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.heroHp_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.heroHp_.add(input.readMessage(CommonMsg.MapDataIF.PARSER, extensionRegistry));
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.useCure_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.heroHp_ = Collections.unmodifiableList(this.heroHp_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WarMsg.internal_static_War_S2C_UseSpecialItemCure_8009_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_S2C_UseSpecialItemCure_8009_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UseSpecialItemCure_8009.class, Builder.class);
      }

      public List<CommonMsg.MapDataIF> getHeroHpList() {
         return this.heroHp_;
      }

      public List<? extends CommonMsg.MapDataIFOrBuilder> getHeroHpOrBuilderList() {
         return this.heroHp_;
      }

      public int getHeroHpCount() {
         return this.heroHp_.size();
      }

      public CommonMsg.MapDataIF getHeroHp(int index) {
         return (CommonMsg.MapDataIF)this.heroHp_.get(index);
      }

      public CommonMsg.MapDataIFOrBuilder getHeroHpOrBuilder(int index) {
         return (CommonMsg.MapDataIFOrBuilder)this.heroHp_.get(index);
      }

      public boolean hasUseCure() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getUseCure() {
         return this.useCure_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasUseCure()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getHeroHpCount(); ++i) {
               if (!this.getHeroHp(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.heroHp_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.heroHp_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.useCure_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.heroHp_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.heroHp_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.useCure_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UseSpecialItemCure_8009)) {
            return super.equals(obj);
         } else {
            S2C_UseSpecialItemCure_8009 other = (S2C_UseSpecialItemCure_8009)obj;
            if (!this.getHeroHpList().equals(other.getHeroHpList())) {
               return false;
            } else if (this.hasUseCure() != other.hasUseCure()) {
               return false;
            } else if (this.hasUseCure() && this.getUseCure() != other.getUseCure()) {
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
            if (this.getHeroHpCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroHpList().hashCode();
            }

            if (this.hasUseCure()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getUseCure();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UseSpecialItemCure_8009 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UseSpecialItemCure_8009)PARSER.parseFrom(data);
      }

      public static S2C_UseSpecialItemCure_8009 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UseSpecialItemCure_8009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UseSpecialItemCure_8009 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UseSpecialItemCure_8009)PARSER.parseFrom(data);
      }

      public static S2C_UseSpecialItemCure_8009 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UseSpecialItemCure_8009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UseSpecialItemCure_8009 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UseSpecialItemCure_8009)PARSER.parseFrom(data);
      }

      public static S2C_UseSpecialItemCure_8009 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UseSpecialItemCure_8009)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UseSpecialItemCure_8009 parseFrom(InputStream input) throws IOException {
         return (S2C_UseSpecialItemCure_8009)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UseSpecialItemCure_8009 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UseSpecialItemCure_8009)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UseSpecialItemCure_8009 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UseSpecialItemCure_8009)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UseSpecialItemCure_8009 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UseSpecialItemCure_8009)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UseSpecialItemCure_8009 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UseSpecialItemCure_8009)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UseSpecialItemCure_8009 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UseSpecialItemCure_8009)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UseSpecialItemCure_8009 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UseSpecialItemCure_8009 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UseSpecialItemCure_8009> parser() {
         return PARSER;
      }

      public Parser<S2C_UseSpecialItemCure_8009> getParserForType() {
         return PARSER;
      }

      public S2C_UseSpecialItemCure_8009 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UseSpecialItemCure_8009OrBuilder {
         private int bitField0_;
         private List<CommonMsg.MapDataIF> heroHp_;
         private RepeatedFieldBuilderV3<CommonMsg.MapDataIF, CommonMsg.MapDataIF.Builder, CommonMsg.MapDataIFOrBuilder> heroHpBuilder_;
         private int useCure_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_S2C_UseSpecialItemCure_8009_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_S2C_UseSpecialItemCure_8009_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UseSpecialItemCure_8009.class, Builder.class);
         }

         private Builder() {
            this.heroHp_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.heroHp_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.S2C_UseSpecialItemCure_8009.alwaysUseFieldBuilders) {
               this.getHeroHpFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.heroHpBuilder_ == null) {
               this.heroHp_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.heroHpBuilder_.clear();
            }

            this.useCure_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_S2C_UseSpecialItemCure_8009_descriptor;
         }

         public S2C_UseSpecialItemCure_8009 getDefaultInstanceForType() {
            return WarMsg.S2C_UseSpecialItemCure_8009.getDefaultInstance();
         }

         public S2C_UseSpecialItemCure_8009 build() {
            S2C_UseSpecialItemCure_8009 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UseSpecialItemCure_8009 buildPartial() {
            S2C_UseSpecialItemCure_8009 result = new S2C_UseSpecialItemCure_8009(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.heroHpBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.heroHp_ = Collections.unmodifiableList(this.heroHp_);
                  this.bitField0_ &= -2;
               }

               result.heroHp_ = this.heroHp_;
            } else {
               result.heroHp_ = this.heroHpBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               result.useCure_ = this.useCure_;
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
            if (other instanceof S2C_UseSpecialItemCure_8009) {
               return this.mergeFrom((S2C_UseSpecialItemCure_8009)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UseSpecialItemCure_8009 other) {
            if (other == WarMsg.S2C_UseSpecialItemCure_8009.getDefaultInstance()) {
               return this;
            } else {
               if (this.heroHpBuilder_ == null) {
                  if (!other.heroHp_.isEmpty()) {
                     if (this.heroHp_.isEmpty()) {
                        this.heroHp_ = other.heroHp_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureHeroHpIsMutable();
                        this.heroHp_.addAll(other.heroHp_);
                     }

                     this.onChanged();
                  }
               } else if (!other.heroHp_.isEmpty()) {
                  if (this.heroHpBuilder_.isEmpty()) {
                     this.heroHpBuilder_.dispose();
                     this.heroHpBuilder_ = null;
                     this.heroHp_ = other.heroHp_;
                     this.bitField0_ &= -2;
                     this.heroHpBuilder_ = WarMsg.S2C_UseSpecialItemCure_8009.alwaysUseFieldBuilders ? this.getHeroHpFieldBuilder() : null;
                  } else {
                     this.heroHpBuilder_.addAllMessages(other.heroHp_);
                  }
               }

               if (other.hasUseCure()) {
                  this.setUseCure(other.getUseCure());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasUseCure()) {
               return false;
            } else {
               for(int i = 0; i < this.getHeroHpCount(); ++i) {
                  if (!this.getHeroHp(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UseSpecialItemCure_8009 parsedMessage = null;

            try {
               parsedMessage = (S2C_UseSpecialItemCure_8009)WarMsg.S2C_UseSpecialItemCure_8009.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UseSpecialItemCure_8009)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureHeroHpIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.heroHp_ = new ArrayList(this.heroHp_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.MapDataIF> getHeroHpList() {
            return this.heroHpBuilder_ == null ? Collections.unmodifiableList(this.heroHp_) : this.heroHpBuilder_.getMessageList();
         }

         public int getHeroHpCount() {
            return this.heroHpBuilder_ == null ? this.heroHp_.size() : this.heroHpBuilder_.getCount();
         }

         public CommonMsg.MapDataIF getHeroHp(int index) {
            return this.heroHpBuilder_ == null ? (CommonMsg.MapDataIF)this.heroHp_.get(index) : (CommonMsg.MapDataIF)this.heroHpBuilder_.getMessage(index);
         }

         public Builder setHeroHp(int index, CommonMsg.MapDataIF value) {
            if (this.heroHpBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroHpIsMutable();
               this.heroHp_.set(index, value);
               this.onChanged();
            } else {
               this.heroHpBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setHeroHp(int index, CommonMsg.MapDataIF.Builder builderForValue) {
            if (this.heroHpBuilder_ == null) {
               this.ensureHeroHpIsMutable();
               this.heroHp_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroHpBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addHeroHp(CommonMsg.MapDataIF value) {
            if (this.heroHpBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroHpIsMutable();
               this.heroHp_.add(value);
               this.onChanged();
            } else {
               this.heroHpBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addHeroHp(int index, CommonMsg.MapDataIF value) {
            if (this.heroHpBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHeroHpIsMutable();
               this.heroHp_.add(index, value);
               this.onChanged();
            } else {
               this.heroHpBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addHeroHp(CommonMsg.MapDataIF.Builder builderForValue) {
            if (this.heroHpBuilder_ == null) {
               this.ensureHeroHpIsMutable();
               this.heroHp_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.heroHpBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addHeroHp(int index, CommonMsg.MapDataIF.Builder builderForValue) {
            if (this.heroHpBuilder_ == null) {
               this.ensureHeroHpIsMutable();
               this.heroHp_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.heroHpBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllHeroHp(Iterable<? extends CommonMsg.MapDataIF> values) {
            if (this.heroHpBuilder_ == null) {
               this.ensureHeroHpIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.heroHp_);
               this.onChanged();
            } else {
               this.heroHpBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearHeroHp() {
            if (this.heroHpBuilder_ == null) {
               this.heroHp_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.heroHpBuilder_.clear();
            }

            return this;
         }

         public Builder removeHeroHp(int index) {
            if (this.heroHpBuilder_ == null) {
               this.ensureHeroHpIsMutable();
               this.heroHp_.remove(index);
               this.onChanged();
            } else {
               this.heroHpBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.MapDataIF.Builder getHeroHpBuilder(int index) {
            return (CommonMsg.MapDataIF.Builder)this.getHeroHpFieldBuilder().getBuilder(index);
         }

         public CommonMsg.MapDataIFOrBuilder getHeroHpOrBuilder(int index) {
            return this.heroHpBuilder_ == null ? (CommonMsg.MapDataIFOrBuilder)this.heroHp_.get(index) : (CommonMsg.MapDataIFOrBuilder)this.heroHpBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.MapDataIFOrBuilder> getHeroHpOrBuilderList() {
            return this.heroHpBuilder_ != null ? this.heroHpBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.heroHp_);
         }

         public CommonMsg.MapDataIF.Builder addHeroHpBuilder() {
            return (CommonMsg.MapDataIF.Builder)this.getHeroHpFieldBuilder().addBuilder(CommonMsg.MapDataIF.getDefaultInstance());
         }

         public CommonMsg.MapDataIF.Builder addHeroHpBuilder(int index) {
            return (CommonMsg.MapDataIF.Builder)this.getHeroHpFieldBuilder().addBuilder(index, CommonMsg.MapDataIF.getDefaultInstance());
         }

         public List<CommonMsg.MapDataIF.Builder> getHeroHpBuilderList() {
            return this.getHeroHpFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.MapDataIF, CommonMsg.MapDataIF.Builder, CommonMsg.MapDataIFOrBuilder> getHeroHpFieldBuilder() {
            if (this.heroHpBuilder_ == null) {
               this.heroHpBuilder_ = new RepeatedFieldBuilderV3(this.heroHp_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.heroHp_ = null;
            }

            return this.heroHpBuilder_;
         }

         public boolean hasUseCure() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getUseCure() {
            return this.useCure_;
         }

         public Builder setUseCure(int value) {
            this.bitField0_ |= 2;
            this.useCure_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUseCure() {
            this.bitField0_ &= -3;
            this.useCure_ = 0;
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

   public static final class C2S_UseSpecialItemPoison_8010 extends GeneratedMessageV3 implements C2S_UseSpecialItemPoison_8010OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FORT_FIELD_NUMBER = 1;
      private int fort_;
      public static final int AUTOFINISH_FIELD_NUMBER = 2;
      private boolean autoFinish_;
      private byte memoizedIsInitialized;
      private static final C2S_UseSpecialItemPoison_8010 DEFAULT_INSTANCE = new C2S_UseSpecialItemPoison_8010();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UseSpecialItemPoison_8010> PARSER = new AbstractParser<C2S_UseSpecialItemPoison_8010>() {
         public C2S_UseSpecialItemPoison_8010 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UseSpecialItemPoison_8010(input, extensionRegistry);
         }
      };

      private C2S_UseSpecialItemPoison_8010(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UseSpecialItemPoison_8010() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UseSpecialItemPoison_8010();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UseSpecialItemPoison_8010(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.fort_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.autoFinish_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WarMsg.internal_static_War_C2S_UseSpecialItemPoison_8010_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_C2S_UseSpecialItemPoison_8010_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UseSpecialItemPoison_8010.class, Builder.class);
      }

      public boolean hasFort() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFort() {
         return this.fort_;
      }

      public boolean hasAutoFinish() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getAutoFinish() {
         return this.autoFinish_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFort()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.fort_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.autoFinish_);
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
               size += CodedOutputStream.computeInt32Size(1, this.fort_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.autoFinish_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_UseSpecialItemPoison_8010)) {
            return super.equals(obj);
         } else {
            C2S_UseSpecialItemPoison_8010 other = (C2S_UseSpecialItemPoison_8010)obj;
            if (this.hasFort() != other.hasFort()) {
               return false;
            } else if (this.hasFort() && this.getFort() != other.getFort()) {
               return false;
            } else if (this.hasAutoFinish() != other.hasAutoFinish()) {
               return false;
            } else if (this.hasAutoFinish() && this.getAutoFinish() != other.getAutoFinish()) {
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
            if (this.hasFort()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFort();
            }

            if (this.hasAutoFinish()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getAutoFinish());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_UseSpecialItemPoison_8010 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UseSpecialItemPoison_8010)PARSER.parseFrom(data);
      }

      public static C2S_UseSpecialItemPoison_8010 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UseSpecialItemPoison_8010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UseSpecialItemPoison_8010 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UseSpecialItemPoison_8010)PARSER.parseFrom(data);
      }

      public static C2S_UseSpecialItemPoison_8010 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UseSpecialItemPoison_8010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UseSpecialItemPoison_8010 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UseSpecialItemPoison_8010)PARSER.parseFrom(data);
      }

      public static C2S_UseSpecialItemPoison_8010 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UseSpecialItemPoison_8010)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UseSpecialItemPoison_8010 parseFrom(InputStream input) throws IOException {
         return (C2S_UseSpecialItemPoison_8010)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UseSpecialItemPoison_8010 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UseSpecialItemPoison_8010)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UseSpecialItemPoison_8010 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UseSpecialItemPoison_8010)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UseSpecialItemPoison_8010 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UseSpecialItemPoison_8010)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UseSpecialItemPoison_8010 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UseSpecialItemPoison_8010)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UseSpecialItemPoison_8010 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UseSpecialItemPoison_8010)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UseSpecialItemPoison_8010 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UseSpecialItemPoison_8010 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UseSpecialItemPoison_8010> parser() {
         return PARSER;
      }

      public Parser<C2S_UseSpecialItemPoison_8010> getParserForType() {
         return PARSER;
      }

      public C2S_UseSpecialItemPoison_8010 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UseSpecialItemPoison_8010OrBuilder {
         private int bitField0_;
         private int fort_;
         private boolean autoFinish_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_C2S_UseSpecialItemPoison_8010_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_C2S_UseSpecialItemPoison_8010_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UseSpecialItemPoison_8010.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.C2S_UseSpecialItemPoison_8010.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.fort_ = 0;
            this.bitField0_ &= -2;
            this.autoFinish_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_C2S_UseSpecialItemPoison_8010_descriptor;
         }

         public C2S_UseSpecialItemPoison_8010 getDefaultInstanceForType() {
            return WarMsg.C2S_UseSpecialItemPoison_8010.getDefaultInstance();
         }

         public C2S_UseSpecialItemPoison_8010 build() {
            C2S_UseSpecialItemPoison_8010 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UseSpecialItemPoison_8010 buildPartial() {
            C2S_UseSpecialItemPoison_8010 result = new C2S_UseSpecialItemPoison_8010(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.fort_ = this.fort_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.autoFinish_ = this.autoFinish_;
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
            if (other instanceof C2S_UseSpecialItemPoison_8010) {
               return this.mergeFrom((C2S_UseSpecialItemPoison_8010)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UseSpecialItemPoison_8010 other) {
            if (other == WarMsg.C2S_UseSpecialItemPoison_8010.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFort()) {
                  this.setFort(other.getFort());
               }

               if (other.hasAutoFinish()) {
                  this.setAutoFinish(other.getAutoFinish());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasFort();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_UseSpecialItemPoison_8010 parsedMessage = null;

            try {
               parsedMessage = (C2S_UseSpecialItemPoison_8010)WarMsg.C2S_UseSpecialItemPoison_8010.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UseSpecialItemPoison_8010)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFort() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFort() {
            return this.fort_;
         }

         public Builder setFort(int value) {
            this.bitField0_ |= 1;
            this.fort_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFort() {
            this.bitField0_ &= -2;
            this.fort_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasAutoFinish() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getAutoFinish() {
            return this.autoFinish_;
         }

         public Builder setAutoFinish(boolean value) {
            this.bitField0_ |= 2;
            this.autoFinish_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAutoFinish() {
            this.bitField0_ &= -3;
            this.autoFinish_ = false;
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

   public static final class C2S_UseSpecialItemShopMan_8011 extends GeneratedMessageV3 implements C2S_UseSpecialItemShopMan_8011OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      private byte memoizedIsInitialized;
      private static final C2S_UseSpecialItemShopMan_8011 DEFAULT_INSTANCE = new C2S_UseSpecialItemShopMan_8011();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_UseSpecialItemShopMan_8011> PARSER = new AbstractParser<C2S_UseSpecialItemShopMan_8011>() {
         public C2S_UseSpecialItemShopMan_8011 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_UseSpecialItemShopMan_8011(input, extensionRegistry);
         }
      };

      private C2S_UseSpecialItemShopMan_8011(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_UseSpecialItemShopMan_8011() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_UseSpecialItemShopMan_8011();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_UseSpecialItemShopMan_8011(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarMsg.internal_static_War_C2S_UseSpecialItemShopMan_8011_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_C2S_UseSpecialItemShopMan_8011_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UseSpecialItemShopMan_8011.class, Builder.class);
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
         } else if (!(obj instanceof C2S_UseSpecialItemShopMan_8011)) {
            return super.equals(obj);
         } else {
            C2S_UseSpecialItemShopMan_8011 other = (C2S_UseSpecialItemShopMan_8011)obj;
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

      public static C2S_UseSpecialItemShopMan_8011 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_UseSpecialItemShopMan_8011)PARSER.parseFrom(data);
      }

      public static C2S_UseSpecialItemShopMan_8011 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UseSpecialItemShopMan_8011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UseSpecialItemShopMan_8011 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_UseSpecialItemShopMan_8011)PARSER.parseFrom(data);
      }

      public static C2S_UseSpecialItemShopMan_8011 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UseSpecialItemShopMan_8011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UseSpecialItemShopMan_8011 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_UseSpecialItemShopMan_8011)PARSER.parseFrom(data);
      }

      public static C2S_UseSpecialItemShopMan_8011 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_UseSpecialItemShopMan_8011)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_UseSpecialItemShopMan_8011 parseFrom(InputStream input) throws IOException {
         return (C2S_UseSpecialItemShopMan_8011)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UseSpecialItemShopMan_8011 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UseSpecialItemShopMan_8011)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UseSpecialItemShopMan_8011 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_UseSpecialItemShopMan_8011)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_UseSpecialItemShopMan_8011 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UseSpecialItemShopMan_8011)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_UseSpecialItemShopMan_8011 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_UseSpecialItemShopMan_8011)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_UseSpecialItemShopMan_8011 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_UseSpecialItemShopMan_8011)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_UseSpecialItemShopMan_8011 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_UseSpecialItemShopMan_8011 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_UseSpecialItemShopMan_8011> parser() {
         return PARSER;
      }

      public Parser<C2S_UseSpecialItemShopMan_8011> getParserForType() {
         return PARSER;
      }

      public C2S_UseSpecialItemShopMan_8011 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_UseSpecialItemShopMan_8011OrBuilder {
         private int bitField0_;
         private int playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_C2S_UseSpecialItemShopMan_8011_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_C2S_UseSpecialItemShopMan_8011_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_UseSpecialItemShopMan_8011.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.C2S_UseSpecialItemShopMan_8011.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_C2S_UseSpecialItemShopMan_8011_descriptor;
         }

         public C2S_UseSpecialItemShopMan_8011 getDefaultInstanceForType() {
            return WarMsg.C2S_UseSpecialItemShopMan_8011.getDefaultInstance();
         }

         public C2S_UseSpecialItemShopMan_8011 build() {
            C2S_UseSpecialItemShopMan_8011 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_UseSpecialItemShopMan_8011 buildPartial() {
            C2S_UseSpecialItemShopMan_8011 result = new C2S_UseSpecialItemShopMan_8011(this);
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
            if (other instanceof C2S_UseSpecialItemShopMan_8011) {
               return this.mergeFrom((C2S_UseSpecialItemShopMan_8011)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_UseSpecialItemShopMan_8011 other) {
            if (other == WarMsg.C2S_UseSpecialItemShopMan_8011.getDefaultInstance()) {
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
            C2S_UseSpecialItemShopMan_8011 parsedMessage = null;

            try {
               parsedMessage = (C2S_UseSpecialItemShopMan_8011)WarMsg.C2S_UseSpecialItemShopMan_8011.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_UseSpecialItemShopMan_8011)e.getUnfinishedMessage();
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

   public static final class S2C_NewGoods_8012 extends GeneratedMessageV3 implements S2C_NewGoods_8012OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GOODS_FIELD_NUMBER = 1;
      private HLGoods goods_;
      private byte memoizedIsInitialized;
      private static final S2C_NewGoods_8012 DEFAULT_INSTANCE = new S2C_NewGoods_8012();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_NewGoods_8012> PARSER = new AbstractParser<S2C_NewGoods_8012>() {
         public S2C_NewGoods_8012 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_NewGoods_8012(input, extensionRegistry);
         }
      };

      private S2C_NewGoods_8012(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_NewGoods_8012() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_NewGoods_8012();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_NewGoods_8012(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        HLGoods.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.goods_.toBuilder();
                        }

                        this.goods_ = (HLGoods)input.readMessage(WarMsg.HLGoods.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.goods_);
                           this.goods_ = subBuilder.buildPartial();
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
         return WarMsg.internal_static_War_S2C_NewGoods_8012_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_S2C_NewGoods_8012_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NewGoods_8012.class, Builder.class);
      }

      public boolean hasGoods() {
         return (this.bitField0_ & 1) != 0;
      }

      public HLGoods getGoods() {
         return this.goods_ == null ? WarMsg.HLGoods.getDefaultInstance() : this.goods_;
      }

      public HLGoodsOrBuilder getGoodsOrBuilder() {
         return this.goods_ == null ? WarMsg.HLGoods.getDefaultInstance() : this.goods_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGoods()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getGoods().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getGoods());
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
               size += CodedOutputStream.computeMessageSize(1, this.getGoods());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_NewGoods_8012)) {
            return super.equals(obj);
         } else {
            S2C_NewGoods_8012 other = (S2C_NewGoods_8012)obj;
            if (this.hasGoods() != other.hasGoods()) {
               return false;
            } else if (this.hasGoods() && !this.getGoods().equals(other.getGoods())) {
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
            if (this.hasGoods()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGoods().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_NewGoods_8012 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_NewGoods_8012)PARSER.parseFrom(data);
      }

      public static S2C_NewGoods_8012 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewGoods_8012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewGoods_8012 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_NewGoods_8012)PARSER.parseFrom(data);
      }

      public static S2C_NewGoods_8012 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewGoods_8012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewGoods_8012 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_NewGoods_8012)PARSER.parseFrom(data);
      }

      public static S2C_NewGoods_8012 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_NewGoods_8012)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_NewGoods_8012 parseFrom(InputStream input) throws IOException {
         return (S2C_NewGoods_8012)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NewGoods_8012 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewGoods_8012)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NewGoods_8012 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_NewGoods_8012)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_NewGoods_8012 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewGoods_8012)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_NewGoods_8012 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_NewGoods_8012)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_NewGoods_8012 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_NewGoods_8012)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_NewGoods_8012 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_NewGoods_8012 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_NewGoods_8012> parser() {
         return PARSER;
      }

      public Parser<S2C_NewGoods_8012> getParserForType() {
         return PARSER;
      }

      public S2C_NewGoods_8012 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_NewGoods_8012OrBuilder {
         private int bitField0_;
         private HLGoods goods_;
         private SingleFieldBuilderV3<HLGoods, HLGoods.Builder, HLGoodsOrBuilder> goodsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_S2C_NewGoods_8012_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_S2C_NewGoods_8012_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_NewGoods_8012.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.S2C_NewGoods_8012.alwaysUseFieldBuilders) {
               this.getGoodsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.goodsBuilder_ == null) {
               this.goods_ = null;
            } else {
               this.goodsBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_S2C_NewGoods_8012_descriptor;
         }

         public S2C_NewGoods_8012 getDefaultInstanceForType() {
            return WarMsg.S2C_NewGoods_8012.getDefaultInstance();
         }

         public S2C_NewGoods_8012 build() {
            S2C_NewGoods_8012 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_NewGoods_8012 buildPartial() {
            S2C_NewGoods_8012 result = new S2C_NewGoods_8012(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.goodsBuilder_ == null) {
                  result.goods_ = this.goods_;
               } else {
                  result.goods_ = (HLGoods)this.goodsBuilder_.build();
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
            if (other instanceof S2C_NewGoods_8012) {
               return this.mergeFrom((S2C_NewGoods_8012)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_NewGoods_8012 other) {
            if (other == WarMsg.S2C_NewGoods_8012.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGoods()) {
                  this.mergeGoods(other.getGoods());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGoods()) {
               return false;
            } else {
               return this.getGoods().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_NewGoods_8012 parsedMessage = null;

            try {
               parsedMessage = (S2C_NewGoods_8012)WarMsg.S2C_NewGoods_8012.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_NewGoods_8012)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGoods() {
            return (this.bitField0_ & 1) != 0;
         }

         public HLGoods getGoods() {
            if (this.goodsBuilder_ == null) {
               return this.goods_ == null ? WarMsg.HLGoods.getDefaultInstance() : this.goods_;
            } else {
               return (HLGoods)this.goodsBuilder_.getMessage();
            }
         }

         public Builder setGoods(HLGoods value) {
            if (this.goodsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.goods_ = value;
               this.onChanged();
            } else {
               this.goodsBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setGoods(HLGoods.Builder builderForValue) {
            if (this.goodsBuilder_ == null) {
               this.goods_ = builderForValue.build();
               this.onChanged();
            } else {
               this.goodsBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeGoods(HLGoods value) {
            if (this.goodsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.goods_ != null && this.goods_ != WarMsg.HLGoods.getDefaultInstance()) {
                  this.goods_ = WarMsg.HLGoods.newBuilder(this.goods_).mergeFrom(value).buildPartial();
               } else {
                  this.goods_ = value;
               }

               this.onChanged();
            } else {
               this.goodsBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearGoods() {
            if (this.goodsBuilder_ == null) {
               this.goods_ = null;
               this.onChanged();
            } else {
               this.goodsBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public HLGoods.Builder getGoodsBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (HLGoods.Builder)this.getGoodsFieldBuilder().getBuilder();
         }

         public HLGoodsOrBuilder getGoodsOrBuilder() {
            if (this.goodsBuilder_ != null) {
               return (HLGoodsOrBuilder)this.goodsBuilder_.getMessageOrBuilder();
            } else {
               return this.goods_ == null ? WarMsg.HLGoods.getDefaultInstance() : this.goods_;
            }
         }

         private SingleFieldBuilderV3<HLGoods, HLGoods.Builder, HLGoodsOrBuilder> getGoodsFieldBuilder() {
            if (this.goodsBuilder_ == null) {
               this.goodsBuilder_ = new SingleFieldBuilderV3(this.getGoods(), this.getParentForChildren(), this.isClean());
               this.goods_ = null;
            }

            return this.goodsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_BuyMarchShopGoods_8013 extends GeneratedMessageV3 implements C2S_BuyMarchShopGoods_8013OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INDEX_FIELD_NUMBER = 1;
      private int index_;
      private byte memoizedIsInitialized;
      private static final C2S_BuyMarchShopGoods_8013 DEFAULT_INSTANCE = new C2S_BuyMarchShopGoods_8013();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BuyMarchShopGoods_8013> PARSER = new AbstractParser<C2S_BuyMarchShopGoods_8013>() {
         public C2S_BuyMarchShopGoods_8013 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BuyMarchShopGoods_8013(input, extensionRegistry);
         }
      };

      private C2S_BuyMarchShopGoods_8013(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BuyMarchShopGoods_8013() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BuyMarchShopGoods_8013();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BuyMarchShopGoods_8013(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.index_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WarMsg.internal_static_War_C2S_BuyMarchShopGoods_8013_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_C2S_BuyMarchShopGoods_8013_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyMarchShopGoods_8013.class, Builder.class);
      }

      public boolean hasIndex() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getIndex() {
         return this.index_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIndex()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.index_);
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
               size += CodedOutputStream.computeInt32Size(1, this.index_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_BuyMarchShopGoods_8013)) {
            return super.equals(obj);
         } else {
            C2S_BuyMarchShopGoods_8013 other = (C2S_BuyMarchShopGoods_8013)obj;
            if (this.hasIndex() != other.hasIndex()) {
               return false;
            } else if (this.hasIndex() && this.getIndex() != other.getIndex()) {
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
            if (this.hasIndex()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIndex();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_BuyMarchShopGoods_8013 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BuyMarchShopGoods_8013)PARSER.parseFrom(data);
      }

      public static C2S_BuyMarchShopGoods_8013 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyMarchShopGoods_8013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyMarchShopGoods_8013 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BuyMarchShopGoods_8013)PARSER.parseFrom(data);
      }

      public static C2S_BuyMarchShopGoods_8013 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyMarchShopGoods_8013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyMarchShopGoods_8013 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BuyMarchShopGoods_8013)PARSER.parseFrom(data);
      }

      public static C2S_BuyMarchShopGoods_8013 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyMarchShopGoods_8013)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyMarchShopGoods_8013 parseFrom(InputStream input) throws IOException {
         return (C2S_BuyMarchShopGoods_8013)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyMarchShopGoods_8013 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyMarchShopGoods_8013)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyMarchShopGoods_8013 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BuyMarchShopGoods_8013)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BuyMarchShopGoods_8013 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyMarchShopGoods_8013)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyMarchShopGoods_8013 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BuyMarchShopGoods_8013)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyMarchShopGoods_8013 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyMarchShopGoods_8013)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BuyMarchShopGoods_8013 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BuyMarchShopGoods_8013 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BuyMarchShopGoods_8013> parser() {
         return PARSER;
      }

      public Parser<C2S_BuyMarchShopGoods_8013> getParserForType() {
         return PARSER;
      }

      public C2S_BuyMarchShopGoods_8013 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BuyMarchShopGoods_8013OrBuilder {
         private int bitField0_;
         private int index_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_C2S_BuyMarchShopGoods_8013_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_C2S_BuyMarchShopGoods_8013_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyMarchShopGoods_8013.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.C2S_BuyMarchShopGoods_8013.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.index_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_C2S_BuyMarchShopGoods_8013_descriptor;
         }

         public C2S_BuyMarchShopGoods_8013 getDefaultInstanceForType() {
            return WarMsg.C2S_BuyMarchShopGoods_8013.getDefaultInstance();
         }

         public C2S_BuyMarchShopGoods_8013 build() {
            C2S_BuyMarchShopGoods_8013 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BuyMarchShopGoods_8013 buildPartial() {
            C2S_BuyMarchShopGoods_8013 result = new C2S_BuyMarchShopGoods_8013(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.index_ = this.index_;
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
            if (other instanceof C2S_BuyMarchShopGoods_8013) {
               return this.mergeFrom((C2S_BuyMarchShopGoods_8013)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BuyMarchShopGoods_8013 other) {
            if (other == WarMsg.C2S_BuyMarchShopGoods_8013.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIndex()) {
                  this.setIndex(other.getIndex());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasIndex();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_BuyMarchShopGoods_8013 parsedMessage = null;

            try {
               parsedMessage = (C2S_BuyMarchShopGoods_8013)WarMsg.C2S_BuyMarchShopGoods_8013.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BuyMarchShopGoods_8013)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIndex() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getIndex() {
            return this.index_;
         }

         public Builder setIndex(int value) {
            this.bitField0_ |= 1;
            this.index_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIndex() {
            this.bitField0_ &= -2;
            this.index_ = 0;
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

   public static final class S2C_BuyMarchShopGoods_8014 extends GeneratedMessageV3 implements S2C_BuyMarchShopGoods_8014OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GOODS_FIELD_NUMBER = 1;
      private HLGoods goods_;
      private byte memoizedIsInitialized;
      private static final S2C_BuyMarchShopGoods_8014 DEFAULT_INSTANCE = new S2C_BuyMarchShopGoods_8014();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BuyMarchShopGoods_8014> PARSER = new AbstractParser<S2C_BuyMarchShopGoods_8014>() {
         public S2C_BuyMarchShopGoods_8014 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BuyMarchShopGoods_8014(input, extensionRegistry);
         }
      };

      private S2C_BuyMarchShopGoods_8014(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BuyMarchShopGoods_8014() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BuyMarchShopGoods_8014();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BuyMarchShopGoods_8014(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        HLGoods.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.goods_.toBuilder();
                        }

                        this.goods_ = (HLGoods)input.readMessage(WarMsg.HLGoods.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.goods_);
                           this.goods_ = subBuilder.buildPartial();
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
         return WarMsg.internal_static_War_S2C_BuyMarchShopGoods_8014_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_S2C_BuyMarchShopGoods_8014_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BuyMarchShopGoods_8014.class, Builder.class);
      }

      public boolean hasGoods() {
         return (this.bitField0_ & 1) != 0;
      }

      public HLGoods getGoods() {
         return this.goods_ == null ? WarMsg.HLGoods.getDefaultInstance() : this.goods_;
      }

      public HLGoodsOrBuilder getGoodsOrBuilder() {
         return this.goods_ == null ? WarMsg.HLGoods.getDefaultInstance() : this.goods_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGoods()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getGoods().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getGoods());
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
               size += CodedOutputStream.computeMessageSize(1, this.getGoods());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BuyMarchShopGoods_8014)) {
            return super.equals(obj);
         } else {
            S2C_BuyMarchShopGoods_8014 other = (S2C_BuyMarchShopGoods_8014)obj;
            if (this.hasGoods() != other.hasGoods()) {
               return false;
            } else if (this.hasGoods() && !this.getGoods().equals(other.getGoods())) {
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
            if (this.hasGoods()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGoods().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BuyMarchShopGoods_8014 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BuyMarchShopGoods_8014)PARSER.parseFrom(data);
      }

      public static S2C_BuyMarchShopGoods_8014 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyMarchShopGoods_8014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyMarchShopGoods_8014 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BuyMarchShopGoods_8014)PARSER.parseFrom(data);
      }

      public static S2C_BuyMarchShopGoods_8014 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyMarchShopGoods_8014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyMarchShopGoods_8014 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BuyMarchShopGoods_8014)PARSER.parseFrom(data);
      }

      public static S2C_BuyMarchShopGoods_8014 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyMarchShopGoods_8014)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyMarchShopGoods_8014 parseFrom(InputStream input) throws IOException {
         return (S2C_BuyMarchShopGoods_8014)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BuyMarchShopGoods_8014 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyMarchShopGoods_8014)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BuyMarchShopGoods_8014 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BuyMarchShopGoods_8014)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BuyMarchShopGoods_8014 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyMarchShopGoods_8014)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BuyMarchShopGoods_8014 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BuyMarchShopGoods_8014)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BuyMarchShopGoods_8014 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyMarchShopGoods_8014)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BuyMarchShopGoods_8014 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BuyMarchShopGoods_8014 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BuyMarchShopGoods_8014> parser() {
         return PARSER;
      }

      public Parser<S2C_BuyMarchShopGoods_8014> getParserForType() {
         return PARSER;
      }

      public S2C_BuyMarchShopGoods_8014 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BuyMarchShopGoods_8014OrBuilder {
         private int bitField0_;
         private HLGoods goods_;
         private SingleFieldBuilderV3<HLGoods, HLGoods.Builder, HLGoodsOrBuilder> goodsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_S2C_BuyMarchShopGoods_8014_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_S2C_BuyMarchShopGoods_8014_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BuyMarchShopGoods_8014.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.S2C_BuyMarchShopGoods_8014.alwaysUseFieldBuilders) {
               this.getGoodsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.goodsBuilder_ == null) {
               this.goods_ = null;
            } else {
               this.goodsBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_S2C_BuyMarchShopGoods_8014_descriptor;
         }

         public S2C_BuyMarchShopGoods_8014 getDefaultInstanceForType() {
            return WarMsg.S2C_BuyMarchShopGoods_8014.getDefaultInstance();
         }

         public S2C_BuyMarchShopGoods_8014 build() {
            S2C_BuyMarchShopGoods_8014 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BuyMarchShopGoods_8014 buildPartial() {
            S2C_BuyMarchShopGoods_8014 result = new S2C_BuyMarchShopGoods_8014(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.goodsBuilder_ == null) {
                  result.goods_ = this.goods_;
               } else {
                  result.goods_ = (HLGoods)this.goodsBuilder_.build();
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
            if (other instanceof S2C_BuyMarchShopGoods_8014) {
               return this.mergeFrom((S2C_BuyMarchShopGoods_8014)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BuyMarchShopGoods_8014 other) {
            if (other == WarMsg.S2C_BuyMarchShopGoods_8014.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGoods()) {
                  this.mergeGoods(other.getGoods());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGoods()) {
               return false;
            } else {
               return this.getGoods().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BuyMarchShopGoods_8014 parsedMessage = null;

            try {
               parsedMessage = (S2C_BuyMarchShopGoods_8014)WarMsg.S2C_BuyMarchShopGoods_8014.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BuyMarchShopGoods_8014)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGoods() {
            return (this.bitField0_ & 1) != 0;
         }

         public HLGoods getGoods() {
            if (this.goodsBuilder_ == null) {
               return this.goods_ == null ? WarMsg.HLGoods.getDefaultInstance() : this.goods_;
            } else {
               return (HLGoods)this.goodsBuilder_.getMessage();
            }
         }

         public Builder setGoods(HLGoods value) {
            if (this.goodsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.goods_ = value;
               this.onChanged();
            } else {
               this.goodsBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setGoods(HLGoods.Builder builderForValue) {
            if (this.goodsBuilder_ == null) {
               this.goods_ = builderForValue.build();
               this.onChanged();
            } else {
               this.goodsBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeGoods(HLGoods value) {
            if (this.goodsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.goods_ != null && this.goods_ != WarMsg.HLGoods.getDefaultInstance()) {
                  this.goods_ = WarMsg.HLGoods.newBuilder(this.goods_).mergeFrom(value).buildPartial();
               } else {
                  this.goods_ = value;
               }

               this.onChanged();
            } else {
               this.goodsBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearGoods() {
            if (this.goodsBuilder_ == null) {
               this.goods_ = null;
               this.onChanged();
            } else {
               this.goodsBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public HLGoods.Builder getGoodsBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (HLGoods.Builder)this.getGoodsFieldBuilder().getBuilder();
         }

         public HLGoodsOrBuilder getGoodsOrBuilder() {
            if (this.goodsBuilder_ != null) {
               return (HLGoodsOrBuilder)this.goodsBuilder_.getMessageOrBuilder();
            } else {
               return this.goods_ == null ? WarMsg.HLGoods.getDefaultInstance() : this.goods_;
            }
         }

         private SingleFieldBuilderV3<HLGoods, HLGoods.Builder, HLGoodsOrBuilder> getGoodsFieldBuilder() {
            if (this.goodsBuilder_ == null) {
               this.goodsBuilder_ = new SingleFieldBuilderV3(this.getGoods(), this.getParentForChildren(), this.isClean());
               this.goods_ = null;
            }

            return this.goodsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_BuyPoison_8015 extends GeneratedMessageV3 implements C2S_BuyPoison_8015OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int NUM_FIELD_NUMBER = 1;
      private int num_;
      private byte memoizedIsInitialized;
      private static final C2S_BuyPoison_8015 DEFAULT_INSTANCE = new C2S_BuyPoison_8015();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BuyPoison_8015> PARSER = new AbstractParser<C2S_BuyPoison_8015>() {
         public C2S_BuyPoison_8015 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BuyPoison_8015(input, extensionRegistry);
         }
      };

      private C2S_BuyPoison_8015(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BuyPoison_8015() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BuyPoison_8015();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BuyPoison_8015(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WarMsg.internal_static_War_C2S_BuyPoison_8015_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_C2S_BuyPoison_8015_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyPoison_8015.class, Builder.class);
      }

      public boolean hasNum() {
         return (this.bitField0_ & 1) != 0;
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
            output.writeInt32(1, this.num_);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_BuyPoison_8015)) {
            return super.equals(obj);
         } else {
            C2S_BuyPoison_8015 other = (C2S_BuyPoison_8015)obj;
            if (this.hasNum() != other.hasNum()) {
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
            if (this.hasNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_BuyPoison_8015 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BuyPoison_8015)PARSER.parseFrom(data);
      }

      public static C2S_BuyPoison_8015 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyPoison_8015)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyPoison_8015 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BuyPoison_8015)PARSER.parseFrom(data);
      }

      public static C2S_BuyPoison_8015 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyPoison_8015)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyPoison_8015 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BuyPoison_8015)PARSER.parseFrom(data);
      }

      public static C2S_BuyPoison_8015 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyPoison_8015)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyPoison_8015 parseFrom(InputStream input) throws IOException {
         return (C2S_BuyPoison_8015)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyPoison_8015 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyPoison_8015)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyPoison_8015 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BuyPoison_8015)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BuyPoison_8015 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyPoison_8015)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyPoison_8015 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BuyPoison_8015)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyPoison_8015 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyPoison_8015)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BuyPoison_8015 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BuyPoison_8015 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BuyPoison_8015> parser() {
         return PARSER;
      }

      public Parser<C2S_BuyPoison_8015> getParserForType() {
         return PARSER;
      }

      public C2S_BuyPoison_8015 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BuyPoison_8015OrBuilder {
         private int bitField0_;
         private int num_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_C2S_BuyPoison_8015_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_C2S_BuyPoison_8015_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyPoison_8015.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.C2S_BuyPoison_8015.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.num_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_C2S_BuyPoison_8015_descriptor;
         }

         public C2S_BuyPoison_8015 getDefaultInstanceForType() {
            return WarMsg.C2S_BuyPoison_8015.getDefaultInstance();
         }

         public C2S_BuyPoison_8015 build() {
            C2S_BuyPoison_8015 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BuyPoison_8015 buildPartial() {
            C2S_BuyPoison_8015 result = new C2S_BuyPoison_8015(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.num_ = this.num_;
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
            if (other instanceof C2S_BuyPoison_8015) {
               return this.mergeFrom((C2S_BuyPoison_8015)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BuyPoison_8015 other) {
            if (other == WarMsg.C2S_BuyPoison_8015.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasNum()) {
                  this.setNum(other.getNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_BuyPoison_8015 parsedMessage = null;

            try {
               parsedMessage = (C2S_BuyPoison_8015)WarMsg.C2S_BuyPoison_8015.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BuyPoison_8015)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_GetPassReward_8016 extends GeneratedMessageV3 implements C2S_GetPassReward_8016OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_GetPassReward_8016 DEFAULT_INSTANCE = new C2S_GetPassReward_8016();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_GetPassReward_8016> PARSER = new AbstractParser<C2S_GetPassReward_8016>() {
         public C2S_GetPassReward_8016 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_GetPassReward_8016(input, extensionRegistry);
         }
      };

      private C2S_GetPassReward_8016(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_GetPassReward_8016() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_GetPassReward_8016();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_GetPassReward_8016(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarMsg.internal_static_War_C2S_GetPassReward_8016_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_C2S_GetPassReward_8016_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetPassReward_8016.class, Builder.class);
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
         } else if (!(obj instanceof C2S_GetPassReward_8016)) {
            return super.equals(obj);
         } else {
            C2S_GetPassReward_8016 other = (C2S_GetPassReward_8016)obj;
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

      public static C2S_GetPassReward_8016 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_GetPassReward_8016)PARSER.parseFrom(data);
      }

      public static C2S_GetPassReward_8016 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetPassReward_8016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetPassReward_8016 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_GetPassReward_8016)PARSER.parseFrom(data);
      }

      public static C2S_GetPassReward_8016 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetPassReward_8016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetPassReward_8016 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_GetPassReward_8016)PARSER.parseFrom(data);
      }

      public static C2S_GetPassReward_8016 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_GetPassReward_8016)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_GetPassReward_8016 parseFrom(InputStream input) throws IOException {
         return (C2S_GetPassReward_8016)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetPassReward_8016 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetPassReward_8016)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetPassReward_8016 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_GetPassReward_8016)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_GetPassReward_8016 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetPassReward_8016)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_GetPassReward_8016 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_GetPassReward_8016)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_GetPassReward_8016 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_GetPassReward_8016)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_GetPassReward_8016 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_GetPassReward_8016 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_GetPassReward_8016> parser() {
         return PARSER;
      }

      public Parser<C2S_GetPassReward_8016> getParserForType() {
         return PARSER;
      }

      public C2S_GetPassReward_8016 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_GetPassReward_8016OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_C2S_GetPassReward_8016_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_C2S_GetPassReward_8016_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_GetPassReward_8016.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.C2S_GetPassReward_8016.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_C2S_GetPassReward_8016_descriptor;
         }

         public C2S_GetPassReward_8016 getDefaultInstanceForType() {
            return WarMsg.C2S_GetPassReward_8016.getDefaultInstance();
         }

         public C2S_GetPassReward_8016 build() {
            C2S_GetPassReward_8016 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_GetPassReward_8016 buildPartial() {
            C2S_GetPassReward_8016 result = new C2S_GetPassReward_8016(this);
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
            if (other instanceof C2S_GetPassReward_8016) {
               return this.mergeFrom((C2S_GetPassReward_8016)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_GetPassReward_8016 other) {
            if (other == WarMsg.C2S_GetPassReward_8016.getDefaultInstance()) {
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
            C2S_GetPassReward_8016 parsedMessage = null;

            try {
               parsedMessage = (C2S_GetPassReward_8016)WarMsg.C2S_GetPassReward_8016.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_GetPassReward_8016)e.getUnfinishedMessage();
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

   public static final class S2C_TargetReward_8017 extends GeneratedMessageV3 implements S2C_TargetReward_8017OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int CROSSFORT_FIELD_NUMBER = 1;
      private Internal.IntList crossFort_;
      private byte memoizedIsInitialized;
      private static final S2C_TargetReward_8017 DEFAULT_INSTANCE = new S2C_TargetReward_8017();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TargetReward_8017> PARSER = new AbstractParser<S2C_TargetReward_8017>() {
         public S2C_TargetReward_8017 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TargetReward_8017(input, extensionRegistry);
         }
      };

      private S2C_TargetReward_8017(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TargetReward_8017() {
         this.memoizedIsInitialized = -1;
         this.crossFort_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TargetReward_8017();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TargetReward_8017(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.crossFort_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.crossFort_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.crossFort_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.crossFort_.addInt(input.readInt32());
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
                  this.crossFort_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WarMsg.internal_static_War_S2C_TargetReward_8017_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_S2C_TargetReward_8017_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TargetReward_8017.class, Builder.class);
      }

      public List<Integer> getCrossFortList() {
         return this.crossFort_;
      }

      public int getCrossFortCount() {
         return this.crossFort_.size();
      }

      public int getCrossFort(int index) {
         return this.crossFort_.getInt(index);
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
         for(int i = 0; i < this.crossFort_.size(); ++i) {
            output.writeInt32(1, this.crossFort_.getInt(i));
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

            for(int i = 0; i < this.crossFort_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.crossFort_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getCrossFortList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TargetReward_8017)) {
            return super.equals(obj);
         } else {
            S2C_TargetReward_8017 other = (S2C_TargetReward_8017)obj;
            if (!this.getCrossFortList().equals(other.getCrossFortList())) {
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
            if (this.getCrossFortCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCrossFortList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TargetReward_8017 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TargetReward_8017)PARSER.parseFrom(data);
      }

      public static S2C_TargetReward_8017 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TargetReward_8017)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TargetReward_8017 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TargetReward_8017)PARSER.parseFrom(data);
      }

      public static S2C_TargetReward_8017 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TargetReward_8017)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TargetReward_8017 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TargetReward_8017)PARSER.parseFrom(data);
      }

      public static S2C_TargetReward_8017 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TargetReward_8017)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TargetReward_8017 parseFrom(InputStream input) throws IOException {
         return (S2C_TargetReward_8017)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TargetReward_8017 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TargetReward_8017)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TargetReward_8017 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TargetReward_8017)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TargetReward_8017 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TargetReward_8017)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TargetReward_8017 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TargetReward_8017)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TargetReward_8017 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TargetReward_8017)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TargetReward_8017 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TargetReward_8017 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TargetReward_8017> parser() {
         return PARSER;
      }

      public Parser<S2C_TargetReward_8017> getParserForType() {
         return PARSER;
      }

      public S2C_TargetReward_8017 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TargetReward_8017OrBuilder {
         private int bitField0_;
         private Internal.IntList crossFort_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_S2C_TargetReward_8017_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_S2C_TargetReward_8017_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TargetReward_8017.class, Builder.class);
         }

         private Builder() {
            this.crossFort_ = WarMsg.S2C_TargetReward_8017.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.crossFort_ = WarMsg.S2C_TargetReward_8017.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.S2C_TargetReward_8017.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.crossFort_ = WarMsg.S2C_TargetReward_8017.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_S2C_TargetReward_8017_descriptor;
         }

         public S2C_TargetReward_8017 getDefaultInstanceForType() {
            return WarMsg.S2C_TargetReward_8017.getDefaultInstance();
         }

         public S2C_TargetReward_8017 build() {
            S2C_TargetReward_8017 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TargetReward_8017 buildPartial() {
            S2C_TargetReward_8017 result = new S2C_TargetReward_8017(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.crossFort_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.crossFort_ = this.crossFort_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_TargetReward_8017) {
               return this.mergeFrom((S2C_TargetReward_8017)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TargetReward_8017 other) {
            if (other == WarMsg.S2C_TargetReward_8017.getDefaultInstance()) {
               return this;
            } else {
               if (!other.crossFort_.isEmpty()) {
                  if (this.crossFort_.isEmpty()) {
                     this.crossFort_ = other.crossFort_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureCrossFortIsMutable();
                     this.crossFort_.addAll(other.crossFort_);
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
            S2C_TargetReward_8017 parsedMessage = null;

            try {
               parsedMessage = (S2C_TargetReward_8017)WarMsg.S2C_TargetReward_8017.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TargetReward_8017)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureCrossFortIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.crossFort_ = WarMsg.S2C_TargetReward_8017.mutableCopy(this.crossFort_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getCrossFortList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.crossFort_) : this.crossFort_);
         }

         public int getCrossFortCount() {
            return this.crossFort_.size();
         }

         public int getCrossFort(int index) {
            return this.crossFort_.getInt(index);
         }

         public Builder setCrossFort(int index, int value) {
            this.ensureCrossFortIsMutable();
            this.crossFort_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addCrossFort(int value) {
            this.ensureCrossFortIsMutable();
            this.crossFort_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllCrossFort(Iterable<? extends Integer> values) {
            this.ensureCrossFortIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.crossFort_);
            this.onChanged();
            return this;
         }

         public Builder clearCrossFort() {
            this.crossFort_ = WarMsg.S2C_TargetReward_8017.emptyIntList();
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

   public static final class C2S_OpenBox_8018 extends GeneratedMessageV3 implements C2S_OpenBox_8018OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POS_FIELD_NUMBER = 1;
      private int pos_;
      private byte memoizedIsInitialized;
      private static final C2S_OpenBox_8018 DEFAULT_INSTANCE = new C2S_OpenBox_8018();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenBox_8018> PARSER = new AbstractParser<C2S_OpenBox_8018>() {
         public C2S_OpenBox_8018 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenBox_8018(input, extensionRegistry);
         }
      };

      private C2S_OpenBox_8018(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenBox_8018() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenBox_8018();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenBox_8018(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.pos_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WarMsg.internal_static_War_C2S_OpenBox_8018_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_C2S_OpenBox_8018_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenBox_8018.class, Builder.class);
      }

      public boolean hasPos() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPos() {
         return this.pos_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
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
            output.writeInt32(1, this.pos_);
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
               size += CodedOutputStream.computeInt32Size(1, this.pos_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_OpenBox_8018)) {
            return super.equals(obj);
         } else {
            C2S_OpenBox_8018 other = (C2S_OpenBox_8018)obj;
            if (this.hasPos() != other.hasPos()) {
               return false;
            } else if (this.hasPos() && this.getPos() != other.getPos()) {
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
            if (this.hasPos()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPos();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_OpenBox_8018 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenBox_8018)PARSER.parseFrom(data);
      }

      public static C2S_OpenBox_8018 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenBox_8018)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenBox_8018 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenBox_8018)PARSER.parseFrom(data);
      }

      public static C2S_OpenBox_8018 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenBox_8018)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenBox_8018 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenBox_8018)PARSER.parseFrom(data);
      }

      public static C2S_OpenBox_8018 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenBox_8018)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenBox_8018 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenBox_8018)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenBox_8018 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenBox_8018)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenBox_8018 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenBox_8018)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenBox_8018 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenBox_8018)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenBox_8018 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenBox_8018)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenBox_8018 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenBox_8018)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenBox_8018 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenBox_8018 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenBox_8018> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenBox_8018> getParserForType() {
         return PARSER;
      }

      public C2S_OpenBox_8018 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenBox_8018OrBuilder {
         private int bitField0_;
         private int pos_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_C2S_OpenBox_8018_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_C2S_OpenBox_8018_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenBox_8018.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.C2S_OpenBox_8018.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.pos_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_C2S_OpenBox_8018_descriptor;
         }

         public C2S_OpenBox_8018 getDefaultInstanceForType() {
            return WarMsg.C2S_OpenBox_8018.getDefaultInstance();
         }

         public C2S_OpenBox_8018 build() {
            C2S_OpenBox_8018 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenBox_8018 buildPartial() {
            C2S_OpenBox_8018 result = new C2S_OpenBox_8018(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.pos_ = this.pos_;
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
            if (other instanceof C2S_OpenBox_8018) {
               return this.mergeFrom((C2S_OpenBox_8018)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenBox_8018 other) {
            if (other == WarMsg.C2S_OpenBox_8018.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPos()) {
                  this.setPos(other.getPos());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasPos();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_OpenBox_8018 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenBox_8018)WarMsg.C2S_OpenBox_8018.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenBox_8018)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPos() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPos() {
            return this.pos_;
         }

         public Builder setPos(int value) {
            this.bitField0_ |= 1;
            this.pos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPos() {
            this.bitField0_ &= -2;
            this.pos_ = 0;
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

   public static final class C2S_EnterNextFloor_8019 extends GeneratedMessageV3 implements C2S_EnterNextFloor_8019OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      private byte memoizedIsInitialized;
      private static final C2S_EnterNextFloor_8019 DEFAULT_INSTANCE = new C2S_EnterNextFloor_8019();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_EnterNextFloor_8019> PARSER = new AbstractParser<C2S_EnterNextFloor_8019>() {
         public C2S_EnterNextFloor_8019 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_EnterNextFloor_8019(input, extensionRegistry);
         }
      };

      private C2S_EnterNextFloor_8019(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_EnterNextFloor_8019() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_EnterNextFloor_8019();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_EnterNextFloor_8019(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarMsg.internal_static_War_C2S_EnterNextFloor_8019_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_C2S_EnterNextFloor_8019_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnterNextFloor_8019.class, Builder.class);
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
         } else if (!(obj instanceof C2S_EnterNextFloor_8019)) {
            return super.equals(obj);
         } else {
            C2S_EnterNextFloor_8019 other = (C2S_EnterNextFloor_8019)obj;
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

      public static C2S_EnterNextFloor_8019 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_EnterNextFloor_8019)PARSER.parseFrom(data);
      }

      public static C2S_EnterNextFloor_8019 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnterNextFloor_8019)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnterNextFloor_8019 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_EnterNextFloor_8019)PARSER.parseFrom(data);
      }

      public static C2S_EnterNextFloor_8019 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnterNextFloor_8019)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnterNextFloor_8019 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_EnterNextFloor_8019)PARSER.parseFrom(data);
      }

      public static C2S_EnterNextFloor_8019 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnterNextFloor_8019)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnterNextFloor_8019 parseFrom(InputStream input) throws IOException {
         return (C2S_EnterNextFloor_8019)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnterNextFloor_8019 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnterNextFloor_8019)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnterNextFloor_8019 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_EnterNextFloor_8019)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_EnterNextFloor_8019 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnterNextFloor_8019)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnterNextFloor_8019 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_EnterNextFloor_8019)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnterNextFloor_8019 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnterNextFloor_8019)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_EnterNextFloor_8019 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_EnterNextFloor_8019 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_EnterNextFloor_8019> parser() {
         return PARSER;
      }

      public Parser<C2S_EnterNextFloor_8019> getParserForType() {
         return PARSER;
      }

      public C2S_EnterNextFloor_8019 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_EnterNextFloor_8019OrBuilder {
         private int bitField0_;
         private int playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_C2S_EnterNextFloor_8019_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_C2S_EnterNextFloor_8019_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnterNextFloor_8019.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.C2S_EnterNextFloor_8019.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_C2S_EnterNextFloor_8019_descriptor;
         }

         public C2S_EnterNextFloor_8019 getDefaultInstanceForType() {
            return WarMsg.C2S_EnterNextFloor_8019.getDefaultInstance();
         }

         public C2S_EnterNextFloor_8019 build() {
            C2S_EnterNextFloor_8019 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_EnterNextFloor_8019 buildPartial() {
            C2S_EnterNextFloor_8019 result = new C2S_EnterNextFloor_8019(this);
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
            if (other instanceof C2S_EnterNextFloor_8019) {
               return this.mergeFrom((C2S_EnterNextFloor_8019)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_EnterNextFloor_8019 other) {
            if (other == WarMsg.C2S_EnterNextFloor_8019.getDefaultInstance()) {
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
            C2S_EnterNextFloor_8019 parsedMessage = null;

            try {
               parsedMessage = (C2S_EnterNextFloor_8019)WarMsg.C2S_EnterNextFloor_8019.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_EnterNextFloor_8019)e.getUnfinishedMessage();
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

   public static final class S2C_AllRewards_8020 extends GeneratedMessageV3 implements S2C_AllRewards_8020OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int REWARD_FIELD_NUMBER = 1;
      private List<CommonMsg.ItemInfo> reward_;
      private byte memoizedIsInitialized;
      private static final S2C_AllRewards_8020 DEFAULT_INSTANCE = new S2C_AllRewards_8020();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AllRewards_8020> PARSER = new AbstractParser<S2C_AllRewards_8020>() {
         public S2C_AllRewards_8020 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AllRewards_8020(input, extensionRegistry);
         }
      };

      private S2C_AllRewards_8020(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AllRewards_8020() {
         this.memoizedIsInitialized = -1;
         this.reward_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AllRewards_8020();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AllRewards_8020(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                           this.reward_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.reward_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.reward_ = Collections.unmodifiableList(this.reward_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WarMsg.internal_static_War_S2C_AllRewards_8020_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_S2C_AllRewards_8020_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AllRewards_8020.class, Builder.class);
      }

      public List<CommonMsg.ItemInfo> getRewardList() {
         return this.reward_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getRewardOrBuilderList() {
         return this.reward_;
      }

      public int getRewardCount() {
         return this.reward_.size();
      }

      public CommonMsg.ItemInfo getReward(int index) {
         return (CommonMsg.ItemInfo)this.reward_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getRewardOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.reward_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getRewardCount(); ++i) {
               if (!this.getReward(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.reward_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.reward_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.reward_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.reward_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_AllRewards_8020)) {
            return super.equals(obj);
         } else {
            S2C_AllRewards_8020 other = (S2C_AllRewards_8020)obj;
            if (!this.getRewardList().equals(other.getRewardList())) {
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
            if (this.getRewardCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRewardList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_AllRewards_8020 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AllRewards_8020)PARSER.parseFrom(data);
      }

      public static S2C_AllRewards_8020 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AllRewards_8020)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AllRewards_8020 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AllRewards_8020)PARSER.parseFrom(data);
      }

      public static S2C_AllRewards_8020 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AllRewards_8020)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AllRewards_8020 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AllRewards_8020)PARSER.parseFrom(data);
      }

      public static S2C_AllRewards_8020 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AllRewards_8020)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AllRewards_8020 parseFrom(InputStream input) throws IOException {
         return (S2C_AllRewards_8020)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AllRewards_8020 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AllRewards_8020)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AllRewards_8020 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AllRewards_8020)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AllRewards_8020 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AllRewards_8020)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AllRewards_8020 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AllRewards_8020)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AllRewards_8020 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AllRewards_8020)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AllRewards_8020 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AllRewards_8020 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AllRewards_8020> parser() {
         return PARSER;
      }

      public Parser<S2C_AllRewards_8020> getParserForType() {
         return PARSER;
      }

      public S2C_AllRewards_8020 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AllRewards_8020OrBuilder {
         private int bitField0_;
         private List<CommonMsg.ItemInfo> reward_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> rewardBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_S2C_AllRewards_8020_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_S2C_AllRewards_8020_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AllRewards_8020.class, Builder.class);
         }

         private Builder() {
            this.reward_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.reward_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.S2C_AllRewards_8020.alwaysUseFieldBuilders) {
               this.getRewardFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.rewardBuilder_ == null) {
               this.reward_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.rewardBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_S2C_AllRewards_8020_descriptor;
         }

         public S2C_AllRewards_8020 getDefaultInstanceForType() {
            return WarMsg.S2C_AllRewards_8020.getDefaultInstance();
         }

         public S2C_AllRewards_8020 build() {
            S2C_AllRewards_8020 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AllRewards_8020 buildPartial() {
            S2C_AllRewards_8020 result = new S2C_AllRewards_8020(this);
            int from_bitField0_ = this.bitField0_;
            if (this.rewardBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.reward_ = Collections.unmodifiableList(this.reward_);
                  this.bitField0_ &= -2;
               }

               result.reward_ = this.reward_;
            } else {
               result.reward_ = this.rewardBuilder_.build();
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
            if (other instanceof S2C_AllRewards_8020) {
               return this.mergeFrom((S2C_AllRewards_8020)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AllRewards_8020 other) {
            if (other == WarMsg.S2C_AllRewards_8020.getDefaultInstance()) {
               return this;
            } else {
               if (this.rewardBuilder_ == null) {
                  if (!other.reward_.isEmpty()) {
                     if (this.reward_.isEmpty()) {
                        this.reward_ = other.reward_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureRewardIsMutable();
                        this.reward_.addAll(other.reward_);
                     }

                     this.onChanged();
                  }
               } else if (!other.reward_.isEmpty()) {
                  if (this.rewardBuilder_.isEmpty()) {
                     this.rewardBuilder_.dispose();
                     this.rewardBuilder_ = null;
                     this.reward_ = other.reward_;
                     this.bitField0_ &= -2;
                     this.rewardBuilder_ = WarMsg.S2C_AllRewards_8020.alwaysUseFieldBuilders ? this.getRewardFieldBuilder() : null;
                  } else {
                     this.rewardBuilder_.addAllMessages(other.reward_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getRewardCount(); ++i) {
               if (!this.getReward(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_AllRewards_8020 parsedMessage = null;

            try {
               parsedMessage = (S2C_AllRewards_8020)WarMsg.S2C_AllRewards_8020.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AllRewards_8020)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRewardIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.reward_ = new ArrayList(this.reward_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.ItemInfo> getRewardList() {
            return this.rewardBuilder_ == null ? Collections.unmodifiableList(this.reward_) : this.rewardBuilder_.getMessageList();
         }

         public int getRewardCount() {
            return this.rewardBuilder_ == null ? this.reward_.size() : this.rewardBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getReward(int index) {
            return this.rewardBuilder_ == null ? (CommonMsg.ItemInfo)this.reward_.get(index) : (CommonMsg.ItemInfo)this.rewardBuilder_.getMessage(index);
         }

         public Builder setReward(int index, CommonMsg.ItemInfo value) {
            if (this.rewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardIsMutable();
               this.reward_.set(index, value);
               this.onChanged();
            } else {
               this.rewardBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setReward(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addReward(CommonMsg.ItemInfo value) {
            if (this.rewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardIsMutable();
               this.reward_.add(value);
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addReward(int index, CommonMsg.ItemInfo value) {
            if (this.rewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRewardIsMutable();
               this.reward_.add(index, value);
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addReward(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addReward(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rewardBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllReward(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.reward_);
               this.onChanged();
            } else {
               this.rewardBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearReward() {
            if (this.rewardBuilder_ == null) {
               this.reward_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.rewardBuilder_.clear();
            }

            return this;
         }

         public Builder removeReward(int index) {
            if (this.rewardBuilder_ == null) {
               this.ensureRewardIsMutable();
               this.reward_.remove(index);
               this.onChanged();
            } else {
               this.rewardBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getRewardBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getRewardFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getRewardOrBuilder(int index) {
            return this.rewardBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.reward_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.rewardBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getRewardOrBuilderList() {
            return this.rewardBuilder_ != null ? this.rewardBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.reward_);
         }

         public CommonMsg.ItemInfo.Builder addRewardBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getRewardFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addRewardBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getRewardFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getRewardBuilderList() {
            return this.getRewardFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getRewardFieldBuilder() {
            if (this.rewardBuilder_ == null) {
               this.rewardBuilder_ = new RepeatedFieldBuilderV3(this.reward_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.reward_ = null;
            }

            return this.rewardBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_ChangePlayedHero_8021 extends GeneratedMessageV3 implements C2S_ChangePlayedHero_8021OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROPOS_FIELD_NUMBER = 1;
      private int heroPos_;
      private byte memoizedIsInitialized;
      private static final C2S_ChangePlayedHero_8021 DEFAULT_INSTANCE = new C2S_ChangePlayedHero_8021();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ChangePlayedHero_8021> PARSER = new AbstractParser<C2S_ChangePlayedHero_8021>() {
         public C2S_ChangePlayedHero_8021 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ChangePlayedHero_8021(input, extensionRegistry);
         }
      };

      private C2S_ChangePlayedHero_8021(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ChangePlayedHero_8021() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ChangePlayedHero_8021();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ChangePlayedHero_8021(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroPos_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WarMsg.internal_static_War_C2S_ChangePlayedHero_8021_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_C2S_ChangePlayedHero_8021_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChangePlayedHero_8021.class, Builder.class);
      }

      public boolean hasHeroPos() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroPos() {
         return this.heroPos_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroPos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroPos_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroPos_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ChangePlayedHero_8021)) {
            return super.equals(obj);
         } else {
            C2S_ChangePlayedHero_8021 other = (C2S_ChangePlayedHero_8021)obj;
            if (this.hasHeroPos() != other.hasHeroPos()) {
               return false;
            } else if (this.hasHeroPos() && this.getHeroPos() != other.getHeroPos()) {
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
            if (this.hasHeroPos()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroPos();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ChangePlayedHero_8021 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ChangePlayedHero_8021)PARSER.parseFrom(data);
      }

      public static C2S_ChangePlayedHero_8021 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChangePlayedHero_8021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChangePlayedHero_8021 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ChangePlayedHero_8021)PARSER.parseFrom(data);
      }

      public static C2S_ChangePlayedHero_8021 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChangePlayedHero_8021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChangePlayedHero_8021 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ChangePlayedHero_8021)PARSER.parseFrom(data);
      }

      public static C2S_ChangePlayedHero_8021 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChangePlayedHero_8021)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChangePlayedHero_8021 parseFrom(InputStream input) throws IOException {
         return (C2S_ChangePlayedHero_8021)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChangePlayedHero_8021 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChangePlayedHero_8021)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChangePlayedHero_8021 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ChangePlayedHero_8021)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ChangePlayedHero_8021 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChangePlayedHero_8021)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChangePlayedHero_8021 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ChangePlayedHero_8021)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChangePlayedHero_8021 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChangePlayedHero_8021)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ChangePlayedHero_8021 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ChangePlayedHero_8021 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ChangePlayedHero_8021> parser() {
         return PARSER;
      }

      public Parser<C2S_ChangePlayedHero_8021> getParserForType() {
         return PARSER;
      }

      public C2S_ChangePlayedHero_8021 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ChangePlayedHero_8021OrBuilder {
         private int bitField0_;
         private int heroPos_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_C2S_ChangePlayedHero_8021_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_C2S_ChangePlayedHero_8021_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChangePlayedHero_8021.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.C2S_ChangePlayedHero_8021.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroPos_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_C2S_ChangePlayedHero_8021_descriptor;
         }

         public C2S_ChangePlayedHero_8021 getDefaultInstanceForType() {
            return WarMsg.C2S_ChangePlayedHero_8021.getDefaultInstance();
         }

         public C2S_ChangePlayedHero_8021 build() {
            C2S_ChangePlayedHero_8021 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ChangePlayedHero_8021 buildPartial() {
            C2S_ChangePlayedHero_8021 result = new C2S_ChangePlayedHero_8021(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroPos_ = this.heroPos_;
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
            if (other instanceof C2S_ChangePlayedHero_8021) {
               return this.mergeFrom((C2S_ChangePlayedHero_8021)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ChangePlayedHero_8021 other) {
            if (other == WarMsg.C2S_ChangePlayedHero_8021.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroPos()) {
                  this.setHeroPos(other.getHeroPos());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasHeroPos();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ChangePlayedHero_8021 parsedMessage = null;

            try {
               parsedMessage = (C2S_ChangePlayedHero_8021)WarMsg.C2S_ChangePlayedHero_8021.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ChangePlayedHero_8021)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroPos() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroPos() {
            return this.heroPos_;
         }

         public Builder setHeroPos(int value) {
            this.bitField0_ |= 1;
            this.heroPos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroPos() {
            this.bitField0_ &= -2;
            this.heroPos_ = 0;
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

   public static final class S2C_ChangePlayedHero_8022 extends GeneratedMessageV3 implements S2C_ChangePlayedHero_8022OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROPOS_FIELD_NUMBER = 1;
      private int heroPos_;
      private byte memoizedIsInitialized;
      private static final S2C_ChangePlayedHero_8022 DEFAULT_INSTANCE = new S2C_ChangePlayedHero_8022();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ChangePlayedHero_8022> PARSER = new AbstractParser<S2C_ChangePlayedHero_8022>() {
         public S2C_ChangePlayedHero_8022 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ChangePlayedHero_8022(input, extensionRegistry);
         }
      };

      private S2C_ChangePlayedHero_8022(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ChangePlayedHero_8022() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ChangePlayedHero_8022();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ChangePlayedHero_8022(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.heroPos_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WarMsg.internal_static_War_S2C_ChangePlayedHero_8022_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_S2C_ChangePlayedHero_8022_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChangePlayedHero_8022.class, Builder.class);
      }

      public boolean hasHeroPos() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroPos() {
         return this.heroPos_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroPos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.heroPos_);
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
               size += CodedOutputStream.computeInt32Size(1, this.heroPos_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ChangePlayedHero_8022)) {
            return super.equals(obj);
         } else {
            S2C_ChangePlayedHero_8022 other = (S2C_ChangePlayedHero_8022)obj;
            if (this.hasHeroPos() != other.hasHeroPos()) {
               return false;
            } else if (this.hasHeroPos() && this.getHeroPos() != other.getHeroPos()) {
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
            if (this.hasHeroPos()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroPos();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ChangePlayedHero_8022 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ChangePlayedHero_8022)PARSER.parseFrom(data);
      }

      public static S2C_ChangePlayedHero_8022 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChangePlayedHero_8022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChangePlayedHero_8022 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ChangePlayedHero_8022)PARSER.parseFrom(data);
      }

      public static S2C_ChangePlayedHero_8022 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChangePlayedHero_8022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChangePlayedHero_8022 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ChangePlayedHero_8022)PARSER.parseFrom(data);
      }

      public static S2C_ChangePlayedHero_8022 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChangePlayedHero_8022)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChangePlayedHero_8022 parseFrom(InputStream input) throws IOException {
         return (S2C_ChangePlayedHero_8022)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChangePlayedHero_8022 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChangePlayedHero_8022)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChangePlayedHero_8022 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ChangePlayedHero_8022)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ChangePlayedHero_8022 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChangePlayedHero_8022)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChangePlayedHero_8022 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ChangePlayedHero_8022)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChangePlayedHero_8022 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChangePlayedHero_8022)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ChangePlayedHero_8022 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ChangePlayedHero_8022 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ChangePlayedHero_8022> parser() {
         return PARSER;
      }

      public Parser<S2C_ChangePlayedHero_8022> getParserForType() {
         return PARSER;
      }

      public S2C_ChangePlayedHero_8022 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ChangePlayedHero_8022OrBuilder {
         private int bitField0_;
         private int heroPos_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_S2C_ChangePlayedHero_8022_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_S2C_ChangePlayedHero_8022_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChangePlayedHero_8022.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.S2C_ChangePlayedHero_8022.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroPos_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_S2C_ChangePlayedHero_8022_descriptor;
         }

         public S2C_ChangePlayedHero_8022 getDefaultInstanceForType() {
            return WarMsg.S2C_ChangePlayedHero_8022.getDefaultInstance();
         }

         public S2C_ChangePlayedHero_8022 build() {
            S2C_ChangePlayedHero_8022 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ChangePlayedHero_8022 buildPartial() {
            S2C_ChangePlayedHero_8022 result = new S2C_ChangePlayedHero_8022(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroPos_ = this.heroPos_;
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
            if (other instanceof S2C_ChangePlayedHero_8022) {
               return this.mergeFrom((S2C_ChangePlayedHero_8022)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ChangePlayedHero_8022 other) {
            if (other == WarMsg.S2C_ChangePlayedHero_8022.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroPos()) {
                  this.setHeroPos(other.getHeroPos());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasHeroPos();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ChangePlayedHero_8022 parsedMessage = null;

            try {
               parsedMessage = (S2C_ChangePlayedHero_8022)WarMsg.S2C_ChangePlayedHero_8022.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ChangePlayedHero_8022)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroPos() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getHeroPos() {
            return this.heroPos_;
         }

         public Builder setHeroPos(int value) {
            this.bitField0_ |= 1;
            this.heroPos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroPos() {
            this.bitField0_ &= -2;
            this.heroPos_ = 0;
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

   public static final class C2S_LuckyGambling_8023 extends GeneratedMessageV3 implements C2S_LuckyGambling_8023OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LUCKYID_FIELD_NUMBER = 1;
      private int luckyId_;
      public static final int EVENTPOS_FIELD_NUMBER = 2;
      private int eventPos_;
      private byte memoizedIsInitialized;
      private static final C2S_LuckyGambling_8023 DEFAULT_INSTANCE = new C2S_LuckyGambling_8023();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LuckyGambling_8023> PARSER = new AbstractParser<C2S_LuckyGambling_8023>() {
         public C2S_LuckyGambling_8023 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LuckyGambling_8023(input, extensionRegistry);
         }
      };

      private C2S_LuckyGambling_8023(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LuckyGambling_8023() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LuckyGambling_8023();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LuckyGambling_8023(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.luckyId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.eventPos_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WarMsg.internal_static_War_C2S_LuckyGambling_8023_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_C2S_LuckyGambling_8023_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckyGambling_8023.class, Builder.class);
      }

      public boolean hasLuckyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getLuckyId() {
         return this.luckyId_;
      }

      public boolean hasEventPos() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEventPos() {
         return this.eventPos_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLuckyId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEventPos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.luckyId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.eventPos_);
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
               size += CodedOutputStream.computeInt32Size(1, this.luckyId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.eventPos_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_LuckyGambling_8023)) {
            return super.equals(obj);
         } else {
            C2S_LuckyGambling_8023 other = (C2S_LuckyGambling_8023)obj;
            if (this.hasLuckyId() != other.hasLuckyId()) {
               return false;
            } else if (this.hasLuckyId() && this.getLuckyId() != other.getLuckyId()) {
               return false;
            } else if (this.hasEventPos() != other.hasEventPos()) {
               return false;
            } else if (this.hasEventPos() && this.getEventPos() != other.getEventPos()) {
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
            if (this.hasLuckyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLuckyId();
            }

            if (this.hasEventPos()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEventPos();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_LuckyGambling_8023 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LuckyGambling_8023)PARSER.parseFrom(data);
      }

      public static C2S_LuckyGambling_8023 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckyGambling_8023)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckyGambling_8023 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LuckyGambling_8023)PARSER.parseFrom(data);
      }

      public static C2S_LuckyGambling_8023 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckyGambling_8023)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckyGambling_8023 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LuckyGambling_8023)PARSER.parseFrom(data);
      }

      public static C2S_LuckyGambling_8023 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckyGambling_8023)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckyGambling_8023 parseFrom(InputStream input) throws IOException {
         return (C2S_LuckyGambling_8023)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckyGambling_8023 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckyGambling_8023)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckyGambling_8023 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LuckyGambling_8023)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LuckyGambling_8023 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckyGambling_8023)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckyGambling_8023 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LuckyGambling_8023)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckyGambling_8023 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckyGambling_8023)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LuckyGambling_8023 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LuckyGambling_8023 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LuckyGambling_8023> parser() {
         return PARSER;
      }

      public Parser<C2S_LuckyGambling_8023> getParserForType() {
         return PARSER;
      }

      public C2S_LuckyGambling_8023 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LuckyGambling_8023OrBuilder {
         private int bitField0_;
         private int luckyId_;
         private int eventPos_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_C2S_LuckyGambling_8023_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_C2S_LuckyGambling_8023_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckyGambling_8023.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.C2S_LuckyGambling_8023.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.luckyId_ = 0;
            this.bitField0_ &= -2;
            this.eventPos_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_C2S_LuckyGambling_8023_descriptor;
         }

         public C2S_LuckyGambling_8023 getDefaultInstanceForType() {
            return WarMsg.C2S_LuckyGambling_8023.getDefaultInstance();
         }

         public C2S_LuckyGambling_8023 build() {
            C2S_LuckyGambling_8023 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LuckyGambling_8023 buildPartial() {
            C2S_LuckyGambling_8023 result = new C2S_LuckyGambling_8023(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.luckyId_ = this.luckyId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.eventPos_ = this.eventPos_;
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
            if (other instanceof C2S_LuckyGambling_8023) {
               return this.mergeFrom((C2S_LuckyGambling_8023)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LuckyGambling_8023 other) {
            if (other == WarMsg.C2S_LuckyGambling_8023.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLuckyId()) {
                  this.setLuckyId(other.getLuckyId());
               }

               if (other.hasEventPos()) {
                  this.setEventPos(other.getEventPos());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasLuckyId()) {
               return false;
            } else {
               return this.hasEventPos();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_LuckyGambling_8023 parsedMessage = null;

            try {
               parsedMessage = (C2S_LuckyGambling_8023)WarMsg.C2S_LuckyGambling_8023.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LuckyGambling_8023)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLuckyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getLuckyId() {
            return this.luckyId_;
         }

         public Builder setLuckyId(int value) {
            this.bitField0_ |= 1;
            this.luckyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLuckyId() {
            this.bitField0_ &= -2;
            this.luckyId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEventPos() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getEventPos() {
            return this.eventPos_;
         }

         public Builder setEventPos(int value) {
            this.bitField0_ |= 2;
            this.eventPos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEventPos() {
            this.bitField0_ &= -3;
            this.eventPos_ = 0;
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

   public static final class S2C_LuckyGambling_8024 extends GeneratedMessageV3 implements S2C_LuckyGambling_8024OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARDRATE_FIELD_NUMBER = 1;
      private int rewardRate_;
      public static final int EVENTPOS_FIELD_NUMBER = 2;
      private int eventPos_;
      public static final int LUCKID_FIELD_NUMBER = 3;
      private int luckId_;
      private byte memoizedIsInitialized;
      private static final S2C_LuckyGambling_8024 DEFAULT_INSTANCE = new S2C_LuckyGambling_8024();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LuckyGambling_8024> PARSER = new AbstractParser<S2C_LuckyGambling_8024>() {
         public S2C_LuckyGambling_8024 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LuckyGambling_8024(input, extensionRegistry);
         }
      };

      private S2C_LuckyGambling_8024(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LuckyGambling_8024() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LuckyGambling_8024();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LuckyGambling_8024(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.rewardRate_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.eventPos_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.luckId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WarMsg.internal_static_War_S2C_LuckyGambling_8024_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_S2C_LuckyGambling_8024_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckyGambling_8024.class, Builder.class);
      }

      public boolean hasRewardRate() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRewardRate() {
         return this.rewardRate_;
      }

      public boolean hasEventPos() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getEventPos() {
         return this.eventPos_;
      }

      public boolean hasLuckId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLuckId() {
         return this.luckId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRewardRate()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEventPos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLuckId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.rewardRate_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.eventPos_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.luckId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.rewardRate_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.eventPos_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.luckId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LuckyGambling_8024)) {
            return super.equals(obj);
         } else {
            S2C_LuckyGambling_8024 other = (S2C_LuckyGambling_8024)obj;
            if (this.hasRewardRate() != other.hasRewardRate()) {
               return false;
            } else if (this.hasRewardRate() && this.getRewardRate() != other.getRewardRate()) {
               return false;
            } else if (this.hasEventPos() != other.hasEventPos()) {
               return false;
            } else if (this.hasEventPos() && this.getEventPos() != other.getEventPos()) {
               return false;
            } else if (this.hasLuckId() != other.hasLuckId()) {
               return false;
            } else if (this.hasLuckId() && this.getLuckId() != other.getLuckId()) {
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
            if (this.hasRewardRate()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRewardRate();
            }

            if (this.hasEventPos()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getEventPos();
            }

            if (this.hasLuckId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLuckId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LuckyGambling_8024 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LuckyGambling_8024)PARSER.parseFrom(data);
      }

      public static S2C_LuckyGambling_8024 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckyGambling_8024)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckyGambling_8024 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LuckyGambling_8024)PARSER.parseFrom(data);
      }

      public static S2C_LuckyGambling_8024 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckyGambling_8024)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckyGambling_8024 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LuckyGambling_8024)PARSER.parseFrom(data);
      }

      public static S2C_LuckyGambling_8024 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckyGambling_8024)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckyGambling_8024 parseFrom(InputStream input) throws IOException {
         return (S2C_LuckyGambling_8024)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckyGambling_8024 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckyGambling_8024)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckyGambling_8024 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LuckyGambling_8024)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LuckyGambling_8024 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckyGambling_8024)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckyGambling_8024 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LuckyGambling_8024)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckyGambling_8024 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckyGambling_8024)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LuckyGambling_8024 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LuckyGambling_8024 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LuckyGambling_8024> parser() {
         return PARSER;
      }

      public Parser<S2C_LuckyGambling_8024> getParserForType() {
         return PARSER;
      }

      public S2C_LuckyGambling_8024 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LuckyGambling_8024OrBuilder {
         private int bitField0_;
         private int rewardRate_;
         private int eventPos_;
         private int luckId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_S2C_LuckyGambling_8024_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_S2C_LuckyGambling_8024_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckyGambling_8024.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.S2C_LuckyGambling_8024.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rewardRate_ = 0;
            this.bitField0_ &= -2;
            this.eventPos_ = 0;
            this.bitField0_ &= -3;
            this.luckId_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_S2C_LuckyGambling_8024_descriptor;
         }

         public S2C_LuckyGambling_8024 getDefaultInstanceForType() {
            return WarMsg.S2C_LuckyGambling_8024.getDefaultInstance();
         }

         public S2C_LuckyGambling_8024 build() {
            S2C_LuckyGambling_8024 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LuckyGambling_8024 buildPartial() {
            S2C_LuckyGambling_8024 result = new S2C_LuckyGambling_8024(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rewardRate_ = this.rewardRate_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.eventPos_ = this.eventPos_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.luckId_ = this.luckId_;
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
            if (other instanceof S2C_LuckyGambling_8024) {
               return this.mergeFrom((S2C_LuckyGambling_8024)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LuckyGambling_8024 other) {
            if (other == WarMsg.S2C_LuckyGambling_8024.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRewardRate()) {
                  this.setRewardRate(other.getRewardRate());
               }

               if (other.hasEventPos()) {
                  this.setEventPos(other.getEventPos());
               }

               if (other.hasLuckId()) {
                  this.setLuckId(other.getLuckId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRewardRate()) {
               return false;
            } else if (!this.hasEventPos()) {
               return false;
            } else {
               return this.hasLuckId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LuckyGambling_8024 parsedMessage = null;

            try {
               parsedMessage = (S2C_LuckyGambling_8024)WarMsg.S2C_LuckyGambling_8024.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LuckyGambling_8024)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRewardRate() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRewardRate() {
            return this.rewardRate_;
         }

         public Builder setRewardRate(int value) {
            this.bitField0_ |= 1;
            this.rewardRate_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardRate() {
            this.bitField0_ &= -2;
            this.rewardRate_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEventPos() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getEventPos() {
            return this.eventPos_;
         }

         public Builder setEventPos(int value) {
            this.bitField0_ |= 2;
            this.eventPos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEventPos() {
            this.bitField0_ &= -3;
            this.eventPos_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLuckId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getLuckId() {
            return this.luckId_;
         }

         public Builder setLuckId(int value) {
            this.bitField0_ |= 4;
            this.luckId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLuckId() {
            this.bitField0_ &= -5;
            this.luckId_ = 0;
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

   public static final class C2S_WarHLRank_8025 extends GeneratedMessageV3 implements C2S_WarHLRank_8025OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_WarHLRank_8025 DEFAULT_INSTANCE = new C2S_WarHLRank_8025();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_WarHLRank_8025> PARSER = new AbstractParser<C2S_WarHLRank_8025>() {
         public C2S_WarHLRank_8025 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_WarHLRank_8025(input, extensionRegistry);
         }
      };

      private C2S_WarHLRank_8025(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_WarHLRank_8025() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_WarHLRank_8025();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_WarHLRank_8025(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarMsg.internal_static_War_C2S_WarHLRank_8025_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_C2S_WarHLRank_8025_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarHLRank_8025.class, Builder.class);
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
         } else if (!(obj instanceof C2S_WarHLRank_8025)) {
            return super.equals(obj);
         } else {
            C2S_WarHLRank_8025 other = (C2S_WarHLRank_8025)obj;
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

      public static C2S_WarHLRank_8025 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_WarHLRank_8025)PARSER.parseFrom(data);
      }

      public static C2S_WarHLRank_8025 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarHLRank_8025)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarHLRank_8025 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_WarHLRank_8025)PARSER.parseFrom(data);
      }

      public static C2S_WarHLRank_8025 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarHLRank_8025)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarHLRank_8025 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_WarHLRank_8025)PARSER.parseFrom(data);
      }

      public static C2S_WarHLRank_8025 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_WarHLRank_8025)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_WarHLRank_8025 parseFrom(InputStream input) throws IOException {
         return (C2S_WarHLRank_8025)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarHLRank_8025 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarHLRank_8025)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarHLRank_8025 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_WarHLRank_8025)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_WarHLRank_8025 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarHLRank_8025)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_WarHLRank_8025 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_WarHLRank_8025)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_WarHLRank_8025 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_WarHLRank_8025)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_WarHLRank_8025 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_WarHLRank_8025 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_WarHLRank_8025> parser() {
         return PARSER;
      }

      public Parser<C2S_WarHLRank_8025> getParserForType() {
         return PARSER;
      }

      public C2S_WarHLRank_8025 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_WarHLRank_8025OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_C2S_WarHLRank_8025_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_C2S_WarHLRank_8025_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_WarHLRank_8025.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.C2S_WarHLRank_8025.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_C2S_WarHLRank_8025_descriptor;
         }

         public C2S_WarHLRank_8025 getDefaultInstanceForType() {
            return WarMsg.C2S_WarHLRank_8025.getDefaultInstance();
         }

         public C2S_WarHLRank_8025 build() {
            C2S_WarHLRank_8025 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_WarHLRank_8025 buildPartial() {
            C2S_WarHLRank_8025 result = new C2S_WarHLRank_8025(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_WarHLRank_8025) {
               return this.mergeFrom((C2S_WarHLRank_8025)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_WarHLRank_8025 other) {
            if (other == WarMsg.C2S_WarHLRank_8025.getDefaultInstance()) {
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
            C2S_WarHLRank_8025 parsedMessage = null;

            try {
               parsedMessage = (C2S_WarHLRank_8025)WarMsg.C2S_WarHLRank_8025.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_WarHLRank_8025)e.getUnfinishedMessage();
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

   public static final class S2C_WarHLRankResult_8026 extends GeneratedMessageV3 implements S2C_WarHLRankResult_8026OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MYRANK_FIELD_NUMBER = 1;
      private RankInfo myRank_;
      public static final int INFOS_FIELD_NUMBER = 2;
      private List<RankInfo> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_WarHLRankResult_8026 DEFAULT_INSTANCE = new S2C_WarHLRankResult_8026();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_WarHLRankResult_8026> PARSER = new AbstractParser<S2C_WarHLRankResult_8026>() {
         public S2C_WarHLRankResult_8026 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_WarHLRankResult_8026(input, extensionRegistry);
         }
      };

      private S2C_WarHLRankResult_8026(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_WarHLRankResult_8026() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_WarHLRankResult_8026();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_WarHLRankResult_8026(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        RankInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.myRank_.toBuilder();
                        }

                        this.myRank_ = (RankInfo)input.readMessage(WarMsg.RankInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.myRank_);
                           this.myRank_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.infos_.add(input.readMessage(WarMsg.RankInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.infos_ = Collections.unmodifiableList(this.infos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return WarMsg.internal_static_War_S2C_WarHLRankResult_8026_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_S2C_WarHLRankResult_8026_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarHLRankResult_8026.class, Builder.class);
      }

      public boolean hasMyRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public RankInfo getMyRank() {
         return this.myRank_ == null ? WarMsg.RankInfo.getDefaultInstance() : this.myRank_;
      }

      public RankInfoOrBuilder getMyRankOrBuilder() {
         return this.myRank_ == null ? WarMsg.RankInfo.getDefaultInstance() : this.myRank_;
      }

      public List<RankInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends RankInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public RankInfo getInfos(int index) {
         return (RankInfo)this.infos_.get(index);
      }

      public RankInfoOrBuilder getInfosOrBuilder(int index) {
         return (RankInfoOrBuilder)this.infos_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMyRank()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getMyRank().isInitialized()) {
            this.memoizedIsInitialized = 0;
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
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getMyRank());
         }

         for(int i = 0; i < this.infos_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.infos_.get(i));
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
               size += CodedOutputStream.computeMessageSize(1, this.getMyRank());
            }

            for(int i = 0; i < this.infos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.infos_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_WarHLRankResult_8026)) {
            return super.equals(obj);
         } else {
            S2C_WarHLRankResult_8026 other = (S2C_WarHLRankResult_8026)obj;
            if (this.hasMyRank() != other.hasMyRank()) {
               return false;
            } else if (this.hasMyRank() && !this.getMyRank().equals(other.getMyRank())) {
               return false;
            } else if (!this.getInfosList().equals(other.getInfosList())) {
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
            if (this.hasMyRank()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMyRank().hashCode();
            }

            if (this.getInfosCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getInfosList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_WarHLRankResult_8026 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_WarHLRankResult_8026)PARSER.parseFrom(data);
      }

      public static S2C_WarHLRankResult_8026 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarHLRankResult_8026)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarHLRankResult_8026 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_WarHLRankResult_8026)PARSER.parseFrom(data);
      }

      public static S2C_WarHLRankResult_8026 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarHLRankResult_8026)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarHLRankResult_8026 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_WarHLRankResult_8026)PARSER.parseFrom(data);
      }

      public static S2C_WarHLRankResult_8026 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_WarHLRankResult_8026)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_WarHLRankResult_8026 parseFrom(InputStream input) throws IOException {
         return (S2C_WarHLRankResult_8026)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarHLRankResult_8026 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarHLRankResult_8026)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarHLRankResult_8026 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_WarHLRankResult_8026)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_WarHLRankResult_8026 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarHLRankResult_8026)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_WarHLRankResult_8026 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_WarHLRankResult_8026)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_WarHLRankResult_8026 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_WarHLRankResult_8026)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_WarHLRankResult_8026 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_WarHLRankResult_8026 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_WarHLRankResult_8026> parser() {
         return PARSER;
      }

      public Parser<S2C_WarHLRankResult_8026> getParserForType() {
         return PARSER;
      }

      public S2C_WarHLRankResult_8026 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_WarHLRankResult_8026OrBuilder {
         private int bitField0_;
         private RankInfo myRank_;
         private SingleFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> myRankBuilder_;
         private List<RankInfo> infos_;
         private RepeatedFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_S2C_WarHLRankResult_8026_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_S2C_WarHLRankResult_8026_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_WarHLRankResult_8026.class, Builder.class);
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
            if (WarMsg.S2C_WarHLRankResult_8026.alwaysUseFieldBuilders) {
               this.getMyRankFieldBuilder();
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.myRankBuilder_ == null) {
               this.myRank_ = null;
            } else {
               this.myRankBuilder_.clear();
            }

            this.bitField0_ &= -2;
            if (this.infosBuilder_ == null) {
               this.infos_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.infosBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_S2C_WarHLRankResult_8026_descriptor;
         }

         public S2C_WarHLRankResult_8026 getDefaultInstanceForType() {
            return WarMsg.S2C_WarHLRankResult_8026.getDefaultInstance();
         }

         public S2C_WarHLRankResult_8026 build() {
            S2C_WarHLRankResult_8026 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_WarHLRankResult_8026 buildPartial() {
            S2C_WarHLRankResult_8026 result = new S2C_WarHLRankResult_8026(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.myRankBuilder_ == null) {
                  result.myRank_ = this.myRank_;
               } else {
                  result.myRank_ = (RankInfo)this.myRankBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if (this.infosBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.infos_ = Collections.unmodifiableList(this.infos_);
                  this.bitField0_ &= -3;
               }

               result.infos_ = this.infos_;
            } else {
               result.infos_ = this.infosBuilder_.build();
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
            if (other instanceof S2C_WarHLRankResult_8026) {
               return this.mergeFrom((S2C_WarHLRankResult_8026)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_WarHLRankResult_8026 other) {
            if (other == WarMsg.S2C_WarHLRankResult_8026.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMyRank()) {
                  this.mergeMyRank(other.getMyRank());
               }

               if (this.infosBuilder_ == null) {
                  if (!other.infos_.isEmpty()) {
                     if (this.infos_.isEmpty()) {
                        this.infos_ = other.infos_;
                        this.bitField0_ &= -3;
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
                     this.bitField0_ &= -3;
                     this.infosBuilder_ = WarMsg.S2C_WarHLRankResult_8026.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
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
            if (!this.hasMyRank()) {
               return false;
            } else if (!this.getMyRank().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getInfosCount(); ++i) {
                  if (!this.getInfos(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_WarHLRankResult_8026 parsedMessage = null;

            try {
               parsedMessage = (S2C_WarHLRankResult_8026)WarMsg.S2C_WarHLRankResult_8026.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_WarHLRankResult_8026)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMyRank() {
            return (this.bitField0_ & 1) != 0;
         }

         public RankInfo getMyRank() {
            if (this.myRankBuilder_ == null) {
               return this.myRank_ == null ? WarMsg.RankInfo.getDefaultInstance() : this.myRank_;
            } else {
               return (RankInfo)this.myRankBuilder_.getMessage();
            }
         }

         public Builder setMyRank(RankInfo value) {
            if (this.myRankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.myRank_ = value;
               this.onChanged();
            } else {
               this.myRankBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setMyRank(RankInfo.Builder builderForValue) {
            if (this.myRankBuilder_ == null) {
               this.myRank_ = builderForValue.build();
               this.onChanged();
            } else {
               this.myRankBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeMyRank(RankInfo value) {
            if (this.myRankBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.myRank_ != null && this.myRank_ != WarMsg.RankInfo.getDefaultInstance()) {
                  this.myRank_ = WarMsg.RankInfo.newBuilder(this.myRank_).mergeFrom(value).buildPartial();
               } else {
                  this.myRank_ = value;
               }

               this.onChanged();
            } else {
               this.myRankBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearMyRank() {
            if (this.myRankBuilder_ == null) {
               this.myRank_ = null;
               this.onChanged();
            } else {
               this.myRankBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public RankInfo.Builder getMyRankBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (RankInfo.Builder)this.getMyRankFieldBuilder().getBuilder();
         }

         public RankInfoOrBuilder getMyRankOrBuilder() {
            if (this.myRankBuilder_ != null) {
               return (RankInfoOrBuilder)this.myRankBuilder_.getMessageOrBuilder();
            } else {
               return this.myRank_ == null ? WarMsg.RankInfo.getDefaultInstance() : this.myRank_;
            }
         }

         private SingleFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> getMyRankFieldBuilder() {
            if (this.myRankBuilder_ == null) {
               this.myRankBuilder_ = new SingleFieldBuilderV3(this.getMyRank(), this.getParentForChildren(), this.isClean());
               this.myRank_ = null;
            }

            return this.myRankBuilder_;
         }

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 2;
            }

         }

         public List<RankInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public RankInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (RankInfo)this.infos_.get(index) : (RankInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, RankInfo value) {
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

         public Builder setInfos(int index, RankInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(RankInfo value) {
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

         public Builder addInfos(int index, RankInfo value) {
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

         public Builder addInfos(RankInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, RankInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends RankInfo> values) {
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
               this.bitField0_ &= -3;
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

         public RankInfo.Builder getInfosBuilder(int index) {
            return (RankInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public RankInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (RankInfoOrBuilder)this.infos_.get(index) : (RankInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public RankInfo.Builder addInfosBuilder() {
            return (RankInfo.Builder)this.getInfosFieldBuilder().addBuilder(WarMsg.RankInfo.getDefaultInstance());
         }

         public RankInfo.Builder addInfosBuilder(int index) {
            return (RankInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, WarMsg.RankInfo.getDefaultInstance());
         }

         public List<RankInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
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

   public static final class RankInfo extends GeneratedMessageV3 implements RankInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int LV_FIELD_NUMBER = 3;
      private int lv_;
      public static final int HEAD_FIELD_NUMBER = 4;
      private int head_;
      public static final int NAME_FIELD_NUMBER = 5;
      private volatile Object name_;
      public static final int MAXFLOOR_FIELD_NUMBER = 6;
      private int maxFloor_;
      public static final int POINT_FIELD_NUMBER = 7;
      private int point_;
      public static final int SERVERID_FIELD_NUMBER = 9;
      private int serverId_;
      private byte memoizedIsInitialized;
      private static final RankInfo DEFAULT_INSTANCE = new RankInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<RankInfo> PARSER = new AbstractParser<RankInfo>() {
         public RankInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RankInfo(input, extensionRegistry);
         }
      };

      private RankInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RankInfo() {
         this.memoizedIsInitialized = -1;
         this.name_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RankInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RankInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.playerId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.lv_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.head_ = input.readInt32();
                        break;
                     case 42:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 16;
                        this.name_ = bs;
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.maxFloor_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.point_ = input.readInt32();
                        break;
                     case 72:
                        this.bitField0_ |= 128;
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
         return WarMsg.internal_static_War_RankInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_RankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RankInfo.class, Builder.class);
      }

      public boolean hasRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasLv() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getLv() {
         return this.lv_;
      }

      public boolean hasHead() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getHead() {
         return this.head_;
      }

      public boolean hasName() {
         return (this.bitField0_ & 16) != 0;
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

      public boolean hasMaxFloor() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getMaxFloor() {
         return this.maxFloor_;
      }

      public boolean hasPoint() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getPoint() {
         return this.point_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 128) != 0;
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
         } else if (!this.hasRank()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHead()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMaxFloor()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPoint()) {
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
            output.writeInt32(1, this.rank_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.lv_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.head_);
         }

         if ((this.bitField0_ & 16) != 0) {
            GeneratedMessageV3.writeString(output, 5, this.name_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.maxFloor_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.point_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(9, this.serverId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.lv_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.head_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += GeneratedMessageV3.computeStringSize(5, this.name_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.maxFloor_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.point_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.serverId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RankInfo)) {
            return super.equals(obj);
         } else {
            RankInfo other = (RankInfo)obj;
            if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
               return false;
            } else if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else if (this.hasName() != other.hasName()) {
               return false;
            } else if (this.hasName() && !this.getName().equals(other.getName())) {
               return false;
            } else if (this.hasMaxFloor() != other.hasMaxFloor()) {
               return false;
            } else if (this.hasMaxFloor() && this.getMaxFloor() != other.getMaxFloor()) {
               return false;
            } else if (this.hasPoint() != other.hasPoint()) {
               return false;
            } else if (this.hasPoint() && this.getPoint() != other.getPoint()) {
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
            if (this.hasRank()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRank();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasLv()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLv();
            }

            if (this.hasHead()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasName()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getName().hashCode();
            }

            if (this.hasMaxFloor()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getMaxFloor();
            }

            if (this.hasPoint()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getPoint();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getServerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RankInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RankInfo)PARSER.parseFrom(data);
      }

      public static RankInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RankInfo)PARSER.parseFrom(data);
      }

      public static RankInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RankInfo)PARSER.parseFrom(data);
      }

      public static RankInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankInfo parseFrom(InputStream input) throws IOException {
         return (RankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RankInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RankInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (RankInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RankInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RankInfo parseFrom(CodedInputStream input) throws IOException {
         return (RankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RankInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RankInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RankInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RankInfo> parser() {
         return PARSER;
      }

      public Parser<RankInfo> getParserForType() {
         return PARSER;
      }

      public RankInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RankInfoOrBuilder {
         private int bitField0_;
         private int rank_;
         private int playerId_;
         private int lv_;
         private int head_;
         private Object name_;
         private int maxFloor_;
         private int point_;
         private int serverId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_RankInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_RankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RankInfo.class, Builder.class);
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
            if (WarMsg.RankInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.lv_ = 0;
            this.bitField0_ &= -5;
            this.head_ = 0;
            this.bitField0_ &= -9;
            this.name_ = "";
            this.bitField0_ &= -17;
            this.maxFloor_ = 0;
            this.bitField0_ &= -33;
            this.point_ = 0;
            this.bitField0_ &= -65;
            this.serverId_ = 0;
            this.bitField0_ &= -129;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_RankInfo_descriptor;
         }

         public RankInfo getDefaultInstanceForType() {
            return WarMsg.RankInfo.getDefaultInstance();
         }

         public RankInfo build() {
            RankInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RankInfo buildPartial() {
            RankInfo result = new RankInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.lv_ = this.lv_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.head_ = this.head_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               to_bitField0_ |= 16;
            }

            result.name_ = this.name_;
            if ((from_bitField0_ & 32) != 0) {
               result.maxFloor_ = this.maxFloor_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.point_ = this.point_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.serverId_ = this.serverId_;
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
            if (other instanceof RankInfo) {
               return this.mergeFrom((RankInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RankInfo other) {
            if (other == WarMsg.RankInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasName()) {
                  this.bitField0_ |= 16;
                  this.name_ = other.name_;
                  this.onChanged();
               }

               if (other.hasMaxFloor()) {
                  this.setMaxFloor(other.getMaxFloor());
               }

               if (other.hasPoint()) {
                  this.setPoint(other.getPoint());
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
            if (!this.hasRank()) {
               return false;
            } else if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasLv()) {
               return false;
            } else if (!this.hasHead()) {
               return false;
            } else if (!this.hasName()) {
               return false;
            } else if (!this.hasMaxFloor()) {
               return false;
            } else if (!this.hasPoint()) {
               return false;
            } else {
               return this.hasServerId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RankInfo parsedMessage = null;

            try {
               parsedMessage = (RankInfo)WarMsg.RankInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RankInfo)e.getUnfinishedMessage();
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

         public boolean hasHead() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getHead() {
            return this.head_;
         }

         public Builder setHead(int value) {
            this.bitField0_ |= 8;
            this.head_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHead() {
            this.bitField0_ &= -9;
            this.head_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasName() {
            return (this.bitField0_ & 16) != 0;
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
               this.bitField0_ |= 16;
               this.name_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearName() {
            this.bitField0_ &= -17;
            this.name_ = WarMsg.RankInfo.getDefaultInstance().getName();
            this.onChanged();
            return this;
         }

         public Builder setNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16;
               this.name_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasMaxFloor() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getMaxFloor() {
            return this.maxFloor_;
         }

         public Builder setMaxFloor(int value) {
            this.bitField0_ |= 32;
            this.maxFloor_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMaxFloor() {
            this.bitField0_ &= -33;
            this.maxFloor_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPoint() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getPoint() {
            return this.point_;
         }

         public Builder setPoint(int value) {
            this.bitField0_ |= 64;
            this.point_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPoint() {
            this.bitField0_ &= -65;
            this.point_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 128;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -129;
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

   public static final class C2S_ReceiveBoxKey_8027 extends GeneratedMessageV3 implements C2S_ReceiveBoxKey_8027OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int EVENTPOS_FIELD_NUMBER = 1;
      private int eventPos_;
      private byte memoizedIsInitialized;
      private static final C2S_ReceiveBoxKey_8027 DEFAULT_INSTANCE = new C2S_ReceiveBoxKey_8027();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ReceiveBoxKey_8027> PARSER = new AbstractParser<C2S_ReceiveBoxKey_8027>() {
         public C2S_ReceiveBoxKey_8027 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ReceiveBoxKey_8027(input, extensionRegistry);
         }
      };

      private C2S_ReceiveBoxKey_8027(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ReceiveBoxKey_8027() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ReceiveBoxKey_8027();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ReceiveBoxKey_8027(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.eventPos_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WarMsg.internal_static_War_C2S_ReceiveBoxKey_8027_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_C2S_ReceiveBoxKey_8027_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveBoxKey_8027.class, Builder.class);
      }

      public boolean hasEventPos() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getEventPos() {
         return this.eventPos_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasEventPos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.eventPos_);
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
               size += CodedOutputStream.computeInt32Size(1, this.eventPos_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_ReceiveBoxKey_8027)) {
            return super.equals(obj);
         } else {
            C2S_ReceiveBoxKey_8027 other = (C2S_ReceiveBoxKey_8027)obj;
            if (this.hasEventPos() != other.hasEventPos()) {
               return false;
            } else if (this.hasEventPos() && this.getEventPos() != other.getEventPos()) {
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
            if (this.hasEventPos()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getEventPos();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_ReceiveBoxKey_8027 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveBoxKey_8027)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveBoxKey_8027 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveBoxKey_8027)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveBoxKey_8027 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveBoxKey_8027)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveBoxKey_8027 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveBoxKey_8027)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveBoxKey_8027 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ReceiveBoxKey_8027)PARSER.parseFrom(data);
      }

      public static C2S_ReceiveBoxKey_8027 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ReceiveBoxKey_8027)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ReceiveBoxKey_8027 parseFrom(InputStream input) throws IOException {
         return (C2S_ReceiveBoxKey_8027)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveBoxKey_8027 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveBoxKey_8027)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveBoxKey_8027 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ReceiveBoxKey_8027)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ReceiveBoxKey_8027 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveBoxKey_8027)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ReceiveBoxKey_8027 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ReceiveBoxKey_8027)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ReceiveBoxKey_8027 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ReceiveBoxKey_8027)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ReceiveBoxKey_8027 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ReceiveBoxKey_8027 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ReceiveBoxKey_8027> parser() {
         return PARSER;
      }

      public Parser<C2S_ReceiveBoxKey_8027> getParserForType() {
         return PARSER;
      }

      public C2S_ReceiveBoxKey_8027 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ReceiveBoxKey_8027OrBuilder {
         private int bitField0_;
         private int eventPos_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_C2S_ReceiveBoxKey_8027_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_C2S_ReceiveBoxKey_8027_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ReceiveBoxKey_8027.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.C2S_ReceiveBoxKey_8027.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.eventPos_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_C2S_ReceiveBoxKey_8027_descriptor;
         }

         public C2S_ReceiveBoxKey_8027 getDefaultInstanceForType() {
            return WarMsg.C2S_ReceiveBoxKey_8027.getDefaultInstance();
         }

         public C2S_ReceiveBoxKey_8027 build() {
            C2S_ReceiveBoxKey_8027 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ReceiveBoxKey_8027 buildPartial() {
            C2S_ReceiveBoxKey_8027 result = new C2S_ReceiveBoxKey_8027(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.eventPos_ = this.eventPos_;
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
            if (other instanceof C2S_ReceiveBoxKey_8027) {
               return this.mergeFrom((C2S_ReceiveBoxKey_8027)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ReceiveBoxKey_8027 other) {
            if (other == WarMsg.C2S_ReceiveBoxKey_8027.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasEventPos()) {
                  this.setEventPos(other.getEventPos());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasEventPos();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_ReceiveBoxKey_8027 parsedMessage = null;

            try {
               parsedMessage = (C2S_ReceiveBoxKey_8027)WarMsg.C2S_ReceiveBoxKey_8027.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ReceiveBoxKey_8027)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasEventPos() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getEventPos() {
            return this.eventPos_;
         }

         public Builder setEventPos(int value) {
            this.bitField0_ |= 1;
            this.eventPos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEventPos() {
            this.bitField0_ &= -2;
            this.eventPos_ = 0;
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

   public static final class S2C_ReceiveBoxKey_8028 extends GeneratedMessageV3 implements S2C_ReceiveBoxKey_8028OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int EVENTPOS_FIELD_NUMBER = 1;
      private int eventPos_;
      private byte memoizedIsInitialized;
      private static final S2C_ReceiveBoxKey_8028 DEFAULT_INSTANCE = new S2C_ReceiveBoxKey_8028();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ReceiveBoxKey_8028> PARSER = new AbstractParser<S2C_ReceiveBoxKey_8028>() {
         public S2C_ReceiveBoxKey_8028 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ReceiveBoxKey_8028(input, extensionRegistry);
         }
      };

      private S2C_ReceiveBoxKey_8028(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ReceiveBoxKey_8028() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ReceiveBoxKey_8028();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ReceiveBoxKey_8028(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.eventPos_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WarMsg.internal_static_War_S2C_ReceiveBoxKey_8028_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_S2C_ReceiveBoxKey_8028_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveBoxKey_8028.class, Builder.class);
      }

      public boolean hasEventPos() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getEventPos() {
         return this.eventPos_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasEventPos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.eventPos_);
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
               size += CodedOutputStream.computeInt32Size(1, this.eventPos_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ReceiveBoxKey_8028)) {
            return super.equals(obj);
         } else {
            S2C_ReceiveBoxKey_8028 other = (S2C_ReceiveBoxKey_8028)obj;
            if (this.hasEventPos() != other.hasEventPos()) {
               return false;
            } else if (this.hasEventPos() && this.getEventPos() != other.getEventPos()) {
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
            if (this.hasEventPos()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getEventPos();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ReceiveBoxKey_8028 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveBoxKey_8028)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveBoxKey_8028 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveBoxKey_8028)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveBoxKey_8028 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveBoxKey_8028)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveBoxKey_8028 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveBoxKey_8028)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveBoxKey_8028 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ReceiveBoxKey_8028)PARSER.parseFrom(data);
      }

      public static S2C_ReceiveBoxKey_8028 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ReceiveBoxKey_8028)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ReceiveBoxKey_8028 parseFrom(InputStream input) throws IOException {
         return (S2C_ReceiveBoxKey_8028)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveBoxKey_8028 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveBoxKey_8028)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveBoxKey_8028 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ReceiveBoxKey_8028)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ReceiveBoxKey_8028 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveBoxKey_8028)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ReceiveBoxKey_8028 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ReceiveBoxKey_8028)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ReceiveBoxKey_8028 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ReceiveBoxKey_8028)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ReceiveBoxKey_8028 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ReceiveBoxKey_8028 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ReceiveBoxKey_8028> parser() {
         return PARSER;
      }

      public Parser<S2C_ReceiveBoxKey_8028> getParserForType() {
         return PARSER;
      }

      public S2C_ReceiveBoxKey_8028 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ReceiveBoxKey_8028OrBuilder {
         private int bitField0_;
         private int eventPos_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_S2C_ReceiveBoxKey_8028_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_S2C_ReceiveBoxKey_8028_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ReceiveBoxKey_8028.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.S2C_ReceiveBoxKey_8028.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.eventPos_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_S2C_ReceiveBoxKey_8028_descriptor;
         }

         public S2C_ReceiveBoxKey_8028 getDefaultInstanceForType() {
            return WarMsg.S2C_ReceiveBoxKey_8028.getDefaultInstance();
         }

         public S2C_ReceiveBoxKey_8028 build() {
            S2C_ReceiveBoxKey_8028 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ReceiveBoxKey_8028 buildPartial() {
            S2C_ReceiveBoxKey_8028 result = new S2C_ReceiveBoxKey_8028(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.eventPos_ = this.eventPos_;
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
            if (other instanceof S2C_ReceiveBoxKey_8028) {
               return this.mergeFrom((S2C_ReceiveBoxKey_8028)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ReceiveBoxKey_8028 other) {
            if (other == WarMsg.S2C_ReceiveBoxKey_8028.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasEventPos()) {
                  this.setEventPos(other.getEventPos());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasEventPos();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ReceiveBoxKey_8028 parsedMessage = null;

            try {
               parsedMessage = (S2C_ReceiveBoxKey_8028)WarMsg.S2C_ReceiveBoxKey_8028.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ReceiveBoxKey_8028)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasEventPos() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getEventPos() {
            return this.eventPos_;
         }

         public Builder setEventPos(int value) {
            this.bitField0_ |= 1;
            this.eventPos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEventPos() {
            this.bitField0_ &= -2;
            this.eventPos_ = 0;
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

   public static final class S2C_UsePoisonResult_8029 extends GeneratedMessageV3 implements S2C_UsePoisonResult_8029OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_UsePoisonResult_8029 DEFAULT_INSTANCE = new S2C_UsePoisonResult_8029();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UsePoisonResult_8029> PARSER = new AbstractParser<S2C_UsePoisonResult_8029>() {
         public S2C_UsePoisonResult_8029 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UsePoisonResult_8029(input, extensionRegistry);
         }
      };

      private S2C_UsePoisonResult_8029(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UsePoisonResult_8029() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UsePoisonResult_8029();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UsePoisonResult_8029(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarMsg.internal_static_War_S2C_UsePoisonResult_8029_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_S2C_UsePoisonResult_8029_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UsePoisonResult_8029.class, Builder.class);
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
         } else if (!(obj instanceof S2C_UsePoisonResult_8029)) {
            return super.equals(obj);
         } else {
            S2C_UsePoisonResult_8029 other = (S2C_UsePoisonResult_8029)obj;
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

      public static S2C_UsePoisonResult_8029 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UsePoisonResult_8029)PARSER.parseFrom(data);
      }

      public static S2C_UsePoisonResult_8029 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UsePoisonResult_8029)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UsePoisonResult_8029 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UsePoisonResult_8029)PARSER.parseFrom(data);
      }

      public static S2C_UsePoisonResult_8029 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UsePoisonResult_8029)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UsePoisonResult_8029 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UsePoisonResult_8029)PARSER.parseFrom(data);
      }

      public static S2C_UsePoisonResult_8029 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UsePoisonResult_8029)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UsePoisonResult_8029 parseFrom(InputStream input) throws IOException {
         return (S2C_UsePoisonResult_8029)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UsePoisonResult_8029 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UsePoisonResult_8029)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UsePoisonResult_8029 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UsePoisonResult_8029)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UsePoisonResult_8029 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UsePoisonResult_8029)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UsePoisonResult_8029 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UsePoisonResult_8029)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UsePoisonResult_8029 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UsePoisonResult_8029)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UsePoisonResult_8029 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UsePoisonResult_8029 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UsePoisonResult_8029> parser() {
         return PARSER;
      }

      public Parser<S2C_UsePoisonResult_8029> getParserForType() {
         return PARSER;
      }

      public S2C_UsePoisonResult_8029 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UsePoisonResult_8029OrBuilder {
         private int bitField0_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_S2C_UsePoisonResult_8029_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_S2C_UsePoisonResult_8029_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UsePoisonResult_8029.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.S2C_UsePoisonResult_8029.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_S2C_UsePoisonResult_8029_descriptor;
         }

         public S2C_UsePoisonResult_8029 getDefaultInstanceForType() {
            return WarMsg.S2C_UsePoisonResult_8029.getDefaultInstance();
         }

         public S2C_UsePoisonResult_8029 build() {
            S2C_UsePoisonResult_8029 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UsePoisonResult_8029 buildPartial() {
            S2C_UsePoisonResult_8029 result = new S2C_UsePoisonResult_8029(this);
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
            if (other instanceof S2C_UsePoisonResult_8029) {
               return this.mergeFrom((S2C_UsePoisonResult_8029)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UsePoisonResult_8029 other) {
            if (other == WarMsg.S2C_UsePoisonResult_8029.getDefaultInstance()) {
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
            S2C_UsePoisonResult_8029 parsedMessage = null;

            try {
               parsedMessage = (S2C_UsePoisonResult_8029)WarMsg.S2C_UsePoisonResult_8029.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UsePoisonResult_8029)e.getUnfinishedMessage();
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

   public static final class S2C_OpenBoxResult_8030 extends GeneratedMessageV3 implements S2C_OpenBoxResult_8030OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int EVENTPOS_FIELD_NUMBER = 1;
      private int eventPos_;
      public static final int REWARD_FIELD_NUMBER = 2;
      private CommonMsg.ItemInfo reward_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenBoxResult_8030 DEFAULT_INSTANCE = new S2C_OpenBoxResult_8030();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenBoxResult_8030> PARSER = new AbstractParser<S2C_OpenBoxResult_8030>() {
         public S2C_OpenBoxResult_8030 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenBoxResult_8030(input, extensionRegistry);
         }
      };

      private S2C_OpenBoxResult_8030(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenBoxResult_8030() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenBoxResult_8030();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenBoxResult_8030(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.eventPos_ = input.readInt32();
                        break;
                     case 18:
                        CommonMsg.ItemInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.reward_.toBuilder();
                        }

                        this.reward_ = (CommonMsg.ItemInfo)input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.reward_);
                           this.reward_ = subBuilder.buildPartial();
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
         return WarMsg.internal_static_War_S2C_OpenBoxResult_8030_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_S2C_OpenBoxResult_8030_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenBoxResult_8030.class, Builder.class);
      }

      public boolean hasEventPos() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getEventPos() {
         return this.eventPos_;
      }

      public boolean hasReward() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.ItemInfo getReward() {
         return this.reward_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.reward_;
      }

      public CommonMsg.ItemInfoOrBuilder getRewardOrBuilder() {
         return this.reward_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.reward_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasEventPos()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasReward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getReward().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.eventPos_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getReward());
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
               size += CodedOutputStream.computeInt32Size(1, this.eventPos_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getReward());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OpenBoxResult_8030)) {
            return super.equals(obj);
         } else {
            S2C_OpenBoxResult_8030 other = (S2C_OpenBoxResult_8030)obj;
            if (this.hasEventPos() != other.hasEventPos()) {
               return false;
            } else if (this.hasEventPos() && this.getEventPos() != other.getEventPos()) {
               return false;
            } else if (this.hasReward() != other.hasReward()) {
               return false;
            } else if (this.hasReward() && !this.getReward().equals(other.getReward())) {
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
            if (this.hasEventPos()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getEventPos();
            }

            if (this.hasReward()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getReward().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OpenBoxResult_8030 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenBoxResult_8030)PARSER.parseFrom(data);
      }

      public static S2C_OpenBoxResult_8030 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenBoxResult_8030)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenBoxResult_8030 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenBoxResult_8030)PARSER.parseFrom(data);
      }

      public static S2C_OpenBoxResult_8030 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenBoxResult_8030)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenBoxResult_8030 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenBoxResult_8030)PARSER.parseFrom(data);
      }

      public static S2C_OpenBoxResult_8030 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenBoxResult_8030)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenBoxResult_8030 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenBoxResult_8030)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenBoxResult_8030 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenBoxResult_8030)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenBoxResult_8030 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenBoxResult_8030)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenBoxResult_8030 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenBoxResult_8030)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenBoxResult_8030 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenBoxResult_8030)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenBoxResult_8030 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenBoxResult_8030)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenBoxResult_8030 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenBoxResult_8030 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenBoxResult_8030> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenBoxResult_8030> getParserForType() {
         return PARSER;
      }

      public S2C_OpenBoxResult_8030 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenBoxResult_8030OrBuilder {
         private int bitField0_;
         private int eventPos_;
         private CommonMsg.ItemInfo reward_;
         private SingleFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> rewardBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_S2C_OpenBoxResult_8030_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_S2C_OpenBoxResult_8030_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenBoxResult_8030.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.S2C_OpenBoxResult_8030.alwaysUseFieldBuilders) {
               this.getRewardFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.eventPos_ = 0;
            this.bitField0_ &= -2;
            if (this.rewardBuilder_ == null) {
               this.reward_ = null;
            } else {
               this.rewardBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_S2C_OpenBoxResult_8030_descriptor;
         }

         public S2C_OpenBoxResult_8030 getDefaultInstanceForType() {
            return WarMsg.S2C_OpenBoxResult_8030.getDefaultInstance();
         }

         public S2C_OpenBoxResult_8030 build() {
            S2C_OpenBoxResult_8030 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenBoxResult_8030 buildPartial() {
            S2C_OpenBoxResult_8030 result = new S2C_OpenBoxResult_8030(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.eventPos_ = this.eventPos_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.rewardBuilder_ == null) {
                  result.reward_ = this.reward_;
               } else {
                  result.reward_ = (CommonMsg.ItemInfo)this.rewardBuilder_.build();
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
            if (other instanceof S2C_OpenBoxResult_8030) {
               return this.mergeFrom((S2C_OpenBoxResult_8030)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenBoxResult_8030 other) {
            if (other == WarMsg.S2C_OpenBoxResult_8030.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasEventPos()) {
                  this.setEventPos(other.getEventPos());
               }

               if (other.hasReward()) {
                  this.mergeReward(other.getReward());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasEventPos()) {
               return false;
            } else if (!this.hasReward()) {
               return false;
            } else {
               return this.getReward().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OpenBoxResult_8030 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenBoxResult_8030)WarMsg.S2C_OpenBoxResult_8030.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenBoxResult_8030)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasEventPos() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getEventPos() {
            return this.eventPos_;
         }

         public Builder setEventPos(int value) {
            this.bitField0_ |= 1;
            this.eventPos_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEventPos() {
            this.bitField0_ &= -2;
            this.eventPos_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasReward() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.ItemInfo getReward() {
            if (this.rewardBuilder_ == null) {
               return this.reward_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.reward_;
            } else {
               return (CommonMsg.ItemInfo)this.rewardBuilder_.getMessage();
            }
         }

         public Builder setReward(CommonMsg.ItemInfo value) {
            if (this.rewardBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.reward_ = value;
               this.onChanged();
            } else {
               this.rewardBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setReward(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.rewardBuilder_ == null) {
               this.reward_ = builderForValue.build();
               this.onChanged();
            } else {
               this.rewardBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeReward(CommonMsg.ItemInfo value) {
            if (this.rewardBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.reward_ != null && this.reward_ != CommonMsg.ItemInfo.getDefaultInstance()) {
                  this.reward_ = CommonMsg.ItemInfo.newBuilder(this.reward_).mergeFrom(value).buildPartial();
               } else {
                  this.reward_ = value;
               }

               this.onChanged();
            } else {
               this.rewardBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearReward() {
            if (this.rewardBuilder_ == null) {
               this.reward_ = null;
               this.onChanged();
            } else {
               this.rewardBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.ItemInfo.Builder getRewardBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.ItemInfo.Builder)this.getRewardFieldBuilder().getBuilder();
         }

         public CommonMsg.ItemInfoOrBuilder getRewardOrBuilder() {
            if (this.rewardBuilder_ != null) {
               return (CommonMsg.ItemInfoOrBuilder)this.rewardBuilder_.getMessageOrBuilder();
            } else {
               return this.reward_ == null ? CommonMsg.ItemInfo.getDefaultInstance() : this.reward_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getRewardFieldBuilder() {
            if (this.rewardBuilder_ == null) {
               this.rewardBuilder_ = new SingleFieldBuilderV3(this.getReward(), this.getParentForChildren(), this.isClean());
               this.reward_ = null;
            }

            return this.rewardBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_SweepStage_8031 extends GeneratedMessageV3 implements C2S_SweepStage_8031OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int AUTOFINISH_FIELD_NUMBER = 1;
      private boolean autoFinish_;
      private byte memoizedIsInitialized;
      private static final C2S_SweepStage_8031 DEFAULT_INSTANCE = new C2S_SweepStage_8031();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_SweepStage_8031> PARSER = new AbstractParser<C2S_SweepStage_8031>() {
         public C2S_SweepStage_8031 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_SweepStage_8031(input, extensionRegistry);
         }
      };

      private C2S_SweepStage_8031(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_SweepStage_8031() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_SweepStage_8031();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_SweepStage_8031(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.autoFinish_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WarMsg.internal_static_War_C2S_SweepStage_8031_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_C2S_SweepStage_8031_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SweepStage_8031.class, Builder.class);
      }

      public boolean hasAutoFinish() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getAutoFinish() {
         return this.autoFinish_;
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
            output.writeBool(1, this.autoFinish_);
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
               size += CodedOutputStream.computeBoolSize(1, this.autoFinish_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_SweepStage_8031)) {
            return super.equals(obj);
         } else {
            C2S_SweepStage_8031 other = (C2S_SweepStage_8031)obj;
            if (this.hasAutoFinish() != other.hasAutoFinish()) {
               return false;
            } else if (this.hasAutoFinish() && this.getAutoFinish() != other.getAutoFinish()) {
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
            if (this.hasAutoFinish()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getAutoFinish());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_SweepStage_8031 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_SweepStage_8031)PARSER.parseFrom(data);
      }

      public static C2S_SweepStage_8031 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SweepStage_8031)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SweepStage_8031 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_SweepStage_8031)PARSER.parseFrom(data);
      }

      public static C2S_SweepStage_8031 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SweepStage_8031)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SweepStage_8031 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_SweepStage_8031)PARSER.parseFrom(data);
      }

      public static C2S_SweepStage_8031 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_SweepStage_8031)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_SweepStage_8031 parseFrom(InputStream input) throws IOException {
         return (C2S_SweepStage_8031)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SweepStage_8031 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SweepStage_8031)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SweepStage_8031 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_SweepStage_8031)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_SweepStage_8031 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SweepStage_8031)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_SweepStage_8031 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_SweepStage_8031)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_SweepStage_8031 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_SweepStage_8031)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_SweepStage_8031 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_SweepStage_8031 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_SweepStage_8031> parser() {
         return PARSER;
      }

      public Parser<C2S_SweepStage_8031> getParserForType() {
         return PARSER;
      }

      public C2S_SweepStage_8031 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_SweepStage_8031OrBuilder {
         private int bitField0_;
         private boolean autoFinish_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_C2S_SweepStage_8031_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_C2S_SweepStage_8031_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_SweepStage_8031.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.C2S_SweepStage_8031.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.autoFinish_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_C2S_SweepStage_8031_descriptor;
         }

         public C2S_SweepStage_8031 getDefaultInstanceForType() {
            return WarMsg.C2S_SweepStage_8031.getDefaultInstance();
         }

         public C2S_SweepStage_8031 build() {
            C2S_SweepStage_8031 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_SweepStage_8031 buildPartial() {
            C2S_SweepStage_8031 result = new C2S_SweepStage_8031(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.autoFinish_ = this.autoFinish_;
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
            if (other instanceof C2S_SweepStage_8031) {
               return this.mergeFrom((C2S_SweepStage_8031)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_SweepStage_8031 other) {
            if (other == WarMsg.C2S_SweepStage_8031.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasAutoFinish()) {
                  this.setAutoFinish(other.getAutoFinish());
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
            C2S_SweepStage_8031 parsedMessage = null;

            try {
               parsedMessage = (C2S_SweepStage_8031)WarMsg.C2S_SweepStage_8031.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_SweepStage_8031)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasAutoFinish() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getAutoFinish() {
            return this.autoFinish_;
         }

         public Builder setAutoFinish(boolean value) {
            this.bitField0_ |= 1;
            this.autoFinish_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAutoFinish() {
            this.bitField0_ &= -2;
            this.autoFinish_ = false;
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

   public static final class C2S_ResetTime_8033 extends GeneratedMessageV3 implements C2S_ResetTime_8033OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ResetTime_8033 DEFAULT_INSTANCE = new C2S_ResetTime_8033();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ResetTime_8033> PARSER = new AbstractParser<C2S_ResetTime_8033>() {
         public C2S_ResetTime_8033 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ResetTime_8033(input, extensionRegistry);
         }
      };

      private C2S_ResetTime_8033(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ResetTime_8033() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ResetTime_8033();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ResetTime_8033(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return WarMsg.internal_static_War_C2S_ResetTime_8033_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_C2S_ResetTime_8033_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ResetTime_8033.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ResetTime_8033)) {
            return super.equals(obj);
         } else {
            C2S_ResetTime_8033 other = (C2S_ResetTime_8033)obj;
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

      public static C2S_ResetTime_8033 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ResetTime_8033)PARSER.parseFrom(data);
      }

      public static C2S_ResetTime_8033 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetTime_8033)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetTime_8033 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ResetTime_8033)PARSER.parseFrom(data);
      }

      public static C2S_ResetTime_8033 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetTime_8033)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetTime_8033 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ResetTime_8033)PARSER.parseFrom(data);
      }

      public static C2S_ResetTime_8033 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ResetTime_8033)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ResetTime_8033 parseFrom(InputStream input) throws IOException {
         return (C2S_ResetTime_8033)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ResetTime_8033 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetTime_8033)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ResetTime_8033 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ResetTime_8033)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ResetTime_8033 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetTime_8033)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ResetTime_8033 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ResetTime_8033)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ResetTime_8033 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ResetTime_8033)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ResetTime_8033 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ResetTime_8033 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ResetTime_8033> parser() {
         return PARSER;
      }

      public Parser<C2S_ResetTime_8033> getParserForType() {
         return PARSER;
      }

      public C2S_ResetTime_8033 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ResetTime_8033OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_C2S_ResetTime_8033_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_C2S_ResetTime_8033_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ResetTime_8033.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.C2S_ResetTime_8033.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_C2S_ResetTime_8033_descriptor;
         }

         public C2S_ResetTime_8033 getDefaultInstanceForType() {
            return WarMsg.C2S_ResetTime_8033.getDefaultInstance();
         }

         public C2S_ResetTime_8033 build() {
            C2S_ResetTime_8033 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ResetTime_8033 buildPartial() {
            C2S_ResetTime_8033 result = new C2S_ResetTime_8033(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ResetTime_8033) {
               return this.mergeFrom((C2S_ResetTime_8033)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ResetTime_8033 other) {
            if (other == WarMsg.C2S_ResetTime_8033.getDefaultInstance()) {
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
            C2S_ResetTime_8033 parsedMessage = null;

            try {
               parsedMessage = (C2S_ResetTime_8033)WarMsg.C2S_ResetTime_8033.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ResetTime_8033)e.getUnfinishedMessage();
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

   public static final class S2C_ResetTime_8034 extends GeneratedMessageV3 implements S2C_ResetTime_8034OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESETTIME_FIELD_NUMBER = 1;
      private int resetTime_;
      private byte memoizedIsInitialized;
      private static final S2C_ResetTime_8034 DEFAULT_INSTANCE = new S2C_ResetTime_8034();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ResetTime_8034> PARSER = new AbstractParser<S2C_ResetTime_8034>() {
         public S2C_ResetTime_8034 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ResetTime_8034(input, extensionRegistry);
         }
      };

      private S2C_ResetTime_8034(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ResetTime_8034() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ResetTime_8034();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ResetTime_8034(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        this.resetTime_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return WarMsg.internal_static_War_S2C_ResetTime_8034_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WarMsg.internal_static_War_S2C_ResetTime_8034_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ResetTime_8034.class, Builder.class);
      }

      public boolean hasResetTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getResetTime() {
         return this.resetTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasResetTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.resetTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.resetTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ResetTime_8034)) {
            return super.equals(obj);
         } else {
            S2C_ResetTime_8034 other = (S2C_ResetTime_8034)obj;
            if (this.hasResetTime() != other.hasResetTime()) {
               return false;
            } else if (this.hasResetTime() && this.getResetTime() != other.getResetTime()) {
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
            if (this.hasResetTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getResetTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ResetTime_8034 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ResetTime_8034)PARSER.parseFrom(data);
      }

      public static S2C_ResetTime_8034 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetTime_8034)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetTime_8034 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ResetTime_8034)PARSER.parseFrom(data);
      }

      public static S2C_ResetTime_8034 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetTime_8034)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetTime_8034 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ResetTime_8034)PARSER.parseFrom(data);
      }

      public static S2C_ResetTime_8034 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ResetTime_8034)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ResetTime_8034 parseFrom(InputStream input) throws IOException {
         return (S2C_ResetTime_8034)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ResetTime_8034 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetTime_8034)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ResetTime_8034 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ResetTime_8034)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ResetTime_8034 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetTime_8034)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ResetTime_8034 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ResetTime_8034)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ResetTime_8034 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ResetTime_8034)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ResetTime_8034 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ResetTime_8034 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ResetTime_8034> parser() {
         return PARSER;
      }

      public Parser<S2C_ResetTime_8034> getParserForType() {
         return PARSER;
      }

      public S2C_ResetTime_8034 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ResetTime_8034OrBuilder {
         private int bitField0_;
         private int resetTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return WarMsg.internal_static_War_S2C_ResetTime_8034_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WarMsg.internal_static_War_S2C_ResetTime_8034_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ResetTime_8034.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (WarMsg.S2C_ResetTime_8034.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.resetTime_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return WarMsg.internal_static_War_S2C_ResetTime_8034_descriptor;
         }

         public S2C_ResetTime_8034 getDefaultInstanceForType() {
            return WarMsg.S2C_ResetTime_8034.getDefaultInstance();
         }

         public S2C_ResetTime_8034 build() {
            S2C_ResetTime_8034 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ResetTime_8034 buildPartial() {
            S2C_ResetTime_8034 result = new S2C_ResetTime_8034(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.resetTime_ = this.resetTime_;
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
            if (other instanceof S2C_ResetTime_8034) {
               return this.mergeFrom((S2C_ResetTime_8034)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ResetTime_8034 other) {
            if (other == WarMsg.S2C_ResetTime_8034.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasResetTime()) {
                  this.setResetTime(other.getResetTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasResetTime();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ResetTime_8034 parsedMessage = null;

            try {
               parsedMessage = (S2C_ResetTime_8034)WarMsg.S2C_ResetTime_8034.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ResetTime_8034)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasResetTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getResetTime() {
            return this.resetTime_;
         }

         public Builder setResetTime(int value) {
            this.bitField0_ |= 1;
            this.resetTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResetTime() {
            this.bitField0_ &= -2;
            this.resetTime_ = 0;
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

   public interface C2S_Answer_8005OrBuilder extends MessageOrBuilder {
      boolean hasEventPos();

      int getEventPos();

      boolean hasQuestion();

      int getQuestion();

      boolean hasAnswer();

      int getAnswer();
   }

   public interface C2S_BuyMarchShopGoods_8013OrBuilder extends MessageOrBuilder {
      boolean hasIndex();

      int getIndex();
   }

   public interface C2S_BuyPoison_8015OrBuilder extends MessageOrBuilder {
      boolean hasNum();

      int getNum();
   }

   public interface C2S_ChangePlayedHero_8021OrBuilder extends MessageOrBuilder {
      boolean hasHeroPos();

      int getHeroPos();
   }

   public interface C2S_EnterHLBattle_8003OrBuilder extends MessageOrBuilder {
      boolean hasHeroPos();

      int getHeroPos();

      boolean hasFort();

      int getFort();
   }

   public interface C2S_EnterNextFloor_8019OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();
   }

   public interface C2S_GetPassReward_8016OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_GetWarHLInfo_8001OrBuilder extends MessageOrBuilder {
      boolean hasPlayerCode();

      int getPlayerCode();
   }

   public interface C2S_LuckyGambling_8023OrBuilder extends MessageOrBuilder {
      boolean hasLuckyId();

      int getLuckyId();

      boolean hasEventPos();

      int getEventPos();
   }

   public interface C2S_OpenBox_8018OrBuilder extends MessageOrBuilder {
      boolean hasPos();

      int getPos();
   }

   public interface C2S_ReceiveBoxKey_8027OrBuilder extends MessageOrBuilder {
      boolean hasEventPos();

      int getEventPos();
   }

   public interface C2S_ResetTime_8033OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_SweepStage_8031OrBuilder extends MessageOrBuilder {
      boolean hasAutoFinish();

      boolean getAutoFinish();
   }

   public interface C2S_UseSpecialItemCure_8008OrBuilder extends MessageOrBuilder {
      boolean hasHeroPos();

      int getHeroPos();
   }

   public interface C2S_UseSpecialItemPoison_8010OrBuilder extends MessageOrBuilder {
      boolean hasFort();

      int getFort();

      boolean hasAutoFinish();

      boolean getAutoFinish();
   }

   public interface C2S_UseSpecialItemShopMan_8011OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();
   }

   public interface C2S_WarHLRank_8025OrBuilder extends MessageOrBuilder {
   }

   public interface HLBuffOrBuilder extends MessageOrBuilder {
      List<CommonMsg.PropertyInfo> getBuffList();

      CommonMsg.PropertyInfo getBuff(int index);

      int getBuffCount();

      List<? extends CommonMsg.PropertyInfoOrBuilder> getBuffOrBuilderList();

      CommonMsg.PropertyInfoOrBuilder getBuffOrBuilder(int index);
   }

   public interface HLGoodsOrBuilder extends MessageOrBuilder {
      boolean hasIndex();

      int getIndex();

      boolean hasItem();

      CommonMsg.ItemInfo getItem();

      CommonMsg.ItemInfoOrBuilder getItemOrBuilder();

      boolean hasCost();

      CommonMsg.ItemInfo getCost();

      CommonMsg.ItemInfoOrBuilder getCostOrBuilder();

      boolean hasDiscount();

      int getDiscount();

      boolean hasBought();

      boolean getBought();
   }

   public interface HLMarchShopOrBuilder extends MessageOrBuilder {
      List<HLGoods> getGoodsList();

      HLGoods getGoods(int index);

      int getGoodsCount();

      List<? extends HLGoodsOrBuilder> getGoodsOrBuilderList();

      HLGoodsOrBuilder getGoodsOrBuilder(int index);
   }

   public interface RankInfoOrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasLv();

      int getLv();

      boolean hasHead();

      int getHead();

      boolean hasName();

      String getName();

      ByteString getNameBytes();

      boolean hasMaxFloor();

      int getMaxFloor();

      boolean hasPoint();

      int getPoint();

      boolean hasServerId();

      int getServerId();
   }

   public interface S2C_AllRewards_8020OrBuilder extends MessageOrBuilder {
      List<CommonMsg.ItemInfo> getRewardList();

      CommonMsg.ItemInfo getReward(int index);

      int getRewardCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getRewardOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getRewardOrBuilder(int index);
   }

   public interface S2C_BuyMarchShopGoods_8014OrBuilder extends MessageOrBuilder {
      boolean hasGoods();

      HLGoods getGoods();

      HLGoodsOrBuilder getGoodsOrBuilder();
   }

   public interface S2C_ChangePlayedHero_8022OrBuilder extends MessageOrBuilder {
      boolean hasHeroPos();

      int getHeroPos();
   }

   public interface S2C_EnterHLBattle_8004OrBuilder extends MessageOrBuilder {
      boolean hasBattleFloor();

      int getBattleFloor();

      List<Integer> getPassFortList();

      int getPassFortCount();

      int getPassFort(int index);

      boolean hasHeroHp();

      CommonMsg.MapDataIF getHeroHp();

      CommonMsg.MapDataIFOrBuilder getHeroHpOrBuilder();

      boolean hasEnemyHp();

      CommonMsg.MapDataIF getEnemyHp();

      CommonMsg.MapDataIFOrBuilder getEnemyHpOrBuilder();

      List<S2C_EventInfo_8006> getEventsList();

      S2C_EventInfo_8006 getEvents(int index);

      int getEventsCount();

      List<? extends S2C_EventInfo_8006OrBuilder> getEventsOrBuilderList();

      S2C_EventInfo_8006OrBuilder getEventsOrBuilder(int index);

      boolean hasHeroPos();

      int getHeroPos();

      boolean hasItem();

      S2C_SpecialItem_8007 getItem();

      S2C_SpecialItem_8007OrBuilder getItemOrBuilder();

      boolean hasFortSum();

      int getFortSum();
   }

   public interface S2C_EventInfo_8006OrBuilder extends MessageOrBuilder {
      boolean hasEventPos();

      int getEventPos();

      boolean hasEventId();

      int getEventId();

      List<CommonMsg.MapDataII> getQuestionList();

      CommonMsg.MapDataII getQuestion(int index);

      int getQuestionCount();

      List<? extends CommonMsg.MapDataIIOrBuilder> getQuestionOrBuilderList();

      CommonMsg.MapDataIIOrBuilder getQuestionOrBuilder(int index);

      List<HLGoods> getGoodsList();

      HLGoods getGoods(int index);

      int getGoodsCount();

      List<? extends HLGoodsOrBuilder> getGoodsOrBuilderList();

      HLGoodsOrBuilder getGoodsOrBuilder(int index);

      boolean hasBuffId();

      int getBuffId();

      boolean hasEnd();

      boolean getEnd();
   }

   public interface S2C_GetWarHLInfo_8002OrBuilder extends MessageOrBuilder {
      boolean hasBattleFloor();

      int getBattleFloor();

      List<Integer> getPassFortList();

      int getPassFortCount();

      int getPassFort(int index);

      boolean hasItem();

      S2C_SpecialItem_8007 getItem();

      S2C_SpecialItem_8007OrBuilder getItemOrBuilder();

      boolean hasHeroHp();

      S2C_UseSpecialItemCure_8009 getHeroHp();

      S2C_UseSpecialItemCure_8009OrBuilder getHeroHpOrBuilder();

      List<S2C_EventInfo_8006> getEventsList();

      S2C_EventInfo_8006 getEvents(int index);

      int getEventsCount();

      List<? extends S2C_EventInfo_8006OrBuilder> getEventsOrBuilderList();

      S2C_EventInfo_8006OrBuilder getEventsOrBuilder(int index);

      boolean hasBuff();

      HLBuff getBuff();

      HLBuffOrBuilder getBuffOrBuilder();

      boolean hasMarchShop();

      HLMarchShop getMarchShop();

      HLMarchShopOrBuilder getMarchShopOrBuilder();

      boolean hasTargetReward();

      S2C_TargetReward_8017 getTargetReward();

      S2C_TargetReward_8017OrBuilder getTargetRewardOrBuilder();

      boolean hasHeroPos();

      int getHeroPos();

      List<CommonMsg.MapDataIF> getEnemyHpList();

      CommonMsg.MapDataIF getEnemyHp(int index);

      int getEnemyHpCount();

      List<? extends CommonMsg.MapDataIFOrBuilder> getEnemyHpOrBuilderList();

      CommonMsg.MapDataIFOrBuilder getEnemyHpOrBuilder(int index);

      List<Integer> getCrossFortList();

      int getCrossFortCount();

      int getCrossFort(int index);

      boolean hasFortSum();

      int getFortSum();

      boolean hasResetTime();

      int getResetTime();

      List<CommonMsg.HeroInfo> getHeroList();

      CommonMsg.HeroInfo getHero(int index);

      int getHeroCount();

      List<? extends CommonMsg.HeroInfoOrBuilder> getHeroOrBuilderList();

      CommonMsg.HeroInfoOrBuilder getHeroOrBuilder(int index);

      boolean hasMaxFloor();

      int getMaxFloor();
   }

   public interface S2C_LuckyGambling_8024OrBuilder extends MessageOrBuilder {
      boolean hasRewardRate();

      int getRewardRate();

      boolean hasEventPos();

      int getEventPos();

      boolean hasLuckId();

      int getLuckId();
   }

   public interface S2C_NewGoods_8012OrBuilder extends MessageOrBuilder {
      boolean hasGoods();

      HLGoods getGoods();

      HLGoodsOrBuilder getGoodsOrBuilder();
   }

   public interface S2C_OpenBoxResult_8030OrBuilder extends MessageOrBuilder {
      boolean hasEventPos();

      int getEventPos();

      boolean hasReward();

      CommonMsg.ItemInfo getReward();

      CommonMsg.ItemInfoOrBuilder getRewardOrBuilder();
   }

   public interface S2C_ReceiveBoxKey_8028OrBuilder extends MessageOrBuilder {
      boolean hasEventPos();

      int getEventPos();
   }

   public interface S2C_ResetTime_8034OrBuilder extends MessageOrBuilder {
      boolean hasResetTime();

      int getResetTime();
   }

   public interface S2C_SpecialItem_8007OrBuilder extends MessageOrBuilder {
      boolean hasUsePoison();

      int getUsePoison();

      boolean hasUseCure();

      int getUseCure();
   }

   public interface S2C_TargetReward_8017OrBuilder extends MessageOrBuilder {
      List<Integer> getCrossFortList();

      int getCrossFortCount();

      int getCrossFort(int index);
   }

   public interface S2C_UsePoisonResult_8029OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      int getResult();
   }

   public interface S2C_UseSpecialItemCure_8009OrBuilder extends MessageOrBuilder {
      List<CommonMsg.MapDataIF> getHeroHpList();

      CommonMsg.MapDataIF getHeroHp(int index);

      int getHeroHpCount();

      List<? extends CommonMsg.MapDataIFOrBuilder> getHeroHpOrBuilderList();

      CommonMsg.MapDataIFOrBuilder getHeroHpOrBuilder(int index);

      boolean hasUseCure();

      int getUseCure();
   }

   public interface S2C_WarHLRankResult_8026OrBuilder extends MessageOrBuilder {
      boolean hasMyRank();

      RankInfo getMyRank();

      RankInfoOrBuilder getMyRankOrBuilder();

      List<RankInfo> getInfosList();

      RankInfo getInfos(int index);

      int getInfosCount();

      List<? extends RankInfoOrBuilder> getInfosOrBuilderList();

      RankInfoOrBuilder getInfosOrBuilder(int index);
   }
}
