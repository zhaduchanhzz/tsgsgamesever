package com.gzbz.war.hl;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.part.SpecialTaskActivityPart;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.BattleDao;
import com.gzbz.db.HeroArrayingDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.WarHLDao;
import com.gzbz.db.arraying.ArrayingEntity;
import com.gzbz.db.arraying.FriendArrayingEntity;
import com.gzbz.db.arraying.HeroArrayingEntity;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroRankMgr;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.HeroModel;
import com.gzbz.model.WarHLBattleModel;
import com.gzbz.model.WarHLBuffModel;
import com.gzbz.model.WarHLEventLibModel;
import com.gzbz.model.WarHLEventsModel;
import com.gzbz.model.WarHLGoodsModel;
import com.gzbz.model.WarHLLuckyRewardModel;
import com.gzbz.model.WarHLQuestionLibModel;
import com.gzbz.model.WarHLTargetRewardModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.WarMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.RankData;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.DateUtil;
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
public class WarPart extends PlayerPart {
   public static final int EVENT_RESOURCE = 10;
   public static final int EVENT_QUESTION_1 = 20;
   public static final int EVENT_QUESTION_3 = 21;
   public static final int EVENT_BOX = 30;
   public static final int EVENT_SPECIAL_CURE = 40;
   public static final int EVENT_SPECIAL_POISON = 41;
   public static final int EVENT_SPECIAL_SHOP_MAN = 42;
   public static final int EVENT_LUCKY_DICE = 50;
   public static final int EVENT_SHOP = 60;
   public static final int EVENT_BUFF = 70;
   public static final int EVENT_BOX_KEY = 80;
   public static final String WAR_HL_ENEMY_POS = "warHLEnemyPos";
   public static final String WAR_HL_EVENT_POS = "warHLEventPos";
   public static final String WAR_HL_CURE_COUNT = "warHLCureCount";
   public static final String WAR_HL_POISON_COUNT = "warHLPoisonCount";
   public static final String WAR_HL_BUY_POISON_COST = "warHLBuyPoisonCost";
   public static final String WAR_HL_CUR_POINT = "BattleOfGuanduPionts";
   public static final int rankSize = 100;
   @Autowired
   private HeroRankMgr heroRankMgr;

   @MsgHandlerAnno
   public void getWarHLInfo(WarMsg.C2S_GetWarHLInfo_8001 msg, String channelId) {
      HeroArrayingPart arrayPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      ArrayingMirror mirror = arrayPart.getArrayingMirrorByType(CommonMsg.HeroState.HERO_STATE_WAR_HL);
      if (mirror != null && !mirror.arrayingElementsMap.isEmpty()) {
         WarHLDao warHLDao = this.getWarHLDao();
         WarMsg.S2C_GetWarHLInfo_8002.Builder down = WarMsg.S2C_GetWarHLInfo_8002.newBuilder();
         down.setBattleFloor(warHLDao.curFloor);
         down.addAllPassFort(warHLDao.passFort);
         down.setItem(this.specialItemInfo(warHLDao));
         down.setHeroHp(this.heroHpInfo(warHLDao));

         for(HLEvent event : warHLDao.event.values()) {
            down.addEvents(event.builder());
         }

         down.setBuff(this.hlBuffInfo(warHLDao));
         down.setMarchShop(this.marchShopInfo(warHLDao));
         down.setTargetReward(this.targetRewardInfo(warHLDao));
         down.setHeroPos(warHLDao.heroPos);

         for(Map.Entry<Integer, Float> entry : warHLDao.enemyHP.entrySet()) {
            CommonMsg.MapDataIF.Builder enemyHp = CommonMsg.MapDataIF.newBuilder();
            enemyHp.setKey((Integer)entry.getKey());
            enemyHp.setValue((Float)entry.getValue());
            down.addEnemyHp(enemyHp);
         }

         down.addAllCrossFort(warHLDao.targetReward);
         down.setFortSum(warHLDao.allPass);
         long time = DateUtil.getSomeDayBeginTime(Long.parseLong(warHLDao.resetTime) * 1000L);
         down.setResetTime((int)((time + 172800000L) / 1000L));
         if (warHLDao.arraying == null || warHLDao.arraying.length == 0) {
            HeroArrayingPart mgrPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
            ArrayingMirror arrayingMirror = mgrPart.getArrayingMirrorByType(CommonMsg.HeroState.HERO_STATE_WAR_HL);
            if (arrayingMirror != null && !arrayingMirror.arrayingElementsMap.isEmpty() && this.checkHadHero(arrayingMirror)) {
               warHLDao.arraying = arrayingMirror.toByteArray();
               warHLDao.updateOp();
            }
         }

         if (warHLDao.arraying != null && warHLDao.arraying.length > 0) {
            ArrayingMirror arrayingMirror = ArrayingMirror.toArrayingMirror(warHLDao.arraying);

            for(ArrayingEntity value : arrayingMirror.arrayingElementsMap.values()) {
               if (value.heroAndFriend()) {
                  down.addHero((CommonMsg.HeroInfo)value.toBuilder());
               }
            }
         }

         if (warHLDao.lastMaxFloor == 0) {
            down.setMaxFloor(0);
         } else {
            down.setMaxFloor(warHLDao.lastMaxFloor);
         }

         this.player.sendMsg(down.build());
      } else {
         this.player.failure(21025);
      }
   }

   @MsgHandlerAnno
   public void C2S_ResetTime_8033(WarMsg.C2S_ResetTime_8033 msg, String channelId) {
      WarMsg.S2C_ResetTime_8034.Builder builder = WarMsg.S2C_ResetTime_8034.newBuilder();
      WarHLDao warHLDao = (WarHLDao)this.player.getData("tb_war_hl", this.player.getPlayerId());
      if (warHLDao.resetTime != null && !warHLDao.resetTime.equals("")) {
         long time = DateUtil.getSomeDayBeginTime(Long.parseLong(warHLDao.resetTime) * 1000L);
         builder.setResetTime((int)((time + 172800000L) / 1000L));
      } else {
         builder.setResetTime(0);
      }

      this.player.sendMsg(builder.build());
   }

   public boolean checkHadHero(ArrayingMirror arrayingMirror) {
      boolean flag = false;

      for(Map.Entry<Byte, ArrayingEntity> entry : arrayingMirror.arrayingElementsMap.entrySet()) {
         if (((ArrayingEntity)entry.getValue()).heroAndFriend()) {
            flag = true;
            break;
         }
      }

      return flag;
   }

   private WarMsg.S2C_TargetReward_8017 targetRewardInfo(WarHLDao warHLDao) {
      WarMsg.S2C_TargetReward_8017.Builder builder = WarMsg.S2C_TargetReward_8017.newBuilder();
      builder.addAllCrossFort(warHLDao.targetReward);
      return builder.build();
   }

   private WarMsg.HLMarchShop marchShopInfo(WarHLDao warHLDao) {
      WarMsg.HLMarchShop.Builder builder = WarMsg.HLMarchShop.newBuilder();

      for(HLGoods goods : warHLDao.shop) {
         builder.addGoods(goods.builder());
      }

      return builder.build();
   }

   private WarMsg.HLBuff hlBuffInfo(WarHLDao warHLDao) {
      WarMsg.HLBuff.Builder builder = WarMsg.HLBuff.newBuilder();

      for(PropertyModel model : warHLDao.buff) {
         builder.addBuff(model.builder());
      }

      return builder.build();
   }

