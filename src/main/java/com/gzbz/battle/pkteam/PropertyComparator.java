package com.gzbz.battle.pkteam;

import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import java.io.Serializable;
import java.util.Comparator;

public class PropertyComparator implements Comparator<Entity>, Serializable {
   private int property;
   private boolean asc;
   private boolean hpPercent = true;

   public PropertyComparator(int property, boolean asc) {
      this.property = property;
      this.asc = asc;
   }

   public PropertyComparator(int property, boolean asc, boolean hpPercent) {
      this.property = property;
      this.asc = asc;
      this.hpPercent = hpPercent;
   }

   public int compare(Entity o1, Entity o2) {
      if (this.property == 99 && this.hpPercent) {
         float hpRate1 = (float)o1.getBaseProperty(this.property) / (float)o1.getBaseProperty(1);
         float hpRate2 = (float)o2.getBaseProperty(this.property) / (float)o2.getBaseProperty(1);
         float diff = hpRate1 - hpRate2;
         if (diff < 1.0E-4F && diff > -1.0E-4F) {
            return o1.getTeamPos() - o2.getTeamPos();
         } else if (this.asc) {
            return diff > 0.0F ? 1 : -1;
         } else {
            return diff < 0.0F ? 1 : -1;
         }
      } else {
         Action action = o1.getScene().getActionManager().getCurAction();
         long o1Value = o1.getBattleProperty(action, this.property);
         long o2Value = o2.getBattleProperty(action, this.property);
         long diff = o1Value - o2Value;
         if (diff == 0L) {
            return o1.getTeamPos() - o2.getTeamPos();
         } else {
            return this.asc ? (int)diff : -((int)diff);
         }
      }
   }
}
