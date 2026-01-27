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

public final class CrossWaterTransportMsg {
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_AltarData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_AltarData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_S2CR_ShipList_10201_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_S2CR_ShipList_10201_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_S2CR_Altar_10202_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_S2CR_Altar_10202_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_S2CR_Sacrifice_10203_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_S2CR_Sacrifice_10203_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_CR2S_SacrificeInfo_10204_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_CR2S_SacrificeInfo_10204_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_S2CR_Sail_10205_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_S2CR_Sail_10205_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_CR2S_Sail_10206_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_CR2S_Sail_10206_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_S2CR_Intercept_10207_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_S2CR_Intercept_10207_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_CR2S_Intercept_10208_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_CR2S_Intercept_10208_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_S2CR_WaterTransportGm_10209_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_S2CR_WaterTransportGm_10209_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_CR2S_ShipArrive_10210_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_CR2S_ShipArrive_10210_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_CR2S_BeInterceptLog_10211_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_CR2S_BeInterceptLog_10211_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_CR2S_PlayerShipArrive_10212_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_CR2S_PlayerShipArrive_10212_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_CR2S_Ship_10213_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_CR2S_Ship_10213_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_CargoShipRankData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_CargoShipRankData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_CR2S_RankReward_10214_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_CR2S_RankReward_10214_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_S2CR_WaterTransportArrayingInfo_10215_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_S2CR_WaterTransportArrayingInfo_10215_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_CR2S_Remains_10216_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_CR2S_Remains_10216_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_CrossRemainsData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_CrossRemainsData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_S2CR_RemainsReward_10217_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_S2CR_RemainsReward_10217_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_CR2S_RemainsReward_10218_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_CR2S_RemainsReward_10218_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_S2CR_RemainsRewardOneKey_10219_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_S2CR_RemainsRewardOneKey_10219_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_CR2S_RemainsRewardOneKey_10220_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_CR2S_RemainsRewardOneKey_10220_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_S2CR_PlayerShips_10221_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_S2CR_PlayerShips_10221_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_S2CR_GoldShip_10222_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_S2CR_GoldShip_10222_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_S2CR_GoldDamageRank_10223_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_S2CR_GoldDamageRank_10223_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipIntercept_10224_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipIntercept_10224_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipNotify_10225_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipNotify_10225_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipDamageReward_10226_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipDamageReward_10226_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_crossTransport_com_gzbz_protobuf_S2CR_InterceptGoldShip_10227_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_crossTransport_com_gzbz_protobuf_S2CR_InterceptGoldShip_10227_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private CrossWaterTransportMsg() {
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
      String[] descriptorData = new String[]{"\n\u0019CrossWaterTransport.proto\u0012 crossTransport.com.gzbz.protobuf\u001a\u0014WaterTransport.proto\u001a\fBattle.proto\"2\n\tAltarData\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0002(\u0005\u0012\u000b\n\u0003exp\u0018\u0003 \u0002(\u0005\"8\n\u0013S2CR_ShipList_10201\u0012\r\n\u0005river\u0018\u0001 \u0002(\u0005\u0012\u0012\n\ngotRemains\u0018\u0002 \u0003(\u0005\" \n\u0010S2CR_Altar_10202\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"=\n\u0014S2CR_Sacrifice_10203\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012\u000b\n\u0003exp\u0018\u0002 \u0002(\u0005\u0012\n\n\u0002op\u0018\u0003 \u0002(\u0005\"h\n\u0018CR2S_SacrificeInfo_10204\u0012\u0010\n\bisNotify\u0018\u0001 \u0002(\b\u0012:\n\u0005altar\u0018\u0002 \u0002(\u000b2+.crossTransport.com.gzbz.protobuf.AltarData\"o\n\u000fS2CR_Sail_10205\u00127\n\bshipData\u0018\u0001 \u0002(\u000b2%.transport.com.gzbz.protobuf.ShipInfo\u0012\u0014\n\farrayingData\u0018\u0002 \u0002(\f\u0012\r\n\u0005level\u0018\u0003 \u0002(\u0005\"\u009f\u0001\n\u000fCR2S_Sail_10206\u0012=\n\bshipData\u0018\u0001 \u0002(\u000b2+.transport.com.gzbz.protobuf.PlayerShipInfo\u0012\u000f\n\u0007guardId\u0018\u0002 \u0002(\u0005\u0012<\n\u0006record\u0018\u0003 \u0002(\u000b2,.transport.com.gzbz.protobuf.TransportRecord\"m\n\u0014S2CR_Intercept_10207\u0012\u0018\n\u0010heroArrayingData\u0018\u0001 \u0002(\f\u0012\u0018\n\u0010myInterceptCount\u0018\u0002 \u0002(\u0005\u0012\u000e\n\u0006shipId\u0018\u0003 \u0002(\u0005\u0012\u0011\n\thighPower\u0018\u0004 \u0002(\u0003\"\u0083\u0002\n\u0014CR2S_Intercept_10208\u0012\u0013\n\u000bshipModelId\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000brewardScale\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007guardId\u0018\u0003 \u0002(\u0005\u0012\u000e\n\u0006shipId\u0018\u0004 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0005 \u0002(\u0005\u0012B\n\tbattleMsg\u0018\u0006 \u0002(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\u0012<\n\u0006record\u0018\u0007 \u0001(\u000b2,.transport.com.gzbz.protobuf.TransportRecord\u0012\u000f\n\u0007worldLv\u0018\b \u0002(\u0005\":\n\u001bS2CR_WaterTransportGm_10209\u0012\u000b\n\u0003cmd\u0018\u0001 \u0002(\t\u0012\u000e\n\u0006params\u0018\u0002 \u0003(\u0003\"6\n\u0015CR2S_ShipArrive_10210\u0012\r\n\u0005river\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006shipId\u0018\u0002 \u0002(\u0005\"ü\u0001\n\u0019CR2S_BeInterceptLog_10211\u0012\u000e\n\u0006shipId\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000brewardScale\u0018\u0002 \u0002(\u0005\u0012\u0018\n\u0010beInterceptCount\u0018\u0003 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0004 \u0002(\u0005\u0012<\n\u0006record\u0018\u0005 \u0002(\u000b2,.transport.com.gzbz.protobuf.TransportRecord\u0012B\n\tbattleMsg\u0018\u0006 \u0002(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\u0012\u000f\n\u0007worldLv\u0018\u0007 \u0002(\u0005\"÷\u0001\n\u001bCR2S_PlayerShipArrive_10212\u0012\u000e\n\u0006shipId\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000brewardScale\u0018\u0002 \u0002(\u0005\u0012\u0018\n\u0010beInterceptCount\u0018\u0003 \u0002(\u0005\u0012\u000f\n\u0007guardId\u0018\u0004 \u0002(\u0005\u0012\r\n\u0005level\u0018\u0005 \u0002(\u0005\u0012<\n\u0006record\u0018\u0006 \u0002(\u000b2,.transport.com.gzbz.protobuf.TransportRecord\u0012\u0015\n\rexRewardScale\u0018\u0007 \u0002(\u0005\u0012\u0013\n\u000bshipModelId\u0018\b \u0002(\u0005\u0012\u000f\n\u0007worldLv\u0018\t \u0002(\u0005\"J\n\u000fCR2S_Ship_10213\u00127\n\bshipData\u0018\u0001 \u0002(\u000b2%.transport.com.gzbz.protobuf.ShipInfo\"3\n\u0011CargoShipRankData\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004rank\u0018\u0002 \u0002(\u0005\"^\n\u0015CR2S_RankReward_10214\u0012E\n\brankList\u0018\u0001 \u0003(\u000b23.crossTransport.com.gzbz.protobuf.CargoShipRankData\"7\n%S2CR_WaterTransportArrayingInfo_10215\u0012\u000e\n\u0006shipId\u0018\u0001 \u0002(\u0005\"O\n\u0012CR2S_Remains_10216\u00129\n\u0007remains\u0018\u0001 \u0002(\u000b2(.transport.com.gzbz.protobuf.RemainsInfo\"I\n\u0010CrossRemainsData\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bshipModelId\u0018\u0002 \u0002(\u0005\u0012\u0014\n\fbelongPlayer\u0018\u0003 \u0002(\u0005\"<\n\u0018S2CR_RemainsReward_10217\u0012\r\n\u0005river\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tremainsId\u0018\u0002 \u0002(\u0005\"n\n\u0018CR2S_RemainsReward_10218\u0012\r\n\u0005river\u0018\u0001 \u0002(\u0005\u0012C\n\u0007remains\u0018\u0002 \u0002(\u000b22.crossTransport.com.gzbz.protobuf.CrossRemainsData\"C\n\u001eS2CR_RemainsRewardOneKey_10219\u0012\r\n\u0005river\u0018\u0001 \u0002(\u0005\u0012\u0012\n\ngotRemains\u0018\u0002 \u0003(\u0005\"t\n\u001eCR2S_RemainsRewardOneKey_10220\u0012\r\n\u0005river\u0018\u0001 \u0002(\u0005\u0012C\n\u0007remains\u0018\u0002 \u0003(\u000b22.crossTransport.com.gzbz.protobuf.CrossRemainsData\"*\n\u0016S2CR_PlayerShips_10221\u0012\u0010\n\bplayerId\u0018\u0001 \u0002(\u0005\"\u0015\n\u0013S2CR_GoldShip_10222\"*\n\u0019S2CR_GoldDamageRank_10223\u0012\r\n\u0005limit\u0018\u0001 \u0001(\u0005\"\u0093\u0001\n\u001cCR2S_GoldShipIntercept_10224\u0012\r\n\u0005stage\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006isKill\u0018\u0002 \u0002(\b\u0012B\n\tbattleMsg\u0018\u0003 \u0002(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\u0012\u0010\n\bshipType\u0018\u0004 \u0002(\u0005\"]\n\u0019CR2S_GoldShipNotify_10225\u0012@\n\bgoldInfo\u0018\u0001 \u0002(\u000b2..transport.com.gzbz.protobuf.S2C_GoldShip_9552\"\u008a\u0001\n\u001fCR2S_GoldShipDamageReward_10226\u0012\u000e\n\u0006damage\u0018\u0001 \u0002(\u0003\u0012\u0010\n\bshipType\u0018\u0002 \u0002(\u0005\u0012E\n\brankData\u0018\u0003 \u0003(\u000b23.crossTransport.com.gzbz.protobuf.CargoShipRankData\"J\n\u001cS2CR_InterceptGoldShip_10227\u0012\u0018\n\u0010heroArrayingData\u0018\u0001 \u0002(\f\u0012\u0010\n\bshipType\u0018\u0002 \u0002(\u0005B-\n\u0011com.gzbz.protobufB\u0016CrossWaterTransportMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{WaterTransportMsg.getDescriptor(), BattleMsg.getDescriptor()});
      internal_static_crossTransport_com_gzbz_protobuf_AltarData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_crossTransport_com_gzbz_protobuf_AltarData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_AltarData_descriptor, new String[]{"Type", "Id", "Exp"});
      internal_static_crossTransport_com_gzbz_protobuf_S2CR_ShipList_10201_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_crossTransport_com_gzbz_protobuf_S2CR_ShipList_10201_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_S2CR_ShipList_10201_descriptor, new String[]{"River", "GotRemains"});
      internal_static_crossTransport_com_gzbz_protobuf_S2CR_Altar_10202_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_crossTransport_com_gzbz_protobuf_S2CR_Altar_10202_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_S2CR_Altar_10202_descriptor, new String[]{"Type"});
      internal_static_crossTransport_com_gzbz_protobuf_S2CR_Sacrifice_10203_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_crossTransport_com_gzbz_protobuf_S2CR_Sacrifice_10203_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_S2CR_Sacrifice_10203_descriptor, new String[]{"Type", "Exp", "Op"});
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_SacrificeInfo_10204_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_SacrificeInfo_10204_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_CR2S_SacrificeInfo_10204_descriptor, new String[]{"IsNotify", "Altar"});
      internal_static_crossTransport_com_gzbz_protobuf_S2CR_Sail_10205_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_crossTransport_com_gzbz_protobuf_S2CR_Sail_10205_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_S2CR_Sail_10205_descriptor, new String[]{"ShipData", "ArrayingData", "Level"});
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_Sail_10206_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_Sail_10206_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_CR2S_Sail_10206_descriptor, new String[]{"ShipData", "GuardId", "Record"});
      internal_static_crossTransport_com_gzbz_protobuf_S2CR_Intercept_10207_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_crossTransport_com_gzbz_protobuf_S2CR_Intercept_10207_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_S2CR_Intercept_10207_descriptor, new String[]{"HeroArrayingData", "MyInterceptCount", "ShipId", "HighPower"});
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_Intercept_10208_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_Intercept_10208_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_CR2S_Intercept_10208_descriptor, new String[]{"ShipModelId", "RewardScale", "GuardId", "ShipId", "Level", "BattleMsg", "Record", "WorldLv"});
      internal_static_crossTransport_com_gzbz_protobuf_S2CR_WaterTransportGm_10209_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_crossTransport_com_gzbz_protobuf_S2CR_WaterTransportGm_10209_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_S2CR_WaterTransportGm_10209_descriptor, new String[]{"Cmd", "Params"});
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_ShipArrive_10210_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_ShipArrive_10210_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_CR2S_ShipArrive_10210_descriptor, new String[]{"River", "ShipId"});
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_BeInterceptLog_10211_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_BeInterceptLog_10211_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_CR2S_BeInterceptLog_10211_descriptor, new String[]{"ShipId", "RewardScale", "BeInterceptCount", "Level", "Record", "BattleMsg", "WorldLv"});
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_PlayerShipArrive_10212_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_PlayerShipArrive_10212_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_CR2S_PlayerShipArrive_10212_descriptor, new String[]{"ShipId", "RewardScale", "BeInterceptCount", "GuardId", "Level", "Record", "ExRewardScale", "ShipModelId", "WorldLv"});
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_Ship_10213_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_Ship_10213_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_CR2S_Ship_10213_descriptor, new String[]{"ShipData"});
      internal_static_crossTransport_com_gzbz_protobuf_CargoShipRankData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_crossTransport_com_gzbz_protobuf_CargoShipRankData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_CargoShipRankData_descriptor, new String[]{"PlayerId", "Rank"});
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_RankReward_10214_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_RankReward_10214_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_CR2S_RankReward_10214_descriptor, new String[]{"RankList"});
      internal_static_crossTransport_com_gzbz_protobuf_S2CR_WaterTransportArrayingInfo_10215_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_crossTransport_com_gzbz_protobuf_S2CR_WaterTransportArrayingInfo_10215_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_S2CR_WaterTransportArrayingInfo_10215_descriptor, new String[]{"ShipId"});
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_Remains_10216_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_Remains_10216_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_CR2S_Remains_10216_descriptor, new String[]{"Remains"});
      internal_static_crossTransport_com_gzbz_protobuf_CrossRemainsData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_crossTransport_com_gzbz_protobuf_CrossRemainsData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_CrossRemainsData_descriptor, new String[]{"Id", "ShipModelId", "BelongPlayer"});
      internal_static_crossTransport_com_gzbz_protobuf_S2CR_RemainsReward_10217_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_crossTransport_com_gzbz_protobuf_S2CR_RemainsReward_10217_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_S2CR_RemainsReward_10217_descriptor, new String[]{"River", "RemainsId"});
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_RemainsReward_10218_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_RemainsReward_10218_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_CR2S_RemainsReward_10218_descriptor, new String[]{"River", "Remains"});
      internal_static_crossTransport_com_gzbz_protobuf_S2CR_RemainsRewardOneKey_10219_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_crossTransport_com_gzbz_protobuf_S2CR_RemainsRewardOneKey_10219_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_S2CR_RemainsRewardOneKey_10219_descriptor, new String[]{"River", "GotRemains"});
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_RemainsRewardOneKey_10220_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_RemainsRewardOneKey_10220_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_CR2S_RemainsRewardOneKey_10220_descriptor, new String[]{"River", "Remains"});
      internal_static_crossTransport_com_gzbz_protobuf_S2CR_PlayerShips_10221_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_crossTransport_com_gzbz_protobuf_S2CR_PlayerShips_10221_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_S2CR_PlayerShips_10221_descriptor, new String[]{"PlayerId"});
      internal_static_crossTransport_com_gzbz_protobuf_S2CR_GoldShip_10222_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_crossTransport_com_gzbz_protobuf_S2CR_GoldShip_10222_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_S2CR_GoldShip_10222_descriptor, new String[0]);
      internal_static_crossTransport_com_gzbz_protobuf_S2CR_GoldDamageRank_10223_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_crossTransport_com_gzbz_protobuf_S2CR_GoldDamageRank_10223_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_S2CR_GoldDamageRank_10223_descriptor, new String[]{"Limit"});
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipIntercept_10224_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipIntercept_10224_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipIntercept_10224_descriptor, new String[]{"Stage", "IsKill", "BattleMsg", "ShipType"});
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipNotify_10225_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipNotify_10225_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipNotify_10225_descriptor, new String[]{"GoldInfo"});
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipDamageReward_10226_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipDamageReward_10226_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipDamageReward_10226_descriptor, new String[]{"Damage", "ShipType", "RankData"});
      internal_static_crossTransport_com_gzbz_protobuf_S2CR_InterceptGoldShip_10227_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_crossTransport_com_gzbz_protobuf_S2CR_InterceptGoldShip_10227_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_crossTransport_com_gzbz_protobuf_S2CR_InterceptGoldShip_10227_descriptor, new String[]{"HeroArrayingData", "ShipType"});
      WaterTransportMsg.getDescriptor();
      BattleMsg.getDescriptor();
   }

   public static final class AltarData extends GeneratedMessageV3 implements AltarDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int ID_FIELD_NUMBER = 2;
      private int id_;
      public static final int EXP_FIELD_NUMBER = 3;
      private int exp_;
      private byte memoizedIsInitialized;
      private static final AltarData DEFAULT_INSTANCE = new AltarData();
      /** @deprecated */
      @Deprecated
      public static final Parser<AltarData> PARSER = new AbstractParser<AltarData>() {
         public AltarData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new AltarData(input, extensionRegistry);
         }
      };

      private AltarData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private AltarData() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new AltarData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private AltarData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_AltarData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_AltarData_fieldAccessorTable.ensureFieldAccessorsInitialized(AltarData.class, Builder.class);
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

      public boolean hasExp() {
         return (this.bitField0_ & 4) != 0;
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
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasId()) {
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
            output.writeInt32(1, this.type_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.id_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.exp_);
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
               size += CodedOutputStream.computeInt32Size(3, this.exp_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof AltarData)) {
            return super.equals(obj);
         } else {
            AltarData other = (AltarData)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
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
            if (this.hasType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getType();
            }

            if (this.hasId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getId();
            }

            if (this.hasExp()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getExp();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static AltarData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (AltarData)PARSER.parseFrom(data);
      }

      public static AltarData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (AltarData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static AltarData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (AltarData)PARSER.parseFrom(data);
      }

      public static AltarData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (AltarData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static AltarData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (AltarData)PARSER.parseFrom(data);
      }

      public static AltarData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (AltarData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static AltarData parseFrom(InputStream input) throws IOException {
         return (AltarData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static AltarData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (AltarData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static AltarData parseDelimitedFrom(InputStream input) throws IOException {
         return (AltarData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static AltarData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (AltarData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static AltarData parseFrom(CodedInputStream input) throws IOException {
         return (AltarData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static AltarData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (AltarData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(AltarData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static AltarData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<AltarData> parser() {
         return PARSER;
      }

      public Parser<AltarData> getParserForType() {
         return PARSER;
      }

      public AltarData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AltarDataOrBuilder {
         private int bitField0_;
         private int type_;
         private int id_;
         private int exp_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_AltarData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_AltarData_fieldAccessorTable.ensureFieldAccessorsInitialized(AltarData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.AltarData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.id_ = 0;
            this.bitField0_ &= -3;
            this.exp_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_AltarData_descriptor;
         }

         public AltarData getDefaultInstanceForType() {
            return CrossWaterTransportMsg.AltarData.getDefaultInstance();
         }

         public AltarData build() {
            AltarData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public AltarData buildPartial() {
            AltarData result = new AltarData(this);
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
               result.exp_ = this.exp_;
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
            if (other instanceof AltarData) {
               return this.mergeFrom((AltarData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(AltarData other) {
            if (other == CrossWaterTransportMsg.AltarData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasId()) {
                  this.setId(other.getId());
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
            if (!this.hasType()) {
               return false;
            } else if (!this.hasId()) {
               return false;
            } else {
               return this.hasExp();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            AltarData parsedMessage = null;

            try {
               parsedMessage = (AltarData)CrossWaterTransportMsg.AltarData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (AltarData)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_ShipList_10201 extends GeneratedMessageV3 implements S2CR_ShipList_10201OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RIVER_FIELD_NUMBER = 1;
      private int river_;
      public static final int GOTREMAINS_FIELD_NUMBER = 2;
      private Internal.IntList gotRemains_;
      private byte memoizedIsInitialized;
      private static final S2CR_ShipList_10201 DEFAULT_INSTANCE = new S2CR_ShipList_10201();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_ShipList_10201> PARSER = new AbstractParser<S2CR_ShipList_10201>() {
         public S2CR_ShipList_10201 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_ShipList_10201(input, extensionRegistry);
         }
      };

      private S2CR_ShipList_10201(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_ShipList_10201() {
         this.memoizedIsInitialized = -1;
         this.gotRemains_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_ShipList_10201();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_ShipList_10201(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.river_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.gotRemains_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.gotRemains_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotRemains_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.gotRemains_.addInt(input.readInt32());
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
                  this.gotRemains_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_ShipList_10201_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_ShipList_10201_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ShipList_10201.class, Builder.class);
      }

      public boolean hasRiver() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRiver() {
         return this.river_;
      }

      public List<Integer> getGotRemainsList() {
         return this.gotRemains_;
      }

      public int getGotRemainsCount() {
         return this.gotRemains_.size();
      }

      public int getGotRemains(int index) {
         return this.gotRemains_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRiver()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.river_);
         }

         for(int i = 0; i < this.gotRemains_.size(); ++i) {
            output.writeInt32(2, this.gotRemains_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.river_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.gotRemains_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotRemains_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotRemainsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_ShipList_10201)) {
            return super.equals(obj);
         } else {
            S2CR_ShipList_10201 other = (S2CR_ShipList_10201)obj;
            if (this.hasRiver() != other.hasRiver()) {
               return false;
            } else if (this.hasRiver() && this.getRiver() != other.getRiver()) {
               return false;
            } else if (!this.getGotRemainsList().equals(other.getGotRemainsList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasRiver()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRiver();
            }

            if (this.getGotRemainsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGotRemainsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_ShipList_10201 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_ShipList_10201)PARSER.parseFrom(data);
      }

      public static S2CR_ShipList_10201 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ShipList_10201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ShipList_10201 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_ShipList_10201)PARSER.parseFrom(data);
      }

      public static S2CR_ShipList_10201 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ShipList_10201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ShipList_10201 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_ShipList_10201)PARSER.parseFrom(data);
      }

      public static S2CR_ShipList_10201 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_ShipList_10201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_ShipList_10201 parseFrom(InputStream input) throws IOException {
         return (S2CR_ShipList_10201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ShipList_10201 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ShipList_10201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ShipList_10201 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_ShipList_10201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_ShipList_10201 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ShipList_10201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_ShipList_10201 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_ShipList_10201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_ShipList_10201 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_ShipList_10201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_ShipList_10201 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_ShipList_10201 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_ShipList_10201> parser() {
         return PARSER;
      }

      public Parser<S2CR_ShipList_10201> getParserForType() {
         return PARSER;
      }

      public S2CR_ShipList_10201 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_ShipList_10201OrBuilder {
         private int bitField0_;
         private int river_;
         private Internal.IntList gotRemains_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_ShipList_10201_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_ShipList_10201_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_ShipList_10201.class, Builder.class);
         }

         private Builder() {
            this.gotRemains_ = CrossWaterTransportMsg.S2CR_ShipList_10201.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotRemains_ = CrossWaterTransportMsg.S2CR_ShipList_10201.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.S2CR_ShipList_10201.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.river_ = 0;
            this.bitField0_ &= -2;
            this.gotRemains_ = CrossWaterTransportMsg.S2CR_ShipList_10201.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_ShipList_10201_descriptor;
         }

         public S2CR_ShipList_10201 getDefaultInstanceForType() {
            return CrossWaterTransportMsg.S2CR_ShipList_10201.getDefaultInstance();
         }

         public S2CR_ShipList_10201 build() {
            S2CR_ShipList_10201 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_ShipList_10201 buildPartial() {
            S2CR_ShipList_10201 result = new S2CR_ShipList_10201(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.river_ = this.river_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.gotRemains_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.gotRemains_ = this.gotRemains_;
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
            if (other instanceof S2CR_ShipList_10201) {
               return this.mergeFrom((S2CR_ShipList_10201)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_ShipList_10201 other) {
            if (other == CrossWaterTransportMsg.S2CR_ShipList_10201.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRiver()) {
                  this.setRiver(other.getRiver());
               }

               if (!other.gotRemains_.isEmpty()) {
                  if (this.gotRemains_.isEmpty()) {
                     this.gotRemains_ = other.gotRemains_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureGotRemainsIsMutable();
                     this.gotRemains_.addAll(other.gotRemains_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRiver();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_ShipList_10201 parsedMessage = null;

            try {
               parsedMessage = (S2CR_ShipList_10201)CrossWaterTransportMsg.S2CR_ShipList_10201.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_ShipList_10201)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRiver() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRiver() {
            return this.river_;
         }

         public Builder setRiver(int value) {
            this.bitField0_ |= 1;
            this.river_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRiver() {
            this.bitField0_ &= -2;
            this.river_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureGotRemainsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.gotRemains_ = CrossWaterTransportMsg.S2CR_ShipList_10201.mutableCopy(this.gotRemains_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getGotRemainsList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.gotRemains_) : this.gotRemains_);
         }

         public int getGotRemainsCount() {
            return this.gotRemains_.size();
         }

         public int getGotRemains(int index) {
            return this.gotRemains_.getInt(index);
         }

         public Builder setGotRemains(int index, int value) {
            this.ensureGotRemainsIsMutable();
            this.gotRemains_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGotRemains(int value) {
            this.ensureGotRemainsIsMutable();
            this.gotRemains_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGotRemains(Iterable<? extends Integer> values) {
            this.ensureGotRemainsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotRemains_);
            this.onChanged();
            return this;
         }

         public Builder clearGotRemains() {
            this.gotRemains_ = CrossWaterTransportMsg.S2CR_ShipList_10201.emptyIntList();
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

   public static final class S2CR_Altar_10202 extends GeneratedMessageV3 implements S2CR_Altar_10202OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final S2CR_Altar_10202 DEFAULT_INSTANCE = new S2CR_Altar_10202();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_Altar_10202> PARSER = new AbstractParser<S2CR_Altar_10202>() {
         public S2CR_Altar_10202 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_Altar_10202(input, extensionRegistry);
         }
      };

      private S2CR_Altar_10202(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_Altar_10202() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_Altar_10202();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_Altar_10202(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_Altar_10202_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_Altar_10202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Altar_10202.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_Altar_10202)) {
            return super.equals(obj);
         } else {
            S2CR_Altar_10202 other = (S2CR_Altar_10202)obj;
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

      public static S2CR_Altar_10202 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_Altar_10202)PARSER.parseFrom(data);
      }

      public static S2CR_Altar_10202 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Altar_10202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Altar_10202 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_Altar_10202)PARSER.parseFrom(data);
      }

      public static S2CR_Altar_10202 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Altar_10202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Altar_10202 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_Altar_10202)PARSER.parseFrom(data);
      }

      public static S2CR_Altar_10202 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Altar_10202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Altar_10202 parseFrom(InputStream input) throws IOException {
         return (S2CR_Altar_10202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Altar_10202 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Altar_10202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Altar_10202 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_Altar_10202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_Altar_10202 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Altar_10202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Altar_10202 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_Altar_10202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Altar_10202 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Altar_10202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_Altar_10202 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_Altar_10202 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_Altar_10202> parser() {
         return PARSER;
      }

      public Parser<S2CR_Altar_10202> getParserForType() {
         return PARSER;
      }

      public S2CR_Altar_10202 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_Altar_10202OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_Altar_10202_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_Altar_10202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Altar_10202.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.S2CR_Altar_10202.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_Altar_10202_descriptor;
         }

         public S2CR_Altar_10202 getDefaultInstanceForType() {
            return CrossWaterTransportMsg.S2CR_Altar_10202.getDefaultInstance();
         }

         public S2CR_Altar_10202 build() {
            S2CR_Altar_10202 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_Altar_10202 buildPartial() {
            S2CR_Altar_10202 result = new S2CR_Altar_10202(this);
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
            if (other instanceof S2CR_Altar_10202) {
               return this.mergeFrom((S2CR_Altar_10202)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_Altar_10202 other) {
            if (other == CrossWaterTransportMsg.S2CR_Altar_10202.getDefaultInstance()) {
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
            S2CR_Altar_10202 parsedMessage = null;

            try {
               parsedMessage = (S2CR_Altar_10202)CrossWaterTransportMsg.S2CR_Altar_10202.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_Altar_10202)e.getUnfinishedMessage();
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

   public static final class S2CR_Sacrifice_10203 extends GeneratedMessageV3 implements S2CR_Sacrifice_10203OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int EXP_FIELD_NUMBER = 2;
      private int exp_;
      public static final int OP_FIELD_NUMBER = 3;
      private int op_;
      private byte memoizedIsInitialized;
      private static final S2CR_Sacrifice_10203 DEFAULT_INSTANCE = new S2CR_Sacrifice_10203();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_Sacrifice_10203> PARSER = new AbstractParser<S2CR_Sacrifice_10203>() {
         public S2CR_Sacrifice_10203 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_Sacrifice_10203(input, extensionRegistry);
         }
      };

      private S2CR_Sacrifice_10203(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_Sacrifice_10203() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_Sacrifice_10203();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_Sacrifice_10203(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.exp_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.op_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_Sacrifice_10203_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_Sacrifice_10203_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Sacrifice_10203.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasExp() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getExp() {
         return this.exp_;
      }

      public boolean hasOp() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getOp() {
         return this.op_;
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
         } else if (!this.hasExp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOp()) {
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
            output.writeInt32(2, this.exp_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.op_);
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
               size += CodedOutputStream.computeInt32Size(2, this.exp_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.op_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_Sacrifice_10203)) {
            return super.equals(obj);
         } else {
            S2CR_Sacrifice_10203 other = (S2CR_Sacrifice_10203)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasExp() != other.hasExp()) {
               return false;
            } else if (this.hasExp() && this.getExp() != other.getExp()) {
               return false;
            } else if (this.hasOp() != other.hasOp()) {
               return false;
            } else if (this.hasOp() && this.getOp() != other.getOp()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasExp()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getExp();
            }

            if (this.hasOp()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getOp();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_Sacrifice_10203 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_Sacrifice_10203)PARSER.parseFrom(data);
      }

      public static S2CR_Sacrifice_10203 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Sacrifice_10203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Sacrifice_10203 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_Sacrifice_10203)PARSER.parseFrom(data);
      }

      public static S2CR_Sacrifice_10203 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Sacrifice_10203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Sacrifice_10203 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_Sacrifice_10203)PARSER.parseFrom(data);
      }

      public static S2CR_Sacrifice_10203 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Sacrifice_10203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Sacrifice_10203 parseFrom(InputStream input) throws IOException {
         return (S2CR_Sacrifice_10203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Sacrifice_10203 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Sacrifice_10203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Sacrifice_10203 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_Sacrifice_10203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_Sacrifice_10203 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Sacrifice_10203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Sacrifice_10203 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_Sacrifice_10203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Sacrifice_10203 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Sacrifice_10203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_Sacrifice_10203 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_Sacrifice_10203 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_Sacrifice_10203> parser() {
         return PARSER;
      }

      public Parser<S2CR_Sacrifice_10203> getParserForType() {
         return PARSER;
      }

      public S2CR_Sacrifice_10203 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_Sacrifice_10203OrBuilder {
         private int bitField0_;
         private int type_;
         private int exp_;
         private int op_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_Sacrifice_10203_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_Sacrifice_10203_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Sacrifice_10203.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.S2CR_Sacrifice_10203.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.exp_ = 0;
            this.bitField0_ &= -3;
            this.op_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_Sacrifice_10203_descriptor;
         }

         public S2CR_Sacrifice_10203 getDefaultInstanceForType() {
            return CrossWaterTransportMsg.S2CR_Sacrifice_10203.getDefaultInstance();
         }

         public S2CR_Sacrifice_10203 build() {
            S2CR_Sacrifice_10203 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_Sacrifice_10203 buildPartial() {
            S2CR_Sacrifice_10203 result = new S2CR_Sacrifice_10203(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.exp_ = this.exp_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.op_ = this.op_;
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
            if (other instanceof S2CR_Sacrifice_10203) {
               return this.mergeFrom((S2CR_Sacrifice_10203)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_Sacrifice_10203 other) {
            if (other == CrossWaterTransportMsg.S2CR_Sacrifice_10203.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasExp()) {
                  this.setExp(other.getExp());
               }

               if (other.hasOp()) {
                  this.setOp(other.getOp());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else if (!this.hasExp()) {
               return false;
            } else {
               return this.hasOp();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_Sacrifice_10203 parsedMessage = null;

            try {
               parsedMessage = (S2CR_Sacrifice_10203)CrossWaterTransportMsg.S2CR_Sacrifice_10203.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_Sacrifice_10203)e.getUnfinishedMessage();
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

         public boolean hasExp() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getExp() {
            return this.exp_;
         }

         public Builder setExp(int value) {
            this.bitField0_ |= 2;
            this.exp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearExp() {
            this.bitField0_ &= -3;
            this.exp_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOp() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getOp() {
            return this.op_;
         }

         public Builder setOp(int value) {
            this.bitField0_ |= 4;
            this.op_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOp() {
            this.bitField0_ &= -5;
            this.op_ = 0;
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

   public static final class CR2S_SacrificeInfo_10204 extends GeneratedMessageV3 implements CR2S_SacrificeInfo_10204OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ISNOTIFY_FIELD_NUMBER = 1;
      private boolean isNotify_;
      public static final int ALTAR_FIELD_NUMBER = 2;
      private AltarData altar_;
      private byte memoizedIsInitialized;
      private static final CR2S_SacrificeInfo_10204 DEFAULT_INSTANCE = new CR2S_SacrificeInfo_10204();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_SacrificeInfo_10204> PARSER = new AbstractParser<CR2S_SacrificeInfo_10204>() {
         public CR2S_SacrificeInfo_10204 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_SacrificeInfo_10204(input, extensionRegistry);
         }
      };

      private CR2S_SacrificeInfo_10204(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_SacrificeInfo_10204() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_SacrificeInfo_10204();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_SacrificeInfo_10204(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.isNotify_ = input.readBool();
                        break;
                     case 18:
                        AltarData.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.altar_.toBuilder();
                        }

                        this.altar_ = (AltarData)input.readMessage(CrossWaterTransportMsg.AltarData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.altar_);
                           this.altar_ = subBuilder.buildPartial();
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
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_SacrificeInfo_10204_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_SacrificeInfo_10204_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_SacrificeInfo_10204.class, Builder.class);
      }

      public boolean hasIsNotify() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getIsNotify() {
         return this.isNotify_;
      }

      public boolean hasAltar() {
         return (this.bitField0_ & 2) != 0;
      }

      public AltarData getAltar() {
         return this.altar_ == null ? CrossWaterTransportMsg.AltarData.getDefaultInstance() : this.altar_;
      }

      public AltarDataOrBuilder getAltarOrBuilder() {
         return this.altar_ == null ? CrossWaterTransportMsg.AltarData.getDefaultInstance() : this.altar_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasIsNotify()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAltar()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getAltar().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.isNotify_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getAltar());
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
               size += CodedOutputStream.computeBoolSize(1, this.isNotify_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getAltar());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_SacrificeInfo_10204)) {
            return super.equals(obj);
         } else {
            CR2S_SacrificeInfo_10204 other = (CR2S_SacrificeInfo_10204)obj;
            if (this.hasIsNotify() != other.hasIsNotify()) {
               return false;
            } else if (this.hasIsNotify() && this.getIsNotify() != other.getIsNotify()) {
               return false;
            } else if (this.hasAltar() != other.hasAltar()) {
               return false;
            } else if (this.hasAltar() && !this.getAltar().equals(other.getAltar())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasIsNotify()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getIsNotify());
            }

            if (this.hasAltar()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getAltar().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_SacrificeInfo_10204 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_SacrificeInfo_10204)PARSER.parseFrom(data);
      }

      public static CR2S_SacrificeInfo_10204 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_SacrificeInfo_10204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_SacrificeInfo_10204 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_SacrificeInfo_10204)PARSER.parseFrom(data);
      }

      public static CR2S_SacrificeInfo_10204 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_SacrificeInfo_10204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_SacrificeInfo_10204 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_SacrificeInfo_10204)PARSER.parseFrom(data);
      }

      public static CR2S_SacrificeInfo_10204 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_SacrificeInfo_10204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_SacrificeInfo_10204 parseFrom(InputStream input) throws IOException {
         return (CR2S_SacrificeInfo_10204)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_SacrificeInfo_10204 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_SacrificeInfo_10204)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_SacrificeInfo_10204 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_SacrificeInfo_10204)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_SacrificeInfo_10204 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_SacrificeInfo_10204)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_SacrificeInfo_10204 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_SacrificeInfo_10204)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_SacrificeInfo_10204 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_SacrificeInfo_10204)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_SacrificeInfo_10204 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_SacrificeInfo_10204 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_SacrificeInfo_10204> parser() {
         return PARSER;
      }

      public Parser<CR2S_SacrificeInfo_10204> getParserForType() {
         return PARSER;
      }

      public CR2S_SacrificeInfo_10204 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_SacrificeInfo_10204OrBuilder {
         private int bitField0_;
         private boolean isNotify_;
         private AltarData altar_;
         private SingleFieldBuilderV3<AltarData, AltarData.Builder, AltarDataOrBuilder> altarBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_SacrificeInfo_10204_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_SacrificeInfo_10204_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_SacrificeInfo_10204.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.CR2S_SacrificeInfo_10204.alwaysUseFieldBuilders) {
               this.getAltarFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.isNotify_ = false;
            this.bitField0_ &= -2;
            if (this.altarBuilder_ == null) {
               this.altar_ = null;
            } else {
               this.altarBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_SacrificeInfo_10204_descriptor;
         }

         public CR2S_SacrificeInfo_10204 getDefaultInstanceForType() {
            return CrossWaterTransportMsg.CR2S_SacrificeInfo_10204.getDefaultInstance();
         }

         public CR2S_SacrificeInfo_10204 build() {
            CR2S_SacrificeInfo_10204 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_SacrificeInfo_10204 buildPartial() {
            CR2S_SacrificeInfo_10204 result = new CR2S_SacrificeInfo_10204(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.isNotify_ = this.isNotify_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.altarBuilder_ == null) {
                  result.altar_ = this.altar_;
               } else {
                  result.altar_ = (AltarData)this.altarBuilder_.build();
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
            if (other instanceof CR2S_SacrificeInfo_10204) {
               return this.mergeFrom((CR2S_SacrificeInfo_10204)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_SacrificeInfo_10204 other) {
            if (other == CrossWaterTransportMsg.CR2S_SacrificeInfo_10204.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasIsNotify()) {
                  this.setIsNotify(other.getIsNotify());
               }

               if (other.hasAltar()) {
                  this.mergeAltar(other.getAltar());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasIsNotify()) {
               return false;
            } else if (!this.hasAltar()) {
               return false;
            } else {
               return this.getAltar().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_SacrificeInfo_10204 parsedMessage = null;

            try {
               parsedMessage = (CR2S_SacrificeInfo_10204)CrossWaterTransportMsg.CR2S_SacrificeInfo_10204.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_SacrificeInfo_10204)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasIsNotify() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getIsNotify() {
            return this.isNotify_;
         }

         public Builder setIsNotify(boolean value) {
            this.bitField0_ |= 1;
            this.isNotify_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsNotify() {
            this.bitField0_ &= -2;
            this.isNotify_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasAltar() {
            return (this.bitField0_ & 2) != 0;
         }

         public AltarData getAltar() {
            if (this.altarBuilder_ == null) {
               return this.altar_ == null ? CrossWaterTransportMsg.AltarData.getDefaultInstance() : this.altar_;
            } else {
               return (AltarData)this.altarBuilder_.getMessage();
            }
         }

         public Builder setAltar(AltarData value) {
            if (this.altarBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.altar_ = value;
               this.onChanged();
            } else {
               this.altarBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setAltar(AltarData.Builder builderForValue) {
            if (this.altarBuilder_ == null) {
               this.altar_ = builderForValue.build();
               this.onChanged();
            } else {
               this.altarBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeAltar(AltarData value) {
            if (this.altarBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.altar_ != null && this.altar_ != CrossWaterTransportMsg.AltarData.getDefaultInstance()) {
                  this.altar_ = CrossWaterTransportMsg.AltarData.newBuilder(this.altar_).mergeFrom(value).buildPartial();
               } else {
                  this.altar_ = value;
               }

               this.onChanged();
            } else {
               this.altarBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearAltar() {
            if (this.altarBuilder_ == null) {
               this.altar_ = null;
               this.onChanged();
            } else {
               this.altarBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public AltarData.Builder getAltarBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (AltarData.Builder)this.getAltarFieldBuilder().getBuilder();
         }

         public AltarDataOrBuilder getAltarOrBuilder() {
            if (this.altarBuilder_ != null) {
               return (AltarDataOrBuilder)this.altarBuilder_.getMessageOrBuilder();
            } else {
               return this.altar_ == null ? CrossWaterTransportMsg.AltarData.getDefaultInstance() : this.altar_;
            }
         }

         private SingleFieldBuilderV3<AltarData, AltarData.Builder, AltarDataOrBuilder> getAltarFieldBuilder() {
            if (this.altarBuilder_ == null) {
               this.altarBuilder_ = new SingleFieldBuilderV3(this.getAltar(), this.getParentForChildren(), this.isClean());
               this.altar_ = null;
            }

            return this.altarBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_Sail_10205 extends GeneratedMessageV3 implements S2CR_Sail_10205OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SHIPDATA_FIELD_NUMBER = 1;
      private WaterTransportMsg.ShipInfo shipData_;
      public static final int ARRAYINGDATA_FIELD_NUMBER = 2;
      private ByteString arrayingData_;
      public static final int LEVEL_FIELD_NUMBER = 3;
      private int level_;
      private byte memoizedIsInitialized;
      private static final S2CR_Sail_10205 DEFAULT_INSTANCE = new S2CR_Sail_10205();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_Sail_10205> PARSER = new AbstractParser<S2CR_Sail_10205>() {
         public S2CR_Sail_10205 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_Sail_10205(input, extensionRegistry);
         }
      };

      private S2CR_Sail_10205(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_Sail_10205() {
         this.memoizedIsInitialized = -1;
         this.arrayingData_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_Sail_10205();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_Sail_10205(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        WaterTransportMsg.ShipInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.shipData_.toBuilder();
                        }

                        this.shipData_ = (WaterTransportMsg.ShipInfo)input.readMessage(WaterTransportMsg.ShipInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.shipData_);
                           this.shipData_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        this.bitField0_ |= 2;
                        this.arrayingData_ = input.readBytes();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
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
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_Sail_10205_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_Sail_10205_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Sail_10205.class, Builder.class);
      }

      public boolean hasShipData() {
         return (this.bitField0_ & 1) != 0;
      }

      public WaterTransportMsg.ShipInfo getShipData() {
         return this.shipData_ == null ? WaterTransportMsg.ShipInfo.getDefaultInstance() : this.shipData_;
      }

      public WaterTransportMsg.ShipInfoOrBuilder getShipDataOrBuilder() {
         return this.shipData_ == null ? WaterTransportMsg.ShipInfo.getDefaultInstance() : this.shipData_;
      }

      public boolean hasArrayingData() {
         return (this.bitField0_ & 2) != 0;
      }

      public ByteString getArrayingData() {
         return this.arrayingData_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 4) != 0;
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
         } else if (!this.hasShipData()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasArrayingData()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getShipData().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getShipData());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBytes(2, this.arrayingData_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.level_);
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
               size += CodedOutputStream.computeMessageSize(1, this.getShipData());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBytesSize(2, this.arrayingData_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.level_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_Sail_10205)) {
            return super.equals(obj);
         } else {
            S2CR_Sail_10205 other = (S2CR_Sail_10205)obj;
            if (this.hasShipData() != other.hasShipData()) {
               return false;
            } else if (this.hasShipData() && !this.getShipData().equals(other.getShipData())) {
               return false;
            } else if (this.hasArrayingData() != other.hasArrayingData()) {
               return false;
            } else if (this.hasArrayingData() && !this.getArrayingData().equals(other.getArrayingData())) {
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
            if (this.hasShipData()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getShipData().hashCode();
            }

            if (this.hasArrayingData()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getArrayingData().hashCode();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLevel();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_Sail_10205 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_Sail_10205)PARSER.parseFrom(data);
      }

      public static S2CR_Sail_10205 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Sail_10205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Sail_10205 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_Sail_10205)PARSER.parseFrom(data);
      }

      public static S2CR_Sail_10205 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Sail_10205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Sail_10205 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_Sail_10205)PARSER.parseFrom(data);
      }

      public static S2CR_Sail_10205 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Sail_10205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Sail_10205 parseFrom(InputStream input) throws IOException {
         return (S2CR_Sail_10205)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Sail_10205 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Sail_10205)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Sail_10205 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_Sail_10205)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_Sail_10205 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Sail_10205)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Sail_10205 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_Sail_10205)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Sail_10205 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Sail_10205)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_Sail_10205 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_Sail_10205 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_Sail_10205> parser() {
         return PARSER;
      }

      public Parser<S2CR_Sail_10205> getParserForType() {
         return PARSER;
      }

      public S2CR_Sail_10205 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_Sail_10205OrBuilder {
         private int bitField0_;
         private WaterTransportMsg.ShipInfo shipData_;
         private SingleFieldBuilderV3<WaterTransportMsg.ShipInfo, WaterTransportMsg.ShipInfo.Builder, WaterTransportMsg.ShipInfoOrBuilder> shipDataBuilder_;
         private ByteString arrayingData_;
         private int level_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_Sail_10205_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_Sail_10205_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Sail_10205.class, Builder.class);
         }

         private Builder() {
            this.arrayingData_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.arrayingData_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.S2CR_Sail_10205.alwaysUseFieldBuilders) {
               this.getShipDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.shipDataBuilder_ == null) {
               this.shipData_ = null;
            } else {
               this.shipDataBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.arrayingData_ = ByteString.EMPTY;
            this.bitField0_ &= -3;
            this.level_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_Sail_10205_descriptor;
         }

         public S2CR_Sail_10205 getDefaultInstanceForType() {
            return CrossWaterTransportMsg.S2CR_Sail_10205.getDefaultInstance();
         }

         public S2CR_Sail_10205 build() {
            S2CR_Sail_10205 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_Sail_10205 buildPartial() {
            S2CR_Sail_10205 result = new S2CR_Sail_10205(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.shipDataBuilder_ == null) {
                  result.shipData_ = this.shipData_;
               } else {
                  result.shipData_ = (WaterTransportMsg.ShipInfo)this.shipDataBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.arrayingData_ = this.arrayingData_;
            if ((from_bitField0_ & 4) != 0) {
               result.level_ = this.level_;
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
            if (other instanceof S2CR_Sail_10205) {
               return this.mergeFrom((S2CR_Sail_10205)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_Sail_10205 other) {
            if (other == CrossWaterTransportMsg.S2CR_Sail_10205.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasShipData()) {
                  this.mergeShipData(other.getShipData());
               }

               if (other.hasArrayingData()) {
                  this.setArrayingData(other.getArrayingData());
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
            if (!this.hasShipData()) {
               return false;
            } else if (!this.hasArrayingData()) {
               return false;
            } else if (!this.hasLevel()) {
               return false;
            } else {
               return this.getShipData().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_Sail_10205 parsedMessage = null;

            try {
               parsedMessage = (S2CR_Sail_10205)CrossWaterTransportMsg.S2CR_Sail_10205.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_Sail_10205)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasShipData() {
            return (this.bitField0_ & 1) != 0;
         }

         public WaterTransportMsg.ShipInfo getShipData() {
            if (this.shipDataBuilder_ == null) {
               return this.shipData_ == null ? WaterTransportMsg.ShipInfo.getDefaultInstance() : this.shipData_;
            } else {
               return (WaterTransportMsg.ShipInfo)this.shipDataBuilder_.getMessage();
            }
         }

         public Builder setShipData(WaterTransportMsg.ShipInfo value) {
            if (this.shipDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.shipData_ = value;
               this.onChanged();
            } else {
               this.shipDataBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setShipData(WaterTransportMsg.ShipInfo.Builder builderForValue) {
            if (this.shipDataBuilder_ == null) {
               this.shipData_ = builderForValue.build();
               this.onChanged();
            } else {
               this.shipDataBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeShipData(WaterTransportMsg.ShipInfo value) {
            if (this.shipDataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.shipData_ != null && this.shipData_ != WaterTransportMsg.ShipInfo.getDefaultInstance()) {
                  this.shipData_ = WaterTransportMsg.ShipInfo.newBuilder(this.shipData_).mergeFrom(value).buildPartial();
               } else {
                  this.shipData_ = value;
               }

               this.onChanged();
            } else {
               this.shipDataBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearShipData() {
            if (this.shipDataBuilder_ == null) {
               this.shipData_ = null;
               this.onChanged();
            } else {
               this.shipDataBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public WaterTransportMsg.ShipInfo.Builder getShipDataBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (WaterTransportMsg.ShipInfo.Builder)this.getShipDataFieldBuilder().getBuilder();
         }

         public WaterTransportMsg.ShipInfoOrBuilder getShipDataOrBuilder() {
            if (this.shipDataBuilder_ != null) {
               return (WaterTransportMsg.ShipInfoOrBuilder)this.shipDataBuilder_.getMessageOrBuilder();
            } else {
               return this.shipData_ == null ? WaterTransportMsg.ShipInfo.getDefaultInstance() : this.shipData_;
            }
         }

         private SingleFieldBuilderV3<WaterTransportMsg.ShipInfo, WaterTransportMsg.ShipInfo.Builder, WaterTransportMsg.ShipInfoOrBuilder> getShipDataFieldBuilder() {
            if (this.shipDataBuilder_ == null) {
               this.shipDataBuilder_ = new SingleFieldBuilderV3(this.getShipData(), this.getParentForChildren(), this.isClean());
               this.shipData_ = null;
            }

            return this.shipDataBuilder_;
         }

         public boolean hasArrayingData() {
            return (this.bitField0_ & 2) != 0;
         }

         public ByteString getArrayingData() {
            return this.arrayingData_;
         }

         public Builder setArrayingData(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.arrayingData_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearArrayingData() {
            this.bitField0_ &= -3;
            this.arrayingData_ = CrossWaterTransportMsg.S2CR_Sail_10205.getDefaultInstance().getArrayingData();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_Sail_10206 extends GeneratedMessageV3 implements CR2S_Sail_10206OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SHIPDATA_FIELD_NUMBER = 1;
      private WaterTransportMsg.PlayerShipInfo shipData_;
      public static final int GUARDID_FIELD_NUMBER = 2;
      private int guardId_;
      public static final int RECORD_FIELD_NUMBER = 3;
      private WaterTransportMsg.TransportRecord record_;
      private byte memoizedIsInitialized;
      private static final CR2S_Sail_10206 DEFAULT_INSTANCE = new CR2S_Sail_10206();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_Sail_10206> PARSER = new AbstractParser<CR2S_Sail_10206>() {
         public CR2S_Sail_10206 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_Sail_10206(input, extensionRegistry);
         }
      };

      private CR2S_Sail_10206(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_Sail_10206() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_Sail_10206();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_Sail_10206(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        WaterTransportMsg.PlayerShipInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.shipData_.toBuilder();
                        }

                        this.shipData_ = (WaterTransportMsg.PlayerShipInfo)input.readMessage(WaterTransportMsg.PlayerShipInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.shipData_);
                           this.shipData_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.guardId_ = input.readInt32();
                        break;
                     case 26:
                        WaterTransportMsg.TransportRecord.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.record_.toBuilder();
                        }

                        this.record_ = (WaterTransportMsg.TransportRecord)input.readMessage(WaterTransportMsg.TransportRecord.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.record_);
                           this.record_ = subBuilder.buildPartial();
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
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_Sail_10206_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_Sail_10206_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Sail_10206.class, Builder.class);
      }

      public boolean hasShipData() {
         return (this.bitField0_ & 1) != 0;
      }

      public WaterTransportMsg.PlayerShipInfo getShipData() {
         return this.shipData_ == null ? WaterTransportMsg.PlayerShipInfo.getDefaultInstance() : this.shipData_;
      }

      public WaterTransportMsg.PlayerShipInfoOrBuilder getShipDataOrBuilder() {
         return this.shipData_ == null ? WaterTransportMsg.PlayerShipInfo.getDefaultInstance() : this.shipData_;
      }

      public boolean hasGuardId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getGuardId() {
         return this.guardId_;
      }

      public boolean hasRecord() {
         return (this.bitField0_ & 4) != 0;
      }

      public WaterTransportMsg.TransportRecord getRecord() {
         return this.record_ == null ? WaterTransportMsg.TransportRecord.getDefaultInstance() : this.record_;
      }

      public WaterTransportMsg.TransportRecordOrBuilder getRecordOrBuilder() {
         return this.record_ == null ? WaterTransportMsg.TransportRecord.getDefaultInstance() : this.record_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasShipData()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGuardId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRecord()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getShipData().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getRecord().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getShipData());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.guardId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(3, this.getRecord());
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
               size += CodedOutputStream.computeMessageSize(1, this.getShipData());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.guardId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(3, this.getRecord());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_Sail_10206)) {
            return super.equals(obj);
         } else {
            CR2S_Sail_10206 other = (CR2S_Sail_10206)obj;
            if (this.hasShipData() != other.hasShipData()) {
               return false;
            } else if (this.hasShipData() && !this.getShipData().equals(other.getShipData())) {
               return false;
            } else if (this.hasGuardId() != other.hasGuardId()) {
               return false;
            } else if (this.hasGuardId() && this.getGuardId() != other.getGuardId()) {
               return false;
            } else if (this.hasRecord() != other.hasRecord()) {
               return false;
            } else if (this.hasRecord() && !this.getRecord().equals(other.getRecord())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasShipData()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getShipData().hashCode();
            }

            if (this.hasGuardId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGuardId();
            }

            if (this.hasRecord()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRecord().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_Sail_10206 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_Sail_10206)PARSER.parseFrom(data);
      }

      public static CR2S_Sail_10206 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Sail_10206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Sail_10206 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_Sail_10206)PARSER.parseFrom(data);
      }

      public static CR2S_Sail_10206 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Sail_10206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Sail_10206 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_Sail_10206)PARSER.parseFrom(data);
      }

      public static CR2S_Sail_10206 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Sail_10206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Sail_10206 parseFrom(InputStream input) throws IOException {
         return (CR2S_Sail_10206)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Sail_10206 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Sail_10206)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Sail_10206 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_Sail_10206)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_Sail_10206 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Sail_10206)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Sail_10206 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_Sail_10206)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Sail_10206 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Sail_10206)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_Sail_10206 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_Sail_10206 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_Sail_10206> parser() {
         return PARSER;
      }

      public Parser<CR2S_Sail_10206> getParserForType() {
         return PARSER;
      }

      public CR2S_Sail_10206 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_Sail_10206OrBuilder {
         private int bitField0_;
         private WaterTransportMsg.PlayerShipInfo shipData_;
         private SingleFieldBuilderV3<WaterTransportMsg.PlayerShipInfo, WaterTransportMsg.PlayerShipInfo.Builder, WaterTransportMsg.PlayerShipInfoOrBuilder> shipDataBuilder_;
         private int guardId_;
         private WaterTransportMsg.TransportRecord record_;
         private SingleFieldBuilderV3<WaterTransportMsg.TransportRecord, WaterTransportMsg.TransportRecord.Builder, WaterTransportMsg.TransportRecordOrBuilder> recordBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_Sail_10206_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_Sail_10206_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Sail_10206.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.CR2S_Sail_10206.alwaysUseFieldBuilders) {
               this.getShipDataFieldBuilder();
               this.getRecordFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.shipDataBuilder_ == null) {
               this.shipData_ = null;
            } else {
               this.shipDataBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.guardId_ = 0;
            this.bitField0_ &= -3;
            if (this.recordBuilder_ == null) {
               this.record_ = null;
            } else {
               this.recordBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_Sail_10206_descriptor;
         }

         public CR2S_Sail_10206 getDefaultInstanceForType() {
            return CrossWaterTransportMsg.CR2S_Sail_10206.getDefaultInstance();
         }

         public CR2S_Sail_10206 build() {
            CR2S_Sail_10206 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_Sail_10206 buildPartial() {
            CR2S_Sail_10206 result = new CR2S_Sail_10206(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.shipDataBuilder_ == null) {
                  result.shipData_ = this.shipData_;
               } else {
                  result.shipData_ = (WaterTransportMsg.PlayerShipInfo)this.shipDataBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.guardId_ = this.guardId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               if (this.recordBuilder_ == null) {
                  result.record_ = this.record_;
               } else {
                  result.record_ = (WaterTransportMsg.TransportRecord)this.recordBuilder_.build();
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
            if (other instanceof CR2S_Sail_10206) {
               return this.mergeFrom((CR2S_Sail_10206)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_Sail_10206 other) {
            if (other == CrossWaterTransportMsg.CR2S_Sail_10206.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasShipData()) {
                  this.mergeShipData(other.getShipData());
               }

               if (other.hasGuardId()) {
                  this.setGuardId(other.getGuardId());
               }

               if (other.hasRecord()) {
                  this.mergeRecord(other.getRecord());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasShipData()) {
               return false;
            } else if (!this.hasGuardId()) {
               return false;
            } else if (!this.hasRecord()) {
               return false;
            } else if (!this.getShipData().isInitialized()) {
               return false;
            } else {
               return this.getRecord().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_Sail_10206 parsedMessage = null;

            try {
               parsedMessage = (CR2S_Sail_10206)CrossWaterTransportMsg.CR2S_Sail_10206.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_Sail_10206)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasShipData() {
            return (this.bitField0_ & 1) != 0;
         }

         public WaterTransportMsg.PlayerShipInfo getShipData() {
            if (this.shipDataBuilder_ == null) {
               return this.shipData_ == null ? WaterTransportMsg.PlayerShipInfo.getDefaultInstance() : this.shipData_;
            } else {
               return (WaterTransportMsg.PlayerShipInfo)this.shipDataBuilder_.getMessage();
            }
         }

         public Builder setShipData(WaterTransportMsg.PlayerShipInfo value) {
            if (this.shipDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.shipData_ = value;
               this.onChanged();
            } else {
               this.shipDataBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setShipData(WaterTransportMsg.PlayerShipInfo.Builder builderForValue) {
            if (this.shipDataBuilder_ == null) {
               this.shipData_ = builderForValue.build();
               this.onChanged();
            } else {
               this.shipDataBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeShipData(WaterTransportMsg.PlayerShipInfo value) {
            if (this.shipDataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.shipData_ != null && this.shipData_ != WaterTransportMsg.PlayerShipInfo.getDefaultInstance()) {
                  this.shipData_ = WaterTransportMsg.PlayerShipInfo.newBuilder(this.shipData_).mergeFrom(value).buildPartial();
               } else {
                  this.shipData_ = value;
               }

               this.onChanged();
            } else {
               this.shipDataBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearShipData() {
            if (this.shipDataBuilder_ == null) {
               this.shipData_ = null;
               this.onChanged();
            } else {
               this.shipDataBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public WaterTransportMsg.PlayerShipInfo.Builder getShipDataBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (WaterTransportMsg.PlayerShipInfo.Builder)this.getShipDataFieldBuilder().getBuilder();
         }

         public WaterTransportMsg.PlayerShipInfoOrBuilder getShipDataOrBuilder() {
            if (this.shipDataBuilder_ != null) {
               return (WaterTransportMsg.PlayerShipInfoOrBuilder)this.shipDataBuilder_.getMessageOrBuilder();
            } else {
               return this.shipData_ == null ? WaterTransportMsg.PlayerShipInfo.getDefaultInstance() : this.shipData_;
            }
         }

         private SingleFieldBuilderV3<WaterTransportMsg.PlayerShipInfo, WaterTransportMsg.PlayerShipInfo.Builder, WaterTransportMsg.PlayerShipInfoOrBuilder> getShipDataFieldBuilder() {
            if (this.shipDataBuilder_ == null) {
               this.shipDataBuilder_ = new SingleFieldBuilderV3(this.getShipData(), this.getParentForChildren(), this.isClean());
               this.shipData_ = null;
            }

            return this.shipDataBuilder_;
         }

         public boolean hasGuardId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getGuardId() {
            return this.guardId_;
         }

         public Builder setGuardId(int value) {
            this.bitField0_ |= 2;
            this.guardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGuardId() {
            this.bitField0_ &= -3;
            this.guardId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRecord() {
            return (this.bitField0_ & 4) != 0;
         }

         public WaterTransportMsg.TransportRecord getRecord() {
            if (this.recordBuilder_ == null) {
               return this.record_ == null ? WaterTransportMsg.TransportRecord.getDefaultInstance() : this.record_;
            } else {
               return (WaterTransportMsg.TransportRecord)this.recordBuilder_.getMessage();
            }
         }

         public Builder setRecord(WaterTransportMsg.TransportRecord value) {
            if (this.recordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.record_ = value;
               this.onChanged();
            } else {
               this.recordBuilder_.setMessage(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setRecord(WaterTransportMsg.TransportRecord.Builder builderForValue) {
            if (this.recordBuilder_ == null) {
               this.record_ = builderForValue.build();
               this.onChanged();
            } else {
               this.recordBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeRecord(WaterTransportMsg.TransportRecord value) {
            if (this.recordBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.record_ != null && this.record_ != WaterTransportMsg.TransportRecord.getDefaultInstance()) {
                  this.record_ = WaterTransportMsg.TransportRecord.newBuilder(this.record_).mergeFrom(value).buildPartial();
               } else {
                  this.record_ = value;
               }

               this.onChanged();
            } else {
               this.recordBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearRecord() {
            if (this.recordBuilder_ == null) {
               this.record_ = null;
               this.onChanged();
            } else {
               this.recordBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public WaterTransportMsg.TransportRecord.Builder getRecordBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (WaterTransportMsg.TransportRecord.Builder)this.getRecordFieldBuilder().getBuilder();
         }

         public WaterTransportMsg.TransportRecordOrBuilder getRecordOrBuilder() {
            if (this.recordBuilder_ != null) {
               return (WaterTransportMsg.TransportRecordOrBuilder)this.recordBuilder_.getMessageOrBuilder();
            } else {
               return this.record_ == null ? WaterTransportMsg.TransportRecord.getDefaultInstance() : this.record_;
            }
         }

         private SingleFieldBuilderV3<WaterTransportMsg.TransportRecord, WaterTransportMsg.TransportRecord.Builder, WaterTransportMsg.TransportRecordOrBuilder> getRecordFieldBuilder() {
            if (this.recordBuilder_ == null) {
               this.recordBuilder_ = new SingleFieldBuilderV3(this.getRecord(), this.getParentForChildren(), this.isClean());
               this.record_ = null;
            }

            return this.recordBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_Intercept_10207 extends GeneratedMessageV3 implements S2CR_Intercept_10207OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROARRAYINGDATA_FIELD_NUMBER = 1;
      private ByteString heroArrayingData_;
      public static final int MYINTERCEPTCOUNT_FIELD_NUMBER = 2;
      private int myInterceptCount_;
      public static final int SHIPID_FIELD_NUMBER = 3;
      private int shipId_;
      public static final int HIGHPOWER_FIELD_NUMBER = 4;
      private long highPower_;
      private byte memoizedIsInitialized;
      private static final S2CR_Intercept_10207 DEFAULT_INSTANCE = new S2CR_Intercept_10207();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_Intercept_10207> PARSER = new AbstractParser<S2CR_Intercept_10207>() {
         public S2CR_Intercept_10207 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_Intercept_10207(input, extensionRegistry);
         }
      };

      private S2CR_Intercept_10207(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_Intercept_10207() {
         this.memoizedIsInitialized = -1;
         this.heroArrayingData_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_Intercept_10207();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_Intercept_10207(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.bitField0_ |= 1;
                        this.heroArrayingData_ = input.readBytes();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.myInterceptCount_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.shipId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.highPower_ = input.readInt64();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_Intercept_10207_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_Intercept_10207_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Intercept_10207.class, Builder.class);
      }

      public boolean hasHeroArrayingData() {
         return (this.bitField0_ & 1) != 0;
      }

      public ByteString getHeroArrayingData() {
         return this.heroArrayingData_;
      }

      public boolean hasMyInterceptCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getMyInterceptCount() {
         return this.myInterceptCount_;
      }

      public boolean hasShipId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getShipId() {
         return this.shipId_;
      }

      public boolean hasHighPower() {
         return (this.bitField0_ & 8) != 0;
      }

      public long getHighPower() {
         return this.highPower_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroArrayingData()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMyInterceptCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasShipId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHighPower()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBytes(1, this.heroArrayingData_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.myInterceptCount_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.shipId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt64(4, this.highPower_);
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
               size += CodedOutputStream.computeBytesSize(1, this.heroArrayingData_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.myInterceptCount_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.shipId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt64Size(4, this.highPower_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_Intercept_10207)) {
            return super.equals(obj);
         } else {
            S2CR_Intercept_10207 other = (S2CR_Intercept_10207)obj;
            if (this.hasHeroArrayingData() != other.hasHeroArrayingData()) {
               return false;
            } else if (this.hasHeroArrayingData() && !this.getHeroArrayingData().equals(other.getHeroArrayingData())) {
               return false;
            } else if (this.hasMyInterceptCount() != other.hasMyInterceptCount()) {
               return false;
            } else if (this.hasMyInterceptCount() && this.getMyInterceptCount() != other.getMyInterceptCount()) {
               return false;
            } else if (this.hasShipId() != other.hasShipId()) {
               return false;
            } else if (this.hasShipId() && this.getShipId() != other.getShipId()) {
               return false;
            } else if (this.hasHighPower() != other.hasHighPower()) {
               return false;
            } else if (this.hasHighPower() && this.getHighPower() != other.getHighPower()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasHeroArrayingData()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroArrayingData().hashCode();
            }

            if (this.hasMyInterceptCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMyInterceptCount();
            }

            if (this.hasShipId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getShipId();
            }

            if (this.hasHighPower()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashLong(this.getHighPower());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_Intercept_10207 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_Intercept_10207)PARSER.parseFrom(data);
      }

      public static S2CR_Intercept_10207 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Intercept_10207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Intercept_10207 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_Intercept_10207)PARSER.parseFrom(data);
      }

      public static S2CR_Intercept_10207 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Intercept_10207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Intercept_10207 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_Intercept_10207)PARSER.parseFrom(data);
      }

      public static S2CR_Intercept_10207 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Intercept_10207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Intercept_10207 parseFrom(InputStream input) throws IOException {
         return (S2CR_Intercept_10207)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Intercept_10207 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Intercept_10207)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Intercept_10207 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_Intercept_10207)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_Intercept_10207 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Intercept_10207)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Intercept_10207 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_Intercept_10207)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Intercept_10207 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Intercept_10207)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_Intercept_10207 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_Intercept_10207 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_Intercept_10207> parser() {
         return PARSER;
      }

      public Parser<S2CR_Intercept_10207> getParserForType() {
         return PARSER;
      }

      public S2CR_Intercept_10207 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_Intercept_10207OrBuilder {
         private int bitField0_;
         private ByteString heroArrayingData_;
         private int myInterceptCount_;
         private int shipId_;
         private long highPower_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_Intercept_10207_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_Intercept_10207_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Intercept_10207.class, Builder.class);
         }

         private Builder() {
            this.heroArrayingData_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.heroArrayingData_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.S2CR_Intercept_10207.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroArrayingData_ = ByteString.EMPTY;
            this.bitField0_ &= -2;
            this.myInterceptCount_ = 0;
            this.bitField0_ &= -3;
            this.shipId_ = 0;
            this.bitField0_ &= -5;
            this.highPower_ = 0L;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_Intercept_10207_descriptor;
         }

         public S2CR_Intercept_10207 getDefaultInstanceForType() {
            return CrossWaterTransportMsg.S2CR_Intercept_10207.getDefaultInstance();
         }

         public S2CR_Intercept_10207 build() {
            S2CR_Intercept_10207 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_Intercept_10207 buildPartial() {
            S2CR_Intercept_10207 result = new S2CR_Intercept_10207(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.heroArrayingData_ = this.heroArrayingData_;
            if ((from_bitField0_ & 2) != 0) {
               result.myInterceptCount_ = this.myInterceptCount_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.shipId_ = this.shipId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.highPower_ = this.highPower_;
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
            if (other instanceof S2CR_Intercept_10207) {
               return this.mergeFrom((S2CR_Intercept_10207)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_Intercept_10207 other) {
            if (other == CrossWaterTransportMsg.S2CR_Intercept_10207.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroArrayingData()) {
                  this.setHeroArrayingData(other.getHeroArrayingData());
               }

               if (other.hasMyInterceptCount()) {
                  this.setMyInterceptCount(other.getMyInterceptCount());
               }

               if (other.hasShipId()) {
                  this.setShipId(other.getShipId());
               }

               if (other.hasHighPower()) {
                  this.setHighPower(other.getHighPower());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroArrayingData()) {
               return false;
            } else if (!this.hasMyInterceptCount()) {
               return false;
            } else if (!this.hasShipId()) {
               return false;
            } else {
               return this.hasHighPower();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_Intercept_10207 parsedMessage = null;

            try {
               parsedMessage = (S2CR_Intercept_10207)CrossWaterTransportMsg.S2CR_Intercept_10207.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_Intercept_10207)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroArrayingData() {
            return (this.bitField0_ & 1) != 0;
         }

         public ByteString getHeroArrayingData() {
            return this.heroArrayingData_;
         }

         public Builder setHeroArrayingData(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.heroArrayingData_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearHeroArrayingData() {
            this.bitField0_ &= -2;
            this.heroArrayingData_ = CrossWaterTransportMsg.S2CR_Intercept_10207.getDefaultInstance().getHeroArrayingData();
            this.onChanged();
            return this;
         }

         public boolean hasMyInterceptCount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getMyInterceptCount() {
            return this.myInterceptCount_;
         }

         public Builder setMyInterceptCount(int value) {
            this.bitField0_ |= 2;
            this.myInterceptCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMyInterceptCount() {
            this.bitField0_ &= -3;
            this.myInterceptCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasShipId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getShipId() {
            return this.shipId_;
         }

         public Builder setShipId(int value) {
            this.bitField0_ |= 4;
            this.shipId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShipId() {
            this.bitField0_ &= -5;
            this.shipId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHighPower() {
            return (this.bitField0_ & 8) != 0;
         }

         public long getHighPower() {
            return this.highPower_;
         }

         public Builder setHighPower(long value) {
            this.bitField0_ |= 8;
            this.highPower_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHighPower() {
            this.bitField0_ &= -9;
            this.highPower_ = 0L;
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

   public static final class CR2S_Intercept_10208 extends GeneratedMessageV3 implements CR2S_Intercept_10208OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SHIPMODELID_FIELD_NUMBER = 1;
      private int shipModelId_;
      public static final int REWARDSCALE_FIELD_NUMBER = 2;
      private int rewardScale_;
      public static final int GUARDID_FIELD_NUMBER = 3;
      private int guardId_;
      public static final int SHIPID_FIELD_NUMBER = 4;
      private int shipId_;
      public static final int LEVEL_FIELD_NUMBER = 5;
      private int level_;
      public static final int BATTLEMSG_FIELD_NUMBER = 6;
      private BattleMsg.S2C_BattleResult_6102 battleMsg_;
      public static final int RECORD_FIELD_NUMBER = 7;
      private WaterTransportMsg.TransportRecord record_;
      public static final int WORLDLV_FIELD_NUMBER = 8;
      private int worldLv_;
      private byte memoizedIsInitialized;
      private static final CR2S_Intercept_10208 DEFAULT_INSTANCE = new CR2S_Intercept_10208();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_Intercept_10208> PARSER = new AbstractParser<CR2S_Intercept_10208>() {
         public CR2S_Intercept_10208 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_Intercept_10208(input, extensionRegistry);
         }
      };

      private CR2S_Intercept_10208(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_Intercept_10208() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_Intercept_10208();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_Intercept_10208(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.shipModelId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.rewardScale_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.guardId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.shipId_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.level_ = input.readInt32();
                        break;
                     case 50:
                        BattleMsg.S2C_BattleResult_6102.Builder subBuilder = null;
                        if ((this.bitField0_ & 32) != 0) {
                           subBuilder = this.battleMsg_.toBuilder();
                        }

                        this.battleMsg_ = (BattleMsg.S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.battleMsg_);
                           this.battleMsg_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 32;
                        break;
                     case 58:
                        WaterTransportMsg.TransportRecord.Builder subBuilder = null;
                        if ((this.bitField0_ & 64) != 0) {
                           subBuilder = this.record_.toBuilder();
                        }

                        this.record_ = (WaterTransportMsg.TransportRecord)input.readMessage(WaterTransportMsg.TransportRecord.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.record_);
                           this.record_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 64;
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.worldLv_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_Intercept_10208_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_Intercept_10208_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Intercept_10208.class, Builder.class);
      }

      public boolean hasShipModelId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getShipModelId() {
         return this.shipModelId_;
      }

      public boolean hasRewardScale() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRewardScale() {
         return this.rewardScale_;
      }

      public boolean hasGuardId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getGuardId() {
         return this.guardId_;
      }

      public boolean hasShipId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getShipId() {
         return this.shipId_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public boolean hasBattleMsg() {
         return (this.bitField0_ & 32) != 0;
      }

      public BattleMsg.S2C_BattleResult_6102 getBattleMsg() {
         return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
      }

      public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder() {
         return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
      }

      public boolean hasRecord() {
         return (this.bitField0_ & 64) != 0;
      }

      public WaterTransportMsg.TransportRecord getRecord() {
         return this.record_ == null ? WaterTransportMsg.TransportRecord.getDefaultInstance() : this.record_;
      }

      public WaterTransportMsg.TransportRecordOrBuilder getRecordOrBuilder() {
         return this.record_ == null ? WaterTransportMsg.TransportRecord.getDefaultInstance() : this.record_;
      }

      public boolean hasWorldLv() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getWorldLv() {
         return this.worldLv_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasShipModelId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRewardScale()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGuardId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasShipId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBattleMsg()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasWorldLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getBattleMsg().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (this.hasRecord() && !this.getRecord().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.shipModelId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.rewardScale_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.guardId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.shipId_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.level_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeMessage(6, this.getBattleMsg());
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeMessage(7, this.getRecord());
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.worldLv_);
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
               size += CodedOutputStream.computeInt32Size(1, this.shipModelId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.rewardScale_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.guardId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.shipId_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.level_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeMessageSize(6, this.getBattleMsg());
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeMessageSize(7, this.getRecord());
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.worldLv_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_Intercept_10208)) {
            return super.equals(obj);
         } else {
            CR2S_Intercept_10208 other = (CR2S_Intercept_10208)obj;
            if (this.hasShipModelId() != other.hasShipModelId()) {
               return false;
            } else if (this.hasShipModelId() && this.getShipModelId() != other.getShipModelId()) {
               return false;
            } else if (this.hasRewardScale() != other.hasRewardScale()) {
               return false;
            } else if (this.hasRewardScale() && this.getRewardScale() != other.getRewardScale()) {
               return false;
            } else if (this.hasGuardId() != other.hasGuardId()) {
               return false;
            } else if (this.hasGuardId() && this.getGuardId() != other.getGuardId()) {
               return false;
            } else if (this.hasShipId() != other.hasShipId()) {
               return false;
            } else if (this.hasShipId() && this.getShipId() != other.getShipId()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (this.hasBattleMsg() != other.hasBattleMsg()) {
               return false;
            } else if (this.hasBattleMsg() && !this.getBattleMsg().equals(other.getBattleMsg())) {
               return false;
            } else if (this.hasRecord() != other.hasRecord()) {
               return false;
            } else if (this.hasRecord() && !this.getRecord().equals(other.getRecord())) {
               return false;
            } else if (this.hasWorldLv() != other.hasWorldLv()) {
               return false;
            } else if (this.hasWorldLv() && this.getWorldLv() != other.getWorldLv()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasShipModelId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getShipModelId();
            }

            if (this.hasRewardScale()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRewardScale();
            }

            if (this.hasGuardId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getGuardId();
            }

            if (this.hasShipId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getShipId();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getLevel();
            }

            if (this.hasBattleMsg()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getBattleMsg().hashCode();
            }

            if (this.hasRecord()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getRecord().hashCode();
            }

            if (this.hasWorldLv()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getWorldLv();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_Intercept_10208 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_Intercept_10208)PARSER.parseFrom(data);
      }

      public static CR2S_Intercept_10208 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Intercept_10208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Intercept_10208 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_Intercept_10208)PARSER.parseFrom(data);
      }

      public static CR2S_Intercept_10208 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Intercept_10208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Intercept_10208 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_Intercept_10208)PARSER.parseFrom(data);
      }

      public static CR2S_Intercept_10208 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Intercept_10208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Intercept_10208 parseFrom(InputStream input) throws IOException {
         return (CR2S_Intercept_10208)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Intercept_10208 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Intercept_10208)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Intercept_10208 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_Intercept_10208)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_Intercept_10208 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Intercept_10208)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Intercept_10208 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_Intercept_10208)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Intercept_10208 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Intercept_10208)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_Intercept_10208 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_Intercept_10208 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_Intercept_10208> parser() {
         return PARSER;
      }

      public Parser<CR2S_Intercept_10208> getParserForType() {
         return PARSER;
      }

      public CR2S_Intercept_10208 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_Intercept_10208OrBuilder {
         private int bitField0_;
         private int shipModelId_;
         private int rewardScale_;
         private int guardId_;
         private int shipId_;
         private int level_;
         private BattleMsg.S2C_BattleResult_6102 battleMsg_;
         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> battleMsgBuilder_;
         private WaterTransportMsg.TransportRecord record_;
         private SingleFieldBuilderV3<WaterTransportMsg.TransportRecord, WaterTransportMsg.TransportRecord.Builder, WaterTransportMsg.TransportRecordOrBuilder> recordBuilder_;
         private int worldLv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_Intercept_10208_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_Intercept_10208_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Intercept_10208.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.CR2S_Intercept_10208.alwaysUseFieldBuilders) {
               this.getBattleMsgFieldBuilder();
               this.getRecordFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.shipModelId_ = 0;
            this.bitField0_ &= -2;
            this.rewardScale_ = 0;
            this.bitField0_ &= -3;
            this.guardId_ = 0;
            this.bitField0_ &= -5;
            this.shipId_ = 0;
            this.bitField0_ &= -9;
            this.level_ = 0;
            this.bitField0_ &= -17;
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = null;
            } else {
               this.battleMsgBuilder_.clear();
            }

            this.bitField0_ &= -33;
            if (this.recordBuilder_ == null) {
               this.record_ = null;
            } else {
               this.recordBuilder_.clear();
            }

            this.bitField0_ &= -65;
            this.worldLv_ = 0;
            this.bitField0_ &= -129;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_Intercept_10208_descriptor;
         }

         public CR2S_Intercept_10208 getDefaultInstanceForType() {
            return CrossWaterTransportMsg.CR2S_Intercept_10208.getDefaultInstance();
         }

         public CR2S_Intercept_10208 build() {
            CR2S_Intercept_10208 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_Intercept_10208 buildPartial() {
            CR2S_Intercept_10208 result = new CR2S_Intercept_10208(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.shipModelId_ = this.shipModelId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.rewardScale_ = this.rewardScale_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.guardId_ = this.guardId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.shipId_ = this.shipId_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               if (this.battleMsgBuilder_ == null) {
                  result.battleMsg_ = this.battleMsg_;
               } else {
                  result.battleMsg_ = (BattleMsg.S2C_BattleResult_6102)this.battleMsgBuilder_.build();
               }

               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               if (this.recordBuilder_ == null) {
                  result.record_ = this.record_;
               } else {
                  result.record_ = (WaterTransportMsg.TransportRecord)this.recordBuilder_.build();
               }

               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.worldLv_ = this.worldLv_;
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
            if (other instanceof CR2S_Intercept_10208) {
               return this.mergeFrom((CR2S_Intercept_10208)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_Intercept_10208 other) {
            if (other == CrossWaterTransportMsg.CR2S_Intercept_10208.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasShipModelId()) {
                  this.setShipModelId(other.getShipModelId());
               }

               if (other.hasRewardScale()) {
                  this.setRewardScale(other.getRewardScale());
               }

               if (other.hasGuardId()) {
                  this.setGuardId(other.getGuardId());
               }

               if (other.hasShipId()) {
                  this.setShipId(other.getShipId());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (other.hasBattleMsg()) {
                  this.mergeBattleMsg(other.getBattleMsg());
               }

               if (other.hasRecord()) {
                  this.mergeRecord(other.getRecord());
               }

               if (other.hasWorldLv()) {
                  this.setWorldLv(other.getWorldLv());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasShipModelId()) {
               return false;
            } else if (!this.hasRewardScale()) {
               return false;
            } else if (!this.hasGuardId()) {
               return false;
            } else if (!this.hasShipId()) {
               return false;
            } else if (!this.hasLevel()) {
               return false;
            } else if (!this.hasBattleMsg()) {
               return false;
            } else if (!this.hasWorldLv()) {
               return false;
            } else if (!this.getBattleMsg().isInitialized()) {
               return false;
            } else {
               return !this.hasRecord() || this.getRecord().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_Intercept_10208 parsedMessage = null;

            try {
               parsedMessage = (CR2S_Intercept_10208)CrossWaterTransportMsg.CR2S_Intercept_10208.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_Intercept_10208)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasShipModelId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getShipModelId() {
            return this.shipModelId_;
         }

         public Builder setShipModelId(int value) {
            this.bitField0_ |= 1;
            this.shipModelId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShipModelId() {
            this.bitField0_ &= -2;
            this.shipModelId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRewardScale() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRewardScale() {
            return this.rewardScale_;
         }

         public Builder setRewardScale(int value) {
            this.bitField0_ |= 2;
            this.rewardScale_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardScale() {
            this.bitField0_ &= -3;
            this.rewardScale_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGuardId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getGuardId() {
            return this.guardId_;
         }

         public Builder setGuardId(int value) {
            this.bitField0_ |= 4;
            this.guardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGuardId() {
            this.bitField0_ &= -5;
            this.guardId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasShipId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getShipId() {
            return this.shipId_;
         }

         public Builder setShipId(int value) {
            this.bitField0_ |= 8;
            this.shipId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShipId() {
            this.bitField0_ &= -9;
            this.shipId_ = 0;
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

         public boolean hasBattleMsg() {
            return (this.bitField0_ & 32) != 0;
         }

         public BattleMsg.S2C_BattleResult_6102 getBattleMsg() {
            if (this.battleMsgBuilder_ == null) {
               return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
            } else {
               return (BattleMsg.S2C_BattleResult_6102)this.battleMsgBuilder_.getMessage();
            }
         }

         public Builder setBattleMsg(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleMsgBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.battleMsg_ = value;
               this.onChanged();
            } else {
               this.battleMsgBuilder_.setMessage(value);
            }

            this.bitField0_ |= 32;
            return this;
         }

         public Builder setBattleMsg(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = builderForValue.build();
               this.onChanged();
            } else {
               this.battleMsgBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 32;
            return this;
         }

         public Builder mergeBattleMsg(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleMsgBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0 && this.battleMsg_ != null && this.battleMsg_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.battleMsg_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.battleMsg_).mergeFrom(value).buildPartial();
               } else {
                  this.battleMsg_ = value;
               }

               this.onChanged();
            } else {
               this.battleMsgBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 32;
            return this;
         }

         public Builder clearBattleMsg() {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = null;
               this.onChanged();
            } else {
               this.battleMsgBuilder_.clear();
            }

            this.bitField0_ &= -33;
            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getBattleMsgBuilder() {
            this.bitField0_ |= 32;
            this.onChanged();
            return (BattleMsg.S2C_BattleResult_6102.Builder)this.getBattleMsgFieldBuilder().getBuilder();
         }

         public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder() {
            if (this.battleMsgBuilder_ != null) {
               return (BattleMsg.S2C_BattleResult_6102OrBuilder)this.battleMsgBuilder_.getMessageOrBuilder();
            } else {
               return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
            }
         }

         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> getBattleMsgFieldBuilder() {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsgBuilder_ = new SingleFieldBuilderV3(this.getBattleMsg(), this.getParentForChildren(), this.isClean());
               this.battleMsg_ = null;
            }

            return this.battleMsgBuilder_;
         }

         public boolean hasRecord() {
            return (this.bitField0_ & 64) != 0;
         }

         public WaterTransportMsg.TransportRecord getRecord() {
            if (this.recordBuilder_ == null) {
               return this.record_ == null ? WaterTransportMsg.TransportRecord.getDefaultInstance() : this.record_;
            } else {
               return (WaterTransportMsg.TransportRecord)this.recordBuilder_.getMessage();
            }
         }

         public Builder setRecord(WaterTransportMsg.TransportRecord value) {
            if (this.recordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.record_ = value;
               this.onChanged();
            } else {
               this.recordBuilder_.setMessage(value);
            }

            this.bitField0_ |= 64;
            return this;
         }

         public Builder setRecord(WaterTransportMsg.TransportRecord.Builder builderForValue) {
            if (this.recordBuilder_ == null) {
               this.record_ = builderForValue.build();
               this.onChanged();
            } else {
               this.recordBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 64;
            return this;
         }

         public Builder mergeRecord(WaterTransportMsg.TransportRecord value) {
            if (this.recordBuilder_ == null) {
               if ((this.bitField0_ & 64) != 0 && this.record_ != null && this.record_ != WaterTransportMsg.TransportRecord.getDefaultInstance()) {
                  this.record_ = WaterTransportMsg.TransportRecord.newBuilder(this.record_).mergeFrom(value).buildPartial();
               } else {
                  this.record_ = value;
               }

               this.onChanged();
            } else {
               this.recordBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 64;
            return this;
         }

         public Builder clearRecord() {
            if (this.recordBuilder_ == null) {
               this.record_ = null;
               this.onChanged();
            } else {
               this.recordBuilder_.clear();
            }

            this.bitField0_ &= -65;
            return this;
         }

         public WaterTransportMsg.TransportRecord.Builder getRecordBuilder() {
            this.bitField0_ |= 64;
            this.onChanged();
            return (WaterTransportMsg.TransportRecord.Builder)this.getRecordFieldBuilder().getBuilder();
         }

         public WaterTransportMsg.TransportRecordOrBuilder getRecordOrBuilder() {
            if (this.recordBuilder_ != null) {
               return (WaterTransportMsg.TransportRecordOrBuilder)this.recordBuilder_.getMessageOrBuilder();
            } else {
               return this.record_ == null ? WaterTransportMsg.TransportRecord.getDefaultInstance() : this.record_;
            }
         }

         private SingleFieldBuilderV3<WaterTransportMsg.TransportRecord, WaterTransportMsg.TransportRecord.Builder, WaterTransportMsg.TransportRecordOrBuilder> getRecordFieldBuilder() {
            if (this.recordBuilder_ == null) {
               this.recordBuilder_ = new SingleFieldBuilderV3(this.getRecord(), this.getParentForChildren(), this.isClean());
               this.record_ = null;
            }

            return this.recordBuilder_;
         }

         public boolean hasWorldLv() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getWorldLv() {
            return this.worldLv_;
         }

         public Builder setWorldLv(int value) {
            this.bitField0_ |= 128;
            this.worldLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWorldLv() {
            this.bitField0_ &= -129;
            this.worldLv_ = 0;
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

   public static final class S2CR_WaterTransportGm_10209 extends GeneratedMessageV3 implements S2CR_WaterTransportGm_10209OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CMD_FIELD_NUMBER = 1;
      private volatile Object cmd_;
      public static final int PARAMS_FIELD_NUMBER = 2;
      private Internal.LongList params_;
      private byte memoizedIsInitialized;
      private static final S2CR_WaterTransportGm_10209 DEFAULT_INSTANCE = new S2CR_WaterTransportGm_10209();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_WaterTransportGm_10209> PARSER = new AbstractParser<S2CR_WaterTransportGm_10209>() {
         public S2CR_WaterTransportGm_10209 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_WaterTransportGm_10209(input, extensionRegistry);
         }
      };

      private S2CR_WaterTransportGm_10209(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_WaterTransportGm_10209() {
         this.memoizedIsInitialized = -1;
         this.cmd_ = "";
         this.params_ = emptyLongList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_WaterTransportGm_10209();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_WaterTransportGm_10209(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.cmd_ = bs;
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.params_ = newLongList();
                           mutable_bitField0_ |= 2;
                        }

                        this.params_.addLong(input.readInt64());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.params_ = newLongList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.params_.addLong(input.readInt64());
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
                  this.params_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_WaterTransportGm_10209_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_WaterTransportGm_10209_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_WaterTransportGm_10209.class, Builder.class);
      }

      public boolean hasCmd() {
         return (this.bitField0_ & 1) != 0;
      }

      public String getCmd() {
         Object ref = this.cmd_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.cmd_ = s;
            }

            return s;
         }
      }

      public ByteString getCmdBytes() {
         Object ref = this.cmd_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.cmd_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public List<Long> getParamsList() {
         return this.params_;
      }

      public int getParamsCount() {
         return this.params_.size();
      }

      public long getParams(int index) {
         return this.params_.getLong(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCmd()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.cmd_);
         }

         for(int i = 0; i < this.params_.size(); ++i) {
            output.writeInt64(2, this.params_.getLong(i));
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
               size += GeneratedMessageV3.computeStringSize(1, this.cmd_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.params_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt64SizeNoTag(this.params_.getLong(i));
            }

            size += dataSize;
            size += 1 * this.getParamsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_WaterTransportGm_10209)) {
            return super.equals(obj);
         } else {
            S2CR_WaterTransportGm_10209 other = (S2CR_WaterTransportGm_10209)obj;
            if (this.hasCmd() != other.hasCmd()) {
               return false;
            } else if (this.hasCmd() && !this.getCmd().equals(other.getCmd())) {
               return false;
            } else if (!this.getParamsList().equals(other.getParamsList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasCmd()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCmd().hashCode();
            }

            if (this.getParamsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getParamsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_WaterTransportGm_10209 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_WaterTransportGm_10209)PARSER.parseFrom(data);
      }

      public static S2CR_WaterTransportGm_10209 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_WaterTransportGm_10209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_WaterTransportGm_10209 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_WaterTransportGm_10209)PARSER.parseFrom(data);
      }

      public static S2CR_WaterTransportGm_10209 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_WaterTransportGm_10209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_WaterTransportGm_10209 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_WaterTransportGm_10209)PARSER.parseFrom(data);
      }

      public static S2CR_WaterTransportGm_10209 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_WaterTransportGm_10209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_WaterTransportGm_10209 parseFrom(InputStream input) throws IOException {
         return (S2CR_WaterTransportGm_10209)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_WaterTransportGm_10209 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_WaterTransportGm_10209)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_WaterTransportGm_10209 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_WaterTransportGm_10209)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_WaterTransportGm_10209 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_WaterTransportGm_10209)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_WaterTransportGm_10209 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_WaterTransportGm_10209)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_WaterTransportGm_10209 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_WaterTransportGm_10209)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_WaterTransportGm_10209 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_WaterTransportGm_10209 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_WaterTransportGm_10209> parser() {
         return PARSER;
      }

      public Parser<S2CR_WaterTransportGm_10209> getParserForType() {
         return PARSER;
      }

      public S2CR_WaterTransportGm_10209 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_WaterTransportGm_10209OrBuilder {
         private int bitField0_;
         private Object cmd_;
         private Internal.LongList params_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_WaterTransportGm_10209_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_WaterTransportGm_10209_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_WaterTransportGm_10209.class, Builder.class);
         }

         private Builder() {
            this.cmd_ = "";
            this.params_ = CrossWaterTransportMsg.S2CR_WaterTransportGm_10209.emptyLongList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.cmd_ = "";
            this.params_ = CrossWaterTransportMsg.S2CR_WaterTransportGm_10209.emptyLongList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.S2CR_WaterTransportGm_10209.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.cmd_ = "";
            this.bitField0_ &= -2;
            this.params_ = CrossWaterTransportMsg.S2CR_WaterTransportGm_10209.emptyLongList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_WaterTransportGm_10209_descriptor;
         }

         public S2CR_WaterTransportGm_10209 getDefaultInstanceForType() {
            return CrossWaterTransportMsg.S2CR_WaterTransportGm_10209.getDefaultInstance();
         }

         public S2CR_WaterTransportGm_10209 build() {
            S2CR_WaterTransportGm_10209 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_WaterTransportGm_10209 buildPartial() {
            S2CR_WaterTransportGm_10209 result = new S2CR_WaterTransportGm_10209(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.cmd_ = this.cmd_;
            if ((this.bitField0_ & 2) != 0) {
               this.params_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.params_ = this.params_;
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
            if (other instanceof S2CR_WaterTransportGm_10209) {
               return this.mergeFrom((S2CR_WaterTransportGm_10209)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_WaterTransportGm_10209 other) {
            if (other == CrossWaterTransportMsg.S2CR_WaterTransportGm_10209.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCmd()) {
                  this.bitField0_ |= 1;
                  this.cmd_ = other.cmd_;
                  this.onChanged();
               }

               if (!other.params_.isEmpty()) {
                  if (this.params_.isEmpty()) {
                     this.params_ = other.params_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureParamsIsMutable();
                     this.params_.addAll(other.params_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCmd();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_WaterTransportGm_10209 parsedMessage = null;

            try {
               parsedMessage = (S2CR_WaterTransportGm_10209)CrossWaterTransportMsg.S2CR_WaterTransportGm_10209.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_WaterTransportGm_10209)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCmd() {
            return (this.bitField0_ & 1) != 0;
         }

         public String getCmd() {
            Object ref = this.cmd_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.cmd_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getCmdBytes() {
            Object ref = this.cmd_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.cmd_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setCmd(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.cmd_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearCmd() {
            this.bitField0_ &= -2;
            this.cmd_ = CrossWaterTransportMsg.S2CR_WaterTransportGm_10209.getDefaultInstance().getCmd();
            this.onChanged();
            return this;
         }

         public Builder setCmdBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.cmd_ = value;
               this.onChanged();
               return this;
            }
         }

         private void ensureParamsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.params_ = CrossWaterTransportMsg.S2CR_WaterTransportGm_10209.mutableCopy(this.params_);
               this.bitField0_ |= 2;
            }

         }

         public List<Long> getParamsList() {
            return (List<Long>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.params_) : this.params_);
         }

         public int getParamsCount() {
            return this.params_.size();
         }

         public long getParams(int index) {
            return this.params_.getLong(index);
         }

         public Builder setParams(int index, long value) {
            this.ensureParamsIsMutable();
            this.params_.setLong(index, value);
            this.onChanged();
            return this;
         }

         public Builder addParams(long value) {
            this.ensureParamsIsMutable();
            this.params_.addLong(value);
            this.onChanged();
            return this;
         }

         public Builder addAllParams(Iterable<? extends Long> values) {
            this.ensureParamsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.params_);
            this.onChanged();
            return this;
         }

         public Builder clearParams() {
            this.params_ = CrossWaterTransportMsg.S2CR_WaterTransportGm_10209.emptyLongList();
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

   public static final class CR2S_ShipArrive_10210 extends GeneratedMessageV3 implements CR2S_ShipArrive_10210OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RIVER_FIELD_NUMBER = 1;
      private int river_;
      public static final int SHIPID_FIELD_NUMBER = 2;
      private int shipId_;
      private byte memoizedIsInitialized;
      private static final CR2S_ShipArrive_10210 DEFAULT_INSTANCE = new CR2S_ShipArrive_10210();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_ShipArrive_10210> PARSER = new AbstractParser<CR2S_ShipArrive_10210>() {
         public CR2S_ShipArrive_10210 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_ShipArrive_10210(input, extensionRegistry);
         }
      };

      private CR2S_ShipArrive_10210(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_ShipArrive_10210() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_ShipArrive_10210();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_ShipArrive_10210(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.river_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.shipId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_ShipArrive_10210_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_ShipArrive_10210_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ShipArrive_10210.class, Builder.class);
      }

      public boolean hasRiver() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRiver() {
         return this.river_;
      }

      public boolean hasShipId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getShipId() {
         return this.shipId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRiver()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasShipId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.river_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.shipId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.river_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.shipId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_ShipArrive_10210)) {
            return super.equals(obj);
         } else {
            CR2S_ShipArrive_10210 other = (CR2S_ShipArrive_10210)obj;
            if (this.hasRiver() != other.hasRiver()) {
               return false;
            } else if (this.hasRiver() && this.getRiver() != other.getRiver()) {
               return false;
            } else if (this.hasShipId() != other.hasShipId()) {
               return false;
            } else if (this.hasShipId() && this.getShipId() != other.getShipId()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasRiver()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRiver();
            }

            if (this.hasShipId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getShipId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_ShipArrive_10210 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_ShipArrive_10210)PARSER.parseFrom(data);
      }

      public static CR2S_ShipArrive_10210 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ShipArrive_10210)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ShipArrive_10210 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_ShipArrive_10210)PARSER.parseFrom(data);
      }

      public static CR2S_ShipArrive_10210 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ShipArrive_10210)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ShipArrive_10210 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_ShipArrive_10210)PARSER.parseFrom(data);
      }

      public static CR2S_ShipArrive_10210 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ShipArrive_10210)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ShipArrive_10210 parseFrom(InputStream input) throws IOException {
         return (CR2S_ShipArrive_10210)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ShipArrive_10210 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ShipArrive_10210)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ShipArrive_10210 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_ShipArrive_10210)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_ShipArrive_10210 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ShipArrive_10210)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ShipArrive_10210 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_ShipArrive_10210)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ShipArrive_10210 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ShipArrive_10210)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_ShipArrive_10210 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_ShipArrive_10210 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_ShipArrive_10210> parser() {
         return PARSER;
      }

      public Parser<CR2S_ShipArrive_10210> getParserForType() {
         return PARSER;
      }

      public CR2S_ShipArrive_10210 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_ShipArrive_10210OrBuilder {
         private int bitField0_;
         private int river_;
         private int shipId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_ShipArrive_10210_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_ShipArrive_10210_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ShipArrive_10210.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.CR2S_ShipArrive_10210.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.river_ = 0;
            this.bitField0_ &= -2;
            this.shipId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_ShipArrive_10210_descriptor;
         }

         public CR2S_ShipArrive_10210 getDefaultInstanceForType() {
            return CrossWaterTransportMsg.CR2S_ShipArrive_10210.getDefaultInstance();
         }

         public CR2S_ShipArrive_10210 build() {
            CR2S_ShipArrive_10210 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_ShipArrive_10210 buildPartial() {
            CR2S_ShipArrive_10210 result = new CR2S_ShipArrive_10210(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.river_ = this.river_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.shipId_ = this.shipId_;
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
            if (other instanceof CR2S_ShipArrive_10210) {
               return this.mergeFrom((CR2S_ShipArrive_10210)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_ShipArrive_10210 other) {
            if (other == CrossWaterTransportMsg.CR2S_ShipArrive_10210.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRiver()) {
                  this.setRiver(other.getRiver());
               }

               if (other.hasShipId()) {
                  this.setShipId(other.getShipId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRiver()) {
               return false;
            } else {
               return this.hasShipId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_ShipArrive_10210 parsedMessage = null;

            try {
               parsedMessage = (CR2S_ShipArrive_10210)CrossWaterTransportMsg.CR2S_ShipArrive_10210.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_ShipArrive_10210)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRiver() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRiver() {
            return this.river_;
         }

         public Builder setRiver(int value) {
            this.bitField0_ |= 1;
            this.river_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRiver() {
            this.bitField0_ &= -2;
            this.river_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasShipId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getShipId() {
            return this.shipId_;
         }

         public Builder setShipId(int value) {
            this.bitField0_ |= 2;
            this.shipId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShipId() {
            this.bitField0_ &= -3;
            this.shipId_ = 0;
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

   public static final class CR2S_BeInterceptLog_10211 extends GeneratedMessageV3 implements CR2S_BeInterceptLog_10211OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SHIPID_FIELD_NUMBER = 1;
      private int shipId_;
      public static final int REWARDSCALE_FIELD_NUMBER = 2;
      private int rewardScale_;
      public static final int BEINTERCEPTCOUNT_FIELD_NUMBER = 3;
      private int beInterceptCount_;
      public static final int LEVEL_FIELD_NUMBER = 4;
      private int level_;
      public static final int RECORD_FIELD_NUMBER = 5;
      private WaterTransportMsg.TransportRecord record_;
      public static final int BATTLEMSG_FIELD_NUMBER = 6;
      private BattleMsg.S2C_BattleResult_6102 battleMsg_;
      public static final int WORLDLV_FIELD_NUMBER = 7;
      private int worldLv_;
      private byte memoizedIsInitialized;
      private static final CR2S_BeInterceptLog_10211 DEFAULT_INSTANCE = new CR2S_BeInterceptLog_10211();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_BeInterceptLog_10211> PARSER = new AbstractParser<CR2S_BeInterceptLog_10211>() {
         public CR2S_BeInterceptLog_10211 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_BeInterceptLog_10211(input, extensionRegistry);
         }
      };

      private CR2S_BeInterceptLog_10211(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_BeInterceptLog_10211() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_BeInterceptLog_10211();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_BeInterceptLog_10211(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.shipId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.rewardScale_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.beInterceptCount_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.level_ = input.readInt32();
                        break;
                     case 42:
                        WaterTransportMsg.TransportRecord.Builder subBuilder = null;
                        if ((this.bitField0_ & 16) != 0) {
                           subBuilder = this.record_.toBuilder();
                        }

                        this.record_ = (WaterTransportMsg.TransportRecord)input.readMessage(WaterTransportMsg.TransportRecord.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.record_);
                           this.record_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 16;
                        break;
                     case 50:
                        BattleMsg.S2C_BattleResult_6102.Builder subBuilder = null;
                        if ((this.bitField0_ & 32) != 0) {
                           subBuilder = this.battleMsg_.toBuilder();
                        }

                        this.battleMsg_ = (BattleMsg.S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.battleMsg_);
                           this.battleMsg_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 32;
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.worldLv_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_BeInterceptLog_10211_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_BeInterceptLog_10211_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_BeInterceptLog_10211.class, Builder.class);
      }

      public boolean hasShipId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getShipId() {
         return this.shipId_;
      }

      public boolean hasRewardScale() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRewardScale() {
         return this.rewardScale_;
      }

      public boolean hasBeInterceptCount() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getBeInterceptCount() {
         return this.beInterceptCount_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public boolean hasRecord() {
         return (this.bitField0_ & 16) != 0;
      }

      public WaterTransportMsg.TransportRecord getRecord() {
         return this.record_ == null ? WaterTransportMsg.TransportRecord.getDefaultInstance() : this.record_;
      }

      public WaterTransportMsg.TransportRecordOrBuilder getRecordOrBuilder() {
         return this.record_ == null ? WaterTransportMsg.TransportRecord.getDefaultInstance() : this.record_;
      }

      public boolean hasBattleMsg() {
         return (this.bitField0_ & 32) != 0;
      }

      public BattleMsg.S2C_BattleResult_6102 getBattleMsg() {
         return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
      }

      public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder() {
         return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
      }

      public boolean hasWorldLv() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getWorldLv() {
         return this.worldLv_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasShipId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRewardScale()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBeInterceptCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRecord()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBattleMsg()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasWorldLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getRecord().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getBattleMsg().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.shipId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.rewardScale_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.beInterceptCount_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.level_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeMessage(5, this.getRecord());
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeMessage(6, this.getBattleMsg());
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.worldLv_);
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
               size += CodedOutputStream.computeInt32Size(1, this.shipId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.rewardScale_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.beInterceptCount_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.level_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeMessageSize(5, this.getRecord());
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeMessageSize(6, this.getBattleMsg());
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.worldLv_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_BeInterceptLog_10211)) {
            return super.equals(obj);
         } else {
            CR2S_BeInterceptLog_10211 other = (CR2S_BeInterceptLog_10211)obj;
            if (this.hasShipId() != other.hasShipId()) {
               return false;
            } else if (this.hasShipId() && this.getShipId() != other.getShipId()) {
               return false;
            } else if (this.hasRewardScale() != other.hasRewardScale()) {
               return false;
            } else if (this.hasRewardScale() && this.getRewardScale() != other.getRewardScale()) {
               return false;
            } else if (this.hasBeInterceptCount() != other.hasBeInterceptCount()) {
               return false;
            } else if (this.hasBeInterceptCount() && this.getBeInterceptCount() != other.getBeInterceptCount()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (this.hasRecord() != other.hasRecord()) {
               return false;
            } else if (this.hasRecord() && !this.getRecord().equals(other.getRecord())) {
               return false;
            } else if (this.hasBattleMsg() != other.hasBattleMsg()) {
               return false;
            } else if (this.hasBattleMsg() && !this.getBattleMsg().equals(other.getBattleMsg())) {
               return false;
            } else if (this.hasWorldLv() != other.hasWorldLv()) {
               return false;
            } else if (this.hasWorldLv() && this.getWorldLv() != other.getWorldLv()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasShipId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getShipId();
            }

            if (this.hasRewardScale()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRewardScale();
            }

            if (this.hasBeInterceptCount()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBeInterceptCount();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getLevel();
            }

            if (this.hasRecord()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getRecord().hashCode();
            }

            if (this.hasBattleMsg()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getBattleMsg().hashCode();
            }

            if (this.hasWorldLv()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getWorldLv();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_BeInterceptLog_10211 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_BeInterceptLog_10211)PARSER.parseFrom(data);
      }

      public static CR2S_BeInterceptLog_10211 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BeInterceptLog_10211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BeInterceptLog_10211 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_BeInterceptLog_10211)PARSER.parseFrom(data);
      }

      public static CR2S_BeInterceptLog_10211 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BeInterceptLog_10211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BeInterceptLog_10211 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_BeInterceptLog_10211)PARSER.parseFrom(data);
      }

      public static CR2S_BeInterceptLog_10211 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BeInterceptLog_10211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BeInterceptLog_10211 parseFrom(InputStream input) throws IOException {
         return (CR2S_BeInterceptLog_10211)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_BeInterceptLog_10211 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BeInterceptLog_10211)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_BeInterceptLog_10211 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_BeInterceptLog_10211)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_BeInterceptLog_10211 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BeInterceptLog_10211)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_BeInterceptLog_10211 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_BeInterceptLog_10211)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_BeInterceptLog_10211 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BeInterceptLog_10211)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_BeInterceptLog_10211 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_BeInterceptLog_10211 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_BeInterceptLog_10211> parser() {
         return PARSER;
      }

      public Parser<CR2S_BeInterceptLog_10211> getParserForType() {
         return PARSER;
      }

      public CR2S_BeInterceptLog_10211 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_BeInterceptLog_10211OrBuilder {
         private int bitField0_;
         private int shipId_;
         private int rewardScale_;
         private int beInterceptCount_;
         private int level_;
         private WaterTransportMsg.TransportRecord record_;
         private SingleFieldBuilderV3<WaterTransportMsg.TransportRecord, WaterTransportMsg.TransportRecord.Builder, WaterTransportMsg.TransportRecordOrBuilder> recordBuilder_;
         private BattleMsg.S2C_BattleResult_6102 battleMsg_;
         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> battleMsgBuilder_;
         private int worldLv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_BeInterceptLog_10211_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_BeInterceptLog_10211_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_BeInterceptLog_10211.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.CR2S_BeInterceptLog_10211.alwaysUseFieldBuilders) {
               this.getRecordFieldBuilder();
               this.getBattleMsgFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.shipId_ = 0;
            this.bitField0_ &= -2;
            this.rewardScale_ = 0;
            this.bitField0_ &= -3;
            this.beInterceptCount_ = 0;
            this.bitField0_ &= -5;
            this.level_ = 0;
            this.bitField0_ &= -9;
            if (this.recordBuilder_ == null) {
               this.record_ = null;
            } else {
               this.recordBuilder_.clear();
            }

            this.bitField0_ &= -17;
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = null;
            } else {
               this.battleMsgBuilder_.clear();
            }

            this.bitField0_ &= -33;
            this.worldLv_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_BeInterceptLog_10211_descriptor;
         }

         public CR2S_BeInterceptLog_10211 getDefaultInstanceForType() {
            return CrossWaterTransportMsg.CR2S_BeInterceptLog_10211.getDefaultInstance();
         }

         public CR2S_BeInterceptLog_10211 build() {
            CR2S_BeInterceptLog_10211 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_BeInterceptLog_10211 buildPartial() {
            CR2S_BeInterceptLog_10211 result = new CR2S_BeInterceptLog_10211(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.shipId_ = this.shipId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.rewardScale_ = this.rewardScale_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.beInterceptCount_ = this.beInterceptCount_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               if (this.recordBuilder_ == null) {
                  result.record_ = this.record_;
               } else {
                  result.record_ = (WaterTransportMsg.TransportRecord)this.recordBuilder_.build();
               }

               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               if (this.battleMsgBuilder_ == null) {
                  result.battleMsg_ = this.battleMsg_;
               } else {
                  result.battleMsg_ = (BattleMsg.S2C_BattleResult_6102)this.battleMsgBuilder_.build();
               }

               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.worldLv_ = this.worldLv_;
               to_bitField0_ |= 64;
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
            if (other instanceof CR2S_BeInterceptLog_10211) {
               return this.mergeFrom((CR2S_BeInterceptLog_10211)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_BeInterceptLog_10211 other) {
            if (other == CrossWaterTransportMsg.CR2S_BeInterceptLog_10211.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasShipId()) {
                  this.setShipId(other.getShipId());
               }

               if (other.hasRewardScale()) {
                  this.setRewardScale(other.getRewardScale());
               }

               if (other.hasBeInterceptCount()) {
                  this.setBeInterceptCount(other.getBeInterceptCount());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (other.hasRecord()) {
                  this.mergeRecord(other.getRecord());
               }

               if (other.hasBattleMsg()) {
                  this.mergeBattleMsg(other.getBattleMsg());
               }

               if (other.hasWorldLv()) {
                  this.setWorldLv(other.getWorldLv());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasShipId()) {
               return false;
            } else if (!this.hasRewardScale()) {
               return false;
            } else if (!this.hasBeInterceptCount()) {
               return false;
            } else if (!this.hasLevel()) {
               return false;
            } else if (!this.hasRecord()) {
               return false;
            } else if (!this.hasBattleMsg()) {
               return false;
            } else if (!this.hasWorldLv()) {
               return false;
            } else if (!this.getRecord().isInitialized()) {
               return false;
            } else {
               return this.getBattleMsg().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_BeInterceptLog_10211 parsedMessage = null;

            try {
               parsedMessage = (CR2S_BeInterceptLog_10211)CrossWaterTransportMsg.CR2S_BeInterceptLog_10211.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_BeInterceptLog_10211)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasShipId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getShipId() {
            return this.shipId_;
         }

         public Builder setShipId(int value) {
            this.bitField0_ |= 1;
            this.shipId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShipId() {
            this.bitField0_ &= -2;
            this.shipId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRewardScale() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRewardScale() {
            return this.rewardScale_;
         }

         public Builder setRewardScale(int value) {
            this.bitField0_ |= 2;
            this.rewardScale_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardScale() {
            this.bitField0_ &= -3;
            this.rewardScale_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBeInterceptCount() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getBeInterceptCount() {
            return this.beInterceptCount_;
         }

         public Builder setBeInterceptCount(int value) {
            this.bitField0_ |= 4;
            this.beInterceptCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeInterceptCount() {
            this.bitField0_ &= -5;
            this.beInterceptCount_ = 0;
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

         public boolean hasRecord() {
            return (this.bitField0_ & 16) != 0;
         }

         public WaterTransportMsg.TransportRecord getRecord() {
            if (this.recordBuilder_ == null) {
               return this.record_ == null ? WaterTransportMsg.TransportRecord.getDefaultInstance() : this.record_;
            } else {
               return (WaterTransportMsg.TransportRecord)this.recordBuilder_.getMessage();
            }
         }

         public Builder setRecord(WaterTransportMsg.TransportRecord value) {
            if (this.recordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.record_ = value;
               this.onChanged();
            } else {
               this.recordBuilder_.setMessage(value);
            }

            this.bitField0_ |= 16;
            return this;
         }

         public Builder setRecord(WaterTransportMsg.TransportRecord.Builder builderForValue) {
            if (this.recordBuilder_ == null) {
               this.record_ = builderForValue.build();
               this.onChanged();
            } else {
               this.recordBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 16;
            return this;
         }

         public Builder mergeRecord(WaterTransportMsg.TransportRecord value) {
            if (this.recordBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0 && this.record_ != null && this.record_ != WaterTransportMsg.TransportRecord.getDefaultInstance()) {
                  this.record_ = WaterTransportMsg.TransportRecord.newBuilder(this.record_).mergeFrom(value).buildPartial();
               } else {
                  this.record_ = value;
               }

               this.onChanged();
            } else {
               this.recordBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 16;
            return this;
         }

         public Builder clearRecord() {
            if (this.recordBuilder_ == null) {
               this.record_ = null;
               this.onChanged();
            } else {
               this.recordBuilder_.clear();
            }

            this.bitField0_ &= -17;
            return this;
         }

         public WaterTransportMsg.TransportRecord.Builder getRecordBuilder() {
            this.bitField0_ |= 16;
            this.onChanged();
            return (WaterTransportMsg.TransportRecord.Builder)this.getRecordFieldBuilder().getBuilder();
         }

         public WaterTransportMsg.TransportRecordOrBuilder getRecordOrBuilder() {
            if (this.recordBuilder_ != null) {
               return (WaterTransportMsg.TransportRecordOrBuilder)this.recordBuilder_.getMessageOrBuilder();
            } else {
               return this.record_ == null ? WaterTransportMsg.TransportRecord.getDefaultInstance() : this.record_;
            }
         }

         private SingleFieldBuilderV3<WaterTransportMsg.TransportRecord, WaterTransportMsg.TransportRecord.Builder, WaterTransportMsg.TransportRecordOrBuilder> getRecordFieldBuilder() {
            if (this.recordBuilder_ == null) {
               this.recordBuilder_ = new SingleFieldBuilderV3(this.getRecord(), this.getParentForChildren(), this.isClean());
               this.record_ = null;
            }

            return this.recordBuilder_;
         }

         public boolean hasBattleMsg() {
            return (this.bitField0_ & 32) != 0;
         }

         public BattleMsg.S2C_BattleResult_6102 getBattleMsg() {
            if (this.battleMsgBuilder_ == null) {
               return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
            } else {
               return (BattleMsg.S2C_BattleResult_6102)this.battleMsgBuilder_.getMessage();
            }
         }

         public Builder setBattleMsg(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleMsgBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.battleMsg_ = value;
               this.onChanged();
            } else {
               this.battleMsgBuilder_.setMessage(value);
            }

            this.bitField0_ |= 32;
            return this;
         }

         public Builder setBattleMsg(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = builderForValue.build();
               this.onChanged();
            } else {
               this.battleMsgBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 32;
            return this;
         }

         public Builder mergeBattleMsg(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleMsgBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0 && this.battleMsg_ != null && this.battleMsg_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.battleMsg_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.battleMsg_).mergeFrom(value).buildPartial();
               } else {
                  this.battleMsg_ = value;
               }

               this.onChanged();
            } else {
               this.battleMsgBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 32;
            return this;
         }

         public Builder clearBattleMsg() {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = null;
               this.onChanged();
            } else {
               this.battleMsgBuilder_.clear();
            }

            this.bitField0_ &= -33;
            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getBattleMsgBuilder() {
            this.bitField0_ |= 32;
            this.onChanged();
            return (BattleMsg.S2C_BattleResult_6102.Builder)this.getBattleMsgFieldBuilder().getBuilder();
         }

         public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder() {
            if (this.battleMsgBuilder_ != null) {
               return (BattleMsg.S2C_BattleResult_6102OrBuilder)this.battleMsgBuilder_.getMessageOrBuilder();
            } else {
               return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
            }
         }

         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> getBattleMsgFieldBuilder() {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsgBuilder_ = new SingleFieldBuilderV3(this.getBattleMsg(), this.getParentForChildren(), this.isClean());
               this.battleMsg_ = null;
            }

            return this.battleMsgBuilder_;
         }

         public boolean hasWorldLv() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getWorldLv() {
            return this.worldLv_;
         }

         public Builder setWorldLv(int value) {
            this.bitField0_ |= 64;
            this.worldLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWorldLv() {
            this.bitField0_ &= -65;
            this.worldLv_ = 0;
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

   public static final class CR2S_PlayerShipArrive_10212 extends GeneratedMessageV3 implements CR2S_PlayerShipArrive_10212OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SHIPID_FIELD_NUMBER = 1;
      private int shipId_;
      public static final int REWARDSCALE_FIELD_NUMBER = 2;
      private int rewardScale_;
      public static final int BEINTERCEPTCOUNT_FIELD_NUMBER = 3;
      private int beInterceptCount_;
      public static final int GUARDID_FIELD_NUMBER = 4;
      private int guardId_;
      public static final int LEVEL_FIELD_NUMBER = 5;
      private int level_;
      public static final int RECORD_FIELD_NUMBER = 6;
      private WaterTransportMsg.TransportRecord record_;
      public static final int EXREWARDSCALE_FIELD_NUMBER = 7;
      private int exRewardScale_;
      public static final int SHIPMODELID_FIELD_NUMBER = 8;
      private int shipModelId_;
      public static final int WORLDLV_FIELD_NUMBER = 9;
      private int worldLv_;
      private byte memoizedIsInitialized;
      private static final CR2S_PlayerShipArrive_10212 DEFAULT_INSTANCE = new CR2S_PlayerShipArrive_10212();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_PlayerShipArrive_10212> PARSER = new AbstractParser<CR2S_PlayerShipArrive_10212>() {
         public CR2S_PlayerShipArrive_10212 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_PlayerShipArrive_10212(input, extensionRegistry);
         }
      };

      private CR2S_PlayerShipArrive_10212(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_PlayerShipArrive_10212() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_PlayerShipArrive_10212();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_PlayerShipArrive_10212(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.shipId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.rewardScale_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.beInterceptCount_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.guardId_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.level_ = input.readInt32();
                        break;
                     case 50:
                        WaterTransportMsg.TransportRecord.Builder subBuilder = null;
                        if ((this.bitField0_ & 32) != 0) {
                           subBuilder = this.record_.toBuilder();
                        }

                        this.record_ = (WaterTransportMsg.TransportRecord)input.readMessage(WaterTransportMsg.TransportRecord.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.record_);
                           this.record_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 32;
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.exRewardScale_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.shipModelId_ = input.readInt32();
                        break;
                     case 72:
                        this.bitField0_ |= 256;
                        this.worldLv_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_PlayerShipArrive_10212_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_PlayerShipArrive_10212_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_PlayerShipArrive_10212.class, Builder.class);
      }

      public boolean hasShipId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getShipId() {
         return this.shipId_;
      }

      public boolean hasRewardScale() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRewardScale() {
         return this.rewardScale_;
      }

      public boolean hasBeInterceptCount() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getBeInterceptCount() {
         return this.beInterceptCount_;
      }

      public boolean hasGuardId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getGuardId() {
         return this.guardId_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public boolean hasRecord() {
         return (this.bitField0_ & 32) != 0;
      }

      public WaterTransportMsg.TransportRecord getRecord() {
         return this.record_ == null ? WaterTransportMsg.TransportRecord.getDefaultInstance() : this.record_;
      }

      public WaterTransportMsg.TransportRecordOrBuilder getRecordOrBuilder() {
         return this.record_ == null ? WaterTransportMsg.TransportRecord.getDefaultInstance() : this.record_;
      }

      public boolean hasExRewardScale() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getExRewardScale() {
         return this.exRewardScale_;
      }

      public boolean hasShipModelId() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getShipModelId() {
         return this.shipModelId_;
      }

      public boolean hasWorldLv() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getWorldLv() {
         return this.worldLv_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasShipId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRewardScale()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBeInterceptCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGuardId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLevel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRecord()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasExRewardScale()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasShipModelId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasWorldLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getRecord().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.shipId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.rewardScale_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.beInterceptCount_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.guardId_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.level_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeMessage(6, this.getRecord());
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.exRewardScale_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.shipModelId_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.worldLv_);
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
               size += CodedOutputStream.computeInt32Size(1, this.shipId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.rewardScale_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.beInterceptCount_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.guardId_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.level_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeMessageSize(6, this.getRecord());
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.exRewardScale_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.shipModelId_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.worldLv_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_PlayerShipArrive_10212)) {
            return super.equals(obj);
         } else {
            CR2S_PlayerShipArrive_10212 other = (CR2S_PlayerShipArrive_10212)obj;
            if (this.hasShipId() != other.hasShipId()) {
               return false;
            } else if (this.hasShipId() && this.getShipId() != other.getShipId()) {
               return false;
            } else if (this.hasRewardScale() != other.hasRewardScale()) {
               return false;
            } else if (this.hasRewardScale() && this.getRewardScale() != other.getRewardScale()) {
               return false;
            } else if (this.hasBeInterceptCount() != other.hasBeInterceptCount()) {
               return false;
            } else if (this.hasBeInterceptCount() && this.getBeInterceptCount() != other.getBeInterceptCount()) {
               return false;
            } else if (this.hasGuardId() != other.hasGuardId()) {
               return false;
            } else if (this.hasGuardId() && this.getGuardId() != other.getGuardId()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (this.hasRecord() != other.hasRecord()) {
               return false;
            } else if (this.hasRecord() && !this.getRecord().equals(other.getRecord())) {
               return false;
            } else if (this.hasExRewardScale() != other.hasExRewardScale()) {
               return false;
            } else if (this.hasExRewardScale() && this.getExRewardScale() != other.getExRewardScale()) {
               return false;
            } else if (this.hasShipModelId() != other.hasShipModelId()) {
               return false;
            } else if (this.hasShipModelId() && this.getShipModelId() != other.getShipModelId()) {
               return false;
            } else if (this.hasWorldLv() != other.hasWorldLv()) {
               return false;
            } else if (this.hasWorldLv() && this.getWorldLv() != other.getWorldLv()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasShipId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getShipId();
            }

            if (this.hasRewardScale()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRewardScale();
            }

            if (this.hasBeInterceptCount()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBeInterceptCount();
            }

            if (this.hasGuardId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getGuardId();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getLevel();
            }

            if (this.hasRecord()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getRecord().hashCode();
            }

            if (this.hasExRewardScale()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getExRewardScale();
            }

            if (this.hasShipModelId()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getShipModelId();
            }

            if (this.hasWorldLv()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getWorldLv();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_PlayerShipArrive_10212 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_PlayerShipArrive_10212)PARSER.parseFrom(data);
      }

      public static CR2S_PlayerShipArrive_10212 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PlayerShipArrive_10212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PlayerShipArrive_10212 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_PlayerShipArrive_10212)PARSER.parseFrom(data);
      }

      public static CR2S_PlayerShipArrive_10212 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PlayerShipArrive_10212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PlayerShipArrive_10212 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_PlayerShipArrive_10212)PARSER.parseFrom(data);
      }

      public static CR2S_PlayerShipArrive_10212 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PlayerShipArrive_10212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PlayerShipArrive_10212 parseFrom(InputStream input) throws IOException {
         return (CR2S_PlayerShipArrive_10212)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_PlayerShipArrive_10212 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PlayerShipArrive_10212)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_PlayerShipArrive_10212 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_PlayerShipArrive_10212)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_PlayerShipArrive_10212 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PlayerShipArrive_10212)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_PlayerShipArrive_10212 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_PlayerShipArrive_10212)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_PlayerShipArrive_10212 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PlayerShipArrive_10212)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_PlayerShipArrive_10212 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_PlayerShipArrive_10212 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_PlayerShipArrive_10212> parser() {
         return PARSER;
      }

      public Parser<CR2S_PlayerShipArrive_10212> getParserForType() {
         return PARSER;
      }

      public CR2S_PlayerShipArrive_10212 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_PlayerShipArrive_10212OrBuilder {
         private int bitField0_;
         private int shipId_;
         private int rewardScale_;
         private int beInterceptCount_;
         private int guardId_;
         private int level_;
         private WaterTransportMsg.TransportRecord record_;
         private SingleFieldBuilderV3<WaterTransportMsg.TransportRecord, WaterTransportMsg.TransportRecord.Builder, WaterTransportMsg.TransportRecordOrBuilder> recordBuilder_;
         private int exRewardScale_;
         private int shipModelId_;
         private int worldLv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_PlayerShipArrive_10212_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_PlayerShipArrive_10212_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_PlayerShipArrive_10212.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.CR2S_PlayerShipArrive_10212.alwaysUseFieldBuilders) {
               this.getRecordFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.shipId_ = 0;
            this.bitField0_ &= -2;
            this.rewardScale_ = 0;
            this.bitField0_ &= -3;
            this.beInterceptCount_ = 0;
            this.bitField0_ &= -5;
            this.guardId_ = 0;
            this.bitField0_ &= -9;
            this.level_ = 0;
            this.bitField0_ &= -17;
            if (this.recordBuilder_ == null) {
               this.record_ = null;
            } else {
               this.recordBuilder_.clear();
            }

            this.bitField0_ &= -33;
            this.exRewardScale_ = 0;
            this.bitField0_ &= -65;
            this.shipModelId_ = 0;
            this.bitField0_ &= -129;
            this.worldLv_ = 0;
            this.bitField0_ &= -257;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_PlayerShipArrive_10212_descriptor;
         }

         public CR2S_PlayerShipArrive_10212 getDefaultInstanceForType() {
            return CrossWaterTransportMsg.CR2S_PlayerShipArrive_10212.getDefaultInstance();
         }

         public CR2S_PlayerShipArrive_10212 build() {
            CR2S_PlayerShipArrive_10212 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_PlayerShipArrive_10212 buildPartial() {
            CR2S_PlayerShipArrive_10212 result = new CR2S_PlayerShipArrive_10212(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.shipId_ = this.shipId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.rewardScale_ = this.rewardScale_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.beInterceptCount_ = this.beInterceptCount_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.guardId_ = this.guardId_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               if (this.recordBuilder_ == null) {
                  result.record_ = this.record_;
               } else {
                  result.record_ = (WaterTransportMsg.TransportRecord)this.recordBuilder_.build();
               }

               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.exRewardScale_ = this.exRewardScale_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.shipModelId_ = this.shipModelId_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.worldLv_ = this.worldLv_;
               to_bitField0_ |= 256;
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
            if (other instanceof CR2S_PlayerShipArrive_10212) {
               return this.mergeFrom((CR2S_PlayerShipArrive_10212)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_PlayerShipArrive_10212 other) {
            if (other == CrossWaterTransportMsg.CR2S_PlayerShipArrive_10212.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasShipId()) {
                  this.setShipId(other.getShipId());
               }

               if (other.hasRewardScale()) {
                  this.setRewardScale(other.getRewardScale());
               }

               if (other.hasBeInterceptCount()) {
                  this.setBeInterceptCount(other.getBeInterceptCount());
               }

               if (other.hasGuardId()) {
                  this.setGuardId(other.getGuardId());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (other.hasRecord()) {
                  this.mergeRecord(other.getRecord());
               }

               if (other.hasExRewardScale()) {
                  this.setExRewardScale(other.getExRewardScale());
               }

               if (other.hasShipModelId()) {
                  this.setShipModelId(other.getShipModelId());
               }

               if (other.hasWorldLv()) {
                  this.setWorldLv(other.getWorldLv());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasShipId()) {
               return false;
            } else if (!this.hasRewardScale()) {
               return false;
            } else if (!this.hasBeInterceptCount()) {
               return false;
            } else if (!this.hasGuardId()) {
               return false;
            } else if (!this.hasLevel()) {
               return false;
            } else if (!this.hasRecord()) {
               return false;
            } else if (!this.hasExRewardScale()) {
               return false;
            } else if (!this.hasShipModelId()) {
               return false;
            } else if (!this.hasWorldLv()) {
               return false;
            } else {
               return this.getRecord().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_PlayerShipArrive_10212 parsedMessage = null;

            try {
               parsedMessage = (CR2S_PlayerShipArrive_10212)CrossWaterTransportMsg.CR2S_PlayerShipArrive_10212.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_PlayerShipArrive_10212)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasShipId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getShipId() {
            return this.shipId_;
         }

         public Builder setShipId(int value) {
            this.bitField0_ |= 1;
            this.shipId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShipId() {
            this.bitField0_ &= -2;
            this.shipId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRewardScale() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRewardScale() {
            return this.rewardScale_;
         }

         public Builder setRewardScale(int value) {
            this.bitField0_ |= 2;
            this.rewardScale_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardScale() {
            this.bitField0_ &= -3;
            this.rewardScale_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBeInterceptCount() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getBeInterceptCount() {
            return this.beInterceptCount_;
         }

         public Builder setBeInterceptCount(int value) {
            this.bitField0_ |= 4;
            this.beInterceptCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBeInterceptCount() {
            this.bitField0_ &= -5;
            this.beInterceptCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGuardId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getGuardId() {
            return this.guardId_;
         }

         public Builder setGuardId(int value) {
            this.bitField0_ |= 8;
            this.guardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGuardId() {
            this.bitField0_ &= -9;
            this.guardId_ = 0;
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

         public boolean hasRecord() {
            return (this.bitField0_ & 32) != 0;
         }

         public WaterTransportMsg.TransportRecord getRecord() {
            if (this.recordBuilder_ == null) {
               return this.record_ == null ? WaterTransportMsg.TransportRecord.getDefaultInstance() : this.record_;
            } else {
               return (WaterTransportMsg.TransportRecord)this.recordBuilder_.getMessage();
            }
         }

         public Builder setRecord(WaterTransportMsg.TransportRecord value) {
            if (this.recordBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.record_ = value;
               this.onChanged();
            } else {
               this.recordBuilder_.setMessage(value);
            }

            this.bitField0_ |= 32;
            return this;
         }

         public Builder setRecord(WaterTransportMsg.TransportRecord.Builder builderForValue) {
            if (this.recordBuilder_ == null) {
               this.record_ = builderForValue.build();
               this.onChanged();
            } else {
               this.recordBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 32;
            return this;
         }

         public Builder mergeRecord(WaterTransportMsg.TransportRecord value) {
            if (this.recordBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0 && this.record_ != null && this.record_ != WaterTransportMsg.TransportRecord.getDefaultInstance()) {
                  this.record_ = WaterTransportMsg.TransportRecord.newBuilder(this.record_).mergeFrom(value).buildPartial();
               } else {
                  this.record_ = value;
               }

               this.onChanged();
            } else {
               this.recordBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 32;
            return this;
         }

         public Builder clearRecord() {
            if (this.recordBuilder_ == null) {
               this.record_ = null;
               this.onChanged();
            } else {
               this.recordBuilder_.clear();
            }

            this.bitField0_ &= -33;
            return this;
         }

         public WaterTransportMsg.TransportRecord.Builder getRecordBuilder() {
            this.bitField0_ |= 32;
            this.onChanged();
            return (WaterTransportMsg.TransportRecord.Builder)this.getRecordFieldBuilder().getBuilder();
         }

         public WaterTransportMsg.TransportRecordOrBuilder getRecordOrBuilder() {
            if (this.recordBuilder_ != null) {
               return (WaterTransportMsg.TransportRecordOrBuilder)this.recordBuilder_.getMessageOrBuilder();
            } else {
               return this.record_ == null ? WaterTransportMsg.TransportRecord.getDefaultInstance() : this.record_;
            }
         }

         private SingleFieldBuilderV3<WaterTransportMsg.TransportRecord, WaterTransportMsg.TransportRecord.Builder, WaterTransportMsg.TransportRecordOrBuilder> getRecordFieldBuilder() {
            if (this.recordBuilder_ == null) {
               this.recordBuilder_ = new SingleFieldBuilderV3(this.getRecord(), this.getParentForChildren(), this.isClean());
               this.record_ = null;
            }

            return this.recordBuilder_;
         }

         public boolean hasExRewardScale() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getExRewardScale() {
            return this.exRewardScale_;
         }

         public Builder setExRewardScale(int value) {
            this.bitField0_ |= 64;
            this.exRewardScale_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearExRewardScale() {
            this.bitField0_ &= -65;
            this.exRewardScale_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasShipModelId() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getShipModelId() {
            return this.shipModelId_;
         }

         public Builder setShipModelId(int value) {
            this.bitField0_ |= 128;
            this.shipModelId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShipModelId() {
            this.bitField0_ &= -129;
            this.shipModelId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasWorldLv() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getWorldLv() {
            return this.worldLv_;
         }

         public Builder setWorldLv(int value) {
            this.bitField0_ |= 256;
            this.worldLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWorldLv() {
            this.bitField0_ &= -257;
            this.worldLv_ = 0;
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

   public static final class CR2S_Ship_10213 extends GeneratedMessageV3 implements CR2S_Ship_10213OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SHIPDATA_FIELD_NUMBER = 1;
      private WaterTransportMsg.ShipInfo shipData_;
      private byte memoizedIsInitialized;
      private static final CR2S_Ship_10213 DEFAULT_INSTANCE = new CR2S_Ship_10213();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_Ship_10213> PARSER = new AbstractParser<CR2S_Ship_10213>() {
         public CR2S_Ship_10213 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_Ship_10213(input, extensionRegistry);
         }
      };

      private CR2S_Ship_10213(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_Ship_10213() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_Ship_10213();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_Ship_10213(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        WaterTransportMsg.ShipInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.shipData_.toBuilder();
                        }

                        this.shipData_ = (WaterTransportMsg.ShipInfo)input.readMessage(WaterTransportMsg.ShipInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.shipData_);
                           this.shipData_ = subBuilder.buildPartial();
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
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_Ship_10213_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_Ship_10213_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Ship_10213.class, Builder.class);
      }

      public boolean hasShipData() {
         return (this.bitField0_ & 1) != 0;
      }

      public WaterTransportMsg.ShipInfo getShipData() {
         return this.shipData_ == null ? WaterTransportMsg.ShipInfo.getDefaultInstance() : this.shipData_;
      }

      public WaterTransportMsg.ShipInfoOrBuilder getShipDataOrBuilder() {
         return this.shipData_ == null ? WaterTransportMsg.ShipInfo.getDefaultInstance() : this.shipData_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasShipData()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getShipData().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getShipData());
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
               size += CodedOutputStream.computeMessageSize(1, this.getShipData());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_Ship_10213)) {
            return super.equals(obj);
         } else {
            CR2S_Ship_10213 other = (CR2S_Ship_10213)obj;
            if (this.hasShipData() != other.hasShipData()) {
               return false;
            } else if (this.hasShipData() && !this.getShipData().equals(other.getShipData())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasShipData()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getShipData().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_Ship_10213 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_Ship_10213)PARSER.parseFrom(data);
      }

      public static CR2S_Ship_10213 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Ship_10213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Ship_10213 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_Ship_10213)PARSER.parseFrom(data);
      }

      public static CR2S_Ship_10213 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Ship_10213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Ship_10213 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_Ship_10213)PARSER.parseFrom(data);
      }

      public static CR2S_Ship_10213 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Ship_10213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Ship_10213 parseFrom(InputStream input) throws IOException {
         return (CR2S_Ship_10213)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Ship_10213 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Ship_10213)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Ship_10213 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_Ship_10213)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_Ship_10213 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Ship_10213)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Ship_10213 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_Ship_10213)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Ship_10213 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Ship_10213)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_Ship_10213 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_Ship_10213 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_Ship_10213> parser() {
         return PARSER;
      }

      public Parser<CR2S_Ship_10213> getParserForType() {
         return PARSER;
      }

      public CR2S_Ship_10213 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_Ship_10213OrBuilder {
         private int bitField0_;
         private WaterTransportMsg.ShipInfo shipData_;
         private SingleFieldBuilderV3<WaterTransportMsg.ShipInfo, WaterTransportMsg.ShipInfo.Builder, WaterTransportMsg.ShipInfoOrBuilder> shipDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_Ship_10213_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_Ship_10213_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Ship_10213.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.CR2S_Ship_10213.alwaysUseFieldBuilders) {
               this.getShipDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.shipDataBuilder_ == null) {
               this.shipData_ = null;
            } else {
               this.shipDataBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_Ship_10213_descriptor;
         }

         public CR2S_Ship_10213 getDefaultInstanceForType() {
            return CrossWaterTransportMsg.CR2S_Ship_10213.getDefaultInstance();
         }

         public CR2S_Ship_10213 build() {
            CR2S_Ship_10213 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_Ship_10213 buildPartial() {
            CR2S_Ship_10213 result = new CR2S_Ship_10213(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.shipDataBuilder_ == null) {
                  result.shipData_ = this.shipData_;
               } else {
                  result.shipData_ = (WaterTransportMsg.ShipInfo)this.shipDataBuilder_.build();
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
            if (other instanceof CR2S_Ship_10213) {
               return this.mergeFrom((CR2S_Ship_10213)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_Ship_10213 other) {
            if (other == CrossWaterTransportMsg.CR2S_Ship_10213.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasShipData()) {
                  this.mergeShipData(other.getShipData());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasShipData()) {
               return false;
            } else {
               return this.getShipData().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_Ship_10213 parsedMessage = null;

            try {
               parsedMessage = (CR2S_Ship_10213)CrossWaterTransportMsg.CR2S_Ship_10213.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_Ship_10213)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasShipData() {
            return (this.bitField0_ & 1) != 0;
         }

         public WaterTransportMsg.ShipInfo getShipData() {
            if (this.shipDataBuilder_ == null) {
               return this.shipData_ == null ? WaterTransportMsg.ShipInfo.getDefaultInstance() : this.shipData_;
            } else {
               return (WaterTransportMsg.ShipInfo)this.shipDataBuilder_.getMessage();
            }
         }

         public Builder setShipData(WaterTransportMsg.ShipInfo value) {
            if (this.shipDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.shipData_ = value;
               this.onChanged();
            } else {
               this.shipDataBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setShipData(WaterTransportMsg.ShipInfo.Builder builderForValue) {
            if (this.shipDataBuilder_ == null) {
               this.shipData_ = builderForValue.build();
               this.onChanged();
            } else {
               this.shipDataBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeShipData(WaterTransportMsg.ShipInfo value) {
            if (this.shipDataBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.shipData_ != null && this.shipData_ != WaterTransportMsg.ShipInfo.getDefaultInstance()) {
                  this.shipData_ = WaterTransportMsg.ShipInfo.newBuilder(this.shipData_).mergeFrom(value).buildPartial();
               } else {
                  this.shipData_ = value;
               }

               this.onChanged();
            } else {
               this.shipDataBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearShipData() {
            if (this.shipDataBuilder_ == null) {
               this.shipData_ = null;
               this.onChanged();
            } else {
               this.shipDataBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public WaterTransportMsg.ShipInfo.Builder getShipDataBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (WaterTransportMsg.ShipInfo.Builder)this.getShipDataFieldBuilder().getBuilder();
         }

         public WaterTransportMsg.ShipInfoOrBuilder getShipDataOrBuilder() {
            if (this.shipDataBuilder_ != null) {
               return (WaterTransportMsg.ShipInfoOrBuilder)this.shipDataBuilder_.getMessageOrBuilder();
            } else {
               return this.shipData_ == null ? WaterTransportMsg.ShipInfo.getDefaultInstance() : this.shipData_;
            }
         }

         private SingleFieldBuilderV3<WaterTransportMsg.ShipInfo, WaterTransportMsg.ShipInfo.Builder, WaterTransportMsg.ShipInfoOrBuilder> getShipDataFieldBuilder() {
            if (this.shipDataBuilder_ == null) {
               this.shipDataBuilder_ = new SingleFieldBuilderV3(this.getShipData(), this.getParentForChildren(), this.isClean());
               this.shipData_ = null;
            }

            return this.shipDataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CargoShipRankData extends GeneratedMessageV3 implements CargoShipRankDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      public static final int RANK_FIELD_NUMBER = 2;
      private int rank_;
      private byte memoizedIsInitialized;
      private static final CargoShipRankData DEFAULT_INSTANCE = new CargoShipRankData();
      /** @deprecated */
      @Deprecated
      public static final Parser<CargoShipRankData> PARSER = new AbstractParser<CargoShipRankData>() {
         public CargoShipRankData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CargoShipRankData(input, extensionRegistry);
         }
      };

      private CargoShipRankData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CargoShipRankData() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CargoShipRankData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CargoShipRankData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.rank_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CargoShipRankData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CargoShipRankData_fieldAccessorTable.ensureFieldAccessorsInitialized(CargoShipRankData.class, Builder.class);
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasRank() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRank() {
         return this.rank_;
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
         } else if (!this.hasRank()) {
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
            output.writeInt32(2, this.rank_);
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
               size += CodedOutputStream.computeInt32Size(2, this.rank_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CargoShipRankData)) {
            return super.equals(obj);
         } else {
            CargoShipRankData other = (CargoShipRankData)obj;
            if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasRank()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRank();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CargoShipRankData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CargoShipRankData)PARSER.parseFrom(data);
      }

      public static CargoShipRankData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CargoShipRankData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CargoShipRankData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CargoShipRankData)PARSER.parseFrom(data);
      }

      public static CargoShipRankData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CargoShipRankData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CargoShipRankData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CargoShipRankData)PARSER.parseFrom(data);
      }

      public static CargoShipRankData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CargoShipRankData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CargoShipRankData parseFrom(InputStream input) throws IOException {
         return (CargoShipRankData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CargoShipRankData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CargoShipRankData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CargoShipRankData parseDelimitedFrom(InputStream input) throws IOException {
         return (CargoShipRankData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CargoShipRankData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CargoShipRankData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CargoShipRankData parseFrom(CodedInputStream input) throws IOException {
         return (CargoShipRankData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CargoShipRankData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CargoShipRankData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CargoShipRankData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CargoShipRankData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CargoShipRankData> parser() {
         return PARSER;
      }

      public Parser<CargoShipRankData> getParserForType() {
         return PARSER;
      }

      public CargoShipRankData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CargoShipRankDataOrBuilder {
         private int bitField0_;
         private int playerId_;
         private int rank_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CargoShipRankData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CargoShipRankData_fieldAccessorTable.ensureFieldAccessorsInitialized(CargoShipRankData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.CargoShipRankData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            this.rank_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CargoShipRankData_descriptor;
         }

         public CargoShipRankData getDefaultInstanceForType() {
            return CrossWaterTransportMsg.CargoShipRankData.getDefaultInstance();
         }

         public CargoShipRankData build() {
            CargoShipRankData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CargoShipRankData buildPartial() {
            CargoShipRankData result = new CargoShipRankData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.rank_ = this.rank_;
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
            if (other instanceof CargoShipRankData) {
               return this.mergeFrom((CargoShipRankData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CargoShipRankData other) {
            if (other == CrossWaterTransportMsg.CargoShipRankData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerId()) {
               return false;
            } else {
               return this.hasRank();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CargoShipRankData parsedMessage = null;

            try {
               parsedMessage = (CargoShipRankData)CrossWaterTransportMsg.CargoShipRankData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CargoShipRankData)e.getUnfinishedMessage();
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

         public boolean hasRank() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRank() {
            return this.rank_;
         }

         public Builder setRank(int value) {
            this.bitField0_ |= 2;
            this.rank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRank() {
            this.bitField0_ &= -3;
            this.rank_ = 0;
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

   public static final class CR2S_RankReward_10214 extends GeneratedMessageV3 implements CR2S_RankReward_10214OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RANKLIST_FIELD_NUMBER = 1;
      private List<CargoShipRankData> rankList_;
      private byte memoizedIsInitialized;
      private static final CR2S_RankReward_10214 DEFAULT_INSTANCE = new CR2S_RankReward_10214();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_RankReward_10214> PARSER = new AbstractParser<CR2S_RankReward_10214>() {
         public CR2S_RankReward_10214 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_RankReward_10214(input, extensionRegistry);
         }
      };

      private CR2S_RankReward_10214(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_RankReward_10214() {
         this.memoizedIsInitialized = -1;
         this.rankList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_RankReward_10214();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_RankReward_10214(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                           this.rankList_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.rankList_.add(input.readMessage(CrossWaterTransportMsg.CargoShipRankData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.rankList_ = Collections.unmodifiableList(this.rankList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_RankReward_10214_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_RankReward_10214_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_RankReward_10214.class, Builder.class);
      }

      public List<CargoShipRankData> getRankListList() {
         return this.rankList_;
      }

      public List<? extends CargoShipRankDataOrBuilder> getRankListOrBuilderList() {
         return this.rankList_;
      }

      public int getRankListCount() {
         return this.rankList_.size();
      }

      public CargoShipRankData getRankList(int index) {
         return (CargoShipRankData)this.rankList_.get(index);
      }

      public CargoShipRankDataOrBuilder getRankListOrBuilder(int index) {
         return (CargoShipRankDataOrBuilder)this.rankList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getRankListCount(); ++i) {
               if (!this.getRankList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.rankList_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.rankList_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.rankList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.rankList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_RankReward_10214)) {
            return super.equals(obj);
         } else {
            CR2S_RankReward_10214 other = (CR2S_RankReward_10214)obj;
            if (!this.getRankListList().equals(other.getRankListList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getRankListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRankListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_RankReward_10214 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_RankReward_10214)PARSER.parseFrom(data);
      }

      public static CR2S_RankReward_10214 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_RankReward_10214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_RankReward_10214 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_RankReward_10214)PARSER.parseFrom(data);
      }

      public static CR2S_RankReward_10214 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_RankReward_10214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_RankReward_10214 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_RankReward_10214)PARSER.parseFrom(data);
      }

      public static CR2S_RankReward_10214 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_RankReward_10214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_RankReward_10214 parseFrom(InputStream input) throws IOException {
         return (CR2S_RankReward_10214)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_RankReward_10214 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_RankReward_10214)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_RankReward_10214 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_RankReward_10214)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_RankReward_10214 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_RankReward_10214)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_RankReward_10214 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_RankReward_10214)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_RankReward_10214 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_RankReward_10214)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_RankReward_10214 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_RankReward_10214 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_RankReward_10214> parser() {
         return PARSER;
      }

      public Parser<CR2S_RankReward_10214> getParserForType() {
         return PARSER;
      }

      public CR2S_RankReward_10214 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_RankReward_10214OrBuilder {
         private int bitField0_;
         private List<CargoShipRankData> rankList_;
         private RepeatedFieldBuilderV3<CargoShipRankData, CargoShipRankData.Builder, CargoShipRankDataOrBuilder> rankListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_RankReward_10214_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_RankReward_10214_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_RankReward_10214.class, Builder.class);
         }

         private Builder() {
            this.rankList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rankList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.CR2S_RankReward_10214.alwaysUseFieldBuilders) {
               this.getRankListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.rankListBuilder_ == null) {
               this.rankList_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.rankListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_RankReward_10214_descriptor;
         }

         public CR2S_RankReward_10214 getDefaultInstanceForType() {
            return CrossWaterTransportMsg.CR2S_RankReward_10214.getDefaultInstance();
         }

         public CR2S_RankReward_10214 build() {
            CR2S_RankReward_10214 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_RankReward_10214 buildPartial() {
            CR2S_RankReward_10214 result = new CR2S_RankReward_10214(this);
            int from_bitField0_ = this.bitField0_;
            if (this.rankListBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.rankList_ = Collections.unmodifiableList(this.rankList_);
                  this.bitField0_ &= -2;
               }

               result.rankList_ = this.rankList_;
            } else {
               result.rankList_ = this.rankListBuilder_.build();
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
            if (other instanceof CR2S_RankReward_10214) {
               return this.mergeFrom((CR2S_RankReward_10214)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_RankReward_10214 other) {
            if (other == CrossWaterTransportMsg.CR2S_RankReward_10214.getDefaultInstance()) {
               return this;
            } else {
               if (this.rankListBuilder_ == null) {
                  if (!other.rankList_.isEmpty()) {
                     if (this.rankList_.isEmpty()) {
                        this.rankList_ = other.rankList_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureRankListIsMutable();
                        this.rankList_.addAll(other.rankList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.rankList_.isEmpty()) {
                  if (this.rankListBuilder_.isEmpty()) {
                     this.rankListBuilder_.dispose();
                     this.rankListBuilder_ = null;
                     this.rankList_ = other.rankList_;
                     this.bitField0_ &= -2;
                     this.rankListBuilder_ = CrossWaterTransportMsg.CR2S_RankReward_10214.alwaysUseFieldBuilders ? this.getRankListFieldBuilder() : null;
                  } else {
                     this.rankListBuilder_.addAllMessages(other.rankList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getRankListCount(); ++i) {
               if (!this.getRankList(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_RankReward_10214 parsedMessage = null;

            try {
               parsedMessage = (CR2S_RankReward_10214)CrossWaterTransportMsg.CR2S_RankReward_10214.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_RankReward_10214)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRankListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.rankList_ = new ArrayList(this.rankList_);
               this.bitField0_ |= 1;
            }

         }

         public List<CargoShipRankData> getRankListList() {
            return this.rankListBuilder_ == null ? Collections.unmodifiableList(this.rankList_) : this.rankListBuilder_.getMessageList();
         }

         public int getRankListCount() {
            return this.rankListBuilder_ == null ? this.rankList_.size() : this.rankListBuilder_.getCount();
         }

         public CargoShipRankData getRankList(int index) {
            return this.rankListBuilder_ == null ? (CargoShipRankData)this.rankList_.get(index) : (CargoShipRankData)this.rankListBuilder_.getMessage(index);
         }

         public Builder setRankList(int index, CargoShipRankData value) {
            if (this.rankListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankListIsMutable();
               this.rankList_.set(index, value);
               this.onChanged();
            } else {
               this.rankListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRankList(int index, CargoShipRankData.Builder builderForValue) {
            if (this.rankListBuilder_ == null) {
               this.ensureRankListIsMutable();
               this.rankList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRankList(CargoShipRankData value) {
            if (this.rankListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankListIsMutable();
               this.rankList_.add(value);
               this.onChanged();
            } else {
               this.rankListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRankList(int index, CargoShipRankData value) {
            if (this.rankListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankListIsMutable();
               this.rankList_.add(index, value);
               this.onChanged();
            } else {
               this.rankListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRankList(CargoShipRankData.Builder builderForValue) {
            if (this.rankListBuilder_ == null) {
               this.ensureRankListIsMutable();
               this.rankList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rankListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRankList(int index, CargoShipRankData.Builder builderForValue) {
            if (this.rankListBuilder_ == null) {
               this.ensureRankListIsMutable();
               this.rankList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRankList(Iterable<? extends CargoShipRankData> values) {
            if (this.rankListBuilder_ == null) {
               this.ensureRankListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rankList_);
               this.onChanged();
            } else {
               this.rankListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRankList() {
            if (this.rankListBuilder_ == null) {
               this.rankList_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.rankListBuilder_.clear();
            }

            return this;
         }

         public Builder removeRankList(int index) {
            if (this.rankListBuilder_ == null) {
               this.ensureRankListIsMutable();
               this.rankList_.remove(index);
               this.onChanged();
            } else {
               this.rankListBuilder_.remove(index);
            }

            return this;
         }

         public CargoShipRankData.Builder getRankListBuilder(int index) {
            return (CargoShipRankData.Builder)this.getRankListFieldBuilder().getBuilder(index);
         }

         public CargoShipRankDataOrBuilder getRankListOrBuilder(int index) {
            return this.rankListBuilder_ == null ? (CargoShipRankDataOrBuilder)this.rankList_.get(index) : (CargoShipRankDataOrBuilder)this.rankListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CargoShipRankDataOrBuilder> getRankListOrBuilderList() {
            return this.rankListBuilder_ != null ? this.rankListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.rankList_);
         }

         public CargoShipRankData.Builder addRankListBuilder() {
            return (CargoShipRankData.Builder)this.getRankListFieldBuilder().addBuilder(CrossWaterTransportMsg.CargoShipRankData.getDefaultInstance());
         }

         public CargoShipRankData.Builder addRankListBuilder(int index) {
            return (CargoShipRankData.Builder)this.getRankListFieldBuilder().addBuilder(index, CrossWaterTransportMsg.CargoShipRankData.getDefaultInstance());
         }

         public List<CargoShipRankData.Builder> getRankListBuilderList() {
            return this.getRankListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CargoShipRankData, CargoShipRankData.Builder, CargoShipRankDataOrBuilder> getRankListFieldBuilder() {
            if (this.rankListBuilder_ == null) {
               this.rankListBuilder_ = new RepeatedFieldBuilderV3(this.rankList_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.rankList_ = null;
            }

            return this.rankListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_WaterTransportArrayingInfo_10215 extends GeneratedMessageV3 implements S2CR_WaterTransportArrayingInfo_10215OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SHIPID_FIELD_NUMBER = 1;
      private int shipId_;
      private byte memoizedIsInitialized;
      private static final S2CR_WaterTransportArrayingInfo_10215 DEFAULT_INSTANCE = new S2CR_WaterTransportArrayingInfo_10215();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_WaterTransportArrayingInfo_10215> PARSER = new AbstractParser<S2CR_WaterTransportArrayingInfo_10215>() {
         public S2CR_WaterTransportArrayingInfo_10215 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_WaterTransportArrayingInfo_10215(input, extensionRegistry);
         }
      };

      private S2CR_WaterTransportArrayingInfo_10215(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_WaterTransportArrayingInfo_10215() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_WaterTransportArrayingInfo_10215();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_WaterTransportArrayingInfo_10215(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.shipId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_WaterTransportArrayingInfo_10215_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_WaterTransportArrayingInfo_10215_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_WaterTransportArrayingInfo_10215.class, Builder.class);
      }

      public boolean hasShipId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getShipId() {
         return this.shipId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasShipId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.shipId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.shipId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_WaterTransportArrayingInfo_10215)) {
            return super.equals(obj);
         } else {
            S2CR_WaterTransportArrayingInfo_10215 other = (S2CR_WaterTransportArrayingInfo_10215)obj;
            if (this.hasShipId() != other.hasShipId()) {
               return false;
            } else if (this.hasShipId() && this.getShipId() != other.getShipId()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasShipId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getShipId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_WaterTransportArrayingInfo_10215 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_WaterTransportArrayingInfo_10215)PARSER.parseFrom(data);
      }

      public static S2CR_WaterTransportArrayingInfo_10215 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_WaterTransportArrayingInfo_10215)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_WaterTransportArrayingInfo_10215 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_WaterTransportArrayingInfo_10215)PARSER.parseFrom(data);
      }

      public static S2CR_WaterTransportArrayingInfo_10215 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_WaterTransportArrayingInfo_10215)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_WaterTransportArrayingInfo_10215 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_WaterTransportArrayingInfo_10215)PARSER.parseFrom(data);
      }

      public static S2CR_WaterTransportArrayingInfo_10215 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_WaterTransportArrayingInfo_10215)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_WaterTransportArrayingInfo_10215 parseFrom(InputStream input) throws IOException {
         return (S2CR_WaterTransportArrayingInfo_10215)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_WaterTransportArrayingInfo_10215 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_WaterTransportArrayingInfo_10215)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_WaterTransportArrayingInfo_10215 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_WaterTransportArrayingInfo_10215)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_WaterTransportArrayingInfo_10215 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_WaterTransportArrayingInfo_10215)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_WaterTransportArrayingInfo_10215 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_WaterTransportArrayingInfo_10215)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_WaterTransportArrayingInfo_10215 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_WaterTransportArrayingInfo_10215)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_WaterTransportArrayingInfo_10215 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_WaterTransportArrayingInfo_10215 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_WaterTransportArrayingInfo_10215> parser() {
         return PARSER;
      }

      public Parser<S2CR_WaterTransportArrayingInfo_10215> getParserForType() {
         return PARSER;
      }

      public S2CR_WaterTransportArrayingInfo_10215 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_WaterTransportArrayingInfo_10215OrBuilder {
         private int bitField0_;
         private int shipId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_WaterTransportArrayingInfo_10215_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_WaterTransportArrayingInfo_10215_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_WaterTransportArrayingInfo_10215.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.S2CR_WaterTransportArrayingInfo_10215.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.shipId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_WaterTransportArrayingInfo_10215_descriptor;
         }

         public S2CR_WaterTransportArrayingInfo_10215 getDefaultInstanceForType() {
            return CrossWaterTransportMsg.S2CR_WaterTransportArrayingInfo_10215.getDefaultInstance();
         }

         public S2CR_WaterTransportArrayingInfo_10215 build() {
            S2CR_WaterTransportArrayingInfo_10215 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_WaterTransportArrayingInfo_10215 buildPartial() {
            S2CR_WaterTransportArrayingInfo_10215 result = new S2CR_WaterTransportArrayingInfo_10215(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.shipId_ = this.shipId_;
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
            if (other instanceof S2CR_WaterTransportArrayingInfo_10215) {
               return this.mergeFrom((S2CR_WaterTransportArrayingInfo_10215)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_WaterTransportArrayingInfo_10215 other) {
            if (other == CrossWaterTransportMsg.S2CR_WaterTransportArrayingInfo_10215.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasShipId()) {
                  this.setShipId(other.getShipId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasShipId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_WaterTransportArrayingInfo_10215 parsedMessage = null;

            try {
               parsedMessage = (S2CR_WaterTransportArrayingInfo_10215)CrossWaterTransportMsg.S2CR_WaterTransportArrayingInfo_10215.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_WaterTransportArrayingInfo_10215)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasShipId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getShipId() {
            return this.shipId_;
         }

         public Builder setShipId(int value) {
            this.bitField0_ |= 1;
            this.shipId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShipId() {
            this.bitField0_ &= -2;
            this.shipId_ = 0;
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

   public static final class CR2S_Remains_10216 extends GeneratedMessageV3 implements CR2S_Remains_10216OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REMAINS_FIELD_NUMBER = 1;
      private WaterTransportMsg.RemainsInfo remains_;
      private byte memoizedIsInitialized;
      private static final CR2S_Remains_10216 DEFAULT_INSTANCE = new CR2S_Remains_10216();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_Remains_10216> PARSER = new AbstractParser<CR2S_Remains_10216>() {
         public CR2S_Remains_10216 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_Remains_10216(input, extensionRegistry);
         }
      };

      private CR2S_Remains_10216(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_Remains_10216() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_Remains_10216();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_Remains_10216(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        WaterTransportMsg.RemainsInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.remains_.toBuilder();
                        }

                        this.remains_ = (WaterTransportMsg.RemainsInfo)input.readMessage(WaterTransportMsg.RemainsInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.remains_);
                           this.remains_ = subBuilder.buildPartial();
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
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_Remains_10216_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_Remains_10216_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Remains_10216.class, Builder.class);
      }

      public boolean hasRemains() {
         return (this.bitField0_ & 1) != 0;
      }

      public WaterTransportMsg.RemainsInfo getRemains() {
         return this.remains_ == null ? WaterTransportMsg.RemainsInfo.getDefaultInstance() : this.remains_;
      }

      public WaterTransportMsg.RemainsInfoOrBuilder getRemainsOrBuilder() {
         return this.remains_ == null ? WaterTransportMsg.RemainsInfo.getDefaultInstance() : this.remains_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRemains()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getRemains().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getRemains());
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
               size += CodedOutputStream.computeMessageSize(1, this.getRemains());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_Remains_10216)) {
            return super.equals(obj);
         } else {
            CR2S_Remains_10216 other = (CR2S_Remains_10216)obj;
            if (this.hasRemains() != other.hasRemains()) {
               return false;
            } else if (this.hasRemains() && !this.getRemains().equals(other.getRemains())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasRemains()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRemains().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_Remains_10216 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_Remains_10216)PARSER.parseFrom(data);
      }

      public static CR2S_Remains_10216 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Remains_10216)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Remains_10216 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_Remains_10216)PARSER.parseFrom(data);
      }

      public static CR2S_Remains_10216 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Remains_10216)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Remains_10216 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_Remains_10216)PARSER.parseFrom(data);
      }

      public static CR2S_Remains_10216 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Remains_10216)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Remains_10216 parseFrom(InputStream input) throws IOException {
         return (CR2S_Remains_10216)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Remains_10216 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Remains_10216)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Remains_10216 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_Remains_10216)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_Remains_10216 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Remains_10216)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Remains_10216 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_Remains_10216)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Remains_10216 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Remains_10216)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_Remains_10216 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_Remains_10216 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_Remains_10216> parser() {
         return PARSER;
      }

      public Parser<CR2S_Remains_10216> getParserForType() {
         return PARSER;
      }

      public CR2S_Remains_10216 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_Remains_10216OrBuilder {
         private int bitField0_;
         private WaterTransportMsg.RemainsInfo remains_;
         private SingleFieldBuilderV3<WaterTransportMsg.RemainsInfo, WaterTransportMsg.RemainsInfo.Builder, WaterTransportMsg.RemainsInfoOrBuilder> remainsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_Remains_10216_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_Remains_10216_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Remains_10216.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.CR2S_Remains_10216.alwaysUseFieldBuilders) {
               this.getRemainsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.remainsBuilder_ == null) {
               this.remains_ = null;
            } else {
               this.remainsBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_Remains_10216_descriptor;
         }

         public CR2S_Remains_10216 getDefaultInstanceForType() {
            return CrossWaterTransportMsg.CR2S_Remains_10216.getDefaultInstance();
         }

         public CR2S_Remains_10216 build() {
            CR2S_Remains_10216 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_Remains_10216 buildPartial() {
            CR2S_Remains_10216 result = new CR2S_Remains_10216(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.remainsBuilder_ == null) {
                  result.remains_ = this.remains_;
               } else {
                  result.remains_ = (WaterTransportMsg.RemainsInfo)this.remainsBuilder_.build();
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
            if (other instanceof CR2S_Remains_10216) {
               return this.mergeFrom((CR2S_Remains_10216)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_Remains_10216 other) {
            if (other == CrossWaterTransportMsg.CR2S_Remains_10216.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRemains()) {
                  this.mergeRemains(other.getRemains());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRemains()) {
               return false;
            } else {
               return this.getRemains().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_Remains_10216 parsedMessage = null;

            try {
               parsedMessage = (CR2S_Remains_10216)CrossWaterTransportMsg.CR2S_Remains_10216.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_Remains_10216)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRemains() {
            return (this.bitField0_ & 1) != 0;
         }

         public WaterTransportMsg.RemainsInfo getRemains() {
            if (this.remainsBuilder_ == null) {
               return this.remains_ == null ? WaterTransportMsg.RemainsInfo.getDefaultInstance() : this.remains_;
            } else {
               return (WaterTransportMsg.RemainsInfo)this.remainsBuilder_.getMessage();
            }
         }

         public Builder setRemains(WaterTransportMsg.RemainsInfo value) {
            if (this.remainsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.remains_ = value;
               this.onChanged();
            } else {
               this.remainsBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setRemains(WaterTransportMsg.RemainsInfo.Builder builderForValue) {
            if (this.remainsBuilder_ == null) {
               this.remains_ = builderForValue.build();
               this.onChanged();
            } else {
               this.remainsBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeRemains(WaterTransportMsg.RemainsInfo value) {
            if (this.remainsBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.remains_ != null && this.remains_ != WaterTransportMsg.RemainsInfo.getDefaultInstance()) {
                  this.remains_ = WaterTransportMsg.RemainsInfo.newBuilder(this.remains_).mergeFrom(value).buildPartial();
               } else {
                  this.remains_ = value;
               }

               this.onChanged();
            } else {
               this.remainsBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearRemains() {
            if (this.remainsBuilder_ == null) {
               this.remains_ = null;
               this.onChanged();
            } else {
               this.remainsBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public WaterTransportMsg.RemainsInfo.Builder getRemainsBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (WaterTransportMsg.RemainsInfo.Builder)this.getRemainsFieldBuilder().getBuilder();
         }

         public WaterTransportMsg.RemainsInfoOrBuilder getRemainsOrBuilder() {
            if (this.remainsBuilder_ != null) {
               return (WaterTransportMsg.RemainsInfoOrBuilder)this.remainsBuilder_.getMessageOrBuilder();
            } else {
               return this.remains_ == null ? WaterTransportMsg.RemainsInfo.getDefaultInstance() : this.remains_;
            }
         }

         private SingleFieldBuilderV3<WaterTransportMsg.RemainsInfo, WaterTransportMsg.RemainsInfo.Builder, WaterTransportMsg.RemainsInfoOrBuilder> getRemainsFieldBuilder() {
            if (this.remainsBuilder_ == null) {
               this.remainsBuilder_ = new SingleFieldBuilderV3(this.getRemains(), this.getParentForChildren(), this.isClean());
               this.remains_ = null;
            }

            return this.remainsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CrossRemainsData extends GeneratedMessageV3 implements CrossRemainsDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int SHIPMODELID_FIELD_NUMBER = 2;
      private int shipModelId_;
      public static final int BELONGPLAYER_FIELD_NUMBER = 3;
      private int belongPlayer_;
      private byte memoizedIsInitialized;
      private static final CrossRemainsData DEFAULT_INSTANCE = new CrossRemainsData();
      /** @deprecated */
      @Deprecated
      public static final Parser<CrossRemainsData> PARSER = new AbstractParser<CrossRemainsData>() {
         public CrossRemainsData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CrossRemainsData(input, extensionRegistry);
         }
      };

      private CrossRemainsData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CrossRemainsData() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CrossRemainsData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CrossRemainsData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.shipModelId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.belongPlayer_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CrossRemainsData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CrossRemainsData_fieldAccessorTable.ensureFieldAccessorsInitialized(CrossRemainsData.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasShipModelId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getShipModelId() {
         return this.shipModelId_;
      }

      public boolean hasBelongPlayer() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getBelongPlayer() {
         return this.belongPlayer_;
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
         } else if (!this.hasShipModelId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBelongPlayer()) {
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
            output.writeInt32(2, this.shipModelId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.belongPlayer_);
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
               size += CodedOutputStream.computeInt32Size(2, this.shipModelId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.belongPlayer_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CrossRemainsData)) {
            return super.equals(obj);
         } else {
            CrossRemainsData other = (CrossRemainsData)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasShipModelId() != other.hasShipModelId()) {
               return false;
            } else if (this.hasShipModelId() && this.getShipModelId() != other.getShipModelId()) {
               return false;
            } else if (this.hasBelongPlayer() != other.hasBelongPlayer()) {
               return false;
            } else if (this.hasBelongPlayer() && this.getBelongPlayer() != other.getBelongPlayer()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasShipModelId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getShipModelId();
            }

            if (this.hasBelongPlayer()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBelongPlayer();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CrossRemainsData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CrossRemainsData)PARSER.parseFrom(data);
      }

      public static CrossRemainsData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CrossRemainsData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CrossRemainsData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CrossRemainsData)PARSER.parseFrom(data);
      }

      public static CrossRemainsData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CrossRemainsData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CrossRemainsData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CrossRemainsData)PARSER.parseFrom(data);
      }

      public static CrossRemainsData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CrossRemainsData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CrossRemainsData parseFrom(InputStream input) throws IOException {
         return (CrossRemainsData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CrossRemainsData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CrossRemainsData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CrossRemainsData parseDelimitedFrom(InputStream input) throws IOException {
         return (CrossRemainsData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CrossRemainsData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CrossRemainsData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CrossRemainsData parseFrom(CodedInputStream input) throws IOException {
         return (CrossRemainsData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CrossRemainsData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CrossRemainsData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CrossRemainsData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CrossRemainsData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CrossRemainsData> parser() {
         return PARSER;
      }

      public Parser<CrossRemainsData> getParserForType() {
         return PARSER;
      }

      public CrossRemainsData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CrossRemainsDataOrBuilder {
         private int bitField0_;
         private int id_;
         private int shipModelId_;
         private int belongPlayer_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CrossRemainsData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CrossRemainsData_fieldAccessorTable.ensureFieldAccessorsInitialized(CrossRemainsData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.CrossRemainsData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.shipModelId_ = 0;
            this.bitField0_ &= -3;
            this.belongPlayer_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CrossRemainsData_descriptor;
         }

         public CrossRemainsData getDefaultInstanceForType() {
            return CrossWaterTransportMsg.CrossRemainsData.getDefaultInstance();
         }

         public CrossRemainsData build() {
            CrossRemainsData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CrossRemainsData buildPartial() {
            CrossRemainsData result = new CrossRemainsData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.shipModelId_ = this.shipModelId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.belongPlayer_ = this.belongPlayer_;
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
            if (other instanceof CrossRemainsData) {
               return this.mergeFrom((CrossRemainsData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CrossRemainsData other) {
            if (other == CrossWaterTransportMsg.CrossRemainsData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasShipModelId()) {
                  this.setShipModelId(other.getShipModelId());
               }

               if (other.hasBelongPlayer()) {
                  this.setBelongPlayer(other.getBelongPlayer());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasId()) {
               return false;
            } else if (!this.hasShipModelId()) {
               return false;
            } else {
               return this.hasBelongPlayer();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CrossRemainsData parsedMessage = null;

            try {
               parsedMessage = (CrossRemainsData)CrossWaterTransportMsg.CrossRemainsData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CrossRemainsData)e.getUnfinishedMessage();
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

         public boolean hasShipModelId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getShipModelId() {
            return this.shipModelId_;
         }

         public Builder setShipModelId(int value) {
            this.bitField0_ |= 2;
            this.shipModelId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShipModelId() {
            this.bitField0_ &= -3;
            this.shipModelId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBelongPlayer() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getBelongPlayer() {
            return this.belongPlayer_;
         }

         public Builder setBelongPlayer(int value) {
            this.bitField0_ |= 4;
            this.belongPlayer_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBelongPlayer() {
            this.bitField0_ &= -5;
            this.belongPlayer_ = 0;
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

   public static final class S2CR_RemainsReward_10217 extends GeneratedMessageV3 implements S2CR_RemainsReward_10217OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RIVER_FIELD_NUMBER = 1;
      private int river_;
      public static final int REMAINSID_FIELD_NUMBER = 2;
      private int remainsId_;
      private byte memoizedIsInitialized;
      private static final S2CR_RemainsReward_10217 DEFAULT_INSTANCE = new S2CR_RemainsReward_10217();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_RemainsReward_10217> PARSER = new AbstractParser<S2CR_RemainsReward_10217>() {
         public S2CR_RemainsReward_10217 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_RemainsReward_10217(input, extensionRegistry);
         }
      };

      private S2CR_RemainsReward_10217(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_RemainsReward_10217() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_RemainsReward_10217();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_RemainsReward_10217(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.river_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.remainsId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_RemainsReward_10217_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_RemainsReward_10217_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_RemainsReward_10217.class, Builder.class);
      }

      public boolean hasRiver() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRiver() {
         return this.river_;
      }

      public boolean hasRemainsId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getRemainsId() {
         return this.remainsId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRiver()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRemainsId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.river_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.remainsId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.river_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.remainsId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_RemainsReward_10217)) {
            return super.equals(obj);
         } else {
            S2CR_RemainsReward_10217 other = (S2CR_RemainsReward_10217)obj;
            if (this.hasRiver() != other.hasRiver()) {
               return false;
            } else if (this.hasRiver() && this.getRiver() != other.getRiver()) {
               return false;
            } else if (this.hasRemainsId() != other.hasRemainsId()) {
               return false;
            } else if (this.hasRemainsId() && this.getRemainsId() != other.getRemainsId()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasRiver()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRiver();
            }

            if (this.hasRemainsId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRemainsId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_RemainsReward_10217 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_RemainsReward_10217)PARSER.parseFrom(data);
      }

      public static S2CR_RemainsReward_10217 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_RemainsReward_10217)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_RemainsReward_10217 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_RemainsReward_10217)PARSER.parseFrom(data);
      }

      public static S2CR_RemainsReward_10217 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_RemainsReward_10217)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_RemainsReward_10217 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_RemainsReward_10217)PARSER.parseFrom(data);
      }

      public static S2CR_RemainsReward_10217 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_RemainsReward_10217)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_RemainsReward_10217 parseFrom(InputStream input) throws IOException {
         return (S2CR_RemainsReward_10217)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_RemainsReward_10217 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_RemainsReward_10217)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_RemainsReward_10217 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_RemainsReward_10217)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_RemainsReward_10217 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_RemainsReward_10217)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_RemainsReward_10217 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_RemainsReward_10217)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_RemainsReward_10217 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_RemainsReward_10217)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_RemainsReward_10217 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_RemainsReward_10217 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_RemainsReward_10217> parser() {
         return PARSER;
      }

      public Parser<S2CR_RemainsReward_10217> getParserForType() {
         return PARSER;
      }

      public S2CR_RemainsReward_10217 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_RemainsReward_10217OrBuilder {
         private int bitField0_;
         private int river_;
         private int remainsId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_RemainsReward_10217_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_RemainsReward_10217_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_RemainsReward_10217.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.S2CR_RemainsReward_10217.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.river_ = 0;
            this.bitField0_ &= -2;
            this.remainsId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_RemainsReward_10217_descriptor;
         }

         public S2CR_RemainsReward_10217 getDefaultInstanceForType() {
            return CrossWaterTransportMsg.S2CR_RemainsReward_10217.getDefaultInstance();
         }

         public S2CR_RemainsReward_10217 build() {
            S2CR_RemainsReward_10217 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_RemainsReward_10217 buildPartial() {
            S2CR_RemainsReward_10217 result = new S2CR_RemainsReward_10217(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.river_ = this.river_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.remainsId_ = this.remainsId_;
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
            if (other instanceof S2CR_RemainsReward_10217) {
               return this.mergeFrom((S2CR_RemainsReward_10217)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_RemainsReward_10217 other) {
            if (other == CrossWaterTransportMsg.S2CR_RemainsReward_10217.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRiver()) {
                  this.setRiver(other.getRiver());
               }

               if (other.hasRemainsId()) {
                  this.setRemainsId(other.getRemainsId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRiver()) {
               return false;
            } else {
               return this.hasRemainsId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_RemainsReward_10217 parsedMessage = null;

            try {
               parsedMessage = (S2CR_RemainsReward_10217)CrossWaterTransportMsg.S2CR_RemainsReward_10217.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_RemainsReward_10217)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRiver() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRiver() {
            return this.river_;
         }

         public Builder setRiver(int value) {
            this.bitField0_ |= 1;
            this.river_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRiver() {
            this.bitField0_ &= -2;
            this.river_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRemainsId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getRemainsId() {
            return this.remainsId_;
         }

         public Builder setRemainsId(int value) {
            this.bitField0_ |= 2;
            this.remainsId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRemainsId() {
            this.bitField0_ &= -3;
            this.remainsId_ = 0;
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

   public static final class CR2S_RemainsReward_10218 extends GeneratedMessageV3 implements CR2S_RemainsReward_10218OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RIVER_FIELD_NUMBER = 1;
      private int river_;
      public static final int REMAINS_FIELD_NUMBER = 2;
      private CrossRemainsData remains_;
      private byte memoizedIsInitialized;
      private static final CR2S_RemainsReward_10218 DEFAULT_INSTANCE = new CR2S_RemainsReward_10218();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_RemainsReward_10218> PARSER = new AbstractParser<CR2S_RemainsReward_10218>() {
         public CR2S_RemainsReward_10218 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_RemainsReward_10218(input, extensionRegistry);
         }
      };

      private CR2S_RemainsReward_10218(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_RemainsReward_10218() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_RemainsReward_10218();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_RemainsReward_10218(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.river_ = input.readInt32();
                        break;
                     case 18:
                        CrossRemainsData.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.remains_.toBuilder();
                        }

                        this.remains_ = (CrossRemainsData)input.readMessage(CrossWaterTransportMsg.CrossRemainsData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.remains_);
                           this.remains_ = subBuilder.buildPartial();
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
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_RemainsReward_10218_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_RemainsReward_10218_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_RemainsReward_10218.class, Builder.class);
      }

      public boolean hasRiver() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRiver() {
         return this.river_;
      }

      public boolean hasRemains() {
         return (this.bitField0_ & 2) != 0;
      }

      public CrossRemainsData getRemains() {
         return this.remains_ == null ? CrossWaterTransportMsg.CrossRemainsData.getDefaultInstance() : this.remains_;
      }

      public CrossRemainsDataOrBuilder getRemainsOrBuilder() {
         return this.remains_ == null ? CrossWaterTransportMsg.CrossRemainsData.getDefaultInstance() : this.remains_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRiver()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRemains()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getRemains().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.river_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getRemains());
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
               size += CodedOutputStream.computeInt32Size(1, this.river_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getRemains());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_RemainsReward_10218)) {
            return super.equals(obj);
         } else {
            CR2S_RemainsReward_10218 other = (CR2S_RemainsReward_10218)obj;
            if (this.hasRiver() != other.hasRiver()) {
               return false;
            } else if (this.hasRiver() && this.getRiver() != other.getRiver()) {
               return false;
            } else if (this.hasRemains() != other.hasRemains()) {
               return false;
            } else if (this.hasRemains() && !this.getRemains().equals(other.getRemains())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasRiver()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRiver();
            }

            if (this.hasRemains()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRemains().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_RemainsReward_10218 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_RemainsReward_10218)PARSER.parseFrom(data);
      }

      public static CR2S_RemainsReward_10218 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_RemainsReward_10218)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_RemainsReward_10218 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_RemainsReward_10218)PARSER.parseFrom(data);
      }

      public static CR2S_RemainsReward_10218 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_RemainsReward_10218)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_RemainsReward_10218 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_RemainsReward_10218)PARSER.parseFrom(data);
      }

      public static CR2S_RemainsReward_10218 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_RemainsReward_10218)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_RemainsReward_10218 parseFrom(InputStream input) throws IOException {
         return (CR2S_RemainsReward_10218)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_RemainsReward_10218 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_RemainsReward_10218)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_RemainsReward_10218 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_RemainsReward_10218)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_RemainsReward_10218 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_RemainsReward_10218)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_RemainsReward_10218 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_RemainsReward_10218)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_RemainsReward_10218 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_RemainsReward_10218)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_RemainsReward_10218 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_RemainsReward_10218 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_RemainsReward_10218> parser() {
         return PARSER;
      }

      public Parser<CR2S_RemainsReward_10218> getParserForType() {
         return PARSER;
      }

      public CR2S_RemainsReward_10218 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_RemainsReward_10218OrBuilder {
         private int bitField0_;
         private int river_;
         private CrossRemainsData remains_;
         private SingleFieldBuilderV3<CrossRemainsData, CrossRemainsData.Builder, CrossRemainsDataOrBuilder> remainsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_RemainsReward_10218_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_RemainsReward_10218_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_RemainsReward_10218.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.CR2S_RemainsReward_10218.alwaysUseFieldBuilders) {
               this.getRemainsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.river_ = 0;
            this.bitField0_ &= -2;
            if (this.remainsBuilder_ == null) {
               this.remains_ = null;
            } else {
               this.remainsBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_RemainsReward_10218_descriptor;
         }

         public CR2S_RemainsReward_10218 getDefaultInstanceForType() {
            return CrossWaterTransportMsg.CR2S_RemainsReward_10218.getDefaultInstance();
         }

         public CR2S_RemainsReward_10218 build() {
            CR2S_RemainsReward_10218 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_RemainsReward_10218 buildPartial() {
            CR2S_RemainsReward_10218 result = new CR2S_RemainsReward_10218(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.river_ = this.river_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.remainsBuilder_ == null) {
                  result.remains_ = this.remains_;
               } else {
                  result.remains_ = (CrossRemainsData)this.remainsBuilder_.build();
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
            if (other instanceof CR2S_RemainsReward_10218) {
               return this.mergeFrom((CR2S_RemainsReward_10218)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_RemainsReward_10218 other) {
            if (other == CrossWaterTransportMsg.CR2S_RemainsReward_10218.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRiver()) {
                  this.setRiver(other.getRiver());
               }

               if (other.hasRemains()) {
                  this.mergeRemains(other.getRemains());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRiver()) {
               return false;
            } else if (!this.hasRemains()) {
               return false;
            } else {
               return this.getRemains().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_RemainsReward_10218 parsedMessage = null;

            try {
               parsedMessage = (CR2S_RemainsReward_10218)CrossWaterTransportMsg.CR2S_RemainsReward_10218.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_RemainsReward_10218)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRiver() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRiver() {
            return this.river_;
         }

         public Builder setRiver(int value) {
            this.bitField0_ |= 1;
            this.river_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRiver() {
            this.bitField0_ &= -2;
            this.river_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRemains() {
            return (this.bitField0_ & 2) != 0;
         }

         public CrossRemainsData getRemains() {
            if (this.remainsBuilder_ == null) {
               return this.remains_ == null ? CrossWaterTransportMsg.CrossRemainsData.getDefaultInstance() : this.remains_;
            } else {
               return (CrossRemainsData)this.remainsBuilder_.getMessage();
            }
         }

         public Builder setRemains(CrossRemainsData value) {
            if (this.remainsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.remains_ = value;
               this.onChanged();
            } else {
               this.remainsBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setRemains(CrossRemainsData.Builder builderForValue) {
            if (this.remainsBuilder_ == null) {
               this.remains_ = builderForValue.build();
               this.onChanged();
            } else {
               this.remainsBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeRemains(CrossRemainsData value) {
            if (this.remainsBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.remains_ != null && this.remains_ != CrossWaterTransportMsg.CrossRemainsData.getDefaultInstance()) {
                  this.remains_ = CrossWaterTransportMsg.CrossRemainsData.newBuilder(this.remains_).mergeFrom(value).buildPartial();
               } else {
                  this.remains_ = value;
               }

               this.onChanged();
            } else {
               this.remainsBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearRemains() {
            if (this.remainsBuilder_ == null) {
               this.remains_ = null;
               this.onChanged();
            } else {
               this.remainsBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CrossRemainsData.Builder getRemainsBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CrossRemainsData.Builder)this.getRemainsFieldBuilder().getBuilder();
         }

         public CrossRemainsDataOrBuilder getRemainsOrBuilder() {
            if (this.remainsBuilder_ != null) {
               return (CrossRemainsDataOrBuilder)this.remainsBuilder_.getMessageOrBuilder();
            } else {
               return this.remains_ == null ? CrossWaterTransportMsg.CrossRemainsData.getDefaultInstance() : this.remains_;
            }
         }

         private SingleFieldBuilderV3<CrossRemainsData, CrossRemainsData.Builder, CrossRemainsDataOrBuilder> getRemainsFieldBuilder() {
            if (this.remainsBuilder_ == null) {
               this.remainsBuilder_ = new SingleFieldBuilderV3(this.getRemains(), this.getParentForChildren(), this.isClean());
               this.remains_ = null;
            }

            return this.remainsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_RemainsRewardOneKey_10219 extends GeneratedMessageV3 implements S2CR_RemainsRewardOneKey_10219OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RIVER_FIELD_NUMBER = 1;
      private int river_;
      public static final int GOTREMAINS_FIELD_NUMBER = 2;
      private Internal.IntList gotRemains_;
      private byte memoizedIsInitialized;
      private static final S2CR_RemainsRewardOneKey_10219 DEFAULT_INSTANCE = new S2CR_RemainsRewardOneKey_10219();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_RemainsRewardOneKey_10219> PARSER = new AbstractParser<S2CR_RemainsRewardOneKey_10219>() {
         public S2CR_RemainsRewardOneKey_10219 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_RemainsRewardOneKey_10219(input, extensionRegistry);
         }
      };

      private S2CR_RemainsRewardOneKey_10219(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_RemainsRewardOneKey_10219() {
         this.memoizedIsInitialized = -1;
         this.gotRemains_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_RemainsRewardOneKey_10219();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_RemainsRewardOneKey_10219(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.river_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.gotRemains_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.gotRemains_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.gotRemains_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.gotRemains_.addInt(input.readInt32());
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
                  this.gotRemains_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_RemainsRewardOneKey_10219_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_RemainsRewardOneKey_10219_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_RemainsRewardOneKey_10219.class, Builder.class);
      }

      public boolean hasRiver() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRiver() {
         return this.river_;
      }

      public List<Integer> getGotRemainsList() {
         return this.gotRemains_;
      }

      public int getGotRemainsCount() {
         return this.gotRemains_.size();
      }

      public int getGotRemains(int index) {
         return this.gotRemains_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRiver()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.river_);
         }

         for(int i = 0; i < this.gotRemains_.size(); ++i) {
            output.writeInt32(2, this.gotRemains_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.river_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.gotRemains_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.gotRemains_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getGotRemainsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_RemainsRewardOneKey_10219)) {
            return super.equals(obj);
         } else {
            S2CR_RemainsRewardOneKey_10219 other = (S2CR_RemainsRewardOneKey_10219)obj;
            if (this.hasRiver() != other.hasRiver()) {
               return false;
            } else if (this.hasRiver() && this.getRiver() != other.getRiver()) {
               return false;
            } else if (!this.getGotRemainsList().equals(other.getGotRemainsList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasRiver()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRiver();
            }

            if (this.getGotRemainsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGotRemainsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_RemainsRewardOneKey_10219 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_RemainsRewardOneKey_10219)PARSER.parseFrom(data);
      }

      public static S2CR_RemainsRewardOneKey_10219 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_RemainsRewardOneKey_10219)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_RemainsRewardOneKey_10219 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_RemainsRewardOneKey_10219)PARSER.parseFrom(data);
      }

      public static S2CR_RemainsRewardOneKey_10219 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_RemainsRewardOneKey_10219)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_RemainsRewardOneKey_10219 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_RemainsRewardOneKey_10219)PARSER.parseFrom(data);
      }

      public static S2CR_RemainsRewardOneKey_10219 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_RemainsRewardOneKey_10219)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_RemainsRewardOneKey_10219 parseFrom(InputStream input) throws IOException {
         return (S2CR_RemainsRewardOneKey_10219)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_RemainsRewardOneKey_10219 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_RemainsRewardOneKey_10219)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_RemainsRewardOneKey_10219 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_RemainsRewardOneKey_10219)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_RemainsRewardOneKey_10219 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_RemainsRewardOneKey_10219)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_RemainsRewardOneKey_10219 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_RemainsRewardOneKey_10219)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_RemainsRewardOneKey_10219 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_RemainsRewardOneKey_10219)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_RemainsRewardOneKey_10219 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_RemainsRewardOneKey_10219 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_RemainsRewardOneKey_10219> parser() {
         return PARSER;
      }

      public Parser<S2CR_RemainsRewardOneKey_10219> getParserForType() {
         return PARSER;
      }

      public S2CR_RemainsRewardOneKey_10219 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_RemainsRewardOneKey_10219OrBuilder {
         private int bitField0_;
         private int river_;
         private Internal.IntList gotRemains_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_RemainsRewardOneKey_10219_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_RemainsRewardOneKey_10219_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_RemainsRewardOneKey_10219.class, Builder.class);
         }

         private Builder() {
            this.gotRemains_ = CrossWaterTransportMsg.S2CR_RemainsRewardOneKey_10219.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.gotRemains_ = CrossWaterTransportMsg.S2CR_RemainsRewardOneKey_10219.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.S2CR_RemainsRewardOneKey_10219.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.river_ = 0;
            this.bitField0_ &= -2;
            this.gotRemains_ = CrossWaterTransportMsg.S2CR_RemainsRewardOneKey_10219.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_RemainsRewardOneKey_10219_descriptor;
         }

         public S2CR_RemainsRewardOneKey_10219 getDefaultInstanceForType() {
            return CrossWaterTransportMsg.S2CR_RemainsRewardOneKey_10219.getDefaultInstance();
         }

         public S2CR_RemainsRewardOneKey_10219 build() {
            S2CR_RemainsRewardOneKey_10219 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_RemainsRewardOneKey_10219 buildPartial() {
            S2CR_RemainsRewardOneKey_10219 result = new S2CR_RemainsRewardOneKey_10219(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.river_ = this.river_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.gotRemains_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.gotRemains_ = this.gotRemains_;
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
            if (other instanceof S2CR_RemainsRewardOneKey_10219) {
               return this.mergeFrom((S2CR_RemainsRewardOneKey_10219)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_RemainsRewardOneKey_10219 other) {
            if (other == CrossWaterTransportMsg.S2CR_RemainsRewardOneKey_10219.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRiver()) {
                  this.setRiver(other.getRiver());
               }

               if (!other.gotRemains_.isEmpty()) {
                  if (this.gotRemains_.isEmpty()) {
                     this.gotRemains_ = other.gotRemains_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureGotRemainsIsMutable();
                     this.gotRemains_.addAll(other.gotRemains_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasRiver();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_RemainsRewardOneKey_10219 parsedMessage = null;

            try {
               parsedMessage = (S2CR_RemainsRewardOneKey_10219)CrossWaterTransportMsg.S2CR_RemainsRewardOneKey_10219.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_RemainsRewardOneKey_10219)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRiver() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRiver() {
            return this.river_;
         }

         public Builder setRiver(int value) {
            this.bitField0_ |= 1;
            this.river_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRiver() {
            this.bitField0_ &= -2;
            this.river_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureGotRemainsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.gotRemains_ = CrossWaterTransportMsg.S2CR_RemainsRewardOneKey_10219.mutableCopy(this.gotRemains_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getGotRemainsList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.gotRemains_) : this.gotRemains_);
         }

         public int getGotRemainsCount() {
            return this.gotRemains_.size();
         }

         public int getGotRemains(int index) {
            return this.gotRemains_.getInt(index);
         }

         public Builder setGotRemains(int index, int value) {
            this.ensureGotRemainsIsMutable();
            this.gotRemains_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addGotRemains(int value) {
            this.ensureGotRemainsIsMutable();
            this.gotRemains_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllGotRemains(Iterable<? extends Integer> values) {
            this.ensureGotRemainsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.gotRemains_);
            this.onChanged();
            return this;
         }

         public Builder clearGotRemains() {
            this.gotRemains_ = CrossWaterTransportMsg.S2CR_RemainsRewardOneKey_10219.emptyIntList();
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

   public static final class CR2S_RemainsRewardOneKey_10220 extends GeneratedMessageV3 implements CR2S_RemainsRewardOneKey_10220OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RIVER_FIELD_NUMBER = 1;
      private int river_;
      public static final int REMAINS_FIELD_NUMBER = 2;
      private List<CrossRemainsData> remains_;
      private byte memoizedIsInitialized;
      private static final CR2S_RemainsRewardOneKey_10220 DEFAULT_INSTANCE = new CR2S_RemainsRewardOneKey_10220();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_RemainsRewardOneKey_10220> PARSER = new AbstractParser<CR2S_RemainsRewardOneKey_10220>() {
         public CR2S_RemainsRewardOneKey_10220 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_RemainsRewardOneKey_10220(input, extensionRegistry);
         }
      };

      private CR2S_RemainsRewardOneKey_10220(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_RemainsRewardOneKey_10220() {
         this.memoizedIsInitialized = -1;
         this.remains_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_RemainsRewardOneKey_10220();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_RemainsRewardOneKey_10220(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.river_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.remains_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.remains_.add(input.readMessage(CrossWaterTransportMsg.CrossRemainsData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.remains_ = Collections.unmodifiableList(this.remains_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_RemainsRewardOneKey_10220_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_RemainsRewardOneKey_10220_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_RemainsRewardOneKey_10220.class, Builder.class);
      }

      public boolean hasRiver() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRiver() {
         return this.river_;
      }

      public List<CrossRemainsData> getRemainsList() {
         return this.remains_;
      }

      public List<? extends CrossRemainsDataOrBuilder> getRemainsOrBuilderList() {
         return this.remains_;
      }

      public int getRemainsCount() {
         return this.remains_.size();
      }

      public CrossRemainsData getRemains(int index) {
         return (CrossRemainsData)this.remains_.get(index);
      }

      public CrossRemainsDataOrBuilder getRemainsOrBuilder(int index) {
         return (CrossRemainsDataOrBuilder)this.remains_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRiver()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getRemainsCount(); ++i) {
               if (!this.getRemains(i).isInitialized()) {
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
            output.writeInt32(1, this.river_);
         }

         for(int i = 0; i < this.remains_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.remains_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.river_);
            }

            for(int i = 0; i < this.remains_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.remains_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_RemainsRewardOneKey_10220)) {
            return super.equals(obj);
         } else {
            CR2S_RemainsRewardOneKey_10220 other = (CR2S_RemainsRewardOneKey_10220)obj;
            if (this.hasRiver() != other.hasRiver()) {
               return false;
            } else if (this.hasRiver() && this.getRiver() != other.getRiver()) {
               return false;
            } else if (!this.getRemainsList().equals(other.getRemainsList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasRiver()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRiver();
            }

            if (this.getRemainsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRemainsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_RemainsRewardOneKey_10220 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_RemainsRewardOneKey_10220)PARSER.parseFrom(data);
      }

      public static CR2S_RemainsRewardOneKey_10220 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_RemainsRewardOneKey_10220)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_RemainsRewardOneKey_10220 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_RemainsRewardOneKey_10220)PARSER.parseFrom(data);
      }

      public static CR2S_RemainsRewardOneKey_10220 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_RemainsRewardOneKey_10220)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_RemainsRewardOneKey_10220 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_RemainsRewardOneKey_10220)PARSER.parseFrom(data);
      }

      public static CR2S_RemainsRewardOneKey_10220 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_RemainsRewardOneKey_10220)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_RemainsRewardOneKey_10220 parseFrom(InputStream input) throws IOException {
         return (CR2S_RemainsRewardOneKey_10220)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_RemainsRewardOneKey_10220 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_RemainsRewardOneKey_10220)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_RemainsRewardOneKey_10220 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_RemainsRewardOneKey_10220)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_RemainsRewardOneKey_10220 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_RemainsRewardOneKey_10220)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_RemainsRewardOneKey_10220 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_RemainsRewardOneKey_10220)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_RemainsRewardOneKey_10220 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_RemainsRewardOneKey_10220)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_RemainsRewardOneKey_10220 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_RemainsRewardOneKey_10220 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_RemainsRewardOneKey_10220> parser() {
         return PARSER;
      }

      public Parser<CR2S_RemainsRewardOneKey_10220> getParserForType() {
         return PARSER;
      }

      public CR2S_RemainsRewardOneKey_10220 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_RemainsRewardOneKey_10220OrBuilder {
         private int bitField0_;
         private int river_;
         private List<CrossRemainsData> remains_;
         private RepeatedFieldBuilderV3<CrossRemainsData, CrossRemainsData.Builder, CrossRemainsDataOrBuilder> remainsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_RemainsRewardOneKey_10220_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_RemainsRewardOneKey_10220_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_RemainsRewardOneKey_10220.class, Builder.class);
         }

         private Builder() {
            this.remains_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.remains_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.CR2S_RemainsRewardOneKey_10220.alwaysUseFieldBuilders) {
               this.getRemainsFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.river_ = 0;
            this.bitField0_ &= -2;
            if (this.remainsBuilder_ == null) {
               this.remains_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.remainsBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_RemainsRewardOneKey_10220_descriptor;
         }

         public CR2S_RemainsRewardOneKey_10220 getDefaultInstanceForType() {
            return CrossWaterTransportMsg.CR2S_RemainsRewardOneKey_10220.getDefaultInstance();
         }

         public CR2S_RemainsRewardOneKey_10220 build() {
            CR2S_RemainsRewardOneKey_10220 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_RemainsRewardOneKey_10220 buildPartial() {
            CR2S_RemainsRewardOneKey_10220 result = new CR2S_RemainsRewardOneKey_10220(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.river_ = this.river_;
               to_bitField0_ |= 1;
            }

            if (this.remainsBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.remains_ = Collections.unmodifiableList(this.remains_);
                  this.bitField0_ &= -3;
               }

               result.remains_ = this.remains_;
            } else {
               result.remains_ = this.remainsBuilder_.build();
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
            if (other instanceof CR2S_RemainsRewardOneKey_10220) {
               return this.mergeFrom((CR2S_RemainsRewardOneKey_10220)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_RemainsRewardOneKey_10220 other) {
            if (other == CrossWaterTransportMsg.CR2S_RemainsRewardOneKey_10220.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRiver()) {
                  this.setRiver(other.getRiver());
               }

               if (this.remainsBuilder_ == null) {
                  if (!other.remains_.isEmpty()) {
                     if (this.remains_.isEmpty()) {
                        this.remains_ = other.remains_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureRemainsIsMutable();
                        this.remains_.addAll(other.remains_);
                     }

                     this.onChanged();
                  }
               } else if (!other.remains_.isEmpty()) {
                  if (this.remainsBuilder_.isEmpty()) {
                     this.remainsBuilder_.dispose();
                     this.remainsBuilder_ = null;
                     this.remains_ = other.remains_;
                     this.bitField0_ &= -3;
                     this.remainsBuilder_ = CrossWaterTransportMsg.CR2S_RemainsRewardOneKey_10220.alwaysUseFieldBuilders ? this.getRemainsFieldBuilder() : null;
                  } else {
                     this.remainsBuilder_.addAllMessages(other.remains_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRiver()) {
               return false;
            } else {
               for(int i = 0; i < this.getRemainsCount(); ++i) {
                  if (!this.getRemains(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_RemainsRewardOneKey_10220 parsedMessage = null;

            try {
               parsedMessage = (CR2S_RemainsRewardOneKey_10220)CrossWaterTransportMsg.CR2S_RemainsRewardOneKey_10220.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_RemainsRewardOneKey_10220)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRiver() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRiver() {
            return this.river_;
         }

         public Builder setRiver(int value) {
            this.bitField0_ |= 1;
            this.river_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRiver() {
            this.bitField0_ &= -2;
            this.river_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRemainsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.remains_ = new ArrayList(this.remains_);
               this.bitField0_ |= 2;
            }

         }

         public List<CrossRemainsData> getRemainsList() {
            return this.remainsBuilder_ == null ? Collections.unmodifiableList(this.remains_) : this.remainsBuilder_.getMessageList();
         }

         public int getRemainsCount() {
            return this.remainsBuilder_ == null ? this.remains_.size() : this.remainsBuilder_.getCount();
         }

         public CrossRemainsData getRemains(int index) {
            return this.remainsBuilder_ == null ? (CrossRemainsData)this.remains_.get(index) : (CrossRemainsData)this.remainsBuilder_.getMessage(index);
         }

         public Builder setRemains(int index, CrossRemainsData value) {
            if (this.remainsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRemainsIsMutable();
               this.remains_.set(index, value);
               this.onChanged();
            } else {
               this.remainsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRemains(int index, CrossRemainsData.Builder builderForValue) {
            if (this.remainsBuilder_ == null) {
               this.ensureRemainsIsMutable();
               this.remains_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.remainsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRemains(CrossRemainsData value) {
            if (this.remainsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRemainsIsMutable();
               this.remains_.add(value);
               this.onChanged();
            } else {
               this.remainsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRemains(int index, CrossRemainsData value) {
            if (this.remainsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRemainsIsMutable();
               this.remains_.add(index, value);
               this.onChanged();
            } else {
               this.remainsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRemains(CrossRemainsData.Builder builderForValue) {
            if (this.remainsBuilder_ == null) {
               this.ensureRemainsIsMutable();
               this.remains_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.remainsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRemains(int index, CrossRemainsData.Builder builderForValue) {
            if (this.remainsBuilder_ == null) {
               this.ensureRemainsIsMutable();
               this.remains_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.remainsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRemains(Iterable<? extends CrossRemainsData> values) {
            if (this.remainsBuilder_ == null) {
               this.ensureRemainsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.remains_);
               this.onChanged();
            } else {
               this.remainsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRemains() {
            if (this.remainsBuilder_ == null) {
               this.remains_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.remainsBuilder_.clear();
            }

            return this;
         }

         public Builder removeRemains(int index) {
            if (this.remainsBuilder_ == null) {
               this.ensureRemainsIsMutable();
               this.remains_.remove(index);
               this.onChanged();
            } else {
               this.remainsBuilder_.remove(index);
            }

            return this;
         }

         public CrossRemainsData.Builder getRemainsBuilder(int index) {
            return (CrossRemainsData.Builder)this.getRemainsFieldBuilder().getBuilder(index);
         }

         public CrossRemainsDataOrBuilder getRemainsOrBuilder(int index) {
            return this.remainsBuilder_ == null ? (CrossRemainsDataOrBuilder)this.remains_.get(index) : (CrossRemainsDataOrBuilder)this.remainsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CrossRemainsDataOrBuilder> getRemainsOrBuilderList() {
            return this.remainsBuilder_ != null ? this.remainsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.remains_);
         }

         public CrossRemainsData.Builder addRemainsBuilder() {
            return (CrossRemainsData.Builder)this.getRemainsFieldBuilder().addBuilder(CrossWaterTransportMsg.CrossRemainsData.getDefaultInstance());
         }

         public CrossRemainsData.Builder addRemainsBuilder(int index) {
            return (CrossRemainsData.Builder)this.getRemainsFieldBuilder().addBuilder(index, CrossWaterTransportMsg.CrossRemainsData.getDefaultInstance());
         }

         public List<CrossRemainsData.Builder> getRemainsBuilderList() {
            return this.getRemainsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CrossRemainsData, CrossRemainsData.Builder, CrossRemainsDataOrBuilder> getRemainsFieldBuilder() {
            if (this.remainsBuilder_ == null) {
               this.remainsBuilder_ = new RepeatedFieldBuilderV3(this.remains_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.remains_ = null;
            }

            return this.remainsBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_PlayerShips_10221 extends GeneratedMessageV3 implements S2CR_PlayerShips_10221OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERID_FIELD_NUMBER = 1;
      private int playerId_;
      private byte memoizedIsInitialized;
      private static final S2CR_PlayerShips_10221 DEFAULT_INSTANCE = new S2CR_PlayerShips_10221();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_PlayerShips_10221> PARSER = new AbstractParser<S2CR_PlayerShips_10221>() {
         public S2CR_PlayerShips_10221 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_PlayerShips_10221(input, extensionRegistry);
         }
      };

      private S2CR_PlayerShips_10221(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_PlayerShips_10221() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_PlayerShips_10221();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_PlayerShips_10221(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_PlayerShips_10221_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_PlayerShips_10221_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerShips_10221.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_PlayerShips_10221)) {
            return super.equals(obj);
         } else {
            S2CR_PlayerShips_10221 other = (S2CR_PlayerShips_10221)obj;
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

      public static S2CR_PlayerShips_10221 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerShips_10221)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerShips_10221 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerShips_10221)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerShips_10221 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerShips_10221)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerShips_10221 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerShips_10221)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerShips_10221 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerShips_10221)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerShips_10221 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerShips_10221)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerShips_10221 parseFrom(InputStream input) throws IOException {
         return (S2CR_PlayerShips_10221)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerShips_10221 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerShips_10221)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerShips_10221 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_PlayerShips_10221)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_PlayerShips_10221 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerShips_10221)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerShips_10221 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_PlayerShips_10221)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerShips_10221 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerShips_10221)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_PlayerShips_10221 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_PlayerShips_10221 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_PlayerShips_10221> parser() {
         return PARSER;
      }

      public Parser<S2CR_PlayerShips_10221> getParserForType() {
         return PARSER;
      }

      public S2CR_PlayerShips_10221 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_PlayerShips_10221OrBuilder {
         private int bitField0_;
         private int playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_PlayerShips_10221_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_PlayerShips_10221_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerShips_10221.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.S2CR_PlayerShips_10221.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_PlayerShips_10221_descriptor;
         }

         public S2CR_PlayerShips_10221 getDefaultInstanceForType() {
            return CrossWaterTransportMsg.S2CR_PlayerShips_10221.getDefaultInstance();
         }

         public S2CR_PlayerShips_10221 build() {
            S2CR_PlayerShips_10221 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_PlayerShips_10221 buildPartial() {
            S2CR_PlayerShips_10221 result = new S2CR_PlayerShips_10221(this);
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
            if (other instanceof S2CR_PlayerShips_10221) {
               return this.mergeFrom((S2CR_PlayerShips_10221)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_PlayerShips_10221 other) {
            if (other == CrossWaterTransportMsg.S2CR_PlayerShips_10221.getDefaultInstance()) {
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
            S2CR_PlayerShips_10221 parsedMessage = null;

            try {
               parsedMessage = (S2CR_PlayerShips_10221)CrossWaterTransportMsg.S2CR_PlayerShips_10221.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_PlayerShips_10221)e.getUnfinishedMessage();
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

   public static final class S2CR_GoldShip_10222 extends GeneratedMessageV3 implements S2CR_GoldShip_10222OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2CR_GoldShip_10222 DEFAULT_INSTANCE = new S2CR_GoldShip_10222();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_GoldShip_10222> PARSER = new AbstractParser<S2CR_GoldShip_10222>() {
         public S2CR_GoldShip_10222 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_GoldShip_10222(input, extensionRegistry);
         }
      };

      private S2CR_GoldShip_10222(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_GoldShip_10222() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_GoldShip_10222();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_GoldShip_10222(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_GoldShip_10222_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_GoldShip_10222_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GoldShip_10222.class, Builder.class);
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
         } else if (!(obj instanceof S2CR_GoldShip_10222)) {
            return super.equals(obj);
         } else {
            S2CR_GoldShip_10222 other = (S2CR_GoldShip_10222)obj;
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

      public static S2CR_GoldShip_10222 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_GoldShip_10222)PARSER.parseFrom(data);
      }

      public static S2CR_GoldShip_10222 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GoldShip_10222)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GoldShip_10222 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_GoldShip_10222)PARSER.parseFrom(data);
      }

      public static S2CR_GoldShip_10222 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GoldShip_10222)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GoldShip_10222 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_GoldShip_10222)PARSER.parseFrom(data);
      }

      public static S2CR_GoldShip_10222 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GoldShip_10222)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GoldShip_10222 parseFrom(InputStream input) throws IOException {
         return (S2CR_GoldShip_10222)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GoldShip_10222 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GoldShip_10222)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GoldShip_10222 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_GoldShip_10222)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_GoldShip_10222 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GoldShip_10222)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GoldShip_10222 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_GoldShip_10222)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GoldShip_10222 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GoldShip_10222)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_GoldShip_10222 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_GoldShip_10222 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_GoldShip_10222> parser() {
         return PARSER;
      }

      public Parser<S2CR_GoldShip_10222> getParserForType() {
         return PARSER;
      }

      public S2CR_GoldShip_10222 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_GoldShip_10222OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_GoldShip_10222_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_GoldShip_10222_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GoldShip_10222.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.S2CR_GoldShip_10222.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_GoldShip_10222_descriptor;
         }

         public S2CR_GoldShip_10222 getDefaultInstanceForType() {
            return CrossWaterTransportMsg.S2CR_GoldShip_10222.getDefaultInstance();
         }

         public S2CR_GoldShip_10222 build() {
            S2CR_GoldShip_10222 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_GoldShip_10222 buildPartial() {
            S2CR_GoldShip_10222 result = new S2CR_GoldShip_10222(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2CR_GoldShip_10222) {
               return this.mergeFrom((S2CR_GoldShip_10222)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_GoldShip_10222 other) {
            if (other == CrossWaterTransportMsg.S2CR_GoldShip_10222.getDefaultInstance()) {
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
            S2CR_GoldShip_10222 parsedMessage = null;

            try {
               parsedMessage = (S2CR_GoldShip_10222)CrossWaterTransportMsg.S2CR_GoldShip_10222.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_GoldShip_10222)e.getUnfinishedMessage();
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

   public static final class S2CR_GoldDamageRank_10223 extends GeneratedMessageV3 implements S2CR_GoldDamageRank_10223OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LIMIT_FIELD_NUMBER = 1;
      private int limit_;
      private byte memoizedIsInitialized;
      private static final S2CR_GoldDamageRank_10223 DEFAULT_INSTANCE = new S2CR_GoldDamageRank_10223();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_GoldDamageRank_10223> PARSER = new AbstractParser<S2CR_GoldDamageRank_10223>() {
         public S2CR_GoldDamageRank_10223 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_GoldDamageRank_10223(input, extensionRegistry);
         }
      };

      private S2CR_GoldDamageRank_10223(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_GoldDamageRank_10223() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_GoldDamageRank_10223();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_GoldDamageRank_10223(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.limit_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_GoldDamageRank_10223_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_GoldDamageRank_10223_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GoldDamageRank_10223.class, Builder.class);
      }

      public boolean hasLimit() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getLimit() {
         return this.limit_;
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
            output.writeInt32(1, this.limit_);
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
               size += CodedOutputStream.computeInt32Size(1, this.limit_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_GoldDamageRank_10223)) {
            return super.equals(obj);
         } else {
            S2CR_GoldDamageRank_10223 other = (S2CR_GoldDamageRank_10223)obj;
            if (this.hasLimit() != other.hasLimit()) {
               return false;
            } else if (this.hasLimit() && this.getLimit() != other.getLimit()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasLimit()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getLimit();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_GoldDamageRank_10223 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_GoldDamageRank_10223)PARSER.parseFrom(data);
      }

      public static S2CR_GoldDamageRank_10223 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GoldDamageRank_10223)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GoldDamageRank_10223 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_GoldDamageRank_10223)PARSER.parseFrom(data);
      }

      public static S2CR_GoldDamageRank_10223 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GoldDamageRank_10223)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GoldDamageRank_10223 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_GoldDamageRank_10223)PARSER.parseFrom(data);
      }

      public static S2CR_GoldDamageRank_10223 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_GoldDamageRank_10223)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_GoldDamageRank_10223 parseFrom(InputStream input) throws IOException {
         return (S2CR_GoldDamageRank_10223)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GoldDamageRank_10223 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GoldDamageRank_10223)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GoldDamageRank_10223 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_GoldDamageRank_10223)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_GoldDamageRank_10223 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GoldDamageRank_10223)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_GoldDamageRank_10223 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_GoldDamageRank_10223)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_GoldDamageRank_10223 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_GoldDamageRank_10223)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_GoldDamageRank_10223 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_GoldDamageRank_10223 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_GoldDamageRank_10223> parser() {
         return PARSER;
      }

      public Parser<S2CR_GoldDamageRank_10223> getParserForType() {
         return PARSER;
      }

      public S2CR_GoldDamageRank_10223 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_GoldDamageRank_10223OrBuilder {
         private int bitField0_;
         private int limit_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_GoldDamageRank_10223_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_GoldDamageRank_10223_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_GoldDamageRank_10223.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.S2CR_GoldDamageRank_10223.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.limit_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_GoldDamageRank_10223_descriptor;
         }

         public S2CR_GoldDamageRank_10223 getDefaultInstanceForType() {
            return CrossWaterTransportMsg.S2CR_GoldDamageRank_10223.getDefaultInstance();
         }

         public S2CR_GoldDamageRank_10223 build() {
            S2CR_GoldDamageRank_10223 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_GoldDamageRank_10223 buildPartial() {
            S2CR_GoldDamageRank_10223 result = new S2CR_GoldDamageRank_10223(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.limit_ = this.limit_;
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
            if (other instanceof S2CR_GoldDamageRank_10223) {
               return this.mergeFrom((S2CR_GoldDamageRank_10223)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_GoldDamageRank_10223 other) {
            if (other == CrossWaterTransportMsg.S2CR_GoldDamageRank_10223.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLimit()) {
                  this.setLimit(other.getLimit());
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
            S2CR_GoldDamageRank_10223 parsedMessage = null;

            try {
               parsedMessage = (S2CR_GoldDamageRank_10223)CrossWaterTransportMsg.S2CR_GoldDamageRank_10223.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_GoldDamageRank_10223)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLimit() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getLimit() {
            return this.limit_;
         }

         public Builder setLimit(int value) {
            this.bitField0_ |= 1;
            this.limit_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLimit() {
            this.bitField0_ &= -2;
            this.limit_ = 0;
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

   public static final class CR2S_GoldShipIntercept_10224 extends GeneratedMessageV3 implements CR2S_GoldShipIntercept_10224OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STAGE_FIELD_NUMBER = 1;
      private int stage_;
      public static final int ISKILL_FIELD_NUMBER = 2;
      private boolean isKill_;
      public static final int BATTLEMSG_FIELD_NUMBER = 3;
      private BattleMsg.S2C_BattleResult_6102 battleMsg_;
      public static final int SHIPTYPE_FIELD_NUMBER = 4;
      private int shipType_;
      private byte memoizedIsInitialized;
      private static final CR2S_GoldShipIntercept_10224 DEFAULT_INSTANCE = new CR2S_GoldShipIntercept_10224();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_GoldShipIntercept_10224> PARSER = new AbstractParser<CR2S_GoldShipIntercept_10224>() {
         public CR2S_GoldShipIntercept_10224 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_GoldShipIntercept_10224(input, extensionRegistry);
         }
      };

      private CR2S_GoldShipIntercept_10224(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_GoldShipIntercept_10224() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_GoldShipIntercept_10224();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_GoldShipIntercept_10224(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.stage_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.isKill_ = input.readBool();
                        break;
                     case 26:
                        BattleMsg.S2C_BattleResult_6102.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.battleMsg_.toBuilder();
                        }

                        this.battleMsg_ = (BattleMsg.S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.battleMsg_);
                           this.battleMsg_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 4;
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.shipType_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipIntercept_10224_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipIntercept_10224_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_GoldShipIntercept_10224.class, Builder.class);
      }

      public boolean hasStage() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public boolean hasIsKill() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIsKill() {
         return this.isKill_;
      }

      public boolean hasBattleMsg() {
         return (this.bitField0_ & 4) != 0;
      }

      public BattleMsg.S2C_BattleResult_6102 getBattleMsg() {
         return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
      }

      public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder() {
         return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
      }

      public boolean hasShipType() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getShipType() {
         return this.shipType_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsKill()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBattleMsg()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasShipType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getBattleMsg().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.stage_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.isKill_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(3, this.getBattleMsg());
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.shipType_);
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
               size += CodedOutputStream.computeInt32Size(1, this.stage_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.isKill_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(3, this.getBattleMsg());
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.shipType_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_GoldShipIntercept_10224)) {
            return super.equals(obj);
         } else {
            CR2S_GoldShipIntercept_10224 other = (CR2S_GoldShipIntercept_10224)obj;
            if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else if (this.hasIsKill() != other.hasIsKill()) {
               return false;
            } else if (this.hasIsKill() && this.getIsKill() != other.getIsKill()) {
               return false;
            } else if (this.hasBattleMsg() != other.hasBattleMsg()) {
               return false;
            } else if (this.hasBattleMsg() && !this.getBattleMsg().equals(other.getBattleMsg())) {
               return false;
            } else if (this.hasShipType() != other.hasShipType()) {
               return false;
            } else if (this.hasShipType() && this.getShipType() != other.getShipType()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasStage()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getStage();
            }

            if (this.hasIsKill()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsKill());
            }

            if (this.hasBattleMsg()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getBattleMsg().hashCode();
            }

            if (this.hasShipType()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getShipType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_GoldShipIntercept_10224 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_GoldShipIntercept_10224)PARSER.parseFrom(data);
      }

      public static CR2S_GoldShipIntercept_10224 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GoldShipIntercept_10224)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GoldShipIntercept_10224 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_GoldShipIntercept_10224)PARSER.parseFrom(data);
      }

      public static CR2S_GoldShipIntercept_10224 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GoldShipIntercept_10224)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GoldShipIntercept_10224 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_GoldShipIntercept_10224)PARSER.parseFrom(data);
      }

      public static CR2S_GoldShipIntercept_10224 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GoldShipIntercept_10224)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GoldShipIntercept_10224 parseFrom(InputStream input) throws IOException {
         return (CR2S_GoldShipIntercept_10224)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_GoldShipIntercept_10224 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GoldShipIntercept_10224)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_GoldShipIntercept_10224 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_GoldShipIntercept_10224)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_GoldShipIntercept_10224 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GoldShipIntercept_10224)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_GoldShipIntercept_10224 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_GoldShipIntercept_10224)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_GoldShipIntercept_10224 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GoldShipIntercept_10224)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_GoldShipIntercept_10224 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_GoldShipIntercept_10224 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_GoldShipIntercept_10224> parser() {
         return PARSER;
      }

      public Parser<CR2S_GoldShipIntercept_10224> getParserForType() {
         return PARSER;
      }

      public CR2S_GoldShipIntercept_10224 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_GoldShipIntercept_10224OrBuilder {
         private int bitField0_;
         private int stage_;
         private boolean isKill_;
         private BattleMsg.S2C_BattleResult_6102 battleMsg_;
         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> battleMsgBuilder_;
         private int shipType_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipIntercept_10224_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipIntercept_10224_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_GoldShipIntercept_10224.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.CR2S_GoldShipIntercept_10224.alwaysUseFieldBuilders) {
               this.getBattleMsgFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.stage_ = 0;
            this.bitField0_ &= -2;
            this.isKill_ = false;
            this.bitField0_ &= -3;
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = null;
            } else {
               this.battleMsgBuilder_.clear();
            }

            this.bitField0_ &= -5;
            this.shipType_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipIntercept_10224_descriptor;
         }

         public CR2S_GoldShipIntercept_10224 getDefaultInstanceForType() {
            return CrossWaterTransportMsg.CR2S_GoldShipIntercept_10224.getDefaultInstance();
         }

         public CR2S_GoldShipIntercept_10224 build() {
            CR2S_GoldShipIntercept_10224 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_GoldShipIntercept_10224 buildPartial() {
            CR2S_GoldShipIntercept_10224 result = new CR2S_GoldShipIntercept_10224(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.stage_ = this.stage_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.isKill_ = this.isKill_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               if (this.battleMsgBuilder_ == null) {
                  result.battleMsg_ = this.battleMsg_;
               } else {
                  result.battleMsg_ = (BattleMsg.S2C_BattleResult_6102)this.battleMsgBuilder_.build();
               }

               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.shipType_ = this.shipType_;
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
            if (other instanceof CR2S_GoldShipIntercept_10224) {
               return this.mergeFrom((CR2S_GoldShipIntercept_10224)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_GoldShipIntercept_10224 other) {
            if (other == CrossWaterTransportMsg.CR2S_GoldShipIntercept_10224.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               if (other.hasIsKill()) {
                  this.setIsKill(other.getIsKill());
               }

               if (other.hasBattleMsg()) {
                  this.mergeBattleMsg(other.getBattleMsg());
               }

               if (other.hasShipType()) {
                  this.setShipType(other.getShipType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasStage()) {
               return false;
            } else if (!this.hasIsKill()) {
               return false;
            } else if (!this.hasBattleMsg()) {
               return false;
            } else if (!this.hasShipType()) {
               return false;
            } else {
               return this.getBattleMsg().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_GoldShipIntercept_10224 parsedMessage = null;

            try {
               parsedMessage = (CR2S_GoldShipIntercept_10224)CrossWaterTransportMsg.CR2S_GoldShipIntercept_10224.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_GoldShipIntercept_10224)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 1;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -2;
            this.stage_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsKill() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsKill() {
            return this.isKill_;
         }

         public Builder setIsKill(boolean value) {
            this.bitField0_ |= 2;
            this.isKill_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsKill() {
            this.bitField0_ &= -3;
            this.isKill_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasBattleMsg() {
            return (this.bitField0_ & 4) != 0;
         }

         public BattleMsg.S2C_BattleResult_6102 getBattleMsg() {
            if (this.battleMsgBuilder_ == null) {
               return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
            } else {
               return (BattleMsg.S2C_BattleResult_6102)this.battleMsgBuilder_.getMessage();
            }
         }

         public Builder setBattleMsg(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleMsgBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.battleMsg_ = value;
               this.onChanged();
            } else {
               this.battleMsgBuilder_.setMessage(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setBattleMsg(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = builderForValue.build();
               this.onChanged();
            } else {
               this.battleMsgBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeBattleMsg(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.battleMsgBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.battleMsg_ != null && this.battleMsg_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.battleMsg_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.battleMsg_).mergeFrom(value).buildPartial();
               } else {
                  this.battleMsg_ = value;
               }

               this.onChanged();
            } else {
               this.battleMsgBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearBattleMsg() {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsg_ = null;
               this.onChanged();
            } else {
               this.battleMsgBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getBattleMsgBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (BattleMsg.S2C_BattleResult_6102.Builder)this.getBattleMsgFieldBuilder().getBuilder();
         }

         public BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder() {
            if (this.battleMsgBuilder_ != null) {
               return (BattleMsg.S2C_BattleResult_6102OrBuilder)this.battleMsgBuilder_.getMessageOrBuilder();
            } else {
               return this.battleMsg_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.battleMsg_;
            }
         }

         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> getBattleMsgFieldBuilder() {
            if (this.battleMsgBuilder_ == null) {
               this.battleMsgBuilder_ = new SingleFieldBuilderV3(this.getBattleMsg(), this.getParentForChildren(), this.isClean());
               this.battleMsg_ = null;
            }

            return this.battleMsgBuilder_;
         }

         public boolean hasShipType() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getShipType() {
            return this.shipType_;
         }

         public Builder setShipType(int value) {
            this.bitField0_ |= 8;
            this.shipType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShipType() {
            this.bitField0_ &= -9;
            this.shipType_ = 0;
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

   public static final class CR2S_GoldShipNotify_10225 extends GeneratedMessageV3 implements CR2S_GoldShipNotify_10225OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GOLDINFO_FIELD_NUMBER = 1;
      private WaterTransportMsg.S2C_GoldShip_9552 goldInfo_;
      private byte memoizedIsInitialized;
      private static final CR2S_GoldShipNotify_10225 DEFAULT_INSTANCE = new CR2S_GoldShipNotify_10225();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_GoldShipNotify_10225> PARSER = new AbstractParser<CR2S_GoldShipNotify_10225>() {
         public CR2S_GoldShipNotify_10225 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_GoldShipNotify_10225(input, extensionRegistry);
         }
      };

      private CR2S_GoldShipNotify_10225(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_GoldShipNotify_10225() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_GoldShipNotify_10225();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_GoldShipNotify_10225(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        WaterTransportMsg.S2C_GoldShip_9552.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.goldInfo_.toBuilder();
                        }

                        this.goldInfo_ = (WaterTransportMsg.S2C_GoldShip_9552)input.readMessage(WaterTransportMsg.S2C_GoldShip_9552.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.goldInfo_);
                           this.goldInfo_ = subBuilder.buildPartial();
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
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipNotify_10225_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipNotify_10225_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_GoldShipNotify_10225.class, Builder.class);
      }

      public boolean hasGoldInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public WaterTransportMsg.S2C_GoldShip_9552 getGoldInfo() {
         return this.goldInfo_ == null ? WaterTransportMsg.S2C_GoldShip_9552.getDefaultInstance() : this.goldInfo_;
      }

      public WaterTransportMsg.S2C_GoldShip_9552OrBuilder getGoldInfoOrBuilder() {
         return this.goldInfo_ == null ? WaterTransportMsg.S2C_GoldShip_9552.getDefaultInstance() : this.goldInfo_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGoldInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getGoldInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getGoldInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getGoldInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_GoldShipNotify_10225)) {
            return super.equals(obj);
         } else {
            CR2S_GoldShipNotify_10225 other = (CR2S_GoldShipNotify_10225)obj;
            if (this.hasGoldInfo() != other.hasGoldInfo()) {
               return false;
            } else if (this.hasGoldInfo() && !this.getGoldInfo().equals(other.getGoldInfo())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasGoldInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGoldInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_GoldShipNotify_10225 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_GoldShipNotify_10225)PARSER.parseFrom(data);
      }

      public static CR2S_GoldShipNotify_10225 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GoldShipNotify_10225)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GoldShipNotify_10225 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_GoldShipNotify_10225)PARSER.parseFrom(data);
      }

      public static CR2S_GoldShipNotify_10225 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GoldShipNotify_10225)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GoldShipNotify_10225 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_GoldShipNotify_10225)PARSER.parseFrom(data);
      }

      public static CR2S_GoldShipNotify_10225 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GoldShipNotify_10225)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GoldShipNotify_10225 parseFrom(InputStream input) throws IOException {
         return (CR2S_GoldShipNotify_10225)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_GoldShipNotify_10225 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GoldShipNotify_10225)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_GoldShipNotify_10225 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_GoldShipNotify_10225)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_GoldShipNotify_10225 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GoldShipNotify_10225)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_GoldShipNotify_10225 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_GoldShipNotify_10225)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_GoldShipNotify_10225 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GoldShipNotify_10225)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_GoldShipNotify_10225 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_GoldShipNotify_10225 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_GoldShipNotify_10225> parser() {
         return PARSER;
      }

      public Parser<CR2S_GoldShipNotify_10225> getParserForType() {
         return PARSER;
      }

      public CR2S_GoldShipNotify_10225 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_GoldShipNotify_10225OrBuilder {
         private int bitField0_;
         private WaterTransportMsg.S2C_GoldShip_9552 goldInfo_;
         private SingleFieldBuilderV3<WaterTransportMsg.S2C_GoldShip_9552, WaterTransportMsg.S2C_GoldShip_9552.Builder, WaterTransportMsg.S2C_GoldShip_9552OrBuilder> goldInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipNotify_10225_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipNotify_10225_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_GoldShipNotify_10225.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.CR2S_GoldShipNotify_10225.alwaysUseFieldBuilders) {
               this.getGoldInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.goldInfoBuilder_ == null) {
               this.goldInfo_ = null;
            } else {
               this.goldInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipNotify_10225_descriptor;
         }

         public CR2S_GoldShipNotify_10225 getDefaultInstanceForType() {
            return CrossWaterTransportMsg.CR2S_GoldShipNotify_10225.getDefaultInstance();
         }

         public CR2S_GoldShipNotify_10225 build() {
            CR2S_GoldShipNotify_10225 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_GoldShipNotify_10225 buildPartial() {
            CR2S_GoldShipNotify_10225 result = new CR2S_GoldShipNotify_10225(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.goldInfoBuilder_ == null) {
                  result.goldInfo_ = this.goldInfo_;
               } else {
                  result.goldInfo_ = (WaterTransportMsg.S2C_GoldShip_9552)this.goldInfoBuilder_.build();
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
            if (other instanceof CR2S_GoldShipNotify_10225) {
               return this.mergeFrom((CR2S_GoldShipNotify_10225)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_GoldShipNotify_10225 other) {
            if (other == CrossWaterTransportMsg.CR2S_GoldShipNotify_10225.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGoldInfo()) {
                  this.mergeGoldInfo(other.getGoldInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGoldInfo()) {
               return false;
            } else {
               return this.getGoldInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_GoldShipNotify_10225 parsedMessage = null;

            try {
               parsedMessage = (CR2S_GoldShipNotify_10225)CrossWaterTransportMsg.CR2S_GoldShipNotify_10225.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_GoldShipNotify_10225)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGoldInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public WaterTransportMsg.S2C_GoldShip_9552 getGoldInfo() {
            if (this.goldInfoBuilder_ == null) {
               return this.goldInfo_ == null ? WaterTransportMsg.S2C_GoldShip_9552.getDefaultInstance() : this.goldInfo_;
            } else {
               return (WaterTransportMsg.S2C_GoldShip_9552)this.goldInfoBuilder_.getMessage();
            }
         }

         public Builder setGoldInfo(WaterTransportMsg.S2C_GoldShip_9552 value) {
            if (this.goldInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.goldInfo_ = value;
               this.onChanged();
            } else {
               this.goldInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setGoldInfo(WaterTransportMsg.S2C_GoldShip_9552.Builder builderForValue) {
            if (this.goldInfoBuilder_ == null) {
               this.goldInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.goldInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeGoldInfo(WaterTransportMsg.S2C_GoldShip_9552 value) {
            if (this.goldInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.goldInfo_ != null && this.goldInfo_ != WaterTransportMsg.S2C_GoldShip_9552.getDefaultInstance()) {
                  this.goldInfo_ = WaterTransportMsg.S2C_GoldShip_9552.newBuilder(this.goldInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.goldInfo_ = value;
               }

               this.onChanged();
            } else {
               this.goldInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearGoldInfo() {
            if (this.goldInfoBuilder_ == null) {
               this.goldInfo_ = null;
               this.onChanged();
            } else {
               this.goldInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public WaterTransportMsg.S2C_GoldShip_9552.Builder getGoldInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (WaterTransportMsg.S2C_GoldShip_9552.Builder)this.getGoldInfoFieldBuilder().getBuilder();
         }

         public WaterTransportMsg.S2C_GoldShip_9552OrBuilder getGoldInfoOrBuilder() {
            if (this.goldInfoBuilder_ != null) {
               return (WaterTransportMsg.S2C_GoldShip_9552OrBuilder)this.goldInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.goldInfo_ == null ? WaterTransportMsg.S2C_GoldShip_9552.getDefaultInstance() : this.goldInfo_;
            }
         }

         private SingleFieldBuilderV3<WaterTransportMsg.S2C_GoldShip_9552, WaterTransportMsg.S2C_GoldShip_9552.Builder, WaterTransportMsg.S2C_GoldShip_9552OrBuilder> getGoldInfoFieldBuilder() {
            if (this.goldInfoBuilder_ == null) {
               this.goldInfoBuilder_ = new SingleFieldBuilderV3(this.getGoldInfo(), this.getParentForChildren(), this.isClean());
               this.goldInfo_ = null;
            }

            return this.goldInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_GoldShipDamageReward_10226 extends GeneratedMessageV3 implements CR2S_GoldShipDamageReward_10226OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int DAMAGE_FIELD_NUMBER = 1;
      private long damage_;
      public static final int SHIPTYPE_FIELD_NUMBER = 2;
      private int shipType_;
      public static final int RANKDATA_FIELD_NUMBER = 3;
      private List<CargoShipRankData> rankData_;
      private byte memoizedIsInitialized;
      private static final CR2S_GoldShipDamageReward_10226 DEFAULT_INSTANCE = new CR2S_GoldShipDamageReward_10226();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_GoldShipDamageReward_10226> PARSER = new AbstractParser<CR2S_GoldShipDamageReward_10226>() {
         public CR2S_GoldShipDamageReward_10226 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_GoldShipDamageReward_10226(input, extensionRegistry);
         }
      };

      private CR2S_GoldShipDamageReward_10226(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_GoldShipDamageReward_10226() {
         this.memoizedIsInitialized = -1;
         this.rankData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_GoldShipDamageReward_10226();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_GoldShipDamageReward_10226(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.damage_ = input.readInt64();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.shipType_ = input.readInt32();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.rankData_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.rankData_.add(input.readMessage(CrossWaterTransportMsg.CargoShipRankData.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.rankData_ = Collections.unmodifiableList(this.rankData_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipDamageReward_10226_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipDamageReward_10226_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_GoldShipDamageReward_10226.class, Builder.class);
      }

      public boolean hasDamage() {
         return (this.bitField0_ & 1) != 0;
      }

      public long getDamage() {
         return this.damage_;
      }

      public boolean hasShipType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getShipType() {
         return this.shipType_;
      }

      public List<CargoShipRankData> getRankDataList() {
         return this.rankData_;
      }

      public List<? extends CargoShipRankDataOrBuilder> getRankDataOrBuilderList() {
         return this.rankData_;
      }

      public int getRankDataCount() {
         return this.rankData_.size();
      }

      public CargoShipRankData getRankData(int index) {
         return (CargoShipRankData)this.rankData_.get(index);
      }

      public CargoShipRankDataOrBuilder getRankDataOrBuilder(int index) {
         return (CargoShipRankDataOrBuilder)this.rankData_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasDamage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasShipType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getRankDataCount(); ++i) {
               if (!this.getRankData(i).isInitialized()) {
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
            output.writeInt64(1, this.damage_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.shipType_);
         }

         for(int i = 0; i < this.rankData_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.rankData_.get(i));
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
               size += CodedOutputStream.computeInt64Size(1, this.damage_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.shipType_);
            }

            for(int i = 0; i < this.rankData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.rankData_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_GoldShipDamageReward_10226)) {
            return super.equals(obj);
         } else {
            CR2S_GoldShipDamageReward_10226 other = (CR2S_GoldShipDamageReward_10226)obj;
            if (this.hasDamage() != other.hasDamage()) {
               return false;
            } else if (this.hasDamage() && this.getDamage() != other.getDamage()) {
               return false;
            } else if (this.hasShipType() != other.hasShipType()) {
               return false;
            } else if (this.hasShipType() && this.getShipType() != other.getShipType()) {
               return false;
            } else if (!this.getRankDataList().equals(other.getRankDataList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasDamage()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashLong(this.getDamage());
            }

            if (this.hasShipType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getShipType();
            }

            if (this.getRankDataCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getRankDataList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_GoldShipDamageReward_10226 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_GoldShipDamageReward_10226)PARSER.parseFrom(data);
      }

      public static CR2S_GoldShipDamageReward_10226 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GoldShipDamageReward_10226)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GoldShipDamageReward_10226 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_GoldShipDamageReward_10226)PARSER.parseFrom(data);
      }

      public static CR2S_GoldShipDamageReward_10226 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GoldShipDamageReward_10226)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GoldShipDamageReward_10226 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_GoldShipDamageReward_10226)PARSER.parseFrom(data);
      }

      public static CR2S_GoldShipDamageReward_10226 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_GoldShipDamageReward_10226)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_GoldShipDamageReward_10226 parseFrom(InputStream input) throws IOException {
         return (CR2S_GoldShipDamageReward_10226)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_GoldShipDamageReward_10226 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GoldShipDamageReward_10226)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_GoldShipDamageReward_10226 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_GoldShipDamageReward_10226)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_GoldShipDamageReward_10226 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GoldShipDamageReward_10226)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_GoldShipDamageReward_10226 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_GoldShipDamageReward_10226)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_GoldShipDamageReward_10226 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_GoldShipDamageReward_10226)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_GoldShipDamageReward_10226 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_GoldShipDamageReward_10226 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_GoldShipDamageReward_10226> parser() {
         return PARSER;
      }

      public Parser<CR2S_GoldShipDamageReward_10226> getParserForType() {
         return PARSER;
      }

      public CR2S_GoldShipDamageReward_10226 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_GoldShipDamageReward_10226OrBuilder {
         private int bitField0_;
         private long damage_;
         private int shipType_;
         private List<CargoShipRankData> rankData_;
         private RepeatedFieldBuilderV3<CargoShipRankData, CargoShipRankData.Builder, CargoShipRankDataOrBuilder> rankDataBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipDamageReward_10226_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipDamageReward_10226_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_GoldShipDamageReward_10226.class, Builder.class);
         }

         private Builder() {
            this.rankData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rankData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.CR2S_GoldShipDamageReward_10226.alwaysUseFieldBuilders) {
               this.getRankDataFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.damage_ = 0L;
            this.bitField0_ &= -2;
            this.shipType_ = 0;
            this.bitField0_ &= -3;
            if (this.rankDataBuilder_ == null) {
               this.rankData_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.rankDataBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_CR2S_GoldShipDamageReward_10226_descriptor;
         }

         public CR2S_GoldShipDamageReward_10226 getDefaultInstanceForType() {
            return CrossWaterTransportMsg.CR2S_GoldShipDamageReward_10226.getDefaultInstance();
         }

         public CR2S_GoldShipDamageReward_10226 build() {
            CR2S_GoldShipDamageReward_10226 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_GoldShipDamageReward_10226 buildPartial() {
            CR2S_GoldShipDamageReward_10226 result = new CR2S_GoldShipDamageReward_10226(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.damage_ = this.damage_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.shipType_ = this.shipType_;
               to_bitField0_ |= 2;
            }

            if (this.rankDataBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.rankData_ = Collections.unmodifiableList(this.rankData_);
                  this.bitField0_ &= -5;
               }

               result.rankData_ = this.rankData_;
            } else {
               result.rankData_ = this.rankDataBuilder_.build();
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
            if (other instanceof CR2S_GoldShipDamageReward_10226) {
               return this.mergeFrom((CR2S_GoldShipDamageReward_10226)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_GoldShipDamageReward_10226 other) {
            if (other == CrossWaterTransportMsg.CR2S_GoldShipDamageReward_10226.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasDamage()) {
                  this.setDamage(other.getDamage());
               }

               if (other.hasShipType()) {
                  this.setShipType(other.getShipType());
               }

               if (this.rankDataBuilder_ == null) {
                  if (!other.rankData_.isEmpty()) {
                     if (this.rankData_.isEmpty()) {
                        this.rankData_ = other.rankData_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureRankDataIsMutable();
                        this.rankData_.addAll(other.rankData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.rankData_.isEmpty()) {
                  if (this.rankDataBuilder_.isEmpty()) {
                     this.rankDataBuilder_.dispose();
                     this.rankDataBuilder_ = null;
                     this.rankData_ = other.rankData_;
                     this.bitField0_ &= -5;
                     this.rankDataBuilder_ = CrossWaterTransportMsg.CR2S_GoldShipDamageReward_10226.alwaysUseFieldBuilders ? this.getRankDataFieldBuilder() : null;
                  } else {
                     this.rankDataBuilder_.addAllMessages(other.rankData_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasDamage()) {
               return false;
            } else if (!this.hasShipType()) {
               return false;
            } else {
               for(int i = 0; i < this.getRankDataCount(); ++i) {
                  if (!this.getRankData(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_GoldShipDamageReward_10226 parsedMessage = null;

            try {
               parsedMessage = (CR2S_GoldShipDamageReward_10226)CrossWaterTransportMsg.CR2S_GoldShipDamageReward_10226.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_GoldShipDamageReward_10226)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasDamage() {
            return (this.bitField0_ & 1) != 0;
         }

         public long getDamage() {
            return this.damage_;
         }

         public Builder setDamage(long value) {
            this.bitField0_ |= 1;
            this.damage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDamage() {
            this.bitField0_ &= -2;
            this.damage_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasShipType() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getShipType() {
            return this.shipType_;
         }

         public Builder setShipType(int value) {
            this.bitField0_ |= 2;
            this.shipType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShipType() {
            this.bitField0_ &= -3;
            this.shipType_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureRankDataIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.rankData_ = new ArrayList(this.rankData_);
               this.bitField0_ |= 4;
            }

         }

         public List<CargoShipRankData> getRankDataList() {
            return this.rankDataBuilder_ == null ? Collections.unmodifiableList(this.rankData_) : this.rankDataBuilder_.getMessageList();
         }

         public int getRankDataCount() {
            return this.rankDataBuilder_ == null ? this.rankData_.size() : this.rankDataBuilder_.getCount();
         }

         public CargoShipRankData getRankData(int index) {
            return this.rankDataBuilder_ == null ? (CargoShipRankData)this.rankData_.get(index) : (CargoShipRankData)this.rankDataBuilder_.getMessage(index);
         }

         public Builder setRankData(int index, CargoShipRankData value) {
            if (this.rankDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankDataIsMutable();
               this.rankData_.set(index, value);
               this.onChanged();
            } else {
               this.rankDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRankData(int index, CargoShipRankData.Builder builderForValue) {
            if (this.rankDataBuilder_ == null) {
               this.ensureRankDataIsMutable();
               this.rankData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRankData(CargoShipRankData value) {
            if (this.rankDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankDataIsMutable();
               this.rankData_.add(value);
               this.onChanged();
            } else {
               this.rankDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRankData(int index, CargoShipRankData value) {
            if (this.rankDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankDataIsMutable();
               this.rankData_.add(index, value);
               this.onChanged();
            } else {
               this.rankDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRankData(CargoShipRankData.Builder builderForValue) {
            if (this.rankDataBuilder_ == null) {
               this.ensureRankDataIsMutable();
               this.rankData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rankDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRankData(int index, CargoShipRankData.Builder builderForValue) {
            if (this.rankDataBuilder_ == null) {
               this.ensureRankDataIsMutable();
               this.rankData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRankData(Iterable<? extends CargoShipRankData> values) {
            if (this.rankDataBuilder_ == null) {
               this.ensureRankDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rankData_);
               this.onChanged();
            } else {
               this.rankDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRankData() {
            if (this.rankDataBuilder_ == null) {
               this.rankData_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.rankDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeRankData(int index) {
            if (this.rankDataBuilder_ == null) {
               this.ensureRankDataIsMutable();
               this.rankData_.remove(index);
               this.onChanged();
            } else {
               this.rankDataBuilder_.remove(index);
            }

            return this;
         }

         public CargoShipRankData.Builder getRankDataBuilder(int index) {
            return (CargoShipRankData.Builder)this.getRankDataFieldBuilder().getBuilder(index);
         }

         public CargoShipRankDataOrBuilder getRankDataOrBuilder(int index) {
            return this.rankDataBuilder_ == null ? (CargoShipRankDataOrBuilder)this.rankData_.get(index) : (CargoShipRankDataOrBuilder)this.rankDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CargoShipRankDataOrBuilder> getRankDataOrBuilderList() {
            return this.rankDataBuilder_ != null ? this.rankDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.rankData_);
         }

         public CargoShipRankData.Builder addRankDataBuilder() {
            return (CargoShipRankData.Builder)this.getRankDataFieldBuilder().addBuilder(CrossWaterTransportMsg.CargoShipRankData.getDefaultInstance());
         }

         public CargoShipRankData.Builder addRankDataBuilder(int index) {
            return (CargoShipRankData.Builder)this.getRankDataFieldBuilder().addBuilder(index, CrossWaterTransportMsg.CargoShipRankData.getDefaultInstance());
         }

         public List<CargoShipRankData.Builder> getRankDataBuilderList() {
            return this.getRankDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CargoShipRankData, CargoShipRankData.Builder, CargoShipRankDataOrBuilder> getRankDataFieldBuilder() {
            if (this.rankDataBuilder_ == null) {
               this.rankDataBuilder_ = new RepeatedFieldBuilderV3(this.rankData_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.rankData_ = null;
            }

            return this.rankDataBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_InterceptGoldShip_10227 extends GeneratedMessageV3 implements S2CR_InterceptGoldShip_10227OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROARRAYINGDATA_FIELD_NUMBER = 1;
      private ByteString heroArrayingData_;
      public static final int SHIPTYPE_FIELD_NUMBER = 2;
      private int shipType_;
      private byte memoizedIsInitialized;
      private static final S2CR_InterceptGoldShip_10227 DEFAULT_INSTANCE = new S2CR_InterceptGoldShip_10227();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_InterceptGoldShip_10227> PARSER = new AbstractParser<S2CR_InterceptGoldShip_10227>() {
         public S2CR_InterceptGoldShip_10227 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_InterceptGoldShip_10227(input, extensionRegistry);
         }
      };

      private S2CR_InterceptGoldShip_10227(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_InterceptGoldShip_10227() {
         this.memoizedIsInitialized = -1;
         this.heroArrayingData_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_InterceptGoldShip_10227();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_InterceptGoldShip_10227(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.bitField0_ |= 1;
                        this.heroArrayingData_ = input.readBytes();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.shipType_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_InterceptGoldShip_10227_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_InterceptGoldShip_10227_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_InterceptGoldShip_10227.class, Builder.class);
      }

      public boolean hasHeroArrayingData() {
         return (this.bitField0_ & 1) != 0;
      }

      public ByteString getHeroArrayingData() {
         return this.heroArrayingData_;
      }

      public boolean hasShipType() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getShipType() {
         return this.shipType_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHeroArrayingData()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasShipType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBytes(1, this.heroArrayingData_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.shipType_);
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
               size += CodedOutputStream.computeBytesSize(1, this.heroArrayingData_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.shipType_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_InterceptGoldShip_10227)) {
            return super.equals(obj);
         } else {
            S2CR_InterceptGoldShip_10227 other = (S2CR_InterceptGoldShip_10227)obj;
            if (this.hasHeroArrayingData() != other.hasHeroArrayingData()) {
               return false;
            } else if (this.hasHeroArrayingData() && !this.getHeroArrayingData().equals(other.getHeroArrayingData())) {
               return false;
            } else if (this.hasShipType() != other.hasShipType()) {
               return false;
            } else if (this.hasShipType() && this.getShipType() != other.getShipType()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasHeroArrayingData()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHeroArrayingData().hashCode();
            }

            if (this.hasShipType()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getShipType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_InterceptGoldShip_10227 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_InterceptGoldShip_10227)PARSER.parseFrom(data);
      }

      public static S2CR_InterceptGoldShip_10227 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_InterceptGoldShip_10227)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_InterceptGoldShip_10227 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_InterceptGoldShip_10227)PARSER.parseFrom(data);
      }

      public static S2CR_InterceptGoldShip_10227 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_InterceptGoldShip_10227)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_InterceptGoldShip_10227 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_InterceptGoldShip_10227)PARSER.parseFrom(data);
      }

      public static S2CR_InterceptGoldShip_10227 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_InterceptGoldShip_10227)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_InterceptGoldShip_10227 parseFrom(InputStream input) throws IOException {
         return (S2CR_InterceptGoldShip_10227)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_InterceptGoldShip_10227 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_InterceptGoldShip_10227)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_InterceptGoldShip_10227 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_InterceptGoldShip_10227)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_InterceptGoldShip_10227 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_InterceptGoldShip_10227)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_InterceptGoldShip_10227 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_InterceptGoldShip_10227)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_InterceptGoldShip_10227 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_InterceptGoldShip_10227)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_InterceptGoldShip_10227 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_InterceptGoldShip_10227 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_InterceptGoldShip_10227> parser() {
         return PARSER;
      }

      public Parser<S2CR_InterceptGoldShip_10227> getParserForType() {
         return PARSER;
      }

      public S2CR_InterceptGoldShip_10227 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_InterceptGoldShip_10227OrBuilder {
         private int bitField0_;
         private ByteString heroArrayingData_;
         private int shipType_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_InterceptGoldShip_10227_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_InterceptGoldShip_10227_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_InterceptGoldShip_10227.class, Builder.class);
         }

         private Builder() {
            this.heroArrayingData_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.heroArrayingData_ = ByteString.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossWaterTransportMsg.S2CR_InterceptGoldShip_10227.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.heroArrayingData_ = ByteString.EMPTY;
            this.bitField0_ &= -2;
            this.shipType_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossWaterTransportMsg.internal_static_crossTransport_com_gzbz_protobuf_S2CR_InterceptGoldShip_10227_descriptor;
         }

         public S2CR_InterceptGoldShip_10227 getDefaultInstanceForType() {
            return CrossWaterTransportMsg.S2CR_InterceptGoldShip_10227.getDefaultInstance();
         }

         public S2CR_InterceptGoldShip_10227 build() {
            S2CR_InterceptGoldShip_10227 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_InterceptGoldShip_10227 buildPartial() {
            S2CR_InterceptGoldShip_10227 result = new S2CR_InterceptGoldShip_10227(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.heroArrayingData_ = this.heroArrayingData_;
            if ((from_bitField0_ & 2) != 0) {
               result.shipType_ = this.shipType_;
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
            if (other instanceof S2CR_InterceptGoldShip_10227) {
               return this.mergeFrom((S2CR_InterceptGoldShip_10227)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_InterceptGoldShip_10227 other) {
            if (other == CrossWaterTransportMsg.S2CR_InterceptGoldShip_10227.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroArrayingData()) {
                  this.setHeroArrayingData(other.getHeroArrayingData());
               }

               if (other.hasShipType()) {
                  this.setShipType(other.getShipType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroArrayingData()) {
               return false;
            } else {
               return this.hasShipType();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_InterceptGoldShip_10227 parsedMessage = null;

            try {
               parsedMessage = (S2CR_InterceptGoldShip_10227)CrossWaterTransportMsg.S2CR_InterceptGoldShip_10227.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_InterceptGoldShip_10227)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHeroArrayingData() {
            return (this.bitField0_ & 1) != 0;
         }

         public ByteString getHeroArrayingData() {
            return this.heroArrayingData_;
         }

         public Builder setHeroArrayingData(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.heroArrayingData_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearHeroArrayingData() {
            this.bitField0_ &= -2;
            this.heroArrayingData_ = CrossWaterTransportMsg.S2CR_InterceptGoldShip_10227.getDefaultInstance().getHeroArrayingData();
            this.onChanged();
            return this;
         }

         public boolean hasShipType() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getShipType() {
            return this.shipType_;
         }

         public Builder setShipType(int value) {
            this.bitField0_ |= 2;
            this.shipType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShipType() {
            this.bitField0_ &= -3;
            this.shipType_ = 0;
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

   public interface AltarDataOrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasId();

      int getId();

      boolean hasExp();

      int getExp();
   }

   public interface CR2S_BeInterceptLog_10211OrBuilder extends MessageOrBuilder {
      boolean hasShipId();

      int getShipId();

      boolean hasRewardScale();

      int getRewardScale();

      boolean hasBeInterceptCount();

      int getBeInterceptCount();

      boolean hasLevel();

      int getLevel();

      boolean hasRecord();

      WaterTransportMsg.TransportRecord getRecord();

      WaterTransportMsg.TransportRecordOrBuilder getRecordOrBuilder();

      boolean hasBattleMsg();

      BattleMsg.S2C_BattleResult_6102 getBattleMsg();

      BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder();

      boolean hasWorldLv();

      int getWorldLv();
   }

   public interface CR2S_GoldShipDamageReward_10226OrBuilder extends MessageOrBuilder {
      boolean hasDamage();

      long getDamage();

      boolean hasShipType();

      int getShipType();

      List<CargoShipRankData> getRankDataList();

      CargoShipRankData getRankData(int index);

      int getRankDataCount();

      List<? extends CargoShipRankDataOrBuilder> getRankDataOrBuilderList();

      CargoShipRankDataOrBuilder getRankDataOrBuilder(int index);
   }

   public interface CR2S_GoldShipIntercept_10224OrBuilder extends MessageOrBuilder {
      boolean hasStage();

      int getStage();

      boolean hasIsKill();

      boolean getIsKill();

      boolean hasBattleMsg();

      BattleMsg.S2C_BattleResult_6102 getBattleMsg();

      BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder();

      boolean hasShipType();

      int getShipType();
   }

   public interface CR2S_GoldShipNotify_10225OrBuilder extends MessageOrBuilder {
      boolean hasGoldInfo();

      WaterTransportMsg.S2C_GoldShip_9552 getGoldInfo();

      WaterTransportMsg.S2C_GoldShip_9552OrBuilder getGoldInfoOrBuilder();
   }

   public interface CR2S_Intercept_10208OrBuilder extends MessageOrBuilder {
      boolean hasShipModelId();

      int getShipModelId();

      boolean hasRewardScale();

      int getRewardScale();

      boolean hasGuardId();

      int getGuardId();

      boolean hasShipId();

      int getShipId();

      boolean hasLevel();

      int getLevel();

      boolean hasBattleMsg();

      BattleMsg.S2C_BattleResult_6102 getBattleMsg();

      BattleMsg.S2C_BattleResult_6102OrBuilder getBattleMsgOrBuilder();

      boolean hasRecord();

      WaterTransportMsg.TransportRecord getRecord();

      WaterTransportMsg.TransportRecordOrBuilder getRecordOrBuilder();

      boolean hasWorldLv();

      int getWorldLv();
   }

   public interface CR2S_PlayerShipArrive_10212OrBuilder extends MessageOrBuilder {
      boolean hasShipId();

      int getShipId();

      boolean hasRewardScale();

      int getRewardScale();

      boolean hasBeInterceptCount();

      int getBeInterceptCount();

      boolean hasGuardId();

      int getGuardId();

      boolean hasLevel();

      int getLevel();

      boolean hasRecord();

      WaterTransportMsg.TransportRecord getRecord();

      WaterTransportMsg.TransportRecordOrBuilder getRecordOrBuilder();

      boolean hasExRewardScale();

      int getExRewardScale();

      boolean hasShipModelId();

      int getShipModelId();

      boolean hasWorldLv();

      int getWorldLv();
   }

   public interface CR2S_RankReward_10214OrBuilder extends MessageOrBuilder {
      List<CargoShipRankData> getRankListList();

      CargoShipRankData getRankList(int index);

      int getRankListCount();

      List<? extends CargoShipRankDataOrBuilder> getRankListOrBuilderList();

      CargoShipRankDataOrBuilder getRankListOrBuilder(int index);
   }

   public interface CR2S_RemainsRewardOneKey_10220OrBuilder extends MessageOrBuilder {
      boolean hasRiver();

      int getRiver();

      List<CrossRemainsData> getRemainsList();

      CrossRemainsData getRemains(int index);

      int getRemainsCount();

      List<? extends CrossRemainsDataOrBuilder> getRemainsOrBuilderList();

      CrossRemainsDataOrBuilder getRemainsOrBuilder(int index);
   }

   public interface CR2S_RemainsReward_10218OrBuilder extends MessageOrBuilder {
      boolean hasRiver();

      int getRiver();

      boolean hasRemains();

      CrossRemainsData getRemains();

      CrossRemainsDataOrBuilder getRemainsOrBuilder();
   }

   public interface CR2S_Remains_10216OrBuilder extends MessageOrBuilder {
      boolean hasRemains();

      WaterTransportMsg.RemainsInfo getRemains();

      WaterTransportMsg.RemainsInfoOrBuilder getRemainsOrBuilder();
   }

   public interface CR2S_SacrificeInfo_10204OrBuilder extends MessageOrBuilder {
      boolean hasIsNotify();

      boolean getIsNotify();

      boolean hasAltar();

      AltarData getAltar();

      AltarDataOrBuilder getAltarOrBuilder();
   }

   public interface CR2S_Sail_10206OrBuilder extends MessageOrBuilder {
      boolean hasShipData();

      WaterTransportMsg.PlayerShipInfo getShipData();

      WaterTransportMsg.PlayerShipInfoOrBuilder getShipDataOrBuilder();

      boolean hasGuardId();

      int getGuardId();

      boolean hasRecord();

      WaterTransportMsg.TransportRecord getRecord();

      WaterTransportMsg.TransportRecordOrBuilder getRecordOrBuilder();
   }

   public interface CR2S_ShipArrive_10210OrBuilder extends MessageOrBuilder {
      boolean hasRiver();

      int getRiver();

      boolean hasShipId();

      int getShipId();
   }

   public interface CR2S_Ship_10213OrBuilder extends MessageOrBuilder {
      boolean hasShipData();

      WaterTransportMsg.ShipInfo getShipData();

      WaterTransportMsg.ShipInfoOrBuilder getShipDataOrBuilder();
   }

   public interface CargoShipRankDataOrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();

      boolean hasRank();

      int getRank();
   }

   public interface CrossRemainsDataOrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasShipModelId();

      int getShipModelId();

      boolean hasBelongPlayer();

      int getBelongPlayer();
   }

   public interface S2CR_Altar_10202OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface S2CR_GoldDamageRank_10223OrBuilder extends MessageOrBuilder {
      boolean hasLimit();

      int getLimit();
   }

   public interface S2CR_GoldShip_10222OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_InterceptGoldShip_10227OrBuilder extends MessageOrBuilder {
      boolean hasHeroArrayingData();

      ByteString getHeroArrayingData();

      boolean hasShipType();

      int getShipType();
   }

   public interface S2CR_Intercept_10207OrBuilder extends MessageOrBuilder {
      boolean hasHeroArrayingData();

      ByteString getHeroArrayingData();

      boolean hasMyInterceptCount();

      int getMyInterceptCount();

      boolean hasShipId();

      int getShipId();

      boolean hasHighPower();

      long getHighPower();
   }

   public interface S2CR_PlayerShips_10221OrBuilder extends MessageOrBuilder {
      boolean hasPlayerId();

      int getPlayerId();
   }

   public interface S2CR_RemainsRewardOneKey_10219OrBuilder extends MessageOrBuilder {
      boolean hasRiver();

      int getRiver();

      List<Integer> getGotRemainsList();

      int getGotRemainsCount();

      int getGotRemains(int index);
   }

   public interface S2CR_RemainsReward_10217OrBuilder extends MessageOrBuilder {
      boolean hasRiver();

      int getRiver();

      boolean hasRemainsId();

      int getRemainsId();
   }

   public interface S2CR_Sacrifice_10203OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      boolean hasExp();

      int getExp();

      boolean hasOp();

      int getOp();
   }

   public interface S2CR_Sail_10205OrBuilder extends MessageOrBuilder {
      boolean hasShipData();

      WaterTransportMsg.ShipInfo getShipData();

      WaterTransportMsg.ShipInfoOrBuilder getShipDataOrBuilder();

      boolean hasArrayingData();

      ByteString getArrayingData();

      boolean hasLevel();

      int getLevel();
   }

   public interface S2CR_ShipList_10201OrBuilder extends MessageOrBuilder {
      boolean hasRiver();

      int getRiver();

      List<Integer> getGotRemainsList();

      int getGotRemainsCount();

      int getGotRemains(int index);
   }

   public interface S2CR_WaterTransportArrayingInfo_10215OrBuilder extends MessageOrBuilder {
      boolean hasShipId();

      int getShipId();
   }

   public interface S2CR_WaterTransportGm_10209OrBuilder extends MessageOrBuilder {
      boolean hasCmd();

      String getCmd();

      ByteString getCmdBytes();

      List<Long> getParamsList();

      int getParamsCount();

      long getParams(int index);
   }
}
