package com.gzbz.battle.conditionProperty;

import com.google.common.base.Splitter;
import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.buff.Buff;
import com.gzbz.battle.condition.ConditionProcessor;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.model.HeroModel;
import com.gzbz.model.HeroRestraintModel;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.model.SkillModel;
import com.gzbz.model.fun.ConditionModel;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.BiFunction;
import misc.MapUtil;
import misc.RandomUtil;

public class ConditionPropertyManager implements Serializable {
   public Entity entity;
   public BattleScene scene;
   public int newCode;
   static BiFunction<HeroModel, ConditionModel, Boolean> HeroNation = (heroModel, conditionModel) -> heroModel.getNation() == conditionModel.getConditionValue();
   static BiFunction<HeroModel, ConditionModel, Boolean> HeroType = (heroModel, conditionModel) -> heroModel.getType() == conditionModel.getConditionValue();
   public HashMap<Integer, Map<Integer, ConditionProperty>> conditionProperties = new HashMap();
   public HashMap<Integer, ConditionProperty> appProperties = new HashMap();
   public HashMap<Integer, ArrayList<ConditionProperty>> buffConditionRate = new HashMap();
   public HashMap<Integer, ArrayList<ConditionProperty>> allBuffConditionRate = new HashMap();
   public HashMap<Integer, ArrayList<ConditionProperty>> buffConditionEffectRate = new HashMap();
   public HashMap<Integer, ArrayList<ConditionProperty>> allBuffConditionEffectRate = new HashMap();
   public HashMap<Integer, ArrayList<ConditionProperty>> cleanBuffInvalid = new HashMap();
   public HashMap<Integer, ArrayList<ConditionProperty>> convertProperty = new HashMap();
   public HashMap<Integer, ArrayList<ConditionProperty>> beConvertProperty = new HashMap();
   public HashMap<Integer, HashMap<Integer, SelectorParam>> skillSelectType = new HashMap();
   public HashMap<Integer, ConditionProperty> reduceAntiHurt = new HashMap();
   public HashMap<Integer, ConditionProperty> baseAddBuffEffect = new HashMap();
   public HashMap<Integer, ConditionProperty> mustHitEffect = new HashMap();
   public HashMap<Integer, ConditionProperty> increaseHurtEffect = new HashMap();
   public HashMap<Integer, ConditionProperty> ignoreShieldEffect = new HashMap();
   public HashMap<Integer, ConditionProperty> noApportionRate = new HashMap();
   public HashMap<Integer, ConditionProperty> buffMagiAtkEx = new HashMap();
   public HashMap<Integer, ConditionProperty> addTargets = new HashMap();
   public HashMap<Integer, ConditionProperty> changeRate = new HashMap();
   public HashMap<Integer, ConditionProperty> incrTargetHurtEffect = new HashMap();
   public HashMap<Integer, ConditionProperty> teamReduceAntiHurt = new HashMap();
   public HashMap<Integer, ConditionProperty> delBuffAndBuffEx = new HashMap();
   public HashMap<Integer, ConditionProperty> roundEndBuffRate = new HashMap();
   public HashMap<Integer, ConditionProperty> teamImproveAntiHurt = new HashMap();

   public int getNewCode() {
      return ++this.newCode;
   }

   private void initRestraint() {
      HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", this.entity.getId());
      if (!Objects.isNull(heroModel)) {
         Map<Integer, HeroRestraintModel> map = ApplicationContextProvider.<Integer, HeroRestraintModel>getModelPoolMap("heroRestraint");
         int realNation = heroModel.getNation();
         if (heroModel.getNation() == 10 && this.entity.inheritNation > 0) {
            realNation = this.entity.inheritNation;
         }

         HeroRestraintModel restraintModel = (HeroRestraintModel)ApplicationContextProvider.getModelPoolEntity("heroRestraint", realNation);
         if (!Objects.isNull(restraintModel)) {
            for(int skillEffectId : restraintModel.getSkillEffect()) {
               SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", skillEffectId);
               if (!Objects.isNull(skillEffectModel)) {
                  this.addConditionProperty((SkillModel)null, skillEffectModel);
               }
            }

         }
      }
   }

   public void init(BattleScene scene, Entity entity) {
      this.entity = entity;
      this.scene = scene;
      this.initRestraint();
   }

   public int getBuffCondition(int buffSubType) {
      ArrayList<ConditionProperty> buffRate = (ArrayList)this.buffConditionRate.get(buffSubType);
      if (!Objects.isNull(buffRate) && buffRate.size() != 0) {
         int rate = 0;

         for(ConditionProperty property : buffRate) {
            rate += (Integer)property.skillEffectModel.getFuncParam().get("rate");
         }

         return rate;
      } else {
         return 0;
      }
   }

   public int getAllBuffCondition(int buffSubType) {
      ArrayList<ConditionProperty> buffRate = (ArrayList)this.allBuffConditionRate.get(buffSubType);
      if (!Objects.isNull(buffRate) && buffRate.size() != 0) {
         int rate = 0;

         for(ConditionProperty property : buffRate) {
            rate += (Integer)property.skillEffectModel.getFuncParam().get("rate");
         }

         return rate;
      } else {
         return 0;
      }
   }

   public int getEffectBuffCondition(int buffSubType) {
      ArrayList<ConditionProperty> buffRate = (ArrayList)this.buffConditionEffectRate.get(buffSubType);
      if (!Objects.isNull(buffRate) && buffRate.size() != 0) {
         int rate = 0;

         for(ConditionProperty property : buffRate) {
            rate += (Integer)property.skillEffectModel.getFuncParam().get("rate");
         }

         return rate;
      } else {
         return 0;
      }
   }

   public int getAllEffectBuffCondition(int buffSubType) {
      ArrayList<ConditionProperty> buffRate = (ArrayList)this.allBuffConditionEffectRate.get(buffSubType);
      if (!Objects.isNull(buffRate) && buffRate.size() != 0) {
         int rate = 0;

         for(ConditionProperty property : buffRate) {
            rate += (Integer)property.skillEffectModel.getFuncParam().get("rate");
         }

         return rate;
      } else {
         return 0;
      }
   }

