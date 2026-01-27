package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashSet;
import java.util.Set;
import misc.DataUtils;

@DBTableAnno(
   name = "tb_qq_big_player",
   resultType = 0,
   selectKey = {"playerId"}
)
public class QqBigPlayerDao extends DBDao {
   @DBColumnAnno(
      columnName = "playerId",
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "是否领取注册礼包 1:已领取"
   )
   public int isRecRegGift;
   @DBColumnAnno(
      comment = "是否领取每日活跃度礼包"
   )
   public int isRecDailyActGift;
   @DBColumnAnno(
      comment = "已领取的等级成长礼包",
      columnName = "recLevelGifts",
      columnType = "TEXT",
      loadFun = "loadRecLevelGifts",
      saveFun = "saveRecLevelGifts"
   )
   public Set<Integer> recLevelGifts = new HashSet();
   @DBColumnAnno(
      comment = "今日咖值"
   )
   public long score;
   @DBColumnAnno(
      comment = "是否被超级大玩咖绑定且在有效期内"
   )
   public boolean binding;
   @DBColumnAnno(
      comment = "充值加赠比例，百分比。例如，20代表20%"
   )
   public int discount;
   @DBColumnAnno(
      comment = "剩余付费加赠次数。-1代表不限次"
   )
   public int payReturnCount;
   @DBColumnAnno(
      comment = "是否使用了特权体验卡"
   )
   public boolean isUsingCard;
   @DBColumnAnno(
      comment = "使用特权卡时，返回过期时间戳（秒）"
   )
   public long cardExpireTs;
   @DBColumnAnno(
      comment = "是否显示过特权标识,用于判断要不要显示过期特权标识"
   )
   public int hasShowLogo;
   @DBColumnAnno(
      comment = "已领取的绝版专属特权礼包",
      columnName = "recWanKaLvBox",
      columnType = "TEXT",
      loadFun = "loadRecWanKaLvBox",
      saveFun = "saveRecWanKaLvBox"
   )
   public Set<Integer> recWanKaLvBox = new HashSet();
   @DBColumnAnno(
      comment = "领取的专属周礼",
      columnName = "recWeekGifts",
      columnType = "TEXT",
      loadFun = "loadRecWeekGifts",
      saveFun = "saveRecWeekGifts"
   )
   public Set<Integer> recWeekGifts = new HashSet();

   public void loadRecLevelGifts(String data) {
      this.recLevelGifts = DataUtils.stringToIntSet(data);
   }

   public String saveRecLevelGifts() {
      return DataUtils.intSetToString(this.recLevelGifts);
   }

   public void loadRecWanKaLvBox(String data) {
      this.recWanKaLvBox = DataUtils.stringToIntSet(data);
   }

   public String saveRecWanKaLvBox() {
      return DataUtils.intSetToString(this.recWanKaLvBox);
   }

   public void loadRecWeekGifts(String data) {
      this.recWeekGifts = DataUtils.stringToIntSet(data);
   }

   public String saveRecWeekGifts() {
      return DataUtils.intSetToString(this.recWeekGifts);
   }
}
