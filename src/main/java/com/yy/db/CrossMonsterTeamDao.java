package com.yy.db;

import com.alibaba.fastjson.JSON;
import com.gzbz.robot.bean.MonsterWear;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_monster_team",
   dbType = 2,
   resultType = 0,
   selectKey = {"code"}
)
public class CrossMonsterTeamDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "机器人",
      index = 0
   )
   public int code;
   @DBColumnAnno(
      comment = "机器人战力"
   )
   public long power;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadMonsterJson",
      saveFun = "saveMonsterJson"
   )
   public List<MonsterWear> heros = new ArrayList();

   public void loadMonsterJson(String data) {
      if (data.isEmpty()) {
         this.heros = new ArrayList();
      } else {
         this.heros = JsonUtil.jsonToList(data, MonsterWear.class);
      }

   }

   public String saveMonsterJson() {
      return JSON.toJSONString(this.heros);
   }
}