   public int addConditionProperty(SkillModel skillModel, SkillEffectModel model) {
      int newCode = this.getNewCode();
      ConditionProperty conditionProperty = new ConditionProperty();
      conditionProperty.skillEffectModel = model;
      if (model.getFunc() == 104) {
         for(String paramsName : model.getFuncParam().keySet()) {
            if (paramsName.indexOf("buffSubType") >= 0) {
               int type = (Integer)model.getFuncParam().get(paramsName);
               ArrayList<ConditionProperty> buffRate = (ArrayList)MapUtil.computeIfAbsent(this.buffConditionRate, type, ArrayList.class);
               buffRate.add(conditionProperty);
            }
         }

         return newCode;
      } else if (model.getFunc() == 106) {
         for(String paramsName : model.getFuncParam().keySet()) {
            if (paramsName.indexOf("buffSubType") >= 0) {
               int type = (Integer)model.getFuncParam().get(paramsName);
               ArrayList<ConditionProperty> buffRate = (ArrayList)MapUtil.computeIfAbsent(this.allBuffConditionRate, type, ArrayList.class);
               buffRate.add(conditionProperty);
            }
         }

         return newCode;
      } else if (model.getFunc() == 107) {
         for(String paramsName : model.getFuncParam().keySet()) {
            if (paramsName.indexOf("buffSubType") >= 0) {
               int type = (Integer)model.getFuncParam().get(paramsName);
               ArrayList<ConditionProperty> buffRate = (ArrayList)MapUtil.computeIfAbsent(this.buffConditionEffectRate, type, ArrayList.class);
               buffRate.add(conditionProperty);
            }
         }

         return newCode;
      } else if (model.getFunc() == 108) {
         for(String paramsName : model.getFuncParam().keySet()) {
            if (paramsName.indexOf("buffSubType") >= 0) {
               int type = (Integer)model.getFuncParam().get(paramsName);
               ArrayList<ConditionProperty> buffRate = (ArrayList)MapUtil.computeIfAbsent(this.allBuffConditionEffectRate, type, ArrayList.class);
               buffRate.add(conditionProperty);
            }
         }

         return newCode;
      } else if (model.getFunc() == 116) {
         for(String paramsName : model.getFuncParam().keySet()) {
            if (paramsName.indexOf("buffSubType") >= 0) {
               int type = (Integer)model.getFuncParam().get(paramsName);
               ArrayList<ConditionProperty> buffList = (ArrayList)MapUtil.computeIfAbsent(this.cleanBuffInvalid, type, ArrayList.class);
               buffList.add(conditionProperty);
            }
         }

         return newCode;
      } else if (model.getFunc() == 117) {
         Integer propertyId = (Integer)model.getFuncParam().get("propertyId");
         Integer cId = (Integer)model.getFuncParam().get("cId");
         if (propertyId != null && cId != null) {
            ArrayList<ConditionProperty> list = (ArrayList)MapUtil.computeIfAbsent(this.convertProperty, propertyId, ArrayList.class);
            list.add(conditionProperty);
            list = (ArrayList)MapUtil.computeIfAbsent(this.beConvertProperty, cId, ArrayList.class);
            list.add(conditionProperty);
            return newCode;
         } else {
            return newCode;
         }
      } else {
         if (model.getFunc() == 124) {
            int skillIndex = (Integer)model.getFuncParam().get("skillIndex");
            int skillSlot = (Integer)model.getFuncParam().get("effectSlot");
            HashMap<Integer, SelectorParam> indexMap = (HashMap)MapUtil.computeIfAbsent(this.skillSelectType, skillIndex, HashMap.class);
            SelectorParam param = new SelectorParam();
            param.type = ((Integer)model.getFuncParam().get("selectType")).shortValue();
            param.num = (Integer)model.getFuncParam().get("selectNum");
            param.rate = model.getRate();
            indexMap.put(skillSlot, param);
         } else {
            if (model.getFunc() == 127) {
               MapUtil.computeIfAbsent(this.reduceAntiHurt, conditionProperty.skillEffectModel.getId(), conditionProperty);
               return newCode;
            }

            if (model.getFunc() == 128) {
               MapUtil.computeIfAbsent(this.baseAddBuffEffect, conditionProperty.skillEffectModel.getId(), conditionProperty);
               return newCode;
            }

            if (model.getFunc() == 129) {
               MapUtil.computeIfAbsent(this.mustHitEffect, conditionProperty.skillEffectModel.getId(), conditionProperty);
               return newCode;
            }

            if (model.getFunc() == 130) {
               MapUtil.computeIfAbsent(this.increaseHurtEffect, conditionProperty.skillEffectModel.getId(), conditionProperty);
               return newCode;
            }

            if (model.getFunc() == 131) {
               MapUtil.computeIfAbsent(this.ignoreShieldEffect, conditionProperty.skillEffectModel.getId(), conditionProperty);
               return newCode;
            }

            if (model.getFunc() == 132) {
               MapUtil.computeIfAbsent(this.noApportionRate, conditionProperty.skillEffectModel.getId(), conditionProperty);
               return newCode;
            }

            if (model.getFunc() == 133) {
               MapUtil.computeIfAbsent(this.buffMagiAtkEx, conditionProperty.skillEffectModel.getId(), conditionProperty);
               return newCode;
            }

            if (model.getFunc() == 134) {
               MapUtil.computeIfAbsent(this.addTargets, conditionProperty.skillEffectModel.getId(), conditionProperty);
               return newCode;
            }

            if (model.getFunc() == 135) {
               MapUtil.computeIfAbsent(this.changeRate, conditionProperty.skillEffectModel.getId(), conditionProperty);
               return newCode;
            }

            if (model.getFunc() == 136) {
               MapUtil.computeIfAbsent(this.incrTargetHurtEffect, conditionProperty.skillEffectModel.getId(), conditionProperty);
               return newCode;
            }

            if (model.getFunc() == 139) {
               MapUtil.computeIfAbsent(this.teamReduceAntiHurt, conditionProperty.skillEffectModel.getId(), conditionProperty);
               return newCode;
            }

            if (model.getFunc() == 140) {
               MapUtil.computeIfAbsent(this.delBuffAndBuffEx, conditionProperty.skillEffectModel.getId(), conditionProperty);
               return newCode;
            }

            if (model.getFunc() == 142) {
               MapUtil.computeIfAbsent(this.roundEndBuffRate, conditionProperty.skillEffectModel.getId(), conditionProperty);
               return newCode;
            }

            if (model.getFunc() == 144) {
               MapUtil.computeIfAbsent(this.teamImproveAntiHurt, conditionProperty.skillEffectModel.getId(), conditionProperty);
               return newCode;
            }
         }

         Integer propertyId = (Integer)model.getFuncParam().get("propertyId");
         Map<Integer, ConditionProperty> map = (Map)MapUtil.computeIfAbsent(this.conditionProperties, propertyId, HashMap.class);
         if (Objects.nonNull(skillModel) && skillModel.getType() == 2) {
            conditionProperty.skillModel = skillModel;
         }

         map.put(newCode, conditionProperty);
         this.appProperties.put(newCode, conditionProperty);
         return newCode;
      }
   }

