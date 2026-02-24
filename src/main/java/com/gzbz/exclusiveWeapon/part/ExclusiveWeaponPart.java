package com.gzbz.exclusiveWeapon.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.ExclusiveWeaponDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.ItemBagDao;
import com.gzbz.exclusiveWeapon.EWeaponDefine;
import com.gzbz.exclusiveWeapon.bean.ExclusiveWeaponItem;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.ExclusiveWeaponBaseModel;
import com.gzbz.model.ExclusiveWeaponLevelModel;
import com.gzbz.model.ExclusiveWeaponLibraryModel;
import com.gzbz.model.ExclusiveWeaponNoticeModel;
import com.gzbz.model.ExclusiveWeaponStarLibModel;
import com.gzbz.model.ExclusiveWeaponStarLvModel;
import com.gzbz.model.ExclusiveWeaponUpStarModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.NeedItemsFun2;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.ExclusiveWeaponMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.war.ancientSword.AncientSwordPart;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ExclusiveWeaponPart extends PlayerPart {
   @Autowired
   ConfigManager configManager;

   public void loginHandle() {
      if (this.isNoticeAllUnlock()) {
         this.player.triggerTask(735, 0, 1L, 0);
      }

   }

   public int getLogModule() {
      return 144;
   }

   public ExclusiveWeaponItem getExclusiveWeaponItem(ExclusiveWeaponMsg.WearStatus wearStatus) {
      return wearStatus.getStatus() > 0 ? this.getWeaponItemFromHero(wearStatus.getHeroCode(), wearStatus.getPos().getNumber()) : this.getWeaponItemFromBag(wearStatus.getItemCode());
   }

   public ExclusiveWeaponItem getWeaponItemFromBag(int itemCode) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      ExclusiveWeaponItem weaponItem = itemBagDao.exclusiveWeaponBag.getItemByCode(itemCode);
      if (null == weaponItem) {
         this.logger.error("玩家 playerId:{} 背包中未找到道具 itemCode:{}", this.player.getPlayerId(), itemCode);
      }

      return weaponItem;
   }

   public ExclusiveWeaponItem getWeaponItemFromHero(int heroCode, int pos) {
      HeroDao heroDao = this.getHeroDao(heroCode);
      return null != heroDao && null != heroDao.exclusiveWeaponMap ? (ExclusiveWeaponItem)heroDao.exclusiveWeaponMap.get(pos) : null;
   }

   public ExclusiveWeaponDao getDao() {
      ExclusiveWeaponDao dao = (ExclusiveWeaponDao)this.player.getData("tb_exclusive_weapon", this.player.getPlayerId());
      return dao;
   }

   public HeroDao getHeroDao(int heroCode) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      if (null == heroDao) {
         this.logger.error("HeroDao 未找到对应英雄 heroCode:{}", heroCode);
      }

      return heroDao;
   }

   public void updateWeaponItem(ExclusiveWeaponMsg.WearStatus wearStatus) {
      if (wearStatus.getStatus() > 0) {
         this.updateHeroWeaponAndFlush(wearStatus.getHeroCode());
      } else {
         this.updateBagWeaponItem(wearStatus.getItemCode());
      }

   }

   public void updateHeroWeaponAndFlush(int heroCode) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      heroDao.updateOp();
      heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_EXCLUSIVE_WEAPON, heroDao);
   }

   public void updateBagWeaponItem(int itemCode) {
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      itemBagPart.updateOp();
      ExclusiveWeaponItem weaponItemFromBag = this.getWeaponItemFromBag(itemCode);
      if (null != weaponItemFromBag) {
         this.player.additemUpdateBuilder(weaponItemFromBag);
         this.player.senditemUpdateMsg();
      }
   }

   public void levelUp(ExclusiveWeaponItem weaponItem, int addExp) {
      if (null != weaponItem && addExp > 0) {
         int totalExp = weaponItem.exp + addExp;
         int starId = weaponItem.getStarId();
         ExclusiveWeaponUpStarModel exclusiveWeaponUpStarModel = EWeaponDefine.getExclusiveWeaponUpStarModel(starId);
         int levelMax = exclusiveWeaponUpStarModel.getLevelMax();

         while(true) {
            ExclusiveWeaponLevelModel exclusiveWeaponLevelModel = EWeaponDefine.getExclusiveWeaponLevelModel(weaponItem.level);
            if (weaponItem.level < levelMax && null != exclusiveWeaponLevelModel && exclusiveWeaponLevelModel.getExp() > 0) {
               if (totalExp >= exclusiveWeaponLevelModel.getExp()) {
                  ++weaponItem.level;
                  totalExp -= exclusiveWeaponLevelModel.getExp();
                  continue;
               }

               if (totalExp >= exclusiveWeaponLevelModel.getExp()) {
                  continue;
               }

               weaponItem.exp = totalExp;
               break;
            }

            weaponItem.exp = 0;
            break;
         }

      }
   }

   @MsgHandlerAnno
   public boolean C2S_LvUp_24501(ExclusiveWeaponMsg.C2S_LvUp_24501 msg, String source) {
      if (!this.player.isSystemOpen(6610)) {
         return this.player.failure(21);
      } else {
         ExclusiveWeaponItem exclusiveWeaponItem = this.getExclusiveWeaponItem(msg.getWearStatus());
         if (null == exclusiveWeaponItem) {
            return this.player.failure(76235);
         } else {
            int starId = exclusiveWeaponItem.getStarId();
            ExclusiveWeaponUpStarModel exclusiveWeaponUpStarModel = EWeaponDefine.getExclusiveWeaponUpStarModel(starId);
            ExclusiveWeaponLevelModel exclusiveWeaponLevelModel = EWeaponDefine.getExclusiveWeaponLevelModel(exclusiveWeaponItem.level);
            if (null != exclusiveWeaponUpStarModel && null != exclusiveWeaponLevelModel) {
               if (exclusiveWeaponItem.level < exclusiveWeaponUpStarModel.getLevelMax() && exclusiveWeaponLevelModel.getExp() > 0) {
                  ResourceModel levelUpCost = EWeaponDefine.getLevelUpCost(exclusiveWeaponItem.level, exclusiveWeaponItem.exp);
                  if (null == levelUpCost) {
                     return this.player.failure(37);
                  } else {
                     KeyValFun expItem = EWeaponDefine.getExpItem();
                     long resourceNum = this.player.getResourceNum(2, expItem.getKey());
                     if (resourceNum <= 0L) {
                        return this.player.failure(76135);
                     } else {
                        ExclusiveWeaponDao dao = this.getDao();
                        if (resourceNum < (long)levelUpCost.getValue()) {
                           levelUpCost.setValue((int)resourceNum);
                        }

                        int expByCostItem = EWeaponDefine.getExpByCostItem(levelUpCost);
                        this.levelUp(exclusiveWeaponItem, expByCostItem);
                        this.updateWeaponItem(msg.getWearStatus());
                        this.player.delResource(levelUpCost, this.getLogModule(), 14401, 0, 0, "");
                        ++dao.strongCount;
                        dao.updateOp();
                        GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
                        giftPart.triggerTimeLimitGift(37, dao.strongCount, true);
                        this.player.getOperationMgr().addExtraLog(this.player, 228, "幻武id:" + exclusiveWeaponItem.id, "幻武升级,升级后等级:" + exclusiveWeaponItem.level);
                        ExclusiveWeaponMsg.S2C_LvUp_24502.Builder resp = ExclusiveWeaponMsg.S2C_LvUp_24502.newBuilder();
                        this.player.sendMsg(resp.build());
                        return true;
                     }
                  }
               } else {
                  return this.player.failure(76236);
               }
            } else {
               return this.player.failure(37);
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_StarUp_24503(ExclusiveWeaponMsg.C2S_StarUp_24503 msg, String source) {
      if (!this.player.isSystemOpen(6611)) {
         return this.player.failure(21);
      } else {
         ExclusiveWeaponItem exclusiveWeaponItem = this.getExclusiveWeaponItem(msg.getWearStatus());
         if (null == exclusiveWeaponItem) {
            return this.player.failure(76235);
         } else {
            ExclusiveWeaponUpStarModel upStarModel = EWeaponDefine.getExclusiveWeaponUpStarModel(exclusiveWeaponItem.getStarId());
            if (null == upStarModel) {
               return this.player.failure(37);
            } else if (upStarModel.getNext() <= 0) {
               return this.player.failure(76237);
            } else {
               List<Integer> costItemCodeList = this.intDistinct(msg.getCostItemCodeList());
               if (costItemCodeList.size() <= 0) {
                  return this.player.failure(6);
               } else {
                  List<Integer> starUpRealCostCodes = this.getStarUpRealCostCodes(exclusiveWeaponItem.getStarId(), costItemCodeList);
                  if (starUpRealCostCodes == null) {
                     return this.player.failure(76135);
                  } else {
                     List<ResourceModel> costItemLvResetReward = new ArrayList();

                     for(Integer starUpRealCostCode : starUpRealCostCodes) {
                        ExclusiveWeaponItem weaponItemFromBag = this.getWeaponItemFromBag(starUpRealCostCode);
                        ResourceModel resourceModel = weaponItemFromBag.recLvResetReward();
                        if (null != resourceModel) {
                           resourceModel.addResourceToList(costItemLvResetReward);
                        }
                     }

                     ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                     itemBagPart.deleteItemByCodes(starUpRealCostCodes, this.getLogModule(), 14402, 0, 0, "");
                     exclusiveWeaponItem.setStarId(upStarModel.getNext());
                     this.updateWeaponItem(msg.getWearStatus());
                     this.addWeaponStarLv(exclusiveWeaponItem.id, exclusiveWeaponItem.recStarLv());
                     this.player.addResource(costItemLvResetReward, PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getLogModule(), 14403, 0, 0, "");
                     this.player.getOperationMgr().addExtraLog(this.player, 228, "幻武id:" + exclusiveWeaponItem.id, "升星后星级:" + exclusiveWeaponItem.recStarLv());
                     ExclusiveWeaponMsg.S2C_StarUp_24504.Builder resp = ExclusiveWeaponMsg.S2C_StarUp_24504.newBuilder();
                     this.player.sendMsg(resp.build());
                     return true;
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Wear_24505(ExclusiveWeaponMsg.C2S_Wear_24505 msg, String source) {
      HeroDao heroDao = this.getHeroDao(msg.getHeroCode());
      if (null == heroDao) {
         return this.player.failure(4100);
      } else if (msg.getWearStatus().getStatus() > 0 && msg.getHeroCode() == msg.getWearStatus().getHeroCode()) {
         return this.player.failure(6);
      } else {
         ExclusiveWeaponItem tempExclusiveWeaponItem = this.getExclusiveWeaponItem(msg.getWearStatus());
         if (null == tempExclusiveWeaponItem) {
            return this.player.failure(76235);
         } else {
            ExclusiveWeaponItem exclusiveWeaponItem = new ExclusiveWeaponItem(0, tempExclusiveWeaponItem);
            ExclusiveWeaponBaseModel baseModel = EWeaponDefine.getExclusiveWeaponBaseModel(exclusiveWeaponItem.id);
            if (baseModel == null) {
               return this.player.failure(37);
            } else {
               if (msg.getPos().getNumber() == 34) {
                  boolean addMain = this.undressAndAddItem(msg.getHeroCode(), 34, false);
                  boolean addLeft = this.undressAndAddItem(msg.getHeroCode(), 35, false);
                  boolean addRight = this.undressAndAddItem(msg.getHeroCode(), 36, false);
                  if (!addMain || !addLeft || !addRight) {
                     return this.player.failure(76240);
                  }

                  heroDao.soulSkill.clear();
                  if (msg.getWearStatus().getStatus() > 0) {
                     HeroDao costHeroDao = this.getHeroDao(msg.getWearStatus().getHeroCode());
                     if (msg.getWearStatus().getPos().getNumber() == 34) {
                        heroDao.exclusiveWeaponMap.putAll(costHeroDao.exclusiveWeaponMap);
                        heroDao.soulSkill.putAll(costHeroDao.soulSkill);
                        costHeroDao.exclusiveWeaponMap.clear();
                        costHeroDao.soulSkill.clear();
                     } else {
                        heroDao.exclusiveWeaponMap.put(34, exclusiveWeaponItem);
                        costHeroDao.exclusiveWeaponMap.remove(msg.getWearStatus().getPos().getNumber());
                        this.checkAndDelSoulSkill(costHeroDao);
                     }

                     this.updateHeroWeaponAndFlush(msg.getWearStatus().getHeroCode());
                  } else {
                     heroDao.exclusiveWeaponMap.put(34, exclusiveWeaponItem);
                     ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                     itemBagPart.deleteItemByCode(msg.getWearStatus().getItemCode(), 1, this.getLogModule(), 14404, 0, 0, "");
                     this.player.senditemUpdateMsg();
                  }
               } else {
                  if (msg.getPos().getNumber() != 35 && msg.getPos().getNumber() != 36) {
                     return this.player.failure(6);
                  }

                  ExclusiveWeaponItem mainWeaponItem = (ExclusiveWeaponItem)heroDao.exclusiveWeaponMap.get(34);
                  if (null == mainWeaponItem) {
                     return this.player.failure(76238);
                  }

                  int starId = mainWeaponItem.getStarId();
                  ExclusiveWeaponUpStarModel exclusiveWeaponUpStarModel = EWeaponDefine.getExclusiveWeaponUpStarModel(starId);
                  int needSlot = msg.getPos().getNumber() == 35 ? 1 : 2;
                  if (exclusiveWeaponUpStarModel.getBlessSlotsNum() < needSlot) {
                     return this.player.failure(76239);
                  }

                  List<Integer> blessQuality = EWeaponDefine.getBlessQuality();
                  if (!blessQuality.contains(baseModel.getQuality())) {
                     return this.player.failure(76251);
                  }

                  ExclusiveWeaponItem curWeaponItem = (ExclusiveWeaponItem)heroDao.exclusiveWeaponMap.get(msg.getPos().getNumber());
                  if (null == curWeaponItem) {
                     heroDao.exclusiveWeaponMap.put(msg.getPos().getNumber(), exclusiveWeaponItem);
                  } else {
                     ExclusiveWeaponItem addLeftWeaponItem = this.addExclusiveWeaponItem(curWeaponItem, this.getLogModule(), 14405, false);
                     if (null == addLeftWeaponItem) {
                        this.logger.error("addExclusiveWeaponItem 添加专属幻武道具异常");
                        return this.player.failure(6);
                     }

                     heroDao.exclusiveWeaponMap.put(msg.getPos().getNumber(), exclusiveWeaponItem);
                  }

                  if (msg.getWearStatus().getStatus() > 0) {
                     HeroDao costHeroDao = this.getHeroDao(msg.getWearStatus().getHeroCode());
                     costHeroDao.exclusiveWeaponMap.remove(msg.getWearStatus().getPos().getNumber());
                     if (msg.getWearStatus().getPos().getNumber() == 34) {
                        this.undressAndAddItem(costHeroDao.code, 35, false);
                        this.undressAndAddItem(costHeroDao.code, 36, false);
                        costHeroDao.soulSkill.clear();
                     } else {
                        this.checkAndDelSoulSkill(costHeroDao);
                     }

                     this.updateHeroWeaponAndFlush(msg.getWearStatus().getHeroCode());
                  } else {
                     ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                     itemBagPart.deleteItemByCode(msg.getWearStatus().getItemCode(), 1, this.getLogModule(), 14404, 0, 0, "");
                     this.player.senditemUpdateMsg();
                  }
               }

               this.checkAndDelSoulSkill(heroDao);
               this.updateHeroWeaponAndFlush(msg.getHeroCode());
               GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
               giftPart.triggerTimeLimitGift(38, baseModel.getQuality());
               StringBuilder ewLogStr = new StringBuilder();

               for(Map.Entry<Integer, ExclusiveWeaponItem> entry : heroDao.exclusiveWeaponMap.entrySet()) {
                  Integer pos = (Integer)entry.getKey();
                  ExclusiveWeaponItem value = (ExclusiveWeaponItem)entry.getValue();
                  String posStr = "";
                  if (pos == 34) {
                     posStr = "主幻武";
                  } else if (pos == 35) {
                     posStr = "左护佑";
                  } else if (pos == 36) {
                     posStr = "右护佑";
                  }

                  ewLogStr.append(posStr + "id:").append(value.id).append("-").append(posStr + "等级:").append(value.level).append("-").append(posStr + "星级:").append(value.recStarLv()).append(";");
               }

               this.player.getOperationMgr().addExtraLog(this.player, 229, ewLogStr.toString());
               ExclusiveWeaponMsg.S2C_Wear_24506.Builder resp = ExclusiveWeaponMsg.S2C_Wear_24506.newBuilder();
               this.player.sendMsg(resp.build());
               return true;
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Undress_24507(ExclusiveWeaponMsg.C2S_Undress_24507 msg, String source) {
      HeroDao heroDao = this.getHeroDao(msg.getHeroCode());
      if (null == heroDao) {
         return this.player.failure(4100);
      } else {
         ExclusiveWeaponItem weaponItem = (ExclusiveWeaponItem)heroDao.exclusiveWeaponMap.get(msg.getPos().getNumber());
         if (null == weaponItem) {
            return this.player.failure(76235);
         } else {
            boolean undressAndAddItem = this.undressAndAddItem(msg.getHeroCode(), msg.getPos().getNumber(), false);
            if (!undressAndAddItem) {
               return this.player.failure(76240);
            } else {
               if (msg.getPos().getNumber() == 34) {
                  this.undressAndAddItem(msg.getHeroCode(), 35, false);
                  this.undressAndAddItem(msg.getHeroCode(), 36, false);
                  heroDao.soulSkill.clear();
               } else {
                  this.checkAndDelSoulSkill(heroDao);
               }

               this.updateHeroWeaponAndFlush(msg.getHeroCode());
               ExclusiveWeaponMsg.S2C_Undress_24508.Builder resp = ExclusiveWeaponMsg.S2C_Undress_24508.newBuilder();
               this.player.sendMsg(resp.build());
               return true;
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Lock_24519(ExclusiveWeaponMsg.C2S_Lock_24519 msg, String source) {
      ExclusiveWeaponItem exclusiveWeaponItem = this.getExclusiveWeaponItem(msg.getWearStatus());
      if (null == exclusiveWeaponItem) {
         return this.player.failure(76235);
      } else {
         if (msg.getType() > 0) {
            if (exclusiveWeaponItem.isLock) {
               return this.player.failure(6);
            }

            exclusiveWeaponItem.isLock = true;
         } else {
            if (!exclusiveWeaponItem.isLock) {
               return this.player.failure(6);
            }

            exclusiveWeaponItem.isLock = false;
         }

         this.updateWeaponItem(msg.getWearStatus());
         ExclusiveWeaponMsg.S2C_Lock_24520.Builder resp = ExclusiveWeaponMsg.S2C_Lock_24520.newBuilder();
         this.player.sendMsg(resp.build());
         return true;
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Decompose_24511(ExclusiveWeaponMsg.C2S_Decompose_24511 msg, String source) {
      if (!this.player.isSystemOpen(6613)) {
         return this.player.failure(21);
      } else {
         List<Integer> itemCodeList = this.intDistinct(msg.getItemCodeList());
         int ewDecomposeMax = this.configManager.getIntDefault("ewDecomposeMax", 20);
         if (itemCodeList.size() > 0 && itemCodeList.size() <= ewDecomposeMax) {
            List<ResourceModel> lvAndDecResetReward = new ArrayList();
            List<ExclusiveWeaponItem> allStarResetReward = new ArrayList();
            StringBuilder decItemIdStr = new StringBuilder();
            decItemIdStr.append("分解的幻武道具id:");
            Iterator itemBagPartITE = itemCodeList.iterator();

            while(true) {
               if (itemBagPartITE.hasNext()) {
                  Integer itemCode = (Integer)itemBagPartITE.next();
                  ExclusiveWeaponItem weaponItemFromBag = this.getWeaponItemFromBag(itemCode);
                  if (null == weaponItemFromBag) {
                     return this.player.failure(76235);
                  }

                  if (weaponItemFromBag.isLock) {
                     return this.player.failure(76243);
                  }

                  ExclusiveWeaponStarLvModel starLvModel = EWeaponDefine.getExclusiveWeaponStarLvModel(weaponItemFromBag.recQuality());
                  if (null == starLvModel) {
                     return this.player.failure(37);
                  }

                  if (starLvModel.getIsExchange() >= 0 && starLvModel.getExchangeMaterial().size() >= 3) {
                     decItemIdStr.append(weaponItemFromBag.id + ",");
                     ArrayList<Integer> exchangeMaterial = starLvModel.getExchangeMaterial();
                     ResourceModel decReward = new ResourceModel((Integer)exchangeMaterial.get(0), (Integer)exchangeMaterial.get(1), (Integer)exchangeMaterial.get(2));
                     decReward.addResourceToList(lvAndDecResetReward);
                     if (weaponItemFromBag.canLvReset()) {
                        ResourceModel resetReward = weaponItemFromBag.recLvResetReward();
                        resetReward.addResourceToList(lvAndDecResetReward);
                     }

                     if (weaponItemFromBag.canStarReset()) {
                        List<ExclusiveWeaponItem> starResetReward = weaponItemFromBag.recStarResetReward();
                        allStarResetReward.addAll(starResetReward);
                     }
                     continue;
                  }

                  return this.player.failure(76244);
               }

               ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
               itemBagPart.deleteItemByCodes(itemCodeList, this.getLogModule(), 14406, 0, 0, "");
               this.addResourceAndWeaponItem(lvAndDecResetReward, allStarResetReward, this.getLogModule(), 14406, true);
               StringBuilder decReturnStr = new StringBuilder();
               decReturnStr.append("幻武分解返还:");

               for(ResourceModel r : lvAndDecResetReward) {
                  decReturnStr.append(r.getType() + "-" + r.getId() + "-" + r.getValue() + ",");
               }

               for(ExclusiveWeaponItem ewItem : allStarResetReward) {
                  decReturnStr.append("2-" + ewItem.id + "-" + ewItem.getNum() + ",");
               }

               this.player.getOperationMgr().addExtraLog(this.player, 231, decItemIdStr.toString(), decReturnStr.toString());
               ExclusiveWeaponMsg.S2C_Decompose_24512.Builder resp = ExclusiveWeaponMsg.S2C_Decompose_24512.newBuilder();
               this.player.sendMsg(resp.build());
               return true;
            }
         } else {
            return this.player.failure(6);
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Inherit_24513(ExclusiveWeaponMsg.C2S_Inherit_24513 msg, String source) {
      return this.player.failure(6);
   }

   @MsgHandlerAnno
   public boolean C2S_Reset_24515(ExclusiveWeaponMsg.C2S_Reset_24515 msg, String source) {
      ExclusiveWeaponItem weaponItem = this.getExclusiveWeaponItem(msg.getWearStatus());
      if (null == weaponItem) {
         return this.player.failure(76235);
      } else if (weaponItem.isLock) {
         return this.player.failure(76243);
      } else {
         ExclusiveWeaponBaseModel baseModel = EWeaponDefine.getExclusiveWeaponBaseModel(weaponItem.id);
         if (null == baseModel) {
            return this.player.failure(37);
         } else {
            StringBuilder resetReturnItemStr = new StringBuilder();
            if (msg.getType() == 1) {
               if (!weaponItem.canLvReset()) {
                  return this.player.failure(76246);
               }

               ResourceModel lvResetReward = weaponItem.recLvResetReward();
               resetReturnItemStr.append(lvResetReward.getType() + "-" + lvResetReward.getId() + "-" + lvResetReward.getValue() + ",");
               weaponItem.level = 0;
               weaponItem.exp = 0;
               this.updateWeaponItem(msg.getWearStatus());
               this.player.addResource(lvResetReward, PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getLogModule(), 14408, 0, 0, "");
            } else if (msg.getType() == 2) {
               if (!weaponItem.canStarReset()) {
                  return this.player.failure(76247);
               }

               List<ExclusiveWeaponItem> starResetReward = weaponItem.recStarResetReward();

               for(ExclusiveWeaponItem ewItem : starResetReward) {
                  resetReturnItemStr.append("2-" + ewItem.id + "-" + ewItem.getNum() + ",");
               }

               weaponItem.setStarId(baseModel.getUpStarId());
               this.updateWeaponItem(msg.getWearStatus());
               this.addResourceAndWeaponItem((List)null, starResetReward, this.getLogModule(), 14408, true);
            } else {
               if (msg.getType() != 3) {
                  return this.player.failure(6);
               }

               if (!weaponItem.canLvReset() && !weaponItem.canStarReset()) {
                  return this.player.failure(6);
               }

               ResourceModel lvResetReward = weaponItem.recLvResetReward();
               List<ExclusiveWeaponItem> starResetReward = weaponItem.recStarResetReward();
               weaponItem.level = 0;
               weaponItem.exp = 0;
               weaponItem.setStarId(baseModel.getUpStarId());
               List<ResourceModel> lvResetRewardList = new ArrayList();
               if (null != lvResetReward) {
                  lvResetRewardList.add(lvResetReward);
                  resetReturnItemStr.append(lvResetReward.getType() + "-" + lvResetReward.getId() + "-" + lvResetReward.getValue() + ",");
               }

               for(ExclusiveWeaponItem ewItem : starResetReward) {
                  resetReturnItemStr.append("2-" + ewItem.id + "-" + ewItem.getNum() + ",");
               }

               this.addResourceAndWeaponItem(lvResetRewardList, starResetReward, this.getLogModule(), 14408, true);
            }

            if (msg.getWearStatus().getStatus() > 0 && msg.getWearStatus().getPos().getNumber() == 34) {
               this.undressAndAddItem(msg.getWearStatus().getHeroCode(), 35, false);
               this.undressAndAddItem(msg.getWearStatus().getHeroCode(), 36, false);
               HeroDao heroDao = this.getHeroDao(msg.getWearStatus().getHeroCode());
               heroDao.soulSkill.clear();
            }

            this.updateWeaponItem(msg.getWearStatus());
            this.player.getOperationMgr().addExtraLog(this.player, 228, "幻武id:" + weaponItem.id, "幻武重置返还的材料:" + resetReturnItemStr.toString());
            ExclusiveWeaponMsg.S2C_Reset_24516.Builder resp = ExclusiveWeaponMsg.S2C_Reset_24516.newBuilder();
            this.player.sendMsg(resp.build());
            return true;
         }
      }
   }

   public void addResourceAndWeaponItem(List<ResourceModel> resourceModelList, List<ExclusiveWeaponItem> exclusiveWeaponItemList, int logModule, int logReason, boolean sendResourceMsg) {
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      PlayerMsg.ShowType showType = sendResourceMsg ? PlayerMsg.ShowType.SHOW_TYPE_COMMON : PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW;
      if (exclusiveWeaponItemList != null && exclusiveWeaponItemList.size() > 0) {
         for(ExclusiveWeaponItem weaponItem : exclusiveWeaponItemList) {
            ExclusiveWeaponItem addItem = itemBagPart.addExclusiveWeaponItem(weaponItem, logModule, logReason, 0, 0, "");
            if (null != addItem) {
               this.player.additemUpdateBuilder(addItem);
               CommonMsg.ItemInfo.Builder itemInfoBuilder = CommonMsg.ItemInfo.newBuilder();
               itemInfoBuilder.setType(2);
               itemInfoBuilder.setId(addItem.id);
               itemInfoBuilder.setNum(1);
               itemInfoBuilder.setCode(addItem.code);
               itemInfoBuilder.setStar(addItem.recStarLv());
               this.player.addResourceMsgByBuilder(itemInfoBuilder);
            }
         }
      }

      if (resourceModelList != null && resourceModelList.size() > 0) {
         this.player.addResource(resourceModelList, showType, logModule, logReason, 0, 0, "");
      } else {
         this.player.senditemUpdateMsg();
         this.player.sendResourceMsg();
      }

   }

   public boolean undressAndAddItem(int heroCode, int pos, boolean sendResourceMsg) {
      HeroDao heroDao = this.getHeroDao(heroCode);
      if (null == heroDao) {
         return false;
      } else {
         ExclusiveWeaponItem curWeaponItem = (ExclusiveWeaponItem)heroDao.exclusiveWeaponMap.get(pos);
         if (null != curWeaponItem) {
            ExclusiveWeaponItem addCurWeaponItem = this.addExclusiveWeaponItem(curWeaponItem, this.getLogModule(), 14405, sendResourceMsg);
            if (null == addCurWeaponItem) {
               this.logger.error("addExclusiveWeaponItem 添加专属幻武道具异常 heroCode:{} pos:{}", heroCode, pos);
               return false;
            }
         }

         heroDao.exclusiveWeaponMap.remove(pos);
         heroDao.updateOp();
         return true;
      }
   }

   public void checkAndDelSoulSkill(HeroDao heroDao) {
      if (null != heroDao) {
         List<Integer> unlockSoulSkillSlot = EWeaponDefine.getUnlockSoulSkillSlot(heroDao.exclusiveWeaponMap);
         Iterator<Map.Entry<Integer, Integer>> iterator = heroDao.soulSkill.entrySet().iterator();

         while(iterator.hasNext()) {
            Map.Entry<Integer, Integer> next = (Map.Entry)iterator.next();
            int slot = (Integer)next.getKey();
            if (!unlockSoulSkillSlot.contains(slot)) {
               iterator.remove();
            }
         }

         ExclusiveWeaponItem mainWeaponItem = (ExclusiveWeaponItem)heroDao.exclusiveWeaponMap.get(34);
         if (null == mainWeaponItem) {
            heroDao.soulSkill.clear();
         } else {
            int soulSkillSlotNum = EWeaponDefine.getSoulSkillSlotNum(mainWeaponItem.id);
            int hasSlotNum = heroDao.soulSkill.size();
            if (hasSlotNum > soulSkillSlotNum) {
               for(Iterator<Map.Entry<Integer, Integer>> iterator2 = heroDao.soulSkill.entrySet().iterator(); iterator2.hasNext() && hasSlotNum > soulSkillSlotNum; --hasSlotNum) {
                  iterator2.remove();
               }
            }
         }

         heroDao.updateOp();
      }
   }

   @MsgHandlerAnno
   public boolean C2S_LearnSoulSkill_24517(ExclusiveWeaponMsg.C2S_LearnSoulSkill_24517 msg, String source) {
      if (!this.player.isSystemOpen(6612)) {
         return this.player.failure(21);
      } else {
         List<Integer> soulSkill = EWeaponDefine.getSoulSkill();
         if (msg.getSkillId() > 0 && !soulSkill.contains(msg.getSkillId())) {
            return this.player.failure(76241);
         } else {
            HeroDao heroDao = this.getHeroDao(msg.getHeroCode());
            if (null == heroDao) {
               return this.player.failure(4100);
            } else {
               ExclusiveWeaponItem mainWeaponItem = (ExclusiveWeaponItem)heroDao.exclusiveWeaponMap.get(34);
               if (null == mainWeaponItem) {
                  return this.player.failure(76238);
               } else {
                  List<Integer> unlockSoulSkillSlot = EWeaponDefine.getUnlockSoulSkillSlot(heroDao.exclusiveWeaponMap);
                  if (!unlockSoulSkillSlot.contains(msg.getSlot())) {
                     return this.player.failure(76242);
                  } else {
                     if (msg.getSkillId() <= 0) {
                        if (!heroDao.soulSkill.containsKey(msg.getSlot())) {
                           return this.player.failure(6);
                        }

                        heroDao.soulSkill.remove(msg.getSlot());
                     } else {
                        Collection<Integer> soulSkillIds = heroDao.soulSkill.values();
                        if (soulSkillIds.contains(msg.getSkillId())) {
                           return this.player.failure(76249);
                        }

                        heroDao.soulSkill.put(msg.getSlot(), msg.getSkillId());
                        int soulSkillSlotNum = EWeaponDefine.getSoulSkillSlotNum(mainWeaponItem.id);
                        if (heroDao.soulSkill.size() > soulSkillSlotNum) {
                           heroDao.soulSkill.remove(msg.getSlot());
                           return this.player.failure(76242);
                        }
                     }

                     this.updateHeroWeaponAndFlush(msg.getHeroCode());
                     StringBuilder mainLogStr = new StringBuilder();
                     ExclusiveWeaponItem mainEw = (ExclusiveWeaponItem)heroDao.exclusiveWeaponMap.get(34);
                     mainLogStr.append("主幻武id:").append(mainEw.id).append("-").append("主幻武等级:").append(mainEw.level).append("-").append("主幻武星级:").append(mainEw.recStarLv()).append(";");
                     StringBuilder soulSkillStr = new StringBuilder();
                     soulSkillStr.append("幻灵技能id:");

                     for(Map.Entry<Integer, Integer> entry : heroDao.soulSkill.entrySet()) {
                        Integer skillId = (Integer)entry.getValue();
                        soulSkillStr.append(skillId).append(",");
                     }

                     this.player.getOperationMgr().addExtraLog(this.player, 230, mainLogStr.toString(), soulSkillStr.toString());
                     ExclusiveWeaponMsg.S2C_LearnSoulSkill_24518.Builder resp = ExclusiveWeaponMsg.S2C_LearnSoulSkill_24518.newBuilder();
                     this.player.sendMsg(resp.build());
                     return true;
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_UnlockLibraryInfo_24509(ExclusiveWeaponMsg.C2S_UnlockLibraryInfo_24509 msg, String source) {
      this.sendUnlockLibraryInfo();
   }

   public void sendUnlockLibraryInfo() {
      ExclusiveWeaponMsg.S2C_UnlockLibraryInfo_24510.Builder resp = ExclusiveWeaponMsg.S2C_UnlockLibraryInfo_24510.newBuilder();
      ExclusiveWeaponDao dao = this.getDao();
      resp.addAllWeaponIdStar(this.toBuildWeaponStarLv(dao.historyWeaponIdStar));
      resp.addAllWeaponLib(this.toBuildWeaponStarLv(dao.weaponLib));
      this.player.sendMsg(resp.build());
   }

   public List<CommonMsg.MapDataII> toBuildWeaponStarLv(Map<Integer, Integer> weaponStarLv) {
      List<CommonMsg.MapDataII> weaponStarLvList = new ArrayList();
      if (null != weaponStarLv && !weaponStarLv.isEmpty()) {
         for(Map.Entry<Integer, Integer> entry : weaponStarLv.entrySet()) {
            Integer weaponId = (Integer)entry.getKey();
            Integer starLv = (Integer)entry.getValue();
            CommonMsg.MapDataII.Builder mapData = CommonMsg.MapDataII.newBuilder();
            mapData.setKey(weaponId);
            mapData.setValue(starLv);
            weaponStarLvList.add(mapData.build());
         }

         return weaponStarLvList;
      } else {
         return weaponStarLvList;
      }
   }

   public void addWeaponStarLv(int weaponId, int starLv) {
      ExclusiveWeaponDao dao = this.getDao();
      Integer curStarLv = (Integer)dao.historyWeaponIdStar.get(weaponId);
      if (null == curStarLv || curStarLv < starLv) {
         dao.historyWeaponIdStar.put(weaponId, starLv);
         dao.updateOp();
         this.sendUnlockLibraryInfo();
      }

   }

   @MsgHandlerAnno
   public boolean C2S_WeaponLibStarUp_24525(ExclusiveWeaponMsg.C2S_WeaponLibStarUp_24525 msg, String source) {
      if (!this.player.isSystemOpen(6614)) {
         return this.player.failure(21);
      } else {
         ExclusiveWeaponLibraryModel nextLibraryModel = EWeaponDefine.getLibraryModel(msg.getWeaponId(), msg.getStar());
         if (nextLibraryModel == null) {
            return this.player.failure(37);
         } else {
            ExclusiveWeaponDao dao = this.getDao();
            Integer historyMaxStarLv = (Integer)dao.historyWeaponIdStar.get(msg.getWeaponId());
            if (historyMaxStarLv != null && msg.getStar() <= historyMaxStarLv) {
               Integer libStarLv = (Integer)dao.weaponLib.get(msg.getWeaponId());
               if (null == libStarLv && msg.getStar() != EWeaponDefine.getLibraryInitStarLv(msg.getWeaponId())) {
                  return this.player.failure(76250);
               } else {
                  if (null != libStarLv) {
                     ExclusiveWeaponLibraryModel curLibraryModel = EWeaponDefine.getLibraryModel(msg.getWeaponId(), libStarLv);
                     if (null == curLibraryModel) {
                        return this.player.failure(37);
                     }

                     if (curLibraryModel.getNextId() != nextLibraryModel.getId()) {
                        return this.player.failure(6);
                     }
                  }

                  dao.weaponLib.put(msg.getWeaponId(), msg.getStar());
                  dao.updateOp();
                  HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                  heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_EXCLUSIVE_WEAPON_LIB);
                  ExclusiveWeaponMsg.S2C_WeaponLibStarUp_24526.Builder resp = ExclusiveWeaponMsg.S2C_WeaponLibStarUp_24526.newBuilder();
                  resp.addAllWeaponIdStar(this.toBuildWeaponStarLv(dao.historyWeaponIdStar));
                  resp.addAllWeaponLib(this.toBuildWeaponStarLv(dao.weaponLib));
                  this.player.sendMsg(resp.build());
                  return true;
               }
            } else {
               return this.player.failure(76250);
            }
         }
      }
   }

   public ExclusiveWeaponItem addExclusiveWeaponItem(ExclusiveWeaponItem data, int module, int reason, boolean sendResourceMsg) {
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      ExclusiveWeaponItem weaponItem = itemBagPart.addExclusiveWeaponItem(data, module, reason, 0, 0, "");
      if (null != weaponItem) {
         this.updateBagWeaponItem(weaponItem.code);
         if (sendResourceMsg) {
            this.player.addResourceMsg(weaponItem);
            this.player.sendResourceMsg();
         }
      }

      return weaponItem;
   }

   public List<Integer> getStarUpRealCostCodes(int starId, List<Integer> costItemCodeList) {
      if (starId > 0 && costItemCodeList != null && !costItemCodeList.isEmpty()) {
         ExclusiveWeaponUpStarModel starModel = EWeaponDefine.getExclusiveWeaponUpStarModel(starId);
         if (null == starModel) {
            return null;
         } else {
            Map<Integer, Map<Integer, Set<Integer>>> quality_id_codes = new HashMap();

            for(Integer itemCode : costItemCodeList) {
               ExclusiveWeaponItem weaponItemFromBag = this.getWeaponItemFromBag(itemCode);
               if (null != weaponItemFromBag) {
                  int weaponId = weaponItemFromBag.id;
                  ExclusiveWeaponBaseModel exclusiveWeaponBaseModel = EWeaponDefine.getExclusiveWeaponBaseModel(weaponId);
                  if (null != exclusiveWeaponBaseModel) {
                     int quality = exclusiveWeaponBaseModel.getQuality();
                     ((Set)((Map)quality_id_codes.computeIfAbsent(quality, (k) -> new HashMap())).computeIfAbsent(weaponId, (k) -> new HashSet())).add(itemCode);
                  }
               }
            }

            List<Integer> realCostCodes = new ArrayList();
            ArrayList<NeedItemsFun2> needCostItemFunList = new ArrayList();
            if (starModel.getItemId() > 0) {
               NeedItemsFun2 mainNeedItemsFun = new NeedItemsFun2(starModel.getItemId(), starModel.getItemStar(), starModel.getItemNum());
               needCostItemFunList.add(mainNeedItemsFun);
            }

            ExclusiveWeaponStarLibModel starLibModel = EWeaponDefine.getExclusiveWeaponStarLibModel(starModel.getLibId());
            if (null != starLibModel) {
               needCostItemFunList.addAll(starLibModel.getNeedItemsFun());
            }

            for(NeedItemsFun2 needItemsFun : needCostItemFunList) {
               int needType = needItemsFun.getType();
               int needStar = needItemsFun.getStar();
               int needNum = needItemsFun.getNum();
               if (needType > 10 && needNum > 0) {
                  ExclusiveWeaponBaseModel exclusiveWeaponBaseModel = EWeaponDefine.getExclusiveWeaponBaseModel(needType);
                  int quality = exclusiveWeaponBaseModel.getQuality();
                  int weaponId = exclusiveWeaponBaseModel.getWeaponId();
                  Map<Integer, Set<Integer>> weaponId_codes = (Map)quality_id_codes.get(quality);
                  if (null == weaponId_codes) {
                     return null;
                  }

                  Set<Integer> codes = (Set)weaponId_codes.get(weaponId);
                  if (null == codes || codes.isEmpty()) {
                     return null;
                  }

                  for(Integer code : codes) {
                     if (needNum <= 0) {
                        break;
                     }

                     ExclusiveWeaponItem weaponItemFromBag = this.getWeaponItemFromBag(code);
                     if (null == weaponItemFromBag) {
                        return null;
                     }

                     int starLv = weaponItemFromBag.recStarLv();
                     if (starLv == needStar) {
                        realCostCodes.add(code);
                        --needNum;
                     }
                  }

                  codes.removeAll(realCostCodes);
                  if (needNum > 0) {
                     return null;
                  }
               }
            }

            for(NeedItemsFun2 needItemsFun : needCostItemFunList) {
               int needType = needItemsFun.getType();
               int needStar = needItemsFun.getStar();
               int needNum = needItemsFun.getNum();
               if (needType <= 10 && needNum > 0) {
                  Map<Integer, Set<Integer>> weaponId_codes = (Map)quality_id_codes.get(needType);
                  if (null == weaponId_codes) {
                     return null;
                  }

                  label106:
                  for(Map.Entry<Integer, Set<Integer>> weaponId_codesEntry : weaponId_codes.entrySet()) {
                     Set<Integer> codes = (Set)weaponId_codesEntry.getValue();

                     for(Integer code : codes) {
                        if (needNum <= 0) {
                           break label106;
                        }

                        ExclusiveWeaponItem weaponItemFromBag = this.getWeaponItemFromBag(code);
                        if (null == weaponItemFromBag) {
                           return null;
                        }

                        int starLv = weaponItemFromBag.recStarLv();
                        if (starLv == needStar) {
                           realCostCodes.add(code);
                           --needNum;
                        }
                     }

                     codes.removeAll(realCostCodes);
                  }

                  if (needNum > 0) {
                     return null;
                  }
               }
            }

            return realCostCodes;
         }
      } else {
         return null;
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

   public List<Integer> getNoticeUnlockIdList() {
      ExclusiveWeaponDao dao = this.getDao();
      if (dao.unlockNoticeIds.isEmpty()) {
         return new ArrayList();
      } else {
         List<Integer> unlockNoticeIdList = (List)dao.unlockNoticeIds.stream().sorted((o1, o2) -> o1 - o2).collect(Collectors.toList());
         return unlockNoticeIdList;
      }
   }

   public boolean isNoticeAllUnlock() {
      ExclusiveWeaponDao dao = this.getDao();
      Map<Integer, ExclusiveWeaponNoticeModel> modelMap = ApplicationContextProvider.<Integer, ExclusiveWeaponNoticeModel>getModelPoolMap("ExclusiveWeaponNotice");
      return dao.unlockNoticeIds.size() >= modelMap.size();
   }

   @MsgHandlerAnno
   public boolean C2S_NoticeInfo_24521(ExclusiveWeaponMsg.C2S_NoticeInfo_24521 msg, String source) {
      this.sendNoticeInfo();
      return true;
   }

   public void sendNoticeInfo() {
      ExclusiveWeaponMsg.S2C_NoticeInfo_24522.Builder resp = ExclusiveWeaponMsg.S2C_NoticeInfo_24522.newBuilder();
      resp.addAllUnlockId(this.getNoticeUnlockIdList());
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public boolean C2S_NoticePointUnlock_24523(ExclusiveWeaponMsg.C2S_NoticePointUnlock_24523 msg, String source) {
      if (!this.player.isSystemOpen(6630)) {
         return this.player.failure(21);
      } else {
         List<Integer> noticeUnlockIdList = this.getNoticeUnlockIdList();
         int nextId = 1;
         if (noticeUnlockIdList.size() > 0) {
            int maxId = (Integer)noticeUnlockIdList.get(noticeUnlockIdList.size() - 1);
            ExclusiveWeaponNoticeModel maxNoticeModel = EWeaponDefine.getNoticeModel(maxId);
            if (null == maxNoticeModel) {
               this.logger.error("ExclusiveWeaponNotice 配置有误 id:{}", maxId);
               return this.player.failure(37);
            }

            nextId = maxNoticeModel.getNextId();
         }

         if (nextId <= 0) {
            return this.player.failure(76248);
         } else {
            ExclusiveWeaponNoticeModel noticeModel = EWeaponDefine.getNoticeModel(nextId);
            if (null == noticeModel) {
               this.logger.error("ExclusiveWeaponNotice 配置有误 id:{}", nextId);
               return this.player.failure(37);
            } else if (this.player.getPlayerDao().lv < noticeModel.getUnlockLv()) {
               return this.player.failure(20);
            } else {
               ExclusiveWeaponDao dao = this.getDao();
               dao.unlockNoticeIds.add(nextId);
               dao.updateOp();
               this.player.addResource(noticeModel.getItems(), PlayerMsg.ShowType.SHOW_EW_NOTICE_UNLOCK, this.getLogModule(), 14409, 0, 0, "");
               if (this.isNoticeAllUnlock()) {
                  this.player.triggerTask(735, 0, 1L, 0);
                  AncientSwordPart part = (AncientSwordPart)this.player.getMgrPart(AncientSwordPart.class);
                  part.initialMonster();
               }

               ExclusiveWeaponMsg.S2C_NoticePointUnlock_24524.Builder resp = ExclusiveWeaponMsg.S2C_NoticePointUnlock_24524.newBuilder();
               resp.addAllUnlockId(this.getNoticeUnlockIdList());
               this.player.sendMsg(resp.build());
               return true;
            }
         }
      }
   }
}
