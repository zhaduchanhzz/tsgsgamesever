package com.yy.countryWar.bean;

import com.gzbz.protobuf.BattleMsg;

public class CountryWarFightResult {
   public boolean isFight;
   public boolean isWin;
   public boolean isOccypy;
   public BattleMsg.S2C_BattleResult_6102 fightResult;
   public boolean isEffectAtt;
   public boolean isBeat;
   public CountryWarLogInfo countryWarLogInfo;
}
