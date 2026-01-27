package com.gzbz.db;

import cn.hutool.core.collection.ConcurrentHashSet;
import com.gzbz.union.bean.UnionDailyGuessChapterInfo;
import com.gzbz.union.bean.UnionGateBattleRecordInfo;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.lang3.StringUtils;

@DBTableAnno(
   name = "tb_union_daily_guess",
   resultType = 5,
   mapKey = {"unionId"}
)
public class UnionDailyGuessDao extends DBDao {
   @DBColumnAnno(
      columnName = "unionId",
      isPrimary = true,
      comment = "军团id"
   )
   public int unionId;
   @DBColumnAnno(
      columnName = "unionLv",
      comment = "刷新时的军团等级,军团猜门中的军团等级已这个为准"
   )
   public int unionLv;
   @DBColumnAnno(
      columnName = "chapterInfo",
      columnType = "TEXT",
      loadFun = "loadChapterInfo",
      saveFun = "saveChapterInfo",
      comment = "关卡信息,关卡id和传送门序号"
   )
   public ConcurrentHashMap<Integer, UnionDailyGuessChapterInfo> chapterInfo = new ConcurrentHashMap();
   @DBColumnAnno(
      columnName = "intoChapterPlayerIds",
      columnType = "TEXT",
      loadFun = "loadIntoChapterPlayerIds",
      saveFun = "saveIntoChapterPlayerIds",
      comment = "进入过副本的玩家id(String类型,隔开)"
   )
   public ConcurrentHashSet<Integer> intoChapterPlayerIds = new ConcurrentHashSet();
   @DBColumnAnno(
      columnName = "firstPassPlayerId",
      comment = "首通玩家id"
   )
   public int firstPassPlayerId;
   @DBColumnAnno(
      columnName = "completePlayerIds",
      columnType = "TEXT",
      loadFun = "loadCompletePlayerIds",
      saveFun = "saveCompletePlayerIds",
      comment = "通关玩家id,逗号隔开"
   )
   public ConcurrentHashSet<Integer> completePlayerIds = new ConcurrentHashSet();
   @DBColumnAnno(
      columnName = "resetTime",
      comment = "重置时间,每日零点重置"
   )
   public long resetTime;
   @DBColumnAnno(
      columnName = "battleRecord",
      columnType = "TEXT",
      loadFun = "loadBattleRecord",
      saveFun = "saveBattleRecord",
      comment = "通关战报"
   )
   public ConcurrentHashMap<Integer, UnionGateBattleRecordInfo> battleRecord = new ConcurrentHashMap();

   public void loadChapterInfo(String data) {
      if (!StringUtils.isBlank(data)) {
         String[] chapterInfoSplit = data.split(",");
         if (chapterInfoSplit.length > 0) {
            ConcurrentHashMap<Integer, UnionDailyGuessChapterInfo> chapterInfo_ = new ConcurrentHashMap();

            for(String chapterInfoStr : chapterInfoSplit) {
               String[] chapterId_portal = chapterInfoStr.split(":");
               if (chapterId_portal.length >= 4) {
                  int chapterId = Integer.parseInt(chapterId_portal[0]);
                  int nextChapterGrid = Integer.parseInt(chapterId_portal[1]);
                  int canPassBattle = Integer.parseInt(chapterId_portal[2]);
                  int mapGroup = Integer.parseInt(chapterId_portal[3]);
                  chapterInfo_.put(chapterId, new UnionDailyGuessChapterInfo(chapterId, nextChapterGrid, canPassBattle, mapGroup));
               }
            }

            this.chapterInfo = chapterInfo_;
         }
      }
   }

