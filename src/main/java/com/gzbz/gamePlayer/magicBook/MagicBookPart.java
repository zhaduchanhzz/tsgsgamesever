package com.gzbz.gamePlayer.magicBook;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import cn.hutool.core.lang.WeightRandom;
import cn.hutool.core.util.RandomUtil;
import com.google.common.base.Joiner;
import com.gzbz.alliance.AllianceMgr;
import com.gzbz.db.HeroArchiveDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.ItemBagDao;
import com.gzbz.db.MagicBookDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.playerBag.Magic;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.ItemModel;
import com.gzbz.model.MagicBookModel;
import com.gzbz.model.MagicIdentifyModel;
import com.gzbz.model.MagicSkillModel;
import com.gzbz.model.MagicSkillOriginalModel;
import com.gzbz.model.MagicSkillPosModel;
import com.gzbz.model.MagicSpeedUpModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.MagicBookMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.supremePvp.part.SupremePvpPart;
import com.gzbz.task.MagicTaskPart;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import misc.DateUtil;
import misc.MapUtil;
import misc.MiscUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class MagicBookPart extends PlayerPart {
   public static final int POSITION_NORMAL = 0;
   public static final int POSITION_PRI = 1;

   @MsgHandlerAnno
   public void C2S_MagicBookInfo_10601(MagicBookMsg.C2S_MagicBookInfo_10601 msg, String source) {
      if (this.player.isSystemOpen(1520)) {
         MagicTaskPart magicTaskPart = (MagicTaskPart)this.player.getMgrPart(MagicTaskPart.class);
         MagicBookDao magicBookDao = (MagicBookDao)this.player.getData("tb_magic_book", this.player.getPlayerId());
         if (magicBookDao.magicBookId <= 0 && magicTaskPart.getTasksMap().isEmpty()) {
            magicTaskPart.trigger();
         }

         this.sendInfo();
      }
   }

   @MsgHandlerAnno
   public void C2S_Auth_10603(MagicBookMsg.C2S_Auth_10603 msg, String source) {
      if (this.player.isSystemOpen(1520)) {
         int originalId = msg.getOriginalId();
         int position = msg.getPosition();
         if (position != 0 && position != 1) {
            this.player.failure(6);
         } else {
            MagicSkillOriginalModel magicSkillOriginalModel = (MagicSkillOriginalModel)ApplicationContextProvider.getModelPoolEntity("MysticSkillOriginal", originalId);
            if (magicSkillOriginalModel == null) {
               this.player.failure(0);
            } else if (!this.player.checkResourceNum(2, originalId, 1)) {
               this.player.failure(2);
            } else {
               MagicBookDao magicBookDao = (MagicBookDao)this.player.getData("tb_magic_book", this.player.getPlayerId());
               if (magicBookDao.authProcess.containsKey(position)) {
                  this.player.failure(47000);
               } else {
                  PlayerDao playerDao = this.player.getPlayerDao();
                  if (position == 1 && playerDao.privilege_dragon == 0) {
                     this.player.failure(47);
                  } else {
                     MagicIdentifyModel magicIdentifyModel = (MagicIdentifyModel)ApplicationContextProvider.getModelPoolEntity("MysticIdentify", magicBookDao.identityId);
                     if (magicIdentifyModel == null) {
                        this.player.failure(0);
                     } else {
                        int endTime = DateUtil.getIntTime(System.currentTimeMillis()) + magicSkillOriginalModel.getIdentifyNum() / magicIdentifyModel.getIdentitySpeed();
                        this.player.delResource(2, originalId, 1L, 47, 4701, 0, 0, "");
                        magicBookDao.authProcess.put(position, MiscUtil.comboInteger(originalId, endTime));
                        magicBookDao.updateOp();
                        MagicBookMsg.S2C_Auth_10604.Builder resp = MagicBookMsg.S2C_Auth_10604.newBuilder();
                        resp.addAllAuthList(this.buildAuthListMsg());
                        this.player.sendMsg(resp.build());
                        this.player.triggerTask(366, 0, 1L, 1);
                     }
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_AuthSpeedUp_10605(MagicBookMsg.C2S_AuthSpeedUp_10605 msg, String source) {
      if (this.player.isSystemOpen(1520)) {
         int position = msg.getPosition();
         int type = msg.getType();
         MagicSpeedUpModel magicSpeedUpModel = (MagicSpeedUpModel)ApplicationContextProvider.getModelPoolEntity("MysticSpeedUp", type);
         if (magicSpeedUpModel == null) {
            this.player.failure(0);
         } else {
            MagicBookDao magicBookDao = (MagicBookDao)this.player.getData("tb_magic_book", this.player.getPlayerId());
            MagicIdentifyModel magicIdentifyModel = (MagicIdentifyModel)ApplicationContextProvider.getModelPoolEntity("MysticIdentify", magicBookDao.identityId);
            if (magicIdentifyModel == null) {
               this.player.failure(0);
            } else {
               Long value = (Long)magicBookDao.authProcess.get(position);
               if (value == null) {
                  this.player.failure(47001);
               } else {
                  if (!this.player.checkResourceNum(2, magicSpeedUpModel.getId(), 1)) {
                     if (!this.player.checkResourceNum(magicSpeedUpModel.getSpeedupType(), magicSpeedUpModel.getSpeedupId(), magicSpeedUpModel.getSpeedupNum())) {
                        this.player.failure(31);
                        return;
                     }

                     this.player.delResource(magicSpeedUpModel.getSpeedupType(), magicSpeedUpModel.getSpeedupId(), (long)magicSpeedUpModel.getSpeedupNum(), 47, 4702, position, type, "");
                  } else {
                     this.player.delResource(2, magicSpeedUpModel.getId(), 1L, 47, 4702, position, type, "");
                  }

                  this.speedUp(position, magicSpeedUpModel.getSpeedupRate());
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_AuthLevelUp_10607(MagicBookMsg.C2S_AuthLevelUp_10607 msg, String source) {
      if (this.player.isSystemOpen(1520)) {
         MagicBookDao magicBookDao = (MagicBookDao)this.player.getData("tb_magic_book", this.player.getPlayerId());
         MagicIdentifyModel magicIdentifyModel = (MagicIdentifyModel)ApplicationContextProvider.getModelPoolEntity("MysticIdentify", magicBookDao.identityId);
         if (magicIdentifyModel == null) {
            this.player.failure(0);
         } else {
            MagicIdentifyModel magicIdentifyNextModel = (MagicIdentifyModel)ApplicationContextProvider.getModelPoolEntity("MysticIdentify", magicIdentifyModel.getNextLevel());
            if (magicIdentifyNextModel == null) {
               this.player.failure(26);
            } else {
               List<Integer> heroCodeList = msg.getHeroCodeListList();
               if (heroCodeList.size() != magicIdentifyModel.getLvUpCost()) {
                  this.player.failure(47002);
               } else {
                  List<Integer> heroIdList = new ArrayList();
                  HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);

                  for(Integer heroCode : heroCodeList) {
                     HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
                     if (heroDao == null) {
                        this.player.failure(4100);
                        return;
                     }

                     if (heroDao.getStar() != magicIdentifyModel.getLvUpStar()) {
                        this.player.failure(47002);
                        return;
                     }

                     if (heroDao.isHaveArrayingState() || heroDao.lock) {
                        this.player.failure(39);
                        return;
                     }

                     heroIdList.add(heroDao.id);
                  }

                  boolean success = heroBagPart.deleteHero(heroCodeList, HeroDefine.DelHeroType.DEL_USE, 47, 4703, magicIdentifyModel.getId(), 0, "");
                  if (!success) {
                     this.logger.info("删除武将失败 playerId:{} heroCodeList:{}", this.player.getPlayerId(), heroCodeList);
                  } else {
                     this.player.senditemUpdateMsg();
                     this.player.sendResourceMsg();
                     magicBookDao.identityId = magicIdentifyModel.getNextLevel();
                     int curTime = DateUtil.getIntTime(System.currentTimeMillis());

                     for(Map.Entry<Integer, Long> entry : magicBookDao.authProcess.entrySet()) {
                        int originalId = MiscUtil.getHiParam((Long)entry.getValue());
                        int endTime = MiscUtil.getLowParam((Long)entry.getValue());
                        if (endTime > curTime) {
                           int lessNum = (endTime - curTime) * magicIdentifyModel.getIdentitySpeed();
                           endTime = curTime + lessNum / magicIdentifyNextModel.getIdentitySpeed();
                           entry.setValue(MiscUtil.comboInteger(originalId, endTime));
                        }
                     }

                     magicBookDao.updateOp();
                     MagicBookMsg.S2C_AuthLevelUp_10608.Builder resp = MagicBookMsg.S2C_AuthLevelUp_10608.newBuilder();
                     resp.setIdentityId(magicBookDao.identityId);
                     resp.addAllHeroCodeList(msg.getHeroCodeListList());
                     resp.addAllAuthList(this.buildAuthListMsg());
                     this.player.sendMsg(resp.build());
                     this.player.getOperationMgr().addExtraLog(this.player, 194, Joiner.on("|").join(heroIdList), String.valueOf(magicIdentifyModel.getLvUpCost()), String.valueOf(magicIdentifyNextModel.getId()));
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_MagicBookLevelUp_10609(MagicBookMsg.C2S_MagicBookLevelUp_10609 msg, String source) {
      if (this.player.isSystemOpen(1520)) {
         MagicBookDao magicBookDao = (MagicBookDao)this.player.getData("tb_magic_book", this.player.getPlayerId());
         MagicBookModel magicBookModel = (MagicBookModel)ApplicationContextProvider.getModelPoolEntity("MysticBook", magicBookDao.magicBookId);
         if (magicBookModel == null) {
            this.player.failure(0);
         } else {
            MagicBookModel magicBookNextModel = (MagicBookModel)ApplicationContextProvider.getModelPoolEntity("MysticBook", magicBookModel.getNextId());
            if (magicBookNextModel == null) {
               this.player.failure(26);
            } else {
               boolean isUpStage = magicBookNextModel.getStage() != magicBookModel.getStage();
               int reason;
               int failCode;
               HeroDefine.HeroPropertyModel powerModel;
               if (!isUpStage) {
                  failCode = 47003;
                  reason = 4704;
                  powerModel = HeroDefine.HeroPropertyModel.MODULE_MAGIC_BOOK_LV_UP;
               } else {
                  failCode = 47004;
                  reason = 4705;
                  powerModel = HeroDefine.HeroPropertyModel.MODULE_MAGIC_BOOK_STAGE_UP;
               }

               if (!this.player.checkResourceNum(magicBookModel.getLvUpCost())) {
                  this.player.failure(failCode);
               } else {
                  this.player.delResource((List)magicBookModel.getLvUpCost(), 47, reason, magicBookModel.getId(), 0, "");
                  magicBookDao.magicBookId = magicBookModel.getNextId();
                  magicBookDao.updateOp();
                  this.powerChange(powerModel);
                  MagicBookMsg.S2C_MagicBookLevelUp_10610.Builder resp = MagicBookMsg.S2C_MagicBookLevelUp_10610.newBuilder();
                  resp.setMagicBookId(magicBookDao.magicBookId);
                  this.player.sendMsg(resp.build());
                  GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
                  giftPart.triggerTimeLimitGift(8, magicBookNextModel.getLevel());
                  String[] logParams = new String[magicBookModel.getLvUpCost().size() * 2 + 2];
                  logParams[0] = !isUpStage ? "升级" : "升阶";

                  for(int i = 0; i < magicBookModel.getLvUpCost().size(); ++i) {
                     ResourceModel resourceModel = (ResourceModel)magicBookModel.getLvUpCost().get(i);
                     logParams[2 * i + 1] = String.valueOf(resourceModel.getId());
                     logParams[2 * i + 2] = String.valueOf(resourceModel.getValue());
                  }

                  logParams[logParams.length - 1] = String.valueOf(magicBookNextModel.getStage());
                  this.player.getOperationMgr().addExtraLog(this.player, 196, logParams);
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_MagicAuthDone_10611(MagicBookMsg.C2S_MagicAuthDone_10611 msg, String source) {
      if (this.player.isSystemOpen(1520)) {
         int position = msg.getPosition();
         MagicBookDao magicBookDao = (MagicBookDao)this.player.getData("tb_magic_book", this.player.getPlayerId());
         Long value = (Long)magicBookDao.authProcess.get(position);
         if (value == null) {
            this.player.failure(6);
         } else {
            int curTime = DateUtil.getIntTime(System.currentTimeMillis());
            int endTime = MiscUtil.getLowParam(value);
            if (endTime - curTime > 0) {
               this.player.failure(47009);
            } else {
               MagicBookMsg.S2C_MagicAuthDone_10612.Builder resp = MagicBookMsg.S2C_MagicAuthDone_10612.newBuilder();
               ResourceModel resourceModel = this.authDone(position);
               if (resourceModel != null) {
                  this.player.addResource(resourceModel, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 47, 4706, 0, 0, "");
                  resp.addItemList(resourceModel.getId());
               }

               resp.addAllAuthList(this.buildAuthListMsg());
               this.player.sendMsg(resp.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_MagicLevelUp_10613(MagicBookMsg.C2S_MagicLevelUp_10613 msg, String source) {
      if (this.player.isSystemOpen(1520)) {
         int type = msg.getType();
         if (type != 1 && type != 2) {
            this.player.failure(0);
         } else {
            int item = msg.getItem();
            MagicBookDao magicBookDao = (MagicBookDao)this.player.getData("tb_magic_book", this.player.getPlayerId());
            int pos = 0;
            MagicSkillModel magicSkillModel;
            if (type == 1) {
               ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
               Magic magic = itemBagDao.magicBag.getItemByCode(item);
               if (magic == null) {
                  this.player.failure(2);
                  return;
               }

               magicSkillModel = (MagicSkillModel)ApplicationContextProvider.getModelPoolEntity("MysticSkill", magic.id);
            } else {
               for(Map.Entry<Integer, Integer> entry : magicBookDao.skillPosition.entrySet()) {
                  if ((Integer)entry.getValue() == item) {
                     pos = (Integer)entry.getKey();
                     break;
                  }
               }

               if (pos == 0) {
                  this.player.failure(47007);
                  return;
               }

               magicSkillModel = (MagicSkillModel)ApplicationContextProvider.getModelPoolEntity("MysticSkill", item);
            }

            if (magicSkillModel == null) {
               this.player.failure(0);
            } else {
               MagicSkillModel magicSkillNextModel = (MagicSkillModel)ApplicationContextProvider.getModelPoolEntity("MysticSkill", magicSkillModel.getNextId());
               if (magicSkillNextModel == null) {
                  this.player.failure(26);
               } else {
                  List<ResourceModel> delResourceModelList = new ArrayList();

                  for(ResourceModel resourceModel : magicSkillModel.getStarUp()) {
                     resourceModel.addResourceToList(delResourceModelList);
                  }

                  if (type == 1) {
                     ResourceModel.addResourceToList(delResourceModelList, new ResourceModel(2, magicSkillModel.getId(), 1));
                  }

                  if (!this.player.checkResourceNum(delResourceModelList)) {
                     this.player.failure(47005);
                  } else {
                     this.player.delResource((List)delResourceModelList, 47, 4707, magicSkillModel.getNextId(), 1, type + "");
                     MagicBookMsg.S2C_MagicLevelUp_10614.Builder resp = MagicBookMsg.S2C_MagicLevelUp_10614.newBuilder();
                     resp.setType(type);
                     if (type == 2) {
                        magicBookDao.skillPosition.put(pos, magicSkillModel.getNextId());
                        magicBookDao.updateOp();
                        CommonMsg.MagicInfo.Builder magic = CommonMsg.MagicInfo.newBuilder();
                        magic.setPosition(pos);
                        magic.setSkillId(magicSkillModel.getNextId());
                        resp.setMagic(magic);
                        this.player.clearAddBuilder();
                        CommonMsg.ItemInfo.Builder builder = CommonMsg.ItemInfo.newBuilder();
                        builder.setType(2);
                        builder.setId(magicSkillModel.getNextId());
                        builder.setCode(0);
                        builder.setNum(1);
                        this.player.addResourceMsgByBuilder(builder);
                        this.player.sendResourceMsg();
                        HeroArchiveDao heroArchiveDao = (HeroArchiveDao)this.player.getData("tb_dictionary_hero", this.player.getPlayerId());
                        heroArchiveDao.magics.add(magicSkillModel.getNextId());
                        heroArchiveDao.updateOp();
                        this.powerChange(HeroDefine.HeroPropertyModel.MODULE_MAGIC_SKILL_LV_UP);
                     } else {
                        this.player.addResource(2, magicSkillModel.getNextId(), 1, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 47, 4707, 0, 0, "");
                     }

                     this.player.sendMsg(resp.build());
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_MagicDisCompose_10615(MagicBookMsg.C2S_MagicDisCompose_10615 msg, String source) {
      int itemCode = msg.getItemCode();
      int num = msg.getNum();
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      Magic magic = itemBagDao.magicBag.getItemByCode(itemCode);
      if (magic == null) {
         this.player.failure(2);
      } else if (magic.getNum() < num) {
         this.player.failure(4);
      } else {
         List<ResourceModel> resourceModelList = new ArrayList();
         MagicSkillModel magicSkillModel = (MagicSkillModel)ApplicationContextProvider.getModelPoolEntity("MysticSkill", magic.id);
         if (magicSkillModel != null) {
            for(ResourceModel resourceModel : magicSkillModel.getBreakCost()) {
               ResourceModel newResource = resourceModel.clone();
               newResource.setValue(resourceModel.getValue() * num);
               newResource.addResourceToList(resourceModelList);
            }
         }

         if (resourceModelList.isEmpty()) {
            this.logger.error("玩家【{}】分解奇谋【{}】失败,该奇谋不可分解", this.player.getPlayerId(), magic.id);
         } else {
            this.player.delResource(2, magic.id, (long)num, 47, 4708, 0, 0, "");
            this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 47, 4708, magic.id, 0, "");
            MagicBookMsg.S2C_MagicDisCompose_10616.Builder resp = MagicBookMsg.S2C_MagicDisCompose_10616.newBuilder();
            this.player.sendMsg(resp.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_BatchMagicDisCompose_10627(MagicBookMsg.C2S_BatchMagicDisCompose_10627 msg, String source) {
      HashSet<Integer> disComposeItemCodeSet = new HashSet();

      for(MagicBookMsg.MagicDisComposeInfo magicDisComposeInfo : msg.getMagicDisComposeListList()) {
         int itemCode = magicDisComposeInfo.getItemCode();
         if (disComposeItemCodeSet.contains(itemCode)) {
            this.player.failure(6);
            return;
         }

         disComposeItemCodeSet.add(itemCode);
      }

      List<ResourceModel> delResourceModelList = new ArrayList();
      List<ResourceModel> addResourceModelList = new ArrayList();
      ArrayList<Integer> addMgicIdList = new ArrayList();

      for(MagicBookMsg.MagicDisComposeInfo magicDisComposeInfo : msg.getMagicDisComposeListList()) {
         int itemCode = magicDisComposeInfo.getItemCode();
         int num = magicDisComposeInfo.getNum();
         ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
         Magic magic = itemBagDao.magicBag.getItemByCode(itemCode);
         if (magic == null) {
            this.player.failure(2);
            return;
         }

         if (magic.getNum() < num) {
            this.player.failure(4);
            return;
         }

         MagicSkillModel magicSkillModel = (MagicSkillModel)ApplicationContextProvider.getModelPoolEntity("MysticSkill", magic.id);
         if (magicSkillModel != null) {
            List<ResourceModel> resourceModelList = new ArrayList();

            for(ResourceModel resourceModel : magicSkillModel.getBreakCost()) {
               ResourceModel newResource = resourceModel.clone();
               newResource.setValue(resourceModel.getValue() * num);
               newResource.addResourceToList(resourceModelList);
            }

            if (!resourceModelList.isEmpty()) {
               ResourceModel delResource = new ResourceModel(2, magic.id, num);
               delResource.addResourceToList(delResourceModelList);
               addResourceModelList.addAll(resourceModelList);
               addMgicIdList.add(magic.id);
            }
         }
      }

      this.player.delResource((List)delResourceModelList, 47, 4712, 0, 0, "");
      String magicIdStr = Joiner.on(',').join(addMgicIdList);
      this.player.addResource(addResourceModelList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 47, 4712, 0, 0, magicIdStr);
      MagicBookMsg.S2C_MagicDisCompose_10616.Builder resp = MagicBookMsg.S2C_MagicDisCompose_10616.newBuilder();
      this.player.sendMsg(resp.build());
   }

   @MsgHandlerAnno
   public void C2S_MagicSkillUp_10617(MagicBookMsg.C2S_MagicSkillUp_10617 msg, String source) {
      if (this.player.isSystemOpen(1520)) {
         MagicBookDao magicBookDao = (MagicBookDao)this.player.getData("tb_magic_book", this.player.getPlayerId());
         MagicBookModel magicBookModel = (MagicBookModel)ApplicationContextProvider.getModelPoolEntity("MysticBook", magicBookDao.magicBookId);
         if (magicBookModel == null) {
            this.player.failure(0);
         } else {
            MagicSkillPosModel magicSkillPosModel = (MagicSkillPosModel)ApplicationContextProvider.getModelPoolEntity("MysticSkillPos", magicBookModel.getStage());
            if (magicSkillPosModel == null) {
               this.player.failure(0);
            } else {
               Map<Integer, Integer> curSkillPosition = new HashMap();
               Set<Integer> skillTypeSet = new HashSet();

               for(CommonMsg.MagicInfo skillInfo : msg.getMagicsList()) {
                  MagicSkillModel magicSkillModel = (MagicSkillModel)ApplicationContextProvider.getModelPoolEntity("MysticSkill", skillInfo.getSkillId());
                  if (magicSkillModel == null) {
                     this.player.failure(6);
                     return;
                  }

                  if (skillInfo.getPosition() < 1) {
                     this.player.failure(0);
                     return;
                  }

                  if (skillInfo.getPosition() > magicSkillPosModel.getSkillNum()) {
                     this.player.failure(47006);
                     return;
                  }

                  if (curSkillPosition.containsKey(skillInfo.getPosition())) {
                     this.player.failure(6);
                     return;
                  }

                  if (skillTypeSet.contains(magicSkillModel.getSkillType())) {
                     this.player.failure(47010);
                     return;
                  }

                  skillTypeSet.add(magicSkillModel.getSkillType());
                  curSkillPosition.put(skillInfo.getPosition(), skillInfo.getSkillId());
               }

               List<ResourceModel> itemList = new ArrayList();

               for(Integer itemId : curSkillPosition.values()) {
                  if (!magicBookDao.skillPosition.containsValue(itemId) && itemId > 0) {
                     ResourceModel resourceModel = new ResourceModel(2, itemId, 1);
                     if (!this.player.checkResourceNum(resourceModel)) {
                        this.player.failure(3);
                        return;
                     }

                     itemList.add(resourceModel);
                  }
               }

               if (!itemList.isEmpty()) {
                  this.player.delResource((List)itemList, 47, 4709, 0, 0, "");
               }

               itemList.clear();

               for(int itemId : magicBookDao.skillPosition.values()) {
                  if (!curSkillPosition.containsValue(itemId) && itemId > 0) {
                     itemList.add(new ResourceModel(2, itemId, 1));
                  }
               }

               if (!itemList.isEmpty()) {
                  this.player.addResource(itemList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 47, 4709, 0, 0, "");
               }

               magicBookDao.skillPosition.clear();

               for(int i = 1; i <= magicSkillPosModel.getSkillNum(); ++i) {
                  magicBookDao.skillPosition.put(i, MapUtil.getOrDefault(curSkillPosition, i, 0));
               }

               magicBookDao.updateOp();
               this.powerChange(HeroDefine.HeroPropertyModel.MODULE_MAGIC_SKILL_ARRAYING);
               MagicBookMsg.S2C_MagicSkillUp_10618.Builder resp = MagicBookMsg.S2C_MagicSkillUp_10618.newBuilder();
               resp.addAllMagics(this.buildMagicListMsg());
               this.player.sendMsg(resp.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_MagicOriginalBuy_10619(MagicBookMsg.C2S_MagicOriginalBuy_10619 msg, String source) {
      MagicBookMsg.OriginalBuyInfo originalBuyInfo = msg.getOriginal();
      if (originalBuyInfo.getBuy() <= 0) {
         this.player.failure(4);
      } else {
         MagicSkillOriginalModel magicSkillOriginalModel = (MagicSkillOriginalModel)ApplicationContextProvider.getModelPoolEntity("MysticSkillOriginal", originalBuyInfo.getOriginalId());
         if (magicSkillOriginalModel != null && magicSkillOriginalModel.getPrice() != null && magicSkillOriginalModel.getPrice().size() == 3) {
            MagicBookDao magicBookDao = (MagicBookDao)this.player.getData("tb_magic_book", this.player.getPlayerId());
            int buyCount = (Integer)MapUtil.getOrDefault(magicBookDao.originals, originalBuyInfo.getOriginalId(), 0);
            if (buyCount + originalBuyInfo.getBuy() > magicSkillOriginalModel.getLimit()) {
               this.player.failure(25);
            } else if (!ResourceModel.checkTotalNumError((Integer)magicSkillOriginalModel.getPrice().get(2), originalBuyInfo.getBuy())) {
               ResourceModel resourceModel = new ResourceModel((Integer)magicSkillOriginalModel.getPrice().get(0), (Integer)magicSkillOriginalModel.getPrice().get(1), (Integer)magicSkillOriginalModel.getPrice().get(2) * originalBuyInfo.getBuy());
               if (!this.player.checkResourceNum(resourceModel)) {
                  this.player.failure(47008);
               } else {
                  this.player.delResource(resourceModel, 47, 4710, originalBuyInfo.getOriginalId(), originalBuyInfo.getBuy(), "");
                  magicBookDao.originals.put(originalBuyInfo.getOriginalId(), buyCount + originalBuyInfo.getBuy());
                  magicBookDao.updateOp();
                  this.player.addResource(2, originalBuyInfo.getOriginalId(), originalBuyInfo.getBuy(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 47, 4710, originalBuyInfo.getOriginalId(), originalBuyInfo.getBuy(), "");
                  MagicBookMsg.S2C_MagicOriginalBuy_10620.Builder resp = MagicBookMsg.S2C_MagicOriginalBuy_10620.newBuilder();
                  resp.addAllOriginals(this.buildOriginalBuyInfoListMsg());
                  this.player.sendMsg(resp.build());
               }
            }
         } else {
            this.player.failure(0);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_MagicBookReset_10628(MagicBookMsg.C2S_MagicBookReset_10628 msg, String source) {
      if (this.player.isSystemOpen(1520)) {
         ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
         Magic magic = itemBagDao.magicBag.getItemByCode(msg.getCode());
         if (magic == null) {
            this.player.failure(2);
         } else {
            MagicSkillModel magicSkillModel = (MagicSkillModel)ApplicationContextProvider.getModelPoolEntity("MysticSkill", magic.id);
            if (magicSkillModel != null && magicSkillModel.getCanReset()) {
               MagicSkillModel last = (MagicSkillModel)ApplicationContextProvider.getModelPoolEntity("MysticSkill", magicSkillModel.getLastId());
               if (last == null) {
                  this.player.failure(0);
               } else if (!this.player.checkResourceNum(magicSkillModel.getResetCosts())) {
                  this.player.failure(47005);
               } else {
                  this.player.delResource((List)magicSkillModel.getResetCosts(), 47, 4713, 0, 0, "");
                  ResourceModel selfBook = new ResourceModel(2, magicSkillModel.getId(), 1);
                  this.player.delResource(selfBook, 47, 4713, 0, 0, "");
                  this.player.addResource(magicSkillModel.getResetReturn(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 47, 4713, 0, 0, "");
                  this.player.sendMsg(MagicBookMsg.S2C_MagicBookReset_10629.newBuilder().build());
               }
            } else {
               this.player.failure(0);
            }
         }
      }
   }

   public void sendInfo() {
      MagicBookDao magicBookDao = (MagicBookDao)this.player.getData("tb_magic_book", this.player.getPlayerId());
      MagicBookMsg.S2C_MagicBookInfo_10602.Builder msg = MagicBookMsg.S2C_MagicBookInfo_10602.newBuilder();
      msg.setIdentityId(magicBookDao.identityId);
      msg.addAllAuthList(this.buildAuthListMsg());
      msg.setMagicBook(this.buildMagicBookMsg());
      msg.addAllOriginals(this.buildOriginalBuyInfoListMsg());
      HeroArchiveDao heroArchiveDao = (HeroArchiveDao)this.player.getData("tb_dictionary_hero", this.player.getPlayerId());
      msg.addAllMagics(heroArchiveDao.magics);
      msg.setPower(this.getPower());
      this.player.sendMsg(msg.build());
   }

   public void activeMagicBook() {
      MagicBookDao magicBookDao = (MagicBookDao)this.player.getData("tb_magic_book", this.player.getPlayerId());
      if (magicBookDao.magicBookId <= 0) {
         Map<Integer, MagicIdentifyModel> authModelMap = ApplicationContextProvider.<Integer, MagicIdentifyModel>getModelPoolMap("MysticIdentify");
         Map<Integer, MagicBookModel> magicBookModelMap = ApplicationContextProvider.<Integer, MagicBookModel>getModelPoolMap("MysticBook");
         if (authModelMap == null || magicBookModelMap == null || authModelMap.isEmpty() || magicBookModelMap.isEmpty()) {
            return;
         }

         TreeMap<Integer, MagicBookModel> magicBookModelTreeMap = new TreeMap(magicBookModelMap);
         TreeMap<Integer, MagicIdentifyModel> authModelTreeMap = new TreeMap(authModelMap);
         magicBookDao.magicBookId = (Integer)magicBookModelTreeMap.firstKey();
         magicBookDao.identityId = (Integer)authModelTreeMap.firstKey();
         magicBookDao.updateOp();
         this.sendInfo();
      }

   }

   public CommonMsg.MagicBookInfo buildMagicBookMsg() {
      CommonMsg.MagicBookInfo.Builder msg = CommonMsg.MagicBookInfo.newBuilder();
      MagicBookDao magicBookDao = (MagicBookDao)this.player.getData("tb_magic_book", this.player.getPlayerId());
      msg.addAllMagics(this.buildMagicListMsg());
      msg.setId(magicBookDao.magicBookId);
      return msg.build();
   }

   private List<CommonMsg.MagicInfo> buildMagicListMsg() {
      List<CommonMsg.MagicInfo> magicInfoList = new ArrayList();
      MagicBookDao magicBookDao = (MagicBookDao)this.player.getData("tb_magic_book", this.player.getPlayerId());

      for(Map.Entry<Integer, Integer> entry : magicBookDao.skillPosition.entrySet()) {
         if ((Integer)entry.getValue() > 0) {
            CommonMsg.MagicInfo.Builder magicInfo = CommonMsg.MagicInfo.newBuilder();
            magicInfo.setSkillId((Integer)entry.getValue());
            magicInfo.setPosition((Integer)entry.getKey());
            magicInfoList.add(magicInfo.build());
         }
      }

      return magicInfoList;
   }

   private List<MagicBookMsg.OriginalBuyInfo> buildOriginalBuyInfoListMsg() {
      List<MagicBookMsg.OriginalBuyInfo> originalBuyInfoList = new ArrayList();
      MagicBookDao magicBookDao = (MagicBookDao)this.player.getData("tb_magic_book", this.player.getPlayerId());

      for(Map.Entry<Integer, Integer> entry : magicBookDao.originals.entrySet()) {
         MagicBookMsg.OriginalBuyInfo.Builder msg = MagicBookMsg.OriginalBuyInfo.newBuilder();
         msg.setBuy((Integer)entry.getValue());
         msg.setOriginalId((Integer)entry.getKey());
         originalBuyInfoList.add(msg.build());
      }

      return originalBuyInfoList;
   }

   private List<MagicBookMsg.AuthInfo> buildAuthListMsg() {
      List<MagicBookMsg.AuthInfo> authInfoList = new ArrayList();
      MagicBookDao magicBookDao = (MagicBookDao)this.player.getData("tb_magic_book", this.player.getPlayerId());

      for(Map.Entry<Integer, Long> entry : magicBookDao.authProcess.entrySet()) {
         MagicBookMsg.AuthInfo.Builder builder = MagicBookMsg.AuthInfo.newBuilder();
         builder.setFinishTime(MiscUtil.getLowParam((Long)entry.getValue()));
         builder.setOriginalId(MiscUtil.getHiParam((Long)entry.getValue()));
         builder.setPosition((Integer)entry.getKey());
         authInfoList.add(builder.build());
      }

      return authInfoList;
   }

   private void speedUp(int position, int speedUpValue) {
      MagicBookDao magicBookDao = (MagicBookDao)this.player.getData("tb_magic_book", this.player.getPlayerId());
      MagicIdentifyModel magicIdentifyModel = (MagicIdentifyModel)ApplicationContextProvider.getModelPoolEntity("MysticIdentify", magicBookDao.identityId);
      long value = (Long)MapUtil.getOrDefault(magicBookDao.authProcess, position, 0L);
      if (value != 0L) {
         int originalId = MiscUtil.getHiParam(value);
         int endTime = MiscUtil.getLowParam(value);
         int speedTime = speedUpValue / magicIdentifyModel.getIdentitySpeed();
         endTime -= speedTime;
         value = MiscUtil.comboInteger(originalId, endTime);
         magicBookDao.authProcess.put(position, value);
         magicBookDao.updateOp();
         this.checkAuthDone();
         MagicBookMsg.S2C_AuthSpeedUp_10606.Builder resp = MagicBookMsg.S2C_AuthSpeedUp_10606.newBuilder();
         resp.addAllAuthList(this.buildAuthListMsg());
         this.player.sendMsg(resp.build());
      }
   }

   private void checkAuthDone() {
      if (this.player.isSystemOpen(1520)) {
         boolean updateFlag = false;
         int curTime = DateUtil.getIntTime(System.currentTimeMillis());
         MagicBookDao magicBookDao = (MagicBookDao)this.player.getData("tb_magic_book", this.player.getPlayerId());
         Set<Integer> positions = new HashSet(magicBookDao.authProcess.keySet());
         List<ResourceModel> resourceModelList = null;
         MagicBookMsg.S2C_MagicAuthDone_10612.Builder msg = MagicBookMsg.S2C_MagicAuthDone_10612.newBuilder();

         for(Integer position : positions) {
            long value = (Long)MapUtil.getOrDefault(magicBookDao.authProcess, position, 0L);
            if (value > 0L) {
               int endTime = MiscUtil.getLowParam(value);
               if (endTime <= curTime) {
                  ResourceModel resourceModel = this.authDone(position);
                  if (resourceModel != null) {
                     if (resourceModelList == null) {
                        resourceModelList = new ArrayList();
                     }

                     resourceModel.addResourceToList(resourceModelList);
                     msg.addItemList(resourceModel.getId());
                     updateFlag = true;
                  }
               }
            }
         }

         if (updateFlag) {
            this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 47, 4706, 0, 0, "");
            msg.addAllAuthList(this.buildAuthListMsg());
            this.player.sendMsg(msg.build());
         }

      }
   }

   private ResourceModel authDone(int position) {
      MagicBookDao magicBookDao = (MagicBookDao)this.player.getData("tb_magic_book", this.player.getPlayerId());
      long value = (Long)MapUtil.getOrDefault(magicBookDao.authProcess, position, 0L);
      if (value <= 0L) {
         return null;
      } else {
         int originalId = MiscUtil.getHiParam(value);
         MagicSkillOriginalModel skillOriginalModel = (MagicSkillOriginalModel)ApplicationContextProvider.getModelPoolEntity("MysticSkillOriginal", originalId);
         if (skillOriginalModel == null) {
            return null;
         } else {
            Map<Integer, TreeMap<Integer, List<MagicSkillModel>>> magicSkillMap = ApplicationContextProvider.<Integer, TreeMap<Integer, List<MagicSkillModel>>>getModelPoolMap("customMysticSkill");
            if (magicSkillMap != null && !magicSkillMap.isEmpty()) {
               TreeMap<Integer, TreeMap<Integer, List<MagicSkillModel>>> magicSkillTreeMap = new TreeMap(magicSkillMap);
               List<Integer> rateList = skillOriginalModel.getRateShow();
               int authCount = (Integer)MapUtil.getOrDefault(magicBookDao.authCount, originalId, 0);
               MagicSkillModel magicSkillModel;
               if (authCount >= skillOriginalModel.getRareSkillTime()) {
                  int skillId = (Integer)skillOriginalModel.getRareMystic().get(RandomUtil.randomInt(skillOriginalModel.getRareMystic().size()));
                  magicSkillModel = (MagicSkillModel)ApplicationContextProvider.getModelPoolEntity("MysticSkill", skillId);
               } else {
                  List<WeightRandom.WeightObj<Integer>> weightObjs = new ArrayList(rateList.size());

                  for(int index = 0; index < rateList.size(); ++index) {
                     WeightRandom.WeightObj<Integer> weightObj = new WeightRandom.WeightObj(index, (double)(Integer)rateList.get(index));
                     weightObjs.add(weightObj);
                  }

                  WeightRandom<Integer> weightRandom = RandomUtil.weightRandom(weightObjs);
                  int randomQualityRateIndex = (Integer)weightRandom.next();
                  int quality = (Integer)magicSkillTreeMap.lastKey() - randomQualityRateIndex;
                  if ((Integer)rateList.get(randomQualityRateIndex) == 0) {
                     this.logger.error("玩家【{}】抽到了不可抽到的品质【{}】", this.player.getPlayerId(), quality);
                     return null;
                  }

                  TreeMap<Integer, List<MagicSkillModel>> qualitySkillMap = (TreeMap)magicSkillTreeMap.get(quality);
                  if (qualitySkillMap == null || qualitySkillMap.isEmpty()) {
                     return null;
                  }

                  List<MagicSkillModel> skillModelList = new ArrayList((Collection)qualitySkillMap.firstEntry().getValue());
                  skillModelList.removeIf((tempMagicSkillModel) -> tempMagicSkillModel.getCantGot() != 0);
                  if (skillModelList.isEmpty()) {
                     return null;
                  }

                  int randomIndex = RandomUtil.randomInt(skillModelList.size());
                  magicSkillModel = (MagicSkillModel)skillModelList.get(randomIndex);
               }

               if (magicSkillModel == null) {
                  return null;
               } else {
                  if (skillOriginalModel.getRareMystic().contains(magicSkillModel.getId())) {
                     magicBookDao.authCount.remove(originalId);
                  } else if (skillOriginalModel.getRareSkillTime() > 0) {
                     magicBookDao.authCount.put(originalId, authCount + 1);
                  }

                  magicBookDao.authProcess.remove(position);
                  magicBookDao.updateOp();
                  ItemModel itemModel = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", skillOriginalModel.getId());
                  if (itemModel != null) {
                     this.player.getOperationMgr().addExtraLog(this.player, 195, itemModel.getName(), String.valueOf(magicSkillModel.getId()));
                  }

                  return new ResourceModel(2, magicSkillModel.getId(), 1);
               }
            } else {
               return null;
            }
         }
      }
   }

   public void gmSetAuthLv(int lv) {
      MagicIdentifyModel magicIdentifyModel = (MagicIdentifyModel)ApplicationContextProvider.getModelPoolEntity("MysticIdentify", lv);
      if (magicIdentifyModel == null) {
         this.player.failure(0);
      } else {
         MagicBookDao magicBookDao = (MagicBookDao)this.player.getData("tb_magic_book", this.player.getPlayerId());
         magicBookDao.identityId = lv;
         magicBookDao.updateOp();
         this.sendInfo();
      }
   }

   public void gmSetMagicBookLv(int lv) {
      MagicBookModel magicBookModel = (MagicBookModel)ApplicationContextProvider.getModelPoolEntity("MysticBook", lv);
      if (magicBookModel == null) {
         this.player.failure(0);
      } else {
         MagicBookDao magicBookDao = (MagicBookDao)this.player.getData("tb_magic_book", this.player.getPlayerId());
         magicBookDao.magicBookId = lv;
         magicBookDao.updateOp();
         this.sendInfo();
      }
   }

   public void gmAuthSpeedUp(int pos, int value) {
      this.speedUp(pos, value);
   }

   public void gmReset() {
      MagicBookDao magicBookDao = (MagicBookDao)this.player.getData("tb_magic_book", this.player.getPlayerId());
      magicBookDao.magicBookId = 0;
      magicBookDao.identityId = 0;
      magicBookDao.authProcess.clear();
      magicBookDao.skillPosition.clear();
      magicBookDao.originals.clear();
      magicBookDao.updateOp();
      MagicTaskPart magicTaskPart = (MagicTaskPart)this.player.getMgrPart(MagicTaskPart.class);

      for(TaskData taskData : magicTaskPart.getTasksMap().values()) {
         taskData.delete();
      }

      this.sendInfo();
   }

   public void resetDaily() {
      MagicBookDao magicBookDao = (MagicBookDao)this.player.getData("tb_magic_book", this.player.getPlayerId());
      if (!magicBookDao.originals.isEmpty()) {
         magicBookDao.originals.clear();
         magicBookDao.updateOp();
      }

   }

   private void powerChange(HeroDefine.HeroPropertyModel powerModel) {
      HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      heroArrayingPart.flushHeroArrayingMirror(powerModel, this.player.getPlayerCombatPower(), false);
      MagicBookMsg.S2C_PowerChange_10626.Builder msg = MagicBookMsg.S2C_PowerChange_10626.newBuilder();
      msg.setPower(this.getPower());
      this.player.sendMsg(msg.build());
      AllianceMgr allianceMgr = (AllianceMgr)ApplicationContextProvider.getContext().getBean(AllianceMgr.class);
      allianceMgr.pushTaskEx("allianceUploadArraying", new Object[]{this.player});
      SupremePvpPart supremePvpPart = (SupremePvpPart)this.player.getMgrPart(SupremePvpPart.class);
      supremePvpPart.uploadArraying();
   }

   public long getPower() {
      long power = 0L;
      if (!this.player.isSystemOpen(1520)) {
         return power;
      } else {
         MagicBookDao magicBookDao = (MagicBookDao)this.player.getData("tb_magic_book", this.player.getPlayerId());
         MagicBookModel magicBookModel = (MagicBookModel)ApplicationContextProvider.getModelPoolEntity("MysticBook", magicBookDao.magicBookId);
         if (magicBookModel == null) {
            return power;
         } else {
            power += (long)magicBookModel.getPowerUp();

            for(int skillId : magicBookDao.skillPosition.values()) {
               MagicSkillModel magicSkillModel = (MagicSkillModel)ApplicationContextProvider.getModelPoolEntity("MysticSkill", skillId);
               if (magicSkillModel != null) {
                  power += (long)magicSkillModel.getPowerUp();
               }
            }

            return power;
         }
      }
   }
}
