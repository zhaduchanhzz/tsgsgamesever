package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_hero_arraying",
   resultType = 2,
   selectKey = {"playerId"},
   mapKey = {"arrayingType"}
)
public class HeroArrayingDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "阵型类型"
   )
   public int arrayingType;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadJson",
      saveFun = "saveJson"
   )
   public Map<Byte, Integer> elements = new HashMap();
   @DBColumnAnno(
      comment = "援军状态"
   )
   public int friendState;
   @DBColumnAnno(
      comment = "援军阵营"
   )
   public int friendNation;
   @DBColumnAnno(
      comment = "是否隐藏阵型"
   )
   public boolean hide;
   @DBColumnAnno(
      comment = "选择加成的君主code"
   )
   public int kingCode;
   @DBColumnAnno(
      comment = "援军职业"
   )
   public int friendJob;
   @DBColumnAnno(
      comment = "选中的魂武将"
   )
   public int soulHeroCode;

   public void loadJson(String data) {
      this.elements = JsonUtil.jsonToMap(data, Byte.class, Integer.class);
      if (this.elements == null) {
         this.elements = new HashMap();
      }

   }

   public String saveJson() {
      return JsonUtil.beanToJson(this.elements);
   }
}
