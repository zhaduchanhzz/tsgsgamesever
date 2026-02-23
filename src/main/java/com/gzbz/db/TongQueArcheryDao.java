package com.gzbz.db;

import com.gzbz.spring.ApplicationContextProvider;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashSet;
import java.util.Set;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_activity_archery",
   resultType = 0,
   selectKey = {"playerId"}
)
public class TongQueArcheryDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true
   )
   public int playerId;
   @DBColumnAnno(
      comment = "剩余箭矢"
   )
   public int arrowNum;
   @DBColumnAnno(
      comment = "累计环数"
   )
   public int point;
   @DBColumnAnno(
      comment = "今日祈愿列表id->是否祈愿",
      loadFun = "loadPrays",
      saveFun = "savePrays"
   )
   public Set<Integer> prays = new HashSet();
   @DBColumnAnno(
      comment = "是否已领取额外箭矢"
   )
   public boolean isGotExArrow;

   public void loadPrays(String data) {
      this.prays = JsonUtil.jsonToBean(data, HashSet.class);
   }

   public String savePrays() {
      return JsonUtil.beanToJson(this.prays);
   }

   public void reset() {
      this.arrowNum = ApplicationContextProvider.getConfigInt("archeryArrowNum", 0);
      this.isGotExArrow = false;
      this.prays.clear();
      this.updateOp();
   }
}
