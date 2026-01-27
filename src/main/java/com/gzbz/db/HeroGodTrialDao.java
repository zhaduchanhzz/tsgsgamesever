package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_hero_god_trial"
)
public class HeroGodTrialDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "历史最高记录 阵营->最高层数",
      loadFun = "loadHistoryMax",
      saveFun = "saveHistoryMax"
   )
   public Map<Byte, Integer> historyMax = new HashMap();
   @DBColumnAnno(
      comment = "5层通关奖励已领取最大层数 阵营->层数",
      loadFun = "loadTierReward",
      saveFun = "saveTierReward"
   )
   public Map<Byte, Integer> tierReward = new HashMap();
   @DBColumnAnno(
      comment = "当前开始波数 camp+step"
   )
   public long startTier;
   @DBColumnAnno(
      comment = "当天最高记录"
   )
   public int todayMaxTier;
   @DBColumnAnno(
      comment = "我的支援英雄code"
   )
   public int myHeroCode;
   @DBColumnAnno(
      comment = "派遣被借用次数"
   )
   public int supportCount;
   @DBColumnAnno(
      comment = "当前选中的支援好友id"
   )
   public int friendCode;
   @DBColumnAnno(
      comment = "助阵好友英雄站位"
   )
   public byte friendPos = -1;
   @DBColumnAnno(
      comment = "是否已领取当天试炼奖励:0否1是"
   )
   public boolean todayReward;
   @DBColumnAnno(
      loadFun = "loadFriendIds",
      saveFun = "saveFriendIds",
      comment = "今日用过的好友id"
   )
   public List<Integer> friendIds = new ArrayList();
   @DBColumnAnno(
      comment = "当前连续通过波数"
   )
   public int battleRound;
   @DBColumnAnno(
      comment = "当前选择的buff"
   )
   public int buffId;
   @DBColumnAnno(
      comment = "自动选择buff时间"
   )
   public int randomBuffTime;

   public void loadHistoryMax(String data) {
      this.historyMax = JsonUtil.jsonToMap(data, Byte.class, Integer.class);
   }

   public String saveHistoryMax() {
      return JsonUtil.beanToJson(this.historyMax);
   }

   public void loadFriendIds(String data) {
      this.friendIds = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveFriendIds() {
      return JsonUtil.object2String(this.friendIds);
   }

   public void loadTierReward(String data) {
      this.tierReward = JsonUtil.jsonToMap(data, Byte.class, Integer.class);
   }

   public String saveTierReward() {
      return JsonUtil.beanToJson(this.tierReward);
   }

   public void reset() {
      if (this.battleRound == 0) {
         this.friendCode = 0;
         this.friendPos = -1;
         this.todayReward = false;
         this.randomBuffTime = 0;
      }

      this.todayMaxTier = 0;
      this.friendIds.clear();
      this.myHeroCode = 0;
      this.supportCount = 0;
      this.updateOp();
   }
}
