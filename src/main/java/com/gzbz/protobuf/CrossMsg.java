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

public final class CrossMsg {
   private static final Descriptors.Descriptor internal_static_common_CR2S_PlayerBaseData_4201_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_CR2S_PlayerBaseData_4201_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_PlayerBaseData_4202_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_PlayerBaseData_4202_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_Login_4203_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_Login_4203_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_CR2S_Login_4204_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_CR2S_Login_4204_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_CR2S_BattleRecord_4206_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_CR2S_BattleRecord_4206_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_PlayBattleRecord_4207_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_PlayBattleRecord_4207_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_CR2S_PlayBattleRecord_4208_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_CR2S_PlayBattleRecord_4208_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_CrossGm_4209_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_CrossGm_4209_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_CR2S_OhterServerBattleRecord_4211_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_CR2S_OhterServerBattleRecord_4211_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_CR2S_ChangeInfoResult_4212_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_CR2S_ChangeInfoResult_4212_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_Update_4213_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_Update_4213_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_CR2S_DelRecordByModel_4215_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_CR2S_DelRecordByModel_4215_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_UnionUpload_4216_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_UnionUpload_4216_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_MergeServer_4217_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_MergeServer_4217_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_MergeServer_4218_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_MergeServer_4218_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_SlaveBeMerge_4219_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_SlaveBeMerge_4219_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_CrossPKList_4220_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_CrossPKList_4220_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2S_CrossPK_4221_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2S_CrossPK_4221_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_UploadKoiRecord_4222_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_UploadKoiRecord_4222_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_UploadLaborDayRecord_4223_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_UploadLaborDayRecord_4223_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_UploadWishStarRecord_4224_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_UploadWishStarRecord_4224_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_UploadZongQingRecord_4225_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_UploadZongQingRecord_4225_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_UploadFlowerFireRecord_4226_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_UploadFlowerFireRecord_4226_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_UploadSwimParkRecord_4227_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_UploadSwimParkRecord_4227_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_UploadQiXiRecord_4228_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_UploadQiXiRecord_4228_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_UploadMidAutumnRecord_4229_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_UploadMidAutumnRecord_4229_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_UploadYuanDanRecord_22636_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_UploadYuanDanRecord_22636_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_UploadGuoQingRecord_4251_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_UploadGuoQingRecord_4251_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_UploadFirstYearRecord_4252_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_UploadFirstYearRecord_4252_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_UploadFirstYearTreasureNum_4253_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_UploadFirstYearTreasureNum_4253_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_UploadChineseNewYearTreasureNum_4254_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_UploadChineseNewYearTreasureNum_4254_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_UploadChineseNewYearRecord_4255_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_UploadChineseNewYearRecord_4255_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_UploadYuanXiaoRecord_4256_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_UploadYuanXiaoRecord_4256_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_UploadAliveNum_4257_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_UploadAliveNum_4257_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_CR2S_UploadAliveNum_4258_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_CR2S_UploadAliveNum_4258_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_UploadGoldWeekRecord_4259_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_UploadGoldWeekRecord_4259_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_UploadSplendidCityRecord_4260_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_UploadSplendidCityRecord_4260_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_UploadChildRecord_4261_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_UploadChildRecord_4261_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_UploadGetFlowerData_4262_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_UploadGetFlowerData_4262_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_UploadBroodDrawData_4263_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_UploadBroodDrawData_4263_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_UploadSummerRecord_4264_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_UploadSummerRecord_4264_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_common_S2CR_UploadWinterRecord_4265_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_common_S2CR_UploadWinterRecord_4265_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private CrossMsg() {
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
      String[] descriptorData = new String[]{"\n\u000bCross.proto\u0012\u0006common\u001a\fBattle.proto\u001a\fcommon.proto\">\n\u0018CR2S_PlayerBaseData_4201\u0012\u0010\n\bserverId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\"\u0092\u0003\n\u0018S2CR_PlayerBaseData_4202\u0012\u0010\n\bserverId\u0018\u0001 \u0001(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0001(\u0005\u0012\u0012\n\nplayerName\u0018\u0003 \u0001(\t\u0012\u000b\n\u0003sex\u0018\u0004 \u0001(\u0005\u0012\n\n\u0002lv\u0018\u0005 \u0001(\u0005\u0012\u0013\n\u000bcombatPower\u0018\u0006 \u0001(\u0003\u0012\u000e\n\u0006headId\u0018\u0007 \u0001(\u0005\u0012\u0011\n\theadFrame\u0018\b \u0001(\u0005\u0012\u0010\n\bprestige\u0018\t \u0001(\u0005\u0012\u0011\n\tmonarchId\u0018\n \u0001(\u0005\u0012\u000f\n\u0007unionId\u0018\u000b \u0001(\u0005\u0012\u000e\n\u0006vipLev\u0018\f \u0001(\u0005\u0012\u0011\n\tunionName\u0018\r \u0001(\t\u0012\u000f\n\u0007showVip\u0018\u000e \u0001(\b\u0012\u0013\n\u000bsecondTitle\u0018\u000f \u0001(\u0005\u0012\u000e\n\u0006peakLv\u0018\u0010 \u0001(\u0005\u0012\u0015\n\rprivilegeMine\u0018\u0011 \u0001(\u0005\u0012\u0013\n\u000bpalaceTitle\u0018\u0012 \u0001(\u0005\u0012\u000e\n\u0006qqLogo\u0018\u0013 \u0001(\t\u0012\u0011\n\tqqWanKaLv\u0018\u0014 \u0001(\u0005\u0012\u000f\n\u0007heroNum\u0018\u0015 \u0001(\u0005\"²\u0001\n\u000fS2CR_Login_4203\u0012\u0010\n\bserverId\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007groupId\u0018\u0002 \u0001(\u0005\u0012\u0015\n\rslaveServerId\u0018\u0003 \u0003(\u0005\u0012\u0012\n\nplatformId\u0018\u0004 \u0002(\u0005\u0012\u000f\n\u0007worldLv\u0018\u0005 \u0002(\u0005\u0012\u0010\n\bopenTime\u0018\u0006 \u0002(\u0003\u0012\u0019\n\u0011curAlivePlayerNum\u0018\u0007 \u0002(\u0003\u0012\u0013\n\u000bcurAvgPower\u0018\b \u0002(\u0003\"\u0011\n\u000fCR2S_Login_4204\"m\n\u0016CR2S_BattleRecord_4206\u0012D\n\u000bfightResult\u0018\u0001 \u0003(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\u0012\r\n\u0005isdef\u0018\u0002 \u0001(\b\"y\n\u001aS2CR_PlayBattleRecord_4207\u0012\u0010\n\brecordId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bsystemid\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bserverId\u0018\u0003 \u0002(\u0005\u0012\u0012\n\nrecordType\u0018\u0004 \u0002(\u0005\u0012\u0011\n\tstartTime\u0018\u0005 \u0002(\u0005\"m\n\u001aCR2S_PlayBattleRecord_4208\u0012\u0010\n\brecordId\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bsystemid\u0018\u0002 \u0002(\u0005\u0012\u0014\n\fplayPlayerId\u0018\u0003 \u0002(\u0005\u0012\u0015\n\rplayServierId\u0018\u0004 \u0002(\u0005\" \n\u0011S2CR_CrossGm_4209\u0012\u000b\n\u0003cmd\u0018\u0001 \u0002(\t\"\u0096\u0001\n!CR2S_OhterServerBattleRecord_4211\u0012\u0014\n\fplayPlayerId\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rplayServierId\u0018\u0002 \u0002(\u0005\u0012D\n\u000bfightResult\u0018\u0003 \u0002(\u000b2/.battle.com.gzbz.protobuf.S2C_BattleResult_6102\"+\n\u001aCR2S_ChangeInfoResult_4212\u0012\r\n\u0005group\u0018\u0001 \u0002(\u0005\"³\u0001\n\u0010S2CR_Update_4213\u0012\u0010\n\bserverId\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007groupId\u0018\u0002 \u0001(\u0005\u0012\u0015\n\rslaveServerId\u0018\u0003 \u0003(\u0005\u0012\u0012\n\nplatformId\u0018\u0004 \u0002(\u0005\u0012\u000f\n\u0007worldLv\u0018\u0005 \u0002(\u0005\u0012\u0010\n\bopenTime\u0018\u0006 \u0002(\u0003\u0012\u0019\n\u0011curAlivePlayerNum\u0018\u0007 \u0002(\u0003\u0012\u0013\n\u000bcurAvgPower\u0018\b \u0002(\u0003\"+\n\u001aCR2S_DelRecordByModel_4215\u0012\r\n\u0005model\u0018\u0001 \u0002(\u0005\"¡\u0001\n\u0015S2CR_UnionUpload_4216\u0012\u0011\n\tonConnect\u0018\u0001 \u0002(\b\u0012\n\n\u0002id\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004name\u0018\u0003 \u0001(\t\u0012\n\n\u0002lv\u0018\u0004 \u0001(\u0005\u0012\u000e\n\u0006copyId\u0018\u0005 \u0001(\u0005\u0012\u000e\n\u0006server\u0018\u0006 \u0001(\u0005\u0012\u000e\n\u0006leader\u0018\u0007 \u0001(\u0005\u0012\u0011\n\tisDismiss\u0018\b \u0002(\b\u0012\f\n\u0004head\u0018\t \u0001(\u0005\"9\n\u0015S2CR_MergeServer_4217\u0012\u000e\n\u0006mainid\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bslaveIds\u0018\u0002 \u0003(\u0005\"'\n\u0015S2CR_MergeServer_4218\u0012\u000e\n\u0006result\u0018\u0001 \u0002(\b\"(\n\u0016S2CR_SlaveBeMerge_4219\u0012\u000e\n\u0006mainId\u0018\u0001 \u0002(\u0005\"h\n\u0015S2CR_CrossPKList_4220\u0012\r\n\u0005power\u0018\u0001 \u0002(\u0003\u0012\u0015\n\rmatchPowerMin\u0018\u0002 \u0002(\u0003\u0012\u0015\n\rmatchPowerMax\u0018\u0003 \u0002(\u0003\u0012\u0012\n\nplayerName\u0018\u0004 \u0001(\t\"S\n\u0010S2S_CrossPK_4221\u0012\u0014\n\farrayingData\u0018\u0001 \u0002(\f\u0012)\n\ratkPlayerInfo\u0018\u0002 \u0002(\u000b2\u0012.common.PlayerInfo\">\n\u0019S2CR_UploadKoiRecord_4222\u0012\u0012\n\nplayerName\u0018\u0001 \u0002(\t\u0012\r\n\u0005label\u0018\u0002 \u0002(\u0005\"K\n\u001eS2CR_UploadLaborDayRecord_4223\u0012\u0012\n\nplayerName\u0018\u0001 \u0002(\t\u0012\u0015\n\rbelovedItemId\u0018\u0002 \u0002(\u0005\"K\n\u001eS2CR_UploadWishStarRecord_4224\u0012\u0012\n\nplayerName\u0018\u0001 \u0002(\t\u0012\u0015\n\rbelovedItemId\u0018\u0002 \u0002(\u0005\"K\n\u001eS2CR_UploadZongQingRecord_4225\u0012\u0012\n\nplayerName\u0018\u0001 \u0002(\t\u0012\u0015\n\rbelovedItemId\u0018\u0002 \u0002(\u0005\"M\n S2CR_UploadFlowerFireRecord_4226\u0012\u0012\n\nplayerName\u0018\u0001 \u0002(\t\u0012\u0015\n\rbelovedItemId\u0018\u0002 \u0002(\u0005\"K\n\u001eS2CR_UploadSwimParkRecord_4227\u0012\u0012\n\nplayerName\u0018\u0001 \u0002(\t\u0012\u0015\n\rbelovedItemId\u0018\u0002 \u0002(\u0005\"V\n\u001aS2CR_UploadQiXiRecord_4228\u0012\u0012\n\nplayerName\u0018\u0001 \u0002(\t\u0012\u0015\n\rbelovedItemId\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0003 \u0002(\u0005\"[\n\u001fS2CR_UploadMidAutumnRecord_4229\u0012\u0012\n\nplayerName\u0018\u0001 \u0002(\t\u0012\u0015\n\rbelovedItemId\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0003 \u0002(\u0005\"Z\n\u001eS2CR_UploadYuanDanRecord_22636\u0012\u0012\n\nplayerName\u0018\u0001 \u0002(\t\u0012\u0015\n\rbelovedItemId\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0003 \u0002(\u0005\"Y\n\u001dS2CR_UploadGuoQingRecord_4251\u0012\u0012\n\nplayerName\u0018\u0001 \u0002(\t\u0012\u0015\n\rbelovedItemId\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0003 \u0002(\u0005\"[\n\u001fS2CR_UploadFirstYearRecord_4252\u0012\u0012\n\nplayerName\u0018\u0001 \u0002(\t\u0012\u0015\n\rbelovedItemId\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0003 \u0002(\u0005\"h\n$S2CR_UploadFirstYearTreasureNum_4253\u0012\u0010\n\bserverId\u0018\u0001 \u0001(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0001(\u0005\u0012\u001c\n\u0014firstYearTreasureNum\u0018\u0003 \u0001(\u0003\"r\n)S2CR_UploadChineseNewYearTreasureNum_4254\u0012\u0010\n\bserverId\u0018\u0001 \u0001(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0001(\u0005\u0012!\n\u0019chineseNewYearTreasureNum\u0018\u0003 \u0001(\u0003\"`\n$S2CR_UploadChineseNewYearRecord_4255\u0012\u0012\n\nplayerName\u0018\u0001 \u0002(\t\u0012\u0015\n\rbelovedItemId\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0003 \u0002(\u0005\"K\n\u001eS2CR_UploadYuanXiaoRecord_4256\u0012\u0012\n\nplayerName\u0018\u0001 \u0002(\t\u0012\u0015\n\rbelovedItemId\u0018\u0002 \u0002(\u0005\"1\n\u0018S2CR_UploadAliveNum_4257\u0012\u0015\n\rlastWeeklyNum\u0018\u0001 \u0002(\u0003\"\u001a\n\u0018CR2S_UploadAliveNum_4258\"Z\n\u001eS2CR_UploadGoldWeekRecord_4259\u0012\u0012\n\nplayerName\u0018\u0001 \u0002(\t\u0012\u0015\n\rbelovedItemId\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0003 \u0002(\u0005\"^\n\"S2CR_UploadSplendidCityRecord_4260\u0012\u0012\n\nplayerName\u0018\u0001 \u0002(\t\u0012\u0015\n\rbelovedItemId\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0003 \u0002(\u0005\"W\n\u001bS2CR_UploadChildRecord_4261\u0012\u0012\n\nplayerName\u0018\u0001 \u0002(\t\u0012\u0015\n\rbelovedItemId\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0003 \u0002(\u0005\"L\n\u001dS2CR_UploadGetFlowerData_4262\u0012\u0014\n\fsendPlayerId\u0018\u0001 \u0002(\u0005\u0012\u0015\n\rsendFlowerNum\u0018\u0002 \u0002(\u0005\"k\n\u001dS2CR_UploadBroodDrawData_4263\u0012\u0012\n\nplayerName\u0018\u0001 \u0002(\t\u0012\u0015\n\rbelovedItemId\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0003 \u0002(\u0005\u0012\u0010\n\bslotType\u0018\u0004 \u0002(\u0005\"X\n\u001cS2CR_UploadSummerRecord_4264\u0012\u0012\n\nplayerName\u0018\u0001 \u0002(\t\u0012\u0015\n\rbelovedItemId\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0003 \u0002(\u0005\"X\n\u001cS2CR_UploadWinterRecord_4265\u0012\u0012\n\nplayerName\u0018\u0001 \u0002(\t\u0012\u0015\n\rbelovedItemId\u0018\u0002 \u0002(\u0005\u0012\r\n\u0005stage\u0018\u0003 \u0002(\u0005B\u001f\n\u0011com.gzbz.protobufB\bCrossMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{BattleMsg.getDescriptor(), CommonMsg.getDescriptor()});
      internal_static_common_CR2S_PlayerBaseData_4201_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_common_CR2S_PlayerBaseData_4201_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_CR2S_PlayerBaseData_4201_descriptor, new String[]{"ServerId", "PlayerId"});
      internal_static_common_S2CR_PlayerBaseData_4202_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_common_S2CR_PlayerBaseData_4202_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_PlayerBaseData_4202_descriptor, new String[]{"ServerId", "PlayerId", "PlayerName", "Sex", "Lv", "CombatPower", "HeadId", "HeadFrame", "Prestige", "MonarchId", "UnionId", "VipLev", "UnionName", "ShowVip", "SecondTitle", "PeakLv", "PrivilegeMine", "PalaceTitle", "QqLogo", "QqWanKaLv", "HeroNum"});
      internal_static_common_S2CR_Login_4203_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_common_S2CR_Login_4203_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_Login_4203_descriptor, new String[]{"ServerId", "GroupId", "SlaveServerId", "PlatformId", "WorldLv", "OpenTime", "CurAlivePlayerNum", "CurAvgPower"});
      internal_static_common_CR2S_Login_4204_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_common_CR2S_Login_4204_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_CR2S_Login_4204_descriptor, new String[0]);
      internal_static_common_CR2S_BattleRecord_4206_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_common_CR2S_BattleRecord_4206_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_CR2S_BattleRecord_4206_descriptor, new String[]{"FightResult", "Isdef"});
      internal_static_common_S2CR_PlayBattleRecord_4207_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_common_S2CR_PlayBattleRecord_4207_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_PlayBattleRecord_4207_descriptor, new String[]{"RecordId", "Systemid", "ServerId", "RecordType", "StartTime"});
      internal_static_common_CR2S_PlayBattleRecord_4208_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_common_CR2S_PlayBattleRecord_4208_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_CR2S_PlayBattleRecord_4208_descriptor, new String[]{"RecordId", "Systemid", "PlayPlayerId", "PlayServierId"});
      internal_static_common_S2CR_CrossGm_4209_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_common_S2CR_CrossGm_4209_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_CrossGm_4209_descriptor, new String[]{"Cmd"});
      internal_static_common_CR2S_OhterServerBattleRecord_4211_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_common_CR2S_OhterServerBattleRecord_4211_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_CR2S_OhterServerBattleRecord_4211_descriptor, new String[]{"PlayPlayerId", "PlayServierId", "FightResult"});
      internal_static_common_CR2S_ChangeInfoResult_4212_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_common_CR2S_ChangeInfoResult_4212_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_CR2S_ChangeInfoResult_4212_descriptor, new String[]{"Group"});
      internal_static_common_S2CR_Update_4213_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_common_S2CR_Update_4213_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_Update_4213_descriptor, new String[]{"ServerId", "GroupId", "SlaveServerId", "PlatformId", "WorldLv", "OpenTime", "CurAlivePlayerNum", "CurAvgPower"});
      internal_static_common_CR2S_DelRecordByModel_4215_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_common_CR2S_DelRecordByModel_4215_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_CR2S_DelRecordByModel_4215_descriptor, new String[]{"Model"});
      internal_static_common_S2CR_UnionUpload_4216_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_common_S2CR_UnionUpload_4216_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_UnionUpload_4216_descriptor, new String[]{"OnConnect", "Id", "Name", "Lv", "CopyId", "Server", "Leader", "IsDismiss", "Head"});
      internal_static_common_S2CR_MergeServer_4217_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_common_S2CR_MergeServer_4217_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_MergeServer_4217_descriptor, new String[]{"Mainid", "SlaveIds"});
      internal_static_common_S2CR_MergeServer_4218_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_common_S2CR_MergeServer_4218_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_MergeServer_4218_descriptor, new String[]{"Result"});
      internal_static_common_S2CR_SlaveBeMerge_4219_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_common_S2CR_SlaveBeMerge_4219_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_SlaveBeMerge_4219_descriptor, new String[]{"MainId"});
      internal_static_common_S2CR_CrossPKList_4220_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_common_S2CR_CrossPKList_4220_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_CrossPKList_4220_descriptor, new String[]{"Power", "MatchPowerMin", "MatchPowerMax", "PlayerName"});
      internal_static_common_S2S_CrossPK_4221_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_common_S2S_CrossPK_4221_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2S_CrossPK_4221_descriptor, new String[]{"ArrayingData", "AtkPlayerInfo"});
      internal_static_common_S2CR_UploadKoiRecord_4222_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_common_S2CR_UploadKoiRecord_4222_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_UploadKoiRecord_4222_descriptor, new String[]{"PlayerName", "Label"});
      internal_static_common_S2CR_UploadLaborDayRecord_4223_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_common_S2CR_UploadLaborDayRecord_4223_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_UploadLaborDayRecord_4223_descriptor, new String[]{"PlayerName", "BelovedItemId"});
      internal_static_common_S2CR_UploadWishStarRecord_4224_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_common_S2CR_UploadWishStarRecord_4224_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_UploadWishStarRecord_4224_descriptor, new String[]{"PlayerName", "BelovedItemId"});
      internal_static_common_S2CR_UploadZongQingRecord_4225_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_common_S2CR_UploadZongQingRecord_4225_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_UploadZongQingRecord_4225_descriptor, new String[]{"PlayerName", "BelovedItemId"});
      internal_static_common_S2CR_UploadFlowerFireRecord_4226_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_common_S2CR_UploadFlowerFireRecord_4226_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_UploadFlowerFireRecord_4226_descriptor, new String[]{"PlayerName", "BelovedItemId"});
      internal_static_common_S2CR_UploadSwimParkRecord_4227_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_common_S2CR_UploadSwimParkRecord_4227_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_UploadSwimParkRecord_4227_descriptor, new String[]{"PlayerName", "BelovedItemId"});
      internal_static_common_S2CR_UploadQiXiRecord_4228_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_common_S2CR_UploadQiXiRecord_4228_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_UploadQiXiRecord_4228_descriptor, new String[]{"PlayerName", "BelovedItemId", "Stage"});
      internal_static_common_S2CR_UploadMidAutumnRecord_4229_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_common_S2CR_UploadMidAutumnRecord_4229_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_UploadMidAutumnRecord_4229_descriptor, new String[]{"PlayerName", "BelovedItemId", "Stage"});
      internal_static_common_S2CR_UploadYuanDanRecord_22636_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_common_S2CR_UploadYuanDanRecord_22636_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_UploadYuanDanRecord_22636_descriptor, new String[]{"PlayerName", "BelovedItemId", "Stage"});
      internal_static_common_S2CR_UploadGuoQingRecord_4251_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_common_S2CR_UploadGuoQingRecord_4251_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_UploadGuoQingRecord_4251_descriptor, new String[]{"PlayerName", "BelovedItemId", "Stage"});
      internal_static_common_S2CR_UploadFirstYearRecord_4252_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_common_S2CR_UploadFirstYearRecord_4252_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_UploadFirstYearRecord_4252_descriptor, new String[]{"PlayerName", "BelovedItemId", "Stage"});
      internal_static_common_S2CR_UploadFirstYearTreasureNum_4253_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_common_S2CR_UploadFirstYearTreasureNum_4253_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_UploadFirstYearTreasureNum_4253_descriptor, new String[]{"ServerId", "PlayerId", "FirstYearTreasureNum"});
      internal_static_common_S2CR_UploadChineseNewYearTreasureNum_4254_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_common_S2CR_UploadChineseNewYearTreasureNum_4254_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_UploadChineseNewYearTreasureNum_4254_descriptor, new String[]{"ServerId", "PlayerId", "ChineseNewYearTreasureNum"});
      internal_static_common_S2CR_UploadChineseNewYearRecord_4255_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_common_S2CR_UploadChineseNewYearRecord_4255_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_UploadChineseNewYearRecord_4255_descriptor, new String[]{"PlayerName", "BelovedItemId", "Stage"});
      internal_static_common_S2CR_UploadYuanXiaoRecord_4256_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_common_S2CR_UploadYuanXiaoRecord_4256_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_UploadYuanXiaoRecord_4256_descriptor, new String[]{"PlayerName", "BelovedItemId"});
      internal_static_common_S2CR_UploadAliveNum_4257_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_common_S2CR_UploadAliveNum_4257_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_UploadAliveNum_4257_descriptor, new String[]{"LastWeeklyNum"});
      internal_static_common_CR2S_UploadAliveNum_4258_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_common_CR2S_UploadAliveNum_4258_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_CR2S_UploadAliveNum_4258_descriptor, new String[0]);
      internal_static_common_S2CR_UploadGoldWeekRecord_4259_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(35);
      internal_static_common_S2CR_UploadGoldWeekRecord_4259_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_UploadGoldWeekRecord_4259_descriptor, new String[]{"PlayerName", "BelovedItemId", "Stage"});
      internal_static_common_S2CR_UploadSplendidCityRecord_4260_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(36);
      internal_static_common_S2CR_UploadSplendidCityRecord_4260_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_UploadSplendidCityRecord_4260_descriptor, new String[]{"PlayerName", "BelovedItemId", "Stage"});
      internal_static_common_S2CR_UploadChildRecord_4261_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(37);
      internal_static_common_S2CR_UploadChildRecord_4261_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_UploadChildRecord_4261_descriptor, new String[]{"PlayerName", "BelovedItemId", "Stage"});
      internal_static_common_S2CR_UploadGetFlowerData_4262_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(38);
      internal_static_common_S2CR_UploadGetFlowerData_4262_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_UploadGetFlowerData_4262_descriptor, new String[]{"SendPlayerId", "SendFlowerNum"});
      internal_static_common_S2CR_UploadBroodDrawData_4263_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(39);
      internal_static_common_S2CR_UploadBroodDrawData_4263_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_UploadBroodDrawData_4263_descriptor, new String[]{"PlayerName", "BelovedItemId", "Stage", "SlotType"});
      internal_static_common_S2CR_UploadSummerRecord_4264_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(40);
      internal_static_common_S2CR_UploadSummerRecord_4264_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_UploadSummerRecord_4264_descriptor, new String[]{"PlayerName", "BelovedItemId", "Stage"});
      internal_static_common_S2CR_UploadWinterRecord_4265_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(41);
      internal_static_common_S2CR_UploadWinterRecord_4265_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_common_S2CR_UploadWinterRecord_4265_descriptor, new String[]{"PlayerName", "BelovedItemId", "Stage"});
      BattleMsg.getDescriptor();
      CommonMsg.getDescriptor();
   }

   public static final class CR2S_PlayerBaseData_4201 extends GeneratedMessageV3 implements CR2S_PlayerBaseData_4201OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SERVERID_FIELD_NUMBER = 1;
      private int serverId_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      private byte memoizedIsInitialized;
      private static final CR2S_PlayerBaseData_4201 DEFAULT_INSTANCE = new CR2S_PlayerBaseData_4201();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_PlayerBaseData_4201> PARSER = new AbstractParser<CR2S_PlayerBaseData_4201>() {
         public CR2S_PlayerBaseData_4201 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_PlayerBaseData_4201(input, extensionRegistry);
         }
      };

      private CR2S_PlayerBaseData_4201(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_PlayerBaseData_4201() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_PlayerBaseData_4201();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_PlayerBaseData_4201(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                     case 16:
                        this.bitField0_ |= 2;
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
         return CrossMsg.internal_static_common_CR2S_PlayerBaseData_4201_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_CR2S_PlayerBaseData_4201_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_PlayerBaseData_4201.class, Builder.class);
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 2) != 0;
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
         } else if (!this.hasServerId()) {
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
            output.writeInt32(1, this.serverId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playerId_);
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
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_PlayerBaseData_4201)) {
            return super.equals(obj);
         } else {
            CR2S_PlayerBaseData_4201 other = (CR2S_PlayerBaseData_4201)obj;
            if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
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
            if (this.hasServerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_PlayerBaseData_4201 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_PlayerBaseData_4201)PARSER.parseFrom(data);
      }

      public static CR2S_PlayerBaseData_4201 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PlayerBaseData_4201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PlayerBaseData_4201 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_PlayerBaseData_4201)PARSER.parseFrom(data);
      }

      public static CR2S_PlayerBaseData_4201 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PlayerBaseData_4201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PlayerBaseData_4201 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_PlayerBaseData_4201)PARSER.parseFrom(data);
      }

      public static CR2S_PlayerBaseData_4201 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PlayerBaseData_4201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PlayerBaseData_4201 parseFrom(InputStream input) throws IOException {
         return (CR2S_PlayerBaseData_4201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_PlayerBaseData_4201 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PlayerBaseData_4201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_PlayerBaseData_4201 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_PlayerBaseData_4201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_PlayerBaseData_4201 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PlayerBaseData_4201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_PlayerBaseData_4201 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_PlayerBaseData_4201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_PlayerBaseData_4201 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PlayerBaseData_4201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_PlayerBaseData_4201 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_PlayerBaseData_4201 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_PlayerBaseData_4201> parser() {
         return PARSER;
      }

      public Parser<CR2S_PlayerBaseData_4201> getParserForType() {
         return PARSER;
      }

      public CR2S_PlayerBaseData_4201 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_PlayerBaseData_4201OrBuilder {
         private int bitField0_;
         private int serverId_;
         private int playerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_CR2S_PlayerBaseData_4201_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_CR2S_PlayerBaseData_4201_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_PlayerBaseData_4201.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.CR2S_PlayerBaseData_4201.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.serverId_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_CR2S_PlayerBaseData_4201_descriptor;
         }

         public CR2S_PlayerBaseData_4201 getDefaultInstanceForType() {
            return CrossMsg.CR2S_PlayerBaseData_4201.getDefaultInstance();
         }

         public CR2S_PlayerBaseData_4201 build() {
            CR2S_PlayerBaseData_4201 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_PlayerBaseData_4201 buildPartial() {
            CR2S_PlayerBaseData_4201 result = new CR2S_PlayerBaseData_4201(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.playerId_ = this.playerId_;
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
            if (other instanceof CR2S_PlayerBaseData_4201) {
               return this.mergeFrom((CR2S_PlayerBaseData_4201)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_PlayerBaseData_4201 other) {
            if (other == CrossMsg.CR2S_PlayerBaseData_4201.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasServerId()) {
               return false;
            } else {
               return this.hasPlayerId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_PlayerBaseData_4201 parsedMessage = null;

            try {
               parsedMessage = (CR2S_PlayerBaseData_4201)CrossMsg.CR2S_PlayerBaseData_4201.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_PlayerBaseData_4201)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_PlayerBaseData_4202 extends GeneratedMessageV3 implements S2CR_PlayerBaseData_4202OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SERVERID_FIELD_NUMBER = 1;
      private int serverId_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int PLAYERNAME_FIELD_NUMBER = 3;
      private volatile Object playerName_;
      public static final int SEX_FIELD_NUMBER = 4;
      private int sex_;
      public static final int LV_FIELD_NUMBER = 5;
      private int lv_;
      public static final int COMBATPOWER_FIELD_NUMBER = 6;
      private long combatPower_;
      public static final int HEADID_FIELD_NUMBER = 7;
      private int headId_;
      public static final int HEADFRAME_FIELD_NUMBER = 8;
      private int headFrame_;
      public static final int PRESTIGE_FIELD_NUMBER = 9;
      private int prestige_;
      public static final int MONARCHID_FIELD_NUMBER = 10;
      private int monarchId_;
      public static final int UNIONID_FIELD_NUMBER = 11;
      private int unionId_;
      public static final int VIPLEV_FIELD_NUMBER = 12;
      private int vipLev_;
      public static final int UNIONNAME_FIELD_NUMBER = 13;
      private volatile Object unionName_;
      public static final int SHOWVIP_FIELD_NUMBER = 14;
      private boolean showVip_;
      public static final int SECONDTITLE_FIELD_NUMBER = 15;
      private int secondTitle_;
      public static final int PEAKLV_FIELD_NUMBER = 16;
      private int peakLv_;
      public static final int PRIVILEGEMINE_FIELD_NUMBER = 17;
      private int privilegeMine_;
      public static final int PALACETITLE_FIELD_NUMBER = 18;
      private int palaceTitle_;
      public static final int QQLOGO_FIELD_NUMBER = 19;
      private volatile Object qqLogo_;
      public static final int QQWANKALV_FIELD_NUMBER = 20;
      private int qqWanKaLv_;
      public static final int HERONUM_FIELD_NUMBER = 21;
      private int heroNum_;
      private byte memoizedIsInitialized;
      private static final S2CR_PlayerBaseData_4202 DEFAULT_INSTANCE = new S2CR_PlayerBaseData_4202();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_PlayerBaseData_4202> PARSER = new AbstractParser<S2CR_PlayerBaseData_4202>() {
         public S2CR_PlayerBaseData_4202 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_PlayerBaseData_4202(input, extensionRegistry);
         }
      };

      private S2CR_PlayerBaseData_4202(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_PlayerBaseData_4202() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
         this.unionName_ = "";
         this.qqLogo_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_PlayerBaseData_4202();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_PlayerBaseData_4202(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.playerId_ = input.readInt32();
                        break;
                     case 26:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4;
                        this.playerName_ = bs;
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.sex_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.lv_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.combatPower_ = input.readInt64();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.headId_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.headFrame_ = input.readInt32();
                        break;
                     case 72:
                        this.bitField0_ |= 256;
                        this.prestige_ = input.readInt32();
                        break;
                     case 80:
                        this.bitField0_ |= 512;
                        this.monarchId_ = input.readInt32();
                        break;
                     case 88:
                        this.bitField0_ |= 1024;
                        this.unionId_ = input.readInt32();
                        break;
                     case 96:
                        this.bitField0_ |= 2048;
                        this.vipLev_ = input.readInt32();
                        break;
                     case 106:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4096;
                        this.unionName_ = bs;
                        break;
                     case 112:
                        this.bitField0_ |= 8192;
                        this.showVip_ = input.readBool();
                        break;
                     case 120:
                        this.bitField0_ |= 16384;
                        this.secondTitle_ = input.readInt32();
                        break;
                     case 128:
                        this.bitField0_ |= 32768;
                        this.peakLv_ = input.readInt32();
                        break;
                     case 136:
                        this.bitField0_ |= 65536;
                        this.privilegeMine_ = input.readInt32();
                        break;
                     case 144:
                        this.bitField0_ |= 131072;
                        this.palaceTitle_ = input.readInt32();
                        break;
                     case 154:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 262144;
                        this.qqLogo_ = bs;
                        break;
                     case 160:
                        this.bitField0_ |= 524288;
                        this.qqWanKaLv_ = input.readInt32();
                        break;
                     case 168:
                        this.bitField0_ |= 1048576;
                        this.heroNum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_PlayerBaseData_4202_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_PlayerBaseData_4202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerBaseData_4202.class, Builder.class);
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 4) != 0;
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

      public boolean hasSex() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getSex() {
         return this.sex_;
      }

      public boolean hasLv() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getLv() {
         return this.lv_;
      }

      public boolean hasCombatPower() {
         return (this.bitField0_ & 32) != 0;
      }

      public long getCombatPower() {
         return this.combatPower_;
      }

      public boolean hasHeadId() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getHeadId() {
         return this.headId_;
      }

      public boolean hasHeadFrame() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getHeadFrame() {
         return this.headFrame_;
      }

      public boolean hasPrestige() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getPrestige() {
         return this.prestige_;
      }

      public boolean hasMonarchId() {
         return (this.bitField0_ & 512) != 0;
      }

      public int getMonarchId() {
         return this.monarchId_;
      }

      public boolean hasUnionId() {
         return (this.bitField0_ & 1024) != 0;
      }

      public int getUnionId() {
         return this.unionId_;
      }

      public boolean hasVipLev() {
         return (this.bitField0_ & 2048) != 0;
      }

      public int getVipLev() {
         return this.vipLev_;
      }

      public boolean hasUnionName() {
         return (this.bitField0_ & 4096) != 0;
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

      public boolean hasShowVip() {
         return (this.bitField0_ & 8192) != 0;
      }

      public boolean getShowVip() {
         return this.showVip_;
      }

      public boolean hasSecondTitle() {
         return (this.bitField0_ & 16384) != 0;
      }

      public int getSecondTitle() {
         return this.secondTitle_;
      }

      public boolean hasPeakLv() {
         return (this.bitField0_ & '耀') != 0;
      }

      public int getPeakLv() {
         return this.peakLv_;
      }

      public boolean hasPrivilegeMine() {
         return (this.bitField0_ & 65536) != 0;
      }

      public int getPrivilegeMine() {
         return this.privilegeMine_;
      }

      public boolean hasPalaceTitle() {
         return (this.bitField0_ & 131072) != 0;
      }

      public int getPalaceTitle() {
         return this.palaceTitle_;
      }

      public boolean hasQqLogo() {
         return (this.bitField0_ & 262144) != 0;
      }

      public String getQqLogo() {
         Object ref = this.qqLogo_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.qqLogo_ = s;
            }

            return s;
         }
      }

      public ByteString getQqLogoBytes() {
         Object ref = this.qqLogo_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.qqLogo_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public boolean hasQqWanKaLv() {
         return (this.bitField0_ & 524288) != 0;
      }

      public int getQqWanKaLv() {
         return this.qqWanKaLv_;
      }

      public boolean hasHeroNum() {
         return (this.bitField0_ & 1048576) != 0;
      }

      public int getHeroNum() {
         return this.heroNum_;
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
            output.writeInt32(1, this.serverId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(output, 3, this.playerName_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.sex_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.lv_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt64(6, this.combatPower_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.headId_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.headFrame_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.prestige_);
         }

         if ((this.bitField0_ & 512) != 0) {
            output.writeInt32(10, this.monarchId_);
         }

         if ((this.bitField0_ & 1024) != 0) {
            output.writeInt32(11, this.unionId_);
         }

         if ((this.bitField0_ & 2048) != 0) {
            output.writeInt32(12, this.vipLev_);
         }

         if ((this.bitField0_ & 4096) != 0) {
            GeneratedMessageV3.writeString(output, 13, this.unionName_);
         }

         if ((this.bitField0_ & 8192) != 0) {
            output.writeBool(14, this.showVip_);
         }

         if ((this.bitField0_ & 16384) != 0) {
            output.writeInt32(15, this.secondTitle_);
         }

         if ((this.bitField0_ & '耀') != 0) {
            output.writeInt32(16, this.peakLv_);
         }

         if ((this.bitField0_ & 65536) != 0) {
            output.writeInt32(17, this.privilegeMine_);
         }

         if ((this.bitField0_ & 131072) != 0) {
            output.writeInt32(18, this.palaceTitle_);
         }

         if ((this.bitField0_ & 262144) != 0) {
            GeneratedMessageV3.writeString(output, 19, this.qqLogo_);
         }

         if ((this.bitField0_ & 524288) != 0) {
            output.writeInt32(20, this.qqWanKaLv_);
         }

         if ((this.bitField0_ & 1048576) != 0) {
            output.writeInt32(21, this.heroNum_);
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
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += GeneratedMessageV3.computeStringSize(3, this.playerName_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.sex_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.lv_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt64Size(6, this.combatPower_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.headId_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.headFrame_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.prestige_);
            }

            if ((this.bitField0_ & 512) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.monarchId_);
            }

            if ((this.bitField0_ & 1024) != 0) {
               size += CodedOutputStream.computeInt32Size(11, this.unionId_);
            }

            if ((this.bitField0_ & 2048) != 0) {
               size += CodedOutputStream.computeInt32Size(12, this.vipLev_);
            }

            if ((this.bitField0_ & 4096) != 0) {
               size += GeneratedMessageV3.computeStringSize(13, this.unionName_);
            }

            if ((this.bitField0_ & 8192) != 0) {
               size += CodedOutputStream.computeBoolSize(14, this.showVip_);
            }

            if ((this.bitField0_ & 16384) != 0) {
               size += CodedOutputStream.computeInt32Size(15, this.secondTitle_);
            }

            if ((this.bitField0_ & '耀') != 0) {
               size += CodedOutputStream.computeInt32Size(16, this.peakLv_);
            }

            if ((this.bitField0_ & 65536) != 0) {
               size += CodedOutputStream.computeInt32Size(17, this.privilegeMine_);
            }

            if ((this.bitField0_ & 131072) != 0) {
               size += CodedOutputStream.computeInt32Size(18, this.palaceTitle_);
            }

            if ((this.bitField0_ & 262144) != 0) {
               size += GeneratedMessageV3.computeStringSize(19, this.qqLogo_);
            }

            if ((this.bitField0_ & 524288) != 0) {
               size += CodedOutputStream.computeInt32Size(20, this.qqWanKaLv_);
            }

            if ((this.bitField0_ & 1048576) != 0) {
               size += CodedOutputStream.computeInt32Size(21, this.heroNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_PlayerBaseData_4202)) {
            return super.equals(obj);
         } else {
            S2CR_PlayerBaseData_4202 other = (S2CR_PlayerBaseData_4202)obj;
            if (this.hasServerId() != other.hasServerId()) {
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
            } else if (this.hasSex() != other.hasSex()) {
               return false;
            } else if (this.hasSex() && this.getSex() != other.getSex()) {
               return false;
            } else if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
               return false;
            } else if (this.hasCombatPower() != other.hasCombatPower()) {
               return false;
            } else if (this.hasCombatPower() && this.getCombatPower() != other.getCombatPower()) {
               return false;
            } else if (this.hasHeadId() != other.hasHeadId()) {
               return false;
            } else if (this.hasHeadId() && this.getHeadId() != other.getHeadId()) {
               return false;
            } else if (this.hasHeadFrame() != other.hasHeadFrame()) {
               return false;
            } else if (this.hasHeadFrame() && this.getHeadFrame() != other.getHeadFrame()) {
               return false;
            } else if (this.hasPrestige() != other.hasPrestige()) {
               return false;
            } else if (this.hasPrestige() && this.getPrestige() != other.getPrestige()) {
               return false;
            } else if (this.hasMonarchId() != other.hasMonarchId()) {
               return false;
            } else if (this.hasMonarchId() && this.getMonarchId() != other.getMonarchId()) {
               return false;
            } else if (this.hasUnionId() != other.hasUnionId()) {
               return false;
            } else if (this.hasUnionId() && this.getUnionId() != other.getUnionId()) {
               return false;
            } else if (this.hasVipLev() != other.hasVipLev()) {
               return false;
            } else if (this.hasVipLev() && this.getVipLev() != other.getVipLev()) {
               return false;
            } else if (this.hasUnionName() != other.hasUnionName()) {
               return false;
            } else if (this.hasUnionName() && !this.getUnionName().equals(other.getUnionName())) {
               return false;
            } else if (this.hasShowVip() != other.hasShowVip()) {
               return false;
            } else if (this.hasShowVip() && this.getShowVip() != other.getShowVip()) {
               return false;
            } else if (this.hasSecondTitle() != other.hasSecondTitle()) {
               return false;
            } else if (this.hasSecondTitle() && this.getSecondTitle() != other.getSecondTitle()) {
               return false;
            } else if (this.hasPeakLv() != other.hasPeakLv()) {
               return false;
            } else if (this.hasPeakLv() && this.getPeakLv() != other.getPeakLv()) {
               return false;
            } else if (this.hasPrivilegeMine() != other.hasPrivilegeMine()) {
               return false;
            } else if (this.hasPrivilegeMine() && this.getPrivilegeMine() != other.getPrivilegeMine()) {
               return false;
            } else if (this.hasPalaceTitle() != other.hasPalaceTitle()) {
               return false;
            } else if (this.hasPalaceTitle() && this.getPalaceTitle() != other.getPalaceTitle()) {
               return false;
            } else if (this.hasQqLogo() != other.hasQqLogo()) {
               return false;
            } else if (this.hasQqLogo() && !this.getQqLogo().equals(other.getQqLogo())) {
               return false;
            } else if (this.hasQqWanKaLv() != other.hasQqWanKaLv()) {
               return false;
            } else if (this.hasQqWanKaLv() && this.getQqWanKaLv() != other.getQqWanKaLv()) {
               return false;
            } else if (this.hasHeroNum() != other.hasHeroNum()) {
               return false;
            } else if (this.hasHeroNum() && this.getHeroNum() != other.getHeroNum()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasSex()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getSex();
            }

            if (this.hasLv()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getLv();
            }

            if (this.hasCombatPower()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashLong(this.getCombatPower());
            }

            if (this.hasHeadId()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getHeadId();
            }

            if (this.hasHeadFrame()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getHeadFrame();
            }

            if (this.hasPrestige()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getPrestige();
            }

            if (this.hasMonarchId()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getMonarchId();
            }

            if (this.hasUnionId()) {
               hash = 37 * hash + 11;
               hash = 53 * hash + this.getUnionId();
            }

            if (this.hasVipLev()) {
               hash = 37 * hash + 12;
               hash = 53 * hash + this.getVipLev();
            }

            if (this.hasUnionName()) {
               hash = 37 * hash + 13;
               hash = 53 * hash + this.getUnionName().hashCode();
            }

            if (this.hasShowVip()) {
               hash = 37 * hash + 14;
               hash = 53 * hash + Internal.hashBoolean(this.getShowVip());
            }

            if (this.hasSecondTitle()) {
               hash = 37 * hash + 15;
               hash = 53 * hash + this.getSecondTitle();
            }

            if (this.hasPeakLv()) {
               hash = 37 * hash + 16;
               hash = 53 * hash + this.getPeakLv();
            }

            if (this.hasPrivilegeMine()) {
               hash = 37 * hash + 17;
               hash = 53 * hash + this.getPrivilegeMine();
            }

            if (this.hasPalaceTitle()) {
               hash = 37 * hash + 18;
               hash = 53 * hash + this.getPalaceTitle();
            }

            if (this.hasQqLogo()) {
               hash = 37 * hash + 19;
               hash = 53 * hash + this.getQqLogo().hashCode();
            }

            if (this.hasQqWanKaLv()) {
               hash = 37 * hash + 20;
               hash = 53 * hash + this.getQqWanKaLv();
            }

            if (this.hasHeroNum()) {
               hash = 37 * hash + 21;
               hash = 53 * hash + this.getHeroNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_PlayerBaseData_4202 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerBaseData_4202)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerBaseData_4202 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerBaseData_4202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerBaseData_4202 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerBaseData_4202)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerBaseData_4202 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerBaseData_4202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerBaseData_4202 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_PlayerBaseData_4202)PARSER.parseFrom(data);
      }

      public static S2CR_PlayerBaseData_4202 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayerBaseData_4202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayerBaseData_4202 parseFrom(InputStream input) throws IOException {
         return (S2CR_PlayerBaseData_4202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerBaseData_4202 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerBaseData_4202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerBaseData_4202 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_PlayerBaseData_4202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_PlayerBaseData_4202 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerBaseData_4202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayerBaseData_4202 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_PlayerBaseData_4202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayerBaseData_4202 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayerBaseData_4202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_PlayerBaseData_4202 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_PlayerBaseData_4202 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_PlayerBaseData_4202> parser() {
         return PARSER;
      }

      public Parser<S2CR_PlayerBaseData_4202> getParserForType() {
         return PARSER;
      }

      public S2CR_PlayerBaseData_4202 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_PlayerBaseData_4202OrBuilder {
         private int bitField0_;
         private int serverId_;
         private int playerId_;
         private Object playerName_;
         private int sex_;
         private int lv_;
         private long combatPower_;
         private int headId_;
         private int headFrame_;
         private int prestige_;
         private int monarchId_;
         private int unionId_;
         private int vipLev_;
         private Object unionName_;
         private boolean showVip_;
         private int secondTitle_;
         private int peakLv_;
         private int privilegeMine_;
         private int palaceTitle_;
         private Object qqLogo_;
         private int qqWanKaLv_;
         private int heroNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_PlayerBaseData_4202_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_PlayerBaseData_4202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayerBaseData_4202.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.unionName_ = "";
            this.qqLogo_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.unionName_ = "";
            this.qqLogo_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_PlayerBaseData_4202.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.serverId_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.playerName_ = "";
            this.bitField0_ &= -5;
            this.sex_ = 0;
            this.bitField0_ &= -9;
            this.lv_ = 0;
            this.bitField0_ &= -17;
            this.combatPower_ = 0L;
            this.bitField0_ &= -33;
            this.headId_ = 0;
            this.bitField0_ &= -65;
            this.headFrame_ = 0;
            this.bitField0_ &= -129;
            this.prestige_ = 0;
            this.bitField0_ &= -257;
            this.monarchId_ = 0;
            this.bitField0_ &= -513;
            this.unionId_ = 0;
            this.bitField0_ &= -1025;
            this.vipLev_ = 0;
            this.bitField0_ &= -2049;
            this.unionName_ = "";
            this.bitField0_ &= -4097;
            this.showVip_ = false;
            this.bitField0_ &= -8193;
            this.secondTitle_ = 0;
            this.bitField0_ &= -16385;
            this.peakLv_ = 0;
            this.bitField0_ &= -32769;
            this.privilegeMine_ = 0;
            this.bitField0_ &= -65537;
            this.palaceTitle_ = 0;
            this.bitField0_ &= -131073;
            this.qqLogo_ = "";
            this.bitField0_ &= -262145;
            this.qqWanKaLv_ = 0;
            this.bitField0_ &= -524289;
            this.heroNum_ = 0;
            this.bitField0_ &= -1048577;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_PlayerBaseData_4202_descriptor;
         }

         public S2CR_PlayerBaseData_4202 getDefaultInstanceForType() {
            return CrossMsg.S2CR_PlayerBaseData_4202.getDefaultInstance();
         }

         public S2CR_PlayerBaseData_4202 build() {
            S2CR_PlayerBaseData_4202 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_PlayerBaseData_4202 buildPartial() {
            S2CR_PlayerBaseData_4202 result = new S2CR_PlayerBaseData_4202(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 8) != 0) {
               result.sex_ = this.sex_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.lv_ = this.lv_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.combatPower_ = this.combatPower_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.headId_ = this.headId_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.headFrame_ = this.headFrame_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.prestige_ = this.prestige_;
               to_bitField0_ |= 256;
            }

            if ((from_bitField0_ & 512) != 0) {
               result.monarchId_ = this.monarchId_;
               to_bitField0_ |= 512;
            }

            if ((from_bitField0_ & 1024) != 0) {
               result.unionId_ = this.unionId_;
               to_bitField0_ |= 1024;
            }

            if ((from_bitField0_ & 2048) != 0) {
               result.vipLev_ = this.vipLev_;
               to_bitField0_ |= 2048;
            }

            if ((from_bitField0_ & 4096) != 0) {
               to_bitField0_ |= 4096;
            }

            result.unionName_ = this.unionName_;
            if ((from_bitField0_ & 8192) != 0) {
               result.showVip_ = this.showVip_;
               to_bitField0_ |= 8192;
            }

            if ((from_bitField0_ & 16384) != 0) {
               result.secondTitle_ = this.secondTitle_;
               to_bitField0_ |= 16384;
            }

            if ((from_bitField0_ & '耀') != 0) {
               result.peakLv_ = this.peakLv_;
               to_bitField0_ |= 32768;
            }

            if ((from_bitField0_ & 65536) != 0) {
               result.privilegeMine_ = this.privilegeMine_;
               to_bitField0_ |= 65536;
            }

            if ((from_bitField0_ & 131072) != 0) {
               result.palaceTitle_ = this.palaceTitle_;
               to_bitField0_ |= 131072;
            }

            if ((from_bitField0_ & 262144) != 0) {
               to_bitField0_ |= 262144;
            }

            result.qqLogo_ = this.qqLogo_;
            if ((from_bitField0_ & 524288) != 0) {
               result.qqWanKaLv_ = this.qqWanKaLv_;
               to_bitField0_ |= 524288;
            }

            if ((from_bitField0_ & 1048576) != 0) {
               result.heroNum_ = this.heroNum_;
               to_bitField0_ |= 1048576;
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
            if (other instanceof S2CR_PlayerBaseData_4202) {
               return this.mergeFrom((S2CR_PlayerBaseData_4202)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_PlayerBaseData_4202 other) {
            if (other == CrossMsg.S2CR_PlayerBaseData_4202.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 4;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasSex()) {
                  this.setSex(other.getSex());
               }

               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               if (other.hasCombatPower()) {
                  this.setCombatPower(other.getCombatPower());
               }

               if (other.hasHeadId()) {
                  this.setHeadId(other.getHeadId());
               }

               if (other.hasHeadFrame()) {
                  this.setHeadFrame(other.getHeadFrame());
               }

               if (other.hasPrestige()) {
                  this.setPrestige(other.getPrestige());
               }

               if (other.hasMonarchId()) {
                  this.setMonarchId(other.getMonarchId());
               }

               if (other.hasUnionId()) {
                  this.setUnionId(other.getUnionId());
               }

               if (other.hasVipLev()) {
                  this.setVipLev(other.getVipLev());
               }

               if (other.hasUnionName()) {
                  this.bitField0_ |= 4096;
                  this.unionName_ = other.unionName_;
                  this.onChanged();
               }

               if (other.hasShowVip()) {
                  this.setShowVip(other.getShowVip());
               }

               if (other.hasSecondTitle()) {
                  this.setSecondTitle(other.getSecondTitle());
               }

               if (other.hasPeakLv()) {
                  this.setPeakLv(other.getPeakLv());
               }

               if (other.hasPrivilegeMine()) {
                  this.setPrivilegeMine(other.getPrivilegeMine());
               }

               if (other.hasPalaceTitle()) {
                  this.setPalaceTitle(other.getPalaceTitle());
               }

               if (other.hasQqLogo()) {
                  this.bitField0_ |= 262144;
                  this.qqLogo_ = other.qqLogo_;
                  this.onChanged();
               }

               if (other.hasQqWanKaLv()) {
                  this.setQqWanKaLv(other.getQqWanKaLv());
               }

               if (other.hasHeroNum()) {
                  this.setHeroNum(other.getHeroNum());
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
            S2CR_PlayerBaseData_4202 parsedMessage = null;

            try {
               parsedMessage = (S2CR_PlayerBaseData_4202)CrossMsg.S2CR_PlayerBaseData_4202.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_PlayerBaseData_4202)e.getUnfinishedMessage();
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

         public boolean hasPlayerName() {
            return (this.bitField0_ & 4) != 0;
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
               this.bitField0_ |= 4;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -5;
            this.playerName_ = CrossMsg.S2CR_PlayerBaseData_4202.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasSex() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getSex() {
            return this.sex_;
         }

         public Builder setSex(int value) {
            this.bitField0_ |= 8;
            this.sex_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSex() {
            this.bitField0_ &= -9;
            this.sex_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLv() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getLv() {
            return this.lv_;
         }

         public Builder setLv(int value) {
            this.bitField0_ |= 16;
            this.lv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLv() {
            this.bitField0_ &= -17;
            this.lv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCombatPower() {
            return (this.bitField0_ & 32) != 0;
         }

         public long getCombatPower() {
            return this.combatPower_;
         }

         public Builder setCombatPower(long value) {
            this.bitField0_ |= 32;
            this.combatPower_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCombatPower() {
            this.bitField0_ &= -33;
            this.combatPower_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasHeadId() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getHeadId() {
            return this.headId_;
         }

         public Builder setHeadId(int value) {
            this.bitField0_ |= 64;
            this.headId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadId() {
            this.bitField0_ &= -65;
            this.headId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeadFrame() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getHeadFrame() {
            return this.headFrame_;
         }

         public Builder setHeadFrame(int value) {
            this.bitField0_ |= 128;
            this.headFrame_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeadFrame() {
            this.bitField0_ &= -129;
            this.headFrame_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPrestige() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getPrestige() {
            return this.prestige_;
         }

         public Builder setPrestige(int value) {
            this.bitField0_ |= 256;
            this.prestige_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPrestige() {
            this.bitField0_ &= -257;
            this.prestige_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMonarchId() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getMonarchId() {
            return this.monarchId_;
         }

         public Builder setMonarchId(int value) {
            this.bitField0_ |= 512;
            this.monarchId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMonarchId() {
            this.bitField0_ &= -513;
            this.monarchId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnionId() {
            return (this.bitField0_ & 1024) != 0;
         }

         public int getUnionId() {
            return this.unionId_;
         }

         public Builder setUnionId(int value) {
            this.bitField0_ |= 1024;
            this.unionId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUnionId() {
            this.bitField0_ &= -1025;
            this.unionId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasVipLev() {
            return (this.bitField0_ & 2048) != 0;
         }

         public int getVipLev() {
            return this.vipLev_;
         }

         public Builder setVipLev(int value) {
            this.bitField0_ |= 2048;
            this.vipLev_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearVipLev() {
            this.bitField0_ &= -2049;
            this.vipLev_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasUnionName() {
            return (this.bitField0_ & 4096) != 0;
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
               this.bitField0_ |= 4096;
               this.unionName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearUnionName() {
            this.bitField0_ &= -4097;
            this.unionName_ = CrossMsg.S2CR_PlayerBaseData_4202.getDefaultInstance().getUnionName();
            this.onChanged();
            return this;
         }

         public Builder setUnionNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4096;
               this.unionName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasShowVip() {
            return (this.bitField0_ & 8192) != 0;
         }

         public boolean getShowVip() {
            return this.showVip_;
         }

         public Builder setShowVip(boolean value) {
            this.bitField0_ |= 8192;
            this.showVip_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearShowVip() {
            this.bitField0_ &= -8193;
            this.showVip_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasSecondTitle() {
            return (this.bitField0_ & 16384) != 0;
         }

         public int getSecondTitle() {
            return this.secondTitle_;
         }

         public Builder setSecondTitle(int value) {
            this.bitField0_ |= 16384;
            this.secondTitle_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSecondTitle() {
            this.bitField0_ &= -16385;
            this.secondTitle_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPeakLv() {
            return (this.bitField0_ & '耀') != 0;
         }

         public int getPeakLv() {
            return this.peakLv_;
         }

         public Builder setPeakLv(int value) {
            this.bitField0_ |= 32768;
            this.peakLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPeakLv() {
            this.bitField0_ &= -32769;
            this.peakLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPrivilegeMine() {
            return (this.bitField0_ & 65536) != 0;
         }

         public int getPrivilegeMine() {
            return this.privilegeMine_;
         }

         public Builder setPrivilegeMine(int value) {
            this.bitField0_ |= 65536;
            this.privilegeMine_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPrivilegeMine() {
            this.bitField0_ &= -65537;
            this.privilegeMine_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPalaceTitle() {
            return (this.bitField0_ & 131072) != 0;
         }

         public int getPalaceTitle() {
            return this.palaceTitle_;
         }

         public Builder setPalaceTitle(int value) {
            this.bitField0_ |= 131072;
            this.palaceTitle_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPalaceTitle() {
            this.bitField0_ &= -131073;
            this.palaceTitle_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasQqLogo() {
            return (this.bitField0_ & 262144) != 0;
         }

         public String getQqLogo() {
            Object ref = this.qqLogo_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.qqLogo_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getQqLogoBytes() {
            Object ref = this.qqLogo_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.qqLogo_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setQqLogo(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 262144;
               this.qqLogo_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearQqLogo() {
            this.bitField0_ &= -262145;
            this.qqLogo_ = CrossMsg.S2CR_PlayerBaseData_4202.getDefaultInstance().getQqLogo();
            this.onChanged();
            return this;
         }

         public Builder setQqLogoBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 262144;
               this.qqLogo_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasQqWanKaLv() {
            return (this.bitField0_ & 524288) != 0;
         }

         public int getQqWanKaLv() {
            return this.qqWanKaLv_;
         }

         public Builder setQqWanKaLv(int value) {
            this.bitField0_ |= 524288;
            this.qqWanKaLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearQqWanKaLv() {
            this.bitField0_ &= -524289;
            this.qqWanKaLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroNum() {
            return (this.bitField0_ & 1048576) != 0;
         }

         public int getHeroNum() {
            return this.heroNum_;
         }

         public Builder setHeroNum(int value) {
            this.bitField0_ |= 1048576;
            this.heroNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroNum() {
            this.bitField0_ &= -1048577;
            this.heroNum_ = 0;
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

   public static final class S2CR_Login_4203 extends GeneratedMessageV3 implements S2CR_Login_4203OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SERVERID_FIELD_NUMBER = 1;
      private int serverId_;
      public static final int GROUPID_FIELD_NUMBER = 2;
      private int groupId_;
      public static final int SLAVESERVERID_FIELD_NUMBER = 3;
      private Internal.IntList slaveServerId_;
      public static final int PLATFORMID_FIELD_NUMBER = 4;
      private int platformId_;
      public static final int WORLDLV_FIELD_NUMBER = 5;
      private int worldLv_;
      public static final int OPENTIME_FIELD_NUMBER = 6;
      private long openTime_;
      public static final int CURALIVEPLAYERNUM_FIELD_NUMBER = 7;
      private long curAlivePlayerNum_;
      public static final int CURAVGPOWER_FIELD_NUMBER = 8;
      private long curAvgPower_;
      private byte memoizedIsInitialized;
      private static final S2CR_Login_4203 DEFAULT_INSTANCE = new S2CR_Login_4203();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_Login_4203> PARSER = new AbstractParser<S2CR_Login_4203>() {
         public S2CR_Login_4203 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_Login_4203(input, extensionRegistry);
         }
      };

      private S2CR_Login_4203(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_Login_4203() {
         this.memoizedIsInitialized = -1;
         this.slaveServerId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_Login_4203();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_Login_4203(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.serverId_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.groupId_ = input.readInt32();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.slaveServerId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.slaveServerId_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.slaveServerId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.platformId_ = input.readInt32();
                        continue;
                     case 40:
                        this.bitField0_ |= 8;
                        this.worldLv_ = input.readInt32();
                        continue;
                     case 48:
                        this.bitField0_ |= 16;
                        this.openTime_ = input.readInt64();
                        continue;
                     case 56:
                        this.bitField0_ |= 32;
                        this.curAlivePlayerNum_ = input.readInt64();
                        continue;
                     case 64:
                        this.bitField0_ |= 64;
                        this.curAvgPower_ = input.readInt64();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.slaveServerId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 4) != 0) {
                  this.slaveServerId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMsg.internal_static_common_S2CR_Login_4203_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_Login_4203_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Login_4203.class, Builder.class);
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasGroupId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getGroupId() {
         return this.groupId_;
      }

      public List<Integer> getSlaveServerIdList() {
         return this.slaveServerId_;
      }

      public int getSlaveServerIdCount() {
         return this.slaveServerId_.size();
      }

      public int getSlaveServerId(int index) {
         return this.slaveServerId_.getInt(index);
      }

      public boolean hasPlatformId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getPlatformId() {
         return this.platformId_;
      }

      public boolean hasWorldLv() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getWorldLv() {
         return this.worldLv_;
      }

      public boolean hasOpenTime() {
         return (this.bitField0_ & 16) != 0;
      }

      public long getOpenTime() {
         return this.openTime_;
      }

      public boolean hasCurAlivePlayerNum() {
         return (this.bitField0_ & 32) != 0;
      }

      public long getCurAlivePlayerNum() {
         return this.curAlivePlayerNum_;
      }

      public boolean hasCurAvgPower() {
         return (this.bitField0_ & 64) != 0;
      }

      public long getCurAvgPower() {
         return this.curAvgPower_;
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
         } else if (!this.hasPlatformId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasWorldLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOpenTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCurAlivePlayerNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCurAvgPower()) {
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
            output.writeInt32(2, this.groupId_);
         }

         for(int i = 0; i < this.slaveServerId_.size(); ++i) {
            output.writeInt32(3, this.slaveServerId_.getInt(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.platformId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.worldLv_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt64(6, this.openTime_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt64(7, this.curAlivePlayerNum_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt64(8, this.curAvgPower_);
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
               size += CodedOutputStream.computeInt32Size(2, this.groupId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.slaveServerId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.slaveServerId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getSlaveServerIdList().size();
            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.platformId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.worldLv_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt64Size(6, this.openTime_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt64Size(7, this.curAlivePlayerNum_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt64Size(8, this.curAvgPower_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_Login_4203)) {
            return super.equals(obj);
         } else {
            S2CR_Login_4203 other = (S2CR_Login_4203)obj;
            if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasGroupId() != other.hasGroupId()) {
               return false;
            } else if (this.hasGroupId() && this.getGroupId() != other.getGroupId()) {
               return false;
            } else if (!this.getSlaveServerIdList().equals(other.getSlaveServerIdList())) {
               return false;
            } else if (this.hasPlatformId() != other.hasPlatformId()) {
               return false;
            } else if (this.hasPlatformId() && this.getPlatformId() != other.getPlatformId()) {
               return false;
            } else if (this.hasWorldLv() != other.hasWorldLv()) {
               return false;
            } else if (this.hasWorldLv() && this.getWorldLv() != other.getWorldLv()) {
               return false;
            } else if (this.hasOpenTime() != other.hasOpenTime()) {
               return false;
            } else if (this.hasOpenTime() && this.getOpenTime() != other.getOpenTime()) {
               return false;
            } else if (this.hasCurAlivePlayerNum() != other.hasCurAlivePlayerNum()) {
               return false;
            } else if (this.hasCurAlivePlayerNum() && this.getCurAlivePlayerNum() != other.getCurAlivePlayerNum()) {
               return false;
            } else if (this.hasCurAvgPower() != other.hasCurAvgPower()) {
               return false;
            } else if (this.hasCurAvgPower() && this.getCurAvgPower() != other.getCurAvgPower()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasGroupId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGroupId();
            }

            if (this.getSlaveServerIdCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSlaveServerIdList().hashCode();
            }

            if (this.hasPlatformId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPlatformId();
            }

            if (this.hasWorldLv()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getWorldLv();
            }

            if (this.hasOpenTime()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashLong(this.getOpenTime());
            }

            if (this.hasCurAlivePlayerNum()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + Internal.hashLong(this.getCurAlivePlayerNum());
            }

            if (this.hasCurAvgPower()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + Internal.hashLong(this.getCurAvgPower());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_Login_4203 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_Login_4203)PARSER.parseFrom(data);
      }

      public static S2CR_Login_4203 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Login_4203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Login_4203 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_Login_4203)PARSER.parseFrom(data);
      }

      public static S2CR_Login_4203 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Login_4203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Login_4203 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_Login_4203)PARSER.parseFrom(data);
      }

      public static S2CR_Login_4203 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Login_4203)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Login_4203 parseFrom(InputStream input) throws IOException {
         return (S2CR_Login_4203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Login_4203 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Login_4203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Login_4203 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_Login_4203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_Login_4203 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Login_4203)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Login_4203 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_Login_4203)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Login_4203 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Login_4203)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_Login_4203 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_Login_4203 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_Login_4203> parser() {
         return PARSER;
      }

      public Parser<S2CR_Login_4203> getParserForType() {
         return PARSER;
      }

      public S2CR_Login_4203 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_Login_4203OrBuilder {
         private int bitField0_;
         private int serverId_;
         private int groupId_;
         private Internal.IntList slaveServerId_;
         private int platformId_;
         private int worldLv_;
         private long openTime_;
         private long curAlivePlayerNum_;
         private long curAvgPower_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_Login_4203_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_Login_4203_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Login_4203.class, Builder.class);
         }

         private Builder() {
            this.slaveServerId_ = CrossMsg.S2CR_Login_4203.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.slaveServerId_ = CrossMsg.S2CR_Login_4203.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_Login_4203.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.serverId_ = 0;
            this.bitField0_ &= -2;
            this.groupId_ = 0;
            this.bitField0_ &= -3;
            this.slaveServerId_ = CrossMsg.S2CR_Login_4203.emptyIntList();
            this.bitField0_ &= -5;
            this.platformId_ = 0;
            this.bitField0_ &= -9;
            this.worldLv_ = 0;
            this.bitField0_ &= -17;
            this.openTime_ = 0L;
            this.bitField0_ &= -33;
            this.curAlivePlayerNum_ = 0L;
            this.bitField0_ &= -65;
            this.curAvgPower_ = 0L;
            this.bitField0_ &= -129;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_Login_4203_descriptor;
         }

         public S2CR_Login_4203 getDefaultInstanceForType() {
            return CrossMsg.S2CR_Login_4203.getDefaultInstance();
         }

         public S2CR_Login_4203 build() {
            S2CR_Login_4203 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_Login_4203 buildPartial() {
            S2CR_Login_4203 result = new S2CR_Login_4203(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.groupId_ = this.groupId_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.slaveServerId_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.slaveServerId_ = this.slaveServerId_;
            if ((from_bitField0_ & 8) != 0) {
               result.platformId_ = this.platformId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.worldLv_ = this.worldLv_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.openTime_ = this.openTime_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.curAlivePlayerNum_ = this.curAlivePlayerNum_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.curAvgPower_ = this.curAvgPower_;
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
            if (other instanceof S2CR_Login_4203) {
               return this.mergeFrom((S2CR_Login_4203)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_Login_4203 other) {
            if (other == CrossMsg.S2CR_Login_4203.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasGroupId()) {
                  this.setGroupId(other.getGroupId());
               }

               if (!other.slaveServerId_.isEmpty()) {
                  if (this.slaveServerId_.isEmpty()) {
                     this.slaveServerId_ = other.slaveServerId_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureSlaveServerIdIsMutable();
                     this.slaveServerId_.addAll(other.slaveServerId_);
                  }

                  this.onChanged();
               }

               if (other.hasPlatformId()) {
                  this.setPlatformId(other.getPlatformId());
               }

               if (other.hasWorldLv()) {
                  this.setWorldLv(other.getWorldLv());
               }

               if (other.hasOpenTime()) {
                  this.setOpenTime(other.getOpenTime());
               }

               if (other.hasCurAlivePlayerNum()) {
                  this.setCurAlivePlayerNum(other.getCurAlivePlayerNum());
               }

               if (other.hasCurAvgPower()) {
                  this.setCurAvgPower(other.getCurAvgPower());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasServerId()) {
               return false;
            } else if (!this.hasPlatformId()) {
               return false;
            } else if (!this.hasWorldLv()) {
               return false;
            } else if (!this.hasOpenTime()) {
               return false;
            } else if (!this.hasCurAlivePlayerNum()) {
               return false;
            } else {
               return this.hasCurAvgPower();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_Login_4203 parsedMessage = null;

            try {
               parsedMessage = (S2CR_Login_4203)CrossMsg.S2CR_Login_4203.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_Login_4203)e.getUnfinishedMessage();
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

         public boolean hasGroupId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getGroupId() {
            return this.groupId_;
         }

         public Builder setGroupId(int value) {
            this.bitField0_ |= 2;
            this.groupId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGroupId() {
            this.bitField0_ &= -3;
            this.groupId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureSlaveServerIdIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.slaveServerId_ = CrossMsg.S2CR_Login_4203.mutableCopy(this.slaveServerId_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getSlaveServerIdList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.slaveServerId_) : this.slaveServerId_);
         }

         public int getSlaveServerIdCount() {
            return this.slaveServerId_.size();
         }

         public int getSlaveServerId(int index) {
            return this.slaveServerId_.getInt(index);
         }

         public Builder setSlaveServerId(int index, int value) {
            this.ensureSlaveServerIdIsMutable();
            this.slaveServerId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addSlaveServerId(int value) {
            this.ensureSlaveServerIdIsMutable();
            this.slaveServerId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllSlaveServerId(Iterable<? extends Integer> values) {
            this.ensureSlaveServerIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.slaveServerId_);
            this.onChanged();
            return this;
         }

         public Builder clearSlaveServerId() {
            this.slaveServerId_ = CrossMsg.S2CR_Login_4203.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         public boolean hasPlatformId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getPlatformId() {
            return this.platformId_;
         }

         public Builder setPlatformId(int value) {
            this.bitField0_ |= 8;
            this.platformId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlatformId() {
            this.bitField0_ &= -9;
            this.platformId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasWorldLv() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getWorldLv() {
            return this.worldLv_;
         }

         public Builder setWorldLv(int value) {
            this.bitField0_ |= 16;
            this.worldLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWorldLv() {
            this.bitField0_ &= -17;
            this.worldLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOpenTime() {
            return (this.bitField0_ & 32) != 0;
         }

         public long getOpenTime() {
            return this.openTime_;
         }

         public Builder setOpenTime(long value) {
            this.bitField0_ |= 32;
            this.openTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOpenTime() {
            this.bitField0_ &= -33;
            this.openTime_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasCurAlivePlayerNum() {
            return (this.bitField0_ & 64) != 0;
         }

         public long getCurAlivePlayerNum() {
            return this.curAlivePlayerNum_;
         }

         public Builder setCurAlivePlayerNum(long value) {
            this.bitField0_ |= 64;
            this.curAlivePlayerNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCurAlivePlayerNum() {
            this.bitField0_ &= -65;
            this.curAlivePlayerNum_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasCurAvgPower() {
            return (this.bitField0_ & 128) != 0;
         }

         public long getCurAvgPower() {
            return this.curAvgPower_;
         }

         public Builder setCurAvgPower(long value) {
            this.bitField0_ |= 128;
            this.curAvgPower_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCurAvgPower() {
            this.bitField0_ &= -129;
            this.curAvgPower_ = 0L;
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

   public static final class CR2S_Login_4204 extends GeneratedMessageV3 implements CR2S_Login_4204OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final CR2S_Login_4204 DEFAULT_INSTANCE = new CR2S_Login_4204();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_Login_4204> PARSER = new AbstractParser<CR2S_Login_4204>() {
         public CR2S_Login_4204 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_Login_4204(input, extensionRegistry);
         }
      };

      private CR2S_Login_4204(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_Login_4204() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_Login_4204();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_Login_4204(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossMsg.internal_static_common_CR2S_Login_4204_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_CR2S_Login_4204_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Login_4204.class, Builder.class);
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
         } else if (!(obj instanceof CR2S_Login_4204)) {
            return super.equals(obj);
         } else {
            CR2S_Login_4204 other = (CR2S_Login_4204)obj;
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

      public static CR2S_Login_4204 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_Login_4204)PARSER.parseFrom(data);
      }

      public static CR2S_Login_4204 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Login_4204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Login_4204 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_Login_4204)PARSER.parseFrom(data);
      }

      public static CR2S_Login_4204 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Login_4204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Login_4204 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_Login_4204)PARSER.parseFrom(data);
      }

      public static CR2S_Login_4204 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_Login_4204)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_Login_4204 parseFrom(InputStream input) throws IOException {
         return (CR2S_Login_4204)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Login_4204 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Login_4204)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Login_4204 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_Login_4204)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_Login_4204 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Login_4204)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_Login_4204 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_Login_4204)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_Login_4204 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_Login_4204)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_Login_4204 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_Login_4204 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_Login_4204> parser() {
         return PARSER;
      }

      public Parser<CR2S_Login_4204> getParserForType() {
         return PARSER;
      }

      public CR2S_Login_4204 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_Login_4204OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_CR2S_Login_4204_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_CR2S_Login_4204_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_Login_4204.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.CR2S_Login_4204.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_CR2S_Login_4204_descriptor;
         }

         public CR2S_Login_4204 getDefaultInstanceForType() {
            return CrossMsg.CR2S_Login_4204.getDefaultInstance();
         }

         public CR2S_Login_4204 build() {
            CR2S_Login_4204 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_Login_4204 buildPartial() {
            CR2S_Login_4204 result = new CR2S_Login_4204(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_Login_4204) {
               return this.mergeFrom((CR2S_Login_4204)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_Login_4204 other) {
            if (other == CrossMsg.CR2S_Login_4204.getDefaultInstance()) {
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
            CR2S_Login_4204 parsedMessage = null;

            try {
               parsedMessage = (CR2S_Login_4204)CrossMsg.CR2S_Login_4204.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_Login_4204)e.getUnfinishedMessage();
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

   public static final class CR2S_BattleRecord_4206 extends GeneratedMessageV3 implements CR2S_BattleRecord_4206OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FIGHTRESULT_FIELD_NUMBER = 1;
      private List<BattleMsg.S2C_BattleResult_6102> fightResult_;
      public static final int ISDEF_FIELD_NUMBER = 2;
      private boolean isdef_;
      private byte memoizedIsInitialized;
      private static final CR2S_BattleRecord_4206 DEFAULT_INSTANCE = new CR2S_BattleRecord_4206();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_BattleRecord_4206> PARSER = new AbstractParser<CR2S_BattleRecord_4206>() {
         public CR2S_BattleRecord_4206 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_BattleRecord_4206(input, extensionRegistry);
         }
      };

      private CR2S_BattleRecord_4206(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_BattleRecord_4206() {
         this.memoizedIsInitialized = -1;
         this.fightResult_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_BattleRecord_4206();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_BattleRecord_4206(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                           this.fightResult_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.fightResult_.add(input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry));
                        break;
                     case 16:
                        this.bitField0_ |= 1;
                        this.isdef_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.fightResult_ = Collections.unmodifiableList(this.fightResult_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMsg.internal_static_common_CR2S_BattleRecord_4206_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_CR2S_BattleRecord_4206_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_BattleRecord_4206.class, Builder.class);
      }

      public List<BattleMsg.S2C_BattleResult_6102> getFightResultList() {
         return this.fightResult_;
      }

      public List<? extends BattleMsg.S2C_BattleResult_6102OrBuilder> getFightResultOrBuilderList() {
         return this.fightResult_;
      }

      public int getFightResultCount() {
         return this.fightResult_.size();
      }

      public BattleMsg.S2C_BattleResult_6102 getFightResult(int index) {
         return (BattleMsg.S2C_BattleResult_6102)this.fightResult_.get(index);
      }

      public BattleMsg.S2C_BattleResult_6102OrBuilder getFightResultOrBuilder(int index) {
         return (BattleMsg.S2C_BattleResult_6102OrBuilder)this.fightResult_.get(index);
      }

      public boolean hasIsdef() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getIsdef() {
         return this.isdef_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getFightResultCount(); ++i) {
               if (!this.getFightResult(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.fightResult_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.fightResult_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(2, this.isdef_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.fightResult_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.fightResult_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.isdef_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_BattleRecord_4206)) {
            return super.equals(obj);
         } else {
            CR2S_BattleRecord_4206 other = (CR2S_BattleRecord_4206)obj;
            if (!this.getFightResultList().equals(other.getFightResultList())) {
               return false;
            } else if (this.hasIsdef() != other.hasIsdef()) {
               return false;
            } else if (this.hasIsdef() && this.getIsdef() != other.getIsdef()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getFightResultCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFightResultList().hashCode();
            }

            if (this.hasIsdef()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIsdef());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_BattleRecord_4206 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_BattleRecord_4206)PARSER.parseFrom(data);
      }

      public static CR2S_BattleRecord_4206 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BattleRecord_4206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BattleRecord_4206 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_BattleRecord_4206)PARSER.parseFrom(data);
      }

      public static CR2S_BattleRecord_4206 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BattleRecord_4206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BattleRecord_4206 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_BattleRecord_4206)PARSER.parseFrom(data);
      }

      public static CR2S_BattleRecord_4206 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_BattleRecord_4206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_BattleRecord_4206 parseFrom(InputStream input) throws IOException {
         return (CR2S_BattleRecord_4206)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_BattleRecord_4206 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BattleRecord_4206)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_BattleRecord_4206 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_BattleRecord_4206)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_BattleRecord_4206 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BattleRecord_4206)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_BattleRecord_4206 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_BattleRecord_4206)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_BattleRecord_4206 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_BattleRecord_4206)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_BattleRecord_4206 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_BattleRecord_4206 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_BattleRecord_4206> parser() {
         return PARSER;
      }

      public Parser<CR2S_BattleRecord_4206> getParserForType() {
         return PARSER;
      }

      public CR2S_BattleRecord_4206 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_BattleRecord_4206OrBuilder {
         private int bitField0_;
         private List<BattleMsg.S2C_BattleResult_6102> fightResult_;
         private RepeatedFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> fightResultBuilder_;
         private boolean isdef_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_CR2S_BattleRecord_4206_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_CR2S_BattleRecord_4206_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_BattleRecord_4206.class, Builder.class);
         }

         private Builder() {
            this.fightResult_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.fightResult_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.CR2S_BattleRecord_4206.alwaysUseFieldBuilders) {
               this.getFightResultFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.fightResultBuilder_ == null) {
               this.fightResult_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.fightResultBuilder_.clear();
            }

            this.isdef_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_CR2S_BattleRecord_4206_descriptor;
         }

         public CR2S_BattleRecord_4206 getDefaultInstanceForType() {
            return CrossMsg.CR2S_BattleRecord_4206.getDefaultInstance();
         }

         public CR2S_BattleRecord_4206 build() {
            CR2S_BattleRecord_4206 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_BattleRecord_4206 buildPartial() {
            CR2S_BattleRecord_4206 result = new CR2S_BattleRecord_4206(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.fightResultBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.fightResult_ = Collections.unmodifiableList(this.fightResult_);
                  this.bitField0_ &= -2;
               }

               result.fightResult_ = this.fightResult_;
            } else {
               result.fightResult_ = this.fightResultBuilder_.build();
            }

            if ((from_bitField0_ & 2) != 0) {
               result.isdef_ = this.isdef_;
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
            if (other instanceof CR2S_BattleRecord_4206) {
               return this.mergeFrom((CR2S_BattleRecord_4206)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_BattleRecord_4206 other) {
            if (other == CrossMsg.CR2S_BattleRecord_4206.getDefaultInstance()) {
               return this;
            } else {
               if (this.fightResultBuilder_ == null) {
                  if (!other.fightResult_.isEmpty()) {
                     if (this.fightResult_.isEmpty()) {
                        this.fightResult_ = other.fightResult_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureFightResultIsMutable();
                        this.fightResult_.addAll(other.fightResult_);
                     }

                     this.onChanged();
                  }
               } else if (!other.fightResult_.isEmpty()) {
                  if (this.fightResultBuilder_.isEmpty()) {
                     this.fightResultBuilder_.dispose();
                     this.fightResultBuilder_ = null;
                     this.fightResult_ = other.fightResult_;
                     this.bitField0_ &= -2;
                     this.fightResultBuilder_ = CrossMsg.CR2S_BattleRecord_4206.alwaysUseFieldBuilders ? this.getFightResultFieldBuilder() : null;
                  } else {
                     this.fightResultBuilder_.addAllMessages(other.fightResult_);
                  }
               }

               if (other.hasIsdef()) {
                  this.setIsdef(other.getIsdef());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getFightResultCount(); ++i) {
               if (!this.getFightResult(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_BattleRecord_4206 parsedMessage = null;

            try {
               parsedMessage = (CR2S_BattleRecord_4206)CrossMsg.CR2S_BattleRecord_4206.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_BattleRecord_4206)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureFightResultIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.fightResult_ = new ArrayList(this.fightResult_);
               this.bitField0_ |= 1;
            }

         }

         public List<BattleMsg.S2C_BattleResult_6102> getFightResultList() {
            return this.fightResultBuilder_ == null ? Collections.unmodifiableList(this.fightResult_) : this.fightResultBuilder_.getMessageList();
         }

         public int getFightResultCount() {
            return this.fightResultBuilder_ == null ? this.fightResult_.size() : this.fightResultBuilder_.getCount();
         }

         public BattleMsg.S2C_BattleResult_6102 getFightResult(int index) {
            return this.fightResultBuilder_ == null ? (BattleMsg.S2C_BattleResult_6102)this.fightResult_.get(index) : (BattleMsg.S2C_BattleResult_6102)this.fightResultBuilder_.getMessage(index);
         }

         public Builder setFightResult(int index, BattleMsg.S2C_BattleResult_6102 value) {
            if (this.fightResultBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFightResultIsMutable();
               this.fightResult_.set(index, value);
               this.onChanged();
            } else {
               this.fightResultBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setFightResult(int index, BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.fightResultBuilder_ == null) {
               this.ensureFightResultIsMutable();
               this.fightResult_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.fightResultBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addFightResult(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.fightResultBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFightResultIsMutable();
               this.fightResult_.add(value);
               this.onChanged();
            } else {
               this.fightResultBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addFightResult(int index, BattleMsg.S2C_BattleResult_6102 value) {
            if (this.fightResultBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureFightResultIsMutable();
               this.fightResult_.add(index, value);
               this.onChanged();
            } else {
               this.fightResultBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addFightResult(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.fightResultBuilder_ == null) {
               this.ensureFightResultIsMutable();
               this.fightResult_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.fightResultBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addFightResult(int index, BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.fightResultBuilder_ == null) {
               this.ensureFightResultIsMutable();
               this.fightResult_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.fightResultBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllFightResult(Iterable<? extends BattleMsg.S2C_BattleResult_6102> values) {
            if (this.fightResultBuilder_ == null) {
               this.ensureFightResultIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.fightResult_);
               this.onChanged();
            } else {
               this.fightResultBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearFightResult() {
            if (this.fightResultBuilder_ == null) {
               this.fightResult_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.fightResultBuilder_.clear();
            }

            return this;
         }

         public Builder removeFightResult(int index) {
            if (this.fightResultBuilder_ == null) {
               this.ensureFightResultIsMutable();
               this.fightResult_.remove(index);
               this.onChanged();
            } else {
               this.fightResultBuilder_.remove(index);
            }

            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getFightResultBuilder(int index) {
            return (BattleMsg.S2C_BattleResult_6102.Builder)this.getFightResultFieldBuilder().getBuilder(index);
         }

         public BattleMsg.S2C_BattleResult_6102OrBuilder getFightResultOrBuilder(int index) {
            return this.fightResultBuilder_ == null ? (BattleMsg.S2C_BattleResult_6102OrBuilder)this.fightResult_.get(index) : (BattleMsg.S2C_BattleResult_6102OrBuilder)this.fightResultBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends BattleMsg.S2C_BattleResult_6102OrBuilder> getFightResultOrBuilderList() {
            return this.fightResultBuilder_ != null ? this.fightResultBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.fightResult_);
         }

         public BattleMsg.S2C_BattleResult_6102.Builder addFightResultBuilder() {
            return (BattleMsg.S2C_BattleResult_6102.Builder)this.getFightResultFieldBuilder().addBuilder(BattleMsg.S2C_BattleResult_6102.getDefaultInstance());
         }

         public BattleMsg.S2C_BattleResult_6102.Builder addFightResultBuilder(int index) {
            return (BattleMsg.S2C_BattleResult_6102.Builder)this.getFightResultFieldBuilder().addBuilder(index, BattleMsg.S2C_BattleResult_6102.getDefaultInstance());
         }

         public List<BattleMsg.S2C_BattleResult_6102.Builder> getFightResultBuilderList() {
            return this.getFightResultFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> getFightResultFieldBuilder() {
            if (this.fightResultBuilder_ == null) {
               this.fightResultBuilder_ = new RepeatedFieldBuilderV3(this.fightResult_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.fightResult_ = null;
            }

            return this.fightResultBuilder_;
         }

         public boolean hasIsdef() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIsdef() {
            return this.isdef_;
         }

         public Builder setIsdef(boolean value) {
            this.bitField0_ |= 2;
            this.isdef_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsdef() {
            this.bitField0_ &= -3;
            this.isdef_ = false;
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

   public static final class S2CR_PlayBattleRecord_4207 extends GeneratedMessageV3 implements S2CR_PlayBattleRecord_4207OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECORDID_FIELD_NUMBER = 1;
      private int recordId_;
      public static final int SYSTEMID_FIELD_NUMBER = 2;
      private int systemid_;
      public static final int SERVERID_FIELD_NUMBER = 3;
      private int serverId_;
      public static final int RECORDTYPE_FIELD_NUMBER = 4;
      private int recordType_;
      public static final int STARTTIME_FIELD_NUMBER = 5;
      private int startTime_;
      private byte memoizedIsInitialized;
      private static final S2CR_PlayBattleRecord_4207 DEFAULT_INSTANCE = new S2CR_PlayBattleRecord_4207();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_PlayBattleRecord_4207> PARSER = new AbstractParser<S2CR_PlayBattleRecord_4207>() {
         public S2CR_PlayBattleRecord_4207 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_PlayBattleRecord_4207(input, extensionRegistry);
         }
      };

      private S2CR_PlayBattleRecord_4207(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_PlayBattleRecord_4207() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_PlayBattleRecord_4207();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_PlayBattleRecord_4207(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.recordId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.systemid_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.serverId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.recordType_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.startTime_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_PlayBattleRecord_4207_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_PlayBattleRecord_4207_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayBattleRecord_4207.class, Builder.class);
      }

      public boolean hasRecordId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRecordId() {
         return this.recordId_;
      }

      public boolean hasSystemid() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSystemid() {
         return this.systemid_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasRecordType() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getRecordType() {
         return this.recordType_;
      }

      public boolean hasStartTime() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getStartTime() {
         return this.startTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRecordId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSystemid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasServerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRecordType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStartTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.recordId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.systemid_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.serverId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.recordType_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.startTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.recordId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.systemid_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.serverId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.recordType_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.startTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_PlayBattleRecord_4207)) {
            return super.equals(obj);
         } else {
            S2CR_PlayBattleRecord_4207 other = (S2CR_PlayBattleRecord_4207)obj;
            if (this.hasRecordId() != other.hasRecordId()) {
               return false;
            } else if (this.hasRecordId() && this.getRecordId() != other.getRecordId()) {
               return false;
            } else if (this.hasSystemid() != other.hasSystemid()) {
               return false;
            } else if (this.hasSystemid() && this.getSystemid() != other.getSystemid()) {
               return false;
            } else if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasRecordType() != other.hasRecordType()) {
               return false;
            } else if (this.hasRecordType() && this.getRecordType() != other.getRecordType()) {
               return false;
            } else if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasRecordId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRecordId();
            }

            if (this.hasSystemid()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSystemid();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getServerId();
            }

            if (this.hasRecordType()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getRecordType();
            }

            if (this.hasStartTime()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getStartTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_PlayBattleRecord_4207 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_PlayBattleRecord_4207)PARSER.parseFrom(data);
      }

      public static S2CR_PlayBattleRecord_4207 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayBattleRecord_4207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayBattleRecord_4207 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_PlayBattleRecord_4207)PARSER.parseFrom(data);
      }

      public static S2CR_PlayBattleRecord_4207 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayBattleRecord_4207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayBattleRecord_4207 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_PlayBattleRecord_4207)PARSER.parseFrom(data);
      }

      public static S2CR_PlayBattleRecord_4207 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_PlayBattleRecord_4207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_PlayBattleRecord_4207 parseFrom(InputStream input) throws IOException {
         return (S2CR_PlayBattleRecord_4207)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayBattleRecord_4207 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayBattleRecord_4207)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayBattleRecord_4207 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_PlayBattleRecord_4207)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_PlayBattleRecord_4207 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayBattleRecord_4207)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_PlayBattleRecord_4207 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_PlayBattleRecord_4207)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_PlayBattleRecord_4207 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_PlayBattleRecord_4207)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_PlayBattleRecord_4207 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_PlayBattleRecord_4207 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_PlayBattleRecord_4207> parser() {
         return PARSER;
      }

      public Parser<S2CR_PlayBattleRecord_4207> getParserForType() {
         return PARSER;
      }

      public S2CR_PlayBattleRecord_4207 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_PlayBattleRecord_4207OrBuilder {
         private int bitField0_;
         private int recordId_;
         private int systemid_;
         private int serverId_;
         private int recordType_;
         private int startTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_PlayBattleRecord_4207_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_PlayBattleRecord_4207_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_PlayBattleRecord_4207.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_PlayBattleRecord_4207.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.recordId_ = 0;
            this.bitField0_ &= -2;
            this.systemid_ = 0;
            this.bitField0_ &= -3;
            this.serverId_ = 0;
            this.bitField0_ &= -5;
            this.recordType_ = 0;
            this.bitField0_ &= -9;
            this.startTime_ = 0;
            this.bitField0_ &= -17;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_PlayBattleRecord_4207_descriptor;
         }

         public S2CR_PlayBattleRecord_4207 getDefaultInstanceForType() {
            return CrossMsg.S2CR_PlayBattleRecord_4207.getDefaultInstance();
         }

         public S2CR_PlayBattleRecord_4207 build() {
            S2CR_PlayBattleRecord_4207 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_PlayBattleRecord_4207 buildPartial() {
            S2CR_PlayBattleRecord_4207 result = new S2CR_PlayBattleRecord_4207(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.recordId_ = this.recordId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.systemid_ = this.systemid_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.recordType_ = this.recordType_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.startTime_ = this.startTime_;
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
            if (other instanceof S2CR_PlayBattleRecord_4207) {
               return this.mergeFrom((S2CR_PlayBattleRecord_4207)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_PlayBattleRecord_4207 other) {
            if (other == CrossMsg.S2CR_PlayBattleRecord_4207.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRecordId()) {
                  this.setRecordId(other.getRecordId());
               }

               if (other.hasSystemid()) {
                  this.setSystemid(other.getSystemid());
               }

               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasRecordType()) {
                  this.setRecordType(other.getRecordType());
               }

               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRecordId()) {
               return false;
            } else if (!this.hasSystemid()) {
               return false;
            } else if (!this.hasServerId()) {
               return false;
            } else if (!this.hasRecordType()) {
               return false;
            } else {
               return this.hasStartTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_PlayBattleRecord_4207 parsedMessage = null;

            try {
               parsedMessage = (S2CR_PlayBattleRecord_4207)CrossMsg.S2CR_PlayBattleRecord_4207.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_PlayBattleRecord_4207)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRecordId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRecordId() {
            return this.recordId_;
         }

         public Builder setRecordId(int value) {
            this.bitField0_ |= 1;
            this.recordId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecordId() {
            this.bitField0_ &= -2;
            this.recordId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSystemid() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSystemid() {
            return this.systemid_;
         }

         public Builder setSystemid(int value) {
            this.bitField0_ |= 2;
            this.systemid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSystemid() {
            this.bitField0_ &= -3;
            this.systemid_ = 0;
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

         public boolean hasRecordType() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getRecordType() {
            return this.recordType_;
         }

         public Builder setRecordType(int value) {
            this.bitField0_ |= 8;
            this.recordType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecordType() {
            this.bitField0_ &= -9;
            this.recordType_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStartTime() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getStartTime() {
            return this.startTime_;
         }

         public Builder setStartTime(int value) {
            this.bitField0_ |= 16;
            this.startTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStartTime() {
            this.bitField0_ &= -17;
            this.startTime_ = 0;
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

   public static final class CR2S_PlayBattleRecord_4208 extends GeneratedMessageV3 implements CR2S_PlayBattleRecord_4208OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECORDID_FIELD_NUMBER = 1;
      private int recordId_;
      public static final int SYSTEMID_FIELD_NUMBER = 2;
      private int systemid_;
      public static final int PLAYPLAYERID_FIELD_NUMBER = 3;
      private int playPlayerId_;
      public static final int PLAYSERVIERID_FIELD_NUMBER = 4;
      private int playServierId_;
      private byte memoizedIsInitialized;
      private static final CR2S_PlayBattleRecord_4208 DEFAULT_INSTANCE = new CR2S_PlayBattleRecord_4208();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_PlayBattleRecord_4208> PARSER = new AbstractParser<CR2S_PlayBattleRecord_4208>() {
         public CR2S_PlayBattleRecord_4208 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_PlayBattleRecord_4208(input, extensionRegistry);
         }
      };

      private CR2S_PlayBattleRecord_4208(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_PlayBattleRecord_4208() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_PlayBattleRecord_4208();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_PlayBattleRecord_4208(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.recordId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.systemid_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.playPlayerId_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.playServierId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_CR2S_PlayBattleRecord_4208_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_CR2S_PlayBattleRecord_4208_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_PlayBattleRecord_4208.class, Builder.class);
      }

      public boolean hasRecordId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRecordId() {
         return this.recordId_;
      }

      public boolean hasSystemid() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSystemid() {
         return this.systemid_;
      }

      public boolean hasPlayPlayerId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getPlayPlayerId() {
         return this.playPlayerId_;
      }

      public boolean hasPlayServierId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getPlayServierId() {
         return this.playServierId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRecordId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSystemid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayServierId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.recordId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.systemid_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.playPlayerId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.playServierId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.recordId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.systemid_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.playPlayerId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.playServierId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_PlayBattleRecord_4208)) {
            return super.equals(obj);
         } else {
            CR2S_PlayBattleRecord_4208 other = (CR2S_PlayBattleRecord_4208)obj;
            if (this.hasRecordId() != other.hasRecordId()) {
               return false;
            } else if (this.hasRecordId() && this.getRecordId() != other.getRecordId()) {
               return false;
            } else if (this.hasSystemid() != other.hasSystemid()) {
               return false;
            } else if (this.hasSystemid() && this.getSystemid() != other.getSystemid()) {
               return false;
            } else if (this.hasPlayPlayerId() != other.hasPlayPlayerId()) {
               return false;
            } else if (this.hasPlayPlayerId() && this.getPlayPlayerId() != other.getPlayPlayerId()) {
               return false;
            } else if (this.hasPlayServierId() != other.hasPlayServierId()) {
               return false;
            } else if (this.hasPlayServierId() && this.getPlayServierId() != other.getPlayServierId()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasRecordId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRecordId();
            }

            if (this.hasSystemid()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSystemid();
            }

            if (this.hasPlayPlayerId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getPlayPlayerId();
            }

            if (this.hasPlayServierId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPlayServierId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_PlayBattleRecord_4208 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_PlayBattleRecord_4208)PARSER.parseFrom(data);
      }

      public static CR2S_PlayBattleRecord_4208 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PlayBattleRecord_4208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PlayBattleRecord_4208 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_PlayBattleRecord_4208)PARSER.parseFrom(data);
      }

      public static CR2S_PlayBattleRecord_4208 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PlayBattleRecord_4208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PlayBattleRecord_4208 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_PlayBattleRecord_4208)PARSER.parseFrom(data);
      }

      public static CR2S_PlayBattleRecord_4208 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_PlayBattleRecord_4208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_PlayBattleRecord_4208 parseFrom(InputStream input) throws IOException {
         return (CR2S_PlayBattleRecord_4208)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_PlayBattleRecord_4208 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PlayBattleRecord_4208)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_PlayBattleRecord_4208 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_PlayBattleRecord_4208)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_PlayBattleRecord_4208 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PlayBattleRecord_4208)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_PlayBattleRecord_4208 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_PlayBattleRecord_4208)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_PlayBattleRecord_4208 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_PlayBattleRecord_4208)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_PlayBattleRecord_4208 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_PlayBattleRecord_4208 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_PlayBattleRecord_4208> parser() {
         return PARSER;
      }

      public Parser<CR2S_PlayBattleRecord_4208> getParserForType() {
         return PARSER;
      }

      public CR2S_PlayBattleRecord_4208 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_PlayBattleRecord_4208OrBuilder {
         private int bitField0_;
         private int recordId_;
         private int systemid_;
         private int playPlayerId_;
         private int playServierId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_CR2S_PlayBattleRecord_4208_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_CR2S_PlayBattleRecord_4208_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_PlayBattleRecord_4208.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.CR2S_PlayBattleRecord_4208.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.recordId_ = 0;
            this.bitField0_ &= -2;
            this.systemid_ = 0;
            this.bitField0_ &= -3;
            this.playPlayerId_ = 0;
            this.bitField0_ &= -5;
            this.playServierId_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_CR2S_PlayBattleRecord_4208_descriptor;
         }

         public CR2S_PlayBattleRecord_4208 getDefaultInstanceForType() {
            return CrossMsg.CR2S_PlayBattleRecord_4208.getDefaultInstance();
         }

         public CR2S_PlayBattleRecord_4208 build() {
            CR2S_PlayBattleRecord_4208 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_PlayBattleRecord_4208 buildPartial() {
            CR2S_PlayBattleRecord_4208 result = new CR2S_PlayBattleRecord_4208(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.recordId_ = this.recordId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.systemid_ = this.systemid_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.playPlayerId_ = this.playPlayerId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.playServierId_ = this.playServierId_;
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
            if (other instanceof CR2S_PlayBattleRecord_4208) {
               return this.mergeFrom((CR2S_PlayBattleRecord_4208)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_PlayBattleRecord_4208 other) {
            if (other == CrossMsg.CR2S_PlayBattleRecord_4208.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRecordId()) {
                  this.setRecordId(other.getRecordId());
               }

               if (other.hasSystemid()) {
                  this.setSystemid(other.getSystemid());
               }

               if (other.hasPlayPlayerId()) {
                  this.setPlayPlayerId(other.getPlayPlayerId());
               }

               if (other.hasPlayServierId()) {
                  this.setPlayServierId(other.getPlayServierId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRecordId()) {
               return false;
            } else if (!this.hasSystemid()) {
               return false;
            } else if (!this.hasPlayPlayerId()) {
               return false;
            } else {
               return this.hasPlayServierId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_PlayBattleRecord_4208 parsedMessage = null;

            try {
               parsedMessage = (CR2S_PlayBattleRecord_4208)CrossMsg.CR2S_PlayBattleRecord_4208.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_PlayBattleRecord_4208)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRecordId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRecordId() {
            return this.recordId_;
         }

         public Builder setRecordId(int value) {
            this.bitField0_ |= 1;
            this.recordId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecordId() {
            this.bitField0_ &= -2;
            this.recordId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSystemid() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSystemid() {
            return this.systemid_;
         }

         public Builder setSystemid(int value) {
            this.bitField0_ |= 2;
            this.systemid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSystemid() {
            this.bitField0_ &= -3;
            this.systemid_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayPlayerId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getPlayPlayerId() {
            return this.playPlayerId_;
         }

         public Builder setPlayPlayerId(int value) {
            this.bitField0_ |= 4;
            this.playPlayerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayPlayerId() {
            this.bitField0_ &= -5;
            this.playPlayerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayServierId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getPlayServierId() {
            return this.playServierId_;
         }

         public Builder setPlayServierId(int value) {
            this.bitField0_ |= 8;
            this.playServierId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayServierId() {
            this.bitField0_ &= -9;
            this.playServierId_ = 0;
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

   public static final class S2CR_CrossGm_4209 extends GeneratedMessageV3 implements S2CR_CrossGm_4209OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CMD_FIELD_NUMBER = 1;
      private volatile Object cmd_;
      private byte memoizedIsInitialized;
      private static final S2CR_CrossGm_4209 DEFAULT_INSTANCE = new S2CR_CrossGm_4209();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_CrossGm_4209> PARSER = new AbstractParser<S2CR_CrossGm_4209>() {
         public S2CR_CrossGm_4209 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_CrossGm_4209(input, extensionRegistry);
         }
      };

      private S2CR_CrossGm_4209(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_CrossGm_4209() {
         this.memoizedIsInitialized = -1;
         this.cmd_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_CrossGm_4209();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_CrossGm_4209(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_CrossGm_4209_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_CrossGm_4209_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_CrossGm_4209.class, Builder.class);
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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_CrossGm_4209)) {
            return super.equals(obj);
         } else {
            S2CR_CrossGm_4209 other = (S2CR_CrossGm_4209)obj;
            if (this.hasCmd() != other.hasCmd()) {
               return false;
            } else if (this.hasCmd() && !this.getCmd().equals(other.getCmd())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_CrossGm_4209 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_CrossGm_4209)PARSER.parseFrom(data);
      }

      public static S2CR_CrossGm_4209 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CrossGm_4209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CrossGm_4209 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_CrossGm_4209)PARSER.parseFrom(data);
      }

      public static S2CR_CrossGm_4209 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CrossGm_4209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CrossGm_4209 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_CrossGm_4209)PARSER.parseFrom(data);
      }

      public static S2CR_CrossGm_4209 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CrossGm_4209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CrossGm_4209 parseFrom(InputStream input) throws IOException {
         return (S2CR_CrossGm_4209)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_CrossGm_4209 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CrossGm_4209)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_CrossGm_4209 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_CrossGm_4209)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_CrossGm_4209 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CrossGm_4209)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_CrossGm_4209 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_CrossGm_4209)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_CrossGm_4209 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CrossGm_4209)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_CrossGm_4209 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_CrossGm_4209 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_CrossGm_4209> parser() {
         return PARSER;
      }

      public Parser<S2CR_CrossGm_4209> getParserForType() {
         return PARSER;
      }

      public S2CR_CrossGm_4209 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_CrossGm_4209OrBuilder {
         private int bitField0_;
         private Object cmd_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_CrossGm_4209_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_CrossGm_4209_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_CrossGm_4209.class, Builder.class);
         }

         private Builder() {
            this.cmd_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.cmd_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_CrossGm_4209.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.cmd_ = "";
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_CrossGm_4209_descriptor;
         }

         public S2CR_CrossGm_4209 getDefaultInstanceForType() {
            return CrossMsg.S2CR_CrossGm_4209.getDefaultInstance();
         }

         public S2CR_CrossGm_4209 build() {
            S2CR_CrossGm_4209 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_CrossGm_4209 buildPartial() {
            S2CR_CrossGm_4209 result = new S2CR_CrossGm_4209(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.cmd_ = this.cmd_;
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
            if (other instanceof S2CR_CrossGm_4209) {
               return this.mergeFrom((S2CR_CrossGm_4209)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_CrossGm_4209 other) {
            if (other == CrossMsg.S2CR_CrossGm_4209.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCmd()) {
                  this.bitField0_ |= 1;
                  this.cmd_ = other.cmd_;
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
            S2CR_CrossGm_4209 parsedMessage = null;

            try {
               parsedMessage = (S2CR_CrossGm_4209)CrossMsg.S2CR_CrossGm_4209.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_CrossGm_4209)e.getUnfinishedMessage();
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
            this.cmd_ = CrossMsg.S2CR_CrossGm_4209.getDefaultInstance().getCmd();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_OhterServerBattleRecord_4211 extends GeneratedMessageV3 implements CR2S_OhterServerBattleRecord_4211OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYPLAYERID_FIELD_NUMBER = 1;
      private int playPlayerId_;
      public static final int PLAYSERVIERID_FIELD_NUMBER = 2;
      private int playServierId_;
      public static final int FIGHTRESULT_FIELD_NUMBER = 3;
      private BattleMsg.S2C_BattleResult_6102 fightResult_;
      private byte memoizedIsInitialized;
      private static final CR2S_OhterServerBattleRecord_4211 DEFAULT_INSTANCE = new CR2S_OhterServerBattleRecord_4211();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_OhterServerBattleRecord_4211> PARSER = new AbstractParser<CR2S_OhterServerBattleRecord_4211>() {
         public CR2S_OhterServerBattleRecord_4211 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_OhterServerBattleRecord_4211(input, extensionRegistry);
         }
      };

      private CR2S_OhterServerBattleRecord_4211(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_OhterServerBattleRecord_4211() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_OhterServerBattleRecord_4211();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_OhterServerBattleRecord_4211(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.playPlayerId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.playServierId_ = input.readInt32();
                        break;
                     case 26:
                        BattleMsg.S2C_BattleResult_6102.Builder subBuilder = null;
                        if ((this.bitField0_ & 4) != 0) {
                           subBuilder = this.fightResult_.toBuilder();
                        }

                        this.fightResult_ = (BattleMsg.S2C_BattleResult_6102)input.readMessage(BattleMsg.S2C_BattleResult_6102.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.fightResult_);
                           this.fightResult_ = subBuilder.buildPartial();
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
         return CrossMsg.internal_static_common_CR2S_OhterServerBattleRecord_4211_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_CR2S_OhterServerBattleRecord_4211_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_OhterServerBattleRecord_4211.class, Builder.class);
      }

      public boolean hasPlayPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPlayPlayerId() {
         return this.playPlayerId_;
      }

      public boolean hasPlayServierId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPlayServierId() {
         return this.playServierId_;
      }

      public boolean hasFightResult() {
         return (this.bitField0_ & 4) != 0;
      }

      public BattleMsg.S2C_BattleResult_6102 getFightResult() {
         return this.fightResult_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.fightResult_;
      }

      public BattleMsg.S2C_BattleResult_6102OrBuilder getFightResultOrBuilder() {
         return this.fightResult_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.fightResult_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPlayServierId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFightResult()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getFightResult().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.playPlayerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playServierId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeMessage(3, this.getFightResult());
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
               size += CodedOutputStream.computeInt32Size(1, this.playPlayerId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.playServierId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeMessageSize(3, this.getFightResult());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_OhterServerBattleRecord_4211)) {
            return super.equals(obj);
         } else {
            CR2S_OhterServerBattleRecord_4211 other = (CR2S_OhterServerBattleRecord_4211)obj;
            if (this.hasPlayPlayerId() != other.hasPlayPlayerId()) {
               return false;
            } else if (this.hasPlayPlayerId() && this.getPlayPlayerId() != other.getPlayPlayerId()) {
               return false;
            } else if (this.hasPlayServierId() != other.hasPlayServierId()) {
               return false;
            } else if (this.hasPlayServierId() && this.getPlayServierId() != other.getPlayServierId()) {
               return false;
            } else if (this.hasFightResult() != other.hasFightResult()) {
               return false;
            } else if (this.hasFightResult() && !this.getFightResult().equals(other.getFightResult())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPlayPlayerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayPlayerId();
            }

            if (this.hasPlayServierId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayServierId();
            }

            if (this.hasFightResult()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getFightResult().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_OhterServerBattleRecord_4211 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_OhterServerBattleRecord_4211)PARSER.parseFrom(data);
      }

      public static CR2S_OhterServerBattleRecord_4211 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_OhterServerBattleRecord_4211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_OhterServerBattleRecord_4211 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_OhterServerBattleRecord_4211)PARSER.parseFrom(data);
      }

      public static CR2S_OhterServerBattleRecord_4211 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_OhterServerBattleRecord_4211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_OhterServerBattleRecord_4211 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_OhterServerBattleRecord_4211)PARSER.parseFrom(data);
      }

      public static CR2S_OhterServerBattleRecord_4211 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_OhterServerBattleRecord_4211)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_OhterServerBattleRecord_4211 parseFrom(InputStream input) throws IOException {
         return (CR2S_OhterServerBattleRecord_4211)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_OhterServerBattleRecord_4211 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_OhterServerBattleRecord_4211)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_OhterServerBattleRecord_4211 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_OhterServerBattleRecord_4211)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_OhterServerBattleRecord_4211 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_OhterServerBattleRecord_4211)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_OhterServerBattleRecord_4211 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_OhterServerBattleRecord_4211)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_OhterServerBattleRecord_4211 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_OhterServerBattleRecord_4211)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_OhterServerBattleRecord_4211 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_OhterServerBattleRecord_4211 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_OhterServerBattleRecord_4211> parser() {
         return PARSER;
      }

      public Parser<CR2S_OhterServerBattleRecord_4211> getParserForType() {
         return PARSER;
      }

      public CR2S_OhterServerBattleRecord_4211 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_OhterServerBattleRecord_4211OrBuilder {
         private int bitField0_;
         private int playPlayerId_;
         private int playServierId_;
         private BattleMsg.S2C_BattleResult_6102 fightResult_;
         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> fightResultBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_CR2S_OhterServerBattleRecord_4211_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_CR2S_OhterServerBattleRecord_4211_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_OhterServerBattleRecord_4211.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.CR2S_OhterServerBattleRecord_4211.alwaysUseFieldBuilders) {
               this.getFightResultFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.playPlayerId_ = 0;
            this.bitField0_ &= -2;
            this.playServierId_ = 0;
            this.bitField0_ &= -3;
            if (this.fightResultBuilder_ == null) {
               this.fightResult_ = null;
            } else {
               this.fightResultBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_CR2S_OhterServerBattleRecord_4211_descriptor;
         }

         public CR2S_OhterServerBattleRecord_4211 getDefaultInstanceForType() {
            return CrossMsg.CR2S_OhterServerBattleRecord_4211.getDefaultInstance();
         }

         public CR2S_OhterServerBattleRecord_4211 build() {
            CR2S_OhterServerBattleRecord_4211 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_OhterServerBattleRecord_4211 buildPartial() {
            CR2S_OhterServerBattleRecord_4211 result = new CR2S_OhterServerBattleRecord_4211(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.playPlayerId_ = this.playPlayerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.playServierId_ = this.playServierId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               if (this.fightResultBuilder_ == null) {
                  result.fightResult_ = this.fightResult_;
               } else {
                  result.fightResult_ = (BattleMsg.S2C_BattleResult_6102)this.fightResultBuilder_.build();
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
            if (other instanceof CR2S_OhterServerBattleRecord_4211) {
               return this.mergeFrom((CR2S_OhterServerBattleRecord_4211)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_OhterServerBattleRecord_4211 other) {
            if (other == CrossMsg.CR2S_OhterServerBattleRecord_4211.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayPlayerId()) {
                  this.setPlayPlayerId(other.getPlayPlayerId());
               }

               if (other.hasPlayServierId()) {
                  this.setPlayServierId(other.getPlayServierId());
               }

               if (other.hasFightResult()) {
                  this.mergeFightResult(other.getFightResult());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayPlayerId()) {
               return false;
            } else if (!this.hasPlayServierId()) {
               return false;
            } else if (!this.hasFightResult()) {
               return false;
            } else {
               return this.getFightResult().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_OhterServerBattleRecord_4211 parsedMessage = null;

            try {
               parsedMessage = (CR2S_OhterServerBattleRecord_4211)CrossMsg.CR2S_OhterServerBattleRecord_4211.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_OhterServerBattleRecord_4211)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayPlayerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getPlayPlayerId() {
            return this.playPlayerId_;
         }

         public Builder setPlayPlayerId(int value) {
            this.bitField0_ |= 1;
            this.playPlayerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayPlayerId() {
            this.bitField0_ &= -2;
            this.playPlayerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPlayServierId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getPlayServierId() {
            return this.playServierId_;
         }

         public Builder setPlayServierId(int value) {
            this.bitField0_ |= 2;
            this.playServierId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlayServierId() {
            this.bitField0_ &= -3;
            this.playServierId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFightResult() {
            return (this.bitField0_ & 4) != 0;
         }

         public BattleMsg.S2C_BattleResult_6102 getFightResult() {
            if (this.fightResultBuilder_ == null) {
               return this.fightResult_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.fightResult_;
            } else {
               return (BattleMsg.S2C_BattleResult_6102)this.fightResultBuilder_.getMessage();
            }
         }

         public Builder setFightResult(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.fightResultBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.fightResult_ = value;
               this.onChanged();
            } else {
               this.fightResultBuilder_.setMessage(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setFightResult(BattleMsg.S2C_BattleResult_6102.Builder builderForValue) {
            if (this.fightResultBuilder_ == null) {
               this.fightResult_ = builderForValue.build();
               this.onChanged();
            } else {
               this.fightResultBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeFightResult(BattleMsg.S2C_BattleResult_6102 value) {
            if (this.fightResultBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.fightResult_ != null && this.fightResult_ != BattleMsg.S2C_BattleResult_6102.getDefaultInstance()) {
                  this.fightResult_ = BattleMsg.S2C_BattleResult_6102.newBuilder(this.fightResult_).mergeFrom(value).buildPartial();
               } else {
                  this.fightResult_ = value;
               }

               this.onChanged();
            } else {
               this.fightResultBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearFightResult() {
            if (this.fightResultBuilder_ == null) {
               this.fightResult_ = null;
               this.onChanged();
            } else {
               this.fightResultBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public BattleMsg.S2C_BattleResult_6102.Builder getFightResultBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (BattleMsg.S2C_BattleResult_6102.Builder)this.getFightResultFieldBuilder().getBuilder();
         }

         public BattleMsg.S2C_BattleResult_6102OrBuilder getFightResultOrBuilder() {
            if (this.fightResultBuilder_ != null) {
               return (BattleMsg.S2C_BattleResult_6102OrBuilder)this.fightResultBuilder_.getMessageOrBuilder();
            } else {
               return this.fightResult_ == null ? BattleMsg.S2C_BattleResult_6102.getDefaultInstance() : this.fightResult_;
            }
         }

         private SingleFieldBuilderV3<BattleMsg.S2C_BattleResult_6102, BattleMsg.S2C_BattleResult_6102.Builder, BattleMsg.S2C_BattleResult_6102OrBuilder> getFightResultFieldBuilder() {
            if (this.fightResultBuilder_ == null) {
               this.fightResultBuilder_ = new SingleFieldBuilderV3(this.getFightResult(), this.getParentForChildren(), this.isClean());
               this.fightResult_ = null;
            }

            return this.fightResultBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CR2S_ChangeInfoResult_4212 extends GeneratedMessageV3 implements CR2S_ChangeInfoResult_4212OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GROUP_FIELD_NUMBER = 1;
      private int group_;
      private byte memoizedIsInitialized;
      private static final CR2S_ChangeInfoResult_4212 DEFAULT_INSTANCE = new CR2S_ChangeInfoResult_4212();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_ChangeInfoResult_4212> PARSER = new AbstractParser<CR2S_ChangeInfoResult_4212>() {
         public CR2S_ChangeInfoResult_4212 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_ChangeInfoResult_4212(input, extensionRegistry);
         }
      };

      private CR2S_ChangeInfoResult_4212(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_ChangeInfoResult_4212() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_ChangeInfoResult_4212();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_ChangeInfoResult_4212(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.group_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_CR2S_ChangeInfoResult_4212_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_CR2S_ChangeInfoResult_4212_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ChangeInfoResult_4212.class, Builder.class);
      }

      public boolean hasGroup() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGroup() {
         return this.group_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasGroup()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.group_);
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
               size += CodedOutputStream.computeInt32Size(1, this.group_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_ChangeInfoResult_4212)) {
            return super.equals(obj);
         } else {
            CR2S_ChangeInfoResult_4212 other = (CR2S_ChangeInfoResult_4212)obj;
            if (this.hasGroup() != other.hasGroup()) {
               return false;
            } else if (this.hasGroup() && this.getGroup() != other.getGroup()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasGroup()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGroup();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_ChangeInfoResult_4212 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_ChangeInfoResult_4212)PARSER.parseFrom(data);
      }

      public static CR2S_ChangeInfoResult_4212 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ChangeInfoResult_4212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ChangeInfoResult_4212 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_ChangeInfoResult_4212)PARSER.parseFrom(data);
      }

      public static CR2S_ChangeInfoResult_4212 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ChangeInfoResult_4212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ChangeInfoResult_4212 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_ChangeInfoResult_4212)PARSER.parseFrom(data);
      }

      public static CR2S_ChangeInfoResult_4212 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_ChangeInfoResult_4212)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_ChangeInfoResult_4212 parseFrom(InputStream input) throws IOException {
         return (CR2S_ChangeInfoResult_4212)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ChangeInfoResult_4212 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ChangeInfoResult_4212)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ChangeInfoResult_4212 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_ChangeInfoResult_4212)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_ChangeInfoResult_4212 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ChangeInfoResult_4212)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_ChangeInfoResult_4212 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_ChangeInfoResult_4212)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_ChangeInfoResult_4212 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_ChangeInfoResult_4212)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_ChangeInfoResult_4212 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_ChangeInfoResult_4212 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_ChangeInfoResult_4212> parser() {
         return PARSER;
      }

      public Parser<CR2S_ChangeInfoResult_4212> getParserForType() {
         return PARSER;
      }

      public CR2S_ChangeInfoResult_4212 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_ChangeInfoResult_4212OrBuilder {
         private int bitField0_;
         private int group_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_CR2S_ChangeInfoResult_4212_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_CR2S_ChangeInfoResult_4212_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_ChangeInfoResult_4212.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.CR2S_ChangeInfoResult_4212.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.group_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_CR2S_ChangeInfoResult_4212_descriptor;
         }

         public CR2S_ChangeInfoResult_4212 getDefaultInstanceForType() {
            return CrossMsg.CR2S_ChangeInfoResult_4212.getDefaultInstance();
         }

         public CR2S_ChangeInfoResult_4212 build() {
            CR2S_ChangeInfoResult_4212 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_ChangeInfoResult_4212 buildPartial() {
            CR2S_ChangeInfoResult_4212 result = new CR2S_ChangeInfoResult_4212(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.group_ = this.group_;
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
            if (other instanceof CR2S_ChangeInfoResult_4212) {
               return this.mergeFrom((CR2S_ChangeInfoResult_4212)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_ChangeInfoResult_4212 other) {
            if (other == CrossMsg.CR2S_ChangeInfoResult_4212.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGroup()) {
                  this.setGroup(other.getGroup());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasGroup();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_ChangeInfoResult_4212 parsedMessage = null;

            try {
               parsedMessage = (CR2S_ChangeInfoResult_4212)CrossMsg.CR2S_ChangeInfoResult_4212.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_ChangeInfoResult_4212)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGroup() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGroup() {
            return this.group_;
         }

         public Builder setGroup(int value) {
            this.bitField0_ |= 1;
            this.group_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGroup() {
            this.bitField0_ &= -2;
            this.group_ = 0;
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

   public static final class S2CR_Update_4213 extends GeneratedMessageV3 implements S2CR_Update_4213OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SERVERID_FIELD_NUMBER = 1;
      private int serverId_;
      public static final int GROUPID_FIELD_NUMBER = 2;
      private int groupId_;
      public static final int SLAVESERVERID_FIELD_NUMBER = 3;
      private Internal.IntList slaveServerId_;
      public static final int PLATFORMID_FIELD_NUMBER = 4;
      private int platformId_;
      public static final int WORLDLV_FIELD_NUMBER = 5;
      private int worldLv_;
      public static final int OPENTIME_FIELD_NUMBER = 6;
      private long openTime_;
      public static final int CURALIVEPLAYERNUM_FIELD_NUMBER = 7;
      private long curAlivePlayerNum_;
      public static final int CURAVGPOWER_FIELD_NUMBER = 8;
      private long curAvgPower_;
      private byte memoizedIsInitialized;
      private static final S2CR_Update_4213 DEFAULT_INSTANCE = new S2CR_Update_4213();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_Update_4213> PARSER = new AbstractParser<S2CR_Update_4213>() {
         public S2CR_Update_4213 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_Update_4213(input, extensionRegistry);
         }
      };

      private S2CR_Update_4213(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_Update_4213() {
         this.memoizedIsInitialized = -1;
         this.slaveServerId_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_Update_4213();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_Update_4213(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.serverId_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.groupId_ = input.readInt32();
                        continue;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.slaveServerId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.slaveServerId_.addInt(input.readInt32());
                        continue;
                     case 26:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.slaveServerId_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.platformId_ = input.readInt32();
                        continue;
                     case 40:
                        this.bitField0_ |= 8;
                        this.worldLv_ = input.readInt32();
                        continue;
                     case 48:
                        this.bitField0_ |= 16;
                        this.openTime_ = input.readInt64();
                        continue;
                     case 56:
                        this.bitField0_ |= 32;
                        this.curAlivePlayerNum_ = input.readInt64();
                        continue;
                     case 64:
                        this.bitField0_ |= 64;
                        this.curAvgPower_ = input.readInt64();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.slaveServerId_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 4) != 0) {
                  this.slaveServerId_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMsg.internal_static_common_S2CR_Update_4213_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_Update_4213_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Update_4213.class, Builder.class);
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasGroupId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getGroupId() {
         return this.groupId_;
      }

      public List<Integer> getSlaveServerIdList() {
         return this.slaveServerId_;
      }

      public int getSlaveServerIdCount() {
         return this.slaveServerId_.size();
      }

      public int getSlaveServerId(int index) {
         return this.slaveServerId_.getInt(index);
      }

      public boolean hasPlatformId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getPlatformId() {
         return this.platformId_;
      }

      public boolean hasWorldLv() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getWorldLv() {
         return this.worldLv_;
      }

      public boolean hasOpenTime() {
         return (this.bitField0_ & 16) != 0;
      }

      public long getOpenTime() {
         return this.openTime_;
      }

      public boolean hasCurAlivePlayerNum() {
         return (this.bitField0_ & 32) != 0;
      }

      public long getCurAlivePlayerNum() {
         return this.curAlivePlayerNum_;
      }

      public boolean hasCurAvgPower() {
         return (this.bitField0_ & 64) != 0;
      }

      public long getCurAvgPower() {
         return this.curAvgPower_;
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
         } else if (!this.hasPlatformId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasWorldLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasOpenTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCurAlivePlayerNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCurAvgPower()) {
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
            output.writeInt32(2, this.groupId_);
         }

         for(int i = 0; i < this.slaveServerId_.size(); ++i) {
            output.writeInt32(3, this.slaveServerId_.getInt(i));
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.platformId_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.worldLv_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt64(6, this.openTime_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt64(7, this.curAlivePlayerNum_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt64(8, this.curAvgPower_);
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
               size += CodedOutputStream.computeInt32Size(2, this.groupId_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.slaveServerId_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.slaveServerId_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getSlaveServerIdList().size();
            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.platformId_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.worldLv_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt64Size(6, this.openTime_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt64Size(7, this.curAlivePlayerNum_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt64Size(8, this.curAvgPower_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_Update_4213)) {
            return super.equals(obj);
         } else {
            S2CR_Update_4213 other = (S2CR_Update_4213)obj;
            if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasGroupId() != other.hasGroupId()) {
               return false;
            } else if (this.hasGroupId() && this.getGroupId() != other.getGroupId()) {
               return false;
            } else if (!this.getSlaveServerIdList().equals(other.getSlaveServerIdList())) {
               return false;
            } else if (this.hasPlatformId() != other.hasPlatformId()) {
               return false;
            } else if (this.hasPlatformId() && this.getPlatformId() != other.getPlatformId()) {
               return false;
            } else if (this.hasWorldLv() != other.hasWorldLv()) {
               return false;
            } else if (this.hasWorldLv() && this.getWorldLv() != other.getWorldLv()) {
               return false;
            } else if (this.hasOpenTime() != other.hasOpenTime()) {
               return false;
            } else if (this.hasOpenTime() && this.getOpenTime() != other.getOpenTime()) {
               return false;
            } else if (this.hasCurAlivePlayerNum() != other.hasCurAlivePlayerNum()) {
               return false;
            } else if (this.hasCurAlivePlayerNum() && this.getCurAlivePlayerNum() != other.getCurAlivePlayerNum()) {
               return false;
            } else if (this.hasCurAvgPower() != other.hasCurAvgPower()) {
               return false;
            } else if (this.hasCurAvgPower() && this.getCurAvgPower() != other.getCurAvgPower()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasGroupId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGroupId();
            }

            if (this.getSlaveServerIdCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSlaveServerIdList().hashCode();
            }

            if (this.hasPlatformId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPlatformId();
            }

            if (this.hasWorldLv()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getWorldLv();
            }

            if (this.hasOpenTime()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashLong(this.getOpenTime());
            }

            if (this.hasCurAlivePlayerNum()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + Internal.hashLong(this.getCurAlivePlayerNum());
            }

            if (this.hasCurAvgPower()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + Internal.hashLong(this.getCurAvgPower());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_Update_4213 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_Update_4213)PARSER.parseFrom(data);
      }

      public static S2CR_Update_4213 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Update_4213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Update_4213 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_Update_4213)PARSER.parseFrom(data);
      }

      public static S2CR_Update_4213 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Update_4213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Update_4213 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_Update_4213)PARSER.parseFrom(data);
      }

      public static S2CR_Update_4213 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_Update_4213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_Update_4213 parseFrom(InputStream input) throws IOException {
         return (S2CR_Update_4213)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Update_4213 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Update_4213)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Update_4213 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_Update_4213)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_Update_4213 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Update_4213)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_Update_4213 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_Update_4213)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_Update_4213 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_Update_4213)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_Update_4213 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_Update_4213 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_Update_4213> parser() {
         return PARSER;
      }

      public Parser<S2CR_Update_4213> getParserForType() {
         return PARSER;
      }

      public S2CR_Update_4213 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_Update_4213OrBuilder {
         private int bitField0_;
         private int serverId_;
         private int groupId_;
         private Internal.IntList slaveServerId_;
         private int platformId_;
         private int worldLv_;
         private long openTime_;
         private long curAlivePlayerNum_;
         private long curAvgPower_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_Update_4213_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_Update_4213_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_Update_4213.class, Builder.class);
         }

         private Builder() {
            this.slaveServerId_ = CrossMsg.S2CR_Update_4213.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.slaveServerId_ = CrossMsg.S2CR_Update_4213.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_Update_4213.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.serverId_ = 0;
            this.bitField0_ &= -2;
            this.groupId_ = 0;
            this.bitField0_ &= -3;
            this.slaveServerId_ = CrossMsg.S2CR_Update_4213.emptyIntList();
            this.bitField0_ &= -5;
            this.platformId_ = 0;
            this.bitField0_ &= -9;
            this.worldLv_ = 0;
            this.bitField0_ &= -17;
            this.openTime_ = 0L;
            this.bitField0_ &= -33;
            this.curAlivePlayerNum_ = 0L;
            this.bitField0_ &= -65;
            this.curAvgPower_ = 0L;
            this.bitField0_ &= -129;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_Update_4213_descriptor;
         }

         public S2CR_Update_4213 getDefaultInstanceForType() {
            return CrossMsg.S2CR_Update_4213.getDefaultInstance();
         }

         public S2CR_Update_4213 build() {
            S2CR_Update_4213 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_Update_4213 buildPartial() {
            S2CR_Update_4213 result = new S2CR_Update_4213(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.groupId_ = this.groupId_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.slaveServerId_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.slaveServerId_ = this.slaveServerId_;
            if ((from_bitField0_ & 8) != 0) {
               result.platformId_ = this.platformId_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.worldLv_ = this.worldLv_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.openTime_ = this.openTime_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.curAlivePlayerNum_ = this.curAlivePlayerNum_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.curAvgPower_ = this.curAvgPower_;
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
            if (other instanceof S2CR_Update_4213) {
               return this.mergeFrom((S2CR_Update_4213)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_Update_4213 other) {
            if (other == CrossMsg.S2CR_Update_4213.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasGroupId()) {
                  this.setGroupId(other.getGroupId());
               }

               if (!other.slaveServerId_.isEmpty()) {
                  if (this.slaveServerId_.isEmpty()) {
                     this.slaveServerId_ = other.slaveServerId_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureSlaveServerIdIsMutable();
                     this.slaveServerId_.addAll(other.slaveServerId_);
                  }

                  this.onChanged();
               }

               if (other.hasPlatformId()) {
                  this.setPlatformId(other.getPlatformId());
               }

               if (other.hasWorldLv()) {
                  this.setWorldLv(other.getWorldLv());
               }

               if (other.hasOpenTime()) {
                  this.setOpenTime(other.getOpenTime());
               }

               if (other.hasCurAlivePlayerNum()) {
                  this.setCurAlivePlayerNum(other.getCurAlivePlayerNum());
               }

               if (other.hasCurAvgPower()) {
                  this.setCurAvgPower(other.getCurAvgPower());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasServerId()) {
               return false;
            } else if (!this.hasPlatformId()) {
               return false;
            } else if (!this.hasWorldLv()) {
               return false;
            } else if (!this.hasOpenTime()) {
               return false;
            } else if (!this.hasCurAlivePlayerNum()) {
               return false;
            } else {
               return this.hasCurAvgPower();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_Update_4213 parsedMessage = null;

            try {
               parsedMessage = (S2CR_Update_4213)CrossMsg.S2CR_Update_4213.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_Update_4213)e.getUnfinishedMessage();
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

         public boolean hasGroupId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getGroupId() {
            return this.groupId_;
         }

         public Builder setGroupId(int value) {
            this.bitField0_ |= 2;
            this.groupId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGroupId() {
            this.bitField0_ &= -3;
            this.groupId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureSlaveServerIdIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.slaveServerId_ = CrossMsg.S2CR_Update_4213.mutableCopy(this.slaveServerId_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getSlaveServerIdList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.slaveServerId_) : this.slaveServerId_);
         }

         public int getSlaveServerIdCount() {
            return this.slaveServerId_.size();
         }

         public int getSlaveServerId(int index) {
            return this.slaveServerId_.getInt(index);
         }

         public Builder setSlaveServerId(int index, int value) {
            this.ensureSlaveServerIdIsMutable();
            this.slaveServerId_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addSlaveServerId(int value) {
            this.ensureSlaveServerIdIsMutable();
            this.slaveServerId_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllSlaveServerId(Iterable<? extends Integer> values) {
            this.ensureSlaveServerIdIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.slaveServerId_);
            this.onChanged();
            return this;
         }

         public Builder clearSlaveServerId() {
            this.slaveServerId_ = CrossMsg.S2CR_Update_4213.emptyIntList();
            this.bitField0_ &= -5;
            this.onChanged();
            return this;
         }

         public boolean hasPlatformId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getPlatformId() {
            return this.platformId_;
         }

         public Builder setPlatformId(int value) {
            this.bitField0_ |= 8;
            this.platformId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPlatformId() {
            this.bitField0_ &= -9;
            this.platformId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasWorldLv() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getWorldLv() {
            return this.worldLv_;
         }

         public Builder setWorldLv(int value) {
            this.bitField0_ |= 16;
            this.worldLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearWorldLv() {
            this.bitField0_ &= -17;
            this.worldLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasOpenTime() {
            return (this.bitField0_ & 32) != 0;
         }

         public long getOpenTime() {
            return this.openTime_;
         }

         public Builder setOpenTime(long value) {
            this.bitField0_ |= 32;
            this.openTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOpenTime() {
            this.bitField0_ &= -33;
            this.openTime_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasCurAlivePlayerNum() {
            return (this.bitField0_ & 64) != 0;
         }

         public long getCurAlivePlayerNum() {
            return this.curAlivePlayerNum_;
         }

         public Builder setCurAlivePlayerNum(long value) {
            this.bitField0_ |= 64;
            this.curAlivePlayerNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCurAlivePlayerNum() {
            this.bitField0_ &= -65;
            this.curAlivePlayerNum_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasCurAvgPower() {
            return (this.bitField0_ & 128) != 0;
         }

         public long getCurAvgPower() {
            return this.curAvgPower_;
         }

         public Builder setCurAvgPower(long value) {
            this.bitField0_ |= 128;
            this.curAvgPower_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCurAvgPower() {
            this.bitField0_ &= -129;
            this.curAvgPower_ = 0L;
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

   public static final class CR2S_DelRecordByModel_4215 extends GeneratedMessageV3 implements CR2S_DelRecordByModel_4215OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MODEL_FIELD_NUMBER = 1;
      private int model_;
      private byte memoizedIsInitialized;
      private static final CR2S_DelRecordByModel_4215 DEFAULT_INSTANCE = new CR2S_DelRecordByModel_4215();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_DelRecordByModel_4215> PARSER = new AbstractParser<CR2S_DelRecordByModel_4215>() {
         public CR2S_DelRecordByModel_4215 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_DelRecordByModel_4215(input, extensionRegistry);
         }
      };

      private CR2S_DelRecordByModel_4215(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_DelRecordByModel_4215() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_DelRecordByModel_4215();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_DelRecordByModel_4215(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.model_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_CR2S_DelRecordByModel_4215_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_CR2S_DelRecordByModel_4215_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_DelRecordByModel_4215.class, Builder.class);
      }

      public boolean hasModel() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getModel() {
         return this.model_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasModel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.model_);
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
               size += CodedOutputStream.computeInt32Size(1, this.model_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CR2S_DelRecordByModel_4215)) {
            return super.equals(obj);
         } else {
            CR2S_DelRecordByModel_4215 other = (CR2S_DelRecordByModel_4215)obj;
            if (this.hasModel() != other.hasModel()) {
               return false;
            } else if (this.hasModel() && this.getModel() != other.getModel()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasModel()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getModel();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CR2S_DelRecordByModel_4215 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_DelRecordByModel_4215)PARSER.parseFrom(data);
      }

      public static CR2S_DelRecordByModel_4215 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_DelRecordByModel_4215)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_DelRecordByModel_4215 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_DelRecordByModel_4215)PARSER.parseFrom(data);
      }

      public static CR2S_DelRecordByModel_4215 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_DelRecordByModel_4215)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_DelRecordByModel_4215 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_DelRecordByModel_4215)PARSER.parseFrom(data);
      }

      public static CR2S_DelRecordByModel_4215 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_DelRecordByModel_4215)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_DelRecordByModel_4215 parseFrom(InputStream input) throws IOException {
         return (CR2S_DelRecordByModel_4215)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_DelRecordByModel_4215 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_DelRecordByModel_4215)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_DelRecordByModel_4215 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_DelRecordByModel_4215)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_DelRecordByModel_4215 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_DelRecordByModel_4215)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_DelRecordByModel_4215 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_DelRecordByModel_4215)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_DelRecordByModel_4215 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_DelRecordByModel_4215)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_DelRecordByModel_4215 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_DelRecordByModel_4215 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_DelRecordByModel_4215> parser() {
         return PARSER;
      }

      public Parser<CR2S_DelRecordByModel_4215> getParserForType() {
         return PARSER;
      }

      public CR2S_DelRecordByModel_4215 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_DelRecordByModel_4215OrBuilder {
         private int bitField0_;
         private int model_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_CR2S_DelRecordByModel_4215_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_CR2S_DelRecordByModel_4215_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_DelRecordByModel_4215.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.CR2S_DelRecordByModel_4215.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.model_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_CR2S_DelRecordByModel_4215_descriptor;
         }

         public CR2S_DelRecordByModel_4215 getDefaultInstanceForType() {
            return CrossMsg.CR2S_DelRecordByModel_4215.getDefaultInstance();
         }

         public CR2S_DelRecordByModel_4215 build() {
            CR2S_DelRecordByModel_4215 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_DelRecordByModel_4215 buildPartial() {
            CR2S_DelRecordByModel_4215 result = new CR2S_DelRecordByModel_4215(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.model_ = this.model_;
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
            if (other instanceof CR2S_DelRecordByModel_4215) {
               return this.mergeFrom((CR2S_DelRecordByModel_4215)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_DelRecordByModel_4215 other) {
            if (other == CrossMsg.CR2S_DelRecordByModel_4215.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasModel()) {
                  this.setModel(other.getModel());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasModel();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CR2S_DelRecordByModel_4215 parsedMessage = null;

            try {
               parsedMessage = (CR2S_DelRecordByModel_4215)CrossMsg.CR2S_DelRecordByModel_4215.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_DelRecordByModel_4215)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasModel() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getModel() {
            return this.model_;
         }

         public Builder setModel(int value) {
            this.bitField0_ |= 1;
            this.model_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearModel() {
            this.bitField0_ &= -2;
            this.model_ = 0;
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

   public static final class S2CR_UnionUpload_4216 extends GeneratedMessageV3 implements S2CR_UnionUpload_4216OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ONCONNECT_FIELD_NUMBER = 1;
      private boolean onConnect_;
      public static final int ID_FIELD_NUMBER = 2;
      private int id_;
      public static final int NAME_FIELD_NUMBER = 3;
      private volatile Object name_;
      public static final int LV_FIELD_NUMBER = 4;
      private int lv_;
      public static final int COPYID_FIELD_NUMBER = 5;
      private int copyId_;
      public static final int SERVER_FIELD_NUMBER = 6;
      private int server_;
      public static final int LEADER_FIELD_NUMBER = 7;
      private int leader_;
      public static final int ISDISMISS_FIELD_NUMBER = 8;
      private boolean isDismiss_;
      public static final int HEAD_FIELD_NUMBER = 9;
      private int head_;
      private byte memoizedIsInitialized;
      private static final S2CR_UnionUpload_4216 DEFAULT_INSTANCE = new S2CR_UnionUpload_4216();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UnionUpload_4216> PARSER = new AbstractParser<S2CR_UnionUpload_4216>() {
         public S2CR_UnionUpload_4216 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UnionUpload_4216(input, extensionRegistry);
         }
      };

      private S2CR_UnionUpload_4216(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UnionUpload_4216() {
         this.memoizedIsInitialized = -1;
         this.name_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UnionUpload_4216();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UnionUpload_4216(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.onConnect_ = input.readBool();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.id_ = input.readInt32();
                        break;
                     case 26:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4;
                        this.name_ = bs;
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.lv_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.copyId_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.server_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.leader_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.isDismiss_ = input.readBool();
                        break;
                     case 72:
                        this.bitField0_ |= 256;
                        this.head_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_UnionUpload_4216_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_UnionUpload_4216_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UnionUpload_4216.class, Builder.class);
      }

      public boolean hasOnConnect() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getOnConnect() {
         return this.onConnect_;
      }

      public boolean hasId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasName() {
         return (this.bitField0_ & 4) != 0;
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

      public boolean hasLv() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getLv() {
         return this.lv_;
      }

      public boolean hasCopyId() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getCopyId() {
         return this.copyId_;
      }

      public boolean hasServer() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getServer() {
         return this.server_;
      }

      public boolean hasLeader() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getLeader() {
         return this.leader_;
      }

      public boolean hasIsDismiss() {
         return (this.bitField0_ & 128) != 0;
      }

      public boolean getIsDismiss() {
         return this.isDismiss_;
      }

      public boolean hasHead() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getHead() {
         return this.head_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasOnConnect()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIsDismiss()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.onConnect_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.id_);
         }

         if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(output, 3, this.name_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.lv_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.copyId_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.server_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.leader_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeBool(8, this.isDismiss_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(9, this.head_);
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
               size += CodedOutputStream.computeBoolSize(1, this.onConnect_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.id_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += GeneratedMessageV3.computeStringSize(3, this.name_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.lv_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.copyId_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.server_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.leader_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeBoolSize(8, this.isDismiss_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.head_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UnionUpload_4216)) {
            return super.equals(obj);
         } else {
            S2CR_UnionUpload_4216 other = (S2CR_UnionUpload_4216)obj;
            if (this.hasOnConnect() != other.hasOnConnect()) {
               return false;
            } else if (this.hasOnConnect() && this.getOnConnect() != other.getOnConnect()) {
               return false;
            } else if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
               return false;
            } else if (this.hasName() != other.hasName()) {
               return false;
            } else if (this.hasName() && !this.getName().equals(other.getName())) {
               return false;
            } else if (this.hasLv() != other.hasLv()) {
               return false;
            } else if (this.hasLv() && this.getLv() != other.getLv()) {
               return false;
            } else if (this.hasCopyId() != other.hasCopyId()) {
               return false;
            } else if (this.hasCopyId() && this.getCopyId() != other.getCopyId()) {
               return false;
            } else if (this.hasServer() != other.hasServer()) {
               return false;
            } else if (this.hasServer() && this.getServer() != other.getServer()) {
               return false;
            } else if (this.hasLeader() != other.hasLeader()) {
               return false;
            } else if (this.hasLeader() && this.getLeader() != other.getLeader()) {
               return false;
            } else if (this.hasIsDismiss() != other.hasIsDismiss()) {
               return false;
            } else if (this.hasIsDismiss() && this.getIsDismiss() != other.getIsDismiss()) {
               return false;
            } else if (this.hasHead() != other.hasHead()) {
               return false;
            } else if (this.hasHead() && this.getHead() != other.getHead()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasOnConnect()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getOnConnect());
            }

            if (this.hasId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getId();
            }

            if (this.hasName()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getName().hashCode();
            }

            if (this.hasLv()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getLv();
            }

            if (this.hasCopyId()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getCopyId();
            }

            if (this.hasServer()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getServer();
            }

            if (this.hasLeader()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getLeader();
            }

            if (this.hasIsDismiss()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + Internal.hashBoolean(this.getIsDismiss());
            }

            if (this.hasHead()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getHead();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UnionUpload_4216 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UnionUpload_4216)PARSER.parseFrom(data);
      }

      public static S2CR_UnionUpload_4216 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UnionUpload_4216)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UnionUpload_4216 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UnionUpload_4216)PARSER.parseFrom(data);
      }

      public static S2CR_UnionUpload_4216 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UnionUpload_4216)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UnionUpload_4216 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UnionUpload_4216)PARSER.parseFrom(data);
      }

      public static S2CR_UnionUpload_4216 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UnionUpload_4216)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UnionUpload_4216 parseFrom(InputStream input) throws IOException {
         return (S2CR_UnionUpload_4216)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UnionUpload_4216 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UnionUpload_4216)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UnionUpload_4216 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UnionUpload_4216)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UnionUpload_4216 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UnionUpload_4216)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UnionUpload_4216 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UnionUpload_4216)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UnionUpload_4216 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UnionUpload_4216)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UnionUpload_4216 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UnionUpload_4216 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UnionUpload_4216> parser() {
         return PARSER;
      }

      public Parser<S2CR_UnionUpload_4216> getParserForType() {
         return PARSER;
      }

      public S2CR_UnionUpload_4216 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UnionUpload_4216OrBuilder {
         private int bitField0_;
         private boolean onConnect_;
         private int id_;
         private Object name_;
         private int lv_;
         private int copyId_;
         private int server_;
         private int leader_;
         private boolean isDismiss_;
         private int head_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_UnionUpload_4216_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_UnionUpload_4216_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UnionUpload_4216.class, Builder.class);
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
            if (CrossMsg.S2CR_UnionUpload_4216.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.onConnect_ = false;
            this.bitField0_ &= -2;
            this.id_ = 0;
            this.bitField0_ &= -3;
            this.name_ = "";
            this.bitField0_ &= -5;
            this.lv_ = 0;
            this.bitField0_ &= -9;
            this.copyId_ = 0;
            this.bitField0_ &= -17;
            this.server_ = 0;
            this.bitField0_ &= -33;
            this.leader_ = 0;
            this.bitField0_ &= -65;
            this.isDismiss_ = false;
            this.bitField0_ &= -129;
            this.head_ = 0;
            this.bitField0_ &= -257;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_UnionUpload_4216_descriptor;
         }

         public S2CR_UnionUpload_4216 getDefaultInstanceForType() {
            return CrossMsg.S2CR_UnionUpload_4216.getDefaultInstance();
         }

         public S2CR_UnionUpload_4216 build() {
            S2CR_UnionUpload_4216 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UnionUpload_4216 buildPartial() {
            S2CR_UnionUpload_4216 result = new S2CR_UnionUpload_4216(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.onConnect_ = this.onConnect_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.name_ = this.name_;
            if ((from_bitField0_ & 8) != 0) {
               result.lv_ = this.lv_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.copyId_ = this.copyId_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.server_ = this.server_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.leader_ = this.leader_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.isDismiss_ = this.isDismiss_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 256) != 0) {
               result.head_ = this.head_;
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
            if (other instanceof S2CR_UnionUpload_4216) {
               return this.mergeFrom((S2CR_UnionUpload_4216)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UnionUpload_4216 other) {
            if (other == CrossMsg.S2CR_UnionUpload_4216.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasOnConnect()) {
                  this.setOnConnect(other.getOnConnect());
               }

               if (other.hasId()) {
                  this.setId(other.getId());
               }

               if (other.hasName()) {
                  this.bitField0_ |= 4;
                  this.name_ = other.name_;
                  this.onChanged();
               }

               if (other.hasLv()) {
                  this.setLv(other.getLv());
               }

               if (other.hasCopyId()) {
                  this.setCopyId(other.getCopyId());
               }

               if (other.hasServer()) {
                  this.setServer(other.getServer());
               }

               if (other.hasLeader()) {
                  this.setLeader(other.getLeader());
               }

               if (other.hasIsDismiss()) {
                  this.setIsDismiss(other.getIsDismiss());
               }

               if (other.hasHead()) {
                  this.setHead(other.getHead());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasOnConnect()) {
               return false;
            } else if (!this.hasId()) {
               return false;
            } else {
               return this.hasIsDismiss();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UnionUpload_4216 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UnionUpload_4216)CrossMsg.S2CR_UnionUpload_4216.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UnionUpload_4216)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasOnConnect() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getOnConnect() {
            return this.onConnect_;
         }

         public Builder setOnConnect(boolean value) {
            this.bitField0_ |= 1;
            this.onConnect_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearOnConnect() {
            this.bitField0_ &= -2;
            this.onConnect_ = false;
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

         public boolean hasName() {
            return (this.bitField0_ & 4) != 0;
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
               this.bitField0_ |= 4;
               this.name_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearName() {
            this.bitField0_ &= -5;
            this.name_ = CrossMsg.S2CR_UnionUpload_4216.getDefaultInstance().getName();
            this.onChanged();
            return this;
         }

         public Builder setNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.name_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasLv() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getLv() {
            return this.lv_;
         }

         public Builder setLv(int value) {
            this.bitField0_ |= 8;
            this.lv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLv() {
            this.bitField0_ &= -9;
            this.lv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCopyId() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getCopyId() {
            return this.copyId_;
         }

         public Builder setCopyId(int value) {
            this.bitField0_ |= 16;
            this.copyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCopyId() {
            this.bitField0_ &= -17;
            this.copyId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasServer() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getServer() {
            return this.server_;
         }

         public Builder setServer(int value) {
            this.bitField0_ |= 32;
            this.server_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServer() {
            this.bitField0_ &= -33;
            this.server_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasLeader() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getLeader() {
            return this.leader_;
         }

         public Builder setLeader(int value) {
            this.bitField0_ |= 64;
            this.leader_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLeader() {
            this.bitField0_ &= -65;
            this.leader_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIsDismiss() {
            return (this.bitField0_ & 128) != 0;
         }

         public boolean getIsDismiss() {
            return this.isDismiss_;
         }

         public Builder setIsDismiss(boolean value) {
            this.bitField0_ |= 128;
            this.isDismiss_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIsDismiss() {
            this.bitField0_ &= -129;
            this.isDismiss_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasHead() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getHead() {
            return this.head_;
         }

         public Builder setHead(int value) {
            this.bitField0_ |= 256;
            this.head_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHead() {
            this.bitField0_ &= -257;
            this.head_ = 0;
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

   public static final class S2CR_MergeServer_4217 extends GeneratedMessageV3 implements S2CR_MergeServer_4217OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MAINID_FIELD_NUMBER = 1;
      private int mainid_;
      public static final int SLAVEIDS_FIELD_NUMBER = 2;
      private Internal.IntList slaveIds_;
      private byte memoizedIsInitialized;
      private static final S2CR_MergeServer_4217 DEFAULT_INSTANCE = new S2CR_MergeServer_4217();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_MergeServer_4217> PARSER = new AbstractParser<S2CR_MergeServer_4217>() {
         public S2CR_MergeServer_4217 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_MergeServer_4217(input, extensionRegistry);
         }
      };

      private S2CR_MergeServer_4217(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_MergeServer_4217() {
         this.memoizedIsInitialized = -1;
         this.slaveIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_MergeServer_4217();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_MergeServer_4217(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.mainid_ = input.readInt32();
                        break;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.slaveIds_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.slaveIds_.addInt(input.readInt32());
                        break;
                     case 18:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.slaveIds_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.slaveIds_.addInt(input.readInt32());
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
                  this.slaveIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return CrossMsg.internal_static_common_S2CR_MergeServer_4217_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_MergeServer_4217_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MergeServer_4217.class, Builder.class);
      }

      public boolean hasMainid() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getMainid() {
         return this.mainid_;
      }

      public List<Integer> getSlaveIdsList() {
         return this.slaveIds_;
      }

      public int getSlaveIdsCount() {
         return this.slaveIds_.size();
      }

      public int getSlaveIds(int index) {
         return this.slaveIds_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMainid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.mainid_);
         }

         for(int i = 0; i < this.slaveIds_.size(); ++i) {
            output.writeInt32(2, this.slaveIds_.getInt(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.mainid_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.slaveIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.slaveIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getSlaveIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_MergeServer_4217)) {
            return super.equals(obj);
         } else {
            S2CR_MergeServer_4217 other = (S2CR_MergeServer_4217)obj;
            if (this.hasMainid() != other.hasMainid()) {
               return false;
            } else if (this.hasMainid() && this.getMainid() != other.getMainid()) {
               return false;
            } else if (!this.getSlaveIdsList().equals(other.getSlaveIdsList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasMainid()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMainid();
            }

            if (this.getSlaveIdsCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSlaveIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_MergeServer_4217 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_MergeServer_4217)PARSER.parseFrom(data);
      }

      public static S2CR_MergeServer_4217 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MergeServer_4217)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MergeServer_4217 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_MergeServer_4217)PARSER.parseFrom(data);
      }

      public static S2CR_MergeServer_4217 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MergeServer_4217)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MergeServer_4217 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_MergeServer_4217)PARSER.parseFrom(data);
      }

      public static S2CR_MergeServer_4217 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MergeServer_4217)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MergeServer_4217 parseFrom(InputStream input) throws IOException {
         return (S2CR_MergeServer_4217)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MergeServer_4217 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MergeServer_4217)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MergeServer_4217 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_MergeServer_4217)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_MergeServer_4217 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MergeServer_4217)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MergeServer_4217 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_MergeServer_4217)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MergeServer_4217 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MergeServer_4217)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_MergeServer_4217 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_MergeServer_4217 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_MergeServer_4217> parser() {
         return PARSER;
      }

      public Parser<S2CR_MergeServer_4217> getParserForType() {
         return PARSER;
      }

      public S2CR_MergeServer_4217 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_MergeServer_4217OrBuilder {
         private int bitField0_;
         private int mainid_;
         private Internal.IntList slaveIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_MergeServer_4217_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_MergeServer_4217_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MergeServer_4217.class, Builder.class);
         }

         private Builder() {
            this.slaveIds_ = CrossMsg.S2CR_MergeServer_4217.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.slaveIds_ = CrossMsg.S2CR_MergeServer_4217.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_MergeServer_4217.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.mainid_ = 0;
            this.bitField0_ &= -2;
            this.slaveIds_ = CrossMsg.S2CR_MergeServer_4217.emptyIntList();
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_MergeServer_4217_descriptor;
         }

         public S2CR_MergeServer_4217 getDefaultInstanceForType() {
            return CrossMsg.S2CR_MergeServer_4217.getDefaultInstance();
         }

         public S2CR_MergeServer_4217 build() {
            S2CR_MergeServer_4217 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_MergeServer_4217 buildPartial() {
            S2CR_MergeServer_4217 result = new S2CR_MergeServer_4217(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.mainid_ = this.mainid_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.slaveIds_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.slaveIds_ = this.slaveIds_;
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
            if (other instanceof S2CR_MergeServer_4217) {
               return this.mergeFrom((S2CR_MergeServer_4217)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_MergeServer_4217 other) {
            if (other == CrossMsg.S2CR_MergeServer_4217.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMainid()) {
                  this.setMainid(other.getMainid());
               }

               if (!other.slaveIds_.isEmpty()) {
                  if (this.slaveIds_.isEmpty()) {
                     this.slaveIds_ = other.slaveIds_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureSlaveIdsIsMutable();
                     this.slaveIds_.addAll(other.slaveIds_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasMainid();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_MergeServer_4217 parsedMessage = null;

            try {
               parsedMessage = (S2CR_MergeServer_4217)CrossMsg.S2CR_MergeServer_4217.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_MergeServer_4217)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMainid() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getMainid() {
            return this.mainid_;
         }

         public Builder setMainid(int value) {
            this.bitField0_ |= 1;
            this.mainid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMainid() {
            this.bitField0_ &= -2;
            this.mainid_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureSlaveIdsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.slaveIds_ = CrossMsg.S2CR_MergeServer_4217.mutableCopy(this.slaveIds_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getSlaveIdsList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.slaveIds_) : this.slaveIds_);
         }

         public int getSlaveIdsCount() {
            return this.slaveIds_.size();
         }

         public int getSlaveIds(int index) {
            return this.slaveIds_.getInt(index);
         }

         public Builder setSlaveIds(int index, int value) {
            this.ensureSlaveIdsIsMutable();
            this.slaveIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addSlaveIds(int value) {
            this.ensureSlaveIdsIsMutable();
            this.slaveIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllSlaveIds(Iterable<? extends Integer> values) {
            this.ensureSlaveIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.slaveIds_);
            this.onChanged();
            return this;
         }

         public Builder clearSlaveIds() {
            this.slaveIds_ = CrossMsg.S2CR_MergeServer_4217.emptyIntList();
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

   public static final class S2CR_MergeServer_4218 extends GeneratedMessageV3 implements S2CR_MergeServer_4218OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RESULT_FIELD_NUMBER = 1;
      private boolean result_;
      private byte memoizedIsInitialized;
      private static final S2CR_MergeServer_4218 DEFAULT_INSTANCE = new S2CR_MergeServer_4218();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_MergeServer_4218> PARSER = new AbstractParser<S2CR_MergeServer_4218>() {
         public S2CR_MergeServer_4218 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_MergeServer_4218(input, extensionRegistry);
         }
      };

      private S2CR_MergeServer_4218(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_MergeServer_4218() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_MergeServer_4218();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_MergeServer_4218(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.result_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_MergeServer_4218_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_MergeServer_4218_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MergeServer_4218.class, Builder.class);
      }

      public boolean hasResult() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getResult() {
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
            output.writeBool(1, this.result_);
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
               size += CodedOutputStream.computeBoolSize(1, this.result_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_MergeServer_4218)) {
            return super.equals(obj);
         } else {
            S2CR_MergeServer_4218 other = (S2CR_MergeServer_4218)obj;
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
               hash = 53 * hash + Internal.hashBoolean(this.getResult());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_MergeServer_4218 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_MergeServer_4218)PARSER.parseFrom(data);
      }

      public static S2CR_MergeServer_4218 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MergeServer_4218)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MergeServer_4218 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_MergeServer_4218)PARSER.parseFrom(data);
      }

      public static S2CR_MergeServer_4218 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MergeServer_4218)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MergeServer_4218 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_MergeServer_4218)PARSER.parseFrom(data);
      }

      public static S2CR_MergeServer_4218 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_MergeServer_4218)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_MergeServer_4218 parseFrom(InputStream input) throws IOException {
         return (S2CR_MergeServer_4218)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MergeServer_4218 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MergeServer_4218)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MergeServer_4218 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_MergeServer_4218)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_MergeServer_4218 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MergeServer_4218)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_MergeServer_4218 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_MergeServer_4218)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_MergeServer_4218 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_MergeServer_4218)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_MergeServer_4218 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_MergeServer_4218 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_MergeServer_4218> parser() {
         return PARSER;
      }

      public Parser<S2CR_MergeServer_4218> getParserForType() {
         return PARSER;
      }

      public S2CR_MergeServer_4218 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_MergeServer_4218OrBuilder {
         private int bitField0_;
         private boolean result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_MergeServer_4218_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_MergeServer_4218_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_MergeServer_4218.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_MergeServer_4218.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.result_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_MergeServer_4218_descriptor;
         }

         public S2CR_MergeServer_4218 getDefaultInstanceForType() {
            return CrossMsg.S2CR_MergeServer_4218.getDefaultInstance();
         }

         public S2CR_MergeServer_4218 build() {
            S2CR_MergeServer_4218 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_MergeServer_4218 buildPartial() {
            S2CR_MergeServer_4218 result = new S2CR_MergeServer_4218(this);
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
            if (other instanceof S2CR_MergeServer_4218) {
               return this.mergeFrom((S2CR_MergeServer_4218)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_MergeServer_4218 other) {
            if (other == CrossMsg.S2CR_MergeServer_4218.getDefaultInstance()) {
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
            S2CR_MergeServer_4218 parsedMessage = null;

            try {
               parsedMessage = (S2CR_MergeServer_4218)CrossMsg.S2CR_MergeServer_4218.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_MergeServer_4218)e.getUnfinishedMessage();
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

         public boolean getResult() {
            return this.result_;
         }

         public Builder setResult(boolean value) {
            this.bitField0_ |= 1;
            this.result_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearResult() {
            this.bitField0_ &= -2;
            this.result_ = false;
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

   public static final class S2CR_SlaveBeMerge_4219 extends GeneratedMessageV3 implements S2CR_SlaveBeMerge_4219OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MAINID_FIELD_NUMBER = 1;
      private int mainId_;
      private byte memoizedIsInitialized;
      private static final S2CR_SlaveBeMerge_4219 DEFAULT_INSTANCE = new S2CR_SlaveBeMerge_4219();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_SlaveBeMerge_4219> PARSER = new AbstractParser<S2CR_SlaveBeMerge_4219>() {
         public S2CR_SlaveBeMerge_4219 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_SlaveBeMerge_4219(input, extensionRegistry);
         }
      };

      private S2CR_SlaveBeMerge_4219(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_SlaveBeMerge_4219() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_SlaveBeMerge_4219();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_SlaveBeMerge_4219(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.mainId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_SlaveBeMerge_4219_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_SlaveBeMerge_4219_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_SlaveBeMerge_4219.class, Builder.class);
      }

      public boolean hasMainId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getMainId() {
         return this.mainId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasMainId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.mainId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.mainId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_SlaveBeMerge_4219)) {
            return super.equals(obj);
         } else {
            S2CR_SlaveBeMerge_4219 other = (S2CR_SlaveBeMerge_4219)obj;
            if (this.hasMainId() != other.hasMainId()) {
               return false;
            } else if (this.hasMainId() && this.getMainId() != other.getMainId()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasMainId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getMainId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_SlaveBeMerge_4219 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_SlaveBeMerge_4219)PARSER.parseFrom(data);
      }

      public static S2CR_SlaveBeMerge_4219 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SlaveBeMerge_4219)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SlaveBeMerge_4219 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_SlaveBeMerge_4219)PARSER.parseFrom(data);
      }

      public static S2CR_SlaveBeMerge_4219 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SlaveBeMerge_4219)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SlaveBeMerge_4219 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_SlaveBeMerge_4219)PARSER.parseFrom(data);
      }

      public static S2CR_SlaveBeMerge_4219 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_SlaveBeMerge_4219)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_SlaveBeMerge_4219 parseFrom(InputStream input) throws IOException {
         return (S2CR_SlaveBeMerge_4219)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_SlaveBeMerge_4219 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SlaveBeMerge_4219)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_SlaveBeMerge_4219 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_SlaveBeMerge_4219)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_SlaveBeMerge_4219 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SlaveBeMerge_4219)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_SlaveBeMerge_4219 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_SlaveBeMerge_4219)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_SlaveBeMerge_4219 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_SlaveBeMerge_4219)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_SlaveBeMerge_4219 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_SlaveBeMerge_4219 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_SlaveBeMerge_4219> parser() {
         return PARSER;
      }

      public Parser<S2CR_SlaveBeMerge_4219> getParserForType() {
         return PARSER;
      }

      public S2CR_SlaveBeMerge_4219 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_SlaveBeMerge_4219OrBuilder {
         private int bitField0_;
         private int mainId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_SlaveBeMerge_4219_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_SlaveBeMerge_4219_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_SlaveBeMerge_4219.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_SlaveBeMerge_4219.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.mainId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_SlaveBeMerge_4219_descriptor;
         }

         public S2CR_SlaveBeMerge_4219 getDefaultInstanceForType() {
            return CrossMsg.S2CR_SlaveBeMerge_4219.getDefaultInstance();
         }

         public S2CR_SlaveBeMerge_4219 build() {
            S2CR_SlaveBeMerge_4219 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_SlaveBeMerge_4219 buildPartial() {
            S2CR_SlaveBeMerge_4219 result = new S2CR_SlaveBeMerge_4219(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.mainId_ = this.mainId_;
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
            if (other instanceof S2CR_SlaveBeMerge_4219) {
               return this.mergeFrom((S2CR_SlaveBeMerge_4219)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_SlaveBeMerge_4219 other) {
            if (other == CrossMsg.S2CR_SlaveBeMerge_4219.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMainId()) {
                  this.setMainId(other.getMainId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasMainId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_SlaveBeMerge_4219 parsedMessage = null;

            try {
               parsedMessage = (S2CR_SlaveBeMerge_4219)CrossMsg.S2CR_SlaveBeMerge_4219.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_SlaveBeMerge_4219)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasMainId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getMainId() {
            return this.mainId_;
         }

         public Builder setMainId(int value) {
            this.bitField0_ |= 1;
            this.mainId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMainId() {
            this.bitField0_ &= -2;
            this.mainId_ = 0;
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

   public static final class S2CR_CrossPKList_4220 extends GeneratedMessageV3 implements S2CR_CrossPKList_4220OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POWER_FIELD_NUMBER = 1;
      private long power_;
      public static final int MATCHPOWERMIN_FIELD_NUMBER = 2;
      private long matchPowerMin_;
      public static final int MATCHPOWERMAX_FIELD_NUMBER = 3;
      private long matchPowerMax_;
      public static final int PLAYERNAME_FIELD_NUMBER = 4;
      private volatile Object playerName_;
      private byte memoizedIsInitialized;
      private static final S2CR_CrossPKList_4220 DEFAULT_INSTANCE = new S2CR_CrossPKList_4220();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_CrossPKList_4220> PARSER = new AbstractParser<S2CR_CrossPKList_4220>() {
         public S2CR_CrossPKList_4220 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_CrossPKList_4220(input, extensionRegistry);
         }
      };

      private S2CR_CrossPKList_4220(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_CrossPKList_4220() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_CrossPKList_4220();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_CrossPKList_4220(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.power_ = input.readInt64();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.matchPowerMin_ = input.readInt64();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.matchPowerMax_ = input.readInt64();
                        break;
                     case 34:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 8;
                        this.playerName_ = bs;
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_CrossPKList_4220_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_CrossPKList_4220_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_CrossPKList_4220.class, Builder.class);
      }

      public boolean hasPower() {
         return (this.bitField0_ & 1) != 0;
      }

      public long getPower() {
         return this.power_;
      }

      public boolean hasMatchPowerMin() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getMatchPowerMin() {
         return this.matchPowerMin_;
      }

      public boolean hasMatchPowerMax() {
         return (this.bitField0_ & 4) != 0;
      }

      public long getMatchPowerMax() {
         return this.matchPowerMax_;
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

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPower()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMatchPowerMin()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMatchPowerMax()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt64(1, this.power_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(2, this.matchPowerMin_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt64(3, this.matchPowerMax_);
         }

         if ((this.bitField0_ & 8) != 0) {
            GeneratedMessageV3.writeString(output, 4, this.playerName_);
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
               size += CodedOutputStream.computeInt64Size(1, this.power_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(2, this.matchPowerMin_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt64Size(3, this.matchPowerMax_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += GeneratedMessageV3.computeStringSize(4, this.playerName_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_CrossPKList_4220)) {
            return super.equals(obj);
         } else {
            S2CR_CrossPKList_4220 other = (S2CR_CrossPKList_4220)obj;
            if (this.hasPower() != other.hasPower()) {
               return false;
            } else if (this.hasPower() && this.getPower() != other.getPower()) {
               return false;
            } else if (this.hasMatchPowerMin() != other.hasMatchPowerMin()) {
               return false;
            } else if (this.hasMatchPowerMin() && this.getMatchPowerMin() != other.getMatchPowerMin()) {
               return false;
            } else if (this.hasMatchPowerMax() != other.hasMatchPowerMax()) {
               return false;
            } else if (this.hasMatchPowerMax() && this.getMatchPowerMax() != other.getMatchPowerMax()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPower()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashLong(this.getPower());
            }

            if (this.hasMatchPowerMin()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getMatchPowerMin());
            }

            if (this.hasMatchPowerMax()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashLong(this.getMatchPowerMax());
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_CrossPKList_4220 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_CrossPKList_4220)PARSER.parseFrom(data);
      }

      public static S2CR_CrossPKList_4220 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CrossPKList_4220)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CrossPKList_4220 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_CrossPKList_4220)PARSER.parseFrom(data);
      }

      public static S2CR_CrossPKList_4220 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CrossPKList_4220)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CrossPKList_4220 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_CrossPKList_4220)PARSER.parseFrom(data);
      }

      public static S2CR_CrossPKList_4220 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_CrossPKList_4220)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_CrossPKList_4220 parseFrom(InputStream input) throws IOException {
         return (S2CR_CrossPKList_4220)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_CrossPKList_4220 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CrossPKList_4220)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_CrossPKList_4220 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_CrossPKList_4220)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_CrossPKList_4220 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CrossPKList_4220)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_CrossPKList_4220 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_CrossPKList_4220)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_CrossPKList_4220 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_CrossPKList_4220)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_CrossPKList_4220 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_CrossPKList_4220 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_CrossPKList_4220> parser() {
         return PARSER;
      }

      public Parser<S2CR_CrossPKList_4220> getParserForType() {
         return PARSER;
      }

      public S2CR_CrossPKList_4220 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_CrossPKList_4220OrBuilder {
         private int bitField0_;
         private long power_;
         private long matchPowerMin_;
         private long matchPowerMax_;
         private Object playerName_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_CrossPKList_4220_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_CrossPKList_4220_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_CrossPKList_4220.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_CrossPKList_4220.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.power_ = 0L;
            this.bitField0_ &= -2;
            this.matchPowerMin_ = 0L;
            this.bitField0_ &= -3;
            this.matchPowerMax_ = 0L;
            this.bitField0_ &= -5;
            this.playerName_ = "";
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_CrossPKList_4220_descriptor;
         }

         public S2CR_CrossPKList_4220 getDefaultInstanceForType() {
            return CrossMsg.S2CR_CrossPKList_4220.getDefaultInstance();
         }

         public S2CR_CrossPKList_4220 build() {
            S2CR_CrossPKList_4220 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_CrossPKList_4220 buildPartial() {
            S2CR_CrossPKList_4220 result = new S2CR_CrossPKList_4220(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.power_ = this.power_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.matchPowerMin_ = this.matchPowerMin_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.matchPowerMax_ = this.matchPowerMax_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.playerName_ = this.playerName_;
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
            if (other instanceof S2CR_CrossPKList_4220) {
               return this.mergeFrom((S2CR_CrossPKList_4220)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_CrossPKList_4220 other) {
            if (other == CrossMsg.S2CR_CrossPKList_4220.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPower()) {
                  this.setPower(other.getPower());
               }

               if (other.hasMatchPowerMin()) {
                  this.setMatchPowerMin(other.getMatchPowerMin());
               }

               if (other.hasMatchPowerMax()) {
                  this.setMatchPowerMax(other.getMatchPowerMax());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 8;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPower()) {
               return false;
            } else if (!this.hasMatchPowerMin()) {
               return false;
            } else {
               return this.hasMatchPowerMax();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_CrossPKList_4220 parsedMessage = null;

            try {
               parsedMessage = (S2CR_CrossPKList_4220)CrossMsg.S2CR_CrossPKList_4220.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_CrossPKList_4220)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPower() {
            return (this.bitField0_ & 1) != 0;
         }

         public long getPower() {
            return this.power_;
         }

         public Builder setPower(long value) {
            this.bitField0_ |= 1;
            this.power_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearPower() {
            this.bitField0_ &= -2;
            this.power_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasMatchPowerMin() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getMatchPowerMin() {
            return this.matchPowerMin_;
         }

         public Builder setMatchPowerMin(long value) {
            this.bitField0_ |= 2;
            this.matchPowerMin_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMatchPowerMin() {
            this.bitField0_ &= -3;
            this.matchPowerMin_ = 0L;
            this.onChanged();
            return this;
         }

         public boolean hasMatchPowerMax() {
            return (this.bitField0_ & 4) != 0;
         }

         public long getMatchPowerMax() {
            return this.matchPowerMax_;
         }

         public Builder setMatchPowerMax(long value) {
            this.bitField0_ |= 4;
            this.matchPowerMax_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMatchPowerMax() {
            this.bitField0_ &= -5;
            this.matchPowerMax_ = 0L;
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
            this.playerName_ = CrossMsg.S2CR_CrossPKList_4220.getDefaultInstance().getPlayerName();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2S_CrossPK_4221 extends GeneratedMessageV3 implements S2S_CrossPK_4221OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ARRAYINGDATA_FIELD_NUMBER = 1;
      private ByteString arrayingData_;
      public static final int ATKPLAYERINFO_FIELD_NUMBER = 2;
      private CommonMsg.PlayerInfo atkPlayerInfo_;
      private byte memoizedIsInitialized;
      private static final S2S_CrossPK_4221 DEFAULT_INSTANCE = new S2S_CrossPK_4221();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2S_CrossPK_4221> PARSER = new AbstractParser<S2S_CrossPK_4221>() {
         public S2S_CrossPK_4221 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2S_CrossPK_4221(input, extensionRegistry);
         }
      };

      private S2S_CrossPK_4221(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2S_CrossPK_4221() {
         this.memoizedIsInitialized = -1;
         this.arrayingData_ = ByteString.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2S_CrossPK_4221();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2S_CrossPK_4221(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.arrayingData_ = input.readBytes();
                        break;
                     case 18:
                        CommonMsg.PlayerInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.atkPlayerInfo_.toBuilder();
                        }

                        this.atkPlayerInfo_ = (CommonMsg.PlayerInfo)input.readMessage(CommonMsg.PlayerInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.atkPlayerInfo_);
                           this.atkPlayerInfo_ = subBuilder.buildPartial();
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
         return CrossMsg.internal_static_common_S2S_CrossPK_4221_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2S_CrossPK_4221_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_CrossPK_4221.class, Builder.class);
      }

      public boolean hasArrayingData() {
         return (this.bitField0_ & 1) != 0;
      }

      public ByteString getArrayingData() {
         return this.arrayingData_;
      }

      public boolean hasAtkPlayerInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.PlayerInfo getAtkPlayerInfo() {
         return this.atkPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.atkPlayerInfo_;
      }

      public CommonMsg.PlayerInfoOrBuilder getAtkPlayerInfoOrBuilder() {
         return this.atkPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.atkPlayerInfo_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasArrayingData()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAtkPlayerInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getAtkPlayerInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBytes(1, this.arrayingData_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getAtkPlayerInfo());
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
               size += CodedOutputStream.computeBytesSize(1, this.arrayingData_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getAtkPlayerInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2S_CrossPK_4221)) {
            return super.equals(obj);
         } else {
            S2S_CrossPK_4221 other = (S2S_CrossPK_4221)obj;
            if (this.hasArrayingData() != other.hasArrayingData()) {
               return false;
            } else if (this.hasArrayingData() && !this.getArrayingData().equals(other.getArrayingData())) {
               return false;
            } else if (this.hasAtkPlayerInfo() != other.hasAtkPlayerInfo()) {
               return false;
            } else if (this.hasAtkPlayerInfo() && !this.getAtkPlayerInfo().equals(other.getAtkPlayerInfo())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasArrayingData()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getArrayingData().hashCode();
            }

            if (this.hasAtkPlayerInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getAtkPlayerInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2S_CrossPK_4221 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2S_CrossPK_4221)PARSER.parseFrom(data);
      }

      public static S2S_CrossPK_4221 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_CrossPK_4221)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_CrossPK_4221 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2S_CrossPK_4221)PARSER.parseFrom(data);
      }

      public static S2S_CrossPK_4221 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_CrossPK_4221)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_CrossPK_4221 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2S_CrossPK_4221)PARSER.parseFrom(data);
      }

      public static S2S_CrossPK_4221 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2S_CrossPK_4221)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2S_CrossPK_4221 parseFrom(InputStream input) throws IOException {
         return (S2S_CrossPK_4221)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_CrossPK_4221 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_CrossPK_4221)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_CrossPK_4221 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2S_CrossPK_4221)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2S_CrossPK_4221 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_CrossPK_4221)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2S_CrossPK_4221 parseFrom(CodedInputStream input) throws IOException {
         return (S2S_CrossPK_4221)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2S_CrossPK_4221 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2S_CrossPK_4221)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2S_CrossPK_4221 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2S_CrossPK_4221 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2S_CrossPK_4221> parser() {
         return PARSER;
      }

      public Parser<S2S_CrossPK_4221> getParserForType() {
         return PARSER;
      }

      public S2S_CrossPK_4221 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2S_CrossPK_4221OrBuilder {
         private int bitField0_;
         private ByteString arrayingData_;
         private CommonMsg.PlayerInfo atkPlayerInfo_;
         private SingleFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> atkPlayerInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2S_CrossPK_4221_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2S_CrossPK_4221_fieldAccessorTable.ensureFieldAccessorsInitialized(S2S_CrossPK_4221.class, Builder.class);
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
            if (CrossMsg.S2S_CrossPK_4221.alwaysUseFieldBuilders) {
               this.getAtkPlayerInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.arrayingData_ = ByteString.EMPTY;
            this.bitField0_ &= -2;
            if (this.atkPlayerInfoBuilder_ == null) {
               this.atkPlayerInfo_ = null;
            } else {
               this.atkPlayerInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2S_CrossPK_4221_descriptor;
         }

         public S2S_CrossPK_4221 getDefaultInstanceForType() {
            return CrossMsg.S2S_CrossPK_4221.getDefaultInstance();
         }

         public S2S_CrossPK_4221 build() {
            S2S_CrossPK_4221 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2S_CrossPK_4221 buildPartial() {
            S2S_CrossPK_4221 result = new S2S_CrossPK_4221(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.arrayingData_ = this.arrayingData_;
            if ((from_bitField0_ & 2) != 0) {
               if (this.atkPlayerInfoBuilder_ == null) {
                  result.atkPlayerInfo_ = this.atkPlayerInfo_;
               } else {
                  result.atkPlayerInfo_ = (CommonMsg.PlayerInfo)this.atkPlayerInfoBuilder_.build();
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
            if (other instanceof S2S_CrossPK_4221) {
               return this.mergeFrom((S2S_CrossPK_4221)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2S_CrossPK_4221 other) {
            if (other == CrossMsg.S2S_CrossPK_4221.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasArrayingData()) {
                  this.setArrayingData(other.getArrayingData());
               }

               if (other.hasAtkPlayerInfo()) {
                  this.mergeAtkPlayerInfo(other.getAtkPlayerInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasArrayingData()) {
               return false;
            } else if (!this.hasAtkPlayerInfo()) {
               return false;
            } else {
               return this.getAtkPlayerInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2S_CrossPK_4221 parsedMessage = null;

            try {
               parsedMessage = (S2S_CrossPK_4221)CrossMsg.S2S_CrossPK_4221.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2S_CrossPK_4221)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasArrayingData() {
            return (this.bitField0_ & 1) != 0;
         }

         public ByteString getArrayingData() {
            return this.arrayingData_;
         }

         public Builder setArrayingData(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.arrayingData_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearArrayingData() {
            this.bitField0_ &= -2;
            this.arrayingData_ = CrossMsg.S2S_CrossPK_4221.getDefaultInstance().getArrayingData();
            this.onChanged();
            return this;
         }

         public boolean hasAtkPlayerInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.PlayerInfo getAtkPlayerInfo() {
            if (this.atkPlayerInfoBuilder_ == null) {
               return this.atkPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.atkPlayerInfo_;
            } else {
               return (CommonMsg.PlayerInfo)this.atkPlayerInfoBuilder_.getMessage();
            }
         }

         public Builder setAtkPlayerInfo(CommonMsg.PlayerInfo value) {
            if (this.atkPlayerInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.atkPlayerInfo_ = value;
               this.onChanged();
            } else {
               this.atkPlayerInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setAtkPlayerInfo(CommonMsg.PlayerInfo.Builder builderForValue) {
            if (this.atkPlayerInfoBuilder_ == null) {
               this.atkPlayerInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.atkPlayerInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergeAtkPlayerInfo(CommonMsg.PlayerInfo value) {
            if (this.atkPlayerInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.atkPlayerInfo_ != null && this.atkPlayerInfo_ != CommonMsg.PlayerInfo.getDefaultInstance()) {
                  this.atkPlayerInfo_ = CommonMsg.PlayerInfo.newBuilder(this.atkPlayerInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.atkPlayerInfo_ = value;
               }

               this.onChanged();
            } else {
               this.atkPlayerInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearAtkPlayerInfo() {
            if (this.atkPlayerInfoBuilder_ == null) {
               this.atkPlayerInfo_ = null;
               this.onChanged();
            } else {
               this.atkPlayerInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.PlayerInfo.Builder getAtkPlayerInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.PlayerInfo.Builder)this.getAtkPlayerInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.PlayerInfoOrBuilder getAtkPlayerInfoOrBuilder() {
            if (this.atkPlayerInfoBuilder_ != null) {
               return (CommonMsg.PlayerInfoOrBuilder)this.atkPlayerInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.atkPlayerInfo_ == null ? CommonMsg.PlayerInfo.getDefaultInstance() : this.atkPlayerInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.PlayerInfo, CommonMsg.PlayerInfo.Builder, CommonMsg.PlayerInfoOrBuilder> getAtkPlayerInfoFieldBuilder() {
            if (this.atkPlayerInfoBuilder_ == null) {
               this.atkPlayerInfoBuilder_ = new SingleFieldBuilderV3(this.getAtkPlayerInfo(), this.getParentForChildren(), this.isClean());
               this.atkPlayerInfo_ = null;
            }

            return this.atkPlayerInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2CR_UploadKoiRecord_4222 extends GeneratedMessageV3 implements S2CR_UploadKoiRecord_4222OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERNAME_FIELD_NUMBER = 1;
      private volatile Object playerName_;
      public static final int LABEL_FIELD_NUMBER = 2;
      private int label_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadKoiRecord_4222 DEFAULT_INSTANCE = new S2CR_UploadKoiRecord_4222();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadKoiRecord_4222> PARSER = new AbstractParser<S2CR_UploadKoiRecord_4222>() {
         public S2CR_UploadKoiRecord_4222 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadKoiRecord_4222(input, extensionRegistry);
         }
      };

      private S2CR_UploadKoiRecord_4222(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadKoiRecord_4222() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadKoiRecord_4222();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadKoiRecord_4222(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.playerName_ = bs;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.label_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_UploadKoiRecord_4222_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_UploadKoiRecord_4222_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadKoiRecord_4222.class, Builder.class);
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 1) != 0;
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

      public boolean hasLabel() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLabel() {
         return this.label_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLabel()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.playerName_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.label_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.playerName_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.label_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadKoiRecord_4222)) {
            return super.equals(obj);
         } else {
            S2CR_UploadKoiRecord_4222 other = (S2CR_UploadKoiRecord_4222)obj;
            if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasLabel() != other.hasLabel()) {
               return false;
            } else if (this.hasLabel() && this.getLabel() != other.getLabel()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPlayerName()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasLabel()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLabel();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadKoiRecord_4222 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadKoiRecord_4222)PARSER.parseFrom(data);
      }

      public static S2CR_UploadKoiRecord_4222 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadKoiRecord_4222)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadKoiRecord_4222 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadKoiRecord_4222)PARSER.parseFrom(data);
      }

      public static S2CR_UploadKoiRecord_4222 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadKoiRecord_4222)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadKoiRecord_4222 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadKoiRecord_4222)PARSER.parseFrom(data);
      }

      public static S2CR_UploadKoiRecord_4222 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadKoiRecord_4222)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadKoiRecord_4222 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadKoiRecord_4222)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadKoiRecord_4222 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadKoiRecord_4222)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadKoiRecord_4222 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadKoiRecord_4222)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadKoiRecord_4222 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadKoiRecord_4222)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadKoiRecord_4222 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadKoiRecord_4222)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadKoiRecord_4222 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadKoiRecord_4222)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadKoiRecord_4222 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadKoiRecord_4222 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadKoiRecord_4222> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadKoiRecord_4222> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadKoiRecord_4222 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadKoiRecord_4222OrBuilder {
         private int bitField0_;
         private Object playerName_;
         private int label_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_UploadKoiRecord_4222_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_UploadKoiRecord_4222_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadKoiRecord_4222.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_UploadKoiRecord_4222.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerName_ = "";
            this.bitField0_ &= -2;
            this.label_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_UploadKoiRecord_4222_descriptor;
         }

         public S2CR_UploadKoiRecord_4222 getDefaultInstanceForType() {
            return CrossMsg.S2CR_UploadKoiRecord_4222.getDefaultInstance();
         }

         public S2CR_UploadKoiRecord_4222 build() {
            S2CR_UploadKoiRecord_4222 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadKoiRecord_4222 buildPartial() {
            S2CR_UploadKoiRecord_4222 result = new S2CR_UploadKoiRecord_4222(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 2) != 0) {
               result.label_ = this.label_;
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
            if (other instanceof S2CR_UploadKoiRecord_4222) {
               return this.mergeFrom((S2CR_UploadKoiRecord_4222)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadKoiRecord_4222 other) {
            if (other == CrossMsg.S2CR_UploadKoiRecord_4222.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerName()) {
                  this.bitField0_ |= 1;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasLabel()) {
                  this.setLabel(other.getLabel());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerName()) {
               return false;
            } else {
               return this.hasLabel();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadKoiRecord_4222 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadKoiRecord_4222)CrossMsg.S2CR_UploadKoiRecord_4222.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadKoiRecord_4222)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 1) != 0;
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
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -2;
            this.playerName_ = CrossMsg.S2CR_UploadKoiRecord_4222.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasLabel() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLabel() {
            return this.label_;
         }

         public Builder setLabel(int value) {
            this.bitField0_ |= 2;
            this.label_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLabel() {
            this.bitField0_ &= -3;
            this.label_ = 0;
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

   public static final class S2CR_UploadLaborDayRecord_4223 extends GeneratedMessageV3 implements S2CR_UploadLaborDayRecord_4223OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERNAME_FIELD_NUMBER = 1;
      private volatile Object playerName_;
      public static final int BELOVEDITEMID_FIELD_NUMBER = 2;
      private int belovedItemId_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadLaborDayRecord_4223 DEFAULT_INSTANCE = new S2CR_UploadLaborDayRecord_4223();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadLaborDayRecord_4223> PARSER = new AbstractParser<S2CR_UploadLaborDayRecord_4223>() {
         public S2CR_UploadLaborDayRecord_4223 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadLaborDayRecord_4223(input, extensionRegistry);
         }
      };

      private S2CR_UploadLaborDayRecord_4223(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadLaborDayRecord_4223() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadLaborDayRecord_4223();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadLaborDayRecord_4223(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.playerName_ = bs;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.belovedItemId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_UploadLaborDayRecord_4223_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_UploadLaborDayRecord_4223_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadLaborDayRecord_4223.class, Builder.class);
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 1) != 0;
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

      public boolean hasBelovedItemId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBelovedItemId() {
         return this.belovedItemId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBelovedItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.playerName_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.belovedItemId_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.playerName_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.belovedItemId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadLaborDayRecord_4223)) {
            return super.equals(obj);
         } else {
            S2CR_UploadLaborDayRecord_4223 other = (S2CR_UploadLaborDayRecord_4223)obj;
            if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasBelovedItemId() != other.hasBelovedItemId()) {
               return false;
            } else if (this.hasBelovedItemId() && this.getBelovedItemId() != other.getBelovedItemId()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPlayerName()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasBelovedItemId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBelovedItemId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadLaborDayRecord_4223 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadLaborDayRecord_4223)PARSER.parseFrom(data);
      }

      public static S2CR_UploadLaborDayRecord_4223 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadLaborDayRecord_4223)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadLaborDayRecord_4223 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadLaborDayRecord_4223)PARSER.parseFrom(data);
      }

      public static S2CR_UploadLaborDayRecord_4223 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadLaborDayRecord_4223)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadLaborDayRecord_4223 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadLaborDayRecord_4223)PARSER.parseFrom(data);
      }

      public static S2CR_UploadLaborDayRecord_4223 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadLaborDayRecord_4223)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadLaborDayRecord_4223 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadLaborDayRecord_4223)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadLaborDayRecord_4223 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadLaborDayRecord_4223)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadLaborDayRecord_4223 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadLaborDayRecord_4223)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadLaborDayRecord_4223 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadLaborDayRecord_4223)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadLaborDayRecord_4223 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadLaborDayRecord_4223)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadLaborDayRecord_4223 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadLaborDayRecord_4223)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadLaborDayRecord_4223 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadLaborDayRecord_4223 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadLaborDayRecord_4223> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadLaborDayRecord_4223> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadLaborDayRecord_4223 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadLaborDayRecord_4223OrBuilder {
         private int bitField0_;
         private Object playerName_;
         private int belovedItemId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_UploadLaborDayRecord_4223_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_UploadLaborDayRecord_4223_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadLaborDayRecord_4223.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_UploadLaborDayRecord_4223.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerName_ = "";
            this.bitField0_ &= -2;
            this.belovedItemId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_UploadLaborDayRecord_4223_descriptor;
         }

         public S2CR_UploadLaborDayRecord_4223 getDefaultInstanceForType() {
            return CrossMsg.S2CR_UploadLaborDayRecord_4223.getDefaultInstance();
         }

         public S2CR_UploadLaborDayRecord_4223 build() {
            S2CR_UploadLaborDayRecord_4223 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadLaborDayRecord_4223 buildPartial() {
            S2CR_UploadLaborDayRecord_4223 result = new S2CR_UploadLaborDayRecord_4223(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 2) != 0) {
               result.belovedItemId_ = this.belovedItemId_;
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
            if (other instanceof S2CR_UploadLaborDayRecord_4223) {
               return this.mergeFrom((S2CR_UploadLaborDayRecord_4223)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadLaborDayRecord_4223 other) {
            if (other == CrossMsg.S2CR_UploadLaborDayRecord_4223.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerName()) {
                  this.bitField0_ |= 1;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasBelovedItemId()) {
                  this.setBelovedItemId(other.getBelovedItemId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerName()) {
               return false;
            } else {
               return this.hasBelovedItemId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadLaborDayRecord_4223 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadLaborDayRecord_4223)CrossMsg.S2CR_UploadLaborDayRecord_4223.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadLaborDayRecord_4223)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 1) != 0;
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
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -2;
            this.playerName_ = CrossMsg.S2CR_UploadLaborDayRecord_4223.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasBelovedItemId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBelovedItemId() {
            return this.belovedItemId_;
         }

         public Builder setBelovedItemId(int value) {
            this.bitField0_ |= 2;
            this.belovedItemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBelovedItemId() {
            this.bitField0_ &= -3;
            this.belovedItemId_ = 0;
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

   public static final class S2CR_UploadWishStarRecord_4224 extends GeneratedMessageV3 implements S2CR_UploadWishStarRecord_4224OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERNAME_FIELD_NUMBER = 1;
      private volatile Object playerName_;
      public static final int BELOVEDITEMID_FIELD_NUMBER = 2;
      private int belovedItemId_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadWishStarRecord_4224 DEFAULT_INSTANCE = new S2CR_UploadWishStarRecord_4224();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadWishStarRecord_4224> PARSER = new AbstractParser<S2CR_UploadWishStarRecord_4224>() {
         public S2CR_UploadWishStarRecord_4224 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadWishStarRecord_4224(input, extensionRegistry);
         }
      };

      private S2CR_UploadWishStarRecord_4224(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadWishStarRecord_4224() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadWishStarRecord_4224();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadWishStarRecord_4224(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.playerName_ = bs;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.belovedItemId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_UploadWishStarRecord_4224_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_UploadWishStarRecord_4224_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadWishStarRecord_4224.class, Builder.class);
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 1) != 0;
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

      public boolean hasBelovedItemId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBelovedItemId() {
         return this.belovedItemId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBelovedItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.playerName_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.belovedItemId_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.playerName_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.belovedItemId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadWishStarRecord_4224)) {
            return super.equals(obj);
         } else {
            S2CR_UploadWishStarRecord_4224 other = (S2CR_UploadWishStarRecord_4224)obj;
            if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasBelovedItemId() != other.hasBelovedItemId()) {
               return false;
            } else if (this.hasBelovedItemId() && this.getBelovedItemId() != other.getBelovedItemId()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPlayerName()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasBelovedItemId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBelovedItemId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadWishStarRecord_4224 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadWishStarRecord_4224)PARSER.parseFrom(data);
      }

      public static S2CR_UploadWishStarRecord_4224 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadWishStarRecord_4224)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadWishStarRecord_4224 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadWishStarRecord_4224)PARSER.parseFrom(data);
      }

      public static S2CR_UploadWishStarRecord_4224 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadWishStarRecord_4224)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadWishStarRecord_4224 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadWishStarRecord_4224)PARSER.parseFrom(data);
      }

      public static S2CR_UploadWishStarRecord_4224 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadWishStarRecord_4224)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadWishStarRecord_4224 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadWishStarRecord_4224)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadWishStarRecord_4224 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadWishStarRecord_4224)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadWishStarRecord_4224 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadWishStarRecord_4224)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadWishStarRecord_4224 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadWishStarRecord_4224)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadWishStarRecord_4224 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadWishStarRecord_4224)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadWishStarRecord_4224 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadWishStarRecord_4224)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadWishStarRecord_4224 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadWishStarRecord_4224 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadWishStarRecord_4224> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadWishStarRecord_4224> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadWishStarRecord_4224 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadWishStarRecord_4224OrBuilder {
         private int bitField0_;
         private Object playerName_;
         private int belovedItemId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_UploadWishStarRecord_4224_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_UploadWishStarRecord_4224_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadWishStarRecord_4224.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_UploadWishStarRecord_4224.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerName_ = "";
            this.bitField0_ &= -2;
            this.belovedItemId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_UploadWishStarRecord_4224_descriptor;
         }

         public S2CR_UploadWishStarRecord_4224 getDefaultInstanceForType() {
            return CrossMsg.S2CR_UploadWishStarRecord_4224.getDefaultInstance();
         }

         public S2CR_UploadWishStarRecord_4224 build() {
            S2CR_UploadWishStarRecord_4224 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadWishStarRecord_4224 buildPartial() {
            S2CR_UploadWishStarRecord_4224 result = new S2CR_UploadWishStarRecord_4224(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 2) != 0) {
               result.belovedItemId_ = this.belovedItemId_;
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
            if (other instanceof S2CR_UploadWishStarRecord_4224) {
               return this.mergeFrom((S2CR_UploadWishStarRecord_4224)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadWishStarRecord_4224 other) {
            if (other == CrossMsg.S2CR_UploadWishStarRecord_4224.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerName()) {
                  this.bitField0_ |= 1;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasBelovedItemId()) {
                  this.setBelovedItemId(other.getBelovedItemId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerName()) {
               return false;
            } else {
               return this.hasBelovedItemId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadWishStarRecord_4224 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadWishStarRecord_4224)CrossMsg.S2CR_UploadWishStarRecord_4224.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadWishStarRecord_4224)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 1) != 0;
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
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -2;
            this.playerName_ = CrossMsg.S2CR_UploadWishStarRecord_4224.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasBelovedItemId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBelovedItemId() {
            return this.belovedItemId_;
         }

         public Builder setBelovedItemId(int value) {
            this.bitField0_ |= 2;
            this.belovedItemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBelovedItemId() {
            this.bitField0_ &= -3;
            this.belovedItemId_ = 0;
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

   public static final class S2CR_UploadZongQingRecord_4225 extends GeneratedMessageV3 implements S2CR_UploadZongQingRecord_4225OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERNAME_FIELD_NUMBER = 1;
      private volatile Object playerName_;
      public static final int BELOVEDITEMID_FIELD_NUMBER = 2;
      private int belovedItemId_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadZongQingRecord_4225 DEFAULT_INSTANCE = new S2CR_UploadZongQingRecord_4225();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadZongQingRecord_4225> PARSER = new AbstractParser<S2CR_UploadZongQingRecord_4225>() {
         public S2CR_UploadZongQingRecord_4225 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadZongQingRecord_4225(input, extensionRegistry);
         }
      };

      private S2CR_UploadZongQingRecord_4225(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadZongQingRecord_4225() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadZongQingRecord_4225();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadZongQingRecord_4225(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.playerName_ = bs;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.belovedItemId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_UploadZongQingRecord_4225_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_UploadZongQingRecord_4225_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadZongQingRecord_4225.class, Builder.class);
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 1) != 0;
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

      public boolean hasBelovedItemId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBelovedItemId() {
         return this.belovedItemId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBelovedItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.playerName_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.belovedItemId_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.playerName_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.belovedItemId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadZongQingRecord_4225)) {
            return super.equals(obj);
         } else {
            S2CR_UploadZongQingRecord_4225 other = (S2CR_UploadZongQingRecord_4225)obj;
            if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasBelovedItemId() != other.hasBelovedItemId()) {
               return false;
            } else if (this.hasBelovedItemId() && this.getBelovedItemId() != other.getBelovedItemId()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPlayerName()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasBelovedItemId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBelovedItemId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadZongQingRecord_4225 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadZongQingRecord_4225)PARSER.parseFrom(data);
      }

      public static S2CR_UploadZongQingRecord_4225 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadZongQingRecord_4225)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadZongQingRecord_4225 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadZongQingRecord_4225)PARSER.parseFrom(data);
      }

      public static S2CR_UploadZongQingRecord_4225 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadZongQingRecord_4225)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadZongQingRecord_4225 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadZongQingRecord_4225)PARSER.parseFrom(data);
      }

      public static S2CR_UploadZongQingRecord_4225 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadZongQingRecord_4225)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadZongQingRecord_4225 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadZongQingRecord_4225)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadZongQingRecord_4225 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadZongQingRecord_4225)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadZongQingRecord_4225 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadZongQingRecord_4225)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadZongQingRecord_4225 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadZongQingRecord_4225)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadZongQingRecord_4225 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadZongQingRecord_4225)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadZongQingRecord_4225 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadZongQingRecord_4225)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadZongQingRecord_4225 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadZongQingRecord_4225 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadZongQingRecord_4225> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadZongQingRecord_4225> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadZongQingRecord_4225 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadZongQingRecord_4225OrBuilder {
         private int bitField0_;
         private Object playerName_;
         private int belovedItemId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_UploadZongQingRecord_4225_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_UploadZongQingRecord_4225_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadZongQingRecord_4225.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_UploadZongQingRecord_4225.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerName_ = "";
            this.bitField0_ &= -2;
            this.belovedItemId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_UploadZongQingRecord_4225_descriptor;
         }

         public S2CR_UploadZongQingRecord_4225 getDefaultInstanceForType() {
            return CrossMsg.S2CR_UploadZongQingRecord_4225.getDefaultInstance();
         }

         public S2CR_UploadZongQingRecord_4225 build() {
            S2CR_UploadZongQingRecord_4225 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadZongQingRecord_4225 buildPartial() {
            S2CR_UploadZongQingRecord_4225 result = new S2CR_UploadZongQingRecord_4225(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 2) != 0) {
               result.belovedItemId_ = this.belovedItemId_;
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
            if (other instanceof S2CR_UploadZongQingRecord_4225) {
               return this.mergeFrom((S2CR_UploadZongQingRecord_4225)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadZongQingRecord_4225 other) {
            if (other == CrossMsg.S2CR_UploadZongQingRecord_4225.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerName()) {
                  this.bitField0_ |= 1;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasBelovedItemId()) {
                  this.setBelovedItemId(other.getBelovedItemId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerName()) {
               return false;
            } else {
               return this.hasBelovedItemId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadZongQingRecord_4225 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadZongQingRecord_4225)CrossMsg.S2CR_UploadZongQingRecord_4225.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadZongQingRecord_4225)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 1) != 0;
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
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -2;
            this.playerName_ = CrossMsg.S2CR_UploadZongQingRecord_4225.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasBelovedItemId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBelovedItemId() {
            return this.belovedItemId_;
         }

         public Builder setBelovedItemId(int value) {
            this.bitField0_ |= 2;
            this.belovedItemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBelovedItemId() {
            this.bitField0_ &= -3;
            this.belovedItemId_ = 0;
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

   public static final class S2CR_UploadFlowerFireRecord_4226 extends GeneratedMessageV3 implements S2CR_UploadFlowerFireRecord_4226OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERNAME_FIELD_NUMBER = 1;
      private volatile Object playerName_;
      public static final int BELOVEDITEMID_FIELD_NUMBER = 2;
      private int belovedItemId_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadFlowerFireRecord_4226 DEFAULT_INSTANCE = new S2CR_UploadFlowerFireRecord_4226();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadFlowerFireRecord_4226> PARSER = new AbstractParser<S2CR_UploadFlowerFireRecord_4226>() {
         public S2CR_UploadFlowerFireRecord_4226 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadFlowerFireRecord_4226(input, extensionRegistry);
         }
      };

      private S2CR_UploadFlowerFireRecord_4226(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadFlowerFireRecord_4226() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadFlowerFireRecord_4226();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadFlowerFireRecord_4226(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.playerName_ = bs;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.belovedItemId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_UploadFlowerFireRecord_4226_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_UploadFlowerFireRecord_4226_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadFlowerFireRecord_4226.class, Builder.class);
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 1) != 0;
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

      public boolean hasBelovedItemId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBelovedItemId() {
         return this.belovedItemId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBelovedItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.playerName_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.belovedItemId_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.playerName_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.belovedItemId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadFlowerFireRecord_4226)) {
            return super.equals(obj);
         } else {
            S2CR_UploadFlowerFireRecord_4226 other = (S2CR_UploadFlowerFireRecord_4226)obj;
            if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasBelovedItemId() != other.hasBelovedItemId()) {
               return false;
            } else if (this.hasBelovedItemId() && this.getBelovedItemId() != other.getBelovedItemId()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPlayerName()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasBelovedItemId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBelovedItemId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadFlowerFireRecord_4226 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadFlowerFireRecord_4226)PARSER.parseFrom(data);
      }

      public static S2CR_UploadFlowerFireRecord_4226 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadFlowerFireRecord_4226)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadFlowerFireRecord_4226 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadFlowerFireRecord_4226)PARSER.parseFrom(data);
      }

      public static S2CR_UploadFlowerFireRecord_4226 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadFlowerFireRecord_4226)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadFlowerFireRecord_4226 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadFlowerFireRecord_4226)PARSER.parseFrom(data);
      }

      public static S2CR_UploadFlowerFireRecord_4226 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadFlowerFireRecord_4226)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadFlowerFireRecord_4226 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadFlowerFireRecord_4226)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadFlowerFireRecord_4226 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadFlowerFireRecord_4226)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadFlowerFireRecord_4226 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadFlowerFireRecord_4226)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadFlowerFireRecord_4226 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadFlowerFireRecord_4226)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadFlowerFireRecord_4226 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadFlowerFireRecord_4226)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadFlowerFireRecord_4226 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadFlowerFireRecord_4226)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadFlowerFireRecord_4226 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadFlowerFireRecord_4226 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadFlowerFireRecord_4226> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadFlowerFireRecord_4226> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadFlowerFireRecord_4226 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadFlowerFireRecord_4226OrBuilder {
         private int bitField0_;
         private Object playerName_;
         private int belovedItemId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_UploadFlowerFireRecord_4226_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_UploadFlowerFireRecord_4226_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadFlowerFireRecord_4226.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_UploadFlowerFireRecord_4226.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerName_ = "";
            this.bitField0_ &= -2;
            this.belovedItemId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_UploadFlowerFireRecord_4226_descriptor;
         }

         public S2CR_UploadFlowerFireRecord_4226 getDefaultInstanceForType() {
            return CrossMsg.S2CR_UploadFlowerFireRecord_4226.getDefaultInstance();
         }

         public S2CR_UploadFlowerFireRecord_4226 build() {
            S2CR_UploadFlowerFireRecord_4226 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadFlowerFireRecord_4226 buildPartial() {
            S2CR_UploadFlowerFireRecord_4226 result = new S2CR_UploadFlowerFireRecord_4226(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 2) != 0) {
               result.belovedItemId_ = this.belovedItemId_;
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
            if (other instanceof S2CR_UploadFlowerFireRecord_4226) {
               return this.mergeFrom((S2CR_UploadFlowerFireRecord_4226)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadFlowerFireRecord_4226 other) {
            if (other == CrossMsg.S2CR_UploadFlowerFireRecord_4226.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerName()) {
                  this.bitField0_ |= 1;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasBelovedItemId()) {
                  this.setBelovedItemId(other.getBelovedItemId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerName()) {
               return false;
            } else {
               return this.hasBelovedItemId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadFlowerFireRecord_4226 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadFlowerFireRecord_4226)CrossMsg.S2CR_UploadFlowerFireRecord_4226.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadFlowerFireRecord_4226)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 1) != 0;
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
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -2;
            this.playerName_ = CrossMsg.S2CR_UploadFlowerFireRecord_4226.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasBelovedItemId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBelovedItemId() {
            return this.belovedItemId_;
         }

         public Builder setBelovedItemId(int value) {
            this.bitField0_ |= 2;
            this.belovedItemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBelovedItemId() {
            this.bitField0_ &= -3;
            this.belovedItemId_ = 0;
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

   public static final class S2CR_UploadSwimParkRecord_4227 extends GeneratedMessageV3 implements S2CR_UploadSwimParkRecord_4227OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERNAME_FIELD_NUMBER = 1;
      private volatile Object playerName_;
      public static final int BELOVEDITEMID_FIELD_NUMBER = 2;
      private int belovedItemId_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadSwimParkRecord_4227 DEFAULT_INSTANCE = new S2CR_UploadSwimParkRecord_4227();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadSwimParkRecord_4227> PARSER = new AbstractParser<S2CR_UploadSwimParkRecord_4227>() {
         public S2CR_UploadSwimParkRecord_4227 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadSwimParkRecord_4227(input, extensionRegistry);
         }
      };

      private S2CR_UploadSwimParkRecord_4227(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadSwimParkRecord_4227() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadSwimParkRecord_4227();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadSwimParkRecord_4227(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.playerName_ = bs;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.belovedItemId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_UploadSwimParkRecord_4227_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_UploadSwimParkRecord_4227_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadSwimParkRecord_4227.class, Builder.class);
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 1) != 0;
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

      public boolean hasBelovedItemId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBelovedItemId() {
         return this.belovedItemId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBelovedItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.playerName_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.belovedItemId_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.playerName_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.belovedItemId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadSwimParkRecord_4227)) {
            return super.equals(obj);
         } else {
            S2CR_UploadSwimParkRecord_4227 other = (S2CR_UploadSwimParkRecord_4227)obj;
            if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasBelovedItemId() != other.hasBelovedItemId()) {
               return false;
            } else if (this.hasBelovedItemId() && this.getBelovedItemId() != other.getBelovedItemId()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPlayerName()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasBelovedItemId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBelovedItemId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadSwimParkRecord_4227 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadSwimParkRecord_4227)PARSER.parseFrom(data);
      }

      public static S2CR_UploadSwimParkRecord_4227 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadSwimParkRecord_4227)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadSwimParkRecord_4227 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadSwimParkRecord_4227)PARSER.parseFrom(data);
      }

      public static S2CR_UploadSwimParkRecord_4227 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadSwimParkRecord_4227)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadSwimParkRecord_4227 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadSwimParkRecord_4227)PARSER.parseFrom(data);
      }

      public static S2CR_UploadSwimParkRecord_4227 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadSwimParkRecord_4227)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadSwimParkRecord_4227 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadSwimParkRecord_4227)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadSwimParkRecord_4227 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadSwimParkRecord_4227)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadSwimParkRecord_4227 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadSwimParkRecord_4227)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadSwimParkRecord_4227 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadSwimParkRecord_4227)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadSwimParkRecord_4227 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadSwimParkRecord_4227)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadSwimParkRecord_4227 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadSwimParkRecord_4227)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadSwimParkRecord_4227 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadSwimParkRecord_4227 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadSwimParkRecord_4227> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadSwimParkRecord_4227> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadSwimParkRecord_4227 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadSwimParkRecord_4227OrBuilder {
         private int bitField0_;
         private Object playerName_;
         private int belovedItemId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_UploadSwimParkRecord_4227_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_UploadSwimParkRecord_4227_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadSwimParkRecord_4227.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_UploadSwimParkRecord_4227.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerName_ = "";
            this.bitField0_ &= -2;
            this.belovedItemId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_UploadSwimParkRecord_4227_descriptor;
         }

         public S2CR_UploadSwimParkRecord_4227 getDefaultInstanceForType() {
            return CrossMsg.S2CR_UploadSwimParkRecord_4227.getDefaultInstance();
         }

         public S2CR_UploadSwimParkRecord_4227 build() {
            S2CR_UploadSwimParkRecord_4227 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadSwimParkRecord_4227 buildPartial() {
            S2CR_UploadSwimParkRecord_4227 result = new S2CR_UploadSwimParkRecord_4227(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 2) != 0) {
               result.belovedItemId_ = this.belovedItemId_;
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
            if (other instanceof S2CR_UploadSwimParkRecord_4227) {
               return this.mergeFrom((S2CR_UploadSwimParkRecord_4227)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadSwimParkRecord_4227 other) {
            if (other == CrossMsg.S2CR_UploadSwimParkRecord_4227.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerName()) {
                  this.bitField0_ |= 1;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasBelovedItemId()) {
                  this.setBelovedItemId(other.getBelovedItemId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerName()) {
               return false;
            } else {
               return this.hasBelovedItemId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadSwimParkRecord_4227 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadSwimParkRecord_4227)CrossMsg.S2CR_UploadSwimParkRecord_4227.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadSwimParkRecord_4227)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 1) != 0;
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
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -2;
            this.playerName_ = CrossMsg.S2CR_UploadSwimParkRecord_4227.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasBelovedItemId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBelovedItemId() {
            return this.belovedItemId_;
         }

         public Builder setBelovedItemId(int value) {
            this.bitField0_ |= 2;
            this.belovedItemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBelovedItemId() {
            this.bitField0_ &= -3;
            this.belovedItemId_ = 0;
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

   public static final class S2CR_UploadQiXiRecord_4228 extends GeneratedMessageV3 implements S2CR_UploadQiXiRecord_4228OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERNAME_FIELD_NUMBER = 1;
      private volatile Object playerName_;
      public static final int BELOVEDITEMID_FIELD_NUMBER = 2;
      private int belovedItemId_;
      public static final int STAGE_FIELD_NUMBER = 3;
      private int stage_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadQiXiRecord_4228 DEFAULT_INSTANCE = new S2CR_UploadQiXiRecord_4228();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadQiXiRecord_4228> PARSER = new AbstractParser<S2CR_UploadQiXiRecord_4228>() {
         public S2CR_UploadQiXiRecord_4228 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadQiXiRecord_4228(input, extensionRegistry);
         }
      };

      private S2CR_UploadQiXiRecord_4228(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadQiXiRecord_4228() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadQiXiRecord_4228();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadQiXiRecord_4228(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.playerName_ = bs;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.belovedItemId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.stage_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_UploadQiXiRecord_4228_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_UploadQiXiRecord_4228_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadQiXiRecord_4228.class, Builder.class);
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 1) != 0;
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

      public boolean hasBelovedItemId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBelovedItemId() {
         return this.belovedItemId_;
      }

      public boolean hasStage() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBelovedItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.playerName_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.belovedItemId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.stage_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.playerName_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.belovedItemId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.stage_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadQiXiRecord_4228)) {
            return super.equals(obj);
         } else {
            S2CR_UploadQiXiRecord_4228 other = (S2CR_UploadQiXiRecord_4228)obj;
            if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasBelovedItemId() != other.hasBelovedItemId()) {
               return false;
            } else if (this.hasBelovedItemId() && this.getBelovedItemId() != other.getBelovedItemId()) {
               return false;
            } else if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPlayerName()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasBelovedItemId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBelovedItemId();
            }

            if (this.hasStage()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getStage();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadQiXiRecord_4228 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadQiXiRecord_4228)PARSER.parseFrom(data);
      }

      public static S2CR_UploadQiXiRecord_4228 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadQiXiRecord_4228)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadQiXiRecord_4228 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadQiXiRecord_4228)PARSER.parseFrom(data);
      }

      public static S2CR_UploadQiXiRecord_4228 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadQiXiRecord_4228)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadQiXiRecord_4228 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadQiXiRecord_4228)PARSER.parseFrom(data);
      }

      public static S2CR_UploadQiXiRecord_4228 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadQiXiRecord_4228)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadQiXiRecord_4228 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadQiXiRecord_4228)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadQiXiRecord_4228 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadQiXiRecord_4228)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadQiXiRecord_4228 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadQiXiRecord_4228)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadQiXiRecord_4228 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadQiXiRecord_4228)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadQiXiRecord_4228 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadQiXiRecord_4228)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadQiXiRecord_4228 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadQiXiRecord_4228)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadQiXiRecord_4228 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadQiXiRecord_4228 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadQiXiRecord_4228> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadQiXiRecord_4228> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadQiXiRecord_4228 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadQiXiRecord_4228OrBuilder {
         private int bitField0_;
         private Object playerName_;
         private int belovedItemId_;
         private int stage_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_UploadQiXiRecord_4228_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_UploadQiXiRecord_4228_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadQiXiRecord_4228.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_UploadQiXiRecord_4228.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerName_ = "";
            this.bitField0_ &= -2;
            this.belovedItemId_ = 0;
            this.bitField0_ &= -3;
            this.stage_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_UploadQiXiRecord_4228_descriptor;
         }

         public S2CR_UploadQiXiRecord_4228 getDefaultInstanceForType() {
            return CrossMsg.S2CR_UploadQiXiRecord_4228.getDefaultInstance();
         }

         public S2CR_UploadQiXiRecord_4228 build() {
            S2CR_UploadQiXiRecord_4228 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadQiXiRecord_4228 buildPartial() {
            S2CR_UploadQiXiRecord_4228 result = new S2CR_UploadQiXiRecord_4228(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 2) != 0) {
               result.belovedItemId_ = this.belovedItemId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.stage_ = this.stage_;
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
            if (other instanceof S2CR_UploadQiXiRecord_4228) {
               return this.mergeFrom((S2CR_UploadQiXiRecord_4228)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadQiXiRecord_4228 other) {
            if (other == CrossMsg.S2CR_UploadQiXiRecord_4228.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerName()) {
                  this.bitField0_ |= 1;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasBelovedItemId()) {
                  this.setBelovedItemId(other.getBelovedItemId());
               }

               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasBelovedItemId()) {
               return false;
            } else {
               return this.hasStage();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadQiXiRecord_4228 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadQiXiRecord_4228)CrossMsg.S2CR_UploadQiXiRecord_4228.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadQiXiRecord_4228)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 1) != 0;
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
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -2;
            this.playerName_ = CrossMsg.S2CR_UploadQiXiRecord_4228.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasBelovedItemId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBelovedItemId() {
            return this.belovedItemId_;
         }

         public Builder setBelovedItemId(int value) {
            this.bitField0_ |= 2;
            this.belovedItemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBelovedItemId() {
            this.bitField0_ &= -3;
            this.belovedItemId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 4;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -5;
            this.stage_ = 0;
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

   public static final class S2CR_UploadMidAutumnRecord_4229 extends GeneratedMessageV3 implements S2CR_UploadMidAutumnRecord_4229OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERNAME_FIELD_NUMBER = 1;
      private volatile Object playerName_;
      public static final int BELOVEDITEMID_FIELD_NUMBER = 2;
      private int belovedItemId_;
      public static final int STAGE_FIELD_NUMBER = 3;
      private int stage_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadMidAutumnRecord_4229 DEFAULT_INSTANCE = new S2CR_UploadMidAutumnRecord_4229();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadMidAutumnRecord_4229> PARSER = new AbstractParser<S2CR_UploadMidAutumnRecord_4229>() {
         public S2CR_UploadMidAutumnRecord_4229 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadMidAutumnRecord_4229(input, extensionRegistry);
         }
      };

      private S2CR_UploadMidAutumnRecord_4229(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadMidAutumnRecord_4229() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadMidAutumnRecord_4229();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadMidAutumnRecord_4229(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.playerName_ = bs;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.belovedItemId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.stage_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_UploadMidAutumnRecord_4229_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_UploadMidAutumnRecord_4229_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadMidAutumnRecord_4229.class, Builder.class);
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 1) != 0;
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

      public boolean hasBelovedItemId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBelovedItemId() {
         return this.belovedItemId_;
      }

      public boolean hasStage() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBelovedItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.playerName_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.belovedItemId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.stage_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.playerName_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.belovedItemId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.stage_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadMidAutumnRecord_4229)) {
            return super.equals(obj);
         } else {
            S2CR_UploadMidAutumnRecord_4229 other = (S2CR_UploadMidAutumnRecord_4229)obj;
            if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasBelovedItemId() != other.hasBelovedItemId()) {
               return false;
            } else if (this.hasBelovedItemId() && this.getBelovedItemId() != other.getBelovedItemId()) {
               return false;
            } else if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPlayerName()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasBelovedItemId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBelovedItemId();
            }

            if (this.hasStage()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getStage();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadMidAutumnRecord_4229 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadMidAutumnRecord_4229)PARSER.parseFrom(data);
      }

      public static S2CR_UploadMidAutumnRecord_4229 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadMidAutumnRecord_4229)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadMidAutumnRecord_4229 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadMidAutumnRecord_4229)PARSER.parseFrom(data);
      }

      public static S2CR_UploadMidAutumnRecord_4229 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadMidAutumnRecord_4229)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadMidAutumnRecord_4229 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadMidAutumnRecord_4229)PARSER.parseFrom(data);
      }

      public static S2CR_UploadMidAutumnRecord_4229 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadMidAutumnRecord_4229)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadMidAutumnRecord_4229 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadMidAutumnRecord_4229)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadMidAutumnRecord_4229 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadMidAutumnRecord_4229)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadMidAutumnRecord_4229 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadMidAutumnRecord_4229)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadMidAutumnRecord_4229 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadMidAutumnRecord_4229)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadMidAutumnRecord_4229 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadMidAutumnRecord_4229)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadMidAutumnRecord_4229 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadMidAutumnRecord_4229)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadMidAutumnRecord_4229 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadMidAutumnRecord_4229 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadMidAutumnRecord_4229> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadMidAutumnRecord_4229> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadMidAutumnRecord_4229 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadMidAutumnRecord_4229OrBuilder {
         private int bitField0_;
         private Object playerName_;
         private int belovedItemId_;
         private int stage_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_UploadMidAutumnRecord_4229_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_UploadMidAutumnRecord_4229_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadMidAutumnRecord_4229.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_UploadMidAutumnRecord_4229.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerName_ = "";
            this.bitField0_ &= -2;
            this.belovedItemId_ = 0;
            this.bitField0_ &= -3;
            this.stage_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_UploadMidAutumnRecord_4229_descriptor;
         }

         public S2CR_UploadMidAutumnRecord_4229 getDefaultInstanceForType() {
            return CrossMsg.S2CR_UploadMidAutumnRecord_4229.getDefaultInstance();
         }

         public S2CR_UploadMidAutumnRecord_4229 build() {
            S2CR_UploadMidAutumnRecord_4229 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadMidAutumnRecord_4229 buildPartial() {
            S2CR_UploadMidAutumnRecord_4229 result = new S2CR_UploadMidAutumnRecord_4229(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 2) != 0) {
               result.belovedItemId_ = this.belovedItemId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.stage_ = this.stage_;
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
            if (other instanceof S2CR_UploadMidAutumnRecord_4229) {
               return this.mergeFrom((S2CR_UploadMidAutumnRecord_4229)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadMidAutumnRecord_4229 other) {
            if (other == CrossMsg.S2CR_UploadMidAutumnRecord_4229.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerName()) {
                  this.bitField0_ |= 1;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasBelovedItemId()) {
                  this.setBelovedItemId(other.getBelovedItemId());
               }

               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasBelovedItemId()) {
               return false;
            } else {
               return this.hasStage();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadMidAutumnRecord_4229 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadMidAutumnRecord_4229)CrossMsg.S2CR_UploadMidAutumnRecord_4229.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadMidAutumnRecord_4229)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 1) != 0;
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
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -2;
            this.playerName_ = CrossMsg.S2CR_UploadMidAutumnRecord_4229.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasBelovedItemId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBelovedItemId() {
            return this.belovedItemId_;
         }

         public Builder setBelovedItemId(int value) {
            this.bitField0_ |= 2;
            this.belovedItemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBelovedItemId() {
            this.bitField0_ &= -3;
            this.belovedItemId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 4;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -5;
            this.stage_ = 0;
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

   public static final class S2CR_UploadYuanDanRecord_22636 extends GeneratedMessageV3 implements S2CR_UploadYuanDanRecord_22636OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERNAME_FIELD_NUMBER = 1;
      private volatile Object playerName_;
      public static final int BELOVEDITEMID_FIELD_NUMBER = 2;
      private int belovedItemId_;
      public static final int STAGE_FIELD_NUMBER = 3;
      private int stage_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadYuanDanRecord_22636 DEFAULT_INSTANCE = new S2CR_UploadYuanDanRecord_22636();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadYuanDanRecord_22636> PARSER = new AbstractParser<S2CR_UploadYuanDanRecord_22636>() {
         public S2CR_UploadYuanDanRecord_22636 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadYuanDanRecord_22636(input, extensionRegistry);
         }
      };

      private S2CR_UploadYuanDanRecord_22636(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadYuanDanRecord_22636() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadYuanDanRecord_22636();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadYuanDanRecord_22636(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.playerName_ = bs;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.belovedItemId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.stage_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_UploadYuanDanRecord_22636_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_UploadYuanDanRecord_22636_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadYuanDanRecord_22636.class, Builder.class);
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 1) != 0;
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

      public boolean hasBelovedItemId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBelovedItemId() {
         return this.belovedItemId_;
      }

      public boolean hasStage() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBelovedItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.playerName_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.belovedItemId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.stage_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.playerName_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.belovedItemId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.stage_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadYuanDanRecord_22636)) {
            return super.equals(obj);
         } else {
            S2CR_UploadYuanDanRecord_22636 other = (S2CR_UploadYuanDanRecord_22636)obj;
            if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasBelovedItemId() != other.hasBelovedItemId()) {
               return false;
            } else if (this.hasBelovedItemId() && this.getBelovedItemId() != other.getBelovedItemId()) {
               return false;
            } else if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPlayerName()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasBelovedItemId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBelovedItemId();
            }

            if (this.hasStage()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getStage();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadYuanDanRecord_22636 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadYuanDanRecord_22636)PARSER.parseFrom(data);
      }

      public static S2CR_UploadYuanDanRecord_22636 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadYuanDanRecord_22636)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadYuanDanRecord_22636 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadYuanDanRecord_22636)PARSER.parseFrom(data);
      }

      public static S2CR_UploadYuanDanRecord_22636 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadYuanDanRecord_22636)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadYuanDanRecord_22636 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadYuanDanRecord_22636)PARSER.parseFrom(data);
      }

      public static S2CR_UploadYuanDanRecord_22636 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadYuanDanRecord_22636)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadYuanDanRecord_22636 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadYuanDanRecord_22636)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadYuanDanRecord_22636 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadYuanDanRecord_22636)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadYuanDanRecord_22636 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadYuanDanRecord_22636)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadYuanDanRecord_22636 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadYuanDanRecord_22636)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadYuanDanRecord_22636 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadYuanDanRecord_22636)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadYuanDanRecord_22636 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadYuanDanRecord_22636)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadYuanDanRecord_22636 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadYuanDanRecord_22636 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadYuanDanRecord_22636> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadYuanDanRecord_22636> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadYuanDanRecord_22636 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadYuanDanRecord_22636OrBuilder {
         private int bitField0_;
         private Object playerName_;
         private int belovedItemId_;
         private int stage_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_UploadYuanDanRecord_22636_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_UploadYuanDanRecord_22636_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadYuanDanRecord_22636.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_UploadYuanDanRecord_22636.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerName_ = "";
            this.bitField0_ &= -2;
            this.belovedItemId_ = 0;
            this.bitField0_ &= -3;
            this.stage_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_UploadYuanDanRecord_22636_descriptor;
         }

         public S2CR_UploadYuanDanRecord_22636 getDefaultInstanceForType() {
            return CrossMsg.S2CR_UploadYuanDanRecord_22636.getDefaultInstance();
         }

         public S2CR_UploadYuanDanRecord_22636 build() {
            S2CR_UploadYuanDanRecord_22636 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadYuanDanRecord_22636 buildPartial() {
            S2CR_UploadYuanDanRecord_22636 result = new S2CR_UploadYuanDanRecord_22636(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 2) != 0) {
               result.belovedItemId_ = this.belovedItemId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.stage_ = this.stage_;
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
            if (other instanceof S2CR_UploadYuanDanRecord_22636) {
               return this.mergeFrom((S2CR_UploadYuanDanRecord_22636)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadYuanDanRecord_22636 other) {
            if (other == CrossMsg.S2CR_UploadYuanDanRecord_22636.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerName()) {
                  this.bitField0_ |= 1;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasBelovedItemId()) {
                  this.setBelovedItemId(other.getBelovedItemId());
               }

               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasBelovedItemId()) {
               return false;
            } else {
               return this.hasStage();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadYuanDanRecord_22636 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadYuanDanRecord_22636)CrossMsg.S2CR_UploadYuanDanRecord_22636.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadYuanDanRecord_22636)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 1) != 0;
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
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -2;
            this.playerName_ = CrossMsg.S2CR_UploadYuanDanRecord_22636.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasBelovedItemId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBelovedItemId() {
            return this.belovedItemId_;
         }

         public Builder setBelovedItemId(int value) {
            this.bitField0_ |= 2;
            this.belovedItemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBelovedItemId() {
            this.bitField0_ &= -3;
            this.belovedItemId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 4;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -5;
            this.stage_ = 0;
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

   public static final class S2CR_UploadGuoQingRecord_4251 extends GeneratedMessageV3 implements S2CR_UploadGuoQingRecord_4251OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERNAME_FIELD_NUMBER = 1;
      private volatile Object playerName_;
      public static final int BELOVEDITEMID_FIELD_NUMBER = 2;
      private int belovedItemId_;
      public static final int STAGE_FIELD_NUMBER = 3;
      private int stage_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadGuoQingRecord_4251 DEFAULT_INSTANCE = new S2CR_UploadGuoQingRecord_4251();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadGuoQingRecord_4251> PARSER = new AbstractParser<S2CR_UploadGuoQingRecord_4251>() {
         public S2CR_UploadGuoQingRecord_4251 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadGuoQingRecord_4251(input, extensionRegistry);
         }
      };

      private S2CR_UploadGuoQingRecord_4251(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadGuoQingRecord_4251() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadGuoQingRecord_4251();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadGuoQingRecord_4251(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.playerName_ = bs;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.belovedItemId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.stage_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_UploadGuoQingRecord_4251_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_UploadGuoQingRecord_4251_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadGuoQingRecord_4251.class, Builder.class);
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 1) != 0;
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

      public boolean hasBelovedItemId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBelovedItemId() {
         return this.belovedItemId_;
      }

      public boolean hasStage() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBelovedItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.playerName_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.belovedItemId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.stage_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.playerName_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.belovedItemId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.stage_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadGuoQingRecord_4251)) {
            return super.equals(obj);
         } else {
            S2CR_UploadGuoQingRecord_4251 other = (S2CR_UploadGuoQingRecord_4251)obj;
            if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasBelovedItemId() != other.hasBelovedItemId()) {
               return false;
            } else if (this.hasBelovedItemId() && this.getBelovedItemId() != other.getBelovedItemId()) {
               return false;
            } else if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPlayerName()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasBelovedItemId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBelovedItemId();
            }

            if (this.hasStage()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getStage();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadGuoQingRecord_4251 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadGuoQingRecord_4251)PARSER.parseFrom(data);
      }

      public static S2CR_UploadGuoQingRecord_4251 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadGuoQingRecord_4251)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadGuoQingRecord_4251 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadGuoQingRecord_4251)PARSER.parseFrom(data);
      }

      public static S2CR_UploadGuoQingRecord_4251 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadGuoQingRecord_4251)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadGuoQingRecord_4251 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadGuoQingRecord_4251)PARSER.parseFrom(data);
      }

      public static S2CR_UploadGuoQingRecord_4251 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadGuoQingRecord_4251)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadGuoQingRecord_4251 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadGuoQingRecord_4251)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadGuoQingRecord_4251 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadGuoQingRecord_4251)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadGuoQingRecord_4251 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadGuoQingRecord_4251)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadGuoQingRecord_4251 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadGuoQingRecord_4251)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadGuoQingRecord_4251 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadGuoQingRecord_4251)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadGuoQingRecord_4251 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadGuoQingRecord_4251)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadGuoQingRecord_4251 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadGuoQingRecord_4251 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadGuoQingRecord_4251> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadGuoQingRecord_4251> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadGuoQingRecord_4251 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadGuoQingRecord_4251OrBuilder {
         private int bitField0_;
         private Object playerName_;
         private int belovedItemId_;
         private int stage_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_UploadGuoQingRecord_4251_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_UploadGuoQingRecord_4251_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadGuoQingRecord_4251.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_UploadGuoQingRecord_4251.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerName_ = "";
            this.bitField0_ &= -2;
            this.belovedItemId_ = 0;
            this.bitField0_ &= -3;
            this.stage_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_UploadGuoQingRecord_4251_descriptor;
         }

         public S2CR_UploadGuoQingRecord_4251 getDefaultInstanceForType() {
            return CrossMsg.S2CR_UploadGuoQingRecord_4251.getDefaultInstance();
         }

         public S2CR_UploadGuoQingRecord_4251 build() {
            S2CR_UploadGuoQingRecord_4251 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadGuoQingRecord_4251 buildPartial() {
            S2CR_UploadGuoQingRecord_4251 result = new S2CR_UploadGuoQingRecord_4251(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 2) != 0) {
               result.belovedItemId_ = this.belovedItemId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.stage_ = this.stage_;
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
            if (other instanceof S2CR_UploadGuoQingRecord_4251) {
               return this.mergeFrom((S2CR_UploadGuoQingRecord_4251)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadGuoQingRecord_4251 other) {
            if (other == CrossMsg.S2CR_UploadGuoQingRecord_4251.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerName()) {
                  this.bitField0_ |= 1;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasBelovedItemId()) {
                  this.setBelovedItemId(other.getBelovedItemId());
               }

               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasBelovedItemId()) {
               return false;
            } else {
               return this.hasStage();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadGuoQingRecord_4251 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadGuoQingRecord_4251)CrossMsg.S2CR_UploadGuoQingRecord_4251.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadGuoQingRecord_4251)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 1) != 0;
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
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -2;
            this.playerName_ = CrossMsg.S2CR_UploadGuoQingRecord_4251.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasBelovedItemId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBelovedItemId() {
            return this.belovedItemId_;
         }

         public Builder setBelovedItemId(int value) {
            this.bitField0_ |= 2;
            this.belovedItemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBelovedItemId() {
            this.bitField0_ &= -3;
            this.belovedItemId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 4;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -5;
            this.stage_ = 0;
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

   public static final class S2CR_UploadFirstYearRecord_4252 extends GeneratedMessageV3 implements S2CR_UploadFirstYearRecord_4252OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERNAME_FIELD_NUMBER = 1;
      private volatile Object playerName_;
      public static final int BELOVEDITEMID_FIELD_NUMBER = 2;
      private int belovedItemId_;
      public static final int STAGE_FIELD_NUMBER = 3;
      private int stage_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadFirstYearRecord_4252 DEFAULT_INSTANCE = new S2CR_UploadFirstYearRecord_4252();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadFirstYearRecord_4252> PARSER = new AbstractParser<S2CR_UploadFirstYearRecord_4252>() {
         public S2CR_UploadFirstYearRecord_4252 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadFirstYearRecord_4252(input, extensionRegistry);
         }
      };

      private S2CR_UploadFirstYearRecord_4252(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadFirstYearRecord_4252() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadFirstYearRecord_4252();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadFirstYearRecord_4252(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.playerName_ = bs;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.belovedItemId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.stage_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_UploadFirstYearRecord_4252_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_UploadFirstYearRecord_4252_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadFirstYearRecord_4252.class, Builder.class);
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 1) != 0;
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

      public boolean hasBelovedItemId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBelovedItemId() {
         return this.belovedItemId_;
      }

      public boolean hasStage() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBelovedItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.playerName_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.belovedItemId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.stage_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.playerName_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.belovedItemId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.stage_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadFirstYearRecord_4252)) {
            return super.equals(obj);
         } else {
            S2CR_UploadFirstYearRecord_4252 other = (S2CR_UploadFirstYearRecord_4252)obj;
            if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasBelovedItemId() != other.hasBelovedItemId()) {
               return false;
            } else if (this.hasBelovedItemId() && this.getBelovedItemId() != other.getBelovedItemId()) {
               return false;
            } else if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPlayerName()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasBelovedItemId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBelovedItemId();
            }

            if (this.hasStage()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getStage();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadFirstYearRecord_4252 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadFirstYearRecord_4252)PARSER.parseFrom(data);
      }

      public static S2CR_UploadFirstYearRecord_4252 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadFirstYearRecord_4252)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadFirstYearRecord_4252 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadFirstYearRecord_4252)PARSER.parseFrom(data);
      }

      public static S2CR_UploadFirstYearRecord_4252 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadFirstYearRecord_4252)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadFirstYearRecord_4252 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadFirstYearRecord_4252)PARSER.parseFrom(data);
      }

      public static S2CR_UploadFirstYearRecord_4252 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadFirstYearRecord_4252)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadFirstYearRecord_4252 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadFirstYearRecord_4252)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadFirstYearRecord_4252 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadFirstYearRecord_4252)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadFirstYearRecord_4252 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadFirstYearRecord_4252)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadFirstYearRecord_4252 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadFirstYearRecord_4252)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadFirstYearRecord_4252 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadFirstYearRecord_4252)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadFirstYearRecord_4252 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadFirstYearRecord_4252)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadFirstYearRecord_4252 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadFirstYearRecord_4252 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadFirstYearRecord_4252> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadFirstYearRecord_4252> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadFirstYearRecord_4252 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadFirstYearRecord_4252OrBuilder {
         private int bitField0_;
         private Object playerName_;
         private int belovedItemId_;
         private int stage_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_UploadFirstYearRecord_4252_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_UploadFirstYearRecord_4252_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadFirstYearRecord_4252.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_UploadFirstYearRecord_4252.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerName_ = "";
            this.bitField0_ &= -2;
            this.belovedItemId_ = 0;
            this.bitField0_ &= -3;
            this.stage_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_UploadFirstYearRecord_4252_descriptor;
         }

         public S2CR_UploadFirstYearRecord_4252 getDefaultInstanceForType() {
            return CrossMsg.S2CR_UploadFirstYearRecord_4252.getDefaultInstance();
         }

         public S2CR_UploadFirstYearRecord_4252 build() {
            S2CR_UploadFirstYearRecord_4252 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadFirstYearRecord_4252 buildPartial() {
            S2CR_UploadFirstYearRecord_4252 result = new S2CR_UploadFirstYearRecord_4252(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 2) != 0) {
               result.belovedItemId_ = this.belovedItemId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.stage_ = this.stage_;
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
            if (other instanceof S2CR_UploadFirstYearRecord_4252) {
               return this.mergeFrom((S2CR_UploadFirstYearRecord_4252)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadFirstYearRecord_4252 other) {
            if (other == CrossMsg.S2CR_UploadFirstYearRecord_4252.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerName()) {
                  this.bitField0_ |= 1;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasBelovedItemId()) {
                  this.setBelovedItemId(other.getBelovedItemId());
               }

               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasBelovedItemId()) {
               return false;
            } else {
               return this.hasStage();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadFirstYearRecord_4252 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadFirstYearRecord_4252)CrossMsg.S2CR_UploadFirstYearRecord_4252.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadFirstYearRecord_4252)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 1) != 0;
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
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -2;
            this.playerName_ = CrossMsg.S2CR_UploadFirstYearRecord_4252.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasBelovedItemId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBelovedItemId() {
            return this.belovedItemId_;
         }

         public Builder setBelovedItemId(int value) {
            this.bitField0_ |= 2;
            this.belovedItemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBelovedItemId() {
            this.bitField0_ &= -3;
            this.belovedItemId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 4;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -5;
            this.stage_ = 0;
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

   public static final class S2CR_UploadFirstYearTreasureNum_4253 extends GeneratedMessageV3 implements S2CR_UploadFirstYearTreasureNum_4253OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SERVERID_FIELD_NUMBER = 1;
      private int serverId_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int FIRSTYEARTREASURENUM_FIELD_NUMBER = 3;
      private long firstYearTreasureNum_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadFirstYearTreasureNum_4253 DEFAULT_INSTANCE = new S2CR_UploadFirstYearTreasureNum_4253();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadFirstYearTreasureNum_4253> PARSER = new AbstractParser<S2CR_UploadFirstYearTreasureNum_4253>() {
         public S2CR_UploadFirstYearTreasureNum_4253 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadFirstYearTreasureNum_4253(input, extensionRegistry);
         }
      };

      private S2CR_UploadFirstYearTreasureNum_4253(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadFirstYearTreasureNum_4253() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadFirstYearTreasureNum_4253();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadFirstYearTreasureNum_4253(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.playerId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.firstYearTreasureNum_ = input.readInt64();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_UploadFirstYearTreasureNum_4253_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_UploadFirstYearTreasureNum_4253_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadFirstYearTreasureNum_4253.class, Builder.class);
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasFirstYearTreasureNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public long getFirstYearTreasureNum() {
         return this.firstYearTreasureNum_;
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
            output.writeInt32(1, this.serverId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt64(3, this.firstYearTreasureNum_);
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
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt64Size(3, this.firstYearTreasureNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadFirstYearTreasureNum_4253)) {
            return super.equals(obj);
         } else {
            S2CR_UploadFirstYearTreasureNum_4253 other = (S2CR_UploadFirstYearTreasureNum_4253)obj;
            if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasFirstYearTreasureNum() != other.hasFirstYearTreasureNum()) {
               return false;
            } else if (this.hasFirstYearTreasureNum() && this.getFirstYearTreasureNum() != other.getFirstYearTreasureNum()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasFirstYearTreasureNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashLong(this.getFirstYearTreasureNum());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadFirstYearTreasureNum_4253 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadFirstYearTreasureNum_4253)PARSER.parseFrom(data);
      }

      public static S2CR_UploadFirstYearTreasureNum_4253 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadFirstYearTreasureNum_4253)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadFirstYearTreasureNum_4253 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadFirstYearTreasureNum_4253)PARSER.parseFrom(data);
      }

      public static S2CR_UploadFirstYearTreasureNum_4253 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadFirstYearTreasureNum_4253)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadFirstYearTreasureNum_4253 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadFirstYearTreasureNum_4253)PARSER.parseFrom(data);
      }

      public static S2CR_UploadFirstYearTreasureNum_4253 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadFirstYearTreasureNum_4253)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadFirstYearTreasureNum_4253 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadFirstYearTreasureNum_4253)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadFirstYearTreasureNum_4253 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadFirstYearTreasureNum_4253)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadFirstYearTreasureNum_4253 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadFirstYearTreasureNum_4253)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadFirstYearTreasureNum_4253 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadFirstYearTreasureNum_4253)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadFirstYearTreasureNum_4253 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadFirstYearTreasureNum_4253)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadFirstYearTreasureNum_4253 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadFirstYearTreasureNum_4253)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadFirstYearTreasureNum_4253 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadFirstYearTreasureNum_4253 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadFirstYearTreasureNum_4253> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadFirstYearTreasureNum_4253> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadFirstYearTreasureNum_4253 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadFirstYearTreasureNum_4253OrBuilder {
         private int bitField0_;
         private int serverId_;
         private int playerId_;
         private long firstYearTreasureNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_UploadFirstYearTreasureNum_4253_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_UploadFirstYearTreasureNum_4253_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadFirstYearTreasureNum_4253.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_UploadFirstYearTreasureNum_4253.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.serverId_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.firstYearTreasureNum_ = 0L;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_UploadFirstYearTreasureNum_4253_descriptor;
         }

         public S2CR_UploadFirstYearTreasureNum_4253 getDefaultInstanceForType() {
            return CrossMsg.S2CR_UploadFirstYearTreasureNum_4253.getDefaultInstance();
         }

         public S2CR_UploadFirstYearTreasureNum_4253 build() {
            S2CR_UploadFirstYearTreasureNum_4253 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadFirstYearTreasureNum_4253 buildPartial() {
            S2CR_UploadFirstYearTreasureNum_4253 result = new S2CR_UploadFirstYearTreasureNum_4253(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.firstYearTreasureNum_ = this.firstYearTreasureNum_;
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
            if (other instanceof S2CR_UploadFirstYearTreasureNum_4253) {
               return this.mergeFrom((S2CR_UploadFirstYearTreasureNum_4253)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadFirstYearTreasureNum_4253 other) {
            if (other == CrossMsg.S2CR_UploadFirstYearTreasureNum_4253.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasFirstYearTreasureNum()) {
                  this.setFirstYearTreasureNum(other.getFirstYearTreasureNum());
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
            S2CR_UploadFirstYearTreasureNum_4253 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadFirstYearTreasureNum_4253)CrossMsg.S2CR_UploadFirstYearTreasureNum_4253.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadFirstYearTreasureNum_4253)e.getUnfinishedMessage();
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

         public boolean hasFirstYearTreasureNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public long getFirstYearTreasureNum() {
            return this.firstYearTreasureNum_;
         }

         public Builder setFirstYearTreasureNum(long value) {
            this.bitField0_ |= 4;
            this.firstYearTreasureNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFirstYearTreasureNum() {
            this.bitField0_ &= -5;
            this.firstYearTreasureNum_ = 0L;
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

   public static final class S2CR_UploadChineseNewYearTreasureNum_4254 extends GeneratedMessageV3 implements S2CR_UploadChineseNewYearTreasureNum_4254OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SERVERID_FIELD_NUMBER = 1;
      private int serverId_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int CHINESENEWYEARTREASURENUM_FIELD_NUMBER = 3;
      private long chineseNewYearTreasureNum_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadChineseNewYearTreasureNum_4254 DEFAULT_INSTANCE = new S2CR_UploadChineseNewYearTreasureNum_4254();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadChineseNewYearTreasureNum_4254> PARSER = new AbstractParser<S2CR_UploadChineseNewYearTreasureNum_4254>() {
         public S2CR_UploadChineseNewYearTreasureNum_4254 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadChineseNewYearTreasureNum_4254(input, extensionRegistry);
         }
      };

      private S2CR_UploadChineseNewYearTreasureNum_4254(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadChineseNewYearTreasureNum_4254() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadChineseNewYearTreasureNum_4254();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadChineseNewYearTreasureNum_4254(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.playerId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.chineseNewYearTreasureNum_ = input.readInt64();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_UploadChineseNewYearTreasureNum_4254_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_UploadChineseNewYearTreasureNum_4254_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadChineseNewYearTreasureNum_4254.class, Builder.class);
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getServerId() {
         return this.serverId_;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasChineseNewYearTreasureNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public long getChineseNewYearTreasureNum() {
         return this.chineseNewYearTreasureNum_;
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
            output.writeInt32(1, this.serverId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt64(3, this.chineseNewYearTreasureNum_);
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
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt64Size(3, this.chineseNewYearTreasureNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadChineseNewYearTreasureNum_4254)) {
            return super.equals(obj);
         } else {
            S2CR_UploadChineseNewYearTreasureNum_4254 other = (S2CR_UploadChineseNewYearTreasureNum_4254)obj;
            if (this.hasServerId() != other.hasServerId()) {
               return false;
            } else if (this.hasServerId() && this.getServerId() != other.getServerId()) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasChineseNewYearTreasureNum() != other.hasChineseNewYearTreasureNum()) {
               return false;
            } else if (this.hasChineseNewYearTreasureNum() && this.getChineseNewYearTreasureNum() != other.getChineseNewYearTreasureNum()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasChineseNewYearTreasureNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashLong(this.getChineseNewYearTreasureNum());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadChineseNewYearTreasureNum_4254 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadChineseNewYearTreasureNum_4254)PARSER.parseFrom(data);
      }

      public static S2CR_UploadChineseNewYearTreasureNum_4254 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadChineseNewYearTreasureNum_4254)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadChineseNewYearTreasureNum_4254 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadChineseNewYearTreasureNum_4254)PARSER.parseFrom(data);
      }

      public static S2CR_UploadChineseNewYearTreasureNum_4254 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadChineseNewYearTreasureNum_4254)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadChineseNewYearTreasureNum_4254 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadChineseNewYearTreasureNum_4254)PARSER.parseFrom(data);
      }

      public static S2CR_UploadChineseNewYearTreasureNum_4254 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadChineseNewYearTreasureNum_4254)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadChineseNewYearTreasureNum_4254 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadChineseNewYearTreasureNum_4254)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadChineseNewYearTreasureNum_4254 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadChineseNewYearTreasureNum_4254)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadChineseNewYearTreasureNum_4254 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadChineseNewYearTreasureNum_4254)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadChineseNewYearTreasureNum_4254 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadChineseNewYearTreasureNum_4254)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadChineseNewYearTreasureNum_4254 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadChineseNewYearTreasureNum_4254)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadChineseNewYearTreasureNum_4254 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadChineseNewYearTreasureNum_4254)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadChineseNewYearTreasureNum_4254 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadChineseNewYearTreasureNum_4254 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadChineseNewYearTreasureNum_4254> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadChineseNewYearTreasureNum_4254> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadChineseNewYearTreasureNum_4254 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadChineseNewYearTreasureNum_4254OrBuilder {
         private int bitField0_;
         private int serverId_;
         private int playerId_;
         private long chineseNewYearTreasureNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_UploadChineseNewYearTreasureNum_4254_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_UploadChineseNewYearTreasureNum_4254_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadChineseNewYearTreasureNum_4254.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_UploadChineseNewYearTreasureNum_4254.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.serverId_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.chineseNewYearTreasureNum_ = 0L;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_UploadChineseNewYearTreasureNum_4254_descriptor;
         }

         public S2CR_UploadChineseNewYearTreasureNum_4254 getDefaultInstanceForType() {
            return CrossMsg.S2CR_UploadChineseNewYearTreasureNum_4254.getDefaultInstance();
         }

         public S2CR_UploadChineseNewYearTreasureNum_4254 build() {
            S2CR_UploadChineseNewYearTreasureNum_4254 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadChineseNewYearTreasureNum_4254 buildPartial() {
            S2CR_UploadChineseNewYearTreasureNum_4254 result = new S2CR_UploadChineseNewYearTreasureNum_4254(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.serverId_ = this.serverId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.chineseNewYearTreasureNum_ = this.chineseNewYearTreasureNum_;
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
            if (other instanceof S2CR_UploadChineseNewYearTreasureNum_4254) {
               return this.mergeFrom((S2CR_UploadChineseNewYearTreasureNum_4254)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadChineseNewYearTreasureNum_4254 other) {
            if (other == CrossMsg.S2CR_UploadChineseNewYearTreasureNum_4254.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasServerId()) {
                  this.setServerId(other.getServerId());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasChineseNewYearTreasureNum()) {
                  this.setChineseNewYearTreasureNum(other.getChineseNewYearTreasureNum());
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
            S2CR_UploadChineseNewYearTreasureNum_4254 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadChineseNewYearTreasureNum_4254)CrossMsg.S2CR_UploadChineseNewYearTreasureNum_4254.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadChineseNewYearTreasureNum_4254)e.getUnfinishedMessage();
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

         public boolean hasChineseNewYearTreasureNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public long getChineseNewYearTreasureNum() {
            return this.chineseNewYearTreasureNum_;
         }

         public Builder setChineseNewYearTreasureNum(long value) {
            this.bitField0_ |= 4;
            this.chineseNewYearTreasureNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChineseNewYearTreasureNum() {
            this.bitField0_ &= -5;
            this.chineseNewYearTreasureNum_ = 0L;
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

   public static final class S2CR_UploadChineseNewYearRecord_4255 extends GeneratedMessageV3 implements S2CR_UploadChineseNewYearRecord_4255OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERNAME_FIELD_NUMBER = 1;
      private volatile Object playerName_;
      public static final int BELOVEDITEMID_FIELD_NUMBER = 2;
      private int belovedItemId_;
      public static final int STAGE_FIELD_NUMBER = 3;
      private int stage_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadChineseNewYearRecord_4255 DEFAULT_INSTANCE = new S2CR_UploadChineseNewYearRecord_4255();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadChineseNewYearRecord_4255> PARSER = new AbstractParser<S2CR_UploadChineseNewYearRecord_4255>() {
         public S2CR_UploadChineseNewYearRecord_4255 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadChineseNewYearRecord_4255(input, extensionRegistry);
         }
      };

      private S2CR_UploadChineseNewYearRecord_4255(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadChineseNewYearRecord_4255() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadChineseNewYearRecord_4255();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadChineseNewYearRecord_4255(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.playerName_ = bs;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.belovedItemId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.stage_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_UploadChineseNewYearRecord_4255_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_UploadChineseNewYearRecord_4255_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadChineseNewYearRecord_4255.class, Builder.class);
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 1) != 0;
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

      public boolean hasBelovedItemId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBelovedItemId() {
         return this.belovedItemId_;
      }

      public boolean hasStage() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBelovedItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.playerName_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.belovedItemId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.stage_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.playerName_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.belovedItemId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.stage_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadChineseNewYearRecord_4255)) {
            return super.equals(obj);
         } else {
            S2CR_UploadChineseNewYearRecord_4255 other = (S2CR_UploadChineseNewYearRecord_4255)obj;
            if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasBelovedItemId() != other.hasBelovedItemId()) {
               return false;
            } else if (this.hasBelovedItemId() && this.getBelovedItemId() != other.getBelovedItemId()) {
               return false;
            } else if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPlayerName()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasBelovedItemId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBelovedItemId();
            }

            if (this.hasStage()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getStage();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadChineseNewYearRecord_4255 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadChineseNewYearRecord_4255)PARSER.parseFrom(data);
      }

      public static S2CR_UploadChineseNewYearRecord_4255 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadChineseNewYearRecord_4255)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadChineseNewYearRecord_4255 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadChineseNewYearRecord_4255)PARSER.parseFrom(data);
      }

      public static S2CR_UploadChineseNewYearRecord_4255 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadChineseNewYearRecord_4255)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadChineseNewYearRecord_4255 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadChineseNewYearRecord_4255)PARSER.parseFrom(data);
      }

      public static S2CR_UploadChineseNewYearRecord_4255 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadChineseNewYearRecord_4255)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadChineseNewYearRecord_4255 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadChineseNewYearRecord_4255)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadChineseNewYearRecord_4255 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadChineseNewYearRecord_4255)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadChineseNewYearRecord_4255 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadChineseNewYearRecord_4255)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadChineseNewYearRecord_4255 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadChineseNewYearRecord_4255)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadChineseNewYearRecord_4255 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadChineseNewYearRecord_4255)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadChineseNewYearRecord_4255 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadChineseNewYearRecord_4255)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadChineseNewYearRecord_4255 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadChineseNewYearRecord_4255 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadChineseNewYearRecord_4255> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadChineseNewYearRecord_4255> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadChineseNewYearRecord_4255 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadChineseNewYearRecord_4255OrBuilder {
         private int bitField0_;
         private Object playerName_;
         private int belovedItemId_;
         private int stage_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_UploadChineseNewYearRecord_4255_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_UploadChineseNewYearRecord_4255_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadChineseNewYearRecord_4255.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_UploadChineseNewYearRecord_4255.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerName_ = "";
            this.bitField0_ &= -2;
            this.belovedItemId_ = 0;
            this.bitField0_ &= -3;
            this.stage_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_UploadChineseNewYearRecord_4255_descriptor;
         }

         public S2CR_UploadChineseNewYearRecord_4255 getDefaultInstanceForType() {
            return CrossMsg.S2CR_UploadChineseNewYearRecord_4255.getDefaultInstance();
         }

         public S2CR_UploadChineseNewYearRecord_4255 build() {
            S2CR_UploadChineseNewYearRecord_4255 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadChineseNewYearRecord_4255 buildPartial() {
            S2CR_UploadChineseNewYearRecord_4255 result = new S2CR_UploadChineseNewYearRecord_4255(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 2) != 0) {
               result.belovedItemId_ = this.belovedItemId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.stage_ = this.stage_;
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
            if (other instanceof S2CR_UploadChineseNewYearRecord_4255) {
               return this.mergeFrom((S2CR_UploadChineseNewYearRecord_4255)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadChineseNewYearRecord_4255 other) {
            if (other == CrossMsg.S2CR_UploadChineseNewYearRecord_4255.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerName()) {
                  this.bitField0_ |= 1;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasBelovedItemId()) {
                  this.setBelovedItemId(other.getBelovedItemId());
               }

               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasBelovedItemId()) {
               return false;
            } else {
               return this.hasStage();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadChineseNewYearRecord_4255 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadChineseNewYearRecord_4255)CrossMsg.S2CR_UploadChineseNewYearRecord_4255.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadChineseNewYearRecord_4255)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 1) != 0;
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
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -2;
            this.playerName_ = CrossMsg.S2CR_UploadChineseNewYearRecord_4255.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasBelovedItemId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBelovedItemId() {
            return this.belovedItemId_;
         }

         public Builder setBelovedItemId(int value) {
            this.bitField0_ |= 2;
            this.belovedItemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBelovedItemId() {
            this.bitField0_ &= -3;
            this.belovedItemId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 4;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -5;
            this.stage_ = 0;
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

   public static final class S2CR_UploadYuanXiaoRecord_4256 extends GeneratedMessageV3 implements S2CR_UploadYuanXiaoRecord_4256OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERNAME_FIELD_NUMBER = 1;
      private volatile Object playerName_;
      public static final int BELOVEDITEMID_FIELD_NUMBER = 2;
      private int belovedItemId_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadYuanXiaoRecord_4256 DEFAULT_INSTANCE = new S2CR_UploadYuanXiaoRecord_4256();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadYuanXiaoRecord_4256> PARSER = new AbstractParser<S2CR_UploadYuanXiaoRecord_4256>() {
         public S2CR_UploadYuanXiaoRecord_4256 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadYuanXiaoRecord_4256(input, extensionRegistry);
         }
      };

      private S2CR_UploadYuanXiaoRecord_4256(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadYuanXiaoRecord_4256() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadYuanXiaoRecord_4256();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadYuanXiaoRecord_4256(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.playerName_ = bs;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.belovedItemId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_UploadYuanXiaoRecord_4256_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_UploadYuanXiaoRecord_4256_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadYuanXiaoRecord_4256.class, Builder.class);
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 1) != 0;
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

      public boolean hasBelovedItemId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBelovedItemId() {
         return this.belovedItemId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBelovedItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.playerName_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.belovedItemId_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.playerName_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.belovedItemId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadYuanXiaoRecord_4256)) {
            return super.equals(obj);
         } else {
            S2CR_UploadYuanXiaoRecord_4256 other = (S2CR_UploadYuanXiaoRecord_4256)obj;
            if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasBelovedItemId() != other.hasBelovedItemId()) {
               return false;
            } else if (this.hasBelovedItemId() && this.getBelovedItemId() != other.getBelovedItemId()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPlayerName()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasBelovedItemId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBelovedItemId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadYuanXiaoRecord_4256 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadYuanXiaoRecord_4256)PARSER.parseFrom(data);
      }

      public static S2CR_UploadYuanXiaoRecord_4256 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadYuanXiaoRecord_4256)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadYuanXiaoRecord_4256 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadYuanXiaoRecord_4256)PARSER.parseFrom(data);
      }

      public static S2CR_UploadYuanXiaoRecord_4256 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadYuanXiaoRecord_4256)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadYuanXiaoRecord_4256 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadYuanXiaoRecord_4256)PARSER.parseFrom(data);
      }

      public static S2CR_UploadYuanXiaoRecord_4256 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadYuanXiaoRecord_4256)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadYuanXiaoRecord_4256 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadYuanXiaoRecord_4256)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadYuanXiaoRecord_4256 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadYuanXiaoRecord_4256)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadYuanXiaoRecord_4256 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadYuanXiaoRecord_4256)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadYuanXiaoRecord_4256 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadYuanXiaoRecord_4256)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadYuanXiaoRecord_4256 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadYuanXiaoRecord_4256)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadYuanXiaoRecord_4256 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadYuanXiaoRecord_4256)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadYuanXiaoRecord_4256 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadYuanXiaoRecord_4256 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadYuanXiaoRecord_4256> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadYuanXiaoRecord_4256> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadYuanXiaoRecord_4256 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadYuanXiaoRecord_4256OrBuilder {
         private int bitField0_;
         private Object playerName_;
         private int belovedItemId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_UploadYuanXiaoRecord_4256_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_UploadYuanXiaoRecord_4256_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadYuanXiaoRecord_4256.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_UploadYuanXiaoRecord_4256.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerName_ = "";
            this.bitField0_ &= -2;
            this.belovedItemId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_UploadYuanXiaoRecord_4256_descriptor;
         }

         public S2CR_UploadYuanXiaoRecord_4256 getDefaultInstanceForType() {
            return CrossMsg.S2CR_UploadYuanXiaoRecord_4256.getDefaultInstance();
         }

         public S2CR_UploadYuanXiaoRecord_4256 build() {
            S2CR_UploadYuanXiaoRecord_4256 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadYuanXiaoRecord_4256 buildPartial() {
            S2CR_UploadYuanXiaoRecord_4256 result = new S2CR_UploadYuanXiaoRecord_4256(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 2) != 0) {
               result.belovedItemId_ = this.belovedItemId_;
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
            if (other instanceof S2CR_UploadYuanXiaoRecord_4256) {
               return this.mergeFrom((S2CR_UploadYuanXiaoRecord_4256)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadYuanXiaoRecord_4256 other) {
            if (other == CrossMsg.S2CR_UploadYuanXiaoRecord_4256.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerName()) {
                  this.bitField0_ |= 1;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasBelovedItemId()) {
                  this.setBelovedItemId(other.getBelovedItemId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerName()) {
               return false;
            } else {
               return this.hasBelovedItemId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadYuanXiaoRecord_4256 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadYuanXiaoRecord_4256)CrossMsg.S2CR_UploadYuanXiaoRecord_4256.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadYuanXiaoRecord_4256)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 1) != 0;
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
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -2;
            this.playerName_ = CrossMsg.S2CR_UploadYuanXiaoRecord_4256.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasBelovedItemId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBelovedItemId() {
            return this.belovedItemId_;
         }

         public Builder setBelovedItemId(int value) {
            this.bitField0_ |= 2;
            this.belovedItemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBelovedItemId() {
            this.bitField0_ &= -3;
            this.belovedItemId_ = 0;
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

   public static final class S2CR_UploadAliveNum_4257 extends GeneratedMessageV3 implements S2CR_UploadAliveNum_4257OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int LASTWEEKLYNUM_FIELD_NUMBER = 1;
      private long lastWeeklyNum_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadAliveNum_4257 DEFAULT_INSTANCE = new S2CR_UploadAliveNum_4257();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadAliveNum_4257> PARSER = new AbstractParser<S2CR_UploadAliveNum_4257>() {
         public S2CR_UploadAliveNum_4257 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadAliveNum_4257(input, extensionRegistry);
         }
      };

      private S2CR_UploadAliveNum_4257(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadAliveNum_4257() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadAliveNum_4257();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadAliveNum_4257(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.lastWeeklyNum_ = input.readInt64();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_UploadAliveNum_4257_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_UploadAliveNum_4257_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadAliveNum_4257.class, Builder.class);
      }

      public boolean hasLastWeeklyNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public long getLastWeeklyNum() {
         return this.lastWeeklyNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasLastWeeklyNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt64(1, this.lastWeeklyNum_);
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
               size += CodedOutputStream.computeInt64Size(1, this.lastWeeklyNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadAliveNum_4257)) {
            return super.equals(obj);
         } else {
            S2CR_UploadAliveNum_4257 other = (S2CR_UploadAliveNum_4257)obj;
            if (this.hasLastWeeklyNum() != other.hasLastWeeklyNum()) {
               return false;
            } else if (this.hasLastWeeklyNum() && this.getLastWeeklyNum() != other.getLastWeeklyNum()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasLastWeeklyNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashLong(this.getLastWeeklyNum());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadAliveNum_4257 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadAliveNum_4257)PARSER.parseFrom(data);
      }

      public static S2CR_UploadAliveNum_4257 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadAliveNum_4257)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadAliveNum_4257 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadAliveNum_4257)PARSER.parseFrom(data);
      }

      public static S2CR_UploadAliveNum_4257 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadAliveNum_4257)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadAliveNum_4257 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadAliveNum_4257)PARSER.parseFrom(data);
      }

      public static S2CR_UploadAliveNum_4257 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadAliveNum_4257)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadAliveNum_4257 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadAliveNum_4257)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadAliveNum_4257 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadAliveNum_4257)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadAliveNum_4257 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadAliveNum_4257)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadAliveNum_4257 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadAliveNum_4257)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadAliveNum_4257 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadAliveNum_4257)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadAliveNum_4257 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadAliveNum_4257)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadAliveNum_4257 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadAliveNum_4257 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadAliveNum_4257> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadAliveNum_4257> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadAliveNum_4257 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadAliveNum_4257OrBuilder {
         private int bitField0_;
         private long lastWeeklyNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_UploadAliveNum_4257_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_UploadAliveNum_4257_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadAliveNum_4257.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_UploadAliveNum_4257.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.lastWeeklyNum_ = 0L;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_UploadAliveNum_4257_descriptor;
         }

         public S2CR_UploadAliveNum_4257 getDefaultInstanceForType() {
            return CrossMsg.S2CR_UploadAliveNum_4257.getDefaultInstance();
         }

         public S2CR_UploadAliveNum_4257 build() {
            S2CR_UploadAliveNum_4257 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadAliveNum_4257 buildPartial() {
            S2CR_UploadAliveNum_4257 result = new S2CR_UploadAliveNum_4257(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.lastWeeklyNum_ = this.lastWeeklyNum_;
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
            if (other instanceof S2CR_UploadAliveNum_4257) {
               return this.mergeFrom((S2CR_UploadAliveNum_4257)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadAliveNum_4257 other) {
            if (other == CrossMsg.S2CR_UploadAliveNum_4257.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasLastWeeklyNum()) {
                  this.setLastWeeklyNum(other.getLastWeeklyNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasLastWeeklyNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadAliveNum_4257 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadAliveNum_4257)CrossMsg.S2CR_UploadAliveNum_4257.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadAliveNum_4257)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasLastWeeklyNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public long getLastWeeklyNum() {
            return this.lastWeeklyNum_;
         }

         public Builder setLastWeeklyNum(long value) {
            this.bitField0_ |= 1;
            this.lastWeeklyNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLastWeeklyNum() {
            this.bitField0_ &= -2;
            this.lastWeeklyNum_ = 0L;
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

   public static final class CR2S_UploadAliveNum_4258 extends GeneratedMessageV3 implements CR2S_UploadAliveNum_4258OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final CR2S_UploadAliveNum_4258 DEFAULT_INSTANCE = new CR2S_UploadAliveNum_4258();
      /** @deprecated */
      @Deprecated
      public static final Parser<CR2S_UploadAliveNum_4258> PARSER = new AbstractParser<CR2S_UploadAliveNum_4258>() {
         public CR2S_UploadAliveNum_4258 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CR2S_UploadAliveNum_4258(input, extensionRegistry);
         }
      };

      private CR2S_UploadAliveNum_4258(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CR2S_UploadAliveNum_4258() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CR2S_UploadAliveNum_4258();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CR2S_UploadAliveNum_4258(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return CrossMsg.internal_static_common_CR2S_UploadAliveNum_4258_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_CR2S_UploadAliveNum_4258_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UploadAliveNum_4258.class, Builder.class);
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
         } else if (!(obj instanceof CR2S_UploadAliveNum_4258)) {
            return super.equals(obj);
         } else {
            CR2S_UploadAliveNum_4258 other = (CR2S_UploadAliveNum_4258)obj;
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

      public static CR2S_UploadAliveNum_4258 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CR2S_UploadAliveNum_4258)PARSER.parseFrom(data);
      }

      public static CR2S_UploadAliveNum_4258 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UploadAliveNum_4258)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UploadAliveNum_4258 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CR2S_UploadAliveNum_4258)PARSER.parseFrom(data);
      }

      public static CR2S_UploadAliveNum_4258 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UploadAliveNum_4258)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UploadAliveNum_4258 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CR2S_UploadAliveNum_4258)PARSER.parseFrom(data);
      }

      public static CR2S_UploadAliveNum_4258 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CR2S_UploadAliveNum_4258)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CR2S_UploadAliveNum_4258 parseFrom(InputStream input) throws IOException {
         return (CR2S_UploadAliveNum_4258)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UploadAliveNum_4258 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UploadAliveNum_4258)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UploadAliveNum_4258 parseDelimitedFrom(InputStream input) throws IOException {
         return (CR2S_UploadAliveNum_4258)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CR2S_UploadAliveNum_4258 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UploadAliveNum_4258)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CR2S_UploadAliveNum_4258 parseFrom(CodedInputStream input) throws IOException {
         return (CR2S_UploadAliveNum_4258)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CR2S_UploadAliveNum_4258 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CR2S_UploadAliveNum_4258)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CR2S_UploadAliveNum_4258 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CR2S_UploadAliveNum_4258 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CR2S_UploadAliveNum_4258> parser() {
         return PARSER;
      }

      public Parser<CR2S_UploadAliveNum_4258> getParserForType() {
         return PARSER;
      }

      public CR2S_UploadAliveNum_4258 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CR2S_UploadAliveNum_4258OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_CR2S_UploadAliveNum_4258_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_CR2S_UploadAliveNum_4258_fieldAccessorTable.ensureFieldAccessorsInitialized(CR2S_UploadAliveNum_4258.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.CR2S_UploadAliveNum_4258.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_CR2S_UploadAliveNum_4258_descriptor;
         }

         public CR2S_UploadAliveNum_4258 getDefaultInstanceForType() {
            return CrossMsg.CR2S_UploadAliveNum_4258.getDefaultInstance();
         }

         public CR2S_UploadAliveNum_4258 build() {
            CR2S_UploadAliveNum_4258 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CR2S_UploadAliveNum_4258 buildPartial() {
            CR2S_UploadAliveNum_4258 result = new CR2S_UploadAliveNum_4258(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof CR2S_UploadAliveNum_4258) {
               return this.mergeFrom((CR2S_UploadAliveNum_4258)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CR2S_UploadAliveNum_4258 other) {
            if (other == CrossMsg.CR2S_UploadAliveNum_4258.getDefaultInstance()) {
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
            CR2S_UploadAliveNum_4258 parsedMessage = null;

            try {
               parsedMessage = (CR2S_UploadAliveNum_4258)CrossMsg.CR2S_UploadAliveNum_4258.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CR2S_UploadAliveNum_4258)e.getUnfinishedMessage();
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

   public static final class S2CR_UploadGoldWeekRecord_4259 extends GeneratedMessageV3 implements S2CR_UploadGoldWeekRecord_4259OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERNAME_FIELD_NUMBER = 1;
      private volatile Object playerName_;
      public static final int BELOVEDITEMID_FIELD_NUMBER = 2;
      private int belovedItemId_;
      public static final int STAGE_FIELD_NUMBER = 3;
      private int stage_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadGoldWeekRecord_4259 DEFAULT_INSTANCE = new S2CR_UploadGoldWeekRecord_4259();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadGoldWeekRecord_4259> PARSER = new AbstractParser<S2CR_UploadGoldWeekRecord_4259>() {
         public S2CR_UploadGoldWeekRecord_4259 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadGoldWeekRecord_4259(input, extensionRegistry);
         }
      };

      private S2CR_UploadGoldWeekRecord_4259(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadGoldWeekRecord_4259() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadGoldWeekRecord_4259();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadGoldWeekRecord_4259(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.playerName_ = bs;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.belovedItemId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.stage_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_UploadGoldWeekRecord_4259_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_UploadGoldWeekRecord_4259_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadGoldWeekRecord_4259.class, Builder.class);
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 1) != 0;
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

      public boolean hasBelovedItemId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBelovedItemId() {
         return this.belovedItemId_;
      }

      public boolean hasStage() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBelovedItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.playerName_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.belovedItemId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.stage_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.playerName_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.belovedItemId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.stage_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadGoldWeekRecord_4259)) {
            return super.equals(obj);
         } else {
            S2CR_UploadGoldWeekRecord_4259 other = (S2CR_UploadGoldWeekRecord_4259)obj;
            if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasBelovedItemId() != other.hasBelovedItemId()) {
               return false;
            } else if (this.hasBelovedItemId() && this.getBelovedItemId() != other.getBelovedItemId()) {
               return false;
            } else if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPlayerName()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasBelovedItemId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBelovedItemId();
            }

            if (this.hasStage()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getStage();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadGoldWeekRecord_4259 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadGoldWeekRecord_4259)PARSER.parseFrom(data);
      }

      public static S2CR_UploadGoldWeekRecord_4259 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadGoldWeekRecord_4259)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadGoldWeekRecord_4259 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadGoldWeekRecord_4259)PARSER.parseFrom(data);
      }

      public static S2CR_UploadGoldWeekRecord_4259 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadGoldWeekRecord_4259)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadGoldWeekRecord_4259 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadGoldWeekRecord_4259)PARSER.parseFrom(data);
      }

      public static S2CR_UploadGoldWeekRecord_4259 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadGoldWeekRecord_4259)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadGoldWeekRecord_4259 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadGoldWeekRecord_4259)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadGoldWeekRecord_4259 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadGoldWeekRecord_4259)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadGoldWeekRecord_4259 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadGoldWeekRecord_4259)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadGoldWeekRecord_4259 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadGoldWeekRecord_4259)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadGoldWeekRecord_4259 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadGoldWeekRecord_4259)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadGoldWeekRecord_4259 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadGoldWeekRecord_4259)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadGoldWeekRecord_4259 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadGoldWeekRecord_4259 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadGoldWeekRecord_4259> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadGoldWeekRecord_4259> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadGoldWeekRecord_4259 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadGoldWeekRecord_4259OrBuilder {
         private int bitField0_;
         private Object playerName_;
         private int belovedItemId_;
         private int stage_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_UploadGoldWeekRecord_4259_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_UploadGoldWeekRecord_4259_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadGoldWeekRecord_4259.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_UploadGoldWeekRecord_4259.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerName_ = "";
            this.bitField0_ &= -2;
            this.belovedItemId_ = 0;
            this.bitField0_ &= -3;
            this.stage_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_UploadGoldWeekRecord_4259_descriptor;
         }

         public S2CR_UploadGoldWeekRecord_4259 getDefaultInstanceForType() {
            return CrossMsg.S2CR_UploadGoldWeekRecord_4259.getDefaultInstance();
         }

         public S2CR_UploadGoldWeekRecord_4259 build() {
            S2CR_UploadGoldWeekRecord_4259 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadGoldWeekRecord_4259 buildPartial() {
            S2CR_UploadGoldWeekRecord_4259 result = new S2CR_UploadGoldWeekRecord_4259(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 2) != 0) {
               result.belovedItemId_ = this.belovedItemId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.stage_ = this.stage_;
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
            if (other instanceof S2CR_UploadGoldWeekRecord_4259) {
               return this.mergeFrom((S2CR_UploadGoldWeekRecord_4259)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadGoldWeekRecord_4259 other) {
            if (other == CrossMsg.S2CR_UploadGoldWeekRecord_4259.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerName()) {
                  this.bitField0_ |= 1;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasBelovedItemId()) {
                  this.setBelovedItemId(other.getBelovedItemId());
               }

               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasBelovedItemId()) {
               return false;
            } else {
               return this.hasStage();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadGoldWeekRecord_4259 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadGoldWeekRecord_4259)CrossMsg.S2CR_UploadGoldWeekRecord_4259.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadGoldWeekRecord_4259)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 1) != 0;
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
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -2;
            this.playerName_ = CrossMsg.S2CR_UploadGoldWeekRecord_4259.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasBelovedItemId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBelovedItemId() {
            return this.belovedItemId_;
         }

         public Builder setBelovedItemId(int value) {
            this.bitField0_ |= 2;
            this.belovedItemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBelovedItemId() {
            this.bitField0_ &= -3;
            this.belovedItemId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 4;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -5;
            this.stage_ = 0;
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

   public static final class S2CR_UploadSplendidCityRecord_4260 extends GeneratedMessageV3 implements S2CR_UploadSplendidCityRecord_4260OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERNAME_FIELD_NUMBER = 1;
      private volatile Object playerName_;
      public static final int BELOVEDITEMID_FIELD_NUMBER = 2;
      private int belovedItemId_;
      public static final int STAGE_FIELD_NUMBER = 3;
      private int stage_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadSplendidCityRecord_4260 DEFAULT_INSTANCE = new S2CR_UploadSplendidCityRecord_4260();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadSplendidCityRecord_4260> PARSER = new AbstractParser<S2CR_UploadSplendidCityRecord_4260>() {
         public S2CR_UploadSplendidCityRecord_4260 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadSplendidCityRecord_4260(input, extensionRegistry);
         }
      };

      private S2CR_UploadSplendidCityRecord_4260(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadSplendidCityRecord_4260() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadSplendidCityRecord_4260();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadSplendidCityRecord_4260(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.playerName_ = bs;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.belovedItemId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.stage_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_UploadSplendidCityRecord_4260_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_UploadSplendidCityRecord_4260_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadSplendidCityRecord_4260.class, Builder.class);
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 1) != 0;
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

      public boolean hasBelovedItemId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBelovedItemId() {
         return this.belovedItemId_;
      }

      public boolean hasStage() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBelovedItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.playerName_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.belovedItemId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.stage_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.playerName_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.belovedItemId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.stage_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadSplendidCityRecord_4260)) {
            return super.equals(obj);
         } else {
            S2CR_UploadSplendidCityRecord_4260 other = (S2CR_UploadSplendidCityRecord_4260)obj;
            if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasBelovedItemId() != other.hasBelovedItemId()) {
               return false;
            } else if (this.hasBelovedItemId() && this.getBelovedItemId() != other.getBelovedItemId()) {
               return false;
            } else if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPlayerName()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasBelovedItemId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBelovedItemId();
            }

            if (this.hasStage()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getStage();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadSplendidCityRecord_4260 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadSplendidCityRecord_4260)PARSER.parseFrom(data);
      }

      public static S2CR_UploadSplendidCityRecord_4260 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadSplendidCityRecord_4260)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadSplendidCityRecord_4260 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadSplendidCityRecord_4260)PARSER.parseFrom(data);
      }

      public static S2CR_UploadSplendidCityRecord_4260 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadSplendidCityRecord_4260)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadSplendidCityRecord_4260 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadSplendidCityRecord_4260)PARSER.parseFrom(data);
      }

      public static S2CR_UploadSplendidCityRecord_4260 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadSplendidCityRecord_4260)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadSplendidCityRecord_4260 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadSplendidCityRecord_4260)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadSplendidCityRecord_4260 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadSplendidCityRecord_4260)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadSplendidCityRecord_4260 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadSplendidCityRecord_4260)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadSplendidCityRecord_4260 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadSplendidCityRecord_4260)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadSplendidCityRecord_4260 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadSplendidCityRecord_4260)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadSplendidCityRecord_4260 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadSplendidCityRecord_4260)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadSplendidCityRecord_4260 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadSplendidCityRecord_4260 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadSplendidCityRecord_4260> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadSplendidCityRecord_4260> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadSplendidCityRecord_4260 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadSplendidCityRecord_4260OrBuilder {
         private int bitField0_;
         private Object playerName_;
         private int belovedItemId_;
         private int stage_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_UploadSplendidCityRecord_4260_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_UploadSplendidCityRecord_4260_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadSplendidCityRecord_4260.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_UploadSplendidCityRecord_4260.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerName_ = "";
            this.bitField0_ &= -2;
            this.belovedItemId_ = 0;
            this.bitField0_ &= -3;
            this.stage_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_UploadSplendidCityRecord_4260_descriptor;
         }

         public S2CR_UploadSplendidCityRecord_4260 getDefaultInstanceForType() {
            return CrossMsg.S2CR_UploadSplendidCityRecord_4260.getDefaultInstance();
         }

         public S2CR_UploadSplendidCityRecord_4260 build() {
            S2CR_UploadSplendidCityRecord_4260 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadSplendidCityRecord_4260 buildPartial() {
            S2CR_UploadSplendidCityRecord_4260 result = new S2CR_UploadSplendidCityRecord_4260(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 2) != 0) {
               result.belovedItemId_ = this.belovedItemId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.stage_ = this.stage_;
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
            if (other instanceof S2CR_UploadSplendidCityRecord_4260) {
               return this.mergeFrom((S2CR_UploadSplendidCityRecord_4260)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadSplendidCityRecord_4260 other) {
            if (other == CrossMsg.S2CR_UploadSplendidCityRecord_4260.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerName()) {
                  this.bitField0_ |= 1;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasBelovedItemId()) {
                  this.setBelovedItemId(other.getBelovedItemId());
               }

               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasBelovedItemId()) {
               return false;
            } else {
               return this.hasStage();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadSplendidCityRecord_4260 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadSplendidCityRecord_4260)CrossMsg.S2CR_UploadSplendidCityRecord_4260.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadSplendidCityRecord_4260)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 1) != 0;
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
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -2;
            this.playerName_ = CrossMsg.S2CR_UploadSplendidCityRecord_4260.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasBelovedItemId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBelovedItemId() {
            return this.belovedItemId_;
         }

         public Builder setBelovedItemId(int value) {
            this.bitField0_ |= 2;
            this.belovedItemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBelovedItemId() {
            this.bitField0_ &= -3;
            this.belovedItemId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 4;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -5;
            this.stage_ = 0;
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

   public static final class S2CR_UploadChildRecord_4261 extends GeneratedMessageV3 implements S2CR_UploadChildRecord_4261OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERNAME_FIELD_NUMBER = 1;
      private volatile Object playerName_;
      public static final int BELOVEDITEMID_FIELD_NUMBER = 2;
      private int belovedItemId_;
      public static final int STAGE_FIELD_NUMBER = 3;
      private int stage_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadChildRecord_4261 DEFAULT_INSTANCE = new S2CR_UploadChildRecord_4261();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadChildRecord_4261> PARSER = new AbstractParser<S2CR_UploadChildRecord_4261>() {
         public S2CR_UploadChildRecord_4261 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadChildRecord_4261(input, extensionRegistry);
         }
      };

      private S2CR_UploadChildRecord_4261(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadChildRecord_4261() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadChildRecord_4261();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadChildRecord_4261(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.playerName_ = bs;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.belovedItemId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.stage_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_UploadChildRecord_4261_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_UploadChildRecord_4261_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadChildRecord_4261.class, Builder.class);
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 1) != 0;
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

      public boolean hasBelovedItemId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBelovedItemId() {
         return this.belovedItemId_;
      }

      public boolean hasStage() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBelovedItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.playerName_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.belovedItemId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.stage_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.playerName_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.belovedItemId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.stage_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadChildRecord_4261)) {
            return super.equals(obj);
         } else {
            S2CR_UploadChildRecord_4261 other = (S2CR_UploadChildRecord_4261)obj;
            if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasBelovedItemId() != other.hasBelovedItemId()) {
               return false;
            } else if (this.hasBelovedItemId() && this.getBelovedItemId() != other.getBelovedItemId()) {
               return false;
            } else if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPlayerName()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasBelovedItemId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBelovedItemId();
            }

            if (this.hasStage()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getStage();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadChildRecord_4261 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadChildRecord_4261)PARSER.parseFrom(data);
      }

      public static S2CR_UploadChildRecord_4261 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadChildRecord_4261)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadChildRecord_4261 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadChildRecord_4261)PARSER.parseFrom(data);
      }

      public static S2CR_UploadChildRecord_4261 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadChildRecord_4261)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadChildRecord_4261 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadChildRecord_4261)PARSER.parseFrom(data);
      }

      public static S2CR_UploadChildRecord_4261 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadChildRecord_4261)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadChildRecord_4261 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadChildRecord_4261)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadChildRecord_4261 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadChildRecord_4261)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadChildRecord_4261 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadChildRecord_4261)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadChildRecord_4261 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadChildRecord_4261)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadChildRecord_4261 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadChildRecord_4261)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadChildRecord_4261 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadChildRecord_4261)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadChildRecord_4261 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadChildRecord_4261 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadChildRecord_4261> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadChildRecord_4261> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadChildRecord_4261 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadChildRecord_4261OrBuilder {
         private int bitField0_;
         private Object playerName_;
         private int belovedItemId_;
         private int stage_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_UploadChildRecord_4261_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_UploadChildRecord_4261_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadChildRecord_4261.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_UploadChildRecord_4261.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerName_ = "";
            this.bitField0_ &= -2;
            this.belovedItemId_ = 0;
            this.bitField0_ &= -3;
            this.stage_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_UploadChildRecord_4261_descriptor;
         }

         public S2CR_UploadChildRecord_4261 getDefaultInstanceForType() {
            return CrossMsg.S2CR_UploadChildRecord_4261.getDefaultInstance();
         }

         public S2CR_UploadChildRecord_4261 build() {
            S2CR_UploadChildRecord_4261 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadChildRecord_4261 buildPartial() {
            S2CR_UploadChildRecord_4261 result = new S2CR_UploadChildRecord_4261(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 2) != 0) {
               result.belovedItemId_ = this.belovedItemId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.stage_ = this.stage_;
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
            if (other instanceof S2CR_UploadChildRecord_4261) {
               return this.mergeFrom((S2CR_UploadChildRecord_4261)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadChildRecord_4261 other) {
            if (other == CrossMsg.S2CR_UploadChildRecord_4261.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerName()) {
                  this.bitField0_ |= 1;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasBelovedItemId()) {
                  this.setBelovedItemId(other.getBelovedItemId());
               }

               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasBelovedItemId()) {
               return false;
            } else {
               return this.hasStage();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadChildRecord_4261 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadChildRecord_4261)CrossMsg.S2CR_UploadChildRecord_4261.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadChildRecord_4261)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 1) != 0;
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
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -2;
            this.playerName_ = CrossMsg.S2CR_UploadChildRecord_4261.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasBelovedItemId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBelovedItemId() {
            return this.belovedItemId_;
         }

         public Builder setBelovedItemId(int value) {
            this.bitField0_ |= 2;
            this.belovedItemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBelovedItemId() {
            this.bitField0_ &= -3;
            this.belovedItemId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 4;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -5;
            this.stage_ = 0;
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

   public static final class S2CR_UploadGetFlowerData_4262 extends GeneratedMessageV3 implements S2CR_UploadGetFlowerData_4262OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int SENDPLAYERID_FIELD_NUMBER = 1;
      private int sendPlayerId_;
      public static final int SENDFLOWERNUM_FIELD_NUMBER = 2;
      private int sendFlowerNum_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadGetFlowerData_4262 DEFAULT_INSTANCE = new S2CR_UploadGetFlowerData_4262();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadGetFlowerData_4262> PARSER = new AbstractParser<S2CR_UploadGetFlowerData_4262>() {
         public S2CR_UploadGetFlowerData_4262 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadGetFlowerData_4262(input, extensionRegistry);
         }
      };

      private S2CR_UploadGetFlowerData_4262(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadGetFlowerData_4262() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadGetFlowerData_4262();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadGetFlowerData_4262(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.sendPlayerId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.sendFlowerNum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_UploadGetFlowerData_4262_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_UploadGetFlowerData_4262_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadGetFlowerData_4262.class, Builder.class);
      }

      public boolean hasSendPlayerId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getSendPlayerId() {
         return this.sendPlayerId_;
      }

      public boolean hasSendFlowerNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSendFlowerNum() {
         return this.sendFlowerNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasSendPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSendFlowerNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.sendPlayerId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.sendFlowerNum_);
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
               size += CodedOutputStream.computeInt32Size(1, this.sendPlayerId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.sendFlowerNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadGetFlowerData_4262)) {
            return super.equals(obj);
         } else {
            S2CR_UploadGetFlowerData_4262 other = (S2CR_UploadGetFlowerData_4262)obj;
            if (this.hasSendPlayerId() != other.hasSendPlayerId()) {
               return false;
            } else if (this.hasSendPlayerId() && this.getSendPlayerId() != other.getSendPlayerId()) {
               return false;
            } else if (this.hasSendFlowerNum() != other.hasSendFlowerNum()) {
               return false;
            } else if (this.hasSendFlowerNum() && this.getSendFlowerNum() != other.getSendFlowerNum()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasSendPlayerId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getSendPlayerId();
            }

            if (this.hasSendFlowerNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSendFlowerNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadGetFlowerData_4262 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadGetFlowerData_4262)PARSER.parseFrom(data);
      }

      public static S2CR_UploadGetFlowerData_4262 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadGetFlowerData_4262)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadGetFlowerData_4262 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadGetFlowerData_4262)PARSER.parseFrom(data);
      }

      public static S2CR_UploadGetFlowerData_4262 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadGetFlowerData_4262)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadGetFlowerData_4262 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadGetFlowerData_4262)PARSER.parseFrom(data);
      }

      public static S2CR_UploadGetFlowerData_4262 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadGetFlowerData_4262)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadGetFlowerData_4262 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadGetFlowerData_4262)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadGetFlowerData_4262 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadGetFlowerData_4262)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadGetFlowerData_4262 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadGetFlowerData_4262)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadGetFlowerData_4262 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadGetFlowerData_4262)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadGetFlowerData_4262 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadGetFlowerData_4262)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadGetFlowerData_4262 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadGetFlowerData_4262)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadGetFlowerData_4262 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadGetFlowerData_4262 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadGetFlowerData_4262> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadGetFlowerData_4262> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadGetFlowerData_4262 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadGetFlowerData_4262OrBuilder {
         private int bitField0_;
         private int sendPlayerId_;
         private int sendFlowerNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_UploadGetFlowerData_4262_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_UploadGetFlowerData_4262_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadGetFlowerData_4262.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_UploadGetFlowerData_4262.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.sendPlayerId_ = 0;
            this.bitField0_ &= -2;
            this.sendFlowerNum_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_UploadGetFlowerData_4262_descriptor;
         }

         public S2CR_UploadGetFlowerData_4262 getDefaultInstanceForType() {
            return CrossMsg.S2CR_UploadGetFlowerData_4262.getDefaultInstance();
         }

         public S2CR_UploadGetFlowerData_4262 build() {
            S2CR_UploadGetFlowerData_4262 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadGetFlowerData_4262 buildPartial() {
            S2CR_UploadGetFlowerData_4262 result = new S2CR_UploadGetFlowerData_4262(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.sendPlayerId_ = this.sendPlayerId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.sendFlowerNum_ = this.sendFlowerNum_;
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
            if (other instanceof S2CR_UploadGetFlowerData_4262) {
               return this.mergeFrom((S2CR_UploadGetFlowerData_4262)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadGetFlowerData_4262 other) {
            if (other == CrossMsg.S2CR_UploadGetFlowerData_4262.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasSendPlayerId()) {
                  this.setSendPlayerId(other.getSendPlayerId());
               }

               if (other.hasSendFlowerNum()) {
                  this.setSendFlowerNum(other.getSendFlowerNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasSendPlayerId()) {
               return false;
            } else {
               return this.hasSendFlowerNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadGetFlowerData_4262 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadGetFlowerData_4262)CrossMsg.S2CR_UploadGetFlowerData_4262.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadGetFlowerData_4262)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasSendPlayerId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getSendPlayerId() {
            return this.sendPlayerId_;
         }

         public Builder setSendPlayerId(int value) {
            this.bitField0_ |= 1;
            this.sendPlayerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSendPlayerId() {
            this.bitField0_ &= -2;
            this.sendPlayerId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSendFlowerNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSendFlowerNum() {
            return this.sendFlowerNum_;
         }

         public Builder setSendFlowerNum(int value) {
            this.bitField0_ |= 2;
            this.sendFlowerNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSendFlowerNum() {
            this.bitField0_ &= -3;
            this.sendFlowerNum_ = 0;
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

   public static final class S2CR_UploadBroodDrawData_4263 extends GeneratedMessageV3 implements S2CR_UploadBroodDrawData_4263OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERNAME_FIELD_NUMBER = 1;
      private volatile Object playerName_;
      public static final int BELOVEDITEMID_FIELD_NUMBER = 2;
      private int belovedItemId_;
      public static final int STAGE_FIELD_NUMBER = 3;
      private int stage_;
      public static final int SLOTTYPE_FIELD_NUMBER = 4;
      private int slotType_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadBroodDrawData_4263 DEFAULT_INSTANCE = new S2CR_UploadBroodDrawData_4263();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadBroodDrawData_4263> PARSER = new AbstractParser<S2CR_UploadBroodDrawData_4263>() {
         public S2CR_UploadBroodDrawData_4263 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadBroodDrawData_4263(input, extensionRegistry);
         }
      };

      private S2CR_UploadBroodDrawData_4263(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadBroodDrawData_4263() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadBroodDrawData_4263();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadBroodDrawData_4263(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.playerName_ = bs;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.belovedItemId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.stage_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.slotType_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_UploadBroodDrawData_4263_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_UploadBroodDrawData_4263_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadBroodDrawData_4263.class, Builder.class);
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 1) != 0;
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

      public boolean hasBelovedItemId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBelovedItemId() {
         return this.belovedItemId_;
      }

      public boolean hasStage() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public boolean hasSlotType() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getSlotType() {
         return this.slotType_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBelovedItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSlotType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.playerName_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.belovedItemId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.stage_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.slotType_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.playerName_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.belovedItemId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.stage_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.slotType_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadBroodDrawData_4263)) {
            return super.equals(obj);
         } else {
            S2CR_UploadBroodDrawData_4263 other = (S2CR_UploadBroodDrawData_4263)obj;
            if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasBelovedItemId() != other.hasBelovedItemId()) {
               return false;
            } else if (this.hasBelovedItemId() && this.getBelovedItemId() != other.getBelovedItemId()) {
               return false;
            } else if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else if (this.hasSlotType() != other.hasSlotType()) {
               return false;
            } else if (this.hasSlotType() && this.getSlotType() != other.getSlotType()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPlayerName()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasBelovedItemId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBelovedItemId();
            }

            if (this.hasStage()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getStage();
            }

            if (this.hasSlotType()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getSlotType();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadBroodDrawData_4263 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadBroodDrawData_4263)PARSER.parseFrom(data);
      }

      public static S2CR_UploadBroodDrawData_4263 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadBroodDrawData_4263)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadBroodDrawData_4263 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadBroodDrawData_4263)PARSER.parseFrom(data);
      }

      public static S2CR_UploadBroodDrawData_4263 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadBroodDrawData_4263)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadBroodDrawData_4263 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadBroodDrawData_4263)PARSER.parseFrom(data);
      }

      public static S2CR_UploadBroodDrawData_4263 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadBroodDrawData_4263)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadBroodDrawData_4263 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadBroodDrawData_4263)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadBroodDrawData_4263 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadBroodDrawData_4263)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadBroodDrawData_4263 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadBroodDrawData_4263)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadBroodDrawData_4263 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadBroodDrawData_4263)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadBroodDrawData_4263 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadBroodDrawData_4263)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadBroodDrawData_4263 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadBroodDrawData_4263)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadBroodDrawData_4263 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadBroodDrawData_4263 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadBroodDrawData_4263> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadBroodDrawData_4263> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadBroodDrawData_4263 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadBroodDrawData_4263OrBuilder {
         private int bitField0_;
         private Object playerName_;
         private int belovedItemId_;
         private int stage_;
         private int slotType_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_UploadBroodDrawData_4263_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_UploadBroodDrawData_4263_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadBroodDrawData_4263.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_UploadBroodDrawData_4263.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerName_ = "";
            this.bitField0_ &= -2;
            this.belovedItemId_ = 0;
            this.bitField0_ &= -3;
            this.stage_ = 0;
            this.bitField0_ &= -5;
            this.slotType_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_UploadBroodDrawData_4263_descriptor;
         }

         public S2CR_UploadBroodDrawData_4263 getDefaultInstanceForType() {
            return CrossMsg.S2CR_UploadBroodDrawData_4263.getDefaultInstance();
         }

         public S2CR_UploadBroodDrawData_4263 build() {
            S2CR_UploadBroodDrawData_4263 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadBroodDrawData_4263 buildPartial() {
            S2CR_UploadBroodDrawData_4263 result = new S2CR_UploadBroodDrawData_4263(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 2) != 0) {
               result.belovedItemId_ = this.belovedItemId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.stage_ = this.stage_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.slotType_ = this.slotType_;
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
            if (other instanceof S2CR_UploadBroodDrawData_4263) {
               return this.mergeFrom((S2CR_UploadBroodDrawData_4263)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadBroodDrawData_4263 other) {
            if (other == CrossMsg.S2CR_UploadBroodDrawData_4263.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerName()) {
                  this.bitField0_ |= 1;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasBelovedItemId()) {
                  this.setBelovedItemId(other.getBelovedItemId());
               }

               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               if (other.hasSlotType()) {
                  this.setSlotType(other.getSlotType());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasBelovedItemId()) {
               return false;
            } else if (!this.hasStage()) {
               return false;
            } else {
               return this.hasSlotType();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadBroodDrawData_4263 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadBroodDrawData_4263)CrossMsg.S2CR_UploadBroodDrawData_4263.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadBroodDrawData_4263)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 1) != 0;
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
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -2;
            this.playerName_ = CrossMsg.S2CR_UploadBroodDrawData_4263.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasBelovedItemId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBelovedItemId() {
            return this.belovedItemId_;
         }

         public Builder setBelovedItemId(int value) {
            this.bitField0_ |= 2;
            this.belovedItemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBelovedItemId() {
            this.bitField0_ &= -3;
            this.belovedItemId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 4;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -5;
            this.stage_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSlotType() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getSlotType() {
            return this.slotType_;
         }

         public Builder setSlotType(int value) {
            this.bitField0_ |= 8;
            this.slotType_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSlotType() {
            this.bitField0_ &= -9;
            this.slotType_ = 0;
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

   public static final class S2CR_UploadSummerRecord_4264 extends GeneratedMessageV3 implements S2CR_UploadSummerRecord_4264OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERNAME_FIELD_NUMBER = 1;
      private volatile Object playerName_;
      public static final int BELOVEDITEMID_FIELD_NUMBER = 2;
      private int belovedItemId_;
      public static final int STAGE_FIELD_NUMBER = 3;
      private int stage_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadSummerRecord_4264 DEFAULT_INSTANCE = new S2CR_UploadSummerRecord_4264();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadSummerRecord_4264> PARSER = new AbstractParser<S2CR_UploadSummerRecord_4264>() {
         public S2CR_UploadSummerRecord_4264 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadSummerRecord_4264(input, extensionRegistry);
         }
      };

      private S2CR_UploadSummerRecord_4264(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadSummerRecord_4264() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadSummerRecord_4264();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadSummerRecord_4264(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.playerName_ = bs;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.belovedItemId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.stage_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_UploadSummerRecord_4264_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_UploadSummerRecord_4264_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadSummerRecord_4264.class, Builder.class);
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 1) != 0;
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

      public boolean hasBelovedItemId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBelovedItemId() {
         return this.belovedItemId_;
      }

      public boolean hasStage() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBelovedItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.playerName_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.belovedItemId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.stage_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.playerName_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.belovedItemId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.stage_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadSummerRecord_4264)) {
            return super.equals(obj);
         } else {
            S2CR_UploadSummerRecord_4264 other = (S2CR_UploadSummerRecord_4264)obj;
            if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasBelovedItemId() != other.hasBelovedItemId()) {
               return false;
            } else if (this.hasBelovedItemId() && this.getBelovedItemId() != other.getBelovedItemId()) {
               return false;
            } else if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPlayerName()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasBelovedItemId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBelovedItemId();
            }

            if (this.hasStage()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getStage();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadSummerRecord_4264 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadSummerRecord_4264)PARSER.parseFrom(data);
      }

      public static S2CR_UploadSummerRecord_4264 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadSummerRecord_4264)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadSummerRecord_4264 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadSummerRecord_4264)PARSER.parseFrom(data);
      }

      public static S2CR_UploadSummerRecord_4264 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadSummerRecord_4264)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadSummerRecord_4264 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadSummerRecord_4264)PARSER.parseFrom(data);
      }

      public static S2CR_UploadSummerRecord_4264 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadSummerRecord_4264)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadSummerRecord_4264 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadSummerRecord_4264)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadSummerRecord_4264 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadSummerRecord_4264)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadSummerRecord_4264 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadSummerRecord_4264)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadSummerRecord_4264 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadSummerRecord_4264)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadSummerRecord_4264 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadSummerRecord_4264)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadSummerRecord_4264 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadSummerRecord_4264)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadSummerRecord_4264 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadSummerRecord_4264 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadSummerRecord_4264> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadSummerRecord_4264> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadSummerRecord_4264 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadSummerRecord_4264OrBuilder {
         private int bitField0_;
         private Object playerName_;
         private int belovedItemId_;
         private int stage_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_UploadSummerRecord_4264_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_UploadSummerRecord_4264_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadSummerRecord_4264.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_UploadSummerRecord_4264.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerName_ = "";
            this.bitField0_ &= -2;
            this.belovedItemId_ = 0;
            this.bitField0_ &= -3;
            this.stage_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_UploadSummerRecord_4264_descriptor;
         }

         public S2CR_UploadSummerRecord_4264 getDefaultInstanceForType() {
            return CrossMsg.S2CR_UploadSummerRecord_4264.getDefaultInstance();
         }

         public S2CR_UploadSummerRecord_4264 build() {
            S2CR_UploadSummerRecord_4264 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadSummerRecord_4264 buildPartial() {
            S2CR_UploadSummerRecord_4264 result = new S2CR_UploadSummerRecord_4264(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 2) != 0) {
               result.belovedItemId_ = this.belovedItemId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.stage_ = this.stage_;
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
            if (other instanceof S2CR_UploadSummerRecord_4264) {
               return this.mergeFrom((S2CR_UploadSummerRecord_4264)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadSummerRecord_4264 other) {
            if (other == CrossMsg.S2CR_UploadSummerRecord_4264.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerName()) {
                  this.bitField0_ |= 1;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasBelovedItemId()) {
                  this.setBelovedItemId(other.getBelovedItemId());
               }

               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasBelovedItemId()) {
               return false;
            } else {
               return this.hasStage();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadSummerRecord_4264 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadSummerRecord_4264)CrossMsg.S2CR_UploadSummerRecord_4264.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadSummerRecord_4264)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 1) != 0;
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
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -2;
            this.playerName_ = CrossMsg.S2CR_UploadSummerRecord_4264.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasBelovedItemId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBelovedItemId() {
            return this.belovedItemId_;
         }

         public Builder setBelovedItemId(int value) {
            this.bitField0_ |= 2;
            this.belovedItemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBelovedItemId() {
            this.bitField0_ &= -3;
            this.belovedItemId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 4;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -5;
            this.stage_ = 0;
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

   public static final class S2CR_UploadWinterRecord_4265 extends GeneratedMessageV3 implements S2CR_UploadWinterRecord_4265OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PLAYERNAME_FIELD_NUMBER = 1;
      private volatile Object playerName_;
      public static final int BELOVEDITEMID_FIELD_NUMBER = 2;
      private int belovedItemId_;
      public static final int STAGE_FIELD_NUMBER = 3;
      private int stage_;
      private byte memoizedIsInitialized;
      private static final S2CR_UploadWinterRecord_4265 DEFAULT_INSTANCE = new S2CR_UploadWinterRecord_4265();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2CR_UploadWinterRecord_4265> PARSER = new AbstractParser<S2CR_UploadWinterRecord_4265>() {
         public S2CR_UploadWinterRecord_4265 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2CR_UploadWinterRecord_4265(input, extensionRegistry);
         }
      };

      private S2CR_UploadWinterRecord_4265(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2CR_UploadWinterRecord_4265() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2CR_UploadWinterRecord_4265();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2CR_UploadWinterRecord_4265(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.playerName_ = bs;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.belovedItemId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.stage_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return CrossMsg.internal_static_common_S2CR_UploadWinterRecord_4265_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CrossMsg.internal_static_common_S2CR_UploadWinterRecord_4265_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadWinterRecord_4265.class, Builder.class);
      }

      public boolean hasPlayerName() {
         return (this.bitField0_ & 1) != 0;
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

      public boolean hasBelovedItemId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getBelovedItemId() {
         return this.belovedItemId_;
      }

      public boolean hasStage() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getStage() {
         return this.stage_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPlayerName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasBelovedItemId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStage()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            GeneratedMessageV3.writeString(output, 1, this.playerName_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.belovedItemId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.stage_);
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
               size += GeneratedMessageV3.computeStringSize(1, this.playerName_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.belovedItemId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.stage_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2CR_UploadWinterRecord_4265)) {
            return super.equals(obj);
         } else {
            S2CR_UploadWinterRecord_4265 other = (S2CR_UploadWinterRecord_4265)obj;
            if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasBelovedItemId() != other.hasBelovedItemId()) {
               return false;
            } else if (this.hasBelovedItemId() && this.getBelovedItemId() != other.getBelovedItemId()) {
               return false;
            } else if (this.hasStage() != other.hasStage()) {
               return false;
            } else if (this.hasStage() && this.getStage() != other.getStage()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPlayerName()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasBelovedItemId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getBelovedItemId();
            }

            if (this.hasStage()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getStage();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2CR_UploadWinterRecord_4265 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2CR_UploadWinterRecord_4265)PARSER.parseFrom(data);
      }

      public static S2CR_UploadWinterRecord_4265 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadWinterRecord_4265)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadWinterRecord_4265 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2CR_UploadWinterRecord_4265)PARSER.parseFrom(data);
      }

      public static S2CR_UploadWinterRecord_4265 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadWinterRecord_4265)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadWinterRecord_4265 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2CR_UploadWinterRecord_4265)PARSER.parseFrom(data);
      }

      public static S2CR_UploadWinterRecord_4265 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2CR_UploadWinterRecord_4265)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2CR_UploadWinterRecord_4265 parseFrom(InputStream input) throws IOException {
         return (S2CR_UploadWinterRecord_4265)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadWinterRecord_4265 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadWinterRecord_4265)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadWinterRecord_4265 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2CR_UploadWinterRecord_4265)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2CR_UploadWinterRecord_4265 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadWinterRecord_4265)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2CR_UploadWinterRecord_4265 parseFrom(CodedInputStream input) throws IOException {
         return (S2CR_UploadWinterRecord_4265)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2CR_UploadWinterRecord_4265 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2CR_UploadWinterRecord_4265)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2CR_UploadWinterRecord_4265 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2CR_UploadWinterRecord_4265 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2CR_UploadWinterRecord_4265> parser() {
         return PARSER;
      }

      public Parser<S2CR_UploadWinterRecord_4265> getParserForType() {
         return PARSER;
      }

      public S2CR_UploadWinterRecord_4265 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2CR_UploadWinterRecord_4265OrBuilder {
         private int bitField0_;
         private Object playerName_;
         private int belovedItemId_;
         private int stage_;

         public static final Descriptors.Descriptor getDescriptor() {
            return CrossMsg.internal_static_common_S2CR_UploadWinterRecord_4265_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return CrossMsg.internal_static_common_S2CR_UploadWinterRecord_4265_fieldAccessorTable.ensureFieldAccessorsInitialized(S2CR_UploadWinterRecord_4265.class, Builder.class);
         }

         private Builder() {
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (CrossMsg.S2CR_UploadWinterRecord_4265.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.playerName_ = "";
            this.bitField0_ &= -2;
            this.belovedItemId_ = 0;
            this.bitField0_ &= -3;
            this.stage_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return CrossMsg.internal_static_common_S2CR_UploadWinterRecord_4265_descriptor;
         }

         public S2CR_UploadWinterRecord_4265 getDefaultInstanceForType() {
            return CrossMsg.S2CR_UploadWinterRecord_4265.getDefaultInstance();
         }

         public S2CR_UploadWinterRecord_4265 build() {
            S2CR_UploadWinterRecord_4265 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2CR_UploadWinterRecord_4265 buildPartial() {
            S2CR_UploadWinterRecord_4265 result = new S2CR_UploadWinterRecord_4265(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 2) != 0) {
               result.belovedItemId_ = this.belovedItemId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.stage_ = this.stage_;
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
            if (other instanceof S2CR_UploadWinterRecord_4265) {
               return this.mergeFrom((S2CR_UploadWinterRecord_4265)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2CR_UploadWinterRecord_4265 other) {
            if (other == CrossMsg.S2CR_UploadWinterRecord_4265.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPlayerName()) {
                  this.bitField0_ |= 1;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasBelovedItemId()) {
                  this.setBelovedItemId(other.getBelovedItemId());
               }

               if (other.hasStage()) {
                  this.setStage(other.getStage());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPlayerName()) {
               return false;
            } else if (!this.hasBelovedItemId()) {
               return false;
            } else {
               return this.hasStage();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2CR_UploadWinterRecord_4265 parsedMessage = null;

            try {
               parsedMessage = (S2CR_UploadWinterRecord_4265)CrossMsg.S2CR_UploadWinterRecord_4265.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2CR_UploadWinterRecord_4265)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPlayerName() {
            return (this.bitField0_ & 1) != 0;
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
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearPlayerName() {
            this.bitField0_ &= -2;
            this.playerName_ = CrossMsg.S2CR_UploadWinterRecord_4265.getDefaultInstance().getPlayerName();
            this.onChanged();
            return this;
         }

         public Builder setPlayerNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.playerName_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasBelovedItemId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getBelovedItemId() {
            return this.belovedItemId_;
         }

         public Builder setBelovedItemId(int value) {
            this.bitField0_ |= 2;
            this.belovedItemId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBelovedItemId() {
            this.bitField0_ &= -3;
            this.belovedItemId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStage() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getStage() {
            return this.stage_;
         }

         public Builder setStage(int value) {
            this.bitField0_ |= 4;
            this.stage_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStage() {
            this.bitField0_ &= -5;
            this.stage_ = 0;
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

   public interface CR2S_BattleRecord_4206OrBuilder extends MessageOrBuilder {
      List<BattleMsg.S2C_BattleResult_6102> getFightResultList();

      BattleMsg.S2C_BattleResult_6102 getFightResult(int index);

      int getFightResultCount();

      List<? extends BattleMsg.S2C_BattleResult_6102OrBuilder> getFightResultOrBuilderList();

      BattleMsg.S2C_BattleResult_6102OrBuilder getFightResultOrBuilder(int index);

      boolean hasIsdef();

      boolean getIsdef();
   }

   public interface CR2S_ChangeInfoResult_4212OrBuilder extends MessageOrBuilder {
      boolean hasGroup();

      int getGroup();
   }

   public interface CR2S_DelRecordByModel_4215OrBuilder extends MessageOrBuilder {
      boolean hasModel();

      int getModel();
   }

   public interface CR2S_Login_4204OrBuilder extends MessageOrBuilder {
   }

   public interface CR2S_OhterServerBattleRecord_4211OrBuilder extends MessageOrBuilder {
      boolean hasPlayPlayerId();

      int getPlayPlayerId();

      boolean hasPlayServierId();

      int getPlayServierId();

      boolean hasFightResult();

      BattleMsg.S2C_BattleResult_6102 getFightResult();

      BattleMsg.S2C_BattleResult_6102OrBuilder getFightResultOrBuilder();
   }

   public interface CR2S_PlayBattleRecord_4208OrBuilder extends MessageOrBuilder {
      boolean hasRecordId();

      int getRecordId();

      boolean hasSystemid();

      int getSystemid();

      boolean hasPlayPlayerId();

      int getPlayPlayerId();

      boolean hasPlayServierId();

      int getPlayServierId();
   }

   public interface CR2S_PlayerBaseData_4201OrBuilder extends MessageOrBuilder {
      boolean hasServerId();

      int getServerId();

      boolean hasPlayerId();

      int getPlayerId();
   }

   public interface CR2S_UploadAliveNum_4258OrBuilder extends MessageOrBuilder {
   }

   public interface S2CR_CrossGm_4209OrBuilder extends MessageOrBuilder {
      boolean hasCmd();

      String getCmd();

      ByteString getCmdBytes();
   }

   public interface S2CR_CrossPKList_4220OrBuilder extends MessageOrBuilder {
      boolean hasPower();

      long getPower();

      boolean hasMatchPowerMin();

      long getMatchPowerMin();

      boolean hasMatchPowerMax();

      long getMatchPowerMax();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();
   }

   public interface S2CR_Login_4203OrBuilder extends MessageOrBuilder {
      boolean hasServerId();

      int getServerId();

      boolean hasGroupId();

      int getGroupId();

      List<Integer> getSlaveServerIdList();

      int getSlaveServerIdCount();

      int getSlaveServerId(int index);

      boolean hasPlatformId();

      int getPlatformId();

      boolean hasWorldLv();

      int getWorldLv();

      boolean hasOpenTime();

      long getOpenTime();

      boolean hasCurAlivePlayerNum();

      long getCurAlivePlayerNum();

      boolean hasCurAvgPower();

      long getCurAvgPower();
   }

   public interface S2CR_MergeServer_4217OrBuilder extends MessageOrBuilder {
      boolean hasMainid();

      int getMainid();

      List<Integer> getSlaveIdsList();

      int getSlaveIdsCount();

      int getSlaveIds(int index);
   }

   public interface S2CR_MergeServer_4218OrBuilder extends MessageOrBuilder {
      boolean hasResult();

      boolean getResult();
   }

   public interface S2CR_PlayBattleRecord_4207OrBuilder extends MessageOrBuilder {
      boolean hasRecordId();

      int getRecordId();

      boolean hasSystemid();

      int getSystemid();

      boolean hasServerId();

      int getServerId();

      boolean hasRecordType();

      int getRecordType();

      boolean hasStartTime();

      int getStartTime();
   }

   public interface S2CR_PlayerBaseData_4202OrBuilder extends MessageOrBuilder {
      boolean hasServerId();

      int getServerId();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasSex();

      int getSex();

      boolean hasLv();

      int getLv();

      boolean hasCombatPower();

      long getCombatPower();

      boolean hasHeadId();

      int getHeadId();

      boolean hasHeadFrame();

      int getHeadFrame();

      boolean hasPrestige();

      int getPrestige();

      boolean hasMonarchId();

      int getMonarchId();

      boolean hasUnionId();

      int getUnionId();

      boolean hasVipLev();

      int getVipLev();

      boolean hasUnionName();

      String getUnionName();

      ByteString getUnionNameBytes();

      boolean hasShowVip();

      boolean getShowVip();

      boolean hasSecondTitle();

      int getSecondTitle();

      boolean hasPeakLv();

      int getPeakLv();

      boolean hasPrivilegeMine();

      int getPrivilegeMine();

      boolean hasPalaceTitle();

      int getPalaceTitle();

      boolean hasQqLogo();

      String getQqLogo();

      ByteString getQqLogoBytes();

      boolean hasQqWanKaLv();

      int getQqWanKaLv();

      boolean hasHeroNum();

      int getHeroNum();
   }

   public interface S2CR_SlaveBeMerge_4219OrBuilder extends MessageOrBuilder {
      boolean hasMainId();

      int getMainId();
   }

   public interface S2CR_UnionUpload_4216OrBuilder extends MessageOrBuilder {
      boolean hasOnConnect();

      boolean getOnConnect();

      boolean hasId();

      int getId();

      boolean hasName();

      String getName();

      ByteString getNameBytes();

      boolean hasLv();

      int getLv();

      boolean hasCopyId();

      int getCopyId();

      boolean hasServer();

      int getServer();

      boolean hasLeader();

      int getLeader();

      boolean hasIsDismiss();

      boolean getIsDismiss();

      boolean hasHead();

      int getHead();
   }

   public interface S2CR_Update_4213OrBuilder extends MessageOrBuilder {
      boolean hasServerId();

      int getServerId();

      boolean hasGroupId();

      int getGroupId();

      List<Integer> getSlaveServerIdList();

      int getSlaveServerIdCount();

      int getSlaveServerId(int index);

      boolean hasPlatformId();

      int getPlatformId();

      boolean hasWorldLv();

      int getWorldLv();

      boolean hasOpenTime();

      long getOpenTime();

      boolean hasCurAlivePlayerNum();

      long getCurAlivePlayerNum();

      boolean hasCurAvgPower();

      long getCurAvgPower();
   }

   public interface S2CR_UploadAliveNum_4257OrBuilder extends MessageOrBuilder {
      boolean hasLastWeeklyNum();

      long getLastWeeklyNum();
   }

   public interface S2CR_UploadBroodDrawData_4263OrBuilder extends MessageOrBuilder {
      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasBelovedItemId();

      int getBelovedItemId();

      boolean hasStage();

      int getStage();

      boolean hasSlotType();

      int getSlotType();
   }

   public interface S2CR_UploadChildRecord_4261OrBuilder extends MessageOrBuilder {
      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasBelovedItemId();

      int getBelovedItemId();

      boolean hasStage();

      int getStage();
   }

   public interface S2CR_UploadChineseNewYearRecord_4255OrBuilder extends MessageOrBuilder {
      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasBelovedItemId();

      int getBelovedItemId();

      boolean hasStage();

      int getStage();
   }

   public interface S2CR_UploadChineseNewYearTreasureNum_4254OrBuilder extends MessageOrBuilder {
      boolean hasServerId();

      int getServerId();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasChineseNewYearTreasureNum();

      long getChineseNewYearTreasureNum();
   }

   public interface S2CR_UploadFirstYearRecord_4252OrBuilder extends MessageOrBuilder {
      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasBelovedItemId();

      int getBelovedItemId();

      boolean hasStage();

      int getStage();
   }

   public interface S2CR_UploadFirstYearTreasureNum_4253OrBuilder extends MessageOrBuilder {
      boolean hasServerId();

      int getServerId();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasFirstYearTreasureNum();

      long getFirstYearTreasureNum();
   }

   public interface S2CR_UploadFlowerFireRecord_4226OrBuilder extends MessageOrBuilder {
      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasBelovedItemId();

      int getBelovedItemId();
   }

   public interface S2CR_UploadGetFlowerData_4262OrBuilder extends MessageOrBuilder {
      boolean hasSendPlayerId();

      int getSendPlayerId();

      boolean hasSendFlowerNum();

      int getSendFlowerNum();
   }

   public interface S2CR_UploadGoldWeekRecord_4259OrBuilder extends MessageOrBuilder {
      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasBelovedItemId();

      int getBelovedItemId();

      boolean hasStage();

      int getStage();
   }

   public interface S2CR_UploadGuoQingRecord_4251OrBuilder extends MessageOrBuilder {
      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasBelovedItemId();

      int getBelovedItemId();

      boolean hasStage();

      int getStage();
   }

   public interface S2CR_UploadKoiRecord_4222OrBuilder extends MessageOrBuilder {
      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasLabel();

      int getLabel();
   }

   public interface S2CR_UploadLaborDayRecord_4223OrBuilder extends MessageOrBuilder {
      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasBelovedItemId();

      int getBelovedItemId();
   }

   public interface S2CR_UploadMidAutumnRecord_4229OrBuilder extends MessageOrBuilder {
      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasBelovedItemId();

      int getBelovedItemId();

      boolean hasStage();

      int getStage();
   }

   public interface S2CR_UploadQiXiRecord_4228OrBuilder extends MessageOrBuilder {
      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasBelovedItemId();

      int getBelovedItemId();

      boolean hasStage();

      int getStage();
   }

   public interface S2CR_UploadSplendidCityRecord_4260OrBuilder extends MessageOrBuilder {
      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasBelovedItemId();

      int getBelovedItemId();

      boolean hasStage();

      int getStage();
   }

   public interface S2CR_UploadSummerRecord_4264OrBuilder extends MessageOrBuilder {
      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasBelovedItemId();

      int getBelovedItemId();

      boolean hasStage();

      int getStage();
   }

   public interface S2CR_UploadSwimParkRecord_4227OrBuilder extends MessageOrBuilder {
      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasBelovedItemId();

      int getBelovedItemId();
   }

   public interface S2CR_UploadWinterRecord_4265OrBuilder extends MessageOrBuilder {
      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasBelovedItemId();

      int getBelovedItemId();

      boolean hasStage();

      int getStage();
   }

   public interface S2CR_UploadWishStarRecord_4224OrBuilder extends MessageOrBuilder {
      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasBelovedItemId();

      int getBelovedItemId();
   }

   public interface S2CR_UploadYuanDanRecord_22636OrBuilder extends MessageOrBuilder {
      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasBelovedItemId();

      int getBelovedItemId();

      boolean hasStage();

      int getStage();
   }

   public interface S2CR_UploadYuanXiaoRecord_4256OrBuilder extends MessageOrBuilder {
      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasBelovedItemId();

      int getBelovedItemId();
   }

   public interface S2CR_UploadZongQingRecord_4225OrBuilder extends MessageOrBuilder {
      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasBelovedItemId();

      int getBelovedItemId();
   }

   public interface S2S_CrossPK_4221OrBuilder extends MessageOrBuilder {
      boolean hasArrayingData();

      ByteString getArrayingData();

      boolean hasAtkPlayerInfo();

      CommonMsg.PlayerInfo getAtkPlayerInfo();

      CommonMsg.PlayerInfoOrBuilder getAtkPlayerInfoOrBuilder();
   }
}
