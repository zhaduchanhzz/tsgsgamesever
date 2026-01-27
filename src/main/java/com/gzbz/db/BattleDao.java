package com.gzbz.db;

import com.gzbz.battle.scene.BattleScene;
import com.gzbz.model.fun.ResourceModel;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_battle",
   resultType = 2,
   selectKey = {"playerId"},
   mapKey = {"type"}
)
public class BattleDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "战斗类型"
   )
   public int type;
   @DBColumnAnno(
      comment = "是否需要记录"
   )
   public boolean needRecord = false;
   @DBColumnAnno(
      comment = "配置表id"
   )
   public int modelId = 0;
   @DBColumnAnno(
      comment = "buffId"
   )
   public int buffId = 0;
   @DBColumnAnno(
      comment = "战斗状态0为已结束,1为战斗中,2为已全部通关"
   )
   public int status = 1;
   @DBColumnAnno(
      comment = "记录id"
   )
   public int recordId = -1;
   @DBColumnAnno(
      comment = "参数",
      loadFun = "loadParams",
      saveFun = "saveParams"
   )
   public List<Integer> params = new ArrayList();
   @DBColumnAnno(
      columnType = "MEDIUMBLOB",
      comment = "对战记录"
   )
   public byte[] stream;
   @DBColumnAnno(
      columnType = "TEXT",
      comment = "奖励",
      loadFun = "loadRewards",
      saveFun = "saveRewards"
   )
   public List<ResourceModel> rewards = new ArrayList();
   @DBColumnAnno(
      comment = "是否需要跳过战斗"
   )
   public boolean isSkip = false;
   @DBColumnAnno(
      comment = "战斗开始时间"
   )
   public Timestamp battleTime = new Timestamp(System.currentTimeMillis());
   @DBColumnAnno(
      comment = "战斗总消耗时间"
   )
   public long totalTime;
   @DBColumnAnno(
      comment = "服务器当次自动打波次"
   )
   public int autoBattleWave = 0;
   @DBColumnAnno(
      columnType = "MEDIUMBLOB",
      comment = "当前左方队伍信息(保留buff以及各种状态)"
   )
   public byte[] leftTeam;
   @DBColumnAnno(
      skip = true
   )
   public BattleScene scene;
   @DBColumnAnno(
      skip = true
   )
   public boolean needSendMsg = true;
   @DBColumnAnno(
      skip = true
   )
   public boolean background = false;
   @DBColumnAnno(
      skip = true
   )
   public boolean autoSettle = false;
   @DBColumnAnno(
      skip = true
   )
   public long beforeHp = 0L;
   public static final int STATUS_END = 0;
   public static final int STATUS_BATTLE = 1;
   public static final int STATUS_ALL_PASS = 2;

   public void loadParams(String dataStr) {
      this.params = JsonUtil.jsonToList(dataStr, Integer.class);
   }

   public String saveParams() {
      return JsonUtil.beanToJson(this.params);
   }

   public void loadRewards(String dataStr) {
      this.rewards = JsonUtil.jsonToList(dataStr, ResourceModel.class);
   }

   public String saveRewards() {
      return JsonUtil.beanToJson(this.rewards);
   }
}
