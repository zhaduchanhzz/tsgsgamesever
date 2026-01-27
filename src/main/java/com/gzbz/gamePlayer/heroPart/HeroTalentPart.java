package com.gzbz.gamePlayer.heroPart;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.HeroDao;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gift.GiftPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.HeroModel;
import com.gzbz.model.SkillModel;
import com.gzbz.model.TalentLevelModel;
import com.gzbz.model.TalentSkillModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.fun.ValListFun;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.spring.ApplicationContextProvider;
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
public class HeroTalentPart extends PlayerPart {
   static Logger logger = LoggerFactory.getLogger(HeroTalentPart.class);
   @Autowired
   ConfigManager configManager;

   public void C2S_ActivateTalent_5221() {
      HeroMsg.C2S_ActivateTalent_5221.Builder builder = HeroMsg.C2S_ActivateTalent_5221.newBuilder();
      builder.setHeroCode(340);
      builder.setPosition(CommonMsg.WearPosition.WEARPOSITION_TALENT_1);
      this.C2S_ActivateTalent_5221(builder.build(), (String)null);
   }

   @MsgHandlerAnno
   public void C2S_ActivateTalent_5221(HeroMsg.C2S_ActivateTalent_5221 msg, String source) {
      int code = msg.getHeroCode();
      int position = msg.getPosition().getNumber();
      HeroBagPart bagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = bagPart.getHeroByCode(code);
      if (heroDao == null) {
         logger.info("武将不存在，code={}", code);
      } else if (!HeroModel.isReplacementHero(heroDao.id)) {
         if (!HeroBagPart.isRightWearTypeOfPositon(CommonMsg.WearType.WEARTYPE_TALENT, msg.getPosition())) {
            logger.info("所传位置不是天赋,positon={}", position);
         } else {
            TalentLevelModel talentLevelModel = (TalentLevelModel)this.player.getGameModelPool().getEntity("talentLevel", position);
            if (talentLevelModel == null) {
               logger.info("武将天赋配置表为空，id={}", position);
            } else if (heroDao.getStar() >= talentLevelModel.getStar() && heroDao.getLv() >= talentLevelModel.getLevel()) {
               if (position != 20) {
                  int lastLv = 0;
                  if (heroDao.talent.containsKey(position - 1)) {
                     lastLv = (Integer)((List)heroDao.talent.get(position - 1)).get(0);
                  }

                  if (lastLv == 0) {
                     logger.error("玩家={}，天赋上一级尚未激活，位置={}，上一技能等级={}", new Object[]{this.player.getPlayerId(), position - 1, lastLv});
                     return;
                  }
               }

               int curLv = 0;
               if (heroDao.talent.containsKey(position)) {
                  curLv = (Integer)((List)heroDao.talent.get(position)).get(0);
               }

               if (msg.getLevel() != curLv) {
                  logger.info("武将天赋激活等级不对应，当前等级={}，客户端请求等级={}", curLv, msg.getLevel());
               } else if (!talentLevelModel.getConsume().containsKey(curLv + 1)) {
                  logger.info("配置表没有下一级升级消耗，当前等级={}，配置表等级={}", curLv, talentLevelModel.getConsume().keySet());
               } else if (!this.player.checkResourceNum((ResourceModel)talentLevelModel.getConsume().get(curLv + 1))) {
                  logger.info("升级资源不足");
               } else {
                  Map<Integer, TalentSkillModel> map = (Map)this.player.getGameModelPool().getEntity("customTalentSkill", heroDao.id);
                  if (map != null && !map.isEmpty()) {
                     TalentSkillModel talentSkillModel = (TalentSkillModel)map.get(curLv + 1);
                     if (talentSkillModel == null) {
                        logger.info("技能模板为空，heroId={}，level={}", heroDao.id, curLv + 1);
                     } else {
                        this.player.delResource((ResourceModel)talentLevelModel.getConsume().get(curLv + 1), 56, 5601, 0, 0, "");
                        List talentList = (List)heroDao.talent.getOrDefault(position, new ArrayList());
                        HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
                        String heroStr = "";
                        if (heroModel != null) {
                           heroStr = heroModel.getType() + "&" + heroModel.getName() + "&" + heroDao.getStar();
                        }

                        String[] rewardsInfo = LogOperationMgr.toRewardsInfo((ResourceModel)talentLevelModel.getConsume().get(curLv + 1));
                        if (talentList.isEmpty()) {
                           talentList.add(curLv + 1);
                           this.player.getOperationMgr().addExtraLog(this.player, 182, heroStr, rewardsInfo[0], rewardsInfo[1], heroDao.talent.size() + "");
                        } else {
                           talentList.set(0, curLv + 1);
                           this.player.getOperationMgr().addExtraLog(this.player, 185, heroStr, rewardsInfo[0], rewardsInfo[1], curLv + "", curLv + 1 + "");
                        }

                        heroDao.talent.put(position, talentList);
                        heroDao.updateOp();
                        GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
                        giftPart.triggerTimeLimitGift(24, (Integer)talentList.get(0));
                        HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                        heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_HERO_TALENT, heroDao);
                        HeroMsg.S2C_ActivateTalent_5222.Builder builder = HeroMsg.S2C_ActivateTalent_5222.newBuilder();
                        builder.setHeroCode(msg.getHeroCode());
                        builder.setPosition(msg.getPosition());
                        this.player.sendMsg(builder.build());
                     }
                  } else {
                     logger.info("技能模板为空，英雄ID={}", heroDao.id);
                  }
               }
            } else {
               this.player.failure(76413);
               logger.info("激活条件不满足，需要星级={}，等级={}，实际星级={}，实际等级={}", new Object[]{talentLevelModel.getStar(), talentLevelModel.getLevel(), heroDao.getStar(), heroDao.getLv()});
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_SelectTalentSkill_5223(HeroMsg.C2S_SelectTalentSkill_5223 msg, String source) {
      int code = msg.getHeroCode();
      int position = msg.getPosition().getNumber();
      HeroBagPart bagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = bagPart.getHeroByCode(code);
      if (heroDao == null) {
         logger.info("武将不存在，code={}", code);
      } else if (!HeroBagPart.isRightWearTypeOfPositon(CommonMsg.WearType.WEARTYPE_TALENT, msg.getPosition())) {
         logger.info("所传位置不是天赋,positon={}", position);
      } else if (!heroDao.talent.containsKey(position)) {
         logger.info("该位置未激活，不能选择技能，positon={},天赋数据={}", position, heroDao.talent.get(position));
      } else if (msg.getIndex() != 0 && msg.getIndex() != 1 && msg.getIndex() != 2) {
         logger.info("选择的技能错误，index={}", msg.getIndex());
      } else {
         List talentList = (List)heroDao.talent.getOrDefault(position, new ArrayList());
         if (talentList.size() > 1) {
            int oldIndex = (Integer)talentList.get(1);
            int talentResetGold = ApplicationContextProvider.getConfigInt("talentResetGold", 50);
            ResourceModel needModel = new ResourceModel(1, PlayerDefine.PLAYER_GOLD, talentResetGold);
            if (!this.player.checkResourceNum(needModel)) {
               return;
            }

            talentList.set(1, msg.getIndex());
            this.player.delResource(needModel, 56, 5601, 0, oldIndex, "");
         } else {
            talentList.add(msg.getIndex());
         }

         heroDao.talent.put(position, talentList);
         heroDao.updateOp();
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_HERO_TALENT, heroDao);
         HeroMsg.S2C_SelectTalentSkill_5224.Builder builder = HeroMsg.S2C_SelectTalentSkill_5224.newBuilder();
         builder.setHeroCode(msg.getHeroCode());
         builder.setPosition(msg.getPosition());
         builder.setIndex(msg.getIndex());
         this.player.sendMsg(builder.build());
         HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
         String heroStr = "";
         if (heroModel != null) {
            heroStr = heroModel.getType() + "&" + heroModel.getName() + "&" + heroDao.getStar();
         }

         String skillName = "";
         String key = heroDao.id + "" + 1;
         TalentSkillModel talentSkillModel = (TalentSkillModel)this.player.getGameModelPool().getEntity("talentSkill", Integer.valueOf(key));
         if (talentSkillModel != null) {
            int positionKey = position - 19;
            ValListFun valListFun = (ValListFun)talentSkillModel.getSkills().get(positionKey);
            if (valListFun != null) {
               int skillId = 0;
               switch (msg.getIndex()) {
                  case 0:
                     skillId = valListFun.getV0();
                     break;
                  case 1:
                     skillId = valListFun.getV1();
                     break;
                  case 2:
                     skillId = valListFun.getV2();
               }

               SkillModel skillModel = (SkillModel)this.player.getGameModelPool().getEntity("skill", skillId);
               if (skillModel != null) {
                  skillName = skillModel.getName();
               }
            }
         }

         this.player.getOperationMgr().addExtraLog(this.player, 184, heroStr, skillName);
      }
   }

   @MsgHandlerAnno
   public void C2S_ResetTalent_5225(HeroMsg.C2S_ResetTalent_5225 msg, String source) {
      int code = msg.getHeroCode();
      HeroBagPart bagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = bagPart.getHeroByCode(code);
      if (heroDao == null) {
         logger.info("武将不存在，code={}", code);
      } else if (heroDao.talent.isEmpty()) {
         logger.info("武将没有天赋，code={}", code);
      } else {
         List<ResourceModel> resetCost = this.configManager.getResourceModelList("HeroTalentResetCost", "1|9|50");
         List<ResourceModel> totalResetCost = new ArrayList();
         if (heroDao.talent.size() > 0) {
            for(ResourceModel resourceModel : resetCost) {
               ResourceModel newModel = new ResourceModel(resourceModel.getType(), resourceModel.getId(), resourceModel.getValue() * heroDao.talent.size());
               totalResetCost.add(newModel);
            }
         }

         if (!this.player.checkResourceNum(totalResetCost)) {
            logger.info("武将天赋重置资源不够");
         } else {
            this.player.delResource((List)totalResetCost, 56, 5602, 0, 0, "");
            List<ResourceModel> resourceModelList = this.getResetReturnResources(heroDao);
            heroDao.talent.clear();
            heroDao.updateOp();
            HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
            heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_HERO_TALENT, heroDao);
            this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 56, 5603, 0, 0, "");
            HeroMsg.S2C_ResetTalent_5226.Builder builder = HeroMsg.S2C_ResetTalent_5226.newBuilder();
            builder.setHeroCode(heroDao.code);
            this.player.sendMsg(builder.build());
            HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
            String heroStr = "";
            if (heroModel != null) {
               heroStr = heroModel.getType() + "&" + heroModel.getName() + "&" + heroDao.getStar();
            }

            this.player.getOperationMgr().addExtraLog(this.player, 183, heroStr, ((ResourceModel)totalResetCost.get(0)).getValue() + "");
         }
      }
   }

