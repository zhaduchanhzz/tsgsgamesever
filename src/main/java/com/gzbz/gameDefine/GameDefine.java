package com.gzbz.gameDefine;

import com.gzbz.db.bean.ExpeditionBuffAddtionData;
import com.gzbz.db.bean.ExpeditionRecordData;
import com.gzbz.db.worldBean.ActivityData;
import com.gzbz.db.worldBean.DuelData;
import com.gzbz.db.worldBean.GameManagerData;
import com.gzbz.db.worldBean.GeneralWelfareData;
import com.gzbz.db.worldBean.HeroRankData;
import com.gzbz.db.worldBean.KingOfCentralPlainsData;
import com.gzbz.db.worldBean.MergeActivityData;
import com.gzbz.db.worldBean.MineRecordData;
import com.gzbz.db.worldBean.PvpMergerData;
import com.gzbz.db.worldBean.PvpSeasonData;
import com.gzbz.db.worldBean.WorldData;
import com.gzbz.godBeast.bean.CrossGodBeastHatchData;
import com.gzbz.mart.bean.CrossMartWorldData;
import com.gzbz.war.jingzhou.JingZhouData;
import com.yy.duelWar.CrossDuelZoneData;
import com.yy.peak.bean.PeakZoneData;
import com.yy.supremePvp.CrossSupremePvpSeasonData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Component;

@Component
public class GameDefine {
   public static final String SPLIT_FRIST = "\u0001";
   public static final String SPLIT_SECOND = "\u0002";
   public static final String SPLIT_THIRD = "\u0003";
   public static final String SPLIT_FORTH = "\u0004";
   public static final String SPLIT_SUB_SEMICOLON = ";";
   public static final String SPLIT_SUB_COMMA = ",";
   public static final String SPLIT_SUB_COLON = ":";
   public static final String SPLIT_SUB_AT = "@";
   public static final String SPLIT_SUB_UNDER_LINE = "_";
   public static final String SPLIT_HERO_MIRROR_FRIST = "\u0011";
   public static final String SPLIT_HERO_MIRROR_SECOND = "\u0012";
   public static final String SPLIT_HERO_MIRROR_THRID = "\u0013";
   public static final String SPLIT_HERO_MIRROR_FORTH = "\u0014";
   public static final String SPLIT_STRING_ARRAYING_FIRST = "arrFir";
   public static final String SPLIT_STRING_ARRAYING_SECOND = "arrSec";
   public static final String SPLIT_STRING_ARRAYING_THIRID = "arrThi";
   public static final String SPLIT_STRING_ARRAYING_FORTH = "arrFor";
   public static final short CROSS_ZONE_NUM = 4;
   public static final short CROSS_MIN_UNION_WAR = 4;
   public static final short CROSS_MIN_WATER_TRANSPORT = 4;
   public static final short CROSS_MIN_COUNTRY_WAR = 2;
   public static final short CROSS_MIN_CHAT = 1;
   public static final short CROSS_MIN_ALLIANCE = 4;
   public static int ROBOT_TYPE_COMMON = 1;
   public static int ROBOT_TYPE_PVP = 2;
   public static final int CROSS_WORLD_DRAGON_TREASURE = 2;

   public static enum WorldModule {
      WORLD_DAO_WORLD(1, WorldData.class),
      WORLD_DAO_ACTIVITY(2, ActivityData.class),
      WORLD_DAO_GENERAL_WELFARE(3, GeneralWelfareData.class),
      WORLD_DAO_WAR_JZ_HERO(6, JingZhouData.class),
      WORLD_DAO_PVP_REASON(7, PvpSeasonData.class),
      WORLD_DAO_KING_CP(8, KingOfCentralPlainsData.class),
      WORLD_DAO_HERO_SCORE(10, ConcurrentHashMap.class),
      WORLD_DAO_AUTO_BATTLE(11, HashSet.class),
      WORLD_DAO_HERO_TRAINING_ENTER_BATTLE(14, HashSet.class),
      WORLD_DAO_GAME_MANAGER(18, GameManagerData.class),
      WORLD_DAO_EXPEDITION_RECORD_LOWEST(19, HashMap.class, Integer.class, ExpeditionRecordData.class),
      WORLD_DAO_EXPEDITION_RECORD_NEAREST(20, HashMap.class, Integer.class, ExpeditionRecordData.class),
      WORLD_MINE_RECORD(22, MineRecordData.class),
      WORLD_LADDER_CHAMPION(23, HashMap.class, Integer.class, Integer.class),
      WORLD_DAO_EXPEDITION_BUFF_ADDITION(24, ExpeditionBuffAddtionData.class),
      WORLD_DAO_HERO_RANK_NEW(25, HeroRankData.class),
      WORLD_DAO_DUEL(26, DuelData.class),
      WORLD_DAO_UNION_COPY(27, HashSet.class),
      WORLD_DAO_LEVEL_PROMOTE_RECORD(28, HashMap.class, Integer.class, ArrayList.class),
      WORLD_DAO_MERGE_ACTIVITY(29, MergeActivityData.class),
      WORLD_DAO_PVP_MERGE(30, PvpMergerData.class),
      WORLD_DAO_STONEHENGE_PATH(31, ArrayList.class);

      public int id;
      public Class<?> clz;
      public Class<? extends Map> mapClz;
      public Class<?> mapKeyClz;
      public Class<?> mapValClz;

      private WorldModule(int id, Class<?> clz) {
         this.id = id;
         this.clz = clz;
      }

      private WorldModule(int id, Class<? extends Map> mapClz, Class<?> mapKeyClz, Class<?> mapValClz) {
         this.id = id;
         this.mapClz = mapClz;
         this.mapKeyClz = mapKeyClz;
         this.mapValClz = mapValClz;
      }
   }

   public static enum CrossWorldModule {
      CROSS_WORLD_PEAK(1, PeakZoneData.class),
      CROSS_WORLD_DUEL(3, CrossDuelZoneData.class),
      CROSS_WORLD_MART(4, CrossMartWorldData.class),
      CROSS_GOD_BEAST_HATCH(5, CrossGodBeastHatchData.class),
      CROSS_SUPREME_PVP(6, CrossSupremePvpSeasonData.class);

      public int id;
      public Class<?> clz;
      public Class<? extends Map> mapClz;
      public Class<?> mapKeyClz;
      public Class<?> mapValClz;

      private CrossWorldModule(int id, Class<?> clz) {
         this.id = id;
         this.clz = clz;
      }

      private CrossWorldModule(int id, Class<? extends Map> mapClz, Class<?> mapKeyClz, Class<?> mapValClz) {
         this.id = id;
         this.mapClz = mapClz;
         this.mapKeyClz = mapKeyClz;
         this.mapValClz = mapValClz;
      }
   }
}
