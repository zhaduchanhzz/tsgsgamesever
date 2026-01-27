package com.gzbz.db;

import com.alibaba.fastjson.JSON;
import com.gzbz.model.fun.ResourceModel;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_battle_hero_training"
)
public class BattleHeroTrainingDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "历史最高记录"
   )
   public int historyMaxTier;
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
      comment = "5层通关奖励领取情况"
   )
   public int tierReward;
   @DBColumnAnno(
      loadFun = "loadFriendIds",
      saveFun = "saveFriendIds",
      comment = "今日用过的好友id",
      columnType = "TEXT"
   )
   public List<Integer> friendIds = new ArrayList();
   @DBColumnAnno(
      loadFun = "loadRewardInfo",
      saveFun = "saveRewardInfo",
      comment = "当天获得的奖励"
   )
   public List<ResourceModel> rewards = new ArrayList();
   @DBColumnAnno(
      comment = "当前连续通过波数"
   )
   public int battleRound;
   @DBColumnAnno(
      comment = "当前选择的buff"
   )
   public int buffId;
   @DBColumnAnno(
      comment = "当前开始波数"
   )
   public int startTier;
   @DBColumnAnno(
      comment = "自动选择buff时间"
   )
   public int randomBuffTime;

   public void loadFriendIds(String data) {
      this.friendIds = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveFriendIds() {
      return JsonUtil.object2String(this.friendIds);
   }

   public void reset() {
      if (this.battleRound == 0) {
         this.rewards.clear();
         this.friendCode = 0;
         this.friendPos = -1;
         this.todayReward = false;
         this.resetStartTier();
         this.randomBuffTime = 0;
      }

      this.todayMaxTier = 0;
      this.friendIds.clear();
      this.myHeroCode = 0;
      this.supportCount = 0;
      this.updateOp();
   }

   public void resetStartTier() {
      this.startTier = this.historyMaxTier - 10;
      this.startTier = this.startTier > 0 ? this.startTier : 1;
   }

   public void loadRewardInfo(String data) {
      this.rewards = JSON.parseArray(data, ResourceModel.class);
   }

   public String saveRewardInfo() {
      return JSON.toJSONString(this.rewards);
   }
}
