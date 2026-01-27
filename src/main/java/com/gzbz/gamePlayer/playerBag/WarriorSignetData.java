package com.gzbz.gamePlayer.playerBag;

import com.gzbz.model.fun.PropertyModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class WarriorSignetData implements Serializable {
   public int id;
   public int score;
   public List<PropertyModel> properties = new ArrayList();
   public List<Integer> skills = new ArrayList();
   public List<PropertyModel> recastPros = new ArrayList();
   public List<Integer> recastSkills = new ArrayList();
   public int recastNum;

   public WarriorSignetData() {
   }

   public WarriorSignetData(WarriorSignet warriorSignet) {
      if (warriorSignet != null) {
         this.id = warriorSignet.id;
         this.score = warriorSignet.score;
         this.properties = warriorSignet.properties;
         this.skills = warriorSignet.skills;
         this.recastPros = warriorSignet.recastPros;
         this.recastSkills = warriorSignet.recastSkills;
      }

   }

   public void update(WarriorSignet warriorSignet) {
      this.id = warriorSignet.id;
      this.score = warriorSignet.score;
      this.properties = warriorSignet.properties;
      this.skills = warriorSignet.skills;
      this.recastPros = warriorSignet.recastPros;
      this.recastSkills = warriorSignet.recastSkills;
   }
}
