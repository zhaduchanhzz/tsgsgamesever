package com.yy.db;

import com.google.common.base.Splitter;
import com.gzbz.megerWar.bean.MergeWarGameData;
import com.gzbz.megerWar.bean.MergeWarPromoteData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import misc.JsonUtil;
import model.ModelColumnAnno;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_cross_core_war",
   dbType = 2,
   resultType = 0,
   selectKey = {"group"}
)
public class CrossCoreWarDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "所属分区"
   )
   public int group;
   @DBColumnAnno(
      comment = "初始化"
   )
   public boolean hadInit;
   @ModelColumnAnno(
      comment = "配置表组"
   )
   public int modelGroup;
   @DBColumnAnno(
      comment = "开启时间"
   )
   public int startTime;
   @DBColumnAnno(
      comment = "开启类型"
   )
   public int type;
   @DBColumnAnno(
      comment = "地图id"
   )
   public int chapterId;
   @DBColumnAnno(
      comment = "活动阶段"
   )
   public int stage;
   @DBColumnAnno(
      comment = "阶段内小状态"
   )
   public int subState;
   @DBColumnAnno(
      comment = "第一阶段开启时间"
   )
   public int firstOpenTime;
   @DBColumnAnno(
      comment = "第二阶段开启时间"
   )
   public int secondOpenTime;
   @DBColumnAnno(
      comment = "结束时间"
   )
   public int endTime;
   @DBColumnAnno(
      comment = "第一阶段奖励发送情况"
   )
   public boolean hadFirstReward;
   @DBColumnAnno(
      comment = "第二阶段奖励发送情况"
   )
   public boolean hadSecondReward;
   @DBColumnAnno(
      comment = "是否开启中"
   )
   public boolean isOpening;
   @DBColumnAnno(
      comment = "对战服务器和军团",
      columnType = "TEXT",
      loadFun = "loadPromoteData",
      saveFun = "savePromoteData"
   )
   public Map<Integer, MergeWarPromoteData> promoteData = new HashMap();
   @DBColumnAnno(
      comment = "玩法数据",
      columnType = "LONGTEXT",
      loadFun = "loadMergeWarData",
      saveFun = "saveMergeWarData"
   )
   public MergeWarGameData mergeWarData;
   @DBColumnAnno(
      comment = "玩家阵型",
      columnType = "LONGTEXT",
      loadFun = "loadPlayerArraying",
      saveFun = "savePlayerArraying"
   )
   public Map<Integer, byte[]> playerArraying = new HashMap();
   @DBColumnAnno(
      comment = "对战服务器和军团",
      columnType = "TEXT",
      loadFun = "loadTempPromote",
      saveFun = "saveTempPromote"
   )
   public Map<Integer, MergeWarPromoteData> tempPromote = new HashMap();

   public void reset() {
      this.hadInit = false;
      this.modelGroup = 0;
      this.startTime = 0;
      this.type = 0;
      this.chapterId = 0;
      this.stage = 0;
      this.subState = 0;
      this.firstOpenTime = 0;
      this.secondOpenTime = 0;
      this.endTime = 0;
      this.hadFirstReward = false;
      this.hadSecondReward = false;
      this.isOpening = false;
      this.promoteData.clear();
      this.mergeWarData = null;
      this.playerArraying.clear();
   }

   public void loadPromoteData(String string) {
      if (!StringUtils.isEmpty(string)) {
         for(String str : Splitter.on("|").splitToList(string)) {
            MergeWarPromoteData data = new MergeWarPromoteData();
            data.decode(str);
            this.promoteData.put(data.serverId, data);
         }

      }
   }

   public String savePromoteData() {
      StringBuilder stringBuilder = new StringBuilder();

      for(Map.Entry<Integer, MergeWarPromoteData> entry : this.promoteData.entrySet()) {
         String string = ((MergeWarPromoteData)entry.getValue()).encode();
         stringBuilder.append(string).append("|");
      }

      if (stringBuilder.length() > 0) {
         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }

   public void loadMergeWarData(String data) {
      this.mergeWarData = (MergeWarGameData)JsonUtil.jsonToBean(data, MergeWarGameData.class);
   }

   public String saveMergeWarData() {
      return JsonUtil.beanToJson(this.mergeWarData);
   }

   public void loadPlayerArraying(String str) {
      this.playerArraying = JsonUtil.jsonToMap(str, Integer.class, byte[].class);
   }

   public String savePlayerArraying() {
      return JsonUtil.beanToJson(this.playerArraying);
   }

   public void loadTempPromote(String string) {
      if (!StringUtils.isEmpty(string)) {
         for(String str : Splitter.on("|").splitToList(string)) {
            MergeWarPromoteData data = new MergeWarPromoteData();
            data.decode(str);
            this.tempPromote.put(data.serverId, data);
         }

      }
   }

   public String saveTempPromote() {
      StringBuilder stringBuilder = new StringBuilder();

      for(Map.Entry<Integer, MergeWarPromoteData> entry : this.tempPromote.entrySet()) {
         String string = ((MergeWarPromoteData)entry.getValue()).encode();
         stringBuilder.append(string).append("|");
      }

      if (stringBuilder.length() > 0) {
         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }
}
