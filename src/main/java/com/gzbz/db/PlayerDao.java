package com.gzbz.db;

import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gamePlayer.playerChat.PlayerChatPart;
import com.gzbz.protobuf.PlayerMsg;
import db.DBColumnAnno;
import db.DBTableAnno;
import java.lang.reflect.Field;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.misc.Unsafe;

@DBTableAnno(
   name = "tb_player",
   selectKey = {"playerId"}
)
public class PlayerDao extends PlayerPublicDao {
   static Logger logger = LoggerFactory.getLogger(PlayerChatPart.class);
   static HashMap<Integer, Long> propertyOffset = new HashMap();
   static Unsafe unsafe;
   @DBColumnAnno(
      comment = "账号类型"
   )
   public int type;
   @DBColumnAnno(
      comment = "机器人表ID"
   )
   public int robotId;
   @DBColumnAnno
   public String account = "";
   @DBColumnAnno
   public String passwd = "";
   @DBColumnAnno(
      comment = "战神殿挑战失败时间"
   )
   public long templeDefeatTime;
   public int exp;
   public int vip_exp;
   public int union_active;
   public int arena_praise;
   public long copper;
   public long gold;
   public long hero_exp;
   public int infomation;
   public int friend;
   public int soul;
   public int mana;
   public int renow;
   public int blessing;
   public int honor;
   public int recruit_stone;
   public int skin_crystal;
   public int dress;
   public int pvp_points;
   public int signetTrace;
   public int prayScore;
   public int conqueCoin;
   public int military;
   public int cooperation;
   public int winPlains;
   public int topMatch;
   public int heroClub;
   public int barbarian_integral;
   public int privilege_fast_fight;
   public int privilege_chi_bi;
   public int privilege_adventure_senior;
   public int privilege_adventure_luxury;
   public int hero_raise_integral;
   public int ladder_pvp_integral;
   public int stonehenge_integral;
   public int ancient_sword_point;
   public long updateTime;
   public int privilege_dragon;
   public int privilege_transport;
   public int act_soldier_book;
   public int act_seal;
   public int act_country_book;
   public int act_qin;
   public int war_medicine;
   public int war_poison;
   public int war_businessman;
   public int tongtian_order;
   public int trail_king;
   public int privilege_marquis;
   public int chibi_chip;
   public int act_offer;
   public int chapter_exp;
   public int att_token;
   public int move_token;
   public long birthTime;
   public long lastLoginTime;
   public int seven_barbarian;
   public int country_war_score;
   public int stone_material;
   public int hero_theme;
   public long forbidChatTime;
   public int fairyland;
   public int hero_dress_coin;
   public int fengmo_point;
   public int pet_exp;
   public int offer_point;
   public int privilege_pet;
   @DBColumnAnno(
      comment = "后台解封时间"
   )
   public long unsealTime;
   public int palacePoint;
   public int dragonWarPoint;
   public int tongtian_token;
   public int comeBackActReg;
   public int first_year_treasure;
   public int new_week_treasure;
   public long diamond;
   public long diamond_chip;
   public int fortune_point;
   public int hero_fire_coin;
   public int weekly_card_point;
   public int trail_emperor;
   public int pri_supreme_war_order;
   public int supreme_point;
   public int hero_card;
   public int lingLongBook;

   public long getProperty(int property) {
      if (property < 0) {
         logger.warn("playerId:{} 属性值不可以小于0 property:{}", this.playerId, property);
         return 0L;
      } else if (property <= PlayerDefine.map.size() && propertyOffset.containsKey(property)) {
         long offset = (Long)propertyOffset.get(property);
         return this.isLongType(property) ? unsafe.getLong(this, offset) : (long)unsafe.getInt(this, offset);
      } else {
         logger.warn("获取属性值 playerId:{} 属性类型 {}", this.playerId, property);
         return 0L;
      }
   }

   public long setProperty(int property, long destValue) {
      if (property <= PlayerDefine.map.size() && propertyOffset.containsKey(property)) {
         if (destValue < 0L) {
            if (property == PlayerDefine.PLAYER_LV) {
               destValue = 1L;
            } else {
               destValue = 0L;
            }
         }

         long offset = (Long)propertyOffset.get(property);
         if (this.isLongType(property)) {
            unsafe.putLong(this, offset, destValue);
         } else {
            if (destValue > 2147483647L) {
               destValue = 2147483647L;
            }

            unsafe.putInt(this, offset, (int)destValue);
         }

         super.updateOp();
         return destValue;
      } else {
         logger.warn("直接设置属性值 playerId:{} 属性类型 {} 超出范围，value:{}", new Object[]{this.playerId, property, destValue});
         return destValue;
      }
   }

   public long modifyProperty(int property, long num) {
      if (property <= PlayerDefine.map.size() && propertyOffset.containsKey(property)) {
         long destValue = this.getProperty(property) + num;
         this.setProperty(property, destValue);
         return destValue;
      } else {
         logger.warn("修改属性 playerId:{} 属性类型 {} 超出范围，value:{}", new Object[]{this.playerId, property, num});
         return num;
      }
   }

   public PlayerMsg.PropertyCell.Builder toBasePropertyCell(int property) {
      PlayerMsg.PropertyCell.Builder info_builder = PlayerMsg.PropertyCell.newBuilder();
      info_builder.setProperty(property);
      info_builder.setValue(String.valueOf(this.getProperty(property)));
      return info_builder;
   }

   public boolean isLongType(int property) {
      return property == PlayerDefine.PLAYER_COPPER || property == PlayerDefine.PLAYER_GOLD || property == PlayerDefine.PLAYER_DIAMOND || property == PlayerDefine.PLAYER_DIAMOND_CHIP;
   }

   static {
      try {
         Field singleoneInstanceField = Unsafe.class.getDeclaredField("theUnsafe");
         singleoneInstanceField.setAccessible(true);
         unsafe = (Unsafe)singleoneInstanceField.get((Object)null);
         PlayerDefine.map.forEach((key, value) -> {
            long valueOffset = -1L;

            try {
               Field field = PlayerDao.class.getDeclaredField(value);
               if (field != null) {
                  valueOffset = unsafe.objectFieldOffset(field);
               }
            } catch (Exception var7) {
               try {
                  Field field = PlayerPublicDao.class.getDeclaredField(value);
                  if (field != null) {
                     valueOffset = unsafe.objectFieldOffset(field);
                  }
               } catch (Exception e1) {
                  e1.printStackTrace();
               }
            }

            if (valueOffset != -1L) {
               propertyOffset.put(key, valueOffset);
            }

         });
      } catch (Exception e) {
         e.printStackTrace();
      }

   }
}
