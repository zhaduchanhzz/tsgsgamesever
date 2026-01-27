package com.yy.db;

import db.DBColumnAnno;
import db.DBDao;
import java.util.TreeSet;
import org.springframework.util.StringUtils;

public class CrossPvpZoneBaseDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "分区id"
   )
   public int group;
   @DBColumnAnno(
      comment = "段位"
   )
   public int grade;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      loadFun = "load",
      saveFun = "save",
      comment = "分区内服务器"
   )
   public TreeSet<Integer> servers = new TreeSet();

   public void load(String str) {
      if (!StringUtils.isEmpty(str)) {
         String[] arr = str.split("\\|");

         for(String data : arr) {
            this.servers.add(Integer.parseInt(data));
         }

      }
   }

   public String save() {
      StringBuffer sb = new StringBuffer();
      int count = 0;

      for(int serverId : this.servers) {
         sb.append(serverId);
         if (count != this.servers.size() - 1) {
            sb.append("|");
         }

         ++count;
      }

      return sb.toString();
   }
}
