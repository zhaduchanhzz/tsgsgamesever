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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ProtocolStringList;
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

public final class DemonStrikesMsg {
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_CityInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_CityInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_CityHoldInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_CityHoldInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_NpcHpInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_NpcHpInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_LogInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_LogInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_RankData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_RankData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_TaskGroup_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_TaskGroup_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_CityHoldChangeData_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_CityHoldChangeData_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_C2S_DemonStrikes_13901_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_C2S_DemonStrikes_13901_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_S2C_DemonStrikes_13902_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_S2C_DemonStrikes_13902_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_C2S_Main_13903_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_C2S_Main_13903_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_S2C_Main_13904_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_S2C_Main_13904_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_C2S_CityInfo_13905_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_C2S_CityInfo_13905_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityInfo_13906_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityInfo_13906_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_C2S_FlushRecoverTime_13909_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_C2S_FlushRecoverTime_13909_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_S2C_FlushRecoverTime_13910_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_S2C_FlushRecoverTime_13910_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityChangeNotify_13912_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityChangeNotify_13912_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_C2S_MoveCity_13913_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_C2S_MoveCity_13913_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_S2C_MoveCity_13914_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_S2C_MoveCity_13914_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_C2S_TransferList_13915_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_C2S_TransferList_13915_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_S2C_TransferList_13916_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_S2C_TransferList_13916_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_C2S_TransferToCity_13917_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_C2S_TransferToCity_13917_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_S2C_TransferToCity_13918_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_S2C_TransferToCity_13918_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_C2S_Rank_13919_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_C2S_Rank_13919_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_S2C_Rank_13920_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_S2C_Rank_13920_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_C2S_Logs_13921_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_C2S_Logs_13921_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_S2C_Logs_13922_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_S2C_Logs_13922_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_C2S_IntegralRewardMain_13923_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_C2S_IntegralRewardMain_13923_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_S2C_IntegralRewardMain_13924_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_S2C_IntegralRewardMain_13924_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_C2S_IntegralReward_13925_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_C2S_IntegralReward_13925_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_S2C_IntegralReward_13926_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_S2C_IntegralReward_13926_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_C2S_CommitTask_13927_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_C2S_CommitTask_13927_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_S2C_CommitTask_13928_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_S2C_CommitTask_13928_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_S2C_TaskNotify_13930_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_S2C_TaskNotify_13930_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_C2S_CityReward_13931_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_C2S_CityReward_13931_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityReward_13932_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityReward_13932_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_C2S_LuckyMain_13933_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_C2S_LuckyMain_13933_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyMain_13934_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyMain_13934_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_C2S_LuckyReward_13935_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_C2S_LuckyReward_13935_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyReward_13936_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyReward_13936_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyRewardNotify_13938_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyRewardNotify_13938_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_S2C_RewardNotify_13940_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_S2C_RewardNotify_13940_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_demonStrikes_com_gzbz_protobuf_C2S_BuyRandomShop_13941_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_demonStrikes_com_gzbz_protobuf_C2S_BuyRandomShop_13941_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private DemonStrikesMsg() {
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
      String[] descriptorData = new String[]{"\n\u0012DemonStrikes.proto\u0012\u001edemonStrikes.com.gzbz.protobuf\u001a\fcommon.proto\u001a\u0010CountryWar.proto\"í\u0001\n\bCityInfo\u0012\u000e\n\u0006cityId\u0018\u0001 \u0002(\u0005\u0012\u0014\n\fdefenseCount\u0018\u0002 \u0002(\u0005\u00128\n\u0005state\u0018\u0003 \u0002(\u000e2).demonStrikes.com.gzbz.protobuf.CityState\u00122\n\u0004camp\u0018\u0004 \u0002(\u000e2$.demonStrikes.com.gzbz.protobuf.Camp\u0012\u0011\n\tstateTime\u0018\u0005 \u0002(\u0005\u0012\u0011\n\tactToCity\u0018\u0006 \u0002(\u0005\u0012\u0010\n\brewardId\u0018\u0007 \u0001(\u0005\u0012\u0015\n\rrewardEndTime\u0018\b \u0001(\u0005\"\u009c\u0001\n\fCityHoldInfo\u0012\u000b\n\u0003uid\u0018\u0001 \u0002(\u0005\u00128\n\u0005npcHp\u0018\u0002 \u0003(\u000b2).demonStrikes.com.gzbz.protobuf.NpcHpInfo\u0012\u0014\n\fdefenseValue\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004name\u0018\u0004 \u0001(\t\u0012\u000f\n\u0007modelId\u0018\u0005 \u0001(\u0005\u0012\u0010\n\bserverId\u0018\u0006 \u0001(\u0005\"+\n\tNpcHpInfo\u0012\u000b\n\u0003pos\u0018\u0001 \u0002(\u0005\u0012\u0011\n\thpPercent\u0018\u0002 \u0002(\u0005\"®\u0001\n\u0007LogInfo\u00125\n\u0004type\u0018\u0001 \u0002(\u000e2'.demonStrikes.com.gzbz.protobuf.LogType\u0012\u0010\n\bplayerId\u0018\u0002 \u0001(\u0005\u0012\u000e\n\u0006server\u0018\u0003 \u0001(\u0005\u0012\u0012\n\nplayerName\u0018\u0004 \u0001(\t\u0012\u000e\n\u0006cityId\u0018\u0005 \u0001(\u0005\u0012\u0012\n\ndefenseNum\u0018\u0006 \u0001(\u0005\u0012\u0012\n\ncreateTime\u0018\u0007 \u0002(\u0005\"N\n\bRankData\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006server\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bintegral\u0018\u0003 \u0002(\u0003\u0012\u0012\n\nplayerName\u0018\u0004 \u0001(\t\"H\n\tTaskGroup\u0012\r\n\u0005group\u0018\u0001 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0002 \u0002(\u0003\u0012\u001b\n\u0005tasks\u0018\u0003 \u0003(\u000b2\f.common.Task\"\u0080\u0001\n\u0012CityHoldChangeData\u0012>\n\bholdInfo\u0018\u0001 \u0002(\u000b2,.demonStrikes.com.gzbz.protobuf.CityHoldInfo\u0012\u0014\n\fsourceCityId\u0018\u0002 \u0002(\u0005\u0012\u0014\n\ftargetCityId\u0018\u0003 \u0002(\u0005\"\u0018\n\u0016C2S_DemonStrikes_13901\"³\u0001\n\u0016S2C_DemonStrikes_13902\u0012:\n\u0005state\u0018\u0001 \u0002(\u000e2+.demonStrikes.com.gzbz.protobuf.SystemState\u0012\u0011\n\tstartTime\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007endTime\u0018\u0003 \u0002(\u0005\u0012\r\n\u0005mapId\u0018\u0004 \u0002(\u0005\u0012\u0012\n\ncityReward\u0018\u0005 \u0002(\b\u0012\u0016\n\u000eintegralReward\u0018\u0006 \u0002(\b\"\u001e\n\u000eC2S_Main_13903\u0012\f\n\u0004exit\u0018\u0001 \u0002(\b\"\u0089\u0001\n\u000eS2C_Main_13904\u0012\u000e\n\u0006inCity\u0018\u0001 \u0002(\u0005\u00126\n\u0004city\u0018\u0002 \u0003(\u000b2(.demonStrikes.com.gzbz.protobuf.CityInfo\u0012\u0016\n\u000eatkRecoverTime\u0018\u0003 \u0002(\u0005\u0012\u0017\n\u000fmoveRecoverTime\u0018\u0004 \u0002(\u0005\"I\n\u0012C2S_CityInfo_13905\u0012\u000e\n\u0006cityId\u0018\u0001 \u0002(\u0005\u0012#\n\tpageParam\u0018\u0002 \u0002(\u000b2\u0010.common.PageInfo\"\u0088\u0001\n\u0012S2C_CityInfo_13906\u0012\u000e\n\u0006cityId\u0018\u0001 \u0002(\u0005\u0012\"\n\bpageInfo\u0018\u0002 \u0002(\u000b2\u0010.common.PageInfo\u0012>\n\bholdInfo\u0018\u0003 \u0003(\u000b2,.demonStrikes.com.gzbz.protobuf.CityHoldInfo\"\u001c\n\u001aC2S_FlushRecoverTime_13909\"M\n\u001aS2C_FlushRecoverTime_13910\u0012\u0016\n\u000eatkRecoverTime\u0018\u0001 \u0002(\u0005\u0012\u0017\n\u000fmoveRecoverTime\u0018\u0002 \u0002(\u0005\"Ú\u0001\n\u001aS2C_CityChangeNotify_13912\u0012:\n\bcityInfo\u0018\u0001 \u0003(\u000b2(.demonStrikes.com.gzbz.protobuf.CityInfo\u0012J\n\u000eholdChangeData\u0018\u0002 \u0003(\u000b22.demonStrikes.com.gzbz.protobuf.CityHoldChangeData\u00124\n\u0003log\u0018\u0003 \u0001(\u000b2'.demonStrikes.com.gzbz.protobuf.LogInfo\"$\n\u0012C2S_MoveCity_13913\u0012\u000e\n\u0006cityId\u0018\u0001 \u0002(\u0005\"=\n\u0012S2C_MoveCity_13914\u0012\u000e\n\u0006cityId\u0018\u0001 \u0002(\u0005\u0012\u0017\n\u000fmoveRecoverTime\u0018\u0002 \u0002(\u0005\"<\n\u0016C2S_TransferList_13915\u0012\"\n\bpageInfo\u0018\u0001 \u0002(\u000b2\u0010.common.PageInfo\"\u0085\u0001\n\u0016S2C_TransferList_13916\u0012\"\n\bpageInfo\u0018\u0001 \u0002(\u000b2\u0010.common.PageInfo\u0012G\n\rTransferInfos\u0018\u0002 \u0003(\u000b20.countryWar.com.gzbz.protobuf.TransferPlayerInfo\"D\n\u0018C2S_TransferToCity_13917\u0012\u000e\n\u0006cityId\u0018\u0001 \u0002(\u0005\u0012\u0018\n\u0010transferPlayerId\u0018\u0002 \u0002(\u0005\"\u008b\u0001\n\u0018S2C_TransferToCity_13918\u0012\u0016\n\u000eatkRecoverTime\u0018\u0001 \u0002(\u0005\u0012\u0017\n\u000fmoveRecoverTime\u0018\u0002 \u0002(\u0005\u0012>\n\u0006result\u0018\u0003 \u0002(\u000e2..demonStrikes.com.gzbz.protobuf.TransferResult\"`\n\u000eC2S_Rank_13919\u0012:\n\brankType\u0018\u0001 \u0002(\u000e2(.demonStrikes.com.gzbz.protobuf.RankType\u0012\u0012\n\nlimitCount\u0018\u0002 \u0002(\u0005\"¾\u0001\n\u000eS2C_Rank_13920\u0012:\n\brankType\u0018\u0001 \u0002(\u000e2(.demonStrikes.com.gzbz.protobuf.RankType\u00126\n\u0004rank\u0018\u0002 \u0003(\u000b2(.demonStrikes.com.gzbz.protobuf.RankData\u00128\n\u0006myRank\u0018\u0003 \u0002(\u000b2(.demonStrikes.com.gzbz.protobuf.RankData\"\u001e\n\u000eC2S_Logs_13921\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\"T\n\u000eS2C_Logs_13922\u0012\f\n\u0004type\u0018\u0001 \u0002(\u0005\u00124\n\u0003log\u0018\u0002 \u0003(\u000b2'.demonStrikes.com.gzbz.protobuf.LogInfo\"\u001e\n\u001cC2S_IntegralRewardMain_13923\"}\n\u001cS2C_IntegralRewardMain_13924\u0012\u000e\n\u0006reward\u0018\u0001 \u0002(\u0005\u00128\n\u0005group\u0018\u0002 \u0003(\u000b2).demonStrikes.com.gzbz.protobuf.TaskGroup\u0012\u0013\n\u000bsuperReward\u0018\u0003 \u0002(\u0005\"\u001a\n\u0018C2S_IntegralReward_13925\"W\n\u0018S2C_IntegralReward_13926\u0012\u000e\n\u0006reward\u0018\u0001 \u0002(\u0005\u0012\u0013\n\u000bsuperReward\u0018\u0002 \u0002(\u0005\u0012\u0016\n\u000eintegralReward\u0018\u0003 \u0002(\b\"&\n\u0014C2S_CommitTask_13927\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\">\n\u0014S2C_CommitTask_13928\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\u0012\u0016\n\u000eintegralReward\u0018\u0002 \u0002(\b\"3\n\u0014S2C_TaskNotify_13930\u0012\u001b\n\u0005tasks\u0018\u0001 \u0003(\u000b2\f.common.Task\"\u0016\n\u0014C2S_CityReward_13931\"*\n\u0014S2C_CityReward_13932\u0012\u0012\n\ncityReward\u0018\u0001 \u0002(\b\"\u0015\n\u0013C2S_LuckyMain_13933\"O\n\u0013S2C_LuckyMain_13934\u0012(\n\u0005infos\u0018\u0001 \u0003(\u000b2\u0019.common.TurnTableGridInfo\u0012\u000e\n\u0006record\u0018\u0002 \u0003(\t\"&\n\u0015C2S_LuckyReward_13935\u0012\r\n\u0005count\u0018\u0001 \u0002(\u0005\"Z\n\u0015S2C_LuckyReward_13936\u0012\r\n\u0005count\u0018\u0001 \u0002(\u0005\u0012\r\n\u0005index\u0018\u0002 \u0003(\u0005\u0012#\n\titemInfos\u0018\u0003 \u0003(\u000b2\u0010.common.ItemInfo\"-\n\u001bS2C_LuckyRewardNotify_13938\u0012\u000e\n\u0006record\u0018\u0001 \u0003(\t\",\n\u0016S2C_RewardNotify_13940\u0012\u0012\n\ncityReward\u0018\u0001 \u0002(\b\"8\n\u0017C2S_BuyRandomShop_13941\u0012\r\n\u0005buyId\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006buyNum\u0018\u0002 \u0002(\u0005*,\n\u000bSystemState\u0012\b\n\u0004OPEN\u0010\u0001\u0012\n\n\u0006SETTLE\u0010\u0002\u0012\u0007\n\u0003END\u0010\u0003*V\n\tCityState\u0012\n\n\u0006NORMAL\u0010\u0001\u0012\u0015\n\u0011HOLD_RECUPERATION\u0010\u0002\u0012\u0010\n\fHOLD_DEFENSE\u0010\u0003\u0012\t\n\u0005READY\u0010\u0004\u0012\t\n\u0005FIGHT\u0010\u0005*$\n\u0004Camp\u0012\n\n\u0006PLAYER\u0010\u0000\u0012\u0007\n\u0003MID\u0010\u0001\u0012\u0007\n\u0003NPC\u0010\u0002*u\n\u0007LogType\u0012\u000f\n\u000bPLAYER_MOVE\u0010\u0001\u0012\u0013\n\u000fNPC_CITY_CHANGE\u0010\u0002\u0012\u0016\n\u0012PLAYER_CITY_CHANGE\u0010\u0003\u0012\u000f\n\u000bDEFENSE_SUC\u0010\u0004\u0012\u001b\n\u0017BE_TRANSFER_CITY_CHANGE\u0010\u0005*8\n\bRankType\u0012\n\n\u0006SERVER\u0010\u0001\u0012\n\n\u0006OCCUPY\u0010\u0002\u0012\b\n\u0004KILL\u0010\u0003\u0012\n\n\u0006DAMAGE\u0010\u0004*e\n\u000eTransferResult\u0012\u0014\n\u0010TRANSFER_ATK_SUC\u0010\u0001\u0012\u0015\n\u0011TRANSFER_ATK_FAIL\u0010\u0002\u0012\u0011\n\rTRANSFER_MOVE\u0010\u0003\u0012\u0013\n\u000fTRANSFER_OCCUPY\u0010\u0004B&\n\u0011com.gzbz.protobufB\u000fDemonStrikesMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor(), CountryWarMsg.getDescriptor()});
      internal_static_demonStrikes_com_gzbz_protobuf_CityInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_demonStrikes_com_gzbz_protobuf_CityInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_CityInfo_descriptor, new String[]{"CityId", "DefenseCount", "State", "Camp", "StateTime", "ActToCity", "RewardId", "RewardEndTime"});
      internal_static_demonStrikes_com_gzbz_protobuf_CityHoldInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_demonStrikes_com_gzbz_protobuf_CityHoldInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_CityHoldInfo_descriptor, new String[]{"Uid", "NpcHp", "DefenseValue", "Name", "ModelId", "ServerId"});
      internal_static_demonStrikes_com_gzbz_protobuf_NpcHpInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_demonStrikes_com_gzbz_protobuf_NpcHpInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_NpcHpInfo_descriptor, new String[]{"Pos", "HpPercent"});
      internal_static_demonStrikes_com_gzbz_protobuf_LogInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_demonStrikes_com_gzbz_protobuf_LogInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_LogInfo_descriptor, new String[]{"Type", "PlayerId", "Server", "PlayerName", "CityId", "DefenseNum", "CreateTime"});
      internal_static_demonStrikes_com_gzbz_protobuf_RankData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_demonStrikes_com_gzbz_protobuf_RankData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_RankData_descriptor, new String[]{"Rank", "Server", "Integral", "PlayerName"});
      internal_static_demonStrikes_com_gzbz_protobuf_TaskGroup_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_demonStrikes_com_gzbz_protobuf_TaskGroup_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_TaskGroup_descriptor, new String[]{"Group", "EndTime", "Tasks"});
      internal_static_demonStrikes_com_gzbz_protobuf_CityHoldChangeData_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_demonStrikes_com_gzbz_protobuf_CityHoldChangeData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_CityHoldChangeData_descriptor, new String[]{"HoldInfo", "SourceCityId", "TargetCityId"});
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_DemonStrikes_13901_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_DemonStrikes_13901_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_C2S_DemonStrikes_13901_descriptor, new String[0]);
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_DemonStrikes_13902_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_DemonStrikes_13902_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_S2C_DemonStrikes_13902_descriptor, new String[]{"State", "StartTime", "EndTime", "MapId", "CityReward", "IntegralReward"});
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_Main_13903_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_Main_13903_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_C2S_Main_13903_descriptor, new String[]{"Exit"});
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_Main_13904_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_Main_13904_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_S2C_Main_13904_descriptor, new String[]{"InCity", "City", "AtkRecoverTime", "MoveRecoverTime"});
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_CityInfo_13905_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_CityInfo_13905_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_C2S_CityInfo_13905_descriptor, new String[]{"CityId", "PageParam"});
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityInfo_13906_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityInfo_13906_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityInfo_13906_descriptor, new String[]{"CityId", "PageInfo", "HoldInfo"});
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_FlushRecoverTime_13909_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_FlushRecoverTime_13909_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_C2S_FlushRecoverTime_13909_descriptor, new String[0]);
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_FlushRecoverTime_13910_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_FlushRecoverTime_13910_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_S2C_FlushRecoverTime_13910_descriptor, new String[]{"AtkRecoverTime", "MoveRecoverTime"});
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityChangeNotify_13912_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityChangeNotify_13912_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityChangeNotify_13912_descriptor, new String[]{"CityInfo", "HoldChangeData", "Log"});
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_MoveCity_13913_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_MoveCity_13913_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_C2S_MoveCity_13913_descriptor, new String[]{"CityId"});
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_MoveCity_13914_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_MoveCity_13914_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_S2C_MoveCity_13914_descriptor, new String[]{"CityId", "MoveRecoverTime"});
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_TransferList_13915_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_TransferList_13915_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_C2S_TransferList_13915_descriptor, new String[]{"PageInfo"});
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_TransferList_13916_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_TransferList_13916_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_S2C_TransferList_13916_descriptor, new String[]{"PageInfo", "TransferInfos"});
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_TransferToCity_13917_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_TransferToCity_13917_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_C2S_TransferToCity_13917_descriptor, new String[]{"CityId", "TransferPlayerId"});
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_TransferToCity_13918_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_TransferToCity_13918_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_S2C_TransferToCity_13918_descriptor, new String[]{"AtkRecoverTime", "MoveRecoverTime", "Result"});
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_Rank_13919_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_Rank_13919_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_C2S_Rank_13919_descriptor, new String[]{"RankType", "LimitCount"});
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_Rank_13920_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_Rank_13920_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_S2C_Rank_13920_descriptor, new String[]{"RankType", "Rank", "MyRank"});
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_Logs_13921_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_Logs_13921_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_C2S_Logs_13921_descriptor, new String[]{"Type"});
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_Logs_13922_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_Logs_13922_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_S2C_Logs_13922_descriptor, new String[]{"Type", "Log"});
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_IntegralRewardMain_13923_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_IntegralRewardMain_13923_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_C2S_IntegralRewardMain_13923_descriptor, new String[0]);
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_IntegralRewardMain_13924_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_IntegralRewardMain_13924_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_S2C_IntegralRewardMain_13924_descriptor, new String[]{"Reward", "Group", "SuperReward"});
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_IntegralReward_13925_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_IntegralReward_13925_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_C2S_IntegralReward_13925_descriptor, new String[0]);
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_IntegralReward_13926_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_IntegralReward_13926_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_S2C_IntegralReward_13926_descriptor, new String[]{"Reward", "SuperReward", "IntegralReward"});
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_CommitTask_13927_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_CommitTask_13927_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_C2S_CommitTask_13927_descriptor, new String[]{"TaskId"});
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_CommitTask_13928_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_CommitTask_13928_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_S2C_CommitTask_13928_descriptor, new String[]{"TaskId", "IntegralReward"});
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_TaskNotify_13930_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_TaskNotify_13930_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_S2C_TaskNotify_13930_descriptor, new String[]{"Tasks"});
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_CityReward_13931_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_CityReward_13931_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_C2S_CityReward_13931_descriptor, new String[0]);
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityReward_13932_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityReward_13932_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityReward_13932_descriptor, new String[]{"CityReward"});
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_LuckyMain_13933_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(35);
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_LuckyMain_13933_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_C2S_LuckyMain_13933_descriptor, new String[0]);
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyMain_13934_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(36);
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyMain_13934_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyMain_13934_descriptor, new String[]{"Infos", "Record"});
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_LuckyReward_13935_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(37);
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_LuckyReward_13935_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_C2S_LuckyReward_13935_descriptor, new String[]{"Count"});
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyReward_13936_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(38);
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyReward_13936_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyReward_13936_descriptor, new String[]{"Count", "Index", "ItemInfos"});
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyRewardNotify_13938_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(39);
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyRewardNotify_13938_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyRewardNotify_13938_descriptor, new String[]{"Record"});
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_RewardNotify_13940_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(40);
      internal_static_demonStrikes_com_gzbz_protobuf_S2C_RewardNotify_13940_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_S2C_RewardNotify_13940_descriptor, new String[]{"CityReward"});
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_BuyRandomShop_13941_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(41);
      internal_static_demonStrikes_com_gzbz_protobuf_C2S_BuyRandomShop_13941_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_demonStrikes_com_gzbz_protobuf_C2S_BuyRandomShop_13941_descriptor, new String[]{"BuyId", "BuyNum"});
      CommonMsg.getDescriptor();
      CountryWarMsg.getDescriptor();
   }

   public static enum SystemState implements ProtocolMessageEnum {
      OPEN(1),
      SETTLE(2),
      END(3);

      public static final int OPEN_VALUE = 1;
      public static final int SETTLE_VALUE = 2;
      public static final int END_VALUE = 3;
      private static final Internal.EnumLiteMap<SystemState> internalValueMap = new Internal.EnumLiteMap<SystemState>() {
         public SystemState findValueByNumber(int number) {
            return DemonStrikesMsg.SystemState.forNumber(number);
         }
      };
      private static final SystemState[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static SystemState valueOf(int value) {
         return forNumber(value);
      }

      public static SystemState forNumber(int value) {
         switch (value) {
            case 1:
               return OPEN;
            case 2:
               return SETTLE;
            case 3:
               return END;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<SystemState> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)DemonStrikesMsg.getDescriptor().getEnumTypes().get(0);
      }

      public static SystemState valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private SystemState(int value) {
         this.value = value;
      }
   }

   public static enum CityState implements ProtocolMessageEnum {
      NORMAL(1),
      HOLD_RECUPERATION(2),
      HOLD_DEFENSE(3),
      READY(4),
      FIGHT(5);

      public static final int NORMAL_VALUE = 1;
      public static final int HOLD_RECUPERATION_VALUE = 2;
      public static final int HOLD_DEFENSE_VALUE = 3;
      public static final int READY_VALUE = 4;
      public static final int FIGHT_VALUE = 5;
      private static final Internal.EnumLiteMap<CityState> internalValueMap = new Internal.EnumLiteMap<CityState>() {
         public CityState findValueByNumber(int number) {
            return DemonStrikesMsg.CityState.forNumber(number);
         }
      };
      private static final CityState[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static CityState valueOf(int value) {
         return forNumber(value);
      }

      public static CityState forNumber(int value) {
         switch (value) {
            case 1:
               return NORMAL;
            case 2:
               return HOLD_RECUPERATION;
            case 3:
               return HOLD_DEFENSE;
            case 4:
               return READY;
            case 5:
               return FIGHT;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<CityState> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)DemonStrikesMsg.getDescriptor().getEnumTypes().get(1);
      }

      public static CityState valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private CityState(int value) {
         this.value = value;
      }
   }

   public static enum Camp implements ProtocolMessageEnum {
      PLAYER(0),
      MID(1),
      NPC(2);

      public static final int PLAYER_VALUE = 0;
      public static final int MID_VALUE = 1;
      public static final int NPC_VALUE = 2;
      private static final Internal.EnumLiteMap<Camp> internalValueMap = new Internal.EnumLiteMap<Camp>() {
         public Camp findValueByNumber(int number) {
            return DemonStrikesMsg.Camp.forNumber(number);
         }
      };
      private static final Camp[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static Camp valueOf(int value) {
         return forNumber(value);
      }

      public static Camp forNumber(int value) {
         switch (value) {
            case 0:
               return PLAYER;
            case 1:
               return MID;
            case 2:
               return NPC;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<Camp> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)DemonStrikesMsg.getDescriptor().getEnumTypes().get(2);
      }

      public static Camp valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private Camp(int value) {
         this.value = value;
      }
   }

   public static enum LogType implements ProtocolMessageEnum {
      PLAYER_MOVE(1),
      NPC_CITY_CHANGE(2),
      PLAYER_CITY_CHANGE(3),
      DEFENSE_SUC(4),
      BE_TRANSFER_CITY_CHANGE(5);

      public static final int PLAYER_MOVE_VALUE = 1;
      public static final int NPC_CITY_CHANGE_VALUE = 2;
      public static final int PLAYER_CITY_CHANGE_VALUE = 3;
      public static final int DEFENSE_SUC_VALUE = 4;
      public static final int BE_TRANSFER_CITY_CHANGE_VALUE = 5;
      private static final Internal.EnumLiteMap<LogType> internalValueMap = new Internal.EnumLiteMap<LogType>() {
         public LogType findValueByNumber(int number) {
            return DemonStrikesMsg.LogType.forNumber(number);
         }
      };
      private static final LogType[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static LogType valueOf(int value) {
         return forNumber(value);
      }

      public static LogType forNumber(int value) {
         switch (value) {
            case 1:
               return PLAYER_MOVE;
            case 2:
               return NPC_CITY_CHANGE;
            case 3:
               return PLAYER_CITY_CHANGE;
            case 4:
               return DEFENSE_SUC;
            case 5:
               return BE_TRANSFER_CITY_CHANGE;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<LogType> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)DemonStrikesMsg.getDescriptor().getEnumTypes().get(3);
      }

      public static LogType valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private LogType(int value) {
         this.value = value;
      }
   }

   public static enum RankType implements ProtocolMessageEnum {
      SERVER(1),
      OCCUPY(2),
      KILL(3),
      DAMAGE(4);

      public static final int SERVER_VALUE = 1;
      public static final int OCCUPY_VALUE = 2;
      public static final int KILL_VALUE = 3;
      public static final int DAMAGE_VALUE = 4;
      private static final Internal.EnumLiteMap<RankType> internalValueMap = new Internal.EnumLiteMap<RankType>() {
         public RankType findValueByNumber(int number) {
            return DemonStrikesMsg.RankType.forNumber(number);
         }
      };
      private static final RankType[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static RankType valueOf(int value) {
         return forNumber(value);
      }

      public static RankType forNumber(int value) {
         switch (value) {
            case 1:
               return SERVER;
            case 2:
               return OCCUPY;
            case 3:
               return KILL;
            case 4:
               return DAMAGE;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<RankType> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)DemonStrikesMsg.getDescriptor().getEnumTypes().get(4);
      }

      public static RankType valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private RankType(int value) {
         this.value = value;
      }
   }

   public static enum TransferResult implements ProtocolMessageEnum {
      TRANSFER_ATK_SUC(1),
      TRANSFER_ATK_FAIL(2),
      TRANSFER_MOVE(3),
      TRANSFER_OCCUPY(4);

      public static final int TRANSFER_ATK_SUC_VALUE = 1;
      public static final int TRANSFER_ATK_FAIL_VALUE = 2;
      public static final int TRANSFER_MOVE_VALUE = 3;
      public static final int TRANSFER_OCCUPY_VALUE = 4;
      private static final Internal.EnumLiteMap<TransferResult> internalValueMap = new Internal.EnumLiteMap<TransferResult>() {
         public TransferResult findValueByNumber(int number) {
            return DemonStrikesMsg.TransferResult.forNumber(number);
         }
      };
      private static final TransferResult[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static TransferResult valueOf(int value) {
         return forNumber(value);
      }

      public static TransferResult forNumber(int value) {
         switch (value) {
            case 1:
               return TRANSFER_ATK_SUC;
            case 2:
               return TRANSFER_ATK_FAIL;
            case 3:
               return TRANSFER_MOVE;
            case 4:
               return TRANSFER_OCCUPY;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<TransferResult> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)DemonStrikesMsg.getDescriptor().getEnumTypes().get(5);
      }

      public static TransferResult valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private TransferResult(int value) {
         this.value = value;
      }
   }

   public static final class CityInfo extends GeneratedMessageV3 implements CityInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CITYID_FIELD_NUMBER = 1;
      private int cityId_;
      public static final int DEFENSECOUNT_FIELD_NUMBER = 2;
      private int defenseCount_;
      public static final int STATE_FIELD_NUMBER = 3;
      private int state_;
      public static final int CAMP_FIELD_NUMBER = 4;
      private int camp_;
      public static final int STATETIME_FIELD_NUMBER = 5;
      private int stateTime_;
      public static final int ACTTOCITY_FIELD_NUMBER = 6;
      private int actToCity_;
      public static final int REWARDID_FIELD_NUMBER = 7;
      private int rewardId_;
      public static final int REWARDENDTIME_FIELD_NUMBER = 8;
      private int rewardEndTime_;
      private byte memoizedIsInitialized;
      private static final CityInfo DEFAULT_INSTANCE = new CityInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<CityInfo> PARSER = new AbstractParser<CityInfo>() {
         public CityInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CityInfo(input, extensionRegistry);
         }
      };

      private CityInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CityInfo() {
         this.memoizedIsInitialized = -1;
         this.state_ = 1;
         this.camp_ = 0;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CityInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CityInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.cityId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.defenseCount_ = input.readInt32();
                        break;
                     case 24:
                        int rawValue = input.readEnum();
                        CityState value = DemonStrikesMsg.CityState.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(3, rawValue);
                        } else {
                           this.bitField0_ |= 4;
                           this.state_ = rawValue;
                        }
                        break;
                     case 32:
                        int rawValue = input.readEnum();
                        Camp value = DemonStrikesMsg.Camp.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(4, rawValue);
                        } else {
                           this.bitField0_ |= 8;
                           this.camp_ = rawValue;
                        }
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.stateTime_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.actToCity_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.rewardId_ = input.readInt32();
                        break;
                     case 64:
                        this.bitField0_ |= 128;
                        this.rewardEndTime_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_CityInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_CityInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CityInfo.class, Builder.class);
      }

      public boolean hasCityId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCityId() {
         return this.cityId_;
      }

      public boolean hasDefenseCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDefenseCount() {
         return this.defenseCount_;
      }

      public boolean hasState() {
         return (this.bitField0_ & 4) != 0;
      }

      public CityState getState() {
         CityState result = DemonStrikesMsg.CityState.valueOf(this.state_);
         return result == null ? DemonStrikesMsg.CityState.NORMAL : result;
      }

      public boolean hasCamp() {
         return (this.bitField0_ & 8) != 0;
      }

      public Camp getCamp() {
         Camp result = DemonStrikesMsg.Camp.valueOf(this.camp_);
         return result == null ? DemonStrikesMsg.Camp.PLAYER : result;
      }

      public boolean hasStateTime() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getStateTime() {
         return this.stateTime_;
      }

      public boolean hasActToCity() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getActToCity() {
         return this.actToCity_;
      }

      public boolean hasRewardId() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getRewardId() {
         return this.rewardId_;
      }

      public boolean hasRewardEndTime() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getRewardEndTime() {
         return this.rewardEndTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCityId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDefenseCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCamp()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStateTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasActToCity()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.cityId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.defenseCount_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeEnum(3, this.state_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeEnum(4, this.camp_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.stateTime_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.actToCity_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.rewardId_);
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(8, this.rewardEndTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.cityId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.defenseCount_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeEnumSize(3, this.state_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeEnumSize(4, this.camp_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.stateTime_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.actToCity_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.rewardId_);
            }

            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(8, this.rewardEndTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CityInfo)) {
            return super.equals(obj);
         } else {
            CityInfo other = (CityInfo)obj;
            if (this.hasCityId() != other.hasCityId()) {
               return false;
            } else if (this.hasCityId() && this.getCityId() != other.getCityId()) {
               return false;
            } else if (this.hasDefenseCount() != other.hasDefenseCount()) {
               return false;
            } else if (this.hasDefenseCount() && this.getDefenseCount() != other.getDefenseCount()) {
               return false;
            } else if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.state_ != other.state_) {
               return false;
            } else if (this.hasCamp() != other.hasCamp()) {
               return false;
            } else if (this.hasCamp() && this.camp_ != other.camp_) {
               return false;
            } else if (this.hasStateTime() != other.hasStateTime()) {
               return false;
            } else if (this.hasStateTime() && this.getStateTime() != other.getStateTime()) {
               return false;
            } else if (this.hasActToCity() != other.hasActToCity()) {
               return false;
            } else if (this.hasActToCity() && this.getActToCity() != other.getActToCity()) {
               return false;
            } else if (this.hasRewardId() != other.hasRewardId()) {
               return false;
            } else if (this.hasRewardId() && this.getRewardId() != other.getRewardId()) {
               return false;
            } else if (this.hasRewardEndTime() != other.hasRewardEndTime()) {
               return false;
            } else if (this.hasRewardEndTime() && this.getRewardEndTime() != other.getRewardEndTime()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasCityId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCityId();
            }

            if (this.hasDefenseCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getDefenseCount();
            }

            if (this.hasState()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.state_;
            }

            if (this.hasCamp()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.camp_;
            }

            if (this.hasStateTime()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getStateTime();
            }

            if (this.hasActToCity()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getActToCity();
            }

            if (this.hasRewardId()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getRewardId();
            }

            if (this.hasRewardEndTime()) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getRewardEndTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CityInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CityInfo)PARSER.parseFrom(data);
      }

      public static CityInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CityInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CityInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CityInfo)PARSER.parseFrom(data);
      }

      public static CityInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CityInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CityInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CityInfo)PARSER.parseFrom(data);
      }

      public static CityInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CityInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CityInfo parseFrom(InputStream input) throws IOException {
         return (CityInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CityInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CityInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CityInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (CityInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CityInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CityInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CityInfo parseFrom(CodedInputStream input) throws IOException {
         return (CityInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CityInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CityInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CityInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CityInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CityInfo> parser() {
         return PARSER;
      }

      public Parser<CityInfo> getParserForType() {
         return PARSER;
      }

      public CityInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CityInfoOrBuilder {
         private int bitField0_;
         private int cityId_;
         private int defenseCount_;
         private int state_;
         private int camp_;
         private int stateTime_;
         private int actToCity_;
         private int rewardId_;
         private int rewardEndTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_CityInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_CityInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CityInfo.class, Builder.class);
         }

         private Builder() {
            this.state_ = 1;
            this.camp_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.state_ = 1;
            this.camp_ = 0;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.CityInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.cityId_ = 0;
            this.bitField0_ &= -2;
            this.defenseCount_ = 0;
            this.bitField0_ &= -3;
            this.state_ = 1;
            this.bitField0_ &= -5;
            this.camp_ = 0;
            this.bitField0_ &= -9;
            this.stateTime_ = 0;
            this.bitField0_ &= -17;
            this.actToCity_ = 0;
            this.bitField0_ &= -33;
            this.rewardId_ = 0;
            this.bitField0_ &= -65;
            this.rewardEndTime_ = 0;
            this.bitField0_ &= -129;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_CityInfo_descriptor;
         }

         public CityInfo getDefaultInstanceForType() {
            return DemonStrikesMsg.CityInfo.getDefaultInstance();
         }

         public CityInfo build() {
            CityInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CityInfo buildPartial() {
            CityInfo result = new CityInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.cityId_ = this.cityId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.defenseCount_ = this.defenseCount_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.state_ = this.state_;
            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.camp_ = this.camp_;
            if ((from_bitField0_ & 16) != 0) {
               result.stateTime_ = this.stateTime_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.actToCity_ = this.actToCity_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.rewardId_ = this.rewardId_;
               to_bitField0_ |= 64;
            }

            if ((from_bitField0_ & 128) != 0) {
               result.rewardEndTime_ = this.rewardEndTime_;
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
            if (other instanceof CityInfo) {
               return this.mergeFrom((CityInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CityInfo other) {
            if (other == DemonStrikesMsg.CityInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCityId()) {
                  this.setCityId(other.getCityId());
               }

               if (other.hasDefenseCount()) {
                  this.setDefenseCount(other.getDefenseCount());
               }

               if (other.hasState()) {
                  this.setState(other.getState());
               }

               if (other.hasCamp()) {
                  this.setCamp(other.getCamp());
               }

               if (other.hasStateTime()) {
                  this.setStateTime(other.getStateTime());
               }

               if (other.hasActToCity()) {
                  this.setActToCity(other.getActToCity());
               }

               if (other.hasRewardId()) {
                  this.setRewardId(other.getRewardId());
               }

               if (other.hasRewardEndTime()) {
                  this.setRewardEndTime(other.getRewardEndTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCityId()) {
               return false;
            } else if (!this.hasDefenseCount()) {
               return false;
            } else if (!this.hasState()) {
               return false;
            } else if (!this.hasCamp()) {
               return false;
            } else if (!this.hasStateTime()) {
               return false;
            } else {
               return this.hasActToCity();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CityInfo parsedMessage = null;

            try {
               parsedMessage = (CityInfo)DemonStrikesMsg.CityInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CityInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCityId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCityId() {
            return this.cityId_;
         }

         public Builder setCityId(int value) {
            this.bitField0_ |= 1;
            this.cityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCityId() {
            this.bitField0_ &= -2;
            this.cityId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDefenseCount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getDefenseCount() {
            return this.defenseCount_;
         }

         public Builder setDefenseCount(int value) {
            this.bitField0_ |= 2;
            this.defenseCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDefenseCount() {
            this.bitField0_ &= -3;
            this.defenseCount_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasState() {
            return (this.bitField0_ & 4) != 0;
         }

         public CityState getState() {
            CityState result = DemonStrikesMsg.CityState.valueOf(this.state_);
            return result == null ? DemonStrikesMsg.CityState.NORMAL : result;
         }

         public Builder setState(CityState value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.state_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearState() {
            this.bitField0_ &= -5;
            this.state_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasCamp() {
            return (this.bitField0_ & 8) != 0;
         }

         public Camp getCamp() {
            Camp result = DemonStrikesMsg.Camp.valueOf(this.camp_);
            return result == null ? DemonStrikesMsg.Camp.PLAYER : result;
         }

         public Builder setCamp(Camp value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.camp_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearCamp() {
            this.bitField0_ &= -9;
            this.camp_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasStateTime() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getStateTime() {
            return this.stateTime_;
         }

         public Builder setStateTime(int value) {
            this.bitField0_ |= 16;
            this.stateTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStateTime() {
            this.bitField0_ &= -17;
            this.stateTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasActToCity() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getActToCity() {
            return this.actToCity_;
         }

         public Builder setActToCity(int value) {
            this.bitField0_ |= 32;
            this.actToCity_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearActToCity() {
            this.bitField0_ &= -33;
            this.actToCity_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRewardId() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getRewardId() {
            return this.rewardId_;
         }

         public Builder setRewardId(int value) {
            this.bitField0_ |= 64;
            this.rewardId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardId() {
            this.bitField0_ &= -65;
            this.rewardId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRewardEndTime() {
            return (this.bitField0_ & 128) != 0;
         }

         public int getRewardEndTime() {
            return this.rewardEndTime_;
         }

         public Builder setRewardEndTime(int value) {
            this.bitField0_ |= 128;
            this.rewardEndTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRewardEndTime() {
            this.bitField0_ &= -129;
            this.rewardEndTime_ = 0;
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

   public static final class CityHoldInfo extends GeneratedMessageV3 implements CityHoldInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int UID_FIELD_NUMBER = 1;
      private int uid_;
      public static final int NPCHP_FIELD_NUMBER = 2;
      private List<NpcHpInfo> npcHp_;
      public static final int DEFENSEVALUE_FIELD_NUMBER = 3;
      private int defenseValue_;
      public static final int NAME_FIELD_NUMBER = 4;
      private volatile Object name_;
      public static final int MODELID_FIELD_NUMBER = 5;
      private int modelId_;
      public static final int SERVERID_FIELD_NUMBER = 6;
      private int serverId_;
      private byte memoizedIsInitialized;
      private static final CityHoldInfo DEFAULT_INSTANCE = new CityHoldInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<CityHoldInfo> PARSER = new AbstractParser<CityHoldInfo>() {
         public CityHoldInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CityHoldInfo(input, extensionRegistry);
         }
      };

      private CityHoldInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CityHoldInfo() {
         this.memoizedIsInitialized = -1;
         this.npcHp_ = Collections.emptyList();
         this.name_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CityHoldInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CityHoldInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.uid_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.npcHp_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.npcHp_.add(input.readMessage(DemonStrikesMsg.NpcHpInfo.PARSER, extensionRegistry));
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.defenseValue_ = input.readInt32();
                        break;
                     case 34:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 4;
                        this.name_ = bs;
                        break;
                     case 40:
                        this.bitField0_ |= 8;
                        this.modelId_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 16;
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
               if ((mutable_bitField0_ & 2) != 0) {
                  this.npcHp_ = Collections.unmodifiableList(this.npcHp_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_CityHoldInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_CityHoldInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CityHoldInfo.class, Builder.class);
      }

      public boolean hasUid() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getUid() {
         return this.uid_;
      }

      public List<NpcHpInfo> getNpcHpList() {
         return this.npcHp_;
      }

      public List<? extends NpcHpInfoOrBuilder> getNpcHpOrBuilderList() {
         return this.npcHp_;
      }

      public int getNpcHpCount() {
         return this.npcHp_.size();
      }

      public NpcHpInfo getNpcHp(int index) {
         return (NpcHpInfo)this.npcHp_.get(index);
      }

      public NpcHpInfoOrBuilder getNpcHpOrBuilder(int index) {
         return (NpcHpInfoOrBuilder)this.npcHp_.get(index);
      }

      public boolean hasDefenseValue() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getDefenseValue() {
         return this.defenseValue_;
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

      public boolean hasModelId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getModelId() {
         return this.modelId_;
      }

      public boolean hasServerId() {
         return (this.bitField0_ & 16) != 0;
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
         } else if (!this.hasUid()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasDefenseValue()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getNpcHpCount(); ++i) {
               if (!this.getNpcHp(i).isInitialized()) {
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
            output.writeInt32(1, this.uid_);
         }

         for(int i = 0; i < this.npcHp_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.npcHp_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.defenseValue_);
         }

         if ((this.bitField0_ & 4) != 0) {
            GeneratedMessageV3.writeString(output, 4, this.name_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(5, this.modelId_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(6, this.serverId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.uid_);
            }

            for(int i = 0; i < this.npcHp_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.npcHp_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.defenseValue_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += GeneratedMessageV3.computeStringSize(4, this.name_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.modelId_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.serverId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CityHoldInfo)) {
            return super.equals(obj);
         } else {
            CityHoldInfo other = (CityHoldInfo)obj;
            if (this.hasUid() != other.hasUid()) {
               return false;
            } else if (this.hasUid() && this.getUid() != other.getUid()) {
               return false;
            } else if (!this.getNpcHpList().equals(other.getNpcHpList())) {
               return false;
            } else if (this.hasDefenseValue() != other.hasDefenseValue()) {
               return false;
            } else if (this.hasDefenseValue() && this.getDefenseValue() != other.getDefenseValue()) {
               return false;
            } else if (this.hasName() != other.hasName()) {
               return false;
            } else if (this.hasName() && !this.getName().equals(other.getName())) {
               return false;
            } else if (this.hasModelId() != other.hasModelId()) {
               return false;
            } else if (this.hasModelId() && this.getModelId() != other.getModelId()) {
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
            if (this.hasUid()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getUid();
            }

            if (this.getNpcHpCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getNpcHpList().hashCode();
            }

            if (this.hasDefenseValue()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getDefenseValue();
            }

            if (this.hasName()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getName().hashCode();
            }

            if (this.hasModelId()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getModelId();
            }

            if (this.hasServerId()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getServerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CityHoldInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CityHoldInfo)PARSER.parseFrom(data);
      }

      public static CityHoldInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CityHoldInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CityHoldInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CityHoldInfo)PARSER.parseFrom(data);
      }

      public static CityHoldInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CityHoldInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CityHoldInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CityHoldInfo)PARSER.parseFrom(data);
      }

      public static CityHoldInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CityHoldInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CityHoldInfo parseFrom(InputStream input) throws IOException {
         return (CityHoldInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CityHoldInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CityHoldInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CityHoldInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (CityHoldInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CityHoldInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CityHoldInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CityHoldInfo parseFrom(CodedInputStream input) throws IOException {
         return (CityHoldInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CityHoldInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CityHoldInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CityHoldInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CityHoldInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CityHoldInfo> parser() {
         return PARSER;
      }

      public Parser<CityHoldInfo> getParserForType() {
         return PARSER;
      }

      public CityHoldInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CityHoldInfoOrBuilder {
         private int bitField0_;
         private int uid_;
         private List<NpcHpInfo> npcHp_;
         private RepeatedFieldBuilderV3<NpcHpInfo, NpcHpInfo.Builder, NpcHpInfoOrBuilder> npcHpBuilder_;
         private int defenseValue_;
         private Object name_;
         private int modelId_;
         private int serverId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_CityHoldInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_CityHoldInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CityHoldInfo.class, Builder.class);
         }

         private Builder() {
            this.npcHp_ = Collections.emptyList();
            this.name_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.npcHp_ = Collections.emptyList();
            this.name_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.CityHoldInfo.alwaysUseFieldBuilders) {
               this.getNpcHpFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.uid_ = 0;
            this.bitField0_ &= -2;
            if (this.npcHpBuilder_ == null) {
               this.npcHp_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.npcHpBuilder_.clear();
            }

            this.defenseValue_ = 0;
            this.bitField0_ &= -5;
            this.name_ = "";
            this.bitField0_ &= -9;
            this.modelId_ = 0;
            this.bitField0_ &= -17;
            this.serverId_ = 0;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_CityHoldInfo_descriptor;
         }

         public CityHoldInfo getDefaultInstanceForType() {
            return DemonStrikesMsg.CityHoldInfo.getDefaultInstance();
         }

         public CityHoldInfo build() {
            CityHoldInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CityHoldInfo buildPartial() {
            CityHoldInfo result = new CityHoldInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.uid_ = this.uid_;
               to_bitField0_ |= 1;
            }

            if (this.npcHpBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.npcHp_ = Collections.unmodifiableList(this.npcHp_);
                  this.bitField0_ &= -3;
               }

               result.npcHp_ = this.npcHp_;
            } else {
               result.npcHp_ = this.npcHpBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.defenseValue_ = this.defenseValue_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 4;
            }

            result.name_ = this.name_;
            if ((from_bitField0_ & 16) != 0) {
               result.modelId_ = this.modelId_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.serverId_ = this.serverId_;
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
            if (other instanceof CityHoldInfo) {
               return this.mergeFrom((CityHoldInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CityHoldInfo other) {
            if (other == DemonStrikesMsg.CityHoldInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasUid()) {
                  this.setUid(other.getUid());
               }

               if (this.npcHpBuilder_ == null) {
                  if (!other.npcHp_.isEmpty()) {
                     if (this.npcHp_.isEmpty()) {
                        this.npcHp_ = other.npcHp_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureNpcHpIsMutable();
                        this.npcHp_.addAll(other.npcHp_);
                     }

                     this.onChanged();
                  }
               } else if (!other.npcHp_.isEmpty()) {
                  if (this.npcHpBuilder_.isEmpty()) {
                     this.npcHpBuilder_.dispose();
                     this.npcHpBuilder_ = null;
                     this.npcHp_ = other.npcHp_;
                     this.bitField0_ &= -3;
                     this.npcHpBuilder_ = DemonStrikesMsg.CityHoldInfo.alwaysUseFieldBuilders ? this.getNpcHpFieldBuilder() : null;
                  } else {
                     this.npcHpBuilder_.addAllMessages(other.npcHp_);
                  }
               }

               if (other.hasDefenseValue()) {
                  this.setDefenseValue(other.getDefenseValue());
               }

               if (other.hasName()) {
                  this.bitField0_ |= 8;
                  this.name_ = other.name_;
                  this.onChanged();
               }

               if (other.hasModelId()) {
                  this.setModelId(other.getModelId());
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
            if (!this.hasUid()) {
               return false;
            } else if (!this.hasDefenseValue()) {
               return false;
            } else {
               for(int i = 0; i < this.getNpcHpCount(); ++i) {
                  if (!this.getNpcHp(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CityHoldInfo parsedMessage = null;

            try {
               parsedMessage = (CityHoldInfo)DemonStrikesMsg.CityHoldInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CityHoldInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasUid() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getUid() {
            return this.uid_;
         }

         public Builder setUid(int value) {
            this.bitField0_ |= 1;
            this.uid_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearUid() {
            this.bitField0_ &= -2;
            this.uid_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureNpcHpIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.npcHp_ = new ArrayList(this.npcHp_);
               this.bitField0_ |= 2;
            }

         }

         public List<NpcHpInfo> getNpcHpList() {
            return this.npcHpBuilder_ == null ? Collections.unmodifiableList(this.npcHp_) : this.npcHpBuilder_.getMessageList();
         }

         public int getNpcHpCount() {
            return this.npcHpBuilder_ == null ? this.npcHp_.size() : this.npcHpBuilder_.getCount();
         }

         public NpcHpInfo getNpcHp(int index) {
            return this.npcHpBuilder_ == null ? (NpcHpInfo)this.npcHp_.get(index) : (NpcHpInfo)this.npcHpBuilder_.getMessage(index);
         }

         public Builder setNpcHp(int index, NpcHpInfo value) {
            if (this.npcHpBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureNpcHpIsMutable();
               this.npcHp_.set(index, value);
               this.onChanged();
            } else {
               this.npcHpBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setNpcHp(int index, NpcHpInfo.Builder builderForValue) {
            if (this.npcHpBuilder_ == null) {
               this.ensureNpcHpIsMutable();
               this.npcHp_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.npcHpBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addNpcHp(NpcHpInfo value) {
            if (this.npcHpBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureNpcHpIsMutable();
               this.npcHp_.add(value);
               this.onChanged();
            } else {
               this.npcHpBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addNpcHp(int index, NpcHpInfo value) {
            if (this.npcHpBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureNpcHpIsMutable();
               this.npcHp_.add(index, value);
               this.onChanged();
            } else {
               this.npcHpBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addNpcHp(NpcHpInfo.Builder builderForValue) {
            if (this.npcHpBuilder_ == null) {
               this.ensureNpcHpIsMutable();
               this.npcHp_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.npcHpBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addNpcHp(int index, NpcHpInfo.Builder builderForValue) {
            if (this.npcHpBuilder_ == null) {
               this.ensureNpcHpIsMutable();
               this.npcHp_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.npcHpBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllNpcHp(Iterable<? extends NpcHpInfo> values) {
            if (this.npcHpBuilder_ == null) {
               this.ensureNpcHpIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.npcHp_);
               this.onChanged();
            } else {
               this.npcHpBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearNpcHp() {
            if (this.npcHpBuilder_ == null) {
               this.npcHp_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.npcHpBuilder_.clear();
            }

            return this;
         }

         public Builder removeNpcHp(int index) {
            if (this.npcHpBuilder_ == null) {
               this.ensureNpcHpIsMutable();
               this.npcHp_.remove(index);
               this.onChanged();
            } else {
               this.npcHpBuilder_.remove(index);
            }

            return this;
         }

         public NpcHpInfo.Builder getNpcHpBuilder(int index) {
            return (NpcHpInfo.Builder)this.getNpcHpFieldBuilder().getBuilder(index);
         }

         public NpcHpInfoOrBuilder getNpcHpOrBuilder(int index) {
            return this.npcHpBuilder_ == null ? (NpcHpInfoOrBuilder)this.npcHp_.get(index) : (NpcHpInfoOrBuilder)this.npcHpBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends NpcHpInfoOrBuilder> getNpcHpOrBuilderList() {
            return this.npcHpBuilder_ != null ? this.npcHpBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.npcHp_);
         }

         public NpcHpInfo.Builder addNpcHpBuilder() {
            return (NpcHpInfo.Builder)this.getNpcHpFieldBuilder().addBuilder(DemonStrikesMsg.NpcHpInfo.getDefaultInstance());
         }

         public NpcHpInfo.Builder addNpcHpBuilder(int index) {
            return (NpcHpInfo.Builder)this.getNpcHpFieldBuilder().addBuilder(index, DemonStrikesMsg.NpcHpInfo.getDefaultInstance());
         }

         public List<NpcHpInfo.Builder> getNpcHpBuilderList() {
            return this.getNpcHpFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<NpcHpInfo, NpcHpInfo.Builder, NpcHpInfoOrBuilder> getNpcHpFieldBuilder() {
            if (this.npcHpBuilder_ == null) {
               this.npcHpBuilder_ = new RepeatedFieldBuilderV3(this.npcHp_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.npcHp_ = null;
            }

            return this.npcHpBuilder_;
         }

         public boolean hasDefenseValue() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getDefenseValue() {
            return this.defenseValue_;
         }

         public Builder setDefenseValue(int value) {
            this.bitField0_ |= 4;
            this.defenseValue_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDefenseValue() {
            this.bitField0_ &= -5;
            this.defenseValue_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasName() {
            return (this.bitField0_ & 8) != 0;
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
               this.bitField0_ |= 8;
               this.name_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearName() {
            this.bitField0_ &= -9;
            this.name_ = DemonStrikesMsg.CityHoldInfo.getDefaultInstance().getName();
            this.onChanged();
            return this;
         }

         public Builder setNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.name_ = value;
               this.onChanged();
               return this;
            }
         }

         public boolean hasModelId() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getModelId() {
            return this.modelId_;
         }

         public Builder setModelId(int value) {
            this.bitField0_ |= 16;
            this.modelId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearModelId() {
            this.bitField0_ &= -17;
            this.modelId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasServerId() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getServerId() {
            return this.serverId_;
         }

         public Builder setServerId(int value) {
            this.bitField0_ |= 32;
            this.serverId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServerId() {
            this.bitField0_ &= -33;
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

   public static final class NpcHpInfo extends GeneratedMessageV3 implements NpcHpInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int POS_FIELD_NUMBER = 1;
      private int pos_;
      public static final int HPPERCENT_FIELD_NUMBER = 2;
      private int hpPercent_;
      private byte memoizedIsInitialized;
      private static final NpcHpInfo DEFAULT_INSTANCE = new NpcHpInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<NpcHpInfo> PARSER = new AbstractParser<NpcHpInfo>() {
         public NpcHpInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new NpcHpInfo(input, extensionRegistry);
         }
      };

      private NpcHpInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private NpcHpInfo() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new NpcHpInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private NpcHpInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.hpPercent_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_NpcHpInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_NpcHpInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(NpcHpInfo.class, Builder.class);
      }

      public boolean hasPos() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getPos() {
         return this.pos_;
      }

      public boolean hasHpPercent() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHpPercent() {
         return this.hpPercent_;
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
         } else if (!this.hasHpPercent()) {
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.hpPercent_);
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.hpPercent_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof NpcHpInfo)) {
            return super.equals(obj);
         } else {
            NpcHpInfo other = (NpcHpInfo)obj;
            if (this.hasPos() != other.hasPos()) {
               return false;
            } else if (this.hasPos() && this.getPos() != other.getPos()) {
               return false;
            } else if (this.hasHpPercent() != other.hasHpPercent()) {
               return false;
            } else if (this.hasHpPercent() && this.getHpPercent() != other.getHpPercent()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasHpPercent()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHpPercent();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static NpcHpInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (NpcHpInfo)PARSER.parseFrom(data);
      }

      public static NpcHpInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (NpcHpInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static NpcHpInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (NpcHpInfo)PARSER.parseFrom(data);
      }

      public static NpcHpInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (NpcHpInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static NpcHpInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (NpcHpInfo)PARSER.parseFrom(data);
      }

      public static NpcHpInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (NpcHpInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static NpcHpInfo parseFrom(InputStream input) throws IOException {
         return (NpcHpInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static NpcHpInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (NpcHpInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static NpcHpInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (NpcHpInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static NpcHpInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (NpcHpInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static NpcHpInfo parseFrom(CodedInputStream input) throws IOException {
         return (NpcHpInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static NpcHpInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (NpcHpInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(NpcHpInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static NpcHpInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<NpcHpInfo> parser() {
         return PARSER;
      }

      public Parser<NpcHpInfo> getParserForType() {
         return PARSER;
      }

      public NpcHpInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NpcHpInfoOrBuilder {
         private int bitField0_;
         private int pos_;
         private int hpPercent_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_NpcHpInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_NpcHpInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(NpcHpInfo.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.NpcHpInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.pos_ = 0;
            this.bitField0_ &= -2;
            this.hpPercent_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_NpcHpInfo_descriptor;
         }

         public NpcHpInfo getDefaultInstanceForType() {
            return DemonStrikesMsg.NpcHpInfo.getDefaultInstance();
         }

         public NpcHpInfo build() {
            NpcHpInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public NpcHpInfo buildPartial() {
            NpcHpInfo result = new NpcHpInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.pos_ = this.pos_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.hpPercent_ = this.hpPercent_;
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
            if (other instanceof NpcHpInfo) {
               return this.mergeFrom((NpcHpInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(NpcHpInfo other) {
            if (other == DemonStrikesMsg.NpcHpInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPos()) {
                  this.setPos(other.getPos());
               }

               if (other.hasHpPercent()) {
                  this.setHpPercent(other.getHpPercent());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPos()) {
               return false;
            } else {
               return this.hasHpPercent();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            NpcHpInfo parsedMessage = null;

            try {
               parsedMessage = (NpcHpInfo)DemonStrikesMsg.NpcHpInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (NpcHpInfo)e.getUnfinishedMessage();
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

         public boolean hasHpPercent() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHpPercent() {
            return this.hpPercent_;
         }

         public Builder setHpPercent(int value) {
            this.bitField0_ |= 2;
            this.hpPercent_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHpPercent() {
            this.bitField0_ &= -3;
            this.hpPercent_ = 0;
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

   public static final class LogInfo extends GeneratedMessageV3 implements LogInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int SERVER_FIELD_NUMBER = 3;
      private int server_;
      public static final int PLAYERNAME_FIELD_NUMBER = 4;
      private volatile Object playerName_;
      public static final int CITYID_FIELD_NUMBER = 5;
      private int cityId_;
      public static final int DEFENSENUM_FIELD_NUMBER = 6;
      private int defenseNum_;
      public static final int CREATETIME_FIELD_NUMBER = 7;
      private int createTime_;
      private byte memoizedIsInitialized;
      private static final LogInfo DEFAULT_INSTANCE = new LogInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<LogInfo> PARSER = new AbstractParser<LogInfo>() {
         public LogInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new LogInfo(input, extensionRegistry);
         }
      };

      private LogInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private LogInfo() {
         this.memoizedIsInitialized = -1;
         this.type_ = 1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new LogInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private LogInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        LogType value = DemonStrikesMsg.LogType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.type_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.playerId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.server_ = input.readInt32();
                        break;
                     case 34:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 8;
                        this.playerName_ = bs;
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.cityId_ = input.readInt32();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.defenseNum_ = input.readInt32();
                        break;
                     case 56:
                        this.bitField0_ |= 64;
                        this.createTime_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_LogInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_LogInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(LogInfo.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public LogType getType() {
         LogType result = DemonStrikesMsg.LogType.valueOf(this.type_);
         return result == null ? DemonStrikesMsg.LogType.PLAYER_MOVE : result;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasServer() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getServer() {
         return this.server_;
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

      public boolean hasCityId() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getCityId() {
         return this.cityId_;
      }

      public boolean hasDefenseNum() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getDefenseNum() {
         return this.defenseNum_;
      }

      public boolean hasCreateTime() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getCreateTime() {
         return this.createTime_;
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
         } else if (!this.hasCreateTime()) {
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
            output.writeInt32(2, this.playerId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.server_);
         }

         if ((this.bitField0_ & 8) != 0) {
            GeneratedMessageV3.writeString(output, 4, this.playerName_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.cityId_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.defenseNum_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.createTime_);
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
               size += CodedOutputStream.computeInt32Size(2, this.playerId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.server_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += GeneratedMessageV3.computeStringSize(4, this.playerName_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.cityId_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.defenseNum_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.createTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof LogInfo)) {
            return super.equals(obj);
         } else {
            LogInfo other = (LogInfo)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.type_ != other.type_) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasServer() != other.hasServer()) {
               return false;
            } else if (this.hasServer() && this.getServer() != other.getServer()) {
               return false;
            } else if (this.hasPlayerName() != other.hasPlayerName()) {
               return false;
            } else if (this.hasPlayerName() && !this.getPlayerName().equals(other.getPlayerName())) {
               return false;
            } else if (this.hasCityId() != other.hasCityId()) {
               return false;
            } else if (this.hasCityId() && this.getCityId() != other.getCityId()) {
               return false;
            } else if (this.hasDefenseNum() != other.hasDefenseNum()) {
               return false;
            } else if (this.hasDefenseNum() && this.getDefenseNum() != other.getDefenseNum()) {
               return false;
            } else if (this.hasCreateTime() != other.hasCreateTime()) {
               return false;
            } else if (this.hasCreateTime() && this.getCreateTime() != other.getCreateTime()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPlayerId();
            }

            if (this.hasServer()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getServer();
            }

            if (this.hasPlayerName()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getPlayerName().hashCode();
            }

            if (this.hasCityId()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getCityId();
            }

            if (this.hasDefenseNum()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getDefenseNum();
            }

            if (this.hasCreateTime()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getCreateTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static LogInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (LogInfo)PARSER.parseFrom(data);
      }

      public static LogInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (LogInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static LogInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (LogInfo)PARSER.parseFrom(data);
      }

      public static LogInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (LogInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static LogInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (LogInfo)PARSER.parseFrom(data);
      }

      public static LogInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (LogInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static LogInfo parseFrom(InputStream input) throws IOException {
         return (LogInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static LogInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (LogInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static LogInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (LogInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static LogInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (LogInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static LogInfo parseFrom(CodedInputStream input) throws IOException {
         return (LogInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static LogInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (LogInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(LogInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static LogInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<LogInfo> parser() {
         return PARSER;
      }

      public Parser<LogInfo> getParserForType() {
         return PARSER;
      }

      public LogInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LogInfoOrBuilder {
         private int bitField0_;
         private int type_;
         private int playerId_;
         private int server_;
         private Object playerName_;
         private int cityId_;
         private int defenseNum_;
         private int createTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_LogInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_LogInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(LogInfo.class, Builder.class);
         }

         private Builder() {
            this.type_ = 1;
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.type_ = 1;
            this.playerName_ = "";
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.LogInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 1;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.server_ = 0;
            this.bitField0_ &= -5;
            this.playerName_ = "";
            this.bitField0_ &= -9;
            this.cityId_ = 0;
            this.bitField0_ &= -17;
            this.defenseNum_ = 0;
            this.bitField0_ &= -33;
            this.createTime_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_LogInfo_descriptor;
         }

         public LogInfo getDefaultInstanceForType() {
            return DemonStrikesMsg.LogInfo.getDefaultInstance();
         }

         public LogInfo build() {
            LogInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public LogInfo buildPartial() {
            LogInfo result = new LogInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.type_ = this.type_;
            if ((from_bitField0_ & 2) != 0) {
               result.playerId_ = this.playerId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.server_ = this.server_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.playerName_ = this.playerName_;
            if ((from_bitField0_ & 16) != 0) {
               result.cityId_ = this.cityId_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.defenseNum_ = this.defenseNum_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.createTime_ = this.createTime_;
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
            if (other instanceof LogInfo) {
               return this.mergeFrom((LogInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(LogInfo other) {
            if (other == DemonStrikesMsg.LogInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasServer()) {
                  this.setServer(other.getServer());
               }

               if (other.hasPlayerName()) {
                  this.bitField0_ |= 8;
                  this.playerName_ = other.playerName_;
                  this.onChanged();
               }

               if (other.hasCityId()) {
                  this.setCityId(other.getCityId());
               }

               if (other.hasDefenseNum()) {
                  this.setDefenseNum(other.getDefenseNum());
               }

               if (other.hasCreateTime()) {
                  this.setCreateTime(other.getCreateTime());
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
               return this.hasCreateTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            LogInfo parsedMessage = null;

            try {
               parsedMessage = (LogInfo)DemonStrikesMsg.LogInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (LogInfo)e.getUnfinishedMessage();
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

         public LogType getType() {
            LogType result = DemonStrikesMsg.LogType.valueOf(this.type_);
            return result == null ? DemonStrikesMsg.LogType.PLAYER_MOVE : result;
         }

         public Builder setType(LogType value) {
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

         public boolean hasServer() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getServer() {
            return this.server_;
         }

         public Builder setServer(int value) {
            this.bitField0_ |= 4;
            this.server_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServer() {
            this.bitField0_ &= -5;
            this.server_ = 0;
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
            this.playerName_ = DemonStrikesMsg.LogInfo.getDefaultInstance().getPlayerName();
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

         public boolean hasCityId() {
            return (this.bitField0_ & 16) != 0;
         }

         public int getCityId() {
            return this.cityId_;
         }

         public Builder setCityId(int value) {
            this.bitField0_ |= 16;
            this.cityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCityId() {
            this.bitField0_ &= -17;
            this.cityId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasDefenseNum() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getDefenseNum() {
            return this.defenseNum_;
         }

         public Builder setDefenseNum(int value) {
            this.bitField0_ |= 32;
            this.defenseNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearDefenseNum() {
            this.bitField0_ &= -33;
            this.defenseNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCreateTime() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getCreateTime() {
            return this.createTime_;
         }

         public Builder setCreateTime(int value) {
            this.bitField0_ |= 64;
            this.createTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCreateTime() {
            this.bitField0_ &= -65;
            this.createTime_ = 0;
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

   public static final class RankData extends GeneratedMessageV3 implements RankDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANK_FIELD_NUMBER = 1;
      private int rank_;
      public static final int SERVER_FIELD_NUMBER = 2;
      private int server_;
      public static final int INTEGRAL_FIELD_NUMBER = 3;
      private long integral_;
      public static final int PLAYERNAME_FIELD_NUMBER = 4;
      private volatile Object playerName_;
      private byte memoizedIsInitialized;
      private static final RankData DEFAULT_INSTANCE = new RankData();
      /** @deprecated */
      @Deprecated
      public static final Parser<RankData> PARSER = new AbstractParser<RankData>() {
         public RankData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new RankData(input, extensionRegistry);
         }
      };

      private RankData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private RankData() {
         this.memoizedIsInitialized = -1;
         this.playerName_ = "";
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new RankData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private RankData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.server_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.integral_ = input.readInt64();
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_RankData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_RankData_fieldAccessorTable.ensureFieldAccessorsInitialized(RankData.class, Builder.class);
      }

      public boolean hasRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRank() {
         return this.rank_;
      }

      public boolean hasServer() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getServer() {
         return this.server_;
      }

      public boolean hasIntegral() {
         return (this.bitField0_ & 4) != 0;
      }

      public long getIntegral() {
         return this.integral_;
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
         } else if (!this.hasRank()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasServer()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIntegral()) {
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
            output.writeInt32(2, this.server_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt64(3, this.integral_);
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
               size += CodedOutputStream.computeInt32Size(1, this.rank_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.server_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt64Size(3, this.integral_);
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
         } else if (!(obj instanceof RankData)) {
            return super.equals(obj);
         } else {
            RankData other = (RankData)obj;
            if (this.hasRank() != other.hasRank()) {
               return false;
            } else if (this.hasRank() && this.getRank() != other.getRank()) {
               return false;
            } else if (this.hasServer() != other.hasServer()) {
               return false;
            } else if (this.hasServer() && this.getServer() != other.getServer()) {
               return false;
            } else if (this.hasIntegral() != other.hasIntegral()) {
               return false;
            } else if (this.hasIntegral() && this.getIntegral() != other.getIntegral()) {
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
            if (this.hasRank()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRank();
            }

            if (this.hasServer()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getServer();
            }

            if (this.hasIntegral()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashLong(this.getIntegral());
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

      public static RankData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (RankData)PARSER.parseFrom(data);
      }

      public static RankData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (RankData)PARSER.parseFrom(data);
      }

      public static RankData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (RankData)PARSER.parseFrom(data);
      }

      public static RankData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (RankData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static RankData parseFrom(InputStream input) throws IOException {
         return (RankData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RankData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static RankData parseDelimitedFrom(InputStream input) throws IOException {
         return (RankData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static RankData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static RankData parseFrom(CodedInputStream input) throws IOException {
         return (RankData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static RankData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (RankData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(RankData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static RankData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<RankData> parser() {
         return PARSER;
      }

      public Parser<RankData> getParserForType() {
         return PARSER;
      }

      public RankData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RankDataOrBuilder {
         private int bitField0_;
         private int rank_;
         private int server_;
         private long integral_;
         private Object playerName_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_RankData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_RankData_fieldAccessorTable.ensureFieldAccessorsInitialized(RankData.class, Builder.class);
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
            if (DemonStrikesMsg.RankData.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rank_ = 0;
            this.bitField0_ &= -2;
            this.server_ = 0;
            this.bitField0_ &= -3;
            this.integral_ = 0L;
            this.bitField0_ &= -5;
            this.playerName_ = "";
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_RankData_descriptor;
         }

         public RankData getDefaultInstanceForType() {
            return DemonStrikesMsg.RankData.getDefaultInstance();
         }

         public RankData build() {
            RankData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public RankData buildPartial() {
            RankData result = new RankData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.rank_ = this.rank_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.server_ = this.server_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.integral_ = this.integral_;
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
            if (other instanceof RankData) {
               return this.mergeFrom((RankData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RankData other) {
            if (other == DemonStrikesMsg.RankData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRank()) {
                  this.setRank(other.getRank());
               }

               if (other.hasServer()) {
                  this.setServer(other.getServer());
               }

               if (other.hasIntegral()) {
                  this.setIntegral(other.getIntegral());
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
            if (!this.hasRank()) {
               return false;
            } else if (!this.hasServer()) {
               return false;
            } else {
               return this.hasIntegral();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RankData parsedMessage = null;

            try {
               parsedMessage = (RankData)DemonStrikesMsg.RankData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (RankData)e.getUnfinishedMessage();
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

         public boolean hasServer() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getServer() {
            return this.server_;
         }

         public Builder setServer(int value) {
            this.bitField0_ |= 2;
            this.server_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearServer() {
            this.bitField0_ &= -3;
            this.server_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIntegral() {
            return (this.bitField0_ & 4) != 0;
         }

         public long getIntegral() {
            return this.integral_;
         }

         public Builder setIntegral(long value) {
            this.bitField0_ |= 4;
            this.integral_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIntegral() {
            this.bitField0_ &= -5;
            this.integral_ = 0L;
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
            this.playerName_ = DemonStrikesMsg.RankData.getDefaultInstance().getPlayerName();
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

   public static final class TaskGroup extends GeneratedMessageV3 implements TaskGroupOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GROUP_FIELD_NUMBER = 1;
      private int group_;
      public static final int ENDTIME_FIELD_NUMBER = 2;
      private long endTime_;
      public static final int TASKS_FIELD_NUMBER = 3;
      private List<CommonMsg.Task> tasks_;
      private byte memoizedIsInitialized;
      private static final TaskGroup DEFAULT_INSTANCE = new TaskGroup();
      /** @deprecated */
      @Deprecated
      public static final Parser<TaskGroup> PARSER = new AbstractParser<TaskGroup>() {
         public TaskGroup parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new TaskGroup(input, extensionRegistry);
         }
      };

      private TaskGroup(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private TaskGroup() {
         this.memoizedIsInitialized = -1;
         this.tasks_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new TaskGroup();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private TaskGroup(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                     case 16:
                        this.bitField0_ |= 2;
                        this.endTime_ = input.readInt64();
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.tasks_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.tasks_.add(input.readMessage(CommonMsg.Task.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.tasks_ = Collections.unmodifiableList(this.tasks_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_TaskGroup_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_TaskGroup_fieldAccessorTable.ensureFieldAccessorsInitialized(TaskGroup.class, Builder.class);
      }

      public boolean hasGroup() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getGroup() {
         return this.group_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public long getEndTime() {
         return this.endTime_;
      }

      public List<CommonMsg.Task> getTasksList() {
         return this.tasks_;
      }

      public List<? extends CommonMsg.TaskOrBuilder> getTasksOrBuilderList() {
         return this.tasks_;
      }

      public int getTasksCount() {
         return this.tasks_.size();
      }

      public CommonMsg.Task getTasks(int index) {
         return (CommonMsg.Task)this.tasks_.get(index);
      }

      public CommonMsg.TaskOrBuilder getTasksOrBuilder(int index) {
         return (CommonMsg.TaskOrBuilder)this.tasks_.get(index);
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
         } else if (!this.hasEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getTasksCount(); ++i) {
               if (!this.getTasks(i).isInitialized()) {
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
            output.writeInt32(1, this.group_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt64(2, this.endTime_);
         }

         for(int i = 0; i < this.tasks_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.tasks_.get(i));
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

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt64Size(2, this.endTime_);
            }

            for(int i = 0; i < this.tasks_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.tasks_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof TaskGroup)) {
            return super.equals(obj);
         } else {
            TaskGroup other = (TaskGroup)obj;
            if (this.hasGroup() != other.hasGroup()) {
               return false;
            } else if (this.hasGroup() && this.getGroup() != other.getGroup()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (!this.getTasksList().equals(other.getTasksList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasEndTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashLong(this.getEndTime());
            }

            if (this.getTasksCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTasksList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static TaskGroup parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (TaskGroup)PARSER.parseFrom(data);
      }

      public static TaskGroup parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TaskGroup)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TaskGroup parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (TaskGroup)PARSER.parseFrom(data);
      }

      public static TaskGroup parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TaskGroup)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TaskGroup parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (TaskGroup)PARSER.parseFrom(data);
      }

      public static TaskGroup parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (TaskGroup)PARSER.parseFrom(data, extensionRegistry);
      }

      public static TaskGroup parseFrom(InputStream input) throws IOException {
         return (TaskGroup)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TaskGroup parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TaskGroup)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static TaskGroup parseDelimitedFrom(InputStream input) throws IOException {
         return (TaskGroup)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static TaskGroup parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TaskGroup)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static TaskGroup parseFrom(CodedInputStream input) throws IOException {
         return (TaskGroup)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static TaskGroup parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (TaskGroup)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(TaskGroup prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static TaskGroup getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<TaskGroup> parser() {
         return PARSER;
      }

      public Parser<TaskGroup> getParserForType() {
         return PARSER;
      }

      public TaskGroup getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TaskGroupOrBuilder {
         private int bitField0_;
         private int group_;
         private long endTime_;
         private List<CommonMsg.Task> tasks_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> tasksBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_TaskGroup_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_TaskGroup_fieldAccessorTable.ensureFieldAccessorsInitialized(TaskGroup.class, Builder.class);
         }

         private Builder() {
            this.tasks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.tasks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.TaskGroup.alwaysUseFieldBuilders) {
               this.getTasksFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.group_ = 0;
            this.bitField0_ &= -2;
            this.endTime_ = 0L;
            this.bitField0_ &= -3;
            if (this.tasksBuilder_ == null) {
               this.tasks_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.tasksBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_TaskGroup_descriptor;
         }

         public TaskGroup getDefaultInstanceForType() {
            return DemonStrikesMsg.TaskGroup.getDefaultInstance();
         }

         public TaskGroup build() {
            TaskGroup result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public TaskGroup buildPartial() {
            TaskGroup result = new TaskGroup(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.group_ = this.group_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 2;
            }

            if (this.tasksBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.tasks_ = Collections.unmodifiableList(this.tasks_);
                  this.bitField0_ &= -5;
               }

               result.tasks_ = this.tasks_;
            } else {
               result.tasks_ = this.tasksBuilder_.build();
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
            if (other instanceof TaskGroup) {
               return this.mergeFrom((TaskGroup)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(TaskGroup other) {
            if (other == DemonStrikesMsg.TaskGroup.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGroup()) {
                  this.setGroup(other.getGroup());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (this.tasksBuilder_ == null) {
                  if (!other.tasks_.isEmpty()) {
                     if (this.tasks_.isEmpty()) {
                        this.tasks_ = other.tasks_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureTasksIsMutable();
                        this.tasks_.addAll(other.tasks_);
                     }

                     this.onChanged();
                  }
               } else if (!other.tasks_.isEmpty()) {
                  if (this.tasksBuilder_.isEmpty()) {
                     this.tasksBuilder_.dispose();
                     this.tasksBuilder_ = null;
                     this.tasks_ = other.tasks_;
                     this.bitField0_ &= -5;
                     this.tasksBuilder_ = DemonStrikesMsg.TaskGroup.alwaysUseFieldBuilders ? this.getTasksFieldBuilder() : null;
                  } else {
                     this.tasksBuilder_.addAllMessages(other.tasks_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasGroup()) {
               return false;
            } else if (!this.hasEndTime()) {
               return false;
            } else {
               for(int i = 0; i < this.getTasksCount(); ++i) {
                  if (!this.getTasks(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            TaskGroup parsedMessage = null;

            try {
               parsedMessage = (TaskGroup)DemonStrikesMsg.TaskGroup.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (TaskGroup)e.getUnfinishedMessage();
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

         public boolean hasEndTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public long getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(long value) {
            this.bitField0_ |= 2;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -3;
            this.endTime_ = 0L;
            this.onChanged();
            return this;
         }

         private void ensureTasksIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.tasks_ = new ArrayList(this.tasks_);
               this.bitField0_ |= 4;
            }

         }

         public List<CommonMsg.Task> getTasksList() {
            return this.tasksBuilder_ == null ? Collections.unmodifiableList(this.tasks_) : this.tasksBuilder_.getMessageList();
         }

         public int getTasksCount() {
            return this.tasksBuilder_ == null ? this.tasks_.size() : this.tasksBuilder_.getCount();
         }

         public CommonMsg.Task getTasks(int index) {
            return this.tasksBuilder_ == null ? (CommonMsg.Task)this.tasks_.get(index) : (CommonMsg.Task)this.tasksBuilder_.getMessage(index);
         }

         public Builder setTasks(int index, CommonMsg.Task value) {
            if (this.tasksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTasksIsMutable();
               this.tasks_.set(index, value);
               this.onChanged();
            } else {
               this.tasksBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTasks(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.tasksBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTasks(CommonMsg.Task value) {
            if (this.tasksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTasksIsMutable();
               this.tasks_.add(value);
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTasks(int index, CommonMsg.Task value) {
            if (this.tasksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTasksIsMutable();
               this.tasks_.add(index, value);
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTasks(CommonMsg.Task.Builder builderForValue) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTasks(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTasks(Iterable<? extends CommonMsg.Task> values) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.tasks_);
               this.onChanged();
            } else {
               this.tasksBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTasks() {
            if (this.tasksBuilder_ == null) {
               this.tasks_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.tasksBuilder_.clear();
            }

            return this;
         }

         public Builder removeTasks(int index) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.remove(index);
               this.onChanged();
            } else {
               this.tasksBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.Task.Builder getTasksBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTasksFieldBuilder().getBuilder(index);
         }

         public CommonMsg.TaskOrBuilder getTasksOrBuilder(int index) {
            return this.tasksBuilder_ == null ? (CommonMsg.TaskOrBuilder)this.tasks_.get(index) : (CommonMsg.TaskOrBuilder)this.tasksBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.TaskOrBuilder> getTasksOrBuilderList() {
            return this.tasksBuilder_ != null ? this.tasksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.tasks_);
         }

         public CommonMsg.Task.Builder addTasksBuilder() {
            return (CommonMsg.Task.Builder)this.getTasksFieldBuilder().addBuilder(CommonMsg.Task.getDefaultInstance());
         }

         public CommonMsg.Task.Builder addTasksBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTasksFieldBuilder().addBuilder(index, CommonMsg.Task.getDefaultInstance());
         }

         public List<CommonMsg.Task.Builder> getTasksBuilderList() {
            return this.getTasksFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> getTasksFieldBuilder() {
            if (this.tasksBuilder_ == null) {
               this.tasksBuilder_ = new RepeatedFieldBuilderV3(this.tasks_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.tasks_ = null;
            }

            return this.tasksBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class CityHoldChangeData extends GeneratedMessageV3 implements CityHoldChangeDataOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HOLDINFO_FIELD_NUMBER = 1;
      private CityHoldInfo holdInfo_;
      public static final int SOURCECITYID_FIELD_NUMBER = 2;
      private int sourceCityId_;
      public static final int TARGETCITYID_FIELD_NUMBER = 3;
      private int targetCityId_;
      private byte memoizedIsInitialized;
      private static final CityHoldChangeData DEFAULT_INSTANCE = new CityHoldChangeData();
      /** @deprecated */
      @Deprecated
      public static final Parser<CityHoldChangeData> PARSER = new AbstractParser<CityHoldChangeData>() {
         public CityHoldChangeData parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CityHoldChangeData(input, extensionRegistry);
         }
      };

      private CityHoldChangeData(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CityHoldChangeData() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CityHoldChangeData();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CityHoldChangeData(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        CityHoldInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.holdInfo_.toBuilder();
                        }

                        this.holdInfo_ = (CityHoldInfo)input.readMessage(DemonStrikesMsg.CityHoldInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.holdInfo_);
                           this.holdInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.sourceCityId_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.targetCityId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_CityHoldChangeData_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_CityHoldChangeData_fieldAccessorTable.ensureFieldAccessorsInitialized(CityHoldChangeData.class, Builder.class);
      }

      public boolean hasHoldInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public CityHoldInfo getHoldInfo() {
         return this.holdInfo_ == null ? DemonStrikesMsg.CityHoldInfo.getDefaultInstance() : this.holdInfo_;
      }

      public CityHoldInfoOrBuilder getHoldInfoOrBuilder() {
         return this.holdInfo_ == null ? DemonStrikesMsg.CityHoldInfo.getDefaultInstance() : this.holdInfo_;
      }

      public boolean hasSourceCityId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSourceCityId() {
         return this.sourceCityId_;
      }

      public boolean hasTargetCityId() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getTargetCityId() {
         return this.targetCityId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasHoldInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSourceCityId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTargetCityId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getHoldInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getHoldInfo());
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.sourceCityId_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.targetCityId_);
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
               size += CodedOutputStream.computeMessageSize(1, this.getHoldInfo());
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.sourceCityId_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.targetCityId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CityHoldChangeData)) {
            return super.equals(obj);
         } else {
            CityHoldChangeData other = (CityHoldChangeData)obj;
            if (this.hasHoldInfo() != other.hasHoldInfo()) {
               return false;
            } else if (this.hasHoldInfo() && !this.getHoldInfo().equals(other.getHoldInfo())) {
               return false;
            } else if (this.hasSourceCityId() != other.hasSourceCityId()) {
               return false;
            } else if (this.hasSourceCityId() && this.getSourceCityId() != other.getSourceCityId()) {
               return false;
            } else if (this.hasTargetCityId() != other.hasTargetCityId()) {
               return false;
            } else if (this.hasTargetCityId() && this.getTargetCityId() != other.getTargetCityId()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasHoldInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getHoldInfo().hashCode();
            }

            if (this.hasSourceCityId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSourceCityId();
            }

            if (this.hasTargetCityId()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTargetCityId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CityHoldChangeData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CityHoldChangeData)PARSER.parseFrom(data);
      }

      public static CityHoldChangeData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CityHoldChangeData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CityHoldChangeData parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CityHoldChangeData)PARSER.parseFrom(data);
      }

      public static CityHoldChangeData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CityHoldChangeData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CityHoldChangeData parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CityHoldChangeData)PARSER.parseFrom(data);
      }

      public static CityHoldChangeData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CityHoldChangeData)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CityHoldChangeData parseFrom(InputStream input) throws IOException {
         return (CityHoldChangeData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CityHoldChangeData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CityHoldChangeData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CityHoldChangeData parseDelimitedFrom(InputStream input) throws IOException {
         return (CityHoldChangeData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CityHoldChangeData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CityHoldChangeData)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CityHoldChangeData parseFrom(CodedInputStream input) throws IOException {
         return (CityHoldChangeData)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CityHoldChangeData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CityHoldChangeData)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CityHoldChangeData prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CityHoldChangeData getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CityHoldChangeData> parser() {
         return PARSER;
      }

      public Parser<CityHoldChangeData> getParserForType() {
         return PARSER;
      }

      public CityHoldChangeData getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CityHoldChangeDataOrBuilder {
         private int bitField0_;
         private CityHoldInfo holdInfo_;
         private SingleFieldBuilderV3<CityHoldInfo, CityHoldInfo.Builder, CityHoldInfoOrBuilder> holdInfoBuilder_;
         private int sourceCityId_;
         private int targetCityId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_CityHoldChangeData_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_CityHoldChangeData_fieldAccessorTable.ensureFieldAccessorsInitialized(CityHoldChangeData.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.CityHoldChangeData.alwaysUseFieldBuilders) {
               this.getHoldInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.holdInfoBuilder_ == null) {
               this.holdInfo_ = null;
            } else {
               this.holdInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            this.sourceCityId_ = 0;
            this.bitField0_ &= -3;
            this.targetCityId_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_CityHoldChangeData_descriptor;
         }

         public CityHoldChangeData getDefaultInstanceForType() {
            return DemonStrikesMsg.CityHoldChangeData.getDefaultInstance();
         }

         public CityHoldChangeData build() {
            CityHoldChangeData result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CityHoldChangeData buildPartial() {
            CityHoldChangeData result = new CityHoldChangeData(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.holdInfoBuilder_ == null) {
                  result.holdInfo_ = this.holdInfo_;
               } else {
                  result.holdInfo_ = (CityHoldInfo)this.holdInfoBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.sourceCityId_ = this.sourceCityId_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.targetCityId_ = this.targetCityId_;
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
            if (other instanceof CityHoldChangeData) {
               return this.mergeFrom((CityHoldChangeData)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CityHoldChangeData other) {
            if (other == DemonStrikesMsg.CityHoldChangeData.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHoldInfo()) {
                  this.mergeHoldInfo(other.getHoldInfo());
               }

               if (other.hasSourceCityId()) {
                  this.setSourceCityId(other.getSourceCityId());
               }

               if (other.hasTargetCityId()) {
                  this.setTargetCityId(other.getTargetCityId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHoldInfo()) {
               return false;
            } else if (!this.hasSourceCityId()) {
               return false;
            } else if (!this.hasTargetCityId()) {
               return false;
            } else {
               return this.getHoldInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CityHoldChangeData parsedMessage = null;

            try {
               parsedMessage = (CityHoldChangeData)DemonStrikesMsg.CityHoldChangeData.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CityHoldChangeData)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasHoldInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public CityHoldInfo getHoldInfo() {
            if (this.holdInfoBuilder_ == null) {
               return this.holdInfo_ == null ? DemonStrikesMsg.CityHoldInfo.getDefaultInstance() : this.holdInfo_;
            } else {
               return (CityHoldInfo)this.holdInfoBuilder_.getMessage();
            }
         }

         public Builder setHoldInfo(CityHoldInfo value) {
            if (this.holdInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.holdInfo_ = value;
               this.onChanged();
            } else {
               this.holdInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setHoldInfo(CityHoldInfo.Builder builderForValue) {
            if (this.holdInfoBuilder_ == null) {
               this.holdInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.holdInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeHoldInfo(CityHoldInfo value) {
            if (this.holdInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.holdInfo_ != null && this.holdInfo_ != DemonStrikesMsg.CityHoldInfo.getDefaultInstance()) {
                  this.holdInfo_ = DemonStrikesMsg.CityHoldInfo.newBuilder(this.holdInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.holdInfo_ = value;
               }

               this.onChanged();
            } else {
               this.holdInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearHoldInfo() {
            if (this.holdInfoBuilder_ == null) {
               this.holdInfo_ = null;
               this.onChanged();
            } else {
               this.holdInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public CityHoldInfo.Builder getHoldInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (CityHoldInfo.Builder)this.getHoldInfoFieldBuilder().getBuilder();
         }

         public CityHoldInfoOrBuilder getHoldInfoOrBuilder() {
            if (this.holdInfoBuilder_ != null) {
               return (CityHoldInfoOrBuilder)this.holdInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.holdInfo_ == null ? DemonStrikesMsg.CityHoldInfo.getDefaultInstance() : this.holdInfo_;
            }
         }

         private SingleFieldBuilderV3<CityHoldInfo, CityHoldInfo.Builder, CityHoldInfoOrBuilder> getHoldInfoFieldBuilder() {
            if (this.holdInfoBuilder_ == null) {
               this.holdInfoBuilder_ = new SingleFieldBuilderV3(this.getHoldInfo(), this.getParentForChildren(), this.isClean());
               this.holdInfo_ = null;
            }

            return this.holdInfoBuilder_;
         }

         public boolean hasSourceCityId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSourceCityId() {
            return this.sourceCityId_;
         }

         public Builder setSourceCityId(int value) {
            this.bitField0_ |= 2;
            this.sourceCityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSourceCityId() {
            this.bitField0_ &= -3;
            this.sourceCityId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTargetCityId() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getTargetCityId() {
            return this.targetCityId_;
         }

         public Builder setTargetCityId(int value) {
            this.bitField0_ |= 4;
            this.targetCityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTargetCityId() {
            this.bitField0_ &= -5;
            this.targetCityId_ = 0;
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

   public static final class C2S_DemonStrikes_13901 extends GeneratedMessageV3 implements C2S_DemonStrikes_13901OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_DemonStrikes_13901 DEFAULT_INSTANCE = new C2S_DemonStrikes_13901();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_DemonStrikes_13901> PARSER = new AbstractParser<C2S_DemonStrikes_13901>() {
         public C2S_DemonStrikes_13901 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_DemonStrikes_13901(input, extensionRegistry);
         }
      };

      private C2S_DemonStrikes_13901(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_DemonStrikes_13901() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_DemonStrikes_13901();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_DemonStrikes_13901(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_DemonStrikes_13901_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_DemonStrikes_13901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DemonStrikes_13901.class, Builder.class);
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
         } else if (!(obj instanceof C2S_DemonStrikes_13901)) {
            return super.equals(obj);
         } else {
            C2S_DemonStrikes_13901 other = (C2S_DemonStrikes_13901)obj;
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

      public static C2S_DemonStrikes_13901 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_DemonStrikes_13901)PARSER.parseFrom(data);
      }

      public static C2S_DemonStrikes_13901 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DemonStrikes_13901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DemonStrikes_13901 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_DemonStrikes_13901)PARSER.parseFrom(data);
      }

      public static C2S_DemonStrikes_13901 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DemonStrikes_13901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DemonStrikes_13901 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_DemonStrikes_13901)PARSER.parseFrom(data);
      }

      public static C2S_DemonStrikes_13901 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_DemonStrikes_13901)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_DemonStrikes_13901 parseFrom(InputStream input) throws IOException {
         return (C2S_DemonStrikes_13901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DemonStrikes_13901 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DemonStrikes_13901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DemonStrikes_13901 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_DemonStrikes_13901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_DemonStrikes_13901 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DemonStrikes_13901)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_DemonStrikes_13901 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_DemonStrikes_13901)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_DemonStrikes_13901 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_DemonStrikes_13901)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_DemonStrikes_13901 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_DemonStrikes_13901 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_DemonStrikes_13901> parser() {
         return PARSER;
      }

      public Parser<C2S_DemonStrikes_13901> getParserForType() {
         return PARSER;
      }

      public C2S_DemonStrikes_13901 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_DemonStrikes_13901OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_DemonStrikes_13901_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_DemonStrikes_13901_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_DemonStrikes_13901.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.C2S_DemonStrikes_13901.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_DemonStrikes_13901_descriptor;
         }

         public C2S_DemonStrikes_13901 getDefaultInstanceForType() {
            return DemonStrikesMsg.C2S_DemonStrikes_13901.getDefaultInstance();
         }

         public C2S_DemonStrikes_13901 build() {
            C2S_DemonStrikes_13901 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_DemonStrikes_13901 buildPartial() {
            C2S_DemonStrikes_13901 result = new C2S_DemonStrikes_13901(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_DemonStrikes_13901) {
               return this.mergeFrom((C2S_DemonStrikes_13901)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_DemonStrikes_13901 other) {
            if (other == DemonStrikesMsg.C2S_DemonStrikes_13901.getDefaultInstance()) {
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
            C2S_DemonStrikes_13901 parsedMessage = null;

            try {
               parsedMessage = (C2S_DemonStrikes_13901)DemonStrikesMsg.C2S_DemonStrikes_13901.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_DemonStrikes_13901)e.getUnfinishedMessage();
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

   public static final class S2C_DemonStrikes_13902 extends GeneratedMessageV3 implements S2C_DemonStrikes_13902OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int STATE_FIELD_NUMBER = 1;
      private int state_;
      public static final int STARTTIME_FIELD_NUMBER = 2;
      private int startTime_;
      public static final int ENDTIME_FIELD_NUMBER = 3;
      private int endTime_;
      public static final int MAPID_FIELD_NUMBER = 4;
      private int mapId_;
      public static final int CITYREWARD_FIELD_NUMBER = 5;
      private boolean cityReward_;
      public static final int INTEGRALREWARD_FIELD_NUMBER = 6;
      private boolean integralReward_;
      private byte memoizedIsInitialized;
      private static final S2C_DemonStrikes_13902 DEFAULT_INSTANCE = new S2C_DemonStrikes_13902();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_DemonStrikes_13902> PARSER = new AbstractParser<S2C_DemonStrikes_13902>() {
         public S2C_DemonStrikes_13902 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_DemonStrikes_13902(input, extensionRegistry);
         }
      };

      private S2C_DemonStrikes_13902(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_DemonStrikes_13902() {
         this.memoizedIsInitialized = -1;
         this.state_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_DemonStrikes_13902();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_DemonStrikes_13902(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        SystemState value = DemonStrikesMsg.SystemState.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.state_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.startTime_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.endTime_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.mapId_ = input.readInt32();
                        break;
                     case 40:
                        this.bitField0_ |= 16;
                        this.cityReward_ = input.readBool();
                        break;
                     case 48:
                        this.bitField0_ |= 32;
                        this.integralReward_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_DemonStrikes_13902_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_DemonStrikes_13902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DemonStrikes_13902.class, Builder.class);
      }

      public boolean hasState() {
         return (this.bitField0_ & 1) != 0;
      }

      public SystemState getState() {
         SystemState result = DemonStrikesMsg.SystemState.valueOf(this.state_);
         return result == null ? DemonStrikesMsg.SystemState.OPEN : result;
      }

      public boolean hasStartTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStartTime() {
         return this.startTime_;
      }

      public boolean hasEndTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getEndTime() {
         return this.endTime_;
      }

      public boolean hasMapId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getMapId() {
         return this.mapId_;
      }

      public boolean hasCityReward() {
         return (this.bitField0_ & 16) != 0;
      }

      public boolean getCityReward() {
         return this.cityReward_;
      }

      public boolean hasIntegralReward() {
         return (this.bitField0_ & 32) != 0;
      }

      public boolean getIntegralReward() {
         return this.integralReward_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasState()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStartTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasEndTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMapId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasCityReward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIntegralReward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.state_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.startTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.endTime_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.mapId_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeBool(5, this.cityReward_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeBool(6, this.integralReward_);
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
               size += CodedOutputStream.computeEnumSize(1, this.state_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.startTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.endTime_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.mapId_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeBoolSize(5, this.cityReward_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeBoolSize(6, this.integralReward_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_DemonStrikes_13902)) {
            return super.equals(obj);
         } else {
            S2C_DemonStrikes_13902 other = (S2C_DemonStrikes_13902)obj;
            if (this.hasState() != other.hasState()) {
               return false;
            } else if (this.hasState() && this.state_ != other.state_) {
               return false;
            } else if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
               return false;
            } else if (this.hasEndTime() != other.hasEndTime()) {
               return false;
            } else if (this.hasEndTime() && this.getEndTime() != other.getEndTime()) {
               return false;
            } else if (this.hasMapId() != other.hasMapId()) {
               return false;
            } else if (this.hasMapId() && this.getMapId() != other.getMapId()) {
               return false;
            } else if (this.hasCityReward() != other.hasCityReward()) {
               return false;
            } else if (this.hasCityReward() && this.getCityReward() != other.getCityReward()) {
               return false;
            } else if (this.hasIntegralReward() != other.hasIntegralReward()) {
               return false;
            } else if (this.hasIntegralReward() && this.getIntegralReward() != other.getIntegralReward()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasState()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.state_;
            }

            if (this.hasStartTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStartTime();
            }

            if (this.hasEndTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getEndTime();
            }

            if (this.hasMapId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getMapId();
            }

            if (this.hasCityReward()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + Internal.hashBoolean(this.getCityReward());
            }

            if (this.hasIntegralReward()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + Internal.hashBoolean(this.getIntegralReward());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_DemonStrikes_13902 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_DemonStrikes_13902)PARSER.parseFrom(data);
      }

      public static S2C_DemonStrikes_13902 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DemonStrikes_13902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DemonStrikes_13902 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_DemonStrikes_13902)PARSER.parseFrom(data);
      }

      public static S2C_DemonStrikes_13902 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DemonStrikes_13902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DemonStrikes_13902 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_DemonStrikes_13902)PARSER.parseFrom(data);
      }

      public static S2C_DemonStrikes_13902 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_DemonStrikes_13902)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_DemonStrikes_13902 parseFrom(InputStream input) throws IOException {
         return (S2C_DemonStrikes_13902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DemonStrikes_13902 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DemonStrikes_13902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DemonStrikes_13902 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_DemonStrikes_13902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_DemonStrikes_13902 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DemonStrikes_13902)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_DemonStrikes_13902 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_DemonStrikes_13902)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_DemonStrikes_13902 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_DemonStrikes_13902)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_DemonStrikes_13902 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_DemonStrikes_13902 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_DemonStrikes_13902> parser() {
         return PARSER;
      }

      public Parser<S2C_DemonStrikes_13902> getParserForType() {
         return PARSER;
      }

      public S2C_DemonStrikes_13902 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_DemonStrikes_13902OrBuilder {
         private int bitField0_;
         private int state_;
         private int startTime_;
         private int endTime_;
         private int mapId_;
         private boolean cityReward_;
         private boolean integralReward_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_DemonStrikes_13902_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_DemonStrikes_13902_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_DemonStrikes_13902.class, Builder.class);
         }

         private Builder() {
            this.state_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.state_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.S2C_DemonStrikes_13902.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.state_ = 1;
            this.bitField0_ &= -2;
            this.startTime_ = 0;
            this.bitField0_ &= -3;
            this.endTime_ = 0;
            this.bitField0_ &= -5;
            this.mapId_ = 0;
            this.bitField0_ &= -9;
            this.cityReward_ = false;
            this.bitField0_ &= -17;
            this.integralReward_ = false;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_DemonStrikes_13902_descriptor;
         }

         public S2C_DemonStrikes_13902 getDefaultInstanceForType() {
            return DemonStrikesMsg.S2C_DemonStrikes_13902.getDefaultInstance();
         }

         public S2C_DemonStrikes_13902 build() {
            S2C_DemonStrikes_13902 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_DemonStrikes_13902 buildPartial() {
            S2C_DemonStrikes_13902 result = new S2C_DemonStrikes_13902(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.state_ = this.state_;
            if ((from_bitField0_ & 2) != 0) {
               result.startTime_ = this.startTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.endTime_ = this.endTime_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.mapId_ = this.mapId_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.cityReward_ = this.cityReward_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.integralReward_ = this.integralReward_;
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
            if (other instanceof S2C_DemonStrikes_13902) {
               return this.mergeFrom((S2C_DemonStrikes_13902)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_DemonStrikes_13902 other) {
            if (other == DemonStrikesMsg.S2C_DemonStrikes_13902.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasState()) {
                  this.setState(other.getState());
               }

               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
               }

               if (other.hasEndTime()) {
                  this.setEndTime(other.getEndTime());
               }

               if (other.hasMapId()) {
                  this.setMapId(other.getMapId());
               }

               if (other.hasCityReward()) {
                  this.setCityReward(other.getCityReward());
               }

               if (other.hasIntegralReward()) {
                  this.setIntegralReward(other.getIntegralReward());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasState()) {
               return false;
            } else if (!this.hasStartTime()) {
               return false;
            } else if (!this.hasEndTime()) {
               return false;
            } else if (!this.hasMapId()) {
               return false;
            } else if (!this.hasCityReward()) {
               return false;
            } else {
               return this.hasIntegralReward();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_DemonStrikes_13902 parsedMessage = null;

            try {
               parsedMessage = (S2C_DemonStrikes_13902)DemonStrikesMsg.S2C_DemonStrikes_13902.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_DemonStrikes_13902)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasState() {
            return (this.bitField0_ & 1) != 0;
         }

         public SystemState getState() {
            SystemState result = DemonStrikesMsg.SystemState.valueOf(this.state_);
            return result == null ? DemonStrikesMsg.SystemState.OPEN : result;
         }

         public Builder setState(SystemState value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.state_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearState() {
            this.bitField0_ &= -2;
            this.state_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasStartTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getStartTime() {
            return this.startTime_;
         }

         public Builder setStartTime(int value) {
            this.bitField0_ |= 2;
            this.startTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearStartTime() {
            this.bitField0_ &= -3;
            this.startTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasEndTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getEndTime() {
            return this.endTime_;
         }

         public Builder setEndTime(int value) {
            this.bitField0_ |= 4;
            this.endTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearEndTime() {
            this.bitField0_ &= -5;
            this.endTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMapId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getMapId() {
            return this.mapId_;
         }

         public Builder setMapId(int value) {
            this.bitField0_ |= 8;
            this.mapId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMapId() {
            this.bitField0_ &= -9;
            this.mapId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasCityReward() {
            return (this.bitField0_ & 16) != 0;
         }

         public boolean getCityReward() {
            return this.cityReward_;
         }

         public Builder setCityReward(boolean value) {
            this.bitField0_ |= 16;
            this.cityReward_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCityReward() {
            this.bitField0_ &= -17;
            this.cityReward_ = false;
            this.onChanged();
            return this;
         }

         public boolean hasIntegralReward() {
            return (this.bitField0_ & 32) != 0;
         }

         public boolean getIntegralReward() {
            return this.integralReward_;
         }

         public Builder setIntegralReward(boolean value) {
            this.bitField0_ |= 32;
            this.integralReward_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIntegralReward() {
            this.bitField0_ &= -33;
            this.integralReward_ = false;
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

   public static final class C2S_Main_13903 extends GeneratedMessageV3 implements C2S_Main_13903OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int EXIT_FIELD_NUMBER = 1;
      private boolean exit_;
      private byte memoizedIsInitialized;
      private static final C2S_Main_13903 DEFAULT_INSTANCE = new C2S_Main_13903();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Main_13903> PARSER = new AbstractParser<C2S_Main_13903>() {
         public C2S_Main_13903 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Main_13903(input, extensionRegistry);
         }
      };

      private C2S_Main_13903(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Main_13903() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Main_13903();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Main_13903(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.exit_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_Main_13903_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_Main_13903_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Main_13903.class, Builder.class);
      }

      public boolean hasExit() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getExit() {
         return this.exit_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasExit()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.exit_);
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
               size += CodedOutputStream.computeBoolSize(1, this.exit_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Main_13903)) {
            return super.equals(obj);
         } else {
            C2S_Main_13903 other = (C2S_Main_13903)obj;
            if (this.hasExit() != other.hasExit()) {
               return false;
            } else if (this.hasExit() && this.getExit() != other.getExit()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasExit()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getExit());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Main_13903 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Main_13903)PARSER.parseFrom(data);
      }

      public static C2S_Main_13903 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_13903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_13903 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Main_13903)PARSER.parseFrom(data);
      }

      public static C2S_Main_13903 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_13903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_13903 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Main_13903)PARSER.parseFrom(data);
      }

      public static C2S_Main_13903 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Main_13903)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Main_13903 parseFrom(InputStream input) throws IOException {
         return (C2S_Main_13903)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Main_13903 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_13903)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Main_13903 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Main_13903)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Main_13903 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_13903)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Main_13903 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Main_13903)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Main_13903 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Main_13903)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Main_13903 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Main_13903 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Main_13903> parser() {
         return PARSER;
      }

      public Parser<C2S_Main_13903> getParserForType() {
         return PARSER;
      }

      public C2S_Main_13903 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Main_13903OrBuilder {
         private int bitField0_;
         private boolean exit_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_Main_13903_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_Main_13903_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Main_13903.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.C2S_Main_13903.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.exit_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_Main_13903_descriptor;
         }

         public C2S_Main_13903 getDefaultInstanceForType() {
            return DemonStrikesMsg.C2S_Main_13903.getDefaultInstance();
         }

         public C2S_Main_13903 build() {
            C2S_Main_13903 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Main_13903 buildPartial() {
            C2S_Main_13903 result = new C2S_Main_13903(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.exit_ = this.exit_;
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
            if (other instanceof C2S_Main_13903) {
               return this.mergeFrom((C2S_Main_13903)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Main_13903 other) {
            if (other == DemonStrikesMsg.C2S_Main_13903.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasExit()) {
                  this.setExit(other.getExit());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasExit();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Main_13903 parsedMessage = null;

            try {
               parsedMessage = (C2S_Main_13903)DemonStrikesMsg.C2S_Main_13903.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Main_13903)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasExit() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getExit() {
            return this.exit_;
         }

         public Builder setExit(boolean value) {
            this.bitField0_ |= 1;
            this.exit_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearExit() {
            this.bitField0_ &= -2;
            this.exit_ = false;
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

   public static final class S2C_Main_13904 extends GeneratedMessageV3 implements S2C_Main_13904OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INCITY_FIELD_NUMBER = 1;
      private int inCity_;
      public static final int CITY_FIELD_NUMBER = 2;
      private List<CityInfo> city_;
      public static final int ATKRECOVERTIME_FIELD_NUMBER = 3;
      private int atkRecoverTime_;
      public static final int MOVERECOVERTIME_FIELD_NUMBER = 4;
      private int moveRecoverTime_;
      private byte memoizedIsInitialized;
      private static final S2C_Main_13904 DEFAULT_INSTANCE = new S2C_Main_13904();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Main_13904> PARSER = new AbstractParser<S2C_Main_13904>() {
         public S2C_Main_13904 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Main_13904(input, extensionRegistry);
         }
      };

      private S2C_Main_13904(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Main_13904() {
         this.memoizedIsInitialized = -1;
         this.city_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Main_13904();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Main_13904(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.inCity_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.city_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.city_.add(input.readMessage(DemonStrikesMsg.CityInfo.PARSER, extensionRegistry));
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.atkRecoverTime_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 4;
                        this.moveRecoverTime_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.city_ = Collections.unmodifiableList(this.city_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_Main_13904_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_Main_13904_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Main_13904.class, Builder.class);
      }

      public boolean hasInCity() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getInCity() {
         return this.inCity_;
      }

      public List<CityInfo> getCityList() {
         return this.city_;
      }

      public List<? extends CityInfoOrBuilder> getCityOrBuilderList() {
         return this.city_;
      }

      public int getCityCount() {
         return this.city_.size();
      }

      public CityInfo getCity(int index) {
         return (CityInfo)this.city_.get(index);
      }

      public CityInfoOrBuilder getCityOrBuilder(int index) {
         return (CityInfoOrBuilder)this.city_.get(index);
      }

      public boolean hasAtkRecoverTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getAtkRecoverTime() {
         return this.atkRecoverTime_;
      }

      public boolean hasMoveRecoverTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getMoveRecoverTime() {
         return this.moveRecoverTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasInCity()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasAtkRecoverTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMoveRecoverTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getCityCount(); ++i) {
               if (!this.getCity(i).isInitialized()) {
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
            output.writeInt32(1, this.inCity_);
         }

         for(int i = 0; i < this.city_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.city_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.atkRecoverTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(4, this.moveRecoverTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.inCity_);
            }

            for(int i = 0; i < this.city_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.city_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.atkRecoverTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.moveRecoverTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Main_13904)) {
            return super.equals(obj);
         } else {
            S2C_Main_13904 other = (S2C_Main_13904)obj;
            if (this.hasInCity() != other.hasInCity()) {
               return false;
            } else if (this.hasInCity() && this.getInCity() != other.getInCity()) {
               return false;
            } else if (!this.getCityList().equals(other.getCityList())) {
               return false;
            } else if (this.hasAtkRecoverTime() != other.hasAtkRecoverTime()) {
               return false;
            } else if (this.hasAtkRecoverTime() && this.getAtkRecoverTime() != other.getAtkRecoverTime()) {
               return false;
            } else if (this.hasMoveRecoverTime() != other.hasMoveRecoverTime()) {
               return false;
            } else if (this.hasMoveRecoverTime() && this.getMoveRecoverTime() != other.getMoveRecoverTime()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasInCity()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getInCity();
            }

            if (this.getCityCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getCityList().hashCode();
            }

            if (this.hasAtkRecoverTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getAtkRecoverTime();
            }

            if (this.hasMoveRecoverTime()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getMoveRecoverTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Main_13904 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Main_13904)PARSER.parseFrom(data);
      }

      public static S2C_Main_13904 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Main_13904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Main_13904 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Main_13904)PARSER.parseFrom(data);
      }

      public static S2C_Main_13904 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Main_13904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Main_13904 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Main_13904)PARSER.parseFrom(data);
      }

      public static S2C_Main_13904 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Main_13904)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Main_13904 parseFrom(InputStream input) throws IOException {
         return (S2C_Main_13904)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Main_13904 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Main_13904)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Main_13904 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Main_13904)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Main_13904 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Main_13904)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Main_13904 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Main_13904)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Main_13904 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Main_13904)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Main_13904 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Main_13904 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Main_13904> parser() {
         return PARSER;
      }

      public Parser<S2C_Main_13904> getParserForType() {
         return PARSER;
      }

      public S2C_Main_13904 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Main_13904OrBuilder {
         private int bitField0_;
         private int inCity_;
         private List<CityInfo> city_;
         private RepeatedFieldBuilderV3<CityInfo, CityInfo.Builder, CityInfoOrBuilder> cityBuilder_;
         private int atkRecoverTime_;
         private int moveRecoverTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_Main_13904_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_Main_13904_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Main_13904.class, Builder.class);
         }

         private Builder() {
            this.city_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.city_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.S2C_Main_13904.alwaysUseFieldBuilders) {
               this.getCityFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.inCity_ = 0;
            this.bitField0_ &= -2;
            if (this.cityBuilder_ == null) {
               this.city_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.cityBuilder_.clear();
            }

            this.atkRecoverTime_ = 0;
            this.bitField0_ &= -5;
            this.moveRecoverTime_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_Main_13904_descriptor;
         }

         public S2C_Main_13904 getDefaultInstanceForType() {
            return DemonStrikesMsg.S2C_Main_13904.getDefaultInstance();
         }

         public S2C_Main_13904 build() {
            S2C_Main_13904 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Main_13904 buildPartial() {
            S2C_Main_13904 result = new S2C_Main_13904(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.inCity_ = this.inCity_;
               to_bitField0_ |= 1;
            }

            if (this.cityBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.city_ = Collections.unmodifiableList(this.city_);
                  this.bitField0_ &= -3;
               }

               result.city_ = this.city_;
            } else {
               result.city_ = this.cityBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.atkRecoverTime_ = this.atkRecoverTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.moveRecoverTime_ = this.moveRecoverTime_;
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
            if (other instanceof S2C_Main_13904) {
               return this.mergeFrom((S2C_Main_13904)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Main_13904 other) {
            if (other == DemonStrikesMsg.S2C_Main_13904.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasInCity()) {
                  this.setInCity(other.getInCity());
               }

               if (this.cityBuilder_ == null) {
                  if (!other.city_.isEmpty()) {
                     if (this.city_.isEmpty()) {
                        this.city_ = other.city_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureCityIsMutable();
                        this.city_.addAll(other.city_);
                     }

                     this.onChanged();
                  }
               } else if (!other.city_.isEmpty()) {
                  if (this.cityBuilder_.isEmpty()) {
                     this.cityBuilder_.dispose();
                     this.cityBuilder_ = null;
                     this.city_ = other.city_;
                     this.bitField0_ &= -3;
                     this.cityBuilder_ = DemonStrikesMsg.S2C_Main_13904.alwaysUseFieldBuilders ? this.getCityFieldBuilder() : null;
                  } else {
                     this.cityBuilder_.addAllMessages(other.city_);
                  }
               }

               if (other.hasAtkRecoverTime()) {
                  this.setAtkRecoverTime(other.getAtkRecoverTime());
               }

               if (other.hasMoveRecoverTime()) {
                  this.setMoveRecoverTime(other.getMoveRecoverTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasInCity()) {
               return false;
            } else if (!this.hasAtkRecoverTime()) {
               return false;
            } else if (!this.hasMoveRecoverTime()) {
               return false;
            } else {
               for(int i = 0; i < this.getCityCount(); ++i) {
                  if (!this.getCity(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Main_13904 parsedMessage = null;

            try {
               parsedMessage = (S2C_Main_13904)DemonStrikesMsg.S2C_Main_13904.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Main_13904)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasInCity() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getInCity() {
            return this.inCity_;
         }

         public Builder setInCity(int value) {
            this.bitField0_ |= 1;
            this.inCity_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearInCity() {
            this.bitField0_ &= -2;
            this.inCity_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureCityIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.city_ = new ArrayList(this.city_);
               this.bitField0_ |= 2;
            }

         }

         public List<CityInfo> getCityList() {
            return this.cityBuilder_ == null ? Collections.unmodifiableList(this.city_) : this.cityBuilder_.getMessageList();
         }

         public int getCityCount() {
            return this.cityBuilder_ == null ? this.city_.size() : this.cityBuilder_.getCount();
         }

         public CityInfo getCity(int index) {
            return this.cityBuilder_ == null ? (CityInfo)this.city_.get(index) : (CityInfo)this.cityBuilder_.getMessage(index);
         }

         public Builder setCity(int index, CityInfo value) {
            if (this.cityBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCityIsMutable();
               this.city_.set(index, value);
               this.onChanged();
            } else {
               this.cityBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setCity(int index, CityInfo.Builder builderForValue) {
            if (this.cityBuilder_ == null) {
               this.ensureCityIsMutable();
               this.city_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.cityBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addCity(CityInfo value) {
            if (this.cityBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCityIsMutable();
               this.city_.add(value);
               this.onChanged();
            } else {
               this.cityBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addCity(int index, CityInfo value) {
            if (this.cityBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCityIsMutable();
               this.city_.add(index, value);
               this.onChanged();
            } else {
               this.cityBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addCity(CityInfo.Builder builderForValue) {
            if (this.cityBuilder_ == null) {
               this.ensureCityIsMutable();
               this.city_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.cityBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addCity(int index, CityInfo.Builder builderForValue) {
            if (this.cityBuilder_ == null) {
               this.ensureCityIsMutable();
               this.city_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.cityBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllCity(Iterable<? extends CityInfo> values) {
            if (this.cityBuilder_ == null) {
               this.ensureCityIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.city_);
               this.onChanged();
            } else {
               this.cityBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearCity() {
            if (this.cityBuilder_ == null) {
               this.city_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.cityBuilder_.clear();
            }

            return this;
         }

         public Builder removeCity(int index) {
            if (this.cityBuilder_ == null) {
               this.ensureCityIsMutable();
               this.city_.remove(index);
               this.onChanged();
            } else {
               this.cityBuilder_.remove(index);
            }

            return this;
         }

         public CityInfo.Builder getCityBuilder(int index) {
            return (CityInfo.Builder)this.getCityFieldBuilder().getBuilder(index);
         }

         public CityInfoOrBuilder getCityOrBuilder(int index) {
            return this.cityBuilder_ == null ? (CityInfoOrBuilder)this.city_.get(index) : (CityInfoOrBuilder)this.cityBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CityInfoOrBuilder> getCityOrBuilderList() {
            return this.cityBuilder_ != null ? this.cityBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.city_);
         }

         public CityInfo.Builder addCityBuilder() {
            return (CityInfo.Builder)this.getCityFieldBuilder().addBuilder(DemonStrikesMsg.CityInfo.getDefaultInstance());
         }

         public CityInfo.Builder addCityBuilder(int index) {
            return (CityInfo.Builder)this.getCityFieldBuilder().addBuilder(index, DemonStrikesMsg.CityInfo.getDefaultInstance());
         }

         public List<CityInfo.Builder> getCityBuilderList() {
            return this.getCityFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CityInfo, CityInfo.Builder, CityInfoOrBuilder> getCityFieldBuilder() {
            if (this.cityBuilder_ == null) {
               this.cityBuilder_ = new RepeatedFieldBuilderV3(this.city_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.city_ = null;
            }

            return this.cityBuilder_;
         }

         public boolean hasAtkRecoverTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getAtkRecoverTime() {
            return this.atkRecoverTime_;
         }

         public Builder setAtkRecoverTime(int value) {
            this.bitField0_ |= 4;
            this.atkRecoverTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAtkRecoverTime() {
            this.bitField0_ &= -5;
            this.atkRecoverTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMoveRecoverTime() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getMoveRecoverTime() {
            return this.moveRecoverTime_;
         }

         public Builder setMoveRecoverTime(int value) {
            this.bitField0_ |= 8;
            this.moveRecoverTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMoveRecoverTime() {
            this.bitField0_ &= -9;
            this.moveRecoverTime_ = 0;
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

   public static final class C2S_CityInfo_13905 extends GeneratedMessageV3 implements C2S_CityInfo_13905OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CITYID_FIELD_NUMBER = 1;
      private int cityId_;
      public static final int PAGEPARAM_FIELD_NUMBER = 2;
      private CommonMsg.PageInfo pageParam_;
      private byte memoizedIsInitialized;
      private static final C2S_CityInfo_13905 DEFAULT_INSTANCE = new C2S_CityInfo_13905();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CityInfo_13905> PARSER = new AbstractParser<C2S_CityInfo_13905>() {
         public C2S_CityInfo_13905 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CityInfo_13905(input, extensionRegistry);
         }
      };

      private C2S_CityInfo_13905(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CityInfo_13905() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CityInfo_13905();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CityInfo_13905(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.cityId_ = input.readInt32();
                        break;
                     case 18:
                        CommonMsg.PageInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.pageParam_.toBuilder();
                        }

                        this.pageParam_ = (CommonMsg.PageInfo)input.readMessage(CommonMsg.PageInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.pageParam_);
                           this.pageParam_ = subBuilder.buildPartial();
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_CityInfo_13905_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_CityInfo_13905_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CityInfo_13905.class, Builder.class);
      }

      public boolean hasCityId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCityId() {
         return this.cityId_;
      }

      public boolean hasPageParam() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.PageInfo getPageParam() {
         return this.pageParam_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageParam_;
      }

      public CommonMsg.PageInfoOrBuilder getPageParamOrBuilder() {
         return this.pageParam_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageParam_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCityId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPageParam()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getPageParam().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.cityId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getPageParam());
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
               size += CodedOutputStream.computeInt32Size(1, this.cityId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getPageParam());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_CityInfo_13905)) {
            return super.equals(obj);
         } else {
            C2S_CityInfo_13905 other = (C2S_CityInfo_13905)obj;
            if (this.hasCityId() != other.hasCityId()) {
               return false;
            } else if (this.hasCityId() && this.getCityId() != other.getCityId()) {
               return false;
            } else if (this.hasPageParam() != other.hasPageParam()) {
               return false;
            } else if (this.hasPageParam() && !this.getPageParam().equals(other.getPageParam())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasCityId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCityId();
            }

            if (this.hasPageParam()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPageParam().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_CityInfo_13905 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CityInfo_13905)PARSER.parseFrom(data);
      }

      public static C2S_CityInfo_13905 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CityInfo_13905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CityInfo_13905 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CityInfo_13905)PARSER.parseFrom(data);
      }

      public static C2S_CityInfo_13905 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CityInfo_13905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CityInfo_13905 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CityInfo_13905)PARSER.parseFrom(data);
      }

      public static C2S_CityInfo_13905 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CityInfo_13905)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CityInfo_13905 parseFrom(InputStream input) throws IOException {
         return (C2S_CityInfo_13905)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CityInfo_13905 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CityInfo_13905)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CityInfo_13905 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CityInfo_13905)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CityInfo_13905 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CityInfo_13905)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CityInfo_13905 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CityInfo_13905)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CityInfo_13905 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CityInfo_13905)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CityInfo_13905 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CityInfo_13905 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CityInfo_13905> parser() {
         return PARSER;
      }

      public Parser<C2S_CityInfo_13905> getParserForType() {
         return PARSER;
      }

      public C2S_CityInfo_13905 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CityInfo_13905OrBuilder {
         private int bitField0_;
         private int cityId_;
         private CommonMsg.PageInfo pageParam_;
         private SingleFieldBuilderV3<CommonMsg.PageInfo, CommonMsg.PageInfo.Builder, CommonMsg.PageInfoOrBuilder> pageParamBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_CityInfo_13905_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_CityInfo_13905_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CityInfo_13905.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.C2S_CityInfo_13905.alwaysUseFieldBuilders) {
               this.getPageParamFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.cityId_ = 0;
            this.bitField0_ &= -2;
            if (this.pageParamBuilder_ == null) {
               this.pageParam_ = null;
            } else {
               this.pageParamBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_CityInfo_13905_descriptor;
         }

         public C2S_CityInfo_13905 getDefaultInstanceForType() {
            return DemonStrikesMsg.C2S_CityInfo_13905.getDefaultInstance();
         }

         public C2S_CityInfo_13905 build() {
            C2S_CityInfo_13905 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CityInfo_13905 buildPartial() {
            C2S_CityInfo_13905 result = new C2S_CityInfo_13905(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.cityId_ = this.cityId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.pageParamBuilder_ == null) {
                  result.pageParam_ = this.pageParam_;
               } else {
                  result.pageParam_ = (CommonMsg.PageInfo)this.pageParamBuilder_.build();
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
            if (other instanceof C2S_CityInfo_13905) {
               return this.mergeFrom((C2S_CityInfo_13905)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CityInfo_13905 other) {
            if (other == DemonStrikesMsg.C2S_CityInfo_13905.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCityId()) {
                  this.setCityId(other.getCityId());
               }

               if (other.hasPageParam()) {
                  this.mergePageParam(other.getPageParam());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCityId()) {
               return false;
            } else if (!this.hasPageParam()) {
               return false;
            } else {
               return this.getPageParam().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_CityInfo_13905 parsedMessage = null;

            try {
               parsedMessage = (C2S_CityInfo_13905)DemonStrikesMsg.C2S_CityInfo_13905.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CityInfo_13905)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCityId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCityId() {
            return this.cityId_;
         }

         public Builder setCityId(int value) {
            this.bitField0_ |= 1;
            this.cityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCityId() {
            this.bitField0_ &= -2;
            this.cityId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPageParam() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.PageInfo getPageParam() {
            if (this.pageParamBuilder_ == null) {
               return this.pageParam_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageParam_;
            } else {
               return (CommonMsg.PageInfo)this.pageParamBuilder_.getMessage();
            }
         }

         public Builder setPageParam(CommonMsg.PageInfo value) {
            if (this.pageParamBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.pageParam_ = value;
               this.onChanged();
            } else {
               this.pageParamBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setPageParam(CommonMsg.PageInfo.Builder builderForValue) {
            if (this.pageParamBuilder_ == null) {
               this.pageParam_ = builderForValue.build();
               this.onChanged();
            } else {
               this.pageParamBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergePageParam(CommonMsg.PageInfo value) {
            if (this.pageParamBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.pageParam_ != null && this.pageParam_ != CommonMsg.PageInfo.getDefaultInstance()) {
                  this.pageParam_ = CommonMsg.PageInfo.newBuilder(this.pageParam_).mergeFrom(value).buildPartial();
               } else {
                  this.pageParam_ = value;
               }

               this.onChanged();
            } else {
               this.pageParamBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearPageParam() {
            if (this.pageParamBuilder_ == null) {
               this.pageParam_ = null;
               this.onChanged();
            } else {
               this.pageParamBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.PageInfo.Builder getPageParamBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.PageInfo.Builder)this.getPageParamFieldBuilder().getBuilder();
         }

         public CommonMsg.PageInfoOrBuilder getPageParamOrBuilder() {
            if (this.pageParamBuilder_ != null) {
               return (CommonMsg.PageInfoOrBuilder)this.pageParamBuilder_.getMessageOrBuilder();
            } else {
               return this.pageParam_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageParam_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.PageInfo, CommonMsg.PageInfo.Builder, CommonMsg.PageInfoOrBuilder> getPageParamFieldBuilder() {
            if (this.pageParamBuilder_ == null) {
               this.pageParamBuilder_ = new SingleFieldBuilderV3(this.getPageParam(), this.getParentForChildren(), this.isClean());
               this.pageParam_ = null;
            }

            return this.pageParamBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_CityInfo_13906 extends GeneratedMessageV3 implements S2C_CityInfo_13906OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CITYID_FIELD_NUMBER = 1;
      private int cityId_;
      public static final int PAGEINFO_FIELD_NUMBER = 2;
      private CommonMsg.PageInfo pageInfo_;
      public static final int HOLDINFO_FIELD_NUMBER = 3;
      private List<CityHoldInfo> holdInfo_;
      private byte memoizedIsInitialized;
      private static final S2C_CityInfo_13906 DEFAULT_INSTANCE = new S2C_CityInfo_13906();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CityInfo_13906> PARSER = new AbstractParser<S2C_CityInfo_13906>() {
         public S2C_CityInfo_13906 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CityInfo_13906(input, extensionRegistry);
         }
      };

      private S2C_CityInfo_13906(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CityInfo_13906() {
         this.memoizedIsInitialized = -1;
         this.holdInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CityInfo_13906();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CityInfo_13906(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.cityId_ = input.readInt32();
                        break;
                     case 18:
                        CommonMsg.PageInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.pageInfo_.toBuilder();
                        }

                        this.pageInfo_ = (CommonMsg.PageInfo)input.readMessage(CommonMsg.PageInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.pageInfo_);
                           this.pageInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 2;
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.holdInfo_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.holdInfo_.add(input.readMessage(DemonStrikesMsg.CityHoldInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.holdInfo_ = Collections.unmodifiableList(this.holdInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityInfo_13906_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityInfo_13906_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CityInfo_13906.class, Builder.class);
      }

      public boolean hasCityId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCityId() {
         return this.cityId_;
      }

      public boolean hasPageInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      public CommonMsg.PageInfo getPageInfo() {
         return this.pageInfo_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageInfo_;
      }

      public CommonMsg.PageInfoOrBuilder getPageInfoOrBuilder() {
         return this.pageInfo_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageInfo_;
      }

      public List<CityHoldInfo> getHoldInfoList() {
         return this.holdInfo_;
      }

      public List<? extends CityHoldInfoOrBuilder> getHoldInfoOrBuilderList() {
         return this.holdInfo_;
      }

      public int getHoldInfoCount() {
         return this.holdInfo_.size();
      }

      public CityHoldInfo getHoldInfo(int index) {
         return (CityHoldInfo)this.holdInfo_.get(index);
      }

      public CityHoldInfoOrBuilder getHoldInfoOrBuilder(int index) {
         return (CityHoldInfoOrBuilder)this.holdInfo_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCityId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasPageInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getPageInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getHoldInfoCount(); ++i) {
               if (!this.getHoldInfo(i).isInitialized()) {
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
            output.writeInt32(1, this.cityId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeMessage(2, this.getPageInfo());
         }

         for(int i = 0; i < this.holdInfo_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.holdInfo_.get(i));
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
               size += CodedOutputStream.computeInt32Size(1, this.cityId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeMessageSize(2, this.getPageInfo());
            }

            for(int i = 0; i < this.holdInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.holdInfo_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CityInfo_13906)) {
            return super.equals(obj);
         } else {
            S2C_CityInfo_13906 other = (S2C_CityInfo_13906)obj;
            if (this.hasCityId() != other.hasCityId()) {
               return false;
            } else if (this.hasCityId() && this.getCityId() != other.getCityId()) {
               return false;
            } else if (this.hasPageInfo() != other.hasPageInfo()) {
               return false;
            } else if (this.hasPageInfo() && !this.getPageInfo().equals(other.getPageInfo())) {
               return false;
            } else if (!this.getHoldInfoList().equals(other.getHoldInfoList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasCityId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCityId();
            }

            if (this.hasPageInfo()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getPageInfo().hashCode();
            }

            if (this.getHoldInfoCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHoldInfoList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CityInfo_13906 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CityInfo_13906)PARSER.parseFrom(data);
      }

      public static S2C_CityInfo_13906 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CityInfo_13906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CityInfo_13906 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CityInfo_13906)PARSER.parseFrom(data);
      }

      public static S2C_CityInfo_13906 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CityInfo_13906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CityInfo_13906 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CityInfo_13906)PARSER.parseFrom(data);
      }

      public static S2C_CityInfo_13906 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CityInfo_13906)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CityInfo_13906 parseFrom(InputStream input) throws IOException {
         return (S2C_CityInfo_13906)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CityInfo_13906 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CityInfo_13906)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CityInfo_13906 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CityInfo_13906)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CityInfo_13906 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CityInfo_13906)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CityInfo_13906 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CityInfo_13906)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CityInfo_13906 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CityInfo_13906)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CityInfo_13906 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CityInfo_13906 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CityInfo_13906> parser() {
         return PARSER;
      }

      public Parser<S2C_CityInfo_13906> getParserForType() {
         return PARSER;
      }

      public S2C_CityInfo_13906 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CityInfo_13906OrBuilder {
         private int bitField0_;
         private int cityId_;
         private CommonMsg.PageInfo pageInfo_;
         private SingleFieldBuilderV3<CommonMsg.PageInfo, CommonMsg.PageInfo.Builder, CommonMsg.PageInfoOrBuilder> pageInfoBuilder_;
         private List<CityHoldInfo> holdInfo_;
         private RepeatedFieldBuilderV3<CityHoldInfo, CityHoldInfo.Builder, CityHoldInfoOrBuilder> holdInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityInfo_13906_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityInfo_13906_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CityInfo_13906.class, Builder.class);
         }

         private Builder() {
            this.holdInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.holdInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.S2C_CityInfo_13906.alwaysUseFieldBuilders) {
               this.getPageInfoFieldBuilder();
               this.getHoldInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.cityId_ = 0;
            this.bitField0_ &= -2;
            if (this.pageInfoBuilder_ == null) {
               this.pageInfo_ = null;
            } else {
               this.pageInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            if (this.holdInfoBuilder_ == null) {
               this.holdInfo_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.holdInfoBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityInfo_13906_descriptor;
         }

         public S2C_CityInfo_13906 getDefaultInstanceForType() {
            return DemonStrikesMsg.S2C_CityInfo_13906.getDefaultInstance();
         }

         public S2C_CityInfo_13906 build() {
            S2C_CityInfo_13906 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CityInfo_13906 buildPartial() {
            S2C_CityInfo_13906 result = new S2C_CityInfo_13906(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.cityId_ = this.cityId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               if (this.pageInfoBuilder_ == null) {
                  result.pageInfo_ = this.pageInfo_;
               } else {
                  result.pageInfo_ = (CommonMsg.PageInfo)this.pageInfoBuilder_.build();
               }

               to_bitField0_ |= 2;
            }

            if (this.holdInfoBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.holdInfo_ = Collections.unmodifiableList(this.holdInfo_);
                  this.bitField0_ &= -5;
               }

               result.holdInfo_ = this.holdInfo_;
            } else {
               result.holdInfo_ = this.holdInfoBuilder_.build();
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
            if (other instanceof S2C_CityInfo_13906) {
               return this.mergeFrom((S2C_CityInfo_13906)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CityInfo_13906 other) {
            if (other == DemonStrikesMsg.S2C_CityInfo_13906.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCityId()) {
                  this.setCityId(other.getCityId());
               }

               if (other.hasPageInfo()) {
                  this.mergePageInfo(other.getPageInfo());
               }

               if (this.holdInfoBuilder_ == null) {
                  if (!other.holdInfo_.isEmpty()) {
                     if (this.holdInfo_.isEmpty()) {
                        this.holdInfo_ = other.holdInfo_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureHoldInfoIsMutable();
                        this.holdInfo_.addAll(other.holdInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.holdInfo_.isEmpty()) {
                  if (this.holdInfoBuilder_.isEmpty()) {
                     this.holdInfoBuilder_.dispose();
                     this.holdInfoBuilder_ = null;
                     this.holdInfo_ = other.holdInfo_;
                     this.bitField0_ &= -5;
                     this.holdInfoBuilder_ = DemonStrikesMsg.S2C_CityInfo_13906.alwaysUseFieldBuilders ? this.getHoldInfoFieldBuilder() : null;
                  } else {
                     this.holdInfoBuilder_.addAllMessages(other.holdInfo_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCityId()) {
               return false;
            } else if (!this.hasPageInfo()) {
               return false;
            } else if (!this.getPageInfo().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getHoldInfoCount(); ++i) {
                  if (!this.getHoldInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_CityInfo_13906 parsedMessage = null;

            try {
               parsedMessage = (S2C_CityInfo_13906)DemonStrikesMsg.S2C_CityInfo_13906.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CityInfo_13906)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCityId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCityId() {
            return this.cityId_;
         }

         public Builder setCityId(int value) {
            this.bitField0_ |= 1;
            this.cityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCityId() {
            this.bitField0_ &= -2;
            this.cityId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasPageInfo() {
            return (this.bitField0_ & 2) != 0;
         }

         public CommonMsg.PageInfo getPageInfo() {
            if (this.pageInfoBuilder_ == null) {
               return this.pageInfo_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageInfo_;
            } else {
               return (CommonMsg.PageInfo)this.pageInfoBuilder_.getMessage();
            }
         }

         public Builder setPageInfo(CommonMsg.PageInfo value) {
            if (this.pageInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.pageInfo_ = value;
               this.onChanged();
            } else {
               this.pageInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder setPageInfo(CommonMsg.PageInfo.Builder builderForValue) {
            if (this.pageInfoBuilder_ == null) {
               this.pageInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.pageInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder mergePageInfo(CommonMsg.PageInfo value) {
            if (this.pageInfoBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0 && this.pageInfo_ != null && this.pageInfo_ != CommonMsg.PageInfo.getDefaultInstance()) {
                  this.pageInfo_ = CommonMsg.PageInfo.newBuilder(this.pageInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.pageInfo_ = value;
               }

               this.onChanged();
            } else {
               this.pageInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 2;
            return this;
         }

         public Builder clearPageInfo() {
            if (this.pageInfoBuilder_ == null) {
               this.pageInfo_ = null;
               this.onChanged();
            } else {
               this.pageInfoBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         public CommonMsg.PageInfo.Builder getPageInfoBuilder() {
            this.bitField0_ |= 2;
            this.onChanged();
            return (CommonMsg.PageInfo.Builder)this.getPageInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.PageInfoOrBuilder getPageInfoOrBuilder() {
            if (this.pageInfoBuilder_ != null) {
               return (CommonMsg.PageInfoOrBuilder)this.pageInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.pageInfo_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.PageInfo, CommonMsg.PageInfo.Builder, CommonMsg.PageInfoOrBuilder> getPageInfoFieldBuilder() {
            if (this.pageInfoBuilder_ == null) {
               this.pageInfoBuilder_ = new SingleFieldBuilderV3(this.getPageInfo(), this.getParentForChildren(), this.isClean());
               this.pageInfo_ = null;
            }

            return this.pageInfoBuilder_;
         }

         private void ensureHoldInfoIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.holdInfo_ = new ArrayList(this.holdInfo_);
               this.bitField0_ |= 4;
            }

         }

         public List<CityHoldInfo> getHoldInfoList() {
            return this.holdInfoBuilder_ == null ? Collections.unmodifiableList(this.holdInfo_) : this.holdInfoBuilder_.getMessageList();
         }

         public int getHoldInfoCount() {
            return this.holdInfoBuilder_ == null ? this.holdInfo_.size() : this.holdInfoBuilder_.getCount();
         }

         public CityHoldInfo getHoldInfo(int index) {
            return this.holdInfoBuilder_ == null ? (CityHoldInfo)this.holdInfo_.get(index) : (CityHoldInfo)this.holdInfoBuilder_.getMessage(index);
         }

         public Builder setHoldInfo(int index, CityHoldInfo value) {
            if (this.holdInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHoldInfoIsMutable();
               this.holdInfo_.set(index, value);
               this.onChanged();
            } else {
               this.holdInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setHoldInfo(int index, CityHoldInfo.Builder builderForValue) {
            if (this.holdInfoBuilder_ == null) {
               this.ensureHoldInfoIsMutable();
               this.holdInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.holdInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addHoldInfo(CityHoldInfo value) {
            if (this.holdInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHoldInfoIsMutable();
               this.holdInfo_.add(value);
               this.onChanged();
            } else {
               this.holdInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addHoldInfo(int index, CityHoldInfo value) {
            if (this.holdInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHoldInfoIsMutable();
               this.holdInfo_.add(index, value);
               this.onChanged();
            } else {
               this.holdInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addHoldInfo(CityHoldInfo.Builder builderForValue) {
            if (this.holdInfoBuilder_ == null) {
               this.ensureHoldInfoIsMutable();
               this.holdInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.holdInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addHoldInfo(int index, CityHoldInfo.Builder builderForValue) {
            if (this.holdInfoBuilder_ == null) {
               this.ensureHoldInfoIsMutable();
               this.holdInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.holdInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllHoldInfo(Iterable<? extends CityHoldInfo> values) {
            if (this.holdInfoBuilder_ == null) {
               this.ensureHoldInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.holdInfo_);
               this.onChanged();
            } else {
               this.holdInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearHoldInfo() {
            if (this.holdInfoBuilder_ == null) {
               this.holdInfo_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.holdInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeHoldInfo(int index) {
            if (this.holdInfoBuilder_ == null) {
               this.ensureHoldInfoIsMutable();
               this.holdInfo_.remove(index);
               this.onChanged();
            } else {
               this.holdInfoBuilder_.remove(index);
            }

            return this;
         }

         public CityHoldInfo.Builder getHoldInfoBuilder(int index) {
            return (CityHoldInfo.Builder)this.getHoldInfoFieldBuilder().getBuilder(index);
         }

         public CityHoldInfoOrBuilder getHoldInfoOrBuilder(int index) {
            return this.holdInfoBuilder_ == null ? (CityHoldInfoOrBuilder)this.holdInfo_.get(index) : (CityHoldInfoOrBuilder)this.holdInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CityHoldInfoOrBuilder> getHoldInfoOrBuilderList() {
            return this.holdInfoBuilder_ != null ? this.holdInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.holdInfo_);
         }

         public CityHoldInfo.Builder addHoldInfoBuilder() {
            return (CityHoldInfo.Builder)this.getHoldInfoFieldBuilder().addBuilder(DemonStrikesMsg.CityHoldInfo.getDefaultInstance());
         }

         public CityHoldInfo.Builder addHoldInfoBuilder(int index) {
            return (CityHoldInfo.Builder)this.getHoldInfoFieldBuilder().addBuilder(index, DemonStrikesMsg.CityHoldInfo.getDefaultInstance());
         }

         public List<CityHoldInfo.Builder> getHoldInfoBuilderList() {
            return this.getHoldInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CityHoldInfo, CityHoldInfo.Builder, CityHoldInfoOrBuilder> getHoldInfoFieldBuilder() {
            if (this.holdInfoBuilder_ == null) {
               this.holdInfoBuilder_ = new RepeatedFieldBuilderV3(this.holdInfo_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.holdInfo_ = null;
            }

            return this.holdInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_FlushRecoverTime_13909 extends GeneratedMessageV3 implements C2S_FlushRecoverTime_13909OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_FlushRecoverTime_13909 DEFAULT_INSTANCE = new C2S_FlushRecoverTime_13909();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FlushRecoverTime_13909> PARSER = new AbstractParser<C2S_FlushRecoverTime_13909>() {
         public C2S_FlushRecoverTime_13909 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FlushRecoverTime_13909(input, extensionRegistry);
         }
      };

      private C2S_FlushRecoverTime_13909(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FlushRecoverTime_13909() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FlushRecoverTime_13909();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FlushRecoverTime_13909(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_FlushRecoverTime_13909_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_FlushRecoverTime_13909_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FlushRecoverTime_13909.class, Builder.class);
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
         } else if (!(obj instanceof C2S_FlushRecoverTime_13909)) {
            return super.equals(obj);
         } else {
            C2S_FlushRecoverTime_13909 other = (C2S_FlushRecoverTime_13909)obj;
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

      public static C2S_FlushRecoverTime_13909 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FlushRecoverTime_13909)PARSER.parseFrom(data);
      }

      public static C2S_FlushRecoverTime_13909 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FlushRecoverTime_13909)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FlushRecoverTime_13909 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FlushRecoverTime_13909)PARSER.parseFrom(data);
      }

      public static C2S_FlushRecoverTime_13909 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FlushRecoverTime_13909)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FlushRecoverTime_13909 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FlushRecoverTime_13909)PARSER.parseFrom(data);
      }

      public static C2S_FlushRecoverTime_13909 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FlushRecoverTime_13909)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FlushRecoverTime_13909 parseFrom(InputStream input) throws IOException {
         return (C2S_FlushRecoverTime_13909)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FlushRecoverTime_13909 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FlushRecoverTime_13909)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FlushRecoverTime_13909 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FlushRecoverTime_13909)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FlushRecoverTime_13909 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FlushRecoverTime_13909)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FlushRecoverTime_13909 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FlushRecoverTime_13909)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FlushRecoverTime_13909 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FlushRecoverTime_13909)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FlushRecoverTime_13909 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FlushRecoverTime_13909 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FlushRecoverTime_13909> parser() {
         return PARSER;
      }

      public Parser<C2S_FlushRecoverTime_13909> getParserForType() {
         return PARSER;
      }

      public C2S_FlushRecoverTime_13909 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FlushRecoverTime_13909OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_FlushRecoverTime_13909_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_FlushRecoverTime_13909_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FlushRecoverTime_13909.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.C2S_FlushRecoverTime_13909.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_FlushRecoverTime_13909_descriptor;
         }

         public C2S_FlushRecoverTime_13909 getDefaultInstanceForType() {
            return DemonStrikesMsg.C2S_FlushRecoverTime_13909.getDefaultInstance();
         }

         public C2S_FlushRecoverTime_13909 build() {
            C2S_FlushRecoverTime_13909 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FlushRecoverTime_13909 buildPartial() {
            C2S_FlushRecoverTime_13909 result = new C2S_FlushRecoverTime_13909(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_FlushRecoverTime_13909) {
               return this.mergeFrom((C2S_FlushRecoverTime_13909)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FlushRecoverTime_13909 other) {
            if (other == DemonStrikesMsg.C2S_FlushRecoverTime_13909.getDefaultInstance()) {
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
            C2S_FlushRecoverTime_13909 parsedMessage = null;

            try {
               parsedMessage = (C2S_FlushRecoverTime_13909)DemonStrikesMsg.C2S_FlushRecoverTime_13909.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FlushRecoverTime_13909)e.getUnfinishedMessage();
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

   public static final class S2C_FlushRecoverTime_13910 extends GeneratedMessageV3 implements S2C_FlushRecoverTime_13910OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ATKRECOVERTIME_FIELD_NUMBER = 1;
      private int atkRecoverTime_;
      public static final int MOVERECOVERTIME_FIELD_NUMBER = 2;
      private int moveRecoverTime_;
      private byte memoizedIsInitialized;
      private static final S2C_FlushRecoverTime_13910 DEFAULT_INSTANCE = new S2C_FlushRecoverTime_13910();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FlushRecoverTime_13910> PARSER = new AbstractParser<S2C_FlushRecoverTime_13910>() {
         public S2C_FlushRecoverTime_13910 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FlushRecoverTime_13910(input, extensionRegistry);
         }
      };

      private S2C_FlushRecoverTime_13910(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FlushRecoverTime_13910() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FlushRecoverTime_13910();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FlushRecoverTime_13910(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.atkRecoverTime_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.moveRecoverTime_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_FlushRecoverTime_13910_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_FlushRecoverTime_13910_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FlushRecoverTime_13910.class, Builder.class);
      }

      public boolean hasAtkRecoverTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getAtkRecoverTime() {
         return this.atkRecoverTime_;
      }

      public boolean hasMoveRecoverTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getMoveRecoverTime() {
         return this.moveRecoverTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasAtkRecoverTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMoveRecoverTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.atkRecoverTime_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.moveRecoverTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.atkRecoverTime_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.moveRecoverTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FlushRecoverTime_13910)) {
            return super.equals(obj);
         } else {
            S2C_FlushRecoverTime_13910 other = (S2C_FlushRecoverTime_13910)obj;
            if (this.hasAtkRecoverTime() != other.hasAtkRecoverTime()) {
               return false;
            } else if (this.hasAtkRecoverTime() && this.getAtkRecoverTime() != other.getAtkRecoverTime()) {
               return false;
            } else if (this.hasMoveRecoverTime() != other.hasMoveRecoverTime()) {
               return false;
            } else if (this.hasMoveRecoverTime() && this.getMoveRecoverTime() != other.getMoveRecoverTime()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasAtkRecoverTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAtkRecoverTime();
            }

            if (this.hasMoveRecoverTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMoveRecoverTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FlushRecoverTime_13910 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FlushRecoverTime_13910)PARSER.parseFrom(data);
      }

      public static S2C_FlushRecoverTime_13910 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FlushRecoverTime_13910)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FlushRecoverTime_13910 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FlushRecoverTime_13910)PARSER.parseFrom(data);
      }

      public static S2C_FlushRecoverTime_13910 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FlushRecoverTime_13910)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FlushRecoverTime_13910 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FlushRecoverTime_13910)PARSER.parseFrom(data);
      }

      public static S2C_FlushRecoverTime_13910 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FlushRecoverTime_13910)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FlushRecoverTime_13910 parseFrom(InputStream input) throws IOException {
         return (S2C_FlushRecoverTime_13910)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FlushRecoverTime_13910 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FlushRecoverTime_13910)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FlushRecoverTime_13910 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FlushRecoverTime_13910)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FlushRecoverTime_13910 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FlushRecoverTime_13910)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FlushRecoverTime_13910 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FlushRecoverTime_13910)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FlushRecoverTime_13910 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FlushRecoverTime_13910)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FlushRecoverTime_13910 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FlushRecoverTime_13910 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FlushRecoverTime_13910> parser() {
         return PARSER;
      }

      public Parser<S2C_FlushRecoverTime_13910> getParserForType() {
         return PARSER;
      }

      public S2C_FlushRecoverTime_13910 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FlushRecoverTime_13910OrBuilder {
         private int bitField0_;
         private int atkRecoverTime_;
         private int moveRecoverTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_FlushRecoverTime_13910_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_FlushRecoverTime_13910_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FlushRecoverTime_13910.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.S2C_FlushRecoverTime_13910.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.atkRecoverTime_ = 0;
            this.bitField0_ &= -2;
            this.moveRecoverTime_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_FlushRecoverTime_13910_descriptor;
         }

         public S2C_FlushRecoverTime_13910 getDefaultInstanceForType() {
            return DemonStrikesMsg.S2C_FlushRecoverTime_13910.getDefaultInstance();
         }

         public S2C_FlushRecoverTime_13910 build() {
            S2C_FlushRecoverTime_13910 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FlushRecoverTime_13910 buildPartial() {
            S2C_FlushRecoverTime_13910 result = new S2C_FlushRecoverTime_13910(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.atkRecoverTime_ = this.atkRecoverTime_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.moveRecoverTime_ = this.moveRecoverTime_;
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
            if (other instanceof S2C_FlushRecoverTime_13910) {
               return this.mergeFrom((S2C_FlushRecoverTime_13910)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FlushRecoverTime_13910 other) {
            if (other == DemonStrikesMsg.S2C_FlushRecoverTime_13910.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasAtkRecoverTime()) {
                  this.setAtkRecoverTime(other.getAtkRecoverTime());
               }

               if (other.hasMoveRecoverTime()) {
                  this.setMoveRecoverTime(other.getMoveRecoverTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasAtkRecoverTime()) {
               return false;
            } else {
               return this.hasMoveRecoverTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FlushRecoverTime_13910 parsedMessage = null;

            try {
               parsedMessage = (S2C_FlushRecoverTime_13910)DemonStrikesMsg.S2C_FlushRecoverTime_13910.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FlushRecoverTime_13910)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasAtkRecoverTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getAtkRecoverTime() {
            return this.atkRecoverTime_;
         }

         public Builder setAtkRecoverTime(int value) {
            this.bitField0_ |= 1;
            this.atkRecoverTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAtkRecoverTime() {
            this.bitField0_ &= -2;
            this.atkRecoverTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMoveRecoverTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getMoveRecoverTime() {
            return this.moveRecoverTime_;
         }

         public Builder setMoveRecoverTime(int value) {
            this.bitField0_ |= 2;
            this.moveRecoverTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMoveRecoverTime() {
            this.bitField0_ &= -3;
            this.moveRecoverTime_ = 0;
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

   public static final class S2C_CityChangeNotify_13912 extends GeneratedMessageV3 implements S2C_CityChangeNotify_13912OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CITYINFO_FIELD_NUMBER = 1;
      private List<CityInfo> cityInfo_;
      public static final int HOLDCHANGEDATA_FIELD_NUMBER = 2;
      private List<CityHoldChangeData> holdChangeData_;
      public static final int LOG_FIELD_NUMBER = 3;
      private LogInfo log_;
      private byte memoizedIsInitialized;
      private static final S2C_CityChangeNotify_13912 DEFAULT_INSTANCE = new S2C_CityChangeNotify_13912();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CityChangeNotify_13912> PARSER = new AbstractParser<S2C_CityChangeNotify_13912>() {
         public S2C_CityChangeNotify_13912 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CityChangeNotify_13912(input, extensionRegistry);
         }
      };

      private S2C_CityChangeNotify_13912(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CityChangeNotify_13912() {
         this.memoizedIsInitialized = -1;
         this.cityInfo_ = Collections.emptyList();
         this.holdChangeData_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CityChangeNotify_13912();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CityChangeNotify_13912(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                           this.cityInfo_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.cityInfo_.add(input.readMessage(DemonStrikesMsg.CityInfo.PARSER, extensionRegistry));
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.holdChangeData_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.holdChangeData_.add(input.readMessage(DemonStrikesMsg.CityHoldChangeData.PARSER, extensionRegistry));
                        break;
                     case 26:
                        LogInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.log_.toBuilder();
                        }

                        this.log_ = (LogInfo)input.readMessage(DemonStrikesMsg.LogInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.log_);
                           this.log_ = subBuilder.buildPartial();
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
                  this.cityInfo_ = Collections.unmodifiableList(this.cityInfo_);
               }

               if ((mutable_bitField0_ & 2) != 0) {
                  this.holdChangeData_ = Collections.unmodifiableList(this.holdChangeData_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityChangeNotify_13912_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityChangeNotify_13912_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CityChangeNotify_13912.class, Builder.class);
      }

      public List<CityInfo> getCityInfoList() {
         return this.cityInfo_;
      }

      public List<? extends CityInfoOrBuilder> getCityInfoOrBuilderList() {
         return this.cityInfo_;
      }

      public int getCityInfoCount() {
         return this.cityInfo_.size();
      }

      public CityInfo getCityInfo(int index) {
         return (CityInfo)this.cityInfo_.get(index);
      }

      public CityInfoOrBuilder getCityInfoOrBuilder(int index) {
         return (CityInfoOrBuilder)this.cityInfo_.get(index);
      }

      public List<CityHoldChangeData> getHoldChangeDataList() {
         return this.holdChangeData_;
      }

      public List<? extends CityHoldChangeDataOrBuilder> getHoldChangeDataOrBuilderList() {
         return this.holdChangeData_;
      }

      public int getHoldChangeDataCount() {
         return this.holdChangeData_.size();
      }

      public CityHoldChangeData getHoldChangeData(int index) {
         return (CityHoldChangeData)this.holdChangeData_.get(index);
      }

      public CityHoldChangeDataOrBuilder getHoldChangeDataOrBuilder(int index) {
         return (CityHoldChangeDataOrBuilder)this.holdChangeData_.get(index);
      }

      public boolean hasLog() {
         return (this.bitField0_ & 1) != 0;
      }

      public LogInfo getLog() {
         return this.log_ == null ? DemonStrikesMsg.LogInfo.getDefaultInstance() : this.log_;
      }

      public LogInfoOrBuilder getLogOrBuilder() {
         return this.log_ == null ? DemonStrikesMsg.LogInfo.getDefaultInstance() : this.log_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getCityInfoCount(); ++i) {
               if (!this.getCityInfo(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getHoldChangeDataCount(); ++i) {
               if (!this.getHoldChangeData(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            if (this.hasLog() && !this.getLog().isInitialized()) {
               this.memoizedIsInitialized = 0;
               return false;
            } else {
               this.memoizedIsInitialized = 1;
               return true;
            }
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.cityInfo_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.cityInfo_.get(i));
         }

         for(int i = 0; i < this.holdChangeData_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.holdChangeData_.get(i));
         }

         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(3, this.getLog());
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.cityInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.cityInfo_.get(i));
            }

            for(int i = 0; i < this.holdChangeData_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.holdChangeData_.get(i));
            }

            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeMessageSize(3, this.getLog());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CityChangeNotify_13912)) {
            return super.equals(obj);
         } else {
            S2C_CityChangeNotify_13912 other = (S2C_CityChangeNotify_13912)obj;
            if (!this.getCityInfoList().equals(other.getCityInfoList())) {
               return false;
            } else if (!this.getHoldChangeDataList().equals(other.getHoldChangeDataList())) {
               return false;
            } else if (this.hasLog() != other.hasLog()) {
               return false;
            } else if (this.hasLog() && !this.getLog().equals(other.getLog())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getCityInfoCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCityInfoList().hashCode();
            }

            if (this.getHoldChangeDataCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHoldChangeDataList().hashCode();
            }

            if (this.hasLog()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getLog().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CityChangeNotify_13912 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CityChangeNotify_13912)PARSER.parseFrom(data);
      }

      public static S2C_CityChangeNotify_13912 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CityChangeNotify_13912)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CityChangeNotify_13912 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CityChangeNotify_13912)PARSER.parseFrom(data);
      }

      public static S2C_CityChangeNotify_13912 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CityChangeNotify_13912)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CityChangeNotify_13912 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CityChangeNotify_13912)PARSER.parseFrom(data);
      }

      public static S2C_CityChangeNotify_13912 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CityChangeNotify_13912)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CityChangeNotify_13912 parseFrom(InputStream input) throws IOException {
         return (S2C_CityChangeNotify_13912)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CityChangeNotify_13912 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CityChangeNotify_13912)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CityChangeNotify_13912 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CityChangeNotify_13912)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CityChangeNotify_13912 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CityChangeNotify_13912)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CityChangeNotify_13912 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CityChangeNotify_13912)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CityChangeNotify_13912 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CityChangeNotify_13912)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CityChangeNotify_13912 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CityChangeNotify_13912 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CityChangeNotify_13912> parser() {
         return PARSER;
      }

      public Parser<S2C_CityChangeNotify_13912> getParserForType() {
         return PARSER;
      }

      public S2C_CityChangeNotify_13912 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CityChangeNotify_13912OrBuilder {
         private int bitField0_;
         private List<CityInfo> cityInfo_;
         private RepeatedFieldBuilderV3<CityInfo, CityInfo.Builder, CityInfoOrBuilder> cityInfoBuilder_;
         private List<CityHoldChangeData> holdChangeData_;
         private RepeatedFieldBuilderV3<CityHoldChangeData, CityHoldChangeData.Builder, CityHoldChangeDataOrBuilder> holdChangeDataBuilder_;
         private LogInfo log_;
         private SingleFieldBuilderV3<LogInfo, LogInfo.Builder, LogInfoOrBuilder> logBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityChangeNotify_13912_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityChangeNotify_13912_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CityChangeNotify_13912.class, Builder.class);
         }

         private Builder() {
            this.cityInfo_ = Collections.emptyList();
            this.holdChangeData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.cityInfo_ = Collections.emptyList();
            this.holdChangeData_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.S2C_CityChangeNotify_13912.alwaysUseFieldBuilders) {
               this.getCityInfoFieldBuilder();
               this.getHoldChangeDataFieldBuilder();
               this.getLogFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.cityInfoBuilder_ == null) {
               this.cityInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.cityInfoBuilder_.clear();
            }

            if (this.holdChangeDataBuilder_ == null) {
               this.holdChangeData_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.holdChangeDataBuilder_.clear();
            }

            if (this.logBuilder_ == null) {
               this.log_ = null;
            } else {
               this.logBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityChangeNotify_13912_descriptor;
         }

         public S2C_CityChangeNotify_13912 getDefaultInstanceForType() {
            return DemonStrikesMsg.S2C_CityChangeNotify_13912.getDefaultInstance();
         }

         public S2C_CityChangeNotify_13912 build() {
            S2C_CityChangeNotify_13912 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CityChangeNotify_13912 buildPartial() {
            S2C_CityChangeNotify_13912 result = new S2C_CityChangeNotify_13912(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if (this.cityInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.cityInfo_ = Collections.unmodifiableList(this.cityInfo_);
                  this.bitField0_ &= -2;
               }

               result.cityInfo_ = this.cityInfo_;
            } else {
               result.cityInfo_ = this.cityInfoBuilder_.build();
            }

            if (this.holdChangeDataBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.holdChangeData_ = Collections.unmodifiableList(this.holdChangeData_);
                  this.bitField0_ &= -3;
               }

               result.holdChangeData_ = this.holdChangeData_;
            } else {
               result.holdChangeData_ = this.holdChangeDataBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               if (this.logBuilder_ == null) {
                  result.log_ = this.log_;
               } else {
                  result.log_ = (LogInfo)this.logBuilder_.build();
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
            if (other instanceof S2C_CityChangeNotify_13912) {
               return this.mergeFrom((S2C_CityChangeNotify_13912)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CityChangeNotify_13912 other) {
            if (other == DemonStrikesMsg.S2C_CityChangeNotify_13912.getDefaultInstance()) {
               return this;
            } else {
               if (this.cityInfoBuilder_ == null) {
                  if (!other.cityInfo_.isEmpty()) {
                     if (this.cityInfo_.isEmpty()) {
                        this.cityInfo_ = other.cityInfo_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureCityInfoIsMutable();
                        this.cityInfo_.addAll(other.cityInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.cityInfo_.isEmpty()) {
                  if (this.cityInfoBuilder_.isEmpty()) {
                     this.cityInfoBuilder_.dispose();
                     this.cityInfoBuilder_ = null;
                     this.cityInfo_ = other.cityInfo_;
                     this.bitField0_ &= -2;
                     this.cityInfoBuilder_ = DemonStrikesMsg.S2C_CityChangeNotify_13912.alwaysUseFieldBuilders ? this.getCityInfoFieldBuilder() : null;
                  } else {
                     this.cityInfoBuilder_.addAllMessages(other.cityInfo_);
                  }
               }

               if (this.holdChangeDataBuilder_ == null) {
                  if (!other.holdChangeData_.isEmpty()) {
                     if (this.holdChangeData_.isEmpty()) {
                        this.holdChangeData_ = other.holdChangeData_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureHoldChangeDataIsMutable();
                        this.holdChangeData_.addAll(other.holdChangeData_);
                     }

                     this.onChanged();
                  }
               } else if (!other.holdChangeData_.isEmpty()) {
                  if (this.holdChangeDataBuilder_.isEmpty()) {
                     this.holdChangeDataBuilder_.dispose();
                     this.holdChangeDataBuilder_ = null;
                     this.holdChangeData_ = other.holdChangeData_;
                     this.bitField0_ &= -3;
                     this.holdChangeDataBuilder_ = DemonStrikesMsg.S2C_CityChangeNotify_13912.alwaysUseFieldBuilders ? this.getHoldChangeDataFieldBuilder() : null;
                  } else {
                     this.holdChangeDataBuilder_.addAllMessages(other.holdChangeData_);
                  }
               }

               if (other.hasLog()) {
                  this.mergeLog(other.getLog());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getCityInfoCount(); ++i) {
               if (!this.getCityInfo(i).isInitialized()) {
                  return false;
               }
            }

            for(int i = 0; i < this.getHoldChangeDataCount(); ++i) {
               if (!this.getHoldChangeData(i).isInitialized()) {
                  return false;
               }
            }

            if (this.hasLog() && !this.getLog().isInitialized()) {
               return false;
            } else {
               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_CityChangeNotify_13912 parsedMessage = null;

            try {
               parsedMessage = (S2C_CityChangeNotify_13912)DemonStrikesMsg.S2C_CityChangeNotify_13912.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CityChangeNotify_13912)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureCityInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.cityInfo_ = new ArrayList(this.cityInfo_);
               this.bitField0_ |= 1;
            }

         }

         public List<CityInfo> getCityInfoList() {
            return this.cityInfoBuilder_ == null ? Collections.unmodifiableList(this.cityInfo_) : this.cityInfoBuilder_.getMessageList();
         }

         public int getCityInfoCount() {
            return this.cityInfoBuilder_ == null ? this.cityInfo_.size() : this.cityInfoBuilder_.getCount();
         }

         public CityInfo getCityInfo(int index) {
            return this.cityInfoBuilder_ == null ? (CityInfo)this.cityInfo_.get(index) : (CityInfo)this.cityInfoBuilder_.getMessage(index);
         }

         public Builder setCityInfo(int index, CityInfo value) {
            if (this.cityInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCityInfoIsMutable();
               this.cityInfo_.set(index, value);
               this.onChanged();
            } else {
               this.cityInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setCityInfo(int index, CityInfo.Builder builderForValue) {
            if (this.cityInfoBuilder_ == null) {
               this.ensureCityInfoIsMutable();
               this.cityInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.cityInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addCityInfo(CityInfo value) {
            if (this.cityInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCityInfoIsMutable();
               this.cityInfo_.add(value);
               this.onChanged();
            } else {
               this.cityInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addCityInfo(int index, CityInfo value) {
            if (this.cityInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureCityInfoIsMutable();
               this.cityInfo_.add(index, value);
               this.onChanged();
            } else {
               this.cityInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addCityInfo(CityInfo.Builder builderForValue) {
            if (this.cityInfoBuilder_ == null) {
               this.ensureCityInfoIsMutable();
               this.cityInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.cityInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addCityInfo(int index, CityInfo.Builder builderForValue) {
            if (this.cityInfoBuilder_ == null) {
               this.ensureCityInfoIsMutable();
               this.cityInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.cityInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllCityInfo(Iterable<? extends CityInfo> values) {
            if (this.cityInfoBuilder_ == null) {
               this.ensureCityInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.cityInfo_);
               this.onChanged();
            } else {
               this.cityInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearCityInfo() {
            if (this.cityInfoBuilder_ == null) {
               this.cityInfo_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.cityInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeCityInfo(int index) {
            if (this.cityInfoBuilder_ == null) {
               this.ensureCityInfoIsMutable();
               this.cityInfo_.remove(index);
               this.onChanged();
            } else {
               this.cityInfoBuilder_.remove(index);
            }

            return this;
         }

         public CityInfo.Builder getCityInfoBuilder(int index) {
            return (CityInfo.Builder)this.getCityInfoFieldBuilder().getBuilder(index);
         }

         public CityInfoOrBuilder getCityInfoOrBuilder(int index) {
            return this.cityInfoBuilder_ == null ? (CityInfoOrBuilder)this.cityInfo_.get(index) : (CityInfoOrBuilder)this.cityInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CityInfoOrBuilder> getCityInfoOrBuilderList() {
            return this.cityInfoBuilder_ != null ? this.cityInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.cityInfo_);
         }

         public CityInfo.Builder addCityInfoBuilder() {
            return (CityInfo.Builder)this.getCityInfoFieldBuilder().addBuilder(DemonStrikesMsg.CityInfo.getDefaultInstance());
         }

         public CityInfo.Builder addCityInfoBuilder(int index) {
            return (CityInfo.Builder)this.getCityInfoFieldBuilder().addBuilder(index, DemonStrikesMsg.CityInfo.getDefaultInstance());
         }

         public List<CityInfo.Builder> getCityInfoBuilderList() {
            return this.getCityInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CityInfo, CityInfo.Builder, CityInfoOrBuilder> getCityInfoFieldBuilder() {
            if (this.cityInfoBuilder_ == null) {
               this.cityInfoBuilder_ = new RepeatedFieldBuilderV3(this.cityInfo_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.cityInfo_ = null;
            }

            return this.cityInfoBuilder_;
         }

         private void ensureHoldChangeDataIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.holdChangeData_ = new ArrayList(this.holdChangeData_);
               this.bitField0_ |= 2;
            }

         }

         public List<CityHoldChangeData> getHoldChangeDataList() {
            return this.holdChangeDataBuilder_ == null ? Collections.unmodifiableList(this.holdChangeData_) : this.holdChangeDataBuilder_.getMessageList();
         }

         public int getHoldChangeDataCount() {
            return this.holdChangeDataBuilder_ == null ? this.holdChangeData_.size() : this.holdChangeDataBuilder_.getCount();
         }

         public CityHoldChangeData getHoldChangeData(int index) {
            return this.holdChangeDataBuilder_ == null ? (CityHoldChangeData)this.holdChangeData_.get(index) : (CityHoldChangeData)this.holdChangeDataBuilder_.getMessage(index);
         }

         public Builder setHoldChangeData(int index, CityHoldChangeData value) {
            if (this.holdChangeDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHoldChangeDataIsMutable();
               this.holdChangeData_.set(index, value);
               this.onChanged();
            } else {
               this.holdChangeDataBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setHoldChangeData(int index, CityHoldChangeData.Builder builderForValue) {
            if (this.holdChangeDataBuilder_ == null) {
               this.ensureHoldChangeDataIsMutable();
               this.holdChangeData_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.holdChangeDataBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addHoldChangeData(CityHoldChangeData value) {
            if (this.holdChangeDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHoldChangeDataIsMutable();
               this.holdChangeData_.add(value);
               this.onChanged();
            } else {
               this.holdChangeDataBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addHoldChangeData(int index, CityHoldChangeData value) {
            if (this.holdChangeDataBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureHoldChangeDataIsMutable();
               this.holdChangeData_.add(index, value);
               this.onChanged();
            } else {
               this.holdChangeDataBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addHoldChangeData(CityHoldChangeData.Builder builderForValue) {
            if (this.holdChangeDataBuilder_ == null) {
               this.ensureHoldChangeDataIsMutable();
               this.holdChangeData_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.holdChangeDataBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addHoldChangeData(int index, CityHoldChangeData.Builder builderForValue) {
            if (this.holdChangeDataBuilder_ == null) {
               this.ensureHoldChangeDataIsMutable();
               this.holdChangeData_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.holdChangeDataBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllHoldChangeData(Iterable<? extends CityHoldChangeData> values) {
            if (this.holdChangeDataBuilder_ == null) {
               this.ensureHoldChangeDataIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.holdChangeData_);
               this.onChanged();
            } else {
               this.holdChangeDataBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearHoldChangeData() {
            if (this.holdChangeDataBuilder_ == null) {
               this.holdChangeData_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.holdChangeDataBuilder_.clear();
            }

            return this;
         }

         public Builder removeHoldChangeData(int index) {
            if (this.holdChangeDataBuilder_ == null) {
               this.ensureHoldChangeDataIsMutable();
               this.holdChangeData_.remove(index);
               this.onChanged();
            } else {
               this.holdChangeDataBuilder_.remove(index);
            }

            return this;
         }

         public CityHoldChangeData.Builder getHoldChangeDataBuilder(int index) {
            return (CityHoldChangeData.Builder)this.getHoldChangeDataFieldBuilder().getBuilder(index);
         }

         public CityHoldChangeDataOrBuilder getHoldChangeDataOrBuilder(int index) {
            return this.holdChangeDataBuilder_ == null ? (CityHoldChangeDataOrBuilder)this.holdChangeData_.get(index) : (CityHoldChangeDataOrBuilder)this.holdChangeDataBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CityHoldChangeDataOrBuilder> getHoldChangeDataOrBuilderList() {
            return this.holdChangeDataBuilder_ != null ? this.holdChangeDataBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.holdChangeData_);
         }

         public CityHoldChangeData.Builder addHoldChangeDataBuilder() {
            return (CityHoldChangeData.Builder)this.getHoldChangeDataFieldBuilder().addBuilder(DemonStrikesMsg.CityHoldChangeData.getDefaultInstance());
         }

         public CityHoldChangeData.Builder addHoldChangeDataBuilder(int index) {
            return (CityHoldChangeData.Builder)this.getHoldChangeDataFieldBuilder().addBuilder(index, DemonStrikesMsg.CityHoldChangeData.getDefaultInstance());
         }

         public List<CityHoldChangeData.Builder> getHoldChangeDataBuilderList() {
            return this.getHoldChangeDataFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CityHoldChangeData, CityHoldChangeData.Builder, CityHoldChangeDataOrBuilder> getHoldChangeDataFieldBuilder() {
            if (this.holdChangeDataBuilder_ == null) {
               this.holdChangeDataBuilder_ = new RepeatedFieldBuilderV3(this.holdChangeData_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.holdChangeData_ = null;
            }

            return this.holdChangeDataBuilder_;
         }

         public boolean hasLog() {
            return (this.bitField0_ & 4) != 0;
         }

         public LogInfo getLog() {
            if (this.logBuilder_ == null) {
               return this.log_ == null ? DemonStrikesMsg.LogInfo.getDefaultInstance() : this.log_;
            } else {
               return (LogInfo)this.logBuilder_.getMessage();
            }
         }

         public Builder setLog(LogInfo value) {
            if (this.logBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.log_ = value;
               this.onChanged();
            } else {
               this.logBuilder_.setMessage(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder setLog(LogInfo.Builder builderForValue) {
            if (this.logBuilder_ == null) {
               this.log_ = builderForValue.build();
               this.onChanged();
            } else {
               this.logBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeLog(LogInfo value) {
            if (this.logBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.log_ != null && this.log_ != DemonStrikesMsg.LogInfo.getDefaultInstance()) {
                  this.log_ = DemonStrikesMsg.LogInfo.newBuilder(this.log_).mergeFrom(value).buildPartial();
               } else {
                  this.log_ = value;
               }

               this.onChanged();
            } else {
               this.logBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder clearLog() {
            if (this.logBuilder_ == null) {
               this.log_ = null;
               this.onChanged();
            } else {
               this.logBuilder_.clear();
            }

            this.bitField0_ &= -5;
            return this;
         }

         public LogInfo.Builder getLogBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (LogInfo.Builder)this.getLogFieldBuilder().getBuilder();
         }

         public LogInfoOrBuilder getLogOrBuilder() {
            if (this.logBuilder_ != null) {
               return (LogInfoOrBuilder)this.logBuilder_.getMessageOrBuilder();
            } else {
               return this.log_ == null ? DemonStrikesMsg.LogInfo.getDefaultInstance() : this.log_;
            }
         }

         private SingleFieldBuilderV3<LogInfo, LogInfo.Builder, LogInfoOrBuilder> getLogFieldBuilder() {
            if (this.logBuilder_ == null) {
               this.logBuilder_ = new SingleFieldBuilderV3(this.getLog(), this.getParentForChildren(), this.isClean());
               this.log_ = null;
            }

            return this.logBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_MoveCity_13913 extends GeneratedMessageV3 implements C2S_MoveCity_13913OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CITYID_FIELD_NUMBER = 1;
      private int cityId_;
      private byte memoizedIsInitialized;
      private static final C2S_MoveCity_13913 DEFAULT_INSTANCE = new C2S_MoveCity_13913();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_MoveCity_13913> PARSER = new AbstractParser<C2S_MoveCity_13913>() {
         public C2S_MoveCity_13913 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_MoveCity_13913(input, extensionRegistry);
         }
      };

      private C2S_MoveCity_13913(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_MoveCity_13913() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_MoveCity_13913();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_MoveCity_13913(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.cityId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_MoveCity_13913_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_MoveCity_13913_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MoveCity_13913.class, Builder.class);
      }

      public boolean hasCityId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCityId() {
         return this.cityId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCityId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.cityId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.cityId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_MoveCity_13913)) {
            return super.equals(obj);
         } else {
            C2S_MoveCity_13913 other = (C2S_MoveCity_13913)obj;
            if (this.hasCityId() != other.hasCityId()) {
               return false;
            } else if (this.hasCityId() && this.getCityId() != other.getCityId()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasCityId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCityId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_MoveCity_13913 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_MoveCity_13913)PARSER.parseFrom(data);
      }

      public static C2S_MoveCity_13913 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MoveCity_13913)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MoveCity_13913 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_MoveCity_13913)PARSER.parseFrom(data);
      }

      public static C2S_MoveCity_13913 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MoveCity_13913)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MoveCity_13913 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_MoveCity_13913)PARSER.parseFrom(data);
      }

      public static C2S_MoveCity_13913 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_MoveCity_13913)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_MoveCity_13913 parseFrom(InputStream input) throws IOException {
         return (C2S_MoveCity_13913)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MoveCity_13913 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MoveCity_13913)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MoveCity_13913 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_MoveCity_13913)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_MoveCity_13913 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MoveCity_13913)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_MoveCity_13913 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_MoveCity_13913)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_MoveCity_13913 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_MoveCity_13913)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_MoveCity_13913 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_MoveCity_13913 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_MoveCity_13913> parser() {
         return PARSER;
      }

      public Parser<C2S_MoveCity_13913> getParserForType() {
         return PARSER;
      }

      public C2S_MoveCity_13913 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_MoveCity_13913OrBuilder {
         private int bitField0_;
         private int cityId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_MoveCity_13913_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_MoveCity_13913_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_MoveCity_13913.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.C2S_MoveCity_13913.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.cityId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_MoveCity_13913_descriptor;
         }

         public C2S_MoveCity_13913 getDefaultInstanceForType() {
            return DemonStrikesMsg.C2S_MoveCity_13913.getDefaultInstance();
         }

         public C2S_MoveCity_13913 build() {
            C2S_MoveCity_13913 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_MoveCity_13913 buildPartial() {
            C2S_MoveCity_13913 result = new C2S_MoveCity_13913(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.cityId_ = this.cityId_;
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
            if (other instanceof C2S_MoveCity_13913) {
               return this.mergeFrom((C2S_MoveCity_13913)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_MoveCity_13913 other) {
            if (other == DemonStrikesMsg.C2S_MoveCity_13913.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCityId()) {
                  this.setCityId(other.getCityId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCityId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_MoveCity_13913 parsedMessage = null;

            try {
               parsedMessage = (C2S_MoveCity_13913)DemonStrikesMsg.C2S_MoveCity_13913.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_MoveCity_13913)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCityId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCityId() {
            return this.cityId_;
         }

         public Builder setCityId(int value) {
            this.bitField0_ |= 1;
            this.cityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCityId() {
            this.bitField0_ &= -2;
            this.cityId_ = 0;
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

   public static final class S2C_MoveCity_13914 extends GeneratedMessageV3 implements S2C_MoveCity_13914OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CITYID_FIELD_NUMBER = 1;
      private int cityId_;
      public static final int MOVERECOVERTIME_FIELD_NUMBER = 2;
      private int moveRecoverTime_;
      private byte memoizedIsInitialized;
      private static final S2C_MoveCity_13914 DEFAULT_INSTANCE = new S2C_MoveCity_13914();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_MoveCity_13914> PARSER = new AbstractParser<S2C_MoveCity_13914>() {
         public S2C_MoveCity_13914 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_MoveCity_13914(input, extensionRegistry);
         }
      };

      private S2C_MoveCity_13914(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_MoveCity_13914() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_MoveCity_13914();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_MoveCity_13914(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.cityId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.moveRecoverTime_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_MoveCity_13914_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_MoveCity_13914_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MoveCity_13914.class, Builder.class);
      }

      public boolean hasCityId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCityId() {
         return this.cityId_;
      }

      public boolean hasMoveRecoverTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getMoveRecoverTime() {
         return this.moveRecoverTime_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCityId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMoveRecoverTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.cityId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.moveRecoverTime_);
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
               size += CodedOutputStream.computeInt32Size(1, this.cityId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.moveRecoverTime_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_MoveCity_13914)) {
            return super.equals(obj);
         } else {
            S2C_MoveCity_13914 other = (S2C_MoveCity_13914)obj;
            if (this.hasCityId() != other.hasCityId()) {
               return false;
            } else if (this.hasCityId() && this.getCityId() != other.getCityId()) {
               return false;
            } else if (this.hasMoveRecoverTime() != other.hasMoveRecoverTime()) {
               return false;
            } else if (this.hasMoveRecoverTime() && this.getMoveRecoverTime() != other.getMoveRecoverTime()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasCityId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCityId();
            }

            if (this.hasMoveRecoverTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMoveRecoverTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_MoveCity_13914 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_MoveCity_13914)PARSER.parseFrom(data);
      }

      public static S2C_MoveCity_13914 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MoveCity_13914)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MoveCity_13914 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_MoveCity_13914)PARSER.parseFrom(data);
      }

      public static S2C_MoveCity_13914 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MoveCity_13914)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MoveCity_13914 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_MoveCity_13914)PARSER.parseFrom(data);
      }

      public static S2C_MoveCity_13914 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_MoveCity_13914)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_MoveCity_13914 parseFrom(InputStream input) throws IOException {
         return (S2C_MoveCity_13914)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MoveCity_13914 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MoveCity_13914)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MoveCity_13914 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_MoveCity_13914)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_MoveCity_13914 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MoveCity_13914)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_MoveCity_13914 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_MoveCity_13914)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_MoveCity_13914 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_MoveCity_13914)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_MoveCity_13914 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_MoveCity_13914 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_MoveCity_13914> parser() {
         return PARSER;
      }

      public Parser<S2C_MoveCity_13914> getParserForType() {
         return PARSER;
      }

      public S2C_MoveCity_13914 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_MoveCity_13914OrBuilder {
         private int bitField0_;
         private int cityId_;
         private int moveRecoverTime_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_MoveCity_13914_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_MoveCity_13914_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_MoveCity_13914.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.S2C_MoveCity_13914.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.cityId_ = 0;
            this.bitField0_ &= -2;
            this.moveRecoverTime_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_MoveCity_13914_descriptor;
         }

         public S2C_MoveCity_13914 getDefaultInstanceForType() {
            return DemonStrikesMsg.S2C_MoveCity_13914.getDefaultInstance();
         }

         public S2C_MoveCity_13914 build() {
            S2C_MoveCity_13914 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_MoveCity_13914 buildPartial() {
            S2C_MoveCity_13914 result = new S2C_MoveCity_13914(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.cityId_ = this.cityId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.moveRecoverTime_ = this.moveRecoverTime_;
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
            if (other instanceof S2C_MoveCity_13914) {
               return this.mergeFrom((S2C_MoveCity_13914)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_MoveCity_13914 other) {
            if (other == DemonStrikesMsg.S2C_MoveCity_13914.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCityId()) {
                  this.setCityId(other.getCityId());
               }

               if (other.hasMoveRecoverTime()) {
                  this.setMoveRecoverTime(other.getMoveRecoverTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCityId()) {
               return false;
            } else {
               return this.hasMoveRecoverTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_MoveCity_13914 parsedMessage = null;

            try {
               parsedMessage = (S2C_MoveCity_13914)DemonStrikesMsg.S2C_MoveCity_13914.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_MoveCity_13914)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCityId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCityId() {
            return this.cityId_;
         }

         public Builder setCityId(int value) {
            this.bitField0_ |= 1;
            this.cityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCityId() {
            this.bitField0_ &= -2;
            this.cityId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMoveRecoverTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getMoveRecoverTime() {
            return this.moveRecoverTime_;
         }

         public Builder setMoveRecoverTime(int value) {
            this.bitField0_ |= 2;
            this.moveRecoverTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMoveRecoverTime() {
            this.bitField0_ &= -3;
            this.moveRecoverTime_ = 0;
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

   public static final class C2S_TransferList_13915 extends GeneratedMessageV3 implements C2S_TransferList_13915OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PAGEINFO_FIELD_NUMBER = 1;
      private CommonMsg.PageInfo pageInfo_;
      private byte memoizedIsInitialized;
      private static final C2S_TransferList_13915 DEFAULT_INSTANCE = new C2S_TransferList_13915();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TransferList_13915> PARSER = new AbstractParser<C2S_TransferList_13915>() {
         public C2S_TransferList_13915 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TransferList_13915(input, extensionRegistry);
         }
      };

      private C2S_TransferList_13915(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TransferList_13915() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TransferList_13915();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TransferList_13915(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        CommonMsg.PageInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.pageInfo_.toBuilder();
                        }

                        this.pageInfo_ = (CommonMsg.PageInfo)input.readMessage(CommonMsg.PageInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.pageInfo_);
                           this.pageInfo_ = subBuilder.buildPartial();
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_TransferList_13915_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_TransferList_13915_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TransferList_13915.class, Builder.class);
      }

      public boolean hasPageInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public CommonMsg.PageInfo getPageInfo() {
         return this.pageInfo_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageInfo_;
      }

      public CommonMsg.PageInfoOrBuilder getPageInfoOrBuilder() {
         return this.pageInfo_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageInfo_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPageInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getPageInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeMessage(1, this.getPageInfo());
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
               size += CodedOutputStream.computeMessageSize(1, this.getPageInfo());
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TransferList_13915)) {
            return super.equals(obj);
         } else {
            C2S_TransferList_13915 other = (C2S_TransferList_13915)obj;
            if (this.hasPageInfo() != other.hasPageInfo()) {
               return false;
            } else if (this.hasPageInfo() && !this.getPageInfo().equals(other.getPageInfo())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPageInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPageInfo().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TransferList_13915 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TransferList_13915)PARSER.parseFrom(data);
      }

      public static C2S_TransferList_13915 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TransferList_13915)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TransferList_13915 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TransferList_13915)PARSER.parseFrom(data);
      }

      public static C2S_TransferList_13915 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TransferList_13915)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TransferList_13915 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TransferList_13915)PARSER.parseFrom(data);
      }

      public static C2S_TransferList_13915 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TransferList_13915)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TransferList_13915 parseFrom(InputStream input) throws IOException {
         return (C2S_TransferList_13915)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TransferList_13915 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TransferList_13915)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TransferList_13915 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TransferList_13915)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TransferList_13915 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TransferList_13915)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TransferList_13915 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TransferList_13915)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TransferList_13915 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TransferList_13915)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TransferList_13915 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TransferList_13915 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TransferList_13915> parser() {
         return PARSER;
      }

      public Parser<C2S_TransferList_13915> getParserForType() {
         return PARSER;
      }

      public C2S_TransferList_13915 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TransferList_13915OrBuilder {
         private int bitField0_;
         private CommonMsg.PageInfo pageInfo_;
         private SingleFieldBuilderV3<CommonMsg.PageInfo, CommonMsg.PageInfo.Builder, CommonMsg.PageInfoOrBuilder> pageInfoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_TransferList_13915_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_TransferList_13915_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TransferList_13915.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.C2S_TransferList_13915.alwaysUseFieldBuilders) {
               this.getPageInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.pageInfoBuilder_ == null) {
               this.pageInfo_ = null;
            } else {
               this.pageInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_TransferList_13915_descriptor;
         }

         public C2S_TransferList_13915 getDefaultInstanceForType() {
            return DemonStrikesMsg.C2S_TransferList_13915.getDefaultInstance();
         }

         public C2S_TransferList_13915 build() {
            C2S_TransferList_13915 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TransferList_13915 buildPartial() {
            C2S_TransferList_13915 result = new C2S_TransferList_13915(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.pageInfoBuilder_ == null) {
                  result.pageInfo_ = this.pageInfo_;
               } else {
                  result.pageInfo_ = (CommonMsg.PageInfo)this.pageInfoBuilder_.build();
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
            if (other instanceof C2S_TransferList_13915) {
               return this.mergeFrom((C2S_TransferList_13915)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TransferList_13915 other) {
            if (other == DemonStrikesMsg.C2S_TransferList_13915.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPageInfo()) {
                  this.mergePageInfo(other.getPageInfo());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPageInfo()) {
               return false;
            } else {
               return this.getPageInfo().isInitialized();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TransferList_13915 parsedMessage = null;

            try {
               parsedMessage = (C2S_TransferList_13915)DemonStrikesMsg.C2S_TransferList_13915.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TransferList_13915)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPageInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public CommonMsg.PageInfo getPageInfo() {
            if (this.pageInfoBuilder_ == null) {
               return this.pageInfo_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageInfo_;
            } else {
               return (CommonMsg.PageInfo)this.pageInfoBuilder_.getMessage();
            }
         }

         public Builder setPageInfo(CommonMsg.PageInfo value) {
            if (this.pageInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.pageInfo_ = value;
               this.onChanged();
            } else {
               this.pageInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setPageInfo(CommonMsg.PageInfo.Builder builderForValue) {
            if (this.pageInfoBuilder_ == null) {
               this.pageInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.pageInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergePageInfo(CommonMsg.PageInfo value) {
            if (this.pageInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.pageInfo_ != null && this.pageInfo_ != CommonMsg.PageInfo.getDefaultInstance()) {
                  this.pageInfo_ = CommonMsg.PageInfo.newBuilder(this.pageInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.pageInfo_ = value;
               }

               this.onChanged();
            } else {
               this.pageInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearPageInfo() {
            if (this.pageInfoBuilder_ == null) {
               this.pageInfo_ = null;
               this.onChanged();
            } else {
               this.pageInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public CommonMsg.PageInfo.Builder getPageInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (CommonMsg.PageInfo.Builder)this.getPageInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.PageInfoOrBuilder getPageInfoOrBuilder() {
            if (this.pageInfoBuilder_ != null) {
               return (CommonMsg.PageInfoOrBuilder)this.pageInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.pageInfo_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.PageInfo, CommonMsg.PageInfo.Builder, CommonMsg.PageInfoOrBuilder> getPageInfoFieldBuilder() {
            if (this.pageInfoBuilder_ == null) {
               this.pageInfoBuilder_ = new SingleFieldBuilderV3(this.getPageInfo(), this.getParentForChildren(), this.isClean());
               this.pageInfo_ = null;
            }

            return this.pageInfoBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_TransferList_13916 extends GeneratedMessageV3 implements S2C_TransferList_13916OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int PAGEINFO_FIELD_NUMBER = 1;
      private CommonMsg.PageInfo pageInfo_;
      public static final int TRANSFERINFOS_FIELD_NUMBER = 2;
      private List<CountryWarMsg.TransferPlayerInfo> transferInfos_;
      private byte memoizedIsInitialized;
      private static final S2C_TransferList_13916 DEFAULT_INSTANCE = new S2C_TransferList_13916();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TransferList_13916> PARSER = new AbstractParser<S2C_TransferList_13916>() {
         public S2C_TransferList_13916 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TransferList_13916(input, extensionRegistry);
         }
      };

      private S2C_TransferList_13916(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TransferList_13916() {
         this.memoizedIsInitialized = -1;
         this.transferInfos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TransferList_13916();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TransferList_13916(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        CommonMsg.PageInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.pageInfo_.toBuilder();
                        }

                        this.pageInfo_ = (CommonMsg.PageInfo)input.readMessage(CommonMsg.PageInfo.PARSER, extensionRegistry);
                        if (subBuilder != null) {
                           subBuilder.mergeFrom(this.pageInfo_);
                           this.pageInfo_ = subBuilder.buildPartial();
                        }

                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.transferInfos_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.transferInfos_.add(input.readMessage(CountryWarMsg.TransferPlayerInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.transferInfos_ = Collections.unmodifiableList(this.transferInfos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_TransferList_13916_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_TransferList_13916_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TransferList_13916.class, Builder.class);
      }

      public boolean hasPageInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public CommonMsg.PageInfo getPageInfo() {
         return this.pageInfo_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageInfo_;
      }

      public CommonMsg.PageInfoOrBuilder getPageInfoOrBuilder() {
         return this.pageInfo_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageInfo_;
      }

      public List<CountryWarMsg.TransferPlayerInfo> getTransferInfosList() {
         return this.transferInfos_;
      }

      public List<? extends CountryWarMsg.TransferPlayerInfoOrBuilder> getTransferInfosOrBuilderList() {
         return this.transferInfos_;
      }

      public int getTransferInfosCount() {
         return this.transferInfos_.size();
      }

      public CountryWarMsg.TransferPlayerInfo getTransferInfos(int index) {
         return (CountryWarMsg.TransferPlayerInfo)this.transferInfos_.get(index);
      }

      public CountryWarMsg.TransferPlayerInfoOrBuilder getTransferInfosOrBuilder(int index) {
         return (CountryWarMsg.TransferPlayerInfoOrBuilder)this.transferInfos_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasPageInfo()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.getPageInfo().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getTransferInfosCount(); ++i) {
               if (!this.getTransferInfos(i).isInitialized()) {
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
            output.writeMessage(1, this.getPageInfo());
         }

         for(int i = 0; i < this.transferInfos_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.transferInfos_.get(i));
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
               size += CodedOutputStream.computeMessageSize(1, this.getPageInfo());
            }

            for(int i = 0; i < this.transferInfos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.transferInfos_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TransferList_13916)) {
            return super.equals(obj);
         } else {
            S2C_TransferList_13916 other = (S2C_TransferList_13916)obj;
            if (this.hasPageInfo() != other.hasPageInfo()) {
               return false;
            } else if (this.hasPageInfo() && !this.getPageInfo().equals(other.getPageInfo())) {
               return false;
            } else if (!this.getTransferInfosList().equals(other.getTransferInfosList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasPageInfo()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getPageInfo().hashCode();
            }

            if (this.getTransferInfosCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTransferInfosList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TransferList_13916 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TransferList_13916)PARSER.parseFrom(data);
      }

      public static S2C_TransferList_13916 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TransferList_13916)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TransferList_13916 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TransferList_13916)PARSER.parseFrom(data);
      }

      public static S2C_TransferList_13916 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TransferList_13916)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TransferList_13916 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TransferList_13916)PARSER.parseFrom(data);
      }

      public static S2C_TransferList_13916 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TransferList_13916)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TransferList_13916 parseFrom(InputStream input) throws IOException {
         return (S2C_TransferList_13916)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TransferList_13916 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TransferList_13916)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TransferList_13916 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TransferList_13916)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TransferList_13916 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TransferList_13916)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TransferList_13916 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TransferList_13916)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TransferList_13916 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TransferList_13916)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TransferList_13916 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TransferList_13916 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TransferList_13916> parser() {
         return PARSER;
      }

      public Parser<S2C_TransferList_13916> getParserForType() {
         return PARSER;
      }

      public S2C_TransferList_13916 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TransferList_13916OrBuilder {
         private int bitField0_;
         private CommonMsg.PageInfo pageInfo_;
         private SingleFieldBuilderV3<CommonMsg.PageInfo, CommonMsg.PageInfo.Builder, CommonMsg.PageInfoOrBuilder> pageInfoBuilder_;
         private List<CountryWarMsg.TransferPlayerInfo> transferInfos_;
         private RepeatedFieldBuilderV3<CountryWarMsg.TransferPlayerInfo, CountryWarMsg.TransferPlayerInfo.Builder, CountryWarMsg.TransferPlayerInfoOrBuilder> transferInfosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_TransferList_13916_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_TransferList_13916_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TransferList_13916.class, Builder.class);
         }

         private Builder() {
            this.transferInfos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.transferInfos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.S2C_TransferList_13916.alwaysUseFieldBuilders) {
               this.getPageInfoFieldBuilder();
               this.getTransferInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.pageInfoBuilder_ == null) {
               this.pageInfo_ = null;
            } else {
               this.pageInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            if (this.transferInfosBuilder_ == null) {
               this.transferInfos_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.transferInfosBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_TransferList_13916_descriptor;
         }

         public S2C_TransferList_13916 getDefaultInstanceForType() {
            return DemonStrikesMsg.S2C_TransferList_13916.getDefaultInstance();
         }

         public S2C_TransferList_13916 build() {
            S2C_TransferList_13916 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TransferList_13916 buildPartial() {
            S2C_TransferList_13916 result = new S2C_TransferList_13916(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.pageInfoBuilder_ == null) {
                  result.pageInfo_ = this.pageInfo_;
               } else {
                  result.pageInfo_ = (CommonMsg.PageInfo)this.pageInfoBuilder_.build();
               }

               to_bitField0_ |= 1;
            }

            if (this.transferInfosBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.transferInfos_ = Collections.unmodifiableList(this.transferInfos_);
                  this.bitField0_ &= -3;
               }

               result.transferInfos_ = this.transferInfos_;
            } else {
               result.transferInfos_ = this.transferInfosBuilder_.build();
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
            if (other instanceof S2C_TransferList_13916) {
               return this.mergeFrom((S2C_TransferList_13916)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TransferList_13916 other) {
            if (other == DemonStrikesMsg.S2C_TransferList_13916.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasPageInfo()) {
                  this.mergePageInfo(other.getPageInfo());
               }

               if (this.transferInfosBuilder_ == null) {
                  if (!other.transferInfos_.isEmpty()) {
                     if (this.transferInfos_.isEmpty()) {
                        this.transferInfos_ = other.transferInfos_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureTransferInfosIsMutable();
                        this.transferInfos_.addAll(other.transferInfos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.transferInfos_.isEmpty()) {
                  if (this.transferInfosBuilder_.isEmpty()) {
                     this.transferInfosBuilder_.dispose();
                     this.transferInfosBuilder_ = null;
                     this.transferInfos_ = other.transferInfos_;
                     this.bitField0_ &= -3;
                     this.transferInfosBuilder_ = DemonStrikesMsg.S2C_TransferList_13916.alwaysUseFieldBuilders ? this.getTransferInfosFieldBuilder() : null;
                  } else {
                     this.transferInfosBuilder_.addAllMessages(other.transferInfos_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasPageInfo()) {
               return false;
            } else if (!this.getPageInfo().isInitialized()) {
               return false;
            } else {
               for(int i = 0; i < this.getTransferInfosCount(); ++i) {
                  if (!this.getTransferInfos(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TransferList_13916 parsedMessage = null;

            try {
               parsedMessage = (S2C_TransferList_13916)DemonStrikesMsg.S2C_TransferList_13916.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TransferList_13916)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasPageInfo() {
            return (this.bitField0_ & 1) != 0;
         }

         public CommonMsg.PageInfo getPageInfo() {
            if (this.pageInfoBuilder_ == null) {
               return this.pageInfo_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageInfo_;
            } else {
               return (CommonMsg.PageInfo)this.pageInfoBuilder_.getMessage();
            }
         }

         public Builder setPageInfo(CommonMsg.PageInfo value) {
            if (this.pageInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.pageInfo_ = value;
               this.onChanged();
            } else {
               this.pageInfoBuilder_.setMessage(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder setPageInfo(CommonMsg.PageInfo.Builder builderForValue) {
            if (this.pageInfoBuilder_ == null) {
               this.pageInfo_ = builderForValue.build();
               this.onChanged();
            } else {
               this.pageInfoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergePageInfo(CommonMsg.PageInfo value) {
            if (this.pageInfoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.pageInfo_ != null && this.pageInfo_ != CommonMsg.PageInfo.getDefaultInstance()) {
                  this.pageInfo_ = CommonMsg.PageInfo.newBuilder(this.pageInfo_).mergeFrom(value).buildPartial();
               } else {
                  this.pageInfo_ = value;
               }

               this.onChanged();
            } else {
               this.pageInfoBuilder_.mergeFrom(value);
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder clearPageInfo() {
            if (this.pageInfoBuilder_ == null) {
               this.pageInfo_ = null;
               this.onChanged();
            } else {
               this.pageInfoBuilder_.clear();
            }

            this.bitField0_ &= -2;
            return this;
         }

         public CommonMsg.PageInfo.Builder getPageInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (CommonMsg.PageInfo.Builder)this.getPageInfoFieldBuilder().getBuilder();
         }

         public CommonMsg.PageInfoOrBuilder getPageInfoOrBuilder() {
            if (this.pageInfoBuilder_ != null) {
               return (CommonMsg.PageInfoOrBuilder)this.pageInfoBuilder_.getMessageOrBuilder();
            } else {
               return this.pageInfo_ == null ? CommonMsg.PageInfo.getDefaultInstance() : this.pageInfo_;
            }
         }

         private SingleFieldBuilderV3<CommonMsg.PageInfo, CommonMsg.PageInfo.Builder, CommonMsg.PageInfoOrBuilder> getPageInfoFieldBuilder() {
            if (this.pageInfoBuilder_ == null) {
               this.pageInfoBuilder_ = new SingleFieldBuilderV3(this.getPageInfo(), this.getParentForChildren(), this.isClean());
               this.pageInfo_ = null;
            }

            return this.pageInfoBuilder_;
         }

         private void ensureTransferInfosIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.transferInfos_ = new ArrayList(this.transferInfos_);
               this.bitField0_ |= 2;
            }

         }

         public List<CountryWarMsg.TransferPlayerInfo> getTransferInfosList() {
            return this.transferInfosBuilder_ == null ? Collections.unmodifiableList(this.transferInfos_) : this.transferInfosBuilder_.getMessageList();
         }

         public int getTransferInfosCount() {
            return this.transferInfosBuilder_ == null ? this.transferInfos_.size() : this.transferInfosBuilder_.getCount();
         }

         public CountryWarMsg.TransferPlayerInfo getTransferInfos(int index) {
            return this.transferInfosBuilder_ == null ? (CountryWarMsg.TransferPlayerInfo)this.transferInfos_.get(index) : (CountryWarMsg.TransferPlayerInfo)this.transferInfosBuilder_.getMessage(index);
         }

         public Builder setTransferInfos(int index, CountryWarMsg.TransferPlayerInfo value) {
            if (this.transferInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTransferInfosIsMutable();
               this.transferInfos_.set(index, value);
               this.onChanged();
            } else {
               this.transferInfosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTransferInfos(int index, CountryWarMsg.TransferPlayerInfo.Builder builderForValue) {
            if (this.transferInfosBuilder_ == null) {
               this.ensureTransferInfosIsMutable();
               this.transferInfos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.transferInfosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTransferInfos(CountryWarMsg.TransferPlayerInfo value) {
            if (this.transferInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTransferInfosIsMutable();
               this.transferInfos_.add(value);
               this.onChanged();
            } else {
               this.transferInfosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTransferInfos(int index, CountryWarMsg.TransferPlayerInfo value) {
            if (this.transferInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTransferInfosIsMutable();
               this.transferInfos_.add(index, value);
               this.onChanged();
            } else {
               this.transferInfosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTransferInfos(CountryWarMsg.TransferPlayerInfo.Builder builderForValue) {
            if (this.transferInfosBuilder_ == null) {
               this.ensureTransferInfosIsMutable();
               this.transferInfos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.transferInfosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTransferInfos(int index, CountryWarMsg.TransferPlayerInfo.Builder builderForValue) {
            if (this.transferInfosBuilder_ == null) {
               this.ensureTransferInfosIsMutable();
               this.transferInfos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.transferInfosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTransferInfos(Iterable<? extends CountryWarMsg.TransferPlayerInfo> values) {
            if (this.transferInfosBuilder_ == null) {
               this.ensureTransferInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.transferInfos_);
               this.onChanged();
            } else {
               this.transferInfosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTransferInfos() {
            if (this.transferInfosBuilder_ == null) {
               this.transferInfos_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.transferInfosBuilder_.clear();
            }

            return this;
         }

         public Builder removeTransferInfos(int index) {
            if (this.transferInfosBuilder_ == null) {
               this.ensureTransferInfosIsMutable();
               this.transferInfos_.remove(index);
               this.onChanged();
            } else {
               this.transferInfosBuilder_.remove(index);
            }

            return this;
         }

         public CountryWarMsg.TransferPlayerInfo.Builder getTransferInfosBuilder(int index) {
            return (CountryWarMsg.TransferPlayerInfo.Builder)this.getTransferInfosFieldBuilder().getBuilder(index);
         }

         public CountryWarMsg.TransferPlayerInfoOrBuilder getTransferInfosOrBuilder(int index) {
            return this.transferInfosBuilder_ == null ? (CountryWarMsg.TransferPlayerInfoOrBuilder)this.transferInfos_.get(index) : (CountryWarMsg.TransferPlayerInfoOrBuilder)this.transferInfosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CountryWarMsg.TransferPlayerInfoOrBuilder> getTransferInfosOrBuilderList() {
            return this.transferInfosBuilder_ != null ? this.transferInfosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.transferInfos_);
         }

         public CountryWarMsg.TransferPlayerInfo.Builder addTransferInfosBuilder() {
            return (CountryWarMsg.TransferPlayerInfo.Builder)this.getTransferInfosFieldBuilder().addBuilder(CountryWarMsg.TransferPlayerInfo.getDefaultInstance());
         }

         public CountryWarMsg.TransferPlayerInfo.Builder addTransferInfosBuilder(int index) {
            return (CountryWarMsg.TransferPlayerInfo.Builder)this.getTransferInfosFieldBuilder().addBuilder(index, CountryWarMsg.TransferPlayerInfo.getDefaultInstance());
         }

         public List<CountryWarMsg.TransferPlayerInfo.Builder> getTransferInfosBuilderList() {
            return this.getTransferInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CountryWarMsg.TransferPlayerInfo, CountryWarMsg.TransferPlayerInfo.Builder, CountryWarMsg.TransferPlayerInfoOrBuilder> getTransferInfosFieldBuilder() {
            if (this.transferInfosBuilder_ == null) {
               this.transferInfosBuilder_ = new RepeatedFieldBuilderV3(this.transferInfos_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.transferInfos_ = null;
            }

            return this.transferInfosBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_TransferToCity_13917 extends GeneratedMessageV3 implements C2S_TransferToCity_13917OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CITYID_FIELD_NUMBER = 1;
      private int cityId_;
      public static final int TRANSFERPLAYERID_FIELD_NUMBER = 2;
      private int transferPlayerId_;
      private byte memoizedIsInitialized;
      private static final C2S_TransferToCity_13917 DEFAULT_INSTANCE = new C2S_TransferToCity_13917();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TransferToCity_13917> PARSER = new AbstractParser<C2S_TransferToCity_13917>() {
         public C2S_TransferToCity_13917 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TransferToCity_13917(input, extensionRegistry);
         }
      };

      private C2S_TransferToCity_13917(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TransferToCity_13917() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TransferToCity_13917();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TransferToCity_13917(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.cityId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.transferPlayerId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_TransferToCity_13917_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_TransferToCity_13917_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TransferToCity_13917.class, Builder.class);
      }

      public boolean hasCityId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCityId() {
         return this.cityId_;
      }

      public boolean hasTransferPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTransferPlayerId() {
         return this.transferPlayerId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCityId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTransferPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.cityId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.transferPlayerId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.cityId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.transferPlayerId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TransferToCity_13917)) {
            return super.equals(obj);
         } else {
            C2S_TransferToCity_13917 other = (C2S_TransferToCity_13917)obj;
            if (this.hasCityId() != other.hasCityId()) {
               return false;
            } else if (this.hasCityId() && this.getCityId() != other.getCityId()) {
               return false;
            } else if (this.hasTransferPlayerId() != other.hasTransferPlayerId()) {
               return false;
            } else if (this.hasTransferPlayerId() && this.getTransferPlayerId() != other.getTransferPlayerId()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasCityId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getCityId();
            }

            if (this.hasTransferPlayerId()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTransferPlayerId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TransferToCity_13917 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TransferToCity_13917)PARSER.parseFrom(data);
      }

      public static C2S_TransferToCity_13917 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TransferToCity_13917)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TransferToCity_13917 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TransferToCity_13917)PARSER.parseFrom(data);
      }

      public static C2S_TransferToCity_13917 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TransferToCity_13917)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TransferToCity_13917 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TransferToCity_13917)PARSER.parseFrom(data);
      }

      public static C2S_TransferToCity_13917 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TransferToCity_13917)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TransferToCity_13917 parseFrom(InputStream input) throws IOException {
         return (C2S_TransferToCity_13917)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TransferToCity_13917 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TransferToCity_13917)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TransferToCity_13917 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TransferToCity_13917)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TransferToCity_13917 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TransferToCity_13917)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TransferToCity_13917 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TransferToCity_13917)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TransferToCity_13917 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TransferToCity_13917)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TransferToCity_13917 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TransferToCity_13917 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TransferToCity_13917> parser() {
         return PARSER;
      }

      public Parser<C2S_TransferToCity_13917> getParserForType() {
         return PARSER;
      }

      public C2S_TransferToCity_13917 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TransferToCity_13917OrBuilder {
         private int bitField0_;
         private int cityId_;
         private int transferPlayerId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_TransferToCity_13917_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_TransferToCity_13917_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TransferToCity_13917.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.C2S_TransferToCity_13917.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.cityId_ = 0;
            this.bitField0_ &= -2;
            this.transferPlayerId_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_TransferToCity_13917_descriptor;
         }

         public C2S_TransferToCity_13917 getDefaultInstanceForType() {
            return DemonStrikesMsg.C2S_TransferToCity_13917.getDefaultInstance();
         }

         public C2S_TransferToCity_13917 build() {
            C2S_TransferToCity_13917 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TransferToCity_13917 buildPartial() {
            C2S_TransferToCity_13917 result = new C2S_TransferToCity_13917(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.cityId_ = this.cityId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.transferPlayerId_ = this.transferPlayerId_;
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
            if (other instanceof C2S_TransferToCity_13917) {
               return this.mergeFrom((C2S_TransferToCity_13917)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TransferToCity_13917 other) {
            if (other == DemonStrikesMsg.C2S_TransferToCity_13917.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCityId()) {
                  this.setCityId(other.getCityId());
               }

               if (other.hasTransferPlayerId()) {
                  this.setTransferPlayerId(other.getTransferPlayerId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCityId()) {
               return false;
            } else {
               return this.hasTransferPlayerId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TransferToCity_13917 parsedMessage = null;

            try {
               parsedMessage = (C2S_TransferToCity_13917)DemonStrikesMsg.C2S_TransferToCity_13917.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TransferToCity_13917)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCityId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getCityId() {
            return this.cityId_;
         }

         public Builder setCityId(int value) {
            this.bitField0_ |= 1;
            this.cityId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCityId() {
            this.bitField0_ &= -2;
            this.cityId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTransferPlayerId() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTransferPlayerId() {
            return this.transferPlayerId_;
         }

         public Builder setTransferPlayerId(int value) {
            this.bitField0_ |= 2;
            this.transferPlayerId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTransferPlayerId() {
            this.bitField0_ &= -3;
            this.transferPlayerId_ = 0;
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

   public static final class S2C_TransferToCity_13918 extends GeneratedMessageV3 implements S2C_TransferToCity_13918OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ATKRECOVERTIME_FIELD_NUMBER = 1;
      private int atkRecoverTime_;
      public static final int MOVERECOVERTIME_FIELD_NUMBER = 2;
      private int moveRecoverTime_;
      public static final int RESULT_FIELD_NUMBER = 3;
      private int result_;
      private byte memoizedIsInitialized;
      private static final S2C_TransferToCity_13918 DEFAULT_INSTANCE = new S2C_TransferToCity_13918();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TransferToCity_13918> PARSER = new AbstractParser<S2C_TransferToCity_13918>() {
         public S2C_TransferToCity_13918 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TransferToCity_13918(input, extensionRegistry);
         }
      };

      private S2C_TransferToCity_13918(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TransferToCity_13918() {
         this.memoizedIsInitialized = -1;
         this.result_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TransferToCity_13918();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TransferToCity_13918(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.atkRecoverTime_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.moveRecoverTime_ = input.readInt32();
                        break;
                     case 24:
                        int rawValue = input.readEnum();
                        TransferResult value = DemonStrikesMsg.TransferResult.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(3, rawValue);
                        } else {
                           this.bitField0_ |= 4;
                           this.result_ = rawValue;
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_TransferToCity_13918_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_TransferToCity_13918_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TransferToCity_13918.class, Builder.class);
      }

      public boolean hasAtkRecoverTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getAtkRecoverTime() {
         return this.atkRecoverTime_;
      }

      public boolean hasMoveRecoverTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getMoveRecoverTime() {
         return this.moveRecoverTime_;
      }

      public boolean hasResult() {
         return (this.bitField0_ & 4) != 0;
      }

      public TransferResult getResult() {
         TransferResult result = DemonStrikesMsg.TransferResult.valueOf(this.result_);
         return result == null ? DemonStrikesMsg.TransferResult.TRANSFER_ATK_SUC : result;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasAtkRecoverTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMoveRecoverTime()) {
            this.memoizedIsInitialized = 0;
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
            output.writeInt32(1, this.atkRecoverTime_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.moveRecoverTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeEnum(3, this.result_);
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
               size += CodedOutputStream.computeInt32Size(1, this.atkRecoverTime_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.moveRecoverTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeEnumSize(3, this.result_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TransferToCity_13918)) {
            return super.equals(obj);
         } else {
            S2C_TransferToCity_13918 other = (S2C_TransferToCity_13918)obj;
            if (this.hasAtkRecoverTime() != other.hasAtkRecoverTime()) {
               return false;
            } else if (this.hasAtkRecoverTime() && this.getAtkRecoverTime() != other.getAtkRecoverTime()) {
               return false;
            } else if (this.hasMoveRecoverTime() != other.hasMoveRecoverTime()) {
               return false;
            } else if (this.hasMoveRecoverTime() && this.getMoveRecoverTime() != other.getMoveRecoverTime()) {
               return false;
            } else if (this.hasResult() != other.hasResult()) {
               return false;
            } else if (this.hasResult() && this.result_ != other.result_) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasAtkRecoverTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getAtkRecoverTime();
            }

            if (this.hasMoveRecoverTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMoveRecoverTime();
            }

            if (this.hasResult()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.result_;
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TransferToCity_13918 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TransferToCity_13918)PARSER.parseFrom(data);
      }

      public static S2C_TransferToCity_13918 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TransferToCity_13918)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TransferToCity_13918 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TransferToCity_13918)PARSER.parseFrom(data);
      }

      public static S2C_TransferToCity_13918 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TransferToCity_13918)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TransferToCity_13918 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TransferToCity_13918)PARSER.parseFrom(data);
      }

      public static S2C_TransferToCity_13918 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TransferToCity_13918)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TransferToCity_13918 parseFrom(InputStream input) throws IOException {
         return (S2C_TransferToCity_13918)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TransferToCity_13918 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TransferToCity_13918)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TransferToCity_13918 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TransferToCity_13918)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TransferToCity_13918 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TransferToCity_13918)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TransferToCity_13918 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TransferToCity_13918)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TransferToCity_13918 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TransferToCity_13918)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TransferToCity_13918 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TransferToCity_13918 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TransferToCity_13918> parser() {
         return PARSER;
      }

      public Parser<S2C_TransferToCity_13918> getParserForType() {
         return PARSER;
      }

      public S2C_TransferToCity_13918 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TransferToCity_13918OrBuilder {
         private int bitField0_;
         private int atkRecoverTime_;
         private int moveRecoverTime_;
         private int result_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_TransferToCity_13918_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_TransferToCity_13918_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TransferToCity_13918.class, Builder.class);
         }

         private Builder() {
            this.result_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.result_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.S2C_TransferToCity_13918.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.atkRecoverTime_ = 0;
            this.bitField0_ &= -2;
            this.moveRecoverTime_ = 0;
            this.bitField0_ &= -3;
            this.result_ = 1;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_TransferToCity_13918_descriptor;
         }

         public S2C_TransferToCity_13918 getDefaultInstanceForType() {
            return DemonStrikesMsg.S2C_TransferToCity_13918.getDefaultInstance();
         }

         public S2C_TransferToCity_13918 build() {
            S2C_TransferToCity_13918 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TransferToCity_13918 buildPartial() {
            S2C_TransferToCity_13918 result = new S2C_TransferToCity_13918(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.atkRecoverTime_ = this.atkRecoverTime_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.moveRecoverTime_ = this.moveRecoverTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               to_bitField0_ |= 4;
            }

            result.result_ = this.result_;
            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_TransferToCity_13918) {
               return this.mergeFrom((S2C_TransferToCity_13918)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TransferToCity_13918 other) {
            if (other == DemonStrikesMsg.S2C_TransferToCity_13918.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasAtkRecoverTime()) {
                  this.setAtkRecoverTime(other.getAtkRecoverTime());
               }

               if (other.hasMoveRecoverTime()) {
                  this.setMoveRecoverTime(other.getMoveRecoverTime());
               }

               if (other.hasResult()) {
                  this.setResult(other.getResult());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasAtkRecoverTime()) {
               return false;
            } else if (!this.hasMoveRecoverTime()) {
               return false;
            } else {
               return this.hasResult();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TransferToCity_13918 parsedMessage = null;

            try {
               parsedMessage = (S2C_TransferToCity_13918)DemonStrikesMsg.S2C_TransferToCity_13918.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TransferToCity_13918)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasAtkRecoverTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getAtkRecoverTime() {
            return this.atkRecoverTime_;
         }

         public Builder setAtkRecoverTime(int value) {
            this.bitField0_ |= 1;
            this.atkRecoverTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearAtkRecoverTime() {
            this.bitField0_ &= -2;
            this.atkRecoverTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMoveRecoverTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getMoveRecoverTime() {
            return this.moveRecoverTime_;
         }

         public Builder setMoveRecoverTime(int value) {
            this.bitField0_ |= 2;
            this.moveRecoverTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMoveRecoverTime() {
            this.bitField0_ &= -3;
            this.moveRecoverTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasResult() {
            return (this.bitField0_ & 4) != 0;
         }

         public TransferResult getResult() {
            TransferResult result = DemonStrikesMsg.TransferResult.valueOf(this.result_);
            return result == null ? DemonStrikesMsg.TransferResult.TRANSFER_ATK_SUC : result;
         }

         public Builder setResult(TransferResult value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 4;
               this.result_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearResult() {
            this.bitField0_ &= -5;
            this.result_ = 1;
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

   public static final class C2S_Rank_13919 extends GeneratedMessageV3 implements C2S_Rank_13919OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANKTYPE_FIELD_NUMBER = 1;
      private int rankType_;
      public static final int LIMITCOUNT_FIELD_NUMBER = 2;
      private int limitCount_;
      private byte memoizedIsInitialized;
      private static final C2S_Rank_13919 DEFAULT_INSTANCE = new C2S_Rank_13919();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Rank_13919> PARSER = new AbstractParser<C2S_Rank_13919>() {
         public C2S_Rank_13919 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Rank_13919(input, extensionRegistry);
         }
      };

      private C2S_Rank_13919(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Rank_13919() {
         this.memoizedIsInitialized = -1;
         this.rankType_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Rank_13919();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Rank_13919(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        RankType value = DemonStrikesMsg.RankType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.rankType_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.limitCount_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_Rank_13919_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_Rank_13919_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Rank_13919.class, Builder.class);
      }

      public boolean hasRankType() {
         return (this.bitField0_ & 1) != 0;
      }

      public RankType getRankType() {
         RankType result = DemonStrikesMsg.RankType.valueOf(this.rankType_);
         return result == null ? DemonStrikesMsg.RankType.SERVER : result;
      }

      public boolean hasLimitCount() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getLimitCount() {
         return this.limitCount_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRankType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasLimitCount()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeEnum(1, this.rankType_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.limitCount_);
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
               size += CodedOutputStream.computeEnumSize(1, this.rankType_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.limitCount_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_Rank_13919)) {
            return super.equals(obj);
         } else {
            C2S_Rank_13919 other = (C2S_Rank_13919)obj;
            if (this.hasRankType() != other.hasRankType()) {
               return false;
            } else if (this.hasRankType() && this.rankType_ != other.rankType_) {
               return false;
            } else if (this.hasLimitCount() != other.hasLimitCount()) {
               return false;
            } else if (this.hasLimitCount() && this.getLimitCount() != other.getLimitCount()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasRankType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.rankType_;
            }

            if (this.hasLimitCount()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLimitCount();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_Rank_13919 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Rank_13919)PARSER.parseFrom(data);
      }

      public static C2S_Rank_13919 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Rank_13919)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Rank_13919 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Rank_13919)PARSER.parseFrom(data);
      }

      public static C2S_Rank_13919 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Rank_13919)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Rank_13919 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Rank_13919)PARSER.parseFrom(data);
      }

      public static C2S_Rank_13919 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Rank_13919)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Rank_13919 parseFrom(InputStream input) throws IOException {
         return (C2S_Rank_13919)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Rank_13919 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Rank_13919)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Rank_13919 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Rank_13919)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Rank_13919 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Rank_13919)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Rank_13919 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Rank_13919)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Rank_13919 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Rank_13919)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Rank_13919 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Rank_13919 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Rank_13919> parser() {
         return PARSER;
      }

      public Parser<C2S_Rank_13919> getParserForType() {
         return PARSER;
      }

      public C2S_Rank_13919 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Rank_13919OrBuilder {
         private int bitField0_;
         private int rankType_;
         private int limitCount_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_Rank_13919_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_Rank_13919_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Rank_13919.class, Builder.class);
         }

         private Builder() {
            this.rankType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rankType_ = 1;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.C2S_Rank_13919.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.rankType_ = 1;
            this.bitField0_ &= -2;
            this.limitCount_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_Rank_13919_descriptor;
         }

         public C2S_Rank_13919 getDefaultInstanceForType() {
            return DemonStrikesMsg.C2S_Rank_13919.getDefaultInstance();
         }

         public C2S_Rank_13919 build() {
            C2S_Rank_13919 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Rank_13919 buildPartial() {
            C2S_Rank_13919 result = new C2S_Rank_13919(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.rankType_ = this.rankType_;
            if ((from_bitField0_ & 2) != 0) {
               result.limitCount_ = this.limitCount_;
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
            if (other instanceof C2S_Rank_13919) {
               return this.mergeFrom((C2S_Rank_13919)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Rank_13919 other) {
            if (other == DemonStrikesMsg.C2S_Rank_13919.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRankType()) {
                  this.setRankType(other.getRankType());
               }

               if (other.hasLimitCount()) {
                  this.setLimitCount(other.getLimitCount());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRankType()) {
               return false;
            } else {
               return this.hasLimitCount();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_Rank_13919 parsedMessage = null;

            try {
               parsedMessage = (C2S_Rank_13919)DemonStrikesMsg.C2S_Rank_13919.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Rank_13919)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRankType() {
            return (this.bitField0_ & 1) != 0;
         }

         public RankType getRankType() {
            RankType result = DemonStrikesMsg.RankType.valueOf(this.rankType_);
            return result == null ? DemonStrikesMsg.RankType.SERVER : result;
         }

         public Builder setRankType(RankType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.rankType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearRankType() {
            this.bitField0_ &= -2;
            this.rankType_ = 1;
            this.onChanged();
            return this;
         }

         public boolean hasLimitCount() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getLimitCount() {
            return this.limitCount_;
         }

         public Builder setLimitCount(int value) {
            this.bitField0_ |= 2;
            this.limitCount_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearLimitCount() {
            this.bitField0_ &= -3;
            this.limitCount_ = 0;
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

   public static final class S2C_Rank_13920 extends GeneratedMessageV3 implements S2C_Rank_13920OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RANKTYPE_FIELD_NUMBER = 1;
      private int rankType_;
      public static final int RANK_FIELD_NUMBER = 2;
      private List<RankData> rank_;
      public static final int MYRANK_FIELD_NUMBER = 3;
      private RankData myRank_;
      private byte memoizedIsInitialized;
      private static final S2C_Rank_13920 DEFAULT_INSTANCE = new S2C_Rank_13920();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Rank_13920> PARSER = new AbstractParser<S2C_Rank_13920>() {
         public S2C_Rank_13920 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Rank_13920(input, extensionRegistry);
         }
      };

      private S2C_Rank_13920(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Rank_13920() {
         this.memoizedIsInitialized = -1;
         this.rankType_ = 1;
         this.rank_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Rank_13920();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Rank_13920(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        RankType value = DemonStrikesMsg.RankType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.rankType_ = rawValue;
                        }
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.rank_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.rank_.add(input.readMessage(DemonStrikesMsg.RankData.PARSER, extensionRegistry));
                        break;
                     case 26:
                        RankData.Builder subBuilder = null;
                        if ((this.bitField0_ & 2) != 0) {
                           subBuilder = this.myRank_.toBuilder();
                        }

                        this.myRank_ = (RankData)input.readMessage(DemonStrikesMsg.RankData.PARSER, extensionRegistry);
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
                  this.rank_ = Collections.unmodifiableList(this.rank_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_Rank_13920_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_Rank_13920_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Rank_13920.class, Builder.class);
      }

      public boolean hasRankType() {
         return (this.bitField0_ & 1) != 0;
      }

      public RankType getRankType() {
         RankType result = DemonStrikesMsg.RankType.valueOf(this.rankType_);
         return result == null ? DemonStrikesMsg.RankType.SERVER : result;
      }

      public List<RankData> getRankList() {
         return this.rank_;
      }

      public List<? extends RankDataOrBuilder> getRankOrBuilderList() {
         return this.rank_;
      }

      public int getRankCount() {
         return this.rank_.size();
      }

      public RankData getRank(int index) {
         return (RankData)this.rank_.get(index);
      }

      public RankDataOrBuilder getRankOrBuilder(int index) {
         return (RankDataOrBuilder)this.rank_.get(index);
      }

      public boolean hasMyRank() {
         return (this.bitField0_ & 2) != 0;
      }

      public RankData getMyRank() {
         return this.myRank_ == null ? DemonStrikesMsg.RankData.getDefaultInstance() : this.myRank_;
      }

      public RankDataOrBuilder getMyRankOrBuilder() {
         return this.myRank_ == null ? DemonStrikesMsg.RankData.getDefaultInstance() : this.myRank_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRankType()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMyRank()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getRankCount(); ++i) {
               if (!this.getRank(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            if (!this.getMyRank().isInitialized()) {
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
            output.writeEnum(1, this.rankType_);
         }

         for(int i = 0; i < this.rank_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.rank_.get(i));
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
               size += CodedOutputStream.computeEnumSize(1, this.rankType_);
            }

            for(int i = 0; i < this.rank_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.rank_.get(i));
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
         } else if (!(obj instanceof S2C_Rank_13920)) {
            return super.equals(obj);
         } else {
            S2C_Rank_13920 other = (S2C_Rank_13920)obj;
            if (this.hasRankType() != other.hasRankType()) {
               return false;
            } else if (this.hasRankType() && this.rankType_ != other.rankType_) {
               return false;
            } else if (!this.getRankList().equals(other.getRankList())) {
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
            if (this.hasRankType()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.rankType_;
            }

            if (this.getRankCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRankList().hashCode();
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

      public static S2C_Rank_13920 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Rank_13920)PARSER.parseFrom(data);
      }

      public static S2C_Rank_13920 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Rank_13920)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Rank_13920 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Rank_13920)PARSER.parseFrom(data);
      }

      public static S2C_Rank_13920 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Rank_13920)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Rank_13920 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Rank_13920)PARSER.parseFrom(data);
      }

      public static S2C_Rank_13920 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Rank_13920)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Rank_13920 parseFrom(InputStream input) throws IOException {
         return (S2C_Rank_13920)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Rank_13920 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Rank_13920)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Rank_13920 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Rank_13920)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Rank_13920 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Rank_13920)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Rank_13920 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Rank_13920)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Rank_13920 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Rank_13920)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Rank_13920 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Rank_13920 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Rank_13920> parser() {
         return PARSER;
      }

      public Parser<S2C_Rank_13920> getParserForType() {
         return PARSER;
      }

      public S2C_Rank_13920 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Rank_13920OrBuilder {
         private int bitField0_;
         private int rankType_;
         private List<RankData> rank_;
         private RepeatedFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> rankBuilder_;
         private RankData myRank_;
         private SingleFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> myRankBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_Rank_13920_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_Rank_13920_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Rank_13920.class, Builder.class);
         }

         private Builder() {
            this.rankType_ = 1;
            this.rank_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.rankType_ = 1;
            this.rank_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.S2C_Rank_13920.alwaysUseFieldBuilders) {
               this.getRankFieldBuilder();
               this.getMyRankFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.rankType_ = 1;
            this.bitField0_ &= -2;
            if (this.rankBuilder_ == null) {
               this.rank_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.rankBuilder_.clear();
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
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_Rank_13920_descriptor;
         }

         public S2C_Rank_13920 getDefaultInstanceForType() {
            return DemonStrikesMsg.S2C_Rank_13920.getDefaultInstance();
         }

         public S2C_Rank_13920 build() {
            S2C_Rank_13920 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Rank_13920 buildPartial() {
            S2C_Rank_13920 result = new S2C_Rank_13920(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.rankType_ = this.rankType_;
            if (this.rankBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.rank_ = Collections.unmodifiableList(this.rank_);
                  this.bitField0_ &= -3;
               }

               result.rank_ = this.rank_;
            } else {
               result.rank_ = this.rankBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               if (this.myRankBuilder_ == null) {
                  result.myRank_ = this.myRank_;
               } else {
                  result.myRank_ = (RankData)this.myRankBuilder_.build();
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
            if (other instanceof S2C_Rank_13920) {
               return this.mergeFrom((S2C_Rank_13920)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Rank_13920 other) {
            if (other == DemonStrikesMsg.S2C_Rank_13920.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRankType()) {
                  this.setRankType(other.getRankType());
               }

               if (this.rankBuilder_ == null) {
                  if (!other.rank_.isEmpty()) {
                     if (this.rank_.isEmpty()) {
                        this.rank_ = other.rank_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureRankIsMutable();
                        this.rank_.addAll(other.rank_);
                     }

                     this.onChanged();
                  }
               } else if (!other.rank_.isEmpty()) {
                  if (this.rankBuilder_.isEmpty()) {
                     this.rankBuilder_.dispose();
                     this.rankBuilder_ = null;
                     this.rank_ = other.rank_;
                     this.bitField0_ &= -3;
                     this.rankBuilder_ = DemonStrikesMsg.S2C_Rank_13920.alwaysUseFieldBuilders ? this.getRankFieldBuilder() : null;
                  } else {
                     this.rankBuilder_.addAllMessages(other.rank_);
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
            if (!this.hasRankType()) {
               return false;
            } else if (!this.hasMyRank()) {
               return false;
            } else {
               for(int i = 0; i < this.getRankCount(); ++i) {
                  if (!this.getRank(i).isInitialized()) {
                     return false;
                  }
               }

               if (!this.getMyRank().isInitialized()) {
                  return false;
               } else {
                  return true;
               }
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Rank_13920 parsedMessage = null;

            try {
               parsedMessage = (S2C_Rank_13920)DemonStrikesMsg.S2C_Rank_13920.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Rank_13920)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRankType() {
            return (this.bitField0_ & 1) != 0;
         }

         public RankType getRankType() {
            RankType result = DemonStrikesMsg.RankType.valueOf(this.rankType_);
            return result == null ? DemonStrikesMsg.RankType.SERVER : result;
         }

         public Builder setRankType(RankType value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 1;
               this.rankType_ = value.getNumber();
               this.onChanged();
               return this;
            }
         }

         public Builder clearRankType() {
            this.bitField0_ &= -2;
            this.rankType_ = 1;
            this.onChanged();
            return this;
         }

         private void ensureRankIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.rank_ = new ArrayList(this.rank_);
               this.bitField0_ |= 2;
            }

         }

         public List<RankData> getRankList() {
            return this.rankBuilder_ == null ? Collections.unmodifiableList(this.rank_) : this.rankBuilder_.getMessageList();
         }

         public int getRankCount() {
            return this.rankBuilder_ == null ? this.rank_.size() : this.rankBuilder_.getCount();
         }

         public RankData getRank(int index) {
            return this.rankBuilder_ == null ? (RankData)this.rank_.get(index) : (RankData)this.rankBuilder_.getMessage(index);
         }

         public Builder setRank(int index, RankData value) {
            if (this.rankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankIsMutable();
               this.rank_.set(index, value);
               this.onChanged();
            } else {
               this.rankBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setRank(int index, RankData.Builder builderForValue) {
            if (this.rankBuilder_ == null) {
               this.ensureRankIsMutable();
               this.rank_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addRank(RankData value) {
            if (this.rankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankIsMutable();
               this.rank_.add(value);
               this.onChanged();
            } else {
               this.rankBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addRank(int index, RankData value) {
            if (this.rankBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureRankIsMutable();
               this.rank_.add(index, value);
               this.onChanged();
            } else {
               this.rankBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addRank(RankData.Builder builderForValue) {
            if (this.rankBuilder_ == null) {
               this.ensureRankIsMutable();
               this.rank_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.rankBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addRank(int index, RankData.Builder builderForValue) {
            if (this.rankBuilder_ == null) {
               this.ensureRankIsMutable();
               this.rank_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.rankBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllRank(Iterable<? extends RankData> values) {
            if (this.rankBuilder_ == null) {
               this.ensureRankIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.rank_);
               this.onChanged();
            } else {
               this.rankBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearRank() {
            if (this.rankBuilder_ == null) {
               this.rank_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.rankBuilder_.clear();
            }

            return this;
         }

         public Builder removeRank(int index) {
            if (this.rankBuilder_ == null) {
               this.ensureRankIsMutable();
               this.rank_.remove(index);
               this.onChanged();
            } else {
               this.rankBuilder_.remove(index);
            }

            return this;
         }

         public RankData.Builder getRankBuilder(int index) {
            return (RankData.Builder)this.getRankFieldBuilder().getBuilder(index);
         }

         public RankDataOrBuilder getRankOrBuilder(int index) {
            return this.rankBuilder_ == null ? (RankDataOrBuilder)this.rank_.get(index) : (RankDataOrBuilder)this.rankBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends RankDataOrBuilder> getRankOrBuilderList() {
            return this.rankBuilder_ != null ? this.rankBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.rank_);
         }

         public RankData.Builder addRankBuilder() {
            return (RankData.Builder)this.getRankFieldBuilder().addBuilder(DemonStrikesMsg.RankData.getDefaultInstance());
         }

         public RankData.Builder addRankBuilder(int index) {
            return (RankData.Builder)this.getRankFieldBuilder().addBuilder(index, DemonStrikesMsg.RankData.getDefaultInstance());
         }

         public List<RankData.Builder> getRankBuilderList() {
            return this.getRankFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> getRankFieldBuilder() {
            if (this.rankBuilder_ == null) {
               this.rankBuilder_ = new RepeatedFieldBuilderV3(this.rank_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.rank_ = null;
            }

            return this.rankBuilder_;
         }

         public boolean hasMyRank() {
            return (this.bitField0_ & 4) != 0;
         }

         public RankData getMyRank() {
            if (this.myRankBuilder_ == null) {
               return this.myRank_ == null ? DemonStrikesMsg.RankData.getDefaultInstance() : this.myRank_;
            } else {
               return (RankData)this.myRankBuilder_.getMessage();
            }
         }

         public Builder setMyRank(RankData value) {
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

         public Builder setMyRank(RankData.Builder builderForValue) {
            if (this.myRankBuilder_ == null) {
               this.myRank_ = builderForValue.build();
               this.onChanged();
            } else {
               this.myRankBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 4;
            return this;
         }

         public Builder mergeMyRank(RankData value) {
            if (this.myRankBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0 && this.myRank_ != null && this.myRank_ != DemonStrikesMsg.RankData.getDefaultInstance()) {
                  this.myRank_ = DemonStrikesMsg.RankData.newBuilder(this.myRank_).mergeFrom(value).buildPartial();
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

         public RankData.Builder getMyRankBuilder() {
            this.bitField0_ |= 4;
            this.onChanged();
            return (RankData.Builder)this.getMyRankFieldBuilder().getBuilder();
         }

         public RankDataOrBuilder getMyRankOrBuilder() {
            if (this.myRankBuilder_ != null) {
               return (RankDataOrBuilder)this.myRankBuilder_.getMessageOrBuilder();
            } else {
               return this.myRank_ == null ? DemonStrikesMsg.RankData.getDefaultInstance() : this.myRank_;
            }
         }

         private SingleFieldBuilderV3<RankData, RankData.Builder, RankDataOrBuilder> getMyRankFieldBuilder() {
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

   public static final class C2S_Logs_13921 extends GeneratedMessageV3 implements C2S_Logs_13921OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      private byte memoizedIsInitialized;
      private static final C2S_Logs_13921 DEFAULT_INSTANCE = new C2S_Logs_13921();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_Logs_13921> PARSER = new AbstractParser<C2S_Logs_13921>() {
         public C2S_Logs_13921 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_Logs_13921(input, extensionRegistry);
         }
      };

      private C2S_Logs_13921(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_Logs_13921() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_Logs_13921();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_Logs_13921(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_Logs_13921_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_Logs_13921_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Logs_13921.class, Builder.class);
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
         } else if (!(obj instanceof C2S_Logs_13921)) {
            return super.equals(obj);
         } else {
            C2S_Logs_13921 other = (C2S_Logs_13921)obj;
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

      public static C2S_Logs_13921 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_Logs_13921)PARSER.parseFrom(data);
      }

      public static C2S_Logs_13921 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Logs_13921)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Logs_13921 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_Logs_13921)PARSER.parseFrom(data);
      }

      public static C2S_Logs_13921 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Logs_13921)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Logs_13921 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_Logs_13921)PARSER.parseFrom(data);
      }

      public static C2S_Logs_13921 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_Logs_13921)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_Logs_13921 parseFrom(InputStream input) throws IOException {
         return (C2S_Logs_13921)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Logs_13921 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Logs_13921)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Logs_13921 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_Logs_13921)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_Logs_13921 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Logs_13921)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_Logs_13921 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_Logs_13921)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_Logs_13921 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_Logs_13921)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_Logs_13921 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_Logs_13921 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_Logs_13921> parser() {
         return PARSER;
      }

      public Parser<C2S_Logs_13921> getParserForType() {
         return PARSER;
      }

      public C2S_Logs_13921 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_Logs_13921OrBuilder {
         private int bitField0_;
         private int type_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_Logs_13921_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_Logs_13921_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_Logs_13921.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.C2S_Logs_13921.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_Logs_13921_descriptor;
         }

         public C2S_Logs_13921 getDefaultInstanceForType() {
            return DemonStrikesMsg.C2S_Logs_13921.getDefaultInstance();
         }

         public C2S_Logs_13921 build() {
            C2S_Logs_13921 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_Logs_13921 buildPartial() {
            C2S_Logs_13921 result = new C2S_Logs_13921(this);
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
            if (other instanceof C2S_Logs_13921) {
               return this.mergeFrom((C2S_Logs_13921)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_Logs_13921 other) {
            if (other == DemonStrikesMsg.C2S_Logs_13921.getDefaultInstance()) {
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
            C2S_Logs_13921 parsedMessage = null;

            try {
               parsedMessage = (C2S_Logs_13921)DemonStrikesMsg.C2S_Logs_13921.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_Logs_13921)e.getUnfinishedMessage();
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

   public static final class S2C_Logs_13922 extends GeneratedMessageV3 implements S2C_Logs_13922OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int LOG_FIELD_NUMBER = 2;
      private List<LogInfo> log_;
      private byte memoizedIsInitialized;
      private static final S2C_Logs_13922 DEFAULT_INSTANCE = new S2C_Logs_13922();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_Logs_13922> PARSER = new AbstractParser<S2C_Logs_13922>() {
         public S2C_Logs_13922 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_Logs_13922(input, extensionRegistry);
         }
      };

      private S2C_Logs_13922(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_Logs_13922() {
         this.memoizedIsInitialized = -1;
         this.log_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_Logs_13922();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_Logs_13922(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                           this.log_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.log_.add(input.readMessage(DemonStrikesMsg.LogInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.log_ = Collections.unmodifiableList(this.log_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_Logs_13922_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_Logs_13922_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Logs_13922.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public List<LogInfo> getLogList() {
         return this.log_;
      }

      public List<? extends LogInfoOrBuilder> getLogOrBuilderList() {
         return this.log_;
      }

      public int getLogCount() {
         return this.log_.size();
      }

      public LogInfo getLog(int index) {
         return (LogInfo)this.log_.get(index);
      }

      public LogInfoOrBuilder getLogOrBuilder(int index) {
         return (LogInfoOrBuilder)this.log_.get(index);
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
            for(int i = 0; i < this.getLogCount(); ++i) {
               if (!this.getLog(i).isInitialized()) {
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
            output.writeInt32(1, this.type_);
         }

         for(int i = 0; i < this.log_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.log_.get(i));
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

            for(int i = 0; i < this.log_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.log_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_Logs_13922)) {
            return super.equals(obj);
         } else {
            S2C_Logs_13922 other = (S2C_Logs_13922)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (!this.getLogList().equals(other.getLogList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.getLogCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getLogList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_Logs_13922 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_Logs_13922)PARSER.parseFrom(data);
      }

      public static S2C_Logs_13922 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Logs_13922)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Logs_13922 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_Logs_13922)PARSER.parseFrom(data);
      }

      public static S2C_Logs_13922 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Logs_13922)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Logs_13922 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_Logs_13922)PARSER.parseFrom(data);
      }

      public static S2C_Logs_13922 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_Logs_13922)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_Logs_13922 parseFrom(InputStream input) throws IOException {
         return (S2C_Logs_13922)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Logs_13922 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Logs_13922)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Logs_13922 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_Logs_13922)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_Logs_13922 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Logs_13922)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_Logs_13922 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_Logs_13922)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_Logs_13922 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_Logs_13922)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_Logs_13922 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_Logs_13922 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_Logs_13922> parser() {
         return PARSER;
      }

      public Parser<S2C_Logs_13922> getParserForType() {
         return PARSER;
      }

      public S2C_Logs_13922 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_Logs_13922OrBuilder {
         private int bitField0_;
         private int type_;
         private List<LogInfo> log_;
         private RepeatedFieldBuilderV3<LogInfo, LogInfo.Builder, LogInfoOrBuilder> logBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_Logs_13922_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_Logs_13922_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_Logs_13922.class, Builder.class);
         }

         private Builder() {
            this.log_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.log_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.S2C_Logs_13922.alwaysUseFieldBuilders) {
               this.getLogFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            if (this.logBuilder_ == null) {
               this.log_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.logBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_Logs_13922_descriptor;
         }

         public S2C_Logs_13922 getDefaultInstanceForType() {
            return DemonStrikesMsg.S2C_Logs_13922.getDefaultInstance();
         }

         public S2C_Logs_13922 build() {
            S2C_Logs_13922 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_Logs_13922 buildPartial() {
            S2C_Logs_13922 result = new S2C_Logs_13922(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 1;
            }

            if (this.logBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.log_ = Collections.unmodifiableList(this.log_);
                  this.bitField0_ &= -3;
               }

               result.log_ = this.log_;
            } else {
               result.log_ = this.logBuilder_.build();
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
            if (other instanceof S2C_Logs_13922) {
               return this.mergeFrom((S2C_Logs_13922)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_Logs_13922 other) {
            if (other == DemonStrikesMsg.S2C_Logs_13922.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (this.logBuilder_ == null) {
                  if (!other.log_.isEmpty()) {
                     if (this.log_.isEmpty()) {
                        this.log_ = other.log_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureLogIsMutable();
                        this.log_.addAll(other.log_);
                     }

                     this.onChanged();
                  }
               } else if (!other.log_.isEmpty()) {
                  if (this.logBuilder_.isEmpty()) {
                     this.logBuilder_.dispose();
                     this.logBuilder_ = null;
                     this.log_ = other.log_;
                     this.bitField0_ &= -3;
                     this.logBuilder_ = DemonStrikesMsg.S2C_Logs_13922.alwaysUseFieldBuilders ? this.getLogFieldBuilder() : null;
                  } else {
                     this.logBuilder_.addAllMessages(other.log_);
                  }
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
               for(int i = 0; i < this.getLogCount(); ++i) {
                  if (!this.getLog(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_Logs_13922 parsedMessage = null;

            try {
               parsedMessage = (S2C_Logs_13922)DemonStrikesMsg.S2C_Logs_13922.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_Logs_13922)e.getUnfinishedMessage();
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

         private void ensureLogIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.log_ = new ArrayList(this.log_);
               this.bitField0_ |= 2;
            }

         }

         public List<LogInfo> getLogList() {
            return this.logBuilder_ == null ? Collections.unmodifiableList(this.log_) : this.logBuilder_.getMessageList();
         }

         public int getLogCount() {
            return this.logBuilder_ == null ? this.log_.size() : this.logBuilder_.getCount();
         }

         public LogInfo getLog(int index) {
            return this.logBuilder_ == null ? (LogInfo)this.log_.get(index) : (LogInfo)this.logBuilder_.getMessage(index);
         }

         public Builder setLog(int index, LogInfo value) {
            if (this.logBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLogIsMutable();
               this.log_.set(index, value);
               this.onChanged();
            } else {
               this.logBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setLog(int index, LogInfo.Builder builderForValue) {
            if (this.logBuilder_ == null) {
               this.ensureLogIsMutable();
               this.log_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.logBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addLog(LogInfo value) {
            if (this.logBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLogIsMutable();
               this.log_.add(value);
               this.onChanged();
            } else {
               this.logBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addLog(int index, LogInfo value) {
            if (this.logBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureLogIsMutable();
               this.log_.add(index, value);
               this.onChanged();
            } else {
               this.logBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addLog(LogInfo.Builder builderForValue) {
            if (this.logBuilder_ == null) {
               this.ensureLogIsMutable();
               this.log_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.logBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addLog(int index, LogInfo.Builder builderForValue) {
            if (this.logBuilder_ == null) {
               this.ensureLogIsMutable();
               this.log_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.logBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllLog(Iterable<? extends LogInfo> values) {
            if (this.logBuilder_ == null) {
               this.ensureLogIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.log_);
               this.onChanged();
            } else {
               this.logBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearLog() {
            if (this.logBuilder_ == null) {
               this.log_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.logBuilder_.clear();
            }

            return this;
         }

         public Builder removeLog(int index) {
            if (this.logBuilder_ == null) {
               this.ensureLogIsMutable();
               this.log_.remove(index);
               this.onChanged();
            } else {
               this.logBuilder_.remove(index);
            }

            return this;
         }

         public LogInfo.Builder getLogBuilder(int index) {
            return (LogInfo.Builder)this.getLogFieldBuilder().getBuilder(index);
         }

         public LogInfoOrBuilder getLogOrBuilder(int index) {
            return this.logBuilder_ == null ? (LogInfoOrBuilder)this.log_.get(index) : (LogInfoOrBuilder)this.logBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends LogInfoOrBuilder> getLogOrBuilderList() {
            return this.logBuilder_ != null ? this.logBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.log_);
         }

         public LogInfo.Builder addLogBuilder() {
            return (LogInfo.Builder)this.getLogFieldBuilder().addBuilder(DemonStrikesMsg.LogInfo.getDefaultInstance());
         }

         public LogInfo.Builder addLogBuilder(int index) {
            return (LogInfo.Builder)this.getLogFieldBuilder().addBuilder(index, DemonStrikesMsg.LogInfo.getDefaultInstance());
         }

         public List<LogInfo.Builder> getLogBuilderList() {
            return this.getLogFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<LogInfo, LogInfo.Builder, LogInfoOrBuilder> getLogFieldBuilder() {
            if (this.logBuilder_ == null) {
               this.logBuilder_ = new RepeatedFieldBuilderV3(this.log_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.log_ = null;
            }

            return this.logBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_IntegralRewardMain_13923 extends GeneratedMessageV3 implements C2S_IntegralRewardMain_13923OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_IntegralRewardMain_13923 DEFAULT_INSTANCE = new C2S_IntegralRewardMain_13923();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_IntegralRewardMain_13923> PARSER = new AbstractParser<C2S_IntegralRewardMain_13923>() {
         public C2S_IntegralRewardMain_13923 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_IntegralRewardMain_13923(input, extensionRegistry);
         }
      };

      private C2S_IntegralRewardMain_13923(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_IntegralRewardMain_13923() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_IntegralRewardMain_13923();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_IntegralRewardMain_13923(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_IntegralRewardMain_13923_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_IntegralRewardMain_13923_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_IntegralRewardMain_13923.class, Builder.class);
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
         } else if (!(obj instanceof C2S_IntegralRewardMain_13923)) {
            return super.equals(obj);
         } else {
            C2S_IntegralRewardMain_13923 other = (C2S_IntegralRewardMain_13923)obj;
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

      public static C2S_IntegralRewardMain_13923 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_IntegralRewardMain_13923)PARSER.parseFrom(data);
      }

      public static C2S_IntegralRewardMain_13923 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_IntegralRewardMain_13923)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_IntegralRewardMain_13923 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_IntegralRewardMain_13923)PARSER.parseFrom(data);
      }

      public static C2S_IntegralRewardMain_13923 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_IntegralRewardMain_13923)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_IntegralRewardMain_13923 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_IntegralRewardMain_13923)PARSER.parseFrom(data);
      }

      public static C2S_IntegralRewardMain_13923 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_IntegralRewardMain_13923)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_IntegralRewardMain_13923 parseFrom(InputStream input) throws IOException {
         return (C2S_IntegralRewardMain_13923)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_IntegralRewardMain_13923 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_IntegralRewardMain_13923)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_IntegralRewardMain_13923 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_IntegralRewardMain_13923)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_IntegralRewardMain_13923 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_IntegralRewardMain_13923)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_IntegralRewardMain_13923 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_IntegralRewardMain_13923)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_IntegralRewardMain_13923 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_IntegralRewardMain_13923)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_IntegralRewardMain_13923 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_IntegralRewardMain_13923 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_IntegralRewardMain_13923> parser() {
         return PARSER;
      }

      public Parser<C2S_IntegralRewardMain_13923> getParserForType() {
         return PARSER;
      }

      public C2S_IntegralRewardMain_13923 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_IntegralRewardMain_13923OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_IntegralRewardMain_13923_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_IntegralRewardMain_13923_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_IntegralRewardMain_13923.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.C2S_IntegralRewardMain_13923.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_IntegralRewardMain_13923_descriptor;
         }

         public C2S_IntegralRewardMain_13923 getDefaultInstanceForType() {
            return DemonStrikesMsg.C2S_IntegralRewardMain_13923.getDefaultInstance();
         }

         public C2S_IntegralRewardMain_13923 build() {
            C2S_IntegralRewardMain_13923 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_IntegralRewardMain_13923 buildPartial() {
            C2S_IntegralRewardMain_13923 result = new C2S_IntegralRewardMain_13923(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_IntegralRewardMain_13923) {
               return this.mergeFrom((C2S_IntegralRewardMain_13923)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_IntegralRewardMain_13923 other) {
            if (other == DemonStrikesMsg.C2S_IntegralRewardMain_13923.getDefaultInstance()) {
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
            C2S_IntegralRewardMain_13923 parsedMessage = null;

            try {
               parsedMessage = (C2S_IntegralRewardMain_13923)DemonStrikesMsg.C2S_IntegralRewardMain_13923.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_IntegralRewardMain_13923)e.getUnfinishedMessage();
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

   public static final class S2C_IntegralRewardMain_13924 extends GeneratedMessageV3 implements S2C_IntegralRewardMain_13924OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARD_FIELD_NUMBER = 1;
      private int reward_;
      public static final int GROUP_FIELD_NUMBER = 2;
      private List<TaskGroup> group_;
      public static final int SUPERREWARD_FIELD_NUMBER = 3;
      private int superReward_;
      private byte memoizedIsInitialized;
      private static final S2C_IntegralRewardMain_13924 DEFAULT_INSTANCE = new S2C_IntegralRewardMain_13924();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_IntegralRewardMain_13924> PARSER = new AbstractParser<S2C_IntegralRewardMain_13924>() {
         public S2C_IntegralRewardMain_13924 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_IntegralRewardMain_13924(input, extensionRegistry);
         }
      };

      private S2C_IntegralRewardMain_13924(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_IntegralRewardMain_13924() {
         this.memoizedIsInitialized = -1;
         this.group_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_IntegralRewardMain_13924();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_IntegralRewardMain_13924(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.reward_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.group_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.group_.add(input.readMessage(DemonStrikesMsg.TaskGroup.PARSER, extensionRegistry));
                        break;
                     case 24:
                        this.bitField0_ |= 2;
                        this.superReward_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.group_ = Collections.unmodifiableList(this.group_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_IntegralRewardMain_13924_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_IntegralRewardMain_13924_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_IntegralRewardMain_13924.class, Builder.class);
      }

      public boolean hasReward() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getReward() {
         return this.reward_;
      }

      public List<TaskGroup> getGroupList() {
         return this.group_;
      }

      public List<? extends TaskGroupOrBuilder> getGroupOrBuilderList() {
         return this.group_;
      }

      public int getGroupCount() {
         return this.group_.size();
      }

      public TaskGroup getGroup(int index) {
         return (TaskGroup)this.group_.get(index);
      }

      public TaskGroupOrBuilder getGroupOrBuilder(int index) {
         return (TaskGroupOrBuilder)this.group_.get(index);
      }

      public boolean hasSuperReward() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSuperReward() {
         return this.superReward_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasReward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSuperReward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getGroupCount(); ++i) {
               if (!this.getGroup(i).isInitialized()) {
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
            output.writeInt32(1, this.reward_);
         }

         for(int i = 0; i < this.group_.size(); ++i) {
            output.writeMessage(2, (MessageLite)this.group_.get(i));
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(3, this.superReward_);
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
               size += CodedOutputStream.computeInt32Size(1, this.reward_);
            }

            for(int i = 0; i < this.group_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(2, (MessageLite)this.group_.get(i));
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.superReward_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_IntegralRewardMain_13924)) {
            return super.equals(obj);
         } else {
            S2C_IntegralRewardMain_13924 other = (S2C_IntegralRewardMain_13924)obj;
            if (this.hasReward() != other.hasReward()) {
               return false;
            } else if (this.hasReward() && this.getReward() != other.getReward()) {
               return false;
            } else if (!this.getGroupList().equals(other.getGroupList())) {
               return false;
            } else if (this.hasSuperReward() != other.hasSuperReward()) {
               return false;
            } else if (this.hasSuperReward() && this.getSuperReward() != other.getSuperReward()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasReward()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getReward();
            }

            if (this.getGroupCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGroupList().hashCode();
            }

            if (this.hasSuperReward()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getSuperReward();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_IntegralRewardMain_13924 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_IntegralRewardMain_13924)PARSER.parseFrom(data);
      }

      public static S2C_IntegralRewardMain_13924 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_IntegralRewardMain_13924)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_IntegralRewardMain_13924 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_IntegralRewardMain_13924)PARSER.parseFrom(data);
      }

      public static S2C_IntegralRewardMain_13924 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_IntegralRewardMain_13924)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_IntegralRewardMain_13924 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_IntegralRewardMain_13924)PARSER.parseFrom(data);
      }

      public static S2C_IntegralRewardMain_13924 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_IntegralRewardMain_13924)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_IntegralRewardMain_13924 parseFrom(InputStream input) throws IOException {
         return (S2C_IntegralRewardMain_13924)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_IntegralRewardMain_13924 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_IntegralRewardMain_13924)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_IntegralRewardMain_13924 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_IntegralRewardMain_13924)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_IntegralRewardMain_13924 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_IntegralRewardMain_13924)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_IntegralRewardMain_13924 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_IntegralRewardMain_13924)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_IntegralRewardMain_13924 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_IntegralRewardMain_13924)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_IntegralRewardMain_13924 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_IntegralRewardMain_13924 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_IntegralRewardMain_13924> parser() {
         return PARSER;
      }

      public Parser<S2C_IntegralRewardMain_13924> getParserForType() {
         return PARSER;
      }

      public S2C_IntegralRewardMain_13924 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_IntegralRewardMain_13924OrBuilder {
         private int bitField0_;
         private int reward_;
         private List<TaskGroup> group_;
         private RepeatedFieldBuilderV3<TaskGroup, TaskGroup.Builder, TaskGroupOrBuilder> groupBuilder_;
         private int superReward_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_IntegralRewardMain_13924_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_IntegralRewardMain_13924_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_IntegralRewardMain_13924.class, Builder.class);
         }

         private Builder() {
            this.group_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.group_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.S2C_IntegralRewardMain_13924.alwaysUseFieldBuilders) {
               this.getGroupFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.reward_ = 0;
            this.bitField0_ &= -2;
            if (this.groupBuilder_ == null) {
               this.group_ = Collections.emptyList();
               this.bitField0_ &= -3;
            } else {
               this.groupBuilder_.clear();
            }

            this.superReward_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_IntegralRewardMain_13924_descriptor;
         }

         public S2C_IntegralRewardMain_13924 getDefaultInstanceForType() {
            return DemonStrikesMsg.S2C_IntegralRewardMain_13924.getDefaultInstance();
         }

         public S2C_IntegralRewardMain_13924 build() {
            S2C_IntegralRewardMain_13924 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_IntegralRewardMain_13924 buildPartial() {
            S2C_IntegralRewardMain_13924 result = new S2C_IntegralRewardMain_13924(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.reward_ = this.reward_;
               to_bitField0_ |= 1;
            }

            if (this.groupBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.group_ = Collections.unmodifiableList(this.group_);
                  this.bitField0_ &= -3;
               }

               result.group_ = this.group_;
            } else {
               result.group_ = this.groupBuilder_.build();
            }

            if ((from_bitField0_ & 4) != 0) {
               result.superReward_ = this.superReward_;
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
            if (other instanceof S2C_IntegralRewardMain_13924) {
               return this.mergeFrom((S2C_IntegralRewardMain_13924)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_IntegralRewardMain_13924 other) {
            if (other == DemonStrikesMsg.S2C_IntegralRewardMain_13924.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasReward()) {
                  this.setReward(other.getReward());
               }

               if (this.groupBuilder_ == null) {
                  if (!other.group_.isEmpty()) {
                     if (this.group_.isEmpty()) {
                        this.group_ = other.group_;
                        this.bitField0_ &= -3;
                     } else {
                        this.ensureGroupIsMutable();
                        this.group_.addAll(other.group_);
                     }

                     this.onChanged();
                  }
               } else if (!other.group_.isEmpty()) {
                  if (this.groupBuilder_.isEmpty()) {
                     this.groupBuilder_.dispose();
                     this.groupBuilder_ = null;
                     this.group_ = other.group_;
                     this.bitField0_ &= -3;
                     this.groupBuilder_ = DemonStrikesMsg.S2C_IntegralRewardMain_13924.alwaysUseFieldBuilders ? this.getGroupFieldBuilder() : null;
                  } else {
                     this.groupBuilder_.addAllMessages(other.group_);
                  }
               }

               if (other.hasSuperReward()) {
                  this.setSuperReward(other.getSuperReward());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasReward()) {
               return false;
            } else if (!this.hasSuperReward()) {
               return false;
            } else {
               for(int i = 0; i < this.getGroupCount(); ++i) {
                  if (!this.getGroup(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_IntegralRewardMain_13924 parsedMessage = null;

            try {
               parsedMessage = (S2C_IntegralRewardMain_13924)DemonStrikesMsg.S2C_IntegralRewardMain_13924.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_IntegralRewardMain_13924)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasReward() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getReward() {
            return this.reward_;
         }

         public Builder setReward(int value) {
            this.bitField0_ |= 1;
            this.reward_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearReward() {
            this.bitField0_ &= -2;
            this.reward_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureGroupIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.group_ = new ArrayList(this.group_);
               this.bitField0_ |= 2;
            }

         }

         public List<TaskGroup> getGroupList() {
            return this.groupBuilder_ == null ? Collections.unmodifiableList(this.group_) : this.groupBuilder_.getMessageList();
         }

         public int getGroupCount() {
            return this.groupBuilder_ == null ? this.group_.size() : this.groupBuilder_.getCount();
         }

         public TaskGroup getGroup(int index) {
            return this.groupBuilder_ == null ? (TaskGroup)this.group_.get(index) : (TaskGroup)this.groupBuilder_.getMessage(index);
         }

         public Builder setGroup(int index, TaskGroup value) {
            if (this.groupBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGroupIsMutable();
               this.group_.set(index, value);
               this.onChanged();
            } else {
               this.groupBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setGroup(int index, TaskGroup.Builder builderForValue) {
            if (this.groupBuilder_ == null) {
               this.ensureGroupIsMutable();
               this.group_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.groupBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addGroup(TaskGroup value) {
            if (this.groupBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGroupIsMutable();
               this.group_.add(value);
               this.onChanged();
            } else {
               this.groupBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addGroup(int index, TaskGroup value) {
            if (this.groupBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureGroupIsMutable();
               this.group_.add(index, value);
               this.onChanged();
            } else {
               this.groupBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addGroup(TaskGroup.Builder builderForValue) {
            if (this.groupBuilder_ == null) {
               this.ensureGroupIsMutable();
               this.group_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.groupBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addGroup(int index, TaskGroup.Builder builderForValue) {
            if (this.groupBuilder_ == null) {
               this.ensureGroupIsMutable();
               this.group_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.groupBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllGroup(Iterable<? extends TaskGroup> values) {
            if (this.groupBuilder_ == null) {
               this.ensureGroupIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.group_);
               this.onChanged();
            } else {
               this.groupBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearGroup() {
            if (this.groupBuilder_ == null) {
               this.group_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.groupBuilder_.clear();
            }

            return this;
         }

         public Builder removeGroup(int index) {
            if (this.groupBuilder_ == null) {
               this.ensureGroupIsMutable();
               this.group_.remove(index);
               this.onChanged();
            } else {
               this.groupBuilder_.remove(index);
            }

            return this;
         }

         public TaskGroup.Builder getGroupBuilder(int index) {
            return (TaskGroup.Builder)this.getGroupFieldBuilder().getBuilder(index);
         }

         public TaskGroupOrBuilder getGroupOrBuilder(int index) {
            return this.groupBuilder_ == null ? (TaskGroupOrBuilder)this.group_.get(index) : (TaskGroupOrBuilder)this.groupBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends TaskGroupOrBuilder> getGroupOrBuilderList() {
            return this.groupBuilder_ != null ? this.groupBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.group_);
         }

         public TaskGroup.Builder addGroupBuilder() {
            return (TaskGroup.Builder)this.getGroupFieldBuilder().addBuilder(DemonStrikesMsg.TaskGroup.getDefaultInstance());
         }

         public TaskGroup.Builder addGroupBuilder(int index) {
            return (TaskGroup.Builder)this.getGroupFieldBuilder().addBuilder(index, DemonStrikesMsg.TaskGroup.getDefaultInstance());
         }

         public List<TaskGroup.Builder> getGroupBuilderList() {
            return this.getGroupFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<TaskGroup, TaskGroup.Builder, TaskGroupOrBuilder> getGroupFieldBuilder() {
            if (this.groupBuilder_ == null) {
               this.groupBuilder_ = new RepeatedFieldBuilderV3(this.group_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.group_ = null;
            }

            return this.groupBuilder_;
         }

         public boolean hasSuperReward() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getSuperReward() {
            return this.superReward_;
         }

         public Builder setSuperReward(int value) {
            this.bitField0_ |= 4;
            this.superReward_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSuperReward() {
            this.bitField0_ &= -5;
            this.superReward_ = 0;
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

   public static final class C2S_IntegralReward_13925 extends GeneratedMessageV3 implements C2S_IntegralReward_13925OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_IntegralReward_13925 DEFAULT_INSTANCE = new C2S_IntegralReward_13925();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_IntegralReward_13925> PARSER = new AbstractParser<C2S_IntegralReward_13925>() {
         public C2S_IntegralReward_13925 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_IntegralReward_13925(input, extensionRegistry);
         }
      };

      private C2S_IntegralReward_13925(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_IntegralReward_13925() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_IntegralReward_13925();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_IntegralReward_13925(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_IntegralReward_13925_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_IntegralReward_13925_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_IntegralReward_13925.class, Builder.class);
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
         } else if (!(obj instanceof C2S_IntegralReward_13925)) {
            return super.equals(obj);
         } else {
            C2S_IntegralReward_13925 other = (C2S_IntegralReward_13925)obj;
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

      public static C2S_IntegralReward_13925 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_IntegralReward_13925)PARSER.parseFrom(data);
      }

      public static C2S_IntegralReward_13925 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_IntegralReward_13925)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_IntegralReward_13925 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_IntegralReward_13925)PARSER.parseFrom(data);
      }

      public static C2S_IntegralReward_13925 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_IntegralReward_13925)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_IntegralReward_13925 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_IntegralReward_13925)PARSER.parseFrom(data);
      }

      public static C2S_IntegralReward_13925 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_IntegralReward_13925)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_IntegralReward_13925 parseFrom(InputStream input) throws IOException {
         return (C2S_IntegralReward_13925)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_IntegralReward_13925 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_IntegralReward_13925)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_IntegralReward_13925 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_IntegralReward_13925)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_IntegralReward_13925 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_IntegralReward_13925)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_IntegralReward_13925 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_IntegralReward_13925)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_IntegralReward_13925 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_IntegralReward_13925)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_IntegralReward_13925 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_IntegralReward_13925 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_IntegralReward_13925> parser() {
         return PARSER;
      }

      public Parser<C2S_IntegralReward_13925> getParserForType() {
         return PARSER;
      }

      public C2S_IntegralReward_13925 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_IntegralReward_13925OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_IntegralReward_13925_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_IntegralReward_13925_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_IntegralReward_13925.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.C2S_IntegralReward_13925.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_IntegralReward_13925_descriptor;
         }

         public C2S_IntegralReward_13925 getDefaultInstanceForType() {
            return DemonStrikesMsg.C2S_IntegralReward_13925.getDefaultInstance();
         }

         public C2S_IntegralReward_13925 build() {
            C2S_IntegralReward_13925 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_IntegralReward_13925 buildPartial() {
            C2S_IntegralReward_13925 result = new C2S_IntegralReward_13925(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_IntegralReward_13925) {
               return this.mergeFrom((C2S_IntegralReward_13925)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_IntegralReward_13925 other) {
            if (other == DemonStrikesMsg.C2S_IntegralReward_13925.getDefaultInstance()) {
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
            C2S_IntegralReward_13925 parsedMessage = null;

            try {
               parsedMessage = (C2S_IntegralReward_13925)DemonStrikesMsg.C2S_IntegralReward_13925.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_IntegralReward_13925)e.getUnfinishedMessage();
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

   public static final class S2C_IntegralReward_13926 extends GeneratedMessageV3 implements S2C_IntegralReward_13926OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int REWARD_FIELD_NUMBER = 1;
      private int reward_;
      public static final int SUPERREWARD_FIELD_NUMBER = 2;
      private int superReward_;
      public static final int INTEGRALREWARD_FIELD_NUMBER = 3;
      private boolean integralReward_;
      private byte memoizedIsInitialized;
      private static final S2C_IntegralReward_13926 DEFAULT_INSTANCE = new S2C_IntegralReward_13926();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_IntegralReward_13926> PARSER = new AbstractParser<S2C_IntegralReward_13926>() {
         public S2C_IntegralReward_13926 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_IntegralReward_13926(input, extensionRegistry);
         }
      };

      private S2C_IntegralReward_13926(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_IntegralReward_13926() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_IntegralReward_13926();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_IntegralReward_13926(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.reward_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.superReward_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.integralReward_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_IntegralReward_13926_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_IntegralReward_13926_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_IntegralReward_13926.class, Builder.class);
      }

      public boolean hasReward() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getReward() {
         return this.reward_;
      }

      public boolean hasSuperReward() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getSuperReward() {
         return this.superReward_;
      }

      public boolean hasIntegralReward() {
         return (this.bitField0_ & 4) != 0;
      }

      public boolean getIntegralReward() {
         return this.integralReward_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasReward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasSuperReward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIntegralReward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.reward_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.superReward_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeBool(3, this.integralReward_);
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
               size += CodedOutputStream.computeInt32Size(1, this.reward_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.superReward_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeBoolSize(3, this.integralReward_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_IntegralReward_13926)) {
            return super.equals(obj);
         } else {
            S2C_IntegralReward_13926 other = (S2C_IntegralReward_13926)obj;
            if (this.hasReward() != other.hasReward()) {
               return false;
            } else if (this.hasReward() && this.getReward() != other.getReward()) {
               return false;
            } else if (this.hasSuperReward() != other.hasSuperReward()) {
               return false;
            } else if (this.hasSuperReward() && this.getSuperReward() != other.getSuperReward()) {
               return false;
            } else if (this.hasIntegralReward() != other.hasIntegralReward()) {
               return false;
            } else if (this.hasIntegralReward() && this.getIntegralReward() != other.getIntegralReward()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasReward()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getReward();
            }

            if (this.hasSuperReward()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getSuperReward();
            }

            if (this.hasIntegralReward()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + Internal.hashBoolean(this.getIntegralReward());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_IntegralReward_13926 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_IntegralReward_13926)PARSER.parseFrom(data);
      }

      public static S2C_IntegralReward_13926 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_IntegralReward_13926)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_IntegralReward_13926 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_IntegralReward_13926)PARSER.parseFrom(data);
      }

      public static S2C_IntegralReward_13926 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_IntegralReward_13926)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_IntegralReward_13926 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_IntegralReward_13926)PARSER.parseFrom(data);
      }

      public static S2C_IntegralReward_13926 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_IntegralReward_13926)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_IntegralReward_13926 parseFrom(InputStream input) throws IOException {
         return (S2C_IntegralReward_13926)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_IntegralReward_13926 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_IntegralReward_13926)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_IntegralReward_13926 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_IntegralReward_13926)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_IntegralReward_13926 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_IntegralReward_13926)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_IntegralReward_13926 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_IntegralReward_13926)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_IntegralReward_13926 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_IntegralReward_13926)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_IntegralReward_13926 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_IntegralReward_13926 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_IntegralReward_13926> parser() {
         return PARSER;
      }

      public Parser<S2C_IntegralReward_13926> getParserForType() {
         return PARSER;
      }

      public S2C_IntegralReward_13926 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_IntegralReward_13926OrBuilder {
         private int bitField0_;
         private int reward_;
         private int superReward_;
         private boolean integralReward_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_IntegralReward_13926_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_IntegralReward_13926_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_IntegralReward_13926.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.S2C_IntegralReward_13926.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.reward_ = 0;
            this.bitField0_ &= -2;
            this.superReward_ = 0;
            this.bitField0_ &= -3;
            this.integralReward_ = false;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_IntegralReward_13926_descriptor;
         }

         public S2C_IntegralReward_13926 getDefaultInstanceForType() {
            return DemonStrikesMsg.S2C_IntegralReward_13926.getDefaultInstance();
         }

         public S2C_IntegralReward_13926 build() {
            S2C_IntegralReward_13926 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_IntegralReward_13926 buildPartial() {
            S2C_IntegralReward_13926 result = new S2C_IntegralReward_13926(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.reward_ = this.reward_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.superReward_ = this.superReward_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.integralReward_ = this.integralReward_;
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
            if (other instanceof S2C_IntegralReward_13926) {
               return this.mergeFrom((S2C_IntegralReward_13926)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_IntegralReward_13926 other) {
            if (other == DemonStrikesMsg.S2C_IntegralReward_13926.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasReward()) {
                  this.setReward(other.getReward());
               }

               if (other.hasSuperReward()) {
                  this.setSuperReward(other.getSuperReward());
               }

               if (other.hasIntegralReward()) {
                  this.setIntegralReward(other.getIntegralReward());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasReward()) {
               return false;
            } else if (!this.hasSuperReward()) {
               return false;
            } else {
               return this.hasIntegralReward();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_IntegralReward_13926 parsedMessage = null;

            try {
               parsedMessage = (S2C_IntegralReward_13926)DemonStrikesMsg.S2C_IntegralReward_13926.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_IntegralReward_13926)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasReward() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getReward() {
            return this.reward_;
         }

         public Builder setReward(int value) {
            this.bitField0_ |= 1;
            this.reward_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearReward() {
            this.bitField0_ &= -2;
            this.reward_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasSuperReward() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getSuperReward() {
            return this.superReward_;
         }

         public Builder setSuperReward(int value) {
            this.bitField0_ |= 2;
            this.superReward_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearSuperReward() {
            this.bitField0_ &= -3;
            this.superReward_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIntegralReward() {
            return (this.bitField0_ & 4) != 0;
         }

         public boolean getIntegralReward() {
            return this.integralReward_;
         }

         public Builder setIntegralReward(boolean value) {
            this.bitField0_ |= 4;
            this.integralReward_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIntegralReward() {
            this.bitField0_ &= -5;
            this.integralReward_ = false;
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

   public static final class C2S_CommitTask_13927 extends GeneratedMessageV3 implements C2S_CommitTask_13927OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_CommitTask_13927 DEFAULT_INSTANCE = new C2S_CommitTask_13927();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CommitTask_13927> PARSER = new AbstractParser<C2S_CommitTask_13927>() {
         public C2S_CommitTask_13927 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CommitTask_13927(input, extensionRegistry);
         }
      };

      private C2S_CommitTask_13927(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CommitTask_13927() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CommitTask_13927();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CommitTask_13927(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.taskId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_CommitTask_13927_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_CommitTask_13927_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitTask_13927.class, Builder.class);
      }

      public boolean hasTaskId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTaskId() {
         return this.taskId_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTaskId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.taskId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.taskId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_CommitTask_13927)) {
            return super.equals(obj);
         } else {
            C2S_CommitTask_13927 other = (C2S_CommitTask_13927)obj;
            if (this.hasTaskId() != other.hasTaskId()) {
               return false;
            } else if (this.hasTaskId() && this.getTaskId() != other.getTaskId()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasTaskId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_CommitTask_13927 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_13927)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_13927 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_13927)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_13927 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_13927)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_13927 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_13927)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_13927 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_13927)PARSER.parseFrom(data);
      }

      public static C2S_CommitTask_13927 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CommitTask_13927)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CommitTask_13927 parseFrom(InputStream input) throws IOException {
         return (C2S_CommitTask_13927)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_13927 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_13927)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitTask_13927 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CommitTask_13927)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_13927 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_13927)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CommitTask_13927 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CommitTask_13927)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CommitTask_13927 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CommitTask_13927)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CommitTask_13927 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CommitTask_13927 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CommitTask_13927> parser() {
         return PARSER;
      }

      public Parser<C2S_CommitTask_13927> getParserForType() {
         return PARSER;
      }

      public C2S_CommitTask_13927 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CommitTask_13927OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_CommitTask_13927_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_CommitTask_13927_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CommitTask_13927.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.C2S_CommitTask_13927.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_CommitTask_13927_descriptor;
         }

         public C2S_CommitTask_13927 getDefaultInstanceForType() {
            return DemonStrikesMsg.C2S_CommitTask_13927.getDefaultInstance();
         }

         public C2S_CommitTask_13927 build() {
            C2S_CommitTask_13927 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CommitTask_13927 buildPartial() {
            C2S_CommitTask_13927 result = new C2S_CommitTask_13927(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.taskId_ = this.taskId_;
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
            if (other instanceof C2S_CommitTask_13927) {
               return this.mergeFrom((C2S_CommitTask_13927)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CommitTask_13927 other) {
            if (other == DemonStrikesMsg.C2S_CommitTask_13927.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTaskId()) {
                  this.setTaskId(other.getTaskId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTaskId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_CommitTask_13927 parsedMessage = null;

            try {
               parsedMessage = (C2S_CommitTask_13927)DemonStrikesMsg.C2S_CommitTask_13927.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CommitTask_13927)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTaskId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTaskId() {
            return this.taskId_;
         }

         public Builder setTaskId(int value) {
            this.bitField0_ |= 1;
            this.taskId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTaskId() {
            this.bitField0_ &= -2;
            this.taskId_ = 0;
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

   public static final class S2C_CommitTask_13928 extends GeneratedMessageV3 implements S2C_CommitTask_13928OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      public static final int INTEGRALREWARD_FIELD_NUMBER = 2;
      private boolean integralReward_;
      private byte memoizedIsInitialized;
      private static final S2C_CommitTask_13928 DEFAULT_INSTANCE = new S2C_CommitTask_13928();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CommitTask_13928> PARSER = new AbstractParser<S2C_CommitTask_13928>() {
         public S2C_CommitTask_13928 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CommitTask_13928(input, extensionRegistry);
         }
      };

      private S2C_CommitTask_13928(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CommitTask_13928() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CommitTask_13928();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CommitTask_13928(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.taskId_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.integralReward_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_CommitTask_13928_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_CommitTask_13928_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitTask_13928.class, Builder.class);
      }

      public boolean hasTaskId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTaskId() {
         return this.taskId_;
      }

      public boolean hasIntegralReward() {
         return (this.bitField0_ & 2) != 0;
      }

      public boolean getIntegralReward() {
         return this.integralReward_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTaskId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasIntegralReward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.taskId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeBool(2, this.integralReward_);
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
               size += CodedOutputStream.computeInt32Size(1, this.taskId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeBoolSize(2, this.integralReward_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CommitTask_13928)) {
            return super.equals(obj);
         } else {
            S2C_CommitTask_13928 other = (S2C_CommitTask_13928)obj;
            if (this.hasTaskId() != other.hasTaskId()) {
               return false;
            } else if (this.hasTaskId() && this.getTaskId() != other.getTaskId()) {
               return false;
            } else if (this.hasIntegralReward() != other.hasIntegralReward()) {
               return false;
            } else if (this.hasIntegralReward() && this.getIntegralReward() != other.getIntegralReward()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasTaskId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskId();
            }

            if (this.hasIntegralReward()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + Internal.hashBoolean(this.getIntegralReward());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CommitTask_13928 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_13928)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_13928 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_13928)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_13928 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_13928)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_13928 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_13928)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_13928 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_13928)PARSER.parseFrom(data);
      }

      public static S2C_CommitTask_13928 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommitTask_13928)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommitTask_13928 parseFrom(InputStream input) throws IOException {
         return (S2C_CommitTask_13928)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_13928 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_13928)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitTask_13928 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CommitTask_13928)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_13928 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_13928)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommitTask_13928 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CommitTask_13928)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommitTask_13928 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommitTask_13928)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CommitTask_13928 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CommitTask_13928 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CommitTask_13928> parser() {
         return PARSER;
      }

      public Parser<S2C_CommitTask_13928> getParserForType() {
         return PARSER;
      }

      public S2C_CommitTask_13928 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CommitTask_13928OrBuilder {
         private int bitField0_;
         private int taskId_;
         private boolean integralReward_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_CommitTask_13928_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_CommitTask_13928_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommitTask_13928.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.S2C_CommitTask_13928.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            this.integralReward_ = false;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_CommitTask_13928_descriptor;
         }

         public S2C_CommitTask_13928 getDefaultInstanceForType() {
            return DemonStrikesMsg.S2C_CommitTask_13928.getDefaultInstance();
         }

         public S2C_CommitTask_13928 build() {
            S2C_CommitTask_13928 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CommitTask_13928 buildPartial() {
            S2C_CommitTask_13928 result = new S2C_CommitTask_13928(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.taskId_ = this.taskId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.integralReward_ = this.integralReward_;
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
            if (other instanceof S2C_CommitTask_13928) {
               return this.mergeFrom((S2C_CommitTask_13928)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CommitTask_13928 other) {
            if (other == DemonStrikesMsg.S2C_CommitTask_13928.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTaskId()) {
                  this.setTaskId(other.getTaskId());
               }

               if (other.hasIntegralReward()) {
                  this.setIntegralReward(other.getIntegralReward());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasTaskId()) {
               return false;
            } else {
               return this.hasIntegralReward();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_CommitTask_13928 parsedMessage = null;

            try {
               parsedMessage = (S2C_CommitTask_13928)DemonStrikesMsg.S2C_CommitTask_13928.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CommitTask_13928)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTaskId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTaskId() {
            return this.taskId_;
         }

         public Builder setTaskId(int value) {
            this.bitField0_ |= 1;
            this.taskId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTaskId() {
            this.bitField0_ &= -2;
            this.taskId_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasIntegralReward() {
            return (this.bitField0_ & 2) != 0;
         }

         public boolean getIntegralReward() {
            return this.integralReward_;
         }

         public Builder setIntegralReward(boolean value) {
            this.bitField0_ |= 2;
            this.integralReward_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearIntegralReward() {
            this.bitField0_ &= -3;
            this.integralReward_ = false;
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

   public static final class S2C_TaskNotify_13930 extends GeneratedMessageV3 implements S2C_TaskNotify_13930OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASKS_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> tasks_;
      private byte memoizedIsInitialized;
      private static final S2C_TaskNotify_13930 DEFAULT_INSTANCE = new S2C_TaskNotify_13930();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TaskNotify_13930> PARSER = new AbstractParser<S2C_TaskNotify_13930>() {
         public S2C_TaskNotify_13930 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TaskNotify_13930(input, extensionRegistry);
         }
      };

      private S2C_TaskNotify_13930(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TaskNotify_13930() {
         this.memoizedIsInitialized = -1;
         this.tasks_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TaskNotify_13930();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TaskNotify_13930(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                           this.tasks_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.tasks_.add(input.readMessage(CommonMsg.Task.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.tasks_ = Collections.unmodifiableList(this.tasks_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_TaskNotify_13930_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_TaskNotify_13930_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskNotify_13930.class, Builder.class);
      }

      public List<CommonMsg.Task> getTasksList() {
         return this.tasks_;
      }

      public List<? extends CommonMsg.TaskOrBuilder> getTasksOrBuilderList() {
         return this.tasks_;
      }

      public int getTasksCount() {
         return this.tasks_.size();
      }

      public CommonMsg.Task getTasks(int index) {
         return (CommonMsg.Task)this.tasks_.get(index);
      }

      public CommonMsg.TaskOrBuilder getTasksOrBuilder(int index) {
         return (CommonMsg.TaskOrBuilder)this.tasks_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getTasksCount(); ++i) {
               if (!this.getTasks(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.tasks_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.tasks_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.tasks_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.tasks_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TaskNotify_13930)) {
            return super.equals(obj);
         } else {
            S2C_TaskNotify_13930 other = (S2C_TaskNotify_13930)obj;
            if (!this.getTasksList().equals(other.getTasksList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getTasksCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTasksList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TaskNotify_13930 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_13930)PARSER.parseFrom(data);
      }

      public static S2C_TaskNotify_13930 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_13930)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskNotify_13930 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_13930)PARSER.parseFrom(data);
      }

      public static S2C_TaskNotify_13930 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_13930)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskNotify_13930 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_13930)PARSER.parseFrom(data);
      }

      public static S2C_TaskNotify_13930 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TaskNotify_13930)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TaskNotify_13930 parseFrom(InputStream input) throws IOException {
         return (S2C_TaskNotify_13930)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskNotify_13930 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskNotify_13930)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskNotify_13930 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TaskNotify_13930)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TaskNotify_13930 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskNotify_13930)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TaskNotify_13930 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TaskNotify_13930)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TaskNotify_13930 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TaskNotify_13930)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TaskNotify_13930 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TaskNotify_13930 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TaskNotify_13930> parser() {
         return PARSER;
      }

      public Parser<S2C_TaskNotify_13930> getParserForType() {
         return PARSER;
      }

      public S2C_TaskNotify_13930 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TaskNotify_13930OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> tasks_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> tasksBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_TaskNotify_13930_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_TaskNotify_13930_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TaskNotify_13930.class, Builder.class);
         }

         private Builder() {
            this.tasks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.tasks_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.S2C_TaskNotify_13930.alwaysUseFieldBuilders) {
               this.getTasksFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.tasksBuilder_ == null) {
               this.tasks_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.tasksBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_TaskNotify_13930_descriptor;
         }

         public S2C_TaskNotify_13930 getDefaultInstanceForType() {
            return DemonStrikesMsg.S2C_TaskNotify_13930.getDefaultInstance();
         }

         public S2C_TaskNotify_13930 build() {
            S2C_TaskNotify_13930 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TaskNotify_13930 buildPartial() {
            S2C_TaskNotify_13930 result = new S2C_TaskNotify_13930(this);
            int from_bitField0_ = this.bitField0_;
            if (this.tasksBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.tasks_ = Collections.unmodifiableList(this.tasks_);
                  this.bitField0_ &= -2;
               }

               result.tasks_ = this.tasks_;
            } else {
               result.tasks_ = this.tasksBuilder_.build();
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
            if (other instanceof S2C_TaskNotify_13930) {
               return this.mergeFrom((S2C_TaskNotify_13930)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TaskNotify_13930 other) {
            if (other == DemonStrikesMsg.S2C_TaskNotify_13930.getDefaultInstance()) {
               return this;
            } else {
               if (this.tasksBuilder_ == null) {
                  if (!other.tasks_.isEmpty()) {
                     if (this.tasks_.isEmpty()) {
                        this.tasks_ = other.tasks_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTasksIsMutable();
                        this.tasks_.addAll(other.tasks_);
                     }

                     this.onChanged();
                  }
               } else if (!other.tasks_.isEmpty()) {
                  if (this.tasksBuilder_.isEmpty()) {
                     this.tasksBuilder_.dispose();
                     this.tasksBuilder_ = null;
                     this.tasks_ = other.tasks_;
                     this.bitField0_ &= -2;
                     this.tasksBuilder_ = DemonStrikesMsg.S2C_TaskNotify_13930.alwaysUseFieldBuilders ? this.getTasksFieldBuilder() : null;
                  } else {
                     this.tasksBuilder_.addAllMessages(other.tasks_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getTasksCount(); ++i) {
               if (!this.getTasks(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TaskNotify_13930 parsedMessage = null;

            try {
               parsedMessage = (S2C_TaskNotify_13930)DemonStrikesMsg.S2C_TaskNotify_13930.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TaskNotify_13930)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTasksIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.tasks_ = new ArrayList(this.tasks_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.Task> getTasksList() {
            return this.tasksBuilder_ == null ? Collections.unmodifiableList(this.tasks_) : this.tasksBuilder_.getMessageList();
         }

         public int getTasksCount() {
            return this.tasksBuilder_ == null ? this.tasks_.size() : this.tasksBuilder_.getCount();
         }

         public CommonMsg.Task getTasks(int index) {
            return this.tasksBuilder_ == null ? (CommonMsg.Task)this.tasks_.get(index) : (CommonMsg.Task)this.tasksBuilder_.getMessage(index);
         }

         public Builder setTasks(int index, CommonMsg.Task value) {
            if (this.tasksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTasksIsMutable();
               this.tasks_.set(index, value);
               this.onChanged();
            } else {
               this.tasksBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTasks(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.tasksBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTasks(CommonMsg.Task value) {
            if (this.tasksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTasksIsMutable();
               this.tasks_.add(value);
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTasks(int index, CommonMsg.Task value) {
            if (this.tasksBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTasksIsMutable();
               this.tasks_.add(index, value);
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTasks(CommonMsg.Task.Builder builderForValue) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTasks(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.tasksBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTasks(Iterable<? extends CommonMsg.Task> values) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.tasks_);
               this.onChanged();
            } else {
               this.tasksBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTasks() {
            if (this.tasksBuilder_ == null) {
               this.tasks_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.tasksBuilder_.clear();
            }

            return this;
         }

         public Builder removeTasks(int index) {
            if (this.tasksBuilder_ == null) {
               this.ensureTasksIsMutable();
               this.tasks_.remove(index);
               this.onChanged();
            } else {
               this.tasksBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.Task.Builder getTasksBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTasksFieldBuilder().getBuilder(index);
         }

         public CommonMsg.TaskOrBuilder getTasksOrBuilder(int index) {
            return this.tasksBuilder_ == null ? (CommonMsg.TaskOrBuilder)this.tasks_.get(index) : (CommonMsg.TaskOrBuilder)this.tasksBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.TaskOrBuilder> getTasksOrBuilderList() {
            return this.tasksBuilder_ != null ? this.tasksBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.tasks_);
         }

         public CommonMsg.Task.Builder addTasksBuilder() {
            return (CommonMsg.Task.Builder)this.getTasksFieldBuilder().addBuilder(CommonMsg.Task.getDefaultInstance());
         }

         public CommonMsg.Task.Builder addTasksBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTasksFieldBuilder().addBuilder(index, CommonMsg.Task.getDefaultInstance());
         }

         public List<CommonMsg.Task.Builder> getTasksBuilderList() {
            return this.getTasksFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> getTasksFieldBuilder() {
            if (this.tasksBuilder_ == null) {
               this.tasksBuilder_ = new RepeatedFieldBuilderV3(this.tasks_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.tasks_ = null;
            }

            return this.tasksBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_CityReward_13931 extends GeneratedMessageV3 implements C2S_CityReward_13931OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_CityReward_13931 DEFAULT_INSTANCE = new C2S_CityReward_13931();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_CityReward_13931> PARSER = new AbstractParser<C2S_CityReward_13931>() {
         public C2S_CityReward_13931 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_CityReward_13931(input, extensionRegistry);
         }
      };

      private C2S_CityReward_13931(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_CityReward_13931() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_CityReward_13931();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_CityReward_13931(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_CityReward_13931_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_CityReward_13931_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CityReward_13931.class, Builder.class);
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
         } else if (!(obj instanceof C2S_CityReward_13931)) {
            return super.equals(obj);
         } else {
            C2S_CityReward_13931 other = (C2S_CityReward_13931)obj;
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

      public static C2S_CityReward_13931 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_CityReward_13931)PARSER.parseFrom(data);
      }

      public static C2S_CityReward_13931 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CityReward_13931)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CityReward_13931 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_CityReward_13931)PARSER.parseFrom(data);
      }

      public static C2S_CityReward_13931 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CityReward_13931)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CityReward_13931 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_CityReward_13931)PARSER.parseFrom(data);
      }

      public static C2S_CityReward_13931 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_CityReward_13931)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_CityReward_13931 parseFrom(InputStream input) throws IOException {
         return (C2S_CityReward_13931)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CityReward_13931 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CityReward_13931)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CityReward_13931 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_CityReward_13931)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_CityReward_13931 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CityReward_13931)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_CityReward_13931 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_CityReward_13931)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_CityReward_13931 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_CityReward_13931)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_CityReward_13931 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_CityReward_13931 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_CityReward_13931> parser() {
         return PARSER;
      }

      public Parser<C2S_CityReward_13931> getParserForType() {
         return PARSER;
      }

      public C2S_CityReward_13931 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_CityReward_13931OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_CityReward_13931_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_CityReward_13931_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_CityReward_13931.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.C2S_CityReward_13931.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_CityReward_13931_descriptor;
         }

         public C2S_CityReward_13931 getDefaultInstanceForType() {
            return DemonStrikesMsg.C2S_CityReward_13931.getDefaultInstance();
         }

         public C2S_CityReward_13931 build() {
            C2S_CityReward_13931 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_CityReward_13931 buildPartial() {
            C2S_CityReward_13931 result = new C2S_CityReward_13931(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_CityReward_13931) {
               return this.mergeFrom((C2S_CityReward_13931)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_CityReward_13931 other) {
            if (other == DemonStrikesMsg.C2S_CityReward_13931.getDefaultInstance()) {
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
            C2S_CityReward_13931 parsedMessage = null;

            try {
               parsedMessage = (C2S_CityReward_13931)DemonStrikesMsg.C2S_CityReward_13931.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_CityReward_13931)e.getUnfinishedMessage();
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

   public static final class S2C_CityReward_13932 extends GeneratedMessageV3 implements S2C_CityReward_13932OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CITYREWARD_FIELD_NUMBER = 1;
      private boolean cityReward_;
      private byte memoizedIsInitialized;
      private static final S2C_CityReward_13932 DEFAULT_INSTANCE = new S2C_CityReward_13932();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CityReward_13932> PARSER = new AbstractParser<S2C_CityReward_13932>() {
         public S2C_CityReward_13932 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CityReward_13932(input, extensionRegistry);
         }
      };

      private S2C_CityReward_13932(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CityReward_13932() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CityReward_13932();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CityReward_13932(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.cityReward_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityReward_13932_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityReward_13932_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CityReward_13932.class, Builder.class);
      }

      public boolean hasCityReward() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getCityReward() {
         return this.cityReward_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCityReward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.cityReward_);
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
               size += CodedOutputStream.computeBoolSize(1, this.cityReward_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CityReward_13932)) {
            return super.equals(obj);
         } else {
            S2C_CityReward_13932 other = (S2C_CityReward_13932)obj;
            if (this.hasCityReward() != other.hasCityReward()) {
               return false;
            } else if (this.hasCityReward() && this.getCityReward() != other.getCityReward()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasCityReward()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getCityReward());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CityReward_13932 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CityReward_13932)PARSER.parseFrom(data);
      }

      public static S2C_CityReward_13932 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CityReward_13932)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CityReward_13932 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CityReward_13932)PARSER.parseFrom(data);
      }

      public static S2C_CityReward_13932 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CityReward_13932)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CityReward_13932 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CityReward_13932)PARSER.parseFrom(data);
      }

      public static S2C_CityReward_13932 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CityReward_13932)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CityReward_13932 parseFrom(InputStream input) throws IOException {
         return (S2C_CityReward_13932)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CityReward_13932 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CityReward_13932)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CityReward_13932 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CityReward_13932)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CityReward_13932 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CityReward_13932)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CityReward_13932 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CityReward_13932)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CityReward_13932 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CityReward_13932)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CityReward_13932 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CityReward_13932 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CityReward_13932> parser() {
         return PARSER;
      }

      public Parser<S2C_CityReward_13932> getParserForType() {
         return PARSER;
      }

      public S2C_CityReward_13932 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CityReward_13932OrBuilder {
         private int bitField0_;
         private boolean cityReward_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityReward_13932_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityReward_13932_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CityReward_13932.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.S2C_CityReward_13932.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.cityReward_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_CityReward_13932_descriptor;
         }

         public S2C_CityReward_13932 getDefaultInstanceForType() {
            return DemonStrikesMsg.S2C_CityReward_13932.getDefaultInstance();
         }

         public S2C_CityReward_13932 build() {
            S2C_CityReward_13932 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CityReward_13932 buildPartial() {
            S2C_CityReward_13932 result = new S2C_CityReward_13932(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.cityReward_ = this.cityReward_;
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
            if (other instanceof S2C_CityReward_13932) {
               return this.mergeFrom((S2C_CityReward_13932)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CityReward_13932 other) {
            if (other == DemonStrikesMsg.S2C_CityReward_13932.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCityReward()) {
                  this.setCityReward(other.getCityReward());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCityReward();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_CityReward_13932 parsedMessage = null;

            try {
               parsedMessage = (S2C_CityReward_13932)DemonStrikesMsg.S2C_CityReward_13932.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CityReward_13932)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCityReward() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getCityReward() {
            return this.cityReward_;
         }

         public Builder setCityReward(boolean value) {
            this.bitField0_ |= 1;
            this.cityReward_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCityReward() {
            this.bitField0_ &= -2;
            this.cityReward_ = false;
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

   public static final class C2S_LuckyMain_13933 extends GeneratedMessageV3 implements C2S_LuckyMain_13933OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_LuckyMain_13933 DEFAULT_INSTANCE = new C2S_LuckyMain_13933();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LuckyMain_13933> PARSER = new AbstractParser<C2S_LuckyMain_13933>() {
         public C2S_LuckyMain_13933 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LuckyMain_13933(input, extensionRegistry);
         }
      };

      private C2S_LuckyMain_13933(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LuckyMain_13933() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LuckyMain_13933();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LuckyMain_13933(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_LuckyMain_13933_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_LuckyMain_13933_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckyMain_13933.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LuckyMain_13933)) {
            return super.equals(obj);
         } else {
            C2S_LuckyMain_13933 other = (C2S_LuckyMain_13933)obj;
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

      public static C2S_LuckyMain_13933 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LuckyMain_13933)PARSER.parseFrom(data);
      }

      public static C2S_LuckyMain_13933 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckyMain_13933)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckyMain_13933 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LuckyMain_13933)PARSER.parseFrom(data);
      }

      public static C2S_LuckyMain_13933 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckyMain_13933)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckyMain_13933 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LuckyMain_13933)PARSER.parseFrom(data);
      }

      public static C2S_LuckyMain_13933 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckyMain_13933)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckyMain_13933 parseFrom(InputStream input) throws IOException {
         return (C2S_LuckyMain_13933)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckyMain_13933 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckyMain_13933)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckyMain_13933 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LuckyMain_13933)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LuckyMain_13933 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckyMain_13933)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckyMain_13933 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LuckyMain_13933)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckyMain_13933 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckyMain_13933)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LuckyMain_13933 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LuckyMain_13933 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LuckyMain_13933> parser() {
         return PARSER;
      }

      public Parser<C2S_LuckyMain_13933> getParserForType() {
         return PARSER;
      }

      public C2S_LuckyMain_13933 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LuckyMain_13933OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_LuckyMain_13933_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_LuckyMain_13933_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckyMain_13933.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.C2S_LuckyMain_13933.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_LuckyMain_13933_descriptor;
         }

         public C2S_LuckyMain_13933 getDefaultInstanceForType() {
            return DemonStrikesMsg.C2S_LuckyMain_13933.getDefaultInstance();
         }

         public C2S_LuckyMain_13933 build() {
            C2S_LuckyMain_13933 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LuckyMain_13933 buildPartial() {
            C2S_LuckyMain_13933 result = new C2S_LuckyMain_13933(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_LuckyMain_13933) {
               return this.mergeFrom((C2S_LuckyMain_13933)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LuckyMain_13933 other) {
            if (other == DemonStrikesMsg.C2S_LuckyMain_13933.getDefaultInstance()) {
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
            C2S_LuckyMain_13933 parsedMessage = null;

            try {
               parsedMessage = (C2S_LuckyMain_13933)DemonStrikesMsg.C2S_LuckyMain_13933.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LuckyMain_13933)e.getUnfinishedMessage();
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

   public static final class S2C_LuckyMain_13934 extends GeneratedMessageV3 implements S2C_LuckyMain_13934OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFOS_FIELD_NUMBER = 1;
      private List<CommonMsg.TurnTableGridInfo> infos_;
      public static final int RECORD_FIELD_NUMBER = 2;
      private LazyStringList record_;
      private byte memoizedIsInitialized;
      private static final S2C_LuckyMain_13934 DEFAULT_INSTANCE = new S2C_LuckyMain_13934();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LuckyMain_13934> PARSER = new AbstractParser<S2C_LuckyMain_13934>() {
         public S2C_LuckyMain_13934 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LuckyMain_13934(input, extensionRegistry);
         }
      };

      private S2C_LuckyMain_13934(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LuckyMain_13934() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
         this.record_ = LazyStringArrayList.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LuckyMain_13934();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LuckyMain_13934(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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

                        this.infos_.add(input.readMessage(CommonMsg.TurnTableGridInfo.PARSER, extensionRegistry));
                        break;
                     case 18:
                        ByteString bs = input.readBytes();
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.record_ = new LazyStringArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.record_.add(bs);
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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

               if ((mutable_bitField0_ & 2) != 0) {
                  this.record_ = this.record_.getUnmodifiableView();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyMain_13934_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyMain_13934_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckyMain_13934.class, Builder.class);
      }

      public List<CommonMsg.TurnTableGridInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends CommonMsg.TurnTableGridInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public CommonMsg.TurnTableGridInfo getInfos(int index) {
         return (CommonMsg.TurnTableGridInfo)this.infos_.get(index);
      }

      public CommonMsg.TurnTableGridInfoOrBuilder getInfosOrBuilder(int index) {
         return (CommonMsg.TurnTableGridInfoOrBuilder)this.infos_.get(index);
      }

      public ProtocolStringList getRecordList() {
         return this.record_;
      }

      public int getRecordCount() {
         return this.record_.size();
      }

      public String getRecord(int index) {
         return (String)this.record_.get(index);
      }

      public ByteString getRecordBytes(int index) {
         return this.record_.getByteString(index);
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

         for(int i = 0; i < this.record_.size(); ++i) {
            GeneratedMessageV3.writeString(output, 2, this.record_.getRaw(i));
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

            int dataSize = 0;

            for(int i = 0; i < this.record_.size(); ++i) {
               dataSize += computeStringSizeNoTag(this.record_.getRaw(i));
            }

            size += dataSize;
            size += 1 * this.getRecordList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LuckyMain_13934)) {
            return super.equals(obj);
         } else {
            S2C_LuckyMain_13934 other = (S2C_LuckyMain_13934)obj;
            if (!this.getInfosList().equals(other.getInfosList())) {
               return false;
            } else if (!this.getRecordList().equals(other.getRecordList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.getRecordCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getRecordList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LuckyMain_13934 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LuckyMain_13934)PARSER.parseFrom(data);
      }

      public static S2C_LuckyMain_13934 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckyMain_13934)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckyMain_13934 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LuckyMain_13934)PARSER.parseFrom(data);
      }

      public static S2C_LuckyMain_13934 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckyMain_13934)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckyMain_13934 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LuckyMain_13934)PARSER.parseFrom(data);
      }

      public static S2C_LuckyMain_13934 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckyMain_13934)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckyMain_13934 parseFrom(InputStream input) throws IOException {
         return (S2C_LuckyMain_13934)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckyMain_13934 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckyMain_13934)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckyMain_13934 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LuckyMain_13934)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LuckyMain_13934 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckyMain_13934)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckyMain_13934 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LuckyMain_13934)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckyMain_13934 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckyMain_13934)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LuckyMain_13934 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LuckyMain_13934 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LuckyMain_13934> parser() {
         return PARSER;
      }

      public Parser<S2C_LuckyMain_13934> getParserForType() {
         return PARSER;
      }

      public S2C_LuckyMain_13934 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LuckyMain_13934OrBuilder {
         private int bitField0_;
         private List<CommonMsg.TurnTableGridInfo> infos_;
         private RepeatedFieldBuilderV3<CommonMsg.TurnTableGridInfo, CommonMsg.TurnTableGridInfo.Builder, CommonMsg.TurnTableGridInfoOrBuilder> infosBuilder_;
         private LazyStringList record_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyMain_13934_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyMain_13934_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckyMain_13934.class, Builder.class);
         }

         private Builder() {
            this.infos_ = Collections.emptyList();
            this.record_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.infos_ = Collections.emptyList();
            this.record_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.S2C_LuckyMain_13934.alwaysUseFieldBuilders) {
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

            this.record_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyMain_13934_descriptor;
         }

         public S2C_LuckyMain_13934 getDefaultInstanceForType() {
            return DemonStrikesMsg.S2C_LuckyMain_13934.getDefaultInstance();
         }

         public S2C_LuckyMain_13934 build() {
            S2C_LuckyMain_13934 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LuckyMain_13934 buildPartial() {
            S2C_LuckyMain_13934 result = new S2C_LuckyMain_13934(this);
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

            if ((this.bitField0_ & 2) != 0) {
               this.record_ = this.record_.getUnmodifiableView();
               this.bitField0_ &= -3;
            }

            result.record_ = this.record_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_LuckyMain_13934) {
               return this.mergeFrom((S2C_LuckyMain_13934)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LuckyMain_13934 other) {
            if (other == DemonStrikesMsg.S2C_LuckyMain_13934.getDefaultInstance()) {
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
                     this.infosBuilder_ = DemonStrikesMsg.S2C_LuckyMain_13934.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
                  } else {
                     this.infosBuilder_.addAllMessages(other.infos_);
                  }
               }

               if (!other.record_.isEmpty()) {
                  if (this.record_.isEmpty()) {
                     this.record_ = other.record_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureRecordIsMutable();
                     this.record_.addAll(other.record_);
                  }

                  this.onChanged();
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
            S2C_LuckyMain_13934 parsedMessage = null;

            try {
               parsedMessage = (S2C_LuckyMain_13934)DemonStrikesMsg.S2C_LuckyMain_13934.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LuckyMain_13934)e.getUnfinishedMessage();
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

         public List<CommonMsg.TurnTableGridInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public CommonMsg.TurnTableGridInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (CommonMsg.TurnTableGridInfo)this.infos_.get(index) : (CommonMsg.TurnTableGridInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, CommonMsg.TurnTableGridInfo value) {
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

         public Builder setInfos(int index, CommonMsg.TurnTableGridInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(CommonMsg.TurnTableGridInfo value) {
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

         public Builder addInfos(int index, CommonMsg.TurnTableGridInfo value) {
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

         public Builder addInfos(CommonMsg.TurnTableGridInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, CommonMsg.TurnTableGridInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends CommonMsg.TurnTableGridInfo> values) {
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

         public CommonMsg.TurnTableGridInfo.Builder getInfosBuilder(int index) {
            return (CommonMsg.TurnTableGridInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public CommonMsg.TurnTableGridInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (CommonMsg.TurnTableGridInfoOrBuilder)this.infos_.get(index) : (CommonMsg.TurnTableGridInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.TurnTableGridInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public CommonMsg.TurnTableGridInfo.Builder addInfosBuilder() {
            return (CommonMsg.TurnTableGridInfo.Builder)this.getInfosFieldBuilder().addBuilder(CommonMsg.TurnTableGridInfo.getDefaultInstance());
         }

         public CommonMsg.TurnTableGridInfo.Builder addInfosBuilder(int index) {
            return (CommonMsg.TurnTableGridInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, CommonMsg.TurnTableGridInfo.getDefaultInstance());
         }

         public List<CommonMsg.TurnTableGridInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.TurnTableGridInfo, CommonMsg.TurnTableGridInfo.Builder, CommonMsg.TurnTableGridInfoOrBuilder> getInfosFieldBuilder() {
            if (this.infosBuilder_ == null) {
               this.infosBuilder_ = new RepeatedFieldBuilderV3(this.infos_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.infos_ = null;
            }

            return this.infosBuilder_;
         }

         private void ensureRecordIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.record_ = new LazyStringArrayList(this.record_);
               this.bitField0_ |= 2;
            }

         }

         public ProtocolStringList getRecordList() {
            return this.record_.getUnmodifiableView();
         }

         public int getRecordCount() {
            return this.record_.size();
         }

         public String getRecord(int index) {
            return (String)this.record_.get(index);
         }

         public ByteString getRecordBytes(int index) {
            return this.record_.getByteString(index);
         }

         public Builder setRecord(int index, String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureRecordIsMutable();
               this.record_.set(index, value);
               this.onChanged();
               return this;
            }
         }

         public Builder addRecord(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureRecordIsMutable();
               this.record_.add(value);
               this.onChanged();
               return this;
            }
         }

         public Builder addAllRecord(Iterable<String> values) {
            this.ensureRecordIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.record_);
            this.onChanged();
            return this;
         }

         public Builder clearRecord() {
            this.record_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         public Builder addRecordBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureRecordIsMutable();
               this.record_.add(value);
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

   public static final class C2S_LuckyReward_13935 extends GeneratedMessageV3 implements C2S_LuckyReward_13935OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int COUNT_FIELD_NUMBER = 1;
      private int count_;
      private byte memoizedIsInitialized;
      private static final C2S_LuckyReward_13935 DEFAULT_INSTANCE = new C2S_LuckyReward_13935();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_LuckyReward_13935> PARSER = new AbstractParser<C2S_LuckyReward_13935>() {
         public C2S_LuckyReward_13935 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_LuckyReward_13935(input, extensionRegistry);
         }
      };

      private C2S_LuckyReward_13935(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_LuckyReward_13935() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_LuckyReward_13935();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_LuckyReward_13935(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_LuckyReward_13935_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_LuckyReward_13935_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckyReward_13935.class, Builder.class);
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
         } else if (!(obj instanceof C2S_LuckyReward_13935)) {
            return super.equals(obj);
         } else {
            C2S_LuckyReward_13935 other = (C2S_LuckyReward_13935)obj;
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

      public static C2S_LuckyReward_13935 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_LuckyReward_13935)PARSER.parseFrom(data);
      }

      public static C2S_LuckyReward_13935 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckyReward_13935)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckyReward_13935 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_LuckyReward_13935)PARSER.parseFrom(data);
      }

      public static C2S_LuckyReward_13935 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckyReward_13935)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckyReward_13935 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_LuckyReward_13935)PARSER.parseFrom(data);
      }

      public static C2S_LuckyReward_13935 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_LuckyReward_13935)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_LuckyReward_13935 parseFrom(InputStream input) throws IOException {
         return (C2S_LuckyReward_13935)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckyReward_13935 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckyReward_13935)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckyReward_13935 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_LuckyReward_13935)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_LuckyReward_13935 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckyReward_13935)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_LuckyReward_13935 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_LuckyReward_13935)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_LuckyReward_13935 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_LuckyReward_13935)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_LuckyReward_13935 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_LuckyReward_13935 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_LuckyReward_13935> parser() {
         return PARSER;
      }

      public Parser<C2S_LuckyReward_13935> getParserForType() {
         return PARSER;
      }

      public C2S_LuckyReward_13935 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_LuckyReward_13935OrBuilder {
         private int bitField0_;
         private int count_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_LuckyReward_13935_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_LuckyReward_13935_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_LuckyReward_13935.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.C2S_LuckyReward_13935.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.count_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_LuckyReward_13935_descriptor;
         }

         public C2S_LuckyReward_13935 getDefaultInstanceForType() {
            return DemonStrikesMsg.C2S_LuckyReward_13935.getDefaultInstance();
         }

         public C2S_LuckyReward_13935 build() {
            C2S_LuckyReward_13935 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_LuckyReward_13935 buildPartial() {
            C2S_LuckyReward_13935 result = new C2S_LuckyReward_13935(this);
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
            if (other instanceof C2S_LuckyReward_13935) {
               return this.mergeFrom((C2S_LuckyReward_13935)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_LuckyReward_13935 other) {
            if (other == DemonStrikesMsg.C2S_LuckyReward_13935.getDefaultInstance()) {
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
            C2S_LuckyReward_13935 parsedMessage = null;

            try {
               parsedMessage = (C2S_LuckyReward_13935)DemonStrikesMsg.C2S_LuckyReward_13935.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_LuckyReward_13935)e.getUnfinishedMessage();
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

   public static final class S2C_LuckyReward_13936 extends GeneratedMessageV3 implements S2C_LuckyReward_13936OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int COUNT_FIELD_NUMBER = 1;
      private int count_;
      public static final int INDEX_FIELD_NUMBER = 2;
      private Internal.IntList index_;
      public static final int ITEMINFOS_FIELD_NUMBER = 3;
      private List<CommonMsg.ItemInfo> itemInfos_;
      private byte memoizedIsInitialized;
      private static final S2C_LuckyReward_13936 DEFAULT_INSTANCE = new S2C_LuckyReward_13936();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LuckyReward_13936> PARSER = new AbstractParser<S2C_LuckyReward_13936>() {
         public S2C_LuckyReward_13936 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LuckyReward_13936(input, extensionRegistry);
         }
      };

      private S2C_LuckyReward_13936(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LuckyReward_13936() {
         this.memoizedIsInitialized = -1;
         this.index_ = emptyIntList();
         this.itemInfos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LuckyReward_13936();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LuckyReward_13936(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.count_ = input.readInt32();
                        continue;
                     case 16:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.index_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }

                        this.index_.addInt(input.readInt32());
                        continue;
                     case 18:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 2) == 0 && input.getBytesUntilLimit() > 0) {
                           this.index_ = newIntList();
                           mutable_bitField0_ |= 2;
                        }
                        break;
                     case 26:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.itemInfos_ = new ArrayList();
                           mutable_bitField0_ |= 4;
                        }

                        this.itemInfos_.add(input.readMessage(CommonMsg.ItemInfo.PARSER, extensionRegistry));
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.index_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 2) != 0) {
                  this.index_.makeImmutable();
               }

               if ((mutable_bitField0_ & 4) != 0) {
                  this.itemInfos_ = Collections.unmodifiableList(this.itemInfos_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyReward_13936_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyReward_13936_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckyReward_13936.class, Builder.class);
      }

      public boolean hasCount() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getCount() {
         return this.count_;
      }

      public List<Integer> getIndexList() {
         return this.index_;
      }

      public int getIndexCount() {
         return this.index_.size();
      }

      public int getIndex(int index) {
         return this.index_.getInt(index);
      }

      public List<CommonMsg.ItemInfo> getItemInfosList() {
         return this.itemInfos_;
      }

      public List<? extends CommonMsg.ItemInfoOrBuilder> getItemInfosOrBuilderList() {
         return this.itemInfos_;
      }

      public int getItemInfosCount() {
         return this.itemInfos_.size();
      }

      public CommonMsg.ItemInfo getItemInfos(int index) {
         return (CommonMsg.ItemInfo)this.itemInfos_.get(index);
      }

      public CommonMsg.ItemInfoOrBuilder getItemInfosOrBuilder(int index) {
         return (CommonMsg.ItemInfoOrBuilder)this.itemInfos_.get(index);
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
            for(int i = 0; i < this.getItemInfosCount(); ++i) {
               if (!this.getItemInfos(i).isInitialized()) {
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
            output.writeInt32(1, this.count_);
         }

         for(int i = 0; i < this.index_.size(); ++i) {
            output.writeInt32(2, this.index_.getInt(i));
         }

         for(int i = 0; i < this.itemInfos_.size(); ++i) {
            output.writeMessage(3, (MessageLite)this.itemInfos_.get(i));
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

            int dataSize = 0;

            for(int i = 0; i < this.index_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.index_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getIndexList().size();

            for(int i = 0; i < this.itemInfos_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(3, (MessageLite)this.itemInfos_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LuckyReward_13936)) {
            return super.equals(obj);
         } else {
            S2C_LuckyReward_13936 other = (S2C_LuckyReward_13936)obj;
            if (this.hasCount() != other.hasCount()) {
               return false;
            } else if (this.hasCount() && this.getCount() != other.getCount()) {
               return false;
            } else if (!this.getIndexList().equals(other.getIndexList())) {
               return false;
            } else if (!this.getItemInfosList().equals(other.getItemInfosList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.getIndexCount() > 0) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getIndexList().hashCode();
            }

            if (this.getItemInfosCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getItemInfosList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LuckyReward_13936 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LuckyReward_13936)PARSER.parseFrom(data);
      }

      public static S2C_LuckyReward_13936 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckyReward_13936)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckyReward_13936 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LuckyReward_13936)PARSER.parseFrom(data);
      }

      public static S2C_LuckyReward_13936 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckyReward_13936)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckyReward_13936 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LuckyReward_13936)PARSER.parseFrom(data);
      }

      public static S2C_LuckyReward_13936 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckyReward_13936)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckyReward_13936 parseFrom(InputStream input) throws IOException {
         return (S2C_LuckyReward_13936)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckyReward_13936 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckyReward_13936)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckyReward_13936 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LuckyReward_13936)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LuckyReward_13936 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckyReward_13936)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckyReward_13936 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LuckyReward_13936)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckyReward_13936 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckyReward_13936)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LuckyReward_13936 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LuckyReward_13936 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LuckyReward_13936> parser() {
         return PARSER;
      }

      public Parser<S2C_LuckyReward_13936> getParserForType() {
         return PARSER;
      }

      public S2C_LuckyReward_13936 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LuckyReward_13936OrBuilder {
         private int bitField0_;
         private int count_;
         private Internal.IntList index_;
         private List<CommonMsg.ItemInfo> itemInfos_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> itemInfosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyReward_13936_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyReward_13936_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckyReward_13936.class, Builder.class);
         }

         private Builder() {
            this.index_ = DemonStrikesMsg.S2C_LuckyReward_13936.emptyIntList();
            this.itemInfos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.index_ = DemonStrikesMsg.S2C_LuckyReward_13936.emptyIntList();
            this.itemInfos_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.S2C_LuckyReward_13936.alwaysUseFieldBuilders) {
               this.getItemInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.count_ = 0;
            this.bitField0_ &= -2;
            this.index_ = DemonStrikesMsg.S2C_LuckyReward_13936.emptyIntList();
            this.bitField0_ &= -3;
            if (this.itemInfosBuilder_ == null) {
               this.itemInfos_ = Collections.emptyList();
               this.bitField0_ &= -5;
            } else {
               this.itemInfosBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyReward_13936_descriptor;
         }

         public S2C_LuckyReward_13936 getDefaultInstanceForType() {
            return DemonStrikesMsg.S2C_LuckyReward_13936.getDefaultInstance();
         }

         public S2C_LuckyReward_13936 build() {
            S2C_LuckyReward_13936 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LuckyReward_13936 buildPartial() {
            S2C_LuckyReward_13936 result = new S2C_LuckyReward_13936(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.count_ = this.count_;
               to_bitField0_ |= 1;
            }

            if ((this.bitField0_ & 2) != 0) {
               this.index_.makeImmutable();
               this.bitField0_ &= -3;
            }

            result.index_ = this.index_;
            if (this.itemInfosBuilder_ == null) {
               if ((this.bitField0_ & 4) != 0) {
                  this.itemInfos_ = Collections.unmodifiableList(this.itemInfos_);
                  this.bitField0_ &= -5;
               }

               result.itemInfos_ = this.itemInfos_;
            } else {
               result.itemInfos_ = this.itemInfosBuilder_.build();
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
            if (other instanceof S2C_LuckyReward_13936) {
               return this.mergeFrom((S2C_LuckyReward_13936)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LuckyReward_13936 other) {
            if (other == DemonStrikesMsg.S2C_LuckyReward_13936.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCount()) {
                  this.setCount(other.getCount());
               }

               if (!other.index_.isEmpty()) {
                  if (this.index_.isEmpty()) {
                     this.index_ = other.index_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureIndexIsMutable();
                     this.index_.addAll(other.index_);
                  }

                  this.onChanged();
               }

               if (this.itemInfosBuilder_ == null) {
                  if (!other.itemInfos_.isEmpty()) {
                     if (this.itemInfos_.isEmpty()) {
                        this.itemInfos_ = other.itemInfos_;
                        this.bitField0_ &= -5;
                     } else {
                        this.ensureItemInfosIsMutable();
                        this.itemInfos_.addAll(other.itemInfos_);
                     }

                     this.onChanged();
                  }
               } else if (!other.itemInfos_.isEmpty()) {
                  if (this.itemInfosBuilder_.isEmpty()) {
                     this.itemInfosBuilder_.dispose();
                     this.itemInfosBuilder_ = null;
                     this.itemInfos_ = other.itemInfos_;
                     this.bitField0_ &= -5;
                     this.itemInfosBuilder_ = DemonStrikesMsg.S2C_LuckyReward_13936.alwaysUseFieldBuilders ? this.getItemInfosFieldBuilder() : null;
                  } else {
                     this.itemInfosBuilder_.addAllMessages(other.itemInfos_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasCount()) {
               return false;
            } else {
               for(int i = 0; i < this.getItemInfosCount(); ++i) {
                  if (!this.getItemInfos(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_LuckyReward_13936 parsedMessage = null;

            try {
               parsedMessage = (S2C_LuckyReward_13936)DemonStrikesMsg.S2C_LuckyReward_13936.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LuckyReward_13936)e.getUnfinishedMessage();
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

         private void ensureIndexIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.index_ = DemonStrikesMsg.S2C_LuckyReward_13936.mutableCopy(this.index_);
               this.bitField0_ |= 2;
            }

         }

         public List<Integer> getIndexList() {
            return (List<Integer>)((this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.index_) : this.index_);
         }

         public int getIndexCount() {
            return this.index_.size();
         }

         public int getIndex(int index) {
            return this.index_.getInt(index);
         }

         public Builder setIndex(int index, int value) {
            this.ensureIndexIsMutable();
            this.index_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addIndex(int value) {
            this.ensureIndexIsMutable();
            this.index_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllIndex(Iterable<? extends Integer> values) {
            this.ensureIndexIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.index_);
            this.onChanged();
            return this;
         }

         public Builder clearIndex() {
            this.index_ = DemonStrikesMsg.S2C_LuckyReward_13936.emptyIntList();
            this.bitField0_ &= -3;
            this.onChanged();
            return this;
         }

         private void ensureItemInfosIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.itemInfos_ = new ArrayList(this.itemInfos_);
               this.bitField0_ |= 4;
            }

         }

         public List<CommonMsg.ItemInfo> getItemInfosList() {
            return this.itemInfosBuilder_ == null ? Collections.unmodifiableList(this.itemInfos_) : this.itemInfosBuilder_.getMessageList();
         }

         public int getItemInfosCount() {
            return this.itemInfosBuilder_ == null ? this.itemInfos_.size() : this.itemInfosBuilder_.getCount();
         }

         public CommonMsg.ItemInfo getItemInfos(int index) {
            return this.itemInfosBuilder_ == null ? (CommonMsg.ItemInfo)this.itemInfos_.get(index) : (CommonMsg.ItemInfo)this.itemInfosBuilder_.getMessage(index);
         }

         public Builder setItemInfos(int index, CommonMsg.ItemInfo value) {
            if (this.itemInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemInfosIsMutable();
               this.itemInfos_.set(index, value);
               this.onChanged();
            } else {
               this.itemInfosBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setItemInfos(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemInfosBuilder_ == null) {
               this.ensureItemInfosIsMutable();
               this.itemInfos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemInfosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addItemInfos(CommonMsg.ItemInfo value) {
            if (this.itemInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemInfosIsMutable();
               this.itemInfos_.add(value);
               this.onChanged();
            } else {
               this.itemInfosBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addItemInfos(int index, CommonMsg.ItemInfo value) {
            if (this.itemInfosBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureItemInfosIsMutable();
               this.itemInfos_.add(index, value);
               this.onChanged();
            } else {
               this.itemInfosBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addItemInfos(CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemInfosBuilder_ == null) {
               this.ensureItemInfosIsMutable();
               this.itemInfos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.itemInfosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addItemInfos(int index, CommonMsg.ItemInfo.Builder builderForValue) {
            if (this.itemInfosBuilder_ == null) {
               this.ensureItemInfosIsMutable();
               this.itemInfos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.itemInfosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllItemInfos(Iterable<? extends CommonMsg.ItemInfo> values) {
            if (this.itemInfosBuilder_ == null) {
               this.ensureItemInfosIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.itemInfos_);
               this.onChanged();
            } else {
               this.itemInfosBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearItemInfos() {
            if (this.itemInfosBuilder_ == null) {
               this.itemInfos_ = Collections.emptyList();
               this.bitField0_ &= -5;
               this.onChanged();
            } else {
               this.itemInfosBuilder_.clear();
            }

            return this;
         }

         public Builder removeItemInfos(int index) {
            if (this.itemInfosBuilder_ == null) {
               this.ensureItemInfosIsMutable();
               this.itemInfos_.remove(index);
               this.onChanged();
            } else {
               this.itemInfosBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.ItemInfo.Builder getItemInfosBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemInfosFieldBuilder().getBuilder(index);
         }

         public CommonMsg.ItemInfoOrBuilder getItemInfosOrBuilder(int index) {
            return this.itemInfosBuilder_ == null ? (CommonMsg.ItemInfoOrBuilder)this.itemInfos_.get(index) : (CommonMsg.ItemInfoOrBuilder)this.itemInfosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.ItemInfoOrBuilder> getItemInfosOrBuilderList() {
            return this.itemInfosBuilder_ != null ? this.itemInfosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.itemInfos_);
         }

         public CommonMsg.ItemInfo.Builder addItemInfosBuilder() {
            return (CommonMsg.ItemInfo.Builder)this.getItemInfosFieldBuilder().addBuilder(CommonMsg.ItemInfo.getDefaultInstance());
         }

         public CommonMsg.ItemInfo.Builder addItemInfosBuilder(int index) {
            return (CommonMsg.ItemInfo.Builder)this.getItemInfosFieldBuilder().addBuilder(index, CommonMsg.ItemInfo.getDefaultInstance());
         }

         public List<CommonMsg.ItemInfo.Builder> getItemInfosBuilderList() {
            return this.getItemInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> getItemInfosFieldBuilder() {
            if (this.itemInfosBuilder_ == null) {
               this.itemInfosBuilder_ = new RepeatedFieldBuilderV3(this.itemInfos_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
               this.itemInfos_ = null;
            }

            return this.itemInfosBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class S2C_LuckyRewardNotify_13938 extends GeneratedMessageV3 implements S2C_LuckyRewardNotify_13938OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int RECORD_FIELD_NUMBER = 1;
      private LazyStringList record_;
      private byte memoizedIsInitialized;
      private static final S2C_LuckyRewardNotify_13938 DEFAULT_INSTANCE = new S2C_LuckyRewardNotify_13938();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_LuckyRewardNotify_13938> PARSER = new AbstractParser<S2C_LuckyRewardNotify_13938>() {
         public S2C_LuckyRewardNotify_13938 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_LuckyRewardNotify_13938(input, extensionRegistry);
         }
      };

      private S2C_LuckyRewardNotify_13938(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_LuckyRewardNotify_13938() {
         this.memoizedIsInitialized = -1;
         this.record_ = LazyStringArrayList.EMPTY;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_LuckyRewardNotify_13938();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_LuckyRewardNotify_13938(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        if ((mutable_bitField0_ & 1) == 0) {
                           this.record_ = new LazyStringArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.record_.add(bs);
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.record_ = this.record_.getUnmodifiableView();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyRewardNotify_13938_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyRewardNotify_13938_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckyRewardNotify_13938.class, Builder.class);
      }

      public ProtocolStringList getRecordList() {
         return this.record_;
      }

      public int getRecordCount() {
         return this.record_.size();
      }

      public String getRecord(int index) {
         return (String)this.record_.get(index);
      }

      public ByteString getRecordBytes(int index) {
         return this.record_.getByteString(index);
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
         for(int i = 0; i < this.record_.size(); ++i) {
            GeneratedMessageV3.writeString(output, 1, this.record_.getRaw(i));
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

            for(int i = 0; i < this.record_.size(); ++i) {
               dataSize += computeStringSizeNoTag(this.record_.getRaw(i));
            }

            size += dataSize;
            size += 1 * this.getRecordList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_LuckyRewardNotify_13938)) {
            return super.equals(obj);
         } else {
            S2C_LuckyRewardNotify_13938 other = (S2C_LuckyRewardNotify_13938)obj;
            if (!this.getRecordList().equals(other.getRecordList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getRecordCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRecordList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_LuckyRewardNotify_13938 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_LuckyRewardNotify_13938)PARSER.parseFrom(data);
      }

      public static S2C_LuckyRewardNotify_13938 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckyRewardNotify_13938)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckyRewardNotify_13938 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_LuckyRewardNotify_13938)PARSER.parseFrom(data);
      }

      public static S2C_LuckyRewardNotify_13938 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckyRewardNotify_13938)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckyRewardNotify_13938 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_LuckyRewardNotify_13938)PARSER.parseFrom(data);
      }

      public static S2C_LuckyRewardNotify_13938 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_LuckyRewardNotify_13938)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_LuckyRewardNotify_13938 parseFrom(InputStream input) throws IOException {
         return (S2C_LuckyRewardNotify_13938)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckyRewardNotify_13938 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckyRewardNotify_13938)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckyRewardNotify_13938 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_LuckyRewardNotify_13938)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_LuckyRewardNotify_13938 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckyRewardNotify_13938)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_LuckyRewardNotify_13938 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_LuckyRewardNotify_13938)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_LuckyRewardNotify_13938 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_LuckyRewardNotify_13938)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_LuckyRewardNotify_13938 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_LuckyRewardNotify_13938 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_LuckyRewardNotify_13938> parser() {
         return PARSER;
      }

      public Parser<S2C_LuckyRewardNotify_13938> getParserForType() {
         return PARSER;
      }

      public S2C_LuckyRewardNotify_13938 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_LuckyRewardNotify_13938OrBuilder {
         private int bitField0_;
         private LazyStringList record_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyRewardNotify_13938_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyRewardNotify_13938_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_LuckyRewardNotify_13938.class, Builder.class);
         }

         private Builder() {
            this.record_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.record_ = LazyStringArrayList.EMPTY;
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.S2C_LuckyRewardNotify_13938.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.record_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_LuckyRewardNotify_13938_descriptor;
         }

         public S2C_LuckyRewardNotify_13938 getDefaultInstanceForType() {
            return DemonStrikesMsg.S2C_LuckyRewardNotify_13938.getDefaultInstance();
         }

         public S2C_LuckyRewardNotify_13938 build() {
            S2C_LuckyRewardNotify_13938 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_LuckyRewardNotify_13938 buildPartial() {
            S2C_LuckyRewardNotify_13938 result = new S2C_LuckyRewardNotify_13938(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.record_ = this.record_.getUnmodifiableView();
               this.bitField0_ &= -2;
            }

            result.record_ = this.record_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_LuckyRewardNotify_13938) {
               return this.mergeFrom((S2C_LuckyRewardNotify_13938)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_LuckyRewardNotify_13938 other) {
            if (other == DemonStrikesMsg.S2C_LuckyRewardNotify_13938.getDefaultInstance()) {
               return this;
            } else {
               if (!other.record_.isEmpty()) {
                  if (this.record_.isEmpty()) {
                     this.record_ = other.record_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureRecordIsMutable();
                     this.record_.addAll(other.record_);
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
            S2C_LuckyRewardNotify_13938 parsedMessage = null;

            try {
               parsedMessage = (S2C_LuckyRewardNotify_13938)DemonStrikesMsg.S2C_LuckyRewardNotify_13938.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_LuckyRewardNotify_13938)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureRecordIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.record_ = new LazyStringArrayList(this.record_);
               this.bitField0_ |= 1;
            }

         }

         public ProtocolStringList getRecordList() {
            return this.record_.getUnmodifiableView();
         }

         public int getRecordCount() {
            return this.record_.size();
         }

         public String getRecord(int index) {
            return (String)this.record_.get(index);
         }

         public ByteString getRecordBytes(int index) {
            return this.record_.getByteString(index);
         }

         public Builder setRecord(int index, String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureRecordIsMutable();
               this.record_.set(index, value);
               this.onChanged();
               return this;
            }
         }

         public Builder addRecord(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureRecordIsMutable();
               this.record_.add(value);
               this.onChanged();
               return this;
            }
         }

         public Builder addAllRecord(Iterable<String> values) {
            this.ensureRecordIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.record_);
            this.onChanged();
            return this;
         }

         public Builder clearRecord() {
            this.record_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            this.onChanged();
            return this;
         }

         public Builder addRecordBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.ensureRecordIsMutable();
               this.record_.add(value);
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

   public static final class S2C_RewardNotify_13940 extends GeneratedMessageV3 implements S2C_RewardNotify_13940OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CITYREWARD_FIELD_NUMBER = 1;
      private boolean cityReward_;
      private byte memoizedIsInitialized;
      private static final S2C_RewardNotify_13940 DEFAULT_INSTANCE = new S2C_RewardNotify_13940();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_RewardNotify_13940> PARSER = new AbstractParser<S2C_RewardNotify_13940>() {
         public S2C_RewardNotify_13940 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_RewardNotify_13940(input, extensionRegistry);
         }
      };

      private S2C_RewardNotify_13940(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_RewardNotify_13940() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_RewardNotify_13940();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_RewardNotify_13940(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.cityReward_ = input.readBool();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_RewardNotify_13940_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_RewardNotify_13940_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RewardNotify_13940.class, Builder.class);
      }

      public boolean hasCityReward() {
         return (this.bitField0_ & 1) != 0;
      }

      public boolean getCityReward() {
         return this.cityReward_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasCityReward()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeBool(1, this.cityReward_);
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
               size += CodedOutputStream.computeBoolSize(1, this.cityReward_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_RewardNotify_13940)) {
            return super.equals(obj);
         } else {
            S2C_RewardNotify_13940 other = (S2C_RewardNotify_13940)obj;
            if (this.hasCityReward() != other.hasCityReward()) {
               return false;
            } else if (this.hasCityReward() && this.getCityReward() != other.getCityReward()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasCityReward()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + Internal.hashBoolean(this.getCityReward());
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_RewardNotify_13940 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_RewardNotify_13940)PARSER.parseFrom(data);
      }

      public static S2C_RewardNotify_13940 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RewardNotify_13940)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RewardNotify_13940 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_RewardNotify_13940)PARSER.parseFrom(data);
      }

      public static S2C_RewardNotify_13940 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RewardNotify_13940)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RewardNotify_13940 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_RewardNotify_13940)PARSER.parseFrom(data);
      }

      public static S2C_RewardNotify_13940 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_RewardNotify_13940)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_RewardNotify_13940 parseFrom(InputStream input) throws IOException {
         return (S2C_RewardNotify_13940)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RewardNotify_13940 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RewardNotify_13940)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RewardNotify_13940 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_RewardNotify_13940)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_RewardNotify_13940 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RewardNotify_13940)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_RewardNotify_13940 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_RewardNotify_13940)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_RewardNotify_13940 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_RewardNotify_13940)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_RewardNotify_13940 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_RewardNotify_13940 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_RewardNotify_13940> parser() {
         return PARSER;
      }

      public Parser<S2C_RewardNotify_13940> getParserForType() {
         return PARSER;
      }

      public S2C_RewardNotify_13940 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_RewardNotify_13940OrBuilder {
         private int bitField0_;
         private boolean cityReward_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_RewardNotify_13940_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_RewardNotify_13940_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_RewardNotify_13940.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.S2C_RewardNotify_13940.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.cityReward_ = false;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_S2C_RewardNotify_13940_descriptor;
         }

         public S2C_RewardNotify_13940 getDefaultInstanceForType() {
            return DemonStrikesMsg.S2C_RewardNotify_13940.getDefaultInstance();
         }

         public S2C_RewardNotify_13940 build() {
            S2C_RewardNotify_13940 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_RewardNotify_13940 buildPartial() {
            S2C_RewardNotify_13940 result = new S2C_RewardNotify_13940(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.cityReward_ = this.cityReward_;
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
            if (other instanceof S2C_RewardNotify_13940) {
               return this.mergeFrom((S2C_RewardNotify_13940)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_RewardNotify_13940 other) {
            if (other == DemonStrikesMsg.S2C_RewardNotify_13940.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasCityReward()) {
                  this.setCityReward(other.getCityReward());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasCityReward();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_RewardNotify_13940 parsedMessage = null;

            try {
               parsedMessage = (S2C_RewardNotify_13940)DemonStrikesMsg.S2C_RewardNotify_13940.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_RewardNotify_13940)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasCityReward() {
            return (this.bitField0_ & 1) != 0;
         }

         public boolean getCityReward() {
            return this.cityReward_;
         }

         public Builder setCityReward(boolean value) {
            this.bitField0_ |= 1;
            this.cityReward_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCityReward() {
            this.bitField0_ &= -2;
            this.cityReward_ = false;
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

   public static final class C2S_BuyRandomShop_13941 extends GeneratedMessageV3 implements C2S_BuyRandomShop_13941OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int BUYID_FIELD_NUMBER = 1;
      private int buyId_;
      public static final int BUYNUM_FIELD_NUMBER = 2;
      private int buyNum_;
      private byte memoizedIsInitialized;
      private static final C2S_BuyRandomShop_13941 DEFAULT_INSTANCE = new C2S_BuyRandomShop_13941();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_BuyRandomShop_13941> PARSER = new AbstractParser<C2S_BuyRandomShop_13941>() {
         public C2S_BuyRandomShop_13941 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_BuyRandomShop_13941(input, extensionRegistry);
         }
      };

      private C2S_BuyRandomShop_13941(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_BuyRandomShop_13941() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_BuyRandomShop_13941();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_BuyRandomShop_13941(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.buyId_ = input.readInt32();
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
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_BuyRandomShop_13941_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_BuyRandomShop_13941_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyRandomShop_13941.class, Builder.class);
      }

      public boolean hasBuyId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getBuyId() {
         return this.buyId_;
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
         } else if (!this.hasBuyId()) {
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
            output.writeInt32(1, this.buyId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.buyId_);
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
         } else if (!(obj instanceof C2S_BuyRandomShop_13941)) {
            return super.equals(obj);
         } else {
            C2S_BuyRandomShop_13941 other = (C2S_BuyRandomShop_13941)obj;
            if (this.hasBuyId() != other.hasBuyId()) {
               return false;
            } else if (this.hasBuyId() && this.getBuyId() != other.getBuyId()) {
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
            if (this.hasBuyId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getBuyId();
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

      public static C2S_BuyRandomShop_13941 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_BuyRandomShop_13941)PARSER.parseFrom(data);
      }

      public static C2S_BuyRandomShop_13941 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyRandomShop_13941)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyRandomShop_13941 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_BuyRandomShop_13941)PARSER.parseFrom(data);
      }

      public static C2S_BuyRandomShop_13941 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyRandomShop_13941)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyRandomShop_13941 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_BuyRandomShop_13941)PARSER.parseFrom(data);
      }

      public static C2S_BuyRandomShop_13941 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_BuyRandomShop_13941)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_BuyRandomShop_13941 parseFrom(InputStream input) throws IOException {
         return (C2S_BuyRandomShop_13941)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyRandomShop_13941 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyRandomShop_13941)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyRandomShop_13941 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_BuyRandomShop_13941)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_BuyRandomShop_13941 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyRandomShop_13941)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_BuyRandomShop_13941 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_BuyRandomShop_13941)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_BuyRandomShop_13941 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_BuyRandomShop_13941)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_BuyRandomShop_13941 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_BuyRandomShop_13941 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_BuyRandomShop_13941> parser() {
         return PARSER;
      }

      public Parser<C2S_BuyRandomShop_13941> getParserForType() {
         return PARSER;
      }

      public C2S_BuyRandomShop_13941 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_BuyRandomShop_13941OrBuilder {
         private int bitField0_;
         private int buyId_;
         private int buyNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_BuyRandomShop_13941_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_BuyRandomShop_13941_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_BuyRandomShop_13941.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (DemonStrikesMsg.C2S_BuyRandomShop_13941.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.buyId_ = 0;
            this.bitField0_ &= -2;
            this.buyNum_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return DemonStrikesMsg.internal_static_demonStrikes_com_gzbz_protobuf_C2S_BuyRandomShop_13941_descriptor;
         }

         public C2S_BuyRandomShop_13941 getDefaultInstanceForType() {
            return DemonStrikesMsg.C2S_BuyRandomShop_13941.getDefaultInstance();
         }

         public C2S_BuyRandomShop_13941 build() {
            C2S_BuyRandomShop_13941 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_BuyRandomShop_13941 buildPartial() {
            C2S_BuyRandomShop_13941 result = new C2S_BuyRandomShop_13941(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.buyId_ = this.buyId_;
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
            if (other instanceof C2S_BuyRandomShop_13941) {
               return this.mergeFrom((C2S_BuyRandomShop_13941)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_BuyRandomShop_13941 other) {
            if (other == DemonStrikesMsg.C2S_BuyRandomShop_13941.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasBuyId()) {
                  this.setBuyId(other.getBuyId());
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
            if (!this.hasBuyId()) {
               return false;
            } else {
               return this.hasBuyNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_BuyRandomShop_13941 parsedMessage = null;

            try {
               parsedMessage = (C2S_BuyRandomShop_13941)DemonStrikesMsg.C2S_BuyRandomShop_13941.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_BuyRandomShop_13941)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasBuyId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getBuyId() {
            return this.buyId_;
         }

         public Builder setBuyId(int value) {
            this.bitField0_ |= 1;
            this.buyId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearBuyId() {
            this.bitField0_ &= -2;
            this.buyId_ = 0;
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

   public interface C2S_BuyRandomShop_13941OrBuilder extends MessageOrBuilder {
      boolean hasBuyId();

      int getBuyId();

      boolean hasBuyNum();

      int getBuyNum();
   }

   public interface C2S_CityInfo_13905OrBuilder extends MessageOrBuilder {
      boolean hasCityId();

      int getCityId();

      boolean hasPageParam();

      CommonMsg.PageInfo getPageParam();

      CommonMsg.PageInfoOrBuilder getPageParamOrBuilder();
   }

   public interface C2S_CityReward_13931OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_CommitTask_13927OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_DemonStrikes_13901OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_FlushRecoverTime_13909OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_IntegralRewardMain_13923OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_IntegralReward_13925OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_Logs_13921OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();
   }

   public interface C2S_LuckyMain_13933OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_LuckyReward_13935OrBuilder extends MessageOrBuilder {
      boolean hasCount();

      int getCount();
   }

   public interface C2S_Main_13903OrBuilder extends MessageOrBuilder {
      boolean hasExit();

      boolean getExit();
   }

   public interface C2S_MoveCity_13913OrBuilder extends MessageOrBuilder {
      boolean hasCityId();

      int getCityId();
   }

   public interface C2S_Rank_13919OrBuilder extends MessageOrBuilder {
      boolean hasRankType();

      RankType getRankType();

      boolean hasLimitCount();

      int getLimitCount();
   }

   public interface C2S_TransferList_13915OrBuilder extends MessageOrBuilder {
      boolean hasPageInfo();

      CommonMsg.PageInfo getPageInfo();

      CommonMsg.PageInfoOrBuilder getPageInfoOrBuilder();
   }

   public interface C2S_TransferToCity_13917OrBuilder extends MessageOrBuilder {
      boolean hasCityId();

      int getCityId();

      boolean hasTransferPlayerId();

      int getTransferPlayerId();
   }

   public interface CityHoldChangeDataOrBuilder extends MessageOrBuilder {
      boolean hasHoldInfo();

      CityHoldInfo getHoldInfo();

      CityHoldInfoOrBuilder getHoldInfoOrBuilder();

      boolean hasSourceCityId();

      int getSourceCityId();

      boolean hasTargetCityId();

      int getTargetCityId();
   }

   public interface CityHoldInfoOrBuilder extends MessageOrBuilder {
      boolean hasUid();

      int getUid();

      List<NpcHpInfo> getNpcHpList();

      NpcHpInfo getNpcHp(int index);

      int getNpcHpCount();

      List<? extends NpcHpInfoOrBuilder> getNpcHpOrBuilderList();

      NpcHpInfoOrBuilder getNpcHpOrBuilder(int index);

      boolean hasDefenseValue();

      int getDefenseValue();

      boolean hasName();

      String getName();

      ByteString getNameBytes();

      boolean hasModelId();

      int getModelId();

      boolean hasServerId();

      int getServerId();
   }

   public interface CityInfoOrBuilder extends MessageOrBuilder {
      boolean hasCityId();

      int getCityId();

      boolean hasDefenseCount();

      int getDefenseCount();

      boolean hasState();

      CityState getState();

      boolean hasCamp();

      Camp getCamp();

      boolean hasStateTime();

      int getStateTime();

      boolean hasActToCity();

      int getActToCity();

      boolean hasRewardId();

      int getRewardId();

      boolean hasRewardEndTime();

      int getRewardEndTime();
   }

   public interface LogInfoOrBuilder extends MessageOrBuilder {
      boolean hasType();

      LogType getType();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasServer();

      int getServer();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();

      boolean hasCityId();

      int getCityId();

      boolean hasDefenseNum();

      int getDefenseNum();

      boolean hasCreateTime();

      int getCreateTime();
   }

   public interface NpcHpInfoOrBuilder extends MessageOrBuilder {
      boolean hasPos();

      int getPos();

      boolean hasHpPercent();

      int getHpPercent();
   }

   public interface RankDataOrBuilder extends MessageOrBuilder {
      boolean hasRank();

      int getRank();

      boolean hasServer();

      int getServer();

      boolean hasIntegral();

      long getIntegral();

      boolean hasPlayerName();

      String getPlayerName();

      ByteString getPlayerNameBytes();
   }

   public interface S2C_CityChangeNotify_13912OrBuilder extends MessageOrBuilder {
      List<CityInfo> getCityInfoList();

      CityInfo getCityInfo(int index);

      int getCityInfoCount();

      List<? extends CityInfoOrBuilder> getCityInfoOrBuilderList();

      CityInfoOrBuilder getCityInfoOrBuilder(int index);

      List<CityHoldChangeData> getHoldChangeDataList();

      CityHoldChangeData getHoldChangeData(int index);

      int getHoldChangeDataCount();

      List<? extends CityHoldChangeDataOrBuilder> getHoldChangeDataOrBuilderList();

      CityHoldChangeDataOrBuilder getHoldChangeDataOrBuilder(int index);

      boolean hasLog();

      LogInfo getLog();

      LogInfoOrBuilder getLogOrBuilder();
   }

   public interface S2C_CityInfo_13906OrBuilder extends MessageOrBuilder {
      boolean hasCityId();

      int getCityId();

      boolean hasPageInfo();

      CommonMsg.PageInfo getPageInfo();

      CommonMsg.PageInfoOrBuilder getPageInfoOrBuilder();

      List<CityHoldInfo> getHoldInfoList();

      CityHoldInfo getHoldInfo(int index);

      int getHoldInfoCount();

      List<? extends CityHoldInfoOrBuilder> getHoldInfoOrBuilderList();

      CityHoldInfoOrBuilder getHoldInfoOrBuilder(int index);
   }

   public interface S2C_CityReward_13932OrBuilder extends MessageOrBuilder {
      boolean hasCityReward();

      boolean getCityReward();
   }

   public interface S2C_CommitTask_13928OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();

      boolean hasIntegralReward();

      boolean getIntegralReward();
   }

   public interface S2C_DemonStrikes_13902OrBuilder extends MessageOrBuilder {
      boolean hasState();

      SystemState getState();

      boolean hasStartTime();

      int getStartTime();

      boolean hasEndTime();

      int getEndTime();

      boolean hasMapId();

      int getMapId();

      boolean hasCityReward();

      boolean getCityReward();

      boolean hasIntegralReward();

      boolean getIntegralReward();
   }

   public interface S2C_FlushRecoverTime_13910OrBuilder extends MessageOrBuilder {
      boolean hasAtkRecoverTime();

      int getAtkRecoverTime();

      boolean hasMoveRecoverTime();

      int getMoveRecoverTime();
   }

   public interface S2C_IntegralRewardMain_13924OrBuilder extends MessageOrBuilder {
      boolean hasReward();

      int getReward();

      List<TaskGroup> getGroupList();

      TaskGroup getGroup(int index);

      int getGroupCount();

      List<? extends TaskGroupOrBuilder> getGroupOrBuilderList();

      TaskGroupOrBuilder getGroupOrBuilder(int index);

      boolean hasSuperReward();

      int getSuperReward();
   }

   public interface S2C_IntegralReward_13926OrBuilder extends MessageOrBuilder {
      boolean hasReward();

      int getReward();

      boolean hasSuperReward();

      int getSuperReward();

      boolean hasIntegralReward();

      boolean getIntegralReward();
   }

   public interface S2C_Logs_13922OrBuilder extends MessageOrBuilder {
      boolean hasType();

      int getType();

      List<LogInfo> getLogList();

      LogInfo getLog(int index);

      int getLogCount();

      List<? extends LogInfoOrBuilder> getLogOrBuilderList();

      LogInfoOrBuilder getLogOrBuilder(int index);
   }

   public interface S2C_LuckyMain_13934OrBuilder extends MessageOrBuilder {
      List<CommonMsg.TurnTableGridInfo> getInfosList();

      CommonMsg.TurnTableGridInfo getInfos(int index);

      int getInfosCount();

      List<? extends CommonMsg.TurnTableGridInfoOrBuilder> getInfosOrBuilderList();

      CommonMsg.TurnTableGridInfoOrBuilder getInfosOrBuilder(int index);

      List<String> getRecordList();

      int getRecordCount();

      String getRecord(int index);

      ByteString getRecordBytes(int index);
   }

   public interface S2C_LuckyRewardNotify_13938OrBuilder extends MessageOrBuilder {
      List<String> getRecordList();

      int getRecordCount();

      String getRecord(int index);

      ByteString getRecordBytes(int index);
   }

   public interface S2C_LuckyReward_13936OrBuilder extends MessageOrBuilder {
      boolean hasCount();

      int getCount();

      List<Integer> getIndexList();

      int getIndexCount();

      int getIndex(int index);

      List<CommonMsg.ItemInfo> getItemInfosList();

      CommonMsg.ItemInfo getItemInfos(int index);

      int getItemInfosCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getItemInfosOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getItemInfosOrBuilder(int index);
   }

   public interface S2C_Main_13904OrBuilder extends MessageOrBuilder {
      boolean hasInCity();

      int getInCity();

      List<CityInfo> getCityList();

      CityInfo getCity(int index);

      int getCityCount();

      List<? extends CityInfoOrBuilder> getCityOrBuilderList();

      CityInfoOrBuilder getCityOrBuilder(int index);

      boolean hasAtkRecoverTime();

      int getAtkRecoverTime();

      boolean hasMoveRecoverTime();

      int getMoveRecoverTime();
   }

   public interface S2C_MoveCity_13914OrBuilder extends MessageOrBuilder {
      boolean hasCityId();

      int getCityId();

      boolean hasMoveRecoverTime();

      int getMoveRecoverTime();
   }

   public interface S2C_Rank_13920OrBuilder extends MessageOrBuilder {
      boolean hasRankType();

      RankType getRankType();

      List<RankData> getRankList();

      RankData getRank(int index);

      int getRankCount();

      List<? extends RankDataOrBuilder> getRankOrBuilderList();

      RankDataOrBuilder getRankOrBuilder(int index);

      boolean hasMyRank();

      RankData getMyRank();

      RankDataOrBuilder getMyRankOrBuilder();
   }

   public interface S2C_RewardNotify_13940OrBuilder extends MessageOrBuilder {
      boolean hasCityReward();

      boolean getCityReward();
   }

   public interface S2C_TaskNotify_13930OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTasksList();

      CommonMsg.Task getTasks(int index);

      int getTasksCount();

      List<? extends CommonMsg.TaskOrBuilder> getTasksOrBuilderList();

      CommonMsg.TaskOrBuilder getTasksOrBuilder(int index);
   }

   public interface S2C_TransferList_13916OrBuilder extends MessageOrBuilder {
      boolean hasPageInfo();

      CommonMsg.PageInfo getPageInfo();

      CommonMsg.PageInfoOrBuilder getPageInfoOrBuilder();

      List<CountryWarMsg.TransferPlayerInfo> getTransferInfosList();

      CountryWarMsg.TransferPlayerInfo getTransferInfos(int index);

      int getTransferInfosCount();

      List<? extends CountryWarMsg.TransferPlayerInfoOrBuilder> getTransferInfosOrBuilderList();

      CountryWarMsg.TransferPlayerInfoOrBuilder getTransferInfosOrBuilder(int index);
   }

   public interface S2C_TransferToCity_13918OrBuilder extends MessageOrBuilder {
      boolean hasAtkRecoverTime();

      int getAtkRecoverTime();

      boolean hasMoveRecoverTime();

      int getMoveRecoverTime();

      boolean hasResult();

      TransferResult getResult();
   }

   public interface TaskGroupOrBuilder extends MessageOrBuilder {
      boolean hasGroup();

      int getGroup();

      boolean hasEndTime();

      long getEndTime();

      List<CommonMsg.Task> getTasksList();

      CommonMsg.Task getTasks(int index);

      int getTasksCount();

      List<? extends CommonMsg.TaskOrBuilder> getTasksOrBuilderList();

      CommonMsg.TaskOrBuilder getTasksOrBuilder(int index);
   }
}
