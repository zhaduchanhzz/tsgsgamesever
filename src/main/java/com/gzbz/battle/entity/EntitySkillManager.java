package com.gzbz.battle.entity;

import com.gzbz.battle.buff.Buff;
import com.gzbz.model.BuffModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.SkillModel;
import com.gzbz.model.fun.BuffUseFun;
import com.gzbz.spring.ApplicationContextProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import misc.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EntitySkillManager implements Serializable {
   Logger logger = LoggerFactory.getLogger(EntitySkillManager.class);
   private Entity entity;
   private final List<EffectContent> attachEffect = new ArrayList();
   private final HashMap<Integer, EntitySkill> skillMap = new HashMap();
   private final TreeMap<Integer, EntitySkill> indexSkillMap = new TreeMap();
   private EntitySkill commonSkill;
   private List<Integer> eventTypeEffect = new ArrayList();

   public void init(Entity entity) {
      this.entity = entity;
   }

   public EntitySkill getIndexSkill(int slot) {
      return (EntitySkill)this.indexSkillMap.get(slot);
   }

   public EntitySkill getDragonSkill() {
      EntitySkill selectSkill = null;

      for(Map.Entry<Integer, EntitySkill> skillEntry : this.indexSkillMap.entrySet()) {
         EntitySkill skill = (EntitySkill)skillEntry.getValue();
         SkillModel skillModel = (SkillModel)ApplicationContextProvider.getModelPoolEntity("skill", skill.getSkillId());
         if ((this.entity.getScene().getCurTotalRound() - (Integer)skillEntry.getKey()) % skillModel.getCoolDown() == 0) {
            selectSkill = skill;
            break;
         }
      }

      if (Objects.isNull(selectSkill)) {
         return null;
      } else {
         SkillModel skillModel = (SkillModel)ApplicationContextProvider.getModelPoolEntity("skill", selectSkill.getSkillId());
         if (skillModel.getReplaceSkillId() != 0 && RandomUtil.randTenThousand() < skillModel.getReplaceSkillRate()) {
            selectSkill.id = skillModel.getReplaceSkillId();
         }

         return selectSkill;
      }
   }

   public EntitySkill getSkill() {
      return this.getSkill(false);
   }

   public EntitySkill getSkill(boolean force) {
      if (this.entity.isDead()) {
         return null;
      } else {
         EntitySkill useSkill = this.commonSkill;

         for(EntitySkill skill : this.indexSkillMap.values()) {
            if (this.commonSkill != skill) {
               SkillModel skillModel = (SkillModel)ApplicationContextProvider.getModelPoolEntity("skill", skill.getSkillId());
               if ((skillModel.getStartRound() != 0 || skillModel.getCoolDown() != 0) && (this.entity.getScene().getCurTotalRound() - skillModel.getStartRound()) % skillModel.getCoolDown() == 0) {
                  useSkill = skill;
               }
            }
         }

         SkillModel skillModel = (SkillModel)ApplicationContextProvider.getModelPoolEntity("skill", useSkill.getSkillId());
         if (skillModel.getReplaceSkillId() != 0) {
            TreeSet<Integer> buffManager = this.entity.getBuffManager().getSubBuff((short)65);
            int rate = 0;
            if (buffManager != null && buffManager.size() > 0) {
               for(int code : buffManager) {
                  Buff buff = this.entity.getBuffManager().getBuff(code);
                  BuffModel buffModel = (BuffModel)ApplicationContextProvider.getModelPoolEntity("buff", buff.id);
                  BuffUseFun buffUseFun = (BuffUseFun)buffModel.getFuncs().get(1);
                  if (buffUseFun.getUseId() == useSkill.index) {
                     rate += buffUseFun.getUseValue();
                  }
               }
            }

            if (skillModel.getReplaceSkillId() == useSkill.oldId) {
               rate = -rate;
            }

            if (RandomUtil.randTenThousand() < skillModel.getReplaceSkillRate() + rate) {
               useSkill.id = skillModel.getReplaceSkillId();
            }
         }

         if (skillModel.getForce() == 0 && !force) {
            if (this.entity.getStateManager().checkState((short)1) || this.entity.getStateManager().checkState((short)11) || this.entity.getStateManager().checkState((short)18) || this.entity.getStateManager().checkState((short)21)) {
               return null;
            }

            if (this.entity.getStateManager().checkState((short)2) || this.entity.getStateManager().checkState((short)12) || this.entity.getStateManager().checkState((short)16)) {
               useSkill = this.commonSkill;
               if (useSkill.id != useSkill.oldId && !useSkill.isForever()) {
                  useSkill.id = useSkill.oldId;
               }
            }
         }

         if (this.entity.getStateManager().checkState((short)4)) {
            SkillModel skillModel1 = (SkillModel)ApplicationContextProvider.getModelPoolEntity("buff", useSkill.getSkillId());
            Integer mainEffectId = (Integer)skillModel.getEffects().get(skillModel.getMainEffect());
            if (mainEffectId == null) {
               return null;
            }

            SkillEffectModel mainSkillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", mainEffectId);
            if (mainSkillEffectModel == null) {
               return null;
            }

            if (mainSkillEffectModel.getTargetType() == 2) {
               return null;
            }
         }

         return useSkill;
      }
   }

   public void update() {
      for(EntitySkill entitySkill : this.skillMap.values()) {
         entitySkill.update();
      }

      for(EntitySkill entitySkill : this.indexSkillMap.values()) {
         entitySkill.update();
      }

   }

   public void addSkill(int index, int id) {
      this.addSkill(index, id, (HashMap)null, false);
   }

   private int getReplaceEffect(HashMap<Integer, HashMap<Integer, Integer>> replaceEffect, int skillIndex, int slot, int defaultEffect) {
      if (replaceEffect == null) {
         return defaultEffect;
      } else if (!replaceEffect.containsKey(skillIndex)) {
         return defaultEffect;
      } else {
         return !((HashMap)replaceEffect.get(skillIndex)).containsKey(slot) ? defaultEffect : (Integer)((HashMap)replaceEffect.get(skillIndex)).get(slot);
      }
   }

   public void addSkill(int index, int id, HashMap<Integer, HashMap<Integer, Integer>> replaceEffect, Boolean fieldSkillAssert) {
      SkillModel skillModel = (SkillModel)ApplicationContextProvider.getModelPool().getEntity("skill", id);
      if (Objects.isNull(skillModel)) {
         if (id > 0) {
            this.logger.error("生成技能数据时无法找到技能id:" + id);
         }

      } else {
         if (skillModel.getType() == 2) {
            EntitySkill skill = new EntitySkill();
            skill.id = id;
            skill.oldId = id;
            skill.index = index;
            skill.entity = this.entity;
            skill.funcTypes.addAll(skillModel.getFuncType());
            this.skillMap.put(id, skill);
            if (1 == index) {
               this.commonSkill = skill;
            }

            this.indexSkillMap.put(index, skill);

            for(Map.Entry<Integer, Integer> effectEntry : skillModel.getEffects().entrySet()) {
               int slot = (Integer)effectEntry.getKey();
               int effectId = (Integer)effectEntry.getValue();
               effectId = this.getReplaceEffect(replaceEffect, index, slot, effectId);
               SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPool().getEntity("skillEffect", effectId);
               if (skillEffectModel == null) {
                  this.logger.info("没有这个技能效果{}", effectId);
               } else if (skillEffectModel.getIsPassive() == 1 || skillEffectModel.eventType.size() != 0) {
                  if (skillEffectModel.getFieldSkill() > 0) {
                     if (fieldSkillAssert) {
                        this.addPassiveEffect((byte)5, skillModel, skillEffectModel);
                     }
                  } else {
                     this.addPassiveEffect((byte)5, skillModel, skillEffectModel);
                  }
               }
            }
         } else {
            for(Map.Entry<Integer, Integer> skillEffect : skillModel.getEffects().entrySet()) {
               int slot = (Integer)skillEffect.getKey();
               int effectId = (Integer)skillEffect.getValue();
               effectId = this.getReplaceEffect(replaceEffect, index, slot, effectId);
               SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPool().getEntity("skillEffect", effectId);
               if (Objects.isNull(skillEffectModel)) {
                  this.logger.info("没有找到技能效果:" + effectId);
               } else if (skillEffectModel.getIsPassive() == 1) {
                  if (skillEffectModel.getFieldSkill() > 0) {
                     if (fieldSkillAssert) {
                        this.addPassiveEffect((byte)5, skillModel, skillEffectModel);
                     }
                  } else {
                     this.addPassiveEffect((byte)5, skillModel, skillEffectModel);
                  }
               }
            }
         }

      }
   }

   private boolean _doConditionProperty(SkillModel skillModel, SkillEffectModel effectModel) {
      switch (effectModel.getFunc()) {
         case 101:
         case 103:
         case 104:
         case 105:
         case 106:
         case 107:
         case 108:
         case 110:
         case 112:
         case 113:
         case 114:
         case 115:
         case 116:
         case 117:
         case 118:
         case 119:
         case 120:
         case 121:
         case 122:
         case 123:
         case 124:
         case 125:
         case 126:
         case 127:
         case 128:
         case 129:
         case 130:
         case 131:
         case 132:
         case 133:
         case 134:
         case 135:
         case 136:
         case 137:
         case 138:
         case 139:
         case 140:
         case 141:
         case 142:
         case 143:
         case 144:
            this.entity.getConditionPropertyManager().addConditionProperty(skillModel, effectModel);
            return true;
         case 102:
         case 109:
         case 111:
         default:
            return false;
      }
   }

   public boolean addPassiveEffect(byte type, SkillModel skillModel, SkillEffectModel effectModel) {
      if (this._doConditionProperty(skillModel, effectModel)) {
         return true;
      } else {
         if (effectModel.getFunc() == 13) {
            Integer pos = (Integer)effectModel.getFuncParam().get("pos");
            Integer skillId = (Integer)effectModel.getFuncParam().get("skillId");
            EntitySkill entitySkill = (EntitySkill)this.indexSkillMap.get(pos);
            if (entitySkill == null) {
               this.logger.error("更换插槽技能出错！！！！，技能尚未初始化或对应插槽技能不存在！ pos:{}  需要替换的skillId:{}  modelId:{}", new Object[]{pos, skillId, effectModel.getId()});
               return false;
            }

            entitySkill.id = skillId;
            entitySkill.setForever(true);
         } else if (effectModel.eventType.size() != 0) {
            this.entity.getPassiveSkillMgr().addPassiveEffect(type, effectModel);
            if ((type == 5 || type == 4 || type == 13) && skillModel != null && effectModel.eventType.size() != 0) {
               this.eventTypeEffect.add(effectModel.getId());
            }
         } else if (effectModel.getParentSkillSlot() != 0) {
            EntitySkill attachSkill = (EntitySkill)this.indexSkillMap.get(effectModel.getParentSkillSlot());
            if (attachSkill == null) {
               return false;
            }

            if (effectModel.getParentEffectIndex() != 0) {
               attachSkill.replaceEffect(effectModel.getParentEffectIndex(), skillModel.getId(), effectModel.getId());
            } else {
               attachSkill.attachEffect(attachSkill.id, effectModel.getId());
            }
         } else {
            EffectContent content = new EffectContent();
            if (Objects.nonNull(skillModel)) {
               content.skillId = skillModel.getId();
            }

            content.effectId = effectModel.getId();
            if (Objects.nonNull(skillModel) && skillModel.getType() == 2) {
               content.skillModel = skillModel;
            }

            this.attachEffect.add(content);
         }

         return true;
      }
   }

   public EntitySkill getCommonSkill() {
      return this.commonSkill;
   }

   public List<EffectContent> getAttachEffect() {
      return this.attachEffect;
   }

   public List<Integer> getEventTypeEffect() {
      return this.eventTypeEffect;
   }
}