   public String saveChapterInfo() {
      StringBuilder chapterInfoStr = new StringBuilder();

      for(Map.Entry<Integer, UnionDailyGuessChapterInfo> chapterInfoEntry : this.chapterInfo.entrySet()) {
         UnionDailyGuessChapterInfo chapterInfo = (UnionDailyGuessChapterInfo)chapterInfoEntry.getValue();
         chapterInfoStr.append(chapterInfo.getChapterId() + ":" + chapterInfo.getNextChapterGrid() + ":" + chapterInfo.getCanPassBattle() + ":" + chapterInfo.getMapGroup() + ",");
      }

      if (chapterInfoStr.length() > 0) {
         chapterInfoStr.deleteCharAt(chapterInfoStr.length() - 1);
      }

      return chapterInfoStr.toString();
   }

   public void loadIntoChapterPlayerIds(String data) {
      if (!StringUtils.isBlank(data)) {
         String[] playerIdSplit = data.split(",");
         if (playerIdSplit.length > 0) {
            ConcurrentHashSet<Integer> intoChapterPlayerIds_ = new ConcurrentHashSet();

            for(String playerIdStr : playerIdSplit) {
               intoChapterPlayerIds_.add(Integer.parseInt(playerIdStr));
            }

            this.intoChapterPlayerIds = intoChapterPlayerIds_;
         }
      }
   }

   public String saveIntoChapterPlayerIds() {
      StringBuilder playerIdsStr = new StringBuilder();

      for(Integer playerId : this.intoChapterPlayerIds) {
         playerIdsStr.append(playerId + ",");
      }

      if (playerIdsStr.length() > 0) {
         playerIdsStr.deleteCharAt(playerIdsStr.length() - 1);
      }

      return playerIdsStr.toString();
   }

   public void loadCompletePlayerIds(String data) {
      if (!StringUtils.isBlank(data)) {
         String[] playerIdSplit = data.split(",");
         if (playerIdSplit.length > 0) {
            ConcurrentHashSet<Integer> completePlayerIds_ = new ConcurrentHashSet();

            for(String playerIdStr : playerIdSplit) {
               completePlayerIds_.add(Integer.parseInt(playerIdStr));
            }

            this.completePlayerIds = completePlayerIds_;
         }
      }
   }

   public String saveCompletePlayerIds() {
      StringBuilder playerIdsStr = new StringBuilder();

      for(Integer playerId : this.completePlayerIds) {
         playerIdsStr.append(playerId + ",");
      }

      if (playerIdsStr.length() > 0) {
         playerIdsStr.deleteCharAt(playerIdsStr.length() - 1);
      }

      return playerIdsStr.toString();
   }

   public void loadBattleRecord(String data) {
      if (!StringUtils.isBlank(data)) {
         String[] battleRecordSplit = data.split(",");
         if (battleRecordSplit.length > 0) {
            ConcurrentHashMap<Integer, UnionGateBattleRecordInfo> battleRecordInfo_ = new ConcurrentHashMap();

            for(String battleRecordInfoStr : battleRecordSplit) {
               String[] battleRecord = battleRecordInfoStr.split(":");
               int chapterId = Integer.parseInt(battleRecord[0]);
               int playerId = Integer.parseInt(battleRecord[1]);
               long passTime = Long.parseLong(battleRecord[2]);
               int type = Integer.parseInt(battleRecord[3]);
               battleRecordInfo_.put(chapterId, new UnionGateBattleRecordInfo(chapterId, playerId, passTime, type));
            }

            this.battleRecord = battleRecordInfo_;
         }
      }
   }

   public String saveBattleRecord() {
      StringBuilder battleRecordStr = new StringBuilder();

      for(Map.Entry<Integer, UnionGateBattleRecordInfo> battleRecordInfoEntry : this.battleRecord.entrySet()) {
         UnionGateBattleRecordInfo battleRecordInfo = (UnionGateBattleRecordInfo)battleRecordInfoEntry.getValue();
         battleRecordStr.append(battleRecordInfo.getChapterId() + ":" + battleRecordInfo.getPlayerId() + ":" + battleRecordInfo.getPassTime() + ":" + battleRecordInfo.getType() + ",");
      }

      if (battleRecordStr.length() > 0) {
         battleRecordStr.deleteCharAt(battleRecordStr.length() - 1);
      }

      return battleRecordStr.toString();
   }
}
