package com.gzbz.db;

import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.war.hl.HLEvent;
import com.gzbz.war.hl.HLGoods;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.DateUtil;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_war_hl"
)
public class WarHLDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家code"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "当前层数id"
   )
   public int curFloor;
   @DBColumnAnno(
      comment = "最高层数"
   )
   public int lastMaxFloor;
   @DBColumnAnno(
      comment = "总据点攻破数"
   )
   public int allPass;
   @DBColumnAnno(
      loadFun = "loadPass",
      saveFun = "savePass",
      comment = "已通关据点"
   )
   public List<Integer> passFort = new ArrayList();
   @DBColumnAnno(
      comment = "治疗符使用次数"
   )
   public int cureCount;
   @DBColumnAnno(
      comment = "鸩毒使用次数"
   )
   public int poisonCount;
   @DBColumnAnno(
      comment = "本次已通关关卡数"
   )
   public int winCount;
   @DBColumnAnno(
      loadFun = "loadTargetReward",
      saveFun = "saveTargetReward",
      comment = "本次已领取关卡目标奖励记录"
   )
   public List<Integer> targetReward = new ArrayList();
   @DBColumnAnno(
      loadFun = "loadHeroHP",
      saveFun = "saveHeroHP",
      comment = "英雄血量比例记录"
   )
   public Map<Integer, Float> heroHP = new HashMap();
   @DBColumnAnno(
      loadFun = "loadEnemyHP",
      saveFun = "saveEnemyHP",
      comment = "敌人血量比例记录"
   )
   public Map<Integer, Float> enemyHP = new HashMap();
   @DBColumnAnno(
      loadFun = "loadShop",
      saveFun = "saveShop",
      columnType = "LONGTEXT",
      comment = "行军商店记录"
   )
   public List<HLGoods> shop = new ArrayList();
   @DBColumnAnno(
      comment = "上次刷新日期"
   )
   public String resetTime;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadBuff",
      saveFun = "saveBuff",
      comment = "buff加成记录"
   )
   public List<PropertyModel> buff = new ArrayList();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadEvent",
      saveFun = "saveEvent",
      comment = "事件记录"
   )
   public Map<Integer, HLEvent> event = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadReward",
      saveFun = "saveReward",
      comment = "奖励记录"
   )
   public List<ResourceModel> allReward = new ArrayList();
   @DBColumnAnno(
      comment = "出战英雄pos"
   )
   public int heroPos;
   @DBColumnAnno(
      comment = "当前探索度"
   )
   public int curPoint;
   @DBColumnAnno(
      columnType = "BLOB",
      comment = "阵容"
   )
   public byte[] arraying;

   public void loadPass(String data) {
      this.passFort = JsonUtil.jsonToList(data, Integer.class);
   }

   public String savePass() {
      return JsonUtil.object2String(this.passFort);
   }

   public void loadTargetReward(String data) {
      this.targetReward = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveTargetReward() {
      return JsonUtil.object2String(this.targetReward);
   }

   public void loadHeroHP(String data) {
      this.heroHP = JsonUtil.jsonToMap(data, Integer.class, Float.class);
   }

   public String saveHeroHP() {
      return JsonUtil.object2String(this.heroHP);
   }

   public void loadEnemyHP(String data) {
      this.enemyHP = JsonUtil.jsonToMap(data, Integer.class, Float.class);
   }

   public String saveEnemyHP() {
      return JsonUtil.object2String(this.enemyHP);
   }

   public void loadShop(String data) {
      this.shop = JsonUtil.jsonToList(data, HLGoods.class);
   }

   public String saveShop() {
      return JsonUtil.object2String(this.shop);
   }

   public void loadBuff(String data) {
      this.buff = JsonUtil.jsonToList(data, PropertyModel.class);
   }

   public String saveBuff() {
      return JsonUtil.object2String(this.buff);
   }

   public void loadEvent(String data) {
      this.event = JsonUtil.jsonToMap(data, Integer.class, HLEvent.class);
   }

   public String saveEvent() {
      return JsonUtil.object2String(this.event);
   }

   public void loadReward(String data) {
      this.allReward = JsonUtil.jsonToList(data, ResourceModel.class);
   }

   public String saveReward() {
      return JsonUtil.object2String(this.allReward);
   }

   public void addRewardRecord(ResourceModel resourceModel, int times) {
      for(int i = 0; i < times; ++i) {
         resourceModel.addResourceToList(this.allReward);
      }

   }

   public void addBuff(PropertyModel propertyModel) {
      boolean has = false;
      long value = propertyModel.getValue();
      int way = propertyModel.getWay();
      int type = propertyModel.getType();

      for(PropertyModel model : this.buff) {
         if (type == model.getType() && way == model.getWay()) {
            has = true;
            model.setValue(model.getValue() + value);
         }
      }

      if (!has) {
         this.buff.add(new PropertyModel(type, way, value));
      }

   }

   public boolean resetTwoDay() {
      if (this.resetTime != null && !this.resetTime.equals("")) {
         int difDay = DateUtil.difftimeDay(new Timestamp(Long.parseLong(this.resetTime) * 1000L));
         if (difDay >= 2) {
            int limitFloor = ApplicationContextProvider.getConfigInt("HuLaoGuanHuiTui", 198);
            int backFloor = 5;
            if (this.lastMaxFloor >= limitFloor) {
               backFloor = 7;
            }

            if (this.lastMaxFloor - backFloor > 0) {
               this.curFloor = this.lastMaxFloor - backFloor;
            } else {
               this.curFloor = 1;
            }

            this.cureCount = 0;
            this.poisonCount = 0;
            this.winCount = 0;
            this.allPass = 0;
            this.heroPos = -1;
            this.shop.clear();
            this.resetTime = System.currentTimeMillis() / 1000L + "";
            this.passFort.clear();
            this.enemyHP.clear();
            this.heroHP.clear();
            this.event.clear();
            this.targetReward.clear();
            this.allReward.clear();
            this.curPoint = 0;
            this.arraying = null;
            this.buff.clear();
            this.updateOp();
            return true;
         } else {
            return false;
         }
      } else {
         this.resetTime = System.currentTimeMillis() / 1000L + "";
         this.curFloor = 1;
         this.updateOp();
         return false;
      }
   }

   public void gmReset() {
      int limitFloor = ApplicationContextProvider.getConfigInt("HuLaoGuanHuiTui", 198);
      int backFloor = 5;
      if (this.lastMaxFloor >= limitFloor) {
         backFloor = 7;
      }

      if (this.lastMaxFloor - backFloor > 0) {
         this.curFloor = this.lastMaxFloor - backFloor;
      } else {
         this.curFloor = 1;
      }

      this.cureCount = 0;
      this.poisonCount = 0;
      this.winCount = 0;
      this.allPass = 0;
      this.heroPos = -1;
      this.shop.clear();
      this.resetTime = System.currentTimeMillis() / 1000L + "";
      this.passFort.clear();
      this.enemyHP.clear();
      this.heroHP.clear();
      this.event.clear();
      this.targetReward.clear();
      this.allReward.clear();
      this.curPoint = 0;
      this.arraying = null;
      this.buff.clear();
      this.updateOp();
   }

   public void nextFloor() {
      ++this.curFloor;
      if (this.lastMaxFloor < this.curFloor) {
         this.lastMaxFloor = this.curFloor;
      }

      this.passFort.clear();
      this.enemyHP.clear();
      this.event.clear();
      this.curPoint = 0;
      this.updateOp();
   }
}
