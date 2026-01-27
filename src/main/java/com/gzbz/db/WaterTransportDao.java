package com.gzbz.db;

import com.gzbz.model.fun.ResourceModel;
import com.gzbz.spring.ApplicationContextProvider;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_water_transport",
   resultType = 0,
   selectKey = {"playerId"}
)
public class WaterTransportDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "已选护卫好友id"
   )
   public int guardId;
   @DBColumnAnno(
      comment = "下次选护卫时间"
   )
   public long nextGuardTime;
   @DBColumnAnno(
      comment = "被选护卫次数"
   )
   public int guardCount;
   @DBColumnAnno(
      comment = "当前品质"
   )
   public int quality;
   @DBColumnAnno(
      comment = "已拦截次数"
   )
   public int interceptCount;
   @DBColumnAnno(
      comment = "已购买拦截次数"
   )
   public int buyInterceptCount;
   @DBColumnAnno(
      comment = "剩余漕运次数"
   )
   public int transportCount = -1;
   @DBColumnAnno(
      comment = "已祭祀次数"
   )
   public int sacrificeCount;
   @DBColumnAnno(
      comment = "被选当护卫进行拦截次数"
   )
   public int guardInterceptCount;
   @DBColumnAnno(
      comment = "漕运记录红点"
   )
   public boolean hasRecordRedDot = false;
   @DBColumnAnno(
      comment = "复仇列表",
      loadFun = "loadRevenges",
      saveFun = "saveRevenges",
      columnType = "TEXT"
   )
   public Map<Integer, Integer> revenges = new HashMap();
   @DBColumnAnno(
      comment = "下次漕运次数恢复时间"
   )
   public int transportRecoverTime;
   @DBColumnAnno(
      comment = "已打捞的残骸id",
      columnType = "TEXT",
      loadFun = "loadSalvages",
      saveFun = "saveSalvages"
   )
   public Map<Integer, Set> salvages = new HashMap();
   @DBColumnAnno(
      comment = "援助申请列表",
      loadFun = "loadApplySupports",
      saveFun = "saveApplySupports",
      columnType = "TEXT"
   )
   public Set<Integer> applySupports = new HashSet();
   @DBColumnAnno(
      comment = "幸运船配置id->是否已升阶到该船",
      loadFun = "loadLuckyShips",
      saveFun = "saveLuckyShips"
   )
   public LinkedHashMap<Integer, Boolean> luckyShips = new LinkedHashMap();
   @DBColumnAnno(
      comment = "今日幸运船出现次数"
   )
   public int todayLuckyShip;
   @DBColumnAnno(
      comment = "当前漕运船ID"
   )
   public int shipModelId;
   @DBColumnAnno(
      comment = "黄金船已拦截次数+CD",
      loadFun = "loadGoldInterceptCount",
      saveFun = "saveGoldInterceptCount",
      skipMerge = true
   )
   public Map<Integer, Long> goldInterceptCount = new HashMap();
   @DBColumnAnno(
      comment = "幸运船出现时间"
   )
   public int luckyShipTime;
   @DBColumnAnno(
      comment = "今日已打捞资源",
      columnType = "TEXT",
      loadFun = "loadSalvageRes",
      saveFun = "saveSalvageRes"
   )
   public List<ResourceModel> salvageRes = new ArrayList();
   @DBColumnAnno(
      comment = "漕运列表点击时间"
   )
   public long listClickTime;
   @DBColumnAnno(
      comment = "今日已邀请的好友",
      columnType = "TEXT",
      loadFun = "loadSupports",
      saveFun = "saveSupports"
   )
   public Set<Integer> supports = new HashSet();
   @DBColumnAnno(
      comment = "今日被邀请次数"
   )
   public int beSupportsTimes;

   public int getLuckyBuf() {
      Iterator var1 = this.luckyShips.keySet().iterator();
      if (var1.hasNext()) {
         int buf = (Integer)var1.next();
         return buf;
      } else {
         return 0;
      }
   }

   public void loadRevenges(String data) {
      this.revenges = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
      if (this.revenges.containsKey(0)) {
         this.revenges.remove(0);
         this.updateOp();
      }

   }

   public String saveRevenges() {
      return JsonUtil.beanToJson(this.revenges);
   }

   public void loadSalvages(String str) {
      this.salvages = JsonUtil.jsonToMap(str, Integer.class, Set.class);
   }

   public String saveSalvages() {
      return JsonUtil.beanToJson(this.salvages);
   }

   public void loadApplySupports(String data) {
      this.applySupports = (Set)JsonUtil.jsonToBean(data, HashSet.class);
   }

   public String saveApplySupports() {
      return JsonUtil.beanToJson(this.applySupports);
   }

   public void loadLuckyShips(String data) {
      this.luckyShips = (LinkedHashMap)JsonUtil.jsonToMap(data, Integer.class, Boolean.class, LinkedHashMap.class);
   }

   public String saveLuckyShips() {
      return JsonUtil.beanToJson(this.luckyShips);
   }

   public void loadGoldInterceptCount(String data) {
      this.goldInterceptCount = JsonUtil.jsonToMap(data, Integer.class, Long.class);
   }

   public String saveGoldInterceptCount() {
      return JsonUtil.beanToJson(this.goldInterceptCount);
   }

   public void loadSalvageRes(String data) {
      this.salvageRes = JsonUtil.jsonToList(data, ResourceModel.class);
   }

   public String saveSalvageRes() {
      return JsonUtil.beanToJson(this.salvageRes);
   }

   public void loadSupports(String data) {
      this.supports = (Set)JsonUtil.jsonToBean(data, HashSet.class);
   }

   public String saveSupports() {
      return JsonUtil.beanToJson(this.supports);
   }

   public void reset() {
      this.buyInterceptCount = 0;
      this.sacrificeCount = 0;
      this.guardInterceptCount = 0;
      this.interceptCount = 0;
      this.salvages.clear();
      this.todayLuckyShip = 0;
      this.goldInterceptCount.clear();
      this.salvageRes.clear();
      this.supports.clear();
      this.beSupportsTimes = 0;
      this.updateOp();
   }

   public int getEnableInterceptCount() {
      int maxRob = ApplicationContextProvider.getConfigInt("MaxRob", 0);
      return this.buyInterceptCount + maxRob - this.interceptCount;
   }
}
