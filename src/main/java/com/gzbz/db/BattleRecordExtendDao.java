package com.gzbz.db;

import com.alibaba.fastjson.JSON;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_battle_record_extend",
   resultType = 5,
   mapKey = {"id"}
)
public class BattleRecordExtendDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "记录ID"
   )
   public int id;
   @DBColumnAnno(
      comment = "点赞玩家列表",
      columnType = "TEXT",
      loadFun = "loadThumbsUpJson",
      saveFun = "saveThumbsUpJson"
   )
   public List<Integer> thumbsUpList = new ArrayList();
   @DBColumnAnno(
      comment = "收藏玩家列表",
      columnType = "TEXT",
      loadFun = "loadCollectJson",
      saveFun = "saveCollectJson"
   )
   public List<Integer> collectList = new ArrayList();
   @DBColumnAnno(
      comment = "观看次数"
   )
   public int beWatchNum;
   @DBColumnAnno(
      comment = "分享次数"
   )
   public int beShareNum;
   @DBColumnAnno(
      comment = "被收藏次数"
   )
   public int beCollectNum;
   @DBColumnAnno(
      comment = "被点赞次数"
   )
   public int beThumbsUpNum;
   @DBColumnAnno(
      comment = "是否是通天塔保留记录"
   )
   public boolean isTowerRecord;
   @DBColumnAnno(
      comment = "最后分享时间"
   )
   public long lastShareTime;
   @DBColumnAnno(
      comment = "模块ID"
   )
   public long model;
   @DBColumnAnno(
      comment = "是否是炼狱塔保留记录"
   )
   public boolean isTrailRecord;
   @DBColumnAnno(
      comment = "创建时间"
   )
   public Timestamp createTime;

   public void loadThumbsUpJson(String data) {
      this.thumbsUpList = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveThumbsUpJson() {
      return JSON.toJSONString(this.thumbsUpList);
   }

   public void loadCollectJson(String data) {
      this.collectList = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveCollectJson() {
      return JSON.toJSONString(this.collectList);
   }
}
