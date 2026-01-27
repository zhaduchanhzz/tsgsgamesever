package com.gzbz.gamePlayer.heroPart;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.HeroDao;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.StarMapDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.StarMapPoint;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.HeroModel;
import com.gzbz.model.StarAspectRumModel;
import com.gzbz.model.StarCampConsumeModel;
import com.gzbz.model.StarMapTypeModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.HeroStarAtlasMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class HeroStarAtlasPart extends PlayerPart {
   static Logger logger = LoggerFactory.getLogger(HeroStarAtlasPart.class);
   public static final int HERO_TYPE_COMMON = 1;
   public static final int HERO_TYPE_PALACE = 2;
   public static final int HERO_TYPE_SOUL = 3;
   public static final int HERO_TYPE_KING = 4;

   public StarCampConsumeModel getStarCampConsumeModel(int camp, int level, int heroType) {
      ConcurrentHashMap<Integer, ConcurrentHashMap<Integer, StarCampConsumeModel>> campModel = (ConcurrentHashMap)ApplicationContextProvider.getModelPoolEntity("customStarCampConsume", heroType);
      if (null == campModel) {
         logger.error("StarCampConsume 配置异常 camp:{}", heroType);
      }

      ConcurrentHashMap<Integer, StarCampConsumeModel> level_model = (ConcurrentHashMap)campModel.get(camp);
      if (null == level_model) {
         logger.error("StarCampConsume 配置异常 camp:{}", camp);
      }

      StarCampConsumeModel starCampConsumeModel = (StarCampConsumeModel)level_model.get(level);
      if (null == starCampConsumeModel && level > 0) {
         logger.error("StarCampConsume 配置异常 camp:{} level:{}", camp, level);
      }

      return starCampConsumeModel;
   }

   public Map<Integer, StarMapPoint> recHeroStarMapPointMap(int heroCode) {
      HeroDao heroDao = this.getHeroDao(heroCode);
      return heroDao.recHeroStarMapPointMap();
   }

   public HeroDao getHeroDao(int heroCode) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      if (null == heroDao) {
         logger.error("玩家:{} 英雄背包中未找到英雄 heroCode:{}", this.player.getPlayerId(), heroCode);
      }

      return heroDao;
   }

   public void updateHeroDaoAndFlush(int heroCode) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      heroDao.setStarMapTotalLv(heroDao.recStarMapTotalLv());
      heroDao.updateOp();
      heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODULE_STAR_MAP, heroDao);
   }

   @MsgHandlerAnno
   public boolean C2S_OptionSkillGroup_21403(HeroStarAtlasMsg.C2S_OptionSkillGroup_21403 msg, String source) {
      Map<Integer, StarMapPoint> heroStarMapPointMap = this.recHeroStarMapPointMap(msg.getHeroCode());
      if (null == heroStarMapPointMap) {
         return this.player.failure(76184);
      } else {
         StarMapPoint starMapPoint = (StarMapPoint)heroStarMapPointMap.get(msg.getStarId());
         if (null == starMapPoint) {
            return this.player.failure(6);
         } else if (starMapPoint.optionSkillGroup == 0) {
            return this.player.failure(76185);
         } else {
            HeroDao heroDao = this.getHeroDao(msg.getHeroCode());
            if (null == heroDao) {
               return this.player.failure(4100);
            } else {
               StarMapTypeModel starMapTypeModel = StarMapDefine.getStarMapTypeModel(heroDao);
               if (null == starMapTypeModel) {
                  return this.player.failure(37);
               } else {
                  List<Integer> starSelectGroupList = StarMapDefine.getStarSelectGroupList(starMapTypeModel.getType());
                  if (!starSelectGroupList.contains(msg.getSkillGroup())) {
                     return this.player.failure(6);
                  } else {
                     List<Integer> hasSkillGroups = StarMapDefine.getHasSkillGroupList(heroStarMapPointMap);
                     if (hasSkillGroups.contains(msg.getSkillGroup())) {
                        return this.player.failure(76186);
                     } else {
                        starMapPoint.optionSkillGroup = msg.getSkillGroup();
                        this.updateHeroDaoAndFlush(msg.getHeroCode());
                        HeroStarAtlasMsg.S2C_OptionSkillGroup_21404.Builder resp = HeroStarAtlasMsg.S2C_OptionSkillGroup_21404.newBuilder();
                        this.player.sendMsg(resp.build());
                        return true;
                     }
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_StarIdLvUp_21405(HeroStarAtlasMsg.C2S_StarIdLvUp_21405 msg, String source) {
      HeroDao heroDao = this.getHeroDao(msg.getHeroCode());
      if (null == heroDao) {
         return this.player.failure(4100);
      } else {
         Map<Integer, StarMapPoint> heroStarMapPointMap = this.recHeroStarMapPointMap(msg.getHeroCode());
         if (null == heroStarMapPointMap) {
            return this.player.failure(76184);
         } else {
            StarMapPoint starMapPoint = (StarMapPoint)heroStarMapPointMap.get(msg.getStarId());
            if (null == starMapPoint) {
               return this.player.failure(6);
            } else {
               StarMapTypeModel starMapTypeModel = StarMapDefine.getStarMapTypeModel(heroDao);
               if (null == starMapTypeModel) {
                  return this.player.failure(37);
               } else {
                  StarAspectRumModel starAspectRumModel = StarMapDefine.getStarAspectRumModel(starMapTypeModel.getStarMapId(), starMapPoint.starId, starMapPoint.starLv);
                  if (null == starAspectRumModel) {
                     return this.player.failure(37);
                  } else {
                     int nextId = starAspectRumModel.getNextId();
                     StarAspectRumModel nextLvStarAspectRumModel = StarMapDefine.getStarAspectRumModel(nextId);
                     if (null == nextLvStarAspectRumModel) {
                        return this.player.failure(76197);
                     } else {
                        int starMapTotalLv = this.recStarMapTotalLv(msg.getHeroCode());
                        if (starMapTotalLv < nextLvStarAspectRumModel.getNeedAllLevel()) {
                           return this.player.failure(76198);
                        } else {
                           StarCampConsumeModel starCampConsumeModel = null;
                           if (heroDao.type == HeroDefine.HERO_SP_TYPE_PALACE) {
                              HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPool().getEntity("hero", heroDao.shareHeroId);
                              if (heroModel == null) {
                                 return this.player.failure(4100);
                              }

                              starCampConsumeModel = this.getStarCampConsumeModel(heroModel.getNation(), nextLvStarAspectRumModel.getLevel(), 2);
                           } else {
                              HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPool().getEntity("hero", heroDao.id);
                              if (heroModel == null) {
                                 return this.player.failure(4100);
                              }

                              if (heroModel.getNation() == 10) {
                                 if (heroDao.inheritNation <= 0) {
                                    return this.player.failure(6);
                                 }

                                 starCampConsumeModel = this.getStarCampConsumeModel(heroDao.inheritNation, nextLvStarAspectRumModel.getLevel(), 3);
                              } else if (heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING) {
                                 starCampConsumeModel = this.getStarCampConsumeModel(heroModel.getNation(), nextLvStarAspectRumModel.getLevel(), 4);
                              } else {
                                 starCampConsumeModel = this.getStarCampConsumeModel(heroModel.getNation(), nextLvStarAspectRumModel.getLevel(), 1);
                              }
                           }

                           if (null == starCampConsumeModel) {
                              return this.player.failure(37);
                           } else if (!this.player.checkResourceNum(starCampConsumeModel.getConsumes())) {
                              return this.player.failure(76135);
                           } else {
                              this.player.delResource((List)starCampConsumeModel.getConsumes(), 128, 12801, 0, 0, "");
                              starMapPoint.starLv = nextLvStarAspectRumModel.getLevel();
                              List<Integer> unlockStarId = nextLvStarAspectRumModel.getUnlockStarId();
                              if (null != unlockStarId && unlockStarId.size() > 0) {
                                 for(Integer starId : unlockStarId) {
                                    if (!heroStarMapPointMap.containsKey(starId)) {
                                       StarMapPoint initStarMapPoint = StarMapDefine.getInitStarMapPoint(heroDao, nextLvStarAspectRumModel.getStarMapId(), starId, heroStarMapPointMap);
                                       if (null != initStarMapPoint) {
                                          heroStarMapPointMap.put(starId, initStarMapPoint);
                                       }
                                    }
                                 }
                              }

                              if (heroDao.type == HeroDefine.HERO_SP_TYPE_PALACE) {
                                 starMapTotalLv = this.recStarMapTotalLv(msg.getHeroCode());
                                 String starDiWangSkill = ApplicationContextProvider.getConfigString("starDiWangSkill", "32|1001|1002|1003|1004,64|2001|2002|2003|2004,96|3001");
                                 String[] levSkill = starDiWangSkill.split(",");
                                 String[] skillStr = levSkill[2].split("\\|");
                                 if (starMapTotalLv >= Integer.parseInt(skillStr[0]) && !heroDao.palaceStarSkill.containsKey(Integer.parseInt(skillStr[0]))) {
                                    heroDao.palaceStarSkill.put(Integer.parseInt(skillStr[0]), Integer.parseInt(skillStr[1]));
                                    heroDao.updateOp();
                                    this.sendSelectSkill(heroDao);
                                 }
                              }

                              this.updateHeroDaoAndFlush(msg.getHeroCode());
                              int newStarMapTotalLv = this.recStarMapTotalLv(msg.getHeroCode());
                              this.player.triggerTask(723, 0, (long)newStarMapTotalLv, 0);
                              GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
                              giftPart.triggerTimeLimitGift(32, newStarMapTotalLv);
                              giftPart.triggerTimeLimitGift(33, nextLvStarAspectRumModel.getLevel());
                              HeroStarAtlasMsg.C2S_StarIdLvUp_21406.Builder resp = HeroStarAtlasMsg.C2S_StarIdLvUp_21406.newBuilder();
                              resp.setLevel(newStarMapTotalLv);
                              this.player.sendMsg(resp.build());
                              return true;
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_StarMapSkill_21409(HeroStarAtlasMsg.C2S_StarMapSkill_21409 msg, String source) {
      HeroDao heroDao = this.getHeroDao(msg.getHeroCode());
      if (null == heroDao) {
         this.player.failure(4100);
      } else if (heroDao.type == HeroDefine.HERO_SP_TYPE_PALACE) {
         int starMapTotalLv = this.recStarMapTotalLv(msg.getHeroCode());
         if (starMapTotalLv >= msg.getLev()) {
            if (heroDao.palaceStarSkill.values().contains(msg.getSkillId())) {
               this.player.failure(76199);
            } else {
               StarMapTypeModel starMapTypeModel = StarMapDefine.getStarMapTypeModel(heroDao);
               if ((Integer)starMapTypeModel.getSkill().get(0) != msg.getLev() && (Integer)starMapTypeModel.getSkill2().get(0) != msg.getLev() && (Integer)starMapTypeModel.getSkill3().get(0) != msg.getLev()) {
                  this.player.failure(76200);
               } else {
                  boolean isSkillId = false;
                  String starDiWangSkill = ApplicationContextProvider.getConfigString("starDiWangSkill", "32|1001|1002|1003|1004,64|2001|2002|2003|2004,96|3001");
                  String[] levSkill = starDiWangSkill.split(",");

                  for(int i = 0; i < levSkill.length; ++i) {
                     String[] skillStr = levSkill[i].split("\\|");
                     if (Integer.parseInt(skillStr[0]) == msg.getLev()) {
                        for(int j = 0; j < skillStr.length; ++j) {
                           if (j != 0 && Integer.parseInt(skillStr[j]) == msg.getSkillId()) {
                              isSkillId = true;
                              break;
                           }
                        }
                     }
                  }

                  if (isSkillId) {
                     heroDao.palaceStarSkill.put(msg.getLev(), msg.getSkillId());
                     heroDao.updateOp();
                     HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                     heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODULE_STAR_MAP, heroDao);
                     this.sendSelectSkill(heroDao);
                  }
               }
            }
         }
      }
   }

   public void sendSelectSkill(HeroDao heroDao) {
      HeroStarAtlasMsg.S2C_StarMapSkill_21410.Builder builder = HeroStarAtlasMsg.S2C_StarMapSkill_21410.newBuilder();

      for(Map.Entry<Integer, Integer> entry : heroDao.palaceStarSkill.entrySet()) {
         CommonMsg.MapDataII.Builder mapBuilder = CommonMsg.MapDataII.newBuilder();
         mapBuilder.setKey((Integer)entry.getKey());
         mapBuilder.setValue((Integer)entry.getValue());
         builder.addSelectSkill(mapBuilder);
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public boolean C2S_StarMapReset_21407(HeroStarAtlasMsg.C2S_StarMapReset_21407 msg, String source) {
      HeroDao heroDao = this.getHeroDao(msg.getHeroCode());
      if (null == heroDao) {
         return this.player.failure(4100);
      } else {
         Map<Integer, StarMapPoint> heroStarMapPointMap = this.recHeroStarMapPointMap(msg.getHeroCode());
         if (heroStarMapPointMap != null && !heroStarMapPointMap.isEmpty()) {
            List<ResourceModel> starMapResetReturnRewards = this.getStarMapResetReturnRewards(msg.getHeroCode());
            this.player.addResource(starMapResetReturnRewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 128, 12802, 0, 0, "");
            heroStarMapPointMap.clear();
            heroDao.palaceStarSkill.clear();
            this.updateHeroDaoAndFlush(msg.getHeroCode());
            HeroStarAtlasMsg.S2C_StarMapReset_21408.Builder resp = HeroStarAtlasMsg.S2C_StarMapReset_21408.newBuilder();
            this.player.sendMsg(resp.build());
            return true;
         } else {
            return this.player.failure(76184);
         }
      }
   }

   public List<ResourceModel> getStarMapResetReturnRewards(int heroCode) {
      List<ResourceModel> rewardList = new ArrayList();
      Map<Integer, StarMapPoint> heroStarMapPointMap = this.recHeroStarMapPointMap(heroCode);
      if (null != heroStarMapPointMap && !heroStarMapPointMap.isEmpty()) {
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
         if (null == heroDao) {
            return rewardList;
         } else {
            int heroType = 1;
            int camp;
            if (heroDao.type == HeroDefine.HERO_SP_TYPE_PALACE) {
               heroType = 2;
               HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPool().getEntity("hero", heroDao.shareHeroId);
               if (heroModel == null) {
                  logger.error("未找到君主武将的继承武将id:{}", heroDao.shareHeroId);
                  return rewardList;
               }

               camp = heroModel.getNation();
            } else {
               HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPool().getEntity("hero", heroDao.id);
               if (heroModel == null) {
                  return rewardList;
               }

               if (heroModel.getNation() == 10) {
                  if (heroDao.inheritNation == 0) {
                     return rewardList;
                  }

                  heroType = 3;
                  camp = heroDao.inheritNation;
               } else if (heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING) {
                  heroType = 4;
                  camp = heroModel.getNation();
               } else {
                  camp = heroModel.getNation();
               }
            }

            for(Map.Entry<Integer, StarMapPoint> starId_starMapPoint : heroStarMapPointMap.entrySet()) {
               StarMapPoint starMapPoint = (StarMapPoint)starId_starMapPoint.getValue();
               if (starMapPoint.starLv > 0) {
                  int starLv = starMapPoint.starLv;

                  for(int i = starLv; i >= 0; --i) {
                     StarCampConsumeModel starCampConsumeModel = this.getStarCampConsumeModel(camp, i, heroType);
                     if (starCampConsumeModel != null && !starCampConsumeModel.getConsumes().isEmpty()) {
                        if (heroDao.type == HeroDefine.HERO_SP_TYPE_PALACE) {
                           for(ResourceModel consume : starCampConsumeModel.getPayBack()) {
                              consume.addResourceToList(rewardList);
                           }
                        } else {
                           for(ResourceModel consume : starCampConsumeModel.getConsumes()) {
                              consume.addResourceToList(rewardList);
                           }
                        }
                     }
                  }
               }
            }

            return rewardList;
         }
      } else {
         return rewardList;
      }
   }

   public int recStarMapTotalLv(int heroCode) {
      HeroDao heroDao = this.getHeroDao(heroCode);
      return heroDao.recStarMapTotalLv();
   }
}
