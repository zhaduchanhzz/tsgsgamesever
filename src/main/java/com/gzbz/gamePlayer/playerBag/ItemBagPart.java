package com.gzbz.gamePlayer.playerBag;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import cn.hutool.core.collection.CollectionUtil;
import com.gzbz.activity.part.ActGoldWeekPart;
import com.gzbz.activity.part.ActivityChineseNewYearPart;
import com.gzbz.activity.part.AnniversaryCelebrationPart;
import com.gzbz.activity.part.GuoQingActivityPart;
import com.gzbz.activity.part.SplendidCityPart;
import com.gzbz.db.HeroArchiveDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.ItemBagDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.TongqueTerraceDao;
import com.gzbz.exclusiveWeapon.bean.ExclusiveWeaponItem;
import com.gzbz.exclusiveWeapon.part.ExclusiveWeaponPart;
import com.gzbz.gameCache.PlayerItemResetCustomCache;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.CodeDefine;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.LogDefine;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.battle.BattleChapterPart;
import com.gzbz.gamePlayer.heroAide.HeroAidePart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroUpgradePart;
import com.gzbz.gamePlayer.horse.WarHorse;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.monarch.MonarchPart;
import com.gzbz.gamePlayer.playerBag.bean.PlayerBagExtend;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.gamePlayer.tongque.TongqueTerracePart;
import com.gzbz.gift.GiftPart;
import com.gzbz.godBeast.bean.GodBeastItem;
import com.gzbz.godBeast.bean.NeiDanItem;
import com.gzbz.log.ItemLog;
import com.gzbz.log.LogMgr;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.AideLevelModel;
import com.gzbz.model.BagTypeModel;
import com.gzbz.model.BoxAwardModel;
import com.gzbz.model.BoxModel;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.ChapterFastBattleModel;
import com.gzbz.model.ChatBubbleModel;
import com.gzbz.model.CommonBuyModel;
import com.gzbz.model.DropOutModel;
import com.gzbz.model.EquipExtraSixModel;
import com.gzbz.model.ExchangeModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.LanguageModel;
import com.gzbz.model.MedalModel;
import com.gzbz.model.RechargeModel;
import com.gzbz.model.RuneMainModel;
import com.gzbz.model.SelectPackageModel;
import com.gzbz.model.ShopLimitModel;
import com.gzbz.model.SpecialAwardModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.WarHorseBaseModel;
import com.gzbz.model.WuDaoDateModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.BagMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.recharge.part.PlayerRechargePart;
import com.gzbz.rune.bean.RuneItem;
import com.gzbz.rune.bean.RuneRefineInheritItem;
import com.gzbz.rune.part.RunePart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.supremePvp.part.SupremePvpPart;
import com.gzbz.worldMgr.WorldMgr;
import java.sql.Timestamp;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import misc.DateUtil;
import misc.MapUtil;
import misc.RandomUtil;
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
public class ItemBagPart extends PlayerPart {
   Logger logger = LoggerFactory.getLogger(ItemBagPart.class);
   public static final String HERO_EXCHANGE_CHIP_NUM = "heroExchangeChipNum";
   public static final String AIDE_EXCHANGE = "aideExchange";
   public static final String STONE_EXCHANGE = "stoneSynthesisNum";
   public static final int BAG_FULL_NOTICE_ID = 131;
   @Autowired
   ConfigManager configManager;

   @MsgHandlerAnno
   public void msgRequestData(BagMsg.C2S_ItemDatas_3003 msg, String source) {
      int subclass = msg.getSubclass();
      this.sendBagData(subclass);
   }

