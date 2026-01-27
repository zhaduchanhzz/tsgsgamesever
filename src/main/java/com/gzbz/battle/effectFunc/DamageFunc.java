package com.gzbz.battle.effectFunc;

import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.HeroModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class DamageFunc extends EffectFunc {
   public static final String EX_EFFECT_ID = "exEffect";
   public static final String DAMAGE_RATE = "damageRate";
   public static final String EX_DAMAGE_RATE = "exDamageRate";
   public static final String LAST_TARGET = "lastTarget";
   public static final String NATION_TYPE = "nationType";
   public static final String NATION_RATE = "nationRate";
   public static final String NOAPPORTION_RATE = "noApportionRate";
   public static final float HERO_TENACITY_RATE = 2.0F;
   public static final float DEFENCE_LEVEL_RATE = 6.0F;
   public static final int DEFENCE_CORRECTION_VALUE = 200;

   public static void recordDamageEntity(Action action, Entity source, Entity target) {
      Entity attacker = (Entity)action.getBlackboard().getSkillParam(1);
      if (attacker == source) {
         Set<Entity> set = (Set)action.getBlackboard().getSkillParam(23);
         if (set == null) {
            set = new HashSet();
            action.getBlackboard().addSkillParam(23, set);
         }

         target.addHurtTimes();
         set.add(target);
      }
   }

   public static float getNationDamage(Entity target) {
      HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", target.getId());
      return heroModel == null ? 1.0F : ApplicationContextProvider.getConfigFloat("NationDamageRate_" + heroModel.getType(), 1.0F);
   }

   public static long doDamage(Action action, Entity source, Entity target, List<Entity> targetList, SkillEffectModel model, long damage, Event event) {
      long startTime = System.currentTimeMillis();
      boolean isAlive = target.isAlive();
      long isAllCritValue = 0L;
      long totalDamageValue = 0L;
      target.recordHp(source);
      Long limitValue = (Long)action.getBlackboard().removeSkillParam(34);
      long critiRealValue = 0L;
      long curCritiValue = 0L;
      long newDamage = damage;
      boolean isCrit = EffectUtil.isCrit(action, source, target, model);
      if (isCrit) {
         long finalCritiDamage = (long)((float)source.getBattleProperty(action, 6) - (float)target.getBattleProperty(action, 20) * 2.0F);
         int baseCritiDamage = ApplicationContextProvider.getConfigInt("baseCritiDamage", 10000);
         finalCritiDamage = finalCritiDamage > (long)baseCritiDamage ? finalCritiDamage : (long)baseCritiDamage;
         newDamage = (long)((float)damage * ((float)finalCritiDamage / 10000.0F));
         isAllCritValue += newDamage;
      }

      if (limitValue != null && newDamage > limitValue) {
         newDamage = limitValue;
      }

      long afterLimit = getDamageLimit(action, target, totalDamageValue, newDamage);
      if (afterLimit > 0L) {
         if (isCrit) {
            curCritiValue = target.getBaseProperty(99);
         }

         int noApportionRate = 0;
         if (model.getFuncParam().containsKey("noApportionRate")) {
            noApportionRate = (Integer)model.getFuncParam().get("noApportionRate");
         }

         EffectUtil.doApportion(action, source, target, afterLimit, model, isCrit, event, noApportionRate);
         if (isCrit) {
            critiRealValue += curCritiValue - target.getBaseProperty(99);
         }

         action.getBlackboard().plusSkillLongParam(400 + source.getBattlePos(), afterLimit);
         action.getBlackboard().plusSkillLongParam(500 + target.getBattlePos(), afterLimit);
         action.getBlackboard().plusSkillLongParam(1300 + target.getBattlePos(), critiRealValue);
         totalDamageValue += afterLimit;
      }

      if (afterLimit != newDamage) {
         BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
         effectBuilder.setEffectId(model.getId());
         effectBuilder.setTargetBattlePos(target.getBattlePos());
         effectBuilder.setEffectType(26);
         effectBuilder.setEffectValue(newDamage - afterLimit);
         effectBuilder.setFinalValue(target.getBaseProperty(99));
         action.getBlackboard().addBattleEffect(effectBuilder);
      }

      long realValue = target.getReduceValue(source);
      action.getBlackboard().plusSkillLongParam(1800 + source.getBattlePos(), realValue);
      action.getBlackboard().plusSkillLongParam(1100 + source.getBattlePos(), realValue);
      action.getBlackboard().plusSkillLongParam(1200 + target.getBattlePos(), realValue);
      recordDamageValueAndEvent(action, event, source, target, targetList, totalDamageValue, realValue, isAllCritValue, critiRealValue);
      if (isAlive && target.isDead()) {
         BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
         effectBuilder.setTargetBattlePos(target.getBattlePos());
         effectBuilder.setEffectType(9);
         effectBuilder.setEffectValue(1L);
         effectBuilder.setFinalValue(target.getBaseProperty(99));
         action.getBlackboard().addBattleEffect(effectBuilder);
         EffectUtil.putDeadEvent(action, source, target, event);
         target.addDeadTimesAndClear(action);
      }

      action.getBlackboard().plusSkillLongParam(33, totalDamageValue);
      return totalDamageValue;
   }

   public static void recordDamageValueAndEvent(Action action, Event event, Entity source, Entity target, List<Entity> targetList, long totalDamageValue, long realValue, long isAllCritValue, long critiRealValue) {
      long shieldPreHurt = (Long)action.getBlackboard().getSkillParam(2200 + target.getBattlePos(), 0L);
      Event hurtEvent = new Event((short)4, action, event);
      hurtEvent.addParam(24, totalDamageValue);
      hurtEvent.addParam(1, realValue);
      hurtEvent.addParam(2, source);
      hurtEvent.addParam(3, target);
      hurtEvent.addParam(34, shieldPreHurt);
      hurtEvent.addParam(14, targetList);
      recordDamageEntity(action, source, target);
      if (isAllCritValue > 0L) {
         hurtEvent.addParam(4, isAllCritValue);
         hurtEvent.addParam(23, critiRealValue);
      }

      EntitySkill skill = (EntitySkill)action.getBlackboard().getSkillParam(4, (Object)null);
      if (skill != null) {
         hurtEvent.addParam(5, skill);
         source.getScene().getEventListener().pushEvent(hurtEvent);
      }

   }

   public static long getPhyAttack(Action action, long attack, Entity source, Entity target, float SKILL_RATE) {
      float dmgRate = 1.0F + (float)(source.getBattleProperty(action, 10) + source.getBattleProperty(action, 12) - target.getBattleProperty(action, 102)) / 10000.0F;
      dmgRate = dmgRate < 0.0F ? 1.0F : dmgRate;
      float defence = (float)(target.getBattleProperty(action, 3) * source.getBattleProperty(action, 23)) / 10000.0F;
      defence = defence < 0.0F ? 1.0F : defence;
      if (source.getBuffManager().isExistSubType((short)111)) {
         defence = 0.0F;
      }

      float defenceRate = 1.0F - defence / (defence + 200.0F + (float)target.getPkTeam().getMaxLevel() * ApplicationContextProvider.getConfigFloat("DEFENCE_LEVEL_RATE", 6.0F));
      defenceRate = defenceRate < 0.0F ? 1.0F : defenceRate;
      float immune = (float)target.getBattleProperty(action, 11) / 10000.0F * ((float)target.getBattleProperty(action, 14) / 10000.0F);
      if (immune < 0.0F || immune >= 1.0F) {
         immune = 1.0F;
      }

      float realImmune = 1.0F - immune;
      if (realImmune * 10000.0F > (float)ApplicationContextProvider.getConfigInt("shieldRateLimit", 5000)) {
         long totalValue = target.getBuffManager().getShieldValue();
         if (totalValue > 0L) {
            double shieldRate = (double)totalValue / (double)target.getBattleProperty(action, 1);
            if (shieldRate > (double)1.0F) {
               shieldRate = (double)1.0F;
            }

            realImmune = (float)((double)realImmune * ((double)1.0F - shieldRate * (double)ApplicationContextProvider.getConfigInt("shieldRate", 5000) / (double)10000.0F));
            if (realImmune * 10000.0F < (float)ApplicationContextProvider.getConfigInt("shieldRateLimit", 5000)) {
               realImmune = (float)ApplicationContextProvider.getConfigInt("shieldRateLimit", 5000) / 10000.0F;
            }

            immune = 1.0F - realImmune;
         }
      }

      int rate = 10000;
      if (action.getBlackboard().getSkillParam(29) == source) {
         rate = (Integer)action.getBlackboard().getSkillParam(13, 10000);
      }

      long exAtk = 0L;
      if (action.getType() == 42) {
         exAtk = source.getBattleProperty(action, 26);
      }

      int round = action.getScene().getRound() - ApplicationContextProvider.getConfigInt("DecrementRound", 8);
      int exRate = 0;
      if (round >= 0) {
         int DecrementRoundRate = ApplicationContextProvider.getConfigInt("DecrementRoundRate", 500);
         int DecrementRoundRateTrue = ApplicationContextProvider.getConfigInt("DecrementRoundRateTrue", DecrementRoundRate);
         exRate = (round + 1) * DecrementRoundRateTrue;
      }

      float subReign = _getReign(action, source, 21) - _getReign(action, target, 21) + 1.0F;
      subReign = subReign < 0.0F ? 1.0F : subReign;
      long damageValue = (long)((float)(attack + exAtk) * dmgRate * SKILL_RATE * defenceRate * immune * (float)(rate + exRate) / 10000.0F * subReign);
      if (action.getScene().getType() == 2020 && source.getPkTeam().getCountryWarScoreAdd() != 0) {
         float countRate = (float)ApplicationContextProvider.getConfigInt("countrywarAddPro", 500) / 10000.0F;
         damageValue = (long)((float)damageValue + (float)damageValue * countRate * (float)source.getPkTeam().getCountryWarScoreAdd());
      }

      return damageValue > 0L ? damageValue : 0L;
   }

   private static float _getReign(Action action, Entity source, int property) {
      long reignNum = source.getBattleProperty(action, property);
      return (float)reignNum / (float)((long)ApplicationContextProvider.getConfigInt("ReignMulRate", 4) * reignNum + (long)ApplicationContextProvider.getConfigInt("ReignPlusRate", 888));
   }

   public static long getPhyAttack(Action action, long attack, Entity source, Entity target) {
      float SKILL_RATE = ApplicationContextProvider.getConfigFloat("Skill_Rate", 1.0F);
      return getPhyAttack(action, attack, source, target, SKILL_RATE);
   }

   public static long getMagicAttack(Action action, long attack, Entity source, Entity target, float SKILL_RATE) {
      float dmgRate = 1.0F + (float)(source.getBattleProperty(action, 10) + source.getBattleProperty(action, 13) - target.getBattleProperty(action, 102)) / 10000.0F;
      dmgRate = dmgRate < 0.0F ? 1.0F : dmgRate;
      float defence = (float)(target.getBattleProperty(action, 3) * source.getBattleProperty(action, 23)) / 10000.0F;
      defence = defence < 0.0F ? 0.0F : defence;
      if (source.getBuffManager().isExistSubType((short)111)) {
         defence = 0.0F;
      }

      float defenceRate = 1.0F - defence / (defence + 200.0F + (float)target.getPkTeam().getMaxLevel() * ApplicationContextProvider.getConfigFloat("DEFENCE_LEVEL_RATE", 6.0F));
      defenceRate = defenceRate < 0.0F ? 1.0F : defenceRate;
      float immune = (float)target.getBattleProperty(action, 11) / 10000.0F * ((float)target.getBattleProperty(action, 15) / 10000.0F);
      if (immune < 0.0F || immune >= 1.0F) {
         immune = 1.0F;
      }

      float realImmune = 1.0F - immune;
      if (realImmune * 10000.0F > (float)ApplicationContextProvider.getConfigInt("shieldRateLimit", 5000)) {
         long totalValue = target.getBuffManager().getShieldValue();
         if (totalValue > 0L) {
            double shieldRate = (double)totalValue / (double)target.getBattleProperty(action, 1);
            if (shieldRate > (double)1.0F) {
               shieldRate = (double)1.0F;
            }

            realImmune = (float)((double)realImmune * ((double)1.0F - shieldRate * (double)ApplicationContextProvider.getConfigInt("shieldRate", 5000) / (double)10000.0F));
            if (realImmune * 10000.0F < (float)ApplicationContextProvider.getConfigInt("shieldRateLimit", 5000)) {
               realImmune = (float)ApplicationContextProvider.getConfigInt("shieldRateLimit", 5000) / 10000.0F;
            }

            immune = 1.0F - realImmune;
         }
      }

      int rate = 10000;
      if (action.getBlackboard().getSkillParam(29) == source) {
         rate = (Integer)action.getBlackboard().getSkillParam(13, 10000);
      }

      long exAtk = 0L;
      if (action.getType() == 42) {
         exAtk = source.getBattleProperty(action, 26);
      }

      int round = action.getScene().getRound() - ApplicationContextProvider.getConfigInt("DecrementRound", 8);
      int exRate = 0;
      if (round >= 0) {
         int DecrementRoundRate = ApplicationContextProvider.getConfigInt("DecrementRoundRate", 500);
         int DecrementRoundRateTrue = ApplicationContextProvider.getConfigInt("DecrementRoundRateTrue", DecrementRoundRate);
         exRate = (round + 1) * DecrementRoundRateTrue;
      }

      float subReign = _getReign(action, source, 22) - _getReign(action, target, 22) + 1.0F;
      subReign = subReign < 0.0F ? 1.0F : subReign;
      long attackValue = (long)((float)(attack + exAtk) * dmgRate * SKILL_RATE * defenceRate * (float)(rate + exRate) / 10000.0F * subReign * immune);
      if (action.getScene().getType() == 2020 && source.getPkTeam().getCountryWarScoreAdd() != 0) {
         float countRate = (float)ApplicationContextProvider.getConfigInt("countrywarAddPro", 500) / 10000.0F;
         attackValue = (long)((float)attackValue + (float)attackValue * countRate * (float)source.getPkTeam().getCountryWarScoreAdd());
      }

      return attackValue > 0L ? attackValue : 0L;
   }

   public static long getMagicAttack(Action action, long attack, Entity source, Entity target) {
      float SKILL_RATE = ApplicationContextProvider.getConfigFloat("Skill_Rate", 1.0F);
      return getMagicAttack(action, attack, source, target, SKILL_RATE);
   }

   public static int getNationRate(Entity source, SkillEffectModel model) {
      int rate = 0;
      if (model.getFuncParam().containsKey("nationType") && model.getFuncParam().containsKey("nationRate")) {
         int temp = 0;
         HeroModel heroModel = null;

         for(Entity entity : source.getPkTeam().getEntityMap().values()) {
            heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", entity.getId());
            int nation = heroModel.getNation();
            if (nation == 10) {
               nation = entity.inheritNation;
            }

            if (heroModel != null && nation == (Integer)model.getFuncParam().get("nationType")) {
               ++temp;
            }
         }

         rate = temp * (Integer)model.getFuncParam().get("nationRate");
      }

      return rate;
   }

   public static long getDamageLimit(Action action, Entity entity, long totalDamage, long damage) {
      return damage;
   }
}
