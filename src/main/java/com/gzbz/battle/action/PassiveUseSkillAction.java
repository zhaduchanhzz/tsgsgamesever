package com.gzbz.battle.action;

import battle.ActionAnno;
import com.gzbz.battle.effectFunc.EffectFuncProcessor;
import com.gzbz.battle.effectFunc.EffectUtil;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.SkillModel;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.Map;

@ActionAnno(
   action = 45
)
public class PassiveUseSkillAction extends Action {
   private SkillModel model;
   private Event event;

   public void setAction(Entity entity, SkillModel model, Event event) {
      this.model = model;
      this.event = event;
      this.entity = entity;
   }

   public BattleMsg.S2C_Battle_Action.Builder run() {
      BattleMsg.S2C_Battle_Action.Builder actionBuilder = BattleMsg.S2C_Battle_Action.newBuilder();
      actionBuilder.setBattlePos(this.entity.getBattlePos());
      actionBuilder.setId(this.model.getId());
      this.blackboard.addBattleAction(this.type, actionBuilder);
      this.getBlackboard().addSkillParam(1, this.entity);
      this.getBlackboard().addSkillParam(17, this.model);
      Entity target = (Entity)this.event.getParam(3);
      this.getBlackboard().addSkillParam(43, target);

      for(Map.Entry<Integer, Integer> entry : this.model.getEffects().entrySet()) {
         SkillEffectModel effectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", (Integer)entry.getValue());
         if (effectModel != null && effectModel.getEventType().size() == 0 && EffectFuncProcessor.funcMap.containsKey(effectModel.getFunc())) {
            this.blackboard.addSkillParam(16, entry.getKey());
            SkillUtil.doEffect(this, effectModel, this.event, true);
         }
      }

      EffectUtil.putLiveAndDieApportionEvent(this, this.event);
      Event passiveEvent = new Event((short)22, this, this.event);
      passiveEvent.addParam(2, this.entity);
      passiveEvent.addParam(3, this.entity);
      passiveEvent.addParam(22, this.model.getId() / 10);
      this.getScene().getEventListener().pushEvent(passiveEvent);
      this.getScene().getPKTeam((byte)0).sendStatistics(this);
      this.getScene().getPKTeam((byte)1).sendStatistics(this);
      return this.blackboard.buildActionBuilder();
   }
}
