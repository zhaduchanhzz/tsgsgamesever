package com.gzbz.gameDefine;

public interface GuoQingActivityDefine {
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
   String CONFIG_GAME_POINT_RES_ID = "GuoQingMonopolyBoomPoint";
   String CONFIG_GAME_DICE_RECOVER = "GuoQingMonopolyDiceTime";
   String CONFIG_GAME_DICE_INIT = "GuoQingMonopolyDiceNum";
   String CONFIG_GAME_DICE_LIMIT = "GuoQingMonopolyDiceUpLimit";
   String CONFIG_GAME_DICE_GOLD_INIT = "GuoQingMonopolyGoldDiceNum";
   String CONFIG_GAME_DICE_GOLD_BUY = "GuoQingMonopolyGoldDicePrice";
   String CONFIG_GAME_DICE_ITEM = "GuoQingMonopolyDiceID";
   String CONFIG_GAME_GOLD_DICE_ITEM = "GuoQingMonopolyGoldDiceID";
   int INFINITY = -1;
}
