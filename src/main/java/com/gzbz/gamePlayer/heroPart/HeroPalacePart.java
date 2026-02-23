package com.gzbz.gamePlayer.heroPart;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import cn.hutool.core.convert.Convert;
import com.gzbz.db.HeroDao;
import com.gzbz.db.HeroDressDao;
import com.gzbz.db.HeroPalaceDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroAide.HeroAidePart;
import com.gzbz.gamePlayer.heroPart.bean.PlayerHeroExtend;
import com.gzbz.gamePlayer.monarch.MonarchPart;
import com.gzbz.gamePlayer.playerBag.HeroDressPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.AideLevelModel;
import com.gzbz.model.DictionarySoulHeroModel;
import com.gzbz.model.HeroDressModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.HeroPalaceNoticeModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.LeaderPalaceSkillConsumeModel;
import com.gzbz.model.LeaderTacticsDestinyModel;
import com.gzbz.model.LeaderTacticsSkillModel;
import com.gzbz.model.LeaderTitleModel;
import com.gzbz.model.SkillModel;
import com.gzbz.model.UpgradeModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.PropertyModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.HeroPalaceMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.robot.MonsterManager;
import com.gzbz.spring.ApplicationContextProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
public class HeroPalacePart extends PlayerPart {
   private static Logger logger = LoggerFactory.getLogger(HeroPalacePart.class);
   public static String HERO_PALACE_RESET_SKILL_CONSUME = "heroPalaceReturnSkill";
   public static String HERO_PALACE_DEFAULT_HEROID = "heroPalaceDefaultHeroId";
   public static String HERO_PALACE_DEFAULT_HERODRESSID = "heroPalaceDefaultHerodressId";
   public static String HERO_PALACE_NEED_TITLE_LV = "heroPalaceNeedTitleLv";
   public static String HERO_PALACE_STAR_LIMIT = "HeroPalaceStarLimit";
   public static String HERO_PLACE_DRESS_UNLOCK_COST = "heroPlaceDressUnlockCost";
   @Autowired
   private ConfigManager configManager;

   public void loginHandle() {
   }

