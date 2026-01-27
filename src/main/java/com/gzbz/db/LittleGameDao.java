package com.gzbz.db;

import com.gzbz.db.bean.BubbleGameData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_little_game",
   resultType = 0,
   selectKey = {"playerId"}
)
public class LittleGameDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "净化爬塔-通关章节"
   )
   public int towerChapter = 0;
   @DBColumnAnno(
      comment = "净化爬塔-通关关卡"
   )
   public int towerlevel = 0;
   @DBColumnAnno(
      comment = "净化爬塔-章节宝箱领取情况",
      loadFun = "loadTowerRewardFlag",
      saveFun = "saveTowerRewardFlag"
   )
   public Map<Integer, Integer> towerRewardFlag = new HashMap();
   @DBColumnAnno(
      comment = "泡泡龙小游戏数据",
      loadFun = "loadBubbleData",
      saveFun = "saveBubbleData",
      columnType = "TEXT"
   )
   public BubbleGameData bubbleGameData = new BubbleGameData();

   public void loadTowerRewardFlag(String data) {
      this.towerRewardFlag = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveTowerRewardFlag() {
      return JsonUtil.beanToJson(this.towerRewardFlag);
   }

   public void loadBubbleData(String str) {
      this.bubbleGameData = (BubbleGameData)JsonUtil.jsonToBean(str, BubbleGameData.class);
   }

   public String saveBubbleData() {
      return JsonUtil.beanToJson(this.bubbleGameData);
   }
}
