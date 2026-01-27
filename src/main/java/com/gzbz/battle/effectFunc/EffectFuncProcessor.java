package com.gzbz.battle.effectFunc;

import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.condition.ConditionProcessor;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battleTest.BattleTestMgr;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import debug.Debug;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;
import misc.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EffectFuncProcessor implements Serializable {
   static Logger logger = LoggerFactory.getLogger(EffectFuncProcessor.class);
   public static HashMap<Short, EffectFunc> funcMap = new HashMap();

   public static EffectFunc getFunc(short type) {
      return (EffectFunc)funcMap.get(type);
   }

   public static boolean doFunc(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (target.entityType != 0) {
         return false;
      } else if (model.getNeedDressId() > 0 && !source.getActiveDressIds().contains(model.getNeedDressId())) {
         return false;
      } else {
         EffectFunc func = (EffectFunc)funcMap.get(model.getFunc());
         if (func == null) {
            return false;
         } else if (!ConditionProcessor.checkCondition(action, model.getConditionType(), model.getConditions(), source, target, event)) {
            return false;
         } else {
            boolean mustHit = false;
            TreeSet<Integer> hitSet = source.getBuffManager().getSubBuff((short)80);
            if (hitSet != null && hitSet.size() > 0) {
               Integer code = (Integer)hitSet.first();
               Buff buff = source.getBuffManager().getBuff(code);
               BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buff.id);
               if (buffModel != null && hitSet.size() >= buffModel.getCombine()) {
                  mustHit = true;
               }
            }

            boolean atkerHitMark = (Boolean)action.getBlackboard().getSkillParam(2100 + source.getBattlePos(), false);
            boolean hitMark = (Boolean)action.getBlackboard().getSkillParam(1900 + target.getBattlePos(), false);
            boolean isHit = (Boolean)action.getBlackboard().getSkillParam(100 + target.getBattlePos(), true);
            if (!isHit && event == null && !mustHit && !hitMark && !atkerHitMark) {
               BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
               effectBuilder.setTargetBattlePos(target.getBattlePos());
               effectBuilder.setEffectType(1);
               effectBuilder.setEffectId(model.getId());
               effectBuilder.setEffectSetId(model.getId());
               action.getBlackboard().addBattleEffect(effectBuilder);
               target.getScene().addRecordValue(target.getForce(), 200003, 1L);
               BattleTestMgr.analyseBuffEffect((byte)1, source.getId(), model.getId(), 0L);
               if (model.getRateType() == 3 && targets != null && targets.size() > 0 && target == targets.get(0)) {
                  int tempRate = func.getRate(action, source, target, model);
                  if (RandomUtil.randTenThousand() < tempRate) {
                     action.getBlackboard().addSkillParam(3000 + target.getBattlePos(), true);
                  } else {
                     action.getBlackboard().addSkillParam(3000 + target.getBattlePos(), false);
                  }
               }

               return true;
            } else {
               int rate = func.getRate(action, source, target, model);
               if (model.getRateType() == 3 && targets != null && targets.size() > 0) {
                  Entity firstTarget = (Entity)targets.get(0);
                  Boolean firstTargetRate = (Boolean)action.getBlackboard().getSkillParam(3000 + firstTarget.getBattlePos());
                  if (firstTargetRate != null) {
                     rate = firstTargetRate ? 10000 : -1;
                  }
               }

               boolean isUse = false;
               if (RandomUtil.randTenThousand() < rate) {
                  TreeSet<Integer> subBuffSet = target.getBuffManager().getSubBuff((short)61);
                  if (subBuffSet != null && subBuffSet.size() > 0 && BattleMisc.isHurtFun(model.getFunc())) {
                     int buffCode = (Integer)subBuffSet.iterator().next();
                     Buff buff = target.getBuffManager().getBuff(buffCode);
                     target.getBuffManager().deleteBuffByCode(action, buffCode, false);
                     BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                     effectBuilder.setEffectType(13);
                     effectBuilder.setTargetBattlePos(target.getBattlePos());
                     action.getBlackboard().addBattleEffect(effectBuilder);
                     isUse = false;
                  } else {
                     long curTime = System.currentTimeMillis();
                     isUse = func.process(action, source, target, targets, model, event);
                     long escape = System.currentTimeMillis() - curTime;
                     if (escape > 10L && Debug.isDebug) {
                        logger.info("单个效果函数超过:秒:{},effect:{},func:{}", new Object[]{escape, model.getId(), model.getFunc()});
                     }
                  }

                  if (model.getRateType() == 2) {
                     action.getBlackboard().plusSkillIntParam(1000 + source.getBattlePos(), 1);
                  }

                  if (targets != null && targets.size() > 0 && target == targets.get(0) && model.getFunc() != 3) {
                     action.getBlackboard().addSkillParam(3000 + target.getBattlePos(), true);
                  }
               } else if (targets != null && targets.size() > 0 && target == targets.get(0) && model.getFunc() != 3) {
                  action.getBlackboard().addSkillParam(3000 + target.getBattlePos(), false);
               }

               return isUse;
            }
         }
      }
   }

   public static int getRate(Action action, Entity source, Entity target, SkillEffectModel skillEffectModel) {
      int rate = skillEffectModel.getRate();
      if (rate == 0) {
         rate = 10000;
      }

      switch (skillEffectModel.getRateType()) {
         case 1:
            rate += target.getPkTeam().getAliveNum() * skillEffectModel.getRateParam();
            break;
         case 2:
            int times = (Integer)action.getBlackboard().getSkillParam(1000 + source.getBattlePos(), 0);
            if (times != 0) {
               rate = (int)((double)rate * Math.pow((double)((float)skillEffectModel.getRateParam() / 10000.0F), (double)times));
            }
      }

      Map<Integer, Map<Byte, KeyValFun>> map = (Map)action.getBlackboard().getSkillParam(12, new HashMap());
      if (map.containsKey(skillEffectModel.getId())) {
         Map<Byte, KeyValFun> valFunMap = (Map)map.get(skillEffectModel.getId());
         KeyValFun fun = (KeyValFun)valFunMap.get(target.getBattlePos());
         if (Objects.isNull(fun)) {
            return rate;
         }

         if (fun.getKey() == 0) {
            rate += rate * fun.getVal() / 10000;
         } else {
            rate += fun.getVal();
         }
      }

      Map<Integer, KeyValFun> exRateMap = (Map)action.getBlackboard().getSkillParam(39, new HashMap());
      if (exRateMap.containsKey(skillEffectModel.getId())) {
         KeyValFun fun = (KeyValFun)exRateMap.get(skillEffectModel.getId());
         if (Objects.isNull(fun)) {
            return rate;
         }

         if (fun.getKey() == 0) {
            rate += rate * fun.getVal() / 10000;
         } else {
            rate += fun.getVal();
         }
      }

      return rate;
   }
}
