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
import java.util.HashSet;
import java.util.List;
import misc.RandomUtil;

@EffectAnno(
   effect = 65
)
public class BuffMoveShieldToSelfFunc extends EffectFunc {
   public static final String CLEAN_RATE = "cleanRate";
   public static final String MOVE = "move";
   public static final String BUFF_ID = "buffId";
   public static final String RATE = "rate";
   public static final String LIMIT_PROPERTY_ID = "limitPropertyId";
   public static final String LIMIT_RATE = "limitRate";
   public static final String CONVERT_RATE = "cnvRate";
   public static final String LOST_HP_RATE = "lostHpRate";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      long shieldValue = target.getBuffManager().getShieldValue();
      if (shieldValue == 0L) {
         return false;
      } else {
         int cleanRate = (Integer)model.getFuncParam().get("cleanRate");
         long cleanValue = (long)((float)(shieldValue * (long)cleanRate) / 10000.0F);
         HashSet<Buff> delSet = new HashSet();
         target.getBuffManager().modifyBaseProperty(action, -cleanValue, delSet);

         for(Buff buff : delSet) {
            target.getBuffManager().deleteBuffByCode(action, buff.code, false);
         }

         if (model.getFuncParam().containsKey("move")) {
            int move = (Integer)model.getFuncParam().get("move");
            if (move == -1) {
               return true;
            }
         }

         if (model.getFuncParam().containsKey("buffId")) {
            int buffId = (Integer)model.getFuncParam().get("buffId");
            BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buffId);
            if (buffModel != null) {
               Buff buff = BuffFactory.getBuff(buffModel, source, source, source.getBuffManager());
               if (buff != null) {
                  long value = (long)((float)(cleanValue * (long)(Integer)model.getFuncParam().get("rate")) / 10000.0F);
                  if (model.getFuncParam().containsKey("limitPropertyId") && model.getFuncParam().containsKey("limitRate")) {
                     int propertyId = (Integer)model.getFuncParam().get("limitPropertyId");
                     int limitRate = (Integer)model.getFuncParam().get("limitRate");
                     long limitValue = source.getBaseProperty(propertyId) * (long)limitRate / 10000L;
                     value = value > limitValue ? limitValue : value;
                  }

                  buff.setValue(1, value);
                  source.getBuffManager().addBuff(action, buff, buffModel, event);
               }
            }
         }

         this.convertHurt(action, source, target, targets, model, event, cleanValue);
         return true;
      }
   }

   private void convertHurt(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event, long value) {
      if (model.getFuncParam().containsKey("cnvRate")) {
         int cnvRate = (Integer)model.getFuncParam().get("cnvRate");
         if (RandomUtil.randTenThousand() < cnvRate) {
            long lostValue = (long)((float)(value * (long)(Integer)model.getFuncParam().get("lostHpRate")) / 10000.0F);
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
         }
      }

   }
}
