package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.ActSiMaYiAccumulateDao;
import com.gzbz.db.ActivitySiMaYiDao;
import com.gzbz.db.BattleDao;
import com.gzbz.db.HeroArrayingDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.PlayerActivityDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.bean.ArrayingMirror;
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
import com.gzbz.model.ActHeroCallTaskModel;
import com.gzbz.model.ActivityOpenTimeModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.EventHeroBonusRewardModel;
import com.gzbz.model.EventHeroBossRewardModel;
import com.gzbz.model.EventHeroConfigModel;
import com.gzbz.model.HeroAccumulateModel;
import com.gzbz.model.HeroPondRewardModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.ActivitySiMaYiMsg;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.RankData;
import com.gzbz.spring.ApplicationContextProvider;
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
import java.util.concurrent.ConcurrentHashMap;
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
public class ActivitySiMaYiPart extends AbstractActivityPart {
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
   private static final int DEFAULT_STAGE = 1;
   private static final int ACTIVITY_DAYS_MAX = -1;

   public void rotateReset(int oldActivityId) {
      ActivitySiMaYiDao activitySiMaYiDao = (ActivitySiMaYiDao)this.player.getData("tb_activity_simayi", this.player.getPlayerId());
      activitySiMaYiDao.reset();
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
         ActivitySiMaYiDao activitySiMaYiDao = (ActivitySiMaYiDao)this.player.getData("tb_activity_simayi", this.player.getPlayerId());
         ActivitySiMaYiMsg.S2C_HeroThemeInfo_18102.Builder builder = ActivitySiMaYiMsg.S2C_HeroThemeInfo_18102.newBuilder();
         builder.setFight(activitySiMaYiDao.fight);
         builder.setTotalDamage(activitySiMaYiDao.totalDamage);
         builder.addAllFightReward(activitySiMaYiDao.fightReward);
         builder.setTotalPoint(activitySiMaYiDao.totalPoint);
         builder.addAllPointReward(activitySiMaYiDao.pointReward);
         ActivityInfo activityInfo = this.getServerActivityInfo();
         builder.setStartTime(activityInfo.start);
         builder.setEndTime(activityInfo.end);
         builder.setServerOpenDay(this.getActivityOpenDay());
         builder.setActivityDay(this.getSeverActivityDay());
         this.player.sendMsg(builder.build());
         this.accumulateRechargeHandle(0, false);
         this.lampRiddleRechargeHandle(0, true);
      }
   }

   public int getActivityType() {
      return 63;
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
   public void C2S_HeroThemeInfo_18101(ActivitySiMaYiMsg.C2S_HeroThemeInfo_18101 msg, String source) {
      this.sendInfo();
   }

   @MsgHandlerAnno
   public void C2S_Mate_18103(ActivitySiMaYiMsg.C2S_Mate_18103 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(21);
      } else {
         EventHeroConfigModel configModel = this.getConfigModel();
         int limitFight = configModel.getEventHeroFightTime();
         ActivitySiMaYiDao activitySiMaYiDao = (ActivitySiMaYiDao)this.player.getData("tb_activity_simayi", this.player.getPlayerId());
         if (activitySiMaYiDao.fight >= limitFight) {
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
            activitySiMaYiDao.matchPlayerId = matchPlayerId;
            activitySiMaYiDao.updateOp();
            PlayerPublicDao matchDao = matchPlayer.getPublicDao();
            ActivitySiMaYiMsg.S2C_Mate_18104.Builder builder = ActivitySiMaYiMsg.S2C_Mate_18104.newBuilder();
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
      ActivitySiMaYiDao activitySiMaYiDao = (ActivitySiMaYiDao)this.player.getData("tb_activity_simayi", this.player.getPlayerId());
      if (activitySiMaYiDao.fight >= limitFight) {
         return 0;
      } else if (activitySiMaYiDao.matchPlayerId == 0) {
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
      ActivitySiMaYiDao activitySiMaYiDao = (ActivitySiMaYiDao)this.player.getData("tb_activity_simayi", this.player.getPlayerId());
      GamePlayer matchPlayer = this.worldMgr.getPlayerById(activitySiMaYiDao.matchPlayerId);
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
      ActivitySiMaYiDao activitySiMaYiDao = (ActivitySiMaYiDao)this.player.getData("tb_activity_simayi", this.player.getPlayerId());
      if (battleDao.scene.getWave() == 1) {
         BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().build().getResult().toBuilder();
         result.setResult(0);
         long damage = battleDao.scene.getPKTeam((byte)1).getDamageValue();
         result.addSettleInfo(damage);
         battleDao.scene.getBattleMsg().setResult(result);
         activitySiMaYiDao.totalDamage += damage;
         ++activitySiMaYiDao.fight;
         activitySiMaYiDao.firstDamage = damage;
         int mvpHeroId = 0;
         long tempDamage = 0L;

         for(Entity entity : battleDao.scene.getPKTeam((byte)0).getEntityMap().values()) {
            if (entity.getAttackValue() > tempDamage) {
               tempDamage = entity.getAttackValue();
               mvpHeroId = entity.getDressHeroId();
            }
         }

         activitySiMaYiDao.mvpHeroId = mvpHeroId;
         activitySiMaYiDao.updateOp();
      } else {
         battleDao.status = 0;
         battleDao.updateOp();
         long damage = battleDao.scene.getPKTeam((byte)1).getDamageValue();
         long realDamage = damage - activitySiMaYiDao.firstDamage;
         activitySiMaYiDao.totalDamage += realDamage;
         activitySiMaYiDao.secondDamage = realDamage;
         List<ResourceModel> commonAward = new ArrayList();
         ActivityInfo activityInfo = this.getServerActivityInfo();
         ActivityOpenTimeModel activityOpenTimeModel = (ActivityOpenTimeModel)this.player.getGameModelPool().getEntity("activityopenTime", activityInfo.id);
         EventHeroBossRewardModel damageAwardModel = this.getDamageRewardModel(activitySiMaYiDao.firstDamage + activitySiMaYiDao.secondDamage);
         if (damageAwardModel != null) {
            for(ResourceModel resourceModel : damageAwardModel.getReward()) {
               ResourceModel.addResourceToList(commonAward, resourceModel);
               if (resourceModel.getType() == activityOpenTimeModel.getIntegralType() && resourceModel.getId() == activityOpenTimeModel.getIntegralId()) {
                  activitySiMaYiDao.totalPoint += resourceModel.getValue();
               }
            }
         } else {
            this.logger.error("主题武将伤害奖励获取错误！");
         }

         activitySiMaYiDao.updateOp();
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
         builder.addExParams(activitySiMaYiDao.mvpHeroId);
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
         ActivitySiMaYiDao activitySiMaYiDao = (ActivitySiMaYiDao)this.player.getData("tb_activity_simayi", this.player.getPlayerId());
         ActivitySiMaYiMsg.S2C_MatchBattle_18112.Builder builder = ActivitySiMaYiMsg.S2C_MatchBattle_18112.newBuilder();
         builder.setDamage(activitySiMaYiDao.firstDamage + activitySiMaYiDao.secondDamage);
         builder.setFightNum(activitySiMaYiDao.fight);
         builder.setTotalDamage(activitySiMaYiDao.totalDamage);
         builder.setTotalPoint(activitySiMaYiDao.totalPoint);
         this.player.sendMsg(builder.build());
         long damage = activitySiMaYiDao.firstDamage + activitySiMaYiDao.secondDamage;
         this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "司马懿挑战", award, damage + "", 0, 0, 1);
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
   public void C2S_PointReward_18107(ActivitySiMaYiMsg.C2S_PointReward_18107 msg, String source) {
      ActivitySiMaYiDao activitySiMaYiDao = (ActivitySiMaYiDao)this.player.getData("tb_activity_simayi", this.player.getPlayerId());
      if (activitySiMaYiDao.pointReward.contains(msg.getId())) {
         this.logger.info("已领取该奖励");
      } else {
         EventHeroBonusRewardModel bonusRewardModel = (EventHeroBonusRewardModel)ApplicationContextProvider.getModelPoolEntity("eventHeroBonusReward", msg.getId());
         if (bonusRewardModel == null) {
            this.logger.info("配置不存在");
         } else if (bonusRewardModel.getActivityId() != this.getPlayerActivityId()) {
            this.logger.info("领取的奖励不是该活动奖励 activityId:{}", this.getActivityType());
         } else if (activitySiMaYiDao.totalPoint < bonusRewardModel.getBonus()) {
            this.logger.info("总积分不足，不可领取");
         } else {
            activitySiMaYiDao.pointReward.add(msg.getId());
            activitySiMaYiDao.updateOp();
            this.player.addResource(bonusRewardModel.getReward(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 61, 6102, msg.getId(), 0, "");
            ActivitySiMaYiMsg.S2C_PointReward_18108.Builder builder = ActivitySiMaYiMsg.S2C_PointReward_18108.newBuilder();
            builder.setId(msg.getId());
            this.player.sendMsg(builder.build());
            this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 16, 18, "司马懿挑战", bonusRewardModel.getBonus() + "", bonusRewardModel.getBonus() + "", 0, 0, 1);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_TaskCommitTask_18113(ActivitySiMaYiMsg.C2S_TaskCommitTask_18113 msg, String source) {
   }

   @MsgHandlerAnno
   public void C2S_LootInfo_18121(ActivitySiMaYiMsg.C2S_LootInfo_18121 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         this.sendLootInfo();
      }
   }

   @MsgHandlerAnno
   public void C2S_LootReward_18123(ActivitySiMaYiMsg.C2S_LootReward_18123 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         ActivitySiMaYiDao activitySiMaYiDao = (ActivitySiMaYiDao)this.player.getData("tb_activity_simayi", this.player.getPlayerId());
         if (activitySiMaYiDao.enjoyId == 0) {
            this.player.failure(61226);
         } else {
            HeroPondRewardModel enjoyModel = (HeroPondRewardModel)ApplicationContextProvider.getModelPoolEntity("heroPondReward", activitySiMaYiDao.enjoyId);
            if (enjoyModel == null) {
               this.logger.info("司马懿活动 - 心仪奖励不存在 id:{}", activitySiMaYiDao.enjoyId);
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
                     this.logger.info("司马懿活动 - plyerId:{} 抽奖逻辑有误", this.player.getPlayerId());
                  } else if (lootNum >= weightList.size()) {
                     this.logger.info("抽取次数比奖池物品还要多。。。 抽取次数：{} 奖池物品数量：{}", lootNum, weightList.size());
                  } else {
                     for(int i = 0; i < lootNum; ++i) {
                        if (enjoyModel != null && activitySiMaYiDao.curLootNum + 1 >= enjoyModel.getAppearNum()) {
                           this.logger.info("司马懿活动 - 玩家 {} 抽取第{}次时触发必中心仪物品机制，重置奖池数据", this.player.getPlayerId(), activitySiMaYiDao.curLootNum + 1);
                           rewardIdList.add(enjoyModel.getId());
                           this.resetJackpot();
                        } else {
                           int rewardId = GamePlayer.countRate(weightList);
                           HeroPondRewardModel tempModel = (HeroPondRewardModel)ApplicationContextProvider.getModelPoolEntity("heroPondReward", rewardId);
                           if (tempModel.getFloorNum() > activitySiMaYiDao.curLootNum) {
                              rewardId = tempModel.getSwapId() > 0 ? tempModel.getSwapId() : rewardId;
                              this.logger.info("司马懿活动 - 玩家 {} 抽中了序号 {} 的奖励，但是前置次数需要{}，当前抽取次数为{}，替换为序号 {} 奖励", new Object[]{this.player.getPlayerId(), tempModel.getId(), tempModel.getFloorNum(), activitySiMaYiDao.curLootNum, rewardId});
                           }

                           this.logger.info("司马懿活动 - 玩家 {} 抽取第{}次时抽中奖励 {}", new Object[]{this.player.getPlayerId(), activitySiMaYiDao.curLootNum + 1, rewardId});
                           rewardIdList.add(rewardId);
                           if (rewardId == activitySiMaYiDao.enjoyId) {
                              this.logger.info("司马懿活动 - 玩家 {} 抽取第{}次时抽中了心仪物品，重置奖池数据", this.player.getPlayerId(), activitySiMaYiDao.curLootNum + 1);
                              this.resetJackpot();
                           } else {
                              ++activitySiMaYiDao.curLootNum;
                           }
                        }
                     }

                     if (rewardIdList.size() != lootNum) {
                        this.logger.error("司马懿活动 - 玩家 {} 抽奖发生错误 抽奖:{}次，获得{}个物品", new Object[]{this.player.getPlayerId(), lootNum, rewardIdList.size()});
                     }

                     this.player.delResource(2, configModel.getEventHeroCall(), (long)lootNum, 88, 8801, 0, lootNum, "");
                     List<ResourceModel> resourceModelList = new ArrayList();

                     for(Integer id : rewardIdList) {
                        HeroPondRewardModel model = (HeroPondRewardModel)ApplicationContextProvider.getModelPoolEntity("heroPondReward", id);
                        if (model == null) {
                           this.logger.info("司马懿活动 - 抽奖获得的奖励错误 id:{}", id);
                        } else {
                           resourceModelList.addAll(model.getItems());
                        }
                     }

                     this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 88, 8801, 0, 0, "");
                     activitySiMaYiDao.totalLootNum += lootNum;
                     activitySiMaYiDao.updateOp();
                     ActivitySiMaYiMsg.S2C_LootReward_18124.Builder builder = ActivitySiMaYiMsg.S2C_LootReward_18124.newBuilder();
                     builder.addAllRewardId(rewardIdList);
                     builder.setCurLootNum(activitySiMaYiDao.curLootNum);
                     builder.setHadEnjoy(activitySiMaYiDao.enjoyId == 0);
                     this.player.sendMsg(builder.build());
                     int enjoyId = enjoyModel.getItems().size() > 0 ? ((ResourceModel)enjoyModel.getItems().get(0)).getId() : 0;

                     for(ResourceModel resourceModel : resourceModelList) {
                        String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                        this.player.getOperationMgr().addExtraLog(this.player, 198, "司马懿活动-抽奖", "", lootNum + "", strings[0], strings[2], strings[1], strings[0].equals(String.valueOf(enjoyId)) ? "1" : "0");
                     }

                  }
               }
            }
         }
      }
   }

   private void resetJackpot() {
      ActivitySiMaYiDao activitySiMaYiDao = (ActivitySiMaYiDao)this.player.getData("tb_activity_simayi", this.player.getPlayerId());
      activitySiMaYiDao.enjoyId = 0;
      activitySiMaYiDao.curLootNum = 0;
   }

   @MsgHandlerAnno
   public void C2S_LootEnjoy_18125(ActivitySiMaYiMsg.C2S_LootEnjoy_18125 msg, String source) {
      ActivitySiMaYiDao activitySiMaYiDao = (ActivitySiMaYiDao)this.player.getData("tb_activity_simayi", this.player.getPlayerId());
      if (msg.getId() != 0) {
         HeroPondRewardModel model = (HeroPondRewardModel)ApplicationContextProvider.getModelPoolEntity("heroPondReward", msg.getId());
         if (model == null || model.getType() != 2 || model.getActId() != this.getPlayerActivityId()) {
            return;
         }
      }

      activitySiMaYiDao.enjoyId = msg.getId();
      activitySiMaYiDao.updateOp();
      ActivitySiMaYiMsg.S2C_LootEnjoy_18126.Builder builder = ActivitySiMaYiMsg.S2C_LootEnjoy_18126.newBuilder();
      builder.setId(msg.getId());
      this.player.sendMsg(builder.build());
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
         this.logger.error("司马懿活动 - {} 表错误，开服天数 {}", "heroPondReward", openDays);
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
      ActivitySiMaYiDao activitySiMaYiDao = (ActivitySiMaYiDao)this.player.getData("tb_activity_simayi", this.player.getPlayerId());
      ActivitySiMaYiMsg.S2C_LootInfo_18122.Builder builder = ActivitySiMaYiMsg.S2C_LootInfo_18122.newBuilder();
      builder.setEnjoyId(activitySiMaYiDao.enjoyId);
      builder.addAllRewardId(this.getJackpots());
      builder.setCurLootNum(activitySiMaYiDao.curLootNum);
      this.player.sendMsg(builder.build());
   }

   public void loginHandle() {
      if (!this.isServerActivityInvalid()) {
         this.checkAddUpIdListChange();
         this.checkConIdListChange();
         this.lampRiddleRechargeHandle(0, true);
         this.accumulateRechargeHandle(0, false);
      }

   }

   public void activityEnd(int oldActivityId) {
      this.accumulateEnd();
      this.lampRiddleActivityEnd();
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
      ActivitySiMaYiDao activitySiMaYiDao = (ActivitySiMaYiDao)this.player.getData("tb_activity_simayi", this.player.getPlayerId());

      for(EventHeroBonusRewardModel bonusRewardModel : (List<EventHeroBonusRewardModel>)this.player.getGameModelPool().getEntity("customEventHeroBonusReward", this.getPlayerActivityId())) {
         if (!activitySiMaYiDao.pointReward.contains(bonusRewardModel.getId()) && activitySiMaYiDao.totalPoint >= bonusRewardModel.getBonus()) {
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

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         ActivitySiMaYiDao activitySiMaYiDao = (ActivitySiMaYiDao)this.player.getData("tb_activity_simayi", this.player.getPlayerId());
         activitySiMaYiDao.fight = 0;
         activitySiMaYiDao.updateOp();
         ActSiMaYiAccumulateDao actSiMaYiAccumulateDao = (ActSiMaYiAccumulateDao)this.player.getData("tb_activity_simayi_accumulate", this.player.getPlayerId());
         if (actSiMaYiAccumulateDao.nowRechargeMoney != -1) {
            actSiMaYiAccumulateDao.nowRechargeMoney = 0;
            actSiMaYiAccumulateDao.rechargeCut = 0;
            actSiMaYiAccumulateDao.updateOp();
         }

         this.sendAccumulateRewardInfo();
         this.isStageChange();
      }
   }

   public void activityRecharge(int money) {
      this.accumulateRechargeHandle(money, true);
      this.lampRiddleRechargeHandle(money, true);
   }

   public int getJackpotOpenDays(Map<Integer, List<HeroPondRewardModel>> modelMap) {
      int openServerDay = DateUtil.difftimeDay(new Timestamp(this.worldMgr.getOpenServerTime())) + 1;
      int offsetDay = openServerDay - this.getSeverActivityDay() + 1;
      TreeMap<Integer, List<HeroPondRewardModel>> openDaysSet = new TreeMap(modelMap);
      offsetDay = offsetDay < (Integer)openDaysSet.firstKey() ? (Integer)openDaysSet.firstKey() : offsetDay;
      int openDays = (Integer)openDaysSet.floorKey(offsetDay);
      return openDays;
   }

   public int getNowUnlockStageNum() {
      int severActivityDay = this.getSeverActivityDay();
      Map<Integer, HeroAccumulateModel> all = this.player.getGameModelPool().getMap("HeroAccumulate");
      if (severActivityDay > 0 && all != null && !all.isEmpty()) {
         Collection<HeroAccumulateModel> values = all.values();
         List<HeroAccumulateModel> collect = (List)values.stream().sorted((o1, o2) -> o2.getStageNum() - o1.getStageNum()).collect(Collectors.toList());
         int maxStageNum = ((HeroAccumulateModel)collect.get(0)).getStageNum();
         return maxStageNum <= severActivityDay ? maxStageNum : severActivityDay;
      } else {
         return 1;
      }
   }

   public void accumulateRechargeHandle(int money, boolean sendMsg) {
      ActSiMaYiAccumulateDao actSiMaYiAccumulateDao = this.getActAccumulateDao();
      if (actSiMaYiAccumulateDao.nowRechargeMoney == -1) {
         PlayerDao playerDao = this.player.getPlayerDao();
         int dailyRecharge = 0;
         if (DateUtil.isSameDay(playerDao.updateTime)) {
            PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
            dailyRecharge = playerRechargeDao.dailyRecharge;
         }

         actSiMaYiAccumulateDao.nowRechargeMoney = dailyRecharge;
      } else {
         actSiMaYiAccumulateDao.nowRechargeMoney += money;
      }

      actSiMaYiAccumulateDao.updateOp();
      HeroAccumulateModel prepareUnlockLow = this.getPrepareUnlockAccumulate(false);
      if (null != prepareUnlockLow) {
         int unlockCondition = actSiMaYiAccumulateDao.nowRechargeMoney - actSiMaYiAccumulateDao.rechargeCut;
         if (unlockCondition >= prepareUnlockLow.getRechargeNum()) {
            actSiMaYiAccumulateDao.canReceiveLowRewardIds.add(prepareUnlockLow.getId());
            actSiMaYiAccumulateDao.rechargeCut = actSiMaYiAccumulateDao.nowRechargeMoney;
            actSiMaYiAccumulateDao.updateOp();
         }
      }

      HeroAccumulateModel prepareUnlockHigh = this.getPrepareUnlockAccumulate(true);
      if (null != prepareUnlockHigh) {
         int nowRechargeMoney = actSiMaYiAccumulateDao.nowRechargeMoney;
         if (nowRechargeMoney >= prepareUnlockHigh.getRechargeNum()) {
            actSiMaYiAccumulateDao.canReceiveHighRewardIds.add(prepareUnlockHigh.getId());
            actSiMaYiAccumulateDao.nowRechargeMoney = 0;
            actSiMaYiAccumulateDao.rechargeCut = 0;
            actSiMaYiAccumulateDao.updateOp();
         }
      }

      if (sendMsg) {
         this.sendAccumulateRewardInfo();
      }

   }

   public HeroAccumulateModel getPrepareUnlockAccumulate(boolean isHighRechargeGear) {
      ActSiMaYiAccumulateDao actSiMaYiAccumulateDao = this.getActAccumulateDao();
      int nowUnlockStageNum = this.getNowUnlockStageNum();
      Set<Integer> canReceiveRewardIds = isHighRechargeGear ? actSiMaYiAccumulateDao.canReceiveHighRewardIds : actSiMaYiAccumulateDao.canReceiveLowRewardIds;
      if (canReceiveRewardIds.size() <= 0) {
         return this.getAccumulateModelByStageNum(1, isHighRechargeGear);
      } else {
         List<Integer> canReceiveRewardIdList = (List)canReceiveRewardIds.stream().sorted((o1, o2) -> o2 - o1).collect(Collectors.toList());
         HeroAccumulateModel heroAccumulateModel = this.getAccumulateModelById((Integer)canReceiveRewardIdList.get(0));
         int nextStageNum = heroAccumulateModel.getStageNum() + 1;
         return nextStageNum > nowUnlockStageNum ? null : this.getAccumulateModelByStageNum(nextStageNum, isHighRechargeGear);
      }
   }

   public void accumulateEnd() {
      this.checkConIdListChange();
      Set<Integer> allCanReceiveRewardIds = this.getAllCanReceiveRewardIds();
      List<ResourceModel> notReceiveRewardList = new ArrayList();
      if (allCanReceiveRewardIds.size() > 0) {
         for(Integer canReceiveRewardId : allCanReceiveRewardIds) {
            HeroAccumulateModel heroAccumulateModel = (HeroAccumulateModel)this.player.getGameModelPool().getEntity("HeroAccumulate", canReceiveRewardId);
            if (null != heroAccumulateModel && heroAccumulateModel.getRewards().size() > 0) {
               notReceiveRewardList.addAll(heroAccumulateModel.getRewards());
            }
         }
      }

      if (notReceiveRewardList.size() > 0) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_SI_MA_YI_ACCULUMATE);
         CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewardList, 604800000L, 88, 901);
      }

      ActSiMaYiAccumulateDao actSiMaYiAccumulateDao = this.getActAccumulateDao();
      actSiMaYiAccumulateDao.nowRechargeMoney = -1;
      actSiMaYiAccumulateDao.rechargeCut = 0;
      actSiMaYiAccumulateDao.canReceiveLowRewardIds.clear();
      actSiMaYiAccumulateDao.canReceiveHighRewardIds.clear();
      actSiMaYiAccumulateDao.hasReceiveRewardIds.clear();
      actSiMaYiAccumulateDao.resetTime = System.currentTimeMillis();
      actSiMaYiAccumulateDao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_AccumulateTotalInfo_18131(ActivitySiMaYiMsg.C2S_AccumulateTotalInfo_18131 msg, String source) {
      this.sendAccumulateRewardInfo();
   }

   public Set<Integer> getAllCanReceiveRewardIds() {
      Set<Integer> canReceiveRewardIds = new HashSet();
      ActSiMaYiAccumulateDao actSiMaYiAccumulateDao = this.getActAccumulateDao();
      canReceiveRewardIds.addAll(actSiMaYiAccumulateDao.canReceiveLowRewardIds);
      canReceiveRewardIds.addAll(actSiMaYiAccumulateDao.canReceiveHighRewardIds);
      if (actSiMaYiAccumulateDao.hasReceiveRewardIds.size() > 0) {
         canReceiveRewardIds.removeAll(actSiMaYiAccumulateDao.hasReceiveRewardIds);
      }

      return canReceiveRewardIds;
   }

   public void sendAccumulateRewardInfo() {
      ActSiMaYiAccumulateDao actSiMaYiAccumulateDao = this.getActAccumulateDao();
      ActivitySiMaYiMsg.S2C_AccumulateTotalInfo_18132.Builder builder = ActivitySiMaYiMsg.S2C_AccumulateTotalInfo_18132.newBuilder();
      builder.setUnlockStageNum(this.getNowUnlockStageNum());
      builder.addAllCanReceiveRewardIds(this.getAllCanReceiveRewardIds());
      builder.addAllHasReceiveRewardIds(actSiMaYiAccumulateDao.hasReceiveRewardIds);
      builder.addAllNextUnlockReceiveReward(this.getNextUnlockReceiveRewardList());
      this.player.sendMsg(builder.build());
   }

   public List<ActivitySiMaYiMsg.NextUnlockReceiveReward> getNextUnlockReceiveRewardList() {
      List<ActivitySiMaYiMsg.NextUnlockReceiveReward> nextUnlockReceiveRewardList = new ArrayList();
      ActSiMaYiAccumulateDao actSiMaYiAccumulateDao = this.getActAccumulateDao();
      HeroAccumulateModel lowHeroAccumulateModel = this.getPrepareUnlockAccumulate(false);
      if (null != lowHeroAccumulateModel) {
         ActivitySiMaYiMsg.NextUnlockReceiveReward.Builder lowReceiveReward = ActivitySiMaYiMsg.NextUnlockReceiveReward.newBuilder();
         lowReceiveReward.setRewardId(lowHeroAccumulateModel.getId());
         double unlockCondition = (double)(actSiMaYiAccumulateDao.nowRechargeMoney - actSiMaYiAccumulateDao.rechargeCut);
         double progress = unlockCondition / (double)lowHeroAccumulateModel.getRechargeNum() * (double)100.0F;
         lowReceiveReward.setProgress(progress);
         nextUnlockReceiveRewardList.add(lowReceiveReward.build());
      }

      HeroAccumulateModel highHeroAccumulateModel = this.getPrepareUnlockAccumulate(true);
      if (null != highHeroAccumulateModel) {
         ActivitySiMaYiMsg.NextUnlockReceiveReward.Builder highReceiveReward = ActivitySiMaYiMsg.NextUnlockReceiveReward.newBuilder();
         highReceiveReward.setRewardId(highHeroAccumulateModel.getId());
         double nowRechargeMoney = (double)actSiMaYiAccumulateDao.nowRechargeMoney;
         double progress = nowRechargeMoney / (double)highHeroAccumulateModel.getRechargeNum() * (double)100.0F;
         highReceiveReward.setProgress(progress);
         nextUnlockReceiveRewardList.add(highReceiveReward.build());
      }

      return nextUnlockReceiveRewardList;
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveAccumulateReward_18133(ActivitySiMaYiMsg.C2S_ReceiveAccumulateReward_18133 msg, String source) {
      ActSiMaYiAccumulateDao actSiMaYiAccumulateDao = this.getActAccumulateDao();
      int rewardId = msg.getRewardId();
      HeroAccumulateModel heroAccumulateModel = this.getAccumulateModelById(rewardId);
      if (null == heroAccumulateModel) {
         return this.player.failure(61207);
      } else if (!this.getAllCanReceiveRewardIds().contains(rewardId)) {
         return this.player.failure(61207);
      } else if (actSiMaYiAccumulateDao.hasReceiveRewardIds.contains(rewardId)) {
         return this.player.failure(61206);
      } else {
         this.player.addResource(heroAccumulateModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 88, 901, 0, 0, "");
         actSiMaYiAccumulateDao.hasReceiveRewardIds.add(rewardId);
         actSiMaYiAccumulateDao.updateOp();
         this.sendAccumulateRewardInfo();
         return true;
      }
   }

   @MsgHandlerAnno
   public void C2S_CumulativeInfo_18135(ActivitySiMaYiMsg.C2S_CumulativeInfo_18135 msg, String source) {
      this.sendLampRiddleRechargeRewardInfo();
   }

   @MsgHandlerAnno
   public void C2S_GetCumulativeReward_18137(ActivitySiMaYiMsg.C2S_GetCumulativeReward_18137 msg, String source) {
      this.isStageChange();
      int rewardId = msg.getRewardId();
      ActivitySiMaYiDao activitySiMaYiDao = (ActivitySiMaYiDao)this.player.getData("tb_activity_simayi", this.player.getPlayerId());
      if (activitySiMaYiDao.addUpGotRewards.contains(rewardId)) {
         this.player.failure(61211);
      } else {
         ActHeroCallTaskModel model = (ActHeroCallTaskModel)ApplicationContextProvider.getModelPoolEntity("actHeroCallTask", rewardId);
         if (null == model) {
            this.player.failure(37);
         } else if (!this.checkLampRiddleRewardStage(rewardId)) {
            this.logger.info("领取的奖励id:{} 不是本阶段奖励,本阶段是activityStartDay:{},severActivityDay:{}", new Object[]{rewardId, this.getActivityOpenDay(), this.getSeverActivityDay()});
            this.player.failure(61224);
         } else if (!this.checkUnlockLampRiddle(rewardId)) {
            this.player.failure(61212);
         } else {
            this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 88, 8803, 0, 0, "");
            activitySiMaYiDao.addUpGotRewards.add(rewardId);
            activitySiMaYiDao.updateOp();
            this.sendLampRiddleRechargeRewardInfo();
         }
      }
   }

   public ActSiMaYiAccumulateDao getActAccumulateDao() {
      ActSiMaYiAccumulateDao dao = (ActSiMaYiAccumulateDao)this.player.getDataNoInsert("tb_activity_simayi_accumulate", this.player.getPlayerId());
      if (dao == null) {
         dao = new ActSiMaYiAccumulateDao();
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

   public HeroAccumulateModel getAccumulateModelByStageNum(int stageNum, boolean isHighRechargeGear) {
      int rechargeGear = isHighRechargeGear ? 2 : 1;
      TreeMap<Integer, ConcurrentHashMap<String, HeroAccumulateModel>> modelTreeMap = (TreeMap)this.player.getGameModelPool().getEntity("curtomHeroAccumulate", this.getPlayerActivityId());
      if (CollectionUtils.isEmpty(modelTreeMap)) {
         this.logger.warn("司马懿活动 - 没有累充配置数据 activityId:{}", this.getPlayerActivityId());
         return null;
      } else {
         int openServerDay = this.getActivityOpenDay();
         int daysStart = (Integer)modelTreeMap.floorKey(openServerDay);
         ConcurrentHashMap<String, HeroAccumulateModel> modelMap = (ConcurrentHashMap)modelTreeMap.get(daysStart);
         if (CollectionUtils.isEmpty(modelMap)) {
            this.logger.warn("司马懿活动 - 没有累充配置数据 activityId:{} openServerDay:{} daysStart:{}", new Object[]{this.getPlayerActivityId(), openServerDay, daysStart});
         }

         return (HeroAccumulateModel)modelMap.get(stageNum + "_" + rechargeGear);
      }
   }

   public HeroAccumulateModel getAccumulateModelById(int id) {
      return (HeroAccumulateModel)this.player.getGameModelPool().getEntity("HeroAccumulate", id);
   }

   public List<ActHeroCallTaskModel> getAddUpRewardByStage(int stage) {
      List<ActHeroCallTaskModel> modelList = new ArrayList();
      int activityStartDay = this.getActivityOpenDay();
      TreeMap<Integer, ActHeroCallTaskModel> modelTreeMap = (TreeMap)ApplicationContextProvider.getModelPoolEntity("curstomActHeroCallTask", this.getPlayerActivityId());

      for(ActHeroCallTaskModel model : modelTreeMap.values()) {
         if (model.getStage() == stage) {
            if (model.getDateEnd() == -1) {
               if (activityStartDay >= model.getDateStart()) {
                  modelList.add(model);
               }
            } else if (activityStartDay >= model.getDateStart() && activityStartDay <= model.getDateEnd()) {
               modelList.add(model);
            }
         }
      }

      return modelList;
   }

   public void lampRiddleRechargeHandle(int money, boolean sendMsg) {
      int addMoney = this.calcAndReturnAddMoney(money);
      this.isStageChange();
      ActivitySiMaYiDao activitySiMaYiDao = (ActivitySiMaYiDao)this.player.getData("tb_activity_simayi", this.player.getPlayerId());
      activitySiMaYiDao.stageRechargeMoney += addMoney;
      activitySiMaYiDao.updateOp();
      if (sendMsg) {
         this.sendLampRiddleRechargeRewardInfo();
      }

   }

   public void sendLampRiddleNotReceiveRewardMail() {
      ActivitySiMaYiDao activitySiMaYiDao = (ActivitySiMaYiDao)this.player.getData("tb_activity_simayi", this.player.getPlayerId());
      List<ActHeroCallTaskModel> modelList = this.getAddUpRewardByStage(activitySiMaYiDao.stage);
      if (null != modelList && modelList.size() > 0) {
         List<Integer> notReceiveIdList = new ArrayList();
         List<ResourceModel> notReceiveRewardList = new ArrayList();

         for(ActHeroCallTaskModel model : modelList) {
            Integer rewardId = model.getId();
            if (this.checkUnlockLampRiddle(rewardId) && !activitySiMaYiDao.addUpGotRewards.contains(rewardId) && model.getRewards().size() > 0) {
               notReceiveIdList.add(rewardId);
               notReceiveRewardList.addAll(model.getRewards());
            }
         }

         if (notReceiveRewardList.size() > 0) {
            Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
            TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_SI_MA_YI_LAMP_RIDDLE);
            CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewardList, 604800000L, 88, 8803);
         }

         if (notReceiveIdList.size() > 0) {
            activitySiMaYiDao.addUpGotRewards.addAll(notReceiveIdList);
            activitySiMaYiDao.updateOp();
         }
      }

      activitySiMaYiDao.stageRechargeMoney = 0;
      activitySiMaYiDao.updateOp();
   }

   public void lampRiddleActivityEnd() {
      this.checkAddUpIdListChange();
      this.sendLampRiddleNotReceiveRewardMail();
      ActivitySiMaYiDao activitySiMaYiDao = (ActivitySiMaYiDao)this.player.getData("tb_activity_simayi", this.player.getPlayerId());
      activitySiMaYiDao.stage = 1;
      activitySiMaYiDao.addUpGotRewards.clear();
      activitySiMaYiDao.updateOp();
      PlayerActivityDao playerActivityDao = (PlayerActivityDao)this.player.getData("tb_player_activity", this.player.getPlayerId());
      playerActivityDao.activityRecharge.remove(this.getActivityType());
      playerActivityDao.updateOp();
   }

   public boolean isStageChange() {
      this.checkAddUpIdListChange();
      int nowStage = this.getNowStage();
      ActivitySiMaYiDao activitySiMaYiDao = (ActivitySiMaYiDao)this.player.getData("tb_activity_simayi", this.player.getPlayerId());
      if (nowStage != activitySiMaYiDao.stage) {
         this.sendLampRiddleNotReceiveRewardMail();
         activitySiMaYiDao.stage = nowStage;
         activitySiMaYiDao.updateOp();
         this.sendLampRiddleRechargeRewardInfo();
         return true;
      } else {
         return false;
      }
   }

   public int getNowStage() {
      int stage = 1;
      TreeMap<Integer, ActHeroCallTaskModel> modelTreeMap = (TreeMap)ApplicationContextProvider.getModelPoolEntity("curstomActHeroCallTask", this.getPlayerActivityId());
      if (modelTreeMap != null && modelTreeMap.size() > 0) {
         int activityStartDay = this.getActivityOpenDay();
         int severActivityDay = this.getSeverActivityDay();
         if (severActivityDay <= 0) {
            return stage;
         }

         for(ActHeroCallTaskModel model : modelTreeMap.values()) {
            if (model.getStage() > stage) {
               stage = model.getStage();
            }

            if (model.getDateEnd() == -1) {
               if (activityStartDay >= model.getDateStart() && severActivityDay >= model.getStageStart() && severActivityDay <= model.getStageEnd()) {
                  return model.getStage();
               }
            } else if (activityStartDay >= model.getDateStart() && activityStartDay <= model.getDateEnd() && severActivityDay >= model.getStageStart() && severActivityDay <= model.getStageEnd()) {
               return model.getStage();
            }
         }
      }

      return stage;
   }

   public void sendLampRiddleRechargeRewardInfo() {
      ActivitySiMaYiMsg.S2C_CumulativeInfo_18136.Builder resp = ActivitySiMaYiMsg.S2C_CumulativeInfo_18136.newBuilder();
      ActivitySiMaYiDao activitySiMaYiDao = (ActivitySiMaYiDao)this.player.getData("tb_activity_simayi", this.player.getPlayerId());
      resp.addAllGotRewards(activitySiMaYiDao.addUpGotRewards);
      resp.setStageRecharge(activitySiMaYiDao.stageRechargeMoney);
      this.player.sendMsg(resp.build());
   }

   public boolean checkLampRiddleRewardStage(int id) {
      ActHeroCallTaskModel model = (ActHeroCallTaskModel)this.player.getGameModelPool().getEntity("actHeroCallTask", id);
      if (null == model) {
         return false;
      } else {
         int activityStartDay = this.getActivityOpenDay();
         ActivitySiMaYiDao activitySiMaYiDao = (ActivitySiMaYiDao)this.player.getData("tb_activity_simayi", this.player.getPlayerId());
         if (model.getDateEnd() == -1) {
            if (activityStartDay >= model.getDateStart() && activitySiMaYiDao.stage == model.getStage()) {
               return true;
            }
         } else if (activityStartDay >= model.getDateStart() && activityStartDay <= model.getDateEnd() && activitySiMaYiDao.stage == model.getStage()) {
            return true;
         }

         return false;
      }
   }

   public boolean checkUnlockLampRiddle(int id) {
      ActHeroCallTaskModel actHeroCallTaskModel = (ActHeroCallTaskModel)ApplicationContextProvider.getModelPoolEntity("actHeroCallTask", id);
      if (null == actHeroCallTaskModel) {
         return false;
      } else {
         ActivitySiMaYiDao activitySiMaYiDao = (ActivitySiMaYiDao)this.player.getData("tb_activity_simayi", this.player.getPlayerId());
         return activitySiMaYiDao.stageRechargeMoney >= actHeroCallTaskModel.getRechargeNum();
      }
   }

   public void gmHeroTheme(String params) {
      ActivitySiMaYiDao activitySiMaYiDao = (ActivitySiMaYiDao)this.player.getData("tb_activity_simayi", this.player.getPlayerId());
      String[] strArr = params.split(",");
      switch (strArr[0]) {
         case "dam":
            activitySiMaYiDao.totalDamage += Long.parseLong(strArr[1]);
            break;
         case "resumefight":
            activitySiMaYiDao.fight = 0;
            break;
         case "allreset":
            activitySiMaYiDao.reset();
            break;
         case "lootinfo":
            this.sendLootInfo();
      }

      activitySiMaYiDao.updateOp();
      this.sendInfo();
   }

   public void checkAddUpIdListChange() {
      ActivitySiMaYiDao dao = (ActivitySiMaYiDao)this.player.getData("tb_activity_simayi", this.player.getPlayerId());
      Set<Integer> addUpGotRewards = dao.addUpGotRewards;
      if (!addUpGotRewards.isEmpty()) {
         Map<Integer, ActHeroCallTaskModel> stageModelMap = this.player.getGameModelPool().getMap("actHeroCallTask");
         if (null != stageModelMap && stageModelMap.size() > 0) {
            int activityOpenDay = this.getActivityOpenDay();
            List<ActHeroCallTaskModel> addUpRechargeModelList = new ArrayList();
            Set<Integer> addUpIdSet = new HashSet();

            for(ActHeroCallTaskModel model : stageModelMap.values()) {
               if (model.getActivityId() == this.getPlayerActivityId()) {
                  if (model.getDateEnd() == -1) {
                     if (activityOpenDay >= model.getDateStart()) {
                        addUpIdSet.add(model.getId());
                        addUpRechargeModelList.add(model);
                     }
                  } else if (activityOpenDay >= model.getDateStart() && activityOpenDay <= model.getDateEnd()) {
                     addUpIdSet.add(model.getId());
                     addUpRechargeModelList.add(model);
                  }
               }
            }

            if (addUpIdSet.size() <= 0) {
               this.logger.info("活动id:{} 累充配置表为空，请检查配置表", this.getActivityType());
            } else {
               int nowAddUpStage = this.getNowStage();
               if (addUpIdSet.containsAll(addUpGotRewards) && dao.stage > nowAddUpStage || !addUpIdSet.containsAll(addUpGotRewards)) {
                  Set<Integer> newAddUpGotRewards = new HashSet();

                  for(int id : addUpGotRewards) {
                     ActHeroCallTaskModel addUpModel = (ActHeroCallTaskModel)this.player.getGameModelPool().getEntity("actHeroCallTask", id);
                     if (null != addUpModel) {
                        int modelStage = addUpModel.getStage();
                        int modelRechargeNum = addUpModel.getRechargeNum();
                        if (modelStage > nowAddUpStage) {
                           if (dao.stage == modelStage) {
                              for(ActHeroCallTaskModel addUpRechargeModel : addUpRechargeModelList) {
                                 if (addUpRechargeModel.getStage() == nowAddUpStage && addUpRechargeModel.getRechargeNum() == modelRechargeNum) {
                                    newAddUpGotRewards.add(addUpRechargeModel.getId());
                                    break;
                                 }
                              }
                           }
                        } else {
                           for(ActHeroCallTaskModel addUpRechargeModel : addUpRechargeModelList) {
                              if (addUpRechargeModel.getStage() == modelStage && addUpRechargeModel.getRechargeNum() == modelRechargeNum) {
                                 newAddUpGotRewards.add(addUpRechargeModel.getId());
                                 break;
                              }
                           }
                        }
                     }
                  }

                  if (dao.stage > nowAddUpStage) {
                     dao.stage = nowAddUpStage;
                  }

                  dao.addUpGotRewards.clear();
                  dao.addUpGotRewards.addAll(newAddUpGotRewards);
                  dao.updateOp();
               }

            }
         } else {
            this.logger.info("活动id:{} 累充配置表为空，请检查配置表", this.getActivityType());
         }
      }
   }

   public void checkConIdListChange() {
      List<HeroAccumulateModel> conModelList = this.getHeroAccumulateModelList();
      if (conModelList != null && conModelList.size() > 0) {
         Set<Integer> conIdSet = new HashSet();

         for(HeroAccumulateModel model : conModelList) {
            conIdSet.add(model.getId());
         }

         ActSiMaYiAccumulateDao dao = this.getActAccumulateDao();
         this.replaceConRewardIds(dao.canReceiveLowRewardIds, conIdSet, conModelList);
         this.replaceConRewardIds(dao.canReceiveHighRewardIds, conIdSet, conModelList);
         this.replaceConRewardIds(dao.hasReceiveRewardIds, conIdSet, conModelList);
         dao.updateOp();
      } else {
         this.logger.info("活动id:{} 连充配置表为空，请检查配置表", this.getActivityType());
      }
   }

   private void replaceConRewardIds(Set<Integer> daoRewardIds, Set<Integer> conIdSet, List<HeroAccumulateModel> conModelList) {
      if (!daoRewardIds.isEmpty() && !conIdSet.containsAll(daoRewardIds)) {
         Set<Integer> newHasReceiveRewardIds = new HashSet();

         for(Integer rewardId : daoRewardIds) {
            HeroAccumulateModel conModelById = this.getAccumulateModelById(rewardId);
            if (null != conModelById) {
               int stageNum = conModelById.getStageNum();
               int rechargeGear = conModelById.getRechargeGear();

               for(HeroAccumulateModel model : conModelList) {
                  if (stageNum == model.getStageNum() && rechargeGear == model.getRechargeGear()) {
                     newHasReceiveRewardIds.add(model.getId());
                     break;
                  }
               }
            }
         }

         daoRewardIds.clear();
         daoRewardIds.addAll(newHasReceiveRewardIds);
      }

   }

   public List<HeroAccumulateModel> getHeroAccumulateModelList() {
      List<HeroAccumulateModel> modelList = new ArrayList();
      Map<Integer, HeroAccumulateModel> all = this.player.getGameModelPool().getMap("HeroAccumulate");
      if (null != all && all.size() > 0) {
         Collection<HeroAccumulateModel> values = all.values();
         int activityStartDay = this.getActivityOpenDay();

         for(HeroAccumulateModel model : values) {
            if (model.getActid() == this.getPlayerActivityId()) {
               if (model.getDays() == -1) {
                  if (activityStartDay >= model.getDaysStart()) {
                     modelList.add(model);
                  }
               } else if (activityStartDay >= model.getDaysStart() && activityStartDay <= model.getDays()) {
                  modelList.add(model);
               }
            }
         }

         return modelList;
      } else {
         return modelList;
      }
   }
}
