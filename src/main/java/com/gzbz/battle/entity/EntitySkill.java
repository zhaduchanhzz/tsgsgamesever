package com.gzbz.battle.entity;

import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.SkillModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class EntitySkill implements Serializable {
   public int id;
   public int oldId;
   public int index;
   public List<Integer> funcTypes = new ArrayList();
   public Entity entity;
   private HashMap<Integer, EffectContent> replaceEffect = new HashMap();
   private ArrayList<EffectContent> attachEffect = new ArrayList();
   private boolean lockAttachEffect;
   private boolean forever;

   public void replaceEffect(int oldIndex, int skillId, int newEffect) {
      EffectContent content = new EffectContent();
      content.skillId = skillId;
      content.effectId = newEffect;
      this.replaceEffect.put(oldIndex, content);
   }

   public void attachEffect(int skillId, int effect) {
      EffectContent content = new EffectContent();
      content.skillId = skillId;
      content.effectId = effect;
      this.attachEffect.add(content);
   }

   public EffectContent getReplaceId(int oldIndex) {
      return (EffectContent)this.replaceEffect.get(oldIndex);
   }

   public ArrayList<EffectContent> getAttachEffect() {
      return this.lockAttachEffect ? new ArrayList() : this.attachEffect;
   }

   public void setOldAttachEffect() {
      this.lockAttachEffect = true;
   }

   public void restoreAttachEffect() {
      this.lockAttachEffect = false;
   }

   public boolean isForever() {
      return this.forever;
   }

   public void setForever(boolean forever) {
      this.forever = forever;
   }

   public int getSkillId() {
      boolean isForce = false;
      SkillModel skillModel = (SkillModel)ApplicationContextProvider.getModelPool().getEntity("skill", this.id);

      for(Map.Entry<Integer, Integer> entry : skillModel.getEffects().entrySet()) {
         int effectId = (Integer)entry.getValue();
         SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPool().getEntity("skillEffect", effectId);
         if (skillEffectModel != null && skillEffectModel.getIsForce() == 1) {
            isForce = true;
            break;
         }
      }

      return this.entity.getStateManager().checkState((short)17) && !isForce ? this.oldId : this.id;
   }

   public void update() {
      for(EffectContent content : this.replaceEffect.values()) {
         this.resetContent(content);
      }

      for(EffectContent content : this.attachEffect) {
         this.resetContent(content);
      }

   }

   private void resetContent(EffectContent content) {
      SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", content.effectId);
      if (!Objects.isNull(skillEffectModel)) {
         if (skillEffectModel.getTriggerTimeType() == SkillEffectModel.TRIGGER_TYPE_ROUND) {
            content.useTimes = 0;
         }

      }
   }
}
