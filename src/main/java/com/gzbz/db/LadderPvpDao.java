package com.gzbz.db;

import com.alibaba.fastjson.JSON;
import com.gzbz.db.bean.LadderRecordData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_ladder_pvp",
   resultType = 0,
   selectKey = {"playerId"}
)
public class LadderPvpDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "点赞得玩家列表",
      columnName = "likePlayers",
      columnType = "TEXT",
      loadFun = "loadLikePlayersJson",
      saveFun = "saveLikePlayersJson"
   )
   public List<Integer> likePlayers = new ArrayList();
   @DBColumnAnno(
      comment = "玩家天梯赛累计被点赞次数"
   )
   public int ladderLikeNum;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadRecord",
      saveFun = "saveRecord",
      comment = "挑战记录-20条"
   )
   public List<LadderRecordData> record = new ArrayList();

   public void loadRecord(String data) {
      this.record = JsonUtil.jsonToList(data, LadderRecordData.class);
   }

   public String saveRecord() {
      return JsonUtil.object2String(this.record);
   }

   public void loadLikePlayersJson(String data) {
      if (!StringUtils.isEmpty(data)) {
         this.likePlayers = JsonUtil.jsonToList(data, Integer.class);
      }
   }

   public String saveLikePlayersJson() {
      return JSON.toJSONString(this.likePlayers);
   }

   public List<LadderRecordData> addRecord(LadderRecordData data) {
      List<LadderRecordData> delList = new ArrayList();
      this.record.add(data);

      while(this.record.size() > 20) {
         delList.add(this.record.get(0));
         this.record.remove(0);
      }

      this.updateOp();
      return delList;
   }

   public void reset() {
      this.record.clear();
      this.updateOp();
   }
}
