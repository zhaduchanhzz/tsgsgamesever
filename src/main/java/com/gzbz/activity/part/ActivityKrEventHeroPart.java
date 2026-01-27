package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.battle.entity.Entity;
import com.gzbz.battle.pkteam.BattlePKTeam;
import com.gzbz.db.ActivityKrEventHeroDao;
import com.gzbz.db.BattleDao;
import com.gzbz.db.HeroArrayingDao;
import com.gzbz.db.HeroDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerPublicDao;
import com.gzbz.db.bean.ArrayingMirror;
import com.gzbz.db.bean.CustomizeGiftData;
import com.gzbz.db.bean.DrawViewData;
import com.gzbz.db.bean.DrawViewLogInfo;
import com.gzbz.db.bean.TaskData;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.expedition.ExpeditionPart;
import com.gzbz.gamePlayer.heroPart.HeroArrayingPart;
import com.gzbz.gamePlayer.heroPart.HeroBagPart;
import com.gzbz.gamePlayer.heroPart.HeroRankMgr;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.gamePlayer.playerBag.ItemBagPart;
import com.gzbz.gift.GiftPart;
import com.gzbz.gift.bean.PlayerGiftExtend;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.CustomizeGiftBagModel;
import com.gzbz.model.EventHeroAddUpRechargeModel;
import com.gzbz.model.EventHeroBossRewardNewModel;
import com.gzbz.model.EventHeroChallengeRewardModel;
import com.gzbz.model.EventHeroConRechargeModel;
import com.gzbz.model.EventHeroLotteryModel;
import com.gzbz.model.EventHeroMainModel;
import com.gzbz.model.EventHeroPrograssTaskModel;
import com.gzbz.model.ShopLimitModel;
import com.gzbz.model.SpecificGroupModel;
import com.gzbz.model.fun.KeyValFun;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.BaseAddUpRechargeModel;
import com.gzbz.model.manager.BaseConRechargeModel;
import com.gzbz.protobuf.ActivityKrEventHeroMsg;
import com.gzbz.protobuf.ActivityMsg;
import com.gzbz.protobuf.BattleMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.HeroMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.bean.RankData;
import com.gzbz.spring.ApplicationContextProvider;
import com.gzbz.task.ActivityEventHeroTaskPart;
import com.gzbz.worldMgr.WorldMgr;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import misc.MapUtil;
import misc.MiscUtil;
import misc.RandomUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ActivityKrEventHeroPart extends AddUpAndConRechargeActivityPart {
   @Autowired
   RankMgr rankMgr;
   @Autowired
   WorldMgr worldMgr;
   @Autowired
   private HeroRankMgr heroRankMgr;
   private static final int REWARD_ENJOY_HERO = 1;
   private static final int REWARD_ENJOY_ITEM = 2;
   private static final int REWARD_NORMAL = 3;
   public static final int TASK_TYPE_NORMAL = 1;
   public static final int TASK_TYPE_BOX = 2;

   public void loginHandle() {
      super.loginHandle();
   }

   public ActivityKrEventHeroDao getDao() {
      return (ActivityKrEventHeroDao)this.player.getData("tb_activity_kr_event_hero", this.player.getPlayerId());
   }

   public int getActivityLogModule() {
      return 149;
   }

   public int getAddUpLogReason() {
      return 14901;
   }

   public int getAddUpMail() {
      if (!this.isAddUpOpen()) {
         return 0;
      } else {
         Map<String, Integer> mailIdMap = this.getMailIdMap();
         return null != mailIdMap && mailIdMap.containsKey("addUp") ? (Integer)mailIdMap.get("addUp") : 0;
      }
   }

   public String getAddUpExcelName() {
      return !this.isAddUpOpen() ? "" : "eventHeroAddUpRecharge";
   }

   public int getConLogReason() {
      return 14902;
   }

   public int getConMail() {
      if (!this.isConOpen()) {
         return 0;
      } else {
         Map<String, Integer> mailIdMap = this.getMailIdMap();
         return null != mailIdMap && mailIdMap.containsKey("con") ? (Integer)mailIdMap.get("con") : 0;
      }
   }

   public String getConExcelName() {
      return !this.isConOpen() ? "" : "eventHeroConRecharge";
   }

   public int getActivityType() {
      return 109;
   }

   public boolean isServerActivityInvalid() {
      if (super.isServerActivityInvalid()) {
         return true;
      } else {
         ActivityKrEventHeroDao dao = this.getDao();
         return dao.mainId <= 0;
      }
   }

   public Map<String, Integer> getMailIdMap() {
      Map<String, Integer> mailIdMap = new HashMap();
      EventHeroMainModel nowEventHeroMainModel = this.getEventHeroMainModel();
      if (null == nowEventHeroMainModel) {
         return mailIdMap;
      } else {
         String mailIdStr = nowEventHeroMainModel.getMailId();
         if (StringUtils.isBlank(mailIdStr)) {
            return mailIdMap;
         } else {
            String[] mailIdStrSplit = mailIdStr.split("\\|");

            for(String pre_mailIdStr : mailIdStrSplit) {
               String[] pre_mailId = pre_mailIdStr.split(":");
               if (pre_mailId.length >= 2) {
                  mailIdMap.put(pre_mailId[0], Integer.parseInt(pre_mailId[1]));
               }
            }

            return mailIdMap;
         }
      }
   }

   public EventHeroMainModel getEventHeroMainModel() {
      int mainId = this.getMainId();
      EventHeroMainModel model = (EventHeroMainModel)ApplicationContextProvider.getModelPoolEntity("eventHeroMain", mainId);
      if (model == null) {
         this.logger.error("没有当前开服天数的EventHeroMainModel openDay:{}", this.getActivityOpenDay());
      }

      return model;
   }

   public boolean gmTriggerOptionGift() {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         EventHeroMainModel eventHeroMainModel = this.getEventHeroMainModel();
         if (null == eventHeroMainModel) {
            return this.player.failure(37);
         } else {
            this.completeChapterHandle(eventHeroMainModel.getBannerId());
            return true;
         }
      }
   }

   public boolean gmClearOptionGift() {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         this.clearOptionGift(this.getCurGiftId());
         ActivityKrEventHeroDao dao = this.getDao();
         dao.resetOptionGiftData();
         return true;
      }
   }

   public void completeChapterHandle(int chapterId) {
      if (!this.isServerActivityInvalid()) {
         Map<Integer, EventHeroMainModel> eventHeroMainMap = ApplicationContextProvider.<Integer, EventHeroMainModel>getModelPoolMap("eventHeroMain");

         for(Map.Entry<Integer, EventHeroMainModel> eventHeroMain : eventHeroMainMap.entrySet()) {
            EventHeroMainModel model = (EventHeroMainModel)eventHeroMain.getValue();
            if (chapterId == model.getBannerId()) {
               int curGiftId = this.getCurGiftId();
               if (curGiftId > 0) {
                  this.clearOptionGift(curGiftId);
                  ActivityKrEventHeroDao dao = this.getDao();
                  dao.optionGiftId = curGiftId;
                  dao.updateOp();
                  GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
                  giftPart.triggerTimeLimitGift(34, curGiftId);
                  break;
               }
            }
         }

      }
   }

   public int getCurGiftId() {
      Map<Integer, CustomizeGiftBagModel> giftBagModelMap = (Map)ApplicationContextProvider.getModelPoolEntity("customCustomizeGiftBag", this.getPlayerActivityId());
      if (null != giftBagModelMap && !giftBagModelMap.isEmpty()) {
         WorldMgr worldMgr = (WorldMgr)ApplicationContextProvider.getContext().getBean(WorldMgr.class);
         int openServerDays = worldMgr.getOpenServerDays();
         if (openServerDays <= 0) {
            openServerDays = 1;
         }

         for(Integer giftId : giftBagModelMap.keySet()) {
            ShopLimitModel shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", giftId);
            if (openServerDays >= shopLimitModel.getDateStart() && openServerDays <= shopLimitModel.getDateEnd()) {
               return giftId;
            }
         }

         this.logger.error("新武将活动ShopLimit表未配置对应开服天数:{}的礼包", openServerDays);
         return 0;
      } else {
         return 0;
      }
   }

   public int getMainId() {
      ActivityKrEventHeroDao dao = this.getDao();
      if (dao.mainId <= 0) {
         int mainId = 0;
         int activityOpenDay = this.getActivityOpenDay();
         Map<Integer, EventHeroMainModel> mainModelMap = ApplicationContextProvider.<Integer, EventHeroMainModel>getModelPoolMap("eventHeroMain");
         if (mainModelMap == null || mainModelMap.isEmpty()) {
            this.logger.warn("新主题武将配置错误");
            return 1;
         }

         int id = this.getServerActivityInfo().id;
         ArrayList<Integer> list = new ArrayList();

         for(EventHeroMainModel model : mainModelMap.values()) {
            if (model.getActivityId() == id) {
               int dataEnd = model.getDataEnd() == -1 ? Integer.MAX_VALUE : model.getDataEnd();
               if (activityOpenDay >= model.getDateStart() && activityOpenDay <= dataEnd) {
                  mainId = model.getMainId();
                  break;
               }

               list.add(model.getMainId());
            }
         }

         if (mainId == 0 && !CollectionUtils.isEmpty(list)) {
            mainId = (Integer)list.get(0);
            this.logger.warn("新主题武将活动开启天数配置有误，给配置表第一个主题id:{}，当前为开服第{}天", mainId, activityOpenDay);
         }

         dao.mainId = mainId;
         dao.updateOp();
         this.resetExpedition(mainId);
      }

      return dao.mainId;
   }

   private void sendActivityInfo() {
      ActivityInfo activityInfo = this.getServerActivityInfo();
      if (activityInfo != null) {
         int mainId = this.getMainId();
         ActivityKrEventHeroDao dao = this.getDao();
         ActivityKrEventHeroMsg.S2C_KrHeroThemeInfo_25002.Builder builder = ActivityKrEventHeroMsg.S2C_KrHeroThemeInfo_25002.newBuilder();
         builder.setFight(dao.fight);
         builder.setTotalDamage(dao.totalDamage);
         builder.addAllFightReward(dao.fightReward);
         builder.setTotalPoint(dao.totalPoint);
         builder.addAllPointReward(dao.pointReward);
         builder.setStartTime(activityInfo.start);
         builder.setEndTime(activityInfo.end);
         builder.setServerOpenDay(this.getActivityOpenDay());
         builder.setActivityDay(this.getSeverActivityDay());
         builder.setMainId(mainId);
         builder.setReceiveBox(dao.receiveBox);
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_KrHeroThemeInfo_25001(ActivityKrEventHeroMsg.C2S_KrHeroThemeInfo_25001 msg, String source) {
      this.sendActivityInfo();
   }

   @MsgHandlerAnno
   public void C2S_KrMate_25003(ActivityKrEventHeroMsg.C2S_KrMate_25003 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         EventHeroMainModel eventHeroMainMode = this.getEventHeroMainModel();
         if (eventHeroMainMode != null) {
            int limitFight = eventHeroMainMode.getEventHeroFightTime();
            ActivityKrEventHeroDao dao = this.getDao();
            if (dao.fight >= limitFight) {
               this.player.failure(0);
            } else {
               long power = this.player.getPlayerCombatPower();
               String matchLimit = eventHeroMainMode.getEventHeroMatchPower();
               String[] powerLimit = matchLimit.split(",");
               int matchPlayerId = 0;

               for(String s : powerLimit) {
                  int minLimit = Integer.parseInt(s.split("\\|")[0]);
                  int maxLimit = Integer.parseInt(s.split("\\|")[1]);
                  long minPower = power * (long)minLimit / 10000L;
                  long maxPower = power * (long)maxLimit / 10000L;
                  List<RankData> rankDataList = this.rankMgr.getRanks(RankDefine.RankModule.COMBAT_POWER, minPower, Math.max(maxPower, 20000L));
                  if (!rankDataList.isEmpty()) {
                     List<Integer> matchList = new ArrayList();

                     for(RankData rankData : rankDataList) {
                        matchList.add(rankData.value);
                     }

                     Collections.shuffle(matchList);
                     if (matchList.size() != 1 || (Integer)matchList.get(0) != this.player.getPlayerId()) {
                        int match;
                        if ((Integer)matchList.get(0) == this.player.getPlayerId()) {
                           match = (Integer)matchList.get(matchList.size() - 1);
                        } else {
                           match = (Integer)matchList.get(0);
                        }

                        GamePlayer matchPlayer = this.worldMgr.getPlayerById(match);
                        if (matchPlayer != null) {
                           matchPlayerId = matchPlayer.getPlayerId();
                           break;
                        }
                     }
                  }
               }

               if (matchPlayerId == 0) {
                  List<RankData> rankDataList = this.rankMgr.getRanks(RankDefine.RankModule.COMBAT_POWER, 100);
                  if (rankDataList.isEmpty()) {
                     this.player.failure(59002);
                     return;
                  }

                  Collections.shuffle(rankDataList);
                  matchPlayerId = ((RankData)rankDataList.get(0)).value;
               }

               if (matchPlayerId == 0) {
                  if (this.worldMgr.getOnlinePlayerMap().isEmpty()) {
                     this.player.failure(59002);
                     return;
                  }

                  List<Integer> playerList = new ArrayList(this.worldMgr.getOnlinePlayerMap().keySet());
                  Collections.shuffle(playerList);
                  if (playerList.isEmpty() || playerList.size() == 1 && (Integer)playerList.get(0) == this.player.getPlayerId()) {
                     this.player.failure(59002);
                     return;
                  }

                  if ((Integer)playerList.get(0) == this.player.getPlayerId()) {
                     matchPlayerId = (Integer)playerList.get(playerList.size() - 1);
                  } else {
                     matchPlayerId = (Integer)playerList.get(0);
                  }
               }

               GamePlayer matchPlayer = this.worldMgr.getPlayerById(matchPlayerId);
               dao.matchPlayerId = matchPlayerId;
               dao.updateOp();
               PlayerPublicDao matchDao = matchPlayer.getPublicDao();
               ActivityKrEventHeroMsg.S2C_KrMate_25004.Builder builder = ActivityKrEventHeroMsg.S2C_KrMate_25004.newBuilder();
               builder.setPower(matchPlayer.getPlayerCombatPower());
               builder.setMonarchId(matchDao.monarchId);
               builder.setPlayerName(matchDao.playerName);
               builder.setSex(matchDao.sex);
               ArrayingMirror arrayingMirror = matchPlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_THEME);
               if (arrayingMirror == null || arrayingMirror.arrayingElementsMap.isEmpty()) {
                  arrayingMirror = matchPlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
               }

               builder.setArraying(arrayingMirror.toPlayerArrayingInfo());
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_KrPointReward_25007(ActivityKrEventHeroMsg.C2S_KrPointReward_25007 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         ActivityKrEventHeroDao dao = this.getDao();
         if (dao.mainId == 0) {
            this.logger.info("新武将活动未开启");
         } else if (dao.pointReward.contains(msg.getId())) {
            this.player.failure(76030);
         } else {
            EventHeroChallengeRewardModel rewardModel = (EventHeroChallengeRewardModel)ApplicationContextProvider.getModelPoolEntity("eventHeroChallengeReward", msg.getId());
            if (rewardModel != null) {
               if (rewardModel.getMainId() != dao.mainId) {
                  this.logger.info("{}领取的奖励不是该活动奖励 mainId:{}", this.player.getPlayerId(), dao.mainId);
               } else if (dao.totalPoint < rewardModel.getBonus()) {
                  this.logger.info("总积分不足，不可领取");
               } else {
                  dao.pointReward.add(msg.getId());
                  dao.updateOp();
                  this.player.addResource(rewardModel.getReward(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 106, 14904, msg.getId(), 0, "");
                  ActivityKrEventHeroMsg.S2C_KrPointReward_25008.Builder builder = ActivityKrEventHeroMsg.S2C_KrPointReward_25008.newBuilder();
                  builder.setId(msg.getId());
                  this.player.sendMsg(builder.build());
                  this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 16, 82, "新武将活动", rewardModel.getBonus() + "", rewardModel.getBonus() + "", msg.getId(), 0, 1);
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_KrLootInfo_25021(ActivityKrEventHeroMsg.C2S_KrLootInfo_25021 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         this.sendLootInfo();
      }
   }

   @MsgHandlerAnno
   public void C2S_KrLootReward_25023(ActivityKrEventHeroMsg.C2S_KrLootReward_25023 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         EventHeroMainModel eventHeroMainModel = this.getEventHeroMainModel();
         if (eventHeroMainModel != null) {
            ActivityKrEventHeroDao dao = this.getDao();
            if (dao.enjoyId == 0) {
               this.player.failure(61226);
            } else if (dao.dailyLootNum >= eventHeroMainModel.getDayLimit()) {
               this.player.failure(51);
            } else {
               EventHeroLotteryModel enjoyModel = (EventHeroLotteryModel)ApplicationContextProvider.getModelPoolEntity("eventHeroLottery", dao.enjoyId);
               if (enjoyModel != null) {
                  int lootNum = msg.getNum();
                  ResourceModel needResource = new ResourceModel(2, eventHeroMainModel.getEventHeroCall(), lootNum);
                  if (!this.player.checkResourceNum(needResource)) {
                     this.player.failure(3);
                  } else {
                     int oriEnjoyId = dao.enjoyId;
                     List<Integer> rewardIdList = new ArrayList();
                     List<KeyValFun> weightList = this.getJackpotWeight();
                     weightList.add(new KeyValFun(enjoyModel.getId(), enjoyModel.getWeight()));
                     if (weightList.size() <= 1) {
                        this.logger.info("新主题武将 - plyerId:{} 抽奖配置有误", this.player.getPlayerId());
                     } else if (lootNum >= weightList.size()) {
                        this.logger.info("玩家{}抽取次数比奖池物品还要多。。。 抽取次数：{} 奖池物品数量：{}", new Object[]{this.player.getPlayerId(), lootNum, weightList.size()});
                     } else {
                        for(int i = 0; i < lootNum; ++i) {
                           if (enjoyModel.getMustNum() > 0 && dao.curLootNum + 1 >= enjoyModel.getMustNum()) {
                              rewardIdList.add(enjoyModel.getId());
                              this.resetJackpot();
                           } else {
                              int rewardId = GamePlayer.countRate(weightList);
                              EventHeroLotteryModel tempModel = (EventHeroLotteryModel)ApplicationContextProvider.getModelPoolEntity("eventHeroLottery", rewardId);
                              if (tempModel.getPreposeNum() > dao.curLootNum) {
                                 rewardId = tempModel.getSwapId() > 0 ? tempModel.getSwapId() : rewardId;
                              }

                              rewardIdList.add(rewardId);
                              ++dao.curLootNum;
                              if (rewardId == dao.enjoyId) {
                                 this.logger.info("新主题武将 - 玩家 {} 抽取第{}次时抽中了心仪物品 {}，重置奖池数据", new Object[]{this.player.getPlayerId(), dao.curLootNum, rewardId});
                                 this.resetJackpot();
                              }
                           }
                        }

                        if (rewardIdList.size() != lootNum) {
                           this.logger.error("新主题武将 - 玩家 {} 抽奖发生错误 抽奖:{}次，获得{}个物品", new Object[]{this.player.getPlayerId(), lootNum, rewardIdList.size()});
                        }

                        this.player.delResource(needResource, 106, 14908, 0, lootNum, "");
                        List<ResourceModel> resourceModelList = new ArrayList();

                        for(Integer id : rewardIdList) {
                           EventHeroLotteryModel model = (EventHeroLotteryModel)ApplicationContextProvider.getModelPoolEntity("eventHeroLottery", id);
                           if (model == null) {
                              this.logger.info("新主题武将 - 抽奖获得的奖励错误 playerId:{} id:{}", this.player.getPlayerId(), id);
                           } else {
                              resourceModelList.addAll(model.getItems());
                              if (model.getSurplusNum() > 0 || oriEnjoyId == id) {
                                 int oriNum = (Integer)dao.enjoyMap.getOrDefault(id, 0);
                                 dao.enjoyMap.put(id, oriNum + 1);
                              }
                           }
                        }

                        this.player.addResource(resourceModelList, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 106, 14908, 0, 0, "");
                        dao.totalLootNum += lootNum;
                        dao.dailyLootNum += lootNum;
                        dao.updateOp();
                        ActivityKrEventHeroMsg.S2C_KrLootReward_25024.Builder builder = ActivityKrEventHeroMsg.S2C_KrLootReward_25024.newBuilder();
                        builder.addAllRewardId(rewardIdList);
                        builder.setCurLootNum(dao.curLootNum);
                        builder.setHadEnjoy(dao.enjoyId == 0);
                        builder.setDailyDrawNum(dao.dailyLootNum);

                        for(Map.Entry<Integer, Integer> entry : dao.enjoyMap.entrySet()) {
                           CommonMsg.MapDataII.Builder keyValue = CommonMsg.MapDataII.newBuilder();
                           keyValue.setKey((Integer)entry.getKey());
                           keyValue.setValue((Integer)entry.getValue());
                           builder.addEnjoyNum(keyValue);
                        }

                        this.player.sendMsg(builder.build());
                        int enjoyId = enjoyModel.getItems().size() > 0 ? ((ResourceModel)enjoyModel.getItems().get(0)).getId() : 0;

                        for(ResourceModel resourceModel : resourceModelList) {
                           String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                           this.player.getOperationMgr().addExtraLog(this.player, 198, "新主题武将-抽奖", "", lootNum + "", strings[0], strings[2], strings[1], strings[0].equals(String.valueOf(enjoyId)) ? "1" : "0");
                        }

                     }
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_KrLootEnjoy_25025(ActivityKrEventHeroMsg.C2S_KrLootEnjoy_25025 msg, String source) {
      ActivityKrEventHeroDao dao = this.getDao();
      if (msg.getId() != 0) {
         EventHeroLotteryModel model = (EventHeroLotteryModel)ApplicationContextProvider.getModelPoolEntity("eventHeroLottery", msg.getId());
         if (model == null || model.getMainId() != dao.mainId || model.getType() != 1 && model.getType() != 2) {
            return;
         }

         if (model.getSurplusNum() > 0) {
            int num = (Integer)dao.enjoyMap.getOrDefault(msg.getId(), 0);
            if (num >= model.getSurplusNum()) {
               this.player.failure(73131);
               return;
            }
         }
      }

      dao.enjoyId = msg.getId();
      dao.updateOp();
      ActivityKrEventHeroMsg.S2C_KrLootEnjoy_25026.Builder builder = ActivityKrEventHeroMsg.S2C_KrLootEnjoy_25026.newBuilder();
      builder.setId(msg.getId());
      this.player.sendMsg(builder.build());
   }

   private void resetJackpot() {
      ActivityKrEventHeroDao dao = this.getDao();
      dao.enjoyId = 0;
      dao.curLootNum = 0;
      dao.updateOp();
   }

   public List<KeyValFun> getJackpotWeight() {
      List<KeyValFun> keyValFunList = new ArrayList();

      for(int id : this.getJackpots()) {
         EventHeroLotteryModel model = (EventHeroLotteryModel)ApplicationContextProvider.getModelPoolEntity("eventHeroLottery", id);
         if (model != null) {
            keyValFunList.add(new KeyValFun(model.getId(), model.getWeight()));
         }
      }

      return keyValFunList;
   }

   public Set<Integer> getJackpots() {
      Set<Integer> rewardSet = new HashSet();
      int mainId = this.getMainId();
      List<EventHeroLotteryModel> modelList = (List)ApplicationContextProvider.getModelPoolEntity("customEventHeroLottery", mainId);
      if (modelList != null && !modelList.isEmpty()) {
         for(EventHeroLotteryModel model : modelList) {
            if (model.getType() == 3) {
               rewardSet.add(model.getId());
            }
         }

         return rewardSet;
      } else {
         return rewardSet;
      }
   }

   public boolean drawView(int lotteryId, int round) {
      EventHeroLotteryModel model = (EventHeroLotteryModel)this.player.getGameModelPool().getEntity("eventHeroLottery", lotteryId);
      if (null == model) {
         return this.player.failure(0);
      } else if (model.getType() != 1) {
         return this.player.failure(8024);
      } else {
         DrawViewData drawViewData = new DrawViewData();
         drawViewData.fancyRewardId = model.getId();
         int initRound = 0;
         List<EventHeroLotteryModel> lotteryModelList = (List)ApplicationContextProvider.getModelPoolEntity("customEventHeroLottery", model.getMainId());
         Map<Integer, DrawViewLogInfo> drawViewLogInfoMap = new HashMap();
         int n = 1;

         while(true) {
            int endNum = n * 50;
            int startNum = endNum - 49;
            int getFancyNum = 0;

            for(int i = startNum; i <= endNum; ++i) {
               int oldSmashNum_1 = (Integer)MapUtil.getOrDefault(drawViewData.roundSmashNum, 1, 0);
               drawViewData.roundSmashNum.put(1, oldSmashNum_1 + 1);
               int oldSmashNum_2 = (Integer)MapUtil.getOrDefault(drawViewData.roundSmashNum, 2, 0);
               drawViewData.roundSmashNum.put(2, oldSmashNum_2 + 1);
               EventHeroLotteryModel lotteryItemModel = this.gmSmashEgg(drawViewData, lotteryModelList);
               if (lotteryItemModel.getType() == 1) {
                  drawViewData.roundSmashNum.put(lotteryItemModel.getType(), 0);
               } else if (lotteryItemModel.getType() == 2) {
                  if (lotteryItemModel.getPreposeNum() > 0 || lotteryItemModel.getMustNum() > 0) {
                     drawViewData.roundSmashNum.put(lotteryItemModel.getType(), 0);
                  }
               } else {
                  int oldSmashNum = (Integer)MapUtil.getOrDefault(drawViewData.roundSmashNum, lotteryItemModel.getType(), 0);
                  drawViewData.roundSmashNum.put(lotteryItemModel.getType(), oldSmashNum + 1);
               }

               if (lotteryItemModel.getId() == lotteryId) {
                  ++getFancyNum;
                  ++initRound;
                  break;
               }
            }

            if (getFancyNum > 0) {
               n = 0;
            }

            DrawViewLogInfo logInfo = (DrawViewLogInfo)drawViewLogInfoMap.get(startNum);
            if (null == logInfo) {
               logInfo = new DrawViewLogInfo(startNum, endNum, getFancyNum);
            } else {
               int oldGetFancyNum = logInfo.getGetFancyNum();
               logInfo.setGetFancyNum(oldGetFancyNum + getFancyNum);
            }

            drawViewLogInfoMap.put(startNum, logInfo);
            if (initRound >= round) {
               String infoStr = "{0}~{1}次抽中目标奖励，{2}次，占比{3}%";

               for(Map.Entry<Integer, DrawViewLogInfo> entry : drawViewLogInfoMap.entrySet()) {
                  DrawViewLogInfo logInfo = (DrawViewLogInfo)entry.getValue();
                  double proportion = (double)logInfo.getGetFancyNum() / (double)round * (double)100.0F;
                  String format = MessageFormat.format(infoStr, logInfo.getStartNum(), logInfo.getEndNum(), logInfo.getGetFancyNum(), proportion);
                  this.logger.info(format);
               }

               return true;
            }

            ++n;
         }
      }
   }

   private EventHeroLotteryModel gmSmashEgg(DrawViewData drawViewData, List<EventHeroLotteryModel> lotteryModelList) {
      Map<Integer, EventHeroLotteryModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(EventHeroLotteryModel lotteryItemModel : lotteryModelList) {
         int roundSmashNum = (Integer)MapUtil.getOrDefault(drawViewData.roundSmashNum, lotteryItemModel.getType(), 0);
         if (lotteryItemModel.getPreposeNum() <= 0 || roundSmashNum >= lotteryItemModel.getPreposeNum()) {
            if (lotteryItemModel.getType() == 1) {
               if (drawViewData.fancyRewardId > 0 && drawViewData.fancyRewardId == lotteryItemModel.getId()) {
                  if (lotteryItemModel.getMustNum() > 0 && roundSmashNum >= lotteryItemModel.getMustNum()) {
                     return lotteryItemModel;
                  }

                  tempMap.put(lotteryItemModel.getId(), lotteryItemModel);
                  totalOdds += lotteryItemModel.getWeight();
               }
            } else {
               if (lotteryItemModel.getMustNum() > 0 && roundSmashNum >= lotteryItemModel.getMustNum()) {
                  return lotteryItemModel;
               }

               tempMap.put(lotteryItemModel.getId(), lotteryItemModel);
               totalOdds += lotteryItemModel.getWeight();
            }
         }
      }

      if (totalOdds <= 0) {
         this.logger.error("没有符合条件的物品");
         return null;
      } else {
         int r = RandomUtil.randInt(totalOdds);
         int loop = 0;

         for(EventHeroLotteryModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getWeight();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }

   public int enterBattle(BattleDao battleDao) {
      EventHeroMainModel eventHeroMainModel = this.getEventHeroMainModel();
      if (eventHeroMainModel == null) {
         return 0;
      } else {
         int limitFight = eventHeroMainModel.getEventHeroFightTime();
         ActivityKrEventHeroDao dao = this.getDao();
         if (dao.fight >= limitFight) {
            return 0;
         } else if (dao.matchPlayerId == 0) {
            return 59002;
         } else {
            int bossId = eventHeroMainModel.getEventHeroBossId();
            PlayerDao playerDao = this.player.getPlayerDao();
            ArrayingMirror arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_THEME);
            if (arrayingMirror == null || arrayingMirror.arrayingElementsMap.isEmpty()) {
               arrayingMirror = this.player.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
            }

            BattlePKTeam battlePKTeam1 = new BattlePKTeam(playerDao.playerId, playerDao.playerName, arrayingMirror, playerDao.lv, playerDao.head, playerDao.headFrame, this.heroRankMgr.getHeroRankCompensate(arrayingMirror, false));
            BattlePKTeam battlePKTeam2 = new BattlePKTeam(bossId);
            battleDao.scene.addPKTeam((byte)0, battlePKTeam1);
            battleDao.scene.addPKTeam((byte)1, battlePKTeam2);
            battleDao.scene.setWave((short)1, (short)2);
            int maxRound = eventHeroMainModel.getEventHeroBossRound();
            battleDao.scene.setMaxRound((byte)maxRound);
            return 1;
         }
      }
   }

   public int nextBattle(BattleDao battleDao) {
      ActivityKrEventHeroDao dao = this.getDao();
      GamePlayer matchPlayer = this.worldMgr.getPlayerById(dao.matchPlayerId);
      if (matchPlayer == null) {
         return 0;
      } else {
         PlayerPublicDao matchDao = matchPlayer.getPublicDao();
         HeroArrayingPart matchArrayingPart = (HeroArrayingPart)matchPlayer.getMgrPart(HeroArrayingPart.class);
         ArrayingMirror matchArraying;
         if (matchArrayingPart.getHeroCodesOfArraying(CommonMsg.HeroState.HERO_STATE_THEME).isEmpty()) {
            matchArraying = matchPlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_ARRAYING);
         } else {
            matchArraying = matchPlayer.getPlayerArraying(CommonMsg.HeroState.HERO_STATE_THEME);
         }

         BattlePKTeam battlePKTeam3 = new BattlePKTeam(matchDao.playerId, matchDao.playerName, matchArraying, matchDao.lv, matchDao.head, matchDao.headFrame, this.heroRankMgr.getHeroRankCompensate(matchArraying, false));
         battleDao.scene.addPKTeam((byte)0, battlePKTeam3);
         EventHeroMainModel eventHeroMainModel = this.getEventHeroMainModel();
         int maxRound = eventHeroMainModel.getEventHeroBossRound();
         battleDao.scene.setMaxRound((byte)maxRound);
         battleDao.scene.setWave((short)2, (short)2);
         return 1;
      }
   }

   public void afterFight(BattleDao battleDao) {
      ActivityKrEventHeroDao dao = this.getDao();
      if (battleDao.scene.getWave() == 1) {
         BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().build().getResult().toBuilder();
         result.setResult(0);
         long damage = battleDao.scene.getPKTeam((byte)1).getDamageValue();
         result.addSettleInfo(damage);
         battleDao.scene.getBattleMsg().setResult(result);
         dao.totalDamage += damage;
         ++dao.fight;
         dao.firstDamage = damage;
         int mvpHeroId = 0;
         long tempDamage = 0L;

         for(Entity entity : battleDao.scene.getPKTeam((byte)0).getEntityMap().values()) {
            if (entity.getAttackValue() > tempDamage) {
               tempDamage = entity.getAttackValue();
               mvpHeroId = entity.getDressHeroId();
            }
         }

         dao.mvpHeroId = mvpHeroId;
         dao.updateOp();
      } else {
         battleDao.status = 0;
         battleDao.updateOp();
         long damage = battleDao.scene.getPKTeam((byte)1).getDamageValue();
         long realDamage = damage - dao.firstDamage;
         dao.totalDamage += realDamage;
         dao.secondDamage = realDamage;
         dao.updateOp();
         List<ResourceModel> commonAward = new ArrayList();
         EventHeroBossRewardNewModel damageAwardModel = this.getDamageRewardModel(dao.mainId, dao.firstDamage + dao.secondDamage);
         EventHeroMainModel eventHeroMainModel = this.getEventHeroMainModel();
         if (damageAwardModel != null && eventHeroMainModel != null) {
            for(ResourceModel resourceModel : damageAwardModel.getReward()) {
               ResourceModel.addResourceToList(commonAward, resourceModel);
               if (resourceModel.getType() == eventHeroMainModel.getIntegralType() && resourceModel.getId() == eventHeroMainModel.getIntegralId()) {
                  dao.totalPoint += resourceModel.getValue();
               }
            }
         } else {
            this.logger.error("主题武将伤害奖励获取错误！");
         }

         battleDao.rewards.addAll(commonAward);
         BattleMsg.S2C_Battle_Result.Builder result = battleDao.scene.getBattleMsg().build().getResult().toBuilder();

         for(ResourceModel resource : commonAward) {
            int type = resource.getType();
            int resourceId = resource.getId();
            int value = resource.getValue();
            result.addAwardItems(CommonMsg.ItemInfo.newBuilder().setType(type).setId(resourceId).setNum(value));
         }

         result.setResult(0);
         battleDao.scene.getBattleMsg().setResult(result);
         BattleMsg.S2C_BattleResult_6102.Builder builder = battleDao.scene.getBattleMsg();
         builder.setIsNextWave(true);
         builder.addExParams(dao.mvpHeroId);
         battleDao.scene.setBattleMsg(builder);
      }

   }

   public void endBattle(BattleDao battleDao) {
      String award = "";
      if (!battleDao.rewards.isEmpty()) {
         this.player.addResource(battleDao.rewards, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 106, 14903, 0, 0, "");

         for(ResourceModel reward : battleDao.rewards) {
            award = award + reward.getId() + "-" + reward.getValue() + ",";
         }
      }

      battleDao.rewards.clear();
      if (battleDao.scene.getWave() > 1) {
         ActivityKrEventHeroDao dao = this.getDao();
         ActivityKrEventHeroMsg.S2C_KrMatchBattle_25012.Builder builder = ActivityKrEventHeroMsg.S2C_KrMatchBattle_25012.newBuilder();
         builder.setDamage(dao.firstDamage + dao.secondDamage);
         builder.setFightNum(dao.fight);
         builder.setTotalDamage(dao.totalDamage);
         builder.setTotalPoint(dao.totalPoint);
         this.player.sendMsg(builder.build());
         long damage = dao.firstDamage + dao.secondDamage;
         this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "新武将活动", award, damage + "", 0, 0, 1);
      }

   }

   public EventHeroBossRewardNewModel getDamageRewardModel(int mainId, long damage) {
      List<EventHeroBossRewardNewModel> list = (List)ApplicationContextProvider.getModelPoolEntity("customEventHeroBossRewardNew", mainId);
      if (list != null && !list.isEmpty()) {
         for(EventHeroBossRewardNewModel model : list) {
            if (damage >= model.getMinDamage() && (model.getMaxDamage() == 0L || damage < model.getMaxDamage())) {
               return model;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private void sendLootInfo() {
      ActivityKrEventHeroDao dao = this.getDao();
      if (dao.mainId > 0) {
         ActivityKrEventHeroMsg.S2C_KrLootInfo_25022.Builder builder = ActivityKrEventHeroMsg.S2C_KrLootInfo_25022.newBuilder();
         builder.setEnjoyId(dao.enjoyId);
         builder.setDailyDrawNum(dao.dailyLootNum);
         builder.setCurLootNum(dao.curLootNum);
         builder.addAllRewardId(this.getJackpots());

         for(Map.Entry<Integer, Integer> entry : dao.enjoyMap.entrySet()) {
            CommonMsg.MapDataII.Builder keyValue = CommonMsg.MapDataII.newBuilder();
            keyValue.setKey((Integer)entry.getKey());
            keyValue.setValue((Integer)entry.getValue());
            builder.addEnjoyNum(keyValue);
         }

         this.player.sendMsg(builder.build());
      }
   }

   public void rotateReset(int oldActivityId) {
      ActivityKrEventHeroDao dao = this.getDao();
      dao.reset();
      this.clearActivityGift(24);
      this.clearOptionGift(dao.optionGiftId);
      dao.resetOptionGiftData();
      ActivityEventHeroTaskPart eventHeroTaskPart = (ActivityEventHeroTaskPart)this.player.getMgrPart(ActivityEventHeroTaskPart.class);
      eventHeroTaskPart.getTasksMap().values().forEach(TaskData::delete);
      eventHeroTaskPart.trigger();
   }

   public void resetDaily() {
      if (!super.isServerActivityInvalid()) {
         super.resetDaily();
         ActivityKrEventHeroDao dao = this.getDao();
         dao.dailyLootNum = 0;
         dao.fight = 0;
         dao.updateOp();
         this.sendActivityInfo();
         this.sendLootInfo();
      }
   }

   public void activityEnd(int oldActivityId) {
      super.activityEnd(oldActivityId);
      HeroMsg.S2C_HeroBaseData_5002.Builder result_builder = HeroMsg.S2C_HeroBaseData_5002.newBuilder();
      HeroArrayingPart mgrPart = (HeroArrayingPart)this.player.getMgrPart(HeroArrayingPart.class);
      HeroBagPart heroBagPart = (HeroBagPart)this.player.getMgrPart(HeroBagPart.class);
      HeroArrayingDao arrayingDao = mgrPart.getHeroArrayingDaoByType(CommonMsg.HeroState.HERO_STATE_THEME);
      if (arrayingDao != null && !arrayingDao.elements.isEmpty()) {
         for(Map.Entry<Byte, Integer> entry : arrayingDao.elements.entrySet()) {
            switch ((Byte)entry.getKey()) {
               case 0:
               case 1:
               case 2:
               case 3:
               case 4:
               case 5:
                  HeroDao heroDao = heroBagPart.getHeroByCode((Integer)entry.getValue());
                  if (heroDao != null && heroDao.containState(CommonMsg.HeroState.HERO_STATE_THEME.getNumber())) {
                     heroDao.delState(CommonMsg.HeroState.HERO_STATE_THEME.getNumber());
                     heroDao.updateOp();
                     result_builder.addHeros(heroDao.toHeroInfo());
                  }
            }
         }

         arrayingDao.soulHeroCode = 0;
         arrayingDao.elements.clear();
         arrayingDao.updateOp();
         this.player.sendMsg(result_builder.build());
      }

      ActivityKrEventHeroDao dao = this.getDao();
      EventHeroMainModel eventHeroMainModel = this.getEventHeroMainModel();
      if (eventHeroMainModel == null) {
         dao.reset();
         dao.updateOp();
      } else {
         int switchItemId = eventHeroMainModel.getChangeItemId();
         int costId = eventHeroMainModel.getEventHeroCall();
         List<ResourceModel> resourceModelList = new ArrayList();
         List<ResourceModel> switchResourceModels = new ArrayList();
         List<EventHeroChallengeRewardModel> modelList = (List)ApplicationContextProvider.getModelPoolEntity("customEventHeroChallengeReward", dao.mainId);
         if (modelList != null) {
            for(EventHeroChallengeRewardModel challengeRewardModel : modelList) {
               if (!dao.pointReward.contains(challengeRewardModel.getId()) && dao.totalPoint >= challengeRewardModel.getBonus()) {
                  for(ResourceModel resourceModel : challengeRewardModel.getReward()) {
                     if (resourceModel.getType() == 2 && resourceModel.getId() == costId) {
                        ResourceModel.addResourceToList(switchResourceModels, new ResourceModel(resourceModel.getType(), switchItemId, resourceModel.getValue()));
                     } else {
                        ResourceModel.addResourceToList(resourceModelList, resourceModel);
                     }
                  }
               }
            }
         }

         if (!dao.receiveBox) {
            boolean receiveFlag = false;
            ActivityEventHeroTaskPart eventHeroTaskPart = (ActivityEventHeroTaskPart)this.player.getMgrPart(ActivityEventHeroTaskPart.class);
            if (eventHeroTaskPart.getTasksMap().isEmpty()) {
               receiveFlag = true;
            }

            for(TaskData taskData : eventHeroTaskPart.getTasksMap().values()) {
               if (taskData.state < 2) {
                  receiveFlag = true;
                  break;
               }
            }

            if (!receiveFlag) {
               Map<Integer, EventHeroPrograssTaskModel> allTaskModelMap = ApplicationContextProvider.<Integer, EventHeroPrograssTaskModel>getModelPoolMap("eventHeroPrograssTask");

               for(Map.Entry<Integer, EventHeroPrograssTaskModel> entry : allTaskModelMap.entrySet()) {
                  EventHeroPrograssTaskModel model = (EventHeroPrograssTaskModel)entry.getValue();
                  if (model.getMainId() == this.getMainId() && model.getType() == 2) {
                     for(ResourceModel reward : model.getRewards()) {
                        ResourceModel.addResourceToList(resourceModelList, new ResourceModel(reward.getType(), reward.getId(), reward.getValue()));
                     }
                     break;
                  }
               }
            }

            dao.receiveBox = true;
            dao.updateOp();
         }

         Map<String, Integer> mailMap = new HashMap();
         String mailId = eventHeroMainModel.getMailId();
         String[] mailIdArr = mailId.split("\\|");

         for(String str : mailIdArr) {
            String[] cell = str.split(":");
            mailMap.put(cell[0], Integer.parseInt(cell[1]));
         }

         MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
         CentreAwardModel centreAwardModel = (CentreAwardModel)this.player.getGameModelPool().getEntity("centreAward", mailMap.get("end"));
         if (centreAwardModel != null && resourceModelList.size() > 0) {
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), resourceModelList, 604800000L, 106, 14907);
         }

         ItemBagPart itemBagPart = (ItemBagPart)this.player.getMgrPart(ItemBagPart.class);
         int num = itemBagPart.getItemNum(costId);
         if (num > 0) {
            switchResourceModels.add(new ResourceModel(2, switchItemId, num));
         }

         itemBagPart.deleteItems(costId, 106, 14907, costId, num, "主题武将活动结束");
         centreAwardModel = (CentreAwardModel)this.player.getGameModelPool().getEntity("centreAward", mailMap.get("change"));
         if (centreAwardModel != null && switchResourceModels.size() > 0) {
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), switchResourceModels, 604800000L, 106, 14907);
         }

         if (eventHeroMainModel.getIntegralType() == 2) {
            itemBagPart.deleteItems(eventHeroMainModel.getIntegralId(), 106, 14907, eventHeroMainModel.getIntegralType(), eventHeroMainModel.getIntegralId(), "主题武将活动结束" + oldActivityId);
         } else if (eventHeroMainModel.getIntegralType() == 1) {
            this.player.updateProperty(eventHeroMainModel.getIntegralId(), 0L, 106, 14907, 0, 0, "activityId:" + oldActivityId);
         }

         this.resetExpedition(dao.mainId);
         dao.reset();
         dao.updateOp();
      }
   }

   public void activityRecharge(int money) {
      if (!this.isServerActivityInvalid()) {
         if (this.isAddUpOpen()) {
            this.addUpRechargeHandle(money, true);
         }

         if (this.isConOpen()) {
            this.conRechargeHandle(money, true);
         }

      }
   }

   public boolean isAddUpOpen() {
      EventHeroMainModel eventHeroMainModel = this.getEventHeroMainModel();
      if (eventHeroMainModel == null) {
         return false;
      } else {
         return eventHeroMainModel.getIsRecharge() > 0;
      }
   }

   public boolean isConOpen() {
      EventHeroMainModel eventHeroMainModel = this.getEventHeroMainModel();
      if (eventHeroMainModel == null) {
         return false;
      } else {
         return eventHeroMainModel.getIsConRecharge() > 0;
      }
   }

   public void resetExpedition(int mainId) {
      EventHeroMainModel eventHeroMainModel = (EventHeroMainModel)ApplicationContextProvider.getModelPoolEntity("eventHeroMain", mainId);
      if (eventHeroMainModel != null) {
         ExpeditionPart expeditionPart = (ExpeditionPart)this.player.getMgrPart(ExpeditionPart.class);
         int expeditionId = eventHeroMainModel.getBannerId();
         expeditionPart.resetChatpter(expeditionId);
      }

   }

   public List<BaseConRechargeModel> getConModelList() {
      List<BaseConRechargeModel> modelList = new ArrayList();
      if (StringUtils.isBlank(this.getConExcelName())) {
         return modelList;
      } else {
         Map<Integer, EventHeroConRechargeModel> all = this.player.getGameModelPool().getMap(this.getConExcelName());
         if (null != all && all.size() > 0) {
            int activityStartDay = this.getActivityOpenDay();
            ActivityKrEventHeroDao dao = this.getDao();

            for(EventHeroConRechargeModel model : all.values()) {
               if (model.getMainId() == dao.mainId) {
                  if (model.getDateEnd() == -1) {
                     if (activityStartDay >= model.getDateStart()) {
                        modelList.add(model);
                     }
                  } else if (activityStartDay >= model.getDateStart() && activityStartDay <= model.getDateEnd()) {
                     modelList.add(model);
                  }
               }
            }

            return modelList;
         } else {
            return modelList;
         }
      }
   }

   public List<BaseAddUpRechargeModel> getAddUpModelByStage(int stage) {
      List<BaseAddUpRechargeModel> modelList = super.getAddUpModelByStage(stage);
      Iterator<BaseAddUpRechargeModel> iterator = modelList.iterator();
      ActivityKrEventHeroDao dao = this.getDao();

      while(iterator.hasNext()) {
         BaseAddUpRechargeModel next = (BaseAddUpRechargeModel)iterator.next();
         if (next instanceof EventHeroAddUpRechargeModel) {
            EventHeroAddUpRechargeModel eventHeroAddUpRechargeModel = (EventHeroAddUpRechargeModel)next;
            if (eventHeroAddUpRechargeModel.getMainId() != dao.mainId) {
               iterator.remove();
            }
         }
      }

      return modelList;
   }

   @MsgHandlerAnno
   public void C2S_KrReceiveBox_25047(ActivityKrEventHeroMsg.C2S_KrReceiveBox_25047 msg, String source) {
      ActivityKrEventHeroDao dao = this.getDao();
      if (!dao.receiveBox) {
         ActivityEventHeroTaskPart eventHeroTaskPart = (ActivityEventHeroTaskPart)this.player.getMgrPart(ActivityEventHeroTaskPart.class);
         if (!eventHeroTaskPart.getTasksMap().isEmpty()) {
            for(TaskData taskData : eventHeroTaskPart.getTasksMap().values()) {
               if (taskData.state < 2) {
                  this.player.failure(76132);
                  return;
               }
            }

            List<ResourceModel> award = new ArrayList();
            Map<Integer, EventHeroPrograssTaskModel> allTaskModelMap = ApplicationContextProvider.<Integer, EventHeroPrograssTaskModel>getModelPoolMap("eventHeroPrograssTask");

            for(Map.Entry<Integer, EventHeroPrograssTaskModel> entry : allTaskModelMap.entrySet()) {
               EventHeroPrograssTaskModel model = (EventHeroPrograssTaskModel)entry.getValue();
               if (model.getMainId() == this.getMainId() && model.getType() == 2) {
                  award.addAll(model.getRewards());
                  break;
               }
            }

            if (award.isEmpty()) {
               this.logger.error("数据有问题：{}", this.getMainId());
            } else {
               dao.receiveBox = true;
               dao.updateOp();
               this.player.addResource(award, PlayerMsg.ShowType.SHOW_TYPE_COMMON, 106, 14904, 0, 0, "");
               ActivityKrEventHeroMsg.S2C_KrReceiveBox_25048.Builder builder = ActivityKrEventHeroMsg.S2C_KrReceiveBox_25048.newBuilder();
               builder.setReceiveBox(dao.receiveBox);
               this.player.sendMsg(builder.build());
            }
         }
      }
   }

   public void clearOptionGift(int optionGiftId) {
      if (optionGiftId > 0) {
         GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
         giftPart.clearGifts(40);
         ShopLimitModel shopLimitModel = (ShopLimitModel)ApplicationContextProvider.getModelPoolEntity("shopLimit", optionGiftId);
         if (null != shopLimitModel) {
            PlayerGiftExtend playerGiftExtend = giftPart.getPlayerGiftExtend();
            playerGiftExtend.delTrigger(shopLimitModel.getActivityId());
            this.player.updatePlayerExtend(22);
         }
      }

   }

   public CustomizeGiftData getCustomizeGiftData(int buyId) {
      ActivityKrEventHeroDao dao = this.getDao();
      return dao.optionalGiftData;
   }

   public void afterOptionalGiftBuy(int buyId) {
      ActivityKrEventHeroDao dao = this.getDao();
      if (dao.optionGiftId != buyId) {
         this.logger.error("玩家{} 主题武将活动未选自选礼包 shopLimitId:{}", this.player.getPlayerId(), buyId);
      } else {
         List<ResourceModel> resourceModels = new ArrayList();
         this.customizeGiftBuy(buyId, resourceModels);
         this.operationLog("buyId:" + buyId, resourceModels);
         dao.optionalGiftData.clearGiftData();
         dao.updateOp();
      }
   }

   private void operationLog(String gearName, List<ResourceModel> resourceModels) {
      String award = "";
      if (resourceModels.size() > 0) {
         for(ResourceModel resourceModel : resourceModels) {
            award = award + resourceModel.getId() + "-" + resourceModel.getValue() + ",";
         }

         this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, 0, "武将活动远征绝版礼包", award, gearName, 0, 0, 1);
      }

   }

   @MsgHandlerAnno
   public boolean C2S_KrOptionalGiftBuy_25049(ActivityKrEventHeroMsg.C2S_KrOptionalGiftBuy_25049 msg, String source) {
      ActivityKrEventHeroDao dao = this.getDao();
      if (msg.getCustomId() != dao.optionGiftId) {
         return this.player.failure(22001);
      } else {
         CustomizeGiftBagModel customizeGiftBagModel = (CustomizeGiftBagModel)ApplicationContextProvider.getModelPoolEntity("customizeGiftBag", msg.getCustomId());
         if (customizeGiftBagModel != null && customizeGiftBagModel.getActivityId() == this.getPlayerActivityId()) {
            if (msg.getBuyDataList().size() > customizeGiftBagModel.getGroup().size()) {
               return this.player.failure(6);
            } else {
               GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
               if (giftPart.isLimit(msg.getCustomId())) {
                  return this.player.failure(25);
               } else {
                  dao.optionalGiftData.clearGiftData();
                  dao.updateOp();
                  Map<Integer, List<Integer>> group_itemIndexList = new HashMap();
                  boolean submit = true;
                  Collection<Integer> groupLimits = customizeGiftBagModel.getGroup().values();

                  for(ActivityMsg.CustomGiftBuyItemData customGiftBuyItemData : msg.getBuyDataList()) {
                     SpecificGroupModel specificGroupModel = (SpecificGroupModel)ApplicationContextProvider.getModelPoolEntity("specificGroup", customGiftBuyItemData.getGroupId());
                     if (specificGroupModel == null) {
                        submit = this.player.failure(0);
                        break;
                     }

                     if (!groupLimits.contains(specificGroupModel.getItemgroupID())) {
                        submit = this.player.failure(6);
                        break;
                     }

                     List<ResourceModel> resourceModelList = specificGroupModel.getRewards();
                     if (resourceModelList == null || resourceModelList.size() <= customGiftBuyItemData.getItemIndex()) {
                        submit = this.player.failure(0);
                        break;
                     }

                     List<Integer> itemIndexList = (List)group_itemIndexList.computeIfAbsent(specificGroupModel.getItemgroupID(), (v) -> new ArrayList());
                     if (itemIndexList.contains(customGiftBuyItemData.getItemIndex())) {
                        this.logger.error("玩家{}选择自选礼包错误,重复的物品,所有物品下标:{},当前物品下标:{}", new Object[]{this.player.getPlayerId(), itemIndexList, customGiftBuyItemData.getItemIndex()});
                        submit = this.player.failure(0);
                        break;
                     }

                     itemIndexList.add(customGiftBuyItemData.getItemIndex());
                     group_itemIndexList.put(specificGroupModel.getItemgroupID(), itemIndexList);
                     long groupItemValue = MiscUtil.comboInteger(customGiftBuyItemData.getGroupId(), customGiftBuyItemData.getItemIndex());
                     dao.optionalGiftData.groupItems.add(groupItemValue);
                  }

                  if (!submit) {
                     dao.optionalGiftData.clearGiftData();
                     dao.updateOp();
                     return false;
                  } else {
                     ActivityKrEventHeroMsg.S2C_KrOptionalGiftBuy_25050.Builder resp = ActivityKrEventHeroMsg.S2C_KrOptionalGiftBuy_25050.newBuilder();
                     resp.addAllBuyData(msg.getBuyDataList());
                     this.player.sendMsg(resp.build());
                     return true;
                  }
               }
            }
         } else {
            return this.player.failure(0);
         }
      }
   }
}
