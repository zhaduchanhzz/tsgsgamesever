package com.gzbz.battle.pkteam;

import com.gzbz.battle.entity.Entity;
import java.io.Serializable;
import java.util.Comparator;

class BuffNumComparator implements Comparator<Entity>, Serializable {
   private byte buffType;

   public BuffNumComparator(byte buffType) {
      this.buffType = buffType;
   }

   public int compare(Entity o1, Entity o2) {
      int num1 = o1.getBuffManager().getPriorityBuffsCodeNum(this.buffType);
      int num2 = o2.getBuffManager().getPriorityBuffsCodeNum(this.buffType);
      return num1 == num2 ? o1.getTeamPos() - o2.getTeamPos() : num2 - num1;
   }
}
