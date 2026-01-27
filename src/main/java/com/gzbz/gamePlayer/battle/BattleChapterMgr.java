package com.gzbz.gamePlayer.battle;

import allMgr.MgrAnno;
import allMgr.TaskMethod;
import com.gzbz.db.WeChatDao;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import misc.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@MgrAnno
public class BattleChapterMgr extends GameMgr {
   Logger logger = LoggerFactory.getLogger(BattleChapterMgr.class);
   @Value("${weChatUrl}")
   private String weChatUrl;
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   private ConfigManager configManager;
   private List<Integer> needSendPlayers = new ArrayList();
   private ScheduledFuture future;
   private int index = 0;

   protected void init() throws Exception {
   }

   public String getWeChatUrl() {
      return this.weChatUrl;
   }

   @TaskMethod
   public void doJob() {
      int startHour = this.configManager.getIntDefault("weChatNoSendStartHour", 0);
      int endHour = this.configManager.getIntDefault("weChatNoSendEndHour", 8);
      int intervalTime = this.configManager.getIntDefault("weChatIntervalTime", 2);
      int dailySendNum = this.configManager.getIntDefault("weChatdailySendNum", 3);
      int currentHour = DateUtil.cHour();
      if (currentHour >= startHour && currentHour < endHour) {
         this.logger.info("该时段不发送玩家通知,start={},end={}", startHour, endHour);
      } else if (!this.getWeChatUrl().isEmpty()) {
         if (this.needSendPlayers == null) {
            this.needSendPlayers = new ArrayList();
         }

         this.needSendPlayers.clear();
         this.index = 0;
         Map<Integer, WeChatDao> map = this.getWeChatDaoMap();
         int loop = 0;

         for(Map.Entry<Integer, WeChatDao> entry : map.entrySet()) {
            GamePlayer gamePlayer = this.worldMgr.getPlayerById((Integer)entry.getKey());
            if (gamePlayer != null && !this.worldMgr.getOnlinePlayer().contains(entry.getKey()) && ((WeChatDao)entry.getValue()).state == 1L) {
               if (!DateUtil.isSameDay(((WeChatDao)entry.getValue()).lastTime)) {
                  ((WeChatDao)entry.getValue()).num = 0;
               }

               if (System.currentTimeMillis() - ((WeChatDao)entry.getValue()).lastTime >= 3600000L * (long)intervalTime && ((WeChatDao)entry.getValue()).num < dailySendNum) {
                  this.needSendPlayers.add(entry.getKey());
                  ++loop;
                  if (loop >= 500) {
                     break;
                  }
               }
            }
         }

         this.future = this.scheduleEx(0L, 1000L, "doSend", new Object[0]);
      }
   }

   public void gmTest() {
      Map<Integer, WeChatDao> map = this.getWeChatDaoMap();

      for(Map.Entry<Integer, WeChatDao> entry : map.entrySet()) {
         GamePlayer gamePlayer = this.worldMgr.getPlayerById((Integer)entry.getKey());
         if (gamePlayer != null) {
            this.sendWeChatPlayer((Integer)entry.getKey());
         }
      }

   }

   @TaskMethod
   public void doSend() {
      if (this.index >= this.needSendPlayers.size()) {
         this.future.cancel(true);
      } else {
         this.sendWeChatPlayer((Integer)this.needSendPlayers.get(this.index));
         ++this.index;
      }
   }

   public void sendWeChatPlayer(int playerId) {
      GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
      WeChatDao weChatDao = this.getWeChatDao(playerId);
      BattleChapterPart battleChapterPart = (BattleChapterPart)gamePlayer.getMgrPart(BattleChapterPart.class);
      battleChapterPart.pushTaskEx("sendWeChatData", new Object[]{weChatDao.channelId, weChatDao.openId});
   }

   public void updatePlayerState(int playerId, int type, int state, String channelId, String openId) {
      WeChatDao weChatDao = this.getWeChatDao(playerId);
      if (weChatDao != null) {
         weChatDao.type = type;
         weChatDao.state = (long)state;
         weChatDao.channelId = channelId;
         weChatDao.openId = openId;
         weChatDao.updateOp();
      } else {
         weChatDao = new WeChatDao();
         weChatDao.playerId = playerId;
         weChatDao.type = type;
         weChatDao.state = (long)state;
         weChatDao.channelId = channelId;
         weChatDao.openId = openId;
         this.gameCachePool.insertDao(weChatDao, false);
      }

   }

   public void clearPlayer(int playerId) {
      WeChatDao weChatDao = this.getWeChatDao(playerId);
      if (weChatDao != null) {
         this.gameCachePool.deleteDao(weChatDao, false);
      }

   }

   public void updateSendTime(int playerId) {
      WeChatDao weChatDao = this.getWeChatDao(playerId);
      if (weChatDao != null) {
         if (weChatDao.type == 1) {
            this.gameCachePool.deleteDao(weChatDao, false);
         } else {
            weChatDao.lastTime = System.currentTimeMillis();
            ++weChatDao.num;
            weChatDao.updateOp();
         }
      }

   }

   public Map<Integer, WeChatDao> getWeChatDaoMap() {
      return this.gameCachePool.getAllTableByMap("tb_we_chat");
   }

   public WeChatDao getWeChatDao(int playerId) {
      Map<Integer, WeChatDao> map = this.getWeChatDaoMap();
      if (map == null) {
         return null;
      } else {
         return map.containsKey(playerId) ? (WeChatDao)map.get(playerId) : null;
      }
   }
}
