package com.gzbz.gamePlayer.heroPart;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.ActivityMgr;
import com.gzbz.activity.part.ActHeroImprovePart;
import com.gzbz.activity.part.KrActHeroImprovePart;
import com.gzbz.chat.ChatMgr;
import com.gzbz.db.HeroClubDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.bean.HeroClubRecord;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.HeroDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.armyArray.ArmyArrayPart;
import com.gzbz.gamePlayer.monarch.MonarchPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gamePlayer.playerExtend.PlayerExtend;
import com.gzbz.gift.GiftPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.mergeActivity.part.MergeActivityHeFuKuangHuanPart;
import com.gzbz.model.HeroExchangeLibModel;
import com.gzbz.model.HeroExchangeModel;
import com.gzbz.model.HeroModel;
import com.gzbz.model.HeroRecruitLibModel;
import com.gzbz.model.HeroRecruitModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.LanguageModel;
import com.gzbz.model.QualityColorModel;
import com.gzbz.model.ShopHeroRecruitModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.HeroClubMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import misc.DateUtil;
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
public class HeroClubPart extends PlayerPart {
   static Logger logger = LoggerFactory.getLogger(HeroClubPart.class);
   private static final int SAVE_MAX_NUM = 60;
   private static final int SAVE_MIN_NUM = 40;
   @Autowired
   RankMgr rankMgr;
   @Autowired
   ActivityMgr activityMgr;
   @Autowired
   ConfigManager configManager;
   @Autowired
   WorldMgr worldMgr;

