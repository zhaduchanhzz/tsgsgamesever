package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.bean.WorldCupMatch;
import com.gzbz.db.bean.WorldCupResult;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.WorldCupMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.WorldCupTaskPart;
import com.gzbz.worldCup.WorldCupMgr;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class WorldCupPart extends AbstractActivityPart {
   @Autowired
   private WorldCupMgr worldCupMgr;

   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         WorldCupTaskPart worldCupTaskPart = (WorldCupTaskPart)this.player.getMgrPart(WorldCupTaskPart.class);
         worldCupTaskPart.trigger();
      }
   }

   public void loginHandle() {
      WorldCupTaskPart worldCupTaskPart = (WorldCupTaskPart)this.player.getMgrPart(WorldCupTaskPart.class);
      worldCupTaskPart.trigger();
      this.calcExchangeTime(true);
   }

   public void resetHour() {
      if (!this.isServerActivityInvalid()) {
         this.calcExchangeTime(false);
      }
   }

   public void resetDaily() {
      this.notifyGetCoinTimes();
   }

   private void calcExchangeTime(boolean isSend) {
      long curTime = System.currentTimeMillis();
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      long updateTime = (Long)playerResetCustomCache.getForeverNum(548, 0L);
      if (updateTime != -1L && updateTime <= curTime) {
         playerResetCustomCache.setForever(547, 0);
         String chipRefreshTime = ApplicationContextProvider.getConfigString("WorldCupChipRefreshTime", "9|14|17");
         String[] split = chipRefreshTime.split("\\|");
         Calendar calendar = Calendar.getInstance();
         long nextResetTime = -1L;

         for(String day : split) {
            calendar.set(2, 11);
            calendar.set(5, Integer.parseInt(day));
            calendar.set(11, 6);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            if (curTime < calendar.getTime().getTime()) {
               nextResetTime = calendar.getTime().getTime();
               break;
            }
         }

         playerResetCustomCache.setForever(548, nextResetTime);
         this.notifyExchangeCoin();
      } else {
         if (isSend) {
            this.notifyExchangeCoin();
         }

      }
   }

   public void activityEnd(int oldActivityId) {
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_WORLD_CUP);
      int itemId = ApplicationContextProvider.getConfigInt("worldCupGuessItemId", 6991);
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      int itemNum = itemBagPart.getItemNum(itemId);
      if (itemNum > 0) {
         this.player.delResource(2, itemId, (long)itemNum, 132, 13205, 0, 0, "");
         String chipRefreshTime = ApplicationContextProvider.getConfigString("WorldCupChipOverExchange", "2|1");
         String[] split = chipRefreshTime.split("\\|");
         int rewardNum = itemNum * Integer.parseInt(split[1]) / Integer.parseInt(split[0]);
         List<ResourceModel> resourceModels = new ArrayList();
         resourceModels.add(new ResourceModel(1, PlayerDefine.PLAYER_RENOW, rewardNum));
         Map<Integer, TreeMap<Integer, CentreAwardModel>> centreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> centreAwardModelTreeMap = (TreeMap)centreAwardMap.get(CentreAwardModel.TYPE_WORLD_CUP_EXCHANGE);
         CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardModelTreeMap.firstEntry().getValue();
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), resourceModels, 604800000L, 132, 13205);
      }

   }

   public void rotateReset(int oldActivityId) {
      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(TaskDefine.TaskModule.MODULE_WORLD_CUP);
      WorldCupTaskPart worldCupTaskPart = (WorldCupTaskPart)this.player.getMgrPart(WorldCupTaskPart.class);
      worldCupTaskPart.trigger();
   }

   public int getActivityType() {
      return 95;
   }

   @MsgHandlerAnno
   public void C2S_ActInfo_23001(WorldCupMsg.C2S_ActInfo_23001 msg, String source) {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int times = (Integer)playerResetCustomCache.getDailyNum(546, 0);
      int hadExchangeTime = (Integer)playerResetCustomCache.getForeverNum(547, 0);
      WorldCupMsg.S2C_ActInfo_23002.Builder builder = WorldCupMsg.S2C_ActInfo_23002.newBuilder();
      builder.setGetCoinTime(times);
      builder.setTotalExchange(hadExchangeTime);
      long updateTime = (Long)playerResetCustomCache.getForeverNum(548, 0L);
      builder.setExchangeReset(updateTime == -1L ? -1 : (int)(updateTime / 1000L));
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_GuessWin_23003(WorldCupMsg.C2S_GuessWin_23003 msg, String source) {
      WorldCupMsg.GuessInfo guessInfo = msg.getGuessInfo();
      this.guessWin(guessInfo);
   }

   @MsgHandlerAnno
   public void C2S_GetCoin_23005(WorldCupMsg.C2S_GetCoin_23005 msg, String source) {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int times = (Integer)playerResetCustomCache.getDailyNum(546, 0);
      if (times < ApplicationContextProvider.getConfigInt("WorldCupGetCoinTime", 1)) {
         playerResetCustomCache.addDailyReset(546, 1);
         int itemId = ApplicationContextProvider.getConfigInt("worldCupGuessItemId", 6991);
         int num = ApplicationContextProvider.getConfigInt("WorldCupQuizItem", 500);
         this.player.addResource(2, itemId, num, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 132, 13202, 0, 0, "");
         this.notifyGetCoinTimes();
      }
   }

   private void notifyGetCoinTimes() {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int times = (Integer)playerResetCustomCache.getDailyNum(546, 0);
      WorldCupMsg.S2C_GetCoin_23006.Builder builder = WorldCupMsg.S2C_GetCoin_23006.newBuilder();
      builder.setGetCoinTime(times);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_MatchInfos_23007(WorldCupMsg.C2S_MatchInfos_23007 msg, String source) {
      this.requestMatchInfs(msg.getId());
   }

   @MsgHandlerAnno
   public void C2S_ExchangeCoin_23009(WorldCupMsg.C2S_ExchangeCoin_23009 msg, String source) {
      int count = msg.getCount();
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int hadExchangeTime = (Integer)playerResetCustomCache.getForeverNum(547, 0);
      int chipExchangeTime = ApplicationContextProvider.getConfigInt("WorldCupChipExchangeTime", 5);
      if (hadExchangeTime + count > chipExchangeTime) {
         this.player.failure(76304);
      } else {
         String chipExchange = ApplicationContextProvider.getConfigString("WorldCupChipExchange", "200:400");
         String[] split = chipExchange.split(":");
         if (this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, Integer.parseInt(split[0]) * count)) {
            playerResetCustomCache.addForever(547, count);
            int itemId = ApplicationContextProvider.getConfigInt("worldCupGuessItemId", 6991);
            this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)(Integer.parseInt(split[0]) * count), 132, 13204, 0, 0, "");
            this.player.addResource(2, itemId, Integer.parseInt(split[1]) * count, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 132, 13204, 0, 0, "");
            this.calcExchangeTime(true);
         }
      }
   }

   private void notifyExchangeCoin() {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int hadExchangeTime = (Integer)playerResetCustomCache.getForeverNum(547, 0);
      long updateTime = (Long)playerResetCustomCache.getForeverNum(548, 0L);
      WorldCupMsg.S2C_ExchangeCoin_23010.Builder builder = WorldCupMsg.S2C_ExchangeCoin_23010.newBuilder();
      builder.setTotalExchange(hadExchangeTime);
      builder.setExchangeReset(updateTime == -1L ? -1 : (int)(updateTime / 1000L));
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_TaskList_23011(WorldCupMsg.C2S_TaskList_23011 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         WorldCupTaskPart worldCupTaskPart = (WorldCupTaskPart)this.player.getMgrPart(WorldCupTaskPart.class);
         worldCupTaskPart.sendInfo();
      }
   }

   @MsgHandlerAnno
   public void C2S_TaskReward_23013(WorldCupMsg.C2S_TaskReward_23013 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         WorldCupTaskPart worldCupTaskPart = (WorldCupTaskPart)this.player.getMgrPart(WorldCupTaskPart.class);
         worldCupTaskPart.commit(msg.getTask());
      }
   }

   @MsgHandlerAnno
   public void C2S_GuessRecord_23021(WorldCupMsg.C2S_GuessRecord_23021 msg, String source) {
      this.worldCupMgr.pushTaskEx("guessRecord", new Object[]{this.player});
   }

   private void requestMatchInfs(int id) {
      this.worldCupMgr.pushTaskEx("matchInfo", new Object[]{this.player, id});
   }

   private void guessWin(WorldCupMsg.GuessInfo guessInfo) {
      int wagerNum = guessInfo.getWager();
      int upLimit = ApplicationContextProvider.getConfigInt("WorldCupQuizUpLimit", 3500);
      int downLimit = ApplicationContextProvider.getConfigInt("WorldCupQuizDownLimit", 10);
      if (wagerNum <= upLimit && wagerNum >= downLimit) {
         int itemId = ApplicationContextProvider.getConfigInt("worldCupGuessItemId", 6991);
         if (this.player.checkResourceNum(2, itemId, wagerNum)) {
            this.worldCupMgr.pushTaskEx("guess", new Object[]{this.player, guessInfo});
         }
      }
   }

   public void gmOp(String param) {
      this.logger.info("世界杯gm -> {}", param);
      String[] split = param.split(",");
      switch (split[0]) {
         case "guess":
            WorldCupMsg.GuessInfo.Builder guessInfoMsg = WorldCupMsg.GuessInfo.newBuilder();
            guessInfoMsg.setId(Integer.parseInt(split[1]));
            guessInfoMsg.setWinId(Integer.parseInt(split[2]));
            guessInfoMsg.setWager(Integer.parseInt(split[3]));
            this.guessWin(guessInfoMsg.build());
            break;
         case "insert":
            List<WorldCupMatch> matchList = new ArrayList();
            WorldCupMatch worldCupMatch = new WorldCupMatch();
            worldCupMatch.id = Integer.parseInt(split[1]);
            worldCupMatch.homeTeam = Integer.parseInt(split[2]);
            worldCupMatch.guestTeam = Integer.parseInt(split[3]);
            worldCupMatch.homeOdds = Integer.parseInt(split[4]);
            worldCupMatch.guestOdds = Integer.parseInt(split[5]);
            worldCupMatch.drawOdds = Integer.parseInt(split[6]);
            matchList.add(worldCupMatch);
            this.worldCupMgr.pushTaskEx("insertMatchInfo", new Object[]{matchList});
            break;
         case "hourreset":
            this.worldCupMgr.pushTaskEx("hourReset", new Object[]{Integer.parseInt(split[1])});
            break;
         case "result":
            List<WorldCupResult> resultList = new ArrayList();
            WorldCupResult worldCupResult = new WorldCupResult();
            worldCupResult.id = Integer.parseInt(split[1]);
            worldCupResult.result = Integer.parseInt(split[2]);
            resultList.add(worldCupResult);
            this.worldCupMgr.pushTaskEx("setMatchResult", new Object[]{resultList});
            break;
         case "reward":
            this.worldCupMgr.pushTaskEx("guessReward", new Object[0]);
            break;
         case "setstate":
            this.worldCupMgr.pushTaskEx("gmSetState", new Object[]{Integer.parseInt(split[1]), Integer.parseInt(split[2])});
            break;
         case "tasklist":
            this.C2S_TaskList_23011((WorldCupMsg.C2S_TaskList_23011)null, (String)null);
            break;
         case "taskreward":
            WorldCupMsg.C2S_TaskReward_23013.Builder msg23013 = WorldCupMsg.C2S_TaskReward_23013.newBuilder();
            msg23013.setTask(Integer.parseInt(split[1]));
            this.C2S_TaskReward_23013(msg23013.build(), (String)null);
            break;
         case "setodds":
            this.worldCupMgr.pushTaskEx("setOdds", new Object[]{Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4])});
            break;
         case "deletetask":
            TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
            taskCustomCache.delete(TaskDefine.TaskModule.MODULE_WORLD_CUP);
            break;
         case "deleteguess":
            this.worldCupMgr.pushTaskEx("gmClearGuess", new Object[]{Integer.parseInt(split[1]), Integer.parseInt(split[2])});
            break;
         case "deletematch":
            this.worldCupMgr.pushTaskEx("gmDeletematch", new Object[]{Integer.parseInt(split[1])});
      }

   }
}
