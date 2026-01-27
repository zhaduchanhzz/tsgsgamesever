package com.gzbz.gamePlayer.equip;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.HeroDao;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.playerBag.EquipItem;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.EquipConsumesModel;
import com.gzbz.model.EquipRefineModel;
import com.gzbz.model.GameModelPool;
import com.gzbz.model.ItemModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.EquipStrengthMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
public class EquipStrengthPart extends PlayerPart {
   Logger logger = LoggerFactory.getLogger(EquipStrengthPart.class);
   @Autowired
   ConfigManager configManager;
   public static final int STRENGTH_FAIL = 0;
   public static final int STRENGTH_SUCCESS = 1;
   public static final int STRENGTH_KEEP = 2;
   public static final int STRENGTH_TARGET = 3;
   public static final int STRENGTH_SKILL_ATTACK = 1;
   public static final int STRENGTH_SKILL_EQUIP = 2;
   public static final int STRENGTH_SKILL_RESET = 3;
   public static final int STRENGTH_LEV_RESET = 4;
   public static final int STRENGTH_SKILL_FAIL = 5;

   @MsgHandlerAnno
   public void C2S_EquipStrength_18501(EquipStrengthMsg.C2S_EquipStrength_18501 msg, String source) {
      int heroCode = msg.getHeroCode();
      CommonMsg.WearPosition position = msg.getPosition();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      if (heroDao == null) {
         this.logger.info("英雄不存在，code={}", heroCode);
      } else {
         EquipItem equipItem = (EquipItem)heroDao.equips.get(position.getNumber());
         if (equipItem == null) {
            this.logger.info("该位置装备为空，code={}，position={}", position.getNumber());
         } else {
            ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", equipItem.id);
            if (itemModel == null) {
               this.logger.info("装备模板为空，code={}，id={}", heroCode, equipItem.id);
            } else {
               String limit = ApplicationContextProvider.getConfigString("RefineOpenLevel", "6|4");
               String[] limitLev = limit.split("\\|");
               int limitQuality = Integer.parseInt(limitLev[0]);
               int limitStar = Integer.parseInt(limitLev[1]);
               if (itemModel.getQuality() >= limitQuality && itemModel.getStar() >= limitStar) {
                  int lastLev = 0;
                  if (heroDao.strengthLev.containsKey(position.getNumber())) {
                     lastLev = (Integer)heroDao.strengthLev.get(position.getNumber());
                  }

                  Map<Integer, EquipRefineModel> strengthModelMap = this.player.getGameModelPool().getMap("EquipRefine");
                  EquipRefineModel refineModel = null;

                  for(EquipRefineModel model : strengthModelMap.values()) {
                     int tempLev = lastLev + 1;
                     if (msg.getTargetLev() != 0) {
                        tempLev = msg.getTargetLev();
                     }

                     if (model.getRefineLevel() == tempLev && model.getEquipType() == itemModel.getSeat()) {
                        refineModel = model;
                        break;
                     }
                  }

                  if (refineModel == null) {
                     this.logger.info("装备精炼模板错误，code={}，type={},lv={}", new Object[]{heroCode, position.getNumber(), lastLev});
                  } else {
                     List<ResourceModel> allResource = new ArrayList();
                     int result;
                     if (msg.getTargetLev() > 0) {
                        EquipConsumesModel model = (EquipConsumesModel)this.player.getGameModelPool().getEntity("EquipConsumes", msg.getTargetLev());
                        if (model == null) {
                           this.logger.info("装备精炼等级错误lv={}", msg.getTargetLev());
                           return;
                        }

                        if (msg.getTargetLev() <= lastLev) {
                           return;
                        }

                        if (!this.player.checkResourceNum(model.getConsumes())) {
                           this.player.failure(76034);
                           return;
                        }

                        lastLev = msg.getTargetLev();
                        result = 3;

                        for(ResourceModel resourceModel : model.getConsumes()) {
                           resourceModel.addResourceToList(allResource);
                        }
                     } else {
                        if (!this.player.checkResourceNum(refineModel.getConsumes())) {
                           this.player.failure(76034);
                           return;
                        }

                        for(ResourceModel resourceModel : refineModel.getConsumes()) {
                           resourceModel.addResourceToList(allResource);
                        }

                        int addChance = 0;
                        boolean mustSuccess = false;
                        boolean keepLev = false;
                        if (msg.getItem() == EquipStrengthMsg.ConsumeItem.ADD_ITEM) {
                           if (!this.player.checkResourceNum(refineModel.getChance())) {
                              return;
                           }

                           addChance = refineModel.getAndChance();

                           for(ResourceModel resourceModel : refineModel.getChance()) {
                              resourceModel.addResourceToList(allResource);
                           }
                        } else if (msg.getItem() == EquipStrengthMsg.ConsumeItem.KEEP_ITEM) {
                           if (!this.player.checkResourceNum(refineModel.getApponi())) {
                              return;
                           }

                           keepLev = true;

                           for(ResourceModel resourceModel : refineModel.getApponi()) {
                              resourceModel.addResourceToList(allResource);
                           }
                        } else if (msg.getItem() == EquipStrengthMsg.ConsumeItem.UP_ITEM) {
                           if (!this.player.checkResourceNum(refineModel.getSuccess())) {
                              return;
                           }

                           mustSuccess = true;

                           for(ResourceModel resourceModel : refineModel.getSuccess()) {
                              resourceModel.addResourceToList(allResource);
                           }
                        }

                        String protectLevel = this.configManager.getStrByDefault("RefineProtectLevel", "5|10|13");
                        String[] protectArr = protectLevel.split("\\|");
                        List<String> protectList = Arrays.asList(protectArr);
                        if (protectList.contains(lastLev + "")) {
                           keepLev = true;
                        }

                        result = 2;
                        if (mustSuccess) {
                           result = 1;
                           ++lastLev;
                        } else {
                           int randNum = RandomUtil.randTenThousand();
                           if (refineModel.getRefineChance() + addChance < randNum) {
                              if (!keepLev) {
                                 int lev = (Integer)heroDao.strengthLev.get(position.getNumber());
                                 lastLev = lev - 1;
                                 if (lev > 0) {
                                    result = 0;
                                 } else {
                                    lastLev = 0;
                                 }
                              }
                           } else {
                              result = 1;
                              ++lastLev;
                           }
                        }
                     }

                     this.player.delResource((List)allResource, 12, 1235, 0, 0, "");
                     heroDao.strengthLev.put(position.getNumber(), lastLev);
                     heroDao.updateOp();
                     heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_EQUIP_STRENGTH, heroDao);
                     EquipStrengthMsg.S2C_EquipStrength_18502.Builder builder = EquipStrengthMsg.S2C_EquipStrength_18502.newBuilder();
                     builder.setHeroCode(heroCode);
                     builder.setPosition(position);
                     builder.setStrengthLev((Integer)heroDao.strengthLev.get(position.getNumber()));
                     builder.setResult(result);
                     if (result == 0) {
                        this.sendStrengthSkill(heroDao, 5);
                     }

                     this.player.sendMsg(builder.build());
                     this.player.triggerTask(670, 0, 1L, 1);
                     if (result == 1 || result == 3) {
                        this.player.triggerTask(671, lastLev, 1L, 1);
                        GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
                        giftPart.triggerTimeLimitGift(29, lastLev);
                     }

                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ResetStrength_18503(EquipStrengthMsg.C2S_ResetStrength_18503 msg, String source) {
      int heroCode = msg.getHeroCode();
      CommonMsg.WearPosition position = msg.getPosition();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      if (heroDao == null) {
         this.logger.info("英雄不存在，code={}", heroCode);
      } else {
         int strengthLev = 0;
         if (heroDao.strengthLev.containsKey(position.getNumber())) {
            strengthLev = (Integer)heroDao.strengthLev.get(position.getNumber());
            EquipRefineModel model = (EquipRefineModel)this.player.getGameModelPool().getEntity("EquipRefine", strengthLev);
            if (model != null) {
               if (strengthLev > 0) {
                  int resetCost = this.configManager.getIntDefault("refineReplace", 100);
                  int realCost = resetCost * strengthLev;
                  if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, realCost)) {
                     this.player.failure(76035);
                  } else {
                     this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)realCost, 12, 1235, 0, 0, "");
                     this.player.addResource(model.getBackMaterial(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 12, 1235, 0, 0, "");
                     heroDao.strengthLev.remove(position.getNumber());
                     heroDao.strengthSkill.clear();
                     heroDao.updateOp();
                     heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_EQUIP_STRENGTH, heroDao);
                     this.sendStrengthSkill(heroDao, 4);
                     EquipStrengthMsg.S2C_ResetStrength_18504.Builder builder = EquipStrengthMsg.S2C_ResetStrength_18504.newBuilder();
                     builder.setHeroCode(heroCode);
                     builder.setPosition(position);
                     builder.setStrengthLev(0);
                     this.player.sendMsg(builder.build());
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_AttackStrengthSkill_18507(EquipStrengthMsg.C2S_AttackStrengthSkill_18507 msg, String source) {
      int heroCode = msg.getHeroCode();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      if (heroDao == null) {
         this.logger.info("英雄不存在，code={}", heroCode);
      } else {
         int minLev = this.getMinLev(heroDao);
         if (msg.getStrengthLev() <= minLev) {
            heroDao.strengthSkill.put(msg.getStrengthLev(), msg.getSkillPosition().getNumber());
            heroDao.updateOp();
            this.sendStrengthSkill(heroDao, 1);
         }
      }
   }

   public int getMinLev(HeroDao heroDao) {
      int minLev = Integer.MAX_VALUE;
      if (heroDao.equips.size() != 4) {
         return 0;
      } else {
         String limit = ApplicationContextProvider.getConfigString("RefineOpenLevel", "6|4");
         String[] limitLev = limit.split("\\|");
         int limitQuality = Integer.parseInt(limitLev[0]);
         int limitStar = Integer.parseInt(limitLev[1]);
         GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);

         for(Map.Entry<Integer, EquipItem> entry : heroDao.equips.entrySet()) {
            if (!heroDao.strengthLev.containsKey(entry.getKey())) {
               return 0;
            }

            if (minLev > (Integer)heroDao.strengthLev.get(entry.getKey())) {
               minLev = (Integer)heroDao.strengthLev.get(entry.getKey());
            }

            ItemModel itemModel = (ItemModel)gameModelPool.getEntity("item", ((EquipItem)entry.getValue()).id);
            if (itemModel == null) {
               return 0;
            }

            if (itemModel.getQuality() < limitQuality || itemModel.getStar() < limitStar) {
               return 0;
            }
         }

         return minLev;
      }
   }

   @MsgHandlerAnno
   public void C2S_ResetStrengthSkill_18505(EquipStrengthMsg.C2S_ResetStrengthSkill_18505 msg, String source) {
      int heroCode = msg.getHeroCode();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroCode);
      if (heroDao == null) {
         this.logger.info("英雄不存在，code={}", heroCode);
      } else if (!heroDao.strengthSkill.isEmpty()) {
         heroDao.strengthSkill.clear();
         heroDao.updateOp();
         this.sendStrengthSkill(heroDao, 3);
      }
   }

   public void sendStrengthSkill(HeroDao heroDao, int result) {
      int minLev = this.getMinLev(heroDao);
      EquipStrengthMsg.S2C_AttackStrengthSkill_18508.Builder builder = EquipStrengthMsg.S2C_AttackStrengthSkill_18508.newBuilder();
      builder.setHeroCode(heroDao.code);
      if (!heroDao.strengthSkill.isEmpty()) {
         for(Map.Entry<Integer, Integer> entry : heroDao.strengthSkill.entrySet()) {
            if ((Integer)entry.getValue() > 0 && (Integer)entry.getKey() <= minLev) {
               CommonMsg.EquipStrengthSkillInfo.Builder strengthBuilder = CommonMsg.EquipStrengthSkillInfo.newBuilder();
               CommonMsg.StrengthSkillPosition position = CommonMsg.StrengthSkillPosition.forNumber((Integer)entry.getValue());
               strengthBuilder.setStrengthLev((Integer)entry.getKey());
               strengthBuilder.setPosition(position);
               builder.addStrengthSkillInfo(strengthBuilder);
            }
         }
      }

      builder.setResult(result);
      this.player.sendMsg(builder.build());
   }
}
