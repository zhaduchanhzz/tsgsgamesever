package com.gzbz.gamePlayer.peak;

import allMgr.MgrAnno;
import allMgr.MsgHandlerAnno;
import allMgr.TaskMethod;
import com.gzbz.db.PeakBattleTotalDao;
import com.gzbz.db.PeakRedpacketDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.peak.bean.PeakBattleTotalData;
import com.gzbz.gamePlayer.peak.bean.PeakRedPacketData;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.PeakExtraMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.OnLineMgr;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import misc.DateUtil;
import misc.RandomUtil;
import net.CrossSubscribeMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@MgrAnno
@Component
public class PeakRedPacketMgr extends GameMgr {
   static Logger logger = LoggerFactory.getLogger(PeakRedPacketMgr.class);
   @Autowired
   private ConfigManager configManager;
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   private OnLineMgr onLineMgr;

   protected void init() throws Exception {
   }

   public Map<Integer, PeakRedpacketDao> getPeakDaoMap() {
      Map<Integer, PeakRedpacketDao> map = this.gameCachePool.getAllTableByMap("tb_peak_red_packet");
      return map;
   }

   public List<Integer> getReceivedPlayer(int packetId) {
      List<Integer> list = new ArrayList();
      if (this.getPeakDaoMap().containsKey(packetId)) {
         PeakRedpacketDao peakRedpacketDao = (PeakRedpacketDao)this.getPeakDaoMap().get(packetId);

         for(PeakRedPacketData data : peakRedpacketDao.receiveList) {
            list.add(data.playerId);
         }
      }

      return list;
   }

   @MsgHandlerAnno
   public void S2S_NotifyRedPacketInfo_4474(PeakExtraMsg.S2S_NotifyRedPacketInfo_4474 msg, CrossSubscribeMsg crossSubscribeMsg) {
      int rank = msg.getRank();
      int playerId = msg.getPlayerId();
      GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
      if (gamePlayer != null) {
         PeakRedpacketDao dao = new PeakRedpacketDao();
         dao.packetId = rank;
         PeakRedPacketData data = new PeakRedPacketData();
         data.playerId = gamePlayer.getPlayerId();
         data.rank = rank;
         dao.sendData = data;
         dao.time = DateUtil.getIntTime(System.currentTimeMillis());
         this.getGameCachePool().insertDao(dao, true);
         this.notifyMsg(1);
      }
   }

   @TaskMethod
   public void checkRedPacket() {
      boolean flag = false;

      for(PeakRedpacketDao redpacketDao : this.getPeakDaoMap().values()) {
         if (DateUtil.getIntTime(System.currentTimeMillis()) >= redpacketDao.time + 86400) {
            flag = true;
            this.getGameCachePool().deleteDao(redpacketDao, true);
         }
      }

      if (flag) {
         this.notifyMsg(3);
      }

   }

   @TaskMethod
   public void builderPacketList(GamePlayer gamePlayer, int packetId) {
      String peakRedpacketValue = this.configManager.getStrByDefault("peakRedpacketValue", "100|80|60");
      String[] packetNum = peakRedpacketValue.split("\\|");
      PeakExtraMsg.S2C_PeakRedPacketList_4471.Builder builder = PeakExtraMsg.S2C_PeakRedPacketList_4471.newBuilder();
      if (this.getPeakDaoMap().containsKey(packetId)) {
         PeakRedpacketDao redpacketDao = (PeakRedpacketDao)this.getPeakDaoMap().get(packetId);
         if (DateUtil.getIntTime(System.currentTimeMillis()) >= redpacketDao.time + 86400) {
            gamePlayer.sendMsg(builder.build());
            return;
         }

         int sum = Integer.parseInt(packetNum[redpacketDao.packetId - 1]);
         int leftPacketNum = sum - redpacketDao.receiveList.size();
         if (leftPacketNum <= 0) {
            gamePlayer.sendMsg(builder.build());
            return;
         }

         PeakExtraMsg.RedPacket.Builder packet = PeakExtraMsg.RedPacket.newBuilder();
         packet.setId(redpacketDao.id);
         packet.setPacketId(redpacketDao.packetId);
         packet.setSum(sum);
         packet.setLeftNum(leftPacketNum);
         packet.setTime(redpacketDao.time);
         PeakExtraMsg.RedPacketPlayerData.Builder sendBuilder = PeakExtraMsg.RedPacketPlayerData.newBuilder();
         GamePlayer sendPlayer = this.worldMgr.getPlayerById(redpacketDao.sendData.playerId);
         if (sendPlayer != null) {
            PlayerPublicDao sendPublicDao = sendPlayer.getPublicDao();
            sendBuilder.setPlayerName(sendPublicDao.playerName);
            sendBuilder.setHead(sendPublicDao.head);
            sendBuilder.setHeadFrame(sendPublicDao.headFrame);
            sendBuilder.setPlayerId(redpacketDao.sendData.playerId);
            sendBuilder.setRank(redpacketDao.sendData.rank);
            packet.setSendPlayer(sendBuilder);
         }

         builder.setRedPacket(packet);
      }

      gamePlayer.sendMsg(builder.build());
   }

