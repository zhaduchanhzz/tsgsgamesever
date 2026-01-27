package com.yy.db;

import com.yy.fairyland.ExploreHeroData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_fairyland_player",
   dbType = 2,
   resultType = 2,
   mapKey = {"playerId"},
   selectKey = {"groupId"}
)
public class CrossFairylandPlayerDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "playerId"
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "group"
   )
   public int groupId;
   @DBColumnAnno(
      comment = "sourceServerId"
   )
   public int sourceServerId;
   @DBColumnAnno(
      comment = "扫荡券"
   )
   public int ticketNum;
   @DBColumnAnno(
      comment = "连胜场次"
   )
   public int winNum;
   @DBColumnAnno(
      comment = "连败场次"
   )
   public int loseNum;
   @DBColumnAnno(
      columnType = "TEXT",
      comment = "赛区乱入英雄",
      loadFun = "loadData",
      saveFun = "saveData"
   )
   public ExploreHeroData heroData = new ExploreHeroData();
   @DBColumnAnno(
      comment = "探索英雄",
      columnType = "LONGTEXT",
      loadFun = "loadHero",
      saveFun = "saveHero"
   )
   public Map<Integer, ExploreHeroData> exploreHero = new HashMap();

   public void loadData(String data) {
      this.heroData = (ExploreHeroData)JsonUtil.jsonToBean(data, ExploreHeroData.class);
   }

   public String saveData() {
      return JsonUtil.beanToJson(this.heroData);
   }

   public void loadHero(String str) {
      this.exploreHero = JsonUtil.jsonToMap(str, Integer.class, ExploreHeroData.class);
   }

   public String saveHero() {
      return JsonUtil.beanToJson(this.exploreHero);
   }
}
