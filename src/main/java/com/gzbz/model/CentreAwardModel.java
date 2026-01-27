package com.gzbz.model;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseModel;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import model.ModelAnno;
import model.ModelColumnAnno;
import model.ModelCustomMethod;
import model.ModelPool;

@ModelAnno(
   file = "centreAward"
)
public class CentreAwardModel extends BaseModel {
   public static int TYPE_UNION_WAR = 1;
   public static int TYPE_LADDER_RANK_AWARD = 2;
   public static int AWARD_TYPE_5 = 5;
   public static int TYPE_UNION_COPY_RANK = 7;
   public static int TYPE_UNION_COPY_KILL = 8;
   public static int TYPE_KINGCP_GUESS_WIN = 9;
   public static int TYPE_HERO_GOD_TRIAL = 10;
   public static int TYPE_DAILY_RECHARGE = 17;
   public static int TYPE_WEEKEND_KOI = 18;
   public static int TYPE_MINE = 19;
   public static int TYPE_ACTIVITY = 20;
   public static int TYPE_ALLIANCE_FIGHT = 26;
   public static int TYPE_WO_LONG = 27;
   public static int TYPE_SPRING_FESTIVAL = 28;
   public static int TYPE_SPRING_FESTIVAL_GIFT = 29;
   public static int TYPE_SPRING_FESTIVAL_BLESS_REWARD = 30;
   public static int TYPE_SPRING_FESTIVAL_BLESS_FORGOT_REWARD = 31;
   public static int TYPE_MINE_UNION = 32;
   public static int TYPE_SPRING_ENJOY_PRAY = 48;
   public static int TYPE_FAIRY_LAND_JOIN = 49;
   public static int TYPE_SPRING_ENJOY_WATER_PERSONAL = 52;
   public static int TYPE_SPRING_ENJOY_WATER_SERVER = 53;
   public static int TYPE_GOLD_SHIP_SETTLE = 56;
   public static int TYPE_TOTAL_RECHARGE = 57;
   public static int TYPE_ARTIFACT_ACT_TASK_BOX = 58;
   public static int TYPE_ARTIFACT_ACT_FINAL_BOX = 59;
   public static int TYPE_GOLD_SHIP_PERSONAL_RANK = 60;
   public static int TYPE_LADDER_SERVERTERMION_AWARD = 64;
   public static int TYPE_ALLIANCE_RANK = 400;
   public static int AWARD_TYPE_11111 = 1111;
   public static int AWARD_TYPE_11112 = 1112;
   public static int TYPE_TRANSPORT = 1991;
   public static int TYPE_TRANSPORT_INTERCEPT = 1992;
   public static int TYPE_TRANSPORT_ARRIVE = 1993;
   public static int TYPE_TRANSPORT_GUARD = 1994;
   public static int TYPE_TRANSPORT_ARRIVE_EX = 1995;
   public static int TYPE_TRANSPORT_GUARD_JP = 190;
   public static int TYPE_HERO_TRAINING = 5001;
   public static int DEMON_ACTIVITY_TOTAL_POINT = 61;
   public static int DEMON_ACTIVITY_DAY_HURT = 62;
   public static int LI_YU = 63;
   public static int UNION_WAR_MERGE_SERVER = 66;
   public static int UNION_WAR_SERVER_MOVE = 68;
   public static int TYPE_TONG_QUE_ARCHERY = 110;
   public static int TYPE_TONG_QUE_ARCHERY_PRAY = 111;
   public static int TYPE_FAIRYLAND_RECORD_AWARD = 7060;
   public static int DAILY_FIRST_RECHARGE = 70;
   public static int TYPE_MID_AUTUMN = 1250;
   public static int TYPE_NATIONAL_DAY = 1300;
   public static int TYPE_NATIONAL_DAY_SACRIFICE = 1301;
   public static int TYPE_JING_ZHOU = 7100;
   public static int TYPE_HL = 8001;
   public static int TYPE_MID_AUTUMN_TASK = 1260;
   public static int TYPE_UNION_LEADER_CHANGE_TO_ME_BAN = 1401;
   public static int TYPE_UNION_LEADER_CHANGE_TO_ME = 1402;
   public static int TYPE_UNION_DEPUTY_LEADER_GRANT = 1403;
   public static int TYPE_UNION_DEPUTY_LEADER_CANCEL_GRANT = 1404;
   public static int TYPE_UNION_BE_MOVE = 1405;
   public static int TYPE_UNION_LEADER_CANCEL_BAN = 1406;
   public static int TYPE_UNION_DEPUTY_LEADER_CANCEL_BAN = 1407;
   public static int TYPE_UNION_DAILY_GUESS = 1408;
   public static int TYPE_UNION_DAILY_GUESS_CHAPTER = 1409;
   public static int TYPE_KITTY_PRAY = 1510;
   public static int TYPE_KITTY_WATER_PERSONAL = 1500;
   public static int TYPE_KITTY_WATER_SERVER = 1505;
   public static int TYPE_CATCH_DEER = 2001;
   public static int TYPE_STARS_WISH_BLESSING = 1748;
   public static int TYPE_STARS_KMTD = 1749;
   public static int TYPE_SWIM_WINE = 1750;
   public static int TYPE_SWIM_LAMP_RIDDLE = 1751;
   public static int TYPE_FLOWER_FIRE_WINE = 1752;
   public static int TYPE_FLOWER_FIRE_LAMP_RIDDLE = 1753;
   public static int TYPE_FLOWER_FIRE_BATTLE_RANK_AWARD = 1754;
   public static int TYPE_FLOWER_FIRE_BATTLE_RANK_AWARD2 = 2200;
   public static int TYPE_WECHAT_INVITE_RANK_AWARD = 1770;
   public static int TYPE_WECHAT_FRIEND_AWARD = 1780;
   public static int TYPE_GREAT_CITY_ADD_UP_REWARD = 1764;
   public static int TYPE_ZHANG_FEI_ACCULUMATE = 1793;
   public static int TYPE_GREAT_CITY_SHOP_ADD_UP_REWARD = 1791;
   public static int TYPE_GREAT_CITY_POINT_RANK_REWARD = 1765;
   public static int TYPE_GREAT_CITY_POINT_RANK_REWARD2 = 2300;
   public static int TYPE_KING_OF_CHALLENGE_MAIL_ID = 1794;
   public static int TYPE_NEW_YEAR_PACKET = 1795;
   public static int TYPE_SI_MA_YI_LAMP_RIDDLE = 1824;
   public static int TYPE_SI_MA_YI_ACCULUMATE = 1823;
   public static int TYPE_YUAN_XIAO_ADD_UP_REWARD = 1840;
   public static int TYPE_YUAN_XIAO_RANK = 1880;
   public static int TYPE_YUAN_XIAO_STILL_COST = 3048;
   public static int TYPE_PRESTIGE_TIME_OUT_CONTENT = 1850;
   public static int TYPE_COMBINE_REPEAT_P_NAME_CONTENT = 1888;
   public static int TYPE_COMBINE_REPEAT_U_NAME_CONTENT = 1889;
   public static int TYPE_QQ_INVITE_RANK_AWARD = 1890;
   public static int TYPE_INVITE_SHARE_OUT_BONUS = 1900;
   public static int TYPE_MERGE_COM_MAIL_REWARD = 1931;
   public static int TYPE_MERGE_MAIL_REWARD = 1932;
   public static int TYPE_MERGE_CUT_ACT_REWARD = 2062;
   public static int TYPE_MERGE_QIYU_ACT_REWARD = 2063;
   public static int TYPE_MERGE_FAST_ACT_REWARD = 2064;
   public static int TYPE_MERGE_GOLD_ACT_REWARD = 2065;
   public static int TYPE_MERGE_HL_ACT_REWARD = 2066;
   public static int TYPE_MERGE_SPRING_ENJOY_PLAN_REWARD = 2067;
   public static int TYPE_MERGE_SPRING_ENJOY_TASK_REWARD = 2068;
   public static int TYPE_MERGE_KITTY_PLAN_REWARD = 2069;
   public static int TYPE_MERGE_KITTY_TASK_REWARD = 2070;
   public static int TYPE_MERGE_ACT_NOT_GOT_REWARD = 2071;
   public static int TYPE_MERGE_ACT_NOT_FINISH_REWARD = 2073;
   public static int TYPE_MERGE_CHIBI_CANCEL_SIGN_REWARD = 2074;
   public static int TYPE_MERGE_CHANGE_CHIBI_CANCEL_SIGN_REWARD = 2075;
   public static int TYPE_FB_COMMUNITY_REWARD = 2080;
   public static int TYPE_FB_ADVISE_REWARD = 2081;
   public static int TYPE_GOOGLE_PLAYER = 2101;
   public static int TYPE_WORKERS_DAY_PACKET = 2100;
   public static int TYPE_SERVER_OPEN_TOTAL_RECHARGE_PACKET = 2301;
   public static int TYPE_INGOT_ANY = 2314;
   public static int TYPE_LABOR_DAY_ADD_UP_RECHARGE = 2400;
   public static int TYPE_LABOR_DAY_SHOP_ADD_UP = 2405;
   public static int TYPE_LABOR_DAY_ARCHERY_RANK_REWARD = 2410;
   public static int TYPE_LABOR_DAY_ARCHERY_RANK_REWARD2 = 2410;
   public static int TYPE_UNION_WAR_BOX_NOT_GET = 2422;
   public static int TYPE_UNION_MAIL = 2450;
   public static int TYPE_CUT_SUPPORT = 2451;
   public static int TYPE_TRAINING_SUPPORT = 2452;
   public static int TYPE_VALUE_RECHARGE = 2453;
   public static int TYPE_TIAN_MING_BOX = 2454;
   public static int TYPE_MA_CHAO_CON_RECHARGE = 2472;
   public static int TYPE_MA_CHAO_ADD_UP_RECHARGE = 2473;
   public static int TYPE_DRAGON_WAR_RANK_REWARD = 2490;
   public static int TYPE_ZONG_QING_ADD_UP_RECHARGE = 2504;
   public static int TYPE_ZONG_QING_SHOP_ADD_UP = 2505;
   public static int TYPE_ZONG_QING_BLESSING_REWARD = 2507;
   public static int TYPE_ZONG_QING_PICK_RANK_REWARD = 2510;
   public static int TYPE_ZONG_QING_PICK_RANK_REWARD2 = 2510;
   public static int TYPE_LIMIT_TIME_ADDUP_RECHARGE_PACKET = 2600;
   public static int TYPE_RECHARGE_REBATE = 2650;
   public static int TYPE_QI_XI_ADD_UP_RECHARGE = 2700;
   public static int TYPE_QI_XI_SHOP_ADD_UP = 2701;
   public static int TYPE_QI_XI_DRUM = 2702;
   public static int TYPE_QI_XI_BLESSING_RECHARGE = 2708;
   public static int TYPE_GUO_QING_BLESSING_RECHARGE = 2709;
   public static int TYPE_CATCH_DEER_SERVER_MERGE_AWARD = 2722;
   public static int TYPE_MONTH_CARD_HUA_WEI = 2723;
   public static int ID_FOCUS_REWARD_MAIL = 2724;
   public static int TYPE_MID_AUTUMN_ADD_UP_RECHARGE = 2730;
   public static int TYPE_MID_AUTUMN_SHOP_ADD_UP_RECHARGE = 2731;
   public static int TYPE_CHANGE_NAME = 2737;
   public static int TYPE_GUO_QING_ADD_UP_RECHARGE = 2734;
   public static int TYPE_GUO_QING_SHOP_ADD_UP = 2735;
   public static int TYPE_GUO_QING_POINT_RANK_REWARD = 2738;
   public static int TYPE_GUO_QING_POINT_RANK_REWARD2 = 2739;
   public static int TYPE_FIRST_YEAR_ADD_UP_MAIL = 2790;
   public static int ID_FIRST_YEAR_SHOP_ADD_UP_MAIL = 2791;
   public static int TYPE_FIRST_YEAR_CONSUME_RETURN_MAIL = 2912;
   public static int ID_FIRST_YEAR_TREASUTE_MAIL = 2792;
   public static int TYPE_DECISIVE_BATTLE_RANK_REWARD = 2800;
   public static int TYPE_DECISIVE_BATTLE_MERGE_REWARD = 2801;
   public static int TYPE_DECISIVE_BATTLE_TASK_REWARD = 2802;
   public static int TYPE_DECISIVE_BATTLE_STEP_REWARD = 2803;
   public static int TYPE_FIRST_YEAR_POINT_RANK_REWARD = 2900;
   public static int TYPE_FIRST_YEAR_SIGN_REWARD = 2920;
   public static int TYPE_YUAN_DAN_ADD_UP_RECHARGE = 3010;
   public static int TYPE_YUAN_DAN_SHOP_ADD_UP_RECHARGE = 3011;
   public static int TYPE_YUAN_DAN = 3000;
   public static int TYPE_YUAN_DAN_ADD_UP_RETURN_AWARD = 3009;
   public static int TYPE_YUAN_DAN_CON_RECHARGE = 3015;
   public static int TYPE_CHINESE_NEW_YEAR_ADD_UP_RECHARGE = 3012;
   public static int TYPE_CHINESE_NEW_YEAR_SHOP_ADD_UP = 3013;
   public static int TYPE_CHINESE_NEW_YEAR_POINT_RANK_REWARD = 3020;
   public static int TYPE_CHINESE_NEW_YEAR_ADD_UP_RETURN_AWARD = 3014;
   public static int TYPE_WORLD_CUP_REWARD = 3040;
   public static int TYPE_WORLD_CUP_EXCHANGE = 3041;
   public static int TYPE_COLLECT_REWARD = 3049;
   public static int TYPE_ULTIMATE_REWARD = 3050;
   public static int TYPE_DRAW_CHIP = 3051;
   public static int TYPE_TASK_REWARD = 3052;
   public static int ID_GOD_BEAST_SCORE_REWARD = 3200;
   public static int TYPE_FORTUNE_POINT_REWARD = 3250;
   public static int ID_ACT_HERO_IMPROVE_STAR_REWARD = 2850;
   public static int TYPE_GOLD_WEEK_ADD_UP_RECHARGE = 2816;
   public static int TYPE_GOLD_WEEK_SHOP_ADD_UP = 2817;
   public static int TYPE_GOLD_WEEK_POINT_RANK_REWARD = 2818;
   public static int TYPE_GOLD_WEEK_POINT_RANK_REWARD2 = 2830;
   public static int TYPE_TURNTABLE_TASK_REWARD = 2870;
   public static int TYPE_FOURTEEN_SIGN_REWARD = 3260;
   public static int ID_KR_ACT_HERO_IMPROVE_STAR_REWARD = 2860;
   public static int ID_WAN_KA_RECHARGE_EXTRA = 2871;
   public static int TYPE_ACT_SEND_FLOWER_RANK = 2890;
   public static int TYPE_ACT_GET_FLOWER_RANK = 2894;
   public static int ID_KR_SEVEN_WELFARE_FREE_REWARD = 2873;
   public static int TYPE_CHILD_ADD_UP_RECHARGE = 2513;
   public static int TYPE_CHILD_SHOP_ADD_UP = 2514;
   public static int TYPE_CHILD_PICK_RANK_REWARD = 2506;
   public static int TYPE_CHILD_PICK_RANK_REWARD2 = 2506;
   public static int ID_SEND_FLOWER_RANK = 2930;
   public static int ID_GET_FLOWER_RANK = 2931;
   public static int ID_FLOWER_ACT_TASK_NO_REC = 2932;
   public static int ID_FLOWER_ACT_SEND_FLOWER_NO_REC = 2933;
   public static int TYPE_BROOD_ACT_RANK1_REWARD = 2940;
   public static int TYPE_BROOD_ACT_RANK2_REWARD = 2944;
   public static int TYPE_BROOD_ACT_RANK3_REWARD = 2948;
   public static int TYPE_BROOD_ACT_RANK1_INFO = 2952;
   public static int TYPE_BROOD_ACT_RANK2_INFO = 2953;
   public static int TYPE_BROOD_ACT_RANK3_INFO = 2954;
   public static int ID_BROOD_ACT_TASK_NO_REC = 2955;
   public static int TYPE_BROOD_ACT_ITEN_CHNAGE = 2958;
   public static int ID_KR_JUE_BAN_GIFT_REWARD = 2957;
   public static int ID_OPEN_SERVER_RECHARGE = 3310;
   public static int TYPE_SPECIAL_WEEKLY_REWARD = 2980;
   public static int TYPE_SUMMER_FESTIVAL_DRAW_REWARD = 2966;
   public static int TYPE_SUMMER_FESTIVAL_ADD_UP_RECHARGE = 2993;
   public static int TYPE_SUMMER_FESTIVAL_SHOP_ADD_UP = 2967;
   public static int TYPE_SUMMER_FESTIVAL_BLESSING_REWARD = 2968;
   public static int TYPE_SUMMER_FESTIVAL_ARCHERY_RANK_REWARD = 2981;
   public static int TYPE_SUMMER_FESTIVAL_ARCHERY_RANK_REWARD2 = 2981;
   public static int TYPE_SUMMER_FESTIVAL_FISHING_EXCHANGE = 2969;
   public static int ID_FA_QIU_COMPENSATE = 3300;
   public static int ID_LIFE_TIME_CARD_DAILY_REWARD = 3320;
   public static int ID_LIFE_TIME_CARD_WEKK_REWARD = 3321;
   public static int ID_HERO_INVALID = 3328;
   public static int TYPE_SUPREME_PVP_DAILY_REWARD = 3330;
   public static int TYPE_SUPREME_PVP_RANK_REWARD = 3331;
   public static int TYPE_SUPREME_PVP_WAR_ORDER = 3332;
   public static int TYPE_SUPREME_PVP_PRESTIGE = 3333;
   public static int ID_COIN_ADD_RECHARGE = 3340;
   public static int TYPE_WINTER_FESTIVAL_DRAW_REWARD = 3350;
   public static int TYPE_WINTER_FESTIVAL_ADD_UP_RECHARGE = 3371;
   public static int TYPE_WINTER_FESTIVAL_SHOP_ADD_UP = 3351;
   public static int TYPE_WINTER_FESTIVAL_BLESSING_REWARD = 3352;
   public static int TYPE_WINTER_FESTIVAL_ARCHERY_RANK_REWARD = 3354;
   public static int TYPE_WINTER_FESTIVAL_ARCHERY_RANK_REWARD2 = 3354;
   public static int TYPE_WINTER_FESTIVAL_FISHING_EXCHANGE = 3353;
   public static int ID_LING_LONG_BOOK_FORGOT = 3375;
   public static int TYPE_CHINESE_NEW_YEAR_CON_RECHARGE = 3381;
   public static int TYPE_LLMK = 3440;
   public static int TYPE_LLMK_TEAM = 3451;
   @ModelColumnAnno(
      isPrimaty = true,
      comment = "数据id"
   )
   private int id;
   @ModelColumnAnno(
      comment = "奖励类型"
   )
   private int type;
   @ModelColumnAnno(
      comment = "最小排名"
   )
   private int minRank;
   @ModelColumnAnno(
      comment = "最大排名"
   )
   private int maxRank;
   @ModelColumnAnno(
      columnName = "items",
      columnConvertType = 1,
      subCls = ResourceModel.class,
      count = 6,
      comment = "物品"
   )
   private List<ResourceModel> items = new ArrayList();
   @ModelColumnAnno(
      comment = "大标题"
   )
   private String title;
   @ModelColumnAnno(
      comment = "奖励描述(小标题)",
      fieldCheckPolicy = 1
   )
   private String desc;

