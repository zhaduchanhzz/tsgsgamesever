package com.gzbz.shrine;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.part.ActHeroImprovePart;
import com.gzbz.activity.part.KrActHeroImprovePart;
import com.gzbz.db.HeroDao;
import com.gzbz.db.HeroPalaceDao;
import com.gzbz.db.KingControlDao;
import com.gzbz.db.worldBean.ControlData;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.armyArray.ArmyArrayPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroPalacePart;
import com.gzbz.gamePlayer.heroPart.HeroUpgradePart;
import com.gzbz.gamePlayer.heroPart.HeroWearPart;
import com.gzbz.gamePlayer.playerBag.HeroAideItem;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.model.AideLevelModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.ShrineReturnModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.ShrineMsg;
import com.gzbz.robot.MonsterManager;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ShrinePart extends PlayerPart {
   @Autowired
   ConfigManager configManager;

   @MsgHandlerAnno
   public boolean msgPreview(ShrineMsg.C2S_Preview_8701 msg, String source) {
      if (!this.player.isSystemOpen(1150)) {
         this.player.failure(21);
         return false;
      } else {
         int type = msg.getType();
         if (type != 3 && type != 6) {
            return false;
         } else {
            int code = msg.getCode();
            HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
            HeroDao heroDao = heroBagPart.getHeroByCode(code);
            if (heroDao == null) {
               return this.player.failure(4100);
            } else if (!heroDao.lock && !heroDao.isHaveArrayingState()) {
               if (!this.checkStarLimit(type, heroDao.getStar())) {
                  return this.player.failure(26000);
               } else {
                  ShrineMsg.S2C_Preview_8702.Builder builder = ShrineMsg.S2C_Preview_8702.newBuilder();
                  builder.setType(type);
                  builder.setCode(code);
                  List<Integer> codeList = new ArrayList();
                  codeList.add(code);

                  for(CommonMsg.ItemInfo.Builder itemInfo : heroBagPart.getDelHeroReturnResourceList(codeList, HeroDefine.DelHeroReturnShowType.RECALL)) {
                     builder.addItemInfo(itemInfo);
                  }

                  this.player.sendMsg(builder.build());
                  return true;
               }
            } else {
               this.logger.warn("该武将已锁定或处于上阵状态");
               return this.player.failure(38);
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean msgExchange(ShrineMsg.C2S_Exchange_8703 msg, String source) {
      if (!this.player.isSystemOpen(1150)) {
         return this.player.failure(21);
      } else {
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         int code = msg.getOriginCode();
         Set<Integer> codeList = new HashSet(msg.getMaterialCodeList());
         List<Integer> materialCodeList = new ArrayList(codeList);
         if (materialCodeList.size() < 1) {
            return this.player.failure(4);
         } else {
            HeroDao heroDao = heroBagPart.getHeroByCode(code);
            if (heroDao == null) {
               return this.player.failure(4100);
            } else if (HeroModel.isReplacementHero(heroDao.id)) {
               return false;
            } else {
               HeroPalacePart heroPalacePart = (HeroPalacePart)this.player.getMgrPart(HeroPalacePart.class);
               HeroPalaceDao heroPalaceDao = heroPalacePart.getHeroPalaceDao();
               if (heroDao.code == heroPalaceDao.heroCode) {
                  return this.player.failure(76042);
               } else if (heroDao.code == heroPalaceDao.shareCode) {
                  return this.player.failure(76047);
               } else if (heroBagPart.linkHeroCantDo(heroDao)) {
                  return false;
               } else if (!heroDao.lock && !heroDao.isHaveArrayingState()) {
                  if (!this.checkStarLimit(heroDao.getStar(), "shrineExchangeStarLimit")) {
                     return this.player.failure(26000);
                  } else {
                     int shrineExchangeProp = this.configManager.getInt("shrineExchangeProp");
                     HashMap<Integer, Integer> mapPropNum = this.configManager.getIntMap("shrineExchangePropNum");
                     if (!mapPropNum.containsKey(heroDao.getStar())) {
                        this.logger.error("没有配置{}星武将置换所需要的道具数量", heroDao.getStar());
                        return this.player.failure(37);
                     } else {
                        int needPropNum = (Integer)mapPropNum.get(heroDao.getStar());
                        if (!this.player.checkResourceNum(2, shrineExchangeProp, needPropNum)) {
                           return this.player.failure(3);
                        } else {
                           Map<Integer, Integer> exchangeCountMap = this.configManager.getIntMap("shrineExchangeCount");
                           if (exchangeCountMap.containsKey(heroDao.getStar()) && (Integer)exchangeCountMap.get(heroDao.getStar()) == materialCodeList.size()) {
                              int destHeroId = 0;
                              Iterator destHeroModel = materialCodeList.iterator();

                              while(true) {
                                 if (destHeroModel.hasNext()) {
                                    int materialCode = (Integer)destHeroModel.next();
                                    HeroDao tempHeroDao = heroBagPart.getHeroByCode(materialCode);
                                    if (tempHeroDao == null) {
                                       this.logger.error("武将置换，不存在该武将,code:{}", materialCode);
                                       return this.player.failure(4100);
                                    }

                                    if (!tempHeroDao.lock && !heroDao.isHaveArrayingState()) {
                                       if (heroBagPart.linkHeroCantDo(tempHeroDao)) {
                                          return false;
                                       }

                                       if (0 == destHeroId) {
                                          destHeroId = tempHeroDao.id;
                                       }

                                       if (destHeroId != tempHeroDao.id) {
                                          return this.player.failure(26001);
                                       }
                                       continue;
                                    }

                                    this.logger.warn("该武将已锁定或处于上阵状态");
                                    return this.player.failure(38);
                                 }

                                 if (0 == destHeroId) {
                                    return this.player.failure(26002);
                                 }

                                 HeroModel destHeroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", destHeroId);
                                 if (destHeroModel.getStar() == 5 && destHeroModel.getSkills().size() == 5) {
                                    HeroModel oriHeroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
                                    String shrineExchangeGroupLimit = this.configManager.getStr("shrineExchangeGroupLimit");
                                    String[] strArray = shrineExchangeGroupLimit.split("\\|");
                                    boolean bNationLimit = true;

                                    for(String str : strArray) {
                                       List<Integer> nationList = new ArrayList();
                                       String[] nations = str.split(":");

                                       for(String nation : nations) {
                                          nationList.add(Integer.parseInt(nation));
                                       }

                                       if (nationList.contains(oriHeroModel.getNation()) && nationList.contains(destHeroModel.getNation())) {
                                          bNationLimit = false;
                                          break;
                                       }
                                    }

                                    if (bNationLimit) {
                                       return this.player.failure(26003);
                                    }

                                    HeroUpgradePart heroUpgradePart = (HeroUpgradePart)this.player.getMgrPart(HeroUpgradePart.class);
                                    int upStarId = heroUpgradePart.getHeroUpStarId(destHeroId, heroDao.getStar());
                                    if (upStarId <= 0) {
                                       MonsterManager monsterManager = (MonsterManager)ApplicationContextProvider.getContext().getBean(MonsterManager.class);
                                       int maxStar = monsterManager.getMaxStarOfHero(destHeroId);
                                       if (maxStar != heroDao.getStar()) {
                                          return this.player.failure(4103);
                                       }
                                    }

                                    this.player.delResource(2, shrineExchangeProp, (long)needPropNum, 26, 2602, 0, 0, "");
                                    boolean success = heroBagPart.deleteHero(materialCodeList, HeroDefine.DelHeroType.DEL_USE, 26, 2602, 0, 0, "");
                                    if (!success) {
                                       this.logger.info("删除武将失败 playerId:{} codeList:{}", this.player.getPlayerId(), materialCodeList);
                                       return false;
                                    }

                                    if (heroDao.aide > 0) {
                                       AideLevelModel aideLevelModel = (AideLevelModel)ApplicationContextProvider.getModelPoolEntity("aideLevel", heroDao.aide);
                                       if (aideLevelModel != null) {
                                          heroDao.aide = 0;
                                          ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                                          HeroAideItem heroAideItem = itemBagPart.addHeroAide(aideLevelModel, 26, 2602, 0, 0, "");
                                          this.player.additemUpdateBuilder(heroAideItem);
                                          this.player.addResourceMsg(heroAideItem);
                                       }
                                    }

                                    if (heroDao.aide2 > 0) {
                                       AideLevelModel aideLevelModel = (AideLevelModel)ApplicationContextProvider.getModelPoolEntity("aideLevel", heroDao.aide2);
                                       if (aideLevelModel != null) {
                                          heroDao.aide2 = 0;
                                          ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
                                          HeroAideItem heroAideItem = itemBagPart.addHeroAide(aideLevelModel, 26, 2602, 0, 0, "");
                                          this.player.additemUpdateBuilder(heroAideItem);
                                          this.player.addResourceMsg(heroAideItem);
                                       }
                                    }

                                    List<ResourceModel> tempList = new ArrayList();
                                    heroBagPart.starMapResetAndReturn(heroDao.code, tempList, true);
                                    HeroWearPart heroWearPart = (HeroWearPart)this.player.getMgrPart(HeroWearPart.class);
                                    heroWearPart.undressAllExclusiveWarriorSignet(heroDao);
                                    this.player.senditemUpdateMsg();
                                    if (!tempList.isEmpty()) {
                                       this.player.addResource(tempList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 26, 2602, 0, 0, "");
                                    } else {
                                       this.player.sendResourceMsg();
                                    }

                                    heroDao.id = destHeroId;
                                    heroDao.upStarId = upStarId;
                                    heroDao.armyArrayGrids.clear();
                                    heroDao.armyArraySkill.clear();
                                    heroDao.updateOp();
                                    if (oriHeroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING) {
                                       heroBagPart.flushControlHero(HeroDefine.HeroPropertyModel.MODEL_HERO, oriHeroModel.getNation());
                                    }

                                    if (destHeroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING) {
                                       int nation = heroBagPart.checkIsControl(heroDao);
                                       if (nation > 0) {
                                          KingControlDao kingControlDao = (KingControlDao)this.player.getData("tb_king_control", this.player.getPlayerId());
                                          if (kingControlDao.controlData.controlMap.containsKey(nation)) {
                                             List<ControlData> controlDataList = (List)kingControlDao.controlData.controlMap.get(nation);
                                             Iterator<ControlData> it = controlDataList.iterator();

                                             while(it.hasNext()) {
                                                ControlData controlData = (ControlData)it.next();
                                                if (controlData.heroCode == heroDao.code) {
                                                   it.remove();
                                                   break;
                                                }
                                             }

                                             kingControlDao.updateOp();
                                          }
                                       }
                                    }

                                    heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_ALL, heroDao);
                                    ShrineMsg.S2C_Exchange_8704.Builder builder = ShrineMsg.S2C_Exchange_8704.newBuilder();
                                    builder.setOriHeroId(oriHeroModel.getId());
                                    builder.setDestHeroId(destHeroId);
                                    builder.setStars(heroDao.getStar());
                                    builder.setOriginCode(code);
                                    this.player.sendMsg(builder.build());
                                    this.player.getOperationMgr().addExtraLog(this.player, 170, oriHeroModel.getType() + "&" + oriHeroModel.getName() + "&" + heroDao.getStar(), needPropNum + "", destHeroModel.getType() + "&" + destHeroModel.getName() + "&" + heroDao.getStar());
                                    heroBagPart.triggerHeroStarTask(heroDao, false);
                                    ArmyArrayPart armyArrayPart = (ArmyArrayPart)this.player.getMgrPart(ArmyArrayPart.class);
                                    List<Integer> chList = new ArrayList();
                                    chList.add(code);
                                    armyArrayPart.checkEyes(chList);
                                    ActHeroImprovePart actHeroImprovePart = (ActHeroImprovePart)this.player.getMgrPart(ActHeroImprovePart.class);
                                    actHeroImprovePart.checkHeroMaxStarChange(heroDao.id);
                                    KrActHeroImprovePart krActHeroImprovePart = (KrActHeroImprovePart)this.player.getMgrPart(KrActHeroImprovePart.class);
                                    krActHeroImprovePart.checkHeroMaxStarChange(heroDao.id);
                                    heroBagPart.recordMaxStar(heroDao.id, heroDao.getStar(), false);
                                    return true;
                                 }

                                 return this.player.failure(26004);
                              }
                           } else {
                              this.logger.info("材料武将数量不对");
                              return false;
                           }
                        }
                     }
                  }
               } else {
                  this.logger.warn("该武将已锁定或处于上阵状态");
                  return this.player.failure(38);
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void msgRecall(ShrineMsg.C2S_Recall_8705 msg, String source) {
      int code = msg.getCode();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      boolean bSuccsee = heroBagPart.handleHeroRecall(code);
      if (bSuccsee) {
         ShrineMsg.S2C_Recall_8706.Builder builder = ShrineMsg.S2C_Recall_8706.newBuilder();
         builder.setCode(code);
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public boolean msgRebirth(ShrineMsg.C2S_Rebirth_8707 msg, String source) {
      if (!this.player.isSystemOpen(1150)) {
         return this.player.failure(21);
      } else {
         int code = msg.getCode();
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         HeroDao heroDao = heroBagPart.getHeroByCode(code);
         if (heroDao == null) {
            return false;
         } else if (!heroDao.lock && !heroDao.isHaveArrayingState()) {
            if (!this.handleReborn(heroDao)) {
               return false;
            } else {
               ShrineMsg.S2C_Rebirth_8708.Builder builder = ShrineMsg.S2C_Rebirth_8708.newBuilder();
               builder.setCode(heroDao.code);
               this.player.sendMsg(builder.build());
               this.player.triggerTask(348, 0, 1L, 1);
               return true;
            }
         } else {
            this.logger.warn("该武将已锁定或处于上阵状态");
            return this.player.failure(38);
         }
      }
   }

   private boolean checkStarLimit(int star, String strLimit) {
      ArrayList<Integer> stars = this.configManager.getIntList(strLimit);
      return stars.contains(star);
   }

   private boolean checkStarLimit(int type, int star) {
      List<Integer> starList = null;
      switch (type) {
         case 1:
         case 4:
            starList = this.configManager.getIntList("shrineRebornStarLimit");
            break;
         case 2:
         case 5:
            starList = this.configManager.getIntList("shrineExchangeStarLimit");
            break;
         case 3:
         case 6:
            starList = this.configManager.getIntList("shrineRecallStarLimit");
      }

      return !CollectionUtils.isEmpty(starList) && starList.contains(star);
   }

   private boolean handleReborn(HeroDao heroDao) {
      int star = heroDao.getStar();
      int shrineRebornProp = this.configManager.getInt("shrineRebornProp");
      HashMap<Integer, Integer> mapPropNum = this.configManager.getIntMap("shrineRebornPropNum");
      if (!CollectionUtils.isEmpty(mapPropNum) && mapPropNum.containsKey(star)) {
         HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
         int needNum = (Integer)mapPropNum.get(star);
         if (!this.player.checkResourceNum(2, shrineRebornProp, needNum)) {
            return this.player.failure(3);
         } else {
            HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
            List<Integer> delList = new ArrayList();
            delList.add(heroDao.code);
            boolean success = heroBagPart.deleteHero(delList, HeroDefine.DelHeroType.REBORN, 26, 2601, 0, 0, "code:" + heroDao.code);
            if (!success) {
               this.logger.info("删除武将失败 playerId:{} delList:{}", this.player.getPlayerId(), delList);
               return false;
            } else {
               this.player.delResource(2, shrineRebornProp, (long)needNum, 26, 2601, 0, 0, "");
               this.player.getOperationMgr().addExtraLog(this.player, 169, heroModel.getType() + "&" + heroModel.getName() + "&" + star, needNum + "");
               return true;
            }
         }
      } else {
         this.logger.warn("转生神坛-重生消耗配置错误 shrineRebornPropNum");
         return false;
      }
   }

   public ShrineReturnModel getModel(int type, int star) {
      Map<Integer, TreeMap<Integer, ShrineReturnModel>> shrineReturnMap = ApplicationContextProvider.<Integer, TreeMap<Integer, ShrineReturnModel>>getModelPoolMap("customShrineReturn");
      return shrineReturnMap.containsKey(type) && ((TreeMap)shrineReturnMap.get(type)).containsKey(star) ? (ShrineReturnModel)((TreeMap)shrineReturnMap.get(type)).get(star) : null;
   }
}