   public void removeEffect(int code) {
      ConditionProperty conditonProperty = (ConditionProperty)this.appProperties.remove(code);
      Map<Integer, ConditionProperty> propertiesMap = (Map)this.conditionProperties.get(conditonProperty.propertyId);
      if (!Objects.isNull(propertiesMap)) {
         propertiesMap.remove(code);
      }
   }

   public long getConditionProperty(Action action, int property, HashMap<Integer, Integer> percentMap) {
      long value = 0L;
      if (BattleMisc.isMultiplyProperty(property)) {
         value = 10000L;
      }

      Map<Integer, ConditionProperty> map = (Map)this.conditionProperties.get(property);
      if (map == null) {
         return value;
      } else {
         Entity attacker = (Entity)action.getBlackboard().getSkillParam(1, (Object)null);
         Entity target = (Entity)action.getBlackboard().getSkillParam(3, (Object)null);
         EntitySkill entitySkill = (EntitySkill)action.getBlackboard().getSkillParam(4, (Object)null);

         for(ConditionProperty conditionProperty : map.values()) {
            if ((conditionProperty.skillModel == null || entitySkill == null || conditionProperty.skillModel.getId() == entitySkill.getSkillId()) && (conditionProperty.skillEffectModel.getRate() == 0 || RandomUtil.randTenThousand() <= conditionProperty.skillEffectModel.getRate()) && (conditionProperty.skillEffectModel.getIsPassive() != 1 || conditionProperty.skillEffectModel.getIsForce() != 0 || !this.entity.getStateManager().checkState((short)17)) && (conditionProperty.skillEffectModel.getNeedDressId() <= 0 || attacker != null && attacker.getActiveDressIds().contains(conditionProperty.skillEffectModel.getNeedDressId()))) {
               switch (conditionProperty.skillEffectModel.getFunc()) {
                  case 101:
                     value = this.getValue101(action, property, percentMap, value, conditionProperty);
                  case 102:
                  case 104:
                  case 106:
                  case 107:
                  case 108:
                  case 109:
                  case 111:
                  case 116:
                  case 117:
                  case 124:
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
                  case 139:
                  case 140:
                  case 142:
                  default:
                     break;
                  case 103:
                     value = this.getValue103(property, percentMap, value, conditionProperty);
                     break;
                  case 105:
                     value = this.getValue105(action, property, percentMap, value, conditionProperty);
                     break;
                  case 110:
                     value = this.getValue110(action, property, percentMap, value, conditionProperty);
                     break;
                  case 112:
                     value = this.getValue112(action, property, percentMap, value, conditionProperty, HeroNation);
                     break;
                  case 113:
                     value = this.getValue113(action, property, percentMap, value, conditionProperty);
                     break;
                  case 114:
                     value = this.getValue112(action, property, percentMap, value, conditionProperty, HeroType);
                     break;
                  case 115:
                     value = this.getValue114(action, property, percentMap, value, conditionProperty);
                     break;
                  case 118:
                     value = this.getValue118(action, property, percentMap, value, conditionProperty);
                     break;
                  case 119:
                     value = this.getValue119(action, property, percentMap, value, conditionProperty);
                     break;
                  case 120:
                     value = this.getValue120(action, property, percentMap, value, conditionProperty);
                     break;
                  case 121:
                     value = this.getValue121(action, property, percentMap, value, conditionProperty);
                     break;
                  case 122:
                     value = this.getValue122(action, property, percentMap, value, conditionProperty);
                     break;
                  case 123:
                     value = this.getValue123(action, property, percentMap, value, conditionProperty);
                     break;
                  case 125:
                     value = this.getValue125(action, property, percentMap, value, conditionProperty);
                     break;
                  case 126:
                     value = this.getValue126(action, property, percentMap, value, conditionProperty);
                     break;
                  case 137:
                     value = this.getValue137(action, property, percentMap, value, conditionProperty);
                     break;
                  case 138:
                     value = this.getValue138(action, property, percentMap, value, conditionProperty);
                     break;
                  case 141:
                     value = this.getValue141(property, percentMap, value, conditionProperty);
                     break;
                  case 143:
                     value = this.getValue143(action, property, percentMap, value, conditionProperty);
               }
            }
         }

         return value;
      }
   }

   private long getValue103(int property, HashMap<Integer, Integer> percentMap, long value, ConditionProperty conditionProperty) {
      int param = 0;
      SkillEffectModel model = conditionProperty.skillEffectModel;

      for(ConditionModel conditionModel : model.getConditions()) {
         switch (conditionModel.getCondition()) {
            case 13:
               BattlePKTeam oppositionTeam = this.entity.getScene().getPKTeam(BattleMisc.oppositionForce(this.entity.getForce()));

               for(Entity enemy : oppositionTeam.getEntityMap().values()) {
                  if (!enemy.isDead()) {
                     Set<Integer> buffSets = enemy.getBuffManager().getSubBuff((short)conditionModel.getConditionValue());
                     if (!Objects.isNull(buffSets) && buffSets.size() != 0) {
                        for(int code : buffSets) {
                           Buff buff = enemy.getBuffManager().getBuff(code);
                           param += buff.count;
                        }
                     }
                  }
               }

               if (param >= conditionModel.getConditionValue()) {
                  param = conditionModel.getConditionValue();
               }

               Integer propertyValue = (Integer)model.getFuncParam().get("value");
               if (BattleMisc.isMultiplyProperty(property)) {
                  value = (long)((float)value * ((float)(10000 - propertyValue * param) / 10000.0F));
               } else {
                  Integer way = (Integer)model.getFuncParam().get("way");
                  if (way != null && way == 1) {
                     MapUtil.mapPlusInt(percentMap, model.getFuncParam().get("propertyId"), propertyValue * param);
                  } else {
                     value += (long)(propertyValue * param);
                  }
               }

               value = Math.min((long)(Integer)model.getFuncParam().get("maxValue"), value);
         }
      }

      return value;
   }

   private long getValue101(Action action, int property, HashMap<Integer, Integer> percentMap, long value, ConditionProperty conditionProperty) {
      SkillEffectModel model = conditionProperty.skillEffectModel;
      Entity target = (Entity)action.getBlackboard().getSkillParam(3, (Object)null);
      boolean success = ConditionProcessor.checkCondition(action, model.getConditionType(), model.getConditions(), this.entity, target, (Event)null);
      if (success) {
         if (BattleMisc.isMultiplyProperty(property)) {
            value = (long)((float)value * ((float)(10000 - (Integer)model.getFuncParam().get("value")) / 10000.0F));
         } else {
            Integer way = (Integer)model.getFuncParam().get("way");
            if (way != null && way == 1) {
               MapUtil.mapPlusInt(percentMap, model.getFuncParam().get("propertyId"), (Integer)model.getFuncParam().get("value"));
            } else {
               value += (long)(Integer)model.getFuncParam().get("value");
            }
         }
      }

      return value;
   }

