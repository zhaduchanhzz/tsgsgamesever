package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;

public class PlayerPublicDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家Id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "服务器Id"
   )
   public int serverId;
   @DBColumnAnno(
      comment = "玩家等级"
   )
   public int lv = 1;
   @DBColumnAnno(
      comment = "玩家名称"
   )
   public String playerName = "";
   @DBColumnAnno(
      comment = "头像id"
   )
   public int head;
   @DBColumnAnno(
      comment = "军团id"
   )
   public int unionId;
   @DBColumnAnno(
      comment = "头像框"
   )
   public int headFrame;
   @DBColumnAnno(
      comment = "君主形象id"
   )
   public int monarchId;
   @DBColumnAnno(
      comment = "战力"
   )
   public long combat_power;
   @DBColumnAnno(
      comment = "性别"
   )
   public int sex;
   @DBColumnAnno(
      comment = "VIP等级"
   )
   public int vip_lv;
   @DBColumnAnno(
      comment = "军团活跃等级"
   )
   public int union_active_lv;
   @DBColumnAnno(
      comment = "军团贡献"
   )
   public int union_contribution;
   @DBColumnAnno(
      comment = "最后一次登出时间"
   )
   public long logoutTime;
   @DBColumnAnno(
      comment = "称号"
   )
   public int prestige;
   @DBColumnAnno(
      comment = "是否显示vip"
   )
   public boolean isShowVip = true;
   @DBColumnAnno(
      comment = "副称号"
   )
   public int secondTitle;
   @DBColumnAnno(
      comment = "段位"
   )
   public int peak_lv = 1;
   @DBColumnAnno(
      comment = "活跃"
   )
   public int active;
   @DBColumnAnno(
      comment = "解封时间(被封号到几时)"
   )
   public long banEndTime;
   @DBColumnAnno(
      comment = "矿场特权",
      isNotNull = true
   )
   public int privilege_mine;
   @DBColumnAnno(
      comment = "问鼎中原特权",
      isNotNull = true
   )
   public int privilege_kingcp;
   @DBColumnAnno(
      comment = "郡主府头衔",
      isNotNull = true
   )
   public int palaceTitle;
   @DBColumnAnno(
      comment = "qq大玩咖等级",
      isNotNull = true
   )
   public int qqWanKaLv = 0;
   @DBColumnAnno(
      comment = "qq大玩咖等级(不计算高阶玩咖特权,真正的等级)",
      isNotNull = true
   )
   public int realWanKaLv = 0;
   @DBColumnAnno(
      comment = "qq特权标识",
      isNotNull = true
   )
   public String qqLogo = "";

   public PlayerPublicDao() {
   }

   public PlayerPublicDao(PlayerPublicDao dao) {
      this.playerId = dao.playerId;
      this.serverId = dao.serverId;
      this.lv = dao.lv;
      this.playerName = dao.playerName;
      this.head = dao.head;
      this.unionId = dao.unionId;
      this.headFrame = dao.headFrame;
      this.monarchId = dao.monarchId;
      this.combat_power = dao.combat_power;
      this.sex = dao.sex;
      this.vip_lv = dao.vip_lv;
      this.logoutTime = dao.logoutTime;
      this.union_active_lv = dao.union_active_lv;
      this.union_contribution = dao.union_contribution;
      this.prestige = dao.prestige;
      this.isShowVip = dao.isShowVip;
      this.secondTitle = dao.secondTitle;
      this.peak_lv = dao.peak_lv;
      this.active = dao.active;
      this.banEndTime = dao.banEndTime;
      this.privilege_mine = dao.privilege_mine;
      this.privilege_kingcp = dao.privilege_kingcp;
      this.palaceTitle = dao.palaceTitle;
      this.qqWanKaLv = dao.qqWanKaLv;
      this.realWanKaLv = dao.realWanKaLv;
      this.qqLogo = dao.qqLogo;
   }
}
