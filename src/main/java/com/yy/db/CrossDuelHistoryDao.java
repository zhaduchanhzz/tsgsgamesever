package com.yy.db;

import com.gzbz.protobuf.DuelBattleMsg;
import com.yy.duelWar.DuelHistoryPlayerData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.JsonUtil;
import misc.MiscUtil;

@DBTableAnno(
   name = "tb_cross_duel_history",
   resultType = 2,
   selectKey = {"group"},
   mapKey = {"season"}
)
public class CrossDuelHistoryDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "分区ID"
   )
   public int group;
   @DBColumnAnno(
      isPrimary = true,
      comment = "第几届"
   )
   public int season;
   @DBColumnAnno(
      comment = "开始时间"
   )
   public int startTime;
   @DBColumnAnno(
      comment = "结束时间"
   )
   public int endTime;
   @DBColumnAnno(
      comment = "玩家列表",
      columnType = "LONGTEXT",
      loadFun = "loadPlayerData",
      saveFun = "savePlayerData"
   )
   public Map<Integer, DuelHistoryPlayerData> playerData = new HashMap();

   public void loadPlayerData(String data) {
      this.playerData = JsonUtil.jsonToMap(data, Integer.class, DuelHistoryPlayerData.class);
   }

   public String savePlayerData() {
      return JsonUtil.beanToJson(this.playerData);
   }

   public DuelBattleMsg.HistoryData.Builder buildMsg(List<Long> seasonPlayers) {
      DuelBattleMsg.HistoryData.Builder msg = DuelBattleMsg.HistoryData.newBuilder();
      msg.setEndTime(this.endTime);
      msg.setSeason(this.season);
      msg.setStartTime(this.startTime);

      for(DuelHistoryPlayerData historyPlayerData : this.playerData.values()) {
         long seasonPlayer = MiscUtil.comboInteger(this.season, historyPlayerData.playerId);
         msg.addPlayerData(historyPlayerData.buildMsg(seasonPlayers.contains(seasonPlayer)));
      }

      return msg;
   }
}
