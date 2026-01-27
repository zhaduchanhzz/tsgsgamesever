package com.gzbz.db.worldBean;

import com.gzbz.model.fun.ResourceModel;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_mail_world",
   resultType = 5
)
public class MailWorldDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      isAutoInc = true,
      comment = "邮件id"
   )
   public int id;
   @DBColumnAnno(
      comment = "邮件类型"
   )
   public int type;
   @DBColumnAnno(
      comment = "标题"
   )
   public String title;
   @DBColumnAnno(
      comment = "内容",
      columnType = "TEXT"
   )
   public String context;
   @DBColumnAnno(
      comment = "创建时间"
   )
   public long creatTime;
   @DBColumnAnno(
      comment = "过期时间"
   )
   public long enableTime;
   @DBColumnAnno(
      comment = "添加模块"
   )
   public int module;
   @DBColumnAnno(
      comment = "添加原因"
   )
   public int reason;
   @DBColumnAnno(
      comment = "发送类型"
   )
   public int sendType;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadJson",
      saveFun = "saveJson"
   )
   public List<ResourceModel> items = new ArrayList();
   @DBColumnAnno(
      columnType = "LONGTEXT",
      loadFun = "loadPlayerParamssJson",
      saveFun = "savePlayerParamssJson"
   )
   public Map<Integer, String> playerParams = new HashMap();
   @DBColumnAnno(
      comment = "邮件奖励ID"
   )
   public int centreAwardId;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadServersJson",
      saveFun = "saveServersJson"
   )
   public Set<Integer> servers = new HashSet();

   public void loadJson(String data) {
      this.items = JsonUtil.jsonToList(data, ResourceModel.class);
   }

   public String saveJson() {
      return JsonUtil.listToJson(this.items);
   }

   public void loadPlayerParamssJson(String data) {
      this.playerParams = JsonUtil.jsonToMap(data, Integer.class, String.class);
   }

   public String savePlayerParamssJson() {
      return JsonUtil.beanToJson(this.playerParams);
   }

   public void loadServersJson(String data) {
      List<Integer> list = JsonUtil.jsonToList(data, Integer.class);
      if (list != null) {
         this.servers = new HashSet(list);
      }

   }

   public String saveServersJson() {
      return JsonUtil.beanToJson(this.servers);
   }
}
