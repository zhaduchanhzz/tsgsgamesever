package com.gzbz.db;

import com.gzbz.db.bean.HeroMirror;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_expedition_extend",
   resultType = 0,
   selectKey = {"playerId"}
)
public class ExpeditionExtendDao extends DBDao {
   @DBColumnAnno(
      comment = "玩家id",
      isPrimary = true
   )
   public int playerId;
   @DBColumnAnno(
      comment = "武将唯一标识"
   )
   public int dispatchCode;
   @DBColumnAnno(
      comment = "实际派遣武将"
   )
   public int heroCode;
   @DBColumnAnno(
      comment = "自己派遣的武将",
      columnType = "TEXT",
      loadFun = "loadDispatchHero",
      saveFun = "saveDispatchHero"
   )
   public HeroMirror dispatchHero;

   public void loadDispatchHero(String data) {
      this.dispatchHero = (HeroMirror)JsonUtil.jsonToBean(data, HeroMirror.class);
   }

   public String saveDispatchHero() {
      return JsonUtil.beanToJson(this.dispatchHero);
   }
}