   public List<ResourceModel> getResetReturnResources(HeroDao heroDao) {
      List<ResourceModel> resultList = new ArrayList();
      if (heroDao == null) {
         logger.info("武将不存在，code={}", heroDao.code);
         return resultList;
      } else if (heroDao.talent.isEmpty()) {
         logger.info("武将没有天赋，code={}", heroDao.code);
         return resultList;
      } else {
         for(Map.Entry<Integer, List> entry : heroDao.talent.entrySet()) {
            if (((List)entry.getValue()).size() > 0) {
               int lv = (Integer)((List)entry.getValue()).get(0);
               if (lv > 0) {
                  TalentLevelModel talentLevelModel = (TalentLevelModel)this.player.getGameModelPool().getEntity("talentLevel", entry.getKey());
                  if (talentLevelModel != null) {
                     for(int i = 1; i <= lv; ++i) {
                        if (talentLevelModel.getConsume().keySet().contains(i)) {
                           ResourceModel.addResourceToList(resultList, (ResourceModel)talentLevelModel.getConsume().get(i));
                        }
                     }
                  }
               }
            }
         }

         return resultList;
      }
   }

   public List<ResourceModel> getRecallReturnResources(HeroDao heroDao) {
      List<ResourceModel> resultList = new ArrayList();
      if (heroDao == null) {
         logger.info("武将不存在，code={}", heroDao.code);
         return resultList;
      } else if (heroDao.talent.isEmpty()) {
         logger.info("武将没有天赋，code={}", heroDao.code);
         return resultList;
      } else {
         for(Map.Entry<Integer, List> entry : heroDao.talent.entrySet()) {
            if (((List)entry.getValue()).size() > 0) {
               int lv = (Integer)((List)entry.getValue()).get(0);
               if (lv > 0) {
                  TalentLevelModel talentLevelModel = (TalentLevelModel)this.player.getGameModelPool().getEntity("talentLevel", entry.getKey());
                  if (talentLevelModel != null && talentLevelModel.getStar() > 9) {
                     for(int i = 1; i <= lv; ++i) {
                        if (talentLevelModel.getConsume().keySet().contains(i)) {
                           ResourceModel.addResourceToList(resultList, (ResourceModel)talentLevelModel.getConsume().get(i));
                        }
                     }
                  }
               }
            }
         }

         return resultList;
      }
   }
}