   private WarMsg.S2C_UseSpecialItemCure_8009 heroHpInfo(WarHLDao warHLDao) {
      WarMsg.S2C_UseSpecialItemCure_8009.Builder builder = WarMsg.S2C_UseSpecialItemCure_8009.newBuilder();

      for(Map.Entry<Integer, Float> entry : warHLDao.heroHP.entrySet()) {
         CommonMsg.MapDataIF.Builder hp = CommonMsg.MapDataIF.newBuilder();
         hp.setKey((Integer)entry.getKey());
         hp.setValue((Float)entry.getValue());
         builder.addHeroHp(hp);
      }

      builder.setUseCure(warHLDao.cureCount);
      return builder.build();
   }

   private WarMsg.S2C_SpecialItem_8007 specialItemInfo(WarHLDao warHLDao) {
      WarMsg.S2C_SpecialItem_8007.Builder builder = WarMsg.S2C_SpecialItem_8007.newBuilder();
      builder.setUseCure(warHLDao.cureCount);
      builder.setUsePoison(warHLDao.poisonCount);
      return builder.build();
   }

   private WarHLDao getWarHLDao() {
      WarHLDao warHLDao = (WarHLDao)this.player.getData("tb_war_hl", this.player.getPlayerId());
      if (warHLDao.resetTime == null || warHLDao.resetTime.equals("")) {
         warHLDao.resetTime = System.currentTimeMillis() / 1000L + "";
         warHLDao.curFloor = 1;
         warHLDao.heroPos = -1;
         warHLDao.updateOp();
      }

      return warHLDao;
   }

   public int getWarHLScore() {
      WarHLDao warHLDao = this.getWarHLDao();
      int score = MiscUtil.comboShort((short)warHLDao.curFloor, (short)warHLDao.curPoint);
      return score;
   }

   public int beginBattle(BattleDao battleDao) {
      int heroPos = (Integer)battleDao.params.get(0);
      int fort = (Integer)battleDao.params.get(1);
      if (this.getWarHLDao().arraying != null && this.getWarHLDao().arraying.length != 0) {
         ArrayingMirror arrayingMirror = ArrayingMirror.toArrayingMirror(this.getWarHLDao().arraying);
         if (arrayingMirror != null && !arrayingMirror.arrayingElementsMap.isEmpty()) {
            ArrayingEntity arrayingEntity = (ArrayingEntity)arrayingMirror.arrayingElementsMap.get((byte)heroPos);
            if (!arrayingEntity.heroAndFriend()) {
               return 6;
            } else {
               int soulHeroId = 0;
               int limitStar = ApplicationContextProvider.getConfigInt("SoulHeroLimitStar", 9);
               HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", arrayingEntity.heroId());
               if (5 == heroPos) {
                  FriendArrayingEntity entity = (FriendArrayingEntity)arrayingMirror.arrayingElementsMap.get((byte)heroPos);
                  if (heroModel.getNation() == 10 && entity.mirror.star >= limitStar) {
                     soulHeroId = heroModel.getId();
                  }
               } else {
                  HeroArrayingEntity entity = (HeroArrayingEntity)arrayingMirror.arrayingElementsMap.get((byte)heroPos);
                  if (heroModel.getNation() == 10 && entity.mirror.star >= limitStar) {
                     soulHeroId = heroModel.getId();
                  }
               }

               WarHLDao warHLDao = this.getWarHLDao();
               if (warHLDao.passFort.contains(fort)) {
                  return 21001;
               } else if (fort == 5 && warHLDao.passFort.size() < 4) {
                  return 21002;
               } else {
                  float hp = 1.0F;
                  if (warHLDao.heroHP.containsKey(heroPos)) {
                     hp = (Float)warHLDao.heroHP.get(heroPos);
                     if (hp <= 0.0F) {
                        return 21003;
                     }
                  }

                  GameModelPool gameModelPool = this.player.getGameModelPool();
                  WarHLBattleModel battleModel = (WarHLBattleModel)gameModelPool.getEntity("warHLBattle", warHLDao.curFloor);
                  this.player.triggerTask(316, 0, (long)battleModel.getId(), 0);
                  this.player.getOperationMgr().addCopyLog(this.player, battleModel.getId(), "虎牢之战");
                  ConfigManager bean = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
                  String[] activityBuff = bean.getStr("warHLActivityBuff").split("\\|");
                  SpecialTaskActivityPart specialTaskActivityPart = (SpecialTaskActivityPart)this.player.getMgrPart(SpecialTaskActivityPart.class);
                  PlayerDao playerDao = this.player.getPlayerDao();
                  Map<Byte, ArrayingEntity> mirrorData = new HashMap();
                  mirrorData.put((byte)heroPos, arrayingEntity);
                  BattlePKTeam myPKTeam = new BattlePKTeam(this.player.getPlayerId(), playerDao.playerName, mirrorData, playerDao.lv, playerDao.head, playerDao.headFrame, 1, 0, 0, this.heroRankMgr.getHeroRankCompensate(mirrorData), 0);

                  for(Entity my : myPKTeam.getEntityMap().values()) {
                     for(int i = 0; i < warHLDao.buff.size(); ++i) {
                        this.addProperty(my, ((PropertyModel)warHLDao.buff.get(i)).getType(), ((PropertyModel)warHLDao.buff.get(i)).getWay(), ((PropertyModel)warHLDao.buff.get(i)).getValue());
                     }

                     if (specialTaskActivityPart.isActivityTime(1211)) {
                        this.addProperty(my, Integer.parseInt(activityBuff[0]), Integer.parseInt(activityBuff[1]), (long)Integer.parseInt(activityBuff[2]));
                     }

                     my.setBaseProperty(99, (long)((float)my.getBaseProperty(1) * hp));
                  }

                  myPKTeam.setSoulHeroId(soulHeroId);
                  battleDao.scene.addPKTeam((byte)0, myPKTeam);
                  BattlePKTeam enemyTeam = new BattlePKTeam((Integer)battleModel.getEnemies().get(fort - 1));
                  float enemyHpPer = (Float)warHLDao.enemyHP.getOrDefault(fort, 1.0F);

                  for(Entity enemy : enemyTeam.getEntityMap().values()) {
                     enemy.setBaseProperty(99, (long)((float)enemy.getBaseProperty(1) * enemyHpPer));
                  }

                  battleDao.scene.addPKTeam((byte)1, enemyTeam);
                  battleDao.scene.setMaxRound((byte)17);
                  return 1;
               }
            }
         } else {
            return 21000;
         }
      } else {
         return 21000;
      }
   }

   public void addProperty(Entity entity, int type, int way, long value) {
      if (way == 0) {
         entity.modifyBaseProperty(type, value);
      } else if (way == 1) {
         long oldValue = entity.getBaseProperty(type);
         long addValue = Double.valueOf((double)(oldValue * value) / (double)10000.0F).longValue();
         entity.modifyBaseProperty(type, addValue);
      }

   }

