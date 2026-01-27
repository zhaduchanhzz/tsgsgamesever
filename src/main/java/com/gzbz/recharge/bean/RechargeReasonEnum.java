package com.gzbz.recharge.bean;

public enum RechargeReasonEnum {
   NOTIFY_SUC(1700, "回调-成功"),
   NOTIFY_EMPTY_PARAM(1701, "回调-参数存在空值"),
   NOTIFY_GIFT_ID(1702, "回调-礼包ID为空"),
   NOTIFY_SERVER(1703, "回调-服务器错误"),
   NOTIFY_PLAYER_NOT_EXIST(1704, "回调-玩家不存在"),
   NOTIFY_PLAYER_ILLEGAL(1705, "回调-玩家账号不匹配"),
   NOTIFY_MONEY_NOT_SAME(1706, "回调-金额不一致"),
   NOTIFY_ILLEGAL(1707, "回调-非法请求"),
   NOTIFY_ERROR_SIGN(1708, "回调-验签失败"),
   NOTIFY_MODEL_NOT_EXIST(1709, "回调-充值配置项不存在"),
   RECHARGE_TYPE_NOT_EXIST(1710, "充值发放-充值类型不存在"),
   RECHARGE_GIFT_INFO_NOT_DEFINE(1711, "礼包发放-礼包信息不存在"),
   RECHARGE_REWARD_ERROR(1712, "充值发放-发放异常"),
   RECHARGE_ORDER_EXIST(1713, "充值发放-订单重复");

   private int reason;
   private String desc;

   private RechargeReasonEnum(int reason, String desc) {
      this.reason = reason;
      this.desc = desc;
   }

   public int getReason() {
      return this.reason;
   }

   public void setReason(int reason) {
      this.reason = reason;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.desc = desc;
   }
}
