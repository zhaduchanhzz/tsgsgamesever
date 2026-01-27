package com.gzbz.db;

import com.gzbz.gamePlayer.peak.bean.PeakBattleTotalData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_peak_battle_info",
   resultType = 4
)
public class PeakBattleTotalDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      isAutoInc = true,
      comment = "id"
   )
   public int id;
   @DBColumnAnno(
      comment = "战斗信息",
      columnType = "TEXT",
      loadFun = "loadData",
      saveFun = "saveData"
   )
   public PeakBattleTotalData data = new PeakBattleTotalData();

   public void loadData(String data) {
      this.data = (PeakBattleTotalData)JsonUtil.jsonToBean(data, PeakBattleTotalData.class);
   }

   public String saveData() {
      return JsonUtil.beanToJson(this.data);
   }
}
