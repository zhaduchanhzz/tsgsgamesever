package com.gzbz.worldMgr;

import allMgr.MgrAnno;
import allMgr.TaskMethod;
import com.google.protobuf.GeneratedMessageV3;
import com.gzbz.chat.ChatMgr;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.demon.DemonMgr;
import com.gzbz.demonRotate.DemonRotateMgr;
import com.gzbz.demonStrikes.DemonStrikesPart;
import com.gzbz.duel.DuelMgr;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.friend.FriendPart;
import com.gzbz.gamePlayer.peak.PeakRedPacketMgr;
import com.gzbz.mart.MartPart;
import com.gzbz.megerWar.CoreWarMgr;
import com.gzbz.mine.part.MinePart;
import com.gzbz.model.DuelRedEnvelopesModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.protobuf.ChatMsg;
import com.gzbz.protobuf.DuelExtraMsg;
import com.gzbz.protobuf.PeakExtraMsg;
import com.gzbz.protobuf.ThemeActivityMsg;
import com.gzbz.protobuf.WaterTransportMsg;
import com.gzbz.scan.GameProtobufScanContext;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.transport.WaterTransportMgr;
import com.gzbz.transport.part.WaterTransportPart;
import com.gzbz.unionOffer.OfferPart;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ScheduledFuture;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@MgrAnno
public class OnLineMgr extends GameMgr {
   Logger logger = LoggerFactory.getLogger(ChatMgr.class);
   private final Queue<GeneratedMessageV3> queueMsg = new LinkedList();
   private final List<GamePlayer> curPlayers = new ArrayList();
   private final WorldMgr worldMgr;
   private final GameProtobufScanContext gameProtobufScanContext;
   private ScheduledFuture<?> future = null;
   private GeneratedMessageV3 curMsg = null;
   private int cmd;
   private long curSendTime;

   public OnLineMgr(WorldMgr worldMgr, GameProtobufScanContext gameProtobufScanContext) {
      this.worldMgr = worldMgr;
      this.gameProtobufScanContext = gameProtobufScanContext;
   }

   protected void init() {
   }

   @TaskMethod
   public void onlineBroadcast(GeneratedMessageV3 msg) {
      this.queueMsg.offer(msg);
      if (this.future == null) {
         this.future = this.scheduleEx(0L, 10L, "doBroadcast", new Object[0]);
      }

   }

   @TaskMethod
   public void doBroadcast() {
      if (this.queueMsg.size() > 50000) {
         this.logger.error("msg is too much.");
         this.queueMsg.clear();
         this.curMsg = null;
         this.curPlayers.clear();
      } else {
         Map<Integer, GamePlayer> onlinePlayers = this.worldMgr.getOnlinePlayerMap();
         if (onlinePlayers.isEmpty() || this.curMsg == null && this.queueMsg.isEmpty()) {
            this.curPlayers.clear();
            this.queueMsg.clear();
            if (this.future != null) {
               this.future.cancel(true);
               this.future = null;
            }

         } else if (this.future == null) {
            this.curPlayers.clear();
         } else {
            if (this.curMsg == null) {
               this.curMsg = (GeneratedMessageV3)this.queueMsg.poll();
               if (this.curMsg == null) {
                  this.curPlayers.clear();
                  return;
               }

               this.curPlayers.addAll(onlinePlayers.values());
               this.curSendTime = System.currentTimeMillis();
               this.cmd = (Integer)this.gameProtobufScanContext.proto2Cmd.get(this.curMsg.getClass());
            }

            for(int i = 0; i < 100; ++i) {
               if (this.curPlayers.isEmpty()) {
                  this.curMsg = null;
                  return;
               }

               GamePlayer receiver = (GamePlayer)this.curPlayers.remove(this.curPlayers.size() - 1);
               this.executeSend(receiver);
            }

         }
      }
   }

   private void executeSend(GamePlayer gamePlayer) {
      if (gamePlayer != null && this.curMsg != null) {
         FriendPart friendPart = (FriendPart)gamePlayer.getMgrPart(FriendPart.class);
         switch (this.cmd) {
            case 4345:
               SystemFunctionModel chibiModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 2010);
               PlayerPublicDao chibiDao = gamePlayer.getPublicDao();
               if (chibiDao.lv < chibiModel.getOpenLevel()) {
                  return;
               }
               break;
            case 4459:
               SystemFunctionModel peakModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 2040);
               PlayerPublicDao peakDa0 = gamePlayer.getPublicDao();
               if (peakDa0.lv < peakModel.getOpenLevel()) {
                  return;
               }
               break;
            case 4478:
               SystemFunctionModel functionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 2040);
               PlayerPublicDao peakPlayerDao = gamePlayer.getPublicDao();
               if (peakPlayerDao.lv < functionModel.getOpenLevel()) {
                  return;
               }