   public void init() {
      if (this.player.isSystemOpen(3960)) {
         HeroPalaceDao dao = (HeroPalaceDao)this.player.getData("tb_hero_palace", this.player.getPlayerId());
         if (dao.heroCode > 0) {
            boolean hasRemovedDestinySkill = false;
            if (!dao.destinySkills.isEmpty()) {
               Set<Integer> skillIdSet = new HashSet();
               Iterator<Map.Entry<Integer, Integer>> iterator = dao.destinySkills.entrySet().iterator();

               while(iterator.hasNext()) {
                  Map.Entry<Integer, Integer> entry = (Map.Entry)iterator.next();
                  if (skillIdSet.contains(entry.getValue())) {
                     iterator.remove();
                     hasRemovedDestinySkill = true;
                     logger.info("玩家【{}】君主存在重复的天命技能【{}】，故删掉", this.player.getPlayerId(), entry.getValue());
                  } else {
                     skillIdSet.add(entry.getValue());
                  }
               }
            }

            this.calHeroPalaceAddProperty(dao);
            if (hasRemovedDestinySkill) {
               dao.updateOp();
               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               HeroDao heroDao = heroBagPart.getHeroByCode(dao.heroCode);
               heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODULE_HERO_PALACE, heroDao);
            }
         } else {
            this.checkNoticeCompleted();
         }

      }
   }

   public void checkTaskLoad() {
      HeroPalaceDao heroPalaceDao = this.getHeroPalaceDao();
      if (heroPalaceDao.noticeDir.isEmpty()) {
         Map<Integer, HeroPalaceNoticeModel> map = this.player.getGameModelPool().getMap("heroPalaceNotice");
         if (!map.isEmpty()) {
            for(Map.Entry<Integer, HeroPalaceNoticeModel> entry : map.entrySet()) {
               heroPalaceDao.noticeDir.put(entry.getKey(), 0);
            }

            heroPalaceDao.updateOp();
         }
      }

   }

   public void checkNoticeCompleted() {
      HeroPalaceDao dao = this.getHeroPalaceDao();
      if (dao.heroCode <= 0) {
         if (this.isNoticeCompleted()) {
            HeroDao heroDao = this.unlockHeroPalace();
            if (heroDao != null) {
               CommonMsg.ItemInfo.Builder heroBuilder = CommonMsg.ItemInfo.newBuilder();
               heroBuilder.setType(3);
               heroBuilder.setCode(heroDao.code);
               heroBuilder.setNum(1);
               heroBuilder.setId(heroDao.id);
               this.player.addResourceMsgByBuilder(heroBuilder);
               this.player.sendResourceMsg(PlayerMsg.ShowType.SHOW_HERO_PALACE_UNLOCK);
               this.sendHeroPalaceData();
               HeroDressPart heroDressPart = (HeroDressPart)this.player.getMgrPart(HeroDressPart.class);
               heroDressPart.S2C_MainResult_11202();
            }
         }

      }
   }

   public boolean isNoticeCompleted() {
      HeroPalaceDao heroPalaceDao = this.getHeroPalaceDao();
      if (heroPalaceDao.noticeDir.isEmpty()) {
         return false;
      } else {
         for(Integer value : heroPalaceDao.noticeDir.values()) {
            if (value != 1) {
               return false;
            }
         }

         return true;
      }
   }

   public void noticeUi() {
      HeroPalaceDao heroPalaceDao = this.getHeroPalaceDao();
      HeroPalaceMsg.S2C_NoticeUi_18404.Builder builder = HeroPalaceMsg.S2C_NoticeUi_18404.newBuilder();
      if (!heroPalaceDao.noticeDir.isEmpty()) {
         for(Map.Entry<Integer, Integer> entry : heroPalaceDao.noticeDir.entrySet()) {
            HeroPalaceMsg.NoticeInfo.Builder info = HeroPalaceMsg.NoticeInfo.newBuilder();
            info.setId((Integer)entry.getKey());
            info.setType(HeroPalaceMsg.NoticeUnlockType.forNumber((Integer)entry.getValue()));
            builder.addInfos(info);
         }
      }

      this.player.sendMsg(builder.build());
   }

   public void noticePlay(int id) {
      HeroPalaceDao heroPalaceDao = this.getHeroPalaceDao();
      if (heroPalaceDao.noticeDir.isEmpty()) {
         this.checkTaskLoad();
      }

      if (!heroPalaceDao.noticeDir.containsKey(id)) {
         this.player.failure(0);
      } else if ((Integer)heroPalaceDao.noticeDir.get(id) == 1) {
         this.player.failure(0);
      } else {
         HeroPalaceNoticeModel heroPalaceNoticeModel = (HeroPalaceNoticeModel)this.player.getGameModelPool().getEntity("heroPalaceNotice", id);
         if (heroPalaceNoticeModel != null) {
            this.player.addResource(heroPalaceNoticeModel.getItems(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 90, 9009, 0, 0, "");
            heroPalaceDao.noticeDir.put(id, 1);
            heroPalaceDao.updateOp();
            this.noticeUi();
            HeroPalaceMsg.S2C_NoticePlay_18408.Builder builder = HeroPalaceMsg.S2C_NoticePlay_18408.newBuilder();
            builder.setResult(1);
            this.player.sendMsg(builder.build());
            this.checkNoticeCompleted();
         }
      }
   }

   public boolean isCompleteAllTask(Map<Integer, TaskData> taskDataMap) {
      if (taskDataMap == null) {
         return false;
      } else {
         for(Map.Entry<Integer, TaskData> entry : taskDataMap.entrySet()) {
            if (((TaskData)entry.getValue()).state != CommonMsg.TaskState.STATE_FINISH.getNumber()) {
               return false;
            }
         }

         return true;
      }
   }

   public void completeAllTask() {
      HeroPalaceDao dao = this.getHeroPalaceDao();
      if (dao.heroCode <= 0) {
         HeroDao heroDao = this.unlockHeroPalace();
         if (heroDao != null) {
            this.sendHeroPalaceData();
         }
      }

      HeroDressPart heroDressPart = (HeroDressPart)this.player.getMgrPart(HeroDressPart.class);
      heroDressPart.S2C_MainResult_11202();
   }

   @MsgHandlerAnno
   public void C2S_OpenMainUi_18401(HeroPalaceMsg.C2S_OpenMainUi_18401 msg, String source) {
      this.openMainUi();
   }

   @MsgHandlerAnno
   public void C2S_NoticeUi_18403(HeroPalaceMsg.C2S_NoticeUi_18403 msg, String source) {
      this.checkTaskLoad();
      this.noticeUi();
   }

   @MsgHandlerAnno
   public void C2S_NoticePlay_18407(HeroPalaceMsg.C2S_NoticePlay_18407 msg, String source) {
      this.noticePlay(msg.getId());
   }

   @MsgHandlerAnno
   public void C2S_ShareHero_18405(HeroPalaceMsg.C2S_ShareHero_18405 msg, String source) {
      if (this.player.isSystemOpen(3960)) {
         switch (msg.getType()) {
            case SHARETYPE_SHARE:
               this.shareHero(msg.getHeroCode());
               break;
            case SHARETYPE_UPDATE:
               this.updateHero(msg.getHeroCode());
         }

      }
   }

   @MsgHandlerAnno
   public void C2S_ShareHeroPreview_18409(HeroPalaceMsg.C2S_ShareHeroPreview_18409 msg, String source) {
      this.shareHeroPreview(msg.getHeroCode());
   }

   @MsgHandlerAnno
   public void C2S_LearnHeroSkill_18411(HeroPalaceMsg.C2S_LearnHeroSkill_18411 msg, String source) {
      this.addHeroSkll(msg.getSkillsList());
   }

   @MsgHandlerAnno
   public void C2S_UnlockKingSkill_18413(HeroPalaceMsg.C2S_UnlockKingSkill_18413 msg, String source) {
      this.unlockKingSkill(msg.getId(), msg.getHeroCodesList());
   }

   @MsgHandlerAnno
   public void C2S_UnlockDestinySkill_18421(HeroPalaceMsg.C2S_UnlockDestinySkill_18421 msg, String source) {
      this.unlockDestinySkill(msg.getSkillId());
   }

   @MsgHandlerAnno
   public void C2S_UpgradeDestinySkill_18423(HeroPalaceMsg.C2S_UpgradeDestinySkill_18423 msg, String source) {
      this.upgradeDestinySkill(msg.getSkillId());
   }

   @MsgHandlerAnno
   public void C2S_LearnDestinySkill_18425(HeroPalaceMsg.C2S_LearnDestinySkill_18425 msg, String source) {
      this.learnDestinySkill(msg.getSkillsList());
   }

   @MsgHandlerAnno
   public void C2S_UnlockHeroSkill_18433(HeroPalaceMsg.C2S_UnlockHeroSkill_18433 msg, String source) {
      this.unlockHeroSkill(msg.getSkillId(), msg.getHeroCodesList());
   }

   @MsgHandlerAnno
   public void C2S_UpgradeHeroSkill_18435(HeroPalaceMsg.C2S_UpgradeHeroSkill_18435 msg, String source) {
      this.upgradeHeroSkill(msg.getSkillId(), msg.getHeroCodesList());
   }

   @MsgHandlerAnno
   public void C2S_ResetHeroSkill_18437(HeroPalaceMsg.C2S_ResetHeroSkill_18437 msg, String source) {
      this.resetHeroSkill(msg.getSkillId());
   }

   @MsgHandlerAnno
   public void C2S_UpgradePalaceTitle_18443(HeroPalaceMsg.C2S_UpgradePalaceTitle_18443 msg, String source) {
      this.upgradePalaceTitle();
   }

   @MsgHandlerAnno
   public boolean C2S_UnlockPlaceHeroDress_18445(HeroPalaceMsg.C2S_UnlockPlaceHeroDress_18445 msg, String source) {
      HeroPalaceDao heroPalaceDao = this.getHeroPalaceDao();
      if (heroPalaceDao.heroCode <= 0) {
         logger.error("未有君主,无法解锁皮肤:{}", msg.getHeroDressId());
         return false;
      } else {
         HeroDressModel heroDressModel = (HeroDressModel)this.player.getGameModelPool().getEntity("heroDress", msg.getHeroDressId());
         if (null == heroDressModel) {
            logger.error("HeroDress缺少配置id:{}", msg.getHeroDressId());
            return this.player.failure(37);
         } else if (heroDressModel.getDressType() != HeroDefine.HERO_DRESS_TYPE_PALACE) {
            logger.error("HeroDress缺少配置id:{},不是君主皮肤", msg.getHeroDressId());
            return this.player.failure(6);
         } else {
            ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", heroDressModel.getItemId());
            if (null == itemModel) {
               logger.error("HeroDress君主皮肤配置的itemId有误 id:{},itemId:{}", msg.getHeroDressId(), heroDressModel.getItemId());
               return this.player.failure(37);
            } else {
               HeroDressPart heroDressPart = (HeroDressPart)this.player.getMgrPart(HeroDressPart.class);
               HeroDressDao heroDressDaoByDressId = heroDressPart.getHeroDressDaoByDressId(msg.getHeroDressId());
               if (null != heroDressDaoByDressId) {
                  return this.player.failure(76116);
               } else if (heroDressModel.getFeeType() != 0 && heroDressModel.getFeeId() != 0 && heroDressModel.getFeeVal() != 0) {
                  if (!this.player.checkResourceNum(heroDressModel.getFeeType(), heroDressModel.getFeeId(), heroDressModel.getFeeVal())) {
                     return this.player.failure(21010);
                  } else {
                     this.player.delResource(heroDressModel.getFeeType(), heroDressModel.getFeeId(), (long)heroDressModel.getFeeVal(), 90, 9012, 0, 0, "");
                     this.addPalaceDress(heroDressModel, itemModel, heroPalaceDao.heroCode);
                     HeroPalaceMsg.S2C_UnlockPlaceHeroDress_18446.Builder resp = HeroPalaceMsg.S2C_UnlockPlaceHeroDress_18446.newBuilder();
                     resp.setHeroDressId(msg.getHeroDressId());
                     this.player.sendMsg(resp.build());
                     heroDressPart.S2C_MainResult_11202();
                     return true;
                  }
               } else {
                  return this.player.failure(6);
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_SoulPalace_18451(HeroPalaceMsg.C2S_SoulPalace_18451 msg, String source) {
      this.sendSoulDictionaryInfo((Integer)null, false);
   }

   @MsgHandlerAnno
   public void C2S_SoulPalaceActive_18453(HeroPalaceMsg.C2S_SoulPalaceActive_18453 msg, String source) {
      if (!this.player.isSystemOpen(6500)) {
         this.player.failure(21);
      } else {
         Map<Integer, DictionarySoulHeroModel> soulHeroModelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customDictionarySoulHero", msg.getHeroId());
         if (soulHeroModelMap != null && soulHeroModelMap.containsKey(msg.getLevel())) {
            DictionarySoulHeroModel dictionarySoulHeroModel = (DictionarySoulHeroModel)soulHeroModelMap.get(msg.getLevel());
            PlayerHeroExtend playerHeroExtend = (PlayerHeroExtend)this.player.getPlayerExtend(4);
            int historyMaxStar = (Integer)playerHeroExtend.maxStar.getOrDefault(msg.getHeroId(), 0);
            if (historyMaxStar <= 0) {
               this.player.failure(4100);
            } else if (historyMaxStar < dictionarySoulHeroModel.getStarLimit()) {
               this.player.failure(40008);
            } else {
               int activeLevel = (Integer)playerHeroExtend.soulDictionary.getOrDefault(msg.getHeroId(), 0);
               if (activeLevel < dictionarySoulHeroModel.getLevel()) {
                  playerHeroExtend.soulDictionary.put(msg.getHeroId(), dictionarySoulHeroModel.getLevel());
                  this.player.updatePlayerExtend(4);
                  this.calSoulDictionaryAddProperty();
                  HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                  heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODEL_SOUL_PALACE);
               }

               HeroPalaceMsg.S2C_SoulPalaceActive_18454.Builder resp = HeroPalaceMsg.S2C_SoulPalaceActive_18454.newBuilder();
               resp.setHeroId(dictionarySoulHeroModel.getHeroId());
               resp.setLevel(dictionarySoulHeroModel.getLevel());
               this.player.sendMsg(resp.build());
            }
         } else {
            this.player.failure(0);
         }
      }
   }

   public void openMainUi() {
      HeroPalaceDao heroPalaceDao = this.getHeroPalaceDao();
      if (heroPalaceDao.heroCode > 0) {
         this.sendHeroPalaceData();
      } else {
         this.checkTaskLoad();
         this.noticeUi();
      }

   }

   public void sendHeroPalaceData() {
      this.tryRepairHeroSkillDir();
      HeroPalaceDao dao = (HeroPalaceDao)this.player.getData("tb_hero_palace", this.player.getPlayerId());
      HeroPalaceMsg.S2C_OpenMainUi_18402.Builder builder = HeroPalaceMsg.S2C_OpenMainUi_18402.newBuilder();
      builder.setTitleLv(this.player.getPublicDao().palaceTitle);
      builder.setHeroCode(dao.heroCode);
      builder.setShareCode(dao.shareCode);

      for(Map.Entry<Integer, Integer> entry : dao.skills.entrySet()) {
         CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
         info.setKey((Integer)entry.getKey());
         info.setValue((Integer)entry.getValue());
      }

      builder.addAllHeroSkillDir(dao.heroSkillDir);
      builder.addAllDestinySkillDir(dao.destinySkillDir.values());
      builder.addAllKingSkillDir(dao.kingSkillDir);

      for(Map.Entry<Integer, Integer> entry : dao.destinySkills.entrySet()) {
         CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
         info.setKey((Integer)entry.getKey());
         info.setValue((Integer)entry.getValue());
         builder.addDestinySkills(info);
      }

      this.player.sendMsg(builder.build());
   }

   public HeroDao unlockHeroPalace() {
      logger.info("根据玩家性别初始化一个英雄，默认为神阵营猛将");
      int defaultHeroId = this.configManager.getIntDefault(HERO_PALACE_DEFAULT_HEROID, 30064);
      HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", defaultHeroId);
      if (heroModel == null) {
         return null;
      } else if (heroModel.getHeroSpType() != HeroDefine.HERO_SP_TYPE_PALACE) {
         return null;
      } else if (!heroModel.getSkills().containsKey(1)) {
         return null;
      } else {
         List<Integer> unlockHeroDressId = this.configManager.getIntList(HERO_PALACE_DEFAULT_HERODRESSID);
         if (unlockHeroDressId.size() < 2) {
            logger.error("没有配置默认君主府武将皮肤={}", HERO_PALACE_DEFAULT_HERODRESSID);
            unlockHeroDressId.add(14001);
            unlockHeroDressId.add(15001);
         }

         int sex = this.player.getPublicDao().sex;
         int dressId = (Integer)unlockHeroDressId.get(sex - 1);
         HeroDressModel heroDressModel = (HeroDressModel)this.player.getGameModelPool().getEntity("heroDress", dressId);
         if (heroDressModel == null) {
            return null;
         } else {
            ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", heroDressModel.getItemId());
            if (itemModel == null) {
               return null;
            } else {
               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               HeroDao heroDao = heroBagPart.insertHeroPalace(heroModel);
               if (heroDao == null) {
                  return null;
               } else {
                  logger.info("玩家={}，解锁君主英雄成功，code={}", this.player.getPlayerId(), heroDao.code);
                  HeroPalaceDao dao = (HeroPalaceDao)this.player.getData("tb_hero_palace", this.player.getPlayerId());
                  dao.skills.put(0, heroModel.getSkills().get(1));
                  dao.heroCode = heroDao.code;
                  dao.updateOp();
                  PlayerDao playerDao = this.player.getPlayerDao();
                  playerDao.palaceTitle = 1;
                  playerDao.updateOp();
                  this.calHeroPalaceAddProperty(dao);
                  heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_ALL, heroDao);
                  this.addPalaceDress(heroDressModel, itemModel, heroDao.code);
                  return heroDao;
               }
            }
         }
      }
   }

   private void addPalaceDress(HeroDressModel heroDressModel, ItemModel itemModel, int heroCode) {
      HeroDressPart heroDressPart = (HeroDressPart)this.player.getMgrPart(HeroDressPart.class);
      heroDressPart.addHeroDress(heroDressModel, itemModel);
      heroDressPart.wearDress(heroCode, heroDressModel.getId());
      List<Integer> heroIdList = new ArrayList();
      heroIdList.add(heroDressModel.getChangedHeroId());
      MonarchPart monarchPart = (MonarchPart)this.player.getMgrPart(MonarchPart.class);
      monarchPart.addHeroMonarch(heroIdList);
   }

   public void shareHero(int shareHeroCode) {
      HeroPalaceDao dao = (HeroPalaceDao)this.player.getData("tb_hero_palace", this.player.getPlayerId());
      if (dao.heroCode > 0) {
         if (dao.shareCode <= 0) {
            HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
            HeroDao shareHeroDao = heroBagPart.getHeroByCode(shareHeroCode);
            if (shareHeroDao != null) {
               HeroModel shareHeroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", shareHeroDao.id);
               if (shareHeroModel != null) {
                  if (shareHeroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_LINK) {
                     this.player.failure(76505);
                  } else {
                     int needStar = this.configManager.getIntDefault(HERO_PALACE_STAR_LIMIT, 10);
                     if (shareHeroDao.getStar() >= needStar) {
                        HeroDao heroDao = heroBagPart.getHeroByCode(dao.heroCode);
                        if (heroDao != null) {
                           HeroModel palaceHeroModel = this.getHeroModelByTypeAndNation(shareHeroModel.getType(), shareHeroModel.getNation());
                           if (palaceHeroModel != null) {
                              if (shareHeroModel.getNation() != 10) {
                                 dao.shareCode = shareHeroDao.code;
                                 dao.skills.clear();
                                 dao.skills.put(0, palaceHeroModel.getSkills().get(1));
                                 dao.updateOp();
                                 heroDao.setStar(shareHeroDao.getStar());
                                 heroDao.id = palaceHeroModel.getId();
                                 heroDao.shareHeroId = shareHeroDao.id;
                                 heroDao.updateOp();
                                 heroBagPart.sendHeroList2ClientByHeroDao(shareHeroDao);
                                 heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_ALL, heroDao);
                                 HeroPalaceMsg.S2C_ShareHero_18406.Builder builder = HeroPalaceMsg.S2C_ShareHero_18406.newBuilder();
                                 builder.setResult(1);
                                 builder.setType(HeroPalaceMsg.ShareType.SHARETYPE_SHARE);
                                 builder.setHeroCode(shareHeroCode);
                                 this.player.sendMsg(builder.build());
                                 this.player.getOperationMgr().addExtraLog(this.player, 219, "帝王传承-共享", shareHeroCode + "");
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

   public void updateHero(int shareHeroCode) {
      HeroPalaceDao dao = (HeroPalaceDao)this.player.getData("tb_hero_palace", this.player.getPlayerId());
      if (dao.heroCode > 0) {
         if (dao.shareCode > 0) {
            HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
            HeroDao shareHeroDao = heroBagPart.getHeroByCode(shareHeroCode);
            if (shareHeroDao != null) {
               HeroModel shareHeroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", shareHeroDao.id);
               if (shareHeroModel != null) {
                  if (shareHeroModel.getNation() != 10) {
                     if (shareHeroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_LINK) {
                        this.player.failure(76505);
                     } else {
                        int needStar = this.configManager.getIntDefault(HERO_PALACE_STAR_LIMIT, 10);
                        if (shareHeroDao.getStar() >= needStar) {
                           HeroDao heroDao = heroBagPart.getHeroByCode(dao.heroCode);
                           if (heroDao != null) {
                              HeroModel oldPalaceHeroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
                              if (oldPalaceHeroModel != null) {
                                 HeroModel newPalaceHeroModel = this.getHeroModelByTypeAndNation(shareHeroModel.getType(), shareHeroModel.getNation());
                                 if (newPalaceHeroModel != null) {
                                    int oldStar = heroDao.getStar();
                                    int oldLv = heroDao.getLv();
                                    int oldHeroId = heroDao.id;
                                    dao.shareCode = shareHeroDao.code;
                                    if (oldPalaceHeroModel.getType() != newPalaceHeroModel.getType()) {
                                       dao.skills.clear();
                                    }

                                    dao.skills.put(0, newPalaceHeroModel.getSkills().get(1));
                                    dao.updateOp();
                                    heroDao.setStar(shareHeroDao.getStar());
                                    heroDao.id = newPalaceHeroModel.getId();
                                    heroDao.shareHeroId = shareHeroDao.id;
                                    HeroPalaceMsg.S2C_ShareHero_18406.Builder builder = HeroPalaceMsg.S2C_ShareHero_18406.newBuilder();
                                    boolean mustUnload = false;
                                    HeroAidePart heroAidePart = (HeroAidePart)this.player.getMgrPart(HeroAidePart.class);
                                    if (heroDao.aide > 0) {
                                       boolean isSameNation = oldPalaceHeroModel.getNation() == shareHeroModel.getNation();
                                       if (!isSameNation) {
                                          CommonMsg.ItemInfo.Builder aide = heroAidePart.handleHeroAideDown(heroDao, 1, false);
                                          if (aide != null) {
                                             builder.addItems(aide);
                                          }

                                          mustUnload = true;
                                          heroDao.aideTrammelsId = 0;
                                       }
                                    }

                                    if (heroDao.aide2 > 0) {
                                       AideLevelModel aideLevelModel = (AideLevelModel)ApplicationContextProvider.getModelPoolEntity("aideLevel", heroDao.aide2);
                                       if (!mustUnload && aideLevelModel != null) {
                                          ItemModel aideModel1 = (ItemModel)ApplicationContextProvider.getModelPoolEntity("item", aideLevelModel.getAideId());
                                          if (aideModel1 != null && aideModel1.getCamp() == shareHeroModel.getNation()) {
                                             mustUnload = true;
                                          }
                                       }

                                       if (mustUnload) {
                                          CommonMsg.ItemInfo.Builder aide = heroAidePart.handleHeroAideDown(heroDao, 2, true);
                                          if (aide != null) {
                                             builder.addItems(aide);
                                          }

                                          heroDao.aideTrammelsId = 0;
                                       }
                                    }

                                    List<ResourceModel> addList = new ArrayList();
                                    if (oldStar > heroDao.getStar()) {
                                       int enableLv = MonsterManager.getLvByStar(heroDao.getStar());
                                       if (oldLv > enableLv) {
                                          for(int i = enableLv; i < oldLv; ++i) {
                                             UpgradeModel model = (UpgradeModel)this.player.getGameModelPool().getEntity("upgrade", i);
                                             if (model != null) {
                                                ResourceModel.addResourceToList(addList, new ResourceModel(1, PlayerDefine.PLAYER_HERO_EXP, model.getExpCost()));
                                                ResourceModel.addResourceToList(addList, new ResourceModel(1, PlayerDefine.PLAYER_COPPER, model.getSilverCost()));
                                             }
                                          }

                                          heroDao.setLv(enableLv);
                                       }
                                    }

                                    heroDao.updateOp();
                                    HeroWearPart heroWearPart = (HeroWearPart)this.player.getMgrPart(HeroWearPart.class);
                                    List<Integer> forgetList = new ArrayList();

                                    for(Map.Entry<Integer, Integer> entry : heroDao.warcrafts.entrySet()) {
                                       if ((Integer)entry.getValue() > 0) {
                                          boolean isEnable = heroWearPart.isEnableWear(heroDao, CommonMsg.WearPosition.forNumber((Integer)entry.getKey()), CommonMsg.WearType.WEARTYPE_WARCRAFT);
                                          if (!isEnable) {
                                             forgetList.add(entry.getKey());
                                          }
                                       }
                                    }

                                    if (!forgetList.isEmpty()) {
                                       for(ResourceModel resourceModel : heroWearPart.forgetWarcraft(heroDao, forgetList, true)) {
                                          ResourceModel.addResourceToList(addList, resourceModel);
                                       }
                                    }

                                    HeroStarAtlasPart heroStarAtlasPart = (HeroStarAtlasPart)this.player.getMgrPart(HeroStarAtlasPart.class);
                                    List<ResourceModel> starMapResetReturnRewards = heroStarAtlasPart.getStarMapResetReturnRewards(dao.heroCode);
                                    if (starMapResetReturnRewards != null && !starMapResetReturnRewards.isEmpty()) {
                                       for(ResourceModel resourceModel : starMapResetReturnRewards) {
                                          ResourceModel.addResourceToList(addList, resourceModel);
                                       }
                                    }

                                    heroDao.starMap.clear();
                                    heroDao.palaceStarSkill.clear();
                                    if (!addList.isEmpty()) {
                                       this.player.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 90, 9008, 0, 0, "");
                                    }

                                    heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_ALL, heroDao);
                                    builder.setResult(1);
                                    builder.setType(HeroPalaceMsg.ShareType.SHARETYPE_SHARE);
                                    builder.setHeroCode(shareHeroCode);
                                    if (!addList.isEmpty()) {
                                       for(ResourceModel resourceModel : addList) {
                                          builder.addItems(resourceModel.builder());
                                       }
                                    }

                                    this.player.sendMsg(builder.build());
                                    this.player.getOperationMgr().addExtraLog(this.player, 219, "帝王传承-替换", shareHeroCode + "");
                                    Map<Integer, HeroDressDao> map = this.player.<Integer, HeroDressDao>getMap("tb_hero_dress", this.player.getPlayerId());

                                    for(Map.Entry<Integer, HeroDressDao> entry : map.entrySet()) {
                                       if (((HeroDressDao)entry.getValue()).heroId == oldHeroId) {
                                          ((HeroDressDao)entry.getValue()).heroId = heroDao.id;
                                          ((HeroDressDao)entry.getValue()).updateOp();
                                          break;
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

   public void shareHeroPreview(int heroCode) {
      if (this.player.isSystemOpen(3960)) {
         HeroPalaceDao dao = (HeroPalaceDao)this.player.getData("tb_hero_palace", this.player.getPlayerId());
         if (dao.heroCode > 0) {
            if (dao.shareCode != heroCode) {
               HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
               HeroDao shareHeroDao = heroBagPart.getHeroByCode(heroCode);
               if (shareHeroDao != null) {
                  HeroModel shareHeroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", shareHeroDao.id);
                  if (shareHeroModel != null) {
                     int needStar = this.configManager.getIntDefault(HERO_PALACE_STAR_LIMIT, 10);
                     if (shareHeroDao.getStar() >= needStar) {
                        HeroDao heroDao = heroBagPart.getHeroByCode(dao.heroCode);
                        if (heroDao != null) {
                           HeroModel oldPalaceHeroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
                           if (oldPalaceHeroModel != null) {
                              HeroModel newPalaceHeroModel = this.getHeroModelByTypeAndNation(shareHeroModel.getType(), shareHeroModel.getNation());
                              if (newPalaceHeroModel != null) {
                                 int oldStar = heroDao.getStar();
                                 int newLv = heroDao.getLv();
                                 if (oldStar > shareHeroDao.getStar()) {
                                    int enableLv = MonsterManager.getLvByStar(heroDao.getStar());
                                    if (newLv > enableLv) {
                                       newLv = enableLv;
                                    }
                                 }

                                 Map<Integer, Integer> skills = new HashMap();
                                 if (oldPalaceHeroModel.getType() == newPalaceHeroModel.getType()) {
                                    skills.putAll(dao.skills);
                                 }

                                 boolean isSameNation = oldPalaceHeroModel.getNation() == shareHeroModel.getNation();
                                 HeroWearPart heroWearPart = (HeroWearPart)this.player.getMgrPart(HeroWearPart.class);
                                 Map<Integer, Integer> warcrafts = new HashMap();

                                 for(Map.Entry<Integer, Integer> entry : heroDao.warcrafts.entrySet()) {
                                    if ((Integer)entry.getValue() > 0) {
                                       boolean isEnable = heroWearPart.isEnableWear(heroDao, CommonMsg.WearPosition.forNumber((Integer)entry.getKey()), CommonMsg.WearType.WEARTYPE_WARCRAFT);
                                       if (isEnable) {
                                          warcrafts.put(entry.getKey(), entry.getValue());
                                       }
                                    }
                                 }

                                 HeroInfo heroInfo = new HeroInfo(this.player.getPlayerId(), heroDao, newPalaceHeroModel.getId(), shareHeroModel.getId(), newLv + heroDao.getPromoteLv(), shareHeroDao.getStar(), isSameNation, skills, warcrafts);
                                 HeroPalaceMsg.S2C_ShareHeroPreview_18410.Builder builder = HeroPalaceMsg.S2C_ShareHeroPreview_18410.newBuilder();
                                 builder.setHeroInfo(heroInfo.getHeroDaoForPalace().toHeroInfo());
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
   }

   public void addHeroSkll(List<Integer> skills) {
      if (skills.size() == HeroDefine.PALACE_HERO_SKILL_NUM) {
         List<Integer> skillList = new ArrayList();

         for(Integer skillId : skills) {
            if (skillId > 0) {
               if (skillList.contains(skillId)) {
                  logger.error("玩家={}，技能有重复={},List={}", new Object[]{this.player.getPlayerId(), skillId, skills});
                  return;
               }

               skillList.add(skillId);
            }
         }

         HeroPalaceDao dao = (HeroPalaceDao)this.player.getData("tb_hero_palace", this.player.getPlayerId());
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         HeroDao heroDao = heroBagPart.getHeroByCode(dao.heroCode);
         if (heroDao != null) {
            HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
            if (heroModel != null) {
               for(int i = 0; i < HeroDefine.PALACE_HERO_SKILL_NUM; ++i) {
                  int skillId = (Integer)skills.get(i);
                  if (skillId > 0) {
                     int index = i + 1;
                     if (dao.heroSkillDir.contains(skillId)) {
                        LeaderPalaceSkillConsumeModel model = (LeaderPalaceSkillConsumeModel)this.player.getGameModelPool().getEntity("leaderPalaceSkillConsume", skillId);
                        if (model == null) {
                           return;
                        }

                        if (model.getIndex() != index) {
                           return;
                        }

                        if (model.getJob() != heroModel.getType()) {
                           return;
                        }
                     } else {
                        if (!dao.kingSkillDir.contains(skillId)) {
                           return;
                        }

                        LeaderTacticsSkillModel model = (LeaderTacticsSkillModel)this.player.getGameModelPool().getEntity("leaderTacticsSkill", skillId);
                        if (model == null) {
                           return;
                        }

                        if (model.getType() != index) {
                           return;
                        }

                        String job = String.valueOf(heroModel.getType());
                        if (!model.getJob().contains(job)) {
                           return;
                        }
                     }
                  }
               }

               for(int i = 0; i < HeroDefine.PALACE_HERO_SKILL_NUM; ++i) {
                  dao.skills.put(i + 1, skills.get(i));
               }

               dao.updateOp();
               heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODULE_HERO_PALACE, heroDao);
               HeroPalaceMsg.S2C_LearnHeroSkill_18412.Builder builder = HeroPalaceMsg.S2C_LearnHeroSkill_18412.newBuilder();
               builder.setResult(1);
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   public void unlockKingSkill(int skillId, List<Integer> codes) {
      HeroPalaceDao dao = this.getHeroPalaceDao();
      if (!dao.kingSkillDir.contains(skillId)) {
         LeaderTacticsSkillModel model = (LeaderTacticsSkillModel)this.player.getGameModelPool().getEntity("leaderTacticsSkill", skillId);
         if (model != null) {
            if (model.getNeedDestinyId() <= 0 || this.isEnableDestinySkill(dao, model.getNeedDestinyId())) {
               if (model.getNeedDestinySumLv() <= 0 || model.getNeedDestinySumLv() <= this.getTotalDestinySkillLv(dao)) {
                  if (this.player.checkResourceNum(model.getItems())) {
                     if (!model.getHeros().isEmpty()) {
                        List<Integer> codeList = new ArrayList();

                        for(Integer heroCode : codes) {
                           if (codeList.contains(heroCode)) {
                              logger.error("玩家={}，code有重复={},List={}", new Object[]{this.player.getPlayerId(), heroCode, codeList});
                              return;
                           }

                           codeList.add(heroCode);
                        }

                        List<Integer> delList = new ArrayList();
                        HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                        if (!heroBagPart.isEnableDelHero(codeList)) {
                           return;
                        }

                        for(KeyValFun hero : model.getHeros()) {
                           for(int i = 0; i < hero.getVal(); ++i) {
                              boolean isHaveHero = false;

                              for(Integer code : codeList) {
                                 HeroDao heroDao = heroBagPart.getHeroByCode(code);
                                 if (heroDao.id == hero.getKey()) {
                                    isHaveHero = true;
                                    delList.add(code);
                                    codeList.remove(code);
                                    break;
                                 }
                              }

                              if (!isHaveHero) {
                                 return;
                              }
                           }
                        }

                        boolean success = heroBagPart.deleteHero(delList, HeroDefine.DelHeroType.DEL_USE, 90, 9010, 0, 0, "");
                        if (!success) {
                           return;
                        }
                     }

                     this.player.delResource((List)model.getItems(), 90, 9010, 0, 0, "");
                     dao.kingSkillDir.add(skillId);
                     dao.updateOp();
                     HeroPalaceMsg.S2C_UnlockKingSkill_18414.Builder builder = HeroPalaceMsg.S2C_UnlockKingSkill_18414.newBuilder();
                     builder.setResult(1);
                     builder.setId(skillId);
                     builder.addAllKingSkillDir(dao.kingSkillDir);
                     this.player.sendMsg(builder.build());
                  }
               }
            }
         }
      }
   }

   public void unlockDestinySkill(int skillId) {
      HeroPalaceDao dao = this.getHeroPalaceDao();
      if (dao.destinySkillDir.values().contains(skillId)) {
         logger.error("玩家={}，天命技能{}已经解锁,解锁技能={}", new Object[]{this.player.getPlayerId(), skillId, dao.destinySkillDir.values()});
      } else {
         LeaderTacticsDestinyModel model = (LeaderTacticsDestinyModel)this.player.getGameModelPool().getEntity("leaderTacticsDestiny", skillId);
         if (model != null) {
            if (model.getLv() == 1) {
               if (!this.player.checkResourceNum(model.getItems())) {
                  for(ResourceModel item : model.getItems()) {
                     if (item.getType() == 2 && item.getId() != 1001) {
                        logger.info("缺少物品id={}", item.getId());
                     }
                  }

               } else if (model.getNeedDestinyId() <= 0 || this.isEnableDestinySkill(dao, model.getNeedDestinyId())) {
                  if (model.getSkillId() <= 0 || this.isEnableHeroSkill(dao, model.getSkillId())) {
                     if (model.getNeedDestinySumLv() <= 0 || model.getNeedDestinySumLv() <= this.getTotalDestinySkillLv(dao)) {
                        this.player.delResource((List)model.getItems(), 90, 9005, 0, 0, "");
                        String key = model.getType() + "_" + model.getBreach();
                        dao.destinySkillDir.put(key, skillId);
                        dao.updateOp();
                        this.calHeroPalaceAddProperty(dao);
                        HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                        heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODULE_HERO_PALACE);
                        HeroPalaceMsg.S2C_UnlockDestinySkill_18422.Builder builder = HeroPalaceMsg.S2C_UnlockDestinySkill_18422.newBuilder();
                        builder.setResult(1);
                        builder.setSkillId(skillId);
                        builder.addAllDestinySkillDir(dao.destinySkillDir.values());
                        this.player.sendMsg(builder.build());
                        this.player.getOperationMgr().addExtraLog(this.player, 219, "天命战法-解锁", skillId + "");
                     }
                  }
               }
            }
         }
      }
   }

   public void upgradeDestinySkill(int skillId) {
      HeroPalaceDao dao = this.getHeroPalaceDao();
      if (dao.destinySkillDir.values().contains(skillId)) {
         LeaderTacticsDestinyModel currentModel = (LeaderTacticsDestinyModel)this.player.getGameModelPool().getEntity("leaderTacticsDestiny", skillId);
         if (currentModel != null) {
            if (currentModel.getNext() > 0) {
               LeaderTacticsDestinyModel nextModel = (LeaderTacticsDestinyModel)this.player.getGameModelPool().getEntity("leaderTacticsDestiny", currentModel.getNext());
               if (nextModel != null) {
                  if (nextModel.getNeedDestinyId() <= 0 || this.isEnableDestinySkill(dao, nextModel.getNeedDestinyId())) {
                     if (nextModel.getSkillId() <= 0 || this.isEnableHeroSkill(dao, nextModel.getSkillId())) {
                        if (nextModel.getNeedDestinySumLv() <= 0 || nextModel.getNeedDestinySumLv() <= this.getTotalDestinySkillLv(dao)) {
                           if (!this.player.checkResourceNum(nextModel.getItems())) {
                              for(ResourceModel item : nextModel.getItems()) {
                                 if (item.getType() == 2 && item.getId() != 1001) {
                                    logger.info("缺少物品id={}", item.getId());
                                 }
                              }

                           } else {
                              this.player.delResource((List)nextModel.getItems(), 90, 9006, 0, 0, "");
                              String destinySkillDirKey = this.getDestinySkillDirKey(nextModel);
                              dao.destinySkillDir.put(destinySkillDirKey, nextModel.getId());

                              for(Map.Entry<Integer, Integer> entry : dao.destinySkills.entrySet()) {
                                 LeaderTacticsDestinyModel tempModel = (LeaderTacticsDestinyModel)this.player.getGameModelPool().getEntity("leaderTacticsDestiny", entry.getValue());
                                 if (tempModel != null) {
                                    String key = this.getDestinySkillDirKey(tempModel);
                                    if (destinySkillDirKey.equals(key)) {
                                       dao.destinySkills.put(entry.getKey(), nextModel.getId());
                                    }
                                 }
                              }

                              dao.updateOp();
                              this.calHeroPalaceAddProperty(dao);
                              HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                              heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODULE_HERO_PALACE);
                              HeroPalaceMsg.S2C_UpgradeDestinySkill_18424.Builder builder = HeroPalaceMsg.S2C_UpgradeDestinySkill_18424.newBuilder();
                              builder.setResult(1);
                              builder.setSkillId(skillId);
                              builder.addAllDestinySkillDir(dao.destinySkillDir.values());
                              this.player.sendMsg(builder.build());
                              this.player.getOperationMgr().addExtraLog(this.player, 219, "天命战法-升级", nextModel.getId() + "");
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void learnDestinySkill(List<Integer> skills) {
      if (skills.size() == HeroDefine.PALACE_DESTINY_SKILL_NUM) {
         List<Integer> skillList = new ArrayList();
         Set<String> typeSet = new HashSet();

         for(Integer skillId : skills) {
            if (skillId > 0) {
               if (skillList.contains(skillId)) {
                  logger.error("玩家={}，技能有重复={},List={}", new Object[]{this.player.getPlayerId(), skillId, skills});
                  return;
               }

               LeaderTacticsDestinyModel model = (LeaderTacticsDestinyModel)this.player.getGameModelPool().getEntity("leaderTacticsDestiny", skillId);
               if (model != null) {
                  String key = this.getDestinySkillDirKey(model);
                  if (typeSet.contains(key)) {
                     logger.error("玩家={}，技能类型有重复={},List={}", new Object[]{this.player.getPlayerId(), skillId, skills});
                     return;
                  }

                  typeSet.add(key);
                  skillList.add(skillId);
               }
            }
         }

         HeroPalaceDao dao = this.getHeroPalaceDao();

         for(int i = 0; i < HeroDefine.PALACE_DESTINY_SKILL_NUM; ++i) {
            if (i == 1 && (Integer)skills.get(1) > 0) {
               int needPalaceTitleLv = this.configManager.getIntDefault(HERO_PALACE_NEED_TITLE_LV, 1);
               if (this.player.getPublicDao().palaceTitle < needPalaceTitleLv) {
                  this.player.failure(76049);
                  return;
               }
            }
         }

         for(int i = 0; i < HeroDefine.PALACE_DESTINY_SKILL_NUM; ++i) {
            dao.destinySkills.put(i + 1, skills.get(i));
         }

         dao.updateOp();
         this.calHeroPalaceAddProperty(dao);
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         HeroDao heroDao = heroBagPart.getHeroByCode(dao.heroCode);
         heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODULE_HERO_PALACE, heroDao);
         HeroPalaceMsg.S2C_LearnDestinySkill_18426.Builder builder = HeroPalaceMsg.S2C_LearnDestinySkill_18426.newBuilder();
         builder.setResult(1);
         this.player.sendMsg(builder.build());
         StringBuilder strSkill = new StringBuilder();

         for(Integer skill : skills) {
            strSkill.append(skill + "|");
         }

         this.player.getOperationMgr().addExtraLog(this.player, 219, "天命战法-学习天命技能", strSkill.toString());
      }
   }

   public void unlockHeroSkill(int skillId, List<Integer> codes) {
      List<Integer> codeList = new ArrayList();

      for(Integer heroCode : codes) {
         if (codeList.contains(heroCode)) {
            logger.error("玩家={}，code有重复={},List={}", new Object[]{this.player.getPlayerId(), heroCode, codeList});
            return;
         }

         codeList.add(heroCode);
      }

      Map<Integer, Integer> heroIdMap = new HashMap();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);

      for(Integer code : codes) {
         HeroDao heroDao = heroBagPart.getHeroByCode(code);
         if (heroDao == null) {
            return;
         }

         if (heroDao.isHaveArrayingState()) {
            return;
         }

         if (heroDao.type == HeroDefine.HERO_SP_TYPE_PALACE) {
            return;
         }

         int oldNum = (Integer)heroIdMap.getOrDefault(heroDao.id, 0);
         heroIdMap.put(heroDao.id, oldNum + 1);
      }

      LeaderPalaceSkillConsumeModel consumeModel = (LeaderPalaceSkillConsumeModel)this.player.getGameModelPool().getEntity("leaderPalaceSkillConsume", skillId);
      if (consumeModel != null) {
         if (consumeModel.getLv() != 1) {
            logger.error("只有1级技能才可以解锁,skillId={}，lv={}", skillId, consumeModel.getLv());
         } else {
            HeroModel BaseHeroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", consumeModel.getBaseHeroId());
            if (BaseHeroModel != null) {
               if (BaseHeroModel.getPalaceSkill() == HeroDefine.PALACE_SKILL_YES) {
                  HeroPalaceDao dao = this.getHeroPalaceDao();
                  if (dao.heroSkillDir.contains(skillId)) {
                     logger.error("玩家={}，技能{}已经演练，演练列表", new Object[]{this.player.getPlayerId(), skillId, dao.heroSkillDir});
                  } else {
                     int count = 0;

                     LeaderPalaceSkillConsumeModel nextConsumeModel;
                     for(int nextSkillId = consumeModel.getNext(); count++ < 1000; nextSkillId = nextConsumeModel.getNext()) {
                        nextConsumeModel = (LeaderPalaceSkillConsumeModel)this.player.getGameModelPool().getEntity("leaderPalaceSkillConsume", nextSkillId);
                        if (nextConsumeModel == null) {
                           break;
                        }

                        if (dao.heroSkillDir.contains(nextSkillId)) {
                           logger.error("玩家={}，试图解锁技能{}，但他已经有更高级的同类技能{}", new Object[]{this.player.getPlayerId(), skillId, nextSkillId});
                           return;
                        }
                     }

                     Map<Integer, Integer> consumerHeroMap = new HashMap();

                     for(KeyValFun hero : consumeModel.getHeros()) {
                        consumerHeroMap.put(hero.getKey(), hero.getVal());
                     }

                     if (!consumerHeroMap.equals(heroIdMap)) {
                        logger.error("玩家={}，消耗英雄不对，需要={}，实际={}", new Object[]{this.player.getPlayerId(), Convert.toStr(consumerHeroMap), Convert.toStr(heroIdMap)});
                     } else if (this.player.checkResourceNum(consumeModel.getItems())) {
                        boolean isSuccess = heroBagPart.deleteHero(codes, HeroDefine.DelHeroType.DEL_USE, 90, 9002, 0, 0, "");
                        if (isSuccess) {
                           this.player.delResource((List)consumeModel.getItems(), 90, 9002, 0, 0, "");
                           dao.heroSkillDir.add(skillId);
                           dao.updateOp();
                           HeroPalaceMsg.S2C_UnlockHeroSkill_18434.Builder builder = HeroPalaceMsg.S2C_UnlockHeroSkill_18434.newBuilder();
                           builder.setResult(1);
                           builder.setSkillId(skillId);
                           builder.addAllHeroSkillDir(dao.heroSkillDir);
                           this.player.sendMsg(builder.build());
                           this.player.getOperationMgr().addExtraLog(this.player, 218, "战技演练-解锁", skillId + "");
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void upgradeHeroSkill(int skillId, List<Integer> codes) {
      List<Integer> codeList = new ArrayList();

      for(Integer heroCode : codes) {
         if (codeList.contains(heroCode)) {
            logger.error("玩家={}，code有重复={},List={}", new Object[]{this.player.getPlayerId(), heroCode, codeList});
            return;
         }

         codeList.add(heroCode);
      }

      Map<Integer, Integer> heroIdMap = new HashMap();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      if (heroBagPart.isEnableDelHero(codeList)) {
         for(Integer code : codes) {
            HeroDao heroDao = heroBagPart.getHeroByCode(code);
            if (heroDao == null) {
               return;
            }

            if (heroDao.type == HeroDefine.HERO_SP_TYPE_PALACE) {
               return;
            }

            int oldNum = (Integer)heroIdMap.getOrDefault(heroDao.id, 0);
            heroIdMap.put(heroDao.id, oldNum + 1);
         }

         LeaderPalaceSkillConsumeModel baseConsumeModel = (LeaderPalaceSkillConsumeModel)this.player.getGameModelPool().getEntity("leaderPalaceSkillConsume", skillId);
         if (baseConsumeModel != null) {
            if (baseConsumeModel.getNext() <= 0) {
               logger.info("技能没有下一级，skillId={}", skillId);
            } else {
               LeaderPalaceSkillConsumeModel nextConsumeModel = (LeaderPalaceSkillConsumeModel)this.player.getGameModelPool().getEntity("leaderPalaceSkillConsume", baseConsumeModel.getNext());
               if (nextConsumeModel == null) {
                  logger.info("下一级技能模板为空，skillId={}", skillId);
               } else {
                  HeroModel BaseHeroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", nextConsumeModel.getBaseHeroId());
                  if (BaseHeroModel != null) {
                     if (BaseHeroModel.getPalaceSkill() == HeroDefine.PALACE_SKILL_YES) {
                        HeroPalaceDao dao = this.getHeroPalaceDao();
                        if (!dao.heroSkillDir.contains(skillId)) {
                           logger.error("玩家={}，解锁技能列表不包含该技能，演练列表", new Object[]{this.player.getPlayerId(), skillId, dao.heroSkillDir});
                        } else if (dao.heroSkillDir.contains(nextConsumeModel.getBaseSkillId())) {
                           logger.error("玩家={}，技能{}已经演练，演练列表", new Object[]{this.player.getPlayerId(), nextConsumeModel.getBaseSkillId(), dao.heroSkillDir});
                        } else {
                           Map<Integer, Integer> consumerHeroMap = new HashMap();

                           for(KeyValFun hero : nextConsumeModel.getHeros()) {
                              consumerHeroMap.put(hero.getKey(), hero.getVal());
                           }

                           if (!consumerHeroMap.equals(heroIdMap)) {
                              logger.error("玩家={}，消耗英雄不对，需要={}，实际={}", new Object[]{this.player.getPlayerId(), Convert.toStr(consumerHeroMap), Convert.toStr(heroIdMap)});
                           } else if (this.player.checkResourceNum(nextConsumeModel.getItems())) {
                              boolean isSuccess = heroBagPart.deleteHero(codes, HeroDefine.DelHeroType.DEL_USE, 90, 9003, 0, 0, "");
                              if (isSuccess) {
                                 this.player.delResource((List)nextConsumeModel.getItems(), 90, 9002, 0, 0, "");
                                 boolean isUpdate = false;
                                 if (dao.skills.containsValue(skillId)) {
                                    for(Map.Entry<Integer, Integer> entry : dao.skills.entrySet()) {
                                       if ((Integer)entry.getValue() == skillId) {
                                          dao.skills.put(entry.getKey(), nextConsumeModel.getBaseSkillId());
                                          isUpdate = true;
                                       }
                                    }

                                    if (dao.heroCode > 0) {
                                       HeroDao palaceHeroDao = heroBagPart.getHeroByCode(dao.heroCode);
                                       heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODULE_HERO_PALACE, palaceHeroDao);
                                    }
                                 }

                                 dao.heroSkillDir.remove(skillId);
                                 dao.heroSkillDir.add(nextConsumeModel.getBaseSkillId());
                                 dao.updateOp();
                                 if (isUpdate) {
                                    this.sendHeroPalaceData();
                                 }

                                 HeroPalaceMsg.S2C_UpgradeHeroSkill_18436.Builder builder = HeroPalaceMsg.S2C_UpgradeHeroSkill_18436.newBuilder();
                                 builder.setResult(1);
                                 builder.setSkillId(skillId);
                                 builder.setNewSkillId(nextConsumeModel.getBaseSkillId());
                                 builder.addAllHeroSkillDir(dao.heroSkillDir);
                                 this.player.sendMsg(builder.build());
                                 this.player.getOperationMgr().addExtraLog(this.player, 218, "战技演练-升级", nextConsumeModel.getBaseSkillId() + "");
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

   public void resetHeroSkill(int skillId) {
      LeaderPalaceSkillConsumeModel currentConsumeModel = (LeaderPalaceSkillConsumeModel)this.player.getGameModelPool().getEntity("leaderPalaceSkillConsume", skillId);
      if (currentConsumeModel != null) {
         if (currentConsumeModel.getLv() <= 1) {
            logger.info("玩家={}，解锁技能不能重置，skillId={}", this.player.getPlayerId(), skillId);
         } else {
            List<ResourceModel> resetConsume = this.configManager.getResourceModelList(HERO_PALACE_RESET_SKILL_CONSUME, "1|9|200");
            if (resetConsume.size() > 0) {
               if (this.player.checkResourceNum(resetConsume)) {
                  HeroPalaceDao dao = this.getHeroPalaceDao();
                  if (!dao.heroSkillDir.contains(skillId)) {
                     logger.error("玩家={}，解锁技能列表不包含该技能={}，演练列表={}", new Object[]{this.player.getPlayerId(), skillId, dao.heroSkillDir});
                  } else {
                     List<ResourceModel> addList = new ArrayList();
                     SkillModel skillModel = (SkillModel)this.player.getGameModelPool().getEntity("skill", currentConsumeModel.getBaseSkillId());
                     if (skillModel != null) {
                        while(skillModel.getLastSkillid() > 0) {
                           LeaderPalaceSkillConsumeModel consumeModel = (LeaderPalaceSkillConsumeModel)this.player.getGameModelPool().getEntity("leaderPalaceSkillConsume", skillModel.getId());
                           if (consumeModel != null) {
                              for(ResourceModel item : consumeModel.getItems()) {
                                 ResourceModel.addResourceToList(addList, item);
                              }

                              for(KeyValFun hero : consumeModel.getHeros()) {
                                 ResourceModel resourceModel = new ResourceModel(2, hero.getKey(), hero.getVal() * 50);
                                 ResourceModel.addResourceToList(addList, resourceModel);
                              }
                           }

                           SkillModel tempSkillModel = (SkillModel)this.player.getGameModelPool().getEntity("skill", skillModel.getLastSkillid());
                           if (tempSkillModel == null) {
                              break;
                           }

                           skillModel = tempSkillModel;
                        }

                        this.player.delResource((List)resetConsume, 90, 9004, 0, 0, "");
                        this.player.addResource(addList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 90, 9004, 0, 0, "");
                        dao.heroSkillDir.remove(skillId);
                        dao.heroSkillDir.add(skillModel.getId());
                        dao.updateOp();
                        if (dao.skills.containsValue(skillId)) {
                           for(Map.Entry<Integer, Integer> entry : dao.skills.entrySet()) {
                              if ((Integer)entry.getValue() == skillId) {
                                 dao.skills.put(entry.getKey(), skillModel.getId());
                                 dao.updateOp();
                              }
                           }

                           HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                           HeroDao heroDao = heroBagPart.getHeroByCode(dao.heroCode);
                           heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODULE_HERO_PALACE, heroDao);
                           this.sendHeroPalaceData();
                        }

                        HeroPalaceMsg.S2C_ResetHeroSkill_18438.Builder builder = HeroPalaceMsg.S2C_ResetHeroSkill_18438.newBuilder();
                        builder.setResult(1);
                        builder.setSkillId(skillId);
                        builder.setNewSkillId(currentConsumeModel.getBaseSkillId());
                        builder.addAllHeroSkillDir(dao.heroSkillDir);
                        this.player.sendMsg(builder.build());
                        this.player.getOperationMgr().addExtraLog(this.player, 218, "战技演练-重置", skillModel.getId() + "");
                     }
                  }
               }
            }
         }
      }
   }

   public void upgradePalaceTitle() {
      HeroPalaceDao heroPalaceDao = this.getHeroPalaceDao();
      if (heroPalaceDao.heroCode > 0) {
         PlayerDao playerDao = this.player.getPlayerDao();
         LeaderTitleModel leaderTitleModel = (LeaderTitleModel)this.player.getGameModelPool().getEntity("leaderTitle", playerDao.palaceTitle);
         if (leaderTitleModel != null) {
            if (leaderTitleModel.getNext() > 0) {
               LeaderTitleModel nextModel = (LeaderTitleModel)this.player.getGameModelPool().getEntity("leaderTitle", leaderTitleModel.getNext());
               if (nextModel != null) {
                  if (this.player.getPlayerCombatPower() >= (long)leaderTitleModel.getNeedPower()) {
                     if (playerDao.lv >= leaderTitleModel.getNeedPlayerLv()) {
                        if (this.player.checkResourceNum(leaderTitleModel.getItems())) {
                           this.player.delResource((List)leaderTitleModel.getItems(), 90, 9007, 0, 0, "");
                           playerDao.palaceTitle = nextModel.getId();
                           playerDao.updateOp();
                           this.calHeroPalaceAddProperty(heroPalaceDao);
                           HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
                           heroBagPart.flushAllHeroAndArraying(HeroDefine.HeroPropertyModel.MODULE_HERO_PALACE);
                           HeroPalaceMsg.S2C_UpgradePalaceTitle_18444.Builder builder = HeroPalaceMsg.S2C_UpgradePalaceTitle_18444.newBuilder();
                           builder.setResult(1);
                           builder.setTitleId(nextModel.getId());
                           this.player.sendMsg(builder.build());
                           String[] rewardsInfo = LogOperationMgr.toRewardsInfo(leaderTitleModel.getItems());
                           this.player.getOperationMgr().addExtraLog(this.player, 217, "龙脉印玺", playerDao.palaceTitle + "", rewardsInfo[2], rewardsInfo[1]);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public List<PropertyModel> getHeroPalaceProperty() {
      List<PropertyModel> list = new ArrayList();
      HeroPalaceDao dao = this.getHeroPalaceDao();

      for(Integer skillId : dao.destinySkills.values()) {
         if (dao.destinySkillDir.values().contains(skillId)) {
            LeaderTacticsDestinyModel model = (LeaderTacticsDestinyModel)this.player.getGameModelPool().getEntity("leaderTacticsDestiny", skillId);
            if (model != null) {
               for(PropertyModel propertyModel : model.getAddPro()) {
                  PropertyModel.addLvProtities(list, propertyModel);
               }
            }
         }
      }

      return list;
   }

   public List<Integer> getDestinySkills() {
      List<Integer> list = new ArrayList();
      HeroPalaceDao dao = this.getHeroPalaceDao();

      for(int i = 0; i < HeroDefine.PALACE_DESTINY_SKILL_NUM; ++i) {
         if (dao.destinySkills.containsKey(i + 1)) {
            list.add(dao.destinySkills.get(i + 1));
         } else {
            list.add(0);
         }
      }

      return list;
   }

   public void calHeroPalaceAddProperty(HeroPalaceDao dao) {
      if (dao == null) {
         dao = this.getHeroPalaceDao();
      }

      List<PropertyModel> tempProperty = new ArrayList();

      for(Map.Entry<String, Integer> entry : dao.destinySkillDir.entrySet()) {
         LeaderTacticsDestinyModel model = (LeaderTacticsDestinyModel)this.player.getGameModelPool().getEntity("leaderTacticsDestiny", entry.getValue());
         if (model != null) {
            for(PropertyModel propertyModel : model.getAddAllPro()) {
               PropertyModel.addLvProtities(tempProperty, propertyModel);
            }
         }
      }

      PlayerPublicDao publicDao = this.player.getPublicDao();
      if (publicDao.palaceTitle > 0) {
         LeaderTitleModel leaderTitleModel = (LeaderTitleModel)this.player.getGameModelPool().getEntity("leaderTitle", publicDao.palaceTitle);
         if (leaderTitleModel != null) {
            for(PropertyModel propertyModel : leaderTitleModel.getAddPro()) {
               PropertyModel.addLvProtities(tempProperty, propertyModel);
            }
         }
      }

      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      heroBagPart.setProperty_hero_palace(tempProperty);
   }

   public void calSoulDictionaryAddProperty() {
      Map<Integer, Map<Integer, Long>> properties = new HashMap();
      PlayerHeroExtend playerHeroExtend = (PlayerHeroExtend)this.player.getPlayerExtend(4);

      for(Map.Entry<Integer, Integer> entry : playerHeroExtend.soulDictionary.entrySet()) {
         Map<Integer, DictionarySoulHeroModel> soulHeroModelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customDictionarySoulHero", (Integer)entry.getKey());
         if (soulHeroModelMap != null) {
            Integer level = (Integer)entry.getValue();
            DictionarySoulHeroModel dictionarySoulHeroModel = (DictionarySoulHeroModel)soulHeroModelMap.get(level);
            if (dictionarySoulHeroModel != null) {
               for(PropertyModel passiveBuff : dictionarySoulHeroModel.getPassiveBuffs()) {
                  Map<Integer, Long> map = (Map)properties.computeIfAbsent(passiveBuff.getType(), (v) -> new HashMap());
                  map.put(passiveBuff.getWay(), (Long)map.getOrDefault(passiveBuff.getWay(), 0L) + passiveBuff.getValue());
               }
            }
         }
      }

      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      heroBagPart.setProperty_soul_palace(properties);
   }

   public HeroPalaceDao getHeroPalaceDao() {
      return (HeroPalaceDao)this.player.getData("tb_hero_palace", this.player.getPlayerId());
   }

   public boolean isHeroSkillIndex(int index) {
      return index >= 1 && index <= 4;
   }

   public boolean isShareHero(int heroCode) {
      HeroPalaceDao dao = this.getHeroPalaceDao();
      if (dao.heroCode <= 0) {
         return false;
      } else {
         return dao.shareCode == heroCode;
      }
   }

   public int getHeroPalaceHeroCode() {
      HeroPalaceDao dao = this.getHeroPalaceDao();
      return dao.heroCode;
   }

   public HeroModel getHeroModelByTypeAndNation(int type, int nation) {
      Map<Integer, HeroModel> heroModelMap = this.player.getGameModelPool().getMap("customPalaceHero");

      for(Map.Entry<Integer, HeroModel> entry : heroModelMap.entrySet()) {
         if (((HeroModel)entry.getValue()).getType() == type && ((HeroModel)entry.getValue()).getNation() == nation) {
            return (HeroModel)entry.getValue();
         }
      }

      return null;
   }

   public boolean isEnableDestinySkill(HeroPalaceDao dao, int skillId) {
      if (dao.destinySkillDir.values().contains(skillId)) {
         return true;
      } else {
         LeaderTacticsDestinyModel needHeroSkillModel = (LeaderTacticsDestinyModel)this.player.getGameModelPool().getEntity("leaderTacticsDestiny", skillId);
         if (needHeroSkillModel == null) {
            return false;
         } else {
            String key = this.getDestinySkillDirKey(needHeroSkillModel);
            if (!dao.destinySkillDir.containsKey(key)) {
               return false;
            } else {
               int currentHeroSkillId = (Integer)dao.destinySkillDir.get(key);
               LeaderTacticsDestinyModel currentHeroSkillModel = (LeaderTacticsDestinyModel)this.player.getGameModelPool().getEntity("leaderTacticsDestiny", currentHeroSkillId);
               if (currentHeroSkillModel == null) {
                  return false;
               } else {
                  return currentHeroSkillModel.getLv() >= needHeroSkillModel.getLv();
               }
            }
         }
      }
   }

   public boolean isEnableHeroSkill(HeroPalaceDao dao, int skillId) {
      if (dao.heroSkillDir.contains(skillId)) {
         return true;
      } else {
         LeaderPalaceSkillConsumeModel needHeroSkillModel = (LeaderPalaceSkillConsumeModel)this.player.getGameModelPool().getEntity("leaderPalaceSkillConsume", skillId);
         if (needHeroSkillModel == null) {
            return false;
         } else if (!dao.heroSkillDir.contains(needHeroSkillModel.getBaseSkillId())) {
            return false;
         } else {
            int currentHeroSkillId = (Integer)dao.heroSkillDir.get(needHeroSkillModel.getBaseSkillId());
            LeaderPalaceSkillConsumeModel currentHeroSkillModel = (LeaderPalaceSkillConsumeModel)this.player.getGameModelPool().getEntity("leaderPalaceSkillConsume", currentHeroSkillId);
            if (currentHeroSkillModel == null) {
               return false;
            } else {
               return currentHeroSkillModel.getLv() >= needHeroSkillModel.getLv();
            }
         }
      }
   }

   public int getTotalDestinySkillLv(HeroPalaceDao dao) {
      int totalLv = 0;

      for(Map.Entry<String, Integer> entry : dao.destinySkillDir.entrySet()) {
         LeaderTacticsDestinyModel model = (LeaderTacticsDestinyModel)this.player.getGameModelPool().getEntity("leaderTacticsDestiny", entry.getValue());
         if (model != null) {
            totalLv += model.getLv();
         }
      }

      return totalLv;
   }

   public int getShareHeroCode() {
      HeroPalaceDao dao = this.getHeroPalaceDao();
      return dao.shareCode;
   }

   public int getShareHeroId() {
      HeroPalaceDao heroPalaceDao = this.getHeroPalaceDao();
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(heroPalaceDao.shareCode);
      return heroDao != null ? heroDao.id : 0;
   }

   public boolean isPalaceShareHero(int code) {
      if (code <= 0) {
         return false;
      } else {
         HeroPalaceDao dao = this.getHeroPalaceDao();
         return dao.shareCode == code;
      }
   }

   public String getDestinySkillDirKey(LeaderTacticsDestinyModel model) {
      return model.getType() + "_" + model.getBreach();
   }

   public void tryRepairHeroSkillDir() {
      HeroPalaceDao dao = this.getHeroPalaceDao();
      if (!dao.heroSkillDir.isEmpty()) {
         HashSet<Integer> skillSet = new HashSet(dao.heroSkillDir);
         HashSet<Integer> tmpRemoveSet = new HashSet();

         for(Integer skillId : dao.heroSkillDir) {
            LeaderPalaceSkillConsumeModel consumeModel = (LeaderPalaceSkillConsumeModel)this.player.getGameModelPool().getEntity("leaderPalaceSkillConsume", skillId);
            if (consumeModel != null) {
               Integer nextSkill = consumeModel.getNext();
               if (nextSkill != 0 && skillSet.contains(nextSkill)) {
                  tmpRemoveSet.add(skillId);
               }
            }
         }

         if (!tmpRemoveSet.isEmpty()) {
            logger.warn("玩家 {} 删掉异常技能: {}", this.player.getPlayerId(), tmpRemoveSet);

            for(Integer removeSkillId : tmpRemoveSet) {
               dao.heroSkillDir.remove(removeSkillId);
            }

            dao.updateOp();
         }

      }
   }

   public void gmTest(String orderStr) {
      String[] orders = orderStr.split(",");
      if (orders.length < 1) {
         logger.info("GM命令参数错误，oder={}", orderStr);
      } else {
         for (String cmd : orders){
            switch (cmd.toLowerCase()) {
               case "clear":
                  this.gmClearData();
                  break;
               case "main":
                  this.sendHeroPalaceData();
                  break;
               case "comtask":
                  this.completeAllTask();
                  break;
               case "share":
                  int code = Integer.parseInt(orders[1]);
                  this.shareHero(code);
                  break;
               case "kingskill":
                  int open = Integer.parseInt(orders[1]);
                  this.gmSetKingSkill(open);
                  break;
               case "destinyskill":
                  int lv = Integer.parseInt(orders[1]);
                  this.gmSetDestinySkill(lv);
                  break;
               case "heroskill":
                  int heroSkillLv = Integer.parseInt(orders[1]);
                  this.gmSetHeroSkill(heroSkillLv);
                  break;
               case "allskill":
                  this.gmSetAllSkill();
            }
         }
      }
   }

   public void gmClearData() {
      HeroPalaceDao heroPalaceDao = (HeroPalaceDao)this.player.getData("tb_hero_palace", this.player.getPlayerId());
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      if (heroPalaceDao.heroCode > 0) {
         HeroDao heroDao = heroBagPart.getHeroByCode(heroPalaceDao.heroCode);
         if (heroDao != null && heroDao.isHaveArrayingState()) {
            this.player.failure(38);
            return;
         }
      }

      this.player.deleteDao(heroPalaceDao, true);
      PlayerDao playerDao = this.player.getPlayerDao();
      playerDao.palaceTitle = 0;
      playerDao.updateOp();
      List<Integer> heroDaoList = new ArrayList();

      for(Map.Entry<Integer, HeroDao> entry : heroBagPart.getHeroDaoMap().entrySet()) {
         if (((HeroDao)entry.getValue()).type == HeroDefine.HERO_SP_TYPE_PALACE) {
            heroDaoList.add(((HeroDao)entry.getValue()).code);
         }
      }

      boolean isSuccess = heroBagPart.deleteHero(heroDaoList, HeroDefine.DelHeroType.DEL_USE, 90, 411, 0, 0, "");
      if (isSuccess) {
         this.player.senditemUpdateMsg();
         this.player.clearAddBuilder();
         HeroDressPart heroDressPart = (HeroDressPart)this.player.getMgrPart(HeroDressPart.class);
         Map<Integer, HeroDressDao> heroDressDaoMap = heroDressPart.getHeroDressDaoMap();
         if (heroDressDaoMap != null) {
            for(HeroDressDao heroDressDao : heroDressDaoMap.values()) {
               HeroDressModel heroDressModel = (HeroDressModel)this.player.getGameModelPool().getEntity("heroDress", heroDressDao.id);
               if (heroDressModel != null && heroDressModel.getDressType() == HeroDefine.HERO_DRESS_TYPE_PALACE) {
                  heroDressDaoMap.remove(heroDressDao.id);
               }
            }
         }
      }

   }

   public void gmSetKingSkill(int open) {
      if (open <= 0) {
         HeroPalaceDao heroPalaceDao = this.getHeroPalaceDao();
         heroPalaceDao.kingSkillDir.clear();
         heroPalaceDao.updateOp();
      } else {
         Map<Integer, LeaderTacticsSkillModel> map = this.player.getGameModelPool().getMap("leaderTacticsSkill");
         if (map != null) {
            HeroPalaceDao heroPalaceDao = this.getHeroPalaceDao();
            heroPalaceDao.kingSkillDir.clear();

            for(Map.Entry<Integer, LeaderTacticsSkillModel> entry : map.entrySet()) {
               heroPalaceDao.kingSkillDir.add(entry.getKey());
            }

            heroPalaceDao.updateOp();
         }
      }

   }

   public void gmSetDestinySkill(int lv) {
      Map<Integer, LeaderTacticsDestinyModel> map = this.player.getGameModelPool().getMap("leaderTacticsDestiny");
      if (map != null) {
         HeroPalaceDao heroPalaceDao = this.getHeroPalaceDao();
         heroPalaceDao.destinySkillDir.clear();

         for(Map.Entry<Integer, LeaderTacticsDestinyModel> entry : map.entrySet()) {
            if (((LeaderTacticsDestinyModel)entry.getValue()).getLv() == lv) {
               heroPalaceDao.destinySkillDir.put(this.getDestinySkillDirKey((LeaderTacticsDestinyModel)entry.getValue()), ((LeaderTacticsDestinyModel)entry.getValue()).getId());
            }
         }

         heroPalaceDao.updateOp();
      }

   }

   public void gmSetHeroSkill(int lv) {
      Map<Integer, LeaderPalaceSkillConsumeModel> map = this.player.getGameModelPool().getMap("leaderPalaceSkillConsume");
      if (map != null) {
         HeroPalaceDao heroPalaceDao = this.getHeroPalaceDao();
         heroPalaceDao.heroSkillDir.clear();

         for(Map.Entry<Integer, LeaderPalaceSkillConsumeModel> entry : map.entrySet()) {
            if (((LeaderPalaceSkillConsumeModel)entry.getValue()).getLv() == lv) {
               heroPalaceDao.heroSkillDir.add(entry.getKey());
            }
         }

         heroPalaceDao.updateOp();
      }
   }

   public void gmSetAllSkill() {
      this.gmSetKingSkill(1);
      this.gmSetDestinySkill(8);
      this.gmSetHeroSkill(3);
   }

   public boolean checkPalaceHero(HeroDao heroDao) {
      if (heroDao == null) {
         return false;
      } else {
         HeroPalaceDao heroPalaceDao = this.getHeroPalaceDao();
         return heroDao.code != heroPalaceDao.heroCode || heroPalaceDao.shareCode != 0;
      }
   }

   public void sendSoulDictionaryInfo(Integer heroId, boolean login) {
      if (!login) {
         Map<Integer, Map<Integer, DictionarySoulHeroModel>> soulHeroModelMap = ApplicationContextProvider.<Integer, Map<Integer, DictionarySoulHeroModel>>getModelPoolMap("customDictionarySoulHero");
         if (soulHeroModelMap != null) {
            if (heroId == null || soulHeroModelMap.containsKey(heroId)) {
               HeroPalaceMsg.S2C_SoulPalace_18452.Builder resp = HeroPalaceMsg.S2C_SoulPalace_18452.newBuilder();
               PlayerHeroExtend playerHeroExtend = (PlayerHeroExtend)this.player.getPlayerExtend(4);

               for(int soulHeroId : soulHeroModelMap.keySet()) {
                  HeroPalaceMsg.SoulHeroDictionary.Builder dictionary = HeroPalaceMsg.SoulHeroDictionary.newBuilder();
                  dictionary.setHeroId(soulHeroId);
                  dictionary.setLevel((Integer)playerHeroExtend.soulDictionary.getOrDefault(soulHeroId, 0));
                  dictionary.setMaxStar((Integer)playerHeroExtend.maxStar.getOrDefault(soulHeroId, 0));
                  resp.addDictionary(dictionary);
               }

               this.player.sendMsg(resp.build());
            }
         }
      }
   }
}
