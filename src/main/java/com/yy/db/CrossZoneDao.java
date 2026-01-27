package com.yy.db;

import db.DBColumnAnno;
import db.DBDao;
import java.util.TreeSet;
import org.springframework.util.StringUtils;

public class CrossZoneDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "group"
   )
   public int group;
   @DBColumnAnno(
      columnType = "LONGTEXT",
      loadFun = "load",
      saveFun = "save",
      comment = "大组"
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

   public TreeSet<Integer> getServers() {
      return this.servers;
   }

   public void addServer(int serverId) {
      this.servers.add(serverId);
      this.updateOp();
   }

   public boolean removeServer(int serverId) {
      if (this.servers.remove(serverId)) {
         this.updateOp();
         return true;
      } else {
         return false;
      }
   }
}
