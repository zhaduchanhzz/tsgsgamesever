package com.gzbz.db;

import com.google.common.base.Splitter;
import com.gzbz.db.bean.HeroAdvanceNoticeData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_hero_advance_notice",
   resultType = 0,
   selectKey = {"playerId"}
)
public class HeroAdvanceNoticedDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "玩法数据",
      columnType = "LONGTEXT",
      loadFun = "loadNoticeData",
      saveFun = "saveNoticeData"
   )
   public Map<Integer, HeroAdvanceNoticeData> advanceNoticeDataMap = new HashMap();

   public void loadNoticeData(String string) {
      if (!StringUtils.isEmpty(string)) {
         for(String str : Splitter.on("|").splitToList(string)) {
            HeroAdvanceNoticeData data = new HeroAdvanceNoticeData();
            data.decode(str);
            this.advanceNoticeDataMap.put(data.id, data);
         }

      }
   }

   public String saveNoticeData() {
      StringBuilder stringBuilder = new StringBuilder();

      for(Map.Entry<Integer, HeroAdvanceNoticeData> entry : this.advanceNoticeDataMap.entrySet()) {
         String string = ((HeroAdvanceNoticeData)entry.getValue()).encode();
         stringBuilder.append(string).append("|");
      }

      if (stringBuilder.length() > 0) {
         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }
}
