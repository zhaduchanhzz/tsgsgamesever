package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import org.apache.commons.collections4.MapUtils;

@EffectAnno(
   effect = 77
)
public class ComDelDebufRecoverHpFunc extends RecoverHpFunc {
   public static final String CONTROL_TYPE = "controlType";
   public static final String NUM = "num";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      if (target.isDead()) {
         return false;
      } else {
         super.process(action, source, target, targets, model, event);
         HashMap<Byte, HashMap<Integer, TreeMap<Integer, Buff>>> priorityBuffsMap = target.getBuffManager().getPriorityBuffsMap();
         if (priorityBuffsMap == null) {
            return false;
         } else {
            int controlType = model.getParam("controlType");
            int delNum = model.getParam("num");
            HashMap<Integer, TreeMap<Integer, Buff>> typeBuffsMap = (HashMap)priorityBuffsMap.get((byte)2);
            if (!MapUtils.isEmpty(typeBuffsMap) && delNum != 0) {
               ArrayList<Integer> noCtrlList = new ArrayList();
               ArrayList<Integer> ctrlList = new ArrayList();

               for(Map.Entry<Integer, TreeMap<Integer, Buff>> entry : typeBuffsMap.entrySet()) {
                  if (((TreeMap)entry.getValue()).size() != 0) {
                     BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPool().getEntity("buff", entry.getKey());
                     if (buffModel != null) {
                        BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
                        if (!Objects.isNull(buffUseFun)) {
                           if (buffUseFun.getUseFunc() == 3 && BattleMisc.isControlBuf((byte)buffUseFun.getUseId())) {
                              ctrlList.add(entry.getKey());
                           } else {
                              noCtrlList.add(entry.getKey());
                           }
                        }
                     }
                  }
               }

               ArrayList<Integer> list = new ArrayList();
               if (controlType == 1) {
                  list.addAll(noCtrlList);
               } else if (controlType == 2) {
                  list.addAll(ctrlList);
               }

               if (delNum == -1 || delNum > list.size()) {
                  delNum = list.size();
               }

               for(int i = 0; i < delNum; ++i) {
                  target.getBuffManager().deleteBuffById(action, (Integer)list.get(i));
               }

               return true;
            } else {
               return false;
            }
         }
      }
   }
}
