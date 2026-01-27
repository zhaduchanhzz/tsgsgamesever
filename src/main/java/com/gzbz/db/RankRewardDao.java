package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_rank_reward",
   resultType = 2,
   selectKey = {"type"},
   mapKey = {"modelId"}
)
public class RankRewardDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "排行类型"
   )
   public int type;
   @DBColumnAnno(
      isPrimary = true,
      comment = "配置表id"
   )
   public int modelId;
   @DBColumnAnno(
      comment = "完成信息列表playerId:finishTime",
      loadFun = "loadFinishDataList",
      saveFun = "saveFinishDataList"
   )
   public Map<Integer, Integer> finishDataList = new HashMap();

   public void loadFinishDataList(String data) {
      this.finishDataList = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveFinishDataList() {
      return JsonUtil.beanToJson(this.finishDataList);
   }
}
