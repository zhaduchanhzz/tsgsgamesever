package com.gzbz.gameDefine;

public interface DragonCaveDefine {
   int STAGE_INVALID = 0;
   int STAGE_TEAM = 1;
   int STAGE_DISCOVER = 2;
   int STAGE_DISCOVER_STOP = 3;
   int STAGE_SETTLE = 4;
   int BATTLE_PARAM_INDEX_EVENT = 0;
   int BATTLE_PARAM_INDEX_HP = 1;
   int BATTLE_PARAM_INDEX_ITEM = 2;
   int BATTLE_PARAM_INDEX_PROPERTY = 3;
   String CONFIG_LLML_ACT_HOUR = "";
   String CONFIG_POWER_DEFAULT_MAX = "powerDefault";
   String CONFIG_POWER_RECOVER_TIME = "powerRecoverTime";
   String CONFIG_FIGHT_MIN = "damageLeastPercent";
   String CONFIG_ROUND_MONSTER = "dragonCavePVEBattleTurn";
   String CONFIG_ITEM = "dragonCaveRankItem";
   String CONFIG_ENTER_NEED_ITEM = "enterNeedItem";
   String CONFIG_ENTER_NEED_ITEM_NUM = "enterNeedItemNum";
   String CONFIG_ENTER_NEED_MONSTER_NUM = "enterNeedMonster";
   String CONFIG_ENERGY_COST = "powerCost";
   String CONFIG_TEAM_MEMBER_LIMIT = "teamMenberLimit";
   String CONFIG_DAMAGE_LEAST_PERCENT = "damageLeastPercent";
   String CONFIG_DROP_ITEM = "defeatDropItemNum";
   String CONFIG_ROUND_PLAYER = "dragonCavePVPBattleTurn";
   String CONFIG_RANK_SHOW = "";
}
