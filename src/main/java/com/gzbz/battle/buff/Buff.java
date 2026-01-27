package com.gzbz.battle.buff;

import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.model.BuffModel;
import java.io.Serializable;
import java.util.HashMap;

public class Buff implements Serializable {
   public Entity source;
   public int code;
   public int id;
   private HashMap<Integer, Long> values = new HashMap();
   public short round;
   public int attachedCode;
   public Entity caster;
   public BuffManager buffMgr;
   public int count = 1;
   public byte curUseTime = 0;
   public boolean move;
   public int attackedTimes;

   public void init(Entity source, Entity caster, BuffModel buffModel, BuffManager buffMgr) {
      this.source = source;
      this.caster = caster;
      this.buffMgr = buffMgr;
      this.id = buffModel.getId();
      if (buffModel.getExForce() == source.getForce()) {
         this.round = (short)(buffModel.getRound() + buffModel.getExRound());
      } else {
         this.round = buffModel.getRound();
      }

      this.code = buffMgr.getNewCode();
   }

   public void update(Action action) {
   }

   public void destroy() {
   }

   public long getValue(int index) {
      return !this.values.containsKey(index) ? 0L : (Long)this.values.get(index);
   }

   public void setValue(int index, long value) {
      this.values.put(index, value);
   }

   public void addValue(int index, long value) {
      if (this.values.containsKey(index)) {
         value += (Long)this.values.get(index);
      }

      this.values.put(index, value);
   }
}
