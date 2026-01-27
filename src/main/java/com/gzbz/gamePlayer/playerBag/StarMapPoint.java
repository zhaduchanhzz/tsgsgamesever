package com.gzbz.gamePlayer.playerBag;

import java.io.Serializable;

public class StarMapPoint implements Serializable {
   public int starId;
   public int starLv;
   public int optionSkillGroup;

   public StarMapPoint(int starId, int starLv, int optionSkillGroup) {
      this.starId = starId;
      this.starLv = starLv;
      this.optionSkillGroup = optionSkillGroup;
   }
}
