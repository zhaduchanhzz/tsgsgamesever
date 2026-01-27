package com.gzbz.battle.effectFunc;

import com.gzbz.battle.entity.Entity;
import java.io.Serializable;
import java.util.ArrayList;

class InfectionEntity implements Serializable {
   public Entity entity;
   public ArrayList<Integer> infection = new ArrayList();
}
