package com.gzbz.benefit;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.benefit.bean.PlayerBenefitExtend;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.FundModel;
import com.gzbz.model.RechargeModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.protobuf.BenefitMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class GrowFundPart extends PlayerPart {
   @MsgHandlerAnno
   public void C2S_GrowFundInfo_8117(BenefitMsg.C2S_GrowFundInfo_8117 msg, String source) {
      PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
      PlayerBenefitExtend playerBenefitExtend = (PlayerBenefitExtend)this.player.getPlayerExtend(20);
      BenefitMsg.S2C_GrowFundResult_8118.Builder resp = BenefitMsg.S2C_GrowFundResult_8118.newBuilder();
      Map<Integer, List<FundModel>> tempHashMap = ApplicationContextProvider.<Integer, List<FundModel>>getModelPoolMap("customFund");
      Set<Integer> gotSet = playerBenefitExtend.growFundRewards();

      for(Map.Entry<Integer, List<FundModel>> entry : tempHashMap.entrySet()) {
         int fundType = (Integer)entry.getKey();
         List<FundModel> list = (List)entry.getValue();
         boolean isBuy;
         if (fundType == 1) {
            isBuy = playerRechargeDao.hasGrowFund;
         } else if (fundType == 2) {
            isBuy = playerRechargeDao.hasGrowFund328;
         } else {
            if (fundType != 3) {
               break;
            }

            isBuy = playerRechargeDao.hasGrowFund648;
         }

         BenefitMsg.GrowFundData.Builder builder = BenefitMsg.GrowFundData.newBuilder();
         builder.setIsBuy(isBuy);
         builder.setType(fundType);
         list.forEach((fundModel) -> {
            if (gotSet.contains(fundModel.getId())) {
               builder.addGotIds(fundModel.getId());
            }

         });
         resp.addData(builder);
      }

      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_GrowFundReward_8119(BenefitMsg.C2S_GrowFundReward_8119 msg, String source) {
      int id = msg.getId();
      Map<Integer, FundModel> fundModelMap = ApplicationContextProvider.<Integer, FundModel>getModelPoolMap("fund");
      FundModel fundModel = (FundModel)fundModelMap.get(id);
      if (fundModel == null) {
         this.sendGrowFundRewardResult(0, id);
      } else {
         PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
         if (fundModel.getFundType() == 1) {
            if (!playerRechargeDao.hasGrowFund) {
               this.sendGrowFundRewardResult(20004, id);
               return;
            }
         } else if (fundModel.getFundType() == 2) {
            if (!playerRechargeDao.hasGrowFund328) {
               this.sendGrowFundRewardResult(20004, id);
               return;
            }
         } else {
            if (fundModel.getFundType() != 3) {
               this.sendGrowFundRewardResult(0, id);
               return;
            }

            if (!playerRechargeDao.hasGrowFund648) {
               this.sendGrowFundRewardResult(20004, id);
               return;
            }
         }

         PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
         if (playerDao.lv < fundModel.getLevel()) {
            this.sendGrowFundRewardResult(20, id);
         } else {
            PlayerBenefitExtend playerBenefitExtend = (PlayerBenefitExtend)this.player.getPlayerExtend(20);
            if (playerBenefitExtend.isGotGrowFundReward(id)) {
               this.sendGrowFundRewardResult(24, id);
            } else {
               playerBenefitExtend.addGrowFundReward(id);
               this.player.updatePlayerExtend(20);
               this.player.addResource(fundModel.getItems(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 20, 2006, 0, 0, "");
               this.sendGrowFundRewardResult(1, id);
               LogOperationMgr logOperationMgr = (LogOperationMgr)ApplicationContextProvider.getContext().getBean(LogOperationMgr.class);
               logOperationMgr.pushTask(() -> {
                  SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 1300);
                  if (systemFunctionModel != null) {
                     logOperationMgr.addActivityLog(this.player, systemFunctionModel.getId(), systemFunctionModel.getName());
                     logOperationMgr.addReceiveAwardNewLog(this.player, 14, systemFunctionModel.getId(), systemFunctionModel.getName(), fundModel.getLevel() + "", String.valueOf(fundModel.getLevel()), 0, id, fundModelMap.size());
                  }

               });
            }
         }
      }
   }

   public void buy(int rechargeId) {
      RechargeModel rechargeModel = (RechargeModel)ApplicationContextProvider.getModelPoolEntity("rechargePrice", rechargeId);
      PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
      int type = 1;
      if (rechargeModel.getType() == 4) {
         if (!playerRechargeDao.hasGrowFund) {
            playerRechargeDao.hasGrowFund = true;
            playerRechargeDao.updateOp();
            this.player.updatePlayerExtend(20);
         }
      } else if (rechargeModel.getType() == 10) {
         if (!playerRechargeDao.hasGrowFund328) {
            playerRechargeDao.hasGrowFund328 = true;
            playerRechargeDao.updateOp();
            this.player.updatePlayerExtend(20);
         }

         type = 2;
      } else {
         if (rechargeModel.getType() != 11) {
            return;
         }

         if (!playerRechargeDao.hasGrowFund648) {
            playerRechargeDao.hasGrowFund648 = true;
            playerRechargeDao.updateOp();
            this.player.updatePlayerExtend(20);
         }

         type = 3;
      }

      BenefitMsg.S2C_GrowFundBuyNotify_8121.Builder msg = BenefitMsg.S2C_GrowFundBuyNotify_8121.newBuilder();
      msg.setIsBuy(playerRechargeDao.hasGrowFund);
      msg.setType(type);
      this.player.sendMsg(msg.build());
      LogOperationMgr logOperationMgr = (LogOperationMgr)ApplicationContextProvider.getContext().getBean(LogOperationMgr.class);
      logOperationMgr.pushTask(() -> {
         SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 1300);
         if (systemFunctionModel != null) {
            logOperationMgr.addActivityLog(this.player, systemFunctionModel.getId(), systemFunctionModel.getName());
            logOperationMgr.addReceiveAwardNewLog(this.player, 15, systemFunctionModel.getId(), systemFunctionModel.getName(), rechargeModel.getId() + "", rechargeModel.getName(), rechargeModel.getMoney(), 1, 1);
         }

      });
   }

   private void sendGrowFundRewardResult(int code, int id) {
      BenefitMsg.S2C_GrowFundRewardResult_8120.Builder msg = BenefitMsg.S2C_GrowFundRewardResult_8120.newBuilder();
      msg.setId(id);
      msg.setResult(code);
      this.player.sendMsg(msg.build());
   }
}
