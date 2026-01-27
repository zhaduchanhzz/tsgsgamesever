package com.gzbz.db;

import com.gzbz.db.bean.ActivityArtifactData;
import com.gzbz.db.bean.ActivityHeroSkinData;
import com.gzbz.db.bean.ActivityHeroThemeData;
import com.gzbz.db.bean.ActivitySpringEnjoyData;
import com.gzbz.db.bean.DragonTreasureData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_player_theme_activity",
   resultType = 0,
   selectKey = {"playerId"}
)
public class ThemeActivityDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "春意盎然",
      columnType = "TEXT",
      loadFun = "loadSpringEnjoyData",
      saveFun = "saveSpringEnjoyData"
   )
   public ActivitySpringEnjoyData springEnjoyData = new ActivitySpringEnjoyData();
   @DBColumnAnno(
      comment = "主题武将",
      columnType = "TEXT",
      loadFun = "loadHeroThemeData",
      saveFun = "saveHeroThemeData"
   )
   public ActivityHeroThemeData heroThemeData = new ActivityHeroThemeData();
   @DBColumnAnno(
      comment = "神兵活动",
      columnType = "TEXT",
      loadFun = "loadArtifactData",
      saveFun = "saveArtifactData"
   )
   public ActivityArtifactData artifactData = new ActivityArtifactData();
   @DBColumnAnno(
      comment = "英雄皮肤活动",
      loadFun = "loadSkinActivity",
      saveFun = "saveSkinActivity",
      columnType = "TEXT"
   )
   public ActivityHeroSkinData skinActivity = new ActivityHeroSkinData();
   @DBColumnAnno(
      comment = "转盘活动",
      columnType = "TEXT",
      loadFun = "loadDragonTreasure",
      saveFun = "saveDragonTreasure"
   )
   public DragonTreasureData dragonTreasureData = new DragonTreasureData();
   @DBColumnAnno(
      comment = "神兵轮换活动",
      columnType = "TEXT",
      loadFun = "loadArtifactRotateData",
      saveFun = "saveArtifactRotateData"
   )
   public ActivityArtifactData artifactRotateData = new ActivityArtifactData();
   @DBColumnAnno(
      comment = "神兵皮肤轮换活动",
      columnType = "TEXT",
      loadFun = "loadArtifactSkinData",
      saveFun = "saveArtifactSkinData"
   )
   public ActivityArtifactData artifactSkinData = new ActivityArtifactData();

   public void loadSpringEnjoyData(String data) {
      this.springEnjoyData = (ActivitySpringEnjoyData)JsonUtil.jsonToBean(data, ActivitySpringEnjoyData.class);
   }

   public String saveSpringEnjoyData() {
      return JsonUtil.beanToJson(this.springEnjoyData);
   }

   public void loadHeroThemeData(String data) {
      this.heroThemeData = (ActivityHeroThemeData)JsonUtil.jsonToBean(data, ActivityHeroThemeData.class);
   }

   public String saveHeroThemeData() {
      return JsonUtil.beanToJson(this.heroThemeData);
   }

   public void loadArtifactData(String data) {
      this.artifactData = (ActivityArtifactData)JsonUtil.jsonToBean(data, ActivityArtifactData.class);
   }

   public String saveArtifactData() {
      return JsonUtil.beanToJson(this.artifactData);
   }

   public void loadSkinActivity(String str) {
      this.skinActivity = (ActivityHeroSkinData)JsonUtil.jsonToBean(str, ActivityHeroSkinData.class);
   }

   public String saveSkinActivity() {
      return JsonUtil.beanToJson(this.skinActivity);
   }

   public void loadDragonTreasure(String str) {
      this.dragonTreasureData = (DragonTreasureData)JsonUtil.jsonToBean(str, DragonTreasureData.class);
   }

   public String saveDragonTreasure() {
      return JsonUtil.beanToJson(this.dragonTreasureData);
   }

   public void loadArtifactRotateData(String data) {
      this.artifactRotateData = (ActivityArtifactData)JsonUtil.jsonToBean(data, ActivityArtifactData.class);
   }

   public String saveArtifactRotateData() {
      return JsonUtil.beanToJson(this.artifactRotateData);
   }

   public void loadArtifactSkinData(String data) {
      this.artifactSkinData = (ActivityArtifactData)JsonUtil.jsonToBean(data, ActivityArtifactData.class);
   }

   public String saveArtifactSkinData() {
      return JsonUtil.beanToJson(this.artifactSkinData);
   }
}
