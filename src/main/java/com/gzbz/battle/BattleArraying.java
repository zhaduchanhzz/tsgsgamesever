package com.gzbz.battle;

import com.gzbz.protobuf.CommonMsg;

public enum BattleArraying {
   ARENA(1110, CommonMsg.HeroState.HERO_STATE_ARRAYING),
   PVK(1040, CommonMsg.HeroState.HERO_STATE_ARRAYING),
   HL(1960, CommonMsg.HeroState.HERO_STATE_WAR_HL),
   CHAPTER(1650, CommonMsg.HeroState.HERO_STATE_ARRAYING),
   TRAINING(1250, CommonMsg.HeroState.HERO_STATE_BATTLE_HERO_TRAINING),
   CUT(1260, CommonMsg.HeroState.HERO_STATE_BATTLE_CUT_HERO),
   DAILY(1240, CommonMsg.HeroState.HERO_STATE_ARRAYING),
   TEMPLE(1270, CommonMsg.HeroState.HERO_STATE_ARRAYING),
   TOWER(1130, CommonMsg.HeroState.HERO_STATE_BATTLE_TOWER),
   UNION(1470, CommonMsg.HeroState.HERO_STATE_UNION_COPY),
   BARBARIAN(1980, CommonMsg.HeroState.HERO_STATE_WAR_BARBARIAN),
   UNION_WAR(1450, CommonMsg.HeroState.HERO_STATE_UNION_WAR),
   JINGZHou(1970, CommonMsg.HeroState.HERO_STATE_ARRAYING),
   TRAIL_TOWER(2130, CommonMsg.HeroState.HERO_STATE_TRAIL_TOWER),
   NORTH(1990, CommonMsg.HeroState.HERO_STATE_WAR_NORTH),
   EXPEDITION(2090, CommonMsg.HeroState.HERO_STATE_EXPEDITION),
   TRANSPORT(1991, CommonMsg.HeroState.HERO_STATE_WATER_TRANSPORT),
   COUNTRY_WAR(2020, CommonMsg.HeroState.HERO_STATE_ARRAYING),
   ALLIANCE(2030, CommonMsg.HeroState.HERO_STATE_ALLIANCE),
   MINE(2001, CommonMsg.HeroState.HERO_STATE_MINE_ATK),
   GOD_TRIAL(2430, CommonMsg.HeroState.HERO_STATE_GOD_TRIAL),
   SEVEN_BARBARIAN(2410, CommonMsg.HeroState.HERO_STATE_SEVEN_BARBARIAN),
   FAIRYLAND(3005, CommonMsg.HeroState.HERO_STATE_FAIRYLAND),
   ACT_ARTIFACT(3031, CommonMsg.HeroState.HERO_STATE_ARRAYING),
   DEMON_ACTIVITY(3083, CommonMsg.HeroState.HERO_STATE_DEMON_ACTIVITY),
   DEMON_BOSS(3084, CommonMsg.HeroState.HERO_STATE_DEMON_BOSS),
   UNION_OFFER(3103, CommonMsg.HeroState.HERO_STATE_OFFER_REWARD),
   STONE_CIRCLE(3110, CommonMsg.HeroState.HERO_STATE_STONE_CIRCLE),
   DEMON_STRIKES_ATK(2021, CommonMsg.HeroState.HERO_STATE_DEMON_STRIKES),
   UNION_DAILY_GUESS(1491, CommonMsg.HeroState.HERO_STATE_UNION_DAILY_GUESS),
   DEMON_ROTATE_ACTIVITY(3281, CommonMsg.HeroState.HERO_STATE_DEMON_ROTATE_ACTIVITY),
   DEMON_ROTATE_BOSS(3282, CommonMsg.HeroState.HERO_STATE_DEMON_ROTATE_BOSS),
   DUEL_BOSS(3191, CommonMsg.HeroState.HERO_STATE_DUEL_1),
   FLOWER_FIRE_BATTLE(3653, CommonMsg.HeroState.HERO_STATE_FLOWER_FIRE_BATTLE),
   SPLENDID_CITY_GAME(3661, CommonMsg.HeroState.HERO_STATE_ARRAYING),
   ACT_ARTIFACT_NEW(4413, CommonMsg.HeroState.HERO_STATE_ARRAYING),
   ACT_ARTIFACT_SKIN(5213, CommonMsg.HeroState.HERO_STATE_ARRAYING),
   GUO_QING_CITY_GAME(3178, CommonMsg.HeroState.HERO_STATE_ARRAYING),
   FIRST_YEAR_CITY_GAME(6116, CommonMsg.HeroState.HERO_STATE_ARRAYING),
   CHINESE_NEW_YEAR_CITY_GAME(6305, CommonMsg.HeroState.HERO_STATE_ARRAYING),
   GOLD_WEEK_CITY_GAME(6435, CommonMsg.HeroState.HERO_STATE_ARRAYING),
   SUPREME_PVP(6850, CommonMsg.HeroState.HERO_STATE_SUPREME_PVP);

   private final int type;
   private final CommonMsg.HeroState arrayingType;

   private BattleArraying(int type, CommonMsg.HeroState arrayingType) {
      this.type = type;
      this.arrayingType = arrayingType;
   }

   public int getType() {
      return this.type;
   }

   public CommonMsg.HeroState getArrayingType() {
      return this.arrayingType;
   }
}
