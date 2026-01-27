package com.yy.db;

import com.yy.decisiveBattleMgr.CrossDecisivePlayerData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_decisive_battle_player",
   dbType = 2,
   resultType = 2,
   mapKey = {"playerId"},
   selectKey = {"group"}
)
public class CrossDecisivePlayerDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "playerId"
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "所属分区"
   )
   public int group;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "玩家信息",
      loadFun = "loadData",
      saveFun = "saveData"
   )
   public CrossDecisivePlayerData playerData = new CrossDecisivePlayerData();

   public void loadData(String data) {
      this.playerData = (CrossDecisivePlayerData)JsonUtil.jsonToBean(data, CrossDecisivePlayerData.class);
   }

   public String saveData() {
      return JsonUtil.beanToJson(this.playerData);
   }
}
