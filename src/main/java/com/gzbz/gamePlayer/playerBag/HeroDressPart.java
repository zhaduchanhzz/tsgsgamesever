package com.gzbz.gamePlayer.playerBag;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.HeroDao;
import com.gzbz.db.HeroDressDao;
import com.gzbz.db.HeroPalaceDao;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.armyArray.ArmyArrayPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroPalacePart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.HeroDressModel;
import com.gzbz.model.HeroDressStrongModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.HeroDressMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import jodd.util.ArraysUtil;
import misc.DateUtil;
import misc.MapUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class HeroDressPart extends PlayerPart {
   Logger logger = LoggerFactory.getLogger(HeroDressPart.class);

   public void loginHandle() {
      this.checkEndTimeAndSetProperty();
   }

   @MsgHandlerAnno
   public void C2S_Main_11201(HeroDressMsg.C2S_Main_11201 msg, String source) {
      this.S2C_MainResult_11202();
   }

   @MsgHandlerAnno
   public void C2S_DelDress_11203(HeroDressMsg.C2S_DelDress_11203 msg, String source) {
      this.logger.info("客户端检查到皮肤到期了，皮肤ID={}", msg.getIdCount() == 0 ? "null" : ArraysUtil.toString(msg.getIdList().toArray()));
      this.flushHero();
   }

   @MsgHandlerAnno
   public void C2S_Wear_11205(HeroDressMsg.C2S_Wear_11205 msg, String source) {
      int heroCode = msg.getHeroCode();
      int dressId = msg.getDressId();
      this.wearDress(heroCode, dressId);
      HeroDressMsg.S2C_WearResult_11206.Builder builder = HeroDressMsg.S2C_WearResult_11206.newBuilder();
      builder.setResult(1);
      this.player.sendMsg(builder.build());
   }

   public void wearDress(int heroCode, int dressId) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      if (heroDao == null) {
         this.logger.info("英雄不存在，code={}", heroCode);
      } else {
         HeroDressDao heroDressDao = this.getHeroDressDaoByDressId(dressId);
         if (heroDressDao == null) {
            this.logger.info("玩家={}，皮肤不存在={}", this.player.getPlayerId(), dressId);
         } else if (heroDressDao.endTime > 0L && System.currentTimeMillis() > heroDressDao.endTime) {
            this.logger.info("皮肤已过期，玩家={}，ID={},过期时间={}", new Object[]{this.player.getPlayerId(), dressId, DateUtil.transferLongToDate(heroDressDao.endTime)});
            this.flushHero();
         } else if (heroDressDao.heroId == heroDao.id) {
            this.logger.info("英雄已经使用该皮肤，玩家={}，ID={}", this.player.getPlayerId(), dressId);
         } else {
            HeroDressModel heroDressModel = (HeroDressModel)this.player.getGameModelPool().getEntity("heroDress", dressId);
            if (heroDressModel.getDressType() == HeroDefine.HERO_DRESS_TYPE_PALACE) {
               Map<Integer, HeroModel> palaceHeroMap = this.player.getGameModelPool().getMap("customPalaceHero");
               if (!palaceHeroMap.containsKey(heroDao.id)) {
                  this.logger.info("不是君主府英雄,无法使用该皮肤，玩家={}，dressId={},heroId={}", new Object[]{this.player.getPlayerId(), dressId, heroDressDao.heroId});
                  return;
               }
            }

            this.unDressHeroSkin(heroDao.id);
            heroDressDao.heroId = heroDao.id;
            heroDressDao.updateOp();
            this.checkEndTimeAndSetProperty();
            List<Integer> heroIdList = new ArrayList();
            heroIdList.add(heroDao.id);
            heroBagPart.flushHeroIdAndArraying(HeroDefine.HeroPropertyModel.MODEL_HERO_DRESS, heroIdList);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_Undress_11207(HeroDressMsg.C2S_Undress_11207 msg, String source) {
      int heroCode = msg.getHeroCode();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      if (heroDao == null) {
         this.logger.info("英雄不存在，code={}", heroCode);
      } else {
         HeroDressDao heroDressDao = this.getEnableDaoByHeroId(heroDao.id);
         if (heroDressDao == null) {
            this.logger.info("英雄没有装备皮肤，英雄ID={}", heroDao.id);
         } else if (heroDressDao.endTime > 0L && System.currentTimeMillis() > heroDressDao.endTime) {
            this.logger.info("皮肤已过期，玩家={}，ID={},过期时间={}", new Object[]{this.player.getPlayerId(), heroDressDao.id, DateUtil.transferLongToDate(heroDressDao.endTime)});
            this.flushHero();
         } else {
            this.unDressHeroSkin(heroDao.id);
            this.checkEndTimeAndSetProperty();
            List<Integer> heroIdList = new ArrayList();
            heroIdList.add(heroDao.id);
            heroBagPart.flushHeroIdAndArraying(HeroDefine.HeroPropertyModel.MODEL_HERO_DRESS, heroIdList);
            HeroDressMsg.S2C_UndressResult_11208.Builder builder = HeroDressMsg.S2C_UndressResult_11208.newBuilder();
            builder.setResult(1);
            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_Upgrade_11209(HeroDressMsg.C2S_Upgrade_11209 msg, String source) {
      int dressId = msg.getDressId();
      HeroDressDao heroDressDao = this.getHeroDressDaoByDressId(dressId);
      if (heroDressDao == null) {
         this.logger.info("英雄皮肤不存在，ID={}", dressId);
      } else if (heroDressDao.endTime > 0L && System.currentTimeMillis() > heroDressDao.endTime) {
         this.logger.info("皮肤已过期，玩家={}，ID={},过期时间={}", new Object[]{this.player.getPlayerId(), heroDressDao.id, DateUtil.transferLongToDate(heroDressDao.endTime)});
         this.flushHero();
      } else if (heroDressDao.endTime != 0L) {
         this.logger.info("只有永久皮肤可以升级");
         this.player.failure(45004);
      } else {
         HeroDressStrongModel heroDressStrongModel = this.getHeroDressStrongModel(heroDressDao.id, heroDressDao.lv + 1);
         if (heroDressStrongModel == null) {
            this.player.failure(45005);
         } else if (this.player.checkResourceNum(heroDressStrongModel.getConsumes())) {
            this.player.delResource((List)heroDressStrongModel.getConsumes(), 45, 4501, 0, 0, "");
            ++heroDressDao.lv;
            heroDressDao.updateOp();
            Set<Integer> set = new HashSet();
            if (heroDressDao.heroId > 0) {
               set.add(heroDressDao.heroId);
            }

            this.flushHero();
            HeroDressMsg.S2C_UpgradeResult_11210.Builder builder = HeroDressMsg.S2C_UpgradeResult_11210.newBuilder();
            builder.setResult(1);
            builder.setInfo(this.toHeroDressInfo(heroDressDao));
            this.player.sendMsg(builder.build());
            this.player.pushTask(() -> this.dressLog("升级", heroDressDao.id, heroDressDao.lv, heroDressStrongModel.getConsumes()));
         }
      }
   }

   public void dressLog(String optionName, int dressId, int lv, List<ResourceModel> list) {
      String dressName = "";
      HeroDressModel heroDressModel = (HeroDressModel)this.player.getGameModelPool().getEntity("heroDress", dressId);
      if (heroDressModel != null) {
         dressName = heroDressModel.getName();
      }

      String itemId = "";
      String itemVal = "";
      if (!list.isEmpty()) {
         String[] usedStr = LogOperationMgr.toRewardsInfo(list);
         itemId = usedStr[0];
         itemVal = usedStr[1];
      }

      this.player.getOperationMgr().addExtraLog(this.player, 215, optionName, dressName, lv + "", itemId, itemVal);
   }

   @MsgHandlerAnno
   public void C2S_Decompose_11211(HeroDressMsg.C2S_Decompose_11211 msg, String source) {
      int dressId = msg.getDressId();
      HeroDressDao heroDressDao = this.getHeroDressDaoByDressId(dressId);
      if (heroDressDao == null) {
         this.logger.info("英雄皮肤不存在，ID={}", dressId);
      } else if (heroDressDao.endTime > 0L && System.currentTimeMillis() > heroDressDao.endTime) {
         this.logger.info("皮肤已过期，玩家={}，ID={},过期时间={}", new Object[]{this.player.getPlayerId(), heroDressDao.id, DateUtil.transferLongToDate(heroDressDao.endTime)});
         this.flushHero();
      } else if (heroDressDao.endTime != 0L) {
         this.logger.info("只有永久皮肤可以分解");
         this.player.failure(45004);
      } else {
         TreeMap<Integer, HeroDressStrongModel> dressMap = (TreeMap)this.player.getGameModelPool().getEntity("customHeroDressStrong", dressId);
         if (dressMap == null) {
            this.logger.info("分解模板不存在，当前等级={}", heroDressDao.lv);
         } else {
            List<ResourceModel> addList = new ArrayList();
            HeroDressModel heroDressModel = (HeroDressModel)this.player.getGameModelPool().getEntity("heroDress", heroDressDao.id);
            if (heroDressModel.getDressType() == HeroDefine.HERO_DRESS_TYPE_AWAKEN) {
               this.player.failure(61219);
            } else {
               ResourceModel skinItem = new ResourceModel(2, heroDressModel.getItemId(), 1);
               addList.add(skinItem);
               List<ResourceModel> lvUpList = new ArrayList();
               if (heroDressDao.lv >= 1) {
                  for(int i = 1; i <= heroDressDao.lv; ++i) {
                     HeroDressStrongModel model = (HeroDressStrongModel)dressMap.get(i);

                     for(ResourceModel consume : model.getConsumes()) {
                        ResourceModel.addResourceToList(lvUpList, consume);
                     }
                  }
               }

               int skinResolveRate = 10000;
               if (heroDressModel.getDressType() != HeroDefine.HERO_DRESS_TYPE_COLLECTION) {
                  skinResolveRate = ApplicationContextProvider.getConfigInt("skinResolveRate", 6000);
               }

               for(ResourceModel resourceModel : lvUpList) {
                  ResourceModel.addResourceToList(addList, new ResourceModel(resourceModel.getType(), resourceModel.getId(), resourceModel.getValue() * skinResolveRate / 10000));
               }

               this.player.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 45, 4503, heroDressDao.id, heroDressDao.lv, "");
               List<Integer> heroIdList = new ArrayList();
               if (heroDressDao.heroId > 0) {
                  heroIdList.add(heroDressDao.heroId);
               }

               int id = heroDressDao.id;
               int lv = heroDressDao.lv;
               this.player.deleteDao(heroDressDao, true);
               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               this.checkEndTimeAndSetProperty();
               if (heroDressModel.getDressType() == HeroDefine.HERO_DRESS_TYPE_COLLECTION) {
                  heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_HERO_DRESS);
               } else {
                  heroBagPart.flushHeroIdAndArraying(HeroDefine.HeroPropertyModel.MODEL_HERO_DRESS, heroIdList);
               }

               HeroDressMsg.S2C_DecomposeResult_11212.Builder builder = HeroDressMsg.S2C_DecomposeResult_11212.newBuilder();
               builder.setResult(1);
               builder.setDressId(dressId);
               this.player.sendMsg(builder.build());
               this.dressLog("皮肤重置", id, lv, lvUpList);
            }
         }
      }
   }

   public void S2C_MainResult_11202() {
      Map<Integer, HeroDressDao> map = this.player.<Integer, HeroDressDao>getMap("tb_hero_dress", this.player.getPlayerId());
      HeroDressMsg.S2C_MainResult_11202.Builder builder = HeroDressMsg.S2C_MainResult_11202.newBuilder();
      if (map != null) {
         for(Map.Entry<Integer, HeroDressDao> entry : map.entrySet()) {
            builder.addInfos(this.toHeroDressInfo((HeroDressDao)entry.getValue()));
         }
      }

      this.player.sendMsg(builder.build());
   }

   public void S2C_DelDress_11204(List<Integer> needDelList) {
      HeroDressMsg.S2C_DelDress_11204.Builder builder = HeroDressMsg.S2C_DelDress_11204.newBuilder();

      for(Integer dressId : needDelList) {
         builder.addId(dressId);
      }

      this.player.sendMsg(builder.build());
   }

   public int addHeroDressByUseItem(ItemModel itemModel) {
      HeroDressModel heroDressModel = (HeroDressModel)this.player.getGameModelPool().getEntity("heroDress", itemModel.getUseFuncId());
      if (heroDressModel == null) {
         return 0;
      } else {
         HeroPalacePart heroPalacePart = (HeroPalacePart)this.player.getMgrPart(HeroPalacePart.class);
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         HeroDao palaceHero = null;
         if (heroDressModel.getDressType() == HeroDefine.HERO_DRESS_TYPE_PALACE) {
            HeroPalaceDao heroPalaceDao = heroPalacePart.getHeroPalaceDao();
            if (heroPalaceDao.heroCode <= 0) {
               return 61064;
            }

            palaceHero = heroBagPart.getHeroByCode(heroPalaceDao.heroCode);
            if (palaceHero == null) {
               return 61064;
            }
         } else {
            List<HeroDao> heroDaoList = heroBagPart.getHeroById(heroDressModel.getHeroId());
            if (heroDaoList.isEmpty()) {
               return 61064;
            }
         }

         HeroDressDao heroDressDao = this.getHeroDressDaoByDressId(heroDressModel.getId());
         if (heroDressDao != null) {
            if (heroDressDao.endTime > 0L && System.currentTimeMillis() > heroDressDao.endTime) {
               this.logger.info("皮肤已过期，玩家={}，ID={},过期时间={}", new Object[]{this.player.getPlayerId(), heroDressDao.id, DateUtil.transferLongToDate(heroDressDao.endTime)});
               this.unDressHeroSkin(heroDressModel.getHeroId());
               if (itemModel.getTimeOut() > 0) {
                  heroDressDao.endTime = (long)(itemModel.getTimeOut() * 1000) + System.currentTimeMillis();
               } else {
                  heroDressDao.endTime = 0L;
               }

               heroDressDao.heroId = heroDressModel.getHeroId();
               heroDressDao.updateOp();
            } else {
               if (heroDressDao.endTime == 0L) {
                  if (itemModel.getTimeOut() > 0) {
                     this.player.addResource(heroDressModel.getForce(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 45, 4502, 0, 0, "");
                  } else {
                     this.player.addResource(heroDressModel.getRecovery(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 45, 4502, 0, 0, "");
                  }

                  return 45002;
               }

               int oldTime = (int)(heroDressDao.endTime / 1000L);
               if (itemModel.getTimeOut() > 0) {
                  heroDressDao.endTime += (long)(itemModel.getTimeOut() * 1000);
               } else {
                  heroDressDao.endTime = 0L;
                  this.player.addResource(heroDressModel.getForce(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 45, 4502, oldTime, 0, "");
               }

               heroDressDao.updateOp();
            }
         } else if (palaceHero != null) {
            this.unDressHeroSkin(palaceHero.id);
            heroDressDao = this.addHeroDress(heroDressModel, itemModel);
            heroDressDao.heroId = palaceHero.id;
            heroDressDao.updateOp();
         } else {
            this.unDressHeroSkin(heroDressModel.getHeroId());
            heroDressDao = this.addHeroDress(heroDressModel, itemModel);
         }

         HeroDressMsg.S2C_MainResult_11202.Builder builder = HeroDressMsg.S2C_MainResult_11202.newBuilder();
         builder.addInfos(this.toHeroDressInfo(heroDressDao));
         this.player.sendMsg(builder.build());
         this.flushHero();
         return 1;
      }
   }

   @MsgHandlerAnno
   public void C2S_ResetDress_11213(HeroDressMsg.C2S_ResetDress_11213 msg, String source) {
      HeroDressDao heroDressDao = this.getHeroDressDaoByDressId(msg.getDressId());
      if (heroDressDao == null) {
         this.logger.info("英雄皮肤不存在，ID={}", msg.getDressId());
      } else if (heroDressDao.lv > 0) {
         List<ResourceModel> lvUpList = this.resetResources(heroDressDao);
         if (lvUpList != null && lvUpList.size() > 0) {
            this.player.addResource(lvUpList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 45, 4504, 0, 0, "");
         }

         heroDressDao.lv = 0;
         heroDressDao.updateOp();
         HeroDressMsg.S2C_MainResult_11202.Builder builder = HeroDressMsg.S2C_MainResult_11202.newBuilder();
         builder.addInfos(this.toHeroDressInfo(heroDressDao));
         this.player.sendMsg(builder.build());
         this.flushHero();
         this.player.pushTask(() -> this.dressLog("重置", heroDressDao.id, heroDressDao.lv, lvUpList));
      }
   }

   public List<ResourceModel> resetResources(HeroDressDao heroDressDao) {
      List<ResourceModel> lvUpList = new ArrayList();
      if (heroDressDao.lv >= 1) {
         HeroDressStrongModel model = this.getHeroDressStrongModel(heroDressDao.id, heroDressDao.lv);
         if (model == null) {
            return lvUpList;
         }

         if (model.getType() == HeroDefine.HERO_DRESS_TYPE_AWAKEN) {
            for(ResourceModel resourceModel : model.getBackoff()) {
               ResourceModel.addResourceToList(lvUpList, resourceModel);
            }
         } else {
            for(ResourceModel consume : model.getConsumes()) {
               ResourceModel.addResourceToList(lvUpList, consume);
            }
         }
      }

      return lvUpList;
   }

   public HeroDressDao addHeroDress(HeroDressModel heroDressModel, ItemModel itemModel) {
      HeroDressDao heroDressDao = new HeroDressDao();
      heroDressDao.playerId = this.player.getPlayerId();
      heroDressDao.id = heroDressModel.getId();
      heroDressDao.heroId = heroDressModel.getHeroId();
      heroDressDao.lv = 0;
      if (heroDressModel.getDressType() == HeroDefine.HERO_DRESS_TYPE_PALACE) {
         heroDressDao.endTime = 0L;
      } else if (heroDressModel.getDressType() == HeroDefine.HERO_DRESS_TYPE_AWAKEN) {
         heroDressDao.endTime = 0L;
      } else if (itemModel.getTimeOut() > 0) {
         heroDressDao.endTime = (long)(itemModel.getTimeOut() * 1000) + System.currentTimeMillis();
      }

      this.player.insertDao(heroDressDao, true);
      return heroDressDao;
   }

   public void resetHour() {
      super.resetHour();
      this.flushHero();
   }

   public HeroDressMsg.HeroDressInfo.Builder toHeroDressInfo(HeroDressDao heroDressDao) {
      HeroDressMsg.HeroDressInfo.Builder builder = HeroDressMsg.HeroDressInfo.newBuilder();
      builder.setId(heroDressDao.id);
      builder.setLv(heroDressDao.lv);
      builder.setHreoId(heroDressDao.heroId);
      builder.setEndTime((int)(heroDressDao.endTime / 1000L));
      return builder;
   }

   public HeroDressStrongModel getHeroDressStrongModel(int skin, int lv) {
      Map<Integer, HeroDressStrongModel> map = (Map)this.player.getGameModelPool().getEntity("customHeroDressStrong", skin);
      return map == null ? null : (HeroDressStrongModel)map.get(lv);
   }

   public HeroDressDao getEnableDaoByHeroId(int heroId) {
      Map<Integer, HeroDressDao> map = this.player.<Integer, HeroDressDao>getMap("tb_hero_dress", this.player.getPlayerId());
      if (map != null) {
         for(Map.Entry<Integer, HeroDressDao> entry : map.entrySet()) {
            if (((HeroDressDao)entry.getValue()).heroId == heroId) {
               return (HeroDressDao)entry.getValue();
            }
         }
      }

      return null;
   }

   public HeroDressDao getHeroDressDaoByDressId(int dressId) {
      Map<Integer, HeroDressDao> map = this.player.<Integer, HeroDressDao>getMap("tb_hero_dress", this.player.getPlayerId());
      return map != null ? (HeroDressDao)map.get(dressId) : null;
   }

   public void flushHero() {
      this.checkEndTimeAndSetProperty();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_HERO_DRESS);
   }

   public void checkEndTimeAndSetProperty() {
      Map<Integer, List<HeroDressEndTimeAndPros>> heroIdMap = new HashMap();
      long totalLvHp = 0L;
      long totalLvAtk = 0L;
      Map<Integer, HeroDressDao> heroDressDaoMap = this.player.<Integer, HeroDressDao>getMap("tb_hero_dress", this.player.getPlayerId());
      List<HeroDressDao> needDelDaoList = new ArrayList();
      List<PropertyModel> baseList = new ArrayList();
      List<PropertyModel> allList = new ArrayList();
      if (heroDressDaoMap != null && !heroDressDaoMap.isEmpty()) {
         long currentTime = System.currentTimeMillis();

         for(Map.Entry<Integer, HeroDressDao> entry : heroDressDaoMap.entrySet()) {
            HeroDressDao heroDressDao = (HeroDressDao)entry.getValue();
            HeroDressModel heroDressModel = (HeroDressModel)this.player.getGameModelPool().getEntity("heroDress", heroDressDao.id);
            if (heroDressModel != null) {
               if (heroDressDao.endTime != 0L && (heroDressDao.endTime <= 0L || heroDressDao.endTime <= currentTime)) {
                  needDelDaoList.add(heroDressDao);
               } else {
                  HeroDressEndTimeAndPros bean = new HeroDressEndTimeAndPros();
                  if (heroDressDao.heroId > 0) {
                     bean.isUsed = true;
                  }

                  bean.dressId = heroDressDao.id;
                  bean.dressLv = heroDressDao.lv;
                  bean.endTime = heroDressDao.endTime;
                  List<PropertyModel> list = new ArrayList();
                  if (heroDressModel.getDressType() == HeroDefine.HERO_DRESS_TYPE_PALACE) {
                     for(PropertyModel addPro : heroDressModel.getAddPros()) {
                        PropertyModel.addLvProtities(baseList, addPro);
                     }
                  } else if (heroDressModel.getDressType() == HeroDefine.HERO_DRESS_TYPE_COLLECTION) {
                     for(PropertyModel addPro : heroDressModel.getAddAllPros()) {
                        PropertyModel.addLvProtities(baseList, addPro);
                     }
                  } else {
                     for(PropertyModel addPro : heroDressModel.getAddPros()) {
                        PropertyModel.addLvProtities(list, addPro);
                     }

                     if (heroDressModel.getDressType() == HeroDefine.HERO_DRESS_TYPE_AWAKEN) {
                        PropertyModel.addLvProtities(baseList, new PropertyModel(1, 0, (long)heroDressModel.getAddHp()));
                        PropertyModel.addLvProtities(baseList, new PropertyModel(2, 0, (long)heroDressModel.getAddAtk()));
                     }
                  }

                  if (heroDressDao.lv >= 1) {
                     Map<Integer, HeroDressStrongModel> map = (Map)this.player.getGameModelPool().getEntity("customHeroDressStrong", heroDressDao.id);
                     if (map != null) {
                        for(int i = 1; i <= heroDressDao.lv; ++i) {
                           HeroDressStrongModel heroDressStrongModel = (HeroDressStrongModel)map.get(i);
                           if (heroDressStrongModel != null) {
                              for(PropertyModel property : heroDressStrongModel.getProperties()) {
                                 PropertyModel.addLvProtities(list, property);
                              }

                              if (heroDressModel.getDressType() == HeroDefine.HERO_DRESS_TYPE_AWAKEN) {
                                 totalLvHp += (long)heroDressStrongModel.getStrongHpfull();
                                 totalLvAtk += (long)heroDressStrongModel.getStrongAtkfull();
                              } else if (heroDressModel.getDressType() == HeroDefine.HERO_DRESS_TYPE_COLLECTION) {
                                 for(PropertyModel propertyModel : heroDressStrongModel.getStrongAllFun()) {
                                    allList.add(new PropertyModel(propertyModel.getType(), propertyModel.getWay(), propertyModel.getValue()));
                                 }
                              }
                           }
                        }
                     }
                  }

                  bean.pros = list;
                  if (heroDressModel.getDressType() == HeroDefine.HERO_DRESS_TYPE_PALACE) {
                     Map<Integer, HeroModel> palaceHeroMap = this.player.getGameModelPool().getMap("customPalaceHero");

                     for(Map.Entry<Integer, HeroModel> heroModelEntry : palaceHeroMap.entrySet()) {
                        List<HeroDressEndTimeAndPros> beanList = (List)MapUtil.getOrDefault(heroIdMap, heroModelEntry.getKey(), new ArrayList());
                        beanList.add(bean);
                        heroIdMap.put(heroModelEntry.getKey(), beanList);
                     }
                  } else {
                     List<HeroDressEndTimeAndPros> beanList = (List)MapUtil.getOrDefault(heroIdMap, heroDressModel.getHeroId(), new ArrayList());
                     beanList.add(bean);
                     heroIdMap.put(heroDressModel.getHeroId(), beanList);
                  }
               }
            }
         }
      }

      if (!needDelDaoList.isEmpty()) {
         List<Integer> needDelList = new ArrayList();

         for(HeroDressDao heroDressDao : needDelDaoList) {
            HeroDressModel heroDressModel = (HeroDressModel)this.player.getGameModelPool().getEntity("heroDress", heroDressDao.id);
            if (heroDressModel != null) {
               needDelList.add(heroDressDao.id);
               this.player.deleteDao(heroDressDao, true);
            }
         }

         if (this.player.isLogin()) {
            this.S2C_DelDress_11204(needDelList);
         }
      }

      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      heroBagPart.setHeroDressEndTimeAndPros(heroIdMap);
      heroBagPart.setProperty_hero_dress_all_base(baseList);
      List<PropertyModel> extraList = new ArrayList();
      if (totalLvHp > 0L) {
         extraList.add(new PropertyModel(1, 0, totalLvHp));
         extraList.add(new PropertyModel(2, 0, totalLvAtk));
      }

      heroBagPart.setProperty_hero_dress_all(extraList);
      heroBagPart.setProperty_hero_dress_collect(allList);
   }

   public void unDressHeroSkin(int heroId) {
      HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroId);
      if (heroModel != null) {
         Map<Integer, HeroDressDao> map = this.player.<Integer, HeroDressDao>getMap("tb_hero_dress", this.player.getPlayerId());
         if (map != null) {
            for(Map.Entry<Integer, HeroDressDao> entry : map.entrySet()) {
               HeroDressModel heroDressModel = (HeroDressModel)ApplicationContextProvider.getModelPoolEntity("heroDress", (Integer)entry.getKey());
               if (heroDressModel == null) {
                  ((HeroDressDao)entry.getValue()).heroId = 0;
                  ((HeroDressDao)entry.getValue()).updateOp();
               } else {
                  if (heroDressModel.getDressType() == HeroDefine.HERO_DRESS_TYPE_PALACE) {
                     if (heroModel.getHeroSpType() != HeroDefine.HERO_SP_TYPE_PALACE) {
                        continue;
                     }
                  } else if (((HeroDressDao)entry.getValue()).heroId != heroId) {
                     continue;
                  }

                  ((HeroDressDao)entry.getValue()).heroId = 0;
                  ((HeroDressDao)entry.getValue()).updateOp();
               }
            }
         }

      }
   }

   public void gmHeroDress(String params) {
      String[] strArr = params.split(",");
      switch (strArr[0]) {
         case "del":
            HeroDressDao heroDressDao = this.getHeroDressDaoByDressId(Integer.valueOf(strArr[1]));
            if (heroDressDao != null) {
               this.player.deleteDao(heroDressDao, false);
               this.flushHero();
            }
            break;
         case "delete":
            this.C2S_DeleteDress_11217(HeroDressMsg.C2S_DeleteDress_11217.newBuilder().setDressId(Integer.parseInt(strArr[1])).build(), "");
      }

   }

   public Map<Integer, HeroDressDao> getHeroDressDaoMap() {
      return this.player.<Integer, HeroDressDao>getMap("tb_hero_dress", this.player.getPlayerId());
   }

   public Set<Integer> getActiveDressIdByHeroId(Integer heroId, boolean isChangedHeroId) {
      if (isChangedHeroId) {
         Map<Integer, HeroDressModel> modelMap = this.player.getGameModelPool().getMap("heroDress");

         for(HeroDressModel model : modelMap.values()) {
            if (model.getChangedHeroId() == heroId) {
               heroId = model.getHeroId();
               break;
            }
         }
      }

      Set<Integer> activeDressIds = new HashSet();
      Map<Integer, HeroDressDao> heroDressDaoMap = this.getHeroDressDaoMap();
      if (heroDressDaoMap != null && !heroDressDaoMap.isEmpty()) {
         long currentTime = System.currentTimeMillis();

         for(Map.Entry<Integer, HeroDressDao> entry : heroDressDaoMap.entrySet()) {
            HeroDressDao heroDressDao = (HeroDressDao)entry.getValue();
            HeroDressModel heroDressModel = (HeroDressModel)this.player.getGameModelPool().getEntity("heroDress", heroDressDao.id);
            if (heroDressModel != null && heroDressModel.getHeroId() == heroId && (heroDressDao.endTime == 0L || heroDressDao.endTime > 0L && heroDressDao.endTime > currentTime)) {
               activeDressIds.add(heroDressDao.id);
            }
         }
      }

      return activeDressIds;
   }

   @MsgHandlerAnno
   public void C2S_DeleteDress_11217(HeroDressMsg.C2S_DeleteDress_11217 msg, String source) {
      List<ResourceModel> returnResList = this.deleteDress(msg.getDressId(), "觉醒皮肤重置");
      this.player.addResource(returnResList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 45, 4505, msg.getDressId(), 0, "");
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_HERO_DRESS);
   }

   public List<ResourceModel> deleteDress(int dressId, String opName) {
      List<ResourceModel> returnResList = new ArrayList();
      Map<Integer, HeroDressDao> map = this.player.<Integer, HeroDressDao>getMap("tb_hero_dress", this.player.getPlayerId());
      HeroDressDao heroDressDao = (HeroDressDao)map.get(dressId);
      if (heroDressDao == null) {
         this.logger.info("英雄皮肤不存在，ID={}", dressId);
         return returnResList;
      } else if (heroDressDao.endTime > 0L && System.currentTimeMillis() > heroDressDao.endTime) {
         this.logger.info("皮肤已过期，玩家={}，ID={},过期时间={}", new Object[]{this.player.getPlayerId(), heroDressDao.id, DateUtil.transferLongToDate(heroDressDao.endTime)});
         this.flushHero();
         return returnResList;
      } else {
         returnResList.addAll(this.resetResources(heroDressDao));
         HeroDressModel heroDressModel = (HeroDressModel)this.player.getGameModelPool().getEntity("heroDress", heroDressDao.id);
         if (heroDressModel != null) {
            ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", heroDressModel.getItemId());
            if (itemModel != null) {
               returnResList.add(new ResourceModel(2, itemModel.getId(), 1));
            }

            ArmyArrayPart armyArrayPart = (ArmyArrayPart)this.player.getMgrPart(ArmyArrayPart.class);
            armyArrayPart.checkEyes(heroDressModel.getHeroId());
         }

         int id = heroDressDao.id;
         int lv = heroDressDao.lv;
         this.player.deleteDao(heroDressDao, true);
         this.checkEndTimeAndSetProperty();
         HeroDressMsg.S2C_DeleteDress_11218.Builder builder = HeroDressMsg.S2C_DeleteDress_11218.newBuilder();
         builder.setDressId(dressId);
         this.player.sendMsg(builder.build());
         this.S2C_MainResult_11202();
         this.dressLog(opName, id, lv, returnResList);
         return returnResList;
      }
   }

   public class HeroDressEndTimeAndPros {
      public int dressId;
      public int dressLv;
      public boolean isUsed;
      public long endTime;
      public List<PropertyModel> pros;
   }
}
