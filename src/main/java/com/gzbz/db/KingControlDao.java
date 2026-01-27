package com.gzbz.db;

import com.gzbz.db.worldBean.KingControlData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_king_control",
   resultType = 0,
   selectKey = {"playerId"}
)
public class KingControlDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "登陆状态"
   )
   public boolean loginFlag = false;
   @DBColumnAnno(
      comment = "管制数据",
      columnType = "TEXT",
      loadFun = "loadControl",
      saveFun = "saveControl"
   )
   public KingControlData controlData = new KingControlData();

   public void loadControl(String data) {
      this.controlData = (KingControlData)JsonUtil.jsonToBean(data, KingControlData.class);
   }

   public String saveControl() {
      return JsonUtil.beanToJson(this.controlData);
   }
}
