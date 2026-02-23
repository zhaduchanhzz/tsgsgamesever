package com.gzbz.activity.part;

import allMgr.MsgHandlerAnno;
import allMgr.PartAnnotation;
import com.gzbz.activity.bean.ActivityInfo;
import com.gzbz.db.ActivityZongQingDao;
import com.gzbz.db.PlayerDao;
import com.gzbz.db.PlayerRechargeDao;
import com.gzbz.db.bean.DrawViewData;
import com.gzbz.db.bean.DrawViewLogInfo;
import com.gzbz.gameCache.PlayerResetCustomCache;
import com.gzbz.gameDefine.MailDefine;
import com.gzbz.gameDefine.PlayerDefine;
import com.gzbz.gameDefine.RankDefine;
import com.gzbz.gamePlayer.GamePlayer;
import com.gzbz.gamePlayer.mail.MailPart;
import com.gzbz.logOperation.LogOperationMgr;
import com.gzbz.model.CentreAwardModel;
import com.gzbz.model.ZongQingAddUpReturnModel;
import com.gzbz.model.ZongQingGameDropModel;
import com.gzbz.model.ZongQingGamePointAwardModel;
import com.gzbz.model.ZongQingLotteryCostModel;
import com.gzbz.model.ZongQingLotteryItemModel;
import com.gzbz.model.ZongQingShopAddUpModel;
import com.gzbz.model.ZongQingSignAwardModel;
import com.gzbz.model.fun.ResourceModel;
import com.gzbz.model.manager.ConfigManager;
import com.gzbz.net.CrossNettyClient;
import com.gzbz.protobuf.ActivityZongQingMsg;
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
import misc.DateUtil;
import misc.MapUtil;
import misc.MiscUtil;
import misc.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@PartAnnotation(
   mgr = GamePlayer.class
)
public class ZongQingActivityPart extends AddUpAndConRechargeActivityPart {
   private String ZONG_QING_TICKET_NUM = "zongqingTicketNum";
   private String ZONG_QING_GAME_BUY = "zongqingGameBuy";
   private String ZONG_QING_GAME_TIME = "zongqingGameTime";
   private String ZONG_QING_GAME_LINE_LIMIT = "zongqingGameLineLimit";
   private Integer GMAE_OFFSET_SECONDS = 2;
   private int CAN_NOT_BUY_TICKET = -1;
   @Autowired
   private ConfigManager configManager;

   public ActivityZongQingDao getDao() {
      ActivityZongQingDao dao = (ActivityZongQingDao)this.player.getData("tb_activity_zong_qing", this.player.getPlayerId());
      return dao;
   }

   public int getActivityLogModule() {
      return 101;
   }

   public int getAddUpLogReason() {
      return 10101;
   }

   public int getAddUpMail() {
      return CentreAwardModel.TYPE_ZONG_QING_ADD_UP_RECHARGE;
   }

   public String getAddUpExcelName() {
      return "ZongqingAddupRecharge";
   }

   public int getConLogReason() {
      return 10114;
   }

   public int getConMail() {
      return CentreAwardModel.TYPE_ZONG_QING_BLESSING_REWARD;
   }

   public String getConExcelName() {
      return "ZongqingBlessing";
   }

   public int getActivityType() {
      return 79;
   }

   public void sendInfo() {
      if (!this.isServerActivityInvalid()) {
         super.sendInfo();
         this.sendActivityInfo();
         this.shopAddUpRechargeHandle(true);
         this.sendDrawInfo();
         this.sendPickUpInfo();
         this.sendSignTotalInfo();
      }
   }

