package com.gzbz.benefit;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.BenefitMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import misc.DateUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class PreventionCartoonPart extends PlayerPart {
   @MsgHandlerAnno
   public void C2S_PreventionCartoon_8131(BenefitMsg.C2S_PreventionCartoon_8131 msg, String source) {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      BenefitMsg.S2C_PreventionCartoon_8132.Builder resp = BenefitMsg.S2C_PreventionCartoon_8132.newBuilder();
      resp.setIsGot((Byte)playerResetCustomCache.getDailyNum(7, (byte)0) == 1);
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_PreventionCartoonReward_8133(BenefitMsg.C2S_PreventionCartoonReward_8133 msg, String source) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      int duringTime = ApplicationContextProvider.getConfigInt("CartoonTime", 0);
      if (System.currentTimeMillis() >= DateUtil.getSomeDayEndTime(worldMgr.getOpenServerTime() + (long)duringTime * 86400000L)) {
         this.player.failure(8007);
      } else {
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         byte isGot = (Byte)playerResetCustomCache.getDailyNum(7, (byte)0);
         if (isGot == 1) {
            this.player.failure(24);
         } else {
            playerResetCustomCache.setDailyReset(7, (byte)1);
            ResourceModel resourceModel = ResourceModel.buildResource(ApplicationContextProvider.getConfigString("CartoonReward", "1|9|100"));
            this.player.addResource(resourceModel, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 20, 2010, 0, 0, "");
            BenefitMsg.S2C_PreventionCartoonReward_8134.Builder resp = BenefitMsg.S2C_PreventionCartoonReward_8134.newBuilder();
            resp.setIsGot((Byte)playerResetCustomCache.getDailyNum(7, (byte)0) == 1);
            this.player.sendMsg(resp.build());
         }
      }
   }
}
