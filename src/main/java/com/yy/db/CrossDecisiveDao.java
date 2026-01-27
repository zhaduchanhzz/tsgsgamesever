package com.yy.db;

import com.google.common.base.Splitter;
import com.yy.decisiveBattleMgr.CrossDecisiveHeroRecord;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_cross_decisive",
   dbType = 2,
   selectKey = {"group"}
)
public class CrossDecisiveDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "所属分区"
   )
   public int group;
   @DBColumnAnno(
      comment = "所有出场英雄总数量"
   )
   public int arrayingSum;
   @DBColumnAnno(
      comment = "总战斗次数"
   )
   public int fightSum;
   @DBColumnAnno(
      comment = "昨日所有出场英雄总数量"
   )
   public int lastArrayingSum;
   @DBColumnAnno(
      comment = "昨日总战斗次数"
   )
   public int lastFightSum;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "昨日统计信息",
      loadFun = "loadLastData",
      saveFun = "saveLastData"
   )
   public Map<Integer, CrossDecisiveHeroRecord> lastInfo = new HashMap();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      comment = "统计信息",
      loadFun = "loadData",
      saveFun = "saveData"
   )
   public Map<Integer, CrossDecisiveHeroRecord> totalInfo = new HashMap();
   @DBColumnAnno(
      comment = "选中buff阵营表Id"
   )
   public int targetBuffNationId;

   public void loadLastData(String string) {
      if (!StringUtils.isEmpty(string)) {
         for(String str : Splitter.on("|").splitToList(string)) {
            CrossDecisiveHeroRecord data = new CrossDecisiveHeroRecord();
            data.decode(str);
            this.lastInfo.put(data.heroId, data);
         }

      }
   }

   public String saveLastData() {
      StringBuilder stringBuilder = new StringBuilder();

      for(Map.Entry<Integer, CrossDecisiveHeroRecord> entry : this.lastInfo.entrySet()) {
         String string = ((CrossDecisiveHeroRecord)entry.getValue()).encode();
         stringBuilder.append(string).append("|");
      }

      if (stringBuilder.length() > 0) {
         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }

   public void loadData(String string) {
      if (!StringUtils.isEmpty(string)) {
         for(String str : Splitter.on("|").splitToList(string)) {
            CrossDecisiveHeroRecord data = new CrossDecisiveHeroRecord();
            data.decode(str);
            this.totalInfo.put(data.heroId, data);
         }

      }
   }

   public String saveData() {
      StringBuilder stringBuilder = new StringBuilder();

      for(Map.Entry<Integer, CrossDecisiveHeroRecord> entry : this.totalInfo.entrySet()) {
         String string = ((CrossDecisiveHeroRecord)entry.getValue()).encode();
         stringBuilder.append(string).append("|");
      }

      if (stringBuilder.length() > 0) {
         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }
}
