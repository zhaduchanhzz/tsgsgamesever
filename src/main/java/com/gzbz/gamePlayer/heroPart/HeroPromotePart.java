package com.gzbz.gamePlayer.heroPart;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.HeroDao;
import com.gzbz.db.HeroPromoteDao;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.HeroPromoteLevelModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.HeroPromoteMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import misc.MapUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class HeroPromotePart extends PlayerPart {
   private static final Logger logger = LoggerFactory.getLogger(HeroPromotePart.class);
   @Autowired
   private ConfigManager configManager;

   @MsgHandlerAnno
   public void C2S_HeroPromoteInfo_18801(HeroPromoteMsg.C2S_HeroPromoteInfo_18801 msg, String source) {
      this.sendPromoteInfo();
   }

   @MsgHandlerAnno
   public void C2S_Upgrade_18803(HeroPromoteMsg.C2S_Upgrade_18803 msg, String source) {
      this.upgrade();
   }

   public void checkUnlockHeroPromote() {
      HeroPromoteDao heroPromoteDao = (HeroPromoteDao)this.player.getData("tb_hero_promote", this.player.getPlayerId());
      if (!heroPromoteDao.state) {
         int count = 0;
         int needLv = this.configManager.getIntDefault("heroPromoteUnlockLv", 350);
         int needNum = this.configManager.getIntDefault("heroPromoteUnlockNum", 6);
         Map<Integer, HeroDao> heroDaoMap = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());

         for(HeroDao heroDao : heroDaoMap.values()) {
            if (heroDao.type != HeroDefine.HERO_SP_TYPE_PALACE && heroDao.type != HeroDefine.HERO_SP_TYPE_LINK && heroDao.getLv() >= needLv) {
               ++count;
            }
         }

         if (count >= needNum) {
            heroPromoteDao.state = true;
            heroPromoteDao.level = 0;
            heroPromoteDao.stage = 0;
            heroPromoteDao.levelLimit = this.calcExtraLvLimite();
            heroPromoteDao.updateOp();
            this.sendPromoteInfo();
         }

      }
   }

   public void checkExtraLvLimit(int star) {
      HeroPromoteDao heroPromoteDao = (HeroPromoteDao)this.player.getData("tb_hero_promote", this.player.getPlayerId());
      if (heroPromoteDao.state) {
         Map<Integer, Integer> star2lvMap = this.configManager.getIntMap("heroPromoteLevelStar");
         if (star2lvMap.containsKey(star)) {
            int newLvLimit = this.calcExtraLvLimite();
            if (heroPromoteDao.levelLimit < newLvLimit) {
               heroPromoteDao.levelLimit = newLvLimit;
               heroPromoteDao.updateOp();
               this.sendPromoteInfo();
            }
         }
      }
   }

   public int calcExtraLvLimite() {
      int lvLimit = 0;
      Map<Integer, Integer> heroId2StarMap = new HashMap();
      Map<Integer, HeroDao> heroDaoMap = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());

      for(HeroDao heroDao : heroDaoMap.values()) {
         if (heroDao.type != HeroDefine.HERO_SP_TYPE_PALACE && heroDao.type != HeroDefine.HERO_SP_TYPE_LINK) {
            if (heroId2StarMap.containsKey(heroDao.id)) {
               if ((Integer)heroId2StarMap.get(heroDao.id) < heroDao.getStar()) {
                  heroId2StarMap.put(heroDao.id, heroDao.getStar());
               }
            } else {
               heroId2StarMap.put(heroDao.id, heroDao.getStar());
            }
         }
      }

      Map<Integer, Integer> star2lvMap = this.configManager.getIntMap("heroPromoteLevelStar");

      for(int star : heroId2StarMap.values()) {
         int lv = (Integer)MapUtil.getOrDefault(star2lvMap, star, 0);
         lvLimit += lv;
      }

      int heroPromoteLevelServer = this.configManager.getIntDefault("heroPromoteLevelServer", 40);
      lvLimit = Math.min(lvLimit, heroPromoteLevelServer);
      return lvLimit;
   }

   public void sendPromoteInfo() {
      HeroPromoteDao heroPromoteDao = (HeroPromoteDao)this.player.getData("tb_hero_promote", this.player.getPlayerId());
      HeroPromoteMsg.S2C_HeroPromoteInfo_18802.Builder builder = HeroPromoteMsg.S2C_HeroPromoteInfo_18802.newBuilder();
      builder.setState(heroPromoteDao.state);
      if (heroPromoteDao.state) {
         builder.setLevel(heroPromoteDao.level);
         builder.setStage(heroPromoteDao.stage);
         builder.setLevelLimit(heroPromoteDao.levelLimit);
      }

      this.player.sendMsg(builder.build());
   }

   protected void upgrade() {
      HeroPromoteDao heroPromoteDao = (HeroPromoteDao)this.player.getData("tb_hero_promote", this.player.getPlayerId());
      if (!heroPromoteDao.state) {
         this.player.failure(76040);
      } else {
         Map<Integer, HeroPromoteLevelModel> modelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customHeroPromoteLevel", heroPromoteDao.level);
         if (!CollectionUtils.isEmpty(modelMap)) {
            TreeSet<Integer> stageSet = new TreeSet(modelMap.keySet());
            if (heroPromoteDao.level >= heroPromoteDao.levelLimit && heroPromoteDao.stage >= (Integer)stageSet.last()) {
               this.player.failure(76041);
            } else {
               if (heroPromoteDao.stage >= (Integer)stageSet.last()) {
                  Map<Integer, HeroPromoteLevelModel> nextModelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customHeroPromoteLevel", heroPromoteDao.level + 1);
                  if (nextModelMap == null) {
                     logger.warn("{} 没有下一等级数据了 level:{} stage:{}", new Object[]{this.player.getPlayerId(), heroPromoteDao.level, heroPromoteDao.stage});
                     return;
                  }
               }

               HeroPromoteLevelModel levelModel = (HeroPromoteLevelModel)modelMap.get(heroPromoteDao.stage);
               if (levelModel == null) {
                  logger.warn("{} 配置数据不存在 level:{} stage:{}", new Object[]{this.player.getPlayerId(), heroPromoteDao.level, heroPromoteDao.stage});
               } else if (!this.player.checkResourceNum(levelModel.getLvMaterials())) {
                  logger.info("资源不足 {}", this.player.getPlayerId());
               } else {
                  this.player.delResource((List)levelModel.getLvMaterials(), 90, 9011, 0, 0, "");
                  if (heroPromoteDao.stage >= (Integer)stageSet.last()) {
                     ++heroPromoteDao.level;
                     heroPromoteDao.stage = 0;
                  } else {
                     ++heroPromoteDao.stage;
                  }

                  heroPromoteDao.updateOp();
                  HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                  heroBagPart.setProperty_hero_promote(this.getPropertyAdditions());
                  heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODULE_HERO_PALACE);
                  HeroPromoteMsg.S2C_Upgrade_18804.Builder builder = HeroPromoteMsg.S2C_Upgrade_18804.newBuilder();
                  builder.setLevel(heroPromoteDao.level);
                  builder.setStage(heroPromoteDao.stage);
                  this.player.sendMsg(builder.build());
                  String[] rewardsInfo = LogOperationMgr.toRewardsInfo(levelModel.getLvMaterials());
                  this.player.getOperationMgr().addExtraLog(this.player, 217, "等级突破", "lv:" + heroPromoteDao.level + " stage:" + heroPromoteDao.stage, rewardsInfo[2], rewardsInfo[1]);
               }
            }
         }
      }
   }

   public List<PropertyModel> getPropertyAdditions() {
      List<PropertyModel> propertyModels = new ArrayList();
      HeroPromoteDao heroPromoteDao = (HeroPromoteDao)this.player.getData("tb_hero_promote", this.player.getPlayerId());
      Map<Integer, HeroPromoteLevelModel> modelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customHeroPromoteLevel", heroPromoteDao.level);
      if (CollectionUtils.isEmpty(modelMap)) {
         return propertyModels;
      } else {
         HeroPromoteLevelModel model = (HeroPromoteLevelModel)modelMap.get(heroPromoteDao.stage);
         if (model == null) {
            return propertyModels;
         } else {
            for(PropertyModel property : model.getLvProperties()) {
               PropertyModel.addLvProtities(propertyModels, property);
            }

            return propertyModels;
         }
      }
   }

   public void loginHandle() {
      this.checkUnlockHeroPromote();
   }

   public void gmTest(String op) {
      String[] arr = op.split(",");
      switch (arr[0]) {
         case "setlevel":
            this.gmSetLevel(Integer.parseInt(arr[1]));
            break;
         case "levellimit":
            this.gmSetLevelLimit(Integer.parseInt(arr[1]));
            break;
         case "lock":
            this.gmLock(Integer.parseInt(arr[1]));
            break;
         case "check":
            this.checkExtraLvLimit(11);
      }

   }

   private void gmSetLevel(int level) {
      HeroPromoteDao heroPromoteDao = (HeroPromoteDao)this.player.getData("tb_hero_promote", this.player.getPlayerId());
      heroPromoteDao.level = level;
      heroPromoteDao.stage = 0;
      heroPromoteDao.updateOp();
      this.sendPromoteInfo();
   }

   private void gmSetLevelLimit(int levelLimit) {
      HeroPromoteDao heroPromoteDao = (HeroPromoteDao)this.player.getData("tb_hero_promote", this.player.getPlayerId());
      heroPromoteDao.levelLimit = levelLimit;
      heroPromoteDao.updateOp();
      this.sendPromoteInfo();
   }

   private void gmLock(int state) {
      HeroPromoteDao heroPromoteDao = (HeroPromoteDao)this.player.getData("tb_hero_promote", this.player.getPlayerId());
      heroPromoteDao.state = state != 0;
      heroPromoteDao.updateOp();
      if (!heroPromoteDao.state) {
         this.gmSetLevel(0);
      } else {
         this.sendPromoteInfo();
      }

   }
}
