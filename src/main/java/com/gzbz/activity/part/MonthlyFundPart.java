package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.bean.MonthlyFundData;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.LanguageModel;
import com.gzbz.model.MonthlyFundRewardModel;
import com.gzbz.model.RechargeModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.DateUtil;
import misc.MapUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class MonthlyFundPart extends AbstractActivityPart {
   public void recharge(RechargeModel rechargeModel) {
      PlayerRechargeDao rechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
      MonthlyFundData monthlyFundData = (MonthlyFundData)MapUtil.computeIfAbsent(rechargeDao.monthlyFund, rechargeModel.getType(), MonthlyFundData.class);
      monthlyFundData.close();
      monthlyFundData.buy = DateUtil.getIntTime(System.currentTimeMillis());
      rechargeDao.updateOp();
      this.sendInfo();
      SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 2200);
      if (systemFunctionModel != null) {
         this.player.getOperationMgr().addActivityLog(this.player, systemFunctionModel.getId(), systemFunctionModel.getName());
         this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 15, systemFunctionModel.getId(), systemFunctionModel.getName(), rechargeModel.getId() + "", rechargeModel.getName(), rechargeModel.getMoney(), 1, 1);
      }

   }

   @MsgHandlerAnno
   public void C2S_MonthlyFund_6705(ActivityMsg.C2S_MonthlyFund_6705 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_MonthlyFundBuy_6745(ActivityMsg.C2S_MonthlyFundBuy_6745 msg, String source) {
      int rechargeId = msg.getRechargeId();
      RechargeModel rechargeModel = (RechargeModel)ApplicationContextProvider.getModelPoolEntity("rechargePrice", rechargeId);
      if (rechargeModel == null) {
         this.player.failure(0);
      } else {
         PlayerRechargeDao rechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
         if (rechargeDao.monthlyFund.containsKey(rechargeModel.getType())) {
            this.player.failure(25);
         } else {
            this.sendBuyResult(rechargeId);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_MonthlyFundReward_6707(ActivityMsg.C2S_MonthlyFundReward_6707 msg, String source) {
      int monthlyFundType = msg.getMonthlyFundType();
      int day = msg.getDay();
      PlayerRechargeDao rechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
      MonthlyFundData monthlyFundData = (MonthlyFundData)rechargeDao.monthlyFund.get(monthlyFundType);
      if (monthlyFundData != null && monthlyFundData.buy > 0) {
         if (day > monthlyFundData.reward && day <= this.getConfigManager().getInt("FundDays")) {
            Map<Integer, Map<Integer, MonthlyFundRewardModel>> monthlyFundRewardModelMap = ApplicationContextProvider.<Integer, Map<Integer, MonthlyFundRewardModel>>getModelPoolMap("customMonthlyFundReward");
            Map<Integer, MonthlyFundRewardModel> modelMap = (Map)monthlyFundRewardModelMap.get(monthlyFundType);
            if (modelMap == null) {
               this.player.failure(0);
            } else {
               MonthlyFundRewardModel monthlyFundRewardModel = (MonthlyFundRewardModel)modelMap.get(day);
               if (monthlyFundRewardModel == null) {
                  this.player.failure(0);
               } else {
                  int difDay = DateUtil.difftimeDay(new Timestamp((long)monthlyFundData.buy * 1000L));
                  if (day > difDay + 1) {
                     this.player.failure(6);
                  } else {
                     ++monthlyFundData.reward;
                     this.player.addResource(monthlyFundRewardModel.getItemType(), monthlyFundRewardModel.getItemId(), monthlyFundRewardModel.getNum(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 802, monthlyFundRewardModel.getItemId(), monthlyFundRewardModel.getNum(), "");
                     this.sendMonthlyFunRewardResult(monthlyFundType, day);
                     if (monthlyFundData.reward >= this.getConfigManager().getInt("FundDays")) {
                        PlayerDao playerDao = this.player.getPlayerDao();
                        ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
                        if (activityInfo != null && activityInfo.end > DateUtil.getIntTime(System.currentTimeMillis())) {
                           rechargeDao.monthlyFund.remove(monthlyFundType);
                           this.logger.info("玩家:{},月基金已全部领完,活动开启中,{}档位月基金移除", playerDao.playerName, monthlyFundType);
                        } else {
                           int endDurationTime = ApplicationContextProvider.getConfigInt("fundRemainingTime", 7200);
                           monthlyFundData.end = DateUtil.getIntTime((long)endDurationTime * 1000L + System.currentTimeMillis());
                           this.logger.info("玩家:{},月基金已全部领完,{}档位月基金进入倒计时{}", new Object[]{playerDao.playerName, monthlyFundType, DateUtil.transferLongToDate((long)monthlyFundData.end * 1000L)});
                        }

                        this.sendInfo();
                     }

                     rechargeDao.updateOp();
                  }
               }
            }
         } else {
            this.player.failure(24);
         }
      } else {
         this.player.failure(0);
      }
   }

   public void resetDaily() {
      boolean updateFlag = false;
      PlayerRechargeDao rechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
      MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
      LanguageModel languageTitleModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "MonthlyFundrTitle");
      LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "MonthlyFundr");
      Set<Integer> monthlyFundTypeSet = new HashSet(rechargeDao.monthlyFund.keySet());
      int maxDay = this.getConfigManager().getInt("FundDays");
      ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
      int curTime = DateUtil.getIntTime(System.currentTimeMillis());

      for(Integer monthlyFundType : monthlyFundTypeSet) {
         MonthlyFundData fundData = (MonthlyFundData)rechargeDao.monthlyFund.get(monthlyFundType);
         if (fundData != null) {
            String title = languageTitleModel.getValue();
            switch (monthlyFundType) {
               case 6:
                  title = MessageFormat.format(title, 128);
                  break;
               case 7:
                  title = MessageFormat.format(title, 328);
                  break;
               case 8:
                  title = MessageFormat.format(title, 648);
            }

            if (fundData.reward < maxDay) {
               Map<Integer, Map<Integer, MonthlyFundRewardModel>> monthlyFundRewardModelMap = ApplicationContextProvider.<Integer, Map<Integer, MonthlyFundRewardModel>>getModelPoolMap("customMonthlyFundReward");
               int difDay = Math.min(maxDay, DateUtil.difftimeDay(new Timestamp((long)fundData.buy * 1000L)));
               if (difDay > 0) {
                  for(int day = fundData.reward + 1; day <= difDay; fundData.reward = day++) {
                     updateFlag = true;
                     long mailStartTime = DateUtil.getSomeDayBeginTime((long)curTime * 1000L) - (long)(difDay - day) * 86400000L;
                     MonthlyFundRewardModel monthlyFundRewardModel = (MonthlyFundRewardModel)((Map)monthlyFundRewardModelMap.get(monthlyFundType)).get(day);
                     List<ResourceModel> itemDataList = new ArrayList();
                     itemDataList.add(new ResourceModel(monthlyFundRewardModel.getItemType(), monthlyFundRewardModel.getItemId(), monthlyFundRewardModel.getNum()));
                     mailPart.addMailOfEndTime(MailDefine.MailType.MAIL_TYPE_COMMON, title, languageModel.getValue().replaceAll("x", day + ""), itemDataList, (long)curTime * 1000L + 604800000L, 8, 802, mailStartTime, 0);
                  }

                  if (fundData.reward >= maxDay) {
                     if (activityInfo != null && activityInfo.end > curTime) {
                        rechargeDao.monthlyFund.remove(monthlyFundType);
                     } else {
                        fundData.end = curTime;
                     }

                     updateFlag = true;
                  }
               }
            }
         }
      }

      if (updateFlag) {
         rechargeDao.updateOp();
      }

      this.sendInfo();
   }

   private void sendMonthlyFunRewardResult(int monthlyFundType, int day) {
      SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 2200);
      if (systemFunctionModel != null) {
         int maxDay = this.getConfigManager().getInt("FundDays");
         int money;
         switch (monthlyFundType) {
            case 6:
               money = 128;
               break;
            case 7:
               money = 328;
               break;
            case 8:
               money = 648;
               break;
            default:
               money = 0;
         }

         this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 14, systemFunctionModel.getId(), systemFunctionModel.getName(), money + "", String.valueOf(money), 0, day, maxDay);
      }

      ActivityMsg.S2C_MonthlyFundRewardResult_6708.Builder msg = ActivityMsg.S2C_MonthlyFundRewardResult_6708.newBuilder();
      msg.setMonthlyFundType(monthlyFundType);
      msg.setResult(1);
      msg.setDay(day);
      this.player.sendMsg(msg.build());
   }

   public void gmSetDay(int type, int day) {
      PlayerRechargeDao rechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
      MonthlyFundData monthlyFundData = (MonthlyFundData)rechargeDao.monthlyFund.get(type);
      if (monthlyFundData == null) {
         this.player.failure(0);
      } else {
         monthlyFundData.reward = 0;
         monthlyFundData.buy = DateUtil.getIntTime(System.currentTimeMillis() - (long)day * 86400000L);
         rechargeDao.updateOp();
         this.sendInfo();
      }
   }

   public void gmResetEnd(int type) {
      PlayerRechargeDao rechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
      MonthlyFundData monthlyFundData = (MonthlyFundData)rechargeDao.monthlyFund.get(type);
      if (monthlyFundData == null) {
         this.player.failure(0);
      } else if (monthlyFundData.reward != 30) {
         this.player.failure(0);
      } else {
         int endDurationTime = ApplicationContextProvider.getConfigInt("fundRemainingTime", 7200);
         monthlyFundData.end = DateUtil.getIntTime((long)endDurationTime * 1000L + System.currentTimeMillis());
         rechargeDao.updateOp();
         this.sendInfo();
      }
   }

   public void sendInfo() {
      int maxDay = this.getConfigManager().getInt("FundDays");
      PlayerRechargeDao rechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
      ActivityMsg.S2C_MonthlyFund_6706.Builder msg = ActivityMsg.S2C_MonthlyFund_6706.newBuilder();

      for(Map.Entry<Integer, MonthlyFundData> entry : rechargeDao.monthlyFund.entrySet()) {
         ActivityMsg.MonthlyFund.Builder monthlyFund = ActivityMsg.MonthlyFund.newBuilder();
         monthlyFund.setMonthlyFundType((Integer)entry.getKey());
         monthlyFund.setRewardDays(((MonthlyFundData)entry.getValue()).reward);
         monthlyFund.setBuyTime(((MonthlyFundData)entry.getValue()).buy);
         monthlyFund.setEndTime(((MonthlyFundData)entry.getValue()).end);
         int difDay = DateUtil.difftimeDay(new Timestamp((long)((MonthlyFundData)entry.getValue()).buy * 1000L));
         monthlyFund.setIsRewardToday(((MonthlyFundData)entry.getValue()).reward >= maxDay || difDay < ((MonthlyFundData)entry.getValue()).reward);
         msg.addMonthlyFund(monthlyFund);
      }

      ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
      msg.setEndTime(activityInfo == null ? DateUtil.getIntTime(DateUtil.getSomeDayBeginTime(System.currentTimeMillis())) - 1 : activityInfo.end);
      this.player.sendMsg(msg.build());
   }

   public int getActivityType() {
      return 5;
   }

   private void sendBuyResult(int rechargeId) {
      ActivityMsg.S2C_MonthlyFundBuyResult_6746.Builder msg = ActivityMsg.S2C_MonthlyFundBuyResult_6746.newBuilder();
      msg.setRechargeId(rechargeId);
      this.player.sendMsg(msg.build());
   }
}
