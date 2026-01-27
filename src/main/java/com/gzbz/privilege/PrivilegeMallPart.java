package com.gzbz.privilege;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerDao;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.gift.GiftPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.protobuf.PrivilegeMsg;
import com.gzbz.spring.ApplicationContextProvider;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class PrivilegeMallPart extends PlayerPart {
   @MsgHandlerAnno
   public void C2S_PrivilegeMallInfo_7911(PrivilegeMsg.C2S_PrivilegeMallInfo_7911 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_PrivilegeMallBuy_7913(PrivilegeMsg.C2S_PrivilegeMallBuy_7913 msg, String source) {
      int buyId = msg.getBuyId();
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      int result = giftPart.checkAndBuy(buyId, 0, 19, 1904);
      if (result != 1) {
         this.player.failure(result);
      } else {
         this.sendBuyResult(buyId);
      }
   }

   @MsgHandlerAnno
   public void C2S_VipLevelShow_7919(PrivilegeMsg.C2S_VipLevelShow_7919 msg, String source) {
      PlayerDao playerDao = this.player.getPlayerDao();
      playerDao.isShowVip = msg.getIsShow();
      playerDao.updateOp();
      this.player.notifyPlayerData(PlayerDefine.PLAYER_SHOW_VIP_LEVEL, playerDao.isShowVip ? 1 : 0);
      this.player.uploadCrossPlayer();
      PrivilegeMsg.S2C_VipLevelShowResult_7920.Builder resp = PrivilegeMsg.S2C_VipLevelShowResult_7920.newBuilder();
      resp.setIsShow(playerDao.isShowVip);
      this.player.sendMsg(resp.build());
   }

   public void sendBuyResult(int buyId) {
      LogOperationMgr logOperationMgr = (LogOperationMgr)ApplicationContextProvider.getContext().getBean(LogOperationMgr.class);
      logOperationMgr.pushTask(() -> logOperationMgr.addActivityLog(this.player, 1940, "特权商城"));
   }

   public void sendInfo() {
   }

   public void loginHandle() {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      PlayerDao playerDao = this.player.getPlayerDao();
      if (!playerExtend.isShowVip) {
         playerDao.isShowVip = false;
         playerDao.updateOp();
         playerExtend.isShowVip = true;
         this.player.updatePlayerExtend(13);
         this.player.notifyPlayerData(PlayerDefine.PLAYER_SHOW_VIP_LEVEL, 0);
      }

   }
}
