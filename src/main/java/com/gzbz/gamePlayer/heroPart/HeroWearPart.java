package com.gzbz.gamePlayer.heroPart;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.HeroDao;
import com.gzbz.db.ItemBagDao;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.WarriorSignetDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.equip.EquipStrengthPart;
import com.gzbz.gamePlayer.playerBag.EquipItem;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.gamePlayer.playerBag.OrnamentItem;
import com.gzbz.gamePlayer.playerBag.TotemPart;
import com.gzbz.gamePlayer.playerBag.WarFlag;
import com.gzbz.gamePlayer.playerBag.WarriorSignet;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.EquipEnchantHotModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.ItemPropertyModel;
import com.gzbz.model.WarriorSignetModel;
import com.gzbz.model.WarriorSignetSkillModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.HeroExtendMsg;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.robot.MonsterManager;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
public class HeroWearPart extends PlayerPart {
   Logger logger = LoggerFactory.getLogger(HeroWearPart.class);
   @Autowired
   ConfigManager configManager;

   @MsgHandlerAnno
   public void C2S_WearEquip_5041(HeroMsg.C2S_WearEquip_5041 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao == null) {
         this.logger.info("英雄不存在：" + msg.getHeroCode());
      } else if (!HeroModel.isReplacementHero(heroDao.id)) {
         if (this.isEnableWear(heroDao, msg.getPosition(), CommonMsg.WearType.WEARTYPE_EQUIP)) {
            ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", msg.getItemId());
            if (itemModel != null) {
               if (itemModel.getSubclass() != 2) {
                  this.logger.info("不是装备类型，type={}", itemModel.getSubclass());
               } else if (itemModel.getSeat() != msg.getPosition().getNumber()) {
                  this.logger.error("玩家={}，装备位置不对，position={},装备={}，位置={}", new Object[]{this.player.getPlayerId(), msg.getPosition().getNumber(), itemModel.getName(), itemModel.getSeat()});
               } else {
                  this.heroWearEquip(heroDao, msg.getPosition(), msg.getItemId());
                  heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_EQUIP, heroDao);
                  heroBagPart.updateHeroScore(HeroDefine.HeroPropertyModel.MODEL_WEAR_EQUIP, heroDao);
                  HeroMsg.S2C_WearEquipResult_5042.Builder builder = HeroMsg.S2C_WearEquipResult_5042.newBuilder();
                  builder.setResult(1);
                  builder.setHero(heroDao.toHeroInfo());
                  this.player.sendMsg(builder.build());
                  EquipStrengthPart strengthPart = (EquipStrengthPart)this.player.getMgrPart(EquipStrengthPart.class);
                  strengthPart.sendStrengthSkill(heroDao, 2);
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_UndressEquip_5043(HeroMsg.C2S_UndressEquip_5043 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao == null) {
         this.logger.info("英雄不存在：" + msg.getHeroCode());
      } else if (this.isEnableWear(heroDao, msg.getPosition(), CommonMsg.WearType.WEARTYPE_EQUIP)) {
         boolean result = this.heroUndressEquip(heroDao, msg.getPosition());
         if (!result) {
            this.logger.info("卸下装备错误");
         } else {
            heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_EQUIP, heroDao);
            HeroMsg.S2C_UndressEquipResult_5044.Builder builder = HeroMsg.S2C_UndressEquipResult_5044.newBuilder();
            builder.setResult(1);
            builder.setHero(heroDao.toHeroInfo());
            this.player.sendMsg(builder.build());
            EquipStrengthPart strengthPart = (EquipStrengthPart)this.player.getMgrPart(EquipStrengthPart.class);
            strengthPart.sendStrengthSkill(heroDao, 2);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_OneKeyWear_5045(HeroMsg.C2S_OneKeyWear_5045 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao == null) {
         this.logger.info("英雄不存在：" + msg.getHeroCode());
      } else if (!HeroModel.isReplacementHero(heroDao.id)) {
         ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
         List<ResourceModel> needDelList = new ArrayList();
         List<ResourceModel> needAddList = new ArrayList();

         for(int i = 1; i <= 4; ++i) {
            EquipItem maxPowerEquipItem = itemBagDao.getMaxScoreFromEquopByseat(i);
            if (maxPowerEquipItem != null && maxPowerEquipItem.getNum() != 0) {
               int score = 0;
               ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", maxPowerEquipItem.id);
               if (itemModel.getTargetclass() == 12) {
                  EquipEnchantHotModel equipEnchantHotModel = (EquipEnchantHotModel)this.player.getGameModelPool().getEntity("equipEnchantHot", itemModel.getId());
                  score = equipEnchantHotModel.getScore();
               } else {
                  ItemPropertyModel itemPropertyModel = (ItemPropertyModel)this.player.getGameModelPool().getEntity("itemProperty", itemModel.getProperty());
                  score = itemPropertyModel.getPoint();
               }

               if (heroDao.equips.get(i) != null) {
                  int itemId = ((EquipItem)heroDao.equips.get(i)).id;
                  int oldScore = 0;
                  ItemModel oldeItemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", itemId);
                  if (oldeItemModel.getTargetclass() == 12) {
                     EquipEnchantHotModel equipEnchantHotModel = (EquipEnchantHotModel)this.player.getGameModelPool().getEntity("equipEnchantHot", itemId);
                     oldScore = equipEnchantHotModel.getScore();
                  } else {
                     ItemPropertyModel itemPropertyModel = (ItemPropertyModel)this.player.getGameModelPool().getEntity("itemProperty", itemId);
                     oldScore = itemPropertyModel.getPoint();
                  }

                  if (oldScore >= score) {
                     continue;
                  }

                  needAddList.add(new ResourceModel(2, ((EquipItem)heroDao.equips.get(i)).id, 1));
               }

               needDelList.add(new ResourceModel(2, maxPowerEquipItem.id, 1));
               EquipItem newEquipItem = new EquipItem();
               ItemModel newItemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", maxPowerEquipItem.id);
               newEquipItem.init(0, 1, newItemModel, this.player);
               heroDao.equips.put(i, newEquipItem);
            }
         }

         heroDao.updateOp();
         LogOperationMgr operationMgr = this.player.getOperationMgr();
         if (!needDelList.isEmpty()) {
            this.player.delResource((List)needDelList, 12, 1206, 0, 0, "");
            heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_EQUIP, heroDao);
            heroBagPart.updateHeroScore(HeroDefine.HeroPropertyModel.MODEL_WEAR_EQUIP, heroDao);
            HeroMsg.S2C_OneKeyWearResult_5046.Builder builder = HeroMsg.S2C_OneKeyWearResult_5046.newBuilder();
            builder.setResult(1);
            builder.setHero(heroDao.toHeroInfo());
            this.player.sendMsg(builder.build());
         }

         if (!needAddList.isEmpty()) {
            this.player.addResource(needAddList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 12, 1206, 0, 0, "C2S_OneKeyWear_5045");
         }

         EquipStrengthPart strengthPart = (EquipStrengthPart)this.player.getMgrPart(EquipStrengthPart.class);
         strengthPart.sendStrengthSkill(heroDao, 2);
      }
   }

   @MsgHandlerAnno
   public void C2S_OenKeyUndress_5047(HeroMsg.C2S_OenKeyUndress_5047 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao == null) {
         this.logger.info("英雄不存在：" + msg.getHeroCode());
      } else {
         this.undressAllEquip(heroDao);
         heroDao.updateOp();
         heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_EQUIP, heroDao);
         HeroMsg.S2C_OenKeyUndressResult_5048.Builder builder = HeroMsg.S2C_OenKeyUndressResult_5048.newBuilder();
         builder.setResult(1);
         builder.setHero(heroDao.toHeroInfo());
         this.player.sendMsg(builder.build());
         EquipStrengthPart strengthPart = (EquipStrengthPart)this.player.getMgrPart(EquipStrengthPart.class);
         strengthPart.sendStrengthSkill(heroDao, 2);
      }
   }

