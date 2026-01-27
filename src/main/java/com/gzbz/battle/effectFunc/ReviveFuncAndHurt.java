package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battleTest.BattleTestMgr;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.protobuf.BattleMsg;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@EffectAnno(
   effect = 59
)
public class ReviveFuncAndHurt extends RecoverHpFunc {
   public static final String LIMIT_PROPERTY_ID = "limitPropertyId";
   public static final String LIMIT_PROPERTY_RATE = "limitPropertyRate";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (target.getStateManager().checkState((short)21)) {
         Set<Integer> serverStar = target.getBuffManager().getSubBuff((short)46);
         if (Objects.nonNull(serverStar) && serverStar.size() > 0) {
            for(int code : serverStar) {
               target.getBuffManager().deleteBuffByCode(action, code, false);
            }
         }
      } else if (target.getStateManager().checkState((short)9)) {
         return false;
      }

      Entity caster = (Entity)event.getParam(29);
      long value = this.getDependValue(action, caster, target, model, event);
      if ((Integer)model.getFuncParam().get("rate") != 0) {
         value = (long)((float)value * ((float)(Integer)model.getFuncParam().get("rate") / 10000.0F));
      }

      if (model.getFuncParam().containsKey("limitPropertyId") && model.getFuncParam().containsKey("limitPropertyRate")) {
         int property = (Integer)model.getFuncParam().get("limitPropertyId");
         long limitValue = (long)((float)(caster.getBaseProperty(property) * (long)(Integer)model.getFuncParam().get("limitPropertyRate")) / 10000.0F);
         value = value > limitValue ? limitValue : value;
      }

      float actionRate = 1.0F;
      if (source == action.getBlackboard().getSkillParam(29)) {
         actionRate = (float)(Integer)action.getBlackboard().getSkillParam(28, 10000) / 10000.0F;
      }

      value = (long)((float)value * actionRate);
      if (target.isDead()) {
         action.getBlackboard().addSkillParam(2500 + target.getBattlePos(), true);
         target.recoverHp(action, source, model, false, value, event, false);
         action.getBlackboard().plusSkillLongParam(700 + target.getBattlePos(), value);
         BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
         effectBuilder.setEffectType(7);
         effectBuilder.setEffectId(model.getId());
         effectBuilder.setEffectValue(value);
         effectBuilder.setFinalValue(target.getBaseProperty(99));
         effectBuilder.setTargetBattlePos(target.getBattlePos());
         effectBuilder.setEffectSetId(model.getId());
         action.getBlackboard().addBattleEffect(effectBuilder);
         target.getBuffManager().delSubClsBuff(action, (short)43);
         BattleTestMgr.analyseBuffEffect((byte)7, source.getId(), model.getId(), 1L);
         Event reviveEvent = new Event((short)11, action, event);
         reviveEvent.addParam(3, target);
         reviveEvent.addParam(2, source);
         reviveEvent.addParam(10, value);
         target.getScene().getEventListener().pushEvent(reviveEvent);
         if (target.getType() != BattleMsg.EntityType.EntityType_Hero && target.getType() != BattleMsg.EntityType.EntityType_Friend) {
            target.getScene().addRecordValue(target.getForce(), 200005, 1L);
         } else {
            target.getScene().addRecordValue(target.getForce(), 200004, 1L);
         }
      } else {
         long covertValue = EffectUtil.hurtCureExchange(action, source, target, value, model, false, false, event);
         value -= covertValue;
         if (value == 0L) {
            EffectUtil.doCureToHurt(action, source, target, covertValue, model, event);
            return true;
         }

         long moreValue = value - (target.getBaseProperty(1) - target.getBaseProperty(99));
         if (moreValue > 0L) {
            action.getBlackboard().addSkillParam(55, model);
            Event surplusValueEvent = new Event((short)26, action, event);
            surplusValueEvent.addParam(12, action);
            surplusValueEvent.addParam(3, target);
            surplusValueEvent.addParam(2, source);
            surplusValueEvent.addParam(10, moreValue);
            target.getScene().getEventListener().pushEvent(surplusValueEvent);
         }

         action.getBlackboard().addSkillParam(2500 + target.getBattlePos(), true);
         target.recoverHp(action, source, model, false, value, event, true);
         EffectUtil.doCureToHurt(action, source, target, covertValue, model, event);
      }

      Event recoverHPEvent = new Event((short)12, action, event);
      recoverHPEvent.addParam(3, target);
      recoverHPEvent.addParam(2, source);
      recoverHPEvent.addParam(10, value);
      recoverHPEvent.addParam(11, true);
      target.getScene().getEventListener().pushEvent(recoverHPEvent);
      Entity attacker = (Entity)event.getParam(2);
      if (attacker.entityType == 0 && model.getFuncParam().containsKey("limitRate")) {
         long limitValue = attacker.getBaseProperty(99) - attacker.getBaseProperty(1) * (long)(Integer)model.getFuncParam().get("limitRate") / 10000L;
         if (limitValue > 0L) {
            value = value > limitValue ? limitValue : value;
            EffectUtil.doShield(action, source, attacker, value, model, false, false, event, (byte)0);
         }
      }

      return true;
   }
}
