package com.gzbz.db;

import com.gzbz.protobuf.GiftMsg;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.util.HashSet;
import java.util.Set;

@DBTableAnno(
   name = "tb_war_order",
   resultType = 2,
   selectKey = {"playerId"},
   mapKey = {"system"}
)
public class WarOrderDao extends DBDao {
   @DBColumnAnno(
      isPrimary = true
   )
   public int playerId;
   @DBColumnAnno(
      isPrimary = true,
      comment = "系统"
   )
   public int system;
   @DBColumnAnno(
      comment = "已领取普通奖励",
      columnType = "TEXT",
      loadFun = "loadCommonReward",
      saveFun = "saveCommonReward"
   )
   public Set<Integer> commonReward = new HashSet();
   @DBColumnAnno(
      comment = "已领取豪华奖励",
      columnType = "TEXT",
      loadFun = "loadSuperReward",
      saveFun = "saveSuperReward"
   )
   public Set<Integer> superReward = new HashSet();

   public GiftMsg.WarOrderData.Builder builder() {
      GiftMsg.WarOrderData.Builder builder = GiftMsg.WarOrderData.newBuilder();
      builder.setSystem(this.system);
      builder.addAllRewardCommon(this.commonReward);
      builder.addAllRewardSuper(this.superReward);
      return builder;
   }

   public void loadCommonReward(String data) {
      this.commonReward.clear();

      for(String s : data.split("\\|")) {
         this.commonReward.add(Integer.parseInt(s));
      }

   }

   public String saveCommonReward() {
      StringBuilder stringBuilder = new StringBuilder();
      if (!this.commonReward.isEmpty()) {
         for(Integer reward : this.commonReward) {
            stringBuilder.append(reward).append("|");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }

   public void loadSuperReward(String data) {
      this.superReward.clear();

      for(String s : data.split("\\|")) {
         this.superReward.add(Integer.parseInt(s));
      }

   }

   public String saveSuperReward() {
      StringBuilder stringBuilder = new StringBuilder();
      if (!this.superReward.isEmpty()) {
         for(Integer reward : this.superReward) {
            stringBuilder.append(reward).append("|");
         }

         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder.toString();
   }
}
