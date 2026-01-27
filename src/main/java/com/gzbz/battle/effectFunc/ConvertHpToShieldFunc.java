package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.buff.BuffFactory;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.List;
import java.util.Objects;

@EffectAnno(
   effect = 79
)
public class ConvertHpToShieldFunc extends EffectFunc {
   public static final String PROPERTY = "propertyId";
   public static final String RATE = "rate";
   public static final String LIMIT_RATE = "limitRate";
   public static final String LIMIT_PROPERTY_ID = "limitPropertyId";
   public static final String BUFF_ID = "buffId";
   public static final String TARGET_TYPE = "targetType";
   public static final String SELECT_TYPE = "selectType";
   public static final String SELECT_NUM = "selectNum";
   public static final String SELECT_PARAM = "selectParam";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (target.isDead()) {
         return false;
      } else if (!target.getStateManager().checkState((short)22) && !target.getStateManager().checkState((short)25)) {
         long lostValue = (long)((float)model.getParam("rate") / 10000.0F * (float)target.getBaseProperty(model.getParam("propertyId")));
         if (lostValue == 0L) {
            return false;
         } else {
            if (model.getFuncParam().containsKey("limitRate") && model.getFuncParam().containsKey("limitPropertyId")) {
               long limitValue = (long)((float)(source.getBaseProperty(model.getParam("limitPropertyId")) * (long)model.getParam("limitRate")) / 10000.0F);
               lostValue = lostValue > limitValue ? limitValue : lostValue;
            }

            lostValue = EffectUtil.linkBuffPositive(action, event, source, target, lostValue);
            lostValue = EffectUtil.liveAndDieBuf(source, target, lostValue);
            long leftValue = Math.max(0L, target.getBaseProperty(99) - lostValue);
            target.setBaseProperty(99, leftValue);
            BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
            effectBuilder.setTargetBattlePos(target.getBattlePos());
            effectBuilder.setEffectType(6);
            effectBuilder.setEffectId(model.getId());
            effectBuilder.setEffectValue(lostValue);
            effectBuilder.setFinalValue(leftValue);
            action.getBlackboard().addBattleEffect(effectBuilder);
            EffectUtil.putLiveAndDieApportionEvent(action, event);
            if (target.isDead()) {
               BattleMsg.S2C_Battle_Effect.Builder builder = BattleMsg.S2C_Battle_Effect.newBuilder();
               builder.setTargetBattlePos(target.getBattlePos());
               builder.setEffectType(9);
               builder.setEffectValue(0L);
               builder.setFinalValue(target.getBaseProperty(99));
               action.getBlackboard().addBattleEffect(builder);
               EffectUtil.putDeadEvent(action, source, target, event);
               target.addDeadTimesAndClear(action);
            }

            byte forceType = ((Integer)model.getFuncParam().get("targetType")).byteValue();
            short selectType = ((Integer)model.getFuncParam().get("selectType")).shortValue();
            int selectNum = (Integer)model.getFuncParam().get("selectNum");
            int selectParam = model.getParam("selectParam");
            Integer buffId = (Integer)model.getFuncParam().get("buffId");
            if (buffId != null) {
               for(Entity entity : source.getScene().selectTarget(action, source, forceType, selectType, selectNum, String.valueOf(selectParam))) {
                  BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buffId);
                  if (Objects.nonNull(buffModel)) {
                     Buff buff = BuffFactory.getBuff(buffModel, entity, source, entity.getBuffManager());
                     if (buff != null) {
                        buff.setValue(1, lostValue);
                        entity.getBuffManager().addBuff(action, buff, buffModel, event);
                     }
                  }
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }
}
