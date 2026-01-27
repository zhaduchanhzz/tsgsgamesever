package com.yy.redCliff;

import java.util.HashMap;
import java.util.Map;

public class PlayerRedCliffData {
   public int playerId;
   public int serverId;
   public int sourceServerId;
   public int status;
   public int kills;
   public int lev;
   public int inceptionPower = 5;
   public int nation;
   public long power;
   public int chip;
   public byte[] arraying;
   public int endRound;
   public boolean ifGuess = false;
   public int mainServer;
   public Map<Integer, Float> heroHP = new HashMap();
   public Map<Integer, RedCliffGuessData> guessList = new HashMap();
   public boolean guessUI = false;
   public boolean isEnd = false;
   public boolean mainUI = false;

   public static int getKills(PlayerRedCliffData data) {
      return data.kills;
   }

   public static int getLev(PlayerRedCliffData data) {
      return data.lev;
   }
}
