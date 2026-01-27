package com.gzbz.battle;

import com.gzbz.protobuf.BattleMsg;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Blackboard implements Serializable {
   public static final int SKILL_BLACK_BOARD_ATTACKER = 1;
   public static final int BLACK_BOARD_TARGETS = 2;
   public static final int BLACK_BOARD_CUR_TARGET = 3;
   public static final int SKILL_BLACK_BOARD_CUR = 4;
   public static final int BLACK_BOARD_HIT = 5;
   public static final int BLACK_BOARD_RATE = 6;
   public static final int BLACK_BOARD_ALL_ENEMY_TARGETS = 7;
   public static final int BLACK_BOARD_ALL_FRIEND_TARGETS = 8;
   public static final int BLACK_BOARD_ANTI_TARGET = 9;
   public static final int BLACK_BOARD_MAIN_EFFECT_TARGETS = 10;
   public static final int BLACK_BOARD_DEATH = 11;
   public static final int BLACK_BOARD_EFFECT_EX_RATE = 12;
   public static final int BLACK_BOARD_MAIN_EFFECT_RATE = 13;
   public static final int BLACK_BOARD_EX_CONTROL_RATE = 14;
   public static final int BLACK_BOARD_SKILL_MODEL = 17;
   public static final int BLACK_BOARD_CUR_SKILL_EFFECT = 19;
   public static final int BLACK_BOARD_CUR_TARGET_INDEX = 20;
   public static final int BLACK_BOARD_CUR_SKILL_CRIT = 21;
   public static final int BLACK_BOARD_CUR_SLOT_TARGET = 22;
   public static final int BLACK_BOARD_HURT_SP_PAMAR = 23;
   public static final int BLACK_BOARD_DAMAGE_TIMES = 24;
   public static final int BLACK_BOARD_PASSIVE_LISTENER = 25;
   public static final int BLACK_BOARD_YU_VALUE = 26;
   public static final int BLACK_BOARD_TRIGGER = 27;
   public static final int BLACK_BOARD_EX_RECOVER_RATE = 28;
   public static final int BLACK_BOARD_EX_RATE_ENTITY = 29;
   public static final int BLACK_BOARD_LAST_TARGET = 30;
   public static final int BLACK_BOARD_KEEP_KILL_TARGET = 31;
   public static final int BLACK_BOARD_KEEP_KILL_PARAM = 32;
   public static final int BLACK_BOARD_TOTAL_DAMAGE_VALUE = 33;
   public static final int BLACK_BOARD_TOTAL_CUR_DAMAGE_LIMIT = 34;
   public static final int SKILL_BLACK_SKILL_END_EVENT = 35;
   public static final int BLACK_BOARD_EFFECT_RATE = 36;
   public static final int BLACK_BOARD_CUR_MAIN_EFFECT = 37;
   public static final int BLACK_BOARD_CUR_MISSED = 38;
   public static final int BLACK_BOARD_EFFECT_ADD_EX_RATE = 39;
   public static final int BLACK_BOARD_CUR_PURIFY = 40;
   public static final int BLACK_BOARD_CUR_SKILL_EFFECT_SUCCESS = 41;
   public static final int BLACK_BOARD_RECOVER_RATE_TIME = 42;
   public static final int BLACK_BOARD_PASSIVE_USE_SKILL_EVENT_TARGET = 43;
   public static final int BLACK_BOARD_BUFF_LIVEANDDIE = 44;
   public static final int BLACK_BOARD_HURT_CURE_ALL = 45;
   public static final int BLACK_BOARD_MUL_ATK_RANGE = 46;
   public static final int BLACK_BOARD_CUR_PASSIVE_EFFECT = 47;
   public static final int BLACK_BOARD_BUFF_NUM = 48;
   public static final int BLACK_BOARD_CUR_SKILL_CRIT_FLAG = 49;
   public static final int BLACK_BOARD_CUR_BUFF_SUB_CLA = 50;
   public static final int BLACK_BOARD_CUR_SKILL_CURE_CRIT = 51;
   public static final int BLACK_BOARD_BUFF_SHEN_WEI_NUM = 52;
   public static final int BLACK_BOARD_BUFF_MAGIC_ATK_EX_TARGET = 53;
   public static final int BLACK_BOARD_EFFECT_SUCCESS_TARGET = 54;
   public static final int BLACK_BOARD_CURR_PASS_ACT_EFFECTID = 55;
   public static final int BLACK_BOARD_CURR_RECOVER_HP_SURPLUS = 55;
   public static final int BLACK_BOARD_CUR_PASSIVE_EFFECT_ID = 56;
   public static final int BLACK_BOARD_CUR_TARGETS = 57;
   public static final int BLACK_BOARD_ACTION_BUILDER = 15;
   public static final int BLACK_BOARD_EFFECTS_BUILDER = 18;
   public static final int BLACK_BOARD_EFFECT_SLOT = 16;
   public static final int BATTLE_BLACK_BOARD_HIT_START = 100;
   public static final int BATTLE_BLACK_BOARD_CRIT_START = 200;
   public static final int BATTLE_BLACK_BOARD_ATTACK_VALUE = 400;
   public static final int BATTLE_BLACK_BOARD_DAMAGE_VALUE = 500;
   public static final int BATTLE_BLACK_BOARD_CURE = 700;
   public static final int BLACK_BOARD_EFFECT_RECOVER_HP = 800;
   public static final int BLACK_BOARD_SKIll_CONTROL = 100000;
   public static final int BLACK_BOARD_RATE_SUCCESS_NUM = 1000;
   public static final int BATTLE_BLACK_BOARD_REAL_ATTACK_VALUE = 1100;
   public static final int BATTLE_BLACK_BOARD_REAL_DAMAGE_VALUE = 1200;
   public static final int BATTLE_BLACK_BOARD_REAL_CRITI_VALUE = 1300;
   public static final int BLACK_BOARD_ALL_TARGETS = 1400;
   public static final int BATTLE_BLACK_BOARD_DAMAGE_VALUE_AFTER_AVERAGE = 1500;
   public static final int BLACK_BOARD_MARK_ALL_RECOVER_HP = 1600;
   public static final int BLACK_BOARD_DEAD_TARGET = 1700;
   public static final int BATTLE_BLACK_BOARD_REAL_ATTACK_VALUE_SINGLE = 1800;
   public static final int BLACK_BOARD_MUST_HIT_MARK = 1900;
   public static final int BLACK_BOARD_LINK_POSITIVE = 2000;
   public static final int BLACK_BOARD_ATTACKER_MUST_HIT_MARK = 2100;
   public static final int BATTLE_BLACK_BOARD_HURT_VALUE = 2200;
   public static final int BATTLE_BLACK_BOARD_HURT_2_CURE = 2300;
   public static final int BATTLE_BLACK_BOARD_CURE_2_HURT = 2400;
   public static final int BATTLE_BLACK_BOARD_HURT_CURE = 2500;
   public static final int BLACK_BOARD_OFFSET_HURT_TARGET = 2600;
   public static final int BATTLE_BLACK_BOARD_CUREHURT = 2700;
   public static final int BATTLE_BLACK_BOARD_HURT_TRAN_CURE = 2800;
   public static final int BATTLE_BLACK_BOARD_TARGET_BE_CRIT = 2900;
   public static final int BLACK_BOARD_FIRST_TARGET_RATE = 3000;
   public static final int BLACK_BOARD_TARGET_CUR_HP = 3100;
   public static final int BLACK_BOARD_FUNC_EVT_ADD_BUFF = 3200;
   public static final int BLACK_BOARD_TARGET_APPORTION_HURT = 3300;
   public static Logger logger = LoggerFactory.getLogger(Blackboard.class);
   private transient BattleMsg.S2C_Battle_Effects.Builder curEffects;
   private transient ArrayList<BattleMsg.S2C_Battle_Effect.Builder> lastEffect = new ArrayList();
   private HashMap<Integer, Object> skillParamsMap = new HashMap();

   public void plusSkillIntParam(int key, int value) {
      if (!this.skillParamsMap.containsKey(key)) {
         this.skillParamsMap.put(key, value);
      } else {
         Integer oldNum = (Integer)this.skillParamsMap.get(key);
         this.skillParamsMap.put(key, oldNum + value);
      }

   }

   public void plusSkillLongParam(int key, Long value) {
      if (!this.skillParamsMap.containsKey(key)) {
         this.skillParamsMap.put(key, value);
      } else {
         long oldNum = (Long)this.skillParamsMap.get(key);
         this.skillParamsMap.put(key, oldNum + value);
      }

   }

   public <T> void addSkillParam(int key, T object) {
      if (key == 18) {
         Exception e = new Exception("不允许增加这个");
         e.printStackTrace();
      } else {
         if (object != null) {
            this.skillParamsMap.put(key, object);
         } else {
            this.skillParamsMap.remove(key);
         }

      }
   }

   public <T> T getSkillParam(int key, T object) {
      return (T)(this.skillParamsMap.containsKey(key) ? this.skillParamsMap.get(key) : object);
   }

   public <T> T getSkillParam(int key) {
      return (T)this.skillParamsMap.get(key);
   }

   public <T> T removeSkillParam(int key) {
      return (T)this.skillParamsMap.remove(key);
   }

   public boolean containsKey(int key) {
      return this.skillParamsMap.containsKey(key);
   }

   public void clear() {
      this.skillParamsMap.clear();
      this.lastEffect.clear();
   }

   public int getEffectsCount() {
      TreeMap<Integer, BattleMsg.S2C_Battle_Effects.Builder> effectsMap = (TreeMap)this.getSkillParam(18);
      return effectsMap == null ? 0 : effectsMap.size();
   }

   public BattleMsg.S2C_Battle_Effects.Builder getCurEffects() {
      return this.curEffects;
   }

   public void addBattleAction(byte type, BattleMsg.S2C_Battle_Action.Builder builder) {
      builder.setActionType(type);
      this.addSkillParam(15, builder);
   }

   public void removeSlotEffects(int slot) {
      TreeMap<Integer, BattleMsg.S2C_Battle_Effects.Builder> effectsBuilderMap = (TreeMap)this.getSkillParam(18);
      if (effectsBuilderMap != null) {
         effectsBuilderMap.remove(slot);
      }
   }

   public void addBattleEffects(int slot, BattleMsg.S2C_Battle_Effects.Builder builder) {
      builder.setSlot(slot);
      this.addSkillParam(16, slot);
      TreeMap<Integer, BattleMsg.S2C_Battle_Effects.Builder> effectsMap = (TreeMap)this.getSkillParam(18);
      if (effectsMap == null) {
         effectsMap = new TreeMap();
         this.skillParamsMap.put(18, effectsMap);
      }

      if (effectsMap.containsKey(slot)) {
         BattleMsg.S2C_Battle_Effects.Builder oldBuilder = (BattleMsg.S2C_Battle_Effects.Builder)effectsMap.get(slot);
         builder.addAllEffects(oldBuilder.getEffectsList());
      }

      effectsMap.put(slot, builder);
      this.curEffects = builder;
   }

   public int addBattleEffect(BattleMsg.S2C_Battle_Effect.Builder effectBuilder) {
      int time = (Integer)this.getSkillParam(24, 1);
      effectBuilder.setTime(time);
      BattleMsg.S2C_Battle_Effects.Builder effectsBuilder = this.getCurEffects();
      if (effectsBuilder == null) {
         effectsBuilder = BattleMsg.S2C_Battle_Effects.newBuilder();
         this.addBattleEffects(-1, effectsBuilder);
      }

      effectsBuilder.addEffects(effectBuilder);
      return effectsBuilder.getEffectsCount() - 1;
   }

   public void addLastEffect(BattleMsg.S2C_Battle_Effect.Builder effectBuilder) {
      this.lastEffect.add(effectBuilder);
   }

   private void _endBattleEffects() {
      BattleMsg.S2C_Battle_Action.Builder actionBuilder = (BattleMsg.S2C_Battle_Action.Builder)this.getSkillParam(15);
      if (actionBuilder != null) {
         for(BattleMsg.S2C_Battle_Effect.Builder builder : this.lastEffect) {
            this.addBattleEffect(builder);
         }

         TreeMap<Integer, BattleMsg.S2C_Battle_Effects.Builder> effectsBuilderMap = (TreeMap)this.getSkillParam(18);
         if (effectsBuilderMap != null && effectsBuilderMap.size() != 0) {
            BattleMsg.S2C_Battle_Effects.Builder pre = (BattleMsg.S2C_Battle_Effects.Builder)effectsBuilderMap.remove(-1);
            if (pre != null) {
               actionBuilder.addEffectes(pre);
            }

            BattleMsg.S2C_Battle_Effects.Builder post = (BattleMsg.S2C_Battle_Effects.Builder)effectsBuilderMap.remove(-2);

            for(BattleMsg.S2C_Battle_Effects.Builder effectsBuilder : effectsBuilderMap.values()) {
               if (effectsBuilder.getEventEffectsCount() > 0 || effectsBuilder.getEffectsCount() > 0 || effectsBuilder.getBattlePosCount() > 0) {
                  actionBuilder.addEffectes(effectsBuilder);
               }
            }

            if (post != null) {
               actionBuilder.addEffectes(post);
            }

            this.skillParamsMap.remove(18);
         }
      }
   }

   private boolean _checkEffectes() {
      BattleMsg.S2C_Battle_Action.Builder builder = (BattleMsg.S2C_Battle_Action.Builder)this.getSkillParam(15);
      if (builder.getEffectesCount() == 0) {
         return false;
      } else {
         for(int i = 0; i < builder.getEffectesCount(); ++i) {
            BattleMsg.S2C_Battle_Effects effectsBuild = builder.getEffectes(i);
            if (effectsBuild.getEffectsCount() > 0) {
               return true;
            }

            if (effectsBuild.getEventEffectsCount() > 0) {
               return true;
            }
         }

         return false;
      }
   }

   public BattleMsg.S2C_Battle_Action.Builder buildActionBuilder() {
      this._endBattleEffects();
      if (this._checkEffectes()) {
         BattleMsg.S2C_Battle_Action.Builder builder = (BattleMsg.S2C_Battle_Action.Builder)this.getSkillParam(15);
         return builder;
      } else {
         return null;
      }
   }

   public boolean checkBattlePos() {
      if (this.curEffects == null) {
         return false;
      } else {
         return this.curEffects.getBattlePosCount() != 0;
      }
   }
}
