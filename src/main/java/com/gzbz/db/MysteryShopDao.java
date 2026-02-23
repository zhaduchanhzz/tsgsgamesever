package com.gzbz.db;

import com.gzbz.gamePlayer.mysteryShop.MysteryShopItem;
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
   name = "tb_mystery_shop",
   resultType = 0,
   selectKey = {"playerId"}
)
public class MysteryShopDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "已使用免费刷新次数"
   )
   public int usedFreeTimes;
   @DBColumnAnno(
      comment = "当天总刷新次数"
   )
   public int totalTimes;
   @DBColumnAnno(
      comment = "物品列表",
      columnName = "items",
      columnType = "TEXT",
      loadFun = "loadItems",
      saveFun = "saveItems"
   )
   public List<MysteryShopItem> items = new ArrayList();
   @DBColumnAnno(
      comment = "刷新时间"
   )
   public Timestamp refreshTime = new Timestamp(System.currentTimeMillis());
   @DBColumnAnno(
      comment = "快捷购买",
      columnType = "TEXT",
      loadFun = "loadFastIds",
      saveFun = "saveFastIds"
   )
   public Set<Integer> fastIds = new HashSet();

   public void loadItems(String itemStr) {
      if (!StringUtils.isEmpty(itemStr)) {
         this.items = JsonUtil.jsonToList(itemStr, MysteryShopItem.class);
      }
   }

   public String saveItems() {
      return JsonUtil.listToJson(this.items);
   }

   public void loadFastIds(String string) {
      this.fastIds = JsonUtil.jsonToBean(string, HashSet.class);
   }

   public String saveFastIds() {
      return JsonUtil.beanToJson(this.fastIds);
   }
}