   @MsgHandlerAnno
   public void useItem(BagMsg.C2S_ItemUse_3007 msg, String source) {
      int code = msg.getCode();
      int num = msg.getNum();
      boolean result = this.handleUseItem(code, num);
      BagMsg.S2C_ItemUse_3008.Builder builder = BagMsg.S2C_ItemUse_3008.newBuilder();
      builder.setResult(result ? 1 : 0);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void sellItem(BagMsg.C2S_ItemSell_3009 msg, String source) {
      int code = msg.getCode();
      int num = msg.getNum();
      boolean result = this.handleSellItem(code, num);
      BagMsg.S2C_ItemSell_3010.Builder builder = BagMsg.S2C_ItemSell_3010.newBuilder();
      builder.setResult(result ? 1 : 0);
      this.player.sendMsg(builder.build());
      this.player.updateGuideStep(msg.getGuideStep());
   }

   @MsgHandlerAnno
   public boolean OneKeyComposeHero(BagMsg.C2S_OneKeyItemCompose_3035 msg, String source) {
      HashMap<Integer, Integer> mapExchangeChip = this.configManager.getIntMap("heroExchangeChipNum");
      BagMsg.S2C_OneKeyItemCompose_3036.Builder builder = BagMsg.S2C_OneKeyItemCompose_3036.newBuilder();
      builder.setResult(0);
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      BagParent bag = itemBagDao.getBagBySublass(3);
      Map<Integer, ItemBase> map = bag.getMap();
      if (!map.isEmpty()) {
         Integer totalComposeNum = 0;
         int emptyGridNum = heroBagPart.getEmptyGridNumber();

         for(int star = 5; star >= 3; --star) {
            boolean bagNumLimit = false;
            Map<Integer, Integer> composeMap = new ConcurrentHashMap();

            for(ItemBase itemBase : map.values()) {
               ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", itemBase.id);
               if (itemModel != null && itemModel.getStar() == star && itemModel.getSubclass() == 3) {
                  int chipNeedNum = (Integer)mapExchangeChip.getOrDefault(Integer.valueOf(itemModel.getStar()), 0);
                  if (itemBase.num >= chipNeedNum) {
                     Integer composeNum = itemBase.num / chipNeedNum;
                     totalComposeNum = totalComposeNum + composeNum;
                     if (totalComposeNum > emptyGridNum) {
                        composeNum = composeNum - (totalComposeNum - emptyGridNum);
                        bagNumLimit = true;
                     }

                     if (composeNum <= 0) {
                        break;
                     }

                     MapUtil.computeIfAbsent(composeMap, itemBase.code, composeNum);
                  }
               }
            }

            for(Map.Entry<Integer, Integer> entry : composeMap.entrySet()) {
               Integer code = (Integer)entry.getKey();
               Integer composeNum = (Integer)entry.getValue();
               int ret = this.OnComposeHero(code, composeNum, true);
               if (4124 == ret) {
                  bagNumLimit = true;
                  break;
               }

               if (0 == ret) {
                  builder.setResult(1);
               }
            }

            if (bagNumLimit) {
               this.player.failure(4124);
               break;
            }
         }
      }

      this.player.sendMsg(builder.build());
      this.player.sendResourceMsg_OneKeyTakeMail();
      return true;
   }

   @MsgHandlerAnno
   public boolean composeHero(BagMsg.C2S_ItemCompose_3011 msg, String source) {
      int num = msg.getNum();
      int code = msg.getCode();
      if (num <= 0) {
         return false;
      } else {
         ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
         ItemBase itemBase = itemBagDao.getItemByCode(code);
         if (itemBase == null) {
            return false;
         } else {
            ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", itemBase.id);
            if (itemModel == null) {
               return false;
            } else {
               if (itemModel.getUseFuncType() == 31) {
                  if (ResourceModel.checkTotalNumError(itemModel.getUseFuncValue(), num)) {
                     return false;
                  }

                  if (!this.player.checkResourceNum(2, itemBase.id, itemModel.getUseFuncValue() * num)) {
                     LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "NotEnough");
                     String errorStr = languageModel.getValue();
                     this.player.failure(53, MessageFormat.format(errorStr, itemModel.getName()));
                     return false;
                  }

                  this.player.delResource(2, itemBase.id, (long)(itemModel.getUseFuncValue() * num), 2, 203, itemBase.id, num, "code:" + code);
                  this.player.addResource(2, itemModel.getUseFuncId(), num, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 2, 203, itemBase.id, num, "code:" + code);
               } else if (itemModel.getUseFuncType() == 32) {
                  TongqueTerracePart tongqueTerracePart = (TongqueTerracePart)this.player.getMgrPart(TongqueTerracePart.class);
                  TongqueTerraceDao tongqueTerraceDao = tongqueTerracePart.getTongqueTerraceDao(itemModel.getUseFuncId());
                  if (tongqueTerraceDao != null && tongqueTerraceDao.state == 2) {
                     return false;
                  }

                  num = 1;
                  if (ResourceModel.checkTotalNumError(itemModel.getUseFuncValue(), num)) {
                     return false;
                  }

                  if (!this.player.checkResourceNum(2, itemBase.id, itemModel.getUseFuncValue() * num)) {
                     LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "NotEnough");
                     String errorStr = languageModel.getValue();
                     this.player.failure(53, MessageFormat.format(errorStr, itemModel.getName()));
                     return false;
                  }

                  this.player.delResource(2, itemBase.id, (long)(itemModel.getUseFuncValue() * num), 2, 203, itemBase.id, num, "code:" + code);
                  this.player.addResource(2, itemModel.getUseFuncId(), num, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 2, 203, itemBase.id, num, "code:" + code);
               } else {
                  int ret = this.OnComposeHero(code, num, false);
                  if (ret > 0) {
                     return this.player.failure(ret);
                  }

                  if (ret < 0) {
                     return false;
                  }
               }

               BagMsg.S2C_ItemCompose_3012.Builder builder = BagMsg.S2C_ItemCompose_3012.newBuilder();
               builder.setResult(1);
               this.player.sendMsg(builder.build());
               this.player.updateGuideStep(msg.getGuideStep());
               return true;
            }
         }
      }
   }

   public int OnComposeHero(int code, int num, boolean isOneKey) {
      if (num <= 0) {
         return 4;
      } else {
         ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
         ItemBase itemBase = itemBagDao.getItemByCode(code);
         if (itemBase == null) {
            return 2;
         } else {
            ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", itemBase.id);
            if (itemModel == null) {
               return 2;
            } else if (itemModel.getSubclass() != 3) {
               return 6;
            } else {
               HashMap<Integer, Integer> mapExchangeChip = this.configManager.getIntMap("heroExchangeChipNum");
               int chipNeedNum = (Integer)mapExchangeChip.getOrDefault(Integer.valueOf(itemModel.getStar()), 0);
               if (chipNeedNum <= 0) {
                  this.logger.info("config表 heroExchangeChipNum 配置错误");
                  return -1;
               } else if (itemModel.getUseFuncType() == 0) {
                  return 7;
               } else if (ResourceModel.checkTotalNumError(chipNeedNum, num)) {
                  return -2;
               } else if (!this.player.checkResourceNum(2, itemBase.id, chipNeedNum * num)) {
                  return 3;
               } else {
                  GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
                  List<ResourceModel> list = new ArrayList();
                  HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                  switch (itemModel.getUseFuncType()) {
                     case 13:
                        if (!heroBagPart.isEnableAddHero(num)) {
                           return 4124;
                        }

                        this.player.delResource(2, itemBase.id, (long)(chipNeedNum * num), 2, 203, itemBase.id, num, "code:" + code);
                        list.add(new ResourceModel(3, itemModel.getUseFuncId(), itemModel.getUseFuncValue() * num));
                        this.player.addResource(list, isOneKey ? PlayerMsg.ShowType.SHOW_TYPE_MAIL_OKE_KEY_TAKE : PlayerMsg.ShowType.SHOW_TYPE_COMMON, 2, 203, itemBase.id, num, "code:" + code);
                        giftPart.triggerTimeLimitGift(3, itemModel.getStar());
                        this.player.triggerTask(519, itemModel.getStar(), (long)num, 1);
                        break;
                     case 14:
                        if (!heroBagPart.isEnableAddHero(num)) {
                           return 4124;
                        }

                        PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
                        Queue<Integer> queue = (Queue)playerExtend.heroComposeRecord.computeIfAbsent(itemModel.getStar(), (v) -> new ConcurrentLinkedQueue());
                        int recordCount = Integer.parseInt(this.configManager.parseValue("heroComposeNationLimit", 0, "\\|"));
                        int appearMax = Integer.parseInt(this.configManager.parseValue("heroComposeNationLimit", 1, "\\|"));

                        while(queue.size() > recordCount) {
                           queue.poll();
                        }

                        Map<Integer, Integer> nationMap = new HashMap();
                        Set<Integer> nationFilter = new HashSet();
                        Set<Integer> filterHeroIds = new HashSet();

                        for(int i = 0; i < num; ++i) {
                           nationFilter.clear();
                           nationMap.clear();

                           for(Integer heroId : queue) {
                              HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroId);
                              if (heroModel != null) {
                                 int count = (Integer)nationMap.getOrDefault(heroModel.getNation(), 0);
                                 nationMap.put(heroModel.getNation(), count + 1);
                              }
                           }

                           for(Map.Entry<Integer, Integer> entry : nationMap.entrySet()) {
                              if ((Integer)entry.getValue() >= appearMax) {
                                 nationFilter.add(entry.getKey());
                              }
                           }

                           ResourceModel resourceModel = this.composeRandom(itemModel.getUseFuncId(), filterHeroIds, nationFilter);
                           filterHeroIds.clear();
                           if (resourceModel != null) {
                              list.add(resourceModel);
                              filterHeroIds.add(resourceModel.getId());
                              if (resourceModel.getType() == 3) {
                                 queue.add(resourceModel.getId());
                                 if (queue.size() > recordCount) {
                                    queue.poll();
                                 }
                              }
                           }
                        }

                        if (list.size() != num) {
                           this.logger.info("合成随机将符出错 code = {}, num = {}", code, num);
                           return 58103;
                        }

                        this.player.updatePlayerExtend(13);
                        giftPart.triggerTimeLimitGift(3, itemModel.getStar());
                        this.player.triggerTask(519, itemModel.getStar(), (long)num, 1);
                        this.player.delResource(2, itemBase.id, (long)(chipNeedNum * num), 2, 203, itemBase.id, num, "code:" + code);
                        this.player.addResource(list, isOneKey ? PlayerMsg.ShowType.SHOW_TYPE_MAIL_OKE_KEY_TAKE : PlayerMsg.ShowType.SHOW_TYPE_COMMON_NO_SORT, 2, 203, itemBase.id, num, "code:" + code);
                  }

                  return 0;
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void msgOpenBox(BagMsg.C2S_OpenBox_3013 msg, String source) {
      this.handleOpenBox(msg.getCode(), msg.getNum());
   }

   @MsgHandlerAnno
   public boolean C2S_OpenMultipleSelectBox_3201(BagMsg.C2S_OpenMultipleSelectBox_3201 msg, String source) {
      Map<Integer, Integer> costItemMap = new HashMap();
      List<ResourceModel> rewardFromSelectBoxList = this.getRewardFromSelectBoxList(msg.getBoxList(), costItemMap);
      if (null != rewardFromSelectBoxList && !rewardFromSelectBoxList.isEmpty()) {
         for(Map.Entry<Integer, Integer> entry : costItemMap.entrySet()) {
            Integer itemCode = (Integer)entry.getKey();
            Integer num = (Integer)entry.getValue();
            if (!this.deleteItemByCode(itemCode, num, 2, 201, 0, 0, "")) {
               this.logger.error("删除物品是出错 code:{} num:{}", itemCode, num);
               return false;
            }
         }

         this.player.addResource(rewardFromSelectBoxList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 2, 201, 0, 0, "");
         this.player.senditemUpdateMsg();
         BagMsg.S2C_OpenMultipleSelectBox_3202.Builder resp = BagMsg.S2C_OpenMultipleSelectBox_3202.newBuilder();
         resp.addAllBox(msg.getBoxList());
         this.player.sendMsg(resp.build());
         return true;
      } else {
         return false;
      }
   }

   private List<ResourceModel> getRewardFromSelectBoxList(List<BagMsg.SelectBoxInfo> selectBoxInfoList, Map<Integer, Integer> costItemMap) {
      if (selectBoxInfoList != null && !selectBoxInfoList.isEmpty() && null != costItemMap) {
         costItemMap.clear();
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         int worldLv = worldMgr.getWorldLv();
         PlayerDao playerDao = this.player.getPlayerDao();
         ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         List<ResourceModel> rewardList = new ArrayList();

         for(BagMsg.SelectBoxInfo selectBoxInfo : selectBoxInfoList) {
            int code = selectBoxInfo.getCode();
            int id = selectBoxInfo.getId();
            int num = selectBoxInfo.getNum();
            int itemCodeCount = num;
            if (costItemMap.containsKey(code)) {
               Integer curCodeCount = (Integer)costItemMap.get(code);
               itemCodeCount = num + curCodeCount;
            }

            costItemMap.put(code, itemCodeCount);
            ItemBase itemBase = this.getItemByCode(code);
            if (itemBase == null) {
               this.player.failure(2);
               return null;
            }

            if (itemBase.getNum() < 1) {
               this.player.failure(4);
               return null;
            }

            if (itemBase.getNum() < itemCodeCount || itemCodeCount <= 0) {
               this.player.failure(4);
               return null;
            }

            ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", itemBase.id);
            if (itemModel == null) {
               this.player.failure(5);
               return null;
            }

            SystemFunctionModel systemModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", itemModel.getBoxUseSystemId());
            if (null != systemModel && !this.player.isSystemOpen(systemModel.getId())) {
               this.player.failure(21);
               return null;
            }

            if (itemModel.getUseFuncType() != 12) {
               this.player.failure(7);
               return null;
            }

            SelectPackageModel selectPackageModel = (SelectPackageModel)this.player.getGameModelPool().getEntity("selectPackage", id);
            if (selectPackageModel == null) {
               this.player.failure(5);
               return null;
            }

            if (selectPackageModel.getGroup() != itemModel.getUseFuncId()) {
               this.player.failure(6);
               return null;
            }

            if (selectPackageModel.getDateStart() != 0 || selectPackageModel.getDateEnd() != 0) {
               int dateEnd = selectPackageModel.getDateEnd() == -1 ? Integer.MAX_VALUE : selectPackageModel.getDateEnd();
               int openServerDays = worldMgr.getOpenServerDays();
               if (openServerDays < selectPackageModel.getDateStart() || openServerDays > dateEnd) {
                  this.player.failure(76045);
                  return null;
               }
            }

            boolean isLvEnough = playerDao.lv >= selectPackageModel.getLvLimit() && worldLv >= selectPackageModel.getWorldlvLimit() || selectPackageModel.getLvLimitEx() > 0 && playerDao.lv >= selectPackageModel.getLvLimitEx();
            if (!isLvEnough) {
               this.player.failure(20);
               return null;
            }

            ResourceModel resourceModel = (ResourceModel)selectPackageModel.getRewards().get(0);
            if (resourceModel.getType() == 3) {
               if (!heroBagPart.isEnableAddHero(num)) {
                  this.player.failure(4124);
                  return null;
               }
            } else if (resourceModel.getType() == 2) {
               ItemModel rewardItemModel = (ItemModel)ApplicationContextProvider.getModelPool().getEntity("item", resourceModel.getId());
               if (rewardItemModel == null) {
                  this.logger.error("玩家{}自选礼包选择的物品不存在 id:{}", this.player.getPlayerId(), resourceModel.getId());
                  this.player.failure(37);
                  return null;
               }

               if (rewardItemModel.getSubclass() == 7) {
                  List<ItemBase> list = itemBagDao.getItemById(rewardItemModel.getId());
                  if (list.size() > 0) {
                     this.player.failure(76033);
                     return null;
                  }
               }
            }

            for(ResourceModel reward : selectPackageModel.getRewards()) {
               ResourceModel rm = new ResourceModel(reward.getType(), reward.getId(), reward.getValue() * num);
               rm.addResourceToList(rewardList);
            }
         }

         return rewardList;
      } else {
         this.player.failure(6);
         return null;
      }
   }

   @MsgHandlerAnno
   public void msgOpenSelectBox(BagMsg.C2S_OpenSelectBox_3015 msg, String source) {
      this.handleOpenSelectBox(msg.getCode(), msg.getId(), msg.getNum());
   }

   @MsgHandlerAnno
   public void C2S_HeroDressUse_3021(BagMsg.C2S_HeroDressUse_3021 msg, String source) {
      int itemCode = msg.getCode();
      ItemBase itembase = this.getItemByCode(itemCode);
      if (itembase == null) {
         this.player.failure(0);
      } else {
         HeroDressPart heroDressPart = (HeroDressPart)this.player.getMgrPart(HeroDressPart.class);
         ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", itembase.id);
         if (itemModel != null) {
            int result = heroDressPart.addHeroDressByUseItem(itemModel);
            if (result == 1) {
               this.deleteItemByCode(itemCode, 1, 45, 4502, 0, 0, "");
               this.player.senditemUpdateMsg();
               BagMsg.S2C_HeroDressUse_3022.Builder builder = BagMsg.S2C_HeroDressUse_3022.newBuilder();
               builder.setResult(result);
               builder.setItemId(itemModel.getId());
               this.player.sendMsg(builder.build());
            } else if (result == 45002) {
               this.deleteItemByCode(itemCode, 1, 45, 4503, 0, 0, "");
               this.player.senditemUpdateMsg();
            } else {
               this.player.failure(result);
            }

         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_ComposeRandomItem_3023(BagMsg.C2S_ComposeRandomItem_3023 msg, String source) {
      int code = msg.getCode();
      int num = msg.getNum();
      if (num <= 0) {
         return this.player.failure(4);
      } else {
         ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
         ItemBase itemBase = itemBagDao.getItemByCode(code);
         if (itemBase == null) {
            return this.player.failure(2);
         } else {
            ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", itemBase.id);
            if (itemModel == null) {
               return this.player.failure(2);
            } else if (itemModel.getUseFuncType() != 17) {
               return this.player.failure(6);
            } else {
               HashMap<Integer, Integer> mapExchangeChip = this.configManager.getIntMap("stoneSynthesisNum");
               int chipNeedNum = (Integer)mapExchangeChip.getOrDefault(itemModel.getId(), 0);
               if (chipNeedNum <= 0) {
                  this.logger.info("config表 viceExchangeChipNum 配置错误");
                  return false;
               } else if (ResourceModel.checkTotalNumError(chipNeedNum, num)) {
                  return false;
               } else if (!this.player.checkResourceNum(2, itemBase.id, chipNeedNum * num)) {
                  return this.player.failure(3);
               } else {
                  List<ResourceModel> list = new ArrayList();
                  Set<Integer> filterHeroIds = new HashSet();
                  Set<Integer> nationFilter = new HashSet();

                  for(int i = 0; i < num; ++i) {
                     ResourceModel resourceModel = this.composeRandom(itemModel.getUseFuncId(), filterHeroIds, nationFilter);
                     filterHeroIds.clear();
                     if (resourceModel != null) {
                        list.add(resourceModel);
                        filterHeroIds.add(resourceModel.getId());
                     }
                  }

                  if (list.size() != num) {
                     this.logger.info("合成随机物品出错 code = {}, num = {}", code, num);
                     return this.player.failure(58103);
                  } else {
                     this.player.delResource(2, itemBase.id, (long)(chipNeedNum * num), 2, 203, itemBase.id, num, "code:" + code);
                     this.player.addResource(list, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 2, 203, itemBase.id, num, "");
                     BagMsg.S2C_ViceCompose_3020.Builder builder = BagMsg.S2C_ViceCompose_3020.newBuilder();
                     builder.setResult(1);
                     this.player.sendMsg(builder.build());
                     return true;
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_MultiSelect_3025(BagMsg.C2S_MultiSelect_3025 msg, String source) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      ItemBase itemBase = itemBagDao.getItemByCode(msg.getCode());
      if (itemBase == null) {
         return this.player.failure(2);
      } else {
         ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", itemBase.id);
         if (itemModel == null) {
            return this.player.failure(2);
         } else if (itemBase.num <= 0) {
            return this.player.failure(4);
         } else if (itemModel.getUseFuncType() != 19) {
            return this.player.failure(6);
         } else {
            List<Integer> idList = msg.getIdList();
            Set<Integer> idSet = new HashSet(idList);
            if (idSet.size() != itemModel.getUseFuncValue()) {
               return this.player.failure(58001);
            } else {
               RuneStoneItem newItem = this.addMaxRuneStone(itemModel.getUseFuncId(), idList, 2, 208, 0, 0, "");
               if (newItem == null) {
                  this.logger.warn("生成符石失败 playerId:{}, itemId:{}", this.player.getPlayerId(), itemBase.id);
                  return false;
               } else {
                  this.player.delResource(2, itemBase.id, 1L, 2, 208, itemBase.id, 1, "code:" + itemBase.code);
                  this.player.additemUpdateBuilder(newItem);
                  this.player.senditemUpdateMsg();
                  this.player.addResourceMsg(newItem);
                  this.player.sendResourceMsg();
                  BagMsg.S2C_MultiSelect_3026.Builder builder = BagMsg.S2C_MultiSelect_3026.newBuilder();
                  builder.setResult(1);
                  this.player.sendMsg(builder.build());
                  return true;
               }
            }
         }
      }
   }

   public boolean handleOpenBox(int code, int num) {
      if (num <= 0) {
         return this.player.failure(6);
      } else {
         ItemBase itemBase = this.getItemByCode(code);
         if (itemBase == null) {
            return this.player.failure(2);
         } else if (itemBase.getNum() < num) {
            return this.player.failure(4);
         } else {
            ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", itemBase.id);
            if (itemModel == null) {
               return this.player.failure(5);
            } else if (itemModel.getUseFuncType() != 0 && itemModel.getUseFuncId() != 0 && itemModel.getUseFuncValue() != 0) {
               SystemFunctionModel systemModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", itemModel.getBoxUseSystemId());
               if (null != systemModel && !this.player.isSystemOpen(systemModel.getId())) {
                  return false;
               } else {
                  List<ResourceModel> resourceModels = this.getResourcesByUseFun(itemModel.getUseFuncType(), itemModel.getUseFuncId(), itemModel.getUseFuncValue(), num);
                  if (CollectionUtil.isEmpty(resourceModels)) {
                     this.logger.info(String.format("礼包 id:%d 没有配置对应的物品", itemModel.getUseFuncId()));
                     return this.player.failure(37);
                  } else {
                     String tips = String.format("openBox code:%d, num:%d", code, num);
                     this.deleteItemByCode(code, num, 2, 201, itemBase.id, num, tips);
                     this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 2, 201, itemBase.id, num, tips);
                     BagMsg.S2C_OpenBox_3014.Builder builder = BagMsg.S2C_OpenBox_3014.newBuilder();
                     builder.setCode(code);
                     builder.setNum(num);
                     this.player.sendMsg(builder.build());
                     return true;
                  }
               }
            } else {
               return this.player.failure(7);
            }
         }
      }
   }

   public List<ResourceModel> getSpecialAward(int id, int num) {
      List<ResourceModel> resourceModels = new ArrayList();
      SpecialAwardModel specialAwardModel = (SpecialAwardModel)ApplicationContextProvider.getModelPoolEntity("specialAward", id);
      if (specialAwardModel != null) {
         specialAwardModel.getResource().forEach((resourceModel) -> resourceModels.add(new ResourceModel(resourceModel.getType(), resourceModel.getId(), resourceModel.getValue() * num)));
      }

      return resourceModels;
   }

   public List<ResourceModel> getRandomAward(int group, int num) {
      List<ResourceModel> resourceModels = new ArrayList();
      List<KeyValFun> keyValFunList = new ArrayList();
      Map<Integer, Map<Integer, BoxAwardModel>> boxAwardModelMap = this.player.getGameModelPool().getMap("customBoxAward");
      Map<Integer, BoxAwardModel> curGroupModelMap = (Map)boxAwardModelMap.getOrDefault(group, new ConcurrentHashMap());
      if (curGroupModelMap.isEmpty()) {
         return new ArrayList();
      } else {
         Map<Integer, Integer> floorsMap = new HashMap();
         PlayerBagExtend playerBagExtend = (PlayerBagExtend)this.player.getPlayerExtend(2);

         for(BoxAwardModel config : curGroupModelMap.values()) {
            keyValFunList.add(new KeyValFun(config.getId(), config.getWeight()));
            if (config.getFloors() > 0) {
               if (config.getFloorType() == 0) {
                  floorsMap.put(config.getId(), num / config.getFloors());
               } else {
                  if (config.getFloorType() != 1) {
                     return new ArrayList();
                  }

                  int curNum = (Integer)playerBagExtend.boxAwardFloor.getOrDefault(group, 0) + num;
                  if (config.getFloors() > curNum) {
                     playerBagExtend.boxAwardFloor.put(group, curNum);
                     this.player.updatePlayerExtend(2);
                  } else {
                     floorsMap.put(config.getId(), 1);
                  }
               }
            }
         }

         for(int i = 0; i < num; ++i) {
            int id = GamePlayer.countRate(keyValFunList);
            BoxAwardModel boxAwardModel = (BoxAwardModel)curGroupModelMap.get(id);
            if (boxAwardModel == null) {
               this.logger.info("开启的宝箱不存在 playerId:{} boxId:{}", this.player.getPlayerId(), id);
               String tips = String.format("开启的宝箱不存在 playerId:%d boxId:%d", this.player.getPlayerId(), id);
            } else {
               int resourceNum = boxAwardModel.getMin();
               if (boxAwardModel.getMin() != boxAwardModel.getMax()) {
                  resourceNum = RandomUtil.randInt(boxAwardModel.getMin(), boxAwardModel.getMax() + 1);
               }

               resourceModels.add(new ResourceModel(boxAwardModel.getResourceType(), boxAwardModel.getResourceId(), resourceNum));
               if (floorsMap.containsKey(id)) {
                  int count = (Integer)floorsMap.getOrDefault(id, 0);
                  floorsMap.put(id, count - 1);
                  if (count <= 1) {
                     floorsMap.remove(id);
                  }

                  if (boxAwardModel.getFloorType() == 1) {
                     playerBagExtend.boxAwardFloor.remove(group);
                     this.player.updatePlayerExtend(2);
                  }
               }
            }
         }

         for(Map.Entry<Integer, Integer> entry : floorsMap.entrySet()) {
            BoxAwardModel boxAwardModel = (BoxAwardModel)curGroupModelMap.get(entry.getKey());

            for(int i = 0; i < (Integer)entry.getValue(); ++i) {
               int randomIdx = RandomUtil.randInt(0, resourceModels.size());
               resourceModels.set(randomIdx, new ResourceModel(boxAwardModel.getResourceType(), boxAwardModel.getResourceId(), boxAwardModel.getMin()));
               if (boxAwardModel.getFloorType() == 1) {
                  playerBagExtend.boxAwardFloor.remove(group);
                  this.player.updatePlayerExtend(2);
                  break;
               }
            }
         }

         return resourceModels;
      }
   }

   public List<ResourceModel> getBoxReward(int boxId, int num) {
      List<ResourceModel> resourceModels = new ArrayList();
      BoxModel boxModel = (BoxModel)this.player.getGameModelPool().getEntity("box", boxId);
      if (boxModel != null) {
         for(ResourceModel resourceModel : boxModel.getItem()) {
            resourceModels.add(new ResourceModel(resourceModel.getType(), resourceModel.getId(), resourceModel.getValue() * num));
         }
      }

      return resourceModels;
   }

   public List<ResourceModel> getResourcesByUseFun(int useFuncType, int useFuncId, int useFuncValue, int num) {
      List<ResourceModel> resourceModels = new ArrayList();
      if (useFuncType > 0 && useFuncId > 0 && useFuncValue > 0) {
         if (useFuncType < 10) {
            resourceModels.add(new ResourceModel(useFuncType, useFuncId, useFuncValue * num));
         } else if (useFuncType == 10) {
            resourceModels = this.getSpecialAward(useFuncId, num);
         } else if (useFuncType == 11) {
            resourceModels = this.getRandomAward(useFuncId, num);
         } else if (useFuncType == 20) {
            resourceModels = this.getBoxReward(useFuncId, num);
         }

         return resourceModels;
      } else {
         return resourceModels;
      }
   }

   public void loginHandle() {
      for(Integer subclass : ItemBagDao.clsMap.keySet()) {
         this.sendBagData(subclass);
      }

      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      this.player.checkUnionCode(CodeDefine.ITEM_CODE, itemBagDao.getMaxCode());
      this.sendCumulatives();
      this.S2C_ItemUseNum_3034(0);
   }

   public void sendBagData(int subclass) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      BagParent bag = itemBagDao.getBagBySublass(subclass);
      Map<Integer, ItemBase> map = bag.getMap();
      BagMsg.S2C_ItemDatas_3004.Builder builder = BagMsg.S2C_ItemDatas_3004.newBuilder();
      builder.setSubclass(subclass);

      for(ItemBase itemBase : map.values()) {
         ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", itemBase.id);
         if (itemModel == null) {
            this.logger.warn("玩家" + this.player.getPlayerId() + ",物品配置" + itemBase.id + "不存在");
         } else if (itemModel.getSubclass() != subclass) {
            this.logger.warn("玩家" + this.player.getPlayerId() + ",物品" + itemBase.id + "不是类型" + subclass);
         } else {
            builder.addItems(itemBase.toItemInfoBuilder());
         }
      }

      this.player.sendMsg(builder.build());
   }

   protected void logItem(int id, int num, int chValue, int module, int reason, int misc1, int misc2, String misc3) {
      ItemLog log = new ItemLog();
      PlayerDao playerDao = (PlayerDao)this.player.getData("tb_player", this.player.getPlayerId());
      log.playerId = this.player.getPlayerId();
      log.playerName = playerDao.playerName;
      log.itemId = id;
      log.num = num;
      log.chValue = chValue;
      log.module = module;
      log.reason = reason;
      log.misc1 = misc1;
      log.misc2 = misc2;
      log.misc3 = misc3;
      log.createTime = new Timestamp(System.currentTimeMillis());
      LogMgr.checkLog(log);
      this.player.getLogMgr().pushTask(() -> this.player.getLogMgr().addLog(log));
   }

   public void addOperationLog(int id, int num, int chValue, int reasonId) {
      if (LogDefine.REASON_DEC_MAP.containsKey(reasonId)) {
         String reason = (String)LogDefine.REASON_DEC_MAP.get(reasonId);
         int oldLogId = 0;
         int newLogId = 0;
         if (chValue > 0) {
            oldLogId = 7;
            newLogId = 1;
         } else {
            oldLogId = 8;
            newLogId = 2;
         }

         LogOperationMgr operationMgr = this.player.getOperationMgr();
         operationMgr.addItemLog(this.player, oldLogId, id, (long)Math.abs(chValue), reason);
         operationMgr.addItemNewLog(this.player, newLogId, id, (long)Math.abs(chValue), (long)num, reason);
      }
   }

   public WarriorSignet addWarriorSignet(WarriorSignet oldWarriorSignet, int module, int reason, int misc1, int misc2, String misc3) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      int code = this.player.getUniqueCode(CodeDefine.ITEM_CODE);
      WarriorSignet warriorSignet = new WarriorSignet(code, oldWarriorSignet);
      itemBagDao.additem(warriorSignet, 4);
      this.logItem(warriorSignet.id, warriorSignet.getNum(), 1, module, reason, warriorSignet.code, misc2, misc3);
      this.addOperationLog(warriorSignet.id, warriorSignet.getNum(), 1, reason);
      return warriorSignet;
   }

   public WarFlag addWarFlag(WarFlag oldWarFlag, int module, int reason, int misc1, int misc2, String misc3) {
      int code = this.player.getUniqueCode(CodeDefine.ITEM_CODE);
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      WarFlag newWarFlay = new WarFlag(code, oldWarFlag);
      itemBagDao.additem(newWarFlay, 6);
      this.logItem(newWarFlay.id, newWarFlay.getNum(), 1, module, reason, misc1, misc2, misc3);
      this.addOperationLog(newWarFlay.id, newWarFlay.getNum(), 1, reason);
      return newWarFlay;
   }

   public void addWarFlagForCom(WarFlag newWarFlag, int module, int reason, int misc1, int misc2, String misc3) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      itemBagDao.additem(newWarFlag, 6);
      this.addOperationLog(newWarFlag.id, newWarFlag.getNum(), 1, reason);
   }

   public WarHorse addWarHorse(WarHorse oldWarHorse, int module, int reason, int misc1, int misc2, String misc3) {
      int code = this.player.getUniqueCode(CodeDefine.ITEM_CODE);
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      WarHorse newWarHorse = new WarHorse(code, oldWarHorse);
      itemBagDao.additem(newWarHorse, 15);
      this.logItem(newWarHorse.id, newWarHorse.getNum(), 1, module, reason, misc1, misc2, misc3);
      this.addOperationLog(newWarHorse.id, newWarHorse.getNum(), 1, reason);
      return newWarHorse;
   }

   public HeroAideItem addHeroAide(AideLevelModel aideLevelModel, int module, int reason, int misc1, int misc2, String misc3) {
      int code = this.player.getUniqueCode(CodeDefine.ITEM_CODE);
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      HeroAideItem heroAideItem = new HeroAideItem();
      heroAideItem.id = aideLevelModel.getAideId();
      heroAideItem.aideId = aideLevelModel.getId();
      heroAideItem.num = 1;
      heroAideItem.code = code;
      itemBagDao.additem(heroAideItem, 9);
      this.logItem(heroAideItem.id, heroAideItem.getNum(), 1, module, reason, misc1, misc2, misc3);
      this.addOperationLog(heroAideItem.id, heroAideItem.getNum(), 1, reason);
      return heroAideItem;
   }

   public List<CommonMsg.ItemInfo.Builder> addItem(int id, int num, int module, int reason, int misc1, int misc2, String misc3, int createTime) {
      List<CommonMsg.ItemInfo.Builder> infoBuilderList = new ArrayList();
      if (num <= 0) {
         this.player.failure(4);
         return infoBuilderList;
      } else {
         ItemModel model = (ItemModel)this.player.getGameModelPool().getEntity("item", id);
         if (model == null) {
            this.player.failure(2);
            return infoBuilderList;
         } else {
            ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
            BagParent<ItemBase> bag = itemBagDao.getBagBySublass(model.getSubclass());
            if (bag == null) {
               this.player.failure(6);
               return infoBuilderList;
            } else {
               if (model.getSubclass() == 17) {
                  if (num > 1) {
                     this.logger.warn("玩家【{}】同时添加了多个气泡【{}X{}】,当前只给1个", new Object[]{this.player.getPlayerId(), id, num});
                     num = 1;
                  }

                  if (createTime > 0 && model.getTargetclass() == 7 && createTime + model.getTimeOut() <= DateUtil.getIntTime(System.currentTimeMillis())) {
                     this.logger.warn("玩家【{}】气泡【{}】已过期,不新增,生效时间【{}】,失效时间【{}】", new Object[]{this.player.getPlayerId(), model.getId(), DateUtil.transferLongToDate((long)createTime * 1000L), DateUtil.transferLongToDate((long)(createTime + model.getTimeOut()) * 1000L)});
                     return infoBuilderList;
                  }

                  ItemBase itemBase = bag.getItemById(id);
                  if (itemBase != null && itemBase.getNum() > 0) {
                     this.logger.warn("玩家【{}】重复添加了聊天气泡【{}】", this.player.getPlayerId(), id);
                     ChatBubbleModel chatBubbleModel = (ChatBubbleModel)ApplicationContextProvider.getModelPoolEntity("chatBubble", id);
                     if (chatBubbleModel != null && !chatBubbleModel.getConvert().isEmpty()) {
                        this.player.addResource((Integer)chatBubbleModel.getConvert().get(0), (Integer)chatBubbleModel.getConvert().get(1), (Integer)chatBubbleModel.getConvert().get(2), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 7, 709, 0, 0, "");
                     }

                     this.deleteItemByCode(itemBase.code, itemBase.getNum(), 7, 710, 0, 0, "", true);
                  }
               } else if (model.getSubclass() == 15) {
                  WarHorseBaseModel warHorseBaseModel = (WarHorseBaseModel)this.player.getGameModelPool().getEntity("warHorseBase", model.getId());
                  if (warHorseBaseModel == null) {
                     return infoBuilderList;
                  }

                  if (warHorseBaseModel.getType() != 0) {
                     this.logger.error("材料战马不能通过addResource添加");
                     return infoBuilderList;
                  }
               } else if (model.getSubclass() == 18) {
                  MedalModel medalModel = (MedalModel)ApplicationContextProvider.getModelPoolEntity("xunzhang", id);
                  if (medalModel == null) {
                     this.logger.error("玩家【{}】添加【{}】勋章配置不存在", this.player.getPlayerId(), id);
                     return infoBuilderList;
                  }

                  if (num > 1) {
                     this.logger.warn("玩家【{}】同时添加了多个勋章【{}X{}】,当前只给1个", new Object[]{this.player.getPlayerId(), id, num});
                     num = 1;
                  }

                  ItemBase itemBase = bag.getItemById(id);
                  if (itemBase != null && itemBase.getNum() > 0) {
                     this.logger.warn("玩家【{}】重复添加了勋章【{}】,移除旧勋章", this.player.getPlayerId(), id);
                     this.deleteItemByCode(itemBase.code, itemBase.getNum(), 2, 213, 0, 0, "", true);
                  }

                  List<MedalModel> medalModels = (List)ApplicationContextProvider.getModelPoolEntity("customXunzhang", medalModel.getType());
                  if (medalModels != null) {
                     for(MedalModel sameMedal : medalModels) {
                        itemBase = bag.getItemById(sameMedal.getItemId());
                        if (itemBase != null) {
                           this.logger.warn("玩家【{}】重复添加了【{}】类型,移除旧勋章【{}】", new Object[]{this.player.getPlayerId(), medalModel.getType(), sameMedal.getItemId()});
                           this.deleteItemByCode(itemBase.code, itemBase.getNum(), 2, 213, 0, 0, "", true);
                        }
                     }
                  }
               }

               if (model.getCombine() == 1) {
                  CommonMsg.ItemInfo.Builder infoBuilder = this.addItemCombine(model, num, module, reason, misc1, misc2, misc3);
                  if (infoBuilder != null) {
                     infoBuilderList.add(infoBuilder);
                  }
               } else {
                  infoBuilderList = this.addItemWithNew(model, num, module, reason, misc1, misc2, misc3, createTime);
               }

               if (model.getSubclass() == 9) {
                  Map<Integer, Map<Integer, AideLevelModel>> aideLevelModelMap = ApplicationContextProvider.<Integer, Map<Integer, AideLevelModel>>getModelPoolMap("customAideLevel");
                  if (aideLevelModelMap != null && !aideLevelModelMap.isEmpty() && aideLevelModelMap.containsKey(model.getId())) {
                     HeroArchiveDao heroArchiveDao = (HeroArchiveDao)this.player.getData("tb_dictionary_hero", this.player.getPlayerId());
                     heroArchiveDao.heroAides.add(model.getId());
                     heroArchiveDao.updateOp();
                  }
               } else if (model.getSubclass() == 2 && this.player.isNeedAddTask(reason)) {
                  this.player.triggerTask(207, model.getQuality(), (long)num, 3);
               } else if (model.getSubclass() == 4 && this.player.isNeedAddTask(reason)) {
                  this.player.triggerTask(321, model.getQuality(), (long)num, 3);
               } else if (model.getSubclass() == 8) {
                  HeroArchiveDao heroArchiveDao = (HeroArchiveDao)this.player.getData("tb_dictionary_hero", this.player.getPlayerId());
                  heroArchiveDao.magics.add(model.getId());
                  heroArchiveDao.updateOp();
               } else if (model.getSubclass() == 7) {
                  this.player.triggerTask(353, 0, (long)num, 1);
               } else if (model.getSubclass() == 12) {
                  if (id == ApplicationContextProvider.getConfigInt("boomPoint", 0)) {
                     SplendidCityPart splendidCityPart = (SplendidCityPart)this.player.getMgrPart(SplendidCityPart.class);
                     splendidCityPart.updateGameRank(num);
                  } else if (id == ApplicationContextProvider.getConfigInt("GreatCityDiceID", 0)) {
                     SplendidCityPart splendidCityPart = (SplendidCityPart)this.player.getMgrPart(SplendidCityPart.class);
                     splendidCityPart.checkRandomDiceMax();
                  } else if (id == ApplicationContextProvider.getConfigInt("GuoQingMonopolyBoomPoint", 0)) {
                     GuoQingActivityPart guoQingActivityPart = (GuoQingActivityPart)this.player.getMgrPart(GuoQingActivityPart.class);
                     guoQingActivityPart.updateGameRank(num);
                  } else if (id == ApplicationContextProvider.getConfigInt("GuoQingMonopolyDiceID", 0)) {
                     GuoQingActivityPart guoQingActivityPart = (GuoQingActivityPart)this.player.getMgrPart(GuoQingActivityPart.class);
                     guoQingActivityPart.checkRandomDiceMax();
                  } else if (id == ApplicationContextProvider.getConfigInt("FristYearBoomPoint", 0)) {
                     AnniversaryCelebrationPart anniversaryCelebrationPart = (AnniversaryCelebrationPart)this.player.getMgrPart(AnniversaryCelebrationPart.class);
                     anniversaryCelebrationPart.updateGameRank(num);
                  } else if (id == ApplicationContextProvider.getConfigInt("FristYearDiceID", 0)) {
                     AnniversaryCelebrationPart anniversaryCelebrationPart = (AnniversaryCelebrationPart)this.player.getMgrPart(AnniversaryCelebrationPart.class);
                     anniversaryCelebrationPart.checkRandomDiceMax();
                  } else if (id == ApplicationContextProvider.getConfigInt("ChunJieBoomPoint", 0)) {
                     ActivityChineseNewYearPart chineseNewYearPart = (ActivityChineseNewYearPart)this.player.getMgrPart(ActivityChineseNewYearPart.class);
                     chineseNewYearPart.updateGameRank(num);
                  } else if (id == ApplicationContextProvider.getConfigInt("ChunJieDiceID", 0)) {
                     ActivityChineseNewYearPart chineseNewYearPart = (ActivityChineseNewYearPart)this.player.getMgrPart(ActivityChineseNewYearPart.class);
                     chineseNewYearPart.checkRandomDiceMax();
                  } else if (id == ApplicationContextProvider.getConfigInt("HJWeekMonopolyBoomPoint", 0)) {
                     ActGoldWeekPart actGoldWeekPart = (ActGoldWeekPart)this.player.getMgrPart(ActGoldWeekPart.class);
                     actGoldWeekPart.updateGameRank(num);
                  } else if (id == ApplicationContextProvider.getConfigInt("HJWeekMonopolyDiceID", 0)) {
                     ActGoldWeekPart actGoldWeekPart = (ActGoldWeekPart)this.player.getMgrPart(ActGoldWeekPart.class);
                     actGoldWeekPart.checkRandomDiceMax();
                  } else if (id == ApplicationContextProvider.getConfigInt("JiuZhouWarOrderScore", 0)) {
                     SupremePvpPart supremePvpPart = (SupremePvpPart)this.player.getMgrPart(SupremePvpPart.class);
                     supremePvpPart.checkWarOrderLv();
                  }
               } else if (model.getSubclass() == 30) {
                  RunePart runePart = (RunePart)this.player.getMgrPart(RunePart.class);
                  RuneMainModel runeMainModel = runePart.getRuneMainModel(model.getId());
                  if (null != runeMainModel) {
                     this.player.triggerTask(701, runeMainModel.getQuality(), (long)num, 1);
                  }
               } else if (model.getSubclass() == 35) {
                  ExclusiveWeaponPart exclusiveWeaponPart = (ExclusiveWeaponPart)this.player.getMgrPart(ExclusiveWeaponPart.class);
                  exclusiveWeaponPart.addWeaponStarLv(model.getId(), 0);
               }

               if (model.getTargetclass() == 20) {
                  AnniversaryCelebrationPart anniversaryCelebrationPart = (AnniversaryCelebrationPart)this.player.getMgrPart(AnniversaryCelebrationPart.class);
                  anniversaryCelebrationPart.uploadFirstYearTreasureNum();
               }

               if (model.getTargetclass() == 21) {
                  ActivityChineseNewYearPart activityChineseNewYearPart = (ActivityChineseNewYearPart)this.player.getMgrPart(ActivityChineseNewYearPart.class);
                  activityChineseNewYearPart.uploadChineseNewYearTreasureNum();
               }

               if (model.getTargetclass() == 24) {
                  MonarchPart monarchPart = (MonarchPart)this.player.getMgrPart(MonarchPart.class);
                  monarchPart.addTrendsHead(model.getId());
               }

               return infoBuilderList;
            }
         }
      }
   }

   private CommonMsg.ItemInfo.Builder addItemCombine(ItemModel model, int num, int module, int reason, int misc1, int misc2, String misc3) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      BagParent<ItemBase> bag = itemBagDao.getBagBySublass(model.getSubclass());
      if (bag == null) {
         return null;
      } else {
         int maxLimit = this.getMaxCount(model.getSubclass());
         int size = bag.getBagSize();
         List<ItemBase> list = itemBagDao.getItemById(model.getId());
         if (list.size() > 0) {
            int enableTime = ((ItemBase)list.get(0)).enableTime;
            int currentTime = (int)(System.currentTimeMillis() / 1000L);
            if (enableTime > 0 && enableTime <= currentTime) {
               for(ItemBase itemBase : list) {
                  String logStr = itemBase.code + ":" + itemBase.num + ":" + itemBase.enableTime;
                  this.deleteItemByCode(itemBase.code, itemBase.num, -1, 209, itemBase.code, itemBase.enableTime, logStr);
               }

               list.clear();
            }
         }

         if (list.size() > 0) {
            int enableTime = ((ItemBase)list.get(0)).enableTime;
            int maxCombine = this.getMaxCombine(model.getId());
            Optional<ItemBase> optional = list.stream().filter((itemBasex) -> itemBasex.num < maxCombine).findFirst();
            if (optional.isPresent()) {
               ItemBase itemBase = (ItemBase)optional.get();
               int newNum = itemBase.num + num;
               if (newNum > maxCombine) {
                  int margin = maxCombine - itemBase.num;
                  itemBagDao.updateItem(itemBase.code, margin);
                  this.logItem(model.getId(), itemBase.getNum(), margin, module, reason, misc1, misc2, misc3);
                  this.addOperationLog(model.getId(), itemBase.getNum(), margin, reason);
                  this.player.itemUpdateBuilder.addItems(itemBase.toItemInfoBuilder());
                  this.logItem(model.getId(), itemBase.getNum(), margin, module, reason, misc1, misc2, misc3);
                  this.addMultipleItems(itemBagDao, enableTime, model, num - margin, module, reason, misc1, misc2, misc3);
               } else {
                  itemBagDao.updateItem(itemBase.code, num);
                  this.logItem(model.getId(), itemBase.getNum(), num, module, reason, misc1, misc2, misc3);
                  this.addOperationLog(model.getId(), itemBase.getNum(), num, reason);
                  this.player.itemUpdateBuilder.addItems(itemBase.toItemInfoBuilder());
               }
            } else {
               this.addMultipleItems(itemBagDao, enableTime, model, num, module, reason, misc1, misc2, misc3);
            }
         } else if (size >= maxLimit) {
            this.saveMail(model.getId(), num);
         } else {
            this.addMultipleItems(itemBagDao, 0, model, num, module, reason, misc1, misc2, misc3);
         }

         CommonMsg.ItemInfo.Builder builder = CommonMsg.ItemInfo.newBuilder();
         builder.setType(2);
         builder.setCode(-1);
         builder.setNum(num);
         builder.setId(model.getId());
         return builder;
      }
   }

   private void addMultipleItems(ItemBagDao itemBagDao, int enableTime, ItemModel model, int num, int module, int reason, int misc1, int misc2, String misc3) {
      BagParent<ItemBase> bag = itemBagDao.getBagBySublass(model.getSubclass());
      if (bag != null) {
         if (num > 0) {
            int size = bag.getBagSize();
            int maxCount = this.getMaxCount(model.getSubclass());
            int maxCombine = this.getMaxCombine(model.getId());
            if (num <= maxCombine) {
               if (size >= maxCount) {
                  this.saveMail(model.getId(), num);
               } else {
                  this.createItemBase(itemBagDao, enableTime, model, model.getId(), num, module, reason, misc1, misc2, misc3);
               }
            } else {
               int wholeGrid = num / maxCombine;
               int offset = 0;
               if (wholeGrid + size > maxCount) {
                  offset = wholeGrid + size - maxCount;
               }

               for(int i = 0; i < wholeGrid - offset; ++i) {
                  this.createItemBase(itemBagDao, enableTime, model, model.getId(), maxCombine, module, reason, misc1, misc2, misc3);
               }

               int restNum = num % maxCombine + offset * maxCombine;
               if (restNum > 0) {
                  if (wholeGrid + size >= maxCount) {
                     this.saveMail(model.getId(), restNum);
                  } else {
                     this.createItemBase(itemBagDao, enableTime, model, model.getId(), restNum, module, reason, misc1, misc2, misc3);
                  }
               }
            }

         }
      }
   }

   private List<CommonMsg.ItemInfo.Builder> addItemWithNew(ItemModel model, int num, int module, int reason, int misc1, int misc2, String misc3, int createTime) {
      List<CommonMsg.ItemInfo.Builder> resultBuilder = new ArrayList();
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      BagParent<ItemBase> bag = itemBagDao.getBagBySublass(model.getSubclass());
      if (bag == null) {
         return resultBuilder;
      } else {
         int maxLimit = this.getMaxCount(model.getSubclass());
         int size = bag.getBagSize();

         for(int i = 0; i < num; ++i) {
            if (size + i >= maxLimit) {
               this.saveMail(model.getId(), num - i);
               CommonMsg.ItemInfo.Builder infoBuilder = CommonMsg.ItemInfo.newBuilder();
               infoBuilder.setId(model.getId());
               infoBuilder.setNum(num - i);
               infoBuilder.setCode(-1);
               infoBuilder.setType(2);
               resultBuilder.add(infoBuilder);
               break;
            }

            try {
               Class clazz = (Class)ItemBagDao.clsMap.get(Integer.valueOf(model.getSubclass()));
               if (clazz != null) {
                  ItemBase itemBase = (ItemBase)((Class)ItemBagDao.clsMap.get(Integer.valueOf(model.getSubclass()))).newInstance();
                  itemBase.init(this.player.getUniqueCode(CodeDefine.ITEM_CODE), 1, model, this.player);
                  this.itemInvalidTime(model, itemBase, createTime);
                  itemBagDao.additem(itemBase, model.getSubclass());
                  this.logItem(model.getId(), itemBase.getNum(), 1, module, reason, misc1, misc2, misc3);
                  this.addOperationLog(model.getId(), itemBase.getNum(), 1, reason);
                  this.player.itemUpdateBuilder.addItems(itemBase.toItemInfoBuilder());
                  CommonMsg.ItemInfo.Builder infoBuilder = CommonMsg.ItemInfo.newBuilder();
                  infoBuilder.setId(itemBase.id);
                  infoBuilder.setNum(1);
                  infoBuilder.setCode(itemBase.code);
                  infoBuilder.setType(2);
                  resultBuilder.add(infoBuilder);
               } else {
                  System.out.println("item表中物品类型配置错误, id:" + model.getId() + " subclass:" + model.getSubclass());
               }
            } catch (Exception e) {
               e.printStackTrace();
            }
         }

         return resultBuilder;
      }
   }

   private void createItemBase(ItemBagDao itemBagDao, int enableTime, ItemModel model, int id, int num, int module, int reason, int misc1, int misc2, String misc3) {
      try {
         ItemBase itemBase = (ItemBase)((Class)ItemBagDao.clsMap.get(Integer.valueOf(model.getSubclass()))).newInstance();
         itemBase.init(this.player.getUniqueCode(CodeDefine.ITEM_CODE), num, model, this.player);
         if (enableTime > 0) {
            itemBase.enableTime = enableTime;
         }

         itemBagDao.additem(itemBase, model.getSubclass());
         this.logItem(id, itemBase.getNum(), num, module, reason, misc1, misc2, misc3);
         this.addOperationLog(id, itemBase.getNum(), num, reason);
         this.player.itemUpdateBuilder.addItems(itemBase.toItemInfoBuilder());
      } catch (Exception e) {
         this.logger.error("生成物品出错：id={}", id);
         e.printStackTrace();
      }

   }

   public boolean deleteItemById(int id, int num, int module, int reason, int misc1, int misc2, String misc3) {
      if (num <= 0) {
         return this.player.failure(4);
      } else {
         ItemModel model = (ItemModel)this.player.getGameModelPool().getEntity("item", id);
         if (model == null) {
            return this.player.failure(5);
         } else {
            ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
            List<ItemBase> list = itemBagDao.getItemById(id);
            int totalNum = list.stream().mapToInt((itemBasex) -> itemBasex.num).sum();
            if (totalNum < num) {
               return this.player.failure(4);
            } else {
               Collections.sort(list, Comparator.comparingInt((itemBasex) -> itemBasex.num));
               Collections.reverse(list);
               int tempNum = num;

               for(int i = list.size(); i >= 0 && tempNum > 0; --i) {
                  ItemBase itemBase = (ItemBase)list.get(i - 1);
                  if (itemBase.num >= tempNum) {
                     this.removeItem(itemBase, tempNum, module, reason, misc1, misc2, misc3);
                     break;
                  }

                  tempNum -= itemBase.num;
                  this.removeItem(itemBase, itemBase.num, module, reason, misc1, misc2, misc3);
               }

               this.player.triggerTask(521, id, (long)num, 1);
               if (id == ApplicationContextProvider.getConfigInt("SpecialMoneyId", 88888888)) {
                  this.player.getOperationMgr().addCoinNewLog(this.player, -num, this.player.getResourceNum(2, id), misc3, String.valueOf(misc2));
               } else if (id == ApplicationContextProvider.getConfigInt("GreatCityDiceID", 0)) {
                  SplendidCityPart splendidCityPart = (SplendidCityPart)this.player.getMgrPart(SplendidCityPart.class);
                  splendidCityPart.checkDiceCountRecover();
               }

               return true;
            }
         }
      }
   }

   public boolean deleteItemById(int id, int num, int module, int reason, int misc1, int misc2, String misc3, boolean bSend) {
      this.deleteItemById(id, num, module, reason, misc1, misc2, misc3);
      if (bSend) {
         this.player.senditemUpdateMsg();
      }

      return true;
   }

   public void deleteItems(int id, int module, int reason, int misc1, int misc2, String misc3) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      List<ItemBase> list = itemBagDao.getItemById(id);
      int totalNum = list.stream().mapToInt((itemBasex) -> itemBasex.num).sum();
      if (totalNum > 0) {
         for(int i = 0; i < list.size(); ++i) {
            ItemBase itemBase = (ItemBase)list.get(i);
            this.removeItem(itemBase, itemBase.num, module, reason, misc1, misc2, misc3);
         }

         this.player.senditemUpdateMsg();
      }
   }

   public void deleteItemByCodes(List<Integer> codes, int module, int reason, int misc1, int misc2, String misc3) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());

      for(Integer code : codes) {
         ItemBase itemBase = itemBagDao.getItemByCode(code);
         if (itemBase != null) {
            this.removeItem(itemBase, itemBase.getNum(), module, reason, itemBase.code, misc2, misc3);
         }
      }

      this.player.senditemUpdateMsg();
   }

   public boolean deleteItemByCode(int code, int num, int module, int reason, int misc1, int misc2, String misc3) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      ItemBase itemBase = itemBagDao.getItemByCode(code);
      if (itemBase == null) {
         return this.player.failure(2);
      } else {
         if (num > itemBase.getNum()) {
            this.logger.error(String.format("删除的物品数量比拥有数量多,playerId:{} 拥有:%d, 删除:%d", this.player.getPlayerId(), itemBase.getNum(), num));
            misc3 = String.format("删除的物品数量比拥有数量多,playerId:{} 拥有:%d, 删除:%d", this.player.getPlayerId(), itemBase.getNum(), num);
            num = itemBase.getNum();
         }

         return this.removeItem(itemBase, num, module, reason, itemBase.code, misc2, misc3);
      }
   }

   public boolean deleteItemByCode(int code, int num, int module, int reason, int misc1, int misc2, String misc3, boolean bSend) {
      this.deleteItemByCode(code, num, module, reason, misc1, misc2, misc3);
      if (bSend) {
         this.player.senditemUpdateMsg();
      }

      return true;
   }

   private boolean removeItem(ItemBase itemBase, int num, int module, int reason, int misc1, int misc2, String misc3) {
      if (num > 0 && itemBase != null) {
         num = -1 * num;
         ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
         if (itemBagDao.updateItem(itemBase.code, num)) {
            this.player.itemUpdateBuilder.addItems(itemBase.toItemInfoBuilder());
            this.logItem(itemBase.id, itemBase.getNum(), num, module, reason, misc1, misc2, misc3);
            this.addOperationLog(itemBase.id, itemBase.getNum(), num, reason);
         }

         return true;
      } else {
         return false;
      }
   }

   public boolean handleUseItem(int code, int num) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      ItemBase itemBase = itemBagDao.getItemByCode(code);
      if (itemBase == null) {
         return this.player.failure(2);
      } else if (itemBase.getNum() <= 0) {
         return this.player.failure(6);
      } else if (num > itemBase.getNum()) {
         return this.player.failure(3);
      } else {
         ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", itemBase.id);
         if (itemModel == null) {
            return this.player.failure(5);
         } else if (!itemModel.canUse()) {
            return this.player.failure(7);
         } else {
            if (itemModel.getTargetclass() == 17) {
               PlayerItemResetCustomCache playerItemResetCustomCache = (PlayerItemResetCustomCache)this.player.getCustomCache("tb_player_item_reset", this.player.getPlayerId());
               int dailyNum = (Integer)playerItemResetCustomCache.getDailyNum(itemModel.getId(), 0);
               if (dailyNum + num > itemModel.getUseFuncValue()) {
                  return this.player.failure(51);
               }
            }

            if (itemModel.getUseFuncType() == 88) {
               this.removeItem(itemBase, num, 2, 201, itemBase.id, num, "" + code);
               RechargeModel rechargeModel = (RechargeModel)ApplicationContextProvider.getModelPoolEntity("rechargePrice", itemModel.getUseFuncId());
               PlayerRechargePart playerRechargePart = (PlayerRechargePart)this.player.getMgrPart(PlayerRechargePart.class);
               playerRechargePart.recharge("", "", rechargeModel, 0, 2, 201, "");
            } else if (itemModel.getUseFuncType() == 87) {
               PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
               int freeNum = (Integer)playerResetCustomCache.getDailyNum(121, 0);
               if (0 == freeNum) {
                  this.player.failure(42);
                  return true;
               }

               this.removeItem(itemBase, num, 2, 201, itemBase.id, num, "" + code);
               this.player.senditemUpdateMsg();
               playerResetCustomCache.setDailyReset(121, 0);
               playerResetCustomCache.setDailyReset(122, 0);
               int fastFightAddNum = (Integer)playerResetCustomCache.getDailyNum(127, 0);
               BattleChapterPart battleChapterPart = (BattleChapterPart)this.player.getMgrPart(BattleChapterPart.class);
               battleChapterPart.sendFastBattleResult(0, 0, fastFightAddNum);
            } else if (itemModel.getUseFuncType() == 86) {
               this.removeItem(itemBase, num, 2, 201, itemBase.id, num, "" + code);
               this.player.senditemUpdateMsg();
               ShopLimitModel shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", itemModel.getUseFuncId());
               if (shopLimitModel == null) {
                  this.player.failure(37);
                  return true;
               }

               if (shopLimitModel.getPriceType() == 0) {
                  List<ResourceModel> resourceModels = new ArrayList();
                  GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
                  giftPart.buy(resourceModels, shopLimitModel);
                  this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 2, 201, itemBase.id, num, "" + code);
               } else {
                  RechargeModel rechargeModel = (RechargeModel)ApplicationContextProvider.getModelPoolEntity("rechargePrice", shopLimitModel.getPriceType());
                  if (rechargeModel == null) {
                     this.player.failure(37);
                     return true;
                  }

                  PlayerRechargePart playerRechargePart = (PlayerRechargePart)this.player.getMgrPart(PlayerRechargePart.class);
                  playerRechargePart.recharge("", "", rechargeModel, shopLimitModel.getId(), 2, 201, "");
               }
            } else if (itemModel.getUseFuncType() != 21 && itemModel.getUseFuncType() != 25) {
               if (itemModel.getUseFuncType() == 90) {
                  BattleChapterPart battleChapterPart = (BattleChapterPart)this.player.getMgrPart(BattleChapterPart.class);
                  int fastModelId = battleChapterPart.getFastFightState();
                  ChapterFastBattleModel chapterFastBattleModel = (ChapterFastBattleModel)this.player.getGameModelPool().getEntity("chapterFastBattle", fastModelId);
                  int times = chapterFastBattleModel.getAccelerate() / 60;
                  List<ResourceModel> rewardList = new ArrayList();

                  for(int i = 0; i < num; ++i) {
                     for(ResourceModel resourceModel : battleChapterPart.getRewardsByMinutes(times, true)) {
                        ResourceModel.addResourceToList(rewardList, resourceModel);
                     }
                  }

                  this.removeItem(itemBase, num, 2, 201, itemBase.id, num, "" + code);
                  this.player.addResource(rewardList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 2, 201, itemBase.id, num, "" + code);
               } else {
                  this.removeItem(itemBase, num, 2, 201, itemBase.id, num, "" + code);
                  ResourceModel resourceModel = new ResourceModel(itemModel.getUseFuncType(), itemModel.getUseFuncId(), itemModel.getUseFuncValue() * num);
                  this.player.addResource(resourceModel, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 2, 201, itemBase.id, num, "" + code);
               }
            } else {
               if (!this.player.isSystemOpen(1211)) {
                  this.player.failure(61018);
                  return true;
               }

               ArtifactDressPart artifactDressPart = (ArtifactDressPart)this.player.getMgrPart(ArtifactDressPart.class);
               boolean isSuccess = false;
               if (itemModel.getUseFuncType() == 21) {
                  isSuccess = artifactDressPart.addArtifactDress(itemModel.getUseFuncId());
               } else if (itemModel.getUseFuncType() == 25) {
                  isSuccess = artifactDressPart.addArtifactDressForver(itemModel.getUseFuncId());
               }

               if (isSuccess) {
                  this.removeItem(itemBase, num, 2, 201, itemBase.id, num, "" + code);
                  this.player.senditemUpdateMsg();
               } else {
                  this.player.failure(61012);
               }
            }

            if (itemModel.getTargetclass() == 17) {
               PlayerItemResetCustomCache playerItemResetCustomCache = (PlayerItemResetCustomCache)this.player.getCustomCache("tb_player_item_reset", this.player.getPlayerId());
               playerItemResetCustomCache.addDailyReset(itemModel.getId(), num);
               this.S2C_ItemUseNum_3034(itemModel.getId());
            }

            return true;
         }
      }
   }

   private boolean handleSellItem(int code, int num) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      ItemBase itemBase = itemBagDao.getItemByCode(code);
      if (num <= 0) {
         return this.player.failure(4);
      } else if (itemBase == null) {
         return this.player.failure(2);
      } else if (itemBase.getNum() <= 0) {
         return this.player.failure(6);
      } else if (num > itemBase.getNum()) {
         return this.player.failure(3);
      } else {
         ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", itemBase.id);
         if (itemModel == null) {
            return this.player.failure(5);
         } else if (!itemModel.canSell()) {
            return this.player.failure(8);
         } else if (itemModel.getSell().size() % 3 != 0 && itemModel.getExchange().size() % 3 != 0) {
            this.logger.warn("物品出售配置有误 itemId:{}", itemBase.id);
            return false;
         } else {
            if (itemModel.getCombine() == 1) {
               this.deleteItemById(itemBase.id, num, 2, 202, itemBase.id, num, "" + code, true);
            } else {
               this.deleteItemByCode(itemBase.code, num, 2, 202, itemBase.id, num, "" + code, true);
            }

            List<Integer> rewardsList = new ArrayList();
            List<ResourceModel> returnResources = new ArrayList();
            if (itemModel.getSell().size() > 0) {
               rewardsList.addAll(itemModel.getSell());
            } else if (itemModel.getExchange().size() > 0) {
               rewardsList.addAll(itemModel.getExchange());
            }

            int count = rewardsList.size() / 3;

            for(int i = 0; i < count; ++i) {
               int idx = i * 3;
               Integer resourceType = (Integer)rewardsList.get(idx);
               Integer id = (Integer)rewardsList.get(idx + 1);
               Integer price = (Integer)rewardsList.get(idx + 2);
               int totalParice = price * num;
               returnResources.add(new ResourceModel(resourceType, id, totalParice));
            }

            if (itemBase instanceof HeroAideItem) {
               HeroAideItem heroAideItem = (HeroAideItem)itemBase;
               HeroAidePart heroAidePart = (HeroAidePart)this.player.getMgrPart(HeroAidePart.class);
               heroAidePart.discomposeReturn(heroAideItem.aideId, num, returnResources);
            }

            this.player.addResource(returnResources, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 2, 202, itemBase.id, num, "" + code);
            return true;
         }
      }
   }

   public ResourceModel composeRandom(int groupId) {
      return this.composeRandom(groupId, new HashSet(), new HashSet());
   }

   private ResourceModel composeRandom(int groupId, Set<Integer> filterHeroId, Set<Integer> nationFilter) {
      Map<Integer, ExchangeModel> map = this.player.getGameModelPool().getMap("exchange");
      int totalProbability = 0;
      List<ExchangeModel> list = new ArrayList();
      int priorProbability = 0;
      List<ExchangeModel> priorList = new ArrayList();
      int level = this.player.getPlayerDao().lv;

      for(ExchangeModel exchangeModel : map.values()) {
         if (exchangeModel.getGroup() == groupId && level >= exchangeModel.getLevelNeed()) {
            if (exchangeModel.getObtainType() == 3 && !filterHeroId.contains(exchangeModel.getObtainId())) {
               HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", exchangeModel.getObtainId());
               if (heroModel != null && !nationFilter.contains(heroModel.getNation())) {
                  priorProbability += exchangeModel.getWeight();
                  priorList.add(exchangeModel);
               }
            }

            totalProbability += exchangeModel.getWeight();
            list.add(exchangeModel);
         }
      }

      int actualProbability = priorProbability > 0 ? priorProbability : totalProbability;
      List<ExchangeModel> actualList = priorProbability > 0 ? priorList : list;
      if (actualProbability <= 0) {
         this.logger.warn("exchange.xls 中合成组随不出物品 groupId:{}", groupId);
         return null;
      } else {
         int r = RandomUtil.randInt(actualProbability);
         int tempVal = 0;
         ResourceModel resourceModel = null;

         for(ExchangeModel exchangeItemModel : actualList) {
            tempVal += exchangeItemModel.getWeight();
            if (r < tempVal) {
               resourceModel = new ResourceModel(exchangeItemModel.getObtainType(), exchangeItemModel.getObtainId(), exchangeItemModel.getObtainNum());
               if (resourceModel.getValue() == 0 || resourceModel.getType() == 0) {
                  this.logger.warn("合成将符配置错误 itemId:{}, num:{}", resourceModel.getId(), resourceModel.getValue());
               }
               break;
            }
         }

         return resourceModel;
      }
   }

   public int getItemNum(int id) {
      int num = 0;
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      Map<Integer, ItemBase> itemMap = itemBagDao.getItemMap();
      List<ItemBase> overdueList = new ArrayList();

      for(Map.Entry<Integer, ItemBase> entry : itemMap.entrySet()) {
         ItemBase itemBase = (ItemBase)entry.getValue();
         int currentTime = (int)(System.currentTimeMillis() / 1000L);
         if (itemBase.enableTime > 0 && itemBase.enableTime < currentTime) {
            overdueList.add(itemBase);
         } else if (itemBase.id == id) {
            num += itemBase.getNum();
         }
      }

      if (overdueList.size() > 0) {
         for(ItemBase itemBase : overdueList) {
            String logStr = itemBase.code + ":" + itemBase.num + ":" + itemBase.enableTime;
            this.deleteItemByCode(itemBase.code, itemBase.num, -1, 209, itemBase.code, itemBase.enableTime, logStr);
         }
      }

      return num;
   }

   public List<ItemBase> getItemBaseById(int id) {
      List<ItemBase> itemBaseList = new ArrayList();
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      Map<Integer, ItemBase> itemMap = itemBagDao.getItemMap();

      for(Map.Entry<Integer, ItemBase> entry : itemMap.entrySet()) {
         ItemBase itemBase = (ItemBase)entry.getValue();
         if (itemBase.id == id) {
            itemBaseList.add(itemBase);
         }
      }

      return itemBaseList;
   }

   public ItemBase getAnyItemById(int id) {
      return (ItemBase)this.getItemBaseById(id).stream().findAny().orElse(null);
   }

   public ItemBase getItemByCode(int code) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      return itemBagDao.getItemByCode(code);
   }

   private void saveMail(int id, int num) {
      MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
      List<ResourceModel> list = new ArrayList();
      ResourceModel itemData = new ResourceModel(2, id, num);
      list.add(itemData);
      CentreAwardModel centreAwardModel = (CentreAwardModel)this.player.getGameModelPool().getEntity("centreAward", 131);
      mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), list, 604800000L, 2, 204);
   }

   private DropOutModel getDropOutModel(int groupId) {
      List<DropOutModel> libList = (List)this.player.getGameModelPool().getEntity("custom_dropOut", groupId);
      int totalProbabilityNum = libList.stream().mapToInt((modelx) -> modelx.getOdds()).sum();
      int r = RandomUtil.randInt(totalProbabilityNum);
      int tVal = 0;

      for(DropOutModel model : libList) {
         tVal += model.getOdds();
         if (tVal > r) {
            return model;
         }
      }

      return null;
   }

   private boolean handleOpenSelectBox(int code, int id, int num) {
      ItemBase itemBase = this.getItemByCode(code);
      if (itemBase == null) {
         return this.player.failure(2);
      } else if (itemBase.getNum() < 1) {
         return this.player.failure(4);
      } else if (itemBase.getNum() >= num && num > 0) {
         ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", itemBase.id);
         if (itemModel == null) {
            return this.player.failure(5);
         } else {
            SystemFunctionModel systemModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", itemModel.getBoxUseSystemId());
            if (null != systemModel && !this.player.isSystemOpen(systemModel.getId())) {
               return false;
            } else if (itemModel.getUseFuncType() != 12) {
               return this.player.failure(7);
            } else {
               SelectPackageModel selectPackageModel = (SelectPackageModel)this.player.getGameModelPool().getEntity("selectPackage", id);
               if (selectPackageModel == null) {
                  return this.player.failure(5);
               } else if (selectPackageModel.getGroup() != itemModel.getUseFuncId()) {
                  return this.player.failure(6);
               } else {
                  WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
                  int worldLv = worldMgr.getWorldLv();
                  if (selectPackageModel.getDateStart() != 0 || selectPackageModel.getDateEnd() != 0) {
                     int dateEnd = selectPackageModel.getDateEnd() == -1 ? Integer.MAX_VALUE : selectPackageModel.getDateEnd();
                     int openServerDays = worldMgr.getOpenServerDays();
                     if (openServerDays < selectPackageModel.getDateStart() || openServerDays > dateEnd) {
                        return this.player.failure(76045);
                     }
                  }

                  PlayerDao playerDao = this.player.getPlayerDao();
                  boolean isLvEnough = playerDao.lv >= selectPackageModel.getLvLimit() && worldLv >= selectPackageModel.getWorldlvLimit() || selectPackageModel.getLvLimitEx() > 0 && playerDao.lv >= selectPackageModel.getLvLimitEx();
                  if (!isLvEnough) {
                     return this.player.failure(20);
                  } else {
                     HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                     ResourceModel resourceModel = (ResourceModel)selectPackageModel.getRewards().get(0);
                     if (resourceModel.getType() == 3) {
                        if (!heroBagPart.isEnableAddHero(num)) {
                           this.player.failure(4124);
                           return false;
                        }
                     } else if (resourceModel.getType() == 2) {
                        ItemModel rewardItemModel = (ItemModel)ApplicationContextProvider.getModelPool().getEntity("item", resourceModel.getId());
                        if (rewardItemModel == null) {
                           this.logger.error("玩家{}自选礼包选择的物品不存在 id:{}", this.player.getPlayerId(), resourceModel.getId());
                           return false;
                        }

                        if (rewardItemModel.getSubclass() == 7) {
                           ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
                           List<ItemBase> list = itemBagDao.getItemById(rewardItemModel.getId());
                           if (list.size() > 0) {
                              this.player.failure(76033);
                              return false;
                           }
                        }
                     }

                     if (!this.deleteItemByCode(code, num, 2, 201, id, num, "open sleectBox code:" + code)) {
                        this.logger.info("删除物品是出错 code:{} num:{}", code, num);
                        return false;
                     } else {
                        if (resourceModel.getType() == 3) {
                           heroBagPart.addHeroForAssign(resourceModel.getId(), resourceModel.getValue() * num, 1, selectPackageModel.getStar(), 2, 201, id, num, "open sleectBox code:" + code);
                        } else {
                           this.player.addResource(num, selectPackageModel.getRewards(), 2, 201, id, num, "open sleectBox code:" + code);
                        }

                        this.player.senditemUpdateMsg();
                        BagMsg.S2C_OpenSelectBox_3016.Builder builder = BagMsg.S2C_OpenSelectBox_3016.newBuilder();
                        builder.setCode(code);
                        builder.setId(id);
                        this.player.sendMsg(builder.build());
                        return true;
                     }
                  }
               }
            }
         }
      } else {
         return this.player.failure(4);
      }
   }

   @MsgHandlerAnno
   public void C2S_ItemBuy_3017(BagMsg.C2S_ItemBuy_3017 msg, String source) {
      int duelTokenItemId = this.configManager.getIntDefault("duelTokenItemId", 1005);
      if (duelTokenItemId != msg.getId()) {
         this.logger.info("购买不ID不同，表ID={},购买ID={}", duelTokenItemId, msg.getId());
      } else {
         String duelTokenCost = this.configManager.getStr("duelTokenCost");
         String[] params = duelTokenCost.split(",");
         if (params.length != 3) {
            this.logger.info("配置表参数出错");
         } else if (msg.getNum() <= 10000) {
            if (!ResourceModel.checkTotalNumError(Integer.valueOf(params[2]), msg.getNum())) {
               ResourceModel needItem = new ResourceModel(Integer.valueOf(params[0]), Integer.valueOf(params[1]), Integer.valueOf(params[2]) * msg.getNum());
               if (!this.player.checkResourceNum(needItem)) {
                  this.logger.info("金币不够！");
               } else {
                  this.player.delResource(needItem, 2, 207, msg.getId(), msg.getNum(), "itemBuy");
                  this.player.addResource(2, msg.getId(), msg.getNum(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 2, 207, msg.getId(), msg.getNum(), "itemBuy");
                  BagMsg.S2C_ItemBuyResult_3018.Builder builder = BagMsg.S2C_ItemBuyResult_3018.newBuilder();
                  builder.setResult(1);
                  this.player.sendMsg(builder.build());
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean composeVice(BagMsg.C2S_ViceCompose_3019 msg, String source) {
      int code = msg.getCode();
      int num = msg.getNum();
      if (num <= 0) {
         return this.player.failure(4);
      } else {
         ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
         ItemBase itemBase = itemBagDao.getItemByCode(code);
         if (itemBase == null) {
            return this.player.failure(2);
         } else {
            ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", itemBase.id);
            if (itemModel == null) {
               return this.player.failure(2);
            } else if (itemModel.getUseFuncType() != 16) {
               return this.player.failure(6);
            } else {
               HashMap<Integer, Integer> mapExchangeChip = this.configManager.getIntMap("aideExchange");
               int chipNeedNum = (Integer)mapExchangeChip.getOrDefault(Integer.valueOf(itemModel.getQuality()), 0);
               if (chipNeedNum <= 0) {
                  this.logger.info("config表 viceExchangeChipNum 配置错误");
                  return false;
               } else if (ResourceModel.checkTotalNumError(chipNeedNum, num)) {
                  return false;
               } else if (!this.player.checkResourceNum(2, itemBase.id, chipNeedNum * num)) {
                  return this.player.failure(3);
               } else {
                  this.player.delResource(2, itemBase.id, (long)(chipNeedNum * num), 2, 203, itemBase.id, num, "code:" + code);
                  this.player.addResource(2, itemModel.getUseFuncId(), itemModel.getUseFuncValue() * num, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 2, 203, itemBase.id, num, "code:" + code);
                  BagMsg.S2C_ViceCompose_3020.Builder builder = BagMsg.S2C_ViceCompose_3020.newBuilder();
                  builder.setResult(1);
                  this.player.sendMsg(builder.build());
                  return true;
               }
            }
         }
      }
   }

   public RuneItem addRuneItem(RuneItem data, int module, int reason, int misc1, int misc2, String misc3) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      int code = this.player.getUniqueCode(CodeDefine.ITEM_CODE);
      RuneItem runeItem = new RuneItem(code, data);
      itemBagDao.additem(runeItem, 30);
      this.logItem(runeItem.id, runeItem.getNum(), 1, module, reason, runeItem.code, misc2, misc3);
      this.addOperationLog(runeItem.id, runeItem.getNum(), 1, reason);
      return runeItem;
   }

   public ExclusiveWeaponItem addExclusiveWeaponItem(ExclusiveWeaponItem data, int module, int reason, int misc1, int misc2, String misc3) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      int code = this.player.getUniqueCode(CodeDefine.ITEM_CODE);
      ExclusiveWeaponItem weaponItem = new ExclusiveWeaponItem(code, data);
      itemBagDao.additem(weaponItem, 35);
      this.logItem(weaponItem.id, weaponItem.getNum(), 1, module, reason, weaponItem.code, misc2, misc3);
      this.addOperationLog(weaponItem.id, weaponItem.getNum(), 1, reason);
      ExclusiveWeaponPart exclusiveWeaponPart = (ExclusiveWeaponPart)this.player.getMgrPart(ExclusiveWeaponPart.class);
      exclusiveWeaponPart.addWeaponStarLv(weaponItem.id, weaponItem.recStarLv());
      return weaponItem;
   }

   public GodBeastItem addGodBeastItem(GodBeastItem data, int module, int reason, int misc1, int misc2, String misc3) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      int code = this.player.getUniqueCode(CodeDefine.ITEM_CODE);
      GodBeastItem godBeastItem = new GodBeastItem(code, data);
      itemBagDao.additem(godBeastItem, 32);
      this.logItem(godBeastItem.id, godBeastItem.getNum(), 1, module, reason, godBeastItem.code, misc2, misc3);
      this.addOperationLog(godBeastItem.id, godBeastItem.getNum(), 1, reason);
      return godBeastItem;
   }

   public NeiDanItem addNeiDanItem(NeiDanItem data, int module, int reason, int misc1, int misc2, String misc3) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      int code = this.player.getUniqueCode(CodeDefine.ITEM_CODE);
      NeiDanItem neiDanItem = new NeiDanItem(code, data);
      itemBagDao.additem(neiDanItem, 36);
      this.logItem(neiDanItem.id, neiDanItem.getNum(), 1, module, reason, neiDanItem.code, misc2, misc3);
      this.addOperationLog(neiDanItem.id, neiDanItem.getNum(), 1, reason);
      return neiDanItem;
   }

   public RuneRefineInheritItem addRuneRefineInheritItem(RuneRefineInheritItem data, int module, int reason, int misc1, int misc2, String misc3) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      int code = this.player.getUniqueCode(CodeDefine.ITEM_CODE);
      RuneRefineInheritItem item = new RuneRefineInheritItem(code, data);
      itemBagDao.additem(item, 31);
      this.logItem(item.id, item.getNum(), 1, module, reason, item.code, misc2, misc3);
      this.addOperationLog(item.id, item.getNum(), 1, reason);
      return item;
   }

   public OrnamentItem addOrnament(OrnamentItem data, int module, int reason, int misc1, int misc2, String misc3) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      int code = this.player.getUniqueCode(CodeDefine.ITEM_CODE);
      OrnamentItem ornamentItem = new OrnamentItem(code, data);
      itemBagDao.additem(ornamentItem, 5);
      this.logItem(ornamentItem.id, ornamentItem.getNum(), 1, module, reason, ornamentItem.code, misc2, misc3);
      this.addOperationLog(ornamentItem.id, ornamentItem.getNum(), 1, reason);
      return ornamentItem;
   }

   public RuneStoneItem addRuneStoneItem(RuneStoneItem data, int module, int reason, int misc1, int misc2, String misc3) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      int code = this.player.getUniqueCode(CodeDefine.ITEM_CODE);
      RuneStoneItem runeItem = new RuneStoneItem(code, data);
      itemBagDao.additem(runeItem, 11);
      this.logItem(runeItem.id, runeItem.getNum(), 1, module, reason, runeItem.code, misc2, misc3);
      this.addOperationLog(runeItem.id, runeItem.getNum(), 1, reason);
      return runeItem;
   }

   public RuneStoneItem addMaxRuneStone(int id, List<Integer> proList, int module, int reason, int misc1, int misc2, String misc3) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      int code = this.player.getUniqueCode(CodeDefine.ITEM_CODE);
      RuneStoneItem runeItem = new RuneStoneItem(code, id, proList);
      itemBagDao.additem(runeItem, 11);
      this.logItem(runeItem.id, runeItem.getNum(), 1, module, reason, runeItem.code, misc2, misc3);
      this.addOperationLog(runeItem.id, runeItem.getNum(), 1, reason);
      return runeItem;
   }

   public boolean checkItemExist(int type, int id) {
      switch (type) {
         case 1:
            return PlayerDefine.map.containsKey(id);
         case 2:
            ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", id);
            return itemModel != null;
         case 3:
            HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", id);
            return heroModel != null;
         default:
            return false;
      }
   }

   public void clearBag() {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());

      for(ItemBase itemBase : itemBagDao.itemBag.getMap().values()) {
         itemBase.num = 0;
         this.player.itemUpdateBuilder.addItems(itemBase.toItemInfoBuilder());
         itemBagDao.getItemMap().remove(itemBase.code);
      }

      itemBagDao.itemBag.getMap().clear();
      itemBagDao.updateOp();
      this.player.senditemUpdateMsg();
   }

   public void clearAllBag() {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      Map<Integer, ItemBase> itemMap = itemBagDao.getItemMap();

      for(Map.Entry<Integer, ItemBase> entry : itemMap.entrySet()) {
         ItemBase itemBase = (ItemBase)entry.getValue();
         ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", itemBase.id);
         if (itemModel == null || itemModel.getSubclass() != 7) {
            itemBase.num = 0;
            this.player.itemUpdateBuilder.addItems(itemBase.toItemInfoBuilder());
         }
      }

      itemMap.clear();

      for(Map.Entry<Integer, Class> classEntry : ItemBagDao.clsMap.entrySet()) {
         Integer subClass = (Integer)classEntry.getKey();
         if (subClass != 7) {
            BagParent<ItemBase> bag = itemBagDao.getBagBySublass(subClass);
            bag.getMap().clear();
         }
      }

      itemBagDao.updateOp();
      this.player.senditemUpdateMsg();
   }

   public void resetDaily() {
      this.resetCompeteReam();
      this.player.resetLegalNumRecord();
      this.S2C_ItemUseNum_3034(0);
   }

   public int getMaxCount(int subclass) {
      if (subclass == 14) {
         int petbagNum = this.configManager.getIntDefault("petbagNum", 30);
         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
         return petbagNum + playerExtend.petBagNum;
      } else {
         BagTypeModel bagTypeModel = (BagTypeModel)this.player.getGameModelPool().getEntity("bagtype", subclass);
         return bagTypeModel != null ? bagTypeModel.getMaxcount() : 300;
      }
   }

   public boolean isEnableAddToBag(int subclass, int num) {
      int max = this.getMaxCount(subclass);
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      BagParent<ItemBase> bag = itemBagDao.getBagBySublass(subclass);
      return bag.getBagSize() + num <= max;
   }

   public void gmTestComposeHero(int itemId, int num) {
      ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", itemId);
      if (itemModel != null && itemModel.getUseFuncType() == 14) {
         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
         Queue<Integer> queue = (Queue)playerExtend.heroComposeRecord.computeIfAbsent(itemModel.getStar(), (v) -> new ConcurrentLinkedQueue());
         int recordCount = Integer.parseInt(this.configManager.parseValue("heroComposeNationLimit", 0, "\\|"));
         int appearMax = Integer.parseInt(this.configManager.parseValue("heroComposeNationLimit", 1, "\\|"));

         while(queue.size() > recordCount) {
            queue.poll();
         }

         Map<Integer, Integer> nationMap = new HashMap();
         Set<Integer> nationFilter = new HashSet();
         Set<Integer> filterHeroIds = new HashSet();
         Map<Integer, Integer> resultMap = new HashMap();

         for(int i = 0; i < num; ++i) {
            nationFilter.clear();
            nationMap.clear();

            for(Integer heroId : queue) {
               HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroId);
               if (heroModel != null) {
                  int count = (Integer)nationMap.getOrDefault(heroModel.getNation(), 0);
                  nationMap.put(heroModel.getNation(), count + 1);
               }
            }

            for(Map.Entry<Integer, Integer> entry : nationMap.entrySet()) {
               if ((Integer)entry.getValue() >= appearMax) {
                  nationFilter.add(entry.getKey());
               }
            }

            ResourceModel resourceModel = this.composeRandom(itemModel.getUseFuncId(), filterHeroIds, nationFilter);
            filterHeroIds.clear();
            if (resourceModel != null) {
               filterHeroIds.add(resourceModel.getId());
               int value = (Integer)resultMap.getOrDefault(resourceModel.getId(), 0);
               resultMap.put(resourceModel.getId(), value + 1);
               filterHeroIds.add(resourceModel.getId());
               if (resourceModel.getType() == 3) {
                  queue.add(resourceModel.getId());
                  if (queue.size() > recordCount) {
                     queue.poll();
                  }
               }
            }
         }

         List<Map.Entry<Integer, Integer>> list = new ArrayList(resultMap.entrySet());
         Collections.sort(list, (o1, o2) -> (Integer)o2.getValue() - (Integer)o1.getValue());
         nationMap.clear();
         this.logger.info("测试合成随机武将 测试数量：{}", num);
         int idx = 0;

         for(Map.Entry<Integer, Integer> entry : list) {
            HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", entry.getKey());
            Logger var10000 = this.logger;
            Object[] var10002 = new Object[3];
            ++idx;
            var10002[0] = idx;
            var10002[1] = heroModel.getName();
            var10002[2] = entry.getValue();
            var10000.info("{} - 获得了 {} {} 个", var10002);
            int tempNum = (Integer)nationMap.getOrDefault(heroModel.getNation(), 0);
            nationMap.put(heroModel.getNation(), tempNum + (Integer)entry.getValue());
         }

         this.logger.info("====================阵营统计======================");

         for(Map.Entry<Integer, Integer> entry : nationMap.entrySet()) {
            this.logger.info("阵营:{}, 数量:{}", entry.getKey(), entry.getValue());
         }

      }
   }

   public void gmChangeHero(int sourceHeroId, int destHeroId) {
      Map<Integer, HeroDao> map = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());

      for(Map.Entry<Integer, HeroDao> entry : map.entrySet()) {
         HeroDao heroDao = (HeroDao)entry.getValue();
         if (heroDao.id == sourceHeroId) {
            this.changeHero(heroDao.code, destHeroId);
            break;
         }
      }

   }

   private void changeHero(int heroCode, int destHeroId) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      if (heroDao != null && heroDao.id != destHeroId) {
         HeroModel destHeroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", destHeroId);
         if (destHeroModel.getStar() == 5 && destHeroModel.getSkills().size() == 5) {
            HeroUpgradePart heroUpgradePart = (HeroUpgradePart)this.player.getMgrPart(HeroUpgradePart.class);
            int upStarId = heroUpgradePart.getHeroUpStarId(destHeroId, heroDao.getStar());
            if (upStarId > 0) {
               heroDao.id = destHeroId;
               heroDao.upStarId = upStarId;
               heroDao.updateOp();
               heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_ALL, heroDao);
            }
         }
      }
   }

   public void updateOp() {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      itemBagDao.updateOp();
   }

   public void gmTestRandomBox(String order) {
      String[] orders = order.split(",");
      if (orders.length < 2) {
         this.logger.info("GM命令参数错误，oder={}", order);
      } else {
         int itemId = Integer.valueOf(orders[0]);
         int num = Integer.valueOf(orders[1]);
         ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", itemId);
         if (itemModel == null) {
            this.logger.info("物品为空，ID={}", itemId);
         } else if (itemModel.getUseFuncType() != 0 && itemModel.getUseFuncId() != 0 && itemModel.getUseFuncValue() != 0) {
            List<ResourceModel> resourceModels = this.getResourcesByUseFun(itemModel.getUseFuncType(), itemModel.getUseFuncId(), itemModel.getUseFuncValue(), num);
            Map<Integer, Integer> map = new HashMap();

            for(ResourceModel resourceModel : resourceModels) {
               if (map.containsKey(resourceModel.getId())) {
                  int oldVal = (Integer)map.get(resourceModel.getId());
                  map.put(resourceModel.getId(), oldVal + resourceModel.getValue());
               } else {
                  map.put(resourceModel.getId(), resourceModel.getValue());
               }
            }

            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
               ItemModel model = (ItemModel)this.player.getGameModelPool().getEntity("item", entry.getKey());
               if (model == null) {
                  this.logger.info("没有ID={}的物品，数量={}", entry.getKey(), entry.getValue());
               } else {
                  this.logger.info("ID={}，{},num={}", new Object[]{entry.getKey(), model.getName(), entry.getValue()});
               }
            }

         } else {
            this.logger.info("使用函数为空，Type={}，Id={}，Value={}", new Object[]{itemModel.getUseFuncType(), itemModel.getUseFuncId(), itemModel.getUseFuncValue()});
         }
      }
   }

   public void sendCumulatives() {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      if (playerExtend.cumulatives.size() != 0) {
         BagMsg.S2C_UpdateCumulative_3208.Builder builder = BagMsg.S2C_UpdateCumulative_3208.newBuilder();

         for(Map.Entry<Integer, Integer> entry : playerExtend.cumulatives.entrySet()) {
            CommonMsg.MapDataII.Builder data = CommonMsg.MapDataII.newBuilder();
            data.setKey((Integer)entry.getKey());
            data.setValue((Integer)entry.getValue());
            builder.addValues(data);
         }

         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_EquipExtraCompose_3027(BagMsg.C2S_EquipExtraCompose_3027 msg, String source) {
      EquipExtraSixModel model = (EquipExtraSixModel)ApplicationContextProvider.getModelPoolEntity("equipExtraSix", msg.getItemId());
      if (model != null) {
         List<Integer> baseEquip = model.getBaseEquip();
         int baseEquipNum = (Integer)baseEquip.get(2);
         if (baseEquipNum >= 1) {
            HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
            int pos = -1;
            List<ResourceModel> materialList = new ArrayList();
            if (msg.getHeroCode() > 0) {
               HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());

               for(Map.Entry<Integer, EquipItem> entry : heroDao.equips.entrySet()) {
                  EquipItem equipItem = (EquipItem)entry.getValue();
                  if (equipItem.id == (Integer)baseEquip.get(1)) {
                     pos = (Integer)entry.getKey();
                     break;
                  }
               }

               if (pos == -1) {
                  this.logger.info("珍贵物品合成 - 玩家{} - 武将 {} 身上没有此装备 {}", new Object[]{this.player.getPlayerId(), msg.getHeroCode(), model.getId()});
                  return;
               }

               --baseEquipNum;
            }

            if (baseEquipNum > 0) {
               ResourceModel.addResourceToList(materialList, new ResourceModel((Integer)baseEquip.get(0), (Integer)baseEquip.get(1), baseEquipNum));
            }

            for(ResourceModel resourceModel : model.getCost()) {
               ResourceModel.addResourceToList(materialList, new ResourceModel(resourceModel.getType(), resourceModel.getId(), resourceModel.getValue()));
            }

            if (this.player.checkResourceNum(materialList)) {
               this.player.delResource((List)materialList, 2, 210, 0, 0, "" + model.getId());
               if (pos != -1) {
                  HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
                  ((EquipItem)heroDao.equips.get(pos)).id = model.getId();
                  heroDao.updateOp();
                  heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_EQUIP, heroDao);
                  heroBagPart.updateHeroScore(HeroDefine.HeroPropertyModel.MODEL_WEAR_EQUIP, heroDao);
                  HeroMsg.S2C_WearEquipResult_5042.Builder builder = HeroMsg.S2C_WearEquipResult_5042.newBuilder();
                  builder.setResult(1);
                  builder.setHero(heroDao.toHeroInfo());
                  this.player.sendMsg(builder.build());
                  List<ResourceModel> resourceModels = new ArrayList();
                  resourceModels.add(new ResourceModel(2, model.getId(), 1));
                  this.player.addResourceMsg(resourceModels);
                  this.player.sendResourceMsg();
               } else {
                  this.player.addResource(2, model.getId(), 1, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 2, 210, 0, 0, "" + model.getId());
               }

               BagMsg.S2C_EquipExtraCompose_3028.Builder builder = BagMsg.S2C_EquipExtraCompose_3028.newBuilder();
               builder.setResult(1);
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   public int getMaxCombine(int itemId) {
      if (itemId == this.configManager.getIntDefault("SpecialMoneyId", 88888888)) {
         return this.configManager.getIntDefault("SpecialMoneyNum", 999999);
      } else if (itemId == this.configManager.getIntDefault("JindingId", 1270)) {
         return this.configManager.getIntDefault("JindingNum", 9999999);
      } else {
         ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", itemId);
         return itemModel != null && itemModel.getSubclass() == 1 ? this.configManager.getIntDefault("normalItemBagMaxCombine", 99999) : this.configManager.getIntDefault("normalItemMaxCombine", 9999);
      }
   }

   public void resetCompeteReam() {
      PlayerPublicDao playerPublicDao = this.player.getPublicDao();
      if (playerPublicDao.vip_lv >= this.configManager.getIntDefault("CompeteReamOfViplv", 18)) {
         int itemId = Integer.parseInt(this.configManager.parseValue("CompeteReam", 0, ","));
         int reamTime = this.configManager.getIntDefault("CompeteReamTime", 1);
         int reamTimeLimt = this.configManager.getIntDefault("chatReamTimeLimit", 30);
         if (reamTime > 0 && reamTime <= reamTimeLimt) {
            int ownerNum = this.getItemNum(itemId);
            if (ownerNum > reamTime) {
               this.player.delResource(2, itemId, (long)(ownerNum - reamTime), 2, 712, 0, 0, "");
            } else if (ownerNum < reamTime) {
               this.player.addResource(2, itemId, reamTime - ownerNum, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 2, 712, 0, 0, "");
            }

         }
      }
   }

   @MsgHandlerAnno
   public void C2S_CommonBuy_3031(BagMsg.C2S_CommonBuy_3031 msg, String source) {
      CommonBuyModel model = (CommonBuyModel)ApplicationContextProvider.getModelPoolEntity("CommonBuy", msg.getItemId());
      if (model != null) {
         int num = msg.getNum();
         if (num > 0) {
            if (!ResourceModel.checkTotalNumError(model.getPriceNum(), num)) {
               int totalPrice = model.getPriceNum() * num;
               if (this.player.checkResourceNum(model.getPriceType(), model.getPriceId(), totalPrice)) {
                  this.player.delResource(model.getPriceType(), model.getPriceId(), (long)totalPrice, 2, 211, 0, 0, String.valueOf(model.getItemId()));
                  PlayerMsg.ShowType showType = msg.hasIsShowTips() && msg.getIsShowTips() ? PlayerMsg.ShowType.SHOW_TYPE_COMMON : PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW;
                  this.player.addResource(model.getItemType(), model.getItemId(), num, showType, 2, 211, 0, 0, "");
                  BagMsg.S2C_CommonBuy_3032.Builder builder = BagMsg.S2C_CommonBuy_3032.newBuilder();
                  builder.setItemId(msg.getItemId());
                  this.player.sendMsg(builder.build());
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ItemUseNum_3033(BagMsg.C2S_ItemUseNum_3033 msg, String source) {
      this.S2C_ItemUseNum_3034(0);
   }

   public void S2C_ItemUseNum_3034(int itemId) {
      BagMsg.S2C_ItemUseNum_3034.Builder builder = BagMsg.S2C_ItemUseNum_3034.newBuilder();
      Map<Integer, ItemModel> itemModelMap = this.player.getGameModelPool().getMap("item");
      PlayerItemResetCustomCache playerItemResetCustomCache = (PlayerItemResetCustomCache)this.player.getCustomCache("tb_player_item_reset", this.player.getPlayerId());
      if (itemId > 0) {
         ItemModel itemModel = (ItemModel)itemModelMap.get(itemId);
         if (itemModel != null) {
            Integer dailyNum = (Integer)playerItemResetCustomCache.getDailyNum(itemModel.getId(), 0);
            CommonMsg.MapDataII.Builder dataInfo = CommonMsg.MapDataII.newBuilder();
            dataInfo.setKey(itemId);
            dataInfo.setValue(dailyNum);
            builder.addValues(dataInfo);
         }
      } else {
         for(Map.Entry<Integer, ItemModel> entry : itemModelMap.entrySet()) {
            ItemModel value = (ItemModel)entry.getValue();
            if (value.getTargetclass() == 17) {
               Integer dailyNum = (Integer)playerItemResetCustomCache.getDailyNum(value.getId(), 0);
               CommonMsg.MapDataII.Builder dataInfo = CommonMsg.MapDataII.newBuilder();
               dataInfo.setKey(value.getId());
               dataInfo.setValue(dailyNum);
               builder.addValues(dataInfo);
            }
         }
      }

      this.player.sendMsg(builder.build());
   }

   private void itemInvalidTime(ItemModel model, ItemBase itemBase, int createTime) {
      if (model.getSubclass() == 17) {
         if (createTime > 0 && model.getTargetclass() == 7) {
            itemBase.enableTime = createTime + model.getTimeOut();
         }
      } else if (model.getSubclass() == 18) {
         MedalModel medalModel = (MedalModel)ApplicationContextProvider.getModelPoolEntity("xunzhang", model.getId());
         if (medalModel != null) {
            switch (medalModel.getType()) {
               case 1:
                  itemBase.enableTime = DateUtil.getIntTime(WuDaoDateModel.getNextSeasonSettleTime());
            }
         }

         this.logger.info("玩家【{}】新增勋章【{}】", this.player.getPlayerId(), itemBase);
      }

   }
}
