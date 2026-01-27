package com.gzbz.gameDefine;

public interface AllianceDefine {
   int STATUS_SERVER_MATCH = 1;
   int STATUS_ALLIANCE = 2;
   int STATUS_BATTLE = 3;
   int STATUS_SETTLE = 4;
   int STATUS_SHOW = 5;
   String CONFIG_TEAM_NAME_LIMIT = "teamNameLimit";
   String CONFIG_TEAM_POWER_LIMIT = "teamPowerLimit";
   String CONFIG_TEAM_LV_LIMIT = "teamLevelLimit";
   String CONFIG_RECOVER_TIME = "recoverTime";
   String CONFIG_FIGHT_NUM = "fightNum";
   String CONFIG_INIT_INTEGRAL = "teamBattle1stScore";
   String CONFIG_AUTO_LIMIT = "autoLimit";
   String CONFIG_ROBOT_COUNT = "robotCount";
   String CONFIG_ROBOT_BATTLE_ID = "robotBattleId";
   String CONFIG_SEASON_SHOW = "teamBattleShowStage";
   String CONFIG_SEASON_OFF = "teamBattleRestStage";
   String CONFIG_SEASON_MATCH = "teamBattleCombatStage";
   String CONFIG_SEASON_BATTLE = "teamBattleFightStage";
   String CONFIG_SEASON_SETTLE = "teamBattleCountStage";
   String CONFIG_MEMBER_FIGHT = "memberFightable";
   String CONFIG_AUTO_JOIN_POWER = "autoJoin";
}
