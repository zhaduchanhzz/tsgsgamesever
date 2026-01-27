package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.effectFunc.EffectUtil;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;

@BuffSubType(
   subType = 96
)
public class BuffLiveAndDie extends ListenerBuff {
   public long damage = 0L;
   public Entity attacker;

   public void init(Entity source, Entity caster, BuffModel model, BuffManager buffManager) {
      super.init(source, caster, model, buffManager);
      source.getScene().getEventListener().addListener(source, this, (short)39, 0, (String)null, (byte)1, (short)0, 0, model.getIsForce());
   }

   public void listen(Event event, ListenerContext context) {
      if (this.damage != 0L && this.attacker != null) {
         Entity target = this.source;
         if (this.attacker != null) {
            this.attacker.addAttackValue(event.getAction(), this.damage, event);
         }

         if (this.caster.isDead()) {
            event.getAction().getBlackboard().addSkillParam(44, true);
         }

         long newDamage = this.damage;
         this.damage = 0L;
         EffectUtil.doLinkBufShield(event.getAction(), this.attacker, target, newDamage, (SkillEffectModel)null, false, true, false, event, (byte)0);
         event.getAction().getBlackboard().removeSkillParam(44);
         if (event.getType() == 39) {
            Event liveAndDieEndEvent = new Event((short)39, event.getAction(), event);
            event.getAction().getScene().getEventListener().pushEvent(liveAndDieEndEvent);
         }

      }
   }
}
