package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.effectFunc.DamageFunc;
import com.gzbz.battle.effectFunc.EffectUtil;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;

@BuffSubType(
   subType = 63
)
public class BuffAttachAttack extends ListenerBuff {
   private long curAttack;

   public void init(Entity source, Entity caster, BuffModel model, BuffManager buffManager) {
      super.init(source, caster, model, buffManager);
      BuffUseFun buffUseFun = (BuffUseFun)model.getFuncs().get(1);
      if (buffUseFun != null) {
         this.curAttack = (long)((float)(caster.getBaseProperty(buffUseFun.getDependentId()) * (long)buffUseFun.getDependentValue()) / 10000.0F);
      }
   }

   public void listen(Event event, ListenerContext context) {
      Entity target = (Entity)event.getParam(3);
      long attack = DamageFunc.getMagicAttack(event.getAction(), this.curAttack, this.source, target);
      attack = (long)((float)attack * DamageFunc.getNationDamage(target));
      EffectUtil.doShield(event.getAction(), this.source, target, attack, (SkillEffectModel)null, false, false, event, (byte)0);
   }
}
