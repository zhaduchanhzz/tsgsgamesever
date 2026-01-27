package com.gzbz.battle.passive;

import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.effectFunc.EffectFuncProcessor;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.Listener;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class PassiveSkillEffect implements Listener {
   public EntitySkill skill;
   public short times;
   public int effectId;
   public int code;
   public Entity entity;
   public int coolDown;
   public int triggerTime;

   public void listen(Event event, ListenerContext context) {
      if (this.entity.getPkTeam().checkPassiveSkill(this.effectId, this.entity)) {
         SkillEffectModel skillEffectModel = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", this.effectId);
         if (this.coolDown <= 0) {
            if (skillEffectModel.getTriggerTime() == 0 || this.triggerTime < skillEffectModel.getTriggerTime()) {
               switch (skillEffectModel.onTriggerScene) {
                  case 1:
                     if (this.entity.getBattlePos() != BattleMisc.FRIEND_POS[0] && this.entity.getBattlePos() != BattleMisc.FRIEND_POS[1]) {
                        return;
                     }
                  case 2:
                     if (this.entity.getOriginalPos() != BattleMisc.FRIEND_POS[0] && this.entity.getOriginalPos() != BattleMisc.FRIEND_POS[1]) {
                        return;
                     }
                     break;
                  case 3:
                     if (this.entity == this.entity.getPkTeam().getFriendEntity()) {
                        if (this.entity.getOriginalPos() != BattleMisc.FRIEND_POS[0] && this.entity.getOriginalPos() != BattleMisc.FRIEND_POS[1]) {
                           return;
                        }
                     } else if (context.entity.getBattlePos() < 0 || context.entity.getBattlePos() >= BattleMisc.FORCE_BATTLE_POS_MAX) {
                        return;
                     }
                     break;
                  default:
                     if (context.entity.getBattlePos() < 0 || context.entity.getBattlePos() >= BattleMisc.FORCE_BATTLE_POS_MAX) {
                        return;
                     }
               }

               List<Entity> entityList;
               if (skillEffectModel.getTargetType() == 3) {
                  entityList = new ArrayList();
                  if (skillEffectModel.getSelectType() == 33) {
                     Entity entity = (Entity)event.getParam(2);
                     if (entity.getType() == BattleMsg.EntityType.EntityType_Hero || entity.getType() == BattleMsg.EntityType.EntityType_Friend || entity.getType() == BattleMsg.EntityType.EntityType_Monster) {
                        entityList.add(entity);
                     }
                  } else if (skillEffectModel.getSelectType() == 35) {
                     List<Entity> targets = (List)event.getParam(14);
                     if (null != targets && targets.size() != 0) {
                        for(Entity entity : targets) {
                           if (entity.getType() == BattleMsg.EntityType.EntityType_Hero || entity.getType() == BattleMsg.EntityType.EntityType_Friend || entity.getType() == BattleMsg.EntityType.EntityType_Monster) {
                              entityList.add(entity);
                           }
                        }
                     } else {
                        entityList.add((Entity)event.getParam(3));
                     }
                  } else if (skillEffectModel.getSelectType() == 34) {
                     Entity entity = (Entity)event.getParam(3);
                     if (entity.getType() == BattleMsg.EntityType.EntityType_Hero || entity.getType() == BattleMsg.EntityType.EntityType_Friend || entity.getType() == BattleMsg.EntityType.EntityType_Monster) {
                        entityList.add(entity);
                     }
                  } else if (skillEffectModel.getSelectType() == 36) {
                     List<Entity> targets = (List)event.getParam(14);
                     if (targets != null && targets.size() != 0) {
                        for(Entity entity : targets) {
                           if (entity.getType() == BattleMsg.EntityType.EntityType_Hero || entity.getType() == BattleMsg.EntityType.EntityType_Friend || entity.getType() == BattleMsg.EntityType.EntityType_Monster) {
                              entityList.add(entity);
                           }
                        }
                     } else {
                        Entity entity = (Entity)event.getParam(3);
                        if (entity.getType() == BattleMsg.EntityType.EntityType_Hero || entity.getType() == BattleMsg.EntityType.EntityType_Friend || entity.getType() == BattleMsg.EntityType.EntityType_Monster) {
                           entityList.add(entity);
                        }
                     }

                     if (entityList.size() > 0) {
                        Collections.shuffle(entityList);
                        entityList = entityList.subList(0, 1);
                     }
                  } else if (skillEffectModel.getSelectType() == 43) {
                     List<Entity> targets = (List)event.getParam(14);
                     if (targets != null && targets.size() != 0) {
                        for(Entity entity : targets) {
                           if (entity.getType() == BattleMsg.EntityType.EntityType_Hero || entity.getType() == BattleMsg.EntityType.EntityType_Friend || entity.getType() == BattleMsg.EntityType.EntityType_Monster) {
                              entityList.add(entity);
                           }
                        }
                     } else {
                        entityList.add((Entity)event.getParam(3));
                     }

                     if (entityList.size() > 0) {
                        Entity target = null;

                        for(Entity entity : entityList) {
                           if (target == null || target.getTeamPos() > entity.getTeamPos()) {
                              target = entity;
                           }
                        }

                        entityList.clear();
                        entityList.add(target);
                     }
                  } else if (skillEffectModel.getSelectType() == 52) {
                     List<Entity> targets = (List)event.getParam(14);
                     if (null != targets && targets.size() != 0) {
                        for(Entity entity : targets) {
                           if (entity.getType() == BattleMsg.EntityType.EntityType_Hero || entity.getType() == BattleMsg.EntityType.EntityType_Friend || entity.getType() == BattleMsg.EntityType.EntityType_Monster) {
                              entityList.add(entity);
                           }
                        }
                     } else {
                        entityList.add((Entity)event.getParam(3));
                     }

                     if (entityList.size() > 0) {
                        Entity target = null;

                        for(Entity entity : entityList) {
                           if (target == null || entity.getBaseProperty(2) > target.getBaseProperty(2)) {
                              target = entity;
                           }
                        }

                        entityList.clear();
                        entityList.add(target);
                     }
                  } else if (skillEffectModel.getSelectType() == 53) {
                     List<Entity> targets = (List)event.getParam(14);
                     if (null != targets && targets.size() != 0) {
                        for(Entity entity : targets) {
                           if (entity.getType() == BattleMsg.EntityType.EntityType_Hero || entity.getType() == BattleMsg.EntityType.EntityType_Friend || entity.getType() == BattleMsg.EntityType.EntityType_Monster) {
                              entityList.add(entity);
                           }
                        }
                     } else {
                        entityList.add((Entity)event.getParam(3));
                     }

                     if (entityList.size() > 0) {
                        Entity target = null;

                        for(Entity entity : entityList) {
                           if (!entity.isDead() && (target == null || (float)entity.getBaseProperty(99) / (float)entity.getBaseProperty(1) < (float)target.getBaseProperty(99) / (float)target.getBaseProperty(1))) {
                              target = entity;
                           }
                        }

                        entityList.clear();
                        if (target != null) {
                           entityList.add(target);
                        }
                     }
                  }
               } else {
                  entityList = this.entity.getScene().selectTarget(event.getAction(), this.entity, skillEffectModel.getTargetType(), skillEffectModel.getSelectType(), skillEffectModel.getSelectNum(), skillEffectModel.getSelectParam());
                  if (entityList == null || entityList.size() == 0) {
                     return;
                  }
               }

               HashSet<Object> passiveListener = (HashSet)event.getAction().getBlackboard().getSkillParam(25);
               if (passiveListener == null) {
                  passiveListener = new HashSet();
                  event.getAction().getBlackboard().addSkillParam(25, passiveListener);
               }

               boolean bUse = false;
               Entity oldTarget = (Entity)event.getAction().getBlackboard().getSkillParam(3);
               int passiveIndex = -1;
               if (!passiveListener.contains(this) && this.entity.getBattlePos() != BattleMisc.FRIEND_POS[0] && this.entity.getBattlePos() != BattleMisc.FRIEND_POS[1]) {
                  BattleMsg.S2C_Battle_Effect.Builder s2C_battle_effect = BattleMsg.S2C_Battle_Effect.newBuilder();
                  s2C_battle_effect.setEffectType(21);
                  s2C_battle_effect.setTargetBattlePos(this.entity.getBattlePos());
                  s2C_battle_effect.setEffectId(this.effectId);
                  passiveIndex = event.getAction().getBlackboard().addBattleEffect(s2C_battle_effect);
                  passiveListener.add(this);
               }

               event.getAction().getBlackboard().addSkillParam(56, this.effectId);
               event.getAction().getBlackboard().addSkillParam(57, entityList);

               for(Entity target : entityList) {
                  if (target != null && target.entityType == 0) {
                     event.getAction().getBlackboard().addSkillParam(3, target);
                     event.getAction().getBlackboard().addSkillParam(47, this);
                     boolean funcUse = EffectFuncProcessor.doFunc(event.getAction(), this.entity, target, entityList, skillEffectModel, event);
                     if (!bUse) {
                        bUse = funcUse;
                     }

                     if (bUse) {
                        this.putPassiveEffectFuncEvent(event.getAction(), this.entity, skillEffectModel, event);
                        Event passiveEffectEvent = new Event((short)48, event.getAction(), event);
                        passiveEffectEvent.addParam(2, this.entity);
                        passiveEffectEvent.addParam(3, target);
                        passiveEffectEvent.addParam(35, this.effectId);
                        event.getAction().getScene().getEventListener().pushEvent(passiveEffectEvent);
                     }
                  }
               }

               event.getAction().getBlackboard().removeSkillParam(56);
               if (entityList.size() > 0 && entityList.get(0) != null) {
                  event.getAction().getBlackboard().removeSkillParam(3000 + ((Entity)entityList.get(0)).getBattlePos());
               }

               if (bUse) {
                  if (skillEffectModel.getCoolDown() > 0) {
                     this.coolDown += skillEffectModel.getCoolDown();
                  }

                  if (skillEffectModel.getTriggerTime() > 0) {
                     ++this.triggerTime;
                  }
               }

               if (!bUse && passiveIndex != -1) {
                  event.getAction().getBlackboard().getCurEffects().removeEffects(passiveIndex);
               }

               event.getAction().getBlackboard().addSkillParam(3, oldTarget);
            }
         }
      }
   }

   public void update() {
      if (this.coolDown > 0) {
         --this.coolDown;
      }

   }

   private void putPassiveEffectFuncEvent(Action action, Entity source, SkillEffectModel model, Event event) {
      if (model.getFunc() == 47) {
         Event effectEvent = new Event((short)30, action, event);
         Entity target = (Entity)event.getParam(2);
         effectEvent.addParam(2, source);
         effectEvent.addParam(3, target);
         effectEvent.addParam(28, model.getFunc());
         action.getScene().getEventListener().pushEvent(effectEvent);
      }

   }
}
