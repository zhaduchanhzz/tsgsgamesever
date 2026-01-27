package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import misc.RandomUtil;

@EffectAnno(
   effect = 3
)
public class AddBuffFunc extends EffectFunc {
   public static final String BUFF_RATE = "buffRate";
   public static final String BUFF_REDUCE_RATE = "buffReduceRate";
   public static final String[] BUFF_ID = new String[]{"buffId1", "buffId2", "buffId3"};
   public static final String EX_BUFF_ID = "exBuffId";

   public int getRate(Action action, Entity source, Entity target, SkillEffectModel skillEffectModel) {
      return 10000;
   }

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      boolean bUse = false;
      boolean addSuc = false;
      int index = (Integer)action.getBlackboard().getSkillParam(20, 0);
      if (model.getRate() == 0) {
         boolean var10000 = true;
      } else {
         model.getRate();
      }

      int rate = EffectFuncProcessor.getRate(action, source, target, model);
      if (model.getRateType() == 3 && targets != null && targets.size() > 0) {
         Entity firstTarget = (Entity)targets.get(0);
         Boolean firstTargetRate = (Boolean)action.getBlackboard().getSkillParam(3000 + firstTarget.getBattlePos());
         if (firstTargetRate != null) {
            rate = firstTargetRate ? 10000 : -1;
         }
      }

      if (model.getFuncParam().containsKey("buffRate" + (index + 1))) {
         rate = (Integer)model.getFuncParam().get("buffRate" + (index + 1));
      }

      for(String str : BUFF_ID) {
         Integer buffId = (Integer)model.getFuncParam().get(str);
         if (buffId != null) {
            BuffModel addBuffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buffId);
            if (!Objects.isNull(addBuffModel)) {
               Set<Integer> buffCode = target.getBuffManager().getSubBuff((short)9);
               if (Objects.nonNull(buffCode)) {
                  for(int code : buffCode) {
                     Buff buff = target.getBuffManager().getBuff(code);
                     if (buff != null) {
                        BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buff.id);
                        BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
                        if (buffUseFun != null && buffUseFun.getUseId() == addBuffModel.getSubCls()) {
                           if (buffUseFun.getCalcFun() == 1) {
                              rate = (int)((float)rate - (float)((long)rate * buff.getValue(1)) / 10000.0F);
                           } else {
                              rate = (int)((long)rate - buff.getValue(1));
                           }
                           break;
                        }
                     }
                  }
               }

               for(Entity teammate : source.getPkTeam().getEntityMap().values()) {
                  rate += teammate.getConditionPropertyManager().getAllEffectBuffCondition(addBuffModel.getSubCls());
               }

               rate += source.getConditionPropertyManager().getEffectBuffCondition(addBuffModel.getSubCls());
               if (model.getControl() != 0) {
                  long controlRate = 0L;
                  switch (model.getControl()) {
                     case 1:
                        controlRate = source.getBattleProperty(action, 16) - target.getBattleProperty(action, 17) + (long)rate;
                        controlRate = controlRate < 0L ? 0L : controlRate;
                        if (action.getBlackboard().getSkillParam(29) == source) {
                           controlRate = (long)((float)controlRate * ((float)(Integer)action.getBlackboard().getSkillParam(14, 10000) / 10000.0F));
                        }
                        break;
                     case 2:
                        controlRate = (long)rate;
                        if (action.getBlackboard().getSkillParam(29) == source) {
                           controlRate = (long)((float)controlRate * ((float)(Integer)action.getBlackboard().getSkillParam(14, 10000) / 10000.0F));
                        }
                  }

                  int round = action.getScene().getRound() - ApplicationContextProvider.getConfigInt("DecrementRound", 8);
                  int exRate = 0;
                  if (round >= 0) {
                     int ControlDecrementRoundRate = ApplicationContextProvider.getConfigInt("ControlDecrementRoundRate", 500);
                     exRate = (round + 1) * ControlDecrementRoundRate;
                  }

                  int rateTmp = (int)((float)(controlRate * (long)(10000 - exRate)) / 10000.0F);
                  int reduceRate = model.getParam("buffReduceRate");
                  BuffUseFun fun = (BuffUseFun)addBuffModel.getFuncs().get(1);
                  int targetIndex = 0;
                  if (fun != null) {
                     targetIndex = (Integer)action.getBlackboard().getSkillParam(100000 + source.getBattlePos() * 1000 + fun.getUseId(), 0);
                  }

                  if (reduceRate != 0 && targetIndex != 0) {
                     rateTmp = (int)((double)rateTmp * Math.pow((double)((float)reduceRate / 10000.0F), (double)targetIndex));
                  }

                  if (RandomUtil.randTenThousand() < rateTmp) {
                     Set<Integer> typeBuff = target.getBuffManager().getSubBuff((short)42);
                     if (typeBuff != null && typeBuff.size() > 0) {
                        int code = (Integer)typeBuff.iterator().next();
                        target.getBuffManager().deleteBuffByCode(action, code, false);
                        BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
                        effectBuilder.setTargetBattlePos(target.getBattlePos());
                        effectBuilder.setEffectId(model.getId());
                        effectBuilder.setEffectType(11);
                        effectBuilder.setEffectValue(1L);
                        action.getBlackboard().addBattleEffect(effectBuilder);
                        bUse = true;
                     } else {
                        target.getBuffManager().addBuff(action, buffId, source, event);
                        bUse = true;
                        addSuc = true;
                     }
                  }
               } else if (RandomUtil.randTenThousand() < rate) {
                  target.getBuffManager().addBuff(action, buffId, source, event);
                  bUse = true;
                  addSuc = true;
               }
            }
         }
      }

      if (model.getFuncParam().containsKey("exBuffId") && addSuc) {
         Integer exBuffId = (Integer)model.getFuncParam().get("exBuffId");
         if (exBuffId != null) {
            BuffModel exBuffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", exBuffId);
            if (Objects.nonNull(exBuffModel)) {
               target.getBuffManager().addBuff(action, exBuffId, source, event);
            }
         }
      }

      if (targets != null && targets.size() > 0 && target == targets.get(0)) {
         if (bUse) {
            action.getBlackboard().addSkillParam(3000 + target.getBattlePos(), true);
         } else {
            action.getBlackboard().addSkillParam(3000 + target.getBattlePos(), false);
         }
      }

      return bUse;
   }
}
