package com.gzbz.gamePlayer.battle;

import HttpClient.HttpClient;
import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import cn.hutool.core.convert.Convert;
import com.gzbz.activity.part.ActivityPart;
import com.gzbz.activity.part.SpecialTaskActivityPart;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.BattleChapterDao;
import com.gzbz.db.BattleDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.arraying.ArrayingEntity;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameDefine.StarMapDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.expedition.ExpeditionPart;
import com.gzbz.gamePlayer.guanjia.GuanJiaPart;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.playerBag.StarMapPoint;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.log.PlayerLogPart;
import com.gzbz.model.ChapterFastBattleModel;
import com.gzbz.model.ChapterModel;
import com.gzbz.model.ChapterOnlineGiftModel;
import com.gzbz.model.ChapterPassRewardModel;
import com.gzbz.model.DropOutModel;
import com.gzbz.model.HeroDressModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.LanguageModel;
import com.gzbz.model.VipModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.BattleChapterMsg;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.net.URLEncoder;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import misc.DateUtil;
import misc.RandomUtil;
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
public class BattleChapterPart extends PlayerPart {
   Logger logger = LoggerFactory.getLogger(BattleChapterPart.class);
   @Autowired
   private RankMgr rankMgr;
   @Autowired
   private ConfigManager configManager;
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   private BattleChapterMgr battleChapterMgr;
   public static final int SHOW_SIZE = 100;

   public void loginHandle() {
      BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
      if (battleChapterDao.startTime == 0L) {
         long currentTime = System.currentTimeMillis();
         battleChapterDao.startTime = currentTime;
         battleChapterDao.settleTime = currentTime;
         battleChapterDao.updateOp();
      }

      this.S2C_CommonAwardId_7218();
      this.S2C_BonusAwardsId_7220();
      battleChapterDao.olRecordTime = System.currentTimeMillis();
      battleChapterDao.updateOp();
   }

