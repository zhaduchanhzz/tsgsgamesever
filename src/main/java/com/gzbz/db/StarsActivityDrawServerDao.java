package com.gzbz.db;

import com.gzbz.model.fun.ResourceModel;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;
import misc.DateUtil;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_stars_activity_draw_server",
   resultType = 4
)
public class StarsActivityDrawServerDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      isAutoInc = true
   )
   public int id;
   @DBColumnAnno(
      comment = "玩家名字"
   )
   public String playerName;
   @DBColumnAnno(
      comment = "奖励",
      columnType = "TEXT",
      loadFun = "loadRewards",
      saveFun = "saveRewards"
   )
   public List<ResourceModel> rewards = new ArrayList();
   @DBColumnAnno(
      comment = "时间"
   )
   public int createTime = DateUtil.getIntTime(System.currentTimeMillis());

   public void loadRewards(String data) {
      this.rewards = JsonUtil.jsonToList(data, ResourceModel.class);
   }

   public String saveRewards() {
      return JsonUtil.listToJson(this.rewards);
   }
}
