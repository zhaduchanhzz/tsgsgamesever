package com.gzbz.db;

import com.gzbz.db.bean.PloughTechData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_ju_yi_hall"
)
public class JuYiHallDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "聚义厅等级"
   )
   public int level;
   @DBColumnAnno(
      comment = "聚义厅经验"
   )
   public int exp;
   @DBColumnAnno(
      comment = "聚义厅武将队伍",
      columnType = "TEXT",
      loadFun = "loadHeroTeam",
      saveFun = "saveHeroTeam"
   )
   public Set<Integer> heroTeam = new HashSet();
   @DBColumnAnno(
      comment = "聚义槽位格子",
      columnType = "TEXT",
      loadFun = "loadHeroGrids",
      saveFun = "saveHeroGrids"
   )
   public List<JuYiGrid> juYiGrids = new ArrayList();
   @DBColumnAnno(
      comment = "结义",
      columnType = "TEXT",
      loadFun = "loadJieYiInfo",
      saveFun = "saveJieYiInfo"
   )
   public Map<Integer, List<Integer>> jieYiInfo = new HashMap();
   @DBColumnAnno(
      comment = "地煞之力等级",
      columnType = "TEXT",
      loadFun = "loadHellLv",
      saveFun = "saveHellLv"
   )
   public Map<Integer, Integer> hellLvMap = new HashMap();
   @DBColumnAnno(
      comment = "天罡之力",
      columnType = "TEXT",
      loadFun = "loadPlough",
      saveFun = "savePlough"
   )
   public Map<Integer, PloughTechData> ploughMap = new HashMap();
   @DBColumnAnno(
      comment = "天罡之力重置次数"
   )
   public int ploughResetCount;
   @DBColumnAnno(
      comment = "聚义厅系统解锁时间"
   )
   public Timestamp unlockTime = new Timestamp(System.currentTimeMillis());

   public void loadHeroTeam(String data) {
      this.heroTeam = JsonUtil.jsonToBean(data, HashSet.class);
   }

   public String saveHeroTeam() {
      return JsonUtil.beanToJson(this.heroTeam);
   }

   public void loadHeroGrids(String data) {
      this.juYiGrids = JsonUtil.jsonToList(data, JuYiGrid.class);
   }

   public String saveHeroGrids() {
      return JsonUtil.beanToJson(this.juYiGrids);
   }

   public void loadJieYiInfo(String data) {
      Map<Integer, String> map = JsonUtil.jsonToMap(data, Integer.class, String.class);
      map.entrySet().forEach((entry) -> {
         List<Integer> v = (List)JsonUtil.jsonToBean((String)entry.getValue(), List.class);
         this.jieYiInfo.put(entry.getKey(), v);
      });
   }

   public String saveJieYiInfo() {
      return JsonUtil.beanToJson(this.jieYiInfo);
   }

   public void loadHellLv(String data) {
      this.hellLvMap = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveHellLv() {
      return JsonUtil.beanToJson(this.hellLvMap);
   }

   public void loadPlough(String data) {
      this.ploughMap = JsonUtil.jsonToMap(data, Integer.class, PloughTechData.class);
   }

   public String savePlough() {
      return JsonUtil.beanToJson(this.ploughMap);
   }

   public static class JuYiGrid {
      public long coolTime = 0L;
      public int heroCode = 0;
      public int oriLevel = 1;
   }
}
