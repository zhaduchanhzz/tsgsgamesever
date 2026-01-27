package com.gzbz.db;

import com.gzbz.db.bean.AdvertisementVnData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_advertisement",
   selectKey = {"playerId"},
   resultType = 0
)
public class AdvertisementDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "越南广告数据",
      columnType = "TEXT",
      loadFun = "loadVnData",
      saveFun = "saveVnData"
   )
   public Map<Integer, AdvertisementVnData> vnData = new HashMap();

   public void loadVnData(String data) {
      this.vnData = JsonUtil.jsonToMap(data, Integer.class, AdvertisementVnData.class);
   }

   public String saveVnData() {
      return JsonUtil.beanToJson(this.vnData);
   }
}
