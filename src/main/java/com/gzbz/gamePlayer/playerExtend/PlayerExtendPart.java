package com.gzbz.gamePlayer.playerExtend;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.gzbz.db.GameDBPool;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.HeroBagModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.Map;
import misc.DateUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class PlayerExtendPart extends PlayerPart {
   private static final String RECORD_TODAY_ONLINE_SQL = "INSERT INTO tb_player_detail(`playerId`,`todayOnlineSecond`) VALUES(?,?) ON DUPLICATE key UPDATE `todayOnlineSecond` = `todayOnlineSecond` + ?;";
   public long lastRecordOnlineTime = 0L;

   @MsgHandlerAnno
   public void C2S_BuyHeroBag_2007(PlayerMsg.C2S_BuyHeroBag_2007 msg, String source) {
      Integer buyCount = msg.getBuyCount();
      if (buyCount > 0) {
         Map<Integer, HeroBagModel> heroBagModelMap = this.player.getGameModelPool().getMap("heroBag");
         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
         Integer costGold = 0;

         Integer realCount;
         for(realCount = 0; realCount < buyCount; realCount = realCount + 1) {
            Integer nextBuyNum = playerExtend.heroBagBuyNum + realCount + 1;
            if (nextBuyNum > heroBagModelMap.size()) {
               System.out.println("已经达到最大购买次数");
               break;
            }

            HeroBagModel heroBagModel = (HeroBagModel)heroBagModelMap.get(nextBuyNum);
            if (null != heroBagModel) {
               costGold = costGold + heroBagModel.getCost();
            }
         }

         if (realCount > 0) {
            ResourceModel resourceModel = new ResourceModel(1, PlayerDefine.PLAYER_GOLD, costGold);
            if (!this.player.checkResourceNum(resourceModel)) {
               System.out.println("金币不够");
            } else {
               playerExtend.heroBagBuyNum += realCount;
               this.player.updatePlayerExtend(13);
               this.player.delResource(resourceModel, 4, 442, playerExtend.heroBagBuyNum, 0, "BuyHeroBag");
               this.player.notifyPlayerData(PlayerDefine.PLAYER_HEROBAG_BUYNUM, playerExtend.heroBagBuyNum);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_DownLoadReward_2012(PlayerMsg.C2S_DownLoadReward_2012 msg, String source) {
      PlayerMsg.S2C_DownLoadReward_2013.Builder resp = PlayerMsg.S2C_DownLoadReward_2013.newBuilder();
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      if (playerExtend.iisGotDownLoadReward()) {
         resp.setResult(24);
         this.player.sendMsg(resp.build());
      } else {
         playerExtend.downLoadReward();
         this.player.updatePlayerExtend(13);
         String rewardStr = ApplicationContextProvider.getConfigString("DownloadGoodGift", "");
         this.player.addResource(ResourceModel.buildResources(rewardStr), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 13, 1302, 0, 0, "");
         resp.setResult(1);
         this.player.sendMsg(resp.build());
         LogOperationMgr logOperationMgr = (LogOperationMgr)ApplicationContextProvider.getContext().getBean(LogOperationMgr.class);
         logOperationMgr.pushTask(() -> logOperationMgr.addActivityLog(this.player, 1860, "下载礼包"));
      }
   }

   @MsgHandlerAnno
   public void C2S_AuthenticationReward_2017(PlayerMsg.C2S_AuthenticationReward_2017 msg, String source) {
      PlayerMsg.S2C_AuthenticationReward_2018.Builder resp = PlayerMsg.S2C_AuthenticationReward_2018.newBuilder();
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      if (playerExtend.age <= 0) {
         resp.setResult(13002);
         this.player.sendMsg(resp.build());
      } else if (playerExtend.iisGotAuthenticationReward()) {
         resp.setResult(24);
         this.player.sendMsg(resp.build());
      } else {
         playerExtend.authenticationReward();
         this.player.updatePlayerExtend(13);
         this.player.addResource(ResourceModel.buildResources(ApplicationContextProvider.getConfigString("Verified", "")), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 13, 1303, 0, 0, "");
         resp.setResult(1);
         this.player.sendMsg(resp.build());
         LogOperationMgr logOperationMgr = (LogOperationMgr)ApplicationContextProvider.getContext().getBean(LogOperationMgr.class);
         logOperationMgr.pushTask(() -> logOperationMgr.addActivityLog(this.player, 1870, "实名认证"));
      }
   }

   public void loginHandle() {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      if (!playerExtend.iisGotAuthenticationReward()) {
         PlayerMsg.S2C_AuthenticationNotify_2014.Builder message = PlayerMsg.S2C_AuthenticationNotify_2014.newBuilder();
         this.player.sendMsg(message.build());
      }

      if (!playerExtend.iisGotDownLoadReward()) {
         PlayerMsg.S2C_DownLoadRewardNotify_2011.Builder message = PlayerMsg.S2C_DownLoadRewardNotify_2011.newBuilder();
         this.player.sendMsg(message.build());
      }

      this.lastRecordOnlineTime = System.currentTimeMillis();
   }

   public void logoutHandle() {
      this.recordTodayOnline();
   }

   @TaskMethod
   public void recordTodayOnline() {
      if (this.lastRecordOnlineTime > 0L) {
         PlayerPublicDao playerPublicDao = this.player.getPublicDao();
         if (!StringUtils.isEmpty(playerPublicDao.playerName)) {
            int todayOnlineAdd = DateUtil.getIntTime(System.currentTimeMillis() - this.lastRecordOnlineTime);
            GameDBPool gameDBPool = (GameDBPool)ApplicationContextProvider.getContext().getBean(GameDBPool.class);

            try {
               gameDBPool.query("INSERT INTO tb_player_detail(`playerId`,`todayOnlineSecond`) VALUES(?,?) ON DUPLICATE key UPDATE `todayOnlineSecond` = `todayOnlineSecond` + ?;", new Object[]{playerPublicDao.playerId, todayOnlineAdd, todayOnlineAdd});
               this.lastRecordOnlineTime = System.currentTimeMillis();
            } catch (Throwable throwable) {
               throwable.printStackTrace();
            }

         }
      }
   }

   @TaskMethod
   public void resetTodayOnlineRecordTime() {
      this.lastRecordOnlineTime = System.currentTimeMillis();
   }
}
