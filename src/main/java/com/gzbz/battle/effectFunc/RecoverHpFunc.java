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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@EffectAnno(
   effect = 7
)
public class RecoverHpFunc extends EffectFunc {
   static Logger logger = LoggerFactory.getLogger(RecoverHpFunc.class);
   public static final String DEPEND = "depend";
   public static final String PROPERTY_ID = "propertyId";
   public static final String RATE = "rate";
   public static final String SOURCE_RATE = "sourceRate";
   public static final String TARGET_RATE = "targetRate";
   public static final String SHIELD_ID = "shieldId";
   public static final String LIMIT_RATE = "limitRate";
   public static final String LIMIT_DAMAGE_RATE = "limitDamageRate";
   public static final String CRIT_RATE = "critRate";
   public static final String HP_PERCENT = "hpPercent";
   public static final String EX_RATE = "exRate";
   public static final byte DEPEND_SOURCE = 1;
   public static final byte DEPEND_TARGET = 2;
   public static final byte DEPEND_ATTACK = 3;
   public static final byte DEPEND_DAMAGE = 4;
   public static final byte DEPEND_BOTH = 5;
   public static final byte DEPEND_CRIT = 6;
   public static final byte DEPEND_AVG_ATTACK = 7;
   public static final byte DEPEND_BASE_ATTACK = 8;
   public static final byte DEPEND_REAL_ATTACK = 9;
   public static final byte DEPEND_REAL_DAMAGE = 10;
   public static final byte DEPEND_REAL_CRITI_DAMAGE = 11;
   public static final byte DEPEND_REAL_LOST_HP = 12;
   public static final byte DEPEND_REAL_ATTACKER = 13;
   public static final byte DEPEND_EVENT_TARGET = 14;
   public static final byte DEPEND_REAL_ATTACK_SINGLE = 15;
   public static final byte DEPEND_SOURCE_NO_CURE = 16;
   public static final byte DEPEND_TARGET_NO_CURE = 17;
   public static final byte DEPEND_REAL_ATTACK_AVER = 18;

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (target.isDead()) {
         return false;
      } else {
         long value = this.getDependValue(action, source, target, model, event);
         value = this.getRecoverHpExValue(target, model, value);
         if (value == 0L) {
            return false;
         } else if (target.getStateManager().checkState((short)14)) {
            BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
            effectBuilder.setEffectType(28);
            effectBuilder.setTargetBattlePos(target.getBattlePos());
            action.getBlackboard().addBattleEffect(effectBuilder);
            return true;
         } else if (!target.isDead() && value != 0L) {
            if (model.getParam("rate") != 0) {
               value = (long)((float)value * ((float)(Integer)model.getFuncParam().get("rate") / 10000.0F));
            }

            Integer rateTime = (Integer)action.getBlackboard().getSkillParam(42);
            if (rateTime != null && rateTime > 0) {
               value *= (long)rateTime;
            }

            Integer dependType = (Integer)model.getFuncParam().get("depend");
            if (dependType == 14 || dependType == 18) {
               value /= (long)targets.size();
            }

            if (model.getFuncParam().containsKey("limitRate") && (dependType.byteValue() == 3 || dependType.byteValue() == 9 || dependType.byteValue() == 13 || dependType.byteValue() == 14 || dependType.byteValue() == 15 || dependType.byteValue() == 1 || dependType.byteValue() == 16 || dependType.byteValue() == 17 || dependType.byteValue() == 18)) {
               int limitValue = (int)(target.getBaseProperty(1) * (long)(Integer)model.getFuncParam().get("limitRate") / 10000L);
               value = value > (long)limitValue ? (long)limitValue : value;
            }

            int shieldId = 0;
            long surplusValue = 0L;
            if (model.getFuncParam().containsKey("shieldId")) {
               shieldId = (Integer)model.getFuncParam().get("shieldId");
            }

            float actionRate = 1.0F;
            if (source == action.getBlackboard().getSkillParam(29)) {
               actionRate = (float)(Integer)action.getBlackboard().getSkillParam(28, 10000) / 10000.0F;
            }

            long newDamage = value;
            boolean isCriti = EffectUtil.isCrit(action, source, model);
            if (dependType == 14) {
               isCriti = false;
            }

            if (isCriti) {
               newDamage = (long)((float)value * ((float)(10000L + source.getBattleProperty(action, 25)) / 10000.0F));
            }

            newDamage = (long)((float)newDamage * actionRate);
            long covertValue = EffectUtil.hurtCureExchange(action, source, target, newDamage, model, false, false, event);
            newDamage -= covertValue;
            if (newDamage == 0L) {
               EffectUtil.doCureToHurt(action, source, target, covertValue, model, event);
               return true;
            } else {
               long moreValue = newDamage - (target.getBaseProperty(1) - target.getBaseProperty(99));
               surplusValue += moreValue > 0L ? moreValue : 0L;
               action.getBlackboard().addSkillParam(2500 + target.getBattlePos(), true);
               target.recoverHp(action, source, model, isCriti, newDamage, event, true);
               EffectUtil.doCureToHurt(action, source, target, covertValue, model, event);
               if (surplusValue != 0L) {
                  if (shieldId != 0) {
                     BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", shieldId);
                     if (Objects.nonNull(buffModel)) {
                        Buff buff = BuffFactory.getBuff(buffModel, target, source, target.getBuffManager());
                        if (buff == null) {
                           return false;
                        }

                        buff.setValue(1, surplusValue);
                        target.getBuffManager().addBuff(action, buff, buffModel, event);
                     }
                  } else {
                     action.getBlackboard().addSkillParam(55, model);
                     Event surplusValueEvent = new Event((short)26, action, event);
                     surplusValueEvent.addParam(12, action);
                     surplusValueEvent.addParam(3, target);
                     surplusValueEvent.addParam(2, source);
                     surplusValueEvent.addParam(10, surplusValue);
                     target.getScene().getEventListener().pushEvent(surplusValueEvent);
                  }
               }

               action.getBlackboard().plusSkillLongParam(800 + source.getBattlePos(), newDamage);
               action.getBlackboard().plusSkillLongParam(700 + target.getBattlePos(), newDamage);
               Event reviveEvent = new Event((short)12, action, event);
               reviveEvent.addParam(12, action);
               reviveEvent.addParam(3, target);
               reviveEvent.addParam(2, source);
               reviveEvent.addParam(10, value);
               reviveEvent.addParam(31, model);
               target.getScene().getEventListener().pushEvent(reviveEvent);
               return true;
            }
         } else {
            return false;
         }
      }
   }

   protected long getDependValue(Action action, Entity source, Entity target, SkillEffectModel model, Event event) {
      long value = 0L;
      Integer dependType = (Integer)model.getFuncParam().get("depend");
      if (dependType == null) {
         return 0L;
      } else {
         switch (dependType.byteValue()) {
            case 1:
               float SKILL_RATE = ApplicationContextProvider.getConfigFloat("Skill_Rate", 1.0F);
               float totalRate = (float)(10000L + source.getBattleProperty(action, 18)) / 10000.0F * (float)(10000L + target.getBattleProperty(action, 19)) / 10000.0F;
               totalRate *= target.getBuffManager().getBeCureValue();
               if (totalRate < 0.001F) {
                  totalRate = 0.001F;
               }

               int property1 = (Integer)model.getFuncParam().get("propertyId");
               if (property1 == 1) {
                  value = (long)((float)source.getBaseProperty(property1) * SKILL_RATE * totalRate);
               } else {
                  value = (long)((float)source.getBattleProperty(action, property1) * SKILL_RATE * totalRate);
               }
               break;
            case 2:
               float SKILL_RATE = ApplicationContextProvider.getConfigFloat("Skill_Rate", 1.0F);
               float totalRate = (float)(10000L + source.getBattleProperty(action, 18)) / 10000.0F * (float)(10000L + target.getBattleProperty(action, 19)) / 10000.0F;
               totalRate *= target.getBuffManager().getBeCureValue();
               if (totalRate < 0.001F) {
                  totalRate = 0.001F;
               }

               int property2 = (Integer)model.getFuncParam().get("propertyId");
               if (property2 == 1) {
                  value = (long)((float)target.getBaseProperty(property2) * SKILL_RATE * totalRate);
               } else {
                  value = (long)((float)target.getBattleProperty(action, property2) * SKILL_RATE * totalRate);
               }
               break;
            case 3:
               float totalRate = (float)(10000L + source.getBattleProperty(action, 18)) / 10000.0F * (float)(10000L + target.getBattleProperty(action, 19)) / 10000.0F;
               totalRate *= target.getBuffManager().getBeCureValue();
               if (totalRate < 0.001F) {
                  totalRate = 0.001F;
               }

               if (Objects.isNull(event)) {
                  value = (Long)action.getBlackboard().getSkillParam(400 + source.getBattlePos(), 0L);
               } else {
                  Long tmp = (Long)event.getParam(1);
                  if (tmp == null) {
                     tmp = (Long)action.getBlackboard().getSkillParam(400 + source.getBattlePos(), 0L);
                  }

                  if (tmp == null) {
                     return 0L;
                  }

                  value = tmp;
               }

               value = (long)((float)value * totalRate);
               break;
            case 4:
               float totalRate = (float)(10000L + target.getBattleProperty(action, 19)) / 10000.0F;
               totalRate *= target.getBuffManager().getBeCureValue();
               if (totalRate < 0.001F) {
                  totalRate = 0.001F;
               }

               if (Objects.isNull(event)) {
                  value = (Long)action.getBlackboard().getSkillParam(500 + source.getBattlePos(), 0L);
               } else {
                  value = (Long)event.getParam(1);
               }

               if (model.getFuncParam().containsKey("limitDamageRate")) {
                  float limitRate = (float)(Integer)model.getFuncParam().get("limitDamageRate") / 10000.0F;
                  if (totalRate > limitRate) {
                     value = (long)((float)value * limitRate);
                  } else {
                     value = (long)((float)value * totalRate);
                  }
               } else {
                  value = (long)((float)value * totalRate);
               }
               break;
            case 5:
               value = (long)((float)(source.getBattleProperty(action, (Integer)model.getFuncParam().get("propertyId")) * (long)(Integer)model.getFuncParam().get("sourceRate")) / 10000.0F);
               value = (long)((float)value + (float)(target.getBattleProperty(action, (Integer)model.getFuncParam().get("propertyId")) * (long)(Integer)model.getFuncParam().get("targetRate")) / 10000.0F);
               break;
            case 6:
               float totalRate = (float)(10000L + source.getBattleProperty(action, 18)) / 10000.0F * (float)(10000L + target.getBattleProperty(action, 19)) / 10000.0F;
               totalRate *= target.getBuffManager().getBeCureValue();
               if (totalRate < 0.001F) {
                  totalRate = 0.001F;
               }

               if (Objects.isNull(event)) {
                  value = (Long)action.getBlackboard().getSkillParam(400 + source.getBattlePos(), 0L);
               } else {
                  Long tmp = (Long)event.getParamDefault(4, 0L);
                  if (tmp == null) {
                     return 0L;
                  }

                  value = tmp;
               }

               value = (long)((float)value * totalRate);
               break;
            case 7:
               float totalRate = (float)(10000L + source.getBattleProperty(action, 18)) / 10000.0F * (float)(10000L + target.getBattleProperty(action, 19)) / 10000.0F;
               totalRate *= target.getBuffManager().getBeCureValue();
               if (totalRate < 0.001F) {
                  totalRate = 0.001F;
               }

               if (Objects.isNull(event)) {
                  value = (Long)action.getBlackboard().getSkillParam(400 + source.getBattlePos(), 0L);
               } else {
                  Long tmp = (Long)event.getParam(1);
                  if (tmp == null) {
                     tmp = (Long)action.getBlackboard().getSkillParam(400 + source.getBattlePos(), 0L);
                  }

                  if (tmp == null) {
                     return 0L;
                  }

                  value = tmp;
               }

               List list = (List)event.getParam(14);
               int num;
               if (!Objects.isNull(list) && list.size() != 0) {
                  num = list.size();
               } else {
                  num = 1;
               }

               value = (long)((float)value * totalRate);
               value /= (long)num;
               break;
            case 8:
               float SKILL_RATE = ApplicationContextProvider.getConfigFloat("Skill_Rate", 1.0F);
               float totalRate = (float)(10000L + source.getBattleProperty(action, 18)) / 10000.0F * (float)(10000L + target.getBattleProperty(action, 19)) / 10000.0F;
               totalRate *= target.getBuffManager().getBeCureValue();
               if (totalRate < 0.001F) {
                  totalRate = 0.001F;
               }

               value = (long)((float)source.getBaseProperty(2) * SKILL_RATE * totalRate);
               break;
            case 9:
            case 18:
               float totalRate = (float)(10000L + source.getBattleProperty(action, 18)) / 10000.0F * (float)(10000L + target.getBattleProperty(action, 19)) / 10000.0F;
               totalRate *= target.getBuffManager().getBeCureValue();
               if (totalRate < 0.001F) {
                  totalRate = 0.001F;
               }

               if (Objects.isNull(event)) {
                  value = (Long)action.getBlackboard().getSkillParam(1100 + source.getBattlePos(), 0L);
               } else {
                  Long tmp = (Long)event.getParam(1);
                  if (tmp == null) {
                     tmp = (Long)action.getBlackboard().getSkillParam(1100 + source.getBattlePos(), 0L);
                  }

                  if (tmp == null) {
                     return 0L;
                  }

                  value = tmp;
               }

               value = (long)((float)value * totalRate);
               break;
            case 10:
               float totalRate = (float)(10000L + target.getBattleProperty(action, 19)) / 10000.0F;
               totalRate *= target.getBuffManager().getBeCureValue();
               if (totalRate < 0.001F) {
                  totalRate = 0.001F;
               }

               if (Objects.isNull(event)) {
                  value = (Long)action.getBlackboard().getSkillParam(1200 + source.getBattlePos(), 0L);
               } else {
                  value = (Long)event.getParam(1);
               }

               if (model.getFuncParam().containsKey("limitDamageRate")) {
                  float limitRate = (float)(Integer)model.getFuncParam().get("limitDamageRate") / 10000.0F;
                  if (totalRate > limitRate) {
                     value = (long)((float)value * limitRate);
                  } else {
                     value = (long)((float)value * totalRate);
                  }
               } else {
                  value = (long)((float)value * totalRate);
               }
               break;
            case 11:
               float totalRate = (float)(10000L + source.getBattleProperty(action, 18)) / 10000.0F * (float)(10000L + target.getBattleProperty(action, 19)) / 10000.0F;
               totalRate *= target.getBuffManager().getBeCureValue();
               if (totalRate < 0.001F) {
                  totalRate = 0.001F;
               }

               if (Objects.isNull(event)) {
                  value = (Long)action.getBlackboard().getSkillParam(400 + source.getBattlePos(), 0L);
               } else {
                  Long tmp = (Long)event.getParamDefault(23, 0L);
                  if (tmp == null) {
                     return 0L;
                  }

                  value = tmp;
               }

               value = (long)((float)value * totalRate);
               break;
            case 12:
               long lostHp = target.getBattleProperty(action, 1) - target.getBattleProperty(action, 99);
               if (lostHp < 0L) {
                  return 0L;
               }

               float totalRate = (float)(10000L + source.getBattleProperty(action, 18)) / 10000.0F * (float)(10000L + target.getBattleProperty(action, 19)) / 10000.0F;
               totalRate *= target.getBuffManager().getBeCureValue();
               if (totalRate < 0.001F) {
                  totalRate = 0.001F;
               }

               value = (long)((float)lostHp * totalRate);
               break;
            case 13:
               Entity attacker = (Entity)event.getAction().getBlackboard().getSkillParam(1);
               if (attacker == null) {
                  return 0L;
               }

               float totalRate = (float)(10000L + source.getBattleProperty(action, 18)) / 10000.0F * (float)(10000L + target.getBattleProperty(action, 19)) / 10000.0F;
               totalRate *= target.getBuffManager().getBeCureValue();
               if (totalRate < 0.001F) {
                  totalRate = 0.001F;
               }

               value = (Long)action.getBlackboard().getSkillParam(1100 + attacker.getBattlePos(), 0L);
               if (model.getFuncParam().containsKey("limitDamageRate")) {
                  float limitRate = (float)(Integer)model.getFuncParam().get("limitDamageRate") / 10000.0F;
                  if (totalRate > limitRate) {
                     value = (long)((float)value * limitRate);
                  } else {
                     value = (long)((float)value * totalRate);
                  }
               } else {
                  value = (long)((float)value * totalRate);
               }
               break;
            case 14:
               float SKILL_RATE = ApplicationContextProvider.getConfigFloat("Skill_Rate", 1.0F);
               Entity entity = (Entity)event.getParam(3);
               int property = (Integer)model.getFuncParam().get("propertyId");
               if (property == 1) {
                  value = (long)((float)entity.getBaseProperty(property) * SKILL_RATE);
               } else {
                  value = (long)((float)entity.getBattleProperty(action, property) * SKILL_RATE);
               }
               break;
            case 15:
               float totalRate = (float)(10000L + source.getBattleProperty(action, 18)) / 10000.0F * (float)(10000L + target.getBattleProperty(action, 19)) / 10000.0F;
               totalRate *= target.getBuffManager().getBeCureValue();
               if (totalRate < 0.001F) {
                  totalRate = 0.001F;
               }

               if (Objects.isNull(event)) {
                  value = (Long)action.getBlackboard().getSkillParam(1800 + source.getBattlePos(), 0L);
               } else {
                  Long tmp = (Long)event.getParam(1);
                  if (tmp == null) {
                     tmp = (Long)action.getBlackboard().getSkillParam(1800 + source.getBattlePos(), 0L);
                  }

                  if (tmp == null) {
                     return 0L;
                  }

                  value = tmp;
               }

               value = (long)((float)value * totalRate);
               break;
            case 16:
               float SKILL_RATE = ApplicationContextProvider.getConfigFloat("Skill_Rate", 1.0F);
               int propertyId1 = (Integer)model.getFuncParam().get("propertyId");
               if (propertyId1 == 1) {
                  value = (long)((float)source.getBaseProperty(propertyId1) * SKILL_RATE);
               } else {
                  value = (long)((float)source.getBattleProperty(action, propertyId1) * SKILL_RATE);
               }
               break;
            case 17:
               float SKILL_RATE = ApplicationContextProvider.getConfigFloat("Skill_Rate", 1.0F);
               int propertyId2 = (Integer)model.getFuncParam().get("propertyId");
               if (propertyId2 == 1) {
                  value = (long)((float)target.getBaseProperty(propertyId2) * SKILL_RATE);
               } else {
                  value = (long)((float)target.getBattleProperty(action, propertyId2) * SKILL_RATE);
               }
         }

         return value;
      }
   }

   public long getRecoverHpExValue(Entity target, SkillEffectModel model, long value) {
      if (model.getFuncParam().containsKey("hpPercent") && model.getFuncParam().containsKey("exRate")) {
         int percent = (int)((float)target.getBaseProperty(99) * 1.0F / (float)target.getBaseProperty(1) * 10000.0F);
         if (percent < (Integer)model.getFuncParam().get("hpPercent")) {
            value = (long)((float)value + (float)(value * (long)(Integer)model.getFuncParam().get("exRate")) / 10000.0F);
         }
      }

      return value;
   }
}