   private long getValue105(Action action, int property, HashMap<Integer, Integer> percentMap, long value, ConditionProperty conditionProperty) {
      SkillEffectModel model = conditionProperty.skillEffectModel;
      Entity target = (Entity)action.getBlackboard().getSkillParam(3, (Object)null);
      if (Objects.isNull(target)) {
         return 0L;
      } else {
         Entity attacker = (Entity)action.getBlackboard().getSkillParam(1, (Object)null);
         if (attacker != this.entity) {
            return 0L;
         } else {
            int buffNum = target.getBuffManager().getPriorityBuffsNum(((Integer)model.getFuncParam().get("buffType")).byteValue());
            int addValue = buffNum * (Integer)model.getFuncParam().get("rate");
            long maxValue = (long)(Integer)model.getFuncParam().getOrDefault("maxValue", 5);
            if (maxValue != 0L) {
               maxValue = (long)((float)(this.entity.getBaseProperty(property) * maxValue) / 10000.0F);
            }

            if (BattleMisc.isMultiplyProperty(property)) {
               for(int i = 0; i < buffNum; ++i) {
                  value = (long)((float)value * ((float)(10000 - addValue) / 10000.0F));
               }
            } else {
               Integer way = (Integer)model.getFuncParam().get("way");
               if (way != null && way == 1) {
                  MapUtil.mapPlusInt(percentMap, model.getFuncParam().get("propertyId"), addValue * buffNum);
               } else {
                  long finalValue = (long)(addValue * buffNum);
                  value += finalValue > maxValue ? maxValue : finalValue;
               }
            }

            return value;
         }
      }
   }

   private long getValue110(Action action, int property, HashMap<Integer, Integer> percentMap, long value, ConditionProperty conditionProperty) {
      SkillEffectModel model = conditionProperty.skillEffectModel;
      Entity target = (Entity)action.getBlackboard().getSkillParam(1, (Object)null);
      if (Objects.isNull(target)) {
         return 0L;
      } else {
         int rate = (int)((1.0F - (float)target.getBaseProperty(99) / (float)target.getBaseProperty(1)) * 10000.0F * (float)model.getParam("rate") / 100.0F);
         int max = conditionProperty.skillEffectModel.getParam("max");
         if (max != 0 && rate > max) {
            rate = max;
         }

         Integer way = (Integer)model.getFuncParam().get("way");
         if (way != null && way == 1) {
            MapUtil.mapPlusInt(percentMap, model.getFuncParam().get("propertyId"), rate);
         } else {
            value += (long)rate;
         }

         return value;
      }
   }

   private long getValue112(Action action, int property, HashMap<Integer, Integer> percentMap, long value, ConditionProperty conditionProperty, BiFunction<HeroModel, ConditionModel, Boolean> func) {
      if (conditionProperty.skillEffectModel.getConditions().size() == 0) {
         return value;
      } else {
         SkillEffectModel model = conditionProperty.skillEffectModel;
         ConditionModel conditionModel = (ConditionModel)model.getConditions().get(0);
         int num = 0;

         for(Entity entity : this.scene.getPosEntity().values()) {
            if (!entity.isDead()) {
               HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPool().getEntity("hero", entity.getId());
               if (!Objects.isNull(heroModel) && (Boolean)func.apply(heroModel, conditionModel)) {
                  ++num;
               }
            }
         }

         Integer way = (Integer)model.getFuncParam().get("way");
         if (BattleMisc.isMultiplyProperty(property)) {
            value = (long)((float)value * ((float)(10000 - (Integer)model.getFuncParam().get("value") * num) / 10000.0F));
         } else if (way != null && way == 1) {
            MapUtil.mapPlusInt(percentMap, model.getFuncParam().get("propertyId"), num * (Integer)model.getFuncParam().get("value"));
         } else {
            value += (long)(num * (Integer)model.getFuncParam().get("value"));
         }

         return value;
      }
   }

   private long getValue113(Action action, int property, HashMap<Integer, Integer> percentMap, long value, ConditionProperty conditionProperty) {
      if (conditionProperty.skillEffectModel.getConditions().size() == 0) {
         return value;
      } else {
         Entity source = (Entity)action.getBlackboard().getSkillParam(1);
         Entity target = (Entity)action.getBlackboard().getSkillParam(3);
         if (!Objects.isNull(source) && !Objects.isNull(target) && source == this.entity) {
            SkillEffectModel model = conditionProperty.skillEffectModel;
            ConditionModel conditionModel = (ConditionModel)model.getConditions().get(0);
            if (!ConditionProcessor.checkCondition(action, model.getConditionType(), model.getConditions(), source, target, (Event)null)) {
               return value;
            } else {
               Integer way = (Integer)model.getFuncParam().get("way");
               if (BattleMisc.isMultiplyProperty(property)) {
                  value = (long)((float)value * ((float)(10000 - (Integer)model.getFuncParam().get("value")) / 10000.0F));
               } else if (way != null && way == 1) {
                  MapUtil.mapPlusInt(percentMap, model.getFuncParam().get("propertyId"), (Integer)model.getFuncParam().get("value"));
               } else {
                  value += (long)(Integer)model.getFuncParam().get("value");
               }

               HashSet<Object> passiveListener = (HashSet)action.getBlackboard().getSkillParam(25);
               if (Objects.isNull(passiveListener)) {
                  passiveListener = new HashSet();
                  action.getBlackboard().addSkillParam(25, passiveListener);
               }

               if (!passiveListener.contains(conditionProperty) && model.getEventType().size() == 0 && model.getTipsType() != 0) {
                  BattleMsg.S2C_Battle_Effect.Builder s2C_battle_effect = BattleMsg.S2C_Battle_Effect.newBuilder();
                  s2C_battle_effect.setEffectType(21);
                  s2C_battle_effect.setTargetBattlePos(this.entity.getBattlePos());
                  s2C_battle_effect.setEffectId(model.getId());
                  action.getBlackboard().addBattleEffect(s2C_battle_effect);
                  passiveListener.add(conditionProperty);
               }

               return value;
            }
         } else {
            return value;
         }
      }
   }