   @MsgHandlerAnno
   public void C2S_Recruit_8901(HeroClubMsg.C2S_Recruit_8901 msg, String source) {
      int type = msg.getType().getNumber();
      HeroRecruitModel heroRecruitModel = (HeroRecruitModel)this.player.getGameModelPool().getEntity("heroRecruit", type);
      if (heroRecruitModel == null) {
         logger.info("将星台招募为空{}", msg.getType());
      } else if (!this.player.checkResourceNum((List)heroRecruitModel.getConsumeItems())) {
         logger.info("将星台招募物品不够");
      } else {
         HeroRecruitLibModel heroRecruitLibModel = null;
         int heroRecruitLibFloorNum = this.getRecruitFloorNum();
         PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
         ++playerExtend.clubFloorNum;
         PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
         int frist = (Integer)playerResetCustomCache.getForeverNum(523, 0);
         if (frist <= 0) {
            heroRecruitLibModel = this.floorRecruitHeroId(type);
            if (heroRecruitLibModel == null) {
               return;
            }

            playerResetCustomCache.setForever(523, 1);
         } else if (playerExtend.clubFloorNum >= heroRecruitLibFloorNum) {
            heroRecruitLibModel = this.floorRecruitHeroId(type);
            if (heroRecruitLibModel == null) {
               return;
            }

            playerExtend.clubFloorNum = 0;
         } else {
            heroRecruitLibModel = this.randomRecruitHeroId(type);
            if (heroRecruitLibModel == null) {
               return;
            }

            HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroRecruitLibModel.getPropsId());
            if (heroModel != null && heroModel.getStar() >= 5) {
               playerExtend.clubFloorNum = 0;
            }
         }

         this.player.updatePlayerExtend(13);
         List<ResourceModel> addItems = new ArrayList();
         addItems.add(new ResourceModel(2, heroRecruitLibModel.getPropsId(), heroRecruitLibModel.getPropsNum()));

         for(ResourceModel receiveItem : heroRecruitModel.getReceiveItems()) {
            addItems.add(receiveItem);
         }

         Collections.sort(addItems, new comparator());
         this.player.delResource((List)heroRecruitModel.getConsumeItems(), 27, 2701, 0, 0, "");
         this.player.addResource(addItems, PlayerMsg.ShowType.SHOW_TYPE_COMMON_NO_SORT, 27, 2701, 0, 0, "");
         this.player.triggerTask(211, 0, 1L, 1);
         RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
         if (this.activityMgr.checkOpenServerRankTime(RankDefine.RankModule.OPEN_SERVER_ASSEMBLE) > 0 || this.activityMgr.checkLaborOpenServerRankTime(RankDefine.RankModule.OPEN_SERVER_ASSEMBLE) > 0) {
            int score = (int)rankPart.getScore(RankDefine.RankModule.OPEN_SERVER_ASSEMBLE);
            int realNum = score + 1;
            rankPart.updateRank(RankDefine.RankModule.OPEN_SERVER_ASSEMBLE, (long)realNum, false);
         }

         MergeActivityHeFuKuangHuanPart mergeActivityHeFuKuangHuanPart = (MergeActivityHeFuKuangHuanPart)this.player.getMgrPart(MergeActivityHeFuKuangHuanPart.class);
         mergeActivityHeFuKuangHuanPart.updateRushRank(1, 1);
         ItemModel itemModel = (ItemModel)this.player.getGameModelPool().getEntity("item", heroRecruitLibModel.getPropsId());
         if (itemModel.getQuality() >= 5 && heroRecruitLibModel.getIsShow() == 1) {
            PlayerPublicDao playerDao = this.player.getPublicDao();
            String key = itemModel.getName() + "*" + heroRecruitLibModel.getPropsNum();
            LanguageModel languageModel = (LanguageModel)ApplicationContextProvider.getModelPoolEntity("language", "summonStar");
            QualityColorModel qualityColorModel = (QualityColorModel)this.player.getGameModelPool().getEntity("qualityColor", Integer.valueOf(itemModel.getQuality()));
            String format = MessageFormat.format(languageModel.getValue(), playerDao.playerName, qualityColorModel.getColor(), key);
            String format_deep = MessageFormat.format(languageModel.getValue(), playerDao.playerName, qualityColorModel.getColor(), key);
            ChatMgr chatMgr = (ChatMgr)ApplicationContextProvider.getContext().getBean(ChatMgr.class);
            chatMgr.pushTaskEx("sendSystem", new Object[]{4, 2, this.player.getPlayerId(), playerDao.playerName, format});
            chatMgr.pushTaskEx("sendSystem", new Object[]{4, 5, this.player.getPlayerId(), playerDao.playerName, format_deep});
            this.addDrawRecord(itemModel);
         }

         GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
         giftPart.triggerTimeLimitGift(2, itemModel.getQuality());
         int player_hero_club = 0;
         int item_1052 = 0;

         for(ResourceModel receiveItem : heroRecruitModel.getReceiveItems()) {
            if (receiveItem.getId() == PlayerDefine.PLAYER_HERO_CLUB) {
               player_hero_club += receiveItem.getValue();
            } else if (receiveItem.getId() == 1052) {
               item_1052 += receiveItem.getValue();
            }
         }

         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         this.player.getOperationMgr().addExtraLog(this.player, 144, "1", itemModel.getId() + "", itemModel.getName(), heroRecruitLibModel.getPropsNum() + "", player_hero_club + "", this.player.getPlayerDao().heroClub + "", item_1052 + "", itemBagPart.getItemNum(1052) + "");
      }
   }

   @MsgHandlerAnno
   public void C2S_Exchange_8903(HeroClubMsg.C2S_Exchange_8903 msg, String source) {
      int code = msg.getCode();
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      if (playerExtend.clubHeroCode > 0) {
         HeroClubMsg.S2C_ExchangeResult_8904.Builder builder = HeroClubMsg.S2C_ExchangeResult_8904.newBuilder();
         builder.setId(playerExtend.clubExchangeId);
         builder.setCode(playerExtend.clubHeroCode);
         this.player.sendMsg(builder.build());
      } else {
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         HeroDao heroDao = heroBagPart.getHeroByCode(code);
         if (heroDao == null) {
            logger.info("置换武将不存在={}", code);
            this.player.failure(27010);
         } else if (!HeroModel.isReplacementHero(heroDao.id)) {
            if (heroDao.type == HeroDefine.HERO_SP_TYPE_PALACE) {
               this.player.failure(76042);
            } else if (!heroBagPart.linkHeroCantDo(heroDao)) {
               if (heroDao.isHaveArrayingState()) {
                  logger.info("英雄状态不为普通状态,={}", heroDao.getStateList());
                  this.player.failure(27011);
               } else if (heroDao.lock) {
                  logger.info("英雄已锁定，不能参加置换");
                  this.player.failure(27012);
               } else {
                  HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroDao.id);
                  String key = heroModel.getNation() + "" + heroDao.getStar();
                  HeroExchangeModel exchangeModel = (HeroExchangeModel)this.player.getGameModelPool().getEntity("heroExchange", key);
                  if (exchangeModel == null) {
                     logger.info("置换模板不存在，{}", key);
                     this.player.failure(27013);
                  } else if (!this.player.checkResourceNum((List)exchangeModel.getConsumeItems())) {
                     logger.info("置换物品不够");
                     this.player.failure(27014);
                  } else {
                     int heroId = 0;
                     int loop = 0;

                     do {
                        heroId = this.randomExchangeHeroId(Integer.parseInt(key));
                        ++loop;
                     } while(heroId == heroDao.id && loop <= 10);

                     if (heroId == 0) {
                        this.player.failure(76037);
                        logger.warn("{}置换武将错误", this.player.getPlayerId());
                     } else {
                        playerExtend.clubHeroCode = code;
                        playerExtend.clubExchangeId = heroId;
                        this.player.updatePlayerExtend(13);
                        heroDao.addState(CommonMsg.HeroState.HERO_STATE_EXCHANGE.getNumber());
                        heroDao.updateOp();
                        this.player.delResource((List)exchangeModel.getConsumeItems(), 27, 2702, 0, 0, "");
                        HeroClubMsg.S2C_ExchangeResult_8904.Builder builder = HeroClubMsg.S2C_ExchangeResult_8904.newBuilder();
                        builder.setId(heroId);
                        builder.setCode(msg.getCode());
                        this.player.sendMsg(builder.build());
                        String oldHero = heroModel.getNation() + "&" + heroModel.getName() + "&" + heroModel.getStar();
                        this.player.getOperationMgr().addExtraLog(this.player, 145, oldHero, heroId + "", ((ResourceModel)exchangeModel.getConsumeItems().get(0)).getValue() + "");
                     }
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_ConfirmExchange_8905(HeroClubMsg.C2S_ConfirmExchange_8905 msg, String source) {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      int clubHeroCode = playerExtend.clubHeroCode;
      int exchangeHeroId = playerExtend.clubExchangeId;
      if (clubHeroCode != 0 && exchangeHeroId != 0) {
         HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
         HeroDao sourceHero = heroBagPart.getHeroByCode(clubHeroCode);
         if (sourceHero == null) {
            logger.info("参与置换的英雄不存在！{}", clubHeroCode);
         } else if (sourceHero.isHaveOnlyArrayingState()) {
            this.player.failure(61191);
         } else {
            heroBagPart.logHero(sourceHero, -1, 27, 2702, exchangeHeroId, 0, "");
            HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", sourceHero.id);
            int oldId = sourceHero.id;
            sourceHero.id = exchangeHeroId;
            sourceHero.delState(Integer.valueOf(CommonMsg.HeroState.HERO_STATE_EXCHANGE.getNumber()));
            sourceHero.armyArrayGrids.clear();
            sourceHero.armyArraySkill.clear();
            sourceHero.updateOp();
            heroBagPart.flushHero(HeroDefine.HeroPropertyModel.MODEL_ALL, sourceHero);
            heroBagPart.logHero(sourceHero, 1, 27, 2702, oldId, 0, "");
            playerExtend.clubHeroCode = 0;
            playerExtend.clubExchangeId = 0;
            this.player.updatePlayerExtend(13);
            ((HeroArchivePart)this.player.getMgrPart(HeroArchivePart.class)).takeNewHero(sourceHero.id);
            MonarchPart monarchPart = (MonarchPart)this.player.getMgrPart(MonarchPart.class);
            List<Integer> heroList = new ArrayList();
            heroList.add(sourceHero.id);
            monarchPart.addHeroMonarch(heroList);
            monarchPart.addItemMonarch();
            ActHeroImprovePart actHeroImprovePart = (ActHeroImprovePart)this.player.getMgrPart(ActHeroImprovePart.class);
            actHeroImprovePart.checkHeroMaxStarChange(exchangeHeroId);
            KrActHeroImprovePart krActHeroImprovePart = (KrActHeroImprovePart)this.player.getMgrPart(KrActHeroImprovePart.class);
            krActHeroImprovePart.checkHeroMaxStarChange(exchangeHeroId);
            HeroClubMsg.S2C_ConfirmExchangeResult_8906.Builder builder = HeroClubMsg.S2C_ConfirmExchangeResult_8906.newBuilder();
            builder.setCode(clubHeroCode);
            this.player.sendMsg(builder.build());
            ArmyArrayPart armyArrayPart = (ArmyArrayPart)this.player.getMgrPart(ArmyArrayPart.class);
            List<Integer> chList = new ArrayList();
            chList.add(clubHeroCode);
            armyArrayPart.checkEyes(chList);
            if (heroModel != null && heroModel.getHeroSpType() == HeroDefine.HERO_SP_TYPE_KING) {
               heroBagPart.flushControlHero(HeroDefine.HeroPropertyModel.MODEL_HERO, heroModel.getNation());
            }

            heroBagPart.recordMaxStar(sourceHero.id, sourceHero.getStar(), false);
         }
      } else {
         logger.info("还没有置换过！");
      }
   }

   @MsgHandlerAnno
   public void C2S_CancelExchange_8907(HeroClubMsg.C2S_CancelExchange_8907 msg, String source) {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroDao heroDao = heroBagPart.getHeroByCode(playerExtend.clubHeroCode);
      if (heroDao != null && heroDao.containState(CommonMsg.HeroState.HERO_STATE_EXCHANGE.getNumber())) {
         heroDao.delState(Integer.valueOf(CommonMsg.HeroState.HERO_STATE_EXCHANGE.getNumber()));
         heroDao.updateOp();
      }

      playerExtend.clubExchangeId = 0;
      playerExtend.clubHeroCode = 0;
      this.player.updatePlayerExtend(13);
      HeroClubMsg.S2C_ExchangeInfoResult_8908.Builder builder = HeroClubMsg.S2C_ExchangeInfoResult_8908.newBuilder();
      builder.setResult(1);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_ExchangeInfo_8909(HeroClubMsg.C2S_ExchangeInfo_8909 msg, String source) {
      PlayerExtend playerExtend = (PlayerExtend)this.player.getPlayerExtend(13);
      HeroClubMsg.S2C_ExchangeInfoResult_8910.Builder builder = HeroClubMsg.S2C_ExchangeInfoResult_8910.newBuilder();
      builder.setId(playerExtend.clubExchangeId);
      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_Buy_8911(HeroClubMsg.C2S_Buy_8911 msg, String source) {
      int num = msg.getNum();
      if (num <= 0) {
         logger.info("购买数量不对");
      } else if (num <= 9999) {
         ShopHeroRecruitModel heroRecruitModel = (ShopHeroRecruitModel)this.player.getGameModelPool().getEntity("heroRecruitShop", msg.getId());
         if (heroRecruitModel == null) {
            this.player.failure(27015);
         } else {
            int openServerDays = this.worldMgr.getOpenServerDays();
            int dateEnd = heroRecruitModel.getDateEnd() == -1 ? Integer.MAX_VALUE : heroRecruitModel.getDateEnd();
            if (openServerDays >= heroRecruitModel.getDateStart() && openServerDays <= dateEnd) {
               List<ResourceModel> needList = new ArrayList();

               for(ResourceModel consume : heroRecruitModel.getConsumes()) {
                  if (ResourceModel.checkTotalNumError(consume.getValue(), num)) {
                     return;
                  }

                  ResourceModel resourceModel = new ResourceModel(consume.getType(), consume.getId(), consume.getValue() * num);
                  needList.add(resourceModel);
               }

               if (!this.player.checkResourceNum(needList)) {
                  this.player.failure(27016);
               } else {
                  List<ResourceModel> gainsList = new ArrayList();
                  List<Integer> heroIdList = new ArrayList();

                  for(int i = 0; i < num; ++i) {
                     for(ResourceModel gain : heroRecruitModel.getGains()) {
                        ResourceModel resourceModel = new ResourceModel(gain.getType(), gain.getId(), gain.getValue());
                        gainsList.add(resourceModel);
                        heroIdList.add(gain.getId());
                     }
                  }

                  this.player.delResource((List)needList, 27, 2703, 0, 0, "");
                  this.player.addResource(gainsList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 27, 2703, 0, 0, "");
                  HeroClubMsg.S2C_BuyResult_8912.Builder builder = HeroClubMsg.S2C_BuyResult_8912.newBuilder();
                  builder.setResult(1);
                  this.player.sendMsg(builder.build());
                  this.addExchangeRecord(heroIdList);
                  String[] buyStr = LogOperationMgr.toRewardsInfo(gainsList);
                  this.player.getOperationMgr().addExtraLog(this.player, 147, heroRecruitModel.getId() + "", buyStr[0], buyStr[2], buyStr[1], ((ResourceModel)needList.get(0)).getValue() + "", this.player.getPlayerDao().getProperty(PlayerDefine.PLAYER_HERO_CLUB) + "");
               }
            } else {
               this.player.failure(76036);
            }
         }
      }
   }

   public HeroRecruitLibModel randomRecruitHeroId(int libId) {
      Map<Integer, List<HeroRecruitLibModel>> map = this.player.getGameModelPool().getMap("custom_heroRecruitLib");
      List<HeroRecruitLibModel> heroRecruitLibModels = (List)map.get(libId);
      int totalProb = 0;
      List<HeroRecruitLibModel> actualLibModels = new ArrayList();
      int openServerDays = this.worldMgr.getOpenServerDays();

      for(HeroRecruitLibModel heroRecruitLibModel : heroRecruitLibModels) {
         int dateEnd = heroRecruitLibModel.getDateEnd() == -1 ? Integer.MAX_VALUE : heroRecruitLibModel.getDateEnd();
         if (openServerDays >= heroRecruitLibModel.getDateStart() && openServerDays <= dateEnd) {
            totalProb += heroRecruitLibModel.getProbability();
            actualLibModels.add(heroRecruitLibModel);
         }
      }

      if (actualLibModels.size() != 0 && totalProb != 0) {
         int random = RandomUtil.randInt(totalProb);
         int tempProb = 0;

         for(HeroRecruitLibModel heroRecruitLibModel : actualLibModels) {
            tempProb += heroRecruitLibModel.getProbability();
            if (tempProb >= random) {
               return heroRecruitLibModel;
            }
         }

         return null;
      } else {
         logger.warn("{} 聚贤阁招募配置数据错误 lib:{}", this.player.getPlayerId(), libId);
         return null;
      }
   }

   public HeroRecruitLibModel floorRecruitHeroId(int libId) {
      Map<Integer, List<HeroRecruitLibModel>> map = this.player.getGameModelPool().getMap("custom_heroRecruitLib");
      List<HeroRecruitLibModel> heroRecruitLibModels = (List)map.get(libId);
      int totalProb = 0;
      List<HeroRecruitLibModel> actualLibModels = new ArrayList();
      int openServerDays = this.worldMgr.getOpenServerDays();

      for(HeroRecruitLibModel heroRecruitLibModel : heroRecruitLibModels) {
         int dateEnd = heroRecruitLibModel.getDateEnd() == -1 ? Integer.MAX_VALUE : heroRecruitLibModel.getDateEnd();
         if (heroRecruitLibModel.getFloors() > 0 && openServerDays >= heroRecruitLibModel.getDateStart() && openServerDays <= dateEnd) {
            totalProb += heroRecruitLibModel.getProbability();
            actualLibModels.add(heroRecruitLibModel);
         }
      }

      if (actualLibModels.size() != 0 && totalProb != 0) {
         int random = RandomUtil.randInt(totalProb);
         int tempProb = 0;

         for(HeroRecruitLibModel heroRecruitLibModel : actualLibModels) {
            tempProb += heroRecruitLibModel.getProbability();
            if (tempProb >= random) {
               return heroRecruitLibModel;
            }
         }

         return null;
      } else {
         logger.warn("{} 聚贤阁保底招募配置数据错误 lib:{}", this.player.getPlayerId(), libId);
         return null;
      }
   }

   public int randomExchangeHeroId(int libId) {
      int heroId = 0;
      Map<Integer, List<HeroExchangeLibModel>> map = this.player.getGameModelPool().getMap("custom_heroExchangeLib");
      List<HeroExchangeLibModel> list = (List)map.get(libId);
      int totalProb = 0;
      List<HeroExchangeLibModel> actualLibModels = new ArrayList();
      int openServerDays = this.worldMgr.getOpenServerDays();

      for(HeroExchangeLibModel heroExchangeLibModel : list) {
         int dateEnd = heroExchangeLibModel.getDateEnd() == -1 ? Integer.MAX_VALUE : heroExchangeLibModel.getDateEnd();
         if (openServerDays >= heroExchangeLibModel.getDateStart() && openServerDays <= dateEnd) {
            totalProb += heroExchangeLibModel.getProbability();
            actualLibModels.add(heroExchangeLibModel);
         }
      }

      if (actualLibModels.size() != 0 && totalProb != 0) {
         int random = RandomUtil.randInt(totalProb);
         int tempProb = 0;

         for(HeroExchangeLibModel model : actualLibModels) {
            tempProb += model.getProbability();
            if (tempProb >= random) {
               heroId = model.getExcHeroId();
               break;
            }
         }

         return heroId;
      } else {
         logger.warn("{} 聚贤阁招募配置数据错误 lib:{}", this.player.getPlayerId(), libId);
         return 0;
      }
   }

   public HeroClubDao getHeroClubDao() {
      return (HeroClubDao)this.player.getData("tb_hero_club", this.player.getPlayerId());
   }

   public HeroClubMsg.DrawRecordInfo.Builder toRecordInfo(HeroClubRecord record) {
      HeroClubMsg.DrawRecordInfo.Builder builder = HeroClubMsg.DrawRecordInfo.newBuilder();
      builder.setHeroId(record.heroId);
      builder.setTime(record.time);
      return builder;
   }

   @MsgHandlerAnno
   public void C2S_Record_8913(HeroClubMsg.C2S_Record_8913 msg, String source) {
      HeroClubMsg.S2C_Record_8914.Builder builder = HeroClubMsg.S2C_Record_8914.newBuilder();
      HeroClubDao heroClubDao = this.getHeroClubDao();
      if (!heroClubDao.drawRecord.isEmpty()) {
         for(HeroClubRecord heroClubRecord : heroClubDao.drawRecord) {
            builder.addDrawInfos(this.toRecordInfo(heroClubRecord));
         }
      }

      if (!heroClubDao.exchangeRecord.isEmpty()) {
         for(HeroClubRecord heroClubRecord : heroClubDao.exchangeRecord) {
            builder.addExchangeInfos(this.toRecordInfo(heroClubRecord));
         }
      }

      this.player.sendMsg(builder.build());
   }

   public void addDrawRecord(ItemModel itemModel) {
      HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", itemModel.getId());
      if (heroModel != null && heroModel.getStar() >= 5) {
         HeroClubDao heroClubDao = this.getHeroClubDao();
         if (heroClubDao.drawRecord.size() >= 60) {
            List<HeroClubRecord> needList = new ArrayList();
            List<HeroClubRecord> list = new ArrayList(heroClubDao.drawRecord);
            Collections.sort(list);

            for(int i = 0; i < 40; ++i) {
               needList.add(list.get(i));
            }

            heroClubDao.drawRecord = needList;
         }

         HeroClubRecord heroClubRecord = new HeroClubRecord(heroModel.getId(), DateUtil.getIntTime(System.currentTimeMillis()));
         heroClubDao.drawRecord.add(heroClubRecord);
         heroClubDao.updateOp();
      }

   }

   public void addExchangeRecord(List<Integer> heroIdList) {
      for(Integer heroId : heroIdList) {
         HeroModel heroModel = (HeroModel)this.player.getGameModelPool().getEntity("hero", heroId);
         if (heroModel != null && heroModel.getStar() >= 5) {
            HeroClubDao heroClubDao = this.getHeroClubDao();
            if (heroClubDao.exchangeRecord.size() >= 60) {
               List<HeroClubRecord> needList = new ArrayList();
               List<HeroClubRecord> list = new ArrayList(heroClubDao.exchangeRecord);
               Collections.sort(list);

               for(int i = 0; i < 40; ++i) {
                  needList.add(list.get(i));
               }

               heroClubDao.exchangeRecord = needList;
            }

            HeroClubRecord heroClubRecord = new HeroClubRecord(heroModel.getId(), DateUtil.getIntTime(System.currentTimeMillis()));
            heroClubDao.exchangeRecord.add(heroClubRecord);
            heroClubDao.updateOp();
         }
      }

   }

   public int getRecruitFloorNum() {
      List<Integer> values = this.configManager.getIntList("heroRecruitLibFloorNum");
      if (values.size() < 4) {
         logger.warn("聚贤阁 - 保底次数配置错误 {}", values);
      }

      int floorNum = (Integer)values.get(0);
      int vipLv = this.player.getPublicDao().vip_lv;
      if (vipLv < (Integer)values.get(1)) {
         return floorNum;
      } else {
         int offsetNum = (vipLv - (Integer)values.get(1)) / (Integer)values.get(2) * (Integer)values.get(3);
         int heroRecruitLibFloorNumMin = this.configManager.getIntDefault("heroRecruitLibFloorNumMin", 10);
         floorNum = Math.max(heroRecruitLibFloorNumMin, floorNum + offsetNum);
         return floorNum;
      }
   }

   private class comparator implements Comparator<ResourceModel> {
      private comparator() {
      }

      public int compare(ResourceModel o1, ResourceModel o2) {
         return o2.getId() - o1.getId();
      }
   }
}
