package com.gzbz.war.dragonwar;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.google.protobuf.ByteString;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.entity.Monster;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.BattleDao;
import com.gzbz.db.DragonWarDao;
import com.gzbz.db.HeroArrayingDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.arraying.ArrayingEntity;
import com.gzbz.db.arraying.FriendArrayingEntity;
import com.gzbz.db.arraying.HeroArrayingEntity;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.DragonWarData;
import com.gzbz.db.bean.HeroMirror;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroInfo;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.DragonWarBuffModel;
import com.gzbz.model.DragonWarFirstAwardModel;
import com.gzbz.model.DragonWarHelpHeroModel;
import com.gzbz.model.DragonWarMainModel;
import com.gzbz.model.DragonWarRankAwardModel;
import com.gzbz.model.StarWithMaxLvModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.DragonWarMsg;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.text.MessageFormat;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import net.CrossSubscribeMsg;
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
public class DragonWarPart extends PlayerPart {
   Logger logger = LoggerFactory.getLogger(DragonWarPart.class);
   @Autowired
   private CrossNettyClient crossNettyClient;
   @Autowired
   private ConfigManager configManager;
   public static final int TARGET_PLAYER = 1;
   public static final int TARGET_ENEMY = 2;
   public static final int TARGET_STATIC = 3;
   public static final int RESET_INFO = 1;
   public static final int UPDATE_INFO = 2;

   public DragonWarDao getDragonDao() {
      DragonWarDao dragonWarDao = (DragonWarDao)this.player.getData("tb_dragon_war", this.player.getPlayerId());
      if (dragonWarDao.curStage == 0) {
         String limit = this.configManager.getStrByDefault("dragonWarFloorLimit", "5|14");
         int minFloor = Integer.parseInt(limit.split("\\|")[0]);
         dragonWarDao.curStage = minFloor;
         dragonWarDao.updateOp();
      }

      return dragonWarDao;
   }

   @MsgHandlerAnno
   public void C2S_DragonWarInfo_20401(DragonWarMsg.C2S_DragonWarInfo_20401 msg, String channelId) {
      if (this.player.isSystemOpen(5010)) {
         this.player.uploadCrossPlayer();
         DragonWarDao warDao = this.getDragonDao();
         DragonWarMsg.C2S_DragonWarInfo_20401.Builder builder = msg.toBuilder();

         for(Map.Entry<Integer, DragonWarData> entry : warDao.warData.entrySet()) {
            builder.addFloors((Integer)entry.getKey());
            if (warDao.isMerge) {
               this.flushRank((DragonWarData)entry.getValue());
            }
         }

         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
         if (warDao.warData.containsKey(warDao.curStage) && ((DragonWarData)warDao.warData.get(warDao.curStage)).passLayer.size() >= 5) {
            this.updateCurFloor(warDao.curStage);
         }

      }
   }

   public void buildPassRecord(DragonWarMsg.S2C_DragonWarInfo_20402.Builder msg) {
      DragonWarDao warDao = this.getDragonDao();

      for(Map.Entry<Integer, DragonWarData> entry : warDao.historyRecord.entrySet()) {
         DragonWarMsg.PassRecord.Builder builder = DragonWarMsg.PassRecord.newBuilder();
         builder.setFloor((Integer)entry.getKey());
         builder.setRound(((DragonWarData)entry.getValue()).round);
         builder.setDeadHeroNum(((DragonWarData)entry.getValue()).deadHeroNum);
         builder.addAllMyBuff(((DragonWarData)entry.getValue()).myBuff);
         builder.addAllEnemyBuff(((DragonWarData)entry.getValue()).enemyBuff);
         msg.addRecord(builder);
      }

   }

