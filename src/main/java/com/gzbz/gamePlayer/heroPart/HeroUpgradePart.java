package com.gzbz.gamePlayer.heroPart;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.part.ActHeroImprovePart;
import com.gzbz.activity.part.KrActHeroImprovePart;
import com.gzbz.chat.ChatMgr;
import com.gzbz.db.HeroArrayingDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.HeroPalaceDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.equip.CastSoulPart;
import com.gzbz.gamePlayer.playerBag.WarriorSignet;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.HeroBreachModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.HeroReplaceModel;
import com.gzbz.model.HeroUpStarModel;
import com.gzbz.model.LanguageModel;
import com.gzbz.model.UpgradeModel;
import com.gzbz.model.fun.NeedItemsFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.HeroExtendMsg;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.part.RankPart;
import com.gzbz.robot.MonsterManager;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
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
public class HeroUpgradePart extends PlayerPart {
   static Logger logger = LoggerFactory.getLogger(HeroUpgradePart.class);
   @Autowired
   private WorldMgr worldMgr;
   @Autowired
   ConfigManager configManager;
   @Autowired
   ActivityMgr activityMgr;
   private HeroExtendMsg.S2C_OneKeyHeroUpdateStarResult_13222.Builder oneKeyStarResultBuilder = HeroExtendMsg.S2C_OneKeyHeroUpdateStarResult_13222.newBuilder();

   @MsgHandlerAnno
   public void C2S_HeroUpdateStar_5011(HeroMsg.C2S_HeroUpdateStar_5011 msg, String source) {
      List<HeroMsg.MaterHeroList> gridsList = msg.getGridsList();
      this.OnHeroUpdateStar(gridsList, false);
   }

   @MsgHandlerAnno
   public void C2S_OneKeyHeroUpdateStar_13221(HeroExtendMsg.C2S_OneKeyHeroUpdateStar_13221 msg, String source) {
      this.oneKeyStarResultBuilder.clear();
      this.oneKeyStarResultBuilder.setResult(0);

      for(HeroExtendMsg.HeroUpdateStarRequest gridsList : msg.getUpStarRequestsList()) {
         this.OnHeroUpdateStar(gridsList.getGridsList(), true);
      }

      this.player.sendMsg(this.oneKeyStarResultBuilder.build());
   }

   public void gmTestOneKeyHeroUpdateStar() {
      Map<Integer, Map<Integer, HeroDao>> nationMatiralMap = new ConcurrentHashMap();
      Map<Integer, HeroDao> heroDaoMap = this.player.<Integer, HeroDao>getMap("tb_hero_bag", this.player.getPlayerId());

      for(HeroDao heroDao : heroDaoMap.values()) {
         if (heroDao.getStar() == 4 || heroDao.getStar() == 3) {
            HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroDao.id);
            if (heroModel != null) {
               ((Map)nationMatiralMap.computeIfAbsent(heroModel.getNation(), (v) -> new ConcurrentHashMap())).computeIfAbsent(heroDao.code, (v) -> heroDao);
            }
         }
      }

      this.oneKeyStarResultBuilder.clear();
      this.oneKeyStarResultBuilder.setResult(0);

      for(Map.Entry<Integer, Map<Integer, HeroDao>> entry : nationMatiralMap.entrySet()) {
         this.gmTestOnNationHeroUpdateStar((Integer)entry.getKey(), (Map)entry.getValue());
      }

