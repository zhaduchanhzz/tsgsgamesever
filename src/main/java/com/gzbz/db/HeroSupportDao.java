package com.gzbz.db;

import com.gzbz.db.bean.HeroMirror;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;
import misc.DateUtil;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_hero_support",
   resultType = 5,
   mapKey = {"moduleId", "playerId"}
)
public class HeroSupportDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "所属系统"
   )
   public int moduleId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "派遣英雄",
      columnType = "TEXT",
      loadFun = "loadHeroSupport",
      saveFun = "saveHeroSupport"
   )
   public HeroMirror heroSupport;
   @DBColumnAnno(
      comment = "额外参数"
   )
   public String args;
   @DBColumnAnno(
      comment = "派遣英雄列表",
      columnType = "LONGTEXT",
      loadFun = "loadSupportList",
      saveFun = "saveSupportList"
   )
   public List<HeroMirror> supportList = new ArrayList();
   @DBColumnAnno(
      comment = "每天自动派遣",
      isNotNull = true
   )
   public boolean isAuto = false;
   @DBColumnAnno(
      comment = "派遣时间"
   )
   public int time;
   public static final int RESET_TYPE_DAILY = 0;
   public static final int RESET_TYPE_WEEK = 2;

   public void loadHeroSupport(String data) {
      this.heroSupport = (HeroMirror)JsonUtil.jsonToBean(data, HeroMirror.class);
   }

   public String saveHeroSupport() {
      return JsonUtil.beanToJson(this.heroSupport);
   }

   public void loadSupportList(String data) {
      this.supportList = JsonUtil.jsonToList(data, HeroMirror.class);
   }

   public String saveSupportList() {
      return JsonUtil.beanToJson(this.supportList);
   }

   public HeroSupportDao() {
   }

   public HeroSupportDao(int playerId, SupportModule supportModule, HeroMirror heroSupport) {
      this.playerId = playerId;
      this.moduleId = supportModule.module;
      this.heroSupport = heroSupport;
      this.time = DateUtil.getIntTime(System.currentTimeMillis());
   }

   public static enum SupportModule {
      CUT(1, 0),
      HERO_TRAIL(2, 0),
      GOD_TRAIL(3, 0),
      MINE(4, 0),
      EXPEDITION(5, 1),
      STONE_CIRCLE(6, 2);

      public int module;
      public int reset;

      private SupportModule(int module, int reset) {
         this.module = module;
         this.reset = reset;
      }
   }
}
