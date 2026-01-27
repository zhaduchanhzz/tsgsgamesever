package com.gzbz.gamePlayer.horse;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import allMgr.TaskMethod;
import cn.hutool.core.convert.Convert;
import com.gzbz.db.HeroArrayingDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.ItemBagDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.WarHorseDao;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.CodeDefine;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.guanjia.GuanJiaPart;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.playerBag.BagParent;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gamePlayer.playerBag.ItemBase;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.HeroModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.SystemFunctionModel;
import com.gzbz.model.WarHorseBaseModel;
import com.gzbz.model.WarHorseExclusiveModel;
import com.gzbz.model.WarHorseLevelModel;
import com.gzbz.model.WarHorseSkillModel;
import com.gzbz.model.WarHorseSkillSlotsModel;
import com.gzbz.model.WarHorseStableIntegralModel;
import com.gzbz.model.WarHorseStableLibModel;
import com.gzbz.model.WarHorseStableModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.BagMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.WarHorseMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.RandomUtil;
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
public class WarHorsePart extends PlayerPart {
   static Logger logger = LoggerFactory.getLogger(WarHorsePart.class);
   @Autowired
   ConfigManager configManager;
   @Autowired
   WarHorseMgr warHorseMgr;

   public void loginHandle() {
      super.loginHandle();
      this.checkWarHorseData();
      this.checkOpenReward();
      if (this.player.isSystemOpen(3002)) {
         WarHorseDao warHorseDao = (WarHorseDao)this.player.getData("tb_war_horse", this.player.getPlayerId());
         if (!warHorseDao.hasLogArrayingHeroHorse) {
            this.logArrayingHeroHorse();
            warHorseDao.hasLogArrayingHeroHorse = true;
            warHorseDao.updateOp();
         }
      }

   }

   public void checkWarHorseData() {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      if (!playerExtend.iisCompletedWarHorsFix()) {
         playerExtend.completedWarHorsFix();
         this.player.updatePlayerExtend(13);
         logger.info("玩家={}，开始处理战马数据", this.player.getPlayerId());
         int slotsSize = 0;
         Map<Integer, WarHorseSkillSlotsModel> WarHorseSkillSlotsModelMap = this.player.getGameModelPool().getMap("warHorseSkillSlots");
         if (WarHorseSkillSlotsModelMap != null) {
            slotsSize = WarHorseSkillSlotsModelMap.size();
         }

         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         Set<Integer> changeSet = new HashSet();
         Map<Integer, HeroDao> heroDaoMap = heroBagPart.getHeroDaoMap();

         for(Map.Entry<Integer, HeroDao> entry : heroDaoMap.entrySet()) {
            boolean isResult = this.warHorseDataFix(((HeroDao)entry.getValue()).warHorse, slotsSize, (Integer)entry.getKey());
            if (isResult) {
               ((HeroDao)entry.getValue()).updateOp();
               changeSet.add(entry.getKey());
               logger.info("已处理战马，英雄code={},id={},技能={}，觉醒={}，觉醒技能位置={}", new Object[]{entry.getKey(), ((HeroDao)entry.getValue()).warHorse.id, ((HeroDao)entry.getValue()).warHorse.upSkills, ((HeroDao)entry.getValue()).warHorse.isAwaken, ((HeroDao)entry.getValue()).warHorse.awakenIndex});
            }
         }

         if (!changeSet.isEmpty()) {
            heroBagPart.flushHeroIdAndArrayingForCodeList(HeroDefine.HeroPropertyModel.MODEL_WAR_HORSE, changeSet, true, true);
         }

         ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
         BagParent bag = itemBagDao.getBagBySublass(15);
         Map<Integer, WarHorse> map = bag.getMap();
         boolean isChangeItem = false;

         for(Map.Entry<Integer, WarHorse> entry : map.entrySet()) {
            boolean isResult = this.warHorseDataFix((WarHorse)entry.getValue(), slotsSize, (Integer)entry.getKey());
            if (isResult) {
               isChangeItem = true;
               logger.info("已处理战马，物品code={}，id={},技能={}，觉醒={}，觉醒技能位置={}", new Object[]{entry.getKey(), ((WarHorse)entry.getValue()).id, ((WarHorse)entry.getValue()).upSkills, ((WarHorse)entry.getValue()).isAwaken, ((WarHorse)entry.getValue()).awakenIndex});
            }
         }

         if (isChangeItem) {
            itemBagDao.updateOp();
         }

      }
   }

   public boolean warHorseDataFix(WarHorse warHorse, int slotsSize, int code) {
      if (warHorse == null) {
         return false;
      } else {
         int skillNum = warHorse.upSkills.size();
         int moreSlots = skillNum - slotsSize;
         if (moreSlots <= 0) {
            return false;
         } else {
            logger.info("待处理战马，code={},id={},技能={}，觉醒={}，觉醒技能位置={}", new Object[]{code, warHorse.id, warHorse.upSkills, warHorse.isAwaken, warHorse.awakenIndex});
            boolean isResult = false;
            if (!warHorse.isAwaken) {
               for(int i = moreSlots; i > 0; --i) {
                  warHorse.upSkills.remove(slotsSize + i - 1);
               }

               isResult = true;
            } else {
               WarHorseBaseModel baseModel = (WarHorseBaseModel)this.player.getGameModelPool().getEntity("warHorseBase", warHorse.id);
               if (baseModel == null) {
                  return false;
               }

               int awakenSlots = baseModel.getWakeUpAddSkillNum();
               int totalSlots = slotsSize + awakenSlots;
               if (warHorse.awakenIndex.isEmpty()) {
                  int enableAwaken = skillNum - slotsSize;
                  if (skillNum > totalSlots) {
                     enableAwaken = awakenSlots;

                     for(int i = skillNum - totalSlots; i > 0; --i) {
                        warHorse.upSkills.remove(totalSlots + i - 1);
                     }
                  }

                  for(int i = 0; i < enableAwaken; ++i) {
                     warHorse.awakenIndex.add(i);
                  }

                  isResult = true;
               } else if (skillNum > totalSlots) {
                  int oldNum = warHorse.awakenIndex.size();
                  warHorse.awakenIndex.clear();

                  for(int i = 0; i < oldNum; ++i) {
                     warHorse.awakenIndex.add(i);
                  }

                  for(int i = skillNum - totalSlots; i > 0; --i) {
                     warHorse.upSkills.remove(totalSlots + i - 1);
                  }

                  isResult = true;
               }
            }

            return isResult;
         }
      }
   }

   public boolean isHaveWarHorseInBag() {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
      BagParent bag = itemBagDao.getBagBySublass(15);
      Map<Integer, WarHorse> map = bag.getMap();
      return !map.isEmpty();
   }

   public void resetDaily() {
      WarHorseDao warHorseDao = (WarHorseDao)this.player.getData("tb_war_horse", this.player.getPlayerId());
      warHorseDao.reset();
      this.sendSacrificeInfo();
      warHorseDao.hasLogArrayingHeroHorse = false;
      warHorseDao.updateOp();
   }

   public void checkOpenReward() {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      if (!playerExtend.iisCompletedWarHorse()) {
         if (this.player.isSystemOpen(3002)) {
            int warHorseDefault = this.configManager.getIntDefault("warHorseDefault", 14121);
            this.player.addResource(2, warHorseDefault, 1, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 68, 6801, 0, 0, "");
            playerExtend.completedWarHorse();
            this.player.updatePlayerExtend(13);
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_WearHorse_13803(WarHorseMsg.C2S_WearHorse_13803 msg, String source) {
      this.wearHorse(msg.getHeroCode(), msg.getItemCode());
   }

   @MsgHandlerAnno
   public void C2S_UndressHorse_13805(WarHorseMsg.C2S_UndressHorse_13805 msg, String source) {
      this.undressHorse(msg.getHeroCode());
   }

   @MsgHandlerAnno
   public void C2S_LockHorse_13807(WarHorseMsg.C2S_LockHorse_13807 msg, String source) {
      if (msg.getCodeType() == WarHorseMsg.CodeType.CODE_YPTE_HERO) {
         this.lockWarHorseOfHero(msg.getCode(), msg.getType());
      } else if (msg.getCodeType() == WarHorseMsg.CodeType.CODE_YPTE_BAG) {
         this.lockWarHorseOfBag(msg.getCode(), msg.getType());
      }

   }

   @MsgHandlerAnno
   public void C2S_LockHorseSkill_13809(WarHorseMsg.C2S_LockHorseSkill_13809 msg, String source) {
      if (msg.getCodeType() == WarHorseMsg.CodeType.CODE_YPTE_HERO) {
         this.lockWarHorseSkillOfHero(msg.getCode(), msg.getPosition(), msg.getType());
      } else if (msg.getCodeType() == WarHorseMsg.CodeType.CODE_YPTE_BAG) {
         this.lockWarHorseSkillOfBag(msg.getCode(), msg.getPosition(), msg.getType());
      }

   }

   public void wearHorse(int heroCode, int itemCode) {
      if (this.player.isSystemOpen(3002)) {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         ItemBase itemBase = itemBagPart.getItemByCode(itemCode);
         if (itemBase != null) {
            if (itemBase instanceof WarHorse) {
               WarHorse warHorse = (WarHorse)itemBase;
               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
               if (heroDao != null) {
                  if (!HeroModel.isReplacementHero(heroDao.id)) {
                     SystemFunctionModel systemFunctionModel = (SystemFunctionModel)this.player.getGameModelPool().getEntity("systemFunction", 3002);
                     if (systemFunctionModel == null || heroDao.getStar() >= systemFunctionModel.getHeroStarLevel()) {
                        this.undressHorse(heroDao);
                        heroDao.warHorse = new WarHorse(0, warHorse);
                        heroDao.updateOp();
                        itemBagPart.deleteItemByCode(itemCode, 1, 12, 1217, heroDao.code, 0, "wearHorse");
                        this.player.senditemUpdateMsg();
                        heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WAR_HORSE, heroDao);
                        WarHorseMsg.S2C_WearHorse_13804.Builder builder = WarHorseMsg.S2C_WearHorse_13804.newBuilder();
                        builder.setResult(1);
                        builder.setHeroCode(heroCode);
                        this.player.sendMsg(builder.build());
                     }
                  }
               }
            }
         }
      }
   }

   public void undressHorse(int heroCode) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      boolean isSuccess = this.undressHorse(heroDao);
      if (isSuccess) {
         heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WAR_HORSE, heroDao);
      }

      WarHorseMsg.S2C_UndressHorse_13806.Builder builder = WarHorseMsg.S2C_UndressHorse_13806.newBuilder();
      builder.setResult(isSuccess ? 1 : 0);
      builder.setHeroCode(heroCode);
      this.player.sendMsg(builder.build());
   }

