package com.gzbz.gamePlayer.heroPart;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.decisiveBattle.DecisiveHeroInfo;
import com.gzbz.activity.bean.decisiveBattle.DecisiveWarriorSinet;
import com.gzbz.db.CustomArrayingDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.arraying.ArtifactArrayingEntity;
import com.gzbz.db.arraying.AssistantBeauty;
import com.gzbz.db.arraying.BeautyArrayingEntity;
import com.gzbz.db.arraying.DragonArrayingEntity;
import com.gzbz.db.arraying.FriendArrayingEntity;
import com.gzbz.db.arraying.HeroArrayingEntity;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.HeroMirror;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.playerBag.OrnamentItem;
import com.gzbz.model.ArtifactModel;
import com.gzbz.model.ArtifactRefineModel;
import com.gzbz.model.ArtifactSkillModel;
import com.gzbz.model.ArtifactStrongModel;
import com.gzbz.model.DecisiveBattleHeroModel;
import com.gzbz.model.DecisiveBattleMainModel;
import com.gzbz.model.DecisiveDefaultWarriorsModel;
import com.gzbz.model.DecisiveStampModel;
import com.gzbz.model.DecisiveWarriorsPropertyModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.MagicBookModel;
import com.gzbz.model.MagicSkillModel;
import com.gzbz.model.StampBasicPropertyModel;
import com.gzbz.model.StampModel;
import com.gzbz.model.StarWithMaxLvModel;
import com.gzbz.model.SupportHeroModel;
import com.gzbz.model.TalentLevelModel;
import com.gzbz.model.TongQueSkillModel;
import com.gzbz.model.WarriorSignetModel;
import com.gzbz.model.WarriorSignetSkillLibModel;
import com.gzbz.model.WarriorSignetSkillModel;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.WarriorsExtraModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.Collections;
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
public class HeroCustomArrayingPart extends PlayerPart {
   private static Logger logger = LoggerFactory.getLogger(HeroCustomArrayingPart.class);
   public static final int ARRAYING_ARTIFACT = 1;
   public static final int ARRAYING_BEAUTY = 2;
   public static final int ARRAYING_FRIEND_NATION = 3;
   public static final int ARRAYING_FRIEND_JOB = 4;
   public static final int ARRAYING_FRIEND_STATE = 5;
   @Autowired
   ConfigManager configManager;

   public CustomArrayingDao getCustomArrayingDao() {
      return (CustomArrayingDao)this.player.getData("tb_custom_arraying", this.player.getPlayerId());
   }

