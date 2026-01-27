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
import java.util.TreeSet;

@EffectAnno(
   effect = 8
)
public class HurtHpMaxPercent extends EffectFunc {
   public static final String PROPERTY_ID = "propertyId";
   public static final String DEPENDENT = "dependent";
   public static final String RATE = "rate";
   public static final String MAX_DAMAGE_RATE = "maxDamageRate";
   public static final String AVER = "aver";
   public static final String BUFF_SUBCLS = "buffSubCls";
   public static final String EX_BUFF_SUBCLS = "exBuffSubCls";
   public static final String BUFF_NUM = "buffNum";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (!target.isDead() && target.entityType == 0) {
         long damage;
         if (model.getFuncParam().containsKey("dependent") && (Integer)model.getFuncParam().get("dependent") != 0) {
            damage = (long)((float)(source.getBaseProperty((Integer)model.getFuncParam().get("propertyId")) * (long)(Integer)model.getFuncParam().get("rate")) / 10000.0F);
         } else {
            damage = (long)((float)(target.getBaseProperty((Integer)model.getFuncParam().get("propertyId")) * (long)(Integer)model.getFuncParam().get("rate")) / 10000.0F);
         }

         if (model.getFuncParam().containsKey("aver") && (Integer)model.getFuncParam().get("aver") == 1) {
            damage /= (long)targets.size();
         }

         float maxDamage = (float)(source.getBaseProperty(2) * (long)(Integer)model.getFuncParam().get("maxDamageRate")) / 10000.0F;
         int rate = 10000;
         if (action.getBlackboard().getSkillParam(29) == source) {
            rate = (Integer)action.getBlackboard().getSkillParam(13, 10000);
         }

         damage = (long)Math.min((float)damage, maxDamage) * (long)rate / 10000L;
         if (model.getFuncParam().containsKey("buffSubCls") && model.getFuncParam().containsKey("buffNum")) {
            short buffSubcls = ((Integer)model.getFuncParam().get("buffSubCls")).shortValue();
            int buffNum = (Integer)model.getFuncParam().get("buffNum");
            if (buffNum < -1) {
               return false;
            }

            buffNum = this.costBuff(action, source, buffSubcls, buffNum);
            if (buffNum == 0) {
               return false;
            }

            damage *= (long)buffNum;
            short exBuffSubcls = (short)model.getParam("exBuffSubCls");
            this.costBuff(action, source, exBuffSubcls, buffNum);
         }

         target.recordHp(source);
         EffectUtil.doShield(action, source, target, damage, model, false, false, event, (byte)0);
         long realValue = target.getReduceValue(source);
         long shieldPreHurt = (Long)action.getBlackboard().getSkillParam(2200 + target.getBattlePos(), 0L);
         if (target.isDead()) {
            BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
            effectBuilder.setTargetBattlePos(target.getBattlePos());
            effectBuilder.setEffectType(9);
            effectBuilder.setEffectValue(1L);
            effectBuilder.setFinalValue(target.getBaseProperty(99));
            effectBuilder.setEffectSetId(model.getId());
            action.getBlackboard().addBattleEffect(effectBuilder);
            EffectUtil.putDeadEvent(action, source, target, event);
            target.addDeadTimesAndClear(action);
         }

         action.getBlackboard().plusSkillLongParam(400 + source.getBattlePos(), damage);
         action.getBlackboard().plusSkillLongParam(500 + target.getBattlePos(), damage);
         action.getBlackboard().plusSkillLongParam(1100 + source.getBattlePos(), realValue);
         action.getBlackboard().plusSkillLongParam(1200 + target.getBattlePos(), realValue);
         Event hurtEvent = new Event((short)4, action, event);
         hurtEvent.addParam(1, realValue);
         hurtEvent.addParam(2, source);
         hurtEvent.addParam(3, target);
         hurtEvent.addParam(34, shieldPreHurt);
         hurtEvent.addParam(14, targets);
         EntitySkill skill = (EntitySkill)action.getBlackboard().getSkillParam(4, (Object)null);
         if (Objects.isNull(skill)) {
            return false;
         } else {
            hurtEvent.addParam(5, skill);
            source.getScene().getEventListener().pushEvent(hurtEvent);
            return true;
         }
      } else {
         return false;
      }
   }

   private int costBuff(Action action, Entity source, short buffSubcls, int buffNum) {
      TreeSet<Integer> subCode = source.getBuffManager().getSubBuff(buffSubcls);
      if (buffNum != 0 && !Objects.isNull(subCode) && !subCode.isEmpty()) {
         Integer[] arrays = (Integer[])subCode.toArray(new Integer[subCode.size()]);
         if (buffNum == -1 || buffNum > arrays.length) {
            buffNum = arrays.length;
         }

         for(int i = 0; i < buffNum; ++i) {
            source.getBuffManager().deleteBuffByCode(action, arrays[i], false);
         }

         return buffNum;
      } else {
         return 0;
      }
   }
}
