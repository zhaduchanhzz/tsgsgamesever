package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.ActivityLiuBeiDao;
import com.gzbz.db.BattleDao;
import com.gzbz.db.HeroArrayingDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.expedition.ExpeditionPart;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroRankMgr;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.ActivityOpenTimeModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.EventHeroBonusRewardModel;
import com.gzbz.model.EventHeroBossRewardModel;
import com.gzbz.model.EventHeroConfigModel;
import com.gzbz.model.HeroPondRewardModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.ActivityLiuBeiMsg;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.RankData;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ActivityLiuBeiPart extends AddUpAndConRechargeActivityPart {
   @Autowired
   RankMgr rankMgr;
   @Autowired
   WorldMgr worldMgr;
   @Autowired
   ConfigManager configManager;
   @Autowired
   private HeroRankMgr heroRankMgr;
   private static final int REWARD_NORMAL = 1;
   private static final int REWARD_ENJOY = 2;

   public void loginHandle() {
      super.loginHandle();
   }

   public int getAddUpLogReason() {
      return 9103;
   }

   public int getAddUpMail() {
      int mailId = this.configManager.getIntDefault("LiuBeiAddUpMailId", 1920);
      return mailId;
   }

   public String getAddUpExcelName() {
      return "LiuBeiAddUpRecharge";
   }

   public int getConLogReason() {
      return 9104;
   }

   public int getConMail() {
      int mailId = this.configManager.getIntDefault("LiuBeiConMailId", 1910);
      return mailId;
   }

   public String getConExcelName() {
      return "LiuBeiConRecharge";
   }

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         super.resetDaily();
         ActivityLiuBeiDao activityLiuBeiDao = this.getDao();
         activityLiuBeiDao.fight = 0;
         activityLiuBeiDao.updateOp();
         this.sendInfo();
      }
   }

   public void rotateReset(int oldActivityId) {
      ActivityLiuBeiDao activityLiuBeiDao = this.getDao();
      activityLiuBeiDao.reset();
      this.clearActivityGift(24);
      ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)this.player.getGameModelPool().getEntity("activityopenTime", this.getPlayerActivityId());
      if (activityOpenTimeModel != null) {
         ExpeditionPart expeditionPart = (ExpeditionPart)this.player.getMgrPart(ExpeditionPart.class);
         int expeditionId = activityOpenTimeModel.getExpeditionId();
         expeditionPart.resetChatpter(expeditionId);
      }

   }

   public ActivityLiuBeiDao getDao() {
      return (ActivityLiuBeiDao)this.player.getData("tb_activity_liu_bei", this.player.getPlayerId());
   }

   public int getActivityLogModule() {
      return 91;
   }

   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         super.sendInfo();
         ActivityLiuBeiDao activityLiuBeiDao = this.getDao();
         ActivityLiuBeiMsg.S2C_HeroThemeInfo_18702.Builder builder = ActivityLiuBeiMsg.S2C_HeroThemeInfo_18702.newBuilder();
         builder.setFight(activityLiuBeiDao.fight);
         builder.setTotalDamage(activityLiuBeiDao.totalDamage);
         builder.addAllFightReward(activityLiuBeiDao.fightReward);
         builder.setTotalPoint(activityLiuBeiDao.totalPoint);
         builder.addAllPointReward(activityLiuBeiDao.pointReward);
         ActivityInfo activityInfo = this.getServerActivityInfo();
         builder.setStartTime(activityInfo.start);
         builder.setEndTime(activityInfo.end);
         builder.setServerOpenDay(this.getActivityOpenDay());
         builder.setActivityDay(this.getSeverActivityDay());
         this.player.sendMsg(builder.build());
      }
   }

   public int getActivityType() {
      return 67;
   }

   public int getPlayerActivityId() {
      return super.getPlayerActivityId();
   }

   public EventHeroConfigModel getConfigModel() {
      EventHeroConfigModel model = (EventHeroConfigModel)this.player.getGameModelPool().getEntity("eventHeroConfig", this.getPlayerActivityId());
      if (model == null) {
         this.logger.error("主题武将活动配置错误！！！");
      }

      return model;
   }

   @MsgHandlerAnno
   public void C2S_HeroThemeInfo_18701(ActivityLiuBeiMsg.C2S_HeroThemeInfo_18701 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_Mate_18703(ActivityLiuBeiMsg.C2S_Mate_18703 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(21);
      } else {
         EventHeroConfigModel configModel = this.getConfigModel();
         int limitFight = configModel.getEventHeroFightTime();
         ActivityLiuBeiDao activityLiuBeiDao = this.getDao();
         if (activityLiuBeiDao.fight >= limitFight) {
            this.player.failure(0);
         } else {
            long power = this.player.getPlayerCombatPower();
            String matchLimit = configModel.getEventHeroMatchPower();
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
                     matchList.add(rankData.value);
                  }

                  Collections.shuffle(matchList);
                  if (matchList.size() != 1 || (Integer)matchList.get(0) != this.player.getPlayerId()) {
                     int match = 0;
                     if ((Integer)matchList.get(0) == this.player.getPlayerId()) {
                        match = (Integer)matchList.get(matchList.size() - 1);
                     } else {
                        match = (Integer)matchList.get(0);
                     }

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
                  this.player.failure(59002);
                  return;
               }

               Collections.shuffle(rankDataList);
               matchPlayerId = ((RankData)rankDataList.get(0)).value;
            }

            if (matchPlayerId == 0) {
               if (this.worldMgr.getOnlinePlayerMap().isEmpty()) {
                  this.player.failure(59002);
                  return;
               }

               List<Integer> playerList = new ArrayList();
               playerList.addAll(this.worldMgr.getOnlinePlayerMap().keySet());
               Collections.shuffle(playerList);
               if (playerList.isEmpty() || playerList.size() == 1 && (Integer)playerList.get(0) == this.player.getPlayerId()) {
                  this.player.failure(59002);
                  return;
               }

               if ((Integer)playerList.get(0) == this.player.getPlayerId()) {
                  matchPlayerId = (Integer)playerList.get(playerList.size() - 1);
               } else {
                  matchPlayerId = (Integer)playerList.get(0);
               }
            }

            GamePlayer matchPlayer = this.worldMgr.getPlayerById(matchPlayerId);
            activityLiuBeiDao.matchPlayerId = matchPlayerId;
            activityLiuBeiDao.updateOp();
            PlayerPublicDao matchDao = matchPlayer.getPublicDao();
            ActivityLiuBeiMsg.S2C_Mate_18704.Builder builder = ActivityLiuBeiMsg.S2C_Mate_18704.newBuilder();
            builder.setPower(matchPlayer.getPlayerCombatPower());
            builder.setMonarchId(matchDao.monarchId);
            builder.setPlayerName(matchDao.playerName);
            builder.setSex(matchDao.sex);
            ArrayingMirror arrayingMirror = matchPlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_THEME);
            if (arrayingMirror == null || arrayingMirror.arrayingElementsMap.isEmpty()) {
               arrayingMirror = matchPlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
            }

            builder.setArraying(arrayingMirror.toPlayerArrayingInfo());
            this.player.sendMsg(builder.build());
         }
      }
   }

   public int enterBattle(BattleDao battleDao) {
      int limitFight = this.getConfigModel().getEventHeroFightTime();
      ActivityLiuBeiDao activityLiuBeiDao = this.getDao();
      if (activityLiuBeiDao.fight >= limitFight) {
         return 0;
      } else if (activityLiuBeiDao.matchPlayerId == 0) {
         return 59002;
      } else {
         int bossId = this.getConfigModel().getEventHeroBossId();
         PlayerDao playerDao = this.player.getPlayerDao();
         ArrayingMirror arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_THEME);
         if (arrayingMirror == null || arrayingMirror.arrayingElementsMap.isEmpty()) {
            arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
         }

         BattlePKTeam battlePKTeam1 = new BattlePKTeam(playerDao.playerId, playerDao.playerName, arrayingMirror, playerDao.lv, playerDao.head, playerDao.headFrame, this.heroRankMgr.getHeroRankCompensate(arrayingMirror, false));
         BattlePKTeam battlePKTeam2 = new BattlePKTeam(bossId);
         battleDao.scene.addPKTeam((byte)0, battlePKTeam1);
         battleDao.scene.addPKTeam((byte)1, battlePKTeam2);
         battleDao.scene.setWave((short)1, (short)2);
         int maxRound = this.getConfigModel().getEventHeroBossRound();
         battleDao.scene.setMaxRound((byte)maxRound);
         return 1;
      }
   }

   public int nextBattle(BattleDao battleDao) {
      ActivityLiuBeiDao activityLiuBeiDao = this.getDao();
      GamePlayer matchPlayer = this.worldMgr.getPlayerById(activityLiuBeiDao.matchPlayerId);
      if (matchPlayer == null) {
         return 0;
      } else {
         PlayerPublicDao matchDao = matchPlayer.getPublicDao();
         HeroArrayingPart matchArrayingPart = (HeroArrayingPart)matchPlayer.getMgrPart(HeroArrayingPart.class);
         ArrayingMirror matchArraying;
         if (matchArrayingPart.getHeroCodesOfArraying(CommonMsg.HeroState.HERO_STATE_THEME).isEmpty()) {
            matchArraying = matchPlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
         } else {
            matchArraying = matchPlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_THEME);
         }

         BattlePKTeam battlePKTeam3 = new BattlePKTeam(matchDao.playerId, matchDao.playerName, matchArraying, matchDao.lv, matchDao.head, matchDao.headFrame, this.heroRankMgr.getHeroRankCompensate(matchArraying, false));
         battleDao.scene.addPKTeam((byte)0, battlePKTeam3);
         int maxRound = this.getConfigModel().getEventHeroBossRound();
         battleDao.scene.setMaxRound((byte)maxRound);
         battleDao.scene.setWave((short)2, (short)2);
         return 1;
      }
   }

   public void afterFight(BattleDao battleDao) {
      ActivityLiuBeiDao activityLiuBeiDao = this.getDao();
      if (battleDao.scene.getWave() == 1) {
         BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().build().getResult().toBuilder();
         result.setResult(0);
         long damage = battleDao.scene.getPKTeam((byte)1).getDamageValue();
         result.addSettleInfo(damage);
         battleDao.scene.getBattleMsg().setResult(result);
         activityLiuBeiDao.totalDamage += damage;
         ++activityLiuBeiDao.fight;
         activityLiuBeiDao.firstDamage = damage;
         int mvpHeroId = 0;
         long tempDamage = 0L;

         for(Entity entity : battleDao.scene.getPKTeam((byte)0).getEntityMap().values()) {
            if (entity.getAttackValue() > tempDamage) {
               tempDamage = entity.getAttackValue();
               mvpHeroId = entity.getDressHeroId();
            }
         }

         activityLiuBeiDao.mvpHeroId = mvpHeroId;
         activityLiuBeiDao.updateOp();
      } else {
         battleDao.status = 0;
         battleDao.updateOp();
         long damage = battleDao.scene.getPKTeam((byte)1).getDamageValue();
         long realDamage = damage - activityLiuBeiDao.firstDamage;
         activityLiuBeiDao.totalDamage += realDamage;
         activityLiuBeiDao.secondDamage = realDamage;
         List<ResourceModel> commonAward = new ArrayList();
         ActivityInfo activityInfo = this.getServerActivityInfo();
         ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)this.player.getGameModelPool().getEntity("activityopenTime", activityInfo.id);
         EventHeroBossRewardModel damageAwardModel = this.getDamageRewardModel(activityLiuBeiDao.firstDamage + activityLiuBeiDao.secondDamage);
         if (damageAwardModel != null) {
            for(ResourceModel resourceModel : damageAwardModel.getReward()) {
               ResourceModel.addResourceToList(commonAward, resourceModel);
               if (resourceModel.getType() == activityOpenTimeModel.getIntegralType() && resourceModel.getId() == activityOpenTimeModel.getIntegralId()) {
                  activityLiuBeiDao.totalPoint += resourceModel.getValue();
               }
            }
         } else {
            this.logger.error("主题武将伤害奖励获取错误！");
         }

         activityLiuBeiDao.updateOp();
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
         builder.addExParams(activityLiuBeiDao.mvpHeroId);
         battleDao.scene.setBattleMsg(builder);
      }

   }

   public void endBattle(BattleDao battleDao) {
      String award = "";
      if (!battleDao.rewards.isEmpty()) {
         this.player.addResource(battleDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 61, 6101, 0, 0, "");

         for(ResourceModel reward : battleDao.rewards) {
            award = award + reward.getId() + "-" + reward.getValue() + ",";
         }
      }

      battleDao.rewards.clear();
      if (battleDao.scene.getWave() > 1) {
         ActivityLiuBeiDao activityLiuBeiDao = this.getDao();
         ActivityLiuBeiMsg.S2C_MatchBattle_18712.Builder builder = ActivityLiuBeiMsg.S2C_MatchBattle_18712.newBuilder();
         builder.setDamage(activityLiuBeiDao.firstDamage + activityLiuBeiDao.secondDamage);
         builder.setFightNum(activityLiuBeiDao.fight);
         builder.setTotalDamage(activityLiuBeiDao.totalDamage);
         builder.setTotalPoint(activityLiuBeiDao.totalPoint);
         this.player.sendMsg(builder.build());
         long damage = activityLiuBeiDao.firstDamage + activityLiuBeiDao.secondDamage;
         this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "刘备挑战", award, damage + "", 0, 0, 1);
      }

   }

   public EventHeroBossRewardModel getDamageRewardModel(long damage) {
      ActivityInfo activityInfo = this.getServerActivityInfo();
      List<EventHeroBossRewardModel> list = (List)ApplicationContextProvider.getModelPoolEntity("customEventHeroBossReward", activityInfo.id);
      if (list != null && !list.isEmpty()) {
         for(EventHeroBossRewardModel model : list) {
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
   public void C2S_PointReward_18707(ActivityLiuBeiMsg.C2S_PointReward_18707 msg, String source) {
      ActivityLiuBeiDao activityLiuBeiDao = this.getDao();
      if (activityLiuBeiDao.pointReward.contains(msg.getId())) {
         this.logger.info("已领取该奖励");
      } else {
         EventHeroBonusRewardModel bonusRewardModel = (EventHeroBonusRewardModel)ApplicationContextProvider.getModelPoolEntity("eventHeroBonusReward", msg.getId());
         if (bonusRewardModel == null) {
            this.logger.info("配置不存在");
         } else if (bonusRewardModel.getActivityId() != this.getPlayerActivityId()) {
            this.logger.info("领取的奖励不是该活动奖励 activityId:{}", this.getActivityType());
         } else if (activityLiuBeiDao.totalPoint < bonusRewardModel.getBonus()) {
            this.logger.info("总积分不足，不可领取");
         } else {
            activityLiuBeiDao.pointReward.add(msg.getId());
            activityLiuBeiDao.updateOp();
            this.player.addResource(bonusRewardModel.getReward(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 61, 6102, msg.getId(), 0, "");
            ActivityLiuBeiMsg.S2C_PointReward_18708.Builder builder = ActivityLiuBeiMsg.S2C_PointReward_18708.newBuilder();
            builder.setId(msg.getId());
            this.player.sendMsg(builder.build());
            this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 16, 18, "刘备挑战", bonusRewardModel.getBonus() + "", bonusRewardModel.getBonus() + "", 0, 0, 1);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_LootInfo_18721(ActivityLiuBeiMsg.C2S_LootInfo_18721 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         this.sendLootInfo();
      }
   }

   @MsgHandlerAnno
   public void C2S_LootReward_18723(ActivityLiuBeiMsg.C2S_LootReward_18723 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         ActivityLiuBeiDao activityLiuBeiDao = this.getDao();
         if (activityLiuBeiDao.enjoyId == 0) {
            this.player.failure(61226);
         } else {
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            int dailyDrawNum = (Integer)playerResetCustomCache.getDailyNum(30, 0);
            if ((float)dailyDrawNum >= ApplicationContextProvider.getConfigFloat("LotteryLimit", 99999.0F)) {
               this.player.failure(51);
            } else {
               HeroPondRewardModel enjoyModel = (HeroPondRewardModel)ApplicationContextProvider.getModelPoolEntity("heroPondReward", activityLiuBeiDao.enjoyId);
               if (enjoyModel != null) {
                  int lootNum = msg.getNum();
                  EventHeroConfigModel configModel = this.getConfigModel();
                  if (!this.player.checkResourceNum(2, configModel.getEventHeroCall(), lootNum)) {
                     this.player.failure(3);
                  } else {
                     List<Integer> rewardIdList = new ArrayList();
                     List<KeyValFun> weightList = this.getJackpotWeight();
                     weightList.add(new KeyValFun(enjoyModel.getId(), enjoyModel.getWeight()));
                     if (weightList.size() <= 1) {
                        this.logger.info("刘备活动 - plyerId:{} 抽奖逻辑有误", this.player.getPlayerId());
                     } else if (lootNum >= weightList.size()) {
                        this.logger.info("玩家{}抽取次数比奖池物品还要多。。。 抽取次数：{} 奖池物品数量：{}", new Object[]{this.player.getPlayerId(), lootNum, weightList.size()});
                     } else {
                        for(int i = 0; i < lootNum; ++i) {
                           if (enjoyModel != null && activityLiuBeiDao.curLootNum + 1 >= enjoyModel.getAppearNum()) {
                              rewardIdList.add(enjoyModel.getId());
                              this.resetJackpot();
                           } else {
                              int rewardId = GamePlayer.countRate(weightList);
                              HeroPondRewardModel tempModel = (HeroPondRewardModel)ApplicationContextProvider.getModelPoolEntity("heroPondReward", rewardId);
                              if (tempModel.getFloorNum() > activityLiuBeiDao.curLootNum) {
                                 rewardId = tempModel.getSwapId() > 0 ? tempModel.getSwapId() : rewardId;
                              }

                              rewardIdList.add(rewardId);
                              if (rewardId == activityLiuBeiDao.enjoyId) {
                                 this.logger.info("刘备活动 - 玩家 {} 抽取第{}次时抽中了心仪物品，重置奖池数据", this.player.getPlayerId(), activityLiuBeiDao.curLootNum + 1);
                                 this.resetJackpot();
                              } else {
                                 ++activityLiuBeiDao.curLootNum;
                              }
                           }
                        }

                        if (rewardIdList.size() != lootNum) {
                           this.logger.error("刘备活动 - 玩家 {} 抽奖发生错误 抽奖:{}次，获得{}个物品", new Object[]{this.player.getPlayerId(), lootNum, rewardIdList.size()});
                        }

                        this.player.delResource(2, configModel.getEventHeroCall(), (long)lootNum, 91, 9101, 0, lootNum, "");
                        List<ResourceModel> resourceModelList = new ArrayList();

                        for(Integer id : rewardIdList) {
                           HeroPondRewardModel model = (HeroPondRewardModel)ApplicationContextProvider.getModelPoolEntity("heroPondReward", id);
                           if (model == null) {
                              this.logger.info("刘备活动 - 抽奖获得的奖励错误 playerId:{} id:{}", this.player.getPlayerId(), id);
                           } else {
                              resourceModelList.addAll(model.getItems());
                           }
                        }

                        this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 91, 9101, 0, 0, "");
                        activityLiuBeiDao.totalLootNum += lootNum;
                        activityLiuBeiDao.updateOp();
                        dailyDrawNum += lootNum;
                        ActivityLiuBeiMsg.S2C_LootReward_18724.Builder builder = ActivityLiuBeiMsg.S2C_LootReward_18724.newBuilder();
                        builder.addAllRewardId(rewardIdList);
                        builder.setCurLootNum(activityLiuBeiDao.curLootNum);
                        builder.setHadEnjoy(activityLiuBeiDao.enjoyId == 0);
                        builder.setDailyDrawNum(dailyDrawNum);
                        this.player.sendMsg(builder.build());
                        playerResetCustomCache.setDailyReset(30, dailyDrawNum);
                        int enjoyId = enjoyModel != null && enjoyModel.getItems().size() > 0 ? ((ResourceModel)enjoyModel.getItems().get(0)).getId() : 0;

                        for(ResourceModel resourceModel : resourceModelList) {
                           String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                           this.player.getOperationMgr().addExtraLog(this.player, 198, "刘备活动-抽奖", "", lootNum + "", strings[0], strings[2], strings[1], strings[0].equals(String.valueOf(enjoyId)) ? "1" : "0");
                        }

                     }
                  }
               }
            }
         }
      }
   }

   private void resetJackpot() {
      ActivityLiuBeiDao activityLiuBeiDao = this.getDao();
      activityLiuBeiDao.enjoyId = 0;
      activityLiuBeiDao.curLootNum = 0;
   }

   @MsgHandlerAnno
   public void C2S_LootEnjoy_18725(ActivityLiuBeiMsg.C2S_LootEnjoy_18725 msg, String source) {
      ActivityLiuBeiDao activityLiuBeiDao = this.getDao();
      if (msg.getId() != 0) {
         HeroPondRewardModel model = (HeroPondRewardModel)ApplicationContextProvider.getModelPoolEntity("heroPondReward", msg.getId());
         if (model == null || model.getType() != 2 || model.getActId() != this.getPlayerActivityId()) {
            return;
         }
      }

      activityLiuBeiDao.enjoyId = msg.getId();
      activityLiuBeiDao.updateOp();
      ActivityLiuBeiMsg.S2C_LootEnjoy_18726.Builder builder = ActivityLiuBeiMsg.S2C_LootEnjoy_18726.newBuilder();
      builder.setId(msg.getId());
      this.player.sendMsg(builder.build());
      this.logger.info("刘备活动 - 玩家 {} 设置心仪奖励 {}, 此轮抽取次数:{}", new Object[]{this.player.getPlayerId(), activityLiuBeiDao.enjoyId, activityLiuBeiDao.curLootNum});
   }

   public List<KeyValFun> getJackpotWeight() {
      List<KeyValFun> keyValFunList = new ArrayList();

      for(Integer id : this.getJackpots()) {
         HeroPondRewardModel model = (HeroPondRewardModel)ApplicationContextProvider.getModelPoolEntity("heroPondReward", id);
         keyValFunList.add(new KeyValFun(model.getId(), model.getWeight()));
      }

      return keyValFunList;
   }

   public Set<Integer> getJackpots() {
      Map<Integer, List<HeroPondRewardModel>> modelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customHeroPondReward", this.getPlayerActivityId());
      Set<Integer> rewardSet = new HashSet();
      int openDays = this.getJackpotOpenDays(modelMap);
      List<HeroPondRewardModel> rewardModelList = (List)modelMap.get(openDays);
      if (CollectionUtils.isEmpty(rewardModelList)) {
         this.logger.error("刘备活动 - {} 表错误，开服天数 {}", "heroPondReward", openDays);
         return rewardSet;
      } else {
         for(HeroPondRewardModel model : rewardModelList) {
            if (model.getType() == 1) {
               rewardSet.add(model.getId());
            }
         }

         return rewardSet;
      }
   }

   public void sendLootInfo() {
      ActivityLiuBeiDao activityLiuBeiDao = this.getDao();
      ActivityLiuBeiMsg.S2C_LootInfo_18722.Builder builder = ActivityLiuBeiMsg.S2C_LootInfo_18722.newBuilder();
      builder.setEnjoyId(activityLiuBeiDao.enjoyId);
      builder.addAllRewardId(this.getJackpots());
      builder.setCurLootNum(activityLiuBeiDao.curLootNum);
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int dailyDrawNum = (Integer)playerResetCustomCache.getDailyNum(30, 0);
      builder.setDailyDrawNum(dailyDrawNum);
      this.player.sendMsg(builder.build());
   }

   public void activityEnd(int oldActivityId) {
      super.activityEnd(oldActivityId);
      HeroMsg.S2C_HeroBaseData_5002.Builder result_builder = HeroMsg.S2C_HeroBaseData_5002.newBuilder();
      HeroArrayingPart mgrPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroArrayingDao arrayingDao = mgrPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_THEME);
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
                  if (heroDao != null && heroDao.containState(CommonMsg.HeroState.HERO_STATE_THEME.getNumber())) {
                     heroDao.delState(CommonMsg.HeroState.HERO_STATE_THEME.getNumber());
                     heroDao.updateOp();
                     result_builder.addHeros(heroDao.toHeroInfo());
                  }
            }
         }

         arrayingDao.soulHeroCode = 0;
         arrayingDao.elements.clear();
         arrayingDao.updateOp();
         this.player.sendMsg(result_builder.build());
      }

      int switchItemId = this.configManager.getIntDefault("heroThemeSwitchItemId", 1003);
      int costId = this.getConfigModel().getEventHeroCall();
      List<ResourceModel> resourceModelList = new ArrayList();
      List<ResourceModel> switchResourceModels = new ArrayList();
      ActivityLiuBeiDao activityLiuBeiDao = this.getDao();

      for(EventHeroBonusRewardModel bonusRewardModel : (List)this.player.getGameModelPool().getEntity("customEventHeroBonusReward", this.getPlayerActivityId())) {
         if (!activityLiuBeiDao.pointReward.contains(bonusRewardModel.getId()) && activityLiuBeiDao.totalPoint >= bonusRewardModel.getBonus()) {
            for(ResourceModel resourceModel : bonusRewardModel.getReward()) {
               if (resourceModel.getType() == 2 && resourceModel.getId() == costId) {
                  ResourceModel.addResourceToList(switchResourceModels, new ResourceModel(resourceModel.getType(), switchItemId, resourceModel.getValue()));
               } else {
                  ResourceModel.addResourceToList(resourceModelList, resourceModel);
               }
            }
         }
      }

      EventHeroConfigModel model = (EventHeroConfigModel)this.player.getGameModelPool().getEntity("eventHeroConfig", this.getPlayerActivityId());
      Map<String, Integer> mailMap = new HashMap();
      String mailId = model.getMailId();
      String[] mailIdArr = mailId.split("\\|");

      for(String str : mailIdArr) {
         String[] cell = str.split(":");
         mailMap.put(cell[0], Integer.parseInt(cell[1]));
      }

      MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
      CentreAwardModel centreAwardModel = (CentreAwardModel)this.player.getGameModelPool().getEntity("centreAward", mailMap.get("end"));
      if (centreAwardModel != null && resourceModelList.size() > 0) {
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), resourceModelList, 604800000L, 61, 6105);
      }

      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      int num = itemBagPart.getItemNum(costId);
      if (num > 0) {
         switchResourceModels.add(new ResourceModel(2, switchItemId, num));
      }

      itemBagPart.deleteItems(costId, 61, 6105, costId, num, "主题武将活动结束");
      centreAwardModel = (CentreAwardModel)this.player.getGameModelPool().getEntity("centreAward", mailMap.get("change"));
      if (centreAwardModel != null && switchResourceModels.size() > 0) {
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), switchResourceModels, 604800000L, 61, 6105);
      }

      ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)this.player.getGameModelPool().getEntity("activityopenTime", oldActivityId);
      if (activityOpenTimeModel != null) {
         if (activityOpenTimeModel.getIntegralType() == 2) {
            itemBagPart.deleteItems(activityOpenTimeModel.getIntegralId(), 61, 6105, activityOpenTimeModel.getIntegralType(), activityOpenTimeModel.getIntegralId(), "主题武将活动结束" + oldActivityId);
         } else if (activityOpenTimeModel.getIntegralType() == 1) {
            this.player.updateProperty(activityOpenTimeModel.getIntegralId(), 0L, 61, 6105, 0, 0, "activityId:" + oldActivityId);
         }
      }

   }

   public int getJackpotOpenDays(Map<Integer, List<HeroPondRewardModel>> modelMap) {
      int activityOpenDay = this.getActivityOpenDay();
      TreeMap<Integer, List<HeroPondRewardModel>> openDaysSet = new TreeMap(modelMap);
      activityOpenDay = activityOpenDay < (Integer)openDaysSet.firstKey() ? (Integer)openDaysSet.firstKey() : activityOpenDay;
      int openDays = (Integer)openDaysSet.floorKey(activityOpenDay);
      return openDays;
   }
}