   @MsgHandlerAnno
   public void C2S_SaveCustomArraying_5255(HeroMsg.C2S_SaveCustomArraying_5255 msg, String source) {
      CustomArrayingDao arrayingDao = this.getCustomArrayingDao();
      if (this.checkCanSaveArraying(msg, arrayingDao)) {
         int step = ApplicationContextProvider.getConfigInt("RecommendedForJueZhan", 4);
         DecisiveBattleMainModel mainModel = this.getMainModel();
         if (msg.getArrayingList().size() != mainModel.getSupportType()) {
            logger.error("保存阵容数量不对：{}---{}", msg.getArrayingList().size(), step);
         } else {
            for(HeroMsg.CustomArrayingInfo arrayingInfo : msg.getArrayingList()) {
               if (arrayingInfo.getHeroList().size() == 1 && ((HeroMsg.HeroPos)arrayingInfo.getHeroList().get(0)).getPos() == 5) {
                  return;
               }

               for(HeroMsg.HeroPos hero : arrayingInfo.getHeroList()) {
                  DecisiveHeroInfo heroInfo = this.getHeroInfoByCode(hero.getCode(), true);
                  HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroInfo.heroId);
                  if (heroModel == null) {
                     this.player.failure(0);
                     return;
                  }

                  if (heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_LINK) {
                     this.player.failure(76505);
                     return;
                  }

                  if (heroModel.getNation() == 10 && heroInfo.inheritNation <= 0) {
                     this.player.failure(76414);
                     return;
                  }
               }
            }

            for(HeroMsg.CustomArrayingInfo arrayingInfo : msg.getArrayingList()) {
               CustomArrayingDao.ArrayingInfo arraying;
               if (arrayingDao.arrayingMap.containsKey(arrayingInfo.getArrayingType())) {
                  arraying = (CustomArrayingDao.ArrayingInfo)arrayingDao.arrayingMap.get(arrayingInfo.getArrayingType());
               } else {
                  arraying = new CustomArrayingDao.ArrayingInfo();
               }

               arraying.heroMap.clear();

               for(HeroMsg.HeroPos hero : arrayingInfo.getHeroList()) {
                  arraying.heroMap.put(hero.getPos(), hero.getCode());
               }

               arraying.friendJob = arrayingInfo.getFriendJob();
               arraying.friendState = arrayingInfo.getFriendState();
               arraying.friendNation = arrayingInfo.getFriendNation();
               arrayingDao.arrayingMap.put(arrayingInfo.getArrayingType(), arraying);
            }

            arrayingDao.updateOp();
            this.flushFriendHero();
            this.checkArrayingByStep();
            this.sendArraying();
         }
      }
   }

   public void sendArraying() {
      CustomArrayingDao arrayingDao = this.getCustomArrayingDao();
      List<Integer> codeList = new ArrayList();
      HeroMsg.S2C_SaveCustomArraying_5256.Builder builder = HeroMsg.S2C_SaveCustomArraying_5256.newBuilder();

      for(Map.Entry<CommonMsg.HeroState, CustomArrayingDao.ArrayingInfo> entry : arrayingDao.arrayingMap.entrySet()) {
         for(Integer code : ((CustomArrayingDao.ArrayingInfo)entry.getValue()).heroMap.values()) {
            codeList.add(code);
         }

         ArrayingMirror mirror = this.getArrayingMirror((CustomArrayingDao.ArrayingInfo)entry.getValue());
         mirror.arrayingType = ((CommonMsg.HeroState)entry.getKey()).getNumber();
         mirror.soulHeroCode = ((CustomArrayingDao.ArrayingInfo)entry.getValue()).soulHeroCode;
         builder.addArraying(mirror.toPlayerArrayingInfo());
      }

      this.player.sendMsg(builder.build());
      if (!codeList.isEmpty()) {
         this.notifyHeroInfo(codeList, HeroMsg.NotifyReason.WARCRAFT_CUSTOM);
      }

   }

   public Boolean checkCanSaveArraying(HeroMsg.C2S_SaveCustomArraying_5255 msg, CustomArrayingDao arrayingDao) {
      Set<Integer> heroSet = new HashSet();
      Map<Integer, DecisiveBattleHeroModel> heroModelMap = this.player.getGameModelPool().getMap("DecisiveBattleHero");

      for(HeroMsg.CustomArrayingInfo arrayingInfo : msg.getArrayingList()) {
         Set<Integer> posSet = new HashSet();

         for(HeroMsg.HeroPos hero : arrayingInfo.getHeroList()) {
            int code = hero.getCode();
            int pos = hero.getPos();
            DecisiveBattleHeroModel decisiveBattleHeroModel = (DecisiveBattleHeroModel)this.player.getGameModelPool().getEntity("DecisiveBattleHero", code);
            if (!heroModelMap.containsKey(code)) {
               return false;
            }

            HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", decisiveBattleHeroModel.getHeroId());
            if (heroModel == null) {
               return false;
            }

            if (heroSet.contains(decisiveBattleHeroModel.getHeroId()) || posSet.contains(pos) || pos > 5 || pos < 0) {
               return false;
            }

            posSet.add(pos);
            heroSet.add(decisiveBattleHeroModel.getHeroId());
         }
      }

      return true;
   }

   @MsgHandlerAnno
   public void C2S_HeroInfo_5264(HeroMsg.C2S_HeroInfo_5264 msg, String source) {
      this.notifyHeroInfo(msg.getCodeList(), HeroMsg.NotifyReason.HERO_INFO_REQ);
   }

   @MsgHandlerAnno
   public void C2S_CustomArrayingInfo_5253(HeroMsg.C2S_CustomArrayingInfo_5253 msg, String source) {
      CustomArrayingDao arrayingDao = this.getCustomArrayingDao();
      int step = ApplicationContextProvider.getConfigInt("RecommendedForJueZhan", 4);
      HeroMsg.S2C_CustomArrayingInfo_5254.Builder builder = HeroMsg.S2C_CustomArrayingInfo_5254.newBuilder();
      builder.setStep(step);
      int limitStar = this.configManager.getIntDefault("SoulHeroLimitStar", 9);

      for(Map.Entry<CommonMsg.HeroState, CustomArrayingDao.ArrayingInfo> entry : arrayingDao.arrayingMap.entrySet()) {
         ArrayingMirror mirror = this.getArrayingMirror((CustomArrayingDao.ArrayingInfo)entry.getValue());
         mirror.arrayingType = ((CommonMsg.HeroState)entry.getKey()).getNumber();
         mirror.soulHeroCode = ((CustomArrayingDao.ArrayingInfo)entry.getValue()).soulHeroCode;
         if (((CustomArrayingDao.ArrayingInfo)entry.getValue()).soulHeroCode > 0) {
            DecisiveHeroInfo heroInfo = this.getHeroInfoByCode(((CustomArrayingDao.ArrayingInfo)entry.getValue()).soulHeroCode, false);
            int star = this.getStarMax(heroInfo.code, step);
            if (star >= limitStar) {
               mirror.soulHeroId = heroInfo.heroId;
            }
         }

         builder.addArraying(mirror.toPlayerArrayingInfo());
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_SaveExtraArrayingInfo_5262(HeroMsg.C2S_SaveExtraArrayingInfo_5262 msg, String source) {
      CustomArrayingDao arrayingDao = this.getCustomArrayingDao();
      int opValue = msg.getOpValue();
      if (opValue == 0) {
         if (!arrayingDao.arrayingMap.containsKey(msg.getArrayingType())) {
            return;
         }

         if (msg.getOpType() == 1) {
            ((CustomArrayingDao.ArrayingInfo)arrayingDao.arrayingMap.get(msg.getArrayingType())).artifactId = opValue;
         } else if (msg.getOpType() == 2) {
            ((CustomArrayingDao.ArrayingInfo)arrayingDao.arrayingMap.get(msg.getArrayingType())).beautyId = opValue;
         } else if (msg.getOpType() == 3) {
            ((CustomArrayingDao.ArrayingInfo)arrayingDao.arrayingMap.get(msg.getArrayingType())).friendNation = opValue;
         } else if (msg.getOpType() == 4) {
            ((CustomArrayingDao.ArrayingInfo)arrayingDao.arrayingMap.get(msg.getArrayingType())).friendJob = opValue;
         } else {
            if (msg.getOpType() != 5) {
               return;
            }

            ((CustomArrayingDao.ArrayingInfo)arrayingDao.arrayingMap.get(msg.getArrayingType())).friendState = opValue;
         }
      } else {
         if (msg.getOpType() == 1) {
            ArtifactModel artifactModel = (ArtifactModel)this.player.getGameModelPool().getEntity("artifact", opValue);
            if (artifactModel == null) {
               return;
            }
         } else if (msg.getOpType() == 2) {
            DecisiveBattleMainModel mainModel = this.getMainModel();
            if (!mainModel.getTongQueId().contains(msg.getOpValue())) {
               return;
            }

            if (arrayingDao.beautyList.contains(msg.getOpValue()) && (Integer)arrayingDao.beautyList.get(0) != msg.getOpValue()) {
               logger.error("该美人已在同心策中：{}", msg.getOpValue());
               return;
            }
         } else if (msg.getOpType() == 4) {
            if (opValue < 1 || opValue > 5) {
               return;
            }
         } else if (msg.getOpType() == 3 && (opValue > 5 || opValue < 0)) {
            return;
         }

         for(Map.Entry<CommonMsg.HeroState, CustomArrayingDao.ArrayingInfo> entry : arrayingDao.arrayingMap.entrySet()) {
            if (entry.getKey() != msg.getArrayingType() && msg.getOpType() == 1 && ((CustomArrayingDao.ArrayingInfo)entry.getValue()).artifactId == opValue) {
               logger.error("该神兵已在其他阵容上");
               return;
            }
         }

         CustomArrayingDao.ArrayingInfo arraying;
         if (arrayingDao.arrayingMap.containsKey(msg.getArrayingType())) {
            arraying = (CustomArrayingDao.ArrayingInfo)arrayingDao.arrayingMap.get(msg.getArrayingType());
         } else {
            arraying = new CustomArrayingDao.ArrayingInfo();
            arrayingDao.arrayingMap.put(msg.getArrayingType(), arraying);
         }

         if (msg.getOpType() == 1) {
            arraying.artifactId = opValue;
         } else if (msg.getOpType() == 2) {
            arraying.beautyId = opValue;
         } else if (msg.getOpType() == 3) {
            arraying.friendNation = opValue;
         } else if (msg.getOpType() == 4) {
            arraying.friendJob = opValue;
         } else {
            if (msg.getOpType() != 5) {
               return;
            }

            arraying.friendState = opValue;
         }
      }

      arrayingDao.updateOp();
      HeroMsg.S2C_SaveExtraArrayingInfo_5263.Builder builder = HeroMsg.S2C_SaveExtraArrayingInfo_5263.newBuilder();
      builder.setArrayingType(msg.getArrayingType());
      builder.setOpType(msg.getOpType());
      builder.setOpValue(msg.getOpValue());
      this.player.sendMsg(builder.build());
      if (msg.getOpType() == 4 || msg.getOpType() == 3) {
         this.initOtherProperty();
         List<Integer> codeList = new ArrayList();
         if (arrayingDao.arrayingMap.containsKey(msg.getArrayingType())) {
            for(Integer code : ((CustomArrayingDao.ArrayingInfo)arrayingDao.arrayingMap.get(msg.getArrayingType())).heroMap.values()) {
               codeList.add(code);
            }
         }

         if (!codeList.isEmpty()) {
            this.notifyHeroInfo(codeList, HeroMsg.NotifyReason.WARCRAFT_CUSTOM);
         }
      }

   }

   public DecisiveBattleMainModel getMainModel() {
      int step = ApplicationContextProvider.getConfigInt("RecommendedForJueZhan", 4);
      return (DecisiveBattleMainModel)this.player.getGameModelPool().getEntity("DecisiveBattleMain", step);
   }

   @MsgHandlerAnno
   public void C2S_SaveMagicBook_5259(HeroMsg.C2S_SaveMagicBook_5259 msg, String source) {
      CustomArrayingDao arrayingDao = this.getCustomArrayingDao();
      DecisiveBattleMainModel mainModel = this.getMainModel();
      MagicBookModel magicBookModel = (MagicBookModel)this.player.getGameModelPool().getEntity("MysticBook", mainModel.getMysticBookId());
      if (magicBookModel != null) {
         if (msg.getMagicsList().size() <= magicBookModel.getStage()) {
            List<Integer> tempList = new ArrayList();
            List<Integer> posList = new ArrayList();

            for(CommonMsg.MagicInfo magicInfo : msg.getMagicsList()) {
               if (magicInfo.getPosition() < 1) {
                  return;
               }

               MagicSkillModel skillModel = (MagicSkillModel)this.player.getGameModelPool().getEntity("MysticSkill", magicInfo.getSkillId());
               if (skillModel == null) {
                  return;
               }

               if (!mainModel.getMysticBookClass().contains(magicInfo.getSkillId())) {
                  logger.error("当前段位未解锁该技能：{}", magicInfo.getSkillId());
                  return;
               }

               if (posList.contains(magicInfo.getPosition())) {
                  return;
               }

               if (tempList.contains(magicInfo.getSkillId())) {
                  return;
               }

               posList.add(magicInfo.getPosition());
               tempList.add(magicInfo.getSkillId());
            }

            arrayingDao.magicBook.clear();

            for(CommonMsg.MagicInfo info : msg.getMagicsList()) {
               arrayingDao.magicBook.put(info.getPosition(), info.getSkillId());
            }

            arrayingDao.updateOp();
            this.sendMagicBookInfo();
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_CustomMagicBookInfo_5257(HeroMsg.C2S_CustomMagicBookInfo_5257 msg, String source) {
      this.sendMagicBookInfo();
   }

   public void sendMagicBookInfo() {
      CustomArrayingDao arrayingDao = this.getCustomArrayingDao();
      HeroMsg.S2C_CustomMagicBookInfo_5258.Builder builder = HeroMsg.S2C_CustomMagicBookInfo_5258.newBuilder();

      for(Map.Entry<Integer, Integer> entry : arrayingDao.magicBook.entrySet()) {
         CommonMsg.MagicInfo.Builder info = CommonMsg.MagicInfo.newBuilder();
         info.setPosition((Integer)entry.getKey());
         info.setSkillId((Integer)entry.getValue());
         builder.addMagics(info);
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_WearWarriorSignet_5266(HeroMsg.C2S_WearWarriorSignet_5266 msg, String source) {
      CustomArrayingDao arrayingDao = this.getCustomArrayingDao();
      DecisiveBattleHeroModel decisiveBattleHeroModel = (DecisiveBattleHeroModel)this.player.getGameModelPool().getEntity("DecisiveBattleHero", msg.getCode());
      if (decisiveBattleHeroModel != null) {
         HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", decisiveBattleHeroModel.getHeroId());
         if (heroModel != null) {
            DecisiveBattleMainModel mainModel = this.getMainModel();
            if (mainModel.getHeroStarLimit() >= this.configManager.getInt("soulSlotUnlock2") || msg.getWarriorInfo().getPosition().getNumber() != 6) {
               int warriorId = msg.getWarriorInfo().getId();
               if (mainModel.getWarriorSignetLimit() != warriorId) {
                  logger.error("所定制的将印id错误：{}", warriorId);
               } else {
                  DecisiveWarriorsPropertyModel warriorsPropertyModel = (DecisiveWarriorsPropertyModel)this.player.getGameModelPool().getEntity("DecisiveWarriorsProperty", warriorId);
                  if (warriorsPropertyModel != null) {
                     String[] commonProList = warriorsPropertyModel.getProperties().split(",");
                     List<PropertyModel> tempList = new ArrayList();
                     int numFlag = 0;

                     for(CommonMsg.PropertyInfo proInfo : msg.getWarriorInfo().getPropertyList()) {
                        for(int i = 0; i < tempList.size(); ++i) {
                           if (proInfo.getId() == ((PropertyModel)tempList.get(i)).getType() && proInfo.getWay() == ((PropertyModel)tempList.get(i)).getWay()) {
                              logger.error("定制的将印有相同属性：{}--{}--{}", new Object[]{proInfo.getId(), proInfo.getWay(), (long)proInfo.getValue()});
                              return;
                           }
                        }

                        ++numFlag;
                        if (numFlag == 1) {
                           Boolean flag = false;

                           for(int i = 0; i < commonProList.length; ++i) {
                              String[] commonPro = commonProList[i].split("\\|");
                              if (proInfo.getId() == Integer.parseInt(commonPro[0]) && proInfo.getWay() == Integer.parseInt(commonPro[1]) && (long)proInfo.getValue() == Long.parseLong(commonPro[2])) {
                                 flag = true;
                                 break;
                              }
                           }

                           if (!flag) {
                              logger.error("定制的属性错误：{}--{}--{}", new Object[]{proInfo.getId(), proInfo.getWay(), (long)proInfo.getValue()});
                              return;
                           }

                           tempList.add(new PropertyModel(proInfo.getId(), proInfo.getWay(), (long)proInfo.getValue()));
                        } else if (numFlag == 2 && warriorsPropertyModel.getPercentProperties() != null && !warriorsPropertyModel.getPercentProperties().isEmpty()) {
                           int flag = 0;
                           String[] persentProList = warriorsPropertyModel.getPercentProperties().split(",");

                           for(int i = 0; i < persentProList.length; ++i) {
                              PropertyModel pro = this.getProModelByString(persentProList[i]);
                              if (proInfo.getId() == pro.getType() && proInfo.getWay() == pro.getWay() && (long)proInfo.getValue() == pro.getValue()) {
                                 ++flag;
                              }
                           }

                           if (flag != 1) {
                              logger.error("将印定制百分比属性有问题：{}--{}--{}", new Object[]{proInfo.getId(), proInfo.getWay(), proInfo.getValue()});
                              return;
                           }
                        }
                     }

                     if (msg.getWarriorInfo().getSkillsList().size() == 2) {
                        WarriorSignetModel signetModel = (WarriorSignetModel)this.player.getGameModelPool().getEntity("warriorSignet", msg.getWarriorInfo().getId());
                        Map<Integer, WarriorSignetSkillLibModel> modelMap = this.player.getGameModelPool().getMap("warriorSignetSkillLib");
                        if (signetModel != null) {
                           List<Integer> skillList1 = new ArrayList();
                           List<Integer> skillList2 = new ArrayList();

                           for(WarriorSignetSkillLibModel libModel : modelMap.values()) {
                              if (signetModel.getSkill2_1() == libModel.getGroupId()) {
                                 skillList1.add(libModel.getSkillId());
                              } else if (signetModel.getSkill2_2() == libModel.getGroupId()) {
                                 skillList2.add(libModel.getSkillId());
                              }
                           }

                           if (skillList1.contains(msg.getWarriorInfo().getSkillsList().get(0)) && skillList2.contains(msg.getWarriorInfo().getSkillsList().get(1))) {
                              DecisiveWarriorSinet signet = new DecisiveWarriorSinet();
                              signet.id = msg.getWarriorInfo().getId();

                              for(CommonMsg.PropertyInfo info : msg.getWarriorInfo().getPropertyList()) {
                                 signet.properties.add(new PropertyModel(info.getId(), info.getWay(), (long)info.getValue()));
                              }

                              signet.skills.addAll(msg.getWarriorInfo().getSkillsList());
                              signet.score = this.getWarriorScore(signet, mainModel);
                              DecisiveHeroInfo heroInfo = this.getHeroInfoByCode(msg.getCode(), true);
                              heroInfo.warriorSignetMap.put(msg.getWarriorInfo().getPosition(), signet);
                              arrayingDao.updateOp();
                              HeroMsg.S2C_WearWarriorSignet_5267.Builder builder = HeroMsg.S2C_WearWarriorSignet_5267.newBuilder();
                              builder.setCode(msg.getCode());
                              this.player.sendMsg(builder.build());
                              List<Integer> flushList = new ArrayList();
                              flushList.add(msg.getCode());
                              this.notifyHeroInfo(flushList, HeroMsg.NotifyReason.WARRIOR_SIGNET_CUSTOM);
                           } else {
                              logger.error("将印定制技能有问题：{}---{}", msg.getWarriorInfo().getSkillsList().get(0), msg.getWarriorInfo().getSkillsList().get(1));
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void checkDefaultWarrior(DecisiveHeroInfo heroInfo, int step) {
      int limitWarriorNum = 1;
      DecisiveBattleMainModel mainModel = this.getMainModel();
      if (mainModel.getHeroStarLimit() >= this.configManager.getInt("soulSlotUnlock2")) {
         limitWarriorNum = 2;
      }

      HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroInfo.heroId);
      if (heroModel != null) {
         DecisiveDefaultWarriorsModel model = this.getDefaultWarriorModel(step, heroModel.getType());
         if (model != null) {
            if (heroInfo.warriorSignetMap.get(CommonMsg.WearPosition.WEARPOSITION_WARRIORSIGNET_1) == null) {
               heroInfo.warriorSignetMap.remove(CommonMsg.WearPosition.WEARPOSITION_WARRIORSIGNET_1);
            }

            if (heroInfo.warriorSignetMap.get(CommonMsg.WearPosition.WEARPOSITION_WARRIORSIGNET_2) == null) {
               heroInfo.warriorSignetMap.remove(CommonMsg.WearPosition.WEARPOSITION_WARRIORSIGNET_2);
            }

            if (limitWarriorNum == 1) {
               this.calcWarrior(heroInfo, CommonMsg.WearPosition.WEARPOSITION_WARRIORSIGNET_1, model, mainModel);
               if (heroInfo.warriorSignetMap.containsKey(CommonMsg.WearPosition.WEARPOSITION_WARRIORSIGNET_2)) {
                  heroInfo.warriorSignetMap.remove(CommonMsg.WearPosition.WEARPOSITION_WARRIORSIGNET_2);
               }
            } else {
               this.calcWarrior(heroInfo, CommonMsg.WearPosition.WEARPOSITION_WARRIORSIGNET_1, model, mainModel);
               this.calcWarrior(heroInfo, CommonMsg.WearPosition.WEARPOSITION_WARRIORSIGNET_2, model, mainModel);
            }

         }
      }
   }

   public void calcWarrior(DecisiveHeroInfo heroInfo, CommonMsg.WearPosition pos, DecisiveDefaultWarriorsModel model, DecisiveBattleMainModel mainModel) {
      if (!heroInfo.warriorSignetMap.containsKey(pos)) {
         this.addOneWarrior(pos, model, heroInfo, mainModel);
      } else if (heroInfo.warriorSignetMap.get(pos) == null) {
         heroInfo.warriorSignetMap.remove(pos);
         this.addOneWarrior(pos, model, heroInfo, mainModel);
      } else {
         this.calcWarriorByStep(mainModel, (DecisiveWarriorSinet)heroInfo.warriorSignetMap.get(pos));
      }

   }

   public void calcWarriorByStep(DecisiveBattleMainModel mainModel, DecisiveWarriorSinet signet) {
      if (signet.id != mainModel.getWarriorSignetLimit()) {
         DecisiveWarriorsPropertyModel propertyModel = (DecisiveWarriorsPropertyModel)this.player.getGameModelPool().getEntity("DecisiveWarriorsProperty", mainModel.getWarriorSignetLimit());
         if (propertyModel == null) {
            return;
         }

         String[] commonProList = propertyModel.getProperties().split(",");
         List<PropertyModel> tempList = new ArrayList();

         for(PropertyModel property : signet.properties) {
            for(int i = 0; i < commonProList.length; ++i) {
               PropertyModel pro = this.getProModelByString(commonProList[i]);
               if (property.getWay() == pro.getWay() && property.getType() == pro.getType()) {
                  tempList.add(pro);
                  break;
               }
            }
         }

         if (propertyModel.getPercentProperties() != null && !propertyModel.getPercentProperties().isEmpty()) {
            String[] persentProList = propertyModel.getPercentProperties().split(",");
            PropertyModel pro = this.getProModelByString(persentProList[RandomUtil.randInt(0, persentProList.length)]);
            tempList.add(new PropertyModel(pro.getType(), pro.getWay(), pro.getValue()));
         }

         signet.properties.clear();
         signet.properties.addAll(tempList);
         List<Integer> tempSkill = new ArrayList();

         for(Integer skill : signet.skills) {
            WarriorSignetSkillModel skillModel = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", skill);
            if (skillModel != null) {
               if (signet.id > mainModel.getWarriorSignetLimit()) {
                  if (skillModel.getLastId() > 0) {
                     tempSkill.add(skillModel.getLastId());
                  } else {
                     logger.error("将印技能变换有问题：{}--{}----{}", new Object[]{signet.id, mainModel.getWarriorSignetLimit(), skillModel.getId()});
                     tempSkill.add(skill);
                  }
               } else if (skillModel.getNextId() > 0) {
                  tempSkill.add(skillModel.getNextId());
               } else {
                  logger.error("将印技能变换有问题：{}--{}----{}", new Object[]{signet.id, mainModel.getWarriorSignetLimit(), skillModel.getId()});
                  tempSkill.add(skill);
               }
            }
         }

         signet.skills.clear();
         signet.skills.addAll(tempSkill);
         signet.id = mainModel.getWarriorSignetLimit();
         int score = this.getWarriorScore(signet, mainModel);
         signet.score = score;
      }

   }

   public void addOneWarrior(CommonMsg.WearPosition pos, DecisiveDefaultWarriorsModel model, DecisiveHeroInfo heroInfo, DecisiveBattleMainModel mainModel) {
      DecisiveWarriorSinet signet = this.getOneWarriorSignet(model, pos);
      if (signet != null) {
         int score = this.getWarriorScore(signet, mainModel);
         signet.score = score;
         heroInfo.warriorSignetMap.put(pos, signet);
      }
   }

   public DecisiveWarriorSinet getOneWarriorSignet(DecisiveDefaultWarriorsModel warriorsModel, CommonMsg.WearPosition wearPosition) {
      DecisiveWarriorSinet signet = new DecisiveWarriorSinet();
      if (warriorsModel.getWarriors().size() != 2) {
         logger.error("对决之巅将印配置有问题:{}", warriorsModel.getClass().getSimpleName());
         return null;
      } else {
         WarriorsExtraModel model;
         if (wearPosition == CommonMsg.WearPosition.WEARPOSITION_WARRIORSIGNET_1) {
            model = (WarriorsExtraModel)warriorsModel.getWarriors().get(0);
         } else {
            model = (WarriorsExtraModel)warriorsModel.getWarriors().get(1);
         }

         signet.id = model.getId();
         this.addWarriorOnePro(signet, model, false);
         this.addWarriorOnePro(signet, model, true);
         String[] skill = model.getSkills().split("\\|");

         for(int i = 0; i < skill.length; ++i) {
            signet.skills.add(Integer.parseInt(skill[i]));
         }

         return signet;
      }
   }

   public void addWarriorOnePro(DecisiveWarriorSinet signet, WarriorsExtraModel model, Boolean isPercent) {
      if (isPercent) {
         if (model.getPercentproperties() != null) {
            signet.properties.add(this.getProModelByString(model.getPercentproperties()));
         }
      } else {
         signet.properties.add(this.getProModelByString(model.getProperties()));
      }

   }

   public PropertyModel getProModelByString(String proStr) {
      String[] pro = proStr.split("\\|");
      PropertyModel model = new PropertyModel(Integer.parseInt(pro[0]), Integer.parseInt(pro[1]), (long)Integer.parseInt(pro[2]));
      return model;
   }

   public int getWarriorScore(DecisiveWarriorSinet signet, DecisiveBattleMainModel mainModel) {
      int score = 0;
      DecisiveWarriorsPropertyModel model = (DecisiveWarriorsPropertyModel)this.player.getGameModelPool().getEntity("DecisiveWarriorsProperty", signet.id);
      if (model == null) {
         logger.error("获取将印评分有问题：{}", signet);
         return 0;
      } else {
         score += this.getWarriorProScore(model, signet.properties);

         for(Integer skillId : signet.skills) {
            WarriorSignetSkillModel skillModel = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", skillId);
            if (skillModel != null) {
               score += skillModel.getPower();
            }
         }

         return score;
      }
   }

   public int getWarriorProScore(DecisiveWarriorsPropertyModel model, List<PropertyModel> signetProList) {
      int score = 0;
      String[] commonList = model.getProperties().split(",");
      int flag = 0;

      for(PropertyModel pro : signetProList) {
         ++flag;
         if (flag == 1) {
            for(int i = 0; i < commonList.length; ++i) {
               String[] realPro = commonList[i].split("\\|");
               if (pro.getType() == Integer.parseInt(realPro[0]) && pro.getWay() == Integer.parseInt(realPro[1]) && pro.getValue() == (long)Integer.parseInt(realPro[2]) && model.getPropertiesScore().size() > i) {
                  score += (Integer)model.getPropertiesScore().get(i);
                  break;
               }
            }
         } else if (flag == 2 && model.getPercentProperties() != null && model.getPercentPropertiesScore() != null) {
            String[] percentList = model.getPercentProperties().split(",");

            for(int i = 0; i < percentList.length; ++i) {
               String[] realPro = percentList[i].split("\\|");
               if (pro.getType() == Integer.parseInt(realPro[0]) && pro.getWay() == Integer.parseInt(realPro[1]) && pro.getValue() == (long)Integer.parseInt(realPro[2]) && model.getPercentPropertiesScore().size() > i) {
                  score += (Integer)model.getPercentPropertiesScore().get(i);
                  break;
               }
            }
         }
      }

      return score;
   }

   public DecisiveDefaultWarriorsModel getDefaultWarriorModel(int step, int type) {
      Map<Integer, DecisiveDefaultWarriorsModel> modelMap = this.player.getGameModelPool().getMap("DecisiveDefaultWarriors");

      for(DecisiveDefaultWarriorsModel model : modelMap.values()) {
         if (model.getRankId() == step && model.getType() == type) {
            return model;
         }
      }

      return null;
   }

   @MsgHandlerAnno
   public void C2S_SaveTalentSkill_5273(HeroMsg.C2S_SaveTalentSkill_5273 msg, String source) {
      CustomArrayingDao arrayingDao = this.getCustomArrayingDao();
      int step = ApplicationContextProvider.getConfigInt("RecommendedForJueZhan", 4);
      DecisiveHeroInfo heroInfo = this.getHeroInfoByCode(msg.getHeroCode(), false);
      TalentLevelModel talentLevelModel = (TalentLevelModel)this.player.getGameModelPool().getEntity("talentLevel", msg.getPosition().getNumber());
      if (talentLevelModel == null) {
         logger.info("武将天赋配置表为空，id={}", msg.getPosition());
      } else {
         int limitStar = this.getStarMax(heroInfo.code, step);
         if (limitStar < talentLevelModel.getStar()) {
            logger.info("替换天赋星级不足：{}--{}", limitStar, msg.getPosition());
         } else if (msg.getIndex() >= 0 && msg.getIndex() <= 2) {
            heroInfo.talent.put(msg.getPosition().getNumber(), msg.getIndex());
            arrayingDao.updateOp();
            this.notifyHeroInfo(msg.getHeroCode(), HeroMsg.NotifyReason.WARCRAFT_CUSTOM);
            HeroMsg.S2C_SaveTalentSkill_5274.Builder builder = HeroMsg.S2C_SaveTalentSkill_5274.newBuilder();
            builder.setHeroCode(msg.getHeroCode());
            builder.setIndex(msg.getIndex());
            builder.setPosition(msg.getPosition());
            this.player.sendMsg(builder.build());
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_SaveOrnament_5275(HeroMsg.C2S_SaveOrnament_5275 msg, String source) {
      CustomArrayingDao arrayingDao = this.getCustomArrayingDao();
      int step = ApplicationContextProvider.getConfigInt("RecommendedForJueZhan", 4);
      DecisiveHeroInfo heroInfo = this.getHeroInfoByCode(msg.getHeroCode(), false);
      StampModel stampModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", msg.getExchangeId());
      if (stampModel != null) {
         DecisiveBattleMainModel mainModel = this.getMainModel();
         if (stampModel.getStar() <= mainModel.getStampStar() && stampModel.getQuality() == mainModel.getStampQuality()) {
            StampBasicPropertyModel basicPropertyModel = (StampBasicPropertyModel)this.player.getGameModelPool().getEntity("StampBasicProperty", stampModel.getBasicPropertyType());
            if (basicPropertyModel.getStampType() != 1 || msg.getPosition() == CommonMsg.WearPosition.WEARPOSITION_ORANMENT_1) {
               if (basicPropertyModel.getStampType() != 2 || msg.getPosition() == CommonMsg.WearPosition.WEARPOSITION_ORANMENT_2) {
                  if (basicPropertyModel.getStampType() != 3 || msg.getPosition() == CommonMsg.WearPosition.WEARPOSITION_ORANMENT_3) {
                     if (basicPropertyModel.getStampType() != 4 || msg.getPosition() == CommonMsg.WearPosition.WEARPOSITION_ORANMENT_4) {
                        OrnamentItem ornamentItem = this.createOrnamentById(stampModel.getId());
                        heroInfo.ornament.put(msg.getPosition().getNumber(), ornamentItem);
                        arrayingDao.updateOp();
                        this.notifyHeroInfo(msg.getHeroCode(), HeroMsg.NotifyReason.WARCRAFT_CUSTOM);
                        HeroMsg.S2C_SaveOrnament_5276.Builder builder = HeroMsg.S2C_SaveOrnament_5276.newBuilder();
                        builder.setExchangeId(msg.getExchangeId());
                        builder.setHeroCode(msg.getHeroCode());
                        builder.setPosition(msg.getPosition());
                        int star = this.getStarMax(msg.getHeroCode(), step);
                        HeroDao heroDao = heroInfo.getHeroDao(msg.getHeroCode(), this.getHeroLv(star), star, this.player.getPlayerId());
                        if (!heroDao.getOrnametProperty().isEmpty()) {
                           for(int i = 1; i < HeroDefine.map.size() + 1; ++i) {
                              if (heroDao.getOrnametProperty().get(i) != null) {
                                 builder.addProAll(((Long)heroDao.getOrnametProperty().get(i)).intValue());
                              } else {
                                 builder.addProAll(0);
                              }
                           }
                        }

                        this.player.sendMsg(builder.build());
                     }
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_WearWarcraft_5268(HeroMsg.C2S_WearWarcraft_5268 msg, String source) {
      CustomArrayingDao arrayingDao = this.getCustomArrayingDao();
      int step = ApplicationContextProvider.getConfigInt("RecommendedForJueZhan", 4);
      DecisiveBattleMainModel mainModel = this.getMainModel();
      int heroStar = this.getStarMax(msg.getCode(), step);
      int limitStar = 0;
      if (msg.getWarcraft().getPosition() == CommonMsg.WearPosition.WEARPOSITION_WARCRAFT_1) {
         limitStar = this.configManager.getInt("tacticsSlotUnlock1");
      } else if (msg.getWarcraft().getPosition() == CommonMsg.WearPosition.WEARPOSITION_WARCRAFT_2) {
         limitStar = this.configManager.getInt("tacticsSlotUnlock2");
      } else if (msg.getWarcraft().getPosition() == CommonMsg.WearPosition.WEARPOSITION_WARCRAFT_3) {
         limitStar = this.configManager.getIntDefault("tacticsSlotUnlock3", 13);
      } else {
         if (msg.getWarcraft().getPosition() != CommonMsg.WearPosition.WEARPOSITION_WARCRAFT_4) {
            logger.error("定制兵法位置错误：{}", msg.getWarcraft().getPosition());
            return;
         }

         limitStar = this.configManager.getIntDefault("tacticsSlotUnlock4", 14);
      }

      if (heroStar < limitStar) {
         logger.error("该武将未解锁兵书空位：{}---{}---{}", new Object[]{msg.getCode(), msg.getWarcraft().getPosition(), heroStar});
      } else {
         Map<Integer, WarriorSignetSkillModel> modelMap = this.player.getGameModelPool().getMap("warriorSignetSkill");
         List<Integer> tempList = new ArrayList();

         for(WarriorSignetSkillModel skillModel : modelMap.values()) {
            if (skillModel.getLv() == mainModel.getWarcraftLimit()) {
               tempList.add(skillModel.getId());
            }
         }

         if (!tempList.isEmpty() && tempList.contains(msg.getWarcraft().getId())) {
            DecisiveHeroInfo heroInfo = this.getHeroInfoByCode(msg.getCode(), true);

            for(Map.Entry<CommonMsg.WearPosition, Integer> entry : heroInfo.warcraftMap.entrySet()) {
               if (this.isSameBaseSkill((Integer)entry.getValue(), msg.getWarcraft().getId())) {
                  logger.error("已有相同技能兵法：{}---{}", entry.getKey(), entry.getValue());
                  return;
               }
            }

            heroInfo.warcraftMap.put(msg.getWarcraft().getPosition(), msg.getWarcraft().getId());
            arrayingDao.updateOp();
            HeroMsg.S2C_WearWarcraft_5269.Builder builder = HeroMsg.S2C_WearWarcraft_5269.newBuilder();
            builder.setCode(msg.getCode());
            this.player.sendMsg(builder.build());
            List<Integer> flushList = new ArrayList();
            flushList.add(msg.getCode());
            this.notifyHeroInfo(flushList, HeroMsg.NotifyReason.WARRIOR_SIGNET_CUSTOM);
         } else {
            logger.error("兵法定制技能错误：{}--{}", msg.getWarcraft().getPosition());
         }
      }
   }

   public void checkDefaultWarcraft(DecisiveHeroInfo heroInfo) {
      CustomArrayingDao arrayingDao = this.getCustomArrayingDao();
      int step = ApplicationContextProvider.getConfigInt("RecommendedForJueZhan", 4);
      int heroStar = this.getStarMax(heroInfo.code, step);
      if (heroStar >= this.configManager.getInt("tacticsSlotUnlock1")) {
         this.clacWarcraftSkill(heroInfo, CommonMsg.WearPosition.WEARPOSITION_WARCRAFT_1, step);
      } else {
         this.removeWarcraftByPos(heroInfo, CommonMsg.WearPosition.WEARPOSITION_WARCRAFT_1);
      }

      if (heroStar >= this.configManager.getInt("tacticsSlotUnlock2")) {
         this.clacWarcraftSkill(heroInfo, CommonMsg.WearPosition.WEARPOSITION_WARCRAFT_2, step);
      } else {
         this.removeWarcraftByPos(heroInfo, CommonMsg.WearPosition.WEARPOSITION_WARCRAFT_2);
      }

      if (heroStar >= this.configManager.getIntDefault("tacticsSlotUnlock3", 13)) {
         this.clacWarcraftSkill(heroInfo, CommonMsg.WearPosition.WEARPOSITION_WARCRAFT_3, step);
      } else {
         this.removeWarcraftByPos(heroInfo, CommonMsg.WearPosition.WEARPOSITION_WARCRAFT_3);
      }

      if (heroStar >= this.configManager.getIntDefault("tacticsSlotUnlock4", 14)) {
         this.clacWarcraftSkill(heroInfo, CommonMsg.WearPosition.WEARPOSITION_WARCRAFT_4, step);
      } else {
         this.removeWarcraftByPos(heroInfo, CommonMsg.WearPosition.WEARPOSITION_WARCRAFT_4);
      }

      arrayingDao.updateOp();
   }

   public void clacWarcraftSkill(DecisiveHeroInfo heroInfo, CommonMsg.WearPosition position, int step) {
      DecisiveBattleMainModel mainModel = this.getMainModel();
      if (heroInfo.warcraftMap.containsKey(position)) {
         int skillId = (Integer)heroInfo.warcraftMap.get(position);
         WarriorSignetSkillModel skillModel = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", skillId);
         if (skillModel == null) {
            logger.error("获取兵法技能有问题：{}", skillId);
            return;
         }

         if (mainModel.getWarcraftLimit() > skillModel.getLv() && skillModel.getNextId() > 0) {
            skillId = skillModel.getNextId();
         } else if (mainModel.getWarcraftLimit() < skillModel.getLv() && skillModel.getLastId() > 0) {
            skillId = skillModel.getLastId();
         }

         heroInfo.warcraftMap.put(position, skillId);
      } else {
         int skillId = this.getDefaultWarcraftSkillId(heroInfo, mainModel);
         if (skillId > 0) {
            heroInfo.warcraftMap.put(position, skillId);
         }
      }

   }

   public void removeWarcraftByPos(DecisiveHeroInfo heroInfo, CommonMsg.WearPosition position) {
      if (heroInfo.warcraftMap.containsKey(position)) {
         heroInfo.warcraftMap.remove(position);
      }

   }

   public int getDefaultWarcraftSkillId(DecisiveHeroInfo heroInfo, DecisiveBattleMainModel mainModel) {
      List<Integer> skillList = new ArrayList();

      for(Map.Entry<CommonMsg.WearPosition, Integer> entry : heroInfo.warcraftMap.entrySet()) {
         skillList.add(entry.getValue());
      }

      List<Integer> tempList = new ArrayList();
      Map<Integer, WarriorSignetSkillModel> modelMap = this.player.getGameModelPool().getMap("warriorSignetSkill");

      for(WarriorSignetSkillModel model : modelMap.values()) {
         if (mainModel.getWarcraftLimit() == model.getLv()) {
            Boolean flag = true;

            for(Integer sourceSkill : skillList) {
               if (this.isSameBaseSkill(sourceSkill, model.getId())) {
                  flag = false;
                  break;
               }
            }

            if (flag) {
               tempList.add(model.getId());
            }
         }
      }

      if (!tempList.isEmpty()) {
         Collections.shuffle(tempList);
         return (Integer)tempList.get(0);
      } else {
         logger.error("未获取到兵法技能！！！");
         return 0;
      }
   }

   public boolean isSameBaseSkill(int sourceSkill, int targetSkill) {
      WarriorSignetSkillModel source = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", sourceSkill);
      if (source == null) {
         return false;
      } else {
         WarriorSignetSkillModel target = (WarriorSignetSkillModel)this.player.getGameModelPool().getEntity("warriorSignetSkill", targetSkill);
         if (target == null) {
            return false;
         } else {
            return source.getBaseSkill() == target.getBaseSkill();
         }
      }
   }

   public int getStarMax(int code, int step) {
      DecisiveBattleMainModel mainModel = this.getMainModel();
      DecisiveBattleHeroModel heroModel = (DecisiveBattleHeroModel)this.player.getGameModelPool().getEntity("DecisiveBattleHero", code);
      if (mainModel != null && heroModel != null) {
         return mainModel.getHeroStarLimit() > heroModel.getMaxStar() ? heroModel.getMaxStar() : mainModel.getHeroStarLimit();
      } else {
         return 5;
      }
   }

   public DecisiveHeroInfo getHeroInfoByCode(int code, Boolean isFlush) {
      CustomArrayingDao arrayingDao = this.getCustomArrayingDao();
      int step = ApplicationContextProvider.getConfigInt("RecommendedForJueZhan", 4);
      DecisiveBattleHeroModel decisiveBattleHeroModel = (DecisiveBattleHeroModel)this.player.getGameModelPool().getEntity("DecisiveBattleHero", code);
      if (decisiveBattleHeroModel == null) {
         logger.error("获取英雄有问题：{}", code);
      }

      if (!arrayingDao.heroMap.containsKey(code)) {
         DecisiveHeroInfo heroInfo = new DecisiveHeroInfo();
         heroInfo.code = code;
         heroInfo.heroId = decisiveBattleHeroModel.getHeroId();
         arrayingDao.heroMap.put(code, heroInfo);
         arrayingDao.updateOp();
      }

      DecisiveHeroInfo heroInfo = (DecisiveHeroInfo)arrayingDao.heroMap.get(code);
      this.checkDefaultWarrior(heroInfo, step);
      this.checkDefaultWarcraft(heroInfo);
      this.checkDefaultOrnament(heroInfo, arrayingDao);
      this.checkDefaultTalent(heroInfo, arrayingDao);
      arrayingDao.updateOp();
      return heroInfo;
   }

   public void checkDefaultTalent(DecisiveHeroInfo heroInfo, CustomArrayingDao arrayingDao) {
      int step = ApplicationContextProvider.getConfigInt("RecommendedForJueZhan", 4);
      HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroInfo.heroId);
      if (heroModel != null) {
         int limitStar = this.getStarMax(heroInfo.code, step);
         Map<Integer, TalentLevelModel> modelMap = this.player.getGameModelPool().getMap("talentLevel");

         for(TalentLevelModel model : modelMap.values()) {
            if (limitStar >= model.getStar() && !heroInfo.talent.containsKey(model.getId())) {
               if (heroModel.getType() == HeroDefine.HERO_JOB_DEFEND) {
                  heroInfo.talent.put(model.getId(), 1);
               } else if (heroModel.getType() == HeroDefine.HERO_JOB_SUPPORT) {
                  heroInfo.talent.put(model.getId(), 2);
               } else {
                  heroInfo.talent.put(model.getId(), 0);
               }
            } else if (limitStar < model.getStar() && heroInfo.talent.containsKey(model.getId())) {
               heroInfo.talent.remove(model.getId());
            }
         }

      }
   }

   public void checkDefaultOrnament(DecisiveHeroInfo heroInfo, CustomArrayingDao arrayingDao) {
      int step = ApplicationContextProvider.getConfigInt("RecommendedForJueZhan", 4);
      DecisiveBattleMainModel mainModel = (DecisiveBattleMainModel)this.player.getGameModelPool().getEntity("DecisiveBattleMain", step);
      if (heroInfo.ornament.size() != 4) {
         this.addDefaultOrnament(heroInfo);
      }

      Map<Integer, OrnamentItem> tempMap = new HashMap();

      for(Map.Entry<Integer, OrnamentItem> entry : heroInfo.ornament.entrySet()) {
         StampModel stampModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", ((OrnamentItem)entry.getValue()).id);
         if (stampModel.getStar() < mainModel.getStampStar()) {
            int stampId = this.getStarOrnament(stampModel, mainModel.getStampStar());
            OrnamentItem newOrnament = this.createOrnamentById(stampId);
            tempMap.put(entry.getKey(), newOrnament);
         }
      }

      if (!tempMap.isEmpty()) {
         heroInfo.ornament.putAll(tempMap);
      }

   }

   public void addDefaultOrnament(DecisiveHeroInfo heroInfo) {
      HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroInfo.heroId);
      Map<Integer, DecisiveStampModel> modelMap = this.player.getGameModelPool().getMap("DecisiveStamp");

      for(DecisiveStampModel model : modelMap.values()) {
         if (model.getType() == heroModel.getType()) {
            for(Integer stampId : model.getStampId()) {
               OrnamentItem newOrnament = this.createOrnamentById(stampId);
               StampModel stampModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", stampId);
               StampBasicPropertyModel basicPropertyModel = (StampBasicPropertyModel)this.player.getGameModelPool().getEntity("StampBasicProperty", stampModel.getBasicPropertyType());
               int pos = CommonMsg.WearPosition.WEARPOSITION_ORANMENT_1.getNumber();
               if (basicPropertyModel.getStampType() == 2) {
                  pos = CommonMsg.WearPosition.WEARPOSITION_ORANMENT_2.getNumber();
               } else if (basicPropertyModel.getStampType() == 3) {
                  pos = CommonMsg.WearPosition.WEARPOSITION_ORANMENT_3.getNumber();
               } else if (basicPropertyModel.getStampType() == 4) {
                  pos = CommonMsg.WearPosition.WEARPOSITION_ORANMENT_4.getNumber();
               }

               heroInfo.ornament.put(pos, newOrnament);
            }
         }
      }

   }

   public OrnamentItem createOrnamentById(int stampId) {
      OrnamentItem item = new OrnamentItem();
      item.id = stampId;
      item.code = 0;
      item.lev = 0;
      return item;
   }

   public int getStarOrnament(StampModel stampModel, int targetStar) {
      int curStar = stampModel.getStar();
      int curId = stampModel.getId();
      int flag = 0;

      while(true) {
         if (curStar < targetStar && flag < 10) {
            StampModel curModel = (StampModel)this.player.getGameModelPool().getEntity("Stamp", curId);
            if (curModel.getStar() != targetStar && curModel.getTargetStamp() != 0) {
               curId = curModel.getTargetStamp();
               ++flag;
               continue;
            }

            return curModel.getId();
         }

         return stampModel.getId();
      }
   }

   public int getHeroLv(int star) {
      int lv = 100;
      StarWithMaxLvModel lvModel = (StarWithMaxLvModel)this.player.getGameModelPool().getEntity("StarWithMaxLv", star);
      if (lvModel != null) {
         lv = lvModel.getMaxLv();
      }

      return lv;
   }

   public void notifyHeroInfo(int heroCode, HeroMsg.NotifyReason reason) {
      DecisiveHeroInfo heroInfo = this.getHeroInfoByCode(heroCode, false);
      int step = ApplicationContextProvider.getConfigInt("RecommendedForJueZhan", 4);
      int star = this.getStarMax(heroCode, step);
      HeroDao heroDao = heroInfo.getHeroDao(heroCode, this.getHeroLv(star), star, this.player.getPlayerId());
      if (heroDao != null) {
         HeroMsg.S2C_HeroInfo_5265.Builder builder = HeroMsg.S2C_HeroInfo_5265.newBuilder();
         builder.setPlayerId(this.player.getPlayerId());
         builder.addHeroInfo(heroDao.toHeroInfoForDecisive());
         builder.setReason(reason);
         this.player.sendMsg(builder.build());
      }
   }

   public void notifyHeroInfo(List<Integer> heroList, HeroMsg.NotifyReason reason) {
      HeroMsg.S2C_HeroInfo_5265.Builder builder = HeroMsg.S2C_HeroInfo_5265.newBuilder();
      builder.setPlayerId(this.player.getPlayerId());
      int step = ApplicationContextProvider.getConfigInt("RecommendedForJueZhan", 4);

      for(Integer code : heroList) {
         DecisiveHeroInfo heroInfo = this.getHeroInfoByCode(code, false);
         int star = this.getStarMax(code, step);
         HeroDao heroDao = heroInfo.getHeroDao(code, this.getHeroLv(star), star, this.player.getPlayerId());
         if (heroDao != null) {
            builder.addHeroInfo(heroDao.toHeroInfoForDecisive());
         }
      }

      builder.setReason(reason);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_SaveBeautyList_5260(HeroMsg.C2S_SaveBeautyList_5260 msg, String source) {
      CustomArrayingDao arrayingDao = this.getCustomArrayingDao();
      int step = ApplicationContextProvider.getConfigInt("RecommendedForJueZhan", 4);
      DecisiveBattleMainModel mainModel = this.getMainModel();
      List<Integer> tempList = new ArrayList();

      for(Integer beautyId : msg.getBeautyIdsList()) {
         if (beautyId != 0) {
            if (!mainModel.getTongQueId().contains(beautyId)) {
               logger.error("未解锁该美人ID:{}----{}", beautyId, step);
               return;
            }

            if (tempList.contains(beautyId)) {
               logger.error("同心策上有一样的美人：{}", beautyId);
               return;
            }

            tempList.add(beautyId);
         }
      }

      if (tempList.size() > mainModel.getTongQueNum()) {
         logger.error("美人同心策数量和段位不一致：{}----{}", msg.getBeautyIdsList(), step);
      } else {
         for(CustomArrayingDao.ArrayingInfo arraying : arrayingDao.arrayingMap.values()) {
            if (msg.getBeautyIdsList().contains(arraying.beautyId) && (Integer)msg.getBeautyIdsList().get(0) != arraying.beautyId) {
               arraying.beautyId = 0;
            }
         }

         if (tempList.isEmpty()) {
            for(CustomArrayingDao.ArrayingInfo arraying : arrayingDao.arrayingMap.values()) {
               if (arraying.beautyId != 0 && arrayingDao.beautyList.contains(arraying.beautyId)) {
                  arraying.beautyId = 0;
               }
            }
         }

         arrayingDao.beautyList.clear();
         arrayingDao.beautyList.addAll(msg.getBeautyIdsList());
         arrayingDao.updateOp();
         this.sendBeautyListInfo();
      }
   }

   @MsgHandlerAnno
   public void C2S_BeautyListInfo_5270(HeroMsg.C2S_BeautyListInfo_5270 msg, String source) {
      this.sendBeautyListInfo();
   }

   public void sendBeautyListInfo() {
      CustomArrayingDao arrayingDao = this.getCustomArrayingDao();
      HeroMsg.S2C_SaveBeautyList_5261.Builder builder = HeroMsg.S2C_SaveBeautyList_5261.newBuilder();
      builder.addAllBeautyIds(arrayingDao.beautyList);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_ArtifactPropertyInfo_5271(HeroMsg.C2S_ArtifactPropertyInfo_5271 msg, String source) {
      HeroMsg.S2C_ArtifactPropertyInfo_5272.Builder builder = HeroMsg.S2C_ArtifactPropertyInfo_5272.newBuilder();
      CustomArrayingDao customArrayingDao = this.getCustomArrayingDao();
      if (customArrayingDao.property_artifact_refine.isEmpty() || customArrayingDao.property_artifact_refine_add.isEmpty() || customArrayingDao.property_artifact_strong.isEmpty()) {
         this.initOtherProperty();
      }

      for(PropertyModel model : customArrayingDao.property_artifact_refine) {
         builder.addRefine(model.builder());
      }

      for(PropertyModel model : customArrayingDao.property_artifact_refine_add) {
         builder.addRefineExtra(model.builder());
      }

      for(PropertyModel model : customArrayingDao.property_artifact_strong) {
         builder.addStrong(model.builder());
      }

      this.player.sendMsg(builder.build());
   }

   public ArrayingMirror getArrayingMirror(CustomArrayingDao.ArrayingInfo arraying) {
      CustomArrayingDao arrayingDao = this.getCustomArrayingDao();
      int step = ApplicationContextProvider.getConfigInt("RecommendedForJueZhan", 4);
      ArrayingMirror arrayingMirror = new ArrayingMirror();

      for(Map.Entry<Integer, Integer> entry : arraying.heroMap.entrySet()) {
         DecisiveHeroInfo heroInfo = this.getHeroInfoByCode((Integer)entry.getValue(), false);
         int star = this.getStarMax((Integer)entry.getValue(), step);
         int lv = this.getHeroLv(star);
         HeroDao heroDao = heroInfo.getHeroDao((Integer)entry.getValue(), lv, star, this.player.getPlayerId());
         if (heroDao != null) {
            HeroMirror mirror = HeroMirror.fromHeroByDecisive(heroDao);
            if ((Integer)entry.getKey() < 5) {
               HeroArrayingEntity heroArrayingEntity = new HeroArrayingEntity();
               heroArrayingEntity.mirror = mirror;
               heroArrayingEntity.positon = (Integer)entry.getKey();
               heroArrayingEntity.code = heroDao.code;
               arrayingMirror.arrayingElementsMap.put(((Integer)entry.getKey()).byteValue(), heroArrayingEntity);
            } else if ((Integer)entry.getKey() == 5) {
               FriendArrayingEntity friendArrayingEntity = new FriendArrayingEntity();
               friendArrayingEntity.code = heroDao.code;
               friendArrayingEntity.mirror = mirror;
               friendArrayingEntity.positon = (Integer)entry.getKey();
               arrayingMirror.arrayingElementsMap.put(((Integer)entry.getKey()).byteValue(), friendArrayingEntity);
            }
         }
      }

      arrayingMirror.friendJob = arraying.friendJob;
      arrayingMirror.friendState = arraying.friendState;
      arrayingMirror.friendNation = arraying.friendNation;
      DecisiveBattleMainModel mainModel = this.getMainModel();
      if (arraying.artifactId > 0) {
         this.addArtifactEntityToMirror(arrayingMirror, mainModel, arraying.artifactId);
      }

      if (arraying.beautyId > 0) {
         DecisiveBattleMainModel maxMainModel = this.getMainModel();
         this.addBeautyEntityToMirror(arrayingMirror, maxMainModel, arraying.beautyId, arrayingDao.beautyList);
      }

      if (!arrayingDao.magicBook.isEmpty()) {
         this.addMagicEntityToMirror(arrayingMirror, mainModel, arrayingDao.magicBook);
      }

      arrayingMirror.soulHeroCode = arraying.soulHeroCode;
      if (arraying.soulHeroCode > 0) {
         DecisiveHeroInfo heroInfo = this.getHeroInfoByCode(arraying.soulHeroCode, false);
         int limitStar = this.configManager.getIntDefault("SoulHeroLimitStar", 9);
         int star = this.getStarMax(heroInfo.code, step);
         if (star >= limitStar) {
            arrayingMirror.soulHeroId = heroInfo.heroId;
         }
      }

      return arrayingMirror;
   }

   public void addBeautyEntityToMirror(ArrayingMirror mirror, DecisiveBattleMainModel mainModel, int beautyId, List<Integer> cooperateList) {
      BeautyArrayingEntity beautyArrayingEntity = new BeautyArrayingEntity();
      beautyArrayingEntity.positon = 7;
      beautyArrayingEntity.code = beautyId;
      beautyArrayingEntity.skillId = this.getBeautySkill(mainModel, beautyId);
      if (cooperateList != null && !cooperateList.isEmpty()) {
         AssistantBeauty assistantBeauty = new AssistantBeauty();
         int mainBeautyId = (Integer)cooperateList.get(0);
         if (mainBeautyId == 0 || mainBeautyId != beautyId) {
            mirror.arrayingElementsMap.put((byte)7, beautyArrayingEntity);
            return;
         }

         for(Integer coopId : cooperateList) {
            assistantBeauty.beautyList.add(coopId);
            if (coopId != 0 && beautyId != coopId) {
               assistantBeauty.assistantList.add(coopId);
               int skillId = this.getBeautySkill(mainModel, coopId);
               TongQueSkillModel tongQueSkillModel = (TongQueSkillModel)this.player.getGameModelPool().getEntity("TongQueSkill", skillId);
               if (tongQueSkillModel != null) {
                  assistantBeauty.assistantSkillList.add(tongQueSkillModel.getAssistantSkill());
                  assistantBeauty.beautySkillList.add(tongQueSkillModel.getAssistantSkill());
               }
            } else if (coopId != 0) {
               assistantBeauty.beautySkillList.add(this.getBeautySkill(mainModel, coopId));
            } else {
               assistantBeauty.beautySkillList.add(0);
            }
         }

         beautyArrayingEntity.assistantBeauty = assistantBeauty;
      }

      mirror.arrayingElementsMap.put((byte)7, beautyArrayingEntity);
   }

   public void addMagicEntityToMirror(ArrayingMirror mirror, DecisiveBattleMainModel mainModel, Map<Integer, Integer> skillMap) {
      DragonArrayingEntity dragonArrayingEntity = new DragonArrayingEntity();
      dragonArrayingEntity.positon = 8;
      dragonArrayingEntity.code = mainModel.getMysticBookId();

      for(int i = 1; i <= 4; ++i) {
         if (skillMap.containsKey(i)) {
            dragonArrayingEntity.skillIds.put(i, skillMap.get(i));
         } else {
            dragonArrayingEntity.skillIds.put(i, 0);
         }
      }

      mirror.arrayingElementsMap.put((byte)8, dragonArrayingEntity);
   }

   public void addArtifactEntityToMirror(ArrayingMirror mirror, DecisiveBattleMainModel mainModel, int artifactId) {
      ArtifactArrayingEntity artifactArrayingEntity = new ArtifactArrayingEntity();
      artifactArrayingEntity.positon = 6;
      artifactArrayingEntity.code = artifactId;
      artifactArrayingEntity.skillId = this.getArtifactSkill(mainModel, artifactId);
      artifactArrayingEntity.level = mainModel.getArtifactSkillLevel();
      mirror.arrayingElementsMap.put((byte)6, artifactArrayingEntity);
   }

   public int getArtifactSkill(DecisiveBattleMainModel mainModel, int artifactId) {
      ArtifactModel model = (ArtifactModel)this.player.getGameModelPool().getEntity("artifact", artifactId);
      ArtifactSkillModel skillModel = (ArtifactSkillModel)this.player.getGameModelPool().getEntity("artifactSkill", mainModel.getArtifactSkillLevel());
      if (model != null && skillModel != null) {
         return (Integer)skillModel.getSkills().get(model.getSkillKey());
      } else {
         logger.error("未获取到神兵技能：{}---{}", mainModel.getArtifactSkillLevel(), artifactId);
         return 0;
      }
   }

   public int getBeautySkill(DecisiveBattleMainModel mainModel, int beautyId) {
      Map<Integer, TongQueSkillModel> modelMap = this.player.getGameModelPool().getMap("TongQueSkill");

      for(TongQueSkillModel model : modelMap.values()) {
         if (model.getLv() == mainModel.getTongQueSkillLevel() && model.getBeautyId() == beautyId) {
            return model.getSkillId();
         }
      }

      logger.error("未获取到美人技能：{}---{}", mainModel.getTongQueSkillLevel(), beautyId);
      return 0;
   }

   public int getMaxPoint() {
      int maxPoint = 0;
      Map<Integer, DecisiveBattleMainModel> modelMap = this.player.getGameModelPool().getMap("DecisiveBattleMain");

      for(DecisiveBattleMainModel model : modelMap.values()) {
         if (model.getRankintegralhigh() > maxPoint) {
            maxPoint = model.getRankintegralhigh();
         }
      }

      return maxPoint;
   }

   public void checkArrayingByStep() {
      int limitStar = this.configManager.getIntDefault("SoulHeroLimitStar", 9);
      CustomArrayingDao arrayingDao = this.getCustomArrayingDao();
      int step = ApplicationContextProvider.getConfigInt("RecommendedForJueZhan", 4);

      for(Map.Entry<CommonMsg.HeroState, CustomArrayingDao.ArrayingInfo> entry : arrayingDao.arrayingMap.entrySet()) {
         Boolean flag = false;

         for(Map.Entry<Integer, Integer> heroEntry : ((CustomArrayingDao.ArrayingInfo)entry.getValue()).heroMap.entrySet()) {
            if ((Integer)heroEntry.getKey() == 5 && ((CustomArrayingDao.ArrayingInfo)entry.getValue()).friendState == 0 || (Integer)heroEntry.getKey() != 5) {
               DecisiveHeroInfo heroInfo = this.getHeroInfoByCode((Integer)heroEntry.getValue(), false);
               int star = this.getStarMax(heroInfo.code, step);
               if ((Integer)heroEntry.getValue() == ((CustomArrayingDao.ArrayingInfo)entry.getValue()).soulHeroCode && star >= limitStar) {
                  flag = true;
               }
            }
         }

         if (!flag) {
            ((CustomArrayingDao.ArrayingInfo)entry.getValue()).soulHeroCode = 0;
         }
      }

      for(Map.Entry<CommonMsg.HeroState, CustomArrayingDao.ArrayingInfo> entry : arrayingDao.arrayingMap.entrySet()) {
         int tempPos = 0;
         int targetSoulCode = 0;

         for(Map.Entry<Integer, Integer> heroEntry : ((CustomArrayingDao.ArrayingInfo)entry.getValue()).heroMap.entrySet()) {
            DecisiveHeroInfo heroInfo = this.getHeroInfoByCode((Integer)heroEntry.getValue(), false);
            int star = this.getStarMax(heroInfo.code, step);
            HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroInfo.heroId);
            if (heroModel.getNation() == 10 && star >= limitStar && (tempPos == 0 || tempPos > (Integer)heroEntry.getKey())) {
               tempPos = (Integer)heroEntry.getKey();
               targetSoulCode = (Integer)heroEntry.getValue();
            }
         }

         if (((CustomArrayingDao.ArrayingInfo)entry.getValue()).soulHeroCode > 0 && targetSoulCode == 0) {
            ((CustomArrayingDao.ArrayingInfo)entry.getValue()).soulHeroCode = 0;
         } else if (((CustomArrayingDao.ArrayingInfo)entry.getValue()).soulHeroCode == 0 && targetSoulCode > 0) {
            ((CustomArrayingDao.ArrayingInfo)entry.getValue()).soulHeroCode = targetSoulCode;
         }
      }

      arrayingDao.updateOp();
   }

   public void removeArraying(CustomArrayingDao arrayingDao, CommonMsg.HeroState state) {
      if (arrayingDao.arrayingMap.containsKey(state)) {
         arrayingDao.arrayingMap.remove(state);
      }

   }

   public void initOtherProperty() {
      DecisiveBattleMainModel mainModel = this.getMainModel();
      CustomArrayingDao customArrayingDao = this.getCustomArrayingDao();
      if (mainModel != null) {
         customArrayingDao.property_artifact_refine = (List)this.getRefineProperties(mainModel.getArtifactRefineLevel()).get(1);
         customArrayingDao.property_artifact_refine_add = (List)this.getRefineProperties(mainModel.getArtifactRefineLevel()).get(2);
         customArrayingDao.property_artifact_strong = this.getArtifactLvProperties(mainModel.getArtifactLevel());
         this.flushFriendHero();
      }
   }

   public void flushFriendHero() {
      CustomArrayingDao arrayingDao = this.getCustomArrayingDao();
      int step = ApplicationContextProvider.getConfigInt("RecommendedForJueZhan", 4);
      arrayingDao.friendProperty.clear();

      for(Map.Entry<CommonMsg.HeroState, CustomArrayingDao.ArrayingInfo> entry : arrayingDao.arrayingMap.entrySet()) {
         Map<Integer, Map<Integer, List<PropertyModel>>> temp_property = new HashMap();

         for(Map.Entry<Integer, Integer> heroEntry : ((CustomArrayingDao.ArrayingInfo)entry.getValue()).heroMap.entrySet()) {
            if ((Integer)heroEntry.getKey() == 5) {
               DecisiveHeroInfo heroInfo = this.getHeroInfoByCode((Integer)heroEntry.getValue(), false);
               int star = this.getStarMax((Integer)heroEntry.getValue(), step);
               HeroDao friendDao = heroInfo.getHeroDao((Integer)heroEntry.getValue(), this.getHeroLv(star), star, this.player.getPlayerId());
               if (friendDao != null) {
                  friendDao.doFlushTotalPropertiesForDecisiveBattle((Integer)heroEntry.getValue());
                  HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", friendDao.id);
                  if (heroModel == null) {
                     break;
                  }

                  int friendJob = heroModel.getType();
                  if (heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING && ((CustomArrayingDao.ArrayingInfo)entry.getValue()).friendJob > 0) {
                     friendJob = ((CustomArrayingDao.ArrayingInfo)entry.getValue()).friendJob;
                  }

                  int key = friendJob * 100 + friendDao.getStar();
                  SupportHeroModel supportHeroModel = (SupportHeroModel)this.player.getGameModelPool().getEntity("supportHero", key);
                  if (supportHeroModel == null || !friendDao.totalFightProperties.containsKey(supportHeroModel.getAddpro())) {
                     break;
                  }

                  long val = (Long)friendDao.totalFightProperties.get(supportHeroModel.getAddpro()) * (long)supportHeroModel.getAddper() / 10000L;

                  for(int i = 1; i <= 5; ++i) {
                     Map<Integer, List<PropertyModel>> tempMap = new HashMap();

                     for(int j = 1; j <= 4; ++j) {
                        List<PropertyModel> list = new ArrayList();
                        list.add(new PropertyModel(supportHeroModel.getAddpro(), 0, val));
                        tempMap.put(j, list);
                     }

                     temp_property.put(i, tempMap);
                  }
                  break;
               }
            }
         }

         arrayingDao.friendProperty.put(entry.getKey(), temp_property);
      }

   }

   public List<PropertyModel> getProperty_friend(int nation, int type, int code) {
      CustomArrayingDao arrayingDao = this.getCustomArrayingDao();
      if (nation == 10 && arrayingDao.heroMap.containsKey(code)) {
         nation = ((DecisiveHeroInfo)arrayingDao.heroMap.get(code)).inheritNation;
      }

      List<PropertyModel> tempList = new ArrayList();
      Boolean flag = false;
      CommonMsg.HeroState arrayingType = null;

      for(Map.Entry<CommonMsg.HeroState, CustomArrayingDao.ArrayingInfo> entry : arrayingDao.arrayingMap.entrySet()) {
         for(Map.Entry<Integer, Integer> heroEntry : ((CustomArrayingDao.ArrayingInfo)entry.getValue()).heroMap.entrySet()) {
            if ((Integer)heroEntry.getKey() < 5 && (Integer)heroEntry.getValue() == code) {
               arrayingType = (CommonMsg.HeroState)entry.getKey();
               flag = true;
               break;
            }
         }
      }

      if (flag && arrayingType != null && arrayingDao.friendProperty.containsKey(arrayingType) && ((Map)arrayingDao.friendProperty.get(arrayingType)).containsKey(nation)) {
         Map<Integer, List<PropertyModel>> map = (Map)((Map)arrayingDao.friendProperty.get(arrayingType)).get(nation);
         if (map != null && map.containsKey(type)) {
            tempList = (List)map.get(type);
            return tempList;
         }
      }

      return tempList;
   }

   public Map<Integer, List<PropertyModel>> getRefineProperties(int refineLv) {
      Map<Integer, List<PropertyModel>> resultMap = new HashMap();
      List<PropertyModel> commonList = new ArrayList();
      List<PropertyModel> addList = new ArrayList();

      for(int i = 0; i < refineLv; ++i) {
         ArtifactRefineModel artifactRefineModel = (ArtifactRefineModel)this.player.getGameModelPool().getEntity("artifactRefine", i);
         if (artifactRefineModel != null) {
            for(PropertyModel property : artifactRefineModel.getPropertys()) {
               PropertyModel propertyModel = new PropertyModel(property.getType(), property.getWay(), property.getValue());
               PropertyModel.addLvProtities(commonList, propertyModel);
            }

            for(PropertyModel addProperty : artifactRefineModel.getAddPropertys()) {
               PropertyModel propertyModel = new PropertyModel(addProperty.getType(), addProperty.getWay(), addProperty.getValue());
               PropertyModel.addLvProtities(addList, propertyModel);
            }
         }
      }

      resultMap.put(1, commonList);
      resultMap.put(2, addList);
      return resultMap;
   }

   public List<PropertyModel> getArtifactLvProperties(int strongLv) {
      List<PropertyModel> resultList = new ArrayList();
      int baseHp = this.configManager.getInt("artifactBaseHp");
      int baseAttack = this.configManager.getInt("artifactBaseAttack");
      float totalAtt = (float)baseAttack;
      float totalHp = (float)baseHp;

      for(int i = 0; i < strongLv; ++i) {
         ArtifactStrongModel artifactStrongModel = (ArtifactStrongModel)this.player.getGameModelPool().getEntity("artifactStrong", i);
         if (artifactStrongModel == null) {
            logger.error("神兵强化等级错误：{}", i);
         } else {
            totalAtt += (float)artifactStrongModel.getExp() * artifactStrongModel.getExpAtk();
            totalHp += (float)artifactStrongModel.getExp() * artifactStrongModel.getExpHp();
            totalAtt += (float)artifactStrongModel.getRewardAtk();
            totalHp += (float)artifactStrongModel.getRewardHp();
         }
      }

      PropertyModel attPropertyModel = new PropertyModel(2, 0, (long)Float.valueOf(totalAtt).intValue());
      PropertyModel hpPropertyModel = new PropertyModel(1, 0, (long)Float.valueOf(totalHp).intValue());
      resultList.add(attPropertyModel);
      resultList.add(hpPropertyModel);
      return resultList;
   }

   public List<PropertyModel> getProperty_artifact_strong() {
      CustomArrayingDao arrayingDao = this.getCustomArrayingDao();
      return arrayingDao.property_artifact_strong;
   }

   public List<PropertyModel> getProperty_artifact_refine() {
      CustomArrayingDao arrayingDao = this.getCustomArrayingDao();
      return arrayingDao.property_artifact_refine;
   }

   public List<PropertyModel> getProperty_artifact_refine_add() {
      CustomArrayingDao arrayingDao = this.getCustomArrayingDao();
      return arrayingDao.property_artifact_refine_add;
   }
}
