package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_magic_book",
   resultType = 0,
   selectKey = {"playerId"}
)
public class MagicBookDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "鉴析等级配置id"
   )
   public int identityId = 0;
   @DBColumnAnno(
      comment = "奇书配置id"
   )
   public int magicBookId = 0;
   @DBColumnAnno(
      comment = "奇谋残章位置0是普通,1是特权->itemId+endTime",
      loadFun = "loadProcess",
      saveFun = "saveProcess"
   )
   public Map<Integer, Long> authProcess = new HashMap();
   @DBColumnAnno(
      comment = "技能顺序从1开始",
      loadFun = "loadSkillPosition",
      saveFun = "saveSkillPosition"
   )
   public Map<Integer, Integer> skillPosition = new HashMap();
   @DBColumnAnno(
      comment = "今日已购买奇谋残章",
      loadFun = "loadOriginals",
      saveFun = "saveOriginals"
   )
   public Map<Integer, Integer> originals = new HashMap();
   @DBColumnAnno(
      comment = "奇谋残章未鉴定出最高等级前鉴定次数",
      loadFun = "loadAuthCount",
      saveFun = "saveAuthCount"
   )
   public Map<Integer, Integer> authCount = new HashMap();

   public void loadProcess(String data) {
      this.authProcess = JsonUtil.jsonToMap(data, Integer.class, Long.class);
   }

   public String saveProcess() {
      return JsonUtil.beanToJson(this.authProcess);
   }

   public void loadSkillPosition(String data) {
      this.skillPosition = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveSkillPosition() {
      return JsonUtil.beanToJson(this.skillPosition);
   }

   public void loadOriginals(String data) {
      this.originals = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveOriginals() {
      return JsonUtil.beanToJson(this.originals);
   }

   public void loadAuthCount(String data) {
      this.authCount = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveAuthCount() {
      return JsonUtil.beanToJson(this.authCount);
   }
}
