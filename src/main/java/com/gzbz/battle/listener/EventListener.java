package com.gzbz.battle.listener;

import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.action.Action;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.scene.BattleScene;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.collections4.MapUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EventListener implements Serializable {
   static Logger logger = LoggerFactory.getLogger(EventListener.class);
   private BattleScene scene;
   private HashMap<Listener, Integer> listenerRecord = new HashMap();
   public ConcurrentHashMap<Short, ConcurrentHashMap<Short, ConcurrentHashMap<Byte, ConcurrentHashMap<Listener, HashSet<ListenerContext>>>>> listenerMap = new ConcurrentHashMap();

   public EventListener(BattleScene scene) {
      this.scene = scene;
   }

   public void addListener(Listener listener, ListenerContext context, byte checkDead) {
      this.addListener(listener, context, (byte)0, checkDead);
   }

   public void addListener(Listener listener, ListenerContext context, byte priority, byte checkDead) {
      ConcurrentHashMap<Short, ConcurrentHashMap<Byte, ConcurrentHashMap<Listener, HashSet<ListenerContext>>>> subMap = (ConcurrentHashMap)this.listenerMap.computeIfAbsent(context.type, (k) -> new ConcurrentHashMap());
      ConcurrentHashMap<Byte, ConcurrentHashMap<Listener, HashSet<ListenerContext>>> typeListenerMap = (ConcurrentHashMap)subMap.computeIfAbsent(context.subCls, (k) -> new ConcurrentHashMap());
      ConcurrentHashMap<Listener, HashSet<ListenerContext>> priorityMap = (ConcurrentHashMap)typeListenerMap.computeIfAbsent(priority, (k) -> new ConcurrentHashMap());
      HashSet<ListenerContext> contextSet = (HashSet)priorityMap.computeIfAbsent(listener, (k) -> new HashSet());
      contextSet.add(context);
   }

   public ListenerContext addListener(Entity entity, Listener listener, short type, int param, String exParams, byte checkDead, short sub, int rate, byte force) {
      ListenerContext context = new ListenerContext();
      context.type = type;
      context.entity = entity;
      context.listener = listener;
      context.param = param;
      context.checkDead = checkDead;
      context.exParams = exParams;
      context.subCls = sub;
      context.rate = rate;
      context.force = force;
      this.addListener(listener, context, checkDead);
      return context;
   }

   public ListenerContext addListener(Entity entity, Listener listener, short type, byte priority, int param, String exParams, byte checkDead, short sub, int rate, byte force) {
      ListenerContext context = new ListenerContext();
      context.type = type;
      context.entity = entity;
      context.listener = listener;
      context.param = param;
      context.checkDead = checkDead;
      context.exParams = exParams;
      context.subCls = sub;
      context.rate = rate;
      context.force = force;
      this.addListener(listener, context, priority, checkDead);
      return context;
   }

   public void removeListener(Listener listener) {
      for(ConcurrentHashMap<Short, ConcurrentHashMap<Byte, ConcurrentHashMap<Listener, HashSet<ListenerContext>>>> typeMap : this.listenerMap.values()) {
         for(ConcurrentHashMap<Byte, ConcurrentHashMap<Listener, HashSet<ListenerContext>>> subMap : typeMap.values()) {
            for(ConcurrentHashMap<Listener, HashSet<ListenerContext>> map : subMap.values()) {
               map.remove(listener);
            }
         }
      }

   }

   public void pushEvent(Event event) {
      Action action = event.getAction();
      if (action.getType() != 21 && action.getType() != 20 && action.getType() != 22 || event.getType() == 16 || event.getType() == 5 || event.getType() == 7) {
         if ((event.getType() == 4 || event.getType() == 12) && (Boolean)action.getBlackboard().getSkillParam(45, false)) {
            action.getBlackboard().removeSkillParam(45);
         } else if (event.getTriggerLayer() <= 5) {
            ConcurrentHashMap<Short, ConcurrentHashMap<Byte, ConcurrentHashMap<Listener, HashSet<ListenerContext>>>> subMap = (ConcurrentHashMap)this.listenerMap.get(event.getType());
            if (!MapUtils.isEmpty(subMap)) {
               event.getAction().getBlackboard().addSkillParam(27, true);
               ConcurrentHashMap<Short, ListenerArgs> subTypeArgsMap = new ConcurrentHashMap();

               for(Map.Entry<Short, ConcurrentHashMap<Byte, ConcurrentHashMap<Listener, HashSet<ListenerContext>>>> subEntry : subMap.entrySet()) {
                  ConcurrentHashMap<Byte, ConcurrentHashMap<Listener, HashSet<ListenerContext>>> map = (ConcurrentHashMap)subMap.get(subEntry.getKey());
                  if (MapUtils.isEmpty(map)) {
                     break;
                  }

                  for(byte i = 1; i >= 0; --i) {
                     ConcurrentHashMap<Listener, HashSet<ListenerContext>> priorityEntry = (ConcurrentHashMap)map.get(i);
                     if (priorityEntry != null && priorityEntry.size() != 0) {
                        for(Map.Entry<Listener, HashSet<ListenerContext>> entry : priorityEntry.entrySet()) {
                           Listener listener = (Listener)entry.getKey();
                           if (this.checkRecord(listener)) {
                              for(ListenerContext context : (HashSet)entry.getValue()) {
                                 if ((Short)subEntry.getKey() > 0 && this._checkListen(event, listener, context)) {
                                    if (Math.random() * (double)10000.0F < (double)context.rate) {
                                       ListenerArgs args = (ListenerArgs)subTypeArgsMap.get(subEntry.getKey());
                                       if (null == args) {
                                          args = new ListenerArgs();
                                          subTypeArgsMap.put(subEntry.getKey(), args);
                                       }

                                       args.listContext.add(context);
                                       args.listList.add(listener);
                                    }
                                 } else if (this._checkListen(event, listener, context)) {
                                    this.addRecord(listener);
                                    listener.listen(event, context);
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               for(Map.Entry<Short, ListenerArgs> entry : subTypeArgsMap.entrySet()) {
                  ArrayList<ListenerContext> listContext = ((ListenerArgs)entry.getValue()).listContext;
                  ArrayList<Listener> listList = ((ListenerArgs)entry.getValue()).listList;
                  if (listContext != null && listContext.size() > 0) {
                     if ((Short)entry.getKey() == 100) {
                        Collections.sort(listContext, new Comparator<ListenerContext>() {
                           public int compare(ListenerContext o1, ListenerContext o2) {
                              return -((int)(o1.entity.getSpeed() - o2.entity.getSpeed()));
                           }
                        });

                        for(int i = 0; i < listContext.size(); ++i) {
                           ListenerContext ctx = (ListenerContext)listContext.get(i);
                           Listener lister = ctx.listener;
                           this.addRecord(lister);
                           lister.listen(event, ctx);
                        }
                     } else {
                        int index = (int)((double)listContext.size() * Math.random());
                        ListenerContext context = (ListenerContext)listContext.get(index);
                        Listener listenerTmp = (Listener)listList.get(index);
                        this.addRecord(listenerTmp);
                        listenerTmp.listen(event, context);
                     }
                  }
               }

               event.getAction().getBlackboard().addSkillParam(27, false);
               this.scene.getPKTeam((byte)0).clearPassiveSkill();
               this.scene.getPKTeam((byte)1).clearPassiveSkill();
            }
         }
      }
   }

   protected boolean _checkListen(Event event, Listener listener, ListenerContext context) {
      if (Objects.nonNull(context.entity)) {
         if (context.force == 0 && context.entity.getStateManager().checkState((short)17)) {
            return false;
         }

         if ((context.entity.getBattlePos() < 0 || context.entity.getBattlePos() >= BattleMisc.FORCE_BATTLE_POS_MAX) && context.entity.getBattlePos() != BattleMisc.FRIEND_POS[0] && context.entity.getBattlePos() != BattleMisc.FRIEND_POS[1]) {
            return false;
         }

         if (context.checkDead == 0 && (context.entity.isDead() || context.entity.getStateManager().checkState((short)21))) {
            return false;
         }
      }

      if (context.checker == null) {
         ListenerChecker checker = CheckerFactory.getChecker(context.type);
         if (checker == null || checker.check(event, context)) {
            return true;
         }
      } else if (context.checker.check(event, context)) {
         return true;
      }

      return false;
   }

   protected void addRecord(Listener listener) {
      Integer value = (Integer)this.listenerRecord.get(listener);
      if (Objects.isNull(value)) {
         this.listenerRecord.put(listener, 1);
      } else {
         this.listenerRecord.put(listener, value + 1);
      }

   }

   protected boolean checkRecord(Listener listener) {
      Integer value = (Integer)this.listenerRecord.get(listener);
      if (value == null) {
         return true;
      } else {
         return value < 99;
      }
   }

   public void clearRecord() {
      this.listenerRecord.clear();
   }

   public void update() {
   }

   class ListenerArgs {
      ArrayList<ListenerContext> listContext = new ArrayList();
      ArrayList<Listener> listList = new ArrayList();
   }
}
