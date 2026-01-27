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

public final class BattleChapterMsg {
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_MainUiInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_MainUiInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_RankInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_RankInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_C2S_OpenMainUi_7201_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_C2S_OpenMainUi_7201_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_S2C_OpenMainUiResult_7202_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_S2C_OpenMainUiResult_7202_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeTimeReward_7205_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeTimeReward_7205_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_S2C_TakeTimeRewardResult_7206_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_S2C_TakeTimeRewardResult_7206_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_C2S_FastBattle_7207_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_C2S_FastBattle_7207_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_S2C_FastBattleResult_7208_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_S2C_FastBattleResult_7208_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterRank_7209_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterRank_7209_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterRankResult_7210_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterRankResult_7210_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_CrossChapterInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_CrossChapterInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterPassRecord_7213_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterPassRecord_7213_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterPassRecordResult_7214_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterPassRecordResult_7214_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeCommonAward_7217_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeCommonAward_7217_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_S2C_CommonAwardId_7218_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_S2C_CommonAwardId_7218_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeBonusAwardId_7219_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeBonusAwardId_7219_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_S2C_BonusAwardsId_7220_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_S2C_BonusAwardsId_7220_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeOnlineTimeAward_7221_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeOnlineTimeAward_7221_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_S2C_TakeOnlineTimeAwardResult_7222_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_S2C_TakeOnlineTimeAwardResult_7222_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_C2S_ShowAwards_7223_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_C2S_ShowAwards_7223_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_S2C_ShowAwardsResult_7224_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_S2C_ShowAwardsResult_7224_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_ScoreModel_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_ScoreModel_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_HeroStrongInfo_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_HeroStrongInfo_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_C2S_HeroStrongList_7225_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_C2S_HeroStrongList_7225_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_S2C_HeroStrongListResult_7226_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_S2C_HeroStrongListResult_7226_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterUpStarTaskList_7227_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterUpStarTaskList_7227_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterUpStarTaskList_7228_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterUpStarTaskList_7228_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterUpStarTaskCommit_7229_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterUpStarTaskCommit_7229_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterUpStarTaskCommit_7230_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterUpStarTaskCommit_7230_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterSectionTaskList_7231_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterSectionTaskList_7231_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterSectionTaskList_7232_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterSectionTaskList_7232_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterSectionTaskCommit_7233_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterSectionTaskCommit_7233_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterSectionTaskCommit_7234_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterSectionTaskCommit_7234_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_C2S_FastBattleAdd_7235_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_C2S_FastBattleAdd_7235_fieldAccessorTable;
   private static final Descriptors.Descriptor internal_static_battleChapter_com_gzbz_protobuf_S2C_FastBattleAdd_7236_descriptor;
   private static final GeneratedMessageV3.FieldAccessorTable internal_static_battleChapter_com_gzbz_protobuf_S2C_FastBattleAdd_7236_fieldAccessorTable;
   private static Descriptors.FileDescriptor descriptor;