   private long getValue114(Action action, int property, HashMap<Integer, Integer> percentMap, long value, ConditionProperty conditionProperty) {
      if (conditionProperty.skillEffectModel.getConditions().size() == 0) {
         return value;
      } else {
         Entity source = (Entity)action.getBlackboard().getSkillParam(1);
         Entity target = (Entity)action.getBlackboard().getSkillParam(3);
         if (!Objects.isNull(source) && !Objects.isNull(target)) {
            SkillEffectModel model = conditionProperty.skillEffectModel;
            ConditionModel conditionModel = (ConditionModel)model.getConditions().get(0);
            int num = 0;

            for(Entity entity : source.getPkTeam().getEntityMap().values()) {
               if (entity.getBaseProperty(99) * 10000L / entity.getBaseProperty(99) < (long)conditionModel.getConditionValue()) {
                  ++num;
               }
            }

            if (num == 0) {
               return 0L;
            } else {
               Integer way = (Integer)model.getFuncParam().get("way");
               if (BattleMisc.isMultiplyProperty(property)) {
                  value = (long)((float)value * ((float)(10000 - (Integer)model.getFuncParam().get("value") * num) / 10000.0F));
               } else if (way != null && way == 1) {
                  MapUtil.mapPlusInt(percentMap, model.getFuncParam().get("propertyId"), (Integer)model.getFuncParam().get("value") * num);
               } else {
                  value += (long)((Integer)model.getFuncParam().get("value") * num);
               }

               return value;
            }
         } else {
            return value;
         }
      }
   }

   public long getValue118(Action action, int property, HashMap<Integer, Integer> percentMap, long value, ConditionProperty conditionProperty) {
      Entity attacker = (Entity)action.getBlackboard().getSkillParam(1);
      if (attacker != this.entity) {
         return 0L;
      } else {
         Entity target = (Entity)action.getBlackboard().getSkillParam(3);
         if (target == null) {
            return 0L;
         } else if (attacker.getForce() == target.getForce()) {
            return 0L;
         } else {
            long diff = target.getBaseProperty(1) - this.entity.getBaseProperty(1);
            if (diff <= 0L) {
               return 0L;
            } else {
               SkillEffectModel model = conditionProperty.skillEffectModel;
               value += (long)model.getParam("maxValue");
               return value;
            }
         }
      }
   }

   public long getValue119(Action action, int property, HashMap<Integer, Integer> percentMap, long value, ConditionProperty conditionProperty) {
      SkillEffectModel model = conditionProperty.skillEffectModel;
      if (model != null) {
         Entity target = (Entity)action.getBlackboard().getSkillParam(3, (Object)null);
         if (target != null && !ConditionProcessor.checkCondition(action, model.getConditionType(), model.getConditions(), this.entity, target, (Event)null)) {
            return value;
         }
      }

      Integer buffType = conditionProperty.skillEffectModel.getParam("buffType");
      int num = this.entity.getBuffManager().getPriorityBuffsNum(buffType.byteValue());
      Integer targetType = (Integer)model.getFuncParam().get("targetType");
      if (targetType != null && targetType.byteValue() == 2) {
         Entity target = (Entity)action.getBlackboard().getSkillParam(3, (Object)null);
         if (target == null) {
            return value;
         }

         num = target.getBuffManager().getPriorityBuffsNum(buffType.byteValue());
      }

      if (num == 0) {
         return value;
      } else {
         Integer way = (Integer)model.getFuncParam().get("way");
         Integer max = (Integer)model.getFuncParam().get("maxValue");
         int tmp = (Integer)model.getFuncParam().get("value") * num;
         tmp = tmp >= max ? max : tmp;
         if (BattleMisc.isMultiplyProperty(property)) {
            value = (long)((float)value * ((float)(10000 - tmp) / 10000.0F));
         } else if (way != null && way == 1) {
            MapUtil.mapPlusInt(percentMap, model.getFuncParam().get("propertyId"), tmp);
         } else {
            value += (long)tmp;
         }

         return value;
      }
   }

   public long getValue120(Action action, int property, HashMap<Integer, Integer> percentMap, long value, ConditionProperty conditionProperty) {
      Entity attacker = (Entity)action.getBlackboard().getSkillParam(1);
      if (attacker != this.entity) {
         return 0L;
      } else {
         Entity target = (Entity)action.getBlackboard().getSkillParam(3);
         if (target == null) {
            return 0L;
         } else {
            SkillEffectModel model = conditionProperty.skillEffectModel;
            boolean success = ConditionProcessor.checkCondition(action, model.getConditionType(), model.getConditions(), this.entity, target, (Event)null);
            if (!success) {
               return value;
            } else {
               short buffSubType = (short)conditionProperty.skillEffectModel.getParam("buffSubType");
               TreeSet<Integer> codeSet = target.getBuffManager().getSubBuff(buffSubType);
               if (codeSet != null && codeSet.size() != 0) {
                  int num = 0;

                  for(int code : codeSet) {
                     Buff buff = target.getBuffManager().getBuff(code);
                     if (buff.count == 0) {
                        ++num;
                     } else {
                        num += buff.count;
                     }
                  }

                  if (num == 0) {
                     return value;
                  } else {
                     Integer way = (Integer)model.getFuncParam().get("way");
                     Integer max = (Integer)model.getFuncParam().get("maxValue");
                     int tmp = (Integer)model.getFuncParam().get("value") * num;
                     tmp = tmp >= max ? max : tmp;
                     if (BattleMisc.isMultiplyProperty(property)) {
                        value = (long)((float)value * ((float)(10000 - tmp) / 10000.0F));
                     } else if (way != null && way == 1) {
                        MapUtil.mapPlusInt(percentMap, model.getFuncParam().get("propertyId"), tmp);
                     } else {
                        value += (long)tmp;
                     }

                     return value;
                  }
               } else {
                  return value;
               }
            }
         }
      }
   }

   public long getValue121(Action action, int property, HashMap<Integer, Integer> percentMap, long value, ConditionProperty conditionProperty) {
      Entity attacker = (Entity)action.getBlackboard().getSkillParam(1);
      if (attacker != this.entity) {
         return 0L;
      } else {
         List<Entity> targets = (List)action.getBlackboard().getSkillParam(1400 + attacker.getBattlePos());
         if (targets != null && targets.size() != 0) {
            Entity target = (Entity)action.getBlackboard().getSkillParam(3);
            SkillEffectModel model = conditionProperty.skillEffectModel;
            boolean success = ConditionProcessor.checkCondition(action, model.getConditionType(), model.getConditions(), this.entity, target, (Event)null);
            if (!success) {
               return value;
            } else {
               Integer way = (Integer)model.getFuncParam().get("way");
               Integer max = (Integer)model.getFuncParam().get("maxValue");
               int tmp = (Integer)model.getFuncParam().get("value") * targets.size();
               tmp = tmp >= max ? max : tmp;
               if (BattleMisc.isMultiplyProperty(property)) {
                  value = (long)((float)value * ((float)(10000 - tmp) / 10000.0F));
               } else if (way != null && way == 1) {
                  MapUtil.mapPlusInt(percentMap, model.getFuncParam().get("propertyId"), tmp);
               } else {
                  value += (long)tmp;
               }

               return value;
            }
         } else {
            return 0L;
         }
      }
   }

