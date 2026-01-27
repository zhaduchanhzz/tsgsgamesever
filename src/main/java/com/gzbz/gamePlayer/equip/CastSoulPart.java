package com.gzbz.gamePlayer.equip;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.HeroDao;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.playerBag.EquipItem;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.EquipCastModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CastSoulMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
public class CastSoulPart extends PlayerPart {
   Logger logger = LoggerFactory.getLogger(CastSoulPart.class);
   @Autowired
   ConfigManager configManager;

   @MsgHandlerAnno
   public void C2S_Unlock_10801(CastSoulMsg.C2S_Unlock_10801 msg, String source) {
      int heroCode = msg.getHeroCode();
      CommonMsg.WearPosition position = msg.getPosition();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      if (heroDao == null) {
         this.logger.info("英雄不存在，code={}", heroCode);
      } else if (heroDao.castSouls.get(position.getNumber()) != null && (Integer)heroDao.castSouls.get(position.getNumber()) > 0) {
         this.logger.info("该位置已经解锁，code={}，postion={}，state={}", new Object[]{heroCode, position.getNumber(), heroDao.castSouls.get(position.getNumber())});
      } else {
         int equipCastHeroStarLimit = this.configManager.getIntDefault("configManager", 10);
         if (heroDao.getStar() < equipCastHeroStarLimit) {
            this.logger.info("英雄没有达到星级要求，code={}，star={}，需求星级={}", new Object[]{heroCode, heroDao.getStar(), equipCastHeroStarLimit});
         } else {
            Map<Integer, EquipCastModel> equipCastModelMap = (Map)this.player.getGameModelPool().getEntity("customEquipCast", position.getNumber());
            if (equipCastModelMap == null) {
               this.logger.info("装备铸魂模板错误，code={}，type={}", heroCode, position.getNumber());
            } else {
               EquipCastModel equipCastModel = (EquipCastModel)equipCastModelMap.get(0);
               if (equipCastModel == null) {
                  this.logger.info("装备铸魂模板错误，code={}，type={},lv={}", new Object[]{heroCode, position.getNumber(), 0});
               } else {
                  EquipItem equipItem = (EquipItem)heroDao.equips.get(position.getNumber());
                  if (equipItem == null) {
                     this.logger.info("该位置装备为空，code={}，position={}", position.getNumber());
                  } else {
                     ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", equipItem.id);
                     if (itemModel == null) {
                        this.logger.info("装备模板为空，code={}，id={}", heroCode, equipItem.id);
                     } else if (itemModel.getQuality() < equipCastModel.getEquipQuiltyLimit()) {
                        this.logger.info("装备品质达不到要求，code={}，要求品质={}，实际品质={}", new Object[]{heroCode, equipCastModel.getEquipQuiltyLimit(), itemModel.getQuality()});
                     } else if (equipCastModel.getUnlock().isEmpty()) {
                        this.logger.info("模板解锁消耗配置有错误，模板ID={}，unlock={}", equipCastModel.getId(), equipCastModel.getUnlock());
                     } else {
                        String[] unlockArray = equipCastModel.getUnlock().split("\\|");
                        if (unlockArray.length < 3) {
                           this.logger.info("模板解锁消耗配置有错误，模板ID={}，unlock={}", equipCastModel.getId(), equipCastModel.getUnlock());
                        } else {
                           List<Integer> surmiseHeroCodeList = msg.getSurmiseHeroCodeList();
                           if (surmiseHeroCodeList.isEmpty()) {
                              this.logger.info("消耗英雄code为空！");
                           } else {
                              HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
                              if (heroModel == null) {
                                 this.logger.info("英雄模板错误，code={}，id={}", heroCode, heroDao.id);
                              } else if (surmiseHeroCodeList.size() != Integer.valueOf(unlockArray[2])) {
                                 this.logger.info("解锁消耗英雄数量有错误，需要英雄={}，传入={}", unlockArray[2], surmiseHeroCodeList.size());
                              } else {
                                 List<Integer> needCodeList = new ArrayList();
                                 StringBuffer needHeroIds = new StringBuffer();

                                 for(Integer surmiseHeroCode : surmiseHeroCodeList) {
                                    HeroDao surmiseHeroDao = heroBagPart.getHeroByCode(surmiseHeroCode);
                                    if (surmiseHeroDao == null) {
                                       this.logger.info("被消耗的英雄不存在，surmiseHeroCode={}", surmiseHeroCode);
                                       return;
                                    }

                                    HeroModel surmiseHeroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", surmiseHeroDao.id);
                                    int realNation = heroModel.getNation();
                                    if (heroModel.getNation() == 10) {
                                       realNation = heroDao.inheritNation;
                                    }

                                    if (unlockArray[0].equals("1") && realNation != surmiseHeroModel.getNation()) {
                                       this.logger.info("英雄阵营不同，code={},英雄阵营={}，传入阵营={}", new Object[]{heroCode, heroModel.getNation(), surmiseHeroModel.getNation()});
                                       return;
                                    }

                                    if (surmiseHeroDao.getStar() != Integer.valueOf(unlockArray[1])) {
                                       this.logger.info("英雄阵营不同，code={},英雄阵营={}，传入阵营={}", new Object[]{heroCode, heroModel.getNation(), surmiseHeroModel.getNation()});
                                       return;
                                    }

                                    needCodeList.add(surmiseHeroCode);
                                    needHeroIds.append(surmiseHeroDao.id).append(",");
                                 }

                                 boolean success = heroBagPart.deleteHero(needCodeList, HeroDefine.DelHeroType.DEL_USE, 42, 4201, 0, 0, "");
                                 if (!success) {
                                    this.logger.info("删除武将失败 playerId:{} needCodeList:{}", this.player.getPlayerId(), needCodeList);
                                 } else {
                                    this.player.senditemUpdateMsg();
                                    this.player.sendResourceMsg();
                                    heroDao.castSouls.put(position.getNumber(), 1);
                                    heroDao.updateOp();
                                    heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_EQUIP_CAST_SOUL, heroDao);
                                    CastSoulMsg.S2C_OpenUiResult_10802.Builder builder = CastSoulMsg.S2C_OpenUiResult_10802.newBuilder();
                                    builder.setResult(1);
                                    builder.setHeroCode(heroCode);
                                    builder.setPosition(position);
                                    builder.setState((Integer)heroDao.castSouls.get(position.getNumber()));
                                    this.player.sendMsg(builder.build());
                                    this.player.getOperationMgr().addExtraLog(this.player, 126, heroModel != null ? heroModel.getName() : "", heroDao.getStar() + "", position + "", heroDao.castSouls.get(position) + "", needHeroIds.toString(), "", "");
                                 }
                              }
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
   public void C2S_CastSoul_10803(CastSoulMsg.C2S_CastSoul_10803 msg, String source) {
      int heroCode = msg.getHeroCode();
      CommonMsg.WearPosition position = msg.getPosition();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      if (heroDao == null) {
         this.logger.info("英雄不存在，code={}", heroCode);
      } else if (!HeroModel.isReplacementHero(heroDao.id)) {
         if (heroDao.castSouls.get(position.getNumber()) != null && (Integer)heroDao.castSouls.get(position.getNumber()) >= 1) {
            int equipCastHeroStarLimit = this.configManager.getIntDefault("configManager", 10);
            if (heroDao.getStar() < equipCastHeroStarLimit) {
               this.logger.info("英雄没有达到星级要求，code={}，star={}，需求星级={}", new Object[]{heroCode, heroDao.getStar(), equipCastHeroStarLimit});
            } else {
               Map<Integer, EquipCastModel> equipCastModelMap = (Map)this.player.getGameModelPool().getEntity("customEquipCast", position.getNumber());
               if (equipCastModelMap == null) {
                  this.logger.info("装备铸魂模板错误，code={}，type={}", heroCode, position.getNumber());
               } else {
                  int castLv = (Integer)heroDao.castSouls.get(position.getNumber());
                  EquipCastModel equipCastModel = (EquipCastModel)equipCastModelMap.get(castLv);
                  if (equipCastModel == null) {
                     this.logger.info("装备铸魂模板错误，code={}，type={},lv={}", new Object[]{heroCode, position.getNumber(), castLv});
                  } else if (equipCastModelMap.get(castLv + 1) == null) {
                     this.logger.info("下一级装备铸魂模板错误，code={}，type={},lv={}", new Object[]{heroCode, position.getNumber(), castLv});
                  } else {
                     EquipItem equipItem = (EquipItem)heroDao.equips.get(position.getNumber());
                     if (equipItem == null) {
                        this.logger.info("该位置装备为空，code={}，position={}", position.getNumber());
                     } else {
                        ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", equipItem.id);
                        if (itemModel == null) {
                           this.logger.info("装备模板为空，code={}，id={}", heroCode, equipItem.id);
                        } else if (itemModel.getQuality() < equipCastModel.getEquipQuiltyLimit()) {
                           this.logger.info("装备品质达不到要求，code={}，要求品质={}，实际品质={}", new Object[]{heroCode, equipCastModel.getEquipQuiltyLimit(), itemModel.getQuality()});
                        } else if (castLv > itemModel.getStar()) {
                           this.logger.info("铸魂超过装备星级，code={},castLv={},itemStar={}", new Object[]{heroCode, castLv, itemModel.getStar()});
                        } else if (!this.player.checkResourceNum(equipCastModel.getConsumes())) {
                           this.logger.info("铸魂材料不够，code={}", heroCode);
                        } else {
                           this.player.delResource((List)equipCastModel.getConsumes(), 42, 4202, 0, 0, "");
                           int state = (Integer)heroDao.castSouls.get(position.getNumber());
                           heroDao.castSouls.put(position.getNumber(), state + 1);
                           heroDao.updateOp();
                           heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_EQUIP_CAST_SOUL, heroDao);
                           CastSoulMsg.S2C_CastSoulResult_10804.Builder builder = CastSoulMsg.S2C_CastSoulResult_10804.newBuilder();
                           builder.setResult(1);
                           builder.setHeroCode(heroCode);
                           builder.setPosition(position);
                           builder.setState(state + 1);
                           this.player.sendMsg(builder.build());
                           HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
                           int item_1055 = 0;
                           int item_1056 = 0;

                           for(ResourceModel consume : equipCastModel.getConsumes()) {
                              if (consume.getId() == 1055) {
                                 item_1055 += consume.getValue();
                              } else if (consume.getId() == 1056) {
                                 item_1056 += consume.getValue();
                              }
                           }

                           this.player.getOperationMgr().addExtraLog(this.player, 126, heroModel != null ? heroModel.getName() : "", heroDao.getStar() + "", position + "", state + "", "", item_1055 + "", item_1056 + "");
                           GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
                           giftPart.triggerTimeLimitGift(15, state);
                           this.player.triggerTask(349, 0, 1L, 1);
                        }
                     }
                  }
               }
            }
         } else {
            this.logger.info("该位置没有解锁，code={}，postion={}，state={}", new Object[]{heroCode, position.getNumber(), heroDao.castSouls.get(position.getNumber())});
         }
      }
   }

   public ResourceModel getRecastCost(int castSoulLv) {
      if (castSoulLv <= 0) {
         return null;
      } else {
         ArrayList<Integer> cost = this.configManager.getIntList("equipCastReturnResource");
         if (null != cost && cost.size() >= 5) {
            int num = (castSoulLv / (Integer)cost.get(3) + (Integer)cost.get(4)) * (Integer)cost.get(2);
            return new ResourceModel((Integer)cost.get(0), (Integer)cost.get(1), num);
         } else {
            this.player.failure(37);
            return null;
         }
      }
   }

   public ResourceModel getAllRecastCost(int heroCode) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      if (null == heroDao) {
         this.logger.error("玩家:{},英雄背包里面未找到对应英雄code:{}", this.player.getPlayerId(), heroCode);
         return null;
      } else if (heroDao.castSouls.isEmpty()) {
         this.logger.info("英雄没有装备铸魂信息，code={}", heroCode);
         return null;
      } else {
         int type = 0;
         int id = 0;
         int num = 0;

         for(Map.Entry<Integer, Integer> entry : heroDao.castSouls.entrySet()) {
            int oldState = (Integer)entry.getValue();
            ResourceModel recastCost = this.getRecastCost(oldState - 1);
            if (oldState >= 2 && null != recastCost) {
               type = recastCost.getType();
               id = recastCost.getId();
               num += recastCost.getValue();
            }
         }

         if (type > 0 && id > 0 && num > 0) {
            return new ResourceModel(type, id, num);
         } else {
            return null;
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ResetCastSoul_10805(CastSoulMsg.C2S_ResetCastSoul_10805 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao == null) {
         this.logger.info("装备铸魂回退英雄错误，code={},position={}", heroDao.code, msg.getPosition().getNumber());
      } else if (heroDao.castSouls.isEmpty()) {
         this.logger.info("英雄没有装备铸魂信息，code={},position={}", heroDao.code, msg.getPosition().getNumber());
      } else if (!heroDao.castSouls.keySet().contains(msg.getPosition().getNumber())) {
         this.logger.info("英雄该位置没有解锁，code={},position={}", heroDao.code, msg.getPosition().getNumber());
      } else {
         int oldState = (Integer)heroDao.castSouls.get(msg.getPosition().getNumber());
         if (oldState < 2) {
            this.logger.info("英雄该位置没有升级，code={},position={},state={}", new Object[]{heroDao.code, msg.getPosition().getNumber(), oldState});
         } else {
            ResourceModel recastCost = this.getRecastCost(oldState - 1);
            if (null != recastCost) {
               if (!this.player.checkResourceNum(recastCost)) {
                  this.logger.info("铸魂重置资源不够");
               } else {
                  this.player.delResource(recastCost, 42, 4203, 0, 0, "");
                  heroDao.castSouls.put(msg.getPosition().getNumber(), 1);
                  heroDao.updateOp();
                  heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_EQUIP_CAST_SOUL, heroDao);
                  List<ResourceModel> resultList = new ArrayList();

                  for(int i = 2; i <= oldState; ++i) {
                     EquipCastModel equipCastModel = this.getEquipCastModel(msg.getPosition().getNumber(), i - 1);
                     if (equipCastModel != null && equipCastModel.getConsumes() != null) {
                        for(ResourceModel consume : equipCastModel.getConsumes()) {
                           ResourceModel.addResourceToList(resultList, consume);
                        }
                     }
                  }

                  this.player.addResource(resultList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 42, 4203, 0, 0, "");
                  CastSoulMsg.S2C_ResetCastSoulResult_10806.Builder builder = CastSoulMsg.S2C_ResetCastSoulResult_10806.newBuilder();
                  builder.setHeroCode(msg.getHeroCode());
                  builder.setResult(1);
                  builder.setHeroCode(msg.getHeroCode());
                  builder.setPosition(msg.getPosition());
                  builder.setState(1);
                  this.player.sendMsg(builder.build());
                  HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
                  int item_1055 = 0;
                  int item_1056 = 0;

                  for(ResourceModel consume : resultList) {
                     if (consume.getId() == 1055) {
                        item_1055 += consume.getValue();
                     } else if (consume.getId() == 1056) {
                        item_1056 += consume.getValue();
                     }
                  }

                  this.player.getOperationMgr().addExtraLog(this.player, 126, heroModel != null ? heroModel.getName() : "", heroDao.getStar() + "", msg.getPosition().getNumber() + "", "", "", -item_1055 + "", -item_1056 + "");
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_OneKeyResetCastSoul_10807(CastSoulMsg.C2S_OneKeyResetCastSoul_10807 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao == null) {
         this.logger.info("装备铸魂回退英雄错误，code={}", heroDao.code);
      } else if (heroDao.castSouls.isEmpty()) {
         this.logger.info("英雄没有装备铸魂信息，code={}", heroDao.code);
      } else {
         ResourceModel allRecastCost = this.getAllRecastCost(msg.getHeroCode());
         if (null == allRecastCost) {
            this.logger.error("玩家={}，没有铸魂升级={}", this.player.getPlayerId(), heroDao.castSouls.values());
         } else if (!this.player.checkResourceNum(allRecastCost)) {
            this.logger.info("铸魂重置资源不够");
         } else {
            this.player.delResource(allRecastCost, 42, 4203, 0, 0, "");
            List<ResourceModel> addList = new ArrayList();

            for(Map.Entry<Integer, Integer> entry : heroDao.castSouls.entrySet()) {
               int oldState = (Integer)entry.getValue();
               if (oldState >= 2) {
                  heroDao.castSouls.put(entry.getKey(), 1);

                  for(int i = 2; i <= oldState; ++i) {
                     EquipCastModel equipCastModel = this.getEquipCastModel((Integer)entry.getKey(), i - 1);
                     if (equipCastModel != null && equipCastModel.getConsumes() != null) {
                        for(ResourceModel consume : equipCastModel.getConsumes()) {
                           ResourceModel.addResourceToList(addList, consume);
                        }
                     }
                  }
               }
            }

            heroDao.updateOp();
            heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_EQUIP_CAST_SOUL, heroDao);
            this.player.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 42, 4203, 0, 0, "");
            CastSoulMsg.S2C_OneKeyResetCastSoulResult_10808.Builder builder = CastSoulMsg.S2C_OneKeyResetCastSoulResult_10808.newBuilder();
            builder.setResult(1);
            builder.setHeroCode(msg.getHeroCode());
            this.player.sendMsg(builder.build());
         }
      }
   }

   public List<ResourceModel> getResetCastSoulResource(HeroDao heroDao) {
      List<ResourceModel> resultList = new ArrayList();
      if (heroDao == null) {
         this.logger.info("装备铸魂回退英雄错误，code={}", heroDao.code);
         return resultList;
      } else if (heroDao.castSouls.isEmpty()) {
         this.logger.info("英雄没有装备铸魂信息，code={}", heroDao.code);
         return resultList;
      } else {
         for(Map.Entry<Integer, Integer> entry : heroDao.castSouls.entrySet()) {
            if ((Integer)entry.getValue() > 1) {
               for(int i = 2; i <= (Integer)entry.getValue(); ++i) {
                  EquipCastModel equipCastModel = this.getEquipCastModel((Integer)entry.getKey(), i - 1);
                  if (equipCastModel != null && equipCastModel.getConsumes() != null) {
                     for(ResourceModel consume : equipCastModel.getConsumes()) {
                        ResourceModel.addResourceToList(resultList, consume);
                     }
                  }
               }
            }
         }

         return resultList;
      }
   }

   public boolean resetCastSoul(HeroDao heroDao) {
      if (heroDao == null) {
         this.logger.info("装备铸魂回退英雄错误，code={}", heroDao.code);
         return false;
      } else if (heroDao.castSouls.isEmpty()) {
         this.logger.info("英雄没有装备铸魂信息，code={}", heroDao.code);
         return false;
      } else {
         for(Map.Entry<Integer, Integer> entry : heroDao.castSouls.entrySet()) {
            if ((Integer)entry.getValue() > 1) {
               heroDao.castSouls.put(entry.getKey(), 1);
            }
         }

         heroDao.updateOp();
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_EQUIP_CAST_SOUL, heroDao);
         return true;
      }
   }

   public EquipCastModel getEquipCastModel(int positon, int lv) {
      Map<Integer, EquipCastModel> equipCastModelMap = (Map)this.player.getGameModelPool().getEntity("customEquipCast", positon);
      return equipCastModelMap != null && !equipCastModelMap.isEmpty() ? (EquipCastModel)equipCastModelMap.get(lv) : null;
   }

   public void gmCastSoul(String params) {
      String[] strArrays = params.split(",");
      int code = Integer.valueOf(strArrays[0]);
      int position = 1;
      if (strArrays.length > 1) {
         position = Integer.valueOf(strArrays[1]);
      }

      CastSoulMsg.C2S_CastSoul_10803.Builder builder = CastSoulMsg.C2S_CastSoul_10803.newBuilder();
      builder.setHeroCode(code);
      builder.setPosition(CommonMsg.WearPosition.forNumber(position));
      this.C2S_CastSoul_10803(builder.build(), "");
   }
}
