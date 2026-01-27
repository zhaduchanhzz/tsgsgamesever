package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_activity_rotate_sign",
   resultType = 0,
   selectKey = {"playerId"}
)
public class ActivityRotateSignDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true
   )
   public int playerId;
   @DBColumnAnno(
      columnType = "TEXT",
      comment = "累充已领取奖励activityType->reward id",
      loadFun = "loadRechargeReward",
      saveFun = "saveRechargeReward"
   )
   public Map<Integer, HashSet> rechargeReward = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      comment = "活动积分activityType->point",
      loadFun = "loadPoint",
      saveFun = "savePoint"
   )
   public Map<Integer, Integer> point = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      comment = "已领取宝箱奖励activityType->box",
      loadFun = "loadBoxReward",
      saveFun = "saveBoxReward"
   )
   public Map<Integer, HashSet> boxReward = new HashMap();
   @DBColumnAnno(
      comment = "活动轮换奖励id",
      loadFun = "loadActivityRotate",
      saveFun = "saveActivityRotate"
   )
   public Map<Integer, Integer> activityRotateMap = new HashMap();

   public void loadRechargeReward(String data) {
      this.rechargeReward = JsonUtil.jsonToMap(data, Integer.class, HashSet.class);
   }

   public String saveRechargeReward() {
      return JsonUtil.beanToJson(this.rechargeReward);
   }

   public void loadPoint(String data) {
      this.point = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String savePoint() {
      return JsonUtil.beanToJson(this.point);
   }

   public void loadBoxReward(String data) {
      this.boxReward = JsonUtil.jsonToMap(data, Integer.class, HashSet.class);
   }

   public String saveBoxReward() {
      return JsonUtil.beanToJson(this.boxReward);
   }

   public void loadActivityRotate(String str) {
      this.activityRotateMap = JsonUtil.jsonToMap(str, Integer.class, Integer.class);
   }

   public String saveActivityRotate() {
      return JsonUtil.beanToJson(this.activityRotateMap);
   }
}
