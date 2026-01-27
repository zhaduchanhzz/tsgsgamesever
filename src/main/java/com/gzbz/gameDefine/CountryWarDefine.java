package com.gzbz.gameDefine;

public interface CountryWarDefine {
   int REWARD_SHOP = 1;
   int REWARD_ITEM = 2;
   int CITY_TYPE_BASE = 0;
   int CITY_TYPE_LEVEL_1 = 1;
   int CITY_TYPE_LEVEL_2 = 2;
   int CITY_TYPE_LEVEL_3 = 3;
   int CITY_TYPE_GUAN = 4;
   int CITY_TYPE_CAMP = 5;
   int LOG_TYPE_COUNTRY = 1;
   int LOG_TYPE_PLAYER = 2;
   int LOGINFO_TYPE_ALLIANCE = 1;
   int LOGINFO_TYPE_SOLUTION = 2;
   int LOGINFO_TYPE_ATTACK = 3;
   int LOGINFO_TYPE_DEF_FIVE = 4;
   int RANK_COUNTRY = 1;
   int RANK_OCCUPY = 2;
   int RANK_KILL = 3;
   int RANK_DAMAGE = 4;
   int RANK_MAX_NUM = 30;
   int TURNTABLE_TYPE_ONE = 0;
   int TURNTABLE_TYPE_FIVE = 1;
   int[] TURNTABLE_NUM = new int[]{1, 5};
   String COUNTRY_WAR_TURNTABLE_RECORD = "countryWarTurnTableRecord";
   int CITY_SETTLE_MIN_TIME = 600000;
   int REASON_ALLIANCE = 0;
   int REASON_MOVE = 1;
   int REASON_ATTACK = 2;
   int REASON_TRANSFER = 3;
   int WAR_FLAG_MERGE_SERVER = 1;
   int WAR_FLAG_CHANGE_SERVER = 2;
   int RANK_REWARD_TYPE_NORMAL = 0;
   int RANK_REWARD_TYPE_MERGE = 1;
   int RANK_REWARD_TYPE_CHANGE = 2;
}
