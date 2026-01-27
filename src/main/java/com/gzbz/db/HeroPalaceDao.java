package com.gzbz.db;

import com.alibaba.fastjson.JSON;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_hero_palace",
   resultType = 0,
   selectKey = {"playerId"}
)
public class HeroPalaceDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "君主府英雄"
   )
   public int heroCode;
   @DBColumnAnno(
      comment = "共享英雄"
   )
   public int shareCode;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadSkillsJson",
      saveFun = "saveSkillsJson"
   )
   public Map<Integer, Integer> skills = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadDestinySkillsJson",
      saveFun = "saveDestinySkillsJson"
   )
   public Map<Integer, Integer> destinySkills = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadHeroSkillDirJson",
      saveFun = "saveHeroSkillDirJson"
   )
   public List<Integer> heroSkillDir = new ArrayList();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadDestinySkillDirJson",
      saveFun = "saveDestinySkillDirJson"
   )
   public Map<String, Integer> destinySkillDir = new HashMap();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadKingSkillDirJson",
      saveFun = "saveKingSkillDirJson"
   )
   public List<Integer> kingSkillDir = new ArrayList();
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadNoticeDirJson",
      saveFun = "saveNoticeDirJson"
   )
   public Map<Integer, Integer> noticeDir = new HashMap();

   public void loadSkillsJson(String data) {
      this.skills = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveSkillsJson() {
      return JSON.toJSONString(this.skills);
   }

   public void loadDestinySkillsJson(String data) {
      this.destinySkills = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveDestinySkillsJson() {
      return JSON.toJSONString(this.destinySkills);
   }

   public void loadHeroSkillDirJson(String data) {
      this.heroSkillDir = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveHeroSkillDirJson() {
      return JSON.toJSONString(this.heroSkillDir);
   }

   public void loadDestinySkillDirJson(String data) {
      this.destinySkillDir = JsonUtil.jsonToMap(data, String.class, Integer.class);
   }

   public String saveDestinySkillDirJson() {
      return JSON.toJSONString(this.destinySkillDir);
   }

   public void loadKingSkillDirJson(String data) {
      this.kingSkillDir = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveKingSkillDirJson() {
      return JSON.toJSONString(this.kingSkillDir);
   }

   public void loadNoticeDirJson(String data) {
      this.noticeDir = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveNoticeDirJson() {
      return JSON.toJSONString(this.noticeDir);
   }
}
