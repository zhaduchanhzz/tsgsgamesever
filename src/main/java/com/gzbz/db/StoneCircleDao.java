package com.gzbz.db;

import com.gzbz.db.bean.MapEventData;
import com.gzbz.gamePlayer.stoneCircle.bean.EmployHeroData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_stone_circle",
   resultType = 0,
   selectKey = {"playerId"}
)
public class StoneCircleDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "当前层关卡id"
   )
   public int stageId;
   @DBColumnAnno(
      comment = "重置体力时间"
   )
   public long resetTime;
   @DBColumnAnno(
      comment = "当前体力"
   )
   public int spiritNum;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadSupport",
      saveFun = "saveSupport",
      comment = "我派遣的武将code"
   )
   public Set<Integer> supportHero = new HashSet();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadData",
      saveFun = "saveData",
      comment = "当前地图数据"
   )
   public MapEventData mapData;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      loadFun = "loadEmployHero",
      saveFun = "saveEmployHero",
      comment = "雇佣的武将"
   )
   public List<EmployHeroData> employHero = new ArrayList();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadHeroHp",
      saveFun = "saveHeroHp",
      comment = "我的的武将血量情况"
   )
   public Map<Integer, Float> heroHp = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadArraying",
      saveFun = "saveArraying",
      comment = "雇佣武将上阵情况"
   )
   public Map<Integer, EmployHeroData> arraying = new HashMap();

   public void loadSupport(String data) {
      this.supportHero = JsonUtil.jsonToBean(data, Set.class);
   }

   public String saveSupport() {
      return JsonUtil.beanToJson(this.supportHero);
   }

   public void loadData(String data) {
      this.mapData = (MapEventData)JsonUtil.jsonToBean(data, MapEventData.class);
   }

   public String saveData() {
      return JsonUtil.beanToJson(this.mapData);
   }

   public void loadEmployHero(String data) {
      this.employHero = JsonUtil.jsonToList(data, EmployHeroData.class);
   }

   public String saveEmployHero() {
      return JsonUtil.listToJson(this.employHero);
   }

   public void loadHeroHp(String str) {
      this.heroHp = JsonUtil.jsonToMap(str, Integer.class, Float.class, HashMap.class);
   }

   public String saveHeroHp() {
      return JsonUtil.beanToJson(this.heroHp);
   }

   public void loadArraying(String str) {
      this.arraying = JsonUtil.jsonToMap(str, Integer.class, EmployHeroData.class, HashMap.class);
   }

   public String saveArraying() {
      return JsonUtil.beanToJson(this.arraying);
   }
}
