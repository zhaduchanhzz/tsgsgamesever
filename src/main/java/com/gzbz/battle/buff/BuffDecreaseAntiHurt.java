package com.gzbz.battle.buff;

import battle.BuffSubType;
import com.gzbz.battle.condition.ConditionProcessor;
import com.gzbz.battle.conditionProperty.ConditionProperty;
import com.gzbz.battle.effectFunc.EffectUtil;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@BuffSubType(
   subType = 82
)
public class BuffDecreaseAntiHurt extends ListenerBuff {
   public void listen(Event event, ListenerContext context) {
      BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", this.id);
      if (!Objects.isNull(buffModel)) {
         Entity targetEntity = (Entity)event.getParam(3);
         if (targetEntity == this.source) {
            long value = 0L;
            Entity sourceEntity = (Entity)event.getParam(2);
            if (!sourceEntity.isDead()) {
               boolean ignoreShield = sourceEntity.getConditionPropertyManager().ignoreShieldEffect(event.getAction());
               if (!ignoreShield) {
                  value = (long)((float)((Long)event.getParam(1) * (long)((BuffUseFun)buffModel.getFuncs().get(1)).getUseValue()) / 10000.0F);
                  HashMap<Integer, Integer> map = new HashMap();

                  for(int code : this.source.getBuffManager().getSubBuff(buffModel.getSubCls())) {
                     Buff buff = this.source.getBuffManager().getBuff(code);
                     BuffModel model = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buff.id);
                     map.put(code, ((BuffUseFun)model.getFuncs().get(1)).getUseValue());
                  }

                  List<Map.Entry<Integer, Integer>> list = new ArrayList(map.entrySet());
                  list.sort(new Comparator<Map.Entry<Integer, Integer>>() {
                     public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                        return ((Integer)o2.getValue()).compareTo((Integer)o1.getValue());
                     }
                  });
                  int index = 0;

                  for(int i = 0; i < list.size(); ++i) {
                     if ((Integer)((Map.Entry)list.get(i)).getKey() == this.code) {
                        index = i;
                        break;
                     }
                  }

                  if (index >= 1) {
                     if (index == 1) {
                        value = (long)((double)value * (double)0.5F);
                     } else {
                        value = (long)((double)value * (double)0.25F);
                     }
                  }

                  for(Entity entity : this.source.getPkTeam().getEntityMap().values()) {
                     if (!entity.isDead()) {
                        for(ConditionProperty e : entity.getConditionPropertyManager().getTeamImproveAntiHurtList()) {
                           boolean success = ConditionProcessor.checkCondition(event.getAction(), e.skillEffectModel.getConditionType(), e.skillEffectModel.getConditions(), this.source, entity, event);
                           if (success) {
                              value = (long)((float)value * ((float)(Integer)e.skillEffectModel.getFuncParam().get("antiHurtRate") / 10000.0F));
                           }
                        }
                     }
                  }

                  for(ConditionProperty e : sourceEntity.getConditionPropertyManager().getReduceAntiHurtList()) {
                     boolean success = ConditionProcessor.checkCondition(event.getAction(), e.skillEffectModel.getConditionType(), e.skillEffectModel.getConditions(), this.source, sourceEntity, event);
                     if (success) {
                        value = (long)((float)value * ((float)(Integer)e.skillEffectModel.getFuncParam().get("antiHurtRate") / 10000.0F));
                     }
                  }

                  for(Entity entity : sourceEntity.getPkTeam().getEntityMap().values()) {
                     if (!entity.isDead()) {
                        for(ConditionProperty e : entity.getConditionPropertyManager().getTeamReduceAntiHurtList()) {
                           boolean success = ConditionProcessor.checkCondition(event.getAction(), e.skillEffectModel.getConditionType(), e.skillEffectModel.getConditions(), this.source, entity, event);
                           if (success) {
                              value = (long)((float)value * ((float)(Integer)e.skillEffectModel.getFuncParam().get("antiHurtRate") / 10000.0F));
                           }
                        }
                     }
                  }

                  EffectUtil.doShield(event.getAction(), this.source, sourceEntity, value, (SkillEffectModel)null, false, false, event, (byte)0);
                  if (sourceEntity.isDead()) {
                     BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                     effectBuilder.setTargetBattlePos(sourceEntity.getBattlePos());
                     effectBuilder.setEffectType(9);
                     event.getAction().getBlackboard().addBattleEffect(effectBuilder);
                     EffectUtil.putDeadEvent(event.getAction(), this.source, sourceEntity, event);
                     sourceEntity.addDeadTimesAndClear(event.getAction());
                  }

               }
            }
         }
      }
   }
}
