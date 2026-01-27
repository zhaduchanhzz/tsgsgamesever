package com.yy.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import misc.DateUtil;

@DBTableAnno(
   name = "tb_cross_offer_detial",
   resultType = 2,
   selectKey = {"group"},
   mapKey = {"code"}
)
public class CrossOfferDetailDao extends DBDao {
   @DBColumnAnno(
      comment = "group",
      isPrimary = true
   )
   public int group;
   @DBColumnAnno(
      comment = "唯一标识",
      isPrimary = true
   )
   public int code;
   @DBColumnAnno(
      comment = "悬赏类型"
   )
   public int type;
   @DBColumnAnno(
      comment = "悬赏id"
   )
   public int id;
   @DBColumnAnno(
      comment = "难度"
   )
   public int difficult;
   @DBColumnAnno(
      comment = "怪物属性modelId"
   )
   public int offerHeroId;
   @DBColumnAnno(
      comment = "奖励组"
   )
   public int offerRewardId;
   @DBColumnAnno(
      comment = "服务器id"
   )
   public int serverId;
   @DBColumnAnno(
      comment = "发布者id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "军团id"
   )
   public int unionId;
   @DBColumnAnno(
      comment = "发布时间"
   )
   public int createTime;
   @DBColumnAnno(
      comment = "当前血量"
   )
   public long curHp;
   @DBColumnAnno(
      comment = "总血量"
   )
   public long totalHp;
   @DBColumnAnno(
      comment = "击杀时间"
   )
   public int arrestTime;
   @DBColumnAnno(
      comment = "缉拿者服务器"
   )
   public int killServerId;
   @DBColumnAnno(
      comment = "缉拿者名字"
   )
   public String killer = "";

   public CrossOfferDetailDao() {
   }

   public CrossOfferDetailDao(int group, int type, int code, int id, int serverId, int playerId, int unionId) {
      this.group = group;
      this.type = type;
      this.code = code;
      this.id = id;
      this.serverId = serverId;
      this.playerId = playerId;
      this.unionId = unionId;
      this.createTime = DateUtil.getIntTime(System.currentTimeMillis());
   }
}