   public long getValue122(Action action, int property, HashMap<Integer, Integer> percentMap, long value, ConditionProperty conditionProperty) {
      Entity attacker = (Entity)action.getBlackboard().getSkillParam(1);
      if (attacker != this.entity) {
         return 0L;
      } else {
         Entity target = (Entity)action.getBlackboard().getSkillParam(3);
         SkillEffectModel model = conditionProperty.skillEffectModel;
         boolean success = ConditionProcessor.checkCondition(action, model.getConditionType(), model.getConditions(), this.entity, target, (Event)null);
         if (!success) {
            return value;
         } else {
            long maxHp = target.getBattleProperty(action, 1);
            long curHp = target.getBattleProperty(action, 99);
            int tmp = (int)((1.0F - (float)curHp / (float)maxHp) * (float)(Integer)model.getFuncParam().get("value"));
            Integer way = (Integer)model.getFuncParam().get("way");
            Integer max = (Integer)model.getFuncParam().get("maxValue");
            tmp = tmp >= max ? max : tmp;
            if (BattleMisc.isMultiplyProperty(property)) {
               value = (long)((float)value * ((float)(10000 - tmp) / 10000.0F));
            } else if (way != null && way == 1) {
               MapUtil.mapPlusInt(percentMap, model.getFuncParam().get("propertyId"), tmp);
            } else {
               value += (long)tmp;
            }

            return value;
         }
      }
   }

   public long getValue123(Action action, int property, HashMap<Integer, Integer> percentMap, long value, ConditionProperty conditionProperty) {
      Entity attacker = (Entity)action.getBlackboard().getSkillParam(1);
      if (attacker != this.entity) {
         return 0L;
      } else {
         Entity target = (Entity)action.getBlackboard().getSkillParam(3);
         SkillEffectModel model = conditionProperty.skillEffectModel;
         boolean success = ConditionProcessor.checkCondition(action, model.getConditionType(), model.getConditions(), this.entity, target, (Event)null);
         if (!success) {
            return value;
         } else {
            int deadNum = 0;

            for(Entity eachEntity : target.getPkTeam().getEntityMap().values()) {
               if (eachEntity.isDead()) {
                  ++deadNum;
               }
            }

            if (deadNum == 0) {
               return value;
            } else {
               Integer way = (Integer)model.getFuncParam().get("way");
               Integer addValue = (Integer)model.getFuncParam().get("value") * deadNum;
               if (BattleMisc.isMultiplyProperty(property)) {
                  value = (long)((float)value * ((float)(10000 - addValue) / 10000.0F));
               } else if (way != null && way == 1) {
                  MapUtil.mapPlusInt(percentMap, model.getFuncParam().get("propertyId"), addValue);
               } else {
                  value += (long)addValue;
               }

               return value;
            }
         }
      }
   }

   public long getValue125(Action action, int property, HashMap<Integer, Integer> percentMap, long value, ConditionProperty conditionProperty) {
      Entity attacker = (Entity)action.getBlackboard().getSkillParam(1);
      if (attacker != this.entity) {
         return 0L;
      } else {
         EntitySkill entitySkill = (EntitySkill)action.getBlackboard().getSkillParam(4);
         if (entitySkill != null && this.entity == entitySkill.entity) {
            SkillModel skillModel = (SkillModel)ApplicationContextProvider.getModelPoolEntity("skill", entitySkill.getSkillId());
            int mainSlot = skillModel.getMainEffect();
            if (!skillModel.getEffects().containsKey(mainSlot)) {
               return 0L;
            } else {
               SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", (Integer)skillModel.getEffects().get(mainSlot));
               if (skillEffectModel == null) {
                  return 0L;
               } else if (skillEffectModel.getFunc() != 7 && skillEffectModel.getFunc() != 6) {
                  return 0L;
               } else {
                  SkillEffectModel model = conditionProperty.skillEffectModel;
                  long tmp = (long)((float)(this.entity.getBaseProperty(1) * (long)(Integer)model.getFuncParam().get("value")) / 10000.0F);
                  if ((float)tmp > (float)(this.entity.getBaseProperty(2) * (long)(Integer)model.getFuncParam().get("maxValue")) / 10000.0F) {
                     tmp = this.entity.getBaseProperty(2);
                  }

                  value += tmp;
                  return value;
               }
            }
         } else {
            return 0L;
         }
      }
   }

   public long getValue126(Action action, int property, HashMap<Integer, Integer> percentMap, long value, ConditionProperty conditionProperty) {
      SkillEffectModel model = conditionProperty.skillEffectModel;
      if (conditionProperty.skillEffectModel.getConditions().size() == 0) {
         return value;
      } else {
         ConditionModel conditionModel = (ConditionModel)conditionProperty.skillEffectModel.getConditions().get(0);
         float conParam = Float.parseFloat(conditionModel.getConditionParam()) / 10000.0F;
         int rate = (int)(((double)this.entity.getBaseProperty(99) / (double)this.entity.getBaseProperty(1) - (double)conParam) * (double)model.getParam("rate"));
         if (rate < 0) {
            return value;
         } else {
            Integer way = (Integer)model.getFuncParam().get("way");
            if (way != null && way == 1) {
               MapUtil.mapPlusInt(percentMap, model.getFuncParam().get("propertyId"), rate);
            } else {
               value += (long)rate;
            }

            return value;
         }
      }
   }

   public SelectorParam getReplaceSelect(int skillIndex, int effectSlot) {
      HashMap<Integer, SelectorParam> slotMap = (HashMap)this.skillSelectType.get(skillIndex);
      return slotMap == null ? null : (SelectorParam)slotMap.get(effectSlot);
   }

   public Collection<ConditionProperty> getReduceAntiHurtList() {
      return this.reduceAntiHurt.values();
   }

   public Collection<ConditionProperty> getBaseAddBuffEffectList() {
      return this.baseAddBuffEffect.values();
   }

