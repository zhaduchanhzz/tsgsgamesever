package com.gzbz.supremePvp.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.gzbz.battle.scene.BattleScene;
import com.gzbz.chat.ChatMgr;
import com.gzbz.db.BattleDao;
import com.gzbz.db.SupremePvpDao;
import com.gzbz.db.WarOrderDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameMgr.PlayerPart;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gift.GiftPart;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.SupremePvpWarOrderModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.protobuf.SupremePvpMsg;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.warOrder.WarOrderPart;
import com.gzbz.worldMgr.WorldMgr;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import misc.DateUtil;
import net.CrossSubscribeMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class SupremePvpPart extends PlayerPart {
   @Autowired
   private CrossNettyClient crossNettyClient;

   public void resetDaily() {
      if (this.player.isSystemOpen(6850)) {
         SupremePvpDao dao = this.getDao();
         dao.dailyFightNum = 0;
         dao.dailyFlushTimes = 0;
         dao.dailyIntegralNum = 0;
         dao.updateOp();
         this.warOrderJoin();
      }
   }

   public void levelUp(int preLv, int newLv) {
      this.warOrderJoin();
   }

   public void loginHandle() {
      this.warOrderJoin();
   }

   private void warOrderJoin() {
      if (this.player.isSystemOpen(6850)) {
         this.player.triggerTask(764, 0, 1L, 0);
         SupremePvpDao dao = this.getDao();
         long curTime = System.currentTimeMillis();
         if (curTime > dao.warOrderEndTime) {
            List<ResourceModel> rewards = this.warOrderReward();
            if (rewards != null) {
               CentreAwardModel centreAwardModel = CentreAwardModel.getByType(CentreAwardModel.TYPE_SUPREME_PVP_WAR_ORDER);
               if (centreAwardModel != null) {
                  MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
                  mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), rewards, 604800000L, 157, 15708);
               }
            }

            int warOrderDay = ApplicationContextProvider.getConfigInt("JiuZhouWarOrderTime", 28);
            dao.warOrderEndTime = DateUtil.getSomeDayBeginTime(curTime) + (long)warOrderDay * 86400000L - 1L;
            dao.warOrderLv = 0;
            dao.gotCommonMaxLv = 0;
            dao.gotSuperMaxLv = 0;
            dao.updateOp();
            int itemId = ApplicationContextProvider.getConfigInt("JiuZhouWarOrderScore", 1030);
            this.player.delResourceAllNum(2, itemId, 157, 15705, 0, 0, "");
            WarOrderPart warOrderPart = (WarOrderPart)this.player.getMgrPart(WarOrderPart.class);
            WarOrderDao warOrder = warOrderPart.getWarOrder(6850);
            warOrder.superReward.clear();
            warOrder.commonReward.clear();
            warOrder.updateOp();
            GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
            giftPart.clearGifts(45);
         }

      }
   }

   @MsgHandlerAnno
   public void C2S_Main_28501(SupremePvpMsg.C2S_Main_28501 msg, String source) {
      if (this.player.isSystemOpen(6850)) {
         this.sendMain();
      }
   }

   private void sendMain() {
      SupremePvpDao dao = this.getDao();
      this.player.sendMsg(SupremePvpMsg.S2C_Main_28502.newBuilder().setDailyFightNum(dao.dailyFightNum).setDailyFlushTimes(dao.dailyFlushTimes).setFightNum(dao.fightNum).setDailyIntegralNum(dao.dailyIntegralNum).build());
   }

   @MsgHandlerAnno
   public void C2S_Rank_28503(SupremePvpMsg.C2S_Rank_28503 msg, String source) {
      if (!this.player.isSystemOpen(6850)) {
         this.player.failure(21);
      } else if (!this.crossNettyClient.checkConnect()) {
         this.player.failure(76022);
      } else {
         SupremePvpDao dao = this.getDao();
         if (!DateUtil.isSameWeek(dao.joinTime, System.currentTimeMillis())) {
            dao.joinTime = System.currentTimeMillis();
            dao.updateOp();
         }

         HeroArrayingPart heroArrayingPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
         if (heroArrayingPart.getHeroCodesOfArraying(CommonMsg.HeroState.HERO_STATE_SUPREME_PVP).isEmpty()) {
            heroArrayingPart.saveHeroArrayingSameCommon(CommonMsg.HeroState.HERO_STATE_SUPREME_PVP);
         }

         this.player.uploadCrossPlayer();
         if (!StringUtils.isEmpty(source)) {
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), SupremePvpMsg.S2CR_Rank_28541.newBuilder().setRankType(msg.getRankType()).build());
         }

         heroArrayingPart.sendArrayingToCross(CommonMsg.HeroState.HERO_STATE_SUPREME_PVP);
      }
   }

   @MsgHandlerAnno
   public void C2S_ChallengeList_28505(SupremePvpMsg.C2S_ChallengeList_28505 msg, String source) {
      if (!this.player.isSystemOpen(6850)) {
         this.player.failure(21);
      } else if (!this.crossNettyClient.checkConnect()) {
         this.player.failure(76022);
      } else if (!this.isOpen()) {
         this.player.failure(55);
      } else if (this.crossNettyClient.checkConnect()) {
         SupremePvpDao dao = this.getDao();
         if (msg.getFlush()) {
            if (dao.dailyFlushTimes >= ApplicationContextProvider.getConfigInt("JiuZhouFreeRefreshTimes", 0)) {
               String[] jiuZhouPayRefresh = ApplicationContextProvider.getConfigString("JiuZhouPayRefresh", "").split("\\|");
               if (jiuZhouPayRefresh.length != 3) {
                  this.player.failure(0);
                  return;
               }

               if (!this.player.checkResourceNum(Integer.parseInt(jiuZhouPayRefresh[0]), Integer.parseInt(jiuZhouPayRefresh[1]), Integer.parseInt(jiuZhouPayRefresh[2]))) {
                  this.player.failure(31);
                  return;
               }

               this.player.delResource(Integer.parseInt(jiuZhouPayRefresh[0]), Integer.parseInt(jiuZhouPayRefresh[1]), (long)Integer.parseInt(jiuZhouPayRefresh[2]), 157, 15701, 0, 0, "");
            }

            ++dao.dailyFlushTimes;
            dao.updateOp();
         }

         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), SupremePvpMsg.S2CR_ChallengeList_28539.newBuilder().setFlush(msg.getFlush()).build());
      }
   }

   @MsgHandlerAnno
   public void C2S_FightRecord_28507(SupremePvpMsg.C2S_FightRecord_28507 msg, String source) {
      if (this.player.isSystemOpen(6850)) {
         this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), SupremePvpMsg.S2CR_FightRecord_28542.newBuilder().build());
      }
   }

   @MsgHandlerAnno
   public void C2S_WarOrderBuy_28509(SupremePvpMsg.C2S_WarOrderBuy_28509 msg, String source) {
      if (!this.player.isSystemOpen(6850)) {
         this.player.failure(21);
      } else {
         int buyNum = msg.getNum();
         if (buyNum <= 0) {
            this.player.failure(4);
         } else {
            SupremePvpDao dao = this.getDao();
            if (this.player.getPlayerDao().pri_supreme_war_order <= 0 && !DateUtil.isSameDay(System.currentTimeMillis(), dao.warOrderEndTime)) {
               this.logger.error("玩家{}战令购买失败,今天不是最后一天{}", this.player.getPlayerId(), DateUtil.transferLongToDate(dao.warOrderEndTime));
            } else {
               int buyLimitLv = ApplicationContextProvider.getConfigInt("JiuZhouWarOrderBuyMax", 80);
               int warOrderLv = dao.warOrderLv;
               if (warOrderLv >= buyLimitLv) {
                  this.player.failure(25);
               } else {
                  ConfigManager configManager = (ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class);
                  int itemId = ApplicationContextProvider.getConfigInt("JiuZhouWarOrderScore", 1030);
                  ResourceModel addRes = null;
                  ResourceModel feeRes;
                  switch (msg.getBuyType()) {
                     case INTEGRAL:
                        int itemNum = (int)this.player.getResourceNum(2, itemId);
                        int limitItemNum = -itemNum;

                        for(int lv = warOrderLv; lv < buyLimitLv; ++lv) {
                           SupremePvpWarOrderModel warOrderModel = this.getWarOrderModel(lv);
                           if (warOrderModel == null) {
                              break;
                           }

                           limitItemNum += warOrderModel.getIntegral();
                        }

                        buyNum = Math.min(limitItemNum, buyNum);
                        List<Integer> jiuZhouWarOrderGrade = configManager.getIntList("JiuZhouWarOrderGrade");
                        feeRes = new ResourceModel(1, PlayerDefine.PLAYER_GOLD, buyNum / (Integer)jiuZhouWarOrderGrade.get(0) * (Integer)jiuZhouWarOrderGrade.get(1));
                        addRes = new ResourceModel(2, itemId, buyNum);
                        break;
                     case LEVEL:
                        buyNum = Math.min(buyLimitLv - warOrderLv, buyNum);
                        warOrderLv += buyNum;
                        List<Integer> jiuZhouWarOrderLevel = configManager.getIntList("JiuZhouWarOrderLevel");
                        feeRes = new ResourceModel((Integer)jiuZhouWarOrderLevel.get(0), (Integer)jiuZhouWarOrderLevel.get(1), (Integer)jiuZhouWarOrderLevel.get(2) * buyNum);
                        break;
                     default:
                        return;
                  }

                  if (buyNum <= 0) {
                     this.player.failure(25);
                  } else if (!this.player.checkResourceNum(feeRes)) {
                     this.player.failure(31);
                  } else {
                     this.player.delResource(feeRes, 157, 15706, 0, 0, msg.getBuyType().name());
                     if (addRes != null) {
                        this.player.addResource(addRes, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 157, 15706, 0, 0, msg.getBuyType().name());
                     }

                     if (warOrderLv != dao.warOrderLv) {
                        dao.warOrderLv = warOrderLv;
                        dao.updateOp();
                        this.player.sendMsg(SupremePvpMsg.S2C_WarOrderLv_28512.newBuilder().setWarOrderLv(warOrderLv).build());
                     }

                     this.player.sendMsg(SupremePvpMsg.S2C_WarOrderBuy_28510.newBuilder().setBuyType(msg.getBuyType()).setNum(buyNum).build());
                  }
               }
            }
         }
      }
   }

   public void checkWarOrderLv() {
      this.player.pushTask(() -> {
         SupremePvpDao dao = this.getDao();
         int oldLv = dao.warOrderLv;
         int itemId = ApplicationContextProvider.getConfigInt("JiuZhouWarOrderScore", 1030);
         int itemNum = (int)this.player.getResourceNum(2, itemId);

         for(SupremePvpWarOrderModel warOrderModel = this.getWarOrderModel(dao.warOrderLv); warOrderModel != null && itemNum >= warOrderModel.getIntegral(); warOrderModel = this.getWarOrderModel(dao.warOrderLv)) {
            ++dao.warOrderLv;
            dao.updateOp();
            itemNum -= warOrderModel.getIntegral();
         }

         if (oldLv != dao.warOrderLv) {
            long delNum = this.player.getResourceNum(2, itemId) - (long)itemNum;
            this.player.delResource(2, itemId, delNum, 157, 15707, dao.warOrderLv, 0, "");
            this.player.sendMsg(SupremePvpMsg.S2C_WarOrderLv_28512.newBuilder().setWarOrderLv(dao.warOrderLv).build());
         }

      });
   }

   @MsgHandlerAnno
   public void C2S_WarOrder_28513(SupremePvpMsg.C2S_WarOrder_28513 msg, String source) {
      if (this.player.isSystemOpen(6850)) {
         SupremePvpDao dao = this.getDao();
         this.player.sendMsg(SupremePvpMsg.S2C_WarOrder_28514.newBuilder().setWarOrderEnd(DateUtil.getIntTime(dao.warOrderEndTime)).setWarOrderLv(dao.warOrderLv).setGotCommonMaxLv(dao.gotCommonMaxLv).setGotSuperMaxLv(dao.gotSuperMaxLv).build());
      }
   }

   @MsgHandlerAnno
   public void C2S_WarOrderRewardAll_28515(SupremePvpMsg.C2S_WarOrderRewardAll_28515 msg, String source) {
      if (this.player.isSystemOpen(6850)) {
         SupremePvpDao dao = this.getDao();
         List<ResourceModel> rewards = this.warOrderReward();
         if (rewards != null) {
            this.player.addResource(rewards, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 157, 15708);
         }

         this.player.sendMsg(SupremePvpMsg.S2C_WarOrderRewardAll_28516.newBuilder().setGotCommonMaxLv(dao.gotCommonMaxLv).setGotSuperMaxLv(dao.gotSuperMaxLv).build());
      }
   }

   private List<ResourceModel> warOrderReward() {
      SupremePvpDao dao = this.getDao();
      List<ResourceModel> rewards = null;
      if (dao.warOrderLv > dao.gotCommonMaxLv) {
         for(int lv = dao.gotCommonMaxLv + 1; lv <= dao.warOrderLv; ++lv) {
            SupremePvpWarOrderModel warOrderModel = this.getWarOrderModel(lv);
            if (warOrderModel != null) {
               if (rewards == null) {
                  rewards = new ArrayList();
               }

               rewards.addAll(warOrderModel.rewards());
            }
         }

         dao.gotCommonMaxLv = dao.warOrderLv;
         dao.updateOp();
      }

      if (dao.warOrderLv > dao.gotSuperMaxLv && this.getPlayer().getPlayerDao().pri_supreme_war_order > 0) {
         for(int lv = dao.gotSuperMaxLv + 1; lv <= dao.warOrderLv; ++lv) {
            SupremePvpWarOrderModel warOrderModel = this.getWarOrderModel(lv);
            if (warOrderModel != null) {
               if (rewards == null) {
                  rewards = new ArrayList();
               }

               rewards.addAll(warOrderModel.rewards1());
            }
         }

         dao.gotSuperMaxLv = dao.warOrderLv;
         dao.updateOp();
      }

      return rewards;
   }

   @MsgHandlerAnno
   public void CR2S_ChallengeList_28540(SupremePvpMsg.CR2S_ChallengeList_28540 msg, CrossSubscribeMsg crossSubscribeMsg) {
      if (this.isOpen()) {
         SupremePvpDao dao = this.getDao();
         this.player.sendMsg(SupremePvpMsg.S2C_ChallengeList_28506.newBuilder().setFlush(msg.getFlush()).setDailyFlushTimes(dao.dailyFlushTimes).addAllPlayer(msg.getPlayerList()).build());
      }
   }

   @MsgHandlerAnno
   public void CR2S_CrossFight_28532(SupremePvpMsg.CR2S_CrossFight_28532 msg, CrossSubscribeMsg crossSubscribeMsg) {
      Map<Integer, BattleDao> battleDaoMap = this.player.<Integer, BattleDao>getMap("tb_battle", this.player.getPlayerId());
      BattleDao battleDao = (BattleDao)battleDaoMap.get(6850);
      if (battleDao == null) {
         this.logger.error("战斗-->{}进入【九州至尊PVP】战斗失败,战斗数据不存在", this.player.getPlayerId());
      } else {
         battleDao.stream = msg.getBattleMsg().toByteArray();

         try {
            battleDao.scene = new BattleScene(BattleMsg.S2C_BattleResult_6102.parseFrom(battleDao.stream));
         } catch (InvalidProtocolBufferException e) {
            this.logger.error("战斗-->{}进入【九州至尊PVP】战斗失败,战斗数据解析出错", this.player.getPlayerId());
            e.printStackTrace();
         }

         SupremePvpDao dao = this.getDao();
         int itemId = ApplicationContextProvider.getConfigInt("JiuZhouWarOrderScore", 1030);
         int itemLimit = ApplicationContextProvider.getConfigInt("JiuZhouWarOrderLimit", 150);

         for(CommonMsg.ItemInfo itemInfo : msg.getBattleMsg().getResult().getAwardItemsList()) {
            int resNum = itemInfo.getNum();
            if (itemInfo.getType() == 2 && itemInfo.getId() == itemId) {
               if (dao.dailyIntegralNum >= itemLimit) {
                  continue;
               }

               dao.dailyIntegralNum += resNum;
               if (dao.dailyIntegralNum > itemLimit) {
                  resNum -= dao.dailyIntegralNum - itemLimit;
                  dao.dailyIntegralNum = itemLimit;
               }

               dao.updateOp();
            }

            if (resNum > 0) {
               battleDao.rewards.add(new ResourceModel(itemInfo.getType(), itemInfo.getId(), resNum));
            }
         }

         battleDao.status = 0;
         battleDao.totalTime = (long)battleDao.scene.getCostTime();
         battleDao.updateOp();
         this.sendMain();
         this.player.sendMsg(msg.getBattleMsg());
         this.player.addResource(battleDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 157, 15702, 0, 0, "");
         this.player.getOperationMgr().addExtraLog(this.player, 234, String.valueOf(msg.getPlayerId()), String.valueOf(msg.getBeforeScore()), String.valueOf(msg.getAfterScore()));
         this.player.getOperationMgr().addExtraLog(this.player, 207, this.player.getPublicDao().vip_lv + "", "九州至尊", "1");
      }
   }

   public int enterBattle(BattleDao battleDao) {
      if (battleDao.params.isEmpty()) {
         return 0;
      } else if (!this.crossNettyClient.checkConnect()) {
         return 76022;
      } else if (!this.isOpen()) {
         return 55;
      } else {
         ArrayingMirror arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_SUPREME_PVP);
         if (arrayingMirror == null) {
            return 0;
         } else {
            SupremePvpDao dao = this.getDao();
            if (battleDao.isSkip && dao.fightNum < ApplicationContextProvider.getConfigInt("JiuZhouSkipBattle", 0)) {
               return 76530;
            } else {
               int freeTimes = ApplicationContextProvider.getConfigInt("JiuZhouChallengeFreeTimes", 0);
               if (dao.dailyFightNum >= freeTimes) {
                  if (dao.dailyFightNum - freeTimes >= ApplicationContextProvider.getConfigInt("JiuZhouFightLimit", 0)) {
                     return 51;
                  }

                  int itemId = ApplicationContextProvider.getConfigInt("JiuZhouChallengeItem", 0);
                  int itemNum = ApplicationContextProvider.getConfigInt("JiuZhouChallengeCost", 0);
                  if (!this.player.checkResourceNum(2, itemId, itemNum)) {
                     return 4;
                  }

                  this.player.delResource(2, itemId, (long)itemNum, 157, 15702, 0, 0, "");
               }

               ++dao.dailyFightNum;
               ++dao.fightNum;
               dao.updateOp();
               this.sendMain();
               this.player.uploadCrossPlayer();
               SupremePvpMsg.S2CR_CrossFight_28531.Builder builder = SupremePvpMsg.S2CR_CrossFight_28531.newBuilder();
               builder.setPlayerId((Integer)battleDao.params.get(0));
               builder.setIsSkip(battleDao.isSkip);
               builder.setAtkArray(ByteString.copyFrom(arrayingMirror.toByteArray()));
               this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
               this.player.triggerTask(765, 0, 1L, 1);
               return 1;
            }
         }
      }
   }

   public void endBattle(BattleDao battleDao) {
   }

   private SupremePvpDao getDao() {
      return (SupremePvpDao)this.player.getData("tb_supreme_pvp", this.player.getPlayerId());
   }

   public void uploadArraying() {
      if (this.player.isSystemOpen(6850)) {
         ArrayingMirror arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_SUPREME_PVP);
         if (arrayingMirror != null && !arrayingMirror.arrayingIsEmpty()) {
            SupremePvpMsg.S2CR_UpdateDefArray_28533.Builder builder = SupremePvpMsg.S2CR_UpdateDefArray_28533.newBuilder();
            builder.setDefArray(ByteString.copyFrom(arrayingMirror.toByteArray()));
            builder.setDefPower(arrayingMirror.power);
            this.crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
         }

      }
   }

   private boolean isOpen() {
      List<Integer> pvpOpenTime = ((ConfigManager)ApplicationContextProvider.getContext().getBean(ConfigManager.class)).getIntList("JiuZhouChallengeTime");
      int hour = LocalDateTime.now().getHour();
      return hour >= (Integer)pvpOpenTime.get(0) && hour <= (Integer)pvpOpenTime.get(1);
   }

   private SupremePvpWarOrderModel getWarOrderModel(int lv) {
      TreeMap<Integer, SupremePvpWarOrderModel> modelPoolMap = new TreeMap(ApplicationContextProvider.getModelPoolMap("JiuZhouWarCardReward"));
      SupremePvpWarOrderModel lastWarOrderModel = (SupremePvpWarOrderModel)modelPoolMap.lastEntry().getValue();
      SupremePvpWarOrderModel supremePvpWarOrderModel;
      if (lv > lastWarOrderModel.getId() - 1) {
         supremePvpWarOrderModel = lastWarOrderModel;
      } else {
         supremePvpWarOrderModel = (SupremePvpWarOrderModel)modelPoolMap.get(lv);
      }

      return supremePvpWarOrderModel;
   }

   public void gm(String cmd) {
      SupremePvpDao dao = this.getDao();
      String[] split = cmd.split(",");
      ChatMgr chatMgr = (ChatMgr)ApplicationContextProvider.getContext().getBean(ChatMgr.class);
      switch (split[0]) {
         case "resetall":
            dao.gotCommonMaxLv = 0;
            dao.gotSuperMaxLv = 0;
            dao.warOrderLv = 0;
            dao.fightNum = 0;
            dao.dailyFlushTimes = 0;
            dao.dailyFightNum = 0;
            dao.dailyIntegralNum = 0;
            dao.updateOp();
            this.sendMain();
            break;
         case "fightnum":
            dao.fightNum = Integer.parseInt(split[1]);
            dao.updateOp();
            this.sendMain();
            break;
         case "warorderlv":
            dao.warOrderLv = Integer.parseInt(split[1]);
            dao.updateOp();
            this.player.sendMsg(SupremePvpMsg.S2C_WarOrderLv_28512.newBuilder().setWarOrderLv(dao.warOrderLv).build());
            break;
         case "resetseason":
         case "settleseason":
         case "settledaily":
         case "setscore":
         case "setgrade":
         case "regroupteam":
            if (split.length > 1) {
               chatMgr.crossGm("supremepvp," + split[0] + "|" + split[1], this.player.getPlayerId());
            } else {
               chatMgr.crossGm("supremepvp," + split[0], this.player.getPlayerId());
            }
            break;
         case "autojoin":
            String[] split1 = split[1].split("\\|");
            int grade = Integer.parseInt(split1[0]);
            int count = Integer.parseInt(split1[1]);
            if (count <= 0) {
               return;
            }

            WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);

            for(GamePlayer gamePlayer : worldMgr.getPlayerMap().values()) {
               if (!gamePlayer.isRobot() && gamePlayer.isSystemOpen(6850)) {
                  HeroArrayingPart heroArrayingPart = (HeroArrayingPart)gamePlayer.getMgrPart(HeroArrayingPart.class);
                  if (!heroArrayingPart.getHeroCodesOfArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING).isEmpty()) {
                     SupremePvpDao supremePvpDao = (SupremePvpDao)gamePlayer.getData("tb_supreme_pvp", gamePlayer.getPlayerId());
                     if (!DateUtil.isSameWeek(System.currentTimeMillis(), supremePvpDao.joinTime)) {
                        gamePlayer.pushTask(() -> {
                           gamePlayer.uploadCrossPlayer();
                           SupremePvpPart supremePvpPart = (SupremePvpPart)gamePlayer.getMgrPart(SupremePvpPart.class);
                           supremePvpPart.gm("setgrade," + grade);
                           supremePvpPart.C2S_Rank_28503((SupremePvpMsg.C2S_Rank_28503)null, (String)null);
                        });
                        --count;
                        if (count <= 0) {
                           break;
                        }
                     }
                  }
               }
            }
      }

   }
}
