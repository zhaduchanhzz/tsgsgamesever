package com.gzbz.gamePlayer.playerBag;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.HeroDao;
import com.gzbz.db.ItemBagDao;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.HeroModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.TotemBreachModel;
import com.gzbz.model.TotemUpgradeModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.TotemMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class TotemPart extends PlayerPart {
   @Autowired
   ConfigManager configManager;

   @MsgHandlerAnno
   public boolean C2S_Upgrade_10701(TotemMsg.C2S_Upgrade_10701 msg, String source) {
      int code = msg.getCode();
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      Totem totem = itemBagDao.totemBag.getItemByCode(code);
      if (totem == null) {
         return this.player.failure(2);
      } else {
         TotemBreachModel breachModel = this.getTotemBreachModel(totem.id, totem.breachLv);
         if (breachModel == null) {
            this.logger.info("图腾对应配置错误 level={}, breach={}", totem.level, totem.breachLv);
            return false;
         } else if (totem.level >= breachModel.getLimitLv()) {
            return this.player.failure(40001);
         } else {
            TotemUpgradeModel upgradeModel = this.getTotemUpgradeModel(totem.id, totem.level);
            if (upgradeModel == null) {
               return this.player.failure(6);
            } else if (!this.player.checkResourceNum(upgradeModel.getNeedItems())) {
               return this.player.failure(3);
            } else {
               this.player.delResource((List)upgradeModel.getNeedItems(), 40, 4001, 0, 0, "totemBreach_10701 level:" + (totem.level + 1));
               ++totem.level;
               itemBagDao.updateOp();
               this.updateHeroTotemProperty(totem.heroCode);
               TotemMsg.S2C_Upgrade_10702.Builder builder = TotemMsg.S2C_Upgrade_10702.newBuilder();
               builder.setCode(code);
               builder.setLevel(totem.level);
               this.player.sendMsg(builder.build());
               GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
               giftPart.triggerTimeLimitGift(13, totem.level);
               return true;
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Breach_10703(TotemMsg.C2S_Breach_10703 msg, String source) {
      int code = msg.getCode();
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      Totem totem = itemBagDao.totemBag.getItemByCode(code);
      if (totem == null) {
         return this.player.failure(2);
      } else {
         TotemBreachModel curBreachModel = this.getTotemBreachModel(totem.id, totem.breachLv);
         if (curBreachModel == null) {
            this.logger.info("图腾升阶对应配置错误 totemBreach level={}, breach={}", totem.level, totem.breachLv);
            return false;
         } else if (curBreachModel.getLimitLv() != totem.level) {
            return this.player.failure(40002);
         } else {
            TotemBreachModel nextBreachModel = this.getTotemBreachModel(totem.id, totem.breachLv + 1);
            if (nextBreachModel == null) {
               return this.player.failure(40003);
            } else if (!this.player.checkResourceNum(curBreachModel.getNeedItems())) {
               return this.player.failure(3);
            } else {
               this.player.delResource((List)curBreachModel.getNeedItems(), 40, 4002, 0, 0, "totemBreach_10703 breachLv:" + (totem.breachLv + 1));
               ++totem.breachLv;
               itemBagDao.updateOp();
               this.updateHeroTotemProperty(totem.heroCode);
               TotemMsg.S2C_Breach_10704.Builder builder = TotemMsg.S2C_Breach_10704.newBuilder();
               builder.setCode(code);
               builder.setBreachLv(totem.breachLv);
               this.player.sendMsg(builder.build());
               return true;
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_PutOn_10705(TotemMsg.C2S_PutOn_10705 msg, String source) {
      if (!this.player.isSystemOpen(2089)) {
         return this.player.failure(21);
      } else {
         int code = msg.getCode();
         int heroCode = msg.getHeroCode();
         int chCode = msg.getChCode();
         if (code == chCode) {
            return this.player.failure(40007);
         } else {
            HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
            HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
            if (heroDao == null) {
               return this.player.failure(4100);
            } else if (HeroModel.isReplacementHero(heroDao.id)) {
               return false;
            } else {
               SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 2089);
               if (heroDao.getStar() < systemFunctionModel.getHeroStarLevel()) {
                  return this.player.failure(40008);
               } else {
                  ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
                  Totem totem = itemBagDao.totemBag.getItemByCode(code);
                  if (totem == null) {
                     return this.player.failure(2);
                  } else {
                     int oriWearHero = totem.heroCode;
                     BagParent bag = itemBagDao.getBagBySublass(7);
                     Map<Integer, Totem> map = bag.getMap();

                     for(Map.Entry<Integer, Totem> entry : map.entrySet()) {
                        Totem tempTotem = (Totem)entry.getValue();
                        if (tempTotem.heroCode > 0 && tempTotem.heroCode == heroCode) {
                           tempTotem.heroCode = 0;
                        }
                     }

                     totem.heroCode = heroCode;
                     itemBagDao.updateOp();
                     this.updateHeroTotemProperty(heroCode);
                     if (oriWearHero > 0) {
                        this.updateHeroTotemProperty(oriWearHero);
                     }

                     TotemMsg.S2C_PutOn_10706.Builder builder = TotemMsg.S2C_PutOn_10706.newBuilder();
                     builder.setCode(code);
                     builder.setHeroCode(heroCode);
                     builder.setChCode(chCode);
                     this.player.sendMsg(builder.build());
                     return true;
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_TakeOff_10707(TotemMsg.C2S_TakeOff_10707 msg, String source) {
      int code = msg.getCode();
      int heroCode = msg.getHeroCode();
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      Totem totem = itemBagDao.totemBag.getItemByCode(code);
      if (totem == null) {
         return this.player.failure(2);
      } else if (0 != totem.heroCode && totem.heroCode == heroCode) {
         this.takeOffTotem(heroCode);
         return true;
      } else {
         return this.player.failure(40005);
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Reset_10709(TotemMsg.C2S_Reset_10709 msg, String source) {
      int code = msg.getCode();
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      Totem totem = itemBagDao.totemBag.getItemByCode(code);
      if (totem == null) {
         return this.player.failure(2);
      } else if (totem.level <= 1) {
         return this.player.failure(40006);
      } else {
         List<ResourceModel> resourceModels = this.getMaterials(code);
         if (resourceModels.size() > 0) {
            this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 40, 4003, 0, 0, String.format("code:%d, level:%d, breachLv:%d", code, totem.level, totem.breachLv));
         }

         totem.resetData();
         itemBagDao.updateOp();
         if (totem.heroCode > 0) {
            this.updateHeroTotemProperty(totem.heroCode);
         }

         TotemMsg.S2C_Reset_10710.Builder builder = TotemMsg.S2C_Reset_10710.newBuilder();
         builder.setCode(code);
         builder.setLevel(1);
         builder.setBreachLv(1);
         this.player.sendMsg(builder.build());
         return true;
      }
   }

   public TotemBreachModel getTotemBreachModel(int totemId, int breackLv) {
      String key = String.format("%d_%d", totemId, breackLv);
      return (TotemBreachModel)ApplicationContextProvider.getModelPool().getEntity("custom_totemBreach", key);
   }

   public TotemUpgradeModel getTotemUpgradeModel(int totemId, int level) {
      String key = String.format("%d_%d", totemId, level);
      return (TotemUpgradeModel)ApplicationContextProvider.getModelPool().getEntity("custom_totemUpgrade", key);
   }

   private List<ResourceModel> getMaterials(int code) {
      List<ResourceModel> list = new ArrayList();
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      Totem totem = itemBagDao.totemBag.getItemByCode(code);
      if (totem == null) {
         this.logger.info("没有code为{}的图腾", code);
         return list;
      } else {
         int level = 1;

         for(TotemUpgradeModel upgradeModel = this.getTotemUpgradeModel(totem.id, level); totem.level > level && upgradeModel != null; upgradeModel = this.getTotemUpgradeModel(totem.id, level)) {
            list.addAll(upgradeModel.getNeedItems());
            ++level;
         }

         int breachLv = 1;

         for(TotemBreachModel breachModel = this.getTotemBreachModel(totem.id, breachLv); totem.breachLv > breachLv && breachModel != null; breachModel = this.getTotemBreachModel(totem.id, breachLv)) {
            list.addAll(breachModel.getNeedItems());
            ++breachLv;
         }

         List<ResourceModel> temp = new ArrayList();
         list.forEach((resourceModel) -> ResourceModel.addResourceToList(temp, resourceModel));
         return temp;
      }
   }

   public List<PropertyModel> getHeroTotemProperty(int heroCode) {
      List<PropertyModel> list = new ArrayList();
      if (heroCode <= 0) {
         return list;
      } else {
         ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
         BagParent bag = itemBagDao.getBagBySublass(7);
         Map<Integer, Totem> map = bag.getMap();

         for(Map.Entry<Integer, Totem> entry : map.entrySet()) {
            Totem totem = (Totem)entry.getValue();
            if (totem.heroCode > 0 && totem.heroCode == heroCode) {
               TotemUpgradeModel upgradeModel = this.getTotemUpgradeModel(totem.id, totem.level);
               if (upgradeModel != null) {
                  list.addAll(upgradeModel.getPropertys());
               }

               list.addAll(this.getBreachProperty(totem.id, totem.breachLv));
               break;
            }
         }

         return list;
      }
   }

   private List<PropertyModel> getBreachProperty(int totemId, int breachLv) {
      List<PropertyModel> list = new ArrayList();
      int tempLv = 1;

      for(TotemBreachModel breachModel = this.getTotemBreachModel(totemId, tempLv); breachLv > tempLv && breachModel != null; breachModel = this.getTotemBreachModel(totemId, tempLv)) {
         list.addAll(breachModel.getPropertys());
         ++tempLv;
      }

      return list;
   }

   private void updateHeroTotemProperty(int heroCode) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      if (heroDao != null) {
         heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_TOTEM, heroDao);
      }
   }

   public Totem getTotemByHeroCode(int heroCode) {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      BagParent bag = itemBagDao.getBagBySublass(7);
      Map<Integer, Totem> map = bag.getMap();

      for(Map.Entry<Integer, Totem> entry : map.entrySet()) {
         Totem tempTotem = (Totem)entry.getValue();
         if (tempTotem.heroCode > 0 && tempTotem.heroCode == heroCode) {
            return tempTotem;
         }
      }

      return null;
   }

   public void takeOffTotem(int heroCode) {
      Totem totem = this.getTotemByHeroCode(heroCode);
      if (totem != null) {
         ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
         totem.heroCode = 0;
         itemBagDao.updateOp();
         this.updateHeroTotemProperty(heroCode);
         TotemMsg.S2C_TakeOff_10708.Builder builder = TotemMsg.S2C_TakeOff_10708.newBuilder();
         builder.setCode(totem.code);
         builder.setHeroCode(heroCode);
         this.player.sendMsg(builder.build());
      }
   }
}