   public Collection<ConditionProperty> getMustHitEffectEffectList() {
      return this.mustHitEffect.values();
   }

   public long getValue130(Action action, long damage) {
      Entity target = (Entity)action.getBlackboard().getSkillParam(3, (Object)null);
      int rate = 10000;
      int addRate = 0;

      for(ConditionProperty conditionProperty : this.increaseHurtEffect.values()) {
         SkillEffectModel model = conditionProperty.skillEffectModel;
         boolean success = ConditionProcessor.checkCondition(action, model.getConditionType(), model.getConditions(), this.entity, target, (Event)null);
         if (success) {
            int count = 1;
            if (model.getFuncParam().containsKey("buffSubType")) {
               short buffSubcls = ((Integer)model.getFuncParam().get("buffSubType")).shortValue();
               TreeSet<Integer> set = this.entity.getBuffManager().getSubBuff(buffSubcls);
               if (Objects.isNull(set)) {
                  count = 0;
               } else {
                  count = set.size();
               }
            }

            addRate += (Integer)model.getFuncParam().get("hurtRate") * count;
         }
      }

      rate += addRate;
      damage = (long)((float)damage * ((float)rate / 10000.0F));
      return damage;
   }

   public boolean ignoreShieldEffect(Action action) {
      Entity target = (Entity)action.getBlackboard().getSkillParam(3, (Object)null);

      for(ConditionProperty conditionProperty : this.ignoreShieldEffect.values()) {
         SkillEffectModel model = conditionProperty.skillEffectModel;
         boolean success = ConditionProcessor.checkCondition(action, model.getConditionType(), model.getConditions(), this.entity, target, (Event)null);
         int rate = model.getParam("rate");
         if (rate == 0) {
            rate = 10000;
         }

         if (model.getFuncParam().containsKey("buffSubType")) {
            short buffSubcls = ((Integer)model.getFuncParam().get("buffSubType")).shortValue();
            TreeSet<Integer> set = this.entity.getBuffManager().getSubBuff(buffSubcls);
            int count = Objects.isNull(set) ? 0 : set.size();
            int value = count * (Integer)model.getFuncParam().get("value");
            value = Math.min((Integer)model.getFuncParam().get("maxValue"), value);
            rate += value;
         }

         if (RandomUtil.randTenThousand() < rate) {
            return success;
         }
      }

      return false;
   }

   public int getValue132(Action action, int rate) {
      Entity target = (Entity)action.getBlackboard().getSkillParam(3, (Object)null);

      for(ConditionProperty conditionProperty : this.noApportionRate.values()) {
         SkillEffectModel model = conditionProperty.skillEffectModel;
         boolean success = ConditionProcessor.checkCondition(action, model.getConditionType(), model.getConditions(), this.entity, target, (Event)null);
         if (success) {
            rate += (Integer)model.getFuncParam().get("rate");
         }
      }

      return rate;
   }

   public Collection<ConditionProperty> getBuffMagiAtkEx() {
      return this.buffMagiAtkEx.values();
   }

   public List<Entity> getAddTargets(Action action, int effectId) {
      List<Entity> targets = new ArrayList();

      for(ConditionProperty conditionProperty : this.addTargets.values()) {
         SkillEffectModel model = conditionProperty.skillEffectModel;
         if (model.getFuncParam().containsKey("minEffectId") && model.getFuncParam().containsKey("maxEffectId")) {
            int minEffectId = (Integer)model.getFuncParam().get("minEffectId");
            int maxEffectId = (Integer)model.getFuncParam().get("maxEffectId");
            if (effectId >= minEffectId && effectId <= maxEffectId) {
               boolean success = ConditionProcessor.checkCondition(action, model.getConditionType(), model.getConditions(), this.entity, (Entity)null, (Event)null);
               if (success) {
                  for(Entity e : this.entity.getScene().selectTarget(action, this.entity, model.getTargetType(), model.getSelectType(), model.getSelectNum(), model.getSelectParam())) {
                     if (!targets.contains(e)) {
                        targets.add(e);
                     }
                  }
               }
            }
         }
      }

      return targets;
   }

   public Map<String, Integer> changeRate(Action action) {
      Map<String, Integer> map = new HashMap();
      boolean change = false;
      Integer damageTotalRate = 0;
      Integer controlTotalRate = 0;
      Integer recoverTotalRate = 0;

      for(ConditionProperty conditionProperty : this.changeRate.values()) {
         SkillEffectModel model = conditionProperty.skillEffectModel;
         boolean success = ConditionProcessor.checkCondition(action, model.getConditionType(), model.getConditions(), this.entity, (Entity)null, (Event)null);
         if (success) {
            if (!change) {
               change = true;
            }

            Integer damageRate = (Integer)model.getFuncParam().get("damageRate");
            Integer controlRate = (Integer)model.getFuncParam().get("controlRate");
            Integer recoverRate = (Integer)model.getFuncParam().get("recoverRate");
            if (Objects.nonNull(damageRate)) {
               damageTotalRate = damageTotalRate + damageRate;
            }

            if (Objects.nonNull(controlRate)) {
               controlTotalRate = controlTotalRate + controlRate;
            }

            if (Objects.nonNull(recoverRate)) {
               recoverTotalRate = recoverTotalRate + recoverRate;
            }
         }
      }

      if (change) {
         map.put("damageRate", damageTotalRate);
         map.put("controlRate", controlTotalRate);
         map.put("recoverRate", recoverTotalRate);
      }

      return map;
   }

   public long getValue136(Action action, long damage, Entity target) {
      int rate = 10000;
      int addRate = 0;

      for(ConditionProperty conditionProperty : this.incrTargetHurtEffect.values()) {
         SkillEffectModel model = conditionProperty.skillEffectModel;
         boolean success = ConditionProcessor.checkCondition(action, model.getConditionType(), model.getConditions(), this.entity, target, (Event)null);
         if (success) {
            int count = 1;
            if (model.getFuncParam().containsKey("buffSubType")) {
               short buffSubcls = ((Integer)model.getFuncParam().get("buffSubType")).shortValue();
               TreeSet<Integer> set = this.entity.getBuffManager().getSubBuff(buffSubcls);
               if (Objects.isNull(set)) {
                  count = 0;
               } else {
                  count = set.size();
               }
            }

            addRate += (Integer)model.getFuncParam().get("hurtRate") * count;
         }
      }

      rate += addRate;
      damage = (long)((float)damage * ((float)rate / 10000.0F));
      return damage;
   }

