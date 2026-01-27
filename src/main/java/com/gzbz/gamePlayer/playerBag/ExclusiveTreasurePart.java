package com.gzbz.gamePlayer.playerBag;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.ExclusiveTreasureDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.ItemBagDao;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.playerBag.bean.ExclusiveResetData;
import com.gzbz.gift.GiftPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.mergeActivity.part.MergeActivityHeFuKuangHuanPart;
import com.gzbz.model.ExclusiveTreasureActivationModel;
import com.gzbz.model.ExclusiveTreasureBaseModel;
import com.gzbz.model.ExclusiveTreasureExtraModel;
import com.gzbz.model.ExclusiveTreasureStoneModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.HefuGemPointModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.ExclusiveTreasureMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import misc.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ExclusiveTreasurePart extends PlayerPart {
   @Autowired
   private ConfigManager configManager;

   @MsgHandlerAnno
   public void C2S_TreasureInfo_5500(ExclusiveTreasureMsg.C2S_TreasureInfo_5500 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao == null) {
         this.logger.info("英雄不存在：" + msg.getHeroCode());
      } else {
         ExclusiveTreasureDao dao = (ExclusiveTreasureDao)this.player.getData("tb_player_exclusive_treasure", this.player.getPlayerId());
         if (dao.heroIds.contains(heroDao.id)) {
            if (heroDao.exTreasure == null) {
               heroDao.exTreasure = new ExclusiveTreasure();
               if (dao.resetData.containsKey(heroDao.code)) {
                  ExclusiveResetData resetData = (ExclusiveResetData)dao.resetData.get(heroDao.code);
                  if (resetData.skillId > 0) {
                     heroDao.exTreasure.skillId = resetData.skillId;
                  }

                  if (resetData.extraProId > 0) {
                     heroDao.exTreasure.extraProId = resetData.extraProId;
                  }

                  if (resetData.condition1 > 0) {
                     heroDao.exTreasure.condition1 = resetData.condition1;
                  }

                  if (resetData.condition2 > 0) {
                     heroDao.exTreasure.condition2 = resetData.condition2;
                  }
               }

               heroDao.updateOp();
            }
         } else if (heroDao.exTreasure != null) {
            dao.heroIds.add(heroDao.id);
            dao.updateOp();
         }

         ExclusiveTreasureMsg.S2C_ActivationTreasure_5502.Builder builder = ExclusiveTreasureMsg.S2C_ActivationTreasure_5502.newBuilder();
         builder.setHeroCode(msg.getHeroCode());
         if (heroDao.exTreasure != null) {
            builder.setTreasureInfo(this.packTreasure(heroDao));
         }

         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_Reset_5519(ExclusiveTreasureMsg.C2S_Reset_5519 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      Map<Integer, HeroDao> map = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
      HeroDao targetDao = (HeroDao)map.get(msg.getHeroCode());
      if (targetDao == null) {
         this.logger.info("英雄不存在：" + msg.getHeroCode());
      } else if (!HeroModel.isReplacementHero(targetDao.id)) {
         if (Objects.isNull(targetDao.exTreasure)) {
            this.logger.error("未激活专属宝物");
         } else {
            int cost = this.configManager.getIntDefault("StoneRefreshCost", 100);
            if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, cost)) {
               this.player.failure(18);
            } else {
               this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)cost, 53, 5309, 0, 0, "");
               ExclusiveTreasureDao dao = (ExclusiveTreasureDao)this.player.getData("tb_player_exclusive_treasure", this.player.getPlayerId());
               if (dao.heroIds.contains(targetDao.id)) {
                  dao.heroIds.remove(targetDao.id);
               }

               List<Integer> stoneList = new ArrayList();
               List<ResourceModel> heroReturns_NoTask = new ArrayList();

               for(HeroDao heroDao : map.values()) {
                  if (heroDao.id == targetDao.id) {
                     if (heroDao.exTreasure != null) {
                        Map<Integer, ExclusiveTreasureBaseModel> modelMap = this.player.getGameModelPool().getMap("exclusiveTreasureBase");
                        HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
                        List<ExclusiveTreasureBaseModel> extraLevList = new ArrayList();

                        for(ExclusiveTreasureBaseModel model : modelMap.values()) {
                           if (model.getLev() < heroDao.exTreasure.lev && model.getStar() <= heroDao.exTreasure.star && model.getNation() == heroModel.getType()) {
                              extraLevList.add(model);
                           }
                        }

                        for(int i = 0; i < extraLevList.size(); ++i) {
                           for(ResourceModel res : ((ExclusiveTreasureBaseModel)extraLevList.get(i)).getUpLevConsume()) {
                              ResourceModel.addResourceToList(heroReturns_NoTask, res);
                           }
                        }

                        List<ExclusiveTreasureBaseModel> extraStarList = new ArrayList();

                        for(ExclusiveTreasureBaseModel model : modelMap.values()) {
                           if (model.getLev() <= heroDao.exTreasure.lev && model.getStar() < heroDao.exTreasure.star && model.getNation() == heroModel.getType()) {
                              extraStarList.add(model);
                           }
                        }

                        for(int i = 0; i < extraStarList.size(); ++i) {
                           for(ResourceModel res : ((ExclusiveTreasureBaseModel)extraStarList.get(i)).getUpStarConsume()) {
                              ResourceModel.addResourceToList(heroReturns_NoTask, res);
                           }
                        }
                     }

                     if (heroDao.exTreasure != null && !heroDao.exTreasure.stoneMap.isEmpty()) {
                        stoneList.addAll(heroDao.exTreasure.stoneMap.values());
                     }

                     if (heroDao.exTreasure != null) {
                        if (dao.resetData.containsKey(heroDao.code)) {
                           ExclusiveResetData resetData = (ExclusiveResetData)dao.resetData.get(heroDao.code);
                           resetData.condition1 = heroDao.exTreasure.condition1;
                           resetData.condition2 = heroDao.exTreasure.condition2;
                           resetData.extraProId = heroDao.exTreasure.extraProId;
                           resetData.skillId = heroDao.exTreasure.skillId;
                        } else {
                           ExclusiveResetData resetData = new ExclusiveResetData();
                           resetData.condition1 = heroDao.exTreasure.condition1;
                           resetData.condition2 = heroDao.exTreasure.condition2;
                           resetData.extraProId = heroDao.exTreasure.extraProId;
                           resetData.skillId = heroDao.exTreasure.skillId;
                           dao.resetData.put(heroDao.code, resetData);
                        }
                     }

                     heroDao.exTreasure = null;
                     heroDao.updateOp();
                     heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_EXCLUSIVE_TREASURE, heroDao);
                  }
               }

               dao.updateOp();
               if (!stoneList.isEmpty()) {
                  for(int i = 0; i < stoneList.size(); ++i) {
                     heroReturns_NoTask.add(new ResourceModel(2, (Integer)stoneList.get(i), 1));
                  }
               }

               String prop1 = this.configManager.getStrByDefault("exclusiveTreasureClear1", "1036|5");
               String prop2 = this.configManager.getStrByDefault("exclusiveTreasureClear2", "1037|1");
               ResourceModel resourceModel1 = new ResourceModel(2, Integer.parseInt(prop1.split("\\|")[0]), Integer.parseInt(prop1.split("\\|")[1]));
               heroReturns_NoTask.add(resourceModel1);
               ResourceModel resourceModel2 = new ResourceModel(2, Integer.parseInt(prop2.split("\\|")[0]), Integer.parseInt(prop2.split("\\|")[1]));
               heroReturns_NoTask.add(resourceModel2);
               this.player.addResource(heroReturns_NoTask, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 53, 5309, 0, 1, "");
               if (!stoneList.isEmpty()) {
                  for(int i = 0; i < stoneList.size(); ++i) {
                     ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", stoneList.get(i));
                     if (null != itemModel) {
                        MergeActivityHeFuKuangHuanPart mergeActivityHeFuKuangHuanPart = (MergeActivityHeFuKuangHuanPart)this.player.getMgrPart(MergeActivityHeFuKuangHuanPart.class);
                        mergeActivityHeFuKuangHuanPart.cutGemRushScore(itemModel.getQuality(), 1);
                     }
                  }
               }

               ExclusiveTreasureMsg.S2C_Reset_5520.Builder builder = ExclusiveTreasureMsg.S2C_Reset_5520.newBuilder();
               builder.setResult(1);
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ActivationTreasure_5501(ExclusiveTreasureMsg.C2S_ActivationTreasure_5501 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao == null) {
         this.logger.info("英雄不存在：" + msg.getHeroCode());
      } else if (!HeroModel.isReplacementHero(heroDao.id)) {
         ExclusiveTreasureDao dao = (ExclusiveTreasureDao)this.player.getData("tb_player_exclusive_treasure", this.player.getPlayerId());
         if (!dao.heroIds.contains(heroDao.id)) {
            String prop1 = this.configManager.getStrByDefault("exclusiveTreasureClear1", "1036|5");
            String prop2 = this.configManager.getStrByDefault("exclusiveTreasureClear2", "1037|1");
            List<ResourceModel> consume = new ArrayList();
            ResourceModel resourceModel1 = new ResourceModel(2, Integer.parseInt(prop1.split("\\|")[0]), Integer.parseInt(prop1.split("\\|")[1]));
            consume.add(resourceModel1);
            ResourceModel resourceModel2 = new ResourceModel(2, Integer.parseInt(prop2.split("\\|")[0]), Integer.parseInt(prop2.split("\\|")[1]));
            consume.add(resourceModel2);
            if (!this.player.checkResourceNum(consume)) {
               this.player.failure(53013);
            } else {
               this.player.delResource((List)consume, 53, 5301, 0, 0, "");
               heroDao.exTreasure = new ExclusiveTreasure();
               if (dao.resetData.containsKey(heroDao.code)) {
                  ExclusiveResetData resetData = (ExclusiveResetData)dao.resetData.get(heroDao.code);
                  if (resetData.skillId > 0) {
                     heroDao.exTreasure.skillId = resetData.skillId;
                  }

                  if (resetData.extraProId > 0) {
                     heroDao.exTreasure.extraProId = resetData.extraProId;
                  }

                  if (resetData.condition1 > 0) {
                     heroDao.exTreasure.condition1 = resetData.condition1;
                  }

                  if (resetData.condition2 > 0) {
                     heroDao.exTreasure.condition2 = resetData.condition2;
                  }
               }

               heroDao.updateOp();
               heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_EXCLUSIVE_TREASURE, heroDao);
               ExclusiveTreasureMsg.S2C_ActivationTreasure_5502.Builder builder = ExclusiveTreasureMsg.S2C_ActivationTreasure_5502.newBuilder();
               builder.setHeroCode(msg.getHeroCode());
               builder.setTreasureInfo(this.packTreasure(heroDao));
               this.player.sendMsg(builder.build());
               dao.heroIds.add(heroDao.id);
               dao.updateOp();
               Map<Integer, HeroDao> heroMap = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
               List<HeroDao> lockHeros = new ArrayList();

               for(HeroDao hero : heroMap.values()) {
                  if (hero.exTreasure != null) {
                     lockHeros.add(hero);
                  }
               }

               Set<Integer> lock = new HashSet();

               for(HeroDao hero : lockHeros) {
                  HeroModel lockModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", hero.id);
                  lock.add(lockModel.getNation());
               }

               this.player.triggerTask(361, 0, (long)lock.size(), 0);
               String[] rewardsInfo = LogOperationMgr.toRewardsInfo(consume);
               this.player.getOperationMgr().addExtraLog(this.player, 178, rewardsInfo[0], rewardsInfo[1], rewardsInfo[2]);
            }
         }
      }
   }

   public ExclusiveTreasureDao getDao() {
      ExclusiveTreasureDao dao = (ExclusiveTreasureDao)this.player.getData("tb_player_exclusive_treasure", this.player.getPlayerId());
      return dao;
   }

   public ExclusiveTreasureMsg.ExclusiveTreasureInfo packTreasure(HeroDao heroDao) {
      ExclusiveTreasureMsg.ExclusiveTreasureInfo.Builder builder = ExclusiveTreasureMsg.ExclusiveTreasureInfo.newBuilder();
      if (Objects.isNull(heroDao.exTreasure)) {
         return builder.build();
      } else {
         ExclusiveTreasure data = heroDao.exTreasure;
         builder.setHeroCode(heroDao.code);
         builder.setLev(data.lev);
         builder.setStar(data.star);
         ExclusiveTreasureMsg.RecastTreasure.Builder info = ExclusiveTreasureMsg.RecastTreasure.newBuilder();
         info.setCondition1(data.condition1);
         info.setCondition2(data.condition2);
         info.setExtraProId(data.extraProId);
         info.setExtraId(data.skillId);
         builder.setBaseTreasure(info);
         ExclusiveTreasureMsg.RecastTreasure.Builder recast = ExclusiveTreasureMsg.RecastTreasure.newBuilder();
         recast.setCondition1(data.recastCondition1);
         recast.setCondition2(data.recastCondition2);
         recast.setExtraProId(data.recastProId);
         recast.setExtraId(data.recastSkillId);
         builder.setRecast(recast);
         if (!data.stoneMap.isEmpty()) {
            for(Map.Entry<CommonMsg.StonePosition, Integer> entry : data.stoneMap.entrySet()) {
               CommonMsg.TreasureStone.Builder stone = CommonMsg.TreasureStone.newBuilder();
               stone.setId((Integer)entry.getValue());
               stone.setPosition((CommonMsg.StonePosition)entry.getKey());
               builder.addStoneInfo(stone);
            }
         }

         return builder.build();
      }
   }

   @MsgHandlerAnno
   public void C2S_UpLev_5511(ExclusiveTreasureMsg.C2S_UpLev_5511 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao == null) {
         this.logger.info("英雄不存在：" + msg.getHeroCode());
      } else if (!HeroModel.isReplacementHero(heroDao.id)) {
         if (Objects.isNull(heroDao.exTreasure)) {
            this.logger.error("未激活专属宝物");
         } else {
            HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
            ExclusiveTreasure treasure = heroDao.exTreasure;
            Map<Integer, ExclusiveTreasureBaseModel> modelMap = this.player.getGameModelPool().getMap("exclusiveTreasureBase");
            List<ExclusiveTreasureBaseModel> list = new ArrayList();

            for(ExclusiveTreasureBaseModel model : modelMap.values()) {
               if (model.getLev() == treasure.lev && model.getStar() == treasure.star && heroModel.getType() == model.getNation()) {
                  list.add(model);
               }
            }

            if (!list.isEmpty() && list.size() <= 1) {
               ExclusiveTreasureBaseModel model = (ExclusiveTreasureBaseModel)list.get(0);
               List<ExclusiveTreasureBaseModel> nextList = new ArrayList();

               for(ExclusiveTreasureBaseModel next : modelMap.values()) {
                  if (next.getLev() == treasure.lev && next.getStar() == treasure.star + 1 && next.getNation() == model.getNation()) {
                     nextList.add(next);
                  }
               }

               if (!nextList.isEmpty()) {
                  this.player.failure(53007);
               } else if (!model.getUpLevConsume().isEmpty()) {
                  if (!this.player.checkResourceNum((List)model.getUpLevConsume())) {
                     this.player.failure(53008);
                  } else {
                     List<ExclusiveTreasureBaseModel> nextLvList = new ArrayList();

                     for(ExclusiveTreasureBaseModel model1 : modelMap.values()) {
                        if (model1.getLev() == treasure.lev + 1 && model1.getStar() == treasure.star && heroModel.getType() == model1.getNation()) {
                           nextLvList.add(model);
                        }
                     }

                     if (!nextLvList.isEmpty()) {
                        int oldLev = treasure.lev;
                        int oldStar = treasure.star;
                        this.player.delResource((List)model.getUpLevConsume(), 53, 5302, 0, 0, "");
                        ++treasure.lev;
                        heroDao.updateOp();
                        long oldPower = this.player.getPlayerCombatPower();
                        heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_EXCLUSIVE_TREASURE, heroDao);
                        long newPower = this.player.getPlayerCombatPower();
                        ExclusiveTreasureMsg.S2C_UpLev_5512.Builder builder = ExclusiveTreasureMsg.S2C_UpLev_5512.newBuilder();
                        builder.setHeroCode(msg.getHeroCode());
                        builder.setTreasureInfo(this.packTreasure(heroDao));
                        this.player.sendMsg(builder.build());
                        GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
                        giftPart.triggerTimeLimitGift(17, treasure.lev);
                        int newLev = treasure.lev;
                        int newStar = treasure.star;
                        String heroInfo = heroModel.getNation() + "&" + heroModel.getName() + "&" + heroDao.getStar();
                        String[] rewardsInfo = LogOperationMgr.toRewardsInfo(model.getUpLevConsume());
                        long changePower = Math.abs(newPower - oldPower);
                        this.player.getOperationMgr().addExtraLog(this.player, 179, heroInfo, rewardsInfo[0], rewardsInfo[1], oldLev + "", newLev + "", oldStar + "", newStar + "", changePower + "");
                     }
                  }
               }
            } else {
               this.logger.error("专属宝物数据出现错误！！！");
               this.player.failure(53012);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_UpStar_5513(ExclusiveTreasureMsg.C2S_UpStar_5513 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao == null) {
         this.logger.info("英雄不存在：" + msg.getHeroCode());
      } else if (Objects.isNull(heroDao.exTreasure)) {
         this.logger.error("未激活专属宝物");
      } else {
         ExclusiveTreasure treasure = heroDao.exTreasure;
         HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
         Map<Integer, ExclusiveTreasureBaseModel> modelMap = this.player.getGameModelPool().getMap("exclusiveTreasureBase");
         List<ExclusiveTreasureBaseModel> list = new ArrayList();

         for(ExclusiveTreasureBaseModel model : modelMap.values()) {
            if (model.getLev() == treasure.lev && model.getStar() == treasure.star && heroModel.getType() == model.getNation()) {
               list.add(model);
            }
         }

         if (!list.isEmpty() && list.size() <= 1) {
            ExclusiveTreasureBaseModel model = (ExclusiveTreasureBaseModel)list.get(0);
            List<ExclusiveTreasureBaseModel> nextList = new ArrayList();

            for(ExclusiveTreasureBaseModel next : modelMap.values()) {
               if (next.getLev() == treasure.lev && next.getStar() == treasure.star + 1 && heroModel.getType() == next.getNation()) {
                  nextList.add(next);
               }
            }

            if (nextList.isEmpty()) {
               this.logger.info("等级不足");
               this.player.failure(53004);
            } else if (!this.player.checkResourceNum((List)model.getUpStarConsume())) {
               this.player.failure(53003);
            } else {
               int oldLev = treasure.lev;
               int oldStar = treasure.star;
               this.player.delResource((List)model.getUpStarConsume(), 53, 5303, 0, 0, "");
               ++treasure.star;
               heroDao.updateOp();
               long oldPower = this.player.getPlayerCombatPower();
               heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_EXCLUSIVE_TREASURE, heroDao);
               long newPower = this.player.getPlayerCombatPower();
               ExclusiveTreasureMsg.S2C_UpStar_5514.Builder builder = ExclusiveTreasureMsg.S2C_UpStar_5514.newBuilder();
               builder.setHeroCode(msg.getHeroCode());
               builder.setTreasureInfo(this.packTreasure(heroDao));
               this.player.sendMsg(builder.build());
               int newLev = treasure.lev;
               int newStar = treasure.star;
               String heroInfo = heroModel.getNation() + "&" + heroModel.getName() + "&" + heroDao.getStar();
               String[] rewardsInfo = LogOperationMgr.toRewardsInfo(model.getUpLevConsume());
               long changePower = Math.abs(newPower - oldPower);
               this.player.getOperationMgr().addExtraLog(this.player, 179, heroInfo, rewardsInfo[0], rewardsInfo[1], oldLev + "", newLev + "", oldStar + "", newStar + "", changePower + "");
            }
         } else {
            this.logger.error("专属宝物数据出现错误！！！");
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_WearTreasureStone_5505(ExclusiveTreasureMsg.C2S_WearTreasureStone_5505 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao == null) {
         this.logger.info("英雄不存在：" + msg.getHeroCode());
      } else if (Objects.isNull(heroDao.exTreasure)) {
         this.logger.error("未激活专属宝物");
      } else if (!HeroModel.isReplacementHero(heroDao.id)) {
         ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
         ItemBase runeItem = itemBagDao.gemStoneBag.getItemByCode(msg.getItemCode());
         if (runeItem == null) {
            this.logger.info("itemCode={}", msg.getItemCode());
         } else {
            ExclusiveTreasure treasure = heroDao.exTreasure;
            HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
            Map<Integer, ExclusiveTreasureBaseModel> modelMap1 = this.player.getGameModelPool().getMap("exclusiveTreasureBase");
            List<ExclusiveTreasureBaseModel> extraList = new ArrayList();

            for(ExclusiveTreasureBaseModel model : modelMap1.values()) {
               if (model.getLev() == treasure.lev && model.getStar() == treasure.star && model.getNation() == heroModel.getType()) {
                  extraList.add(model);
               }
            }

            if (extraList.isEmpty()) {
               this.logger.error("数据错误！！！");
            } else if (msg.getPosition().getNumber() > ((ExclusiveTreasureBaseModel)extraList.get(0)).getHoleNum()) {
               this.player.failure(53005);
            } else {
               Map<Integer, ExclusiveTreasureStoneModel> stoneMap = this.player.getGameModelPool().getMap("exclusiveTreasureStone");
               ExclusiveTreasureStoneModel model = (ExclusiveTreasureStoneModel)stoneMap.get(runeItem.id);

               for(Map.Entry<CommonMsg.StonePosition, Integer> entry : treasure.stoneMap.entrySet()) {
                  if (!stoneMap.containsKey(entry.getValue())) {
                     return;
                  }

                  if (((CommonMsg.StonePosition)entry.getKey()).getNumber() != msg.getPosition().getNumber()) {
                     ExclusiveTreasureStoneModel stoneModel = (ExclusiveTreasureStoneModel)stoneMap.get(entry.getValue());
                     if (model.getProType() == stoneModel.getProType() && model.getProWay() == stoneModel.getProWay()) {
                        this.player.failure(53011);
                        return;
                     }
                  }
               }

               if (treasure.stoneMap.containsKey(msg.getPosition())) {
                  int addId = (Integer)treasure.stoneMap.get(msg.getPosition());
                  this.player.addResource(2, addId, 1, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 53, 5304, 0, 1, "");
                  ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", addId);
                  if (null != itemModel) {
                     MergeActivityHeFuKuangHuanPart mergeActivityHeFuKuangHuanPart = (MergeActivityHeFuKuangHuanPart)this.player.getMgrPart(MergeActivityHeFuKuangHuanPart.class);
                     mergeActivityHeFuKuangHuanPart.cutGemRushScore(itemModel.getQuality(), 1);
                  }
               }

               treasure.stoneMap.put(msg.getPosition(), runeItem.id);
               ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
               itemBagPart.deleteItemByCode(runeItem.code, 1, 53, 5304, 0, 0, "");
               this.player.senditemUpdateMsg();
               heroDao.updateOp();
               long oldPower = this.player.getPlayerCombatPower();
               heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_EXCLUSIVE_TREASURE, heroDao);
               long newPower = this.player.getPlayerCombatPower();
               ExclusiveTreasureMsg.S2C_WearTreasureStone_5506.Builder builder = ExclusiveTreasureMsg.S2C_WearTreasureStone_5506.newBuilder();
               builder.setHeroCode(msg.getHeroCode());
               builder.setPosition(msg.getPosition());
               builder.setTreasureInfo(this.packTreasure(heroDao));
               this.player.sendMsg(builder.build());
               String heroInfo = heroModel.getNation() + "&" + heroModel.getName() + "&" + heroDao.getStar();
               long changePower = Math.abs(newPower - oldPower);
               this.player.getOperationMgr().addExtraLog(this.player, 180, heroInfo, model.getType() + "", model.getName(), changePower + "");
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_UndressTreasureStone_5503(ExclusiveTreasureMsg.C2S_UndressTreasureStone_5503 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao == null) {
         this.logger.info("英雄不存在：" + msg.getHeroCode());
      } else if (Objects.isNull(heroDao.exTreasure)) {
         this.logger.error("未激活专属宝物");
      } else {
         ExclusiveTreasure treasure = heroDao.exTreasure;
         Map<Integer, ExclusiveTreasureBaseModel> modelMap = this.player.getGameModelPool().getMap("exclusiveTreasureBase");
         List<ExclusiveTreasureBaseModel> extraList = new ArrayList();

         for(ExclusiveTreasureBaseModel model : modelMap.values()) {
            if (model.getLev() == treasure.lev && model.getStar() == treasure.star) {
               extraList.add(model);
            }
         }

         if (extraList.isEmpty()) {
            this.logger.error("数据错误！！！");
         } else if (msg.getPosition().getNumber() <= ((ExclusiveTreasureBaseModel)extraList.get(0)).getHoleNum()) {
            if (!treasure.stoneMap.containsKey(msg.getPosition())) {
               this.logger.info("当前位置无穿戴");
            } else {
               int itemId = (Integer)treasure.stoneMap.get(msg.getPosition());
               treasure.stoneMap.remove(msg.getPosition());
               this.player.addResource(2, itemId, 1, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 53, 5305, 0, 1, "");
               ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", itemId);
               if (null != itemModel) {
                  MergeActivityHeFuKuangHuanPart mergeActivityHeFuKuangHuanPart = (MergeActivityHeFuKuangHuanPart)this.player.getMgrPart(MergeActivityHeFuKuangHuanPart.class);
                  mergeActivityHeFuKuangHuanPart.cutGemRushScore(itemModel.getQuality(), 1);
               }

               heroDao.updateOp();
               heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_EXCLUSIVE_TREASURE, heroDao);
               ExclusiveTreasureMsg.S2C_UndressTreasureStone_5504.Builder builder = ExclusiveTreasureMsg.S2C_UndressTreasureStone_5504.newBuilder();
               builder.setHeroCode(msg.getHeroCode());
               builder.setPosition(msg.getPosition());
               builder.setTreasureInfo(this.packTreasure(heroDao));
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_StoneSell_5517(ExclusiveTreasureMsg.C2S_StoneSell_5517 msg, String source) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      Map<Integer, Integer> checkMap = new HashMap();

      for(int i = 0; i < msg.getItemCodeList().size(); ++i) {
         int code = (Integer)msg.getItemCodeList().get(i);
         ItemBase runeItem = itemBagDao.gemStoneBag.getItemByCode(code);
         if (runeItem == null) {
            this.logger.info("itemCode={}", code);
            return;
         }

         if (checkMap.containsKey(code)) {
            this.logger.info("itemCode相同={}", code);
            return;
         }

         checkMap.put(code, 1);
      }

      List<ResourceModel> sellList = new ArrayList();

      for(int i = 0; i < msg.getItemCodeList().size(); ++i) {
         int code = (Integer)msg.getItemCodeList().get(i);
         ItemBase runeItem = itemBagDao.gemStoneBag.getItemByCode(code);
         ExclusiveTreasureStoneModel model = (ExclusiveTreasureStoneModel)this.player.getGameModelPool().getEntity("exclusiveTreasureStone", runeItem.id);
         if (!Objects.isNull(model)) {
            sellList.addAll(model.getDecomposeGain());
         }
      }

      List<ResourceModel> realList = new ArrayList();

      for(int i = 0; i < sellList.size(); ++i) {
         boolean has = false;
         int value = ((ResourceModel)sellList.get(i)).getValue();
         int id = ((ResourceModel)sellList.get(i)).getId();
         int type = ((ResourceModel)sellList.get(i)).getType();

         for(ResourceModel model : realList) {
            if (id == model.getId()) {
               has = true;
               model.setValue(model.getValue() + value);
               break;
            }
         }

         if (!has) {
            realList.add(new ResourceModel(type, id, value));
         }
      }

      this.player.addResource(realList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 53, 5306, 0, msg.getItemCodeList().size(), String.valueOf(this.player.getPlayerId()));
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

      for(int i = 0; i < msg.getItemCodeList().size(); ++i) {
         itemBagPart.deleteItemByCode((Integer)msg.getItemCodeList().get(i), 1, 53, 5306, 0, 0, "");
      }

      this.player.senditemUpdateMsg();
      ExclusiveTreasureMsg.S2C_StoneSell_5518.Builder builder = ExclusiveTreasureMsg.S2C_StoneSell_5518.newBuilder();
      builder.setResult(1);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_RecastTreasure_5507(ExclusiveTreasureMsg.C2S_RecastTreasure_5507 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao == null) {
         this.logger.info("英雄不存在：" + msg.getHeroCode());
      } else if (Objects.isNull(heroDao.exTreasure)) {
         this.logger.error("未激活专属宝物");
      } else {
         List<ResourceModel> consume = new ArrayList();
         if (msg.getUnLock() == 0) {
            String exclusiveRecastCost1 = this.configManager.getStr("exclusiveRecastCost1");
            String[] cost1 = exclusiveRecastCost1.split("\\|");
            consume.add(new ResourceModel(Integer.parseInt(cost1[0]), Integer.parseInt(cost1[1]), Integer.parseInt(cost1[2])));
            String exclusiveRecastCost2 = this.configManager.getStr("exclusiveRecastCost2");
            String[] cost2 = exclusiveRecastCost2.split("\\|");
            consume.add(new ResourceModel(Integer.parseInt(cost2[0]), Integer.parseInt(cost2[1]), Integer.parseInt(cost2[2])));
         } else {
            String exclusiveRecastCost1 = this.configManager.getStr("exclusiveLockRecastCost1");
            String[] cost1 = exclusiveRecastCost1.split("\\|");
            consume.add(new ResourceModel(Integer.parseInt(cost1[0]), Integer.parseInt(cost1[1]), Integer.parseInt(cost1[2])));
            String exclusiveRecastCost2 = this.configManager.getStr("exclusiveLockRecastCost2");
            String[] cost2 = exclusiveRecastCost2.split("\\|");
            consume.add(new ResourceModel(Integer.parseInt(cost2[0]), Integer.parseInt(cost2[1]), Integer.parseInt(cost2[2])));
         }

         if (!this.player.checkResourceNum(consume)) {
            this.player.failure(53009);
         } else {
            this.player.delResource((List)consume, 53, 5308, 0, 0, "");
            ExclusiveTreasure treasure = heroDao.exTreasure;
            if (msg.getUnLock() == 0) {
               this.recastPro(treasure, false, 0);
               this.recastSkill(treasure, false, 0);
            } else if (msg.getUnLock() == 1) {
               this.recastSkill(treasure, true, 1);
            } else if (msg.getUnLock() == 2) {
               this.recastPro(treasure, true, 2);
            }

            heroDao.updateOp();
            heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_EXCLUSIVE_TREASURE, heroDao);
            ExclusiveTreasureMsg.S2C_RecastTreasure_5508.Builder builder = ExclusiveTreasureMsg.S2C_RecastTreasure_5508.newBuilder();
            builder.setHeroCode(msg.getHeroCode());
            builder.setUnLock(msg.getUnLock());
            ExclusiveTreasureMsg.RecastTreasure.Builder recastBuilder = ExclusiveTreasureMsg.RecastTreasure.newBuilder();
            recastBuilder.setCondition1(treasure.recastCondition1);
            recastBuilder.setCondition2(treasure.recastCondition2);
            recastBuilder.setExtraId(treasure.recastSkillId);
            recastBuilder.setExtraProId(treasure.recastProId);
            builder.setRecast(recastBuilder);
            this.player.sendMsg(builder.build());
            ExclusiveTreasureExtraModel proModel = (ExclusiveTreasureExtraModel)this.player.getGameModelPool().getEntity("exclusiveTreasureExtra", treasure.recastProId);
            String proInfo = "";
            if (Objects.isNull(proModel)) {
               proInfo = "-";
            } else {
               proInfo = proModel.getPropertyId() + "&" + proModel.getPropertyValue();
            }

            ExclusiveTreasureExtraModel skillModel = (ExclusiveTreasureExtraModel)this.player.getGameModelPool().getEntity("exclusiveTreasureExtra", treasure.recastSkillId);
            String skillId = "-";
            if (!Objects.isNull(proModel)) {
               skillId = skillModel.getSkillId() + "";
            }

            HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
            String heroInfo = heroModel.getNation() + "&" + heroModel.getName() + "&" + heroDao.getStar();
            String[] rewardsInfo = LogOperationMgr.toRewardsInfo(consume);
            this.player.getOperationMgr().addExtraLog(this.player, 181, heroInfo, rewardsInfo[0], rewardsInfo[1], proInfo, skillId);
         }
      }
   }

   public void recastPro(ExclusiveTreasure treasure, boolean isExtends, int lockType) {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      Map<Integer, ExclusiveTreasureActivationModel> activationModelMap = gameModelPool.getMap("exclusiveTreasureActivation");
      ExclusiveTreasureActivationModel activeModel = (ExclusiveTreasureActivationModel)activationModelMap.get(treasure.condition2);
      List<ExclusiveTreasureActivationModel> activationList = new ArrayList();
      if (activeModel != null) {
         if (lockType == 2) {
            for(ExclusiveTreasureActivationModel model : activationModelMap.values()) {
               if (model.getAddType() == 1 && activeModel.getGroup() == model.getGroup()) {
                  activationList.add(model);
               }
            }
         } else {
            for(ExclusiveTreasureActivationModel model : activationModelMap.values()) {
               if (model.getAddType() == 1) {
                  activationList.add(model);
               }
            }
         }
      } else {
         for(ExclusiveTreasureActivationModel model : activationModelMap.values()) {
            if (model.getAddType() == 1) {
               activationList.add(model);
            }
         }
      }

      List<KeyValFun> funList = new ArrayList();

      for(int i = 0; i < activationList.size(); ++i) {
         funList.add(new KeyValFun(((ExclusiveTreasureActivationModel)activationList.get(i)).getId(), ((ExclusiveTreasureActivationModel)activationList.get(i)).getRate()));
      }

      GamePlayer var10000 = this.player;
      int activation = GamePlayer.countRate(funList);
      Map<Integer, ExclusiveTreasureExtraModel> extraMap = gameModelPool.getMap("exclusiveTreasureExtra");
      List<ExclusiveTreasureExtraModel> extraList = new ArrayList();

      for(ExclusiveTreasureExtraModel model : extraMap.values()) {
         if (model.getAddType() == 1) {
            extraList.add(model);
         }
      }

      funList.clear();

      for(int i = 0; i < extraList.size(); ++i) {
         if (((ExclusiveTreasureExtraModel)extraList.get(i)).getId() != treasure.extraProId && (((ExclusiveTreasureExtraModel)extraList.get(i)).getPropertyId() != ((ExclusiveTreasureExtraModel)extraMap.get(treasure.extraProId)).getPropertyId() || ((ExclusiveTreasureExtraModel)extraList.get(i)).getPropertyWay() != ((ExclusiveTreasureExtraModel)extraMap.get(treasure.extraProId)).getPropertyWay())) {
            funList.add(new KeyValFun(((ExclusiveTreasureExtraModel)extraList.get(i)).getId(), ((ExclusiveTreasureExtraModel)extraList.get(i)).getRate()));
         }
      }

      var10000 = this.player;
      int proId = GamePlayer.countRate(funList);
      treasure.recastCondition1 = activation;
      treasure.recastProId = proId;
      if (isExtends) {
         treasure.recastCondition2 = treasure.condition2;
         treasure.recastSkillId = treasure.skillId;
      }

   }

   public void recastSkill(ExclusiveTreasure treasure, boolean isExtends, int lockType) {
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      Map<Integer, ExclusiveTreasureActivationModel> activationModelMap = gameModelPool.getMap("exclusiveTreasureActivation");
      List<ExclusiveTreasureActivationModel> activationList = new ArrayList();
      if (lockType == 1) {
         ExclusiveTreasureActivationModel activeModel1 = (ExclusiveTreasureActivationModel)activationModelMap.get(treasure.condition1);

         for(ExclusiveTreasureActivationModel model : activationModelMap.values()) {
            if (model.getAddType() == 2 && activeModel1.getGroup() == model.getGroup()) {
               activationList.add(model);
            }
         }
      } else if (lockType == 0) {
         ExclusiveTreasureActivationModel activeModel1 = (ExclusiveTreasureActivationModel)activationModelMap.get(treasure.recastCondition1);

         for(ExclusiveTreasureActivationModel model : activationModelMap.values()) {
            if (model.getAddType() == 2 && activeModel1.getGroup() == model.getGroup()) {
               activationList.add(model);
            }
         }
      } else {
         for(ExclusiveTreasureActivationModel model : activationModelMap.values()) {
            if (model.getAddType() == 2) {
               activationList.add(model);
            }
         }
      }

      List<KeyValFun> funList = new ArrayList();

      for(int i = 0; i < activationList.size(); ++i) {
         funList.add(new KeyValFun(((ExclusiveTreasureActivationModel)activationList.get(i)).getId(), ((ExclusiveTreasureActivationModel)activationList.get(i)).getRate()));
      }

      GamePlayer var10000 = this.player;
      int activation = GamePlayer.countRate(funList);
      Map<Integer, ExclusiveTreasureExtraModel> extraMap = gameModelPool.getMap("exclusiveTreasureExtra");
      List<ExclusiveTreasureExtraModel> extraList = new ArrayList();

      for(ExclusiveTreasureExtraModel model : extraMap.values()) {
         if (model.getAddType() == 2) {
            extraList.add(model);
         }
      }

      funList.clear();

      for(int i = 0; i < extraList.size(); ++i) {
         funList.add(new KeyValFun(((ExclusiveTreasureExtraModel)extraList.get(i)).getId(), ((ExclusiveTreasureExtraModel)extraList.get(i)).getRate()));
      }

      var10000 = this.player;
      int skillId = GamePlayer.countRate(funList);
      treasure.recastCondition2 = activation;
      treasure.recastSkillId = skillId;
      if (isExtends) {
         treasure.recastCondition1 = treasure.condition1;
         treasure.recastProId = treasure.extraProId;
      }

   }

   @MsgHandlerAnno
   public void C2S_SaveRecast_5509(ExclusiveTreasureMsg.C2S_SaveRecast_5509 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao == null) {
         this.logger.info("英雄不存在：" + msg.getHeroCode());
      } else if (Objects.isNull(heroDao.exTreasure)) {
         this.logger.error("未激活专属宝物");
      } else {
         ExclusiveTreasure treasure = heroDao.exTreasure;
         if (treasure.recastCondition1 > 0) {
            treasure.condition1 = treasure.recastCondition1;
         }

         if (treasure.recastCondition2 > 0) {
            treasure.condition2 = treasure.recastCondition2;
         }

         if (treasure.recastProId > 0) {
            treasure.extraProId = treasure.recastProId;
         }

         if (treasure.recastSkillId > 0) {
            treasure.skillId = treasure.recastSkillId;
         }

         treasure.recastCondition1 = 0;
         treasure.recastCondition2 = 0;
         treasure.recastProId = 0;
         treasure.recastSkillId = 0;
         heroDao.updateOp();
         heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_EXCLUSIVE_TREASURE, heroDao);
         ExclusiveTreasureMsg.S2C_SaveRecast_5510.Builder builder = ExclusiveTreasureMsg.S2C_SaveRecast_5510.newBuilder();
         builder.setHeroCode(msg.getHeroCode());
         ExclusiveTreasureMsg.RecastTreasure.Builder baseBuilder = ExclusiveTreasureMsg.RecastTreasure.newBuilder();
         baseBuilder.setCondition1(treasure.condition1);
         baseBuilder.setCondition2(treasure.condition2);
         baseBuilder.setExtraId(treasure.skillId);
         baseBuilder.setExtraProId(treasure.extraProId);
         builder.setBaseTreasure(baseBuilder);
         ExclusiveTreasureMsg.RecastTreasure.Builder recastBuilder = ExclusiveTreasureMsg.RecastTreasure.newBuilder();
         recastBuilder.setCondition1(treasure.recastCondition1);
         recastBuilder.setCondition2(treasure.recastCondition2);
         recastBuilder.setExtraId(treasure.recastSkillId);
         recastBuilder.setExtraProId(treasure.recastProId);
         builder.setRecast(recastBuilder);
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_ComposeStone_5515(ExclusiveTreasureMsg.C2S_ComposeStone_5515 msg, String source) {
      int targetId = msg.getTargetId();
      if (targetId == 0) {
         Map<Integer, ExclusiveTreasureStoneModel> modelMap = this.player.getGameModelPool().getMap("exclusiveTreasureStone");
         List<Integer> realList = new ArrayList();
         ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
         Map<Integer, Integer> checkMap = new HashMap();

         for(int i = 0; i < msg.getItemCodeList().size(); ++i) {
            int code = (Integer)msg.getItemCodeList().get(i);
            ItemBase runeItem = itemBagDao.gemStoneBag.getItemByCode(code);
            if (runeItem == null) {
               this.logger.info("itemCode={}", code);
               return;
            }

            realList.add(runeItem.id);
            if (checkMap.containsKey(code)) {
               this.logger.info("itemCode相同={}", code);
               return;
            }

            checkMap.put(code, 1);
         }

         if (realList.isEmpty() || realList.size() != 4) {
            this.player.failure(53010);
            return;
         }

         int tempQuality = 0;

         for(int i = 0; i < realList.size(); ++i) {
            ExclusiveTreasureStoneModel consumeModel = (ExclusiveTreasureStoneModel)modelMap.get(realList.get(i));
            if (consumeModel == null) {
               return;
            }

            if (tempQuality > 0) {
               if (consumeModel.getQuality() != tempQuality) {
                  this.logger.error("合成消耗的宝石等级不一致！");
                  return;
               }
            } else {
               tempQuality = consumeModel.getQuality();
            }
         }

         int targetQuality = tempQuality + 1;
         List<ExclusiveTreasureStoneModel> targetList = new ArrayList();

         for(ExclusiveTreasureStoneModel value : modelMap.values()) {
            if (value.getQuality() == targetQuality) {
               targetList.add(value);
            }
         }

         if (targetList.isEmpty()) {
            return;
         }

         ExclusiveTreasureStoneModel targetModel = (ExclusiveTreasureStoneModel)targetList.get(RandomUtil.randInt(0, targetList.size()));
         List<ResourceModel> propList = new ArrayList();

         for(int i = 0; i < targetModel.getComposeConsume().size(); ++i) {
            int propId = ((ResourceModel)targetModel.getComposeConsume().get(i)).getId();
            if (!modelMap.containsKey(propId)) {
               propList.add(new ResourceModel(((ResourceModel)targetModel.getComposeConsume().get(i)).getType(), ((ResourceModel)targetModel.getComposeConsume().get(i)).getId(), ((ResourceModel)targetModel.getComposeConsume().get(i)).getValue()));
            }
         }

         if (!this.player.checkResourceNum(propList)) {
            this.player.failure(53010);
            return;
         }

         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

         for(int i = 0; i < msg.getItemCodeList().size(); ++i) {
            itemBagPart.deleteItemByCode((Integer)msg.getItemCodeList().get(i), 1, 53, 5307, 0, 0, "");
         }

         this.player.senditemUpdateMsg();
         this.player.delResource((List)propList, 53, 5307, 0, 0, "");
         this.player.addResource(2, targetModel.getId(), 1, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 53, 5307, 0, msg.getItemCodeList().size(), String.valueOf(this.player.getPlayerId()));
         ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", targetModel.getId());
         if (null != itemModel) {
            MergeActivityHeFuKuangHuanPart mergeActivityHeFuKuangHuanPart = (MergeActivityHeFuKuangHuanPart)this.player.getMgrPart(MergeActivityHeFuKuangHuanPart.class);
            mergeActivityHeFuKuangHuanPart.cutGemRushScore(itemModel.getQuality(), 1);
         }

         ExclusiveTreasureMsg.S2C_ComposeStone_5516.Builder builder = ExclusiveTreasureMsg.S2C_ComposeStone_5516.newBuilder();
         builder.setResult(1);
         this.player.sendMsg(builder.build());
      } else {
         Map<Integer, ExclusiveTreasureStoneModel> modelMap = this.player.getGameModelPool().getMap("exclusiveTreasureStone");
         ExclusiveTreasureStoneModel targetModel = (ExclusiveTreasureStoneModel)modelMap.get(targetId);
         if (Objects.isNull(targetModel)) {
            return;
         }

         List<Integer> realList = new ArrayList();
         ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
         Map<Integer, Integer> checkMap = new HashMap();

         for(int i = 0; i < msg.getItemCodeList().size(); ++i) {
            int code = (Integer)msg.getItemCodeList().get(i);
            ItemBase runeItem = itemBagDao.gemStoneBag.getItemByCode(code);
            if (runeItem == null) {
               this.logger.info("itemCode={}", code);
               return;
            }

            realList.add(runeItem.id);
            if (checkMap.containsKey(code)) {
               this.logger.info("itemCode相同={}", code);
               return;
            }

            checkMap.put(code, 1);
         }

         if (targetModel.getComposeConsume().isEmpty()) {
            return;
         }

         List<Integer> stoneList = new ArrayList();
         List<ResourceModel> propList = new ArrayList();

         for(int i = 0; i < targetModel.getComposeConsume().size(); ++i) {
            int propId = ((ResourceModel)targetModel.getComposeConsume().get(i)).getId();
            if (modelMap.containsKey(propId)) {
               for(int j = 0; j < ((ResourceModel)targetModel.getComposeConsume().get(i)).getValue(); ++j) {
                  stoneList.add(propId);
               }
            } else {
               propList.add(new ResourceModel(((ResourceModel)targetModel.getComposeConsume().get(i)).getType(), ((ResourceModel)targetModel.getComposeConsume().get(i)).getId(), ((ResourceModel)targetModel.getComposeConsume().get(i)).getValue()));
            }
         }

         if (!this.player.checkResourceNum(propList)) {
            this.player.failure(53010);
            return;
         }

         if (realList.isEmpty() || stoneList.isEmpty() || realList.size() != stoneList.size() || !realList.containsAll(stoneList)) {
            this.player.failure(53010);
            return;
         }

         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

         for(int i = 0; i < msg.getItemCodeList().size(); ++i) {
            itemBagPart.deleteItemByCode((Integer)msg.getItemCodeList().get(i), 1, 53, 5307, 0, 0, "");
         }

         this.player.senditemUpdateMsg();
         this.player.delResource((List)propList, 53, 5307, 0, 0, "");
         this.player.addResource(2, targetId, 1, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 53, 5307, 0, msg.getItemCodeList().size(), String.valueOf(this.player.getPlayerId()));
         ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", targetId);
         if (null != itemModel) {
            MergeActivityHeFuKuangHuanPart mergeActivityHeFuKuangHuanPart = (MergeActivityHeFuKuangHuanPart)this.player.getMgrPart(MergeActivityHeFuKuangHuanPart.class);
            mergeActivityHeFuKuangHuanPart.cutGemRushScore(itemModel.getQuality(), 1);
         }

         ExclusiveTreasureMsg.S2C_ComposeStone_5516.Builder builder = ExclusiveTreasureMsg.S2C_ComposeStone_5516.newBuilder();
         builder.setResult(1);
         this.player.sendMsg(builder.build());
      }

   }

   @MsgHandlerAnno
   public void C2S_StoneExchange_5521(ExclusiveTreasureMsg.C2S_StoneExchange_5521 msg, String source) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      List<Integer> idList = new ArrayList();
      Map<Integer, Integer> checkMap = new HashMap();

      for(int i = 0; i < msg.getItemCodeList().size(); ++i) {
         int code = (Integer)msg.getItemCodeList().get(i);
         ItemBase runeItem = itemBagDao.gemStoneBag.getItemByCode(code);
         if (runeItem == null) {
            this.logger.info("itemCode={}", code);
            return;
         }

         idList.add(runeItem.id);
         if (checkMap.containsKey(code)) {
            return;
         }

         checkMap.put(code, 1);
      }

      if (!idList.isEmpty()) {
         int cost = 0;

         for(Integer id : idList) {
            ExclusiveTreasureStoneModel model = (ExclusiveTreasureStoneModel)this.player.getGameModelPool().getEntity("exclusiveTreasureStone", id);
            ExclusiveTreasureStoneModel targetModel = (ExclusiveTreasureStoneModel)this.player.getGameModelPool().getEntity("exclusiveTreasureStone", msg.getTargetId());
            if (targetModel != null && model != null) {
               if (id == msg.getTargetId()) {
                  this.player.failure(61063);
                  return;
               }

               if (model.getQuality() != targetModel.getQuality()) {
                  this.player.failure(61062);
                  return;
               }

               cost += model.getChangeCost();
            }
         }

         if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, cost)) {
            this.player.failure(61061);
         } else {
            this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)cost, 53, 5310, 0, 0, "");
            this.player.addResource(2, msg.getTargetId(), idList.size(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 53, 5310, 0, 1, "");
            ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", msg.getTargetId());
            if (null != itemModel) {
               MergeActivityHeFuKuangHuanPart mergeActivityHeFuKuangHuanPart = (MergeActivityHeFuKuangHuanPart)this.player.getMgrPart(MergeActivityHeFuKuangHuanPart.class);
               mergeActivityHeFuKuangHuanPart.cutGemRushScore(itemModel.getQuality(), idList.size());
            }

            ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

            for(int i = 0; i < msg.getItemCodeList().size(); ++i) {
               itemBagPart.deleteItemByCode((Integer)msg.getItemCodeList().get(i), 1, 53, 5310, 0, 0, "");
            }

            this.player.senditemUpdateMsg();
            ExclusiveTreasureMsg.S2C_StoneExchange_5522.Builder builder = ExclusiveTreasureMsg.S2C_StoneExchange_5522.newBuilder();
            builder.setResult(1);
            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_StoneHeroExchange_5527(ExclusiveTreasureMsg.C2S_StoneHeroExchange_5527 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao == null) {
         this.logger.info("英雄不存在：" + msg.getHeroCode());
      } else if (Objects.isNull(heroDao.exTreasure)) {
         this.logger.error("未激活专属宝物");
      } else {
         ExclusiveTreasure treasure = heroDao.exTreasure;
         Map<Integer, ExclusiveTreasureBaseModel> modelMap = this.player.getGameModelPool().getMap("exclusiveTreasureBase");
         List<ExclusiveTreasureBaseModel> extraList = new ArrayList();

         for(ExclusiveTreasureBaseModel model : modelMap.values()) {
            if (model.getLev() == treasure.lev && model.getStar() == treasure.star) {
               extraList.add(model);
            }
         }

         if (extraList.isEmpty()) {
            this.logger.error("数据错误！！！");
         } else if (msg.getPosition().getNumber() <= ((ExclusiveTreasureBaseModel)extraList.get(0)).getHoleNum()) {
            if (!treasure.stoneMap.containsKey(msg.getPosition())) {
               this.logger.info("当前位置无穿戴");
            } else {
               int itemId = (Integer)treasure.stoneMap.get(msg.getPosition());
               ExclusiveTreasureStoneModel model = (ExclusiveTreasureStoneModel)this.player.getGameModelPool().getEntity("exclusiveTreasureStone", itemId);
               ExclusiveTreasureStoneModel targetModel = (ExclusiveTreasureStoneModel)this.player.getGameModelPool().getEntity("exclusiveTreasureStone", msg.getTargetId());
               if (model != null && targetModel != null) {
                  if (itemId == msg.getTargetId()) {
                     this.player.failure(61063);
                  } else if (model.getQuality() != targetModel.getQuality()) {
                     this.player.failure(61062);
                  } else {
                     Integer cost = model.getChangeCost();
                     if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, cost)) {
                        this.player.failure(61061);
                     } else {
                        this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)cost, 53, 5310, 0, 0, "");
                        treasure.stoneMap.put(msg.getPosition(), msg.getTargetId());
                        heroDao.updateOp();
                        heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_EXCLUSIVE_TREASURE, heroDao);
                        ExclusiveTreasureMsg.S2C_StoneHeroExchange_5528.Builder builder = ExclusiveTreasureMsg.S2C_StoneHeroExchange_5528.newBuilder();
                        builder.setHeroCode(msg.getHeroCode());
                        CommonMsg.TreasureStone.Builder stone = CommonMsg.TreasureStone.newBuilder();
                        stone.setId(msg.getTargetId());
                        stone.setPosition(msg.getPosition());
                        builder.setStoneInfo(stone);
                        this.player.sendMsg(builder.build());
                     }
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_StrengthStone_5523(ExclusiveTreasureMsg.C2S_StrengthStone_5523 msg, String source) {
      Map<Integer, ExclusiveTreasureStoneModel> modelMap = this.player.getGameModelPool().getMap("exclusiveTreasureStone");
      ExclusiveTreasureStoneModel targetModel = (ExclusiveTreasureStoneModel)modelMap.get(msg.getTargetId());
      if (!Objects.isNull(targetModel)) {
         ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
         ItemBase runeItem = itemBagDao.gemStoneBag.getItemByCode(msg.getItemCode());
         if (runeItem == null) {
            this.logger.info("itemCode={}", msg.getItemCode());
         } else if (!targetModel.getComposeConsume().isEmpty()) {
            List<Integer> stoneList = new ArrayList();
            List<ResourceModel> propList = new ArrayList();

            for(int i = 0; i < targetModel.getComposeConsume().size(); ++i) {
               int propId = ((ResourceModel)targetModel.getComposeConsume().get(i)).getId();
               if (modelMap.containsKey(propId)) {
                  for(int j = 0; j < ((ResourceModel)targetModel.getComposeConsume().get(i)).getValue(); ++j) {
                     stoneList.add(propId);
                  }
               } else {
                  propList.add(new ResourceModel(((ResourceModel)targetModel.getComposeConsume().get(i)).getType(), ((ResourceModel)targetModel.getComposeConsume().get(i)).getId(), ((ResourceModel)targetModel.getComposeConsume().get(i)).getValue()));
               }
            }

            if (!this.player.checkResourceNum(propList)) {
               this.player.failure(53014);
            } else {
               List<Integer> realList = new ArrayList();
               realList.add(runeItem.id);
               if (!realList.isEmpty() && !stoneList.isEmpty() && realList.size() == stoneList.size() && realList.containsAll(stoneList)) {
                  ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                  itemBagPart.deleteItemByCode(msg.getItemCode(), 1, 53, 5311, 0, 0, "");
                  this.player.senditemUpdateMsg();
                  this.player.delResource((List)propList, 53, 5311, 0, 0, "");
                  this.player.addResource(2, msg.getTargetId(), 1, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 5311, 5307, 0, msg.getItemCode(), String.valueOf(this.player.getPlayerId()));
                  HefuGemPointModel model = (HefuGemPointModel)this.player.getGameModelPool().getEntity("HefuGemPoint", 7);
                  if (null != model) {
                     MergeActivityHeFuKuangHuanPart mergeActivityHeFuKuangHuanPart = (MergeActivityHeFuKuangHuanPart)this.player.getMgrPart(MergeActivityHeFuKuangHuanPart.class);
                     mergeActivityHeFuKuangHuanPart.updateRushRank(3, model.getPoint());
                  }

                  ExclusiveTreasureMsg.S2C_StrengthStone_5524.Builder builder = ExclusiveTreasureMsg.S2C_StrengthStone_5524.newBuilder();
                  builder.setResult(1);
                  this.player.sendMsg(builder.build());
               } else {
                  this.player.failure(53014);
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_StrengthHeroStone_5525(ExclusiveTreasureMsg.C2S_StrengthHeroStone_5525 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao == null) {
         this.logger.info("英雄不存在：" + msg.getHeroCode());
      } else if (Objects.isNull(heroDao.exTreasure)) {
         this.logger.error("未激活专属宝物");
      } else {
         ExclusiveTreasure treasure = heroDao.exTreasure;
         Map<Integer, ExclusiveTreasureBaseModel> modelMap = this.player.getGameModelPool().getMap("exclusiveTreasureBase");
         List<ExclusiveTreasureBaseModel> extraList = new ArrayList();

         for(ExclusiveTreasureBaseModel model : modelMap.values()) {
            if (model.getLev() == treasure.lev && model.getStar() == treasure.star) {
               extraList.add(model);
            }
         }

         if (extraList.isEmpty()) {
            this.logger.error("数据错误！！！");
         } else if (msg.getPosition().getNumber() <= ((ExclusiveTreasureBaseModel)extraList.get(0)).getHoleNum()) {
            if (!treasure.stoneMap.containsKey(msg.getPosition())) {
               this.logger.info("当前位置无穿戴");
            } else {
               int itemId = (Integer)treasure.stoneMap.get(msg.getPosition());
               Map<Integer, ExclusiveTreasureStoneModel> modelStoneMap = this.player.getGameModelPool().getMap("exclusiveTreasureStone");
               ExclusiveTreasureStoneModel targetModel = (ExclusiveTreasureStoneModel)modelStoneMap.get(msg.getTargetId());
               if (!Objects.isNull(targetModel)) {
                  if (!targetModel.getComposeConsume().isEmpty()) {
                     List<Integer> stoneList = new ArrayList();
                     List<ResourceModel> propList = new ArrayList();

                     for(int i = 0; i < targetModel.getComposeConsume().size(); ++i) {
                        int propId = ((ResourceModel)targetModel.getComposeConsume().get(i)).getId();
                        if (modelStoneMap.containsKey(propId)) {
                           for(int j = 0; j < ((ResourceModel)targetModel.getComposeConsume().get(i)).getValue(); ++j) {
                              stoneList.add(propId);
                           }
                        } else {
                           propList.add(new ResourceModel(((ResourceModel)targetModel.getComposeConsume().get(i)).getType(), ((ResourceModel)targetModel.getComposeConsume().get(i)).getId(), ((ResourceModel)targetModel.getComposeConsume().get(i)).getValue()));
                        }
                     }

                     if (!this.player.checkResourceNum(propList)) {
                        this.player.failure(53014);
                     } else {
                        List<Integer> realList = new ArrayList();
                        realList.add(itemId);
                        if (!realList.isEmpty() && !stoneList.isEmpty() && realList.size() == stoneList.size() && realList.containsAll(stoneList)) {
                           this.player.delResource((List)propList, 53, 5311, 0, 0, "");
                           treasure.stoneMap.put(msg.getPosition(), msg.getTargetId());
                           heroDao.updateOp();
                           heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_EXCLUSIVE_TREASURE, heroDao);
                           ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", msg.getTargetId());
                           MergeActivityHeFuKuangHuanPart mergeActivityHeFuKuangHuanPart = (MergeActivityHeFuKuangHuanPart)this.player.getMgrPart(MergeActivityHeFuKuangHuanPart.class);
                           mergeActivityHeFuKuangHuanPart.updateGemRushRank(itemModel, 1, true);
                           ExclusiveTreasureMsg.S2C_StrengthHeroStone_5526.Builder builder = ExclusiveTreasureMsg.S2C_StrengthHeroStone_5526.newBuilder();
                           builder.setHeroCode(msg.getHeroCode());
                           CommonMsg.TreasureStone.Builder stone = CommonMsg.TreasureStone.newBuilder();
                           stone.setId(msg.getTargetId());
                           stone.setPosition(msg.getPosition());
                           builder.setStoneInfo(stone);
                           this.player.sendMsg(builder.build());
                        } else {
                           this.player.failure(53014);
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
