package com.gzbz.db;

import com.gzbz.model.fun.ResourceModel;
import db.DBColumnAnno;
import db.DBDao;
import db.DBTableAnno;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import misc.JsonUtil;

@DBTableAnno(
   name = "tb_recharge"
)
public class RechargeDao extends DBDao {
   @DBColumnAnno(
      columnName = "playerId",
      isPrimary = true,
      comment = "玩家id"
   )
   public int playerId;
   @DBColumnAnno(
      columnName = "billNo",
      isPrimary = true,
      comment = "订单号"
   )
   public String billNo;
   @DBColumnAnno(
      columnName = "account",
      comment = "账号"
   )
   public String account;
   @DBColumnAnno(
      columnName = "platformId",
      comment = "平台id"
   )
   public int platformId;
   @DBColumnAnno(
      columnName = "serverId",
      comment = "服务器id"
   )
   public int serverId;
   @DBColumnAnno(
      columnName = "rechargeId",
      comment = "充值表id"
   )
   public int rechargeId;
   @DBColumnAnno(
      columnName = "money",
      comment = "付款金额"
   )
   public int money;
   @DBColumnAnno(
      columnName = "status",
      comment = "状态"
   )
   public int status = 1;
   @DBColumnAnno(
      columnName = "extra",
      comment = "扩展信息"
   )
   public String extra;
   @DBColumnAnno(
      columnName = "rechargeTime",
      comment = "充值时间"
   )
   public Timestamp rechargeTime = new Timestamp(System.currentTimeMillis());
   @DBColumnAnno(
      columnType = "TEXT",
      columnName = "rewards",
      comment = "充值发放资源列表",
      loadFun = "loadRewards",
      saveFun = "saveRewards"
   )
   public List<ResourceModel> rewards = new ArrayList();
   @DBColumnAnno(
      columnName = "real",
      comment = "是否真实充值"
   )
   public boolean real;
   public static final int STATUS_INIT = 1;
   public static final int STATUS_REWARDING = 2;
   public static final int STATUS_REWARD_DONE = 3;
   public static final int STATUS_FINISH = 4;

   public void loadRewards(String str) {
      this.rewards = JsonUtil.jsonToList(str, ResourceModel.class);
   }

   public String saveRewards() {
      return JsonUtil.listToJson(this.rewards);
   }
}
