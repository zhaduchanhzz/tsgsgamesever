package com.yy.db;

import com.yy.peak.bean.PlayerPeakData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_peak_player",
   dbType = 2,
   resultType = 2,
   mapKey = {"playerId"},
   selectKey = {"groupId"}
)
public class CrossPeakPlayerDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "playerId"
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "group"
   )
   public int groupId;
   @DBColumnAnno(
      comment = "玩家当前所在服务器id"
   )
   public int sourceServerId;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "巅峰对决玩家信息",
      loadFun = "loadData",
      saveFun = "saveData"
   )
   public PlayerPeakData peakData;

   public void loadData(String data) {
      this.peakData = (PlayerPeakData)JsonUtil.jsonToBean(data, PlayerPeakData.class);
   }

   public String saveData() {
      return JsonUtil.beanToJson(this.peakData);
   }
}
