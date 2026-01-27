package com.gzbz.db.bean;

import com.gzbz.gamePlayer.playerBag.WarriorSignet;
import com.gzbz.gamePlayer.playerBag.WarriorSignetData;

public class HeroWearData {
   public int type;
   public int id;
   public WarriorSignetData data;

   public HeroWearData() {
   }

   public HeroWearData(int type, int id, WarriorSignet warriorSignet) {
      this.type = type;
      this.id = id;
      if (warriorSignet != null) {
         this.data = new WarriorSignetData(warriorSignet);
      }

   }
}