   public void resetDaily() {
      super.resetDaily();
      this.sendFastBattleResult(0, 0, 0);
      if (this.player.getPublicDao().lv >= ApplicationContextProvider.getConfigInt("commonArrayingLogLv", 100)) {
         String[] logParams = new String[]{"", "", "", "", "", "-", ""};
         HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         List<Integer> heroCodesOfArraying = heroArrayingPart.getHeroCodesOfArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
         Map<Integer, HeroDao> heroDaoMap = heroBagPart.getHeroDaoMap();
         String[] nationName = new String[]{"魏", "蜀", "吴", "神", "魔"};

         for(int i = 0; i < heroCodesOfArraying.size(); ++i) {
            int heroCode = (Integer)heroCodesOfArraying.get(i);
            HeroDao heroDao = (HeroDao)heroDaoMap.get(heroCode);
            if (heroDao != null) {
               HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroDao.id);
               if (heroModel == null) {
                  logParams[i] = heroDao.id + "&" + heroDao.getLv() + "&" + heroDao.getStar();
                  logParams[logParams.length - 1] = logParams[logParams.length - 1] + "未知、";
               } else {
                  logParams[i] = logParams[i] = heroModel.getName() + "&" + heroDao.getLv() + "&" + heroDao.getStar();
                  if (heroModel.getNation() > nationName.length) {
                     logParams[logParams.length - 1] = logParams[logParams.length - 1] + "未知、";
                  } else {
                     logParams[logParams.length - 1] = logParams[logParams.length - 1] + nationName[heroModel.getNation() - 1] + "、";
                  }
               }
            }
         }

         this.player.getOperationMgr().addExtraLog(this.player, 214, logParams);
      }
   }

   public void logoutHandle() {
      BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
      long currentTime = System.currentTimeMillis();
      this.logger.info("玩家{}离线，离线时间={},旧的记录时间={}", new Object[]{this.player.getPlayerId(), DateUtil.transferLongToDate(currentTime), DateUtil.transferLongToDate(battleChapterDao.olRecordTime)});
      if (battleChapterDao.olRecordTime == 0L) {
         battleChapterDao.olRecordTime = System.currentTimeMillis();
         battleChapterDao.updateOp();
      } else {
         long addTime = currentTime - battleChapterDao.olRecordTime;
         battleChapterDao.olCumTime += addTime;
         battleChapterDao.olRecordTime = currentTime;
         battleChapterDao.updateOp();
      }

   }

   public int getCurrentAwardId() {
      this.checkOnlineAward();
      BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
      long totalTime = battleChapterDao.olCumTime;
      Map<Integer, ChapterOnlineGiftModel> modelMap = this.player.getGameModelPool().getMap("chapterOnlineGift");
      int loopTime = 0;
      ChapterOnlineGiftModel model = null;

      for(Map.Entry<Integer, ChapterOnlineGiftModel> entry : modelMap.entrySet()) {
         loopTime += ((ChapterOnlineGiftModel)entry.getValue()).getTimes() * 1000;
         if ((long)loopTime > totalTime) {
            return ((ChapterOnlineGiftModel)entry.getValue()).getId() - 1;
         }

         model = (ChapterOnlineGiftModel)entry.getValue();
      }

      return model.getId();
   }

   public void checkOnlineAward() {
      BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
      long currentTime = System.currentTimeMillis();
      long addTime = currentTime - battleChapterDao.olRecordTime;
      battleChapterDao.olCumTime += addTime;
      battleChapterDao.olRecordTime = currentTime;
      battleChapterDao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_TakeOnlineTimeAward_7221(BattleChapterMsg.C2S_TakeOnlineTimeAward_7221 msg, String source) {
      int awardId = msg.getId();
      BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
      int currentAwardId = this.getCurrentAwardId();
      if (currentAwardId < awardId) {
         this.logger.info("没有到达奖励进度，当前可领取={}，领取={}", currentAwardId, awardId);
         this.player.failure(15002);
      } else if (battleChapterDao.olTakedAwardIds.contains(awardId)) {
         this.logger.info("在线奖励已经领取，ID={}", awardId);
         this.player.failure(15003);
      } else {
         ChapterOnlineGiftModel chapterOnlineGiftModel = (ChapterOnlineGiftModel)this.player.getGameModelPool().getEntity("chapterOnlineGift", awardId);
         if (chapterOnlineGiftModel == null) {
            this.logger.info("奖励模板未空,ID={}", awardId);
         } else {
            this.player.addResource(chapterOnlineGiftModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 15, 1505, 0, 0, "");
            battleChapterDao.olTakedAwardIds.add(awardId);
            battleChapterDao.updateOp();
            PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
            playerLogPart.logChapter(battleChapterDao.chapterId, awardId, 15, 1505, 0, 0, Convert.toStr(battleChapterDao.olTakedAwardIds));
            BattleChapterMsg.S2C_TakeOnlineTimeAwardResult_7222.Builder builder = BattleChapterMsg.S2C_TakeOnlineTimeAwardResult_7222.newBuilder();
            builder.setRecordTime((int)(battleChapterDao.olRecordTime / 1000L));
            builder.setTime((int)(battleChapterDao.olCumTime / 1000L));

            for(Integer olTakedAwardId : battleChapterDao.olTakedAwardIds) {
               builder.addAwardIds(olTakedAwardId);
            }

            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_OpenMainUi_7201(BattleChapterMsg.C2S_OpenMainUi_7201 msg, String source) {
      this.toChapterMainUi();
   }

   public void toChapterMainUi() {
      BattleChapterMsg.S2C_OpenMainUiResult_7202.Builder result_builder = BattleChapterMsg.S2C_OpenMainUiResult_7202.newBuilder();
      result_builder.setInfo(this.getMainUiInfo());
      this.player.sendMsg(result_builder.build());
   }

   public BattleChapterMsg.MainUiInfo.Builder getMainUiInfo() {
      this.checkOnlineAward();
      BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      BattleChapterMsg.MainUiInfo.Builder info_builder = BattleChapterMsg.MainUiInfo.newBuilder();
      info_builder.setChapterId(battleChapterDao.chapterId);
      info_builder.setStartTime((int)(battleChapterDao.startTime / 1000L));
      int freeNum = (Integer)playerResetCustomCache.getDailyNum(121, 0);
      int goldNum = (Integer)playerResetCustomCache.getDailyNum(122, 0);
      int fastFightAddNum = (Integer)playerResetCustomCache.getDailyNum(127, 0);
      info_builder.setFreeFightNum(freeNum);
      info_builder.setGoldFightNum(goldNum);
      info_builder.setFastFightAddNum(fastFightAddNum);
      info_builder.setType(this.getFastFightState());
      info_builder.setRecordTime((int)(battleChapterDao.olRecordTime / 1000L));
      info_builder.setTime((int)(battleChapterDao.olCumTime / 1000L));

      for(Integer olTakedAwardId : battleChapterDao.olTakedAwardIds) {
         info_builder.addAwardIds(olTakedAwardId);
      }

      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      if (playerExtend.fastFightNum > 0) {
         info_builder.setGiveNum(playerExtend.fastFightNum);
      }

      return info_builder;
   }

   public int beginBattle(BattleDao battleDao) {
      BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
      int battleChapterId = battleChapterDao.chapterId + 1;
      if (battleDao.modelId != battleChapterId) {
         this.logger.info("挑战关卡和当前已经通关关卡不对应，当前完成关卡={},挑战关卡={}", battleDao.modelId, battleChapterId);
         return 0;
      } else {
         ChapterModel chapterModel = (ChapterModel)this.player.getGameModelPool().getEntity("chapter", battleChapterId);
         PlayerPublicDao playerDao = this.player.getPublicDao();
         ArrayingMirror heroArrayingDao = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
         if (heroArrayingDao == null) {
            this.logger.info("阵型为空");
            return 21000;
         } else if (chapterModel.getLevel() > playerDao.lv) {
            return 20;
         } else {
            BattlePKTeam right = new BattlePKTeam(chapterModel.getBattle());
            battleDao.modelId = battleChapterId;
            battleDao.scene.addPKTeam((byte)1, right);
            battleDao.scene.setMaxRound((byte)20);
            battleChapterDao.updateOp();
            return 1;
         }
      }
   }

   public void afterFight(BattleDao battleDao) {
      if (battleDao.scene.getWinForce() == 0) {
         battleDao.scene.getBattleMsg().setBattleId(battleDao.modelId);
         BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().getResult().toBuilder();
         PlayerDao playerDao = this.player.getPlayerDao();
         result.setPlayerLv(playerDao.lv);
         result.setPlayerExp(playerDao.exp);
         ChapterModel chapterModel = (ChapterModel)this.player.getGameModelPool().getEntity("chapter", battleDao.modelId);

         for(ResourceModel passAward : chapterModel.getPassAwards()) {
            if (playerDao.lv < this.player.getSystemLvLimit(1001) || passAward.getId() != PlayerDefine.PLAYER_EXP) {
               result.addAwardItems(passAward.builder());
            }
         }

         battleDao.scene.getBattleMsg().setResult(result);
      }
   }

   public void endBattle(BattleDao battleDao) {
      this.takeFightAward(battleDao);
   }

   public void takeFightAward(BattleDao battleDao) {
      BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
      if (battleDao.modelId > 0) {
         ChapterModel chapterModel = (ChapterModel)this.player.getGameModelPool().getEntity("chapter", battleDao.modelId);
         int win = 0;
         List<ResourceModel> rewards = new ArrayList();
         if (battleDao.scene.getWinForce() == 0) {
            for(ResourceModel model : chapterModel.getPassAwards()) {
               if (this.player.getPublicDao().lv < this.player.getSystemLvLimit(1001) || model.getId() != PlayerDefine.PLAYER_EXP) {
                  ResourceModel resourceModel = model.clone();
                  rewards.add(resourceModel);
               }
            }

            ++battleChapterDao.chapterId;
            battleChapterDao.updateOp();
            this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 15, 1503, 0, 0, "", 1650);
            this.player.notifyPlayerData(PlayerDefine.PLAYER_CHAPTER_ID, battleChapterDao.chapterId);
            RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
            rankPart.updateRank(RankDefine.RankModule.BATTLE_CHAPTER_CROSS, (long)battleChapterDao.chapterId, true);
            PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
            playerLogPart.logChapter(battleChapterDao.chapterId, 1, 15, 1503, 0, 0, Convert.toStr(rewards));
            this.player.triggerTask(401, 0, (long)battleDao.modelId, 0);
            this.rankMgr.pushTaskEx("checkRankReward", new Object[]{this.player.getPlayerId(), 1, battleDao.modelId});
            ExpeditionPart expeditionPart = (ExpeditionPart)this.player.getMgrPart(ExpeditionPart.class);
            expeditionPart.checkUnlockChapter(battleDao.modelId);
            this.player.getOperationMgr().addExtraLog(this.player, 101, String.valueOf(battleChapterDao.chapterId));
         }

         battleChapterDao.updateOp();
      }

   }

   @MsgHandlerAnno
   public void C2S_ShowAwards_7223(BattleChapterMsg.C2S_ShowAwards_7223 msg, String source) {
      BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
      if (battleChapterDao.settleMinutes >= this.getMinutesByVip()) {
         this.S2C_ShowAwardsResult_7224(battleChapterDao.chapterId, battleChapterDao.settleAwards);
      } else {
         long currentTime = System.currentTimeMillis();
         int times = (int)((currentTime - battleChapterDao.settleTime) / 60000L);
         if (times < 1) {
            this.S2C_ShowAwardsResult_7224(battleChapterDao.chapterId, battleChapterDao.settleAwards);
         } else {
            int totalTimes = battleChapterDao.settleMinutes + times;
            if (totalTimes > this.getMinutesByVip()) {
               times = this.getMinutesByVip() - battleChapterDao.settleMinutes;
            }

            for(ResourceModel resourceModel : this.getRewardsByMinutes(times, false)) {
               battleChapterDao.updateHangupAwards(resourceModel);
            }

            battleChapterDao.settleMinutes += times;
            battleChapterDao.settleTime = currentTime;
            battleChapterDao.updateOp();
            this.S2C_ShowAwardsResult_7224(battleChapterDao.chapterId, battleChapterDao.settleAwards);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_TakeTimeReward_7205(BattleChapterMsg.C2S_TakeTimeReward_7205 msg, String source) {
      BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
      ChapterModel chapterModel = (ChapterModel)this.player.getGameModelPool().getEntity("chapter", battleChapterDao.chapterId);
      if (chapterModel == null) {
         this.logger.info("没有通关记录，请主公征战关卡");
      } else if (battleChapterDao.settleMinutes >= this.getMinutesByVip()) {
         this.takehangupRewardResult(battleChapterDao);
      } else {
         long currentTime = System.currentTimeMillis();
         int times = (int)(currentTime - battleChapterDao.settleTime) / '\uea60';
         if (times < 1) {
            this.takehangupRewardResult(battleChapterDao);
         } else {
            int totalTimes = battleChapterDao.settleMinutes + times;
            if (totalTimes > this.getMinutesByVip()) {
               times = this.getMinutesByVip() - battleChapterDao.settleMinutes;
            }

            for(ResourceModel resourceModel : this.getRewardsByMinutes(times, false)) {
               battleChapterDao.updateHangupAwards(resourceModel);
            }

            this.takehangupRewardResult(battleChapterDao);
         }
      }
   }

   public void takehangupRewardResult(BattleChapterDao battleChapterDao) {
      List<ResourceModel> rewardList = new ArrayList();

      for(ResourceModel settleAward : battleChapterDao.settleAwards) {
         if (battleChapterDao.chapterId > 4 || settleAward.getType() != 1 || settleAward.getId() != PlayerDefine.PLAYER_EXP) {
            ResourceModel resourceModel = settleAward.clone();
            rewardList.add(resourceModel);
         }
      }

      this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_TYPE_HANGUP_CHAPTER, 15, 1502, 0, 0, "");
      long currentTime = System.currentTimeMillis();
      battleChapterDao.startTime = currentTime;
      battleChapterDao.settleTime = currentTime;
      battleChapterDao.settleMinutes = 0;
      battleChapterDao.settleAwards.clear();
      battleChapterDao.updateOp();
      PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
      playerLogPart.logChapter(battleChapterDao.chapterId, 0, 15, 1502, 0, 0, Convert.toStr(rewardList));
      BattleChapterMsg.S2C_TakeTimeRewardResult_7206.Builder builder = BattleChapterMsg.S2C_TakeTimeRewardResult_7206.newBuilder();
      builder.setTime((int)(currentTime / 1000L));
      this.player.sendMsg(builder.build());
   }

   public void S2C_ShowAwardsResult_7224(int chapterId, List<ResourceModel> rewardList) {
      if (rewardList.isEmpty()) {
         this.player.failure(15002);
      } else {
         BattleChapterMsg.S2C_ShowAwardsResult_7224.Builder builder = BattleChapterMsg.S2C_ShowAwardsResult_7224.newBuilder();

         for(ResourceModel item : rewardList) {
            if ((chapterId > 4 || item.getType() != 1 || item.getId() != PlayerDefine.PLAYER_EXP) && item.getValue() > 0) {
               CommonMsg.ItemInfo.Builder itemBuilder = CommonMsg.ItemInfo.newBuilder();
               itemBuilder.setType(item.getType());
               itemBuilder.setId(item.getId());
               itemBuilder.setNum(item.getValue());
               builder.addItems(itemBuilder);
            }
         }

         this.player.sendMsg(builder.build());
      }
   }

   public DropOutModel getDropOutModelByGroupId(int dropGroupId) {
      List<DropOutModel> libList = (List)this.player.getGameModelPool().getEntity("custom_dropOut", dropGroupId);
      int totalProbabilityNum = 0;

      for(DropOutModel model : libList) {
         totalProbabilityNum += model.getOdds();
      }

      int r = RandomUtil.randInt(totalProbabilityNum);
      int tVal = 0;

      for(DropOutModel model : libList) {
         tVal += model.getOdds();
         if (tVal > r) {
            return model;
         }
      }

      return null;
   }

   @MsgHandlerAnno
   public void C2S_FastBattle_7207(BattleChapterMsg.C2S_FastBattle_7207 msg, String source) {
      BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
      if (battleChapterDao.chapterId == 0) {
         this.player.failure(15001);
      } else {
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         int freeFastNum = (Integer)playerResetCustomCache.getDailyNum(121, 0);
         int goldFastNum = (Integer)playerResetCustomCache.getDailyNum(122, 0);
         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
         int giveNum = playerExtend.fastFightNum;
         int fastModelId = this.getFastFightState();
         ChapterFastBattleModel chapterFastBattleModel = (ChapterFastBattleModel)this.player.getGameModelPool().getEntity("chapterFastBattle", fastModelId);
         String[] activityPointArr = ApplicationContextProvider.getConfigString("FastCombatPoints", "").split("\\|");
         SpecialTaskActivityPart specialTaskActivityPart = (SpecialTaskActivityPart)this.player.getMgrPart(SpecialTaskActivityPart.class);
         int gold = 0;
         if (giveNum > 0) {
            playerExtend.fastFightNum += -1;
            this.player.updatePlayerExtend(13);
            specialTaskActivityPart.addPoint(1190, Integer.parseInt(activityPointArr[0]));
         } else if (freeFastNum < chapterFastBattleModel.getFreeNum()) {
            playerResetCustomCache.addDailyReset(121, 1);
            ++freeFastNum;
            specialTaskActivityPart.addPoint(1190, Integer.parseInt(activityPointArr[0]));
         } else {
            if (goldFastNum >= chapterFastBattleModel.getCosts().size()) {
               System.out.println("已经没有购买次数了");
               this.player.failure(15000);
               return;
            }

            gold = (Integer)chapterFastBattleModel.getCosts().get(goldFastNum);
            ResourceModel resourceModel = new ResourceModel(1, PlayerDefine.PLAYER_GOLD, gold);
            if (!this.player.checkResourceNum(resourceModel)) {
               this.logger.info("快速作战金币不够！");
               this.player.failure(31);
               return;
            }

            this.player.delResource(resourceModel, 15, 1501, 0, 0, "");
            playerResetCustomCache.addDailyReset(122, 1);
            ++goldFastNum;
            switch (gold) {
               case 50:
                  specialTaskActivityPart.addPoint(1190, Integer.parseInt(activityPointArr[1]));
                  break;
               case 100:
                  specialTaskActivityPart.addPoint(1190, Integer.parseInt(activityPointArr[2]));
                  break;
               case 200:
                  specialTaskActivityPart.addPoint(1190, Integer.parseInt(activityPointArr[3]));
            }
         }

         int times = chapterFastBattleModel.getAccelerate() / 60;
         List<ResourceModel> rewardList = this.getRewardsByMinutes(times, true);
         this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_TYPE_FAST_CHAPTER, 15, 1501, 0, 0, "");
         this.player.triggerTask(105, 0, 1L, 1);
         PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
         playerLogPart.logChapter(battleChapterDao.chapterId, 0, 15, 1501, 0, 0, Convert.toStr(rewardList));
         int fastFightAddNum = (Integer)playerResetCustomCache.getDailyNum(127, 0);
         this.sendFastBattleResult(freeFastNum, goldFastNum, fastFightAddNum);
         this.player.updateGuideStep(msg.getGuideStep());
         GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
         guanJiaPart.checkState(2092, (List)null);
         this.player.getOperationMgr().addExtraLog(this.player, 102, String.valueOf(gold), String.valueOf(freeFastNum + goldFastNum + 1));
      }
   }

   @MsgHandlerAnno
   public void C2S_FastBattleAdd_7235(BattleChapterMsg.C2S_FastBattleAdd_7235 msg, String source) {
      BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
      if (battleChapterDao.chapterId == 0) {
         this.player.failure(15001);
      } else if (this.player.getPublicDao().vip_lv < 1) {
         this.logger.error("玩家的vip等级小于1，不能特殊加速");
      } else {
         int worldLv = this.worldMgr.getWorldLv();
         int fastFightAddNeedWorldLv = this.configManager.getIntDefault("fastFightAddNeedWorldLv", 50);
         if (worldLv < fastFightAddNeedWorldLv) {
            this.logger.info("世界等级没有达到要求，需要={}，世界等级={}", fastFightAddNeedWorldLv, worldLv);
         } else {
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            int fastFightAddNum = (Integer)playerResetCustomCache.getDailyNum(127, 0);
            int fastModelId = 400 + this.player.getPublicDao().vip_lv;
            ChapterFastBattleModel chapterFastBattleModel = (ChapterFastBattleModel)this.player.getGameModelPool().getEntity("chapterFastBattle", fastModelId);
            if (chapterFastBattleModel == null) {
               this.logger.info("模板为空，id={}", fastModelId);
            } else {
               int playerLv = this.player.getPublicDao().lv;
               if (playerLv >= worldLv) {
                  this.logger.info("玩家等级={}，世界等级={}", playerLv, worldLv);
               } else {
                  int deltLv = worldLv - playerLv;
                  int per = deltLv * 100 / worldLv;
                  if (per < chapterFastBattleModel.getWorldLevel()) {
                     this.logger.info("未达到特殊加速,玩家={},等级={}，世界等级={}，per={}，model世界等级={}", new Object[]{this.player.getPlayerId(), playerLv, worldLv, per, chapterFastBattleModel.getWorldLevel()});
                  } else {
                     int gold = 0;
                     if (fastFightAddNum >= chapterFastBattleModel.getCosts().size()) {
                        System.out.println("已经没有购买次数了");
                        this.player.failure(15000);
                     } else {
                        gold = (Integer)chapterFastBattleModel.getCosts().get(fastFightAddNum);
                        ResourceModel resourceModel = new ResourceModel(1, PlayerDefine.PLAYER_GOLD, gold);
                        if (!this.player.checkResourceNum(resourceModel)) {
                           this.logger.info("玩家={}，快速作战特殊加速金币不够！", this.player.getPlayerId());
                           this.player.failure(31);
                        } else {
                           this.player.delResource(resourceModel, 15, 1508, 0, 0, "");
                           playerResetCustomCache.addDailyReset(127, 1);
                           ++fastFightAddNum;
                           int times = chapterFastBattleModel.getAccelerate() / 60;
                           List<ResourceModel> rewardList = this.getRewardsByMinutes(times, true);
                           this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_TYPE_FAST_CHAPTER, 15, 1508, 0, 0, "");
                           PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
                           playerLogPart.logChapter(battleChapterDao.chapterId, 0, 15, 1508, 0, 0, Convert.toStr(rewardList));
                           this.player.updateGuideStep(msg.getGuideStep());
                           BattleChapterMsg.S2C_FastBattleAdd_7236.Builder builder = BattleChapterMsg.S2C_FastBattleAdd_7236.newBuilder();
                           builder.setFightNum(fastFightAddNum);
                           this.player.sendMsg(builder.build());
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void sendFastBattleResult(int freeNum, int goldNum, int fastFightAddNum) {
      BattleChapterMsg.S2C_FastBattleResult_7208.Builder builder = BattleChapterMsg.S2C_FastBattleResult_7208.newBuilder();
      builder.setFreeFightNum(freeNum);
      builder.setGoldFightNum(goldNum);
      builder.setFastFightAdd(fastFightAddNum);
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      builder.setGiveNum(playerExtend.fastFightNum);
      this.player.sendMsg(builder.build());
   }

   public List<ResourceModel> getRewardsByMinutes(int times, boolean isFastFight) {
      PlayerPublicDao playerDao = this.player.getPublicDao();
      BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
      ChapterModel chapterModel = (ChapterModel)this.player.getGameModelPool().getEntity("chapter", battleChapterDao.chapterId);
      if (chapterModel == null) {
         this.logger.info("领取挂机奖励对象为空！！！");
         return new ArrayList();
      } else {
         List<ResourceModel> rewards = new ArrayList();
         VipModel vipModel = (VipModel)this.player.getGameModelPool().getEntity("vip", playerDao.vip_lv);
         if (chapterModel.getMinDrops() != null) {
            for(ResourceModel minDrop : chapterModel.getMinDrops()) {
               ResourceModel resourceModel = new ResourceModel(minDrop.getType(), minDrop.getId());
               if (resourceModel.getId() == PlayerDefine.PLAYER_EXP) {
                  int battleVipNoEffect = this.configManager.getIntDefault("battleVipNoEffect", 5);
                  if (battleChapterDao.chapterId <= battleVipNoEffect) {
                     resourceModel.setValue(minDrop.getValue() * times);
                  } else {
                     resourceModel.setValue((int)((float)(minDrop.getValue() * times) * (1.0F + (float)vipModel.getVipDrop1() / 10000.0F)));
                  }
               } else if (resourceModel.getId() == PlayerDefine.PLAYER_HERO_EXP) {
                  resourceModel.setValue((int)((float)(minDrop.getValue() * times) * (1.0F + (float)vipModel.getVipDrop2() / 10000.0F)));
               } else if (resourceModel.getId() == PlayerDefine.PLAYER_COPPER) {
                  resourceModel.setValue((int)((float)(minDrop.getValue() * times) * (1.0F + (float)vipModel.getVipDrop3() / 10000.0F)));
               } else if (resourceModel.getId() == PlayerDefine.PLAYER_INFOMATION) {
                  resourceModel.setValue((int)((float)(minDrop.getValue() * times) * (1.0F + (float)vipModel.getVipDrop4() / 10000.0F)));
               } else {
                  resourceModel.setValue(resourceModel.getValue() * times);
               }

               rewards.add(resourceModel);
            }
         }

         int dropGroupId = chapterModel.getItemDrop();

         for(int i = 0; i < times; ++i) {
            DropOutModel dropOutModel = this.getDropOutModelByGroupId(dropGroupId);
            int num = RandomUtil.randInt(dropOutModel.getMin(), dropOutModel.getMax());
            boolean isNewItem = true;

            for(ResourceModel resourceModel : rewards) {
               if (resourceModel.getId() == dropOutModel.getItemId()) {
                  resourceModel.setValue(resourceModel.getValue() + num);
                  isNewItem = false;
                  break;
               }
            }

            if (isNewItem) {
               ResourceModel model = new ResourceModel(dropOutModel.getType(), dropOutModel.getItemId(), num);
               rewards.add(model);
            }
         }

         if (isFastFight) {
            List<DropOutModel> libList = (List)this.player.getGameModelPool().getEntity("custom_dropOut", dropGroupId);
            DropOutModel needModel = null;

            for(DropOutModel dropOutModel : libList) {
               if (dropOutModel.getFastBattle() > 0) {
                  needModel = dropOutModel;
                  break;
               }
            }

            if (needModel != null) {
               boolean isHaveDrop = false;

               for(ResourceModel reward : rewards) {
                  if (reward.getId() == needModel.getItemId()) {
                     isHaveDrop = true;
                  }
               }

               PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
               ++playerExtend.fastNoItemNum;
               if (isHaveDrop) {
                  playerExtend.fastNoItemNum = 0;
               } else if (playerExtend.fastNoItemNum >= needModel.getFastBattle()) {
                  rewards.add(new ResourceModel(2, needModel.getItemId(), 1));
                  playerExtend.fastNoItemNum = 0;
               }

               this.player.updatePlayerExtend(13);
            }
         }

         ActivityPart activityPart = (ActivityPart)this.player.getMgrPart(ActivityPart.class);
         rewards.addAll(activityPart.activityDrop(times));
         return rewards;
      }
   }

   @MsgHandlerAnno
   public void C2S_ChapterRank_7209(BattleChapterMsg.C2S_ChapterRank_7209 msg, String source) {
      this.sendRankToPlayer(this.player.getPlayerId());
   }

   public void sendRankToPlayer(int playerId) {
      RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
      RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
      int myRank = rankPart.getRank(RankDefine.RankModule.BATTLE_CHAPTER_CROSS);
      rankMgr.pushTaskEx("battlleChapterRanks", new Object[]{this.player, myRank});
   }

   @MsgHandlerAnno
   public void C2S_TakeCommonAward_7217(BattleChapterMsg.C2S_TakeCommonAward_7217 msg, String source) {
      BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
      if (battleChapterDao.chapterId < msg.getId()) {
         this.logger.info("还没有通关:" + msg.getId());
      } else if (battleChapterDao.commonAwards.contains(msg.getId())) {
         this.logger.info("已经领取过了:" + msg.getId());
      } else {
         ChapterPassRewardModel model = (ChapterPassRewardModel)this.player.getGameModelPool().getEntity("chapterPassReward", msg.getId());
         if (model == null) {
            this.logger.info("奖励表为空：" + msg.getId());
         } else {
            this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 15, 1504, 0, 0, "");
            battleChapterDao.commonAwards.add(msg.getId());
            battleChapterDao.updateOp();
            PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
            playerLogPart.logChapter(battleChapterDao.chapterId, 0, 15, 1504, 0, 0, Convert.toStr(battleChapterDao.commonAwards));
            BattleChapterMsg.S2C_CommonAwardId_7218.Builder builder = BattleChapterMsg.S2C_CommonAwardId_7218.newBuilder();
            builder.addIds(msg.getId());
            this.player.sendMsg(builder.build());
            this.player.updateGuideStep(msg.getGuideStep());
            this.player.triggerTask(605, msg.getId(), 1L, 0);
         }
      }
   }

   public void S2C_CommonAwardId_7218() {
      BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
      if (!battleChapterDao.commonAwards.isEmpty()) {
         BattleChapterMsg.S2C_CommonAwardId_7218.Builder builder = BattleChapterMsg.S2C_CommonAwardId_7218.newBuilder();

         for(Integer awardId : battleChapterDao.commonAwards) {
            builder.addIds(awardId);
         }

         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_TakeBonusAwardId_7219(BattleChapterMsg.C2S_TakeBonusAwardId_7219 msg, String source) {
      BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
      if (battleChapterDao.chapterId < msg.getId()) {
         this.logger.info("还没有通关:" + msg.getId());
      } else if (battleChapterDao.bonusAwards.contains(msg.getId())) {
         this.logger.info("已经领取过了:" + msg.getId());
      } else {
         ChapterPassRewardModel model = (ChapterPassRewardModel)this.player.getGameModelPool().getEntity("chapterPassReward", msg.getId());
         if (model == null) {
            this.logger.info("奖励表为空：" + msg.getId());
         } else {
            List<ResourceModel> otherList = new ArrayList();
            otherList.addAll(model.getBonus());

            for(ResourceModel bonus : model.getBonus()) {
               if (bonus.getType() == 3 && model.getBonustar() > 0) {
                  HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", bonus.getId());
                  if (heroModel.getStar() != model.getBonustar()) {
                     this.logger.info("奖励英雄星级特殊，模板星级={}，需要星级={}", heroModel.getStar(), model.getBonustar());
                     otherList.remove(bonus);
                     HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                     heroBagPart.addHeroForAssign(bonus.getId(), bonus.getValue(), 1, model.getBonustar(), 15, 1505, msg.getId(), battleChapterDao.chapterId, "TakeBonusAwardId");
                  }
               }
            }

            if (!otherList.isEmpty()) {
               this.player.addResource(otherList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 15, 1505, 0, 0, "");
            }

            battleChapterDao.bonusAwards.add(msg.getId());
            battleChapterDao.updateOp();
            PlayerLogPart playerLogPart = (PlayerLogPart)this.player.getMgrPart(PlayerLogPart.class);
            playerLogPart.logChapter(battleChapterDao.chapterId, 0, 15, 1505, 0, 0, Convert.toStr(battleChapterDao.bonusAwards));
            BattleChapterMsg.S2C_BonusAwardsId_7220.Builder builder = BattleChapterMsg.S2C_BonusAwardsId_7220.newBuilder();
            builder.addIds(msg.getId());
            this.player.sendMsg(builder.build());
         }
      }
   }

   public void S2C_BonusAwardsId_7220() {
      BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
      if (!battleChapterDao.bonusAwards.isEmpty()) {
         BattleChapterMsg.S2C_BonusAwardsId_7220.Builder builder = BattleChapterMsg.S2C_BonusAwardsId_7220.newBuilder();

         for(Integer awardId : battleChapterDao.bonusAwards) {
            builder.addIds(awardId);
         }

         this.player.sendMsg(builder.build());
      }
   }

   public int getFastFightState() {
      int state = 0;
      boolean isPrivilege = false;
      PlayerDao playerDao = this.player.getPlayerDao();
      isPrivilege = playerDao.privilege_fast_fight > 0;
      SpecialTaskActivityPart specialTaskActivityPart = (SpecialTaskActivityPart)this.player.getMgrPart(SpecialTaskActivityPart.class);
      int activityId = specialTaskActivityPart.getPlayerActivityId();
      boolean isActivity = false;
      if (activityId == 1190) {
         isActivity = true;
      }

      if (isActivity && isPrivilege) {
         state = 2;
      } else if (isPrivilege) {
         state = 1;
      } else if (isActivity) {
         state = 3;
      }

      return state;
   }

   @MsgHandlerAnno
   public void C2S_HeroStrongList_7225(BattleChapterMsg.C2S_HeroStrongList_7225 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      BattleChapterMsg.S2C_HeroStrongListResult_7226.Builder builder = BattleChapterMsg.S2C_HeroStrongListResult_7226.newBuilder();
      ArrayingMirror heroArrayingDao = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
      if (heroArrayingDao.arrayingElementsMap.isEmpty()) {
         this.player.failure(21000);
      } else {
         for(Map.Entry<Byte, ArrayingEntity> entry : heroArrayingDao.arrayingElementsMap.entrySet()) {
            if (((ArrayingEntity)entry.getValue()).heroAndFriend()) {
               HeroDao heroDao = heroBagPart.getHeroByCode(((ArrayingEntity)entry.getValue()).code);
               if (heroDao == null) {
                  this.logger.info("武将变强--镜像里面的英雄不存在={}", ((ArrayingEntity)entry.getValue()).code);
               } else {
                  HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
                  BattleChapterMsg.HeroStrongInfo.Builder heroBuilder = BattleChapterMsg.HeroStrongInfo.newBuilder();
                  heroBuilder.setHeroId(heroDao.id);
                  if (heroDao.dressId > 0) {
                     HeroDressModel heroDressModel = (HeroDressModel)this.player.getGameModelPool().getEntity("heroDress", heroDao.dressId);
                     if (heroDressModel != null) {
                        heroBuilder.setHeroId(heroDressModel.getChangedHeroId());
                     }
                  }

                  heroBuilder.setHeroLv(heroDao.getLv());
                  heroBuilder.setHeroStar(heroDao.getStar());
                  heroBuilder.setHeroName(heroModel.getName());
                  heroBuilder.setInheritNation(heroDao.inheritNation);

                  for(BattleChapterMsg.ScoreType type : BattleChapterMsg.ScoreType.values()) {
                     BattleChapterMsg.ScoreModel.Builder modelBuilder = BattleChapterMsg.ScoreModel.newBuilder();
                     modelBuilder.setType(type);
                     int myScore = 0;
                     int maxScore = 0;
                     switch (type) {
                        case SCORE_TYPE_TOTAL:
                           myScore = heroDao.totalScore;
                           maxScore = worldMgr.getScore("1", heroModel.getId());
                           break;
                        case SCORE_TYPE_UNION:
                           myScore = heroDao.score_union;
                           maxScore = worldMgr.getScore("7", heroModel.getId());
                           break;
                        case SCORE_TYPE_EQUOIP:
                           myScore = heroDao.score_equip;
                           maxScore = worldMgr.getScore("3", heroModel.getId());
                           break;
                        case SCORE_TYPE_HERO_LV:
                           myScore = heroDao.score_lv;
                           maxScore = worldMgr.getScore("2", heroModel.getId());
                           break;
                        case SCORE_TYPE_HERO_STAR:
                           myScore = heroDao.score_star;
                           maxScore = worldMgr.getScore("4", heroModel.getId());
                           break;
                        case SCORE_TYPE_ARMYADVISER:
                           myScore = heroDao.score_artifact_strong;
                           maxScore = worldMgr.getScore("6", heroModel.getId());
                           break;
                        case SCORE_TYPE_HERO_BREACH:
                           myScore = heroDao.score_breach;
                           maxScore = worldMgr.getScore("5", heroModel.getId());
                           break;
                        case SCORE_TYPE_WARRIOR_SIGNET:
                           myScore = heroDao.score_warriorignet;
                           maxScore = worldMgr.getScore("8", heroModel.getId());
                     }

                     if (myScore > maxScore) {
                        maxScore = myScore;
                     }

                     modelBuilder.setMyScore(myScore);
                     modelBuilder.setMaxScore(maxScore);
                     heroBuilder.addModels(modelBuilder);
                  }

                  Map<Integer, StarMapPoint> starMapPointMap = heroDao.recHeroStarMapPointMap();
                  if (null != starMapPointMap && starMapPointMap.size() > 0) {
                     heroBuilder.addAllStarMapPointInfo(StarMapDefine.toBuilderStarMapPointInfoList(starMapPointMap));
                  }

                  builder.addInfos(heroBuilder);
               }
            }
         }

         this.player.sendMsg(builder.build());
      }
   }

   public int getMinutesByVip() {
      int second = 720;
      PlayerPublicDao playerdao = this.player.getPublicDao();
      VipModel vipModel = (VipModel)this.player.getGameModelPool().getEntity("vip", playerdao.vip_lv);
      return vipModel == null ? second : vipModel.getHangBenefitsLong() / 60;
   }

   public void levelUp(int preLv, int newLv) {
      List<Integer> fastbattleNumAdd = this.configManager.getIntList("fastbattleNumAdd");
      if (fastbattleNumAdd != null && fastbattleNumAdd.size() >= 2) {
         int lv = (Integer)fastbattleNumAdd.get(0);
         if (preLv < lv && newLv >= lv) {
            PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
            playerExtend.fastFightNum += (Integer)fastbattleNumAdd.get(1);
            this.player.updatePlayerExtend(13);
            this.toChapterMainUi();
         }
      }

   }

   public void guanJiaOperate(int systemId, int num) {
      GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
      BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
      if (num > 0 && battleChapterDao.chapterId != 0) {
         int enableFreeNum = 0;
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         int freeFastNum = (Integer)playerResetCustomCache.getDailyNum(121, 0);
         int fastModelId = this.getFastFightState();
         ChapterFastBattleModel chapterFastBattleModel = (ChapterFastBattleModel)this.player.getGameModelPool().getEntity("chapterFastBattle", fastModelId);
         if (chapterFastBattleModel.getFreeNum() - freeFastNum > 0) {
            enableFreeNum = chapterFastBattleModel.getFreeNum() - freeFastNum;
         }

         int needTotalGold = 0;
         int needTotalScore = 0;
         int useFreeNum = enableFreeNum >= num ? num : enableFreeNum;
         int useGoldFastNum = (Integer)playerResetCustomCache.getDailyNum(122, 0);
         int totalGoldFastNum = chapterFastBattleModel.getCosts().size();
         int enableGoldNum = totalGoldFastNum - useGoldFastNum;
         String[] activityPointArr = ApplicationContextProvider.getConfigString("FastCombatPoints", "").split("\\|");
         SpecialTaskActivityPart specialTaskActivityPart = (SpecialTaskActivityPart)this.player.getMgrPart(SpecialTaskActivityPart.class);
         if (num > enableFreeNum) {
            if (enableGoldNum <= 0) {
               guanJiaPart.checkState(systemId, (List)null);
               this.logger.error("【管家-快速作战】玩家={}，次数={}，状态={},useFreeNum={},useGoldFastNum={}，totalGoldFastNum={}", new Object[]{this.player.getPlayerId(), num, fastModelId, useFreeNum, useGoldFastNum, totalGoldFastNum});
               return;
            }

            if (num > enableFreeNum + enableGoldNum) {
               this.logger.error("【管家-快速作战】玩家={}，可用快速作战次数不足，状态={}，请求={}，可用免费={}，可用收费={}", new Object[]{this.player.getPlayerId(), fastModelId, num, enableFreeNum, enableGoldNum});
               guanJiaPart.checkState(systemId, (List)null);
               return;
            }

            for(int i = useGoldFastNum; i < num - useFreeNum; ++i) {
               int gold = (Integer)chapterFastBattleModel.getCosts().get(i);
               needTotalGold += gold;
               switch (gold) {
                  case 50:
                     needTotalScore += Integer.parseInt(activityPointArr[1]);
                     break;
                  case 100:
                     needTotalScore += Integer.parseInt(activityPointArr[2]);
                     break;
                  case 200:
                     needTotalScore += Integer.parseInt(activityPointArr[3]);
               }
            }

            ResourceModel needGoldModel = new ResourceModel(1, PlayerDefine.PLAYER_GOLD, needTotalGold);
            if (!this.player.checkResourceNum(needGoldModel)) {
               guanJiaPart.checkState(systemId, (List)null);
               this.logger.error("【管家-快速作战】玩家={}，所需资源不足,num={},needTotalGold={}", new Object[]{this.player.getPlayerId(), num, needTotalGold});
               return;
            }

            playerResetCustomCache.addDailyReset(122, num - useFreeNum);
            this.player.delResource(needGoldModel, 15, 1509, 0, 0, "");
            specialTaskActivityPart.addPoint(1190, needTotalScore);
         }

         if (useFreeNum > 0) {
            playerResetCustomCache.addDailyReset(121, useFreeNum);
            specialTaskActivityPart.addPoint(1190, Integer.parseInt(activityPointArr[0]) * useFreeNum);
         }

         int times = chapterFastBattleModel.getAccelerate() / 60;
         List<ResourceModel> rewardList = new ArrayList();

         for(int i = 0; i < num; ++i) {
            for(ResourceModel rewardsByMinute : this.getRewardsByMinutes(times, true)) {
               ResourceModel.addResourceToList(rewardList, rewardsByMinute);
            }
         }

         this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 15, 1509, 0, 0, "");
         this.player.triggerTask(105, 0, (long)num, 1);
         int fastFightAddNum = (Integer)playerResetCustomCache.getDailyNum(127, 0);
         this.sendFastBattleResult(freeFastNum + useFreeNum, useGoldFastNum + num - useFreeNum, fastFightAddNum);
         this.player.getOperationMgr().addExtraLog(this.player, 102, String.valueOf(needTotalGold), String.valueOf(enableFreeNum + enableFreeNum + 1));
         guanJiaPart.checkState(systemId, rewardList);
      } else {
         guanJiaPart.checkState(systemId, (List)null);
         this.logger.error("【管家-快速作战】玩家={}，次数={},章节={}", new Object[]{this.player.getPlayerId(), num, battleChapterDao.chapterId});
      }
   }

   @MsgHandlerAnno
   public void C2S_ChapterSendState_2029(PlayerMsg.C2S_ChapterSendState_2029 msg, String source) {
      this.logger.info("玩家={}，订阅类型={}，accept={}，channelId={}", new Object[]{this.player.getPlayerId(), msg.getType(), msg.getAccept(), msg.getChannelId()});
      this.battleChapterMgr.updatePlayerState(this.player.getPlayerId(), msg.getType(), msg.getAccept(), msg.getChannelId(), msg.getOpenId());
      PlayerMsg.S2C_ChapterSendState_2030.Builder builder = PlayerMsg.S2C_ChapterSendState_2030.newBuilder();
      builder.setResult(1);
      this.player.sendMsg(builder.build());
   }

   @TaskMethod
   public void sendWeChatData(String channelId, String openId) {
      int hour = this.getPlayerChat();
      int wechatNeedHour = this.configManager.getIntDefault("wechatNeedHour", 4);
      this.logger.info("玩家={},挂机累积收益={}小时", this.player.getPlayerId(), hour);
      if (hour >= wechatNeedHour) {
         StringBuilder paramMap = new StringBuilder();
         LanguageModel languageModel_title = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "wechat_titel");
         LanguageModel languageModel_content = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "wechat_content");
         String url = MessageFormat.format(this.battleChapterMgr.getWeChatUrl(), channelId);
         paramMap.append("openid").append("=").append(openId);
         paramMap.append("&");
         paramMap.append("title").append("=").append(URLEncoder.encode(languageModel_title.getValue()));
         paramMap.append("&");
         paramMap.append("content").append("=").append(URLEncoder.encode(languageModel_content.getValue()));
         this.logger.info("url={}?{}", url, paramMap.toString());
         String result = HttpClient.sendGet(url, paramMap.toString());
         this.logger.info("结果={}", result);
         this.battleChapterMgr.updateSendTime(this.player.getPlayerId());
      }
   }

   public int getPlayerChat() {
      BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
      if (battleChapterDao.settleMinutes >= this.getMinutesByVip()) {
         return this.getMinutesByVip() / 60;
      } else {
         long currentTime = System.currentTimeMillis();
         int times = (int)((currentTime - battleChapterDao.settleTime) / 60000L);
         if (times < 1) {
            return 0;
         } else {
            int totalTimes = battleChapterDao.settleMinutes + times;
            if (totalTimes > this.getMinutesByVip()) {
               times = this.getMinutesByVip() - battleChapterDao.settleMinutes;
            }

            return times / 60;
         }
      }
   }

//   public void gmTest(String orderStr) {
//      String[] orders = orderStr.split(",");
//      if (orders.length < 1) {
//         this.logger.info("GM命令参数错误，oder={}", orderStr);
//      } else {
//         switch (cmd.toLowerCase()) {
//            case "state":
//               int type = Integer.parseInt(orders[1]);
//               int accept = Integer.parseInt(orders[2]);
//               String channelId = orders[3];
//               this.battleChapterMgr.updatePlayerState(this.player.getPlayerId(), type, accept, channelId, "openId");
//               break;
//            case "dojob":
//               int hour = Integer.parseInt(orders[1]);
//               this.battleChapterMgr.pushTaskEx("doJob", new Object[]{hour});
//               break;
//            case "del":
//               this.battleChapterMgr.clearPlayer(this.player.getPlayerId());
//               break;
//            case "send":
//               this.battleChapterMgr.gmTest();
//         }
//
//      }
//   }

   public int getChapterId() {
      BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
      return battleChapterDao.chapterId;
   }

   public void advertisementVnFastBattle() {
      BattleChapterDao battleChapterDao = (BattleChapterDao)this.player.getData("tb_battle_chapter", this.player.getPlayerId());
      if (battleChapterDao.chapterId == 0) {
         this.logger.error("玩家【{}】越南广告奖励领取失败,征战至少通关一关", this.player.getPlayerId());
      } else {
         int fastModelId = this.getFastFightState();
         ChapterFastBattleModel chapterFastBattleModel = (ChapterFastBattleModel)this.player.getGameModelPool().getEntity("chapterFastBattle", fastModelId);
         int times = chapterFastBattleModel.getAccelerate() / 60;
         List<ResourceModel> rewardList = this.getRewardsByMinutes(times, true);
         this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_TYPE_FAST_CHAPTER, 122, 12201, 0, 0, "fastBattle");
         String[] activityPointArr = ApplicationContextProvider.getConfigString("FastCombatPoints", "").split("\\|");
         SpecialTaskActivityPart specialTaskActivityPart = (SpecialTaskActivityPart)this.player.getMgrPart(SpecialTaskActivityPart.class);
         specialTaskActivityPart.addPoint(1190, Integer.parseInt(activityPointArr[0]));
         this.player.triggerTask(105, 0, 1L, 1);
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         int freeFastNum = (Integer)playerResetCustomCache.getDailyNum(121, 0);
         int goldFastNum = (Integer)playerResetCustomCache.getDailyNum(122, 0);
         this.player.getOperationMgr().addExtraLog(this.player, 102, "0(广告)", String.valueOf(freeFastNum + goldFastNum + 1));
      }
   }
}
