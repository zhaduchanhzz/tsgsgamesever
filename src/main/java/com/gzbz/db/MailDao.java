package com.gzbz.db;

import com.gzbz.model.fun.ResourceModel;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_mail",
   resultType = 2,
   selectKey = {"playerId"},
   mapKey = {"code"}
)
public class MailDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "邮件编号"
   )
   public int code;
   @DBColumnAnno(
      comment = "邮件类型"
   )
   public int type;
   @DBColumnAnno(
      comment = "标题"
   )
   public String title;
   @DBColumnAnno(
      columnType = "TEXT",
      comment = "内容"
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
      comment = "是否已读0未读、1已读、2已领取"
   )
   public int state;
   @DBColumnAnno(
      comment = "添加模块"
   )
   public int module;
   @DBColumnAnno(
      comment = "添加原因"
   )
   public int reason;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadJson",
      saveFun = "saveJson"
   )
   public List<ResourceModel> items = new ArrayList();
   @DBColumnAnno(
      comment = "世界邮件ID"
   )
   public long systemMailId;
   @DBColumnAnno(
      comment = "邮件奖励ID"
   )
   public int centreAwardId;

   public void loadJson(String data) {
      this.items = JsonUtil.jsonToList(data, ResourceModel.class);
   }

   public String saveJson() {
      return JsonUtil.listToJson(this.items);
   }
}
