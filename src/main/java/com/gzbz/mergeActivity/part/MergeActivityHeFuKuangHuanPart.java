package com.gzbz.mergeActivity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.db.PlayerMergeActivityDao;
import com.gzbz.db.bean.DrawViewData;
import com.gzbz.db.bean.DrawViewLogInfo;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gift.GiftPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.mergeActivity.MergeActivityMgr;
import com.gzbz.model.HefuAddupLotteryModel;
import com.gzbz.model.HefuGemPointModel;
import com.gzbz.model.HefuLotteryCostModel;
import com.gzbz.model.HefuLotteryItemModel;
import com.gzbz.model.HefuRushRankModel;
import com.gzbz.model.HefuSignAwardModel;
import com.gzbz.model.ItemModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.MergeActivityMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.RankMgr;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import misc.DateUtil;
import misc.MapUtil;
import misc.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class MergeActivityHeFuKuangHuanPart extends AbstractMergeActivityPart {
   @Autowired
   private ConfigManager configManager;
   @Autowired
   private RankMgr rankMgr;

   public int getMergeSubActivityType() {
      return 8001;
   }

   public void joinSubActivity() {
      this.updateTodayVip();
      GiftPart giftPart = (GiftPart)this.player.getMgrPart(GiftPart.class);
      giftPart.removeGiftsByActivityType(24, this.getMergeSubActivityType());
      this.updateLottery(true);
      PlayerMergeActivityDao dao = this.getDao();
      dao.signGotRewards.clear();
      dao.updateOp();
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      playerResetCustomCache.setForever(200, 0L);
      playerResetCustomCache.setForever(201, 0L);
      playerResetCustomCache.setForever(202, 0L);
   }

   public void endSubActivity() {
   }

   public void resetDailyOnJoiningSubActivity() {
      this.updateTodayVip();
      this.updateLottery(false);
      this.sendSignTotalInfo();
   }

   public void loginHandle() {
   }

   private void updateTodayVip() {
      PlayerMergeActivityDao playerMergeActivityDao = this.getMergeActivityDao();
      playerMergeActivityDao.todayVip = this.player.getPlayerDao().vip_lv;
      playerMergeActivityDao.updateOp();
   }

   private PlayerMergeActivityDao getMergeActivityDao() {
      return (PlayerMergeActivityDao)this.player.getData("tb_player_merge_activity", this.player.getPlayerId());
   }

   public int getOpenInServerDay() {
      MergeActivityMgr mergeActivityMgr = (MergeActivityMgr)ApplicationContextProvider.getContext().getBean(MergeActivityMgr.class);
      return this.getActivityOpenDay(mergeActivityMgr.getMergeActivityOpenTime());
   }

   @MsgHandlerAnno
   public void C2S_LiYu_18901(MergeActivityMsg.C2S_LiYu_18901 msg, String source) {
      MergeActivityMgr mergeActivityMgr = (MergeActivityMgr)ApplicationContextProvider.getContext().getBean(MergeActivityMgr.class);
      long startTime = 0L;
      long endTime = 0L;
      int inDay = 0;
      int todayVip = 0;
      if (this.isJoiningSubActivity()) {
         PlayerMergeActivityDao playerMergeActivityDao = (PlayerMergeActivityDao)this.player.getData("tb_player_merge_activity", this.player.getPlayerId());
         startTime = this.getSubActivityOpenTime();
         endTime = this.getSubActivityEndTime();
         inDay = this.getActivityOpenDay(this.getSubActivityOpenTime());
         todayVip = playerMergeActivityDao.todayVip;
      }

      MergeActivityMsg.S2C_LiYu_18902.Builder resp = MergeActivityMsg.S2C_LiYu_18902.newBuilder();
      resp.setStartTime(DateUtil.getIntTime(startTime));
      resp.setEndTime(DateUtil.getIntTime(endTime));
      resp.setInDay(inDay);
      resp.setTodayVip(todayVip);
      this.player.sendMsg(resp.build());
   }

   public void updateLottery(boolean isJoin) {
      PlayerMergeActivityDao mergeActivityDao = this.getMergeActivityDao();
      int smashEggStage = this.getSmashEggStage();
      if (isJoin) {
         mergeActivityDao.lotteryStage = smashEggStage;
         mergeActivityDao.fancyRewardId = 0;
         mergeActivityDao.smashEggNum = 0;
         mergeActivityDao.roundSmashNum.clear();
         mergeActivityDao.takedLuck.clear();
         mergeActivityDao.seniorRewards.clear();
      } else if (mergeActivityDao.lotteryStage != smashEggStage) {
         mergeActivityDao.lotteryStage = smashEggStage;
         mergeActivityDao.fancyRewardId = 0;
         this.sendLotteryData();
      }

      mergeActivityDao.updateOp();
   }

   public int getSmashEggStage() {
      Map<Integer, HefuLotteryItemModel> allMap = this.player.getGameModelPool().getMap("HefuLotteryItem");
      if (allMap != null && allMap.size() > 0) {
         int openDay = this.getOpenInServerDay();
         int activityDay = this.getSeverActivityDay();

         for(HefuLotteryItemModel model : allMap.values()) {
            int dateEnd = model.getDateEnd() == -1 ? Integer.MAX_VALUE : model.getDateEnd();
            if (openDay >= model.getDateStart() && openDay <= dateEnd && activityDay >= model.getStageStart() && activityDay <= model.getStageEnd()) {
               return model.getStage();
            }
         }
      }

      return 1;
   }

   @MsgHandlerAnno
   public void C2S_OpenEggUi_18917(MergeActivityMsg.C2S_OpenEggUi_18917 msg, String source) {
      this.sendLotteryData();
   }

   protected void sendLotteryData() {
      if (this.isJoiningSubActivity()) {
         PlayerMergeActivityDao dao = this.getMergeActivityDao();
         MergeActivityMsg.S2C_OpenEggUi_18918.Builder builder = MergeActivityMsg.S2C_OpenEggUi_18918.newBuilder();
         builder.setFancyId(dao.fancyRewardId);
         builder.setSmashEggNum(dao.smashEggNum);
         builder.addAllTakedLuck(dao.takedLuck);
         builder.setFancyGroupDrawTimes((Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0));

         for(Map.Entry<Integer, Integer> entry : dao.seniorRewards.entrySet()) {
            CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
            info.setKey((Integer)entry.getKey());
            info.setValue((Integer)entry.getValue());
            builder.addSeniorRewards(info);
         }

         builder.setSmashEggStage(this.getSmashEggStage());
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public void C2S_FancyReward_18911(MergeActivityMsg.C2S_FancyReward_18911 msg, String source) {
      if (this.isJoiningSubActivity()) {
         PlayerMergeActivityDao dao = this.getMergeActivityDao();
         HefuLotteryItemModel hefuLotteryItemModel = (HefuLotteryItemModel)this.player.getGameModelPool().getEntity("HefuLotteryItem", msg.getItemIndex());
         if (hefuLotteryItemModel != null) {
            if (hefuLotteryItemModel.getItemGroup() != 1) {
               this.player.failure(0);
               this.logger.error("玩家={}，设置心仪奖励类型错误，物品ID={}，group={}", new Object[]{this.player.getPlayerId(), hefuLotteryItemModel.getId(), hefuLotteryItemModel.getItemGroup()});
            } else if (dao.lotteryStage != hefuLotteryItemModel.getStage()) {
               this.player.failure(0);
               this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，当前阶段={}", new Object[]{this.player.getPlayerId(), hefuLotteryItemModel.getId(), hefuLotteryItemModel.getStage()});
            } else {
               int openDay = this.getOpenInServerDay();
               int dateEnd = hefuLotteryItemModel.getDateEnd() == -1 ? Integer.MAX_VALUE : hefuLotteryItemModel.getDateEnd();
               if (openDay >= hefuLotteryItemModel.getDateStart() && openDay <= dateEnd) {
                  if (hefuLotteryItemModel.getSurplusNum() > 0) {
                     int selectNum = (Integer)MapUtil.getOrDefault(dao.seniorRewards, hefuLotteryItemModel.getId(), 0);
                     if (selectNum >= hefuLotteryItemModel.getSurplusNum()) {
                        this.logger.error("心仪奖励已经达到最大次数，已经获取={}，最大次数={}", dao.seniorRewards.get(hefuLotteryItemModel.getId()), hefuLotteryItemModel.getSurplusNum());
                        return;
                     }
                  }

                  dao.fancyRewardId = msg.getItemIndex();
                  dao.updateOp();
                  MergeActivityMsg.S2C_FancyReward_18912.Builder builder = MergeActivityMsg.S2C_FancyReward_18912.newBuilder();
                  builder.setResult(1);
                  builder.setItemIndex(msg.getItemIndex());
                  this.player.sendMsg(builder.build());
               } else {
                  this.player.failure(0);
                  this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前date={}", new Object[]{this.player.getPlayerId(), hefuLotteryItemModel.getId(), openDay});
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_SmashEgg_18913(MergeActivityMsg.C2S_SmashEgg_18913 msg, String source) {
      if (this.isJoiningSubActivity()) {
         int lotteryNum = msg.getNum();
         HefuLotteryCostModel hefuLotteryCostModel = (HefuLotteryCostModel)ApplicationContextProvider.getModelPoolEntity("HefuLotteryCost", lotteryNum);
         if (hefuLotteryCostModel == null) {
            this.player.failure(0);
         } else {
            PlayerMergeActivityDao dao = this.getMergeActivityDao();
            if (dao.fancyRewardId <= 0) {
               this.player.failure(76014);
            } else {
               List<ResourceModel> needModelList = new ArrayList();

               for(ResourceModel consumeItem : hefuLotteryCostModel.getConsumeItems()) {
                  consumeItem.addResourceToList(needModelList);
               }

               if (this.player.checkResourceNum(needModelList)) {
                  int openDay = this.getOpenInServerDay();
                  int activityDay = this.getSeverActivityDay();
                  Map<Integer, HefuLotteryItemModel> itemModelMap = this.getHeFuLotteryItemMap(openDay, activityDay);
                  if (itemModelMap != null && !itemModelMap.isEmpty()) {
                     HefuLotteryItemModel enjoyModel = (HefuLotteryItemModel)ApplicationContextProvider.getModelPoolEntity("HefuLotteryItem", dao.fancyRewardId);
                     List<ResourceModel> addList = new ArrayList();
                     boolean isHaveFancy = false;

                     for(int i = 0; i < lotteryNum; ++i) {
                        int oldSmashNum_1 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0);
                        dao.roundSmashNum.put(1, oldSmashNum_1 + 1);
                        int oldSmashNum_2 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 2, 0);
                        dao.roundSmashNum.put(2, oldSmashNum_2 + 1);
                        HefuLotteryItemModel itemModel = this.smashEgg(dao, itemModelMap);
                        if (itemModel == null) {
                           return;
                        }

                        if (itemModel.getItemGroup() == 1) {
                           isHaveFancy = true;
                           dao.fancyRewardId = 0;
                           dao.roundSmashNum.put(itemModel.getItemGroup(), 0);
                           int oldNum = (Integer)MapUtil.getOrDefault(dao.seniorRewards, itemModel.getId(), 0);
                           dao.seniorRewards.put(itemModel.getId(), oldNum + 1);
                        } else if (itemModel.getItemGroup() == 2) {
                           if (itemModel.getPreposeNum() > 0 || itemModel.getMustNum() > 0) {
                              dao.roundSmashNum.put(itemModel.getItemGroup(), 0);
                           }

                           int oldNum = (Integer)MapUtil.getOrDefault(dao.seniorRewards, itemModel.getId(), 0);
                           dao.seniorRewards.put(itemModel.getId(), oldNum + 1);
                        } else {
                           int oldSmashNum = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, itemModel.getItemGroup(), 0);
                           dao.roundSmashNum.put(itemModel.getItemGroup(), oldSmashNum + 1);
                        }

                        ++dao.smashEggNum;

                        for(ResourceModel resourceModel : itemModel.getRewards()) {
                           addList.add(resourceModel);
                        }
                     }

                     dao.updateOp();
                     this.player.delResource((List)needModelList, 93, 9302, 0, 0, "");
                     this.player.addResource(addList, PlayerMsg.ShowType.SHOW_MERGE_ACTIVITY_LOTTERY, 93, 9302, 0, 0, "");
                     MergeActivityMsg.S2C_SmashEgg_18914.Builder builder = MergeActivityMsg.S2C_SmashEgg_18914.newBuilder();
                     builder.setResult(1);
                     builder.setIsHaveFancy(isHaveFancy);

                     for(Map.Entry<Integer, Integer> entry : dao.seniorRewards.entrySet()) {
                        CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
                        info.setKey((Integer)entry.getKey());
                        info.setValue((Integer)entry.getValue());
                        builder.addSeniorNum(info);
                     }

                     builder.setSmashEggNum(dao.smashEggNum);
                     builder.setFancyGroupDrawTimes((Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0));
                     this.player.sendMsg(builder.build());
                     int enjoyId = enjoyModel != null && enjoyModel.getRewards().size() > 0 ? ((ResourceModel)enjoyModel.getRewards().get(0)).getId() : 0;

                     for(ResourceModel resourceModel : addList) {
                        String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                        this.player.getOperationMgr().addExtraLog(this.player, 198, "合服-抽奖", ((ResourceModel)needModelList.get(0)).getId() + "", ((ResourceModel)needModelList.get(0)).getValue() + "", strings[0], strings[2], strings[1], strings[0].equals(String.valueOf(enjoyId)) ? "1" : "0");
                     }

                  }
               }
            }
         }
      }
   }

   public Map<Integer, HefuLotteryItemModel> getHeFuLotteryItemMap(int openDay, int activityDay) {
      Map<Integer, HefuLotteryItemModel> itemModelMap = this.player.getGameModelPool().getMap("HefuLotteryItem");
      if (itemModelMap == null) {
         return null;
      } else {
         Map<Integer, HefuLotteryItemModel> resultMap = new HashMap();

         for(Map.Entry<Integer, HefuLotteryItemModel> entry : itemModelMap.entrySet()) {
            HefuLotteryItemModel model = (HefuLotteryItemModel)entry.getValue();
            int dateEnd = model.getDateEnd() == -1 ? Integer.MAX_VALUE : model.getDateEnd();
            if (openDay >= model.getDateStart() && openDay <= dateEnd && activityDay >= model.getStageStart() && activityDay <= model.getStageEnd()) {
               resultMap.put(model.getId(), model);
            }
         }

         return resultMap;
      }
   }

   private HefuLotteryItemModel smashEgg(PlayerMergeActivityDao dao, Map<Integer, HefuLotteryItemModel> itemModelMap) {
      Map<Integer, HefuLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(HefuLotteryItemModel lotteryItemModel : itemModelMap.values()) {
         if (!dao.seniorRewards.containsKey(lotteryItemModel.getId()) || lotteryItemModel.getSurplusNum() <= 0 || (Integer)dao.seniorRewards.get(lotteryItemModel.getId()) <= lotteryItemModel.getSurplusNum()) {
            int roundSmashNum = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, lotteryItemModel.getItemGroup(), 0);
            if (lotteryItemModel.getPreposeNum() <= 0 || roundSmashNum >= lotteryItemModel.getPreposeNum()) {
               if (lotteryItemModel.getItemGroup() == 1) {
                  if (dao.fancyRewardId > 0 && dao.fancyRewardId == lotteryItemModel.getId()) {
                     if (lotteryItemModel.getMustNum() > 0 && roundSmashNum >= lotteryItemModel.getMustNum()) {
                        return lotteryItemModel;
                     }

                     tempMap.put(lotteryItemModel.getId(), lotteryItemModel);
                     totalOdds += lotteryItemModel.getRealOdd();
                  }
               } else {
                  if (lotteryItemModel.getMustNum() > 0 && roundSmashNum >= lotteryItemModel.getMustNum()) {
                     return lotteryItemModel;
                  }

                  tempMap.put(lotteryItemModel.getId(), lotteryItemModel);
                  totalOdds += lotteryItemModel.getRealOdd();
               }
            }
         }
      }

      if (totalOdds <= 0) {
         this.logger.error("没有符合条件的物品");
         return null;
      } else {
         int r = RandomUtil.randInt(totalOdds);
         int loop = 0;

         for(HefuLotteryItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }

   @MsgHandlerAnno
   public void C2S_TakeLuckReward_18915(MergeActivityMsg.C2S_TakeLuckReward_18915 msg, String source) {
      PlayerMergeActivityDao dao = this.getMergeActivityDao();
      if (!dao.takedLuck.contains(msg.getRewardId())) {
         HefuAddupLotteryModel model = (HefuAddupLotteryModel)this.player.getGameModelPool().getEntity("HefuReturnAward", msg.getRewardId());
         if (model != null) {
            if (dao.smashEggNum >= model.getAddupNum()) {
               int openDay = this.getOpenInServerDay();
               int dateEnd = model.getDateEnd() == -1 ? Integer.MAX_VALUE : model.getDateEnd();
               if (openDay >= model.getDateStart() && openDay <= dateEnd) {
                  dao.takedLuck.add(msg.getRewardId());
                  dao.updateOp();
                  this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 93, 9303, 0, 0, "");
                  MergeActivityMsg.S2C_TakeLuckReward_18916.Builder builder = MergeActivityMsg.S2C_TakeLuckReward_18916.newBuilder();
                  builder.setResult(1);
                  builder.addAllTakedId(dao.takedLuck);
                  this.player.sendMsg(builder.build());
               }
            }
         }
      }
   }

   public PlayerMergeActivityDao getDao() {
      PlayerMergeActivityDao playerMergeActivityDao = (PlayerMergeActivityDao)this.player.getData("tb_player_merge_activity", this.player.getPlayerId());
      return playerMergeActivityDao;
   }

   public ConcurrentHashMap<Integer, HefuSignAwardModel> getSignAwardModelMap(int signType) {
      ConcurrentHashMap<Integer, HefuSignAwardModel> modelMap = (ConcurrentHashMap)this.player.getGameModelPool().getEntity("CustomHefuSignAward", signType);
      return modelMap;
   }

   @MsgHandlerAnno
   public void C2S_SignTotalInfo_18931(MergeActivityMsg.C2S_SignTotalInfo_18931 msg, String source) {
      this.sendSignTotalInfo();
   }

   public void sendSignTotalInfo() {
      if (this.isJoiningSubActivity()) {
         MergeActivityMsg.S2C_SignTotalInfo_18932.Builder builder = MergeActivityMsg.S2C_SignTotalInfo_18932.newBuilder();
         PlayerMergeActivityDao playerMergeActivityDao = this.getDao();
         builder.setActivityDay(this.getSeverActivityDay());
         builder.addAllSignGotRewards(playerMergeActivityDao.signGotRewards);
         this.player.sendMsg(builder.build());
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Sign_18933(MergeActivityMsg.C2S_Sign_18933 msg, String source) {
      int day = msg.getDay();
      if (!this.checkNormalSignUnlock(day, true)) {
         return false;
      } else {
         ConcurrentHashMap<Integer, HefuSignAwardModel> signAwardModelMap = this.getSignAwardModelMap(1);
         HefuSignAwardModel hefuSignAwardModel = (HefuSignAwardModel)signAwardModelMap.get(day);
         this.player.addResource(hefuSignAwardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 93, 9304, 0, 0, "");
         PlayerMergeActivityDao dao = this.getDao();
         dao.signGotRewards.add(hefuSignAwardModel.getId());
         dao.updateOp();
         this.sendSignTotalInfo();
         return true;
      }
   }

   public boolean checkNormalSignUnlock(int day, boolean sendMsg) {
      if (!this.isJoiningSubActivity()) {
         return this.player.failure(8007);
      } else {
         ConcurrentHashMap<Integer, HefuSignAwardModel> signAwardModelMap = this.getSignAwardModelMap(1);
         if (null == signAwardModelMap) {
            return this.player.failure(37);
         } else {
            HefuSignAwardModel hefuSignAwardModel = (HefuSignAwardModel)signAwardModelMap.get(day);
            if (null == hefuSignAwardModel) {
               return sendMsg ? this.player.failure(6) : false;
            } else if (day > this.getSeverActivityDay()) {
               return sendMsg ? this.player.failure(76009) : false;
            } else {
               PlayerMergeActivityDao dao = this.getDao();
               if (dao.signGotRewards.contains(hefuSignAwardModel.getId())) {
                  return sendMsg ? this.player.failure(76010) : false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_AddUpSign_18934(MergeActivityMsg.C2S_AddUpSign_18934 msg, String source) {
      int day = msg.getDay();
      if (!this.checkAddUpSignUnlock(day, true)) {
         return false;
      } else {
         ConcurrentHashMap<Integer, HefuSignAwardModel> signAwardModelMap = this.getSignAwardModelMap(2);
         HefuSignAwardModel hefuSignAwardModel = (HefuSignAwardModel)signAwardModelMap.get(day);
         this.player.addResource(hefuSignAwardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 93, 9304, 0, 0, "");
         PlayerMergeActivityDao dao = this.getDao();
         dao.signGotRewards.add(hefuSignAwardModel.getId());
         dao.updateOp();
         this.sendSignTotalInfo();
         return true;
      }
   }

   public boolean checkAddUpSignUnlock(int day, boolean sendMsg) {
      if (!this.isJoiningSubActivity()) {
         return this.player.failure(8007);
      } else {
         ConcurrentHashMap<Integer, HefuSignAwardModel> signAwardModelMap = this.getSignAwardModelMap(2);
         if (null == signAwardModelMap) {
            return this.player.failure(37);
         } else {
            HefuSignAwardModel hefuSignAwardModel = (HefuSignAwardModel)signAwardModelMap.get(day);
            if (null == hefuSignAwardModel) {
               return sendMsg ? this.player.failure(6) : false;
            } else {
               PlayerMergeActivityDao dao = this.getDao();
               Set<Integer> signNormalGotRewards = new HashSet();
               signNormalGotRewards.addAll(dao.signGotRewards);
               signNormalGotRewards.removeAll(signAwardModelMap.values());
               if (signNormalGotRewards.size() < hefuSignAwardModel.getDay()) {
                  return sendMsg ? this.player.failure(76009) : false;
               } else if (dao.signGotRewards.contains(hefuSignAwardModel.getId())) {
                  return sendMsg ? this.player.failure(76010) : false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_RushRankInfo_18935(MergeActivityMsg.C2S_RushRankInfo_18935 msg, String source) {
      this.sendRushRankInfo();
   }

   public void sendRushRankInfo() {
      HefuRushRankModel nowRankModel = this.getNowRankModel();
      if (null != nowRankModel) {
         MergeActivityMsg.S2C_RushRankInfo_18936.Builder builder = MergeActivityMsg.S2C_RushRankInfo_18936.newBuilder();
         builder.setRushRankId(nowRankModel.getId());
         builder.setStageEndTime(this.getStageEndTime());
         this.player.sendMsg(builder.build());
      }
   }

   public void updateRushRank(int rushRankId, int addScore) {
      HefuRushRankModel nowRankModel = this.getNowRankModel();
      if (null != nowRankModel) {
         if (nowRankModel.getId() == rushRankId) {
            int playerResetDefine = 0;
            RankDefine.RankModule rankModule;
            if (nowRankModel.getId() == 1) {
               rankModule = RankDefine.RankModule.RECRUIT_RUSH;
               playerResetDefine = 200;
            } else if (nowRankModel.getId() == 2) {
               rankModule = RankDefine.RankModule.RECRUITMENT_RUSH;
               playerResetDefine = 201;
            } else {
               if (nowRankModel.getId() != 3) {
                  this.logger.info("未定义冲榜id:{}", rushRankId);
                  return;
               }

               rankModule = RankDefine.RankModule.STONE_RUSH;
               playerResetDefine = 202;
            }

            RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            Long oldScore = 0L;

            try {
               oldScore = (Long)playerResetCustomCache.getForeverNum(playerResetDefine, 0L);
            } catch (ClassCastException var10) {
               oldScore = Long.parseLong(playerResetCustomCache.getForeverNum(playerResetDefine, 0L) + "");
            }

            if (oldScore <= 0L) {
               oldScore = rankPart.getScore(rankModule);
            }

            Long newScore = oldScore + (long)addScore;
            rankPart.updateRank(rankModule, newScore, false);
            playerResetCustomCache.setForever(playerResetDefine, newScore);
         }
      }
   }

   public void cutGemRushScore(int quality, int num) {
      int gemType = this.getGemTypeByQuality(quality);
      if (gemType != 0) {
         HefuGemPointModel model = (HefuGemPointModel)this.player.getGameModelPool().getEntity("HefuGemPoint", gemType);
         this.updateRushRank(3, -model.getPoint() * num);
      }
   }

   public void updateGemRushRank(ItemModel itemModel, int num, boolean isMelting) {
      if (null == itemModel) {
         this.logger.error("合服宝石榜普通途径获得宝石 必须传入ItemModel");
      } else if (num <= 0) {
         this.logger.info("合服宝石榜添加宝石数量<=0？？？");
      } else {
         if (isMelting) {
            HefuGemPointModel model_6 = (HefuGemPointModel)this.player.getGameModelPool().getEntity("HefuGemPoint", 6);
            HefuGemPointModel model_7 = (HefuGemPointModel)this.player.getGameModelPool().getEntity("HefuGemPoint", 7);
            if (itemModel.getQuality() != model_6.getGemQuality() || itemModel.getQuality() != model_7.getGemQuality()) {
               this.logger.info("合服宝石榜熔炼得到的宝石品质不对");
               return;
            }

            int point = model_6.getPoint() + model_7.getPoint();
            this.updateRushRank(3, point * num);
         } else {
            int gemType = this.getGemTypeByQuality(itemModel.getQuality());
            if (gemType == 0) {
               this.logger.info("合服宝石榜未找到对应的gemType,item表id为{}", itemModel.getId());
               return;
            }

            HefuGemPointModel model = (HefuGemPointModel)this.player.getGameModelPool().getEntity("HefuGemPoint", gemType);
            this.updateRushRank(3, model.getPoint() * num);
         }

      }
   }

   public int getGemTypeByQuality(int quality) {
      if (quality == 2) {
         return 1;
      } else if (quality == 3) {
         return 2;
      } else if (quality == 4) {
         return 3;
      } else if (quality == 5) {
         return 4;
      } else if (quality == 6) {
         return 5;
      } else if (quality == 7) {
         return 6;
      } else {
         this.logger.info("未找到对应的gemType,item表品质为{}", quality);
         return 0;
      }
   }

   public HefuRushRankModel getNowRankModel() {
      int severActivityDay = this.getSeverActivityDay();
      Map<Integer, HefuRushRankModel> rankModelMap = this.player.getGameModelPool().getMap("HefuRushRank");

      for(Map.Entry<Integer, HefuRushRankModel> entry : rankModelMap.entrySet()) {
         HefuRushRankModel value = (HefuRushRankModel)entry.getValue();
         if (severActivityDay >= value.getStartDay() && severActivityDay <= value.getEndDay()) {
            return value;
         }
      }

      return null;
   }

   public long getStageEndTime() {
      HefuRushRankModel nowRankModel = this.getNowRankModel();
      if (null == nowRankModel) {
         return 0L;
      } else {
         int endDay = nowRankModel.getEndDay();
         long subActivityOpenTime = this.getSubActivityOpenTime();
         long result = subActivityOpenTime + (long)endDay * 86400000L;
         return result;
      }
   }

   public boolean drawView(int lotteryId, int round) {
      HefuLotteryItemModel model = (HefuLotteryItemModel)this.player.getGameModelPool().getEntity("HefuLotteryItem", lotteryId);
      if (null == model) {
         return this.player.failure(0);
      } else if (model.getItemGroup() != 1) {
         return this.player.failure(8024);
      } else {
         DrawViewData drawViewData = new DrawViewData();
         drawViewData.fancyRewardId = model.getId();
         int initRound = 0;
         Map<Integer, HefuLotteryItemModel> lotteryItemMap = this.getHeFuLotteryItemMap(model.getDateStart(), model.getStageStart());
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
               HefuLotteryItemModel lotteryItemModel = this.gmSmashEgg(drawViewData, lotteryItemMap);
               if (lotteryItemModel.getItemGroup() == 1) {
                  drawViewData.roundSmashNum.put(lotteryItemModel.getItemGroup(), 0);
               } else if (lotteryItemModel.getItemGroup() == 2) {
                  if (lotteryItemModel.getPreposeNum() > 0 || lotteryItemModel.getMustNum() > 0) {
                     drawViewData.roundSmashNum.put(lotteryItemModel.getItemGroup(), 0);
                  }
               } else {
                  int oldSmashNum = (Integer)MapUtil.getOrDefault(drawViewData.roundSmashNum, lotteryItemModel.getItemGroup(), 0);
                  drawViewData.roundSmashNum.put(lotteryItemModel.getItemGroup(), oldSmashNum + 1);
               }

               if (lotteryItemModel != null && lotteryItemModel.getId() == lotteryId) {
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
               if (!drawViewLogInfoMap.isEmpty()) {
                  String infoStr = "{0}~{1}次抽中目标奖励，{2}次，占比{3}%";

                  for(Map.Entry<Integer, DrawViewLogInfo> entry : drawViewLogInfoMap.entrySet()) {
                      logInfo = (DrawViewLogInfo)entry.getValue();
                     double proportion = (double)logInfo.getGetFancyNum() / (double)round * (double)100.0F;
                     String format = MessageFormat.format(infoStr, logInfo.getStartNum(), logInfo.getEndNum(), logInfo.getGetFancyNum(), proportion);
                     this.logger.info(format);
                  }
               }

               return true;
            }

            ++n;
         }
      }
   }

   private HefuLotteryItemModel gmSmashEgg(DrawViewData drawViewData, Map<Integer, HefuLotteryItemModel> itemModelMap) {
      Map<Integer, HefuLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(HefuLotteryItemModel lotteryItemModel : itemModelMap.values()) {
         int roundSmashNum = (Integer)MapUtil.getOrDefault(drawViewData.roundSmashNum, lotteryItemModel.getItemGroup(), 0);
         if (lotteryItemModel.getPreposeNum() <= 0 || roundSmashNum >= lotteryItemModel.getPreposeNum()) {
            if (lotteryItemModel.getItemGroup() == 1) {
               if (drawViewData.fancyRewardId > 0 && drawViewData.fancyRewardId == lotteryItemModel.getId()) {
                  if (lotteryItemModel.getMustNum() > 0 && roundSmashNum >= lotteryItemModel.getMustNum()) {
                     return lotteryItemModel;
                  }

                  tempMap.put(lotteryItemModel.getId(), lotteryItemModel);
                  totalOdds += lotteryItemModel.getRealOdd();
               }
            } else {
               if (lotteryItemModel.getMustNum() > 0 && roundSmashNum >= lotteryItemModel.getMustNum()) {
                  return lotteryItemModel;
               }

               tempMap.put(lotteryItemModel.getId(), lotteryItemModel);
               totalOdds += lotteryItemModel.getRealOdd();
            }
         }
      }

      if (totalOdds <= 0) {
         this.logger.error("没有符合条件的物品");
         return null;
      } else {
         int r = RandomUtil.randInt(totalOdds);
         int loop = 0;

         for(HefuLotteryItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }
}
