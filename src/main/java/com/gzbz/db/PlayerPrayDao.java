package com.gzbz.db;

import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PrayMsg;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_player_pray",
   selectKey = {"id", "prayId"}
)
public class PlayerPrayDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true,
      comment = "玩家code"
   )
   public int id;
   @DBColumnAnno(
      isPrimary = true,
      comment = "转盘类型id"
   )
   public int prayId;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadPrayInfo",
      saveFun = "savePrayInfo",
      comment = "个人祈福奖池"
   )
   public PrayInfo prayInfo;
   @DBColumnAnno(
      comment = "当前幸运值"
   )
   public int luckyPoint;
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadReward",
      saveFun = "saveReward",
      comment = "幸运值奖励领取记录"
   )
   public List<Integer> luckyReward = new ArrayList();
   @DBColumnAnno(
      comment = "上次免费刷新时间"
   )
   public Timestamp refreshTimes = new Timestamp(System.currentTimeMillis() - 3600000L);
   @DBColumnAnno(
      columnType = "TEXT",
      loadFun = "loadRefreshLimit",
      saveFun = "saveRefreshLimit",
      comment = "刷新未出次数"
   )
   public Map<Integer, Integer> refreshLimit = new HashMap();

   public void loadPrayInfo(String data) {
      this.prayInfo = (PrayInfo)JsonUtil.jsonToBean(data, PrayInfo.class);
   }

   public String savePrayInfo() {
      return JsonUtil.object2String(this.prayInfo);
   }

   public void loadReward(String data) {
      this.luckyReward = JsonUtil.jsonToList(data, Integer.class);
   }

   public String saveReward() {
      return JsonUtil.listToJson(this.luckyReward);
   }

   public void loadRefreshLimit(String data) {
      this.refreshLimit = JsonUtil.jsonToMap(data, Integer.class, Integer.class);
   }

   public String saveRefreshLimit() {
      return JsonUtil.beanToJson(this.refreshLimit);
   }

   public void refreshPrayInfo(PrayInfo prayInfo, boolean free) {
      if (free) {
         this.refreshTimes = new Timestamp(System.currentTimeMillis());
      }

      this.prayInfo = prayInfo;
      this.updateOp();
   }

   public void reset() {
      this.prayInfo = null;
   }

   public static class PrayInfo {
      public Map<KeyValFun, ResourceModel> rewards = new HashMap();
      public Map<Integer, Integer> gotGrid = new HashMap();

      public List<PrayMsg.PrayGridInfo> buildInfos() {
         List<PrayMsg.PrayGridInfo> list = new ArrayList();
         this.rewards.forEach((keyValFun, resourceModel) -> {
            PrayMsg.PrayGridInfo.Builder grid = PrayMsg.PrayGridInfo.newBuilder();
            grid.setPos(keyValFun.getKey());
            CommonMsg.ItemInfo.Builder item = CommonMsg.ItemInfo.newBuilder();
            item.setType(resourceModel.getType());
            item.setId(resourceModel.getId());
            item.setNum(resourceModel.getValue());
            grid.setReward(item);
            grid.setCount((Integer)this.gotGrid.getOrDefault(keyValFun.getKey(), 0));
            grid.setLimit(this.gotGrid.containsKey(keyValFun.getKey()) ? 1 : 0);
            list.add(grid.build());
         });
         return list;
      }
   }
}
