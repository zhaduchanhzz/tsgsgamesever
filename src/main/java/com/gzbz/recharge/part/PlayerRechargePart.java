package com.gzbz.recharge.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.activity.part.ActGoldWeekPart;
import com.gzbz.activity.part.ActivityChineseNewYearPart;
import com.gzbz.activity.part.ActivityComeBackPart;
import com.gzbz.activity.part.ActivityEventHeroPart;
import com.gzbz.activity.part.ActivityKrEventHeroPart;
import com.gzbz.activity.part.ActivityLiuBeiPart;
import com.gzbz.activity.part.ActivityMaChaoPart;
import com.gzbz.activity.part.ActivityNewWeekPart;
import com.gzbz.activity.part.ActivityOpenServerRechargePart;
import com.gzbz.activity.part.ActivityPart;
import com.gzbz.activity.part.ActivitySiMaYiPart;
import com.gzbz.activity.part.ActivityZhangFeiPart;
import com.gzbz.activity.part.AnniversaryCelebrationPart;
import com.gzbz.activity.part.ChildActPart;
import com.gzbz.activity.part.DailyRechargePart;
import com.gzbz.activity.part.FlashSalePart;
import com.gzbz.activity.part.FlowerFireActivityPart;
import com.gzbz.activity.part.FortunePart;
import com.gzbz.activity.part.FourteenSignInPart;
import com.gzbz.activity.part.GuoQingActivityPart;
import com.gzbz.activity.part.HeroRaisePart;
import com.gzbz.activity.part.LaborDayActivityPart;
import com.gzbz.activity.part.LimitTimeAddupRechargePart;
import com.gzbz.activity.part.LingLongBookPart;
import com.gzbz.activity.part.MidAutumnPart;
import com.gzbz.activity.part.MonthlyFundPart;
import com.gzbz.activity.part.QiXiActivityPart;
import com.gzbz.activity.part.ServerOpenLimitSalePart;
import com.gzbz.activity.part.ServerOpenTotalRechargePart;
import com.gzbz.activity.part.SevenDayTaskActivityPart;
import com.gzbz.activity.part.SplendidCityPart;
import com.gzbz.activity.part.SpringFestivalPart;
import com.gzbz.activity.part.StarsActivityPart;
import com.gzbz.activity.part.SummerFestivalPart;
import com.gzbz.activity.part.SwimParkActivityPart;
import com.gzbz.activity.part.WeekendKoiPart;
import com.gzbz.activity.part.WinterActPart;
import com.gzbz.activity.part.XdmzActivityPart;
import com.gzbz.activity.part.YuanDanPart;
import com.gzbz.activity.part.YuanXiao2022ActivityPart;
import com.gzbz.activity.part.ZongQingActivityPart;
import com.gzbz.activity.part.ZzrzActivityPart;
import com.gzbz.benefit.GrowFundPart;
import com.gzbz.benefit.MonthlyCardPart;
import com.gzbz.benefit.MonthlyPreferentialPart;
import com.gzbz.benefit.WeeklyPreferentialPart;
import com.gzbz.db.GameDBPool;
import com.gzbz.db.GiftDao;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.RechargeDao;
import com.gzbz.gameCache.GiftCustomCache;
import com.gzbz.gameDefine.ClientTrackingEnum;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.tracking.ClientTrackingPart;
import com.gzbz.gift.GiftMgr;
import com.gzbz.gift.GiftPart;
import com.gzbz.log.RechargeFailLog;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.mini.MiniProgramPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.CoinAddRechargeModel;
import com.gzbz.model.DailyTopUpModel;
import com.gzbz.model.FirstTopUpModel;
import com.gzbz.model.KrJueBanRechargeModel;
import com.gzbz.model.RechargeAwardModel;
import com.gzbz.model.RechargeModel;
import com.gzbz.model.RotaingPackagesModel;
import com.gzbz.model.ShopLimitModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.ValueRechargeModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.privilege.DailyGiftPart;
import com.gzbz.privilege.PrivilegeMallPart;
import com.gzbz.privilege.SingleRechargePart;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.RechargeMsg;
import com.gzbz.qqBigPlayer.part.QqBigPlayerPart;
import com.gzbz.recharge.bean.BillUnConfirmListQueryResult;
import com.gzbz.recharge.bean.RechargeReasonEnum;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.union.part.UnionRedPacketPart;
import com.gzbz.util.TempUtil;
import com.gzbz.worldMgr.WorldMgr;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import misc.DataUtils;
import misc.DateUtil;
import misc.JsonUtil;
import misc.MapUtil;
import misc.MiscUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class PlayerRechargePart extends PlayerPart {
   @Autowired
   private GameDBPool gameDBPool;
   @Autowired
   private WorldMgr worldMgr;
   private static final String QUERY_RECHARGE_UN_CONFIRM_LIST_SQL = "SELECT `billNo`,`rewards` FROM tb_recharge WHERE `playerId` = ? AND `status` = ?";
   private static final String UPDATE_RECHARGE_STATUS_SQL = "UPDATE tb_recharge SET `status` = ? WHERE `playerId` = ? AND `billNo` = ?";
   private static final String UPDATE_RECHARGE_SQL = "UPDATE tb_recharge SET `status` = ? , `rewards` = ? WHERE `playerId` = ? AND `billNo` = ?";

   @MsgHandlerAnno
   public void C2S_RechargeBillList_7715(RechargeMsg.C2S_RechargeBillList_7715 msg, String source) {
      BillUnConfirmListQueryResult billUnConfirmListQueryResult = new BillUnConfirmListQueryResult();

      try {
         this.gameDBPool.query("SELECT `billNo`,`rewards` FROM tb_recharge WHERE `playerId` = ? AND `status` = ?", billUnConfirmListQueryResult, new Object[]{this.player.getPlayerId(), 3});
      } catch (Throwable throwable) {
         throwable.printStackTrace();
      }

      for(RechargeDao rechargeDao : billUnConfirmListQueryResult.billList) {
         if (!rechargeDao.rewards.isEmpty()) {
            this.player.addResourceMsg(rechargeDao.rewards);
         }

         this.player.sendResourceMsg(PlayerMsg.ShowType.SHOW_TYPE_BILL, 0, rechargeDao.billNo);
      }

   }

   @MsgHandlerAnno
   public void C2S_RechargeConfirm_7701(RechargeMsg.C2S_RechargeConfirm_7701 msg, String source) {
      try {
         this.gameDBPool.query("UPDATE tb_recharge SET `status` = ? WHERE `playerId` = ? AND `billNo` = ?", new Object[]{4, this.player.getPlayerId(), msg.getBillNo()});
      } catch (Throwable throwable) {
         throwable.printStackTrace();
      }

   }

   @MsgHandlerAnno
   public void C2S_RoleFirstRecharge_7702(RechargeMsg.C2S_RoleFirstRecharge_7702 msg, String source) {
      this.sendRoleFirstRechargeInfo();
   }

   private void sendRoleFirstRechargeInfo() {
      PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
      RechargeMsg.S2C_RoleFirstRecharge_7703.Builder resp = RechargeMsg.S2C_RoleFirstRecharge_7703.newBuilder();
      resp.setIsOpen(!playerRechargeDao.firstRechargeClose);
      playerRechargeDao.firstRechargeReward.forEach((key, value) -> {
         RechargeMsg.RoleFirstRecharge.Builder firstRechargeInfoBuilder = RechargeMsg.RoleFirstRecharge.newBuilder();
         firstRechargeInfoBuilder.setType(key);
         firstRechargeInfoBuilder.setGotLastDay(MiscUtil.getHiParam(value));
         int activeTime = MiscUtil.getLowParam(value);
         firstRechargeInfoBuilder.setDay(DateUtil.difftimeDay(new Timestamp((long)activeTime * 1000L)) + 1);
         resp.addInfo(firstRechargeInfoBuilder);
      });
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_RoleFirstRechargeReward_7704(RechargeMsg.C2S_RoleFirstRechargeReward_7704 msg, String source) {
      int type = msg.getType();
      Map<Integer, TreeMap<Integer, FirstTopUpModel>> firstRechargeMap = ApplicationContextProvider.<Integer, TreeMap<Integer, FirstTopUpModel>>getModelPoolMap("customFirstTopUp");
      TreeMap<Integer, FirstTopUpModel> firstTopUpModelMap = (TreeMap)firstRechargeMap.get(type);
      if (firstTopUpModelMap == null) {
         this.player.failure(0);
      } else {
         PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
         if (playerRechargeDao.firstRechargeClose) {
            this.player.failure(0);
         } else if (!playerRechargeDao.firstRechargeReward.containsKey(type)) {
            this.player.failure(35);
         } else {
            long gotReward = (Long)playerRechargeDao.firstRechargeReward.get(type);
            if (gotReward == 0L) {
               this.player.failure(0);
            } else {
               int lastGotDay = MiscUtil.getHiParam(gotReward);
               int activeTime = MiscUtil.getLowParam(gotReward);
               int today = DateUtil.difftimeDay(new Timestamp((long)activeTime * 1000L)) + 1;
               if (lastGotDay >= firstTopUpModelMap.size()) {
                  this.player.failure(24);
               } else {
                  List<ResourceModel> resourceModelList = new ArrayList();
                  int maxDay = Math.min(today, firstTopUpModelMap.size());

                  for(int day = lastGotDay + 1; day <= maxDay; ++day) {
                     FirstTopUpModel firstTopUpModel = (FirstTopUpModel)firstTopUpModelMap.get(day);
                     if (firstTopUpModel != null) {
                        lastGotDay = day;
                        playerRechargeDao.firstRechargeReward.put(type, MiscUtil.comboInteger(day, activeTime));
                        resourceModelList.addAll(firstTopUpModel.getRewards());
                     }
                  }

                  this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 17, 1702, lastGotDay, 0, "FirstRecharge");
                  if (playerRechargeDao.firstRechargeReward.size() == firstRechargeMap.size() && playerRechargeDao.firstRechargeReward.entrySet().stream().allMatch((entry) -> MiscUtil.getHiParam((Long)entry.getValue()) >= ((TreeMap)firstRechargeMap.get(type)).size())) {
                     playerRechargeDao.firstRechargeClose = true;
                  }

                  playerRechargeDao.updateOp();
                  this.sendRoleFirstRechargeInfo();
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_DailyFirstRecharge_7706(RechargeMsg.C2S_DailyFirstRecharge_7706 msg, String source) {
      this.sendDailyFirstRechargeInfo();
   }

   @MsgHandlerAnno
   public void C2S_DailyFirstRechargeReward_7708(RechargeMsg.C2S_DailyFirstRechargeReward_7708 msg, String source) {
      int id = msg.getId();
      DailyTopUpModel dailyTopUpModel = (DailyTopUpModel)ApplicationContextProvider.getModelPoolEntity("dailyTopUp", id);
      if (dailyTopUpModel == null) {
         this.sendDailyFirstRechargeReward(0, id, "玩家{}领取每日首充奖励失败,配置{}不存在", this.player.getPlayerId(), id);
      } else {
         PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
         if (playerRechargeDao.dailyRecharge < dailyTopUpModel.getNeedTopUp()) {
            this.sendDailyFirstRechargeReward(35, id, "玩家{}领取每日首充奖励失败,领取{}充值金额不足{}", this.player.getPlayerId(), id, dailyTopUpModel.getNeedTopUp());
         } else if (playerRechargeDao.isGotDailyFirstRechargeReward(id)) {
            this.sendDailyFirstRechargeReward(24, id, "玩家{}领取每日首充奖励失败,已领取{}奖励", this.player.getPlayerId(), id);
         } else {
            playerRechargeDao.addDailyFirstRechargeReward(id);
            playerRechargeDao.updateOp();
            this.player.addResource(dailyTopUpModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 17, 1703, id, 0, "DailyFirstRechargeReward");
            this.sendDailyFirstRechargeReward(1, id, (String)null);
            LogOperationMgr logOperationMgr = (LogOperationMgr)ApplicationContextProvider.getContext().getBean(LogOperationMgr.class);
            logOperationMgr.pushTask(() -> {
               SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 1840);
               if (systemFunctionModel != null) {
                  logOperationMgr.addActivityLog(this.player, systemFunctionModel.getId(), systemFunctionModel.getName());
                  logOperationMgr.addReceiveAwardNewLog(this.player, 14, systemFunctionModel.getId(), systemFunctionModel.getName(), dailyTopUpModel.getNeedTopUp() + "", String.valueOf(dailyTopUpModel.getNeedTopUp()), 0, id, 1);
               }

            });
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ValueRechargeRewardInfo_7710(RechargeMsg.C2S_ValueRechargeRewardInfo_7710 msg, String source) {
      this.sendValueRechargeInfo();
   }

   @MsgHandlerAnno
   public void C2S_ValueRechargeReward_7712(RechargeMsg.C2S_ValueRechargeReward_7712 msg, String source) {
      int quantity = msg.getQuantity();
      int day = msg.getDay();
      Map<Integer, Map<Integer, ValueRechargeModel>> allModel = ApplicationContextProvider.<Integer, Map<Integer, ValueRechargeModel>>getModelPoolMap("customValueRecharge");
      Map<Integer, ValueRechargeModel> valueRechargeModelMap = (Map)allModel.get(quantity);
      if (valueRechargeModelMap != null && !valueRechargeModelMap.isEmpty()) {
         PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
         long valueRechargeReward = (Long)playerRechargeDao.valueRechargeReward.getOrDefault(quantity, 0L);
         if (valueRechargeReward > 0L && quantity <= playerRechargeDao.totalRecharge) {
            ValueRechargeModel valueRechargeModel = (ValueRechargeModel)valueRechargeModelMap.get(day);
            if (valueRechargeModel == null) {
               this.player.failure(0);
            } else if (day <= valueRechargeModelMap.size() && MiscUtil.getHiParam(valueRechargeReward) == day - 1) {
               int activeTime = MiscUtil.getLowParam(valueRechargeReward);
               if (activeTime <= 0) {
                  this.player.failure(35);
               } else if (DateUtil.difftimeDay(new Timestamp((long)activeTime * 1000L)) + 1 < day) {
                  this.player.failure(6);
               } else {
                  valueRechargeReward = MiscUtil.comboInteger(day, activeTime);
                  playerRechargeDao.valueRechargeReward.put(quantity, valueRechargeReward);
                  playerRechargeDao.updateOp();
                  List<ResourceModel> awardList = this.getRechargeReward(valueRechargeModel);
                  this.player.addResource(awardList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 17, 1704, quantity, day, "");
                  RechargeMsg.S2C_ValueRechargeReward_7713.Builder resp = RechargeMsg.S2C_ValueRechargeReward_7713.newBuilder();
                  resp.setInfo(this.buildValueRechargeInfo(quantity, valueRechargeReward));
                  this.player.sendMsg(resp.build());
                  LogOperationMgr logOperationMgr = (LogOperationMgr)ApplicationContextProvider.getContext().getBean(LogOperationMgr.class);
                  logOperationMgr.pushTask(() -> {
                     SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 1830);
                     if (systemFunctionModel != null) {
                        logOperationMgr.addActivityLog(this.player, systemFunctionModel.getId(), systemFunctionModel.getName());
                        logOperationMgr.addReceiveAwardNewLog(this.player, 14, systemFunctionModel.getId(), systemFunctionModel.getName(), valueRechargeModel.getRechargeQuantity() + "", String.valueOf(valueRechargeModel.getRechargeQuantity()), 0, day, valueRechargeModelMap.size());
                     }

                  });
               }
            } else {
               this.player.failure(24);
            }
         } else {
            this.player.failure(35);
         }
      } else {
         this.player.failure(0);
      }
   }

   public List<ResourceModel> getRechargeReward(ValueRechargeModel valueRechargeModel) {
      List<ResourceModel> list = new ArrayList();

      for(ResourceModel model : valueRechargeModel.getLoginItems()) {
         model.addResourceToList(list);
      }

      if (valueRechargeModel.getAreanItem() != null && !valueRechargeModel.getAreanItem().equals("")) {
         String[] value = valueRechargeModel.getAreanItem().split(",");

         for(int i = 0; i < value.length; ++i) {
            String[] realStr = value[i].split("\\|");
            if (realStr[0].equals(this.worldMgr.country)) {
               list.add(new ResourceModel(Integer.parseInt(realStr[1]), Integer.parseInt(realStr[2]), Integer.parseInt(realStr[3])));
            }
         }
      }

      return list;
   }

   @MsgHandlerAnno
   public void C2S_RechargeByCoin_7717(RechargeMsg.C2S_RechargeByCoin_7717 msg, String source) {
      RechargeModel rechargeModel = (RechargeModel)ApplicationContextProvider.getModelPoolEntity("custom_recharge", msg.getPlatform() + "-" + msg.getRechargeType() + "-" + msg.getMoney());
      if (rechargeModel == null) {
         this.player.failure(37);
      } else {
         ShopLimitModel shopLimitModel = null;
         if (rechargeModel.getType() == 5 || rechargeModel.getType() == 12 || rechargeModel.getType() == 13) {
            shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", msg.getGoodId());
            if (shopLimitModel == null) {
               this.player.failure(37);
               return;
            }

            RechargeModel checkRechargeModel = (RechargeModel)ApplicationContextProvider.getModelPoolEntity("rechargePrice", shopLimitModel.getPriceType());
            if (checkRechargeModel == null || checkRechargeModel.getMoney() != msg.getMoney()) {
               this.player.failure(6);
               return;
            }
         }

         RechargeMsg.S2C_RechargeByCoin_7718.Builder resp = RechargeMsg.S2C_RechargeByCoin_7718.newBuilder();
         resp.setGoodId(msg.getGoodId());
         resp.setMoney(msg.getMoney());
         resp.setRechargeType(msg.getRechargeType());
         resp.setPlatform(msg.getPlatform());
         int innerCoinId = 888880;
         int innerScale = 10;
         int feeInnerCoin = rechargeModel.getMoney() * innerScale;
         long innerCoin = this.player.getResourceNum(2, innerCoinId);
         int realCoinId = ApplicationContextProvider.getConfigInt("SpecialMoneyId", 88888888);
         int realScale = ApplicationContextProvider.getConfigInt("SpecialMoneyScale", innerScale);
         int feeRealCoin = rechargeModel.getMoney() * realScale;
         long realCoin = this.player.getResourceNum(2, realCoinId);
         int reason;
         if (realCoin < (long)feeRealCoin) {
            if (innerCoin < (long)feeInnerCoin) {
               this.player.failure(34);
               return;
            }

            reason = 1707;
            resp.setIsReal(false);
            this.player.delResource(2, innerCoinId, (long)feeInnerCoin, 17, reason, rechargeModel.getId(), msg.getGoodId(), rechargeModel.getName());
         } else {
            PlayerPublicDao playerPublicDao = this.player.getPublicDao();
            this.logger.info("【{}-{}】使用三国代币x【{}】购买:平台类型【{}】,充值项【{}-{}】,礼包【{}-{}】,实际价格【{}】", new Object[]{playerPublicDao.playerId, playerPublicDao.playerName, feeRealCoin, rechargeModel.getPlatformType(), rechargeModel.getType(), rechargeModel.getName(), msg.getGoodId(), shopLimitModel == null ? "" : shopLimitModel.getTips(), rechargeModel.getMoney()});
            reason = 1708;
            resp.setIsReal(true);
            this.player.delResource(2, realCoinId, (long)feeRealCoin, 17, reason, rechargeModel.getId(), msg.getGoodId(), rechargeModel.getName());
         }

         this.player.sendMsg(resp.build());
         this.recharge("", "", rechargeModel, msg.getGoodId(), 17, reason, "");
      }
   }

   private RechargeMsg.ValueRechargeInfo buildValueRechargeInfo(int quantity, long value) {
      Map<Integer, Map<Integer, ValueRechargeModel>> allModel = ApplicationContextProvider.<Integer, Map<Integer, ValueRechargeModel>>getModelPoolMap("customValueRecharge");
      Map<Integer, ValueRechargeModel> valueRechargeModelMap = (Map)allModel.get(quantity);
      int today = DateUtil.difftimeDay(new Timestamp((long)MiscUtil.getLowParam(value) * 1000L)) + 1;
      int maxDay = valueRechargeModelMap.values().stream().mapToInt(ValueRechargeModel::getDay).max().orElse(0);
      boolean isGot = today > maxDay || MiscUtil.getHiParam(value) == today;
      RechargeMsg.ValueRechargeInfo.Builder msg = RechargeMsg.ValueRechargeInfo.newBuilder();
      msg.setDay(Math.min(today, maxDay));
      msg.setQuantity(quantity);
      msg.setTodayGot(isGot);
      return msg.build();
   }

   public int rechargeTotalReward(int rechargeAwardId, int curRecharge, int module, int reason) {
      RechargeAwardModel rechargeAwardModel = (RechargeAwardModel)ApplicationContextProvider.getModelPoolEntity("rechargeAward", rechargeAwardId);
      if (rechargeAwardModel == null) {
         return 0;
      } else if (curRecharge < rechargeAwardModel.getMoney()) {
         return 35;
      } else {
         this.player.addResource(rechargeAwardModel.getItems(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, module, reason, curRecharge, rechargeAwardId, "");
         return 1;
      }
   }

   public void gmFirstRechargeTime(int day) {
      PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
      playerRechargeDao.firstRechargeReward.entrySet().forEach((entry) -> {
         int rewardDay = MiscUtil.getHiParam((Long)entry.getValue());
         int activeTime = DateUtil.getIntTime(DateUtil.getSomeDayBeginTime(System.currentTimeMillis() - (long)day * 86400000L));
         entry.setValue(MiscUtil.comboInteger(rewardDay, activeTime));
      });
      playerRechargeDao.updateOp();
      this.sendRoleFirstRechargeInfo();
   }

   public void recharge(String billNo, String extra, RechargeModel rechargeModel, int buyId, int module, int reason, String dataToClient) {
      int status = 1;
      List<ResourceModel> resourceModelList = new ArrayList();

      try {
         try {
            PlayerDao playerDao = this.player.getPlayerDao();
            PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
            int curVipLv = playerDao.vip_lv;
            status = 2;
            PlayerMsg.ShowType showType = PlayerMsg.ShowType.SHOW_TYPE_BILL;
            int centreAwardGroup = 0;
            MonthlyFundPart monthlyFundPart = (MonthlyFundPart)this.player.getMgrPart(MonthlyFundPart.class);
            SingleRechargePart singleRechargePart = (SingleRechargePart)this.player.getMgrPart(SingleRechargePart.class);
            GrowFundPart growFundPart = (GrowFundPart)this.player.getMgrPart(GrowFundPart.class);
            int realCoinId = ApplicationContextProvider.getConfigInt("SpecialMoneyId", 88888888);
            String rechargeWayName;
            String rechargeName;
            if (rechargeModel.getType() != 88 && rechargeModel.getType() != 89) {
               if (playerRechargeDao.totalRecharge == 0) {
                  playerRechargeDao.firstRechargeTime = System.currentTimeMillis();
               }

               playerRechargeDao.dailyRecharge += rechargeModel.getMoney();
               this.player.notifyPlayerData(PlayerDefine.PLAYER_RECHARGE_DAILY_TOTAL, playerRechargeDao.dailyRecharge);
               playerRechargeDao.monthlyRecharge += rechargeModel.getMoney();
               this.player.notifyPlayerData(PlayerDefine.PLAYER_RECHARGE_MONTH_TOTAL, playerRechargeDao.monthlyRecharge);
               playerRechargeDao.totalRecharge += rechargeModel.getMoney();
               this.player.notifyPlayerData(PlayerDefine.PLAYER_RECHARGE_TOTAL, playerRechargeDao.totalRecharge);
               int addRechargeDayNeed = ApplicationContextProvider.getConfigInt("AccumulatedRecharge", Integer.MAX_VALUE);
               if (addRechargeDayNeed <= rechargeModel.getMoney() && !DateUtil.isSameDay((long)playerRechargeDao.getLastTotalRechargeDayTime() * 1000L)) {
                  playerRechargeDao.addTotalRechargeDay();
                  this.player.notifyPlayerData(PlayerDefine.PLAYER_RECHARGE_TOTAL_DAY, playerRechargeDao.getTotalRechargeDay());
               }

               Map<Integer, TreeMap<Integer, FirstTopUpModel>> firstRechargeMap = ApplicationContextProvider.<Integer, TreeMap<Integer, FirstTopUpModel>>getModelPoolMap("customFirstTopUp");
               if (playerRechargeDao.firstRechargeReward.size() < firstRechargeMap.size()) {
                  firstRechargeMap.forEach((key, value) -> {
                     if (!playerRechargeDao.firstRechargeReward.containsKey(key) && playerRechargeDao.totalRecharge >= ((FirstTopUpModel)value.firstEntry().getValue()).getNeedTopUp()) {
                        playerRechargeDao.firstRechargeReward.put(key, MiscUtil.comboInteger(0, DateUtil.getIntTime(DateUtil.getSomeDayBeginTime(System.currentTimeMillis()))));
                        this.sendRoleFirstRechargeInfo();
                     }

                  });
               }

               boolean valueRechargeSend = false;
               Map<Integer, Map<Integer, ValueRechargeModel>> valueRechargeAllModel = ApplicationContextProvider.<Integer, Map<Integer, ValueRechargeModel>>getModelPoolMap("customValueRecharge");

               for(Map.Entry<Integer, Map<Integer, ValueRechargeModel>> entry : valueRechargeAllModel.entrySet()) {
                  Integer key = (Integer)entry.getKey();
                  if (!playerRechargeDao.valueRechargeReward.containsKey(key) && playerRechargeDao.totalRecharge >= key) {
                     playerRechargeDao.valueRechargeReward.put(key, MiscUtil.comboInteger(0, DateUtil.getIntTime(System.currentTimeMillis())));
                     valueRechargeSend = true;
                  }
               }

               MonthlyCardPart monthlyCardPart = (MonthlyCardPart)this.player.getMgrPart(MonthlyCardPart.class);
               monthlyCardPart.monthlyCardActivate(rechargeModel.getMoney());
               if (rechargeModel.getType() > 0) {
                  switch (rechargeModel.getType()) {
                     case 1:
                        singleRechargePart.singleRecharge(resourceModelList, rechargeModel);
                        rechargeWayName = "特权-充值";
                        rechargeName = rechargeModel.getName();
                        break;
                     case 4:
                     case 10:
                     case 11:
                        growFundPart.buy(rechargeModel.getId());
                        rechargeWayName = "福利-成长基金-" + rechargeModel.getMoney();
                        rechargeName = rechargeModel.getName();
                        GiftMgr giftMgr = (GiftMgr)ApplicationContextProvider.getContext().getBean(GiftMgr.class);
                        giftMgr.pushTask(() -> giftMgr.generalWelfareCounter(4, 1));
                        break;
                     case 5:
                     case 12:
                     case 13:
                        ShopLimitModel shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", buyId);
                        if (shopLimitModel == null) {
                           this.rechargeFail(rechargeModel.getId(), billNo, rechargeModel.getMoney(), extra, RechargeReasonEnum.RECHARGE_GIFT_INFO_NOT_DEFINE);
                           return;
                        }

                        SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", shopLimitModel.getSytemFunctionId());
                        if (systemFunctionModel == null) {
                           rechargeWayName = String.valueOf(shopLimitModel.getSytemFunctionId());
                        } else {
                           rechargeWayName = systemFunctionModel.getTips() + "-" + systemFunctionModel.getName();
                        }

                        rechargeName = shopLimitModel.getId() + "-" + shopLimitModel.getTips();
                        this.buyGift(resourceModelList, shopLimitModel, !StringUtils.isEmpty(billNo));
                        if (shopLimitModel.getGiftType() == 11) {
                           showType = PlayerMsg.ShowType.SHOW_TYPE_HERO_RAISE;
                        } else if (shopLimitModel.getGiftType() == 34) {
                           centreAwardGroup = CentreAwardModel.TYPE_MONTH_CARD_HUA_WEI;
                        } else if (shopLimitModel.getGiftType() == 35) {
                           showType = PlayerMsg.ShowType.SHOW_FIRST_YEAR_ACTIVITY_TREASURE_GIFT;
                        } else if (shopLimitModel.getGiftType() == 43) {
                           showType = PlayerMsg.ShowType.SHOW_NEW_WEEK;
                        } else if (shopLimitModel.getGiftType() == 46) {
                           showType = PlayerMsg.ShowType.SHOW_LING_LONG_BOOK_GIFT;
                        }
                        break;
                     case 6:
                     case 7:
                     case 8:
                        monthlyFundPart.recharge(rechargeModel);
                        rechargeWayName = "超值基金-" + rechargeModel.getMoney() + "基金";
                        rechargeName = rechargeModel.getName();
                        break;
                     case 90:
                        rechargeWayName = "任意金额元宝-" + rechargeModel.getMoney();
                        rechargeName = rechargeModel.getName();
                        if (rechargeModel.getIngots() % 10 == 0) {
                           RechargeModel tempRechargeModel = (RechargeModel)ApplicationContextProvider.getModelPoolEntity("custom_recharge", extra.split("\\|")[0] + "-" + 1 + "-" + rechargeModel.getIngots() / 10);
                           if (tempRechargeModel != null) {
                              singleRechargePart.singleRecharge(resourceModelList, tempRechargeModel);
                           }
                        }
                        break;
                     default:
                        this.rechargeFail(rechargeModel.getId(), billNo, rechargeModel.getMoney(), extra, RechargeReasonEnum.RECHARGE_TYPE_NOT_EXIST);
                        return;
                  }
               } else {
                  rechargeWayName = "IOS审核";
                  rechargeName = "IOS审核直充";
               }

               if (rechargeModel.getIngots() > 0) {
                  resourceModelList.add(new ResourceModel(1, PlayerDefine.PLAYER_GOLD, rechargeModel.getIngots()));
               }

               if (rechargeModel.getVipExp() > 0) {
                  this.player.addResource(1, PlayerDefine.PLAYER_VIP_EXP, rechargeModel.getVipExp(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, module, reason, rechargeModel.getId(), buyId, "");
               }

               int totalRechargeGold = resourceModelList.stream().filter((resourceModel) -> resourceModel.getType() == 1 && resourceModel.getId() == PlayerDefine.PLAYER_GOLD).mapToInt(ResourceModel::getValue).sum();
               playerRechargeDao.totalRechargeGold += (long)totalRechargeGold;
               playerRechargeDao.updateOp();
               this.player.triggerTask(332, 0, playerRechargeDao.totalRechargeGold, 0);
               this.player.triggerTask(510, 0, (long)rechargeModel.getMoney(), 1);
               this.player.triggerTask(525, 0, (long)playerRechargeDao.totalRecharge, 0);
               this.activityRecharge(rechargeModel.getMoney());
               QqBigPlayerPart qqBigPlayerPart = (QqBigPlayerPart)this.player.getMgrPart(QqBigPlayerPart.class);
               qqBigPlayerPart.rechargeHandle(rechargeModel.getMoney(), rechargeModel.getIngots(), rechargeModel.getType());
               FortunePart fortunePart = (FortunePart)this.player.getMgrPart(FortunePart.class);
               fortunePart.addRechargePoint(rechargeModel.getMoney(), resourceModelList);
               if (rechargeModel.getType() == 5 || rechargeModel.getType() == 12 || rechargeModel.getType() == 13) {
                  this.afterBuyGift(buyId);
               }

               if (valueRechargeSend) {
                  this.sendValueRechargeInfo();
               }
            } else {
               rechargeWayName = "代币-" + rechargeModel.getMoney();
               rechargeName = rechargeModel.getName();
               if (rechargeModel.getType() == 88) {
                  int scale = ApplicationContextProvider.getConfigInt("SpecialMoneyScale", 10);
                  resourceModelList.add(new ResourceModel(2, realCoinId, rechargeModel.getMoney() * scale));
               } else if (rechargeModel.getType() == 89) {
                  resourceModelList.add(new ResourceModel(2, realCoinId, rechargeModel.getSanguobi()));
                  singleRechargePart.singleRecharge(resourceModelList, rechargeModel);
               }
            }

            if (rechargeModel.getType() == 90) {
               Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
               TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_INGOT_ANY);
               CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
               String descFormat = MessageFormat.format(centreAwardModel.getDesc(), rechargeModel.getIngots());
               MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), descFormat, resourceModelList, 604800000L, module, reason);
               status = 4;
            } else if ((rechargeModel.getType() == 5 || rechargeModel.getType() == 12 || rechargeModel.getType() == 13) && centreAwardGroup > 0 && !this.player.isLogin()) {
               MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
               Map<Integer, TreeMap<Integer, CentreAwardModel>> allAwardModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
               TreeMap<Integer, CentreAwardModel> monthCardModelMap = (TreeMap)allAwardModelMap.get(centreAwardGroup);
               if (monthCardModelMap != null && !monthCardModelMap.isEmpty()) {
                  CentreAwardModel centreAwardModel = (CentreAwardModel)monthCardModelMap.firstEntry().getValue();
                  mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), resourceModelList, 604800000L, 17, 1711);
                  status = 4;
               }
            } else {
               this.player.addResource(resourceModelList, showType, module, reason, rechargeModel.getId(), buyId, billNo);
               status = 3;
            }

            if (!StringUtils.isEmpty(billNo)) {
               this.player.getOperationMgr().addRechargeNewLog(this.player, curVipLv, rechargeModel.getMoney(), rechargeModel.getName(), rechargeWayName, rechargeName);
               ClientTrackingPart clientTrackingPart = (ClientTrackingPart)this.player.getMgrPart(ClientTrackingPart.class);
               clientTrackingPart.clientTrack(ClientTrackingEnum.SP_AF_FIRST_PAY, ClientTrackingEnum.SP_AF_FIRST_PAY.name(), "RoleLevel=" + playerDao.lv);
               if (!StringUtils.isEmpty(dataToClient)) {
                  String[] dataToClientArr = dataToClient.split("\\|");
                  if (dataToClientArr.length == 3) {
                     clientTrackingPart.clientTrack(ClientTrackingEnum.SP_AF_PURCHASE, billNo, "productID=" + dataToClientArr[0], "productName=" + dataToClientArr[1], "amount=" + dataToClientArr[2], "orderID=" + billNo);
                  } else {
                     this.logger.error("客户端打点信息有误:{}", dataToClient);
                  }
               }
            }

            MiniProgramPart miniProgramPart = (MiniProgramPart)this.player.getMgrPart(MiniProgramPart.class);
            miniProgramPart.shareOutBonus(rechargeModel.getMoney());
         } catch (Exception e) {
            e.printStackTrace();
            this.rechargeFail(rechargeModel.getId(), billNo, rechargeModel.getMoney(), extra, RechargeReasonEnum.RECHARGE_REWARD_ERROR);
         }

      } finally {
         if (!StringUtils.isEmpty(billNo)) {
            try {
               this.gameDBPool.query("UPDATE tb_recharge SET `status` = ? , `rewards` = ? WHERE `playerId` = ? AND `billNo` = ?", new Object[]{status, JsonUtil.listToJson(resourceModelList), this.player.getPlayerId(), billNo});
            } catch (Throwable throwable) {
               throwable.printStackTrace();
               this.logger.error("更新【{}】订单【{}】失败,{}", new Object[]{this.player.getPlayerId(), billNo, throwable.getMessage()});
            }
         }

      }
   }

   private void activityRecharge(int money) {
      if (money > 0) {
         PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
         SevenDayTaskActivityPart sevenDayTaskActivityPart = (SevenDayTaskActivityPart)this.player.getMgrPart(SevenDayTaskActivityPart.class);
         ActivityInfo activityInfo = (ActivityInfo)playerActivityDao.activities.get(sevenDayTaskActivityPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            playerActivityDao.activityRecharge.put(sevenDayTaskActivityPart.getActivityType(), (Integer)MapUtil.getOrDefault(playerActivityDao.activityRecharge, sevenDayTaskActivityPart.getActivityType(), 0) + money);
            playerActivityDao.updateOp();
            sevenDayTaskActivityPart.sendRechargeRewardInfo();
         }

         ZzrzActivityPart zzrzActivityPart = (ZzrzActivityPart)this.player.getMgrPart(ZzrzActivityPart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(zzrzActivityPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            playerActivityDao.activityRecharge.put(zzrzActivityPart.getActivityType(), (Integer)MapUtil.getOrDefault(playerActivityDao.activityRecharge, zzrzActivityPart.getActivityType(), 0) + money);
            playerActivityDao.updateOp();
            zzrzActivityPart.sendRechargeRewardInfo();
         }

         XdmzActivityPart xdmzActivityPart = (XdmzActivityPart)this.player.getMgrPart(XdmzActivityPart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(xdmzActivityPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            playerActivityDao.activityRecharge.put(xdmzActivityPart.getActivityType(), (Integer)MapUtil.getOrDefault(playerActivityDao.activityRecharge, xdmzActivityPart.getActivityType(), 0) + money);
            playerActivityDao.updateOp();
            xdmzActivityPart.sendRechargeRewardInfo();
         }

         StarsActivityPart starsActivityPart = (StarsActivityPart)this.player.getMgrPart(StarsActivityPart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(starsActivityPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            starsActivityPart.activityRecharge(money);
         }

         SwimParkActivityPart swimParkActivityPart = (SwimParkActivityPart)this.player.getMgrPart(SwimParkActivityPart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(swimParkActivityPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            swimParkActivityPart.activityRecharge(money);
         }

         ActivityZhangFeiPart activityZhangFeiPart = (ActivityZhangFeiPart)this.player.getMgrPart(ActivityZhangFeiPart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(activityZhangFeiPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            activityZhangFeiPart.activityRecharge(money);
         }

         FlowerFireActivityPart flowerFireActivityPart = (FlowerFireActivityPart)this.player.getMgrPart(FlowerFireActivityPart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(flowerFireActivityPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            flowerFireActivityPart.activityRecharge(money);
         }

         SplendidCityPart splendidCityPart = (SplendidCityPart)this.player.getMgrPart(SplendidCityPart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(splendidCityPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            splendidCityPart.activityRecharge(money);
         }

         ActivitySiMaYiPart activitySiMaYiPart = (ActivitySiMaYiPart)this.player.getMgrPart(ActivitySiMaYiPart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(activitySiMaYiPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            activitySiMaYiPart.activityRecharge(money);
         }

         YuanXiao2022ActivityPart yuanXiao2022ActivityPart = (YuanXiao2022ActivityPart)this.player.getMgrPart(YuanXiao2022ActivityPart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(yuanXiao2022ActivityPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            yuanXiao2022ActivityPart.activityRecharge(money);
         }

         ActivityLiuBeiPart liuBeiPart = (ActivityLiuBeiPart)this.player.getMgrPart(ActivityLiuBeiPart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(liuBeiPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            liuBeiPart.activityRecharge(money);
         }

         ServerOpenTotalRechargePart openServerTotalRechargeActivityPart = (ServerOpenTotalRechargePart)this.player.getMgrPart(ServerOpenTotalRechargePart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(openServerTotalRechargeActivityPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            openServerTotalRechargeActivityPart.activityRecharge(money);
         }

         LaborDayActivityPart laborDayActivityPart = (LaborDayActivityPart)this.player.getMgrPart(LaborDayActivityPart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(laborDayActivityPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            laborDayActivityPart.activityRecharge(money);
            laborDayActivityPart.shopAddUpRechargeHandle(true);
         }

         ActivityMaChaoPart activityMaChaoPart = (ActivityMaChaoPart)this.player.getMgrPart(ActivityMaChaoPart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(activityMaChaoPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            activityMaChaoPart.activityRecharge(money);
         }

         ZongQingActivityPart zongQingActivityPart = (ZongQingActivityPart)this.player.getMgrPart(ZongQingActivityPart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(zongQingActivityPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            zongQingActivityPart.activityRecharge(money);
            zongQingActivityPart.shopAddUpRechargeHandle(true);
         }

         LimitTimeAddupRechargePart limitTimeAddupRechargePart = (LimitTimeAddupRechargePart)this.player.getMgrPart(LimitTimeAddupRechargePart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(limitTimeAddupRechargePart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            limitTimeAddupRechargePart.activityRecharge(money);
         }

         ActivityEventHeroPart eventHeroPart = (ActivityEventHeroPart)this.player.getMgrPart(ActivityEventHeroPart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(eventHeroPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            eventHeroPart.activityRecharge(money);
         }

         ActivityKrEventHeroPart eventKrHeroPart = (ActivityKrEventHeroPart)this.player.getMgrPart(ActivityKrEventHeroPart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(eventKrHeroPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            eventKrHeroPart.activityRecharge(money);
         }

         QiXiActivityPart qixiActivityPart = (QiXiActivityPart)this.player.getMgrPart(QiXiActivityPart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(qixiActivityPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            qixiActivityPart.activityRecharge(money);
            qixiActivityPart.shopAddUpRechargeHandle(true);
         }

         ActivityComeBackPart activityComeBackPart = (ActivityComeBackPart)this.player.getMgrPart(ActivityComeBackPart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(activityComeBackPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            activityComeBackPart.activityRecharge(money);
         }

         MidAutumnPart midAutumnPart = (MidAutumnPart)this.player.getMgrPart(MidAutumnPart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(midAutumnPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            midAutumnPart.activityRecharge(money);
            midAutumnPart.shopAddUpRechargeHandle(true);
         }

         GuoQingActivityPart guoQingActivityPart = (GuoQingActivityPart)this.player.getMgrPart(GuoQingActivityPart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(guoQingActivityPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            guoQingActivityPart.activityRecharge(money);
            guoQingActivityPart.shopAddUpRechargeHandle(true);
         }

         AnniversaryCelebrationPart anniversaryCelebrationPart = (AnniversaryCelebrationPart)this.player.getMgrPart(AnniversaryCelebrationPart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(anniversaryCelebrationPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            anniversaryCelebrationPart.activityRecharge(money);
            anniversaryCelebrationPart.shopAddUpRechargeHandle(true);
         }

         YuanDanPart yuanDanPart = (YuanDanPart)this.player.getMgrPart(YuanDanPart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(yuanDanPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            yuanDanPart.activityRecharge(money);
            yuanDanPart.shopAddUpRechargeHandle(true);
         }

         ActivityChineseNewYearPart chineseNewYearPart = (ActivityChineseNewYearPart)this.player.getMgrPart(ActivityChineseNewYearPart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(chineseNewYearPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            chineseNewYearPart.activityRecharge(money);
            chineseNewYearPart.shopAddUpRechargeHandle(true);
         }

         FortunePart fortunePart = (FortunePart)this.player.getMgrPart(FortunePart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(fortunePart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            fortunePart.activityRecharge(money);
         }

         ActGoldWeekPart actGoldWeekPart = (ActGoldWeekPart)this.player.getMgrPart(ActGoldWeekPart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(actGoldWeekPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            actGoldWeekPart.activityRecharge(money);
            actGoldWeekPart.shopAddUpRechargeHandle(true);
         }

         FourteenSignInPart fourteenSignInPart = (FourteenSignInPart)this.player.getMgrPart(FourteenSignInPart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(fourteenSignInPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            fourteenSignInPart.activityRecharge(money);
         }

         ChildActPart childActPart = (ChildActPart)this.player.getMgrPart(ChildActPart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(childActPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            childActPart.activityRecharge(money);
         }

         SummerFestivalPart summerFestivalPart = (SummerFestivalPart)this.player.getMgrPart(SummerFestivalPart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(summerFestivalPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            summerFestivalPart.activityRecharge(money);
            summerFestivalPart.shopAddUpRechargeHandle(true);
         }

         ActivityOpenServerRechargePart rechargePart = (ActivityOpenServerRechargePart)this.player.getMgrPart(ActivityOpenServerRechargePart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(rechargePart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            rechargePart.activityRecharge(money);
         }

         WinterActPart winterActPart = (WinterActPart)this.player.getMgrPart(WinterActPart.class);
         activityInfo = (ActivityInfo)playerActivityDao.activities.get(winterActPart.getActivityType());
         if (activityInfo != null && activityInfo.id > 0 && activityInfo.open) {
            winterActPart.activityRecharge(money);
            winterActPart.shopAddUpRechargeHandle(true);
         }

      }
   }

   public void buyGift(List<ResourceModel> resourceModels, ShopLimitModel shopLimitModel, boolean isReal) {
      int systemId = 0;
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      boolean buySuc = giftPart.buy(resourceModels, shopLimitModel.getId(), 22, 2204);
      switch (shopLimitModel.getGiftType()) {
         case 1:
            systemId = 1930;
            break;
         case 2:
            systemId = 1940;
            break;
         case 3:
            systemId = 1310;
            break;
         case 4:
            systemId = 1305;
            break;
         case 5:
            systemId = 1401;
            if (buySuc) {
               FlashSalePart flashSalePart = (FlashSalePart)this.player.getMgrPart(FlashSalePart.class);
               flashSalePart.buyFlashSale(shopLimitModel.getId(), resourceModels);
            }
            break;
         case 6:
            systemId = 1377;
         case 7:
         case 8:
         case 9:
         case 10:
         case 12:
         case 14:
         case 15:
         case 16:
         case 18:
         case 20:
         case 22:
         case 24:
         case 25:
         case 27:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 33:
         case 34:
         case 36:
         case 38:
         case 39:
         case 41:
         case 42:
         case 44:
         case 45:
         default:
            break;
         case 11:
            HeroRaisePart heroRaisePart = (HeroRaisePart)this.player.getMgrPart(HeroRaisePart.class);
            heroRaisePart.buyMarquis(resourceModels);
            break;
         case 13:
            UnionRedPacketPart unionRedPacketPart = (UnionRedPacketPart)this.player.getMgrPart(UnionRedPacketPart.class);
            unionRedPacketPart.redPacketRecharge(shopLimitModel.getId(), resourceModels);
            break;
         case 17:
            if (buySuc) {
               giftPart.customizeGiftBuy(shopLimitModel, resourceModels);
            }
            break;
         case 19:
            if (buySuc) {
               SpringFestivalPart springFestivalPart1 = (SpringFestivalPart)this.player.getMgrPart(SpringFestivalPart.class);
               springFestivalPart1.buyGift(shopLimitModel);
            }
            break;
         case 21:
            SpringFestivalPart springFestivalPart = (SpringFestivalPart)this.player.getMgrPart(SpringFestivalPart.class);
            springFestivalPart.buySupperGift(resourceModels);
            break;
         case 23:
            if (buySuc) {
               DailyGiftPart dailyGiftPart = (DailyGiftPart)this.player.getMgrPart(DailyGiftPart.class);
               dailyGiftPart.oneKeyBuy(resourceModels);
            }
            break;
         case 26:
            if (buySuc) {
               ActivityPart activityPart = (ActivityPart)this.player.getMgrPart(ActivityPart.class);
               activityPart.buyLiYuGift(shopLimitModel, resourceModels);
            }
            break;
         case 35:
            if (buySuc) {
               AnniversaryCelebrationPart elebrationPart = (AnniversaryCelebrationPart)this.player.getMgrPart(AnniversaryCelebrationPart.class);
               elebrationPart.buyMarquis(resourceModels);
            }
            break;
         case 37:
            if (buySuc) {
               ActivityEventHeroPart activityEventHeroPart = (ActivityEventHeroPart)this.player.getMgrPart(ActivityEventHeroPart.class);
               activityEventHeroPart.customizeGiftBuy(shopLimitModel.getId(), resourceModels);
            }
            break;
         case 40:
            if (buySuc) {
               ActivityKrEventHeroPart activityKrEventHeroPart = (ActivityKrEventHeroPart)this.player.getMgrPart(ActivityKrEventHeroPart.class);
               activityKrEventHeroPart.customizeGiftBuy(shopLimitModel.getId(), resourceModels);
            }
            break;
         case 43:
            if (buySuc) {
               ActivityNewWeekPart newWeekPart = (ActivityNewWeekPart)this.player.getMgrPart(ActivityNewWeekPart.class);
               newWeekPart.buyMarquis(resourceModels);
            }
            break;
         case 46:
            if (buySuc) {
               LingLongBookPart lingLongBookPart = (LingLongBookPart)this.player.getMgrPart(LingLongBookPart.class);
               lingLongBookPart.buyMarquis(resourceModels);
            }
      }

      if (systemId > 0 && isReal) {
         SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", systemId);
         if (systemFunctionModel != null) {
            LogOperationMgr logOperationMgr = (LogOperationMgr)ApplicationContextProvider.getContext().getBean(LogOperationMgr.class);
            logOperationMgr.pushTask(() -> {
               RechargeModel rechargeModel = (RechargeModel)ApplicationContextProvider.getModelPoolEntity("rechargePrice", shopLimitModel.getPriceType());
               if (rechargeModel != null) {
                  logOperationMgr.addReceiveAwardNewLog(this.player, 15, systemFunctionModel.getId(), systemFunctionModel.getName(), rechargeModel.getId() + "", rechargeModel.getName(), rechargeModel.getMoney(), 1, 1);
               }

            });
         }
      }

   }

   public void afterBuyGift(int buyId) {
      ShopLimitModel shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", buyId);
      if (shopLimitModel != null) {
         GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
         switch (shopLimitModel.getGiftType()) {
            case 1:
               DailyGiftPart dailyGiftPart = (DailyGiftPart)this.player.getMgrPart(DailyGiftPart.class);
               dailyGiftPart.sendBuyResult(buyId);
               break;
            case 2:
               PrivilegeMallPart privilegeMallPart = (PrivilegeMallPart)this.player.getMgrPart(PrivilegeMallPart.class);
               privilegeMallPart.sendBuyResult(buyId);
               break;
            case 3:
               WeeklyPreferentialPart weeklyPreferentialPart = (WeeklyPreferentialPart)this.player.getMgrPart(WeeklyPreferentialPart.class);
               weeklyPreferentialPart.sendBuyResult(buyId);
               break;
            case 4:
               MonthlyPreferentialPart monthlyPreferentialPart = (MonthlyPreferentialPart)this.player.getMgrPart(MonthlyPreferentialPart.class);
               monthlyPreferentialPart.sendBuyResult(buyId);
               break;
            case 5:
               FlashSalePart flashSalePart = (FlashSalePart)this.player.getMgrPart(FlashSalePart.class);
               flashSalePart.sendBuyResult(buyId);
               break;
            case 6:
               WeekendKoiPart weekendKoiPart = (WeekendKoiPart)this.player.getMgrPart(WeekendKoiPart.class);
               weekendKoiPart.afterBuy(buyId);
            case 7:
            case 9:
            case 10:
            case 12:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 38:
            case 41:
            case 42:
            case 43:
            default:
               break;
            case 8:
               giftPart.afterBuyTimeLimitGift(buyId);
               break;
            case 11:
               HeroRaisePart heroRaisePart = (HeroRaisePart)this.player.getMgrPart(HeroRaisePart.class);
               heroRaisePart.sendInfo();
               break;
            case 13:
               UnionRedPacketPart unionRedPacketPart = (UnionRedPacketPart)this.player.getMgrPart(UnionRedPacketPart.class);
               unionRedPacketPart.giveRedPacket(shopLimitModel);
               break;
            case 14:
               ServerOpenLimitSalePart serverOpenLimitSalePart = (ServerOpenLimitSalePart)this.player.getMgrPart(ServerOpenLimitSalePart.class);
               serverOpenLimitSalePart.afterBuy(buyId);
               break;
            case 17:
               giftPart.customizeGiftBuyFinish(shopLimitModel);
               break;
            case 25:
               giftPart.weeklyCardBuy(shopLimitModel);
               break;
            case 36:
               AnniversaryCelebrationPart part = (AnniversaryCelebrationPart)this.player.getMgrPart(AnniversaryCelebrationPart.class);
               part.towerGiftBuyRecord(shopLimitModel.getId());
               break;
            case 37:
               giftPart.afterBuyTimeLimitGift(buyId);
               ActivityEventHeroPart activityEventHeroPart = (ActivityEventHeroPart)this.player.getMgrPart(ActivityEventHeroPart.class);
               activityEventHeroPart.afterOptionalGiftBuy(shopLimitModel.getId());
               break;
            case 39:
               PlayerRechargePart playerRechargePart = (PlayerRechargePart)this.player.getMgrPart(PlayerRechargePart.class);
               playerRechargePart.krFistBuyGift(shopLimitModel.getId(), shopLimitModel.getSytemFunctionId());
               break;
            case 40:
               giftPart.afterBuyTimeLimitGift(buyId);
               ActivityKrEventHeroPart activityKrEventHeroPart = (ActivityKrEventHeroPart)this.player.getMgrPart(ActivityKrEventHeroPart.class);
               activityKrEventHeroPart.afterOptionalGiftBuy(shopLimitModel.getId());
               break;
            case 44:
               giftPart.onLifeTimeCardGiftBuy();
         }

         giftPart.sendBuyResult(shopLimitModel);
         GiftMgr giftMgr = (GiftMgr)ApplicationContextProvider.getContext().getBean(GiftMgr.class);
         giftMgr.pushTask(() -> giftMgr.generalWelfareCounter(shopLimitModel.getId()));
      }
   }

   public void resetDaily() {
      MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
      Map<Integer, TreeMap<Integer, CentreAwardModel>> allAwardModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
      PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      DailyRechargePart dailyRechargePart = (DailyRechargePart)this.player.getMgrPart(DailyRechargePart.class);
      int curDailyRechargeRotateId = (Integer)playerActivityDao.activityRotateMap.getOrDefault(1, 0);
      if (curDailyRechargeRotateId > 0 && playerRechargeDao.dailyRecharge > 0) {
         List<ResourceModel> dailyRechargeAward = new ArrayList();

         for(RechargeAwardModel rechargeAwardModel : dailyRechargePart.getRechargeAwards(curDailyRechargeRotateId)) {
            if (!playerActivityDao.dailyRechargeReward.contains(rechargeAwardModel.getId()) && rechargeAwardModel.getMoney() <= playerRechargeDao.dailyRecharge) {
               for(ResourceModel resourceModel : rechargeAwardModel.getItems()) {
                  resourceModel.clone().addResourceToList(dailyRechargeAward);
               }
            }
         }

         if (!dailyRechargeAward.isEmpty()) {
            TreeMap<Integer, CentreAwardModel> dailyRechargeRewardMap = (TreeMap)allAwardModelMap.get(CentreAwardModel.TYPE_DAILY_RECHARGE);
            if (dailyRechargeRewardMap != null && !dailyRechargeRewardMap.isEmpty()) {
               CentreAwardModel centreAwardModel = (CentreAwardModel)dailyRechargeRewardMap.firstEntry().getValue();
               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), dailyRechargeAward, 604800000L, 8, 823);
            }
         }
      }

      if (!playerActivityDao.dailyRechargeReward.isEmpty()) {
         playerActivityDao.dailyRechargeReward.clear();
      }

      RotaingPackagesModel rotaingPackagesModel = giftPart.getRotatePackage(1);
      if (rotaingPackagesModel != null && curDailyRechargeRotateId != rotaingPackagesModel.getActivityId()) {
         playerActivityDao.activityRotateMap.put(1, rotaingPackagesModel.getActivityId());
      }

      playerActivityDao.updateOp();
      dailyRechargePart.sendInfo();
      if (playerRechargeDao.dailyRecharge > 0) {
         Map<Integer, DailyTopUpModel> dailyTopUpModelMap = ApplicationContextProvider.<Integer, DailyTopUpModel>getModelPoolMap("dailyTopUp");
         if (dailyTopUpModelMap != null && !dailyTopUpModelMap.isEmpty()) {
            List<ResourceModel> resourceModels = new ArrayList();

            for(DailyTopUpModel dailyTopUpModel : dailyTopUpModelMap.values()) {
               if (!playerRechargeDao.isGotDailyFirstRechargeReward(dailyTopUpModel.getDailyTopUpType()) && playerRechargeDao.dailyRecharge >= dailyTopUpModel.getNeedTopUp()) {
                  for(ResourceModel reward : dailyTopUpModel.getRewards()) {
                     reward.addResourceToList(resourceModels);
                  }
               }
            }

            if (!resourceModels.isEmpty()) {
               TreeMap<Integer, CentreAwardModel> dailyFirstRechargeRewardMap = (TreeMap)allAwardModelMap.get(CentreAwardModel.DAILY_FIRST_RECHARGE);
               if (dailyFirstRechargeRewardMap != null && !dailyFirstRechargeRewardMap.isEmpty()) {
                  CentreAwardModel centreAwardModel = (CentreAwardModel)dailyFirstRechargeRewardMap.firstEntry().getValue();
                  mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), resourceModels, 604800000L, 17, 1703);
               }
            }
         }

         playerRechargeDao.dailyRecharge = 0;
         playerRechargeDao.dailyFirstRechargeReward = 0;
      }

      if (!playerRechargeDao.valueRechargeReward.isEmpty()) {
         CentreAwardModel centreAwardModel = CentreAwardModel.getByType(CentreAwardModel.TYPE_VALUE_RECHARGE);
         if (centreAwardModel != null) {
            Map<Integer, Map<Integer, ValueRechargeModel>> allModel = ApplicationContextProvider.<Integer, Map<Integer, ValueRechargeModel>>getModelPoolMap("customValueRecharge");

            for(Map.Entry<Integer, Long> entry : playerRechargeDao.valueRechargeReward.entrySet()) {
               int quantity = (Integer)entry.getKey();
               long rewardValue = (Long)entry.getValue();
               Map<Integer, ValueRechargeModel> valueRechargeModelMap = (Map)allModel.get(quantity);
               int lastDay = MiscUtil.getHiParam(rewardValue);
               if (lastDay < valueRechargeModelMap.size()) {
                  int activeTime = MiscUtil.getLowParam(rewardValue);
                  int diffDay = DateUtil.difftimeDay(new Timestamp(DateUtil.getSomeDayBeginTime((long)activeTime * 1000L))) + 1;

                  for(int day = lastDay + 1; day < diffDay; ++day) {
                     if (valueRechargeModelMap.containsKey(day)) {
                        ValueRechargeModel valueRechargeModel = (ValueRechargeModel)valueRechargeModelMap.get(day);
                        List<ResourceModel> awardList = this.getRechargeReward(valueRechargeModel);
                        mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, MessageFormat.format(centreAwardModel.getTitle(), valueRechargeModel.getRechargeQuantity()), MessageFormat.format(centreAwardModel.getDesc(), day), awardList, 604800000L, 17, 1704);
                        entry.setValue(MiscUtil.comboInteger(day, activeTime));
                     }
                  }
               }
            }
         }
      }

      playerRechargeDao.updateOp();
      this.player.notifyPlayerData(PlayerDefine.PLAYER_RECHARGE_DAILY_TOTAL, playerRechargeDao.dailyRecharge);
      this.sendDailyFirstRechargeInfo();
      this.sendValueRechargeInfo();
      Map<Integer, List<KrJueBanRechargeModel>> krMap = this.player.getGameModelPool().getMap("customKrJueBanRecharge");
      if (!CollectionUtils.isEmpty(krMap)) {
         for(Integer systemId : krMap.keySet()) {
            this.krSendRechargeReward(systemId, 0);
         }

         this.krSendRechargeBuilder(0);
      }

   }

   public void resetMonth() {
      PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
      if (playerRechargeDao.monthlyRecharge > 0) {
         playerRechargeDao.monthlyRecharge = 0;
         playerRechargeDao.updateOp();
      }

   }

   public int getRealTotalRecharge() {
      PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
      return playerRechargeDao.totalRecharge;
   }

   public void rechargeFail(int rechargeId, String billNo, int money, String extra, RechargeReasonEnum reason) {
      this.logger.error("订单:{},{},匹配到的充值项:{}", new Object[]{billNo, reason.getDesc(), rechargeId});
      PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
      RechargeFailLog rechargeFailLog = new RechargeFailLog();
      rechargeFailLog.playerId = playerDao.playerId;
      rechargeFailLog.serverId = playerDao.serverId;
      rechargeFailLog.playerName = playerDao.playerName;
      rechargeFailLog.reason = reason.getDesc();
      rechargeFailLog.money = (double)money;
      rechargeFailLog.billNo = billNo;
      rechargeFailLog.extra = extra;
      rechargeFailLog.insertOp();
   }

   private void sendDailyFirstRechargeInfo() {
      RechargeMsg.S2C_DailyFirstRecharge_7707.Builder resp = RechargeMsg.S2C_DailyFirstRecharge_7707.newBuilder();
      PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
      resp.addAllGotIds(playerRechargeDao.getGotDailyFirstRechargeReward());
      this.player.sendMsg(resp.build());
   }

   private void sendDailyFirstRechargeReward(int code, int id, String message, Object... args) {
      if (code != 1) {
      }

      RechargeMsg.S2C_DailyFirstRechargeReward_7709.Builder msg = RechargeMsg.S2C_DailyFirstRechargeReward_7709.newBuilder();
      msg.setId(id);
      msg.setResult(code);
      this.player.sendMsg(msg.build());
   }

   public void gmSetValueRechargeDay(int quality, int day) {
      PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
      if (!playerRechargeDao.valueRechargeReward.containsKey(quality)) {
         this.player.failure(35);
      } else {
         long value = (Long)playerRechargeDao.valueRechargeReward.get(quality);
         int activeTime = DateUtil.getIntTime(System.currentTimeMillis() - 86400000L * (long)day);
         value = MiscUtil.comboInteger(MiscUtil.getHiParam(value), activeTime);
         playerRechargeDao.valueRechargeReward.put(quality, value);
         playerRechargeDao.updateOp();
         this.sendValueRechargeInfo();
      }
   }

   private void sendValueRechargeInfo() {
      RechargeMsg.S2C_ValueRechargeRewardInfo_7711.Builder resp = RechargeMsg.S2C_ValueRechargeRewardInfo_7711.newBuilder();
      PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
      playerRechargeDao.valueRechargeReward.forEach((key, value) -> resp.addInfos(this.buildValueRechargeInfo(key, value)));
      this.player.sendMsg(resp.build());
   }

   public void krFistBuyGift(int giftId, int systemId) {
      Map<Integer, List<KrJueBanRechargeModel>> map = this.player.getGameModelPool().getMap("customKrJueBanRecharge");
      PlayerRechargeDao dao = this.getDao();
      if (dao.krValueRechargeReward.containsKey(giftId)) {
         this.logger.error("绝版特惠礼包购买有误！已经购买过ID:【{}】的礼包！", giftId);
      } else {
         Map<Integer, Set<Integer>> frontMap = new HashMap();

         for(List<KrJueBanRechargeModel> models : map.values()) {
            int corrSystemId = 0;
            Set<Integer> frontSet = new HashSet();

            for(KrJueBanRechargeModel model : models) {
               frontSet.add(model.getGiftId());
               corrSystemId = Math.max(corrSystemId, model.getActivation());
            }

            List<KrJueBanRechargeModel> list = (List)map.get(corrSystemId);
            if (!CollectionUtils.isEmpty(list)) {
               frontMap.put(((KrJueBanRechargeModel)list.get(0)).getGiftId(), frontSet);
            }
         }

         Set<Integer> frontSet = (Set)frontMap.get(giftId);

         while(frontSet != null) {
            Set<Integer> hasSet = dao.krValueRechargeReward.keySet();
            if (!hasSet.containsAll(frontSet)) {
               this.logger.error("绝版特惠礼包购买前置条件不满足！购买ID:【{}】，已拥有的礼包:【{}】，要求的前置礼包:【{}】", new Object[]{giftId, DataUtils.intSetToString(hasSet), DataUtils.intSetToString(frontSet)});
               return;
            }

            for(Integer giftId2 : frontSet) {
               frontSet = (Set)frontMap.get(giftId2);
               if (!CollectionUtils.isEmpty(frontMap)) {
                  break;
               }
            }
         }

         List<Integer> list = (List)dao.krValueRechargeReward.computeIfAbsent(giftId, ArrayList::new);
         list.add(DateUtil.getIntTime(System.currentTimeMillis()));
         dao.updateOp();
         this.krSendRechargeReward(systemId, giftId);
         this.krSendRechargeBuilder(giftId);
      }
   }

   public void krSendRechargeReward(int systemId, int giftId) {
      Map<Integer, List<KrJueBanRechargeModel>> krMap = this.player.getGameModelPool().getMap("customKrJueBanRecharge");
      List<KrJueBanRechargeModel> allRewards = (List)krMap.get(systemId);
      if (!CollectionUtils.isEmpty(allRewards)) {
         if (allRewards.size() == 1) {
            if (giftId > 0) {
               this.player.addResource(((KrJueBanRechargeModel)allRewards.get(0)).getLoginItems(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 17, 1702, systemId, giftId, "FirstRecharge");
            }
         } else {
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            PlayerRechargeDao dao = this.getDao();
            HashSet<Integer> set = new HashSet();
            if (giftId > 0) {
               set.add(giftId);
            } else {
               for(KrJueBanRechargeModel reward : allRewards) {
                  set.add(reward.getGiftId());
               }
            }

            for(Integer giftId2 : set) {
               List<Integer> infos = (List)dao.krValueRechargeReward.get(giftId2);
               if (!CollectionUtils.isEmpty(infos)) {
                  CentreAwardModel centreAwardModel = (CentreAwardModel)this.player.getGameModelPool().getEntity("centreAward", CentreAwardModel.ID_KR_JUE_BAN_GIFT_REWARD);
                  int intervalDay = TempUtil.getIntervalDay((Integer)infos.get(0));

                  for(KrJueBanRechargeModel m : allRewards) {
                     int day = m.getDay();
                     if (m.getGiftId() == giftId2 && !infos.contains(day) && intervalDay >= day) {
                        ShopLimitModel shop = (ShopLimitModel)this.player.getGameModelPool().getEntity("shopLimit", m.getGiftId());
                        RechargeModel rechargeModel = (RechargeModel)this.player.getGameModelPool().getEntity("rechargePrice", shop.getPriceType());
                        mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, MessageFormat.format(centreAwardModel.getTitle(), rechargeModel.getMoney()), MessageFormat.format(centreAwardModel.getDesc(), day), m.getLoginItems(), 604800000L, 17, 14102);
                        infos.add(m.getDay());
                        dao.updateOp();
                     }
                  }
               }
            }
         }

      }
   }

   public void loginHandle() {
      this.krSendRechargeBuilder(0);
   }

   public void levelUp(int preLv, int newLv) {
      this.krSendRechargeBuilder(0);
   }

   public void krSendRechargeBuilder(int giftId) {
      Map<Integer, List<KrJueBanRechargeModel>> krMap = this.player.getGameModelPool().getMap("customKrJueBanRecharge");
      if (!CollectionUtils.isEmpty(krMap)) {
         for(Integer systemId : krMap.keySet()) {
            if (!this.player.isSystemOpen(systemId)) {
               return;
            }
         }

         PlayerRechargeDao dao = this.getDao();
         RechargeMsg.S2C_KrJueBanRecharge_7719.Builder builder = RechargeMsg.S2C_KrJueBanRecharge_7719.newBuilder();

         for(Map.Entry<Integer, List<Integer>> entry : dao.krValueRechargeReward.entrySet()) {
            RechargeMsg.KrValueRechargeInfo.Builder info = RechargeMsg.KrValueRechargeInfo.newBuilder();
            info.setGiftId((Integer)entry.getKey());

            for(int i = 1; i < ((List)entry.getValue()).size(); ++i) {
               info.addDay((Integer)((List)entry.getValue()).get(i));
            }

            builder.addInfos(info);
         }

         if (giftId > 0) {
            builder.setGiftId(giftId);
         }

         this.player.sendMsg(builder.build());
      }
   }

   public PlayerRechargeDao getDao() {
      return (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
   }

   public void gmOp(String order) {
      PlayerRechargeDao dao = this.getDao();
      String[] split = order.split(",");
      switch (split[0]) {
         case "clean":
            dao.krValueRechargeReward.clear();
            dao.updateOp();
            GiftCustomCache giftCustomCache = (GiftCustomCache)this.player.getCustomCache("tb_gift", this.player.getPlayerId());
            Map<Integer, GiftDao> buyGifts = giftCustomCache.getBuyGifts(39);

            for(GiftDao giftDao : buyGifts.values()) {
               giftDao.count = 0;
               giftDao.updateOp();
            }

            this.krSendRechargeBuilder(0);
            break;
         case "t2":
            int giftId = Integer.parseInt(split[1]);
            ShopLimitModel shop = (ShopLimitModel)this.player.getGameModelPool().getEntity("shopLimit", giftId);
            RechargeModel rechargeModel = (RechargeModel)this.player.getGameModelPool().getEntity("rechargePrice", shop.getPriceType());
            System.out.println("礼包价格 " + rechargeModel.getMoneyKr());
            break;
         default:
            this.player.failure(6);
      }

   }

   public void checkCoinTotalRecharge(int coinNum) {
      Map<String, Map<Integer, CoinAddRechargeModel>> modelMap = ApplicationContextProvider.<String, Map<Integer, CoinAddRechargeModel>>getModelPoolMap("customSanGuoBiAddUpRecharge");
      if (modelMap != null && modelMap.containsKey(this.worldMgr.PLATFORM_NAME) && this.player.isSystemOpen(6860)) {
         CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", CentreAwardModel.ID_COIN_ADD_RECHARGE);
         if (centreAwardModel == null) {
            this.logger.error("无法找到三国币累充奖励邮件,id={}", CentreAwardModel.ID_COIN_ADD_RECHARGE);
         } else {
            PlayerRechargeDao playerRechargeDao = this.getDao();
            playerRechargeDao.coinTotalRecharge += coinNum;
            playerRechargeDao.updateOp();
            this.player.notifyPlayerData(PlayerDefine.COIN_TOTAL_RECHARGE, playerRechargeDao.coinTotalRecharge);
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);

            for(CoinAddRechargeModel coinAddRechargeModel : (modelMap.get(this.worldMgr.PLATFORM_NAME)).values()) {
               if (coinAddRechargeModel.getRechargeNum() > playerRechargeDao.coinTotalRecharge) {
                  break;
               }

               if (!playerRechargeDao.coinTotalRewards.contains(coinAddRechargeModel.getId())) {
                  playerRechargeDao.coinTotalRewards.add(coinAddRechargeModel.getId());
                  playerRechargeDao.updateOp();
                  mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), MessageFormat.format(centreAwardModel.getDesc(), coinAddRechargeModel.getRechargeNum()), coinAddRechargeModel.getItems(), 604800000L, 17, 1709);
               }
            }

         }
      }
   }
}
