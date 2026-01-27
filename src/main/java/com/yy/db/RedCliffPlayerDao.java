package com.yy.db;

import com.yy.redCliff.PlayerRedCliffData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_red_cliff",
   dbType = 2,
   resultType = 2,
   mapKey = {"playerId"},
   selectKey = {"groupId"}
)
public class RedCliffPlayerDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "group"
   )
   public int groupId;
   @DBColumnAnno(
      comment = "玩家服务器"
   )
   public int sourceServerId;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "赤壁之战玩家信息",
      loadFun = "loadData",
      saveFun = "saveData"
   )
   public PlayerRedCliffData playerData;

   public void loadData(String data) {
      this.playerData = (PlayerRedCliffData)JsonUtil.jsonToBean(data, PlayerRedCliffData.class);
   }

   public String saveData() {
      return JsonUtil.beanToJson(this.playerData);
   }
}