   @ModelCustomMethod
   public static void loadCustom(ModelPool pool, ConcurrentHashMap<?, ?> map) {
      ConcurrentHashMap<Integer, TreeMap<Integer, CentreAwardModel>> tempHashMap = new ConcurrentHashMap();

      for(Map.Entry<?, ?> entry : map.entrySet()) {
         CentreAwardModel model = (CentreAwardModel)entry.getValue();
         ((TreeMap)tempHashMap.computeIfAbsent(model.type, (v) -> new TreeMap())).put(model.id, model);
      }

      pool.putMap("customCentreAward", tempHashMap);
   }

   public static CentreAwardModel getByType(int type) {
      Map<Integer, TreeMap<Integer, CentreAwardModel>> allMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
      return allMap.containsKey(type) && !((TreeMap)allMap.get(type)).isEmpty() ? (CentreAwardModel)((TreeMap)allMap.get(type)).firstEntry().getValue() : null;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.checkModify();
      this.id = id;
   }

   public int getType() {
      return this.type;
   }

   public void setType(int type) {
      this.checkModify();
      this.type = type;
   }

   public int getMinRank() {
      return this.minRank;
   }

   public void setMinRank(int minRank) {
      this.checkModify();
      this.minRank = minRank;
   }

   public int getMaxRank() {
      return this.maxRank;
   }

   public void setMaxRank(int maxRank) {
      this.checkModify();
      this.maxRank = maxRank;
   }

   public List<ResourceModel> getItems() {
      return this.items;
   }

   public void setItems(List<ResourceModel> items) {
      this.checkModify();
      this.items = items;
   }

   public String getTitle() {
      return this.title;
   }

   public void setTitle(String title) {
      this.checkModify();
      this.title = title;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.checkModify();
      this.desc = desc;
   }
}
