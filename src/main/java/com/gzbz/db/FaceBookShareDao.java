package com.gzbz.db;

import com.google.common.base.Joiner;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@DBTableAnno(
   name = "tb_face_book_share",
   resultType = 0,
   selectKey = {"playerId"}
)
public class FaceBookShareDao extends DBDao {
   @DBColumnAnno(
      columnName = "playerId",
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      columnName = "likesState",
      comment = "点赞奖励领取状态 0:未领取 1:已领取"
   )
   public int likesState = 0;
   @DBColumnAnno(
      columnName = "shareState",
      comment = "分享奖励领取状态 0:未领取 1:已领取"
   )
   public int shareState = 0;
   @DBColumnAnno(
      columnName = "inviteState",
      comment = "邀请奖励领取状态 0:未领取 1:已领取"
   )
   public int inviteState = 0;
   @DBColumnAnno(
      columnName = "communityState",
      comment = "社群邮件发送状态 0:未发送 1:已发送"
   )
   public int communityState = 0;
   @DBColumnAnno(
      columnName = "adviseState",
      comment = "建议邮件发送状态 0:未发送 1:已发送"
   )
   public int adviseState = 0;
   @DBColumnAnno(
      columnName = "bindingState",
      comment = "绑定奖励发送状态 0:未发送 1:已发送"
   )
   public int bindingState = 0;
   @DBColumnAnno(
      columnName = "googlePlayerState",
      comment = "GooglePlay预注册礼包发送情况 0:未发送 1:已发送"
   )
   public int googlePlayerState = 0;
   @DBColumnAnno(
      columnName = "h5GuideState",
      comment = "是否已领取h5引导奖励 0:未领取 1:已领取"
   )
   public int h5GuideState = 0;
   @DBColumnAnno(
      comment = "已邀请的玩家账号",
      columnType = "LONGTEXT",
      loadFun = "loadInvitePlayer",
      saveFun = "saveInvitePlayer"
   )
   public Set<String> invitePlayer = new HashSet();

   public void loadInvitePlayer(String data) {
      this.invitePlayer.clear();
      String[] splitArr = data.split("\\|");
      this.invitePlayer.addAll(Arrays.asList(splitArr));
   }

   public String saveInvitePlayer() {
      return Joiner.on("|").join(this.invitePlayer);
   }
}