   @MsgHandlerAnno
   public void S2S_DragonWarInfo_20430(DragonWarMsg.S2S_DragonWarInfo_20430 msg, CrossSubscribeMsg crossSubscribeMsg) {
      DragonWarDao warDao = this.getDragonDao();
      DragonWarMsg.S2C_DragonWarInfo_20402.Builder builder = DragonWarMsg.S2C_DragonWarInfo_20402.newBuilder();
      builder.setCurFloor(warDao.curStage);

      for(DragonWarMsg.FloorInfo floorInfo : msg.getInfoList()) {
         if (warDao.warData.containsKey(floorInfo.getFloor())) {
            builder.addInfo(this.buildStage(floorInfo.getFloor(), floorInfo));
         }
      }

      for(Map.Entry<Integer, Integer> entry : warDao.supportHero.entrySet()) {
         if (warDao.supportPos.containsKey(entry.getKey()) && (Integer)warDao.supportPos.get(entry.getKey()) != -1) {
            DragonWarMsg.SupportHero.Builder support = DragonWarMsg.SupportHero.newBuilder();
            support.setSupportHero((Integer)entry.getValue());
            support.setSupportPos((Integer)warDao.supportPos.get(entry.getKey()));
            if ((Integer)entry.getKey() == 23) {
               support.setArrayingType(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_1);
            } else if ((Integer)entry.getKey() == 24) {
               support.setArrayingType(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_2);
            } else if ((Integer)entry.getKey() == 25) {
               support.setArrayingType(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_3);
            } else if ((Integer)entry.getKey() == 26) {
               support.setArrayingType(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_4);
            } else if ((Integer)entry.getKey() == 27) {
               support.setArrayingType(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_5);
            } else if ((Integer)entry.getKey() == 28) {
               support.setArrayingType(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_6);
            }

            builder.addSupportInfo(support);
         }
      }

      for(Map.Entry<DragonWarMsg.SupportType, Integer> entry : warDao.supportSelect.entrySet()) {
         DragonWarMsg.SupportSelect.Builder support = DragonWarMsg.SupportSelect.newBuilder();
         support.setSupportType((DragonWarMsg.SupportType)entry.getKey());
         support.setSupportHero((Integer)entry.getValue());
         builder.addSupportSel(support);
      }

      this.buildPassRecord(builder);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_FloorRankInfo_20441(DragonWarMsg.C2S_FloorRankInfo_20441 msg, String channelId) {
      DragonWarDao warDao = this.getDragonDao();
      DragonWarMsg.C2S_FloorRankInfo_20441.Builder builder = msg.toBuilder();

      for(Map.Entry<Integer, DragonWarData> entry : warDao.warData.entrySet()) {
         builder.addFloors((Integer)entry.getKey());
      }

      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void S2S_OneFloorInfo_20433(DragonWarMsg.S2S_OneFloorInfo_20433 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (msg.getType() == 1) {
         DragonWarMsg.S2C_DragonWarReset_20426.Builder builder = DragonWarMsg.S2C_DragonWarReset_20426.newBuilder();
         builder.setFloor(msg.getInfo().getFloor());
         builder.setInfo(this.buildStage(msg.getInfo().getFloor(), msg.getInfo()));
         this.player.sendMsg(builder.build());
      } else {
         DragonWarMsg.S2C_DragonWarFloorInfo_20410.Builder builder = DragonWarMsg.S2C_DragonWarFloorInfo_20410.newBuilder();
         DragonWarDao warDao = this.getDragonDao();
         builder.setFloor(msg.getInfo().getFloor());
         builder.setCurStage(warDao.curStage);
         builder.setInfo(this.buildStage(msg.getInfo().getFloor(), msg.getInfo()));
         this.player.sendMsg(builder.build());
      }

   }

   public DragonWarMsg.StageInfo.Builder buildStage(int floor, DragonWarMsg.FloorInfo floorInfo) {
      DragonWarDao dragonWarDao = this.getDragonDao();
      DragonWarData data = (DragonWarData)dragonWarDao.warData.get(floor);
      DragonWarMsg.StageInfo.Builder info = DragonWarMsg.StageInfo.newBuilder();
      info.setFloor(data.floor);
      info.addAllPassLayer(data.passLayer);
      info.setFirstPass(data.firstPass);
      info.addAllEnemyBuff(data.enemyBuff);
      info.addAllMyBuff(data.myBuff);
      info.setPlusGain(data.plusGain);
      info.setRank(floorInfo.getRank());
      info.setRound(floorInfo.getRoundSum());
      info.setDeadHeroNum(floorInfo.getDeadSum());
      info.setIsReset(data.isReset);
      info.setResetDeadNum(data.resetDeadNum);
      info.setResetRound(data.resetRound);
      info.setSweepReset(data.sweepReset);
      return info;
   }

   @MsgHandlerAnno
   public void C2S_DragonWarFightResult_20421(DragonWarMsg.C2S_DragonWarFightResult_20421 msg, String channelId) {
      DragonWarDao dragonWarDao = this.getDragonDao();
      int modelId = msg.getModelId();
      DragonWarMainModel warMainModel = (DragonWarMainModel)this.player.getGameModelPool().getEntity("dragonWarMain", modelId);
      if (warMainModel != null) {
         if (dragonWarDao.warData.containsKey(warMainModel.getFloor())) {
            DragonWarData warData = (DragonWarData)dragonWarDao.warData.get(warMainModel.getFloor());
            if (warData.passLayer.size() < 5) {
               DragonWarMsg.S2C_DragonWarFightResult_20422.Builder builder = DragonWarMsg.S2C_DragonWarFightResult_20422.newBuilder();
               builder.setFloor(warMainModel.getFloor());
               builder.setModelId(msg.getModelId());
               builder.setRoundSum((Integer)warData.tempLayerRound.getOrDefault(warMainModel.getLayerId(), 0));
               builder.setDeadSum((Integer)warData.tempLayerDead.getOrDefault(warMainModel.getLayerId(), 0));
               builder.setLiveSum((Integer)warData.tempLayerLive.getOrDefault(warMainModel.getLayerId(), 0));
               builder.setRank(0);
               builder.setIsFirstPass(false);
               builder.addAllIsWin((Iterable)warData.tempLayerWin.getOrDefault(warMainModel.getLayerId(), new ArrayList()));
               this.player.sendMsg(builder.build());
            } else {
               DragonWarMsg.C2S_DragonWarFightResult_20421.Builder builder = msg.toBuilder();
               if (!warData.isReset) {
                  builder.setIsFirstPass(true);
               } else {
                  builder.setIsFirstPass(false);
               }

               if (warData.firstPass && warData.passNum == 1) {
                  builder.setIsFirstPass(true);
               }

               if (warData.isReset) {
                  builder.setResetDeadNum(warData.resetDeadNum);
                  builder.setResetRound(warData.resetRound);
               }

               if (warData.layerWin.containsKey(warMainModel.getLayerId())) {
                  builder.addAllIsWin((Iterable)warData.layerWin.get(warMainModel.getLayerId()));
               }

               this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
            }
         } else {
            this.logger.error("龙门斗阵数据有问题---第{}层", warMainModel.getFloor());
         }

      }
   }

   @MsgHandlerAnno
   public void S2C_DragonWarFightResult_20422(DragonWarMsg.S2C_DragonWarFightResult_20422 msg, CrossSubscribeMsg crossSubscribeMsg) {
      DragonWarDao dragonWarDao = this.getDragonDao();
      int modelId = msg.getModelId();
      DragonWarMainModel warMainModel = (DragonWarMainModel)this.player.getGameModelPool().getEntity("dragonWarMain", modelId);
      if (warMainModel != null) {
         if (dragonWarDao.warData.containsKey(warMainModel.getFloor())) {
            DragonWarData warData = (DragonWarData)dragonWarDao.warData.get(warMainModel.getFloor());
            if (!warData.isReset) {
               warData.round = msg.getRoundSum();
               warData.deadHeroNum = msg.getDeadSum();
               warData.mergeDeadHeroNum = warData.deadHeroNum;
               warData.mergeRound = warData.round;
               dragonWarDao.updateOp();
            }
         } else {
            this.logger.error("龙门斗阵数据有问题---第{}层", warMainModel.getFloor());
         }

         DragonWarMsg.S2C_DragonWarFightResult_20422.Builder builder = msg.toBuilder();
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_SelectHero_20405(DragonWarMsg.C2S_SelectHero_20405 msg, String channelId) {
      if (this.checkOpen() > 0) {
         this.player.failure(this.checkOpen());
      }

      DragonWarMainModel mainModel = null;
      Map<Integer, DragonWarMainModel> modelMap = this.player.getGameModelPool().getMap("dragonWarMain");

      for(DragonWarMainModel model : modelMap.values()) {
         if (model.getFloor() == msg.getFloor()) {
            mainModel = model;
            break;
         }
      }

      if (mainModel != null) {
         HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
         List<Integer> usedHeroIdList = new ArrayList();
         DragonWarDao warDao = this.getDragonDao();
         DragonWarMsg.S2C_SelectHero_20406.Builder builder = DragonWarMsg.S2C_SelectHero_20406.newBuilder();
         DragonWarMsg.SupportSelect.Builder support = DragonWarMsg.SupportSelect.newBuilder();
         DragonWarMsg.SupportType supportType = null;
         boolean supportHeroUp = false;
         if (mainModel.getSupportType() == 1) {
            supportType = DragonWarMsg.SupportType.SUPPORT_ARRAYING_TYPE_1;
            usedHeroIdList.addAll(heroArrayingPart.getArrayingHeroIds(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_1));
            supportHeroUp = warDao.supportPos.containsKey(23);
         } else if (mainModel.getSupportType() == 2) {
            supportType = DragonWarMsg.SupportType.SUPPORT_ARRAYING_TYPE_2;
            usedHeroIdList.addAll(heroArrayingPart.getArrayingHeroIds(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_2));
            usedHeroIdList.addAll(heroArrayingPart.getArrayingHeroIds(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_3));
            supportHeroUp = warDao.supportPos.containsKey(24) || warDao.supportPos.containsKey(25);
         } else {
            supportType = DragonWarMsg.SupportType.SUPPORT_ARRAYING_TYPE_3;
            usedHeroIdList.addAll(heroArrayingPart.getArrayingHeroIds(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_4));
            usedHeroIdList.addAll(heroArrayingPart.getArrayingHeroIds(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_5));
            usedHeroIdList.addAll(heroArrayingPart.getArrayingHeroIds(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_6));
            supportHeroUp = warDao.supportPos.containsKey(26) || warDao.supportPos.containsKey(27) || warDao.supportPos.containsKey(28);
         }

         if (supportHeroUp && usedHeroIdList.contains(msg.getHelpHero())) {
            this.player.failure(58109);
         } else {
            if (supportType != null) {
               warDao.supportSelect.put(supportType, msg.getHelpHero());
               support.setSupportType(supportType);
            }

            warDao.updateOp();
            builder.setFloor(msg.getFloor());
            support.setSupportHero(msg.getHelpHero());
            builder.setSupportSel(support);
            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_DragonWarSupport_20411(DragonWarMsg.C2S_DragonWarSupport_20411 msg, String channelId) {
      CommonMsg.HeroState heroState = msg.getState();
      if (heroState == CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_1) {
         if (!this.checkAttackHero(msg.getSupportHero(), DragonWarMsg.SupportType.SUPPORT_ARRAYING_TYPE_1)) {
            return;
         }
      } else if (heroState != CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_2 && heroState != CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_3) {
         if (!this.checkAttackHero(msg.getSupportHero(), DragonWarMsg.SupportType.SUPPORT_ARRAYING_TYPE_3)) {
            return;
         }
      } else if (!this.checkAttackHero(msg.getSupportHero(), DragonWarMsg.SupportType.SUPPORT_ARRAYING_TYPE_2)) {
         return;
      }

      if (msg.getSupportPos() >= 0 && msg.getSupportHero() > 0) {
         HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
         List<Integer> usedHeroIdList = new ArrayList(heroArrayingPart.getArrayingHeroIds(heroState));
         if (usedHeroIdList.contains(msg.getSupportHero())) {
            this.logger.warn("设置助阵武将失败");
            return;
         }
      }

      this.updateSupportHero(msg.getState(), msg.getSupportHero(), msg.getSupportPos());
      DragonWarMsg.S2C_DragonWarSupport_20412.Builder builder = DragonWarMsg.S2C_DragonWarSupport_20412.newBuilder();
      builder.setArrayingType(msg.getState());
      builder.setSupportHero(msg.getSupportHero());
      builder.setSupportPos(msg.getSupportPos());
      this.player.sendMsg(builder.build());
   }

   public boolean checkAttackHero(int supportHero, DragonWarMsg.SupportType type) {
      DragonWarDao dragonWarDao = this.getDragonDao();
      if (!dragonWarDao.supportSelect.containsKey(type)) {
         this.player.failure(76086);
         return false;
      } else if ((Integer)dragonWarDao.supportSelect.get(type) != supportHero) {
         this.player.failure(76086);
         return false;
      } else {
         return true;
      }
   }

   @MsgHandlerAnno
   public void C2S_SelectBuff_20403(DragonWarMsg.C2S_SelectBuff_20403 msg, String channelId) {
      DragonWarDao dragonWarDao = this.getDragonDao();
      if (dragonWarDao.warData.containsKey(msg.getFloor())) {
         int consume = 0;
         DragonWarData warData = (DragonWarData)dragonWarDao.warData.get(msg.getFloor());
         Map<Integer, DragonWarBuffModel> modelMap = this.player.getGameModelPool().getMap("dragonWarBuff");
         int myPoint = warData.plusGain;

         for(Integer buff : msg.getBuffsList()) {
            if (!modelMap.containsKey(buff) || ((DragonWarBuffModel)modelMap.get(buff)).getTarget() != 1) {
               this.logger.error("没有这个buff");
               return;
            }

            consume += ((DragonWarBuffModel)modelMap.get(buff)).getConsume();
         }

         for(Integer buffId : warData.myBuff) {
            myPoint += ((DragonWarBuffModel)modelMap.get(buffId)).getConsume();
         }

         if (myPoint < consume) {
            this.player.failure(76087);
         } else {
            warData.myBuff.clear();
            warData.myBuff.addAll(msg.getBuffsList());
            warData.plusGain = myPoint - consume;
            dragonWarDao.updateOp();
            DragonWarMsg.S2C_SelectBuff_20404.Builder builder = DragonWarMsg.S2C_SelectBuff_20404.newBuilder();
            builder.setFloor(msg.getFloor());
            builder.addAllMyBuff(warData.myBuff);
            builder.setPlusGain(warData.plusGain);
            this.player.sendMsg(builder.build());
         }
      }
   }

   public void randEnemyBuff(int floor, DragonWarDao dragonWarDao) {
      DragonWarData warData = (DragonWarData)dragonWarDao.warData.get(floor);
      Map<Integer, DragonWarBuffModel> modelMap = this.player.getGameModelPool().getMap("dragonWarBuff");
      List<KeyValFun> list = new ArrayList();

      for(DragonWarBuffModel model : modelMap.values()) {
         if (model.getTarget() == 2) {
            list.add(new KeyValFun(model.getId(), model.getWeight()));
         }
      }

      if (list.isEmpty()) {
         this.logger.error("龙门斗阵敌方随机buff有问题");
      } else {
         int id = GamePlayer.countRate(list);
         warData.enemyBuff.add(id);
         if (warData.enemyBuff.size() >= 5) {
            warData.enemyBuff.remove(0);
         }

      }
   }

   @MsgHandlerAnno
   public void C2S_DragonWarHeroInfo_20413(DragonWarMsg.C2S_DragonWarHeroInfo_20413 msg, String channelId) {
      int floor = msg.getFloor();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao == null) {
         this.logger.info("英雄不存在：" + msg.getHeroCode());
      } else {
         HeroDao newDao = this.getNewHeroDao(heroDao, floor, true);
         if (newDao == null) {
            this.logger.error("获取英雄基础数据有问题！");
         } else {
            HeroMirror heroMirror = HeroMirror.fromHeroBean(newDao);
            DragonWarMsg.S2C_DragonWarHeroInfo_20414.Builder builder = DragonWarMsg.S2C_DragonWarHeroInfo_20414.newBuilder();
            builder.setFloor(floor);
            builder.setHeroCode(msg.getHeroCode());
            builder.setInfo(heroMirror.toBuilder());
            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_DragonWarHeroPower_20437(DragonWarMsg.C2S_DragonWarHeroPower_20437 msg, String channelId) {
      int floor = msg.getFloor();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      DragonWarMsg.S2C_DragonWarHeroPower_20438.Builder builder = DragonWarMsg.S2C_DragonWarHeroPower_20438.newBuilder();

      for(Integer heroCode : msg.getHeroCodeList()) {
         HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
         if (heroDao == null) {
            this.logger.info("英雄不存在：" + heroCode);
         } else {
            HeroDao newDao = this.getNewHeroDao(heroDao, floor, true);
            DragonWarMsg.HeroPower.Builder power = DragonWarMsg.HeroPower.newBuilder();
            power.setHeroCode(heroCode);
            power.setPower(newDao.getCombatPower());
            builder.addPower(power);
         }
      }

      builder.setFloor(floor);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_DragonWarSupportHeroInfo_20427(DragonWarMsg.C2S_DragonWarSupportHeroInfo_20427 msg, String channelId) {
      int floor = msg.getFloor();
      int heroId = msg.getHeroId();
      int realStar = floor;
      Map<Integer, DragonWarHelpHeroModel> modelMap = this.player.getGameModelPool().getMap("dragonWarHelpHero");

      for(DragonWarHelpHeroModel helpHeroModel : modelMap.values()) {
         if (helpHeroModel.getHeroId() == heroId) {
            realStar = helpHeroModel.getMaxStar();
            break;
         }
      }

      if (realStar > floor) {
         realStar = floor;
      }

      StarWithMaxLvModel maxLvModel = (StarWithMaxLvModel)this.player.getGameModelPool().getEntity("StarWithMaxLv", realStar);
      if (maxLvModel != null) {
         Monster monster = new Monster(heroId, maxLvModel.getMaxLv(), realStar, 0, false, this.getMyBuff(floor));
         HeroArrayingEntity heroArrayingEntity = new HeroArrayingEntity(0, monster);
         DragonWarMsg.S2C_DragonWarSupportHeroInfo_20428.Builder builder = DragonWarMsg.S2C_DragonWarSupportHeroInfo_20428.newBuilder();
         builder.setFloor(floor);
         builder.setHeroId(msg.getHeroId());
         builder.setInfo(heroArrayingEntity.toBuilder());
         this.player.sendMsg(builder.build());
      }
   }

   public HeroDao getNewHeroDao(HeroDao heroDao, int floor, Boolean calcPro) {
      int star = floor;
      if (heroDao.getStar() < floor) {
         star = heroDao.getStar();
      }

      StarWithMaxLvModel maxLvModel = (StarWithMaxLvModel)this.player.getGameModelPool().getEntity("StarWithMaxLv", star);
      if (maxLvModel == null) {
         return null;
      } else {
         int realLv = maxLvModel.getMaxLv();
         HeroInfo heroInfo = new HeroInfo(this.player.getPlayerId(), heroDao, heroDao.id, realLv, star);
         HeroDao newDao = heroInfo.getHeroDaoForDragonWar();
         List<PropertyModel> addList = new ArrayList();
         if (calcPro) {
            addList.addAll(this.getMyBuff(floor));
         }

         newDao.doFlushTotalPropertiesForDragonWar(addList);
         return newDao;
      }
   }

   @MsgHandlerAnno
   public void C2S_DragonWarFloorReset_20409(DragonWarMsg.C2S_DragonWarReset_20425 msg, String channelId) {
      if (this.checkOpen() > 0) {
         this.player.failure(this.checkOpen());
      } else {
         DragonWarDao dragonWarDao = this.getDragonDao();
         if (dragonWarDao.warData.containsKey(msg.getFloor())) {
            DragonWarData warData = (DragonWarData)dragonWarDao.warData.get(msg.getFloor());
            warData.passLayer.clear();
            warData.arrayingList.clear();
            warData.layerLive.clear();
            warData.layerRound.clear();
            warData.layerDead.clear();
            warData.deadHeroNum = 0;
            warData.round = 0;
            warData.enemyBuff.clear();
            warData.myBuff.clear();
            warData.plusGain = 0;
            warData.layerWin.clear();
            warData.isReset = true;
            if (warData.firstPass) {
               warData.sweepReset = true;
            }

            warData.resetDeadNum = 0;
            warData.resetRound = 0;
            warData.tempLayerDead.clear();
            warData.tempLayerRound.clear();
            warData.tempLayerLive.clear();
            warData.tempLayerWin.clear();
            warData.arrayingList.clear();
            dragonWarDao.updateOp();
         }

         this.toCrossGetFloorInfo(msg.getFloor(), 1);
      }
   }

   public void toCrossGetFloorInfo(int floor, int type) {
      DragonWarMsg.S2S_OneFloorInfo_20432.Builder builder = DragonWarMsg.S2S_OneFloorInfo_20432.newBuilder();
      builder.setFloor(floor);
      builder.setType(type);
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_RankInfo_20407(DragonWarMsg.C2S_RankInfo_20407 msg, String channelId) {
      DragonWarMsg.C2S_RankInfo_20407.Builder builder = msg.toBuilder();
      this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
   }

   @MsgHandlerAnno
   public void C2S_EnemyArrayingPower_20439(DragonWarMsg.C2S_EnemyArrayingPower_20439 msg, String channelId) {
      DragonWarMsg.S2C_EnemyArrayingPower_20440.Builder builder = DragonWarMsg.S2C_EnemyArrayingPower_20440.newBuilder();

      for(Integer battleId : msg.getBattleIdList()) {
         BattlePKTeam rightPKTeam = new BattlePKTeam(battleId, 0);
         if (rightPKTeam != null && !rightPKTeam.getEntityMap().isEmpty()) {
            builder.addPower(rightPKTeam.getCombatPower());
         } else {
            this.logger.error("龙门对阵阵容有问题：{}", battleId);
         }
      }

      this.player.sendMsg(builder.build());
   }

   public int enterBattle(BattleDao battleDao) {
      if (!this.player.isSystemOpen(5010)) {
         return 21;
      } else {
         DragonWarMainModel model = (DragonWarMainModel)ApplicationContextProvider.getModelPoolEntity("dragonWarMain", battleDao.modelId);
         if (model == null) {
            return 6;
         } else {
            DragonWarDao warDao = this.getDragonDao();
            if (warDao.curStage < model.getFloor()) {
               return 76084;
            } else {
               if (!warDao.warData.containsKey(model.getFloor())) {
                  DragonWarData data = new DragonWarData(model.getFloor());
                  warDao.warData.put(model.getFloor(), data);
                  warDao.updateOp();
               }

               if (((DragonWarData)warDao.warData.get(model.getFloor())).passLayer.contains(model.getLayerId())) {
                  return 76083;
               } else if (!this.checkArraying(model)) {
                  this.logger.error("龙门斗阵阵容有问题！");
                  return 76085;
               } else {
                  int curWave = battleDao.scene.getWave();
                  if (curWave == 0) {
                     this.clearLayer(model.getFloor(), model.getLayerId(), true);
                     if (this.checkOpen() > 0) {
                        return this.checkOpen();
                     }
                  }

                  PlayerDao playerDao = this.player.getPlayerDao();
                  ArrayingMirror arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_1);
                  int arrayingType = 23;
                  if (model.getSupportType() == 2) {
                     arrayingType = ((CommonMsg.HeroState)((List)HeroArrayingPart.MULTIPLE_ARRAYING.get(5011)).get(curWave)).getNumber();
                     arrayingMirror = this.player.getPlayerArraying((CommonMsg.HeroState)((List)HeroArrayingPart.MULTIPLE_ARRAYING.get(5011)).get(curWave));
                  } else if (model.getSupportType() == 3) {
                     arrayingType = ((CommonMsg.HeroState)((List)HeroArrayingPart.MULTIPLE_ARRAYING.get(5012)).get(curWave)).getNumber();
                     arrayingMirror = this.player.getPlayerArraying((CommonMsg.HeroState)((List)HeroArrayingPart.MULTIPLE_ARRAYING.get(5012)).get(curWave));
                  }

                  if (arrayingMirror == null) {
                     return 6;
                  } else {
                     BattlePKTeam leftPKTeam = new BattlePKTeam(playerDao.playerId, playerDao.playerName, this.createPkTeam(arrayingMirror, model.getFloor(), false), playerDao.lv, playerDao.head, playerDao.headFrame, (Map)null);
                     HeroArrayingEntity supportEntity = this.getSupportHeroEntity(arrayingType, model.getFloor());
                     if (supportEntity != null && supportEntity.mirror != null) {
                        leftPKTeam.addHero((byte)supportEntity.positon, supportEntity.mirror, (List)null);
                     }

                     BattlePKTeam rightPKTeam = new BattlePKTeam((Integer)model.getBattleId().get(curWave), 0);
                     if (!this.getMyBuff(model.getFloor()).isEmpty()) {
                        for(Entity entity : leftPKTeam.getEntityMap().values()) {
                           for(PropertyModel addPro : this.getMyBuff(model.getFloor())) {
                              this.addProperty(entity, addPro.getType(), addPro.getWay(), addPro.getValue());
                           }

                           if (!this.getMySkillBuff(model.getFloor()).isEmpty()) {
                              entity.addUnderPalaceEffect(this.getMySkillBuff(model.getFloor()));
                           }

                           entity.setBaseProperty(99, entity.getBaseProperty(1));
                        }
                     }

                     List<PropertyModel> enemyPro = this.getEnemyBuff(model);

                     for(Entity entity : rightPKTeam.getEntityMap().values()) {
                        for(PropertyModel addPro : enemyPro) {
                           this.addProperty(entity, addPro.getType(), addPro.getWay(), addPro.getValue());
                        }
                     }

                     if (((DragonWarData)warDao.warData.get(model.getFloor())).passLayer.size() + 1 >= 5) {
                        this.saveArraying(leftPKTeam, model.getFloor(), true);
                     } else {
                        this.saveArraying(leftPKTeam, model.getFloor(), false);
                     }

                     battleDao.scene.addPKTeam(leftPKTeam, rightPKTeam);
                     battleDao.scene.setBattleId(model.getId());
                     battleDao.scene.setWave((short)(curWave + 1), (short)model.getSupportType());
                     battleDao.scene.setMaxRound((byte)model.getRoundLimit());
                     return 1;
                  }
               }
            }
         }
      }
   }

   public List<PropertyModel> getMyBuff(int floor) {
      List<PropertyModel> list = new ArrayList();

      for(Integer id : this.getWarData(floor).myBuff) {
         DragonWarBuffModel model = (DragonWarBuffModel)this.player.getGameModelPool().getEntity("dragonWarBuff", id);
         if (model != null && model.getSkillId() == 0) {
            for(PropertyModel propertyModel : model.getBuffs()) {
               list.add(new PropertyModel(propertyModel.getType(), propertyModel.getWay(), propertyModel.getValue()));
            }
         }
      }

      return list;
   }

   public Set<Integer> getMySkillBuff(int floor) {
      Set<Integer> list = new HashSet();

      for(Integer id : this.getWarData(floor).myBuff) {
         DragonWarBuffModel model = (DragonWarBuffModel)this.player.getGameModelPool().getEntity("dragonWarBuff", id);
         if (model != null && model.getSkillId() != 0) {
            list.add(model.getSkillId());
         }
      }

      return list;
   }

   public List<PropertyModel> getEnemyBuff(DragonWarMainModel mainModel) {
      List<PropertyModel> list = new ArrayList();

      for(Integer id : this.getWarData(mainModel.getFloor()).enemyBuff) {
         DragonWarBuffModel model = (DragonWarBuffModel)this.player.getGameModelPool().getEntity("dragonWarBuff", id);
         if (model != null && (model.getSkillId() == 0 || model.getTarget() != 2)) {
            list.addAll(model.getBuffs());
         }
      }

      DragonWarBuffModel model = (DragonWarBuffModel)this.player.getGameModelPool().getEntity("dragonWarBuff", mainModel.getBuffId());
      if (model != null) {
         list.addAll(model.getBuffs());
      }

      return list;
   }

   public void saveArraying(BattlePKTeam leftPKTeam, int floor, Boolean flag) {
      ArrayingMirror newMirror = new ArrayingMirror();

      for(Map.Entry<Byte, Entity> entry : leftPKTeam.getEntityMap().entrySet()) {
         HeroArrayingEntity heroArrayingEntity = new HeroArrayingEntity((Byte)entry.getKey(), ((Entity)entry.getValue()).getHeroMirror());
         newMirror.arrayingElementsMap.put(entry.getKey(), heroArrayingEntity);
      }

      if (leftPKTeam.getFriendEntity() != null) {
         FriendArrayingEntity heroArrayingEntity = new FriendArrayingEntity(5, leftPKTeam.getFriendEntity().getHeroMirror());
         newMirror.arrayingElementsMap.put((byte)5, heroArrayingEntity);
      }

      DragonWarDao warDao = this.getDragonDao();
      byte[] bytes = newMirror.toByteArray();
      if (flag) {
         ((DragonWarData)warDao.warData.get(floor)).arrayingList.add(newMirror);
         ((DragonWarData)warDao.warData.get(floor)).recordArrayingCopy.add(bytes);
      } else {
         if (!((DragonWarData)warDao.warData.get(floor)).recordArrayingCopy.isEmpty()) {
            ((DragonWarData)warDao.warData.get(floor)).recordArrayingCopy.clear();
         }

         if (warDao.historyRecord.containsKey(floor) && ((DragonWarData)warDao.historyRecord.get(floor)).recordArrayingCopy.isEmpty()) {
            ((DragonWarData)warDao.historyRecord.get(floor)).recordArrayingCopy.add(bytes);
         }
      }

      warDao.updateOp();
   }

   public ArrayingMirror createPkTeam(ArrayingMirror arrayingMirror, int floor, boolean calcPro) {
      int limitStar = this.configManager.getIntDefault("SoulHeroLimitStar", 9);
      ArrayingMirror newArraying = new ArrayingMirror();
      newArraying.friendNation = arrayingMirror.friendNation;
      newArraying.friendState = arrayingMirror.friendState;
      newArraying.friendJob = arrayingMirror.friendJob;
      if (floor >= limitStar) {
         newArraying.soulHeroCode = arrayingMirror.soulHeroCode;
         newArraying.soulHeroId = arrayingMirror.soulHeroId;
      }

      for(Map.Entry<Byte, ArrayingEntity> entry : arrayingMirror.arrayingElementsMap.entrySet()) {
         if ((Byte)entry.getKey() <= 5) {
            HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
            HeroDao heroDao = heroBagPart.getHeroByCode(((ArrayingEntity)entry.getValue()).code);
            if (heroDao == null) {
               this.logger.info("英雄不存在：" + ((ArrayingEntity)entry.getValue()).code);
            } else {
               HeroDao newDao = this.getNewHeroDao(heroDao, floor, calcPro);
               if (newDao == null) {
                  this.logger.error("获取英雄基础数据有问题！");
               } else if ((Byte)entry.getKey() == 5) {
                  FriendArrayingEntity heroArrayingEntity = new FriendArrayingEntity((Byte)entry.getKey(), newDao);
                  heroArrayingEntity.mirror.totem = null;
                  newArraying.arrayingElementsMap.put(entry.getKey(), heroArrayingEntity);
               } else if ((Byte)entry.getKey() < 5) {
                  HeroArrayingEntity heroArrayingEntity = new HeroArrayingEntity((Byte)entry.getKey(), newDao);
                  heroArrayingEntity.mirror.totem = null;
                  newArraying.arrayingElementsMap.put(entry.getKey(), heroArrayingEntity);
               }
            }
         }
      }

      return newArraying;
   }

   public HeroArrayingEntity getSupportHeroEntity(int arrayingType, int floor) {
      HeroArrayingEntity heroArrayingEntity = null;
      DragonWarDao warDao = this.getDragonDao();
      int supportHeroId = 0;
      int supportHeroPos = -1;
      if (warDao.supportHero.containsKey(arrayingType)) {
         supportHeroId = (Integer)warDao.supportHero.get(arrayingType);
      }

      if (warDao.supportPos.containsKey(arrayingType)) {
         supportHeroPos = (Integer)warDao.supportPos.get(arrayingType);
      }

      if (supportHeroId != 0 && supportHeroPos != -1) {
         int realStar = floor;
         Map<Integer, DragonWarHelpHeroModel> modelMap = this.player.getGameModelPool().getMap("dragonWarHelpHero");

         for(DragonWarHelpHeroModel helpHeroModel : modelMap.values()) {
            if (helpHeroModel.getHeroId() == supportHeroId) {
               realStar = helpHeroModel.getMaxStar();
               break;
            }
         }

         if (realStar > floor) {
            realStar = floor;
         }

         StarWithMaxLvModel maxLvModel = (StarWithMaxLvModel)this.player.getGameModelPool().getEntity("StarWithMaxLv", realStar);
         if (maxLvModel == null) {
            return null;
         }

         Monster monster = new Monster(supportHeroId, maxLvModel.getMaxLv(), realStar, 0, false, new ArrayList());
         heroArrayingEntity = new HeroArrayingEntity(supportHeroPos, monster);
      }

      return heroArrayingEntity;
   }

   public void afterFight(BattleDao battleDao) {
      DragonWarMainModel model = (DragonWarMainModel)ApplicationContextProvider.getModelPoolEntity("dragonWarMain", battleDao.modelId);
      if (model != null) {
         this.updateLayer(battleDao, model);
         battleDao.scene.getBattleMsg().setIsNextWave(battleDao.scene.getBattleMsg().getWave() > 1);
         if (battleDao.scene.getBattleMsg().getWave() == model.getSupportType()) {
            if (battleDao.scene.getBattleMsg().getResult().getResult() == 0) {
               this.player.triggerTask(678, 0, 1L, 1);
            }

            battleDao.status = 0;
            battleDao.updateOp();
            battleDao.scene.getBattleMsg().setIsEnd(true);
            DragonWarDao dragonWarDao = this.getDragonDao();
            if (((DragonWarData)dragonWarDao.warData.get(model.getFloor())).layerWin.containsKey(model.getLayerId()) && !((List)((DragonWarData)dragonWarDao.warData.get(model.getFloor())).layerWin.get(model.getLayerId())).contains(false)) {
               ((DragonWarData)dragonWarDao.warData.get(model.getFloor())).passLayer.add(model.getLayerId());
               this.updateResetLayer((DragonWarData)dragonWarDao.warData.get(model.getFloor()), model.getLayerId());
               if (((DragonWarData)dragonWarDao.warData.get(model.getFloor())).passLayer.size() < 5) {
                  this.randEnemyBuff(model.getFloor(), dragonWarDao);
               }

               BattleMsg.S2C_Battle_Result.Builder resultBuild = battleDao.scene.getBattleMsg().getResult().toBuilder();
               if (((DragonWarData)dragonWarDao.warData.get(model.getFloor())).passLayer.size() >= 5) {
                  ((DragonWarData)dragonWarDao.warData.get(model.getFloor())).sweepReset = false;
                  this.calcFloor(dragonWarDao, model.getFloor());
                  ++((DragonWarData)dragonWarDao.warData.get(model.getFloor())).passNum;
                  if (((DragonWarData)dragonWarDao.warData.get(model.getFloor())).firstPass) {
                     resultBuild.setResult(0);
                     battleDao.rewards.add(new ResourceModel(2, this.configManager.getIntDefault("DragonWarGainPoint", 6780), this.getLeftHero(model)));
                     battleDao.updateOp();

                     for(ResourceModel reward : battleDao.rewards) {
                        resultBuild.addAwardItems(reward.builder());
                     }
                  } else {
                     ((DragonWarData)dragonWarDao.warData.get(model.getFloor())).firstPass = true;
                     DragonWarFirstAwardModel awardModel = (DragonWarFirstAwardModel)ApplicationContextProvider.getModelPoolEntity("dragonWarFirstAward", model.getFloor());
                     resultBuild.setResult(0);
                     battleDao.rewards.addAll(awardModel.getFirstREwards());
                     battleDao.updateOp();

                     for(ResourceModel reward : battleDao.rewards) {
                        resultBuild.addAwardItems(reward.builder());
                     }

                     this.player.triggerTask(679, 0, (long)model.getFloor(), 0);
                  }

                  battleDao.scene.getBattleMsg().setIsPassFloor(true);
                  this.sendFloorToCross(model.getFloor(), false, false);
                  this.clearFloor((DragonWarData)dragonWarDao.warData.get(model.getFloor()));
                  dragonWarDao.updateOp();
               } else {
                  resultBuild.setResult(0);
                  battleDao.rewards.add(new ResourceModel(2, this.configManager.getIntDefault("DragonWarGainPoint", 6780), this.getLeftHero(model)));
                  battleDao.updateOp();

                  for(ResourceModel reward : battleDao.rewards) {
                     resultBuild.addAwardItems(reward.builder());
                  }
               }

               resultBuild.setResult(0);
               battleDao.scene.getBattleMsg().setResult(resultBuild);
               this.updateCurFloor(model.getFloor());
            } else {
               BattleMsg.S2C_Battle_Result.Builder resultBuild = battleDao.scene.getBattleMsg().getResult().toBuilder();
               resultBuild.setResult(1);
               battleDao.scene.getBattleMsg().setResult(resultBuild);
            }

            this.player.getOperationMgr().addExtraLog(this.player, 207, this.player.getPublicDao().vip_lv + "", "龙门斗阵", "1");
         }

      }
   }

   @MsgHandlerAnno
   public void C2S_SavePassRecord_20445(DragonWarMsg.C2S_SavePassRecord_20445 msg, String channelId) {
      DragonWarDao dragonWarDao = this.getDragonDao();
      if (dragonWarDao.curStage >= msg.getFloor()) {
         if (dragonWarDao.warData.containsKey(msg.getFloor())) {
            DragonWarData data = (DragonWarData)dragonWarDao.warData.get(msg.getFloor());
            if (data.passLayer.size() == 5) {
               if (data.deadHeroNum == 0) {
                  if (!dragonWarDao.historyRecord.containsKey(msg.getFloor()) || ((DragonWarData)dragonWarDao.historyRecord.get(msg.getFloor())).deadHeroNum >= data.deadHeroNum) {
                     DragonWarData saveData = new DragonWarData();
                     saveData.deadHeroNum = data.deadHeroNum;
                     saveData.round = data.round;
                     saveData.passLayer.addAll(data.passLayer);
                     saveData.myBuff.addAll(data.myBuff);
                     saveData.enemyBuff.addAll(data.enemyBuff);
                     saveData.firstPass = true;
                     saveData.floor = data.floor;
                     saveData.recordArrayingCopy.addAll(data.recordArrayingCopy);
                     dragonWarDao.historyRecord.put(msg.getFloor(), saveData);
                     dragonWarDao.updateOp();
                     DragonWarMsg.S2C_SavePassRecord_20446.Builder passBuilder = DragonWarMsg.S2C_SavePassRecord_20446.newBuilder();
                     DragonWarMsg.PassRecord.Builder builder = DragonWarMsg.PassRecord.newBuilder();
                     builder.setFloor(saveData.floor);
                     builder.setRound(saveData.round);
                     builder.setDeadHeroNum(saveData.deadHeroNum);
                     builder.addAllMyBuff(saveData.myBuff);
                     builder.addAllEnemyBuff(saveData.enemyBuff);
                     passBuilder.setRecord(builder);
                     this.player.sendMsg(passBuilder.build());
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_SweepFloor_20447(DragonWarMsg.C2S_SweepFloor_20447 msg, String channelId) {
      int errorCode = this.checkOpen();
      if (errorCode > 0) {
         this.player.failure(errorCode);
      } else {
         DragonWarDao dragonWarDao = this.getDragonDao();
         Boolean flag = true;
         Boolean isReset = false;
         if (dragonWarDao.warData.containsKey(msg.getFloor())) {
            DragonWarData oldData = (DragonWarData)dragonWarDao.warData.get(msg.getFloor());
            if (oldData.firstPass) {
               flag = false;
            }

            isReset = oldData.isReset;
         }

         if (dragonWarDao.historyRecord.containsKey(msg.getFloor())) {
            DragonWarData record = (DragonWarData)dragonWarDao.historyRecord.get(msg.getFloor());
            DragonWarData data = new DragonWarData();
            data.deadHeroNum = record.deadHeroNum;
            data.round = record.round;
            data.passLayer.addAll(record.passLayer);
            data.myBuff.addAll(record.myBuff);
            data.enemyBuff.addAll(record.enemyBuff);
            data.firstPass = record.firstPass;
            data.floor = record.floor;
            if (!record.recordArrayingCopy.isEmpty()) {
               for(byte[] bytes : record.recordArrayingCopy) {
                  try {
                     ArrayingMirror mirror = ArrayingMirror.toArrayingMirror(bytes);
                     data.arrayingList.add(mirror);
                  } catch (Exception var12) {
                  }
               }
            } else {
               for(ArrayingMirror mirror : record.recordArrayingList) {
                  if (!mirror.arrayingElementsMap.isEmpty()) {
                     byte[] bytes = mirror.toByteArray();
                     data.recordArrayingCopy.add(bytes);
                  }
               }

               data.arrayingList.addAll(record.recordArrayingList);
            }

            data.firstPass = true;
            ++data.passNum;
            data.isReset = isReset;
            data.sweepReset = false;
            if (!flag) {
               data.resetRound = record.round;
               data.resetDeadNum = record.deadHeroNum;
            }

            dragonWarDao.warData.put(msg.getFloor(), data);
            dragonWarDao.updateOp();
            this.updateCurFloor(msg.getFloor());
            this.sendFloorToCross(msg.getFloor(), true, flag);
            if (flag) {
               DragonWarFirstAwardModel awardModel = (DragonWarFirstAwardModel)ApplicationContextProvider.getModelPoolEntity("dragonWarFirstAward", msg.getFloor());
               this.player.addResource(awardModel.getFirstREwards(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 103, 10302, msg.getFloor(), 0, "");
            }

         }
      }
   }

   public void updateResetLayer(DragonWarData dragonWarData, int layerId) {
      if (dragonWarData.isReset) {
         if (dragonWarData.layerRound.containsKey(layerId)) {
            dragonWarData.resetRound += (Integer)dragonWarData.layerRound.get(layerId);
         }

         if (dragonWarData.layerDead.containsKey(layerId)) {
            dragonWarData.resetDeadNum += (Integer)dragonWarData.layerDead.get(layerId);
         }
      }

   }

   public int getLeftHero(DragonWarMainModel mainModel) {
      return this.getWarData(mainModel.getFloor()).layerLive.containsKey(mainModel.getLayerId()) ? (Integer)this.getWarData(mainModel.getFloor()).layerLive.get(mainModel.getLayerId()) : 0;
   }

   public void sendFloorToCross(int floor, Boolean isSweep, Boolean isFirstPass) {
      DragonWarDao dragonWarDao = this.getDragonDao();
      if (dragonWarDao.warData.containsKey(floor)) {
         DragonWarData data = (DragonWarData)dragonWarDao.warData.get(floor);
         DragonWarMsg.S2S_UpdateFloorRank_20431.Builder builder = DragonWarMsg.S2S_UpdateFloorRank_20431.newBuilder();
         DragonWarMsg.FloorInfo.Builder info = DragonWarMsg.FloorInfo.newBuilder();
         info.setRank(0);
         info.setRoundSum(data.round);
         info.setDeadSum(data.deadHeroNum);
         info.setFloor(floor);

         for(ArrayingMirror arrayingMirror : data.arrayingList) {
            try {
               byte[] bytes = arrayingMirror.toByteArray();
               builder.addArraying(ByteString.copyFrom(bytes));
            } catch (Exception var11) {
               this.logger.error("龙门对阵阵容有问题!");
            }
         }

         builder.addAllEnemyBuff(data.enemyBuff);
         builder.addAllMyBuff(data.myBuff);
         builder.setInfo(info);
         builder.setIsSweep(isSweep);
         builder.setIsFirstPass(isFirstPass);
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
         data.mergeArrayingList.clear();
         data.mergeMyBuff.clear();
         data.mergeEnemyBuff.clear();
         data.mergeArrayingList.addAll(data.arrayingList);
         data.mergeMyBuff.addAll(data.myBuff);
         data.mergeEnemyBuff.addAll(data.enemyBuff);
         data.mergeDeadHeroNum = data.deadHeroNum;
         data.mergeRound = data.round;
         dragonWarDao.updateOp();
      }
   }

   public void flushRank(DragonWarData data) {
      if (this.checkOpen() <= 0 && data.firstPass) {
         DragonWarMsg.S2S_UpdateFloorRank_20431.Builder builder = DragonWarMsg.S2S_UpdateFloorRank_20431.newBuilder();
         DragonWarMsg.FloorInfo.Builder info = DragonWarMsg.FloorInfo.newBuilder();
         info.setRank(0);
         info.setRoundSum(data.mergeRound);
         info.setDeadSum(data.mergeDeadHeroNum);
         info.setFloor(data.floor);

         for(ArrayingMirror arrayingMirror : data.mergeArrayingList) {
            if (arrayingMirror != null) {
               try {
                  byte[] bytes = arrayingMirror.toByteArray();
                  builder.addArraying(ByteString.copyFrom(bytes));
               } catch (Exception var7) {
                  this.logger.error("龙门斗阵阵容有问题！！");
               }
            }
         }

         builder.addAllEnemyBuff(data.mergeEnemyBuff);
         builder.addAllMyBuff(data.mergeMyBuff);
         builder.setInfo(info);
         builder.setIsMerge(true);
         builder.setIsSweep(false);
         builder.setIsFirstPass(false);
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }
   }

   public void updateCurFloor(int floor) {
      DragonWarDao dragonWarDao = this.getDragonDao();
      String limit = this.configManager.getStrByDefault("dragonWarFloorLimit", "5|14");
      int maxFloor = Integer.parseInt(limit.split("\\|")[1]);
      if (dragonWarDao.warData.containsKey(floor) && ((DragonWarData)dragonWarDao.warData.get(floor)).passLayer.size() >= 5 && dragonWarDao.curStage <= floor) {
         dragonWarDao.curStage = floor + 1;
         if (dragonWarDao.curStage > maxFloor) {
            dragonWarDao.curStage = maxFloor;
         }

         dragonWarDao.updateOp();
      }

   }

   public void endBattle(BattleDao battleDao) {
      DragonWarMainModel model = (DragonWarMainModel)ApplicationContextProvider.getModelPoolEntity("dragonWarMain", battleDao.modelId);
      if (model != null) {
         DragonWarDao dragonWarDao = this.getDragonDao();
         if (dragonWarDao.warData.containsKey(model.getFloor())) {
            if (((DragonWarData)dragonWarDao.warData.get(model.getFloor())).layerWin.containsKey(model.getLayerId()) && !((List)((DragonWarData)dragonWarDao.warData.get(model.getFloor())).layerWin.get(model.getLayerId())).contains(false)) {
               List<ResourceModel> tempList = new ArrayList();
               if (battleDao.rewards.size() > 0) {
                  for(ResourceModel reward : battleDao.rewards) {
                     if (reward.getId() == this.configManager.getIntDefault("DragonWarGainPoint", 6780)) {
                        DragonWarData var10000 = (DragonWarData)dragonWarDao.warData.get(model.getFloor());
                        var10000.plusGain += reward.getValue();
                        dragonWarDao.updateOp();
                     } else {
                        tempList.add(reward);
                     }
                  }

                  if (!tempList.isEmpty()) {
                     this.player.addResource(tempList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 103, 10302, battleDao.modelId, 0, "");
                  }
               }

               this.toCrossGetFloorInfo(model.getFloor(), 2);
            } else {
               this.clearLayer(model.getFloor(), model.getLayerId(), false);
            }

         }
      }
   }

   public void calcFloor(DragonWarDao dragonWarDao, int floor) {
      DragonWarData warData = (DragonWarData)dragonWarDao.warData.get(floor);
      int deadSum = 0;

      for(int deadNum : warData.layerDead.values()) {
         deadSum += deadNum;
      }

      int roundSum = 0;

      for(int round : warData.layerRound.values()) {
         roundSum += round;
      }

      warData.deadHeroNum = deadSum;
      warData.round = roundSum;
   }

   public void clearLayer(int floor, int layerId, boolean tempFlag) {
      DragonWarDao dragonWarDao = this.getDragonDao();
      DragonWarData data = (DragonWarData)dragonWarDao.warData.get(floor);
      if (data.layerLive.containsKey(layerId)) {
         data.layerLive.remove(layerId);
      }

      if (data.layerRound.containsKey(layerId)) {
         data.layerRound.remove(layerId);
      }

      if (data.layerDead.containsKey(layerId)) {
         data.layerDead.remove(layerId);
      }

      if (data.layerWin.containsKey(layerId)) {
         data.layerWin.remove(layerId);
      }

      data.arrayingList.clear();
      if (tempFlag) {
         if (data.tempLayerLive.containsKey(layerId)) {
            data.tempLayerLive.remove(layerId);
         }

         if (data.tempLayerRound.containsKey(layerId)) {
            data.tempLayerRound.remove(layerId);
         }

         if (data.tempLayerDead.containsKey(layerId)) {
            data.tempLayerDead.remove(layerId);
         }

         if (data.tempLayerWin.containsKey(layerId)) {
            data.tempLayerWin.remove(layerId);
         }
      }

      dragonWarDao.updateOp();
   }

   public void clearFloor(DragonWarData data) {
      data.layerDead.clear();
      data.layerRound.clear();
      data.layerLive.clear();
      data.arrayingList.clear();
   }

   public void updateLayer(BattleDao battleDao, DragonWarMainModel model) {
      int deadNum = 0;
      int liveNum = 0;
      int temoLiveNum = 0;
      int tempDeadNum = 0;

      for(Entity entity : battleDao.scene.getPKTeam((byte)0).getEntityMap().values()) {
         if (entity.isDead()) {
            ++deadNum;
            ++tempDeadNum;
         } else {
            ++liveNum;
            ++temoLiveNum;
         }
      }

      if (battleDao.scene.getPKTeam((byte)0).getFriendEntity() != null) {
         if (battleDao.scene.getPKTeam((byte)0).getFriendEntity().isDead()) {
            ++deadNum;
            ++tempDeadNum;
         } else {
            ++liveNum;
            ++temoLiveNum;
         }
      }

      DragonWarDao dragonWarDao = this.getDragonDao();
      DragonWarData warData = (DragonWarData)dragonWarDao.warData.get(model.getFloor());
      if (warData.layerDead.containsKey(model.getLayerId())) {
         deadNum += (Integer)warData.layerDead.get(model.getLayerId());
      }

      warData.layerDead.put(model.getLayerId(), deadNum);
      int layerRound = battleDao.scene.getBattleMsg().getRoundsCount();
      if (warData.layerRound.containsKey(model.getLayerId())) {
         layerRound += (Integer)warData.layerRound.get(model.getLayerId());
      }

      warData.layerRound.put(model.getLayerId(), layerRound);
      if (warData.layerLive.containsKey(model.getLayerId())) {
         liveNum += (Integer)warData.layerLive.get(model.getLayerId());
      }

      warData.layerLive.put(model.getLayerId(), liveNum);
      boolean isWin = false;
      if (battleDao.scene.getBattleMsg().getResult().getResult() == 0) {
         isWin = true;
      }

      if (warData.layerWin.containsKey(model.getLayerId())) {
         ((List)warData.layerWin.get(model.getLayerId())).add(isWin);
      } else {
         List<Boolean> tempList = new ArrayList();
         tempList.add(isWin);
         warData.layerWin.put(model.getLayerId(), tempList);
      }

      if (warData.tempLayerDead.containsKey(model.getLayerId())) {
         tempDeadNum += (Integer)warData.tempLayerDead.get(model.getLayerId());
      }

      warData.tempLayerDead.put(model.getLayerId(), tempDeadNum);
      int tempLayerRound = battleDao.scene.getBattleMsg().getRoundsCount();
      if (warData.tempLayerRound.containsKey(model.getLayerId())) {
         tempLayerRound += (Integer)warData.tempLayerRound.get(model.getLayerId());
      }

      warData.tempLayerRound.put(model.getLayerId(), tempLayerRound);
      if (warData.tempLayerLive.containsKey(model.getLayerId())) {
         temoLiveNum += (Integer)warData.tempLayerLive.get(model.getLayerId());
      }

      warData.tempLayerLive.put(model.getLayerId(), temoLiveNum);
      if (warData.tempLayerWin.containsKey(model.getLayerId())) {
         ((List)warData.tempLayerWin.get(model.getLayerId())).add(isWin);
      } else {
         List<Boolean> tempList = new ArrayList();
         tempList.add(isWin);
         warData.tempLayerWin.put(model.getLayerId(), tempList);
      }

      dragonWarDao.updateOp();
   }

   public DragonWarData getWarData(int floor) {
      DragonWarDao dragonWarDao = this.getDragonDao();
      if (!dragonWarDao.warData.containsKey(floor)) {
         DragonWarData warData = new DragonWarData(floor);
         dragonWarDao.warData.put(floor, warData);
         dragonWarDao.updateOp();
      }

      return (DragonWarData)dragonWarDao.warData.get(floor);
   }

   public void updateSupportHero(CommonMsg.HeroState state, int supportHero, int supportPos) {
      DragonWarDao dragonWarDao = this.getDragonDao();
      if (state == CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_1) {
         this.removeSupportHero(dragonWarDao, 23);
      } else if (state != CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_2 && state != CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_3) {
         if (state == CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_4 || state == CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_5 || state == CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_6) {
            this.removeSupportHero(dragonWarDao, 26);
            this.removeSupportHero(dragonWarDao, 27);
            this.removeSupportHero(dragonWarDao, 28);
         }
      } else {
         this.removeSupportHero(dragonWarDao, 24);
         this.removeSupportHero(dragonWarDao, 25);
      }

      if (supportPos != -1) {
         dragonWarDao.supportHero.put(state.getNumber(), supportHero);
         dragonWarDao.supportPos.put(state.getNumber(), supportPos);
      }

      dragonWarDao.updateOp();
   }

   public void removeSupportHero(DragonWarDao dragonWarDao, int arrayingType) {
      if (dragonWarDao.supportHero.containsKey(arrayingType)) {
         dragonWarDao.supportHero.remove(arrayingType);
      }

      if (dragonWarDao.supportPos.containsKey(arrayingType)) {
         dragonWarDao.supportPos.remove(arrayingType);
      }

   }

   private boolean checkArraying(DragonWarMainModel mainModel) {
      DragonWarDao warDao = this.getDragonDao();
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      boolean isHaveArraying_1 = true;
      boolean isHaveArraying_2 = true;
      boolean isHaveArraying_3 = true;
      boolean isHaveArraying_4 = true;
      boolean isHaveArraying_5 = true;
      boolean isHaveArraying_6 = true;
      int supportHeroId = 0;
      int supportPos = -1;
      List<CommonMsg.HeroState> arrayingList = new ArrayList();
      if (mainModel.getSupportType() == 1) {
         isHaveArraying_1 = heroArrayingPart.isEnableUseArraying(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_1);
         arrayingList.add(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_1);
         if (warDao.supportHero.containsKey(23)) {
            supportHeroId = (Integer)warDao.supportHero.get(23);
            if (warDao.supportPos.containsKey(23)) {
               supportPos = (Integer)warDao.supportPos.get(23);
            }
         }
      } else if (mainModel.getSupportType() == 2) {
         isHaveArraying_2 = heroArrayingPart.isEnableUseArraying(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_2);
         isHaveArraying_3 = heroArrayingPart.isEnableUseArraying(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_3);
         arrayingList.add(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_2);
         arrayingList.add(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_3);
         if (warDao.supportHero.containsKey(24)) {
            supportHeroId = (Integer)warDao.supportHero.get(24);
            if (warDao.supportPos.containsKey(24)) {
               supportPos = (Integer)warDao.supportPos.get(24);
            }
         } else if (warDao.supportHero.containsKey(25)) {
            supportHeroId = (Integer)warDao.supportHero.get(25);
            if (warDao.supportPos.containsKey(25)) {
               supportPos = (Integer)warDao.supportPos.get(25);
            }
         }
      } else {
         isHaveArraying_4 = heroArrayingPart.isEnableUseArraying(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_4);
         isHaveArraying_5 = heroArrayingPart.isEnableUseArraying(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_5);
         isHaveArraying_6 = heroArrayingPart.isEnableUseArraying(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_6);
         arrayingList.add(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_4);
         arrayingList.add(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_5);
         arrayingList.add(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_6);
         if (warDao.supportHero.containsKey(26)) {
            supportHeroId = (Integer)warDao.supportHero.get(26);
            if (warDao.supportPos.containsKey(26)) {
               supportPos = (Integer)warDao.supportPos.get(26);
            }
         } else if (warDao.supportHero.containsKey(27)) {
            supportHeroId = (Integer)warDao.supportHero.get(27);
            if (warDao.supportPos.containsKey(27)) {
               supportPos = (Integer)warDao.supportPos.get(27);
            }
         } else if (warDao.supportHero.containsKey(28)) {
            supportHeroId = (Integer)warDao.supportHero.get(28);
            if (warDao.supportPos.containsKey(28)) {
               supportPos = (Integer)warDao.supportPos.get(28);
            }
         }
      }

      if (isHaveArraying_1 && isHaveArraying_2 && isHaveArraying_3 && isHaveArraying_4 && isHaveArraying_5 && isHaveArraying_6) {
         return !this.multipleArrayingHadSameHero(arrayingList, supportHeroId, supportPos);
      } else {
         return false;
      }
   }

   public int getSaveArrayingSameHeroId(CommonMsg.HeroState arrayingType) {
      DragonWarDao warDao = this.getDragonDao();
      int heroId = 0;
      if (arrayingType.getNumber() == CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_1.getNumber()) {
         if (this.getSupportHeroId(warDao, CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_1.getNumber()) > 0) {
            heroId = this.getSupportHeroId(warDao, CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_1.getNumber());
         }
      } else if (arrayingType.getNumber() != CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_2.getNumber() && arrayingType.getNumber() != CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_3.getNumber()) {
         if (arrayingType.getNumber() == CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_4.getNumber() || arrayingType.getNumber() == CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_5.getNumber() || arrayingType.getNumber() == CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_6.getNumber()) {
            if (this.getSupportHeroId(warDao, CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_4.getNumber()) > 0) {
               heroId = this.getSupportHeroId(warDao, CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_4.getNumber());
            }

            if (this.getSupportHeroId(warDao, CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_5.getNumber()) > 0) {
               heroId = this.getSupportHeroId(warDao, CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_5.getNumber());
            }

            if (this.getSupportHeroId(warDao, CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_6.getNumber()) > 0) {
               heroId = this.getSupportHeroId(warDao, CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_6.getNumber());
            }
         }
      } else {
         if (this.getSupportHeroId(warDao, CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_2.getNumber()) > 0) {
            heroId = this.getSupportHeroId(warDao, CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_2.getNumber());
         }

         if (this.getSupportHeroId(warDao, CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_3.getNumber()) > 0) {
            heroId = this.getSupportHeroId(warDao, CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_3.getNumber());
         }
      }

      return heroId;
   }

   public int getSupportHeroId(DragonWarDao warDao, int arrayingType) {
      if (warDao.supportHero.containsKey(arrayingType) && warDao.supportPos.containsKey(arrayingType) && (Integer)warDao.supportPos.get(arrayingType) != -1) {
         int supportHeroId = (Integer)warDao.supportHero.get(arrayingType);
         return supportHeroId;
      } else {
         return 0;
      }
   }

   public boolean multipleArrayingHadSameHero(List<CommonMsg.HeroState> heroStates, int supportHeroId, int supportPos) {
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      List<Integer> allArrayingHeroIdList = new ArrayList();

      for(CommonMsg.HeroState heroState : heroStates) {
         for(int code : heroArrayingPart.getHeroCodesOfArraying(heroState)) {
            HeroDao heroDao = heroBagPart.getHeroByCode(code);
            if (allArrayingHeroIdList.contains(heroDao.id)) {
               this.logger.error("玩家{}布阵系统{}存在重复武将id:{}", this.player.getPlayerId(), heroDao.id);
               return true;
            }

            allArrayingHeroIdList.add(heroDao.id);
         }
      }

      if (supportPos != -1 && supportHeroId != 0 && allArrayingHeroIdList.contains(supportHeroId)) {
         this.logger.info("助阵武将与布阵武将重复---{}---位置：{}", supportHeroId, supportPos);
         return true;
      } else {
         return false;
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

   public int checkOpen() {
      LocalDateTime nowDateTime = LocalDateTime.now();
      String openTime = this.configManager.getStrByDefault("DragonWarOpenTime", "06:00");
      String endTime = this.configManager.getStrByDefault("DragonWarOverTime", "23:00");
      int openHour = Integer.parseInt(openTime.split(":")[0]);
      int openMinute = Integer.parseInt(openTime.split(":")[1]);
      int endHour = Integer.parseInt(endTime.split(":")[0]);
      int endMinute = Integer.parseInt(endTime.split(":")[1]);
      if (nowDateTime.getDayOfWeek() != DayOfWeek.SUNDAY || nowDateTime.getHour() <= endHour && (endHour != nowDateTime.getHour() || nowDateTime.getMinute() < endMinute)) {
         return nowDateTime.getDayOfWeek() != DayOfWeek.MONDAY || nowDateTime.getHour() >= openHour && (nowDateTime.getHour() != openHour || nowDateTime.getMinute() > openMinute) ? 0 : 76081;
      } else {
         return 76082;
      }
   }

   @MsgHandlerAnno
   public void S2S_SendRankAward_20434(DragonWarMsg.S2S_SendRankAward_20434 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (!msg.getRankList().isEmpty()) {
         List<ResourceModel> allAward = new ArrayList();
         CentreAwardModel rewardModel = this.getCentreAwardModel(CentreAwardModel.TYPE_DRAGON_WAR_RANK_REWARD, 0L);
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         String limit = this.configManager.getStrByDefault("dragonWarFloorLimit", "5|14");
         int minFloor = Integer.parseInt(limit.split("\\|")[0]);
         int maxFloor = Integer.parseInt(limit.split("\\|")[1]);
         String desc = this.configManager.getStrByDefault("DragonWarUnrank", "未上榜");
         Map<Integer, Integer> rankMap = new HashMap();

         for(DragonWarMsg.FloorInfo floorInfo : msg.getRankList()) {
            this.player.triggerTask(680, floorInfo.getRank(), 1L, 2);
            rankMap.put(floorInfo.getFloor(), floorInfo.getRank());
         }

         String[] str = new String[10];
         int inx = 0;

         for(int floor = minFloor; floor <= maxFloor; ++floor) {
            if (rankMap.containsKey(floor)) {
               str[inx] = rankMap.get(floor) + "";

               for(ResourceModel resourceModel : this.getRankAward(floor, (Integer)rankMap.get(floor))) {
                  resourceModel.addResourceToList(allAward);
               }
            } else {
               str[inx] = desc;
            }

            ++inx;
         }

         String content = MessageFormat.format(rewardModel.getDesc(), str[0], str[1], str[2], str[3], str[4], str[5], str[6], str[7], str[8], str[9]);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, rewardModel.getTitle(), content, allAward, 604800000L, 103, 10301);
         this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "龙门斗阵", "排行奖励-" + content, "排行奖励-" + content, 0, 0, 1);
         this.logger.info("收到龙门对阵结算邮件 ：{}", this.player.getPlayerId());
         if (msg.hasIsMerge() && msg.getIsMerge()) {
            DragonWarDao dragonWarDao = this.getDragonDao();
            dragonWarDao.isMerge = true;
            dragonWarDao.updateOp();
         }

      }
   }

   public List<ResourceModel> getRankAward(int floor, int rank) {
      List<ResourceModel> list = new ArrayList();
      Map<Integer, DragonWarRankAwardModel> modelMap = this.player.getGameModelPool().getMap("dragonWarRankAward");

      for(DragonWarRankAwardModel model : modelMap.values()) {
         if (model.getFloor() == floor && rank >= model.getMinRank() && rank <= model.getMaxRank()) {
            list.addAll(model.getItems());
         }
      }

      return list;
   }

   private CentreAwardModel getCentreAwardModel(int type, long rank) {
      Map<Integer, TreeMap<Integer, CentreAwardModel>> centreAwardModelMap = this.player.getGameModelPool().getMap("customCentreAward");
      TreeMap<Integer, CentreAwardModel> rewardMap = (TreeMap)centreAwardModelMap.get(type);
      CentreAwardModel rewardModel = null;

      for(CentreAwardModel awardModel : rewardMap.values()) {
         if ((long)awardModel.getMinRank() <= rank && (long)awardModel.getMaxRank() >= rank) {
            rewardModel = awardModel;
            break;
         }
      }

      if (rewardModel == null) {
         rewardModel = (CentreAwardModel)rewardMap.lastEntry().getValue();
      }

      return rewardModel;
   }

   public void gmOp(int op) {
      if (op == 0) {
         this.resetData();
      } else if (op == 1) {
         this.resetArraying();
      } else if (op >= 5 && op <= 14) {
         DragonWarDao dragonWarDao = this.getDragonDao();
         dragonWarDao.curStage = op;
         dragonWarDao.updateOp();
      } else {
         DragonWarMsg.S2S_Gm_20435.Builder builder = DragonWarMsg.S2S_Gm_20435.newBuilder();
         builder.setOp(op);
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }

   public void resetWeek() {
      this.resetData();
      this.resetMailNoticeByWeek();
   }

   public void resetData() {
      DragonWarDao dragonWarDao = this.getDragonDao();
      String limit = this.configManager.getStrByDefault("dragonWarFloorLimit", "5|14");
      int minFloor = Integer.parseInt(limit.split("\\|")[0]);
      dragonWarDao.curStage = minFloor;
      dragonWarDao.warData.clear();
      dragonWarDao.isMerge = false;
      dragonWarDao.updateOp();
   }

   public void resetArraying() {
      HeroArrayingPart mgrPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      List<CommonMsg.HeroState> arrayingList = new ArrayList();
      arrayingList.add(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_1);
      arrayingList.add(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_2);
      arrayingList.add(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_3);
      arrayingList.add(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_4);
      arrayingList.add(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_5);
      arrayingList.add(CommonMsg.HeroState.HERO_STATE_DRAGON_WAR_6);
      HeroMsg.S2C_HeroArrayingListResult_5030.Builder updateList = HeroMsg.S2C_HeroArrayingListResult_5030.newBuilder();
      updateList.setIsUpdate(true);

      for(CommonMsg.HeroState arrayingType : arrayingList) {
         HeroMsg.S2C_HeroBaseData_5002.Builder result_builder = HeroMsg.S2C_HeroBaseData_5002.newBuilder();
         HeroArrayingDao arrayingDao = mgrPart.getHeroArrayingDaoByType(arrayingType);
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
                     if (heroDao != null && heroDao.containState(arrayingType.getNumber())) {
                        heroDao.delState(arrayingType.getNumber());
                        heroDao.updateOp();
                        result_builder.addHeros(heroDao.toHeroInfo());
                     }
               }
            }

            arrayingDao.soulHeroCode = 0;
            arrayingDao.elements.clear();
            arrayingDao.updateOp();
            this.player.sendMsg(result_builder.build());
            HeroMsg.ArrayingList.Builder arraying_builder = HeroMsg.ArrayingList.newBuilder();
            arraying_builder.setArrayingType(arrayingType);
            arraying_builder.setFriendState(arrayingDao.friendState);
            arraying_builder.setIsHide(arrayingDao.hide);
            updateList.addArrayings(arraying_builder);
         }
      }

      if (!updateList.getArrayingsBuilderList().isEmpty()) {
         this.player.sendMsg(updateList.build());
      }

   }

   public void resetMailNoticeByWeek() {
      SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 5010);
      if (null != systemFunctionModel && this.player.getPlayerDao().lv >= systemFunctionModel.getOpenLevel()) {
         String mailId = ApplicationContextProvider.getConfigString("DragonWarWeekResetMailId", "2736");
         CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", Integer.parseInt(mailId));
         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), (List)null, 604800000L, 103, 10303);
      }
   }

   @MsgHandlerAnno
   public void CR2S_ResetMail_20443(DragonWarMsg.CR2S_ResetMail_20443 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.resetMailNoticeByWeek();
   }
}