   public void afterFight(BattleDao battleDao) {
      int heroPos = (Integer)battleDao.params.get(0);
      int fort = (Integer)battleDao.params.get(1);
      WarHLDao warHLDao = this.getWarHLDao();
      BattlePKTeam myTeam = battleDao.scene.getPKTeam((byte)0);
      if (battleDao.scene.getWinForce() == 0) {
         warHLDao.passFort.add(fort);
         ++warHLDao.allPass;
         ConfigManager bean = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
         warHLDao.curPoint += bean.getIntDefault("BattleOfGuanduPionts", 5);
         warHLDao.heroPos = heroPos;
         this.updateWarRank(warHLDao.curFloor, warHLDao.curPoint);
         int activityPoint = ApplicationContextProvider.getConfigInt("BattleOfGuanduPionts", 0);
         SpecialTaskActivityPart specialTaskActivityPart = (SpecialTaskActivityPart)this.player.getMgrPart(SpecialTaskActivityPart.class);
         specialTaskActivityPart.addPoint(1211, activityPoint);
         this.player.triggerTask(317, 0, 1L, 1);

         for(Entity entity : myTeam.getEntityMap().values()) {
            this.player.triggerTask(523, entity.getId(), 1L, 1);
         }

         if (warHLDao.passFort.size() >= 5) {
            this.player.triggerTask(607, 0, 1L, 1);
         }

         this.player.getOperationMgr().addExtraLog(this.player, 189, "虎牢之战", warHLDao.curFloor + "", battleDao.modelId + "", "-", "是");
         this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "虎牢之战", "攻破据点-" + fort, "攻破据点-" + fort, 0, 0, 1);
      } else {
         BattlePKTeam pkTeam = battleDao.scene.getPKTeam((byte)1);

         for(Map.Entry<Byte, Entity> entry : pkTeam.getEntityMap().entrySet()) {
            Entity entity = (Entity)entry.getValue();
            long curHP = entity.getBaseProperty(99);
            long maxHP = entity.getBaseProperty(1);
            warHLDao.enemyHP.put(fort, (float)curHP * 1.0F / (float)maxHP);
         }

         warHLDao.heroPos = -1;
      }

      for(Map.Entry<Byte, Entity> entry : myTeam.getEntityMap().entrySet()) {
         Entity entity = (Entity)entry.getValue();
         long curHP = entity.getBaseProperty(99);
         long maxHP = entity.getBaseProperty(1);
         warHLDao.heroHP.put(((Byte)entry.getKey()).intValue(), (float)curHP * 1.0F / (float)maxHP);
      }