   public boolean undressHorse(HeroDao heroDao) {
      if (heroDao == null) {
         return false;
      } else if (heroDao.warHorse == null) {
         return false;
      } else {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         WarHorse newWarHorse = itemBagPart.addWarHorse(heroDao.warHorse, 12, 1217, heroDao.code, 0, "undressHorse");
         this.player.additemUpdateBuilder(newWarHorse);
         this.player.senditemUpdateMsg();
         heroDao.warHorse = null;
         heroDao.updateOp();
         return true;
      }
   }

   public void lockWarHorseOfHero(int code, int type) {
      if (this.player.isSystemOpen(3002)) {
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         HeroDao heroDao = heroBagPart.getHeroByCode(code);
         if (heroDao == null) {
            logger.error("战马解锁英雄为空，code={},type={}", code, type);
         } else if (heroDao.warHorse != null) {
            if (type == 1) {
               if (heroDao.warHorse.isLock) {
                  return;
               }

               heroDao.warHorse.isLock = true;
               heroDao.updateOp();
               heroBagPart.sendHeroList2ClientByHeroDao(heroDao);
            } else {
               if (!heroDao.warHorse.isLock) {
                  return;
               }

               heroDao.warHorse.isLock = false;
               heroDao.updateOp();
               heroBagPart.sendHeroList2ClientByHeroDao(heroDao);
            }

            WarHorseMsg.S2C_LockHorse_13808.Builder builder = WarHorseMsg.S2C_LockHorse_13808.newBuilder();
            builder.setCodeType(WarHorseMsg.CodeType.CODE_YPTE_HERO);
            builder.setResult(1);
            builder.setCode(code);
            this.player.sendMsg(builder.build());
         }
      }
   }

