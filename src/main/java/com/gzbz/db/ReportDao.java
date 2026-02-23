package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashSet;
import java.util.Set;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_report",
   resultType = 0,
   selectKey = {"playerId"}
)
public class ReportDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "血量"
   )
   public double hp = (double)-1.0F;
   @DBColumnAnno(
      comment = "举报次数"
   )
   public int count;
   @DBColumnAnno(
      comment = "举报时间"
   )
   public int reportTime;
   @DBColumnAnno(
      comment = "血量为零时的等级"
   )
   public int lv;
   @DBColumnAnno(
      comment = "血量为零是的通天塔层数"
   )
   public int towerLayer;
   @DBColumnAnno(
      comment = "哪些玩家举报了自己",
      columnType = "TEXT",
      loadFun = "loadReports",
      saveFun = "saveReports"
   )
   public Set<Integer> reportIdSet = new HashSet();

   public void loadReports(String str) {
      this.reportIdSet = JsonUtil.jsonToBean(str, HashSet.class);
   }

   public String saveReports() {
      return JsonUtil.beanToJson(this.reportIdSet);
   }
}
