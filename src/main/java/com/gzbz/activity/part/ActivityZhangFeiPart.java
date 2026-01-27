package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.ActZhangFeiAccumulateDao;
import com.gzbz.db.ActivityZhangFeiDao;
import com.gzbz.db.BattleDao;
import com.gzbz.db.HeroArrayingDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameCache.TaskCustomCache;
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
import com.gzbz.model.EventHeroCallTaskModel;
import com.gzbz.model.EventHeroConfigModel;
import com.gzbz.model.ZhangFeiRewardModel;
import com.gzbz.model.ZhangfeiAccumulateModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.ActivityZhangFeiMsg;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.RankData;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.ActivityZhangFeiTaskPart;
import com.gzbz.worldMgr.WorldMgr;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import misc.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ActivityZhangFeiPart extends AbstractActivityPart {
   @Autowired
   RankMgr rankMgr;
   @Autowired
   WorldMgr worldMgr;
   @Autowired
   ConfigManager configManager;
   @Autowired
   private HeroRankMgr heroRankMgr;
   private static final int MAST_ID = 1;
   private static final int REWARD_NORMAL = 1;
   private static final int REWARD_ENJOY = 2;

   public void rotateReset(int oldActivityId) {
      ActivityZhangFeiDao activityZhangFeiDao = (ActivityZhangFeiDao)this.player.getData("tb_activity_zhang_fei", this.player.getPlayerId());
      activityZhangFeiDao.reset();
      ActivityZhangFeiTaskPart activityZhangFeiTaskPart = (ActivityZhangFeiTaskPart)this.player.getMgrPart(ActivityZhangFeiTaskPart.class);
      activityZhangFeiTaskPart.getTasksMap().values().forEach(TaskData::delete);
      activityZhangFeiTaskPart.trigger();
      this.clearActivityGift(24);
      ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)this.player.getGameModelPool().getEntity("activityopenTime", this.getPlayerActivityId());
      if (activityOpenTimeModel != null) {
         ExpeditionPart expeditionPart = (ExpeditionPart)this.player.getMgrPart(ExpeditionPart.class);
         int expeditionId = activityOpenTimeModel.getExpeditionId();
         expeditionPart.resetChatpter(expeditionId);
      }

   }

   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         ActivityZhangFeiDao activityZhangFeiDao = (ActivityZhangFeiDao)this.player.getData("tb_activity_zhang_fei", this.player.getPlayerId());
         ActivityZhangFeiMsg.S2C_HeroThemeInfo_17302.Builder builder = ActivityZhangFeiMsg.S2C_HeroThemeInfo_17302.newBuilder();
         builder.setFight(activityZhangFeiDao.fight);
         builder.setTotalDamage(activityZhangFeiDao.totalDamage);
         builder.addAllFightReward(activityZhangFeiDao.fightReward);
         builder.setTotalPoint(activityZhangFeiDao.totalPoint);
         builder.addAllPointReward(activityZhangFeiDao.pointReward);
         ActivityInfo activityInfo = this.getServerActivityInfo();
         builder.setStartTime(activityInfo.start);
         builder.setEndTime(activityInfo.end);
         ActivityZhangFeiTaskPart activityZhangFeiTaskPart = (ActivityZhangFeiTaskPart)this.player.getMgrPart(ActivityZhangFeiTaskPart.class);

         for(TaskData taskData : activityZhangFeiTaskPart.getTasksMap().values()) {
            builder.addTask(activityZhangFeiTaskPart.buildTask(taskData));
         }

         this.player.sendMsg(builder.build());
         if (!this.isServerActivityInvalid()) {
            this.accumulateRechargeHandle(0, false);
         }

      }
   }

   public int getActivityType() {
      return 58;
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
   public void C2S_HeroThemeInfo_17301(ActivityZhangFeiMsg.C2S_HeroThemeInfo_17301 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_Mate_17303(ActivityZhangFeiMsg.C2S_Mate_17303 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(21);
      } else {
         EventHeroConfigModel configModel = this.getConfigModel();
         int limitFight = configModel.getEventHeroFightTime();
         ActivityZhangFeiDao activityZhangFeiDao = (ActivityZhangFeiDao)this.player.getData("tb_activity_zhang_fei", this.player.getPlayerId());
         if (activityZhangFeiDao.fight >= limitFight) {
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
            activityZhangFeiDao.matchPlayerId = matchPlayerId;
            activityZhangFeiDao.updateOp();
            PlayerPublicDao matchDao = matchPlayer.getPublicDao();
            ActivityZhangFeiMsg.S2C_Mate_17304.Builder builder = ActivityZhangFeiMsg.S2C_Mate_17304.newBuilder();
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
      ActivityZhangFeiDao activityZhangFeiDao = (ActivityZhangFeiDao)this.player.getData("tb_activity_zhang_fei", this.player.getPlayerId());
      if (activityZhangFeiDao.fight >= limitFight) {
         return 0;
      } else if (activityZhangFeiDao.matchPlayerId == 0) {
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
      ActivityZhangFeiDao activityZhangFeiDao = (ActivityZhangFeiDao)this.player.getData("tb_activity_zhang_fei", this.player.getPlayerId());
      GamePlayer matchPlayer = this.worldMgr.getPlayerById(activityZhangFeiDao.matchPlayerId);
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
      ActivityZhangFeiDao activityZhangFeiDao = (ActivityZhangFeiDao)this.player.getData("tb_activity_zhang_fei", this.player.getPlayerId());
      if (battleDao.scene.getWave() == 1) {
         BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().build().getResult().toBuilder();
         result.setResult(0);
         long damage = battleDao.scene.getPKTeam((byte)1).getDamageValue();
         result.addSettleInfo(damage);
         battleDao.scene.getBattleMsg().setResult(result);
         activityZhangFeiDao.totalDamage += damage;
         ++activityZhangFeiDao.fight;
         activityZhangFeiDao.firstDamage = damage;
         int mvpHeroId = 0;
         long tempDamage = 0L;

         for(Entity entity : battleDao.scene.getPKTeam((byte)0).getEntityMap().values()) {
            if (entity.getAttackValue() > tempDamage) {
               tempDamage = entity.getAttackValue();
               mvpHeroId = entity.getDressHeroId();
            }
         }

         activityZhangFeiDao.mvpHeroId = mvpHeroId;
         activityZhangFeiDao.updateOp();
      } else {
         battleDao.status = 0;
         battleDao.updateOp();
         long damage = battleDao.scene.getPKTeam((byte)1).getDamageValue();
         long realDamage = damage - activityZhangFeiDao.firstDamage;
         activityZhangFeiDao.totalDamage += realDamage;
         activityZhangFeiDao.secondDamage = realDamage;
         List<ResourceModel> commonAward = new ArrayList();
         ActivityInfo activityInfo = this.getServerActivityInfo();
         ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)this.player.getGameModelPool().getEntity("activityopenTime", activityInfo.id);
         EventHeroBossRewardModel damageAwardModel = this.getDamageRewardModel(activityZhangFeiDao.firstDamage + activityZhangFeiDao.secondDamage);
         if (damageAwardModel != null) {
            for(ResourceModel resourceModel : damageAwardModel.getReward()) {
               ResourceModel.addResourceToList(commonAward, resourceModel);
               if (resourceModel.getType() == activityOpenTimeModel.getIntegralType() && resourceModel.getId() == activityOpenTimeModel.getIntegralId()) {
                  activityZhangFeiDao.totalPoint += resourceModel.getValue();
               }
            }
         } else {
            this.logger.error("主题武将伤害奖励获取错误！");
         }

         activityZhangFeiDao.updateOp();
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
         builder.addExParams(activityZhangFeiDao.mvpHeroId);
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
         ActivityZhangFeiDao activityZhangFeiDao = (ActivityZhangFeiDao)this.player.getData("tb_activity_zhang_fei", this.player.getPlayerId());
         ActivityZhangFeiMsg.S2C_MatchBattle_17312.Builder builder = ActivityZhangFeiMsg.S2C_MatchBattle_17312.newBuilder();
         builder.setDamage(activityZhangFeiDao.firstDamage + activityZhangFeiDao.secondDamage);
         builder.setFightNum(activityZhangFeiDao.fight);
         builder.setTotalDamage(activityZhangFeiDao.totalDamage);
         builder.setTotalPoint(activityZhangFeiDao.totalPoint);
         this.player.sendMsg(builder.build());
         long damage = activityZhangFeiDao.firstDamage + activityZhangFeiDao.secondDamage;
         this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "魔仙挑战", award, damage + "", 0, 0, 1);
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
   public void C2S_PointReward_17307(ActivityZhangFeiMsg.C2S_PointReward_17307 msg, String source) {
      ActivityZhangFeiDao activityZhangFeiDao = (ActivityZhangFeiDao)this.player.getData("tb_activity_zhang_fei", this.player.getPlayerId());
      if (activityZhangFeiDao.pointReward.contains(msg.getId())) {
         this.logger.info("已领取该奖励");
      } else {
         EventHeroBonusRewardModel bonusRewardModel = (EventHeroBonusRewardModel)ApplicationContextProvider.getModelPoolEntity("eventHeroBonusReward", msg.getId());
         if (bonusRewardModel == null) {
            this.logger.info("配置不存在");
         } else if (bonusRewardModel.getActivityId() != this.getPlayerActivityId()) {
            this.logger.info("领取的奖励不是该活动奖励 activityId:{}", this.getActivityType());
         } else if (activityZhangFeiDao.totalPoint < bonusRewardModel.getBonus()) {
            this.logger.info("总积分不足，不可领取");
         } else {
            activityZhangFeiDao.pointReward.add(msg.getId());
            activityZhangFeiDao.updateOp();
            this.player.addResource(bonusRewardModel.getReward(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 61, 6102, msg.getId(), 0, "");
            ActivityZhangFeiMsg.S2C_PointReward_17308.Builder builder = ActivityZhangFeiMsg.S2C_PointReward_17308.newBuilder();
            builder.setId(msg.getId());
            this.player.sendMsg(builder.build());
            this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 16, 18, "魔仙挑战", bonusRewardModel.getBonus() + "", bonusRewardModel.getBonus() + "", 0, 0, 1);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_TaskCommitTask_17313(ActivityZhangFeiMsg.C2S_TaskCommitTask_17313 msg, String source) {
      ActivityZhangFeiTaskPart activityZhangFeiTaskPart = (ActivityZhangFeiTaskPart)this.player.getMgrPart(ActivityZhangFeiTaskPart.class);
      activityZhangFeiTaskPart.commit(msg.getTaskId());
   }

   @MsgHandlerAnno
   public void C2S_LootInfo_17321(ActivityZhangFeiMsg.C2S_LootInfo_17321 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         this.sendLootInfo();
      }
   }

   @MsgHandlerAnno
   public void C2S_LootReward_17323(ActivityZhangFeiMsg.C2S_LootReward_17323 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         ActivityZhangFeiDao activityZhangFeiDao = (ActivityZhangFeiDao)this.player.getData("tb_activity_zhang_fei", this.player.getPlayerId());
         if (activityZhangFeiDao.enjoyId == 0) {
            this.player.failure(61226);
         } else {
            ZhangFeiRewardModel enjoyModel = (ZhangFeiRewardModel)ApplicationContextProvider.getModelPoolEntity("zhangFeiReward", activityZhangFeiDao.enjoyId);
            if (enjoyModel == null) {
               this.logger.info("张飞活动 - 心仪奖励不存在 id:{}", activityZhangFeiDao.enjoyId);
            } else {
               int lootNum = msg.getNum();
               EventHeroConfigModel configModel = this.getConfigModel();
               if (!this.player.checkResourceNum(2, configModel.getEventHeroCall(), lootNum)) {
                  this.player.failure(3);
               } else {
                  List<Integer> rewardIdList = new ArrayList();
                  List<KeyValFun> weightList = this.getJackpotWeight();
                  weightList.add(new KeyValFun(enjoyModel.getId(), enjoyModel.getWeight()));
                  if (weightList.size() <= 1) {
                     this.logger.info("张飞活动 - plyerId:{} 抽奖逻辑有误", this.player.getPlayerId());
                  } else if (lootNum >= weightList.size()) {
                     this.logger.info("抽取次数比奖池物品还要多。。。 抽取次数：{} 奖池物品数量：{}", lootNum, weightList.size());
                  } else {
                     for(int i = 0; i < lootNum; ++i) {
                        if (enjoyModel != null && activityZhangFeiDao.curLootNum + 1 >= enjoyModel.getAppearNum()) {
                           rewardIdList.add(enjoyModel.getId());
                           this.resetJackpot();
                        } else {
                           int rewardId = GamePlayer.countRate(weightList);
                           ZhangFeiRewardModel tempModel = (ZhangFeiRewardModel)ApplicationContextProvider.getModelPoolEntity("zhangFeiReward", rewardId);
                           if (tempModel.getFloorNum() > activityZhangFeiDao.curLootNum) {
                              rewardId = tempModel.getSwapId() > 0 ? tempModel.getSwapId() : rewardId;
                           }

                           rewardIdList.add(rewardId);
                           if (rewardId == activityZhangFeiDao.enjoyId) {
                              this.resetJackpot();
                           } else {
                              ++activityZhangFeiDao.curLootNum;
                           }
                        }
                     }

                     if (rewardIdList.size() != lootNum) {
                        this.logger.error("张飞活动 - 玩家 {} 抽奖发生错误 抽奖:{}次，获得{}个物品", new Object[]{this.player.getPlayerId(), lootNum, rewardIdList.size()});
                     }

                     this.player.delResource(2, configModel.getEventHeroCall(), (long)lootNum, 84, 8401, 0, lootNum, "");
                     List<ResourceModel> resourceModelList = new ArrayList();

                     for(Integer id : rewardIdList) {
                        ZhangFeiRewardModel model = (ZhangFeiRewardModel)ApplicationContextProvider.getModelPoolEntity("zhangFeiReward", id);
                        if (model == null) {
                           this.logger.info("张飞活动 - 抽奖获得的奖励错误 id:{}", id);
                        } else {
                           resourceModelList.addAll(model.getItems());
                        }
                     }

                     this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 84, 8401, 0, 0, "");
                     activityZhangFeiDao.totalLootNum += lootNum;
                     activityZhangFeiDao.updateOp();
                     ActivityZhangFeiMsg.S2C_LootReward_17324.Builder builder = ActivityZhangFeiMsg.S2C_LootReward_17324.newBuilder();
                     builder.addAllRewardId(rewardIdList);
                     builder.setCurLootNum(activityZhangFeiDao.curLootNum);
                     builder.setHadEnjoy(activityZhangFeiDao.enjoyId == 0);
                     this.player.sendMsg(builder.build());
                     int enjoyId = enjoyModel.getItems().size() > 0 ? ((ResourceModel)enjoyModel.getItems().get(0)).getId() : 0;

                     for(ResourceModel resourceModel : resourceModelList) {
                        String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                        this.player.getOperationMgr().addExtraLog(this.player, 198, "张飞活动-抽奖", "", lootNum + "", strings[0], strings[2], strings[1], strings[0].equals(String.valueOf(enjoyId)) ? "1" : "0");
                     }

                  }
               }
            }
         }
      }
   }

   private void resetJackpot() {
      ActivityZhangFeiDao activityZhangFeiDao = (ActivityZhangFeiDao)this.player.getData("tb_activity_zhang_fei", this.player.getPlayerId());
      activityZhangFeiDao.enjoyId = 0;
      activityZhangFeiDao.curLootNum = 0;
   }

   @MsgHandlerAnno
   public void C2S_LootEnjoy_17325(ActivityZhangFeiMsg.C2S_LootEnjoy_17325 msg, String source) {
      ActivityZhangFeiDao activityZhangFeiDao = (ActivityZhangFeiDao)this.player.getData("tb_activity_zhang_fei", this.player.getPlayerId());
      if (msg.getId() != 0) {
         ZhangFeiRewardModel model = (ZhangFeiRewardModel)ApplicationContextProvider.getModelPoolEntity("zhangFeiReward", msg.getId());
         if (model == null || model.getType() != 2) {
            return;
         }
      }

      activityZhangFeiDao.enjoyId = msg.getId();
      activityZhangFeiDao.updateOp();
      ActivityZhangFeiMsg.S2C_LootEnjoy_17326.Builder builder = ActivityZhangFeiMsg.S2C_LootEnjoy_17326.newBuilder();
      builder.setId(msg.getId());
      this.player.sendMsg(builder.build());
   }

   public List<KeyValFun> getJackpotWeight() {
      List<KeyValFun> keyValFunList = new ArrayList();

      for(Integer id : this.getJackpots()) {
         ZhangFeiRewardModel model = (ZhangFeiRewardModel)ApplicationContextProvider.getModelPoolEntity("zhangFeiReward", id);
         keyValFunList.add(new KeyValFun(model.getId(), model.getWeight()));
      }

      return keyValFunList;
   }

   public Set<Integer> getJackpots() {
      Map<Integer, List<ZhangFeiRewardModel>> modelMap = ApplicationContextProvider.<Integer, List<ZhangFeiRewardModel>>getModelPoolMap("customZhangFeiReward");
      Set<Integer> rewardSet = new HashSet();
      int openDays = this.getJackpotOpenDays(modelMap);
      List<ZhangFeiRewardModel> rewardModelList = (List)modelMap.get(openDays);
      if (CollectionUtils.isEmpty(rewardModelList)) {
         this.logger.error("张飞活动 - {} 表错误，开服天数 {}", "zhangFeiReward", openDays);
         return rewardSet;
      } else {
         for(ZhangFeiRewardModel model : rewardModelList) {
            if (model.getType() == 1) {
               rewardSet.add(model.getId());
            }
         }

         return rewardSet;
      }
   }

   public void sendLootInfo() {
      ActivityZhangFeiDao activityZhangFeiDao = (ActivityZhangFeiDao)this.player.getData("tb_activity_zhang_fei", this.player.getPlayerId());
      ActivityZhangFeiMsg.S2C_LootInfo_17322.Builder builder = ActivityZhangFeiMsg.S2C_LootInfo_17322.newBuilder();
      builder.setEnjoyId(activityZhangFeiDao.enjoyId);
      builder.addAllRewardId(this.getJackpots());
      builder.setCurLootNum(activityZhangFeiDao.curLootNum);
      this.player.sendMsg(builder.build());
   }

   public void loginHandle() {
      if (!this.isServerActivityInvalid()) {
         this.accumulateRechargeHandle(0, false);
      }

   }

   public void activityEnd(int oldActivityId) {
      this.accumulateEnd();
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
      ActivityZhangFeiDao activityZhangFeiDao = (ActivityZhangFeiDao)this.player.getData("tb_activity_zhang_fei", this.player.getPlayerId());

      for(EventHeroBonusRewardModel bonusRewardModel : (List)this.player.getGameModelPool().getEntity("customEventHeroBonusReward", this.getPlayerActivityId())) {
         if (!activityZhangFeiDao.pointReward.contains(bonusRewardModel.getId()) && activityZhangFeiDao.totalPoint >= bonusRewardModel.getBonus()) {
            for(ResourceModel resourceModel : bonusRewardModel.getReward()) {
               if (resourceModel.getType() == 2 && resourceModel.getId() == costId) {
                  ResourceModel.addResourceToList(switchResourceModels, new ResourceModel(resourceModel.getType(), switchItemId, resourceModel.getValue()));
               } else {
                  ResourceModel.addResourceToList(resourceModelList, resourceModel);
               }
            }
         }
      }

      ActivityZhangFeiTaskPart activityZhangFeiTaskPart = (ActivityZhangFeiTaskPart)this.player.getMgrPart(ActivityZhangFeiTaskPart.class);
      Map<Integer, TaskData> tasksMap = activityZhangFeiTaskPart.getTasksMap();

      for(TaskData taskData : tasksMap.values()) {
         if (taskData.state == 2) {
            EventHeroCallTaskModel callTaskModel = (EventHeroCallTaskModel)ApplicationContextProvider.getModelPoolEntity("eventHeroCallTask", taskData.id);
            if (callTaskModel != null) {
               resourceModelList.addAll(callTaskModel.getRewards());
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

      TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
      taskCustomCache.delete(activityZhangFeiTaskPart.getModule());
   }

   public void resetDaily() {
      ActivityZhangFeiDao activityZhangFeiDao = (ActivityZhangFeiDao)this.player.getData("tb_activity_zhang_fei", this.player.getPlayerId());
      activityZhangFeiDao.fight = 0;
      activityZhangFeiDao.updateOp();
      ActZhangFeiAccumulateDao actZhangFeiAccumulateDao = (ActZhangFeiAccumulateDao)this.player.getData("tb_activity_zhang_fei_accumulate", this.player.getPlayerId());
      if (actZhangFeiAccumulateDao.nowRechargeMoney != -1) {
         actZhangFeiAccumulateDao.nowRechargeMoney = 0;
         actZhangFeiAccumulateDao.rechargeCut = 0;
         actZhangFeiAccumulateDao.updateOp();
      }

      this.sendAccumulateRewardInfo();
   }

   public void activityRecharge(int money) {
      this.accumulateRechargeHandle(money, true);
   }

   public int getJackpotOpenDays(Map<Integer, List<ZhangFeiRewardModel>> modelMap) {
      int openServerDay = DateUtil.difftimeDay(new Timestamp(this.worldMgr.getOpenServerTime())) + 1;
      int offsetDay = openServerDay - this.getSeverActivityDay() + 1;
      TreeMap<Integer, List<ZhangFeiRewardModel>> openDaysSet = new TreeMap(modelMap);
      offsetDay = offsetDay < (Integer)openDaysSet.firstKey() ? (Integer)openDaysSet.firstKey() : offsetDay;
      int openDays = (Integer)openDaysSet.floorKey(offsetDay);
      return openDays;
   }

   public List<KeyValFun> getWeightList(Set<Integer> curJackpot) {
      List<KeyValFun> weightList = new ArrayList();

      for(Integer id : curJackpot) {
         ZhangFeiRewardModel model = (ZhangFeiRewardModel)ApplicationContextProvider.getModelPoolEntity("zhangFeiReward", id);
         weightList.add(new KeyValFun(model.getId(), model.getWeight()));
      }

      return weightList;
   }

   public int getNowUnlockStageNum() {
      int severActivityDay = this.getSeverActivityDay();
      Map<Integer, ZhangfeiAccumulateModel> all = this.player.getGameModelPool().getMap("zhangfeiAccumulate");
      if (severActivityDay > 0 && all != null && !all.isEmpty()) {
         Collection<ZhangfeiAccumulateModel> values = all.values();
         List<ZhangfeiAccumulateModel> collect = (List)values.stream().sorted((o1, o2) -> o2.getStageNum() - o1.getStageNum()).collect(Collectors.toList());
         int maxStageNum = ((ZhangfeiAccumulateModel)collect.get(0)).getStageNum();
         return maxStageNum <= severActivityDay ? maxStageNum : severActivityDay;
      } else {
         return 1;
      }
   }

   public void accumulateRechargeHandle(int money, boolean sendMsg) {
      ActZhangFeiAccumulateDao actZhangFeiAccumulateDao = this.getActZhangFeiAccumulateDao();
      if (actZhangFeiAccumulateDao.nowRechargeMoney == -1) {
         PlayerDao playerDao = this.player.getPlayerDao();
         int dailyRecharge = 0;
         if (DateUtil.isSameDay(playerDao.updateTime)) {
            PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
            dailyRecharge = playerRechargeDao.dailyRecharge;
         }

         actZhangFeiAccumulateDao.nowRechargeMoney = dailyRecharge;
      } else {
         actZhangFeiAccumulateDao.nowRechargeMoney += money;
      }

      actZhangFeiAccumulateDao.updateOp();
      ZhangfeiAccumulateModel prepareUnlockLow = this.getPrepareUnlockAccumulate(false);
      if (null != prepareUnlockLow) {
         int unlockCondition = actZhangFeiAccumulateDao.nowRechargeMoney - actZhangFeiAccumulateDao.rechargeCut;
         if (unlockCondition >= prepareUnlockLow.getRechargeNum()) {
            actZhangFeiAccumulateDao.canReceiveLowRewardIds.add(prepareUnlockLow.getId());
            actZhangFeiAccumulateDao.rechargeCut = actZhangFeiAccumulateDao.nowRechargeMoney;
            actZhangFeiAccumulateDao.updateOp();
         }
      }

      ZhangfeiAccumulateModel prepareUnlockHigh = this.getPrepareUnlockAccumulate(true);
      if (null != prepareUnlockHigh) {
         int nowRechargeMoney = actZhangFeiAccumulateDao.nowRechargeMoney;
         if (nowRechargeMoney >= prepareUnlockHigh.getRechargeNum()) {
            actZhangFeiAccumulateDao.canReceiveHighRewardIds.add(prepareUnlockHigh.getId());
            actZhangFeiAccumulateDao.nowRechargeMoney = 0;
            actZhangFeiAccumulateDao.rechargeCut = 0;
            actZhangFeiAccumulateDao.updateOp();
         }
      }

      if (sendMsg) {
         this.sendAccumulateRewardInfo();
      }

   }

   public ZhangfeiAccumulateModel getPrepareUnlockAccumulate(boolean isHighRechargeGear) {
      ActZhangFeiAccumulateDao actZhangFeiAccumulateDao = this.getActZhangFeiAccumulateDao();
      int nowUnlockStageNum = this.getNowUnlockStageNum();
      Set<Integer> canReceiveRewardIds = isHighRechargeGear ? actZhangFeiAccumulateDao.canReceiveHighRewardIds : actZhangFeiAccumulateDao.canReceiveLowRewardIds;
      if (canReceiveRewardIds.size() <= 0) {
         return this.getAccumulateModelByStageNum(1, isHighRechargeGear);
      } else {
         List<Integer> canReceiveRewardIdList = (List)canReceiveRewardIds.stream().sorted((o1, o2) -> o2 - o1).collect(Collectors.toList());
         ZhangfeiAccumulateModel zhangfeiAccumulateModel = this.getAccumulateModelById((Integer)canReceiveRewardIdList.get(0));
         int nextStageNum = zhangfeiAccumulateModel.getStageNum() + 1;
         return nextStageNum > nowUnlockStageNum ? null : this.getAccumulateModelByStageNum(nextStageNum, isHighRechargeGear);
      }
   }

   public void accumulateEnd() {
      Set<Integer> allCanReceiveRewardIds = this.getAllCanReceiveRewardIds();
      List<ResourceModel> notReceiveRewardList = new ArrayList();
      if (allCanReceiveRewardIds.size() > 0) {
         for(Integer canReceiveRewardId : allCanReceiveRewardIds) {
            ZhangfeiAccumulateModel zhangfeiAccumulateModel = (ZhangfeiAccumulateModel)this.player.getGameModelPool().getEntity("zhangfeiAccumulate", canReceiveRewardId);
            if (null != zhangfeiAccumulateModel && zhangfeiAccumulateModel.getRewards().size() > 0) {
               notReceiveRewardList.addAll(zhangfeiAccumulateModel.getRewards());
            }
         }
      }

      if (notReceiveRewardList.size() > 0) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_ZHANG_FEI_ACCULUMATE);
         CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewardList, 604800000L, 84, 900);
      }

      ActZhangFeiAccumulateDao actZhangFeiAccumulateDao = this.getActZhangFeiAccumulateDao();
      actZhangFeiAccumulateDao.nowRechargeMoney = -1;
      actZhangFeiAccumulateDao.rechargeCut = 0;
      actZhangFeiAccumulateDao.canReceiveLowRewardIds.clear();
      actZhangFeiAccumulateDao.canReceiveHighRewardIds.clear();
      actZhangFeiAccumulateDao.hasReceiveRewardIds.clear();
      actZhangFeiAccumulateDao.resetTime = System.currentTimeMillis();
      actZhangFeiAccumulateDao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_AccumulateTotalInfo_17331(ActivityZhangFeiMsg.C2S_AccumulateTotalInfo_17331 msg, String source) {
      this.sendAccumulateRewardInfo();
   }

   public Set<Integer> getAllCanReceiveRewardIds() {
      Set<Integer> canReceiveRewardIds = new HashSet();
      ActZhangFeiAccumulateDao actZhangFeiAccumulateDao = this.getActZhangFeiAccumulateDao();
      canReceiveRewardIds.addAll(actZhangFeiAccumulateDao.canReceiveLowRewardIds);
      canReceiveRewardIds.addAll(actZhangFeiAccumulateDao.canReceiveHighRewardIds);
      if (actZhangFeiAccumulateDao.hasReceiveRewardIds.size() > 0) {
         canReceiveRewardIds.removeAll(actZhangFeiAccumulateDao.hasReceiveRewardIds);
      }

      return canReceiveRewardIds;
   }

   public void sendAccumulateRewardInfo() {
      ActZhangFeiAccumulateDao actZhangFeiAccumulateDao = this.getActZhangFeiAccumulateDao();
      ActivityZhangFeiMsg.S2C_AccumulateTotalInfo_17332.Builder builder = ActivityZhangFeiMsg.S2C_AccumulateTotalInfo_17332.newBuilder();
      builder.setUnlockStageNum(this.getNowUnlockStageNum());
      builder.addAllCanReceiveRewardIds(this.getAllCanReceiveRewardIds());
      builder.addAllHasReceiveRewardIds(actZhangFeiAccumulateDao.hasReceiveRewardIds);
      builder.addAllNextUnlockReceiveReward(this.getNextUnlockReceiveRewardList());
      this.player.sendMsg(builder.build());
   }

   public List<ActivityZhangFeiMsg.NextUnlockReceiveReward> getNextUnlockReceiveRewardList() {
      List<ActivityZhangFeiMsg.NextUnlockReceiveReward> nextUnlockReceiveRewardList = new ArrayList();
      ActZhangFeiAccumulateDao actZhangFeiAccumulateDao = this.getActZhangFeiAccumulateDao();
      ZhangfeiAccumulateModel lowSwimParkWineModel = this.getPrepareUnlockAccumulate(false);
      if (null != lowSwimParkWineModel) {
         ActivityZhangFeiMsg.NextUnlockReceiveReward.Builder lowReceiveReward = ActivityZhangFeiMsg.NextUnlockReceiveReward.newBuilder();
         lowReceiveReward.setRewardId(lowSwimParkWineModel.getId());
         double unlockCondition = (double)(actZhangFeiAccumulateDao.nowRechargeMoney - actZhangFeiAccumulateDao.rechargeCut);
         double progress = unlockCondition / (double)lowSwimParkWineModel.getRechargeNum() * (double)100.0F;
         lowReceiveReward.setProgress(progress);
         nextUnlockReceiveRewardList.add(lowReceiveReward.build());
      }

      ZhangfeiAccumulateModel highSwimParkWineModel = this.getPrepareUnlockAccumulate(true);
      if (null != highSwimParkWineModel) {
         ActivityZhangFeiMsg.NextUnlockReceiveReward.Builder highReceiveReward = ActivityZhangFeiMsg.NextUnlockReceiveReward.newBuilder();
         highReceiveReward.setRewardId(highSwimParkWineModel.getId());
         double nowRechargeMoney = (double)actZhangFeiAccumulateDao.nowRechargeMoney;
         double progress = nowRechargeMoney / (double)highSwimParkWineModel.getRechargeNum() * (double)100.0F;
         highReceiveReward.setProgress(progress);
         nextUnlockReceiveRewardList.add(highReceiveReward.build());
      }

      return nextUnlockReceiveRewardList;
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveAccumulateReward_17333(ActivityZhangFeiMsg.C2S_ReceiveAccumulateReward_17333 msg, String source) {
      ActZhangFeiAccumulateDao actZhangFeiAccumulateDao = this.getActZhangFeiAccumulateDao();
      int rewardId = msg.getRewardId();
      ZhangfeiAccumulateModel zhangfeiAccumulateModel = this.getAccumulateModelById(rewardId);
      if (null == zhangfeiAccumulateModel) {
         return this.player.failure(61207);
      } else if (!this.getAllCanReceiveRewardIds().contains(rewardId)) {
         return this.player.failure(61207);
      } else if (actZhangFeiAccumulateDao.hasReceiveRewardIds.contains(rewardId)) {
         return this.player.failure(61206);
      } else {
         this.player.addResource(zhangfeiAccumulateModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 84, 900, 0, 0, "");
         actZhangFeiAccumulateDao.hasReceiveRewardIds.add(rewardId);
         actZhangFeiAccumulateDao.updateOp();
         this.sendAccumulateRewardInfo();
         return true;
      }
   }

   public ActZhangFeiAccumulateDao getActZhangFeiAccumulateDao() {
      ActZhangFeiAccumulateDao dao = (ActZhangFeiAccumulateDao)this.player.getDataNoInsert("tb_activity_zhang_fei_accumulate", this.player.getPlayerId());
      if (dao == null) {
         dao = new ActZhangFeiAccumulateDao();
         dao.playerId = this.player.getPlayerId();
         dao.nowRechargeMoney = -1;
         dao.rechargeCut = 0;
         dao.canReceiveLowRewardIds.clear();
         dao.canReceiveHighRewardIds.clear();
         dao.hasReceiveRewardIds.clear();
         dao.resetTime = System.currentTimeMillis();
         this.player.insertDao(dao);
      }

      return dao;
   }

   public ZhangfeiAccumulateModel getAccumulateModelByStageNum(int stageNum, boolean isHighRechargeGear) {
      int rechargeGear = isHighRechargeGear ? 2 : 1;
      ZhangfeiAccumulateModel zhangfeiAccumulateModel = (ZhangfeiAccumulateModel)this.player.getGameModelPool().getEntity("zhangfeiAccumulateStageKey", stageNum + "_" + rechargeGear);
      return zhangfeiAccumulateModel;
   }

   public ZhangfeiAccumulateModel getAccumulateModelById(int id) {
      ZhangfeiAccumulateModel zhangfeiAccumulateModel = (ZhangfeiAccumulateModel)this.player.getGameModelPool().getEntity("zhangfeiAccumulate", id);
      return zhangfeiAccumulateModel;
   }

   public void gmHeroTheme(String params) {
      ActivityZhangFeiDao activityZhangFeiDao = (ActivityZhangFeiDao)this.player.getData("tb_activity_zhang_fei", this.player.getPlayerId());
      String[] strArr = params.split(",");
      switch (strArr[0]) {
         case "dam":
            activityZhangFeiDao.totalDamage += Long.parseLong(strArr[1]);
            break;
         case "resumefight":
            activityZhangFeiDao.fight = 0;
            break;
         case "allreset":
            activityZhangFeiDao.reset();
      }

      activityZhangFeiDao.updateOp();
      this.sendInfo();
   }
}
