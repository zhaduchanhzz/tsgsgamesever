package com.gzbz.db;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.DataUtils;

@DBTableAnno(
   name = "tb_video_reward",
   resultType = 0,
   selectKey = {"playerId"}
)
public class VideoRewardDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      comment = "观看视频奖励,key:礼包id val:领取次数",
      columnName = "videoRewards",
      columnType = "TEXT",
      loadFun = "loadVideoRewards",
      saveFun = "saveVideoRewards"
   )
   public Map<Integer, Integer> videoRewards = new HashMap();
   @DBColumnAnno(
      comment = "已发放的充值邮件",
      columnType = "TEXT",
      loadFun = "loadRechargeMails",
      saveFun = "saveRechargeMails"
   )
   public List<Integer> rechargeMails = new ArrayList();
   @DBColumnAnno(
      columnName = "maxRoundRewardId",
      comment = "领取最大轮次配置表id"
   )
   public int maxRoundRewardId;
   @DBColumnAnno(
      columnName = "viewVideoCount",
      comment = "观看视频总次数"
   )
   public int viewVideoCount;
   @DBColumnAnno(
      columnName = "timesRewardResetTime",
      comment = "次数奖励最后一次重置时间"
   )
   public long timesRewardResetTime;
   @DBColumnAnno(
      columnName = "failRewardTimes",
      comment = "今日观看失败奖励领取次数"
   )
   public int failRewardTimes;

   public void loadVideoRewards(String data) {
      this.videoRewards = DataUtils.stringToInt_intMap(data);
   }

   public String saveVideoRewards() {
      return DataUtils.int_intMapToString(this.videoRewards);
   }

   public void loadRechargeMails(String str) {
      if (str != null && str.length() != 0) {
         List<String> list = Splitter.on("|").splitToList(str);
         list.forEach((value) -> this.rechargeMails.add(Integer.parseInt(value)));
      }
   }

   public String saveRechargeMails() {
      return Joiner.on("|").join(this.rechargeMails);
   }
}
