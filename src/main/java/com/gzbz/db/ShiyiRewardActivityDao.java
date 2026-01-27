package com.gzbz.db;

import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;

@DBTableAnno(
   name = "tb_shiyi_reward_activity",
   resultType = 0,
   selectKey = {"playerId"}
)
public class ShiyiRewardActivityDao extends DBDao {
   @DBColumnAnno(
      columnName = "playerId",
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      columnName = "shiyiBuyTimes",
      comment = "当天购买次数"
   )
   public int shiyiBuyTimes;
   @DBColumnAnno(
      columnName = "nowRewardList",
      comment = "当前的奖励组列表",
      columnType = "TEXT",
      loadFun = "loadNowRewardList",
      saveFun = "saveNowRewardList"
   )
   public Set<Integer> nowRewardList = new HashSet();

   public void loadNowRewardList(String data) {
      if (!StringUtils.isBlank(data)) {
         String[] nowRewardStr = data.split(",");
         if (null != nowRewardStr && nowRewardStr.length > 0) {
            Set<Integer> nowRewardList_ = new HashSet();

            for(String nowReward : nowRewardStr) {
               nowRewardList_.add(Integer.parseInt(nowReward));
            }

            this.nowRewardList = nowRewardList_;
         }
      }
   }

   public String saveNowRewardList() {
      StringBuilder stringBuilder = new StringBuilder();
      if (this.nowRewardList.size() > 0) {
         for(Integer reward : this.nowRewardList) {
            stringBuilder.append(reward + ",");
         }

         if (stringBuilder.length() > 0) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
         }
      }

      return stringBuilder.toString();
   }
}
