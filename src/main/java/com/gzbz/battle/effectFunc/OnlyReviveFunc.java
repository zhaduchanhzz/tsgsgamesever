package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battleTest.BattleTestMgr;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.protobuf.BattleMsg;
import java.util.List;

@EffectAnno(
   effect = 31
)
public class OnlyReviveFunc extends RecoverHpFunc {
   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      BattleMsg.S2C_Battle_Effect.Builder transEffectBuilder = null;
      long value = this.getDependValue(action, source, target, model, event);
      if ((Integer)model.getFuncParam().get("rate") != 0) {
         value = (long)((float)value * ((float)(Integer)model.getFuncParam().get("rate") / 10000.0F));
      }

      float actionRate = 1.0F;
      if (source == action.getBlackboard().getSkillParam(29)) {
         actionRate = (float)(Integer)action.getBlackboard().getSkillParam(28, 10000) / 10000.0F;
      }

      value = (long)((float)value * actionRate);
      target.recoverHp(action, source, model, false, value, event, false);
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
      action.getBlackboard().plusSkillLongParam(700 + target.getBattlePos(), value);
      Event recoverHPEvent = new Event((short)12, action, event);
      recoverHPEvent.addParam(3, target);
      recoverHPEvent.addParam(2, source);
      recoverHPEvent.addParam(10, value);
      recoverHPEvent.addParam(11, true);
      target.getScene().getEventListener().pushEvent(recoverHPEvent);
      if (target.getType() != BattleMsg.EntityType.EntityType_Hero && target.getType() != BattleMsg.EntityType.EntityType_Friend) {
         target.getScene().addRecordValue(target.getForce(), 200005, 1L);
      } else {
         target.getScene().addRecordValue(target.getForce(), 200004, 1L);
      }

      return true;
   }
}
