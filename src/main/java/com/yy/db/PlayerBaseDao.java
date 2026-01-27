package com.yy.db;

import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.FriendMsg;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.Objects;

@DBTableAnno(
   name = "tb_player_base",
   dbType = 2,
   resultType = 5,
   selectKey = {"playerId"}
)
public class PlayerBaseDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "playerId"
   )
   private int playerId;
   @DBColumnAnno(
      comment = "服务器id"
   )
   private int serverId;
   @DBColumnAnno(
      comment = "玩家当前所在服务器id"
   )
   private int sourceServerId;
   @DBColumnAnno(
      comment = "玩家名称"
   )
   private String playerName = "";
   @DBColumnAnno(
      comment = "性别"
   )
   private int sex;
   @DBColumnAnno(
      comment = "等级"
   )
   private int lv;
   @DBColumnAnno(
      comment = "战力"
   )
   private long combatPower;
   @DBColumnAnno(
      comment = "头像id"
   )
   private int headId;
   @DBColumnAnno(
      comment = "头像框id"
   )
   private int headFrame;
   @DBColumnAnno(
      comment = "称号"
   )
   private int prestige;
   @DBColumnAnno(
      comment = "君主形象id"
   )
   private int monarchId;
   @DBColumnAnno(
      comment = "军团id"
   )
   private int unionId;
   @DBColumnAnno(
      comment = "军团名称"
   )
   private String unionName = "";
   @DBColumnAnno(
      comment = "vip等级"
   )
   private int vipLev;
   @DBColumnAnno(
      comment = "显示vip等级"
   )
   private boolean showVip = true;
   @DBColumnAnno(
      comment = "副称号"
   )
   private int secondTitle;
   @DBColumnAnno(
      comment = "段位"
   )
   private int peakLv;
   @DBColumnAnno(
      comment = "矿场特权"
   )
   private int privilegeMine;
   @DBColumnAnno(
      comment = "君主府头衔"
   )
   private int palaceTitle;
   @DBColumnAnno(
      comment = "周年庆活动获得的宝物数量"
   )
   private long firstYearTreasureNum;
   @DBColumnAnno(
      comment = "春节庆典活动获得的宝物数量"
   )
   private long chineseNewYearTreasureNum;
   @DBColumnAnno(
      comment = "qq大玩咖等级"
   )
   private int qqWanKaLv = 0;
   @DBColumnAnno(
      comment = "qq特权标识"
   )
   private String qqLogo = "";
   @DBColumnAnno(
      comment = "玩家出战场上武将数量，不包括援军"
   )
   private int heroNum;

   public int getPlayerId() {
      return this.playerId;
   }

   public int getServerId() {
      return this.serverId;
   }

   public int getSourceServerId() {
      return this.sourceServerId;
   }

   public String getPlayerName() {
      return this.playerName;
   }

   public int getLv() {
      return this.lv;
   }

   public long getCombatPower() {
      return this.combatPower;
   }

   public int getHeadId() {
      return this.headId;
   }

   public int getHeadFrame() {
      return this.headFrame;
   }

   public int getPrestige() {
      return this.prestige;
   }

   public int getSex() {
      return this.sex;
   }

   public String getUnionName() {
      return this.unionName;
   }

   public int getMonarchId() {
      return this.monarchId;
   }

   public int getVipLev() {
      return this.vipLev;
   }

   public int getUnionId() {
      return this.unionId;
   }

   public int getHeroNum() {
      return this.heroNum;
   }

   public void setHeroNum(int heroNum) {
      this.heroNum = heroNum;
   }

   public void setServerId(int serverId) {
      if (this.serverId != serverId) {
         this.serverId = serverId;
         this.updateOp();
      }
   }

   public void setSex(int sex) {
      if (this.sex != sex) {
         this.sex = sex;
         this.updateOp();
      }
   }

   public void setLv(int lv) {
      if (this.lv != lv) {
         this.lv = lv;
         this.updateOp();
      }
   }

   public void setCombatPower(long combatPower) {
      if (this.combatPower != combatPower) {
         this.combatPower = combatPower;
         this.updateOp();
      }
   }

   public void setHeadId(int headId) {
      if (this.headId != headId) {
         this.headId = headId;
         this.updateOp();
      }
   }

   public void setHeadFrame(int headFrame) {
      if (this.headFrame != headFrame) {
         this.headFrame = headFrame;
         this.updateOp();
      }
   }

   public void setPrestige(int prestige) {
      if (this.prestige != prestige) {
         this.prestige = prestige;
         this.updateOp();
      }
   }

   public void setMonarchId(int monarchId) {
      if (this.monarchId != monarchId) {
         this.monarchId = monarchId;
         this.updateOp();
      }
   }

   public void setUnionId(int unionId) {
      if (this.unionId != unionId) {
         this.unionId = unionId;
         this.updateOp();
      }
   }

   public void setUnionName(String unionName) {
      if (!this.unionName.equals(unionName)) {
         this.unionName = unionName;
         this.updateOp();
      }
   }

   public void setVipLev(int vipLev) {
      if (this.vipLev != vipLev) {
         this.vipLev = vipLev;
         this.updateOp();
      }
   }

   public void setSourceServerId(int sourceServerId) {
      if (sourceServerId != this.sourceServerId) {
         this.sourceServerId = sourceServerId;
         this.updateOp();
      }
   }

   public void setPlayerId(int playerId) {
      if (playerId != this.playerId) {
         this.playerId = playerId;
         this.updateOp();
      }
   }

   public void setPlayerName(String playerName) {
      if (!playerName.equals(this.playerName)) {
         this.playerName = playerName;
         this.updateOp();
      }
   }

   public boolean isShowVip() {
      return this.showVip;
   }

   public void setShowVip(boolean showVip) {
      if (this.showVip != showVip) {
         this.showVip = showVip;
         this.updateOp();
      }
   }

   public int getSecondTitle() {
      return this.secondTitle;
   }

   public void setSecondTitle(int secondTitle) {
      if (this.secondTitle != secondTitle) {
         this.secondTitle = secondTitle;
         this.updateOp();
      }
   }

   public int getPeakLv() {
      return this.peakLv;
   }

   public void setPeakLv(int peakLv) {
      if (this.peakLv != peakLv) {
         this.peakLv = peakLv;
         this.updateOp();
      }
   }

   public int getPrivilegeMine() {
      return this.privilegeMine;
   }

   public void setPrivilegeMine(int privilegeMine) {
      if (this.privilegeMine != privilegeMine) {
         this.privilegeMine = privilegeMine;
         this.updateOp();
      }
   }

   public int getPalaceTitle() {
      return this.palaceTitle;
   }

   public void setPalaceTitle(int palaceTitle) {
      if (this.palaceTitle != palaceTitle) {
         this.palaceTitle = palaceTitle;
         this.updateOp();
      }
   }

   public long getFirstYearTreasureNum() {
      return this.firstYearTreasureNum;
   }

   public void setFirstYearTreasureNum(long firstYearTreasureNum) {
      if (this.firstYearTreasureNum != firstYearTreasureNum) {
         this.firstYearTreasureNum = firstYearTreasureNum;
         this.updateOp();
      }
   }

   public long getChineseNewYearTreasureNum() {
      return this.chineseNewYearTreasureNum;
   }

   public void setChineseNewYearTreasureNum(long chineseNewYearTreasureNum) {
      if (this.chineseNewYearTreasureNum != chineseNewYearTreasureNum) {
         this.chineseNewYearTreasureNum = chineseNewYearTreasureNum;
         this.updateOp();
      }
   }

   public int getQqWanKaLv() {
      return this.qqWanKaLv;
   }

   public void setQqWanKaLv(int qqWanKaLv) {
      if (this.qqWanKaLv != qqWanKaLv) {
         this.qqWanKaLv = qqWanKaLv;
         this.updateOp();
      }
   }

   public String getQqLogo() {
      return this.qqLogo;
   }

   public void setQqLogo(String qqLogo) {
      if (!Objects.equals(this.qqLogo, qqLogo)) {
         this.qqLogo = qqLogo;
         this.updateOp();
      }
   }

   public CommonMsg.PlayerInfo.Builder toPlayerInfoBuild() {
      CommonMsg.PlayerInfo.Builder playerInfo = CommonMsg.PlayerInfo.newBuilder();
      playerInfo.setPlayerId(this.playerId);
      playerInfo.setPlayerName(this.playerName);
      playerInfo.setSex(this.sex);
      playerInfo.setLevel(this.lv);
      playerInfo.setVipLv(this.vipLev);
      playerInfo.setHead(this.headId);
      playerInfo.setHeadFrame(this.headFrame);
      playerInfo.setPower(this.combatPower);
      playerInfo.setShowVip(this.showVip);
      playerInfo.setPalaceTitle(this.palaceTitle);
      playerInfo.setQqWanKaLv(this.qqWanKaLv);
      playerInfo.setQqLogo(this.qqLogo);
      return playerInfo;
   }

   public FriendMsg.Friend_Info.Builder toFriendInfoBuild() {
      FriendMsg.Friend_Info.Builder builder = FriendMsg.Friend_Info.newBuilder();
      builder.setPlayerId(this.getPlayerId());
      builder.setPlayerName(this.getPlayerName());
      builder.setSex(this.getSex());
      builder.setLv(this.getLv());
      builder.setVipLv(this.getVipLev());
      builder.setHead(this.getHeadId());
      builder.setHeadFrame(this.getHeadFrame());
      builder.setFight(this.getCombatPower());
      builder.setOffline(0);
      builder.setServerId(this.getServerId());
      builder.setShowVip(this.isShowVip());
      builder.setQqWanKaLv(this.qqWanKaLv);
      builder.setQqLogo(this.qqLogo);
      return builder;
   }
}
