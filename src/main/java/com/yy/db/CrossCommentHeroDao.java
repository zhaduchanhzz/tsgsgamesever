package com.yy.db;

import com.alibaba.fastjson.JSON;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;
import org.springframework.util.StringUtils;

@DBTableAnno(
   name = "tb_cross_comment_hero",
   dbType = 2,
   resultType = 0,
   selectKey = {"heroId"}
)
public class CrossCommentHeroDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "英雄ID"
   )
   public int heroId;
   @DBColumnAnno(
      comment = "总的喜欢数量"
   )
   public int likes;
   @DBColumnAnno(
      comment = "喜欢的玩家列表",
      columnName = "likePlayers",
      columnType = "TEXT",
      loadFun = "loadLikePlayersJson",
      saveFun = "saveLikePlayersJson"
   )
   public List<Integer> likePlayers = new ArrayList();
   @DBColumnAnno(
      comment = "武将热度"
   )
   public int heroHots;

   public void loadLikePlayersJson(String itemStr) {
      if (!StringUtils.isEmpty(itemStr)) {
         this.likePlayers = JsonUtil.jsonToList(itemStr, Integer.class);
      }
   }

   public String saveLikePlayersJson() {
      return JSON.toJSONString(this.likePlayers);
   }
}
