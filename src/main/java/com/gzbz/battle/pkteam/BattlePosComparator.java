package com.gzbz.battle.pkteam;

import com.gzbz.battle.entity.Entity;
import java.io.Serializable;
import java.util.Comparator;

public class BattlePosComparator implements Comparator<Entity>, Serializable {
   public int compare(Entity o1, Entity o2) {
      return o1.getBattlePos() - o2.getBattlePos();
   }
}