   public void resetDaily() {
      if (!this.isServerActivityInvalid()) {
         super.resetDaily();
         this.drawResetDaily();
         this.sendDrawInfo();
         this.shopAddUpReset();
         this.sendShopAddUpInfo();
         this.pickUpResetDaily();
         this.sendPickUpInfo();
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
      this.pickUpEnd();
      this.drawEnd();
   }

   public void rotateReset(int oldActivityId) {
      ActivityZongQingDao dao = this.getDao();
      int lotteryStage = this.getSmashEggStage();
      dao.lotteryStage = lotteryStage;
      dao.updateOp();
      this.shopAddUpReset();
      this.pickUpEnd();
      this.pickUpResetDaily();
      this.clearActivityGift(24);
   }

   @MsgHandlerAnno
   public void C2S_ActivityInfo_20501(ActivityZongQingMsg.C2S_ActivityInfo_20501 msg, String source) {
      this.sendActivityInfo();
   }

   public void sendActivityInfo() {
      ActivityZongQingMsg.S2C_ActivityInfo_20502.Builder builder = ActivityZongQingMsg.S2C_ActivityInfo_20502.newBuilder();
      builder.setOpenDay(this.getActivityOpenDay());
      builder.setActivityDay(this.getSeverActivityDay());
      this.player.sendMsg(builder.build());
   }

   public void shopAddUpRechargeHandle(boolean sendMsg) {
      if (!this.isServerActivityInvalid()) {
         PlayerDao playerDao = this.player.getPlayerDao();
         if (DateUtil.isSameDay(playerDao.updateTime)) {
            ActivityZongQingDao dao = this.getDao();
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
   public void C2S_ShopAddUpInfo_20503(ActivityZongQingMsg.C2S_ShopAddUpInfo_20503 msg, String source) {
      this.shopAddUpRechargeHandle(true);
   }

   @MsgHandlerAnno
   public boolean C2S_ReceiveShopAddUpReward_20505(ActivityZongQingMsg.C2S_ReceiveShopAddUpReward_20505 msg, String source) {
      int id = msg.getId();
      ActivityZongQingDao dao = this.getDao();
      Set<Integer> shopAddUpGotRewards = this.getShopAddUpGotRewards();
      if (shopAddUpGotRewards.contains(id)) {
         return this.player.failure(76030);
      } else if (!this.checkShopAddUpUnlock(id, true)) {
         return false;
      } else {
         ZongQingShopAddUpModel shopAddUpModel = this.getShopAddUpModel(id);
         this.player.addResource(shopAddUpModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 10102, 0, 0, "");
         dao.shopAddUpGotRechargeNum.add(shopAddUpModel.getRechargeNum());
         dao.updateOp();
         this.sendShopAddUpInfo();
         return true;
      }
   }

   public void sendShopAddUpInfo() {
      ActivityZongQingMsg.S2C_ShopAddUpInfo_20504.Builder builder = ActivityZongQingMsg.S2C_ShopAddUpInfo_20504.newBuilder();
      ActivityZongQingDao dao = this.getDao();
      builder.setDailyRecharge(dao.dailyRecharge);
      builder.addAllGotRewards(this.getShopAddUpGotRewards());
      this.player.sendMsg(builder.build());
   }

   public Set<Integer> getShopAddUpGotRewards() {
      ActivityZongQingDao dao = this.getDao();
      Set<Integer> rewardIds = new HashSet();
      if (dao.shopAddUpGotRechargeNum.size() > 0) {
         Map<Integer, ZongQingShopAddUpModel> nowShopAddUpMap = this.getNowShopAddUpMap();

         for(int rechargeNum : dao.shopAddUpGotRechargeNum) {
            ZongQingShopAddUpModel model = (ZongQingShopAddUpModel)nowShopAddUpMap.get(rechargeNum);
            if (null != model) {
               rewardIds.add(model.getId());
            }
         }
      }

      return rewardIds;
   }

   public void shopAddUpReset() {
      ActivityZongQingDao dao = this.getDao();
      Map<Integer, ZongQingShopAddUpModel> shopAddUpModelMap = this.getNowShopAddUpMap();
      List<ResourceModel> notReceiveRewards = new ArrayList();
      Set<Integer> shopAddUpGotRewards = this.getShopAddUpGotRewards();

      for(ZongQingShopAddUpModel model : shopAddUpModelMap.values()) {
         if (this.checkShopAddUpUnlock(model.getId(), false) && !shopAddUpGotRewards.contains(model.getId())) {
            notReceiveRewards.addAll(model.getRewards());
         }
      }

      if (notReceiveRewards.size() > 0) {
         Map<Integer, TreeMap<Integer, CentreAwardModel>> allCentreAwardMap = ApplicationContextProvider.<Integer, TreeMap<Integer, CentreAwardModel>>getModelPoolMap("customCentreAward");
         TreeMap<Integer, CentreAwardModel> centreAwardMap = (TreeMap)allCentreAwardMap.get(CentreAwardModel.TYPE_ZONG_QING_SHOP_ADD_UP);
         if (null != centreAwardMap && centreAwardMap.size() > 0) {
            CentreAwardModel centreAwardModel = (CentreAwardModel)centreAwardMap.firstEntry().getValue();
            MailPart mailPart = (MailPart)this.player.getMgrPart(MailPart.class);
            mailPart.addMailOfEffectTime(MailDefine.MailType.MAIL_TYPE_COMMON, centreAwardModel.getTitle(), centreAwardModel.getDesc(), notReceiveRewards, 604800000L, this.getActivityLogModule(), 10102);
         }
      }

      dao.shopAddUpGotRechargeNum.clear();
      dao.dailyRecharge = 0;
      dao.updateOp();
   }

   public boolean checkShopAddUpUnlock(int id, boolean sendMsg) {
      ZongQingShopAddUpModel shopAddUpModel = this.getShopAddUpModel(id);
      if (null == shopAddUpModel) {
         return sendMsg ? this.player.failure(6) : false;
      } else {
         ActivityZongQingDao dao = this.getDao();
         if (dao.dailyRecharge < shopAddUpModel.getRechargeNum()) {
            return sendMsg ? this.player.failure(76031) : false;
         } else {
            return true;
         }
      }
   }

   public ZongQingShopAddUpModel getShopAddUpModel(int id) {
      ZongQingShopAddUpModel model = (ZongQingShopAddUpModel)this.player.getGameModelPool().getEntity("ZongqingShopAddup", id);
      return model;
   }

   public Map<Integer, ZongQingShopAddUpModel> getNowShopAddUpMap() {
      int activityOpenDay = this.getActivityOpenDay();
      Map<Integer, ZongQingShopAddUpModel> modelMap = new HashMap();
      Map<Integer, ZongQingShopAddUpModel> allModel = this.player.getGameModelPool().getMap("ZongqingShopAddup");
      if (allModel != null && !allModel.isEmpty()) {
         for(Map.Entry<Integer, ZongQingShopAddUpModel> entry : allModel.entrySet()) {
            ZongQingShopAddUpModel model = (ZongQingShopAddUpModel)entry.getValue();
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
   public void C2S_SignTotalInfo_20506(ActivityZongQingMsg.C2S_SignTotalInfo_20506 msg, String source) {
      this.sendSignTotalInfo();
   }

   public void sendSignTotalInfo() {
      ActivityZongQingMsg.S2C_SignTotalInfo_20507.Builder builder = ActivityZongQingMsg.S2C_SignTotalInfo_20507.newBuilder();
      ActivityZongQingDao dao = this.getDao();
      builder.setActivityDay(this.getSeverActivityDay());
      builder.addAllSignGotRewards(dao.signGotRewards);
      this.player.sendMsg(builder.build());
   }

   public boolean checkSignUnlock(int day, boolean sendMsg) {
      ZongQingSignAwardModel model = (ZongQingSignAwardModel)this.player.getGameModelPool().getEntity("ZongqingSignAward", day);
      if (null == model) {
         return sendMsg ? this.player.failure(6) : false;
      } else if (day > this.getSeverActivityDay()) {
         return sendMsg ? this.player.failure(76009) : false;
      } else {
         ActivityZongQingDao dao = this.getDao();
         if (dao.signGotRewards.contains(day)) {
            return sendMsg ? this.player.failure(76010) : false;
         } else {
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_Sign_20508(ActivityZongQingMsg.C2S_Sign_20508 msg, String source) {
      int day = msg.getDay();
      if (!this.checkSignUnlock(day, true)) {
         return false;
      } else {
         ZongQingSignAwardModel model = (ZongQingSignAwardModel)this.player.getGameModelPool().getEntity("ZongqingSignAward", day);
         this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 10103, 0, 0, "");
         ActivityZongQingDao dao = this.getDao();
         dao.signGotRewards.add(day);
         dao.updateOp();
         this.sendSignTotalInfo();
         return true;
      }
   }

   public void signEnd() {
      ActivityZongQingDao dao = this.getDao();
      dao.signGotRewards.clear();
      dao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_PickUpInfo_20509(ActivityZongQingMsg.C2S_PickUpInfo_20509 msg, String source) {
      this.sendPickUpInfo();
   }

   public void sendPickUpInfo() {
      ActivityZongQingDao dao = this.getDao();
      ActivityZongQingMsg.S2C_PickUpInfo_20510.Builder builder = ActivityZongQingMsg.S2C_PickUpInfo_20510.newBuilder();
      builder.setPoint(dao.point);
      builder.setTicketBuyTimes(dao.ticketBuyTimes);
      builder.setTicketBuyCost(this.getTicketBuyCost());
      builder.setGameStartTime(dao.gameStartTime);

      for(Map.Entry<Integer, Integer> entry : dao.gameObjectUniqueIds.entrySet()) {
         ActivityZongQingMsg.PickUpGameObjInfo.Builder info = ActivityZongQingMsg.PickUpGameObjInfo.newBuilder();
         info.setId((Integer)entry.getKey());
         info.setLineAndType((Integer)entry.getValue());
         builder.addGameObjLineInfo(info.build());
      }

      this.player.sendMsg(builder.build());
   }

   public void sendPickUpRoundInfo() {
      ActivityZongQingDao dao = this.getDao();
      ActivityZongQingMsg.S2C_PickUpShoot_20512.Builder builder = ActivityZongQingMsg.S2C_PickUpShoot_20512.newBuilder();
      builder.setCurPoint(dao.curPoint);

      for(int type = 1; type <= 3; ++type) {
         Integer count = (Integer)dao.gameRoundResult.get(type);
         count = count == null ? 0 : count;
         builder.addPickUpObjectTypeCount(count);
      }

      this.player.sendMsg(builder.build());
   }

   @MsgHandlerAnno
   public boolean C2S_PickUpShoot_20511(ActivityZongQingMsg.C2S_PickUpShoot_20511 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         ActivityZongQingDao dao = this.getDao();
         if (dao.gameStartTime <= 0) {
            return false;
         } else {
            int gameTime = this.configManager.getIntDefault(this.ZONG_QING_GAME_TIME, 30);
            int nowTime = DateUtil.getIntTime(System.currentTimeMillis());
            if (nowTime >= dao.gameStartTime + gameTime + this.GMAE_OFFSET_SECONDS) {
               this.pickUpGameEnd();
               return false;
            } else {
               int shootId = msg.getShootId();
               if (!dao.gameObjectUniqueIds.containsKey(shootId)) {
                  return false;
               } else {
                  Integer lineAndType = (Integer)dao.gameObjectUniqueIds.get(shootId);
                  int shootType = MiscUtil.getIntLowParam(lineAndType);
                  ZongQingGameDropModel gameDropModel = (ZongQingGameDropModel)ApplicationContextProvider.getModelPoolEntity("ZongqingGameDrop", shootType);
                  if (null == gameDropModel) {
                     return false;
                  } else {
                     Integer shootCount = (Integer)dao.gameRoundResult.get(shootType);
                     if (null == shootCount) {
                        shootCount = 0;
                     }

                     dao.gameRoundResult.put(shootType, shootCount + 1);
                     int oldCurPoint = dao.curPoint;
                     dao.curPoint += gameDropModel.getPoint();
                     if (dao.curPoint < 0) {
                        dao.curPoint = 0;
                     }

                     dao.point += dao.curPoint - oldCurPoint;
                     dao.gameObjectUniqueIds.remove(shootId);
                     dao.updateOp();
                     this.sendPickUpRoundInfo();
                     return true;
                  }
               }
            }
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_PickUpGameControl_20526(ActivityZongQingMsg.C2S_PickUpGameControl_20526 msg, String source) {
      boolean ret = true;
      int switchOn = msg.getSwitchOn();
      switch (switchOn) {
         case 0:
            ret = this.pickUpGameEnd();
            break;
         case 1:
            ret = this.pickUpGameStart();
      }

      return ret;
   }

   public boolean pickUpGameStart() {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
         if (!crossNettyClient.isLogin()) {
            return this.player.failure(76022);
         } else {
            ActivityZongQingDao dao = this.getDao();
            if (dao.gameStartTime > 0) {
               return this.player.failure(76077);
            } else {
               ResourceModel resourceModel = new ResourceModel();
               resourceModel.setType(2);
               resourceModel.setId(1266);
               resourceModel.setValue(1);
               if (!this.player.checkResourceNum(resourceModel)) {
                  return this.player.failure(76076);
               } else {
                  this.player.delResource(resourceModel, this.getActivityLogModule(), 10109, 0, 0, "");
                  ArrayList<Integer> zongQingTicketNum = this.configManager.getIntList("zongqingGameEveryDrop");
                  if (zongQingTicketNum.size() >= 2 && (Integer)zongQingTicketNum.get(0) <= (Integer)zongQingTicketNum.get(1)) {
                     int gameLineLimit = this.configManager.getIntDefault(this.ZONG_QING_GAME_LINE_LIMIT, 50);
                     dao.gameObjectUniqueIds.clear();
                     Short curLine = Short.valueOf((short)0);
                     Integer lineObjNum = 0;
                     Integer lineObjIndex = 0;
                     Map<Integer, Map<Integer, Integer>> typeCountMap = new HashMap();
                     int i = 0;

                     while(true) {
                        label97: {
                           if (i < 1000) {
                              if (0 == lineObjNum) {
                                 curLine = (short)(curLine + 1);
                                 lineObjNum = RandomUtil.randInt((Integer)zongQingTicketNum.get(0), (Integer)zongQingTicketNum.get(1) + 1);
                              }

                              Integer id = 0;

                              do {
                                 id = RandomUtil.randInt(0, 32767);
                              } while(dao.gameObjectUniqueIds.containsKey(id));

                              int randomType = this.randomGameObjectType();
                              if (randomType <= 0) {
                                 break label97;
                              }

                              Map<Integer, Integer> countMap = (Map)typeCountMap.get(randomType);
                              if (null == countMap) {
                                 countMap = new HashMap();
                                 typeCountMap.put(randomType, countMap);
                              }

                              int stage = this.getStageByCurLine(curLine, randomType);
                              if (stage < 0) {
                                 return false;
                              }

                              Integer count = (Integer)countMap.get(stage);
                              count = null == count ? 0 : count;
                              ZongQingGameDropModel gameDropModel = (ZongQingGameDropModel)ApplicationContextProvider.getModelPoolEntity("ZongqingGameDrop", randomType);
                              if (null != gameDropModel && !gameDropModel.getStageDropLimit().isEmpty()) {
                                 if (stage < gameDropModel.getStageDropLimit().size() && count >= (Integer)gameDropModel.getStageDropLimit().get(stage)) {
                                    break label97;
                                 }

                                 countMap.put(stage, count + 1);
                              }

                              Integer lineAndType = MiscUtil.comboShort(curLine, MiscUtil.getIntLowParam(randomType));
                              dao.gameObjectUniqueIds.put(id, lineAndType);
                              lineObjIndex = lineObjIndex + 1;
                              if (lineObjIndex < lineObjNum) {
                                 break label97;
                              }

                              lineObjNum = 0;
                              lineObjIndex = 0;
                              if (curLine < gameLineLimit) {
                                 break label97;
                              }
                           }

                           dao.gameStartTime = DateUtil.getIntTime(System.currentTimeMillis());
                           dao.updateOp();
                           this.sendPickUpInfo();
                           return true;
                        }

                        ++i;
                     }
                  } else {
                     return false;
                  }
               }
            }
         }
      }
   }

   public int getStageByCurLine(int curLine, int randomType) {
      ZongQingGameDropModel gameDropModel = (ZongQingGameDropModel)ApplicationContextProvider.getModelPoolEntity("ZongqingGameDrop", randomType);
      if (null == gameDropModel) {
         return -1;
      } else {
         List<Integer> stageLine = gameDropModel.getStageLine();
         int totalLine = 0;
         int stage = stageLine.size() - 1;

         for(int i = 0; i < stageLine.size(); ++i) {
            totalLine += (Integer)stageLine.get(i);
            if (curLine <= totalLine) {
               stage = i;
               break;
            }
         }

         return stage;
      }
   }

   public Integer randomGameObjectType() {
      Map<Integer, ZongQingGameDropModel> dropModelMap = ApplicationContextProvider.<Integer, ZongQingGameDropModel>getModelPoolMap("ZongqingGameDrop");
      int totalWeight = 0;

      for(Map.Entry<Integer, ZongQingGameDropModel> entry : dropModelMap.entrySet()) {
         totalWeight += ((ZongQingGameDropModel)entry.getValue()).getWeight();
      }

      int random = cn.hutool.core.util.RandomUtil.randomInt(totalWeight);
      int tempLoop = 0;

      for(Map.Entry<Integer, ZongQingGameDropModel> entry : dropModelMap.entrySet()) {
         tempLoop += ((ZongQingGameDropModel)entry.getValue()).getWeight();
         if (tempLoop > random) {
            return ((ZongQingGameDropModel)entry.getValue()).getType();
         }
      }

      return 0;
   }

   public boolean pickUpGameEnd() {
      ActivityZongQingDao dao = this.getDao();
      if (dao.gameStartTime <= 0) {
         return false;
      } else {
         Map<Integer, ZongQingGamePointAwardModel> rewardMap = this.player.getGameModelPool().getMap("ZongqingGamePointAward");
         if (null == rewardMap) {
            return false;
         } else {
            for(Map.Entry<Integer, ZongQingGamePointAwardModel> entry : rewardMap.entrySet()) {
               ZongQingGamePointAwardModel model = (ZongQingGamePointAwardModel)entry.getValue();
               if (dao.curPoint >= model.getPointStart() && dao.curPoint <= model.getPointEnd()) {
                  this.sendPickUpRoundInfo();
                  this.player.addResource(model.getRewards(), PlayerMsg.ShowType.SHOW_ZONG_QING_PICK_UP, this.getActivityLogModule(), 10107, 0, 0, "");
                  break;
               }
            }

            dao.gameObjectUniqueIds.clear();
            dao.gameRoundResult.clear();
            dao.gameStartTime = 0;
            dao.curPoint = 0;
            dao.updateOp();
            this.sendPickUpInfo();
            RankPart rankPart = (RankPart)this.player.getMgrPart(RankPart.class);
            rankPart.updateRank(RankDefine.RankModule.ACTIVITY_ZONG_QING_PICK, (long)dao.point, false);
            return true;
         }
      }
   }

   @MsgHandlerAnno
   public boolean C2S_BuyTicket_20525(ActivityZongQingMsg.C2S_BuyTicket_20525 msg, String source) {
      if (this.isServerActivityInvalid()) {
         return this.player.failure(8007);
      } else {
         int ticketBuyCost = this.getTicketBuyCost();
         if (this.getSurplusBuyTimes() > 0 && ticketBuyCost != this.CAN_NOT_BUY_TICKET) {
            if (!this.player.checkResourceNum(1, PlayerDefine.PLAYER_GOLD, ticketBuyCost)) {
               return this.player.failure(31);
            } else {
               this.player.addResource(2, 1266, 1, PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 10111, 0, 0, "");
               this.player.delResource(1, PlayerDefine.PLAYER_GOLD, (long)ticketBuyCost, this.getActivityLogModule(), 10112, 0, 0, "");
               ActivityZongQingDao dao = this.getDao();
               ++dao.ticketBuyTimes;
               dao.updateOp();
               this.sendPickUpInfo();
               return true;
            }
         } else {
            return this.player.failure(61164);
         }
      }
   }

   public int getSurplusBuyTimes() {
      ActivityZongQingDao dao = this.getDao();
      int ticketBuyTimes = dao.ticketBuyTimes;
      String zongQingTicketBuyStr = this.configManager.getStrByDefault(this.ZONG_QING_GAME_BUY, "50|100|150|200");
      String[] zongQingTicketBuyStrArr = zongQingTicketBuyStr.split("\\|");
      return zongQingTicketBuyStrArr.length - ticketBuyTimes > 0 ? zongQingTicketBuyStrArr.length - ticketBuyTimes : 0;
   }

   public int getTicketBuyCost() {
      ActivityZongQingDao dao = this.getDao();
      String zongQingTicketBuyStr = this.configManager.getStrByDefault(this.ZONG_QING_GAME_BUY, "50|100|150|200");
      String[] zongQingTicketBuyStrArr = zongQingTicketBuyStr.split("\\|");
      int ticketBuyTimes = dao.ticketBuyTimes;
      if (ticketBuyTimes >= zongQingTicketBuyStrArr.length) {
         return this.CAN_NOT_BUY_TICKET;
      } else {
         int buyCost = Integer.parseInt(zongQingTicketBuyStrArr[ticketBuyTimes]);
         return buyCost;
      }
   }

   public void pickUpResetDaily() {
      ActivityZongQingDao dao = this.getDao();
      int severActivityDay = this.getSeverActivityDay();
      if (!dao.giveTicketDays.contains(severActivityDay)) {
         int zongQingTicketNum = this.configManager.getIntDefault(this.ZONG_QING_TICKET_NUM, 7);
         this.player.addResource(2, 1266, zongQingTicketNum, PlayerMsg.ShowType.SHOW_TYPE_NOT_SHOW, this.getActivityLogModule(), 10108, 0, 0, "");
         dao.ticketBuyTimes = 0;
         dao.giveTicketDays.add(severActivityDay);
         dao.updateOp();
      }
   }

   public void pickUpEnd() {
      this.pickUpGameEnd();
      ActivityZongQingDao dao = this.getDao();
      dao.point = 0;
      dao.curPoint = 0;
      dao.gameObjectUniqueIds.clear();
      dao.gameRoundResult.clear();
      dao.gameStartTime = 0;
      dao.ticketBuyTimes = 0;
      dao.giveTicketDays.clear();
      dao.updateOp();
      this.player.delResourceAllNum(2, 1266, this.getActivityLogModule(), 10113, 0, 0, "");
   }

   public void drawEnd() {
      ActivityZongQingDao dao = this.getDao();
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
      ActivityZongQingDao dao = this.getDao();
      int lotteryStage = this.getSmashEggStage();
      if (lotteryStage != dao.lotteryStage) {
         dao.lotteryStage = lotteryStage;
         dao.fancyRewardId = 0;
      }

      dao.updateOp();
   }

   @MsgHandlerAnno
   public void C2S_FancyReward_20513(ActivityZongQingMsg.C2S_FancyReward_20513 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         ActivityZongQingDao dao = this.getDao();
         ZongQingLotteryItemModel zongQingLotteryItemModel = (ZongQingLotteryItemModel)this.player.getGameModelPool().getEntity("ZongqingLotteryItem", msg.getTargetId());
         if (zongQingLotteryItemModel != null) {
            if (zongQingLotteryItemModel.getItemGroup() != 1) {
               this.player.failure(0);
               this.logger.error("玩家={}，设置心仪奖励类型错误，物品ID={}，group={}", new Object[]{this.player.getPlayerId(), zongQingLotteryItemModel.getId(), zongQingLotteryItemModel.getItemGroup()});
            } else if (dao.lotteryStage != zongQingLotteryItemModel.getStage()) {
               this.player.failure(0);
               this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，当前阶段={}", new Object[]{this.player.getPlayerId(), zongQingLotteryItemModel.getId(), zongQingLotteryItemModel.getStage()});
            } else {
               int openDay = this.getActivityOpenDay();
               if (zongQingLotteryItemModel.getDateEnd() == -1) {
                  if (zongQingLotteryItemModel.getDateStart() > openDay) {
                     this.player.failure(0);
                     this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前date={}", new Object[]{this.player.getPlayerId(), zongQingLotteryItemModel.getId(), openDay});
                     return;
                  }
               } else if (openDay < zongQingLotteryItemModel.getDateStart() || openDay > zongQingLotteryItemModel.getDateEnd()) {
                  this.player.failure(0);
                  this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前date={}", new Object[]{this.player.getPlayerId(), zongQingLotteryItemModel.getId(), openDay});
                  return;
               }

               int activityDay = this.getSeverActivityDay();
               if (activityDay >= zongQingLotteryItemModel.getStageStart() && activityDay <= zongQingLotteryItemModel.getStageEnd()) {
                  if (zongQingLotteryItemModel.getSurplusNum() > 0) {
                     int selectNum = (Integer)MapUtil.getOrDefault(dao.seniorRewards, zongQingLotteryItemModel.getId(), 0);
                     if (selectNum >= zongQingLotteryItemModel.getSurplusNum()) {
                        this.logger.error("心仪奖励已经达到最大次数，已经获取={}，最大次数={}", dao.seniorRewards.get(zongQingLotteryItemModel.getId()), zongQingLotteryItemModel.getSurplusNum());
                        return;
                     }
                  }

                  dao.fancyRewardId = msg.getTargetId();
                  dao.updateOp();
                  ActivityZongQingMsg.S2C_FancyReward_20514.Builder builder = ActivityZongQingMsg.S2C_FancyReward_20514.newBuilder();
                  builder.setResult(1);
                  builder.setTargetId(msg.getTargetId());
                  this.player.sendMsg(builder.build());
               } else {
                  this.player.failure(0);
                  this.logger.error("玩家={}，设置心仪奖励错误，物品ID={}，服务器当前activityDay={}", new Object[]{this.player.getPlayerId(), zongQingLotteryItemModel.getId(), activityDay});
               }
            }
         }
      }
   }

   public int getSmashEggStage() {
      Map<Integer, ZongQingLotteryItemModel> allMap = this.player.getGameModelPool().getMap("ZongqingLotteryItem");
      if (allMap != null && allMap.size() > 0) {
         int activityStartDay = this.getActivityOpenDay();
         int severActivityDay = this.getSeverActivityDay();

         for(ZongQingLotteryItemModel model : allMap.values()) {
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
   public void C2S_Draw_20517(ActivityZongQingMsg.C2S_Draw_20517 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         ZongQingLotteryCostModel costModel = (ZongQingLotteryCostModel)ApplicationContextProvider.getModelPoolEntity("ZongqingLotteryCost", msg.getType());
         if (costModel == null) {
            this.player.failure(0);
         } else {
            int lotteryNum = costModel.getExtractNum();
            PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
            int lotteryLimit = this.configManager.getIntDefault("LotteryLimit", 99999);
            int recruitNum = (Integer)playerResetCustomCache.getDailyNum(42, 0);
            if (recruitNum + lotteryNum > lotteryLimit) {
               this.player.failure(51);
            } else {
               ActivityZongQingDao dao = this.getDao();
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
                     Map<Integer, ZongQingLotteryItemModel> itemModelMap = this.getLotteryItemMap(openDay, activityDay);
                     if (itemModelMap != null && !itemModelMap.isEmpty()) {
                        ZongQingLotteryItemModel enjoyModel = (ZongQingLotteryItemModel)this.player.getGameModelPool().getEntity("ZongqingLotteryItem", dao.fancyRewardId);
                        List<ResourceModel> addList = new ArrayList();
                        boolean isHaveFancy = false;
                        List<ResourceModel> resourceModels = new ArrayList();

                        for(int i = 0; i < lotteryNum; ++i) {
                           int oldSmashNum_1 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0);
                           dao.roundSmashNum.put(1, oldSmashNum_1 + 1);
                           int oldSmashNum_2 = (Integer)MapUtil.getOrDefault(dao.roundSmashNum, 2, 0);
                           dao.roundSmashNum.put(2, oldSmashNum_2 + 1);
                           ZongQingLotteryItemModel itemModel = this.smashEgg(dao, itemModelMap);
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
                           ActivityZongQingDao.RecordInfo recordInfo = new ActivityZongQingDao.RecordInfo(createTime, resourceModel);
                           dao.addRecordInfo(recordInfo);
                        }

                        dao.updateOp();
                        this.player.delResource((List)needModelList, this.getActivityLogModule(), 10105, 0, 0, "");
                        this.player.addResource(addList, PlayerMsg.ShowType.SHOW_ZONG_QING_DRAW_ACTIVITY, this.getActivityLogModule(), 10104, 0, 0, "");
                        playerResetCustomCache.addDailyReset(42, lotteryNum);
                        ActivityZongQingMsg.S2C_Draw_20518.Builder builder = ActivityZongQingMsg.S2C_Draw_20518.newBuilder();
                        builder.setIsHaveFancy(isHaveFancy);
                        builder.setTargetId(dao.fancyRewardId);

                        for(Map.Entry<Integer, Integer> entry : dao.seniorRewards.entrySet()) {
                           CommonMsg.MapDataII.Builder info = CommonMsg.MapDataII.newBuilder();
                           info.setKey((Integer)entry.getKey());
                           info.setValue((Integer)entry.getValue());
                           builder.addSeniorNum(info);
                        }

                        builder.setDrawTimes(dao.drawTime);
                        int dailyDrawNum = (Integer)playerResetCustomCache.getDailyNum(42, 0);
                        builder.setRecruitNum(dailyDrawNum);
                        builder.setFancyGroupDrawTimes((Integer)MapUtil.getOrDefault(dao.roundSmashNum, 1, 0));
                        this.player.sendMsg(builder.build());
                        int enjoyId = enjoyModel != null && enjoyModel.getRewards().size() > 0 ? ((ResourceModel)enjoyModel.getRewards().get(0)).getId() : 0;

                        for(ResourceModel resourceModel : addList) {
                           String[] strings = LogOperationMgr.toRewardsInfo(resourceModel);
                           this.player.getOperationMgr().addExtraLog(this.player, 198, "粽情九州-抽奖", ((ResourceModel)needModelList.get(0)).getId() + "", ((ResourceModel)needModelList.get(0)).getValue() + "", strings[0], strings[2], strings[1], strings[0].equals(String.valueOf(enjoyId)) ? "1" : "0");
                        }

                     }
                  }
               }
            }
         }
      }
   }

   public Map<Integer, ZongQingLotteryItemModel> getLotteryItemMap(int openDay, int activityDay) {
      Map<Integer, ZongQingLotteryItemModel> itemModelMap = this.player.getGameModelPool().getMap("ZongqingLotteryItem");
      if (itemModelMap == null) {
         return null;
      } else {
         Map<Integer, ZongQingLotteryItemModel> resultMap = new HashMap();

         for(Map.Entry<Integer, ZongQingLotteryItemModel> entry : itemModelMap.entrySet()) {
            if (((ZongQingLotteryItemModel)entry.getValue()).getDateEnd() == -1) {
               if (openDay < ((ZongQingLotteryItemModel)entry.getValue()).getDateStart()) {
                  continue;
               }
            } else if (openDay < ((ZongQingLotteryItemModel)entry.getValue()).getDateStart() || openDay > ((ZongQingLotteryItemModel)entry.getValue()).getDateEnd()) {
               continue;
            }

            if (activityDay >= ((ZongQingLotteryItemModel)entry.getValue()).getStageStart() && activityDay <= ((ZongQingLotteryItemModel)entry.getValue()).getStageEnd()) {
               resultMap.put(entry.getKey(), entry.getValue());
            }
         }

         return resultMap;
      }
   }

   private ZongQingLotteryItemModel smashEgg(ActivityZongQingDao dao, Map<Integer, ZongQingLotteryItemModel> itemModelMap) {
      Map<Integer, ZongQingLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(ZongQingLotteryItemModel lotteryItemModel : itemModelMap.values()) {
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

         for(ZongQingLotteryItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }

   @MsgHandlerAnno
   public void C2S_LuckDrawInfo_20515(ActivityZongQingMsg.C2S_LuckDrawInfo_20515 msg, String source) {
      this.sendDrawInfo();
   }

   public void sendDrawInfo() {
      ActivityZongQingDao dao = this.getDao();
      ActivityZongQingMsg.S2C_LuckDrawInfo_20516.Builder builder = ActivityZongQingMsg.S2C_LuckDrawInfo_20516.newBuilder();
      builder.setDrawTimes(dao.drawTime);
      builder.addAllHadRewardId(dao.hadRewards);
      builder.setStagEndTime(this.getDrawStageEndTime());
      PlayerResetCustomCache playerResetCustomCache = (PlayerResetCustomCache)this.player.getCustomCache("tb_player_reset", this.player.getPlayerId());
      int recruitNum = (Integer)playerResetCustomCache.getDailyNum(42, 0);
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

   public List<ZongQingLotteryItemModel> getDrawJackpot() {
      List<ZongQingLotteryItemModel> jackpotModels = new ArrayList();
      int activityStartDay = this.getActivityOpenDay();
      Map<Integer, Map<Integer, ZongQingLotteryItemModel>> zongQingLotteryItemModel = ApplicationContextProvider.<Integer, Map<Integer, ZongQingLotteryItemModel>>getModelPoolMap("CustomZongqingLotteryItem");
      TreeMap<Integer, Map<Integer, ZongQingLotteryItemModel>> treeMap = new TreeMap(zongQingLotteryItemModel);
      int dateStartKey = (Integer)treeMap.floorKey(activityStartDay);
      Map<Integer, ZongQingLotteryItemModel> modelMap = (Map)zongQingLotteryItemModel.get(dateStartKey);
      int severActivityDay = this.getSeverActivityDay();

      for(ZongQingLotteryItemModel model : modelMap.values()) {
         if (severActivityDay >= model.getStageStart() && severActivityDay <= model.getStageEnd()) {
            jackpotModels.add(model);
         }
      }

      return jackpotModels;
   }

   public long getDrawStageEndTime() {
      List<ZongQingLotteryItemModel> jackpotModels = this.getDrawJackpot();
      if (jackpotModels.size() == 0) {
         this.logger.info("粽情九州活动 - 轮盘抽奖奖池数据为空");
         return 0L;
      } else {
         ZongQingLotteryItemModel model = (ZongQingLotteryItemModel)jackpotModels.get(0);
         ActivityInfo activityInfo = this.getActivityMgr().getActivityInfo(this.getActivityType());
         long endTimeStamp = (long)activityInfo.start * 1000L + (long)model.getStageEnd() * 86400000L;
         return endTimeStamp;
      }
   }

   private void recordServer(ZongQingLotteryItemModel model) {
      if (model.getIsRecord() > 0 && model.getBelovedItemID() > 0) {
         CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
         CrossMsg.S2CR_UploadZongQingRecord_4225.Builder builder = CrossMsg.S2CR_UploadZongQingRecord_4225.newBuilder();
         builder.setPlayerName(this.player.getPlayerDao().playerName);
         builder.setBelovedItemId(model.getBelovedItemID());
         crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), builder.build());
      }

   }

   @MsgHandlerAnno
   public void C2S_OpenReward_20519(ActivityZongQingMsg.C2S_OpenReward_20519 msg, String source) {
      if (!this.isServerActivityInvalid()) {
         int id = msg.getId();
         ZongQingAddUpReturnModel awardModel = (ZongQingAddUpReturnModel)ApplicationContextProvider.getModelPoolEntity("ZongqingAddupReturnAward", id);
         if (awardModel != null) {
            int activityStartDay = this.getActivityOpenDay();
            int dateEnd = awardModel.getDateEnd() > 0 ? awardModel.getDateEnd() : Integer.MAX_VALUE;
            if (activityStartDay >= awardModel.getDateStart() && activityStartDay <= dateEnd) {
               ActivityZongQingDao dao = this.getDao();
               if (dao.hadRewards.contains(id)) {
                  this.logger.info("粽情九州活动 - 奖励已领取 playerId:{}, id:{}", this.player.getPlayerId(), id);
               } else if (awardModel.getAddupNum() > dao.drawTime) {
                  this.logger.info("粽情九州活动 - 抽奖累计次数未达到 以抽奖次数:{},需要次数:{}", dao.drawTime, awardModel.getAddupNum());
               } else {
                  dao.hadRewards.add(id);
                  dao.updateOp();
                  this.player.addResource(awardModel.getRewards(), PlayerMsg.ShowType.SHOW_TYPE_COMMON, this.getActivityLogModule(), 10106, 0, 0, "");
                  ActivityZongQingMsg.S2C_OpenReward_20520.Builder builder = ActivityZongQingMsg.S2C_OpenReward_20520.newBuilder();
                  builder.setId(id);
                  this.player.sendMsg(builder.build());
               }
            } else {
               this.logger.info("粽情九州活动 - 领取的奖励不是本期的 开服天数:{}，id:{}", activityStartDay, id);
            }
         }
      }
   }

   @MsgHandlerAnno
   public void C2S_DrawRecord_20521(ActivityZongQingMsg.C2S_DrawRecord_20521 msg, String source) {
      ActivityZongQingMsg.S2C_DrawRecord_20522.Builder builder = ActivityZongQingMsg.S2C_DrawRecord_20522.newBuilder();
      ActivityZongQingDao dao = this.getDao();

      for(String record : dao.recordList) {
         String[] arr = record.split(":");
         ActivityZongQingMsg.MyDrawRecord.Builder drawRecord = ActivityZongQingMsg.MyDrawRecord.newBuilder();
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
   public void C2S_ServerDrawRecord_20523(ActivityZongQingMsg.C2S_ServerDrawRecord_20523 msg, String source) {
      CrossNettyClient crossNettyClient = (CrossNettyClient)ApplicationContextProvider.getContext().getBean(CrossNettyClient.class);
      crossNettyClient.sendCross(this.player.getServerId(), this.player.getPlayerId(), msg);
   }

   public boolean drawView(int lotteryId, int round) {
      ZongQingLotteryItemModel model = (ZongQingLotteryItemModel)this.player.getGameModelPool().getEntity("ZongqingLotteryItem", lotteryId);
      if (null == model) {
         return this.player.failure(0);
      } else if (model.getItemGroup() != 1) {
         return this.player.failure(8024);
      } else {
         DrawViewData drawViewData = new DrawViewData();
         drawViewData.fancyRewardId = model.getId();
         int initRound = 0;
         Map<Integer, ZongQingLotteryItemModel> lotteryItemMap = this.getLotteryItemMap(model.getDateStart(), model.getStageStart());
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
               ZongQingLotteryItemModel lotteryItemModel = this.gmSmashEgg(drawViewData, lotteryItemMap);
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

   private ZongQingLotteryItemModel gmSmashEgg(DrawViewData drawViewData, Map<Integer, ZongQingLotteryItemModel> itemModelMap) {
      Map<Integer, ZongQingLotteryItemModel> tempMap = new HashMap();
      int totalOdds = 0;

      for(ZongQingLotteryItemModel lotteryItemModel : itemModelMap.values()) {
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

         for(ZongQingLotteryItemModel lotteryItemModel : tempMap.values()) {
            loop += lotteryItemModel.getRealOdd();
            if (loop > r) {
               return lotteryItemModel;
            }
         }

         return null;
      }
   }
}
