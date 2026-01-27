package com.gzbz.db;

import com.alibaba.fastjson.JSON;
import com.gzbz.db.bean.ArtifactData;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashMap;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_artifact",
   selectKey = {"playerId"}
)
public class ArtifactDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "强化等级"
   )
   public int strongLv;
   @DBColumnAnno(
      comment = "强化经验"
   )
   public int strongExp;
   @DBColumnAnno(
      comment = "精炼等级"
   )
   public int refineLv;
   @DBColumnAnno(
      comment = "铸魂次数"
   )
   public int soulNum;
   @DBColumnAnno(
      comment = "技能等级"
   )
   public int skillLv;
   @DBColumnAnno(
      comment = "是否全部解锁"
   )
   public int allUnlock;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadJson",
      saveFun = "saveJson"
   )
   public Map<Integer, ArtifactData> artifacts = new HashMap();

   public void loadJson(String data) {
      if (data.isEmpty()) {
         this.artifacts = new HashMap();
      } else {
         this.artifacts = JsonUtil.jsonToMap(data, Integer.class, ArtifactData.class);
      }

   }

   public String saveJson() {
      return JSON.toJSONString(this.artifacts);
   }
}
