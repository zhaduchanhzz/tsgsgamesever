package com.gzbz.gamePlayer.tracking;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.ClientTrackingDao;
import com.gzbz.gameDefine.ClientTrackingEnum;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.util.Map;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ClientTrackingPart extends PlayerPart {
   @MsgHandlerAnno
   public void C2S_TrackingFinish_2051(PlayerMsg.C2S_TrackingFinish_2051 msg, String source) {
      ClientTrackingDao clientTrackingDao = this.getTrackingDao(msg.getTrackId());
      if (clientTrackingDao != null && !clientTrackingDao.isTrack) {
         try {
            ClientTrackingEnum clientTrackingEnum = ClientTrackingEnum.valueOf(clientTrackingDao.trackingType);
            if (this.invalidTrack(clientTrackingEnum)) {
               return;
            }

            if (clientTrackingEnum.isOnce()) {
               clientTrackingDao.isTrack = true;
               clientTrackingDao.updateOp();
            } else {
               this.player.deleteDao(clientTrackingDao, false);
            }
         } catch (Exception e) {
            e.printStackTrace();
         }

      }
   }

   public void removeTrack(ClientTrackingEnum trackingEnum, String trackingId) {
      if (!trackingEnum.isOnce()) {
         trackingId = trackingEnum.name() + "@" + trackingId;
      }

      ClientTrackingDao clientTrackingDao = this.getTrackingDao(trackingId);
      if (clientTrackingDao != null) {
         this.player.deleteDao(clientTrackingDao, false);
      }
   }

   public void clientTrack(ClientTrackingEnum trackingEnum, String trackingId, String... params) {
      if (!this.invalidTrack(trackingEnum)) {
         if (!trackingEnum.isOnce()) {
            trackingId = trackingEnum.name() + "@" + trackingId;
         }

         ClientTrackingDao clientTrackingDao = this.getTrackingDao(trackingId);
         if (clientTrackingDao == null) {
            clientTrackingDao = new ClientTrackingDao();
            clientTrackingDao.playerId = this.player.getPlayerId();
            clientTrackingDao.trackingId = trackingId;
            clientTrackingDao.trackingType = trackingEnum.name();
            if (params != null) {
               for(String param : params) {
                  String[] split = param.split("=");
                  clientTrackingDao.params.put(split[0], split[1]);
               }
            }

            if (!clientTrackingDao.params.containsKey("type")) {
               clientTrackingDao.params.put("type", trackingEnum.name().toLowerCase());
            }

            this.player.insertDao(clientTrackingDao, false);
            this.notifyTrack(clientTrackingDao);
         }
      }
   }

   private void notifyTrack(ClientTrackingDao clientTrackingDao) {
      PlayerMsg.S2C_Tracking_2052.Builder builder = PlayerMsg.S2C_Tracking_2052.newBuilder();
      builder.setTracking(clientTrackingDao.buildMsg());
      this.player.sendMsg(builder.build());
   }

   private ClientTrackingDao getTrackingDao(String trackingId) {
      Map<String, ClientTrackingDao> map = this.player.<String, ClientTrackingDao>getMap("tb_client_tracking", this.player.getPlayerId());
      return (ClientTrackingDao)map.get(trackingId);
   }

   public void loginHandle() {
      PlayerMsg.S2C_WaitTracking_2050.Builder builder = null;
      Map<String, ClientTrackingDao> map = this.player.<String, ClientTrackingDao>getMap("tb_client_tracking", this.player.getPlayerId());

      for(ClientTrackingDao clientTrackingDao : map.values()) {
         if (!clientTrackingDao.isTrack) {
            ClientTrackingEnum clientTrackingEnum = ClientTrackingEnum.valueOf(clientTrackingDao.trackingType);
            if (!this.invalidTrack(clientTrackingEnum)) {
               if (builder == null) {
                  builder = PlayerMsg.S2C_WaitTracking_2050.newBuilder();
               }

               builder.addTracking(clientTrackingDao.buildMsg());
            }
         }
      }

      if (builder != null) {
         this.player.sendMsg(builder.build());
      }

   }

   public boolean loginHandleAsync() {
      return true;
   }

   public void levelUp(int preLv, int newLv) {
      if (newLv >= 10) {
         this.clientTrack(ClientTrackingEnum.SP_AF_TUTORIAL_COMPLETION, ClientTrackingEnum.SP_AF_TUTORIAL_COMPLETION.name(), "RoleLevel=10");
      }

      if (newLv >= 15) {
         this.clientTrack(ClientTrackingEnum.SP_AF_LEVEL_ACHIEVED, ClientTrackingEnum.SP_AF_LEVEL_ACHIEVED.name(), "RoleLevel=15");
      }

   }

   private boolean invalidTrack(ClientTrackingEnum clientTrackingEnum) {
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      if (StringUtils.isEmpty(worldMgr.country)) {
         return true;
      } else {
         for(String country : clientTrackingEnum.getCountry()) {
            if (country.equals(worldMgr.country)) {
               return false;
            }
         }

         return true;
      }
   }
}
