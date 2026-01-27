package com.gzbz.war.ancientSword;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.google.protobuf.ByteString;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.AncientSwordDao;
import com.gzbz.db.BattleDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.AncientSwordBattleAwardModel;
import com.gzbz.model.AncientSwordBattleModel;
import com.gzbz.model.AncientSwordBuffModel;
import com.gzbz.model.AncientSwordMonthAwardModel;
import com.gzbz.model.AncientSwordRandomWeaponModel;
import com.gzbz.model.AncientSwordRobotModel;
import com.gzbz.model.AncientSwordTokenModel;
import com.gzbz.model.AncientSwordTokenTaskModel;
import com.gzbz.model.BattleModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.AncientSwordMsg;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.AncientSwordBountyTaskPart;
import com.gzbz.task.AncientSwordTokenTaskPart;
import com.gzbz.util.TempUtil;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import misc.DateUtil;
import misc.JsonUtil;
import net.CrossSubscribeMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class AncientSwordPart extends PlayerPart {
   @Autowired
   private CrossNettyClient crossNettyClient;
   @Autowired
   private ConfigManager configManager;
   @Autowired
   private WorldMgr worldMgr;
   public static final int DAY_MONSTER = 1;
   public static final int WEEK_MONSTER = 2;

   @MsgHandlerAnno
   public void C2S_AncientSwordMain_24601(AncientSwordMsg.C2S_AncientSwordMain_24601 msg, String source) {
      if (!this.player.isSystemOpen(6620)) {
         this.player.failure(21);
      } else {
         AncientSwordDao dao = this.getDao();
         if (dao.failKey > 0) {
            dao.failKey = 0;
            dao.failRewardId = 0;
            dao.updateOp();
         }

         this.initialMonster();
         this.overtimeHandle();
         AncientSwordMsg.S2C_AncientSwordMain_24602.Builder builder = AncientSwordMsg.S2C_AncientSwordMain_24602.newBuilder();
         builder.setGas(dao.gas);
         builder.setHasUnlock(dao.hasUnlock);
         builder.setFlushTime(dao.flushTime);
         builder.setShopCountdown(Math.max(DateUtil.getIntTime(dao.shopDeadline - System.currentTimeMillis()), 0));
         builder.addAllBuffId(dao.buffs);
         builder.setActiveValue(dao.activeValue);
         builder.addAllActiveReward(dao.activeRewards);
         builder.setTaskEnd(DateUtil.getIntTime(DateUtil.getWeekStartTime()));
         if (dao.activeEnd == 0) {
            dao.activeEnd = DateUtil.getIntTime(DateUtil.getWeekStartTime() + 1814400000L);
            dao.updateOp();
         }

         builder.setActiveEnd(dao.activeEnd);
         dao.dayMonsterMap.values().forEach((m) -> builder.addDayM(m.toBuild()));
         dao.weekMonsterMap.values().forEach((m) -> builder.addWeekM(m.toBuild()));
         AncientSwordBountyTaskPart part = (AncientSwordBountyTaskPart)this.player.getMgrPart(AncientSwordBountyTaskPart.class);
         builder.addAllBountyTask(part.buildTasks((List)null, true));
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_AncientSwordGetSword_24603(AncientSwordMsg.C2S_AncientSwordGetSword_24603 msg, String source) {
      AncientSwordDao dao = this.getDao();
      int ancientSwordGasNum = this.configManager.getIntDefault("AncientSwordGasNum", 1000);
      if (dao.gas < ancientSwordGasNum) {
         this.player.failure(6);
      } else {
         Map<String, Integer> weightMap = new HashMap();
         String ancientSwordGasWeapon = this.configManager.getStrByDefault("AncientSwordGasWeapon", "2|1|6750,3|1|2500,4|1|750");

         for(String configStr : ancientSwordGasWeapon.split(",")) {
            String[] config = configStr.split("\\|");
            int i = 0;

            while(i < config.length) {
               int groupId = Integer.parseInt(config[i++]);
               int num = Integer.parseInt(config[i++]);
               int weight = Integer.parseInt(config[i++]);
               weightMap.put(groupId + "," + num, weight);
            }
         }

         String oneForMap = (String)TempUtil.getOneForMap(weightMap);
         if (oneForMap == null) {
            this.player.failure(37);
         } else {
            List<ResourceModel> rewards = new ArrayList();
            String[] groupNum = oneForMap.split(",");
            int groupId = Integer.parseInt(groupNum[0]);
            int num = Integer.parseInt(groupNum[1]);
            Map<AncientSwordRandomWeaponModel, Integer> weaponMap = (Map)ApplicationContextProvider.getModelPoolEntity("cAncientSwordRandomWeapon", groupId);

            for(AncientSwordRandomWeaponModel model : TempUtil.getLotForMap(weaponMap, num, true)) {
               rewards.addAll(model.getRewards());
            }

            if (CollectionUtils.isEmpty(rewards)) {
               this.player.failure(55005);
            } else {
               dao.gas -= ancientSwordGasNum;
               dao.hasUnlock = true;
               dao.updateOp();
               this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_ANCIENT, 147, 14703, 0, 0, "");
               this.player.sendMsg(AncientSwordMsg.S2C_AncientSwordGetSword_24604.newBuilder().setSchedule(dao.gas).setHasGet(dao.hasUnlock).build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_AncientSwordFlush_24605(AncientSwordMsg.C2S_AncientSwordFlush_24605 msg, String source) {
      AncientSwordDao dao = this.getDao();
      AncientSwordDao.MonsterData monsterData = (AncientSwordDao.MonsterData)dao.weekMonsterMap.get(msg.getDirectFlush() ? dao.flushM : msg.getKey());
      if (monsterData != null && dao.flushTime > 0) {
         Map<Integer, AncientSwordBattleModel> battleMap = ApplicationContextProvider.<Integer, AncientSwordBattleModel>getModelPoolMap("AncientSwordBattle");
         Map<AncientSwordBattleModel, Integer> weightMap = (Map)battleMap.values().stream().filter((model) -> model.getType() == 2).collect(Collectors.toMap(Function.identity(), AncientSwordBattleModel::getRenovateWeight));
         AncientSwordBattleModel randomModel = (AncientSwordBattleModel)TempUtil.getOneForMap(weightMap);
         if (randomModel == null) {
            this.player.failure(6);
         } else {
            dao.flushM = monsterData.key;
            dao.updateOp();
            long powerBound = this.configManager.getLongByDefault("AncientSwordPlayerPower", 10000000L);
            if (this.player.getMaxPlayerCombatPower() >= powerBound && !msg.getDirectFlush()) {
               this.noticeCrossBorn(Collections.singletonList(randomModel.getId()), AncientSwordMsg.CrossStatus.FLUSH_WEEK_MONSTER);
            } else {
               AncientSwordDao.MonsterData robot = this.getRobot(randomModel.getId());
               if (robot != null) {
                  dao.receiveList.add(robot);
                  robot.index = dao.removeMonster(monsterData.key);
                  robot.monsterId = randomModel.getId();
                  --dao.flushTime;
                  dao.flushM = 0;
                  dao.updateOp();
                  this.saveMonster();
               }
            }

         }
      } else {
         this.logger.info("客户端请求刷新远古剑冢周怪，但参数不对或列表为空, 列表内怪物数: {}, 请求参数: DirectFlush {}, flushM {}, key {}", new Object[]{dao.weekMonsterMap.size(), msg.getDirectFlush(), dao.flushM, msg.getKey()});
      }
   }

   @MsgHandlerAnno
   public void C2S_AncientSwordCommitTask_24607(AncientSwordMsg.C2S_AncientSwordCommitTask_24607 msg, String source) {
      AncientSwordBountyTaskPart part = (AncientSwordBountyTaskPart)this.player.getMgrPart(AncientSwordBountyTaskPart.class);
      part.commitTask(msg.getTaskId(), false);
   }

   @MsgHandlerAnno
   public void C2S_AncientSwordClear_24609(AncientSwordMsg.C2S_AncientSwordClear_24609 msg, String source) {
      AncientSwordDao dao = this.getDao();
      int failKey = dao.failKey;
      if (!dao.dayMonsterMap.containsKey(failKey)) {
         this.player.failure(6);
      } else {
         if (msg.getClear()) {
            AncientSwordDao.MonsterData monsterData = (AncientSwordDao.MonsterData)dao.dayMonsterMap.get(failKey);
            if (monsterData != null) {
               this.battleHandel(Collections.singletonList(monsterData), 1);
            }
         }

         dao.failKey = 0;
         dao.failRewardId = 0;
         dao.updateOp();
         this.player.sendMsg(AncientSwordMsg.S2C_AncientSwordClear_24610.newBuilder().setClear(msg.getClear()).build());
      }
   }

   @MsgHandlerAnno
   public void C2S_AncientSwordTokenMain_24611(AncientSwordMsg.C2S_AncientSwordTokenMain_24611 msg, String source) {
      AncientSwordDao dao = this.getDao();
      AncientSwordMsg.S2C_AncientSwordTokenMain_24612.Builder builder = AncientSwordMsg.S2C_AncientSwordTokenMain_24612.newBuilder();
      builder.setIntegral(dao.level);
      builder.setLevel(dao.integral);
      builder.setVIP(dao.VIP);
      builder.setBuyLv(dao.buyLevel);
      builder.setBuyIntegral(dao.buyIntegral);
      builder.setStartTime(0L);
      builder.setEndTime(0L);
      AncientSwordTokenTaskPart tokenTaskPart = (AncientSwordTokenTaskPart)this.player.getMgrPart(AncientSwordTokenTaskPart.class);

      for(TaskData taskData : tokenTaskPart.getTasksMap().values()) {
         AncientSwordTokenTaskModel model = (AncientSwordTokenTaskModel)ApplicationContextProvider.getModelPoolEntity("AncientSwordTokenTask", taskData.id);
         if (model.getType() == 1) {
            builder.addDayTask(tokenTaskPart.buildTask(taskData));
         } else if (model.getType() == 2) {
            builder.addWeekTask(tokenTaskPart.buildTask(taskData));
         } else if (model.getType() == 3) {
            builder.addMonthTask(tokenTaskPart.buildTask(taskData));
         }
      }

      builder.setDayReset(DateUtil.getSomeDayEndTime(System.currentTimeMillis()));
      builder.setWeekReset(DateUtil.getWeekStartTime());
      builder.setMonthReset(0L);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_AncientSwordCommitTask_24613(AncientSwordMsg.C2S_AncientSwordCommitTask_24613 msg, String source) {
      AncientSwordTokenTaskPart part = (AncientSwordTokenTaskPart)this.player.getMgrPart(AncientSwordTokenTaskPart.class);
      part.commit(msg.getTaskId());
   }

   @MsgHandlerAnno
   public void C2S_AncientSwordTokenBuy_24615(AncientSwordMsg.C2S_AncientSwordTokenBuy_24615 msg, String source) {
      if (!this.player.isSystemOpen(6620)) {
         this.player.failure(21);
      } else {
         int type = msg.getType();
         int count = msg.getCount();
         if (count <= 0) {
            this.player.failure(4);
         } else {
            AncientSwordDao dao = this.getDao();
            if (!dao.VIP) {
               this.player.failure(0);
            } else {
               String consume;
               if (type == 0) {
                  if (dao.buyLevel + count >= this.configManager.getIntDefault("等级", 40)) {
                     this.player.failure(25);
                     return;
                  }

                  consume = this.configManager.getStrByDefault("买等级消耗", "1|9|10");
               } else {
                  if (type != 1) {
                     this.player.failure(6);
                     return;
                  }

                  if (dao.buyIntegral + count >= this.configManager.getIntDefault("积分", 4000)) {
                     this.player.failure(25);
                     return;
                  }

                  consume = this.configManager.getStrByDefault("买积分消耗", "1|9|10");
               }

               ResourceModel resourceModel = ResourceModel.buildResource(consume);
               resourceModel.setValue(resourceModel.getValue() * count);
               if (!this.player.checkResourceNum(resourceModel)) {
                  this.player.failure(3);
               } else {
                  this.player.delResource(resourceModel, 147, 14706, type, count, "");
                  this.tokenSendReward(type == 0 ? count : 0, type == 1 ? count : 0, false);
                  this.C2S_AncientSwordTokenMain_24611(AncientSwordMsg.C2S_AncientSwordTokenMain_24611.newBuilder().build(), (String)null);
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void CR2S_AncientSwordBornMonster_24617(AncientSwordMsg.CR2S_AncientSwordBornMonster_24617 msg, CrossSubscribeMsg crossSubscribeMsg) {
      AncientSwordMsg.S2S_AncientSwordGetMonster_24618.Builder builder = AncientSwordMsg.S2S_AncientSwordGetMonster_24618.newBuilder();
      ArrayingMirror arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
      builder.setStatus(msg.getStatus()).setMonster(AncientSwordMsg.AncientMonster.newBuilder().setId(msg.getMonsterId()).setKey(this.player.getPlayerId()).setLv(this.player.getPlayerDao().lv).setName(this.player.getPlayerDao().playerName).setPower(arrayingMirror.power).setArray(ByteString.copyFrom(arrayingMirror.toByteArray())));
      this.crossNettyClient.send2Server(this.player.getServerId(), this.player.getPlayerId(), msg.getDestServerId(), msg.getDestPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void S2S_AncientSwordGetMonster_24618(AncientSwordMsg.S2S_AncientSwordGetMonster_24618 msg, CrossSubscribeMsg crossSubscribeMsg) {
      AncientSwordMsg.AncientMonster monster = msg.getMonster();
      AncientSwordMsg.CrossStatus status = msg.getStatus();
      AncientSwordDao dao = this.getDao();
      if (dao.getMonster(monster.getKey()) != null) {
         this.noticeCrossBorn(Collections.singletonList(monster.getId()), status);
      } else {
         AncientSwordBattleModel battleModel = (AncientSwordBattleModel)ApplicationContextProvider.getModelPoolEntity("AncientSwordBattle", monster.getId());
         if (battleModel != null) {
            AncientSwordDao.MonsterData addM = new AncientSwordDao.MonsterData();
            addM.key = monster.getKey();
            addM.lv = monster.getLv();
            addM.name = monster.getName();
            addM.power = monster.getPower();
            addM.arrayingData = monster.getArray().toByteArray();
            if (status == AncientSwordMsg.CrossStatus.FLUSH_WEEK_MONSTER) {
               if (dao.flushTime <= 0) {
                  this.player.failure(6);
                  this.logger.info("S2S_AncientSwordGetMonster_24618 玩家 {} 无刷新次数了", this.player.getPlayerId());
                  return;
               }

               addM.index = dao.removeMonster(dao.flushM);
               if (addM.index == -1) {
                  this.logger.info("S2S_AncientSwordGetMonster_24618 from query_player {} BUT removeMonster fail!", this.player.getPlayerId());
               } else {
                  addM.monsterId = battleModel.getId();
                  --dao.flushTime;
                  dao.flushM = 0;
                  dao.receiveList.add(addM);
                  this.saveMonster();
               }
            } else {
               dao.receiveList.add(addM);
            }

            dao.updateOp();
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_AncientSwordClean_24619(AncientSwordMsg.C2S_AncientSwordClean_24619 msg, String source) {
      if (!this.player.isSystemOpen(6620)) {
         this.player.failure(21);
      } else {
         AncientSwordDao dao = this.getDao();
         if (!dao.hasUnlock) {
            this.player.failure(9031);
         } else if (CollectionUtils.isEmpty(dao.dayMonsterMap)) {
            this.player.failure(9031);
         } else {
            this.battleHandel(dao.dayMonsterMap.values(), 0);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_AncientSwordGetActive_24620(AncientSwordMsg.C2S_AncientSwordGetActive_24620 msg, String source) {
      if (!this.player.isSystemOpen(6620)) {
         this.player.failure(21);
      } else {
         int id = msg.getId();
         AncientSwordDao dao = this.getDao();
         if (dao.activeRewards.contains(id)) {
            this.player.failure(76030);
         } else {
            AncientSwordMonthAwardModel model = (AncientSwordMonthAwardModel)ApplicationContextProvider.getModelPoolEntity("AncientSwordMonthAward", id);
            if (model == null) {
               this.player.failure(37);
            } else {
               dao.activeRewards.add(id);
               dao.updateOp();
               this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 147, 14707, id, 0, "");
               this.player.sendMsg(AncientSwordMsg.S2C_AncientSwordGetActive_24621.newBuilder().setId(id).build());
            }
         }
      }
   }

   public int enterBattle(BattleDao battleDao) {
      if (!this.player.isSystemOpen(6620)) {
         return 21;
      } else {
         HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
         if (heroArrayingPart.getHeroCodesOfArraying(CommonMsg.HeroState.HERO_STATE_ANCIENT_SWORD).isEmpty()) {
            return 4113;
         } else {
            AncientSwordDao dao = this.getDao();
            AncientSwordDao.MonsterData monsterData = dao.getMonster(battleDao.modelId);
            if (monsterData == null) {
               return 6;
            } else {
               AncientSwordBattleModel swordBattleModel = (AncientSwordBattleModel)ApplicationContextProvider.getModelPoolEntity("AncientSwordBattle", monsterData.monsterId);
               if (swordBattleModel == null) {
                  return 0;
               } else {
                  BattleModel battleModel = (BattleModel)ApplicationContextProvider.getModelPoolEntity("battle", monsterData.battleId);
                  BattlePKTeam enemyPKTeam;
                  if (battleModel != null) {
                     enemyPKTeam = new BattlePKTeam(battleModel.getId());
                  } else {
                     ArrayingMirror array = ArrayingMirror.toArrayingMirror(monsterData.arrayingData);
                     if (array == null) {
                        return 6;
                     }

                     enemyPKTeam = new BattlePKTeam(array.playerId, monsterData.name, array, monsterData.lv, 0, 0, (Map)null);
                  }

                  enemyPKTeam.setBelongName(swordBattleModel.getName());
                  BattlePKTeam selfBattleTeam = this.player.getBattleTeam(CommonMsg.HeroState.HERO_STATE_ANCIENT_SWORD, (Map)null);
                  List<PropertyModel> propertyModels = new ArrayList();

                  for(Integer buff : dao.buffs) {
                     AncientSwordBuffModel buffModel = (AncientSwordBuffModel)ApplicationContextProvider.getModelPoolEntity("AncientSwordBuff", buff);
                     if (buffModel != null) {
                        propertyModels.addAll(buffModel.getBuffs());
                     }
                  }

                  for(Entity entity : selfBattleTeam.getAllEntity().values()) {
                     entity.modifyBaseProperty(propertyModels);
                  }

                  battleDao.scene.addPKTeam(selfBattleTeam, enemyPKTeam);
                  battleDao.scene.setMaxRound(swordBattleModel.getBoutCount());
                  battleDao.updateOp();
                  this.player.getOperationMgr().addCopyLog(this.player, battleDao.modelId, "远古剑冢");
                  return 1;
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_AncientSwordBornRobot_24622(AncientSwordMsg.C2S_AncientSwordBornRobot_24622 msg, String source) {
      if (!this.player.isSystemOpen(6620)) {
         this.player.failure(21);
      } else {
         this.overtimeHandle();
      }
   }

   public void afterBattle(BattleDao battleDao) {
      int key = battleDao.modelId;
      AncientSwordDao dao = this.getDao();
      AncientSwordDao.MonsterData monsterData = dao.getMonster(key);
      if (monsterData != null) {
         AncientSwordBattleModel battleModel = (AncientSwordBattleModel)ApplicationContextProvider.getModelPoolEntity("AncientSwordBattle", monsterData.monsterId);
         if (battleModel != null) {
            BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().getResult().toBuilder();
            if (battleDao.scene.getWinForce() == 0) {
               List<ResourceModel> rewards = this.battleHandel(Collections.singletonList(monsterData), 0);
               result.addAllAwardItems(ResourceModel.builderList(rewards));
            } else if (battleDao.scene.getWinForce() == 1 && battleModel.getType() == 1) {
               Map<AncientSwordBattleAwardModel, Integer> awardModel = (Map)this.player.getGameModelPool().getEntity("cAncientSwordBattleAward", battleModel.getWeaponLoseGroup());
               AncientSwordBattleAwardModel model = (AncientSwordBattleAwardModel)TempUtil.getOneForMap(awardModel);
               dao.failKey = key;
               dao.failRewardId = model == null ? 0 : model.getId();
               dao.updateOp();
               result.addAllAwardItems(ResourceModel.builderList((List)(model == null ? new ArrayList() : model.getRewards())));
            }

            battleDao.scene.getBattleMsg().setResult(result);
            battleDao.scene.getBattleMsg().addExParams(battleModel.getType());
            battleDao.updateOp();
         }
      }
   }

   private List<ResourceModel> battleHandel(Collection<AncientSwordDao.MonsterData> monsterDataList, int type) {
      List<ResourceModel> rewards = new ArrayList();
      int totalGas = 0;
      AncientSwordDao dao = this.getDao();
      HashMap<Integer, Integer> taskTypeMap = new HashMap();
      ArrayList<AncientSwordDao.MonsterData> removes = new ArrayList(monsterDataList);
      String[] logParams = new String[4];
      LogOperationMgr operationMgr = this.player.getOperationMgr();

      for(AncientSwordDao.MonsterData monsterData : removes) {
         AncientSwordBattleModel battleModel = (AncientSwordBattleModel)ApplicationContextProvider.getModelPoolEntity("AncientSwordBattle", monsterData.monsterId);
         if (battleModel != null) {
            taskTypeMap.merge(monsterData.monsterId, 1, Integer::sum);
            Map<AncientSwordBattleAwardModel, Integer> awardModel = (Map)this.player.getGameModelPool().getEntity("cAncientSwordBattleAward", type == 0 ? battleModel.getWeaponWinGroup() : battleModel.getWeaponLoseGroup());
            AncientSwordBattleAwardModel model = (AncientSwordBattleAwardModel)TempUtil.getOneForMap(awardModel);
            if (model != null) {
               int ancientSwordGasId = this.configManager.getIntDefault("AncientSwordGasId", 6508);

               for(ResourceModel reward : model.getRewards()) {
                  totalGas += reward.getId() == ancientSwordGasId ? reward.getValue() : 0;
                  rewards.add(reward);
               }

               Map<AncientSwordRandomWeaponModel, Integer> randomMap = (Map)ApplicationContextProvider.getModelPoolEntity("cAncientSwordRandomWeapon", model.getRandomGroup());
               AncientSwordRandomWeaponModel oneForMap = (AncientSwordRandomWeaponModel)TempUtil.getOneForMap(randomMap);
               List<ResourceModel> rewardLog = new ArrayList(model.getRewards());
               if (oneForMap != null) {
                  rewardLog.addAll(oneForMap.getRewards());
                  rewards.addAll(oneForMap.getRewards());
               }

               logParams[0] = "怪物难度: " + monsterData.monsterId;
               logParams[1] = "怪物战力: " + monsterData.power;
               logParams[2] = "挑战" + (type == 0 ? "成功" : "失败");
               logParams[3] = "奖励: " + JsonUtil.listToJson(rewardLog);
               operationMgr.addExtraLog(this.player, 232, logParams);
            }
         }
      }

      int totalM = 0;
      if (type == 0) {
         for(Map.Entry<Integer, Integer> entry : taskTypeMap.entrySet()) {
            int monsterId = (Integer)entry.getKey();
            int count = (Integer)entry.getValue();
            totalM += count;
            int taskType1 = 0;
            int taskType2 = 0;
            switch (monsterId) {
               case 1:
                  taskType1 = 750;
                  taskType2 = 756;
                  break;
               case 2:
                  taskType1 = 751;
                  taskType2 = 756;
                  break;
               case 3:
                  taskType1 = 752;
                  taskType2 = 757;
                  break;
               case 4:
                  taskType1 = 753;
                  taskType2 = 757;
                  break;
               case 5:
                  taskType1 = 754;
                  taskType2 = 757;
            }

            this.player.triggerTask(taskType1, 0, (long)count, 1);
            this.player.triggerTask(taskType2, 0, (long)count, 1);
         }
      }

      this.player.triggerTask(736, 0, (long)totalM, 1);

      for(AncientSwordDao.MonsterData remove : removes) {
         dao.removeMonster(remove.key);
         remove.key = -1;
      }

      long nowTime = System.currentTimeMillis();
      if (!dao.triggerShop && nowTime >= dao.shopDeadline) {
         long ancientSwordShopTime = this.configManager.getLongByDefault("AncientSwordShopTime", 6L);
         dao.triggerShop = true;
         dao.shopDeadline = nowTime + ancientSwordShopTime * 60L * 60L * 1000L;
         dao.shopIds.clear();
         dao.shopTimeMap.clear();
      }

      dao.gas += totalGas;
      dao.updateOp();
      if (!CollectionUtils.isEmpty(rewards)) {
         this.player.addResource(rewards, removes.size() <= 1 && type != 1 ? PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW : PlayerMsg.ShowType.SHOW_TYPE_COMMON, 147, 14704, 0, 0, "");
      }

      this.send24606(removes);
      return rewards;
   }

   public void bugVIPRecord(List<ResourceModel> resourceModels) {
      AncientSwordDao dao = this.getDao();
      if (dao.VIP) {
         this.logger.error("玩家:【{}】已经购买了远古剑冢的高级战令", this.player.getPlayerId());
      } else {
         int addIntegral = 0;

         for(ResourceModel resourceModel : resourceModels) {
            if (resourceModel.getType() == 1 && resourceModel.getId() == PlayerDefine.PLAYER_ANCIENT_SWORD_POINT) {
               addIntegral += resourceModel.getValue();
            }
         }

         this.tokenSendReward(0, addIntegral, true);
      }
   }

   public void tokenSendReward(int addLevel, int addIntegral, boolean isVip) {
      AncientSwordDao dao = this.getDao();
      int totalLevel = dao.level;
      int remainIntegral = dao.integral + addIntegral;
      List<ResourceModel> upgradeRewards = new ArrayList();
      Map<Integer, AncientSwordTokenModel> modelPoolMap = ApplicationContextProvider.<Integer, AncientSwordTokenModel>getModelPoolMap("AncientSwordToken");
      AncientSwordTokenModel model = (AncientSwordTokenModel)modelPoolMap.get(dao.level);
      int maxLevel = modelPoolMap.values().size() - 1;

      for(int againLevel = this.configManager.getIntDefault("满级后每X级再次获得奖励", 3); model != null; model = (AncientSwordTokenModel)modelPoolMap.get(totalLevel > maxLevel ? -1 : totalLevel)) {
         if (remainIntegral >= model.getNum()) {
            ++totalLevel;
            remainIntegral -= model.getNum();
         } else {
            if (addLevel-- <= 0) {
               break;
            }

            ++totalLevel;
         }

         if (model.getLv() != -1 || (totalLevel - maxLevel) % againLevel == 0) {
            ResourceModel.addResourceToListPlus(upgradeRewards, model.getRewards());
         }

         if (dao.VIP) {
            ResourceModel.addResourceToListPlus(upgradeRewards, model.getLockRewards());
         }
      }

      if (dao.level > 0 && isVip) {
         for(int i = 0; i < dao.level; ++i) {
            model = (AncientSwordTokenModel)ApplicationContextProvider.getModelPoolEntity("AncientSwordToken", i);
            ResourceModel.addResourceToListPlus(upgradeRewards, model.getLockRewards());
         }
      }

      if (isVip) {
         dao.VIP = true;
      }

      dao.level = totalLevel;
      dao.integral = remainIntegral;
      dao.updateOp();
      this.player.addResource(upgradeRewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 147, 14705, addLevel, 0, "");
   }

   public void resetDaily() {
      AncientSwordDao dao = this.getDao();
      if (dao.lastBorn > 0 && this.player.isSystemOpen(6620)) {
         if (!dao.todayBorn) {
            this.bornDairyMonster();
         }

         dao.todayBorn = false;
         dao.updateOp();
      }
   }

   public void resetWeek() {
      AncientSwordDao dao = this.getDao();
      if (dao.lastBorn > 0 && this.player.isSystemOpen(6620)) {
         dao.flushTime = this.configManager.getIntDefault("AncientSwordWeeklyRenovate", 5);
         dao.todayBorn = true;
         dao.triggerShop = false;
         dao.buffs.clear();
         dao.dayMonsterMap.clear();
         dao.weekMonsterMap.clear();
         dao.receiveList.clear();
         dao.bornConfigs.clear();
         int overtime = this.configManager.getIntDefault("AncientSwordFaultTime", 10) - 1;
         dao.waitTime = System.currentTimeMillis() + (long)overtime * 1000L;
         dao.updateOp();
         Map<Integer, AncientSwordBattleModel> battleModelMap = ApplicationContextProvider.<Integer, AncientSwordBattleModel>getModelPoolMap("AncientSwordBattle");

         for(AncientSwordBattleModel model : battleModelMap.values()) {
            if (model.getType() == 2) {
               for(int i = 0; i < model.getBrushNum(); ++i) {
                  dao.bornConfigs.add(model.getId());
               }
            }
         }

         this.calcDairyMonsterCount();
         long powerBound = this.configManager.getLongByDefault("AncientSwordPlayerPower", 20000000L);
         if (this.player.getMaxPlayerCombatPower() < powerBound) {
            this.bornAllMonster();
         } else {
            this.noticeCrossBorn((List)null, AncientSwordMsg.CrossStatus.BORN_WEEK_MONSTER);
         }

         AncientSwordBountyTaskPart bountyTaskPart = (AncientSwordBountyTaskPart)this.player.getMgrPart(AncientSwordBountyTaskPart.class);
         bountyTaskPart.resetAllTask();
         bountyTaskPart.sendTaskList((List)null);
         if (dao.activeEnd == 0 || DateUtil.getIntTime(System.currentTimeMillis() + 60000L) >= dao.activeEnd) {
            dao.resetToken();
            dao.activeEnd = DateUtil.getIntTime(DateUtil.getWeekStartTime() + 1814400000L);
            dao.activeRewards.clear();
            dao.activeValue = 0;
            dao.updateOp();
         }

      }
   }

   public void bornDairyMonster() {
      if (this.player.isSystemOpen(6620)) {
         AncientSwordDao dao = this.getDao();
         dao.triggerShop = false;
         dao.todayBorn = true;
         int overtime = this.configManager.getIntDefault("AncientSwordFaultTime", 10) - 1;
         dao.waitTime = System.currentTimeMillis() + (long)overtime * 1000L;
         dao.updateOp();
         if (this.calcDairyMonsterCount()) {
            long powerBound = this.configManager.getLongByDefault("AncientSwordPlayerPower", 20000000L);
            if (this.player.getMaxPlayerCombatPower() < powerBound) {
               this.bornAllMonster();
            } else {
               this.noticeCrossBorn((List)null, AncientSwordMsg.CrossStatus.BORN_DAY_MONSTER);
            }
         }

      }
   }

   private boolean calcDairyMonsterCount() {
      AncientSwordDao dao = this.getDao();
      int ancientSwordDailyLimit = this.configManager.getIntDefault("AncientSwordDailyLimit", 12);
      ancientSwordDailyLimit -= dao.dayMonsterMap.size();
      if (ancientSwordDailyLimit <= 0) {
         return false;
      } else {
         AncientSwordBattleModel escape = (AncientSwordBattleModel)ApplicationContextProvider.getModelPoolEntity("AncientSwordBattle", 1);
         AncientSwordBattleModel betrayal = (AncientSwordBattleModel)ApplicationContextProvider.getModelPoolEntity("AncientSwordBattle", 2);
         int betrayalBrushNum = 0;
         int escapeBrushNum = 0;
         int intervalDay = TempUtil.getIntervalDay(Math.max(DateUtil.getIntTime(DateUtil.getWeekStartTimeStamp() - 10000L), dao.lastBorn)) - 1;
         if (dao.lastBorn == 0 || intervalDay == 0) {
            intervalDay = 1;
         }

         for(int i = 0; i < intervalDay && ancientSwordDailyLimit > 0; ++i) {
            int remain = ancientSwordDailyLimit - escape.getBrushNum() - betrayal.getBrushNum();
            if (remain >= 0) {
               escapeBrushNum += escape.getBrushNum();
               betrayalBrushNum += betrayal.getBrushNum();
               ancientSwordDailyLimit = remain;
            } else {
               for(int j = 0; j < ancientSwordDailyLimit; ++j) {
                  if (j % 2 == 0) {
                     ++escapeBrushNum;
                  } else {
                     ++betrayalBrushNum;
                  }
               }

               ancientSwordDailyLimit = 0;
            }
         }

         for(int i = 0; i < escapeBrushNum; ++i) {
            dao.bornConfigs.add(1);
         }

         for(int i = 0; i < betrayalBrushNum; ++i) {
            dao.bornConfigs.add(2);
         }

         dao.lastBorn = DateUtil.getIntTime(System.currentTimeMillis());
         dao.updateOp();
         return true;
      }
   }

   public void noticeCrossBorn(List<Integer> bornMonsters, AncientSwordMsg.CrossStatus crossStatus) {
      AncientSwordMsg.S2CR_AncientSwordBornMonster_24616.Builder builder = AncientSwordMsg.S2CR_AncientSwordBornMonster_24616.newBuilder();
      builder.setServerId(this.player.getServerId());
      builder.setPlayerId(this.player.getPlayerId());
      builder.setPower(this.player.getMaxPlayerCombatPower());
      builder.addAllMonsterId(CollectionUtils.isEmpty(bornMonsters) ? this.getDao().bornConfigs : bornMonsters);
      builder.setStatus(crossStatus);
      AncientSwordDao dao = this.getDao();
      ArrayList<Integer> existPlayers = new ArrayList();
      existPlayers.addAll(dao.dayMonsterMap.keySet());
      existPlayers.addAll(dao.weekMonsterMap.keySet());
      existPlayers.add(this.player.getPlayerId());
      builder.addAllExistPlayer(existPlayers);
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   public void bornAllMonster() {
      AncientSwordDao dao = this.getDao();
      ArrayList<Integer> robots = new ArrayList();
      int needBorn = dao.bornConfigs.size() - dao.receiveList.size();
      if (needBorn > 0) {
         dao.bornConfigs.sort((a, b) -> b - a);

         for(int i = 0; i < needBorn; ++i) {
            robots.add(dao.bornConfigs.get(i));
         }
      }

      for(Integer monsterId : robots) {
         AncientSwordDao.MonsterData robot = this.getRobot(monsterId);
         if (robot != null) {
            dao.receiveList.add(robot);
            dao.updateOp();
         }
      }

      this.saveMonster();
   }

   public AncientSwordDao.MonsterData getRobot(int monsterId) {
      AncientSwordBattleModel battleModel = (AncientSwordBattleModel)ApplicationContextProvider.getModelPoolEntity("AncientSwordBattle", monsterId);
      if (battleModel == null) {
         this.logger.error("远古剑冢 - AncientSwordBattle表没有id:[{}] 的小怪配置", monsterId);
         return null;
      } else {
         List<AncientSwordRobotModel> robotModels = (List)ApplicationContextProvider.getModelPoolEntity("cAncientSwordRobot", battleModel.getRobotGroup());
         ArrayList<AncientSwordRobotModel> notHasList = new ArrayList();
         AncientSwordDao dao = this.getDao();

         for(AncientSwordRobotModel robotModel : robotModels) {
            if (dao.getMonster(robotModel.getBattleId()) == null) {
               boolean has = false;

               for(AncientSwordDao.MonsterData data : dao.receiveList) {
                  if (data.key == robotModel.getBattleId()) {
                     has = true;
                     break;
                  }
               }

               if (!has) {
                  notHasList.add(robotModel);
               }
            }
         }

         AncientSwordRobotModel robotModel = (AncientSwordRobotModel)TempUtil.getOneForCollection(notHasList);
         if (robotModel == null) {
            this.logger.error("远古剑冢 - 符合条件的机器人数量:[{}], 小怪id:[{}] 没有找到合适的机器人！生成失败！", notHasList.size(), monsterId);
            return null;
         } else {
            BattlePKTeam battlePKTeam = new BattlePKTeam(robotModel.getBattleId());
            AncientSwordDao.MonsterData data = new AncientSwordDao.MonsterData();
            data.key = battlePKTeam.getBelongId();
            data.lv = battlePKTeam.getLv();
            data.name = robotModel.getName();
            data.power = (long)robotModel.getPowerShow();
            data.battleId = robotModel.getBattleId();
            return data;
         }
      }
   }

   public void initialMonster() {
      AncientSwordDao dao = this.getDao();
      if (dao.lastBorn <= 0) {
         dao.lastBorn = DateUtil.getIntTime(System.currentTimeMillis());
         this.resetWeek();
         dao.todayBorn = false;
         dao.updateOp();
      }

   }

   public void send24606(List<AncientSwordDao.MonsterData> monsterDataList) {
      if (!CollectionUtils.isEmpty(monsterDataList)) {
         AncientSwordDao dao = this.getDao();
         AncientSwordMsg.S2C_AncientSwordFlush_24606.Builder builder = AncientSwordMsg.S2C_AncientSwordFlush_24606.newBuilder();
         builder.setFlushTime(dao.flushTime);
         builder.setSchedule(dao.gas);
         builder.setShopCountdown(Math.max(DateUtil.getIntTime(dao.shopDeadline - System.currentTimeMillis()), 0));
         monsterDataList.forEach((monsterData) -> builder.addM(monsterData.toBuild()));
         this.player.sendMsg(builder.build());
      }
   }

   public void saveMonster() {
      AncientSwordDao dao = this.getDao();
      if (!CollectionUtils.isEmpty(dao.receiveList)) {
         dao.receiveList.sort(Comparator.comparing(AncientSwordDao.MonsterData::getPower).reversed());
         int dayLimit = this.configManager.getIntDefault("AncientSwordDailyLimit", 12);
         int weekLimit = 0;
         Map<Integer, AncientSwordBattleModel> battleModelMap = ApplicationContextProvider.<Integer, AncientSwordBattleModel>getModelPoolMap("AncientSwordBattle");

         for(AncientSwordBattleModel model : battleModelMap.values()) {
            if (model.getType() == 2) {
               weekLimit += model.getBrushNum();
            }
         }

         HashMap<Integer, List<Integer>> indexMap = new HashMap();
         indexMap.put(1, dao.dayMonsterMap.values().stream().map((m) -> m.index).collect(Collectors.toList()));
         indexMap.put(2, dao.weekMonsterMap.values().stream().map((m) -> m.index).collect(Collectors.toList()));
         ArrayList<AncientSwordDao.MonsterData> results = new ArrayList();
         dao.bornConfigs.sort(Comparator.comparingInt((a) -> a));
         Iterator<AncientSwordDao.MonsterData> iterator = dao.receiveList.iterator();

         while(true) {
            AncientSwordDao.MonsterData data;
            while(true) {
               if (!iterator.hasNext()) {
                  dao.updateOp();
                  this.send24606(results);
                  return;
               }

               data = (AncientSwordDao.MonsterData)iterator.next();
               if (data.monsterId > 0) {
                  break;
               }

               if (!CollectionUtils.isEmpty(dao.bornConfigs)) {
                  data.monsterId = (Integer)dao.bornConfigs.remove(dao.bornConfigs.size() - 1);
                  break;
               }
            }

            AncientSwordBattleModel model = (AncientSwordBattleModel)ApplicationContextProvider.getModelPoolEntity("AncientSwordBattle", data.monsterId);
            if (model != null) {
               if (data.index < 0) {
                  for(int i = 0; i < (model.getType() == 1 ? dayLimit : weekLimit); ++i) {
                     if (!((List)indexMap.get(model.getType())).contains(i)) {
                        data.index = i;
                        ((List)indexMap.get(model.getType())).add(i);
                        break;
                     }
                  }
               }

               if (data.index >= 0) {
                  if (model.getType() == 1) {
                     dao.dayMonsterMap.put(data.key, data);
                  } else {
                     dao.weekMonsterMap.put(data.key, data);
                  }

                  iterator.remove();
                  results.add(data);
               }
            }
         }
      }
   }

   public void overtimeHandle() {
      AncientSwordDao dao = this.getDao();
      if (dao.waitTime > 0L && System.currentTimeMillis() > dao.waitTime) {
         this.bornAllMonster();
         dao.waitTime = 0L;
         dao.updateOp();
      }

   }

   public AncientSwordDao getDao() {
      return (AncientSwordDao)this.player.getData("tb_ancient_sword", this.player.getPlayerId());
   }

   public void gmOp(String order) {
      AncientSwordDao dao = this.getDao();
      String[] split = order.split(",");
      switch (split[0]) {
         case "day":
            this.resetDaily();
            break;
         case "gas":
            dao.gas += Integer.parseInt(split[1]);
            dao.updateOp();
            break;
         case "week":
            this.resetWeek();
            break;
         case "flushtime":
            dao.flushTime = Integer.parseInt(split[1]);
            dao.updateOp();
            break;
         case "addweekm":
            dao.weekMonsterMap.clear();
            dao.receiveList.clear();
            dao.bornConfigs.clear();
            int overtime = this.configManager.getIntDefault("AncientSwordFaultTime", 10) - 1;
            dao.waitTime = System.currentTimeMillis() + (long)overtime * 1000L;
            dao.updateOp();
            Map<Integer, AncientSwordBattleModel> battleModelMap = ApplicationContextProvider.<Integer, AncientSwordBattleModel>getModelPoolMap("AncientSwordBattle");

            for(AncientSwordBattleModel model : battleModelMap.values()) {
               if (model.getType() == 2) {
                  for(int i = 0; i < model.getBrushNum(); ++i) {
                     dao.bornConfigs.add(model.getId());
                  }
               }
            }

            long powerBound = this.configManager.getLongByDefault("AncientSwordPlayerPower", 20000000L);
            if (this.player.getMaxPlayerCombatPower() < powerBound) {
               this.bornAllMonster();
            } else {
               this.noticeCrossBorn((List)null, AncientSwordMsg.CrossStatus.BORN_WEEK_MONSTER);
            }
            break;
         case "clean":
            dao.gas = 0;
            dao.buffs.clear();
            dao.flushTime = 5;
            dao.lastBorn = 0;
            dao.flushM = 0;
            dao.activeValue = 0;
            dao.activeRewards.clear();
            dao.dayMonsterMap.clear();
            dao.weekMonsterMap.clear();
            dao.shopIds.clear();
            dao.shopTimeMap.clear();
            dao.shopDeadline = 0L;
            dao.triggerShop = false;
            dao.failKey = 0;
            dao.lastBorn = 0;
            dao.failRewardId = 0;
            dao.hasUnlock = false;
            dao.todayBorn = false;
            dao.waitTime = 0L;
            dao.bornConfigs.clear();
            dao.receiveList.clear();
            dao.resetToken();
            this.resetWeek();
            this.resetDaily();
            break;
         default:
            this.player.failure(0);
      }

      this.player.failure(1);
   }
}
