package com.gzbz.db;

import com.alibaba.fastjson.JSON;
import com.gzbz.model.fun.ResourceModel;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_battle_chapter",
   selectKey = {"playerId"}
)
public class BattleChapterDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "最新完成关卡ID"
   )
   public int chapterId;
   @DBColumnAnno(
      comment = "挂机开始时间"
   )
   public long startTime;
   @DBColumnAnno(
      comment = "累计开始时间"
   )
   public long settleTime;
   @DBColumnAnno(
      comment = "累计分钟数"
   )
   public int settleMinutes;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadHangupAwards",
      saveFun = "saveHangupAwards"
   )
   public List<ResourceModel> settleAwards = new ArrayList();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadolTakedAwardIds",
      saveFun = "saveolTakedAwardIds"
   )
   public List<Integer> olTakedAwardIds = new ArrayList();
   @DBColumnAnno(
      comment = "记录时间点"
   )
   public long olRecordTime;
   @DBColumnAnno(
      comment = "总累积时间"
   )
   public long olCumTime;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadCommonAwards",
      saveFun = "saveCommonAwards"
   )
   public List<Integer> commonAwards = new ArrayList();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadBonusAwards",
      saveFun = "saveBonusAwards"
   )
   public List<Integer> bonusAwards = new ArrayList();

   public void loadHangupAwards(String data) {
      this.settleAwards = JsonUtil.jsonToList(data, ResourceModel.class);
   }

   public String saveHangupAwards() {
      return JSON.toJSONString(this.settleAwards);
   }

   public void loadolTakedAwardIds(String data) {
      this.olTakedAwardIds = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveolTakedAwardIds() {
      return JSON.toJSONString(this.olTakedAwardIds);
   }

   public void loadCommonAwards(String data) {
      this.commonAwards = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveCommonAwards() {
      return JSON.toJSONString(this.commonAwards);
   }

   public void loadBonusAwards(String data) {
      this.bonusAwards = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveBonusAwards() {
      return JSON.toJSONString(this.bonusAwards);
   }

   public void updateHangupAwards(ResourceModel addModel) {
      addModel.addResourceToList(this.settleAwards);
   }
}