      this.player.sendMsg(this.oneKeyStarResultBuilder.build());
   }

   public void gmTestOnNationHeroUpdateStar(int nation, Map<Integer, HeroDao> nationHeroMap) {
      ConcurrentHashMap<Integer, LinkedList<HashSet<Integer>>> originMaterialMap = new ConcurrentHashMap();
      Set<Integer> hightMaterialSet = new HashSet();
      Set<Integer> lowMaterialSet = new HashSet();

      for(HeroDao heroDao : nationHeroMap.values()) {
         if (!heroDao.isHaveArrayingState() && !heroDao.lock) {
            HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroDao.id);
            if (heroModel != null) {
               if (heroModel.getStar() == 4) {
                  LinkedList<HashSet<Integer>> groupList = (LinkedList)originMaterialMap.get(heroDao.id);
                  if (null != groupList) {
                     HashSet<Integer> codeSet = (HashSet)groupList.getLast();
                     if (null != codeSet) {
                        if (codeSet.size() >= 3) {
                           HashSet newSet = new HashSet();
                           newSet.add(heroDao.code);
                           groupList.addLast(newSet);
                        } else {
                           codeSet.add(heroDao.code);
                        }
                     }
                  } else {
                     HashSet newSet = new HashSet();
                     newSet.add(heroDao.code);
                     ((LinkedList)originMaterialMap.computeIfAbsent(heroDao.id, (v) -> new LinkedList())).addLast(newSet);
                  }
               } else if (heroModel.getStar() == 3) {
                  lowMaterialSet.add(heroDao.code);
               }
            }
         }
      }

      if (!originMaterialMap.isEmpty()) {
         logger.info("阵营 nation {} 一键升星操作-->>", nation);
         Set<Integer> eraseSet = new HashSet();

         for(Map.Entry<Integer, LinkedList<HashSet<Integer>>> entry : originMaterialMap.entrySet()) {
            LinkedList<HashSet<Integer>> groupList = (LinkedList)entry.getValue();
            if (!groupList.isEmpty()) {
               HashSet<Integer> lastCodeSet = (HashSet)groupList.getLast();
               if (null != lastCodeSet && lastCodeSet.size() < 3) {
                  logger.info("heroId [{}]一共{}组，移最后一组{}个到四星狗粮组", new Object[]{entry.getKey(), ((LinkedList)entry.getValue()).size(), lastCodeSet.size()});

                  for(Integer code : lastCodeSet) {
                     hightMaterialSet.add(code);
                  }

                  logger.info("四星狗粮组 size {}", hightMaterialSet.size());
                  groupList.removeLast();
               }
            }

            if (groupList.isEmpty()) {
               eraseSet.add(entry.getKey());
            }
         }

         if (!eraseSet.isEmpty()) {
            for(Integer heroId : eraseSet) {
               originMaterialMap.remove(heroId);
            }
         }

         if (!originMaterialMap.isEmpty()) {
            LinkedList<Map.Entry<Integer, LinkedList<HashSet<Integer>>>> sortArry = new LinkedList(originMaterialMap.entrySet());
            int loop = 0;

            do {
               int totalGroup = 0;

               for(Map.Entry<Integer, LinkedList<HashSet<Integer>>> entry : originMaterialMap.entrySet()) {
                  LinkedList<HashSet<Integer>> groupList = (LinkedList)entry.getValue();
                  totalGroup += groupList.size();
               }

               if (hightMaterialSet.size() / 5 >= totalGroup) {
                  logger.info("四星狗粮组 size {} ,合成英雄最大数量 {}", hightMaterialSet.size(), totalGroup);
                  break;
               }

               sortArry.sort((o1, o2) -> {
                  LinkedList<HashSet<Integer>> list1 = (LinkedList)o1.getValue();
                  LinkedList<HashSet<Integer>> list2 = (LinkedList)o2.getValue();
                  int heroId1 = (Integer)o1.getKey();
                  int heroId2 = (Integer)o2.getKey();
                  int size1 = list1.size();
                  int size2 = list2.size();
                  if (size1 == size2) {
                     return heroId1 < heroId2 ? -1 : 1;
                  } else {
                     return size1 > size2 ? -1 : 1;
                  }
               });
               logger.info("排序结果：");

               for(Map.Entry<Integer, LinkedList<HashSet<Integer>>> entry : sortArry) {
                  logger.info("heroId [{}], size {}", entry.getKey(), ((LinkedList)entry.getValue()).size());
               }

               Map.Entry<Integer, LinkedList<HashSet<Integer>>> partEntry = (Map.Entry)sortArry.getFirst();
               Integer heroId = (Integer)partEntry.getKey();
               LinkedList<HashSet<Integer>> hightMaterialHeroList = (LinkedList)partEntry.getValue();
               Set<Integer> partSetLast = (Set)hightMaterialHeroList.getLast();
               logger.info("从 [{}] 拆到四星狗粮组：", heroId);

               for(Integer code : partSetLast) {
                  hightMaterialSet.add(code);
               }

               logger.info("四星狗粮组 size {}", hightMaterialSet.size());
               hightMaterialHeroList.removeLast();
               if (hightMaterialHeroList.isEmpty()) {
                  originMaterialMap.remove(partEntry.getKey());
                  sortArry.removeFirst();
                  if (sortArry.isEmpty()) {
                     break;
                  }
               }
            } while(loop++ < 1000);

            sortArry.sort((o1, o2) -> {
               LinkedList<HashSet<Integer>> list1 = (LinkedList)o1.getValue();
               LinkedList<HashSet<Integer>> list2 = (LinkedList)o2.getValue();
               int heroId1 = (Integer)o1.getKey();
               int heroId2 = (Integer)o2.getKey();
               int size1 = list1.size();
               int size2 = list2.size();
               if (size1 == size2) {
                  return heroId1 < heroId2 ? -1 : 1;
               } else {
                  return size1 < size2 ? -1 : 1;
               }
            });
            List<List<HeroMsg.MaterHeroList>> gridsListList = new ArrayList();
            HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
            int maxNumber = lowMaterialSet.size() / 4;
            logger.info("三星狗粮组 size {} ,合成最大数量限制 {}", lowMaterialSet.size(), maxNumber);
            logger.info("最后一次排序结果：");

            for(Map.Entry<Integer, LinkedList<HashSet<Integer>>> entry : sortArry) {
               logger.info("heroId [{}], size {}", entry.getKey(), ((LinkedList)entry.getValue()).size());
            }

            int count = 0;

            while(count < maxNumber) {
               for(Map.Entry<Integer, LinkedList<HashSet<Integer>>> originEntry : sortArry) {
                  if (count >= maxNumber) {
                     break;
                  }

                  LinkedList<HashSet<Integer>> originHeroList = (LinkedList)originEntry.getValue();
                  if (!originHeroList.isEmpty()) {
                     Set<Integer> originSetFirst = (Set)originHeroList.getFirst();
                     List<Integer> hightCodesLit = new ArrayList();

                     for(Integer code : hightMaterialSet) {
                        hightCodesLit.add(code);
                        if (hightCodesLit.size() >= 5) {
                           break;
                        }
                     }

                     for(Integer code : hightCodesLit) {
                        hightMaterialSet.remove(code);
                     }

                     List<Integer> lowCodesLit = new ArrayList();

                     for(Integer code : lowMaterialSet) {
                        lowCodesLit.add(code);
                        if (lowCodesLit.size() >= 4) {
                           break;
                        }
                     }

                     for(Integer code : lowCodesLit) {
                        lowMaterialSet.remove(code);
                     }

                     List<Integer> originCodesLit = new ArrayList();
                     List<Integer> originCodesLit2 = new ArrayList();

                     for(Integer code : originSetFirst) {
                        if (originCodesLit.isEmpty()) {
                           originCodesLit.add(code);
                        } else {
                           originCodesLit2.add(code);
                        }
                     }

                     List<HeroMsg.MaterHeroList> gridsList = new ArrayList();
                     HeroMsg.MaterHeroList.Builder heroList = HeroMsg.MaterHeroList.newBuilder();
                     heroList.addAllCodes(originCodesLit);
                     gridsList.add(heroList.build());
                     HeroMsg.MaterHeroList.Builder heroList2 = HeroMsg.MaterHeroList.newBuilder();
                     heroList2.addAllCodes(originCodesLit2);
                     gridsList.add(heroList2.build());
                     HeroMsg.MaterHeroList.Builder heroList3 = HeroMsg.MaterHeroList.newBuilder();
                     heroList3.addAllCodes(hightCodesLit);
                     gridsList.add(heroList3.build());
                     HeroMsg.MaterHeroList.Builder heroList4 = HeroMsg.MaterHeroList.newBuilder();
                     heroList4.addAllCodes(lowCodesLit);
                     gridsList.add(heroList4.build());
                     gridsListList.add(gridsList);
                     ++count;
                     logger.info("配方{}合成[{}]", count, originEntry.getKey());
                     String str = "";
                     int gridIndex = 0;

                     for(HeroMsg.MaterHeroList materHeroList : gridsList) {
                        str = str + String.format("-->", gridIndex++);

                        for(Integer code : materHeroList.getCodesList()) {
                           HeroDao dao = heroBagPart.getHeroByCode(code);
                           str = str + String.format("[%d]", dao.id);
                        }
                     }

                     logger.info(str);
                     originHeroList.removeFirst();
                     if (originHeroList.isEmpty()) {
                        originMaterialMap.remove(originEntry.getKey());
                        if (originMaterialMap.isEmpty()) {
                           break;
                        }
                     }
                  }
               }

               if (originMaterialMap.isEmpty()) {
                  break;
               }
            }

            if (!gridsListList.isEmpty()) {
               for(List var62 : gridsListList) {
                  ;
               }

            }
         }
      }
   }

   public void OnHeroUpdateStar(List<HeroMsg.MaterHeroList> gridsList, boolean isOneKey) {
      List<Integer> allCodesLit = new ArrayList();

      for(HeroMsg.MaterHeroList materHeroList : gridsList) {
         for(Integer code : materHeroList.getCodesList()) {
            if (allCodesLit.contains(code)) {
               logger.error("玩家={}，升星传入英雄CODE有重复，重复CODE={}", this.player.getPlayerId(), code);
               return;
            }

            allCodesLit.add(code);
         }
      }

      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      int upCode = 0;

      try {
         upCode = (Integer)((HeroMsg.MaterHeroList)gridsList.get(0)).getCodesList().get(0);
      } catch (Exception var30) {
         logger.error(this.player.getPlayerId() + ":升星英雄为空");
      }

      HeroDao upHeroDao = heroBagPart.getHeroByCode(upCode);
      if (upHeroDao == null) {
         this.player.sendMsg(HeroMsg.S2C_HeroUpdateStarResult_5012.newBuilder().setResult(4100).build());
      } else if (upHeroDao.type == HeroDefine.HERO_SP_TYPE_PALACE) {
         this.player.failure(76042);
      } else if (upHeroDao.type == HeroDefine.HERO_SP_TYPE_LINK) {
         this.player.failure(76505);
      } else if (upHeroDao.getStar() < 4) {
         this.player.sendMsg(HeroMsg.S2C_HeroUpdateStarResult_5012.newBuilder().setResult(4101).build());
      } else {
         HeroModel upHeroMode1 = (HeroModel)this.player.getGameModelPool().getEntity("hero", upHeroDao.id);
         if (upHeroMode1 != null) {
            HeroUpStarModel upStarModel = this.getUpStarModel(upHeroMode1.getId(), upHeroDao.getStar() + 1);
            if (upStarModel != null) {
               PlayerPublicDao playerDao = this.player.getPublicDao();
               WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
               if (worldMgr.getWorldLv() < upStarModel.getWorldLevel() && playerDao.lv < upStarModel.getPlayerLevel()) {
                  logger.info("世界等级或者玩家等级没有达到要求，世界等级={}，玩家等级={}", worldMgr.getWorldLv(), playerDao.lv);
               } else {
                  if (upStarModel.getHeroNum() > 0 && upStarModel.getHerostar() > 0) {
                     if (upStarModel.getHerostar() != 13) {
                        logger.error("英雄升星配置错误，升星模板={}", upStarModel.getId());
                        return;
                     }

                     PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
                     if (playerExtend.star13Heros < upStarModel.getHeroNum()) {
                        return;
                     }
                  }

                  List<ResourceModel> needList = new ArrayList();
                  if (upStarModel.getItemNum() > 0) {
                     needList.add(new ResourceModel(2, 1001, upStarModel.getItemNum()));
                  }

                  if (upStarModel.getSpecialItem() > 0 && upStarModel.getSpecialItemNum() > 0) {
                     needList.add(new ResourceModel(2, upStarModel.getSpecialItem(), upStarModel.getSpecialItemNum()));
                  }

                  if (upStarModel.getSpecialItem2() > 0 && upStarModel.getSpecialItemNum2() > 0) {
                     needList.add(new ResourceModel(2, upStarModel.getSpecialItem2(), upStarModel.getSpecialItemNum2()));
                  }

                  if (!needList.isEmpty() && !this.player.checkResourceNum(needList)) {
                     logger.info("武将升星，升星石不够,特殊材料不够");
                  } else {
                     List<NeedItemsFun> needHeros = upStarModel.getNeedItems();
                     List<Integer> delHeroIdList = new ArrayList();

                     for(int i = 0; i < needHeros.size(); ++i) {
                        NeedItemsFun needHero = (NeedItemsFun)needHeros.get(i);
                        List<Integer> materCodesList = ((HeroMsg.MaterHeroList)gridsList.get(i + 1)).getCodesList();
                        if (needHero.getNum() != materCodesList.size()) {
                           this.player.sendMsg(HeroMsg.S2C_HeroUpdateStarResult_5012.newBuilder().setResult(4102).build());
                           return;
                        }

                        for(Integer code : materCodesList) {
                           HeroDao materHeroDao = heroBagPart.getHeroByCode(code);
                           if (materHeroDao == null) {
                              logger.error("玩家={}，没有英雄code={},重新下发英雄列表", this.player.getPlayerId(), code);
                              heroBagPart.sendHerosBaseData();
                              return;
                           }

                           if (materHeroDao.type == HeroDefine.HERO_SP_TYPE_PALACE) {
                              this.player.failure(76042);
                              return;
                           }

                           if (heroBagPart.linkHeroCantDo(materHeroDao)) {
                              return;
                           }

                           if (materHeroDao.isHaveArrayingState()) {
                              logger.info("英雄上阵状态：{}", code);
                              return;
                           }

                           switch (needHero.getType()) {
                              case 1:
                                 if (materHeroDao.getStar() != needHero.getStar()) {
                                    this.player.sendMsg(HeroMsg.S2C_HeroUpdateStarResult_5012.newBuilder().setResult(4103).build());
                                    return;
                                 }
                                 break;
                              case 2:
                                 if (materHeroDao.getStar() != needHero.getStar()) {
                                    this.player.sendMsg(HeroMsg.S2C_HeroUpdateStarResult_5012.newBuilder().setResult(4103).build());
                                    return;
                                 }

                                 HeroModel materHeroMode1 = (HeroModel)this.player.getGameModelPool().getEntity("hero", materHeroDao.id);
                                 if (upHeroMode1.getNation() != materHeroMode1.getNation()) {
                                    this.player.sendMsg(HeroMsg.S2C_HeroUpdateStarResult_5012.newBuilder().setResult(4104).build());
                                    return;
                                 }
                                 break;
                              case 3:
                                 if (materHeroDao.getStar() != needHero.getStar()) {
                                    this.player.sendMsg(HeroMsg.S2C_HeroUpdateStarResult_5012.newBuilder().setResult(4103).build());
                                    return;
                                 }

                                 HeroModel extraHeroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", materHeroDao.id);
                                 if (extraHeroModel.getNation() != 4 && extraHeroModel.getNation() != 5) {
                                    this.player.sendMsg(HeroMsg.S2C_HeroUpdateStarResult_5012.newBuilder().setResult(4104).build());
                                    return;
                                 }
                                 break;
                              default:
                                 if (needHero.getType() != materHeroDao.id && !this.isCanReplace(needHero.getType(), materHeroDao.id)) {
                                    this.player.sendMsg(HeroMsg.S2C_HeroUpdateStarResult_5012.newBuilder().setResult(4105).build());
                                    return;
                                 }
                           }

                           delHeroIdList.add(materHeroDao.id);
                        }
                     }

                     List<Integer> delHeroList = new ArrayList();

                     for(int i = 0; i < gridsList.size(); ++i) {
                        if (i != 0) {
                           for(Integer heroId : ((HeroMsg.MaterHeroList)gridsList.get(i)).getCodesList()) {
                              delHeroList.add(heroId);
                           }
                        }
                     }

                     String delHeroCodes = "";
                     int loop_del_code = 0;

                     for(Integer heroId : delHeroList) {
                        ++loop_del_code;
                        delHeroCodes = delHeroCodes + heroId;
                        if (loop_del_code != delHeroList.size()) {
                           delHeroCodes = delHeroCodes + "-";
                        }
                     }

                     String delHeroIds = "";
                     int loop_del_id = 0;

                     for(Integer heroId : delHeroIdList) {
                        ++loop_del_id;
                        delHeroIds = delHeroIds + heroId;
                        if (loop_del_id != delHeroIdList.size()) {
                           delHeroIds = delHeroIds + "-";
                        }
                     }

                     String misc3 = upHeroDao.code + "-" + upHeroDao.id + "-" + delHeroCodes;
                     boolean isSuccess = heroBagPart.deleteHero(delHeroList, HeroDefine.DelHeroType.DEL_USE, 4, 431, upHeroDao.getStar(), upHeroDao.getStar(), misc3);
                     if (!isSuccess) {
                        logger.info("删除英雄失败！ playerId:{} delHeroList:{}", this.player.getPlayerId(), delHeroList);
                     } else {
                        if (!needList.isEmpty()) {
                           this.player.delResource((List)needList, 4, 431, 0, 0, upHeroDao.code + "");
                        }

                        this.player.senditemUpdateMsg();
                        this.player.sendResourceMsg();
                        HeroMsg.S2C_HeroUpdateStarResult_5012.Builder result_builder = HeroMsg.S2C_HeroUpdateStarResult_5012.newBuilder();
                        result_builder.addOldPros(upHeroDao.combatPower);
                        result_builder.addOldPros((Long)upHeroDao.totalShowProperties.get(1));
                        result_builder.addOldPros((Long)upHeroDao.totalShowProperties.get(2));
                        result_builder.addOldPros((Long)upHeroDao.totalShowProperties.get(3));
                        result_builder.addOldPros((Long)upHeroDao.totalShowProperties.get(4));
                        upHeroDao.setStar(upHeroDao.getStar() + 1);
                        upHeroDao.upStarId = upStarModel.getNext();
                        upHeroDao.updateOp();
                        PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
                        if (playerExtend.heroHighestStar < upHeroDao.getStar()) {
                           playerExtend.heroHighestStar = upHeroDao.getStar();
                           this.player.updatePlayerExtend(13);
                           this.player.notifyPlayerData(PlayerDefine.HERO_HIGHEST_STAR, playerExtend.heroHighestStar);
                        }

                        if (upHeroDao.containState(31)) {
                           upHeroDao.delState(31);
                           playerExtend.clubHeroCode = 0;
                           playerExtend.clubExchangeId = 0;
                           this.player.updatePlayerExtend(13);
                        }

                        if (upHeroDao.getStar() == 13) {
                           heroBagPart.checkStar13HeroNum(playerExtend);
                        }

                        heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_HERO_UP_STAR, upHeroDao);
                        HeroPalacePart heroPalacePart = (HeroPalacePart)this.player.getMgrPart(HeroPalacePart.class);
                        HeroPalaceDao heroPalaceDao = heroPalacePart.getHeroPalaceDao();
                        if (upHeroDao.code == heroPalaceDao.shareCode) {
                           int palaceCode = heroPalacePart.getHeroPalaceHeroCode();
                           HeroDao palaceHeroDao = heroBagPart.getHeroByCode(palaceCode);
                           if (palaceHeroDao != null) {
                              palaceHeroDao.setStar(upHeroDao.getStar());
                              palaceHeroDao.updateOp();
                              heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_HERO_UP_STAR, palaceHeroDao);
                           }
                        }

                        heroBagPart.updateHeroScore(HeroDefine.HeroPropertyModel.MODEL_HERO_UP_STAR, upHeroDao);
                        result_builder.setResult(1);
                        result_builder.setCode(upHeroDao.code);
                        if (isOneKey) {
                           this.oneKeyStarResultBuilder.setResult(1);
                           this.oneKeyStarResultBuilder.addCode(upHeroDao.code);
                        } else {
                           this.player.sendMsg(result_builder.build());
                           LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "General");
                           String format = MessageFormat.format(languageModel.getValue(), playerDao.playerName, upHeroMode1.getName(), upHeroDao.getStar());
                           ChatMgr chatMgr = (ChatMgr)ApplicationContextProvider.getContext().getBean(ChatMgr.class);
                           chatMgr.pushTaskEx("sendSystem", new Object[]{4, 2, this.player.getPlayerId(), playerDao.playerName, format});
                           chatMgr.pushTaskEx("sendSystem", new Object[]{4, 5, this.player.getPlayerId(), playerDao.playerName, format});
                        }

                        String item_1001 = "";

                        for(ResourceModel resourceModel : needList) {
                           if (resourceModel.getId() == 1001) {
                              item_1001 = item_1001 + resourceModel.getValue();
                           }
                        }

                        this.player.getOperationMgr().addExtraLog(this.player, 123, upHeroMode1.getName(), upHeroDao.getStar() - 1 + "", upHeroDao.getStar() + "", item_1001 + "", delHeroIds + "");
                        if (upHeroDao.invalidTime == 0) {
                           heroBagPart.triggerHeroStarTask(upHeroDao, true);
                           this.player.triggerTask(519, upHeroDao.getStar(), 1L, 1);
                           GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
                           giftPart.triggerTimeLimitGift(4, upHeroDao.getStar());
                           giftPart.triggerTimeLimitGift(28, upHeroDao.getStar());
                           HeroPromotePart heroPromotePart = (HeroPromotePart)this.player.getMgrPart(HeroPromotePart.class);
                           heroPromotePart.checkExtraLvLimit(upHeroDao.getStar());
                           ActHeroImprovePart actHeroImprovePart = (ActHeroImprovePart)this.player.getMgrPart(ActHeroImprovePart.class);
                           actHeroImprovePart.checkHeroMaxStarChange(upHeroDao.id);
                           KrActHeroImprovePart krActHeroImprovePart = (KrActHeroImprovePart)this.player.getMgrPart(KrActHeroImprovePart.class);
                           krActHeroImprovePart.checkHeroMaxStarChange(upHeroDao.id);
                           heroBagPart.recordMaxStar(upHeroDao.id, upHeroDao.getStar(), false);
                        }

                        HeroDao linkHeroDao = (HeroDao)heroBagPart.getHeroDaoMap().values().stream().filter((heroDao) -> heroDao.type == HeroDefine.HERO_SP_TYPE_LINK && heroDao.linkCode == upHeroDao.code).findFirst().orElse((Object)null);
                        if (linkHeroDao != null) {
                           heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_HERO_UP_STAR, linkHeroDao);
                        }

                        this.checkUpStarSoulHero(upHeroDao, true);
                     }
                  }
               }
            }
         }
      }
   }

   public void checkUpStarSoulHero(HeroDao heroDao, Boolean upStar) {
      HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
      if (heroModel != null && heroModel.getNation() == 10 && heroDao.inheritNation > 0) {
         int limitStar = this.configManager.getIntDefault("SoulHeroLimitStar", 9);
         if (!upStar || heroDao.getStar() == limitStar) {
            if (upStar || heroDao.getStar() >= limitStar) {
               if (!heroDao.getStateList().isEmpty()) {
                  if (heroDao.heroStarSkills.size() >= heroModel.getFieldSkillSlotId()) {
                     HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
                     HeroMsg.S2C_HeroArrayingListResult_5030.Builder update_arraying_builder = HeroMsg.S2C_HeroArrayingListResult_5030.newBuilder();
                     update_arraying_builder.setIsUpdate(true);
                     Map<Integer, HeroArrayingDao> map = this.player.<Integer, HeroArrayingDao>getMap("tb_hero_arraying", this.player.getPlayerId());

                     for(Map.Entry<Integer, HeroArrayingDao> mainEntry : map.entrySet()) {
                        if (heroDao.containState((Integer)mainEntry.getKey())) {
                           HeroArrayingDao heroArrayingDao = (HeroArrayingDao)mainEntry.getValue();
                           CommonMsg.HeroState type = CommonMsg.HeroState.forNumber((Integer)mainEntry.getKey());
                           if (heroArrayingDao.soulHeroCode == 0) {
                              heroArrayingDao.soulHeroCode = heroDao.code;
                              heroArrayingDao.updateOp();
                              HeroMsg.ArrayingList.Builder arraying_builder = HeroMsg.ArrayingList.newBuilder();
                              arraying_builder.setArrayingType(type);
                              arraying_builder.setFriendState(heroArrayingDao.friendState);
                              arraying_builder.setIsHide(heroArrayingDao.hide);

                              for(Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
                                 HeroMsg.ArrayingInfo.Builder infoBuilder = HeroMsg.ArrayingInfo.newBuilder();
                                 infoBuilder.setPosition((Byte)entry.getKey());
                                 infoBuilder.setCode((Integer)entry.getValue());
                                 infoBuilder.setCodeType(heroArrayingPart.getCodeTypeByPosition((Byte)entry.getKey()));
                                 arraying_builder.addInfo(infoBuilder);
                              }

                              arraying_builder.setSoulHeroCode(heroArrayingDao.soulHeroCode);
                              update_arraying_builder.addArrayings(arraying_builder);
                           }
                        }
                     }

                     if (!update_arraying_builder.getArrayingsBuilderList().isEmpty()) {
                        this.player.sendMsg(update_arraying_builder.build());
                     }

                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_HeroUpgrade_5019(HeroMsg.C2S_HeroUpgrade_5019 msg, String source) {
      int code = msg.getCode();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(code);
      if (heroDao == null) {
         this.player.sendMsg(HeroMsg.S2C_HeroUpgradeResult_5020.newBuilder().setResult(4100).build());
      } else if (!HeroModel.isReplacementHero(heroDao.id)) {
         if (heroDao.type != HeroDefine.HERO_SP_TYPE_LINK) {
            UpgradeModel upgradeModel = (UpgradeModel)this.player.getGameModelPool().getEntity("upgrade", heroDao.getLv());
            if (heroDao.getLv() >= this.getLevelMax(heroDao.id, heroDao.getBreachLv(), heroDao.getStar())) {
               logger.info("已经达到当前能升级的最大等级，Id={}，breachLv={}，star={}", new Object[]{heroDao.id, heroDao.getBreachLv(), heroDao.getStar()});
            } else {
               List<ResourceModel> needList = new ArrayList();
               needList.add(new ResourceModel(1, PlayerDefine.PLAYER_HERO_EXP, upgradeModel.getExpCost()));
               needList.add(new ResourceModel(1, PlayerDefine.PLAYER_COPPER, upgradeModel.getSilverCost()));
               if (this.player.checkResourceNum(needList)) {
                  this.player.delResource((List)needList, 4, 430, 0, 0, "");
                  int oldLv = heroDao.getLv();
                  heroDao.setLv(upgradeModel.getNextLevel());
                  heroDao.updateOp();
                  heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_HERO_UP_LV, heroDao);
                  heroBagPart.updateHeroScore(HeroDefine.HeroPropertyModel.MODEL_HERO_UP_LV, heroDao);
                  this.player.updateGuideStep(msg.getGuideStep());
                  PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
                  if (playerExtend.heroHighestLv < heroDao.getLv()) {
                     playerExtend.heroHighestLv = heroDao.getLv();
                     this.player.updatePlayerExtend(13);
                     this.player.notifyPlayerData(PlayerDefine.HERO_HIGHEST_LV, playerExtend.heroHighestLv);
                  }

                  HeroMsg.S2C_HeroUpgradeResult_5020.Builder result_builder = HeroMsg.S2C_HeroUpgradeResult_5020.newBuilder();
                  result_builder.setResult(1);
                  result_builder.setHero(heroDao.toHeroInfo());
                  this.player.sendMsg(result_builder.build());
                  int item1001 = 0;
                  int copper = 0;
                  int heroExp = 0;

                  for(ResourceModel model : needList) {
                     if (model.getId() == PlayerDefine.PLAYER_COPPER) {
                        copper += model.getValue();
                     }

                     if (model.getId() == PlayerDefine.PLAYER_HERO_EXP) {
                        heroExp += model.getValue();
                     }

                     if (model.getId() == 1001) {
                        item1001 += model.getValue();
                     }
                  }

                  HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
                  this.player.getOperationMgr().addExtraLog(this.player, 122, heroModel == null ? "" : heroModel.getName(), heroDao.getStar() + "", copper + "", heroExp + "", item1001 + "", oldLv + "", heroDao.getLv() + "");
                  if (heroDao.containState(CommonMsg.HeroState.HERO_STATE_ARRAYING.getNumber()) && this.activityMgr.checkOpenServerRankTime(RankDefine.RankModule.OPEN_SERVER_HERO_LEV) > 0) {
                     RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
                     int levSum = 0;
                     HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
                     HeroArrayingDao heroArrayingDao = heroArrayingPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_ARRAYING);
                     if (heroArrayingDao != null && heroArrayingDao.elements != null) {
                        for(Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
                           if ((Byte)entry.getKey() < 5) {
                              HeroDao commonDao = heroBagPart.getHeroByCode((Integer)entry.getValue());
                              if (commonDao != null && commonDao.type != HeroDefine.HERO_SP_TYPE_LINK) {
                                 levSum += commonDao.getLv();
                              }
                           }
                        }
                     }

                     rankPart.updateRank(RankDefine.RankModule.OPEN_SERVER_HERO_LEV, (long)levSum, true);
                  }

                  if (heroDao.invalidTime == 0) {
                     for(int i = oldLv + 1; i <= heroDao.getLv(); ++i) {
                        this.player.triggerTask(204, i, 1L, 1);
                     }
                  }

                  heroBagPart.getHeroDaoMap().values().stream().filter((checkHeroDao) -> checkHeroDao.type == HeroDefine.HERO_SP_TYPE_LINK && checkHeroDao.linkCode == heroDao.code).findFirst().ifPresent((linkHeroDao) -> heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_HERO_UP_LV, linkHeroDao));
                  HeroPromotePart heroPromotePart = (HeroPromotePart)this.player.getMgrPart(HeroPromotePart.class);
                  heroPromotePart.checkUnlockHeroPromote();
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_HeroUpgradeBreach_5021(HeroMsg.C2S_HeroUpgradeBreach_5021 msg, String source) {
      int code = msg.getCode();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(code);
      if (heroDao == null) {
         this.player.sendMsg(HeroMsg.S2C_HeroUpgradeBreachResult_5022.newBuilder().setResult(4100).build());
      } else if (!HeroModel.isReplacementHero(heroDao.id)) {
         if (heroDao.type != HeroDefine.HERO_SP_TYPE_LINK) {
            HeroBreachModel heroBreachModel = (HeroBreachModel)this.player.getGameModelPool().getEntity("heroBreach", heroDao.getBreachLv());
            if (heroBreachModel.getNext() < 1) {
               logger.info("不能升阶了");
            } else if (heroDao.getLv() < heroBreachModel.getHeroLevel()) {
               logger.info("武将还没有达到升阶级别，code={},需要等级={}，目前等级={}", new Object[]{heroDao.code, heroBreachModel.getHeroLevel(), heroDao.getLv()});
            } else {
               HeroBreachModel needHeroBreachModel = (HeroBreachModel)this.player.getGameModelPool().getEntity("heroBreach", heroDao.getBreachLv() + 1);
               if (heroDao.getStar() < needHeroBreachModel.getHeroStar()) {
                  this.player.sendMsg(HeroMsg.S2C_HeroUpgradeBreachResult_5022.newBuilder().setResult(4119).build());
               } else {
                  List<ResourceModel> needList = new ArrayList();
                  needList.add(new ResourceModel(1, PlayerDefine.PLAYER_COPPER, heroBreachModel.getCopper()));
                  needList.add(new ResourceModel(2, heroBreachModel.getItemId(), heroBreachModel.getItemNum()));
                  if (!this.player.checkResourceNum(needList)) {
                     this.player.sendMsg(HeroMsg.S2C_HeroUpgradeBreachResult_5022.newBuilder().setResult(13001).build());
                     logger.info("英雄升阶物品不够");
                  } else {
                     HeroMsg.S2C_HeroUpgradeBreachResult_5022.Builder result_builder = HeroMsg.S2C_HeroUpgradeBreachResult_5022.newBuilder();
                     result_builder.addOldPros(heroDao.combatPower);
                     result_builder.addOldPros((Long)heroDao.totalShowProperties.get(1));
                     result_builder.addOldPros((Long)heroDao.totalShowProperties.get(2));
                     result_builder.addOldPros((Long)heroDao.totalShowProperties.get(3));
                     result_builder.addOldPros((Long)heroDao.totalShowProperties.get(4));
                     this.player.delResource((List)needList, 4, 440, 0, 0, "");
                     int oldBreachLv = heroDao.getBreachLv();
                     heroDao.setBreachLv(heroDao.getBreachLv() + 1);
                     heroDao.updateOp();
                     heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_HERO_UP_BREACH, heroDao);
                     heroBagPart.updateHeroScore(HeroDefine.HeroPropertyModel.MODEL_HERO_UP_BREACH, heroDao);
                     result_builder.setResult(1);
                     result_builder.setCode(heroDao.code);
                     this.player.sendMsg(result_builder.build());
                     int item1001 = 0;
                     int copper = 0;
                     int heroExp = 0;

                     for(ResourceModel model : needList) {
                        if (model.getId() == PlayerDefine.PLAYER_COPPER) {
                           copper += model.getValue();
                        }

                        if (model.getId() == PlayerDefine.PLAYER_HERO_EXP) {
                           heroExp += model.getValue();
                        }

                        if (model.getId() == 1001) {
                           item1001 += model.getValue();
                        }
                     }

                     HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
                     this.player.getOperationMgr().addExtraLog(this.player, 122, heroModel == null ? "" : heroModel.getName(), heroDao.getStar() + "", copper + "", heroExp + "", item1001 + "", oldBreachLv + "", heroDao.getBreachLv() + "");
                     this.checkUpStarSoulHero(heroDao, false);
                     heroBagPart.getHeroDaoMap().values().stream().filter((checkHeroDao) -> checkHeroDao.type == HeroDefine.HERO_SP_TYPE_LINK && checkHeroDao.linkCode == heroDao.code).findFirst().ifPresent((linkHeroDao) -> heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_HERO_UP_BREACH, linkHeroDao));
                  }
               }
            }
         }
      }
   }

   public int getLevelMax(int heroId, int breachLv, int star) {
      HeroBreachModel heroBreachModel = (HeroBreachModel)this.player.getGameModelPool().getEntity("heroBreach", breachLv);
      if (heroBreachModel == null) {
         return 30;
      } else if (heroBreachModel.getNext() > 0) {
         return heroBreachModel.getHeroLevel();
      } else {
         int levelMax = 100;
         HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroId);
         if (heroModel == null) {
            return levelMax;
         } else {
            Map<Integer, HeroUpStarModel> heroUpStarModelMap = this.player.getGameModelPool().getMap("heroUpStar");

            for(HeroUpStarModel heroUpStarModel = (HeroUpStarModel)heroUpStarModelMap.get(heroModel.getUpStarId()); heroUpStarModel != null && heroUpStarModel.getStarLevel() <= star; heroUpStarModel = (HeroUpStarModel)heroUpStarModelMap.get(heroUpStarModel.getNext())) {
               levelMax = heroUpStarModel.getLevelMax();
            }

            return levelMax;
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_HeroResetLvShow_5087(HeroMsg.C2S_HeroResetLvShow_5087 msg, String source) {
      int code = msg.getCode();
      HeroBagPart bagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = bagPart.getHeroByCode(code);
      if (heroDao == null) {
         logger.info("预览英雄为空，code={}", code);
      } else {
         List<Integer> costList = this.configManager.getIntList("HeroResetCost");
         if (costList != null && !costList.isEmpty()) {
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            int resetNum = (Integer)playerResetCustomCache.getDailyNum(401, 0);
            int consumerGold = 0;
            if (heroDao.getBreachLv() >= 6 && resetNum < costList.size()) {
               consumerGold = (Integer)costList.get(resetNum);
            }

            int heroResetRate = 10000;
            int heroRestCondition = this.configManager.getIntDefault("HeroRestCondition", 6);
            if (heroDao.getBreachLv() >= heroRestCondition) {
               heroResetRate = this.configManager.getIntDefault("HeroResetRate", 10000);
            }

            List<ResourceModel> returnList = new ArrayList();
            if (!heroDao.castSouls.isEmpty()) {
               CastSoulPart castSoulPart = (CastSoulPart)this.player.getMgrPart(CastSoulPart.class);
               ResourceModel allRecastCost = castSoulPart.getAllRecastCost(code);
               if (null != allRecastCost) {
                  if (allRecastCost.getType() == 1 && allRecastCost.getId() == PlayerDefine.PLAYER_GOLD) {
                     consumerGold += allRecastCost.getValue();
                  }

                  for(ResourceModel resourceModel : castSoulPart.getResetCastSoulResource(heroDao)) {
                     ResourceModel.addResourceToList(returnList, resourceModel);
                  }
               }
            }

            HeroMsg.S2C_HeroResetLvShow_5088.Builder builder = HeroMsg.S2C_HeroResetLvShow_5088.newBuilder();
            builder.setHeroId(heroDao.id);
            builder.setHeroStar(heroDao.getStar());
            builder.setConsumerGold(consumerGold);
            builder.setResetNum(resetNum);
            builder.setMaxNum(costList.size());
            builder.setResetRate(heroResetRate);
            WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
            if (heroDao.getLv() > 1) {
               for(ResourceModel resourceModel : worldMgr.getUpgradeConsume(heroDao.getLv())) {
                  ResourceModel.addResourceToList(returnList, resourceModel);
               }
            }

            if (heroDao.getBreachLv() > 0) {
               for(ResourceModel resourceModel : worldMgr.getBreachConsume(heroDao.getBreachLv())) {
                  ResourceModel.addResourceToList(returnList, resourceModel);
               }
            }

            for(ResourceModel upgradeItem : returnList) {
               float newVal = (float)upgradeItem.getValue() * ((float)heroResetRate / 10000.0F);
               ResourceModel resourceModel = new ResourceModel(upgradeItem.getType(), upgradeItem.getId(), Float.valueOf(newVal).intValue());
               builder.addItems(resourceModel.builder());
            }

            if (!heroDao.warriors.isEmpty()) {
               for(Map.Entry<Integer, WarriorSignet> entry : heroDao.warriors.entrySet()) {
                  if ((Integer)entry.getKey() == 5) {
                     CommonMsg.ItemInfo.Builder warriorsBuilder = CommonMsg.ItemInfo.newBuilder();
                     warriorsBuilder.setType(2);
                     warriorsBuilder.setId(((WarriorSignet)entry.getValue()).id);
                     warriorsBuilder.setNum(1);
                     builder.addItems(warriorsBuilder);
                  }
               }
            }

            this.player.sendMsg(builder.build());
         } else {
            logger.error("配置表英雄重置配置错误，不能重置");
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_HeroResetLv_5089(HeroMsg.C2S_HeroResetLv_5089 msg, String source) {
      int code = msg.getCode();
      HeroBagPart bagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = bagPart.getHeroByCode(code);
      if (heroDao == null) {
         logger.info("预览英雄为空，code={}", code);
      } else if (!HeroModel.isReplacementHero(heroDao.id)) {
         if (heroDao.type != HeroDefine.HERO_SP_TYPE_LINK) {
            List<Integer> costList = this.configManager.getIntList("HeroResetCost");
            if (costList != null && !costList.isEmpty()) {
               PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
               int resetNum = (Integer)playerResetCustomCache.getDailyNum(401, 0);
               if (resetNum >= costList.size()) {
                  logger.info("重置次数已经达到最大，最大次数={}，重置次数={}", costList.size(), resetNum);
                  this.player.failure(4127);
               } else {
                  int heroRestCondition = this.configManager.getIntDefault("HeroRestCondition", 6);
                  int needGold = 0;
                  if (heroDao.getBreachLv() >= heroRestCondition) {
                     needGold = (Integer)costList.get(resetNum);
                  }

                  List<ResourceModel> upgradeItems = new ArrayList();
                  if (!heroDao.castSouls.isEmpty()) {
                     CastSoulPart castSoulPart = (CastSoulPart)this.player.getMgrPart(CastSoulPart.class);
                     ResourceModel allRecastCost = castSoulPart.getAllRecastCost(code);
                     if (null != allRecastCost) {
                        if (allRecastCost.getType() == 1 && allRecastCost.getId() == PlayerDefine.PLAYER_GOLD) {
                           needGold += allRecastCost.getValue();
                        }

                        for(ResourceModel resourceModel : castSoulPart.getResetCastSoulResource(heroDao)) {
                           ResourceModel.addResourceToList(upgradeItems, resourceModel);
                        }
                     }
                  }

                  if (needGold > 0) {
                     ResourceModel godCost = new ResourceModel(1, PlayerDefine.PLAYER_GOLD, needGold);
                     if (!this.player.checkResourceNum(godCost)) {
                        this.player.failure(31);
                        return;
                     }

                     this.player.delResource(godCost, 4, 441, 0, 0, "");
                  }

                  playerResetCustomCache.addDailyReset(401, 1);
                  int heroResetRate = 10000;
                  if (heroDao.getBreachLv() >= heroRestCondition) {
                     heroResetRate = this.configManager.getIntDefault("HeroResetRate", 10000);
                  }

                  WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
                  HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                  if (heroDao.getLv() > 1) {
                     for(ResourceModel resourceModel : worldMgr.getUpgradeConsume(heroDao.getLv())) {
                        float newVal = (float)resourceModel.getValue() * ((float)heroResetRate / 10000.0F);
                        ResourceModel model = new ResourceModel(resourceModel.getType(), resourceModel.getId(), Float.valueOf(newVal).intValue());
                        ResourceModel.addResourceToList(upgradeItems, model);
                     }
                  }

                  if (heroDao.getBreachLv() > 0) {
                     for(ResourceModel resourceModel : worldMgr.getBreachConsume(heroDao.getBreachLv())) {
                        ResourceModel.addResourceToList(upgradeItems, resourceModel);
                     }
                  }

                  HeroMsg.S2C_HeroResetLv_5090.Builder builder = HeroMsg.S2C_HeroResetLv_5090.newBuilder();
                  if (!heroDao.warriors.isEmpty()) {
                     HeroWearPart heroWearPart = (HeroWearPart)this.player.getMgrPart(HeroWearPart.class);
                     WarriorSignet warriorSignet_1 = heroWearPart.undressWarriorSignet(heroDao, CommonMsg.WearPosition.WEARPOSITION_WARRIORSIGNET_1);
                     this.player.addResourceMsg(warriorSignet_1);
                     heroDao.warriors.remove(5);
                     if (!heroWearPart.isUnlockPosition(heroDao, CommonMsg.WearPosition.WEARPOSITION_WARRIORSIGNET_2)) {
                        WarriorSignet warriorSignet_2 = heroWearPart.undressWarriorSignet(heroDao, CommonMsg.WearPosition.WEARPOSITION_WARRIORSIGNET_2);
                        this.player.addResourceMsg(warriorSignet_2);
                        heroDao.warriors.remove(6);
                     }
                  }

                  this.player.addResource(upgradeItems, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 4, 441, 0, 0, "");
                  heroDao.setLv(1);
                  heroDao.setBreachLv(0);
                  if (!heroDao.castSouls.isEmpty()) {
                     for(Map.Entry<Integer, Integer> entry : heroDao.castSouls.entrySet()) {
                        int oldState = (Integer)entry.getValue();
                        if (oldState > 1) {
                           heroDao.castSouls.put(entry.getKey(), 1);
                        }
                     }
                  }

                  heroDao.updateOp();
                  heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_ALL, heroDao);
                  builder.setHeroId(heroDao.id);
                  builder.setHeroStar(heroDao.getStar());
                  this.player.sendMsg(builder.build());
                  HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
                  int heroExp = 0;
                  int copper = 0;
                  int item_1001 = 0;

                  for(ResourceModel upgradeItem : upgradeItems) {
                     if (upgradeItem.getId() == PlayerDefine.PLAYER_HERO_EXP) {
                        heroExp += upgradeItem.getValue();
                     } else if (upgradeItem.getId() == PlayerDefine.PLAYER_COPPER) {
                        copper += upgradeItem.getValue();
                     } else if (upgradeItem.getId() == 1001) {
                        item_1001 += upgradeItem.getValue();
                     }
                  }

                  this.player.getOperationMgr().addExtraLog(this.player, 125, heroModel != null ? heroModel.getName() : "", heroDao.getStar() + "", needGold + "", heroExp + "", copper + "", item_1001 + "");
                  if (heroModel.getNation() == 10) {
                     this.resetSoulHero(heroDao);
                  }

                  if (heroDao.beLinkCode > 0) {
                     HeroDao linkHeroDao = heroBagPart.getHeroByCode(heroDao.beLinkCode);
                     if (linkHeroDao != null) {
                        heroBagPart.handleHeroRecall(linkHeroDao, 4, 441);
                     }
                  }

               }
            } else {
               logger.error("配置表英雄重置配置错误，不能重置");
            }
         }
      }
   }

   public void resetSoulHero(HeroDao heroDao) {
      HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
      if (heroModel != null && heroModel.getNation() == 10 && heroDao.inheritNation > 0) {
         if (!heroDao.getStateList().isEmpty()) {
            HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
            HeroMsg.S2C_HeroArrayingListResult_5030.Builder update_arraying_builder = HeroMsg.S2C_HeroArrayingListResult_5030.newBuilder();
            update_arraying_builder.setIsUpdate(true);
            Map<Integer, HeroArrayingDao> map = this.player.<Integer, HeroArrayingDao>getMap("tb_hero_arraying", this.player.getPlayerId());

            for(Map.Entry<Integer, HeroArrayingDao> mainEntry : map.entrySet()) {
               if (heroDao.containState((Integer)mainEntry.getKey())) {
                  HeroArrayingDao heroArrayingDao = (HeroArrayingDao)mainEntry.getValue();
                  CommonMsg.HeroState type = CommonMsg.HeroState.forNumber((Integer)mainEntry.getKey());
                  if (heroArrayingDao.soulHeroCode == heroDao.code) {
                     heroArrayingDao.soulHeroCode = 0;
                     heroArrayingDao.updateOp();
                     heroArrayingPart.checkSoulHero(heroArrayingDao, false, 0);
                     HeroMsg.ArrayingList.Builder arraying_builder = HeroMsg.ArrayingList.newBuilder();
                     arraying_builder.setArrayingType(type);
                     arraying_builder.setFriendState(heroArrayingDao.friendState);
                     arraying_builder.setIsHide(heroArrayingDao.hide);

                     for(Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
                        HeroMsg.ArrayingInfo.Builder infoBuilder = HeroMsg.ArrayingInfo.newBuilder();
                        infoBuilder.setPosition((Byte)entry.getKey());
                        infoBuilder.setCode((Integer)entry.getValue());
                        infoBuilder.setCodeType(heroArrayingPart.getCodeTypeByPosition((Byte)entry.getKey()));
                        arraying_builder.addInfo(infoBuilder);
                     }

                     arraying_builder.setSoulHeroCode(heroArrayingDao.soulHeroCode);
                     update_arraying_builder.addArrayings(arraying_builder);
                  }
               }
            }

            if (!update_arraying_builder.getArrayingsBuilderList().isEmpty()) {
               this.player.sendMsg(update_arraying_builder.build());
            }

         }
      }
   }

   public void recallHero(int heroCode) {
      HeroBagPart bagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = bagPart.getHeroByCode(heroCode);
      if (heroDao != null) {
         int targetStar = 9;
         if (heroDao.getStar() > targetStar) {
            int maxLv = MonsterManager.maxLvByStar[targetStar];
            heroDao.setLv(Math.min(heroDao.getLv(), maxLv));
            heroDao.setStar(targetStar);
            int upStarId = this.getHeroUpStarId(heroDao.id, targetStar);
            if (upStarId > 0) {
               heroDao.upStarId = upStarId;
               heroDao.updateOp();
            }

         }
      }
   }

   public int getHeroUpStarId(int heroId, int targetStar) {
      HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroId);
      if (heroModel == null) {
         logger.warn("武将 heroId:{} 不存在", heroId);
         return 0;
      } else {
         int upStarId = heroModel.getUpStarId();
         if (targetStar > heroModel.getStar()) {
            HeroUpStarModel heroUpStarModel = null;
            int loop = 0;

            do {
               heroUpStarModel = (HeroUpStarModel)this.player.getGameModelPool().getEntity("heroUpStar", upStarId);
               if (heroUpStarModel == null) {
                  return upStarId;
               }

               upStarId = heroUpStarModel.getNext();
               ++loop;
            } while(targetStar > heroUpStarModel.getStarLevel() && loop <= 100);

            if (loop >= 100) {
               logger.error("处理升星模板出错，玩家={}，heroid={},star={}", new Object[]{this.player.getPlayerId(), heroId, targetStar});
               return 0;
            }

            upStarId = heroUpStarModel.getNext();
         }

         return upStarId;
      }
   }

   public HeroUpStarModel getUpStarModel(int heroId, int upStar) {
      HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroId);
      if (heroModel == null) {
         return null;
      } else {
         HeroUpStarModel heroUpStarModel = null;
         int star = heroModel.getStar();
         int upStarId = heroModel.getUpStarId();
         int loop = 0;

         while(upStar > star) {
            HeroUpStarModel tempModel = (HeroUpStarModel)this.player.getGameModelPool().getEntity("heroUpStar", upStarId);
            if (tempModel == null) {
               break;
            }

            heroUpStarModel = tempModel;
            upStarId = tempModel.getNext();
            star = tempModel.getStarLevel();
            ++loop;
            if (loop > 50) {
               logger.error("玩家={}，获取英雄升星模板错误，英雄={}，星级={}", new Object[]{this.player.getPlayerId(), heroId, star});
               return null;
            }
         }

         return heroUpStarModel != null && heroUpStarModel.getStarLevel() != upStar ? null : heroUpStarModel;
      }
   }

   private boolean isCanReplace(int upStartModelType, int materHeroDaoId) {
      HeroReplaceModel heroReplaceModel = (HeroReplaceModel)ApplicationContextProvider.getModelPoolEntity("heroReplace", upStartModelType);
      String country = this.worldMgr.country;
      return heroReplaceModel != null && heroReplaceModel.getReplaceIds().contains(materHeroDaoId) && (heroReplaceModel.getAreanShow().contains(country) || heroReplaceModel.getAreanShow().isEmpty());
   }
}
