package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.conditionProperty.ConditionProperty;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import misc.RandomUtil;
import org.springframework.util.CollectionUtils;

@EffectAnno(
   effect = 78
)
public class DelBuffAndAddBuffFunc extends EffectFunc {
   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (source.isDead()) {
         return false;
      } else {
         ArrayList<Integer> deBuff = new ArrayList();
         int singleRate = 1000;

         for(Map.Entry<String, Integer> entry : model.getFuncParam().entrySet()) {
            String key = (String)entry.getKey();
            Integer value = (Integer)entry.getValue();
            if (key.contains("buffId")) {
               deBuff.add(value);
            }

            if (key.contains("singleRate")) {
               singleRate = value;
            }
         }

         int totalDelete = 0;

         for(Entity entity : source.getPkTeam().getEntityMap().values()) {
            if (!entity.isDead() && RandomUtil.randTenThousand() <= singleRate) {
               int delNum = this.deleteAllDeBuff(action, entity, model);
               this.addBuffToSelf(action, event, source, entity, delNum);
               totalDelete += delNum;
            }
         }

         if (CollectionUtils.isEmpty(deBuff)) {
            return false;
         } else {
            byte oppositionForce = BattleMisc.oppositionForce(source.getForce());
            HashMap<Byte, Entity> enemyMap = source.getScene().getPKTeam(oppositionForce).getEntityMap();
            if (CollectionUtils.isEmpty(enemyMap)) {
               return false;
            } else {
               int index = 0;
               List<Entity> list = (List)enemyMap.entrySet().stream().filter((c) -> !((Entity)c.getValue()).isDead()).sorted(Entry.comparingByKey()).map(Map.Entry::getValue).collect(Collectors.toList());
               if (CollectionUtils.isEmpty(list)) {
                  return false;
               } else {
                  for(int i = 0; i < totalDelete; ++i) {
                     if (index >= list.size()) {
                        index = 0;
                     }

                     Entity entry = (Entity)list.get(index++);
                     if (entry != null) {
                        entry.getBuffManager().addBuff(action, deBuff, (Entity)source, event);
                     }
                  }

                  Event dispelEvent = new Event((short)43, action, event);
                  dispelEvent.addParam(2, source);
                  dispelEvent.addParam(3, target);
                  dispelEvent.addParam(32, totalDelete);
                  action.getScene().getEventListener().pushEvent(dispelEvent);
                  return true;
               }
            }
         }
      }
   }

   public int deleteAllDeBuff(Action action, Entity target, SkillEffectModel model) {
      int deleteCount = 0;
      List<Integer> dispels = target.getBuffManager().getDispel((byte)2);
      byte oppositionForce = BattleMisc.oppositionForce(target.getForce());

      for(int id : dispels) {
         BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", id);
         if (buffModel != null) {
            int rate = 0;

            for(Entity invalidEntity : target.getScene().getPKTeam(oppositionForce).getEntityMap().values()) {
               if (!invalidEntity.isDead() && (model.getIsForce() != 0 || !invalidEntity.getStateManager().checkState((short)17)) && invalidEntity.getConditionPropertyManager().cleanBuffInvalid.containsKey(Integer.valueOf(buffModel.getSubCls()))) {
                  for(ConditionProperty conditionProperty : invalidEntity.getConditionPropertyManager().cleanBuffInvalid.get(Integer.valueOf(buffModel.getSubCls()))) {
                     rate += conditionProperty.skillEffectModel.getParam("rate");
                  }
               }
            }

            TreeSet<Integer> buffCodeSet = target.getBuffManager().getSubBuff((short)56);
            if (null != buffCodeSet && buffCodeSet.size() > 0) {
               for(int buffCode : buffCodeSet) {
                  Buff invalidBuff = target.getBuffManager().getBuff(buffCode);
                  if (invalidBuff != null) {
                     BuffModel invalidDuffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", invalidBuff.id);
                     if (invalidDuffModel != null) {
                        BuffUseFun buffUseFun = (BuffUseFun)invalidDuffModel.getFuncs().get(1);
                        if (buffUseFun != null && buffUseFun.getUseId() == buffModel.getSubCls()) {
                           rate += buffUseFun.getUseValue();
                        }
                     }
                  }
               }
            }

            if (rate == 0) {
               HashMap<Integer, TreeMap<Integer, Buff>> idMaps = (HashMap)target.getBuffManager().getPriorityBuffsMap().get(buffModel.getType());
               if (!CollectionUtils.isEmpty(idMaps)) {
                  TreeMap<Integer, Buff> codeMap = (TreeMap)idMaps.get(id);
                  if (!CollectionUtils.isEmpty(codeMap)) {
                     int thisBuffCount = codeMap.size();
                     target.getBuffManager().deleteBuffById(action, id);
                     TreeMap<Integer, Buff> map = (TreeMap)idMaps.get(id);
                     int remain = map == null ? 0 : map.size();
                     deleteCount += thisBuffCount - remain;
                  }
               }
            } else if (RandomUtil.randInt(10000) < rate) {
               BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
               effectBuilder.setEffectType(19);
               effectBuilder.setTargetBattlePos(target.getBattlePos());
               action.getBlackboard().addBattleEffect(effectBuilder);
            }
         }
      }

      BattleMsg.S2C_Battle_Effect.Builder effectBuilder = BattleMsg.S2C_Battle_Effect.newBuilder();
      effectBuilder.setEffectType(17);
      effectBuilder.setTargetBattlePos(target.getBattlePos());
      effectBuilder.setEffectId(model.getId());
      effectBuilder.setEffectValue(2L);
      action.getBlackboard().addBattleEffect(effectBuilder);
      return deleteCount;
   }

   private void addBuffToSelf(Action action, Event event, Entity source, Entity target, int num) {
      if (num != 0) {
         ArrayList<Integer> addBuffId = new ArrayList();

         for(ConditionProperty e : source.getConditionPropertyManager().getDelBuffAndBuff()) {
            SkillEffectModel exModel = e.skillEffectModel;
            if (!Objects.isNull(exModel)) {
               for(Map.Entry<String, Integer> entry : exModel.getFuncParam().entrySet()) {
                  String key = (String)entry.getKey();
                  Integer value = (Integer)entry.getValue();
                  if (key.contains("buffId")) {
                     addBuffId.add(value);
                  }
               }
            }
         }

         for(int i = 0; i < num; ++i) {
            for(Integer buffId : addBuffId) {
               target.getBuffManager().addBuff(action, buffId, source, event);
            }
         }

      }
   }
}
