package com.gzbz.privilege;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.RechargeModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.privilege.bean.PlayerPrivilegeExtend;
import com.gzbz.protobuf.PrivilegeMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.List;
import java.util.Map;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class SingleRechargePart extends PlayerPart {
   @MsgHandlerAnno
   public void C2S_SingleRechargeInfo_7901(PrivilegeMsg.C2S_SingleRechargeInfo_7901 msg, String source) {
      this.sendInfo();
   }

   public void singleRecharge(List<ResourceModel> resourceModels, RechargeModel rechargeModel) {
      PlayerPrivilegeExtend playerPrivilegeExtend = (PlayerPrivilegeExtend)this.player.getPlayerExtend(19);
      if (!playerPrivilegeExtend.firstRechargeIds.contains(rechargeModel.getId())) {
         if (rechargeModel.getExtraIngots() > 0) {
            if (rechargeModel.getType() == 1) {
               resourceModels.add(new ResourceModel(1, PlayerDefine.PLAYER_GOLD, rechargeModel.getExtraIngots()));
            } else if (rechargeModel.getType() == 89) {
               int realCoinId = ApplicationContextProvider.getConfigInt("SpecialMoneyId", 88888888);
               resourceModels.add(new ResourceModel(2, realCoinId, rechargeModel.getExtraIngots()));
            }
         }

         Map<String, RechargeModel> rechargeModelMap = ApplicationContextProvider.<String, RechargeModel>getModelPoolMap("custom_recharge");

         for(Map.Entry<String, RechargeModel> entry : rechargeModelMap.entrySet()) {
            if (((String)entry.getKey()).endsWith("-" + rechargeModel.getType() + "-" + rechargeModel.getMoney())) {
               playerPrivilegeExtend.firstRechargeIds.add(((RechargeModel)entry.getValue()).getId());
            }
         }

         this.player.updatePlayerExtend(19);
         this.sendInfo();
      }
   }

   private void sendInfo() {
      PlayerPrivilegeExtend playerPrivilegeExtend = (PlayerPrivilegeExtend)this.player.getPlayerExtend(19);
      PrivilegeMsg.S2C_SingleRechargeResult_7902.Builder resp = PrivilegeMsg.S2C_SingleRechargeResult_7902.newBuilder();
      resp.addAllFirstRechargeIds(playerPrivilegeExtend.firstRechargeIds);
      this.player.sendMsg(resp.build());
   }
}
