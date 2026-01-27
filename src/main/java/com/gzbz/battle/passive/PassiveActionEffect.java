package com.gzbz.battle.passive;

import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.action.ActionFactory;
import com.gzbz.battle.action.AntiAtkAction;
import com.gzbz.battle.action.ContinueAtkAction;
import com.gzbz.battle.action.KeepAnyAtkAction;
import com.gzbz.battle.action.KeepAtkAction;
import com.gzbz.battle.action.KeepKillAction;
import com.gzbz.battle.action.PassiveSkillAction;
import com.gzbz.battle.condition.ConditionProcessor;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.EntitySkill;
import com.gzbz.battle.listener.Event;
import com.gzbz.battle.listener.ListenerContext;
import com.gzbz.model.SkillEffectModel;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import misc.LinkList;
import misc.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PassiveActionEffect extends PassiveSkillEffect {
   static Logger logger = LoggerFactory.getLogger(PassiveSkillMgr.class);

   public void listen(Event event, ListenerContext context) {
      SkillEffectModel model = (SkillEffectModel)ApplicationContextProvider.getModelPoolEntity("skillEffect", this.effectId);
      switch (model.onTriggerScene) {
         case 1:
            if (this.entity.getBattlePos() != BattleMisc.FRIEND_POS[0] && this.entity.getBattlePos() != BattleMisc.FRIEND_POS[1]) {
               return;
            }
         case 2:
            if (this.entity.getOriginalPos() != BattleMisc.FRIEND_POS[0] && this.entity.getOriginalPos() != BattleMisc.FRIEND_POS[1]) {
               return;
            }
            break;
         default:
            if (context.entity.getBattlePos() < 0 || context.entity.getBattlePos() >= BattleMisc.FORCE_BATTLE_POS_MAX) {
               return;
            }
      }

      if (this.coolDown <= 0) {
         if (model.getTriggerTime() == 0 || this.triggerTime < model.getTriggerTime()) {
            if (!this.entity.isDead() && !this.entity.getStateManager().checkState((short)1) && !this.entity.getStateManager().checkState((short)11)) {
               Entity source = (Entity)event.getParam(2);
               Integer actionType = (Integer)model.getFuncParam().get("actionType");
               byte triggerType = actionType.byteValue();
               int rate = model.getRate();
               if (event.getAction().getType() == 42 && triggerType == 41) {
                  rate = (int)((float)rate * ApplicationContextProvider.getConfigFloat("antiAtkKeepAtkRate", 0.5F));
               }

               if (event.getParam(11) != null && (Short)event.getParam(11) == 6) {
                  rate = (int)((float)rate * ApplicationContextProvider.getConfigFloat("antiAtkKeepAtkRate", 0.5F));
               }

               if (ConditionProcessor.checkCondition(event.getAction(), model.getConditionType(), model.getConditions(), this.entity, source, event)) {
                  if (event.getAction().getType() != 50) {
                     if (event.getAction().getType() != 43 && event.getAction().getType() != 42 || triggerType == 41) {
                        boolean bTrigger = false;
                        if (4 == event.getAction().getType()) {
                           bTrigger = true;
                        } else if ((45 == event.getAction().getType() || 44 == event.getAction().getType()) && triggerType == 41) {
                           bTrigger = true;
                        } else if (43 != event.getAction().getType() || triggerType != 41 && triggerType != 46) {
                           if (42 == event.getAction().getType() && triggerType == 41) {
                              bTrigger = true;
                           }
                        } else {
                           bTrigger = true;
                        }

                        LinkList<Action> listAction = event.getAction().getScene().getActionManager().getActionList();
                        boolean findSame = false;
                        ArrayList<Action> actionsList = new ArrayList();
                        listAction.forEach((node) -> {
                           Action data = (Action)node.data;
                           if ((41 == triggerType || 42 == triggerType || 44 == triggerType || 45 == triggerType || 46 == triggerType) && data.getEntity() == this.entity) {
                              actionsList.add(data);
                              return true;
                           } else {
                              return false;
                           }
                        });
                        if ((41 == triggerType || 46 == triggerType) && actionsList.size() > 1 || 41 != triggerType && 46 != triggerType && actionsList.size() > 0) {
                           boolean continueAntiAtk = this.continueAntiAtkCheck(model, actionsList, this.entity);
                           if (!continueAntiAtk) {
                              return;
                           }
                        }

                        if (bTrigger) {
                           if (RandomUtil.randInt(10000) <= rate) {
                              Integer actionDamageRate = (Integer)model.getFuncParam().get("damageRate");
                              Integer actionControlRate = (Integer)model.getFuncParam().get("controlRate");
                              Integer actionRecoverRate = (Integer)model.getFuncParam().get("recoverRate");
                              Integer actionReviveRate = (Integer)model.getFuncParam().get("reviveRate");
                              Action action;
                              if (actionType.byteValue() == 48) {
                                 action = ActionFactory.getAction(this.entity.getScene(), (byte)41);
                              } else if (actionType.byteValue() == 51) {
                                 action = ActionFactory.getAction(this.entity.getScene(), (byte)43);
                              } else {
                                 action = ActionFactory.getAction(this.entity.getScene(), actionType.byteValue());
                              }

                              Action curAction = action.getScene().getActionManager().getCurAction();
                              Entity attacker = (Entity)curAction.getBlackboard().getSkillParam(1);
                              if (Objects.nonNull(attacker)) {
                                 action.getBlackboard().addSkillParam(55, this.effectId);
                                 if (triggerType == 50 && source == this.entity) {
                                    KeepAnyAtkAction keepAtkAction = (KeepAnyAtkAction)action;
                                    Integer skillSlot = (Integer)model.getFuncParam().get("skillSlot");
                                    keepAtkAction.setSourceEntity(this.entity, skillSlot, actionDamageRate, actionControlRate, actionRecoverRate);
                                    keepAtkAction.setPriority((byte)4);
                                    action.setEntity(this.entity);
                                    this.entity.getScene().getActionManager().addAction(action);
                                 } else if (triggerType == 51 && source == this.entity) {
                                    ContinueAtkAction continueAtkAction = (ContinueAtkAction)action;
                                    if (source != this.entity || curAction.getType() == 43) {
                                       return;
                                    }

                                    continueAtkAction.setSkill((EntitySkill)event.getAction().getBlackboard().getSkillParam(4, (Object)null), actionDamageRate, actionControlRate, actionRecoverRate, actionReviveRate);
                                    continueAtkAction.setPriority((byte)2);
                                    action.setEntity(this.entity);
                                    this.entity.getScene().getActionManager().addAction(action);
                                 } else {
                                    long damage = (Long)curAction.getBlackboard().getSkillParam(400 + attacker.getBattlePos(), 0L);
                                    if (damage != 0L) {
                                       if (this.entity.getBattlePos() != BattleMisc.FRIEND_POS[0] && this.entity.getBattlePos() != BattleMisc.FRIEND_POS[1]) {
                                          BattleMsg.S2C_Battle_Effect.Builder s2C_battle_effect = BattleMsg.S2C_Battle_Effect.newBuilder();
                                          s2C_battle_effect.setEffectType(21);
                                          s2C_battle_effect.setTargetBattlePos(this.entity.getBattlePos());
                                          s2C_battle_effect.setEffectId(this.effectId);
                                          event.getAction().getBlackboard().addBattleEffect(s2C_battle_effect);
                                       }

                                       switch (triggerType) {
                                          case 41:
                                             if (source != this.entity) {
                                                return;
                                             }

                                             KeepAtkAction keepAtkAction = (KeepAtkAction)action;
                                             keepAtkAction.setSourceEntity(this.entity, actionDamageRate, actionControlRate, actionRecoverRate);
                                             keepAtkAction.setPriority((byte)4);
                                             keepAtkAction.setEvent(event);
                                             keepAtkAction.setTriggerType(triggerType);
                                             action.setEntity(this.entity);
                                             this.entity.getScene().getActionManager().addAction(action);
                                             break;
                                          case 42:
                                             List<Entity> blackBroad = (List)event.getAction().getBlackboard().getSkillParam(7, (Object)null);
                                             boolean ignore = false;
                                             if ((context.type == 15 || context.type == 32 || context.type == 35) && (context.param == 13 || context.param == 19) && blackBroad != null && source != this.entity) {
                                                ignore = true;
                                             }

                                             if ((blackBroad == null || !blackBroad.contains(this.entity) || source == this.entity) && !ignore) {
                                                return;
                                             }

                                             if (!this.entity.getStateManager().checkState((short)12) && !this.entity.getStateManager().checkState((short)16) && source.entityType == 0) {
                                                AntiAtkAction antiAtkAction = (AntiAtkAction)action;
                                                Integer skillSlot = (Integer)model.getFuncParam().get("skillId");
                                                antiAtkAction.setTargetEntity(source, actionDamageRate, actionControlRate, actionRecoverRate, skillSlot != null ? skillSlot : 0, this.effectId);
                                                antiAtkAction.setPriority((byte)3);
                                                Integer useNewSkill = (Integer)model.getFuncParam().get("useNewSkill");
                                                if (useNewSkill != null && useNewSkill == 1) {
                                                   antiAtkAction.setUseNewSkill(true);
                                                }

                                                action.setEntity(this.entity);
                                                this.entity.getScene().getActionManager().addAction(action);
                                             }
                                             break;
                                          case 43:
                                          case 51:
                                             ContinueAtkAction continueAtkAction = (ContinueAtkAction)action;
                                             if (source != this.entity || curAction.getType() == 43) {
                                                return;
                                             }

                                             continueAtkAction.setSkill((EntitySkill)event.getAction().getBlackboard().getSkillParam(4, (Object)null), actionDamageRate, actionControlRate, actionRecoverRate, actionReviveRate);
                                             continueAtkAction.setPriority((byte)2);
                                             action.setEntity(this.entity);
                                             this.entity.getScene().getActionManager().addAction(action);
                                             break;
                                          case 44:
                                             PassiveSkillAction passiveSkillAction = (PassiveSkillAction)action;
                                             Integer skillId = (Integer)model.getFuncParam().get("skillId");
                                             passiveSkillAction.setAction(this.entity, skillId, 10000, event);
                                             this.entity.getScene().getActionManager().addAction(action);
                                             break;
                                          case 45:
                                          case 47:
                                          case 49:
                                          case 50:
                                          default:
                                             logger.info("无法找到合适的action");
                                             break;
                                          case 46:
                                             if (source != this.entity) {
                                                return;
                                             }

                                             KeepKillAction keepKillAction = (KeepKillAction)action;
                                             ArrayList targets = (ArrayList)event.getParam(14);
                                             if (targets == null || targets.size() == 0) {
                                                return;
                                             }

                                             keepKillAction.setSourceEntity(this.entity, targets, actionDamageRate, actionControlRate, actionRecoverRate, context.exParams);
                                             keepKillAction.setPriority((byte)4);
                                             action.setEntity(this.entity);
                                             this.entity.getScene().getActionManager().addAction(action);
                                             break;
                                          case 48:
                                             KeepAtkAction keepAtkAction1 = (KeepAtkAction)action;
                                             keepAtkAction1.setSourceEntity(this.entity, actionDamageRate, actionControlRate, actionRecoverRate);
                                             keepAtkAction1.setPriority((byte)4);
                                             keepAtkAction1.setTriggerType(triggerType);
                                             keepAtkAction1.setEvent(event);
                                             action.setEntity(this.entity);
                                             this.entity.getScene().getActionManager().addAction(action);
                                       }
                                    }
                                 }
                              }

                              if (model.getCoolDown() > 0) {
                                 this.coolDown += model.getCoolDown();
                              }

                              if (model.getTriggerTime() > 0) {
                                 ++this.triggerTime;
                              }

                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public boolean continueAntiAtkCheck(SkillEffectModel model, ArrayList<Action> actionsList, Entity entity) {
      Integer effectId = (Integer)model.getFuncParam().get("effectId");
      if (effectId == null) {
         return false;
      } else {
         AntiAtkAction antiAtkAction = null;

         for(Action action : actionsList) {
            if (action.getType() == 42) {
               antiAtkAction = (AntiAtkAction)action;
               break;
            }
         }

         if (antiAtkAction == null) {
            return false;
         } else if (antiAtkAction.getEffectId() == null) {
            return false;
         } else {
            return antiAtkAction.getEntity() == entity && effectId == antiAtkAction.getEffectId();
         }
      }
   }
}