   public void lockWarHorseOfBag(int code, int type) {
      if (this.player.isSystemOpen(3002)) {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         ItemBase itemBase = itemBagPart.getItemByCode(code);
         if (itemBase != null) {
            if (itemBase instanceof WarHorse) {
               WarHorse warHorse = (WarHorse)itemBase;
               if (type == 1) {
                  if (warHorse.isLock) {
                     return;
                  }

                  warHorse.isLock = true;
                  itemBagPart.updateOp();
                  this.player.additemUpdateBuilder(warHorse);
                  this.player.senditemUpdateMsg();
               } else {
                  if (!warHorse.isLock) {
                     return;
                  }

                  warHorse.isLock = false;
                  itemBagPart.updateOp();
                  this.player.additemUpdateBuilder(warHorse);
                  this.player.senditemUpdateMsg();
               }

               WarHorseMsg.S2C_LockHorse_13808.Builder builder = WarHorseMsg.S2C_LockHorse_13808.newBuilder();
               builder.setCodeType(WarHorseMsg.CodeType.CODE_YPTE_BAG);
               builder.setResult(1);
               builder.setCode(code);
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   public void lockWarHorseSkillOfHero(int code, int position, int type) {
      if (this.player.isSystemOpen(3002)) {
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         HeroDao heroDao = heroBagPart.getHeroByCode(code);
         if (heroDao != null) {
            if (heroDao.warHorse != null) {
               if (type == 1) {
                  if (heroDao.warHorse.lockSkilIndex.contains(position)) {
                     return;
                  }

                  if (position > heroDao.warHorse.upSkills.size() || position < 1) {
                     return;
                  }

                  heroDao.warHorse.lockSkilIndex.add(position);
                  heroDao.updateOp();
                  heroBagPart.sendHeroList2ClientByHeroDao(heroDao);
               } else {
                  if (!heroDao.warHorse.lockSkilIndex.contains(position)) {
                     return;
                  }

                  heroDao.warHorse.lockSkilIndex.remove(position);
                  heroDao.updateOp();
                  heroBagPart.sendHeroList2ClientByHeroDao(heroDao);
               }

               WarHorseMsg.S2C_LockHorseSkill_13810.Builder builder = WarHorseMsg.S2C_LockHorseSkill_13810.newBuilder();
               builder.setCodeType(WarHorseMsg.CodeType.CODE_YPTE_HERO);
               builder.setResult(1);
               builder.setCode(code);
               builder.setPosition(position);
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   public void lockWarHorseSkillOfBag(int code, int position, int type) {
      if (this.player.isSystemOpen(3002)) {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         ItemBase itemBase = itemBagPart.getItemByCode(code);
         if (itemBase != null) {
            if (itemBase instanceof WarHorse) {
               WarHorse warHorse = (WarHorse)itemBase;
               if (type == 1) {
                  if (warHorse.lockSkilIndex.contains(position)) {
                     return;
                  }

                  if (position > warHorse.upSkills.size() || position < 1) {
                     return;
                  }

                  warHorse.lockSkilIndex.add(position);
                  itemBagPart.updateOp();
                  this.player.additemUpdateBuilder(warHorse);
                  this.player.senditemUpdateMsg();
               } else {
                  if (!warHorse.lockSkilIndex.contains(position)) {
                     return;
                  }

                  warHorse.lockSkilIndex.remove(position);
                  itemBagPart.updateOp();
                  this.player.additemUpdateBuilder(warHorse);
                  this.player.senditemUpdateMsg();
               }

               WarHorseMsg.S2C_LockHorseSkill_13810.Builder builder = WarHorseMsg.S2C_LockHorseSkill_13810.newBuilder();
               builder.setCodeType(WarHorseMsg.CodeType.CODE_YPTE_BAG);
               builder.setResult(1);
               builder.setCode(code);
               builder.setPosition(position);
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_LvUp_13811(WarHorseMsg.C2S_LvUp_13811 msg, String source) {
      if (msg.getCodeType() == WarHorseMsg.CodeType.CODE_YPTE_HERO) {
         this.WarHorseLvUpOfHero(msg.getCode(), msg.getLv(), msg.getItemsList());
      }

   }

   @MsgHandlerAnno
   public void C2S_Merge_13813(WarHorseMsg.C2S_Merge_13813 msg, String source) {
      if (msg.getCodeType() == WarHorseMsg.CodeType.CODE_YPTE_HERO) {
         this.WarHorseMergeOfHero(msg.getMainCode(), msg.getSlaveCode());
      }

   }

   @MsgHandlerAnno
   public void C2S_Artifice_13815(WarHorseMsg.C2S_Artifice_13815 msg, String source) {
      if (msg.getCodeType() == WarHorseMsg.CodeType.CODE_YPTE_HERO) {
         this.WarHorseArtificeOfHero(msg.getMainCode(), msg.getSlaveCodesList(), msg.getItemNum());
      }

   }

   @MsgHandlerAnno
   public void C2S_Inherit_13817(WarHorseMsg.C2S_Inherit_13817 msg, String source) {
      if (msg.getCodeType() == WarHorseMsg.CodeType.CODE_YPTE_HERO) {
         this.WarHorseInheritOfHero(msg.getMainCode(), msg.getSlaveCode(), msg.getType());
      }

   }

   @MsgHandlerAnno
   public void C2S_HorseReback_13887(WarHorseMsg.C2S_HorseReback_13887 msg, String source) {
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      ItemBase itemBase = itemBagPart.getItemByCode(msg.getHorseCode());
      if (itemBase != null) {
         if (itemBase instanceof WarHorse) {
            WarHorse warHorse = (WarHorse)itemBase;
            if (!warHorse.isLock) {
               WarHorseExclusiveModel model = (WarHorseExclusiveModel)this.player.getGameModelPool().getEntity("warHorseExclusive", warHorse.id);
               if (model != null) {
                  List<ResourceModel> returnList = this.getDelHorseReturResource(warHorse);
                  if (warHorse.isAwaken) {
                     WarHorseBaseModel warHorseBaseModel = (WarHorseBaseModel)this.player.getGameModelPool().getEntity("warHorseBase", warHorse.id);

                     for(ResourceModel resourceModel : warHorseBaseModel.getWakeUpNeedItem()) {
                        resourceModel.addResourceToList(returnList);
                     }
                  }

                  List<WarHorse> warHorseList = new ArrayList();
                  warHorseList.add(warHorse);
                  this.delHorse(warHorseList, false, 68, 6810);
                  this.player.senditemUpdateMsg();
                  returnList.add(new ResourceModel((Integer)model.getRebackItem().get(0), (Integer)model.getRebackItem().get(1), (Integer)model.getRebackItem().get(2)));
                  this.player.addResource(returnList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 68, 6810, 0, 0, "WarHorseInheritOfHero");
                  WarHorseMsg.S2C_HorseReback_13888.Builder builder = WarHorseMsg.S2C_HorseReback_13888.newBuilder();
                  builder.setResult(true);
                  this.player.sendMsg(builder.build());
               }
            }
         }
      }
   }

   public void WarHorseLvUpOfHero(int code, int lv, List<WarHorseMsg.LvUpItem> materialList) {
      if (this.player.isSystemOpen(3002)) {
         int warHorseExpItem = this.configManager.getIntDefault("warHorseExpItem", 1115);
         int clientNum = 0;

         for(WarHorseMsg.LvUpItem lvUpItem : materialList) {
            if (lvUpItem.getNum() <= 0) {
               this.player.failure(6);
               return;
            }

            if (lvUpItem.getItemId() != warHorseExpItem) {
               return;
            }

            clientNum += lvUpItem.getNum();
         }

         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         HeroDao heroDao = heroBagPart.getHeroByCode(code);
         if (heroDao != null) {
            if (heroDao.warHorse != null) {
               if (heroDao.warHorse.lv == lv) {
                  WarHorseLevelModel curWarHorseLevelModel = (WarHorseLevelModel)this.player.getGameModelPool().getEntity("warHorseLevel", lv);
                  if (curWarHorseLevelModel != null) {
                     WarHorseLevelModel nextHorseLevelModel = (WarHorseLevelModel)this.player.getGameModelPool().getEntity("warHorseLevel", lv + 1);
                     if (nextHorseLevelModel == null) {
                        this.player.failure(61105);
                     } else {
                        int needExp = curWarHorseLevelModel.getExp() - heroDao.warHorse.exp;
                        if (clientNum > needExp) {
                           logger.error("玩家={}，升级不需要这么多经验，需要={}，传入={}", new Object[]{this.player.getPlayerId(), needExp, clientNum});
                        } else {
                           ResourceModel horseFoods = new ResourceModel(2, warHorseExpItem, clientNum);
                           if (!this.player.checkResourceNum(horseFoods)) {
                              logger.error("玩家={}，战马升级粮草不足，需要={}，实际={}", new Object[]{this.player.getPlayerId(), curWarHorseLevelModel.getExp(), horseFoods});
                           } else {
                              List<ResourceModel> extraMaterial = curWarHorseLevelModel.getMaterial();
                              if (!extraMaterial.isEmpty()) {
                                 if (clientNum < needExp) {
                                    logger.error("玩家={}，升级不需要这么多经验，需要={}，传入={}", new Object[]{this.player.getPlayerId(), needExp, clientNum});
                                    this.player.failure(76501);
                                    return;
                                 }

                                 if (!this.player.checkResourceNum(extraMaterial)) {
                                    logger.error("玩家={}，战马升级突破石不足", this.player.getPlayerId());
                                    this.player.failure(76500);
                                    return;
                                 }
                              }

                              this.player.delResource(horseFoods, 68, 6803, 0, 0, "");
                              if (!extraMaterial.isEmpty()) {
                                 this.player.delResource((List)extraMaterial, 68, 6803, 0, 0, "");
                              }

                              WarHorse var10000 = heroDao.warHorse;
                              var10000.exp += clientNum;
                              int lvUpOnce = this.configManager.getIntDefault("warHorseLvUpOnce", 5);

                              for(int tempLv = 0; tempLv <= lvUpOnce && this.lvUp(heroDao.warHorse); ++tempLv) {
                              }

                              heroDao.updateOp();
                              heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WAR_HORSE, heroDao);
                              WarHorseMsg.S2C_LvUp_13812.Builder builder = WarHorseMsg.S2C_LvUp_13812.newBuilder();
                              builder.setCodeType(WarHorseMsg.CodeType.CODE_YPTE_HERO);
                              builder.setResult(1);
                              builder.setCode(code);
                              this.player.sendMsg(builder.build());
                              String[] logStr = LogOperationMgr.toRewardsInfo(horseFoods);
                              this.player.getOperationMgr().addExtraLog(this.player, 202, logStr[0], logStr[1], heroDao.warHorse.id + "", heroDao.warHorse.lv + "");
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void WarHorseMergeOfHero(int mainCode, int slaveCode) {
      if (this.player.isSystemOpen(3002)) {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         ItemBase slaveItemBase = itemBagPart.getItemByCode(slaveCode);
         if (slaveItemBase != null) {
            if (slaveItemBase instanceof WarHorse) {
               WarHorse slaveWarHorse = (WarHorse)slaveItemBase;
               if (!slaveWarHorse.isLock) {
                  if (!slaveWarHorse.upSkills.isEmpty()) {
                     if (!slaveWarHorse.isAwaken) {
                        WarHorseExclusiveModel warHorseExclusiveModel = (WarHorseExclusiveModel)this.player.getGameModelPool().getEntity("warHorseExclusive", slaveWarHorse.id);
                        if (warHorseExclusiveModel == null) {
                           HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                           HeroDao heroDao = heroBagPart.getHeroByCode(mainCode);
                           if (heroDao != null) {
                              if (heroDao.warHorse != null) {
                                 WarHorseBaseModel mainBaseModel = (WarHorseBaseModel)this.player.getGameModelPool().getEntity("warHorseBase", heroDao.warHorse.id);
                                 if (mainBaseModel != null) {
                                    if (mainBaseModel.getType() == 0) {
                                       int mainHaveSlots = this.getWarHorseOpenSlots(heroDao.warHorse, true);
                                       if (heroDao.warHorse.lockSkilIndex.size() > mainHaveSlots) {
                                          this.player.failure(76011);
                                       } else if (mainHaveSlots <= heroDao.warHorse.upSkills.size() && heroDao.warHorse.lockSkilIndex.size() >= heroDao.warHorse.upSkills.size()) {
                                          logger.error("至少有一个技能不能锁定，锁定技能={}，技能ID={}", heroDao.warHorse.lockSkilIndex, heroDao.warHorse.upSkills.size());
                                          this.player.failure(76011);
                                       } else if (slaveWarHorse.upSkills.isEmpty()) {
                                          logger.info("从战马技能为空");
                                       } else {
                                          List<Integer> oldSkills = new ArrayList();
                                          oldSkills.addAll(heroDao.warHorse.upSkills);
                                          boolean isLock = false;
                                          List<Integer> lockIndexList = new ArrayList();
                                          List<ResourceModel> needList = new ArrayList();
                                          if (heroDao.warHorse.lockSkilIndex.size() > 0) {
                                             List<ResourceModel> FusionLockCost = this.configManager.getResourceModelList("FusionLockCost", "1|9|200,2|1006|2,2|1006|4,2|1006|6");
                                             needList.add(FusionLockCost.get(heroDao.warHorse.lockSkilIndex.size() - 1));

                                             for(int i = 0; i < heroDao.warHorse.lockSkilIndex.size(); ++i) {
                                                lockIndexList.add((Integer)heroDao.warHorse.lockSkilIndex.get(i) - 1);
                                                isLock = true;
                                             }

                                             if (!this.player.checkResourceNum(needList)) {
                                                logger.error("锁定消耗不足！");
                                                return;
                                             }
                                          }

                                          int slaveIndex = RandomUtil.randInt(slaveWarHorse.upSkills.size());
                                          int slaveSkillId = (Integer)slaveWarHorse.upSkills.get(slaveIndex);
                                          WarHorseSkillModel slaveHorseSkill = (WarHorseSkillModel)this.player.getGameModelPool().getEntity("warHorseSkill", slaveSkillId);
                                          int mainIndex = -1;
                                          int mainSkillId = -1;
                                          int skillSize = heroDao.warHorse.upSkills.size();
                                          boolean isCover = false;
                                          if (skillSize > 0) {
                                             for(int i = 0; i < skillSize; ++i) {
                                                WarHorseSkillModel model = (WarHorseSkillModel)this.player.getGameModelPool().getEntity("warHorseSkill", heroDao.warHorse.upSkills.get(i));
                                                if (model.getType() == slaveHorseSkill.getType() && model.getQuality() == slaveHorseSkill.getQuality()) {
                                                   isCover = true;
                                                   mainIndex = i;
                                                   mainSkillId = (Integer)heroDao.warHorse.upSkills.get(i);
                                                   if (slaveHorseSkill.getLv() > model.getLv()) {
                                                      heroDao.warHorse.upSkills.set(i, slaveSkillId);
                                                      heroDao.warHorse.updateMainSkillUnlock();
                                                      heroDao.warHorse.isLock = true;
                                                      heroDao.updateOp();
                                                      heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WAR_HORSE, heroDao);
                                                   }
                                                   break;
                                                }
                                             }
                                          }

                                          if (!isCover) {
                                             if (mainHaveSlots > heroDao.warHorse.upSkills.size()) {
                                                if (heroDao.warHorse.isAwaken) {
                                                   int baseHaveSlots = this.getWarHorseOpenSlots(heroDao.warHorse, false);
                                                   if (baseHaveSlots + heroDao.warHorse.awakenIndex.size() <= heroDao.warHorse.upSkills.size()) {
                                                      heroDao.warHorse.awakenIndex.add(heroDao.warHorse.upSkills.size());
                                                   }
                                                }

                                                heroDao.warHorse.upSkills.add(slaveSkillId);
                                                mainIndex = heroDao.warHorse.upSkills.size() - 1;
                                                heroDao.warHorse.isLock = true;
                                                heroDao.warHorse.updateMainSkillUnlock();
                                                heroDao.updateOp();
                                                heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WAR_HORSE, heroDao);
                                             } else {
                                                List<Integer> enableList = new ArrayList();

                                                for(int i = 0; i < heroDao.warHorse.upSkills.size(); ++i) {
                                                   if (!lockIndexList.contains(i)) {
                                                      enableList.add(i);
                                                   }
                                                }

                                                if (!enableList.isEmpty()) {
                                                   mainIndex = (Integer)enableList.get((int)(Math.random() * (double)enableList.size()));
                                                   mainSkillId = (Integer)heroDao.warHorse.upSkills.get(mainIndex);
                                                }

                                                if (mainSkillId >= 0) {
                                                   WarHorseSkillModel mainSkillModel = (WarHorseSkillModel)this.player.getGameModelPool().getEntity("warHorseSkill", mainSkillId);
                                                   WarHorseSkillModel slaveSkillModel = (WarHorseSkillModel)this.player.getGameModelPool().getEntity("warHorseSkill", slaveSkillId);
                                                   if (mainSkillModel.getType() == slaveSkillModel.getType() && mainSkillModel.getQuality() == slaveSkillModel.getQuality() && mainSkillModel.getLv() >= slaveSkillModel.getLv()) {
                                                      logger.info("玩家={}，技能类型={}，品质={}，主级={}，从={}", new Object[]{this.player.getPlayerId(), mainSkillModel.getType(), mainSkillModel.getQuality(), mainSkillModel.getLv(), slaveSkillModel.getLv()});
                                                   } else {
                                                      heroDao.warHorse.upSkills.set(mainIndex, slaveSkillId);
                                                      heroDao.warHorse.isLock = true;
                                                      heroDao.warHorse.updateMainSkillUnlock();
                                                      heroDao.updateOp();
                                                      heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WAR_HORSE, heroDao);
                                                   }
                                                }
                                             }
                                          }

                                          if (isLock) {
                                             this.player.delResource((List)needList, 68, 6804, 0, 0, "");
                                          }

                                          List<WarHorse> delList = new ArrayList();
                                          delList.add(slaveWarHorse);
                                          this.delHorse(delList, true, 68, 6804);
                                          this.updateWarHorse(heroDao);
                                          WarHorseMsg.S2C_Merge_13814.Builder builder = WarHorseMsg.S2C_Merge_13814.newBuilder();
                                          builder.setCodeType(WarHorseMsg.CodeType.CODE_YPTE_HERO);
                                          builder.setResult(1);
                                          builder.setMainCode(mainCode);
                                          builder.setSlaveCode(slaveCode);
                                          builder.setSlaveSkillIndex(slaveIndex);
                                          builder.setSlaveSkillId(slaveSkillId);
                                          builder.setMainSkillIndex(mainIndex);
                                          builder.setMainSkillId(mainSkillId);
                                          this.player.sendMsg(builder.build());
                                          String oldSkillStr = "";
                                          String newSkillStr = "";
                                          String slaveSkillStr = "";

                                          for(Integer oldSkill : oldSkills) {
                                             oldSkillStr = oldSkillStr + oldSkill + ",";
                                          }

                                          for(Integer upSkill : heroDao.warHorse.upSkills) {
                                             newSkillStr = newSkillStr + upSkill + ",";
                                          }

                                          for(Integer upSkill : slaveWarHorse.upSkills) {
                                             slaveSkillStr = slaveSkillStr + upSkill + ",";
                                          }

                                          this.player.getOperationMgr().addExtraLog(this.player, 203, heroDao.warHorse.id + "", oldSkillStr, newSkillStr, Convert.toStr(heroDao.warHorse.lockSkilIndex), slaveWarHorse.id + "", slaveSkillStr);
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
      }
   }

   public void WarHorseArtificeOfHero(int mainCode, List<Integer> slaveCodes, int num) {
      if (this.player.isSystemOpen(3002)) {
         List<Integer> codesList = new ArrayList();
         codesList.add(mainCode);

         for(Integer slaveCode : slaveCodes) {
            if (codesList.contains(slaveCode)) {
               return;
            }

            codesList.add(slaveCode);
         }

         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         List<WarHorse> slaveList = new ArrayList();

         for(Integer slaveCode : slaveCodes) {
            ItemBase slaveItemBase = itemBagPart.getItemByCode(slaveCode);
            if (slaveItemBase == null) {
               return;
            }

            if (!(slaveItemBase instanceof WarHorse)) {
               return;
            }

            WarHorse slaveWarHorse = (WarHorse)slaveItemBase;
            if (slaveWarHorse.isLock) {
               return;
            }

            if (slaveWarHorse.isAwaken) {
               return;
            }

            WarHorseExclusiveModel warHorseExclusiveModel = (WarHorseExclusiveModel)this.player.getGameModelPool().getEntity("warHorseExclusive", slaveWarHorse.id);
            if (warHorseExclusiveModel != null) {
               return;
            }

            slaveList.add(slaveWarHorse);
         }

         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         HeroDao heroDao = heroBagPart.getHeroByCode(mainCode);
         if (heroDao != null) {
            if (heroDao.warHorse != null) {
               WarHorseBaseModel mainBaseModel = (WarHorseBaseModel)this.player.getGameModelPool().getEntity("warHorseBase", heroDao.warHorse.id);
               if (heroDao.warHorse.artificeVal >= mainBaseModel.getMaxRefinedValue()) {
                  this.player.failure(61176);
               } else {
                  if (num > 0) {
                     ResourceModel needItem = new ResourceModel(2, 1013, num);
                     if (!this.player.checkResourceNum(needItem)) {
                        this.player.failure(61177);
                        return;
                     }
                  }

                  if (heroDao.warHorse.artificeVal + num > mainBaseModel.getMaxRefinedValue()) {
                     logger.error("玩家={}，传入的物品超出，数量={}，当前炼化值={}，最大炼化值={}", new Object[]{this.player.getPlayerId(), num, heroDao.warHorse.artificeVal, mainBaseModel.getMaxRefinedValue()});
                     this.player.failure(61178);
                  } else {
                     int oldArtificeVal = heroDao.warHorse.artificeVal;
                     if (num > 0) {
                        WarHorse var10000 = heroDao.warHorse;
                        var10000.artificeVal += num;
                     }

                     List<Integer> delList = new ArrayList();
                     Map<Integer, Integer> idNumMap = new HashMap();

                     for(WarHorse horse : slaveList) {
                        if (heroDao.warHorse.artificeVal >= mainBaseModel.getMaxRefinedValue()) {
                           heroDao.warHorse.artificeVal = mainBaseModel.getMaxRefinedValue();
                           break;
                        }

                        WarHorseBaseModel horseBaseModel = (WarHorseBaseModel)this.player.getGameModelPool().getEntity("warHorseBase", horse.id);
                        WarHorse var30 = heroDao.warHorse;
                        var30.artificeVal += horseBaseModel.getRefineValue();
                        delList.add(horse.code);
                        if (idNumMap.containsKey(horse.id)) {
                           int old = (Integer)idNumMap.get(horse.id);
                           idNumMap.put(horse.id, old + 1);
                        } else {
                           idNumMap.put(horse.id, 1);
                        }
                     }

                     heroDao.warHorse.isLock = true;
                     heroDao.updateOp();
                     if (!slaveCodes.isEmpty()) {
                        this.delHorse(slaveList, true, 68, 6805);
                        this.player.senditemUpdateMsg();
                     }

                     if (num > 0) {
                        ResourceModel needItem = new ResourceModel(2, 1013, num);
                        this.player.delResource(needItem, 68, 6805, num, 0, "");
                     }

                     heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WAR_HORSE, heroDao);
                     WarHorseMsg.S2C_Artifice_13816.Builder builder = WarHorseMsg.S2C_Artifice_13816.newBuilder();
                     builder.setCodeType(WarHorseMsg.CodeType.CODE_YPTE_HERO);
                     builder.setResult(1);
                     builder.setMainCode(mainCode);
                     builder.addAllSlaveCodes(slaveCodes);
                     this.player.sendMsg(builder.build());
                     String logStr = "";

                     for(Map.Entry<Integer, Integer> entry : idNumMap.entrySet()) {
                        logStr = logStr + entry.getKey() + "," + entry.getValue() + "|";
                     }

                     this.player.getOperationMgr().addExtraLog(this.player, 204, heroDao.warHorse.id + "", logStr, oldArtificeVal + "", heroDao.warHorse.artificeVal + "");
                  }
               }
            }
         }
      }
   }

   public void WarHorseInheritOfHero(int mainCode, int slaveCode, int type) {
      if (this.player.isSystemOpen(3002)) {
         int warHorseImpartCost = this.configManager.getIntDefault("warHorseImpartCost", 100);
         ResourceModel needGold = new ResourceModel(1, PlayerDefine.PLAYER_GOLD, warHorseImpartCost);
         if (!this.player.checkResourceNum(needGold)) {
            this.player.failure(31);
         } else {
            ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
            ItemBase slaveItemBase = itemBagPart.getItemByCode(slaveCode);
            if (slaveItemBase != null) {
               if (slaveItemBase instanceof WarHorse) {
                  WarHorseBaseModel warHorseBaseModel = (WarHorseBaseModel)this.player.getGameModelPool().getEntity("warHorseBase", slaveItemBase.id);
                  if (warHorseBaseModel != null) {
                     if (warHorseBaseModel.getType() == 0) {
                        WarHorse slaveWarHorse = (WarHorse)slaveItemBase;
                        HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                        HeroDao heroDao = heroBagPart.getHeroByCode(mainCode);
                        if (heroDao != null) {
                           if (heroDao.warHorse != null) {
                              WarHorseExclusiveModel warHorseExclusiveModel = (WarHorseExclusiveModel)this.player.getGameModelPool().getEntity("warHorseExclusive", heroDao.warHorse.id);
                              if (warHorseExclusiveModel != null) {
                                 this.player.failure(76410);
                              } else {
                                 int oldMainId = heroDao.warHorse.id;
                                 List<Integer> oldMainSkills = new ArrayList();
                                 oldMainSkills.addAll(heroDao.warHorse.upSkills);
                                 slaveWarHorse.isLock = true;
                                 boolean isExceed = false;
                                 List<ResourceModel> addList = new ArrayList();
                                 Map<Integer, WarHorseSkillModel> map = this.player.getGameModelPool().getMap("warHorseSkillSlots");
                                 switch (type) {
                                    case 1:
                                       addList = this.getDelHorseReturResource(slaveWarHorse);
                                       slaveWarHorse.lv = heroDao.warHorse.lv;
                                       slaveWarHorse.exp = heroDao.warHorse.exp;
                                       slaveWarHorse.artificeVal = heroDao.warHorse.artificeVal;
                                       heroDao.warHorse.lv = 1;
                                       heroDao.warHorse.exp = 0;
                                       heroDao.warHorse.artificeVal = 0;
                                       break;
                                    case 2:
                                       slaveWarHorse.upSkills.clear();
                                       slaveWarHorse.awakenIndex.clear();
                                       if (!slaveWarHorse.isAwaken) {
                                          if (heroDao.warHorse.upSkills.size() > map.size()) {
                                             isExceed = true;

                                             for(int i = 0; i < map.size(); ++i) {
                                                slaveWarHorse.upSkills.add(heroDao.warHorse.upSkills.get(i));
                                             }
                                          }
                                       } else if (heroDao.warHorse.upSkills.size() > map.size()) {
                                          int moreSlots = heroDao.warHorse.upSkills.size() - map.size();

                                          for(int i = 0; i < moreSlots; ++i) {
                                             slaveWarHorse.awakenIndex.add(i);
                                          }
                                       }

                                       if (!isExceed) {
                                          slaveWarHorse.upSkills.addAll(heroDao.warHorse.upSkills);
                                       }

                                       heroDao.warHorse.isUnlock = false;
                                       heroDao.warHorse.isLock = false;
                                       heroDao.warHorse.lockSkilIndex.clear();
                                       heroDao.warHorse.upSkills.clear();
                                       heroDao.warHorse.updateMainSkillUnlock();
                                       heroDao.warHorse.awakenIndex.clear();
                                       break;
                                    default:
                                       addList = this.getDelHorseReturResource(slaveWarHorse);
                                       slaveWarHorse.lv = heroDao.warHorse.lv;
                                       slaveWarHorse.exp = heroDao.warHorse.exp;
                                       slaveWarHorse.artificeVal = heroDao.warHorse.artificeVal;
                                       slaveWarHorse.upSkills.clear();
                                       slaveWarHorse.awakenIndex.clear();
                                       if (!slaveWarHorse.isAwaken) {
                                          if (heroDao.warHorse.upSkills.size() > map.size()) {
                                             isExceed = true;

                                             for(int i = 0; i < map.size(); ++i) {
                                                slaveWarHorse.upSkills.add(heroDao.warHorse.upSkills.get(i));
                                             }
                                          }
                                       } else if (heroDao.warHorse.upSkills.size() > map.size()) {
                                          int moreSlots = heroDao.warHorse.upSkills.size() - map.size();

                                          for(int i = 0; i < moreSlots; ++i) {
                                             slaveWarHorse.awakenIndex.add(i);
                                          }
                                       }

                                       if (!isExceed) {
                                          slaveWarHorse.upSkills.addAll(heroDao.warHorse.upSkills);
                                       }

                                       heroDao.warHorse.reset(false);
                                 }

                                 slaveWarHorse.updateMainSkillUnlock();
                                 WarHorse newwarHorse = itemBagPart.addWarHorse(heroDao.warHorse, 12, 1217, 0, 0, "WarHorseInheritOfHero");
                                 this.player.additemUpdateBuilder(newwarHorse);
                                 this.player.senditemUpdateMsg();
                                 if (!addList.isEmpty()) {
                                    this.player.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 12, 1217, 0, 0, "WarHorseInheritOfHero");
                                 }

                                 heroDao.warHorse = new WarHorse(0, slaveWarHorse);
                                 heroDao.updateOp();
                                 itemBagPart.deleteItemByCode(slaveWarHorse.code, 1, 12, 1217, heroDao.code, 0, "WarHorseInheritOfHero");
                                 this.player.delResource(needGold, 12, 1217, heroDao.code, 0, "WarHorseInheritOfHero");
                                 this.player.senditemUpdateMsg();
                                 heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WAR_HORSE, heroDao);
                                 WarHorseMsg.S2C_Inherit_13818.Builder builder = WarHorseMsg.S2C_Inherit_13818.newBuilder();
                                 builder.setCodeType(WarHorseMsg.CodeType.CODE_YPTE_HERO);
                                 builder.setResult(1);
                                 builder.setMainCode(mainCode);
                                 builder.setSlaveCode(slaveCode);
                                 this.player.sendMsg(builder.build());
                                 String skillStr = "";

                                 for(Integer oldMainSkill : oldMainSkills) {
                                    skillStr = skillStr + oldMainSkill + ",";
                                 }

                                 this.player.getOperationMgr().addExtraLog(this.player, 205, oldMainId + "", skillStr, heroDao.warHorse.id + "");
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

   public int getWarHorseOpenSlots(WarHorse warHorse, boolean isAddAwakenSlots) {
      int slotsSize = 0;
      Map<Integer, WarHorseSkillSlotsModel> WarHorseSkillSlotsModelMap = this.player.getGameModelPool().getMap("warHorseSkillSlots");
      if (WarHorseSkillSlotsModelMap == null) {
         return 0;
      } else {
         for(Map.Entry<Integer, WarHorseSkillSlotsModel> entry : WarHorseSkillSlotsModelMap.entrySet()) {
            if (warHorse.lv >= ((WarHorseSkillSlotsModel)entry.getValue()).getLv()) {
               ++slotsSize;
            }
         }

         int haveSkillSlots = warHorse.upSkills.size() - warHorse.awakenIndex.size();
         slotsSize = slotsSize < haveSkillSlots ? haveSkillSlots : slotsSize;
         if (isAddAwakenSlots && warHorse.isAwaken) {
            WarHorseBaseModel baseModel = (WarHorseBaseModel)this.player.getGameModelPool().getEntity("warHorseBase", warHorse.id);
            if (baseModel != null) {
               for(int i = 0; i < baseModel.getWakeUpAddSkillNum(); ++i) {
                  ++slotsSize;
               }
            }
         }

         return slotsSize;
      }
   }

   private boolean lvUp(WarHorse warHorse) {
      WarHorseLevelModel model = (WarHorseLevelModel)this.player.getGameModelPool().getEntity("warHorseLevel", warHorse.lv);
      if (model == null) {
         return false;
      } else {
         WarHorseLevelModel nextModel = (WarHorseLevelModel)this.player.getGameModelPool().getEntity("warHorseLevel", warHorse.lv + 1);
         if (nextModel == null) {
            return false;
         } else if (warHorse.exp < model.getExp()) {
            return false;
         } else {
            warHorse.exp -= model.getExp();
            ++warHorse.lv;
            warHorse.isLock = true;
            warHorse.updateMainSkillUnlock();
            if (nextModel.getExp() == 0) {
               warHorse.exp = 0;
            }

            return true;
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ComposeHorse_13831(WarHorseMsg.C2S_ComposeHorse_13831 msg, String source) {
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      ItemBase itemBase = itemBagPart.getItemByCode(msg.getItemCode());
      if (itemBase != null) {
         ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", itemBase.id);
         if (itemModel != null) {
            if (itemModel.getSubclass() != 16) {
               logger.error("玩家={}，准备合成的不是战马碎片，ID={},名称={}", new Object[]{this.player.getPlayerId(), itemModel.getId(), itemModel.getName()});
            } else {
               Map<Integer, Integer> warHorseExchangeNumMap = this.configManager.getIntMap("warHorseExchangeNum");
               if (warHorseExchangeNumMap != null) {
                  int quality = itemModel.getQuality();
                  if (warHorseExchangeNumMap.containsKey(quality)) {
                     if (!ResourceModel.checkTotalNumError(msg.getNum(), (Integer)warHorseExchangeNumMap.get(quality))) {
                        ResourceModel needResource = new ResourceModel(2, itemModel.getId(), msg.getNum() * (Integer)warHorseExchangeNumMap.get(quality));
                        if (this.player.checkResourceNum(needResource)) {
                           if (itemModel.getUseFuncType() == 22) {
                              List<ResourceModel> resourceModels = new ArrayList();

                              for(int i = 0; i < msg.getNum(); ++i) {
                                 ResourceModel resourceModel = itemBagPart.composeRandom(itemModel.getUseFuncId());
                                 if (resourceModel == null) {
                                    logger.error("玩家={}，不能合成战马碎片，ID={},名称={}", new Object[]{this.player.getPlayerId(), itemModel.getId(), itemModel.getName()});
                                    return;
                                 }

                                 ResourceModel.addResourceToList(resourceModels, resourceModel);
                              }

                              this.player.delResource(needResource, 68, 6802, itemModel.getId(), 0, "");
                              this.player.addResource(resourceModels, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 68, 6802, itemModel.getId(), msg.getNum(), "");
                           } else if (itemModel.getUseFuncType() == 23) {
                              this.player.delResource(needResource, 68, 6802, itemModel.getId(), 0, "");
                              ResourceModel addResource = new ResourceModel(2, itemModel.getUseFuncId(), itemModel.getUseFuncValue() * msg.getNum());
                              this.player.addResource(addResource, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 68, 6802, itemModel.getId(), 0, "");
                           }

                           WarHorseMsg.S2C_ComposeHorse_13832.Builder builder = WarHorseMsg.S2C_ComposeHorse_13832.newBuilder();
                           builder.setResult(1);
                           this.player.sendMsg(builder.build());
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_WatchHorse_13871(WarHorseMsg.C2S_WatchHorse_13871 msg, String source) {
      this.watchWarHorse();
   }

   @MsgHandlerAnno
   public void C2S_UpdateIds_13873(WarHorseMsg.C2S_UpdateIds_13873 msg, String source) {
      this.WarHorseIds();
   }

   public void watchWarHorse() {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      playerExtend.newHorseIds.clear();
      this.player.updatePlayerExtend(13);
      WarHorseMsg.S2C_WatchHorse_13872.Builder builder = WarHorseMsg.S2C_WatchHorse_13872.newBuilder();
      builder.setResult(1);
      this.player.sendMsg(builder.build());
   }

   public void WarHorseIds() {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      WarHorseMsg.S2C_UpdateIds_13874.Builder builder = WarHorseMsg.S2C_UpdateIds_13874.newBuilder();
      builder.addAllHorseIds(playerExtend.unlockHorses);
      builder.addAllNewHorseIds(playerExtend.newHorseIds);
      this.player.sendMsg(builder.build());
   }

   @TaskMethod
   public void unlockWarHorse(int warHorseId) {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      if (!playerExtend.unlockHorses.contains(warHorseId)) {
         playerExtend.unlockHorses.add(warHorseId);
         playerExtend.newHorseIds.add(warHorseId);
         this.player.updatePlayerExtend(13);
         WarHorseMsg.S2C_UpdateIds_13874.Builder builder = WarHorseMsg.S2C_UpdateIds_13874.newBuilder();
         builder.addHorseIds(warHorseId);
         builder.addNewHorseIds(warHorseId);
         this.player.sendMsg(builder.build());
      }

   }

   @MsgHandlerAnno
   public void C2S_SacrificeInfo_13841(WarHorseMsg.C2S_SacrificeInfo_13841 msg, String source) {
      if (this.player.isSystemOpen(3002)) {
         this.sendSacrificeInfo();
      }
   }

   @MsgHandlerAnno
   public void C2S_DoSacrifice_13843(WarHorseMsg.C2S_DoSacrifice_13843 msg, String source) {
      if (this.player.isSystemOpen(3002)) {
         int type = msg.getType();
         WarHorseStableModel warHorseStableModel = (WarHorseStableModel)ApplicationContextProvider.getModelPoolEntity("warHorseStable", type);
         if (warHorseStableModel == null) {
            this.player.failure(0);
         } else {
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            int dailyCount = (Integer)playerResetCustomCache.getDailyNum(18, 0);
            if ((float)(dailyCount + warHorseStableModel.getTimes()) > ApplicationContextProvider.getConfigFloat("LotteryLimit", 99999.0F)) {
               this.player.failure(51);
            } else {
               WarHorseDao warHorseDao = (WarHorseDao)this.player.getData("tb_war_horse", this.player.getPlayerId());
               int freeCount = ApplicationContextProvider.getConfigInt("warHorseFreeNum", 0);
               long feeItem = 0L;
               long feeGold = 0L;
               ResourceModel needResource = null;
               if (warHorseStableModel.getTimes() == 1 && warHorseDao.sacrificeFreeCount < freeCount) {
                  ++warHorseDao.sacrificeFreeCount;
               } else {
                  ResourceModel sacrificeItemResource = new ResourceModel((Integer)warHorseStableModel.getFirstItem().get(0), (Integer)warHorseStableModel.getFirstItem().get(1), (Integer)warHorseStableModel.getFirstItem().get(2));
                  ResourceModel sacrificeGoldResource = new ResourceModel((Integer)warHorseStableModel.getReplaceItem().get(0), (Integer)warHorseStableModel.getReplaceItem().get(1), (Integer)warHorseStableModel.getReplaceItem().get(2));
                  long itemRes = this.player.getResourceNum(sacrificeItemResource.getType(), sacrificeItemResource.getId());
                  long needItemRes = (long)(Integer)warHorseStableModel.getFirstItem().get(2) - itemRes;
                  if (needItemRes > 0L) {
                     feeGold = (long)(sacrificeGoldResource.getValue() / warHorseStableModel.getTimes()) * needItemRes;
                     if (!this.player.checkResourceNum(sacrificeGoldResource.getType(), sacrificeGoldResource.getId(), (int)feeGold)) {
                        this.player.failure(31);
                        return;
                     }

                     feeItem = itemRes;
                  } else {
                     feeItem = (long)(Integer)warHorseStableModel.getFirstItem().get(2);
                  }
               }

               List<ResourceModel> prizeList = new ArrayList();
               int sacrificeCount = this.sacrifice(prizeList, warHorseStableModel, warHorseDao.sacrificeCount);
               if (feeItem > 0L) {
                  this.player.delResource((Integer)warHorseStableModel.getFirstItem().get(0), (Integer)warHorseStableModel.getFirstItem().get(1), feeItem, 68, 6806, type, 0, "");
               }

               if (feeGold > 0L) {
                  this.player.delResource((Integer)warHorseStableModel.getReplaceItem().get(0), (Integer)warHorseStableModel.getReplaceItem().get(1), feeGold, 68, 6806, type, 0, "");
               }

               warHorseDao.sacrificePoint += warHorseStableModel.getExReward();
               warHorseDao.sacrificeCount = sacrificeCount;
               warHorseDao.updateOp();
               playerResetCustomCache.setDailyReset(18, dailyCount + warHorseStableModel.getTimes());
               PlayerPublicDao playerDao = this.player.getPublicDao();
               List<ResourceModel> sacrificeLogResources = new ArrayList(prizeList);
               this.warHorseMgr.pushTaskEx("addSacrificeRecords", new Object[]{sacrificeLogResources, playerDao.playerId, playerDao.playerName});
               prizeList.addAll(warHorseStableModel.getRewards());
               this.player.addResource(prizeList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 68, 6806, type, 0, "");
               WarHorseMsg.S2C_DoSacrifice_13844.Builder builder = WarHorseMsg.S2C_DoSacrifice_13844.newBuilder();
               builder.setType(type);
               builder.setSacrificeCount(warHorseDao.sacrificeCount);
               builder.setDailySacrificeCount((Integer)playerResetCustomCache.getDailyNum(18, 0));
               this.player.sendMsg(builder.build());
               String rewardStr = "";

               for(ResourceModel resourceModel : prizeList) {
                  rewardStr = rewardStr + resourceModel.getId() + "," + resourceModel.getValue() + "|";
               }

               if (needResource == null) {
                  this.player.getOperationMgr().addExtraLog(this.player, 201, "1", "-", "-", rewardStr);
               } else {
                  String[] logStr = LogOperationMgr.toRewardsInfo(needResource);
                  this.player.getOperationMgr().addExtraLog(this.player, 201, "1", logStr[0], logStr[1], rewardStr);
               }

               GuanJiaPart guanJiaPart = (GuanJiaPart)this.player.getMgrPart(GuanJiaPart.class);
               guanJiaPart.checkState(1191, (List)null);
            }
         }
      }
   }

   public int sacrifice(List<ResourceModel> prizeList, WarHorseStableModel warHorseStableModel, int curSacrificeCount) {
      int finalSacrificeCount = curSacrificeCount;
      String[] floorNumArr = ApplicationContextProvider.getConfigString("warHorseFloorNum", "15|15").split("\\|");
      int floorNum = Integer.parseInt(floorNumArr[0]);
      Map<Integer, Map<Integer, WarHorseStableLibModel>> allStableLibModelMap = ApplicationContextProvider.<Integer, Map<Integer, WarHorseStableLibModel>>getModelPoolMap("customWarHorseStableLib");

      for(int sacrificeCount = 1; sacrificeCount <= warHorseStableModel.getTimes(); ++sacrificeCount) {
         ++finalSacrificeCount;
         int floorLibId = warHorseStableModel.getOrdinaryLib();
         if (finalSacrificeCount >= floorNum) {
            floorLibId = warHorseStableModel.getFloorLib();
            finalSacrificeCount = 0;
         }

         Map<Integer, WarHorseStableLibModel> warHorseStableLibModelMap = (Map)allStableLibModelMap.get(floorLibId);
         int totalRate = 0;

         for(Map.Entry<Integer, WarHorseStableLibModel> entry : warHorseStableLibModelMap.entrySet()) {
            totalRate += ((WarHorseStableLibModel)entry.getValue()).getRate();
         }

         int randomInt = RandomUtil.randInt(totalRate);
         int curRate = 0;
         WarHorseStableLibModel warHorseModel = null;

         for(WarHorseStableLibModel model : warHorseStableLibModelMap.values()) {
            curRate += model.getRate();
            if (curRate > randomInt) {
               warHorseModel = model;
               break;
            }
         }

         if (warHorseModel != null && warHorseModel != null) {
            WarHorseBaseModel warHorseBaseModel = (WarHorseBaseModel)ApplicationContextProvider.getModelPoolEntity("warHorseBase", warHorseModel.getItemId());
            if (warHorseBaseModel != null && warHorseBaseModel.getQuality() >= 5) {
               finalSacrificeCount = 0;
            }

            prizeList.add(new ResourceModel(warHorseModel.getItemType(), warHorseModel.getItemId(), warHorseModel.getItemNum()));
         }
      }

      return finalSacrificeCount;
   }

   @MsgHandlerAnno
   public void C2S_SacrificeBoxReward_13845(WarHorseMsg.C2S_SacrificeBoxReward_13845 msg, String source) {
      if (this.player.isSystemOpen(3002)) {
         int id = msg.getId();
         Map<Integer, WarHorseStableIntegralModel> warHorseStableIntegralModelMap = ApplicationContextProvider.<Integer, WarHorseStableIntegralModel>getModelPoolMap("warHorseStableIntegral");
         WarHorseStableIntegralModel warHorseStableIntegralModel = (WarHorseStableIntegralModel)warHorseStableIntegralModelMap.get(id);
         if (warHorseStableIntegralModel == null) {
            this.player.failure(0);
         } else {
            WarHorseDao warHorseDao = (WarHorseDao)this.player.getData("tb_war_horse", this.player.getPlayerId());
            if (warHorseDao.sacrificePoint >= warHorseStableIntegralModel.getNeedPoint() && warHorseDao.sacrificePoint >= warHorseStableIntegralModel.getConsumePoint()) {
               if (warHorseDao.sacrificeBoxes.contains(id)) {
                  this.player.failure(24);
               } else {
                  warHorseDao.sacrificeBoxes.add(id);
                  if (warHorseDao.sacrificeBoxes.size() >= warHorseStableIntegralModelMap.size()) {
                     int maxId = warHorseStableIntegralModelMap.keySet().stream().mapToInt((value) -> value).max().orElse(999);
                     warHorseDao.sacrificePoint -= ((WarHorseStableIntegralModel)warHorseStableIntegralModelMap.getOrDefault(maxId, new WarHorseStableIntegralModel())).getConsumePoint();
                     warHorseDao.sacrificeBoxes.clear();
                  }

                  warHorseDao.updateOp();
                  this.player.addResource(2, warHorseStableIntegralModel.getBoxId(), 1, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 21, 2116, warHorseStableIntegralModel.getId(), 1, "");
                  WarHorseMsg.S2C_SacrificeBoxReward_13846.Builder builder = WarHorseMsg.S2C_SacrificeBoxReward_13846.newBuilder();
                  builder.setId(id);
                  builder.setSacrificePoint(warHorseDao.sacrificePoint);
                  this.player.sendMsg(builder.build());
               }
            } else {
               this.player.failure(36);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_SacrificeRecordList_13847(WarHorseMsg.C2S_SacrificeRecordList_13847 msg, String source) {
      if (this.player.isSystemOpen(3002)) {
         this.player.sendMsg(this.warHorseMgr.buildSacrificeRecordListMsg(msg.getType(), this.player.getPlayerId()));
      }
   }

   private void sendSacrificeInfo() {
      WarHorseMsg.S2C_SacrificeInfo_13842.Builder builder = WarHorseMsg.S2C_SacrificeInfo_13842.newBuilder();
      WarHorseDao warHorseDao = (WarHorseDao)this.player.getData("tb_war_horse", this.player.getPlayerId());
      builder.setSacrificePoint(warHorseDao.sacrificePoint);
      builder.setSacrificeCount(warHorseDao.sacrificeCount);
      builder.addAllGotBoxes(warHorseDao.sacrificeBoxes);
      builder.setSacrificeFreeCount(warHorseDao.sacrificeFreeCount);
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      builder.setDailySacrificeCount((Integer)playerResetCustomCache.getDailyNum(18, 0));
      this.player.sendMsg(builder.build());
   }

   public WarHorseBaseModel getRandomWarHorse(int quality) {
      List<WarHorseBaseModel> groupMap = (List)this.player.getGameModelPool().getEntity("customWarHorseBase", quality);
      int totalWeight = 0;

      for(WarHorseBaseModel warHorseBaseModel : groupMap) {
         totalWeight += warHorseBaseModel.getWeight();
      }

      int r = RandomUtil.randInt(totalWeight);
      int temp = 0;

      for(WarHorseBaseModel warHorseBaseModel : groupMap) {
         temp += warHorseBaseModel.getWeight();
         if (r < temp) {
            return warHorseBaseModel;
         }
      }

      return null;
   }

   public boolean delHorse(List<WarHorse> slaveList, boolean isReturn, int module, int reason) {
      List<Integer> delCodeList = new ArrayList();
      List<ResourceModel> totalList = new ArrayList();

      for(WarHorse warHorse : slaveList) {
         delCodeList.add(warHorse.code);
         if (isReturn) {
            for(ResourceModel resourceModel : this.getDelHorseReturResource(warHorse)) {
               ResourceModel.addResourceToList(totalList, resourceModel);
            }
         }
      }

      if (isReturn && !totalList.isEmpty()) {
         this.player.addResource(totalList, PlayerMsg.ShowType.SHOW_WAR_HORSE, module, reason, 0, 0, "");
      }

      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
      itemBagPart.deleteItemByCodes(delCodeList, module, reason, 0, 0, "");
      return true;
   }

   @MsgHandlerAnno
   public void C2S_ChangeHorse_13881(WarHorseMsg.C2S_ChangeHorse_13881 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao fromHeroDao = heroBagPart.getHeroByCode(msg.getFromHero());
      HeroDao destHeroDao = heroBagPart.getHeroByCode(msg.getDestHero());
      if (fromHeroDao != null && destHeroDao != null) {
         if (!HeroModel.isReplacementHero(destHeroDao.id)) {
            if (fromHeroDao.warHorse == null) {
               logger.error("武将身上并没有佩戴战马");
            } else {
               this.undressHorse(destHeroDao);
               WarHorse warHorse = new WarHorse(0, fromHeroDao.warHorse);
               destHeroDao.warHorse = warHorse;
               destHeroDao.updateOp();
               fromHeroDao.warHorse = null;
               fromHeroDao.updateOp();
               heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WAR_HORSE, destHeroDao);
               heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WAR_HORSE, fromHeroDao);
               WarHorseMsg.S2C_ChangeHorse_13882.Builder builder = WarHorseMsg.S2C_ChangeHorse_13882.newBuilder();
               builder.setFromHero(msg.getFromHero());
               builder.setDestHero(msg.getDestHero());
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   private void updateWarHorse(HeroDao heroDao) {
      if (heroDao != null) {
         HeroMsg.S2C_HeroBaseData_5002.Builder heroBaseBuilder = HeroMsg.S2C_HeroBaseData_5002.newBuilder();
         heroBaseBuilder.addHeros(heroDao.toHeroInfo());
         this.player.sendMsg(heroBaseBuilder.build());
      }
   }

   private void updateWarHorse(WarHorse warHorse) {
      BagMsg.S2C_ItemUpdate_3006.Builder builder = BagMsg.S2C_ItemUpdate_3006.newBuilder();
      builder.addItems(warHorse.toItemInfoBuilder());
      this.player.sendMsg(builder.build());
   }

   public List<ResourceModel> getDelHorseReturResource(WarHorse warHorse) {
      List<ResourceModel> resultList = new ArrayList();
      if (warHorse.lv > 1) {
         int totalHorseFoods = 0;

         for(int i = 1; i < warHorse.lv; ++i) {
            WarHorseLevelModel curWarHorseLevelModel = (WarHorseLevelModel)this.player.getGameModelPool().getEntity("warHorseLevel", i);
            if (curWarHorseLevelModel != null) {
               totalHorseFoods += curWarHorseLevelModel.getExp();
            }
         }

         if (totalHorseFoods > 0) {
            int warHorseExpItem = this.configManager.getIntDefault("warHorseExpItem", 1115);
            resultList.add(new ResourceModel(2, warHorseExpItem, totalHorseFoods));
         }
      }

      if (warHorse.exp > 0) {
         int warHorseExpItem = this.configManager.getIntDefault("warHorseExpItem", 1115);
         ResourceModel.addResourceToList(resultList, new ResourceModel(2, warHorseExpItem, warHorse.exp));
      }

      if (warHorse.artificeVal > 0) {
         resultList.add(new ResourceModel(2, 1013, warHorse.artificeVal));
      }

      return resultList;
   }

   @MsgHandlerAnno
   public void C2S_Awaken_13883(WarHorseMsg.C2S_Awaken_13883 msg, String source) {
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(msg.getHeroCode());
      if (heroDao != null) {
         if (heroDao.warHorse != null) {
            if (heroDao.warHorse.isAwaken) {
               logger.error("玩家={}，战马已经觉醒过", this.player.getPlayerId());
            } else {
               WarHorseBaseModel warHorseBaseModel = (WarHorseBaseModel)this.player.getGameModelPool().getEntity("warHorseBase", heroDao.warHorse.id);
               if (warHorseBaseModel != null) {
                  if (this.player.checkResourceNum(warHorseBaseModel.getWakeUpNeedItem())) {
                     this.player.delResource((List)warHorseBaseModel.getWakeUpNeedItem(), 68, 6808, 0, 0, "");
                     heroDao.warHorse.isAwaken = true;
                     heroDao.updateOp();
                     heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_WAR_HORSE, heroDao);
                     WarHorseMsg.S2C_Awaken_13884.Builder builder = WarHorseMsg.S2C_Awaken_13884.newBuilder();
                     builder.setHeroCode(msg.getHeroCode());
                     this.player.sendMsg(builder.build());
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_UseHorseItem_13885(WarHorseMsg.C2S_UseHorseItem_13885 msg, String source) {
      if (this.player.isSystemOpen(3002)) {
         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         ItemBase itemBase = itemBagPart.getItemByCode(msg.getItemCode());
         if (itemBase != null) {
            ItemModel oldItemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", itemBase.id);
            if (oldItemModel != null) {
               if (oldItemModel.getUseFuncType() == 30) {
                  ItemModel newItemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", oldItemModel.getUseFuncId());
                  if (newItemModel != null) {
                     WarHorseBaseModel warHorseBaseModel = (WarHorseBaseModel)this.player.getGameModelPool().getEntity("warHorseBase", newItemModel.getId());
                     if (warHorseBaseModel != null) {
                        if (warHorseBaseModel.getHunjvSkillId().contains(msg.getSkillId())) {
                           WarHorseSkillModel skillModel = (WarHorseSkillModel)this.player.getGameModelPool().getEntity("warHorseSkill", msg.getSkillId());
                           if (skillModel != null) {
                              itemBagPart.deleteItemByCode(msg.getItemCode(), 1, 68, 6809, 0, 0, "");
                              WarHorse warHorse = new WarHorse();
                              int code = this.player.getUniqueCode(CodeDefine.ITEM_CODE);
                              warHorse.initBySkill(code, 1, msg.getSkillId(), newItemModel, this.player);
                              ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());
                              itemBagDao.additem(warHorse, 15);
                              itemBagPart.addOperationLog(warHorse.id, warHorse.getNum(), 1, 6809);
                              this.player.additemUpdateBuilder(warHorse);
                              this.player.senditemUpdateMsg();
                              this.player.addResourceMsg(warHorse);
                              this.player.sendResourceMsg();
                              WarHorseMsg.S2C_UseHorseItem_13886.Builder builder = WarHorseMsg.S2C_UseHorseItem_13886.newBuilder();
                              builder.setResult(1);
                              builder.setHorseCode(code);
                              this.player.sendMsg(builder.build());
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void gmRandmoTest() {
      this.randomWarHorse(5001);
      this.randomWarHorse(5002);
      this.randomWarHorse(5003);
   }

   public void randomWarHorse(int group) {
      int loop = 10000;
      Map<Integer, Integer> map = new HashMap();
      ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);

      for(int i = 0; i < loop; ++i) {
         ResourceModel resourceModel = itemBagPart.composeRandom(group);
         if (map.containsKey(resourceModel.getId())) {
            int oldVal = (Integer)map.get(resourceModel.getId());
            map.put(resourceModel.getId(), oldVal + 1);
         } else {
            map.put(resourceModel.getId(), 1);
         }
      }

      logger.info("合成随机战马{}，数量={}", group, loop);

      for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
         logger.info("{}={}", entry.getKey(), entry.getValue());
      }

   }

   public void clearHorse() {
      ItemBagDao itemBagDao = (ItemBagDao)this.player.getData("tb_bag", this.player.getPlayerId());

      for(WarHorse warHorse : itemBagDao.warHorse.getMap().values()) {
         warHorse.setNum(0);
         this.player.itemUpdateBuilder.addItems(warHorse.toItemInfoBuilder());
         itemBagDao.getItemMap().remove(warHorse.code);
      }

      itemBagDao.warHorse.getMap().clear();
      itemBagDao.updateOp();
      this.player.senditemUpdateMsg();
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      playerExtend.unlockHorses.clear();
      playerExtend.newHorseIds.clear();
      this.player.updatePlayerExtend(13);
   }

   public void levelUp(int preLv, int newLv) {
      this.checkOpenReward();
   }

   public void logArrayingHeroHorse() {
      try {
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
         HeroArrayingDao heroArrayingDao = heroArrayingPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_ARRAYING);
         int LOG_HORSE_COUNT = 6;
         String[] logHorseDetail = new String[6];

         for(int i = 0; i < 6; ++i) {
            logHorseDetail[i] = "-";
         }

         if (heroArrayingDao != null) {
            int currentLogIndex = 0;

            for(Map.Entry<Byte, Integer> entry : heroArrayingDao.elements.entrySet()) {
               if (currentLogIndex >= 6) {
                  break;
               }

               byte pos = (Byte)entry.getKey();
               if (pos >= 0 && pos <= 5) {
                  HeroDao heroDao = heroBagPart.getHeroByCode((Integer)entry.getValue());
                  if (heroDao != null) {
                     WarHorse warHorse = heroDao.warHorse;
                     if (warHorse != null) {
                        WarHorseBaseModel baseModel = (WarHorseBaseModel)this.player.getGameModelPool().getEntity("warHorseBase", warHorse.id);
                        if (null != baseModel) {
                           HeroModel heroModel = (HeroModel)ApplicationContextProvider.getModelPoolEntity("hero", heroDao.id);
                           if (heroModel != null) {
                              String heroName = heroModel.getName();
                              int heroCode = heroDao.code;
                              String horseName = baseModel.getName();
                              int horseLv = warHorse.lv;
                              int exp = warHorse.exp;
                              logHorseDetail[currentLogIndex] = String.format("%s-%d-%s-%d-%d", heroName, heroCode, horseName, horseLv, exp);
                              ++currentLogIndex;
                           }
                        }
                     }
                  }
               }
            }
         }

         this.player.getOperationMgr().addExtraLog(this.player, 222, logHorseDetail[0], logHorseDetail[1], logHorseDetail[2], logHorseDetail[3], logHorseDetail[4], logHorseDetail[5]);
      } catch (Exception e) {
         e.printStackTrace();
      }

   }
}
