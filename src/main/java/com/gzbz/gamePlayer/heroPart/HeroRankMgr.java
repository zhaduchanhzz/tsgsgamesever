package com.gzbz.gamePlayer.heroPart;

import allMgr.MgrAnno;
import allMgr.MsgHandlerAnno;
import allMgr.TaskMethod;
import com.gzbz.db.WorldDao;
import com.gzbz.db.arraying.ArrayingEntity;
import com.gzbz.db.arraying.FriendArrayingEntity;
import com.gzbz.db.arraying.HeroArrayingEntity;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.worldBean.HeroPowerData;
import com.gzbz.db.worldBean.HeroRankData;
import com.gzbz.gameDefine.GameDefine;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameMgr.GameMgr;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.HeroModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossHeroRankMsg;
import com.gzbz.protobuf.HeroExtendMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import misc.DateUtil;
import misc.MapUtil;
import net.CrossSubscribeMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@MgrAnno
@Component
public class HeroRankMgr extends GameMgr {
   public static Logger logger = LoggerFactory.getLogger(HeroRankMgr.class);
   @Autowired
   WorldMgr worldMgr;
   @Autowired
   CrossNettyClient crossNettyClient;
   @Autowired
   ConfigManager configManager;
   @Autowired
   private GameModelPool gameModelPool;
   private HeroRankData heroRankData;
   private ScheduledFuture<?> uploadHeroInfosf;
   private List<Integer> haveCheckList = new ArrayList();
   private HashMap<Integer, Long> heroPowerMap = new HashMap();
   private Map<Integer, Long> jobMaxPowerMap = new HashMap();
   private Map<Integer, Integer> lastCompensateMap = new HashMap();

   protected void init() throws Exception {
   }

