package com.gzbz.battle.passive;

import com.gzbz.battle.entity.Entity;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.spring.ApplicationContextProvider;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PassiveSkillMgr implements Serializable {
   static Logger logger = LoggerFactory.getLogger(PassiveSkillMgr.class);
   private int newCode;
   private Entity entity;
   private HashMap<Integer, PassiveSkillEffect> passiveSkillMap = new HashMap();

   public int getNewCode() {
      return ++this.newCode;
   }

   public void init(Entity entity) {
      this.entity = entity;
   }

   public HashMap<Integer, PassiveSkillEffect> getPassiveSkillMap() {
      return this.passiveSkillMap;
   }

   public int addPassiveEffect(byte type, SkillEffectModel model) {
      if (type == 7 && this.entity.getPkTeam().getOnlyPassive().contains(model.getId())) {
         return -1;
      } else if (model.getNeedDressId() > 0 && !this.entity.getActiveDressIds().contains(model.getNeedDressId())) {
         return -1;
      } else {
         PassiveSkillEffect effect;
         if (model.getFunc() == 102) {
            effect = new PassiveActionEffect();
         } else {
            effect = new PassiveSkillEffect();
         }

         if (Objects.isNull(effect)) {
            return -1;
         } else {
            effect.code = this.getNewCode();
            effect.effectId = model.getId();
            effect.entity = this.entity;
            this.passiveSkillMap.put(effect.code, effect);
            if (type == 7) {
               this.entity.getPkTeam().getOnlyPassive().add(model.getId());
            }

            for(KeyValFun keyValFun : model.eventType.values()) {
               this.entity.getScene().getEventListener().addListener(this.entity, effect, (short)keyValFun.getKey(), keyValFun.getVal(), keyValFun.getExParams(), model.getCheckDead(), model.sub, model.eventRate, model.getIsForce());
            }

            return -1;
         }
      }
   }

   public void update() {
      LinkedList<PassiveSkillEffect> linkedList = new LinkedList();

      for(PassiveSkillEffect effect : this.passiveSkillMap.values()) {
         effect.update();
         SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPool().getEntity("skillEffect", effect.effectId);
         if (skillEffectModel.getTriggerTimeType() == SkillEffectModel.TRIGGER_TYPE_ROUND) {
            effect.triggerTime = 0;
         }

         if (skillEffectModel.getTriggerTime() != 0 && effect.triggerTime >= skillEffectModel.getTriggerTime()) {
            linkedList.add(effect);
         }
      }

      for(PassiveSkillEffect effect : linkedList) {
         this.passiveSkillMap.remove(effect.code);
         this.entity.getScene().getEventListener().removeListener(effect);
      }

   }

   public void friendEntityUpdate() {
      LinkedList<PassiveSkillEffect> linkedList = new LinkedList();

      for(PassiveSkillEffect effect : this.passiveSkillMap.values()) {
         SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPool().getEntity("skillEffect", effect.effectId);
         if (skillEffectModel.onTriggerScene == 3) {
            effect.update();
            if (skillEffectModel.getTriggerTimeType() == SkillEffectModel.TRIGGER_TYPE_ROUND) {
               effect.triggerTime = 0;
            }

            if (skillEffectModel.getTriggerTime() != 0 && effect.triggerTime >= skillEffectModel.getTriggerTime()) {
               linkedList.add(effect);
            }
         }
      }

      for(PassiveSkillEffect effect : linkedList) {
         this.passiveSkillMap.remove(effect.code);
         this.entity.getScene().getEventListener().removeListener(effect);
      }

   }
}
