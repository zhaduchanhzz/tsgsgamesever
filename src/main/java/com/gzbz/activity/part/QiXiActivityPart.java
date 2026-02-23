package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.ActivityQiXiDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.bean.DrawViewData;
import com.gzbz.db.bean.DrawViewLogInfo;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.QiXiAddUpReturnModel;
import com.gzbz.model.QiXiLotteryCostModel;
import com.gzbz.model.QiXiLotteryItemModel;
import com.gzbz.model.QiXiMusicLevelModel;
import com.gzbz.model.QiXiMusicModel;
import com.gzbz.model.QiXiMusicPointModel;
import com.gzbz.model.QiXiShopAddUpModel;
import com.gzbz.model.QiXiSignAwardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.ActivityQiXiMsg;
import com.gzbz.protobuf.CommonMsg;
import com.gzbz.protobuf.CrossMsg;
import com.gzbz.protobuf.PlayerMsg;
import com.gzbz.rank.part.RankPart;
import com.gzbz.spring.ApplicationContextProvider;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import misc.ComparatorUtil;
import misc.DateUtil;
import misc.MapUtil;
import misc.RandomUtil;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class QiXiActivityPart extends AddUpAndConRechargeActivityPart {
   public static final String CONFIG_QI_XI_MUSIC_TIMES = "QixiMusicTimes";

   public ActivityQiXiDao getDao() {
      ActivityQiXiDao dao = (ActivityQiXiDao)this.player.getData("tb_activity_qi_xi", this.player.getPlayerId());
      return dao;
   }

   public int getActivityLogModule() {
      return 107;
   }

   public int getAddUpLogReason() {
      return 10701;
   }

   public int getAddUpMail() {
      return CentreAwardModel.TYPE_QI_XI_ADD_UP_RECHARGE;
   }

   public String getAddUpExcelName() {
      return "QixiAddupRecharge";
   }

   public int getConLogReason() {
      return 10710;
   }

   public int getConMail() {
      return CentreAwardModel.TYPE_QI_XI_BLESSING_RECHARGE;
   }

   public String getConExcelName() {
      return "QixiBlessing";
   }

   public int getActivityType() {
      return 83;
   }

   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         super.sendInfo();
         this.sendActivityInfo();
         this.shopAddUpRechargeHandle(true);
         this.sendDrawInfo();
         this.sendSignTotalInfo();
         this.sendMusicDrumInfo();
      }
   }

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         super.resetDaily();
         this.musicDrumResetDaily();
         this.drawResetDaily();
         this.sendDrawInfo();
         this.shopAddUpReset();
         this.sendShopAddUpInfo();
         this.sendSignTotalInfo();
         this.sendActivityInfo();
      }
   }

   public void loginHandle() {
      if (!this.isServerActivityInvalid()) {
         super.loginHandle();
      }
   }

   public void activityEnd(int oldActivityId) {
      super.activityEnd(oldActivityId);
      this.shopAddUpReset();
      this.signEnd();
      this.drawEnd();
      this.musicDrumReset();
   }

   public void rotateReset(int oldActivityId) {
      ActivityQiXiDao dao = this.getDao();
      int lotteryStage = this.getSmashEggStage();
      dao.lotteryStage = lotteryStage;
      dao.updateOp();
      this.shopAddUpReset();
      this.musicDrumReset();
      this.clearActivityGift(24);
   }

   @MsgHandlerAnno
   public void C2S_ActivityInfo_21001(ActivityQiXiMsg.C2S_ActivityInfo_21001 msg, String source) {
      this.sendActivityInfo();
   }

   public void sendActivityInfo() {
      ActivityQiXiMsg.S2C_ActivityInfo_21002.Builder builder = ActivityQiXiMsg.S2C_ActivityInfo_21002.newBuilder();
      builder.setOpenDay(this.getActivityOpenDay());
      builder.setActivityDay(this.getSeverActivityDay());
      this.player.sendMsg(builder.build());
   }

   public void shopAddUpRechargeHandle(boolean sendMsg) {
      if (!this.isServerActivityInvalid()) {
         PlayerDao playerDao = this.player.getPlayerDao();
         if (DateUtil.isSameDay(playerDao.updateTime)) {
            ActivityQiXiDao dao = this.getDao();
            PlayerRechargeDao playerRechargeDao = (PlayerRechargeDao)this.player.getData("tb_player_recharge", this.player.getPlayerId());
            dao.dailyRecharge = playerRechargeDao.dailyRecharge;
            dao.updateOp();
         }

         if (sendMsg) {
            this.sendShopAddUpInfo();
         }

      }
   }

   @MsgHandlerAnno
   public void C2S_ShopAddUpInfo_21003(ActivityQiXiMsg.C2S_ShopAddUpInfo_21003 msg, String source) {
      this.shopAddUpRechargeHandle(true);
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveShopAddUpReward_21005(ActivityQiXiMsg.C2S_ReceiveShopAddUpReward_21005 msg, String source) {
      int id = msg.getId();
      ActivityQiXiDao dao = this.getDao();
      Set<Integer> shopAddUpGotRewards = this.getShopAddUpGotRewards();
      if (shopAddUpGotRewards.contains(id)) {
         return this.player.failure(76030);
      } else if (!this.checkShopAddUpUnlock(id, true)) {
         return false;
      } else {
         QiXiShopAddUpModel shopAddUpModel = this.getShopAddUpModel(id);
         this.player.addResource(shopAddUpModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 10702, 0, 0, "");
         dao.shopAddUpGotRechargeNum.add(shopAddUpModel.getRechargeNum());
         dao.updateOp();
         this.sendShopAddUpInfo();
         return true;
      }
   }

   public void sendShopAddUpInfo() {
      ActivityQiXiMsg.S2C_ShopAddUpInfo_21004.Builder builder = ActivityQiXiMsg.S2C_ShopAddUpInfo_21004.newBuilder();
      ActivityQiXiDao dao = this.getDao();
      builder.setDailyRecharge(dao.dailyRecharge);
      builder.addAllGotRewards(this.getShopAddUpGotRewards());
      this.player.sendMsg(builder.build());
   }

   public Set<Integer> getShopAddUpGotRewards() {
      ActivityQiXiDao dao = this.getDao();
      Set<Integer> rewardIds = new HashSet();
      if (dao.shopAddUpGotRechargeNum.size() > 0) {
         Map<Integer, QiXiShopAddUpModel> nowShopAddUpMap = this.getNowShopAddUpMap();

         for(int rechargeNum : dao.shopAddUpGotRechargeNum) {
            QiXiShopAddUpModel model = (QiXiShopAddUpModel)nowShopAddUpMap.get(rechargeNum);
            if (null != model) {
               rewardIds.add(model.getId());
            }
         }
      }

      return rewardIds;
   }

   public void shopAddUpReset() {
      ActivityQiXiDao dao = this.getDao();
      Map<Integer, QiXiShopAddUpModel> shopAddUpModelMap = this.getNowShopAddUpMap();
      List<ResourceModel> notReceiveRewards = new ArrayList();
      Set<Integer> shopAddUpGotRewards = this.getShopAddUpGotRewards();

      for(QiXiShopAddUpModel model : shopAddUpModelMap.values()) {
         if (this.checkShopAddUpUnlock(model.getId(), false) && !shopAddUpGotRewards.contains(model.getId())) {
            notReceiveRewards.addAll(model.getRewards());
         }
      }

      if (notReceiveRewards.size() > 0) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_QI_XI_SHOP_ADD_UP);
         if (null != centreAwardMap && centreAwardMap.size() > 0) {
            CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewards, 604800000L, this.getActivityLogModule(), 10702);
         }
      }

      dao.shopAddUpGotRechargeNum.clear();
      dao.dailyRecharge = 0;
      dao.updateOp();
   }

   public boolean checkShopAddUpUnlock(int id, boolean sendMsg) {
      QiXiShopAddUpModel shopAddUpModel = this.getShopAddUpModel(id);
      if (null == shopAddUpModel) {
         return sendMsg ? this.player.failure(6) : false;
      } else {
         ActivityQiXiDao dao = this.getDao();
         if (dao.dailyRecharge < shopAddUpModel.getRechargeNum()) {
            return sendMsg ? this.player.failure(76031) : false;
         } else {
            return true;
         }
      }
   }

   public QiXiShopAddUpModel getShopAddUpModel(int id) {
      QiXiShopAddUpModel model = (QiXiShopAddUpModel)this.player.getGameModelPool().getEntity("QixiShopAddup", id);
      return model;
   }

   public Map<Integer, QiXiShopAddUpModel> getNowShopAddUpMap() {
      int activityOpenDay = this.getActivityOpenDay();
      Map<Integer, QiXiShopAddUpModel> modelMap = new HashMap();
      Map<Integer, QiXiShopAddUpModel> allModel = this.player.getGameModelPool().getMap("QixiShopAddup");
      if (allModel != null && !allModel.isEmpty()) {
         for(Map.Entry<Integer, QiXiShopAddUpModel> entry : allModel.entrySet()) {
            QiXiShopAddUpModel model = (QiXiShopAddUpModel)entry.getValue();
            if (model.getDateEnd() == -1) {
               if (activityOpenDay >= model.getDateStart()) {
                  modelMap.put(model.getRechargeNum(), model);
               }
            } else if (activityOpenDay >= model.getDateStart() && activityOpenDay <= model.getDateEnd()) {
               modelMap.put(model.getRechargeNum(), model);
            }
         }

         return modelMap;
      } else {
         return modelMap;
      }
   }

   @MsgHandlerAnno
   public void C2S_SignTotalInfo_21006(ActivityQiXiMsg.C2S_SignTotalInfo_21006 msg, String source) {
      this.sendSignTotalInfo();
   }

   public void sendSignTotalInfo() {
      ActivityQiXiMsg.S2C_SignTotalInfo_21007.Builder builder = ActivityQiXiMsg.S2C_SignTotalInfo_21007.newBuilder();
      ActivityQiXiDao dao = this.getDao();
      builder.setActivityDay(this.getSeverActivityDay());
      builder.addAllSignGotRewards(dao.signGotRewards);
      this.player.sendMsg(builder.build());
   }

   public boolean checkSignUnlock(int day, boolean sendMsg) {
      QiXiSignAwardModel model = (QiXiSignAwardModel)this.player.getGameModelPool().getEntity("QixiSignAward", day);
      if (null == model) {
         return sendMsg ? this.player.failure(6) : false;
      } else if (day > this.getSeverActivityDay()) {
         return sendMsg ? this.player.failure(76009) : false;
      } else {
         ActivityQiXiDao dao = this.getDao();
         if (dao.signGotRewards.contains(day)) {
            return sendMsg ? this.player.failure(76010) : false;
         } else {
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Sign_21008(ActivityQiXiMsg.C2S_Sign_21008 msg, String source) {
      int day = msg.getDay();
      if (!this.checkSignUnlock(day, true)) {
         return false;
      } else {
         QiXiSignAwardModel model = (QiXiSignAwardModel)this.player.getGameModelPool().getEntity("QixiSignAward", day);
         this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 10703, 0, 0, "");
         ActivityQiXiDao dao = this.getDao();
         dao.signGotRewards.add(day);
         dao.updateOp();
         this.sendSignTotalInfo();
         return true;
      }
   }

   public void signEnd() {
      ActivityQiXiDao dao = this.getDao();
      dao.signGotRewards.clear();
      dao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_BeatDrumInfo_21009(ActivityQiXiMsg.C2S_BeatDrumInfo_21009 msg, String source) {
      this.sendMusicDrumInfo();
   }

   @MsgHandlerAnno
   public void C2S_BeatDrum_21011(ActivityQiXiMsg.C2S_BeatDrum_21011 msg, String source) {
      ActivityQiXiDao activityQiXiDao = this.getDao();
      ActivityQiXiMsg.S2C_BeatDrum_21012.Builder resp = ActivityQiXiMsg.S2C_BeatDrum_21012.newBuilder();
      resp.setResult(1);
      resp.setMusicId(msg.getMusicId());
      resp.setBeatCount(activityQiXiDao.beatCount);
      if (this.isServerActivityInvalid()) {
         resp.setResult(8007);
         this.player.sendMsg(resp.build());
      } else {
         int maxCount = ApplicationContextProvider.getConfigInt("QixiMusicTimes", 0);
         if (activityQiXiDao.beatCount >= maxCount) {
            resp.setResult(51);
            this.player.sendMsg(resp.build());
         } else {
            QiXiMusicModel musicModel = (QiXiMusicModel)ApplicationContextProvider.getModelPoolEntity("QixiMusic", msg.getMusicId());
            if (musicModel == null) {
               resp.setResult(0);
               this.player.sendMsg(resp.build());
            } else if (msg.getScore() >= 0 && msg.getScore() <= musicModel.getAllScore()) {
               int point = musicModel.getScore().size();

               for(int i = 0; i < musicModel.getScore().size(); ++i) {
                  int score = (Integer)musicModel.getScore().get(i);
                  if (msg.getScore() >= score) {
                     point = i + 1;
                     break;
                  }
               }

               QiXiMusicPointModel rewardModel = (QiXiMusicPointModel)ApplicationContextProvider.getModelPoolEntity("QixiMusicPoint", point);
               if (rewardModel == null) {
                  resp.setResult(0);
                  this.player.sendMsg(resp.build());
               } else {
                  ActivityQiXiDao.MusicData musicData = (ActivityQiXiDao.MusicData)MapUtil.computeIfAbsent(activityQiXiDao.musicData, msg.getMusicId(), new ActivityQiXiDao.MusicData(msg.getMusicId()));
                  if (msg.getScore() > musicData.topScore) {
                     musicData.topScore = msg.getScore();
                  }

                  ++activityQiXiDao.beatCount;
                  activityQiXiDao.updateOp();
                  List<ActivityQiXiDao.MusicData> musicDataList = new ArrayList(activityQiXiDao.musicData.values());
                  musicDataList.sort(ComparatorUtil.createReversedComparatorByFiled(ActivityQiXiDao.MusicData.class, "topScore"));
                  if (musicDataList.size() > 3) {
                     musicDataList = musicDataList.subList(0, 3);
                  }

                  int totalScore = 0;

                  for(ActivityQiXiDao.MusicData rankData : musicDataList) {
                     totalScore += rankData.topScore;
                  }

                  if (totalScore > 0) {
                     RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
                     rankPart.updateRank(RankDefine.RankModule.ACTIVITY_POINT, (long)totalScore, true, String.valueOf(this.getActivityType()), String.valueOf(this.getPlayerActivityId()));
                  }

                  this.player.addResource(rewardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, 8, 10707, msg.getMusicId(), msg.getScore(), "");
                  resp.setBeatCount(activityQiXiDao.beatCount);
                  resp.setTopScore(musicData.topScore);
                  resp.addAllGotScore(musicData.gotScore);
                  this.player.sendMsg(resp.build());
                  StringBuilder stringBuilder = new StringBuilder();

                  for(ResourceModel resourceModel : rewardModel.getRewards()) {
                     stringBuilder.append(resourceModel.getId()).append(":").append(resourceModel.getValue()).append(",");
                  }

                  if (stringBuilder.length() > 0) {
                     this.player.getOperationMgr().addReceiveAwardNewLog(this.player, 17, this.getServerActivityInfo().id, "笙箫传情", stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString(), String.valueOf(msg.getScore()), 0, 0, 0);
                  }

               }
            } else {
               resp.setResult(6);
               this.player.sendMsg(resp.build());
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_DrumLevelReward_21025(ActivityQiXiMsg.C2S_DrumLevelReward_21025 msg, String source) {
      if (this.isServerActivityInvalid()) {
         this.player.failure(8007);
      } else {
         QiXiMusicLevelModel qiXiMusicLevelModel = (QiXiMusicLevelModel)ApplicationContextProvider.getModelPoolEntity("QixiMusicScoreReward", msg.getGotId());
         if (qiXiMusicLevelModel == null) {
            this.player.failure(0);
         } else {
            ActivityQiXiDao activityQiXiDao = this.getDao();
            if (!activityQiXiDao.musicData.containsKey(qiXiMusicLevelModel.getMusicId())) {
               this.player.failure(6);
            } else {
               ActivityQiXiDao.MusicData musicData = (ActivityQiXiDao.MusicData)activityQiXiDao.musicData.get(qiXiMusicLevelModel.getMusicId());
               if (musicData.gotScore.contains(msg.getGotId())) {
                  this.player.failure(24);
               } else if (qiXiMusicLevelModel.getPoint() > musicData.topScore) {
                  this.player.failure(33);
               } else {
                  musicData.gotScore.add(msg.getGotId());
                  activityQiXiDao.updateOp();
                  this.player.addResource(qiXiMusicLevelModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, 8, 10708, msg.getGotId(), qiXiMusicLevelModel.getPoint(), "");
                  ActivityQiXiMsg.S2C_DrumLevelReward_21026.Builder resp = ActivityQiXiMsg.S2C_DrumLevelReward_21026.newBuilder();
                  resp.setGotId(msg.getGotId());
                  this.player.sendMsg(resp.build());
               }
            }
         }
      }
   }

   public void sendMusicDrumInfo() {
      ActivityQiXiDao activityQiXiDao = this.getDao();
      ActivityQiXiMsg.S2C_BeatDrumInfo_21010.Builder resp = ActivityQiXiMsg.S2C_BeatDrumInfo_21010.newBuilder();
      resp.setBeatCount(activityQiXiDao.beatCount);
      int totalScore = 0;

      for(Map.Entry<Integer, ActivityQiXiDao.MusicData> entry : activityQiXiDao.musicData.entrySet()) {
         resp.addMusicData(((ActivityQiXiDao.MusicData)entry.getValue()).buildMsg());
         totalScore += ((ActivityQiXiDao.MusicData)entry.getValue()).topScore;
      }

      resp.setTotalScore(totalScore);
      resp.setIsRed(this.checkMusicRed());
      this.player.sendMsg(resp.build());
   }

   public Boolean checkMusicRed() {
      ActivityQiXiDao activityQiXiDao = this.getDao();
      Map<Integer, QiXiMusicLevelModel> modelMap = this.player.getGameModelPool().getMap("QixiMusicScoreReward");

      for(QiXiMusicLevelModel model : modelMap.values()) {
         if (activityQiXiDao.musicData.containsKey(model.getMusicId())) {
            ActivityQiXiDao.MusicData musicData = (ActivityQiXiDao.MusicData)activityQiXiDao.musicData.get(model.getMusicId());
            if (musicData.topScore > model.getPoint() && !musicData.gotScore.contains(model.getId())) {
               return true;
            }
         }
      }

      return false;
   }

   public void musicDrumResetDaily() {
      ActivityQiXiDao activityQiXiDao = this.getDao();
      activityQiXiDao.beatCount = 0;
      activityQiXiDao.updateOp();
   }

   public void musicDrumReset() {
      ActivityQiXiDao activityQiXiDao = this.getDao();
      activityQiXiDao.beatCount = 0;
      activityQiXiDao.musicData.clear();
      activityQiXiDao.updateOp();
   }

   public void drawEnd() {
      ActivityQiXiDao dao = this.getDao();
      dao.drawTime = 0;
      dao.fancyRewardId = 0;
      int lotteryStage = this.getSmashEggStage();
      dao.lotteryStage = lotteryStage;
      dao.seniorRewards.clear();
      dao.roundSmashNum.clear();
      dao.recordList.clear();
      dao.hadRewards.clear();
      dao.updateOp();
   }

   public void drawResetDaily() {
      ActivityQiXiDao dao = this.getDao();
      int lotteryStage = this.getSmashEggStage();
      if (lotteryStage != dao.lotteryStage) {
         dao.lotteryStage = lotteryStage;
         dao.fancyRewardId = 0;
      }

      dao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_FancyReward_21013(ActivityQiXiMsg.C2S_FancyReward_21013 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         ActivityQiXiDao dao = this.getDao();
         QiXiLotteryItemModel qiXiLotteryItemModel = (QiXiLotteryItemModel)this.player.getGameModelPool().getEntity("QixiLotteryItem", msg.getTargetId());
         if (qiXiLotteryItemModel != null) {
            if (qiXiLotteryItemModel.getItemGroup() != 1) {
               this.player.failure(0);
               this.logger.error("玩家={}，设置心仪奖励类型错误，物品ID={}，group={}", new Object[]{this.player.getPlayerId(), qiXiLotteryItemModel.getId(), qiXiLotteryItemModel.getItemGroup()});
            } else if (dao.lotteryStage != qiXiLotteryItemModel.getStage()) {
               this.player.failure(0);
               this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，当前阶段={}", new Object[]{this.player.getPlayerId(), qiXiLotteryItemModel.getId(), qiXiLotteryItemModel.getStage()});
            } else {
               int openDay = this.getActivityOpenDay();
               if (qiXiLotteryItemModel.getDateEnd() == -1) {
                  if (qiXiLotteryItemModel.getDateStart() > openDay) {
                     this.player.failure(0);
                     this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前date={}", new Object[]{this.player.getPlayerId(), qiXiLotteryItemModel.getId(), openDay});
                     return;
                  }
               } else if (openDay < qiXiLotteryItemModel.getDateStart() || openDay > qiXiLotteryItemModel.getDateEnd()) {
                  this.player.failure(0);
                  this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前date={}", new Object[]{this.player.getPlayerId(), qiXiLotteryItemModel.getId(), openDay});
                  return;
               }

               int activityDay = this.getSeverActivityDay();
               if (activityDay >= qiXiLotteryItemModel.getStageStart() && activityDay <= qiXiLotteryItemModel.getStageEnd()) {
                  if (qiXiLotteryItemModel.getSurplusNum() > 0) {
                     int selectNum = (Integer)MapUtil.getOrDefault(dao.seniorRewards, qiXiLotteryItemModel.getId(), 0);
                     if (selectNum >= qiXiLotteryItemModel.getSurplusNum()) {
                        this.logger.error("心仪奖励已经达到最大次数，已经获取={}，最大次数={}", dao.seniorRewards.get(qiXiLotteryItemModel.getId()), qiXiLotteryItemModel.getSurplusNum());
                        return;
                     }
                  }

                  dao.fancyRewardId = msg.getTargetId();
                  dao.updateOp();
                  ActivityQiXiMsg.S2C_FancyReward_21014.Builder builder = ActivityQiXiMsg.S2C_FancyReward_21014.newBuilder();
                  builder.setResult(1);
                  builder.setTargetId(msg.getTargetId());
                  this.player.sendMsg(builder.build());
               } else {
                  this.player.failure(0);
                  this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前activityDay={}", new Object[]{this.player.getPlayerId(), qiXiLotteryItemModel.getId(), activityDay});
               }
            }
         }
      }
   }

   public int getSmashEggStage() {
      Map<Integer, QiXiLotteryItemModel> allMap = this.player.getGameModelPool().getMap("QixiLotteryItem");
      if (allMap != null && allMap.size() > 0) {
         int activityStartDay = this.getActivityOpenDay();
         int severActivityDay = this.getSeverActivityDay();

         for(QiXiLotteryItemModel model : allMap.values()) {
            if (model.getDateEnd() == -1) {
               if (activityStartDay >= model.getDateStart() && severActivityDay >= model.getStageStart() && severActivityDay <= model.getStageEnd()) {
                  return model.getStage();
               }
            } else if (activityStartDay >= model.getDateStart() && activityStartDay <= model.getDateEnd() && severActivityDay >= model.getStageStart() && severActivityDay <= model.getStageEnd()) {
               return model.getStage();
            }
         }
      }

      return 1;
   }

   @MsgHandlerAnno
   public void C2S_Draw_21017(ActivityQiXiMsg.C2S_Draw_21017 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         QiXiLotteryCostModel costModel = (QiXiLotteryCostModel)ApplicationContextProvider.getModelPoolEntity("QixiLotteryCost", msg.getType());
         if (costModel == null) {
            this.player.failure(0);
         } else {
            int lotteryNum = costModel.getExtractNum();
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            int lotteryLimit = ApplicationContextProvider.getConfigInt("LotteryLimit", 99999);
            int recruitNum = (Integer)playerResetCustomCache.getDailyNum(44, 0);
            if (recruitNum + lotteryNum > lotteryLimit) {
               this.player.failure(51);
            } else {
               ActivityQiXiDao dao = this.getDao();
               if (dao.fancyRewardId <= 0) {
                  this.player.failure(8024);
               } else {
                  List<ResourceModel> needModelList = new ArrayList();

                  for(ResourceModel consumeItem : costModel.getConsumeItems()) {
                     consumeItem.addResourceToList(needModelList);
                  }

                  if (this.player.checkResourceNum(needModelList)) {
                     int openDay = this.getActivityOpenDay();
                     int activityDay = this.getSeverActivityDay();
                     Map<Integer, QiXiLotteryItemModel> itemModelMap = this.getLotteryItemMap(openDay, activityDay);
                     if (itemModelMap != null && !itemModelMap.isEmpty()) {
                        QiXiLotteryItemModel enjoyModel = (QiXiLotteryItemModel)this.player.getGameModelPool().getEntity("QixiLotteryItem", dao.fancyRewardId);
                        List<ResourceModel> addList = new ArrayList();
                        boolean isHaveFancy = false;
                        List<ResourceModel> resourceModels = new ArrayList();

                        for(int i = 0; i < lotteryNum; ++i) {
                           int oldSmashNum_1 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0);
                           dao.roundSmashNum.put(1, oldSmashNum_1 + 1);
                           int oldSmashNum_2 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 2, 0);
                           dao.roundSmashNum.put(2, oldSmashNum_2 + 1);
                           QiXiLotteryItemModel itemModel = this.smashEgg(dao, itemModelMap);
                           if (itemModel == null) {
                              return;
                           }

                           this.recordServer(itemModel);
                           resourceModels.addAll(itemModel.getRewards());
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

                           ++dao.drawTime;

                           for(ResourceModel resourceModel : itemModel.getRewards()) {
                              addList.add(resourceModel);
                           }
                        }

                        int createTime = DateUtil.getIntTime(System.currentTimeMillis());

                        for(ResourceModel resourceModel : resourceModels) {
                           ActivityQiXiDao.RecordInfo recordInfo = new ActivityQiXiDao.RecordInfo(createTime, resourceModel);
                           dao.addRecordInfo(recordInfo);
                        }

                        dao.updateOp();
                        this.player.delResource((List)needModelList, this.getActivityLogModule(), 10705, 0, 0, "");
                        this.player.addResource(addList, PlayerMsg.ShowType.SHOW_QI_XI_DRAW_ACTIVITY, this.getActivityLogModule(), 10704, 0, 0, "");
                        playerResetCustomCache.addDailyReset(44, lotteryNum);
                        ActivityQiXiMsg.S2C_Draw_21018.Builder builder = ActivityQiXiMsg.S2C_Draw_21018.newBuilder();
                        builder.setIsHaveFancy(isHaveFancy);
                        builder.setTargetId(dao.fancyRewardId);

                        for(Map.Entry<Integer, Integer> entry : dao.seniorRewards.entrySet()) {
                           CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
                           info.setKey((Integer)entry.getKey());
                           info.setValue((Integer)entry.getValue());
                           builder.addSeniorNum(info);
                        }

                        builder.setDrawTimes(dao.drawTime);
                        int dailyDrawNum = (Integer)playerResetCustomCache.getDailyNum(44, 0);
                        builder.setRecruitNum(dailyDrawNum);
                        builder.setFancyGroupDrawTimes((Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0));
                        this.player.sendMsg(builder.build());
                        int enjoyId = enjoyModel != null && enjoyModel.getRewards().size() > 0 ? ((ResourceModel)enjoyModel.getRewards().get(0)).getId() : 0;

                        for(ResourceModel resourceModel : addList) {
                           String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                           this.player.getOperationMgr().addExtraLog(this.player, 198, "七夕庆典-抽奖", ((ResourceModel)needModelList.get(0)).getId() + "", ((ResourceModel)needModelList.get(0)).getValue() + "", "", strings[2], strings[1], strings[0].equals(String.valueOf(enjoyId)) ? "1" : "0");
                        }

                     }
                  }
               }
            }
         }
      }
   }

   public Map<Integer, QiXiLotteryItemModel> getLotteryItemMap(int openDay, int activityDay) {
      Map<Integer, QiXiLotteryItemModel> itemModelMap = this.player.getGameModelPool().getMap("QixiLotteryItem");
      if (itemModelMap == null) {
         return null;
      } else {
         Map<Integer, QiXiLotteryItemModel> resultMap = new HashMap();

         for(Map.Entry<Integer, QiXiLotteryItemModel> entry : itemModelMap.entrySet()) {
            if (((QiXiLotteryItemModel)entry.getValue()).getDateEnd() == -1) {
               if (openDay < ((QiXiLotteryItemModel)entry.getValue()).getDateStart()) {
                  continue;
               }
            } else if (openDay < ((QiXiLotteryItemModel)entry.getValue()).getDateStart() || openDay > ((QiXiLotteryItemModel)entry.getValue()).getDateEnd()) {
               continue;
            }

            if (activityDay >= ((QiXiLotteryItemModel)entry.getValue()).getStageStart() && activityDay <= ((QiXiLotteryItemModel)entry.getValue()).getStageEnd()) {
               resultMap.put(entry.getKey(), entry.getValue());
            }
         }

         return resultMap;
      }
   }

   private QiXiLotteryItemModel smashEgg(ActivityQiXiDao dao, Map<Integer, QiXiLotteryItemModel> itemModelMap) {
      Map<Integer, QiXiLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(QiXiLotteryItemModel lotteryItemModel : itemModelMap.values()) {
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

         for(QiXiLotteryItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }

   @MsgHandlerAnno
   public void C2S_LuckDrawInfo_21015(ActivityQiXiMsg.C2S_LuckDrawInfo_21015 msg, String source) {
      this.sendDrawInfo();
   }

   public void sendDrawInfo() {
      ActivityQiXiDao dao = this.getDao();
      ActivityQiXiMsg.S2C_LuckDrawInfo_21016.Builder builder = ActivityQiXiMsg.S2C_LuckDrawInfo_21016.newBuilder();
      builder.setDrawTimes(dao.drawTime);
      builder.addAllHadRewardId(dao.hadRewards);
      builder.setStagEndTime(this.getDrawStageEndTime());
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int recruitNum = (Integer)playerResetCustomCache.getDailyNum(44, 0);
      builder.setRecruitNum(recruitNum);

      for(Map.Entry<Integer, Integer> entry : dao.seniorRewards.entrySet()) {
         CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
         info.setKey((Integer)entry.getKey());
         info.setValue((Integer)entry.getValue());
         builder.addSeniorRewards(info);
      }

      builder.setFancyId(dao.fancyRewardId);
      builder.setLotteryStage(dao.lotteryStage);
      builder.setFancyGroupDrawTimes((Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0));
      this.player.sendMsg(builder.build());
   }

   public List<QiXiLotteryItemModel> getDrawJackpot() {
      List<QiXiLotteryItemModel> jackpotModels = new ArrayList();
      int activityStartDay = this.getActivityOpenDay();
      Map<Integer, Map<Integer, QiXiLotteryItemModel>> qiXiLotteryItemModel = ApplicationContextProvider.<Integer, Map<Integer, QiXiLotteryItemModel>>getModelPoolMap("CustomQixiLotteryItem");
      TreeMap<Integer, Map<Integer, QiXiLotteryItemModel>> treeMap = new TreeMap(qiXiLotteryItemModel);
      int dateStartKey = (Integer)treeMap.floorKey(activityStartDay);
      Map<Integer, QiXiLotteryItemModel> modelMap = (Map)qiXiLotteryItemModel.get(dateStartKey);
      int severActivityDay = this.getSeverActivityDay();

      for(QiXiLotteryItemModel model : modelMap.values()) {
         if (severActivityDay >= model.getStageStart() && severActivityDay <= model.getStageEnd()) {
            jackpotModels.add(model);
         }
      }

      return jackpotModels;
   }

   public long getDrawStageEndTime() {
      List<QiXiLotteryItemModel> jackpotModels = this.getDrawJackpot();
      if (jackpotModels.size() == 0) {
         this.logger.info("七夕庆典活动 - 轮盘抽奖奖池数据为空");
         return 0L;
      } else {
         QiXiLotteryItemModel model = (QiXiLotteryItemModel)jackpotModels.get(0);
         ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
         long endTimeStamp = (long)activityInfo.start * 1000L + (long)model.getStageEnd() * 86400000L;
         return endTimeStamp;
      }
   }

   private void recordServer(QiXiLotteryItemModel model) {
      if (model.getIsRecord() > 0 && model.getBelovedItemID() > 0) {
         CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
         CrossMsg.S2CR_UploadQiXiRecord_4228.Builder builder = CrossMsg.S2CR_UploadQiXiRecord_4228.newBuilder();
         builder.setPlayerName(this.player.getPlayerDao().playerName);
         builder.setBelovedItemId(model.getBelovedItemID());
         builder.setStage(this.getSmashEggStage());
         crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }

   @MsgHandlerAnno
   public void C2S_OpenReward_21019(ActivityQiXiMsg.C2S_OpenReward_21019 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         int id = msg.getId();
         QiXiAddUpReturnModel awardModel = (QiXiAddUpReturnModel)ApplicationContextProvider.getModelPoolEntity("QixiAddupReturnAward", id);
         if (awardModel != null) {
            int activityStartDay = this.getActivityOpenDay();
            int dateEnd = awardModel.getDateEnd() > 0 ? awardModel.getDateEnd() : Integer.MAX_VALUE;
            if (activityStartDay >= awardModel.getDateStart() && activityStartDay <= dateEnd) {
               ActivityQiXiDao dao = this.getDao();
               if (dao.hadRewards.contains(id)) {
                  this.logger.info("七夕庆典活动 - 奖励已领取 playerId:{}, id:{}", this.player.getPlayerId(), id);
               } else if (awardModel.getAddupNum() > dao.drawTime) {
                  this.logger.info("七夕庆典活动 - 抽奖累计次数未达到 以抽奖次数:{},需要次数:{}", dao.drawTime, awardModel.getAddupNum());
               } else {
                  dao.hadRewards.add(id);
                  dao.updateOp();
                  this.player.addResource(awardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 10706, 0, 0, "");
                  ActivityQiXiMsg.S2C_OpenReward_21020.Builder builder = ActivityQiXiMsg.S2C_OpenReward_21020.newBuilder();
                  builder.setId(id);
                  this.player.sendMsg(builder.build());
               }
            } else {
               this.logger.info("七夕庆典活动 - 领取的奖励不是本期的 开服天数:{}，id:{}", activityStartDay, id);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_DrawRecord_21021(ActivityQiXiMsg.C2S_DrawRecord_21021 msg, String source) {
      ActivityQiXiMsg.S2C_DrawRecord_21022.Builder builder = ActivityQiXiMsg.S2C_DrawRecord_21022.newBuilder();
      ActivityQiXiDao dao = this.getDao();

      for(String record : dao.recordList) {
         String[] arr = record.split(":");
         ActivityQiXiMsg.MyDrawRecord.Builder drawRecord = ActivityQiXiMsg.MyDrawRecord.newBuilder();
         drawRecord.setCreateTime(Integer.parseInt(arr[0]));
         String[] split = arr[1].split("_");
         CommonMsg.ItemInfo.Builder itemInfo = CommonMsg.ItemInfo.newBuilder();
         itemInfo.setType(Integer.parseInt(split[0]));
         itemInfo.setId(Integer.parseInt(split[1]));
         itemInfo.setNum(Integer.parseInt(split[2]));
         drawRecord.addItemInfo(itemInfo);
         builder.addMyRecord(drawRecord);
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public void C2S_ServerDrawRecord_21023(ActivityQiXiMsg.C2S_ServerDrawRecord_21023 msg, String source) {
      CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
      crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   public boolean drawView(int lotteryId, int round) {
      QiXiLotteryItemModel model = (QiXiLotteryItemModel)this.player.getGameModelPool().getEntity("QixiLotteryItem", lotteryId);
      if (null == model) {
         return this.player.failure(0);
      } else if (model.getItemGroup() != 1) {
         return this.player.failure(8024);
      } else {
         DrawViewData drawViewData = new DrawViewData();
         drawViewData.fancyRewardId = model.getId();
         int initRound = 0;
         Map<Integer, QiXiLotteryItemModel> lotteryItemMap = this.getLotteryItemMap(model.getDateStart(), model.getStageStart());
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
               QiXiLotteryItemModel lotteryItemModel = this.gmSmashEgg(drawViewData, lotteryItemMap);
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

   private QiXiLotteryItemModel gmSmashEgg(DrawViewData drawViewData, Map<Integer, QiXiLotteryItemModel> itemModelMap) {
      Map<Integer, QiXiLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(QiXiLotteryItemModel lotteryItemModel : itemModelMap.values()) {
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

         for(QiXiLotteryItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }
}
