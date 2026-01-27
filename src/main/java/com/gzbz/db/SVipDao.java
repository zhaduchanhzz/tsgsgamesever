package com.gzbz.db;

import com.google.common.base.Joiner;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import misc.DataUtils;

@DBTableAnno(
   name = "tb_s_vip",
   resultType = 0,
   selectKey = {"playerId"}
)
public class SVipDao extends DBDao {
   @DBColumnAnno(
      columnName = "playerId",
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      columnName = "focusState",
      comment = "关注奖励领取状态 0:未领取 1:已领取 "
   )
   public int focusState = 0;
   @DBColumnAnno(
      columnName = "focusReceiveType",
      comment = "关注奖励领取类型 0:未领取 1:普通领取 2:发送邮件"
   )
   public int focusReceiveType = 0;
   @DBColumnAnno(
      columnName = "dailyInviteNum",
      comment = "今日邀请数量"
   )
   public int dailyInviteNum;
   @DBColumnAnno(
      comment = "已邀请的玩家账号",
      columnType = "LONGTEXT",
      loadFun = "loadInvitePlayer",
      saveFun = "saveInvitePlayer"
   )
   public Set<String> invitePlayer = new HashSet();
   @DBColumnAnno(
      comment = "已领邀请奖励",
      columnType = "TEXT",
      loadFun = "loadInviteReceiveId",
      saveFun = "saveInviteReceiveId"
   )
   public Set<Integer> inviteReceiveId = new HashSet();
   @DBColumnAnno(
      comment = "邀请排行榜新需求,前32是否已完成,后32邀请人"
   )
   public long invitePlayerId;

   public void loadInviteReceiveId(String data) {
      this.inviteReceiveId = DataUtils.stringToIntSet(data);
   }

   public String saveInviteReceiveId() {
      return DataUtils.intSetToString(this.inviteReceiveId);
   }

   public void loadInvitePlayer(String data) {
      this.invitePlayer.clear();
      String[] splitArr = data.split("\\|");
      this.invitePlayer.addAll(Arrays.asList(splitArr));
   }

   public String saveInvitePlayer() {
      return Joiner.on("|").join(this.invitePlayer);
   }
}
