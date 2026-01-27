package com.gzbz.battle.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;
import misc.MapUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EntityStateManager implements Serializable {
   static Logger logger = LoggerFactory.getLogger(EntityStateManager.class);
   private HashMap<Integer, EntityState> statesMap = new HashMap();
   private HashMap<Short, Integer> stateTimesMap = new HashMap();
   private Entity entity;
   private int newCode;

   public void init(Entity entity) {
      this.entity = entity;
   }

   public int addState(int parentCode, short state) {
      EntityState entityState = new EntityState();
      entityState.code = this.getNewCode();
      entityState.state = state;
      entityState.parentCode = parentCode;
      this.statesMap.put(entityState.code, entityState);
      this.addStateTimes(entityState.state);
      return entityState.code;
   }

   public boolean checkState(short state) {
      return this.stateTimesMap.containsKey(state);
   }

   public int removeState(int code) {
      EntityState entityState = (EntityState)this.statesMap.remove(code);
      if (Objects.isNull(entityState)) {
         return 0;
      } else {
         int value = MapUtil.mapPlusInt(this.stateTimesMap, entityState.state, -1);
         if (value == 0) {
            this.stateTimesMap.remove(entityState.state);
         }

         return value;
      }
   }

   public EntityState getState(short state) {
      for(EntityState entityState : this.statesMap.values()) {
         if (entityState.state == state) {
            return entityState;
         }
      }

      return null;
   }

   public void addStateTimes(short state) {
      MapUtil.mapPlusInt(this.stateTimesMap, state, 1);
   }

   public void removeStateTimes(short state) {
      int value = MapUtil.mapPlusInt(this.stateTimesMap, state, -1);
      if (value == 0) {
         this.stateTimesMap.remove(state);
      }

   }

   public boolean isControlled() {
      if (this.checkState((short)1)) {
         return true;
      } else if (this.checkState((short)2)) {
         return true;
      } else if (this.checkState((short)11)) {
         return true;
      } else if (this.checkState((short)12)) {
         return true;
      } else if (this.checkState((short)16)) {
         return true;
      } else if (this.checkState((short)17)) {
         return true;
      } else {
         return this.checkState((short)18);
      }
   }

   private int getNewCode() {
      return ++this.newCode;
   }

   public HashMap<Integer, EntityState> getStatesMap() {
      return this.statesMap;
   }
}