   private List<Integer> undressAllEquip(HeroDao heroDao) {
      Iterator<EquipItem> iterator = heroDao.equips.values().iterator();
      List<Integer> itemList = new ArrayList();

      while(iterator.hasNext()) {
         EquipItem equipItem = (EquipItem)iterator.next();
         itemList.add(equipItem.id);
         iterator.remove();
      }

      if (!itemList.isEmpty()) {
         List<ResourceModel> models = new ArrayList();

         for(Integer itemId : itemList) {
            models.add(new ResourceModel(2, itemId, 1));
         }

         this.player.addResource(models, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 12, 1206, 0, 0, "undressAllEquip");
      }

      return itemList;
   }

   @MsgHandlerAnno
   public void C2S_HeroExchangeEquip_13215(HeroExtendMsg.C2S_HeroExchangeEquip_13215 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao slaveHeroDao = heroBagPart.getHeroByCode(msg.getSlaveHeroCode());
      if (slaveHeroDao == null) {
         this.logger.error("英雄不存在：" + msg.getSlaveHeroCode());
      } else if (!slaveHeroDao.equips.containsKey(msg.getPosition())) {
         this.logger.error("英雄位置{}装备不存在：" + msg.getPosition());
      } else {
         HeroDao mainHeroDao = heroBagPart.getHeroByCode(msg.getMainHeroCode());
         if (mainHeroDao == null) {
            this.logger.error("英雄不存在：" + msg.getMainHeroCode());
         } else {
            if (mainHeroDao.equips.containsKey(msg.getPosition())) {
               this.player.addResource(2, ((EquipItem)mainHeroDao.equips.get(msg.getPosition())).id, 1, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 12, 1206, 0, 0, "HeroExchangeEquip");
            }

            Set<Integer> heroCodeList = new HashSet();
            heroCodeList.add(msg.getMainHeroCode());
            heroCodeList.add(msg.getSlaveHeroCode());
            mainHeroDao.equips.put(msg.getPosition(), slaveHeroDao.equips.get(msg.getPosition()));
            mainHeroDao.updateOp();
            slaveHeroDao.equips.remove(msg.getPosition());
            slaveHeroDao.updateOp();
            heroBagPart.flushHeroIdAndArrayingForCodeList(HeroDefine.HeroPropertyModel.MODEL_WEAR_EQUIP, heroCodeList, true, true);
            HeroExtendMsg.S2C_HeroExchangeEquip_13216.Builder builder = HeroExtendMsg.S2C_HeroExchangeEquip_13216.newBuilder();
            builder.setResult(1);
            builder.setMainHeroCode(msg.getMainHeroCode());
            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_WearWarriorSignet_5055(HeroMsg.C2S_WearWarriorSignet_5055 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao == null) {
         this.logger.info("英雄不存在：" + msg.getHeroCode());
      } else if (!HeroModel.isReplacementHero(heroDao.id)) {
         if (this.isEnableWear(heroDao, msg.getPosition(), CommonMsg.WearType.WEARTYPE_WARRIORSIGNET)) {
            ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
            ItemBase itemBase = itemBagPart.getItemByCode(msg.getItemCode());
            if (itemBase == null) {
               this.logger.info("要佩戴的将印为空！itemCode={}", msg.getItemCode());
            } else if (!(itemBase instanceof WarriorSignet)) {
               this.logger.info("不是将印类型");
            } else {
               WarriorSignetModel warriorSignetModel = WarriorSignetDefine.getWarriorSignetModel(itemBase.id);
               if (null == warriorSignetModel) {
                  this.player.failure(37);
               } else if (warriorSignetModel.getHeroId() > 0 && heroDao.id != warriorSignetModel.getHeroId()) {
                  this.player.failure(76210);
               } else {
                  WarriorSignet warriorSignet = (WarriorSignet)itemBase;
                  this.heroWearWarriorSignet(heroDao, msg.getPosition(), warriorSignet);
                  HeroMsg.S2C_WearWarriorSignetResult_5056.Builder builder = HeroMsg.S2C_WearWarriorSignetResult_5056.newBuilder();
                  builder.setResult(1);
                  this.player.sendMsg(builder.build());
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_UndressWarriorSignet_5057(HeroMsg.C2S_UndressWarriorSignet_5057 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao == null) {
         this.logger.info("英雄不存在：" + msg.getHeroCode());
      } else if (this.isEnableWear(heroDao, msg.getPosition(), CommonMsg.WearType.WEARTYPE_WARRIORSIGNET)) {
         WarriorSignet warriorSignet = this.undressWarriorSignet(heroDao, msg.getPosition());
         if (warriorSignet != null) {
            this.player.additemUpdateBuilder(warriorSignet);
            this.player.senditemUpdateMsg();
         }

         heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_WARRIORSIGNET, heroDao);
         HeroMsg.S2C_UndressWarriorSignetResult_5058.Builder builder = HeroMsg.S2C_UndressWarriorSignetResult_5058.newBuilder();
         builder.setResult(1);
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public boolean C2S_WarriorSignetUpQuality_5059(HeroMsg.C2S_WarriorSignetUpQuality_5059 msg, String source) {
      WarriorSignet warriorSignet = this.getWarriorSignet(msg.getIsWear(), msg.getHeroCode(), msg.getPosition().getNumber(), msg.getItemCode());
      if (null == warriorSignet) {
         return this.player.failure(6);
      } else {
         WarriorSignetModel warriorSignetModel = WarriorSignetDefine.getWarriorSignetModel(warriorSignet.id);
         if (null == warriorSignetModel) {
            return this.player.failure(37);
         } else if (warriorSignetModel.getCanImprove() > 0 && warriorSignetModel.getImproveResult() > 0) {
            if (!this.player.checkResourceNum(warriorSignetModel.getImprove())) {
               return this.player.failure(76135);
            } else {
               if (msg.getIsWear()) {
                  warriorSignet.id = warriorSignetModel.getImproveResult();
                  HeroDao heroDao = this.getHeroDao(msg.getHeroCode());
                  heroDao.updateOp();
                  HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                  heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_WARRIORSIGNET, heroDao);
                  CommonMsg.ItemInfo.Builder itemInfoBuilder = CommonMsg.ItemInfo.newBuilder();
                  itemInfoBuilder.setType(2);
                  itemInfoBuilder.setId(warriorSignet.id);
                  itemInfoBuilder.setNum(1);
                  itemInfoBuilder.setCode(warriorSignet.code);
                  itemInfoBuilder.setHeroCode(msg.getHeroCode());
                  itemInfoBuilder.setPos(msg.getPosition().getNumber());
                  this.player.addResourceMsgByBuilder(itemInfoBuilder);
                  this.player.sendResourceMsg();
               } else {
                  ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                  WarriorSignet oldWarriorSignet = new WarriorSignet(0, warriorSignet);
                  oldWarriorSignet.id = warriorSignetModel.getImproveResult();
                  WarriorSignet newWarriorSignet = itemBagPart.addWarriorSignet(oldWarriorSignet, 12, 1240, 0, 0, "");
                  if (null != newWarriorSignet) {
                     this.player.additemUpdateBuilder(newWarriorSignet);
                     itemBagPart.deleteItemByCode(msg.getItemCode(), 1, 12, 1240, 0, 0, "");
                     this.player.senditemUpdateMsg();
                     this.player.addResourceMsg(newWarriorSignet);
                     this.player.sendResourceMsg();
                  }
               }

               this.player.delResource((List)warriorSignetModel.getImprove(), 12, 1240, 0, 0, "");
               HeroMsg.S2C_WarriorSignetUpQuality_5060.Builder resp = HeroMsg.S2C_WarriorSignetUpQuality_5060.newBuilder();
               this.player.sendMsg(resp.build());
               return true;
            }
         } else {
            return this.player.failure(76211);
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_WarriorSignetReCall_5061(HeroMsg.C2S_WarriorSignetReCall_5061 msg, String source) {
      WarriorSignet warriorSignet = this.getWarriorSignet(msg.getIsWear(), msg.getHeroCode(), msg.getPosition().getNumber(), msg.getItemCode());
      if (null == warriorSignet) {
         return this.player.failure(6);
      } else {
         WarriorSignetModel warriorSignetModel = WarriorSignetDefine.getWarriorSignetModel(warriorSignet.id);
         if (null == warriorSignetModel) {
            return this.player.failure(37);
         } else if (warriorSignetModel.getBacktrackId() <= 0) {
            return this.player.failure(76212);
         } else {
            ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", warriorSignetModel.getBacktrackId());
            if (null == itemModel) {
               return this.player.failure(37);
            } else {
               WarriorSignet targetWarrior = new WarriorSignet();
               targetWarrior.init(0, 1, itemModel, this.player);
               if (msg.getIsWear()) {
                  HeroDao heroDao = this.getHeroDao(msg.getHeroCode());
                  heroDao.warriors.put(msg.getPosition().getNumber(), targetWarrior);
                  heroDao.updateOp();
                  HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                  heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_WARRIORSIGNET, heroDao);
                  CommonMsg.ItemInfo.Builder itemInfoBuilder = CommonMsg.ItemInfo.newBuilder();
                  itemInfoBuilder.setType(2);
                  itemInfoBuilder.setId(targetWarrior.id);
                  itemInfoBuilder.setNum(1);
                  itemInfoBuilder.setCode(targetWarrior.code);
                  itemInfoBuilder.setHeroCode(msg.getHeroCode());
                  itemInfoBuilder.setPos(msg.getPosition().getNumber());
                  this.player.addResourceMsgByBuilder(itemInfoBuilder);
                  this.player.sendResourceMsg();
               } else {
                  ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                  WarriorSignet newWarriorSignet = itemBagPart.addWarriorSignet(targetWarrior, 12, 1241, 0, 0, "");
                  if (null != newWarriorSignet) {
                     this.player.additemUpdateBuilder(newWarriorSignet);
                     itemBagPart.deleteItemByCode(msg.getItemCode(), 1, 12, 1241, 0, 0, "");
                     this.player.senditemUpdateMsg();
                     this.player.addResourceMsg(newWarriorSignet);
                     this.player.sendResourceMsg();
                  }
               }

               HeroMsg.S2C_WarriorSignetReCall_5062.Builder resp = HeroMsg.S2C_WarriorSignetReCall_5062.newBuilder();
               this.player.sendMsg(resp.build());
               return true;
            }
         }
      }
   }

   public WarriorSignet getWarriorSignet(boolean isWear, int heroCode, int position, int itemCode) {
      if (isWear) {
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
         if (null == heroDao) {
            this.logger.error("未找到英雄code:{}", heroCode);
            return null;
         } else {
            WarriorSignet warriorSignet = (WarriorSignet)heroDao.warriors.get(position);
            if (null == warriorSignet) {
               this.logger.error("英雄code:{},位置:{},未穿戴将印", heroCode, position);
               return null;
            } else {
               return warriorSignet;
            }
         }
      } else {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         ItemBase itemBase = itemBagPart.getItemByCode(itemCode);
         if (null == itemBase) {
            this.logger.error("道具不存在code:{}", itemCode);
            return null;
         } else if (!(itemBase instanceof WarriorSignet)) {
            this.logger.error("道具code:{},不是将印类型", itemCode);
            return null;
         } else {
            WarriorSignet warriorSignet = (WarriorSignet)itemBase;
            return warriorSignet;
         }
      }
   }

   public HeroDao getHeroDao(int heroCode) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      if (null == heroDao) {
         this.logger.error("HeroDao 未找到对应英雄 heroCode:{}", heroCode);
      }

      return heroDao;
   }

   @MsgHandlerAnno
   public void C2S_LearnWarcraft_5049(HeroMsg.C2S_LearnWarcraft_5049 msg, String source) {
      int position = msg.getPosition().getNumber();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao == null) {
         this.logger.info("英雄不存在：" + msg.getHeroCode());
      } else if (!HeroModel.isReplacementHero(heroDao.id)) {
         if (this.isEnableWear(heroDao, msg.getPosition(), CommonMsg.WearType.WEARTYPE_WARCRAFT)) {
            if (!heroDao.warcrafts.isEmpty()) {
               MonsterManager monsterManager = (MonsterManager)ApplicationContextProvider.getContext().getBean(MonsterManager.class);

               for(Map.Entry<Integer, Integer> entry : heroDao.warcrafts.entrySet()) {
                  if (monsterManager.isSameBaseSkill((Integer)entry.getValue(), msg.getSkillId())) {
                     this.logger.info("有相同的基本技能，source={}，target={}", entry.getValue(), msg.getSkillId());
                     this.player.failure(61013);
                     return;
                  }
               }
            }

            WarriorSignetSkillModel model = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", msg.getSkillId());
            if (model != null) {
               if (!this.player.checkResourceNum(model.getLearnItems())) {
                  this.logger.info("升级物品不够");
               } else {
                  heroDao.warcrafts.put(position, model.getId());
                  heroDao.updateOp();
                  this.player.triggerTask(325, model.getLv(), 1L, 1);
                  this.player.delResource((List)model.getLearnItems(), 12, 1203, 0, 0, "");
                  heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_WARCRAFT, heroDao);
                  HeroMsg.S2C_LearnWarcraftResult_5050.Builder builder = HeroMsg.S2C_LearnWarcraftResult_5050.newBuilder();
                  builder.setResult(1);
                  builder.setInfo(this.getWearInfo(msg.getPosition(), CommonMsg.WearType.WEARTYPE_WARCRAFT, model.getId()));
                  this.player.sendMsg(builder.build());
                  HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
                  String[] skillBook = LogOperationMgr.toRewardsInfo(model.getLearnItems());
                  ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", model.getNextId());
                  this.player.getOperationMgr().addExtraLog(this.player, 124, heroModel == null ? "" : heroModel.getName(), heroDao.getStar() + "", skillBook[0], skillBook[2], skillBook[1], "", itemModel == null ? "" : itemModel.getQuality() + "");
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ForgetWarcraft_5051(HeroMsg.C2S_ForgetWarcraft_5051 msg, String source) {
      int position = msg.getPosition().getNumber();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao == null) {
         this.logger.info("英雄不存在：" + msg.getHeroCode());
      } else if (heroDao.warcrafts != null && !heroDao.warcrafts.isEmpty()) {
         int warcraftId = (Integer)heroDao.warcrafts.get(position);
         if (warcraftId <= 0) {
            this.logger.info("该位置没有战法：" + position);
         } else {
            WarriorSignetSkillModel model = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", warcraftId);
            if (!this.player.checkResourceNum(model.getForgetItems())) {
               this.logger.info("遗忘需要的材料不够");
               this.player.failure(4126);
            } else {
               heroDao.warcrafts.remove(position);
               heroDao.updateOp();
               this.player.delResource((List)model.getForgetItems(), 12, 1204, 0, 0, "");
               List<ResourceModel> addList = this.forgetWarcraftReturns(model);
               this.player.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 12, 1204, 0, 0, "C2S_ForgetWarcraft_5051");
               heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_WARCRAFT, heroDao);
               HeroMsg.S2C_ForgetWarcraftResult_5052.Builder builder = HeroMsg.S2C_ForgetWarcraftResult_5052.newBuilder();
               builder.setResult(1);
               this.player.sendMsg(builder.build());
            }
         }
      } else {
         this.logger.info("战法为空，英雄={}：" + msg.getHeroCode());
      }
   }

   public List<ResourceModel> forgetWarcraft(HeroDao heroDao) {
      List<ResourceModel> resultList = new ArrayList();

      for(Map.Entry<Integer, Integer> entry : heroDao.warcrafts.entrySet()) {
         WarriorSignetSkillModel model = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", entry.getValue());
         if (model != null) {
            for(ResourceModel returnItem : this.forgetWarcraftReturns(model)) {
               ResourceModel.addResourceToList(resultList, returnItem);
            }
         }
      }

      heroDao.warcrafts.clear();
      heroDao.updateOp();
      return resultList;
   }

   public List<ResourceModel> forgetWarcraftReturns(WarriorSignetSkillModel model) {
      List<ResourceModel> addList = new ArrayList();
      if (!model.getLearnItems().isEmpty()) {
         addList.addAll(model.getLearnItems());
      } else {
         while(model != null && model.getLastId() > 0) {
            int id = model.getLastId();
            model = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", id);
            if (model != null) {
               if (!model.getLearnItems().isEmpty()) {
                  for(ResourceModel learnItem : model.getLearnItems()) {
                     ResourceModel.addResourceToList(addList, learnItem);
                  }
               }

               if (!model.getUpItems().isEmpty()) {
                  for(ResourceModel upItem : model.getUpItems()) {
                     ResourceModel.addResourceToList(addList, upItem);
                  }
               }
            }
         }
      }

      List<ResourceModel> newAddList = new ArrayList();

      for(ResourceModel resourceModel : addList) {
         if (resourceModel.getId() == 1006) {
            ResourceModel newModel = new ResourceModel(resourceModel.getType(), resourceModel.getId(), resourceModel.getValue() / 2);
            newAddList.add(newModel);
         } else {
            newAddList.add(resourceModel);
         }
      }

      return newAddList;
   }

   public List<ResourceModel> forgetWarcraft(HeroDao heroDao, List<Integer> forgetList, boolean isForget) {
      List<ResourceModel> resultList = new ArrayList();

      for(Integer position : forgetList) {
         WarriorSignetSkillModel model = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", heroDao.warcrafts.get(position));

         for(ResourceModel returnItem : this.forgetWarcraftReturns(model)) {
            ResourceModel.addResourceToList(resultList, returnItem);
         }
      }

      if (isForget) {
         for(Integer position : forgetList) {
            heroDao.warcrafts.remove(position);
         }

         heroDao.updateOp();
      }

      return resultList;
   }

   @MsgHandlerAnno
   public void C2S_UpgradeWarcraft_5053(HeroMsg.C2S_UpgradeWarcraft_5053 msg, String source) {
      int position = msg.getPosition().getNumber();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao == null) {
         this.logger.info("英雄不存在：" + msg.getHeroCode());
      } else if (heroDao.warcrafts != null && !heroDao.warcrafts.isEmpty()) {
         int warcraftId = (Integer)heroDao.warcrafts.get(position);
         if (warcraftId <= 0) {
            this.logger.info("该位置没有战法：" + position);
         } else {
            WarriorSignetSkillModel model = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", warcraftId);
            if (model.getNextId() <= 0) {
               this.logger.info("已经升级到顶级技能");
            } else if (!this.player.checkResourceNum(model.getUpItems())) {
               this.logger.info("升级需要的材料不够");
            } else {
               int newId = model.getNextId();
               heroDao.warcrafts.put(position, newId);
               heroDao.updateOp();
               this.player.delResource((List)model.getUpItems(), 12, 1205, 0, 0, "");
               heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_WARCRAFT, heroDao);
               HeroMsg.S2C_UpgradeWarcraftResult_5054.Builder builder = HeroMsg.S2C_UpgradeWarcraftResult_5054.newBuilder();
               builder.setResult(1);
               builder.setInfo(this.getWearInfo(msg.getPosition(), CommonMsg.WearType.WEARTYPE_WARCRAFT, newId));
               this.player.sendMsg(builder.build());
               HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
               String[] skillBook = LogOperationMgr.toRewardsInfo((ResourceModel)model.getUpItems().get(0));
               String[] itemStr = LogOperationMgr.toRewardsInfo((ResourceModel)model.getUpItems().get(1));
               ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", model.getNextId());
               this.player.getOperationMgr().addExtraLog(this.player, 124, heroModel == null ? "" : heroModel.getName(), heroDao.getStar() + "", skillBook[0], skillBook[2], skillBook[1], itemStr[1], itemModel == null ? "" : itemModel.getQuality() + "");
               model = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", model.getNextId());
               if (model != null) {
                  this.player.triggerTask(325, model.getLv(), 1L, 1);
               }

            }
         }
      } else {
         this.logger.info("战法为空，英雄={}：" + msg.getHeroCode());
      }
   }

   @MsgHandlerAnno
   public void C2S_WearWarFlag_5211(HeroMsg.C2S_WearWarFlag_5211 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao != null) {
         if (!HeroModel.isReplacementHero(heroDao.id)) {
            int countryWarFlagOpenStar = this.configManager.getIntDefault("countryWarFlagOpenStar", 10);
            if (heroDao.getStar() >= countryWarFlagOpenStar) {
               ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
               ItemBase itemBase = itemBagPart.getItemByCode(msg.getItemCode());
               if (itemBase != null) {
                  if (itemBase instanceof WarFlag) {
                     WarFlag warFlag = (WarFlag)itemBase;
                     if (heroDao.warFlag != null) {
                        WarFlag newBagWarFlag = itemBagPart.addWarFlag(heroDao.warFlag, 12, 1217, heroDao.code, warFlag.id, "WearWarFlag");
                        this.player.additemUpdateBuilder(newBagWarFlag);
                        this.player.senditemUpdateMsg();
                     }

                     heroDao.warFlag = new WarFlag(0, warFlag);
                     heroDao.updateOp();
                     itemBagPart.deleteItemByCode(msg.getItemCode(), 1, 12, 1217, heroDao.code, warFlag.id, "WearWarFlag");
                     this.player.senditemUpdateMsg();
                     heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_WAR_FALG, heroDao);
                     HeroMsg.S2C_WearWarFlag_5212.Builder builder = HeroMsg.S2C_WearWarFlag_5212.newBuilder();
                     builder.setResult(1);
                     builder.setHeroCode(msg.getHeroCode());
                     builder.setItemCode(msg.getItemCode());
                     this.player.sendMsg(builder.build());
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_UndressWarFlag_5213(HeroMsg.C2S_UndressWarFlag_5213 msg, String source) {
      this.handleUndressWarFlag(msg.getHeroCode());
   }

   public int handleUndressWarFlag(int heroCode) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      if (heroDao == null) {
         return -1;
      } else if (heroDao.warFlag == null) {
         return -1;
      } else {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         WarFlag newBagWarFlag = itemBagPart.addWarFlag(heroDao.warFlag, 12, 1217, heroDao.code, heroDao.warFlag.id, "UndressWarFlag");
         this.player.additemUpdateBuilder(newBagWarFlag);
         this.player.senditemUpdateMsg();
         heroDao.warFlag = null;
         heroDao.updateOp();
         heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_WAR_FALG, heroDao);
         HeroMsg.S2C_UndressWarFlag_5214.Builder builder = HeroMsg.S2C_UndressWarFlag_5214.newBuilder();
         builder.setResult(1);
         builder.setHeroCode(heroCode);
         this.player.sendMsg(builder.build());
         return newBagWarFlag.code;
      }
   }

   public HeroMsg.WearInfo.Builder getWearInfo(CommonMsg.WearPosition position, CommonMsg.WearType type, int id) {
      HeroMsg.WearInfo.Builder info_builder = HeroMsg.WearInfo.newBuilder();
      info_builder.setType(type);
      info_builder.setPosition(position);
      info_builder.setId(id);
      return info_builder;
   }

   public boolean isUnlockPosition(HeroDao heroDao, CommonMsg.WearPosition position) {
      boolean isUnlock = true;
      ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
      switch (position) {
         case WEARPOSITION_WARRIORSIGNET_1:
            if (heroDao.getLv() < configManager.getInt("soulSlotUnlock1")) {
               isUnlock = false;
            }
            break;
         case WEARPOSITION_WARRIORSIGNET_2:
            if (heroDao.getStar() < configManager.getInt("soulSlotUnlock2")) {
               isUnlock = false;
            }
            break;
         case WEARPOSITION_WARCRAFT_1:
            if (heroDao.getStar() < configManager.getInt("tacticsSlotUnlock1")) {
               isUnlock = false;
            }
            break;
         case WEARPOSITION_WARCRAFT_2:
            if (heroDao.getStar() < configManager.getInt("tacticsSlotUnlock2")) {
               isUnlock = false;
            }
            break;
         case WEARPOSITION_WARCRAFT_3:
            if (heroDao.getStar() < configManager.getIntDefault("tacticsSlotUnlock3", 13)) {
               isUnlock = false;
            }
            break;
         case WEARPOSITION_WARCRAFT_4:
            if (heroDao.getStar() < configManager.getIntDefault("tacticsSlotUnlock4", 14)) {
               isUnlock = false;
            }
            break;
         case WEARPOSITION_RUNESTONE_2:
            if (heroDao.runeLv < 10) {
               isUnlock = false;
            }
            break;
         case WEARPOSITION_RUNESTONE_3:
            if (heroDao.runeLv < 20) {
               isUnlock = false;
            }
            break;
         case WEARPOSITION_RUNESTONE_4:
            if (heroDao.runeLv < 30) {
               isUnlock = false;
            }
      }

      return isUnlock;
   }

   public boolean isEnableWear(HeroDao heroDao, CommonMsg.WearPosition position, CommonMsg.WearType type) {
      if (!HeroBagPart.isRightWearTypeOfPositon(type, position)) {
         this.logger.info("穿戴类型不对，type={}", type.getNumber());
         return false;
      } else if (!this.isUnlockPosition(heroDao, position)) {
         this.logger.info("位置没有解锁:{}", position);
         return false;
      } else {
         return true;
      }
   }

   public void heroWearEquip(HeroDao heroDao, CommonMsg.WearPosition position, int itemId) {
      if (!this.player.checkResourceNum(2, itemId, 1)) {
         this.logger.info("装备不存在={}", itemId);
      } else {
         LogOperationMgr operationMgr = this.player.getOperationMgr();
         EquipItem equipItem = (EquipItem)heroDao.equips.get(position.getNumber());
         ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", itemId);
         if (equipItem == null) {
            equipItem = new EquipItem();
            equipItem.init(0, 1, itemModel, this.player);
            this.player.delResource(2, itemId, 1L, 12, 1206, 0, 0, "");
            heroDao.equips.put(position.getNumber(), equipItem);
            heroDao.updateOp();
         } else {
            int oldId = equipItem.id;
            this.player.addResource(2, oldId, 1, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 12, 1206, 0, 0, "");
            this.player.delResource(2, itemId, 1L, 12, 1206, 0, 0, "");
            EquipItem newEquipItem = new EquipItem();
            newEquipItem.init(0, 1, itemModel, this.player);
            heroDao.equips.put(position.getNumber(), newEquipItem);
            heroDao.updateOp();
         }

      }
   }

   public boolean heroUndressEquip(HeroDao heroDao, CommonMsg.WearPosition position) {
      EquipItem equipItem = (EquipItem)heroDao.equips.get(position.getNumber());
      if (equipItem != null) {
         int oldId = equipItem.id;
         this.player.addResource(2, oldId, 1, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 12, 1206, 0, 0, "heroUndressEquip");
         heroDao.equips.remove(position.getNumber());
         heroDao.updateOp();
         return true;
      } else {
         return false;
      }
   }

   private void heroWearWarriorSignet(HeroDao heroDao, CommonMsg.WearPosition position, WarriorSignet warriorSignet) {
      WarriorSignet oldWarriorSignet = (WarriorSignet)heroDao.warriors.get(position.getNumber());
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      if (oldWarriorSignet == null) {
         heroDao.warriors.put(position.getNumber(), warriorSignet);
         heroDao.updateOp();
      } else {
         WarriorSignet newWarriorSignet = itemBagPart.addWarriorSignet(oldWarriorSignet, 12, 1206, 0, 0, "");
         if (newWarriorSignet != null) {
            this.player.additemUpdateBuilder(newWarriorSignet);
            this.player.senditemUpdateMsg();
         }

         heroDao.warriors.put(position.getNumber(), warriorSignet);
         heroDao.updateOp();
      }

      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WEAR_WARRIORSIGNET, heroDao);
      heroBagPart.updateHeroScore(HeroDefine.HeroPropertyModel.MODEL_WEAR_WARRIORSIGNET, heroDao);
      itemBagPart.deleteItemByCode(warriorSignet.code, 1, 12, 1206, 0, 0, "");
      this.player.senditemUpdateMsg();
   }

   public WarriorSignet undressWarriorSignet(HeroDao heroDao, CommonMsg.WearPosition position) {
      WarriorSignet warriorSignet = (WarriorSignet)heroDao.warriors.get(position.getNumber());
      if (warriorSignet != null) {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         WarriorSignet newWarriorSignet = itemBagPart.addWarriorSignet(warriorSignet, 12, 1206, 0, 0, "");
         this.player.sendMsg(newWarriorSignet.toItemInfoBuilder().build());
         if (newWarriorSignet != null) {
            this.player.additemUpdateBuilder(newWarriorSignet);
            this.player.senditemUpdateMsg();
         }

         heroDao.warriors.remove(position.getNumber());
         heroDao.updateOp();
         return newWarriorSignet;
      } else {
         return null;
      }
   }

   public void undressAllExclusiveWarriorSignet(HeroDao heroDao) {
      if (heroDao != null) {
         if (!heroDao.warriors.isEmpty()) {
            List<Integer> removePosList = new ArrayList();

            for(Map.Entry<Integer, WarriorSignet> entry : heroDao.warriors.entrySet()) {
               Integer position = (Integer)entry.getKey();
               WarriorSignet value = (WarriorSignet)entry.getValue();
               WarriorSignetModel warriorSignetModel = WarriorSignetDefine.getWarriorSignetModel(value.id);
               if (null != warriorSignetModel && warriorSignetModel.getHeroId() > 0) {
                  removePosList.add(position);
               }
            }

            for(Integer pos : removePosList) {
               CommonMsg.WearPosition wearPosition = CommonMsg.WearPosition.forNumber(pos);
               this.undressWarriorSignet(heroDao, wearPosition);
            }

         }
      }
   }

   public Map<Integer, Integer> undressHeroEquipAndWarrior(int code, boolean isSync) {
      Map<Integer, Integer> allItem = new HashMap();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(code);
      if (heroDao == null) {
         this.logger.info("英雄不存在：" + code);
         return allItem;
      } else {
         List<Integer> equipList = this.undressAllEquip(heroDao);
         WarriorSignet warriorSignet_1 = this.undressWarriorSignet(heroDao, CommonMsg.WearPosition.WEARPOSITION_WARRIORSIGNET_1);
         WarriorSignet warriorSignet_2 = this.undressWarriorSignet(heroDao, CommonMsg.WearPosition.WEARPOSITION_WARRIORSIGNET_2);
         if (!equipList.isEmpty()) {
            for(Integer itemId : equipList) {
               int old = (Integer)allItem.getOrDefault(itemId, 0);
               allItem.put(itemId, old + 1);
            }
         }

         if (warriorSignet_1 != null) {
            int old = (Integer)allItem.getOrDefault(warriorSignet_1.id, 0);
            allItem.put(warriorSignet_1.id, old + 1);
         }

         if (warriorSignet_2 != null) {
            int old = (Integer)allItem.getOrDefault(warriorSignet_2.id, 0);
            allItem.put(warriorSignet_2.id, old + 1);
         }

         heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_ALL, heroDao);
         if (isSync) {
            List<HeroDao> sendList = new ArrayList();
            sendList.add(heroDao);
            heroBagPart.sendHeroList2Client(sendList);
            HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
            heroArrayingPart.flushHeroArrayingMirror(this.player, heroDao);
         }

         return allItem;
      }
   }

   public void undressHeroAllWear(HeroDao heroDao, boolean isSendUpdate, boolean isSendShow, int model, int misc1, int misc2, String misc3) {
      if (heroDao != null) {
         int reason = 1206;
         new ArrayList();
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         if (!heroDao.equips.isEmpty()) {
            for(Map.Entry<Integer, EquipItem> entry : heroDao.equips.entrySet()) {
               List<CommonMsg.ItemInfo.Builder> list = itemBagPart.addItem(((EquipItem)entry.getValue()).id, 1, model, reason, misc1, misc2, misc3, 0);
               this.player.addResourceMsgByBuilder(list);
            }
         }

         if (!heroDao.warriors.isEmpty()) {
            for(Map.Entry<Integer, WarriorSignet> entry : heroDao.warriors.entrySet()) {
               WarriorSignet newWarriorSignet = itemBagPart.addWarriorSignet((WarriorSignet)entry.getValue(), model, reason, misc1, misc2, misc3);
               this.player.additemUpdateBuilder(newWarriorSignet);
               this.player.addResourceMsg(newWarriorSignet);
            }
         }

         if (heroDao.warFlag != null) {
            itemBagPart.addWarFlag(heroDao.warFlag, model, reason, misc1, misc2, misc3);
            this.player.additemUpdateBuilder(heroDao.warFlag);
            this.player.addResourceMsg(heroDao.warFlag);
         }

         if (!heroDao.ornament.isEmpty()) {
            for(Map.Entry<Integer, OrnamentItem> entry : heroDao.ornament.entrySet()) {
               OrnamentItem ornamentItem = itemBagPart.addOrnament((OrnamentItem)entry.getValue(), model, reason, misc1, misc2, misc3);
               this.player.additemUpdateBuilder(ornamentItem);
               this.player.addResourceMsg(ornamentItem);
            }
         }

         if (heroDao.getTotem() != null) {
            TotemPart totemPart = (TotemPart)this.player.getMgrPart(TotemPart.class);
            totemPart.takeOffTotem(heroDao.code);
         }

         if (isSendUpdate) {
            this.player.senditemUpdateMsg();
         }

         if (isSendShow) {
            this.player.sendResourceMsg();
         }

      }
   }

   public List<ResourceModel> getHeroEquips(int code) {
      List<ResourceModel> list = new ArrayList();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(code);

      for(Map.Entry<Integer, EquipItem> entry : heroDao.equips.entrySet()) {
         list.add(new ResourceModel(2, ((EquipItem)entry.getValue()).id, 1));
      }

      for(Map.Entry<Integer, Integer> entry : heroDao.warcrafts.entrySet()) {
         list.add(new ResourceModel(2, (Integer)entry.getValue(), 1));
      }

      for(Map.Entry<Integer, WarriorSignet> entry : heroDao.warriors.entrySet()) {
         list.add(new ResourceModel(2, ((WarriorSignet)entry.getValue()).id, 1));
      }

      for(Map.Entry<Integer, OrnamentItem> entry : heroDao.ornament.entrySet()) {
         list.add(new ResourceModel(2, ((OrnamentItem)entry.getValue()).id, 1));
      }

      if (heroDao.warFlag != null) {
         list.add(new ResourceModel(2, heroDao.warFlag.id, 1));
      }

      return list;
   }
}