   private BattleChapterMsg() {
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
      String[] descriptorData = new String[]{"\n\u0013BattleChapter.proto\u0012\u001fbattleChapter.com.gzbz.protobuf\u001a\fcommon.proto\"Ê\u0001\n\nMainUiInfo\u0012\u0011\n\tchapterId\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tstartTime\u0018\u0002 \u0002(\u0005\u0012\u0014\n\ffreeFightNum\u0018\u0003 \u0002(\u0005\u0012\u0014\n\fgoldFightNum\u0018\u0004 \u0002(\u0005\u0012\f\n\u0004type\u0018\u0005 \u0002(\u0005\u0012\u0012\n\nrecordTime\u0018\u0006 \u0001(\u0005\u0012\f\n\u0004time\u0018\u0007 \u0001(\u0005\u0012\u0010\n\bawardIds\u0018\b \u0003(\u0005\u0012\u000f\n\u0007giveNum\u0018\t \u0001(\u0005\u0012\u0017\n\u000ffastFightAddNum\u0018\n \u0001(\u0005\"d\n\bRankInfo\u0012\f\n\u0004rank\u0018\u0001 \u0002(\u0005\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\u0012\n\n\u0002lv\u0018\u0003 \u0002(\u0005\u0012\f\n\u0004head\u0018\u0004 \u0002(\u0005\u0012\f\n\u0004name\u0018\u0005 \u0002(\t\u0012\u0010\n\bcrossNum\u0018\u0006 \u0002(\u0005\"\u0015\n\u0013C2S_OpenMainUi_7201\"V\n\u0019S2C_OpenMainUiResult_7202\u00129\n\u0004info\u0018\u0001 \u0002(\u000b2+.battleChapter.com.gzbz.protobuf.MainUiInfo\"\u0019\n\u0017C2S_TakeTimeReward_7205\"-\n\u001dS2C_TakeTimeRewardResult_7206\u0012\f\n\u0004time\u0018\u0001 \u0002(\u0005\"(\n\u0013C2S_FastBattle_7207\u0012\u0011\n\tguideStep\u0018\u0001 \u0001(\u0005\"n\n\u0019S2C_FastBattleResult_7208\u0012\u0014\n\ffreeFightNum\u0018\u0001 \u0002(\u0005\u0012\u0014\n\fgoldFightNum\u0018\u0002 \u0002(\u0005\u0012\u000f\n\u0007giveNum\u0018\u0003 \u0001(\u0005\u0012\u0014\n\ffastFightAdd\u0018\u0004 \u0001(\u0005\"\u0016\n\u0014C2S_ChapterRank_7209\"f\n\u001aS2C_ChapterRankResult_7210\u0012\u000e\n\u0006myRank\u0018\u0001 \u0002(\u0005\u00128\n\u0005infos\u0018\u0002 \u0003(\u000b2).battleChapter.com.gzbz.protobuf.RankInfo\"\u0085\u0001\n\u0010CrossChapterInfo\u0012?\n\u0004type\u0018\u0001 \u0002(\u000e21.battleChapter.com.gzbz.protobuf.CrossChapterType\u0012\u0010\n\bplayerId\u0018\u0002 \u0002(\u0005\u0012\f\n\u0004time\u0018\u0003 \u0002(\u0005\u0012\u0010\n\brecordId\u0018\u0004 \u0002(\u0005\"\u001c\n\u001aC2S_ChapterPassRecord_7213\"w\n S2C_ChapterPassRecordResult_7214\u0012\u0011\n\tchapterId\u0018\u0001 \u0002(\u0005\u0012@\n\u0005infos\u0018\u0002 \u0003(\u000b21.battleChapter.com.gzbz.protobuf.CrossChapterInfo\"9\n\u0018C2S_TakeCommonAward_7217\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\u0012\u0011\n\tguideStep\u0018\u0002 \u0001(\u0005\"%\n\u0016S2C_CommonAwardId_7218\u0012\u000b\n\u0003ids\u0018\u0001 \u0003(\u0005\"'\n\u0019C2S_TakeBonusAwardId_7219\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"%\n\u0016S2C_BonusAwardsId_7220\u0012\u000b\n\u0003ids\u0018\u0001 \u0003(\u0005\"*\n\u001cC2S_TakeOnlineTimeAward_7221\u0012\n\n\u0002id\u0018\u0001 \u0002(\u0005\"X\n\"S2C_TakeOnlineTimeAwardResult_7222\u0012\u0012\n\nrecordTime\u0018\u0001 \u0002(\u0005\u0012\f\n\u0004time\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bawardIds\u0018\u0003 \u0003(\u0005\"\u0015\n\u0013C2S_ShowAwards_7223\"<\n\u0019S2C_ShowAwardsResult_7224\u0012\u001f\n\u0005items\u0018\u0001 \u0003(\u000b2\u0010.common.ItemInfo\"i\n\nScoreModel\u00128\n\u0004type\u0018\u0001 \u0002(\u000e2*.battleChapter.com.gzbz.protobuf.ScoreType\u0012\u000f\n\u0007myScore\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bmaxScore\u0018\u0003 \u0002(\u0005\"Ü\u0001\n\u000eHeroStrongInfo\u0012\u000e\n\u0006heroId\u0018\u0001 \u0002(\u0005\u0012\u000e\n\u0006heroLv\u0018\u0002 \u0002(\u0005\u0012\u0010\n\bheroStar\u0018\u0003 \u0002(\u0005\u0012\u0010\n\bheroName\u0018\u0004 \u0002(\t\u0012;\n\u0006models\u0018\u0005 \u0003(\u000b2+.battleChapter.com.gzbz.protobuf.ScoreModel\u00122\n\u0010starMapPointInfo\u0018\u0006 \u0003(\u000b2\u0018.common.StarMapPointInfo\u0012\u0015\n\rinheritNation\u0018\u0007 \u0001(\u0005\"\u0019\n\u0017C2S_HeroStrongList_7225\"_\n\u001dS2C_HeroStrongListResult_7226\u0012>\n\u0005infos\u0018\u0001 \u0003(\u000b2/.battleChapter.com.gzbz.protobuf.HeroStrongInfo\" \n\u001eC2S_ChapterUpStarTaskList_7227\"@\n\u001eS2C_ChapterUpStarTaskList_7228\u0012\u001e\n\btaskList\u0018\u0001 \u0003(\u000b2\f.common.Task\"2\n C2S_ChapterUpStarTaskCommit_7229\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"2\n S2C_ChapterUpStarTaskCommit_7230\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"!\n\u001fC2S_ChapterSectionTaskList_7231\"A\n\u001fS2C_ChapterSectionTaskList_7232\u0012\u001e\n\btaskList\u0018\u0001 \u0003(\u000b2\f.common.Task\"3\n!C2S_ChapterSectionTaskCommit_7233\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"3\n!S2C_ChapterSectionTaskCommit_7234\u0012\u000e\n\u0006taskId\u0018\u0001 \u0002(\u0005\"+\n\u0016C2S_FastBattleAdd_7235\u0012\u0011\n\tguideStep\u0018\u0001 \u0001(\u0005\"*\n\u0016S2C_FastBattleAdd_7236\u0012\u0010\n\bfightNum\u0018\u0001 \u0002(\u0005*j\n\u0010CrossChapterType\u0012\u0019\n\u0015CROSSCHAPTERTYPE_NEAR\u0010\u0000\u0012\u001c\n\u0018CROSSCHAPTERTYPE_MINTIME\u0010\u0001\u0012\u001d\n\u0019CROSSCHAPTERTYPE_MINPOWER\u0010\u0002*×\u0001\n\tScoreType\u0012\u0014\n\u0010SCORE_TYPE_TOTAL\u0010\u0001\u0012\u0016\n\u0012SCORE_TYPE_HERO_LV\u0010\u0002\u0012\u0015\n\u0011SCORE_TYPE_EQUOIP\u0010\u0003\u0012\u0018\n\u0014SCORE_TYPE_HERO_STAR\u0010\u0004\u0012\u001a\n\u0016SCORE_TYPE_HERO_BREACH\u0010\u0005\u0012\u001a\n\u0016SCORE_TYPE_ARMYADVISER\u0010\u0006\u0012\u0014\n\u0010SCORE_TYPE_UNION\u0010\u0007\u0012\u001d\n\u0019SCORE_TYPE_WARRIOR_SIGNET\u0010\bB'\n\u0011com.gzbz.protobufB\u0010BattleChapterMsgH\u0001"};
      descriptor = FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{CommonMsg.getDescriptor()});
      internal_static_battleChapter_com_gzbz_protobuf_MainUiInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(0);
      internal_static_battleChapter_com_gzbz_protobuf_MainUiInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_MainUiInfo_descriptor, new String[]{"ChapterId", "StartTime", "FreeFightNum", "GoldFightNum", "Type", "RecordTime", "Time", "AwardIds", "GiveNum", "FastFightAddNum"});
      internal_static_battleChapter_com_gzbz_protobuf_RankInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(1);
      internal_static_battleChapter_com_gzbz_protobuf_RankInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_RankInfo_descriptor, new String[]{"Rank", "PlayerId", "Lv", "Head", "Name", "CrossNum"});
      internal_static_battleChapter_com_gzbz_protobuf_C2S_OpenMainUi_7201_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(2);
      internal_static_battleChapter_com_gzbz_protobuf_C2S_OpenMainUi_7201_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_C2S_OpenMainUi_7201_descriptor, new String[0]);
      internal_static_battleChapter_com_gzbz_protobuf_S2C_OpenMainUiResult_7202_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(3);
      internal_static_battleChapter_com_gzbz_protobuf_S2C_OpenMainUiResult_7202_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_S2C_OpenMainUiResult_7202_descriptor, new String[]{"Info"});
      internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeTimeReward_7205_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(4);
      internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeTimeReward_7205_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeTimeReward_7205_descriptor, new String[0]);
      internal_static_battleChapter_com_gzbz_protobuf_S2C_TakeTimeRewardResult_7206_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(5);
      internal_static_battleChapter_com_gzbz_protobuf_S2C_TakeTimeRewardResult_7206_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_S2C_TakeTimeRewardResult_7206_descriptor, new String[]{"Time"});
      internal_static_battleChapter_com_gzbz_protobuf_C2S_FastBattle_7207_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(6);
      internal_static_battleChapter_com_gzbz_protobuf_C2S_FastBattle_7207_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_C2S_FastBattle_7207_descriptor, new String[]{"GuideStep"});
      internal_static_battleChapter_com_gzbz_protobuf_S2C_FastBattleResult_7208_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(7);
      internal_static_battleChapter_com_gzbz_protobuf_S2C_FastBattleResult_7208_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_S2C_FastBattleResult_7208_descriptor, new String[]{"FreeFightNum", "GoldFightNum", "GiveNum", "FastFightAdd"});
      internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterRank_7209_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(8);
      internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterRank_7209_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterRank_7209_descriptor, new String[0]);
      internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterRankResult_7210_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(9);
      internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterRankResult_7210_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterRankResult_7210_descriptor, new String[]{"MyRank", "Infos"});
      internal_static_battleChapter_com_gzbz_protobuf_CrossChapterInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(10);
      internal_static_battleChapter_com_gzbz_protobuf_CrossChapterInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_CrossChapterInfo_descriptor, new String[]{"Type", "PlayerId", "Time", "RecordId"});
      internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterPassRecord_7213_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(11);
      internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterPassRecord_7213_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterPassRecord_7213_descriptor, new String[0]);
      internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterPassRecordResult_7214_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(12);
      internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterPassRecordResult_7214_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterPassRecordResult_7214_descriptor, new String[]{"ChapterId", "Infos"});
      internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeCommonAward_7217_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(13);
      internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeCommonAward_7217_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeCommonAward_7217_descriptor, new String[]{"Id", "GuideStep"});
      internal_static_battleChapter_com_gzbz_protobuf_S2C_CommonAwardId_7218_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(14);
      internal_static_battleChapter_com_gzbz_protobuf_S2C_CommonAwardId_7218_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_S2C_CommonAwardId_7218_descriptor, new String[]{"Ids"});
      internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeBonusAwardId_7219_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(15);
      internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeBonusAwardId_7219_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeBonusAwardId_7219_descriptor, new String[]{"Id"});
      internal_static_battleChapter_com_gzbz_protobuf_S2C_BonusAwardsId_7220_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(16);
      internal_static_battleChapter_com_gzbz_protobuf_S2C_BonusAwardsId_7220_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_S2C_BonusAwardsId_7220_descriptor, new String[]{"Ids"});
      internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeOnlineTimeAward_7221_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(17);
      internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeOnlineTimeAward_7221_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeOnlineTimeAward_7221_descriptor, new String[]{"Id"});
      internal_static_battleChapter_com_gzbz_protobuf_S2C_TakeOnlineTimeAwardResult_7222_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(18);
      internal_static_battleChapter_com_gzbz_protobuf_S2C_TakeOnlineTimeAwardResult_7222_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_S2C_TakeOnlineTimeAwardResult_7222_descriptor, new String[]{"RecordTime", "Time", "AwardIds"});
      internal_static_battleChapter_com_gzbz_protobuf_C2S_ShowAwards_7223_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(19);
      internal_static_battleChapter_com_gzbz_protobuf_C2S_ShowAwards_7223_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_C2S_ShowAwards_7223_descriptor, new String[0]);
      internal_static_battleChapter_com_gzbz_protobuf_S2C_ShowAwardsResult_7224_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(20);
      internal_static_battleChapter_com_gzbz_protobuf_S2C_ShowAwardsResult_7224_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_S2C_ShowAwardsResult_7224_descriptor, new String[]{"Items"});
      internal_static_battleChapter_com_gzbz_protobuf_ScoreModel_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(21);
      internal_static_battleChapter_com_gzbz_protobuf_ScoreModel_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_ScoreModel_descriptor, new String[]{"Type", "MyScore", "MaxScore"});
      internal_static_battleChapter_com_gzbz_protobuf_HeroStrongInfo_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(22);
      internal_static_battleChapter_com_gzbz_protobuf_HeroStrongInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_HeroStrongInfo_descriptor, new String[]{"HeroId", "HeroLv", "HeroStar", "HeroName", "Models", "StarMapPointInfo", "InheritNation"});
      internal_static_battleChapter_com_gzbz_protobuf_C2S_HeroStrongList_7225_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(23);
      internal_static_battleChapter_com_gzbz_protobuf_C2S_HeroStrongList_7225_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_C2S_HeroStrongList_7225_descriptor, new String[0]);
      internal_static_battleChapter_com_gzbz_protobuf_S2C_HeroStrongListResult_7226_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(24);
      internal_static_battleChapter_com_gzbz_protobuf_S2C_HeroStrongListResult_7226_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_S2C_HeroStrongListResult_7226_descriptor, new String[]{"Infos"});
      internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterUpStarTaskList_7227_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(25);
      internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterUpStarTaskList_7227_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterUpStarTaskList_7227_descriptor, new String[0]);
      internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterUpStarTaskList_7228_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(26);
      internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterUpStarTaskList_7228_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterUpStarTaskList_7228_descriptor, new String[]{"TaskList"});
      internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterUpStarTaskCommit_7229_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(27);
      internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterUpStarTaskCommit_7229_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterUpStarTaskCommit_7229_descriptor, new String[]{"TaskId"});
      internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterUpStarTaskCommit_7230_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(28);
      internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterUpStarTaskCommit_7230_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterUpStarTaskCommit_7230_descriptor, new String[]{"TaskId"});
      internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterSectionTaskList_7231_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(29);
      internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterSectionTaskList_7231_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterSectionTaskList_7231_descriptor, new String[0]);
      internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterSectionTaskList_7232_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(30);
      internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterSectionTaskList_7232_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterSectionTaskList_7232_descriptor, new String[]{"TaskList"});
      internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterSectionTaskCommit_7233_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(31);
      internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterSectionTaskCommit_7233_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterSectionTaskCommit_7233_descriptor, new String[]{"TaskId"});
      internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterSectionTaskCommit_7234_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(32);
      internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterSectionTaskCommit_7234_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterSectionTaskCommit_7234_descriptor, new String[]{"TaskId"});
      internal_static_battleChapter_com_gzbz_protobuf_C2S_FastBattleAdd_7235_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(33);
      internal_static_battleChapter_com_gzbz_protobuf_C2S_FastBattleAdd_7235_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_C2S_FastBattleAdd_7235_descriptor, new String[]{"GuideStep"});
      internal_static_battleChapter_com_gzbz_protobuf_S2C_FastBattleAdd_7236_descriptor = (Descriptors.Descriptor)getDescriptor().getMessageTypes().get(34);
      internal_static_battleChapter_com_gzbz_protobuf_S2C_FastBattleAdd_7236_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(internal_static_battleChapter_com_gzbz_protobuf_S2C_FastBattleAdd_7236_descriptor, new String[]{"FightNum"});
      CommonMsg.getDescriptor();
   }

   public static enum CrossChapterType implements ProtocolMessageEnum {
      CROSSCHAPTERTYPE_NEAR(0),
      CROSSCHAPTERTYPE_MINTIME(1),
      CROSSCHAPTERTYPE_MINPOWER(2);

      public static final int CROSSCHAPTERTYPE_NEAR_VALUE = 0;
      public static final int CROSSCHAPTERTYPE_MINTIME_VALUE = 1;
      public static final int CROSSCHAPTERTYPE_MINPOWER_VALUE = 2;
      private static final Internal.EnumLiteMap<CrossChapterType> internalValueMap = new Internal.EnumLiteMap<CrossChapterType>() {
         public CrossChapterType findValueByNumber(int number) {
            return BattleChapterMsg.CrossChapterType.forNumber(number);
         }
      };
      private static final CrossChapterType[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static CrossChapterType valueOf(int value) {
         return forNumber(value);
      }

      public static CrossChapterType forNumber(int value) {
         switch (value) {
            case 0:
               return CROSSCHAPTERTYPE_NEAR;
            case 1:
               return CROSSCHAPTERTYPE_MINTIME;
            case 2:
               return CROSSCHAPTERTYPE_MINPOWER;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<CrossChapterType> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)BattleChapterMsg.getDescriptor().getEnumTypes().get(0);
      }

      public static CrossChapterType valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private CrossChapterType(int value) {
         this.value = value;
      }
   }

   public static enum ScoreType implements ProtocolMessageEnum {
      SCORE_TYPE_TOTAL(1),
      SCORE_TYPE_HERO_LV(2),
      SCORE_TYPE_EQUOIP(3),
      SCORE_TYPE_HERO_STAR(4),
      SCORE_TYPE_HERO_BREACH(5),
      SCORE_TYPE_ARMYADVISER(6),
      SCORE_TYPE_UNION(7),
      SCORE_TYPE_WARRIOR_SIGNET(8);

      public static final int SCORE_TYPE_TOTAL_VALUE = 1;
      public static final int SCORE_TYPE_HERO_LV_VALUE = 2;
      public static final int SCORE_TYPE_EQUOIP_VALUE = 3;
      public static final int SCORE_TYPE_HERO_STAR_VALUE = 4;
      public static final int SCORE_TYPE_HERO_BREACH_VALUE = 5;
      public static final int SCORE_TYPE_ARMYADVISER_VALUE = 6;
      public static final int SCORE_TYPE_UNION_VALUE = 7;
      public static final int SCORE_TYPE_WARRIOR_SIGNET_VALUE = 8;
      private static final Internal.EnumLiteMap<ScoreType> internalValueMap = new Internal.EnumLiteMap<ScoreType>() {
         public ScoreType findValueByNumber(int number) {
            return BattleChapterMsg.ScoreType.forNumber(number);
         }
      };
      private static final ScoreType[] VALUES = values();
      private final int value;

      public final int getNumber() {
         return this.value;
      }

      /** @deprecated */
      @Deprecated
      public static ScoreType valueOf(int value) {
         return forNumber(value);
      }

      public static ScoreType forNumber(int value) {
         switch (value) {
            case 1:
               return SCORE_TYPE_TOTAL;
            case 2:
               return SCORE_TYPE_HERO_LV;
            case 3:
               return SCORE_TYPE_EQUOIP;
            case 4:
               return SCORE_TYPE_HERO_STAR;
            case 5:
               return SCORE_TYPE_HERO_BREACH;
            case 6:
               return SCORE_TYPE_ARMYADVISER;
            case 7:
               return SCORE_TYPE_UNION;
            case 8:
               return SCORE_TYPE_WARRIOR_SIGNET;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<ScoreType> internalGetValueMap() {
         return internalValueMap;
      }

      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         return (Descriptors.EnumValueDescriptor)getDescriptor().getValues().get(this.ordinal());
      }

      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return (Descriptors.EnumDescriptor)BattleChapterMsg.getDescriptor().getEnumTypes().get(1);
      }

      public static ScoreType valueOf(Descriptors.EnumValueDescriptor desc) {
         if (desc.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return VALUES[desc.getIndex()];
         }
      }

      private ScoreType(int value) {
         this.value = value;
      }
   }

   public static final class MainUiInfo extends GeneratedMessageV3 implements MainUiInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHAPTERID_FIELD_NUMBER = 1;
      private int chapterId_;
      public static final int STARTTIME_FIELD_NUMBER = 2;
      private int startTime_;
      public static final int FREEFIGHTNUM_FIELD_NUMBER = 3;
      private int freeFightNum_;
      public static final int GOLDFIGHTNUM_FIELD_NUMBER = 4;
      private int goldFightNum_;
      public static final int TYPE_FIELD_NUMBER = 5;
      private int type_;
      public static final int RECORDTIME_FIELD_NUMBER = 6;
      private int recordTime_;
      public static final int TIME_FIELD_NUMBER = 7;
      private int time_;
      public static final int AWARDIDS_FIELD_NUMBER = 8;
      private Internal.IntList awardIds_;
      public static final int GIVENUM_FIELD_NUMBER = 9;
      private int giveNum_;
      public static final int FASTFIGHTADDNUM_FIELD_NUMBER = 10;
      private int fastFightAddNum_;
      private byte memoizedIsInitialized;
      private static final MainUiInfo DEFAULT_INSTANCE = new MainUiInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<MainUiInfo> PARSER = new AbstractParser<MainUiInfo>() {
         public MainUiInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new MainUiInfo(input, extensionRegistry);
         }
      };

      private MainUiInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private MainUiInfo() {
         this.memoizedIsInitialized = -1;
         this.awardIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new MainUiInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private MainUiInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
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
                        this.chapterId_ = input.readInt32();
                        continue;
                     case 16:
                        this.bitField0_ |= 2;
                        this.startTime_ = input.readInt32();
                        continue;
                     case 24:
                        this.bitField0_ |= 4;
                        this.freeFightNum_ = input.readInt32();
                        continue;
                     case 32:
                        this.bitField0_ |= 8;
                        this.goldFightNum_ = input.readInt32();
                        continue;
                     case 40:
                        this.bitField0_ |= 16;
                        this.type_ = input.readInt32();
                        continue;
                     case 48:
                        this.bitField0_ |= 32;
                        this.recordTime_ = input.readInt32();
                        continue;
                     case 56:
                        this.bitField0_ |= 64;
                        this.time_ = input.readInt32();
                        continue;
                     case 64:
                        if ((mutable_bitField0_ & 128) == 0) {
                           this.awardIds_ = newIntList();
                           mutable_bitField0_ |= 128;
                        }

                        this.awardIds_.addInt(input.readInt32());
                        continue;
                     case 66:
                        int length = input.readRawVarint32();
                        limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 128) == 0 && input.getBytesUntilLimit() > 0) {
                           this.awardIds_ = newIntList();
                           mutable_bitField0_ |= 128;
                        }
                        break;
                     case 72:
                        this.bitField0_ |= 128;
                        this.giveNum_ = input.readInt32();
                        continue;
                     case 80:
                        this.bitField0_ |= 256;
                        this.fastFightAddNum_ = input.readInt32();
                        continue;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                        continue;
                  }

                  while(input.getBytesUntilLimit() > 0) {
                     this.awardIds_.addInt(input.readInt32());
                  }

                  input.popLimit(limit);
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 128) != 0) {
                  this.awardIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_MainUiInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_MainUiInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(MainUiInfo.class, Builder.class);
      }

      public boolean hasChapterId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChapterId() {
         return this.chapterId_;
      }

      public boolean hasStartTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getStartTime() {
         return this.startTime_;
      }

      public boolean hasFreeFightNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getFreeFightNum() {
         return this.freeFightNum_;
      }

      public boolean hasGoldFightNum() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getGoldFightNum() {
         return this.goldFightNum_;
      }

      public boolean hasType() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getType() {
         return this.type_;
      }

      public boolean hasRecordTime() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getRecordTime() {
         return this.recordTime_;
      }

      public boolean hasTime() {
         return (this.bitField0_ & 64) != 0;
      }

      public int getTime() {
         return this.time_;
      }

      public List<Integer> getAwardIdsList() {
         return this.awardIds_;
      }

      public int getAwardIdsCount() {
         return this.awardIds_.size();
      }

      public int getAwardIds(int index) {
         return this.awardIds_.getInt(index);
      }

      public boolean hasGiveNum() {
         return (this.bitField0_ & 128) != 0;
      }

      public int getGiveNum() {
         return this.giveNum_;
      }

      public boolean hasFastFightAddNum() {
         return (this.bitField0_ & 256) != 0;
      }

      public int getFastFightAddNum() {
         return this.fastFightAddNum_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasChapterId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasStartTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasFreeFightNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGoldFightNum()) {
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
            output.writeInt32(1, this.chapterId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.startTime_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.freeFightNum_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.goldFightNum_);
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(5, this.type_);
         }

         if ((this.bitField0_ & 32) != 0) {
            output.writeInt32(6, this.recordTime_);
         }

         if ((this.bitField0_ & 64) != 0) {
            output.writeInt32(7, this.time_);
         }

         for(int i = 0; i < this.awardIds_.size(); ++i) {
            output.writeInt32(8, this.awardIds_.getInt(i));
         }

         if ((this.bitField0_ & 128) != 0) {
            output.writeInt32(9, this.giveNum_);
         }

         if ((this.bitField0_ & 256) != 0) {
            output.writeInt32(10, this.fastFightAddNum_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.chapterId_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.startTime_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.freeFightNum_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.goldFightNum_);
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(5, this.type_);
            }

            if ((this.bitField0_ & 32) != 0) {
               size += CodedOutputStream.computeInt32Size(6, this.recordTime_);
            }

            if ((this.bitField0_ & 64) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.time_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.awardIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.awardIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getAwardIdsList().size();
            if ((this.bitField0_ & 128) != 0) {
               size += CodedOutputStream.computeInt32Size(9, this.giveNum_);
            }

            if ((this.bitField0_ & 256) != 0) {
               size += CodedOutputStream.computeInt32Size(10, this.fastFightAddNum_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof MainUiInfo)) {
            return super.equals(obj);
         } else {
            MainUiInfo other = (MainUiInfo)obj;
            if (this.hasChapterId() != other.hasChapterId()) {
               return false;
            } else if (this.hasChapterId() && this.getChapterId() != other.getChapterId()) {
               return false;
            } else if (this.hasStartTime() != other.hasStartTime()) {
               return false;
            } else if (this.hasStartTime() && this.getStartTime() != other.getStartTime()) {
               return false;
            } else if (this.hasFreeFightNum() != other.hasFreeFightNum()) {
               return false;
            } else if (this.hasFreeFightNum() && this.getFreeFightNum() != other.getFreeFightNum()) {
               return false;
            } else if (this.hasGoldFightNum() != other.hasGoldFightNum()) {
               return false;
            } else if (this.hasGoldFightNum() && this.getGoldFightNum() != other.getGoldFightNum()) {
               return false;
            } else if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.getType() != other.getType()) {
               return false;
            } else if (this.hasRecordTime() != other.hasRecordTime()) {
               return false;
            } else if (this.hasRecordTime() && this.getRecordTime() != other.getRecordTime()) {
               return false;
            } else if (this.hasTime() != other.hasTime()) {
               return false;
            } else if (this.hasTime() && this.getTime() != other.getTime()) {
               return false;
            } else if (!this.getAwardIdsList().equals(other.getAwardIdsList())) {
               return false;
            } else if (this.hasGiveNum() != other.hasGiveNum()) {
               return false;
            } else if (this.hasGiveNum() && this.getGiveNum() != other.getGiveNum()) {
               return false;
            } else if (this.hasFastFightAddNum() != other.hasFastFightAddNum()) {
               return false;
            } else if (this.hasFastFightAddNum() && this.getFastFightAddNum() != other.getFastFightAddNum()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasChapterId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChapterId();
            }

            if (this.hasStartTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getStartTime();
            }

            if (this.hasFreeFightNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getFreeFightNum();
            }

            if (this.hasGoldFightNum()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getGoldFightNum();
            }

            if (this.hasType()) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getType();
            }

            if (this.hasRecordTime()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getRecordTime();
            }

            if (this.hasTime()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getTime();
            }

            if (this.getAwardIdsCount() > 0) {
               hash = 37 * hash + 8;
               hash = 53 * hash + this.getAwardIdsList().hashCode();
            }

            if (this.hasGiveNum()) {
               hash = 37 * hash + 9;
               hash = 53 * hash + this.getGiveNum();
            }

            if (this.hasFastFightAddNum()) {
               hash = 37 * hash + 10;
               hash = 53 * hash + this.getFastFightAddNum();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static MainUiInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (MainUiInfo)PARSER.parseFrom(data);
      }

      public static MainUiInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MainUiInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MainUiInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (MainUiInfo)PARSER.parseFrom(data);
      }

      public static MainUiInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MainUiInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MainUiInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (MainUiInfo)PARSER.parseFrom(data);
      }

      public static MainUiInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (MainUiInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static MainUiInfo parseFrom(InputStream input) throws IOException {
         return (MainUiInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MainUiInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MainUiInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static MainUiInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (MainUiInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static MainUiInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MainUiInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static MainUiInfo parseFrom(CodedInputStream input) throws IOException {
         return (MainUiInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static MainUiInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (MainUiInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(MainUiInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static MainUiInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<MainUiInfo> parser() {
         return PARSER;
      }

      public Parser<MainUiInfo> getParserForType() {
         return PARSER;
      }

      public MainUiInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MainUiInfoOrBuilder {
         private int bitField0_;
         private int chapterId_;
         private int startTime_;
         private int freeFightNum_;
         private int goldFightNum_;
         private int type_;
         private int recordTime_;
         private int time_;
         private Internal.IntList awardIds_;
         private int giveNum_;
         private int fastFightAddNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_MainUiInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_MainUiInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(MainUiInfo.class, Builder.class);
         }

         private Builder() {
            this.awardIds_ = BattleChapterMsg.MainUiInfo.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.awardIds_ = BattleChapterMsg.MainUiInfo.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.MainUiInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.chapterId_ = 0;
            this.bitField0_ &= -2;
            this.startTime_ = 0;
            this.bitField0_ &= -3;
            this.freeFightNum_ = 0;
            this.bitField0_ &= -5;
            this.goldFightNum_ = 0;
            this.bitField0_ &= -9;
            this.type_ = 0;
            this.bitField0_ &= -17;
            this.recordTime_ = 0;
            this.bitField0_ &= -33;
            this.time_ = 0;
            this.bitField0_ &= -65;
            this.awardIds_ = BattleChapterMsg.MainUiInfo.emptyIntList();
            this.bitField0_ &= -129;
            this.giveNum_ = 0;
            this.bitField0_ &= -257;
            this.fastFightAddNum_ = 0;
            this.bitField0_ &= -513;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_MainUiInfo_descriptor;
         }

         public MainUiInfo getDefaultInstanceForType() {
            return BattleChapterMsg.MainUiInfo.getDefaultInstance();
         }

         public MainUiInfo build() {
            MainUiInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public MainUiInfo buildPartial() {
            MainUiInfo result = new MainUiInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.chapterId_ = this.chapterId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.startTime_ = this.startTime_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.freeFightNum_ = this.freeFightNum_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.goldFightNum_ = this.goldFightNum_;
               to_bitField0_ |= 8;
            }

            if ((from_bitField0_ & 16) != 0) {
               result.type_ = this.type_;
               to_bitField0_ |= 16;
            }

            if ((from_bitField0_ & 32) != 0) {
               result.recordTime_ = this.recordTime_;
               to_bitField0_ |= 32;
            }

            if ((from_bitField0_ & 64) != 0) {
               result.time_ = this.time_;
               to_bitField0_ |= 64;
            }

            if ((this.bitField0_ & 128) != 0) {
               this.awardIds_.makeImmutable();
               this.bitField0_ &= -129;
            }

            result.awardIds_ = this.awardIds_;
            if ((from_bitField0_ & 256) != 0) {
               result.giveNum_ = this.giveNum_;
               to_bitField0_ |= 128;
            }

            if ((from_bitField0_ & 512) != 0) {
               result.fastFightAddNum_ = this.fastFightAddNum_;
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
            if (other instanceof MainUiInfo) {
               return this.mergeFrom((MainUiInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(MainUiInfo other) {
            if (other == BattleChapterMsg.MainUiInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChapterId()) {
                  this.setChapterId(other.getChapterId());
               }

               if (other.hasStartTime()) {
                  this.setStartTime(other.getStartTime());
               }

               if (other.hasFreeFightNum()) {
                  this.setFreeFightNum(other.getFreeFightNum());
               }

               if (other.hasGoldFightNum()) {
                  this.setGoldFightNum(other.getGoldFightNum());
               }

               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasRecordTime()) {
                  this.setRecordTime(other.getRecordTime());
               }

               if (other.hasTime()) {
                  this.setTime(other.getTime());
               }

               if (!other.awardIds_.isEmpty()) {
                  if (this.awardIds_.isEmpty()) {
                     this.awardIds_ = other.awardIds_;
                     this.bitField0_ &= -129;
                  } else {
                     this.ensureAwardIdsIsMutable();
                     this.awardIds_.addAll(other.awardIds_);
                  }

                  this.onChanged();
               }

               if (other.hasGiveNum()) {
                  this.setGiveNum(other.getGiveNum());
               }

               if (other.hasFastFightAddNum()) {
                  this.setFastFightAddNum(other.getFastFightAddNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasChapterId()) {
               return false;
            } else if (!this.hasStartTime()) {
               return false;
            } else if (!this.hasFreeFightNum()) {
               return false;
            } else if (!this.hasGoldFightNum()) {
               return false;
            } else {
               return this.hasType();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            MainUiInfo parsedMessage = null;

            try {
               parsedMessage = (MainUiInfo)BattleChapterMsg.MainUiInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (MainUiInfo)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasChapterId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getChapterId() {
            return this.chapterId_;
         }

         public Builder setChapterId(int value) {
            this.bitField0_ |= 1;
            this.chapterId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChapterId() {
            this.bitField0_ &= -2;
            this.chapterId_ = 0;
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

         public boolean hasFreeFightNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getFreeFightNum() {
            return this.freeFightNum_;
         }

         public Builder setFreeFightNum(int value) {
            this.bitField0_ |= 4;
            this.freeFightNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFreeFightNum() {
            this.bitField0_ &= -5;
            this.freeFightNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGoldFightNum() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getGoldFightNum() {
            return this.goldFightNum_;
         }

         public Builder setGoldFightNum(int value) {
            this.bitField0_ |= 8;
            this.goldFightNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGoldFightNum() {
            this.bitField0_ &= -9;
            this.goldFightNum_ = 0;
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

         public boolean hasRecordTime() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getRecordTime() {
            return this.recordTime_;
         }

         public Builder setRecordTime(int value) {
            this.bitField0_ |= 32;
            this.recordTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecordTime() {
            this.bitField0_ &= -33;
            this.recordTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTime() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getTime() {
            return this.time_;
         }

         public Builder setTime(int value) {
            this.bitField0_ |= 64;
            this.time_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTime() {
            this.bitField0_ &= -65;
            this.time_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureAwardIdsIsMutable() {
            if ((this.bitField0_ & 128) == 0) {
               this.awardIds_ = BattleChapterMsg.MainUiInfo.mutableCopy(this.awardIds_);
               this.bitField0_ |= 128;
            }

         }

         public List<Integer> getAwardIdsList() {
            return (List<Integer>)((this.bitField0_ & 128) != 0 ? Collections.unmodifiableList(this.awardIds_) : this.awardIds_);
         }

         public int getAwardIdsCount() {
            return this.awardIds_.size();
         }

         public int getAwardIds(int index) {
            return this.awardIds_.getInt(index);
         }

         public Builder setAwardIds(int index, int value) {
            this.ensureAwardIdsIsMutable();
            this.awardIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addAwardIds(int value) {
            this.ensureAwardIdsIsMutable();
            this.awardIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllAwardIds(Iterable<? extends Integer> values) {
            this.ensureAwardIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.awardIds_);
            this.onChanged();
            return this;
         }

         public Builder clearAwardIds() {
            this.awardIds_ = BattleChapterMsg.MainUiInfo.emptyIntList();
            this.bitField0_ &= -129;
            this.onChanged();
            return this;
         }

         public boolean hasGiveNum() {
            return (this.bitField0_ & 256) != 0;
         }

         public int getGiveNum() {
            return this.giveNum_;
         }

         public Builder setGiveNum(int value) {
            this.bitField0_ |= 256;
            this.giveNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGiveNum() {
            this.bitField0_ &= -257;
            this.giveNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFastFightAddNum() {
            return (this.bitField0_ & 512) != 0;
         }

         public int getFastFightAddNum() {
            return this.fastFightAddNum_;
         }

         public Builder setFastFightAddNum(int value) {
            this.bitField0_ |= 512;
            this.fastFightAddNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFastFightAddNum() {
            this.bitField0_ &= -513;
            this.fastFightAddNum_ = 0;
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
      public static final int CROSSNUM_FIELD_NUMBER = 6;
      private int crossNum_;
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
                        this.crossNum_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_RankInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_RankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RankInfo.class, Builder.class);
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

      public boolean hasCrossNum() {
         return (this.bitField0_ & 32) != 0;
      }

      public int getCrossNum() {
         return this.crossNum_;
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
         } else if (!this.hasCrossNum()) {
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
            output.writeInt32(6, this.crossNum_);
         }

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
               size += CodedOutputStream.computeInt32Size(6, this.crossNum_);
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
            } else if (this.hasCrossNum() != other.hasCrossNum()) {
               return false;
            } else if (this.hasCrossNum() && this.getCrossNum() != other.getCrossNum()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasCrossNum()) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getCrossNum();
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
         private int crossNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_RankInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_RankInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(RankInfo.class, Builder.class);
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
            if (BattleChapterMsg.RankInfo.alwaysUseFieldBuilders) {
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
            this.crossNum_ = 0;
            this.bitField0_ &= -33;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_RankInfo_descriptor;
         }

         public RankInfo getDefaultInstanceForType() {
            return BattleChapterMsg.RankInfo.getDefaultInstance();
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
               result.crossNum_ = this.crossNum_;
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
            if (other instanceof RankInfo) {
               return this.mergeFrom((RankInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(RankInfo other) {
            if (other == BattleChapterMsg.RankInfo.getDefaultInstance()) {
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

               if (other.hasCrossNum()) {
                  this.setCrossNum(other.getCrossNum());
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
            } else {
               return this.hasCrossNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            RankInfo parsedMessage = null;

            try {
               parsedMessage = (RankInfo)BattleChapterMsg.RankInfo.PARSER.parsePartialFrom(input, extensionRegistry);
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
            this.name_ = BattleChapterMsg.RankInfo.getDefaultInstance().getName();
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

         public boolean hasCrossNum() {
            return (this.bitField0_ & 32) != 0;
         }

         public int getCrossNum() {
            return this.crossNum_;
         }

         public Builder setCrossNum(int value) {
            this.bitField0_ |= 32;
            this.crossNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearCrossNum() {
            this.bitField0_ &= -33;
            this.crossNum_ = 0;
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

   public static final class C2S_OpenMainUi_7201 extends GeneratedMessageV3 implements C2S_OpenMainUi_7201OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_OpenMainUi_7201 DEFAULT_INSTANCE = new C2S_OpenMainUi_7201();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_OpenMainUi_7201> PARSER = new AbstractParser<C2S_OpenMainUi_7201>() {
         public C2S_OpenMainUi_7201 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_OpenMainUi_7201(input, extensionRegistry);
         }
      };

      private C2S_OpenMainUi_7201(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_OpenMainUi_7201() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_OpenMainUi_7201();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_OpenMainUi_7201(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_OpenMainUi_7201_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_OpenMainUi_7201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenMainUi_7201.class, Builder.class);
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
         } else if (!(obj instanceof C2S_OpenMainUi_7201)) {
            return super.equals(obj);
         } else {
            C2S_OpenMainUi_7201 other = (C2S_OpenMainUi_7201)obj;
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

      public static C2S_OpenMainUi_7201 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_OpenMainUi_7201)PARSER.parseFrom(data);
      }

      public static C2S_OpenMainUi_7201 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenMainUi_7201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenMainUi_7201 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_OpenMainUi_7201)PARSER.parseFrom(data);
      }

      public static C2S_OpenMainUi_7201 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenMainUi_7201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenMainUi_7201 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_OpenMainUi_7201)PARSER.parseFrom(data);
      }

      public static C2S_OpenMainUi_7201 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_OpenMainUi_7201)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_OpenMainUi_7201 parseFrom(InputStream input) throws IOException {
         return (C2S_OpenMainUi_7201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenMainUi_7201 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenMainUi_7201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenMainUi_7201 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_OpenMainUi_7201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_OpenMainUi_7201 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenMainUi_7201)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_OpenMainUi_7201 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_OpenMainUi_7201)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_OpenMainUi_7201 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_OpenMainUi_7201)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_OpenMainUi_7201 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_OpenMainUi_7201 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_OpenMainUi_7201> parser() {
         return PARSER;
      }

      public Parser<C2S_OpenMainUi_7201> getParserForType() {
         return PARSER;
      }

      public C2S_OpenMainUi_7201 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_OpenMainUi_7201OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_OpenMainUi_7201_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_OpenMainUi_7201_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_OpenMainUi_7201.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.C2S_OpenMainUi_7201.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_OpenMainUi_7201_descriptor;
         }

         public C2S_OpenMainUi_7201 getDefaultInstanceForType() {
            return BattleChapterMsg.C2S_OpenMainUi_7201.getDefaultInstance();
         }

         public C2S_OpenMainUi_7201 build() {
            C2S_OpenMainUi_7201 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_OpenMainUi_7201 buildPartial() {
            C2S_OpenMainUi_7201 result = new C2S_OpenMainUi_7201(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_OpenMainUi_7201) {
               return this.mergeFrom((C2S_OpenMainUi_7201)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_OpenMainUi_7201 other) {
            if (other == BattleChapterMsg.C2S_OpenMainUi_7201.getDefaultInstance()) {
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
            C2S_OpenMainUi_7201 parsedMessage = null;

            try {
               parsedMessage = (C2S_OpenMainUi_7201)BattleChapterMsg.C2S_OpenMainUi_7201.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_OpenMainUi_7201)e.getUnfinishedMessage();
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

   public static final class S2C_OpenMainUiResult_7202 extends GeneratedMessageV3 implements S2C_OpenMainUiResult_7202OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int INFO_FIELD_NUMBER = 1;
      private MainUiInfo info_;
      private byte memoizedIsInitialized;
      private static final S2C_OpenMainUiResult_7202 DEFAULT_INSTANCE = new S2C_OpenMainUiResult_7202();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_OpenMainUiResult_7202> PARSER = new AbstractParser<S2C_OpenMainUiResult_7202>() {
         public S2C_OpenMainUiResult_7202 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_OpenMainUiResult_7202(input, extensionRegistry);
         }
      };

      private S2C_OpenMainUiResult_7202(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_OpenMainUiResult_7202() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_OpenMainUiResult_7202();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_OpenMainUiResult_7202(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        MainUiInfo.Builder subBuilder = null;
                        if ((this.bitField0_ & 1) != 0) {
                           subBuilder = this.info_.toBuilder();
                        }

                        this.info_ = (MainUiInfo)input.readMessage(BattleChapterMsg.MainUiInfo.PARSER, extensionRegistry);
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
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_OpenMainUiResult_7202_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_OpenMainUiResult_7202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenMainUiResult_7202.class, Builder.class);
      }

      public boolean hasInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      public MainUiInfo getInfo() {
         return this.info_ == null ? BattleChapterMsg.MainUiInfo.getDefaultInstance() : this.info_;
      }

      public MainUiInfoOrBuilder getInfoOrBuilder() {
         return this.info_ == null ? BattleChapterMsg.MainUiInfo.getDefaultInstance() : this.info_;
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
         } else if (!(obj instanceof S2C_OpenMainUiResult_7202)) {
            return super.equals(obj);
         } else {
            S2C_OpenMainUiResult_7202 other = (S2C_OpenMainUiResult_7202)obj;
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

      public static S2C_OpenMainUiResult_7202 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_OpenMainUiResult_7202)PARSER.parseFrom(data);
      }

      public static S2C_OpenMainUiResult_7202 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenMainUiResult_7202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenMainUiResult_7202 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_OpenMainUiResult_7202)PARSER.parseFrom(data);
      }

      public static S2C_OpenMainUiResult_7202 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenMainUiResult_7202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenMainUiResult_7202 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_OpenMainUiResult_7202)PARSER.parseFrom(data);
      }

      public static S2C_OpenMainUiResult_7202 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_OpenMainUiResult_7202)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_OpenMainUiResult_7202 parseFrom(InputStream input) throws IOException {
         return (S2C_OpenMainUiResult_7202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenMainUiResult_7202 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenMainUiResult_7202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenMainUiResult_7202 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_OpenMainUiResult_7202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_OpenMainUiResult_7202 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenMainUiResult_7202)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_OpenMainUiResult_7202 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_OpenMainUiResult_7202)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_OpenMainUiResult_7202 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_OpenMainUiResult_7202)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_OpenMainUiResult_7202 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_OpenMainUiResult_7202 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_OpenMainUiResult_7202> parser() {
         return PARSER;
      }

      public Parser<S2C_OpenMainUiResult_7202> getParserForType() {
         return PARSER;
      }

      public S2C_OpenMainUiResult_7202 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_OpenMainUiResult_7202OrBuilder {
         private int bitField0_;
         private MainUiInfo info_;
         private SingleFieldBuilderV3<MainUiInfo, MainUiInfo.Builder, MainUiInfoOrBuilder> infoBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_OpenMainUiResult_7202_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_OpenMainUiResult_7202_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_OpenMainUiResult_7202.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.S2C_OpenMainUiResult_7202.alwaysUseFieldBuilders) {
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
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_OpenMainUiResult_7202_descriptor;
         }

         public S2C_OpenMainUiResult_7202 getDefaultInstanceForType() {
            return BattleChapterMsg.S2C_OpenMainUiResult_7202.getDefaultInstance();
         }

         public S2C_OpenMainUiResult_7202 build() {
            S2C_OpenMainUiResult_7202 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_OpenMainUiResult_7202 buildPartial() {
            S2C_OpenMainUiResult_7202 result = new S2C_OpenMainUiResult_7202(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               if (this.infoBuilder_ == null) {
                  result.info_ = this.info_;
               } else {
                  result.info_ = (MainUiInfo)this.infoBuilder_.build();
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
            if (other instanceof S2C_OpenMainUiResult_7202) {
               return this.mergeFrom((S2C_OpenMainUiResult_7202)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_OpenMainUiResult_7202 other) {
            if (other == BattleChapterMsg.S2C_OpenMainUiResult_7202.getDefaultInstance()) {
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
            S2C_OpenMainUiResult_7202 parsedMessage = null;

            try {
               parsedMessage = (S2C_OpenMainUiResult_7202)BattleChapterMsg.S2C_OpenMainUiResult_7202.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_OpenMainUiResult_7202)e.getUnfinishedMessage();
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

         public MainUiInfo getInfo() {
            if (this.infoBuilder_ == null) {
               return this.info_ == null ? BattleChapterMsg.MainUiInfo.getDefaultInstance() : this.info_;
            } else {
               return (MainUiInfo)this.infoBuilder_.getMessage();
            }
         }

         public Builder setInfo(MainUiInfo value) {
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

         public Builder setInfo(MainUiInfo.Builder builderForValue) {
            if (this.infoBuilder_ == null) {
               this.info_ = builderForValue.build();
               this.onChanged();
            } else {
               this.infoBuilder_.setMessage(builderForValue.build());
            }

            this.bitField0_ |= 1;
            return this;
         }

         public Builder mergeInfo(MainUiInfo value) {
            if (this.infoBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.info_ != null && this.info_ != BattleChapterMsg.MainUiInfo.getDefaultInstance()) {
                  this.info_ = BattleChapterMsg.MainUiInfo.newBuilder(this.info_).mergeFrom(value).buildPartial();
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

         public MainUiInfo.Builder getInfoBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return (MainUiInfo.Builder)this.getInfoFieldBuilder().getBuilder();
         }

         public MainUiInfoOrBuilder getInfoOrBuilder() {
            if (this.infoBuilder_ != null) {
               return (MainUiInfoOrBuilder)this.infoBuilder_.getMessageOrBuilder();
            } else {
               return this.info_ == null ? BattleChapterMsg.MainUiInfo.getDefaultInstance() : this.info_;
            }
         }

         private SingleFieldBuilderV3<MainUiInfo, MainUiInfo.Builder, MainUiInfoOrBuilder> getInfoFieldBuilder() {
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

   public static final class C2S_TakeTimeReward_7205 extends GeneratedMessageV3 implements C2S_TakeTimeReward_7205OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_TakeTimeReward_7205 DEFAULT_INSTANCE = new C2S_TakeTimeReward_7205();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TakeTimeReward_7205> PARSER = new AbstractParser<C2S_TakeTimeReward_7205>() {
         public C2S_TakeTimeReward_7205 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TakeTimeReward_7205(input, extensionRegistry);
         }
      };

      private C2S_TakeTimeReward_7205(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TakeTimeReward_7205() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TakeTimeReward_7205();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TakeTimeReward_7205(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeTimeReward_7205_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeTimeReward_7205_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeTimeReward_7205.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TakeTimeReward_7205)) {
            return super.equals(obj);
         } else {
            C2S_TakeTimeReward_7205 other = (C2S_TakeTimeReward_7205)obj;
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

      public static C2S_TakeTimeReward_7205 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TakeTimeReward_7205)PARSER.parseFrom(data);
      }

      public static C2S_TakeTimeReward_7205 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeTimeReward_7205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeTimeReward_7205 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TakeTimeReward_7205)PARSER.parseFrom(data);
      }

      public static C2S_TakeTimeReward_7205 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeTimeReward_7205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeTimeReward_7205 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TakeTimeReward_7205)PARSER.parseFrom(data);
      }

      public static C2S_TakeTimeReward_7205 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeTimeReward_7205)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeTimeReward_7205 parseFrom(InputStream input) throws IOException {
         return (C2S_TakeTimeReward_7205)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeTimeReward_7205 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeTimeReward_7205)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeTimeReward_7205 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TakeTimeReward_7205)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TakeTimeReward_7205 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeTimeReward_7205)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeTimeReward_7205 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TakeTimeReward_7205)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeTimeReward_7205 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeTimeReward_7205)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TakeTimeReward_7205 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TakeTimeReward_7205 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TakeTimeReward_7205> parser() {
         return PARSER;
      }

      public Parser<C2S_TakeTimeReward_7205> getParserForType() {
         return PARSER;
      }

      public C2S_TakeTimeReward_7205 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TakeTimeReward_7205OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeTimeReward_7205_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeTimeReward_7205_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeTimeReward_7205.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.C2S_TakeTimeReward_7205.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeTimeReward_7205_descriptor;
         }

         public C2S_TakeTimeReward_7205 getDefaultInstanceForType() {
            return BattleChapterMsg.C2S_TakeTimeReward_7205.getDefaultInstance();
         }

         public C2S_TakeTimeReward_7205 build() {
            C2S_TakeTimeReward_7205 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TakeTimeReward_7205 buildPartial() {
            C2S_TakeTimeReward_7205 result = new C2S_TakeTimeReward_7205(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_TakeTimeReward_7205) {
               return this.mergeFrom((C2S_TakeTimeReward_7205)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TakeTimeReward_7205 other) {
            if (other == BattleChapterMsg.C2S_TakeTimeReward_7205.getDefaultInstance()) {
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
            C2S_TakeTimeReward_7205 parsedMessage = null;

            try {
               parsedMessage = (C2S_TakeTimeReward_7205)BattleChapterMsg.C2S_TakeTimeReward_7205.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TakeTimeReward_7205)e.getUnfinishedMessage();
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

   public static final class S2C_TakeTimeRewardResult_7206 extends GeneratedMessageV3 implements S2C_TakeTimeRewardResult_7206OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TIME_FIELD_NUMBER = 1;
      private int time_;
      private byte memoizedIsInitialized;
      private static final S2C_TakeTimeRewardResult_7206 DEFAULT_INSTANCE = new S2C_TakeTimeRewardResult_7206();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TakeTimeRewardResult_7206> PARSER = new AbstractParser<S2C_TakeTimeRewardResult_7206>() {
         public S2C_TakeTimeRewardResult_7206 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TakeTimeRewardResult_7206(input, extensionRegistry);
         }
      };

      private S2C_TakeTimeRewardResult_7206(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TakeTimeRewardResult_7206() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TakeTimeRewardResult_7206();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TakeTimeRewardResult_7206(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.time_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_TakeTimeRewardResult_7206_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_TakeTimeRewardResult_7206_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeTimeRewardResult_7206.class, Builder.class);
      }

      public boolean hasTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getTime() {
         return this.time_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.time_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.time_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TakeTimeRewardResult_7206)) {
            return super.equals(obj);
         } else {
            S2C_TakeTimeRewardResult_7206 other = (S2C_TakeTimeRewardResult_7206)obj;
            if (this.hasTime() != other.hasTime()) {
               return false;
            } else if (this.hasTime() && this.getTime() != other.getTime()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTime();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TakeTimeRewardResult_7206 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TakeTimeRewardResult_7206)PARSER.parseFrom(data);
      }

      public static S2C_TakeTimeRewardResult_7206 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeTimeRewardResult_7206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeTimeRewardResult_7206 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TakeTimeRewardResult_7206)PARSER.parseFrom(data);
      }

      public static S2C_TakeTimeRewardResult_7206 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeTimeRewardResult_7206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeTimeRewardResult_7206 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TakeTimeRewardResult_7206)PARSER.parseFrom(data);
      }

      public static S2C_TakeTimeRewardResult_7206 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeTimeRewardResult_7206)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeTimeRewardResult_7206 parseFrom(InputStream input) throws IOException {
         return (S2C_TakeTimeRewardResult_7206)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeTimeRewardResult_7206 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeTimeRewardResult_7206)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeTimeRewardResult_7206 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TakeTimeRewardResult_7206)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TakeTimeRewardResult_7206 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeTimeRewardResult_7206)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeTimeRewardResult_7206 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TakeTimeRewardResult_7206)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeTimeRewardResult_7206 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeTimeRewardResult_7206)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TakeTimeRewardResult_7206 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TakeTimeRewardResult_7206 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TakeTimeRewardResult_7206> parser() {
         return PARSER;
      }

      public Parser<S2C_TakeTimeRewardResult_7206> getParserForType() {
         return PARSER;
      }

      public S2C_TakeTimeRewardResult_7206 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TakeTimeRewardResult_7206OrBuilder {
         private int bitField0_;
         private int time_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_TakeTimeRewardResult_7206_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_TakeTimeRewardResult_7206_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeTimeRewardResult_7206.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.S2C_TakeTimeRewardResult_7206.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.time_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_TakeTimeRewardResult_7206_descriptor;
         }

         public S2C_TakeTimeRewardResult_7206 getDefaultInstanceForType() {
            return BattleChapterMsg.S2C_TakeTimeRewardResult_7206.getDefaultInstance();
         }

         public S2C_TakeTimeRewardResult_7206 build() {
            S2C_TakeTimeRewardResult_7206 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TakeTimeRewardResult_7206 buildPartial() {
            S2C_TakeTimeRewardResult_7206 result = new S2C_TakeTimeRewardResult_7206(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.time_ = this.time_;
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
            if (other instanceof S2C_TakeTimeRewardResult_7206) {
               return this.mergeFrom((S2C_TakeTimeRewardResult_7206)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TakeTimeRewardResult_7206 other) {
            if (other == BattleChapterMsg.S2C_TakeTimeRewardResult_7206.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasTime()) {
                  this.setTime(other.getTime());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasTime();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TakeTimeRewardResult_7206 parsedMessage = null;

            try {
               parsedMessage = (S2C_TakeTimeRewardResult_7206)BattleChapterMsg.S2C_TakeTimeRewardResult_7206.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TakeTimeRewardResult_7206)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getTime() {
            return this.time_;
         }

         public Builder setTime(int value) {
            this.bitField0_ |= 1;
            this.time_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTime() {
            this.bitField0_ &= -2;
            this.time_ = 0;
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

   public static final class C2S_FastBattle_7207 extends GeneratedMessageV3 implements C2S_FastBattle_7207OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GUIDESTEP_FIELD_NUMBER = 1;
      private int guideStep_;
      private byte memoizedIsInitialized;
      private static final C2S_FastBattle_7207 DEFAULT_INSTANCE = new C2S_FastBattle_7207();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FastBattle_7207> PARSER = new AbstractParser<C2S_FastBattle_7207>() {
         public C2S_FastBattle_7207 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FastBattle_7207(input, extensionRegistry);
         }
      };

      private C2S_FastBattle_7207(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FastBattle_7207() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FastBattle_7207();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FastBattle_7207(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_FastBattle_7207_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_FastBattle_7207_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FastBattle_7207.class, Builder.class);
      }

      public boolean hasGuideStep() {
         return (this.bitField0_ & 1) != 0;
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.guideStep_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.guideStep_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FastBattle_7207)) {
            return super.equals(obj);
         } else {
            C2S_FastBattle_7207 other = (C2S_FastBattle_7207)obj;
            if (this.hasGuideStep() != other.hasGuideStep()) {
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
            if (this.hasGuideStep()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGuideStep();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FastBattle_7207 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FastBattle_7207)PARSER.parseFrom(data);
      }

      public static C2S_FastBattle_7207 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FastBattle_7207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FastBattle_7207 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FastBattle_7207)PARSER.parseFrom(data);
      }

      public static C2S_FastBattle_7207 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FastBattle_7207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FastBattle_7207 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FastBattle_7207)PARSER.parseFrom(data);
      }

      public static C2S_FastBattle_7207 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FastBattle_7207)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FastBattle_7207 parseFrom(InputStream input) throws IOException {
         return (C2S_FastBattle_7207)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FastBattle_7207 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FastBattle_7207)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FastBattle_7207 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FastBattle_7207)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FastBattle_7207 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FastBattle_7207)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FastBattle_7207 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FastBattle_7207)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FastBattle_7207 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FastBattle_7207)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FastBattle_7207 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FastBattle_7207 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FastBattle_7207> parser() {
         return PARSER;
      }

      public Parser<C2S_FastBattle_7207> getParserForType() {
         return PARSER;
      }

      public C2S_FastBattle_7207 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FastBattle_7207OrBuilder {
         private int bitField0_;
         private int guideStep_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_FastBattle_7207_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_FastBattle_7207_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FastBattle_7207.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.C2S_FastBattle_7207.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.guideStep_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_FastBattle_7207_descriptor;
         }

         public C2S_FastBattle_7207 getDefaultInstanceForType() {
            return BattleChapterMsg.C2S_FastBattle_7207.getDefaultInstance();
         }

         public C2S_FastBattle_7207 build() {
            C2S_FastBattle_7207 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FastBattle_7207 buildPartial() {
            C2S_FastBattle_7207 result = new C2S_FastBattle_7207(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.guideStep_ = this.guideStep_;
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
            if (other instanceof C2S_FastBattle_7207) {
               return this.mergeFrom((C2S_FastBattle_7207)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FastBattle_7207 other) {
            if (other == BattleChapterMsg.C2S_FastBattle_7207.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGuideStep()) {
                  this.setGuideStep(other.getGuideStep());
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
            C2S_FastBattle_7207 parsedMessage = null;

            try {
               parsedMessage = (C2S_FastBattle_7207)BattleChapterMsg.C2S_FastBattle_7207.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FastBattle_7207)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGuideStep() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGuideStep() {
            return this.guideStep_;
         }

         public Builder setGuideStep(int value) {
            this.bitField0_ |= 1;
            this.guideStep_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGuideStep() {
            this.bitField0_ &= -2;
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

   public static final class S2C_FastBattleResult_7208 extends GeneratedMessageV3 implements S2C_FastBattleResult_7208OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FREEFIGHTNUM_FIELD_NUMBER = 1;
      private int freeFightNum_;
      public static final int GOLDFIGHTNUM_FIELD_NUMBER = 2;
      private int goldFightNum_;
      public static final int GIVENUM_FIELD_NUMBER = 3;
      private int giveNum_;
      public static final int FASTFIGHTADD_FIELD_NUMBER = 4;
      private int fastFightAdd_;
      private byte memoizedIsInitialized;
      private static final S2C_FastBattleResult_7208 DEFAULT_INSTANCE = new S2C_FastBattleResult_7208();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FastBattleResult_7208> PARSER = new AbstractParser<S2C_FastBattleResult_7208>() {
         public S2C_FastBattleResult_7208 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FastBattleResult_7208(input, extensionRegistry);
         }
      };

      private S2C_FastBattleResult_7208(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FastBattleResult_7208() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FastBattleResult_7208();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FastBattleResult_7208(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.freeFightNum_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.goldFightNum_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.giveNum_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.fastFightAdd_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_FastBattleResult_7208_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_FastBattleResult_7208_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FastBattleResult_7208.class, Builder.class);
      }

      public boolean hasFreeFightNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFreeFightNum() {
         return this.freeFightNum_;
      }

      public boolean hasGoldFightNum() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getGoldFightNum() {
         return this.goldFightNum_;
      }

      public boolean hasGiveNum() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getGiveNum() {
         return this.giveNum_;
      }

      public boolean hasFastFightAdd() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getFastFightAdd() {
         return this.fastFightAdd_;
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasFreeFightNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasGoldFightNum()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.freeFightNum_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.goldFightNum_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.giveNum_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.fastFightAdd_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.freeFightNum_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.goldFightNum_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.giveNum_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.fastFightAdd_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FastBattleResult_7208)) {
            return super.equals(obj);
         } else {
            S2C_FastBattleResult_7208 other = (S2C_FastBattleResult_7208)obj;
            if (this.hasFreeFightNum() != other.hasFreeFightNum()) {
               return false;
            } else if (this.hasFreeFightNum() && this.getFreeFightNum() != other.getFreeFightNum()) {
               return false;
            } else if (this.hasGoldFightNum() != other.hasGoldFightNum()) {
               return false;
            } else if (this.hasGoldFightNum() && this.getGoldFightNum() != other.getGoldFightNum()) {
               return false;
            } else if (this.hasGiveNum() != other.hasGiveNum()) {
               return false;
            } else if (this.hasGiveNum() && this.getGiveNum() != other.getGiveNum()) {
               return false;
            } else if (this.hasFastFightAdd() != other.hasFastFightAdd()) {
               return false;
            } else if (this.hasFastFightAdd() && this.getFastFightAdd() != other.getFastFightAdd()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasFreeFightNum()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getFreeFightNum();
            }

            if (this.hasGoldFightNum()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGoldFightNum();
            }

            if (this.hasGiveNum()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getGiveNum();
            }

            if (this.hasFastFightAdd()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getFastFightAdd();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FastBattleResult_7208 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FastBattleResult_7208)PARSER.parseFrom(data);
      }

      public static S2C_FastBattleResult_7208 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FastBattleResult_7208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FastBattleResult_7208 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FastBattleResult_7208)PARSER.parseFrom(data);
      }

      public static S2C_FastBattleResult_7208 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FastBattleResult_7208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FastBattleResult_7208 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FastBattleResult_7208)PARSER.parseFrom(data);
      }

      public static S2C_FastBattleResult_7208 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FastBattleResult_7208)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FastBattleResult_7208 parseFrom(InputStream input) throws IOException {
         return (S2C_FastBattleResult_7208)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FastBattleResult_7208 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FastBattleResult_7208)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FastBattleResult_7208 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FastBattleResult_7208)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FastBattleResult_7208 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FastBattleResult_7208)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FastBattleResult_7208 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FastBattleResult_7208)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FastBattleResult_7208 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FastBattleResult_7208)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FastBattleResult_7208 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FastBattleResult_7208 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FastBattleResult_7208> parser() {
         return PARSER;
      }

      public Parser<S2C_FastBattleResult_7208> getParserForType() {
         return PARSER;
      }

      public S2C_FastBattleResult_7208 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FastBattleResult_7208OrBuilder {
         private int bitField0_;
         private int freeFightNum_;
         private int goldFightNum_;
         private int giveNum_;
         private int fastFightAdd_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_FastBattleResult_7208_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_FastBattleResult_7208_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FastBattleResult_7208.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.S2C_FastBattleResult_7208.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.freeFightNum_ = 0;
            this.bitField0_ &= -2;
            this.goldFightNum_ = 0;
            this.bitField0_ &= -3;
            this.giveNum_ = 0;
            this.bitField0_ &= -5;
            this.fastFightAdd_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_FastBattleResult_7208_descriptor;
         }

         public S2C_FastBattleResult_7208 getDefaultInstanceForType() {
            return BattleChapterMsg.S2C_FastBattleResult_7208.getDefaultInstance();
         }

         public S2C_FastBattleResult_7208 build() {
            S2C_FastBattleResult_7208 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FastBattleResult_7208 buildPartial() {
            S2C_FastBattleResult_7208 result = new S2C_FastBattleResult_7208(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.freeFightNum_ = this.freeFightNum_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.goldFightNum_ = this.goldFightNum_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.giveNum_ = this.giveNum_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.fastFightAdd_ = this.fastFightAdd_;
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
            if (other instanceof S2C_FastBattleResult_7208) {
               return this.mergeFrom((S2C_FastBattleResult_7208)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FastBattleResult_7208 other) {
            if (other == BattleChapterMsg.S2C_FastBattleResult_7208.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFreeFightNum()) {
                  this.setFreeFightNum(other.getFreeFightNum());
               }

               if (other.hasGoldFightNum()) {
                  this.setGoldFightNum(other.getGoldFightNum());
               }

               if (other.hasGiveNum()) {
                  this.setGiveNum(other.getGiveNum());
               }

               if (other.hasFastFightAdd()) {
                  this.setFastFightAdd(other.getFastFightAdd());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasFreeFightNum()) {
               return false;
            } else {
               return this.hasGoldFightNum();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FastBattleResult_7208 parsedMessage = null;

            try {
               parsedMessage = (S2C_FastBattleResult_7208)BattleChapterMsg.S2C_FastBattleResult_7208.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FastBattleResult_7208)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasFreeFightNum() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getFreeFightNum() {
            return this.freeFightNum_;
         }

         public Builder setFreeFightNum(int value) {
            this.bitField0_ |= 1;
            this.freeFightNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFreeFightNum() {
            this.bitField0_ &= -2;
            this.freeFightNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGoldFightNum() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getGoldFightNum() {
            return this.goldFightNum_;
         }

         public Builder setGoldFightNum(int value) {
            this.bitField0_ |= 2;
            this.goldFightNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGoldFightNum() {
            this.bitField0_ &= -3;
            this.goldFightNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasGiveNum() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getGiveNum() {
            return this.giveNum_;
         }

         public Builder setGiveNum(int value) {
            this.bitField0_ |= 4;
            this.giveNum_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGiveNum() {
            this.bitField0_ &= -5;
            this.giveNum_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasFastFightAdd() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getFastFightAdd() {
            return this.fastFightAdd_;
         }

         public Builder setFastFightAdd(int value) {
            this.bitField0_ |= 8;
            this.fastFightAdd_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearFastFightAdd() {
            this.bitField0_ &= -9;
            this.fastFightAdd_ = 0;
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

   public static final class C2S_ChapterRank_7209 extends GeneratedMessageV3 implements C2S_ChapterRank_7209OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ChapterRank_7209 DEFAULT_INSTANCE = new C2S_ChapterRank_7209();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ChapterRank_7209> PARSER = new AbstractParser<C2S_ChapterRank_7209>() {
         public C2S_ChapterRank_7209 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ChapterRank_7209(input, extensionRegistry);
         }
      };

      private C2S_ChapterRank_7209(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ChapterRank_7209() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ChapterRank_7209();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ChapterRank_7209(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterRank_7209_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterRank_7209_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChapterRank_7209.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ChapterRank_7209)) {
            return super.equals(obj);
         } else {
            C2S_ChapterRank_7209 other = (C2S_ChapterRank_7209)obj;
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

      public static C2S_ChapterRank_7209 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ChapterRank_7209)PARSER.parseFrom(data);
      }

      public static C2S_ChapterRank_7209 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChapterRank_7209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChapterRank_7209 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ChapterRank_7209)PARSER.parseFrom(data);
      }

      public static C2S_ChapterRank_7209 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChapterRank_7209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChapterRank_7209 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ChapterRank_7209)PARSER.parseFrom(data);
      }

      public static C2S_ChapterRank_7209 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChapterRank_7209)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChapterRank_7209 parseFrom(InputStream input) throws IOException {
         return (C2S_ChapterRank_7209)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChapterRank_7209 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChapterRank_7209)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChapterRank_7209 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ChapterRank_7209)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ChapterRank_7209 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChapterRank_7209)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChapterRank_7209 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ChapterRank_7209)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChapterRank_7209 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChapterRank_7209)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ChapterRank_7209 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ChapterRank_7209 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ChapterRank_7209> parser() {
         return PARSER;
      }

      public Parser<C2S_ChapterRank_7209> getParserForType() {
         return PARSER;
      }

      public C2S_ChapterRank_7209 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ChapterRank_7209OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterRank_7209_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterRank_7209_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChapterRank_7209.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.C2S_ChapterRank_7209.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterRank_7209_descriptor;
         }

         public C2S_ChapterRank_7209 getDefaultInstanceForType() {
            return BattleChapterMsg.C2S_ChapterRank_7209.getDefaultInstance();
         }

         public C2S_ChapterRank_7209 build() {
            C2S_ChapterRank_7209 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ChapterRank_7209 buildPartial() {
            C2S_ChapterRank_7209 result = new C2S_ChapterRank_7209(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ChapterRank_7209) {
               return this.mergeFrom((C2S_ChapterRank_7209)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ChapterRank_7209 other) {
            if (other == BattleChapterMsg.C2S_ChapterRank_7209.getDefaultInstance()) {
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
            C2S_ChapterRank_7209 parsedMessage = null;

            try {
               parsedMessage = (C2S_ChapterRank_7209)BattleChapterMsg.C2S_ChapterRank_7209.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ChapterRank_7209)e.getUnfinishedMessage();
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

   public static final class S2C_ChapterRankResult_7210 extends GeneratedMessageV3 implements S2C_ChapterRankResult_7210OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int MYRANK_FIELD_NUMBER = 1;
      private int myRank_;
      public static final int INFOS_FIELD_NUMBER = 2;
      private List<RankInfo> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_ChapterRankResult_7210 DEFAULT_INSTANCE = new S2C_ChapterRankResult_7210();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ChapterRankResult_7210> PARSER = new AbstractParser<S2C_ChapterRankResult_7210>() {
         public S2C_ChapterRankResult_7210 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ChapterRankResult_7210(input, extensionRegistry);
         }
      };

      private S2C_ChapterRankResult_7210(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ChapterRankResult_7210() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ChapterRankResult_7210();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ChapterRankResult_7210(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.myRank_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.infos_.add(input.readMessage(BattleChapterMsg.RankInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterRankResult_7210_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterRankResult_7210_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChapterRankResult_7210.class, Builder.class);
      }

      public boolean hasMyRank() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getMyRank() {
         return this.myRank_;
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
            output.writeInt32(1, this.myRank_);
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
               size += CodedOutputStream.computeInt32Size(1, this.myRank_);
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
         } else if (!(obj instanceof S2C_ChapterRankResult_7210)) {
            return super.equals(obj);
         } else {
            S2C_ChapterRankResult_7210 other = (S2C_ChapterRankResult_7210)obj;
            if (this.hasMyRank() != other.hasMyRank()) {
               return false;
            } else if (this.hasMyRank() && this.getMyRank() != other.getMyRank()) {
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
               hash = 53 * hash + this.getMyRank();
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

      public static S2C_ChapterRankResult_7210 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ChapterRankResult_7210)PARSER.parseFrom(data);
      }

      public static S2C_ChapterRankResult_7210 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChapterRankResult_7210)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChapterRankResult_7210 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ChapterRankResult_7210)PARSER.parseFrom(data);
      }

      public static S2C_ChapterRankResult_7210 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChapterRankResult_7210)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChapterRankResult_7210 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ChapterRankResult_7210)PARSER.parseFrom(data);
      }

      public static S2C_ChapterRankResult_7210 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChapterRankResult_7210)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChapterRankResult_7210 parseFrom(InputStream input) throws IOException {
         return (S2C_ChapterRankResult_7210)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChapterRankResult_7210 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChapterRankResult_7210)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChapterRankResult_7210 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ChapterRankResult_7210)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ChapterRankResult_7210 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChapterRankResult_7210)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChapterRankResult_7210 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ChapterRankResult_7210)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChapterRankResult_7210 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChapterRankResult_7210)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ChapterRankResult_7210 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ChapterRankResult_7210 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ChapterRankResult_7210> parser() {
         return PARSER;
      }

      public Parser<S2C_ChapterRankResult_7210> getParserForType() {
         return PARSER;
      }

      public S2C_ChapterRankResult_7210 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ChapterRankResult_7210OrBuilder {
         private int bitField0_;
         private int myRank_;
         private List<RankInfo> infos_;
         private RepeatedFieldBuilderV3<RankInfo, RankInfo.Builder, RankInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterRankResult_7210_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterRankResult_7210_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChapterRankResult_7210.class, Builder.class);
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
            if (BattleChapterMsg.S2C_ChapterRankResult_7210.alwaysUseFieldBuilders) {
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.myRank_ = 0;
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
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterRankResult_7210_descriptor;
         }

         public S2C_ChapterRankResult_7210 getDefaultInstanceForType() {
            return BattleChapterMsg.S2C_ChapterRankResult_7210.getDefaultInstance();
         }

         public S2C_ChapterRankResult_7210 build() {
            S2C_ChapterRankResult_7210 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ChapterRankResult_7210 buildPartial() {
            S2C_ChapterRankResult_7210 result = new S2C_ChapterRankResult_7210(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.myRank_ = this.myRank_;
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
            if (other instanceof S2C_ChapterRankResult_7210) {
               return this.mergeFrom((S2C_ChapterRankResult_7210)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ChapterRankResult_7210 other) {
            if (other == BattleChapterMsg.S2C_ChapterRankResult_7210.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasMyRank()) {
                  this.setMyRank(other.getMyRank());
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
                     this.infosBuilder_ = BattleChapterMsg.S2C_ChapterRankResult_7210.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
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
            S2C_ChapterRankResult_7210 parsedMessage = null;

            try {
               parsedMessage = (S2C_ChapterRankResult_7210)BattleChapterMsg.S2C_ChapterRankResult_7210.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ChapterRankResult_7210)e.getUnfinishedMessage();
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

         public int getMyRank() {
            return this.myRank_;
         }

         public Builder setMyRank(int value) {
            this.bitField0_ |= 1;
            this.myRank_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMyRank() {
            this.bitField0_ &= -2;
            this.myRank_ = 0;
            this.onChanged();
            return this;
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
            return (RankInfo.Builder)this.getInfosFieldBuilder().addBuilder(BattleChapterMsg.RankInfo.getDefaultInstance());
         }

         public RankInfo.Builder addInfosBuilder(int index) {
            return (RankInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, BattleChapterMsg.RankInfo.getDefaultInstance());
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

   public static final class CrossChapterInfo extends GeneratedMessageV3 implements CrossChapterInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int PLAYERID_FIELD_NUMBER = 2;
      private int playerId_;
      public static final int TIME_FIELD_NUMBER = 3;
      private int time_;
      public static final int RECORDID_FIELD_NUMBER = 4;
      private int recordId_;
      private byte memoizedIsInitialized;
      private static final CrossChapterInfo DEFAULT_INSTANCE = new CrossChapterInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<CrossChapterInfo> PARSER = new AbstractParser<CrossChapterInfo>() {
         public CrossChapterInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new CrossChapterInfo(input, extensionRegistry);
         }
      };

      private CrossChapterInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private CrossChapterInfo() {
         this.memoizedIsInitialized = -1;
         this.type_ = 0;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new CrossChapterInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private CrossChapterInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        CrossChapterType value = BattleChapterMsg.CrossChapterType.valueOf(rawValue);
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
                        this.time_ = input.readInt32();
                        break;
                     case 32:
                        this.bitField0_ |= 8;
                        this.recordId_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_CrossChapterInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_CrossChapterInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CrossChapterInfo.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public CrossChapterType getType() {
         CrossChapterType result = BattleChapterMsg.CrossChapterType.valueOf(this.type_);
         return result == null ? BattleChapterMsg.CrossChapterType.CROSSCHAPTERTYPE_NEAR : result;
      }

      public boolean hasPlayerId() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getPlayerId() {
         return this.playerId_;
      }

      public boolean hasTime() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getTime() {
         return this.time_;
      }

      public boolean hasRecordId() {
         return (this.bitField0_ & 8) != 0;
      }

      public int getRecordId() {
         return this.recordId_;
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
         } else if (!this.hasPlayerId()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasRecordId()) {
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
            output.writeInt32(3, this.time_);
         }

         if ((this.bitField0_ & 8) != 0) {
            output.writeInt32(4, this.recordId_);
         }

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
               size += CodedOutputStream.computeInt32Size(3, this.time_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += CodedOutputStream.computeInt32Size(4, this.recordId_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof CrossChapterInfo)) {
            return super.equals(obj);
         } else {
            CrossChapterInfo other = (CrossChapterInfo)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.type_ != other.type_) {
               return false;
            } else if (this.hasPlayerId() != other.hasPlayerId()) {
               return false;
            } else if (this.hasPlayerId() && this.getPlayerId() != other.getPlayerId()) {
               return false;
            } else if (this.hasTime() != other.hasTime()) {
               return false;
            } else if (this.hasTime() && this.getTime() != other.getTime()) {
               return false;
            } else if (this.hasRecordId() != other.hasRecordId()) {
               return false;
            } else if (this.hasRecordId() && this.getRecordId() != other.getRecordId()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasTime()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getTime();
            }

            if (this.hasRecordId()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getRecordId();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static CrossChapterInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (CrossChapterInfo)PARSER.parseFrom(data);
      }

      public static CrossChapterInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CrossChapterInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CrossChapterInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (CrossChapterInfo)PARSER.parseFrom(data);
      }

      public static CrossChapterInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CrossChapterInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CrossChapterInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (CrossChapterInfo)PARSER.parseFrom(data);
      }

      public static CrossChapterInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (CrossChapterInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static CrossChapterInfo parseFrom(InputStream input) throws IOException {
         return (CrossChapterInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CrossChapterInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CrossChapterInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static CrossChapterInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (CrossChapterInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static CrossChapterInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CrossChapterInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static CrossChapterInfo parseFrom(CodedInputStream input) throws IOException {
         return (CrossChapterInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static CrossChapterInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (CrossChapterInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(CrossChapterInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static CrossChapterInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<CrossChapterInfo> parser() {
         return PARSER;
      }

      public Parser<CrossChapterInfo> getParserForType() {
         return PARSER;
      }

      public CrossChapterInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CrossChapterInfoOrBuilder {
         private int bitField0_;
         private int type_;
         private int playerId_;
         private int time_;
         private int recordId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_CrossChapterInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_CrossChapterInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CrossChapterInfo.class, Builder.class);
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
            if (BattleChapterMsg.CrossChapterInfo.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 0;
            this.bitField0_ &= -2;
            this.playerId_ = 0;
            this.bitField0_ &= -3;
            this.time_ = 0;
            this.bitField0_ &= -5;
            this.recordId_ = 0;
            this.bitField0_ &= -9;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_CrossChapterInfo_descriptor;
         }

         public CrossChapterInfo getDefaultInstanceForType() {
            return BattleChapterMsg.CrossChapterInfo.getDefaultInstance();
         }

         public CrossChapterInfo build() {
            CrossChapterInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public CrossChapterInfo buildPartial() {
            CrossChapterInfo result = new CrossChapterInfo(this);
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
               result.time_ = this.time_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               result.recordId_ = this.recordId_;
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
            if (other instanceof CrossChapterInfo) {
               return this.mergeFrom((CrossChapterInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(CrossChapterInfo other) {
            if (other == BattleChapterMsg.CrossChapterInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasPlayerId()) {
                  this.setPlayerId(other.getPlayerId());
               }

               if (other.hasTime()) {
                  this.setTime(other.getTime());
               }

               if (other.hasRecordId()) {
                  this.setRecordId(other.getRecordId());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else if (!this.hasPlayerId()) {
               return false;
            } else if (!this.hasTime()) {
               return false;
            } else {
               return this.hasRecordId();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            CrossChapterInfo parsedMessage = null;

            try {
               parsedMessage = (CrossChapterInfo)BattleChapterMsg.CrossChapterInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (CrossChapterInfo)e.getUnfinishedMessage();
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

         public CrossChapterType getType() {
            CrossChapterType result = BattleChapterMsg.CrossChapterType.valueOf(this.type_);
            return result == null ? BattleChapterMsg.CrossChapterType.CROSSCHAPTERTYPE_NEAR : result;
         }

         public Builder setType(CrossChapterType value) {
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
            this.type_ = 0;
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

         public boolean hasTime() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getTime() {
            return this.time_;
         }

         public Builder setTime(int value) {
            this.bitField0_ |= 4;
            this.time_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTime() {
            this.bitField0_ &= -5;
            this.time_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasRecordId() {
            return (this.bitField0_ & 8) != 0;
         }

         public int getRecordId() {
            return this.recordId_;
         }

         public Builder setRecordId(int value) {
            this.bitField0_ |= 8;
            this.recordId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecordId() {
            this.bitField0_ &= -9;
            this.recordId_ = 0;
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

   public static final class C2S_ChapterPassRecord_7213 extends GeneratedMessageV3 implements C2S_ChapterPassRecord_7213OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ChapterPassRecord_7213 DEFAULT_INSTANCE = new C2S_ChapterPassRecord_7213();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ChapterPassRecord_7213> PARSER = new AbstractParser<C2S_ChapterPassRecord_7213>() {
         public C2S_ChapterPassRecord_7213 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ChapterPassRecord_7213(input, extensionRegistry);
         }
      };

      private C2S_ChapterPassRecord_7213(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ChapterPassRecord_7213() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ChapterPassRecord_7213();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ChapterPassRecord_7213(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterPassRecord_7213_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterPassRecord_7213_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChapterPassRecord_7213.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ChapterPassRecord_7213)) {
            return super.equals(obj);
         } else {
            C2S_ChapterPassRecord_7213 other = (C2S_ChapterPassRecord_7213)obj;
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

      public static C2S_ChapterPassRecord_7213 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ChapterPassRecord_7213)PARSER.parseFrom(data);
      }

      public static C2S_ChapterPassRecord_7213 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChapterPassRecord_7213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChapterPassRecord_7213 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ChapterPassRecord_7213)PARSER.parseFrom(data);
      }

      public static C2S_ChapterPassRecord_7213 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChapterPassRecord_7213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChapterPassRecord_7213 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ChapterPassRecord_7213)PARSER.parseFrom(data);
      }

      public static C2S_ChapterPassRecord_7213 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChapterPassRecord_7213)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChapterPassRecord_7213 parseFrom(InputStream input) throws IOException {
         return (C2S_ChapterPassRecord_7213)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChapterPassRecord_7213 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChapterPassRecord_7213)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChapterPassRecord_7213 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ChapterPassRecord_7213)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ChapterPassRecord_7213 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChapterPassRecord_7213)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChapterPassRecord_7213 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ChapterPassRecord_7213)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChapterPassRecord_7213 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChapterPassRecord_7213)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ChapterPassRecord_7213 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ChapterPassRecord_7213 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ChapterPassRecord_7213> parser() {
         return PARSER;
      }

      public Parser<C2S_ChapterPassRecord_7213> getParserForType() {
         return PARSER;
      }

      public C2S_ChapterPassRecord_7213 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ChapterPassRecord_7213OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterPassRecord_7213_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterPassRecord_7213_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChapterPassRecord_7213.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.C2S_ChapterPassRecord_7213.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterPassRecord_7213_descriptor;
         }

         public C2S_ChapterPassRecord_7213 getDefaultInstanceForType() {
            return BattleChapterMsg.C2S_ChapterPassRecord_7213.getDefaultInstance();
         }

         public C2S_ChapterPassRecord_7213 build() {
            C2S_ChapterPassRecord_7213 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ChapterPassRecord_7213 buildPartial() {
            C2S_ChapterPassRecord_7213 result = new C2S_ChapterPassRecord_7213(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ChapterPassRecord_7213) {
               return this.mergeFrom((C2S_ChapterPassRecord_7213)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ChapterPassRecord_7213 other) {
            if (other == BattleChapterMsg.C2S_ChapterPassRecord_7213.getDefaultInstance()) {
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
            C2S_ChapterPassRecord_7213 parsedMessage = null;

            try {
               parsedMessage = (C2S_ChapterPassRecord_7213)BattleChapterMsg.C2S_ChapterPassRecord_7213.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ChapterPassRecord_7213)e.getUnfinishedMessage();
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

   public static final class S2C_ChapterPassRecordResult_7214 extends GeneratedMessageV3 implements S2C_ChapterPassRecordResult_7214OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int CHAPTERID_FIELD_NUMBER = 1;
      private int chapterId_;
      public static final int INFOS_FIELD_NUMBER = 2;
      private List<CrossChapterInfo> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_ChapterPassRecordResult_7214 DEFAULT_INSTANCE = new S2C_ChapterPassRecordResult_7214();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ChapterPassRecordResult_7214> PARSER = new AbstractParser<S2C_ChapterPassRecordResult_7214>() {
         public S2C_ChapterPassRecordResult_7214 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ChapterPassRecordResult_7214(input, extensionRegistry);
         }
      };

      private S2C_ChapterPassRecordResult_7214(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ChapterPassRecordResult_7214() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ChapterPassRecordResult_7214();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ChapterPassRecordResult_7214(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.chapterId_ = input.readInt32();
                        break;
                     case 18:
                        if ((mutable_bitField0_ & 2) == 0) {
                           this.infos_ = new ArrayList();
                           mutable_bitField0_ |= 2;
                        }

                        this.infos_.add(input.readMessage(BattleChapterMsg.CrossChapterInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterPassRecordResult_7214_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterPassRecordResult_7214_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChapterPassRecordResult_7214.class, Builder.class);
      }

      public boolean hasChapterId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getChapterId() {
         return this.chapterId_;
      }

      public List<CrossChapterInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends CrossChapterInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public CrossChapterInfo getInfos(int index) {
         return (CrossChapterInfo)this.infos_.get(index);
      }

      public CrossChapterInfoOrBuilder getInfosOrBuilder(int index) {
         return (CrossChapterInfoOrBuilder)this.infos_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasChapterId()) {
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
            output.writeInt32(1, this.chapterId_);
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
               size += CodedOutputStream.computeInt32Size(1, this.chapterId_);
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
         } else if (!(obj instanceof S2C_ChapterPassRecordResult_7214)) {
            return super.equals(obj);
         } else {
            S2C_ChapterPassRecordResult_7214 other = (S2C_ChapterPassRecordResult_7214)obj;
            if (this.hasChapterId() != other.hasChapterId()) {
               return false;
            } else if (this.hasChapterId() && this.getChapterId() != other.getChapterId()) {
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
            if (this.hasChapterId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getChapterId();
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

      public static S2C_ChapterPassRecordResult_7214 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ChapterPassRecordResult_7214)PARSER.parseFrom(data);
      }

      public static S2C_ChapterPassRecordResult_7214 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChapterPassRecordResult_7214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChapterPassRecordResult_7214 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ChapterPassRecordResult_7214)PARSER.parseFrom(data);
      }

      public static S2C_ChapterPassRecordResult_7214 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChapterPassRecordResult_7214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChapterPassRecordResult_7214 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ChapterPassRecordResult_7214)PARSER.parseFrom(data);
      }

      public static S2C_ChapterPassRecordResult_7214 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChapterPassRecordResult_7214)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChapterPassRecordResult_7214 parseFrom(InputStream input) throws IOException {
         return (S2C_ChapterPassRecordResult_7214)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChapterPassRecordResult_7214 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChapterPassRecordResult_7214)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChapterPassRecordResult_7214 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ChapterPassRecordResult_7214)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ChapterPassRecordResult_7214 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChapterPassRecordResult_7214)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChapterPassRecordResult_7214 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ChapterPassRecordResult_7214)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChapterPassRecordResult_7214 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChapterPassRecordResult_7214)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ChapterPassRecordResult_7214 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ChapterPassRecordResult_7214 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ChapterPassRecordResult_7214> parser() {
         return PARSER;
      }

      public Parser<S2C_ChapterPassRecordResult_7214> getParserForType() {
         return PARSER;
      }

      public S2C_ChapterPassRecordResult_7214 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ChapterPassRecordResult_7214OrBuilder {
         private int bitField0_;
         private int chapterId_;
         private List<CrossChapterInfo> infos_;
         private RepeatedFieldBuilderV3<CrossChapterInfo, CrossChapterInfo.Builder, CrossChapterInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterPassRecordResult_7214_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterPassRecordResult_7214_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChapterPassRecordResult_7214.class, Builder.class);
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
            if (BattleChapterMsg.S2C_ChapterPassRecordResult_7214.alwaysUseFieldBuilders) {
               this.getInfosFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.chapterId_ = 0;
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
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterPassRecordResult_7214_descriptor;
         }

         public S2C_ChapterPassRecordResult_7214 getDefaultInstanceForType() {
            return BattleChapterMsg.S2C_ChapterPassRecordResult_7214.getDefaultInstance();
         }

         public S2C_ChapterPassRecordResult_7214 build() {
            S2C_ChapterPassRecordResult_7214 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ChapterPassRecordResult_7214 buildPartial() {
            S2C_ChapterPassRecordResult_7214 result = new S2C_ChapterPassRecordResult_7214(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.chapterId_ = this.chapterId_;
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
            if (other instanceof S2C_ChapterPassRecordResult_7214) {
               return this.mergeFrom((S2C_ChapterPassRecordResult_7214)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ChapterPassRecordResult_7214 other) {
            if (other == BattleChapterMsg.S2C_ChapterPassRecordResult_7214.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasChapterId()) {
                  this.setChapterId(other.getChapterId());
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
                     this.infosBuilder_ = BattleChapterMsg.S2C_ChapterPassRecordResult_7214.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
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
            if (!this.hasChapterId()) {
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
            S2C_ChapterPassRecordResult_7214 parsedMessage = null;

            try {
               parsedMessage = (S2C_ChapterPassRecordResult_7214)BattleChapterMsg.S2C_ChapterPassRecordResult_7214.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ChapterPassRecordResult_7214)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasChapterId() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getChapterId() {
            return this.chapterId_;
         }

         public Builder setChapterId(int value) {
            this.bitField0_ |= 1;
            this.chapterId_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearChapterId() {
            this.bitField0_ &= -2;
            this.chapterId_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureInfosIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.infos_ = new ArrayList(this.infos_);
               this.bitField0_ |= 2;
            }

         }

         public List<CrossChapterInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public CrossChapterInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (CrossChapterInfo)this.infos_.get(index) : (CrossChapterInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, CrossChapterInfo value) {
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

         public Builder setInfos(int index, CrossChapterInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(CrossChapterInfo value) {
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

         public Builder addInfos(int index, CrossChapterInfo value) {
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

         public Builder addInfos(CrossChapterInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, CrossChapterInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends CrossChapterInfo> values) {
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

         public CrossChapterInfo.Builder getInfosBuilder(int index) {
            return (CrossChapterInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public CrossChapterInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (CrossChapterInfoOrBuilder)this.infos_.get(index) : (CrossChapterInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CrossChapterInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public CrossChapterInfo.Builder addInfosBuilder() {
            return (CrossChapterInfo.Builder)this.getInfosFieldBuilder().addBuilder(BattleChapterMsg.CrossChapterInfo.getDefaultInstance());
         }

         public CrossChapterInfo.Builder addInfosBuilder(int index) {
            return (CrossChapterInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, BattleChapterMsg.CrossChapterInfo.getDefaultInstance());
         }

         public List<CrossChapterInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CrossChapterInfo, CrossChapterInfo.Builder, CrossChapterInfoOrBuilder> getInfosFieldBuilder() {
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

   public static final class C2S_TakeCommonAward_7217 extends GeneratedMessageV3 implements C2S_TakeCommonAward_7217OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      public static final int GUIDESTEP_FIELD_NUMBER = 2;
      private int guideStep_;
      private byte memoizedIsInitialized;
      private static final C2S_TakeCommonAward_7217 DEFAULT_INSTANCE = new C2S_TakeCommonAward_7217();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TakeCommonAward_7217> PARSER = new AbstractParser<C2S_TakeCommonAward_7217>() {
         public C2S_TakeCommonAward_7217 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TakeCommonAward_7217(input, extensionRegistry);
         }
      };

      private C2S_TakeCommonAward_7217(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TakeCommonAward_7217() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TakeCommonAward_7217();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TakeCommonAward_7217(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeCommonAward_7217_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeCommonAward_7217_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeCommonAward_7217.class, Builder.class);
      }

      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getId() {
         return this.id_;
      }

      public boolean hasGuideStep() {
         return (this.bitField0_ & 2) != 0;
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

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.guideStep_);
         }

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
               size += CodedOutputStream.computeInt32Size(2, this.guideStep_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_TakeCommonAward_7217)) {
            return super.equals(obj);
         } else {
            C2S_TakeCommonAward_7217 other = (C2S_TakeCommonAward_7217)obj;
            if (this.hasId() != other.hasId()) {
               return false;
            } else if (this.hasId() && this.getId() != other.getId()) {
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
            if (this.hasId()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getId();
            }

            if (this.hasGuideStep()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getGuideStep();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_TakeCommonAward_7217 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TakeCommonAward_7217)PARSER.parseFrom(data);
      }

      public static C2S_TakeCommonAward_7217 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeCommonAward_7217)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeCommonAward_7217 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TakeCommonAward_7217)PARSER.parseFrom(data);
      }

      public static C2S_TakeCommonAward_7217 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeCommonAward_7217)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeCommonAward_7217 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TakeCommonAward_7217)PARSER.parseFrom(data);
      }

      public static C2S_TakeCommonAward_7217 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeCommonAward_7217)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeCommonAward_7217 parseFrom(InputStream input) throws IOException {
         return (C2S_TakeCommonAward_7217)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeCommonAward_7217 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeCommonAward_7217)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeCommonAward_7217 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TakeCommonAward_7217)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TakeCommonAward_7217 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeCommonAward_7217)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeCommonAward_7217 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TakeCommonAward_7217)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeCommonAward_7217 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeCommonAward_7217)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TakeCommonAward_7217 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TakeCommonAward_7217 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TakeCommonAward_7217> parser() {
         return PARSER;
      }

      public Parser<C2S_TakeCommonAward_7217> getParserForType() {
         return PARSER;
      }

      public C2S_TakeCommonAward_7217 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TakeCommonAward_7217OrBuilder {
         private int bitField0_;
         private int id_;
         private int guideStep_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeCommonAward_7217_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeCommonAward_7217_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeCommonAward_7217.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.C2S_TakeCommonAward_7217.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            this.guideStep_ = 0;
            this.bitField0_ &= -3;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeCommonAward_7217_descriptor;
         }

         public C2S_TakeCommonAward_7217 getDefaultInstanceForType() {
            return BattleChapterMsg.C2S_TakeCommonAward_7217.getDefaultInstance();
         }

         public C2S_TakeCommonAward_7217 build() {
            C2S_TakeCommonAward_7217 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TakeCommonAward_7217 buildPartial() {
            C2S_TakeCommonAward_7217 result = new C2S_TakeCommonAward_7217(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.id_ = this.id_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.guideStep_ = this.guideStep_;
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
            if (other instanceof C2S_TakeCommonAward_7217) {
               return this.mergeFrom((C2S_TakeCommonAward_7217)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TakeCommonAward_7217 other) {
            if (other == BattleChapterMsg.C2S_TakeCommonAward_7217.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasId()) {
                  this.setId(other.getId());
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
            return this.hasId();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            C2S_TakeCommonAward_7217 parsedMessage = null;

            try {
               parsedMessage = (C2S_TakeCommonAward_7217)BattleChapterMsg.C2S_TakeCommonAward_7217.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TakeCommonAward_7217)e.getUnfinishedMessage();
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

         public boolean hasGuideStep() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getGuideStep() {
            return this.guideStep_;
         }

         public Builder setGuideStep(int value) {
            this.bitField0_ |= 2;
            this.guideStep_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGuideStep() {
            this.bitField0_ &= -3;
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

   public static final class S2C_CommonAwardId_7218 extends GeneratedMessageV3 implements S2C_CommonAwardId_7218OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int IDS_FIELD_NUMBER = 1;
      private Internal.IntList ids_;
      private byte memoizedIsInitialized;
      private static final S2C_CommonAwardId_7218 DEFAULT_INSTANCE = new S2C_CommonAwardId_7218();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_CommonAwardId_7218> PARSER = new AbstractParser<S2C_CommonAwardId_7218>() {
         public S2C_CommonAwardId_7218 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_CommonAwardId_7218(input, extensionRegistry);
         }
      };

      private S2C_CommonAwardId_7218(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_CommonAwardId_7218() {
         this.memoizedIsInitialized = -1;
         this.ids_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_CommonAwardId_7218();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_CommonAwardId_7218(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                           this.ids_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.ids_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.ids_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.ids_.addInt(input.readInt32());
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
                  this.ids_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_CommonAwardId_7218_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_CommonAwardId_7218_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommonAwardId_7218.class, Builder.class);
      }

      public List<Integer> getIdsList() {
         return this.ids_;
      }

      public int getIdsCount() {
         return this.ids_.size();
      }

      public int getIds(int index) {
         return this.ids_.getInt(index);
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
         for(int i = 0; i < this.ids_.size(); ++i) {
            output.writeInt32(1, this.ids_.getInt(i));
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

            for(int i = 0; i < this.ids_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.ids_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_CommonAwardId_7218)) {
            return super.equals(obj);
         } else {
            S2C_CommonAwardId_7218 other = (S2C_CommonAwardId_7218)obj;
            if (!this.getIdsList().equals(other.getIdsList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getIdsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_CommonAwardId_7218 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_CommonAwardId_7218)PARSER.parseFrom(data);
      }

      public static S2C_CommonAwardId_7218 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommonAwardId_7218)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommonAwardId_7218 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_CommonAwardId_7218)PARSER.parseFrom(data);
      }

      public static S2C_CommonAwardId_7218 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommonAwardId_7218)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommonAwardId_7218 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_CommonAwardId_7218)PARSER.parseFrom(data);
      }

      public static S2C_CommonAwardId_7218 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_CommonAwardId_7218)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_CommonAwardId_7218 parseFrom(InputStream input) throws IOException {
         return (S2C_CommonAwardId_7218)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommonAwardId_7218 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommonAwardId_7218)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommonAwardId_7218 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_CommonAwardId_7218)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_CommonAwardId_7218 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommonAwardId_7218)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_CommonAwardId_7218 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_CommonAwardId_7218)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_CommonAwardId_7218 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_CommonAwardId_7218)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_CommonAwardId_7218 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_CommonAwardId_7218 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_CommonAwardId_7218> parser() {
         return PARSER;
      }

      public Parser<S2C_CommonAwardId_7218> getParserForType() {
         return PARSER;
      }

      public S2C_CommonAwardId_7218 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_CommonAwardId_7218OrBuilder {
         private int bitField0_;
         private Internal.IntList ids_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_CommonAwardId_7218_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_CommonAwardId_7218_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_CommonAwardId_7218.class, Builder.class);
         }

         private Builder() {
            this.ids_ = BattleChapterMsg.S2C_CommonAwardId_7218.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.ids_ = BattleChapterMsg.S2C_CommonAwardId_7218.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.S2C_CommonAwardId_7218.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.ids_ = BattleChapterMsg.S2C_CommonAwardId_7218.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_CommonAwardId_7218_descriptor;
         }

         public S2C_CommonAwardId_7218 getDefaultInstanceForType() {
            return BattleChapterMsg.S2C_CommonAwardId_7218.getDefaultInstance();
         }

         public S2C_CommonAwardId_7218 build() {
            S2C_CommonAwardId_7218 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_CommonAwardId_7218 buildPartial() {
            S2C_CommonAwardId_7218 result = new S2C_CommonAwardId_7218(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.ids_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.ids_ = this.ids_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_CommonAwardId_7218) {
               return this.mergeFrom((S2C_CommonAwardId_7218)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_CommonAwardId_7218 other) {
            if (other == BattleChapterMsg.S2C_CommonAwardId_7218.getDefaultInstance()) {
               return this;
            } else {
               if (!other.ids_.isEmpty()) {
                  if (this.ids_.isEmpty()) {
                     this.ids_ = other.ids_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureIdsIsMutable();
                     this.ids_.addAll(other.ids_);
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
            S2C_CommonAwardId_7218 parsedMessage = null;

            try {
               parsedMessage = (S2C_CommonAwardId_7218)BattleChapterMsg.S2C_CommonAwardId_7218.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_CommonAwardId_7218)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureIdsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.ids_ = BattleChapterMsg.S2C_CommonAwardId_7218.mutableCopy(this.ids_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getIdsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.ids_) : this.ids_);
         }

         public int getIdsCount() {
            return this.ids_.size();
         }

         public int getIds(int index) {
            return this.ids_.getInt(index);
         }

         public Builder setIds(int index, int value) {
            this.ensureIdsIsMutable();
            this.ids_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addIds(int value) {
            this.ensureIdsIsMutable();
            this.ids_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllIds(Iterable<? extends Integer> values) {
            this.ensureIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.ids_);
            this.onChanged();
            return this;
         }

         public Builder clearIds() {
            this.ids_ = BattleChapterMsg.S2C_CommonAwardId_7218.emptyIntList();
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

   public static final class C2S_TakeBonusAwardId_7219 extends GeneratedMessageV3 implements C2S_TakeBonusAwardId_7219OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_TakeBonusAwardId_7219 DEFAULT_INSTANCE = new C2S_TakeBonusAwardId_7219();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TakeBonusAwardId_7219> PARSER = new AbstractParser<C2S_TakeBonusAwardId_7219>() {
         public C2S_TakeBonusAwardId_7219 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TakeBonusAwardId_7219(input, extensionRegistry);
         }
      };

      private C2S_TakeBonusAwardId_7219(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TakeBonusAwardId_7219() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TakeBonusAwardId_7219();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TakeBonusAwardId_7219(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeBonusAwardId_7219_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeBonusAwardId_7219_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeBonusAwardId_7219.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TakeBonusAwardId_7219)) {
            return super.equals(obj);
         } else {
            C2S_TakeBonusAwardId_7219 other = (C2S_TakeBonusAwardId_7219)obj;
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

      public static C2S_TakeBonusAwardId_7219 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TakeBonusAwardId_7219)PARSER.parseFrom(data);
      }

      public static C2S_TakeBonusAwardId_7219 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeBonusAwardId_7219)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeBonusAwardId_7219 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TakeBonusAwardId_7219)PARSER.parseFrom(data);
      }

      public static C2S_TakeBonusAwardId_7219 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeBonusAwardId_7219)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeBonusAwardId_7219 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TakeBonusAwardId_7219)PARSER.parseFrom(data);
      }

      public static C2S_TakeBonusAwardId_7219 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeBonusAwardId_7219)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeBonusAwardId_7219 parseFrom(InputStream input) throws IOException {
         return (C2S_TakeBonusAwardId_7219)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeBonusAwardId_7219 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeBonusAwardId_7219)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeBonusAwardId_7219 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TakeBonusAwardId_7219)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TakeBonusAwardId_7219 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeBonusAwardId_7219)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeBonusAwardId_7219 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TakeBonusAwardId_7219)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeBonusAwardId_7219 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeBonusAwardId_7219)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TakeBonusAwardId_7219 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TakeBonusAwardId_7219 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TakeBonusAwardId_7219> parser() {
         return PARSER;
      }

      public Parser<C2S_TakeBonusAwardId_7219> getParserForType() {
         return PARSER;
      }

      public C2S_TakeBonusAwardId_7219 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TakeBonusAwardId_7219OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeBonusAwardId_7219_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeBonusAwardId_7219_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeBonusAwardId_7219.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.C2S_TakeBonusAwardId_7219.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeBonusAwardId_7219_descriptor;
         }

         public C2S_TakeBonusAwardId_7219 getDefaultInstanceForType() {
            return BattleChapterMsg.C2S_TakeBonusAwardId_7219.getDefaultInstance();
         }

         public C2S_TakeBonusAwardId_7219 build() {
            C2S_TakeBonusAwardId_7219 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TakeBonusAwardId_7219 buildPartial() {
            C2S_TakeBonusAwardId_7219 result = new C2S_TakeBonusAwardId_7219(this);
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
            if (other instanceof C2S_TakeBonusAwardId_7219) {
               return this.mergeFrom((C2S_TakeBonusAwardId_7219)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TakeBonusAwardId_7219 other) {
            if (other == BattleChapterMsg.C2S_TakeBonusAwardId_7219.getDefaultInstance()) {
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
            C2S_TakeBonusAwardId_7219 parsedMessage = null;

            try {
               parsedMessage = (C2S_TakeBonusAwardId_7219)BattleChapterMsg.C2S_TakeBonusAwardId_7219.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TakeBonusAwardId_7219)e.getUnfinishedMessage();
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

   public static final class S2C_BonusAwardsId_7220 extends GeneratedMessageV3 implements S2C_BonusAwardsId_7220OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int IDS_FIELD_NUMBER = 1;
      private Internal.IntList ids_;
      private byte memoizedIsInitialized;
      private static final S2C_BonusAwardsId_7220 DEFAULT_INSTANCE = new S2C_BonusAwardsId_7220();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_BonusAwardsId_7220> PARSER = new AbstractParser<S2C_BonusAwardsId_7220>() {
         public S2C_BonusAwardsId_7220 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_BonusAwardsId_7220(input, extensionRegistry);
         }
      };

      private S2C_BonusAwardsId_7220(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_BonusAwardsId_7220() {
         this.memoizedIsInitialized = -1;
         this.ids_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_BonusAwardsId_7220();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_BonusAwardsId_7220(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                           this.ids_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        this.ids_.addInt(input.readInt32());
                        break;
                     case 10:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 1) == 0 && input.getBytesUntilLimit() > 0) {
                           this.ids_ = newIntList();
                           mutable_bitField0_ |= 1;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.ids_.addInt(input.readInt32());
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
                  this.ids_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_BonusAwardsId_7220_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_BonusAwardsId_7220_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BonusAwardsId_7220.class, Builder.class);
      }

      public List<Integer> getIdsList() {
         return this.ids_;
      }

      public int getIdsCount() {
         return this.ids_.size();
      }

      public int getIds(int index) {
         return this.ids_.getInt(index);
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
         for(int i = 0; i < this.ids_.size(); ++i) {
            output.writeInt32(1, this.ids_.getInt(i));
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

            for(int i = 0; i < this.ids_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.ids_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_BonusAwardsId_7220)) {
            return super.equals(obj);
         } else {
            S2C_BonusAwardsId_7220 other = (S2C_BonusAwardsId_7220)obj;
            if (!this.getIdsList().equals(other.getIdsList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getIdsCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_BonusAwardsId_7220 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_BonusAwardsId_7220)PARSER.parseFrom(data);
      }

      public static S2C_BonusAwardsId_7220 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BonusAwardsId_7220)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BonusAwardsId_7220 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_BonusAwardsId_7220)PARSER.parseFrom(data);
      }

      public static S2C_BonusAwardsId_7220 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BonusAwardsId_7220)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BonusAwardsId_7220 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_BonusAwardsId_7220)PARSER.parseFrom(data);
      }

      public static S2C_BonusAwardsId_7220 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_BonusAwardsId_7220)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_BonusAwardsId_7220 parseFrom(InputStream input) throws IOException {
         return (S2C_BonusAwardsId_7220)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BonusAwardsId_7220 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BonusAwardsId_7220)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BonusAwardsId_7220 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_BonusAwardsId_7220)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_BonusAwardsId_7220 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BonusAwardsId_7220)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_BonusAwardsId_7220 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_BonusAwardsId_7220)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_BonusAwardsId_7220 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_BonusAwardsId_7220)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_BonusAwardsId_7220 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_BonusAwardsId_7220 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_BonusAwardsId_7220> parser() {
         return PARSER;
      }

      public Parser<S2C_BonusAwardsId_7220> getParserForType() {
         return PARSER;
      }

      public S2C_BonusAwardsId_7220 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_BonusAwardsId_7220OrBuilder {
         private int bitField0_;
         private Internal.IntList ids_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_BonusAwardsId_7220_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_BonusAwardsId_7220_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_BonusAwardsId_7220.class, Builder.class);
         }

         private Builder() {
            this.ids_ = BattleChapterMsg.S2C_BonusAwardsId_7220.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.ids_ = BattleChapterMsg.S2C_BonusAwardsId_7220.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.S2C_BonusAwardsId_7220.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.ids_ = BattleChapterMsg.S2C_BonusAwardsId_7220.emptyIntList();
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_BonusAwardsId_7220_descriptor;
         }

         public S2C_BonusAwardsId_7220 getDefaultInstanceForType() {
            return BattleChapterMsg.S2C_BonusAwardsId_7220.getDefaultInstance();
         }

         public S2C_BonusAwardsId_7220 build() {
            S2C_BonusAwardsId_7220 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_BonusAwardsId_7220 buildPartial() {
            S2C_BonusAwardsId_7220 result = new S2C_BonusAwardsId_7220(this);
            int from_bitField0_ = this.bitField0_;
            if ((this.bitField0_ & 1) != 0) {
               this.ids_.makeImmutable();
               this.bitField0_ &= -2;
            }

            result.ids_ = this.ids_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_BonusAwardsId_7220) {
               return this.mergeFrom((S2C_BonusAwardsId_7220)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_BonusAwardsId_7220 other) {
            if (other == BattleChapterMsg.S2C_BonusAwardsId_7220.getDefaultInstance()) {
               return this;
            } else {
               if (!other.ids_.isEmpty()) {
                  if (this.ids_.isEmpty()) {
                     this.ids_ = other.ids_;
                     this.bitField0_ &= -2;
                  } else {
                     this.ensureIdsIsMutable();
                     this.ids_.addAll(other.ids_);
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
            S2C_BonusAwardsId_7220 parsedMessage = null;

            try {
               parsedMessage = (S2C_BonusAwardsId_7220)BattleChapterMsg.S2C_BonusAwardsId_7220.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_BonusAwardsId_7220)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureIdsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.ids_ = BattleChapterMsg.S2C_BonusAwardsId_7220.mutableCopy(this.ids_);
               this.bitField0_ |= 1;
            }

         }

         public List<Integer> getIdsList() {
            return (List<Integer>)((this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.ids_) : this.ids_);
         }

         public int getIdsCount() {
            return this.ids_.size();
         }

         public int getIds(int index) {
            return this.ids_.getInt(index);
         }

         public Builder setIds(int index, int value) {
            this.ensureIdsIsMutable();
            this.ids_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addIds(int value) {
            this.ensureIdsIsMutable();
            this.ids_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllIds(Iterable<? extends Integer> values) {
            this.ensureIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.ids_);
            this.onChanged();
            return this;
         }

         public Builder clearIds() {
            this.ids_ = BattleChapterMsg.S2C_BonusAwardsId_7220.emptyIntList();
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

   public static final class C2S_TakeOnlineTimeAward_7221 extends GeneratedMessageV3 implements C2S_TakeOnlineTimeAward_7221OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int ID_FIELD_NUMBER = 1;
      private int id_;
      private byte memoizedIsInitialized;
      private static final C2S_TakeOnlineTimeAward_7221 DEFAULT_INSTANCE = new C2S_TakeOnlineTimeAward_7221();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_TakeOnlineTimeAward_7221> PARSER = new AbstractParser<C2S_TakeOnlineTimeAward_7221>() {
         public C2S_TakeOnlineTimeAward_7221 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_TakeOnlineTimeAward_7221(input, extensionRegistry);
         }
      };

      private C2S_TakeOnlineTimeAward_7221(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_TakeOnlineTimeAward_7221() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_TakeOnlineTimeAward_7221();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_TakeOnlineTimeAward_7221(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeOnlineTimeAward_7221_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeOnlineTimeAward_7221_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeOnlineTimeAward_7221.class, Builder.class);
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
         } else if (!(obj instanceof C2S_TakeOnlineTimeAward_7221)) {
            return super.equals(obj);
         } else {
            C2S_TakeOnlineTimeAward_7221 other = (C2S_TakeOnlineTimeAward_7221)obj;
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

      public static C2S_TakeOnlineTimeAward_7221 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_TakeOnlineTimeAward_7221)PARSER.parseFrom(data);
      }

      public static C2S_TakeOnlineTimeAward_7221 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeOnlineTimeAward_7221)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeOnlineTimeAward_7221 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_TakeOnlineTimeAward_7221)PARSER.parseFrom(data);
      }

      public static C2S_TakeOnlineTimeAward_7221 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeOnlineTimeAward_7221)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeOnlineTimeAward_7221 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_TakeOnlineTimeAward_7221)PARSER.parseFrom(data);
      }

      public static C2S_TakeOnlineTimeAward_7221 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_TakeOnlineTimeAward_7221)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_TakeOnlineTimeAward_7221 parseFrom(InputStream input) throws IOException {
         return (C2S_TakeOnlineTimeAward_7221)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeOnlineTimeAward_7221 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeOnlineTimeAward_7221)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeOnlineTimeAward_7221 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_TakeOnlineTimeAward_7221)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_TakeOnlineTimeAward_7221 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeOnlineTimeAward_7221)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_TakeOnlineTimeAward_7221 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_TakeOnlineTimeAward_7221)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_TakeOnlineTimeAward_7221 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_TakeOnlineTimeAward_7221)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_TakeOnlineTimeAward_7221 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_TakeOnlineTimeAward_7221 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_TakeOnlineTimeAward_7221> parser() {
         return PARSER;
      }

      public Parser<C2S_TakeOnlineTimeAward_7221> getParserForType() {
         return PARSER;
      }

      public C2S_TakeOnlineTimeAward_7221 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_TakeOnlineTimeAward_7221OrBuilder {
         private int bitField0_;
         private int id_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeOnlineTimeAward_7221_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeOnlineTimeAward_7221_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_TakeOnlineTimeAward_7221.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.C2S_TakeOnlineTimeAward_7221.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.id_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_TakeOnlineTimeAward_7221_descriptor;
         }

         public C2S_TakeOnlineTimeAward_7221 getDefaultInstanceForType() {
            return BattleChapterMsg.C2S_TakeOnlineTimeAward_7221.getDefaultInstance();
         }

         public C2S_TakeOnlineTimeAward_7221 build() {
            C2S_TakeOnlineTimeAward_7221 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_TakeOnlineTimeAward_7221 buildPartial() {
            C2S_TakeOnlineTimeAward_7221 result = new C2S_TakeOnlineTimeAward_7221(this);
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
            if (other instanceof C2S_TakeOnlineTimeAward_7221) {
               return this.mergeFrom((C2S_TakeOnlineTimeAward_7221)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_TakeOnlineTimeAward_7221 other) {
            if (other == BattleChapterMsg.C2S_TakeOnlineTimeAward_7221.getDefaultInstance()) {
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
            C2S_TakeOnlineTimeAward_7221 parsedMessage = null;

            try {
               parsedMessage = (C2S_TakeOnlineTimeAward_7221)BattleChapterMsg.C2S_TakeOnlineTimeAward_7221.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_TakeOnlineTimeAward_7221)e.getUnfinishedMessage();
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

   public static final class S2C_TakeOnlineTimeAwardResult_7222 extends GeneratedMessageV3 implements S2C_TakeOnlineTimeAwardResult_7222OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int RECORDTIME_FIELD_NUMBER = 1;
      private int recordTime_;
      public static final int TIME_FIELD_NUMBER = 2;
      private int time_;
      public static final int AWARDIDS_FIELD_NUMBER = 3;
      private Internal.IntList awardIds_;
      private byte memoizedIsInitialized;
      private static final S2C_TakeOnlineTimeAwardResult_7222 DEFAULT_INSTANCE = new S2C_TakeOnlineTimeAwardResult_7222();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_TakeOnlineTimeAwardResult_7222> PARSER = new AbstractParser<S2C_TakeOnlineTimeAwardResult_7222>() {
         public S2C_TakeOnlineTimeAwardResult_7222 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_TakeOnlineTimeAwardResult_7222(input, extensionRegistry);
         }
      };

      private S2C_TakeOnlineTimeAwardResult_7222(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_TakeOnlineTimeAwardResult_7222() {
         this.memoizedIsInitialized = -1;
         this.awardIds_ = emptyIntList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_TakeOnlineTimeAwardResult_7222();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_TakeOnlineTimeAwardResult_7222(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.recordTime_ = input.readInt32();
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.time_ = input.readInt32();
                        break;
                     case 24:
                        if ((mutable_bitField0_ & 4) == 0) {
                           this.awardIds_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        this.awardIds_.addInt(input.readInt32());
                        break;
                     case 26:
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if ((mutable_bitField0_ & 4) == 0 && input.getBytesUntilLimit() > 0) {
                           this.awardIds_ = newIntList();
                           mutable_bitField0_ |= 4;
                        }

                        while(input.getBytesUntilLimit() > 0) {
                           this.awardIds_.addInt(input.readInt32());
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
                  this.awardIds_.makeImmutable();
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_TakeOnlineTimeAwardResult_7222_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_TakeOnlineTimeAwardResult_7222_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeOnlineTimeAwardResult_7222.class, Builder.class);
      }

      public boolean hasRecordTime() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getRecordTime() {
         return this.recordTime_;
      }

      public boolean hasTime() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getTime() {
         return this.time_;
      }

      public List<Integer> getAwardIdsList() {
         return this.awardIds_;
      }

      public int getAwardIdsCount() {
         return this.awardIds_.size();
      }

      public int getAwardIds(int index) {
         return this.awardIds_.getInt(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else if (!this.hasRecordTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasTime()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.recordTime_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.time_);
         }

         for(int i = 0; i < this.awardIds_.size(); ++i) {
            output.writeInt32(3, this.awardIds_.getInt(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.recordTime_);
            }

            if ((this.bitField0_ & 2) != 0) {
               size += CodedOutputStream.computeInt32Size(2, this.time_);
            }

            int dataSize = 0;

            for(int i = 0; i < this.awardIds_.size(); ++i) {
               dataSize += CodedOutputStream.computeInt32SizeNoTag(this.awardIds_.getInt(i));
            }

            size += dataSize;
            size += 1 * this.getAwardIdsList().size();
            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_TakeOnlineTimeAwardResult_7222)) {
            return super.equals(obj);
         } else {
            S2C_TakeOnlineTimeAwardResult_7222 other = (S2C_TakeOnlineTimeAwardResult_7222)obj;
            if (this.hasRecordTime() != other.hasRecordTime()) {
               return false;
            } else if (this.hasRecordTime() && this.getRecordTime() != other.getRecordTime()) {
               return false;
            } else if (this.hasTime() != other.hasTime()) {
               return false;
            } else if (this.hasTime() && this.getTime() != other.getTime()) {
               return false;
            } else if (!this.getAwardIdsList().equals(other.getAwardIdsList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasRecordTime()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getRecordTime();
            }

            if (this.hasTime()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getTime();
            }

            if (this.getAwardIdsCount() > 0) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getAwardIdsList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_TakeOnlineTimeAwardResult_7222 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_TakeOnlineTimeAwardResult_7222)PARSER.parseFrom(data);
      }

      public static S2C_TakeOnlineTimeAwardResult_7222 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeOnlineTimeAwardResult_7222)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeOnlineTimeAwardResult_7222 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_TakeOnlineTimeAwardResult_7222)PARSER.parseFrom(data);
      }

      public static S2C_TakeOnlineTimeAwardResult_7222 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeOnlineTimeAwardResult_7222)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeOnlineTimeAwardResult_7222 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_TakeOnlineTimeAwardResult_7222)PARSER.parseFrom(data);
      }

      public static S2C_TakeOnlineTimeAwardResult_7222 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_TakeOnlineTimeAwardResult_7222)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_TakeOnlineTimeAwardResult_7222 parseFrom(InputStream input) throws IOException {
         return (S2C_TakeOnlineTimeAwardResult_7222)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeOnlineTimeAwardResult_7222 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeOnlineTimeAwardResult_7222)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeOnlineTimeAwardResult_7222 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_TakeOnlineTimeAwardResult_7222)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_TakeOnlineTimeAwardResult_7222 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeOnlineTimeAwardResult_7222)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_TakeOnlineTimeAwardResult_7222 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_TakeOnlineTimeAwardResult_7222)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_TakeOnlineTimeAwardResult_7222 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_TakeOnlineTimeAwardResult_7222)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_TakeOnlineTimeAwardResult_7222 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_TakeOnlineTimeAwardResult_7222 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_TakeOnlineTimeAwardResult_7222> parser() {
         return PARSER;
      }

      public Parser<S2C_TakeOnlineTimeAwardResult_7222> getParserForType() {
         return PARSER;
      }

      public S2C_TakeOnlineTimeAwardResult_7222 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_TakeOnlineTimeAwardResult_7222OrBuilder {
         private int bitField0_;
         private int recordTime_;
         private int time_;
         private Internal.IntList awardIds_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_TakeOnlineTimeAwardResult_7222_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_TakeOnlineTimeAwardResult_7222_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_TakeOnlineTimeAwardResult_7222.class, Builder.class);
         }

         private Builder() {
            this.awardIds_ = BattleChapterMsg.S2C_TakeOnlineTimeAwardResult_7222.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.awardIds_ = BattleChapterMsg.S2C_TakeOnlineTimeAwardResult_7222.emptyIntList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.S2C_TakeOnlineTimeAwardResult_7222.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.recordTime_ = 0;
            this.bitField0_ &= -2;
            this.time_ = 0;
            this.bitField0_ &= -3;
            this.awardIds_ = BattleChapterMsg.S2C_TakeOnlineTimeAwardResult_7222.emptyIntList();
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_TakeOnlineTimeAwardResult_7222_descriptor;
         }

         public S2C_TakeOnlineTimeAwardResult_7222 getDefaultInstanceForType() {
            return BattleChapterMsg.S2C_TakeOnlineTimeAwardResult_7222.getDefaultInstance();
         }

         public S2C_TakeOnlineTimeAwardResult_7222 build() {
            S2C_TakeOnlineTimeAwardResult_7222 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_TakeOnlineTimeAwardResult_7222 buildPartial() {
            S2C_TakeOnlineTimeAwardResult_7222 result = new S2C_TakeOnlineTimeAwardResult_7222(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.recordTime_ = this.recordTime_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.time_ = this.time_;
               to_bitField0_ |= 2;
            }

            if ((this.bitField0_ & 4) != 0) {
               this.awardIds_.makeImmutable();
               this.bitField0_ &= -5;
            }

            result.awardIds_ = this.awardIds_;
            result.bitField0_ = to_bitField0_;
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof S2C_TakeOnlineTimeAwardResult_7222) {
               return this.mergeFrom((S2C_TakeOnlineTimeAwardResult_7222)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_TakeOnlineTimeAwardResult_7222 other) {
            if (other == BattleChapterMsg.S2C_TakeOnlineTimeAwardResult_7222.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasRecordTime()) {
                  this.setRecordTime(other.getRecordTime());
               }

               if (other.hasTime()) {
                  this.setTime(other.getTime());
               }

               if (!other.awardIds_.isEmpty()) {
                  if (this.awardIds_.isEmpty()) {
                     this.awardIds_ = other.awardIds_;
                     this.bitField0_ &= -5;
                  } else {
                     this.ensureAwardIdsIsMutable();
                     this.awardIds_.addAll(other.awardIds_);
                  }

                  this.onChanged();
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasRecordTime()) {
               return false;
            } else {
               return this.hasTime();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_TakeOnlineTimeAwardResult_7222 parsedMessage = null;

            try {
               parsedMessage = (S2C_TakeOnlineTimeAwardResult_7222)BattleChapterMsg.S2C_TakeOnlineTimeAwardResult_7222.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_TakeOnlineTimeAwardResult_7222)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasRecordTime() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getRecordTime() {
            return this.recordTime_;
         }

         public Builder setRecordTime(int value) {
            this.bitField0_ |= 1;
            this.recordTime_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearRecordTime() {
            this.bitField0_ &= -2;
            this.recordTime_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasTime() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getTime() {
            return this.time_;
         }

         public Builder setTime(int value) {
            this.bitField0_ |= 2;
            this.time_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearTime() {
            this.bitField0_ &= -3;
            this.time_ = 0;
            this.onChanged();
            return this;
         }

         private void ensureAwardIdsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
               this.awardIds_ = BattleChapterMsg.S2C_TakeOnlineTimeAwardResult_7222.mutableCopy(this.awardIds_);
               this.bitField0_ |= 4;
            }

         }

         public List<Integer> getAwardIdsList() {
            return (List<Integer>)((this.bitField0_ & 4) != 0 ? Collections.unmodifiableList(this.awardIds_) : this.awardIds_);
         }

         public int getAwardIdsCount() {
            return this.awardIds_.size();
         }

         public int getAwardIds(int index) {
            return this.awardIds_.getInt(index);
         }

         public Builder setAwardIds(int index, int value) {
            this.ensureAwardIdsIsMutable();
            this.awardIds_.setInt(index, value);
            this.onChanged();
            return this;
         }

         public Builder addAwardIds(int value) {
            this.ensureAwardIdsIsMutable();
            this.awardIds_.addInt(value);
            this.onChanged();
            return this;
         }

         public Builder addAllAwardIds(Iterable<? extends Integer> values) {
            this.ensureAwardIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.awardIds_);
            this.onChanged();
            return this;
         }

         public Builder clearAwardIds() {
            this.awardIds_ = BattleChapterMsg.S2C_TakeOnlineTimeAwardResult_7222.emptyIntList();
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

   public static final class C2S_ShowAwards_7223 extends GeneratedMessageV3 implements C2S_ShowAwards_7223OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ShowAwards_7223 DEFAULT_INSTANCE = new C2S_ShowAwards_7223();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ShowAwards_7223> PARSER = new AbstractParser<C2S_ShowAwards_7223>() {
         public C2S_ShowAwards_7223 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ShowAwards_7223(input, extensionRegistry);
         }
      };

      private C2S_ShowAwards_7223(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ShowAwards_7223() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ShowAwards_7223();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ShowAwards_7223(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ShowAwards_7223_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ShowAwards_7223_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShowAwards_7223.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ShowAwards_7223)) {
            return super.equals(obj);
         } else {
            C2S_ShowAwards_7223 other = (C2S_ShowAwards_7223)obj;
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

      public static C2S_ShowAwards_7223 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ShowAwards_7223)PARSER.parseFrom(data);
      }

      public static C2S_ShowAwards_7223 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShowAwards_7223)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShowAwards_7223 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ShowAwards_7223)PARSER.parseFrom(data);
      }

      public static C2S_ShowAwards_7223 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShowAwards_7223)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShowAwards_7223 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ShowAwards_7223)PARSER.parseFrom(data);
      }

      public static C2S_ShowAwards_7223 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ShowAwards_7223)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ShowAwards_7223 parseFrom(InputStream input) throws IOException {
         return (C2S_ShowAwards_7223)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShowAwards_7223 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShowAwards_7223)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShowAwards_7223 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ShowAwards_7223)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ShowAwards_7223 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShowAwards_7223)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ShowAwards_7223 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ShowAwards_7223)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ShowAwards_7223 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ShowAwards_7223)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ShowAwards_7223 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ShowAwards_7223 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ShowAwards_7223> parser() {
         return PARSER;
      }

      public Parser<C2S_ShowAwards_7223> getParserForType() {
         return PARSER;
      }

      public C2S_ShowAwards_7223 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ShowAwards_7223OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ShowAwards_7223_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ShowAwards_7223_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ShowAwards_7223.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.C2S_ShowAwards_7223.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ShowAwards_7223_descriptor;
         }

         public C2S_ShowAwards_7223 getDefaultInstanceForType() {
            return BattleChapterMsg.C2S_ShowAwards_7223.getDefaultInstance();
         }

         public C2S_ShowAwards_7223 build() {
            C2S_ShowAwards_7223 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ShowAwards_7223 buildPartial() {
            C2S_ShowAwards_7223 result = new C2S_ShowAwards_7223(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ShowAwards_7223) {
               return this.mergeFrom((C2S_ShowAwards_7223)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ShowAwards_7223 other) {
            if (other == BattleChapterMsg.C2S_ShowAwards_7223.getDefaultInstance()) {
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
            C2S_ShowAwards_7223 parsedMessage = null;

            try {
               parsedMessage = (C2S_ShowAwards_7223)BattleChapterMsg.C2S_ShowAwards_7223.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ShowAwards_7223)e.getUnfinishedMessage();
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

   public static final class S2C_ShowAwardsResult_7224 extends GeneratedMessageV3 implements S2C_ShowAwardsResult_7224OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int ITEMS_FIELD_NUMBER = 1;
      private List<CommonMsg.ItemInfo> items_;
      private byte memoizedIsInitialized;
      private static final S2C_ShowAwardsResult_7224 DEFAULT_INSTANCE = new S2C_ShowAwardsResult_7224();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ShowAwardsResult_7224> PARSER = new AbstractParser<S2C_ShowAwardsResult_7224>() {
         public S2C_ShowAwardsResult_7224 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ShowAwardsResult_7224(input, extensionRegistry);
         }
      };

      private S2C_ShowAwardsResult_7224(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ShowAwardsResult_7224() {
         this.memoizedIsInitialized = -1;
         this.items_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ShowAwardsResult_7224();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ShowAwardsResult_7224(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
               if ((mutable_bitField0_ & 1) != 0) {
                  this.items_ = Collections.unmodifiableList(this.items_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ShowAwardsResult_7224_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ShowAwardsResult_7224_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShowAwardsResult_7224.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ShowAwardsResult_7224)) {
            return super.equals(obj);
         } else {
            S2C_ShowAwardsResult_7224 other = (S2C_ShowAwardsResult_7224)obj;
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

      public static S2C_ShowAwardsResult_7224 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ShowAwardsResult_7224)PARSER.parseFrom(data);
      }

      public static S2C_ShowAwardsResult_7224 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShowAwardsResult_7224)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShowAwardsResult_7224 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ShowAwardsResult_7224)PARSER.parseFrom(data);
      }

      public static S2C_ShowAwardsResult_7224 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShowAwardsResult_7224)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShowAwardsResult_7224 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ShowAwardsResult_7224)PARSER.parseFrom(data);
      }

      public static S2C_ShowAwardsResult_7224 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ShowAwardsResult_7224)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ShowAwardsResult_7224 parseFrom(InputStream input) throws IOException {
         return (S2C_ShowAwardsResult_7224)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShowAwardsResult_7224 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShowAwardsResult_7224)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShowAwardsResult_7224 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ShowAwardsResult_7224)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ShowAwardsResult_7224 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShowAwardsResult_7224)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ShowAwardsResult_7224 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ShowAwardsResult_7224)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ShowAwardsResult_7224 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ShowAwardsResult_7224)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ShowAwardsResult_7224 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ShowAwardsResult_7224 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ShowAwardsResult_7224> parser() {
         return PARSER;
      }

      public Parser<S2C_ShowAwardsResult_7224> getParserForType() {
         return PARSER;
      }

      public S2C_ShowAwardsResult_7224 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ShowAwardsResult_7224OrBuilder {
         private int bitField0_;
         private List<CommonMsg.ItemInfo> items_;
         private RepeatedFieldBuilderV3<CommonMsg.ItemInfo, CommonMsg.ItemInfo.Builder, CommonMsg.ItemInfoOrBuilder> itemsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ShowAwardsResult_7224_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ShowAwardsResult_7224_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ShowAwardsResult_7224.class, Builder.class);
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
            if (BattleChapterMsg.S2C_ShowAwardsResult_7224.alwaysUseFieldBuilders) {
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
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ShowAwardsResult_7224_descriptor;
         }

         public S2C_ShowAwardsResult_7224 getDefaultInstanceForType() {
            return BattleChapterMsg.S2C_ShowAwardsResult_7224.getDefaultInstance();
         }

         public S2C_ShowAwardsResult_7224 build() {
            S2C_ShowAwardsResult_7224 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ShowAwardsResult_7224 buildPartial() {
            S2C_ShowAwardsResult_7224 result = new S2C_ShowAwardsResult_7224(this);
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
            if (other instanceof S2C_ShowAwardsResult_7224) {
               return this.mergeFrom((S2C_ShowAwardsResult_7224)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ShowAwardsResult_7224 other) {
            if (other == BattleChapterMsg.S2C_ShowAwardsResult_7224.getDefaultInstance()) {
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
                     this.itemsBuilder_ = BattleChapterMsg.S2C_ShowAwardsResult_7224.alwaysUseFieldBuilders ? this.getItemsFieldBuilder() : null;
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
            S2C_ShowAwardsResult_7224 parsedMessage = null;

            try {
               parsedMessage = (S2C_ShowAwardsResult_7224)BattleChapterMsg.S2C_ShowAwardsResult_7224.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ShowAwardsResult_7224)e.getUnfinishedMessage();
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

   public static final class ScoreModel extends GeneratedMessageV3 implements ScoreModelOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TYPE_FIELD_NUMBER = 1;
      private int type_;
      public static final int MYSCORE_FIELD_NUMBER = 2;
      private int myScore_;
      public static final int MAXSCORE_FIELD_NUMBER = 3;
      private int maxScore_;
      private byte memoizedIsInitialized;
      private static final ScoreModel DEFAULT_INSTANCE = new ScoreModel();
      /** @deprecated */
      @Deprecated
      public static final Parser<ScoreModel> PARSER = new AbstractParser<ScoreModel>() {
         public ScoreModel parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new ScoreModel(input, extensionRegistry);
         }
      };

      private ScoreModel(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private ScoreModel() {
         this.memoizedIsInitialized = -1;
         this.type_ = 1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new ScoreModel();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private ScoreModel(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        ScoreType value = BattleChapterMsg.ScoreType.valueOf(rawValue);
                        if (value == null) {
                           unknownFields.mergeVarintField(1, rawValue);
                        } else {
                           this.bitField0_ |= 1;
                           this.type_ = rawValue;
                        }
                        break;
                     case 16:
                        this.bitField0_ |= 2;
                        this.myScore_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.maxScore_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_ScoreModel_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_ScoreModel_fieldAccessorTable.ensureFieldAccessorsInitialized(ScoreModel.class, Builder.class);
      }

      public boolean hasType() {
         return (this.bitField0_ & 1) != 0;
      }

      public ScoreType getType() {
         ScoreType result = BattleChapterMsg.ScoreType.valueOf(this.type_);
         return result == null ? BattleChapterMsg.ScoreType.SCORE_TYPE_TOTAL : result;
      }

      public boolean hasMyScore() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getMyScore() {
         return this.myScore_;
      }

      public boolean hasMaxScore() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getMaxScore() {
         return this.maxScore_;
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
         } else if (!this.hasMyScore()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasMaxScore()) {
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
            output.writeInt32(2, this.myScore_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.maxScore_);
         }

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
               size += CodedOutputStream.computeInt32Size(2, this.myScore_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.maxScore_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof ScoreModel)) {
            return super.equals(obj);
         } else {
            ScoreModel other = (ScoreModel)obj;
            if (this.hasType() != other.hasType()) {
               return false;
            } else if (this.hasType() && this.type_ != other.type_) {
               return false;
            } else if (this.hasMyScore() != other.hasMyScore()) {
               return false;
            } else if (this.hasMyScore() && this.getMyScore() != other.getMyScore()) {
               return false;
            } else if (this.hasMaxScore() != other.hasMaxScore()) {
               return false;
            } else if (this.hasMaxScore() && this.getMaxScore() != other.getMaxScore()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasMyScore()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getMyScore();
            }

            if (this.hasMaxScore()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getMaxScore();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static ScoreModel parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (ScoreModel)PARSER.parseFrom(data);
      }

      public static ScoreModel parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ScoreModel)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ScoreModel parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (ScoreModel)PARSER.parseFrom(data);
      }

      public static ScoreModel parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ScoreModel)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ScoreModel parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (ScoreModel)PARSER.parseFrom(data);
      }

      public static ScoreModel parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (ScoreModel)PARSER.parseFrom(data, extensionRegistry);
      }

      public static ScoreModel parseFrom(InputStream input) throws IOException {
         return (ScoreModel)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ScoreModel parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ScoreModel)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static ScoreModel parseDelimitedFrom(InputStream input) throws IOException {
         return (ScoreModel)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static ScoreModel parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ScoreModel)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static ScoreModel parseFrom(CodedInputStream input) throws IOException {
         return (ScoreModel)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static ScoreModel parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (ScoreModel)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(ScoreModel prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static ScoreModel getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<ScoreModel> parser() {
         return PARSER;
      }

      public Parser<ScoreModel> getParserForType() {
         return PARSER;
      }

      public ScoreModel getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ScoreModelOrBuilder {
         private int bitField0_;
         private int type_;
         private int myScore_;
         private int maxScore_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_ScoreModel_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_ScoreModel_fieldAccessorTable.ensureFieldAccessorsInitialized(ScoreModel.class, Builder.class);
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
            if (BattleChapterMsg.ScoreModel.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.type_ = 1;
            this.bitField0_ &= -2;
            this.myScore_ = 0;
            this.bitField0_ &= -3;
            this.maxScore_ = 0;
            this.bitField0_ &= -5;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_ScoreModel_descriptor;
         }

         public ScoreModel getDefaultInstanceForType() {
            return BattleChapterMsg.ScoreModel.getDefaultInstance();
         }

         public ScoreModel build() {
            ScoreModel result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public ScoreModel buildPartial() {
            ScoreModel result = new ScoreModel(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               to_bitField0_ |= 1;
            }

            result.type_ = this.type_;
            if ((from_bitField0_ & 2) != 0) {
               result.myScore_ = this.myScore_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.maxScore_ = this.maxScore_;
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
            if (other instanceof ScoreModel) {
               return this.mergeFrom((ScoreModel)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(ScoreModel other) {
            if (other == BattleChapterMsg.ScoreModel.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasType()) {
                  this.setType(other.getType());
               }

               if (other.hasMyScore()) {
                  this.setMyScore(other.getMyScore());
               }

               if (other.hasMaxScore()) {
                  this.setMaxScore(other.getMaxScore());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasType()) {
               return false;
            } else if (!this.hasMyScore()) {
               return false;
            } else {
               return this.hasMaxScore();
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            ScoreModel parsedMessage = null;

            try {
               parsedMessage = (ScoreModel)BattleChapterMsg.ScoreModel.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (ScoreModel)e.getUnfinishedMessage();
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

         public ScoreType getType() {
            ScoreType result = BattleChapterMsg.ScoreType.valueOf(this.type_);
            return result == null ? BattleChapterMsg.ScoreType.SCORE_TYPE_TOTAL : result;
         }

         public Builder setType(ScoreType value) {
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

         public boolean hasMyScore() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getMyScore() {
            return this.myScore_;
         }

         public Builder setMyScore(int value) {
            this.bitField0_ |= 2;
            this.myScore_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMyScore() {
            this.bitField0_ &= -3;
            this.myScore_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasMaxScore() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getMaxScore() {
            return this.maxScore_;
         }

         public Builder setMaxScore(int value) {
            this.bitField0_ |= 4;
            this.maxScore_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearMaxScore() {
            this.bitField0_ &= -5;
            this.maxScore_ = 0;
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

   public static final class HeroStrongInfo extends GeneratedMessageV3 implements HeroStrongInfoOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int HEROID_FIELD_NUMBER = 1;
      private int heroId_;
      public static final int HEROLV_FIELD_NUMBER = 2;
      private int heroLv_;
      public static final int HEROSTAR_FIELD_NUMBER = 3;
      private int heroStar_;
      public static final int HERONAME_FIELD_NUMBER = 4;
      private volatile Object heroName_;
      public static final int MODELS_FIELD_NUMBER = 5;
      private List<ScoreModel> models_;
      public static final int STARMAPPOINTINFO_FIELD_NUMBER = 6;
      private List<CommonMsg.StarMapPointInfo> starMapPointInfo_;
      public static final int INHERITNATION_FIELD_NUMBER = 7;
      private int inheritNation_;
      private byte memoizedIsInitialized;
      private static final HeroStrongInfo DEFAULT_INSTANCE = new HeroStrongInfo();
      /** @deprecated */
      @Deprecated
      public static final Parser<HeroStrongInfo> PARSER = new AbstractParser<HeroStrongInfo>() {
         public HeroStrongInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new HeroStrongInfo(input, extensionRegistry);
         }
      };

      private HeroStrongInfo(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private HeroStrongInfo() {
         this.memoizedIsInitialized = -1;
         this.heroName_ = "";
         this.models_ = Collections.emptyList();
         this.starMapPointInfo_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new HeroStrongInfo();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private HeroStrongInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                        this.heroLv_ = input.readInt32();
                        break;
                     case 24:
                        this.bitField0_ |= 4;
                        this.heroStar_ = input.readInt32();
                        break;
                     case 34:
                        ByteString bs = input.readBytes();
                        this.bitField0_ |= 8;
                        this.heroName_ = bs;
                        break;
                     case 42:
                        if ((mutable_bitField0_ & 16) == 0) {
                           this.models_ = new ArrayList();
                           mutable_bitField0_ |= 16;
                        }

                        this.models_.add(input.readMessage(BattleChapterMsg.ScoreModel.PARSER, extensionRegistry));
                        break;
                     case 50:
                        if ((mutable_bitField0_ & 32) == 0) {
                           this.starMapPointInfo_ = new ArrayList();
                           mutable_bitField0_ |= 32;
                        }

                        this.starMapPointInfo_.add(input.readMessage(CommonMsg.StarMapPointInfo.PARSER, extensionRegistry));
                        break;
                     case 56:
                        this.bitField0_ |= 16;
                        this.inheritNation_ = input.readInt32();
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               if ((mutable_bitField0_ & 16) != 0) {
                  this.models_ = Collections.unmodifiableList(this.models_);
               }

               if ((mutable_bitField0_ & 32) != 0) {
                  this.starMapPointInfo_ = Collections.unmodifiableList(this.starMapPointInfo_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_HeroStrongInfo_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_HeroStrongInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(HeroStrongInfo.class, Builder.class);
      }

      public boolean hasHeroId() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getHeroId() {
         return this.heroId_;
      }

      public boolean hasHeroLv() {
         return (this.bitField0_ & 2) != 0;
      }

      public int getHeroLv() {
         return this.heroLv_;
      }

      public boolean hasHeroStar() {
         return (this.bitField0_ & 4) != 0;
      }

      public int getHeroStar() {
         return this.heroStar_;
      }

      public boolean hasHeroName() {
         return (this.bitField0_ & 8) != 0;
      }

      public String getHeroName() {
         Object ref = this.heroName_;
         if (ref instanceof String) {
            return (String)ref;
         } else {
            ByteString bs = (ByteString)ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
               this.heroName_ = s;
            }

            return s;
         }
      }

      public ByteString getHeroNameBytes() {
         Object ref = this.heroName_;
         if (ref instanceof String) {
            ByteString b = ByteString.copyFromUtf8((String)ref);
            this.heroName_ = b;
            return b;
         } else {
            return (ByteString)ref;
         }
      }

      public List<ScoreModel> getModelsList() {
         return this.models_;
      }

      public List<? extends ScoreModelOrBuilder> getModelsOrBuilderList() {
         return this.models_;
      }

      public int getModelsCount() {
         return this.models_.size();
      }

      public ScoreModel getModels(int index) {
         return (ScoreModel)this.models_.get(index);
      }

      public ScoreModelOrBuilder getModelsOrBuilder(int index) {
         return (ScoreModelOrBuilder)this.models_.get(index);
      }

      public List<CommonMsg.StarMapPointInfo> getStarMapPointInfoList() {
         return this.starMapPointInfo_;
      }

      public List<? extends CommonMsg.StarMapPointInfoOrBuilder> getStarMapPointInfoOrBuilderList() {
         return this.starMapPointInfo_;
      }

      public int getStarMapPointInfoCount() {
         return this.starMapPointInfo_.size();
      }

      public CommonMsg.StarMapPointInfo getStarMapPointInfo(int index) {
         return (CommonMsg.StarMapPointInfo)this.starMapPointInfo_.get(index);
      }

      public CommonMsg.StarMapPointInfoOrBuilder getStarMapPointInfoOrBuilder(int index) {
         return (CommonMsg.StarMapPointInfoOrBuilder)this.starMapPointInfo_.get(index);
      }

      public boolean hasInheritNation() {
         return (this.bitField0_ & 16) != 0;
      }

      public int getInheritNation() {
         return this.inheritNation_;
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
         } else if (!this.hasHeroLv()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroStar()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else if (!this.hasHeroName()) {
            this.memoizedIsInitialized = 0;
            return false;
         } else {
            for(int i = 0; i < this.getModelsCount(); ++i) {
               if (!this.getModels(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            for(int i = 0; i < this.getStarMapPointInfoCount(); ++i) {
               if (!this.getStarMapPointInfo(i).isInitialized()) {
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
            output.writeInt32(1, this.heroId_);
         }

         if ((this.bitField0_ & 2) != 0) {
            output.writeInt32(2, this.heroLv_);
         }

         if ((this.bitField0_ & 4) != 0) {
            output.writeInt32(3, this.heroStar_);
         }

         if ((this.bitField0_ & 8) != 0) {
            GeneratedMessageV3.writeString(output, 4, this.heroName_);
         }

         for(int i = 0; i < this.models_.size(); ++i) {
            output.writeMessage(5, (MessageLite)this.models_.get(i));
         }

         for(int i = 0; i < this.starMapPointInfo_.size(); ++i) {
            output.writeMessage(6, (MessageLite)this.starMapPointInfo_.get(i));
         }

         if ((this.bitField0_ & 16) != 0) {
            output.writeInt32(7, this.inheritNation_);
         }

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
               size += CodedOutputStream.computeInt32Size(2, this.heroLv_);
            }

            if ((this.bitField0_ & 4) != 0) {
               size += CodedOutputStream.computeInt32Size(3, this.heroStar_);
            }

            if ((this.bitField0_ & 8) != 0) {
               size += GeneratedMessageV3.computeStringSize(4, this.heroName_);
            }

            for(int i = 0; i < this.models_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(5, (MessageLite)this.models_.get(i));
            }

            for(int i = 0; i < this.starMapPointInfo_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(6, (MessageLite)this.starMapPointInfo_.get(i));
            }

            if ((this.bitField0_ & 16) != 0) {
               size += CodedOutputStream.computeInt32Size(7, this.inheritNation_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof HeroStrongInfo)) {
            return super.equals(obj);
         } else {
            HeroStrongInfo other = (HeroStrongInfo)obj;
            if (this.hasHeroId() != other.hasHeroId()) {
               return false;
            } else if (this.hasHeroId() && this.getHeroId() != other.getHeroId()) {
               return false;
            } else if (this.hasHeroLv() != other.hasHeroLv()) {
               return false;
            } else if (this.hasHeroLv() && this.getHeroLv() != other.getHeroLv()) {
               return false;
            } else if (this.hasHeroStar() != other.hasHeroStar()) {
               return false;
            } else if (this.hasHeroStar() && this.getHeroStar() != other.getHeroStar()) {
               return false;
            } else if (this.hasHeroName() != other.hasHeroName()) {
               return false;
            } else if (this.hasHeroName() && !this.getHeroName().equals(other.getHeroName())) {
               return false;
            } else if (!this.getModelsList().equals(other.getModelsList())) {
               return false;
            } else if (!this.getStarMapPointInfoList().equals(other.getStarMapPointInfoList())) {
               return false;
            } else if (this.hasInheritNation() != other.hasInheritNation()) {
               return false;
            } else if (this.hasInheritNation() && this.getInheritNation() != other.getInheritNation()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            if (this.hasHeroLv()) {
               hash = 37 * hash + 2;
               hash = 53 * hash + this.getHeroLv();
            }

            if (this.hasHeroStar()) {
               hash = 37 * hash + 3;
               hash = 53 * hash + this.getHeroStar();
            }

            if (this.hasHeroName()) {
               hash = 37 * hash + 4;
               hash = 53 * hash + this.getHeroName().hashCode();
            }

            if (this.getModelsCount() > 0) {
               hash = 37 * hash + 5;
               hash = 53 * hash + this.getModelsList().hashCode();
            }

            if (this.getStarMapPointInfoCount() > 0) {
               hash = 37 * hash + 6;
               hash = 53 * hash + this.getStarMapPointInfoList().hashCode();
            }

            if (this.hasInheritNation()) {
               hash = 37 * hash + 7;
               hash = 53 * hash + this.getInheritNation();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static HeroStrongInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (HeroStrongInfo)PARSER.parseFrom(data);
      }

      public static HeroStrongInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroStrongInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroStrongInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (HeroStrongInfo)PARSER.parseFrom(data);
      }

      public static HeroStrongInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroStrongInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroStrongInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (HeroStrongInfo)PARSER.parseFrom(data);
      }

      public static HeroStrongInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (HeroStrongInfo)PARSER.parseFrom(data, extensionRegistry);
      }

      public static HeroStrongInfo parseFrom(InputStream input) throws IOException {
         return (HeroStrongInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HeroStrongInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroStrongInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static HeroStrongInfo parseDelimitedFrom(InputStream input) throws IOException {
         return (HeroStrongInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static HeroStrongInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroStrongInfo)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static HeroStrongInfo parseFrom(CodedInputStream input) throws IOException {
         return (HeroStrongInfo)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static HeroStrongInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (HeroStrongInfo)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(HeroStrongInfo prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static HeroStrongInfo getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<HeroStrongInfo> parser() {
         return PARSER;
      }

      public Parser<HeroStrongInfo> getParserForType() {
         return PARSER;
      }

      public HeroStrongInfo getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HeroStrongInfoOrBuilder {
         private int bitField0_;
         private int heroId_;
         private int heroLv_;
         private int heroStar_;
         private Object heroName_;
         private List<ScoreModel> models_;
         private RepeatedFieldBuilderV3<ScoreModel, ScoreModel.Builder, ScoreModelOrBuilder> modelsBuilder_;
         private List<CommonMsg.StarMapPointInfo> starMapPointInfo_;
         private RepeatedFieldBuilderV3<CommonMsg.StarMapPointInfo, CommonMsg.StarMapPointInfo.Builder, CommonMsg.StarMapPointInfoOrBuilder> starMapPointInfoBuilder_;
         private int inheritNation_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_HeroStrongInfo_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_HeroStrongInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(HeroStrongInfo.class, Builder.class);
         }

         private Builder() {
            this.heroName_ = "";
            this.models_ = Collections.emptyList();
            this.starMapPointInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.heroName_ = "";
            this.models_ = Collections.emptyList();
            this.starMapPointInfo_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.HeroStrongInfo.alwaysUseFieldBuilders) {
               this.getModelsFieldBuilder();
               this.getStarMapPointInfoFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            this.heroId_ = 0;
            this.bitField0_ &= -2;
            this.heroLv_ = 0;
            this.bitField0_ &= -3;
            this.heroStar_ = 0;
            this.bitField0_ &= -5;
            this.heroName_ = "";
            this.bitField0_ &= -9;
            if (this.modelsBuilder_ == null) {
               this.models_ = Collections.emptyList();
               this.bitField0_ &= -17;
            } else {
               this.modelsBuilder_.clear();
            }

            if (this.starMapPointInfoBuilder_ == null) {
               this.starMapPointInfo_ = Collections.emptyList();
               this.bitField0_ &= -33;
            } else {
               this.starMapPointInfoBuilder_.clear();
            }

            this.inheritNation_ = 0;
            this.bitField0_ &= -65;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_HeroStrongInfo_descriptor;
         }

         public HeroStrongInfo getDefaultInstanceForType() {
            return BattleChapterMsg.HeroStrongInfo.getDefaultInstance();
         }

         public HeroStrongInfo build() {
            HeroStrongInfo result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public HeroStrongInfo buildPartial() {
            HeroStrongInfo result = new HeroStrongInfo(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.heroId_ = this.heroId_;
               to_bitField0_ |= 1;
            }

            if ((from_bitField0_ & 2) != 0) {
               result.heroLv_ = this.heroLv_;
               to_bitField0_ |= 2;
            }

            if ((from_bitField0_ & 4) != 0) {
               result.heroStar_ = this.heroStar_;
               to_bitField0_ |= 4;
            }

            if ((from_bitField0_ & 8) != 0) {
               to_bitField0_ |= 8;
            }

            result.heroName_ = this.heroName_;
            if (this.modelsBuilder_ == null) {
               if ((this.bitField0_ & 16) != 0) {
                  this.models_ = Collections.unmodifiableList(this.models_);
                  this.bitField0_ &= -17;
               }

               result.models_ = this.models_;
            } else {
               result.models_ = this.modelsBuilder_.build();
            }

            if (this.starMapPointInfoBuilder_ == null) {
               if ((this.bitField0_ & 32) != 0) {
                  this.starMapPointInfo_ = Collections.unmodifiableList(this.starMapPointInfo_);
                  this.bitField0_ &= -33;
               }

               result.starMapPointInfo_ = this.starMapPointInfo_;
            } else {
               result.starMapPointInfo_ = this.starMapPointInfoBuilder_.build();
            }

            if ((from_bitField0_ & 64) != 0) {
               result.inheritNation_ = this.inheritNation_;
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
            if (other instanceof HeroStrongInfo) {
               return this.mergeFrom((HeroStrongInfo)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(HeroStrongInfo other) {
            if (other == BattleChapterMsg.HeroStrongInfo.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasHeroId()) {
                  this.setHeroId(other.getHeroId());
               }

               if (other.hasHeroLv()) {
                  this.setHeroLv(other.getHeroLv());
               }

               if (other.hasHeroStar()) {
                  this.setHeroStar(other.getHeroStar());
               }

               if (other.hasHeroName()) {
                  this.bitField0_ |= 8;
                  this.heroName_ = other.heroName_;
                  this.onChanged();
               }

               if (this.modelsBuilder_ == null) {
                  if (!other.models_.isEmpty()) {
                     if (this.models_.isEmpty()) {
                        this.models_ = other.models_;
                        this.bitField0_ &= -17;
                     } else {
                        this.ensureModelsIsMutable();
                        this.models_.addAll(other.models_);
                     }

                     this.onChanged();
                  }
               } else if (!other.models_.isEmpty()) {
                  if (this.modelsBuilder_.isEmpty()) {
                     this.modelsBuilder_.dispose();
                     this.modelsBuilder_ = null;
                     this.models_ = other.models_;
                     this.bitField0_ &= -17;
                     this.modelsBuilder_ = BattleChapterMsg.HeroStrongInfo.alwaysUseFieldBuilders ? this.getModelsFieldBuilder() : null;
                  } else {
                     this.modelsBuilder_.addAllMessages(other.models_);
                  }
               }

               if (this.starMapPointInfoBuilder_ == null) {
                  if (!other.starMapPointInfo_.isEmpty()) {
                     if (this.starMapPointInfo_.isEmpty()) {
                        this.starMapPointInfo_ = other.starMapPointInfo_;
                        this.bitField0_ &= -33;
                     } else {
                        this.ensureStarMapPointInfoIsMutable();
                        this.starMapPointInfo_.addAll(other.starMapPointInfo_);
                     }

                     this.onChanged();
                  }
               } else if (!other.starMapPointInfo_.isEmpty()) {
                  if (this.starMapPointInfoBuilder_.isEmpty()) {
                     this.starMapPointInfoBuilder_.dispose();
                     this.starMapPointInfoBuilder_ = null;
                     this.starMapPointInfo_ = other.starMapPointInfo_;
                     this.bitField0_ &= -33;
                     this.starMapPointInfoBuilder_ = BattleChapterMsg.HeroStrongInfo.alwaysUseFieldBuilders ? this.getStarMapPointInfoFieldBuilder() : null;
                  } else {
                     this.starMapPointInfoBuilder_.addAllMessages(other.starMapPointInfo_);
                  }
               }

               if (other.hasInheritNation()) {
                  this.setInheritNation(other.getInheritNation());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            if (!this.hasHeroId()) {
               return false;
            } else if (!this.hasHeroLv()) {
               return false;
            } else if (!this.hasHeroStar()) {
               return false;
            } else if (!this.hasHeroName()) {
               return false;
            } else {
               for(int i = 0; i < this.getModelsCount(); ++i) {
                  if (!this.getModels(i).isInitialized()) {
                     return false;
                  }
               }

               for(int i = 0; i < this.getStarMapPointInfoCount(); ++i) {
                  if (!this.getStarMapPointInfo(i).isInitialized()) {
                     return false;
                  }
               }

               return true;
            }
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            HeroStrongInfo parsedMessage = null;

            try {
               parsedMessage = (HeroStrongInfo)BattleChapterMsg.HeroStrongInfo.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (HeroStrongInfo)e.getUnfinishedMessage();
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

         public boolean hasHeroLv() {
            return (this.bitField0_ & 2) != 0;
         }

         public int getHeroLv() {
            return this.heroLv_;
         }

         public Builder setHeroLv(int value) {
            this.bitField0_ |= 2;
            this.heroLv_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroLv() {
            this.bitField0_ &= -3;
            this.heroLv_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroStar() {
            return (this.bitField0_ & 4) != 0;
         }

         public int getHeroStar() {
            return this.heroStar_;
         }

         public Builder setHeroStar(int value) {
            this.bitField0_ |= 4;
            this.heroStar_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearHeroStar() {
            this.bitField0_ &= -5;
            this.heroStar_ = 0;
            this.onChanged();
            return this;
         }

         public boolean hasHeroName() {
            return (this.bitField0_ & 8) != 0;
         }

         public String getHeroName() {
            Object ref = this.heroName_;
            if (!(ref instanceof String)) {
               ByteString bs = (ByteString)ref;
               String s = bs.toStringUtf8();
               if (bs.isValidUtf8()) {
                  this.heroName_ = s;
               }

               return s;
            } else {
               return (String)ref;
            }
         }

         public ByteString getHeroNameBytes() {
            Object ref = this.heroName_;
            if (ref instanceof String) {
               ByteString b = ByteString.copyFromUtf8((String)ref);
               this.heroName_ = b;
               return b;
            } else {
               return (ByteString)ref;
            }
         }

         public Builder setHeroName(String value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.heroName_ = value;
               this.onChanged();
               return this;
            }
         }

         public Builder clearHeroName() {
            this.bitField0_ &= -9;
            this.heroName_ = BattleChapterMsg.HeroStrongInfo.getDefaultInstance().getHeroName();
            this.onChanged();
            return this;
         }

         public Builder setHeroNameBytes(ByteString value) {
            if (value == null) {
               throw new NullPointerException();
            } else {
               this.bitField0_ |= 8;
               this.heroName_ = value;
               this.onChanged();
               return this;
            }
         }

         private void ensureModelsIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
               this.models_ = new ArrayList(this.models_);
               this.bitField0_ |= 16;
            }

         }

         public List<ScoreModel> getModelsList() {
            return this.modelsBuilder_ == null ? Collections.unmodifiableList(this.models_) : this.modelsBuilder_.getMessageList();
         }

         public int getModelsCount() {
            return this.modelsBuilder_ == null ? this.models_.size() : this.modelsBuilder_.getCount();
         }

         public ScoreModel getModels(int index) {
            return this.modelsBuilder_ == null ? (ScoreModel)this.models_.get(index) : (ScoreModel)this.modelsBuilder_.getMessage(index);
         }

         public Builder setModels(int index, ScoreModel value) {
            if (this.modelsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureModelsIsMutable();
               this.models_.set(index, value);
               this.onChanged();
            } else {
               this.modelsBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setModels(int index, ScoreModel.Builder builderForValue) {
            if (this.modelsBuilder_ == null) {
               this.ensureModelsIsMutable();
               this.models_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.modelsBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addModels(ScoreModel value) {
            if (this.modelsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureModelsIsMutable();
               this.models_.add(value);
               this.onChanged();
            } else {
               this.modelsBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addModels(int index, ScoreModel value) {
            if (this.modelsBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureModelsIsMutable();
               this.models_.add(index, value);
               this.onChanged();
            } else {
               this.modelsBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addModels(ScoreModel.Builder builderForValue) {
            if (this.modelsBuilder_ == null) {
               this.ensureModelsIsMutable();
               this.models_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.modelsBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addModels(int index, ScoreModel.Builder builderForValue) {
            if (this.modelsBuilder_ == null) {
               this.ensureModelsIsMutable();
               this.models_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.modelsBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllModels(Iterable<? extends ScoreModel> values) {
            if (this.modelsBuilder_ == null) {
               this.ensureModelsIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.models_);
               this.onChanged();
            } else {
               this.modelsBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearModels() {
            if (this.modelsBuilder_ == null) {
               this.models_ = Collections.emptyList();
               this.bitField0_ &= -17;
               this.onChanged();
            } else {
               this.modelsBuilder_.clear();
            }

            return this;
         }

         public Builder removeModels(int index) {
            if (this.modelsBuilder_ == null) {
               this.ensureModelsIsMutable();
               this.models_.remove(index);
               this.onChanged();
            } else {
               this.modelsBuilder_.remove(index);
            }

            return this;
         }

         public ScoreModel.Builder getModelsBuilder(int index) {
            return (ScoreModel.Builder)this.getModelsFieldBuilder().getBuilder(index);
         }

         public ScoreModelOrBuilder getModelsOrBuilder(int index) {
            return this.modelsBuilder_ == null ? (ScoreModelOrBuilder)this.models_.get(index) : (ScoreModelOrBuilder)this.modelsBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends ScoreModelOrBuilder> getModelsOrBuilderList() {
            return this.modelsBuilder_ != null ? this.modelsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.models_);
         }

         public ScoreModel.Builder addModelsBuilder() {
            return (ScoreModel.Builder)this.getModelsFieldBuilder().addBuilder(BattleChapterMsg.ScoreModel.getDefaultInstance());
         }

         public ScoreModel.Builder addModelsBuilder(int index) {
            return (ScoreModel.Builder)this.getModelsFieldBuilder().addBuilder(index, BattleChapterMsg.ScoreModel.getDefaultInstance());
         }

         public List<ScoreModel.Builder> getModelsBuilderList() {
            return this.getModelsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<ScoreModel, ScoreModel.Builder, ScoreModelOrBuilder> getModelsFieldBuilder() {
            if (this.modelsBuilder_ == null) {
               this.modelsBuilder_ = new RepeatedFieldBuilderV3(this.models_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean());
               this.models_ = null;
            }

            return this.modelsBuilder_;
         }

         private void ensureStarMapPointInfoIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
               this.starMapPointInfo_ = new ArrayList(this.starMapPointInfo_);
               this.bitField0_ |= 32;
            }

         }

         public List<CommonMsg.StarMapPointInfo> getStarMapPointInfoList() {
            return this.starMapPointInfoBuilder_ == null ? Collections.unmodifiableList(this.starMapPointInfo_) : this.starMapPointInfoBuilder_.getMessageList();
         }

         public int getStarMapPointInfoCount() {
            return this.starMapPointInfoBuilder_ == null ? this.starMapPointInfo_.size() : this.starMapPointInfoBuilder_.getCount();
         }

         public CommonMsg.StarMapPointInfo getStarMapPointInfo(int index) {
            return this.starMapPointInfoBuilder_ == null ? (CommonMsg.StarMapPointInfo)this.starMapPointInfo_.get(index) : (CommonMsg.StarMapPointInfo)this.starMapPointInfoBuilder_.getMessage(index);
         }

         public Builder setStarMapPointInfo(int index, CommonMsg.StarMapPointInfo value) {
            if (this.starMapPointInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureStarMapPointInfoIsMutable();
               this.starMapPointInfo_.set(index, value);
               this.onChanged();
            } else {
               this.starMapPointInfoBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setStarMapPointInfo(int index, CommonMsg.StarMapPointInfo.Builder builderForValue) {
            if (this.starMapPointInfoBuilder_ == null) {
               this.ensureStarMapPointInfoIsMutable();
               this.starMapPointInfo_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.starMapPointInfoBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addStarMapPointInfo(CommonMsg.StarMapPointInfo value) {
            if (this.starMapPointInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureStarMapPointInfoIsMutable();
               this.starMapPointInfo_.add(value);
               this.onChanged();
            } else {
               this.starMapPointInfoBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addStarMapPointInfo(int index, CommonMsg.StarMapPointInfo value) {
            if (this.starMapPointInfoBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureStarMapPointInfoIsMutable();
               this.starMapPointInfo_.add(index, value);
               this.onChanged();
            } else {
               this.starMapPointInfoBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addStarMapPointInfo(CommonMsg.StarMapPointInfo.Builder builderForValue) {
            if (this.starMapPointInfoBuilder_ == null) {
               this.ensureStarMapPointInfoIsMutable();
               this.starMapPointInfo_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.starMapPointInfoBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addStarMapPointInfo(int index, CommonMsg.StarMapPointInfo.Builder builderForValue) {
            if (this.starMapPointInfoBuilder_ == null) {
               this.ensureStarMapPointInfoIsMutable();
               this.starMapPointInfo_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.starMapPointInfoBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllStarMapPointInfo(Iterable<? extends CommonMsg.StarMapPointInfo> values) {
            if (this.starMapPointInfoBuilder_ == null) {
               this.ensureStarMapPointInfoIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.starMapPointInfo_);
               this.onChanged();
            } else {
               this.starMapPointInfoBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearStarMapPointInfo() {
            if (this.starMapPointInfoBuilder_ == null) {
               this.starMapPointInfo_ = Collections.emptyList();
               this.bitField0_ &= -33;
               this.onChanged();
            } else {
               this.starMapPointInfoBuilder_.clear();
            }

            return this;
         }

         public Builder removeStarMapPointInfo(int index) {
            if (this.starMapPointInfoBuilder_ == null) {
               this.ensureStarMapPointInfoIsMutable();
               this.starMapPointInfo_.remove(index);
               this.onChanged();
            } else {
               this.starMapPointInfoBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.StarMapPointInfo.Builder getStarMapPointInfoBuilder(int index) {
            return (CommonMsg.StarMapPointInfo.Builder)this.getStarMapPointInfoFieldBuilder().getBuilder(index);
         }

         public CommonMsg.StarMapPointInfoOrBuilder getStarMapPointInfoOrBuilder(int index) {
            return this.starMapPointInfoBuilder_ == null ? (CommonMsg.StarMapPointInfoOrBuilder)this.starMapPointInfo_.get(index) : (CommonMsg.StarMapPointInfoOrBuilder)this.starMapPointInfoBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.StarMapPointInfoOrBuilder> getStarMapPointInfoOrBuilderList() {
            return this.starMapPointInfoBuilder_ != null ? this.starMapPointInfoBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.starMapPointInfo_);
         }

         public CommonMsg.StarMapPointInfo.Builder addStarMapPointInfoBuilder() {
            return (CommonMsg.StarMapPointInfo.Builder)this.getStarMapPointInfoFieldBuilder().addBuilder(CommonMsg.StarMapPointInfo.getDefaultInstance());
         }

         public CommonMsg.StarMapPointInfo.Builder addStarMapPointInfoBuilder(int index) {
            return (CommonMsg.StarMapPointInfo.Builder)this.getStarMapPointInfoFieldBuilder().addBuilder(index, CommonMsg.StarMapPointInfo.getDefaultInstance());
         }

         public List<CommonMsg.StarMapPointInfo.Builder> getStarMapPointInfoBuilderList() {
            return this.getStarMapPointInfoFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.StarMapPointInfo, CommonMsg.StarMapPointInfo.Builder, CommonMsg.StarMapPointInfoOrBuilder> getStarMapPointInfoFieldBuilder() {
            if (this.starMapPointInfoBuilder_ == null) {
               this.starMapPointInfoBuilder_ = new RepeatedFieldBuilderV3(this.starMapPointInfo_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean());
               this.starMapPointInfo_ = null;
            }

            return this.starMapPointInfoBuilder_;
         }

         public boolean hasInheritNation() {
            return (this.bitField0_ & 64) != 0;
         }

         public int getInheritNation() {
            return this.inheritNation_;
         }

         public Builder setInheritNation(int value) {
            this.bitField0_ |= 64;
            this.inheritNation_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearInheritNation() {
            this.bitField0_ &= -65;
            this.inheritNation_ = 0;
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

   public static final class C2S_HeroStrongList_7225 extends GeneratedMessageV3 implements C2S_HeroStrongList_7225OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_HeroStrongList_7225 DEFAULT_INSTANCE = new C2S_HeroStrongList_7225();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_HeroStrongList_7225> PARSER = new AbstractParser<C2S_HeroStrongList_7225>() {
         public C2S_HeroStrongList_7225 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_HeroStrongList_7225(input, extensionRegistry);
         }
      };

      private C2S_HeroStrongList_7225(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_HeroStrongList_7225() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_HeroStrongList_7225();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_HeroStrongList_7225(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_HeroStrongList_7225_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_HeroStrongList_7225_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroStrongList_7225.class, Builder.class);
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
         } else if (!(obj instanceof C2S_HeroStrongList_7225)) {
            return super.equals(obj);
         } else {
            C2S_HeroStrongList_7225 other = (C2S_HeroStrongList_7225)obj;
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

      public static C2S_HeroStrongList_7225 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_HeroStrongList_7225)PARSER.parseFrom(data);
      }

      public static C2S_HeroStrongList_7225 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroStrongList_7225)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroStrongList_7225 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_HeroStrongList_7225)PARSER.parseFrom(data);
      }

      public static C2S_HeroStrongList_7225 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroStrongList_7225)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroStrongList_7225 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_HeroStrongList_7225)PARSER.parseFrom(data);
      }

      public static C2S_HeroStrongList_7225 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_HeroStrongList_7225)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_HeroStrongList_7225 parseFrom(InputStream input) throws IOException {
         return (C2S_HeroStrongList_7225)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroStrongList_7225 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroStrongList_7225)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroStrongList_7225 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_HeroStrongList_7225)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_HeroStrongList_7225 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroStrongList_7225)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_HeroStrongList_7225 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_HeroStrongList_7225)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_HeroStrongList_7225 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_HeroStrongList_7225)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_HeroStrongList_7225 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_HeroStrongList_7225 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_HeroStrongList_7225> parser() {
         return PARSER;
      }

      public Parser<C2S_HeroStrongList_7225> getParserForType() {
         return PARSER;
      }

      public C2S_HeroStrongList_7225 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_HeroStrongList_7225OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_HeroStrongList_7225_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_HeroStrongList_7225_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_HeroStrongList_7225.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.C2S_HeroStrongList_7225.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_HeroStrongList_7225_descriptor;
         }

         public C2S_HeroStrongList_7225 getDefaultInstanceForType() {
            return BattleChapterMsg.C2S_HeroStrongList_7225.getDefaultInstance();
         }

         public C2S_HeroStrongList_7225 build() {
            C2S_HeroStrongList_7225 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_HeroStrongList_7225 buildPartial() {
            C2S_HeroStrongList_7225 result = new C2S_HeroStrongList_7225(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_HeroStrongList_7225) {
               return this.mergeFrom((C2S_HeroStrongList_7225)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_HeroStrongList_7225 other) {
            if (other == BattleChapterMsg.C2S_HeroStrongList_7225.getDefaultInstance()) {
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
            C2S_HeroStrongList_7225 parsedMessage = null;

            try {
               parsedMessage = (C2S_HeroStrongList_7225)BattleChapterMsg.C2S_HeroStrongList_7225.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_HeroStrongList_7225)e.getUnfinishedMessage();
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

   public static final class S2C_HeroStrongListResult_7226 extends GeneratedMessageV3 implements S2C_HeroStrongListResult_7226OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int INFOS_FIELD_NUMBER = 1;
      private List<HeroStrongInfo> infos_;
      private byte memoizedIsInitialized;
      private static final S2C_HeroStrongListResult_7226 DEFAULT_INSTANCE = new S2C_HeroStrongListResult_7226();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_HeroStrongListResult_7226> PARSER = new AbstractParser<S2C_HeroStrongListResult_7226>() {
         public S2C_HeroStrongListResult_7226 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_HeroStrongListResult_7226(input, extensionRegistry);
         }
      };

      private S2C_HeroStrongListResult_7226(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_HeroStrongListResult_7226() {
         this.memoizedIsInitialized = -1;
         this.infos_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_HeroStrongListResult_7226();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_HeroStrongListResult_7226(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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

                        this.infos_.add(input.readMessage(BattleChapterMsg.HeroStrongInfo.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_HeroStrongListResult_7226_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_HeroStrongListResult_7226_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroStrongListResult_7226.class, Builder.class);
      }

      public List<HeroStrongInfo> getInfosList() {
         return this.infos_;
      }

      public List<? extends HeroStrongInfoOrBuilder> getInfosOrBuilderList() {
         return this.infos_;
      }

      public int getInfosCount() {
         return this.infos_.size();
      }

      public HeroStrongInfo getInfos(int index) {
         return (HeroStrongInfo)this.infos_.get(index);
      }

      public HeroStrongInfoOrBuilder getInfosOrBuilder(int index) {
         return (HeroStrongInfoOrBuilder)this.infos_.get(index);
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
         } else if (!(obj instanceof S2C_HeroStrongListResult_7226)) {
            return super.equals(obj);
         } else {
            S2C_HeroStrongListResult_7226 other = (S2C_HeroStrongListResult_7226)obj;
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

      public static S2C_HeroStrongListResult_7226 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_HeroStrongListResult_7226)PARSER.parseFrom(data);
      }

      public static S2C_HeroStrongListResult_7226 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroStrongListResult_7226)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroStrongListResult_7226 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_HeroStrongListResult_7226)PARSER.parseFrom(data);
      }

      public static S2C_HeroStrongListResult_7226 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroStrongListResult_7226)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroStrongListResult_7226 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_HeroStrongListResult_7226)PARSER.parseFrom(data);
      }

      public static S2C_HeroStrongListResult_7226 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_HeroStrongListResult_7226)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_HeroStrongListResult_7226 parseFrom(InputStream input) throws IOException {
         return (S2C_HeroStrongListResult_7226)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroStrongListResult_7226 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroStrongListResult_7226)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroStrongListResult_7226 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_HeroStrongListResult_7226)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_HeroStrongListResult_7226 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroStrongListResult_7226)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_HeroStrongListResult_7226 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_HeroStrongListResult_7226)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_HeroStrongListResult_7226 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_HeroStrongListResult_7226)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_HeroStrongListResult_7226 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_HeroStrongListResult_7226 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_HeroStrongListResult_7226> parser() {
         return PARSER;
      }

      public Parser<S2C_HeroStrongListResult_7226> getParserForType() {
         return PARSER;
      }

      public S2C_HeroStrongListResult_7226 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_HeroStrongListResult_7226OrBuilder {
         private int bitField0_;
         private List<HeroStrongInfo> infos_;
         private RepeatedFieldBuilderV3<HeroStrongInfo, HeroStrongInfo.Builder, HeroStrongInfoOrBuilder> infosBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_HeroStrongListResult_7226_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_HeroStrongListResult_7226_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_HeroStrongListResult_7226.class, Builder.class);
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
            if (BattleChapterMsg.S2C_HeroStrongListResult_7226.alwaysUseFieldBuilders) {
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
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_HeroStrongListResult_7226_descriptor;
         }

         public S2C_HeroStrongListResult_7226 getDefaultInstanceForType() {
            return BattleChapterMsg.S2C_HeroStrongListResult_7226.getDefaultInstance();
         }

         public S2C_HeroStrongListResult_7226 build() {
            S2C_HeroStrongListResult_7226 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_HeroStrongListResult_7226 buildPartial() {
            S2C_HeroStrongListResult_7226 result = new S2C_HeroStrongListResult_7226(this);
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
            if (other instanceof S2C_HeroStrongListResult_7226) {
               return this.mergeFrom((S2C_HeroStrongListResult_7226)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_HeroStrongListResult_7226 other) {
            if (other == BattleChapterMsg.S2C_HeroStrongListResult_7226.getDefaultInstance()) {
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
                     this.infosBuilder_ = BattleChapterMsg.S2C_HeroStrongListResult_7226.alwaysUseFieldBuilders ? this.getInfosFieldBuilder() : null;
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
            S2C_HeroStrongListResult_7226 parsedMessage = null;

            try {
               parsedMessage = (S2C_HeroStrongListResult_7226)BattleChapterMsg.S2C_HeroStrongListResult_7226.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_HeroStrongListResult_7226)e.getUnfinishedMessage();
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

         public List<HeroStrongInfo> getInfosList() {
            return this.infosBuilder_ == null ? Collections.unmodifiableList(this.infos_) : this.infosBuilder_.getMessageList();
         }

         public int getInfosCount() {
            return this.infosBuilder_ == null ? this.infos_.size() : this.infosBuilder_.getCount();
         }

         public HeroStrongInfo getInfos(int index) {
            return this.infosBuilder_ == null ? (HeroStrongInfo)this.infos_.get(index) : (HeroStrongInfo)this.infosBuilder_.getMessage(index);
         }

         public Builder setInfos(int index, HeroStrongInfo value) {
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

         public Builder setInfos(int index, HeroStrongInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(HeroStrongInfo value) {
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

         public Builder addInfos(int index, HeroStrongInfo value) {
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

         public Builder addInfos(HeroStrongInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addInfos(int index, HeroStrongInfo.Builder builderForValue) {
            if (this.infosBuilder_ == null) {
               this.ensureInfosIsMutable();
               this.infos_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.infosBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllInfos(Iterable<? extends HeroStrongInfo> values) {
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

         public HeroStrongInfo.Builder getInfosBuilder(int index) {
            return (HeroStrongInfo.Builder)this.getInfosFieldBuilder().getBuilder(index);
         }

         public HeroStrongInfoOrBuilder getInfosOrBuilder(int index) {
            return this.infosBuilder_ == null ? (HeroStrongInfoOrBuilder)this.infos_.get(index) : (HeroStrongInfoOrBuilder)this.infosBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends HeroStrongInfoOrBuilder> getInfosOrBuilderList() {
            return this.infosBuilder_ != null ? this.infosBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.infos_);
         }

         public HeroStrongInfo.Builder addInfosBuilder() {
            return (HeroStrongInfo.Builder)this.getInfosFieldBuilder().addBuilder(BattleChapterMsg.HeroStrongInfo.getDefaultInstance());
         }

         public HeroStrongInfo.Builder addInfosBuilder(int index) {
            return (HeroStrongInfo.Builder)this.getInfosFieldBuilder().addBuilder(index, BattleChapterMsg.HeroStrongInfo.getDefaultInstance());
         }

         public List<HeroStrongInfo.Builder> getInfosBuilderList() {
            return this.getInfosFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<HeroStrongInfo, HeroStrongInfo.Builder, HeroStrongInfoOrBuilder> getInfosFieldBuilder() {
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

   public static final class C2S_ChapterUpStarTaskList_7227 extends GeneratedMessageV3 implements C2S_ChapterUpStarTaskList_7227OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ChapterUpStarTaskList_7227 DEFAULT_INSTANCE = new C2S_ChapterUpStarTaskList_7227();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ChapterUpStarTaskList_7227> PARSER = new AbstractParser<C2S_ChapterUpStarTaskList_7227>() {
         public C2S_ChapterUpStarTaskList_7227 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ChapterUpStarTaskList_7227(input, extensionRegistry);
         }
      };

      private C2S_ChapterUpStarTaskList_7227(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ChapterUpStarTaskList_7227() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ChapterUpStarTaskList_7227();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ChapterUpStarTaskList_7227(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterUpStarTaskList_7227_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterUpStarTaskList_7227_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChapterUpStarTaskList_7227.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ChapterUpStarTaskList_7227)) {
            return super.equals(obj);
         } else {
            C2S_ChapterUpStarTaskList_7227 other = (C2S_ChapterUpStarTaskList_7227)obj;
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

      public static C2S_ChapterUpStarTaskList_7227 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ChapterUpStarTaskList_7227)PARSER.parseFrom(data);
      }

      public static C2S_ChapterUpStarTaskList_7227 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChapterUpStarTaskList_7227)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChapterUpStarTaskList_7227 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ChapterUpStarTaskList_7227)PARSER.parseFrom(data);
      }

      public static C2S_ChapterUpStarTaskList_7227 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChapterUpStarTaskList_7227)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChapterUpStarTaskList_7227 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ChapterUpStarTaskList_7227)PARSER.parseFrom(data);
      }

      public static C2S_ChapterUpStarTaskList_7227 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChapterUpStarTaskList_7227)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChapterUpStarTaskList_7227 parseFrom(InputStream input) throws IOException {
         return (C2S_ChapterUpStarTaskList_7227)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChapterUpStarTaskList_7227 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChapterUpStarTaskList_7227)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChapterUpStarTaskList_7227 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ChapterUpStarTaskList_7227)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ChapterUpStarTaskList_7227 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChapterUpStarTaskList_7227)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChapterUpStarTaskList_7227 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ChapterUpStarTaskList_7227)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChapterUpStarTaskList_7227 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChapterUpStarTaskList_7227)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ChapterUpStarTaskList_7227 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ChapterUpStarTaskList_7227 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ChapterUpStarTaskList_7227> parser() {
         return PARSER;
      }

      public Parser<C2S_ChapterUpStarTaskList_7227> getParserForType() {
         return PARSER;
      }

      public C2S_ChapterUpStarTaskList_7227 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ChapterUpStarTaskList_7227OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterUpStarTaskList_7227_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterUpStarTaskList_7227_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChapterUpStarTaskList_7227.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.C2S_ChapterUpStarTaskList_7227.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterUpStarTaskList_7227_descriptor;
         }

         public C2S_ChapterUpStarTaskList_7227 getDefaultInstanceForType() {
            return BattleChapterMsg.C2S_ChapterUpStarTaskList_7227.getDefaultInstance();
         }

         public C2S_ChapterUpStarTaskList_7227 build() {
            C2S_ChapterUpStarTaskList_7227 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ChapterUpStarTaskList_7227 buildPartial() {
            C2S_ChapterUpStarTaskList_7227 result = new C2S_ChapterUpStarTaskList_7227(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ChapterUpStarTaskList_7227) {
               return this.mergeFrom((C2S_ChapterUpStarTaskList_7227)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ChapterUpStarTaskList_7227 other) {
            if (other == BattleChapterMsg.C2S_ChapterUpStarTaskList_7227.getDefaultInstance()) {
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
            C2S_ChapterUpStarTaskList_7227 parsedMessage = null;

            try {
               parsedMessage = (C2S_ChapterUpStarTaskList_7227)BattleChapterMsg.C2S_ChapterUpStarTaskList_7227.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ChapterUpStarTaskList_7227)e.getUnfinishedMessage();
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

   public static final class S2C_ChapterUpStarTaskList_7228 extends GeneratedMessageV3 implements S2C_ChapterUpStarTaskList_7228OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASKLIST_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> taskList_;
      private byte memoizedIsInitialized;
      private static final S2C_ChapterUpStarTaskList_7228 DEFAULT_INSTANCE = new S2C_ChapterUpStarTaskList_7228();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ChapterUpStarTaskList_7228> PARSER = new AbstractParser<S2C_ChapterUpStarTaskList_7228>() {
         public S2C_ChapterUpStarTaskList_7228 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ChapterUpStarTaskList_7228(input, extensionRegistry);
         }
      };

      private S2C_ChapterUpStarTaskList_7228(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ChapterUpStarTaskList_7228() {
         this.memoizedIsInitialized = -1;
         this.taskList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ChapterUpStarTaskList_7228();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ChapterUpStarTaskList_7228(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                           this.taskList_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.taskList_.add(input.readMessage(CommonMsg.Task.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.taskList_ = Collections.unmodifiableList(this.taskList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterUpStarTaskList_7228_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterUpStarTaskList_7228_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChapterUpStarTaskList_7228.class, Builder.class);
      }

      public List<CommonMsg.Task> getTaskListList() {
         return this.taskList_;
      }

      public List<? extends CommonMsg.TaskOrBuilder> getTaskListOrBuilderList() {
         return this.taskList_;
      }

      public int getTaskListCount() {
         return this.taskList_.size();
      }

      public CommonMsg.Task getTaskList(int index) {
         return (CommonMsg.Task)this.taskList_.get(index);
      }

      public CommonMsg.TaskOrBuilder getTaskListOrBuilder(int index) {
         return (CommonMsg.TaskOrBuilder)this.taskList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getTaskListCount(); ++i) {
               if (!this.getTaskList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.taskList_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.taskList_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.taskList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.taskList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ChapterUpStarTaskList_7228)) {
            return super.equals(obj);
         } else {
            S2C_ChapterUpStarTaskList_7228 other = (S2C_ChapterUpStarTaskList_7228)obj;
            if (!this.getTaskListList().equals(other.getTaskListList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getTaskListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ChapterUpStarTaskList_7228 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ChapterUpStarTaskList_7228)PARSER.parseFrom(data);
      }

      public static S2C_ChapterUpStarTaskList_7228 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChapterUpStarTaskList_7228)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChapterUpStarTaskList_7228 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ChapterUpStarTaskList_7228)PARSER.parseFrom(data);
      }

      public static S2C_ChapterUpStarTaskList_7228 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChapterUpStarTaskList_7228)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChapterUpStarTaskList_7228 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ChapterUpStarTaskList_7228)PARSER.parseFrom(data);
      }

      public static S2C_ChapterUpStarTaskList_7228 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChapterUpStarTaskList_7228)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChapterUpStarTaskList_7228 parseFrom(InputStream input) throws IOException {
         return (S2C_ChapterUpStarTaskList_7228)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChapterUpStarTaskList_7228 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChapterUpStarTaskList_7228)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChapterUpStarTaskList_7228 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ChapterUpStarTaskList_7228)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ChapterUpStarTaskList_7228 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChapterUpStarTaskList_7228)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChapterUpStarTaskList_7228 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ChapterUpStarTaskList_7228)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChapterUpStarTaskList_7228 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChapterUpStarTaskList_7228)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ChapterUpStarTaskList_7228 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ChapterUpStarTaskList_7228 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ChapterUpStarTaskList_7228> parser() {
         return PARSER;
      }

      public Parser<S2C_ChapterUpStarTaskList_7228> getParserForType() {
         return PARSER;
      }

      public S2C_ChapterUpStarTaskList_7228 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ChapterUpStarTaskList_7228OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> taskList_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterUpStarTaskList_7228_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterUpStarTaskList_7228_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChapterUpStarTaskList_7228.class, Builder.class);
         }

         private Builder() {
            this.taskList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.taskList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.S2C_ChapterUpStarTaskList_7228.alwaysUseFieldBuilders) {
               this.getTaskListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.taskListBuilder_ == null) {
               this.taskList_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.taskListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterUpStarTaskList_7228_descriptor;
         }

         public S2C_ChapterUpStarTaskList_7228 getDefaultInstanceForType() {
            return BattleChapterMsg.S2C_ChapterUpStarTaskList_7228.getDefaultInstance();
         }

         public S2C_ChapterUpStarTaskList_7228 build() {
            S2C_ChapterUpStarTaskList_7228 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ChapterUpStarTaskList_7228 buildPartial() {
            S2C_ChapterUpStarTaskList_7228 result = new S2C_ChapterUpStarTaskList_7228(this);
            int from_bitField0_ = this.bitField0_;
            if (this.taskListBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.taskList_ = Collections.unmodifiableList(this.taskList_);
                  this.bitField0_ &= -2;
               }

               result.taskList_ = this.taskList_;
            } else {
               result.taskList_ = this.taskListBuilder_.build();
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
            if (other instanceof S2C_ChapterUpStarTaskList_7228) {
               return this.mergeFrom((S2C_ChapterUpStarTaskList_7228)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ChapterUpStarTaskList_7228 other) {
            if (other == BattleChapterMsg.S2C_ChapterUpStarTaskList_7228.getDefaultInstance()) {
               return this;
            } else {
               if (this.taskListBuilder_ == null) {
                  if (!other.taskList_.isEmpty()) {
                     if (this.taskList_.isEmpty()) {
                        this.taskList_ = other.taskList_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTaskListIsMutable();
                        this.taskList_.addAll(other.taskList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.taskList_.isEmpty()) {
                  if (this.taskListBuilder_.isEmpty()) {
                     this.taskListBuilder_.dispose();
                     this.taskListBuilder_ = null;
                     this.taskList_ = other.taskList_;
                     this.bitField0_ &= -2;
                     this.taskListBuilder_ = BattleChapterMsg.S2C_ChapterUpStarTaskList_7228.alwaysUseFieldBuilders ? this.getTaskListFieldBuilder() : null;
                  } else {
                     this.taskListBuilder_.addAllMessages(other.taskList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getTaskListCount(); ++i) {
               if (!this.getTaskList(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ChapterUpStarTaskList_7228 parsedMessage = null;

            try {
               parsedMessage = (S2C_ChapterUpStarTaskList_7228)BattleChapterMsg.S2C_ChapterUpStarTaskList_7228.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ChapterUpStarTaskList_7228)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTaskListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.taskList_ = new ArrayList(this.taskList_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.Task> getTaskListList() {
            return this.taskListBuilder_ == null ? Collections.unmodifiableList(this.taskList_) : this.taskListBuilder_.getMessageList();
         }

         public int getTaskListCount() {
            return this.taskListBuilder_ == null ? this.taskList_.size() : this.taskListBuilder_.getCount();
         }

         public CommonMsg.Task getTaskList(int index) {
            return this.taskListBuilder_ == null ? (CommonMsg.Task)this.taskList_.get(index) : (CommonMsg.Task)this.taskListBuilder_.getMessage(index);
         }

         public Builder setTaskList(int index, CommonMsg.Task value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.set(index, value);
               this.onChanged();
            } else {
               this.taskListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTaskList(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(CommonMsg.Task value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.add(value);
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTaskList(int index, CommonMsg.Task value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.add(index, value);
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTaskList(CommonMsg.Task.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTaskList(Iterable<? extends CommonMsg.Task> values) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.taskList_);
               this.onChanged();
            } else {
               this.taskListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTaskList() {
            if (this.taskListBuilder_ == null) {
               this.taskList_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.taskListBuilder_.clear();
            }

            return this;
         }

         public Builder removeTaskList(int index) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.remove(index);
               this.onChanged();
            } else {
               this.taskListBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.Task.Builder getTaskListBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskListFieldBuilder().getBuilder(index);
         }

         public CommonMsg.TaskOrBuilder getTaskListOrBuilder(int index) {
            return this.taskListBuilder_ == null ? (CommonMsg.TaskOrBuilder)this.taskList_.get(index) : (CommonMsg.TaskOrBuilder)this.taskListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.TaskOrBuilder> getTaskListOrBuilderList() {
            return this.taskListBuilder_ != null ? this.taskListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.taskList_);
         }

         public CommonMsg.Task.Builder addTaskListBuilder() {
            return (CommonMsg.Task.Builder)this.getTaskListFieldBuilder().addBuilder(CommonMsg.Task.getDefaultInstance());
         }

         public CommonMsg.Task.Builder addTaskListBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskListFieldBuilder().addBuilder(index, CommonMsg.Task.getDefaultInstance());
         }

         public List<CommonMsg.Task.Builder> getTaskListBuilderList() {
            return this.getTaskListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> getTaskListFieldBuilder() {
            if (this.taskListBuilder_ == null) {
               this.taskListBuilder_ = new RepeatedFieldBuilderV3(this.taskList_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.taskList_ = null;
            }

            return this.taskListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_ChapterUpStarTaskCommit_7229 extends GeneratedMessageV3 implements C2S_ChapterUpStarTaskCommit_7229OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_ChapterUpStarTaskCommit_7229 DEFAULT_INSTANCE = new C2S_ChapterUpStarTaskCommit_7229();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ChapterUpStarTaskCommit_7229> PARSER = new AbstractParser<C2S_ChapterUpStarTaskCommit_7229>() {
         public C2S_ChapterUpStarTaskCommit_7229 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ChapterUpStarTaskCommit_7229(input, extensionRegistry);
         }
      };

      private C2S_ChapterUpStarTaskCommit_7229(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ChapterUpStarTaskCommit_7229() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ChapterUpStarTaskCommit_7229();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ChapterUpStarTaskCommit_7229(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterUpStarTaskCommit_7229_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterUpStarTaskCommit_7229_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChapterUpStarTaskCommit_7229.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ChapterUpStarTaskCommit_7229)) {
            return super.equals(obj);
         } else {
            C2S_ChapterUpStarTaskCommit_7229 other = (C2S_ChapterUpStarTaskCommit_7229)obj;
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

      public static C2S_ChapterUpStarTaskCommit_7229 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ChapterUpStarTaskCommit_7229)PARSER.parseFrom(data);
      }

      public static C2S_ChapterUpStarTaskCommit_7229 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChapterUpStarTaskCommit_7229)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChapterUpStarTaskCommit_7229 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ChapterUpStarTaskCommit_7229)PARSER.parseFrom(data);
      }

      public static C2S_ChapterUpStarTaskCommit_7229 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChapterUpStarTaskCommit_7229)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChapterUpStarTaskCommit_7229 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ChapterUpStarTaskCommit_7229)PARSER.parseFrom(data);
      }

      public static C2S_ChapterUpStarTaskCommit_7229 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChapterUpStarTaskCommit_7229)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChapterUpStarTaskCommit_7229 parseFrom(InputStream input) throws IOException {
         return (C2S_ChapterUpStarTaskCommit_7229)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChapterUpStarTaskCommit_7229 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChapterUpStarTaskCommit_7229)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChapterUpStarTaskCommit_7229 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ChapterUpStarTaskCommit_7229)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ChapterUpStarTaskCommit_7229 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChapterUpStarTaskCommit_7229)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChapterUpStarTaskCommit_7229 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ChapterUpStarTaskCommit_7229)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChapterUpStarTaskCommit_7229 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChapterUpStarTaskCommit_7229)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ChapterUpStarTaskCommit_7229 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ChapterUpStarTaskCommit_7229 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ChapterUpStarTaskCommit_7229> parser() {
         return PARSER;
      }

      public Parser<C2S_ChapterUpStarTaskCommit_7229> getParserForType() {
         return PARSER;
      }

      public C2S_ChapterUpStarTaskCommit_7229 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ChapterUpStarTaskCommit_7229OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterUpStarTaskCommit_7229_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterUpStarTaskCommit_7229_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChapterUpStarTaskCommit_7229.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.C2S_ChapterUpStarTaskCommit_7229.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterUpStarTaskCommit_7229_descriptor;
         }

         public C2S_ChapterUpStarTaskCommit_7229 getDefaultInstanceForType() {
            return BattleChapterMsg.C2S_ChapterUpStarTaskCommit_7229.getDefaultInstance();
         }

         public C2S_ChapterUpStarTaskCommit_7229 build() {
            C2S_ChapterUpStarTaskCommit_7229 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ChapterUpStarTaskCommit_7229 buildPartial() {
            C2S_ChapterUpStarTaskCommit_7229 result = new C2S_ChapterUpStarTaskCommit_7229(this);
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
            if (other instanceof C2S_ChapterUpStarTaskCommit_7229) {
               return this.mergeFrom((C2S_ChapterUpStarTaskCommit_7229)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ChapterUpStarTaskCommit_7229 other) {
            if (other == BattleChapterMsg.C2S_ChapterUpStarTaskCommit_7229.getDefaultInstance()) {
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
            C2S_ChapterUpStarTaskCommit_7229 parsedMessage = null;

            try {
               parsedMessage = (C2S_ChapterUpStarTaskCommit_7229)BattleChapterMsg.C2S_ChapterUpStarTaskCommit_7229.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ChapterUpStarTaskCommit_7229)e.getUnfinishedMessage();
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

   public static final class S2C_ChapterUpStarTaskCommit_7230 extends GeneratedMessageV3 implements S2C_ChapterUpStarTaskCommit_7230OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_ChapterUpStarTaskCommit_7230 DEFAULT_INSTANCE = new S2C_ChapterUpStarTaskCommit_7230();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ChapterUpStarTaskCommit_7230> PARSER = new AbstractParser<S2C_ChapterUpStarTaskCommit_7230>() {
         public S2C_ChapterUpStarTaskCommit_7230 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ChapterUpStarTaskCommit_7230(input, extensionRegistry);
         }
      };

      private S2C_ChapterUpStarTaskCommit_7230(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ChapterUpStarTaskCommit_7230() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ChapterUpStarTaskCommit_7230();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ChapterUpStarTaskCommit_7230(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterUpStarTaskCommit_7230_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterUpStarTaskCommit_7230_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChapterUpStarTaskCommit_7230.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ChapterUpStarTaskCommit_7230)) {
            return super.equals(obj);
         } else {
            S2C_ChapterUpStarTaskCommit_7230 other = (S2C_ChapterUpStarTaskCommit_7230)obj;
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

      public static S2C_ChapterUpStarTaskCommit_7230 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ChapterUpStarTaskCommit_7230)PARSER.parseFrom(data);
      }

      public static S2C_ChapterUpStarTaskCommit_7230 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChapterUpStarTaskCommit_7230)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChapterUpStarTaskCommit_7230 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ChapterUpStarTaskCommit_7230)PARSER.parseFrom(data);
      }

      public static S2C_ChapterUpStarTaskCommit_7230 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChapterUpStarTaskCommit_7230)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChapterUpStarTaskCommit_7230 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ChapterUpStarTaskCommit_7230)PARSER.parseFrom(data);
      }

      public static S2C_ChapterUpStarTaskCommit_7230 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChapterUpStarTaskCommit_7230)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChapterUpStarTaskCommit_7230 parseFrom(InputStream input) throws IOException {
         return (S2C_ChapterUpStarTaskCommit_7230)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChapterUpStarTaskCommit_7230 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChapterUpStarTaskCommit_7230)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChapterUpStarTaskCommit_7230 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ChapterUpStarTaskCommit_7230)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ChapterUpStarTaskCommit_7230 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChapterUpStarTaskCommit_7230)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChapterUpStarTaskCommit_7230 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ChapterUpStarTaskCommit_7230)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChapterUpStarTaskCommit_7230 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChapterUpStarTaskCommit_7230)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ChapterUpStarTaskCommit_7230 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ChapterUpStarTaskCommit_7230 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ChapterUpStarTaskCommit_7230> parser() {
         return PARSER;
      }

      public Parser<S2C_ChapterUpStarTaskCommit_7230> getParserForType() {
         return PARSER;
      }

      public S2C_ChapterUpStarTaskCommit_7230 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ChapterUpStarTaskCommit_7230OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterUpStarTaskCommit_7230_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterUpStarTaskCommit_7230_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChapterUpStarTaskCommit_7230.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.S2C_ChapterUpStarTaskCommit_7230.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterUpStarTaskCommit_7230_descriptor;
         }

         public S2C_ChapterUpStarTaskCommit_7230 getDefaultInstanceForType() {
            return BattleChapterMsg.S2C_ChapterUpStarTaskCommit_7230.getDefaultInstance();
         }

         public S2C_ChapterUpStarTaskCommit_7230 build() {
            S2C_ChapterUpStarTaskCommit_7230 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ChapterUpStarTaskCommit_7230 buildPartial() {
            S2C_ChapterUpStarTaskCommit_7230 result = new S2C_ChapterUpStarTaskCommit_7230(this);
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
            if (other instanceof S2C_ChapterUpStarTaskCommit_7230) {
               return this.mergeFrom((S2C_ChapterUpStarTaskCommit_7230)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ChapterUpStarTaskCommit_7230 other) {
            if (other == BattleChapterMsg.S2C_ChapterUpStarTaskCommit_7230.getDefaultInstance()) {
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
            S2C_ChapterUpStarTaskCommit_7230 parsedMessage = null;

            try {
               parsedMessage = (S2C_ChapterUpStarTaskCommit_7230)BattleChapterMsg.S2C_ChapterUpStarTaskCommit_7230.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ChapterUpStarTaskCommit_7230)e.getUnfinishedMessage();
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

   public static final class C2S_ChapterSectionTaskList_7231 extends GeneratedMessageV3 implements C2S_ChapterSectionTaskList_7231OrBuilder {
      private static final long serialVersionUID = 0L;
      private byte memoizedIsInitialized;
      private static final C2S_ChapterSectionTaskList_7231 DEFAULT_INSTANCE = new C2S_ChapterSectionTaskList_7231();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ChapterSectionTaskList_7231> PARSER = new AbstractParser<C2S_ChapterSectionTaskList_7231>() {
         public C2S_ChapterSectionTaskList_7231 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ChapterSectionTaskList_7231(input, extensionRegistry);
         }
      };

      private C2S_ChapterSectionTaskList_7231(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ChapterSectionTaskList_7231() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ChapterSectionTaskList_7231();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ChapterSectionTaskList_7231(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterSectionTaskList_7231_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterSectionTaskList_7231_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChapterSectionTaskList_7231.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ChapterSectionTaskList_7231)) {
            return super.equals(obj);
         } else {
            C2S_ChapterSectionTaskList_7231 other = (C2S_ChapterSectionTaskList_7231)obj;
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

      public static C2S_ChapterSectionTaskList_7231 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ChapterSectionTaskList_7231)PARSER.parseFrom(data);
      }

      public static C2S_ChapterSectionTaskList_7231 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChapterSectionTaskList_7231)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChapterSectionTaskList_7231 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ChapterSectionTaskList_7231)PARSER.parseFrom(data);
      }

      public static C2S_ChapterSectionTaskList_7231 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChapterSectionTaskList_7231)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChapterSectionTaskList_7231 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ChapterSectionTaskList_7231)PARSER.parseFrom(data);
      }

      public static C2S_ChapterSectionTaskList_7231 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChapterSectionTaskList_7231)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChapterSectionTaskList_7231 parseFrom(InputStream input) throws IOException {
         return (C2S_ChapterSectionTaskList_7231)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChapterSectionTaskList_7231 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChapterSectionTaskList_7231)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChapterSectionTaskList_7231 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ChapterSectionTaskList_7231)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ChapterSectionTaskList_7231 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChapterSectionTaskList_7231)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChapterSectionTaskList_7231 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ChapterSectionTaskList_7231)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChapterSectionTaskList_7231 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChapterSectionTaskList_7231)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ChapterSectionTaskList_7231 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ChapterSectionTaskList_7231 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ChapterSectionTaskList_7231> parser() {
         return PARSER;
      }

      public Parser<C2S_ChapterSectionTaskList_7231> getParserForType() {
         return PARSER;
      }

      public C2S_ChapterSectionTaskList_7231 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ChapterSectionTaskList_7231OrBuilder {
         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterSectionTaskList_7231_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterSectionTaskList_7231_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChapterSectionTaskList_7231.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.C2S_ChapterSectionTaskList_7231.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterSectionTaskList_7231_descriptor;
         }

         public C2S_ChapterSectionTaskList_7231 getDefaultInstanceForType() {
            return BattleChapterMsg.C2S_ChapterSectionTaskList_7231.getDefaultInstance();
         }

         public C2S_ChapterSectionTaskList_7231 build() {
            C2S_ChapterSectionTaskList_7231 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ChapterSectionTaskList_7231 buildPartial() {
            C2S_ChapterSectionTaskList_7231 result = new C2S_ChapterSectionTaskList_7231(this);
            this.onBuilt();
            return result;
         }

         public Builder clone() {
            return (Builder)super.clone();
         }

         public Builder setField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.setField(field, value);
         }

         public Builder clearField(Descriptors.FieldDescriptor field) {
            return (Builder)super.clearField(field);
         }

         public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
            return (Builder)super.clearOneof(oneof);
         }

         public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index, Object value) {
            return (Builder)super.setRepeatedField(field, index, value);
         }

         public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
            return (Builder)super.addRepeatedField(field, value);
         }

         public Builder mergeFrom(Message other) {
            if (other instanceof C2S_ChapterSectionTaskList_7231) {
               return this.mergeFrom((C2S_ChapterSectionTaskList_7231)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ChapterSectionTaskList_7231 other) {
            if (other == BattleChapterMsg.C2S_ChapterSectionTaskList_7231.getDefaultInstance()) {
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
            C2S_ChapterSectionTaskList_7231 parsedMessage = null;

            try {
               parsedMessage = (C2S_ChapterSectionTaskList_7231)BattleChapterMsg.C2S_ChapterSectionTaskList_7231.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ChapterSectionTaskList_7231)e.getUnfinishedMessage();
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

   public static final class S2C_ChapterSectionTaskList_7232 extends GeneratedMessageV3 implements S2C_ChapterSectionTaskList_7232OrBuilder {
      private static final long serialVersionUID = 0L;
      public static final int TASKLIST_FIELD_NUMBER = 1;
      private List<CommonMsg.Task> taskList_;
      private byte memoizedIsInitialized;
      private static final S2C_ChapterSectionTaskList_7232 DEFAULT_INSTANCE = new S2C_ChapterSectionTaskList_7232();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ChapterSectionTaskList_7232> PARSER = new AbstractParser<S2C_ChapterSectionTaskList_7232>() {
         public S2C_ChapterSectionTaskList_7232 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ChapterSectionTaskList_7232(input, extensionRegistry);
         }
      };

      private S2C_ChapterSectionTaskList_7232(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ChapterSectionTaskList_7232() {
         this.memoizedIsInitialized = -1;
         this.taskList_ = Collections.emptyList();
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ChapterSectionTaskList_7232();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ChapterSectionTaskList_7232(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                           this.taskList_ = new ArrayList();
                           mutable_bitField0_ |= 1;
                        }

                        this.taskList_.add(input.readMessage(CommonMsg.Task.PARSER, extensionRegistry));
                        break;
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
                  this.taskList_ = Collections.unmodifiableList(this.taskList_);
               }

               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterSectionTaskList_7232_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterSectionTaskList_7232_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChapterSectionTaskList_7232.class, Builder.class);
      }

      public List<CommonMsg.Task> getTaskListList() {
         return this.taskList_;
      }

      public List<? extends CommonMsg.TaskOrBuilder> getTaskListOrBuilderList() {
         return this.taskList_;
      }

      public int getTaskListCount() {
         return this.taskList_.size();
      }

      public CommonMsg.Task getTaskList(int index) {
         return (CommonMsg.Task)this.taskList_.get(index);
      }

      public CommonMsg.TaskOrBuilder getTaskListOrBuilder(int index) {
         return (CommonMsg.TaskOrBuilder)this.taskList_.get(index);
      }

      public final boolean isInitialized() {
         byte isInitialized = this.memoizedIsInitialized;
         if (isInitialized == 1) {
            return true;
         } else if (isInitialized == 0) {
            return false;
         } else {
            for(int i = 0; i < this.getTaskListCount(); ++i) {
               if (!this.getTaskList(i).isInitialized()) {
                  this.memoizedIsInitialized = 0;
                  return false;
               }
            }

            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         for(int i = 0; i < this.taskList_.size(); ++i) {
            output.writeMessage(1, (MessageLite)this.taskList_.get(i));
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;

            for(int i = 0; i < this.taskList_.size(); ++i) {
               size += CodedOutputStream.computeMessageSize(1, (MessageLite)this.taskList_.get(i));
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_ChapterSectionTaskList_7232)) {
            return super.equals(obj);
         } else {
            S2C_ChapterSectionTaskList_7232 other = (S2C_ChapterSectionTaskList_7232)obj;
            if (!this.getTaskListList().equals(other.getTaskListList())) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
            }
         }
      }

      public int hashCode() {
         if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
         } else {
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getTaskListCount() > 0) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getTaskListList().hashCode();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_ChapterSectionTaskList_7232 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ChapterSectionTaskList_7232)PARSER.parseFrom(data);
      }

      public static S2C_ChapterSectionTaskList_7232 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChapterSectionTaskList_7232)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChapterSectionTaskList_7232 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ChapterSectionTaskList_7232)PARSER.parseFrom(data);
      }

      public static S2C_ChapterSectionTaskList_7232 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChapterSectionTaskList_7232)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChapterSectionTaskList_7232 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ChapterSectionTaskList_7232)PARSER.parseFrom(data);
      }

      public static S2C_ChapterSectionTaskList_7232 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChapterSectionTaskList_7232)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChapterSectionTaskList_7232 parseFrom(InputStream input) throws IOException {
         return (S2C_ChapterSectionTaskList_7232)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChapterSectionTaskList_7232 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChapterSectionTaskList_7232)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChapterSectionTaskList_7232 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ChapterSectionTaskList_7232)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ChapterSectionTaskList_7232 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChapterSectionTaskList_7232)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChapterSectionTaskList_7232 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ChapterSectionTaskList_7232)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChapterSectionTaskList_7232 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChapterSectionTaskList_7232)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ChapterSectionTaskList_7232 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ChapterSectionTaskList_7232 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ChapterSectionTaskList_7232> parser() {
         return PARSER;
      }

      public Parser<S2C_ChapterSectionTaskList_7232> getParserForType() {
         return PARSER;
      }

      public S2C_ChapterSectionTaskList_7232 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ChapterSectionTaskList_7232OrBuilder {
         private int bitField0_;
         private List<CommonMsg.Task> taskList_;
         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> taskListBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterSectionTaskList_7232_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterSectionTaskList_7232_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChapterSectionTaskList_7232.class, Builder.class);
         }

         private Builder() {
            this.taskList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.taskList_ = Collections.emptyList();
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.S2C_ChapterSectionTaskList_7232.alwaysUseFieldBuilders) {
               this.getTaskListFieldBuilder();
            }

         }

         public Builder clear() {
            super.clear();
            if (this.taskListBuilder_ == null) {
               this.taskList_ = Collections.emptyList();
               this.bitField0_ &= -2;
            } else {
               this.taskListBuilder_.clear();
            }

            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterSectionTaskList_7232_descriptor;
         }

         public S2C_ChapterSectionTaskList_7232 getDefaultInstanceForType() {
            return BattleChapterMsg.S2C_ChapterSectionTaskList_7232.getDefaultInstance();
         }

         public S2C_ChapterSectionTaskList_7232 build() {
            S2C_ChapterSectionTaskList_7232 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ChapterSectionTaskList_7232 buildPartial() {
            S2C_ChapterSectionTaskList_7232 result = new S2C_ChapterSectionTaskList_7232(this);
            int from_bitField0_ = this.bitField0_;
            if (this.taskListBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0) {
                  this.taskList_ = Collections.unmodifiableList(this.taskList_);
                  this.bitField0_ &= -2;
               }

               result.taskList_ = this.taskList_;
            } else {
               result.taskList_ = this.taskListBuilder_.build();
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
            if (other instanceof S2C_ChapterSectionTaskList_7232) {
               return this.mergeFrom((S2C_ChapterSectionTaskList_7232)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ChapterSectionTaskList_7232 other) {
            if (other == BattleChapterMsg.S2C_ChapterSectionTaskList_7232.getDefaultInstance()) {
               return this;
            } else {
               if (this.taskListBuilder_ == null) {
                  if (!other.taskList_.isEmpty()) {
                     if (this.taskList_.isEmpty()) {
                        this.taskList_ = other.taskList_;
                        this.bitField0_ &= -2;
                     } else {
                        this.ensureTaskListIsMutable();
                        this.taskList_.addAll(other.taskList_);
                     }

                     this.onChanged();
                  }
               } else if (!other.taskList_.isEmpty()) {
                  if (this.taskListBuilder_.isEmpty()) {
                     this.taskListBuilder_.dispose();
                     this.taskListBuilder_ = null;
                     this.taskList_ = other.taskList_;
                     this.bitField0_ &= -2;
                     this.taskListBuilder_ = BattleChapterMsg.S2C_ChapterSectionTaskList_7232.alwaysUseFieldBuilders ? this.getTaskListFieldBuilder() : null;
                  } else {
                     this.taskListBuilder_.addAllMessages(other.taskList_);
                  }
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            for(int i = 0; i < this.getTaskListCount(); ++i) {
               if (!this.getTaskList(i).isInitialized()) {
                  return false;
               }
            }

            return true;
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_ChapterSectionTaskList_7232 parsedMessage = null;

            try {
               parsedMessage = (S2C_ChapterSectionTaskList_7232)BattleChapterMsg.S2C_ChapterSectionTaskList_7232.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ChapterSectionTaskList_7232)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         private void ensureTaskListIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
               this.taskList_ = new ArrayList(this.taskList_);
               this.bitField0_ |= 1;
            }

         }

         public List<CommonMsg.Task> getTaskListList() {
            return this.taskListBuilder_ == null ? Collections.unmodifiableList(this.taskList_) : this.taskListBuilder_.getMessageList();
         }

         public int getTaskListCount() {
            return this.taskListBuilder_ == null ? this.taskList_.size() : this.taskListBuilder_.getCount();
         }

         public CommonMsg.Task getTaskList(int index) {
            return this.taskListBuilder_ == null ? (CommonMsg.Task)this.taskList_.get(index) : (CommonMsg.Task)this.taskListBuilder_.getMessage(index);
         }

         public Builder setTaskList(int index, CommonMsg.Task value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.set(index, value);
               this.onChanged();
            } else {
               this.taskListBuilder_.setMessage(index, value);
            }

            return this;
         }

         public Builder setTaskList(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.set(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.setMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(CommonMsg.Task value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.add(value);
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(value);
            }

            return this;
         }

         public Builder addTaskList(int index, CommonMsg.Task value) {
            if (this.taskListBuilder_ == null) {
               if (value == null) {
                  throw new NullPointerException();
               }

               this.ensureTaskListIsMutable();
               this.taskList_.add(index, value);
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(index, value);
            }

            return this;
         }

         public Builder addTaskList(CommonMsg.Task.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(builderForValue.build());
            }

            return this;
         }

         public Builder addTaskList(int index, CommonMsg.Task.Builder builderForValue) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.add(index, builderForValue.build());
               this.onChanged();
            } else {
               this.taskListBuilder_.addMessage(index, builderForValue.build());
            }

            return this;
         }

         public Builder addAllTaskList(Iterable<? extends CommonMsg.Task> values) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               com.google.protobuf.AbstractMessageLite.Builder.addAll(values, this.taskList_);
               this.onChanged();
            } else {
               this.taskListBuilder_.addAllMessages(values);
            }

            return this;
         }

         public Builder clearTaskList() {
            if (this.taskListBuilder_ == null) {
               this.taskList_ = Collections.emptyList();
               this.bitField0_ &= -2;
               this.onChanged();
            } else {
               this.taskListBuilder_.clear();
            }

            return this;
         }

         public Builder removeTaskList(int index) {
            if (this.taskListBuilder_ == null) {
               this.ensureTaskListIsMutable();
               this.taskList_.remove(index);
               this.onChanged();
            } else {
               this.taskListBuilder_.remove(index);
            }

            return this;
         }

         public CommonMsg.Task.Builder getTaskListBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskListFieldBuilder().getBuilder(index);
         }

         public CommonMsg.TaskOrBuilder getTaskListOrBuilder(int index) {
            return this.taskListBuilder_ == null ? (CommonMsg.TaskOrBuilder)this.taskList_.get(index) : (CommonMsg.TaskOrBuilder)this.taskListBuilder_.getMessageOrBuilder(index);
         }

         public List<? extends CommonMsg.TaskOrBuilder> getTaskListOrBuilderList() {
            return this.taskListBuilder_ != null ? this.taskListBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.taskList_);
         }

         public CommonMsg.Task.Builder addTaskListBuilder() {
            return (CommonMsg.Task.Builder)this.getTaskListFieldBuilder().addBuilder(CommonMsg.Task.getDefaultInstance());
         }

         public CommonMsg.Task.Builder addTaskListBuilder(int index) {
            return (CommonMsg.Task.Builder)this.getTaskListFieldBuilder().addBuilder(index, CommonMsg.Task.getDefaultInstance());
         }

         public List<CommonMsg.Task.Builder> getTaskListBuilderList() {
            return this.getTaskListFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<CommonMsg.Task, CommonMsg.Task.Builder, CommonMsg.TaskOrBuilder> getTaskListFieldBuilder() {
            if (this.taskListBuilder_ == null) {
               this.taskListBuilder_ = new RepeatedFieldBuilderV3(this.taskList_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
               this.taskList_ = null;
            }

            return this.taskListBuilder_;
         }

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public static final class C2S_ChapterSectionTaskCommit_7233 extends GeneratedMessageV3 implements C2S_ChapterSectionTaskCommit_7233OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final C2S_ChapterSectionTaskCommit_7233 DEFAULT_INSTANCE = new C2S_ChapterSectionTaskCommit_7233();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_ChapterSectionTaskCommit_7233> PARSER = new AbstractParser<C2S_ChapterSectionTaskCommit_7233>() {
         public C2S_ChapterSectionTaskCommit_7233 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_ChapterSectionTaskCommit_7233(input, extensionRegistry);
         }
      };

      private C2S_ChapterSectionTaskCommit_7233(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_ChapterSectionTaskCommit_7233() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_ChapterSectionTaskCommit_7233();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_ChapterSectionTaskCommit_7233(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterSectionTaskCommit_7233_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterSectionTaskCommit_7233_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChapterSectionTaskCommit_7233.class, Builder.class);
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
         } else if (!(obj instanceof C2S_ChapterSectionTaskCommit_7233)) {
            return super.equals(obj);
         } else {
            C2S_ChapterSectionTaskCommit_7233 other = (C2S_ChapterSectionTaskCommit_7233)obj;
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

      public static C2S_ChapterSectionTaskCommit_7233 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_ChapterSectionTaskCommit_7233)PARSER.parseFrom(data);
      }

      public static C2S_ChapterSectionTaskCommit_7233 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChapterSectionTaskCommit_7233)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChapterSectionTaskCommit_7233 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_ChapterSectionTaskCommit_7233)PARSER.parseFrom(data);
      }

      public static C2S_ChapterSectionTaskCommit_7233 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChapterSectionTaskCommit_7233)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChapterSectionTaskCommit_7233 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_ChapterSectionTaskCommit_7233)PARSER.parseFrom(data);
      }

      public static C2S_ChapterSectionTaskCommit_7233 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_ChapterSectionTaskCommit_7233)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_ChapterSectionTaskCommit_7233 parseFrom(InputStream input) throws IOException {
         return (C2S_ChapterSectionTaskCommit_7233)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChapterSectionTaskCommit_7233 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChapterSectionTaskCommit_7233)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChapterSectionTaskCommit_7233 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_ChapterSectionTaskCommit_7233)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_ChapterSectionTaskCommit_7233 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChapterSectionTaskCommit_7233)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_ChapterSectionTaskCommit_7233 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_ChapterSectionTaskCommit_7233)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_ChapterSectionTaskCommit_7233 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_ChapterSectionTaskCommit_7233)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_ChapterSectionTaskCommit_7233 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_ChapterSectionTaskCommit_7233 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_ChapterSectionTaskCommit_7233> parser() {
         return PARSER;
      }

      public Parser<C2S_ChapterSectionTaskCommit_7233> getParserForType() {
         return PARSER;
      }

      public C2S_ChapterSectionTaskCommit_7233 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_ChapterSectionTaskCommit_7233OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterSectionTaskCommit_7233_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterSectionTaskCommit_7233_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_ChapterSectionTaskCommit_7233.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.C2S_ChapterSectionTaskCommit_7233.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_ChapterSectionTaskCommit_7233_descriptor;
         }

         public C2S_ChapterSectionTaskCommit_7233 getDefaultInstanceForType() {
            return BattleChapterMsg.C2S_ChapterSectionTaskCommit_7233.getDefaultInstance();
         }

         public C2S_ChapterSectionTaskCommit_7233 build() {
            C2S_ChapterSectionTaskCommit_7233 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_ChapterSectionTaskCommit_7233 buildPartial() {
            C2S_ChapterSectionTaskCommit_7233 result = new C2S_ChapterSectionTaskCommit_7233(this);
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
            if (other instanceof C2S_ChapterSectionTaskCommit_7233) {
               return this.mergeFrom((C2S_ChapterSectionTaskCommit_7233)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_ChapterSectionTaskCommit_7233 other) {
            if (other == BattleChapterMsg.C2S_ChapterSectionTaskCommit_7233.getDefaultInstance()) {
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
            C2S_ChapterSectionTaskCommit_7233 parsedMessage = null;

            try {
               parsedMessage = (C2S_ChapterSectionTaskCommit_7233)BattleChapterMsg.C2S_ChapterSectionTaskCommit_7233.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_ChapterSectionTaskCommit_7233)e.getUnfinishedMessage();
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

   public static final class S2C_ChapterSectionTaskCommit_7234 extends GeneratedMessageV3 implements S2C_ChapterSectionTaskCommit_7234OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int TASKID_FIELD_NUMBER = 1;
      private int taskId_;
      private byte memoizedIsInitialized;
      private static final S2C_ChapterSectionTaskCommit_7234 DEFAULT_INSTANCE = new S2C_ChapterSectionTaskCommit_7234();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_ChapterSectionTaskCommit_7234> PARSER = new AbstractParser<S2C_ChapterSectionTaskCommit_7234>() {
         public S2C_ChapterSectionTaskCommit_7234 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_ChapterSectionTaskCommit_7234(input, extensionRegistry);
         }
      };

      private S2C_ChapterSectionTaskCommit_7234(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_ChapterSectionTaskCommit_7234() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_ChapterSectionTaskCommit_7234();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_ChapterSectionTaskCommit_7234(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterSectionTaskCommit_7234_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterSectionTaskCommit_7234_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChapterSectionTaskCommit_7234.class, Builder.class);
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
         } else if (!(obj instanceof S2C_ChapterSectionTaskCommit_7234)) {
            return super.equals(obj);
         } else {
            S2C_ChapterSectionTaskCommit_7234 other = (S2C_ChapterSectionTaskCommit_7234)obj;
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

      public static S2C_ChapterSectionTaskCommit_7234 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_ChapterSectionTaskCommit_7234)PARSER.parseFrom(data);
      }

      public static S2C_ChapterSectionTaskCommit_7234 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChapterSectionTaskCommit_7234)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChapterSectionTaskCommit_7234 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_ChapterSectionTaskCommit_7234)PARSER.parseFrom(data);
      }

      public static S2C_ChapterSectionTaskCommit_7234 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChapterSectionTaskCommit_7234)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChapterSectionTaskCommit_7234 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_ChapterSectionTaskCommit_7234)PARSER.parseFrom(data);
      }

      public static S2C_ChapterSectionTaskCommit_7234 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_ChapterSectionTaskCommit_7234)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_ChapterSectionTaskCommit_7234 parseFrom(InputStream input) throws IOException {
         return (S2C_ChapterSectionTaskCommit_7234)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChapterSectionTaskCommit_7234 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChapterSectionTaskCommit_7234)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChapterSectionTaskCommit_7234 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_ChapterSectionTaskCommit_7234)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_ChapterSectionTaskCommit_7234 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChapterSectionTaskCommit_7234)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_ChapterSectionTaskCommit_7234 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_ChapterSectionTaskCommit_7234)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_ChapterSectionTaskCommit_7234 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_ChapterSectionTaskCommit_7234)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_ChapterSectionTaskCommit_7234 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_ChapterSectionTaskCommit_7234 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_ChapterSectionTaskCommit_7234> parser() {
         return PARSER;
      }

      public Parser<S2C_ChapterSectionTaskCommit_7234> getParserForType() {
         return PARSER;
      }

      public S2C_ChapterSectionTaskCommit_7234 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_ChapterSectionTaskCommit_7234OrBuilder {
         private int bitField0_;
         private int taskId_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterSectionTaskCommit_7234_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterSectionTaskCommit_7234_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_ChapterSectionTaskCommit_7234.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.S2C_ChapterSectionTaskCommit_7234.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.taskId_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_ChapterSectionTaskCommit_7234_descriptor;
         }

         public S2C_ChapterSectionTaskCommit_7234 getDefaultInstanceForType() {
            return BattleChapterMsg.S2C_ChapterSectionTaskCommit_7234.getDefaultInstance();
         }

         public S2C_ChapterSectionTaskCommit_7234 build() {
            S2C_ChapterSectionTaskCommit_7234 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_ChapterSectionTaskCommit_7234 buildPartial() {
            S2C_ChapterSectionTaskCommit_7234 result = new S2C_ChapterSectionTaskCommit_7234(this);
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
            if (other instanceof S2C_ChapterSectionTaskCommit_7234) {
               return this.mergeFrom((S2C_ChapterSectionTaskCommit_7234)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_ChapterSectionTaskCommit_7234 other) {
            if (other == BattleChapterMsg.S2C_ChapterSectionTaskCommit_7234.getDefaultInstance()) {
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
            S2C_ChapterSectionTaskCommit_7234 parsedMessage = null;

            try {
               parsedMessage = (S2C_ChapterSectionTaskCommit_7234)BattleChapterMsg.S2C_ChapterSectionTaskCommit_7234.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_ChapterSectionTaskCommit_7234)e.getUnfinishedMessage();
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

   public static final class C2S_FastBattleAdd_7235 extends GeneratedMessageV3 implements C2S_FastBattleAdd_7235OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int GUIDESTEP_FIELD_NUMBER = 1;
      private int guideStep_;
      private byte memoizedIsInitialized;
      private static final C2S_FastBattleAdd_7235 DEFAULT_INSTANCE = new C2S_FastBattleAdd_7235();
      /** @deprecated */
      @Deprecated
      public static final Parser<C2S_FastBattleAdd_7235> PARSER = new AbstractParser<C2S_FastBattleAdd_7235>() {
         public C2S_FastBattleAdd_7235 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new C2S_FastBattleAdd_7235(input, extensionRegistry);
         }
      };

      private C2S_FastBattleAdd_7235(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private C2S_FastBattleAdd_7235() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new C2S_FastBattleAdd_7235();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private C2S_FastBattleAdd_7235(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_FastBattleAdd_7235_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_FastBattleAdd_7235_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FastBattleAdd_7235.class, Builder.class);
      }

      public boolean hasGuideStep() {
         return (this.bitField0_ & 1) != 0;
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.guideStep_);
         }

         this.unknownFields.writeTo(output);
      }

      public int getSerializedSize() {
         int size = this.memoizedSize;
         if (size != -1) {
            return size;
         } else {
            size = 0;
            if ((this.bitField0_ & 1) != 0) {
               size += CodedOutputStream.computeInt32Size(1, this.guideStep_);
            }

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof C2S_FastBattleAdd_7235)) {
            return super.equals(obj);
         } else {
            C2S_FastBattleAdd_7235 other = (C2S_FastBattleAdd_7235)obj;
            if (this.hasGuideStep() != other.hasGuideStep()) {
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
            if (this.hasGuideStep()) {
               hash = 37 * hash + 1;
               hash = 53 * hash + this.getGuideStep();
            }

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static C2S_FastBattleAdd_7235 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (C2S_FastBattleAdd_7235)PARSER.parseFrom(data);
      }

      public static C2S_FastBattleAdd_7235 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FastBattleAdd_7235)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FastBattleAdd_7235 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (C2S_FastBattleAdd_7235)PARSER.parseFrom(data);
      }

      public static C2S_FastBattleAdd_7235 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FastBattleAdd_7235)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FastBattleAdd_7235 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (C2S_FastBattleAdd_7235)PARSER.parseFrom(data);
      }

      public static C2S_FastBattleAdd_7235 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (C2S_FastBattleAdd_7235)PARSER.parseFrom(data, extensionRegistry);
      }

      public static C2S_FastBattleAdd_7235 parseFrom(InputStream input) throws IOException {
         return (C2S_FastBattleAdd_7235)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FastBattleAdd_7235 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FastBattleAdd_7235)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FastBattleAdd_7235 parseDelimitedFrom(InputStream input) throws IOException {
         return (C2S_FastBattleAdd_7235)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static C2S_FastBattleAdd_7235 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FastBattleAdd_7235)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static C2S_FastBattleAdd_7235 parseFrom(CodedInputStream input) throws IOException {
         return (C2S_FastBattleAdd_7235)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static C2S_FastBattleAdd_7235 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (C2S_FastBattleAdd_7235)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(C2S_FastBattleAdd_7235 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static C2S_FastBattleAdd_7235 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<C2S_FastBattleAdd_7235> parser() {
         return PARSER;
      }

      public Parser<C2S_FastBattleAdd_7235> getParserForType() {
         return PARSER;
      }

      public C2S_FastBattleAdd_7235 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements C2S_FastBattleAdd_7235OrBuilder {
         private int bitField0_;
         private int guideStep_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_FastBattleAdd_7235_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_FastBattleAdd_7235_fieldAccessorTable.ensureFieldAccessorsInitialized(C2S_FastBattleAdd_7235.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.C2S_FastBattleAdd_7235.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.guideStep_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_C2S_FastBattleAdd_7235_descriptor;
         }

         public C2S_FastBattleAdd_7235 getDefaultInstanceForType() {
            return BattleChapterMsg.C2S_FastBattleAdd_7235.getDefaultInstance();
         }

         public C2S_FastBattleAdd_7235 build() {
            C2S_FastBattleAdd_7235 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public C2S_FastBattleAdd_7235 buildPartial() {
            C2S_FastBattleAdd_7235 result = new C2S_FastBattleAdd_7235(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.guideStep_ = this.guideStep_;
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
            if (other instanceof C2S_FastBattleAdd_7235) {
               return this.mergeFrom((C2S_FastBattleAdd_7235)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(C2S_FastBattleAdd_7235 other) {
            if (other == BattleChapterMsg.C2S_FastBattleAdd_7235.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasGuideStep()) {
                  this.setGuideStep(other.getGuideStep());
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
            C2S_FastBattleAdd_7235 parsedMessage = null;

            try {
               parsedMessage = (C2S_FastBattleAdd_7235)BattleChapterMsg.C2S_FastBattleAdd_7235.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (C2S_FastBattleAdd_7235)e.getUnfinishedMessage();
               throw e.unwrapIOException();
            } finally {
               if (parsedMessage != null) {
                  this.mergeFrom(parsedMessage);
               }

            }

            return this;
         }

         public boolean hasGuideStep() {
            return (this.bitField0_ & 1) != 0;
         }

         public int getGuideStep() {
            return this.guideStep_;
         }

         public Builder setGuideStep(int value) {
            this.bitField0_ |= 1;
            this.guideStep_ = value;
            this.onChanged();
            return this;
         }

         public Builder clearGuideStep() {
            this.bitField0_ &= -2;
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

   public static final class S2C_FastBattleAdd_7236 extends GeneratedMessageV3 implements S2C_FastBattleAdd_7236OrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int FIGHTNUM_FIELD_NUMBER = 1;
      private int fightNum_;
      private byte memoizedIsInitialized;
      private static final S2C_FastBattleAdd_7236 DEFAULT_INSTANCE = new S2C_FastBattleAdd_7236();
      /** @deprecated */
      @Deprecated
      public static final Parser<S2C_FastBattleAdd_7236> PARSER = new AbstractParser<S2C_FastBattleAdd_7236>() {
         public S2C_FastBattleAdd_7236 parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return new S2C_FastBattleAdd_7236(input, extensionRegistry);
         }
      };

      private S2C_FastBattleAdd_7236(GeneratedMessageV3.Builder<?> builder) {
         super(builder);
         this.memoizedIsInitialized = -1;
      }

      private S2C_FastBattleAdd_7236() {
         this.memoizedIsInitialized = -1;
      }

      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unused) {
         return new S2C_FastBattleAdd_7236();
      }

      public final UnknownFieldSet getUnknownFields() {
         return this.unknownFields;
      }

      private S2C_FastBattleAdd_7236(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         this();
         if (extensionRegistry == null) {
            throw new NullPointerException();
         } else {
            int mutable_bitField0_ = 0;
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
                     default:
                        if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                           done = true;
                        }
                  }
               }
            } catch (InvalidProtocolBufferException e) {
               throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
               throw (new InvalidProtocolBufferException(e)).setUnfinishedMessage(this);
            } finally {
               this.unknownFields = unknownFields.build();
               this.makeExtensionsImmutable();
            }

         }
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_FastBattleAdd_7236_descriptor;
      }

      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_FastBattleAdd_7236_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FastBattleAdd_7236.class, Builder.class);
      }

      public boolean hasFightNum() {
         return (this.bitField0_ & 1) != 0;
      }

      public int getFightNum() {
         return this.fightNum_;
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
         } else {
            this.memoizedIsInitialized = 1;
            return true;
         }
      }

      public void writeTo(CodedOutputStream output) throws IOException {
         if ((this.bitField0_ & 1) != 0) {
            output.writeInt32(1, this.fightNum_);
         }

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

            size += this.unknownFields.getSerializedSize();
            this.memoizedSize = size;
            return size;
         }
      }

      public boolean equals(final Object obj) {
         if (obj == this) {
            return true;
         } else if (!(obj instanceof S2C_FastBattleAdd_7236)) {
            return super.equals(obj);
         } else {
            S2C_FastBattleAdd_7236 other = (S2C_FastBattleAdd_7236)obj;
            if (this.hasFightNum() != other.hasFightNum()) {
               return false;
            } else if (this.hasFightNum() && this.getFightNum() != other.getFightNum()) {
               return false;
            } else {
               return this.unknownFields.equals(other.unknownFields);
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

            hash = 29 * hash + this.unknownFields.hashCode();
            this.memoizedHashCode = hash;
            return hash;
         }
      }

      public static S2C_FastBattleAdd_7236 parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
         return (S2C_FastBattleAdd_7236)PARSER.parseFrom(data);
      }

      public static S2C_FastBattleAdd_7236 parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FastBattleAdd_7236)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FastBattleAdd_7236 parseFrom(ByteString data) throws InvalidProtocolBufferException {
         return (S2C_FastBattleAdd_7236)PARSER.parseFrom(data);
      }

      public static S2C_FastBattleAdd_7236 parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FastBattleAdd_7236)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FastBattleAdd_7236 parseFrom(byte[] data) throws InvalidProtocolBufferException {
         return (S2C_FastBattleAdd_7236)PARSER.parseFrom(data);
      }

      public static S2C_FastBattleAdd_7236 parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
         return (S2C_FastBattleAdd_7236)PARSER.parseFrom(data, extensionRegistry);
      }

      public static S2C_FastBattleAdd_7236 parseFrom(InputStream input) throws IOException {
         return (S2C_FastBattleAdd_7236)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FastBattleAdd_7236 parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FastBattleAdd_7236)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FastBattleAdd_7236 parseDelimitedFrom(InputStream input) throws IOException {
         return (S2C_FastBattleAdd_7236)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
      }

      public static S2C_FastBattleAdd_7236 parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FastBattleAdd_7236)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }

      public static S2C_FastBattleAdd_7236 parseFrom(CodedInputStream input) throws IOException {
         return (S2C_FastBattleAdd_7236)GeneratedMessageV3.parseWithIOException(PARSER, input);
      }

      public static S2C_FastBattleAdd_7236 parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
         return (S2C_FastBattleAdd_7236)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
      }

      public Builder newBuilderForType() {
         return newBuilder();
      }

      public static Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static Builder newBuilder(S2C_FastBattleAdd_7236 prototype) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }

      public Builder toBuilder() {
         return this == DEFAULT_INSTANCE ? new Builder() : (new Builder()).mergeFrom(this);
      }

      protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
         Builder builder = new Builder(parent);
         return builder;
      }

      public static S2C_FastBattleAdd_7236 getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<S2C_FastBattleAdd_7236> parser() {
         return PARSER;
      }

      public Parser<S2C_FastBattleAdd_7236> getParserForType() {
         return PARSER;
      }

      public S2C_FastBattleAdd_7236 getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements S2C_FastBattleAdd_7236OrBuilder {
         private int bitField0_;
         private int fightNum_;

         public static final Descriptors.Descriptor getDescriptor() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_FastBattleAdd_7236_descriptor;
         }

         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_FastBattleAdd_7236_fieldAccessorTable.ensureFieldAccessorsInitialized(S2C_FastBattleAdd_7236.class, Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (BattleChapterMsg.S2C_FastBattleAdd_7236.alwaysUseFieldBuilders) {
            }

         }

         public Builder clear() {
            super.clear();
            this.fightNum_ = 0;
            this.bitField0_ &= -2;
            return this;
         }

         public Descriptors.Descriptor getDescriptorForType() {
            return BattleChapterMsg.internal_static_battleChapter_com_gzbz_protobuf_S2C_FastBattleAdd_7236_descriptor;
         }

         public S2C_FastBattleAdd_7236 getDefaultInstanceForType() {
            return BattleChapterMsg.S2C_FastBattleAdd_7236.getDefaultInstance();
         }

         public S2C_FastBattleAdd_7236 build() {
            S2C_FastBattleAdd_7236 result = this.buildPartial();
            if (!result.isInitialized()) {
               throw newUninitializedMessageException(result);
            } else {
               return result;
            }
         }

         public S2C_FastBattleAdd_7236 buildPartial() {
            S2C_FastBattleAdd_7236 result = new S2C_FastBattleAdd_7236(this);
            int from_bitField0_ = this.bitField0_;
            int to_bitField0_ = 0;
            if ((from_bitField0_ & 1) != 0) {
               result.fightNum_ = this.fightNum_;
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
            if (other instanceof S2C_FastBattleAdd_7236) {
               return this.mergeFrom((S2C_FastBattleAdd_7236)other);
            } else {
               super.mergeFrom(other);
               return this;
            }
         }

         public Builder mergeFrom(S2C_FastBattleAdd_7236 other) {
            if (other == BattleChapterMsg.S2C_FastBattleAdd_7236.getDefaultInstance()) {
               return this;
            } else {
               if (other.hasFightNum()) {
                  this.setFightNum(other.getFightNum());
               }

               this.mergeUnknownFields(other.unknownFields);
               this.onChanged();
               return this;
            }
         }

         public final boolean isInitialized() {
            return this.hasFightNum();
         }

         public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            S2C_FastBattleAdd_7236 parsedMessage = null;

            try {
               parsedMessage = (S2C_FastBattleAdd_7236)BattleChapterMsg.S2C_FastBattleAdd_7236.PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (InvalidProtocolBufferException e) {
               parsedMessage = (S2C_FastBattleAdd_7236)e.getUnfinishedMessage();
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

         public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.setUnknownFields(unknownFields);
         }

         public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
            return (Builder)super.mergeUnknownFields(unknownFields);
         }
      }
   }

   public interface C2S_ChapterPassRecord_7213OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ChapterRank_7209OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ChapterSectionTaskCommit_7233OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_ChapterSectionTaskList_7231OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ChapterUpStarTaskCommit_7229OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface C2S_ChapterUpStarTaskList_7227OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_FastBattleAdd_7235OrBuilder extends MessageOrBuilder {
      boolean hasGuideStep();

      int getGuideStep();
   }

   public interface C2S_FastBattle_7207OrBuilder extends MessageOrBuilder {
      boolean hasGuideStep();

      int getGuideStep();
   }

   public interface C2S_HeroStrongList_7225OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_OpenMainUi_7201OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_ShowAwards_7223OrBuilder extends MessageOrBuilder {
   }

   public interface C2S_TakeBonusAwardId_7219OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_TakeCommonAward_7217OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();

      boolean hasGuideStep();

      int getGuideStep();
   }

   public interface C2S_TakeOnlineTimeAward_7221OrBuilder extends MessageOrBuilder {
      boolean hasId();

      int getId();
   }

   public interface C2S_TakeTimeReward_7205OrBuilder extends MessageOrBuilder {
   }

   public interface CrossChapterInfoOrBuilder extends MessageOrBuilder {
      boolean hasType();

      CrossChapterType getType();

      boolean hasPlayerId();

      int getPlayerId();

      boolean hasTime();

      int getTime();

      boolean hasRecordId();

      int getRecordId();
   }

   public interface HeroStrongInfoOrBuilder extends MessageOrBuilder {
      boolean hasHeroId();

      int getHeroId();

      boolean hasHeroLv();

      int getHeroLv();

      boolean hasHeroStar();

      int getHeroStar();

      boolean hasHeroName();

      String getHeroName();

      ByteString getHeroNameBytes();

      List<ScoreModel> getModelsList();

      ScoreModel getModels(int index);

      int getModelsCount();

      List<? extends ScoreModelOrBuilder> getModelsOrBuilderList();

      ScoreModelOrBuilder getModelsOrBuilder(int index);

      List<CommonMsg.StarMapPointInfo> getStarMapPointInfoList();

      CommonMsg.StarMapPointInfo getStarMapPointInfo(int index);

      int getStarMapPointInfoCount();

      List<? extends CommonMsg.StarMapPointInfoOrBuilder> getStarMapPointInfoOrBuilderList();

      CommonMsg.StarMapPointInfoOrBuilder getStarMapPointInfoOrBuilder(int index);

      boolean hasInheritNation();

      int getInheritNation();
   }

   public interface MainUiInfoOrBuilder extends MessageOrBuilder {
      boolean hasChapterId();

      int getChapterId();

      boolean hasStartTime();

      int getStartTime();

      boolean hasFreeFightNum();

      int getFreeFightNum();

      boolean hasGoldFightNum();

      int getGoldFightNum();

      boolean hasType();

      int getType();

      boolean hasRecordTime();

      int getRecordTime();

      boolean hasTime();

      int getTime();

      List<Integer> getAwardIdsList();

      int getAwardIdsCount();

      int getAwardIds(int index);

      boolean hasGiveNum();

      int getGiveNum();

      boolean hasFastFightAddNum();

      int getFastFightAddNum();
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

      boolean hasCrossNum();

      int getCrossNum();
   }

   public interface S2C_BonusAwardsId_7220OrBuilder extends MessageOrBuilder {
      List<Integer> getIdsList();

      int getIdsCount();

      int getIds(int index);
   }

   public interface S2C_ChapterPassRecordResult_7214OrBuilder extends MessageOrBuilder {
      boolean hasChapterId();

      int getChapterId();

      List<CrossChapterInfo> getInfosList();

      CrossChapterInfo getInfos(int index);

      int getInfosCount();

      List<? extends CrossChapterInfoOrBuilder> getInfosOrBuilderList();

      CrossChapterInfoOrBuilder getInfosOrBuilder(int index);
   }

   public interface S2C_ChapterRankResult_7210OrBuilder extends MessageOrBuilder {
      boolean hasMyRank();

      int getMyRank();

      List<RankInfo> getInfosList();

      RankInfo getInfos(int index);

      int getInfosCount();

      List<? extends RankInfoOrBuilder> getInfosOrBuilderList();

      RankInfoOrBuilder getInfosOrBuilder(int index);
   }

   public interface S2C_ChapterSectionTaskCommit_7234OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_ChapterSectionTaskList_7232OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskListList();

      CommonMsg.Task getTaskList(int index);

      int getTaskListCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskListOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskListOrBuilder(int index);
   }

   public interface S2C_ChapterUpStarTaskCommit_7230OrBuilder extends MessageOrBuilder {
      boolean hasTaskId();

      int getTaskId();
   }

   public interface S2C_ChapterUpStarTaskList_7228OrBuilder extends MessageOrBuilder {
      List<CommonMsg.Task> getTaskListList();

      CommonMsg.Task getTaskList(int index);

      int getTaskListCount();

      List<? extends CommonMsg.TaskOrBuilder> getTaskListOrBuilderList();

      CommonMsg.TaskOrBuilder getTaskListOrBuilder(int index);
   }

   public interface S2C_CommonAwardId_7218OrBuilder extends MessageOrBuilder {
      List<Integer> getIdsList();

      int getIdsCount();

      int getIds(int index);
   }

   public interface S2C_FastBattleAdd_7236OrBuilder extends MessageOrBuilder {
      boolean hasFightNum();

      int getFightNum();
   }

   public interface S2C_FastBattleResult_7208OrBuilder extends MessageOrBuilder {
      boolean hasFreeFightNum();

      int getFreeFightNum();

      boolean hasGoldFightNum();

      int getGoldFightNum();

      boolean hasGiveNum();

      int getGiveNum();

      boolean hasFastFightAdd();

      int getFastFightAdd();
   }

   public interface S2C_HeroStrongListResult_7226OrBuilder extends MessageOrBuilder {
      List<HeroStrongInfo> getInfosList();

      HeroStrongInfo getInfos(int index);

      int getInfosCount();

      List<? extends HeroStrongInfoOrBuilder> getInfosOrBuilderList();

      HeroStrongInfoOrBuilder getInfosOrBuilder(int index);
   }

   public interface S2C_OpenMainUiResult_7202OrBuilder extends MessageOrBuilder {
      boolean hasInfo();

      MainUiInfo getInfo();

      MainUiInfoOrBuilder getInfoOrBuilder();
   }

   public interface S2C_ShowAwardsResult_7224OrBuilder extends MessageOrBuilder {
      List<CommonMsg.ItemInfo> getItemsList();

      CommonMsg.ItemInfo getItems(int index);

      int getItemsCount();

      List<? extends CommonMsg.ItemInfoOrBuilder> getItemsOrBuilderList();

      CommonMsg.ItemInfoOrBuilder getItemsOrBuilder(int index);
   }

   public interface S2C_TakeOnlineTimeAwardResult_7222OrBuilder extends MessageOrBuilder {
      boolean hasRecordTime();

      int getRecordTime();

      boolean hasTime();

      int getTime();

      List<Integer> getAwardIdsList();

      int getAwardIdsCount();

      int getAwardIds(int index);
   }

   public interface S2C_TakeTimeRewardResult_7206OrBuilder extends MessageOrBuilder {
      boolean hasTime();

      int getTime();
   }

   public interface ScoreModelOrBuilder extends MessageOrBuilder {
      boolean hasType();

      ScoreType getType();

      boolean hasMyScore();

      int getMyScore();

      boolean hasMaxScore();

      int getMaxScore();
   }
}
