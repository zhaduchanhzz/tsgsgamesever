package com.gzbz.db;

import com.google.common.base.Joiner;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import misc.DataUtils;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_player_wechat",
   resultType = 0,
   selectKey = {"playerId"}
)
public class PlayerWeChatDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true
   )
   public int playerId;
   @DBColumnAnno(
      comment = "已邀请的玩家账号",
      columnType = "LONGTEXT",
      loadFun = "loadInvitePlayer",
      saveFun = "saveInvitePlayer"
   )
   public Set<String> invitePlayer = new HashSet();
   @DBColumnAnno(
      comment = "是否已领取添加小程序奖励"
   )
   public boolean isGotLittleProgram = false;
   @DBColumnAnno(
      comment = "微信好友分享奖励领取次数"
   )
   public int friendShare;
   @DBColumnAnno(
      comment = "朋友圈每日分享奖励领取次数"
   )
   public int momentsShare;
   @DBColumnAnno(
      comment = "朋友圈每日分享下一次奖励领取时间"
   )
   public int momentsNextShare;
   @DBColumnAnno(
      comment = "今日好友分享次数"
   )
   public int todayFriendShare;
   @DBColumnAnno(
      comment = "已领邀请奖励",
      columnType = "TEXT",
      loadFun = "loadInvitePlayerReward",
      saveFun = "saveInvitePlayerReward"
   )
   public Set<Integer> invitePlayerReward = new HashSet();
   @DBColumnAnno(
      comment = "邀请人"
   )
   public int invite;
   @DBColumnAnno(
      comment = "已领好友礼包奖励",
      columnType = "TEXT",
      loadFun = "loadInviteTargetReward",
      saveFun = "saveInviteTargetReward"
   )
   public Set<Integer> inviteTargetReward = new HashSet();
   @DBColumnAnno(
      comment = "邀请人好友礼包任务达成数量",
      columnType = "TEXT",
      loadFun = "loadInviteTargetData",
      saveFun = "saveInviteTargetData"
   )
   public Map<String, Integer> inviteTargetData = new HashMap();
   @DBColumnAnno(
      comment = "被邀请人好友礼包已完成的任务",
      columnType = "TEXT",
      loadFun = "loadBeInviteTargetData",
      saveFun = "saveBeInviteTargetData"
   )
   public Set<String> beInviteTargetData = new HashSet();
   @DBColumnAnno(
      comment = "抖音录屏已分享的ID",
      columnType = "TEXT",
      loadFun = "loadTiktokSharedRecordIDSet",
      saveFun = "saveTiktokSharedRecordIDSet"
   )
   public Set<Integer> tiktokSharedRecordIDSet = new HashSet();
   @DBColumnAnno(
      comment = "邀请排行榜新需求,前32是否已完成,后32邀请人"
   )
   public long invitePlayerId;

   public void loadInvitePlayer(String data) {
      this.invitePlayer.clear();
      String[] splitArr = data.split("\\|");
      this.invitePlayer.addAll(Arrays.asList(splitArr));
   }

   public String saveInvitePlayer() {
      return Joiner.on("|").join(this.invitePlayer);
   }

   public void loadInvitePlayerReward(String data) {
      this.invitePlayerReward.clear();
      String[] splitArr = data.split("\\|");

      for(String s : splitArr) {
         this.invitePlayerReward.add(Integer.parseInt(s));
      }

   }

   public String saveInvitePlayerReward() {
      return Joiner.on("|").join(this.invitePlayerReward);
   }

   public void loadInviteTargetReward(String data) {
      this.inviteTargetReward.clear();
      String[] splitArr = data.split("\\|");

      for(String s : splitArr) {
         this.inviteTargetReward.add(Integer.parseInt(s));
      }

   }

   public String saveInviteTargetReward() {
      return Joiner.on("|").join(this.inviteTargetReward);
   }

   public void loadInviteTargetData(String data) {
      this.inviteTargetData = JsonUtil.jsonToMap(data, String.class, Integer.class);
   }

   public String saveInviteTargetData() {
      return JsonUtil.beanToJson(this.inviteTargetData);
   }

   public void loadBeInviteTargetData(String data) {
      this.beInviteTargetData.clear();
      String[] splitArr = data.split("\\|");
      this.beInviteTargetData.addAll(Arrays.asList(splitArr));
   }

   public String saveBeInviteTargetData() {
      return Joiner.on("|").join(this.beInviteTargetData);
   }

   public void loadTiktokSharedRecordIDSet(String data) {
      this.tiktokSharedRecordIDSet = DataUtils.stringToIntSet(data);
   }

   public String saveTiktokSharedRecordIDSet() {
      return DataUtils.intSetToString(this.tiktokSharedRecordIDSet);
   }
}
