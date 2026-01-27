package com.gzbz.gamePlayer.battle;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.db.BattleDao;
import com.gzbz.db.BattleHeroTrainingDao;
import com.gzbz.db.FriendDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.HeroSupportDao;
import com.gzbz.db.arraying.ArrayingEntity;
import com.gzbz.db.arraying.FriendArrayingEntity;
import com.gzbz.db.arraying.HeroArrayingEntity;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.HeroMirror;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.guanjia.GuanJiaPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroRankMgr;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.BattleHeroTrainingBuffModel;
import com.gzbz.model.BattleHeroTrainingModel;
import com.gzbz.model.BattleHeroTrainingRewardModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.BattleDailyMsg;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import com.gzbz.worldMgr.WorldMgrPushTaskPart;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import misc.CalculateUtil;
import misc.DateUtil;
import misc.RandomUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class BattleHeroTrainingPart extends PlayerPart {
   private final ConfigManager configManager;
   private final WorldMgr worldMgr;
   public static final int RANDOM_BUFF_TIME = 300000;
   private static final String DISPATCH_REWARD = "battleHeroTrainingReward";
   private static final String BATTLE_HERO_TRAINING_COMBAT_POWER = "battleHeroTrainingCombatPower";

   public BattleHeroTrainingPart(ConfigManager configManager, WorldMgr worldMgr) {
      this.configManager = configManager;
      this.worldMgr = worldMgr;
   }

   @MsgHandlerAnno
   public void setSupportHero(BattleDailyMsg.C2S_SetSupportHero_6606 msg, String source) {
      int heroCode = msg.getHeroCode();
      BattleHeroTrainingDao myTrainingDao = this.getBattleHeroTrainingDao();
      WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
      if (msg.getIsDispatch()) {
         HeroDao heroDao = this.getHeroDao(this.player, heroCode);
         worldMgrPushTaskPart.pushTaskEx("addHeroSupport", new Object[]{HeroSupportDao.SupportModule.HERO_TRAIL, heroDao, this, "heroTrailDispatch"});
      } else {
         int friendCode = msg.getFriendCode();
         if (friendCode == 0) {
            myTrainingDao.friendCode = 0;
            myTrainingDao.updateOp();
            this.sendSetSupportResult(false);
         } else {
            FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
            if (!friendDao.friends.contains(friendCode)) {
               this.player.failure(6006);
               return;
            }

            GamePlayer friendPlayer = this.worldMgr.getPlayerById(friendCode);
            if (friendPlayer == null) {
               this.player.failure(17);
               return;
            }

            worldMgrPushTaskPart.pushTaskEx("choiceHeroSupport", new Object[]{HeroSupportDao.SupportModule.HERO_TRAIL, friendCode, this, "choiceHeroTrailSupport"});
         }
      }

   }

   @TaskMethod
   public void choiceHeroTrailSupport(HeroSupportDao heroSupportDao) {
      HeroDao myHero = this.player.getHeroOfMaxCombatPower();
      float powerPer = this.configManager.getFloat("battleHeroTrainingCombatPower");
      if ((float)(myHero == null ? 0L : myHero.combatPower) * powerPer < (float)heroSupportDao.heroSupport.combatPower) {
         this.player.failure(5009);
      } else {
         BattleHeroTrainingDao myTrainingDao = this.getBattleHeroTrainingDao();
         myTrainingDao.friendCode = heroSupportDao.playerId;
         if (!myTrainingDao.friendIds.contains(myTrainingDao.friendCode)) {
            myTrainingDao.friendIds.add(myTrainingDao.friendCode);
            GamePlayer friendPlayer = this.worldMgr.getPlayerById(myTrainingDao.friendCode);
            if (friendPlayer != null) {
               BattleHeroTrainingPart friendHeroTrailPart = (BattleHeroTrainingPart)friendPlayer.getMgrPart(BattleHeroTrainingPart.class);
               friendHeroTrailPart.pushTaskEx("addHeroTrailBeSupport", new Object[0]);
            }
         }

         myTrainingDao.updateOp();
         this.sendSetSupportResult(false);
      }
   }

   @MsgHandlerAnno
   public void getTrainingConfig(BattleDailyMsg.C2S_GetTrainingConfig_6608 msg, String source) {
      this.player.sendMsg(this.buildTrainingInfo());
   }

   @MsgHandlerAnno
   public void enterHeroTraining(BattleDailyMsg.C2S_EnterHeroTraining_6613 msg, String source) {
      BattleHeroTrainingDao myTrainingDao = this.getBattleHeroTrainingDao();
      if (msg.getTrainingId() != myTrainingDao.startTier) {
         this.player.failure(6);
      } else {
         myTrainingDao.randomBuffTime = DateUtil.getIntTime(System.currentTimeMillis() + 300000L);
         myTrainingDao.friendPos = (byte)msg.getFriendPos();
         myTrainingDao.updateOp();
         this.player.sendMsg(this.buildTrainingInfo());
      }
   }

   @MsgHandlerAnno
   public void C2S_EndHeroTraining_6615(BattleDailyMsg.C2S_EndHeroTraining_6615 msg, String source) {
      BattlePart battlePart = (BattlePart)this.player.getMgrPart(BattlePart.class);
      battlePart.end(1250, true);
   }

   @MsgHandlerAnno
   public void getTierReward(BattleDailyMsg.C2S_GetTierReward_6617 msg, String source) {
      BattleHeroTrainingDao trainingDao = this.getBattleHeroTrainingDao();
      int tierId = msg.getTierId();
      if (tierId > trainingDao.historyMaxTier) {
         this.player.failure(5010);
      } else if (tierId <= trainingDao.tierReward) {
         this.player.failure(5011);
      } else {
         BattleHeroTrainingModel model = (BattleHeroTrainingModel)this.player.getGameModelPool().getEntity("battleHeroTraining", tierId);
         if (model != null && model.getRewards() != null && !model.getRewards().isEmpty()) {
            trainingDao.tierReward = tierId;
            trainingDao.updateOp();
            this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 5, 506, trainingDao.historyMaxTier, tierId, "");
            BattleDailyMsg.S2C_GetTierReward_6618.Builder down = BattleDailyMsg.S2C_GetTierReward_6618.newBuilder();
            down.setTierId(tierId);
            this.player.sendMsg(down.build());
         } else {
            this.player.failure(5012);
         }
      }
   }

   @TaskMethod
   public void heroTrailDispatch(HeroSupportDao.SupportModule supportModule) {
      String[] dispatchRewardArr = this.configManager.getStr("battleHeroTrainingReward").split(",");
      this.player.addResource(Integer.parseInt(dispatchRewardArr[0]), Integer.parseInt(dispatchRewardArr[1]), Integer.parseInt(dispatchRewardArr[2]), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 5, 517, 0, 0, "");
      this.player.triggerTask(531, 0, 1L, 1);
      this.sendSetSupportResult(true);
   }

   private void sendSetSupportResult(boolean isDispatch) {
      BattleHeroTrainingDao trainingDao = this.getBattleHeroTrainingDao();
      BattleDailyMsg.S2C_SetSupportHero_6607.Builder down = BattleDailyMsg.S2C_SetSupportHero_6607.newBuilder();
      WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
      HeroSupportDao heroSupportDao = worldMgrPushTaskPart.getHeroSupportDao(HeroSupportDao.SupportModule.HERO_TRAIL, this.player.getPlayerId());
      if (heroSupportDao != null) {
         down.setMySupportHero(heroSupportDao.heroSupport.toBuilder());
      }

      down.setFriendHeroCode(trainingDao.friendCode);
      down.setIsDispatch(isDispatch);
      this.player.sendMsg(down.build());
   }

   public boolean isInBattle() {
      BattleHeroTrainingDao myTrainingDao = this.getBattleHeroTrainingDao();
      return myTrainingDao.battleRound > 0 || myTrainingDao.randomBuffTime > 0;
   }

   public int beginTraining(BattleDao battleDao) {
      BattleHeroTrainingDao myTrainingDao = this.getBattleHeroTrainingDao();
      if (battleDao.needSendMsg && battleDao.params.isEmpty()) {
         return 6;
      } else {
         this.randomBuff(battleDao);
         myTrainingDao.friendPos = ((Integer)battleDao.params.get(0)).byteValue();
         if (myTrainingDao.friendCode > 0) {
            GamePlayer friendPlayer = this.worldMgr.getPlayerById(myTrainingDao.friendCode);
            this.handleFriendSupport(myTrainingDao, friendPlayer, battleDao.scene);
         }

         BattlePKTeam myPKTeam = battleDao.scene.getPKTeam((byte)0);
         if (myPKTeam.getEntityMap().size() == 0) {
            return 4125;
         } else {
            int checkCode = myPKTeam.checkArraying();
            if (checkCode != 1) {
               return checkCode;
            } else {
               myTrainingDao.updateOp();
               return this.training(battleDao);
            }
         }
      }
   }

   public int nextTraining(BattleDao battleDao) {
      if (battleDao.status == 0) {
         this.logger.error("血战长坂 next battle error,battle is already end");
         return 44;
      } else if (battleDao.status == 2) {
         this.logger.error("血战长坂 next battle error,battle is all pass");
         return 43;
      } else if (battleDao.scene.getWave() < 1) {
         this.logger.error("血战长坂 next battle error,battle is illegal request,current wave:{},total wave:{}", battleDao.scene.getWave(), battleDao.scene.getTotalWave());
         return 6;
      } else {
         this.randomBuff(battleDao);
         return this.training(battleDao);
      }
   }

   private void randomBuff(BattleDao battleDao) {
      if (battleDao.buffId <= 0) {
         if (battleDao.needSendMsg) {
            this.logger.warn("开场buff有误,buff:{}", battleDao.buffId);
         }

         Map<Integer, BattleHeroTrainingBuffModel> buffModelMap = ApplicationContextProvider.<Integer, BattleHeroTrainingBuffModel>getModelPoolMap("battleHeroTrainingBuff");
         List<BattleHeroTrainingBuffModel> buffModels = new ArrayList(buffModelMap.values());
         int buffIndex = RandomUtil.randInt(0, buffModels.size());
         battleDao.buffId = ((BattleHeroTrainingBuffModel)buffModels.get(buffIndex)).getId();
      }

   }

   private int training(BattleDao battleDao) {
      BattleHeroTrainingDao myTrainingDao = this.getBattleHeroTrainingDao();
      BattleHeroTrainingModel trainingModel = (BattleHeroTrainingModel)this.player.getGameModelPool().getEntity("battleHeroTraining", myTrainingDao.startTier);
      if (trainingModel == null) {
         return 0;
      } else {
         Map<Integer, BattleHeroTrainingModel> allModel = ApplicationContextProvider.<Integer, BattleHeroTrainingModel>getModelPoolMap("battleHeroTraining");
         short totalWave = 5;
         short totalWaveLess = (short)(allModel.size() - myTrainingDao.startTier + 1);
         if (totalWaveLess < totalWave) {
            totalWave = totalWaveLess;
         }

         short wave = (short)((myTrainingDao.battleRound + 1) % totalWave);
         wave = wave == 0 ? totalWave : wave;
         battleDao.scene.setWave(wave, totalWave);
         battleDao.modelId = trainingModel.getId();
         battleDao.scene.setBattleId(trainingModel.getMonsterGroupId());
         battleDao.scene.setSetId(trainingModel.getId());
         battleDao.scene.setMaxRound(trainingModel.getBoutCount());
         battleDao.scene.addPKTeam((byte)1, new BattlePKTeam(trainingModel.getMonsterGroupId()));
         this.player.triggerTask(109, 0, 1L, 1);
         this.player.getOperationMgr().addCopyLog(this.player, trainingModel.getId(), "血战长坂");
         myTrainingDao.randomBuffTime = 0;
         myTrainingDao.updateOp();
         GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
         guanJiaPart.checkState(1250, (List)null);
         return 1;
      }
   }

   @TaskMethod
   public void addHeroTrailBeSupport() {
      BattleHeroTrainingDao myTrainingDao = this.getBattleHeroTrainingDao();
      ++myTrainingDao.supportCount;
      myTrainingDao.updateOp();
   }

   public void trainingFight(BattleDao battleDao) {
      BattleHeroTrainingDao myTrainingDao = this.getBattleHeroTrainingDao();
      battleDao.scene.getBattleMsg().clearExParams();
      battleDao.scene.getBattleMsg().addExParams(battleDao.buffId).addExParams(myTrainingDao.historyMaxTier).addExParams(myTrainingDao.tierReward).addExParams(myTrainingDao.todayReward ? 1 : 0);
      BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().build().getResult().toBuilder();
      result.clearAwardItems();

      for(ResourceModel rewardItem : myTrainingDao.rewards) {
         result.addAwardItems(CommonMsg.ItemInfo.newBuilder().setId(rewardItem.getId()).setType(rewardItem.getType()).setNum(rewardItem.getValue()));
      }

      battleDao.scene.getBattleMsg().setResult(result);
      battleDao.scene.getBattleMsg().setIsNextWave(myTrainingDao.battleRound != 0);
      if (battleDao.scene.getWinForce() == 0) {
         this.passTraining(battleDao);
      }

      if (myTrainingDao.battleRound == 0) {
         this.player.getOperationMgr().addExtraLog(this.player, 207, this.player.getPublicDao().vip_lv + "", "血战长坂", "1");
      }

   }

   public void passTraining(BattleDao battleDao) {
      BattleHeroTrainingDao myTrainingDao = this.getBattleHeroTrainingDao();
      ++myTrainingDao.battleRound;
      if (battleDao.scene.getWave() == 5) {
         myTrainingDao.randomBuffTime = DateUtil.getIntTime(System.currentTimeMillis() + 300000L + (long)battleDao.scene.getCostTime());
         battleDao.buffId = 0;
      }

      if (!myTrainingDao.todayReward) {
         if (myTrainingDao.battleRound > myTrainingDao.todayMaxTier) {
            myTrainingDao.todayMaxTier = myTrainingDao.battleRound;
         }

         this.rewardAccumulation(myTrainingDao, myTrainingDao.battleRound);
      }

      if (myTrainingDao.startTier > myTrainingDao.historyMaxTier) {
         myTrainingDao.historyMaxTier = myTrainingDao.startTier;
         RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
         rankPart.updateRank(RankDefine.RankModule.HERO_TRAINING, (long)myTrainingDao.startTier, true);
         this.player.triggerTask(314, 0, (long)myTrainingDao.startTier, 0);
      }

      this.player.triggerTask(530, 0, 1L, 1);
      ++myTrainingDao.startTier;
      myTrainingDao.updateOp();
      this.sendEnterHeroTrainingMsg();
      Map<Integer, BattleHeroTrainingModel> allModel = ApplicationContextProvider.<Integer, BattleHeroTrainingModel>getModelPoolMap("battleHeroTraining");
      if (myTrainingDao.startTier > allModel.size()) {
         battleDao.status = 2;
      }

      this.player.getOperationMgr().addExtraLog(this.player, 186, String.valueOf(myTrainingDao.startTier), String.valueOf(myTrainingDao.startTier - 1));
   }

   public void endTraining(BattleDao battleDao) {
      this.settle(battleDao);
      BattleDailyMsg.S2C_EndHeroTraining_6616.Builder resp = BattleDailyMsg.S2C_EndHeroTraining_6616.newBuilder();
      resp.setInfo(this.buildTrainingInfo());
      this.player.sendMsg(resp.build());
   }

   private void settle(BattleDao battleDao) {
      BattleHeroTrainingDao myTrainingDao = this.getBattleHeroTrainingDao();
      if (battleDao != null && battleDao.scene != null) {
         this.reward(myTrainingDao, battleDao.autoSettle);
         myTrainingDao.todayReward = true;
         boolean isChangeDayBattle = !DateUtil.isSameDay(battleDao.battleTime.getTime()) && DateUtil.isSameDay(battleDao.battleTime.getTime() + battleDao.totalTime);
         if (isChangeDayBattle) {
            myTrainingDao.todayMaxTier = 0;
            myTrainingDao.todayReward = false;
            this.logger.info("BattleHeroTrainingPart.settle 玩家:{}血战长坂战斗跨天", this.player.getPlayerId());
         }
      } else if (this.reward(myTrainingDao, true)) {
         myTrainingDao.todayReward = true;
      }

      myTrainingDao.battleRound = 0;
      myTrainingDao.rewards.clear();
      myTrainingDao.friendPos = -1;
      myTrainingDao.friendCode = 0;
      myTrainingDao.resetStartTier();
      myTrainingDao.randomBuffTime = 0;
      myTrainingDao.updateOp();
   }

   public void gmSetStartTier(int tier) {
      BattleHeroTrainingDao myTrainingDao = this.getBattleHeroTrainingDao();
      myTrainingDao.startTier = tier;
      myTrainingDao.historyMaxTier = tier + 10;
      myTrainingDao.battleRound = 0;
      myTrainingDao.updateOp();
      this.player.sendMsg(this.buildTrainingInfo());
   }

   public void gmBattleTime(String timeStr) {
      BattlePart battlePart = (BattlePart)this.player.getMgrPart(BattlePart.class);
      BattleDao battleDao = (BattleDao)battlePart.getBattleDaoMap().get(1250);
      if (battleDao != null) {
         battleDao.battleTime = new Timestamp(DateUtil.getDateTimestamp(timeStr, "yyyy-MM-dd|HH:mm:ss").getTime());
         battleDao.updateOp();
      }
   }

   public void gmJoinRandomRank() {
      RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
      rankPart.updateRank(RankDefine.RankModule.HERO_TRAINING, (long)RandomUtil.randInt(1, 1001), false);
   }

   private boolean reward(BattleHeroTrainingDao myTrainingDao, boolean hideReward) {
      if (myTrainingDao.battleRound > 0 && !myTrainingDao.todayReward && !myTrainingDao.rewards.isEmpty()) {
         if (hideReward) {
            this.player.addResource(myTrainingDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 5, 505, 0, 0, "");
         } else {
            this.player.addResource(myTrainingDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_BATTLE, 5, 505, 0, 0, "", 1250);
         }

         this.logger.info("BattleHeroTrainingPart.reward 血战长坂发每日奖励 玩家id {}", this.player.getPlayerId());
         return true;
      } else {
         return false;
      }
   }

   public BattleHeroTrainingDao getBattleHeroTrainingDao() {
      BattleHeroTrainingDao myTrainingDao = (BattleHeroTrainingDao)this.player.getData("tb_battle_hero_training", this.player.getPlayerId());
      if (myTrainingDao.startTier == 0) {
         myTrainingDao.resetStartTier();
         myTrainingDao.updateOp();
      }

      return myTrainingDao;
   }

   public int getHistoryMaxTier() {
      return this.getBattleHeroTrainingDao().historyMaxTier;
   }

   private BattleDailyMsg.S2C_GetTrainingConfig_6609 buildTrainingInfo() {
      BattleHeroTrainingDao myTrainingDao = this.getBattleHeroTrainingDao();
      BattlePart battlePart = (BattlePart)this.player.getMgrPart(BattlePart.class);
      BattleDao battleDao = (BattleDao)battlePart.getBattleDaoMap().get(1250);
      if (myTrainingDao.battleRound > 0 && (battleDao == null || battleDao.scene == null)) {
         this.settle(battleDao);
      }

      HeroMirror friendMirror = null;
      BattleDailyMsg.S2C_GetTrainingConfig_6609.Builder down = BattleDailyMsg.S2C_GetTrainingConfig_6609.newBuilder();
      FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
      WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
      if (friendDao != null) {
         for(int friendCode : friendDao.friends) {
            GamePlayer friendPlayer = this.worldMgr.getPlayerById(friendCode);
            if (friendPlayer != null) {
               HeroSupportDao friendSupportDao = worldMgrPushTaskPart.getHeroSupportDao(HeroSupportDao.SupportModule.HERO_TRAIL, friendPlayer.getPlayerId());
               if (friendSupportDao != null) {
                  if (myTrainingDao.friendCode == friendCode) {
                     friendMirror = friendSupportDao.heroSupport;
                  }

                  BattleDailyMsg.FriendSupportHero.Builder friendHero = BattleDailyMsg.FriendSupportHero.newBuilder();
                  friendHero.setFriendCode(friendCode);
                  friendHero.setHero(friendSupportDao.heroSupport.toBuilder());
                  down.addHeroes(friendHero);
               }
            }
         }
      }

      down.setFriendCode(myTrainingDao.friendCode);
      down.setFriendPos(myTrainingDao.friendPos);
      HeroSupportDao heroSupportDao = worldMgrPushTaskPart.getHeroSupportDao(HeroSupportDao.SupportModule.HERO_TRAIL, this.player.getPlayerId());
      if (heroSupportDao != null) {
         down.setMySupportHero(heroSupportDao.heroSupport.toBuilder());
      }

      down.setTodayPass(myTrainingDao.todayMaxTier);
      down.setGetDailyReward(myTrainingDao.todayReward);
      down.setRewardTier(myTrainingDao.tierReward);
      down.setMaxPass(myTrainingDao.historyMaxTier);
      down.setStartTier(myTrainingDao.startTier);
      RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
      down.setMyRank(rankPart.getRank(RankDefine.RankModule.HERO_TRAINING));
      down.addAllRanks(rankPart.buildRankListDataMsg(RankDefine.RankModule.HERO_TRAINING, 3));
      if (battleDao != null && battleDao.scene != null && battleDao.scene.getBattleMsg() != null) {
         BattlePKTeam leftTeam = battleDao.scene.getPKTeam((byte)0);

         for(Entity entity : leftTeam.getEntityMap().values()) {
            down.addHeroHps(this.buildHeroHp(entity, myTrainingDao.friendPos));
         }

         Entity friendEntity = leftTeam.getFriendEntity();
         if (friendEntity != null) {
            down.addHeroHps(this.buildHeroHp(friendEntity, myTrainingDao.friendPos));
         }
      } else {
         ArrayingMirror arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_BATTLE_HERO_TRAINING);

         for(ArrayingEntity entity : arrayingMirror.arrayingElementsMap.values()) {
            if (entity.heroAndFriend()) {
               int id;
               int lv;
               int star;
               int dressId;
               int inheritNation;
               if (entity.entityType() != CommonMsg.CodeType.CODE_FRIEND) {
                  HeroArrayingEntity heroArrayingEntity = (HeroArrayingEntity)entity;
                  id = heroArrayingEntity.mirror.id;
                  lv = heroArrayingEntity.mirror.lv;
                  star = heroArrayingEntity.mirror.star;
                  dressId = heroArrayingEntity.mirror.dressId;
                  inheritNation = heroArrayingEntity.mirror.inheritNation;
               } else {
                  FriendArrayingEntity heroArrayingEntity = (FriendArrayingEntity)entity;
                  id = heroArrayingEntity.mirror.id;
                  lv = heroArrayingEntity.mirror.lv;
                  star = heroArrayingEntity.mirror.star;
                  dressId = heroArrayingEntity.mirror.dressId;
                  inheritNation = heroArrayingEntity.mirror.inheritNation;
               }

               BattleDailyMsg.TrainingHeroHp.Builder heroHp = BattleDailyMsg.TrainingHeroHp.newBuilder();
               heroHp.setHp(100);
               heroHp.setId(id);
               heroHp.setLv(lv);
               heroHp.setStar(star);
               heroHp.setIsFriend(false);
               heroHp.setPos(entity.positon);
               heroHp.setDressId(dressId);
               heroHp.setInheritNation(inheritNation);
               down.addHeroHps(heroHp);
            }
         }

         if (friendMirror != null && myTrainingDao.friendPos > -1) {
            BattleDailyMsg.TrainingHeroHp.Builder heroHp = BattleDailyMsg.TrainingHeroHp.newBuilder();
            heroHp.setHp(100);
            heroHp.setId(friendMirror.id);
            heroHp.setLv(friendMirror.lv);
            heroHp.setStar(friendMirror.star);
            heroHp.setIsFriend(true);
            heroHp.setPos(myTrainingDao.friendPos);
            heroHp.setDressId(friendMirror.dressId);
            heroHp.setInheritNation(friendMirror.inheritNation);
            down.addHeroHps(heroHp);
         }
      }

      down.setCurrentPass(myTrainingDao.battleRound);
      down.setBuffRandomTime(myTrainingDao.randomBuffTime);
      return down.build();
   }

   private BattleDailyMsg.TrainingHeroHp.Builder buildHeroHp(Entity entity, byte friendPos) {
      BattleDailyMsg.TrainingHeroHp.Builder heroHp = BattleDailyMsg.TrainingHeroHp.newBuilder();
      heroHp.setHp(CalculateUtil.calPercent(entity.getBaseProperty(99), entity.getBaseProperty(1)));
      heroHp.setId(entity.getId());
      heroHp.setLv(entity.getLevel());
      heroHp.setStar(entity.getStar());
      heroHp.setDressId(entity.getHeroMirror().dressId);
      byte pos = entity.getOriginalPos() == BattleMisc.FRIEND_POS[0] ? 5 : entity.getTeamPos();
      heroHp.setPos(pos);
      heroHp.setIsFriend(pos == friendPos);
      heroHp.setInheritNation(entity.inheritNation);
      return heroHp;
   }

   private void handleFriendSupport(BattleHeroTrainingDao myTrainingDao, GamePlayer friendPlayer, BattleScene scene) {
      WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
      HeroSupportDao heroSupportDao = worldMgrPushTaskPart.getHeroSupportDao(HeroSupportDao.SupportModule.HERO_TRAIL, friendPlayer.getPlayerId());
      if (myTrainingDao.friendCode > 0 && heroSupportDao != null && myTrainingDao.friendPos > -1) {
         BattlePKTeam myTeam = scene.getPKTeam((byte)0);
         if (myTeam == null) {
            return;
         }

         if (myTrainingDao.friendPos == 5 && myTeam.getFriendEntity() != null) {
            return;
         }

         if (myTrainingDao.friendPos < 5 && myTeam.getEntity(myTrainingDao.friendPos) != null) {
            return;
         }

         HeroRankMgr heroRankMgr = (HeroRankMgr)ApplicationContextProvider.getContext().getBean(HeroRankMgr.class);
         scene.addHero((byte)0, myTrainingDao.friendPos, heroSupportDao.heroSupport, heroRankMgr.getHeroCompensate(heroSupportDao.heroSupport.id));
      }

   }

   private HeroDao getHeroDao(GamePlayer player, int heroCode) {
      HeroBagPart heroBagPart = (HeroBagPart)player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      if (heroDao != null) {
         heroBagPart.heroBagFlushProperties(heroDao);
      }

      return heroDao;
   }

   private void rewardAccumulation(BattleHeroTrainingDao myTrainingDao, int battleRound) {
      GameModelPool modelPool = ApplicationContextProvider.getModelPool();
      if (!myTrainingDao.todayReward) {
         BattleHeroTrainingRewardModel lastRewardModel = this.getLastRewardModel();
         BattleHeroTrainingRewardModel rewardModel;
         if (lastRewardModel.getId() < battleRound) {
            rewardModel = lastRewardModel;
         } else {
            rewardModel = (BattleHeroTrainingRewardModel)modelPool.getEntity("battleHeroTrainingReward", battleRound);
         }

         if (battleRound == 1) {
            for(ResourceModel resourceModel : rewardModel.getRewards()) {
               resourceModel.addResourceToList(myTrainingDao.rewards);
            }
         } else {
            for(ResourceModel rewardItem : myTrainingDao.rewards) {
               rewardItem.setValue((int)((float)rewardItem.getValue() + (float)rewardItem.getValue() / 10000.0F * (float)rewardModel.getPer()));
            }
         }
      }

   }

   private BattleHeroTrainingRewardModel getLastRewardModel() {
      Map<Integer, BattleHeroTrainingRewardModel> battleHeroTrainingRewardModelMap = ApplicationContextProvider.<Integer, BattleHeroTrainingRewardModel>getModelPoolMap("battleHeroTrainingReward");
      TreeMap<Integer, BattleHeroTrainingRewardModel> battleHeroTrainingRewardModelTreeMap = new TreeMap(battleHeroTrainingRewardModelMap);
      return (BattleHeroTrainingRewardModel)battleHeroTrainingRewardModelTreeMap.lastEntry().getValue();
   }

   public void resetDaily() {
      BattleHeroTrainingDao myTrainingDao = this.getBattleHeroTrainingDao();
      if (myTrainingDao.battleRound == 0) {
         this.reward(myTrainingDao, true);
      }

      if (myTrainingDao.supportCount > 0) {
         String BATTLE_HERO_TRAINING_SUPPORT_REWARD = "battleHeroTrainingSupportReward";
         String[] split = this.configManager.getStr(BATTLE_HERO_TRAINING_SUPPORT_REWARD).split("\\|");
         List<ResourceModel> items = new ArrayList();

         for(String str : split) {
            String[] temp = str.split(",");
            ResourceModel itemData = new ResourceModel(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]) * myTrainingDao.supportCount);
            items.add(itemData);
         }

         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         CentreAwardModel centreAwardModel = CentreAwardModel.getByType(CentreAwardModel.TYPE_TRAINING_SUPPORT);
         if (centreAwardModel != null) {
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), MessageFormat.format(centreAwardModel.getDesc(), myTrainingDao.supportCount), items, 604800000L, 5, 504);
         }
      }

      myTrainingDao.reset();
   }

   private void sendEnterHeroTrainingMsg() {
      BattleDailyMsg.S2C_EnterHeroTraining_6614.Builder resp = BattleDailyMsg.S2C_EnterHeroTraining_6614.newBuilder();
      resp.setInfo(this.buildTrainingInfo());
      this.player.sendMsg(resp.build());
   }

   public void reloadRank() {
      BattleHeroTrainingDao battleHeroTrainingDao = this.getBattleHeroTrainingDao();
      RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
      rankPart.updateRank(RankDefine.RankModule.HERO_TRAINING, (long)battleHeroTrainingDao.historyMaxTier, false);
   }

   public void guanJiaOperate(int systemid) {
      GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
      List<ResourceModel> rewards = new ArrayList();
      BattleHeroTrainingDao trainingDao = this.getBattleHeroTrainingDao();
      if (trainingDao.historyMaxTier <= 0) {
         guanJiaPart.checkState(systemid, rewards);
      } else {
         Map<Integer, BattleHeroTrainingModel> battleHeroTrainingModelMap = ApplicationContextProvider.<Integer, BattleHeroTrainingModel>getModelPoolMap("battleHeroTraining");
         int tierReward = trainingDao.tierReward;

         for(int tier = tierReward + 1; tier <= trainingDao.historyMaxTier; ++tier) {
            BattleHeroTrainingModel battleHeroTrainingModel = (BattleHeroTrainingModel)battleHeroTrainingModelMap.get(tier);
            if (battleHeroTrainingModel != null && battleHeroTrainingModel.getRewards() != null && !battleHeroTrainingModel.getRewards().isEmpty()) {
               for(ResourceModel reward : battleHeroTrainingModel.getRewards()) {
                  reward.addResourceToList(rewards);
               }

               trainingDao.tierReward = tier;
               trainingDao.updateOp();
            }
         }

         if (!rewards.isEmpty()) {
            this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 5, 506, trainingDao.historyMaxTier, trainingDao.tierReward, "");
         }

         BattlePart battlePart = (BattlePart)this.player.getMgrPart(BattlePart.class);
         BattleDao battleDao = battlePart.getBattleDao(1250);
         if (battleDao == null && !trainingDao.todayReward) {
            if (trainingDao.rewards.isEmpty()) {
               int swapRound = Math.min(10, trainingDao.historyMaxTier);

               for(int i = 1; i <= swapRound; ++i) {
                  this.rewardAccumulation(trainingDao, i);
               }

               rewards.addAll(trainingDao.rewards);
               trainingDao.todayMaxTier = swapRound;
            }

            this.player.addResource(trainingDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 5, 505, 0, 0, "guanJia");
            trainingDao.todayReward = true;
            trainingDao.rewards.clear();
            trainingDao.updateOp();
            BattleDailyMsg.S2C_EndHeroTraining_6616.Builder resp = BattleDailyMsg.S2C_EndHeroTraining_6616.newBuilder();
            resp.setInfo(this.buildTrainingInfo());
            this.player.sendMsg(resp.build());
            this.player.triggerTask(109, 0, 1L, 1);
         }

         guanJiaPart.checkState(systemid, rewards);
      }
   }
}
