package com.gzbz.gameDefine;

public interface SplendidCityDefine {
   int INIT_STAGE = 1;
   int INIT_STAGE_RECHARGE = 0;
   int TASK_TYPE_DAILY = 1;
   int TASK_TYPE_ATTAINMENT = 2;
   int DICE_RANDOM = 1;
   int DICE_GOLD = 2;
   int EVENT_ID_LUCKY = 301;
   int EVENT_TYPE_BUILDING_UPGRADE = 1;
   int EVENT_TYPE_LUCKY_REWARD = 2;
   int EVENT_TYPE_MOVE = 3;
   int EVENT_TYPE_BATTLE = 4;
   int EVENT_TYPE_BUY = 5;
   int EVENT_TYPE_CHOICE = 6;
   String CONFIG_GAME_POINT_RES_ID = "boomPoint";
   String CONFIG_GAME_DICE_RECOVER = "GreatCityDiceTime";
   String CONFIG_GAME_DICE_INIT = "GreatCityDiceNum";
   String CONFIG_GAME_DICE_LIMIT = "GreatCityDiceUpLimit";
   String CONFIG_GAME_DICE_GOLD_INIT = "GreatCityGoldDiceNum";
   String CONFIG_GAME_DICE_GOLD_BUY = "GreatCityGoldDiceBuy";
   String CONFIG_GAME_DICE_ITEM = "GreatCityDiceID";
   String CONFIG_GAME_GOLD_DICE_ITEM = "GreatCityGoldDiceID";
   int INFINITY = -1;
}
