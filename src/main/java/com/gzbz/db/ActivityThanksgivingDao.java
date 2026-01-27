package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_activity_thanksgiving"
)
public class ActivityThanksgivingDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true
   )
   public int playerId;
   @DBColumnAnno(
      comment = "已签到天数->签到状态",
      loadFun = "loadSignDays",
      saveFun = "saveSignDays"
   )
   public Map<Integer, Integer> signDays = new HashMap();
   @DBColumnAnno(
      comment = "探宝已使用免费次数"
   )
   public int useFree;
   @DBColumnAnno(
      comment = "探宝当轮第几次"
   )
   public int roundNum;
   @DBColumnAnno(
      comment = "幸运大奖次数"
   )
   public int luckNum;
   @DBColumnAnno(
      comment = "任务积分"
   )
   public int taskPoint;
   @DBColumnAnno(
      comment = "已领积分奖励",
      loadFun = "loadPointReward",
      saveFun = "savePointReward"
   )
   public Set<Integer> pointReward = new HashSet();

   public void loadSignDays(String data) {
      this.signDays = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveSignDays() {
      return JsonUtil.beanToJson(this.signDays);
   }

   public void loadPointReward(String data) {
      this.pointReward = (Set)JsonUtil.jsonToBean(data, HashSet.class);
   }

   public String savePointReward() {
      return JsonUtil.beanToJson(this.pointReward);
   }
}
