package com.gzbz.db;

import com.gzbz.protobuf.PlayerMsg;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_client_tracking",
   resultType = 2,
   selectKey = {"playerId"},
   mapKey = {"trackingId"}
)
public class ClientTrackingDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "打点id"
   )
   public String trackingId;
   @DBColumnAnno(
      comment = "打点类型"
   )
   public String trackingType;
   @DBColumnAnno(
      comment = "是否已打点成功"
   )
   public boolean isTrack;
   @DBColumnAnno(
      columnType = "TEXT",
      comment = "打点参数",
      loadFun = "loadParams",
      saveFun = "saveParams"
   )
   public Map<String, String> params = new HashMap();

   public void loadParams(String data) {
      this.params = JsonUtil.jsonToMap(data, String.class, String.class);
   }

   public String saveParams() {
      return JsonUtil.beanToJson(this.params);
   }

   public PlayerMsg.ClientTracking.Builder buildMsg() {
      PlayerMsg.ClientTracking.Builder tracking = PlayerMsg.ClientTracking.newBuilder();
      tracking.setTrackId(this.trackingId);

      for(Map.Entry<String, String> entry : this.params.entrySet()) {
         tracking.addParam(PlayerMsg.ClientTrackingParam.newBuilder().setParamKey((String)entry.getKey()).setParamVal((String)entry.getValue()));
      }

      return tracking;
   }
}
