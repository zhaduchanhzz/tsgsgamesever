package com.gzbz.battle.effectFunc;

import battle.EffectAnno;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.buff.BuffFactory;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.listener.Event;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import misc.RandomUtil;

@EffectAnno(
   effect = 23
)
public class InfectionBuff extends EffectFunc {
   public static final String BUFF_TYPE = "buffType";

   public boolean process(Action action, Entity source, Entity target, List<Entity> targets, SkillEffectModel model, Event event) {
      HashMap<Byte, Entity> entityMap = target.getPkTeam().getEntityMap();
      ArrayList<InfectionEntity> sourceInfection = new ArrayList();

      for(Entity entity : entityMap.values()) {
         if (!entity.isDead() && target != entity) {
            for(int subType : model.getFuncParam().values()) {
               Set<Integer> subBuffSet = entity.getBuffManager().getSubBuff((short)subType);
               if (Objects.nonNull(subBuffSet) && subBuffSet.size() != 0) {
                  InfectionEntity infectionEntity = new InfectionEntity();
                  infectionEntity.entity = entity;
                  infectionEntity.infection.addAll(subBuffSet);
                  sourceInfection.add(infectionEntity);
               }
            }
         }
      }

      if (sourceInfection.size() == 0) {
         return false;
      } else {
         int entityRank = RandomUtil.randInt(0, sourceInfection.size());
         InfectionEntity infectionEntity = (InfectionEntity)sourceInfection.get(entityRank);
         int buffRank = RandomUtil.randInt(0, infectionEntity.infection.size());
         int buffCode = (Integer)infectionEntity.infection.get(buffRank);
         Buff infectionBuff = infectionEntity.entity.getBuffManager().getBuff(buffCode);
         BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", infectionBuff.id);
         Buff newBuff = BuffFactory.getBuff(buffModel, target, infectionBuff.caster, target.getBuffManager());
         if (newBuff == null) {
            return false;
         } else {
            for(int index = 1; index <= 2; ++index) {
               newBuff.setValue(index, infectionBuff.getValue(index));
            }

            target.getBuffManager().addBuff(action, newBuff, buffModel, event);
            return true;
         }
      }
   }
}
