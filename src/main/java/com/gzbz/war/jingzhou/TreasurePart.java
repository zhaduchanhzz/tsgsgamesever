package com.gzbz.war.jingzhou;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.HeroDao;
import com.gzbz.db.TreasureDao;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gift.GiftPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.TreasureAdditionModel;
import com.gzbz.model.TreasureConditionModel;
import com.gzbz.model.TreasureModel;
import com.gzbz.model.TreasureQualityModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.TreasureMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class TreasurePart extends PlayerPart {
   private Logger logger = LoggerFactory.getLogger(TreasurePart.class);

   public void loginHandle() {
      this.initTreasure();
   }

   public void initTreasure() {
      Map<Integer, TreasureDao> treasureDaoMap = this.player.<Integer, TreasureDao>getMap("tb_player_treasure", this.player.getPlayerId());
      if (treasureDaoMap == null || treasureDaoMap.isEmpty()) {
         Map<Integer, TreasureModel> treasureModelMap = this.player.getGameModelPool().getMap("treasure");

         for(Integer treasureId : treasureModelMap.keySet()) {
            this.addTreasure(treasureId);
         }
      }

   }

   private TreasureDao addTreasure(int treasureId) {
      TreasureDao treasureDao = this.getTreasureDaoById(treasureId);
      if (treasureDao != null) {
         this.logger.info("已经有这个宝物了");
         return treasureDao;
      } else {
         TreasureModel treasureModel = (TreasureModel)this.player.getGameModelPool().getEntity("treasure", treasureId);
         treasureDao = new TreasureDao();
         treasureDao.playerId = this.player.getPlayerId();
         treasureDao.treasureId = treasureModel.getTreasureId();
         treasureDao.level = 1;
         treasureDao.unLock = false;
         this.player.insertDao(treasureDao);
         return treasureDao;
      }
   }

   public TreasureDao getTreasureDaoById(int treasureId) {
      Map<Integer, TreasureDao> map = this.player.<Integer, TreasureDao>getMap("tb_player_treasure", this.player.getPlayerId());
      return map != null && map.containsKey(treasureId) ? (TreasureDao)map.get(treasureId) : null;
   }

   @MsgHandlerAnno
   public void getTreasureInfo(TreasureMsg.C2S_GetTreasureInfo_9401 msg, String channelId) {
      Map<Integer, TreasureDao> treasureDaoMap = this.player.<Integer, TreasureDao>getMap("tb_player_treasure", this.player.getPlayerId());
      TreasureMsg.S2C_GetTreasureInfo_9402.Builder builder = TreasureMsg.S2C_GetTreasureInfo_9402.newBuilder();

      for(TreasureDao treasureDao : treasureDaoMap.values()) {
         builder.addInfo(this.getTreasure(treasureDao));
      }

      this.player.sendMsg(builder.build());
   }

   public TreasureMsg.TreasureInfo.Builder getTreasure(TreasureDao treasureDao) {
      TreasureMsg.TreasureInfo.Builder info = TreasureMsg.TreasureInfo.newBuilder();
      info.setTreasureId(treasureDao.treasureId);
      info.setExp(treasureDao.exp);
      info.setLevel(treasureDao.level);
      info.setUnLock(treasureDao.unLock);
      info.setStarSum(treasureDao.starSum);
      return info;
   }

   @MsgHandlerAnno
   public void unLockTreasure(TreasureMsg.C2S_UnLockTreasure_9403 msg, String channelId) {
      int treasureId = msg.getTreasureId();
      int heroCode = msg.getHeroCode();
      TreasureDao treasureDao = this.getTreasureDaoById(treasureId);
      TreasureModel treasureModel = (TreasureModel)this.player.getGameModelPool().getEntity("treasure", treasureId);
      if (Objects.isNull(treasureModel)) {
         this.player.failure(6);
      } else {
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         TreasureConditionModel treasureConditionModel = (TreasureConditionModel)this.player.getGameModelPool().getEntity("treasureCondition", treasureModel.getCondition());
         if (treasureConditionModel.getCondition() == 2) {
            if (!this.player.checkResourceNum(2, treasureConditionModel.getPropId(), treasureConditionModel.getPropNum())) {
               this.player.failure(29009);
               return;
            }

            this.player.delResource(2, treasureConditionModel.getPropId(), (long)treasureConditionModel.getPropNum(), 29, 2106, 0, 0, "");
         } else {
            HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
            if (heroDao == null) {
               this.player.failure(6);
               return;
            }

            if (heroDao.isHaveArrayingState()) {
               this.logger.info("该英雄为上阵状态:{}", heroDao.code);
               this.player.failure(29008);
               return;
            }

            int nation = heroBagPart.getHeroNation(heroDao);
            if (treasureConditionModel.getTargetNation() != nation) {
               this.player.failure(29005);
               return;
            }

            if (treasureConditionModel.getTargetStar() != heroDao.getStar()) {
               this.player.failure(29000);
               return;
            }

            List<Integer> heroList = new ArrayList();
            heroList.add(heroCode);
            boolean success = heroBagPart.deleteHero(heroList, HeroDefine.DelHeroType.DEL_USE, 29, 2106, 0, 0, "");
            if (!success) {
               this.logger.info("删除武将失败 playerId:{} heroList:{}", this.player.getPlayerId(), heroList);
               return;
            }

            this.player.senditemUpdateMsg();
            this.player.sendResourceMsg();
         }

         treasureDao.unLock = true;
         treasureDao.updateOp();
         TreasureMsg.S2C_UnLockTreasure_9404.Builder builder = TreasureMsg.S2C_UnLockTreasure_9404.newBuilder();
         builder.setInfo(this.getTreasure(treasureDao));
         heroBagPart.setProperty_reasuret_map(this.getTreasurePro());
         this.player.sendMsg(builder.build());
         this.player.triggerTask(351, 0, 1L, 1);
      }
   }

   @MsgHandlerAnno
   public void upLevTreasure(TreasureMsg.C2S_TreasureUpLev_9405 msg, String channelId) {
      int treasureId = msg.getTreasureId();
      TreasureDao treasureDao = this.getTreasureDaoById(treasureId);
      if (!Objects.isNull(treasureDao)) {
         TreasureAdditionModel additionModel = (TreasureAdditionModel)this.player.getGameModelPool().getEntity("treasureAddition", treasureDao.level);
         TreasureModel treasureModel = (TreasureModel)this.player.getGameModelPool().getEntity("treasure", treasureId);
         int treasureLimitLev = ApplicationContextProvider.getConfigInt("treasureLimitLev", 150);
         if (!treasureDao.unLock) {
            this.player.failure(29003);
         } else if (treasureDao.level >= treasureLimitLev && treasureDao.exp >= additionModel.getExp()) {
            this.player.failure(29004);
         } else if (!this.player.checkResourceNum(additionModel.getItemType1(), additionModel.getItemId1(), additionModel.getItemNum1())) {
            this.logger.info("道具不足");
            this.player.failure(29001);
         } else {
            String[] ids = additionModel.getItemId2().split("\\|");
            int itemId2 = Integer.parseInt(ids[treasureModel.getFaction() - 1]);
            if (!this.player.checkResourceNum(additionModel.getItemType2(), itemId2, additionModel.getItemNum2())) {
               this.logger.info("道具不足");
               this.player.failure(29001);
            } else {
               this.player.delResource(additionModel.getItemType1(), additionModel.getItemId1(), (long)additionModel.getItemNum1(), 29, 2107, 0, 0, "");
               this.player.delResource(additionModel.getItemType2(), itemId2, (long)additionModel.getItemNum2(), 29, 2107, 0, 0, "");
               if (treasureDao.exp + additionModel.getUpgradeExp() >= additionModel.getExp()) {
                  if (additionModel.getNextLv() == 0) {
                     treasureDao.exp += additionModel.getUpgradeExp();
                  } else {
                     treasureDao.level = additionModel.getNextLv();
                     treasureDao.exp = 0;
                  }
               } else {
                  treasureDao.exp += additionModel.getUpgradeExp();
               }

               treasureDao.updateOp();
               TreasureMsg.S2C_TreasureUpLev_9406.Builder builder = TreasureMsg.S2C_TreasureUpLev_9406.newBuilder();
               builder.setInfo(this.getTreasure(treasureDao));
               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               heroBagPart.setProperty_reasuret_map(this.getTreasurePro());
               heroBagPart.flushNationHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_TREASURE_LEVEL, treasureModel.getFaction());
               this.player.sendMsg(builder.build());
               GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
               giftPart.triggerTimeLimitGift(14, treasureDao.level);
               this.player.getOperationMgr().addExtraLog(this.player, 197, "升级", additionModel.getItemId1() + "", additionModel.getItemNum1() + "", itemId2 + "", additionModel.getItemNum2() + "", treasureDao.level + "");
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_TreasureResetLv_9413(TreasureMsg.C2S_TreasureResetLv_9413 msg, String channelId) {
      int treasureId = msg.getTreasureId();
      TreasureDao treasureDao = this.getTreasureDaoById(treasureId);
      if (!Objects.isNull(treasureDao)) {
         TreasureModel treasureModel = (TreasureModel)this.player.getGameModelPool().getEntity("treasure", treasureId);
         if (treasureDao.unLock && (treasureDao.level != 1 || treasureDao.exp != 0)) {
            int cost = ApplicationContextProvider.getConfigInt("treasureUpgradeReset", 500);
            if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, cost)) {
               this.player.failure(31);
            } else {
               List<ResourceModel> resourceList = new ArrayList();
               Map<Integer, TreasureAdditionModel> modelMap = this.player.getGameModelPool().getMap("treasureAddition");

               for(TreasureAdditionModel model : modelMap.values()) {
                  if (model.getLevel() < treasureDao.level) {
                     int upNum = model.getExp() / model.getUpgradeExp();
                     String[] ids = model.getItemId2().split("\\|");
                     int itemId2 = Integer.parseInt(ids[treasureModel.getFaction() - 1]);
                     ResourceModel.addResourceToList(resourceList, new ResourceModel(model.getItemType2(), itemId2, model.getItemNum2() * upNum));
                     ResourceModel.addResourceToList(resourceList, new ResourceModel(model.getItemType1(), model.getItemId1(), model.getItemNum1() * upNum));
                  }

                  if (model.getLevel() == treasureDao.level && treasureDao.exp > 0) {
                     int upNum = treasureDao.exp / model.getUpgradeExp();
                     String[] ids = model.getItemId2().split("\\|");
                     int itemId2 = Integer.parseInt(ids[treasureModel.getFaction() - 1]);
                     ResourceModel.addResourceToList(resourceList, new ResourceModel(model.getItemType2(), itemId2, model.getItemNum2() * upNum));
                     ResourceModel.addResourceToList(resourceList, new ResourceModel(model.getItemType1(), model.getItemId1(), model.getItemNum1() * upNum));
                  }
               }

               this.player.addResource(resourceList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 29, 2109, treasureDao.starSum, 1, String.valueOf(this.player.getPlayerId()));
               this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)cost, 29, 2109, 0, 0, "");
               treasureDao.level = 1;
               treasureDao.exp = 0;
               treasureDao.updateOp();
               TreasureMsg.S2C_TreasureResetLv_9414.Builder builder = TreasureMsg.S2C_TreasureResetLv_9414.newBuilder();
               builder.setInfo(this.getTreasure(treasureDao));
               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               heroBagPart.setProperty_reasuret_map(this.getTreasurePro());
               heroBagPart.flushNationHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_TREASURE_STAR, treasureModel.getFaction());
               this.player.sendMsg(builder.build());
            }
         } else {
            this.logger.info("当前宝物不可重置：" + treasureId);
            this.player.failure(29007);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ResetLvResource_9415(TreasureMsg.C2S_ResetLvResource_9415 msg, String channelId) {
      int treasureId = msg.getTreasureId();
      TreasureDao treasureDao = this.getTreasureDaoById(treasureId);
      if (!Objects.isNull(treasureDao)) {
         TreasureModel treasureModel = (TreasureModel)this.player.getGameModelPool().getEntity("treasure", treasureId);
         if (treasureDao.unLock && (treasureDao.level != 1 || treasureDao.exp != 0)) {
            List<ResourceModel> resourceList = new ArrayList();
            Map<Integer, TreasureAdditionModel> modelMap = this.player.getGameModelPool().getMap("treasureAddition");

            for(TreasureAdditionModel model : modelMap.values()) {
               if (model.getLevel() < treasureDao.level) {
                  int upNum = model.getExp() / model.getUpgradeExp();
                  String[] ids = model.getItemId2().split("\\|");
                  int itemId2 = Integer.parseInt(ids[treasureModel.getFaction() - 1]);
                  ResourceModel.addResourceToList(resourceList, new ResourceModel(model.getItemType2(), itemId2, model.getItemNum2() * upNum));
                  ResourceModel.addResourceToList(resourceList, new ResourceModel(model.getItemType1(), model.getItemId1(), model.getItemNum1() * upNum));
               }

               if (model.getLevel() == treasureDao.level && treasureDao.exp > 0) {
                  int upNum = treasureDao.exp / model.getUpgradeExp();
                  String[] ids = model.getItemId2().split("\\|");
                  int itemId2 = Integer.parseInt(ids[treasureModel.getFaction() - 1]);
                  ResourceModel.addResourceToList(resourceList, new ResourceModel(model.getItemType2(), itemId2, model.getItemNum2() * upNum));
                  ResourceModel.addResourceToList(resourceList, new ResourceModel(model.getItemType1(), model.getItemId1(), model.getItemNum1() * upNum));
               }
            }

            TreasureMsg.S2C_ResetLvResource_9416.Builder builder = TreasureMsg.S2C_ResetLvResource_9416.newBuilder();

            for(ResourceModel resourceModel : resourceList) {
               builder.addReturnResource(resourceModel.builder());
            }

            this.player.sendMsg(builder.build());
         } else {
            this.logger.info("当前宝物不可重置：" + treasureId);
         }
      }
   }

   @MsgHandlerAnno
   public void upStageTreasure(TreasureMsg.C2S_TreasureUpStage_9407 msg, String channelId) {
      int treasureId = msg.getTreasureId();
      TreasureDao treasureDao = this.getTreasureDaoById(treasureId);
      if (!Objects.isNull(treasureDao)) {
         int star = treasureDao.starSum + 1;
         Map<Integer, TreasureQualityModel> qualityModelMap = this.player.getGameModelPool().getMap("treasureQuality");
         TreasureModel treasureModel = (TreasureModel)this.player.getGameModelPool().getEntity("treasure", treasureId);
         int starLimit = this.player.getSystemLvLimit(1511);
         if (star > starLimit) {
            this.player.failure(29006);
         } else if (!qualityModelMap.containsKey(star)) {
            this.player.failure(29006);
         } else {
            TreasureQualityModel qualityModel = (TreasureQualityModel)qualityModelMap.get(star);
            if (!treasureDao.unLock) {
               this.player.failure(29003);
            } else {
               for(int i = 0; i < qualityModel.getConsumeProp().size(); ++i) {
                  if (!this.player.checkResourceNum(((ResourceModel)qualityModel.getConsumeProp().get(i)).getType(), ((ResourceModel)qualityModel.getConsumeProp().get(i)).getId(), ((ResourceModel)qualityModel.getConsumeProp().get(i)).getValue())) {
                     this.logger.info("道具不足");
                     this.player.failure(29002);
                     return;
                  }
               }

               for(int i = 0; i < qualityModel.getConsumeProp().size(); ++i) {
                  this.player.delResource((ResourceModel)qualityModel.getConsumeProp().get(i), 29, 2108, 0, 0, "");
               }

               ++treasureDao.starSum;
               treasureDao.updateOp();
               TreasureMsg.S2C_TreasureUpStage_9408.Builder builder = TreasureMsg.S2C_TreasureUpStage_9408.newBuilder();
               builder.setInfo(this.getTreasure(treasureDao));
               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               heroBagPart.setProperty_reasuret_map(this.getTreasurePro());
               heroBagPart.flushNationHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_TREASURE_STAR, treasureModel.getFaction());
               this.player.sendMsg(builder.build());
               String[] consume = LogOperationMgr.toRewardsInfo(qualityModel.getConsumeProp());
               this.player.getOperationMgr().addExtraLog(this.player, 197, "升阶", consume[0], consume[1], treasureDao.starSum + "");
            }
         }
      }
   }

   @MsgHandlerAnno
   public void resetTreasure(TreasureMsg.C2S_TreasureReset_9409 msg, String channelId) {
      int treasureId = msg.getTreasureId();
      TreasureDao treasureDao = this.getTreasureDaoById(treasureId);
      if (!Objects.isNull(treasureDao)) {
         TreasureModel treasureModel = (TreasureModel)this.player.getGameModelPool().getEntity("treasure", treasureId);
         if (treasureDao.unLock && treasureDao.starSum != 0) {
            TreasureQualityModel qualityModel = (TreasureQualityModel)this.player.getGameModelPool().getEntity("treasureQuality", treasureDao.starSum);
            this.player.addResource(qualityModel.getResetAcquire(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 29, 2109, treasureDao.starSum, 1, String.valueOf(this.player.getPlayerId()));
            treasureDao.starSum = 0;
            treasureDao.updateOp();
            TreasureMsg.S2C_TreasureReset_9410.Builder builder = TreasureMsg.S2C_TreasureReset_9410.newBuilder();
            builder.setInfo(this.getTreasure(treasureDao));
            HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
            heroBagPart.setProperty_reasuret_map(this.getTreasurePro());
            heroBagPart.flushNationHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_TREASURE_STAR, treasureModel.getFaction());
            this.player.sendMsg(builder.build());
         } else {
            this.logger.info("当前宝物不可重置：" + treasureId);
            this.player.failure(29007);
         }
      }
   }

   public HashMap<Integer, List<PropertyModel>> getTreasurePro() {
      HashMap<Integer, List<PropertyModel>> proMap = new HashMap();
      Map<Integer, TreasureDao> treasureDaoMap = this.player.<Integer, TreasureDao>getMap("tb_player_treasure", this.player.getPlayerId());
      Iterator var3 = treasureDaoMap.values().iterator();

      while(true) {
         TreasureDao treasureDao;
         List<PropertyModel> list;
         while(true) {
            if (!var3.hasNext()) {
               return proMap;
            }

            treasureDao = (TreasureDao)var3.next();
            if (treasureDao.unLock) {
               TreasureAdditionModel additionModel = (TreasureAdditionModel)this.player.getGameModelPool().getEntity("treasureAddition", treasureDao.level);
               if (additionModel != null) {
                  list = new ArrayList();
                  if (treasureDao.level == 1) {
                     if (treasureDao.exp != 0) {
                        int hp = additionModel.getProHp() + additionModel.getLevelUpHp();
                        int atk = additionModel.getProAtk() + additionModel.getLevelUpAtk();
                        list.add(new PropertyModel(1, 0, (long)hp));
                        list.add(new PropertyModel(2, 0, (long)atk));
                     }
                     break;
                  }

                  TreasureAdditionModel model = (TreasureAdditionModel)this.player.getGameModelPool().getEntity("treasureAddition", treasureDao.level - 1);
                  if (model != null) {
                     int hp = (additionModel.getProHp() - model.getProHp()) / (model.getExp() / 10 - 1) * treasureDao.exp / 10 + additionModel.getLevelUpHp();
                     int atk = (additionModel.getProAtk() - model.getProAtk()) / (model.getExp() / 10 - 1) * treasureDao.exp / 10 + additionModel.getLevelUpAtk();
                     list.add(new PropertyModel(1, 0, (long)hp));
                     list.add(new PropertyModel(2, 0, (long)atk));
                     break;
                  }
               }
            }
         }

         int speed = 0;
         int hp = 0;
         int atk = 0;

         for(int lev = 1; lev <= treasureDao.starSum; ++lev) {
            TreasureQualityModel qualityModel = (TreasureQualityModel)this.player.getGameModelPool().getEntity("treasureQuality", lev);
            speed += qualityModel.getProSpd();
            hp += qualityModel.getProHp();
            atk += qualityModel.getProAtk();
         }

         if (speed > 0) {
            list.add(new PropertyModel(4, 0, (long)speed));
         }

         if (hp > 0) {
            list.add(new PropertyModel(1, 1, (long)hp));
         }

         if (atk > 0) {
            list.add(new PropertyModel(2, 1, (long)atk));
         }

         TreasureModel treasureModel = (TreasureModel)this.player.getGameModelPool().getEntity("treasure", treasureDao.treasureId);
         proMap.put(treasureModel.getFaction(), list);
      }
   }

   public int getTreasureLevOrStage(int nation, int type) {
      int treasureId = 0;
      Map<Integer, TreasureModel> treasureModelMap = this.player.getGameModelPool().getMap("treasure");

      for(TreasureModel model : treasureModelMap.values()) {
         if (model.getFaction() == nation) {
            treasureId = model.getTreasureId();
            break;
         }
      }

      if (treasureId == 0) {
         return -1;
      } else {
         TreasureDao treasureDao = this.getTreasureDaoById(treasureId);
         if (treasureDao != null && treasureDao.unLock) {
            return type == 1 ? treasureDao.level : treasureDao.starSum;
         } else {
            return -1;
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_TransferTreasureItem_9410(TreasureMsg.C2S_TransferTreasureItem_9411 msg, String source) {
      TreasureMsg.S2C_TransferTreasureItem_9412.Builder builder = TreasureMsg.S2C_TransferTreasureItem_9412.newBuilder();
      builder.setResult(0);
      TreasureAdditionModel additionModel = (TreasureAdditionModel)this.player.getGameModelPool().getEntity("treasureAddition", 1);
      String[] ids = additionModel.getItemId2().split("\\|");
      HashSet treasureItemSet = new HashSet();

      for(String idstr : ids) {
         treasureItemSet.add(Integer.parseInt(idstr));
      }

      Integer targetItemId = msg.getTargetItemId();
      if (!treasureItemSet.contains(targetItemId)) {
         this.player.sendMsg(builder.build());
      } else {
         String treasureScaleStr = ApplicationContextProvider.getConfigString("treasureExchange", "");
         Integer treasureScale = Integer.parseInt(treasureScaleStr);
         if (treasureScale <= 0) {
            this.player.sendMsg(builder.build());
         } else {
            Integer targetNum = 0;
            ArrayList<ResourceModel> costList = new ArrayList();
            ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

            for(TreasureMsg.TreasureTransferCostInfo info : msg.getTransferInfoList()) {
               Integer itemId = info.getItemId();
               Integer num = info.getNum();
               if (itemId != targetItemId && treasureItemSet.contains(itemId)) {
                  if (num > 0 && num % treasureScale == 0) {
                     if (itemBagPart.getItemNum(itemId) < num) {
                        this.player.sendMsg(builder.build());
                        return;
                     }

                     targetNum = targetNum + num / treasureScale;
                     costList.add(new ResourceModel(2, itemId, num));
                     continue;
                  }

                  this.player.sendMsg(builder.build());
                  return;
               }

               this.player.sendMsg(builder.build());
               return;
            }

            if (costList.size() > 0 && targetNum > 0) {
               this.player.delResource((List)costList, 29, 212, 0, 0, "");
               this.player.addResource(2, targetItemId, targetNum, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 29, 212, 0, 0, "");
               builder.setResult(1);
               this.player.sendMsg(builder.build());
            }

         }
      }
   }

   public void gmOp(String params) {
      String[] param = params.split(",");
      TreasureDao treasureDao = this.getTreasureDaoById(Integer.parseInt(param[0]));
      treasureDao.level = Integer.parseInt(param[1]);
      treasureDao.updateOp();
   }

   public void gmAddAll() {
      Map<Integer, TreasureDao> map = this.player.<Integer, TreasureDao>getMap("tb_player_treasure", this.player.getPlayerId());
      if (map != null) {
         for(Map.Entry<Integer, TreasureDao> entry : map.entrySet()) {
            ((TreasureDao)entry.getValue()).unLock = true;
            ((TreasureDao)entry.getValue()).level = 149;
            ((TreasureDao)entry.getValue()).starSum = 54;
            ((TreasureDao)entry.getValue()).updateOp();
         }

      }
   }
}
