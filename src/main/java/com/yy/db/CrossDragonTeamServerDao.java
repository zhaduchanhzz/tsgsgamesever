package com.yy.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashSet;
import java.util.Set;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_cross_dragon_team_server",
   dbType = 2,
   selectKey = {"group"}
)
public class CrossDragonTeamServerDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "服务器组key"
   )
   public int group;
   @DBColumnAnno(
      comment = "跨服天命是否开启"
   )
   public boolean openCross = false;
   @DBColumnAnno(
      comment = "通知状态"
   )
   public boolean notifyState = false;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadInfo",
      saveFun = "saveInfo",
      comment = "已经开启的服务器"
   )
   public Set<Integer> openServers = new HashSet();

   public void loadInfo(String data) {
      this.openServers = (Set)JsonUtil.jsonToBean(data, HashSet.class);
   }

   public String saveInfo() {
      return JsonUtil.beanToJson(this.openServers);
   }
}
