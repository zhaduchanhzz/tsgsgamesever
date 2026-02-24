package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.BattleDao;
import com.gzbz.db.HeroArrayingDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.ThemeActivityDao;
import com.gzbz.db.bean.ActivityHeroSkinData;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.expedition.ExpeditionPart;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroRankMgr;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.ActivityOpenTimeModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.SkinActivityBaseModel;
import com.gzbz.model.SkinActivityFlopAwardLibModel;
import com.gzbz.model.SkinActivityFlopAwardModel;
import com.gzbz.model.SkinActivityIntegralAwardModel;
import com.gzbz.model.SkinActivityLuckyAwardModel;
import com.gzbz.model.SkinActivityTaskModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.model.manager.SkinActivityDamageAwardModel;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.SkinActivityMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.RankData;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.SkinActivityTaskPart;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import misc.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class HeroSkinActivityPart extends AbstractActivityPart {
   @Autowired
   RankMgr rankMgr;
   @Autowired
   WorldMgr worldMgr;
   @Autowired
   ConfigManager configManager;
   @Autowired
   private HeroRankMgr heroRankMgr;

   public void loginHandle() {
      SkinActivityTaskPart skinActivityTaskPart = (SkinActivityTaskPart)this.player.getMgrPart(SkinActivityTaskPart.class);
      skinActivityTaskPart.checkLogin();
   }

   public void rotateReset(int oldActivityId) {
      ActivityHeroSkinData activityHeroSkinData = this.getHeroSkinData();
      activityHeroSkinData.reset();
      this.updateThemeDao();
      ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)this.player.getGameModelPool().getEntity("activityopenTime", oldActivityId);
      if (activityOpenTimeModel != null) {
         this.player.delResourceAllNum(activityOpenTimeModel.getIntegralType(), activityOpenTimeModel.getIntegralId(), 45, 6605, 0, oldActivityId, "");
      }

      SkinActivityTaskPart skinActivityTaskPart = (SkinActivityTaskPart)this.player.getMgrPart(SkinActivityTaskPart.class);

      for(TaskData taskData : skinActivityTaskPart.getTasksMap().values()) {
         taskData.delete();
      }

      this.clearActivityGift(24);
      ActivityOpenTimeModel curActivityOpenTimeModel = (ActivityOpenTimeModel)this.player.getGameModelPool().getEntity("activityopenTime", this.getPlayerActivityId());
      if (curActivityOpenTimeModel != null) {
         ExpeditionPart expeditionPart = (ExpeditionPart)this.player.getMgrPart(ExpeditionPart.class);
         int expeditionId = curActivityOpenTimeModel.getExpeditionId();
         expeditionPart.resetChatpter(expeditionId);
      }

   }

   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         ActivityHeroSkinData activityHeroSkinData = this.getHeroSkinData();
         SkinActivityMsg.S2C_OpenActivityUi_13602.Builder builder = SkinActivityMsg.S2C_OpenActivityUi_13602.newBuilder();
         builder.setFight(activityHeroSkinData.fight);
         builder.setTotalDamage(activityHeroSkinData.totalDamage);
         builder.addAllFightReward(activityHeroSkinData.fightReward);
         builder.setTotalPoint(activityHeroSkinData.totalPoint);
         builder.addAllPointReward(activityHeroSkinData.pointReward);
         this.player.sendMsg(builder.build());
      }
   }

   public ActivityHeroSkinData getHeroSkinData() {
      ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
      return themeActivityDao.skinActivity;
   }

   public void updateThemeDao() {
      ThemeActivityDao themeActivityDao = (ThemeActivityDao)this.player.getData("tb_player_theme_activity", this.player.getPlayerId());
      themeActivityDao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_OpenActivityUi_13601(SkinActivityMsg.C2S_OpenActivityUi_13601 msg, String source) {
      ActivityHeroSkinData activityHeroSkinData = this.getHeroSkinData();
      SkinActivityMsg.S2C_OpenActivityUi_13602.Builder builder = SkinActivityMsg.S2C_OpenActivityUi_13602.newBuilder();
      builder.setFight(activityHeroSkinData.fight);
      builder.setTotalDamage(activityHeroSkinData.totalDamage);
      builder.addAllFightReward(activityHeroSkinData.fightReward);
      builder.setTotalPoint(activityHeroSkinData.totalPoint);
      builder.addAllPointReward(activityHeroSkinData.pointReward);
      this.player.sendMsg(builder.build());
   }

   public int getActivityType() {
      return 19;
   }

   @MsgHandlerAnno
   public void C2S_Mate_13603(SkinActivityMsg.C2S_Mate_13603 msg, String source) {
      int limitFight = this.getConfigManager().getIntDefault("skinActivityFightTime", 4);
      ActivityHeroSkinData data = this.getHeroSkinData();
      if (data.fight >= limitFight) {
         this.logger.info("玩家={}，皮肤活动已经没有次数={}", this.player.getPlayerId(), data.fight);
      } else {
         long power = this.player.getPlayerCombatPower();
         String matchLimit = this.getConfigManager().getStr("skinActivityMatchPower");
         String[] powerLimit = matchLimit.split(",");
         int matchPlayerId = 0;

         for(int i = 0; i < powerLimit.length; ++i) {
            int minLimit = Integer.parseInt(powerLimit[i].split("\\|")[0]);
            int maxLimit = Integer.parseInt(powerLimit[i].split("\\|")[1]);
            long minPower = power * (long)minLimit / 10000L;
            long maxPower = power * (long)maxLimit / 10000L;
            List<RankData> rankDataList = this.rankMgr.getRanks(RankDefine.RankModule.COMBAT_POWER, minPower, Math.max(maxPower, 20000L));
            if (!rankDataList.isEmpty()) {
               List<Integer> matchList = new ArrayList();

               for(RankData rankData : rankDataList) {
                  if (!data.dailyMatchIds.contains(rankData.value) && rankData.value != this.player.getPlayerId()) {
                     matchList.add(rankData.value);
                  }
               }

               if (!matchList.isEmpty()) {
                  Collections.shuffle(matchList);
                  int match = (Integer)matchList.get(0);
                  GamePlayer matchPlayer = this.worldMgr.getPlayerById(match);
                  if (matchPlayer != null) {
                     matchPlayerId = matchPlayer.getPlayerId();
                     break;
                  }
               }
            }
         }

         if (matchPlayerId == 0) {
            List<RankData> rankDataList = this.rankMgr.getRanks(RankDefine.RankModule.COMBAT_POWER, 100);
            if (rankDataList.isEmpty()) {
               this.player.failure(61067);
               return;
            }

            List<RankData> enableList = new ArrayList();

            for(RankData rankData : rankDataList) {
               if (!data.dailyMatchIds.contains(rankData.value) && rankData.value != this.player.getPlayerId()) {
                  enableList.add(rankData);
               }
            }

            if (enableList.isEmpty()) {
               this.player.failure(61067);
               return;
            }

            Collections.shuffle(enableList);
            matchPlayerId = ((RankData)enableList.get(0)).value;
         }

         if (matchPlayerId == 0) {
            if (this.worldMgr.getOnlinePlayerMap().isEmpty()) {
               this.player.failure(61067);
               return;
            }

            List<Integer> playerList = new ArrayList();
            playerList.addAll(this.worldMgr.getOnlinePlayerMap().keySet());
            Collections.shuffle(playerList);
            if (playerList.isEmpty() || playerList.size() == 1 && (Integer)playerList.get(0) == this.player.getPlayerId()) {
               this.player.failure(61067);
               return;
            }

            if ((Integer)playerList.get(0) == this.player.getPlayerId()) {
               matchPlayerId = (Integer)playerList.get(playerList.size() - 1);
            } else {
               matchPlayerId = (Integer)playerList.get(0);
            }
         }

         GamePlayer matchPlayer = this.worldMgr.getPlayerById(matchPlayerId);
         data.matchPlayerId = matchPlayerId;
         this.updateThemeDao();
         PlayerPublicDao matchDao = matchPlayer.getPublicDao();
         SkinActivityMsg.S2C_Mate_13604.Builder builder = SkinActivityMsg.S2C_Mate_13604.newBuilder();
         builder.setPower(matchPlayer.getPlayerCombatPower());
         builder.setMonarchId(matchDao.monarchId);
         builder.setPlayerName(matchDao.playerName);
         builder.setSex(matchDao.sex);
         ArrayingMirror arrayingMirror = matchPlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_SKIN_ACTIVITY);
         if (arrayingMirror == null || arrayingMirror.arrayingElementsMap.isEmpty()) {
            arrayingMirror = matchPlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
         }

         builder.setArraying(arrayingMirror.toPlayerArrayingInfo());
         this.player.sendMsg(builder.build());
      }
   }

   public int enterBattle(BattleDao battleDao) {
      int limitFight = this.getConfigManager().getIntDefault("skinActivityFightTime", 4);
      ActivityHeroSkinData data = this.getHeroSkinData();
      if (data.fight >= limitFight) {
         return 51;
      } else if (data.matchPlayerId == 0) {
         return 0;
      } else {
         ActivityInfo activityInfo = this.getServerActivityInfo();
         SkinActivityBaseModel skinActivityBaseModel = (SkinActivityBaseModel)this.player.getGameModelPool().getEntity("skinActivityBase", activityInfo.id);
         int bossId = skinActivityBaseModel.getBattleId();
         PlayerDao playerDao = this.player.getPlayerDao();
         ArrayingMirror arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_SKIN_ACTIVITY);
         if (arrayingMirror == null || arrayingMirror.arrayingElementsMap.isEmpty()) {
            arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
         }

         BattlePKTeam battlePKTeam1 = new BattlePKTeam(playerDao.playerId, playerDao.playerName, arrayingMirror, playerDao.lv, playerDao.head, playerDao.headFrame, this.heroRankMgr.getHeroRankCompensate(arrayingMirror, this.player.isRobot()));
         BattlePKTeam battlePKTeam2 = new BattlePKTeam(bossId);
         battleDao.scene.addPKTeam((byte)0, battlePKTeam1);
         battleDao.scene.addPKTeam((byte)1, battlePKTeam2);
         battleDao.scene.setWave((short)1, (short)2);
         int maxRound = this.getConfigManager().getIntDefault("skinActivityBossRound", 10);
         battleDao.scene.setMaxRound((byte)maxRound);
         return 1;
      }
   }

   public int nextBattle(BattleDao battleDao) {
      ActivityHeroSkinData data = this.getHeroSkinData();
      GamePlayer matchPlayer = this.worldMgr.getPlayerById(data.matchPlayerId);
      data.dailyMatchIds.add(data.matchPlayerId);
      this.updateThemeDao();
      if (matchPlayer == null) {
         return 0;
      } else {
         PlayerPublicDao matchDao = matchPlayer.getPublicDao();
         ArrayingMirror matchArraying = matchPlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_SKIN_ACTIVITY);
         if (matchArraying == null || matchArraying.arrayingElementsMap.isEmpty()) {
            matchArraying = matchPlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
         }

         BattlePKTeam battlePKTeam3 = new BattlePKTeam(matchDao.playerId, matchDao.playerName, matchArraying, matchDao.lv, matchDao.head, matchDao.headFrame, this.heroRankMgr.getHeroRankCompensate(matchArraying, matchPlayer.isRobot()));
         battleDao.scene.addPKTeam((byte)0, battlePKTeam3);
         int maxRound = this.getConfigManager().getIntDefault("skinActivityBossRound", 10);
         battleDao.scene.setMaxRound((byte)maxRound);
         battleDao.scene.setWave((short)2, (short)2);
         return 1;
      }
   }

   public void afterFight(BattleDao battleDao) {
      if (battleDao.scene.getWave() == 1) {
         BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().build().getResult().toBuilder();
         result.setResult(0);
         long damage = battleDao.scene.getPKTeam((byte)1).getDamageValue();
         result.addSettleInfo(damage);
         battleDao.scene.getBattleMsg().setResult(result);
         ActivityHeroSkinData data = this.getHeroSkinData();
         data.totalDamage += damage;
         ++data.fight;
         data.firstDamage = damage;
         int mvpHeroId = 0;
         long tempDamage = 0L;

         for(Entity entity : battleDao.scene.getPKTeam((byte)0).getEntityMap().values()) {
            if (entity.getAttackValue() > tempDamage) {
               tempDamage = entity.getAttackValue();
               mvpHeroId = entity.getDressHeroId();
            }
         }

         data.mvpHeroId = mvpHeroId;
         this.updateThemeDao();
      } else {
         battleDao.status = 0;
         battleDao.updateOp();
         long damage = battleDao.scene.getPKTeam((byte)1).getDamageValue();
         ActivityHeroSkinData data = this.getHeroSkinData();
         long realDamage = damage - data.firstDamage;
         data.totalDamage += realDamage;
         data.secondDamage = realDamage;
         this.updateThemeDao();
         List<ResourceModel> commonAward = new ArrayList();
         ActivityInfo activityInfo = this.getServerActivityInfo();
         ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)this.player.getGameModelPool().getEntity("activityopenTime", activityInfo.id);
         SkinActivityDamageAwardModel damageAwardModel = this.getDamageRewardModel(data.firstDamage + data.secondDamage);

         for(ResourceModel resourceModel : damageAwardModel.getReward()) {
            ResourceModel.addResourceToList(commonAward, resourceModel);
            if (resourceModel.getType() == activityOpenTimeModel.getIntegralType() && resourceModel.getId() == activityOpenTimeModel.getIntegralId()) {
               data.totalPoint += resourceModel.getValue();
            }
         }

         battleDao.rewards.addAll(commonAward);
         BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().build().getResult().toBuilder();

         for(ResourceModel resource : commonAward) {
            int type = resource.getType();
            int resourceId = resource.getId();
            int value = resource.getValue();
            result.addAwardItems(CommonMsg.ItemInfo.newBuilder().setType(type).setId(resourceId).setNum(value));
         }

         result.setResult(0);
         battleDao.scene.getBattleMsg().setResult(result);
         BattleMsg.S2C_BattleResult_6102.Builder builder = battleDao.scene.getBattleMsg();
         builder.setIsNextWave(true);
         builder.addExParams(data.mvpHeroId);
         battleDao.scene.setBattleMsg(builder);
      }

      if (battleDao.scene.getWave() > 1) {
         String award = "";
         if (!battleDao.rewards.isEmpty()) {
            this.player.addResource(battleDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 66, 6601, 0, 0, "");

            for(ResourceModel reward : battleDao.rewards) {
               award = award + reward.getId() + "-" + reward.getValue() + ",";
            }
         }

         battleDao.rewards.clear();
         ActivityHeroSkinData data = this.getHeroSkinData();
         long damage = data.firstDamage + data.secondDamage;
         this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "鬼神试炼", award, damage + "", 0, 0, 1);
         this.player.triggerTask(543, 0, 1L, 1);
         this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "鬼神试炼-积分", data.totalPoint + "", "", 0, 0, 0);
      }

   }

   public void endBattle(BattleDao battleDao) {
      ActivityHeroSkinData data = this.getHeroSkinData();
      SkinActivityMsg.S2C_MatchBattle_13612.Builder builder = SkinActivityMsg.S2C_MatchBattle_13612.newBuilder();
      builder.setDamage(data.firstDamage + data.secondDamage);
      builder.setFightNum(data.fight);
      builder.setTotalDamage(data.totalDamage);
      builder.setTotalPoint(data.totalPoint);
      this.player.sendMsg(builder.build());
   }

   public SkinActivityDamageAwardModel getDamageRewardModel(long damage) {
      ActivityInfo activityInfo = this.getServerActivityInfo();
      List<SkinActivityDamageAwardModel> list = (List)ApplicationContextProvider.getModelPoolEntity("customSkinActivityDamageAward", activityInfo.id);
      if (list != null && !list.isEmpty()) {
         for(SkinActivityDamageAwardModel model : list) {
            if (model.getActivityId() == activityInfo.id && damage >= model.getMinDamage() && (model.getMaxDamage() == 0L || damage < model.getMaxDamage())) {
               return model;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   @MsgHandlerAnno
   public void C2S_PointReward_13607(SkinActivityMsg.C2S_PointReward_13607 msg, String source) {
      ActivityHeroSkinData data = this.getHeroSkinData();
      if (data.pointReward.contains(msg.getId())) {
         this.logger.info("已领取该奖励");
      } else {
         SkinActivityIntegralAwardModel model = (SkinActivityIntegralAwardModel)ApplicationContextProvider.getModelPoolEntity("skinActivityIntegralAward", msg.getId());
         if (model == null) {
            this.logger.info("配置不存在");
         } else {
            ActivityInfo activityInfo = this.getServerActivityInfo();
            if (model.getActivityId() != activityInfo.id) {
               this.logger.info("不是本次活动奖励ID,奖励ID={}，对应活动ID={}，本次活动ID={}", new Object[]{model.getId(), model.getActivityId(), activityInfo.id});
            } else if (data.totalPoint < model.getBonus()) {
               this.logger.info("总积分不足，不可领取");
            } else {
               data.pointReward.add(msg.getId());
               this.updateThemeDao();
               this.player.addResource(model.getReward(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 66, 6602, msg.getId(), 0, "");
               SkinActivityMsg.S2C_PointReward_13608.Builder builder = SkinActivityMsg.S2C_PointReward_13608.newBuilder();
               builder.setId(msg.getId());
               this.player.sendMsg(builder.build());
               this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 16, 19, "鬼神试炼", model.getBonus() + "", model.getBonus() + "", 0, 0, 1);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_OpenTurnCard_13621(SkinActivityMsg.C2S_OpenTurnCard_13621 msg, String source) {
      ActivityHeroSkinData data = this.getHeroSkinData();
      SkinActivityMsg.S2C_OpenTurnCard_13622.Builder builder = SkinActivityMsg.S2C_OpenTurnCard_13622.newBuilder();
      builder.setIsHaveLuck(data.isHaveLuck);
      builder.setRound(data.trunCardRoun);
      if (!data.trunCardMap.isEmpty()) {
         for(Map.Entry<Integer, List<ResourceModel>> entry : data.trunCardMap.entrySet()) {
            SkinActivityMsg.CardInfo.Builder infoBuilder = SkinActivityMsg.CardInfo.newBuilder();
            infoBuilder.setIndex((Integer)entry.getKey());

            for(ResourceModel resourceModel : entry.getValue()) {
               infoBuilder.addItems(resourceModel.builder());
            }

            builder.addInfos(infoBuilder);
         }
      }

      if (data.awardIndex >= 0) {
         SkinActivityLuckyAwardModel model = (SkinActivityLuckyAwardModel)this.player.getGameModelPool().getEntity("skinActivityLuckyAward", data.trunCardRoun);
         if (model != null) {
            builder.setItem(((ResourceModel)model.getLuckAward().get(data.awardIndex)).builder());
         }
      }

      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int dailyDrawNum = (Integer)playerResetCustomCache.getDailyNum(29, 0);
      builder.setDailyDrawNum(dailyDrawNum);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_TurnCard_13623(SkinActivityMsg.C2S_TurnCard_13623 msg, String source) {
      ActivityHeroSkinData data = this.getHeroSkinData();
      if (data.awardIndex < 0) {
         this.logger.info("还有幸运大奖没有选择");
      } else {
         int index = msg.getIndex();
         if (index >= 0 && index <= 39) {
            if (!data.trunCardMap.containsKey(index)) {
               PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
               int dailyNum = (Integer)playerResetCustomCache.getDailyNum(29, 0);
               int newDailyNum = dailyNum + 1;
               int lotteryLimit = this.configManager.getIntDefault("LotteryLimit", 99999);
               if (newDailyNum > lotteryLimit) {
                  this.player.failure(51);
               } else {
                  ActivityInfo activityInfo = this.getServerActivityInfo();
                  SkinActivityBaseModel skinActivityBaseModel = (SkinActivityBaseModel)this.player.getGameModelPool().getEntity("skinActivityBase", activityInfo.id);
                  if (skinActivityBaseModel != null && skinActivityBaseModel.getFlopCost() != null) {
                     if (this.player.checkResourceNum(skinActivityBaseModel.getFlopCost())) {
                        Map<Integer, SkinActivityFlopAwardModel> timesMap = (Map)this.player.getGameModelPool().getEntity("customSkinActivityFlopAward", data.trunCardRoun);
                        if (timesMap != null && !timesMap.isEmpty()) {
                           int times = data.trunCardMap.size() + 1;
                           if (!timesMap.containsKey(times)) {
                              this.logger.info("配置表次数错误，当前次数={},当前轮次={}", times, data.trunCardRoun);
                           } else {
                              SkinActivityFlopAwardModel model = (SkinActivityFlopAwardModel)timesMap.get(times);
                              boolean isLuck = false;
                              if (model.getLuckyAwardRate() > 0) {
                                 int r = RandomUtil.randInt(10000);
                                 if (r < model.getLuckyAwardRate()) {
                                    isLuck = true;
                                 }
                              }

                              List<ResourceModel> addList = new ArrayList();
                              boolean isReset = false;
                              if (isLuck) {
                                 Map<Integer, SkinActivityLuckyAwardModel> roundMap = (Map)this.player.getGameModelPool().getEntity("customSkinActivityLuckyAward", activityInfo.id);
                                 if (roundMap == null || roundMap.isEmpty()) {
                                    return;
                                 }

                                 SkinActivityLuckyAwardModel skinActivityLuckyAwardModel = (SkinActivityLuckyAwardModel)roundMap.get(data.trunCardRoun);
                                 if (skinActivityLuckyAwardModel == null) {
                                    return;
                                 }

                                 ResourceModel luckyModel = (ResourceModel)skinActivityLuckyAwardModel.getLuckAward().get(data.awardIndex);
                                 addList.add(luckyModel);
                                 data.trunCardMap.put(index, addList);
                                 ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)this.player.getGameModelPool().getEntity("activityopenTime", activityInfo.id);
                                 if (!activityOpenTimeModel.getExtendParams().isEmpty()) {
                                    int itemId = Integer.parseInt(activityOpenTimeModel.getExtendParams());
                                    if (itemId == luckyModel.getId()) {
                                       data.isHaveLuck = true;
                                    }
                                 }

                                 if (data.trunCardRoun >= 3) {
                                    data.trunCardRoun = 1;
                                 } else {
                                    ++data.trunCardRoun;
                                 }

                                 data.trunCardMap.clear();
                                 data.awardIndex = -1;
                                 isReset = true;
                                 this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "无双魔将-幸运", luckyModel.getType() + "-" + luckyModel.getId() + "-" + luckyModel.getValue(), "", 0, 0, 0);
                              } else {
                                 List<SkinActivityFlopAwardLibModel> flopAwardLibModels = (List)this.player.getGameModelPool().getEntity("customSkinActivityFlopAwardLib", model.getLibId());
                                 if (flopAwardLibModels == null || flopAwardLibModels.isEmpty()) {
                                    return;
                                 }

                                 int totalWeight = 0;

                                 for(SkinActivityFlopAwardLibModel flopAwardLibModel : flopAwardLibModels) {
                                    totalWeight += flopAwardLibModel.getWeight();
                                 }

                                 int r = RandomUtil.randInt(totalWeight);
                                 int temp = 0;

                                 for(SkinActivityFlopAwardLibModel flopAwardLibModel : flopAwardLibModels) {
                                    temp += flopAwardLibModel.getWeight();
                                    if (r < temp) {
                                       addList.addAll(flopAwardLibModel.getAward());
                                       data.trunCardMap.put(index, addList);

                                       for(ResourceModel resourceModel : flopAwardLibModel.getAward()) {
                                          this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "无双魔将-翻牌", resourceModel.getType() + "-" + resourceModel.getId() + "-" + resourceModel.getValue(), data.trunCardRoun + "", index + 1, 0, 0);
                                       }
                                       break;
                                    }
                                 }
                              }

                              this.updateThemeDao();
                              this.player.delResource(skinActivityBaseModel.getFlopCost(), 66, 6604, index, 0, isLuck + "");
                              this.player.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_DELAY, 45, 6604, index, 0, isLuck + "");
                              playerResetCustomCache.setDailyReset(29, newDailyNum);
                              SkinActivityMsg.S2C_TurnCard_13624.Builder builder = SkinActivityMsg.S2C_TurnCard_13624.newBuilder();
                              builder.setResult(1);
                              builder.setIsLuckReward(isLuck);
                              builder.setIsReset(isReset);
                              builder.setDailyDrawNum(newDailyNum);
                              SkinActivityMsg.CardInfo.Builder infoBuilder = SkinActivityMsg.CardInfo.newBuilder();
                              infoBuilder.setIndex(index);

                              for(ResourceModel resourceModel : addList) {
                                 infoBuilder.addItems(resourceModel.builder());
                              }

                              builder.setInfo(infoBuilder);
                              this.player.sendMsg(builder.build());
                              int itemId = skinActivityBaseModel.getFlopCost().getId();
                              int itemNum = skinActivityBaseModel.getFlopCost().getValue();

                              for(ResourceModel resourceModel : addList) {
                                 String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                                 this.player.getOperationMgr().addExtraLog(this.player, 198, "无双鬼将", itemId + "", itemNum + "", strings[0], strings[2], strings[1], "0");
                              }

                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ChoiceLuckReward_13625(SkinActivityMsg.C2S_ChoiceLuckReward_13625 msg, String source) {
      int awardIndex = msg.getAwardIndex();
      ActivityHeroSkinData data = this.getHeroSkinData();
      ActivityInfo activityInfo = this.getServerActivityInfo();
      Map<Integer, SkinActivityLuckyAwardModel> roundMap = (Map)this.player.getGameModelPool().getEntity("customSkinActivityLuckyAward", activityInfo.id);
      if (roundMap != null && !roundMap.isEmpty()) {
         SkinActivityLuckyAwardModel model = (SkinActivityLuckyAwardModel)roundMap.get(data.trunCardRoun);
         if (model != null) {
            if (!model.getLuckAward().isEmpty() && model.getLuckAward().size() >= awardIndex) {
               if (data.isHaveLuck) {
                  ResourceModel resourceModel = (ResourceModel)model.getLuckAward().get(awardIndex);
                  ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)this.player.getGameModelPool().getEntity("activityopenTime", activityInfo.id);
                  if (!activityOpenTimeModel.getExtendParams().isEmpty()) {
                     int id = Integer.parseInt(activityOpenTimeModel.getExtendParams());
                     if (id == resourceModel.getId()) {
                        this.logger.info("改皮肤大奖已经获得过，不能再选择！");
                        return;
                     }
                  }
               }

               data.awardIndex = awardIndex;
               this.updateThemeDao();
               SkinActivityMsg.S2C_ChoiceLuckReward_13626.Builder builder = SkinActivityMsg.S2C_ChoiceLuckReward_13626.newBuilder();
               builder.setResult(1);
               builder.setItem(((ResourceModel)model.getLuckAward().get(awardIndex)).builder());
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   public void activityEnd(int oldActivityId) {
      HeroMsg.S2C_HeroBaseData_5002.Builder result_builder = HeroMsg.S2C_HeroBaseData_5002.newBuilder();
      HeroArrayingPart mgrPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroArrayingDao arrayingDao = mgrPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_SKIN_ACTIVITY);
      if (arrayingDao != null && !arrayingDao.elements.isEmpty()) {
         for(Map.Entry<Byte, Integer> entry : arrayingDao.elements.entrySet()) {
            switch ((Byte)entry.getKey()) {
               case 0:
               case 1:
               case 2:
               case 3:
               case 4:
               case 5:
                  HeroDao heroDao = heroBagPart.getHeroByCode((Integer)entry.getValue());
                  if (heroDao != null && heroDao.containState(CommonMsg.HeroState.HERO_STATE_SKIN_ACTIVITY.getNumber())) {
                     heroDao.delState(CommonMsg.HeroState.HERO_STATE_SKIN_ACTIVITY.getNumber());
                     heroDao.updateOp();
                     result_builder.addHeros(heroDao.toHeroInfo());
                  }
            }
         }

         arrayingDao.soulHeroCode = 0;
         arrayingDao.elements.clear();
         arrayingDao.deleteOp();
         this.player.sendMsg(result_builder.build());
      }

      ActivityHeroSkinData data = this.getHeroSkinData();
      data.reset();
      this.updateThemeDao();
      ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)this.player.getGameModelPool().getEntity("activityopenTime", oldActivityId);
      if (activityOpenTimeModel != null) {
         this.player.delResourceAllNum(activityOpenTimeModel.getIntegralType(), activityOpenTimeModel.getIntegralId(), 45, 6605, 0, oldActivityId, "");
      }

      SkinActivityTaskPart skinActivityTaskPart = (SkinActivityTaskPart)this.player.getMgrPart(SkinActivityTaskPart.class);

      for(Map.Entry<Integer, TaskData> entry : skinActivityTaskPart.getTasksMap().entrySet()) {
         ((TaskData)entry.getValue()).delete();
      }

   }

   public void resetDaily() {
      ActivityHeroSkinData data = this.getHeroSkinData();
      data.fight = 0;
      data.dailyMatchIds.clear();
      this.updateThemeDao();
      SkinActivityTaskPart skinActivityTaskPart = (SkinActivityTaskPart)this.player.getMgrPart(SkinActivityTaskPart.class);
      skinActivityTaskPart.checkResetDaily();
   }

   public void _slaveServerActSettle(boolean mainOpen, int mainServer) {
      List<ResourceModel> rewardList = new ArrayList();
      SkinActivityTaskPart skinActivityTaskPart = (SkinActivityTaskPart)this.player.getMgrPart(SkinActivityTaskPart.class);
      Map<Integer, TaskData> map = skinActivityTaskPart.getTasksMap();

      for(Map.Entry<Integer, TaskData> entry : map.entrySet()) {
         if (((TaskData)entry.getValue()).state != 3) {
            SkinActivityTaskModel skinActivityTaskModel = (SkinActivityTaskModel)ApplicationContextProvider.getModelPoolEntity("skinActivityTask", (Integer)entry.getKey());
            if (skinActivityTaskModel != null) {
               for(ResourceModel reward : skinActivityTaskModel.getRewards()) {
                  ResourceModel.addResourceToList(rewardList, reward);
               }
            }
         }
      }

      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(skinActivityTaskPart.getModule());
      ActivityHeroSkinData data = this.getHeroSkinData();
      ActivityInfo activityInfo = this.getServerActivityInfo();
      Map<Integer, SkinActivityIntegralAwardModel> modelMap = ApplicationContextProvider.<Integer, SkinActivityIntegralAwardModel>getModelPoolMap("skinActivityIntegralAward");
      if (modelMap != null) {
         for(Map.Entry<Integer, SkinActivityIntegralAwardModel> entry : modelMap.entrySet()) {
            if (((SkinActivityIntegralAwardModel)entry.getValue()).getActivityId() == activityInfo.id && !data.pointReward.contains(entry.getKey())) {
               for(ResourceModel resourceModel : ((SkinActivityIntegralAwardModel)entry.getValue()).getReward()) {
                  ResourceModel.addResourceToList(rewardList, resourceModel);
               }
            }
         }
      }

      this.sendMergeMail(CentreAwardModel.TYPE_MERGE_ACT_NOT_FINISH_REWARD, rewardList);
      data.reset();
      this.updateThemeDao();
   }

   public void gmHeroSkin(String params) {
      ActivityHeroSkinData data = this.getHeroSkinData();
      String[] strArr = params.split(",");
      switch (strArr[0]) {
         case "dam":
            data.totalDamage += Long.parseLong(strArr[1]);
            break;
         case "recard":
            data.isHaveLuck = false;
            data.trunCardRoun = 1;
            data.trunCardMap.clear();
            data.awardIndex = -1;
            break;
         case "resumefight":
            data.fight = 0;
            data.dailyMatchIds.clear();
            break;
         case "allreset":
            data.reset();
      }

      this.updateThemeDao();
      this.sendInfo();
   }
}
