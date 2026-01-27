package com.gzbz.divineGanerals;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.DivineGeneralsDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.friend.FriendPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.DivineGeneralsBaseModel;
import com.gzbz.model.DivineGeneralsLevelModel;
import com.gzbz.model.DivineGeneralsMaxLevelModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.DivineGeneralsMsg;
import com.gzbz.spring.ApplicationContextProvider;
import debug.Debug;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
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
public class DivineGeneralsPart extends PlayerPart {
   Logger logger = LoggerFactory.getLogger(FriendPart.class);

   @MsgHandlerAnno
   public void C2S_DivineGeneralsInfo_10001(DivineGeneralsMsg.C2S_DivineGeneralsInfo_10001 msg, String source) {
      this.sendInfos();
   }

   @MsgHandlerAnno
   public boolean C2S_Upgrade_10003(DivineGeneralsMsg.C2S_Upgrade_10003 msg, String source) {
      if (!this.player.isSystemOpen(2120)) {
         return this.player.failure(21);
      } else {
         SystemFunctionModel systemFunctionModel = (SystemFunctionModel)ApplicationContextProvider.getModelPoolEntity("systemFunction", 2120);
         PlayerPublicDao playerDao = this.player.getPublicDao();
         if (playerDao.lv < systemFunctionModel.getAppearLevel()) {
            this.logger.info("将魂志系统未开启，不可进行升级操作 playerId:{} lv:{}", this.player.getPlayerId(), playerDao.lv);
            return this.player.failure(21);
         } else {
            int groupId = msg.getId();
            List<Integer> heroCodeList = msg.getHeroCodeList();
            DivineGeneralsBaseModel baseModel = (DivineGeneralsBaseModel)this.player.getGameModelPool().getEntity("divineGeneralsBase", groupId);
            if (baseModel == null) {
               return false;
            } else {
               int playerLv = this.player.getPlayerDao().lv;
               DivineGeneralsDao generalsDao = (DivineGeneralsDao)this.player.getData("tb_divine_generals", this.player.getPlayerId());
               int totalLv = this.getTotalLv();
               Map<Integer, DivineGeneralsMaxLevelModel> maxLevelModelMap = ApplicationContextProvider.<Integer, DivineGeneralsMaxLevelModel>getModelPoolMap("divineGeneralsMaxLevel");
               boolean lvLimit = false;
               if (maxLevelModelMap.containsKey(playerLv)) {
                  DivineGeneralsMaxLevelModel maxLevelModel = (DivineGeneralsMaxLevelModel)maxLevelModelMap.get(playerLv);
                  if (totalLv >= maxLevelModel.getDivineGeneralsMaxLevel()) {
                     lvLimit = true;
                  }
               } else {
                  TreeMap<Integer, DivineGeneralsMaxLevelModel> treeMap = new TreeMap(maxLevelModelMap);
                  if (playerLv < (Integer)treeMap.firstKey()) {
                     lvLimit = totalLv >= ((DivineGeneralsMaxLevelModel)treeMap.firstEntry().getValue()).getDivineGeneralsMaxLevel();
                  } else if (playerLv > (Integer)treeMap.lastKey()) {
                     lvLimit = totalLv >= ((DivineGeneralsMaxLevelModel)treeMap.lastEntry().getValue()).getDivineGeneralsMaxLevel();
                  }
               }

               if (lvLimit) {
                  return this.player.failure(61192);
               } else {
                  Map<Integer, Integer> material = new HashMap();

                  for(ResourceModel resourceModel : baseModel.getResourceList()) {
                     if (resourceModel.getType() != 3) {
                        this.logger.info("神将录divineGeneralsBase表配置错误 groupId={}", groupId);
                        return false;
                     }

                     if (resourceModel.getId() > 0 && resourceModel.getValue() > 0) {
                        material.put(resourceModel.getId(), resourceModel.getValue());
                     }
                  }

                  if (material.size() != heroCodeList.size()) {
                     return this.player.failure(6);
                  } else {
                     HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);

                     for(Integer code : heroCodeList) {
                        HeroDao heroDao = heroBagPart.getHeroByCode(code);
                        if (heroDao == null) {
                           return this.player.failure(6);
                        }

                        if (heroDao.lock) {
                           return this.player.failure(39);
                        }

                        if (heroDao.isHaveArrayingState()) {
                           return this.player.failure(38);
                        }

                        if (!material.containsKey(heroDao.id)) {
                           return this.player.failure(6);
                        }

                        HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
                        if (heroModel.getStar() != heroDao.getStar()) {
                           return this.player.failure(6);
                        }

                        int num = (Integer)material.get(heroDao.id);
                        if (num <= 0) {
                           return this.player.failure(6);
                        }

                        material.put(heroDao.id, num - 1);
                     }

                     for(Map.Entry<Integer, Integer> entry : material.entrySet()) {
                        if ((Integer)entry.getValue() > 0) {
                           return this.player.failure(4);
                        }
                     }

                     int curLv = (Integer)MapUtil.getOrDefault(generalsDao.infoMap, groupId, 0);
                     int key = baseModel.getGroupId() + curLv + 1;
                     DivineGeneralsLevelModel levelModel = (DivineGeneralsLevelModel)this.player.getGameModelPool().getEntity("divineGeneralsLevel", key);
                     if (levelModel == null) {
                        this.logger.info("找不到对应配置，已达到最高等级, groupId = {}, curLv = {}", groupId, curLv);
                        return false;
                     } else {
                        List<ResourceModel> materialList = this.getMaterials(levelModel, generalsDao);
                        if (!this.player.checkResourceNum(materialList)) {
                           return this.player.failure(3);
                        } else {
                           List<ResourceModel> list = new ArrayList();

                           for(Integer code : heroCodeList) {
                              list.add(new ResourceModel(3, code, 1));
                           }

                           list.addAll(materialList);
                           this.player.delResource((List)list, 34, 3401, groupId, 0, "");
                           generalsDao.useNewIds.add(groupId);
                           generalsDao.upgrad(groupId);
                           heroBagPart.setProperty_divine_generals(this.getPropertyAdditions());
                           heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_DIVINE_GENERALS);
                           DivineGeneralsMsg.S2C_Upgrade_10004.Builder builder = DivineGeneralsMsg.S2C_Upgrade_10004.newBuilder();
                           DivineGeneralsMsg.Divine_Info.Builder info = DivineGeneralsMsg.Divine_Info.newBuilder();
                           info.setId(groupId);
                           info.setLevel(curLv + 1);
                           info.setUseNew(true);
                           builder.setInfo(info);
                           this.player.sendMsg(builder.build());
                           this.player.triggerTask(364, 0, (long)generalsDao.infoMap.size(), 0);
                           GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
                           giftPart.triggerTimeLimitGift(22, curLv + 1);
                           int count = (int)generalsDao.infoMap.values().stream().filter((lv) -> lv >= 1).count();
                           giftPart.triggerTimeLimitGift(25, count);
                           return true;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void sendInfos() {
      DivineGeneralsDao divineGeneralsDao = (DivineGeneralsDao)this.player.getData("tb_divine_generals", this.player.getPlayerId());
      DivineGeneralsMsg.S2C_DivineGeneralsInfo_10002.Builder builder = DivineGeneralsMsg.S2C_DivineGeneralsInfo_10002.newBuilder();
      List<DivineGeneralsMsg.Divine_Info> list = new ArrayList();

      for(Map.Entry<Integer, Integer> entry : divineGeneralsDao.infoMap.entrySet()) {
         DivineGeneralsMsg.Divine_Info.Builder info = DivineGeneralsMsg.Divine_Info.newBuilder();
         info.setId((Integer)entry.getKey());
         info.setLevel((Integer)entry.getValue());
         info.setUseNew(divineGeneralsDao.useNewIds.contains(entry.getKey()));
         list.add(info.build());
      }

      builder.addAllInfo(list);
      this.player.sendMsg(builder.build());
   }

   public List<PropertyModel> getPropertyAdditions() {
      List<PropertyModel> propertyModels = new ArrayList();
      DivineGeneralsDao divineGeneralsDao = (DivineGeneralsDao)this.player.getData("tb_divine_generals", this.player.getPlayerId());

      for(Map.Entry<Integer, Integer> entry : divineGeneralsDao.infoMap.entrySet()) {
         int groupId = (Integer)entry.getKey();
         int level = (Integer)entry.getValue();

         for(int i = 1; i <= level; ++i) {
            DivineGeneralsLevelModel model = (DivineGeneralsLevelModel)this.player.getGameModelPool().getEntity("divineGeneralsLevel", groupId + i);
            if (model != null) {
               for(PropertyModel property : model.getProperties()) {
                  PropertyModel.addLvProtities(propertyModels, property);
               }
            }
         }
      }

      return HeroDao.calModelProperty(propertyModels);
   }

   public void loginHandle() {
      if (this.player.isSystemOpen(2120)) {
         this.sendInfos();
      }

   }

   public int getTotalLv() {
      int totalLv = 0;
      DivineGeneralsDao generalsDao = (DivineGeneralsDao)this.player.getData("tb_divine_generals", this.player.getPlayerId());

      for(Integer value : generalsDao.infoMap.values()) {
         totalLv += value;
      }

      return totalLv;
   }

   public List<ResourceModel> getMaterials(DivineGeneralsLevelModel model, DivineGeneralsDao generalsDao) {
      List<ResourceModel> list = new ArrayList();
      if (generalsDao.useNewIds.contains(model.getGroupId())) {
         list.addAll(model.getNewMaterials());
      } else {
         list.addAll(model.getMaterials());
      }

      return list;
   }

   public void quickUpgrade(int level) {
      if (Debug.isDebug) {
         Map<Integer, DivineGeneralsBaseModel> modelMap = this.player.getGameModelPool().getMap("divineGeneralsBase");

         for(Map.Entry<Integer, DivineGeneralsBaseModel> entry : modelMap.entrySet()) {
            int groupId = (Integer)entry.getKey();
            DivineGeneralsDao generalsDao = (DivineGeneralsDao)this.player.getData("tb_divine_generals", this.player.getPlayerId());
            int curLv = (Integer)MapUtil.getOrDefault(generalsDao.infoMap, groupId, 0);
            if (curLv < level) {
               for(int i = curLv; i < level; ++i) {
                  int key = groupId + i + 1;
                  DivineGeneralsLevelModel levelModel = (DivineGeneralsLevelModel)this.player.getGameModelPool().getEntity("divineGeneralsLevel", key);
                  if (levelModel != null) {
                     generalsDao.upgrad(groupId);
                  }
               }
            }
         }

         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         heroBagPart.setProperty_divine_generals(this.getPropertyAdditions());
         heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_DIVINE_GENERALS);
         this.sendInfos();
      }
   }
}
