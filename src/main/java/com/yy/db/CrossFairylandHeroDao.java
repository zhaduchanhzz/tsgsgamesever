package com.yy.db;

import com.yy.fairyland.ExploreHeroData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_fairyland_hero",
   dbType = 2,
   resultType = 2,
   mapKey = {"powerLib"},
   selectKey = {"groupId"}
)
public class CrossFairylandHeroDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "group"
   )
   public int groupId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "powerLib"
   )
   public int powerLib;
   @DBColumnAnno(
      comment = "英雄库",
      columnType = "LONGTEXT",
      loadFun = "loadHero",
      saveFun = "saveHero"
   )
   public List<ExploreHeroData> heroData = new ArrayList();

   public void loadHero(String str) {
      this.heroData = JsonUtil.jsonToList(str, ExploreHeroData.class);
   }

   public String saveHero() {
      return JsonUtil.beanToJson(this.heroData);
   }
}
