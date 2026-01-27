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

public final class UnionOfferMsg {
   private static final Descriptors.Descriptor internal_static_unionOffer_com_gzbz_protobuf_OfferRewardInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionOffer_com_gzbz_protobuf_OfferRewardInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionOffer_com_gzbz_protobuf_RecordInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionOffer_com_gzbz_protobuf_RecordInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionOffer_com_gzbz_protobuf_EasyRankInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionOffer_com_gzbz_protobuf_EasyRankInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionOffer_com_gzbz_protobuf_OfferRankData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionOffer_com_gzbz_protobuf_OfferRankData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionOffer_com_gzbz_protobuf_C2S_EnterView_14601_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionOffer_com_gzbz_protobuf_C2S_EnterView_14601_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionOffer_com_gzbz_protobuf_S2C_EnterView_14602_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionOffer_com_gzbz_protobuf_S2C_EnterView_14602_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionOffer_com_gzbz_protobuf_C2S_PublishOffer_14603_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionOffer_com_gzbz_protobuf_C2S_PublishOffer_14603_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionOffer_com_gzbz_protobuf_S2C_AddOffer_14604_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionOffer_com_gzbz_protobuf_S2C_AddOffer_14604_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionOffer_com_gzbz_protobuf_S2C_UpdateOffer_14606_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionOffer_com_gzbz_protobuf_S2C_UpdateOffer_14606_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionOffer_com_gzbz_protobuf_S2C_DelOffer_14608_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionOffer_com_gzbz_protobuf_S2C_DelOffer_14608_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionOffer_com_gzbz_protobuf_C2S_BuyFight_14609_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionOffer_com_gzbz_protobuf_C2S_BuyFight_14609_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionOffer_com_gzbz_protobuf_S2C_UpdateFight_14610_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionOffer_com_gzbz_protobuf_S2C_UpdateFight_14610_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionOffer_com_gzbz_protobuf_C2S_Record_14611_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionOffer_com_gzbz_protobuf_C2S_Record_14611_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionOffer_com_gzbz_protobuf_S2C_Record_14612_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionOffer_com_gzbz_protobuf_S2C_Record_14612_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionOffer_com_gzbz_protobuf_C2S_ShopLv_14613_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionOffer_com_gzbz_protobuf_C2S_ShopLv_14613_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionOffer_com_gzbz_protobuf_S2C_ShopLv_14614_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionOffer_com_gzbz_protobuf_S2C_ShopLv_14614_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionOffer_com_gzbz_protobuf_C2S_OfferDetail_14615_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionOffer_com_gzbz_protobuf_C2S_OfferDetail_14615_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionOffer_com_gzbz_protobuf_S2C_OfferDetail_14616_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionOffer_com_gzbz_protobuf_S2C_OfferDetail_14616_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionOffer_com_gzbz_protobuf_C2S_DamageRank_14617_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionOffer_com_gzbz_protobuf_C2S_DamageRank_14617_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionOffer_com_gzbz_protobuf_S2C_DamageRank_14618_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionOffer_com_gzbz_protobuf_S2C_DamageRank_14618_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionOffer_com_gzbz_protobuf_C2S_MyRankPoint_14619_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionOffer_com_gzbz_protobuf_C2S_MyRankPoint_14619_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionOffer_com_gzbz_protobuf_S2C_MyRankPoint_14620_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionOffer_com_gzbz_protobuf_S2C_MyRankPoint_14620_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionOffer_com_gzbz_protobuf_S2C_PublishOffer_14622_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionOffer_com_gzbz_protobuf_S2C_PublishOffer_14622_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionOffer_com_gzbz_protobuf_S2C_BuyFight_14624_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionOffer_com_gzbz_protobuf_S2C_BuyFight_14624_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionOffer_com_gzbz_protobuf_C2S_PointRank_14631_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionOffer_com_gzbz_protobuf_C2S_PointRank_14631_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionOffer_com_gzbz_protobuf_S2C_PointRank_14632_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionOffer_com_gzbz_protobuf_S2C_PointRank_14632_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_unionOffer_com_gzbz_protobuf_S2C_DailyUpdate_14634_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_unionOffer_com_gzbz_protobuf_S2C_DailyUpdate_14634_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private UnionOfferMsg() {
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
      String[] descriptorData = new String[]{"\n\u0010UnionOffer.proto\u0012\u001cunionOffer.com.gzbz.protobuf\u001a\nRank.proto\"Å\u0002\n\u000fOfferRewardInfo\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\n\n\u0002id\u0018\u0002 \u0002(\u0005\u0012\u0012\n\ncreateTime\u0018\u0003 \u0002(\u0005\u0012\u0011\n\thpPersent\u0018\u0004 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0005 \u0002(\u0005\u0012\u000f\n\u0007unionId\u0018\u0006 \u0001(\u0005\u0012\u0011\n\tunionName\u0018\u0007 \u0001(\t\u0012\f\n\u0004head\u0018\b \u0001(\u0005\u0012\u0011\n\theadFrame\u0018\t \u0001(\u0005\u0012\u0010\n\bserverId\u0018\n \u0002(\u0005\u0012\u0015\n\rdisappearTime\u0018\u000b \u0001(\u0005\u0012\u0013\n\u000bofferHeroId\u0018\f \u0002(\u0005\u0012\u0015\n\rofferRewardId\u0018\r \u0002(\u0005\u0012\u0014\n\fkillServerId\u0018\u000e \u0001(\u0005\u0012\u000e\n\u0006killer\u0018\u000f \u0001(\t\u0012\u0010\n\bplayerId\u0018\u0010 \u0001(\u0005\u0012\u0011\n\tdifficult\u0018\u0011 \u0001(\u0005\"\u0088\u0003\n\nRecordInfo\u0012\u0010\n\bsubclass\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bserverId\u0018\u0002 \u0001(\u0005\u0012\u0010\n\bplayerId\u0018\u0003 \u0002(\u0005\u0012\u0012\n\nplayerName\u0018\u0004 \u0001(\t\u0012\u0013\n\u000bofferHeroId\u0018\u0005 \u0001(\u0005\u0012\u0011\n\thurtValue\u0018\u0006 \u0001(\u0003\u0012\r\n\u0005point\u0018\u0007 \u0001(\u0005\u0012\u0017\n\u000fpublishServerId\u0018\b \u0001(\u0005\u0012\u0018\n\u0010publishUnionName\u0018\t \u0001(\t\u0012\u0011\n\tsurplusHp\u0018\n \u0001(\u0003\u0012\u0011\n\thpPercent\u0018\u000b \u0001(\u0005\u0012\u0010\n\bfightNum\u0018\f \u0001(\u0005\u0012\u000f\n\u0007killNum\u0018\r \u0001(\u0005\u0012\f\n\u0004rank\u0018\u000e \u0001(\u0005\u0012\u0013\n\u000bhighestName\u0018\u000f \u0001(\t\u0012\u0014\n\fhighestPoint\u0018\u0010 \u0001(\u0005\u0012\u000f\n\u0007unionId\u0018\u0011 \u0001(\u0005\u0012\u0012\n\npositionId\u0018\u0012 \u0001(\u0005\u0012\f\n\u0004time\u0018\u0013 \u0001(\u0005\u0012\u0011\n\tdifficult\u0018\u0014 \u0001(\u0005\"B\n\fEasyRankInfo\u0012\u0010\n\bserverId\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tunionName\u0018\u0002 \u0002(\t\u0012\r\n\u0005point\u0018\u0003 \u0002(\u0005\"â\u0001\n\rOfferRankData\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005score\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0003 \u0001(\u0005\u0012\u0012\n\nplayerName\u0018\u0004 \u0001(\t\u0012\f\n\u0004head\u0018\u0005 \u0001(\u0005\u0012\u0011\n\theadFrame\u0018\u0006 \u0001(\u0005\u0012\r\n\u0005level\u0018\u0007 \u0001(\u0005\u0012\u0011\n\tmonarchId\u0018\b \u0001(\u0005\u0012\u0010\n\bserverId\u0018\t \u0001(\u0005\u0012\u0011\n\tunionName\u0018\n \u0001(\t\u0012\r\n\u0005fight\u0018\u000b \u0001(\u0005\u0012\u0017\n\u000funionLeaderName\u0018\f \u0001(\t\"$\n\u0013C2S_EnterView_14601\u0012\r\n\u0005enter\u0018\u0001 \u0002(\u0005\"ó\u0001\n\u0013S2C_EnterView_14602\u0012\u0010\n\bfightNum\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006buyNum\u0018\u0002 \u0002(\u0005\u0012;\n\u0004info\u0018\u0003 \u0003(\u000b2-.unionOffer.com.gzbz.protobuf.OfferRewardInfo\u0012<\n\brankInfo\u0018\u0004 \u0001(\u000b2*.unionOffer.com.gzbz.protobuf.EasyRankInfo\u0012\u0014\n\funionCopyNum\u0018\u0005 \u0002(\u0005\u0012\u0017\n\u000funionPublishNum\u0018\u0006 \u0002(\u0005\u0012\u0010\n\bcoolTime\u0018\u0007 \u0002(\u0005\"\u0018\n\u0016C2S_PublishOffer_14603\"Q\n\u0012S2C_AddOffer_14604\u0012;\n\u0004info\u0018\u0001 \u0002(\u000b2-.unionOffer.com.gzbz.protobuf.OfferRewardInfo\"T\n\u0015S2C_UpdateOffer_14606\u0012;\n\u0004info\u0018\u0001 \u0002(\u000b2-.unionOffer.com.gzbz.protobuf.OfferRewardInfo\"#\n\u0012S2C_DelOffer_14608\u0012\r\n\u0005codes\u0018\u0001 \u0003(\u0005\"\u0014\n\u0012C2S_BuyFight_14609\"9\n\u0015S2C_UpdateFight_14610\u0012\u0010\n\bfightNum\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006buyNum\u0018\u0002 \u0002(\u0005\"\u0012\n\u0010C2S_Record_14611\"P\n\u0010S2C_Record_14612\u0012<\n\nrecordInfo\u0018\u0001 \u0003(\u000b2(.unionOffer.com.gzbz.protobuf.RecordInfo\"\u0012\n\u0010C2S_ShopLv_14613\"1\n\u0010S2C_ShopLv_14614\u0012\r\n\u0005point\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006shopLv\u0018\u0002 \u0002(\u0005\"%\n\u0015C2S_OfferDetail_14615\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\"\u0097\u0002\n\u0015S2C_OfferDetail_14616\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\u0012\u0012\n\ncreateTime\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005curHp\u0018\u0003 \u0002(\u0003\u0012\u000f\n\u0007totalHp\u0018\u0004 \u0002(\u0003\u0012\u0010\n\bserverId\u0018\u0005 \u0001(\u0005\u0012\u000f\n\u0007unionId\u0018\u0006 \u0001(\u0005\u0012\u0011\n\tunionName\u0018\u0007 \u0001(\t\u0012\u0013\n\u000bofferHeroId\u0018\b \u0002(\u0005\u0012\u000e\n\u0006myHurt\u0018\t \u0002(\u0003\u0012/\n\u0005ranks\u0018\n \u0003(\u000b2 .rank.com.gzbz.protobuf.RankData\u00120\n\u0006myRank\u0018\u000b \u0001(\u000b2 .rank.com.gzbz.protobuf.RankData\"$\n\u0014C2S_DamageRank_14617\u0012\f\n\u0004code\u0018\u0001 \u0002(\u0005\"y\n\u0014S2C_DamageRank_14618\u0012/\n\u0005ranks\u0018\u0001 \u0003(\u000b2 .rank.com.gzbz.protobuf.RankData\u00120\n\u0006myRank\u0018\u0002 \u0001(\u000b2 .rank.com.gzbz.protobuf.RankData\"\u0017\n\u0015C2S_MyRankPoint_14619\"8\n\u0015S2C_MyRankPoint_14620\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tweekPoint\u0018\u0002 \u0002(\u0005\"\u0018\n\u0016S2C_PublishOffer_14622\"$\n\u0012S2C_BuyFight_14624\u0012\u000e\n\u0006buyNum\u0018\u0002 \u0002(\u0005\"#\n\u0013C2S_PointRank_14631\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"\u009c\u0001\n\u0013S2C_PointRank_14632\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u0012:\n\u0005ranks\u0018\u0002 \u0003(\u000b2+.unionOffer.com.gzbz.protobuf.OfferRankData\u0012;\n\u0006myRank\u0018\u0003 \u0001(\u000b2+.unionOffer.com.gzbz.protobuf.OfferRankData\"\u0017\n\u0015S2C_DailyUpdate_14634*Ç\u0001\n\nRecordType\u0012\u000f\n\u000bRECORD_KILL\u0010\u0001\u0012\u0010\n\fRECORD_FIGHT\u0010\u0002\u0012\u001c\n\u0018RECORD_PRE_UNION_HIGHEST\u0010\u0003\u0012\u001e\n\u001aRECORD_TODAY_UNION_HIGHEST\u0010\u0004\u0012\u0014\n\u0010RECORD_PRE_UNION\u0010\u0005\u0012\u0016\n\u0012RECORD_TODAY_UNION\u0010\u0006\u0012\u0013\n\u000fRECORD_PRE_SELF\u0010\u0007\u0012\u0015\n\u0011RECORD_TODAY_SELF\u0010\bB$\n\u0011com.gzbz.protobufB\rUnionOfferMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{RankMsg.getDescriptor()});
      internal_static_unionOffer_com_gzbz_protobuf_OfferRewardInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_unionOffer_com_gzbz_protobuf_OfferRewardInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionOffer_com_gzbz_protobuf_OfferRewardInfo_descriptor, new String[]{"Code", "Id", "CreateTime", "HpPersent", "Type", "UnionId", "UnionName", "Head", "HeadFrame", "ServerId", "DisappearTime", "OfferHeroId", "OfferRewardId", "KillServerId", "Killer", "PlayerId", "Difficult"});
      internal_static_unionOffer_com_gzbz_protobuf_RecordInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_unionOffer_com_gzbz_protobuf_RecordInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionOffer_com_gzbz_protobuf_RecordInfo_descriptor, new String[]{"Subclass", "ServerId", "PlayerId", "PlayerName", "OfferHeroId", "HurtValue", "Point", "PublishServerId", "PublishUnionName", "SurplusHp", "HpPercent", "FightNum", "KillNum", "Rank", "HighestName", "HighestPoint", "UnionId", "PositionId", "Time", "Difficult"});
      internal_static_unionOffer_com_gzbz_protobuf_EasyRankInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_unionOffer_com_gzbz_protobuf_EasyRankInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionOffer_com_gzbz_protobuf_EasyRankInfo_descriptor, new String[]{"ServerId", "UnionName", "Point"});
      internal_static_unionOffer_com_gzbz_protobuf_OfferRankData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_unionOffer_com_gzbz_protobuf_OfferRankData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionOffer_com_gzbz_protobuf_OfferRankData_descriptor, new String[]{"Rank", "Score", "PlayerId", "PlayerName", "Head", "HeadFrame", "Level", "MonarchId", "ServerId", "UnionName", "Fight", "UnionLeaderName"});
      internal_static_unionOffer_com_gzbz_protobuf_C2S_EnterView_14601_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_unionOffer_com_gzbz_protobuf_C2S_EnterView_14601_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionOffer_com_gzbz_protobuf_C2S_EnterView_14601_descriptor, new String[]{"Enter"});
      internal_static_unionOffer_com_gzbz_protobuf_S2C_EnterView_14602_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_unionOffer_com_gzbz_protobuf_S2C_EnterView_14602_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionOffer_com_gzbz_protobuf_S2C_EnterView_14602_descriptor, new String[]{"FightNum", "BuyNum", "Info", "RankInfo", "UnionCopyNum", "UnionPublishNum", "CoolTime"});
      internal_static_unionOffer_com_gzbz_protobuf_C2S_PublishOffer_14603_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_unionOffer_com_gzbz_protobuf_C2S_PublishOffer_14603_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionOffer_com_gzbz_protobuf_C2S_PublishOffer_14603_descriptor, new String[0]);
      internal_static_unionOffer_com_gzbz_protobuf_S2C_AddOffer_14604_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_unionOffer_com_gzbz_protobuf_S2C_AddOffer_14604_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionOffer_com_gzbz_protobuf_S2C_AddOffer_14604_descriptor, new String[]{"Info"});
      internal_static_unionOffer_com_gzbz_protobuf_S2C_UpdateOffer_14606_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_unionOffer_com_gzbz_protobuf_S2C_UpdateOffer_14606_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionOffer_com_gzbz_protobuf_S2C_UpdateOffer_14606_descriptor, new String[]{"Info"});
      internal_static_unionOffer_com_gzbz_protobuf_S2C_DelOffer_14608_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_unionOffer_com_gzbz_protobuf_S2C_DelOffer_14608_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionOffer_com_gzbz_protobuf_S2C_DelOffer_14608_descriptor, new String[]{"Codes"});
      internal_static_unionOffer_com_gzbz_protobuf_C2S_BuyFight_14609_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_unionOffer_com_gzbz_protobuf_C2S_BuyFight_14609_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionOffer_com_gzbz_protobuf_C2S_BuyFight_14609_descriptor, new String[0]);
      internal_static_unionOffer_com_gzbz_protobuf_S2C_UpdateFight_14610_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_unionOffer_com_gzbz_protobuf_S2C_UpdateFight_14610_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionOffer_com_gzbz_protobuf_S2C_UpdateFight_14610_descriptor, new String[]{"FightNum", "BuyNum"});
      internal_static_unionOffer_com_gzbz_protobuf_C2S_Record_14611_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_unionOffer_com_gzbz_protobuf_C2S_Record_14611_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionOffer_com_gzbz_protobuf_C2S_Record_14611_descriptor, new String[0]);
      internal_static_unionOffer_com_gzbz_protobuf_S2C_Record_14612_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_unionOffer_com_gzbz_protobuf_S2C_Record_14612_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionOffer_com_gzbz_protobuf_S2C_Record_14612_descriptor, new String[]{"RecordInfo"});
      internal_static_unionOffer_com_gzbz_protobuf_C2S_ShopLv_14613_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_unionOffer_com_gzbz_protobuf_C2S_ShopLv_14613_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionOffer_com_gzbz_protobuf_C2S_ShopLv_14613_descriptor, new String[0]);
      internal_static_unionOffer_com_gzbz_protobuf_S2C_ShopLv_14614_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_unionOffer_com_gzbz_protobuf_S2C_ShopLv_14614_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionOffer_com_gzbz_protobuf_S2C_ShopLv_14614_descriptor, new String[]{"Point", "ShopLv"});
      internal_static_unionOffer_com_gzbz_protobuf_C2S_OfferDetail_14615_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_unionOffer_com_gzbz_protobuf_C2S_OfferDetail_14615_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionOffer_com_gzbz_protobuf_C2S_OfferDetail_14615_descriptor, new String[]{"Code"});
      internal_static_unionOffer_com_gzbz_protobuf_S2C_OfferDetail_14616_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_unionOffer_com_gzbz_protobuf_S2C_OfferDetail_14616_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionOffer_com_gzbz_protobuf_S2C_OfferDetail_14616_descriptor, new String[]{"Code", "CreateTime", "CurHp", "TotalHp", "ServerId", "UnionId", "UnionName", "OfferHeroId", "MyHurt", "Ranks", "MyRank"});
      internal_static_unionOffer_com_gzbz_protobuf_C2S_DamageRank_14617_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_unionOffer_com_gzbz_protobuf_C2S_DamageRank_14617_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionOffer_com_gzbz_protobuf_C2S_DamageRank_14617_descriptor, new String[]{"Code"});
      internal_static_unionOffer_com_gzbz_protobuf_S2C_DamageRank_14618_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_unionOffer_com_gzbz_protobuf_S2C_DamageRank_14618_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionOffer_com_gzbz_protobuf_S2C_DamageRank_14618_descriptor, new String[]{"Ranks", "MyRank"});
      internal_static_unionOffer_com_gzbz_protobuf_C2S_MyRankPoint_14619_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_unionOffer_com_gzbz_protobuf_C2S_MyRankPoint_14619_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionOffer_com_gzbz_protobuf_C2S_MyRankPoint_14619_descriptor, new String[0]);
      internal_static_unionOffer_com_gzbz_protobuf_S2C_MyRankPoint_14620_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_unionOffer_com_gzbz_protobuf_S2C_MyRankPoint_14620_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionOffer_com_gzbz_protobuf_S2C_MyRankPoint_14620_descriptor, new String[]{"Rank", "WeekPoint"});
      internal_static_unionOffer_com_gzbz_protobuf_S2C_PublishOffer_14622_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_unionOffer_com_gzbz_protobuf_S2C_PublishOffer_14622_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionOffer_com_gzbz_protobuf_S2C_PublishOffer_14622_descriptor, new String[0]);
      internal_static_unionOffer_com_gzbz_protobuf_S2C_BuyFight_14624_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_unionOffer_com_gzbz_protobuf_S2C_BuyFight_14624_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionOffer_com_gzbz_protobuf_S2C_BuyFight_14624_descriptor, new String[]{"BuyNum"});
      internal_static_unionOffer_com_gzbz_protobuf_C2S_PointRank_14631_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_unionOffer_com_gzbz_protobuf_C2S_PointRank_14631_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionOffer_com_gzbz_protobuf_C2S_PointRank_14631_descriptor, new String[]{"Type"});
      internal_static_unionOffer_com_gzbz_protobuf_S2C_PointRank_14632_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_unionOffer_com_gzbz_protobuf_S2C_PointRank_14632_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionOffer_com_gzbz_protobuf_S2C_PointRank_14632_descriptor, new String[]{"Type", "Ranks", "MyRank"});
      internal_static_unionOffer_com_gzbz_protobuf_S2C_DailyUpdate_14634_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_unionOffer_com_gzbz_protobuf_S2C_DailyUpdate_14634_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_unionOffer_com_gzbz_protobuf_S2C_DailyUpdate_14634_descriptor, new String[0]);
      RankMsg.getDescriptor();
   }

   public static enum RecordType implements ProtocolMessageEnum {
      RECORD_KILL(1),
      RECORD_FIGHT(2),
      RECORD_PRE_UNION_HIGHEST(3),
      RECORD_TODAY_UNION_HIGHEST(4),
      RECORD_PRE_UNION(5),
      RECORD_TODAY_UNION(6),
      RECORD_PRE_SELF(7),
      RECORD_TODAY_SELF(8);

      public static final int RECORD_KILL_VALUE = 1;
      public static final int RECORD_FIGHT_VALUE = 2;
      public static final int RECORD_PRE_UNION_HIGHEST_VALUE = 3;
      public static final int RECORD_TODAY_UNION_HIGHEST_VALUE = 4;
      public static final int RECORD_PRE_UNION_VALUE = 5;
      public static final int RECORD_TODAY_UNION_VALUE = 6;
      public static final int RECORD_PRE_SELF_VALUE = 7;
      public static final int RECORD_TODAY_SELF_VALUE = 8;
      private static final Internal.EnumLiteMap<RecordType> internalValueMap = new Internal.EnumLiteMap<RecordType>() {
         public RecordType findValueByNumber(int number) {
            return UnionOfferMsg.RecordType.forNumber(number);
         }
      };
      private static final RecordType[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static RecordType valueOf(int value) {
         return forNumber(value);
      }

      public static RecordType forNumber(int value) {
         switch (value) {
            case 1:
               return RECORD_KILL;
            case 2:
               return RECORD_FIGHT;
            case 3:
               return RECORD_PRE_UNION_HIGHEST;
            case 4:
               return RECORD_TODAY_UNION_HIGHEST;
            case 5:
               return RECORD_PRE_UNION;
            case 6:
               return RECORD_TODAY_UNION;
            case 7:
               return RECORD_PRE_SELF;
            case 8:
               return RECORD_TODAY_SELF;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<RecordType> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)UnionOfferMsg.getDescriptor().getEnumTypes().get(0);
      }

      public static RecordType valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private RecordType(int value) {
         this.value = value;
      }
   }

   public static final class OfferRewardInfo extends GeneratedMessageV3 implements OfferRewardInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int ID_FIELD_NUMBER = 2;
      private int id_;
      public static final int CREATETIME_FIELD_NUMBER = 3;
      private int createTime_;
      public static final int HPPERSENT_FIELD_NUMBER = 4;
      private int hpPersent_;
      public static final int TYPE_FIELD_NUMBER = 5;
      private int type_;
      public static final int UNIONID_FIELD_NUMBER = 6;
      private int unionId_;
      public static final int UNIONNAME_FIELD_NUMBER = 7;
      private volatile Object unionName_;
      public static final int HEAD_FIELD_NUMBER = 8;
      private int head_;
      public static final int HEADFRAME_FIELD_NUMBER = 9;
      private int headFrame_;
      public static final int SERVERID_FIELD_NUMBER = 10;
      private int serverId_;
      public static final int DISAPPEARTIME_FIELD_NUMBER = 11;
      private int disappearTime_;
      public static final int OFFERHEROID_FIELD_NUMBER = 12;
      private int offerHeroId_;
      public static final int OFFERREWARDID_FIELD_NUMBER = 13;
      private int offerRewardId_;
      public static final int KILLSERVERID_FIELD_NUMBER = 14;
      private int killServerId_;
      public static final int KILLER_FIELD_NUMBER = 15;
      private volatile Object killer_;
      public static final int PLAYERID_FIELD_NUMBER = 16;
      private int playerId_;
      public static final int DIFFICULT_FIELD_NUMBER = 17;
      private int difficult_;
      private byte memoizedIsInitialized;
      private static final OfferRewardInfo DEFAULT_INSTANCE = new OfferRewardInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<OfferRewardInfo> PARSER = new AbstractParser<OfferRewardInfo>() {
         public OfferRewardInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new OfferRewardInfo(input, extensionRegistry);
         }
      };

      private OfferRewardInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private OfferRewardInfo() {
         this.memoizedIsInitialized = -1;
         this.unionName_ = "";
         this.killer_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new OfferRewardInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private OfferRewardInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.createTime_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.hpPersent_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.type_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.unionId_ = input.readInt32();
                        break;
                     case 58:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 64;
                        this.unionName_ = bs;
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.head_ = input.readInt32();
                        break;
                     case 72:
                        this.bitField0_ |= 256;
                        this.headFrame_ = input.readInt32();
                        break;
                     case 80:
                        this.bitField0_ |= 512;
                        this.serverId_ = input.readInt32();
                        break;
                     case 88:
                        this.bitField0_ |= 1024;
                        this.disappearTime_ = input.readInt32();
                        break;
                     case 96:
                        this.bitField0_ |= 2048;
                        this.offerHeroId_ = input.readInt32();
                        break;
                     case 104:
                        this.bitField0_ |= 4096;
                        this.offerRewardId_ = input.readInt32();
                        break;
                     case 112:
                        this.bitField0_ |= 8192;
                        this.killServerId_ = input.readInt32();
                        break;
                     case 122:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 16384;
                        this.killer_ = bs;
                        break;
                     case 128:
                        this.bitField0_ |= 32768;
                        this.playerId_ = input.readInt32();
                        break;
                     case 136:
                        this.bitField0_ |= 65536;
                        this.difficult_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_OfferRewardInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_OfferRewardInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(OfferRewardInfo.class, Builder.class);
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

      public boolean hasCreateTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getCreateTime() {
         return this.createTime_;
      }

      public boolean hasHpPersent() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getHpPersent() {
         return this.hpPersent_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasUnionId() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getUnionId() {
         return this.unionId_;
      }

      public boolean hasUnionName() {
         return (this.bitField0_ & 64) != 0;
      }

      public String getUnionName() {
         Object ref = this.unionName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.unionName_ = s;
            }

            return s;
         }
      }

      public ByteString getUnionNameBytes() {
         Object ref = this.unionName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.unionName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasHead() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getHead() {
         return this.head_;
      }

      public boolean hasHeadFrame() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getHeadFrame() {
         return this.headFrame_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 512) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasDisappearTime() {
         return (this.bitField0_ & 1024) != 0;
      }

      public int getDisappearTime() {
         return this.disappearTime_;
      }

      public boolean hasOfferHeroId() {
         return (this.bitField0_ & 2048) != 0;
      }

      public int getOfferHeroId() {
         return this.offerHeroId_;
      }

      public boolean hasOfferRewardId() {
         return (this.bitField0_ & 4096) != 0;
      }

      public int getOfferRewardId() {
         return this.offerRewardId_;
      }

      public boolean hasKillServerId() {
         return (this.bitField0_ & 8192) != 0;
      }

      public int getKillServerId() {
         return this.killServerId_;
      }

      public boolean hasKiller() {
         return (this.bitField0_ & 16384) != 0;
      }

      public String getKiller() {
         Object ref = this.killer_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.killer_ = s;
            }

            return s;
         }
      }

      public ByteString getKillerBytes() {
         Object ref = this.killer_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.killer_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & '耀') != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasDifficult() {
         return (this.bitField0_ & 65536) != 0;
      }

      public int getDifficult() {
         return this.difficult_;
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
         } else if (!this.hasCreateTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHpPersent()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOfferHeroId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOfferRewardId()) {
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
            output.writeInt32(3, this.createTime_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.hpPersent_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.type_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.unionId_);
         }

         if ((this.bitField0_ & 64) != 0) {
            GeneratedMessageV3.writeString(output, 7, this.unionName_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.head_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.headFrame_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(10, this.serverId_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            output.writeInt32(11, this.disappearTime_);
         }

         if ((this.bitField0_ & 2048) != 0) {
            output.writeInt32(12, this.offerHeroId_);
         }

         if ((this.bitField0_ & 4096) != 0) {
            output.writeInt32(13, this.offerRewardId_);
         }

         if ((this.bitField0_ & 8192) != 0) {
            output.writeInt32(14, this.killServerId_);
         }

         if ((this.bitField0_ & 16384) != 0) {
            GeneratedMessageV3.writeString(output, 15, this.killer_);
         }

         if ((this.bitField0_ & '耀') != 0) {
            output.writeInt32(16, this.playerId_);
         }

         if ((this.bitField0_ & 65536) != 0) {
            output.writeInt32(17, this.difficult_);
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
               size += CodedOutputStream.computeInt32Size(3, this.createTime_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.hpPersent_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.type_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.unionId_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += GeneratedMessageV3.computeStringSize(7, this.unionName_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.head_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.headFrame_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.serverId_);
            }

            if ((this.bitField0_ & 1024) != 0) {
               size += CodedOutputStream.computeInt32Size(11, this.disappearTime_);
            }

            if ((this.bitField0_ & 2048) != 0) {
               size += CodedOutputStream.computeInt32Size(12, this.offerHeroId_);
            }

            if ((this.bitField0_ & 4096) != 0) {
               size += CodedOutputStream.computeInt32Size(13, this.offerRewardId_);
            }

            if ((this.bitField0_ & 8192) != 0) {
               size += CodedOutputStream.computeInt32Size(14, this.killServerId_);
            }

            if ((this.bitField0_ & 16384) != 0) {
               size += GeneratedMessageV3.computeStringSize(15, this.killer_);
            }

            if ((this.bitField0_ & '耀') != 0) {
               size += CodedOutputStream.computeInt32Size(16, this.playerId_);
            }

            if ((this.bitField0_ & 65536) != 0) {
               size += CodedOutputStream.computeInt32Size(17, this.difficult_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof OfferRewardInfo)) {
            return super.equals(obj);
         } else {
            OfferRewardInfo other = (OfferRewardInfo)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasCreateTime() != other.hasCreateTime()) {
               return false;
            } else if (this.hasCreateTime() && this.getCreateTime() != other.getCreateTime()) {
               return false;
            } else if (this.hasHpPersent() != other.hasHpPersent()) {
               return false;
            } else if (this.hasHpPersent() && this.getHpPersent() != other.getHpPersent()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasUnionId() != other.hasUnionId()) {
               return false;
            } else if (this.hasUnionId() && this.getUnionId() != other.getUnionId()) {
               return false;
            } else if (this.hasUnionName() != other.hasUnionName()) {
               return false;
            } else if (this.hasUnionName() && !this.getUnionName().equals(other.getUnionName())) {
               return false;
            } else if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasDisappearTime() != other.hasDisappearTime()) {
               return false;
            } else if (this.hasDisappearTime() && this.getDisappearTime() != other.getDisappearTime()) {
               return false;
            } else if (this.hasOfferHeroId() != other.hasOfferHeroId()) {
               return false;
            } else if (this.hasOfferHeroId() && this.getOfferHeroId() != other.getOfferHeroId()) {
               return false;
            } else if (this.hasOfferRewardId() != other.hasOfferRewardId()) {
               return false;
            } else if (this.hasOfferRewardId() && this.getOfferRewardId() != other.getOfferRewardId()) {
               return false;
            } else if (this.hasKillServerId() != other.hasKillServerId()) {
               return false;
            } else if (this.hasKillServerId() && this.getKillServerId() != other.getKillServerId()) {
               return false;
            } else if (this.hasKiller() != other.hasKiller()) {
               return false;
            } else if (this.hasKiller() && !this.getKiller().equals(other.getKiller())) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasDifficult() != other.hasDifficult()) {
               return false;
            } else if (this.hasDifficult() && this.getDifficult() != other.getDifficult()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasCreateTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getCreateTime();
            }

            if (this.hasHpPersent()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHpPersent();
            }

            if (this.hasType()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getType();
            }

            if (this.hasUnionId()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getUnionId();
            }

            if (this.hasUnionName()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getUnionName().hashCode();
            }

            if (this.hasHead()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getHeadFrame();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasDisappearTime()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getDisappearTime();
            }

            if (this.hasOfferHeroId()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getOfferHeroId();
            }

            if (this.hasOfferRewardId()) {
               hash = 37 * hash + 13;
               hash = 53 * hash + this.getOfferRewardId();
            }

            if (this.hasKillServerId()) {
               hash = 37 * hash + 14;
               hash = 53 * hash + this.getKillServerId();
            }

            if (this.hasKiller()) {
               hash = 37 * hash + 15;
               hash = 53 * hash + this.getKiller().hashCode();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 16;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasDifficult()) {
               hash = 37 * hash + 17;
               hash = 53 * hash + this.getDifficult();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static OfferRewardInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (OfferRewardInfo)PARSER.parseFrom(data);
      }

      public static OfferRewardInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (OfferRewardInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static OfferRewardInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (OfferRewardInfo)PARSER.parseFrom(data);
      }

      public static OfferRewardInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (OfferRewardInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static OfferRewardInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (OfferRewardInfo)PARSER.parseFrom(data);
      }

      public static OfferRewardInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (OfferRewardInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static OfferRewardInfo parseFrom(InputStream input) throws IOException {
         return (OfferRewardInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static OfferRewardInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (OfferRewardInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static OfferRewardInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (OfferRewardInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static OfferRewardInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (OfferRewardInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static OfferRewardInfo parseFrom(CodedInputStream input) throws IOException {
         return (OfferRewardInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static OfferRewardInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (OfferRewardInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(OfferRewardInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static OfferRewardInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<OfferRewardInfo> parser() {
         return PARSER;
      }

      public Parser<OfferRewardInfo> getParserForType() {
         return PARSER;
      }

      public OfferRewardInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OfferRewardInfoOrBuilder {
         private int bitField0_;
         private int code_;
         private int id_;
         private int createTime_;
         private int hpPersent_;
         private int type_;
         private int unionId_;
         private Object unionName_;
         private int head_;
         private int headFrame_;
         private int serverId_;
         private int disappearTime_;
         private int offerHeroId_;
         private int offerRewardId_;
         private int killServerId_;
         private Object killer_;
         private int playerId_;
         private int difficult_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_OfferRewardInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_OfferRewardInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(OfferRewardInfo.class, Builder.class);
         }

         private Builder() {
            this.unionName_ = "";
            this.killer_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.unionName_ = "";
            this.killer_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionOfferMsg.OfferRewardInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.id_ = 0;
            this.bitField0_ &= -3;
            this.createTime_ = 0;
            this.bitField0_ &= -5;
            this.hpPersent_ = 0;
            this.bitField0_ &= -9;
            this.type_ = 0;
            this.bitField0_ &= -17;
            this.unionId_ = 0;
            this.bitField0_ &= -33;
            this.unionName_ = "";
            this.bitField0_ &= -65;
            this.head_ = 0;
            this.bitField0_ &= -129;
            this.headFrame_ = 0;
            this.bitField0_ &= -257;
            this.serverId_ = 0;
            this.bitField0_ &= -513;
            this.disappearTime_ = 0;
            this.bitField0_ &= -1025;
            this.offerHeroId_ = 0;
            this.bitField0_ &= -2049;
            this.offerRewardId_ = 0;
            this.bitField0_ &= -4097;
            this.killServerId_ = 0;
            this.bitField0_ &= -8193;
            this.killer_ = "";
            this.bitField0_ &= -16385;
            this.playerId_ = 0;
            this.bitField0_ &= -32769;
            this.difficult_ = 0;
            this.bitField0_ &= -65537;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_OfferRewardInfo_descriptor;
         }

         public OfferRewardInfo getDefaultInstanceForType() {
            return UnionOfferMsg.OfferRewardInfo.getDefaultInstance();
         }

         public OfferRewardInfo build() {
            OfferRewardInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public OfferRewardInfo buildPartial() {
            OfferRewardInfo result = new OfferRewardInfo(this);
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
               result.createTime_ = this.createTime_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.hpPersent_ = this.hpPersent_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.unionId_ = this.unionId_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               to_bitField0_ |= 64;
            }

            result.unionName_ = this.unionName_;
            if ((from_bitField0_ & 128) != 0) {
               result.head_ = this.head_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.headFrame_ = this.headFrame_;
               to_bitField0_ |= 256;
            }

            if ((from_bitField0_ & 512) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 512;
            }

            if ((from_bitField0_ & 1024) != 0) {
               result.disappearTime_ = this.disappearTime_;
               to_bitField0_ |= 1024;
            }

            if ((from_bitField0_ & 2048) != 0) {
               result.offerHeroId_ = this.offerHeroId_;
               to_bitField0_ |= 2048;
            }

            if ((from_bitField0_ & 4096) != 0) {
               result.offerRewardId_ = this.offerRewardId_;
               to_bitField0_ |= 4096;
            }

            if ((from_bitField0_ & 8192) != 0) {
               result.killServerId_ = this.killServerId_;
               to_bitField0_ |= 8192;
            }

            if ((from_bitField0_ & 16384) != 0) {
               to_bitField0_ |= 16384;
            }

            result.killer_ = this.killer_;
            if ((from_bitField0_ & '耀') != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 32768;
            }

            if ((from_bitField0_ & 65536) != 0) {
               result.difficult_ = this.difficult_;
               to_bitField0_ |= 65536;
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
            if (other instanceof OfferRewardInfo) {
               return this.mergeFrom((OfferRewardInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(OfferRewardInfo other) {
            if (other == UnionOfferMsg.OfferRewardInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasCreateTime()) {
                  this.setCreateTime(other.getCreateTime());
               }

               if (other.hasHpPersent()) {
                  this.setHpPersent(other.getHpPersent());
               }

               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasUnionId()) {
                  this.setUnionId(other.getUnionId());
               }

               if (other.hasUnionName()) {
                  this.bitField0_ |= 64;
                  this.unionName_ = other.unionName_;
                  this.onChanged();
               }

               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasDisappearTime()) {
                  this.setDisappearTime(other.getDisappearTime());
               }

               if (other.hasOfferHeroId()) {
                  this.setOfferHeroId(other.getOfferHeroId());
               }

               if (other.hasOfferRewardId()) {
                  this.setOfferRewardId(other.getOfferRewardId());
               }

               if (other.hasKillServerId()) {
                  this.setKillServerId(other.getKillServerId());
               }

               if (other.hasKiller()) {
                  this.bitField0_ |= 16384;
                  this.killer_ = other.killer_;
                  this.onChanged();
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasDifficult()) {
                  this.setDifficult(other.getDifficult());
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
            } else if (!this.hasCreateTime()) {
               return false;
            } else if (!this.hasHpPersent()) {
               return false;
            } else if (!this.hasType()) {
               return false;
            } else if (!this.hasServerId()) {
               return false;
            } else if (!this.hasOfferHeroId()) {
               return false;
            } else {
               return this.hasOfferRewardId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            OfferRewardInfo parsedMessage = null;

            try {
               parsedMessage = (OfferRewardInfo)UnionOfferMsg.OfferRewardInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (OfferRewardInfo)e.getUnfinishedMessage();
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

         public boolean hasCreateTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getCreateTime() {
            return this.createTime_;
         }

         public Builder setCreateTime(int value) {
            this.bitField0_ |= 4;
            this.createTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCreateTime() {
            this.bitField0_ &= -5;
            this.createTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHpPersent() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getHpPersent() {
            return this.hpPersent_;
         }

         public Builder setHpPersent(int value) {
            this.bitField0_ |= 8;
            this.hpPersent_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHpPersent() {
            this.bitField0_ &= -9;
            this.hpPersent_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasType() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getType() {
            return this.type_;
         }

         public Builder setType(int value) {
            this.bitField0_ |= 16;
            this.type_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearType() {
            this.bitField0_ &= -17;
            this.type_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnionId() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getUnionId() {
            return this.unionId_;
         }

         public Builder setUnionId(int value) {
            this.bitField0_ |= 32;
            this.unionId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionId() {
            this.bitField0_ &= -33;
            this.unionId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnionName() {
            return (this.bitField0_ & 64) != 0;
         }

         public String getUnionName() {
            Object ref = this.unionName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.unionName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getUnionNameBytes() {
            Object ref = this.unionName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.unionName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setUnionName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 64;
               this.unionName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearUnionName() {
            this.bitField0_ &= -65;
            this.unionName_ = UnionOfferMsg.OfferRewardInfo.getDefaultInstance().getUnionName();
            this.onChanged();
            return this;
         }

         public Builder setUnionNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 64;
               this.unionName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasHead() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getHead() {
            return this.head_;
         }

         public Builder setHead(int value) {
            this.bitField0_ |= 128;
            this.head_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHead() {
            this.bitField0_ &= -129;
            this.head_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeadFrame() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getHeadFrame() {
            return this.headFrame_;
         }

         public Builder setHeadFrame(int value) {
            this.bitField0_ |= 256;
            this.headFrame_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadFrame() {
            this.bitField0_ &= -257;
            this.headFrame_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 512;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -513;
            this.serverId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDisappearTime() {
            return (this.bitField0_ & 1024) != 0;
         }

         public int getDisappearTime() {
            return this.disappearTime_;
         }

         public Builder setDisappearTime(int value) {
            this.bitField0_ |= 1024;
            this.disappearTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDisappearTime() {
            this.bitField0_ &= -1025;
            this.disappearTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOfferHeroId() {
            return (this.bitField0_ & 2048) != 0;
         }

         public int getOfferHeroId() {
            return this.offerHeroId_;
         }

         public Builder setOfferHeroId(int value) {
            this.bitField0_ |= 2048;
            this.offerHeroId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOfferHeroId() {
            this.bitField0_ &= -2049;
            this.offerHeroId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOfferRewardId() {
            return (this.bitField0_ & 4096) != 0;
         }

         public int getOfferRewardId() {
            return this.offerRewardId_;
         }

         public Builder setOfferRewardId(int value) {
            this.bitField0_ |= 4096;
            this.offerRewardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOfferRewardId() {
            this.bitField0_ &= -4097;
            this.offerRewardId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasKillServerId() {
            return (this.bitField0_ & 8192) != 0;
         }

         public int getKillServerId() {
            return this.killServerId_;
         }

         public Builder setKillServerId(int value) {
            this.bitField0_ |= 8192;
            this.killServerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearKillServerId() {
            this.bitField0_ &= -8193;
            this.killServerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasKiller() {
            return (this.bitField0_ & 16384) != 0;
         }

         public String getKiller() {
            Object ref = this.killer_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.killer_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getKillerBytes() {
            Object ref = this.killer_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.killer_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setKiller(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16384;
               this.killer_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearKiller() {
            this.bitField0_ &= -16385;
            this.killer_ = UnionOfferMsg.OfferRewardInfo.getDefaultInstance().getKiller();
            this.onChanged();
            return this;
         }

         public Builder setKillerBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16384;
               this.killer_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasPlayerId() {
            return (this.bitField0_ & '耀') != 0;
         }

         public int getPlayerId() {
            return this.playerId_;
         }

         public Builder setPlayerId(int value) {
            this.bitField0_ |= 32768;
            this.playerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerId() {
            this.bitField0_ &= -32769;
            this.playerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDifficult() {
            return (this.bitField0_ & 65536) != 0;
         }

         public int getDifficult() {
            return this.difficult_;
         }

         public Builder setDifficult(int value) {
            this.bitField0_ |= 65536;
            this.difficult_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDifficult() {
            this.bitField0_ &= -65537;
            this.difficult_ = 0;
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

   public static final class RecordInfo extends GeneratedMessageV3 implements RecordInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SUBCLASS_FIELD_NUMBER = 1;
      private int subclass_;
      public static final int SERVERID_FIELD_NUMBER = 2;
      private int serverId_;
      public static final int PLAYERID_FIELD_NUMBER = 3;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 4;
      private volatile Object playerName_;
      public static final int OFFERHEROID_FIELD_NUMBER = 5;
      private int offerHeroId_;
      public static final int HURTVALUE_FIELD_NUMBER = 6;
      private long hurtValue_;
      public static final int POINT_FIELD_NUMBER = 7;
      private int point_;
      public static final int PUBLISHSERVERID_FIELD_NUMBER = 8;
      private int publishServerId_;
      public static final int PUBLISHUNIONNAME_FIELD_NUMBER = 9;
      private volatile Object publishUnionName_;
      public static final int SURPLUSHP_FIELD_NUMBER = 10;
      private long surplusHp_;
      public static final int HPPERCENT_FIELD_NUMBER = 11;
      private int hpPercent_;
      public static final int FIGHTNUM_FIELD_NUMBER = 12;
      private int fightNum_;
      public static final int KILLNUM_FIELD_NUMBER = 13;
      private int killNum_;
      public static final int RANK_FIELD_NUMBER = 14;
      private int rank_;
      public static final int HIGHESTNAME_FIELD_NUMBER = 15;
      private volatile Object highestName_;
      public static final int HIGHESTPOINT_FIELD_NUMBER = 16;
      private int highestPoint_;
      public static final int UNIONID_FIELD_NUMBER = 17;
      private int unionId_;
      public static final int POSITIONID_FIELD_NUMBER = 18;
      private int positionId_;
      public static final int TIME_FIELD_NUMBER = 19;
      private int time_;
      public static final int DIFFICULT_FIELD_NUMBER = 20;
      private int difficult_;
      private byte memoizedIsInitialized;
      private static final RecordInfo DEFAULT_INSTANCE = new RecordInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<RecordInfo> PARSER = new AbstractParser<RecordInfo>() {
         public RecordInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RecordInfo(input, extensionRegistry);
         }
      };

      private RecordInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RecordInfo() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
         this.publishUnionName_ = "";
         this.highestName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RecordInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RecordInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.serverId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.playerId_ = input.readInt32();
                        break;
                     case 34:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 8;
                        this.playerName_ = bs;
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.offerHeroId_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.hurtValue_ = input.readInt64();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.point_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.publishServerId_ = input.readInt32();
                        break;
                     case 74:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 256;
                        this.publishUnionName_ = bs;
                        break;
                     case 80:
                        this.bitField0_ |= 512;
                        this.surplusHp_ = input.readInt64();
                        break;
                     case 88:
                        this.bitField0_ |= 1024;
                        this.hpPercent_ = input.readInt32();
                        break;
                     case 96:
                        this.bitField0_ |= 2048;
                        this.fightNum_ = input.readInt32();
                        break;
                     case 104:
                        this.bitField0_ |= 4096;
                        this.killNum_ = input.readInt32();
                        break;
                     case 112:
                        this.bitField0_ |= 8192;
                        this.rank_ = input.readInt32();
                        break;
                     case 122:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 16384;
                        this.highestName_ = bs;
                        break;
                     case 128:
                        this.bitField0_ |= 32768;
                        this.highestPoint_ = input.readInt32();
                        break;
                     case 136:
                        this.bitField0_ |= 65536;
                        this.unionId_ = input.readInt32();
                        break;
                     case 144:
                        this.bitField0_ |= 131072;
                        this.positionId_ = input.readInt32();
                        break;
                     case 152:
                        this.bitField0_ |= 262144;
                        this.time_ = input.readInt32();
                        break;
                     case 160:
                        this.bitField0_ |= 524288;
                        this.difficult_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_RecordInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_RecordInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RecordInfo.class, Builder.class);
      }

      public boolean hasSubclass() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSubclass() {
         return this.subclass_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 8) != 0;
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

      public boolean hasOfferHeroId() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getOfferHeroId() {
         return this.offerHeroId_;
      }

      public boolean hasHurtValue() {
         return (this.bitField0_ & 32) != 0;
      }

      public long getHurtValue() {
         return this.hurtValue_;
      }

      public boolean hasPoint() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getPoint() {
         return this.point_;
      }

      public boolean hasPublishServerId() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getPublishServerId() {
         return this.publishServerId_;
      }

      public boolean hasPublishUnionName() {
         return (this.bitField0_ & 256) != 0;
      }

      public String getPublishUnionName() {
         Object ref = this.publishUnionName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.publishUnionName_ = s;
            }

            return s;
         }
      }

      public ByteString getPublishUnionNameBytes() {
         Object ref = this.publishUnionName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.publishUnionName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasSurplusHp() {
         return (this.bitField0_ & 512) != 0;
      }

      public long getSurplusHp() {
         return this.surplusHp_;
      }

      public boolean hasHpPercent() {
         return (this.bitField0_ & 1024) != 0;
      }

      public int getHpPercent() {
         return this.hpPercent_;
      }

      public boolean hasFightNum() {
         return (this.bitField0_ & 2048) != 0;
      }

      public int getFightNum() {
         return this.fightNum_;
      }

      public boolean hasKillNum() {
         return (this.bitField0_ & 4096) != 0;
      }

      public int getKillNum() {
         return this.killNum_;
      }

      public boolean hasRank() {
         return (this.bitField0_ & 8192) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasHighestName() {
         return (this.bitField0_ & 16384) != 0;
      }

      public String getHighestName() {
         Object ref = this.highestName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.highestName_ = s;
            }

            return s;
         }
      }

      public ByteString getHighestNameBytes() {
         Object ref = this.highestName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.highestName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasHighestPoint() {
         return (this.bitField0_ & '耀') != 0;
      }

      public int getHighestPoint() {
         return this.highestPoint_;
      }

      public boolean hasUnionId() {
         return (this.bitField0_ & 65536) != 0;
      }

      public int getUnionId() {
         return this.unionId_;
      }

      public boolean hasPositionId() {
         return (this.bitField0_ & 131072) != 0;
      }

      public int getPositionId() {
         return this.positionId_;
      }

      public boolean hasTime() {
         return (this.bitField0_ & 262144) != 0;
      }

      public int getTime() {
         return this.time_;
      }

      public boolean hasDifficult() {
         return (this.bitField0_ & 524288) != 0;
      }

      public int getDifficult() {
         return this.difficult_;
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
            output.writeInt32(1, this.subclass_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.serverId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.playerId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            GeneratedMessageV3.writeString(output, 4, this.playerName_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.offerHeroId_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt64(6, this.hurtValue_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.point_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.publishServerId_);
         }

         if ((this.bitField0_ & 256) != 0) {
            GeneratedMessageV3.writeString(output, 9, this.publishUnionName_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt64(10, this.surplusHp_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            output.writeInt32(11, this.hpPercent_);
         }

         if ((this.bitField0_ & 2048) != 0) {
            output.writeInt32(12, this.fightNum_);
         }

         if ((this.bitField0_ & 4096) != 0) {
            output.writeInt32(13, this.killNum_);
         }

         if ((this.bitField0_ & 8192) != 0) {
            output.writeInt32(14, this.rank_);
         }

         if ((this.bitField0_ & 16384) != 0) {
            GeneratedMessageV3.writeString(output, 15, this.highestName_);
         }

         if ((this.bitField0_ & '耀') != 0) {
            output.writeInt32(16, this.highestPoint_);
         }

         if ((this.bitField0_ & 65536) != 0) {
            output.writeInt32(17, this.unionId_);
         }

         if ((this.bitField0_ & 131072) != 0) {
            output.writeInt32(18, this.positionId_);
         }

         if ((this.bitField0_ & 262144) != 0) {
            output.writeInt32(19, this.time_);
         }

         if ((this.bitField0_ & 524288) != 0) {
            output.writeInt32(20, this.difficult_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.serverId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.playerId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += GeneratedMessageV3.computeStringSize(4, this.playerName_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.offerHeroId_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt64Size(6, this.hurtValue_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.point_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.publishServerId_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += GeneratedMessageV3.computeStringSize(9, this.publishUnionName_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt64Size(10, this.surplusHp_);
            }

            if ((this.bitField0_ & 1024) != 0) {
               size += CodedOutputStream.computeInt32Size(11, this.hpPercent_);
            }

            if ((this.bitField0_ & 2048) != 0) {
               size += CodedOutputStream.computeInt32Size(12, this.fightNum_);
            }

            if ((this.bitField0_ & 4096) != 0) {
               size += CodedOutputStream.computeInt32Size(13, this.killNum_);
            }

            if ((this.bitField0_ & 8192) != 0) {
               size += CodedOutputStream.computeInt32Size(14, this.rank_);
            }

            if ((this.bitField0_ & 16384) != 0) {
               size += GeneratedMessageV3.computeStringSize(15, this.highestName_);
            }

            if ((this.bitField0_ & '耀') != 0) {
               size += CodedOutputStream.computeInt32Size(16, this.highestPoint_);
            }

            if ((this.bitField0_ & 65536) != 0) {
               size += CodedOutputStream.computeInt32Size(17, this.unionId_);
            }

            if ((this.bitField0_ & 131072) != 0) {
               size += CodedOutputStream.computeInt32Size(18, this.positionId_);
            }

            if ((this.bitField0_ & 262144) != 0) {
               size += CodedOutputStream.computeInt32Size(19, this.time_);
            }

            if ((this.bitField0_ & 524288) != 0) {
               size += CodedOutputStream.computeInt32Size(20, this.difficult_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof RecordInfo)) {
            return super.equals(obj);
         } else {
            RecordInfo other = (RecordInfo)obj;
            if (this.hasSubclass() != other.hasSubclass()) {
               return false;
            } else if (this.hasSubclass() && this.getSubclass() != other.getSubclass()) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasOfferHeroId() != other.hasOfferHeroId()) {
               return false;
            } else if (this.hasOfferHeroId() && this.getOfferHeroId() != other.getOfferHeroId()) {
               return false;
            } else if (this.hasHurtValue() != other.hasHurtValue()) {
               return false;
            } else if (this.hasHurtValue() && this.getHurtValue() != other.getHurtValue()) {
               return false;
            } else if (this.hasPoint() != other.hasPoint()) {
               return false;
            } else if (this.hasPoint() && this.getPoint() != other.getPoint()) {
               return false;
            } else if (this.hasPublishServerId() != other.hasPublishServerId()) {
               return false;
            } else if (this.hasPublishServerId() && this.getPublishServerId() != other.getPublishServerId()) {
               return false;
            } else if (this.hasPublishUnionName() != other.hasPublishUnionName()) {
               return false;
            } else if (this.hasPublishUnionName() && !this.getPublishUnionName().equals(other.getPublishUnionName())) {
               return false;
            } else if (this.hasSurplusHp() != other.hasSurplusHp()) {
               return false;
            } else if (this.hasSurplusHp() && this.getSurplusHp() != other.getSurplusHp()) {
               return false;
            } else if (this.hasHpPercent() != other.hasHpPercent()) {
               return false;
            } else if (this.hasHpPercent() && this.getHpPercent() != other.getHpPercent()) {
               return false;
            } else if (this.hasFightNum() != other.hasFightNum()) {
               return false;
            } else if (this.hasFightNum() && this.getFightNum() != other.getFightNum()) {
               return false;
            } else if (this.hasKillNum() != other.hasKillNum()) {
               return false;
            } else if (this.hasKillNum() && this.getKillNum() != other.getKillNum()) {
               return false;
            } else if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasHighestName() != other.hasHighestName()) {
               return false;
            } else if (this.hasHighestName() && !this.getHighestName().equals(other.getHighestName())) {
               return false;
            } else if (this.hasHighestPoint() != other.hasHighestPoint()) {
               return false;
            } else if (this.hasHighestPoint() && this.getHighestPoint() != other.getHighestPoint()) {
               return false;
            } else if (this.hasUnionId() != other.hasUnionId()) {
               return false;
            } else if (this.hasUnionId() && this.getUnionId() != other.getUnionId()) {
               return false;
            } else if (this.hasPositionId() != other.hasPositionId()) {
               return false;
            } else if (this.hasPositionId() && this.getPositionId() != other.getPositionId()) {
               return false;
            } else if (this.hasTime() != other.hasTime()) {
               return false;
            } else if (this.hasTime() && this.getTime() != other.getTime()) {
               return false;
            } else if (this.hasDifficult() != other.hasDifficult()) {
               return false;
            } else if (this.hasDifficult() && this.getDifficult() != other.getDifficult()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasServerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasOfferHeroId()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getOfferHeroId();
            }

            if (this.hasHurtValue()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashLong(this.getHurtValue());
            }

            if (this.hasPoint()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getPoint();
            }

            if (this.hasPublishServerId()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getPublishServerId();
            }

            if (this.hasPublishUnionName()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getPublishUnionName().hashCode();
            }

            if (this.hasSurplusHp()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + Internal.hashLong(this.getSurplusHp());
            }

            if (this.hasHpPercent()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getHpPercent();
            }

            if (this.hasFightNum()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getFightNum();
            }

            if (this.hasKillNum()) {
               hash = 37 * hash + 13;
               hash = 53 * hash + this.getKillNum();
            }

            if (this.hasRank()) {
               hash = 37 * hash + 14;
               hash = 53 * hash + this.getRank();
            }

            if (this.hasHighestName()) {
               hash = 37 * hash + 15;
               hash = 53 * hash + this.getHighestName().hashCode();
            }

            if (this.hasHighestPoint()) {
               hash = 37 * hash + 16;
               hash = 53 * hash + this.getHighestPoint();
            }

            if (this.hasUnionId()) {
               hash = 37 * hash + 17;
               hash = 53 * hash + this.getUnionId();
            }

            if (this.hasPositionId()) {
               hash = 37 * hash + 18;
               hash = 53 * hash + this.getPositionId();
            }

            if (this.hasTime()) {
               hash = 37 * hash + 19;
               hash = 53 * hash + this.getTime();
            }

            if (this.hasDifficult()) {
               hash = 37 * hash + 20;
               hash = 53 * hash + this.getDifficult();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static RecordInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RecordInfo)PARSER.parseFrom(data);
      }

      public static RecordInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecordInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RecordInfo)PARSER.parseFrom(data);
      }

      public static RecordInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecordInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RecordInfo)PARSER.parseFrom(data);
      }

      public static RecordInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RecordInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RecordInfo parseFrom(InputStream input) throws IOException {
         return (RecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RecordInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RecordInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (RecordInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RecordInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecordInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RecordInfo parseFrom(CodedInputStream input) throws IOException {
         return (RecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RecordInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RecordInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RecordInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RecordInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RecordInfo> parser() {
         return PARSER;
      }

      public Parser<RecordInfo> getParserForType() {
         return PARSER;
      }

      public RecordInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RecordInfoOrBuilder {
         private int bitField0_;
         private int subclass_;
         private int serverId_;
         private int playerId_;
         private Object playerName_;
         private int offerHeroId_;
         private long hurtValue_;
         private int point_;
         private int publishServerId_;
         private Object publishUnionName_;
         private long surplusHp_;
         private int hpPercent_;
         private int fightNum_;
         private int killNum_;
         private int rank_;
         private Object highestName_;
         private int highestPoint_;
         private int unionId_;
         private int positionId_;
         private int time_;
         private int difficult_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_RecordInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_RecordInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RecordInfo.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.publishUnionName_ = "";
            this.highestName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.publishUnionName_ = "";
            this.highestName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionOfferMsg.RecordInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.subclass_ = 0;
            this.bitField0_ &= -2;
            this.serverId_ = 0;
            this.bitField0_ &= -3;
            this.playerId_ = 0;
            this.bitField0_ &= -5;
            this.playerName_ = "";
            this.bitField0_ &= -9;
            this.offerHeroId_ = 0;
            this.bitField0_ &= -17;
            this.hurtValue_ = 0L;
            this.bitField0_ &= -33;
            this.point_ = 0;
            this.bitField0_ &= -65;
            this.publishServerId_ = 0;
            this.bitField0_ &= -129;
            this.publishUnionName_ = "";
            this.bitField0_ &= -257;
            this.surplusHp_ = 0L;
            this.bitField0_ &= -513;
            this.hpPercent_ = 0;
            this.bitField0_ &= -1025;
            this.fightNum_ = 0;
            this.bitField0_ &= -2049;
            this.killNum_ = 0;
            this.bitField0_ &= -4097;
            this.rank_ = 0;
            this.bitField0_ &= -8193;
            this.highestName_ = "";
            this.bitField0_ &= -16385;
            this.highestPoint_ = 0;
            this.bitField0_ &= -32769;
            this.unionId_ = 0;
            this.bitField0_ &= -65537;
            this.positionId_ = 0;
            this.bitField0_ &= -131073;
            this.time_ = 0;
            this.bitField0_ &= -262145;
            this.difficult_ = 0;
            this.bitField0_ &= -524289;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_RecordInfo_descriptor;
         }

         public RecordInfo getDefaultInstanceForType() {
            return UnionOfferMsg.RecordInfo.getDefaultInstance();
         }

         public RecordInfo build() {
            RecordInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RecordInfo buildPartial() {
            RecordInfo result = new RecordInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.subclass_ = this.subclass_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 16) != 0) {
               result.offerHeroId_ = this.offerHeroId_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.hurtValue_ = this.hurtValue_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.point_ = this.point_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.publishServerId_ = this.publishServerId_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               to_bitField0_ |= 256;
            }

            result.publishUnionName_ = this.publishUnionName_;
            if ((from_bitField0_ & 512) != 0) {
               result.surplusHp_ = this.surplusHp_;
               to_bitField0_ |= 512;
            }

            if ((from_bitField0_ & 1024) != 0) {
               result.hpPercent_ = this.hpPercent_;
               to_bitField0_ |= 1024;
            }

            if ((from_bitField0_ & 2048) != 0) {
               result.fightNum_ = this.fightNum_;
               to_bitField0_ |= 2048;
            }

            if ((from_bitField0_ & 4096) != 0) {
               result.killNum_ = this.killNum_;
               to_bitField0_ |= 4096;
            }

            if ((from_bitField0_ & 8192) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 8192;
            }

            if ((from_bitField0_ & 16384) != 0) {
               to_bitField0_ |= 16384;
            }

            result.highestName_ = this.highestName_;
            if ((from_bitField0_ & '耀') != 0) {
               result.highestPoint_ = this.highestPoint_;
               to_bitField0_ |= 32768;
            }

            if ((from_bitField0_ & 65536) != 0) {
               result.unionId_ = this.unionId_;
               to_bitField0_ |= 65536;
            }

            if ((from_bitField0_ & 131072) != 0) {
               result.positionId_ = this.positionId_;
               to_bitField0_ |= 131072;
            }

            if ((from_bitField0_ & 262144) != 0) {
               result.time_ = this.time_;
               to_bitField0_ |= 262144;
            }

            if ((from_bitField0_ & 524288) != 0) {
               result.difficult_ = this.difficult_;
               to_bitField0_ |= 524288;
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
            if (other instanceof RecordInfo) {
               return this.mergeFrom((RecordInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RecordInfo other) {
            if (other == UnionOfferMsg.RecordInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSubclass()) {
                  this.setSubclass(other.getSubclass());
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 8;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasOfferHeroId()) {
                  this.setOfferHeroId(other.getOfferHeroId());
               }

               if (other.hasHurtValue()) {
                  this.setHurtValue(other.getHurtValue());
               }

               if (other.hasPoint()) {
                  this.setPoint(other.getPoint());
               }

               if (other.hasPublishServerId()) {
                  this.setPublishServerId(other.getPublishServerId());
               }

               if (other.hasPublishUnionName()) {
                  this.bitField0_ |= 256;
                  this.publishUnionName_ = other.publishUnionName_;
                  this.onChanged();
               }

               if (other.hasSurplusHp()) {
                  this.setSurplusHp(other.getSurplusHp());
               }

               if (other.hasHpPercent()) {
                  this.setHpPercent(other.getHpPercent());
               }

               if (other.hasFightNum()) {
                  this.setFightNum(other.getFightNum());
               }

               if (other.hasKillNum()) {
                  this.setKillNum(other.getKillNum());
               }

               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasHighestName()) {
                  this.bitField0_ |= 16384;
                  this.highestName_ = other.highestName_;
                  this.onChanged();
               }

               if (other.hasHighestPoint()) {
                  this.setHighestPoint(other.getHighestPoint());
               }

               if (other.hasUnionId()) {
                  this.setUnionId(other.getUnionId());
               }

               if (other.hasPositionId()) {
                  this.setPositionId(other.getPositionId());
               }

               if (other.hasTime()) {
                  this.setTime(other.getTime());
               }

               if (other.hasDifficult()) {
                  this.setDifficult(other.getDifficult());
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
               return this.hasPlayerId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RecordInfo parsedMessage = null;

            try {
               parsedMessage = (RecordInfo)UnionOfferMsg.RecordInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RecordInfo)e.getUnfinishedMessage();
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

         public boolean hasServerId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 2;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -3;
            this.serverId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getPlayerId() {
            return this.playerId_;
         }

         public Builder setPlayerId(int value) {
            this.bitField0_ |= 4;
            this.playerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerId() {
            this.bitField0_ &= -5;
            this.playerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 8) != 0;
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
               this.bitField0_ |= 8;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -9;
            this.playerName_ = UnionOfferMsg.RecordInfo.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasOfferHeroId() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getOfferHeroId() {
            return this.offerHeroId_;
         }

         public Builder setOfferHeroId(int value) {
            this.bitField0_ |= 16;
            this.offerHeroId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOfferHeroId() {
            this.bitField0_ &= -17;
            this.offerHeroId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHurtValue() {
            return (this.bitField0_ & 32) != 0;
         }

         public long getHurtValue() {
            return this.hurtValue_;
         }

         public Builder setHurtValue(long value) {
            this.bitField0_ |= 32;
            this.hurtValue_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHurtValue() {
            this.bitField0_ &= -33;
            this.hurtValue_ = 0L;
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

         public boolean hasPublishServerId() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getPublishServerId() {
            return this.publishServerId_;
         }

         public Builder setPublishServerId(int value) {
            this.bitField0_ |= 128;
            this.publishServerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPublishServerId() {
            this.bitField0_ &= -129;
            this.publishServerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPublishUnionName() {
            return (this.bitField0_ & 256) != 0;
         }

         public String getPublishUnionName() {
            Object ref = this.publishUnionName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.publishUnionName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getPublishUnionNameBytes() {
            Object ref = this.publishUnionName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.publishUnionName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setPublishUnionName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 256;
               this.publishUnionName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPublishUnionName() {
            this.bitField0_ &= -257;
            this.publishUnionName_ = UnionOfferMsg.RecordInfo.getDefaultInstance().getPublishUnionName();
            this.onChanged();
            return this;
         }

         public Builder setPublishUnionNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 256;
               this.publishUnionName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasSurplusHp() {
            return (this.bitField0_ & 512) != 0;
         }

         public long getSurplusHp() {
            return this.surplusHp_;
         }

         public Builder setSurplusHp(long value) {
            this.bitField0_ |= 512;
            this.surplusHp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSurplusHp() {
            this.bitField0_ &= -513;
            this.surplusHp_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasHpPercent() {
            return (this.bitField0_ & 1024) != 0;
         }

         public int getHpPercent() {
            return this.hpPercent_;
         }

         public Builder setHpPercent(int value) {
            this.bitField0_ |= 1024;
            this.hpPercent_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHpPercent() {
            this.bitField0_ &= -1025;
            this.hpPercent_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFightNum() {
            return (this.bitField0_ & 2048) != 0;
         }

         public int getFightNum() {
            return this.fightNum_;
         }

         public Builder setFightNum(int value) {
            this.bitField0_ |= 2048;
            this.fightNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFightNum() {
            this.bitField0_ &= -2049;
            this.fightNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasKillNum() {
            return (this.bitField0_ & 4096) != 0;
         }

         public int getKillNum() {
            return this.killNum_;
         }

         public Builder setKillNum(int value) {
            this.bitField0_ |= 4096;
            this.killNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearKillNum() {
            this.bitField0_ &= -4097;
            this.killNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRank() {
            return (this.bitField0_ & 8192) != 0;
         }

         public int getRank() {
            return this.rank_;
         }

         public Builder setRank(int value) {
            this.bitField0_ |= 8192;
            this.rank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRank() {
            this.bitField0_ &= -8193;
            this.rank_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHighestName() {
            return (this.bitField0_ & 16384) != 0;
         }

         public String getHighestName() {
            Object ref = this.highestName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.highestName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getHighestNameBytes() {
            Object ref = this.highestName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.highestName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setHighestName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16384;
               this.highestName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearHighestName() {
            this.bitField0_ &= -16385;
            this.highestName_ = UnionOfferMsg.RecordInfo.getDefaultInstance().getHighestName();
            this.onChanged();
            return this;
         }

         public Builder setHighestNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 16384;
               this.highestName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasHighestPoint() {
            return (this.bitField0_ & '耀') != 0;
         }

         public int getHighestPoint() {
            return this.highestPoint_;
         }

         public Builder setHighestPoint(int value) {
            this.bitField0_ |= 32768;
            this.highestPoint_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHighestPoint() {
            this.bitField0_ &= -32769;
            this.highestPoint_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnionId() {
            return (this.bitField0_ & 65536) != 0;
         }

         public int getUnionId() {
            return this.unionId_;
         }

         public Builder setUnionId(int value) {
            this.bitField0_ |= 65536;
            this.unionId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionId() {
            this.bitField0_ &= -65537;
            this.unionId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPositionId() {
            return (this.bitField0_ & 131072) != 0;
         }

         public int getPositionId() {
            return this.positionId_;
         }

         public Builder setPositionId(int value) {
            this.bitField0_ |= 131072;
            this.positionId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPositionId() {
            this.bitField0_ &= -131073;
            this.positionId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTime() {
            return (this.bitField0_ & 262144) != 0;
         }

         public int getTime() {
            return this.time_;
         }

         public Builder setTime(int value) {
            this.bitField0_ |= 262144;
            this.time_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTime() {
            this.bitField0_ &= -262145;
            this.time_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDifficult() {
            return (this.bitField0_ & 524288) != 0;
         }

         public int getDifficult() {
            return this.difficult_;
         }

         public Builder setDifficult(int value) {
            this.bitField0_ |= 524288;
            this.difficult_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDifficult() {
            this.bitField0_ &= -524289;
            this.difficult_ = 0;
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

   public static final class EasyRankInfo extends GeneratedMessageV3 implements EasyRankInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SERVERID_FIELD_NUMBER = 1;
      private int serverId_;
      public static final int UNIONNAME_FIELD_NUMBER = 2;
      private volatile Object unionName_;
      public static final int POINT_FIELD_NUMBER = 3;
      private int point_;
      private byte memoizedIsInitialized;
      private static final EasyRankInfo DEFAULT_INSTANCE = new EasyRankInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<EasyRankInfo> PARSER = new AbstractParser<EasyRankInfo>() {
         public EasyRankInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new EasyRankInfo(input, extensionRegistry);
         }
      };

      private EasyRankInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private EasyRankInfo() {
         this.memoizedIsInitialized = -1;
         this.unionName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new EasyRankInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private EasyRankInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.serverId_ = input.readInt32();
                        break;
                     case 18:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2;
                        this.unionName_ = bs;
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.point_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_EasyRankInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_EasyRankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(EasyRankInfo.class, Builder.class);
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasUnionName() {
         return (this.bitField0_ & 2) != 0;
      }

      public String getUnionName() {
         Object ref = this.unionName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.unionName_ = s;
            }

            return s;
         }
      }

      public ByteString getUnionNameBytes() {
         Object ref = this.unionName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.unionName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasPoint() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getPoint() {
         return this.point_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasUnionName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.serverId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            GeneratedMessageV3.writeString(output, 2, this.unionName_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.point_);
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
               size += CodedOutputStream.computeInt32Size(1, this.serverId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += GeneratedMessageV3.computeStringSize(2, this.unionName_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.point_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof EasyRankInfo)) {
            return super.equals(obj);
         } else {
            EasyRankInfo other = (EasyRankInfo)obj;
            if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasUnionName() != other.hasUnionName()) {
               return false;
            } else if (this.hasUnionName() && !this.getUnionName().equals(other.getUnionName())) {
               return false;
            } else if (this.hasPoint() != other.hasPoint()) {
               return false;
            } else if (this.hasPoint() && this.getPoint() != other.getPoint()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasServerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasUnionName()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getUnionName().hashCode();
            }

            if (this.hasPoint()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPoint();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static EasyRankInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (EasyRankInfo)PARSER.parseFrom(data);
      }

      public static EasyRankInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (EasyRankInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static EasyRankInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (EasyRankInfo)PARSER.parseFrom(data);
      }

      public static EasyRankInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (EasyRankInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static EasyRankInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (EasyRankInfo)PARSER.parseFrom(data);
      }

      public static EasyRankInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (EasyRankInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static EasyRankInfo parseFrom(InputStream input) throws IOException {
         return (EasyRankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static EasyRankInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (EasyRankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static EasyRankInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (EasyRankInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static EasyRankInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (EasyRankInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static EasyRankInfo parseFrom(CodedInputStream input) throws IOException {
         return (EasyRankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static EasyRankInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (EasyRankInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(EasyRankInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static EasyRankInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<EasyRankInfo> parser() {
         return PARSER;
      }

      public Parser<EasyRankInfo> getParserForType() {
         return PARSER;
      }

      public EasyRankInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EasyRankInfoOrBuilder {
         private int bitField0_;
         private int serverId_;
         private Object unionName_;
         private int point_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_EasyRankInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_EasyRankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(EasyRankInfo.class, Builder.class);
         }

         private Builder() {
            this.unionName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.unionName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionOfferMsg.EasyRankInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.serverId_ = 0;
            this.bitField0_ &= -2;
            this.unionName_ = "";
            this.bitField0_ &= -3;
            this.point_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_EasyRankInfo_descriptor;
         }

         public EasyRankInfo getDefaultInstanceForType() {
            return UnionOfferMsg.EasyRankInfo.getDefaultInstance();
         }

         public EasyRankInfo build() {
            EasyRankInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public EasyRankInfo buildPartial() {
            EasyRankInfo result = new EasyRankInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               to_bitField0_ |= 2;
            }

            result.unionName_ = this.unionName_;
            if ((from_bitField0_ & 4) != 0) {
               result.point_ = this.point_;
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
            if (other instanceof EasyRankInfo) {
               return this.mergeFrom((EasyRankInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(EasyRankInfo other) {
            if (other == UnionOfferMsg.EasyRankInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasUnionName()) {
                  this.bitField0_ |= 2;
                  this.unionName_ = other.unionName_;
                  this.onChanged();
               }

               if (other.hasPoint()) {
                  this.setPoint(other.getPoint());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasServerId()) {
               return false;
            } else if (!this.hasUnionName()) {
               return false;
            } else {
               return this.hasPoint();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            EasyRankInfo parsedMessage = null;

            try {
               parsedMessage = (EasyRankInfo)UnionOfferMsg.EasyRankInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (EasyRankInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 1;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -2;
            this.serverId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnionName() {
            return (this.bitField0_ & 2) != 0;
         }

         public String getUnionName() {
            Object ref = this.unionName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.unionName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getUnionNameBytes() {
            Object ref = this.unionName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.unionName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setUnionName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.unionName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearUnionName() {
            this.bitField0_ &= -3;
            this.unionName_ = UnionOfferMsg.EasyRankInfo.getDefaultInstance().getUnionName();
            this.onChanged();
            return this;
         }

         public Builder setUnionNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2;
               this.unionName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasPoint() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getPoint() {
            return this.point_;
         }

         public Builder setPoint(int value) {
            this.bitField0_ |= 4;
            this.point_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPoint() {
            this.bitField0_ &= -5;
            this.point_ = 0;
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

   public static final class OfferRankData extends GeneratedMessageV3 implements OfferRankDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int SCORE_FIELD_NUMBER = 2;
      private int score_;
      public static final int PLAYERID_FIELD_NUMBER = 3;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 4;
      private volatile Object playerName_;
      public static final int HEAD_FIELD_NUMBER = 5;
      private int head_;
      public static final int HEADFRAME_FIELD_NUMBER = 6;
      private int headFrame_;
      public static final int LEVEL_FIELD_NUMBER = 7;
      private int level_;
      public static final int MONARCHID_FIELD_NUMBER = 8;
      private int monarchId_;
      public static final int SERVERID_FIELD_NUMBER = 9;
      private int serverId_;
      public static final int UNIONNAME_FIELD_NUMBER = 10;
      private volatile Object unionName_;
      public static final int FIGHT_FIELD_NUMBER = 11;
      private int fight_;
      public static final int UNIONLEADERNAME_FIELD_NUMBER = 12;
      private volatile Object unionLeaderName_;
      private byte memoizedIsInitialized;
      private static final OfferRankData DEFAULT_INSTANCE = new OfferRankData();
      /** @deprecated */
      @Deprecated
      public static final Parser<OfferRankData> PARSER = new AbstractParser<OfferRankData>() {
         public OfferRankData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new OfferRankData(input, extensionRegistry);
         }
      };

      private OfferRankData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private OfferRankData() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
         this.unionName_ = "";
         this.unionLeaderName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new OfferRankData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private OfferRankData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.score_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.playerId_ = input.readInt32();
                        break;
                     case 34:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 8;
                        this.playerName_ = bs;
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.head_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.headFrame_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.level_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.monarchId_ = input.readInt32();
                        break;
                     case 72:
                        this.bitField0_ |= 256;
                        this.serverId_ = input.readInt32();
                        break;
                     case 82:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 512;
                        this.unionName_ = bs;
                        break;
                     case 88:
                        this.bitField0_ |= 1024;
                        this.fight_ = input.readInt32();
                        break;
                     case 98:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 2048;
                        this.unionLeaderName_ = bs;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_OfferRankData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_OfferRankData_fieldAccessorTable.ensureFieldAccessorsInitialized(OfferRankData.class, Builder.class);
      }

      public boolean hasRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasScore() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getScore() {
         return this.score_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 8) != 0;
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

      public boolean hasHead() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getHead() {
         return this.head_;
      }

      public boolean hasHeadFrame() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getHeadFrame() {
         return this.headFrame_;
      }

      public boolean hasLevel() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getLevel() {
         return this.level_;
      }

      public boolean hasMonarchId() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getMonarchId() {
         return this.monarchId_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasUnionName() {
         return (this.bitField0_ & 512) != 0;
      }

      public String getUnionName() {
         Object ref = this.unionName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.unionName_ = s;
            }

            return s;
         }
      }

      public ByteString getUnionNameBytes() {
         Object ref = this.unionName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.unionName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasFight() {
         return (this.bitField0_ & 1024) != 0;
      }

      public int getFight() {
         return this.fight_;
      }

      public boolean hasUnionLeaderName() {
         return (this.bitField0_ & 2048) != 0;
      }

      public String getUnionLeaderName() {
         Object ref = this.unionLeaderName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.unionLeaderName_ = s;
            }

            return s;
         }
      }

      public ByteString getUnionLeaderNameBytes() {
         Object ref = this.unionLeaderName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.unionLeaderName_ = b;
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
         } else if (!this.hasRank()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasScore()) {
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
            output.writeInt32(2, this.score_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.playerId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            GeneratedMessageV3.writeString(output, 4, this.playerName_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.head_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.headFrame_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.level_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.monarchId_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.serverId_);
         }

         if ((this.bitField0_ & 512) != 0) {
            GeneratedMessageV3.writeString(output, 10, this.unionName_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            output.writeInt32(11, this.fight_);
         }

         if ((this.bitField0_ & 2048) != 0) {
            GeneratedMessageV3.writeString(output, 12, this.unionLeaderName_);
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
               size += CodedOutputStream.computeInt32Size(2, this.score_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.playerId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += GeneratedMessageV3.computeStringSize(4, this.playerName_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.head_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.headFrame_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.level_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.monarchId_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.serverId_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += GeneratedMessageV3.computeStringSize(10, this.unionName_);
            }

            if ((this.bitField0_ & 1024) != 0) {
               size += CodedOutputStream.computeInt32Size(11, this.fight_);
            }

            if ((this.bitField0_ & 2048) != 0) {
               size += GeneratedMessageV3.computeStringSize(12, this.unionLeaderName_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof OfferRankData)) {
            return super.equals(obj);
         } else {
            OfferRankData other = (OfferRankData)obj;
            if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasScore() != other.hasScore()) {
               return false;
            } else if (this.hasScore() && this.getScore() != other.getScore()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
               return false;
            } else if (this.hasLevel() != other.hasLevel()) {
               return false;
            } else if (this.hasLevel() && this.getLevel() != other.getLevel()) {
               return false;
            } else if (this.hasMonarchId() != other.hasMonarchId()) {
               return false;
            } else if (this.hasMonarchId() && this.getMonarchId() != other.getMonarchId()) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasUnionName() != other.hasUnionName()) {
               return false;
            } else if (this.hasUnionName() && !this.getUnionName().equals(other.getUnionName())) {
               return false;
            } else if (this.hasFight() != other.hasFight()) {
               return false;
            } else if (this.hasFight() && this.getFight() != other.getFight()) {
               return false;
            } else if (this.hasUnionLeaderName() != other.hasUnionLeaderName()) {
               return false;
            } else if (this.hasUnionLeaderName() && !this.getUnionLeaderName().equals(other.getUnionLeaderName())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasScore()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getScore();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasHead()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getHead();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getHeadFrame();
            }

            if (this.hasLevel()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getLevel();
            }

            if (this.hasMonarchId()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getMonarchId();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasUnionName()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getUnionName().hashCode();
            }

            if (this.hasFight()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getFight();
            }

            if (this.hasUnionLeaderName()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getUnionLeaderName().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static OfferRankData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (OfferRankData)PARSER.parseFrom(data);
      }

      public static OfferRankData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (OfferRankData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static OfferRankData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (OfferRankData)PARSER.parseFrom(data);
      }

      public static OfferRankData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (OfferRankData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static OfferRankData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (OfferRankData)PARSER.parseFrom(data);
      }

      public static OfferRankData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (OfferRankData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static OfferRankData parseFrom(InputStream input) throws IOException {
         return (OfferRankData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static OfferRankData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (OfferRankData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static OfferRankData parseDelimitedFrom(InputStream input) throws IOException {
         return (OfferRankData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static OfferRankData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (OfferRankData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static OfferRankData parseFrom(CodedInputStream input) throws IOException {
         return (OfferRankData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static OfferRankData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (OfferRankData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(OfferRankData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static OfferRankData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<OfferRankData> parser() {
         return PARSER;
      }

      public Parser<OfferRankData> getParserForType() {
         return PARSER;
      }

      public OfferRankData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OfferRankDataOrBuilder {
         private int bitField0_;
         private int rank_;
         private int score_;
         private int playerId_;
         private Object playerName_;
         private int head_;
         private int headFrame_;
         private int level_;
         private int monarchId_;
         private int serverId_;
         private Object unionName_;
         private int fight_;
         private Object unionLeaderName_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_OfferRankData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_OfferRankData_fieldAccessorTable.ensureFieldAccessorsInitialized(OfferRankData.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.unionName_ = "";
            this.unionLeaderName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.unionName_ = "";
            this.unionLeaderName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionOfferMsg.OfferRankData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            this.score_ = 0;
            this.bitField0_ &= -3;
            this.playerId_ = 0;
            this.bitField0_ &= -5;
            this.playerName_ = "";
            this.bitField0_ &= -9;
            this.head_ = 0;
            this.bitField0_ &= -17;
            this.headFrame_ = 0;
            this.bitField0_ &= -33;
            this.level_ = 0;
            this.bitField0_ &= -65;
            this.monarchId_ = 0;
            this.bitField0_ &= -129;
            this.serverId_ = 0;
            this.bitField0_ &= -257;
            this.unionName_ = "";
            this.bitField0_ &= -513;
            this.fight_ = 0;
            this.bitField0_ &= -1025;
            this.unionLeaderName_ = "";
            this.bitField0_ &= -2049;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_OfferRankData_descriptor;
         }

         public OfferRankData getDefaultInstanceForType() {
            return UnionOfferMsg.OfferRankData.getDefaultInstance();
         }

         public OfferRankData build() {
            OfferRankData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public OfferRankData buildPartial() {
            OfferRankData result = new OfferRankData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.score_ = this.score_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 16) != 0) {
               result.head_ = this.head_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.headFrame_ = this.headFrame_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.level_ = this.level_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.monarchId_ = this.monarchId_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 256;
            }

            if ((from_bitField0_ & 512) != 0) {
               to_bitField0_ |= 512;
            }

            result.unionName_ = this.unionName_;
            if ((from_bitField0_ & 1024) != 0) {
               result.fight_ = this.fight_;
               to_bitField0_ |= 1024;
            }

            if ((from_bitField0_ & 2048) != 0) {
               to_bitField0_ |= 2048;
            }

            result.unionLeaderName_ = this.unionLeaderName_;
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
            if (other instanceof OfferRankData) {
               return this.mergeFrom((OfferRankData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(OfferRankData other) {
            if (other == UnionOfferMsg.OfferRankData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasScore()) {
                  this.setScore(other.getScore());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 8;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
               }

               if (other.hasLevel()) {
                  this.setLevel(other.getLevel());
               }

               if (other.hasMonarchId()) {
                  this.setMonarchId(other.getMonarchId());
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasUnionName()) {
                  this.bitField0_ |= 512;
                  this.unionName_ = other.unionName_;
                  this.onChanged();
               }

               if (other.hasFight()) {
                  this.setFight(other.getFight());
               }

               if (other.hasUnionLeaderName()) {
                  this.bitField0_ |= 2048;
                  this.unionLeaderName_ = other.unionLeaderName_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRank()) {
               return false;
            } else {
               return this.hasScore();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            OfferRankData parsedMessage = null;

            try {
               parsedMessage = (OfferRankData)UnionOfferMsg.OfferRankData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (OfferRankData)e.getUnfinishedMessage();
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

         public boolean hasScore() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getScore() {
            return this.score_;
         }

         public Builder setScore(int value) {
            this.bitField0_ |= 2;
            this.score_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearScore() {
            this.bitField0_ &= -3;
            this.score_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getPlayerId() {
            return this.playerId_;
         }

         public Builder setPlayerId(int value) {
            this.bitField0_ |= 4;
            this.playerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayerId() {
            this.bitField0_ &= -5;
            this.playerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 8) != 0;
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
               this.bitField0_ |= 8;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -9;
            this.playerName_ = UnionOfferMsg.OfferRankData.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasHead() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getHead() {
            return this.head_;
         }

         public Builder setHead(int value) {
            this.bitField0_ |= 16;
            this.head_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHead() {
            this.bitField0_ &= -17;
            this.head_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeadFrame() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getHeadFrame() {
            return this.headFrame_;
         }

         public Builder setHeadFrame(int value) {
            this.bitField0_ |= 32;
            this.headFrame_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadFrame() {
            this.bitField0_ &= -33;
            this.headFrame_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLevel() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getLevel() {
            return this.level_;
         }

         public Builder setLevel(int value) {
            this.bitField0_ |= 64;
            this.level_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLevel() {
            this.bitField0_ &= -65;
            this.level_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMonarchId() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getMonarchId() {
            return this.monarchId_;
         }

         public Builder setMonarchId(int value) {
            this.bitField0_ |= 128;
            this.monarchId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMonarchId() {
            this.bitField0_ &= -129;
            this.monarchId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 256;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -257;
            this.serverId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnionName() {
            return (this.bitField0_ & 512) != 0;
         }

         public String getUnionName() {
            Object ref = this.unionName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.unionName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getUnionNameBytes() {
            Object ref = this.unionName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.unionName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setUnionName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 512;
               this.unionName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearUnionName() {
            this.bitField0_ &= -513;
            this.unionName_ = UnionOfferMsg.OfferRankData.getDefaultInstance().getUnionName();
            this.onChanged();
            return this;
         }

         public Builder setUnionNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 512;
               this.unionName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasFight() {
            return (this.bitField0_ & 1024) != 0;
         }

         public int getFight() {
            return this.fight_;
         }

         public Builder setFight(int value) {
            this.bitField0_ |= 1024;
            this.fight_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFight() {
            this.bitField0_ &= -1025;
            this.fight_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnionLeaderName() {
            return (this.bitField0_ & 2048) != 0;
         }

         public String getUnionLeaderName() {
            Object ref = this.unionLeaderName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.unionLeaderName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getUnionLeaderNameBytes() {
            Object ref = this.unionLeaderName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.unionLeaderName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setUnionLeaderName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2048;
               this.unionLeaderName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearUnionLeaderName() {
            this.bitField0_ &= -2049;
            this.unionLeaderName_ = UnionOfferMsg.OfferRankData.getDefaultInstance().getUnionLeaderName();
            this.onChanged();
            return this;
         }

         public Builder setUnionLeaderNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 2048;
               this.unionLeaderName_ = value;
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

   public static final class C2S_EnterView_14601 extends GeneratedMessageV3 implements C2S_EnterView_14601OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ENTER_FIELD_NUMBER = 1;
      private int enter_;
      private byte memoizedIsInitialized;
      private static final C2S_EnterView_14601 DEFAULT_INSTANCE = new C2S_EnterView_14601();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_EnterView_14601> PARSER = new AbstractParser<C2S_EnterView_14601>() {
         public C2S_EnterView_14601 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_EnterView_14601(input, extensionRegistry);
         }
      };

      private C2S_EnterView_14601(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_EnterView_14601() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_EnterView_14601();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_EnterView_14601(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.enter_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_EnterView_14601_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_EnterView_14601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnterView_14601.class, Builder.class);
      }

      public boolean hasEnter() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getEnter() {
         return this.enter_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasEnter()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.enter_);
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
               size += CodedOutputStream.computeInt32Size(1, this.enter_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_EnterView_14601)) {
            return super.equals(obj);
         } else {
            C2S_EnterView_14601 other = (C2S_EnterView_14601)obj;
            if (this.hasEnter() != other.hasEnter()) {
               return false;
            } else if (this.hasEnter() && this.getEnter() != other.getEnter()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasEnter()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getEnter();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_EnterView_14601 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_EnterView_14601)PARSER.parseFrom(data);
      }

      public static C2S_EnterView_14601 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnterView_14601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnterView_14601 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_EnterView_14601)PARSER.parseFrom(data);
      }

      public static C2S_EnterView_14601 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnterView_14601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnterView_14601 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_EnterView_14601)PARSER.parseFrom(data);
      }

      public static C2S_EnterView_14601 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_EnterView_14601)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_EnterView_14601 parseFrom(InputStream input) throws IOException {
         return (C2S_EnterView_14601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnterView_14601 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnterView_14601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnterView_14601 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_EnterView_14601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_EnterView_14601 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnterView_14601)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_EnterView_14601 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_EnterView_14601)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_EnterView_14601 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_EnterView_14601)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_EnterView_14601 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_EnterView_14601 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_EnterView_14601> parser() {
         return PARSER;
      }

      public Parser<C2S_EnterView_14601> getParserForType() {
         return PARSER;
      }

      public C2S_EnterView_14601 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_EnterView_14601OrBuilder {
         private int bitField0_;
         private int enter_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_EnterView_14601_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_EnterView_14601_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_EnterView_14601.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionOfferMsg.C2S_EnterView_14601.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.enter_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_EnterView_14601_descriptor;
         }

         public C2S_EnterView_14601 getDefaultInstanceForType() {
            return UnionOfferMsg.C2S_EnterView_14601.getDefaultInstance();
         }

         public C2S_EnterView_14601 build() {
            C2S_EnterView_14601 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_EnterView_14601 buildPartial() {
            C2S_EnterView_14601 result = new C2S_EnterView_14601(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.enter_ = this.enter_;
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
            if (other instanceof C2S_EnterView_14601) {
               return this.mergeFrom((C2S_EnterView_14601)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_EnterView_14601 other) {
            if (other == UnionOfferMsg.C2S_EnterView_14601.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasEnter()) {
                  this.setEnter(other.getEnter());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasEnter();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_EnterView_14601 parsedMessage = null;

            try {
               parsedMessage = (C2S_EnterView_14601)UnionOfferMsg.C2S_EnterView_14601.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_EnterView_14601)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasEnter() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getEnter() {
            return this.enter_;
         }

         public Builder setEnter(int value) {
            this.bitField0_ |= 1;
            this.enter_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEnter() {
            this.bitField0_ &= -2;
            this.enter_ = 0;
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

   public static final class S2C_EnterView_14602 extends GeneratedMessageV3 implements S2C_EnterView_14602OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FIGHTNUM_FIELD_NUMBER = 1;
      private int fightNum_;
      public static final int BUYNUM_FIELD_NUMBER = 2;
      private int buyNum_;
      public static final int INFO_FIELD_NUMBER = 3;
      private List<OfferRewardInfo> info_;
      public static final int RANKINFO_FIELD_NUMBER = 4;
      private EasyRankInfo rankInfo_;
      public static final int UNIONCOPYNUM_FIELD_NUMBER = 5;
      private int unionCopyNum_;
      public static final int UNIONPUBLISHNUM_FIELD_NUMBER = 6;
      private int unionPublishNum_;
      public static final int COOLTIME_FIELD_NUMBER = 7;
      private int coolTime_;
      private byte memoizedIsInitialized;
      private static final S2C_EnterView_14602 DEFAULT_INSTANCE = new S2C_EnterView_14602();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_EnterView_14602> PARSER = new AbstractParser<S2C_EnterView_14602>() {
         public S2C_EnterView_14602 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_EnterView_14602(input, extensionRegistry);
         }
      };

      private S2C_EnterView_14602(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_EnterView_14602() {
         this.memoizedIsInitialized = -1;
         this.info_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_EnterView_14602();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_EnterView_14602(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.fightNum_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.buyNum_ = input.readInt32();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.info_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.info_.add(input.readMessage(UnionOfferMsg.OfferRewardInfo.PARSER, extensionRegistry));
                        break;
                     case 34:
                        EasyRankInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.rankInfo_.toBuilder();
                        }

                        this.rankInfo_ = (EasyRankInfo)input.readMessage(UnionOfferMsg.EasyRankInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.rankInfo_);
                           this.rankInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 4;
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.unionCopyNum_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 16;
                        this.unionPublishNum_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 32;
                        this.coolTime_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.info_ = Collections.unmodifiableList(this.info_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_EnterView_14602_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_EnterView_14602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EnterView_14602.class, Builder.class);
      }

      public boolean hasFightNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFightNum() {
         return this.fightNum_;
      }

      public boolean hasBuyNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBuyNum() {
         return this.buyNum_;
      }

      public List<OfferRewardInfo> getInfoList() {
         return this.info_;
      }

      public List<? extends OfferRewardInfoOrBuilder> getInfoOrBuilderList() {
         return this.info_;
      }

      public int getInfoCount() {
         return this.info_.size();
      }

      public OfferRewardInfo getInfo(int index) {
         return (OfferRewardInfo)this.info_.get(index);
      }

      public OfferRewardInfoOrBuilder getInfoOrBuilder(int index) {
         return (OfferRewardInfoOrBuilder)this.info_.get(index);
      }

      public boolean hasRankInfo() {
         return (this.bitField0_ & 4) != 0;
      }

      public EasyRankInfo getRankInfo() {
         return this.rankInfo_ == null ? UnionOfferMsg.EasyRankInfo.getDefaultInstance() : this.rankInfo_;
      }

      public EasyRankInfoOrBuilder getRankInfoOrBuilder() {
         return this.rankInfo_ == null ? UnionOfferMsg.EasyRankInfo.getDefaultInstance() : this.rankInfo_;
      }

      public boolean hasUnionCopyNum() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getUnionCopyNum() {
         return this.unionCopyNum_;
      }

      public boolean hasUnionPublishNum() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getUnionPublishNum() {
         return this.unionPublishNum_;
      }

      public boolean hasCoolTime() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getCoolTime() {
         return this.coolTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFightNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuyNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasUnionCopyNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasUnionPublishNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCoolTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getInfoCount(); ++i) {
               if (!this.getInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            if (this.hasRankInfo() && !this.getRankInfo().isInitialized()) {
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
            output.writeInt32(1, this.fightNum_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.buyNum_);
         }

         for(int i = 0; i < this.info_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.info_.get(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(4, this.getRankInfo());
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.unionCopyNum_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(6, this.unionPublishNum_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(7, this.coolTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.fightNum_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.buyNum_);
            }

            for(int i = 0; i < this.info_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.info_.get(i));
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(4, this.getRankInfo());
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.unionCopyNum_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.unionPublishNum_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.coolTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_EnterView_14602)) {
            return super.equals(obj);
         } else {
            S2C_EnterView_14602 other = (S2C_EnterView_14602)obj;
            if (this.hasFightNum() != other.hasFightNum()) {
               return false;
            } else if (this.hasFightNum() && this.getFightNum() != other.getFightNum()) {
               return false;
            } else if (this.hasBuyNum() != other.hasBuyNum()) {
               return false;
            } else if (this.hasBuyNum() && this.getBuyNum() != other.getBuyNum()) {
               return false;
            } else if (!this.getInfoList().equals(other.getInfoList())) {
               return false;
            } else if (this.hasRankInfo() != other.hasRankInfo()) {
               return false;
            } else if (this.hasRankInfo() && !this.getRankInfo().equals(other.getRankInfo())) {
               return false;
            } else if (this.hasUnionCopyNum() != other.hasUnionCopyNum()) {
               return false;
            } else if (this.hasUnionCopyNum() && this.getUnionCopyNum() != other.getUnionCopyNum()) {
               return false;
            } else if (this.hasUnionPublishNum() != other.hasUnionPublishNum()) {
               return false;
            } else if (this.hasUnionPublishNum() && this.getUnionPublishNum() != other.getUnionPublishNum()) {
               return false;
            } else if (this.hasCoolTime() != other.hasCoolTime()) {
               return false;
            } else if (this.hasCoolTime() && this.getCoolTime() != other.getCoolTime()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasFightNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFightNum();
            }

            if (this.hasBuyNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuyNum();
            }

            if (this.getInfoCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getInfoList().hashCode();
            }

            if (this.hasRankInfo()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getRankInfo().hashCode();
            }

            if (this.hasUnionCopyNum()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getUnionCopyNum();
            }

            if (this.hasUnionPublishNum()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getUnionPublishNum();
            }

            if (this.hasCoolTime()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getCoolTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_EnterView_14602 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_EnterView_14602)PARSER.parseFrom(data);
      }

      public static S2C_EnterView_14602 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnterView_14602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnterView_14602 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_EnterView_14602)PARSER.parseFrom(data);
      }

      public static S2C_EnterView_14602 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnterView_14602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnterView_14602 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_EnterView_14602)PARSER.parseFrom(data);
      }

      public static S2C_EnterView_14602 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_EnterView_14602)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_EnterView_14602 parseFrom(InputStream input) throws IOException {
         return (S2C_EnterView_14602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EnterView_14602 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnterView_14602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EnterView_14602 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_EnterView_14602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_EnterView_14602 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnterView_14602)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_EnterView_14602 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_EnterView_14602)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_EnterView_14602 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_EnterView_14602)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_EnterView_14602 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_EnterView_14602 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_EnterView_14602> parser() {
         return PARSER;
      }

      public Parser<S2C_EnterView_14602> getParserForType() {
         return PARSER;
      }

      public S2C_EnterView_14602 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_EnterView_14602OrBuilder {
         private int bitField0_;
         private int fightNum_;
         private int buyNum_;
         private List<OfferRewardInfo> info_;
         private RepeatedFieldBuilderV3<OfferRewardInfo, OfferRewardInfo.Builder, OfferRewardInfoOrBuilder> infoBuilder_;
         private EasyRankInfo rankInfo_;
         private SingleFieldBuilderV3<EasyRankInfo, EasyRankInfo.Builder, EasyRankInfoOrBuilder> rankInfoBuilder_;
         private int unionCopyNum_;
         private int unionPublishNum_;
         private int coolTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_EnterView_14602_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_EnterView_14602_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_EnterView_14602.class, Builder.class);
         }

         private Builder() {
            this.info_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.info_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionOfferMsg.S2C_EnterView_14602.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
               this.getRankInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.fightNum_ = 0;
            this.bitField0_ &= -2;
            this.buyNum_ = 0;
            this.bitField0_ &= -3;
            if (this.infoBuilder_ == null) {
               this.info_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.infoBuilder_.clear();
            }

            if (this.rankInfoBuilder_ == null) {
               this.rankInfo_ = null;
            } else {
               this.rankInfoBuilder_.clear();
            }

            this.bitField0_ &= -9;
            this.unionCopyNum_ = 0;
            this.bitField0_ &= -17;
            this.unionPublishNum_ = 0;
            this.bitField0_ &= -33;
            this.coolTime_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_EnterView_14602_descriptor;
         }

         public S2C_EnterView_14602 getDefaultInstanceForType() {
            return UnionOfferMsg.S2C_EnterView_14602.getDefaultInstance();
         }

         public S2C_EnterView_14602 build() {
            S2C_EnterView_14602 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_EnterView_14602 buildPartial() {
            S2C_EnterView_14602 result = new S2C_EnterView_14602(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.fightNum_ = this.fightNum_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.buyNum_ = this.buyNum_;
               to_bitField0_ |= 2;
            }

            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.info_ = Collections.unmodifiableList(this.info_);
                  this.bitField0_ &= -5;
               }

               result.info_ = this.info_;
            } else {
               result.info_ = this.infoBuilder_.build();
            }

            if ((from_bitField0_ & 8) != 0) {
               if (this.rankInfoBuilder_ == null) {
                  result.rankInfo_ = this.rankInfo_;
               } else {
                  result.rankInfo_ = (EasyRankInfo)this.rankInfoBuilder_.build();
               }

               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.unionCopyNum_ = this.unionCopyNum_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.unionPublishNum_ = this.unionPublishNum_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.coolTime_ = this.coolTime_;
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
            if (other instanceof S2C_EnterView_14602) {
               return this.mergeFrom((S2C_EnterView_14602)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_EnterView_14602 other) {
            if (other == UnionOfferMsg.S2C_EnterView_14602.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFightNum()) {
                  this.setFightNum(other.getFightNum());
               }

               if (other.hasBuyNum()) {
                  this.setBuyNum(other.getBuyNum());
               }

               if (this.infoBuilder_ == null) {
                  if (!other.info_.isEmpty()) {
                     if (this.info_.isEmpty()) {
                        this.info_ = other.info_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureInfoIsMutable();
                        this.info_.addAll(other.info_);
                     }

                     this.onChanged();
                  }
               } else if (!other.info_.isEmpty()) {
                  if (this.infoBuilder_.isEmpty()) {
                     this.infoBuilder_.dispose();
                     this.infoBuilder_ = null;
                     this.info_ = other.info_;
                     this.bitField0_ &= -5;
                     this.infoBuilder_ = UnionOfferMsg.S2C_EnterView_14602.alwaysUseFieldBuilders ? this.getInfoFieldBuilder() : null;
                  } else {
                     this.infoBuilder_.addAllMessages(other.info_);
                  }
               }

               if (other.hasRankInfo()) {
                  this.mergeRankInfo(other.getRankInfo());
               }

               if (other.hasUnionCopyNum()) {
                  this.setUnionCopyNum(other.getUnionCopyNum());
               }

               if (other.hasUnionPublishNum()) {
                  this.setUnionPublishNum(other.getUnionPublishNum());
               }

               if (other.hasCoolTime()) {
                  this.setCoolTime(other.getCoolTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasFightNum()) {
               return false;
            } else if (!this.hasBuyNum()) {
               return false;
            } else if (!this.hasUnionCopyNum()) {
               return false;
            } else if (!this.hasUnionPublishNum()) {
               return false;
            } else if (!this.hasCoolTime()) {
               return false;
            } else {
               for(int i = 0; i < this.getInfoCount(); ++i) {
                  if (!this.getInfo(i).isInitialized()) {
                     return false;
                  }
               }

               if (this.hasRankInfo() && !this.getRankInfo().isInitialized()) {
                  return false;
               } else {
                  return true;
               }
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_EnterView_14602 parsedMessage = null;

            try {
               parsedMessage = (S2C_EnterView_14602)UnionOfferMsg.S2C_EnterView_14602.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_EnterView_14602)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFightNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFightNum() {
            return this.fightNum_;
         }

         public Builder setFightNum(int value) {
            this.bitField0_ |= 1;
            this.fightNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFightNum() {
            this.bitField0_ &= -2;
            this.fightNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuyNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBuyNum() {
            return this.buyNum_;
         }

         public Builder setBuyNum(int value) {
            this.bitField0_ |= 2;
            this.buyNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyNum() {
            this.bitField0_ &= -3;
            this.buyNum_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureInfoIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.info_ = new ArrayList(this.info_);
               this.bitField0_ |= 4;
            }

         }

         public List<OfferRewardInfo> getInfoList() {
            return this.infoBuilder_ == null ? Collections.unmodifiableList(this.info_) : this.infoBuilder_.getMessageList();
         }

         public int getInfoCount() {
            return this.infoBuilder_ == null ? this.info_.size() : this.infoBuilder_.getCount();
         }

         public OfferRewardInfo getInfo(int index) {
            return this.infoBuilder_ == null ? (OfferRewardInfo)this.info_.get(index) : (OfferRewardInfo)this.infoBuilder_.getMessage(index);
         }

         public Builder setInfo(int index, OfferRewardInfo value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfoIsMutable();
               this.info_.set(index, value);
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setInfo(int index, OfferRewardInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(OfferRewardInfo value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfoIsMutable();
               this.info_.add(value);
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addInfo(int index, OfferRewardInfo value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureInfoIsMutable();
               this.info_.add(index, value);
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addInfo(OfferRewardInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfo(int index, OfferRewardInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfo(Iterable<? extends OfferRewardInfo> values) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.info_);
               this.onChanged();
            } else {
               this.infoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearInfo() {
            if (this.infoBuilder_ == null) {
               this.info_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.infoBuilder_.clear();
            }

            return this;
         }

         public Builder removeInfo(int index) {
            if (this.infoBuilder_ == null) {
               this.ensureInfoIsMutable();
               this.info_.remove(index);
               this.onChanged();
            } else {
               this.infoBuilder_.remove(index);
            }

            return this;
         }

         public OfferRewardInfo.Builder getInfoBuilder(int index) {
            return (OfferRewardInfo.Builder)this.getInfoFieldBuilder().getBuilder(index);
         }

         public OfferRewardInfoOrBuilder getInfoOrBuilder(int index) {
            return this.infoBuilder_ == null ? (OfferRewardInfoOrBuilder)this.info_.get(index) : (OfferRewardInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends OfferRewardInfoOrBuilder> getInfoOrBuilderList() {
            return this.infoBuilder_ != null ? this.infoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.info_);
         }

         public OfferRewardInfo.Builder addInfoBuilder() {
            return (OfferRewardInfo.Builder)this.getInfoFieldBuilder().addBuilder(UnionOfferMsg.OfferRewardInfo.getDefaultInstance());
         }

         public OfferRewardInfo.Builder addInfoBuilder(int index) {
            return (OfferRewardInfo.Builder)this.getInfoFieldBuilder().addBuilder(index, UnionOfferMsg.OfferRewardInfo.getDefaultInstance());
         }

         public List<OfferRewardInfo.Builder> getInfoBuilderList() {
            return this.getInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<OfferRewardInfo, OfferRewardInfo.Builder, OfferRewardInfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new RepeatedFieldBuilderV3(this.info_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         public boolean hasRankInfo() {
            return (this.bitField0_ & 8) != 0;
         }

         public EasyRankInfo getRankInfo() {
            if (this.rankInfoBuilder_ == null) {
               return this.rankInfo_ == null ? UnionOfferMsg.EasyRankInfo.getDefaultInstance() : this.rankInfo_;
            } else {
               return (EasyRankInfo)this.rankInfoBuilder_.getMessage();
            }
         }

         public Builder setRankInfo(EasyRankInfo value) {
            if (this.rankInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.rankInfo_ = value;
               this.onChanged();
            } else {
               this.rankInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder setRankInfo(EasyRankInfo.Builder builderForValue) {
            if (this.rankInfoBuilder_ == null) {
               this.rankInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.rankInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder mergeRankInfo(EasyRankInfo value) {
            if (this.rankInfoBuilder_ == null) {
               if ((this.bitField0_ & 8) != 0 && this.rankInfo_ != null && this.rankInfo_ != UnionOfferMsg.EasyRankInfo.getDefaultInstance()) {
                  this.rankInfo_ = UnionOfferMsg.EasyRankInfo.newBuilder(this.rankInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.rankInfo_ = value;
               }

               this.onChanged();
            } else {
               this.rankInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 8;
            return this;
         }

         public Builder clearRankInfo() {
            if (this.rankInfoBuilder_ == null) {
               this.rankInfo_ = null;
               this.onChanged();
            } else {
               this.rankInfoBuilder_.clear();
            }

            this.bitField0_ &= -9;
            return this;
         }

         public EasyRankInfo.Builder getRankInfoBuilder() {
            this.bitField0_ |= 8;
            this.onChanged();
            return (EasyRankInfo.Builder)this.getRankInfoFieldBuilder().getBuilder();
         }

         public EasyRankInfoOrBuilder getRankInfoOrBuilder() {
            if (this.rankInfoBuilder_ != null) {
               return (EasyRankInfoOrBuilder)this.rankInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.rankInfo_ == null ? UnionOfferMsg.EasyRankInfo.getDefaultInstance() : this.rankInfo_;
            }
         }

         private SingleFieldBuilderV3<EasyRankInfo, EasyRankInfo.Builder, EasyRankInfoOrBuilder> getRankInfoFieldBuilder() {
            if (this.rankInfoBuilder_ == null) {
               this.rankInfoBuilder_ = new SingleFieldBuilderV3(this.getRankInfo(), this.getParentForChildren(), this.isClean());
               this.rankInfo_ = null;
            }

            return this.rankInfoBuilder_;
         }

         public boolean hasUnionCopyNum() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getUnionCopyNum() {
            return this.unionCopyNum_;
         }

         public Builder setUnionCopyNum(int value) {
            this.bitField0_ |= 16;
            this.unionCopyNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionCopyNum() {
            this.bitField0_ &= -17;
            this.unionCopyNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnionPublishNum() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getUnionPublishNum() {
            return this.unionPublishNum_;
         }

         public Builder setUnionPublishNum(int value) {
            this.bitField0_ |= 32;
            this.unionPublishNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionPublishNum() {
            this.bitField0_ &= -33;
            this.unionPublishNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCoolTime() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getCoolTime() {
            return this.coolTime_;
         }

         public Builder setCoolTime(int value) {
            this.bitField0_ |= 64;
            this.coolTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCoolTime() {
            this.bitField0_ &= -65;
            this.coolTime_ = 0;
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

   public static final class C2S_PublishOffer_14603 extends GeneratedMessageV3 implements C2S_PublishOffer_14603OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_PublishOffer_14603 DEFAULT_INSTANCE = new C2S_PublishOffer_14603();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PublishOffer_14603> PARSER = new AbstractParser<C2S_PublishOffer_14603>() {
         public C2S_PublishOffer_14603 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PublishOffer_14603(input, extensionRegistry);
         }
      };

      private C2S_PublishOffer_14603(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PublishOffer_14603() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PublishOffer_14603();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PublishOffer_14603(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_PublishOffer_14603_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_PublishOffer_14603_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PublishOffer_14603.class, Builder.class);
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
         } else if (!(obj instanceof C2S_PublishOffer_14603)) {
            return super.equals(obj);
         } else {
            C2S_PublishOffer_14603 other = (C2S_PublishOffer_14603)obj;
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

      public static C2S_PublishOffer_14603 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PublishOffer_14603)PARSER.parseFrom(data);
      }

      public static C2S_PublishOffer_14603 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PublishOffer_14603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PublishOffer_14603 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PublishOffer_14603)PARSER.parseFrom(data);
      }

      public static C2S_PublishOffer_14603 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PublishOffer_14603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PublishOffer_14603 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PublishOffer_14603)PARSER.parseFrom(data);
      }

      public static C2S_PublishOffer_14603 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PublishOffer_14603)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PublishOffer_14603 parseFrom(InputStream input) throws IOException {
         return (C2S_PublishOffer_14603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PublishOffer_14603 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PublishOffer_14603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PublishOffer_14603 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PublishOffer_14603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PublishOffer_14603 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PublishOffer_14603)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PublishOffer_14603 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PublishOffer_14603)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PublishOffer_14603 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PublishOffer_14603)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PublishOffer_14603 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PublishOffer_14603 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PublishOffer_14603> parser() {
         return PARSER;
      }

      public Parser<C2S_PublishOffer_14603> getParserForType() {
         return PARSER;
      }

      public C2S_PublishOffer_14603 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PublishOffer_14603OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_PublishOffer_14603_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_PublishOffer_14603_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PublishOffer_14603.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionOfferMsg.C2S_PublishOffer_14603.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_PublishOffer_14603_descriptor;
         }

         public C2S_PublishOffer_14603 getDefaultInstanceForType() {
            return UnionOfferMsg.C2S_PublishOffer_14603.getDefaultInstance();
         }

         public C2S_PublishOffer_14603 build() {
            C2S_PublishOffer_14603 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PublishOffer_14603 buildPartial() {
            C2S_PublishOffer_14603 result = new C2S_PublishOffer_14603(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_PublishOffer_14603) {
               return this.mergeFrom((C2S_PublishOffer_14603)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PublishOffer_14603 other) {
            if (other == UnionOfferMsg.C2S_PublishOffer_14603.getDefaultInstance()) {
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
            C2S_PublishOffer_14603 parsedMessage = null;

            try {
               parsedMessage = (C2S_PublishOffer_14603)UnionOfferMsg.C2S_PublishOffer_14603.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PublishOffer_14603)e.getUnfinishedMessage();
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

   public static final class S2C_AddOffer_14604 extends GeneratedMessageV3 implements S2C_AddOffer_14604OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 1;
      private OfferRewardInfo info_;
      private byte memoizedIsInitialized;
      private static final S2C_AddOffer_14604 DEFAULT_INSTANCE = new S2C_AddOffer_14604();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_AddOffer_14604> PARSER = new AbstractParser<S2C_AddOffer_14604>() {
         public S2C_AddOffer_14604 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_AddOffer_14604(input, extensionRegistry);
         }
      };

      private S2C_AddOffer_14604(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_AddOffer_14604() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_AddOffer_14604();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_AddOffer_14604(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        OfferRewardInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (OfferRewardInfo)input.readMessage(UnionOfferMsg.OfferRewardInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
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
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_AddOffer_14604_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_AddOffer_14604_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AddOffer_14604.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public OfferRewardInfo getInfo() {
         return this.info_ == null ? UnionOfferMsg.OfferRewardInfo.getDefaultInstance() : this.info_;
      }

      public OfferRewardInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? UnionOfferMsg.OfferRewardInfo.getDefaultInstance() : this.info_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_AddOffer_14604)) {
            return super.equals(obj);
         } else {
            S2C_AddOffer_14604 other = (S2C_AddOffer_14604)obj;
            if (this.hasInfo() != other.hasInfo()) {
               return false;
            } else if (this.hasInfo() && !this.getInfo().equals(other.getInfo())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_AddOffer_14604 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_AddOffer_14604)PARSER.parseFrom(data);
      }

      public static S2C_AddOffer_14604 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AddOffer_14604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AddOffer_14604 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_AddOffer_14604)PARSER.parseFrom(data);
      }

      public static S2C_AddOffer_14604 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AddOffer_14604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AddOffer_14604 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_AddOffer_14604)PARSER.parseFrom(data);
      }

      public static S2C_AddOffer_14604 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_AddOffer_14604)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_AddOffer_14604 parseFrom(InputStream input) throws IOException {
         return (S2C_AddOffer_14604)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AddOffer_14604 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AddOffer_14604)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AddOffer_14604 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_AddOffer_14604)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_AddOffer_14604 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AddOffer_14604)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_AddOffer_14604 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_AddOffer_14604)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_AddOffer_14604 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_AddOffer_14604)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_AddOffer_14604 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_AddOffer_14604 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_AddOffer_14604> parser() {
         return PARSER;
      }

      public Parser<S2C_AddOffer_14604> getParserForType() {
         return PARSER;
      }

      public S2C_AddOffer_14604 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_AddOffer_14604OrBuilder {
         private int bitField0_;
         private OfferRewardInfo info_;
         private SingleFieldBuilderV3<OfferRewardInfo, OfferRewardInfo.Builder, OfferRewardInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_AddOffer_14604_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_AddOffer_14604_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_AddOffer_14604.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionOfferMsg.S2C_AddOffer_14604.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.infoBuilder_ == null) {
               this.info_ = null;
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_AddOffer_14604_descriptor;
         }

         public S2C_AddOffer_14604 getDefaultInstanceForType() {
            return UnionOfferMsg.S2C_AddOffer_14604.getDefaultInstance();
         }

         public S2C_AddOffer_14604 build() {
            S2C_AddOffer_14604 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_AddOffer_14604 buildPartial() {
            S2C_AddOffer_14604 result = new S2C_AddOffer_14604(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (OfferRewardInfo)this.infoBuilder_.build();
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
            if (other instanceof S2C_AddOffer_14604) {
               return this.mergeFrom((S2C_AddOffer_14604)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_AddOffer_14604 other) {
            if (other == UnionOfferMsg.S2C_AddOffer_14604.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasInfo()) {
               return false;
            } else {
               return this.getInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_AddOffer_14604 parsedMessage = null;

            try {
               parsedMessage = (S2C_AddOffer_14604)UnionOfferMsg.S2C_AddOffer_14604.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_AddOffer_14604)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public OfferRewardInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? UnionOfferMsg.OfferRewardInfo.getDefaultInstance() : this.info_;
            } else {
               return (OfferRewardInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(OfferRewardInfo value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.info_ = value;
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setInfo(OfferRewardInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(OfferRewardInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != UnionOfferMsg.OfferRewardInfo.getDefaultInstance()) {
                  this.info_ = UnionOfferMsg.OfferRewardInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
               } else {
                  this.info_ = value;
               }

               this.onChanged();
            } else {
               this.infoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearInfo() {
            if (this.infoBuilder_ == null) {
               this.info_ = null;
               this.onChanged();
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public OfferRewardInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (OfferRewardInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public OfferRewardInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (OfferRewardInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? UnionOfferMsg.OfferRewardInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<OfferRewardInfo, OfferRewardInfo.Builder, OfferRewardInfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new SingleFieldBuilderV3(this.getInfo(), this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_UpdateOffer_14606 extends GeneratedMessageV3 implements S2C_UpdateOffer_14606OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 1;
      private OfferRewardInfo info_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateOffer_14606 DEFAULT_INSTANCE = new S2C_UpdateOffer_14606();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateOffer_14606> PARSER = new AbstractParser<S2C_UpdateOffer_14606>() {
         public S2C_UpdateOffer_14606 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateOffer_14606(input, extensionRegistry);
         }
      };

      private S2C_UpdateOffer_14606(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateOffer_14606() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateOffer_14606();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateOffer_14606(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        OfferRewardInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (OfferRewardInfo)input.readMessage(UnionOfferMsg.OfferRewardInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.info_);
                           this.info_ = subBuilder.buildPartial();
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
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_UpdateOffer_14606_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_UpdateOffer_14606_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateOffer_14606.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public OfferRewardInfo getInfo() {
         return this.info_ == null ? UnionOfferMsg.OfferRewardInfo.getDefaultInstance() : this.info_;
      }

      public OfferRewardInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? UnionOfferMsg.OfferRewardInfo.getDefaultInstance() : this.info_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpdateOffer_14606)) {
            return super.equals(obj);
         } else {
            S2C_UpdateOffer_14606 other = (S2C_UpdateOffer_14606)obj;
            if (this.hasInfo() != other.hasInfo()) {
               return false;
            } else if (this.hasInfo() && !this.getInfo().equals(other.getInfo())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpdateOffer_14606 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateOffer_14606)PARSER.parseFrom(data);
      }

      public static S2C_UpdateOffer_14606 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateOffer_14606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateOffer_14606 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateOffer_14606)PARSER.parseFrom(data);
      }

      public static S2C_UpdateOffer_14606 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateOffer_14606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateOffer_14606 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateOffer_14606)PARSER.parseFrom(data);
      }

      public static S2C_UpdateOffer_14606 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateOffer_14606)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateOffer_14606 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateOffer_14606)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateOffer_14606 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateOffer_14606)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateOffer_14606 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateOffer_14606)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateOffer_14606 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateOffer_14606)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateOffer_14606 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateOffer_14606)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateOffer_14606 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateOffer_14606)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateOffer_14606 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateOffer_14606 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateOffer_14606> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateOffer_14606> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateOffer_14606 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateOffer_14606OrBuilder {
         private int bitField0_;
         private OfferRewardInfo info_;
         private SingleFieldBuilderV3<OfferRewardInfo, OfferRewardInfo.Builder, OfferRewardInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_UpdateOffer_14606_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_UpdateOffer_14606_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateOffer_14606.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionOfferMsg.S2C_UpdateOffer_14606.alwaysUseFieldBuilders) {
               this.getInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.infoBuilder_ == null) {
               this.info_ = null;
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_UpdateOffer_14606_descriptor;
         }

         public S2C_UpdateOffer_14606 getDefaultInstanceForType() {
            return UnionOfferMsg.S2C_UpdateOffer_14606.getDefaultInstance();
         }

         public S2C_UpdateOffer_14606 build() {
            S2C_UpdateOffer_14606 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateOffer_14606 buildPartial() {
            S2C_UpdateOffer_14606 result = new S2C_UpdateOffer_14606(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (OfferRewardInfo)this.infoBuilder_.build();
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
            if (other instanceof S2C_UpdateOffer_14606) {
               return this.mergeFrom((S2C_UpdateOffer_14606)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateOffer_14606 other) {
            if (other == UnionOfferMsg.S2C_UpdateOffer_14606.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasInfo()) {
                  this.mergeInfo(other.getInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasInfo()) {
               return false;
            } else {
               return this.getInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UpdateOffer_14606 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateOffer_14606)UnionOfferMsg.S2C_UpdateOffer_14606.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateOffer_14606)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public OfferRewardInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? UnionOfferMsg.OfferRewardInfo.getDefaultInstance() : this.info_;
            } else {
               return (OfferRewardInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(OfferRewardInfo value) {
            if (this.infoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.info_ = value;
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setInfo(OfferRewardInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(OfferRewardInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != UnionOfferMsg.OfferRewardInfo.getDefaultInstance()) {
                  this.info_ = UnionOfferMsg.OfferRewardInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
               } else {
                  this.info_ = value;
               }

               this.onChanged();
            } else {
               this.infoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearInfo() {
            if (this.infoBuilder_ == null) {
               this.info_ = null;
               this.onChanged();
            } else {
               this.infoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public OfferRewardInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (OfferRewardInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public OfferRewardInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (OfferRewardInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? UnionOfferMsg.OfferRewardInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<OfferRewardInfo, OfferRewardInfo.Builder, OfferRewardInfoOrBuilder> getInfoFieldBuilder() {
            if (this.infoBuilder_ == null) {
               this.infoBuilder_ = new SingleFieldBuilderV3(this.getInfo(), this.getParentForChildren(), this.isClean());
               this.info_ = null;
            }

            return this.infoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_DelOffer_14608 extends GeneratedMessageV3 implements S2C_DelOffer_14608OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int CODES_FIELD_NUMBER = 1;
      private Internal.IntList codes_;
      private byte memoizedIsInitialized;
      private static final S2C_DelOffer_14608 DEFAULT_INSTANCE = new S2C_DelOffer_14608();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DelOffer_14608> PARSER = new AbstractParser<S2C_DelOffer_14608>() {
         public S2C_DelOffer_14608 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DelOffer_14608(input, extensionRegistry);
         }
      };

      private S2C_DelOffer_14608(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DelOffer_14608() {
         this.memoizedIsInitialized = -1;
         this.codes_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DelOffer_14608();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DelOffer_14608(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                           this.codes_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.codes_.addInt(input.readInt32());
                        break;
                     case 10:
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
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_DelOffer_14608_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_DelOffer_14608_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DelOffer_14608.class, Builder.class);
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
            output.writeInt32(1, this.codes_.getInt(i));
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
         } else if (!(obj instanceof S2C_DelOffer_14608)) {
            return super.equals(obj);
         } else {
            S2C_DelOffer_14608 other = (S2C_DelOffer_14608)obj;
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
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCodesList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DelOffer_14608 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DelOffer_14608)PARSER.parseFrom(data);
      }

      public static S2C_DelOffer_14608 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DelOffer_14608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DelOffer_14608 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DelOffer_14608)PARSER.parseFrom(data);
      }

      public static S2C_DelOffer_14608 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DelOffer_14608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DelOffer_14608 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DelOffer_14608)PARSER.parseFrom(data);
      }

      public static S2C_DelOffer_14608 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DelOffer_14608)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DelOffer_14608 parseFrom(InputStream input) throws IOException {
         return (S2C_DelOffer_14608)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DelOffer_14608 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DelOffer_14608)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DelOffer_14608 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DelOffer_14608)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DelOffer_14608 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DelOffer_14608)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DelOffer_14608 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DelOffer_14608)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DelOffer_14608 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DelOffer_14608)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DelOffer_14608 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DelOffer_14608 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DelOffer_14608> parser() {
         return PARSER;
      }

      public Parser<S2C_DelOffer_14608> getParserForType() {
         return PARSER;
      }

      public S2C_DelOffer_14608 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DelOffer_14608OrBuilder {
         private int bitField0_;
         private Internal.IntList codes_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_DelOffer_14608_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_DelOffer_14608_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DelOffer_14608.class, Builder.class);
         }

         private Builder() {
            this.codes_ = UnionOfferMsg.S2C_DelOffer_14608.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.codes_ = UnionOfferMsg.S2C_DelOffer_14608.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionOfferMsg.S2C_DelOffer_14608.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.codes_ = UnionOfferMsg.S2C_DelOffer_14608.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_DelOffer_14608_descriptor;
         }

         public S2C_DelOffer_14608 getDefaultInstanceForType() {
            return UnionOfferMsg.S2C_DelOffer_14608.getDefaultInstance();
         }

         public S2C_DelOffer_14608 build() {
            S2C_DelOffer_14608 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DelOffer_14608 buildPartial() {
            S2C_DelOffer_14608 result = new S2C_DelOffer_14608(this);
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
            if (other instanceof S2C_DelOffer_14608) {
               return this.mergeFrom((S2C_DelOffer_14608)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DelOffer_14608 other) {
            if (other == UnionOfferMsg.S2C_DelOffer_14608.getDefaultInstance()) {
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
            S2C_DelOffer_14608 parsedMessage = null;

            try {
               parsedMessage = (S2C_DelOffer_14608)UnionOfferMsg.S2C_DelOffer_14608.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DelOffer_14608)e.getUnfinishedMessage();
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
               this.codes_ = UnionOfferMsg.S2C_DelOffer_14608.mutableCopy(this.codes_);
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
            this.codes_ = UnionOfferMsg.S2C_DelOffer_14608.emptyIntList();
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

   public static final class C2S_BuyFight_14609 extends GeneratedMessageV3 implements C2S_BuyFight_14609OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_BuyFight_14609 DEFAULT_INSTANCE = new C2S_BuyFight_14609();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BuyFight_14609> PARSER = new AbstractParser<C2S_BuyFight_14609>() {
         public C2S_BuyFight_14609 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BuyFight_14609(input, extensionRegistry);
         }
      };

      private C2S_BuyFight_14609(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BuyFight_14609() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BuyFight_14609();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BuyFight_14609(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_BuyFight_14609_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_BuyFight_14609_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyFight_14609.class, Builder.class);
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
         } else if (!(obj instanceof C2S_BuyFight_14609)) {
            return super.equals(obj);
         } else {
            C2S_BuyFight_14609 other = (C2S_BuyFight_14609)obj;
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

      public static C2S_BuyFight_14609 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BuyFight_14609)PARSER.parseFrom(data);
      }

      public static C2S_BuyFight_14609 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyFight_14609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyFight_14609 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BuyFight_14609)PARSER.parseFrom(data);
      }

      public static C2S_BuyFight_14609 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyFight_14609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyFight_14609 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BuyFight_14609)PARSER.parseFrom(data);
      }

      public static C2S_BuyFight_14609 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyFight_14609)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyFight_14609 parseFrom(InputStream input) throws IOException {
         return (C2S_BuyFight_14609)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyFight_14609 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyFight_14609)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyFight_14609 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BuyFight_14609)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BuyFight_14609 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyFight_14609)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyFight_14609 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BuyFight_14609)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyFight_14609 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyFight_14609)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BuyFight_14609 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BuyFight_14609 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BuyFight_14609> parser() {
         return PARSER;
      }

      public Parser<C2S_BuyFight_14609> getParserForType() {
         return PARSER;
      }

      public C2S_BuyFight_14609 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BuyFight_14609OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_BuyFight_14609_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_BuyFight_14609_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyFight_14609.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionOfferMsg.C2S_BuyFight_14609.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_BuyFight_14609_descriptor;
         }

         public C2S_BuyFight_14609 getDefaultInstanceForType() {
            return UnionOfferMsg.C2S_BuyFight_14609.getDefaultInstance();
         }

         public C2S_BuyFight_14609 build() {
            C2S_BuyFight_14609 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BuyFight_14609 buildPartial() {
            C2S_BuyFight_14609 result = new C2S_BuyFight_14609(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_BuyFight_14609) {
               return this.mergeFrom((C2S_BuyFight_14609)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BuyFight_14609 other) {
            if (other == UnionOfferMsg.C2S_BuyFight_14609.getDefaultInstance()) {
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
            C2S_BuyFight_14609 parsedMessage = null;

            try {
               parsedMessage = (C2S_BuyFight_14609)UnionOfferMsg.C2S_BuyFight_14609.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BuyFight_14609)e.getUnfinishedMessage();
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

   public static final class S2C_UpdateFight_14610 extends GeneratedMessageV3 implements S2C_UpdateFight_14610OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FIGHTNUM_FIELD_NUMBER = 1;
      private int fightNum_;
      public static final int BUYNUM_FIELD_NUMBER = 2;
      private int buyNum_;
      private byte memoizedIsInitialized;
      private static final S2C_UpdateFight_14610 DEFAULT_INSTANCE = new S2C_UpdateFight_14610();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_UpdateFight_14610> PARSER = new AbstractParser<S2C_UpdateFight_14610>() {
         public S2C_UpdateFight_14610 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_UpdateFight_14610(input, extensionRegistry);
         }
      };

      private S2C_UpdateFight_14610(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_UpdateFight_14610() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_UpdateFight_14610();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_UpdateFight_14610(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.fightNum_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.buyNum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_UpdateFight_14610_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_UpdateFight_14610_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateFight_14610.class, Builder.class);
      }

      public boolean hasFightNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFightNum() {
         return this.fightNum_;
      }

      public boolean hasBuyNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBuyNum() {
         return this.buyNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFightNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBuyNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.fightNum_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.buyNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.fightNum_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.buyNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_UpdateFight_14610)) {
            return super.equals(obj);
         } else {
            S2C_UpdateFight_14610 other = (S2C_UpdateFight_14610)obj;
            if (this.hasFightNum() != other.hasFightNum()) {
               return false;
            } else if (this.hasFightNum() && this.getFightNum() != other.getFightNum()) {
               return false;
            } else if (this.hasBuyNum() != other.hasBuyNum()) {
               return false;
            } else if (this.hasBuyNum() && this.getBuyNum() != other.getBuyNum()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasFightNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFightNum();
            }

            if (this.hasBuyNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuyNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_UpdateFight_14610 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_UpdateFight_14610)PARSER.parseFrom(data);
      }

      public static S2C_UpdateFight_14610 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateFight_14610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateFight_14610 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_UpdateFight_14610)PARSER.parseFrom(data);
      }

      public static S2C_UpdateFight_14610 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateFight_14610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateFight_14610 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_UpdateFight_14610)PARSER.parseFrom(data);
      }

      public static S2C_UpdateFight_14610 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_UpdateFight_14610)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_UpdateFight_14610 parseFrom(InputStream input) throws IOException {
         return (S2C_UpdateFight_14610)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateFight_14610 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateFight_14610)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateFight_14610 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_UpdateFight_14610)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_UpdateFight_14610 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateFight_14610)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_UpdateFight_14610 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_UpdateFight_14610)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_UpdateFight_14610 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_UpdateFight_14610)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_UpdateFight_14610 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_UpdateFight_14610 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_UpdateFight_14610> parser() {
         return PARSER;
      }

      public Parser<S2C_UpdateFight_14610> getParserForType() {
         return PARSER;
      }

      public S2C_UpdateFight_14610 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_UpdateFight_14610OrBuilder {
         private int bitField0_;
         private int fightNum_;
         private int buyNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_UpdateFight_14610_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_UpdateFight_14610_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_UpdateFight_14610.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionOfferMsg.S2C_UpdateFight_14610.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.fightNum_ = 0;
            this.bitField0_ &= -2;
            this.buyNum_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_UpdateFight_14610_descriptor;
         }

         public S2C_UpdateFight_14610 getDefaultInstanceForType() {
            return UnionOfferMsg.S2C_UpdateFight_14610.getDefaultInstance();
         }

         public S2C_UpdateFight_14610 build() {
            S2C_UpdateFight_14610 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_UpdateFight_14610 buildPartial() {
            S2C_UpdateFight_14610 result = new S2C_UpdateFight_14610(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.fightNum_ = this.fightNum_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.buyNum_ = this.buyNum_;
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
            if (other instanceof S2C_UpdateFight_14610) {
               return this.mergeFrom((S2C_UpdateFight_14610)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_UpdateFight_14610 other) {
            if (other == UnionOfferMsg.S2C_UpdateFight_14610.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFightNum()) {
                  this.setFightNum(other.getFightNum());
               }

               if (other.hasBuyNum()) {
                  this.setBuyNum(other.getBuyNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasFightNum()) {
               return false;
            } else {
               return this.hasBuyNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_UpdateFight_14610 parsedMessage = null;

            try {
               parsedMessage = (S2C_UpdateFight_14610)UnionOfferMsg.S2C_UpdateFight_14610.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_UpdateFight_14610)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFightNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFightNum() {
            return this.fightNum_;
         }

         public Builder setFightNum(int value) {
            this.bitField0_ |= 1;
            this.fightNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFightNum() {
            this.bitField0_ &= -2;
            this.fightNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasBuyNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBuyNum() {
            return this.buyNum_;
         }

         public Builder setBuyNum(int value) {
            this.bitField0_ |= 2;
            this.buyNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyNum() {
            this.bitField0_ &= -3;
            this.buyNum_ = 0;
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

   public static final class C2S_Record_14611 extends GeneratedMessageV3 implements C2S_Record_14611OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_Record_14611 DEFAULT_INSTANCE = new C2S_Record_14611();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Record_14611> PARSER = new AbstractParser<C2S_Record_14611>() {
         public C2S_Record_14611 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Record_14611(input, extensionRegistry);
         }
      };

      private C2S_Record_14611(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Record_14611() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Record_14611();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Record_14611(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_Record_14611_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_Record_14611_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Record_14611.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Record_14611)) {
            return super.equals(obj);
         } else {
            C2S_Record_14611 other = (C2S_Record_14611)obj;
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

      public static C2S_Record_14611 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Record_14611)PARSER.parseFrom(data);
      }

      public static C2S_Record_14611 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Record_14611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Record_14611 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Record_14611)PARSER.parseFrom(data);
      }

      public static C2S_Record_14611 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Record_14611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Record_14611 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Record_14611)PARSER.parseFrom(data);
      }

      public static C2S_Record_14611 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Record_14611)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Record_14611 parseFrom(InputStream input) throws IOException {
         return (C2S_Record_14611)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Record_14611 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Record_14611)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Record_14611 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Record_14611)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Record_14611 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Record_14611)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Record_14611 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Record_14611)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Record_14611 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Record_14611)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Record_14611 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Record_14611 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Record_14611> parser() {
         return PARSER;
      }

      public Parser<C2S_Record_14611> getParserForType() {
         return PARSER;
      }

      public C2S_Record_14611 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Record_14611OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_Record_14611_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_Record_14611_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Record_14611.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionOfferMsg.C2S_Record_14611.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_Record_14611_descriptor;
         }

         public C2S_Record_14611 getDefaultInstanceForType() {
            return UnionOfferMsg.C2S_Record_14611.getDefaultInstance();
         }

         public C2S_Record_14611 build() {
            C2S_Record_14611 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Record_14611 buildPartial() {
            C2S_Record_14611 result = new C2S_Record_14611(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_Record_14611) {
               return this.mergeFrom((C2S_Record_14611)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Record_14611 other) {
            if (other == UnionOfferMsg.C2S_Record_14611.getDefaultInstance()) {
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
            C2S_Record_14611 parsedMessage = null;

            try {
               parsedMessage = (C2S_Record_14611)UnionOfferMsg.C2S_Record_14611.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Record_14611)e.getUnfinishedMessage();
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

   public static final class S2C_Record_14612 extends GeneratedMessageV3 implements S2C_Record_14612OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECORDINFO_FIELD_NUMBER = 1;
      private List<RecordInfo> recordInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_Record_14612 DEFAULT_INSTANCE = new S2C_Record_14612();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Record_14612> PARSER = new AbstractParser<S2C_Record_14612>() {
         public S2C_Record_14612 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Record_14612(input, extensionRegistry);
         }
      };

      private S2C_Record_14612(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Record_14612() {
         this.memoizedIsInitialized = -1;
         this.recordInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Record_14612();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Record_14612(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                           this.recordInfo_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.recordInfo_.add(input.readMessage(UnionOfferMsg.RecordInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.recordInfo_ = Collections.unmodifiableList(this.recordInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_Record_14612_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_Record_14612_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Record_14612.class, Builder.class);
      }

      public List<RecordInfo> getRecordInfoList() {
         return this.recordInfo_;
      }

      public List<? extends RecordInfoOrBuilder> getRecordInfoOrBuilderList() {
         return this.recordInfo_;
      }

      public int getRecordInfoCount() {
         return this.recordInfo_.size();
      }

      public RecordInfo getRecordInfo(int index) {
         return (RecordInfo)this.recordInfo_.get(index);
      }

      public RecordInfoOrBuilder getRecordInfoOrBuilder(int index) {
         return (RecordInfoOrBuilder)this.recordInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getRecordInfoCount(); ++i) {
               if (!this.getRecordInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.recordInfo_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.recordInfo_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.recordInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.recordInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Record_14612)) {
            return super.equals(obj);
         } else {
            S2C_Record_14612 other = (S2C_Record_14612)obj;
            if (!this.getRecordInfoList().equals(other.getRecordInfoList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getRecordInfoCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRecordInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Record_14612 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Record_14612)PARSER.parseFrom(data);
      }

      public static S2C_Record_14612 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Record_14612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Record_14612 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Record_14612)PARSER.parseFrom(data);
      }

      public static S2C_Record_14612 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Record_14612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Record_14612 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Record_14612)PARSER.parseFrom(data);
      }

      public static S2C_Record_14612 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Record_14612)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Record_14612 parseFrom(InputStream input) throws IOException {
         return (S2C_Record_14612)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Record_14612 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Record_14612)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Record_14612 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Record_14612)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Record_14612 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Record_14612)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Record_14612 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Record_14612)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Record_14612 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Record_14612)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Record_14612 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Record_14612 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Record_14612> parser() {
         return PARSER;
      }

      public Parser<S2C_Record_14612> getParserForType() {
         return PARSER;
      }

      public S2C_Record_14612 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Record_14612OrBuilder {
         private int bitField0_;
         private List<RecordInfo> recordInfo_;
         private RepeatedFieldBuilderV3<RecordInfo, RecordInfo.Builder, RecordInfoOrBuilder> recordInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_Record_14612_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_Record_14612_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Record_14612.class, Builder.class);
         }

         private Builder() {
            this.recordInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.recordInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionOfferMsg.S2C_Record_14612.alwaysUseFieldBuilders) {
               this.getRecordInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.recordInfoBuilder_ == null) {
               this.recordInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.recordInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_Record_14612_descriptor;
         }

         public S2C_Record_14612 getDefaultInstanceForType() {
            return UnionOfferMsg.S2C_Record_14612.getDefaultInstance();
         }

         public S2C_Record_14612 build() {
            S2C_Record_14612 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Record_14612 buildPartial() {
            S2C_Record_14612 result = new S2C_Record_14612(this);
            int from_bitField0_ = this.bitField0_;
            if (this.recordInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.recordInfo_ = Collections.unmodifiableList(this.recordInfo_);
                  this.bitField0_ &= -2;
               }

               result.recordInfo_ = this.recordInfo_;
            } else {
               result.recordInfo_ = this.recordInfoBuilder_.build();
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
            if (other instanceof S2C_Record_14612) {
               return this.mergeFrom((S2C_Record_14612)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Record_14612 other) {
            if (other == UnionOfferMsg.S2C_Record_14612.getDefaultInstance()) {
               return this;
            } else {
               if (this.recordInfoBuilder_ == null) {
                  if (!other.recordInfo_.isEmpty()) {
                     if (this.recordInfo_.isEmpty()) {
                        this.recordInfo_ = other.recordInfo_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureRecordInfoIsMutable();
                        this.recordInfo_.addAll(other.recordInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.recordInfo_.isEmpty()) {
                  if (this.recordInfoBuilder_.isEmpty()) {
                     this.recordInfoBuilder_.dispose();
                     this.recordInfoBuilder_ = null;
                     this.recordInfo_ = other.recordInfo_;
                     this.bitField0_ &= -2;
                     this.recordInfoBuilder_ = UnionOfferMsg.S2C_Record_14612.alwaysUseFieldBuilders ? this.getRecordInfoFieldBuilder() : null;
                  } else {
                     this.recordInfoBuilder_.addAllMessages(other.recordInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getRecordInfoCount(); ++i) {
               if (!this.getRecordInfo(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Record_14612 parsedMessage = null;

            try {
               parsedMessage = (S2C_Record_14612)UnionOfferMsg.S2C_Record_14612.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Record_14612)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRecordInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.recordInfo_ = new ArrayList(this.recordInfo_);
               this.bitField0_ |= 1;
            }

         }

         public List<RecordInfo> getRecordInfoList() {
            return this.recordInfoBuilder_ == null ? Collections.unmodifiableList(this.recordInfo_) : this.recordInfoBuilder_.getMessageList();
         }

         public int getRecordInfoCount() {
            return this.recordInfoBuilder_ == null ? this.recordInfo_.size() : this.recordInfoBuilder_.getCount();
         }

         public RecordInfo getRecordInfo(int index) {
            return this.recordInfoBuilder_ == null ? (RecordInfo)this.recordInfo_.get(index) : (RecordInfo)this.recordInfoBuilder_.getMessage(index);
         }

         public Builder setRecordInfo(int index, RecordInfo value) {
            if (this.recordInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordInfoIsMutable();
               this.recordInfo_.set(index, value);
               this.onChanged();
            } else {
               this.recordInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRecordInfo(int index, RecordInfo.Builder builderForValue) {
            if (this.recordInfoBuilder_ == null) {
               this.ensureRecordInfoIsMutable();
               this.recordInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRecordInfo(RecordInfo value) {
            if (this.recordInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordInfoIsMutable();
               this.recordInfo_.add(value);
               this.onChanged();
            } else {
               this.recordInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRecordInfo(int index, RecordInfo value) {
            if (this.recordInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRecordInfoIsMutable();
               this.recordInfo_.add(index, value);
               this.onChanged();
            } else {
               this.recordInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRecordInfo(RecordInfo.Builder builderForValue) {
            if (this.recordInfoBuilder_ == null) {
               this.ensureRecordInfoIsMutable();
               this.recordInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.recordInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRecordInfo(int index, RecordInfo.Builder builderForValue) {
            if (this.recordInfoBuilder_ == null) {
               this.ensureRecordInfoIsMutable();
               this.recordInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.recordInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRecordInfo(Iterable<? extends RecordInfo> values) {
            if (this.recordInfoBuilder_ == null) {
               this.ensureRecordInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.recordInfo_);
               this.onChanged();
            } else {
               this.recordInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRecordInfo() {
            if (this.recordInfoBuilder_ == null) {
               this.recordInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.recordInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeRecordInfo(int index) {
            if (this.recordInfoBuilder_ == null) {
               this.ensureRecordInfoIsMutable();
               this.recordInfo_.remove(index);
               this.onChanged();
            } else {
               this.recordInfoBuilder_.remove(index);
            }

            return this;
         }

         public RecordInfo.Builder getRecordInfoBuilder(int index) {
            return (RecordInfo.Builder)this.getRecordInfoFieldBuilder().getBuilder(index);
         }

         public RecordInfoOrBuilder getRecordInfoOrBuilder(int index) {
            return this.recordInfoBuilder_ == null ? (RecordInfoOrBuilder)this.recordInfo_.get(index) : (RecordInfoOrBuilder)this.recordInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RecordInfoOrBuilder> getRecordInfoOrBuilderList() {
            return this.recordInfoBuilder_ != null ? this.recordInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.recordInfo_);
         }

         public RecordInfo.Builder addRecordInfoBuilder() {
            return (RecordInfo.Builder)this.getRecordInfoFieldBuilder().addBuilder(UnionOfferMsg.RecordInfo.getDefaultInstance());
         }

         public RecordInfo.Builder addRecordInfoBuilder(int index) {
            return (RecordInfo.Builder)this.getRecordInfoFieldBuilder().addBuilder(index, UnionOfferMsg.RecordInfo.getDefaultInstance());
         }

         public List<RecordInfo.Builder> getRecordInfoBuilderList() {
            return this.getRecordInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RecordInfo, RecordInfo.Builder, RecordInfoOrBuilder> getRecordInfoFieldBuilder() {
            if (this.recordInfoBuilder_ == null) {
               this.recordInfoBuilder_ = new RepeatedFieldBuilderV3(this.recordInfo_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.recordInfo_ = null;
            }

            return this.recordInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_ShopLv_14613 extends GeneratedMessageV3 implements C2S_ShopLv_14613OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ShopLv_14613 DEFAULT_INSTANCE = new C2S_ShopLv_14613();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ShopLv_14613> PARSER = new AbstractParser<C2S_ShopLv_14613>() {
         public C2S_ShopLv_14613 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ShopLv_14613(input, extensionRegistry);
         }
      };

      private C2S_ShopLv_14613(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ShopLv_14613() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ShopLv_14613();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ShopLv_14613(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_ShopLv_14613_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_ShopLv_14613_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopLv_14613.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ShopLv_14613)) {
            return super.equals(obj);
         } else {
            C2S_ShopLv_14613 other = (C2S_ShopLv_14613)obj;
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

      public static C2S_ShopLv_14613 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ShopLv_14613)PARSER.parseFrom(data);
      }

      public static C2S_ShopLv_14613 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopLv_14613)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopLv_14613 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ShopLv_14613)PARSER.parseFrom(data);
      }

      public static C2S_ShopLv_14613 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopLv_14613)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopLv_14613 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ShopLv_14613)PARSER.parseFrom(data);
      }

      public static C2S_ShopLv_14613 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShopLv_14613)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShopLv_14613 parseFrom(InputStream input) throws IOException {
         return (C2S_ShopLv_14613)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopLv_14613 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopLv_14613)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopLv_14613 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ShopLv_14613)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ShopLv_14613 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopLv_14613)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShopLv_14613 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ShopLv_14613)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShopLv_14613 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShopLv_14613)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ShopLv_14613 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ShopLv_14613 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ShopLv_14613> parser() {
         return PARSER;
      }

      public Parser<C2S_ShopLv_14613> getParserForType() {
         return PARSER;
      }

      public C2S_ShopLv_14613 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ShopLv_14613OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_ShopLv_14613_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_ShopLv_14613_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShopLv_14613.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionOfferMsg.C2S_ShopLv_14613.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_ShopLv_14613_descriptor;
         }

         public C2S_ShopLv_14613 getDefaultInstanceForType() {
            return UnionOfferMsg.C2S_ShopLv_14613.getDefaultInstance();
         }

         public C2S_ShopLv_14613 build() {
            C2S_ShopLv_14613 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ShopLv_14613 buildPartial() {
            C2S_ShopLv_14613 result = new C2S_ShopLv_14613(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ShopLv_14613) {
               return this.mergeFrom((C2S_ShopLv_14613)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ShopLv_14613 other) {
            if (other == UnionOfferMsg.C2S_ShopLv_14613.getDefaultInstance()) {
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
            C2S_ShopLv_14613 parsedMessage = null;

            try {
               parsedMessage = (C2S_ShopLv_14613)UnionOfferMsg.C2S_ShopLv_14613.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ShopLv_14613)e.getUnfinishedMessage();
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

   public static final class S2C_ShopLv_14614 extends GeneratedMessageV3 implements S2C_ShopLv_14614OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POINT_FIELD_NUMBER = 1;
      private int point_;
      public static final int SHOPLV_FIELD_NUMBER = 2;
      private int shopLv_;
      private byte memoizedIsInitialized;
      private static final S2C_ShopLv_14614 DEFAULT_INSTANCE = new S2C_ShopLv_14614();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ShopLv_14614> PARSER = new AbstractParser<S2C_ShopLv_14614>() {
         public S2C_ShopLv_14614 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ShopLv_14614(input, extensionRegistry);
         }
      };

      private S2C_ShopLv_14614(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ShopLv_14614() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ShopLv_14614();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ShopLv_14614(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.point_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.shopLv_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_ShopLv_14614_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_ShopLv_14614_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopLv_14614.class, Builder.class);
      }

      public boolean hasPoint() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPoint() {
         return this.point_;
      }

      public boolean hasShopLv() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getShopLv() {
         return this.shopLv_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPoint()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasShopLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.point_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.shopLv_);
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
               size += CodedOutputStream.computeInt32Size(1, this.point_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.shopLv_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ShopLv_14614)) {
            return super.equals(obj);
         } else {
            S2C_ShopLv_14614 other = (S2C_ShopLv_14614)obj;
            if (this.hasPoint() != other.hasPoint()) {
               return false;
            } else if (this.hasPoint() && this.getPoint() != other.getPoint()) {
               return false;
            } else if (this.hasShopLv() != other.hasShopLv()) {
               return false;
            } else if (this.hasShopLv() && this.getShopLv() != other.getShopLv()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPoint()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPoint();
            }

            if (this.hasShopLv()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getShopLv();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ShopLv_14614 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ShopLv_14614)PARSER.parseFrom(data);
      }

      public static S2C_ShopLv_14614 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopLv_14614)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopLv_14614 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ShopLv_14614)PARSER.parseFrom(data);
      }

      public static S2C_ShopLv_14614 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopLv_14614)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopLv_14614 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ShopLv_14614)PARSER.parseFrom(data);
      }

      public static S2C_ShopLv_14614 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShopLv_14614)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShopLv_14614 parseFrom(InputStream input) throws IOException {
         return (S2C_ShopLv_14614)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopLv_14614 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopLv_14614)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopLv_14614 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ShopLv_14614)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ShopLv_14614 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopLv_14614)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShopLv_14614 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ShopLv_14614)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShopLv_14614 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShopLv_14614)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ShopLv_14614 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ShopLv_14614 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ShopLv_14614> parser() {
         return PARSER;
      }

      public Parser<S2C_ShopLv_14614> getParserForType() {
         return PARSER;
      }

      public S2C_ShopLv_14614 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ShopLv_14614OrBuilder {
         private int bitField0_;
         private int point_;
         private int shopLv_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_ShopLv_14614_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_ShopLv_14614_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShopLv_14614.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionOfferMsg.S2C_ShopLv_14614.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.point_ = 0;
            this.bitField0_ &= -2;
            this.shopLv_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_ShopLv_14614_descriptor;
         }

         public S2C_ShopLv_14614 getDefaultInstanceForType() {
            return UnionOfferMsg.S2C_ShopLv_14614.getDefaultInstance();
         }

         public S2C_ShopLv_14614 build() {
            S2C_ShopLv_14614 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ShopLv_14614 buildPartial() {
            S2C_ShopLv_14614 result = new S2C_ShopLv_14614(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.point_ = this.point_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.shopLv_ = this.shopLv_;
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
            if (other instanceof S2C_ShopLv_14614) {
               return this.mergeFrom((S2C_ShopLv_14614)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ShopLv_14614 other) {
            if (other == UnionOfferMsg.S2C_ShopLv_14614.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPoint()) {
                  this.setPoint(other.getPoint());
               }

               if (other.hasShopLv()) {
                  this.setShopLv(other.getShopLv());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPoint()) {
               return false;
            } else {
               return this.hasShopLv();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ShopLv_14614 parsedMessage = null;

            try {
               parsedMessage = (S2C_ShopLv_14614)UnionOfferMsg.S2C_ShopLv_14614.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ShopLv_14614)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPoint() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPoint() {
            return this.point_;
         }

         public Builder setPoint(int value) {
            this.bitField0_ |= 1;
            this.point_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPoint() {
            this.bitField0_ &= -2;
            this.point_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasShopLv() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getShopLv() {
            return this.shopLv_;
         }

         public Builder setShopLv(int value) {
            this.bitField0_ |= 2;
            this.shopLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShopLv() {
            this.bitField0_ &= -3;
            this.shopLv_ = 0;
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

   public static final class C2S_OfferDetail_14615 extends GeneratedMessageV3 implements C2S_OfferDetail_14615OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      private byte memoizedIsInitialized;
      private static final C2S_OfferDetail_14615 DEFAULT_INSTANCE = new C2S_OfferDetail_14615();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OfferDetail_14615> PARSER = new AbstractParser<C2S_OfferDetail_14615>() {
         public C2S_OfferDetail_14615 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OfferDetail_14615(input, extensionRegistry);
         }
      };

      private C2S_OfferDetail_14615(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OfferDetail_14615() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OfferDetail_14615();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OfferDetail_14615(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_OfferDetail_14615_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_OfferDetail_14615_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OfferDetail_14615.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OfferDetail_14615)) {
            return super.equals(obj);
         } else {
            C2S_OfferDetail_14615 other = (C2S_OfferDetail_14615)obj;
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

      public static C2S_OfferDetail_14615 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OfferDetail_14615)PARSER.parseFrom(data);
      }

      public static C2S_OfferDetail_14615 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OfferDetail_14615)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OfferDetail_14615 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OfferDetail_14615)PARSER.parseFrom(data);
      }

      public static C2S_OfferDetail_14615 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OfferDetail_14615)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OfferDetail_14615 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OfferDetail_14615)PARSER.parseFrom(data);
      }

      public static C2S_OfferDetail_14615 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OfferDetail_14615)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OfferDetail_14615 parseFrom(InputStream input) throws IOException {
         return (C2S_OfferDetail_14615)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OfferDetail_14615 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OfferDetail_14615)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OfferDetail_14615 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OfferDetail_14615)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OfferDetail_14615 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OfferDetail_14615)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OfferDetail_14615 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OfferDetail_14615)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OfferDetail_14615 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OfferDetail_14615)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OfferDetail_14615 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OfferDetail_14615 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OfferDetail_14615> parser() {
         return PARSER;
      }

      public Parser<C2S_OfferDetail_14615> getParserForType() {
         return PARSER;
      }

      public C2S_OfferDetail_14615 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OfferDetail_14615OrBuilder {
         private int bitField0_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_OfferDetail_14615_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_OfferDetail_14615_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OfferDetail_14615.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionOfferMsg.C2S_OfferDetail_14615.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_OfferDetail_14615_descriptor;
         }

         public C2S_OfferDetail_14615 getDefaultInstanceForType() {
            return UnionOfferMsg.C2S_OfferDetail_14615.getDefaultInstance();
         }

         public C2S_OfferDetail_14615 build() {
            C2S_OfferDetail_14615 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OfferDetail_14615 buildPartial() {
            C2S_OfferDetail_14615 result = new C2S_OfferDetail_14615(this);
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
            if (other instanceof C2S_OfferDetail_14615) {
               return this.mergeFrom((C2S_OfferDetail_14615)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OfferDetail_14615 other) {
            if (other == UnionOfferMsg.C2S_OfferDetail_14615.getDefaultInstance()) {
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
            C2S_OfferDetail_14615 parsedMessage = null;

            try {
               parsedMessage = (C2S_OfferDetail_14615)UnionOfferMsg.C2S_OfferDetail_14615.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OfferDetail_14615)e.getUnfinishedMessage();
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

   public static final class S2C_OfferDetail_14616 extends GeneratedMessageV3 implements S2C_OfferDetail_14616OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      public static final int CREATETIME_FIELD_NUMBER = 2;
      private int createTime_;
      public static final int CURHP_FIELD_NUMBER = 3;
      private long curHp_;
      public static final int TOTALHP_FIELD_NUMBER = 4;
      private long totalHp_;
      public static final int SERVERID_FIELD_NUMBER = 5;
      private int serverId_;
      public static final int UNIONID_FIELD_NUMBER = 6;
      private int unionId_;
      public static final int UNIONNAME_FIELD_NUMBER = 7;
      private volatile Object unionName_;
      public static final int OFFERHEROID_FIELD_NUMBER = 8;
      private int offerHeroId_;
      public static final int MYHURT_FIELD_NUMBER = 9;
      private long myHurt_;
      public static final int RANKS_FIELD_NUMBER = 10;
      private List<RankMsg.RankData> ranks_;
      public static final int MYRANK_FIELD_NUMBER = 11;
      private RankMsg.RankData myRank_;
      private byte memoizedIsInitialized;
      private static final S2C_OfferDetail_14616 DEFAULT_INSTANCE = new S2C_OfferDetail_14616();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OfferDetail_14616> PARSER = new AbstractParser<S2C_OfferDetail_14616>() {
         public S2C_OfferDetail_14616 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OfferDetail_14616(input, extensionRegistry);
         }
      };

      private S2C_OfferDetail_14616(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OfferDetail_14616() {
         this.memoizedIsInitialized = -1;
         this.unionName_ = "";
         this.ranks_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OfferDetail_14616();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OfferDetail_14616(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.createTime_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.curHp_ = input.readInt64();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.totalHp_ = input.readInt64();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.serverId_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.unionId_ = input.readInt32();
                        break;
                     case 58:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 64;
                        this.unionName_ = bs;
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.offerHeroId_ = input.readInt32();
                        break;
                     case 72:
                        this.bitField0_ |= 256;
                        this.myHurt_ = input.readInt64();
                        break;
                     case 82:
                        if ((mutable_bitField0_ & 512) == 0) {
                           this.ranks_ = new ArrayList();
                           mutable_bitField0_ |= 512;
                        }

                        this.ranks_.add(input.readMessage(RankMsg.RankData.PARSER, extensionRegistry));
                        break;
                     case 90:
                        RankMsg.RankData.Builder subBuilder = null;
                        if ((this.bitField0_ & 512) != 0) {
                           subBuilder = this.myRank_.toBuilder();
                        }

                        this.myRank_ = (RankMsg.RankData)input.readMessage(RankMsg.RankData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.myRank_);
                           this.myRank_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 512;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 512) != 0) {
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_OfferDetail_14616_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_OfferDetail_14616_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OfferDetail_14616.class, Builder.class);
      }

      public boolean hasCode() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCode() {
         return this.code_;
      }

      public boolean hasCreateTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getCreateTime() {
         return this.createTime_;
      }

      public boolean hasCurHp() {
         return (this.bitField0_ & 4) != 0;
      }

      public long getCurHp() {
         return this.curHp_;
      }

      public boolean hasTotalHp() {
         return (this.bitField0_ & 8) != 0;
      }

      public long getTotalHp() {
         return this.totalHp_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasUnionId() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getUnionId() {
         return this.unionId_;
      }

      public boolean hasUnionName() {
         return (this.bitField0_ & 64) != 0;
      }

      public String getUnionName() {
         Object ref = this.unionName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.unionName_ = s;
            }

            return s;
         }
      }

      public ByteString getUnionNameBytes() {
         Object ref = this.unionName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.unionName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasOfferHeroId() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getOfferHeroId() {
         return this.offerHeroId_;
      }

      public boolean hasMyHurt() {
         return (this.bitField0_ & 256) != 0;
      }

      public long getMyHurt() {
         return this.myHurt_;
      }

      public List<RankMsg.RankData> getRanksList() {
         return this.ranks_;
      }

      public List<? extends RankMsg.RankDataOrBuilder> getRanksOrBuilderList() {
         return this.ranks_;
      }

      public int getRanksCount() {
         return this.ranks_.size();
      }

      public RankMsg.RankData getRanks(int index) {
         return (RankMsg.RankData)this.ranks_.get(index);
      }

      public RankMsg.RankDataOrBuilder getRanksOrBuilder(int index) {
         return (RankMsg.RankDataOrBuilder)this.ranks_.get(index);
      }

      public boolean hasMyRank() {
         return (this.bitField0_ & 512) != 0;
      }

      public RankMsg.RankData getMyRank() {
         return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
      }

      public RankMsg.RankDataOrBuilder getMyRankOrBuilder() {
         return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
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
         } else if (!this.hasCreateTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCurHp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTotalHp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOfferHeroId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMyHurt()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getRanksCount(); ++i) {
               if (!this.getRanks(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            if (this.hasMyRank() && !this.getMyRank().isInitialized()) {
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
            output.writeInt32(1, this.code_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.createTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt64(3, this.curHp_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt64(4, this.totalHp_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.serverId_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.unionId_);
         }

         if ((this.bitField0_ & 64) != 0) {
            GeneratedMessageV3.writeString(output, 7, this.unionName_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.offerHeroId_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt64(9, this.myHurt_);
         }

         for(int i = 0; i < this.ranks_.size(); ++i) {
            output.writeMessage(10, (MessageLite)this.ranks_.get(i));
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeMessage(11, this.getMyRank());
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
               size += CodedOutputStream.computeInt32Size(2, this.createTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt64Size(3, this.curHp_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt64Size(4, this.totalHp_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.serverId_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.unionId_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += GeneratedMessageV3.computeStringSize(7, this.unionName_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.offerHeroId_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt64Size(9, this.myHurt_);
            }

            for(int i = 0; i < this.ranks_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(10, (MessageLite)this.ranks_.get(i));
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeMessageSize(11, this.getMyRank());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_OfferDetail_14616)) {
            return super.equals(obj);
         } else {
            S2C_OfferDetail_14616 other = (S2C_OfferDetail_14616)obj;
            if (this.hasCode() != other.hasCode()) {
               return false;
            } else if (this.hasCode() && this.getCode() != other.getCode()) {
               return false;
            } else if (this.hasCreateTime() != other.hasCreateTime()) {
               return false;
            } else if (this.hasCreateTime() && this.getCreateTime() != other.getCreateTime()) {
               return false;
            } else if (this.hasCurHp() != other.hasCurHp()) {
               return false;
            } else if (this.hasCurHp() && this.getCurHp() != other.getCurHp()) {
               return false;
            } else if (this.hasTotalHp() != other.hasTotalHp()) {
               return false;
            } else if (this.hasTotalHp() && this.getTotalHp() != other.getTotalHp()) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasUnionId() != other.hasUnionId()) {
               return false;
            } else if (this.hasUnionId() && this.getUnionId() != other.getUnionId()) {
               return false;
            } else if (this.hasUnionName() != other.hasUnionName()) {
               return false;
            } else if (this.hasUnionName() && !this.getUnionName().equals(other.getUnionName())) {
               return false;
            } else if (this.hasOfferHeroId() != other.hasOfferHeroId()) {
               return false;
            } else if (this.hasOfferHeroId() && this.getOfferHeroId() != other.getOfferHeroId()) {
               return false;
            } else if (this.hasMyHurt() != other.hasMyHurt()) {
               return false;
            } else if (this.hasMyHurt() && this.getMyHurt() != other.getMyHurt()) {
               return false;
            } else if (!this.getRanksList().equals(other.getRanksList())) {
               return false;
            } else if (this.hasMyRank() != other.hasMyRank()) {
               return false;
            } else if (this.hasMyRank() && !this.getMyRank().equals(other.getMyRank())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasCreateTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCreateTime();
            }

            if (this.hasCurHp()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashLong(this.getCurHp());
            }

            if (this.hasTotalHp()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + Internal.hashLong(this.getTotalHp());
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasUnionId()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getUnionId();
            }

            if (this.hasUnionName()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getUnionName().hashCode();
            }

            if (this.hasOfferHeroId()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getOfferHeroId();
            }

            if (this.hasMyHurt()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + Internal.hashLong(this.getMyHurt());
            }

            if (this.getRanksCount() > 0) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getRanksList().hashCode();
            }

            if (this.hasMyRank()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getMyRank().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_OfferDetail_14616 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OfferDetail_14616)PARSER.parseFrom(data);
      }

      public static S2C_OfferDetail_14616 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OfferDetail_14616)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OfferDetail_14616 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OfferDetail_14616)PARSER.parseFrom(data);
      }

      public static S2C_OfferDetail_14616 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OfferDetail_14616)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OfferDetail_14616 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OfferDetail_14616)PARSER.parseFrom(data);
      }

      public static S2C_OfferDetail_14616 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OfferDetail_14616)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OfferDetail_14616 parseFrom(InputStream input) throws IOException {
         return (S2C_OfferDetail_14616)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OfferDetail_14616 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OfferDetail_14616)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OfferDetail_14616 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OfferDetail_14616)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OfferDetail_14616 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OfferDetail_14616)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OfferDetail_14616 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OfferDetail_14616)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OfferDetail_14616 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OfferDetail_14616)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OfferDetail_14616 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OfferDetail_14616 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OfferDetail_14616> parser() {
         return PARSER;
      }

      public Parser<S2C_OfferDetail_14616> getParserForType() {
         return PARSER;
      }

      public S2C_OfferDetail_14616 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OfferDetail_14616OrBuilder {
         private int bitField0_;
         private int code_;
         private int createTime_;
         private long curHp_;
         private long totalHp_;
         private int serverId_;
         private int unionId_;
         private Object unionName_;
         private int offerHeroId_;
         private long myHurt_;
         private List<RankMsg.RankData> ranks_;
         private RepeatedFieldBuilderV3<RankMsg.RankData, RankMsg.RankData.Builder, RankMsg.RankDataOrBuilder> ranksBuilder_;
         private RankMsg.RankData myRank_;
         private SingleFieldBuilderV3<RankMsg.RankData, RankMsg.RankData.Builder, RankMsg.RankDataOrBuilder> myRankBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_OfferDetail_14616_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_OfferDetail_14616_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OfferDetail_14616.class, Builder.class);
         }

         private Builder() {
            this.unionName_ = "";
            this.ranks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.unionName_ = "";
            this.ranks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionOfferMsg.S2C_OfferDetail_14616.alwaysUseFieldBuilders) {
               this.getRanksFieldBuilder();
               this.getMyRankFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            this.createTime_ = 0;
            this.bitField0_ &= -3;
            this.curHp_ = 0L;
            this.bitField0_ &= -5;
            this.totalHp_ = 0L;
            this.bitField0_ &= -9;
            this.serverId_ = 0;
            this.bitField0_ &= -17;
            this.unionId_ = 0;
            this.bitField0_ &= -33;
            this.unionName_ = "";
            this.bitField0_ &= -65;
            this.offerHeroId_ = 0;
            this.bitField0_ &= -129;
            this.myHurt_ = 0L;
            this.bitField0_ &= -257;
            if (this.ranksBuilder_ == null) {
               this.ranks_ = Collections.emptyList();
               this.bitField0_ &= -513;
            } else {
               this.ranksBuilder_.clear();
            }

            if (this.myRankBuilder_ == null) {
               this.myRank_ = null;
            } else {
               this.myRankBuilder_.clear();
            }

            this.bitField0_ &= -1025;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_OfferDetail_14616_descriptor;
         }

         public S2C_OfferDetail_14616 getDefaultInstanceForType() {
            return UnionOfferMsg.S2C_OfferDetail_14616.getDefaultInstance();
         }

         public S2C_OfferDetail_14616 build() {
            S2C_OfferDetail_14616 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OfferDetail_14616 buildPartial() {
            S2C_OfferDetail_14616 result = new S2C_OfferDetail_14616(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.code_ = this.code_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.createTime_ = this.createTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.curHp_ = this.curHp_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.totalHp_ = this.totalHp_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.unionId_ = this.unionId_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               to_bitField0_ |= 64;
            }

            result.unionName_ = this.unionName_;
            if ((from_bitField0_ & 128) != 0) {
               result.offerHeroId_ = this.offerHeroId_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.myHurt_ = this.myHurt_;
               to_bitField0_ |= 256;
            }

            if (this.ranksBuilder_ == null) {
               if ((this.bitField0_ & 512) != 0) {
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
                  this.bitField0_ &= -513;
               }

               result.ranks_ = this.ranks_;
            } else {
               result.ranks_ = this.ranksBuilder_.build();
            }

            if ((from_bitField0_ & 1024) != 0) {
               if (this.myRankBuilder_ == null) {
                  result.myRank_ = this.myRank_;
               } else {
                  result.myRank_ = (RankMsg.RankData)this.myRankBuilder_.build();
               }

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
            if (other instanceof S2C_OfferDetail_14616) {
               return this.mergeFrom((S2C_OfferDetail_14616)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OfferDetail_14616 other) {
            if (other == UnionOfferMsg.S2C_OfferDetail_14616.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCode()) {
                  this.setCode(other.getCode());
               }

               if (other.hasCreateTime()) {
                  this.setCreateTime(other.getCreateTime());
               }

               if (other.hasCurHp()) {
                  this.setCurHp(other.getCurHp());
               }

               if (other.hasTotalHp()) {
                  this.setTotalHp(other.getTotalHp());
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasUnionId()) {
                  this.setUnionId(other.getUnionId());
               }

               if (other.hasUnionName()) {
                  this.bitField0_ |= 64;
                  this.unionName_ = other.unionName_;
                  this.onChanged();
               }

               if (other.hasOfferHeroId()) {
                  this.setOfferHeroId(other.getOfferHeroId());
               }

               if (other.hasMyHurt()) {
                  this.setMyHurt(other.getMyHurt());
               }

               if (this.ranksBuilder_ == null) {
                  if (!other.ranks_.isEmpty()) {
                     if (this.ranks_.isEmpty()) {
                        this.ranks_ = other.ranks_;
                        this.bitField0_ &= -513;
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
                     this.bitField0_ &= -513;
                     this.ranksBuilder_ = UnionOfferMsg.S2C_OfferDetail_14616.alwaysUseFieldBuilders ? this.getRanksFieldBuilder() : null;
                  } else {
                     this.ranksBuilder_.addAllMessages(other.ranks_);
                  }
               }

               if (other.hasMyRank()) {
                  this.mergeMyRank(other.getMyRank());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCode()) {
               return false;
            } else if (!this.hasCreateTime()) {
               return false;
            } else if (!this.hasCurHp()) {
               return false;
            } else if (!this.hasTotalHp()) {
               return false;
            } else if (!this.hasOfferHeroId()) {
               return false;
            } else if (!this.hasMyHurt()) {
               return false;
            } else {
               for(int i = 0; i < this.getRanksCount(); ++i) {
                  if (!this.getRanks(i).isInitialized()) {
                     return false;
                  }
               }

               if (this.hasMyRank() && !this.getMyRank().isInitialized()) {
                  return false;
               } else {
                  return true;
               }
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_OfferDetail_14616 parsedMessage = null;

            try {
               parsedMessage = (S2C_OfferDetail_14616)UnionOfferMsg.S2C_OfferDetail_14616.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OfferDetail_14616)e.getUnfinishedMessage();
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

         public boolean hasCreateTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getCreateTime() {
            return this.createTime_;
         }

         public Builder setCreateTime(int value) {
            this.bitField0_ |= 2;
            this.createTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCreateTime() {
            this.bitField0_ &= -3;
            this.createTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCurHp() {
            return (this.bitField0_ & 4) != 0;
         }

         public long getCurHp() {
            return this.curHp_;
         }

         public Builder setCurHp(long value) {
            this.bitField0_ |= 4;
            this.curHp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCurHp() {
            this.bitField0_ &= -5;
            this.curHp_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasTotalHp() {
            return (this.bitField0_ & 8) != 0;
         }

         public long getTotalHp() {
            return this.totalHp_;
         }

         public Builder setTotalHp(long value) {
            this.bitField0_ |= 8;
            this.totalHp_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTotalHp() {
            this.bitField0_ &= -9;
            this.totalHp_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 16;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -17;
            this.serverId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnionId() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getUnionId() {
            return this.unionId_;
         }

         public Builder setUnionId(int value) {
            this.bitField0_ |= 32;
            this.unionId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionId() {
            this.bitField0_ &= -33;
            this.unionId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnionName() {
            return (this.bitField0_ & 64) != 0;
         }

         public String getUnionName() {
            Object ref = this.unionName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.unionName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getUnionNameBytes() {
            Object ref = this.unionName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.unionName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setUnionName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 64;
               this.unionName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearUnionName() {
            this.bitField0_ &= -65;
            this.unionName_ = UnionOfferMsg.S2C_OfferDetail_14616.getDefaultInstance().getUnionName();
            this.onChanged();
            return this;
         }

         public Builder setUnionNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 64;
               this.unionName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasOfferHeroId() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getOfferHeroId() {
            return this.offerHeroId_;
         }

         public Builder setOfferHeroId(int value) {
            this.bitField0_ |= 128;
            this.offerHeroId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOfferHeroId() {
            this.bitField0_ &= -129;
            this.offerHeroId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMyHurt() {
            return (this.bitField0_ & 256) != 0;
         }

         public long getMyHurt() {
            return this.myHurt_;
         }

         public Builder setMyHurt(long value) {
            this.bitField0_ |= 256;
            this.myHurt_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMyHurt() {
            this.bitField0_ &= -257;
            this.myHurt_ = 0L;
            this.onChanged();
            return this;
         }

         private void ensureRanksIsMutable() {
            if ((this.bitField0_ & 512) == 0) {
               this.ranks_ = new ArrayList(this.ranks_);
               this.bitField0_ |= 512;
            }

         }

         public List<RankMsg.RankData> getRanksList() {
            return this.ranksBuilder_ == null ? Collections.unmodifiableList(this.ranks_) : this.ranksBuilder_.getMessageList();
         }

         public int getRanksCount() {
            return this.ranksBuilder_ == null ? this.ranks_.size() : this.ranksBuilder_.getCount();
         }

         public RankMsg.RankData getRanks(int index) {
            return this.ranksBuilder_ == null ? (RankMsg.RankData)this.ranks_.get(index) : (RankMsg.RankData)this.ranksBuilder_.getMessage(index);
         }

         public Builder setRanks(int index, RankMsg.RankData value) {
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

         public Builder setRanks(int index, RankMsg.RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(RankMsg.RankData value) {
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

         public Builder addRanks(int index, RankMsg.RankData value) {
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

         public Builder addRanks(RankMsg.RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(int index, RankMsg.RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRanks(Iterable<? extends RankMsg.RankData> values) {
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
               this.bitField0_ &= -513;
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

         public RankMsg.RankData.Builder getRanksBuilder(int index) {
            return (RankMsg.RankData.Builder)this.getRanksFieldBuilder().getBuilder(index);
         }

         public RankMsg.RankDataOrBuilder getRanksOrBuilder(int index) {
            return this.ranksBuilder_ == null ? (RankMsg.RankDataOrBuilder)this.ranks_.get(index) : (RankMsg.RankDataOrBuilder)this.ranksBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankMsg.RankDataOrBuilder> getRanksOrBuilderList() {
            return this.ranksBuilder_ != null ? this.ranksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.ranks_);
         }

         public RankMsg.RankData.Builder addRanksBuilder() {
            return (RankMsg.RankData.Builder)this.getRanksFieldBuilder().addBuilder(RankMsg.RankData.getDefaultInstance());
         }

         public RankMsg.RankData.Builder addRanksBuilder(int index) {
            return (RankMsg.RankData.Builder)this.getRanksFieldBuilder().addBuilder(index, RankMsg.RankData.getDefaultInstance());
         }

         public List<RankMsg.RankData.Builder> getRanksBuilderList() {
            return this.getRanksFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankMsg.RankData, RankMsg.RankData.Builder, RankMsg.RankDataOrBuilder> getRanksFieldBuilder() {
            if (this.ranksBuilder_ == null) {
               this.ranksBuilder_ = new RepeatedFieldBuilderV3(this.ranks_, (this.bitField0_ & 512) != 0, this.getParentForChildren(), this.isClean());
               this.ranks_ = null;
            }

            return this.ranksBuilder_;
         }

         public boolean hasMyRank() {
            return (this.bitField0_ & 1024) != 0;
         }

         public RankMsg.RankData getMyRank() {
            if (this.myRankBuilder_ == null) {
               return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
            } else {
               return (RankMsg.RankData)this.myRankBuilder_.getMessage();
            }
         }

         public Builder setMyRank(RankMsg.RankData value) {
            if (this.myRankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.myRank_ = value;
               this.onChanged();
            } else {
               this.myRankBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1024;
            return this;
         }

         public Builder setMyRank(RankMsg.RankData.Builder builderForValue) {
            if (this.myRankBuilder_ == null) {
               this.myRank_ = builderForValue.build();
               this.onChanged();
            } else {
               this.myRankBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1024;
            return this;
         }

         public Builder mergeMyRank(RankMsg.RankData value) {
            if (this.myRankBuilder_ == null) {
               if ((this.bitField0_ & 1024) != 0 && this.myRank_ != null && this.myRank_ != RankMsg.RankData.getDefaultInstance()) {
                  this.myRank_ = RankMsg.RankData.newBuilder(this.myRank_).mergeFrom(value).buildPartial();
               } else {
                  this.myRank_ = value;
               }

               this.onChanged();
            } else {
               this.myRankBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1024;
            return this;
         }

         public Builder clearMyRank() {
            if (this.myRankBuilder_ == null) {
               this.myRank_ = null;
               this.onChanged();
            } else {
               this.myRankBuilder_.clear();
            }

            this.bitField0_ &= -1025;
            return this;
         }

         public RankMsg.RankData.Builder getMyRankBuilder() {
            this.bitField0_ |= 1024;
            this.onChanged();
            return (RankMsg.RankData.Builder)this.getMyRankFieldBuilder().getBuilder();
         }

         public RankMsg.RankDataOrBuilder getMyRankOrBuilder() {
            if (this.myRankBuilder_ != null) {
               return (RankMsg.RankDataOrBuilder)this.myRankBuilder_.getMessageOrBuilder();
            } else {
               return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
            }
         }

         private SingleFieldBuilderV3<RankMsg.RankData, RankMsg.RankData.Builder, RankMsg.RankDataOrBuilder> getMyRankFieldBuilder() {
            if (this.myRankBuilder_ == null) {
               this.myRankBuilder_ = new SingleFieldBuilderV3(this.getMyRank(), this.getParentForChildren(), this.isClean());
               this.myRank_ = null;
            }

            return this.myRankBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_DamageRank_14617 extends GeneratedMessageV3 implements C2S_DamageRank_14617OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CODE_FIELD_NUMBER = 1;
      private int code_;
      private byte memoizedIsInitialized;
      private static final C2S_DamageRank_14617 DEFAULT_INSTANCE = new C2S_DamageRank_14617();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DamageRank_14617> PARSER = new AbstractParser<C2S_DamageRank_14617>() {
         public C2S_DamageRank_14617 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DamageRank_14617(input, extensionRegistry);
         }
      };

      private C2S_DamageRank_14617(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DamageRank_14617() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DamageRank_14617();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DamageRank_14617(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_DamageRank_14617_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_DamageRank_14617_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DamageRank_14617.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DamageRank_14617)) {
            return super.equals(obj);
         } else {
            C2S_DamageRank_14617 other = (C2S_DamageRank_14617)obj;
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

      public static C2S_DamageRank_14617 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DamageRank_14617)PARSER.parseFrom(data);
      }

      public static C2S_DamageRank_14617 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DamageRank_14617)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DamageRank_14617 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DamageRank_14617)PARSER.parseFrom(data);
      }

      public static C2S_DamageRank_14617 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DamageRank_14617)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DamageRank_14617 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DamageRank_14617)PARSER.parseFrom(data);
      }

      public static C2S_DamageRank_14617 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DamageRank_14617)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DamageRank_14617 parseFrom(InputStream input) throws IOException {
         return (C2S_DamageRank_14617)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DamageRank_14617 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DamageRank_14617)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DamageRank_14617 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DamageRank_14617)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DamageRank_14617 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DamageRank_14617)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DamageRank_14617 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DamageRank_14617)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DamageRank_14617 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DamageRank_14617)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DamageRank_14617 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DamageRank_14617 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DamageRank_14617> parser() {
         return PARSER;
      }

      public Parser<C2S_DamageRank_14617> getParserForType() {
         return PARSER;
      }

      public C2S_DamageRank_14617 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DamageRank_14617OrBuilder {
         private int bitField0_;
         private int code_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_DamageRank_14617_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_DamageRank_14617_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DamageRank_14617.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionOfferMsg.C2S_DamageRank_14617.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.code_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_DamageRank_14617_descriptor;
         }

         public C2S_DamageRank_14617 getDefaultInstanceForType() {
            return UnionOfferMsg.C2S_DamageRank_14617.getDefaultInstance();
         }

         public C2S_DamageRank_14617 build() {
            C2S_DamageRank_14617 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DamageRank_14617 buildPartial() {
            C2S_DamageRank_14617 result = new C2S_DamageRank_14617(this);
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
            if (other instanceof C2S_DamageRank_14617) {
               return this.mergeFrom((C2S_DamageRank_14617)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DamageRank_14617 other) {
            if (other == UnionOfferMsg.C2S_DamageRank_14617.getDefaultInstance()) {
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
            C2S_DamageRank_14617 parsedMessage = null;

            try {
               parsedMessage = (C2S_DamageRank_14617)UnionOfferMsg.C2S_DamageRank_14617.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DamageRank_14617)e.getUnfinishedMessage();
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

   public static final class S2C_DamageRank_14618 extends GeneratedMessageV3 implements S2C_DamageRank_14618OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANKS_FIELD_NUMBER = 1;
      private List<RankMsg.RankData> ranks_;
      public static final int MYRANK_FIELD_NUMBER = 2;
      private RankMsg.RankData myRank_;
      private byte memoizedIsInitialized;
      private static final S2C_DamageRank_14618 DEFAULT_INSTANCE = new S2C_DamageRank_14618();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DamageRank_14618> PARSER = new AbstractParser<S2C_DamageRank_14618>() {
         public S2C_DamageRank_14618 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DamageRank_14618(input, extensionRegistry);
         }
      };

      private S2C_DamageRank_14618(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DamageRank_14618() {
         this.memoizedIsInitialized = -1;
         this.ranks_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DamageRank_14618();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DamageRank_14618(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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

                        this.ranks_.add(input.readMessage(RankMsg.RankData.PARSER, extensionRegistry));
                        break;
                     case 18:
                        RankMsg.RankData.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.myRank_.toBuilder();
                        }

                        this.myRank_ = (RankMsg.RankData)input.readMessage(RankMsg.RankData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.myRank_);
                           this.myRank_ = subBuilder.buildPartial();
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
               if ((mutable_bitField0_ & 1) != 0) {
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_DamageRank_14618_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_DamageRank_14618_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DamageRank_14618.class, Builder.class);
      }

      public List<RankMsg.RankData> getRanksList() {
         return this.ranks_;
      }

      public List<? extends RankMsg.RankDataOrBuilder> getRanksOrBuilderList() {
         return this.ranks_;
      }

      public int getRanksCount() {
         return this.ranks_.size();
      }

      public RankMsg.RankData getRanks(int index) {
         return (RankMsg.RankData)this.ranks_.get(index);
      }

      public RankMsg.RankDataOrBuilder getRanksOrBuilder(int index) {
         return (RankMsg.RankDataOrBuilder)this.ranks_.get(index);
      }

      public boolean hasMyRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public RankMsg.RankData getMyRank() {
         return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
      }

      public RankMsg.RankDataOrBuilder getMyRankOrBuilder() {
         return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
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

            if (this.hasMyRank() && !this.getMyRank().isInitialized()) {
               this.memoizedIsInitialized = 0;
               return false;
            } else {
               this.memoizedIsInitialized = 1;
               return true;
            }
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.ranks_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.ranks_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(2, this.getMyRank());
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

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getMyRank());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DamageRank_14618)) {
            return super.equals(obj);
         } else {
            S2C_DamageRank_14618 other = (S2C_DamageRank_14618)obj;
            if (!this.getRanksList().equals(other.getRanksList())) {
               return false;
            } else if (this.hasMyRank() != other.hasMyRank()) {
               return false;
            } else if (this.hasMyRank() && !this.getMyRank().equals(other.getMyRank())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasMyRank()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMyRank().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DamageRank_14618 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DamageRank_14618)PARSER.parseFrom(data);
      }

      public static S2C_DamageRank_14618 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DamageRank_14618)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DamageRank_14618 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DamageRank_14618)PARSER.parseFrom(data);
      }

      public static S2C_DamageRank_14618 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DamageRank_14618)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DamageRank_14618 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DamageRank_14618)PARSER.parseFrom(data);
      }

      public static S2C_DamageRank_14618 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DamageRank_14618)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DamageRank_14618 parseFrom(InputStream input) throws IOException {
         return (S2C_DamageRank_14618)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DamageRank_14618 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DamageRank_14618)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DamageRank_14618 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DamageRank_14618)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DamageRank_14618 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DamageRank_14618)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DamageRank_14618 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DamageRank_14618)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DamageRank_14618 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DamageRank_14618)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DamageRank_14618 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DamageRank_14618 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DamageRank_14618> parser() {
         return PARSER;
      }

      public Parser<S2C_DamageRank_14618> getParserForType() {
         return PARSER;
      }

      public S2C_DamageRank_14618 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DamageRank_14618OrBuilder {
         private int bitField0_;
         private List<RankMsg.RankData> ranks_;
         private RepeatedFieldBuilderV3<RankMsg.RankData, RankMsg.RankData.Builder, RankMsg.RankDataOrBuilder> ranksBuilder_;
         private RankMsg.RankData myRank_;
         private SingleFieldBuilderV3<RankMsg.RankData, RankMsg.RankData.Builder, RankMsg.RankDataOrBuilder> myRankBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_DamageRank_14618_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_DamageRank_14618_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DamageRank_14618.class, Builder.class);
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
            if (UnionOfferMsg.S2C_DamageRank_14618.alwaysUseFieldBuilders) {
               this.getRanksFieldBuilder();
               this.getMyRankFieldBuilder();
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

            if (this.myRankBuilder_ == null) {
               this.myRank_ = null;
            } else {
               this.myRankBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_DamageRank_14618_descriptor;
         }

         public S2C_DamageRank_14618 getDefaultInstanceForType() {
            return UnionOfferMsg.S2C_DamageRank_14618.getDefaultInstance();
         }

         public S2C_DamageRank_14618 build() {
            S2C_DamageRank_14618 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DamageRank_14618 buildPartial() {
            S2C_DamageRank_14618 result = new S2C_DamageRank_14618(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.ranksBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
                  this.bitField0_ &= -2;
               }

               result.ranks_ = this.ranks_;
            } else {
               result.ranks_ = this.ranksBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.myRankBuilder_ == null) {
                  result.myRank_ = this.myRank_;
               } else {
                  result.myRank_ = (RankMsg.RankData)this.myRankBuilder_.build();
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
            if (other instanceof S2C_DamageRank_14618) {
               return this.mergeFrom((S2C_DamageRank_14618)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DamageRank_14618 other) {
            if (other == UnionOfferMsg.S2C_DamageRank_14618.getDefaultInstance()) {
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
                     this.ranksBuilder_ = UnionOfferMsg.S2C_DamageRank_14618.alwaysUseFieldBuilders ? this.getRanksFieldBuilder() : null;
                  } else {
                     this.ranksBuilder_.addAllMessages(other.ranks_);
                  }
               }

               if (other.hasMyRank()) {
                  this.mergeMyRank(other.getMyRank());
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

            if (this.hasMyRank() && !this.getMyRank().isInitialized()) {
               return false;
            } else {
               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DamageRank_14618 parsedMessage = null;

            try {
               parsedMessage = (S2C_DamageRank_14618)UnionOfferMsg.S2C_DamageRank_14618.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DamageRank_14618)e.getUnfinishedMessage();
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

         public List<RankMsg.RankData> getRanksList() {
            return this.ranksBuilder_ == null ? Collections.unmodifiableList(this.ranks_) : this.ranksBuilder_.getMessageList();
         }

         public int getRanksCount() {
            return this.ranksBuilder_ == null ? this.ranks_.size() : this.ranksBuilder_.getCount();
         }

         public RankMsg.RankData getRanks(int index) {
            return this.ranksBuilder_ == null ? (RankMsg.RankData)this.ranks_.get(index) : (RankMsg.RankData)this.ranksBuilder_.getMessage(index);
         }

         public Builder setRanks(int index, RankMsg.RankData value) {
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

         public Builder setRanks(int index, RankMsg.RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(RankMsg.RankData value) {
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

         public Builder addRanks(int index, RankMsg.RankData value) {
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

         public Builder addRanks(RankMsg.RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(int index, RankMsg.RankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRanks(Iterable<? extends RankMsg.RankData> values) {
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

         public RankMsg.RankData.Builder getRanksBuilder(int index) {
            return (RankMsg.RankData.Builder)this.getRanksFieldBuilder().getBuilder(index);
         }

         public RankMsg.RankDataOrBuilder getRanksOrBuilder(int index) {
            return this.ranksBuilder_ == null ? (RankMsg.RankDataOrBuilder)this.ranks_.get(index) : (RankMsg.RankDataOrBuilder)this.ranksBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankMsg.RankDataOrBuilder> getRanksOrBuilderList() {
            return this.ranksBuilder_ != null ? this.ranksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.ranks_);
         }

         public RankMsg.RankData.Builder addRanksBuilder() {
            return (RankMsg.RankData.Builder)this.getRanksFieldBuilder().addBuilder(RankMsg.RankData.getDefaultInstance());
         }

         public RankMsg.RankData.Builder addRanksBuilder(int index) {
            return (RankMsg.RankData.Builder)this.getRanksFieldBuilder().addBuilder(index, RankMsg.RankData.getDefaultInstance());
         }

         public List<RankMsg.RankData.Builder> getRanksBuilderList() {
            return this.getRanksFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankMsg.RankData, RankMsg.RankData.Builder, RankMsg.RankDataOrBuilder> getRanksFieldBuilder() {
            if (this.ranksBuilder_ == null) {
               this.ranksBuilder_ = new RepeatedFieldBuilderV3(this.ranks_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.ranks_ = null;
            }

            return this.ranksBuilder_;
         }

         public boolean hasMyRank() {
            return (this.bitField0_ & 2) != 0;
         }

         public RankMsg.RankData getMyRank() {
            if (this.myRankBuilder_ == null) {
               return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
            } else {
               return (RankMsg.RankData)this.myRankBuilder_.getMessage();
            }
         }

         public Builder setMyRank(RankMsg.RankData value) {
            if (this.myRankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.myRank_ = value;
               this.onChanged();
            } else {
               this.myRankBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setMyRank(RankMsg.RankData.Builder builderForValue) {
            if (this.myRankBuilder_ == null) {
               this.myRank_ = builderForValue.build();
               this.onChanged();
            } else {
               this.myRankBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeMyRank(RankMsg.RankData value) {
            if (this.myRankBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.myRank_ != null && this.myRank_ != RankMsg.RankData.getDefaultInstance()) {
                  this.myRank_ = RankMsg.RankData.newBuilder(this.myRank_).mergeFrom(value).buildPartial();
               } else {
                  this.myRank_ = value;
               }

               this.onChanged();
            } else {
               this.myRankBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearMyRank() {
            if (this.myRankBuilder_ == null) {
               this.myRank_ = null;
               this.onChanged();
            } else {
               this.myRankBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public RankMsg.RankData.Builder getMyRankBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (RankMsg.RankData.Builder)this.getMyRankFieldBuilder().getBuilder();
         }

         public RankMsg.RankDataOrBuilder getMyRankOrBuilder() {
            if (this.myRankBuilder_ != null) {
               return (RankMsg.RankDataOrBuilder)this.myRankBuilder_.getMessageOrBuilder();
            } else {
               return this.myRank_ == null ? RankMsg.RankData.getDefaultInstance() : this.myRank_;
            }
         }

         private SingleFieldBuilderV3<RankMsg.RankData, RankMsg.RankData.Builder, RankMsg.RankDataOrBuilder> getMyRankFieldBuilder() {
            if (this.myRankBuilder_ == null) {
               this.myRankBuilder_ = new SingleFieldBuilderV3(this.getMyRank(), this.getParentForChildren(), this.isClean());
               this.myRank_ = null;
            }

            return this.myRankBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_MyRankPoint_14619 extends GeneratedMessageV3 implements C2S_MyRankPoint_14619OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_MyRankPoint_14619 DEFAULT_INSTANCE = new C2S_MyRankPoint_14619();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MyRankPoint_14619> PARSER = new AbstractParser<C2S_MyRankPoint_14619>() {
         public C2S_MyRankPoint_14619 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MyRankPoint_14619(input, extensionRegistry);
         }
      };

      private C2S_MyRankPoint_14619(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MyRankPoint_14619() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MyRankPoint_14619();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MyRankPoint_14619(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_MyRankPoint_14619_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_MyRankPoint_14619_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MyRankPoint_14619.class, Builder.class);
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
         } else if (!(obj instanceof C2S_MyRankPoint_14619)) {
            return super.equals(obj);
         } else {
            C2S_MyRankPoint_14619 other = (C2S_MyRankPoint_14619)obj;
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

      public static C2S_MyRankPoint_14619 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MyRankPoint_14619)PARSER.parseFrom(data);
      }

      public static C2S_MyRankPoint_14619 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MyRankPoint_14619)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MyRankPoint_14619 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MyRankPoint_14619)PARSER.parseFrom(data);
      }

      public static C2S_MyRankPoint_14619 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MyRankPoint_14619)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MyRankPoint_14619 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MyRankPoint_14619)PARSER.parseFrom(data);
      }

      public static C2S_MyRankPoint_14619 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MyRankPoint_14619)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MyRankPoint_14619 parseFrom(InputStream input) throws IOException {
         return (C2S_MyRankPoint_14619)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MyRankPoint_14619 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MyRankPoint_14619)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MyRankPoint_14619 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MyRankPoint_14619)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MyRankPoint_14619 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MyRankPoint_14619)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MyRankPoint_14619 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MyRankPoint_14619)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MyRankPoint_14619 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MyRankPoint_14619)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MyRankPoint_14619 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MyRankPoint_14619 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MyRankPoint_14619> parser() {
         return PARSER;
      }

      public Parser<C2S_MyRankPoint_14619> getParserForType() {
         return PARSER;
      }

      public C2S_MyRankPoint_14619 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MyRankPoint_14619OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_MyRankPoint_14619_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_MyRankPoint_14619_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MyRankPoint_14619.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionOfferMsg.C2S_MyRankPoint_14619.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_MyRankPoint_14619_descriptor;
         }

         public C2S_MyRankPoint_14619 getDefaultInstanceForType() {
            return UnionOfferMsg.C2S_MyRankPoint_14619.getDefaultInstance();
         }

         public C2S_MyRankPoint_14619 build() {
            C2S_MyRankPoint_14619 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MyRankPoint_14619 buildPartial() {
            C2S_MyRankPoint_14619 result = new C2S_MyRankPoint_14619(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_MyRankPoint_14619) {
               return this.mergeFrom((C2S_MyRankPoint_14619)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MyRankPoint_14619 other) {
            if (other == UnionOfferMsg.C2S_MyRankPoint_14619.getDefaultInstance()) {
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
            C2S_MyRankPoint_14619 parsedMessage = null;

            try {
               parsedMessage = (C2S_MyRankPoint_14619)UnionOfferMsg.C2S_MyRankPoint_14619.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MyRankPoint_14619)e.getUnfinishedMessage();
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

   public static final class S2C_MyRankPoint_14620 extends GeneratedMessageV3 implements S2C_MyRankPoint_14620OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int WEEKPOINT_FIELD_NUMBER = 2;
      private int weekPoint_;
      private byte memoizedIsInitialized;
      private static final S2C_MyRankPoint_14620 DEFAULT_INSTANCE = new S2C_MyRankPoint_14620();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MyRankPoint_14620> PARSER = new AbstractParser<S2C_MyRankPoint_14620>() {
         public S2C_MyRankPoint_14620 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MyRankPoint_14620(input, extensionRegistry);
         }
      };

      private S2C_MyRankPoint_14620(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MyRankPoint_14620() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MyRankPoint_14620();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MyRankPoint_14620(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.weekPoint_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_MyRankPoint_14620_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_MyRankPoint_14620_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MyRankPoint_14620.class, Builder.class);
      }

      public boolean hasRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasWeekPoint() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getWeekPoint() {
         return this.weekPoint_;
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
         } else if (!this.hasWeekPoint()) {
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
            output.writeInt32(2, this.weekPoint_);
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
               size += CodedOutputStream.computeInt32Size(2, this.weekPoint_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_MyRankPoint_14620)) {
            return super.equals(obj);
         } else {
            S2C_MyRankPoint_14620 other = (S2C_MyRankPoint_14620)obj;
            if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasWeekPoint() != other.hasWeekPoint()) {
               return false;
            } else if (this.hasWeekPoint() && this.getWeekPoint() != other.getWeekPoint()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasWeekPoint()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getWeekPoint();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_MyRankPoint_14620 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MyRankPoint_14620)PARSER.parseFrom(data);
      }

      public static S2C_MyRankPoint_14620 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MyRankPoint_14620)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MyRankPoint_14620 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MyRankPoint_14620)PARSER.parseFrom(data);
      }

      public static S2C_MyRankPoint_14620 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MyRankPoint_14620)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MyRankPoint_14620 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MyRankPoint_14620)PARSER.parseFrom(data);
      }

      public static S2C_MyRankPoint_14620 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MyRankPoint_14620)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MyRankPoint_14620 parseFrom(InputStream input) throws IOException {
         return (S2C_MyRankPoint_14620)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MyRankPoint_14620 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MyRankPoint_14620)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MyRankPoint_14620 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MyRankPoint_14620)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MyRankPoint_14620 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MyRankPoint_14620)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MyRankPoint_14620 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MyRankPoint_14620)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MyRankPoint_14620 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MyRankPoint_14620)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MyRankPoint_14620 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MyRankPoint_14620 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MyRankPoint_14620> parser() {
         return PARSER;
      }

      public Parser<S2C_MyRankPoint_14620> getParserForType() {
         return PARSER;
      }

      public S2C_MyRankPoint_14620 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MyRankPoint_14620OrBuilder {
         private int bitField0_;
         private int rank_;
         private int weekPoint_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_MyRankPoint_14620_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_MyRankPoint_14620_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MyRankPoint_14620.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionOfferMsg.S2C_MyRankPoint_14620.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            this.weekPoint_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_MyRankPoint_14620_descriptor;
         }

         public S2C_MyRankPoint_14620 getDefaultInstanceForType() {
            return UnionOfferMsg.S2C_MyRankPoint_14620.getDefaultInstance();
         }

         public S2C_MyRankPoint_14620 build() {
            S2C_MyRankPoint_14620 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MyRankPoint_14620 buildPartial() {
            S2C_MyRankPoint_14620 result = new S2C_MyRankPoint_14620(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.weekPoint_ = this.weekPoint_;
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
            if (other instanceof S2C_MyRankPoint_14620) {
               return this.mergeFrom((S2C_MyRankPoint_14620)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MyRankPoint_14620 other) {
            if (other == UnionOfferMsg.S2C_MyRankPoint_14620.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasWeekPoint()) {
                  this.setWeekPoint(other.getWeekPoint());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRank()) {
               return false;
            } else {
               return this.hasWeekPoint();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_MyRankPoint_14620 parsedMessage = null;

            try {
               parsedMessage = (S2C_MyRankPoint_14620)UnionOfferMsg.S2C_MyRankPoint_14620.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MyRankPoint_14620)e.getUnfinishedMessage();
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

         public boolean hasWeekPoint() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getWeekPoint() {
            return this.weekPoint_;
         }

         public Builder setWeekPoint(int value) {
            this.bitField0_ |= 2;
            this.weekPoint_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWeekPoint() {
            this.bitField0_ &= -3;
            this.weekPoint_ = 0;
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

   public static final class S2C_PublishOffer_14622 extends GeneratedMessageV3 implements S2C_PublishOffer_14622OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_PublishOffer_14622 DEFAULT_INSTANCE = new S2C_PublishOffer_14622();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PublishOffer_14622> PARSER = new AbstractParser<S2C_PublishOffer_14622>() {
         public S2C_PublishOffer_14622 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PublishOffer_14622(input, extensionRegistry);
         }
      };

      private S2C_PublishOffer_14622(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PublishOffer_14622() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PublishOffer_14622();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PublishOffer_14622(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_PublishOffer_14622_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_PublishOffer_14622_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PublishOffer_14622.class, Builder.class);
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
         } else if (!(obj instanceof S2C_PublishOffer_14622)) {
            return super.equals(obj);
         } else {
            S2C_PublishOffer_14622 other = (S2C_PublishOffer_14622)obj;
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

      public static S2C_PublishOffer_14622 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PublishOffer_14622)PARSER.parseFrom(data);
      }

      public static S2C_PublishOffer_14622 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PublishOffer_14622)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PublishOffer_14622 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PublishOffer_14622)PARSER.parseFrom(data);
      }

      public static S2C_PublishOffer_14622 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PublishOffer_14622)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PublishOffer_14622 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PublishOffer_14622)PARSER.parseFrom(data);
      }

      public static S2C_PublishOffer_14622 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PublishOffer_14622)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PublishOffer_14622 parseFrom(InputStream input) throws IOException {
         return (S2C_PublishOffer_14622)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PublishOffer_14622 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PublishOffer_14622)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PublishOffer_14622 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PublishOffer_14622)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PublishOffer_14622 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PublishOffer_14622)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PublishOffer_14622 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PublishOffer_14622)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PublishOffer_14622 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PublishOffer_14622)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PublishOffer_14622 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PublishOffer_14622 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PublishOffer_14622> parser() {
         return PARSER;
      }

      public Parser<S2C_PublishOffer_14622> getParserForType() {
         return PARSER;
      }

      public S2C_PublishOffer_14622 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PublishOffer_14622OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_PublishOffer_14622_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_PublishOffer_14622_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PublishOffer_14622.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionOfferMsg.S2C_PublishOffer_14622.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_PublishOffer_14622_descriptor;
         }

         public S2C_PublishOffer_14622 getDefaultInstanceForType() {
            return UnionOfferMsg.S2C_PublishOffer_14622.getDefaultInstance();
         }

         public S2C_PublishOffer_14622 build() {
            S2C_PublishOffer_14622 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PublishOffer_14622 buildPartial() {
            S2C_PublishOffer_14622 result = new S2C_PublishOffer_14622(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_PublishOffer_14622) {
               return this.mergeFrom((S2C_PublishOffer_14622)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PublishOffer_14622 other) {
            if (other == UnionOfferMsg.S2C_PublishOffer_14622.getDefaultInstance()) {
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
            S2C_PublishOffer_14622 parsedMessage = null;

            try {
               parsedMessage = (S2C_PublishOffer_14622)UnionOfferMsg.S2C_PublishOffer_14622.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PublishOffer_14622)e.getUnfinishedMessage();
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

   public static final class S2C_BuyFight_14624 extends GeneratedMessageV3 implements S2C_BuyFight_14624OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUYNUM_FIELD_NUMBER = 2;
      private int buyNum_;
      private byte memoizedIsInitialized;
      private static final S2C_BuyFight_14624 DEFAULT_INSTANCE = new S2C_BuyFight_14624();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BuyFight_14624> PARSER = new AbstractParser<S2C_BuyFight_14624>() {
         public S2C_BuyFight_14624 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BuyFight_14624(input, extensionRegistry);
         }
      };

      private S2C_BuyFight_14624(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BuyFight_14624() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BuyFight_14624();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BuyFight_14624(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.bitField0_ |= 1;
                        this.buyNum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_BuyFight_14624_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_BuyFight_14624_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BuyFight_14624.class, Builder.class);
      }

      public boolean hasBuyNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBuyNum() {
         return this.buyNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasBuyNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(2, this.buyNum_);
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
               size += CodedOutputStream.computeInt32Size(2, this.buyNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BuyFight_14624)) {
            return super.equals(obj);
         } else {
            S2C_BuyFight_14624 other = (S2C_BuyFight_14624)obj;
            if (this.hasBuyNum() != other.hasBuyNum()) {
               return false;
            } else if (this.hasBuyNum() && this.getBuyNum() != other.getBuyNum()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasBuyNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBuyNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BuyFight_14624 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BuyFight_14624)PARSER.parseFrom(data);
      }

      public static S2C_BuyFight_14624 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyFight_14624)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyFight_14624 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BuyFight_14624)PARSER.parseFrom(data);
      }

      public static S2C_BuyFight_14624 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyFight_14624)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyFight_14624 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BuyFight_14624)PARSER.parseFrom(data);
      }

      public static S2C_BuyFight_14624 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BuyFight_14624)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BuyFight_14624 parseFrom(InputStream input) throws IOException {
         return (S2C_BuyFight_14624)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BuyFight_14624 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyFight_14624)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BuyFight_14624 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BuyFight_14624)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BuyFight_14624 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyFight_14624)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BuyFight_14624 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BuyFight_14624)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BuyFight_14624 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BuyFight_14624)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BuyFight_14624 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BuyFight_14624 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BuyFight_14624> parser() {
         return PARSER;
      }

      public Parser<S2C_BuyFight_14624> getParserForType() {
         return PARSER;
      }

      public S2C_BuyFight_14624 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BuyFight_14624OrBuilder {
         private int bitField0_;
         private int buyNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_BuyFight_14624_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_BuyFight_14624_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BuyFight_14624.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionOfferMsg.S2C_BuyFight_14624.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buyNum_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_BuyFight_14624_descriptor;
         }

         public S2C_BuyFight_14624 getDefaultInstanceForType() {
            return UnionOfferMsg.S2C_BuyFight_14624.getDefaultInstance();
         }

         public S2C_BuyFight_14624 build() {
            S2C_BuyFight_14624 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BuyFight_14624 buildPartial() {
            S2C_BuyFight_14624 result = new S2C_BuyFight_14624(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.buyNum_ = this.buyNum_;
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
            if (other instanceof S2C_BuyFight_14624) {
               return this.mergeFrom((S2C_BuyFight_14624)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BuyFight_14624 other) {
            if (other == UnionOfferMsg.S2C_BuyFight_14624.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuyNum()) {
                  this.setBuyNum(other.getBuyNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasBuyNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_BuyFight_14624 parsedMessage = null;

            try {
               parsedMessage = (S2C_BuyFight_14624)UnionOfferMsg.S2C_BuyFight_14624.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BuyFight_14624)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuyNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBuyNum() {
            return this.buyNum_;
         }

         public Builder setBuyNum(int value) {
            this.bitField0_ |= 1;
            this.buyNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyNum() {
            this.bitField0_ &= -2;
            this.buyNum_ = 0;
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

   public static final class C2S_PointRank_14631 extends GeneratedMessageV3 implements C2S_PointRank_14631OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_PointRank_14631 DEFAULT_INSTANCE = new C2S_PointRank_14631();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_PointRank_14631> PARSER = new AbstractParser<C2S_PointRank_14631>() {
         public C2S_PointRank_14631 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_PointRank_14631(input, extensionRegistry);
         }
      };

      private C2S_PointRank_14631(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_PointRank_14631() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_PointRank_14631();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_PointRank_14631(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_PointRank_14631_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_PointRank_14631_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PointRank_14631.class, Builder.class);
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
         } else if (!(obj instanceof C2S_PointRank_14631)) {
            return super.equals(obj);
         } else {
            C2S_PointRank_14631 other = (C2S_PointRank_14631)obj;
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

      public static C2S_PointRank_14631 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_PointRank_14631)PARSER.parseFrom(data);
      }

      public static C2S_PointRank_14631 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PointRank_14631)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PointRank_14631 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_PointRank_14631)PARSER.parseFrom(data);
      }

      public static C2S_PointRank_14631 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PointRank_14631)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PointRank_14631 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_PointRank_14631)PARSER.parseFrom(data);
      }

      public static C2S_PointRank_14631 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_PointRank_14631)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_PointRank_14631 parseFrom(InputStream input) throws IOException {
         return (C2S_PointRank_14631)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PointRank_14631 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PointRank_14631)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PointRank_14631 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_PointRank_14631)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_PointRank_14631 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PointRank_14631)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_PointRank_14631 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_PointRank_14631)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_PointRank_14631 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_PointRank_14631)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_PointRank_14631 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_PointRank_14631 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_PointRank_14631> parser() {
         return PARSER;
      }

      public Parser<C2S_PointRank_14631> getParserForType() {
         return PARSER;
      }

      public C2S_PointRank_14631 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_PointRank_14631OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_PointRank_14631_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_PointRank_14631_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_PointRank_14631.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionOfferMsg.C2S_PointRank_14631.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_C2S_PointRank_14631_descriptor;
         }

         public C2S_PointRank_14631 getDefaultInstanceForType() {
            return UnionOfferMsg.C2S_PointRank_14631.getDefaultInstance();
         }

         public C2S_PointRank_14631 build() {
            C2S_PointRank_14631 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_PointRank_14631 buildPartial() {
            C2S_PointRank_14631 result = new C2S_PointRank_14631(this);
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
            if (other instanceof C2S_PointRank_14631) {
               return this.mergeFrom((C2S_PointRank_14631)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_PointRank_14631 other) {
            if (other == UnionOfferMsg.C2S_PointRank_14631.getDefaultInstance()) {
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
            C2S_PointRank_14631 parsedMessage = null;

            try {
               parsedMessage = (C2S_PointRank_14631)UnionOfferMsg.C2S_PointRank_14631.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_PointRank_14631)e.getUnfinishedMessage();
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

   public static final class S2C_PointRank_14632 extends GeneratedMessageV3 implements S2C_PointRank_14632OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int RANKS_FIELD_NUMBER = 2;
      private List<OfferRankData> ranks_;
      public static final int MYRANK_FIELD_NUMBER = 3;
      private OfferRankData myRank_;
      private byte memoizedIsInitialized;
      private static final S2C_PointRank_14632 DEFAULT_INSTANCE = new S2C_PointRank_14632();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_PointRank_14632> PARSER = new AbstractParser<S2C_PointRank_14632>() {
         public S2C_PointRank_14632 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_PointRank_14632(input, extensionRegistry);
         }
      };

      private S2C_PointRank_14632(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_PointRank_14632() {
         this.memoizedIsInitialized = -1;
         this.ranks_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_PointRank_14632();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_PointRank_14632(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                           this.ranks_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.ranks_.add(input.readMessage(UnionOfferMsg.OfferRankData.PARSER, extensionRegistry));
                        break;
                     case 26:
                        OfferRankData.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.myRank_.toBuilder();
                        }

                        this.myRank_ = (OfferRankData)input.readMessage(UnionOfferMsg.OfferRankData.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.myRank_);
                           this.myRank_ = subBuilder.buildPartial();
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
               if ((mutable_bitField0_ & 2) != 0) {
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_PointRank_14632_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_PointRank_14632_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PointRank_14632.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public List<OfferRankData> getRanksList() {
         return this.ranks_;
      }

      public List<? extends OfferRankDataOrBuilder> getRanksOrBuilderList() {
         return this.ranks_;
      }

      public int getRanksCount() {
         return this.ranks_.size();
      }

      public OfferRankData getRanks(int index) {
         return (OfferRankData)this.ranks_.get(index);
      }

      public OfferRankDataOrBuilder getRanksOrBuilder(int index) {
         return (OfferRankDataOrBuilder)this.ranks_.get(index);
      }

      public boolean hasMyRank() {
         return (this.bitField0_ & 2) != 0;
      }

      public OfferRankData getMyRank() {
         return this.myRank_ == null ? UnionOfferMsg.OfferRankData.getDefaultInstance() : this.myRank_;
      }

      public OfferRankDataOrBuilder getMyRankOrBuilder() {
         return this.myRank_ == null ? UnionOfferMsg.OfferRankData.getDefaultInstance() : this.myRank_;
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
            for(int i = 0; i < this.getRanksCount(); ++i) {
               if (!this.getRanks(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            if (this.hasMyRank() && !this.getMyRank().isInitialized()) {
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
            output.writeInt32(1, this.type_);
         }

         for(int i = 0; i < this.ranks_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.ranks_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(3, this.getMyRank());
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

            for(int i = 0; i < this.ranks_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.ranks_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(3, this.getMyRank());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_PointRank_14632)) {
            return super.equals(obj);
         } else {
            S2C_PointRank_14632 other = (S2C_PointRank_14632)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (!this.getRanksList().equals(other.getRanksList())) {
               return false;
            } else if (this.hasMyRank() != other.hasMyRank()) {
               return false;
            } else if (this.hasMyRank() && !this.getMyRank().equals(other.getMyRank())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.getRanksCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRanksList().hashCode();
            }

            if (this.hasMyRank()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getMyRank().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_PointRank_14632 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_PointRank_14632)PARSER.parseFrom(data);
      }

      public static S2C_PointRank_14632 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PointRank_14632)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PointRank_14632 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_PointRank_14632)PARSER.parseFrom(data);
      }

      public static S2C_PointRank_14632 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PointRank_14632)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PointRank_14632 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_PointRank_14632)PARSER.parseFrom(data);
      }

      public static S2C_PointRank_14632 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_PointRank_14632)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_PointRank_14632 parseFrom(InputStream input) throws IOException {
         return (S2C_PointRank_14632)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PointRank_14632 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PointRank_14632)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PointRank_14632 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_PointRank_14632)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_PointRank_14632 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PointRank_14632)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_PointRank_14632 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_PointRank_14632)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_PointRank_14632 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_PointRank_14632)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_PointRank_14632 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_PointRank_14632 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_PointRank_14632> parser() {
         return PARSER;
      }

      public Parser<S2C_PointRank_14632> getParserForType() {
         return PARSER;
      }

      public S2C_PointRank_14632 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_PointRank_14632OrBuilder {
         private int bitField0_;
         private int type_;
         private List<OfferRankData> ranks_;
         private RepeatedFieldBuilderV3<OfferRankData, OfferRankData.Builder, OfferRankDataOrBuilder> ranksBuilder_;
         private OfferRankData myRank_;
         private SingleFieldBuilderV3<OfferRankData, OfferRankData.Builder, OfferRankDataOrBuilder> myRankBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_PointRank_14632_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_PointRank_14632_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_PointRank_14632.class, Builder.class);
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
            if (UnionOfferMsg.S2C_PointRank_14632.alwaysUseFieldBuilders) {
               this.getRanksFieldBuilder();
               this.getMyRankFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            if (this.ranksBuilder_ == null) {
               this.ranks_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.ranksBuilder_.clear();
            }

            if (this.myRankBuilder_ == null) {
               this.myRank_ = null;
            } else {
               this.myRankBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_PointRank_14632_descriptor;
         }

         public S2C_PointRank_14632 getDefaultInstanceForType() {
            return UnionOfferMsg.S2C_PointRank_14632.getDefaultInstance();
         }

         public S2C_PointRank_14632 build() {
            S2C_PointRank_14632 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_PointRank_14632 buildPartial() {
            S2C_PointRank_14632 result = new S2C_PointRank_14632(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if (this.ranksBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.ranks_ = Collections.unmodifiableList(this.ranks_);
                  this.bitField0_ &= -3;
               }

               result.ranks_ = this.ranks_;
            } else {
               result.ranks_ = this.ranksBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               if (this.myRankBuilder_ == null) {
                  result.myRank_ = this.myRank_;
               } else {
                  result.myRank_ = (OfferRankData)this.myRankBuilder_.build();
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
            if (other instanceof S2C_PointRank_14632) {
               return this.mergeFrom((S2C_PointRank_14632)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_PointRank_14632 other) {
            if (other == UnionOfferMsg.S2C_PointRank_14632.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (this.ranksBuilder_ == null) {
                  if (!other.ranks_.isEmpty()) {
                     if (this.ranks_.isEmpty()) {
                        this.ranks_ = other.ranks_;
                        this.bitField0_ &= -3;
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
                     this.bitField0_ &= -3;
                     this.ranksBuilder_ = UnionOfferMsg.S2C_PointRank_14632.alwaysUseFieldBuilders ? this.getRanksFieldBuilder() : null;
                  } else {
                     this.ranksBuilder_.addAllMessages(other.ranks_);
                  }
               }

               if (other.hasMyRank()) {
                  this.mergeMyRank(other.getMyRank());
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
               for(int i = 0; i < this.getRanksCount(); ++i) {
                  if (!this.getRanks(i).isInitialized()) {
                     return false;
                  }
               }

               if (this.hasMyRank() && !this.getMyRank().isInitialized()) {
                  return false;
               } else {
                  return true;
               }
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_PointRank_14632 parsedMessage = null;

            try {
               parsedMessage = (S2C_PointRank_14632)UnionOfferMsg.S2C_PointRank_14632.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_PointRank_14632)e.getUnfinishedMessage();
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

         private void ensureRanksIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.ranks_ = new ArrayList(this.ranks_);
               this.bitField0_ |= 2;
            }

         }

         public List<OfferRankData> getRanksList() {
            return this.ranksBuilder_ == null ? Collections.unmodifiableList(this.ranks_) : this.ranksBuilder_.getMessageList();
         }

         public int getRanksCount() {
            return this.ranksBuilder_ == null ? this.ranks_.size() : this.ranksBuilder_.getCount();
         }

         public OfferRankData getRanks(int index) {
            return this.ranksBuilder_ == null ? (OfferRankData)this.ranks_.get(index) : (OfferRankData)this.ranksBuilder_.getMessage(index);
         }

         public Builder setRanks(int index, OfferRankData value) {
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

         public Builder setRanks(int index, OfferRankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(OfferRankData value) {
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

         public Builder addRanks(int index, OfferRankData value) {
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

         public Builder addRanks(OfferRankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRanks(int index, OfferRankData.Builder builderForValue) {
            if (this.ranksBuilder_ == null) {
               this.ensureRanksIsMutable();
               this.ranks_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.ranksBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRanks(Iterable<? extends OfferRankData> values) {
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
               this.bitField0_ &= -3;
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

         public OfferRankData.Builder getRanksBuilder(int index) {
            return (OfferRankData.Builder)this.getRanksFieldBuilder().getBuilder(index);
         }

         public OfferRankDataOrBuilder getRanksOrBuilder(int index) {
            return this.ranksBuilder_ == null ? (OfferRankDataOrBuilder)this.ranks_.get(index) : (OfferRankDataOrBuilder)this.ranksBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends OfferRankDataOrBuilder> getRanksOrBuilderList() {
            return this.ranksBuilder_ != null ? this.ranksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.ranks_);
         }

         public OfferRankData.Builder addRanksBuilder() {
            return (OfferRankData.Builder)this.getRanksFieldBuilder().addBuilder(UnionOfferMsg.OfferRankData.getDefaultInstance());
         }

         public OfferRankData.Builder addRanksBuilder(int index) {
            return (OfferRankData.Builder)this.getRanksFieldBuilder().addBuilder(index, UnionOfferMsg.OfferRankData.getDefaultInstance());
         }

         public List<OfferRankData.Builder> getRanksBuilderList() {
            return this.getRanksFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<OfferRankData, OfferRankData.Builder, OfferRankDataOrBuilder> getRanksFieldBuilder() {
            if (this.ranksBuilder_ == null) {
               this.ranksBuilder_ = new RepeatedFieldBuilderV3(this.ranks_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.ranks_ = null;
            }

            return this.ranksBuilder_;
         }

         public boolean hasMyRank() {
            return (this.bitField0_ & 4) != 0;
         }

         public OfferRankData getMyRank() {
            if (this.myRankBuilder_ == null) {
               return this.myRank_ == null ? UnionOfferMsg.OfferRankData.getDefaultInstance() : this.myRank_;
            } else {
               return (OfferRankData)this.myRankBuilder_.getMessage();
            }
         }

         public Builder setMyRank(OfferRankData value) {
            if (this.myRankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.myRank_ = value;
               this.onChanged();
            } else {
               this.myRankBuilder_.setMessage(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setMyRank(OfferRankData.Builder builderForValue) {
            if (this.myRankBuilder_ == null) {
               this.myRank_ = builderForValue.build();
               this.onChanged();
            } else {
               this.myRankBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeMyRank(OfferRankData value) {
            if (this.myRankBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.myRank_ != null && this.myRank_ != UnionOfferMsg.OfferRankData.getDefaultInstance()) {
                  this.myRank_ = UnionOfferMsg.OfferRankData.newBuilder(this.myRank_).mergeFrom(value).buildPartial();
               } else {
                  this.myRank_ = value;
               }

               this.onChanged();
            } else {
               this.myRankBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearMyRank() {
            if (this.myRankBuilder_ == null) {
               this.myRank_ = null;
               this.onChanged();
            } else {
               this.myRankBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public OfferRankData.Builder getMyRankBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (OfferRankData.Builder)this.getMyRankFieldBuilder().getBuilder();
         }

         public OfferRankDataOrBuilder getMyRankOrBuilder() {
            if (this.myRankBuilder_ != null) {
               return (OfferRankDataOrBuilder)this.myRankBuilder_.getMessageOrBuilder();
            } else {
               return this.myRank_ == null ? UnionOfferMsg.OfferRankData.getDefaultInstance() : this.myRank_;
            }
         }

         private SingleFieldBuilderV3<OfferRankData, OfferRankData.Builder, OfferRankDataOrBuilder> getMyRankFieldBuilder() {
            if (this.myRankBuilder_ == null) {
               this.myRankBuilder_ = new SingleFieldBuilderV3(this.getMyRank(), this.getParentForChildren(), this.isClean());
               this.myRank_ = null;
            }

            return this.myRankBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_DailyUpdate_14634 extends GeneratedMessageV3 implements S2C_DailyUpdate_14634OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final S2C_DailyUpdate_14634 DEFAULT_INSTANCE = new S2C_DailyUpdate_14634();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DailyUpdate_14634> PARSER = new AbstractParser<S2C_DailyUpdate_14634>() {
         public S2C_DailyUpdate_14634 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DailyUpdate_14634(input, extensionRegistry);
         }
      };

      private S2C_DailyUpdate_14634(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DailyUpdate_14634() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DailyUpdate_14634();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DailyUpdate_14634(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_DailyUpdate_14634_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_DailyUpdate_14634_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DailyUpdate_14634.class, Builder.class);
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
         } else if (!(obj instanceof S2C_DailyUpdate_14634)) {
            return super.equals(obj);
         } else {
            S2C_DailyUpdate_14634 other = (S2C_DailyUpdate_14634)obj;
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

      public static S2C_DailyUpdate_14634 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DailyUpdate_14634)PARSER.parseFrom(data);
      }

      public static S2C_DailyUpdate_14634 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DailyUpdate_14634)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DailyUpdate_14634 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DailyUpdate_14634)PARSER.parseFrom(data);
      }

      public static S2C_DailyUpdate_14634 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DailyUpdate_14634)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DailyUpdate_14634 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DailyUpdate_14634)PARSER.parseFrom(data);
      }

      public static S2C_DailyUpdate_14634 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DailyUpdate_14634)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DailyUpdate_14634 parseFrom(InputStream input) throws IOException {
         return (S2C_DailyUpdate_14634)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DailyUpdate_14634 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DailyUpdate_14634)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DailyUpdate_14634 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DailyUpdate_14634)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DailyUpdate_14634 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DailyUpdate_14634)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DailyUpdate_14634 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DailyUpdate_14634)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DailyUpdate_14634 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DailyUpdate_14634)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DailyUpdate_14634 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DailyUpdate_14634 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DailyUpdate_14634> parser() {
         return PARSER;
      }

      public Parser<S2C_DailyUpdate_14634> getParserForType() {
         return PARSER;
      }

      public S2C_DailyUpdate_14634 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DailyUpdate_14634OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_DailyUpdate_14634_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_DailyUpdate_14634_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DailyUpdate_14634.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (UnionOfferMsg.S2C_DailyUpdate_14634.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return UnionOfferMsg.internal_static_unionOffer_com_gzbz_protobuf_S2C_DailyUpdate_14634_descriptor;
         }

         public S2C_DailyUpdate_14634 getDefaultInstanceForType() {
            return UnionOfferMsg.S2C_DailyUpdate_14634.getDefaultInstance();
         }

         public S2C_DailyUpdate_14634 build() {
            S2C_DailyUpdate_14634 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DailyUpdate_14634 buildPartial() {
            S2C_DailyUpdate_14634 result = new S2C_DailyUpdate_14634(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_DailyUpdate_14634) {
               return this.mergeFrom((S2C_DailyUpdate_14634)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DailyUpdate_14634 other) {
            if (other == UnionOfferMsg.S2C_DailyUpdate_14634.getDefaultInstance()) {
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
            S2C_DailyUpdate_14634 parsedMessage = null;

            try {
               parsedMessage = (S2C_DailyUpdate_14634)UnionOfferMsg.S2C_DailyUpdate_14634.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DailyUpdate_14634)e.getUnfinishedMessage();
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

   public interface C2S_BuyFight_14609OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_DamageRank_14617OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();
   }

   public interface C2S_EnterView_14601OrBuilder extends MessageOrBuilder {
      boolean hasEnter();

      int getEnter();
   }

   public interface C2S_MyRankPoint_14619OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OfferDetail_14615OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();
   }

   public interface C2S_PointRank_14631OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_PublishOffer_14603OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Record_14611OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ShopLv_14613OrBuilder extends MessageOrBuilder {
   }

   public interface EasyRankInfoOrBuilder extends MessageOrBuilder {
      boolean hasServerId();

      int getServerId();

      boolean hasUnionName();

      String getUnionName();

      ByteString getUnionNameBytes();

      boolean hasPoint();

      int getPoint();
   }

   public interface OfferRankDataOrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasScore();

      int getScore();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasHead();

      int getHead();

      boolean hasHeadFrame();

      int getHeadFrame();

      boolean hasLevel();

      int getLevel();

      boolean hasMonarchId();

      int getMonarchId();

      boolean hasServerId();

      int getServerId();

      boolean hasUnionName();

      String getUnionName();

      ByteString getUnionNameBytes();

      boolean hasFight();

      int getFight();

      boolean hasUnionLeaderName();

      String getUnionLeaderName();

      ByteString getUnionLeaderNameBytes();
   }

   public interface OfferRewardInfoOrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasId();

      int getId();

      boolean hasCreateTime();

      int getCreateTime();

      boolean hasHpPersent();

      int getHpPersent();

      boolean hasType();

      int getType();

      boolean hasUnionId();

      int getUnionId();

      boolean hasUnionName();

      String getUnionName();

      ByteString getUnionNameBytes();

      boolean hasHead();

      int getHead();

      boolean hasHeadFrame();

      int getHeadFrame();

      boolean hasServerId();

      int getServerId();

      boolean hasDisappearTime();

      int getDisappearTime();

      boolean hasOfferHeroId();

      int getOfferHeroId();

      boolean hasOfferRewardId();

      int getOfferRewardId();

      boolean hasKillServerId();

      int getKillServerId();

      boolean hasKiller();

      String getKiller();

      ByteString getKillerBytes();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasDifficult();

      int getDifficult();
   }

   public interface RecordInfoOrBuilder extends MessageOrBuilder {
      boolean hasSubclass();

      int getSubclass();

      boolean hasServerId();

      int getServerId();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasOfferHeroId();

      int getOfferHeroId();

      boolean hasHurtValue();

      long getHurtValue();

      boolean hasPoint();

      int getPoint();

      boolean hasPublishServerId();

      int getPublishServerId();

      boolean hasPublishUnionName();

      String getPublishUnionName();

      ByteString getPublishUnionNameBytes();

      boolean hasSurplusHp();

      long getSurplusHp();

      boolean hasHpPercent();

      int getHpPercent();

      boolean hasFightNum();

      int getFightNum();

      boolean hasKillNum();

      int getKillNum();

      boolean hasRank();

      int getRank();

      boolean hasHighestName();

      String getHighestName();

      ByteString getHighestNameBytes();

      boolean hasHighestPoint();

      int getHighestPoint();

      boolean hasUnionId();

      int getUnionId();

      boolean hasPositionId();

      int getPositionId();

      boolean hasTime();

      int getTime();

      boolean hasDifficult();

      int getDifficult();
   }

   public interface S2C_AddOffer_14604OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      OfferRewardInfo getInfo();

      OfferRewardInfoOrBuilder getInfoOrBuilder();
   }

   public interface S2C_BuyFight_14624OrBuilder extends MessageOrBuilder {
      boolean hasBuyNum();

      int getBuyNum();
   }

   public interface S2C_DailyUpdate_14634OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_DamageRank_14618OrBuilder extends MessageOrBuilder {
      List<RankMsg.RankData> getRanksList();

      RankMsg.RankData getRanks(int index);

      int getRanksCount();

      List<? extends RankMsg.RankDataOrBuilder> getRanksOrBuilderList();

      RankMsg.RankDataOrBuilder getRanksOrBuilder(int index);

      boolean hasMyRank();

      RankMsg.RankData getMyRank();

      RankMsg.RankDataOrBuilder getMyRankOrBuilder();
   }

   public interface S2C_DelOffer_14608OrBuilder extends MessageOrBuilder {
      List<Integer> getCodesList();

      int getCodesCount();

      int getCodes(int index);
   }

   public interface S2C_EnterView_14602OrBuilder extends MessageOrBuilder {
      boolean hasFightNum();

      int getFightNum();

      boolean hasBuyNum();

      int getBuyNum();

      List<OfferRewardInfo> getInfoList();

      OfferRewardInfo getInfo(int index);

      int getInfoCount();

      List<? extends OfferRewardInfoOrBuilder> getInfoOrBuilderList();

      OfferRewardInfoOrBuilder getInfoOrBuilder(int index);

      boolean hasRankInfo();

      EasyRankInfo getRankInfo();

      EasyRankInfoOrBuilder getRankInfoOrBuilder();

      boolean hasUnionCopyNum();

      int getUnionCopyNum();

      boolean hasUnionPublishNum();

      int getUnionPublishNum();

      boolean hasCoolTime();

      int getCoolTime();
   }

   public interface S2C_MyRankPoint_14620OrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasWeekPoint();

      int getWeekPoint();
   }

   public interface S2C_OfferDetail_14616OrBuilder extends MessageOrBuilder {
      boolean hasCode();

      int getCode();

      boolean hasCreateTime();

      int getCreateTime();

      boolean hasCurHp();

      long getCurHp();

      boolean hasTotalHp();

      long getTotalHp();

      boolean hasServerId();

      int getServerId();

      boolean hasUnionId();

      int getUnionId();

      boolean hasUnionName();

      String getUnionName();

      ByteString getUnionNameBytes();

      boolean hasOfferHeroId();

      int getOfferHeroId();

      boolean hasMyHurt();

      long getMyHurt();

      List<RankMsg.RankData> getRanksList();

      RankMsg.RankData getRanks(int index);

      int getRanksCount();

      List<? extends RankMsg.RankDataOrBuilder> getRanksOrBuilderList();

      RankMsg.RankDataOrBuilder getRanksOrBuilder(int index);

      boolean hasMyRank();

      RankMsg.RankData getMyRank();

      RankMsg.RankDataOrBuilder getMyRankOrBuilder();
   }

   public interface S2C_PointRank_14632OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      List<OfferRankData> getRanksList();

      OfferRankData getRanks(int index);

      int getRanksCount();

      List<? extends OfferRankDataOrBuilder> getRanksOrBuilderList();

      OfferRankDataOrBuilder getRanksOrBuilder(int index);

      boolean hasMyRank();

      OfferRankData getMyRank();

      OfferRankDataOrBuilder getMyRankOrBuilder();
   }

   public interface S2C_PublishOffer_14622OrBuilder extends MessageOrBuilder {
   }

   public interface S2C_Record_14612OrBuilder extends MessageOrBuilder {
      List<RecordInfo> getRecordInfoList();

      RecordInfo getRecordInfo(int index);

      int getRecordInfoCount();

      List<? extends RecordInfoOrBuilder> getRecordInfoOrBuilderList();

      RecordInfoOrBuilder getRecordInfoOrBuilder(int index);
   }

   public interface S2C_ShopLv_14614OrBuilder extends MessageOrBuilder {
      boolean hasPoint();

      int getPoint();

      boolean hasShopLv();

      int getShopLv();
   }

   public interface S2C_UpdateFight_14610OrBuilder extends MessageOrBuilder {
      boolean hasFightNum();

      int getFightNum();

      boolean hasBuyNum();

      int getBuyNum();
   }

   public interface S2C_UpdateOffer_14606OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      OfferRewardInfo getInfo();

      OfferRewardInfoOrBuilder getInfoOrBuilder();
   }
}
