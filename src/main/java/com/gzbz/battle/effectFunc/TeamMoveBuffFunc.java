package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.buff.BuffFactory;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.passive.PassiveSkillEffect;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@EffectAnno(
   effect = 58
)
public class TeamMoveBuffFunc extends EffectFunc {
   public static final String SELECT_TYPE = "selectType";
   public static final String SELECT_NUM = "selectNum";
   public static final String BUFF_NUM = "buffNum";
   public static final String ROUND = "round";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      int round = ((Integer)model.getFuncParam().get("round")).byteValue();
      byte buffType = ((Integer)model.getFuncParam().get("buffType")).byteValue();
      short selectType = ((Integer)model.getFuncParam().get("selectType")).shortValue();
      int selectNum = (Integer)model.getFuncParam().get("selectNum");
      int buffNum = 0;
      if (model.getFuncParam().containsKey("buffNum")) {
         buffNum = (Integer)model.getFuncParam().get("buffNum");
      }

      List<HashMap<Integer, TreeMap<Integer, Buff>>> debuffList = new ArrayList();
      List<HashMap<Integer, TreeMap<Integer, Buff>>> controlList = new ArrayList();

      for(Entity entity : source.getPkTeam().getEntityMap().values()) {
         if (!entity.isDead()) {
            HashMap<Integer, TreeMap<Integer, Buff>> idMap = (HashMap)entity.getBuffManager().getPriorityBuffsMap().get(buffType);
            if (idMap != null && idMap.size() != 0) {
               HashMap<Integer, TreeMap<Integer, Buff>> controlMap = new HashMap();
               HashMap<Integer, TreeMap<Integer, Buff>> debufMap = new HashMap();

               for(Map.Entry<Integer, TreeMap<Integer, Buff>> idEntry : idMap.entrySet()) {
                  int id = (Integer)idEntry.getKey();
                  BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", id);
                  if (buffModel != null && buffModel.getNoDispel() <= 0) {
                     BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
                     if (buffUseFun != null) {
                        if (buffUseFun.getUseFunc() == 3 && BattleMisc.isControlBuf((byte)buffUseFun.getUseId())) {
                           controlMap.put(id, idEntry.getValue());
                        } else {
                           debufMap.put(id, idEntry.getValue());
                        }
                     }
                  }
               }

               if (controlMap.size() > 0) {
                  controlList.add(controlMap);
               }

               if (debufMap.size() > 0) {
                  debuffList.add(debufMap);
               }
            }
         }
      }

      ArrayList<Buff> delList = new ArrayList();
      List<Entity> selectTargetList = source.getScene().selectTarget(action, source, (byte)2, selectType, selectNum, (String)null);
      if (selectTargetList != null && selectTargetList.size() != 0) {
         if (controlList.size() > 0) {
            Collections.shuffle(controlList);

            for(HashMap<Integer, TreeMap<Integer, Buff>> e : controlList) {
               this.moveBuff(action, event, buffNum, delList, selectTargetList, e);
               if (buffNum > 0 && delList.size() >= buffNum) {
                  break;
               }
            }

            if (delList.size() > 0) {
               this.controlCoolDown(source, model, event, round);
            }
         }

         if (buffNum > 0 && delList.size() < buffNum && debuffList.size() > 0) {
            Collections.shuffle(debuffList);

            for(HashMap<Integer, TreeMap<Integer, Buff>> e : debuffList) {
               this.moveBuff(action, event, buffNum, delList, selectTargetList, e);
               if (buffNum > 0 && delList.size() >= buffNum) {
                  break;
               }
            }
         }

         for(Buff delBuff : delList) {
            delBuff.source.getBuffManager().deleteBuffByCode(action, delBuff.code, false);
         }

         return true;
      } else {
         return true;
      }
   }

   private void moveBuff(Action action, Event event, int buffNum, ArrayList<Buff> delList, List<Entity> selectTargetList, HashMap<Integer, TreeMap<Integer, Buff>> idMap) {
      for(Map.Entry<Integer, TreeMap<Integer, Buff>> idEntry : idMap.entrySet()) {
         int id = (Integer)idEntry.getKey();
         BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", id);
         TreeMap<Integer, Buff> codeMap = (TreeMap)idEntry.getValue();

         for(Buff oldBuff : codeMap.values()) {
            if (!oldBuff.move) {
               if (buffNum > 0 && delList.size() >= buffNum) {
                  break;
               }

               for(Entity selectEntity : selectTargetList) {
                  Buff buff = BuffFactory.getBuff(buffModel, selectEntity, selectEntity, selectEntity.getBuffManager());
                  if (buff != null) {
                     buff.round = oldBuff.round;
                     buff.count = oldBuff.count;
                     buff.curUseTime = oldBuff.curUseTime;
                     buff.move = true;
                     long value = oldBuff.getValue(1);
                     if (value != 0L) {
                        buff.setValue(1, value);
                     }

                     value = oldBuff.getValue(2);
                     if (value != 0L) {
                        buff.setValue(2, oldBuff.getValue(2));
                     }

                     selectEntity.getBuffManager().addBuff(action, buff, buffModel, event);
                  }
               }

               delList.add(oldBuff);
            }
         }

         if (buffNum > 0 && delList.size() >= buffNum) {
            break;
         }
      }

   }

   private void controlCoolDown(Entity source, SkillEffectModel model, Event event, int round) {
      for(Object obj : (HashSet)event.getAction().getBlackboard().getSkillParam(25)) {
         if (obj instanceof PassiveSkillEffect) {
            PassiveSkillEffect effect = (PassiveSkillEffect)obj;
            if (effect.entity == source && effect.effectId == model.getId()) {
               effect.coolDown = round + 1;
               return;
            }
         }
      }

   }
}
