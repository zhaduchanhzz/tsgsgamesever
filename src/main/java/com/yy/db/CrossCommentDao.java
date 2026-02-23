package com.yy.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import misc.JsonUtil;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_cross_comment",
   dbType = 2,
   resultType = 2,
   selectKey = {"heroId"},
   mapKey = {"code"}
)
public class CrossCommentDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "heroId",
      index = 0
   )
   public int heroId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "code",
      index = 0
   )
   public int code;
   @DBColumnAnno(
      comment = "服务器ID"
   )
   public int serverId;
   @DBColumnAnno(
      comment = "评论人ID"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "评论人姓名"
   )
   public String playerName;
   @DBColumnAnno(
      comment = "评论内容"
   )
   public String content;
   @DBColumnAnno(
      comment = "点赞数"
   )
   public int likeNum;
   @DBColumnAnno(
      comment = "被踩数"
   )
   public int hateNum;
   @DBColumnAnno(
      comment = "评论热度"
   )
   public int commentHots;
   @DBColumnAnno(
      comment = "时间"
   )
   public Timestamp createTime;
   @DBColumnAnno(
      comment = "评论人列表",
      columnName = "likePlayerList",
      columnType = "TEXT",
      loadFun = "loadLikePlayerListJson",
      saveFun = "saveLikePlayerListJson"
   )
   public List<Integer> likePlayerList = new ArrayList();
   @DBColumnAnno(
      comment = "举报人列表",
      columnName = "reportPlayerList",
      columnType = "TEXT",
      loadFun = "loadReportPlayerListJson",
      saveFun = "saveReportPlayerListJson"
   )
   public Set<Integer> reportPlayerList = new HashSet();
   @DBColumnAnno(
      comment = "更新时间"
   )
   public long updateTime;
   @DBColumnAnno(
      comment = "评论人列表",
      columnName = "hatePlayerList",
      columnType = "TEXT",
      loadFun = "loadHatePlayerListJson",
      saveFun = "saveHatePlayerListJson"
   )
   public List<Integer> hatePlayerList = new ArrayList();

   public void loadLikePlayerListJson(String itemStr) {
      if (!StringUtils.isEmpty(itemStr)) {
         this.likePlayerList = JsonUtil.jsonToList(itemStr, Integer.class);
      }
   }

   public String saveLikePlayerListJson() {
      return JsonUtil.object2String(this.likePlayerList);
   }

   public void loadHatePlayerListJson(String itemStr) {
      if (!StringUtils.isEmpty(itemStr)) {
         this.hatePlayerList = JsonUtil.jsonToList(itemStr, Integer.class);
      }
   }

   public String saveHatePlayerListJson() {
      return JsonUtil.object2String(this.hatePlayerList);
   }

   public void loadReportPlayerListJson(String itemStr) {
      if (!StringUtils.isEmpty(itemStr)) {
         this.reportPlayerList = JsonUtil.jsonToBean(itemStr, HashSet.class);
      }
   }

   public String saveReportPlayerListJson() {
      return JsonUtil.beanToJson(this.reportPlayerList);
   }
}
