package com.gzbz.db;

import com.gzbz.db.baseDao.AddUpAndConBaseDao;
import db.DBColumnAnno;
import db.DBTableAnno;
import java.util.HashSet;
import java.util.Set;
import misc.DataUtils;

@DBTableAnno(
   name = "tb_activity_sign_in",
   resultType = 0,
   selectKey = {"playerId"}
)
public class FourteenSignInDao extends AddUpAndConBaseDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "累计登录天数"
   )
   public int loginDay;
   @DBColumnAnno(
      comment = "今天是否已经累计天数"
   )
   public boolean isLogin = false;
   @DBColumnAnno(
      comment = "可补签次数"
   )
   public int retroactiveNum;
   @DBColumnAnno(
      comment = "今日获得的补签次数"
   )
   public int todayGetRetroactiveNum;
   @DBColumnAnno(
      comment = "已领取的天数奖励",
      loadFun = "loadGotDay",
      saveFun = "saveGotDay",
      columnType = "VARCHAR"
   )
   public Set<Integer> gotDay = new HashSet();

   public void loadGotDay(String data) {
      this.gotDay = DataUtils.stringToIntSet(data);
   }

   public String saveGotDay() {
      return DataUtils.intSetToString(this.gotDay);
   }

   public void clean() {
      this.loginDay = 0;
      this.isLogin = false;
      this.gotDay.clear();
      this.retroactiveNum = 0;
      this.todayGetRetroactiveNum = 0;
      this.updateOp();
   }
}
