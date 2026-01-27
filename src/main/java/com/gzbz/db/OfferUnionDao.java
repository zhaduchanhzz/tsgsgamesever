package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashSet;
import java.util.Set;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_offer_union",
   resultType = 5
)
public class OfferUnionDao extends DBDao {
   @DBColumnAnno(
      comment = "军团id",
      isPrimary = true
   )
   public int unionId;
   @DBColumnAnno(
      comment = "普通发布次数"
   )
   public int publishNum;
   @DBColumnAnno(
      comment = "隐藏悬赏次数"
   )
   public int hideNum;
   @DBColumnAnno(
      comment = "军团积分"
   )
   public int point;
   @DBColumnAnno(
      comment = "军团挑战次数"
   )
   public int fight;
   @DBColumnAnno(
      comment = "军团缉拿次数"
   )
   public int kill;
   @DBColumnAnno(
      comment = "商店等级"
   )
   public int shopLv = 1;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadMembers",
      saveFun = "saveMembers",
      comment = "进入参与悬赏的玩家"
   )
   public Set<Integer> members = new HashSet();
   @DBColumnAnno(
      comment = "悬赏昨日记录"
   )
   public String offerRecord;

   public void loadMembers(String str) {
      this.members = (Set)JsonUtil.jsonToBean(str, HashSet.class);
   }

   public String saveMembers() {
      return JsonUtil.beanToJson(this.members);
   }
}