   @TaskMethod
   public void leaveArraying(int playerId, int heroId) {
      WorldDao<HeroRankData> worldDao = this.worldMgr.<HeroRankData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_HERO_RANK_NEW);
      if (worldDao.jsonData != null) {
         List<Integer> heroCodeList = new ArrayList();
         if (((HeroRankData)worldDao.jsonData).rankMap.containsKey(heroId)) {
            HeroPowerData heroPowerData = (HeroPowerData)((Map)((HeroRankData)worldDao.jsonData).rankMap.get(heroId)).get(playerId);
            if (heroPowerData != null) {
               ((Map)((HeroRankData)worldDao.jsonData).rankMap.get(heroId)).remove(playerId);
               worldDao.updateOp();
               heroCodeList.add(heroPowerData.code);
            }
         }

         this.updateCrossHeroRankInfo(2, playerId, heroCodeList);
      }
   }

   @TaskMethod
   public void updateHeroListRank(int playerId, Map<Integer, HeroPowerData> heroPowerDataMap) {
      List<Integer> delList = new ArrayList();
      WorldDao<HeroRankData> worldDao = this.worldMgr.<HeroRankData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_HERO_RANK_NEW);

      for(Map.Entry<Integer, Map<Integer, HeroPowerData>> entry : ((HeroRankData)worldDao.jsonData).rankMap.entrySet()) {
         int heroId = (Integer)entry.getKey();
         boolean isHavePlayerHeroId = false;

         for(Map.Entry<Integer, HeroPowerData> subEntry : ((Map)entry.getValue()).entrySet()) {
            if (((HeroPowerData)subEntry.getValue()).playerId == playerId) {
               isHavePlayerHeroId = true;
               if (heroPowerDataMap.containsKey(heroId)) {
                  ((HeroPowerData)subEntry.getValue()).power = ((HeroPowerData)heroPowerDataMap.get(heroId)).power;
               } else {
                  delList.add(entry.getKey());
               }
            }
         }

         if (!isHavePlayerHeroId && heroPowerDataMap.containsKey(entry.getKey())) {
            this.updateHeroRank(playerId, (Integer)entry.getKey(), ((HeroPowerData)heroPowerDataMap.get(entry.getKey())).power, ((HeroPowerData)heroPowerDataMap.get(entry.getKey())).code);
         }
      }

      if (!delList.isEmpty()) {
         for(Integer idKey : delList) {
            ((Map)((HeroRankData)worldDao.jsonData).rankMap.get(idKey)).remove(playerId);
            worldDao.updateOp();
         }
      }

   }

   @TaskMethod
   public void updateHeroRank(int playerId, int heroId, long power, int code) {
      GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
      if (gamePlayer != null && !gamePlayer.isRobot()) {
         HeroModel heroModel = (HeroModel)this.gameModelPool.getEntity("hero", heroId);
         if (heroModel.getHeroSpType() != HeroDefine.HERO_SP_TYPE_PALACE) {
            WorldDao<HeroRankData> worldDao = this.worldMgr.<HeroRankData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_HERO_RANK_NEW);
            if (worldDao.jsonData != null) {
               List<HeroPowerData> addInfo = new ArrayList();
               List<HeroPowerData> deleteInfo = new ArrayList();
               if (!((HeroRankData)worldDao.jsonData).rankMap.containsKey(heroId)) {
                  HashMap<Integer, HeroPowerData> map = new HashMap();
                  HeroPowerData powerData = new HeroPowerData(playerId, code, power);
                  map.put(playerId, powerData);
                  ((HeroRankData)worldDao.jsonData).rankMap.put(heroId, map);
                  worldDao.updateOp();
                  addInfo.add(powerData);
               } else {
                  HeroPowerData oriHeroPowerData = (HeroPowerData)((Map)((HeroRankData)worldDao.jsonData).rankMap.get(heroId)).get(playerId);
                  if (oriHeroPowerData != null) {
                     oriHeroPowerData.power = power;
                     worldDao.updateOp();
                     addInfo.add(oriHeroPowerData);
                  } else {
                     int heroRankSizeSave = ApplicationContextProvider.getConfigInt("heroRankSizeSave", 10);
                     if (((Map)((HeroRankData)worldDao.jsonData).rankMap.get(heroId)).size() < heroRankSizeSave) {
                        HeroPowerData powerData = new HeroPowerData(playerId, code, power);
                        ((Map)((HeroRankData)worldDao.jsonData).rankMap.get(heroId)).put(playerId, powerData);
                        worldDao.updateOp();
                        addInfo.add(powerData);
                     } else {
                        List<HeroPowerData> rankList = new ArrayList();

                        for(HeroPowerData data : ((Map)((HeroRankData)worldDao.jsonData).rankMap.get(heroId)).values()) {
                           rankList.add(data);
                        }

                        Collections.sort(rankList);
                        HeroPowerData rank_10 = (HeroPowerData)rankList.get(rankList.size() - 1);
                        if (power > rank_10.power) {
                           ((Map)((HeroRankData)worldDao.jsonData).rankMap.get(heroId)).remove(rank_10.playerId);
                           HeroPowerData newHeroPowerData = new HeroPowerData(playerId, code, power);
                           ((Map)((HeroRankData)worldDao.jsonData).rankMap.get(heroId)).put(playerId, newHeroPowerData);
                           worldDao.updateOp();
                           deleteInfo.add(rank_10);
                           addInfo.add(newHeroPowerData);
                        }
                     }
                  }
               }

               for(HeroPowerData heroPowerData : addInfo) {
                  List<Integer> tempList = new ArrayList();
                  tempList.add(heroPowerData.code);
                  this.updateCrossHeroRankInfo(1, heroPowerData.playerId, tempList);
               }

               for(HeroPowerData heroPowerData : deleteInfo) {
                  List<Integer> tempList = new ArrayList();
                  tempList.add(heroPowerData.code);
                  this.updateCrossHeroRankInfo(2, heroPowerData.playerId, tempList);
               }

            }
         }
      }
   }

   private void updateCrossHeroRankInfo(int type, int playerId, List<Integer> heroCodeList) {
      GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
      if (gamePlayer != null && heroCodeList != null && heroCodeList.size() > 0) {
         gamePlayer.pushTask(() -> {
            HeroBagPart heroBagPart = (HeroBagPart)gamePlayer.getMgrPart(HeroBagPart.class);
            if (type == 1) {
               heroBagPart.uploadHeroRankInfo(heroCodeList);
            } else if (type == 2) {
               heroBagPart.removeHeroRankInfo(heroCodeList);
            }

         });
      }

   }

   public void checkHero(int heroId) {
      WorldDao<HeroRankData> worldDao = this.worldMgr.<HeroRankData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_HERO_RANK_NEW);
      if (!this.haveCheckList.contains(heroId)) {
         Map<Integer, HeroPowerData> powerDataMap = (Map)((HeroRankData)worldDao.jsonData).rankMap.get(heroId);
         if (powerDataMap != null && powerDataMap.size() != 0) {
            List<Integer> needDelList = new ArrayList();

            for(Map.Entry<Integer, HeroPowerData> entry : powerDataMap.entrySet()) {
               int playerId = (Integer)entry.getKey();
               long oldPower = ((HeroPowerData)entry.getValue()).power;
               GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
               if (gamePlayer != null) {
                  ArrayingMirror arrayingMirror = gamePlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
                  boolean isHaveHeroId = false;

                  for(Map.Entry<Byte, ArrayingEntity> heroEntry : arrayingMirror.arrayingElementsMap.entrySet()) {
                     ArrayingEntity arrayingEntity = (ArrayingEntity)heroEntry.getValue();
                     if (arrayingEntity.heroAndFriend() && arrayingEntity.heroId() == heroId) {
                        isHaveHeroId = true;
                        if (arrayingEntity.power() != oldPower) {
                           ((HeroPowerData)entry.getValue()).power = arrayingEntity.power();
                        }
                     }
                  }

                  if (!isHaveHeroId) {
                     needDelList.add(playerId);
                  }
               } else {
                  needDelList.add(playerId);
               }
            }

            for(Integer playerId : needDelList) {
               powerDataMap.remove(playerId);
               worldDao.updateOp();
            }

            this.haveCheckList.add(heroId);
         }
      }
   }

   @TaskMethod
   public void getHeroRank(GamePlayer player, int heroId, HeroExtendMsg.C2S_OpenHeroRankUi_13201 msg) {
      this.checkHero(heroId);
      this.crossNettyClient.sendCross(player.getServerId(), player.getPlayerId(), msg);
   }

   public void connectCrossServer() {
      if (this.jobMaxPowerMap.isEmpty()) {
         CrossHeroRankMsg.S2CR_HeroCompensate_14903.Builder builder = CrossHeroRankMsg.S2CR_HeroCompensate_14903.newBuilder();
         this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, 0, builder.build());
      }

      this.updateHeroRank();
      this.uploadHeroInfo();
   }

   @MsgHandlerAnno
   public void CR2S_ServerHeroRank_14902(CrossHeroRankMsg.CR2S_ServerHeroRank_14902 msg, CrossSubscribeMsg crossSubscribeMsg) {
      this.updateHeroRank();
   }

   public void updateHeroRank() {
      int heroRankOpen = this.configManager.getIntDefault("heroRankOpen", 0);
      if (heroRankOpen <= 0) {
         logger.info("英雄排行补偿没有开启！");
      } else {
         WorldDao<HeroRankData> worldDao = this.worldMgr.<HeroRankData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_HERO_RANK_NEW);
         logger.info("游戏服链接跨服，上传游戏服英雄排行榜,时间={}", DateUtil.transferLongToDate());
         CrossHeroRankMsg.S2CR_ServerHeroRank_14901.Builder builder = CrossHeroRankMsg.S2CR_ServerHeroRank_14901.newBuilder();

         for(Map.Entry<Integer, Map<Integer, HeroPowerData>> entry : ((HeroRankData)worldDao.jsonData).rankMap.entrySet()) {
            CrossHeroRankMsg.HeroRank.Builder info = CrossHeroRankMsg.HeroRank.newBuilder();
            info.setHeroId((Integer)entry.getKey());
            List<Integer> delList = new ArrayList();

            for(Map.Entry<Integer, HeroPowerData> subEntry : ((Map)entry.getValue()).entrySet()) {
               GamePlayer gamePlayer = this.worldMgr.getPlayerById((Integer)subEntry.getKey());
               if (gamePlayer != null && ((HeroPowerData)subEntry.getValue()).power != 0L) {
                  CommonMsg.MapDataIL.Builder power = CommonMsg.MapDataIL.newBuilder();
                  power.setKey((Integer)subEntry.getKey());
                  power.setValue(((HeroPowerData)subEntry.getValue()).power);
                  info.addPlayerPower(power);
               } else {
                  delList.add(entry.getKey());
               }
            }

            builder.addInfos(info);
            if (!delList.isEmpty()) {
               for(Integer playerId : delList) {
                  ((Map)entry.getValue()).remove(playerId);
               }
            }
         }

         this.crossNettyClient.sendCross(this.worldMgr.GAME_SERVER_ID, 0, builder.build());
      }
   }

   @MsgHandlerAnno
   public void CR2S_HeroCompensate_14904(CrossHeroRankMsg.CR2S_HeroCompensate_14904 msg, CrossSubscribeMsg crossSubscribeMsg) {
      logger.info("跨服返回英雄补偿数据");
      HashMap<Integer, Long> temp_heroPowerMap = new HashMap();

      for(CommonMsg.MapDataIL mapDataIL : msg.getHeroTotalPowerList()) {
         HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", mapDataIL.getKey());
         if (heroModel != null) {
            temp_heroPowerMap.put(mapDataIL.getKey(), mapDataIL.getValue());
         }
      }

      this.heroPowerMap = temp_heroPowerMap;
      HashMap<Integer, Long> temp_jobMaxPowerMap = new HashMap();

      for(CommonMsg.MapDataIL mapDataIL : msg.getJobMaxPowerList()) {
         temp_jobMaxPowerMap.put(mapDataIL.getKey(), mapDataIL.getValue());
      }

      this.jobMaxPowerMap = temp_jobMaxPowerMap;
      Map<Integer, Integer> temp_lastCompensateMap = new HashMap();

      for(CommonMsg.MapDataII mapDataII : msg.getLastCompensateList()) {
         temp_lastCompensateMap.put(mapDataII.getKey(), mapDataII.getValue());
      }

      this.lastCompensateMap = temp_lastCompensateMap;
   }

   public List<PropertyModel> getHeroCompensate(int heroId) {
      HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroId);
      if (heroModel == null) {
         return null;
      } else if (!this.jobMaxPowerMap.containsKey(heroModel.getType())) {
         return null;
      } else {
         int delt = 0;
         int compensateDayLimit = this.configManager.getIntDefault("compensateDayLimit", 1000);
         int compensateLimit = this.configManager.getIntDefault("compensateLimit", 2000);
         if (!this.heroPowerMap.containsKey(heroId)) {
            if ((Long)this.jobMaxPowerMap.get(heroModel.getType()) > 0L) {
               delt = compensateLimit;
            }
         } else {
            long heroPower = (Long)this.heroPowerMap.get(heroId);
            if (heroPower <= 0L) {
               logger.info("英雄={}，跨服战力为0", heroId);
               delt = compensateLimit;
            } else if (heroPower == (Long)this.jobMaxPowerMap.get(heroModel.getType())) {
               delt = -(Integer)MapUtil.getOrDefault(this.lastCompensateMap, heroId, 0);
            } else {
               long times = 0L;
               long maxPower = (Long)this.jobMaxPowerMap.get(heroModel.getType());
               int compensateRatio = this.configManager.getIntDefault("heroRankCompensateRatio", 2000);
               times = maxPower * (long)compensateRatio / heroPower - (long)compensateRatio;
               if (times > (long)compensateLimit) {
                  times = (long)compensateLimit;
               }

               delt = (int)times - (Integer)MapUtil.getOrDefault(this.lastCompensateMap, heroId, 0);
            }
         }

         if (Math.abs(delt) > compensateDayLimit) {
            if (delt > 0) {
               delt = compensateDayLimit;
            } else {
               delt = -compensateDayLimit;
            }
         }

         int compensate = (Integer)MapUtil.getOrDefault(this.lastCompensateMap, heroId, 0) + delt;
         if (compensate <= 0) {
            if (compensate < 0) {
               logger.error("英雄={},加成compensate={}", heroId, compensate);
            }

            return null;
         } else {
            ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
            Map<Integer, Integer> propertyMap = configManager.getIntMap("heroRankProperty");
            if (propertyMap != null && !propertyMap.isEmpty()) {
               List<PropertyModel> list = new ArrayList();

               for(Map.Entry<Integer, Integer> entry : propertyMap.entrySet()) {
                  PropertyModel propertyModel = new PropertyModel((Integer)entry.getKey(), (Integer)entry.getValue(), (long)compensate);
                  list.add(propertyModel);
               }

               return list;
            } else {
               return null;
            }
         }
      }
   }

   public int getHeroRank(int playerId, int heroId) {
      WorldDao<HeroRankData> worldDao = this.worldMgr.<HeroRankData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_HERO_RANK_NEW);
      if (!((HeroRankData)worldDao.jsonData).rankMap.containsKey(heroId)) {
         return -1;
      } else {
         boolean isHavePlayerHero = false;
         List<HeroPowerData> list = new ArrayList();

         for(Map.Entry<Integer, HeroPowerData> entry : ((Map)((HeroRankData)worldDao.jsonData).rankMap.get(heroId)).entrySet()) {
            if ((Integer)entry.getKey() == playerId) {
               isHavePlayerHero = true;
            }

            list.add(entry.getValue());
         }

         if (!isHavePlayerHero) {
            return -1;
         } else {
            Collections.sort(list);
            int rank = 0;

            for(HeroPowerData heroPowerData : list) {
               ++rank;
               if (rank > 10) {
                  return -1;
               }

               if (heroPowerData.playerId == playerId) {
                  return rank;
               }
            }

            return -1;
         }
      }
   }

   @TaskMethod
   public void getCommonArrayingHeroRank(GamePlayer gamePlayer, Map<Integer, Integer> map) {
      HeroExtendMsg.S2C_OpenHeroBagUi_13204.Builder builder = HeroExtendMsg.S2C_OpenHeroBagUi_13204.newBuilder();

      for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
         int rank = this.getHeroRank(gamePlayer.getPlayerId(), (Integer)entry.getValue());
         CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
         info.setKey((Integer)entry.getKey());
         info.setValue(rank);
         builder.addRanks(info);
      }

      gamePlayer.sendMsg(builder.build());
   }

   public Map<Byte, List<PropertyModel>> getHeroRankCompensate(ArrayingMirror arrayingMirror, boolean isRobot) {
      int heroRankOpen = this.configManager.getIntDefault("heroRankOpen", 0);
      if (heroRankOpen <= 0) {
         return null;
      } else if (isRobot) {
         return null;
      } else {
         return arrayingMirror != null && arrayingMirror.arrayingElementsMap != null && !arrayingMirror.arrayingElementsMap.isEmpty() ? this.getHeroRankCompensate(arrayingMirror.arrayingElementsMap) : null;
      }
   }

   public Map<Byte, List<PropertyModel>> getHeroRankCompensate(Map<Byte, ArrayingEntity> mirrorData) {
      int heroRankOpen = this.configManager.getIntDefault("heroRankOpen", 0);
      if (heroRankOpen <= 0) {
         return null;
      } else if (mirrorData != null && !mirrorData.isEmpty()) {
         Map<Byte, List<PropertyModel>> result = new HashMap();

         for(Map.Entry<Byte, ArrayingEntity> entry : mirrorData.entrySet()) {
            if ((Byte)entry.getKey() < 5) {
               HeroArrayingEntity heroArrayingEntity = (HeroArrayingEntity)entry.getValue();
               if (heroArrayingEntity != null && heroArrayingEntity.mirror != null) {
                  List<PropertyModel> heroList = this.getHeroCompensate(heroArrayingEntity.mirror.id);
                  if (heroList != null && !heroList.isEmpty()) {
                     result.put(entry.getKey(), heroList);
                  }
               }
            } else if ((Byte)entry.getKey() == 5) {
               FriendArrayingEntity friendArrayingEntity = (FriendArrayingEntity)entry.getValue();
               if (friendArrayingEntity != null && friendArrayingEntity.mirror != null) {
                  List<PropertyModel> heroList = this.getHeroCompensate(friendArrayingEntity.mirror.id);
                  if (heroList != null && !heroList.isEmpty()) {
                     result.put(entry.getKey(), heroList);
                  }
               }
            }
         }

         if (!result.isEmpty()) {
            return result;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public void uploadHeroInfo() {
      if (this.uploadHeroInfosf != null) {
         logger.info("正在上传武将数据");
      } else {
         int heroRankSizeSave = ApplicationContextProvider.getConfigInt("heroRankSizeSave", 10);
         Map<Integer, List<Integer>> rankDataMap = new HashMap();
         WorldDao<HeroRankData> worldDao = this.worldMgr.<HeroRankData>getWorldDao(GameDefine.WorldModule.WORLD_DAO_HERO_RANK_NEW);

         for(Map.Entry<Integer, Map<Integer, HeroPowerData>> entry : ((HeroRankData)worldDao.jsonData).rankMap.entrySet()) {
            List<HeroPowerData> heroPowerDataList = new ArrayList(((Map)entry.getValue()).values());
            if (heroPowerDataList.size() != 0) {
               Collections.sort(heroPowerDataList);

               for(HeroPowerData heroPowerData : heroPowerDataList.subList(0, Math.min(heroRankSizeSave, heroPowerDataList.size()))) {
                  ((List)rankDataMap.computeIfAbsent(heroPowerData.playerId, (v) -> new ArrayList())).add(heroPowerData.code);
               }
            }
         }

         long startTime = System.currentTimeMillis();
         List<Integer> playerList = new ArrayList(rankDataMap.keySet());
         this.uploadHeroInfosf = this.schedule(2000L, 100L, () -> {
            if (playerList.isEmpty()) {
               if (this.uploadHeroInfosf != null) {
                  this.uploadHeroInfosf.cancel(false);
                  this.uploadHeroInfosf = null;
                  logger.warn("【武将排行】上传到跨服，花费{} ms", System.currentTimeMillis() - startTime);
               }
            } else {
               int playerId = (Integer)playerList.remove(playerList.size() - 1);
               List<Integer> heroCodes = (List)rankDataMap.get(playerId);
               GamePlayer gamePlayer = this.worldMgr.getPlayerById(playerId);
               if (gamePlayer != null && !gamePlayer.isRobot() && heroCodes != null && heroCodes.size() > 0) {
                  HeroBagPart heroBagPart = (HeroBagPart)gamePlayer.getMgrPart(HeroBagPart.class);
                  gamePlayer.pushTask(() -> heroBagPart.uploadHeroRankInfo(heroCodes));
               }

            }
         });
      }
   }
}
