package com.gzbz.db;

import com.gzbz.godBeast.bean.GodBeastRecordData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import misc.DataUtils;
import org.apache.commons.lang3.StringUtils;

@DBTableAnno(
   name = "tb_god_beast",
   resultType = 0,
   selectKey = {"playerId"}
)
public class GodBeastDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "孵化总次数"
   )
   public long hatchNum;
   @DBColumnAnno(
      comment = "已解锁得预告id",
      columnName = "unlockNoticeIds",
      columnType = "TEXT",
      loadFun = "loadUnlockNoticeIds",
      saveFun = "saveUnlockNoticeIds"
   )
   public Set<Integer> unlockNoticeIds = new HashSet();
   @DBColumnAnno(
      comment = "任务周期内完成次数(已弃用)",
      columnName = "taskCompleteNum",
      columnType = "TEXT",
      loadFun = "loadTaskCompleteNum",
      saveFun = "saveTaskCompleteNum"
   )
   public Map<Integer, Integer> taskCompleteNum = new HashMap();
   @DBColumnAnno(
      comment = "任务周期内获得积分",
      columnName = "taskScore",
      columnType = "TEXT",
      loadFun = "loadTaskScore",
      saveFun = "saveTaskScore"
   )
   public Map<Integer, Integer> taskScore = new HashMap();
   @DBColumnAnno(
      comment = "已领取的积分奖励",
      columnName = "recScoreRewards",
      columnType = "TEXT",
      loadFun = "loadRecScoreRewards",
      saveFun = "saveRecScoreRewards"
   )
   public Set<Integer> recScoreRewards = new HashSet();
   @DBColumnAnno(
      comment = "灵兽任务重置时间"
   )
   public long resetTime = 0L;
   @DBColumnAnno(
      comment = "个人抽奖记录",
      columnName = "recordList",
      columnType = "LONGTEXT",
      loadFun = "loadRecordList",
      saveFun = "saveRecordList"
   )
   public Deque<GodBeastRecordData> recordList = new LinkedList();
   @DBColumnAnno(
      comment = "品质抽奖次数用于计算保底",
      columnName = "qualityHatchNum",
      columnType = "TEXT",
      loadFun = "loadQualityHatchNum",
      saveFun = "saveQualityHatchNum"
   )
   public Map<Integer, Integer> qualityHatchNum = new HashMap();
   @DBColumnAnno(
      comment = "灵兽蛋购买次数"
   )
   public int eggBuyNum = 0;
   @DBColumnAnno(
      comment = "新的孵化次数,用于从新计算孵化次数用于绝版礼包"
   )
   public int newHatchNum = 0;
   @DBColumnAnno(
      comment = "学习技能次数"
   )
   public int learnSkillNum = 0;
   @DBColumnAnno(
      comment = "每若干次灵兽孵化，送一个灵兽内丹"
   )
   public int neiDanHatchNum = 0;

   public void loadUnlockNoticeIds(String data) {
      this.unlockNoticeIds = DataUtils.stringToIntSet(data);
   }

   public String saveUnlockNoticeIds() {
      return DataUtils.intSetToString(this.unlockNoticeIds);
   }

   public void loadTaskCompleteNum(String data) {
      this.taskCompleteNum = DataUtils.stringToInt_intMap(data);
   }

   public String saveTaskCompleteNum() {
      return DataUtils.int_intMapToString(this.taskCompleteNum);
   }

   public void loadTaskScore(String data) {
      this.taskScore = DataUtils.stringToInt_intMap(data);
   }

   public String saveTaskScore() {
      return DataUtils.int_intMapToString(this.taskScore);
   }

   public void loadRecScoreRewards(String data) {
      this.recScoreRewards = DataUtils.stringToIntSet(data);
   }

   public String saveRecScoreRewards() {
      return DataUtils.intSetToString(this.recScoreRewards);
   }

   public void loadRecordList(String data) {
      if (!StringUtils.isBlank(data)) {
         String[] split = data.split(",");
         if (split.length > 0) {
            for(String godBeastRecordStr : split) {
               String[] godBeastId_recTime = godBeastRecordStr.split(":");
               if (godBeastId_recTime.length >= 2) {
                  int godBeastId = Integer.parseInt(godBeastId_recTime[0]);
                  long recTime = Long.parseLong(godBeastId_recTime[1]);
                  int scoreId = godBeastId_recTime.length > 2 ? Integer.parseInt(godBeastId_recTime[2]) : 0;
                  GodBeastRecordData recordData = new GodBeastRecordData(godBeastId, recTime, scoreId);
                  this.recordList.offerLast(recordData);
               }
            }

         }
      }
   }

   public String saveRecordList() {
      if (this.recordList.isEmpty()) {
         return "";
      } else {
         StringBuilder stringBuilder = new StringBuilder();

         for(GodBeastRecordData recordData : this.recordList) {
            stringBuilder.append(recordData.godBeastId + ":" + recordData.recTime + ":" + recordData.scoreId + ",");
         }

         if (stringBuilder.length() > 0) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
         }

         return stringBuilder.toString();
      }
   }

   public void loadQualityHatchNum(String data) {
      this.qualityHatchNum = DataUtils.stringToInt_intMap(data);
   }

   public String saveQualityHatchNum() {
      return DataUtils.int_intMapToString(this.qualityHatchNum);
   }
}
