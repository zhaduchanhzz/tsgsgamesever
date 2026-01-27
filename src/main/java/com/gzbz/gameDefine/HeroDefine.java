package com.gzbz.gameDefine;

import com.gzbz.protobuf.CommonMsg;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HeroDefine {
   public static final int HERO_HP_MAX = 1;
   public static final int HERO_ATTACK = 2;
   public static final int HERO_DEFENCE = 3;
   public static final int HERO_SPEED = 4;
   public static final int HERO_CRITI = 5;
   public static final int HERO_CRITI_DMG = 6;
   public static final int HERO_CRITI_RESIST = 7;
   public static final int HERO_HIT = 8;
   public static final int HERO_DODGE = 9;
   public static final int HERO_DMG_INC = 10;
   public static final int HERO_DMG_RESIST = 11;
   public static final int HERO_DMG_PHYSICS = 12;
   public static final int HERO_DMG_MAGIC = 13;
   public static final int HERO_IMMUNE_PHYSICS = 14;
   public static final int HERO_IMMUNE_MAGIC = 15;
   public static final int HERO_CONTROL = 16;
   public static final int HERO_CONTROL_RESIST = 17;
   public static final int HERO_CURE = 18;
   public static final int HERO_BE_CURE = 19;
   public static final int HERO_TENACITY = 20;
   public static final int HERO_REIGN = 21;
   public static final int HERO_INTELLIGENCE = 22;
   public static final int HERO_ARMOR_BREAK = 23;
   public static final int HERO_CURE_CRITI = 24;
   public static final int HERO_CURE_CRITI_DMG = 25;
   public static final int HERO_ANTI_ACK = 26;
   public static final int HERO_ORIGINAL_HP_MAX = 98;
   public static final int HERO_CUR_HP = 99;
   public static final int HERO_MUST_CRITI = 100;
   public static final int HERO_MUST_NO_CRITI = 101;
   public static final int HERO_BE_DMG_INC = 102;
   public static final Set<Integer> HERO_JOB = new HashSet();
   public static HashMap<Integer, String> map = new HashMap();
   public static final int HERO_UPSTAR_MIN_STAR = 4;
   public static final int[][] HERO_RECRUITMENT;
   public static final int HERO_EMPLOYEE_TYPE_9 = 9;
   public static final int HERO_EMPLOYEE_TYPE_10 = 10;
   public static final String LANGUAGE_SENIORRECRUITMENT = "SeniorRecruitment";
   public static final String LANGUAGE_SENIORRECRUITMENT_DEEP = "SeniorRecruitment_deep";
   public static final String LANGUAGE_WECHAT_TITLE = "wechat_titel";
   public static final String LANGUAGE_WECHAT_CONTENT = "wechat_content";
   public static final String SCORE_TOTAL = "1";
   public static final String SCORE_HERO_LV = "2";
   public static final String SCORE_EQUOIP = "3";
   public static final String SCORE_HERO_STAR = "4";
   public static final String SCORE_HERO_BREACH = "5";
   public static final String SCORE_ARMYADVISER = "6";
   public static final String SCORE_UNION = "7";
   public static final String SCORE_WARRIOR_SIGNET = "8";
   public static final int OP_WEAR = 1;
   public static final int OP_CHANGE = 2;
   public static final int OP_TAKE_OFF = 3;
   public static final int OP_QUICK_WEAR = 4;
   public static final int OP_QUICK_TAKE_OFF = 5;
   public static final int OP_RECAST = 6;
   public static final int OP_COMPOSE = 7;
   public static final int OP_UPGRADE = 8;
   public static final int OP_STRONG = 9;
   public static final int OP_CLEAR = 10;
   public static final int OP_FORGET = 11;
   public static final int OP_UNLOCK = 12;
   public static final int OP_REBIRTH = 13;
   public static final int OP_EXCHANGE = 14;
   public static final int OP_RECALL = 15;
   public static final int RECALL_STAR = 9;
   public static final int SHRINE_REBIRTH = 1;
   public static final int SHRINE_EXCHANGE = 2;
   public static final int SHRINE_RECALL = 3;
   public static final int SOUL_SHRINE_REBIRTH = 4;
   public static final int SOUL_SHRINE_EXCHANGE = 5;
   public static final int SOUL_SHRINE_RECALL = 6;
   public static long ALL_STATES;
   public static long ARRAYING_STATES;
   public static int HERO_SP_TYPE_KING;
   public static int HERO_SP_TYPE_PALACE;
   public static int HERO_SP_TYPE_LINK;
   public static int MONSTER_TYPE_CONSUME;
   public static int HERO_DRESS_TYPE_COMMON;
   public static int HERO_DRESS_TYPE_AWAKEN;
   public static int HERO_DRESS_TYPE_PALACE;
   public static int HERO_DRESS_TYPE_COLLECTION;
   public static int PALACE_SKILL_NO;
   public static int PALACE_SKILL_YES;
   public static int PALACE_HERO_SKILL_NUM;
   public static int PALACE_DESTINY_SKILL_NUM;
   public static int HERO_JOB_ATTACK;
   public static int HERO_JOB_DEFEND;
   public static int HERO_JOB_CLEVER;
   public static int HERO_JOB_SUPPORT;

   static {
      map.put(1, "hp");
      map.put(2, "attack");
      map.put(3, "defence");
      map.put(4, "speed");
      map.put(5, "criti");
      map.put(6, "criti_dmg");
      map.put(7, "criti_resist");
      map.put(8, "hit");
      map.put(9, "dodge");
      map.put(10, "dmg_inc");
      map.put(11, "dmg_resist");
      map.put(12, "dmg_physics");
      map.put(13, "dmg_magic");
      map.put(14, "immune_physics");
      map.put(15, "immune_magic");
      map.put(16, "control");
      map.put(17, "control_resist");
      map.put(18, "cure");
      map.put(19, "be_cure");
      map.put(20, "tenacity");
      map.put(21, "reign");
      map.put(22, "intelligence");
      map.put(23, "armor_break");
      map.put(24, "cure_crit");
      map.put(25, "cure_cridmg");
      HERO_RECRUITMENT = new int[][]{{1, 2}, {5, 6}, {3, 4}, {7, 8}};
      ALL_STATES = 0L;
      ARRAYING_STATES = 0L;
      HERO_SP_TYPE_KING = 1;
      HERO_SP_TYPE_PALACE = 2;
      HERO_SP_TYPE_LINK = 3;
      MONSTER_TYPE_CONSUME = 2;

      for(CommonMsg.HeroState value : CommonMsg.HeroState.values()) {
         if (value.getNumber() >= 0 && value.getNumber() <= 63) {
            switch (value) {
               default:
                  ALL_STATES |= 1L << value.getNumber();
            }
         }
      }

      for(CommonMsg.HeroStateArraying value : CommonMsg.HeroStateArraying.values()) {
         if (value.getNumber() >= 0 && value.getNumber() <= 63) {
            switch (value) {
               default:
                  ARRAYING_STATES |= 1L << value.getNumber();
            }
         }
      }

      HERO_DRESS_TYPE_COMMON = 1;
      HERO_DRESS_TYPE_AWAKEN = 2;
      HERO_DRESS_TYPE_PALACE = 3;
      HERO_DRESS_TYPE_COLLECTION = 4;
      PALACE_SKILL_NO = 0;
      PALACE_SKILL_YES = 1;
      PALACE_HERO_SKILL_NUM = 4;
      PALACE_DESTINY_SKILL_NUM = 2;
      HERO_JOB_ATTACK = 1;
      HERO_JOB_DEFEND = 2;
      HERO_JOB_CLEVER = 3;
      HERO_JOB_SUPPORT = 4;
   }

   public static enum HeroPropertyModel {
      MODEL_HERO,
      MODEL_HERO_UP_LV,
      MODEL_HERO_UP_STAR,
      MODEL_HERO_UP_BREACH,
      MODEL_WEAR_EQUIP,
      MODEL_WEAR_WARCRAFT,
      MODEL_WEAR_WARRIORSIGNET,
      MODEL_UNION_SKILL,
      MODEL_UNION_ACTIVITY,
      MODEL_ARTIFACT_STRONGLV,
      MODEL_ARTIFACT_REFINEL,
      MODEL_ARTIFACT_SOUL,
      MODEL_ARTIFACT_DRESSID,
      MODEL_ARTIFACT_TITLE,
      MODEL_TREASURE_LEVEL,
      MODEL_TREASURE_STAR,
      MODEL_DIVINE_GENERALS,
      MODEL_TONGQUE,
      MODEL_TOTEM,
      MODEL_EQUIP_CAST_SOUL,
      MODEL_HERO_DRESS,
      MODEL_JUYIHALL_TECH,
      MODEL_WEAR_ORNAMENT,
      MODEL_WEAR_WAR_FALG,
      MODEL_RUNE_STONE,
      MODEL_HERO_TALENT,
      MODEL_JUYIHALL_HELL,
      MODEL_AIDE,
      MODEL_EXCLUSIVE_TREASURE,
      MODEL_RUNE,
      MODEL_PET,
      MODEL_DRAGON_STRENGTHEN,
      MODEL_WAR_HORSE,
      MODEL_HERO_DRESS_ARCIHVE,
      MODULE_MAGIC_BOOK_LV_UP,
      MODULE_MAGIC_BOOK_STAGE_UP,
      MODULE_MAGIC_SKILL_LV_UP,
      MODULE_MAGIC_SKILL_ARRAYING,
      MODEL_EQUIP_STRENGTH,
      MODULE_HERO_PALACE,
      MODULE_DUEL_JADE,
      MODULE_ARMY_ARRAY,
      MODULE_KING_CONTROL,
      MODULE_KING_CONTROL_NOT_ARRAYING,
      MODULE_STAR_MAP,
      MODEL_GOD_BEAST,
      MODEL_WORLD_PAINT,
      MODEL_EXCLUSIVE_WEAPON,
      MODEL_EXCLUSIVE_WEAPON_LIB,
      MODEL_SOUL_PALACE,
      MODEL_ZHU_HOU,
      MODEL_DRAGON_VEIN,
      MODEL_ALL;
   }

   public static enum DelHeroType {
      DEL_USE,
      SACRIFICE,
      REBORN,
      INVALID,
      UNDRESS_ALL;
   }

   public static enum DelHeroReturnShowType {
      DEL_USE,
      SACRIFICE,
      REBORN,
      RECALL;
   }
}
