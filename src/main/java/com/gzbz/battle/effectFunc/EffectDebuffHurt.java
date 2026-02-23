package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.protobuf.BattleMsg;
import java.util.List;
import java.util.Objects;

@EffectAnno(
   effect = 39
)
public class EffectDebuffHurt extends EffectFunc {
   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      int buffNum = target.getBuffManager().getPriorityBuffsNum(((Integer)model.getFuncParam().get("buffType")).byteValue());
      int addValue = buffNum * (Integer)model.getFuncParam().get("rate");
      long damage = (long)((float)(target.getBaseProperty(98) * (long)addValue) / 10000.0F);
      long maxDamage = (long)((float)(source.getBattleProperty(action, 2) * (long)(Integer)model.getFuncParam().get("maxValue")) / 10000.0F);
      if (damage > maxDamage) {
         damage = maxDamage;
      }

      target.recordHp(source);
      EffectUtil.doShield(action, source, target, damage, model, false, false, event, (byte)0);
      long realValue = target.getReduceValue(source);
      if (target.isDead()) {
         BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
         effectBuilder.setTargetBattlePos(target.getBattlePos());
         effectBuilder.setEffectType(9);
         action.getBlackboard().addBattleEffect(effectBuilder);
         EffectUtil.putDeadEvent(action, source, target, event);
         target.addDeadTimesAndClear(action);
      }

      EntitySkill skill = (EntitySkill)action.getBlackboard().getSkillParam(4, null);
      if (Objects.isNull(skill)) {
         return false;
      } else {
         DamageFunc.recordDamageEntity(action, source, target);
         action.getBlackboard().plusSkillLongParam(400 + source.getBattlePos(), damage);
         action.getBlackboard().plusSkillLongParam(500 + target.getBattlePos(), damage);
         action.getBlackboard().plusSkillLongParam(1100 + source.getBattlePos(), realValue);
         action.getBlackboard().plusSkillLongParam(1200 + target.getBattlePos(), realValue);
         return false;
      }
   }
}
