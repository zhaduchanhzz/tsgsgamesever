package com.gzbz.db;

import com.gzbz.db.bean.DemonStrikesIntegralData;
import com.gzbz.db.bean.DemonStrikesLogData;
import com.gzbz.spring.ApplicationContextProvider;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.LinkedList;
import java.util.List;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_demon_strikes"
)
public class DemonStrikesDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true
   )
   public int playerId;
   @DBColumnAnno(
      comment = "当前参与的赛季开启时间"
   )
   public int joinSeasonTime;
   @DBColumnAnno(
      comment = "进攻令恢复时间"
   )
   public int atkRecoverTime;
   @DBColumnAnno(
      comment = "迁移令恢复时间"
   )
   public int moveRecoverTime;
   @DBColumnAnno(
      comment = "最后一次领取奖励时间"
   )
   public int rewardTime;
   @DBColumnAnno(
      comment = "积分信息",
      columnType = "TEXT",
      loadFun = "loadIntegralData",
      saveFun = "saveIntegralData"
   )
   public DemonStrikesIntegralData integralData = new DemonStrikesIntegralData();
   @DBColumnAnno(
      comment = "我的日志",
      columnType = "TEXT",
      loadFun = "loadLogList",
      saveFun = "saveLogList"
   )
   public LinkedList<DemonStrikesLogData> logList = new LinkedList();

   public void loadIntegralData(String data) {
      this.integralData = (DemonStrikesIntegralData)JsonUtil.jsonToBean(data, DemonStrikesIntegralData.class);
   }

   public String saveIntegralData() {
      return JsonUtil.beanToJson(this.integralData);
   }

   public void loadLogList(String data) {
      this.logList.clear();
      List<DemonStrikesLogData> list = JsonUtil.jsonToList(data, DemonStrikesLogData.class);
      this.logList.addAll(list);
   }

   public String saveLogList() {
      return JsonUtil.beanToJson(this.logList);
   }

   public void addLog(DemonStrikesLogData logData) {
      int totalSize = this.logList.size() + 1;
      int delNum = totalSize - ApplicationContextProvider.getConfigInt("demonHistoryLimit", 10);
      if (delNum > 0) {
         for(int i = 0; i < delNum; ++i) {
            this.logList.removeLast();
         }
      }

      this.logList.addFirst(logData);
   }
}
