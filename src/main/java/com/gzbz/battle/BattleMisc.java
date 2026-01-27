package com.gzbz.battle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class BattleMisc implements Serializable {
   public static byte FORCE_BATTLE_POS_MAX = 10;
   public static Byte[][] FORCE_BATTLE_POS = new Byte[][]{{4, 3, 2, 1, 0}, {6, 5, 9, 8, 7}};
   public static Byte[] WEAPON_BATTLE_POS = new Byte[]{10, 11};
   public static Byte[] FRIEND_POS = new Byte[]{12, 13};
   public static Byte[] BEAUTY_POS = new Byte[]{14, 15};
   public static Byte[] DRAGON_POS = new Byte[]{16, 17};
   public static Byte[][] PET_POS = new Byte[][]{{18, 19, 20}, {21, 22, 23}};
   public static Byte[][] BATTLE_LINE = new Byte[][]{{0, 1}, {2, 3, 4}};
   public static HashMap<Byte, HashMap<Byte, HashSet<Byte>>> ROW_SET = new HashMap();
   public static byte FORCE_FRIEND_TEAM_POS = 5;
   public static HashSet<Short> HURT_FUN_DEFINE = new HashSet();
   public static HashSet<Byte> CONTROL_BUF_DEFINE = new HashSet();
   public static HashSet<Short> CURE_FUN_DEFINE = new HashSet();

   public static byte oppositionForce(byte force) {
      return (byte)(force == 0 ? 1 : 0);
   }

   public static boolean isHurtFun(short fun) {
      return HURT_FUN_DEFINE.contains(fun);
   }

   public static boolean isCureFun(short fun) {
      return CURE_FUN_DEFINE.contains(fun);
   }

   public static boolean isControlBuf(byte buf) {
      return CONTROL_BUF_DEFINE.contains(buf);
   }

   public static byte convertBattlePos(byte force, int teamPos) {
      return FORCE_BATTLE_POS[force][teamPos];
   }

   public static boolean isMultiplyProperty(int property) {
      return property == 11 || property == 14 || property == 15 || property == 23;
   }

   public static byte getWeaponPos(byte force) {
      return WEAPON_BATTLE_POS[force];
   }

   public static byte getFriendPos(byte force) {
      return FRIEND_POS[force];
   }

   public static byte getBeautyPos(byte force) {
      return BEAUTY_POS[force];
   }

   public static byte getDragonPos(byte force) {
      return DRAGON_POS[force];
   }

   public static List<Byte> getLine(byte line) {
      ArrayList<Byte> lineList = new ArrayList();

      for(int i = 0; i < BATTLE_LINE[line].length; ++i) {
         lineList.add(BATTLE_LINE[line][i]);
      }

      return lineList;
   }

   public static Byte[] getPetPos(byte force) {
      return PET_POS[force];
   }

   static {
      HURT_FUN_DEFINE.add(Short.valueOf((short)1));
      HURT_FUN_DEFINE.add(Short.valueOf((short)2));
      HURT_FUN_DEFINE.add(Short.valueOf((short)5));
      HURT_FUN_DEFINE.add(Short.valueOf((short)8));
      HURT_FUN_DEFINE.add(Short.valueOf((short)10));
      HURT_FUN_DEFINE.add(Short.valueOf((short)11));
      HURT_FUN_DEFINE.add(Short.valueOf((short)16));
      HURT_FUN_DEFINE.add(Short.valueOf((short)19));
      HURT_FUN_DEFINE.add(Short.valueOf((short)24));
      HURT_FUN_DEFINE.add(Short.valueOf((short)26));
      HURT_FUN_DEFINE.add(Short.valueOf((short)29));
      HURT_FUN_DEFINE.add(Short.valueOf((short)32));
      HURT_FUN_DEFINE.add(Short.valueOf((short)34));
      HURT_FUN_DEFINE.add(Short.valueOf((short)36));
      HURT_FUN_DEFINE.add(Short.valueOf((short)53));
      HURT_FUN_DEFINE.add(Short.valueOf((short)69));
      HURT_FUN_DEFINE.add(Short.valueOf((short)84));
      HURT_FUN_DEFINE.add(Short.valueOf((short)94));
      CURE_FUN_DEFINE.add(Short.valueOf((short)6));
      CURE_FUN_DEFINE.add(Short.valueOf((short)7));
      CURE_FUN_DEFINE.add(Short.valueOf((short)31));
      CURE_FUN_DEFINE.add(Short.valueOf((short)59));
      CURE_FUN_DEFINE.add(Short.valueOf((short)35));
      CURE_FUN_DEFINE.add(Short.valueOf((short)45));
      CURE_FUN_DEFINE.add(Short.valueOf((short)63));
      CURE_FUN_DEFINE.add(Short.valueOf((short)72));
      CURE_FUN_DEFINE.add(Short.valueOf((short)74));
      CURE_FUN_DEFINE.add(Short.valueOf((short)77));
      CURE_FUN_DEFINE.add(Short.valueOf((short)92));
      CURE_FUN_DEFINE.add(Short.valueOf((short)93));
      CONTROL_BUF_DEFINE.add((byte)1);
      CONTROL_BUF_DEFINE.add((byte)2);
      CONTROL_BUF_DEFINE.add((byte)11);
      CONTROL_BUF_DEFINE.add((byte)12);
      CONTROL_BUF_DEFINE.add((byte)16);
      CONTROL_BUF_DEFINE.add((byte)18);
      CONTROL_BUF_DEFINE.add((byte)17);
      HashSet<Byte> Left_Row_1 = new HashSet();
      Left_Row_1.add((byte)0);
      Left_Row_1.add((byte)1);
      Left_Row_1.add((byte)2);
      HashSet<Byte> Left_Row_2 = new HashSet();
      Left_Row_2.add((byte)3);
      Left_Row_2.add((byte)4);
      HashMap<Byte, HashSet<Byte>> leftRow = new HashMap();
      leftRow.put((byte)0, Left_Row_1);
      leftRow.put((byte)1, Left_Row_2);
      new HashSet();
      Left_Row_1.add((byte)5);
      Left_Row_1.add((byte)6);
      Left_Row_1.add((byte)7);
      new HashSet();
      Left_Row_2.add((byte)8);
      Left_Row_2.add((byte)9);
      HashMap<Byte, HashSet<Byte>> rightRow = new HashMap();
      leftRow.put((byte)0, Left_Row_1);
      leftRow.put((byte)1, Left_Row_2);
      ROW_SET.put((byte)1, rightRow);
   }
}
