package com.gzbz.gamePlayer.battle;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import com.gzbz.activity.part.SpecialTaskActivityPart;
import com.gzbz.battle.BattleMisc;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.BattleCutHeroDao;
import com.gzbz.db.BattleDao;
import com.gzbz.db.FriendDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.HeroSupportDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.arraying.ArrayingEntity;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroRankMgr;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.model.BattleCutHeroModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.VipModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.BattleDailyMsg;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.RankData;
import com.gzbz.robot.RobotData;
import com.gzbz.robot.bean.MonsterMgr;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import com.gzbz.worldMgr.WorldMgrPushTaskPart;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import misc.CalculateUtil;
import misc.DateUtil;
import misc.MapUtil;
import misc.MiscUtil;
import misc.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class BattleCutPart extends PlayerPart {
   private final ConfigManager configManager;
   private final WorldMgr worldMgr;
   private final RankMgr rankMgr;
   public static final String CUT_DAILY_REVIVE_COUNT = "cutDailyReviveCount";
   public static final String CUT_COPY_HIRE_NUM_LIMIT = "cutCopyHireNumLimit";
   public static final String CUT_COPY_HIRE_POWER_LIMIT = "cutCopyHirePowerLimit";
   public static final String CUT_COPY_HERO_REVIVE_COST = "cutCopyHeroReviveCost";
   public static final String CUT_COPY_AUTO = "cutCopyAuto";
   public static final String CUT_SUPPORT_REWARD = "cutSupportReward";
   public static final String CUT_HARD_POWER_LIMIT = "cutCopyPowerLimit";
   @Autowired
   private HeroRankMgr heroRankMgr;

   public BattleCutPart(ConfigManager configManager, WorldMgr worldMgr, RankMgr rankMgr) {
      this.configManager = configManager;
      this.worldMgr = worldMgr;
      this.rankMgr = rankMgr;
   }

   @MsgHandlerAnno
   public void C2S_GetCutInfo_6619(BattleDailyMsg.C2S_GetCutInfo_6619 msg, String channelId) {
      this.player.sendMsg(this.cutInfoBuild());
   }

   @MsgHandlerAnno
   public void C2S_BattleInfo_6621(BattleDailyMsg.C2S_BattleInfo_6621 msg, String source) {
      int battleId = msg.getId();
      BattleCutHeroDao cutHeroDao = (BattleCutHeroDao)this.player.getData("tb_battle_cut_hero", this.player.getPlayerId());
      BattleCutHeroModel cutHeroModel = (BattleCutHeroModel)this.player.getGameModelPool().getEntity("battleCutHero", battleId);
      if (cutHeroModel == null) {
         this.player.failure(0);
      } else if (cutHeroModel.getHard() != cutHeroDao.todayHard) {
         this.player.failure(6);
      } else {
         if (cutHeroModel.getLastId() > 0) {
            BattleCutHeroDao.EnemyData lastEnemyData = (BattleCutHeroDao.EnemyData)cutHeroDao.enemy.get(cutHeroModel.getLastId());
            if (lastEnemyData == null || !lastEnemyData.pass) {
               this.player.failure(5019);
               return;
            }
         }

         BattleCutHeroDao.EnemyData enemyData = (BattleCutHeroDao.EnemyData)cutHeroDao.enemy.get(battleId);
         if (enemyData == null) {
            this.buildEnemy(cutHeroDao, cutHeroModel, false);
            enemyData = (BattleCutHeroDao.EnemyData)cutHeroDao.enemy.get(battleId);
            if (enemyData == null) {
               this.player.failure(0);
               return;
            }
         }

         BattleDailyMsg.S2C_BattleInfo_6622.Builder resp = BattleDailyMsg.S2C_BattleInfo_6622.newBuilder();
         resp.setLv(enemyData.lv);
         resp.setHead(enemyData.head);
         resp.setName(enemyData.name);
         resp.setPower(enemyData.power);
         resp.setPlayerId(enemyData.player);
         resp.setServerId(enemyData.serverId);
         ArrayingMirror arrayingMirror = ArrayingMirror.toArrayingMirror((byte[])enemyData.arrayingMirrorList.get(0));
         if (arrayingMirror != null) {
            for(Map.Entry<Byte, ArrayingEntity> entry : arrayingMirror.arrayingElementsMap.entrySet()) {
               if (((ArrayingEntity)entry.getValue()).heroAndFriend()) {
                  BattleDailyMsg.HeroInfo.Builder heroBuilder = BattleDailyMsg.HeroInfo.newBuilder();
                  heroBuilder.setHeroInfo((CommonMsg.HeroInfo)((ArrayingEntity)entry.getValue()).toBuilder());
                  BattleCutHeroDao.HpData hpData = (BattleCutHeroDao.HpData)enemyData.hpDataMap.get(Integer.valueOf((Byte)entry.getKey()));
                  if (hpData != null) {
                     heroBuilder.setHp(hpData.hpPercent);
                  } else {
                     heroBuilder.setHp(100);
                  }

                  resp.addHeroInfo(heroBuilder);
               }
            }

            resp.setFriendUp(arrayingMirror.friendState == 0);
         }

         this.player.sendMsg(resp.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_GetSupport_6623(BattleDailyMsg.C2S_GetSupport_6623 msg, String source) {
      this.player.sendMsg(this.buildSupportInfo());
   }

   @MsgHandlerAnno
   public void C2S_SetSupportHero_6625(BattleDailyMsg.C2S_SetSupportHero_6625 msg, String channelId) {
      BattleCutHeroDao myCutHeroDao = (BattleCutHeroDao)this.player.getData("tb_battle_cut_hero", this.player.getPlayerId());
      WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
      if (msg.getIsDispatch()) {
         int heroCode = msg.getHeroCode();
         HeroDao heroDao = this.getHeroDao(this.player, heroCode);
         worldMgrPushTaskPart.pushTaskEx("addHeroSupport", new Object[]{HeroSupportDao.SupportModule.CUT, heroDao, this, "cutDispatch"});
      } else {
         int friendCode = msg.getFriendCode();
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

         int cutCopyHeroNum = this.configManager.getInt("cutCopyHireNumLimit");
         if (myCutHeroDao.friendSupport.size() >= cutCopyHeroNum) {
            this.player.failure(5007);
            return;
         }

         worldMgrPushTaskPart.pushTaskEx("choiceHeroSupport", new Object[]{HeroSupportDao.SupportModule.CUT, friendCode, this, "choiceCutSupport"});
      }

   }

   @TaskMethod
   public void cutDispatch(HeroSupportDao.SupportModule supportModule) {
      String[] dispatchRewardArr = this.configManager.getStr("battleHeroTrainingReward").split(",");
      this.player.addResource(Integer.parseInt(dispatchRewardArr[0]), Integer.parseInt(dispatchRewardArr[1]), Integer.parseInt(dispatchRewardArr[2]), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 5, 517, 0, 0, "");
      this.sendSetSupportResult(true);
   }

   @TaskMethod
   public void choiceCutSupport(HeroSupportDao heroSupportDao) {
      float powerPer = this.configManager.getFloat("cutCopyHirePowerLimit");
      if ((float)this.player.getHeroOfMaxCombatPower().combatPower * powerPer < (float)heroSupportDao.heroSupport.combatPower) {
         this.player.failure(5009);
      } else {
         BattleCutHeroDao myCutHeroDao = (BattleCutHeroDao)this.player.getData("tb_battle_cut_hero", this.player.getPlayerId());
         myCutHeroDao.friendSupport.put(heroSupportDao.playerId, false);
         myCutHeroDao.updateOp();
         this.sendSetSupportResult(false);
         GamePlayer friendPlayer = this.worldMgr.getPlayerById(heroSupportDao.playerId);
         if (friendPlayer != null) {
            BattleCutPart friendCutPart = (BattleCutPart)friendPlayer.getMgrPart(BattleCutPart.class);
            friendCutPart.pushTaskEx("cutBeSupport", new Object[]{this.player.getPlayerId()});
         }
      }
   }

   @TaskMethod
   public void cutBeSupport(int friendPlayerId) {
      BattleCutHeroDao myCutHeroDao = (BattleCutHeroDao)this.player.getData("tb_battle_cut_hero", this.player.getPlayerId());
      if (!myCutHeroDao.supports.contains(friendPlayerId)) {
         myCutHeroDao.supports.add(friendPlayerId);
         this.player.triggerTask(618, 0, 1L, 1);
      }

      myCutHeroDao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_EnterCutBattle_6627(BattleDailyMsg.C2S_EnterCutBattle_6627 msg, String channelId) {
   }

   private void sendSetSupportResult(boolean isDispatch) {
      BattleCutHeroDao myCutHeroDao = (BattleCutHeroDao)this.player.getData("tb_battle_cut_hero", this.player.getPlayerId());
      BattleDailyMsg.S2C_SetSupportHero_6626.Builder down = BattleDailyMsg.S2C_SetSupportHero_6626.newBuilder();
      down.setIsDispatch(isDispatch);
      down.addAllFriendCode(myCutHeroDao.friendSupport.keySet());
      WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
      HeroSupportDao heroSupportDao = worldMgrPushTaskPart.getHeroSupportDao(HeroSupportDao.SupportModule.CUT, this.player.getPlayerId());
      if (heroSupportDao != null) {
         down.setMySupportHero(heroSupportDao.heroSupport.toBuilder());
      }

      this.player.sendMsg(down.build());
   }

   public int enterBattle(BattleDao battleDao) {
      int battleId = battleDao.modelId;
      List<Integer> params = battleDao.params;
      if (params != null && params.size() == 2) {
         byte friendPos = ((Integer)params.get(0)).byteValue();
         int friendCode = (Integer)params.get(1);
         BattleCutHeroModel cutHeroModel = (BattleCutHeroModel)this.player.getGameModelPool().getEntity("battleCutHero", battleId);
         if (cutHeroModel == null) {
            return 6;
         } else {
            BattleCutHeroDao dao = (BattleCutHeroDao)this.player.getData("tb_battle_cut_hero", this.player.getPlayerId());
            if (cutHeroModel.getHard() == dao.todayHard && cutHeroModel.getLastId() == dao.getLastPassId()) {
               if (friendCode > 0 && dao.friendSupport.containsKey(friendCode) && (Boolean)dao.friendSupport.get(friendCode)) {
                  return 5005;
               } else {
                  HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
                  if (heroArrayingPart.getHeroCodesOfArraying(CommonMsg.HeroState.HERO_STATE_BATTLE_CUT_HERO).isEmpty()) {
                     return 4113;
                  } else {
                     PlayerDao playerDao = this.player.getPlayerDao();
                     ArrayingMirror myArrayingMirror = heroArrayingPart.getArrayingMirrorByType(CommonMsg.HeroState.HERO_STATE_BATTLE_CUT_HERO);
                     BattlePKTeam myPKTeam = new BattlePKTeam(this.player.getPlayerId(), playerDao.playerName, myArrayingMirror, playerDao.lv, playerDao.head, playerDao.headFrame, this.heroRankMgr.getHeroRankCompensate(myArrayingMirror, this.player.isRobot()));
                     dao.friendPos = -1;
                     dao.friendCode = 0;
                     if (friendCode > 0) {
                        GamePlayer friendPlayer = this.worldMgr.getPlayerById(friendCode);
                        if (friendPlayer != null) {
                           dao.friendPos = friendPos;
                           dao.friendCode = friendCode;
                        }

                        this.handleFriendSupport(dao, friendPlayer, myPKTeam);
                     }

                     int checkCode = myPKTeam.checkArraying();
                     if (checkCode != 1) {
                        return checkCode;
                     } else {
                        dao.updateOp();
                        if (!dao.hpMap.isEmpty()) {
                           Iterator<Map.Entry<Byte, Entity>> myEntityIt = myPKTeam.getEntityMap().entrySet().iterator();

                           while(myEntityIt.hasNext()) {
                              Map.Entry<Byte, Entity> entityEntry = (Map.Entry)myEntityIt.next();
                              BattleCutHeroDao.HpData hpData = this.getHpData((Entity)entityEntry.getValue(), friendPos, friendCode, dao.hpMap);
                              if (hpData != null) {
                                 if (hpData.hp <= 0L) {
                                    myEntityIt.remove();
                                 } else {
                                    this.setEntityHp((Entity)entityEntry.getValue(), hpData);
                                 }
                              }
                           }

                           if (myPKTeam.getFriendEntity() != null) {
                              BattleCutHeroDao.HpData hpData = this.getHpData(myPKTeam.getFriendEntity(), friendPos, friendCode, dao.hpMap);
                              this.setEntityHp(myPKTeam.getFriendEntity(), hpData);
                           }
                        }

                        boolean isAllDead = true;

                        for(Entity entity : myPKTeam.getEntityMap().values()) {
                           if (entity.getTeamPos() <= 5 && entity.getBaseProperty(99) > 0L) {
                              isAllDead = false;
                              break;
                           }
                        }

                        if (isAllDead) {
                           return 5026;
                        } else {
                           BattleCutHeroDao.EnemyData enemyData = (BattleCutHeroDao.EnemyData)dao.enemy.get(battleId);
                           if (enemyData != null && enemyData.arrayingMirrorList != null && enemyData.arrayingMirrorList.size() > 0 && ((byte[])enemyData.arrayingMirrorList.get(0)).length > 0) {
                              ArrayingMirror arrayingMirror = ArrayingMirror.toArrayingMirror((byte[])enemyData.arrayingMirrorList.get(0));
                              arrayingMirror.friendState = 1;
                              BattlePKTeam enemyPKTeam = new BattlePKTeam(enemyData.player, enemyData.name, arrayingMirror, enemyData.lv, enemyData.head, enemyData.headFrame, this.heroRankMgr.getHeroRankCompensate(arrayingMirror, true));
                              enemyPKTeam.setServerId(enemyData.serverId);

                              for(Map.Entry<Integer, BattleCutHeroDao.HpData> entry : enemyData.hpDataMap.entrySet()) {
                                 Integer pos = (Integer)entry.getKey();
                                 BattleCutHeroDao.HpData value = (BattleCutHeroDao.HpData)entry.getValue();
                                 if (value != null) {
                                    Entity entity = (Entity)enemyPKTeam.getEntityMap().get(pos.byteValue());
                                    if (entity != null) {
                                       long maxHp = entity.getBaseProperty(1);
                                       if (value.hp <= 0L) {
                                          enemyPKTeam.getEntityMap().remove(pos.byteValue());
                                       } else {
                                          entity.setBaseProperty(99, Math.min(value.hp, maxHp));
                                       }
                                    } else if (pos == 5 && enemyPKTeam.getFriendEntity() != null) {
                                       long maxHp = enemyPKTeam.getFriendEntity().getBaseProperty(1);
                                       if (value.hp <= 0L) {
                                          enemyPKTeam.setFriendEntity((Entity)null);
                                       } else {
                                          enemyPKTeam.getFriendEntity().setBaseProperty(99, Math.min(value.hp, maxHp));
                                       }
                                    }
                                 }
                              }

                              battleDao.scene.addPKTeam(myPKTeam, enemyPKTeam);
                              battleDao.scene.setMaxRound(cutHeroModel.getBoutCount());
                              this.player.getOperationMgr().addCopyLog(this.player, cutHeroModel.getId(), "千里单骑");
                              this.player.triggerTask(508, 0, 1L, 1);
                              return 1;
                           } else {
                              return 0;
                           }
                        }
                     }
                  }
               }
            } else {
               return 6;
            }
         }
      } else {
         return 0;
      }
   }

   public void afterFight(BattleDao battleDao) {
      BattlePKTeam leftPkTeam = battleDao.scene.getPKTeam((byte)0);
      HashMap<Byte, Entity> myEntityMap = leftPkTeam.getEntityMap();
      Map<Integer, TreeMap<Integer, BattleCutHeroModel>> cutHeroModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, BattleCutHeroModel>>getModelPoolMap("customBattleCutHero");
      BattleCutHeroModel cutHeroModel = (BattleCutHeroModel)this.player.getGameModelPool().getEntity("battleCutHero", battleDao.modelId);
      BattleCutHeroDao dao = (BattleCutHeroDao)this.player.getData("tb_battle_cut_hero", this.player.getPlayerId());
      Entity supportEntity = null;

      for(Entity entity : myEntityMap.values()) {
         Entity tempEntity = this.recordHpData(entity, dao);
         if (tempEntity != null && supportEntity == null) {
            supportEntity = tempEntity;
         }
      }

      if (leftPkTeam.getFriendEntity() != null) {
         Entity tempEntity = this.recordHpData(leftPkTeam.getFriendEntity(), dao);
         if (tempEntity != null && supportEntity == null) {
            supportEntity = tempEntity;
         }
      }

      BattlePKTeam rightPkTeam = battleDao.scene.getPKTeam((byte)1);
      HashMap<Byte, Entity> enemyEntityMap = rightPkTeam.getEntityMap();

      for(Entity entity : enemyEntityMap.values()) {
         this.recordEnemyHp(entity, (BattleCutHeroDao.EnemyData)dao.enemy.get(battleDao.modelId));
      }

      if (rightPkTeam.getFriendEntity() != null) {
         this.recordEnemyHp(rightPkTeam.getFriendEntity(), (BattleCutHeroDao.EnemyData)dao.enemy.get(battleDao.modelId));
      }

      if (battleDao.scene.getWinForce() == 0) {
         ((BattleCutHeroDao.EnemyData)dao.enemy.get(battleDao.modelId)).pass = true;
         if (dao.friendSupport.containsKey(dao.friendCode)) {
            dao.friendSupport.put(dao.friendCode, true);
         }

         SpecialTaskActivityPart specialTaskActivityPart = (SpecialTaskActivityPart)this.player.getMgrPart(SpecialTaskActivityPart.class);
         BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().build().getResult().toBuilder();
         List<ResourceModel> rewards;
         if (specialTaskActivityPart.isActivityTime(1150)) {
            rewards = cutHeroModel.getActRewards();
         } else {
            rewards = cutHeroModel.getRewards();
         }

         for(ResourceModel r : rewards) {
            ResourceModel resourceModel = r.clone();
            resourceModel.addResourceToList(battleDao.rewards);
            dao.addTodayReward(resourceModel);
            result.addAwardItems(CommonMsg.ItemInfo.newBuilder().setType(resourceModel.getType()).setId(resourceModel.getId()).setNum(resourceModel.getValue()));
         }

         battleDao.scene.getBattleMsg().setResult(result);
         this.player.triggerTask(112, 0, 1L, 1);
         this.player.triggerTask(206, 0, (long)(cutHeroModel.getId() % 100), 0);
         TreeMap<Integer, BattleCutHeroModel> curHardModelMap = (TreeMap)MapUtil.getOrDefault(cutHeroModelMap, cutHeroModel.getHard(), TreeMap.class);
         if (curHardModelMap.lastKey() != null && (Integer)curHardModelMap.lastKey() == battleDao.modelId) {
            this.player.triggerTask(315, cutHeroModel.getHard(), 1L, 1);
            dao.hardPass(cutHeroModel.getHard());
         } else {
            this.buildNextEnemy(dao, cutHeroModel);
         }

         dao.friendCode = 0;
         dao.friendPos = -1;
         String[] activityPointArr = ApplicationContextProvider.getConfigString("PassthroughPoints", "").split("\\|");
         specialTaskActivityPart.addPoint(1150, Integer.parseInt(activityPointArr[cutHeroModel.getHard() - 1]));
         this.player.getOperationMgr().addExtraLog(this.player, 189, "千里单骑", cutHeroModel.getName(), "过关");
      } else if (dao.friendCode > 0 && dao.friendPos > -1 && supportEntity != null) {
         long curHp = supportEntity.getBaseProperty(99);
         long maxHp = supportEntity.getBaseProperty(1);
         BattleCutHeroDao.HpData hpData = (BattleCutHeroDao.HpData)MapUtil.computeIfAbsent(dao.hpMap, MiscUtil.comboInteger(dao.friendCode, supportEntity.getHeroCode()), BattleCutHeroDao.HpData.class);
         hpData.hp = curHp < 0L ? 0L : curHp;
         hpData.hpPercent = CalculateUtil.calPercent(curHp, maxHp);
      }

      BattleCutHeroDao.EnemyData enemyData = (BattleCutHeroDao.EnemyData)dao.enemy.get(battleDao.modelId);
      if (enemyData != null) {
         BattleMsg.S2C_Battle_PKTeam.Builder rightTeam = battleDao.scene.getBattleMsg().getTeams(1).toBuilder();
         rightTeam.addPlayerInfos(this.player.toPropertyCellForInt32(PlayerDefine.PLAYER_VIP_LV, enemyData.vip_lv));
         rightTeam.addPlayerInfos(this.player.toPropertyCellForInt32(PlayerDefine.PLAYER_LV, enemyData.lv));
         rightTeam.addPlayerInfos(this.player.toPropertyCellForInt32(PlayerDefine.PLAYER_HEAD, enemyData.head));
         rightTeam.addPlayerInfos(this.player.toPropertyCellForInt32(PlayerDefine.PLAYER_HEADFRAME, enemyData.headFrame));
         rightTeam.addPlayerInfos(this.player.toPropertyCellForInt32(PlayerDefine.PLAYER_SEX, enemyData.sex));
         battleDao.scene.getBattleMsg().setTeams(1, (BattleMsg.S2C_Battle_PKTeam.Builder)rightTeam);
      }

      dao.updateOp();
      BattleDailyMsg.S2C_EnterCutBattle_6628.Builder resp = BattleDailyMsg.S2C_EnterCutBattle_6628.newBuilder();
      resp.setInfo(this.cutInfoBuild());
      this.player.sendMsg(resp.build());
      this.player.getOperationMgr().addExtraLog(this.player, 207, this.player.getPublicDao().vip_lv + "", "千里单骑", "1");
   }

   public void endBattle(BattleDao battleDao) {
      if (!battleDao.rewards.isEmpty()) {
         this.player.addResource(battleDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 5, 507, battleDao.modelId, 0, String.valueOf(this.player.getPlayerId()));
      }

   }

   @MsgHandlerAnno
   public void C2S_GetCutReward_6629(BattleDailyMsg.C2S_GetCutReward_6629 msg, String channelId) {
      int battleId = msg.getBattleId();
      BattleCutHeroModel cutHeroModel = (BattleCutHeroModel)this.player.getGameModelPool().getEntity("battleCutHero", battleId);
      if (cutHeroModel == null) {
         this.player.failure(6);
      } else {
         BattleCutHeroDao dao = (BattleCutHeroDao)this.player.getData("tb_battle_cut_hero", this.player.getPlayerId());
         if (dao.battleBoxId.contains(battleId)) {
            this.player.failure(6);
         } else if (dao.getLastPassId() < battleId) {
            this.player.failure(6);
         } else {
            dao.battleBoxId.add(battleId);
            SpecialTaskActivityPart specialTaskActivityPart = (SpecialTaskActivityPart)this.player.getMgrPart(SpecialTaskActivityPart.class);
            List<ResourceModel> rewards;
            if (specialTaskActivityPart.isActivityTime(1150)) {
               rewards = cutHeroModel.getActBoxRewards();
            } else {
               rewards = cutHeroModel.getBoxRewards();
            }

            for(ResourceModel r : rewards) {
               ResourceModel resourceModel = r.clone();
               dao.addTodayReward(resourceModel);
            }

            this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 5, 508, 0, 0, "");
            dao.updateOp();
            BattleDailyMsg.S2C_GetCutReward_6630.Builder down = BattleDailyMsg.S2C_GetCutReward_6630.newBuilder();
            down.addAllRewardBattleId(dao.battleBoxId);

            for(ResourceModel rewardItem : dao.todayReward) {
               down.addTodayReward(rewardItem.builder());
            }

            this.player.sendMsg(down.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_GetDyingHero_6631(BattleDailyMsg.C2S_GetDyingHero_6631 msg, String source) {
      this.player.sendMsg(this.buildDyingHeroInfo());
   }

   @MsgHandlerAnno
   public void C2S_ReviveHero_6633(BattleDailyMsg.C2S_ReviveHero_6633 msg, String channelId) {
      List<Integer> heroCodeList = msg.getHeroCodeList();
      BattleCutHeroDao dao = (BattleCutHeroDao)this.player.getData("tb_battle_cut_hero", this.player.getPlayerId());
      if (!heroCodeList.isEmpty()) {
         PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
         VipModel vipModel = (VipModel)this.player.getGameModelPool().getEntity("vip", playerDao.vip_lv);
         int reviveCount = this.configManager.getInt("cutDailyReviveCount");
         if (vipModel.getResurrectionTimes() + reviveCount <= dao.reviveCount) {
            this.player.failure(5013);
         } else {
            for(int code : heroCodeList) {
               long hpKey = MiscUtil.comboInteger(this.player.getPlayerId(), code);
               BattleCutHeroDao.HpData hpData = (BattleCutHeroDao.HpData)dao.hpMap.get(hpKey);
               if (hpData == null || hpData.hp > 0L) {
                  this.player.failure(6);
                  return;
               }
            }

            int type = Integer.parseInt(this.configManager.parseValue("cutCopyHeroReviveCost", 0, "\\|"));
            int id = Integer.parseInt(this.configManager.parseValue("cutCopyHeroReviveCost", 1, "\\|"));
            int num = heroCodeList.size() * Integer.parseInt(this.configManager.parseValue("cutCopyHeroReviveCost", 2, "\\|"));
            if (!this.player.checkResourceNum(type, id, num)) {
               this.player.failure(18);
            } else {
               this.player.delResource(type, id, (long)num, 5, 510, dao.todayHard, heroCodeList.size(), String.valueOf(this.player.getPlayerId()));

               for(int code : heroCodeList) {
                  dao.hpMap.remove(MiscUtil.comboInteger(this.player.getPlayerId(), code));
               }

               ++dao.reviveCount;
               dao.updateOp();
               BattleDailyMsg.S2C_ReviveHero_6634.Builder resp = BattleDailyMsg.S2C_ReviveHero_6634.newBuilder();
               resp.addAllHeroCode(heroCodeList);
               this.player.sendMsg(resp.build());
               this.player.sendMsg(this.buildDyingHeroInfo());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_SetBattleHard_6635(BattleDailyMsg.C2S_SetBattleHard_6635 msg, String channelId) {
      BattleCutHeroDao dao = (BattleCutHeroDao)this.player.getData("tb_battle_cut_hero", this.player.getPlayerId());
      if (dao.todayHard > 0) {
         this.player.failure(5014);
      } else {
         int hard = msg.getHard();
         if (hard <= dao.getMaxHard() && hard >= 0) {
            Map<Integer, TreeMap<Integer, BattleCutHeroModel>> cutHeroModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, BattleCutHeroModel>>getModelPoolMap("customBattleCutHero");
            TreeMap<Integer, BattleCutHeroModel> handModelMap = (TreeMap)cutHeroModelMap.get(hard);
            dao.todayHard = hard;
            int lastTime = MiscUtil.getHiParam(dao.yesterdayHard);
            int lastHard = MiscUtil.getLowParam(dao.yesterdayHard);
            if (DateUtil.difftimeDay(new Timestamp((long)lastTime * 1000L)) == 1 && lastHard == hard) {
               this.autoSweepCutHero();
            }

            if (dao.enemy.isEmpty()) {
               this.buildEnemy(dao, (BattleCutHeroModel)handModelMap.firstEntry().getValue(), false);
            } else {
               BattleCutHeroModel cutHeroModel = (BattleCutHeroModel)handModelMap.get(dao.enemy.lastKey());
               this.buildNextEnemy(dao, cutHeroModel);
            }

            dao.yesterdayHard = MiscUtil.comboInteger(DateUtil.getIntTime(System.currentTimeMillis()), hard);
            dao.updateOp();
            this.player.sendMsg(this.cutInfoBuild());
         } else {
            this.player.failure(5025);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_OneKeyGetCutBox_6651(BattleDailyMsg.C2S_OneKeyGetCutBox_6651 msg, String source) {
      BattleCutHeroDao dao = (BattleCutHeroDao)this.player.getData("tb_battle_cut_hero", this.player.getPlayerId());
      List<ResourceModel> finalRewardList = new ArrayList();
      SpecialTaskActivityPart specialTaskActivityPart = (SpecialTaskActivityPart)this.player.getMgrPart(SpecialTaskActivityPart.class);
      Map<Integer, TreeMap<Integer, BattleCutHeroModel>> cutHeroModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, BattleCutHeroModel>>getModelPoolMap("customBattleCutHero");
      TreeMap<Integer, BattleCutHeroModel> handModelMap = (TreeMap)cutHeroModelMap.get(dao.todayHard);
      if (handModelMap != null && !handModelMap.isEmpty()) {
         Set<Integer> boxes = new HashSet();

         for(BattleCutHeroModel battleCutHeroModel : handModelMap.values()) {
            if (!dao.battleBoxId.contains(battleCutHeroModel.getId()) && !boxes.contains(battleCutHeroModel.getId())) {
               if (dao.getLastPassId() < battleCutHeroModel.getId()) {
                  break;
               }

               List<ResourceModel> rewards;
               if (specialTaskActivityPart.isActivityTime(1150)) {
                  rewards = battleCutHeroModel.getActBoxRewards();
               } else {
                  rewards = battleCutHeroModel.getBoxRewards();
               }

               for(ResourceModel r : rewards) {
                  ResourceModel resourceModel = r.clone();
                  dao.addTodayReward(resourceModel);
                  resourceModel.addResourceToList(finalRewardList);
               }

               boxes.add(battleCutHeroModel.getId());
            }
         }

         if (!finalRewardList.isEmpty()) {
            this.player.addResource(finalRewardList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 5, 508, 0, 0, "");
         }

         if (!boxes.isEmpty()) {
            dao.battleBoxId.addAll(boxes);
            dao.updateOp();
         }

         BattleDailyMsg.S2C_OneKeyGetCutBox_6652.Builder resp = BattleDailyMsg.S2C_OneKeyGetCutBox_6652.newBuilder();
         resp.addAllRewardBattleId(dao.battleBoxId);

         for(ResourceModel rewardItem : dao.todayReward) {
            resp.addTodayReward(rewardItem.builder());
         }

         this.player.sendMsg(resp.build());
      } else {
         this.player.failure(0);
      }
   }

   private BattleDailyMsg.S2C_GetCutInfo_6620 cutInfoBuild() {
      BattleDailyMsg.S2C_GetCutInfo_6620.Builder down = BattleDailyMsg.S2C_GetCutInfo_6620.newBuilder();
      int playerId = this.player.getPlayerId();
      BattleCutHeroDao cutHeroDao = (BattleCutHeroDao)this.player.getData("tb_battle_cut_hero", playerId);

      for(ResourceModel rewardItem : cutHeroDao.todayReward) {
         down.addTodayReward(rewardItem.builder());
      }

      if (cutHeroDao.todayHard == 0) {
         this.checkUnlockHard();
      }

      down.setMaxHard(cutHeroDao.getMaxHard());
      down.setFriendCode(cutHeroDao.friendCode);
      down.setFriendPos(cutHeroDao.friendPos);
      down.setHard(cutHeroDao.todayHard);
      down.setPassId(cutHeroDao.getLastPassId());
      down.addAllRewardId(cutHeroDao.battleBoxId);

      for(Map.Entry<Long, BattleCutHeroDao.HpData> entry : cutHeroDao.hpMap.entrySet()) {
         int hpPlayerId = MiscUtil.getHiParam((Long)entry.getKey());
         int code = MiscUtil.getLowParam((Long)entry.getKey());
         BattleDailyMsg.HeroHp.Builder heroHp = BattleDailyMsg.HeroHp.newBuilder();
         heroHp.setCode(code);
         if (hpPlayerId != playerId) {
            heroHp.setFriendCode(hpPlayerId);
         }

         heroHp.setHp(((BattleCutHeroDao.HpData)entry.getValue()).hpPercent);
         down.addHeroHps(heroHp);
      }

      down.setSupportInfo(this.buildSupportInfo());
      int lastTime = MiscUtil.getHiParam(cutHeroDao.yesterdayHard);
      int lastHard = MiscUtil.getLowParam(cutHeroDao.yesterdayHard);
      boolean yesterdayHadHard = DateUtil.difftimeDay(new Timestamp((long)lastTime * 1000L)) == 1;
      down.setYesterdayHard(yesterdayHadHard ? lastHard : 0);
      down.setYesterdayLastPassId(yesterdayHadHard ? cutHeroDao.yesterdayPass : 0);
      return down.build();
   }

   private BattleDailyMsg.S2C_GetSupport_6624 buildSupportInfo() {
      BattleDailyMsg.S2C_GetSupport_6624.Builder resp = BattleDailyMsg.S2C_GetSupport_6624.newBuilder();
      FriendDao friendDao = (FriendDao)this.player.getData("tb_friend", this.player.getPlayerId());
      WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
      if (friendDao != null) {
         for(int friendCode : friendDao.friends) {
            GamePlayer friendPlayer = this.worldMgr.getPlayerById(friendCode);
            if (friendPlayer != null) {
               HeroSupportDao friendSupportDao = worldMgrPushTaskPart.getHeroSupportDao(HeroSupportDao.SupportModule.CUT, friendPlayer.getPlayerId());
               if (friendSupportDao != null) {
                  BattleDailyMsg.FriendSupportHero.Builder friendHero = BattleDailyMsg.FriendSupportHero.newBuilder();
                  friendHero.setFriendCode(friendCode);
                  friendHero.setHero(friendSupportDao.heroSupport.toBuilder());
                  resp.addHeroes(friendHero);
               }
            }
         }
      }

      BattleCutHeroDao cutHeroDao = (BattleCutHeroDao)this.player.getData("tb_battle_cut_hero", this.player.getPlayerId());

      for(Map.Entry<Integer, Boolean> entry : cutHeroDao.friendSupport.entrySet()) {
         resp.addFriendCode((Integer)entry.getKey());
         if ((Boolean)entry.getValue()) {
            resp.addUseFriendCode((Integer)entry.getKey());
         }
      }

      HeroSupportDao heroSupportDao = worldMgrPushTaskPart.getHeroSupportDao(HeroSupportDao.SupportModule.CUT, this.player.getPlayerId());
      if (heroSupportDao != null) {
         resp.setMySupportHero(heroSupportDao.heroSupport.toBuilder());
      }

      return resp.build();
   }

   private BattleDailyMsg.S2C_GetDyingHero_6632 buildDyingHeroInfo() {
      BattleCutHeroDao cutHeroDao = (BattleCutHeroDao)this.player.getData("tb_battle_cut_hero", this.player.getPlayerId());
      BattleDailyMsg.S2C_GetDyingHero_6632.Builder resp = BattleDailyMsg.S2C_GetDyingHero_6632.newBuilder();

      for(Map.Entry<Long, BattleCutHeroDao.HpData> entry : cutHeroDao.hpMap.entrySet()) {
         int playerId = MiscUtil.getHiParam((Long)entry.getKey());
         BattleCutHeroDao.HpData hpData = (BattleCutHeroDao.HpData)entry.getValue();
         if (hpData != null && hpData.hp <= 0L && playerId == this.player.getPlayerId()) {
            int heroCode = MiscUtil.getLowParam((Long)entry.getKey());
            resp.addHeroCode(heroCode);
         }
      }

      PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
      VipModel vipModel = (VipModel)this.player.getGameModelPool().getEntity("vip", playerDao.vip_lv);
      int reviveCount = this.configManager.getInt("cutDailyReviveCount");
      resp.setReviveCount(vipModel.getResurrectionTimes() + reviveCount - cutHeroDao.reviveCount);
      resp.setMaxReviveCount(vipModel.getResurrectionTimes() + reviveCount);
      return resp.build();
   }

   private void autoSweepCutHero() {
      BattleCutHeroDao dao = (BattleCutHeroDao)this.player.getData("tb_battle_cut_hero", this.player.getPlayerId());
      int battleId = dao.yesterdayPass - this.configManager.getInt("cutCopyAuto");
      BattleCutHeroModel cutHeroModel = (BattleCutHeroModel)this.player.getGameModelPool().getEntity("battleCutHero", battleId);

      List<BattleCutHeroModel> autoSweepList;
      for(autoSweepList = new ArrayList(); cutHeroModel != null; cutHeroModel = (BattleCutHeroModel)this.player.getGameModelPool().getEntity("battleCutHero", cutHeroModel.getLastId())) {
         autoSweepList.add(cutHeroModel);
      }

      if (!autoSweepList.isEmpty()) {
         String[] activityPointArr = ApplicationContextProvider.getConfigString("PassthroughPoints", "").split("\\|");
         SpecialTaskActivityPart specialTaskActivityPart = (SpecialTaskActivityPart)this.player.getMgrPart(SpecialTaskActivityPart.class);

         for(BattleCutHeroModel battleCutHeroModel : autoSweepList) {
            this.buildEnemy(dao, battleCutHeroModel, true);

            for(ResourceModel reward : battleCutHeroModel.getRewards()) {
               dao.addTodayReward(reward);
            }

            this.player.triggerTask(112, 0, 1L, 1);
            this.player.triggerTask(206, 0, (long)(battleCutHeroModel.getId() % 100), 0);
            specialTaskActivityPart.addPoint(1150, Integer.parseInt(activityPointArr[battleCutHeroModel.getHard() - 1]));
            this.player.getOperationMgr().addExtraLog(this.player, 189, "千里单骑-扫荡", battleCutHeroModel.getName(), "过关");
         }

         this.player.addResource(dao.todayReward, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 5, 509, 0, 0, "");
         this.player.triggerTask(508, 0, (long)autoSweepList.size(), 1);
      }

   }

   private void checkUnlockHard() {
      BattleCutHeroDao myCutHeroDao = (BattleCutHeroDao)this.player.getData("tb_battle_cut_hero", this.player.getPlayerId());
      int maxHard = myCutHeroDao.getMaxHard();
      String[] powerLimitArr = ApplicationContextProvider.getConfigString("cutCopyPowerLimit", "").split("\\|");
      if (myCutHeroDao.getMaxHard() < powerLimitArr.length) {
         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);

         for(int hard = maxHard + 1; hard <= powerLimitArr.length; ++hard) {
            int powerLimit = Integer.parseInt(powerLimitArr[hard - 1]);
            boolean isPass = myCutHeroDao.isPass(hard - 1);
            if ((long)powerLimit <= playerExtend.highestPower && isPass && hard > maxHard) {
               myCutHeroDao.setMaxHard(hard);
               myCutHeroDao.updateOp();
            }
         }

      }
   }

   private void buildEnemy(BattleCutHeroDao dao, BattleCutHeroModel battleCutHeroModel, boolean isSwap) {
      if (dao.enemy.containsKey(battleCutHeroModel.getId())) {
         this.logger.warn("千里单骑跳过创建关卡敌人,{}关卡敌人已存在", battleCutHeroModel.getId());
      } else {
         long power = this.player.getMaxPlayerCombatPower();
         long minPower = (long)((int)((float)(power * (long)(Integer)battleCutHeroModel.getFightPower().get(0)) / 10000.0F));
         long maxPower = (long)((int)((float)(power * (long)(Integer)battleCutHeroModel.getFightPower().get(1)) / 10000.0F));
         List<RankData> rankDataList = this.rankMgr.getRanks(RankDefine.RankModule.COMBAT_POWER, minPower, Math.max(maxPower, 20000L));
         BattleCutHeroDao.EnemyData enemyData = new BattleCutHeroDao.EnemyData();
         if (rankDataList.size() > 0) {
            int randomIndex = RandomUtil.randInt(0, rankDataList.size());
            RankData rankData = (RankData)rankDataList.get(randomIndex);
            boolean exist = false;

            for(BattleCutHeroDao.EnemyData existData : dao.enemy.values()) {
               if (existData.player == rankData.value) {
                  exist = true;
                  break;
               }
            }

            if (rankData.value != this.player.getPlayerId() && !exist) {
               this.buildPlayer(enemyData, rankData, battleCutHeroModel.getId(), isSwap);
            } else {
               this.buildRobot(enemyData, minPower, maxPower, isSwap);
            }
         } else {
            this.buildRobot(enemyData, minPower, maxPower, isSwap);
         }

         dao.enemy.put(battleCutHeroModel.getId(), enemyData);
         dao.updateOp();
      }
   }

   private void buildNextEnemy(BattleCutHeroDao dao, BattleCutHeroModel cutHeroModel) {
      Map<Integer, TreeMap<Integer, BattleCutHeroModel>> cutHeroModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, BattleCutHeroModel>>getModelPoolMap("customBattleCutHero");
      TreeMap<Integer, BattleCutHeroModel> curHardModelMap = (TreeMap)MapUtil.getOrDefault(cutHeroModelMap, cutHeroModel.getHard(), TreeMap.class);
      BattleCutHeroModel nextModel = null;

      for(BattleCutHeroModel battleCutHeroModel : curHardModelMap.values()) {
         if (battleCutHeroModel.getLastId() == cutHeroModel.getId()) {
            nextModel = battleCutHeroModel;
            break;
         }
      }

      if (nextModel != null) {
         this.buildEnemy(dao, nextModel, false);
         dao.updateOp();
      } else {
         this.logger.error("创建关卡{}的下一关出错,下一关配置不存在", cutHeroModel.getId());
      }

   }

   private void buildPlayer(BattleCutHeroDao.EnemyData enemyData, RankData rankData, int cutId, boolean isSwap) {
      GamePlayer enemyPlayer = this.worldMgr.getPlayerById(rankData.value);
      PlayerPublicDao enemyPlayerDao = enemyPlayer.getPublicDao();
      enemyData.player = rankData.value;
      enemyData.name = enemyPlayerDao.playerName;
      enemyData.lv = enemyPlayerDao.lv;
      enemyData.head = enemyPlayerDao.head;
      enemyData.power = (int)rankData.score;
      enemyData.headFrame = enemyPlayerDao.headFrame;
      enemyData.vip_lv = enemyPlayerDao.vip_lv;
      enemyData.sex = enemyPlayerDao.sex;
      enemyData.pass = isSwap;
      enemyData.serverId = enemyPlayerDao.serverId;
      enemyPlayer.pushTask(() -> {
         ArrayingMirror arrayingMirror = enemyPlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
         arrayingMirror.friendState = 1;
         this.player.pushTask(() -> {
            BattleCutHeroDao battleCutHeroDao = (BattleCutHeroDao)this.player.getData("tb_battle_cut_hero", this.player.getPlayerId());
            BattleCutHeroDao.EnemyData enemyData1 = (BattleCutHeroDao.EnemyData)battleCutHeroDao.enemy.get(cutId);
            if (enemyData1 != null) {
               enemyData1.arrayingMirrorList.add(arrayingMirror.toByteArray());
               if (enemyData.pass) {
                  this.swapHandleHp(arrayingMirror, enemyData1);
               }

               battleCutHeroDao.updateOp();
            }

         });
      });
   }

   private void buildRobot(BattleCutHeroDao.EnemyData enemyData, long minPower, long maxPower, boolean isSwap) {
      MonsterMgr monsterMgr = (MonsterMgr)ApplicationContextProvider.getContext().getBean(MonsterMgr.class);
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
      RobotData robotData = monsterMgr.getRobotData(minPower, maxPower, worldMgr.getWorldLv());
      enemyData.player = robotData.player;
      enemyData.name = robotData.name;
      enemyData.lv = robotData.lv;
      enemyData.head = robotData.head;
      enemyData.power = robotData.power;
      enemyData.headFrame = robotData.headFrame;
      enemyData.vip_lv = robotData.vip_lv;
      enemyData.sex = robotData.sex;
      enemyData.pass = isSwap;
      enemyData.arrayingMirrorList.addAll(robotData.arrayingMirrorList);
      if (enemyData.pass) {
         ArrayingMirror arrayingMirror = ArrayingMirror.toArrayingMirror((byte[])robotData.arrayingMirrorList.get(0));
         this.swapHandleHp(arrayingMirror, enemyData);
      }

   }

   private void swapHandleHp(ArrayingMirror arrayingMirror, BattleCutHeroDao.EnemyData enemyData) {
      if (arrayingMirror != null) {
         for(Map.Entry<Byte, ArrayingEntity> entry : arrayingMirror.arrayingElementsMap.entrySet()) {
            if (((ArrayingEntity)entry.getValue()).heroAndFriend()) {
               BattleCutHeroDao.HpData hpData = (BattleCutHeroDao.HpData)MapUtil.computeIfAbsent(enemyData.hpDataMap, Integer.valueOf((Byte)entry.getKey()), BattleCutHeroDao.HpData.class);
               hpData.hp = 0L;
               hpData.hpPercent = 0;
            }
         }

      }
   }

   private void handleFriendSupport(BattleCutHeroDao myCutHeroDao, GamePlayer friendPlayer, BattlePKTeam battlePKTeam) {
      if (friendPlayer != null) {
         WorldMgrPushTaskPart worldMgrPushTaskPart = (WorldMgrPushTaskPart)this.worldMgr.getMgrPart(WorldMgrPushTaskPart.class);
         HeroSupportDao heroSupportDao = worldMgrPushTaskPart.getHeroSupportDao(HeroSupportDao.SupportModule.CUT, friendPlayer.getPlayerId());
         if (myCutHeroDao.friendSupport.containsKey(friendPlayer.getPlayerId()) && heroSupportDao != null && myCutHeroDao.friendPos > -1) {
            battlePKTeam.addHero(myCutHeroDao.friendPos, heroSupportDao.heroSupport, this.heroRankMgr.getHeroCompensate(heroSupportDao.heroSupport.id));
         }

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

   public void resetDaily() {
      BattleCutHeroDao dao = (BattleCutHeroDao)this.player.getData("tb_battle_cut_hero", this.player.getPlayerId());
      if (!dao.supports.isEmpty()) {
         int size = dao.supports.size();
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
         String[] split = configManager.getStr("cutSupportReward").split("\\|");
         List<ResourceModel> items = new ArrayList();

         for(String str : split) {
            String[] temp = str.split(",");
            ResourceModel itemData = new ResourceModel(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]) * size);
            items.add(itemData);
         }

         if (!items.isEmpty()) {
            CentreAwardModel centreAwardModel = CentreAwardModel.getByType(CentreAwardModel.TYPE_CUT_SUPPORT);
            if (centreAwardModel != null) {
               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), MessageFormat.format(centreAwardModel.getDesc(), size), items, 604800000L, 2, 511);
            }
         }
      }

      dao.reset();
   }

   private Entity recordHpData(Entity entity, BattleCutHeroDao battleCutHeroDao) {
      if (entity != null) {
         byte pos = entity.getOriginalPos() == BattleMisc.FRIEND_POS[0] ? 5 : entity.getTeamPos();
         if (pos > 5) {
            return null;
         }

         if (pos == battleCutHeroDao.friendPos) {
            return entity;
         }

         long curHp = entity.getBaseProperty(99);
         long maxHp = entity.getBaseProperty(1);
         BattleCutHeroDao.HpData hpData = (BattleCutHeroDao.HpData)MapUtil.computeIfAbsent(battleCutHeroDao.hpMap, MiscUtil.comboInteger(this.player.getPlayerId(), entity.getHeroCode()), BattleCutHeroDao.HpData.class);
         hpData.hp = curHp < 0L ? 0L : curHp;
         hpData.hpPercent = CalculateUtil.calPercent(curHp, maxHp);
      }

      return null;
   }

   private void recordEnemyHp(Entity entity, BattleCutHeroDao.EnemyData enemyData) {
      byte enemyPos = entity.getOriginalPos() == BattleMisc.FRIEND_POS[1] ? 5 : entity.getTeamPos();
      if (enemyPos <= 5) {
         long curHp = entity.getBaseProperty(99);
         long maxHp = entity.getBaseProperty(1);
         BattleCutHeroDao.HpData hpData = (BattleCutHeroDao.HpData)MapUtil.computeIfAbsent(enemyData.hpDataMap, Integer.valueOf(enemyPos), BattleCutHeroDao.HpData.class);
         hpData.hp = curHp < 0L ? 0L : curHp;
         hpData.hpPercent = CalculateUtil.calPercent(curHp, maxHp);
      }
   }

   private void setEntityHp(Entity entity, BattleCutHeroDao.HpData hpData) {
      if (entity != null) {
         Long curHp = hpData == null ? null : hpData.hp;
         if (curHp != null) {
            entity.setBaseProperty(99, Math.min(entity.getBaseProperty(1), curHp));
         }

      }
   }

   private BattleCutHeroDao.HpData getHpData(Entity entity, int friendPos, int friendId, Map<Long, BattleCutHeroDao.HpData> hpMap) {
      long hpKey;
      if (entity.getTeamPos() == friendPos) {
         hpKey = MiscUtil.comboInteger(friendId, entity.getHeroCode());
      } else {
         hpKey = MiscUtil.comboInteger(this.player.getPlayerId(), entity.getHeroCode());
      }

      return (BattleCutHeroDao.HpData)hpMap.get(hpKey);
   }
}
