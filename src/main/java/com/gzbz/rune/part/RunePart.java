package com.gzbz.rune.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.HeroDao;
import com.gzbz.db.ItemBagDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.RuneLotteryDao;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.HeroModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.RuneBasicNatureModel;
import com.gzbz.model.RuneExpRewardsModel;
import com.gzbz.model.RuneLotteryBoxModel;
import com.gzbz.model.RuneLotteryLibModel;
import com.gzbz.model.RuneLotteryModel;
import com.gzbz.model.RuneMainModel;
import com.gzbz.model.RuneRefineLvNatureModel;
import com.gzbz.model.RuneRefineNatureModel;
import com.gzbz.model.RuneRefineNatureWeightModel;
import com.gzbz.model.RuneRefineNeedModel;
import com.gzbz.model.RuneStarNatureModel;
import com.gzbz.model.RuneSuitModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.RefineSpCostModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.RuneRefineRangeModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.RuneMsg;
import com.gzbz.rune.RuneMgr;
import com.gzbz.rune.bean.Rune;
import com.gzbz.rune.bean.RuneItem;
import com.gzbz.rune.bean.RunePropertiesAndSkills;
import com.gzbz.rune.bean.RuneRefineInheritItem;
import com.gzbz.rune.bean.RuneRefineNature;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import misc.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class RunePart extends PlayerPart {
   @Autowired
   private RuneMgr runeMgr;
   @Autowired
   private ConfigManager configManager;

   public void resetDaily() {
      RuneLotteryDao runeLotteryDao = (RuneLotteryDao)this.player.getData("tb_rune_lottery", this.player.getPlayerId());
      runeLotteryDao.reset();
      this.sendRuneLotteryInfo();
   }

   public void levelUp(int preLv, int newLv) {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      Integer runeSysOpen = (Integer)playerResetCustomCache.getForeverNum(45, 0);
      if (this.player.isSystemOpen(5020) && runeSysOpen <= 0) {
         ArrayList<Integer> runeGiveList = this.configManager.getIntList("RuneGive");
         if (runeGiveList == null || runeGiveList.size() < 0) {
            this.logger.error("config配置表缺少配置{}", "RuneGive");
            return;
         }

         List<ResourceModel> resourceModelList = new ArrayList();

         for(Integer runeId : runeGiveList) {
            resourceModelList.add(new ResourceModel(2, runeId, 1));
         }

         playerResetCustomCache.setForever(45, 1);
         this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 100, 10021, 0, 0, "");
      }

   }

   @MsgHandlerAnno
   public void C2S_RuneLotteryInfo_20301(RuneMsg.C2S_RuneLotteryInfo_20301 msg, String source) {
      this.sendRuneLotteryInfo();
   }

   private void sendRuneLotteryInfo() {
      RuneMsg.S2C_RuneLotteryInfo_20302.Builder resp = RuneMsg.S2C_RuneLotteryInfo_20302.newBuilder();
      RuneLotteryDao runeLotteryDao = (RuneLotteryDao)this.player.getData("tb_rune_lottery", this.player.getPlayerId());
      resp.setRuneLotteryCount(runeLotteryDao.lotteryCount);
      resp.setRuneLotteryPoint(runeLotteryDao.lotteryPoint);
      resp.addAllGotBoxes(runeLotteryDao.receiveBoxes);
      resp.setRuneLotteryFreeCount(runeLotteryDao.lotteryFreeCount);
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      resp.setDailyRuneLotteryCount((Integer)playerResetCustomCache.getDailyNum(41, 0));
      this.player.sendMsg(resp.build());
   }

   public boolean checkRuneBagLimit(int addCount) {
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      int bagSize = itemBagDao.runeBag.getBagSize();
      int maxCount = itemBagPart.getMaxCount(30);
      return bagSize + addCount <= maxCount;
   }

   @MsgHandlerAnno
   public void C2S_RuneLottery_20303(RuneMsg.C2S_RuneLottery_20303 msg, String source) {
      int type = msg.getType();
      RuneLotteryModel runeLotteryModel = (RuneLotteryModel)ApplicationContextProvider.getModelPoolEntity("RuneLottery", type);
      if (runeLotteryModel == null) {
         this.player.failure(0);
      } else {
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         int dailyCount = (Integer)playerResetCustomCache.getDailyNum(41, 0);
         if ((float)(dailyCount + runeLotteryModel.getTimes()) > ApplicationContextProvider.getConfigFloat("LotteryLimit", 99999.0F)) {
            this.player.failure(76029);
         } else if (!this.checkRuneBagLimit(runeLotteryModel.getTimes())) {
            this.player.failure(76127);
         } else {
            PlayerDao playerDao = this.player.getPlayerDao();
            SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 5000);
            RuneLotteryDao runeLotteryDao = (RuneLotteryDao)this.player.getData("tb_rune_lottery", this.player.getPlayerId());
            if (!runeLotteryDao.firstGot && playerDao.lv > systemFunctionModel.getLvLimitEx()) {
               runeLotteryDao.firstGot = true;
               runeLotteryDao.updateOp();
            }

            int freeCount = ApplicationContextProvider.getConfigInt("RunelotteryFreeNum", 1);
            long feeItem = 0L;
            long feeGold = 0L;
            if (runeLotteryModel.getTimes() == 1 && runeLotteryDao.lotteryFreeCount < freeCount) {
               ++runeLotteryDao.lotteryFreeCount;
            } else {
               ResourceModel itemResource = new ResourceModel((Integer)runeLotteryModel.getFirstItem().get(0), (Integer)runeLotteryModel.getFirstItem().get(1), (Integer)runeLotteryModel.getFirstItem().get(2));
               ResourceModel goldResource = new ResourceModel((Integer)runeLotteryModel.getReplaceItem().get(0), (Integer)runeLotteryModel.getReplaceItem().get(1), (Integer)runeLotteryModel.getReplaceItem().get(2));
               long itemRes = this.player.getResourceNum(itemResource.getType(), itemResource.getId());
               long needItemRes = (long)(Integer)runeLotteryModel.getFirstItem().get(2) - itemRes;
               if (needItemRes > 0L) {
                  feeGold = (long)(goldResource.getValue() / runeLotteryModel.getTimes()) * needItemRes;
                  if (!this.player.checkResourceNum(goldResource.getType(), goldResource.getId(), (int)feeGold)) {
                     this.player.failure(31);
                     return;
                  }

                  feeItem = itemRes;
               } else {
                  feeItem = (long)(Integer)runeLotteryModel.getFirstItem().get(2);
               }
            }

            List<ResourceModel> prizeList = new ArrayList();
            int lotteryCount = 0;
            if (runeLotteryModel.getType() == 1) {
               lotteryCount = this.runeLottery(prizeList, runeLotteryModel, runeLotteryDao.lotteryCount, runeLotteryDao.firstGot);
            } else {
               this.runeLottery(prizeList, runeLotteryModel, 0, runeLotteryDao.firstGot);
            }

            this.lotteryTriggerTask(runeLotteryModel.getTimes());
            if (feeItem > 0L) {
               this.player.delResource((Integer)runeLotteryModel.getFirstItem().get(0), (Integer)runeLotteryModel.getFirstItem().get(1), feeItem, 100, 10001, type, 0, "");
               this.player.getOperationMgr().addExtraLog(this.player, 216, String.valueOf(feeItem), String.valueOf(0));
            }

            if (feeGold > 0L) {
               this.player.delResource((Integer)runeLotteryModel.getReplaceItem().get(0), (Integer)runeLotteryModel.getReplaceItem().get(1), feeGold, 100, 10001, type, 0, "");
               this.player.getOperationMgr().addExtraLog(this.player, 216, String.valueOf(0), String.valueOf(feeGold));
            }

            runeLotteryDao.firstGot = true;
            runeLotteryDao.lotteryPoint += runeLotteryModel.getExReward();
            if (runeLotteryModel.getType() == 1) {
               runeLotteryDao.lotteryCount = lotteryCount;
            }

            runeLotteryDao.updateOp();
            playerResetCustomCache.setDailyReset(41, dailyCount + runeLotteryModel.getTimes());
            List<ResourceModel> runeLotteryLogResources = new ArrayList(prizeList);
            this.runeMgr.pushTask(() -> this.runeMgr.addRuneLotteryRecordList(runeLotteryLogResources, playerDao.playerId, playerDao.playerName));
            prizeList.addAll(runeLotteryModel.getRewards());
            this.player.addResource(prizeList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 100, 10002, type, 0, "");
            RuneMsg.S2C_RuneLottery_20304.Builder resp = RuneMsg.S2C_RuneLottery_20304.newBuilder();
            resp.setType(type);
            resp.setRuneLotteryCount(runeLotteryDao.lotteryCount);
            resp.setDailyRuneLotteryCount((Integer)playerResetCustomCache.getDailyNum(41, 0));
            this.player.sendMsg(resp.build());

            for(ResourceModel resourceModel : prizeList) {
               if (resourceModel.getType() == 2) {
                  ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", resourceModel.getId());
                  if (itemModel != null) {
                     this.player.getOperationMgr().addExtraLog(this.player, 216, String.valueOf(itemModel.getId()), itemModel.getName(), String.valueOf(resourceModel.getValue()));
                  }
               }
            }

         }
      }
   }

   public void lotteryTriggerTask(int lotteryNum) {
      this.player.triggerTask(681, 0, (long)lotteryNum, 1);
      this.player.triggerTask(706, 0, (long)lotteryNum, 1);
   }

   public int runeLottery(List<ResourceModel> prizeList, RuneLotteryModel runeLotteryModel, int curLotteryCount, boolean firstGot) {
      int finalLotteryCount = curLotteryCount;
      int floorNum = ApplicationContextProvider.getConfigInt("RuneLotteryFloorNum", 10);
      if (runeLotteryModel.getType() == 2) {
         floorNum = ApplicationContextProvider.getConfigInt("RuneTenLotteryFloorNum", 10);
      }

      Map<Integer, Map<Integer, RuneLotteryLibModel>> allRuneLotteryLibModelMap = ApplicationContextProvider.<Integer, Map<Integer, RuneLotteryLibModel>>getModelPoolMap("customRuneLotteryLib");

      for(int lotteryCount = 1; lotteryCount <= runeLotteryModel.getTimes(); ++lotteryCount) {
         ++finalLotteryCount;
         int floorLibId = runeLotteryModel.getOrdinaryLib();
         if (finalLotteryCount >= floorNum) {
            floorLibId = runeLotteryModel.getFloorLib();
            finalLotteryCount = 0;
         } else if (!firstGot) {
            firstGot = true;
            int runeFirstGet = ApplicationContextProvider.getConfigInt("runeFirstGet", 70065);
            prizeList.add(new ResourceModel(2, runeFirstGet, 1));
            continue;
         }

         Map<Integer, RuneLotteryLibModel> runeLotteryLibModelMap = (Map)allRuneLotteryLibModelMap.get(floorLibId);
         int totalRate = runeLotteryLibModelMap.values().stream().mapToInt(RuneLotteryLibModel::getRate).sum();
         int randomInt = RandomUtil.randInt(totalRate);
         int curRate = 0;
         RuneLotteryLibModel prizeModel = null;

         for(RuneLotteryLibModel runeLotteryLibModel : runeLotteryLibModelMap.values()) {
            curRate += runeLotteryLibModel.getRate();
            if (curRate > randomInt) {
               prizeModel = runeLotteryLibModel;
               break;
            }
         }

         if (prizeModel != null) {
            RuneMainModel runeMainModel = this.getRuneMainModel(prizeModel.getItemId());
            int runeLotteryResetQuality = ApplicationContextProvider.getConfigInt("RuneLotteryResetQuality", 5);
            if (runeMainModel != null && runeMainModel.getQuality() >= runeLotteryResetQuality) {
               finalLotteryCount = 0;
            }

            prizeList.add(new ResourceModel(prizeModel.getItemType(), prizeModel.getItemId(), prizeModel.getItemNum()));
         }
      }

      return finalLotteryCount;
   }

   @MsgHandlerAnno
   public void C2S_RuneLotteryBoxReward_20305(RuneMsg.C2S_RuneLotteryBoxReward_20305 msg, String source) {
      int id = msg.getId();
      Map<Integer, RuneLotteryBoxModel> runeLotteryBoxModelMap = ApplicationContextProvider.<Integer, RuneLotteryBoxModel>getModelPoolMap("RuneLotteryBox");
      RuneLotteryBoxModel runeLotteryBoxModel = (RuneLotteryBoxModel)runeLotteryBoxModelMap.get(id);
      if (runeLotteryBoxModel == null) {
         this.player.failure(0);
      } else {
         RuneLotteryDao runeLotteryDao = (RuneLotteryDao)this.player.getData("tb_rune_lottery", this.player.getPlayerId());
         if (runeLotteryDao.lotteryPoint >= runeLotteryBoxModel.getNeedPoint() && runeLotteryDao.lotteryPoint >= runeLotteryBoxModel.getConsumePoint()) {
            if (runeLotteryDao.receiveBoxes.contains(id)) {
               this.player.failure(24);
            } else {
               runeLotteryDao.receiveBoxes.add(id);
               if (runeLotteryDao.receiveBoxes.size() >= runeLotteryBoxModelMap.size()) {
                  int maxId = runeLotteryBoxModelMap.keySet().stream().mapToInt((value) -> value).max().orElse(999);
                  runeLotteryDao.lotteryPoint -= ((RuneLotteryBoxModel)runeLotteryBoxModelMap.getOrDefault(maxId, new RuneLotteryBoxModel())).getConsumePoint();
                  runeLotteryDao.receiveBoxes.clear();
               }

               runeLotteryDao.updateOp();
               this.player.addResource(2, runeLotteryBoxModel.getBoxId(), 1, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 100, 10003, runeLotteryBoxModel.getId(), 1, "");
               RuneMsg.S2C_RuneLotteryBoxReward_20306.Builder resp = RuneMsg.S2C_RuneLotteryBoxReward_20306.newBuilder();
               resp.setId(id);
               resp.setRuneLotteryPoint(runeLotteryDao.lotteryPoint);
               this.player.sendMsg(resp.build());
            }
         } else {
            this.player.failure(36);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_RuneLotteryRecordList_20307(RuneMsg.C2S_RuneLotteryRecordList_20307 msg, String source) {
      this.player.sendMsg(this.runeMgr.buildRuneLotteryRecordListMsg(msg.getType(), this.player.getPlayerId()));
   }

   @MsgHandlerAnno
   public void C2S_RuneAndRefineInfo_20310(RuneMsg.C2S_RuneAndRefineInfo_20310 msg, String source) {
      this.sendRuneAndRefineInfo(msg.getHeroCode());
   }

   public void sendRuneAndRefineInfo(int heroCode) {
      RuneMsg.S2C_RuneAndRefineInfo_20311.Builder respondBuilder = RuneMsg.S2C_RuneAndRefineInfo_20311.newBuilder();
      respondBuilder.setHeroCode(heroCode);
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      respondBuilder.setRuneAndRefineInfo(heroDao.toBuilderRuneAndRefineInfo());
      this.player.sendMsg(respondBuilder.build());
   }

   public int getRuneInitLv() {
      int runeInitLv = ApplicationContextProvider.getConfigInt("RuneInitLv", 1);
      return runeInitLv;
   }

   public RuneItem getRuneItemFromBag(int itemCode) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      RuneItem runeItem = itemBagDao.runeBag.getItemByCode(itemCode);
      return runeItem;
   }

   public Rune getRuneFromHero(int heroCode) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      return heroDao.rune;
   }

   public void updateHeroData(int heroCode) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      heroDao.updateOp();
   }

   public void updateHeroDaoAndFlush(int heroCode, boolean sendRuneAndRefineMsg) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      heroDao.updateOp();
      heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_RUNE, heroDao);
      if (sendRuneAndRefineMsg) {
         this.sendRuneAndRefineInfo(heroCode);
      }

   }

   public RuneItem heroWearRune(HeroDao heroDao, CommonMsg.RunePosition position, RuneItem runeItem) {
      RuneMainModel runeMainModel = this.getRuneMainModel(runeItem.id);
      if (runeMainModel.getSeat() != position.getNumber()) {
         this.player.failure(76088);
         return null;
      } else {
         RuneItem heroRuneItem = (RuneItem)heroDao.rune.runeMap.get(position.getNumber());
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         RuneItem replaceRuneItem = new RuneItem();
         if (heroRuneItem != null) {
            RuneItem addRuneItem = itemBagPart.addRuneItem(heroRuneItem, 100, 10004, 0, 0, "");
            if (null != addRuneItem) {
               replaceRuneItem = addRuneItem;
               this.player.additemUpdateBuilder(addRuneItem);
               this.player.senditemUpdateMsg();
            }
         }

         heroDao.rune.runeMap.put(position.getNumber(), runeItem);
         heroDao.updateOp();
         itemBagPart.deleteItemByCode(runeItem.code, 1, 100, 10005, 0, 0, "");
         this.player.senditemUpdateMsg();
         return replaceRuneItem;
      }
   }

   public RuneItem heroUndressRune(HeroDao heroDao, CommonMsg.RunePosition position) {
      RuneItem heroRuneItem = (RuneItem)heroDao.rune.runeMap.get(position.getNumber());
      if (null == heroRuneItem) {
         this.logger.info("该位置没有符文 position:{}", position.getNumber());
         return null;
      } else {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         RuneItem addRuneItem = itemBagPart.addRuneItem(heroRuneItem, 100, 10004, 0, 0, "");
         if (null != addRuneItem) {
            this.player.additemUpdateBuilder(addRuneItem);
            this.player.senditemUpdateMsg();
         }

         heroDao.rune.runeMap.remove(position.getNumber());
         heroDao.updateOp();
         return addRuneItem;
      }
   }

   public RuneMainModel getRuneMainModel(int runeId) {
      RuneMainModel model = (RuneMainModel)this.player.getGameModelPool().getEntity("RuneMain", runeId);
      if (null == model) {
         this.logger.error("RuneMain配置为空 id:{}", runeId);
      }

      return model;
   }

   public RuneSuitModel getRuneSuitModel(int id) {
      RuneSuitModel runeSuitModel = (RuneSuitModel)ApplicationContextProvider.getModelPoolEntity("RuneSuit", id);
      if (null == runeSuitModel) {
         this.logger.error("RuneSuit表缺少配置 id:{}", id);
      }

      return runeSuitModel;
   }

   public RuneBasicNatureModel getRuneBasicNatureModel(int runeId, int level) {
      RuneMainModel runeMainModel = this.getRuneMainModel(runeId);
      if (null == runeMainModel) {
         return null;
      } else {
         int seat = runeMainModel.getSeat();
         int quality = runeMainModel.getQuality();
         String mapKey = level + "_" + seat + "_" + quality;
         RuneBasicNatureModel runeBasicNatureModel = (RuneBasicNatureModel)this.player.getGameModelPool().getEntity("customRuneBasicNature", mapKey);
         if (null == runeBasicNatureModel) {
            this.logger.error("RuneBasicNature 配置错误 level:{},seat:{},quality:{}", new Object[]{level, seat, quality});
         }

         return runeBasicNatureModel;
      }
   }

   public RuneStarNatureModel getRuneStarNatureModel(int starNatureId) {
      RuneStarNatureModel runeStarNatureModel = (RuneStarNatureModel)this.player.getGameModelPool().getEntity("RuneStarNature", starNatureId);
      if (null == runeStarNatureModel) {
         this.logger.error("RuneStarNature 表配置出错 starNatureId:{}", starNatureId);
      }

      return runeStarNatureModel;
   }

   @MsgHandlerAnno
   public boolean C2S_WearRune_20312(RuneMsg.C2S_WearRune_20312 msg, String source) {
      if (!this.player.isSystemOpen(5020)) {
         return this.player.failure(21);
      } else {
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
         if (heroDao == null) {
            return this.player.failure(76109);
         } else if (HeroModel.isReplacementHero(heroDao.id)) {
            return false;
         } else {
            RuneItem runeItem = this.getRuneItemFromBag(msg.getItemCode());
            if (runeItem == null) {
               return this.player.failure(76108);
            } else {
               RuneMainModel itemBagRuneMainModel = this.getRuneMainModel(runeItem.id);
               if (null == itemBagRuneMainModel) {
                  return this.player.failure(76099);
               } else {
                  boolean isReplace = false;
                  RuneItem heroRuneItem = (RuneItem)heroDao.rune.runeMap.get(msg.getPosition().getNumber());
                  if (heroRuneItem != null) {
                     RuneMainModel heroRuneMainModel = this.getRuneMainModel(heroRuneItem.id);
                     if (null == heroRuneMainModel) {
                        return this.player.failure(76099);
                     }

                     int heroRuneQuality = heroRuneMainModel.getQuality();
                     int bagRuneQuality = itemBagRuneMainModel.getQuality();
                     int heroRuneLv = heroRuneItem.level;
                     int bagRuneLv = runeItem.level;
                     if (heroRuneQuality <= bagRuneQuality && heroRuneLv > bagRuneLv) {
                        isReplace = true;
                     }
                  }

                  RuneItem replaceRuneItem = this.heroWearRune(heroDao, msg.getPosition(), runeItem);
                  if (null == replaceRuneItem) {
                     return false;
                  } else {
                     this.updateHeroDaoAndFlush(msg.getHeroCode(), true);
                     RunePropertiesAndSkills suitProAndSkillIdList = heroDao.getSuitProAndSkillIdList();
                     if (suitProAndSkillIdList != null && suitProAndSkillIdList.getSkill4SuitModelId() > 0) {
                        RuneSuitModel runeSuitModel = this.getRuneSuitModel(suitProAndSkillIdList.getSkill4SuitModelId());
                        if (null != runeSuitModel) {
                           this.player.triggerTask(705, runeSuitModel.getMinRuneQuality(), 1L, 3);
                        }
                     }

                     if (itemBagRuneMainModel != null) {
                        GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
                        giftPart.triggerTimeLimitGift(30, itemBagRuneMainModel.getQuality(), true);
                     }

                     RuneMsg.S2C_WearRune_20313.Builder builder = RuneMsg.S2C_WearRune_20313.newBuilder();
                     builder.setHeroCode(msg.getHeroCode());
                     if (isReplace) {
                        builder.setPosition(msg.getPosition());
                        builder.setItemCode(replaceRuneItem.code);
                        builder.setCallReplaceLv(true);
                     }

                     this.player.sendMsg(builder.build());
                     return true;
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_RuneLvChange_20342(RuneMsg.C2S_RuneLvChange_20342 msg, String source) {
      Rune runeFromHero = this.getRuneFromHero(msg.getHeroCode());
      if (null == runeFromHero) {
         this.logger.info("runeFromHero 为 null,heroCode:{}", msg.getHeroCode());
         return this.player.failure(6);
      } else {
         RuneItem heroRuneItem = (RuneItem)runeFromHero.runeMap.get(msg.getPosition().getNumber());
         if (null == heroRuneItem) {
            return this.player.failure(76091);
         } else {
            RuneItem bagRuneItem = this.getRuneItemFromBag(msg.getItemCode());
            if (null == bagRuneItem) {
               this.logger.info("背包里未找到该道具 itemCode:{}", msg.getItemCode());
               return this.player.failure(6);
            } else {
               RuneMainModel heroRuneMainModel = this.getRuneMainModel(heroRuneItem.id);
               RuneMainModel bagRuneMainModel = this.getRuneMainModel(bagRuneItem.id);
               if (null != heroRuneMainModel && bagRuneMainModel != null) {
                  int heroRuneItemLevel = heroRuneItem.level;
                  int heroRuneItemUpgradeProgress = heroRuneItem.upgradeProgress;
                  int heroRuneMainModelQuality = heroRuneMainModel.getQuality();
                  int bagRuneItemLevel = bagRuneItem.level;
                  int bagRuneItemUpgradeProgress = bagRuneItem.upgradeProgress;
                  int bagRuneMainModelQuality = bagRuneMainModel.getQuality();
                  if (bagRuneMainModelQuality <= heroRuneMainModelQuality && bagRuneItemLevel > heroRuneItemLevel) {
                     heroRuneItem.level = bagRuneItemLevel;
                     heroRuneItem.upgradeProgress = bagRuneItemUpgradeProgress;
                     bagRuneItem.level = heroRuneItemLevel;
                     bagRuneItem.upgradeProgress = heroRuneItemUpgradeProgress;
                     this.updateHeroDaoAndFlush(msg.getHeroCode(), true);
                     ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                     itemBagPart.updateOp();
                     this.player.additemUpdateBuilder(bagRuneItem);
                     this.player.senditemUpdateMsg();
                  }

                  RuneMsg.S2C_RuneLvChange_20343.Builder resp = RuneMsg.S2C_RuneLvChange_20343.newBuilder();
                  this.player.sendMsg(resp.build());
                  return true;
               } else {
                  return this.player.failure(76099);
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_UndressRune_20314(RuneMsg.C2S_UndressRune_20314 msg, String source) {
      if (!this.player.isSystemOpen(5020)) {
         return this.player.failure(21);
      } else {
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
         if (heroDao == null) {
            this.logger.info("英雄不存在：" + msg.getHeroCode());
            return false;
         } else {
            RuneItem undressRuneItem = this.heroUndressRune(heroDao, msg.getPosition());
            if (Objects.isNull(undressRuneItem)) {
               return false;
            } else {
               this.player.additemUpdateBuilder(undressRuneItem);
               this.player.senditemUpdateMsg();
               this.updateHeroDaoAndFlush(msg.getHeroCode(), true);
               RuneMsg.S2C_UndressRune_20315.Builder builder = RuneMsg.S2C_UndressRune_20315.newBuilder();
               builder.setHeroCode(msg.getHeroCode());
               builder.setPosition(msg.getPosition());
               this.player.sendMsg(builder.build());
               return true;
            }
         }
      }
   }

   public List<ResourceModel> getReturnRewardsByRuneItem(RuneItem runeItem, boolean addRuneMainExp) {
      if (null == runeItem) {
         return new ArrayList();
      } else {
         List<RuneItem> runeItemList = new ArrayList();
         runeItemList.add(runeItem);
         List<ResourceModel> returnRewardsByRuneItemList = this.getReturnRewardsByRuneItemList(runeItemList, addRuneMainExp);
         return returnRewardsByRuneItemList;
      }
   }

   public List<ResourceModel> getReturnRewardsByRuneItemList(List<RuneItem> runeItemList, boolean addRuneMainExp) {
      List<ResourceModel> returnResourceList = new ArrayList();
      if (null != runeItemList && runeItemList.size() > 0) {
         int allExp = 0;

         for(RuneItem runeItem : runeItemList) {
            RuneMainModel runeMainModel = this.getRuneMainModel(runeItem.id);
            if (runeMainModel == null) {
               this.logger.info("RuneMain未找到对应配置,runeId={}", runeItem.id);
            } else {
               int addMainEX = 0;
               int addLevelEx = 0;
               int addUpgradeProgress = 0;
               if (addRuneMainExp) {
                  int num = runeItem.getNum();
                  addMainEX = runeMainModel.getProEX() * num;
               }

               if (runeMainModel.getSeat() > 0) {
                  RuneBasicNatureModel runeBasicNatureModel = this.getRuneBasicNatureModel(runeItem.id, runeItem.level);
                  if (null != runeBasicNatureModel) {
                     addLevelEx = runeBasicNatureModel.getProEX();
                  }

                  addUpgradeProgress = runeItem.upgradeProgress;
               }

               allExp = allExp + addMainEX + addLevelEx + addUpgradeProgress;
            }
         }

         returnResourceList.addAll(this.getReturnRewardsByExp(allExp));
         return returnResourceList;
      } else {
         return returnResourceList;
      }
   }

   public List<ResourceModel> getReturnRewardsByExp(int exp) {
      List<ResourceModel> rewardList = new ArrayList();
      Map<Integer, RuneExpRewardsModel> runeExpRewardMap = this.player.getGameModelPool().getMap("RuneExpRewards");

      for(Integer e : runeExpRewardMap.keySet().stream().sorted((o1, o2) -> o2 - o1).collect(Collectors.toList())) {
         if (e > 0 && exp / e > 0) {
            int multiple = exp / e;
            exp -= multiple * e;
            RuneExpRewardsModel model = (RuneExpRewardsModel)runeExpRewardMap.get(e);

            for(int i = 0; i < multiple; ++i) {
               for(ResourceModel reward : model.getRewards()) {
                  ResourceModel.addResourceToList(rewardList, reward);
               }
            }
         }
      }

      return rewardList;
   }

   public Map<Integer, Integer> runeStrengthen(RuneItem runeItem, Map<Integer, Integer> costItemMap) {
      Map<Integer, Integer> realCostItemMap = new HashMap();
      if (runeItem != null && costItemMap != null && costItemMap.size() > 0) {
         RuneMainModel runeMainModel = this.getRuneMainModel(runeItem.id);
         if (runeMainModel == null) {
            this.logger.info("RuneMain未找到对应配置,runeId={}", runeItem.id);
            return realCostItemMap;
         } else if (runeItem.level >= runeMainModel.getLevelTop()) {
            this.player.failure(76089);
            return realCostItemMap;
         } else {
            for(Map.Entry<Integer, Integer> entry : costItemMap.entrySet()) {
               Integer itemCode = (Integer)entry.getKey();
               Integer num = (Integer)entry.getValue();
               RuneItem costRuneItem = this.getRuneItemFromBag(itemCode);
               if (costRuneItem == null) {
                  this.logger.error("item 为空 itemCode={}", itemCode);
                  return realCostItemMap;
               }

               if (costRuneItem.getNum() < num) {
                  this.logger.error("itemCode={} 道具数量不足 拥有num={},needNum={}", new Object[]{itemCode, costRuneItem.getNum(), num});
                  return realCostItemMap;
               }

               RuneMainModel costRuneMainModel = this.getRuneMainModel(costRuneItem.id);
               if (costRuneMainModel == null) {
                  this.logger.info("RuneMain未找到对应配置,runeId={}", costRuneItem.id);
                  return realCostItemMap;
               }

               int addMainEX = costRuneMainModel.getProEX() * num;
               int addLevelEx = 0;
               int costRuneItemUpgradeProgress = 0;
               if (costRuneMainModel.getSeat() > 0) {
                  RuneBasicNatureModel costRuneBasicNatureModel = this.getRuneBasicNatureModel(costRuneItem.id, costRuneItem.level);
                  if (null != costRuneBasicNatureModel) {
                     addLevelEx = costRuneBasicNatureModel.getProEX();
                  }

                  costRuneItemUpgradeProgress = costRuneItem.upgradeProgress;
               }

               int upgradeProgress = runeItem.upgradeProgress;
               int postEx = upgradeProgress + addMainEX + addLevelEx + costRuneItemUpgradeProgress;
               boolean isBreakUpLv = false;

               do {
                  RuneBasicNatureModel runeBasicNatureModel = this.getRuneBasicNatureModel(runeMainModel.getId(), runeItem.level);
                  if (null == runeBasicNatureModel) {
                     this.logger.error("RuneBasicNature 缺少等级数据 runeId:{},level{}", runeMainModel.getId(), runeItem.level);
                     this.player.failure(37);
                     return realCostItemMap;
                  }

                  int levelUpNeedEX = runeBasicNatureModel.getLevelUpNeedEX();
                  if (levelUpNeedEX <= 0) {
                     this.logger.error("RuneBasicNature levelUpNeedEX字段配置错误 id:{}", runeBasicNatureModel.getLevelUpNeedEX());
                     return realCostItemMap;
                  }

                  if (postEx >= levelUpNeedEX) {
                     ++runeItem.level;
                     postEx -= levelUpNeedEX;
                  }

                  if (postEx < levelUpNeedEX) {
                     runeItem.upgradeProgress = postEx;
                     isBreakUpLv = true;
                  }

                  if (runeItem.level >= runeMainModel.getLevelTop()) {
                     runeItem.upgradeProgress = 0;
                     List<ResourceModel> rewardsByExp = this.getReturnRewardsByExp(postEx);
                     this.player.addResource(rewardsByExp, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 100, 10007, 0, 0, "");
                     isBreakUpLv = true;
                  }
               } while(!isBreakUpLv);

               realCostItemMap.put(itemCode, num);
            }

            return realCostItemMap;
         }
      } else {
         this.logger.error("runeStrengthen参数有误");
         return realCostItemMap;
      }
   }

   public boolean checkBeConsumedIf(Set<Integer> costItemCodeSet) {
      if (null != costItemCodeSet && costItemCodeSet.size() > 0) {
         for(Integer itemCode : costItemCodeSet) {
            RuneItem runeItemFromBag = this.getRuneItemFromBag(itemCode);
            if (null == runeItemFromBag) {
               this.logger.error("背包未找到符文道具 itemCode:{}", itemCode);
               return false;
            }

            RuneMainModel runeMainModel = this.getRuneMainModel(runeItemFromBag.id);
            if (null == runeMainModel) {
               return this.player.failure(76099);
            }

            if (runeMainModel.getBeConsumedIf() <= 0) {
               return this.player.failure(76090);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Strengthen_20316(RuneMsg.C2S_Strengthen_20316 msg, String source) {
      List<CommonMsg.MapDataII> costItemsList = msg.getCostItemsList();
      if (costItemsList != null && costItemsList.size() > 0) {
         Map<Integer, Integer> costItemMap = new HashMap();

         for(CommonMsg.MapDataII mapDataII : costItemsList) {
            int itemCode = mapDataII.getKey();
            int num = mapDataII.getValue();
            costItemMap.put(itemCode, num);
         }

         if (!this.checkBeConsumedIf(costItemMap.keySet())) {
            return false;
         } else {
            ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
            RuneMsg.S2C_Strengthen_20317.Builder builder = RuneMsg.S2C_Strengthen_20317.newBuilder();
            builder.setWearState(msg.getWearState());
            if (msg.getWearState() == 0) {
               RuneItem runeItemFromBag = this.getRuneItemFromBag(msg.getItemCode());
               if (null == runeItemFromBag) {
                  this.logger.info("itemCode={} is null", msg.getItemCode());
                  return this.player.failure(6);
               }

               int oldLevel = runeItemFromBag.level;
               Map<Integer, Integer> realCostItemMap = this.runeStrengthen(runeItemFromBag, costItemMap);
               int newLevel = runeItemFromBag.level;
               if (realCostItemMap.size() > 0) {
                  itemBagPart.updateOp();

                  for(Map.Entry<Integer, Integer> costEntry : realCostItemMap.entrySet()) {
                     Integer costItemCode = (Integer)costEntry.getKey();
                     Integer needNum = (Integer)costEntry.getValue();
                     itemBagPart.deleteItemByCode(costItemCode, needNum, 100, 10006, 0, 0, "");
                  }

                  this.player.senditemUpdateMsg();
               }

               builder.setItemCode(msg.getItemCode());
               builder.setUpgradeProgress(runeItemFromBag.upgradeProgress);
               builder.setLevel(runeItemFromBag.level);
               if (oldLevel != newLevel) {
                  builder.setIsUpgrade(true);
                  if (newLevel > oldLevel) {
                     this.player.triggerTask(704, 0, (long)(newLevel - oldLevel), 1);
                  }
               } else {
                  builder.setIsUpgrade(false);
               }
            } else {
               if (msg.getWearState() != 1) {
                  return this.player.failure(6);
               }

               Rune runeFromHero = this.getRuneFromHero(msg.getHeroCode());
               if (null == runeFromHero) {
                  this.logger.info("runeFromHero 为 null,heroCode:{}", msg.getHeroCode());
                  return this.player.failure(6);
               }

               RuneItem runeItem = (RuneItem)runeFromHero.runeMap.get(msg.getPosition().getNumber());
               if (null == runeItem) {
                  return this.player.failure(76091);
               }

               int oldLevel = runeItem.level;
               Map<Integer, Integer> realCostItemMap = this.runeStrengthen(runeItem, costItemMap);
               int newLevel = runeItem.level;
               if (realCostItemMap.size() > 0) {
                  itemBagPart.updateOp();

                  for(Map.Entry<Integer, Integer> costEntry : realCostItemMap.entrySet()) {
                     Integer costItemCode = (Integer)costEntry.getKey();
                     Integer needNum = (Integer)costEntry.getValue();
                     itemBagPart.deleteItemByCode(costItemCode, needNum, 100, 10006, 0, 0, "");
                  }

                  this.player.senditemUpdateMsg();
               }

               builder.setHeroCode(msg.getHeroCode());
               builder.setPosition(msg.getPosition());
               builder.setUpgradeProgress(runeItem.upgradeProgress);
               builder.setLevel(runeItem.level);
               if (oldLevel != newLevel) {
                  builder.setIsUpgrade(true);
                  if (newLevel > oldLevel) {
                     this.player.triggerTask(704, 0, (long)(newLevel - oldLevel), 1);
                  }
               } else {
                  builder.setIsUpgrade(false);
               }

               this.updateHeroDaoAndFlush(msg.getHeroCode(), true);
            }

            this.player.sendMsg(builder.build());
            return true;
         }
      } else {
         this.logger.error("强化失败——未选择消耗符文");
         return this.player.failure(6);
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Fusion_20318(RuneMsg.C2S_Fusion_20318 msg, String source) {
      RuneMainModel runeMainModel = this.getRuneMainModel(msg.getFunctionRuneId());
      if (null == runeMainModel) {
         return this.player.failure(37);
      } else if (runeMainModel.getBeFusionIf() <= 0) {
         return this.player.failure(76093);
      } else if (!this.player.checkResourceNum((List)runeMainModel.getFusionCost())) {
         return this.player.failure(76092);
      } else {
         List<Integer> costItemCodeList = this.intDistinct(msg.getCostItemCodesList());
         int fusionNum = costItemCodeList.size();
         if (msg.getWearState() == 1) {
            Rune runeFromHero = this.getRuneFromHero(msg.getHeroCode());
            RuneItem heroRuneItem = (RuneItem)runeFromHero.runeMap.get(msg.getPosition().getNumber());
            if (null == heroRuneItem) {
               this.logger.error("heroCode:{} position:{} 未找到装备符文", msg.getHeroCode(), msg.getPosition().getNumber());
               return this.player.failure(6);
            }

            RuneMainModel heroRuneMainModel = this.getRuneMainModel(heroRuneItem.id);
            if (null == heroRuneMainModel) {
               return this.player.failure(37);
            }

            if (heroRuneMainModel.getQuality() != runeMainModel.getFusionNeedQuality()) {
               return this.player.failure(76095);
            }

            if (heroRuneMainModel.getFusionIf() <= 0) {
               return this.player.failure(76093);
            }

            if (runeMainModel.getSeat() != msg.getPosition().getNumber()) {
               return this.player.failure(76088);
            }

            ++fusionNum;
         }

         if (fusionNum != runeMainModel.getFusionNeedNum()) {
            return this.player.failure(76094);
         } else {
            List<RuneItem> costRuneItemList = new ArrayList();

            for(Integer itemCode : costItemCodeList) {
               RuneItem runeItemFromBag = this.getRuneItemFromBag(itemCode);
               if (null == runeItemFromBag) {
                  this.logger.info("背包里未找到该道具 itemCode:{}", itemCode);
                  return this.player.failure(6);
               }

               RuneMainModel costRuneModel = this.getRuneMainModel(runeItemFromBag.id);
               if (null == costRuneModel) {
                  this.logger.info("配置表RuneMain 未找到对应数据 id:{}", runeItemFromBag.id);
                  return this.player.failure(37);
               }

               if (costRuneModel.getQuality() != runeMainModel.getFusionNeedQuality()) {
                  return this.player.failure(76095);
               }

               if (costRuneModel.getFusionIf() <= 0) {
                  return this.player.failure(76093);
               }

               costRuneItemList.add(runeItemFromBag);
            }

            List<ResourceModel> returnRewardsByRuneItemList = this.getReturnRewardsByRuneItemList(costRuneItemList, false);
            if (msg.getWearState() == 1) {
               Rune runeFromHero = this.getRuneFromHero(msg.getHeroCode());
               RuneItem heroRuneItem = (RuneItem)runeFromHero.runeMap.get(msg.getPosition().getNumber());
               heroRuneItem.id = runeMainModel.getId();
               this.updateHeroDaoAndFlush(msg.getHeroCode(), true);
            } else {
               returnRewardsByRuneItemList.add(new ResourceModel(2, runeMainModel.getId(), 1));
            }

            this.player.addResource(returnRewardsByRuneItemList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 100, 10009, 0, 0, "");
            ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
            itemBagPart.deleteItemByCodes(costItemCodeList, 100, 10008, 0, 0, "");
            this.player.delResource((List)runeMainModel.getFusionCost(), 100, 10008, 0, 0, "");
            this.player.triggerTask(702, runeMainModel.getQuality(), 1L, 1);
            RuneMsg.S2C_Fusion_20319.Builder builder = RuneMsg.S2C_Fusion_20319.newBuilder();
            this.player.sendMsg(builder.build());
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_UpQuality_20320(RuneMsg.C2S_UpQuality_20320 msg, String source) {
      if (msg.getWearState() == 0) {
         RuneItem runeItemFromBag = this.getRuneItemFromBag(msg.getItemCode());
         if (null == runeItemFromBag) {
            this.logger.info("itemCode={} is null", msg.getItemCode());
            return this.player.failure(6);
         }

         RuneMainModel runeMainModel = this.getRuneMainModel(runeItemFromBag.id);
         if (null == runeMainModel) {
            return this.player.failure(37);
         }

         if (runeMainModel.getUpQualityIf() <= 0) {
            return this.player.failure(76096);
         }

         if (!this.player.checkResourceNum((List)runeMainModel.getUpQCost())) {
            return this.player.failure(76097);
         }

         runeItemFromBag.id = runeMainModel.getAfterUpQualityId();
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         itemBagPart.updateOp();
         itemBagPart.sendBagData(30);
         this.player.delResource((List)runeMainModel.getUpQCost(), 100, 10010, 0, 0, "");
      } else {
         if (msg.getWearState() != 1) {
            return this.player.failure(6);
         }

         Rune runeFromHero = this.getRuneFromHero(msg.getHeroCode());
         if (null == runeFromHero) {
            this.logger.info("runeFromHero 为 null,heroCode:{}", msg.getHeroCode());
            return this.player.failure(6);
         }

         RuneItem runeItem = (RuneItem)runeFromHero.runeMap.get(msg.getPosition().getNumber());
         if (null == runeItem) {
            return this.player.failure(76091);
         }

         RuneMainModel runeMainModel = this.getRuneMainModel(runeItem.id);
         if (null == runeMainModel) {
            return this.player.failure(37);
         }

         if (runeMainModel.getUpQualityIf() <= 0) {
            return this.player.failure(76096);
         }

         if (!this.player.checkResourceNum((List)runeMainModel.getUpQCost())) {
            return this.player.failure(76097);
         }

         runeItem.id = runeMainModel.getAfterUpQualityId();
         this.updateHeroDaoAndFlush(msg.getHeroCode(), true);
         this.player.delResource((List)runeMainModel.getUpQCost(), 100, 10010, 0, 0, "");
      }

      RuneMsg.S2C_UpQuality_20321.Builder builder = RuneMsg.S2C_UpQuality_20321.newBuilder();
      this.player.sendMsg(builder.build());
      return true;
   }

   @MsgHandlerAnno
   public boolean C2S_Change_20322(RuneMsg.C2S_Change_20322 msg, String source) {
      if (msg.getWearState() == 0) {
         RuneItem runeItemFromBag = this.getRuneItemFromBag(msg.getItemCode());
         if (null == runeItemFromBag) {
            this.logger.info("itemCode={} is null", msg.getItemCode());
            return this.player.failure(6);
         }

         RuneMainModel runeMainModel = this.getRuneMainModel(runeItemFromBag.id);
         if (null == runeMainModel) {
            return this.player.failure(37);
         }

         if (runeMainModel.getChangeIf() <= 0) {
            return this.player.failure(76098);
         }

         RuneMainModel targetRuneModel = this.getRuneMainModel(msg.getTargetRuneId());
         if (null == targetRuneModel) {
            return this.player.failure(76099);
         }

         if (targetRuneModel.getChangeIf() <= 0) {
            return this.player.failure(76098);
         }

         if (runeMainModel.getSeat() != targetRuneModel.getSeat() || runeMainModel.getQuality() != targetRuneModel.getQuality()) {
            return this.player.failure(76098);
         }

         if (!this.player.checkResourceNum((List)runeMainModel.getChangeCost())) {
            return this.player.failure(76100);
         }

         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         RuneItem runeItemFromBagClone = new RuneItem(0, runeItemFromBag);
         runeItemFromBagClone.id = targetRuneModel.getId();
         RuneItem targetRuneItem = itemBagPart.addRuneItem(runeItemFromBagClone, 100, 10020, 0, 0, "");
         if (null == targetRuneItem) {
            this.logger.error("符文置换时生成目标符文失败");
            return this.player.failure(6);
         }

         this.player.additemUpdateBuilder(targetRuneItem);
         itemBagPart.deleteItemByCode(runeItemFromBag.code, runeItemFromBag.getNum(), 100, 10020, 0, 0, "");
         this.player.senditemUpdateMsg();
         this.player.addResourceMsg(targetRuneItem);
         this.player.sendResourceMsg();
         this.player.delResource((List)runeMainModel.getChangeCost(), 100, 10012, 0, 0, "");
      } else {
         if (msg.getWearState() != 1) {
            return this.player.failure(6);
         }

         Rune runeFromHero = this.getRuneFromHero(msg.getHeroCode());
         RuneItem runeItem = (RuneItem)runeFromHero.runeMap.get(msg.getPosition().getNumber());
         if (null == runeItem) {
            this.logger.info("itemCode={} is null", msg.getItemCode());
            return this.player.failure(6);
         }

         RuneMainModel runeMainModel = this.getRuneMainModel(runeItem.id);
         if (null == runeMainModel) {
            return this.player.failure(37);
         }

         if (runeMainModel.getChangeIf() <= 0) {
            return this.player.failure(76098);
         }

         RuneMainModel targetRuneModel = this.getRuneMainModel(msg.getTargetRuneId());
         if (null == targetRuneModel) {
            return this.player.failure(76099);
         }

         if (targetRuneModel.getChangeIf() <= 0) {
            return this.player.failure(76098);
         }

         if (runeMainModel.getSeat() != targetRuneModel.getSeat() || runeMainModel.getQuality() != targetRuneModel.getQuality()) {
            return this.player.failure(76098);
         }

         if (!this.player.checkResourceNum((List)runeMainModel.getChangeCost())) {
            return this.player.failure(76100);
         }

         runeItem.id = targetRuneModel.getId();
         this.updateHeroDaoAndFlush(msg.getHeroCode(), true);
         this.player.delResource((List)runeMainModel.getChangeCost(), 100, 10012, 0, 0, "");
      }

      RuneMsg.S2C_Change_20323.Builder builder = RuneMsg.S2C_Change_20323.newBuilder();
      this.player.sendMsg(builder.build());
      return true;
   }

   @MsgHandlerAnno
   public boolean C2S_Reset_20324(RuneMsg.C2S_Reset_20324 msg, String source) {
      if (msg.getWearState() == 0) {
         RuneItem runeItemFromBag = this.getRuneItemFromBag(msg.getItemCode());
         if (null == runeItemFromBag) {
            this.logger.info("itemCode={} is null", msg.getItemCode());
            return this.player.failure(6);
         }

         if (runeItemFromBag.level <= this.getRuneInitLv() && runeItemFromBag.upgradeProgress <= 0) {
            return this.player.failure(76101);
         }

         RuneMainModel runeMainModel = this.getRuneMainModel(runeItemFromBag.id);
         if (null == runeMainModel) {
            return this.player.failure(37);
         }

         int allExp = 0;
         if (runeItemFromBag.upgradeProgress > 0) {
            allExp += runeItemFromBag.upgradeProgress;
         }

         RuneBasicNatureModel runeBasicNatureModel = this.getRuneBasicNatureModel(runeItemFromBag.id, runeItemFromBag.level);
         if (null != runeBasicNatureModel) {
            allExp += runeBasicNatureModel.getProEX();
         }

         runeItemFromBag.level = this.getRuneInitLv();
         runeItemFromBag.upgradeProgress = 0;
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         itemBagPart.updateOp();
         List<ResourceModel> returnRewardsByExp = this.getReturnRewardsByExp(allExp);
         if (returnRewardsByExp.size() > 0) {
            this.player.addResource(returnRewardsByExp, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 100, 10014, 0, 0, "");
         }
      } else {
         if (msg.getWearState() != 1) {
            return this.player.failure(6);
         }

         Rune runeFromHero = this.getRuneFromHero(msg.getHeroCode());
         RuneItem runeItem = (RuneItem)runeFromHero.runeMap.get(msg.getPosition().getNumber());
         if (null == runeItem) {
            this.logger.info("itemCode={} is null", msg.getItemCode());
            return this.player.failure(6);
         }

         if (runeItem.level <= this.getRuneInitLv() && runeItem.upgradeProgress <= 0) {
            return this.player.failure(76101);
         }

         RuneMainModel runeMainModel = this.getRuneMainModel(runeItem.id);
         if (null == runeMainModel) {
            return this.player.failure(37);
         }

         int allExp = 0;
         if (runeItem.upgradeProgress > 0) {
            allExp += runeItem.upgradeProgress;
         }

         RuneBasicNatureModel runeBasicNatureModel = this.getRuneBasicNatureModel(runeItem.id, runeItem.level);
         if (null != runeBasicNatureModel) {
            allExp += runeBasicNatureModel.getProEX();
         }

         runeItem.level = this.getRuneInitLv();
         runeItem.upgradeProgress = 0;
         this.updateHeroDaoAndFlush(msg.getHeroCode(), true);
         List<ResourceModel> returnRewardsByExp = this.getReturnRewardsByExp(allExp);
         if (returnRewardsByExp.size() > 0) {
            this.player.addResource(returnRewardsByExp, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 100, 10014, 0, 0, "");
         }
      }

      RuneMsg.S2C_Reset_20325.Builder resp = RuneMsg.S2C_Reset_20325.newBuilder();
      this.player.sendMsg(resp.build());
      return true;
   }

   @MsgHandlerAnno
   public boolean C2S_RuneDecompose_20334(RuneMsg.C2S_RuneDecompose_20334 msg, String source) {
      List<Integer> itemCodeList = this.intDistinct(msg.getItemCodeList());
      if (itemCodeList.size() <= 0) {
         this.logger.error("未选择符文需要分解的符文列表");
         return this.player.failure(6);
      } else {
         List<RuneItem> decomposeRuneItemList = new ArrayList();

         for(Integer itemCode : itemCodeList) {
            RuneItem runeItemFromBag = this.getRuneItemFromBag(itemCode);
            if (null == runeItemFromBag) {
               return this.player.failure(76108);
            }

            RuneMainModel runeMainModel = this.getRuneMainModel(runeItemFromBag.id);
            if (runeMainModel.getBreakIf() <= 0) {
               return this.player.failure(76114);
            }

            decomposeRuneItemList.add(runeItemFromBag);
         }

         List<ResourceModel> returnRewardsByRuneItemList = this.getReturnRewardsByRuneItemList(decomposeRuneItemList, true);
         this.player.addResource(returnRewardsByRuneItemList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 100, 10019, 0, 0, "");
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         itemBagPart.deleteItemByCodes(itemCodeList, 100, 10018, 0, 0, "");
         RuneMsg.S2C_RuneDecompose_20335.Builder resp = RuneMsg.S2C_RuneDecompose_20335.newBuilder();
         this.player.sendMsg(resp.build());
         return true;
      }
   }

   public int getRuneRefineNatureNum() {
      return ApplicationContextProvider.getConfigInt("RuneRefineNatureNum", 4);
   }

   public RuneRefineLvNatureModel getRuneRefineLvNatureModel(int seat, int breakUpTime) {
      ConcurrentHashMap<Integer, RuneRefineLvNatureModel> breakUpTime_model = (ConcurrentHashMap)this.player.getGameModelPool().getEntity("customRuneRefinelvNature", seat);
      if (null == breakUpTime_model) {
         this.logger.error("RuneRefineLvNature缺少配置 seat:{},breakUpTime:{}", seat, breakUpTime);
         return null;
      } else {
         RuneRefineLvNatureModel model = (RuneRefineLvNatureModel)breakUpTime_model.get(breakUpTime);
         if (null == model) {
            this.logger.error("RuneRefineLvNature缺少配置 seat:{},breakUpTime:{}", seat, breakUpTime);
         }

         return model;
      }
   }

   public RuneRefineNatureWeightModel getRuneRefineNatureWeightModel(int seat, int breakUpTime) {
      RuneRefineLvNatureModel runeRefineLvNatureModel = this.getRuneRefineLvNatureModel(seat, breakUpTime);
      if (null == runeRefineLvNatureModel) {
         return null;
      } else {
         RuneRefineNatureWeightModel model = (RuneRefineNatureWeightModel)this.player.getGameModelPool().getEntity("RuneRefineNatureWeight", runeRefineLvNatureModel.getRefineLv());
         if (null == model) {
            this.logger.error("RuneRefineNatureWeight 缺少配置 refineLv:{}", runeRefineLvNatureModel.getRefineLv());
         }

         return model;
      }
   }

   public List<RuneRefineNatureModel> getRuneRefineNatureModelList(int seat, int breakUpTime) {
      RuneRefineLvNatureModel runeRefineLvNatureModel = this.getRuneRefineLvNatureModel(seat, breakUpTime);
      if (null == runeRefineLvNatureModel) {
         return null;
      } else {
         List<RuneRefineNatureModel> modelList = (List)this.player.getGameModelPool().getEntity("customRuneRefineNature", runeRefineLvNatureModel.getRefineLv() + "_" + seat);
         if (null == modelList || modelList.size() <= 0) {
            this.logger.error("RuneRefineNature 配置出错 refineLv:{},seat:{}", runeRefineLvNatureModel.getRefineLv(), seat);
         }

         return modelList;
      }
   }

   public RuneRefineNeedModel getRuneRefineNeedModel(int seat, int breakUpTime, int lockValue) {
      RuneRefineLvNatureModel runeRefineLvNatureModel = this.getRuneRefineLvNatureModel(seat, breakUpTime);
      if (null == runeRefineLvNatureModel) {
         return null;
      } else {
         ConcurrentHashMap<Integer, RuneRefineNeedModel> lockValue_modelMap = (ConcurrentHashMap)this.player.getGameModelPool().getEntity("customRuneRefineNeed", runeRefineLvNatureModel.getRefineLv());
         if (null != lockValue_modelMap && lockValue_modelMap.size() > 0 && lockValue_modelMap.get(lockValue) != null) {
            return (RuneRefineNeedModel)lockValue_modelMap.get(lockValue);
         } else {
            this.logger.error("RuneRefineNeed 配置出错 refineLv:{},lockValue:{}", runeRefineLvNatureModel.getRefineLv(), lockValue);
            return null;
         }
      }
   }

   public ItemModel getRefineInheritItem() {
      ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", 71001);
      if (null == itemModel) {
         this.logger.error("未配置洗练继承石道具 itemId:{}", 71001);
      }

      return itemModel;
   }

   @MsgHandlerAnno
   public boolean C2S_LockNatureId_20336(RuneMsg.C2S_LockNatureId_20336 msg, String source) {
      Rune runeFromHero = this.getRuneFromHero(msg.getHeroCode());
      RuneRefineInheritItem runeRefineInheritItem = (RuneRefineInheritItem)runeFromHero.runeRefineMap.get(msg.getPosition().getNumber());
      if (null == runeRefineInheritItem) {
         this.logger.error("该位置没有洗练属性: position:{}", msg.getPosition().getNumber());
         return this.player.failure(6);
      } else if (!runeRefineInheritItem.refinePro.containsKey(msg.getLockNatureId())) {
         this.logger.error("该属性不是当前拥有属性 lockNatureId:{}", msg.getLockNatureId());
         return this.player.failure(6);
      } else if (runeRefineInheritItem.lockNatureIds.size() + 1 >= this.getRuneRefineNatureNum()) {
         return this.player.failure(76103);
      } else {
         runeRefineInheritItem.lockNatureIds.add(msg.getLockNatureId());
         this.updateHeroData(msg.getHeroCode());
         this.sendLockNatureIdsInfo(msg.getHeroCode(), msg.getPosition());
         RuneMsg.S2C_LockNatureId_20337.Builder resp = RuneMsg.S2C_LockNatureId_20337.newBuilder();
         this.player.sendMsg(resp.build());
         return true;
      }
   }

   @MsgHandlerAnno
   public boolean C2S_UnlockNatureId_20338(RuneMsg.C2S_UnlockNatureId_20338 msg, String source) {
      Rune runeFromHero = this.getRuneFromHero(msg.getHeroCode());
      RuneRefineInheritItem runeRefineInheritItem = (RuneRefineInheritItem)runeFromHero.runeRefineMap.get(msg.getPosition().getNumber());
      if (null == runeRefineInheritItem) {
         this.logger.error("该位置没有洗练属性: heroCode:{},position:{}", msg.getHeroCode(), msg.getPosition().getNumber());
         return this.player.failure(6);
      } else if (!runeRefineInheritItem.lockNatureIds.contains(msg.getUnlockNatureId())) {
         this.logger.error("属性已解锁 unlockNatureId:{}", msg.getUnlockNatureId());
         return this.player.failure(6);
      } else {
         runeRefineInheritItem.lockNatureIds.remove(msg.getUnlockNatureId());
         this.updateHeroData(msg.getHeroCode());
         this.sendLockNatureIdsInfo(msg.getHeroCode(), msg.getPosition());
         RuneMsg.S2C_UnlockNatureId_20339.Builder resp = RuneMsg.S2C_UnlockNatureId_20339.newBuilder();
         this.player.sendMsg(resp.build());
         return true;
      }
   }

   @MsgHandlerAnno
   public void C2S_GetLockNatureIds_20340(RuneMsg.C2S_GetLockNatureIds_20340 msg, String source) {
      this.sendLockNatureIdsInfo(msg.getHeroCode(), msg.getPosition());
   }

   public void sendLockNatureIdsInfo(int heroCode, CommonMsg.RunePosition position) {
      RuneMsg.S2C_GetLockNatureIds_20341.Builder resp = RuneMsg.S2C_GetLockNatureIds_20341.newBuilder();
      resp.setHeroCode(heroCode);
      resp.setPosition(position);
      Rune runeFromHero = this.getRuneFromHero(heroCode);
      RuneRefineInheritItem runeRefineInheritItem = (RuneRefineInheritItem)runeFromHero.runeRefineMap.get(position.getNumber());
      if (null != runeRefineInheritItem) {
         resp.addAllLockNatureId(runeRefineInheritItem.lockNatureIds);
      }

      this.player.sendMsg(resp.build());
   }

   public void lockNatureIdsWrongHandle(int heroCode, int seat) {
      Rune runeFromHero = this.getRuneFromHero(heroCode);
      RuneRefineInheritItem runeRefineInheritItem = (RuneRefineInheritItem)runeFromHero.runeRefineMap.get(seat);
      if (null != runeRefineInheritItem) {
         Set<Integer> removeNatureIds = new HashSet();

         for(Integer lockNatureId : runeRefineInheritItem.lockNatureIds) {
            if (!runeRefineInheritItem.refinePro.containsKey(lockNatureId)) {
               removeNatureIds.add(lockNatureId);
            }
         }

         if (removeNatureIds.size() > 0) {
            runeRefineInheritItem.lockNatureIds.removeAll(removeNatureIds);
            this.updateHeroData(heroCode);
         }

      }
   }

   @MsgHandlerAnno
   public boolean C2S_Refine_20326(RuneMsg.C2S_Refine_20326 msg, String source) {
      Rune runeFromHero = this.getRuneFromHero(msg.getHeroCode());
      int positionNum = msg.getPosition().getNumber();
      RuneItem runeItem = (RuneItem)runeFromHero.runeMap.get(positionNum);
      if (null == runeItem) {
         return this.player.failure(76102);
      } else {
         ItemModel refineInheritItem = this.getRefineInheritItem();
         if (null == refineInheritItem) {
            return this.player.failure(37);
         } else {
            RuneRefineInheritItem runeRefineInheritItem = (RuneRefineInheritItem)runeFromHero.runeRefineMap.get(positionNum);
            if (null == runeRefineInheritItem) {
               runeRefineInheritItem = new RuneRefineInheritItem();
               runeRefineInheritItem.init(0, 1, refineInheritItem, this.player);
            }

            RuneMainModel runeMainModel = this.getRuneMainModel(runeItem.id);
            if (null == runeMainModel) {
               return this.player.failure(76099);
            } else {
               RuneRefineLvNatureModel runeRefineLvNatureModel = this.getRuneRefineLvNatureModel(positionNum, runeRefineInheritItem.breakUpTime);
               if (runeMainModel.getQuality() < runeRefineLvNatureModel.getNeedRuneQuality()) {
                  return this.player.failure(76105);
               } else {
                  this.lockNatureIdsWrongHandle(msg.getHeroCode(), positionNum);
                  RuneRefineNeedModel runeRefineNeedModel = this.getRuneRefineNeedModel(positionNum, runeRefineInheritItem.breakUpTime, runeRefineInheritItem.lockNatureIds.size());
                  if (null == runeRefineNeedModel) {
                     return this.player.failure(37);
                  } else {
                     List<Integer> refineSpecialItemList = this.intDistinct(msg.getRefineSpecialItemList());
                     if (refineSpecialItemList.size() > runeRefineNeedModel.getSpecialNeedMaxKind()) {
                        return this.player.failure(76110);
                     } else {
                        Set<Integer> refineQualitySet = new HashSet();
                        List<ResourceModel> costResourceList = new ArrayList();
                        costResourceList.addAll(runeRefineNeedModel.getRefineCost());
                        Map<Integer, RefineSpCostModel> refineSpCost = runeRefineNeedModel.getRefineSpCost();

                        for(Integer itemId : refineSpecialItemList) {
                           RefineSpCostModel refineSpCostModel = (RefineSpCostModel)refineSpCost.get(itemId);
                           if (null != refineSpCostModel) {
                              costResourceList.add(new ResourceModel(refineSpCostModel.getType(), refineSpCostModel.getId(), refineSpCostModel.getValue()));
                              refineQualitySet.add(refineSpCostModel.getQuality());
                           }
                        }

                        if (!this.player.checkResourceNum(costResourceList)) {
                           return this.player.failure(76111);
                        } else if (!this.refineNature(runeRefineInheritItem, positionNum, refineQualitySet)) {
                           return false;
                        } else {
                           this.player.delResource((List)costResourceList, 100, 10015, 0, 0, "");
                           runeFromHero.runeRefineMap.put(positionNum, runeRefineInheritItem);
                           this.updateHeroDaoAndFlush(msg.getHeroCode(), true);
                           this.player.triggerTask(703, 0, 1L, 1);
                           RuneMsg.S2C_Refine_20327.Builder resp = RuneMsg.S2C_Refine_20327.newBuilder();
                           this.player.sendMsg(resp.build());
                           return true;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public boolean refineNature(RuneRefineInheritItem runeRefineInheritItem, int seat, Set<Integer> refineQualitySet) {
      Map<Integer, PropertyModel> refinePro = runeRefineInheritItem.refinePro;
      Set<Integer> lockNatureIds = runeRefineInheritItem.lockNatureIds;
      Map<Integer, PropertyModel> refineProClone = new HashMap();
      int runeRefineNatureNum = this.getRuneRefineNatureNum();

      for(Map.Entry<Integer, PropertyModel> propertyModelEntry : refinePro.entrySet()) {
         int id = (Integer)propertyModelEntry.getKey();
         PropertyModel propertyModel = (PropertyModel)propertyModelEntry.getValue();
         if (lockNatureIds != null && lockNatureIds.contains(id)) {
            refineProClone.put(id, propertyModel);
         }
      }

      if (refineProClone.size() + refineQualitySet.size() > runeRefineNatureNum) {
         return this.player.failure(76110);
      } else {
         Set<Integer> excludeNatureIds = new HashSet();
         Set<String> excludeNatureTypeWays = new HashSet();
         if (lockNatureIds != null) {
            for(Integer refineNatureId : lockNatureIds) {
               excludeNatureIds.add(refineNatureId);
               RuneRefineNatureModel runeRefineNatureModel = (RuneRefineNatureModel)this.player.getGameModelPool().getEntity("RuneRefineNature", refineNatureId);
               if (null == runeRefineNatureModel) {
                  this.logger.error("属性继承出错 RuneRefineNature 配置为空 id:{}", refineNatureId);
                  return this.player.failure(37);
               }

               excludeNatureTypeWays.add(runeRefineNatureModel.getNatureType() + "_" + runeRefineNatureModel.getNatureWay());
            }
         }

         for(Integer natureQuality : refineQualitySet) {
            RuneRefineNature runeRefineNature = this.calRefineNatureValue(seat, runeRefineInheritItem.breakUpTime, natureQuality, excludeNatureIds, excludeNatureTypeWays);
            if (null != runeRefineNature) {
               boolean addExcludeNatureIds = excludeNatureIds.add(runeRefineNature.getId());
               boolean addExcludeNatureTypeWay = excludeNatureTypeWays.add(runeRefineNature.getPropertyModel().getType() + "_" + runeRefineNature.getPropertyModel().getWay());
               if (addExcludeNatureIds && addExcludeNatureTypeWay) {
                  refineProClone.put(runeRefineNature.getId(), runeRefineNature.getPropertyModel());
               }
            }
         }

         int currProNum = refineProClone.size();

         while(currProNum < runeRefineNatureNum) {
            RuneRefineNature runeRefineNature = this.calRefineNatureValue(seat, runeRefineInheritItem.breakUpTime, 0, excludeNatureIds, excludeNatureTypeWays);
            if (null == runeRefineNature) {
               return this.player.failure(37);
            }

            boolean addExcludeNatureIds = excludeNatureIds.add(runeRefineNature.getId());
            boolean addExcludeNatureTypeWay = excludeNatureTypeWays.add(runeRefineNature.getPropertyModel().getType() + "_" + runeRefineNature.getPropertyModel().getWay());
            if (addExcludeNatureIds && addExcludeNatureTypeWay) {
               refineProClone.put(runeRefineNature.getId(), runeRefineNature.getPropertyModel());
               ++currProNum;
            }
         }

         runeRefineInheritItem.refinePro.clear();
         runeRefineInheritItem.refinePro.putAll(refineProClone);
         return true;
      }
   }

   public RuneRefineNature calRefineNatureValue(int seat, int breakUpTime, int quality, Set<Integer> excludeNatureIds, Set<String> excludeNatureTypeWays) {
      List<RuneRefineNatureModel> runeRefineNatureModelList = this.getRuneRefineNatureModelList(seat, breakUpTime);
      if (null != runeRefineNatureModelList && runeRefineNatureModelList.size() > 0) {
         List<KeyValFun> keyValFunList = new ArrayList();

         for(RuneRefineNatureModel runeRefineNatureModel : runeRefineNatureModelList) {
            String natureTypeWay = runeRefineNatureModel.getNatureType() + "_" + runeRefineNatureModel.getNatureWay();
            if (!excludeNatureIds.contains(runeRefineNatureModel.getId()) && !excludeNatureTypeWays.contains(natureTypeWay)) {
               keyValFunList.add(new KeyValFun(runeRefineNatureModel.getId(), runeRefineNatureModel.getNatureWeight()));
            }
         }

         if (keyValFunList.size() <= 0) {
            this.logger.error("洗练的属性权重列表为空");
            return null;
         } else {
            int id = GamePlayer.countRate(keyValFunList);
            RuneRefineNatureModel natureModel = (RuneRefineNatureModel)ApplicationContextProvider.getModelPoolEntity("RuneRefineNature", id);
            Map<Integer, RuneRefineRangeModel> refineRange = natureModel.getRefineRange();
            if (quality <= 0) {
               quality = this.calRefineNatureQuality(seat, breakUpTime);
            }

            RuneRefineRangeModel rangeModel = (RuneRefineRangeModel)refineRange.get(quality);
            if (null == rangeModel) {
               this.logger.error("RuneRefineNature 未找到对应品质属性 id:{},quality:{}", id, quality);
               return null;
            } else {
               int natureValue = RandomUtil.randInt(rangeModel.getMin(), rangeModel.getMax() + 1);
               if (natureValue <= 0) {
                  this.logger.error("计算的属性值为啥会小于等于0呢！！！");
                  return null;
               } else {
                  PropertyModel propertyModel = new PropertyModel(natureModel.getNatureType(), natureModel.getNatureWay(), (long)natureValue);
                  RuneRefineNature runeRefineNature = new RuneRefineNature(natureModel.getId(), propertyModel);
                  return runeRefineNature;
               }
            }
         }
      } else {
         return null;
      }
   }

   public int calRefineNatureQuality(int seat, int breakUpTime) {
      RuneRefineNatureWeightModel runeRefineNatureWeightModel = this.getRuneRefineNatureWeightModel(seat, breakUpTime);
      return null == runeRefineNatureWeightModel ? 0 : GamePlayer.countRate(runeRefineNatureWeightModel.getRefineWeight());
   }

   @MsgHandlerAnno
   public boolean C2S_RefineBreakUp_20328(RuneMsg.C2S_RefineBreakUp_20328 msg, String source) {
      Rune runeFromHero = this.getRuneFromHero(msg.getHeroCode());
      int positionNum = msg.getPosition().getNumber();
      if (null == runeFromHero) {
         this.logger.info("runeFromHero 为 null,heroCode:{}", msg.getHeroCode());
         return this.player.failure(6);
      } else {
         RuneItem runeItem = (RuneItem)runeFromHero.runeMap.get(positionNum);
         if (null == runeItem) {
            return this.player.failure(76102);
         } else {
            RuneRefineInheritItem runeRefineInheritItem = (RuneRefineInheritItem)runeFromHero.runeRefineMap.get(positionNum);
            if (null == runeRefineInheritItem) {
               return this.player.failure(76104);
            } else {
               RuneRefineLvNatureModel runeRefineLvNatureModel = this.getRuneRefineLvNatureModel(positionNum, runeRefineInheritItem.breakUpTime);
               if (null == runeRefineLvNatureModel) {
                  return this.player.failure(37);
               } else {
                  RuneRefineLvNatureModel nextRuneRefineLvNatureModel = this.getRuneRefineLvNatureModel(positionNum, runeRefineInheritItem.breakUpTime + 1);
                  if (null == nextRuneRefineLvNatureModel) {
                     return this.player.failure(76106);
                  } else {
                     RuneMainModel runeMainModel = this.getRuneMainModel(runeItem.id);
                     if (null == runeMainModel) {
                        return this.player.failure(37);
                     } else if (runeMainModel.getQuality() < runeRefineLvNatureModel.getBreakUpNeedRuneQuality()) {
                        return this.player.failure(76105);
                     } else {
                        int hasBreakUpNeedQualityCount = 0;

                        for(Map.Entry<Integer, PropertyModel> propertyModelEntry : runeRefineInheritItem.refinePro.entrySet()) {
                           int natureQuality = runeRefineInheritItem.calQuality((Integer)propertyModelEntry.getKey());
                           if (natureQuality >= runeRefineLvNatureModel.getBreakUpNeedQuality()) {
                              ++hasBreakUpNeedQualityCount;
                           }
                        }

                        if (hasBreakUpNeedQualityCount < runeRefineLvNatureModel.getBreakUpNeedNum()) {
                           return this.player.failure(76107);
                        } else {
                           ++runeRefineInheritItem.breakUpTime;
                           this.updateHeroDaoAndFlush(msg.getHeroCode(), true);
                           RuneRefineLvNatureModel newRuneRefineLvNatureModel = this.getRuneRefineLvNatureModel(positionNum, runeRefineInheritItem.breakUpTime);
                           if (null != newRuneRefineLvNatureModel) {
                              GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
                              giftPart.triggerTimeLimitGift(31, newRuneRefineLvNatureModel.getRefineLv());
                           }

                           RuneMsg.S2C_RefineBreakUp_20329.Builder resp = RuneMsg.S2C_RefineBreakUp_20329.newBuilder();
                           this.player.sendMsg(resp.build());
                           return true;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_RefineReset_20330(RuneMsg.C2S_RefineReset_20330 msg, String source) {
      Rune runeFromHero = this.getRuneFromHero(msg.getHeroCode());
      int positionNum = msg.getPosition().getNumber();
      RuneRefineInheritItem runeRefineInheritItem = (RuneRefineInheritItem)runeFromHero.runeRefineMap.get(positionNum);
      if (null == runeRefineInheritItem) {
         return this.player.failure(76104);
      } else {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         RuneRefineInheritItem addRuneRefineInheritItem = itemBagPart.addRuneRefineInheritItem(runeRefineInheritItem, 100, 10016, 0, 0, "");
         if (null != addRuneRefineInheritItem) {
            this.player.additemUpdateBuilder(addRuneRefineInheritItem);
            this.player.senditemUpdateMsg();
            this.player.addResourceMsg(addRuneRefineInheritItem);
            this.player.sendResourceMsg();
         }

         runeFromHero.runeRefineMap.remove(positionNum);
         this.updateHeroDaoAndFlush(msg.getHeroCode(), true);
         RuneMsg.S2C_RefineReset_20331.Builder resp = RuneMsg.S2C_RefineReset_20331.newBuilder();
         this.player.sendMsg(resp.build());
         return true;
      }
   }

   @MsgHandlerAnno
   public boolean C2S_RefineInherit_20332(RuneMsg.C2S_RefineInherit_20332 msg, String source) {
      Rune runeFromHero = this.getRuneFromHero(msg.getHeroCode());
      int positionNum = msg.getPosition().getNumber();
      RuneRefineInheritItem runeRefineInheritItem = (RuneRefineInheritItem)runeFromHero.runeRefineMap.get(positionNum);
      int breakUpTime = runeRefineInheritItem == null ? 0 : runeRefineInheritItem.breakUpTime;
      RuneRefineLvNatureModel runeRefineLvNatureModel = this.getRuneRefineLvNatureModel(positionNum, breakUpTime);
      if (null == runeRefineLvNatureModel) {
         return this.player.failure(37);
      } else {
         RuneItem runeItem = (RuneItem)runeFromHero.runeMap.get(positionNum);
         if (null == runeItem) {
            return this.player.failure(76102);
         } else {
            RuneMainModel runeMainModel = this.getRuneMainModel(runeItem.id);
            if (null == runeMainModel) {
               return this.player.failure(37);
            } else {
               RuneRefineInheritItem runeRefineInheritItemFromBag = this.getRuneRefineInheritItemFromBag(msg.getItemCode());
               if (null == runeRefineInheritItemFromBag) {
                  this.logger.error("洗练继承石道具不存在 itemCode:{}", msg.getItemCode());
                  return this.player.failure(76112);
               } else if (runeRefineInheritItemFromBag.breakUpTime < runeRefineLvNatureModel.getSucceedUpBreakUpTime()) {
                  return this.player.failure(76113);
               } else {
                  RuneRefineLvNatureModel bagRuneRefineLvNatureModel = this.getRuneRefineLvNatureModel(positionNum, runeRefineInheritItemFromBag.breakUpTime);
                  if (runeMainModel.getQuality() < bagRuneRefineLvNatureModel.getSucceedSeatNeedQuality()) {
                     return this.player.failure(76105);
                  } else {
                     for(Map.Entry<Integer, PropertyModel> propertyModelEntry : runeRefineInheritItemFromBag.refinePro.entrySet()) {
                        int refineNatureId = (Integer)propertyModelEntry.getKey();
                        RuneRefineNatureModel runeRefineNatureModel = (RuneRefineNatureModel)this.player.getGameModelPool().getEntity("RuneRefineNature", refineNatureId);
                        if (null == runeRefineNatureModel) {
                           this.logger.error("属性继承出错 RuneRefineNature 配置为空 id:{}", refineNatureId);
                           return this.player.failure(37);
                        }

                        if (!runeRefineNatureModel.getSucceedSeat().contains(positionNum)) {
                           return this.player.failure(76113);
                        }
                     }

                     runeFromHero.runeRefineMap.put(positionNum, runeRefineInheritItemFromBag);
                     this.updateHeroDaoAndFlush(msg.getHeroCode(), true);
                     ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                     itemBagPart.deleteItemByCode(msg.getItemCode(), 1, 100, 10017, 0, 0, "");
                     this.player.senditemUpdateMsg();
                     RuneMsg.S2C_RefineInherit_20333.Builder resp = RuneMsg.S2C_RefineInherit_20333.newBuilder();
                     this.player.sendMsg(resp.build());
                     return true;
                  }
               }
            }
         }
      }
   }

   public RuneRefineInheritItem getRuneRefineInheritItemFromBag(int itemCode) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      RuneRefineInheritItem itemByCode = itemBagDao.runeRefineInheritBag.getItemByCode(itemCode);
      return itemByCode;
   }

   public List<Integer> intDistinct(List<Integer> list) {
      List<Integer> distinctList = new ArrayList();
      if (null != list && list.size() >= 0) {
         for(Integer i : list) {
            if (!distinctList.contains(i)) {
               distinctList.add(i);
            }
         }

         return distinctList;
      } else {
         return distinctList;
      }
   }
}
