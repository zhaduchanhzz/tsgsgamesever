package com.yy.db;

import com.yy.redCliff.HistoryFightData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_red_cliff_history",
   dbType = 2,
   selectKey = {"serverId"}
)
public class RedCliffHistoryDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "serverId"
   )
   public int serverId;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "历史战绩",
      loadFun = "loadData",
      saveFun = "saveData"
   )
   public List<HistoryFightData> historyList = new ArrayList();

   public void loadData(String data) {
      this.historyList = JsonUtil.jsonToList(data, HistoryFightData.class);
   }

   public String saveData() {
      return JsonUtil.object2String(this.historyList);
   }
}