   @TaskMethod
   public void C2S_ReceiveRedPacket_4472(GamePlayer gamePlayer, int redPacketId) {
      Map<Integer, PeakRedpacketDao> map = this.getPeakDaoMap();
      if (map.containsKey(redPacketId)) {
         PeakRedpacketDao redpacketDao = (PeakRedpacketDao)map.get(redPacketId);
         String peakRedpacketValue = this.configManager.getStrByDefault("peakRedpacketValue", "100|80|60");
         String[] packetNum = peakRedpacketValue.split("\\|");
         int sum = Integer.parseInt(packetNum[redpacketDao.packetId - 1]);
         if (redpacketDao.receiveList.size() >= sum) {
            logger.info("红包已被领取完");
            this.notifyMsg(2);
         } else {
            for(PeakRedPacketData data : redpacketDao.receiveList) {
               if (data.playerId == gamePlayer.getPlayerId()) {
                  return;
               }
            }

            String peakRedpacket = "";
            if (redpacketDao.packetId == 1) {
               peakRedpacket = this.configManager.getStrByDefault("peakRedpacket1", "1|9|10000");
            } else if (redpacketDao.packetId == 2) {
               peakRedpacket = this.configManager.getStrByDefault("peakRedpacket2", "1|9|8000");
            } else {
               peakRedpacket = this.configManager.getStrByDefault("peakRedpacket3", "1|9|6000");
            }

            String[] recerouce = peakRedpacket.split("\\|");
            int sumPropNum = Integer.parseInt(recerouce[2]);
            if (redpacketDao.receivePropNum >= sumPropNum) {
               logger.info("红包领完");
               this.notifyMsg(2);
            } else {
               int realNum = this.calGetRedPacketMoney((sumPropNum - redpacketDao.receivePropNum) / (sum - redpacketDao.receiveList.size()) * 2);
               redpacketDao.receivePropNum += realNum;
               PeakRedPacketData data = new PeakRedPacketData();
               data.playerId = gamePlayer.getPlayerId();
               data.rank = 0;
               data.propNum = realNum;
               data.receiveTime = DateUtil.getIntTime(System.currentTimeMillis());
               redpacketDao.receiveList.add(data);
               redpacketDao.updateOp();
               if (redpacketDao.receiveList.size() >= sum) {
                  logger.info("红包已被领取完");
                  this.notifyMsg(2);
               } else {
                  ResourceModel model = new ResourceModel(Integer.parseInt(recerouce[0]), Integer.parseInt(recerouce[1]), realNum);
                  PeakBattlePart peakBattlePart = (PeakBattlePart)gamePlayer.getMgrPart(PeakBattlePart.class);
                  peakBattlePart.pushTaskEx("receiveRedPacket", new Object[]{model});
                  PeakExtraMsg.S2C_ReceiveRedPacket_4473.Builder builder = PeakExtraMsg.S2C_ReceiveRedPacket_4473.newBuilder();
                  builder.setId(redPacketId);

                  for(PeakRedPacketData packetData : redpacketDao.receiveList) {
                     GamePlayer getPlayer = this.worldMgr.getPlayerById(packetData.playerId);
                     if (getPlayer != null) {
                        PlayerPublicDao getPublicDao = getPlayer.getPublicDao();
                        PeakExtraMsg.RedPacketPlayerData.Builder pickBuilder = PeakExtraMsg.RedPacketPlayerData.newBuilder();
                        pickBuilder.setHead(getPublicDao.head);
                        pickBuilder.setHeadFrame(getPublicDao.headFrame);
                        pickBuilder.setPlayerId(packetData.playerId);
                        pickBuilder.setRank(0);
                        pickBuilder.setPlayerName(getPublicDao.playerName);
                        pickBuilder.setNum(packetData.propNum);
                        pickBuilder.setTime(packetData.receiveTime);
                        builder.addPickInfo(pickBuilder);
                     }
                  }

                  gamePlayer.sendMsg(builder.build());
                  PeakExtraMsg.S2C_NotifyReceivePacket_4479.Builder notify = PeakExtraMsg.S2C_NotifyReceivePacket_4479.newBuilder();
                  notify.setRedPacketId(redPacketId);
                  int leftNum = sum - redpacketDao.receiveList.size();
                  notify.setLeftNum(leftNum);
                  this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{notify.build()});
               }
            }
         }
      }
   }

   private int calGetRedPacketMoney(int max) {
      return RandomUtil.randInt(1, max);
   }

   public void notifyMsg(int type) {
      String peakRedpacketValue = this.configManager.getStrByDefault("peakRedpacketValue", "100|80|60");
      String[] packetNum = peakRedpacketValue.split("\\|");
      PeakExtraMsg.S2C_NotifyRedPacket_4478.Builder builder = PeakExtraMsg.S2C_NotifyRedPacket_4478.newBuilder();
      builder.setType(type);

      for(PeakRedpacketDao redpacketDao : this.getPeakDaoMap().values()) {
         if (DateUtil.getIntTime(System.currentTimeMillis()) < redpacketDao.time + 86400) {
            int sum = Integer.parseInt(packetNum[redpacketDao.packetId - 1]);
            int leftPacketNum = sum - redpacketDao.receiveList.size();
            if (leftPacketNum > 0) {
               builder.addTempId(redpacketDao.id);
            }
         }
      }

      this.onLineMgr.pushTaskEx("onlineBroadcast", new Object[]{builder.build()});
   }

   public void gmOp(int rank, int playerId) {
      PeakExtraMsg.S2S_NotifyRedPacketInfo_4474.Builder builder = PeakExtraMsg.S2S_NotifyRedPacketInfo_4474.newBuilder();
      builder.setRank(rank);
      builder.setPlayerId(playerId);
      this.S2S_NotifyRedPacketInfo_4474(builder.build(), (CrossSubscribeMsg)null);
   }

   @TaskMethod
   public void loginCheckPacket(GamePlayer gamePlayer) {
      SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 2040);
      PlayerPublicDao playerPublicDao = gamePlayer.getPublicDao();
      if (playerPublicDao.lv >= systemFunctionModel.getOpenLevel()) {
         if (!this.getPeakDaoMap().isEmpty()) {
            String peakRedpacketValue = this.configManager.getStrByDefault("peakRedpacketValue", "100|80|60");
            String[] packetNum = peakRedpacketValue.split("\\|");
            PeakExtraMsg.S2C_NotifyRedPacket_4478.Builder builder = PeakExtraMsg.S2C_NotifyRedPacket_4478.newBuilder();

            for(PeakRedpacketDao redpacketDao : this.getPeakDaoMap().values()) {
               if (DateUtil.getIntTime(System.currentTimeMillis()) < redpacketDao.time + 86400) {
                  boolean flag = false;

                  for(PeakRedPacketData packetData : redpacketDao.receiveList) {
                     if (packetData.playerId == gamePlayer.getPlayerId()) {
                        flag = true;
                        break;
                     }
                  }

                  if (!flag) {
                     int sum = Integer.parseInt(packetNum[redpacketDao.packetId - 1]);
                     int leftPacketNum = sum - redpacketDao.receiveList.size();
                     if (leftPacketNum > 0) {
                        builder.addRedPacketId(redpacketDao.id);
                     }
                  }
               }
            }

            if (!builder.getRedPacketIdList().isEmpty()) {
               gamePlayer.sendMsg(builder.build());
            }

         }
      }
   }

   @TaskMethod
   public void savePeakTotal(PeakBattleTotalData data) {
      PeakBattleTotalDao dao = new PeakBattleTotalDao();
      dao.data = data;
      this.getGameCachePool().insertDao(dao, false);
   }
}
