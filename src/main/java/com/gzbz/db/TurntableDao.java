package com.gzbz.db;

import com.gzbz.protobuf.TurntableMsg;
import com.gzbz.util.TempUtil;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_activity_turntable",
   resultType = 0,
   selectKey = {"playerId"}
)
public class TurntableDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "最大抽奖轮次"
   )
   public int maxRound = 1;
   @DBColumnAnno(
      comment = "Map<轮次，List<该轮已抽过的奖励>>",
      loadFun = "loadDrawRewardMap",
      saveFun = "saveDrawRewardMap",
      columnType = "VARCHAR"
   )
   public Map<Integer, List<Integer>> drawRewardMap = new HashMap();

   public void loadDrawRewardMap(String data) {
      this.drawRewardMap = TempUtil.strToIntMapList(data);
   }

   public String saveDrawRewardMap() {
      return JsonUtil.beanToJson(this.drawRewardMap);
   }

   public void clear() {
      this.drawRewardMap.clear();
      this.maxRound = 1;
      this.updateOp();
   }

   public List<TurntableMsg.DrawData> buildDrawData() {
      List<TurntableMsg.DrawData> dataList = new ArrayList();
      this.drawRewardMap.forEach((round, list) -> dataList.add(TurntableMsg.DrawData.newBuilder().setDrawRound(round).addAllDrawId(list).build()));
      return dataList;
   }
}