      warHLDao.updateOp();
   }

   public void endBattle(BattleDao battleDao) {
      int heroPos = (Integer)battleDao.params.get(0);
      int fort = (Integer)battleDao.params.get(1);
      WarHLDao warHLDao = this.getWarHLDao();
      if (warHLDao.heroHP.containsKey(heroPos)) {
         WarHLBattleModel battleModel = (WarHLBattleModel)this.player.getGameModelPool().getEntity("warHLBattle", warHLDao.curFloor);
         WarMsg.S2C_EnterHLBattle_8004.Builder tempDown = WarMsg.S2C_EnterHLBattle_8004.newBuilder();
         CommonMsg.MapDataIF.Builder enemyHp = CommonMsg.MapDataIF.newBuilder();
         if (battleDao.scene.getWinForce() == 0) {
            this.success(warHLDao, battleModel, tempDown, fort - 1);
            enemyHp.setKey(fort);
            enemyHp.setValue(0.0F);
         } else {
            enemyHp.setKey(fort);
            if (warHLDao.enemyHP.containsKey(fort)) {
               enemyHp.setValue((Float)warHLDao.enemyHP.get(fort));
            } else {
               enemyHp.setValue(1.0F);
            }
         }

         WarMsg.S2C_EnterHLBattle_8004.Builder down = WarMsg.S2C_EnterHLBattle_8004.newBuilder();
         down.setEnemyHp(enemyHp);
         CommonMsg.MapDataIF.Builder heroHp = CommonMsg.MapDataIF.newBuilder();
         heroHp.setKey(heroPos);
         heroHp.setValue((Float)warHLDao.heroHP.get(heroPos));
         down.setHeroHp(heroHp);
         down.setBattleFloor(warHLDao.curFloor);
         down.addAllPassFort(warHLDao.passFort);
         down.setHeroPos(warHLDao.heroPos);
         down.setItem(this.specialItemInfo(warHLDao));
         down.setFortSum(warHLDao.allPass);
         boolean openBox = false;
         WarMsg.S2C_OpenBoxResult_8030.Builder result = WarMsg.S2C_OpenBoxResult_8030.newBuilder();
         ConfigManager bean = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
         int limitStage = bean.getIntDefault("warHLAutoFinish", 100);
         int limitVip = bean.getIntDefault("warHLAutoFinishVip", 2);
         if ((warHLDao.lastMaxFloor >= limitStage || this.player.getPlayerDao().vip_lv >= limitVip) && battleDao.params.size() >= 3 && (Integer)battleDao.params.get(2) == 1) {
            openBox = this.autoFinishEvent(warHLDao, result);
         }

         for(HLEvent event : warHLDao.event.values()) {
            down.addEvents(event.builder());
         }

         this.player.sendMsg(down.build());
         if (openBox) {
            this.player.sendMsg(result.build());
         }

      }
   }

   @MsgHandlerAnno
   public void C2S_SweepStage_8031(WarMsg.C2S_SweepStage_8031 msg, String channelId) {
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      long power = configManager.getLongByDefault("warHLPowerNeed", 5000000L);
      if (this.player.getMaxPlayerCombatPower() < power) {
         this.player.failure(21026);
      } else {
         WarHLDao warHLDao = this.getWarHLDao();
         if (warHLDao.passFort.size() >= 5) {
            this.player.failure(21027);
         } else if (warHLDao.curFloor >= warHLDao.lastMaxFloor) {
            this.logger.info("虎牢关扫荡超出历史最大关卡！");
         } else {
            for(int fort = 1; fort <= 5; ++fort) {
               if (!warHLDao.passFort.contains(fort)) {
                  warHLDao.passFort.add(fort);
                  ++warHLDao.allPass;
                  warHLDao.curPoint += configManager.getIntDefault("BattleOfGuanduPionts", 5);
                  this.updateWarRank(warHLDao.curFloor, warHLDao.curPoint);
                  int activityPoint = ApplicationContextProvider.getConfigInt("BattleOfGuanduPionts", 0);
                  SpecialTaskActivityPart specialTaskActivityPart = (SpecialTaskActivityPart)this.player.getMgrPart(SpecialTaskActivityPart.class);
                  specialTaskActivityPart.addPoint(1211, activityPoint);
                  this.player.triggerTask(317, 0, 1L, 1);
                  WarHLBattleModel battleModel = (WarHLBattleModel)this.player.getGameModelPool().getEntity("warHLBattle", warHLDao.curFloor);
                  WarMsg.S2C_EnterHLBattle_8004.Builder tempDown = WarMsg.S2C_EnterHLBattle_8004.newBuilder();
                  this.success(warHLDao, battleModel, tempDown, fort - 1);
                  this.player.getOperationMgr().addExtraLog(this.player, 189, "虎牢之战扫荡", warHLDao.curFloor + "", fort + "", "-", "是");
                  this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "虎牢之战扫荡", "攻破据点-" + fort, "攻破据点-" + fort, 0, 0, 1);
               }
            }

            warHLDao.updateOp();
            boolean openBox = false;
            WarMsg.S2C_OpenBoxResult_8030.Builder result = WarMsg.S2C_OpenBoxResult_8030.newBuilder();
            ConfigManager bean = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
            int limitStage = bean.getIntDefault("warHLAutoFinish", 100);
            int limitVip = bean.getIntDefault("warHLAutoFinishVip", 2);
            if ((warHLDao.lastMaxFloor >= limitStage || this.player.getPlayerDao().vip_lv >= limitVip) && msg.hasAutoFinish() && msg.getAutoFinish()) {
               openBox = this.autoFinishEvent(warHLDao, result);
            }

            WarMsg.S2C_GetWarHLInfo_8002.Builder down = WarMsg.S2C_GetWarHLInfo_8002.newBuilder();
            down.setBattleFloor(warHLDao.curFloor);
            down.addAllPassFort(warHLDao.passFort);
            down.setItem(this.specialItemInfo(warHLDao));
            down.setHeroHp(this.heroHpInfo(warHLDao));

            for(HLEvent event : warHLDao.event.values()) {
               down.addEvents(event.builder());
            }

            down.setBuff(this.hlBuffInfo(warHLDao));
            down.setMarchShop(this.marchShopInfo(warHLDao));
            down.setTargetReward(this.targetRewardInfo(warHLDao));
            down.setHeroPos(warHLDao.heroPos);

            for(Map.Entry<Integer, Float> entry : warHLDao.enemyHP.entrySet()) {
               CommonMsg.MapDataIF.Builder enemyHp = CommonMsg.MapDataIF.newBuilder();
               enemyHp.setKey((Integer)entry.getKey());
               enemyHp.setValue((Float)entry.getValue());
               down.addEnemyHp(enemyHp);
            }

            down.addAllCrossFort(warHLDao.targetReward);
            down.setFortSum(warHLDao.allPass);
            long time = DateUtil.getSomeDayBeginTime(Long.parseLong(warHLDao.resetTime) * 1000L);
            down.setResetTime((int)((time + 172800000L) / 1000L));
            if (warHLDao.arraying == null || warHLDao.arraying.length == 0) {
               HeroArrayingPart mgrPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
               ArrayingMirror arrayingMirror = mgrPart.getArrayingMirrorByType(CommonMsg.HeroState.HERO_STATE_WAR_HL);
               if (arrayingMirror != null && !arrayingMirror.arrayingElementsMap.isEmpty() && this.checkHadHero(arrayingMirror)) {
                  warHLDao.arraying = arrayingMirror.toByteArray();
                  warHLDao.updateOp();
               }
            }

            if (warHLDao.arraying != null && warHLDao.arraying.length > 0) {
               ArrayingMirror arrayingMirror = ArrayingMirror.toArrayingMirror(warHLDao.arraying);

               for(ArrayingEntity value : arrayingMirror.arrayingElementsMap.values()) {
                  if (value.heroAndFriend()) {
                     down.addHero((CommonMsg.HeroInfo)value.toBuilder());
                  }
               }
            }

            if (warHLDao.lastMaxFloor == 0) {
               down.setMaxFloor(0);
            } else {
               down.setMaxFloor(warHLDao.lastMaxFloor);
            }

            this.player.sendMsg(down.build());
            this.player.triggerTask(607, 0, 1L, 1);
            if (openBox) {
               this.player.sendMsg(result.build());
            }

         }
      }
   }

   private void success(WarHLDao warHLDao, WarHLBattleModel battleModel, WarMsg.S2C_EnterHLBattle_8004.Builder down, int fort) {
      GameModelPool gameModelPool = this.player.getGameModelPool();
      Integer eventLib = (Integer)battleModel.getEvents().get(fort);
      WarHLEventLibModel libModel = (WarHLEventLibModel)gameModelPool.getEntity("warHLEventLib", eventLib);
      ConfigManager bean = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      String str = bean.getStr("warHLEnemyPos");
      int enemyPos = Integer.parseInt(str.split("\\|")[fort]);
      String str1 = bean.getStr("warHLEventPos");
      int maxPos = Integer.parseInt(str1.split("\\|")[fort]);
      int startPos = 1;
      if (fort != 0) {
         startPos = Integer.parseInt(str1.split("\\|")[fort - 1]) + 1;
      }

      List<Integer> posList = new ArrayList();

      for(int pos = startPos; pos <= maxPos; ++pos) {
         if (pos != enemyPos) {
            posList.add(pos);
         }
      }

      for(int i = 0; i < libModel.getEventLibs().size(); ++i) {
         if (posList.size() == 0) {
            return;
         }

         KeyValFun fun = (KeyValFun)libModel.getEventLibs().get(i);
         if (fun != null) {
            int randInt = RandomUtil.randTenThousand();
            if (randInt < fun.getVal()) {
               List<KeyValFun> rateList = new ArrayList();
               Map<Integer, WarHLEventsModel> map = gameModelPool.getMap("warHLEvent");

               for(WarHLEventsModel model : map.values()) {
                  if (model.getGroupId() == fun.getKey()) {
                     rateList.add(new KeyValFun(model.getId(), model.getPro()));
                  }
               }

               if (!rateList.isEmpty()) {
                  Collections.shuffle(posList);
                  int id = GamePlayer.countRate(rateList);
                  WarHLEventsModel model = (WarHLEventsModel)map.get(id);
                  this.createHLEvent(warHLDao, (Integer)posList.get(0), model, down);
                  posList.remove(0);
               }
            }
         }
      }

      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      giftPart.triggerTimeLimitGift(6, battleModel.getId());
   }

   private void createHLEvent(WarHLDao warHLDao, int pos, WarHLEventsModel eventsModel, WarMsg.S2C_EnterHLBattle_8004.Builder down) {
      HLEvent event = new HLEvent();
      event.eventId = eventsModel.getId();
      event.eventType = eventsModel.getType();
      switch (eventsModel.getType()) {
         case 10:
            event.rewards1.addAll(eventsModel.getReward1());
            this.player.addResource(eventsModel.getReward1(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 21, 2101, warHLDao.curFloor, eventsModel.getId(), String.valueOf(this.player.getPlayerId()));
            event.end = true;

            for(ResourceModel model : eventsModel.getReward1()) {
               warHLDao.addRewardRecord(model, 1);
            }
            break;
         case 20:
            event.rewards1.addAll(eventsModel.getReward1());
            event.rewards2.addAll(eventsModel.getReward2());
            this.addQuestion(event.question);
            break;
         case 21:
            event.rewards1.addAll(eventsModel.getReward1());

            for(int i = 0; i < 3; ++i) {
               this.addQuestion(event.question);
            }
            break;
         case 30:
            event.rewards1.addAll(eventsModel.getReward1());
            event.rewards2.addAll(eventsModel.getReward2());
            break;
         case 40:
            this.player.addResource(eventsModel.getReward1(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 21, 2101, warHLDao.curFloor, eventsModel.getId(), String.valueOf(this.player.getPlayerId()));
            event.end = true;
            break;
         case 41:
            this.player.addResource(eventsModel.getReward1(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 21, 2101, warHLDao.curFloor, eventsModel.getId(), String.valueOf(this.player.getPlayerId()));
            event.end = true;
            break;
         case 42:
            this.player.addResource(eventsModel.getReward1(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 21, 2101, warHLDao.curFloor, eventsModel.getId(), String.valueOf(this.player.getPlayerId()));
            event.end = true;
         case 50:
         case 80:
            break;
         case 60:
            while(event.goods.size() < 2) {
               HLGoods goods = this.createMarchGoods(warHLDao);
               if (event.goods.size() > 0) {
                  if (((HLGoods)event.goods.get(0)).item.getId() != goods.item.getId()) {
                     event.goods.add(goods);
                     warHLDao.shop.add(goods);
                  }
               } else {
                  event.goods.add(goods);
                  warHLDao.shop.add(goods);
               }
            }
            break;
         case 70:
            int buffId = this.addBuff(warHLDao);
            event.buffId = buffId;
            event.end = true;
            break;
         default:
            return;
      }

      event.pos = pos;
      if (warHLDao.event.containsKey(pos)) {
         this.logger.error("重复位置的事件，请检查事件位置配置与前面的逻辑!! pos:{}", pos);
      }

      warHLDao.event.put(pos, event);
      down.addEvents(event.builder());
   }

   public boolean autoFinishEvent(WarHLDao warHLDao, WarMsg.S2C_OpenBoxResult_8030.Builder result) {
      boolean openBox = false;
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      List<ResourceModel> rewardList = new ArrayList();

      for(Map.Entry<Integer, HLEvent> eventEntry : warHLDao.event.entrySet()) {
         HLEvent event = (HLEvent)eventEntry.getValue();
         if (!event.end) {
            switch (event.eventType) {
               case 20:
                  for(KeyValFun fun : event.question) {
                     WarHLQuestionLibModel questionModel = (WarHLQuestionLibModel)this.player.getGameModelPool().getEntity("warHLQuestionLib", fun.getKey());
                     if (questionModel != null) {
                        fun.setVal(questionModel.getTrueOption());
                     }
                  }

                  rewardList.addAll(event.rewards1);
                  event.end = true;
                  break;
               case 21:
                  for(int i = 0; i < 3; ++i) {
                     rewardList.addAll(event.rewards1);
                  }

                  for(KeyValFun fun : event.question) {
                     WarHLQuestionLibModel questionModel = (WarHLQuestionLibModel)this.player.getGameModelPool().getEntity("warHLQuestionLib", fun.getKey());
                     if (questionModel != null) {
                        fun.setVal(questionModel.getTrueOption());
                     }
                  }

                  event.end = true;
            }
         }
      }

      for(ResourceModel model : rewardList) {
         warHLDao.addRewardRecord(model, 1);
      }

      this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 21, 2101, warHLDao.curFloor, 0, String.valueOf(this.player.getPlayerId()));
      warHLDao.updateOp();
      return openBox;
   }

   private HLGoods createMarchGoods(WarHLDao warHLDao) {
      List<KeyValFun> rateList = new ArrayList();
      Map<Integer, WarHLGoodsModel> map = this.player.getGameModelPool().getMap("warHLGoods");

      for(WarHLGoodsModel model : map.values()) {
         rateList.add(new KeyValFun(model.getId(), model.getPro()));
      }

      int id = GamePlayer.countRate(rateList);
      WarHLGoodsModel goodsModel = (WarHLGoodsModel)map.get(id);
      HLGoods goods = new HLGoods(goodsModel);
      goods.index = warHLDao.shop.size();
      return goods;
   }

   private int addBuff(WarHLDao warHLDao) {
      int buffId = 0;
      List<KeyValFun> rateList = new ArrayList();
      Map<Integer, WarHLBuffModel> map = this.player.getGameModelPool().getMap("warHLBuff");

      for(WarHLBuffModel model : map.values()) {
         rateList.add(new KeyValFun(model.getId(), model.getPro()));
      }

      if (rateList.size() > 0) {
         buffId = GamePlayer.countRate(rateList);
         WarHLBuffModel warHLBuffModel = (WarHLBuffModel)map.get(buffId);

         for(PropertyModel buff : warHLBuffModel.getBuffs()) {
            warHLDao.addBuff(buff);
         }
      }

      return buffId;
   }

   private void addQuestion(List<KeyValFun> question) {
      List<KeyValFun> rateList = new ArrayList();
      Map<Integer, WarHLQuestionLibModel> map = this.player.getGameModelPool().getMap("warHLQuestionLib");

      for(WarHLQuestionLibModel model : map.values()) {
         boolean has = false;

         for(KeyValFun f : question) {
            if (model.getId() == f.getKey()) {
               has = true;
               break;
            }
         }

         if (!has) {
            rateList.add(new KeyValFun(model.getId(), model.getPro()));
         }
      }

      if (rateList.size() > 0) {
         KeyValFun fun = new KeyValFun();
         fun.setKey(GamePlayer.countRate(rateList));
         question.add(fun);
      }

   }

   @MsgHandlerAnno
   public void answerQuestion(WarMsg.C2S_Answer_8005 msg, String channelId) {
      WarHLDao warHLDao = this.getWarHLDao();
      if (!warHLDao.event.containsKey(msg.getEventPos())) {
         this.player.failure(21004);
      } else {
         HLEvent event = (HLEvent)warHLDao.event.get(msg.getEventPos());
         if (event != null && (event.eventType == 20 || event.eventType == 21)) {
            if (event.end) {
               this.player.failure(21004);
            } else if (msg.getQuestion() > event.question.size()) {
               this.player.failure(6);
            } else {
               if (event.eventType == 20) {
                  KeyValFun question = (KeyValFun)event.question.get(0);
                  if (question.getVal() != 0) {
                     this.player.failure(21004);
                     return;
                  }

                  question.setVal(msg.getAnswer());
                  WarHLQuestionLibModel questionModel = (WarHLQuestionLibModel)this.player.getGameModelPool().getEntity("warHLQuestionLib", question.getKey());
                  if (question.getVal() == questionModel.getTrueOption()) {
                     this.player.addResource(event.rewards1, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 21, 2101, warHLDao.curFloor, event.eventId, String.valueOf(this.player.getPlayerId()));

                     for(ResourceModel model : event.rewards1) {
                        warHLDao.addRewardRecord(model, 1);
                     }
                  } else {
                     this.player.addResource(event.rewards2, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 21, 2101, warHLDao.curFloor, event.eventId, String.valueOf(this.player.getPlayerId()));

                     for(ResourceModel model : event.rewards2) {
                        warHLDao.addRewardRecord(model, 1);
                     }
                  }

                  event.end = true;
               } else {
                  if (msg.getQuestion() > event.question.size()) {
                     return;
                  }

                  KeyValFun question = (KeyValFun)event.question.get(msg.getQuestion() - 1);
                  if (question.getVal() != 0) {
                     this.player.failure(21004);
                     return;
                  }

                  question.setVal(msg.getAnswer());
                  int answerNum = 0;
                  int trueCount = 0;

                  for(KeyValFun fun : event.question) {
                     WarHLQuestionLibModel model = (WarHLQuestionLibModel)this.player.getGameModelPool().getEntity("warHLQuestionLib", fun.getKey());
                     if (model.getTrueOption() == fun.getVal()) {
                        ++trueCount;
                     }

                     if (fun.getVal() > 0) {
                        ++answerNum;
                     }
                  }

                  if (answerNum >= 3) {
                     if (trueCount > 0) {
                        for(ResourceModel reward : event.rewards1) {
                           this.player.addResource(reward.getType(), reward.getId(), reward.getValue() * trueCount, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 21, 2101, warHLDao.curFloor, event.eventId, String.valueOf(this.player.getPlayerId()));
                           warHLDao.addRewardRecord(reward, trueCount);
                        }
                     } else {
                        for(ResourceModel reward : event.rewards2) {
                           this.player.addResource(reward.getType(), reward.getId(), reward.getValue(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 21, 2101, warHLDao.curFloor, event.eventId, String.valueOf(this.player.getPlayerId()));
                           warHLDao.addRewardRecord(reward, 1);
                        }
                     }

                     event.end = true;
                  }
               }

               warHLDao.updateOp();
               this.player.sendMsg(event.builder());
            }
         } else {
            this.player.failure(6);
         }
      }
   }

   @MsgHandlerAnno
   public void useCureAmulet(WarMsg.C2S_UseSpecialItemCure_8008 msg, String channelId) {
      int pos = msg.getHeroPos();
      WarHLDao warHLDao = this.getWarHLDao();
      if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_MEDICINE, 1)) {
         this.player.failure(21005);
      } else {
         ConfigManager bean = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
         SpecialTaskActivityPart specialTaskActivityPart = (SpecialTaskActivityPart)this.player.getMgrPart(SpecialTaskActivityPart.class);
         String[] userCountArr = bean.getStr("warHLCureCount").split(",");
         int useCount;
         if (specialTaskActivityPart.isActivityTime(1211)) {
            useCount = Integer.parseInt(userCountArr[1]);
         } else {
            useCount = Integer.parseInt(userCountArr[0]);
         }

         if (warHLDao.cureCount >= useCount) {
            this.player.failure(21006);
         } else {
            float hpPer = 1.0F;
            if (warHLDao.heroHP.containsKey(pos)) {
               hpPer = (Float)warHLDao.heroHP.get(pos);
            }

            if (hpPer >= 1.0F) {
               this.player.failure(21007);
            } else if (hpPer <= 0.0F) {
               this.player.failure(21003);
            } else {
               this.player.delResource(1, PlayerDefine.PLAYER_MEDICINE, 1L, 21, 2103, warHLDao.curFloor, 1, String.valueOf(this.player.getPlayerId()));
               ++warHLDao.cureCount;
               warHLDao.heroHP.put(pos, (float)Math.min((double)1.0F, (double)hpPer + (double)0.5F));
               WarMsg.S2C_UseSpecialItemCure_8009.Builder builder = WarMsg.S2C_UseSpecialItemCure_8009.newBuilder();

               for(Map.Entry<Integer, Float> entry : warHLDao.heroHP.entrySet()) {
                  CommonMsg.MapDataIF.Builder hp = CommonMsg.MapDataIF.newBuilder();
                  hp.setKey((Integer)entry.getKey());
                  hp.setValue((Float)entry.getValue());
                  builder.addHeroHp(hp);
               }

               builder.setUseCure(warHLDao.cureCount);
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void usePoison(WarMsg.C2S_UseSpecialItemPoison_8010 msg, String channelId) {
      int fort = msg.getFort();
      WarHLDao warHLDao = this.getWarHLDao();
      if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_POISON, 1)) {
         this.player.failure(21022);
      } else {
         ConfigManager bean = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
         int useCount = bean.getInt("warHLPoisonCount");
         if (warHLDao.poisonCount >= useCount) {
            this.player.failure(21022);
         } else {
            Float hp = 1.0F;
            if (warHLDao.enemyHP.containsKey(fort)) {
               hp = (Float)warHLDao.enemyHP.get(fort);
            } else {
               warHLDao.enemyHP.put(fort, 1.0F);
            }

            if (!(hp > 0.0F)) {
               this.player.failure(21001);
            } else {
               ++warHLDao.poisonCount;
               warHLDao.enemyHP.put(fort, 0.0F);
               warHLDao.passFort.add(fort);
               warHLDao.curPoint += bean.getIntDefault("BattleOfGuanduPionts", 5);
               ++warHLDao.allPass;
               this.player.delResource(1, PlayerDefine.PLAYER_POISON, 1L, 21, 2103, warHLDao.curFloor, 1, String.valueOf(this.player.getPlayerId()));
               WarHLBattleModel battleModel = (WarHLBattleModel)this.player.getGameModelPool().getEntity("warHLBattle", warHLDao.curFloor);
               WarMsg.S2C_EnterHLBattle_8004.Builder tempDown = WarMsg.S2C_EnterHLBattle_8004.newBuilder();
               this.success(warHLDao, battleModel, tempDown, fort - 1);
               boolean openBox = false;
               WarMsg.S2C_OpenBoxResult_8030.Builder result = WarMsg.S2C_OpenBoxResult_8030.newBuilder();
               int limitStage = bean.getIntDefault("warHLAutoFinish", 100);
               int limitVip = bean.getIntDefault("warHLAutoFinishVip", 2);
               if ((warHLDao.lastMaxFloor >= limitStage || this.player.getPlayerDao().vip_lv >= limitVip) && msg.hasAutoFinish() && msg.getAutoFinish()) {
                  openBox = this.autoFinishEvent(warHLDao, result);
               }

               WarMsg.S2C_EnterHLBattle_8004.Builder down = WarMsg.S2C_EnterHLBattle_8004.newBuilder();
               CommonMsg.MapDataIF.Builder enemyHp = CommonMsg.MapDataIF.newBuilder();
               enemyHp.setKey(fort);
               enemyHp.setValue(0.0F);
               down.setEnemyHp(enemyHp);
               CommonMsg.MapDataIF.Builder heroHp = CommonMsg.MapDataIF.newBuilder();
               heroHp.setKey(warHLDao.heroPos);
               if (warHLDao.heroHP.containsKey(warHLDao.heroPos)) {
                  heroHp.setValue((Float)warHLDao.heroHP.get(warHLDao.heroPos));
               } else {
                  heroHp.setValue(1.0F);
               }

               for(HLEvent event : warHLDao.event.values()) {
                  down.addEvents(event.builder());
               }

               down.setHeroHp(heroHp);
               down.setBattleFloor(warHLDao.curFloor);
               down.addAllPassFort(warHLDao.passFort);
               down.setItem(this.specialItemInfo(warHLDao));
               down.setHeroPos(warHLDao.heroPos);
               down.setFortSum(warHLDao.allPass);
               warHLDao.updateOp();
               this.player.sendMsg(down.build());
               this.updateWarRank(warHLDao.curFloor, warHLDao.curPoint);
               WarMsg.S2C_UsePoisonResult_8029.Builder resultBuilder = WarMsg.S2C_UsePoisonResult_8029.newBuilder();
               resultBuilder.setResult(1);
               this.player.sendMsg(resultBuilder.build());
               if (warHLDao.passFort.size() >= 5) {
                  this.player.triggerTask(607, 0, 1L, 1);
               }

               if (openBox) {
                  this.player.sendMsg(result.build());
               }

            }
         }
      }
   }

   @MsgHandlerAnno
   public void useShopMan(WarMsg.C2S_UseSpecialItemShopMan_8011 msg, String channelId) {
      WarHLDao warHLDao = this.getWarHLDao();
      if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_BUSINESSMAN, 1)) {
         this.player.failure(21023);
      } else {
         this.player.delResource(1, PlayerDefine.PLAYER_BUSINESSMAN, 1L, 21, 2103, warHLDao.curFloor, 1, String.valueOf(this.player.getPlayerId()));
         HLGoods marchGoods = this.createMarchGoods(warHLDao);
         warHLDao.shop.add(marchGoods);
         WarMsg.S2C_NewGoods_8012.Builder builder = WarMsg.S2C_NewGoods_8012.newBuilder();
         builder.setGoods(marchGoods.builder());
         warHLDao.updateOp();
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void getTargetReward(WarMsg.C2S_GetPassReward_8016 msg, String channelId) {
      int id = msg.getId();
      WarHLDao warHLDao = this.getWarHLDao();
      if (warHLDao.targetReward.contains(id)) {
         this.player.failure(21008);
      } else {
         WarHLTargetRewardModel model = (WarHLTargetRewardModel)this.player.getGameModelPool().getEntity("warHLTargetReward", id);
         if (model == null) {
            this.player.failure(6);
         } else if (model.getPass() > warHLDao.allPass) {
            this.player.failure(21009);
         } else {
            warHLDao.targetReward.add(id);
            warHLDao.updateOp();
            this.player.addResource(model.getReward(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 21, 2102, warHLDao.allPass, model.getPass(), String.valueOf(this.player.getPlayerId()));
            WarMsg.S2C_TargetReward_8017.Builder builder = WarMsg.S2C_TargetReward_8017.newBuilder();
            builder.addAllCrossFort(warHLDao.targetReward);
            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void openBox(WarMsg.C2S_OpenBox_8018 msg, String channelId) {
      int pos = msg.getPos();
      WarHLDao warHLDao = this.getWarHLDao();
      HLEvent event = (HLEvent)warHLDao.event.get(pos);
      if (event != null && !event.end && event.eventType == 30) {
         if (!this.player.checkResourceNum(event.rewards2)) {
            this.player.failure(21005);
         } else {
            this.player.delResource((List)event.rewards2, 21, 2101, warHLDao.curFloor, event.eventType, String.valueOf(this.player.getPlayerId()));
            event.end = true;
            ResourceModel reward = (ResourceModel)event.rewards1.get(RandomUtil.randInt(0, event.rewards1.size()));
            warHLDao.addRewardRecord(reward, 1);
            this.player.addResource(reward, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 21, 2101, warHLDao.curFloor, event.eventType, String.valueOf(this.player.getPlayerId()));
            warHLDao.updateOp();
            this.player.sendMsg(event.builder());
            WarMsg.S2C_OpenBoxResult_8030.Builder result = WarMsg.S2C_OpenBoxResult_8030.newBuilder();
            result.setEventPos(msg.getPos());
            CommonMsg.ItemInfo.Builder info_builder = CommonMsg.ItemInfo.newBuilder();
            info_builder.setType(reward.getType());
            info_builder.setId(reward.getId());
            info_builder.setNum(reward.getValue());
            result.setReward(info_builder);
            this.player.sendMsg(result.build());
         }
      } else {
         this.player.failure(6);
      }
   }

   @MsgHandlerAnno
   public void enterNextFloor(WarMsg.C2S_EnterNextFloor_8019 msg, String channelId) {
      WarHLDao warHLDao = this.getWarHLDao();
      int curFloor = warHLDao.curFloor;
      Map<Integer, WarHLBattleModel> battleModelMap = this.player.getGameModelPool().getMap("warHLBattle");
      WarHLBattleModel model = (WarHLBattleModel)battleModelMap.get(curFloor);
      if (!battleModelMap.containsKey(curFloor + 1)) {
         this.player.failure(21012);
      } else {
         Set<Integer> tempSet = new HashSet();
         tempSet.addAll(warHLDao.passFort);
         if (tempSet.size() < model.getEnemies().size()) {
            this.player.failure(21009);
         } else {
            WarMsg.S2C_AllRewards_8020.Builder builder = WarMsg.S2C_AllRewards_8020.newBuilder();

            for(ResourceModel resourceModel : warHLDao.allReward) {
               builder.addReward(resourceModel.builder());
            }

            warHLDao.nextFloor();
            this.player.sendMsg(builder.build());
            this.updateWarRank(warHLDao.curFloor, warHLDao.curPoint);
            this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "虎牢之战", "通关", "通关", 0, 0, 1);
         }
      }
   }

   @MsgHandlerAnno
   public void buyCurePoison(WarMsg.C2S_BuyPoison_8015 msg, String channelId) {
      int num = msg.getNum();
      ConfigManager bean = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      String str = bean.getStr("warHLBuyPoisonCost");
      String[] split = str.split("\\|");
      int type = Integer.parseInt(split[0]);
      int id = Integer.parseInt(split[1]);
      int value = Integer.parseInt(split[2]) * num;
      if (!ResourceModel.checkTotalNumError(Integer.parseInt(split[2]), num)) {
         if (!this.player.checkResourceNum(type, id, value)) {
            this.player.failure(21010);
         } else {
            WarHLDao warHLDao = this.getWarHLDao();
            this.player.delResource(type, id, (long)value, 21, 2103, warHLDao.curFloor, num, String.valueOf(this.player.getPlayerId()));
            this.player.addResource(1, PlayerDefine.PLAYER_POISON, 1, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 21, 2103, warHLDao.curFloor, 1, String.valueOf(this.player.getPlayerId()));
            this.player.sendMsg(this.specialItemInfo(warHLDao));
         }
      }
   }

   @MsgHandlerAnno
   public void changePlayedHero(WarMsg.C2S_ChangePlayedHero_8021 msg, String channelId) {
      int heroPos = msg.getHeroPos();
      WarHLDao warHLDao = this.getWarHLDao();
      Float hp = 1.0F;
      if (warHLDao.heroHP.containsKey(heroPos)) {
         hp = (Float)warHLDao.heroHP.get(heroPos);
      }

      if (hp <= 0.0F) {
         this.player.failure(21003);
      } else if (warHLDao.arraying != null && warHLDao.arraying.length > 0) {
         ArrayingMirror arrayingMirror = ArrayingMirror.toArrayingMirror(warHLDao.arraying);
         ArrayingEntity arrayingEntity = (ArrayingEntity)arrayingMirror.arrayingElementsMap.get((byte)heroPos);
         if (!arrayingEntity.heroAndFriend()) {
            this.player.failure(21011);
         } else {
            warHLDao.heroPos = heroPos;
            warHLDao.updateOp();
            this.player.sendMsg(WarMsg.S2C_ChangePlayedHero_8022.newBuilder().setHeroPos(warHLDao.heroPos).build());
         }
      } else {
         this.player.failure(21000);
      }
   }

   @MsgHandlerAnno
   public void luckyGambling(WarMsg.C2S_LuckyGambling_8023 msg, String channelId) {
      int luckyId = msg.getLuckyId();
      WarHLDao warHLDao = this.getWarHLDao();
      if (warHLDao.event.containsKey(msg.getEventPos()) && ((HLEvent)warHLDao.event.get(msg.getEventPos())).eventType == 50) {
         if (((HLEvent)warHLDao.event.get(msg.getEventPos())).end) {
            this.player.failure(21013);
         } else {
            WarHLLuckyRewardModel model = (WarHLLuckyRewardModel)this.player.getGameModelPool().getEntity("warHLLuckyReward", luckyId);
            if (model == null) {
               this.player.failure(6);
            } else {
               List<ResourceModel> need = new ArrayList();
               need.addAll(model.getNeed());
               if (!this.player.checkResourceNum(need)) {
                  this.player.failure(21010);
               } else {
                  this.player.delResource((List)need, 21, 2104, luckyId, 0, String.valueOf(this.player.getPlayerId()));
                  List<KeyValFun> mul = model.getMul();
                  int rate = GamePlayer.countRate(mul);

                  for(ResourceModel reward : need) {
                     int realRate = rate * 10 / 10000;
                     int num = reward.getValue() * realRate / 10;
                     this.player.addResource(reward.getType(), reward.getId(), num, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 21, 2104, luckyId, rate, String.valueOf(this.player.getPlayerId()));
                     ResourceModel realModel = new ResourceModel(reward.getType(), reward.getId(), num);
                     warHLDao.addRewardRecord(realModel, 1);
                  }

                  ((HLEvent)warHLDao.event.get(msg.getEventPos())).end = true;
                  warHLDao.updateOp();
                  this.player.triggerTask(330, rate, 1L, 1);
                  WarMsg.S2C_LuckyGambling_8024.Builder builder = WarMsg.S2C_LuckyGambling_8024.newBuilder();
                  builder.setEventPos(msg.getEventPos());
                  builder.setLuckId(msg.getLuckyId());
                  this.player.sendMsg(builder.setRewardRate(rate).build());
               }
            }
         }
      } else {
         this.player.failure(21013);
      }
   }

   @MsgHandlerAnno
   public void C2S_BuyMarchShopGoods_8013(WarMsg.C2S_BuyMarchShopGoods_8013 msg, String channelId) {
      this.logger.info("购买商品index：{}", msg.getIndex());
      WarHLDao warHLDao = this.getWarHLDao();
      boolean flag = false;

      for(int i = 0; i < warHLDao.shop.size(); ++i) {
         HLGoods goods = (HLGoods)warHLDao.shop.get(i);
         if (goods.index == msg.getIndex()) {
            if (!this.player.checkResourceNum(goods.cost)) {
               this.player.failure(21015);
               return;
            }

            if (goods.bought) {
               this.player.failure(21017);
               return;
            }

            this.player.delResource(goods.cost, 21, 2112, 0, 0, "");
            this.player.addResource(goods.item, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 21, 2113, 0, 0, "");
            goods.bought = true;
            WarMsg.S2C_BuyMarchShopGoods_8014.Builder builder = WarMsg.S2C_BuyMarchShopGoods_8014.newBuilder();
            builder.setGoods(goods.builder());
            this.player.sendMsg(builder.build());
            flag = true;
            break;
         }
      }

      if (flag) {
         warHLDao.updateOp();
      } else {
         this.player.failure(21016);
      }
   }

   @MsgHandlerAnno
   public void C2S_ReceiveBoxKey_8027(WarMsg.C2S_ReceiveBoxKey_8027 msg, String channelId) {
      int eventPos = msg.getEventPos();
      WarHLDao warHLDao = this.getWarHLDao();
      if (warHLDao.event.containsKey(eventPos) && ((HLEvent)warHLDao.event.get(eventPos)).eventType == 80) {
         if (((HLEvent)warHLDao.event.get(eventPos)).end) {
            this.player.failure(21021);
         } else {
            Map<Integer, WarHLEventsModel> map = this.player.getGameModelPool().getMap("warHLEvent");

            for(WarHLEventsModel model : map.values()) {
               if (model.getType() == 80) {
                  this.player.addResource(model.getReward1(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 21, 2101, warHLDao.curFloor, model.getId(), String.valueOf(this.player.getPlayerId()));
                  break;
               }
            }

            ((HLEvent)warHLDao.event.get(eventPos)).end = true;
            warHLDao.updateOp();
            WarMsg.S2C_ReceiveBoxKey_8028.Builder builder = WarMsg.S2C_ReceiveBoxKey_8028.newBuilder();
            builder.setEventPos(eventPos);
            this.player.sendMsg(builder.build());
         }
      } else {
         this.player.failure(21021);
      }
   }

   @MsgHandlerAnno
   public void warHLRank(WarMsg.C2S_WarHLRank_8025 msg, String channelId) {
      RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
      RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
      int myRank = rankPart.getRank(RankDefine.RankModule.WAR_HL_FLOOR);
      WarMsg.S2C_WarHLRankResult_8026.Builder builder = WarMsg.S2C_WarHLRankResult_8026.newBuilder();
      PlayerPublicDao playerDao = this.player.getPublicDao();
      WarMsg.RankInfo.Builder myInfo = WarMsg.RankInfo.newBuilder();
      myInfo.setRank(myRank);
      myInfo.setPlayerId(this.player.getPlayerId());
      myInfo.setLv(playerDao.lv);
      myInfo.setName(playerDao.playerName);
      myInfo.setHead(playerDao.head);
      WarHLDao warHLDao = this.getWarHLDao();
      myInfo.setMaxFloor(warHLDao.curFloor);
      myInfo.setPoint(warHLDao.curPoint);
      myInfo.setServerId(this.player.getServerId());
      builder.setMyRank(myInfo);
      WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);

      for(RankData data : rankMgr.getRanks(RankDefine.RankModule.WAR_HL_FLOOR, 100)) {
         GamePlayer rankPlayer = worldMgr.getPlayerById(data.value);
         if (rankPlayer != null) {
            PlayerPublicDao rankPlayerDao = rankPlayer.getPublicDao();
            WarMsg.RankInfo.Builder info_builder = WarMsg.RankInfo.newBuilder();
            info_builder.setRank(data.rank);
            info_builder.setPlayerId(data.value);
            info_builder.setLv(rankPlayerDao.lv);
            info_builder.setName(rankPlayerDao.playerName);
            info_builder.setHead(rankPlayerDao.head);
            int score = (int)data.score;
            info_builder.setMaxFloor(MiscUtil.getIntHiParam(score));
            info_builder.setPoint(MiscUtil.getIntLowParam(score));
            info_builder.setServerId(rankPlayer.getServerId());
            builder.addInfos(info_builder);
         }
      }

      this.player.sendMsg(builder.build());
   }

   public void resetDaily() {
      WarHLDao warHLDao = (WarHLDao)this.player.getData("tb_war_hl", this.player.getPlayerId());
      boolean arrayingReset = warHLDao.resetTwoDay();
      if (arrayingReset) {
         HeroMsg.S2C_HeroBaseData_5002.Builder result_builder = HeroMsg.S2C_HeroBaseData_5002.newBuilder();
         HeroArrayingPart mgrPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         HeroArrayingDao arrayingDao = mgrPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_WAR_HL);
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
                     if (heroDao != null && heroDao.containState(CommonMsg.HeroState.HERO_STATE_WAR_HL.getNumber())) {
                        heroDao.delState(CommonMsg.HeroState.HERO_STATE_WAR_HL.getNumber());
                        heroDao.updateOp();
                        result_builder.addHeros(heroDao.toHeroInfo());
                     }
               }
            }

            arrayingDao.soulHeroCode = 0;
            arrayingDao.elements.clear();
            arrayingDao.updateOp();
            this.player.sendMsg(result_builder.build());
            HeroMsg.S2C_HeroArrayingResult_5016.Builder builder = HeroMsg.S2C_HeroArrayingResult_5016.newBuilder();
            builder.setArrayingType(CommonMsg.HeroState.HERO_STATE_WAR_HL);
            builder.setResult(1);
            this.player.sendMsg(builder.build());
         }

         this.updateWarRank(warHLDao.curFloor, warHLDao.curPoint);
      }

   }

   public void updateWarRank(int curFloor, int curPoint) {
      int score = MiscUtil.comboShort((short)curFloor, (short)curPoint);
      RankMgr rankMgr = (RankMgr)ApplicationContextProvider.getContext().getBean(RankMgr.class);
      rankMgr.pushTaskEx("updateRankHigherEx", new Object[]{RankDefine.RankModule.WAR_HL_FLOOR, score, this.player.getPlayerId()});
   }

   public void gmOp(String gmOp) {
      String[] op = gmOp.split(",");
      if (Integer.parseInt(op[0]) == 1) {
         WarHLDao warHLDao = this.getWarHLDao();
         warHLDao.curFloor = Integer.parseInt(op[1]);
      } else if (Integer.parseInt(op[0]) == 2) {
         WarHLDao warHLDao = this.getWarHLDao();
         warHLDao.gmReset();
         HeroMsg.S2C_HeroBaseData_5002.Builder result_builder = HeroMsg.S2C_HeroBaseData_5002.newBuilder();
         HeroArrayingPart mgrPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         HeroArrayingDao arrayingDao = mgrPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_WAR_HL);
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
                     if (heroDao != null && heroDao.containState(CommonMsg.HeroState.HERO_STATE_WAR_HL.getNumber())) {
                        heroDao.delState(CommonMsg.HeroState.HERO_STATE_WAR_HL.getNumber());
                        heroDao.updateOp();
                        result_builder.addHeros(heroDao.toHeroInfo());
                     }
               }
            }

            arrayingDao.soulHeroCode = 0;
            arrayingDao.elements.clear();
            arrayingDao.updateOp();
            this.player.sendMsg(result_builder.build());
            HeroMsg.S2C_HeroArrayingResult_5016.Builder builder = HeroMsg.S2C_HeroArrayingResult_5016.newBuilder();
            builder.setArrayingType(CommonMsg.HeroState.HERO_STATE_WAR_HL);
            builder.setResult(1);
            this.player.sendMsg(builder.build());
         }

         this.updateWarRank(warHLDao.curFloor, warHLDao.curPoint);
      }

   }
}
