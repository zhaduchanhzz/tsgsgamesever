package com.gzbz.war.barbarian;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.db.BattleDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.WarBarbarianDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.guanjia.GuanJiaPart;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroRankMgr;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.BattleModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.NormalBossModel;
import com.gzbz.model.SavageInvadeModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.BarbarianMsg;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldBossMgr;
import java.util.ArrayList;
import java.util.List;
import misc.DateUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class BarbarianPart extends PlayerPart {
   private final WorldBossMgr worldBossMgr;
   private final ConfigManager configManager;
   private final HeroRankMgr heroRankMgr;
   public static final String CONFIG_NUM_KEY = "savageInvadeFightNum";
   public static final String CONFIG_BUY_KEY = "savageInvadeBuyConsume";

   public BarbarianPart(WorldBossMgr worldBossMgr, ConfigManager configManager, HeroRankMgr heroRankMgr) {
      this.worldBossMgr = worldBossMgr;
      this.configManager = configManager;
      this.heroRankMgr = heroRankMgr;
   }

   @MsgHandlerAnno
   public void C2S_BarbarianInfo_9301(BarbarianMsg.C2S_BarbarianInfo_9301 msg, String source) {
      if (this.player.isSystemOpen(1980) && this.isNeedSysOpen()) {
         WarBarbarianDao warBarbarianDao = (WarBarbarianDao)this.player.getData("tb_war_barbarian", this.player.getPlayerId());
         this.worldBossMgr.pushTaskEx("sendMainInfo", new Object[]{warBarbarianDao, this.player});
      }
   }

   @MsgHandlerAnno
   public void C2S_BarbarianCrusade_9303(BarbarianMsg.C2S_BarbarianCrusade_9303 msg, String source) {
   }

   @MsgHandlerAnno
   public void C2S_BarbarianSwapOneKey_9307(BarbarianMsg.C2S_BarbarianSwapOneKey_9307 msg, String source) {
      if (!this.player.isSystemOpen(1980)) {
         this.player.failure(21);
      } else {
         int openBoss = this.worldBossMgr.getOpenBoss();
         if (openBoss <= 0) {
            this.player.failure(32000);
         } else if (!this.isNeedSysOpen()) {
            this.player.failure(21);
         } else {
            WarBarbarianDao warBarbarianDao = (WarBarbarianDao)this.player.getData("tb_war_barbarian", this.player.getPlayerId());
            if (warBarbarianDao.challengeCount >= warBarbarianDao.buyCount + this.configChallengeCount()) {
               this.player.failure(41);
            } else if (warBarbarianDao.todayDamage <= 0L) {
               this.player.failure(32001);
            } else {
               NormalBossModel normalBossModel = (NormalBossModel)ApplicationContextProvider.getModelPoolEntity("normalBoss", openBoss);
               if (null == normalBossModel) {
                  this.player.failure(37);
               } else {
                  List<ResourceModel> rewards = new ArrayList();
                  SavageInvadeModel savageInvadeModel = this.worldBossMgr.barbarianPersonReward(warBarbarianDao.todayDamage);
                  int challengeCount = warBarbarianDao.buyCount + this.configChallengeCount() - warBarbarianDao.challengeCount;

                  for(int count = 0; count < challengeCount; ++count) {
                     ++warBarbarianDao.challengeCount;

                     for(ResourceModel resourceModel : savageInvadeModel.getRewards()) {
                        resourceModel.addResourceToList(rewards);
                     }

                     this.player.triggerTask(356, 0, 1L, 1);
                     int var10000 = normalBossModel.getBossType();
                     this.worldBossMgr.getClass();
                     if (var10000 != 11) {
                        var10000 = normalBossModel.getBossType();
                        this.worldBossMgr.getClass();
                        if (var10000 != 12) {
                           continue;
                        }
                     }

                     this.player.triggerTask(766, 0, 1L, 1);
                  }

                  long curDamage = warBarbarianDao.todayDamage * (long)challengeCount;
                  warBarbarianDao.totalDamage += curDamage;
                  warBarbarianDao.updateOp();
                  this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 32, 3205, challengeCount, normalBossModel.getBossType(), "");
                  this.worldBossMgr.pushTaskEx("worldBossSwapOneKey", new Object[]{normalBossModel.getBossType(), curDamage, warBarbarianDao, this.player});
                  GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
                  guanJiaPart.checkState(1980, (List)null);
               }
            }
         }
      }
   }

   public int enterBattle(BattleDao battleDao) {
      if (!this.player.isSystemOpen(1980)) {
         return 21;
      } else {
         int bossId = this.worldBossMgr.getOpenBoss();
         if (bossId <= 0) {
            return 32000;
         } else {
            WarBarbarianDao warBarbarianDao = (WarBarbarianDao)this.player.getData("tb_war_barbarian", this.player.getPlayerId());
            if (warBarbarianDao.challengeCount >= warBarbarianDao.buyCount + this.configChallengeCount()) {
               return 41;
            } else {
               NormalBossModel normalBossModel = (NormalBossModel)ApplicationContextProvider.getModelPoolEntity("normalBoss", bossId);
               if (normalBossModel == null) {
                  return 0;
               } else {
                  BattleModel battleModel = (BattleModel)ApplicationContextProvider.getModelPoolEntity("battle", normalBossModel.getBattleId());
                  if (battleModel == null) {
                     return 0;
                  } else if (!this.isNeedSysOpen()) {
                     return 21;
                  } else {
                     PlayerDao playerDao = this.player.getPlayerDao();
                     ArrayingMirror arrayingMirror;
                     if (normalBossModel.getIsMoreTeamFight() > 0) {
                        arrayingMirror = this.player.getPlayerArraying((CommonMsg.HeroState)((List)HeroArrayingPart.MULTIPLE_ARRAYING.get(1980)).get(0));
                        if (arrayingMirror == null) {
                           return 4125;
                        }

                        ArrayingMirror arrayingMirror2 = this.player.getPlayerArraying((CommonMsg.HeroState)((List)HeroArrayingPart.MULTIPLE_ARRAYING.get(1980)).get(1));
                        if (arrayingMirror2 == null) {
                           return 4125;
                        }

                        HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
                        if (heroArrayingPart.multipleArrayingHadSameHero(1980)) {
                           return 58109;
                        }

                        battleDao.scene.setWave((short)1, (short)2);
                     } else {
                        arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_WAR_BARBARIAN);
                        if (arrayingMirror == null) {
                           return 4125;
                        }
                     }

                     BattlePKTeam leftTeam = new BattlePKTeam(this.player.getPlayerId(), playerDao.playerName, arrayingMirror, playerDao.lv, playerDao.head, playerDao.headFrame, this.heroRankMgr.getHeroRankCompensate(arrayingMirror, this.player.isRobot()));
                     BattlePKTeam rightTeam = new BattlePKTeam(normalBossModel.getBattleId());
                     battleDao.scene.addPKTeam(leftTeam, rightTeam);
                     battleDao.scene.setMaxRound((byte)normalBossModel.getMaxRound());
                     GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
                     guanJiaPart.checkState(1980, (List)null);
                     this.player.triggerTask(356, 0, 1L, 1);
                     int var10000 = normalBossModel.getBossType();
                     this.worldBossMgr.getClass();
                     if (var10000 != 11) {
                        var10000 = normalBossModel.getBossType();
                        this.worldBossMgr.getClass();
                        if (var10000 != 12) {
                           return 1;
                        }
                     }

                     this.player.triggerTask(766, 0, 1L, 1);
                     return 1;
                  }
               }
            }
         }
      }
   }

   public int nextBattle(BattleDao battleDao) {
      if (!DateUtil.isSameDay(battleDao.battleTime.getTime(), System.currentTimeMillis())) {
         return 0;
      } else {
         int bossId = this.worldBossMgr.getOpenBoss();
         if (bossId <= 0) {
            return 32000;
         } else {
            ArrayingMirror arrayingMirror = this.player.getPlayerArraying((CommonMsg.HeroState)((List)HeroArrayingPart.MULTIPLE_ARRAYING.get(1980)).get(1));
            if (arrayingMirror == null) {
               return 4125;
            } else {
               PlayerDao playerDao = this.player.getPlayerDao();
               BattlePKTeam leftTeam = new BattlePKTeam(this.player.getPlayerId(), playerDao.playerName, arrayingMirror, playerDao.lv, playerDao.head, playerDao.headFrame, this.heroRankMgr.getHeroRankCompensate(arrayingMirror, this.player.isRobot()));
               battleDao.scene.addPKTeam((byte)0, leftTeam);
               battleDao.scene.setWave((short)2, (short)2);
               return 1;
            }
         }
      }
   }

   public void afterFight(BattleDao battleDao) {
      battleDao.scene.getBattleMsg().setIsNextWave(battleDao.scene.getWave() > 1);
      WarBarbarianDao warBarbarianDao = (WarBarbarianDao)this.player.getData("tb_war_barbarian", this.player.getPlayerId());
      long damage = Math.max(1L, battleDao.scene.getPKTeam((byte)1).getDamageValue());
      if (warBarbarianDao.todayDamage < damage) {
         warBarbarianDao.todayDamage = damage;
      }

      BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().build().getResult().toBuilder();
      SavageInvadeModel savageInvadeModel = null;
      if (battleDao.scene.getWave() > 0) {
         if (battleDao.scene.getWave() == battleDao.scene.getTotalWave()) {
            warBarbarianDao.totalDamage += damage;
            savageInvadeModel = this.worldBossMgr.barbarianPersonReward(damage);
            battleDao.status = 0;
            battleDao.updateOp();
            this.worldBossMgr.pushTaskEx("worldBossChallenge", new Object[]{damage, warBarbarianDao, this.player});
         } else {
            ++warBarbarianDao.challengeCount;
         }
      } else {
         warBarbarianDao.totalDamage += damage;
         ++warBarbarianDao.challengeCount;
         savageInvadeModel = this.worldBossMgr.barbarianPersonReward(damage);
         battleDao.status = 0;
         battleDao.updateOp();
         this.worldBossMgr.pushTaskEx("worldBossChallenge", new Object[]{damage, warBarbarianDao, this.player});
      }

      warBarbarianDao.updateOp();
      if (savageInvadeModel != null) {
         for(ResourceModel resourceModel : savageInvadeModel.getRewards()) {
            result.addAwardItems(CommonMsg.ItemInfo.newBuilder().setType(resourceModel.getType()).setId(resourceModel.getId()).setNum(resourceModel.getValue()));
         }

         battleDao.rewards.addAll(savageInvadeModel.getRewards());
      }

      result.setResult(0);
      battleDao.scene.getBattleMsg().setResult(result);
   }

   public void endBattle(BattleDao battleDao) {
      this.player.addResource(battleDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 32, 3201, this.worldBossMgr.getOpenBoss(), 0, "");
   }

   @MsgHandlerAnno
   public void C2S_BarbarianBuy_9305(BarbarianMsg.C2S_BarbarianBuy_9305 msg, String source) {
      if (!this.player.isSystemOpen(1980)) {
         this.player.failure(32000);
      } else {
         int openBoss = this.worldBossMgr.getOpenBoss();
         if (openBoss <= 0) {
            this.player.failure(32000);
         } else {
            NormalBossModel normalBossModel = (NormalBossModel)ApplicationContextProvider.getModelPoolEntity("normalBoss", openBoss);
            if (null == normalBossModel) {
               this.player.failure(37);
            } else if (!this.isNeedSysOpen()) {
               this.player.failure(21);
            } else {
               WarBarbarianDao warBarbarianDao = (WarBarbarianDao)this.player.getData("tb_war_barbarian", this.player.getPlayerId());
               ResourceModel resourceModel = this.getBuyFee(warBarbarianDao.buyCount);
               if (warBarbarianDao.buyCount < this.configBuyCount() && resourceModel != null) {
                  if (!this.player.checkResourceNum(resourceModel)) {
                     this.player.failure(31);
                  } else {
                     ++warBarbarianDao.buyCount;
                     warBarbarianDao.updateOp();
                     this.player.delResource(resourceModel, 21, 2110, openBoss, 0, "");
                     this.sendBuyResult();
                     GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
                     guanJiaPart.checkState(1980, (List)null);
                  }
               } else {
                  this.player.failure(25);
               }
            }
         }
      }
   }

   @TaskMethod
   public void barbarianPlayerOpen(long lastOpenTime) {
      if (this.player.isSystemOpen(1980) && this.isNeedSysOpen()) {
         WarBarbarianDao warBarbarianDao = (WarBarbarianDao)this.player.getData("tb_war_barbarian", this.player.getPlayerId());
         if (warBarbarianDao.lastJoin < lastOpenTime) {
            warBarbarianDao.reset();
         }

         if (warBarbarianDao.lastJoin <= 0L) {
            warBarbarianDao.lastJoin = lastOpenTime;
            warBarbarianDao.updateOp();
            this.player.sendMsg(this.worldBossMgr.buildInfo(warBarbarianDao));
         }

      }
   }

   @TaskMethod
   public void barbarianPlayerClose() {
      if (this.player.isSystemOpen(1980)) {
         WarBarbarianDao warBarbarianDao = (WarBarbarianDao)this.player.getData("tb_war_barbarian", this.player.getPlayerId());
         if (warBarbarianDao.lastJoin > 0L) {
            warBarbarianDao.reset();
            this.player.sendMsg(this.worldBossMgr.buildInfo(warBarbarianDao));
         }

      }
   }

   @TaskMethod
   public void barbarianLuckyReward(NormalBossModel normalBossModel, CentreAwardModel luckReward) {
      MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
      mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, luckReward.getTitle(), luckReward.getDesc(), luckReward.getItems(), 604800000L, 32, 3204);
      LogOperationMgr logOperationMgr = (LogOperationMgr)ApplicationContextProvider.getContext().getBean(LogOperationMgr.class);
      logOperationMgr.addReceiveAwardNewLog(this.player, 17, 0, normalBossModel.getName(), String.valueOf(0), "-", 0, 0, 0);
   }

   public void loginHandle() {
      this.checkStatus();
   }

   public boolean loginHandleAsync() {
      return true;
   }

   public void checkStatus() {
      if (this.player.isSystemOpen(1980)) {
         this.worldBossMgr.pushTaskEx("checkWorldBossStatus", new Object[]{this.player});
      }
   }

   private void sendBuyResult() {
      WarBarbarianDao warBarbarianDao = (WarBarbarianDao)this.player.getData("tb_war_barbarian", this.player.getPlayerId());
      BarbarianMsg.S2C_BarbarianBuy_9306.Builder msg = BarbarianMsg.S2C_BarbarianBuy_9306.newBuilder();
      msg.setBuyCount(warBarbarianDao.buyCount);
      msg.setCount(warBarbarianDao.challengeCount);
      this.player.sendMsg(msg.build());
   }

   private int configChallengeCount() {
      return Integer.parseInt(this.configManager.getStr("savageInvadeFightNum").split("\\|")[0]);
   }

   private int configBuyCount() {
      return Integer.parseInt(this.configManager.getStr("savageInvadeFightNum").split("\\|")[1]);
   }

   private ResourceModel getBuyFee(int currentBuyCount) {
      String[] buyConfigArr = this.configManager.getStr("savageInvadeBuyConsume").split("\\|");
      if (currentBuyCount >= buyConfigArr.length) {
         return null;
      } else {
         String[] buyFee = buyConfigArr[currentBuyCount].split(",");
         return new ResourceModel(Integer.parseInt(buyFee[0]), Integer.parseInt(buyFee[1]), Integer.parseInt(buyFee[2]));
      }
   }

   public void levelUp(int preLv, int newLv) {
      this.checkStatus();
   }

   public boolean isNeedSysOpen() {
      int bossId = this.worldBossMgr.getOpenBoss();
      NormalBossModel normalBossModel = (NormalBossModel)ApplicationContextProvider.getModelPoolEntity("normalBoss", bossId);
      return null != normalBossModel && (normalBossModel.getNeedSysId() <= 0 || this.player.isSystemOpen(normalBossModel.getNeedSysId()));
   }

   public void guanJiaOperate(int systemId, int challengeCount) {
      GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
      int bossId = this.worldBossMgr.getOpenBoss();
      if (bossId <= 0) {
         guanJiaPart.checkState(systemId, (List)null);
      } else {
         NormalBossModel normalBossModel = (NormalBossModel)ApplicationContextProvider.getModelPoolEntity("normalBoss", bossId);
         if (normalBossModel == null) {
            guanJiaPart.checkState(systemId, (List)null);
         } else if (!this.isNeedSysOpen()) {
            guanJiaPart.checkState(systemId, (List)null);
         } else {
            List<ArrayingMirror> arrayingMirrorList = new ArrayList();
            if (normalBossModel.getIsMoreTeamFight() > 0) {
               ArrayingMirror arrayingMirror1 = this.player.getPlayerArraying((CommonMsg.HeroState)((List)HeroArrayingPart.MULTIPLE_ARRAYING.get(1980)).get(0));
               ArrayingMirror arrayingMirror2 = this.player.getPlayerArraying((CommonMsg.HeroState)((List)HeroArrayingPart.MULTIPLE_ARRAYING.get(1980)).get(1));
               if (null == arrayingMirror1 || null == arrayingMirror2) {
                  guanJiaPart.checkState(systemId, (List)null);
                  return;
               }

               arrayingMirrorList.add(arrayingMirror1);
               arrayingMirrorList.add(arrayingMirror2);
            } else {
               ArrayingMirror arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_WAR_BARBARIAN);
               if (arrayingMirror == null) {
                  guanJiaPart.checkState(systemId, (List)null);
                  return;
               }

               arrayingMirrorList.add(arrayingMirror);
            }

            WarBarbarianDao warBarbarianDao = (WarBarbarianDao)this.player.getData("tb_war_barbarian", this.player.getPlayerId());
            if (warBarbarianDao.challengeCount > 0) {
               guanJiaPart.checkState(systemId, (List)null);
            } else {
               int freeCount = this.configChallengeCount();
               int buyCount = this.configBuyCount();
               if (challengeCount >= 1 && challengeCount <= freeCount + buyCount) {
                  PlayerDao playerDao = this.player.getPlayerDao();
                  HeroRankMgr heroRankMgr = (HeroRankMgr)ApplicationContextProvider.getContext().getBean(HeroRankMgr.class);
                  List<ResourceModel> resourceModels = new ArrayList();

                  for(int i = 0; i < challengeCount; ++i) {
                     if (warBarbarianDao.challengeCount >= freeCount) {
                        ResourceModel buyFeeResModel = this.getBuyFee(warBarbarianDao.buyCount);
                        if (buyFeeResModel == null) {
                           guanJiaPart.checkState(systemId, resourceModels);
                           return;
                        }

                        if (!this.player.checkResourceNum(buyFeeResModel)) {
                           guanJiaPart.checkState(systemId, resourceModels);
                           return;
                        }

                        this.player.delResource(buyFeeResModel, 21, 2110, 0, 0, "guanJia");
                        ++warBarbarianDao.buyCount;
                        warBarbarianDao.updateOp();
                     }

                     long damage = 0L;
                     if (warBarbarianDao.todayDamage <= 0L) {
                        for(ArrayingMirror arrayingMirror : arrayingMirrorList) {
                           BattleScene battleScene = new BattleScene(1980, 0);
                           BattlePKTeam leftTeam = new BattlePKTeam(this.player.getPlayerId(), playerDao.playerName, arrayingMirror, playerDao.lv, playerDao.head, playerDao.headFrame, heroRankMgr.getHeroRankCompensate(arrayingMirror, this.player.isRobot()));
                           BattlePKTeam rightTeam = new BattlePKTeam(normalBossModel.getBattleId());
                           battleScene.addPKTeam(leftTeam, rightTeam);
                           battleScene.setMaxRound((byte)normalBossModel.getMaxRound());
                           battleScene.fight();
                           damage += battleScene.getPKTeam((byte)1).getDamageValue();
                        }

                        warBarbarianDao.todayDamage = damage;
                     } else {
                        damage = warBarbarianDao.todayDamage;
                     }

                     warBarbarianDao.totalDamage += damage;
                     ++warBarbarianDao.challengeCount;
                     warBarbarianDao.updateOp();
                     if (damage > 0L) {
                        this.worldBossMgr.pushTaskEx("worldBossChallenge", new Object[]{damage, warBarbarianDao, this.player});
                        SavageInvadeModel savageInvadeModel = this.worldBossMgr.barbarianPersonReward(damage);

                        for(ResourceModel resourceModel : savageInvadeModel.getRewards()) {
                           resourceModel.addResourceToList(resourceModels);
                        }
                     }
                  }

                  this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 32, 3201, normalBossModel.getBattleId(), challengeCount, "guanJia");

                  for(int i = 0; i < challengeCount; ++i) {
                     this.player.triggerTask(356, 0, 1L, 1);
                     int var10000 = normalBossModel.getBossType();
                     this.worldBossMgr.getClass();
                     if (var10000 != 11) {
                        var10000 = normalBossModel.getBossType();
                        this.worldBossMgr.getClass();
                        if (var10000 != 12) {
                           continue;
                        }
                     }

                     this.player.triggerTask(766, 0, 1L, 1);
                  }

                  guanJiaPart.checkState(1980, resourceModels);
               } else {
                  guanJiaPart.checkState(systemId, (List)null);
               }
            }
         }
      }
   }
}
