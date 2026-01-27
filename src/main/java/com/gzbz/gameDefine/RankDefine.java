package com.gzbz.gameDefine;

import com.gzbz.protobuf.RankMsg;

public class RankDefine {
   public static final int MAX_RANK_100 = 100;
   public static final int MAX_RANK_200 = 200;
   public static final String CONFIG_RANK_REWARD_KEY = "rankRewards";
   public static final int CROSS_UPLOAD = 1;
   public static final int CROSS_REMOVE = 2;
   public static final String HERO_RANK_SIZE_SAVE = "heroRankSizeSave";

   public static RankModule getRankModule(int id) {
      for(RankModule module : RankDefine.RankModule.values()) {
         if (module.id == id) {
            return module;
         }
      }

      return null;
   }

   public static enum RankModule {
      PVP(0, false, true, true),
      PLAYER_LV(1, false, true, true),
      COMBAT_POWER(3, false, true, false),
      HERO_TRAINING(4, false, true, true),
      UNION_COPY(5, false, true, false),
      BATTLE_CHAPTER_CROSS(14, false, true, true),
      BOSS_DAMAGE(15, false, true, false),
      WAR_HL_FLOOR(16, false, true, true),
      BATTLE_TOWER(17, false, true, true),
      UNION_COMBAT_POWER(18, false, false, false),
      WAR_JZ_PASS(19, false, true, true),
      TRAIL_TOWER(20, false, true, true),
      WATER_TRANSPORT(21, false, true, true),
      WAR_NORTH(22, false, true, true),
      ACTIVITY_POINT(23, false, true, true),
      MINE_FALL_NUM(24, true, true, true),
      HERO_GOD_TRIAL(25, false, true, true),
      UNDER_PALACE(26, false, true, true),
      MINE_UNION(27, false, true, true),
      OPEN_SERVER_POWER(28, false, true, false),
      OPEN_SERVER_LEV(29, false, true, true),
      OPEN_SERVER_RECRUIT(30, false, true, true),
      OPEN_SERVER_ASSEMBLE(31, false, true, true),
      OPEN_SERVER_TOWER(32, false, true, true),
      OPEN_SERVER_HERO_LEV(33, false, true, true),
      OPEN_SERVER_UNDER_PALACE(34, false, true, true),
      FAIRYLAND_BATTLE(35, false, true, true),
      GOLD_SHIP(36, true, true, true),
      DEMON_BOSS_DAY_HURT(37, false, true, false),
      DEMON_COPY_POINT(39, false, true, true),
      DEMON_STRIKES(40, true, true, true),
      OFFER_REWARD(41, false, true, true),
      WATER_TRANSPORT_INTERCEPT(42, false, true, true),
      DUEL_BOSS(43, false, true, false),
      DEMON_ROTATE_BOSS_DAY_HURT(44, false, true, false),
      DEMON_ROTATE_COPY_POINT(45, false, true, true),
      FLOWER_FIRE_BATTLE(46, true, true, false),
      WECHAT_INVITE(47, false, true, true),
      SPLENDID_CITY(48, true, true, true),
      RECRUIT_RUSH(49, false, true, true),
      RECRUITMENT_RUSH(50, false, true, true),
      STONE_RUSH(51, false, true, true),
      LABOR_DAY_ARCHERY(52, true, true, true),
      MERGE_WAR_BOSS_UNION_DAMAGE(53, false, false, false),
      MERGE_WAR_GAME_PLAYER_CORE_HURT(54, true, true, false),
      MERGE_WAR_GAME_PLAYER_SCORE(55, true, true, true),
      ACTIVITY_ZONG_QING_PICK(56, true, true, true),
      S_VIP_INVITE(57, false, true, true),
      ACTIVITY_GUO_QING(58, true, true, true),
      ACTIVITY_DECISIVE_BATTLE(59, true, true, true),
      HERO_NATION_WEI(61, false, true, false, RankMsg.SubType.CULTIVATION),
      HERO_NATION_SHU(62, false, true, false, RankMsg.SubType.CULTIVATION),
      HERO_NATION_WU(63, false, true, false, RankMsg.SubType.CULTIVATION),
      HERO_NATION_GOD(64, false, true, false, RankMsg.SubType.CULTIVATION),
      HERO_NATION_DEVIL(65, false, true, false, RankMsg.SubType.CULTIVATION),
      ACTIVITY_FIRST_YEAR(66, true, true, true),
      ACTIVITY_CHINESE_NEW_YEAR(67, true, true, true),
      ACTIVITY_GOLD_WEEK(68, true, true, true),
      ACTIVITY_SEND_FLOWER(69, true, true, true),
      ACTIVITY_GET_FLOWER(70, true, true, true),
      ACTIVITY_CHILD_PICK(71, true, true, true),
      ACTIVITY_BROOD_RANK(72, true, true, true, 8),
      ACTIVITY_SUMMER_FESTIVAL_FISHING(73, true, true, true),
      ACTIVITY_WINTER_ACT_FISHING(74, true, true, true),
      ACTIVITY_LLMK(75, true, true, true);

      public boolean isCross;
      public int id;
      public boolean isPlayer;
      public boolean sortByTime;
      public RankMsg.SubType subType;
      public int corssServerSize;

      private RankModule(int id, boolean isCross, boolean isPlayer, boolean sortByTime) {
         this.subType = RankMsg.SubType.PROGRESS;
         this.id = id;
         this.isCross = isCross;
         this.isPlayer = isPlayer;
         this.sortByTime = sortByTime;
      }

      private RankModule(int id, boolean isCross, boolean isPlayer, boolean sortByTime, RankMsg.SubType subType) {
         this.subType = RankMsg.SubType.PROGRESS;
         this.id = id;
         this.isCross = isCross;
         this.isPlayer = isPlayer;
         this.sortByTime = sortByTime;
         this.subType = subType;
      }

      private RankModule(int id, boolean isCross, boolean isPlayer, boolean sortByTime, int corssServerSize) {
         this.subType = RankMsg.SubType.PROGRESS;
         this.id = id;
         this.isCross = isCross;
         this.isPlayer = isPlayer;
         this.sortByTime = sortByTime;
         this.corssServerSize = corssServerSize;
      }
   }
}
