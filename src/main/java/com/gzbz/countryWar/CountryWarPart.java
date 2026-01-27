package com.gzbz.countryWar;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import cn.hutool.core.util.RandomUtil;
import com.google.protobuf.ByteString;
import com.gzbz.db.BattleDao;
import com.gzbz.db.CountryWarDao;
import com.gzbz.db.GiftDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.CountryWarDefine;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.CountryWarMapModel;
import com.gzbz.model.CountryWarScoreRewardModel;
import com.gzbz.model.CountryWarTaskModel;
import com.gzbz.model.CountryWarTurnTableRewardModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.LanguageModel;
import com.gzbz.model.QualityColorModel;
import com.gzbz.model.ShopLimitModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CountryWarMsg;
import com.gzbz.protobuf.CrossCountryWarMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.CountryWarTaskPart;
import com.gzbz.worldMgr.WorldMgr;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import misc.DateUtil;
import net.CrossSubscribeMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class CountryWarPart extends PlayerPart {
   private Logger logger = LoggerFactory.getLogger(this.getClass());
   @Autowired
   CountryWarMgr countryWarMgr;
   @Autowired
   ConfigManager configManager;
   @Autowired
   WorldMgr worldMgr;
   @Autowired
   private CrossNettyClient crossNettyClient;

   public void loginHandle() {
      super.loginHandle();
      if (this.isEnableCountryWar()) {
         CrossCountryWarMsg.S2CR_PlayerLoginIn_11473.Builder builder = CrossCountryWarMsg.S2CR_PlayerLoginIn_11473.newBuilder();
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }

   public void logoutHandle() {
      super.logoutHandle();
      if (this.isEnableCountryWar()) {
         this.countryWarMgr.pushTask(() -> {
            CrossCountryWarMsg.S2CR_PlayerLoginOut_11475.Builder builder = CrossCountryWarMsg.S2CR_PlayerLoginOut_11475.newBuilder();
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
         });
      }

   }

   @MsgHandlerAnno
   public void C2S_CountryWarState_11307(CountryWarMsg.C2S_CountryWarState_11307 msg, String source) {
      int state = this.countryWarMgr.getState();
      this.sendActivityState(this.getCountryWarDao(), state);
   }

   public void sendActivityState(CountryWarDao countryWarDao, int state) {
      if (state == 1 && countryWarDao == null) {
         CountryWarMsg.S2C_CountryWarState_11308.Builder builder = CountryWarMsg.S2C_CountryWarState_11308.newBuilder();
         builder.setActivityState(CountryWarMsg.AcitvityState.forNumber(state));
         Timestamp timestamp = new Timestamp(this.worldMgr.getOpenServerTime());
         builder.setIsCompletedTask(true);
         builder.setOpenDays(DateUtil.difftimeDay(timestamp) + 1);
         this.player.sendMsg(builder.build());
      } else if (state == 1 && countryWarDao != null) {
         PlayerDao playerDao = this.player.getPlayerDao();
         this.countryWarMgr.pushTask(() -> {
            CrossCountryWarMsg.S2CR_CountryWarState_11407.Builder builder = CrossCountryWarMsg.S2CR_CountryWarState_11407.newBuilder();
            long currentTime = System.currentTimeMillis();
            builder.setActivityState(state);
            builder.setAttToken(playerDao.att_token);
            builder.setAttNextTokenTime(this.getAttNextTokenTime(countryWarDao, currentTime));
            builder.setMoveToken(playerDao.move_token);
            builder.setMoveNextTokenTime(this.getMoveNextTokenTime(countryWarDao, currentTime));
            builder.setIsCompletedTask(this.isCompletedTask());
            builder.setIsSocreReward(this.isSocreReward(countryWarDao));
            Timestamp timestamp = new Timestamp(this.worldMgr.getOpenServerTime());
            builder.setOpenDays(DateUtil.difftimeDay(timestamp) + 1);
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
         });
      } else {
         CountryWarMsg.S2C_CountryWarState_11308.Builder builder = CountryWarMsg.S2C_CountryWarState_11308.newBuilder();
         builder.setActivityState(CountryWarMsg.AcitvityState.forNumber(state));
         Timestamp timestamp = new Timestamp(this.worldMgr.getOpenServerTime());
         builder.setOpenDays(DateUtil.difftimeDay(timestamp) + 1);
         this.player.sendMsg(builder.build());
      }
   }

   public boolean isCompletedTask() {
      if (this.countryWarMgr.getState() != 1) {
         return false;
      } else {
         CountryWarTaskPart countryWarTaskPart = (CountryWarTaskPart)this.player.getMgrPart(CountryWarTaskPart.class);
         Map<Integer, TaskData> map = countryWarTaskPart.getTasksMap();
         if (map != null && !map.isEmpty()) {
            TreeMap<Integer, List<TaskData>> flagMap = new TreeMap();
            boolean isHaveComplete = false;

            for(Map.Entry<Integer, TaskData> entry : map.entrySet()) {
               CountryWarTaskModel countryWarTaskModel = (CountryWarTaskModel)this.player.getGameModelPool().getEntity("countryWarTask", ((TaskData)entry.getValue()).id);
               if (countryWarTaskModel != null) {
                  switch (countryWarTaskModel.getType()) {
                     case 1:
                     case 2:
                     case 3:
                        if (((TaskData)entry.getValue()).state == 2) {
                           return true;
                        }
                        break;
                     case 4:
                        if (flagMap.containsKey(countryWarTaskModel.getSubType())) {
                           ((List)flagMap.get(countryWarTaskModel.getSubType())).add(entry.getValue());
                        } else {
                           List<TaskData> tempList = new ArrayList();
                           tempList.add(entry.getValue());
                           flagMap.put(countryWarTaskModel.getSubType(), tempList);
                        }

                        if (((TaskData)entry.getValue()).state == 2) {
                           isHaveComplete = true;
                        }
                  }
               }
            }

            if (isHaveComplete) {
               for(Map.Entry<Integer, List<TaskData>> entry : flagMap.entrySet()) {
                  boolean isHaveDoingTask = false;

                  for(TaskData taskData : (List)entry.getValue()) {
                     if (taskData.state == 2) {
                        return true;
                     }

                     if (taskData.state == 1) {
                        isHaveDoingTask = true;
                     }
                  }

                  if (isHaveDoingTask) {
                     return false;
                  }
               }
            }

            return false;
         } else {
            return false;
         }
      }
   }

   public boolean isSocreReward(CountryWarDao countryWarDao) {
      if (countryWarDao == null) {
         return false;
      } else {
         CountryWarScoreRewardModel maxModel = this.getMaxEnableTakeRewardModel(countryWarDao);
         if (maxModel == null) {
            return false;
         } else if (!countryWarDao.takedRewards.contains(maxModel.getLv())) {
            return true;
         } else {
            return this.isSeniorAward() && !countryWarDao.takedSeniorRewards.contains(maxModel.getLv());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_MainUi_11301(CountryWarMsg.C2S_MainUi_11301 msg, String source) {
      this.player.uploadCrossPlayer();
      this.C2S_MainUi_11301();
   }

   public void C2S_MainUi_11301() {
      if (!this.player.isSystemOpen(2020)) {
         this.logger.info("【国战】国战没有达到系统要求等级，玩家等级={}", this.player.getPlayerDao().lv);
         this.player.failure(55011);
      } else if (this.countryWarMgr.getState() == 0) {
         this.player.failure(55012);
      } else if (this.countryWarMgr.getActivityId() == 0) {
         this.logger.info("【国战】跨服没有链接,活动ID={}", this.countryWarMgr.getActivityId());
      } else {
         CountryWarDao countryWarDao = this.getCountryWarDao();
         if (countryWarDao == null && this.countryWarMgr.getState() == 1) {
            countryWarDao = this.addCountryWarDao();
         }

         if (this.countryWarMgr.getState() == 1 && countryWarDao != null && countryWarDao.activityId != this.countryWarMgr.getActivityId()) {
            this.logger.info("活动开启，,玩家{}的活动ID和游戏服的活动ID不同，重新设置玩家数据，玩家活动ID={}，服务器活动ID={}", countryWarDao.activityId, this.countryWarMgr.getActivityId());
            this.resetCountryDao(countryWarDao);
         }

         ArrayingMirror arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
         boolean allowTransfer = countryWarDao == null ? true : countryWarDao.allowTransfer;
         if (countryWarDao != null) {
            boolean isCompletedTask = this.isCompletedTask();
            long currentTime = System.currentTimeMillis();
            int attToken = this.player.getPlayerDao().att_token;
            int moveToken = this.player.getPlayerDao().move_token;
            int attNextTokenTime = this.getAttNextTokenTime(countryWarDao, currentTime);
            int moveNextTokenTime = this.getMoveNextTokenTime(countryWarDao, currentTime);
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            int transferNum = (Integer)playerResetCustomCache.getForeverNum(501, 0);
            int buyLimit = (Integer)playerResetCustomCache.getDailyNum(47, 0);
            Boolean sameUnionTransfer = countryWarDao.sameUnionTransfer;
            this.countryWarMgr.pushTask(() -> {
               this.countryWarMgr.addOnActivityPlayerId(this.player.getPlayerId());
               CrossCountryWarMsg.S2CR_MainUi_11401.Builder builder = CrossCountryWarMsg.S2CR_MainUi_11401.newBuilder();
               builder.setIsCompletedTask(isCompletedTask);
               builder.setAttToken(attToken);
               builder.setAttNextTokenTime(attNextTokenTime);
               builder.setMoveToken(moveToken);
               builder.setMoveNextTokenTime(moveNextTokenTime);
               builder.setHeroArrayingData(ByteString.copyFrom(arrayingMirror.toByteArray()));
               builder.setTransferNum(transferNum);
               builder.setAllowTransfer(allowTransfer);
               builder.setSameUnionTransfer(sameUnionTransfer);
               builder.setBuyNum(buyLimit);
               this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
            });
         } else {
            this.countryWarMgr.pushTask(() -> {
               this.countryWarMgr.addOnActivityPlayerId(this.player.getPlayerId());
               CrossCountryWarMsg.S2CR_MainUi_11401.Builder builder = CrossCountryWarMsg.S2CR_MainUi_11401.newBuilder();
               builder.setIsCompletedTask(false);
               builder.setAttToken(0);
               builder.setAttNextTokenTime(0);
               builder.setMoveToken(0);
               builder.setMoveNextTokenTime(0);
               builder.setHeroArrayingData(ByteString.copyFrom(arrayingMirror.toByteArray()));
               builder.setTransferNum(0);
               builder.setAllowTransfer(true);
               builder.setSameUnionTransfer(true);
               builder.setBuyNum(0);
               this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
            });
         }

      }
   }

   @MsgHandlerAnno
   public void C2S_UpdateToken_11313(CountryWarMsg.C2S_UpdateToken_11313 msg, String source) {
      CountryWarDao countryWarDao = this.getCountryWarDao();
      if (countryWarDao != null) {
         this.S2C_UpdateToken_11314(countryWarDao);
      }
   }

   public void S2C_UpdateToken_11314(CountryWarDao countryWarDao) {
      long currentTime = System.currentTimeMillis();
      CountryWarMsg.S2C_UpdateToken_11314.Builder builder = CountryWarMsg.S2C_UpdateToken_11314.newBuilder();
      builder.setAttNextTokenTime(this.getAttNextTokenTime(countryWarDao, currentTime));
      builder.setMoveNextTokenTime(this.getMoveNextTokenTime(countryWarDao, currentTime));
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_LeaveActivity_11303(CountryWarMsg.C2S_LeaveActivity_11303 msg, String source) {
      this.countryWarMgr.pushTask(() -> this.countryWarMgr.removeOnActivityPlayerId(this.player.getPlayerId()));
   }

   @MsgHandlerAnno
   public void C2S_Move_11331(CountryWarMsg.C2S_Move_11331 msg, String source) {
      this.logger.info("【国战】玩家要迁移到目标城市={}", msg.getCityId());
      this.player.uploadCrossPlayer();
      this.moveToCity(msg.getCityId());
   }

   public void moveToCity(int cityId) {
      CountryWarDao countryWarDao = this.getCountryWarDao();
      if (countryWarDao != null) {
         CrossCountryWarMsg.S2CR_MoveToCity_11431.Builder builder = CrossCountryWarMsg.S2CR_MoveToCity_11431.newBuilder();
         builder.setCityId(cityId);
         builder.setMoveToken(this.player.getPlayerDao().move_token);
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   @MsgHandlerAnno
   public void CR2S_MoveToCity_11432(CrossCountryWarMsg.CR2S_MoveToCity_11432 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.moveResult(msg);
   }

   public void moveResult(CrossCountryWarMsg.CR2S_MoveToCity_11432 msg) {
      int result = msg.getResult();
      boolean isNeedMoveToken = msg.getIsNeedMoveToken();
      CountryWarMsg.S2C_Move_11332.Builder builder = CountryWarMsg.S2C_Move_11332.newBuilder();
      builder.setResult(result);
      if (result == 1) {
         CountryWarDao countryWarDao = this.getCountryWarDao();
         long currentTime = System.currentTimeMillis();
         if (isNeedMoveToken) {
            int maxMoveToken = this.configManager.getIntDefault("countryWarMaxMoveToken", 10);
            if (this.player.getPlayerDao().move_token >= maxMoveToken) {
               countryWarDao.moveTokenTime = currentTime;
            }

            this.player.delResource(1, PlayerDefine.PLAYER_COUNTRY_MOVE_TOKEN, 1L, 50, 5005, 0, 0, "");
            countryWarDao.updateOp();
         }

         builder.setMoveNextTokenTime(this.getMoveNextTokenTime(countryWarDao, currentTime));
         this.player.getOperationMgr().addExtraLog(this.player, 207, this.player.getPublicDao().vip_lv + "", "国战迁移", "1");
      }

      this.player.sendMsg(builder.build());
   }

   public void fightToCity(int cityId, boolean isSkip) {
      CountryWarDao countryWarDao = this.getCountryWarDao();
      if (countryWarDao != null) {
         if (this.player.getPlayerDao().att_token < 1) {
            this.logger.info("【国战】进攻令不够，上一次领取时间={}", DateUtil.transferLongToDate(countryWarDao.attTokenTime));
         } else {
            ArrayingMirror arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
            CrossCountryWarMsg.S2CR_FihtToCity_11433.Builder builder = CrossCountryWarMsg.S2CR_FihtToCity_11433.newBuilder();
            builder.setCityId(cityId);
            builder.setHeroArrayingData(ByteString.copyFrom(arrayingMirror.toByteArray()));
            builder.setIsSkip(isSkip);
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
         }
      }
   }

   public int enterBattle(BattleDao battleDao) {
      this.fightToCity(battleDao.modelId, battleDao.isSkip);
      return 1;
   }

   public void afterFight() {
      this.logger.info("【国战】afterFight");
   }

   public void endBattle(BattleDao battleDao) {
      this.logger.info("【国战】endBattle");
   }

   @MsgHandlerAnno
   public void CR2S_FihtToCity_11434(CrossCountryWarMsg.CR2S_FihtToCity_11434 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.fightResult(msg);
   }

   public void fightResult(CrossCountryWarMsg.CR2S_FihtToCity_11434 msg) {
      int result = msg.getOptionalResult();
      List<ResourceModel> resourceModels = new ArrayList();
      CountryWarMsg.S2C_FihtToCity_11334.Builder builder = CountryWarMsg.S2C_FihtToCity_11334.newBuilder();
      builder.setResult(result);
      if (result == 1) {
         int maxAttToken = this.configManager.getIntDefault("countryWarMaxAttToken", 20);
         CountryWarDao countryWarDao = this.getCountryWarDao();
         long currentTime = System.currentTimeMillis();
         if (this.player.getPlayerDao().att_token >= maxAttToken) {
            countryWarDao.attTokenTime = currentTime;
         }

         this.player.delResource(1, PlayerDefine.PLAYER_COUNTRY_ATT_TOKEN, 1L, 50, 5004, 0, 0, "");
         countryWarDao.updateOp();
         builder.setAttToken(this.player.getPlayerDao().att_token);
         builder.setAttNextTokenTime(this.getAttNextTokenTime(countryWarDao, currentTime));
         builder.setIsOccypy(msg.getIsOccypy());
         builder.setIsFight(msg.getIsFight());
         if (msg.getIsFight()) {
            builder.setIsWin(msg.getIsWin());
            int military;
            if (msg.getIsWin()) {
               military = this.configManager.getIntDefault("countryWarAttSuccessMilitary", 0);
            } else {
               military = this.configManager.getIntDefault("countryWarAttFailMilitary", 0);
            }

            resourceModels.add(new ResourceModel(1, PlayerDefine.PLAYER_MILITARY, military));
         }

         if (msg.getIsOccypy()) {
            this.player.triggerTask(534, 0, 1L, 1);
         }

         if (msg.getIsFight() & msg.getIsWin()) {
            this.player.triggerTask(535, 0, 1L, 1);
         }

         this.player.getOperationMgr().addExtraLog(this.player, 207, this.player.getPublicDao().vip_lv + "", "国战进攻", "1");
      }

      this.player.sendMsg(builder.build());
      Map<Integer, BattleDao> battleDaoMap = this.player.<Integer, BattleDao>getMap("tb_battle", this.player.getPlayerId());
      BattleDao battleDao = (BattleDao)battleDaoMap.get(2020);
      if (battleDao != null) {
         battleDao.rewards.addAll(resourceModels);
         battleDao.status = 0;
         battleDao.updateOp();
      }

      this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 50, 5004, 0, 0, "");
   }

   @MsgHandlerAnno
   public void CR2S_DefSuccess_11438(CrossCountryWarMsg.CR2S_DefSuccess_11438 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.player.triggerTask(536, 0, 1L, 1);
   }

   @MsgHandlerAnno
   public void C2S_TransferList_11337(CountryWarMsg.C2S_TransferList_11337 msg, String source) {
      CrossCountryWarMsg.S2CR_TransferList_11437.Builder builder = CrossCountryWarMsg.S2CR_TransferList_11437.newBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_TransferToCity_11335(CountryWarMsg.C2S_TransferToCity_11335 msg, String source) {
      int cityId = msg.getCityId();
      int transferPlayerId = msg.getTransferPlayerId();
      GamePlayer transferPlayer = this.worldMgr.getPlayerById(transferPlayerId);
      if (transferPlayer == null) {
         this.logger.info("【国战】调动的玩家不是本服的玩家，ID={}", transferPlayer);
      } else {
         int maxTransferNum = this.configManager.getIntDefault("countryWarMaxTransferNum", 0);
         if (maxTransferNum > 0) {
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            int transferNum = (Integer)playerResetCustomCache.getForeverNum(501, 0);
            if (transferNum >= maxTransferNum) {
               this.logger.info("玩家{}已经没有没有调遣次数，最大次数={}，当前使用={}", new Object[]{this.player.getPlayerId(), maxTransferNum, transferNum});
               return;
            }
         }

         CrossCountryWarMsg.S2CR_TransferToCity_11435.Builder builder = CrossCountryWarMsg.S2CR_TransferToCity_11435.newBuilder();
         builder.setCityId(cityId);
         builder.setTransferPlayerId(transferPlayerId);
         builder.setAttToken(this.player.getPlayerDao().att_token);
         builder.setMoveToken(this.player.getPlayerDao().move_token);
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   @MsgHandlerAnno
   public void CR2S_TransferToCity_11436(CrossCountryWarMsg.CR2S_TransferToCity_11436 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.transferResult(msg);
   }

   public void transferResult(CrossCountryWarMsg.CR2S_TransferToCity_11436 msg) {
      int result = msg.getResult();
      CommonMsg.ItemInfo token = msg.getConsumeToken();
      CountryWarMsg.S2C_TransferToCity_11336.Builder builder = CountryWarMsg.S2C_TransferToCity_11336.newBuilder();
      builder.setResult(result);
      if (result == 1) {
         if (msg.getInfo().getType() > 0) {
            builder.setInfo(msg.getInfo());
         }

         builder.setIsBreakDefense(msg.getIsBreakDefense());
         if (token.getId() == PlayerDefine.PLAYER_COUNTRY_ATT_TOKEN) {
            int maxAttToken = this.configManager.getIntDefault("countryWarMaxAttToken", 20);
            CountryWarDao countryWarDao = this.getCountryWarDao();
            long currentTime = System.currentTimeMillis();
            int cuttentAttToken = this.player.getPlayerDao().att_token;
            if (cuttentAttToken >= maxAttToken) {
               countryWarDao.attTokenTime = currentTime;
            }

            this.player.delResource(1, PlayerDefine.PLAYER_COUNTRY_ATT_TOKEN, (long)token.getNum(), 50, 5006, 0, 0, "");
            countryWarDao.updateOp();
            builder.setAttNextTokenTime(this.getAttNextTokenTime(countryWarDao, currentTime));
            if (msg.getIsOccypy()) {
               this.player.triggerTask(534, 0, 1L, 1);
            }

            if (msg.getIsFight() & msg.getIsWin()) {
               this.player.triggerTask(535, 0, 1L, 1);
            }
         } else if (token.getId() == PlayerDefine.PLAYER_COUNTRY_MOVE_TOKEN) {
            int maxMoveToken = this.configManager.getIntDefault("countryWarMaxMoveToken", 10);
            CountryWarDao countryWarDao = this.getCountryWarDao();
            long currentTime = System.currentTimeMillis();
            int cuttentMoverToken = this.player.getPlayerDao().move_token;
            if (cuttentMoverToken >= maxMoveToken) {
               countryWarDao.moveTokenTime = currentTime;
            }

            this.player.delResource(1, PlayerDefine.PLAYER_COUNTRY_MOVE_TOKEN, (long)token.getNum(), 50, 5006, 0, 0, "");
            countryWarDao.updateOp();
            builder.setMoveNextTokenTime(this.getMoveNextTokenTime(countryWarDao, currentTime));
            this.player.getOperationMgr().addExtraLog(this.player, 207, this.player.getPublicDao().vip_lv + "", "国战调遣", "1");
         }

         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         int transferNum = (Integer)playerResetCustomCache.getForeverNum(501, 0);
         playerResetCustomCache.addDailyReset(501, 1);
         builder.setTransferNum(transferNum + 1);
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_CountryWarRank_11309(CountryWarMsg.C2S_CountryWarRank_11309 msg, String source) {
      int type = msg.getType();
      if (type != 1 && type != 2 && type != 3 && type != 4) {
         this.logger.info("【国战】排行榜请求类型错误={}", type);
      } else {
         CrossCountryWarMsg.S2CR_CountryWarRank_11409.Builder builder = CrossCountryWarMsg.S2CR_CountryWarRank_11409.newBuilder();
         builder.setType(type);
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_CountryLog_11311(CountryWarMsg.C2S_CountryLog_11311 msg, String source) {
      int type = msg.getType();
      if (type == 1 || type == 2) {
         CrossCountryWarMsg.S2CR_CountryLog_11411.Builder builder = CrossCountryWarMsg.S2CR_CountryLog_11411.newBuilder();
         builder.setType(type);
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_TakeCityReward_11341(CountryWarMsg.C2S_TakeCityReward_11341 msg, String source) {
      CrossCountryWarMsg.S2CR_TakeCityReward_11441.Builder builder = CrossCountryWarMsg.S2CR_TakeCityReward_11441.newBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void CR2S_TakeCityReward_11442(CrossCountryWarMsg.CR2S_TakeCityReward_11442 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.takeCityRewardResult(msg);
   }

   public void takeCityRewardResult(CrossCountryWarMsg.CR2S_TakeCityReward_11442 msg) {
      if (msg.getResult() == 1) {
         List<ResourceModel> rewards = new ArrayList();

         for(CommonMsg.ItemInfo itemInfo : msg.getItemsList()) {
            rewards.add(new ResourceModel(itemInfo.getType(), itemInfo.getId(), itemInfo.getNum()));
         }

         this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 50, 5001, 0, 0, "");
      }

      CountryWarMsg.S2C_TakeCityReward_11342.Builder builder = CountryWarMsg.S2C_TakeCityReward_11342.newBuilder();
      builder.setResult(msg.getResult());
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_OpenScoreRewardUi_11343(CountryWarMsg.C2S_OpenScoreRewardUi_11343 msg, String source) {
      CountryWarDao countryWarDao = this.getCountryWarDao();
      if (countryWarDao == null) {
         CountryWarMsg.S2C_OpenScoreRewardUi_11344.Builder builder = CountryWarMsg.S2C_OpenScoreRewardUi_11344.newBuilder();
         builder.setScore(0);
         this.player.sendMsg(builder.build());
      } else {
         CountryWarMsg.S2C_OpenScoreRewardUi_11344.Builder builder = CountryWarMsg.S2C_OpenScoreRewardUi_11344.newBuilder();
         builder.setScore(this.player.getPlayerDao().country_war_score);
         builder.addAllTakedAwards(countryWarDao.takedRewards);
         builder.addAllTakedSeniorAwards(countryWarDao.takedSeniorRewards);
         CountryWarTaskPart countryWarTaskPart = (CountryWarTaskPart)this.player.getMgrPart(CountryWarTaskPart.class);
         countryWarTaskPart.getTasksMap();
         CountryWarMsg.TaskGroup.Builder dailyTasks = CountryWarMsg.TaskGroup.newBuilder();
         dailyTasks.setGroup(1);
         dailyTasks.setEndTime(countryWarDao.dailyEndTime);
         CountryWarMsg.TaskGroup.Builder fiveTasks = CountryWarMsg.TaskGroup.newBuilder();
         fiveTasks.setGroup(2);
         fiveTasks.setEndTime(countryWarDao.fiveEndTime);
         CountryWarMsg.TaskGroup.Builder seasonTasks = CountryWarMsg.TaskGroup.newBuilder();
         seasonTasks.setGroup(3);
         seasonTasks.setEndTime(countryWarDao.seasonEndTime);

         for(Map.Entry<Integer, TaskData> entry : countryWarTaskPart.getTasksMap().entrySet()) {
            CountryWarTaskModel countryWarTaskModel = (CountryWarTaskModel)this.player.getGameModelPool().getEntity("countryWarTask", ((TaskData)entry.getValue()).id);
            switch (countryWarTaskModel.getType()) {
               case 1:
                  dailyTasks.addTasks(((TaskData)entry.getValue()).toBuilder());
                  break;
               case 2:
                  fiveTasks.addTasks(((TaskData)entry.getValue()).toBuilder());
                  break;
               case 3:
                  seasonTasks.addTasks(((TaskData)entry.getValue()).toBuilder());
            }
         }

         builder.addGroup(dailyTasks);
         builder.addGroup(fiveTasks);
         builder.addGroup(seasonTasks);
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_TakeScoreTask_11345(CountryWarMsg.C2S_TakeScoreTask_11345 msg, String source) {
      CountryWarDao countryWarDao = this.getCountryWarDao();
      if (countryWarDao != null) {
         if (this.countryWarMgr.isActivityStart()) {
            List<ResourceModel> totalResourceModels = new ArrayList();
            int maxRewardLv = this.getMaxEnableTakeRewardLv(countryWarDao);
            boolean isEnableTakeSeniorReward = this.isSeniorAward();
            Map<Integer, CountryWarScoreRewardModel> allRewards = this.player.getGameModelPool().getMap("countryWarScoreReward");

            for(Map.Entry<Integer, CountryWarScoreRewardModel> entry : allRewards.entrySet()) {
               if (maxRewardLv >= (Integer)entry.getKey()) {
                  if (!countryWarDao.takedRewards.contains(entry.getKey())) {
                     countryWarDao.takedRewards.add(entry.getKey());
                     countryWarDao.updateOp();

                     for(ResourceModel reward : ((CountryWarScoreRewardModel)entry.getValue()).getRewards()) {
                        totalResourceModels.add(new ResourceModel(reward.getType(), reward.getId(), reward.getValue()));
                     }

                     this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "国战", "积分奖励-" + ((CountryWarScoreRewardModel)entry.getValue()).getLv(), "积分奖励-" + ((CountryWarScoreRewardModel)entry.getValue()).getLv(), 0, 0, 0);
                  }

                  if (isEnableTakeSeniorReward && !countryWarDao.takedSeniorRewards.contains(entry.getKey())) {
                     countryWarDao.takedSeniorRewards.add(entry.getKey());
                     countryWarDao.updateOp();

                     for(ResourceModel lockReward : ((CountryWarScoreRewardModel)entry.getValue()).getLockRewards()) {
                        totalResourceModels.add(new ResourceModel(lockReward.getType(), lockReward.getId(), lockReward.getValue()));
                     }
                  }
               }
            }

            if (!totalResourceModels.isEmpty()) {
               this.player.addResource(totalResourceModels, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 50, 5002, 0, 0, "");
            }

            CountryWarMsg.S2C_TakeScoreTask_11346.Builder builder = CountryWarMsg.S2C_TakeScoreTask_11346.newBuilder();
            builder.addAllTakedAwards(countryWarDao.takedRewards);
            builder.addAllTakedSeniorAwards(countryWarDao.takedSeniorRewards);
            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_OpenFlagTaskUi_11347(CountryWarMsg.C2S_OpenFlagTaskUi_11347 msg, String source) {
      CountryWarTaskPart countryWarTaskPart = (CountryWarTaskPart)this.player.getMgrPart(CountryWarTaskPart.class);
      countryWarTaskPart.getTasksMap();
      CountryWarDao countryWarDao = this.getCountryWarDao();
      if (countryWarDao != null) {
         CountryWarMsg.S2C_OpenFlagTaskUi_11348.Builder builder = CountryWarMsg.S2C_OpenFlagTaskUi_11348.newBuilder();
         builder.setType(4);
         builder.setIsTaked(countryWarDao.isTaked);

         for(Map.Entry<Integer, TaskData> entry : countryWarTaskPart.getTasksMap().entrySet()) {
            CountryWarTaskModel countryWarTaskModel = (CountryWarTaskModel)this.player.getGameModelPool().getEntity("countryWarTask", ((TaskData)entry.getValue()).id);
            if (countryWarTaskModel.getType() == 4) {
               builder.addTasks(((TaskData)entry.getValue()).toBuilder());
            }
         }

         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_TakeTask_11349(CountryWarMsg.C2S_TakeTask_11349 msg, String source) {
      if (this.countryWarMgr.isActivityStart()) {
         CountryWarTaskPart countryWarTaskPart = (CountryWarTaskPart)this.player.getMgrPart(CountryWarTaskPart.class);
         countryWarTaskPart.commit(msg.getTaskId());
      }
   }

   @MsgHandlerAnno
   public void C2S_OpenTurnTableUi_11361(CountryWarMsg.C2S_OpenTurnTableUi_11361 msg, String source) {
      if (!this.player.isSystemOpen(2020)) {
         this.logger.info("【国战】国战没有达到系统要求等级，玩家等级={}", this.player.getPlayerDao().lv);
      } else {
         CrossCountryWarMsg.S2CR_OpenTurnTableUi_11461.Builder builder = CrossCountryWarMsg.S2CR_OpenTurnTableUi_11461.newBuilder();
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   @MsgHandlerAnno
   public void CR2S_OpenTurnTableUi_11462(CrossCountryWarMsg.CR2S_OpenTurnTableUi_11462 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.openTurnTableUi(msg);
   }

   public void openTurnTableUi(CrossCountryWarMsg.CR2S_OpenTurnTableUi_11462 msg) {
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      int itemId = this.configManager.getIntDefault("countryWarLuckDrawItem", 1015);
      itemBagPart.getItemNum(itemId);
      CountryWarMsg.S2C_OpenTurnTableUi_11362.Builder builder = CountryWarMsg.S2C_OpenTurnTableUi_11362.newBuilder();
      Map<Integer, CountryWarTurnTableRewardModel> map = this.player.getGameModelPool().getMap("countryWarTurnTableReward");

      for(Map.Entry<Integer, CountryWarTurnTableRewardModel> entry : map.entrySet()) {
         CommonMsg.TurnTableGridInfo.Builder gridBuilder = CommonMsg.TurnTableGridInfo.newBuilder();
         gridBuilder.setPos((Integer)entry.getKey());
         gridBuilder.setReward(((ResourceModel)((CountryWarTurnTableRewardModel)entry.getValue()).getGirdReward().get(0)).builder());
         builder.addInfos(gridBuilder);
      }

      builder.addAllRecord(msg.getRecordsList());
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_LuckDraw_11363(CountryWarMsg.C2S_LuckDraw_11363 msg, String source) {
      int type = msg.getType();
      if (type < CountryWarDefine.TURNTABLE_NUM.length && type >= 0) {
         int itemId = this.configManager.getIntDefault("countryWarLuckDrawItem", 1015);
         int num = CountryWarDefine.TURNTABLE_NUM[type];
         ResourceModel needItem = new ResourceModel(2, itemId, num);
         if (!this.player.checkResourceNum(needItem)) {
            this.logger.info("【国战】抽奖材料不够");
         } else {
            this.player.delResource(needItem, 50, 5003, 0, 0, "");
            Map<Integer, CountryWarTurnTableRewardModel> map = this.player.getGameModelPool().getMap("countryWarTurnTableReward");
            LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "countryWarTurnTableRecord");
            List<Integer> posList = new ArrayList();
            PlayerDao playerDao = this.player.getPlayerDao();
            List<ResourceModel> rewardList = new ArrayList();
            List<String> recordList = new ArrayList();
            int size = map.size();

            for(int i = 0; i < num; ++i) {
               int index = this.getTurnTableReward();
               if (index >= 0) {
                  posList.add(index);
                  ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", ((ResourceModel)((CountryWarTurnTableRewardModel)map.get(index)).getGirdReward().get(0)).getId());
                  rewardList.add(new ResourceModel(2, itemModel.getId(), ((ResourceModel)((CountryWarTurnTableRewardModel)map.get(index)).getGirdReward().get(0)).getValue()));
                  String itemStr = itemModel.getName() + "*" + ((ResourceModel)((CountryWarTurnTableRewardModel)map.get(index)).getGirdReward().get(0)).getValue();
                  QualityColorModel qualityColorModel = (QualityColorModel)this.player.getGameModelPool().getEntity("qualityColor", Integer.valueOf(itemModel.getQuality()));
                  String format = MessageFormat.format(languageModel.getValue(), playerDao.playerName, qualityColorModel.getColor(), itemStr);
                  recordList.add(format);
               }
            }

            CrossCountryWarMsg.S2CR_LuckDrawRecord_11463.Builder crossBuilder = CrossCountryWarMsg.S2CR_LuckDrawRecord_11463.newBuilder();
            crossBuilder.addAllRecord(recordList);
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), crossBuilder.build());
            this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 50, 5003, type, 0, "LuckDraw");
            CountryWarMsg.S2C_LuckDraw_11364.Builder builder = CountryWarMsg.S2C_LuckDraw_11364.newBuilder();
            builder.setType(msg.getType());
            builder.addAllIndex(posList);

            for(ResourceModel resourceModel : rewardList) {
               builder.addItemInfos(resourceModel.builder());
            }

            this.player.sendMsg(builder.build());
         }
      } else {
         this.logger.info("【国战】抽奖type错误，type={}", type);
      }
   }

   private int getTurnTableReward() {
      Map<Integer, CountryWarTurnTableRewardModel> map = this.player.getGameModelPool().getMap("countryWarTurnTableReward");
      int totalWeight = 0;

      for(Map.Entry<Integer, CountryWarTurnTableRewardModel> entry : map.entrySet()) {
         totalWeight += ((CountryWarTurnTableRewardModel)entry.getValue()).getWeight();
      }

      int random = RandomUtil.randomInt(totalWeight);
      int tempLoop = 0;

      for(Map.Entry<Integer, CountryWarTurnTableRewardModel> entry : map.entrySet()) {
         tempLoop += ((CountryWarTurnTableRewardModel)entry.getValue()).getWeight();
         if (tempLoop > random) {
            return (Integer)entry.getKey();
         }
      }

      return -1;
   }

   @MsgHandlerAnno
   public void C2S_BuyItem_11367(CountryWarMsg.C2S_BuyItem_11367 msg, String source) {
      int shopId = msg.getShopId();
      if (shopId != 19) {
         this.logger.info("打开的不是国战城池商店，shopId={}", shopId);
      } else {
         CrossCountryWarMsg.S2CR_BuyItem_11467.Builder builder = CrossCountryWarMsg.S2CR_BuyItem_11467.newBuilder();
         builder.setId(msg.getId());
         builder.setNum(msg.getNum());
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   public void updateTask(List<TaskData> taskDataList) {
      CountryWarMsg.S2C_UpdateTask_11350.Builder builder = CountryWarMsg.S2C_UpdateTask_11350.newBuilder();

      for(TaskData taskData : taskDataList) {
         builder.addTasks(taskData.toBuilder());
      }

      this.player.sendMsg(builder.build());
   }

   public void takeSuccess(int taskId) {
      TaskData taskData = this.player.getTask(TaskDefine.TaskModule.MODULE_COUNTRY_WAR, taskId);
      if (taskData == null) {
         this.logger.info("任务不存在,任务ID={}", taskData);
      } else {
         CountryWarTaskModel countryWarTaskModel = (CountryWarTaskModel)this.player.getGameModelPool().getEntity("countryWarTask", taskId);
         if (countryWarTaskModel.getType() != 4) {
            this.player.addResource(1, PlayerDefine.PLAYER_COUNTRY_WAR_SCORE, countryWarTaskModel.getScore(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 50, 5002, taskId, taskId, "");
         }

         CountryWarMsg.S2C_UpdateTask_11350.Builder builder = CountryWarMsg.S2C_UpdateTask_11350.newBuilder();
         builder.addTasks(taskData.toBuilder());
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_TakeWarFlag_11353(CountryWarMsg.C2S_TakeWarFlag_11353 msg, String source) {
      CountryWarDao countryWarDao = (CountryWarDao)this.player.getDataNoInsert("tb_country_war", this.player.getPlayerId());
      if (countryWarDao != null) {
         this.takeWarFlagTaskReward(countryWarDao);
      }

   }

   public void takeWarFlagTaskReward(CountryWarDao countryWarDao) {
      if (!countryWarDao.isTaked) {
         List<CountryWarTaskModel> taskList = (List)this.player.getGameModelPool().getEntity("customCountryWarTask", 4);
         if (taskList != null && !taskList.isEmpty()) {
            CountryWarTaskPart countryWarTaskPart = (CountryWarTaskPart)this.player.getMgrPart(CountryWarTaskPart.class);

            for(CountryWarTaskModel countryWarTaskModel : taskList) {
               TaskData taskData = countryWarTaskPart.getTask(countryWarTaskModel.getId());
               if (taskData == null) {
                  return;
               }

               if (taskData.state != 2 && taskData.state != 3) {
                  return;
               }
            }

            CountryWarMapModel countryWarMapModel = (CountryWarMapModel)this.player.getGameModelPool().getEntity("countryWarMap", this.countryWarMgr.getMapId());
            if (countryWarMapModel != null) {
               this.player.addResource(2, countryWarMapModel.getWarFlagReward(), 1, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 50, 5011, 0, 0, "");
               countryWarDao.isTaked = true;
               countryWarDao.updateOp();
               CountryWarMsg.S2C_TakeWarFlag_11354.Builder builder = CountryWarMsg.S2C_TakeWarFlag_11354.newBuilder();
               builder.setResult(1);
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   public int getMaxEnableTakeRewardLv(CountryWarDao countryWarDao) {
      CountryWarScoreRewardModel countryWarScoreRewardModel = this.getMaxEnableTakeRewardModel(countryWarDao);
      return countryWarScoreRewardModel == null ? 0 : countryWarScoreRewardModel.getLv();
   }

   public CountryWarScoreRewardModel getMaxEnableTakeRewardModel(CountryWarDao countryWarDao) {
      Map<Integer, CountryWarScoreRewardModel> map = this.player.getGameModelPool().getMap("countryWarScoreReward");
      if (map == null) {
         return null;
      } else {
         CountryWarScoreRewardModel resultModel = null;

         for(int id : map.keySet()) {
            CountryWarScoreRewardModel model = (CountryWarScoreRewardModel)map.get(id);
            if (model.getIntegral() > this.player.getPlayerDao().country_war_score) {
               break;
            }

            resultModel = model;
         }

         return resultModel;
      }
   }

   public void grantCityReward(List<CommonMsg.ItemInfo> rewardList) {
      if (!rewardList.isEmpty()) {
         List<ResourceModel> cityRewards = new ArrayList();

         for(CommonMsg.ItemInfo itemInfo : rewardList) {
            cityRewards.add(new ResourceModel(itemInfo.getType(), itemInfo.getId(), Double.valueOf((double)itemInfo.getNum()).intValue()));
         }

         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         LanguageModel titleLanguageModel = (LanguageModel)this.player.getGameModelPool().getEntity("language", "countryWarTaskRewardMaiTitle");
         LanguageModel contentLanguageModel = (LanguageModel)this.player.getGameModelPool().getEntity("language", "countryWarTaskRewardMail");
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, titleLanguageModel.getValue(), contentLanguageModel.getValue(), cityRewards, 604800000L, 50, 5001);
      }

   }

   public void grantTaskScoreReward() {
      List<ResourceModel> totalResourceModels = new ArrayList();
      CountryWarDao countryWarDao = this.getCountryWarDao();
      if (this.isSocreReward(countryWarDao)) {
         int maxRewardLv = this.getMaxEnableTakeRewardLv(countryWarDao);
         boolean isEnableTakeSeniorReward = this.isSeniorAward();
         Map<Integer, CountryWarScoreRewardModel> allRewards = this.player.getGameModelPool().getMap("countryWarScoreReward");

         for(Map.Entry<Integer, CountryWarScoreRewardModel> entry : allRewards.entrySet()) {
            if (maxRewardLv >= (Integer)entry.getKey()) {
               if (!countryWarDao.takedRewards.contains(entry.getKey())) {
                  countryWarDao.takedRewards.add(entry.getKey());
                  countryWarDao.updateOp();

                  for(ResourceModel reward : ((CountryWarScoreRewardModel)entry.getValue()).getRewards()) {
                     totalResourceModels.add(new ResourceModel(reward.getType(), reward.getId(), reward.getValue()));
                  }
               }

               if (isEnableTakeSeniorReward && !countryWarDao.takedSeniorRewards.contains(entry.getKey())) {
                  countryWarDao.takedSeniorRewards.add(entry.getKey());
                  countryWarDao.updateOp();

                  for(ResourceModel lockReward : ((CountryWarScoreRewardModel)entry.getValue()).getLockRewards()) {
                     totalResourceModels.add(new ResourceModel(lockReward.getType(), lockReward.getId(), lockReward.getValue()));
                  }
               }
            }
         }

         if (!totalResourceModels.isEmpty()) {
            LanguageModel titleLanguageModel = (LanguageModel)this.player.getGameModelPool().getEntity("language", "countryWarTaskRewardMaiTitle");
            LanguageModel contentLanguageModel = (LanguageModel)this.player.getGameModelPool().getEntity("language", "countryWarTaskRewardMail");
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, titleLanguageModel.getValue(), contentLanguageModel.getValue(), totalResourceModels, 604800000L, 50, 5002);
         }
      }

      int oldScore = this.player.getPlayerDao().country_war_score;
      if (oldScore > 0) {
         this.player.delResource(1, PlayerDefine.PLAYER_COUNTRY_WAR_SCORE, (long)oldScore, 50, 5010, 0, 0, "");
      }

      this.takeWarFlagTaskReward(countryWarDao);
   }

   public void clearCountryDao() {
      CountryWarDao countryWarDao = this.getCountryWarDao();
      if (countryWarDao != null) {
         this.delCountryWarDao(countryWarDao);
      }

   }

   public boolean isSeniorAward() {
      int mapId = this.countryWarMgr.getMapId();
      CountryWarMapModel countryWarMapModel = (CountryWarMapModel)this.player.getGameModelPool().getEntity("countryWarMap", mapId);
      if (countryWarMapModel == null) {
         return false;
      } else {
         ShopLimitModel shopLimitModel = (ShopLimitModel)this.player.getGameModelPool().getEntity("shopLimit", countryWarMapModel.getShopLimitId());
         if (shopLimitModel == null) {
            return false;
         } else {
            GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
            Map<Integer, GiftDao> gifts = giftPart.getBuyGifts(shopLimitModel.getGiftType());
            if (gifts == null) {
               return false;
            } else {
               CountryWarDao countryWarDao = this.getCountryWarDao();

               for(Map.Entry<Integer, GiftDao> entry : gifts.entrySet()) {
                  if (((GiftDao)entry.getValue()).giftId == countryWarMapModel.getShopLimitId() || countryWarDao.shopLimitId > 0 && ((GiftDao)entry.getValue()).giftId == countryWarDao.shopLimitId) {
                     return true;
                  }
               }

               return false;
            }
         }
      }
   }

   public int getMoveNextTokenTime(CountryWarDao countryWarDao, long currentTime) {
      if (!this.countryWarMgr.isActivityStart()) {
         return 0;
      } else if (countryWarDao == null) {
         return 0;
      } else {
         int moveNextTokenTime = 0;
         int maxMoveToken = this.configManager.getIntDefault("countryWarMaxMoveToken", 10);
         int moveTokenColdTime = this.configManager.getIntDefault("countryWarMoveTokenColdTime", 86400);
         if (this.player.getPlayerDao().move_token < maxMoveToken) {
            moveNextTokenTime = (int)(countryWarDao.moveTokenTime / 1000L) + moveTokenColdTime;
         }

         return moveNextTokenTime;
      }
   }

   public int getAttNextTokenTime(CountryWarDao countryWarDao, long currentTime) {
      if (!this.countryWarMgr.isActivityStart()) {
         return 0;
      } else if (countryWarDao == null) {
         return 0;
      } else {
         int attNextTokenTime = 0;
         int maxAttToken = this.configManager.getIntDefault("countryWarMaxAttToken", 20);
         int attTokenColdTime = this.configManager.getIntDefault("countryWarAttTokenColdTime", 10800);
         if (this.player.getPlayerDao().att_token < maxAttToken) {
            attNextTokenTime = (int)(countryWarDao.attTokenTime / 1000L) + attTokenColdTime;
         }

         return attNextTokenTime;
      }
   }

   private boolean isEnableCountryWar() {
      if (!this.player.isSystemOpen(2020)) {
         return false;
      } else {
         return this.countryWarMgr.getState() != 0;
      }
   }

   public CountryWarDao addCountryWarDao() {
      CountryWarDao countryWarDao = (CountryWarDao)this.player.getData("tb_country_war", this.player.getPlayerId());
      long currentTime = System.currentTimeMillis();
      countryWarDao.state = this.countryWarMgr.getState();
      countryWarDao.activityId = this.countryWarMgr.getActivityId();
      countryWarDao.attTokenTime = currentTime;
      countryWarDao.moveTokenTime = currentTime;
      countryWarDao.startTime = currentTime;
      countryWarDao.dailyEndTime = DateUtil.getSomeDayEndTime(currentTime);
      countryWarDao.fiveEndTime = countryWarDao.dailyEndTime + 345600000L;
      int endDay = this.configManager.getIntDefault("countryWarSeasonEndDay", 26);
      countryWarDao.seasonEndTime = DateUtil.dayOfMonthEndTime(endDay);
      countryWarDao.updateOp();
      CountryWarTaskPart countryWarTaskPart = (CountryWarTaskPart)this.player.getMgrPart(CountryWarTaskPart.class);
      this.resetToken();
      countryWarTaskPart.deleteTask();
      countryWarTaskPart.trigger();
      return countryWarDao;
   }

   public CountryWarDao getCountryWarDao() {
      if (!this.player.isSystemOpen(2020)) {
         return null;
      } else {
         CountryWarDao countryWarDao = (CountryWarDao)this.player.getDataNoInsert("tb_country_war", this.player.getPlayerId());
         if (countryWarDao != null) {
            long currentTime = System.currentTimeMillis();
            int maxAttToken = this.configManager.getIntDefault("countryWarMaxAttToken", 20);
            if (this.player.getPlayerDao().att_token < maxAttToken) {
               int toMaxTimes = maxAttToken - this.player.getPlayerDao().att_token;
               int attTokenColdTime = this.configManager.getIntDefault("countryWarAttTokenColdTime", 10800);
               int times = (int)((currentTime - countryWarDao.attTokenTime) / (long)(attTokenColdTime * 1000));
               if (times > 0) {
                  if (times >= toMaxTimes) {
                     int add = maxAttToken - this.player.getPlayerDao().att_token;
                     if (add > 0) {
                        this.player.addResource(1, PlayerDefine.PLAYER_COUNTRY_ATT_TOKEN, add, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 50, 5009, 0, 0, "");
                     }

                     countryWarDao.attTokenTime = currentTime;
                     countryWarDao.updateOp();
                  } else {
                     this.player.addResource(1, PlayerDefine.PLAYER_COUNTRY_ATT_TOKEN, times, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 50, 5009, 0, 0, "");
                     countryWarDao.attTokenTime += (long)(attTokenColdTime * times * 1000);
                     countryWarDao.updateOp();
                  }
               }
            }

            int maxMoveToken = this.configManager.getIntDefault("countryWarMaxMoveToken", 10);
            if (this.player.getPlayerDao().move_token < maxMoveToken) {
               int toMaxTimes = maxMoveToken - this.player.getPlayerDao().move_token;
               int moveTokenColdTime = this.configManager.getIntDefault("countryWarMoveTokenColdTime", 86400);
               int times = (int)((currentTime - countryWarDao.moveTokenTime) / (long)(moveTokenColdTime * 1000));
               if (times > 0) {
                  if (times >= toMaxTimes) {
                     int add = maxMoveToken - this.player.getPlayerDao().move_token;
                     if (add > 0) {
                        this.player.addResource(1, PlayerDefine.PLAYER_COUNTRY_MOVE_TOKEN, add, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 50, 5009, 0, 0, "");
                     }

                     countryWarDao.moveTokenTime = currentTime;
                     countryWarDao.updateOp();
                  } else {
                     this.player.addResource(1, PlayerDefine.PLAYER_COUNTRY_MOVE_TOKEN, times, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 50, 5009, 0, 0, "");
                     countryWarDao.moveTokenTime += (long)(moveTokenColdTime * times * 1000);
                     countryWarDao.updateOp();
                  }
               }
            }
         }

         return countryWarDao;
      }
   }

   public void resetCountryDao(CountryWarDao countryWarDao) {
      long currentTime = System.currentTimeMillis();
      countryWarDao.state = this.countryWarMgr.getState();
      countryWarDao.activityId = this.countryWarMgr.getActivityId();
      countryWarDao.attTokenTime = currentTime;
      countryWarDao.moveTokenTime = currentTime;
      countryWarDao.startTime = currentTime;
      countryWarDao.dailyEndTime = DateUtil.getSomeDayEndTime(currentTime);
      countryWarDao.fiveEndTime = countryWarDao.dailyEndTime + 345600000L;
      int endDay = this.configManager.getIntDefault("countryWarSeasonEndDay", 26);
      countryWarDao.seasonEndTime = DateUtil.dayOfMonthEndTime(endDay);
      countryWarDao.takedRewards.clear();
      countryWarDao.takedSeniorRewards.clear();
      countryWarDao.isTaked = false;
      countryWarDao.shopLimitId = 0;
      countryWarDao.updateOp();
      this.resetToken();
      CountryWarTaskPart countryWarTaskPart = (CountryWarTaskPart)this.player.getMgrPart(CountryWarTaskPart.class);
      countryWarTaskPart.resetAllTask();
      countryWarTaskPart.trigger();
   }

   public void delCountryWarDao(CountryWarDao countryWarDao) {
      this.logger.info("删除国战Dao，玩家={}", this.player.getPlayerId());
      this.clearToken();
      CountryWarTaskPart countryWarTaskPart = (CountryWarTaskPart)this.player.getMgrPart(CountryWarTaskPart.class);
      countryWarTaskPart.deleteTask();
      countryWarDao.deleteOp();
      this.player.deleteDao(countryWarDao, true);
   }

   public void clearToken() {
      PlayerDao playerDao = this.player.getPlayerDao();
      int oldAttToken = playerDao.att_token;
      int oldMoveToken = playerDao.move_token;
      if (oldAttToken > 0) {
         this.player.delResource(1, PlayerDefine.PLAYER_COUNTRY_ATT_TOKEN, (long)oldAttToken, 50, 5009, 0, 0, "system reset");
      }

      if (oldMoveToken > 0) {
         this.player.delResource(1, PlayerDefine.PLAYER_COUNTRY_MOVE_TOKEN, (long)oldMoveToken, 50, 5009, 0, 0, "system reset");
      }

   }

   public void resetToken() {
      int att_token = this.configManager.getIntDefault("countryWarAttToken", 10);
      int move_token = this.configManager.getIntDefault("countryWarMoveToken", 10);
      PlayerDao playerDao = this.player.getPlayerDao();
      int oldAttToken = playerDao.att_token;
      int oldMoveToken = playerDao.move_token;
      if (oldAttToken > 0) {
         this.player.delResource(1, PlayerDefine.PLAYER_COUNTRY_ATT_TOKEN, (long)oldAttToken, 50, 5009, 0, 0, "system reset");
      }

      if (oldMoveToken > 0) {
         this.player.delResource(1, PlayerDefine.PLAYER_COUNTRY_MOVE_TOKEN, (long)oldMoveToken, 50, 5009, 0, 0, "system reset");
      }

      this.player.addResource(1, PlayerDefine.PLAYER_COUNTRY_ATT_TOKEN, att_token, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 50, 5009, 0, 0, "system reset");
      this.player.addResource(1, PlayerDefine.PLAYER_COUNTRY_MOVE_TOKEN, move_token, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 50, 5009, 0, 0, "system reset");
      int oldScore = this.player.getPlayerDao().country_war_score;
      if (oldScore > 0) {
         this.player.delResource(1, PlayerDefine.PLAYER_COUNTRY_WAR_SCORE, (long)oldScore, 50, 5010, 0, 0, "");
      }

   }

   public void addAttToken(int num) {
      this.player.addResource(1, PlayerDefine.PLAYER_COUNTRY_ATT_TOKEN, num, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 49, 5007, 0, 0, "addtoken");
   }

   public void addMoveToken(int num) {
      this.player.addResource(1, PlayerDefine.PLAYER_COUNTRY_MOVE_TOKEN, num, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 49, 5008, 0, 0, "addtoken");
   }

   @MsgHandlerAnno
   public void C2S_BuyTaskScore_11369(CountryWarMsg.C2S_BuyTaskScore_11369 msg, String source) {
      if (msg.getNum() > 0) {
         int day = DateUtil.dayInMonth();
         List<Integer> countryWarOpenDateList = this.configManager.getIntList("countryWarOpenDate");
         if (countryWarOpenDateList.size() >= 2) {
            if (day >= (Integer)countryWarOpenDateList.get(1) && day <= (Integer)countryWarOpenDateList.get(1)) {
               List<ResourceModel> needGold = new ArrayList();
               if (msg.getType() == 1) {
                  List<ResourceModel> flagBoxSharplyPayLv = this.configManager.getResourceModelList("flagBoxSharplyPayLv", "1|9|200");
                  if (flagBoxSharplyPayLv == null || flagBoxSharplyPayLv.isEmpty()) {
                     return;
                  }

                  for(ResourceModel resourceModel : flagBoxSharplyPayLv) {
                     ResourceModel.addResourceToList(needGold, new ResourceModel(resourceModel.getType(), resourceModel.getId(), resourceModel.getValue() * msg.getNum()));
                  }
               } else {
                  String flagBoxSharplyPayLvIntergral = this.configManager.getStrByDefault("flagBoxSharplyPayLvIntergral", "100:10");
                  String[] goldPrams = flagBoxSharplyPayLvIntergral.split(":");
                  if (goldPrams.length < 2) {
                     return;
                  }

                  ResourceModel.addResourceToList(needGold, new ResourceModel(1, PlayerDefine.PLAYER_GOLD, msg.getNum() * Integer.parseInt(goldPrams[1]) / Integer.parseInt(goldPrams[0])));
               }

               if (!this.player.checkResourceNum(needGold)) {
                  this.player.failure(31);
               } else {
                  this.player.delResource((List)needGold, 50, 5012, 0, 0, "C2S_BuyTaskScore_11369");
                  int totalScores = msg.getNum();
                  if (msg.getType() == 1) {
                     totalScores = 2000 * msg.getNum();
                  }

                  ResourceModel addModel = new ResourceModel(1, PlayerDefine.PLAYER_COUNTRY_WAR_SCORE, totalScores);
                  this.player.addResource(addModel, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 50, 5012, 0, 0, "C2S_BuyTaskScore_11369");
                  CountryWarMsg.S2C_BuyTaskScore_11370.Builder builder = CountryWarMsg.S2C_BuyTaskScore_11370.newBuilder();
                  builder.setResult(1);
                  this.player.sendMsg(builder.build());
               }
            } else {
               this.logger.info("【国战】不是国战最后一天，不能购买，最后一日={}", countryWarOpenDateList.get(1));
               this.player.failure(0);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_CountryWarGuide_11371(CountryWarMsg.C2S_CountryWarGuide_11371 msg, String source) {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      CountryWarMsg.S2C_CountryWarGuide_11372.Builder builder = CountryWarMsg.S2C_CountryWarGuide_11372.newBuilder();
      builder.addAllTakedIds(playerExtend.countryGuide);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_TakeGuide_11373(CountryWarMsg.C2S_TakeGuide_11373 msg, String source) {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      if (playerExtend.countryGuide.contains(msg.getId())) {
         this.logger.error("玩家={}，已经领取国战宝典，已经领取={}，领取ID={}", new Object[]{this.player.getPlayerId(), playerExtend.countryGuide, msg.getId()});
      } else {
         Map<Integer, Integer> countryWarGuid = this.configManager.getIntMap("countryWarGuide");
         if (!countryWarGuid.containsKey(msg.getId())) {
            this.logger.error("玩家={}，领取国战宝典奖励错误，可领取={}，领取ID={}", new Object[]{this.player.getPlayerId(), countryWarGuid.keySet(), msg.getId()});
         } else {
            ResourceModel addModel = new ResourceModel(1, PlayerDefine.PLAYER_GOLD, (Integer)countryWarGuid.get(msg.getId()));
            this.player.addResource(addModel, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 50, 5013, 0, 0, "");
            playerExtend.countryGuide.add(msg.getId());
            this.player.updatePlayerExtend(13);
            CountryWarMsg.S2C_CountryWarGuide_11372.Builder builder = CountryWarMsg.S2C_CountryWarGuide_11372.newBuilder();
            builder.addAllTakedIds(playerExtend.countryGuide);
            this.player.sendMsg(builder.build());
         }
      }
   }

   public void slaveServerMergeBegin(int shopLimitId, int type, boolean isSendReward) {
      CountryWarDao countryWarDao = this.getCountryWarDao();
      countryWarDao.shopLimitId = shopLimitId;
      countryWarDao.updateOp();
      if (!countryWarDao.isTaked && isSendReward) {
         CountryWarMapModel countryWarMapModel = (CountryWarMapModel)this.player.getGameModelPool().getEntity("countryWarMap", this.countryWarMgr.getMapId());
         this.logger.info("玩家={}，补发国战战旗奖励，地图={}", this.player.getPlayerId(), this.countryWarMgr.getMapId());
         if (countryWarMapModel != null) {
            List<ResourceModel> addList = new ArrayList();
            addList.add(new ResourceModel(2, countryWarMapModel.getWarFlagReward(), 1));
            CentreAwardModel centreAwardModel = null;
            if (type == 1) {
               centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", ApplicationContextProvider.getConfigInt("mergeCounttrywarFlag", 2061));
            } else if (type == 2) {
               centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", ApplicationContextProvider.getConfigInt("changeCounttrywarFlag", 2312));
            }

            if (centreAwardModel != null) {
               MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), addList, 604800000L, 93, 9301);
            }
         }
      }

      List<CountryWarTaskModel> taskList = (List)this.player.getGameModelPool().getEntity("customCountryWarTask", 4);
      if (taskList != null && !taskList.isEmpty()) {
         CountryWarTaskPart countryWarTaskPart = (CountryWarTaskPart)this.player.getMgrPart(CountryWarTaskPart.class);

         for(CountryWarTaskModel countryWarTaskModel : taskList) {
            TaskData taskData = countryWarTaskPart.getTask(countryWarTaskModel.getId());
            if (taskData != null) {
               taskData.delete();
            }
         }

         countryWarDao.isTaked = false;
         countryWarDao.updateOp();
         if (type == 2) {
            this.mainServerMergeFinish();
         }

      }
   }

   public void mainServerMergeFinish() {
      List<CountryWarTaskModel> taskList = (List)this.player.getGameModelPool().getEntity("customCountryWarTask", 4);
      if (taskList != null && !taskList.isEmpty()) {
         CountryWarTaskPart countryWarTaskPart = (CountryWarTaskPart)this.player.getMgrPart(CountryWarTaskPart.class);

         for(CountryWarTaskModel countryWarTaskModel : taskList) {
            TaskData taskData = countryWarTaskPart.getTask(countryWarTaskModel.getId());
            if (taskData == null) {
               countryWarTaskPart.createTask(countryWarTaskModel.getId());
            }
         }

      }
   }

   public void resetMonth() {
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      giftPart.clearGifts(15);
   }

   @MsgHandlerAnno
   public void C2S_SetTransfer_11375(CountryWarMsg.C2S_SetTransfer_11375 msg, String source) {
      CountryWarDao countryWarDao = this.getCountryWarDao();
      if (countryWarDao != null) {
         countryWarDao.allowTransfer = msg.getAllowTransfer();
         countryWarDao.updateOp();
         CountryWarMsg.C2S_SetTransfer_11375.Builder crossBuilder = msg.toBuilder();
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), crossBuilder.build());
      }

      CountryWarMsg.S2C_SetTransfer_11376.Builder builder = CountryWarMsg.S2C_SetTransfer_11376.newBuilder();
      builder.setAllowTransfer(msg.getAllowTransfer());
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_SameUnionTransfer_11383(CountryWarMsg.C2S_SameUnionTransfer_11383 msg, String source) {
      CountryWarDao countryWarDao = this.getCountryWarDao();
      if (countryWarDao != null) {
         countryWarDao.sameUnionTransfer = msg.getSameUnionTransfer();
         countryWarDao.updateOp();
         CountryWarMsg.C2S_SameUnionTransfer_11383.Builder crossBuilder = msg.toBuilder();
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), crossBuilder.build());
      }

      CountryWarMsg.S2C_SameUnionTransfer_11384.Builder builder = CountryWarMsg.S2C_SameUnionTransfer_11384.newBuilder();
      builder.setSameUnionTransfer(msg.getSameUnionTransfer());
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_TransferRecord_11377(CountryWarMsg.C2S_TransferRecord_11377 msg, String source) {
      CountryWarMsg.C2S_TransferRecord_11377.Builder crossBuilder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), crossBuilder.build());
   }

   @MsgHandlerAnno
   public void C2S_TransferRecordExtra_11379(CountryWarMsg.C2S_TransferRecordExtra_11379 msg, String source) {
      CountryWarMsg.C2S_TransferRecordExtra_11379.Builder crossBuilder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), crossBuilder.build());
   }

   @MsgHandlerAnno
   public void C2S_BuyAttackToken_11381(CountryWarMsg.C2S_BuyAttackToken_11381 msg, String source) {
      if (this.countryWarMgr.getState() != 1) {
         this.logger.info("【国战】国战没有开启");
      } else {
         int maxAttToken = this.configManager.getIntDefault("countryWarMaxAttToken", 20);
         if (this.player.getPlayerDao().att_token + 1 <= maxAttToken) {
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            Integer buyLimit = (Integer)playerResetCustomCache.getDailyNum(47, 0);
            String countryWarbuyTime = this.configManager.getStrByDefault("countryWarbuyTime", "1|9|100,1|9|150,1|9|200,1|9|250,1|9|300");
            String[] limitBuyCost = countryWarbuyTime.split(",");
            if (buyLimit >= limitBuyCost.length) {
               this.player.failure(76143);
            } else {
               String[] cost = limitBuyCost[buyLimit].split("\\|");
               if (!this.player.checkResourceNum(Integer.parseInt(cost[0]), Integer.parseInt(cost[1]), Integer.parseInt(cost[2]))) {
                  this.player.failure(76142);
               } else {
                  this.player.delResource(Integer.parseInt(cost[0]), Integer.parseInt(cost[1]), (long)Integer.parseInt(cost[2]), 50, 5014, 0, 0, "");
                  this.player.addResource(1, PlayerDefine.PLAYER_COUNTRY_ATT_TOKEN, 1, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 50, 5014, 0, 0, "");
                  playerResetCustomCache.addDailyReset(47, 1);
                  int dailyBuyNum = (Integer)playerResetCustomCache.getDailyNum(47, 0);
                  CountryWarMsg.S2C_BuyAttackToken_11382.Builder builder = CountryWarMsg.S2C_BuyAttackToken_11382.newBuilder();
                  builder.setBuyNum(dailyBuyNum);
                  this.player.sendMsg(builder.build());
               }
            }
         }
      }
   }
}
