package com.gzbz.db;

import com.gzbz.db.bean.HouseKeeperData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_house_keeper",
   resultType = 0,
   selectKey = {"playerId"}
)
public class HouseKeeperDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "选项数据",
      columnType = "TEXT",
      loadFun = "loadHouseKeeperDatas",
      saveFun = "saveHouseKeeperDatas"
   )
   public Map<Integer, HouseKeeperData> houseKeeperDatas = new HashMap();

   public void loadHouseKeeperDatas(String data) {
      this.houseKeeperDatas = JsonUtil.jsonToMap(data, Integer.class, HouseKeeperData.class);
   }

   public String saveHouseKeeperDatas() {
      return JsonUtil.beanToJson(this.houseKeeperDatas);
   }
}