               PeakExtraMsg.S2C_NotifyRedPacket_4478.Builder notify4478 = (PeakExtraMsg.S2C_NotifyRedPacket_4478.Builder)this.curMsg.toBuilder();
               PeakExtraMsg.S2C_NotifyRedPacket_4478.Builder notifyBuilder = PeakExtraMsg.S2C_NotifyRedPacket_4478.newBuilder();
               PeakRedPacketMgr peakRedPacketMgr = (PeakRedPacketMgr)ApplicationContextProvider.getContext().getBean(PeakRedPacketMgr.class);

               for(Integer packetId : notify4478.getTempIdList()) {
                  if (!peakRedPacketMgr.getReceivedPlayer(packetId).contains(gamePlayer.getPlayerId())) {
                     notifyBuilder.addRedPacketId(packetId);
                  }
               }

               gamePlayer.sendMsg(notifyBuilder.build());
               return;
            case 4479:
               SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 2040);
               PlayerPublicDao playerPublicDao = gamePlayer.getPublicDao();
               if (playerPublicDao.lv < systemFunctionModel.getOpenLevel()) {
                  return;
               }
               break;
            case 4541:
            case 4561:
               if (!gamePlayer.isSystemOpen(3190)) {
                  return;
               }

               DuelMgr duelMgr = (DuelMgr)ApplicationContextProvider.getContext().getBean(DuelMgr.class);
               if (!duelMgr.guessUIPlayer.contains(gamePlayer.getPlayerId())) {
                  return;
               }
               break;
            case 4542:
            case 16714:
               if (!gamePlayer.isSystemOpen(3190)) {
                  return;
               }

               DuelMgr pointDuelMgr = (DuelMgr)ApplicationContextProvider.getContext().getBean(DuelMgr.class);
               if (!pointDuelMgr.pointUIPlayer.contains(gamePlayer.getPlayerId())) {
                  return;
               }
               break;
            case 4562:
            case 16728:
               if (!gamePlayer.isSystemOpen(3190)) {
                  return;
               }

               DuelMgr passDuelMgr = (DuelMgr)ApplicationContextProvider.getContext().getBean(DuelMgr.class);
               if (!passDuelMgr.passUIPlayer.contains(gamePlayer.getPlayerId())) {
                  return;
               }
               break;
            case 4825:
               SystemFunctionModel bossModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 3084);
               PlayerPublicDao bossDao = gamePlayer.getPublicDao();
               if (bossDao.lv < bossModel.getOpenLevel()) {
                  return;
               }

               DemonMgr demonMgr = (DemonMgr)ApplicationContextProvider.getContext().getBean(DemonMgr.class);
               if (!demonMgr.inBossPlayers.contains(bossDao.playerId)) {
                  return;
               }
               break;
            case 6004:
               ChatMsg.S2C_Chat_6004 s2CChat6004 = (ChatMsg.S2C_Chat_6004)this.curMsg;
               if (s2CChat6004.getInfosList().isEmpty()) {
                  return;
               }

               ChatMsg.Chat_Info chatInfo = s2CChat6004.getInfos(0);
               if (chatInfo.getPlayerId() > 0) {
                  if (chatInfo.getPlayerId() == gamePlayer.getPlayerId()) {
                     return;
                  }

                  if (friendPart.checkIdentity(4, chatInfo.getPlayerId())) {
                     return;
                  }

                  if (chatInfo.getChannel() == 5 && chatInfo.getAreaId() != gamePlayer.getAreaId()) {
                     return;
                  }
               }
               break;
            case 9522:
               if (!WaterTransportPart.IN_MAIN_PLAYERS.contains(gamePlayer.getPlayerId())) {
                  return;
               }

               WaterTransportMgr waterTransportMgr = (WaterTransportMgr)ApplicationContextProvider.getContext().getBean(WaterTransportMgr.class);
               waterTransportMgr.altarBuffTrigger(gamePlayer);
               break;
            case 9526:
            case 9530:
            case 9540:
               if (!WaterTransportPart.IN_MAIN_PLAYERS.contains(gamePlayer.getPlayerId())) {
                  return;
               }
               break;
            case 9548:
               WaterTransportMsg.S2C_AlreadySupportNotify_9548 s2c9548 = (WaterTransportMsg.S2C_AlreadySupportNotify_9548)this.curMsg;
               if (!friendPart.checkIdentity(1, s2c9548.getFriendId())) {
                  return;
               }

               if (!WaterTransportPart.IN_MAIN_PLAYERS.contains(gamePlayer.getPlayerId())) {
                  return;
               }
               break;
            case 9552:
               WaterTransportMsg.S2C_GoldShip_9552 s2c9552 = (WaterTransportMsg.S2C_GoldShip_9552)this.curMsg;
               if (s2c9552.hasAttackLog() && (!WaterTransportPart.IN_MAIN_PLAYERS.contains(gamePlayer.getPlayerId()) || s2c9552.getAttackLog().getPlayerId() == gamePlayer.getPlayerId())) {
                  return;
               }
               break;
            case 10414:
               SystemFunctionModel model = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 2130);
               PlayerDao playerDao = gamePlayer.getPlayerDao();
               if (playerDao.lv < model.getOpenLevel()) {
                  return;
               }
               break;
            case 12230:
            case 12236:
            case 12252:
            case 12258:
            case 12260:
               if (!MinePart.IN_MINE_PLAYERS.contains(gamePlayer.getPlayerId())) {
                  return;
               }
               break;
            case 12950:
               PlayerPublicDao weChatGiftPlayerDao = gamePlayer.getPublicDao();
               ThemeActivityMsg.S2C_WeChatGift_12950 notify12950 = (ThemeActivityMsg.S2C_WeChatGift_12950)this.curMsg;
               if (weChatGiftPlayerDao.lv < notify12950.getOpenLv()) {
                  return;
               }
               break;
            case 13912:
            case 13938:
               if (!gamePlayer.isSystemOpen(2021)) {
                  return;
               }

               if (!DemonStrikesPart.IN_MAIN_PLAYERS.contains(gamePlayer.getPlayerId())) {
                  return;
               }
               break;
            case 14604:
            case 14606:
            case 14608:
            case 14734:
               if (!OfferPart.IN_UNION_OFFER_PLAYERS.contains(gamePlayer.getPlayerId())) {
                  return;
               }
               break;
            case 16325:
               SystemFunctionModel bossRotateModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 3084);
               PlayerPublicDao bossRotateDao = gamePlayer.getPublicDao();
               if (bossRotateDao.lv < bossRotateModel.getOpenLevel()) {
                  return;
               }

               DemonRotateMgr demonRotateMgr = (DemonRotateMgr)ApplicationContextProvider.getContext().getBean(DemonRotateMgr.class);
               if (!demonRotateMgr.inBossPlayers.contains(bossRotateDao.playerId)) {
                  return;
               }
               break;
            case 16753:
               DuelExtraMsg.S2C_NotifyRedPacket_16753.Builder notify16753 = (DuelExtraMsg.S2C_NotifyRedPacket_16753.Builder)this.curMsg.toBuilder();
               DuelExtraMsg.S2C_NotifyRedPacket_16753.Builder builder16753 = DuelExtraMsg.S2C_NotifyRedPacket_16753.newBuilder();

               for(Integer id : notify16753.getTypeList()) {
                  DuelRedEnvelopesModel redEnvelopesModel = (DuelRedEnvelopesModel)ApplicationContextProvider.getModelPoolEntity("redEnvelopes", id);
                  if (redEnvelopesModel.getNeedLv() <= gamePlayer.getPublicDao().lv) {
                     builder16753.addType(id);
                  }
               }

               gamePlayer.sendMsg(builder16753.build());
               return;
            case 16762:
               if (!gamePlayer.isSystemOpen(3190)) {
                  return;
               }
               break;
            case 16763:
               if (!gamePlayer.isSystemOpen(3190)) {
                  return;
               }
               break;
            case 17904:
               if (!gamePlayer.isSystemOpen(3900)) {
                  return;
               }
               break;
            case 19412:
               CoreWarMgr coreWarMgr1 = (CoreWarMgr)ApplicationContextProvider.getContext().getBean(CoreWarMgr.class);
               if (!coreWarMgr1.onBossPlayerSet.contains(gamePlayer.getPlayerId())) {
                  return;
               }
               break;
            case 19502:
            case 19506:
            case 19516:
            case 19518:
            case 19520:
            case 19524:
            case 19528:
            case 19530:
            case 19532:
            case 19534:
            case 19538:
            case 19542:
            case 19552:
               CoreWarMgr coreWarMgr = (CoreWarMgr)ApplicationContextProvider.getContext().getBean(CoreWarMgr.class);
               if (!coreWarMgr.onWarPlayerSet.contains(gamePlayer.getPlayerId())) {
                  return;
               }
               break;
            case 23160:
            case 23166:
               if (!MartPart.IN_MART_PLAYERS.contains(gamePlayer.getPlayerId())) {
                  return;
               }
         }

         gamePlayer.sendMsg(this.curMsg);
      }
   }
}
