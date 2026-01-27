package com.gzbz.godBeast.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.GodBeastDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.ItemBagDao;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameCache.TaskCustomCache;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.TaskDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.gift.GiftPart;
import com.gzbz.godBeast.GodBeastDefine;
import com.gzbz.godBeast.GodBeastMgr;
import com.gzbz.godBeast.NeiDanDefine;
import com.gzbz.godBeast.bean.GodBeastItem;
import com.gzbz.godBeast.bean.GodBeastRecordData;
import com.gzbz.godBeast.bean.NeiDanItem;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.GodBeastBuyEggModel;
import com.gzbz.model.GodBeastDecompositionModel;
import com.gzbz.model.GodBeastHatchLibModel;
import com.gzbz.model.GodBeastHatchModel;
import com.gzbz.model.GodBeastLevelEXPModel;
import com.gzbz.model.GodBeastModel;
import com.gzbz.model.GodBeastNoticeModel;
import com.gzbz.model.GodBeastPassiveSkillModel;
import com.gzbz.model.GodBeastScoreModel;
import com.gzbz.model.GodBeastSkillModel;
import com.gzbz.model.GodBeastStarMaterialModel;
import com.gzbz.model.GodBeastStarModel;
import com.gzbz.model.GodBeastTaskRewardModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceBackModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossMartMsg;
import com.gzbz.protobuf.GodBeastMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import net.CrossSubscribeMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class GodBeastPart extends PlayerPart {
   @Autowired
   private ConfigManager configManager;
   @Autowired
   private GodBeastMgr godBeastMgr;
   @Autowired
   private CrossNettyClient crossNettyClient;

   public GodBeastDao getGodBeastDao() {
      GodBeastDao godBeastDao = (GodBeastDao)this.player.getData("tb_god_beast", this.player.getPlayerId());
      return godBeastDao;
   }

   public boolean checkGodBeastBagLimit(int addCount) {
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      int bagSize = itemBagDao.godBeastBag.getBagSize();
      int maxCount = itemBagPart.getMaxCount(32);
      return bagSize + addCount <= maxCount;
   }

   @MsgHandlerAnno
   public void C2S_GodBeastHatchInfo_21601(GodBeastMsg.C2S_GodBeastHatchInfo_21601 msg, String source) {
      this.sendGodBeastHatchInfo();
   }

   public void sendGodBeastHatchInfo() {
      GodBeastMsg.S2C_GodBeastHatchInfo_21602.Builder resp = GodBeastMsg.S2C_GodBeastHatchInfo_21602.newBuilder();
      GodBeastDao godBeastDao = this.getGodBeastDao();
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      resp.setHatchNum(godBeastDao.hatchNum);
      resp.setDailyHatchNum((Integer)playerResetCustomCache.getDailyNum(48, 0));
      resp.setEggBuyNum(godBeastDao.eggBuyNum);
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public boolean C2S_GodBeastHatch_21603(GodBeastMsg.C2S_GodBeastHatch_21603 msg, String source) {
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int newDailyCount = (Integer)playerResetCustomCache.getDailyNum(48, 0) + 1;
      if ((float)newDailyCount > ApplicationContextProvider.getConfigFloat("LotteryLimit", 99999.0F)) {
         return this.player.failure(76029);
      } else if (!this.checkGodBeastBagLimit(1)) {
         return this.player.failure(76157);
      } else {
         int type = msg.getType();
         if (type <= 0) {
            type = 1;
         }

         GodBeastDao godBeastDao = this.getGodBeastDao();
         if (godBeastDao.hatchNum <= 0L) {
            type = 3;
         }

         GodBeastHatchModel beforeGodBeastHatchModel = GodBeastDefine.getGodBeastHatchModel(type);
         if (null == beforeGodBeastHatchModel) {
            this.logger.error("灵兽孵化未找到对应孵化类型:{}", type);
            return this.player.failure(37);
         } else {
            int consumeType = beforeGodBeastHatchModel.getConsumeType();
            int consumeId = beforeGodBeastHatchModel.getConsumeId();
            int consumeValue = beforeGodBeastHatchModel.getConsumeValue();
            ResourceModel hatchCost = new ResourceModel(consumeType, consumeId, consumeValue);
            if (type == 1) {
               if (!this.player.checkResourceNum(hatchCost)) {
                  return this.player.failure(76135);
               }
            } else if (!this.player.checkResourceNum(hatchCost)) {
               return this.player.failure(76163);
            }

            this.crossHatch(type, godBeastDao.hatchNum, godBeastDao.qualityHatchNum);
            return true;
         }
      }
   }

   public boolean crossHatch(int hatchType, long playerHatchNum, Map<Integer, Integer> qualityHatchNum) {
      if (!this.crossNettyClient.isLogin()) {
         return this.player.failure(76022);
      } else {
         CrossMartMsg.S2CR_Hatch_23336.Builder builder = CrossMartMsg.S2CR_Hatch_23336.newBuilder();
         builder.setHatchType(hatchType);
         builder.setPlayerHatchNum(playerHatchNum);
         if (qualityHatchNum != null && qualityHatchNum.size() > 0) {
            for(Map.Entry<Integer, Integer> entry : qualityHatchNum.entrySet()) {
               CommonMsg.MapDataII.Builder mapDataII = CommonMsg.MapDataII.newBuilder();
               mapDataII.setKey((Integer)entry.getKey());
               mapDataII.setValue((Integer)entry.getValue());
               builder.addPlayerQualityHatchNum(mapDataII);
            }
         }

         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
         return true;
      }
   }

   public boolean crossBatchHatch(int hatchType, long playerHatchNum, Map<Integer, Integer> qualityHatchNum, int hatchCount, boolean isPointLog) {
      if (!this.crossNettyClient.isLogin()) {
         return this.player.failure(76022);
      } else {
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         int newDailyCount = (Integer)playerResetCustomCache.getDailyNum(48, 0) + hatchCount;
         if ((float)newDailyCount > ApplicationContextProvider.getConfigFloat("LotteryLimit", 99999.0F)) {
            return this.player.failure(76029);
         } else {
            GodBeastHatchModel godBeastHatchModel = GodBeastDefine.getGodBeastHatchModel(hatchType);
            int consumeType = godBeastHatchModel.getConsumeType();
            int consumeId = godBeastHatchModel.getConsumeId();
            int consumeValue = godBeastHatchModel.getConsumeValue();
            ResourceModel hatchCost = new ResourceModel(consumeType, consumeId, consumeValue * hatchCount);
            if (!this.player.checkResourceNum(hatchCost)) {
               return this.player.failure(76135);
            } else {
               CrossMartMsg.S2CR_BatchHatch_23338.Builder builder = CrossMartMsg.S2CR_BatchHatch_23338.newBuilder();
               builder.setHatchType(hatchType);
               builder.setPlayerHatchNum(playerHatchNum);
               if (qualityHatchNum != null && qualityHatchNum.size() > 0) {
                  for(Map.Entry<Integer, Integer> entry : qualityHatchNum.entrySet()) {
                     CommonMsg.MapDataII.Builder mapDataII = CommonMsg.MapDataII.newBuilder();
                     mapDataII.setKey((Integer)entry.getKey());
                     mapDataII.setValue((Integer)entry.getValue());
                     builder.addPlayerQualityHatchNum(mapDataII);
                  }
               }

               builder.setHatchCount(hatchCount);
               builder.setIsPointLog(isPointLog);
               this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
               return true;
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean CR2S_Hatch_23337(CrossMartMsg.CR2S_Hatch_23337 msg, CrossSubscribeMsg crossSubscribeMsg) {
      int hatchType = msg.getHatchType();
      int godBeastId = msg.getGodBeastId();
      List<CommonMsg.PropertyInfo> attrList = msg.getAttrList();
      List<CommonMsg.MapDataII> playerQualityHatchNumList = msg.getPlayerQualityHatchNumList();
      if (godBeastId > 0 && !attrList.isEmpty()) {
         Map<Integer, PropertyModel> attrMap = new HashMap();

         for(CommonMsg.PropertyInfo propertyInfo : attrList) {
            int type = propertyInfo.getId();
            int way = propertyInfo.getWay();
            long value = (long)propertyInfo.getValue();
            PropertyModel propertyModel = new PropertyModel(type, way, value);
            attrMap.put(type, propertyModel);
         }

         GodBeastItem hatch = new GodBeastItem(godBeastId, attrMap);
         GodBeastHatchModel godBeastHatchModel = GodBeastDefine.getGodBeastHatchModel(hatchType);
         int consumeType = godBeastHatchModel.getConsumeType();
         int consumeId = godBeastHatchModel.getConsumeId();
         int consumeValue = godBeastHatchModel.getConsumeValue();
         ResourceModel hatchCost = new ResourceModel(consumeType, consumeId, consumeValue);
         GodBeastItem godBeastItem = this.addGodBeastItem(hatch, 123, 12301, true);
         if (null != godBeastItem) {
            this.player.delResource(hatchCost, 123, 12302, 0, 0, "");
         }

         this.player.addResource(godBeastHatchModel.getExtraGet(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 123, 12301, 0, 0, "");
         GodBeastDao godBeastDao = this.getGodBeastDao();
         if (hatchType == 1) {
            for(CommonMsg.MapDataII mapDataII : playerQualityHatchNumList) {
               int quality = mapDataII.getKey();
               int hatchNum = mapDataII.getValue();
               godBeastDao.qualityHatchNum.put(quality, hatchNum);
            }

            ++godBeastDao.neiDanHatchNum;
            int godBeastNeiDanGetFloors = this.configManager.getInt("GodBeastNeiDanGetFloors");
            if (godBeastNeiDanGetFloors > 0 && godBeastDao.neiDanHatchNum >= godBeastNeiDanGetFloors) {
               NeiDanItem drawNeiDanItem = NeiDanDefine.drawNeiDanItem();
               if (null != drawNeiDanItem) {
                  NeiDanPart neiDanPart = (NeiDanPart)this.player.getMgrPart(NeiDanPart.class);
                  NeiDanItem neiDanItem = neiDanPart.addNeiDanItem(drawNeiDanItem, 123, 12301, true);
                  if (neiDanItem != null) {
                     godBeastDao.neiDanHatchNum = 0;
                  }
               }
            }
         }

         ++godBeastDao.hatchNum;
         godBeastDao.updateOp();
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         int newDailyCount = (Integer)playerResetCustomCache.getDailyNum(48, 0) + 1;
         playerResetCustomCache.setDailyReset(48, newDailyCount);
         int scoreId = GodBeastDefine.calGodBeastScoreId(godBeastItem);
         this.addHatchRecord(godBeastItem.id, scoreId);
         this.addHatchLog(hatchType, godBeastItem, scoreId, msg.getWorldQualityHatchNumList());
         GodBeastMsg.S2C_GodBeastHatch_21604.Builder resp = GodBeastMsg.S2C_GodBeastHatch_21604.newBuilder();
         resp.setType(hatchType);
         resp.setHatchNum(godBeastDao.hatchNum);
         resp.setDailyHatchNum(newDailyCount);
         this.player.sendMsg(resp.build());
         return true;
      } else {
         return this.player.failure(6);
      }
   }

   @MsgHandlerAnno
   public boolean CR2S_BatchHatch_23339(CrossMartMsg.CR2S_BatchHatch_23339 msg, CrossSubscribeMsg crossSubscribeMsg) {
      int hatchType = msg.getHatchType();
      int realHatchCount = msg.getRealHatchCount();
      List<CommonMsg.MapDataII> playerQualityHatchNumList = msg.getPlayerQualityHatchNumList();
      List<CrossMartMsg.GodBeastHatchData> godBeastHatchDataList = msg.getGodBeastHatchDataList();
      if (godBeastHatchDataList != null && !godBeastHatchDataList.isEmpty()) {
         GodBeastHatchModel godBeastHatchModel = GodBeastDefine.getGodBeastHatchModel(hatchType);

         for(CrossMartMsg.GodBeastHatchData godBeastHatchData : godBeastHatchDataList) {
            int godBeastId = godBeastHatchData.getGodBeastId();
            List<CommonMsg.PropertyInfo> attrList = godBeastHatchData.getAttrList();
            Map<Integer, PropertyModel> attrMap = new HashMap();

            for(CommonMsg.PropertyInfo propertyInfo : attrList) {
               int type = propertyInfo.getId();
               int way = propertyInfo.getWay();
               long value = (long)propertyInfo.getValue();
               PropertyModel propertyModel = new PropertyModel(type, way, value);
               attrMap.put(type, propertyModel);
            }

            GodBeastItem hatch = new GodBeastItem(godBeastId, attrMap);
            GodBeastItem godBeastItem = this.addGodBeastItem(hatch, 123, 12301, true);
            int scoreId = GodBeastDefine.calGodBeastScoreId(godBeastItem);
            this.addHatchRecord(godBeastItem.id, scoreId);
            this.addHatchLog(hatchType, godBeastItem, scoreId, msg.getWorldQualityHatchNumList());
            this.player.addResource(godBeastHatchModel.getExtraGet(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 123, 12301, 0, 0, "");
         }

         int consumeType = godBeastHatchModel.getConsumeType();
         int consumeId = godBeastHatchModel.getConsumeId();
         int consumeValue = godBeastHatchModel.getConsumeValue();
         ResourceModel hatchCost = new ResourceModel(consumeType, consumeId, consumeValue * realHatchCount);
         this.player.delResource(hatchCost, 123, 12302, 0, 0, "");
         GodBeastDao godBeastDao = this.getGodBeastDao();
         godBeastDao.hatchNum += (long)realHatchCount;
         if (hatchType == 1) {
            for(CommonMsg.MapDataII mapDataII : playerQualityHatchNumList) {
               int quality = mapDataII.getKey();
               int hatchNum = mapDataII.getValue();
               godBeastDao.qualityHatchNum.put(quality, hatchNum);
            }
         }

         godBeastDao.updateOp();
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         int newDailyCount = (Integer)playerResetCustomCache.getDailyNum(48, 0) + realHatchCount;
         playerResetCustomCache.setDailyReset(48, newDailyCount);
         GodBeastMsg.S2C_GodBeastHatch_21604.Builder resp = GodBeastMsg.S2C_GodBeastHatch_21604.newBuilder();
         resp.setType(hatchType);
         resp.setHatchNum(godBeastDao.hatchNum);
         resp.setDailyHatchNum(newDailyCount);
         this.player.sendMsg(resp.build());
         return true;
      } else {
         return this.player.failure(6);
      }
   }

   public void addHatchRecord(int godBeastId, int scoreId) {
      long recTime = System.currentTimeMillis();
      GodBeastDao godBeastDao = this.getGodBeastDao();
      godBeastDao.recordList.push(new GodBeastRecordData(godBeastId, recTime, scoreId));

      while(godBeastDao.recordList.size() > 100) {
         godBeastDao.recordList.pollLast();
      }

      if (godBeastDao.newHatchNum != Integer.MAX_VALUE) {
         ++godBeastDao.newHatchNum;
      }

      godBeastDao.updateOp();
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      giftPart.triggerTimeLimitGift(35, godBeastDao.newHatchNum, true);
      GodBeastModel godBeastModel = GodBeastDefine.getGodBeastModel(godBeastId);
      int godBeastRecordQuality = GodBeastDefine.getGodBeastRecordQuality();
      if (godBeastModel != null && godBeastModel.getQuality() >= godBeastRecordQuality) {
         this.godBeastMgr.pushTask(() -> this.godBeastMgr.addRecordAndSendMsg(godBeastId, scoreId, this.player.getPlayerId(), this.player.getPlayerDao().playerName, recTime));
      } else {
         GodBeastMsg.S2C_HatchRecordList_21642.Builder resp = GodBeastMsg.S2C_HatchRecordList_21642.newBuilder();
         GodBeastMsg.HatchRecordData.Builder recordData = GodBeastMsg.HatchRecordData.newBuilder();
         recordData.setPlayerId(this.player.getPlayerId());
         recordData.setPlayerName(this.player.getPlayerDao().playerName);
         recordData.setResourceType(2);
         recordData.setResourceId(godBeastId);
         recordData.setResourceNum(1);
         recordData.setRecTime(recTime);
         recordData.setScoreId(scoreId);
         resp.addRecordList(recordData);
         this.player.sendMsg(resp.build());
      }

   }

   public void addHatchLog(int hatchType, GodBeastItem godBeastItem, int scoreId, List<CommonMsg.MapDataII> worldQualityHatchNumList) {
      StringBuilder attrStr = new StringBuilder();

      for(Map.Entry<Integer, PropertyModel> entry : godBeastItem.attrMap.entrySet()) {
         PropertyModel pm = (PropertyModel)entry.getValue();
         attrStr.append(pm.getType() + ":" + pm.getWay() + ":" + pm.getValue() + ";");
      }

      Map<Integer, Integer> worldQualityHatchNum = new HashMap();
      if (null != worldQualityHatchNumList) {
         for(CommonMsg.MapDataII mapDataII : worldQualityHatchNumList) {
            int quality = mapDataII.getKey();
            int worldHatchNum = mapDataII.getValue();
            worldQualityHatchNum.put(quality, worldHatchNum);
         }
      }

      GodBeastDao godBeastDao = this.getGodBeastDao();
      StringBuilder hatchNumStr = new StringBuilder();

      for(Map.Entry<Integer, Integer> entry : godBeastDao.qualityHatchNum.entrySet()) {
         Integer quality = (Integer)entry.getKey();
         Integer hatchNum = (Integer)entry.getValue();
         Integer worldHatchNum = (Integer)worldQualityHatchNum.getOrDefault(quality, 0);
         hatchNumStr.append("灵兽品质为" + quality + "的玩家累计保底次数:" + hatchNum + ",世界服累计保底次数:" + worldHatchNum + ";");
      }

      GodBeastScoreModel godBeastScoreModel = (GodBeastScoreModel)ApplicationContextProvider.getModelPoolEntity("GodBeastScore", scoreId);
      String scoreStr;
      if (null == godBeastScoreModel) {
         scoreStr = "灵兽总评级id:" + scoreId;
      } else {
         scoreStr = "灵兽总评级:" + godBeastScoreModel.getScoreName();
      }

      this.player.getOperationMgr().addExtraLog(this.player, 198, "灵兽孵化", "孵化类型:" + hatchType, scoreStr, "灵兽id:" + godBeastItem.id, "数量:1", "资质属性:" + attrStr.toString(), hatchNumStr.toString());
   }

   public GodBeastItem getGodBeastItemFromBag(int itemCode) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      GodBeastItem godBeastItem = itemBagDao.godBeastBag.getItemByCode(itemCode);
      if (null == godBeastItem) {
         this.logger.error("玩家 playerId:{} 背包中未找到道具 itemCode:{}", this.player.getPlayerId(), itemCode);
      }

      return godBeastItem;
   }

   public GodBeastItem getGodBeastItemFromHero(int heroCode) {
      HeroDao heroDao = this.getHeroDao(heroCode);
      return null == heroDao ? null : heroDao.godBeastItem;
   }

   public GodBeastItem getGodBeastItem(int heroCode, int itemCode) {
      return heroCode > 0 ? this.getGodBeastItemFromHero(heroCode) : this.getGodBeastItemFromBag(itemCode);
   }

   public GodBeastItem addGodBeastItem(GodBeastItem data, int module, int reason, boolean sendResourceMsg) {
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      GodBeastItem godBeastItem = itemBagPart.addGodBeastItem(data, module, reason, 0, 0, "");
      if (null != godBeastItem) {
         this.updateBagGodBeastItem(godBeastItem.code);
         if (sendResourceMsg) {
            this.player.addResourceMsg(godBeastItem);
            this.player.sendResourceMsg(PlayerMsg.ShowType.SHOW_GOD_BEAST_RECEIVE);
         }
      }

      return godBeastItem;
   }

   public HeroDao getHeroDao(int heroCode) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      if (null == heroDao) {
         this.logger.error("HeroDao 未找到对应英雄 heroCode:{}", heroCode);
      }

      return heroDao;
   }

   public void updateHeroGodBeastAndFlush(int heroCode) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      heroDao.updateOp();
      heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_GOD_BEAST, heroDao);
   }

   public void updateBagGodBeastItem(int itemCode) {
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      itemBagPart.updateOp();
      GodBeastItem godBeastItemFromBag = this.getGodBeastItemFromBag(itemCode);
      if (null != godBeastItemFromBag) {
         this.player.additemUpdateBuilder(godBeastItemFromBag);
         this.player.senditemUpdateMsg();
      }
   }

   public void updateGodBeastItem(int heroCode, int itemCode) {
      if (heroCode > 0) {
         this.updateHeroGodBeastAndFlush(heroCode);
      } else {
         this.updateBagGodBeastItem(itemCode);
      }

   }

   @MsgHandlerAnno
   public boolean C2S_GodBeastLvUp_21605(GodBeastMsg.C2S_GodBeastLvUp_21605 msg, String source) {
      GodBeastItem godBeastItem = this.getGodBeastItem(msg.getHeroCode(), msg.getItemCode());
      if (null == godBeastItem) {
         return this.player.failure(76145);
      } else {
         GodBeastLevelEXPModel godBeastLevelEXPModel = GodBeastDefine.getGodBeastLevelEXPModel(godBeastItem.level);
         if (null == godBeastLevelEXPModel) {
            return this.player.failure(37);
         } else {
            int scoreId = GodBeastDefine.calGodBeastScoreId(godBeastItem);
            int maxLevel = GodBeastDefine.getMaxLevel(scoreId, godBeastItem.getStarId());
            if (godBeastItem.level < maxLevel && godBeastLevelEXPModel.getNeedEXP() > 0) {
               ResourceModel levelUpCost = GodBeastDefine.getLevelUpCost(godBeastItem.level, godBeastItem.exp);
               if (null == levelUpCost) {
                  return this.player.failure(37);
               } else {
                  KeyValFun godBeastExpItem = GodBeastDefine.getGodBeastExpItem();
                  long resourceNum = this.player.getResourceNum(2, godBeastExpItem.getKey());
                  if (resourceNum <= 0L) {
                     return this.player.failure(76135);
                  } else {
                     if (resourceNum < (long)levelUpCost.getValue()) {
                        levelUpCost.setValue((int)resourceNum);
                     }

                     int expByCostItem = GodBeastDefine.getExpByCostItem(levelUpCost);
                     this.godBeastLevelUp(godBeastItem, expByCostItem);
                     this.updateGodBeastItem(msg.getHeroCode(), msg.getItemCode());
                     this.player.delResource(levelUpCost, 123, 12303, 0, 0, "");
                     this.player.getOperationMgr().addExtraLog(this.player, 224, "灵兽id:" + godBeastItem.id, "升级后等级:" + godBeastItem.level);
                     GodBeastMsg.S2C_GodBeastLvUp_21606.Builder resp = GodBeastMsg.S2C_GodBeastLvUp_21606.newBuilder();
                     this.player.sendMsg(resp.build());
                     return true;
                  }
               }
            } else {
               return this.player.failure(76146);
            }
         }
      }
   }

   public void godBeastLevelUp(GodBeastItem godBeastItem, int addExp) {
      if (null != godBeastItem && addExp > 0) {
         int totalExp = godBeastItem.exp + addExp;
         int scoreId = GodBeastDefine.calGodBeastScoreId(godBeastItem);
         int maxLevel = GodBeastDefine.getMaxLevel(scoreId, godBeastItem.getStarId());

         while(true) {
            GodBeastLevelEXPModel godBeastLevelEXPModel = GodBeastDefine.getGodBeastLevelEXPModel(godBeastItem.level);
            if (godBeastItem.level < maxLevel && null != godBeastLevelEXPModel && godBeastLevelEXPModel.getNeedEXP() > 0) {
               if (totalExp >= godBeastLevelEXPModel.getNeedEXP()) {
                  ++godBeastItem.level;
                  totalExp -= godBeastLevelEXPModel.getNeedEXP();
                  continue;
               }

               if (totalExp >= godBeastLevelEXPModel.getNeedEXP()) {
                  continue;
               }

               godBeastItem.exp = totalExp;
               break;
            }

            godBeastItem.exp = 0;
            break;
         }

      }
   }

   @MsgHandlerAnno
   public boolean C2S_GodBeastStarUp_21607(GodBeastMsg.C2S_GodBeastStarUp_21607 msg, String source) {
      GodBeastItem godBeastItem = this.getGodBeastItem(msg.getHeroCode(), msg.getItemCode());
      if (null == godBeastItem) {
         return this.player.failure(76145);
      } else {
         GodBeastModel godBeastModel = GodBeastDefine.getGodBeastModel(godBeastItem.id);
         if (null == godBeastModel) {
            return this.player.failure(37);
         } else if (godBeastModel.getUpStarID() <= 0) {
            return this.player.failure(6);
         } else {
            Map<Integer, Integer> costItemMap = this.mapDataIIDistinct(msg.getCostItemsList());
            if (null != costItemMap && !costItemMap.isEmpty()) {
               List<ResourceModel> returnRewardList = new ArrayList();
               int starUpProgressByCostItem = this.getStarUpProgressByCostItem(costItemMap, returnRewardList);
               if (starUpProgressByCostItem == -1) {
                  return this.player.failure(76152);
               } else if (starUpProgressByCostItem == -2) {
                  return this.player.failure(76153);
               } else if (starUpProgressByCostItem == -3) {
                  return this.player.failure(76162);
               } else {
                  for(ResourceModel rm : this.godBeastStarUp(godBeastItem, starUpProgressByCostItem)) {
                     rm.addResourceToList(returnRewardList);
                  }

                  this.updateGodBeastItem(msg.getHeroCode(), msg.getItemCode());
                  ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                  boolean isNeedSendResourceMsg = false;

                  for(Map.Entry<Integer, Integer> entry : costItemMap.entrySet()) {
                     Integer itemCode = (Integer)entry.getKey();
                     Integer itemVal = (Integer)entry.getValue();
                     ItemBase itemBase = itemBagPart.getItemByCode(itemCode);
                     if (itemBase instanceof GodBeastItem) {
                        GodBeastItem costGodBeast = (GodBeastItem)itemBase;
                        if (costGodBeast.mainNeiDan != null) {
                           NeiDanPart neiDanPart = (NeiDanPart)this.player.getMgrPart(NeiDanPart.class);
                           NeiDanItem neiDanItem = neiDanPart.addNeiDanItem(costGodBeast.mainNeiDan, 123, 12308, false);
                           this.player.addResourceMsg(neiDanItem);
                           isNeedSendResourceMsg = true;
                        }
                     }

                     itemBagPart.deleteItemByCode(itemCode, itemVal, 123, 12308, 0, 0, "");
                  }

                  this.player.senditemUpdateMsg();
                  if (returnRewardList.size() > 0) {
                     this.player.addResource(returnRewardList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 123, 12323, 0, 0, "");
                     isNeedSendResourceMsg = false;
                  }

                  if (isNeedSendResourceMsg) {
                     this.player.sendResourceMsg();
                  }

                  GodBeastStarModel godBeastStarModel = GodBeastDefine.getGodBeastStarModel(godBeastItem.getStarId());
                  this.player.getOperationMgr().addExtraLog(this.player, 225, "灵兽id:" + godBeastItem.id, "升星后的星级:" + godBeastStarModel.getStar());
                  GodBeastMsg.S2C_GodBeastStarUp_21608.Builder resp = GodBeastMsg.S2C_GodBeastStarUp_21608.newBuilder();
                  this.player.sendMsg(resp.build());
                  return true;
               }
            } else {
               return this.player.failure(76149);
            }
         }
      }
   }

   public int getStarUpProgressByCostItem(Map<Integer, Integer> costItemMap, List<ResourceModel> returnRewardList) {
      if (null != costItemMap && !costItemMap.isEmpty()) {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         int totalProgress = 0;

         for(Map.Entry<Integer, Integer> entry : costItemMap.entrySet()) {
            Integer itemCode = (Integer)entry.getKey();
            Integer num = (Integer)entry.getValue();
            ItemBase itemBase = itemBagPart.getItemByCode(itemCode);
            if (null == itemBase || num > itemBase.getNum()) {
               return -1;
            }

            if (!(itemBase instanceof GodBeastItem)) {
               GodBeastStarMaterialModel godBeastStarMaterialModel = GodBeastDefine.getGodBeastStarMaterialModel(itemBase.id, 0);
               if (null == godBeastStarMaterialModel) {
                  return -2;
               }

               totalProgress += godBeastStarMaterialModel.getProgramNum() * num;
            } else {
               GodBeastItem godBeastItem = (GodBeastItem)itemBase;
               int qualificationScore = GodBeastDefine.calGodBeastScoreId(godBeastItem);
               GodBeastStarMaterialModel godBeastStarMaterialModel = GodBeastDefine.getGodBeastStarMaterialModel(godBeastItem.id, qualificationScore);
               if (null == godBeastStarMaterialModel) {
                  return -2;
               }

               if (godBeastItem.isLock) {
                  return -3;
               }

               if (godBeastItem.checkReset()) {
                  for(ResourceModel resourceModel : GodBeastDefine.getAllResetReturnReward(godBeastItem)) {
                     resourceModel.addResourceToList(returnRewardList);
                  }
               }

               totalProgress += godBeastStarMaterialModel.getProgramNum() * num;
            }
         }

         return totalProgress;
      } else {
         return -2;
      }
   }

   public List<ResourceModel> godBeastStarUp(GodBeastItem godBeastItem, int addProgress) {
      List<ResourceModel> returnRewardList = new ArrayList();
      if (null != godBeastItem && addProgress > 0) {
         GodBeastModel godBeastModel = GodBeastDefine.getGodBeastModel(godBeastItem.id);
         if (null != godBeastModel && godBeastModel.getUpStarID() > 0) {
            int totalProgress = godBeastItem.starUpProgress + addProgress;

            while(true) {
               int starId = godBeastItem.getStarId();
               GodBeastStarModel godBeastStarModel = GodBeastDefine.getGodBeastStarModel(starId);
               if (null != godBeastStarModel && godBeastStarModel.getNextStarID() > 0 && godBeastStarModel.getProgress() > 0) {
                  if (totalProgress >= godBeastStarModel.getProgress()) {
                     godBeastItem.setStarId(godBeastStarModel.getNextStarID());
                     totalProgress -= godBeastStarModel.getProgress();
                     continue;
                  }

                  if (totalProgress >= godBeastStarModel.getProgress()) {
                     continue;
                  }

                  godBeastItem.starUpProgress = totalProgress;
                  break;
               }

               godBeastItem.starUpProgress = 0;
               List<ResourceModel> rewardByStarUpProgress = GodBeastDefine.getRewardByStarUpProgress(totalProgress);
               returnRewardList.addAll(rewardByStarUpProgress);
               break;
            }

            return returnRewardList;
         } else {
            return returnRewardList;
         }
      } else {
         return returnRewardList;
      }
   }

   @MsgHandlerAnno
   public boolean C2S_LearnPassiveSkill_21609(GodBeastMsg.C2S_LearnPassiveSkill_21609 msg, String source) {
      GodBeastItem godBeastItem = this.getGodBeastItem(msg.getHeroCode(), msg.getItemCode());
      if (null == godBeastItem) {
         return this.player.failure(76145);
      } else {
         GodBeastModel godBeastModel = GodBeastDefine.getGodBeastModel(godBeastItem.id);
         if (null == godBeastModel) {
            return this.player.failure(37);
         } else if (godBeastModel.getPassiveSkill() <= 0) {
            return this.player.failure(76155);
         } else {
            GodBeastPassiveSkillModel godBeastPassiveSkillModel = GodBeastDefine.getGodBeastPassiveSkillModel(msg.getSkillId());
            if (null == godBeastPassiveSkillModel) {
               return this.player.failure(37);
            } else {
               if (godBeastItem.passiveSkillId <= 0) {
                  if (godBeastPassiveSkillModel.getPreLvSkillID() > 0) {
                     return this.player.failure(6);
                  }
               } else {
                  GodBeastPassiveSkillModel curPassiveSkillModel = GodBeastDefine.getGodBeastPassiveSkillModel(godBeastItem.passiveSkillId);
                  if (curPassiveSkillModel.getNextLvSkillID() != msg.getSkillId()) {
                     return this.player.failure(6);
                  }
               }

               ArrayList<ResourceBackModel> cost = godBeastPassiveSkillModel.getCost();
               List<ResourceModel> learnSkillCostList = new ArrayList();

               for(ResourceBackModel resourceBackModel : cost) {
                  ResourceModel rm = new ResourceModel(resourceBackModel.getType(), resourceBackModel.getId(), resourceBackModel.getValue());
                  rm.addResourceToList(learnSkillCostList);
               }

               if (!this.player.checkResourceNum(learnSkillCostList)) {
                  return this.player.failure(76135);
               } else {
                  this.player.delResource((List)learnSkillCostList, 123, 12311, 0, 0, "");
                  godBeastItem.passiveSkillId = msg.getSkillId();
                  this.updateGodBeastItem(msg.getHeroCode(), msg.getItemCode());
                  this.sendLearnSkillGift();
                  this.player.getOperationMgr().addExtraLog(this.player, 226, "灵兽id:" + godBeastItem.id, "学习的被动技能id:" + msg.getSkillId());
                  GodBeastMsg.S2C_LearnPassiveSkill_21610.Builder resp = GodBeastMsg.S2C_LearnPassiveSkill_21610.newBuilder();
                  this.player.sendMsg(resp.build());
                  return true;
               }
            }
         }
      }
   }

   public void sendLearnSkillGift() {
      GodBeastDao godBeastDao = this.getGodBeastDao();
      if (godBeastDao.learnSkillNum != Integer.MAX_VALUE) {
         ++godBeastDao.learnSkillNum;
         godBeastDao.updateOp();
      }

      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      giftPart.triggerTimeLimitGift(36, godBeastDao.learnSkillNum, true);
   }

   @MsgHandlerAnno
   public boolean C2S_ResetPassiveSkill_21611(GodBeastMsg.C2S_ResetPassiveSkill_21611 msg, String source) {
      GodBeastItem godBeastItem = this.getGodBeastItem(msg.getHeroCode(), msg.getItemCode());
      if (null == godBeastItem) {
         return this.player.failure(76145);
      } else {
         GodBeastModel godBeastModel = GodBeastDefine.getGodBeastModel(godBeastItem.id);
         if (null == godBeastModel) {
            return this.player.failure(37);
         } else if (godBeastItem.passiveSkillId <= 0) {
            return this.player.failure(76156);
         } else {
            GodBeastPassiveSkillModel godBeastPassiveSkillModel = GodBeastDefine.getGodBeastPassiveSkillModel(godBeastItem.passiveSkillId);
            if (null == godBeastPassiveSkillModel) {
               return this.player.failure(37);
            } else {
               ArrayList<ResourceModel> reSet = godBeastPassiveSkillModel.getReSet();
               if (!this.player.checkResourceNum((List)reSet)) {
                  return this.player.failure(76135);
               } else {
                  List<ResourceModel> passiveSkillResetReward = GodBeastDefine.getPassiveSkillResetReward(godBeastItem.passiveSkillId);
                  this.player.delResource((List)reSet, 123, 12313, 0, 0, "");
                  godBeastItem.passiveSkillId = 0;
                  this.player.addResource(passiveSkillResetReward, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 123, 12314, 0, 0, "");
                  this.updateGodBeastItem(msg.getHeroCode(), msg.getItemCode());
                  GodBeastMsg.S2C_ResetPassiveSkill_21612.Builder resp = GodBeastMsg.S2C_ResetPassiveSkill_21612.newBuilder();
                  this.player.sendMsg(resp.build());
                  return true;
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_LearnAttrSkill_21613(GodBeastMsg.C2S_LearnAttrSkill_21613 msg, String source) {
      GodBeastItem godBeastItem = this.getGodBeastItem(msg.getHeroCode(), msg.getItemCode());
      if (null == godBeastItem) {
         return this.player.failure(76145);
      } else {
         GodBeastModel godBeastModel = GodBeastDefine.getGodBeastModel(godBeastItem.id);
         if (null == godBeastModel) {
            return this.player.failure(37);
         } else {
            GodBeastStarModel godBeastStarModel = GodBeastDefine.getGodBeastStarModel(godBeastItem.getStarId());
            int star = 0;
            if (null != godBeastStarModel) {
               star = godBeastStarModel.getStar();
            }

            if (!GodBeastDefine.checkAttrSkillSlotUnlock(msg.getSlot(), star, godBeastModel.getQuality())) {
               return this.player.failure(76158);
            } else {
               GodBeastSkillModel useSkillModel = GodBeastDefine.getGodBeastSkillModel(msg.getSkillId());
               if (null == useSkillModel) {
                  return this.player.failure(37);
               } else {
                  Integer curAttrSkillId = (Integer)godBeastItem.attrSkillMap.get(msg.getSlot());
                  if (null != curAttrSkillId && curAttrSkillId > 0) {
                     GodBeastSkillModel curSkillModel = GodBeastDefine.getGodBeastSkillModel(curAttrSkillId);
                     if (curSkillModel.getNextLvSkillID() != msg.getSkillId()) {
                        return this.player.failure(76159);
                     }
                  } else {
                     Set<Integer> attrSkillGroups = GodBeastDefine.getAttrSkillGroups(godBeastItem.attrSkillMap);
                     if (attrSkillGroups.contains(useSkillModel.getSkillGroup()) || useSkillModel.getPreLvSkillID() > 0) {
                        return this.player.failure(76159);
                     }
                  }

                  ArrayList<ResourceBackModel> cost = useSkillModel.getCost();
                  List<ResourceModel> learnSkillCostList = new ArrayList();

                  for(ResourceBackModel resourceBackModel : cost) {
                     ResourceModel rm = new ResourceModel(resourceBackModel.getType(), resourceBackModel.getId(), resourceBackModel.getValue());
                     rm.addResourceToList(learnSkillCostList);
                  }

                  if (!this.player.checkResourceNum(learnSkillCostList)) {
                     return this.player.failure(76135);
                  } else {
                     this.player.delResource((List)learnSkillCostList, 123, 12315, 0, 0, "");
                     godBeastItem.attrSkillMap.put(msg.getSlot(), msg.getSkillId());
                     this.updateGodBeastItem(msg.getHeroCode(), msg.getItemCode());
                     this.sendLearnSkillGift();
                     this.player.getOperationMgr().addExtraLog(this.player, 226, "灵兽id:" + godBeastItem.id, "学习的属性技能id:" + msg.getSkillId() + ",槽位:" + msg.getSlot());
                     GodBeastMsg.S2C_LearnAttrSkill_21614.Builder resp = GodBeastMsg.S2C_LearnAttrSkill_21614.newBuilder();
                     this.player.sendMsg(resp.build());
                     return true;
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_ResetAttrSkill_21615(GodBeastMsg.C2S_ResetAttrSkill_21615 msg, String source) {
      GodBeastItem godBeastItem = this.getGodBeastItem(msg.getHeroCode(), msg.getItemCode());
      if (null == godBeastItem) {
         return this.player.failure(76145);
      } else {
         Integer curSkillId = (Integer)godBeastItem.attrSkillMap.get(msg.getSlot());
         if (null != curSkillId && curSkillId > 0) {
            GodBeastSkillModel curSkillModel = GodBeastDefine.getGodBeastSkillModel(curSkillId);
            if (null == curSkillModel) {
               return this.player.failure(37);
            } else {
               ArrayList<ResourceModel> reSet = curSkillModel.getReSet();
               if (!this.player.checkResourceNum((List)reSet)) {
                  return this.player.failure(76135);
               } else {
                  List<ResourceModel> attrSkillResetReward = GodBeastDefine.getAttrSkillResetReward(curSkillId);
                  this.player.delResource((List)reSet, 123, 12316, 0, 0, "");
                  godBeastItem.attrSkillMap.remove(msg.getSlot());
                  this.player.addResource(attrSkillResetReward, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 123, 12317, 0, 0, "");
                  this.updateGodBeastItem(msg.getHeroCode(), msg.getItemCode());
                  GodBeastMsg.S2C_ResetAttrSkill_21616.Builder resp = GodBeastMsg.S2C_ResetAttrSkill_21616.newBuilder();
                  this.player.sendMsg(resp.build());
                  return true;
               }
            }
         } else {
            return this.player.failure(76156);
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_UseGodBeast_21617(GodBeastMsg.C2S_UseGodBeast_21617 msg, String source) {
      HeroDao heroDao = this.getHeroDao(msg.getHeroCode());
      if (null == heroDao) {
         return this.player.failure(4100);
      } else {
         GodBeastItem tempGodBeastItem = this.getGodBeastItem(msg.getUseHeroCode(), msg.getUseItemCode());
         GodBeastItem useGodBeastItem = new GodBeastItem(0, tempGodBeastItem);
         if (null == useGodBeastItem) {
            return this.player.failure(76145);
         } else {
            ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
            if (heroDao.godBeastItem == null) {
               heroDao.godBeastItem = useGodBeastItem;
            } else {
               GodBeastItem godBeastItem = this.addGodBeastItem(heroDao.godBeastItem, 123, 12307, false);
               if (null == godBeastItem) {
                  this.logger.error("addGodBeastItem 添加灵兽道具异常");
                  return this.player.failure(6);
               }

               heroDao.godBeastItem = useGodBeastItem;
            }

            if (msg.getUseHeroCode() > 0) {
               HeroDao useHeroDao = this.getHeroDao(msg.getUseHeroCode());
               useHeroDao.godBeastItem = null;
               this.updateHeroGodBeastAndFlush(msg.getUseHeroCode());
            } else {
               itemBagPart.deleteItemByCode(msg.getUseItemCode(), 1, 123, 12306, 0, 0, "");
               this.player.senditemUpdateMsg();
            }

            this.updateHeroGodBeastAndFlush(msg.getHeroCode());
            GodBeastMsg.S2C_UseGodBeast_21618.Builder resp = GodBeastMsg.S2C_UseGodBeast_21618.newBuilder();
            this.player.sendMsg(resp.build());
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_NoUseGodBeast_21619(GodBeastMsg.C2S_NoUseGodBeast_21619 msg, String source) {
      HeroDao heroDao = this.getHeroDao(msg.getHeroCode());
      if (null == heroDao) {
         return this.player.failure(4100);
      } else if (heroDao.godBeastItem == null) {
         return this.player.failure(76148);
      } else {
         GodBeastItem godBeastItem = this.addGodBeastItem(heroDao.godBeastItem, 123, 12307, false);
         if (null == godBeastItem) {
            this.logger.error("addGodBeastItem 添加灵兽道具异常");
            return this.player.failure(6);
         } else {
            heroDao.godBeastItem = null;
            this.updateHeroGodBeastAndFlush(msg.getHeroCode());
            GodBeastMsg.S2C_NoUseGodBeast_21620.Builder resp = GodBeastMsg.S2C_NoUseGodBeast_21620.newBuilder();
            this.player.sendMsg(resp.build());
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_ChangeGodBeast_21621(GodBeastMsg.C2S_ChangeGodBeast_21621 msg, String source) {
      GodBeastItem godBeastItem = this.getGodBeastItem(msg.getHeroCode(), msg.getItemCode());
      if (null == godBeastItem) {
         return this.player.failure(76145);
      } else {
         GodBeastModel curModel = GodBeastDefine.getGodBeastModel(godBeastItem.id);
         GodBeastModel targetModel = GodBeastDefine.getGodBeastModel(msg.getTargetGodBeastId());
         if (null != curModel && targetModel != null) {
            if (curModel.getGodBeastID() == targetModel.getGodBeastID()) {
               return this.player.failure(6);
            } else if (curModel.getQuality() == targetModel.getQuality() && curModel.getChangeIf() > 0 && targetModel.getChangeIf() > 0) {
               if (!this.player.checkResourceNum(curModel.getChangeCost())) {
                  return this.player.failure(76135);
               } else {
                  GodBeastItem targetItem = new GodBeastItem(0, godBeastItem);
                  targetItem.id = targetModel.getGodBeastID();
                  targetItem.setStarId(GodBeastDefine.recStarIdWhenGodBeastIdChange(targetModel.getGodBeastID(), godBeastItem.getStarId()));
                  if (msg.getHeroCode() > 0) {
                     HeroDao heroDao = this.getHeroDao(msg.getHeroCode());
                     heroDao.godBeastItem = targetItem;
                     this.updateHeroGodBeastAndFlush(msg.getHeroCode());
                  } else {
                     ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                     GodBeastItem gbi = this.addGodBeastItem(targetItem, 123, 12321, false);
                     if (null == gbi) {
                        this.logger.error("addGodBeastItem 异常");
                        return this.player.failure(6);
                     }

                     itemBagPart.deleteItemByCode(msg.getItemCode(), 1, 123, 12320, 0, 0, "");
                     this.player.senditemUpdateMsg();
                  }

                  this.player.delResource((List)curModel.getChangeCost(), 123, 12320, 0, 0, "");
                  GodBeastMsg.S2C_ChangeGodBeast_21622.Builder resp = GodBeastMsg.S2C_ChangeGodBeast_21622.newBuilder();
                  this.player.sendMsg(resp.build());
                  return true;
               }
            } else {
               return this.player.failure(76147);
            }
         } else {
            return this.player.failure(37);
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_ResetGodBeast_21623(GodBeastMsg.C2S_ResetGodBeast_21623 msg, String source) {
      GodBeastItem godBeastItem = this.getGodBeastItem(msg.getHeroCode(), msg.getItemCode());
      if (null == godBeastItem) {
         return this.player.failure(76145);
      } else {
         List<ResourceModel> godBeastResetCost = godBeastItem.recResetCost();
         if (!this.player.checkResourceNum(godBeastResetCost)) {
            return this.player.failure(76135);
         } else if (!godBeastItem.checkReset()) {
            return this.player.failure(76150);
         } else {
            List<ResourceModel> allResetReturnReward = GodBeastDefine.getAllResetReturnReward(godBeastItem);
            this.player.delResource((List)godBeastResetCost, 123, 12322, 0, 0, "");
            this.player.addResource(allResetReturnReward, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 123, 12323, 0, 0, "");
            godBeastItem.reset();
            this.updateGodBeastItem(msg.getHeroCode(), msg.getItemCode());
            GodBeastMsg.S2C_ResetGodBeast_21624.Builder resp = GodBeastMsg.S2C_ResetGodBeast_21624.newBuilder();
            this.player.sendMsg(resp.build());
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_DecomposeGodBeast_21625(GodBeastMsg.C2S_DecomposeGodBeast_21625 msg, String source) {
      List<Integer> itemCodeList = this.intDistinct(msg.getItemCodeList());
      int godBeastExpDecompositionMax = this.configManager.getIntDefault("godBeastExpDecompositionMax", 10);
      if (itemCodeList.size() > 0 && itemCodeList.size() <= godBeastExpDecompositionMax) {
         List<ResourceModel> allReward = new ArrayList();

         for(Integer itemCode : itemCodeList) {
            GodBeastItem godBeastItem = this.getGodBeastItemFromBag(itemCode);
            if (null == godBeastItem) {
               return this.player.failure(76145);
            }

            if (godBeastItem.isLock) {
               return this.player.failure(76162);
            }

            int scoreId = GodBeastDefine.calGodBeastScoreId(godBeastItem);
            GodBeastDecompositionModel godBeastDecompositionModel = GodBeastDefine.getGodBeastDecompositionModel(godBeastItem.id, scoreId);
            if (null == godBeastDecompositionModel) {
               return this.player.failure(76160);
            }

            for(ResourceModel rm : godBeastDecompositionModel.getDecomposeGet()) {
               rm.addResourceToList(allReward);
            }

            if (godBeastItem.checkReset()) {
               for(ResourceModel resourceModel : GodBeastDefine.getAllResetReturnReward(godBeastItem)) {
                  resourceModel.addResourceToList(allReward);
               }
            }

            if (godBeastItem.mainNeiDan != null) {
               NeiDanPart neiDanPart = (NeiDanPart)this.player.getMgrPart(NeiDanPart.class);
               NeiDanItem neiDanItem = neiDanPart.addNeiDanItem(godBeastItem.mainNeiDan, 123, 12319, false);
               this.player.addResourceMsg(neiDanItem);
            }
         }

         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         itemBagPart.deleteItemByCodes(itemCodeList, 123, 12318, 0, 0, "");
         this.player.addResource(allReward, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 123, 12319, 0, 0, "");
         GodBeastMsg.S2C_DecomposeGodBeast_21626.Builder resp = GodBeastMsg.S2C_DecomposeGodBeast_21626.newBuilder();
         this.player.sendMsg(resp.build());
         return true;
      } else {
         return this.player.failure(6);
      }
   }

   @MsgHandlerAnno
   public boolean C2S_InheritGodBeast_21627(GodBeastMsg.C2S_InheritGodBeast_21627 msg, String source) {
      if (!msg.getDevelop() && !msg.getAptitude()) {
         return this.player.failure(6);
      } else {
         GodBeastItem godBeastItem = this.getGodBeastItem(msg.getHeroCode(), msg.getItemCode());
         GodBeastItem costGodBeastItem = this.getGodBeastItemFromBag(msg.getCostItemCode());
         if (null != godBeastItem && null != costGodBeastItem) {
            if (costGodBeastItem.isLock) {
               return this.player.failure(76162);
            } else {
               GodBeastModel godBeastModel = GodBeastDefine.getGodBeastModel(godBeastItem.id);
               GodBeastModel costGodBeastModel = GodBeastDefine.getGodBeastModel(costGodBeastItem.id);
               if (godBeastModel.getQuality() != costGodBeastModel.getQuality()) {
                  return this.player.failure(76161);
               } else {
                  List<ResourceModel> godBeastResetReward = new ArrayList();
                  List<ResourceModel> cost = new ArrayList();
                  StringBuilder inheritStr = new StringBuilder();
                  inheritStr.append("勾选的传承选项:");
                  if (msg.getDevelop()) {
                     if (godBeastItem.checkReset()) {
                        for(ResourceModel rm : GodBeastDefine.getAllResetReturnReward(godBeastItem)) {
                           rm.addResourceToList(godBeastResetReward);
                        }
                     }

                     godBeastItem.developInherit(costGodBeastItem);
                     List<ResourceModel> godBeastDevelopImpartCost = this.configManager.getResourceModelList("godBeastDevelopImpartCost", "1|9|100");
                     cost.addAll(godBeastDevelopImpartCost);
                     inheritStr.append("养成,");
                  } else if (costGodBeastItem.checkReset()) {
                     for(ResourceModel rm : GodBeastDefine.getAllResetReturnReward(costGodBeastItem)) {
                        rm.addResourceToList(godBeastResetReward);
                     }
                  }

                  if (msg.getAptitude()) {
                     godBeastItem.aptitudeInherit(costGodBeastItem);
                     List<ResourceModel> godBeastAptitudeImpartCost = this.configManager.getResourceModelList("godBeastAptitudeImpartCost", "1|9|200");
                     cost.addAll(godBeastAptitudeImpartCost);
                     inheritStr.append("资质");
                  }

                  boolean isNeedSendResourceMsg = false;
                  if (costGodBeastItem.mainNeiDan != null) {
                     NeiDanPart neiDanPart = (NeiDanPart)this.player.getMgrPart(NeiDanPart.class);
                     NeiDanItem neiDanItem = neiDanPart.addNeiDanItem(costGodBeastItem.mainNeiDan, 123, 12325, false);
                     this.player.addResourceMsg(neiDanItem);
                     isNeedSendResourceMsg = true;
                  }

                  godBeastItem.martRecTime = Math.max(godBeastItem.martRecTime, costGodBeastItem.martRecTime);
                  ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                  itemBagPart.deleteItemByCode(msg.getCostItemCode(), 1, 123, 12324, 0, 0, "");
                  this.player.delResource((List)cost, 123, 12324, 0, 0, "");
                  if (godBeastResetReward.size() > 0) {
                     this.player.addResource(godBeastResetReward, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 123, 12325, 0, 0, "");
                     isNeedSendResourceMsg = false;
                  }

                  if (isNeedSendResourceMsg) {
                     this.player.sendResourceMsg();
                  }

                  this.updateGodBeastItem(msg.getHeroCode(), msg.getItemCode());
                  this.player.getOperationMgr().addExtraLog(this.player, 227, "用于传承的灵兽id:" + costGodBeastItem.id, "接受传承的灵兽id:" + godBeastItem.id, inheritStr.toString());
                  GodBeastMsg.S2C_InheritGodBeast_21628.Builder resp = GodBeastMsg.S2C_InheritGodBeast_21628.newBuilder();
                  this.player.sendMsg(resp.build());
                  return true;
               }
            }
         } else {
            return this.player.failure(76145);
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_RecScoreReward_21632(GodBeastMsg.C2S_RecScoreReward_21632 msg, String source) {
      if (!this.player.isSystemOpen(6340)) {
         return this.player.failure(21);
      } else {
         GodBeastTaskRewardModel taskRewardModel = (GodBeastTaskRewardModel)ApplicationContextProvider.getModelPoolEntity("GodBeastTaskReward", msg.getId());
         if (null == taskRewardModel) {
            return this.player.failure(37);
         } else if (!this.player.checkResourceNum(taskRewardModel.getScore())) {
            return this.player.failure(76151);
         } else {
            GodBeastDao godBeastDao = this.getGodBeastDao();
            if (godBeastDao.recScoreRewards.contains(taskRewardModel.getId())) {
               return this.player.failure(76030);
            } else {
               this.player.addResource(taskRewardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 123, 12327, 0, 0, "");
               godBeastDao.recScoreRewards.add(taskRewardModel.getId());
               int scoreNum = ((ResourceModel)taskRewardModel.getScore().get(0)).getValue();
               this.player.getOperationMgr().addExtraLog(this.player, 16, "灵兽任务-能量", scoreNum + "", scoreNum + "");
               Map<Integer, GodBeastTaskRewardModel> rewardModelMap = ApplicationContextProvider.<Integer, GodBeastTaskRewardModel>getModelPoolMap("GodBeastTaskReward");
               if (godBeastDao.recScoreRewards.size() >= rewardModelMap.keySet().size()) {
                  for(Map.Entry<Integer, GodBeastTaskRewardModel> entry : rewardModelMap.entrySet()) {
                     GodBeastTaskRewardModel value = (GodBeastTaskRewardModel)entry.getValue();
                     if (value.getReset() > 0) {
                        this.player.delResource((List)value.getScore(), 123, 12328, 0, 0, "");
                        godBeastDao.recScoreRewards.clear();
                        break;
                     }
                  }
               }

               godBeastDao.updateOp();
               GodBeastMsg.S2C_RecScoreReward_21633.Builder resp = GodBeastMsg.S2C_RecScoreReward_21633.newBuilder();
               resp.addAllRecId(godBeastDao.recScoreRewards);
               this.player.sendMsg(resp.build());
               return true;
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_GetRecScoreReward_21634(GodBeastMsg.C2S_GetRecScoreReward_21634 msg, String source) {
      this.sendRecScoreReward_21635();
   }

   public void sendRecScoreReward_21635() {
      GodBeastDao godBeastDao = this.getGodBeastDao();
      GodBeastMsg.S2C_GetRecScoreReward_21635.Builder resp = GodBeastMsg.S2C_GetRecScoreReward_21635.newBuilder();
      resp.addAllRecId(godBeastDao.recScoreRewards);
      Calendar calendar = this.recWeekResetCalendar(godBeastDao.resetTime);
      resp.setNextResetTime(calendar.getTimeInMillis());
      this.player.sendMsg(resp.build());
   }

   public void resetTaskScore(long millisecond) {
      if (this.player.isSystemOpen(6340)) {
         GodBeastDao godBeastDao = this.getGodBeastDao();
         Map<Integer, GodBeastTaskRewardModel> taskRewardModelMap = ApplicationContextProvider.<Integer, GodBeastTaskRewardModel>getModelPoolMap("GodBeastTaskReward");
         List<ResourceModel> resetRewardList = new ArrayList();

         for(Map.Entry<Integer, GodBeastTaskRewardModel> entry : taskRewardModelMap.entrySet()) {
            int id = (Integer)entry.getKey();
            GodBeastTaskRewardModel model = (GodBeastTaskRewardModel)entry.getValue();
            if (!godBeastDao.recScoreRewards.contains(id) && this.player.checkResourceNum(model.getScore())) {
               for(ResourceModel reward : model.getRewards()) {
                  reward.addResourceToList(resetRewardList);
               }
            }
         }

         if (resetRewardList.size() > 0) {
            CentreAwardModel centreAwardModel = (CentreAwardModel)ApplicationContextProvider.getModelPoolEntity("centreAward", CentreAwardModel.ID_GOD_BEAST_SCORE_REWARD);
            if (null != centreAwardModel) {
               MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
               mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), resetRewardList, 604800000L, 123, 12327);
            }
         }

         TaskCustomCache taskCustomCache = (TaskCustomCache)this.player.getCustomCache("tb_task", this.player.getPlayerId());
         taskCustomCache.delete(TaskDefine.TaskModule.MODULE_GOD_BEAST);
         godBeastDao.taskCompleteNum.clear();
         godBeastDao.taskScore.clear();
         godBeastDao.recScoreRewards.clear();
         godBeastDao.resetTime = millisecond;
         godBeastDao.eggBuyNum = 0;
         godBeastDao.updateOp();
         List<GodBeastTaskRewardModel> collect = new ArrayList(taskRewardModelMap.values());
         GodBeastTaskRewardModel taskRewardModel = (GodBeastTaskRewardModel)collect.get(0);
         ResourceModel rm = (ResourceModel)taskRewardModel.getScore().get(0);
         this.player.delResourceAllNum(rm.getType(), rm.getId(), 123, 12329, 0, 0, "");
         GodBeastTaskPart godBeastTaskPart = (GodBeastTaskPart)this.player.getMgrPart(GodBeastTaskPart.class);
         godBeastTaskPart.trigger();
         this.sendRecScoreReward_21635();
         this.sendGodBeastHatchInfo();
      }
   }

   public void resetDaily() {
      this.checkResetTaskScore();
   }

   @MsgHandlerAnno
   public boolean C2S_NoticeInfo_21636(GodBeastMsg.C2S_NoticeInfo_21636 msg, String source) {
      GodBeastMsg.S2C_NoticeInfo_21637.Builder resp = GodBeastMsg.S2C_NoticeInfo_21637.newBuilder();
      resp.addAllUnlockId(this.getNoticeUnlockIdList());
      this.player.sendMsg(resp.build());
      return true;
   }

   @MsgHandlerAnno
   public boolean C2S_NoticePointUnlock_21638(GodBeastMsg.C2S_NoticePointUnlock_21638 msg, String source) {
      if (!this.player.isSystemOpen(6330)) {
         return this.player.failure(21);
      } else {
         List<Integer> noticeUnlockIdList = this.getNoticeUnlockIdList();
         int nextId = 1;
         if (noticeUnlockIdList.size() > 0) {
            int maxId = (Integer)noticeUnlockIdList.get(noticeUnlockIdList.size() - 1);
            GodBeastNoticeModel maxNoticeModel = (GodBeastNoticeModel)ApplicationContextProvider.getModelPoolEntity("GodBeastNotice", maxId);
            if (null == maxNoticeModel) {
               this.logger.error("GodBeastNotice 配置有误 id:{}", maxId);
               return this.player.failure(37);
            }

            nextId = maxNoticeModel.getNextId();
         }

         if (nextId <= 0) {
            return this.player.failure(76154);
         } else {
            GodBeastNoticeModel noticeModel = (GodBeastNoticeModel)ApplicationContextProvider.getModelPoolEntity("GodBeastNotice", nextId);
            if (null == noticeModel) {
               this.logger.error("GodBeastNotice 配置有误 id:{}", noticeModel.getId());
               return this.player.failure(37);
            } else if (this.player.getPlayerDao().lv < noticeModel.getUnlockLv()) {
               return this.player.failure(20);
            } else {
               GodBeastDao godBeastDao = this.getGodBeastDao();
               godBeastDao.unlockNoticeIds.add(nextId);
               godBeastDao.updateOp();
               this.player.addResource(noticeModel.getItems(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 123, 12330, 0, 0, "");
               if (this.checkNoticeAllUnlock()) {
                  GodBeastTaskPart godBeastTaskPart = (GodBeastTaskPart)this.player.getMgrPart(GodBeastTaskPart.class);
                  godBeastTaskPart.trigger();
                  this.unlockFirstWeekHandle();
                  this.player.triggerTask(733, 0, 1L, 0);
               }

               GodBeastMsg.S2C_NoticePointUnlock_21639.Builder resp = GodBeastMsg.S2C_NoticePointUnlock_21639.newBuilder();
               resp.addAllUnlockId(this.getNoticeUnlockIdList());
               this.player.sendMsg(resp.build());
               return true;
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_HatchRecordList_21640(GodBeastMsg.C2S_HatchRecordList_21640 msg, String source) {
      if (this.player.isSystemOpen(6340)) {
         GodBeastDao godBeastDao = this.getGodBeastDao();
         Deque<GodBeastRecordData> playerRecordList = new LinkedList(godBeastDao.recordList);
         this.godBeastMgr.pushTask(() -> this.godBeastMgr.sendRecordListMsg(this.player, this.player.getPlayerDao().playerName, playerRecordList));
      }
   }

   @MsgHandlerAnno
   public boolean C2S_GodBeastLock_21643(GodBeastMsg.C2S_GodBeastLock_21643 msg, String source) {
      if (!this.player.isSystemOpen(6330)) {
         return this.player.failure(21);
      } else {
         GodBeastItem godBeastItem = this.getGodBeastItem(msg.getHeroCode(), msg.getItemCode());
         if (null == godBeastItem) {
            return this.player.failure(76145);
         } else {
            if (msg.getType() > 0) {
               if (godBeastItem.isLock) {
                  return this.player.failure(6);
               }

               godBeastItem.isLock = true;
            } else {
               if (!godBeastItem.isLock) {
                  return this.player.failure(6);
               }

               godBeastItem.isLock = false;
            }

            this.updateGodBeastItem(msg.getHeroCode(), msg.getItemCode());
            GodBeastMsg.S2C_GodBeastLock_21644.Builder resp = GodBeastMsg.S2C_GodBeastLock_21644.newBuilder();
            this.player.sendMsg(resp.build());
            return true;
         }
      }
   }

   public boolean checkNoticeAllUnlock() {
      List<Integer> noticeUnlockIdList = this.getNoticeUnlockIdList();
      if (noticeUnlockIdList.isEmpty()) {
         return false;
      } else {
         Map<Integer, GodBeastNoticeModel> modelMap = ApplicationContextProvider.<Integer, GodBeastNoticeModel>getModelPoolMap("GodBeastNotice");
         return noticeUnlockIdList.size() >= modelMap.size();
      }
   }

   public void checkResetTaskScore() {
      if (this.player.isSystemOpen(6340)) {
         GodBeastDao godBeastDao = this.getGodBeastDao();
         if (godBeastDao.resetTime > 0L) {
            Calendar calendar = this.recWeekResetCalendar(godBeastDao.resetTime);
            long weekResetTime = calendar.getTimeInMillis();
            long nowTime = System.currentTimeMillis();
            if (nowTime > weekResetTime) {
               this.resetTaskScore(nowTime);
            }

         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_GodBeastBuyEgg_21645(GodBeastMsg.C2S_GodBeastBuyEgg_21645 msg, String source) {
      GodBeastDao godBeastDao = this.getGodBeastDao();
      int nowBuyNum = godBeastDao.eggBuyNum + 1;
      GodBeastBuyEggModel godBeastBuyEggModel = GodBeastDefine.getGodBeastBuyEggModel(nowBuyNum);
      if (null == godBeastBuyEggModel) {
         return this.player.failure(25);
      } else {
         ResourceModel cost = new ResourceModel(godBeastBuyEggModel.getItemType(), godBeastBuyEggModel.getItemId(), godBeastBuyEggModel.getItemNum());
         if (!this.player.checkResourceNum(cost)) {
            return this.player.failure(76135);
         } else {
            this.player.delResource(cost, 123, 12331, 0, 0, "");
            this.player.addResource(godBeastBuyEggModel.getReward(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 123, 12332, 0, 0, "");
            godBeastDao.eggBuyNum = nowBuyNum;
            godBeastDao.updateOp();
            GodBeastMsg.S2C_GodBeastBuyEgg_21646.Builder resp = GodBeastMsg.S2C_GodBeastBuyEgg_21646.newBuilder();
            resp.setEggBuyNum(godBeastDao.eggBuyNum);
            this.player.sendMsg(resp.build());
            return true;
         }
      }
   }

   public void unlockFirstWeekHandle() {
      GodBeastDao godBeastDao = this.getGodBeastDao();
      godBeastDao.resetTime = System.currentTimeMillis();
      godBeastDao.updateOp();
   }

   public Calendar recWeekResetCalendar(long time) {
      Calendar calendar = Calendar.getInstance();
      if (time > 0L) {
         calendar.setTimeInMillis(time);
      }

      calendar.setFirstDayOfWeek(2);
      calendar.set(7, 1);
      calendar.set(11, 23);
      calendar.set(12, 59);
      calendar.set(13, 59);
      return calendar;
   }

   public List<Integer> getNoticeUnlockIdList() {
      GodBeastDao godBeastDao = this.getGodBeastDao();
      if (godBeastDao.unlockNoticeIds.isEmpty()) {
         return new ArrayList();
      } else {
         List<Integer> unlockNoticeIdList = (List)godBeastDao.unlockNoticeIds.stream().sorted((o1, o2) -> o1 - o2).collect(Collectors.toList());
         return unlockNoticeIdList;
      }
   }

   public Map<Integer, Integer> mapDataIIDistinct(List<CommonMsg.MapDataII> mapDataIIList) {
      Map<Integer, Integer> map = new HashMap();
      if (null != mapDataIIList && !mapDataIIList.isEmpty()) {
         for(CommonMsg.MapDataII mapDataII : mapDataIIList) {
            map.put(mapDataII.getKey(), mapDataII.getValue());
         }

         return map;
      } else {
         return map;
      }
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

   public boolean gmAddGodBeast(int hatchLibId) {
      GodBeastHatchLibModel godBeastHatchLibModel = GodBeastDefine.getGodBeastHatchLibModel(hatchLibId);
      if (null == godBeastHatchLibModel) {
         return this.player.failure(6);
      } else {
         GodBeastItem randomGodBeastItem = GodBeastDefine.randomGodBeastItem(godBeastHatchLibModel.getGodBeastID(), godBeastHatchLibModel.getAptitude());
         if (null == randomGodBeastItem) {
            return this.player.failure(37);
         } else {
            GodBeastItem godBeastItem = this.addGodBeastItem(randomGodBeastItem, 123, 702, true);
            return null == godBeastItem ? this.player.failure(6) : true;
         }
      }
   }

   public boolean gmAddGodBeast(int godBeastId, Map<Integer, PropertyModel> attrMap) {
      GodBeastItem tempGodBeastItem = new GodBeastItem(godBeastId, attrMap);
      if (null == tempGodBeastItem) {
         return this.player.failure(37);
      } else {
         GodBeastItem godBeastItem = this.addGodBeastItem(tempGodBeastItem, 123, 702, true);
         return null == godBeastItem ? this.player.failure(6) : true;
      }
   }

   public boolean gmGodBeastHatch(int hatchCount) {
      if (hatchCount >= 1 && hatchCount <= 1000) {
         GodBeastDao godBeastDao = this.getGodBeastDao();
         if (godBeastDao.hatchNum <= 0L) {
            return this.player.failure(76163);
         } else {
            this.crossBatchHatch(1, godBeastDao.hatchNum, godBeastDao.qualityHatchNum, hatchCount, true);
            return true;
         }
      } else {
         return this.player.failure(6);
      }
   }
}
