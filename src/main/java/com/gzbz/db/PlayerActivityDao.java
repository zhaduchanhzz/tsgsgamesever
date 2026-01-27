package com.gzbz.db;

import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.activity.bean.BeautyTreasureData;
import com.gzbz.db.bean.ActivityChongYangData;
import com.gzbz.db.bean.ActivityDragonBoatData;
import com.gzbz.db.bean.ActivityEastWarData;
import com.gzbz.db.bean.ActivityGreenPlumData;
import com.gzbz.db.bean.ActivityHeroRiseData;
import com.gzbz.db.bean.ActivityLanternFestivalData;
import com.gzbz.db.bean.ActivitySpringFestivalData;
import com.gzbz.db.bean.ActivityTongQueParkData;
import com.gzbz.db.bean.ActivityTongQueRotateData;
import com.gzbz.db.bean.CustomizeGiftData;
import com.gzbz.db.bean.LevelGiftData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import misc.DataUtils;
import misc.JsonUtil;
import misc.MiscUtil;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_player_activity",
   resultType = 0,
   selectKey = {"playerId"}
)
public class PlayerActivityDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId = 0;
   @DBColumnAnno(
      comment = "已领取的七日活动奖励"
   )
   public int sevenDays = 0;
   @DBColumnAnno(
      comment = "每日累充已领取奖励id",
      loadFun = "loadDailyRechargeReward",
      saveFun = "saveDailyRechargeReward"
   )
   public Set<Integer> dailyRechargeReward = new HashSet();
   @DBColumnAnno(
      comment = "累充天数已领取奖励id",
      loadFun = "loadRechargeTotalDayReward",
      saveFun = "saveRechargeTotalDayReward"
   )
   public Set<Integer> rechargeTotalDayReward = new HashSet();
   @DBColumnAnno(
      comment = "已领取周末福利礼包"
   )
   public int weekendBenefitGifts = 0;
   @DBColumnAnno(
      comment = "已赐福次数"
   )
   public int weekendKoiBlessing = 0;
   @DBColumnAnno(
      comment = "特定任务活动积分"
   )
   public int specialTaskPoint = 0;
   @DBColumnAnno(
      columnType = "varchar",
      comment = "七日任务累充已领取奖励id",
      loadFun = "loadSevenTaskRechargeReward",
      saveFun = "saveSevenTaskRechargeReward"
   )
   public Set<Integer> sevenTaskRechargeReward = new HashSet();
   @DBColumnAnno(
      comment = "七日任务活动积分"
   )
   public int sevenTaskPoint = 0;
   @DBColumnAnno(
      comment = "已领取宝箱奖励",
      loadFun = "loadBoxReward",
      saveFun = "saveBoxReward"
   )
   public Set<Integer> boxReward = new HashSet();
   @DBColumnAnno(
      comment = "已购买活动商城物品id->buyCount",
      loadFun = "loadShopItem",
      saveFun = "saveShopItem",
      columnType = "LONGTEXT"
   )
   public Map<Integer, Integer> shopItems = new HashMap();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "当前参加的活动",
      loadFun = "loadActivities",
      saveFun = "saveActivities"
   )
   public Map<Integer, ActivityInfo> activities = new HashMap();
   @DBColumnAnno(
      columnType = "varchar",
      comment = "英雄崛起信息",
      loadFun = "loadActivityHeroRiseData",
      saveFun = "saveActivityHeroRiseData"
   )
   public ActivityHeroRiseData heroRise = new ActivityHeroRiseData();
   @DBColumnAnno(
      comment = "累充天数当前活动id"
   )
   public int rechargeTotalDayId = 0;
   @DBColumnAnno(
      comment = "活动期间累充金额",
      loadFun = "loadActivityRecharge",
      saveFun = "saveActivityRecharge",
      columnType = "TEXT"
   )
   public Map<Integer, Integer> activityRecharge = new HashMap();
   @DBColumnAnno(
      comment = "活动轮换奖励id",
      loadFun = "loadActivityRotate",
      saveFun = "saveActivityRotate"
   )
   public Map<Integer, Integer> activityRotateMap = new HashMap();
   @DBColumnAnno(
      comment = "铜雀游园活动数据",
      loadFun = "loadTongQuePark",
      saveFun = "saveTongQuePark",
      columnType = "TEXT"
   )
   public ActivityTongQueParkData activityTongQueParkData = new ActivityTongQueParkData();
   @DBColumnAnno(
      comment = "卧龙在世是否已领取当期武将"
   )
   public boolean woLongGot = false;
   @DBColumnAnno(
      comment = "私人定制礼包信息",
      loadFun = "loadCustomizeGiftDataMap",
      saveFun = "saveCustomizeGiftDataMap",
      columnType = "TEXT"
   )
   public Map<Integer, CustomizeGiftData> customizeGiftDataMap = new HashMap();
   @DBColumnAnno(
      comment = "喜迎春节活动数据",
      loadFun = "loadSpringFestival",
      saveFun = "saveSpringFestival",
      columnType = "TEXT"
   )
   public ActivitySpringFestivalData activitySpringFestivalData = new ActivitySpringFestivalData();
   @DBColumnAnno(
      comment = "至尊礼遇(轮换)活动数据",
      loadFun = "loadActivityLiYu",
      saveFun = "saveActivityLiYu",
      columnType = "TEXT"
   )
   public ActivitySpringFestivalData activityLiYuData = new ActivitySpringFestivalData();
   @DBColumnAnno(
      comment = "元宵活动数据",
      loadFun = "loadLanternFestival",
      saveFun = "saveLanternFestival",
      columnType = "TEXT"
   )
   public ActivityLanternFestivalData activityLanternFestivalData = new ActivityLanternFestivalData();
   @DBColumnAnno(
      comment = "已领取的等级礼包,type+level",
      loadFun = "loadLevelGiftGot",
      saveFun = "saveLevelGiftGot"
   )
   public Map<Integer, LevelGiftData> levelGiftGot = new HashMap();
   @DBColumnAnno(
      comment = "青梅煮酒活动数据",
      loadFun = "loadGreenPlum",
      saveFun = "saveGreenPlum",
      columnType = "TEXT"
   )
   public ActivityGreenPlumData greenPlumData = new ActivityGreenPlumData();
   @DBColumnAnno(
      comment = "端午活动数据",
      loadFun = "loadDragonBoat",
      saveFun = "saveDragonBoat",
      columnType = "TEXT"
   )
   public ActivityDragonBoatData dragonBoatData = new ActivityDragonBoatData();
   @DBColumnAnno(
      comment = "礼遇最后领取奖励activityType->id",
      loadFun = "loadLiYuReward",
      saveFun = "saveLiYuReward"
   )
   public Map<Integer, Integer> liYuReward = new HashMap();
   @DBColumnAnno(
      comment = "红颜探宝活动",
      loadFun = "loadBeautyTreasure",
      saveFun = "saveBeautyTreasure",
      columnType = "TEXT"
   )
   public BeautyTreasureData beautyTreasure = new BeautyTreasureData();
   @DBColumnAnno(
      comment = "红颜探宝轮换活动",
      loadFun = "loadBeautyTreasureRotate",
      saveFun = "saveBeautyTreasureRotate",
      columnType = "TEXT"
   )
   public BeautyTreasureData beautyTreasureRotate = new BeautyTreasureData();
   @DBColumnAnno(
      comment = "踏浪东征活动数据",
      loadFun = "loadEastWar",
      saveFun = "saveEastWar",
      columnType = "TEXT"
   )
   public ActivityEastWarData eastWarData = new ActivityEastWarData();
   @DBColumnAnno(
      comment = "踏浪东征轮换活动数据",
      loadFun = "loadEastWarRotate",
      saveFun = "saveEastWarRotate",
      columnType = "TEXT"
   )
   public ActivityEastWarData eastWarRotateData = new ActivityEastWarData();
   @DBColumnAnno(
      comment = "重阳节活动数据",
      loadFun = "loadChongYang",
      saveFun = "saveChongYang",
      columnType = "TEXT"
   )
   public ActivityChongYangData chongYangData = new ActivityChongYangData();
   @DBColumnAnno(
      comment = "孔明天灯已领取奖励id",
      loadFun = "loadKmtdGotRewards",
      saveFun = "saveKmtdGotRewards",
      columnType = "TEXT"
   )
   public Set<Integer> kmtdGotRewards = new HashSet();
   @DBColumnAnno(
      comment = "游园惊梦活动灯谜累充已领取奖励id",
      loadFun = "loadSwimParkLampRiddleGotRewards",
      saveFun = "saveSwimParkLampRiddleGotRewards",
      columnType = "TEXT"
   )
   public Set<Integer> swimParkLampRiddleGotRewards = new HashSet();
   @DBColumnAnno(
      comment = "元旦礼包奖励是否领取"
   )
   public boolean isReceiveNewYearReward = false;
   @DBColumnAnno(
      comment = "乾坤探宝活动",
      loadFun = "loadQianKunTreasure",
      saveFun = "saveQianKunTreasure",
      columnType = "TEXT"
   )
   public BeautyTreasureData qianKunTreasure = new BeautyTreasureData();
   @DBColumnAnno(
      comment = "新春直购商城活动开启时玩家的等级，活动期间不改变"
   )
   public int newYearGiftPlayerLv;
   @DBColumnAnno(
      comment = "五一礼包奖励是否领取"
   )
   public boolean isReceiveWorkersDayReward = false;
   @DBColumnAnno(
      comment = "抽奖排期活动",
      loadFun = "loadQianKunLottery",
      saveFun = "saveQianKunLottery",
      columnType = "TEXT"
   )
   public BeautyTreasureData qianKunLottery = new BeautyTreasureData();
   @DBColumnAnno(
      comment = "铜雀游园排期活动数据",
      loadFun = "loadTongQueRotate",
      saveFun = "saveTongQueRotate",
      columnType = "LONGTEXT"
   )
   public ActivityTongQueRotateData activityTongQueRotateData = new ActivityTongQueRotateData();
   @DBColumnAnno(
      comment = "花嫁美人排期活动数据",
      loadFun = "loadHuaJia",
      saveFun = "saveHuaJia",
      columnType = "LONGTEXT"
   )
   public ActivityTongQueRotateData activityHuaJiaData = new ActivityTongQueRotateData();
   @DBColumnAnno(
      comment = "开服累充奖励是否领取"
   )
   public boolean isGotServerOpenTotalRechargeReward = false;
   @DBColumnAnno(
      comment = "520限时累充已领取档位"
   )
   public int limitTimeAddupRechargeGotGear = 0;
   @DBColumnAnno(
      comment = "sns分享已领奖励的武将id的set",
      loadFun = "loadSnsShareHeroIdSet",
      saveFun = "saveSnsShareHeroIdSet",
      columnType = "TEXT"
   )
   public Set<Integer> snsShareHeroIdSet = new HashSet();
   @DBColumnAnno(
      comment = "珍瑜宝铺秒杀商品id->已购数量",
      loadFun = "loadZhenYuShopData",
      saveFun = "saveZhenYuShopData",
      columnType = "TEXT"
   )
   public Map<Integer, Integer> zhenYuShopData = new HashMap();

   public void loadZhenYuShopData(String data) {
      this.zhenYuShopData = DataUtils.stringToInt_intMap(data);
   }

   public String saveZhenYuShopData() {
      return DataUtils.int_intMapToString(this.zhenYuShopData);
   }

   public Set<Integer> sevenDaysRewards() {
      return MiscUtil.getBitPos((long)this.sevenDays);
   }

   public boolean isGotSevenDaysReward(int day) {
      return MiscUtil.existBit((long)this.sevenDays, day);
   }

   public void addSevenDaysReward(int day) {
      this.sevenDays = MiscUtil.setBit(this.sevenDays, day);
   }

   public Set<Integer> weekendBenefitGifts() {
      return MiscUtil.getBitPos((long)this.weekendBenefitGifts);
   }

   public boolean isGotWeekendBenefitGifts(int id) {
      return MiscUtil.existBit((long)this.weekendBenefitGifts, id);
   }

   public void addWeekendBenefitGifts(int id) {
      this.weekendBenefitGifts = MiscUtil.setBit(this.weekendBenefitGifts, id);
   }

   public void loadDailyRechargeReward(String str) {
      this.dailyRechargeReward = (Set)JsonUtil.jsonToBean(str, HashSet.class);
   }

   public String saveDailyRechargeReward() {
      return JsonUtil.beanToJson(this.dailyRechargeReward);
   }

   public void loadRechargeTotalDayReward(String str) {
      this.rechargeTotalDayReward = (Set)JsonUtil.jsonToBean(str, HashSet.class);
   }

   public String saveRechargeTotalDayReward() {
      return JsonUtil.beanToJson(this.rechargeTotalDayReward);
   }

   public void loadBoxReward(String boxStr) {
      this.boxReward = (Set)JsonUtil.jsonToBean(boxStr, HashSet.class);
   }

   public String saveBoxReward() {
      return JsonUtil.beanToJson(this.boxReward);
   }

   public void loadSevenTaskRechargeReward(String columnData) {
      if (!StringUtils.isEmpty(columnData)) {
         String[] dataArr = columnData.split("\u0001");

         for(String data : dataArr) {
            this.sevenTaskRechargeReward.add(Integer.parseInt(data));
         }

      }
   }

   public String saveSevenTaskRechargeReward() {
      StringBuilder sb = new StringBuilder();
      this.sevenTaskRechargeReward.forEach((id) -> sb.append(id).append("\u0001"));
      if (sb.length() > 0) {
         sb.deleteCharAt(sb.length() - 1);
      }

      return sb.toString();
   }

   public void loadShopItem(String columnData) {
      if (!StringUtils.isEmpty(columnData)) {
         String[] dataArr = columnData.split("\u0001");

         for(String data : dataArr) {
            String[] itemArr = data.split(":");
            this.shopItems.put(Integer.parseInt(itemArr[0]), Integer.parseInt(itemArr[1]));
         }

      }
   }

   public String saveShopItem() {
      StringBuilder sb = new StringBuilder();
      this.shopItems.entrySet().forEach((entry) -> sb.append(entry.getKey()).append(":").append(entry.getValue()).append("\u0001"));
      if (sb.length() > 0) {
         sb.deleteCharAt(sb.length() - 1);
      }

      return sb.toString();
   }

   public void loadActivities(String columnData) {
      if (!StringUtils.isEmpty(columnData)) {
         this.activities = JsonUtil.jsonToMap(columnData, Integer.class, ActivityInfo.class);
      }
   }

   public String saveActivities() {
      return JsonUtil.beanToJson(this.activities);
   }

   public void loadActivityHeroRiseData(String data) {
      this.heroRise = (ActivityHeroRiseData)JsonUtil.jsonToBean(data, ActivityHeroRiseData.class);
   }

   public String saveActivityHeroRiseData() {
      return JsonUtil.beanToJson(this.heroRise);
   }

   public void loadActivityRecharge(String data) {
      this.activityRecharge = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveActivityRecharge() {
      return JsonUtil.beanToJson(this.activityRecharge);
   }

   public void loadActivityRotate(String str) {
      this.activityRotateMap = JsonUtil.jsonToMap(str, Integer.class, Integer.class);
   }

   public String saveActivityRotate() {
      return JsonUtil.beanToJson(this.activityRotateMap);
   }

   public void loadTongQuePark(String str) {
      this.activityTongQueParkData = (ActivityTongQueParkData)JsonUtil.jsonToBean(str, ActivityTongQueParkData.class);
   }

   public String saveTongQuePark() {
      return JsonUtil.beanToJson(this.activityTongQueParkData);
   }

   public void loadTongQueRotate(String str) {
      this.activityTongQueRotateData = (ActivityTongQueRotateData)JsonUtil.jsonToBean(str, ActivityTongQueRotateData.class);
   }

   public String saveTongQueRotate() {
      return JsonUtil.beanToJson(this.activityTongQueRotateData);
   }

   public void loadHuaJia(String data) {
      this.activityHuaJiaData = (ActivityTongQueRotateData)JsonUtil.jsonToBean(data, ActivityTongQueRotateData.class);
   }

   public String saveHuaJia() {
      return JsonUtil.beanToJson(this.activityHuaJiaData);
   }

   public void loadCustomizeGiftDataMap(String str) {
      this.customizeGiftDataMap = JsonUtil.jsonToMap(str, Integer.class, CustomizeGiftData.class);
   }

   public String saveCustomizeGiftDataMap() {
      return JsonUtil.beanToJson(this.customizeGiftDataMap);
   }

   public void loadSpringFestival(String str) {
      this.activitySpringFestivalData = (ActivitySpringFestivalData)JsonUtil.jsonToBean(str, ActivitySpringFestivalData.class);
   }

   public String saveSpringFestival() {
      return JsonUtil.beanToJson(this.activitySpringFestivalData);
   }

   public void loadActivityLiYu(String str) {
      this.activityLiYuData = (ActivitySpringFestivalData)JsonUtil.jsonToBean(str, ActivitySpringFestivalData.class);
   }

   public String saveActivityLiYu() {
      return JsonUtil.beanToJson(this.activityLiYuData);
   }

   public void loadLanternFestival(String str) {
      this.activityLanternFestivalData = (ActivityLanternFestivalData)JsonUtil.jsonToBean(str, ActivityLanternFestivalData.class);
   }

   public String saveLanternFestival() {
      return JsonUtil.beanToJson(this.activityLanternFestivalData);
   }

   public void loadLevelGiftGot(String data) {
      this.levelGiftGot = JsonUtil.jsonToMap(data, Integer.class, LevelGiftData.class);
   }

   public String saveLevelGiftGot() {
      return JsonUtil.beanToJson(this.levelGiftGot);
   }

   public void loadGreenPlum(String str) {
      this.greenPlumData = (ActivityGreenPlumData)JsonUtil.jsonToBean(str, ActivityGreenPlumData.class);
   }

   public String saveGreenPlum() {
      return JsonUtil.beanToJson(this.greenPlumData);
   }

   public void loadDragonBoat(String str) {
      this.dragonBoatData = (ActivityDragonBoatData)JsonUtil.jsonToBean(str, ActivityDragonBoatData.class);
   }

   public String saveDragonBoat() {
      return JsonUtil.beanToJson(this.dragonBoatData);
   }

   public void loadLiYuReward(String data) {
      this.liYuReward = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveLiYuReward() {
      return JsonUtil.beanToJson(this.liYuReward);
   }

   public void loadBeautyTreasureRotate(String str) {
      this.beautyTreasureRotate = (BeautyTreasureData)JsonUtil.jsonToBean(str, BeautyTreasureData.class);
   }

   public String saveBeautyTreasureRotate() {
      return JsonUtil.beanToJson(this.beautyTreasureRotate);
   }

   public void loadQianKunTreasure(String str) {
      this.qianKunTreasure = (BeautyTreasureData)JsonUtil.jsonToBean(str, BeautyTreasureData.class);
   }

   public String saveQianKunTreasure() {
      return JsonUtil.beanToJson(this.qianKunTreasure);
   }

   public void loadQianKunLottery(String str) {
      this.qianKunLottery = (BeautyTreasureData)JsonUtil.jsonToBean(str, BeautyTreasureData.class);
   }

   public String saveQianKunLottery() {
      return JsonUtil.beanToJson(this.qianKunLottery);
   }

   public void loadBeautyTreasure(String str) {
      this.beautyTreasure = (BeautyTreasureData)JsonUtil.jsonToBean(str, BeautyTreasureData.class);
   }

   public String saveBeautyTreasure() {
      return JsonUtil.beanToJson(this.beautyTreasure);
   }

   public void loadEastWar(String str) {
      this.eastWarData = (ActivityEastWarData)JsonUtil.jsonToBean(str, ActivityEastWarData.class);
   }

   public String saveEastWar() {
      return JsonUtil.beanToJson(this.eastWarData);
   }

   public void loadEastWarRotate(String str) {
      this.eastWarRotateData = (ActivityEastWarData)JsonUtil.jsonToBean(str, ActivityEastWarData.class);
   }

   public String saveEastWarRotate() {
      return JsonUtil.beanToJson(this.eastWarRotateData);
   }

   public void loadChongYang(String str) {
      this.chongYangData = (ActivityChongYangData)JsonUtil.jsonToBean(str, ActivityChongYangData.class);
   }

   public String saveChongYang() {
      return JsonUtil.beanToJson(this.chongYangData);
   }

   public void loadKmtdGotRewards(String data) {
      if (!StringUtils.isEmpty(data)) {
         String[] gotRewards = data.split(",");
         if (gotRewards.length > 0) {
            Set<Integer> kmtdGotRewards_ = new HashSet();

            for(String gotReward : gotRewards) {
               kmtdGotRewards_.add(Integer.parseInt(gotReward));
            }

            this.kmtdGotRewards = kmtdGotRewards_;
         }
      }
   }

   public String saveKmtdGotRewards() {
      StringBuilder stringBuilder = new StringBuilder();
      Set<Integer> kmtdGotRewards = this.kmtdGotRewards;
      if (kmtdGotRewards != null && kmtdGotRewards.size() > 0) {
         for(Integer kmtdGotReward : kmtdGotRewards) {
            stringBuilder.append(kmtdGotReward + ",");
         }

         if (stringBuilder.length() > 0) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
         }
      }

      return stringBuilder.toString();
   }

   public void loadSwimParkLampRiddleGotRewards(String data) {
      if (!StringUtils.isEmpty(data)) {
         String[] gotRewards = data.split(",");
         if (gotRewards.length > 0) {
            Set<Integer> swimParkLampRiddleGotRewards_ = new HashSet();

            for(String gotReward : gotRewards) {
               swimParkLampRiddleGotRewards_.add(Integer.parseInt(gotReward));
            }

            this.swimParkLampRiddleGotRewards = swimParkLampRiddleGotRewards_;
         }
      }
   }

   public String saveSwimParkLampRiddleGotRewards() {
      StringBuilder stringBuilder = new StringBuilder();
      Set<Integer> swimParkLampRiddleGotRewards = this.swimParkLampRiddleGotRewards;
      if (swimParkLampRiddleGotRewards != null && swimParkLampRiddleGotRewards.size() > 0) {
         for(Integer swimParkLampRiddleGotReward : swimParkLampRiddleGotRewards) {
            stringBuilder.append(swimParkLampRiddleGotReward + ",");
         }

         if (stringBuilder.length() > 0) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
         }
      }

      return stringBuilder.toString();
   }

   public void loadSnsShareHeroIdSet(String data) {
      this.snsShareHeroIdSet = DataUtils.stringToIntSet(data);
   }

   public String saveSnsShareHeroIdSet() {
      return DataUtils.intSetToString(this.snsShareHeroIdSet);
   }
}
