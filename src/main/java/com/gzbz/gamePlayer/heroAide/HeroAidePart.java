package com.gzbz.gamePlayer.heroAide;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.HeroArchiveDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.ItemBagDao;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.playerBag.HeroAideItem;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.AideChangeModel;
import com.gzbz.model.AideLevelModel;
import com.gzbz.model.AideTrammelsModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.AideMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.stream.Collectors;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class HeroAidePart extends PlayerPart {
   public static final int AIDE_SITE_1 = 1;
   public static final int AIDE_SITE_2 = 2;

   @MsgHandlerAnno
   public void C2S_HeroAideChoice_9201(AideMsg.C2S_HeroAideChoice_9201 msg, String source) {
      int hero = msg.getHero();
      int item = msg.getItem();
      int site = msg.getSite();
      if (site != 1 && site != 2) {
         this.player.failure(6);
      } else {
         HeroDao heroDao = this.getHero(hero);
         if (heroDao == null) {
            this.player.failure(4100);
         } else if (!HeroModel.isReplacementHero(heroDao.id)) {
            HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroDao.id);
            if (heroModel == null) {
               this.player.failure(0);
            } else {
               ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
               ItemBase itemBase = itemBagPart.getItemByCode(item);
               if (itemBase == null) {
                  this.player.failure(30003);
               } else {
                  HeroAideItem heroAideItem = (HeroAideItem)itemBase;
                  AideLevelModel currentAideModel = (AideLevelModel)ApplicationContextProvider.getModelPoolEntity("aideLevel", heroAideItem.aideId);
                  ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", heroAideItem.id);
                  if (currentAideModel != null && itemModel != null && itemModel.getSubclass() == 9) {
                     if (heroModel.getNation() != 10 || heroDao.inheritNation > 0) {
                        HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                        int realNation = heroBagPart.getHeroNation(heroDao);
                        if (site == 1 && itemModel.getCamp() != realNation) {
                           this.player.failure(76412);
                        } else {
                           String[] aideWearLimit = ApplicationContextProvider.getConfigString("aideWearLimit", "5,3").split(",");
                           int quality = Integer.parseInt(aideWearLimit[0]);
                           int star = Integer.parseInt(aideWearLimit[1]);
                           if (site == 2) {
                              String aide2WearCondition = ApplicationContextProvider.getConfigString("aideWearCondition", "5");
                              AideLevelModel aideModel1 = (AideLevelModel)ApplicationContextProvider.getModelPoolEntity("aideLevel", heroDao.aide);
                              if (itemModel.getQuality() < Integer.parseInt(aide2WearCondition) || aideModel1 == null || itemModel.getCamp() == realNation) {
                                 this.player.failure(6);
                                 return;
                              }

                              ItemModel aideItem1 = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", aideModel1.getAideId());
                              if (aideItem1.getQuality() < quality || aideModel1.getLevel() < star) {
                                 this.player.failure(6);
                                 return;
                              }
                           }

                           itemBagPart.deleteItemByCode(heroAideItem.code, 1, 30, 3003, heroDao.code, 0, "", true);
                           AideLevelModel oldModel = null;
                           if (site == 1) {
                              if (heroDao.aide > 0) {
                                 oldModel = (AideLevelModel)ApplicationContextProvider.getModelPoolEntity("aideLevel", heroDao.aide);
                              }

                              heroDao.aide = currentAideModel.getId();
                              if (heroDao.aide2 > 0) {
                                 ItemModel aideItem1 = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", currentAideModel.getAideId());
                                 AideLevelModel aideModel1 = (AideLevelModel)ApplicationContextProvider.getModelPoolEntity("aideLevel", heroDao.aide);
                                 if (aideItem1.getQuality() < quality || aideModel1.getLevel() < star) {
                                    this.handleHeroAideDown(heroDao, 2, true);
                                 }
                              }
                           } else {
                              if (heroDao.aide2 > 0) {
                                 oldModel = (AideLevelModel)ApplicationContextProvider.getModelPoolEntity("aideLevel", heroDao.aide2);
                              }

                              heroDao.aide2 = currentAideModel.getId();
                           }

                           heroDao.updateOp();
                           this.autoChangeAideTrammelsId(heroDao);
                           if (oldModel != null) {
                              heroAideItem = itemBagPart.addHeroAide(oldModel, 30, 3003, hero, currentAideModel.getId(), "");
                              this.player.additemUpdateBuilder(heroAideItem);
                              this.player.senditemUpdateMsg();
                           }

                           this.player.sendMsg(AideMsg.S2C_HeroAideChoice_9202.newBuilder().setHero(hero).setAideId(currentAideModel.getId()).setSite(site).build());
                           this.sendHeroMsg(heroDao);
                           int taskVal = 0;

                           for(HeroDao heroDao1 : this.getHeroMap().values()) {
                              taskVal += (heroDao1.aide > 0 ? 1 : 0) + (heroDao1.aide2 > 0 ? 1 : 0);
                           }

                           this.player.triggerTask(365, 0, (long)taskVal, 0);
                        }
                     }
                  } else {
                     this.player.failure(0);
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_HeroAideDown_9203(AideMsg.C2S_HeroAideDown_9203 msg, String source) {
      int heroCode = msg.getHero();
      int site = msg.getSite();
      HeroDao heroDao = this.getHero(heroCode);
      if (heroDao == null) {
         this.player.failure(4100);
      } else if ((site != 1 || heroDao.aide > 0) && (site != 2 || heroDao.aide2 > 0)) {
         if (this.handleHeroAideDown(heroDao, site, false) != null) {
            AideMsg.S2C_HeroAideDown_9204 build = AideMsg.S2C_HeroAideDown_9204.newBuilder().setHero(heroCode).setSite(site).build();
            this.player.sendMsg(build);
            if (site == 1 && this.handleHeroAideDown(heroDao, 2, true) != null) {
               this.player.sendMsg(build);
            }
         }

      } else {
         this.player.failure(30001);
      }
   }

   public CommonMsg.ItemInfo.Builder handleHeroAideDown(HeroDao heroDao, int site, boolean isTips) {
      CommonMsg.ItemInfo.Builder builder = null;
      if (site != 1 && site != 2) {
         return null;
      } else if ((site != 1 || heroDao.aide > 0) && (site != 2 || heroDao.aide2 > 0)) {
         int aideId = site == 1 ? heroDao.aide : heroDao.aide2;
         AideLevelModel aideLevelModel = (AideLevelModel)ApplicationContextProvider.getModelPoolEntity("aideLevel", aideId);
         if (aideLevelModel != null) {
            ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
            HeroAideItem heroAideItem = itemBagPart.addHeroAide(aideLevelModel, 30, 3004, heroDao.code, aideId, "");
            this.player.additemUpdateBuilder(heroAideItem);
            this.player.senditemUpdateMsg();
            builder = CommonMsg.ItemInfo.newBuilder();
            builder.setType(2);
            builder.setId(heroAideItem.id);
            builder.setNum(heroAideItem.getNum());
            builder.setCode(heroAideItem.code);
            builder.setPos(CommonMsg.WearPosition.WEARPOSITION_AIDE.getNumber());
         } else {
            this.logger.error("玩家{}副将{}配置不存在", this.player.getPlayerId(), aideId);
         }

         if (site == 1) {
            heroDao.aide = 0;
         } else {
            heroDao.aide2 = 0;
         }

         heroDao.updateOp();
         if (isTips && builder != null) {
            this.player.sendMsg(PlayerMsg.S2C_ItemList_2005.newBuilder().addItems(builder).setShowType(PlayerMsg.ShowType.SHOW_TYPE_COMMON).build());
         }

         this.sendHeroMsg(heroDao);
         return builder;
      } else {
         return null;
      }
   }

   @MsgHandlerAnno
   public void C2S_HeroAideUpgrade_9205(AideMsg.C2S_HeroAideUpgrade_9205 msg, String source) {
      int hero = msg.getHero();
      int site = msg.getSite();
      if (site != 1 && site != 2) {
         this.player.failure(6);
      } else {
         HeroDao heroDao = this.getHero(hero);
         if (heroDao == null) {
            this.player.failure(4100);
         } else if (heroDao.aide <= 0 && heroDao.aide2 <= 0) {
            this.player.failure(30001);
         } else {
            int aideId = site == 1 ? heroDao.aide : heroDao.aide2;
            AideLevelModel aideLevelModel = (AideLevelModel)ApplicationContextProvider.getModelPoolEntity("aideLevel", aideId);
            if (aideLevelModel == null) {
               this.player.failure(0);
            } else {
               Map<Integer, TreeMap<Integer, AideLevelModel>> aideLevelModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, AideLevelModel>>getModelPoolMap("customAideLevel");
               TreeMap<Integer, AideLevelModel> curAideModelMap = (TreeMap)aideLevelModelMap.get(aideLevelModel.getAideId());
               if (curAideModelMap != null && !curAideModelMap.isEmpty()) {
                  if ((Integer)curAideModelMap.lastKey() <= aideId) {
                     this.player.failure(30004);
                  } else {
                     ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
                     List<HeroAideItem> heroAideItems = (List)itemBagDao.aideBag.getMap().values().stream().filter((heroAideItem) -> msg.getItemCodesList().contains(heroAideItem.code)).collect(Collectors.toList());
                     Map<Integer, Integer> aideItemCountMap = new HashMap();
                     heroAideItems.forEach((heroAideItem) -> {
                        Integer var10000 = (Integer)aideItemCountMap.put(heroAideItem.id, heroAideItem.getNum() + (Integer)aideItemCountMap.getOrDefault(heroAideItem.id, 0));
                     });
                     List<ResourceModel> delResourceList = new ArrayList();

                     for(ResourceModel needItem : aideLevelModel.getNeedItems()) {
                        if (needItem.getType() == 2 && aideLevelModelMap.containsKey(needItem.getId())) {
                           if ((Integer)aideItemCountMap.getOrDefault(needItem.getId(), 0) < needItem.getValue()) {
                              this.player.failure(30005);
                              return;
                           }
                        } else {
                           if (!this.player.checkResourceNum(needItem)) {
                              this.player.failure(30005);
                              return;
                           }

                           delResourceList.add(needItem);
                        }
                     }

                     this.player.delResource((List)delResourceList, 30, 3002, heroDao.code, aideId, "");
                     ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                     List<ResourceModel> returnResources = new ArrayList();
                     heroAideItems.forEach((heroAideItem) -> {
                        this.discomposeReturn(heroAideItem.aideId, heroAideItem.getNum(), returnResources);
                        itemBagPart.deleteItemByCode(heroAideItem.code, heroAideItem.getNum(), 30, 3002, heroDao.code, site == 1 ? heroDao.aide : heroDao.aide2, "", false);
                     });
                     this.player.senditemUpdateMsg();
                     this.player.addResource(returnResources, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 30, 3002, heroDao.code, aideId, "");
                     if (site == 1) {
                        ++heroDao.aide;
                        aideId = heroDao.aide;
                     } else {
                        ++heroDao.aide2;
                        aideId = heroDao.aide2;
                     }

                     this.autoChangeAideTrammelsId(heroDao);
                     heroDao.updateOp();
                     this.player.sendMsg(AideMsg.S2C_HeroAideUpgrade_9206.newBuilder().setHero(hero).setAideId(aideId).setSite(site).build());
                     this.sendHeroMsg(heroDao);
                     aideLevelModel = (AideLevelModel)ApplicationContextProvider.getModelPoolEntity("aideLevel", aideId);
                     GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
                     giftPart.triggerTimeLimitGift(9, aideLevelModel.getLevel());
                     this.player.getOperationMgr().addExtraLog(this.player, 212, aideLevelModel.getName(), String.valueOf(aideLevelModel.getLevel()));
                  }
               } else {
                  this.player.failure(0);
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_HeroAideRecord_9207(AideMsg.C2S_HeroAideRecord_9207 msg, String source) {
      AideMsg.S2C_HeroAideRecord_9208.Builder resp = AideMsg.S2C_HeroAideRecord_9208.newBuilder();
      HeroArchiveDao heroArchiveDao = (HeroArchiveDao)this.player.getData("tb_dictionary_hero", this.player.getPlayerId());
      resp.addAllItemIds(heroArchiveDao.heroAides);
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_HeroAideOneKeyDiscompose_9209(AideMsg.C2S_HeroAideOneKeyDiscompose_9209 msg, String source) {
      List<ResourceModel> returnResources = new ArrayList();
      Map<Integer, TreeMap<Integer, AideLevelModel>> aideLevelModelMap = ApplicationContextProvider.<Integer, TreeMap<Integer, AideLevelModel>>getModelPoolMap("customAideLevel");
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      Map<Integer, HeroAideItem> heroAideItemMap = itemBagDao.aideBag.getMap();

      for(Integer code : msg.getCodesList()) {
         HeroAideItem heroAideItem = (HeroAideItem)heroAideItemMap.get(code);
         if (heroAideItem == null) {
            this.logger.error("副将code:{},分解失败,背包中无此副将", code);
         } else {
            ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", heroAideItem.id);
            if (itemModel == null) {
               this.logger.error("副将code:{},itemId:{}分解失败,物品不存在", code, heroAideItem.id);
            } else if (!itemModel.canSell()) {
               this.logger.error("副将code:{},itemId:{}分解失败,物品不可分解", code, heroAideItem.id);
            } else {
               AideLevelModel aideLevelModel = (AideLevelModel)ApplicationContextProvider.getModelPoolEntity("aideLevel", heroAideItem.aideId);
               if (aideLevelModel == null) {
                  this.logger.error("副将code:{},itemId:{},levelId:{}分解失败,副将配置不存在", new Object[]{code, heroAideItem.id, heroAideItem.aideId});
               } else {
                  if (aideLevelModel.getLevel() == 1) {
                     Integer price = (Integer)itemModel.getSell().get(2);
                     int totalPrice = price * heroAideItem.getNum();
                     Integer resourceType = (Integer)itemModel.getSell().get(0);
                     Integer id = (Integer)itemModel.getSell().get(1);
                     ResourceModel.addResourceToList(returnResources, new ResourceModel(resourceType, id, totalPrice));
                     heroAideItemMap.remove(code);
                     heroAideItem.setNum(0);
                  } else {
                     this.discomposeReturn(heroAideItem.aideId, heroAideItem.getNum(), returnResources);
                     TreeMap<Integer, AideLevelModel> curAideModelMap = (TreeMap)aideLevelModelMap.get(aideLevelModel.getAideId());
                     heroAideItem.aideId = (Integer)curAideModelMap.firstKey();
                  }

                  this.player.additemUpdateBuilder(heroAideItem);
               }
            }
         }
      }

      itemBagDao.updateOp();
      this.player.addResource(returnResources, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 30, 3005, 0, 0, msg.getCodesList().toString());
      AideMsg.S2C_HeroAideOneKeyDiscompose_9210.Builder resp = AideMsg.S2C_HeroAideOneKeyDiscompose_9210.newBuilder();
      resp.addAllCodes(msg.getCodesList());
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_HeroAideTrammelsSkill_9211(AideMsg.C2S_HeroAideUniteSkill_9211 msg, String source) {
      int heroCode = msg.getHeroCode();
      int trammelsId = msg.getTrammelsId();
      AideTrammelsModel trammelsModel = (AideTrammelsModel)ApplicationContextProvider.getModelPoolEntity("aideTrammels", trammelsId);
      if (trammelsModel == null) {
         this.player.failure(6);
      } else {
         List<Integer> unlockAideTrammelsIds = this.getUnlockAideTrammelsIds(heroCode);
         if (!unlockAideTrammelsIds.contains(trammelsId)) {
            this.player.failure(6);
         } else {
            HeroDao heroDao = this.getHero(heroCode);
            heroDao.aideTrammelsId = trammelsId;
            heroDao.updateOp();
            this.flushHero(heroDao);
            this.player.sendMsg(AideMsg.S2C_HeroAideUniteSkill_9212.newBuilder().setHeroCode(heroCode).setTrammelsId(trammelsId).build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_HeroAideChange_9213(AideMsg.C2S_HeroAideChange_9213 msg, String source) {
      int heroCode = msg.getHeroCode();
      int site = msg.getSite();
      int itemId = msg.getItemId();
      if (site != 1 && site != 2) {
         this.player.failure(6);
      } else {
         HeroDao hero = this.getHero(heroCode);
         int aideId = site == 1 ? hero.aide : hero.aide2;
         if (aideId <= 0) {
            this.player.failure(6);
         } else {
            ItemModel changeItem = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", itemId);
            HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", hero.id);
            if (heroModel != null && changeItem != null) {
               Map<Integer, AideChangeModel> changeModelMap = ApplicationContextProvider.<Integer, AideChangeModel>getModelPoolMap("aidechange");
               AideLevelModel oldAide = (AideLevelModel)ApplicationContextProvider.getModelPoolEntity("aideLevel", aideId);
               ItemModel oldItem = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", oldAide.getAideId());
               if (oldItem != null && oldItem.getQuality() == changeItem.getQuality()) {
                  AideLevelModel changeAide = null;
                  Map<Integer, AideLevelModel> map = ApplicationContextProvider.<Integer, AideLevelModel>getModelPoolMap("aideLevel");

                  for(AideLevelModel value : map.values()) {
                     if (value.getAideId() == changeItem.getId() && value.getLevel() == oldAide.getLevel()) {
                        changeAide = value;
                        break;
                     }
                  }

                  if (changeAide == null) {
                     this.player.failure(6);
                  } else {
                     boolean delSuc = false;

                     for(AideChangeModel value : changeModelMap.values()) {
                        if (value.getQuality() == changeItem.getQuality() && value.getStar() == changeAide.getLevel()) {
                           this.player.delResource((List)value.getItem(), 30, 3006, heroCode, itemId, "");
                           delSuc = true;
                           break;
                        }
                     }

                     if (!delSuc) {
                        this.player.failure(3);
                     } else {
                        boolean isUnload = false;
                        if (site == 1) {
                           hero.aide = changeAide.getId();
                           hero.updateOp();
                           if (changeItem.getCamp() != heroModel.getNation()) {
                              this.handleHeroAideDown(hero, 1, true);
                              this.handleHeroAideDown(hero, 2, true);
                              isUnload = true;
                           }
                        } else {
                           hero.aide2 = changeAide.getId();
                           hero.updateOp();
                           if (changeItem.getCamp() == heroModel.getNation()) {
                              this.handleHeroAideDown(hero, 2, true);
                              isUnload = true;
                           }
                        }

                        HeroArchiveDao heroArchiveDao = (HeroArchiveDao)this.player.getData("tb_dictionary_hero", this.player.getPlayerId());
                        if (!heroArchiveDao.heroAides.contains(changeItem.getId())) {
                           heroArchiveDao.heroAides.add(changeItem.getId());
                           heroArchiveDao.updateOp();
                        }

                        if (!isUnload) {
                           this.autoChangeAideTrammelsId(hero);
                        }

                        this.flushHero(hero);
                        this.player.sendMsg(AideMsg.S2C_HeroAideChange_9214.newBuilder().setHeroCode(heroCode).setSite(site).setItemId(itemId).build());
                     }
                  }
               } else {
                  this.player.failure(6);
               }
            } else {
               this.player.failure(0);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_HeroAideCanSel_9215(AideMsg.C2S_HeroAideCanSel_9215 msg, String source) {
      this.player.sendMsg(AideMsg.S2C_HeroAideCanSel_9216.newBuilder().addAllTrammels(this.getUnlockAideTrammelsIds(msg.getHeroCode())).build());
   }

   @MsgHandlerAnno
   public void C2S_HeroAideChangeInBag_9217(AideMsg.C2S_HeroAideChangeInBag_9217 msg, String source) {
      List<Integer> itemCodeList = msg.getItemCodeList();
      int changeItemId = msg.getItemId();
      Map<HeroAideItem, AideLevelModel> changeMap = new HashMap();
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());

      for(Integer itemCode : itemCodeList) {
         ItemBase itemBase = itemBagDao.getItemByCode(itemCode);
         if (!(itemBase instanceof HeroAideItem)) {
            this.player.failure(6);
            return;
         }

         changeMap.put((HeroAideItem)itemBase, (Object)null);
      }

      if (CollectionUtils.isEmpty(changeMap)) {
         this.player.failure(6);
      } else {
         ArrayList<ResourceModel> consumeList = new ArrayList();
         ItemModel changeItem = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", changeItemId);
         Map<Integer, AideChangeModel> changeModelMap = ApplicationContextProvider.<Integer, AideChangeModel>getModelPoolMap("aidechange");

         for(HeroAideItem heroAideItem : changeMap.keySet()) {
            AideLevelModel oldAide = (AideLevelModel)ApplicationContextProvider.getModelPoolEntity("aideLevel", heroAideItem.aideId);
            ItemModel oldItem = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", oldAide.getAideId());
            if (oldItem == null || changeItem == null || oldItem.getQuality() != changeItem.getQuality()) {
               this.player.failure(6);
               return;
            }

            AideLevelModel changeAide = null;
            Map<Integer, AideLevelModel> map = ApplicationContextProvider.<Integer, AideLevelModel>getModelPoolMap("aideLevel");

            for(AideLevelModel value : map.values()) {
               if (value.getAideId() == changeItem.getId() && value.getLevel() == oldAide.getLevel()) {
                  changeAide = value;
                  break;
               }
            }

            if (changeAide == null) {
               this.player.failure(6);
               return;
            }

            for(AideChangeModel value : changeModelMap.values()) {
               if (value.getQuality() == changeItem.getQuality() && value.getStar() == changeAide.getLevel()) {
                  ResourceModel.addResourceToListPlus(consumeList, value.getItem());
                  changeMap.replace(heroAideItem, changeAide);
                  break;
               }
            }
         }

         if (changeMap.values().stream().anyMatch(Objects::isNull)) {
            this.player.failure(6);
         } else {
            this.player.delResource((List)consumeList, 30, 3006, changeItemId, 0, "");
            changeMap.forEach((heroAideItemx, changeAidex) -> {
               heroAideItemx.aideId = changeAidex.getId();
               heroAideItemx.id = changeAidex.getAideId();
               this.player.additemUpdateBuilder(heroAideItemx);
            });
            itemBagDao.updateOp();
            this.player.senditemUpdateMsg();
            HeroArchiveDao heroArchiveDao = (HeroArchiveDao)this.player.getData("tb_dictionary_hero", this.player.getPlayerId());
            if (!heroArchiveDao.heroAides.contains(changeItem.getId())) {
               heroArchiveDao.heroAides.add(changeItem.getId());
               heroArchiveDao.updateOp();
            }

            this.player.sendMsg(AideMsg.S2C_HeroAideInBag_9218.newBuilder().addAllItemCode(itemCodeList).setItemId(changeItemId).build());
         }
      }
   }

   public void autoChangeAideTrammelsId(HeroDao heroDao) {
      if (heroDao.aideTrammelsId > 0) {
         List<Integer> unlockAideTrammelsIds = this.getUnlockAideTrammelsIds(heroDao.code);
         if (CollectionUtils.isEmpty(unlockAideTrammelsIds)) {
            heroDao.aideTrammelsId = 0;
            heroDao.updateOp();
            return;
         }

         if (unlockAideTrammelsIds.contains(heroDao.aideTrammelsId)) {
            return;
         }

         AideTrammelsModel trammelsModel = (AideTrammelsModel)ApplicationContextProvider.getModelPoolEntity("aideTrammels", heroDao.aideTrammelsId);
         if (trammelsModel == null) {
            this.logger.error("副将羁绊配置表aideTrammels没有【id:{}】的配置，请检查！！！", heroDao.aideTrammelsId);
            return;
         }

         AideTrammelsModel trammelsModel2 = (AideTrammelsModel)ApplicationContextProvider.getModelPoolEntity("aideTrammels", trammelsModel.getEffect());
         if (trammelsModel2 == null) {
            this.logger.error("副将羁绊配置表aideTrammels没有【id:{}】的配置，请检查！！！", trammelsModel.getEffect());
            return;
         }

         if (!unlockAideTrammelsIds.contains(trammelsModel.getEffect())) {
            heroDao.aideTrammelsId = 0;
            heroDao.updateOp();
            return;
         }

         heroDao.aideTrammelsId = trammelsModel2.getId();
         heroDao.updateOp();
      }

   }

   public List<Integer> getUnlockAideTrammelsIds(int heroCode) {
      ArrayList<Integer> aideTrammelsIds = new ArrayList();
      HeroDao heroDao = this.getHero(heroCode);
      AideLevelModel aideLevelModel1 = (AideLevelModel)ApplicationContextProvider.getModelPoolEntity("aideLevel", heroDao.aide);
      AideLevelModel aideLevelModel2 = (AideLevelModel)ApplicationContextProvider.getModelPoolEntity("aideLevel", heroDao.aide2);
      if (aideLevelModel1 != null && aideLevelModel2 != null) {
         ItemModel aideModel1 = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", aideLevelModel1.getAideId());
         ItemModel aideModel2 = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", aideLevelModel2.getAideId());
         Map<Integer, AideTrammelsModel> trammelsModelMap = ApplicationContextProvider.<Integer, AideTrammelsModel>getModelPoolMap("aideTrammels");

         for(AideTrammelsModel model : trammelsModelMap.values()) {
            if ((aideModel1.getCamp() == model.getCamp() || aideModel2.getCamp() == model.getCamp()) && aideModel1.getQuality() >= model.getUnlock1() && aideModel2.getQuality() >= model.getUnlock1() && aideLevelModel1.getLevel() >= model.getUnlock2() && aideLevelModel2.getLevel() >= model.getUnlock2()) {
               aideTrammelsIds.add(model.getId());
               if (aideTrammelsIds.contains(model.getEffect())) {
                  aideTrammelsIds.remove(new Integer(model.getEffectQuality() == 1 ? model.getId() : model.getEffect()));
               }
            }
         }

         return aideTrammelsIds;
      } else {
         return aideTrammelsIds;
      }
   }

   public void discomposeReturn(int aideId, int num, List<ResourceModel> returnResources) {
      int returnAideId = aideId;
      AideLevelModel aideLevelModel = (AideLevelModel)ApplicationContextProvider.getModelPoolEntity("aideLevel", aideId);
      if (aideLevelModel != null) {
         while(aideLevelModel.getLevel() > 1) {
            --returnAideId;
            aideLevelModel = (AideLevelModel)ApplicationContextProvider.getModelPoolEntity("aideLevel", returnAideId);
            if (aideLevelModel == null) {
               break;
            }

            for(int i = 0; i < num; ++i) {
               aideLevelModel.getNeedItems().forEach((resourceModel) -> resourceModel.clone().addResourceToList(returnResources));
            }
         }

      }
   }

   private HeroDao getHero(int heroCode) {
      return (HeroDao)this.getHeroMap().get(heroCode);
   }

   private Map<Integer, HeroDao> getHeroMap() {
      return this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());
   }

   private void sendHeroMsg(HeroDao heroDao) {
      List<HeroDao> heroDaoList = new ArrayList();
      heroDaoList.add(heroDao);
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      heroBagPart.sendHeroList2Client(heroDaoList);
      this.flushHero(heroDao);
   }

   private void flushHero(HeroDao heroDao) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_AIDE, heroDao);
   }
}