   private long getValue137(Action action, int property, HashMap<Integer, Integer> percentMap, long value, ConditionProperty conditionProperty) {
      SkillEffectModel model = conditionProperty.skillEffectModel;
      Entity target = (Entity)action.getBlackboard().getSkillParam(3, (Object)null);
      if (Objects.isNull(target)) {
         return 0L;
      } else {
         boolean success = ConditionProcessor.checkCondition(action, model.getConditionType(), model.getConditions(), this.entity, target, (Event)null);
         if (success) {
            int rate = (int)((float)(target.getBuffManager().getShieldValue() + (long)target.getBuffManager().getShieldBuff().size()) / (float)target.getBaseProperty(1) * 10000.0F / (float)model.getParam("preRate"));
            rate *= model.getParam("rate");
            int max = conditionProperty.skillEffectModel.getParam("max");
            if (max != 0 && rate > max) {
               rate = max;
            }

            Integer way = (Integer)model.getFuncParam().get("way");
            if (way != null && way == 1) {
               MapUtil.mapPlusInt(percentMap, model.getFuncParam().get("propertyId"), rate);
            } else {
               value += (long)rate;
            }
         }

         return value;
      }
   }

   private long getValue138(Action action, int property, HashMap<Integer, Integer> percentMap, long value, ConditionProperty conditionProperty) {
      SkillEffectModel model = conditionProperty.skillEffectModel;
      Entity target = (Entity)action.getBlackboard().getSkillParam(1, (Object)null);
      if (Objects.isNull(target)) {
         return 0L;
      } else {
         boolean success = ConditionProcessor.checkCondition(action, model.getConditionType(), model.getConditions(), this.entity, target, (Event)null);
         if (success) {
            int rate = (int)((1.0F - (float)target.getBaseProperty(99) / (float)target.getBaseProperty(1)) * 10000.0F / (float)model.getParam("preRate"));
            rate *= model.getParam("rate");
            int max = conditionProperty.skillEffectModel.getParam("max");
            if (max != 0 && rate > max) {
               rate = max;
            }

            Integer way = (Integer)model.getFuncParam().get("way");
            if (way != null && way == 1) {
               MapUtil.mapPlusInt(percentMap, model.getFuncParam().get("propertyId"), rate);
            } else {
               value += (long)rate;
            }
         }

         return value;
      }
   }

   private long getValue141(int property, HashMap<Integer, Integer> percentMap, long value, ConditionProperty conditionProperty) {
      SkillEffectModel model = conditionProperty.skillEffectModel;

      for(ConditionModel conditionModel : model.getConditions()) {
         switch (conditionModel.getCondition()) {
            case 97:
               int count = 0;
               BattlePKTeam oppositionTeam = this.entity.getScene().getPKTeam(BattleMisc.oppositionForce(this.entity.getForce()));

               for(String param : Splitter.on("|").trimResults().splitToList(conditionModel.getConditionParam())) {
                  for(Entity enemy : oppositionTeam.getEntityMap().values()) {
                     Set<Integer> buffSets = enemy.getBuffManager().getSubBuff(Short.parseShort(param));
                     if (!Objects.isNull(buffSets) && buffSets.size() != 0) {
                        for(int code : buffSets) {
                           Buff buff = enemy.getBuffManager().getBuff(code);
                           count += buff.count;
                        }
                     }
                  }
               }

               if (count != 0) {
                  Integer propertyValue = (Integer)model.getFuncParam().get("value");
                  int addValue = propertyValue * count;
                  addValue = Math.min((Integer)model.getFuncParam().get("maxValue"), addValue);
                  if (BattleMisc.isMultiplyProperty(property)) {
                     value = (long)((float)value * ((float)(10000 - addValue) / 10000.0F));
                  } else {
                     Integer way = (Integer)model.getFuncParam().get("way");
                     if (way != null && way == 1) {
                        MapUtil.mapPlusInt(percentMap, model.getFuncParam().get("propertyId"), addValue);
                     } else {
                        value += (long)addValue;
                     }
                  }
               }
         }
      }

      return value;
   }

   public Collection<ConditionProperty> getTeamReduceAntiHurtList() {
      return this.teamReduceAntiHurt.values();
   }

   public Collection<ConditionProperty> getTeamImproveAntiHurtList() {
      return this.teamImproveAntiHurt.values();
   }

   public Collection<ConditionProperty> getDelBuffAndBuff() {
      return this.delBuffAndBuffEx.values();
   }

   public int getValue142(Action action, Entity source, Entity target, short subCls) {
      int rate = 0;

      for(ConditionProperty conditionProperty : this.roundEndBuffRate.values()) {
         SkillEffectModel model = conditionProperty.skillEffectModel;
         boolean success = ConditionProcessor.checkCondition(action, model.getConditionType(), model.getConditions(), source, target, (Event)null);
         if (success && model.getFuncParam().containsKey("buffSubType")) {
            short buffSubcls = ((Integer)model.getFuncParam().get("buffSubType")).shortValue();
            if (buffSubcls == subCls) {
               rate += (Integer)model.getFuncParam().get("rate");
            }
         }
      }

      return rate;
   }

   public long getValue143(Action action, int property, HashMap<Integer, Integer> percentMap, long value, ConditionProperty conditionProperty) {
      SkillEffectModel model = conditionProperty.skillEffectModel;
      if (model != null) {
         Entity target = (Entity)action.getBlackboard().getSkillParam(3, (Object)null);
         if (target != null && !ConditionProcessor.checkCondition(action, model.getConditionType(), model.getConditions(), this.entity, target, (Event)null)) {
            return value;
         }
      }

      Integer lower = (Integer)model.getFuncParam().get("buffId_lower");
      Integer upper = (Integer)model.getFuncParam().get("buffId_upper");
      int num = 0;

      for(int i = lower; i <= upper; i += 10) {
         TreeMap<Integer, Buff> codeMap = this.entity.getBuffManager().getBuffsById(i);
         if (Objects.nonNull(codeMap) && codeMap.size() > 0) {
            num = codeMap.size();
            break;
         }
      }

      if (num == 0) {
         return value;
      } else {
         Integer way = (Integer)model.getFuncParam().get("way");
         Integer max = (Integer)model.getFuncParam().get("maxValue");
         int tmp = (Integer)model.getFuncParam().get("value") * num;
         tmp = tmp >= max ? max : tmp;
         if (BattleMisc.isMultiplyProperty(property)) {
            value = (long)((float)value * ((float)(10000 - tmp) / 10000.0F));
         } else if (way != null && way == 1) {
            MapUtil.mapPlusInt(percentMap, model.getFuncParam().get("propertyId"), tmp);
         } else {
            value += (long)tmp;
         }

         return value;
      }
   }
}
